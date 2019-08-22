package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class inference_worker_join extends SubLTranslatedFile {
    public static final SubLFile me = new inference_worker_join();

    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_join";

    public static final String myFingerPrint = "ee705e0de1f70499905065f678070bdeb8d30ba466df94af23aea7f4064116db";

    // defconstant
    public static final SubLSymbol $dtp_join_link_data$ = makeSymbol("*DTP-JOIN-LINK-DATA*");

    // defparameter
    private static final SubLSymbol $join_module$ = makeSymbol("*JOIN-MODULE*");

    // defparameter
    private static final SubLSymbol $join_productivity_scaling_factor$ = makeSymbol("*JOIN-PRODUCTIVITY-SCALING-FACTOR*");

    // Internal Constants
    public static final SubLSymbol JOIN_LINK_DATA = makeSymbol("JOIN-LINK-DATA");

    public static final SubLSymbol JOIN_LINK_DATA_P = makeSymbol("JOIN-LINK-DATA-P");

    public static final SubLList $list2 = list(makeSymbol("JOIN-VARS"), makeSymbol("FIRST-PROOF-INDEX"), makeSymbol("SECOND-PROOF-INDEX"));

    public static final SubLList $list3 = list(makeKeyword("JOIN-VARS"), makeKeyword("FIRST-PROOF-INDEX"), makeKeyword("SECOND-PROOF-INDEX"));

    public static final SubLList $list4 = list(makeSymbol("J-LINK-DATA-JOIN-VARS"), makeSymbol("J-LINK-DATA-FIRST-PROOF-INDEX"), makeSymbol("J-LINK-DATA-SECOND-PROOF-INDEX"));

    public static final SubLList $list5 = list(makeSymbol("_CSETF-J-LINK-DATA-JOIN-VARS"), makeSymbol("_CSETF-J-LINK-DATA-FIRST-PROOF-INDEX"), makeSymbol("_CSETF-J-LINK-DATA-SECOND-PROOF-INDEX"));



    public static final SubLSymbol JOIN_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("JOIN-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("JOIN-LINK-DATA-P"));

    private static final SubLSymbol J_LINK_DATA_JOIN_VARS = makeSymbol("J-LINK-DATA-JOIN-VARS");

    private static final SubLSymbol _CSETF_J_LINK_DATA_JOIN_VARS = makeSymbol("_CSETF-J-LINK-DATA-JOIN-VARS");

    private static final SubLSymbol J_LINK_DATA_FIRST_PROOF_INDEX = makeSymbol("J-LINK-DATA-FIRST-PROOF-INDEX");

    private static final SubLSymbol _CSETF_J_LINK_DATA_FIRST_PROOF_INDEX = makeSymbol("_CSETF-J-LINK-DATA-FIRST-PROOF-INDEX");

    private static final SubLSymbol J_LINK_DATA_SECOND_PROOF_INDEX = makeSymbol("J-LINK-DATA-SECOND-PROOF-INDEX");

    private static final SubLSymbol _CSETF_J_LINK_DATA_SECOND_PROOF_INDEX = makeSymbol("_CSETF-J-LINK-DATA-SECOND-PROOF-INDEX");



    private static final SubLSymbol $FIRST_PROOF_INDEX = makeKeyword("FIRST-PROOF-INDEX");

    private static final SubLSymbol $SECOND_PROOF_INDEX = makeKeyword("SECOND-PROOF-INDEX");

    private static final SubLString $str18$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_JOIN_LINK_DATA = makeSymbol("MAKE-JOIN-LINK-DATA");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_JOIN_LINK_DATA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-JOIN-LINK-DATA-METHOD");







    private static final SubLList $list27 = list(list(makeSymbol("BINDINGS-VAR"), makeSymbol("PROOF-VAR"), makeSymbol("JOIN-LINK")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym28$INDEX = makeUninternedSymbol("INDEX");

    public static final SubLSymbol $sym29$PROOF_LIST_VAR = makeUninternedSymbol("PROOF-LIST-VAR");



    private static final SubLSymbol JOIN_LINK_FIRST_PROOF_INDEX = makeSymbol("JOIN-LINK-FIRST-PROOF-INDEX");





    private static final SubLSymbol $sym34$INDEX = makeUninternedSymbol("INDEX");

    private static final SubLSymbol $sym35$PROOF_LIST_VAR = makeUninternedSymbol("PROOF-LIST-VAR");

    private static final SubLSymbol JOIN_LINK_SECOND_PROOF_INDEX = makeSymbol("JOIN-LINK-SECOND-PROOF-INDEX");

    private static final SubLSymbol DO_JOIN_LINK_FIRST_PROOFS = makeSymbol("DO-JOIN-LINK-FIRST-PROOFS");

    private static final SubLSymbol DO_JOIN_LINK_SECOND_PROOFS = makeSymbol("DO-JOIN-LINK-SECOND-PROOFS");

    private static final SubLString $str39$couldn_t_find_the_join_tactic_for = makeString("couldn't find the join tactic for ~s");

    private static final SubLSymbol JOIN_LINK_P = makeSymbol("JOIN-LINK-P");



    private static final SubLString $str42$_a_was_a_rejected_proof = makeString("~a was a rejected proof");

    private static final SubLSymbol $sym43$HL_VAR_ = makeSymbol("HL-VAR?");

    private static final SubLSymbol VARIABLE_BINDING_VALUE = makeSymbol("VARIABLE-BINDING-VALUE");







    private static final SubLSymbol SUBCLAUSE_SPEC_P = makeSymbol("SUBCLAUSE-SPEC-P");

    private static final SubLSymbol JOIN_TACTIC_P = makeSymbol("JOIN-TACTIC-P");

    private static final SubLSymbol STRATEGY_P = makeSymbol("STRATEGY-P");





    private static final SubLSymbol STRATEGIC_CONTEXT_P = makeSymbol("STRATEGIC-CONTEXT-P");



    private static final SubLString $str55$TVA_POS = makeString("TVA-POS");



    private static final SubLString $str57$DOUBLE_TVA_POS = makeString("DOUBLE TVA-POS");

    private static final SubLString $str58$first_problem__ = makeString("first problem: ");

    private static final SubLString $str59$second_problem__ = makeString("second problem: ");

    private static final SubLString $str60$Join_tactics_like__a_must_only_ap = makeString("Join tactics like ~a must only apply to singleton problem queries, but ~s was not a singleton");

    private static final SubLSymbol $sym61$PROOF_PROVEN_ = makeSymbol("PROOF-PROVEN?");

    public static SubLObject join_link_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject join_link_data_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$join_link_data_native.class ? T : NIL;
    }

    public static SubLObject j_link_data_join_vars(final SubLObject v_object) {
        assert NIL != join_link_data_p(v_object) : "inference_worker_join.join_link_data_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject j_link_data_first_proof_index(final SubLObject v_object) {
        assert NIL != join_link_data_p(v_object) : "inference_worker_join.join_link_data_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject j_link_data_second_proof_index(final SubLObject v_object) {
        assert NIL != join_link_data_p(v_object) : "inference_worker_join.join_link_data_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_j_link_data_join_vars(final SubLObject v_object, final SubLObject value) {
        assert NIL != join_link_data_p(v_object) : "inference_worker_join.join_link_data_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_j_link_data_first_proof_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != join_link_data_p(v_object) : "inference_worker_join.join_link_data_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_j_link_data_second_proof_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != join_link_data_p(v_object) : "inference_worker_join.join_link_data_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_join_link_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $join_link_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($JOIN_VARS)) {
                _csetf_j_link_data_join_vars(v_new, current_value);
            } else
                if (pcase_var.eql($FIRST_PROOF_INDEX)) {
                    _csetf_j_link_data_first_proof_index(v_new, current_value);
                } else
                    if (pcase_var.eql($SECOND_PROOF_INDEX)) {
                        _csetf_j_link_data_second_proof_index(v_new, current_value);
                    } else {
                        Errors.error($str18$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_join_link_data(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_JOIN_LINK_DATA, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $JOIN_VARS, j_link_data_join_vars(obj));
        funcall(visitor_fn, obj, $SLOT, $FIRST_PROOF_INDEX, j_link_data_first_proof_index(obj));
        funcall(visitor_fn, obj, $SLOT, $SECOND_PROOF_INDEX, j_link_data_second_proof_index(obj));
        funcall(visitor_fn, obj, $END, MAKE_JOIN_LINK_DATA, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_join_link_data_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_join_link_data(obj, visitor_fn);
    }

    public static SubLObject valid_join_link_data_p(final SubLObject v_object) {
        return makeBoolean((NIL != join_link_data_p(v_object)) && (NIL != dictionary.dictionary_p(j_link_data_first_proof_index(v_object))));
    }

    public static SubLObject new_join_link_data(final SubLObject first_mapped_problem, final SubLObject second_mapped_problem) {
        final SubLObject data = make_join_link_data(UNPROVIDED);
        _csetf_j_link_data_join_vars(data, shared_sibling_vars(first_mapped_problem, second_mapped_problem));
        _csetf_j_link_data_first_proof_index(data, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        _csetf_j_link_data_second_proof_index(data, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        return data;
    }

    public static SubLObject join_link_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_problem_link.problem_link_p(v_object)) && ($JOIN == inference_datastructures_problem_link.problem_link_type(v_object)));
    }

    public static SubLObject maybe_new_join_link(final SubLObject supported_problem, final SubLObject first_supporting_mapped_problem, final SubLObject second_supporting_mapped_problem) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(supported_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject candidate_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            candidate_link = set_contents.do_set_contents_next(basis_object, state);
            if ((((NIL != set_contents.do_set_contents_element_validP(state, candidate_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(candidate_link, $JOIN))) && (NIL != inference_datastructures_problem_link.mapped_problem_equal(first_supporting_mapped_problem, join_link_first_mapped_problem(candidate_link)))) && (NIL != inference_datastructures_problem_link.mapped_problem_equal(second_supporting_mapped_problem, join_link_second_mapped_problem(candidate_link)))) {
                return candidate_link;
            }
        }
        return new_join_link(supported_problem, first_supporting_mapped_problem, second_supporting_mapped_problem);
    }

    public static SubLObject new_join_link(final SubLObject supported_problem, final SubLObject first_supporting_mapped_problem, final SubLObject second_supporting_mapped_problem) {
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(first_supporting_mapped_problem) : "inference_datastructures_problem_link.mapped_problem_p(first_supporting_mapped_problem) " + "CommonSymbols.NIL != inference_datastructures_problem_link.mapped_problem_p(first_supporting_mapped_problem) " + first_supporting_mapped_problem;
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(second_supporting_mapped_problem) : "inference_datastructures_problem_link.mapped_problem_p(second_supporting_mapped_problem) " + "CommonSymbols.NIL != inference_datastructures_problem_link.mapped_problem_p(second_supporting_mapped_problem) " + second_supporting_mapped_problem;
        final SubLObject link = inference_datastructures_problem_link.new_problem_link($JOIN, supported_problem);
        final SubLObject data = new_join_link_data(first_supporting_mapped_problem, second_supporting_mapped_problem);
        inference_datastructures_problem_link.set_problem_link_data(link, data);
        inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(second_supporting_mapped_problem, link);
        inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(first_supporting_mapped_problem, link);
        inference_worker.propagate_problem_link(link);
        return link;
    }

    public static SubLObject destroy_join_link(final SubLObject join_link) {
        final SubLObject tactic = join_link_tactic_int(join_link);
        if (NIL != inference_datastructures_tactic.valid_tactic_p(tactic)) {
            inference_datastructures_tactic.destroy_problem_tactic_and_backpointers(tactic);
        }
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(join_link);
        if (NIL != valid_join_link_data_p(data)) {
            _csetf_j_link_data_join_vars(data, $FREE);
            dictionary.clear_dictionary(j_link_data_first_proof_index(data));
            _csetf_j_link_data_first_proof_index(data, $FREE);
            dictionary.clear_dictionary(j_link_data_second_proof_index(data));
            _csetf_j_link_data_second_proof_index(data, $FREE);
        }
        return join_link;
    }

    public static SubLObject do_join_link_first_proofs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list27);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject bindings_var = NIL;
        SubLObject proof_var = NIL;
        SubLObject join_link = NIL;
        destructuring_bind_must_consp(current, datum, $list27);
        bindings_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list27);
        proof_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list27);
        join_link = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject index = $sym28$INDEX;
            final SubLObject proof_list_var = $sym29$PROOF_LIST_VAR;
            return list(CLET, list(list(index, list(JOIN_LINK_FIRST_PROOF_INDEX, join_link))), list(DO_DICTIONARY, list(bindings_var, proof_list_var, index), listS(DO_LIST, list(proof_var, proof_list_var), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list27);
        return NIL;
    }

    public static SubLObject do_join_link_second_proofs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list27);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject bindings_var = NIL;
        SubLObject proof_var = NIL;
        SubLObject join_link = NIL;
        destructuring_bind_must_consp(current, datum, $list27);
        bindings_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list27);
        proof_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list27);
        join_link = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject index = $sym34$INDEX;
            final SubLObject proof_list_var = $sym35$PROOF_LIST_VAR;
            return list(CLET, list(list(index, list(JOIN_LINK_SECOND_PROOF_INDEX, join_link))), list(DO_DICTIONARY, list(bindings_var, proof_list_var, index), listS(DO_LIST, list(proof_var, proof_list_var), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list27);
        return NIL;
    }

    public static SubLObject join_link_join_vars(final SubLObject join_link) {
        return j_link_data_join_vars(inference_datastructures_problem_link.problem_link_data(join_link));
    }

    public static SubLObject join_link_first_proof_index(final SubLObject join_link) {
        return j_link_data_first_proof_index(inference_datastructures_problem_link.problem_link_data(join_link));
    }

    public static SubLObject join_link_second_proof_index(final SubLObject join_link) {
        return j_link_data_second_proof_index(inference_datastructures_problem_link.problem_link_data(join_link));
    }

    public static SubLObject join_link_first_mapped_problem(final SubLObject join_link) {
        return inference_datastructures_problem_link.problem_link_supporting_mapped_problems(join_link).first();
    }

    public static SubLObject join_link_second_mapped_problem(final SubLObject join_link) {
        return second(inference_datastructures_problem_link.problem_link_supporting_mapped_problems(join_link));
    }

    public static SubLObject join_link_first_problem(final SubLObject join_link) {
        return inference_datastructures_problem_link.mapped_problem_problem(join_link_first_mapped_problem(join_link));
    }

    public static SubLObject join_link_second_problem(final SubLObject join_link) {
        return inference_datastructures_problem_link.mapped_problem_problem(join_link_second_mapped_problem(join_link));
    }

    public static SubLObject join_link_trigger_variable_map(final SubLObject join_link, final SubLObject trigger_is_firstP) {
        return inference_datastructures_problem_link.mapped_problem_variable_map(join_link_trigger_mapped_problem(join_link, trigger_is_firstP));
    }

    public static SubLObject join_link_trigger_mapped_problem(final SubLObject join_link, final SubLObject trigger_is_firstP) {
        return NIL != trigger_is_firstP ? join_link_first_mapped_problem(join_link) : join_link_second_mapped_problem(join_link);
    }

    public static SubLObject join_link_sibling_mapped_problem(final SubLObject join_link, final SubLObject trigger_is_firstP) {
        return NIL != trigger_is_firstP ? join_link_second_mapped_problem(join_link) : join_link_first_mapped_problem(join_link);
    }

    public static SubLObject join_link_first_proofs_lookup(final SubLObject join_link, final SubLObject proof_bindings) {
        final SubLObject index = join_link_first_proof_index(join_link);
        final SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(proof_bindings);
        final SubLObject first_proofs = dictionary.dictionary_lookup(index, canonical_proof_bindings, UNPROVIDED);
        return first_proofs;
    }

    public static SubLObject join_link_second_proofs_lookup(final SubLObject join_link, final SubLObject proof_bindings) {
        final SubLObject index = join_link_second_proof_index(join_link);
        final SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(proof_bindings);
        final SubLObject second_proofs = dictionary.dictionary_lookup(index, canonical_proof_bindings, UNPROVIDED);
        return second_proofs;
    }

    public static SubLObject join_link_sibling_proofs_lookup(final SubLObject join_link, final SubLObject trigger_proof_bindings_wrt_supported, final SubLObject trigger_is_firstP) {
        return NIL != trigger_is_firstP ? join_link_second_proofs_lookup(join_link, trigger_proof_bindings_wrt_supported) : join_link_first_proofs_lookup(join_link, trigger_proof_bindings_wrt_supported);
    }

    public static SubLObject join_link_shared_proof_bindings(final SubLObject join_link, final SubLObject trigger_proof_bindings, final SubLObject trigger_is_firstP) {
        final SubLObject shared_supported_vars = join_link_join_vars(join_link);
        final SubLObject trigger_to_supported_variable_map = join_link_trigger_variable_map(join_link, trigger_is_firstP);
        final SubLObject trigger_proof_bindings_wrt_supported = bindings.transfer_variable_map_to_bindings_filtered(trigger_to_supported_variable_map, trigger_proof_bindings);
        final SubLObject shared_trigger_proof_bindings_wrt_supported = bindings.filter_bindings_by_variables(trigger_proof_bindings_wrt_supported, shared_supported_vars);
        return shared_trigger_proof_bindings_wrt_supported;
    }

    public static SubLObject join_link_tactic(final SubLObject join_link) {
        final SubLObject join_tactic = join_link_tactic_int(join_link);
        if (NIL != join_tactic) {
            return join_tactic;
        }
        if (NIL == inference_datastructures_problem.tactically_unexamined_problem_p(inference_datastructures_problem_link.problem_link_supported_problem(join_link))) {
            return Errors.error($str39$couldn_t_find_the_join_tactic_for, join_link);
        }
        return NIL;
    }

    public static SubLObject join_link_tactic_int(final SubLObject join_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(join_link);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(supported_problem);
        SubLObject join_tactic = NIL;
        join_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match(join_tactic, $join_module$.getDynamicValue(thread))) && join_link.eql(join_tactic_link(join_tactic))) {
                return join_tactic;
            }
            cdolist_list_var = cdolist_list_var.rest();
            join_tactic = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject add_join_link_first_proof(final SubLObject join_link, final SubLObject v_bindings, final SubLObject proof) {
        assert NIL != join_link_p(join_link) : "inference_worker_join.join_link_p(join_link) " + "CommonSymbols.NIL != inference_worker_join.join_link_p(join_link) " + join_link;
        assert NIL != inference_datastructures_proof.proof_p(proof) : "inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) " + proof;
        final SubLObject index = join_link_first_proof_index(join_link);
        final SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
        dictionary_utilities.dictionary_push(index, canonical_bindings, proof);
        return join_link;
    }

    public static SubLObject remove_join_link_first_proof(final SubLObject join_link, final SubLObject v_bindings, final SubLObject proof) {
        assert NIL != join_link_p(join_link) : "inference_worker_join.join_link_p(join_link) " + "CommonSymbols.NIL != inference_worker_join.join_link_p(join_link) " + join_link;
        assert NIL != inference_datastructures_proof.proof_p(proof) : "inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) " + proof;
        final SubLObject index = join_link_first_proof_index(join_link);
        final SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
        dictionary_utilities.dictionary_delete_from_value(index, canonical_bindings, proof, UNPROVIDED, UNPROVIDED);
        return join_link;
    }

    public static SubLObject add_join_link_second_proof(final SubLObject join_link, final SubLObject v_bindings, final SubLObject proof) {
        assert NIL != join_link_p(join_link) : "inference_worker_join.join_link_p(join_link) " + "CommonSymbols.NIL != inference_worker_join.join_link_p(join_link) " + join_link;
        assert NIL != inference_datastructures_proof.proof_p(proof) : "inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) " + proof;
        final SubLObject index = join_link_second_proof_index(join_link);
        final SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
        dictionary_utilities.dictionary_push(index, canonical_bindings, proof);
        return join_link;
    }

    public static SubLObject remove_join_link_second_proof(final SubLObject join_link, final SubLObject v_bindings, final SubLObject proof) {
        assert NIL != join_link_p(join_link) : "inference_worker_join.join_link_p(join_link) " + "CommonSymbols.NIL != inference_worker_join.join_link_p(join_link) " + join_link;
        assert NIL != inference_datastructures_proof.proof_p(proof) : "inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) " + proof;
        final SubLObject index = join_link_second_proof_index(join_link);
        final SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
        dictionary_utilities.dictionary_delete_from_value(index, canonical_bindings, proof, UNPROVIDED, UNPROVIDED);
        return join_link;
    }

    public static SubLObject add_join_link_proof(final SubLObject join_link, final SubLObject trigger_proof, final SubLObject trigger_is_firstP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == inference_datastructures_proof.proof_provenP(trigger_proof))) {
            Errors.error($str42$_a_was_a_rejected_proof, trigger_proof);
        }
        final SubLObject shared_trigger_proof_bindings = join_link_shared_proof_bindings(join_link, inference_datastructures_proof.proof_bindings(trigger_proof), trigger_is_firstP);
        if (NIL != trigger_is_firstP) {
            add_join_link_first_proof(join_link, shared_trigger_proof_bindings, trigger_proof);
        } else {
            add_join_link_second_proof(join_link, shared_trigger_proof_bindings, trigger_proof);
        }
        return NIL;
    }

    public static SubLObject remove_join_link_proof_both_ways(final SubLObject join_link, final SubLObject proof, final SubLObject v_bindings) {
        remove_join_link_proof(join_link, proof, v_bindings, T);
        remove_join_link_proof(join_link, proof, v_bindings, NIL);
        return NIL;
    }

    public static SubLObject remove_join_link_proof(final SubLObject join_link, final SubLObject trigger_proof, final SubLObject trigger_proof_bindings, final SubLObject trigger_is_firstP) {
        final SubLObject shared_trigger_proof_bindings = join_link_shared_proof_bindings(join_link, trigger_proof_bindings, trigger_is_firstP);
        if (NIL != trigger_is_firstP) {
            remove_join_link_first_proof(join_link, shared_trigger_proof_bindings, trigger_proof);
        } else {
            remove_join_link_second_proof(join_link, shared_trigger_proof_bindings, trigger_proof);
        }
        return NIL;
    }

    public static SubLObject find_or_create_join_link_supporting_mapped_problems(final SubLObject store, final SubLObject dnf_clause, final SubLObject first_supporting_problem_spec, final SubLObject supported_problem) {
        final SubLObject first_mapped_query = inference_datastructures_problem_query.new_problem_query_from_subclause_spec(dnf_clause, first_supporting_problem_spec);
        final SubLObject second_mapped_query = inference_datastructures_problem_query.new_problem_query_without_subclause_spec(dnf_clause, first_supporting_problem_spec);
        final SubLObject first_mapped_query_vars = cycl_utilities.expression_gather(first_mapped_query, $sym43$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject second_mapped_query_vars = cycl_utilities.expression_gather(second_mapped_query, $sym43$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject free_hl_vars = (NIL != inference_datastructures_problem_store.problem_store_allows_problem_hl_free_vars_optimizationP(store)) ? union(inference_datastructures_problem.problem_free_hl_vars(supported_problem), intersection(first_mapped_query_vars, second_mapped_query_vars, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject first_mapped_query_free_vars = intersection(free_hl_vars, first_mapped_query_vars, UNPROVIDED, UNPROVIDED);
        final SubLObject second_mapped_query_free_vars = intersection(free_hl_vars, second_mapped_query_vars, UNPROVIDED, UNPROVIDED);
        final SubLObject first_mapped_problem = inference_worker.find_or_create_problem(store, first_mapped_query, first_mapped_query_free_vars, UNPROVIDED);
        final SubLObject second_mapped_problem = inference_worker.find_or_create_problem(store, second_mapped_query, second_mapped_query_free_vars, UNPROVIDED);
        return values(first_mapped_problem, second_mapped_problem);
    }

    public static SubLObject first_problem_shared_vars(final SubLObject first_mapped_problem, final SubLObject second_mapped_problem) {
        final SubLObject shared_sibling_vars = shared_sibling_vars(first_mapped_problem, second_mapped_problem);
        return bindings.apply_bindings_backwards(inference_datastructures_problem_link.mapped_problem_variable_map(first_mapped_problem), shared_sibling_vars);
    }

    public static SubLObject second_problem_shared_vars(final SubLObject first_mapped_problem, final SubLObject second_mapped_problem) {
        final SubLObject shared_sibling_vars = shared_sibling_vars(first_mapped_problem, second_mapped_problem);
        return bindings.apply_bindings_backwards(inference_datastructures_problem_link.mapped_problem_variable_map(second_mapped_problem), shared_sibling_vars);
    }

    public static SubLObject shared_sibling_vars(final SubLObject first_mapped_problem, final SubLObject second_mapped_problem) {
        SubLObject shared_vars = NIL;
        final SubLObject first_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(first_mapped_problem);
        final SubLObject second_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(second_mapped_problem);
        SubLObject cdolist_list_var = first_variable_map;
        SubLObject variable_binding = NIL;
        variable_binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject supported_var = bindings.variable_binding_value(variable_binding);
            if (NIL != subl_promotions.memberP(supported_var, second_variable_map, symbol_function(EQL), symbol_function(VARIABLE_BINDING_VALUE))) {
                shared_vars = cons(supported_var, shared_vars);
            }
            cdolist_list_var = cdolist_list_var.rest();
            variable_binding = cdolist_list_var.first();
        } 
        return variables.sort_hl_variable_list(shared_vars);
    }

    public static SubLObject join_tactic_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != inference_datastructures_tactic.tactic_p(v_object)) && $join_module$.getDynamicValue(thread).eql(inference_datastructures_tactic.tactic_hl_module(v_object)));
    }

    public static SubLObject new_join_tactic(final SubLObject join_link, final SubLObject first_supporting_problem_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(join_link);
        final SubLObject data = list(join_link, first_supporting_problem_spec);
        final SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, $join_module$.getDynamicValue(thread), data);
        final SubLObject prob = problem;
        final SubLObject store = inference_datastructures_problem.problem_store(prob);
        final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
            final SubLObject idx_$1 = idx;
            if (NIL == id_index_dense_objects_empty_p(idx_$1, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(idx_$1);
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
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    inference_tactician.strategy_note_new_tactic(strategy, tactic);
                                }
                            }
                        }
                    }
                }
            }
            final SubLObject idx_$2 = idx;
            if (NIL == id_index_sparse_objects_empty_p(idx_$2)) {
                final SubLObject cdohash_table = id_index_sparse_objects(idx_$2);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        inference2 = getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference2)) {
                            final SubLObject inference_var2 = inference2;
                            final SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            final SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
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

    public static SubLObject join_tactic_link(final SubLObject join_tactic) {
        return inference_datastructures_tactic.tactic_data(join_tactic).first();
    }

    public static SubLObject join_tactic_first_supporting_problem_spec(final SubLObject tactic) {
        return second(inference_datastructures_tactic.tactic_data(tactic));
    }

    public static SubLObject join_tactic_first_problem(final SubLObject join_tactic) {
        final SubLObject link = join_tactic_link(join_tactic);
        if (NIL != link) {
            return join_link_first_problem(link);
        }
        return NIL;
    }

    public static SubLObject join_tactic_second_problem(final SubLObject join_tactic) {
        final SubLObject link = join_tactic_link(join_tactic);
        if (NIL != link) {
            return join_link_second_problem(link);
        }
        return NIL;
    }

    public static SubLObject join_tactic_lookahead_problems(final SubLObject join_tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject first_problem = join_tactic_first_problem(join_tactic);
        SubLObject second_problem = join_tactic_second_problem(join_tactic);
        if ((NIL == first_problem) || (NIL == second_problem)) {
            thread.resetMultipleValues();
            final SubLObject first_mapped_problem = find_or_create_join_tactic_supporting_mapped_problems(join_tactic);
            final SubLObject second_mapped_problem = thread.secondMultipleValue();
            thread.resetMultipleValues();
            first_problem = inference_datastructures_problem_link.mapped_problem_problem(first_mapped_problem);
            second_problem = inference_datastructures_problem_link.mapped_problem_problem(second_mapped_problem);
        }
        return values(first_problem, second_problem);
    }

    public static SubLObject determine_new_join_tactics(final SubLObject supported_problem, final SubLObject dnf_clause) {
        if ((NIL != clause_utilities.binary_clause_p(dnf_clause)) && (NIL == inference_trampolines.inference_some_backchain_required_asent_in_clauseP(dnf_clause))) {
            SubLObject doneP = NIL;
            SubLObject index = ZERO_INTEGER;
            SubLObject cdolist_list_var = clauses.neg_lits(dnf_clause);
            SubLObject contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject sense = $NEG;
                if (NIL == doneP) {
                    final SubLObject first_supporting_problem_spec = clause_utilities.new_single_literal_subclause_spec(sense, index);
                    possibly_determine_new_join_tactic(supported_problem, first_supporting_problem_spec, dnf_clause);
                    doneP = T;
                }
                index = add(index, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_asent = cdolist_list_var.first();
            } 
            index = ZERO_INTEGER;
            cdolist_list_var = clauses.pos_lits(dnf_clause);
            contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject sense = $POS;
                if (NIL == doneP) {
                    final SubLObject first_supporting_problem_spec = clause_utilities.new_single_literal_subclause_spec(sense, index);
                    possibly_determine_new_join_tactic(supported_problem, first_supporting_problem_spec, dnf_clause);
                    doneP = T;
                }
                index = add(index, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_asent = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject possibly_determine_new_join_tactic(final SubLObject supported_problem, final SubLObject first_supporting_problem_spec, final SubLObject dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != clause_utilities.subclause_spec_p(first_supporting_problem_spec) : "clause_utilities.subclause_spec_p(first_supporting_problem_spec) " + "CommonSymbols.NIL != clause_utilities.subclause_spec_p(first_supporting_problem_spec) " + first_supporting_problem_spec;
        final SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
        thread.resetMultipleValues();
        final SubLObject first_mapped_problem = find_or_create_join_link_supporting_mapped_problems(store, dnf_clause, first_supporting_problem_spec, supported_problem);
        final SubLObject second_mapped_problem = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject join_link = maybe_new_join_link(supported_problem, first_mapped_problem, second_mapped_problem);
        return new_join_tactic(join_link, first_supporting_problem_spec);
    }

    public static SubLObject compute_strategic_properties_of_join_tactic(final SubLObject tactic, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != join_tactic_p(tactic) : "inference_worker_join.join_tactic_p(tactic) " + "CommonSymbols.NIL != inference_worker_join.join_tactic_p(tactic) " + tactic;
        assert NIL != inference_datastructures_strategy.strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        final SubLObject join_link = join_tactic_link(tactic);
        final SubLObject first_mapped_problem = join_link_first_mapped_problem(join_link);
        final SubLObject second_mapped_problem = join_link_second_mapped_problem(join_link);
        if (NIL == preference_modules.preference_level_p(inference_datastructures_tactic.tactic_preference_level(tactic))) {
            thread.resetMultipleValues();
            final SubLObject preference_level = compute_join_tactic_preference_level(first_mapped_problem, second_mapped_problem, $TACTICAL);
            final SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            inference_datastructures_tactic.set_tactic_preference_level(tactic, preference_level, justification);
            if ($DOOMED == preference_level) {
                inference_worker.note_tactic_doomed(tactic, $TACTICAL);
            }
        }
        thread.resetMultipleValues();
        final SubLObject preference_level = compute_join_tactic_preference_level(first_mapped_problem, second_mapped_problem, strategy);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        inference_datastructures_strategy.set_tactic_strategic_preference_level(tactic, strategy, preference_level, justification);
        if ($DOOMED == preference_level) {
            inference_worker.note_tactic_doomed(tactic, strategy);
        }
        final SubLObject productivity = compute_join_tactic_productivity(first_mapped_problem, second_mapped_problem, strategy);
        inference_datastructures_strategy.set_tactic_strategic_productivity(tactic, strategy, productivity);
        return tactic;
    }

    public static SubLObject compute_join_tactic_productivity(final SubLObject first_mapped_problem, final SubLObject second_mapped_problem, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(first_mapped_problem) : "inference_datastructures_problem_link.mapped_problem_p(first_mapped_problem) " + "CommonSymbols.NIL != inference_datastructures_problem_link.mapped_problem_p(first_mapped_problem) " + first_mapped_problem;
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(second_mapped_problem) : "inference_datastructures_problem_link.mapped_problem_p(second_mapped_problem) " + "CommonSymbols.NIL != inference_datastructures_problem_link.mapped_problem_p(second_mapped_problem) " + second_mapped_problem;
        assert NIL != inference_datastructures_strategy.strategy_p(strategy) : "inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) " + strategy;
        final SubLObject first_problem = inference_datastructures_problem_link.mapped_problem_problem(first_mapped_problem);
        final SubLObject second_problem = inference_datastructures_problem_link.mapped_problem_problem(second_mapped_problem);
        final SubLObject first_productivity = inference_lookahead_productivity.memoized_problem_max_removal_productivity(first_problem, strategy);
        final SubLObject second_productivity = inference_lookahead_productivity.memoized_problem_max_removal_productivity(second_problem, strategy);
        final SubLObject raw_join_productivity = inference_datastructures_enumerated_types.productivity_max(first_productivity, second_productivity);
        final SubLObject join_productivity = inference_datastructures_enumerated_types.productivity_divide_number(raw_join_productivity, $join_productivity_scaling_factor$.getDynamicValue(thread));
        return join_productivity;
    }

    public static SubLObject compute_join_tactic_preference_level(final SubLObject first_mapped_problem, final SubLObject second_mapped_problem, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(first_mapped_problem) : "inference_datastructures_problem_link.mapped_problem_p(first_mapped_problem) " + "CommonSymbols.NIL != inference_datastructures_problem_link.mapped_problem_p(first_mapped_problem) " + first_mapped_problem;
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(second_mapped_problem) : "inference_datastructures_problem_link.mapped_problem_p(second_mapped_problem) " + "CommonSymbols.NIL != inference_datastructures_problem_link.mapped_problem_p(second_mapped_problem) " + second_mapped_problem;
        assert NIL != inference_worker.strategic_context_p(strategic_context) : "inference_worker.strategic_context_p(strategic_context) " + "CommonSymbols.NIL != inference_worker.strategic_context_p(strategic_context) " + strategic_context;
        final SubLObject first_problem = inference_datastructures_problem_link.mapped_problem_problem(first_mapped_problem);
        final SubLObject first_problem_shared_vars = first_problem_shared_vars(first_mapped_problem, second_mapped_problem);
        final SubLObject second_problem = inference_datastructures_problem_link.mapped_problem_problem(second_mapped_problem);
        final SubLObject second_problem_shared_vars = second_problem_shared_vars(first_mapped_problem, second_mapped_problem);
        thread.resetMultipleValues();
        final SubLObject first_preference_level = inference_tactician_utilities.memoized_problem_global_preference_level(first_problem, strategic_context, first_problem_shared_vars);
        final SubLObject first_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject second_preference_level = inference_tactician_utilities.memoized_problem_global_preference_level(second_problem, strategic_context, second_problem_shared_vars);
        final SubLObject second_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((((first_preference_level == $DISPREFERRED) && (NIL != Strings.stringE(first_justification, $str55$TVA_POS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (second_preference_level == $DISPREFERRED)) && (NIL != Strings.stringE(second_justification, $str55$TVA_POS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return values($GROSSLY_DISPREFERRED, $str57$DOUBLE_TVA_POS);
        }
        if (NIL != preference_modules.preference_level_L(first_preference_level, second_preference_level)) {
            final SubLObject justification = cconcatenate($str58$first_problem__, first_justification);
            return values(first_preference_level, justification);
        }
        final SubLObject justification = cconcatenate($str59$second_problem__, second_justification);
        return values(second_preference_level, justification);
    }

    public static SubLObject execute_join_tactic(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject first_mapped_problem = find_or_create_join_tactic_supporting_mapped_problems(tactic);
        final SubLObject second_mapped_problem = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject join_link = join_tactic_link(tactic);
        inference_worker.problem_link_open_and_repropagate_supporting_mapped_problem(join_link, first_mapped_problem);
        inference_worker.problem_link_open_and_repropagate_supporting_mapped_problem(join_link, second_mapped_problem);
        if (NIL != inference_tactician_strategic_uninterestingness.tactic_preferredP(tactic, $TACTICAL)) {
            inference_worker.possibly_discard_all_other_possible_structural_conjunctive_tactics(tactic);
        }
        inference_worker_join_ordered.consider_strategic_ramifications_of_tactic_preference_level(tactic);
        return tactic;
    }

    public static SubLObject find_or_create_join_tactic_supporting_mapped_problems(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        final SubLObject query = inference_datastructures_problem.problem_query(problem);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == list_utilities.singletonP(query))) {
            Errors.error($str60$Join_tactics_like__a_must_only_ap, tactic, query);
        }
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject dnf_clause = query.first();
        final SubLObject first_supporting_problem_spec = join_tactic_first_supporting_problem_spec(tactic);
        return find_or_create_join_link_supporting_mapped_problems(store, dnf_clause, first_supporting_problem_spec, problem);
    }

    public static SubLObject new_join_proof(final SubLObject join_link, final SubLObject subproofs_with_sub_bindings) {
        return inference_worker_join_ordered.new_conjunctive_proof(join_link, subproofs_with_sub_bindings);
    }

    public static SubLObject join_proof_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_proof.proof_p(v_object)) && ($JOIN == inference_datastructures_proof.proof_type(v_object)));
    }

    public static SubLObject bubble_up_proof_to_join_link(final SubLObject trigger_subproof, final SubLObject variable_map, final SubLObject join_link) {
        final SubLObject trigger_is_firstP = mapped_proof_is_firstP(trigger_subproof, variable_map, join_link);
        add_join_link_proof(join_link, trigger_subproof, trigger_is_firstP);
        bubble_up_proof_to_join_link_int(trigger_subproof, variable_map, join_link, trigger_is_firstP);
        return NIL;
    }

    public static SubLObject mapped_proof_is_firstP(final SubLObject subproof, final SubLObject proof_variable_map, final SubLObject join_link) {
        final SubLObject first_mapped_problem = join_link_first_mapped_problem(join_link);
        final SubLObject first_problem = inference_datastructures_problem_link.mapped_problem_problem(first_mapped_problem);
        final SubLObject subproof_supported_problem = inference_datastructures_proof.proof_supported_problem(subproof);
        if (first_problem.eql(subproof_supported_problem)) {
            final SubLObject first_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(first_mapped_problem);
            if (NIL != bindings.bindings_equalP(first_variable_map, proof_variable_map)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject bubble_up_proof_to_join_link_int(final SubLObject trigger_subproof, final SubLObject variable_map, final SubLObject join_link, final SubLObject trigger_is_firstP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject proofs = NIL;
        final SubLObject trigger_proof_bindings = inference_datastructures_proof.proof_bindings(trigger_subproof);
        final SubLObject join_bindings = join_link_shared_proof_bindings(join_link, trigger_proof_bindings, trigger_is_firstP);
        final SubLObject sibling_proofs = list_utilities.remove_if_not($sym61$PROOF_PROVEN_, join_link_sibling_proofs_lookup(join_link, join_bindings, trigger_is_firstP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != sibling_proofs) {
            final SubLObject sibling_mapped_problem = join_link_sibling_mapped_problem(join_link, trigger_is_firstP);
            final SubLObject sibling_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(sibling_mapped_problem);
            SubLObject sibling_proofs_with_bindings = NIL;
            SubLObject cdolist_list_var = sibling_proofs;
            SubLObject sibling_proof = NIL;
            sibling_proof = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject sibling_sub_proof_bindings = bindings.transfer_variable_map_to_bindings(sibling_variable_map, inference_datastructures_proof.proof_bindings(sibling_proof));
                sibling_proofs_with_bindings = cons(cons(sibling_proof, sibling_sub_proof_bindings), sibling_proofs_with_bindings);
                cdolist_list_var = cdolist_list_var.rest();
                sibling_proof = cdolist_list_var.first();
            } 
            sibling_proofs_with_bindings = nreverse(sibling_proofs_with_bindings);
            final SubLObject trigger_sub_proof_bindings = bindings.transfer_variable_map_to_bindings(variable_map, trigger_proof_bindings);
            final SubLObject supporting_mapped_proof_lists_by_supporting_problem = (NIL != trigger_is_firstP) ? list(list(cons(trigger_subproof, trigger_sub_proof_bindings)), sibling_proofs_with_bindings) : list(sibling_proofs_with_bindings, list(cons(trigger_subproof, trigger_sub_proof_bindings)));
            SubLObject cdolist_list_var2;
            final SubLObject mapped_subproof_lists = cdolist_list_var2 = list_utilities.cartesian_product(supporting_mapped_proof_lists_by_supporting_problem, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject mapped_subproof_list = NIL;
            mapped_subproof_list = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                thread.resetMultipleValues();
                final SubLObject proof = new_join_proof(join_link, mapped_subproof_list);
                final SubLObject newP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != newP) {
                    proofs = cons(proof, proofs);
                } else {
                    inference_worker.possibly_note_proof_processed(trigger_subproof);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                mapped_subproof_list = cdolist_list_var2.first();
            } 
            SubLObject cdolist_list_var3;
            proofs = cdolist_list_var3 = nreverse(proofs);
            SubLObject proof2 = NIL;
            proof2 = cdolist_list_var3.first();
            while (NIL != cdolist_list_var3) {
                inference_worker.bubble_up_proof(proof2);
                cdolist_list_var3 = cdolist_list_var3.rest();
                proof2 = cdolist_list_var3.first();
            } 
        }
        return NIL;
    }

    public static SubLObject declare_inference_worker_join_file() {
        declareFunction(me, "join_link_data_print_function_trampoline", "JOIN-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "join_link_data_p", "JOIN-LINK-DATA-P", 1, 0, false);
        new inference_worker_join.$join_link_data_p$UnaryFunction();
        declareFunction(me, "j_link_data_join_vars", "J-LINK-DATA-JOIN-VARS", 1, 0, false);
        declareFunction(me, "j_link_data_first_proof_index", "J-LINK-DATA-FIRST-PROOF-INDEX", 1, 0, false);
        declareFunction(me, "j_link_data_second_proof_index", "J-LINK-DATA-SECOND-PROOF-INDEX", 1, 0, false);
        declareFunction(me, "_csetf_j_link_data_join_vars", "_CSETF-J-LINK-DATA-JOIN-VARS", 2, 0, false);
        declareFunction(me, "_csetf_j_link_data_first_proof_index", "_CSETF-J-LINK-DATA-FIRST-PROOF-INDEX", 2, 0, false);
        declareFunction(me, "_csetf_j_link_data_second_proof_index", "_CSETF-J-LINK-DATA-SECOND-PROOF-INDEX", 2, 0, false);
        declareFunction(me, "make_join_link_data", "MAKE-JOIN-LINK-DATA", 0, 1, false);
        declareFunction(me, "visit_defstruct_join_link_data", "VISIT-DEFSTRUCT-JOIN-LINK-DATA", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_join_link_data_method", "VISIT-DEFSTRUCT-OBJECT-JOIN-LINK-DATA-METHOD", 2, 0, false);
        declareFunction(me, "valid_join_link_data_p", "VALID-JOIN-LINK-DATA-P", 1, 0, false);
        declareFunction(me, "new_join_link_data", "NEW-JOIN-LINK-DATA", 2, 0, false);
        declareFunction(me, "join_link_p", "JOIN-LINK-P", 1, 0, false);
        declareFunction(me, "maybe_new_join_link", "MAYBE-NEW-JOIN-LINK", 3, 0, false);
        declareFunction(me, "new_join_link", "NEW-JOIN-LINK", 3, 0, false);
        declareFunction(me, "destroy_join_link", "DESTROY-JOIN-LINK", 1, 0, false);
        declareMacro(me, "do_join_link_first_proofs", "DO-JOIN-LINK-FIRST-PROOFS");
        declareMacro(me, "do_join_link_second_proofs", "DO-JOIN-LINK-SECOND-PROOFS");
        declareFunction(me, "join_link_join_vars", "JOIN-LINK-JOIN-VARS", 1, 0, false);
        declareFunction(me, "join_link_first_proof_index", "JOIN-LINK-FIRST-PROOF-INDEX", 1, 0, false);
        declareFunction(me, "join_link_second_proof_index", "JOIN-LINK-SECOND-PROOF-INDEX", 1, 0, false);
        declareFunction(me, "join_link_first_mapped_problem", "JOIN-LINK-FIRST-MAPPED-PROBLEM", 1, 0, false);
        declareFunction(me, "join_link_second_mapped_problem", "JOIN-LINK-SECOND-MAPPED-PROBLEM", 1, 0, false);
        declareFunction(me, "join_link_first_problem", "JOIN-LINK-FIRST-PROBLEM", 1, 0, false);
        declareFunction(me, "join_link_second_problem", "JOIN-LINK-SECOND-PROBLEM", 1, 0, false);
        declareFunction(me, "join_link_trigger_variable_map", "JOIN-LINK-TRIGGER-VARIABLE-MAP", 2, 0, false);
        declareFunction(me, "join_link_trigger_mapped_problem", "JOIN-LINK-TRIGGER-MAPPED-PROBLEM", 2, 0, false);
        declareFunction(me, "join_link_sibling_mapped_problem", "JOIN-LINK-SIBLING-MAPPED-PROBLEM", 2, 0, false);
        declareFunction(me, "join_link_first_proofs_lookup", "JOIN-LINK-FIRST-PROOFS-LOOKUP", 2, 0, false);
        declareFunction(me, "join_link_second_proofs_lookup", "JOIN-LINK-SECOND-PROOFS-LOOKUP", 2, 0, false);
        declareFunction(me, "join_link_sibling_proofs_lookup", "JOIN-LINK-SIBLING-PROOFS-LOOKUP", 3, 0, false);
        declareFunction(me, "join_link_shared_proof_bindings", "JOIN-LINK-SHARED-PROOF-BINDINGS", 3, 0, false);
        declareFunction(me, "join_link_tactic", "JOIN-LINK-TACTIC", 1, 0, false);
        declareFunction(me, "join_link_tactic_int", "JOIN-LINK-TACTIC-INT", 1, 0, false);
        declareFunction(me, "add_join_link_first_proof", "ADD-JOIN-LINK-FIRST-PROOF", 3, 0, false);
        declareFunction(me, "remove_join_link_first_proof", "REMOVE-JOIN-LINK-FIRST-PROOF", 3, 0, false);
        declareFunction(me, "add_join_link_second_proof", "ADD-JOIN-LINK-SECOND-PROOF", 3, 0, false);
        declareFunction(me, "remove_join_link_second_proof", "REMOVE-JOIN-LINK-SECOND-PROOF", 3, 0, false);
        declareFunction(me, "add_join_link_proof", "ADD-JOIN-LINK-PROOF", 3, 0, false);
        declareFunction(me, "remove_join_link_proof_both_ways", "REMOVE-JOIN-LINK-PROOF-BOTH-WAYS", 3, 0, false);
        declareFunction(me, "remove_join_link_proof", "REMOVE-JOIN-LINK-PROOF", 4, 0, false);
        declareFunction(me, "find_or_create_join_link_supporting_mapped_problems", "FIND-OR-CREATE-JOIN-LINK-SUPPORTING-MAPPED-PROBLEMS", 4, 0, false);
        declareFunction(me, "first_problem_shared_vars", "FIRST-PROBLEM-SHARED-VARS", 2, 0, false);
        declareFunction(me, "second_problem_shared_vars", "SECOND-PROBLEM-SHARED-VARS", 2, 0, false);
        declareFunction(me, "shared_sibling_vars", "SHARED-SIBLING-VARS", 2, 0, false);
        declareFunction(me, "join_tactic_p", "JOIN-TACTIC-P", 1, 0, false);
        declareFunction(me, "new_join_tactic", "NEW-JOIN-TACTIC", 2, 0, false);
        declareFunction(me, "join_tactic_link", "JOIN-TACTIC-LINK", 1, 0, false);
        declareFunction(me, "join_tactic_first_supporting_problem_spec", "JOIN-TACTIC-FIRST-SUPPORTING-PROBLEM-SPEC", 1, 0, false);
        declareFunction(me, "join_tactic_first_problem", "JOIN-TACTIC-FIRST-PROBLEM", 1, 0, false);
        declareFunction(me, "join_tactic_second_problem", "JOIN-TACTIC-SECOND-PROBLEM", 1, 0, false);
        declareFunction(me, "join_tactic_lookahead_problems", "JOIN-TACTIC-LOOKAHEAD-PROBLEMS", 1, 0, false);
        declareFunction(me, "determine_new_join_tactics", "DETERMINE-NEW-JOIN-TACTICS", 2, 0, false);
        declareFunction(me, "possibly_determine_new_join_tactic", "POSSIBLY-DETERMINE-NEW-JOIN-TACTIC", 3, 0, false);
        declareFunction(me, "compute_strategic_properties_of_join_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-JOIN-TACTIC", 2, 0, false);
        declareFunction(me, "compute_join_tactic_productivity", "COMPUTE-JOIN-TACTIC-PRODUCTIVITY", 3, 0, false);
        declareFunction(me, "compute_join_tactic_preference_level", "COMPUTE-JOIN-TACTIC-PREFERENCE-LEVEL", 3, 0, false);
        declareFunction(me, "execute_join_tactic", "EXECUTE-JOIN-TACTIC", 1, 0, false);
        declareFunction(me, "find_or_create_join_tactic_supporting_mapped_problems", "FIND-OR-CREATE-JOIN-TACTIC-SUPPORTING-MAPPED-PROBLEMS", 1, 0, false);
        declareFunction(me, "new_join_proof", "NEW-JOIN-PROOF", 2, 0, false);
        declareFunction(me, "join_proof_p", "JOIN-PROOF-P", 1, 0, false);
        declareFunction(me, "bubble_up_proof_to_join_link", "BUBBLE-UP-PROOF-TO-JOIN-LINK", 3, 0, false);
        declareFunction(me, "mapped_proof_is_firstP", "MAPPED-PROOF-IS-FIRST?", 3, 0, false);
        declareFunction(me, "bubble_up_proof_to_join_link_int", "BUBBLE-UP-PROOF-TO-JOIN-LINK-INT", 4, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_worker_join_file() {
        defconstant("*DTP-JOIN-LINK-DATA*", JOIN_LINK_DATA);
        defparameter("*JOIN-MODULE*", inference_modules.inference_structural_module($JOIN, UNPROVIDED));
        defparameter("*JOIN-PRODUCTIVITY-SCALING-FACTOR*", EIGHT_INTEGER);
        return NIL;
    }

    public static SubLObject setup_inference_worker_join_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_join_link_data$.getGlobalValue(), symbol_function(JOIN_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(J_LINK_DATA_JOIN_VARS, _CSETF_J_LINK_DATA_JOIN_VARS);
        def_csetf(J_LINK_DATA_FIRST_PROOF_INDEX, _CSETF_J_LINK_DATA_FIRST_PROOF_INDEX);
        def_csetf(J_LINK_DATA_SECOND_PROOF_INDEX, _CSETF_J_LINK_DATA_SECOND_PROOF_INDEX);
        identity(JOIN_LINK_DATA);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_join_link_data$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_JOIN_LINK_DATA_METHOD));
        register_macro_helper(JOIN_LINK_FIRST_PROOF_INDEX, DO_JOIN_LINK_FIRST_PROOFS);
        register_macro_helper(JOIN_LINK_SECOND_PROOF_INDEX, DO_JOIN_LINK_SECOND_PROOFS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_worker_join_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_worker_join_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_worker_join_file();
    }

    

    public static final class $join_link_data_native extends SubLStructNative {
        public SubLObject $join_vars;

        public SubLObject $first_proof_index;

        public SubLObject $second_proof_index;

        private static final SubLStructDeclNative structDecl;

        private $join_link_data_native() {
            this.$join_vars = Lisp.NIL;
            this.$first_proof_index = Lisp.NIL;
            this.$second_proof_index = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$join_vars;
        }

        @Override
        public SubLObject getField3() {
            return this.$first_proof_index;
        }

        @Override
        public SubLObject getField4() {
            return this.$second_proof_index;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$join_vars = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$first_proof_index = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$second_proof_index = value;
        }

        static {
            structDecl = makeStructDeclNative($join_link_data_native.class, JOIN_LINK_DATA, JOIN_LINK_DATA_P, $list2, $list3, new String[]{ "$join_vars", "$first_proof_index", "$second_proof_index" }, $list4, $list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $join_link_data_p$UnaryFunction extends UnaryFunction {
        public $join_link_data_p$UnaryFunction() {
            super(extractFunctionNamed("JOIN-LINK-DATA-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return join_link_data_p(arg1);
        }
    }
}

/**
 * Total time: 246 ms
 */
