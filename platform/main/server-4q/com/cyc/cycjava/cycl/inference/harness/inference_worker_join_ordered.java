package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_worker_join_ordered extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myName = "com.cyc.cycjava.cycl.inference.harness.inference_worker_join_ordered";
    public static String myFingerPrint = "51e7490044cced5d8727e480b005acd37a5149dc455fae64272abff6dbf22c26";
    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1400L)
    public static SubLSymbol $dtp_join_ordered_link_data$;
    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 18700L)
    public static SubLSymbol $join_ordered_module$;
    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 30400L)
    public static SubLSymbol $max_subclause_spec_cartesian_product_cardinality$;
    private static SubLSymbol $sym0$JOIN_ORDERED_LINK_DATA;
    private static SubLSymbol $sym1$JOIN_ORDERED_LINK_DATA_P;
    private static SubLList $list2;
    private static SubLList $list3;
    private static SubLList $list4;
    private static SubLList $list5;
    private static SubLSymbol $sym6$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static SubLSymbol $sym7$JOIN_ORDERED_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE;
    private static SubLList $list8;
    private static SubLSymbol $sym9$JO_LINK_DATA_FOCAL_PROOF_INDEX;
    private static SubLSymbol $sym10$_CSETF_JO_LINK_DATA_FOCAL_PROOF_INDEX;
    private static SubLSymbol $sym11$JO_LINK_DATA_NON_FOCAL_PROOF_INDEX;
    private static SubLSymbol $sym12$_CSETF_JO_LINK_DATA_NON_FOCAL_PROOF_INDEX;
    private static SubLSymbol $sym13$JO_LINK_DATA_RESTRICTED_NON_FOCAL_LINK_INDEX;
    private static SubLSymbol $sym14$_CSETF_JO_LINK_DATA_RESTRICTED_NON_FOCAL_LINK_INDEX;
    private static SubLSymbol $FOCAL_PROOF_INDEX;
    private static SubLSymbol $NON_FOCAL_PROOF_INDEX;
    private static SubLSymbol $RESTRICTED_NON_FOCAL_LINK_INDEX;
    private static SubLString $str18$Invalid_slot__S_for_construction_;
    private static SubLSymbol $BEGIN;
    private static SubLSymbol $sym20$MAKE_JOIN_ORDERED_LINK_DATA;
    private static SubLSymbol $SLOT;
    private static SubLSymbol $END;
    private static SubLSymbol $sym23$VISIT_DEFSTRUCT_OBJECT_JOIN_ORDERED_LINK_DATA_METHOD;
    private static SubLSymbol $JOIN_ORDERED;
    private static SubLSymbol $sym25$MAPPED_PROBLEM_P;
    private static SubLSymbol $FREE;
    private static SubLList $list27;
    private static SubLSymbol $sym28$INDEX;
    private static SubLSymbol $sym29$PROOF_LIST_VAR;
    private static SubLSymbol $sym30$CLET;
    private static SubLSymbol $sym31$JOIN_ORDERED_LINK_FOCAL_PROOF_INDEX;
    private static SubLSymbol $sym32$DO_DICTIONARY;
    private static SubLSymbol $sym33$DO_LIST;
    private static SubLSymbol $sym34$INDEX;
    private static SubLSymbol $sym35$PROOF_LIST_VAR;
    private static SubLSymbol $sym36$JOIN_ORDERED_LINK_NON_FOCAL_PROOF_INDEX;
    private static SubLList $list37;
    private static SubLList $list38;
    private static SubLSymbol $ALLOW_OTHER_KEYS;
    private static SubLSymbol $DONE;
    private static SubLSymbol $sym41$LINK_VAR;
    private static SubLSymbol $sym42$RESTRICTION_LINK;
    private static SubLSymbol $sym43$DO_PROBLEM_ARGUMENT_LINKS;
    private static SubLSymbol $sym44$JOIN_ORDERED_LINK_NON_FOCAL_PROBLEM;
    private static SubLSymbol $TYPE;
    private static SubLSymbol $RESTRICTION;
    private static SubLSymbol $sym47$PWHEN;
    private static SubLSymbol $sym48$NON_FOCAL_RESTRICTION_LINK_WITH_CORRESPONDING_FOCAL_PROOF_;
    private static SubLSymbol $sym49$PROBLEM_LINK_SOLE_SUPPORTING_PROBLEM;
    private static SubLList $list50;
    private static SubLSymbol $sym51$RESTRICTION_LINK;
    private static SubLSymbol $sym52$NON_FOCAL_PROBLEM;
    private static SubLSymbol $sym53$DO_PROBLEM_DEPENDENT_LINKS;
    private static SubLSymbol $sym54$PROBLEM_LINK_SUPPORTED_PROBLEM;
    private static SubLSymbol $sym55$JOIN_ORDERED_LINK_RESTRICTED_NON_FOCAL_LINK_;
    private static SubLSymbol $sym56$DO_JOIN_ORDERED_LINK_FOCAL_PROOFS;
    private static SubLSymbol $sym57$DO_JOIN_ORDERED_LINK_NON_FOCAL_PROOFS;
    private static SubLString $str58$Could_not_find_the_tactic_for__a;
    private static SubLSymbol $sym59$JOIN_ORDERED_LINK_P;
    private static SubLSymbol $sym60$PROOF_P;
    private static SubLSymbol $sym61$RESTRICTION_LINK_P;
    private static SubLSymbol $SKIP;
    private static SubLSymbol $sym63$PROBLEM_P;
    private static SubLSymbol $NEG;
    private static SubLSymbol $POS;
    private static SubLSymbol $ANSWER;
    private static SubLSymbol $UNION;
    private static SubLInteger $int$21200;
    private static SubLString $str69$Too_many_possible_matches_to_chec;
    private static SubLSymbol $sym70$DUPLICATES_;
    private static SubLSymbol $sym71$HL_VAR_;
    private static SubLSymbol $TACTICAL;
    private static SubLSymbol $DOOMED;
    private static SubLSymbol $sym74$STRATEGY_P;
    private static SubLList $list75;
    private static SubLSymbol $sym76$MEMOIZED_FOCAL_TO_NON_FOCAL_VARIABLE_MAP_INT;
    private static SubLSymbol $sym77$_EXIT;
    private static SubLSymbol $sym78$MEMOIZED_NON_FOCAL_TO_FOCAL_VARIABLE_MAP_INT;
    private static SubLString $str79$Finding_or_creating_a_restricted_;
    private static SubLString $str80$Creating_a_restricted_problem_of_;
    private static SubLList $list81;
    private static SubLSymbol $sym82$MEMOIZED_TRIGGER_VARS_SHARED_BY_SIBLING_INT;
    private static SubLSymbol $sym83$VARIABLE_P;
    private static SubLSymbol $sym84$VARIABLE_BINDING_VARIABLE;
    private static SubLString $str85$_a_was_a_rejected_proof;
    private static SubLSymbol $sym86$PROOF_PROVEN_;
    private static SubLSymbol $PREFERRED;
    private static SubLList $list88;
    private static SubLObject $$isa;

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1400L)
    public static SubLObject join_ordered_link_data_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1400L)
    public static SubLObject join_ordered_link_data_p(SubLObject v_object) {
        return (v_object.getClass() == $join_ordered_link_data_native.class) ? T : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1400L)
    public static SubLObject jo_link_data_focal_proof_index(SubLObject v_object) {
        assert NIL != join_ordered_link_data_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1400L)
    public static SubLObject jo_link_data_non_focal_proof_index(SubLObject v_object) {
        assert NIL != join_ordered_link_data_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1400L)
    public static SubLObject jo_link_data_restricted_non_focal_link_index(SubLObject v_object) {
        assert NIL != join_ordered_link_data_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1400L)
    public static SubLObject _csetf_jo_link_data_focal_proof_index(SubLObject v_object, SubLObject value) {
        assert NIL != join_ordered_link_data_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1400L)
    public static SubLObject _csetf_jo_link_data_non_focal_proof_index(SubLObject v_object, SubLObject value) {
        assert NIL != join_ordered_link_data_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1400L)
    public static SubLObject _csetf_jo_link_data_restricted_non_focal_link_index(SubLObject v_object, SubLObject value) {
        assert NIL != join_ordered_link_data_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1400L)
    public static SubLObject make_join_ordered_link_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        SubLObject v_new = new $join_ordered_link_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($FOCAL_PROOF_INDEX)) {
                _csetf_jo_link_data_focal_proof_index(v_new, current_value);
            } else if (pcase_var.eql($NON_FOCAL_PROOF_INDEX)) {
                _csetf_jo_link_data_non_focal_proof_index(v_new, current_value);
            } else if (pcase_var.eql($RESTRICTED_NON_FOCAL_LINK_INDEX)) {
                _csetf_jo_link_data_restricted_non_focal_link_index(v_new, current_value);
            } else {
                Errors.error($str18$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1400L)
    public static SubLObject visit_defstruct_join_ordered_link_data(SubLObject obj, SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, $BEGIN, $sym20$MAKE_JOIN_ORDERED_LINK_DATA, THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, $SLOT, $FOCAL_PROOF_INDEX, jo_link_data_focal_proof_index(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $NON_FOCAL_PROOF_INDEX, jo_link_data_non_focal_proof_index(obj));
        Functions.funcall(visitor_fn, obj, $SLOT, $RESTRICTED_NON_FOCAL_LINK_INDEX, jo_link_data_restricted_non_focal_link_index(obj));
        Functions.funcall(visitor_fn, obj, $END, $sym20$MAKE_JOIN_ORDERED_LINK_DATA, THREE_INTEGER);
        return obj;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 1400L)
    public static SubLObject visit_defstruct_object_join_ordered_link_data_method(SubLObject obj, SubLObject visitor_fn) {
        return visit_defstruct_join_ordered_link_data(obj, visitor_fn);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 2200L)
    public static SubLObject valid_join_ordered_link_data_p(SubLObject v_object) {
        return makeBoolean(NIL != join_ordered_link_data_p(v_object) && NIL != dictionary.dictionary_p(jo_link_data_focal_proof_index(v_object)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 2400L)
    public static SubLObject new_join_ordered_link_data() {
        SubLObject data = make_join_ordered_link_data(UNPROVIDED);
        _csetf_jo_link_data_focal_proof_index(data, dictionary.new_dictionary(Symbols.symbol_function(EQUAL), UNPROVIDED));
        _csetf_jo_link_data_non_focal_proof_index(data, dictionary.new_dictionary(Symbols.symbol_function(EQUAL), UNPROVIDED));
        _csetf_jo_link_data_restricted_non_focal_link_index(data, dictionary_contents.new_dictionary_contents(ZERO_INTEGER, Symbols.symbol_function(EQ)));
        return data;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 3000L)
    public static SubLObject join_ordered_link_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_problem_link.problem_link_p(v_object) && $JOIN_ORDERED == inference_datastructures_problem_link.problem_link_type(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 3200L)
    public static SubLObject maybe_new_join_ordered_link(SubLObject supported_problem, SubLObject focal_supporting_mapped_problem, SubLObject non_focal_supporting_mapped_problem) {
        SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(supported_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject candidate_link;
        SubLObject candidate_mapped_problem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            candidate_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, candidate_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(candidate_link, $JOIN_ORDERED)) {
                candidate_mapped_problem = join_ordered_link_focal_mapped_problem(candidate_link);
                if (NIL != inference_datastructures_problem_link.mapped_problem_equal(focal_supporting_mapped_problem, candidate_mapped_problem)) {
                    return subl_promotions.values2(candidate_link, NIL);
                }
            }
        }
        return subl_promotions.values2(new_join_ordered_link(supported_problem, focal_supporting_mapped_problem, non_focal_supporting_mapped_problem), T);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 3900L)
    public static SubLObject new_join_ordered_link(SubLObject supported_problem, SubLObject focal_supporting_mapped_problem, SubLObject non_focal_supporting_mapped_problem) {
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(focal_supporting_mapped_problem) : focal_supporting_mapped_problem;
        if (NIL != non_focal_supporting_mapped_problem && !assertionsDisabledInClass && NIL == inference_datastructures_problem_link.mapped_problem_p(non_focal_supporting_mapped_problem)) {
            throw new AssertionError(non_focal_supporting_mapped_problem);
        }
        SubLObject link = inference_datastructures_problem_link.new_problem_link($JOIN_ORDERED, supported_problem);
        SubLObject data = new_join_ordered_link_data();
        inference_datastructures_problem_link.set_problem_link_data(link, data);
        inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(focal_supporting_mapped_problem, link);
        if (NIL != non_focal_supporting_mapped_problem) {
            inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(non_focal_supporting_mapped_problem, link);
        }
        return link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 4800L)
    public static SubLObject destroy_join_ordered_link(SubLObject join_ordered_link) {
        inference_worker_residual_transformation.destroy_join_ordered_link_wrt_residual_transformation_links(join_ordered_link);
        SubLObject tactic = join_ordered_link_tactic(join_ordered_link);
        if (NIL != inference_datastructures_tactic.valid_tactic_p(tactic)) {
            inference_datastructures_tactic.destroy_problem_tactic_and_backpointers(tactic);
        }
        SubLObject data = inference_datastructures_problem_link.problem_link_data(join_ordered_link);
        if (NIL != valid_join_ordered_link_data_p(data)) {
            dictionary.clear_dictionary(jo_link_data_focal_proof_index(data));
            _csetf_jo_link_data_focal_proof_index(data, $FREE);
            dictionary.clear_dictionary(jo_link_data_non_focal_proof_index(data));
            _csetf_jo_link_data_non_focal_proof_index(data, $FREE);
            dictionary_contents.clear_dictionary_contents(jo_link_data_restricted_non_focal_link_index(data));
            _csetf_jo_link_data_restricted_non_focal_link_index(data, $FREE);
        }
        return join_ordered_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 5700L)
    public static SubLObject do_join_ordered_link_focal_proofs(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list27);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject bindings_var = NIL;
        SubLObject proof_var = NIL;
        SubLObject join_ordered_link = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list27);
        bindings_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list27);
        proof_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list27);
        join_ordered_link = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            SubLObject index = $sym28$INDEX;
            SubLObject proof_list_var = $sym29$PROOF_LIST_VAR;
            return list($sym30$CLET, list(list(index, list($sym31$JOIN_ORDERED_LINK_FOCAL_PROOF_INDEX, join_ordered_link))), list($sym32$DO_DICTIONARY, list(bindings_var, proof_list_var, index), listS($sym33$DO_LIST, list(proof_var, proof_list_var), append(body, NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list27);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 6100L)
    public static SubLObject do_join_ordered_link_non_focal_proofs(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list27);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject bindings_var = NIL;
        SubLObject proof_var = NIL;
        SubLObject join_ordered_link = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list27);
        bindings_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list27);
        proof_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list27);
        join_ordered_link = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject body;
            current = (body = temp);
            SubLObject index = $sym34$INDEX;
            SubLObject proof_list_var = $sym35$PROOF_LIST_VAR;
            return list($sym30$CLET, list(list(index, list($sym36$JOIN_ORDERED_LINK_NON_FOCAL_PROOF_INDEX, join_ordered_link))), list($sym32$DO_DICTIONARY, list(bindings_var, proof_list_var, index), listS($sym33$DO_LIST, list(proof_var, proof_list_var), append(body, NIL))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list27);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 6500L)
    public static SubLObject do_join_ordered_link_restricted_non_focal_problems(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list37);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject restricted_non_focal_problem_var = NIL;
        SubLObject join_ordered_link = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list37);
        restricted_non_focal_problem_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list37);
        join_ordered_link = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list37);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list37);
            if (NIL == conses_high.member(current_$1, $list38, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list37);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject link_var = $sym41$LINK_VAR;
        SubLObject restriction_link = $sym42$RESTRICTION_LINK;
        return list($sym30$CLET, list(list(link_var, join_ordered_link)), list($sym43$DO_PROBLEM_ARGUMENT_LINKS, list(restriction_link, list($sym44$JOIN_ORDERED_LINK_NON_FOCAL_PROBLEM, link_var), $TYPE, $RESTRICTION, $DONE, done),
                list($sym47$PWHEN, list($sym48$NON_FOCAL_RESTRICTION_LINK_WITH_CORRESPONDING_FOCAL_PROOF_, restriction_link, link_var), listS($sym30$CLET, list(list(restricted_non_focal_problem_var, list($sym49$PROBLEM_LINK_SOLE_SUPPORTING_PROBLEM, restriction_link))), append(body, NIL)))));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 7100L)
    public static SubLObject do_virtual_dependent_join_ordered_links(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list50);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject join_ordered_link_var = NIL;
        SubLObject restricted_non_focal_problem = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list50);
        join_ordered_link_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list50);
        restricted_non_focal_problem = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list50);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list50);
            if (NIL == conses_high.member(current_$2, $list38, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list50);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject restriction_link = $sym51$RESTRICTION_LINK;
        SubLObject non_focal_problem = $sym52$NON_FOCAL_PROBLEM;
        return list($sym53$DO_PROBLEM_DEPENDENT_LINKS, list(restriction_link, restricted_non_focal_problem, $TYPE, $RESTRICTION, $DONE, done),
                list($sym30$CLET, list(list(non_focal_problem, list($sym54$PROBLEM_LINK_SUPPORTED_PROBLEM, restriction_link))), list($sym53$DO_PROBLEM_DEPENDENT_LINKS, list(join_ordered_link_var, non_focal_problem, $TYPE, $JOIN_ORDERED, $DONE, done),
                        list($sym47$PWHEN, list($sym55$JOIN_ORDERED_LINK_RESTRICTED_NON_FOCAL_LINK_, join_ordered_link_var, restriction_link), listS($sym47$PWHEN, list(EQ, non_focal_problem, list($sym44$JOIN_ORDERED_LINK_NON_FOCAL_PROBLEM, join_ordered_link_var)), append(body, NIL))))));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 8000L)
    public static SubLObject join_ordered_link_focal_proof_index(SubLObject join_ordered_link) {
        return jo_link_data_focal_proof_index(inference_datastructures_problem_link.problem_link_data(join_ordered_link));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 8200L)
    public static SubLObject join_ordered_link_non_focal_proof_index(SubLObject join_ordered_link) {
        return jo_link_data_non_focal_proof_index(inference_datastructures_problem_link.problem_link_data(join_ordered_link));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 8400L)
    public static SubLObject join_ordered_link_restricted_non_focal_link_index(SubLObject join_ordered_link) {
        return jo_link_data_restricted_non_focal_link_index(inference_datastructures_problem_link.problem_link_data(join_ordered_link));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 8600L)
    public static SubLObject join_ordered_link_triggered_restriction_link(SubLObject join_ordered_link, SubLObject proof) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(join_ordered_link_restricted_non_focal_link_index(join_ordered_link)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(
                iteration_state)) {
            thread.resetMultipleValues();
            SubLObject restriction_link = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            SubLObject candidate_proof = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (proof.eql(candidate_proof)) {
                return restriction_link;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 9100L)
    public static SubLObject join_ordered_link_triggered_restricted_non_focal(SubLObject join_ordered_link, SubLObject proof) {
        SubLObject triggered_restriction_link = join_ordered_link_triggered_restriction_link(join_ordered_link, proof);
        return (NIL != triggered_restriction_link) ? inference_datastructures_problem_link.problem_link_sole_supporting_problem(triggered_restriction_link) : NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 9500L)
    public static SubLObject join_ordered_link_restricted_non_focal_links(SubLObject join_ordered_link) {
        return dictionary_contents.dictionary_contents_keys(join_ordered_link_restricted_non_focal_link_index(join_ordered_link));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 9700L)
    public static SubLObject join_ordered_link_restricted_non_focal_triggering_proof(SubLObject join_ordered_link, SubLObject restriction_link) {
        SubLObject dict_contents = join_ordered_link_restricted_non_focal_link_index(join_ordered_link);
        SubLObject proof = dictionary_contents.dictionary_contents_lookup_without_values(dict_contents, restriction_link, Symbols.symbol_function(EQ), UNPROVIDED);
        if (NIL != inference_datastructures_proof.valid_proof_p(proof)) {
            return proof;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 10200L)
    public static SubLObject join_ordered_link_focal_mapped_problem(SubLObject join_ordered_link) {
        return conses_high.last(inference_datastructures_problem_link.problem_link_supporting_mapped_problems(join_ordered_link), UNPROVIDED).first();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 10400L)
    public static SubLObject join_ordered_link_has_non_focal_mapped_problemP(SubLObject join_ordered_link) {
        return list_utilities.doubletonP(inference_datastructures_problem_link.problem_link_supporting_mapped_problems(join_ordered_link));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 10500L)
    public static SubLObject join_ordered_link_non_focal_mapped_problem(SubLObject join_ordered_link) {
        if (NIL != join_ordered_link_non_focal_manifestedP(join_ordered_link)) {
            return inference_datastructures_problem_link.problem_link_supporting_mapped_problems(join_ordered_link).first();
        }
        return lazily_create_join_ordered_link_non_focal_mapped_problem(join_ordered_link);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 10800L)
    public static SubLObject join_ordered_link_non_focal_manifestedP(SubLObject join_ordered_link) {
        return list_utilities.doubletonP(inference_datastructures_problem_link.problem_link_supporting_mapped_problems(join_ordered_link));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 11000L)
    public static SubLObject join_ordered_link_focal_problem(SubLObject join_ordered_link) {
        return inference_datastructures_problem_link.mapped_problem_problem(join_ordered_link_focal_mapped_problem(join_ordered_link));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 11200L)
    public static SubLObject join_ordered_link_non_focal_problem(SubLObject join_ordered_link) {
        return inference_datastructures_problem_link.mapped_problem_problem(join_ordered_link_non_focal_mapped_problem(join_ordered_link));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 11300L)
    public static SubLObject join_ordered_link_other_mapped_problem(SubLObject join_ordered_link, SubLObject wrong_mapped_problem) {
        SubLObject other_mapped_problem = inference_datastructures_problem_link.problem_link_supporting_mapped_problem_that_isnt(join_ordered_link, wrong_mapped_problem);
        return (NIL != other_mapped_problem) ? other_mapped_problem : lazily_create_join_ordered_link_non_focal_mapped_problem(join_ordered_link);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 11800L)
    public static SubLObject join_ordered_link_focal_proofs_lookup(SubLObject join_ordered_link, SubLObject proof_bindings) {
        SubLObject index = join_ordered_link_focal_proof_index(join_ordered_link);
        SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(proof_bindings);
        SubLObject focal_proofs = dictionary.dictionary_lookup_without_values(index, canonical_proof_bindings, UNPROVIDED);
        return focal_proofs;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 12200L)
    public static SubLObject join_ordered_link_non_focal_proofs_lookup(SubLObject join_ordered_link, SubLObject proof_bindings) {
        SubLObject index = join_ordered_link_non_focal_proof_index(join_ordered_link);
        SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(proof_bindings);
        SubLObject non_focal_proofs = dictionary.dictionary_lookup_without_values(index, canonical_proof_bindings, UNPROVIDED);
        return non_focal_proofs;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 12500L)
    public static SubLObject join_ordered_link_tactic(SubLObject join_ordered_link) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(supported_problem);
        SubLObject join_ordered_tactic = NIL;
        join_ordered_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match(join_ordered_tactic, $join_ordered_module$.getDynamicValue(thread)) && join_ordered_link.eql(join_ordered_tactic_link(join_ordered_tactic))) {
                return join_ordered_tactic;
            }
            cdolist_list_var = cdolist_list_var.rest();
            join_ordered_tactic = cdolist_list_var.first();
        }
        if (NIL == inference_datastructures_problem.tactically_unexamined_problem_p(supported_problem)) {
            return Errors.error($str58$Could_not_find_the_tactic_for__a, join_ordered_link);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 13100L)
    public static SubLObject join_ordered_link_restricted_non_focal_linkP(SubLObject join_ordered_link, SubLObject restriction_link) {
        return list_utilities.sublisp_boolean(dictionary_contents.dictionary_contents_lookup_without_values(join_ordered_link_restricted_non_focal_link_index(join_ordered_link), restriction_link, Symbols.symbol_function(EQ), NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 13600L)
    public static SubLObject join_ordered_link_restricted_non_focal_count(SubLObject join_ordered_link) {
        return dictionary_contents.dictionary_contents_size(join_ordered_link_restricted_non_focal_link_index(join_ordered_link));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 14000L)
    public static SubLObject add_join_ordered_link_focal_proof(SubLObject join_ordered_link, SubLObject v_bindings, SubLObject proof) {
        assert NIL != join_ordered_link_p(join_ordered_link) : join_ordered_link;
        assert NIL != inference_datastructures_proof.proof_p(proof) : proof;
        SubLObject index = join_ordered_link_focal_proof_index(join_ordered_link);
        SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
        dictionary_utilities.dictionary_pushnew(index, canonical_bindings, proof, Symbols.symbol_function(EQ), UNPROVIDED);
        return join_ordered_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 14600L)
    public static SubLObject remove_join_ordered_link_focal_proof(SubLObject join_ordered_link, SubLObject v_bindings, SubLObject proof) {
        assert NIL != join_ordered_link_p(join_ordered_link) : join_ordered_link;
        assert NIL != inference_datastructures_proof.proof_p(proof) : proof;
        SubLObject index = join_ordered_link_focal_proof_index(join_ordered_link);
        SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
        dictionary_utilities.dictionary_delete_from_value(index, canonical_bindings, proof, UNPROVIDED, UNPROVIDED);
        return join_ordered_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 15100L)
    public static SubLObject add_join_ordered_link_non_focal_proof(SubLObject join_ordered_link, SubLObject v_bindings, SubLObject proof) {
        assert NIL != join_ordered_link_p(join_ordered_link) : join_ordered_link;
        assert NIL != inference_datastructures_proof.proof_p(proof) : proof;
        SubLObject index = join_ordered_link_non_focal_proof_index(join_ordered_link);
        SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
        dictionary_utilities.dictionary_pushnew(index, canonical_bindings, proof, Symbols.symbol_function(EQ), UNPROVIDED);
        return join_ordered_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 15700L)
    public static SubLObject remove_join_ordered_link_non_focal_proof(SubLObject join_ordered_link, SubLObject v_bindings, SubLObject proof) {
        assert NIL != join_ordered_link_p(join_ordered_link) : join_ordered_link;
        assert NIL != inference_datastructures_proof.proof_p(proof) : proof;
        SubLObject index = join_ordered_link_non_focal_proof_index(join_ordered_link);
        SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
        dictionary_utilities.dictionary_delete_from_value(index, canonical_bindings, proof, UNPROVIDED, UNPROVIDED);
        return join_ordered_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 16200L)
    public static SubLObject add_join_ordered_link_restricted_non_focal_link(SubLObject join_ordered_link, SubLObject restriction_link, SubLObject trigger_proof) {
        assert NIL != join_ordered_link_p(join_ordered_link) : join_ordered_link;
        assert NIL != inference_worker_restriction.restriction_link_p(restriction_link) : restriction_link;
        assert NIL != inference_datastructures_proof.proof_p(trigger_proof) : trigger_proof;
        SubLObject dict_contents = join_ordered_link_restricted_non_focal_link_index(join_ordered_link);
        dict_contents = dictionary_contents.dictionary_contents_enter(dict_contents, restriction_link, trigger_proof, Symbols.symbol_function(EQ));
        _csetf_jo_link_data_restricted_non_focal_link_index(inference_datastructures_problem_link.problem_link_data(join_ordered_link), dict_contents);
        return join_ordered_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 16800L)
    public static SubLObject remove_join_ordered_link_restricted_non_focal_link(SubLObject join_ordered_link, SubLObject restriction_link) {
        assert NIL != join_ordered_link_p(join_ordered_link) : join_ordered_link;
        SubLObject dict_contents = join_ordered_link_restricted_non_focal_link_index(join_ordered_link);
        dict_contents = dictionary_contents.dictionary_contents_delete(dict_contents, restriction_link, Symbols.symbol_function(EQ));
        _csetf_jo_link_data_restricted_non_focal_link_index(inference_datastructures_problem_link.problem_link_data(join_ordered_link), dict_contents);
        return join_ordered_link;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 17400L)
    public static SubLObject join_ordered_link_focal_supporting_problem_spec(SubLObject join_ordered_link) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(supported_problem);
        SubLObject join_ordered_tactic = NIL;
        join_ordered_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match(join_ordered_tactic, $join_ordered_module$.getDynamicValue(thread)) && join_ordered_link.eql(join_ordered_tactic_link(join_ordered_tactic))) {
                return join_ordered_tactic_focal_supporting_problem_spec(join_ordered_tactic);
            }
            cdolist_list_var = cdolist_list_var.rest();
            join_ordered_tactic = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 18100L)
    public static SubLObject join_ordered_link_non_focal_supporting_problem_spec(SubLObject join_ordered_link) {
        SubLObject focal_spec = join_ordered_link_focal_supporting_problem_spec(join_ordered_link);
        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link);
        SubLObject supported_clause = inference_datastructures_problem.problem_sole_clause(supported_problem);
        SubLObject non_focal_spec = clause_utilities.new_complement_subclause_spec(focal_spec, supported_clause);
        return non_focal_spec;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 18800L)
    public static SubLObject join_ordered_tactic_p(SubLObject v_object) {
        SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(NIL != inference_datastructures_tactic.tactic_p(v_object) && $join_ordered_module$.getDynamicValue(thread).eql(inference_datastructures_tactic.tactic_hl_module(v_object)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 19000L)
    public static SubLObject single_focal_literal_join_ordered_tactic_p(SubLObject join_ordered_tactic) {
        return makeBoolean(NIL != join_ordered_tactic_p(join_ordered_tactic) && NIL != clause_utilities.single_literal_subclause_specP(join_ordered_tactic_focal_supporting_problem_spec(join_ordered_tactic)));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 19200L)
    public static SubLObject new_join_ordered_tactic(SubLObject jo_link, SubLObject focal_supporting_problem_spec) {
        SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != join_ordered_link_p(jo_link) : jo_link;
        SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(jo_link);
        SubLObject data = list(jo_link, focal_supporting_problem_spec);
        SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, $join_ordered_module$.getDynamicValue(thread), data);
        SubLObject prob = problem;
        SubLObject store = inference_datastructures_problem.problem_store(prob);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$3 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$3, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$3);
                SubLObject backwardP_var = NIL;
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
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                    state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                    inference_tactician.strategy_note_new_tactic(strategy, tactic);
                                }
                            }
                        }
                    }
                }
            }
            SubLObject idx_$4 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$4)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$4);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference2)) {
                            SubLObject inference_var2 = inference2;
                            SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                    state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                    inference_tactician.strategy_note_new_tactic(strategy2, tactic);
                                }
                            }
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 19900L)
    public static SubLObject join_ordered_tactic_link(SubLObject join_ordered_tactic) {
        return inference_datastructures_tactic.tactic_data(join_ordered_tactic).first();
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 20200L)
    public static SubLObject join_ordered_tactic_focal_supporting_problem_spec(SubLObject join_ordered_tactic) {
        return conses_high.second(inference_datastructures_tactic.tactic_data(join_ordered_tactic));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 20300L)
    public static SubLObject join_ordered_tactic_subsumesP(SubLObject subsuming_tactic, SubLObject subsumed_tactic) {
        return makeBoolean(subsuming_tactic.eql(subsumed_tactic) || (inference_datastructures_tactic.tactic_problem(subsuming_tactic).eql(inference_datastructures_tactic.tactic_problem(subsumed_tactic))
                && NIL != clause_utilities.subclause_spec_subsumesP(join_ordered_tactic_focal_supporting_problem_spec(subsuming_tactic), join_ordered_tactic_focal_supporting_problem_spec(subsumed_tactic))));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 20900L)
    public static SubLObject find_or_create_join_ordered_tactic_focal_mapped_problem(SubLObject tactic) {
        SubLObject jo_link = join_ordered_tactic_link(tactic);
        if (NIL != jo_link) {
            return join_ordered_link_focal_mapped_problem(jo_link);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 21200L)
    public static SubLObject find_or_create_join_ordered_tactic_non_focal_mapped_problem(SubLObject tactic) {
        SubLObject jo_link = join_ordered_tactic_link(tactic);
        if (NIL != jo_link) {
            return join_ordered_link_non_focal_mapped_problem(jo_link);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 21500L)
    public static SubLObject join_ordered_tactic_focal_problem(SubLObject join_ordered_tactic) {
        SubLObject link = join_ordered_tactic_link(join_ordered_tactic);
        SubLObject problem = (NIL != link) ? join_ordered_link_focal_problem(link) : NIL;
        return problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 21800L)
    public static SubLObject determine_new_join_ordered_tactics(SubLObject supported_problem, SubLObject dnf_clause) {
        determine_new_single_literal_join_ordered_tactics(supported_problem, dnf_clause);
        SubLObject multi_literal_subclause_specs = NIL;
        SubLObject cdolist_list_var = motivated_followup_multi_literal_subclause_specs_case_1(supported_problem, dnf_clause);
        SubLObject subclause_spec = NIL;
        subclause_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject item_var = subclause_spec;
            if (NIL == conses_high.member(item_var, multi_literal_subclause_specs, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                multi_literal_subclause_specs = cons(item_var, multi_literal_subclause_specs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subclause_spec = cdolist_list_var.first();
        }
        cdolist_list_var = motivated_followup_multi_literal_subclause_specs_case_2(supported_problem, dnf_clause);
        subclause_spec = NIL;
        subclause_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject item_var = subclause_spec;
            if (NIL == conses_high.member(item_var, multi_literal_subclause_specs, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                multi_literal_subclause_specs = cons(item_var, multi_literal_subclause_specs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subclause_spec = cdolist_list_var.first();
        }
        if (NIL == problem_has_a_candidate_early_removal_tacticP(supported_problem)) {
            cdolist_list_var = inference_worker_removal.motivated_multi_literal_subclause_specs(dnf_clause);
            subclause_spec = NIL;
            subclause_spec = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject item_var = subclause_spec;
                if (NIL == conses_high.member(item_var, multi_literal_subclause_specs, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY))) {
                    multi_literal_subclause_specs = cons(item_var, multi_literal_subclause_specs);
                }
                cdolist_list_var = cdolist_list_var.rest();
                subclause_spec = cdolist_list_var.first();
            }
        }
        cdolist_list_var = Sequences.nreverse(multi_literal_subclause_specs);
        subclause_spec = NIL;
        subclause_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            determine_new_join_ordered_tactic(supported_problem, subclause_spec, dnf_clause);
            cdolist_list_var = cdolist_list_var.rest();
            subclause_spec = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 23100L)
    public static SubLObject problem_has_a_candidate_early_removal_tacticP(SubLObject problem) {
        assert NIL != inference_datastructures_problem.problem_p(problem) : problem;
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(problem);
        SubLObject tactic = NIL;
        tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != inference_datastructures_problem.do_problem_tactics_type_match(tactic, $JOIN_ORDERED) && NIL != inference_tactician.candidate_early_removal_tacticP(tactic)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 23400L)
    public static SubLObject determine_new_single_literal_join_ordered_tactics(SubLObject supported_problem, SubLObject dnf_clause) {
        SubLObject some_backchain_requiredP = inference_trampolines.inference_some_backchain_required_asent_in_clauseP(dnf_clause);
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(dnf_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject sense = $NEG;
            if (NIL == some_backchain_requiredP || NIL != inference_trampolines.inference_backchain_required_contextualized_asentP(contextualized_asent) || NIL != potentially_simplifying_asentP(inference_datastructures_problem_query.contextualized_asent_asent(contextualized_asent))) {
                determine_new_single_literal_join_ordered_tactic(supported_problem, dnf_clause, sense, index);
            }
            index = Numbers.add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        index = ZERO_INTEGER;
        cdolist_list_var = clauses.pos_lits(dnf_clause);
        contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject sense = $POS;
            if (NIL == some_backchain_requiredP || NIL != inference_trampolines.inference_backchain_required_contextualized_asentP(contextualized_asent) || NIL != potentially_simplifying_asentP(inference_datastructures_problem_query.contextualized_asent_asent(contextualized_asent))) {
                determine_new_single_literal_join_ordered_tactic(supported_problem, dnf_clause, sense, index);
            }
            index = Numbers.add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 24200L)
    public static SubLObject potentially_simplifying_asentP(SubLObject asent) {
        return el_utilities.potentially_solvable_evaluate_asentP(asent);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 24600L)
    public static SubLObject determine_new_single_literal_join_ordered_tactic(SubLObject supported_problem, SubLObject dnf_clause, SubLObject sense, SubLObject index) {
        SubLObject focal_supporting_problem_spec = clause_utilities.new_single_literal_subclause_spec(sense, index);
        return determine_new_join_ordered_tactic(supported_problem, focal_supporting_problem_spec, dnf_clause);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 24900L)
    public static SubLObject motivated_followup_multi_literal_subclause_specs_case_1(SubLObject supported_problem, SubLObject dnf_clause) {
        SubLObject subclause_specs = NIL;
        if (NIL != problem_store_followup_query_problem_p(supported_problem)) {
            SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
            SubLObject set_var = inference_datastructures_problem_store.problem_store_historical_root_problems(store);
            SubLObject set_contents_var = set.do_set_internal(set_var);
            SubLObject basis_object;
            SubLObject state;
            SubLObject other_root_problem;
            SubLObject other_dnf_clause;
            SubLObject cdolist_list_var;
            SubLObject subclause_spec;
            SubLObject subclause;
            SubLObject item_var;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                other_root_problem = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, other_root_problem) && !other_root_problem.eql(supported_problem) && NIL != inference_datastructures_problem.multi_literal_problem_p(other_root_problem)) {
                    other_dnf_clause = inference_datastructures_problem.problem_sole_clause(other_root_problem);
                    cdolist_list_var = matching_subclause_specs(dnf_clause, other_dnf_clause);
                    subclause_spec = NIL;
                    subclause_spec = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        subclause = clause_utilities.subclause_specified_by_spec(dnf_clause, subclause_spec);
                        if (NIL != inference_worker_split.all_literals_connected_by_shared_varsP(subclause)) {
                            item_var = subclause_spec;
                            if (NIL == conses_high.member(item_var, subclause_specs, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY))) {
                                subclause_specs = cons(item_var, subclause_specs);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        subclause_spec = cdolist_list_var.first();
                    }
                }
            }
        }
        return subclause_specs;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 26100L)
    public static SubLObject problem_store_followup_query_problem_p(SubLObject supported_problem) {
        return makeBoolean(NIL != inference_datastructures_problem.problem_p(supported_problem) && inference_datastructures_problem_store.problem_store_historical_root_problem_count(inference_datastructures_problem.problem_store(supported_problem)).numGE(TWO_INTEGER)
                && NIL != inference_datastructures_problem.problem_has_dependent_link_of_typeP(supported_problem, $ANSWER));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 26600L)
    public static SubLObject motivated_followup_multi_literal_subclause_specs_case_2(SubLObject supported_problem, SubLObject dnf_clause) {
        SubLObject subclause_specs = NIL;
        if (NIL == inference_trampolines.inference_some_backchain_required_asent_in_clauseP(dnf_clause) && NIL != inference_datastructures_problem.problem_has_dependent_link_of_typeP(supported_problem, $UNION)) {
            SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject union_link;
            SubLObject disjunction_problem;
            SubLObject set_contents_var_$5;
            SubLObject basis_object_$6;
            SubLObject state_$7;
            SubLObject sibling_union_link;
            SubLObject sibling_problem;
            SubLObject other_dnf_clause;
            SubLObject cdolist_list_var;
            SubLObject subclause_spec;
            SubLObject subclause;
            SubLObject item_var;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                union_link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, union_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(union_link, $UNION)) {
                    disjunction_problem = inference_datastructures_problem_link.problem_link_supported_problem(union_link);
                    set_contents_var_$5 = inference_datastructures_problem.problem_argument_links(disjunction_problem);
                    for (basis_object_$6 = set_contents.do_set_contents_basis_object(set_contents_var_$5), state_$7 = NIL, state_$7 = set_contents.do_set_contents_initial_state(basis_object_$6, set_contents_var_$5); NIL == set_contents.do_set_contents_doneP(basis_object_$6,
                            state_$7); state_$7 = set_contents.do_set_contents_update_state(state_$7)) {
                        sibling_union_link = set_contents.do_set_contents_next(basis_object_$6, state_$7);
                        if (NIL != set_contents.do_set_contents_element_validP(state_$7, sibling_union_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(sibling_union_link, $UNION) && !sibling_union_link.eql(union_link)) {
                            sibling_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(sibling_union_link);
                            if (!sibling_problem.eql(supported_problem) && NIL != inference_datastructures_problem.multi_literal_problem_p(sibling_problem)) {
                                other_dnf_clause = inference_datastructures_problem.problem_sole_clause(sibling_problem);
                                cdolist_list_var = sub_matching_subclause_specs(dnf_clause, other_dnf_clause);
                                subclause_spec = NIL;
                                subclause_spec = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    subclause = clause_utilities.subclause_specified_by_spec(dnf_clause, subclause_spec);
                                    if (NIL != inference_worker_split.all_literals_connected_by_shared_varsP(subclause)) {
                                        item_var = subclause_spec;
                                        if (NIL == conses_high.member(item_var, subclause_specs, Symbols.symbol_function(EQUAL), Symbols.symbol_function(IDENTITY))) {
                                            subclause_specs = cons(item_var, subclause_specs);
                                        }
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    subclause_spec = cdolist_list_var.first();
                                }
                            }
                        }
                    }
                }
            }
        }
        return subclause_specs;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 28200L)
    public static SubLObject matching_subclause_specs(SubLObject dnf_clause, SubLObject other_dnf_clause) {
        SubLObject subclause_specs = NIL;
        SubLObject pos_lits = clauses.pos_lits(dnf_clause);
        SubLObject neg_lits = clauses.neg_lits(dnf_clause);
        SubLObject other_pos_lits = clauses.pos_lits(other_dnf_clause);
        SubLObject other_neg_lits = clauses.neg_lits(other_dnf_clause);
        if (NIL != list_utilities.greater_or_same_length_p(pos_lits, other_pos_lits) && NIL != list_utilities.greater_or_same_length_p(neg_lits, other_neg_lits)
                && (NIL != list_utilities.greater_length_p(pos_lits, other_pos_lits) || NIL != list_utilities.greater_length_p(neg_lits, other_neg_lits))) {
            SubLObject pos_dict = matching_subclause_index_dictionary(pos_lits, other_pos_lits);
            if (NIL != pos_dict) {
                SubLObject neg_dict = matching_subclause_index_dictionary(neg_lits, other_neg_lits);
                if (NIL != neg_dict) {
                    SubLObject positive_indices_list = matching_subclause_index_dictionary_to_indices_list(pos_dict);
                    SubLObject negative_indices_list = matching_subclause_index_dictionary_to_indices_list(neg_dict);
                    SubLObject cdolist_list_var = positive_indices_list;
                    SubLObject positive_indices = NIL;
                    positive_indices = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$8 = negative_indices_list;
                        SubLObject negative_indices = NIL;
                        negative_indices = cdolist_list_var_$8.first();
                        while (NIL != cdolist_list_var_$8) {
                            SubLObject candidate_subclause_spec = clause_utilities.new_subclause_spec(negative_indices, positive_indices);
                            SubLObject candidate_subclause = clause_utilities.subclause_specified_by_spec(dnf_clause, candidate_subclause_spec);
                            if (NIL != unification.unify(candidate_subclause, other_dnf_clause, UNPROVIDED, UNPROVIDED)) {
                                subclause_specs = cons(candidate_subclause_spec, subclause_specs);
                            }
                            cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                            negative_indices = cdolist_list_var_$8.first();
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        positive_indices = cdolist_list_var.first();
                    }
                }
            }
        }
        return subclause_specs;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 29700L)
    public static SubLObject matching_subclause_index_dictionary(SubLObject lits, SubLObject other_lits) {
        SubLObject dict = dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED);
        SubLObject impossibleP = NIL;
        SubLObject list_var = NIL;
        SubLObject other_lit = NIL;
        SubLObject i = NIL;
        list_var = other_lits;
        other_lit = list_var.first();
        for (i = ZERO_INTEGER; NIL == impossibleP && NIL != list_var; list_var = list_var.rest(), other_lit = list_var.first(), i = Numbers.add(ONE_INTEGER, i)) {
            SubLObject list_var_$9 = NIL;
            SubLObject lit = NIL;
            SubLObject j = NIL;
            list_var_$9 = lits;
            lit = list_var_$9.first();
            for (j = ZERO_INTEGER; NIL != list_var_$9; list_var_$9 = list_var_$9.rest(), lit = list_var_$9.first(), j = Numbers.add(ONE_INTEGER, j)) {
                if (NIL != unification.unify_possible(other_lit, lit)) {
                    dictionary_utilities.dictionary_push(dict, i, j);
                }
            }
            if (NIL == dictionary.dictionary_lookup(dict, i, UNPROVIDED)) {
                impossibleP = T;
            }
        }
        if (NIL != impossibleP) {
            return NIL;
        }
        return dict;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 30600L)
    public static SubLObject matching_subclause_index_dictionary_to_indices_list(SubLObject dict) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject indices_accum = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            SubLObject indices = thread.secondMultipleValue();
            thread.resetMultipleValues();
            indices_accum = cons(indices, indices_accum);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        if (NIL != subl_promotions.positive_integer_p($max_subclause_spec_cartesian_product_cardinality$.getDynamicValue(thread))) {
            SubLObject cartesian_product_cardinality = list_utilities.cartesian_product_cardinality(indices_accum);
            if ($max_subclause_spec_cartesian_product_cardinality$.getDynamicValue(thread).numL(list_utilities.cartesian_product_cardinality(indices_accum))) {
                Errors.warn($str69$Too_many_possible_matches_to_chec, cartesian_product_cardinality, inference_worker.currently_active_problem());
                return NIL;
            }
        }
        return Sequences.delete_if($sym70$DUPLICATES_, list_utilities.cartesian_product(indices_accum, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 31400L)
    public static SubLObject sub_matching_subclause_specs(SubLObject dnf_clause, SubLObject other_dnf_clause) {
        SubLObject pos_lit_spec = NIL;
        SubLObject neg_lit_spec = NIL;
        SubLObject subclause_specs = NIL;
        SubLObject pos_lits = clauses.pos_lits(dnf_clause);
        SubLObject other_pos_lits = clauses.pos_lits(other_dnf_clause);
        SubLObject list_var = NIL;
        SubLObject pos_lit = NIL;
        SubLObject index = NIL;
        list_var = pos_lits;
        pos_lit = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), pos_lit = list_var.first(), index = Numbers.add(ONE_INTEGER, index)) {
            SubLObject unifiesP = NIL;
            if (NIL == unifiesP) {
                SubLObject csome_list_var = other_pos_lits;
                SubLObject other_pos_lit = NIL;
                other_pos_lit = csome_list_var.first();
                while (NIL == unifiesP && NIL != csome_list_var) {
                    if (NIL != unification.unify(pos_lit, other_pos_lit, UNPROVIDED, UNPROVIDED)) {
                        pos_lit_spec = cons(index, pos_lit_spec);
                        unifiesP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    other_pos_lit = csome_list_var.first();
                }
            }
        }
        SubLObject neg_lits = clauses.neg_lits(dnf_clause);
        SubLObject other_neg_lits = clauses.neg_lits(other_dnf_clause);
        list_var = NIL;
        SubLObject neg_lit = NIL;
        index = NIL;
        list_var = neg_lits;
        neg_lit = list_var.first();
        for (index = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), neg_lit = list_var.first(), index = Numbers.add(ONE_INTEGER, index)) {
            SubLObject unifiesP = NIL;
            if (NIL == unifiesP) {
                SubLObject csome_list_var = other_neg_lits;
                SubLObject other_neg_lit = NIL;
                other_neg_lit = csome_list_var.first();
                while (NIL == unifiesP && NIL != csome_list_var) {
                    if (NIL != unification.unify(neg_lit, other_neg_lit, UNPROVIDED, UNPROVIDED)) {
                        neg_lit_spec = cons(index, neg_lit_spec);
                        unifiesP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    other_neg_lit = csome_list_var.first();
                }
            }
        }
        if (Numbers.add(Sequences.length(pos_lit_spec), Sequences.length(neg_lit_spec)).numG(ONE_INTEGER)) {
            SubLObject subclause_spec = clause_utilities.new_subclause_spec(neg_lit_spec, pos_lit_spec);
            if (NIL == clause_utilities.total_subclause_specP(subclause_spec, dnf_clause)) {
                subclause_specs = cons(subclause_spec, subclause_specs);
            }
        }
        return subclause_specs;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 32700L)
    public static SubLObject determine_new_join_ordered_tactic(SubLObject supported_problem, SubLObject focal_supporting_problem_spec, SubLObject dnf_clause) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
        SubLObject focal_free_hl_vars = compute_join_ordered_problem_subclause_free_vars(supported_problem, focal_supporting_problem_spec, dnf_clause, T);
        SubLObject focal_mapped_problem = find_or_create_join_ordered_focal_mapped_problem(store, dnf_clause, focal_supporting_problem_spec, focal_free_hl_vars);
        SubLObject non_focal_mapped_problem = NIL;
        thread.resetMultipleValues();
        SubLObject jo_link = maybe_new_join_ordered_link(supported_problem, focal_mapped_problem, non_focal_mapped_problem);
        SubLObject jo_link_newP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        new_join_ordered_tactic(jo_link, focal_supporting_problem_spec);
        if (NIL != jo_link_newP) {
            inference_worker.propagate_problem_link(jo_link);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 33600L)
    public static SubLObject find_or_create_join_ordered_focal_mapped_problem(SubLObject store, SubLObject dnf_clause, SubLObject focal_supporting_problem_spec, SubLObject free_hl_vars) {
        return inference_worker.find_or_create_problem_from_subclause_spec(store, dnf_clause, focal_supporting_problem_spec, free_hl_vars);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 33800L)
    public static SubLObject find_or_create_join_ordered_non_focal_mapped_problem(SubLObject store, SubLObject dnf_clause, SubLObject focal_supporting_problem_spec, SubLObject free_hl_vars) {
        return inference_worker.find_or_create_problem_without_subclause_spec(store, dnf_clause, focal_supporting_problem_spec, free_hl_vars);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 34100L)
    public static SubLObject lazily_create_join_ordered_link_non_focal_mapped_problem(SubLObject join_ordered_link) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == inference_datastructures_problem_store.$problem_store_modification_permittedP$.getDynamicValue(thread)) {
            return NIL;
        }
        SubLObject focal_openP = inference_datastructures_problem_link.problem_link_sole_supporting_mapped_problem_openP(join_ordered_link);
        SubLObject store = inference_datastructures_problem_link.problem_link_store(join_ordered_link);
        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link);
        SubLObject supported_clause = inference_datastructures_problem.problem_sole_clause(supported_problem);
        SubLObject focal_mapped_problem = join_ordered_link_focal_mapped_problem(join_ordered_link);
        SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem);
        SubLObject focal_clause = inference_datastructures_problem.problem_sole_clause(focal_problem);
        SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
        SubLObject focal_clause_wrt_supported = bindings.apply_bindings(focal_variable_map, focal_clause);
        SubLObject focal_supporting_problem_spec = clause_utilities.subclause_spec_from_clauses(supported_clause, focal_clause_wrt_supported);
        SubLObject non_focal_free_hl_vars = compute_join_ordered_problem_subclause_free_vars(supported_problem, focal_supporting_problem_spec, supported_clause, NIL);
        SubLObject non_focal_supporting_mapped_problem = find_or_create_join_ordered_non_focal_mapped_problem(store, supported_clause, focal_supporting_problem_spec, non_focal_free_hl_vars);
        inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(non_focal_supporting_mapped_problem, join_ordered_link);
        if (NIL != focal_openP) {
            inference_datastructures_problem_link.problem_link_close_all(join_ordered_link);
            inference_datastructures_problem_link.problem_link_open_supporting_mapped_problem(join_ordered_link, focal_mapped_problem);
        }
        inference_worker.propagate_problem_link(join_ordered_link);
        return non_focal_supporting_mapped_problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 36300L)
    public static SubLObject compute_join_ordered_problem_subclause_free_vars(SubLObject supported_problem, SubLObject focal_supporting_problem_spec, SubLObject dnf_clause, SubLObject focalP) {
        SubLObject supported_problem_free_hl_vars = inference_datastructures_problem.problem_free_hl_vars(supported_problem);
        SubLObject focal_subclause = clause_utilities.subclause_specified_by_spec(dnf_clause, focal_supporting_problem_spec);
        SubLObject non_focal_subclause = clause_utilities.complement_of_subclause_specified_by_spec(dnf_clause, focal_supporting_problem_spec);
        SubLObject focal_vars = cycl_utilities.expression_gather(focal_subclause, $sym71$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject non_focal_vars = cycl_utilities.expression_gather(non_focal_subclause, $sym71$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return variables.sort_hl_variable_list_memoized(
                conses_high.intersection((NIL != focalP) ? focal_vars : non_focal_vars, conses_high.union(supported_problem_free_hl_vars, conses_high.intersection(focal_vars, non_focal_vars, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 37000L)
    public static SubLObject compute_strategic_properties_of_join_ordered_tactic(SubLObject tactic, SubLObject strategy) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject _prev_bind_0 = inference_worker.$currently_considered_tactic$.currentBinding(thread);
        try {
            inference_worker.$currently_considered_tactic$.bind(tactic, thread);
            SubLObject jo_link = join_ordered_tactic_link(tactic);
            if (NIL == preference_modules.preference_level_p(inference_datastructures_tactic.tactic_preference_level(tactic))) {
                thread.resetMultipleValues();
                SubLObject join_ordered_preference_level = compute_join_ordered_tactic_preference_level(jo_link, $TACTICAL);
                SubLObject preference_level_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                inference_datastructures_tactic.set_tactic_preference_level(tactic, join_ordered_preference_level, preference_level_justification);
                if ($DOOMED == join_ordered_preference_level) {
                    inference_worker.note_tactic_doomed(tactic, $TACTICAL);
                }
            }
            thread.resetMultipleValues();
            SubLObject preference_level = compute_join_ordered_tactic_preference_level(jo_link, strategy);
            SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            inference_datastructures_strategy.set_tactic_strategic_preference_level(tactic, strategy, preference_level, justification);
            if ($DOOMED == preference_level) {
                inference_worker.note_tactic_doomed(tactic, strategy);
            }
            SubLObject productivity = compute_join_ordered_tactic_productivity(jo_link, strategy);
            inference_datastructures_strategy.set_tactic_strategic_productivity(tactic, strategy, productivity);
        } finally {
            inference_worker.$currently_considered_tactic$.rebind(_prev_bind_0, thread);
        }
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 38200L)
    public static SubLObject compute_join_ordered_tactic_productivity(SubLObject jo_link, SubLObject strategy) {
        assert NIL != join_ordered_link_p(jo_link) : jo_link;
        assert NIL != inference_datastructures_strategy.strategy_p(strategy) : strategy;
        return inference_lookahead_productivity.memoized_problem_max_removal_productivity(join_ordered_link_focal_problem(jo_link), strategy);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 38500L)
    public static SubLObject compute_join_ordered_tactic_preference_level(SubLObject jo_link, SubLObject strategic_context) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject focal_problem = join_ordered_link_focal_problem(jo_link);
        SubLObject shared_variables = focal_vars_shared_by_non_focal(jo_link);
        thread.resetMultipleValues();
        SubLObject join_ordered_preference_level = inference_tactician_utilities.memoized_problem_global_preference_level(focal_problem, strategic_context, shared_variables);
        SubLObject preference_level_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return subl_promotions.values2(join_ordered_preference_level, preference_level_justification);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 39200L)
    public static SubLObject execute_join_ordered_tactic(SubLObject tactic) {
        SubLObject focal_mapped_problem = find_or_create_join_ordered_tactic_focal_mapped_problem(tactic);
        SubLObject join_ordered_link = join_ordered_tactic_link(tactic);
        inference_worker.problem_link_open_and_repropagate_supporting_mapped_problem(join_ordered_link, focal_mapped_problem);
        inference_worker_residual_transformation.maybe_possibly_add_residual_transformation_links_via_join_ordered_link(join_ordered_link);
        if (NIL != inference_tactician_strategic_uninterestingness.tactic_preferredP(tactic, $TACTICAL)
                && (NIL == inference_tactician.better_term_chosen_handlingP() || NIL == inference_datastructures_problem_store.problem_store_transformation_allowedP(inference_datastructures_tactic.tactic_store(tactic)))) {
            inference_worker.possibly_discard_all_other_possible_structural_conjunctive_tactics(tactic);
        }
        consider_strategic_ramifications_of_tactic_preference_level(tactic);
        return tactic;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 40200L)
    public static SubLObject consider_strategic_ramifications_of_tactic_preference_level(SubLObject tactic) {
        SubLObject prob;
        SubLObject problem = prob = inference_datastructures_tactic.tactic_problem(tactic);
        SubLObject store = inference_datastructures_problem.problem_store(prob);
        SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
        if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
            SubLObject idx_$10 = idx;
            if (NIL == id_index.id_index_dense_objects_empty_p(idx_$10, $SKIP)) {
                SubLObject vector_var = id_index.id_index_dense_objects(idx_$10);
                SubLObject backwardP_var = NIL;
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
                for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                    id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                    inference = Vectors.aref(vector_var, id);
                    if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                        if (NIL != id_index.id_index_tombstone_p(inference)) {
                            inference = $SKIP;
                        }
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                            inference_var = inference;
                            set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                            set_contents_var = set.do_set_internal(set_var);
                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                    state); state = set_contents.do_set_contents_update_state(state)) {
                                strategy = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, strategy) && NIL != inference_datastructures_strategy.tactic_strategically_preferredP(tactic, strategy)) {
                                    inference_worker.possibly_note_problem_pending(inference_datastructures_tactic.tactic_problem(tactic), strategy);
                                }
                            }
                        }
                    }
                }
            }
            SubLObject idx_$11 = idx;
            if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$11)) {
                SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$11);
                SubLObject id2 = NIL;
                SubLObject inference2 = NIL;
                Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        id2 = Hashtables.getEntryKey(cdohash_entry);
                        inference2 = Hashtables.getEntryValue(cdohash_entry);
                        if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference2)) {
                            SubLObject inference_var2 = inference2;
                            SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                            SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                            SubLObject basis_object2;
                            SubLObject state2;
                            SubLObject strategy2;
                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                    state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2) && NIL != inference_datastructures_strategy.tactic_strategically_preferredP(tactic, strategy2)) {
                                    inference_worker.possibly_note_problem_pending(inference_datastructures_tactic.tactic_problem(tactic), strategy2);
                                }
                            }
                        }
                    }
                } finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 40500L)
    public static SubLObject join_ordered_tactic_lookahead_problem(SubLObject join_ordered_tactic) {
        SubLObject focal_mapped_problem = find_or_create_join_ordered_tactic_focal_mapped_problem(join_ordered_tactic);
        return inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 40800L)
    public static SubLObject new_join_ordered_proof(SubLObject join_ordered_link, SubLObject subproofs_with_sub_bindings) {
        return new_conjunctive_proof(join_ordered_link, subproofs_with_sub_bindings);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 41100L)
    public static SubLObject join_ordered_proof_p(SubLObject v_object) {
        return makeBoolean(NIL != inference_datastructures_proof.proof_p(v_object) && $JOIN_ORDERED == inference_datastructures_proof.proof_type(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 41300L)
    public static SubLObject connected_conjunction_proof_p(SubLObject v_object) {
        return makeBoolean(NIL != join_ordered_proof_p(v_object) || NIL != inference_worker_join.join_proof_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 41400L)
    public static SubLObject new_conjunctive_proof(SubLObject conjunctive_link, SubLObject subproofs_with_sub_bindings) {
        SubLObject proof_bindings = NIL;
        SubLObject subproofs = NIL;
        SubLObject cdolist_list_var = subproofs_with_sub_bindings;
        SubLObject subproof_with_sub_bindings = NIL;
        subproof_with_sub_bindings = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = subproof_with_sub_bindings;
            SubLObject subproof = NIL;
            SubLObject sub_proof_bindings = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list75);
            subproof = current.first();
            current = (sub_proof_bindings = current.rest());
            proof_bindings = nconc(conses_high.copy_list(sub_proof_bindings), proof_bindings);
            subproofs = cons(subproof, subproofs);
            cdolist_list_var = cdolist_list_var.rest();
            subproof_with_sub_bindings = cdolist_list_var.first();
        }
        subproofs = Sequences.nreverse(subproofs);
        proof_bindings = inference_worker.ncanonicalize_proof_bindings(proof_bindings);
        return inference_worker.propose_new_proof_with_bindings(conjunctive_link, proof_bindings, subproofs);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 42200L)
    public static SubLObject compute_sibling_proof_bindings(SubLObject trigger_proof_bindings, SubLObject join_ordered_link, SubLObject trigger_is_focalP) {
        SubLObject trigger_to_sibling_variable_map = trigger_to_sibling_variable_map(join_ordered_link, trigger_is_focalP);
        SubLObject sibling_proof_bindings = bindings.transfer_variable_map_to_bindings_filtered(trigger_to_sibling_variable_map, trigger_proof_bindings);
        return sibling_proof_bindings;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 42800L)
    public static SubLObject focal_to_non_focal_variable_map(SubLObject join_ordered_link) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject local_state = inference_datastructures_problem_link.problem_link_memoization_state(join_ordered_link);
        SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                result = memoized_focal_to_non_focal_variable_map_int(join_ordered_link);
            } finally {
                SubLObject _prev_bind_0_$12 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 43100L)
    public static SubLObject memoized_focal_to_non_focal_variable_map_int_internal(SubLObject join_ordered_link) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(inference_datastructures_problem_link.problem_link_store(join_ordered_link));
        SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                return focal_to_non_focal_variable_map_int(join_ordered_link);
            } finally {
                SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 43100L)
    public static SubLObject memoized_focal_to_non_focal_variable_map_int(SubLObject join_ordered_link) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return memoized_focal_to_non_focal_variable_map_int_internal(join_ordered_link);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym76$MEMOIZED_FOCAL_TO_NON_FOCAL_VARIABLE_MAP_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym76$MEMOIZED_FOCAL_TO_NON_FOCAL_VARIABLE_MAP_INT, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym76$MEMOIZED_FOCAL_TO_NON_FOCAL_VARIABLE_MAP_INT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, join_ordered_link, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(memoized_focal_to_non_focal_variable_map_int_internal(join_ordered_link)));
            memoization_state.caching_state_put(caching_state, join_ordered_link, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 43300L)
    public static SubLObject focal_to_non_focal_variable_map_int(SubLObject join_ordered_link) {
        SubLObject focal_mapped_problem = join_ordered_link_focal_mapped_problem(join_ordered_link);
        SubLObject non_focal_mapped_problem = join_ordered_link_non_focal_mapped_problem(join_ordered_link);
        SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
        SubLObject non_focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(non_focal_mapped_problem);
        SubLObject supported_to_non_focal_variable_map = bindings.invert_bindings(non_focal_variable_map);
        SubLObject focal_to_non_focal_variable_map = bindings.compose_bindings_filtered(focal_variable_map, supported_to_non_focal_variable_map);
        return focal_to_non_focal_variable_map;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 44200L)
    public static SubLObject non_focal_to_focal_variable_map(SubLObject join_ordered_link) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject local_state = inference_datastructures_problem_link.problem_link_memoization_state(join_ordered_link);
        SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                result = memoized_non_focal_to_focal_variable_map_int(join_ordered_link);
            } finally {
                SubLObject _prev_bind_0_$14 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 44400L)
    public static SubLObject memoized_non_focal_to_focal_variable_map_int_internal(SubLObject join_ordered_link) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(inference_datastructures_problem_link.problem_link_store(join_ordered_link));
        SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                return non_focal_to_focal_variable_map_int(join_ordered_link);
            } finally {
                SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 44400L)
    public static SubLObject memoized_non_focal_to_focal_variable_map_int(SubLObject join_ordered_link) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return memoized_non_focal_to_focal_variable_map_int_internal(join_ordered_link);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym78$MEMOIZED_NON_FOCAL_TO_FOCAL_VARIABLE_MAP_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym78$MEMOIZED_NON_FOCAL_TO_FOCAL_VARIABLE_MAP_INT, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym78$MEMOIZED_NON_FOCAL_TO_FOCAL_VARIABLE_MAP_INT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, join_ordered_link, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(memoized_non_focal_to_focal_variable_map_int_internal(join_ordered_link)));
            memoization_state.caching_state_put(caching_state, join_ordered_link, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 44700L)
    public static SubLObject non_focal_to_focal_variable_map_int(SubLObject join_ordered_link) {
        return bindings.invert_bindings(focal_to_non_focal_variable_map(join_ordered_link));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 44900L)
    public static SubLObject trigger_to_sibling_variable_map(SubLObject join_ordered_link, SubLObject trigger_is_focalP) {
        return (NIL != trigger_is_focalP) ? focal_to_non_focal_variable_map(join_ordered_link) : non_focal_to_focal_variable_map(join_ordered_link);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 45100L)
    public static SubLObject focal_bindings_to_non_focal_bindings(SubLObject focal_restriction_bindings, SubLObject join_ordered_link) {
        SubLObject focal_to_non_focal_variable_map = focal_to_non_focal_variable_map(join_ordered_link);
        SubLObject non_focal_restriction_bindings = bindings.transfer_variable_map_to_bindings_filtered(focal_to_non_focal_variable_map, focal_restriction_bindings);
        return non_focal_restriction_bindings;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 46200L)
    public static SubLObject non_focal_bindings_to_focal_bindings(SubLObject non_focal_restriction_bindings, SubLObject join_ordered_link) {
        SubLObject non_focal_to_focal_variable_map = non_focal_to_focal_variable_map(join_ordered_link);
        SubLObject focal_restriction_bindings = bindings.transfer_variable_map_to_bindings_filtered(non_focal_to_focal_variable_map, non_focal_restriction_bindings);
        return focal_restriction_bindings;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 46800L)
    public static SubLObject bubble_up_proof_to_join_ordered_link(SubLObject trigger_subproof, SubLObject variable_map, SubLObject join_ordered_link) {
        SubLObject trigger_is_focalP = mapped_proof_is_focalP(trigger_subproof, variable_map, join_ordered_link);
        add_join_ordered_link_proof(join_ordered_link, trigger_subproof, trigger_is_focalP);
        if (NIL == trigger_is_focalP) {
            bubble_up_proof_to_join_ordered_link_int(trigger_subproof, variable_map, join_ordered_link, trigger_is_focalP);
        } else {
            SubLObject restricted_non_focal_mapped_problem = trigger_split_restriction(join_ordered_link, trigger_subproof);
            bubble_up_proof_to_join_ordered_link_int(trigger_subproof, variable_map, join_ordered_link, trigger_is_focalP);
            if (NIL != restricted_non_focal_mapped_problem) {
                SubLObject restricted_non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem(restricted_non_focal_mapped_problem);
                SubLObject prob;
                SubLObject supported_problem = prob = inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link);
                SubLObject store = inference_datastructures_problem.problem_store(prob);
                SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
                if (NIL == id_index.id_index_objects_empty_p(idx, $SKIP)) {
                    SubLObject idx_$16 = idx;
                    if (NIL == id_index.id_index_dense_objects_empty_p(idx_$16, $SKIP)) {
                        SubLObject vector_var = id_index.id_index_dense_objects(idx_$16);
                        SubLObject backwardP_var = NIL;
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
                        for (length = Sequences.length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                            id = ((NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, ONE_INTEGER) : v_iteration);
                            inference = Vectors.aref(vector_var, id);
                            if (NIL == id_index.id_index_tombstone_p(inference) || NIL == id_index.id_index_skip_tombstones_p($SKIP)) {
                                if (NIL != id_index.id_index_tombstone_p(inference)) {
                                    inference = $SKIP;
                                }
                                if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference)) {
                                    inference_var = inference;
                                    set_var = inference_datastructures_inference.inference_strategy_set(inference_var);
                                    set_contents_var = set.do_set_internal(set_var);
                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                                            state); state = set_contents.do_set_contents_update_state(state)) {
                                        strategy = set_contents.do_set_contents_next(basis_object, state);
                                        if (NIL != set_contents.do_set_contents_element_validP(state, strategy)) {
                                            inference_worker.maybe_possibly_activate_problem(strategy, restricted_non_focal_problem);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    SubLObject idx_$17 = idx;
                    if (NIL == id_index.id_index_sparse_objects_empty_p(idx_$17)) {
                        SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$17);
                        SubLObject id2 = NIL;
                        SubLObject inference2 = NIL;
                        Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                        try {
                            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                                Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                                id2 = Hashtables.getEntryKey(cdohash_entry);
                                inference2 = Hashtables.getEntryValue(cdohash_entry);
                                if (NIL != inference_datastructures_problem.problem_relevant_to_inferenceP(prob, inference2)) {
                                    SubLObject inference_var2 = inference2;
                                    SubLObject set_var2 = inference_datastructures_inference.inference_strategy_set(inference_var2);
                                    SubLObject set_contents_var2 = set.do_set_internal(set_var2);
                                    SubLObject basis_object2;
                                    SubLObject state2;
                                    SubLObject strategy2;
                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2,
                                            state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                        strategy2 = set_contents.do_set_contents_next(basis_object2, state2);
                                        if (NIL != set_contents.do_set_contents_element_validP(state2, strategy2)) {
                                            inference_worker.maybe_possibly_activate_problem(strategy2, restricted_non_focal_problem);
                                        }
                                    }
                                }
                            }
                        } finally {
                            Hashtables.releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 48000L)
    public static SubLObject trigger_split_restriction(SubLObject join_ordered_link, SubLObject focal_problem_proof) {
        if (NIL == focal_problem_is_a_single_literal_backchain_requiredP(join_ordered_link)) {
            return find_or_create_split_restriction_int(join_ordered_link, focal_problem_proof, T);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 48400L)
    public static SubLObject find_split_restriction(SubLObject join_ordered_link, SubLObject focal_problem_proof) {
        return find_or_create_split_restriction_int(join_ordered_link, focal_problem_proof, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 48600L)
    public static SubLObject find_or_create_split_restriction_int(SubLObject join_ordered_link, SubLObject focal_problem_proof, SubLObject createP) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject focal_restriction_bindings = inference_datastructures_proof.proof_bindings(focal_problem_proof);
        SubLObject non_focal_restriction_bindings = focal_bindings_to_non_focal_bindings(focal_restriction_bindings, join_ordered_link);
        thread.resetMultipleValues();
        SubLObject restricted_non_focal_mapped_problem = find_or_create_restricted_non_focal_problem_int(join_ordered_link, non_focal_restriction_bindings, createP);
        SubLObject restricted_non_focal_link = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != restricted_non_focal_link) {
            add_join_ordered_link_restricted_non_focal_link(join_ordered_link, restricted_non_focal_link, focal_problem_proof);
        }
        return restricted_non_focal_mapped_problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 49800L)
    public static SubLObject note_all_triggering_proofs_processed(SubLObject restriction_link) {
        SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
        SubLObject set_contents_var = inference_datastructures_problem.problem_dependent_links(supported_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject join_ordered_link;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                state); state = set_contents.do_set_contents_update_state(state)) {
            join_ordered_link = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, join_ordered_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED)) {
                note_restricted_non_focal_finished(join_ordered_link, restriction_link);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 50100L)
    public static SubLObject note_restricted_non_focal_finished(SubLObject join_ordered_link, SubLObject restriction_link) {
        SubLObject proof = join_ordered_link_restricted_non_focal_triggering_proof(join_ordered_link, restriction_link);
        if (NIL != proof) {
            inference_worker.possibly_note_proof_processed(proof);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 50400L)
    public static SubLObject find_or_create_restricted_non_focal_problem(SubLObject join_ordered_link, SubLObject non_focal_restriction_bindings) {
        return find_or_create_restricted_non_focal_problem_int(join_ordered_link, non_focal_restriction_bindings, T);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 50700L)
    public static SubLObject find_restricted_non_focal_problem(SubLObject join_ordered_link, SubLObject non_focal_restriction_bindings) {
        return find_or_create_restricted_non_focal_problem_int(join_ordered_link, non_focal_restriction_bindings, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 50900L)
    public static SubLObject find_or_create_restricted_non_focal_problem_int(SubLObject join_ordered_link, SubLObject non_focal_restriction_bindings, SubLObject creation_allowedP) {
        SubLObject non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem(join_ordered_link_non_focal_mapped_problem(join_ordered_link));
        return find_or_create_restricted_problem_and_link_int(non_focal_problem, non_focal_restriction_bindings, creation_allowedP);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 51200L)
    public static SubLObject find_restricted_problem_and_link(SubLObject unrestricted_problem, SubLObject restriction_bindings) {
        return find_or_create_restricted_problem_and_link_int(unrestricted_problem, restriction_bindings, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 51400L)
    public static SubLObject find_or_create_restricted_problem_and_link_int(SubLObject unrestricted_problem, SubLObject restriction_bindings, SubLObject creation_allowedP) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == restriction_bindings) {
            Errors.error($str79$Finding_or_creating_a_restricted_, unrestricted_problem);
        }
        SubLObject restricted_mapped_problem = find_or_create_restricted_problem_int(unrestricted_problem, restriction_bindings, creation_allowedP);
        SubLObject restriction_link = NIL;
        if (NIL != creation_allowedP) {
            restriction_link = inference_worker_restriction.maybe_new_restriction_link(unrestricted_problem, restricted_mapped_problem, restriction_bindings, UNPROVIDED, UNPROVIDED);
        }
        return subl_promotions.values2(restricted_mapped_problem, restriction_link);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 52200L)
    public static SubLObject find_or_create_restricted_problem(SubLObject unrestricted_problem, SubLObject restriction_bindings) {
        return find_or_create_restricted_problem_int(unrestricted_problem, restriction_bindings, T);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 52500L)
    public static SubLObject find_or_create_restricted_problem_int(SubLObject unrestricted_problem, SubLObject restriction_bindings, SubLObject creation_allowedP) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == restriction_bindings) {
            Errors.error($str80$Creating_a_restricted_problem_of_, unrestricted_problem);
        }
        SubLObject query = inference_datastructures_problem.problem_query(unrestricted_problem);
        SubLObject restricted_query = bindings.apply_bindings(restriction_bindings, query);
        SubLObject restricted_free_hl_vars = variables.sort_hl_variable_list_memoized(
                cycl_utilities.expression_gather(bindings.apply_bindings(restriction_bindings, inference_datastructures_problem.problem_free_hl_vars(unrestricted_problem)), $sym71$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject store = inference_datastructures_problem.problem_store(unrestricted_problem);
        SubLObject restricted_mapped_problem = (NIL != creation_allowedP) ? inference_worker.find_or_create_problem(store, restricted_query, restricted_free_hl_vars, UNPROVIDED) : inference_worker.find_problem(store, restricted_query, restricted_free_hl_vars);
        return restricted_mapped_problem;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 53500L)
    public static SubLObject focal_problem_is_a_single_literal_backchain_requiredP(SubLObject join_ordered_link) {
        SubLObject focal_problem = join_ordered_link_focal_problem(join_ordered_link);
        return makeBoolean(NIL != inference_datastructures_problem.single_literal_problem_p(focal_problem) && NIL != inference_datastructures_problem.problem_backchain_requiredP(focal_problem));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 53800L)
    public static SubLObject corresponding_focal_problem(SubLObject join_ordered_problem, SubLObject join_ordered_link) {
        SubLObject non_focal_mapped_problem = join_ordered_link_non_focal_mapped_problem(join_ordered_link);
        SubLObject non_focal_problem = (NIL != non_focal_mapped_problem) ? inference_datastructures_problem_link.mapped_problem_problem(non_focal_mapped_problem) : NIL;
        if (!join_ordered_problem.eql(non_focal_problem)) {
            return NIL;
        }
        SubLObject focal_mapped_problem = join_ordered_link_focal_mapped_problem(join_ordered_link);
        if (NIL != focal_mapped_problem) {
            return inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 54600L)
    public static SubLObject corresponding_non_focal_problem(SubLObject join_ordered_problem, SubLObject join_ordered_link) {
        SubLObject focal_mapped_problem = join_ordered_link_focal_mapped_problem(join_ordered_link);
        SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem);
        if (!join_ordered_problem.eql(focal_problem)) {
            return NIL;
        }
        SubLObject non_focal_mapped_problem = join_ordered_link_non_focal_mapped_problem(join_ordered_link);
        if (NIL != non_focal_mapped_problem) {
            return inference_datastructures_problem_link.mapped_problem_problem(non_focal_mapped_problem);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 55300L)
    public static SubLObject corresponding_restricted_focal_problem(SubLObject restriction_link, SubLObject join_ordered_link) {
        SubLObject non_focal_mapped_problem = join_ordered_link_non_focal_mapped_problem(join_ordered_link);
        if (NIL != non_focal_mapped_problem) {
            SubLObject non_focal_problem = inference_datastructures_problem_link.mapped_problem_problem(non_focal_mapped_problem);
            SubLObject unrestricted_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
            if (!unrestricted_problem.eql(non_focal_problem)) {
                return NIL;
            }
            SubLObject non_focal_restriction_bindings = inference_worker_restriction.restriction_link_bindings(restriction_link);
            SubLObject focal_restriction_bindings = non_focal_bindings_to_focal_bindings(non_focal_restriction_bindings, join_ordered_link);
            SubLObject restricted_focal_mapped_problem = (NIL != focal_restriction_bindings) ? find_restricted_focal_problem_by_bindings(join_ordered_link, focal_restriction_bindings) : NIL;
            if (NIL != restricted_focal_mapped_problem) {
                return inference_datastructures_problem_link.mapped_problem_problem(restricted_focal_mapped_problem);
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 56700L)
    public static SubLObject non_focal_restriction_link_with_corresponding_focal_proofP(SubLObject restriction_link, SubLObject join_ordered_link) {
        return join_ordered_link_restricted_non_focal_linkP(join_ordered_link, restriction_link);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 58000L)
    public static SubLObject corresponding_restricted_non_focal_problem(SubLObject restriction_link, SubLObject join_ordered_link) {
        SubLObject focal_mapped_problem = join_ordered_link_focal_mapped_problem(join_ordered_link);
        SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem);
        SubLObject unrestricted_problem = inference_datastructures_problem_link.problem_link_supported_problem(restriction_link);
        if (unrestricted_problem.eql(focal_problem)) {
            if (NIL != join_ordered_link_non_focal_mapped_problem(join_ordered_link)) {
                SubLObject focal_restriction_bindings = inference_worker_restriction.restriction_link_bindings(restriction_link);
                SubLObject non_focal_restriction_bindings = focal_bindings_to_non_focal_bindings(focal_restriction_bindings, join_ordered_link);
                SubLObject restricted_non_focal_mapped_problem = (NIL != non_focal_restriction_bindings) ? find_restricted_non_focal_problem(join_ordered_link, non_focal_restriction_bindings) : NIL;
                if (NIL != restricted_non_focal_mapped_problem) {
                    return inference_datastructures_problem_link.mapped_problem_problem(restricted_non_focal_mapped_problem);
                }
            }
            return NIL;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 59400L)
    public static SubLObject find_restricted_focal_problem_by_bindings(SubLObject join_ordered_link, SubLObject focal_restriction_bindings) {
        SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem(join_ordered_link_focal_mapped_problem(join_ordered_link));
        return find_restricted_problem_and_link(focal_problem, focal_restriction_bindings);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 59700L)
    public static SubLObject mapped_proof_is_focalP(SubLObject subproof, SubLObject proof_variable_map, SubLObject join_ordered_link) {
        SubLObject focal_mapped_problem = join_ordered_link_focal_mapped_problem(join_ordered_link);
        SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem);
        SubLObject subproof_supported_problem = inference_datastructures_proof.proof_supported_problem(subproof);
        if (focal_problem.eql(subproof_supported_problem)) {
            SubLObject focal_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
            if (NIL != bindings.bindings_equalP(focal_variable_map, proof_variable_map)) {
                return T;
            }
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 60300L)
    public static SubLObject trigger_vars_shared_by_sibling(SubLObject join_ordered_link, SubLObject trigger_is_focalP) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject local_state = inference_datastructures_problem_link.problem_link_memoization_state(join_ordered_link);
        SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                result = memoized_trigger_vars_shared_by_sibling_int(join_ordered_link, trigger_is_focalP);
            } finally {
                SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 60600L)
    public static SubLObject memoized_trigger_vars_shared_by_sibling_int_internal(SubLObject join_ordered_link, SubLObject trigger_is_focalP) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(inference_datastructures_problem_link.problem_link_store(join_ordered_link));
        SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                return trigger_vars_shared_by_sibling_int(join_ordered_link, trigger_is_focalP);
            } finally {
                SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 60600L)
    public static SubLObject memoized_trigger_vars_shared_by_sibling_int(SubLObject join_ordered_link, SubLObject trigger_is_focalP) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return memoized_trigger_vars_shared_by_sibling_int_internal(join_ordered_link, trigger_is_focalP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym82$MEMOIZED_TRIGGER_VARS_SHARED_BY_SIBLING_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym82$MEMOIZED_TRIGGER_VARS_SHARED_BY_SIBLING_INT, TWO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym82$MEMOIZED_TRIGGER_VARS_SHARED_BY_SIBLING_INT, caching_state);
        }
        SubLObject sxhash = memoization_state.sxhash_calc_2(join_ordered_link, trigger_is_focalP);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (join_ordered_link.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (NIL != cached_args && NIL == cached_args.rest() && trigger_is_focalP.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        SubLObject results3 = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(memoized_trigger_vars_shared_by_sibling_int_internal(join_ordered_link, trigger_is_focalP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(join_ordered_link, trigger_is_focalP));
        return memoization_state.caching_results(results3);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 60900L)
    public static SubLObject trigger_vars_shared_by_sibling_int(SubLObject join_ordered_link, SubLObject trigger_is_focalP) {
        if (NIL != trigger_is_focalP) {
            SubLObject tactic = join_ordered_link_tactic(join_ordered_link);
            SubLObject focal_mapped_problem = join_ordered_link_focal_mapped_problem(join_ordered_link);
            SubLObject focal_clause = inference_datastructures_problem.problem_sole_clause(inference_datastructures_problem_link.mapped_problem_problem(focal_mapped_problem));
            SubLObject focal_supporting_problem_spec = join_ordered_tactic_focal_supporting_problem_spec(tactic);
            SubLObject dnf_clause = inference_datastructures_problem.problem_sole_clause(inference_datastructures_problem_link.problem_link_supported_problem(join_ordered_link));
            SubLObject non_focal_clause = clause_utilities.complement_of_subclause_specified_by_spec(dnf_clause, focal_supporting_problem_spec);
            SubLObject non_focal_vars = list_utilities.tree_gather(non_focal_clause, Symbols.symbol_function($sym83$VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject focal_focal_vars = list_utilities.tree_gather(focal_clause, Symbols.symbol_function($sym83$VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject focal_vars = bindings.apply_bindings(inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem), focal_focal_vars);
            SubLObject shared_vars = conses_high.intersection(focal_vars, non_focal_vars, Symbols.symbol_function(EQ), UNPROVIDED);
            SubLObject focal_shared_vars = bindings.apply_bindings_backwards(inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem), shared_vars);
            SubLObject canonical_shared_vars = canonicalize_hl_variable_list(focal_shared_vars);
            return canonical_shared_vars;
        }
        SubLObject trigger_to_sibling_variable_map = trigger_to_sibling_variable_map(join_ordered_link, trigger_is_focalP);
        return Mapping.mapcar($sym84$VARIABLE_BINDING_VARIABLE, trigger_to_sibling_variable_map);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 63100L)
    public static SubLObject non_focal_vars_shared_by_focal(SubLObject join_ordered_link) {
        return trigger_vars_shared_by_sibling(join_ordered_link, NIL);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 63200L)
    public static SubLObject focal_vars_shared_by_non_focal(SubLObject join_ordered_link) {
        return trigger_vars_shared_by_sibling(join_ordered_link, T);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 63300L)
    public static SubLObject canonicalize_hl_variable_list(SubLObject hl_vars) {
        return hl_vars;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 63500L)
    public static SubLObject join_ordered_link_join_vars(SubLObject join_ordered_link) {
        SubLObject trigger_vars_shared_by_sibling = trigger_vars_shared_by_sibling(join_ordered_link, T);
        SubLObject focal_to_supported_variable_map = join_ordered_link_focal_to_supported_variable_map(join_ordered_link);
        SubLObject join_vars = bindings.apply_bindings(focal_to_supported_variable_map, trigger_vars_shared_by_sibling);
        return join_vars;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 63900L)
    public static SubLObject join_ordered_link_focal_to_supported_variable_map(SubLObject join_ordered_link) {
        SubLObject focal_mapped_problem = join_ordered_link_focal_mapped_problem(join_ordered_link);
        return inference_datastructures_problem_link.mapped_problem_variable_map(focal_mapped_problem);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 64200L)
    public static SubLObject join_ordered_link_non_focal_to_supported_variable_map(SubLObject join_ordered_link) {
        SubLObject non_focal_mapped_problem = join_ordered_link_non_focal_mapped_problem(join_ordered_link);
        return inference_datastructures_problem_link.mapped_problem_variable_map(non_focal_mapped_problem);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 64400L)
    public static SubLObject add_join_ordered_link_proof(SubLObject join_ordered_link, SubLObject trigger_proof, SubLObject trigger_is_focalP) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && NIL == inference_datastructures_proof.proof_provenP(trigger_proof)) {
            Errors.error($str85$_a_was_a_rejected_proof, trigger_proof);
        }
        SubLObject shared_trigger_proof_bindings = join_ordered_link_shared_proof_bindings(join_ordered_link, trigger_proof, trigger_is_focalP);
        if (NIL != trigger_is_focalP) {
            add_join_ordered_link_focal_proof(join_ordered_link, shared_trigger_proof_bindings, trigger_proof);
        } else {
            add_join_ordered_link_non_focal_proof(join_ordered_link, shared_trigger_proof_bindings, trigger_proof);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 65200L)
    public static SubLObject join_ordered_link_shared_proof_bindings(SubLObject join_ordered_link, SubLObject trigger_proof, SubLObject trigger_is_focalP) {
        SubLObject trigger_proof_bindings = inference_datastructures_proof.proof_bindings(trigger_proof);
        return join_ordered_link_shared_proof_bindings_int(join_ordered_link, trigger_proof_bindings, trigger_is_focalP);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 65600L)
    public static SubLObject remove_join_ordered_link_proof(SubLObject join_ordered_link, SubLObject trigger_proof, SubLObject trigger_proof_bindings, SubLObject trigger_is_focalP) {
        SubLObject shared_trigger_proof_bindings = join_ordered_link_shared_proof_bindings_int(join_ordered_link, trigger_proof_bindings, trigger_is_focalP);
        if (NIL != trigger_is_focalP) {
            remove_join_ordered_link_focal_proof(join_ordered_link, shared_trigger_proof_bindings, trigger_proof);
        } else {
            remove_join_ordered_link_non_focal_proof(join_ordered_link, shared_trigger_proof_bindings, trigger_proof);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 66200L)
    public static SubLObject remove_join_ordered_link_proof_both_ways(SubLObject join_ordered_link, SubLObject proof, SubLObject v_bindings) {
        if (NIL != join_ordered_link_non_focal_manifestedP(join_ordered_link)) {
            remove_join_ordered_link_proof(join_ordered_link, proof, v_bindings, T);
            remove_join_ordered_link_proof(join_ordered_link, proof, v_bindings, NIL);
        } else {
            remove_join_ordered_link_proof(join_ordered_link, proof, v_bindings, T);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 66900L)
    public static SubLObject join_ordered_link_shared_proof_bindings_int(SubLObject join_ordered_link, SubLObject trigger_proof_bindings, SubLObject trigger_is_focalP) {
        SubLObject trigger_vars_shared_by_sibling = trigger_vars_shared_by_sibling(join_ordered_link, trigger_is_focalP);
        SubLObject shared_trigger_proof_bindings = bindings.filter_bindings_by_variables(trigger_proof_bindings, trigger_vars_shared_by_sibling);
        return shared_trigger_proof_bindings;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 67500L)
    public static SubLObject join_ordered_link_sibling_proofs_lookup(SubLObject join_ordered_link, SubLObject sibling_proof_bindings, SubLObject trigger_is_focalP) {
        return (NIL != trigger_is_focalP) ? join_ordered_link_non_focal_proofs_lookup(join_ordered_link, sibling_proof_bindings) : join_ordered_link_focal_proofs_lookup(join_ordered_link, sibling_proof_bindings);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 67900L)
    public static SubLObject bubble_up_proof_to_join_ordered_link_int(SubLObject trigger_subproof, SubLObject variable_map, SubLObject join_ordered_link, SubLObject trigger_is_focalP) {
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject proofs = NIL;
        SubLObject trigger_proof_bindings = inference_datastructures_proof.proof_bindings(trigger_subproof);
        SubLObject sibling_proof_bindings = compute_sibling_proof_bindings(trigger_proof_bindings, join_ordered_link, trigger_is_focalP);
        SubLObject sibling_proofs = list_utilities.remove_if_not($sym86$PROOF_PROVEN_, join_ordered_link_sibling_proofs_lookup(join_ordered_link, sibling_proof_bindings, trigger_is_focalP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != sibling_proofs) {
            SubLObject sibling_mapped_problem = join_ordered_link_sibling_mapped_problem(join_ordered_link, trigger_is_focalP);
            SubLObject sibling_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(sibling_mapped_problem);
            SubLObject sibling_proofs_with_bindings = NIL;
            SubLObject cdolist_list_var = sibling_proofs;
            SubLObject sibling_proof = NIL;
            sibling_proof = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject sibling_sub_proof_bindings = bindings.transfer_variable_map_to_bindings(sibling_variable_map, inference_datastructures_proof.proof_bindings(sibling_proof));
                sibling_proofs_with_bindings = cons(cons(sibling_proof, sibling_sub_proof_bindings), sibling_proofs_with_bindings);
                cdolist_list_var = cdolist_list_var.rest();
                sibling_proof = cdolist_list_var.first();
            }
            sibling_proofs_with_bindings = Sequences.nreverse(sibling_proofs_with_bindings);
            SubLObject trigger_sub_proof_bindings = bindings.transfer_variable_map_to_bindings(variable_map, trigger_proof_bindings);
            SubLObject supporting_mapped_proof_lists_by_supporting_problem = (NIL != trigger_is_focalP) ? list(list(cons(trigger_subproof, trigger_sub_proof_bindings)), sibling_proofs_with_bindings) : list(sibling_proofs_with_bindings, list(cons(trigger_subproof, trigger_sub_proof_bindings)));
            SubLObject cdolist_list_var2;
            SubLObject mapped_subproof_lists = cdolist_list_var2 = list_utilities.cartesian_product(supporting_mapped_proof_lists_by_supporting_problem, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject mapped_subproof_list = NIL;
            mapped_subproof_list = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                thread.resetMultipleValues();
                SubLObject proof = new_join_ordered_proof(join_ordered_link, mapped_subproof_list);
                SubLObject newP = thread.secondMultipleValue();
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
            proofs = (cdolist_list_var3 = Sequences.nreverse(proofs));
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

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 70200L)
    public static SubLObject join_ordered_link_sibling_mapped_problem(SubLObject join_ordered_link, SubLObject trigger_is_focalP) {
        return (NIL != trigger_is_focalP) ? join_ordered_link_non_focal_mapped_problem(join_ordered_link) : join_ordered_link_focal_mapped_problem(join_ordered_link);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 70500L)
    public static SubLObject join_ordered_link_could_be_finishedP(SubLObject jo_link, SubLObject strategic_context) {
        SubLObject unfinishedP = makeBoolean(NIL == inference_worker.finished_problem_p(join_ordered_link_focal_problem(jo_link), strategic_context));
        if (NIL != join_ordered_link_non_focal_manifestedP(jo_link)) {
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(join_ordered_link_non_focal_problem(jo_link));
            SubLObject basis_object;
            SubLObject state;
            SubLObject restriction_link;
            SubLObject restricted_non_focal_problem;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == unfinishedP
                    && NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                restriction_link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, restriction_link) && NIL != inference_datastructures_problem_link.problem_link_has_typeP(restriction_link, $RESTRICTION) && NIL != non_focal_restriction_link_with_corresponding_focal_proofP(restriction_link, jo_link)) {
                    restricted_non_focal_problem = inference_datastructures_problem_link.problem_link_sole_supporting_problem(restriction_link);
                    unfinishedP = makeBoolean(NIL == inference_worker.finished_problem_p(restricted_non_focal_problem, strategic_context));
                }
            }
        }
        return makeBoolean(NIL == unfinishedP);
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 71000L)
    public static SubLObject join_ordered_link_no_goodP(SubLObject join_ordered_link, SubLObject consider_deepP, SubLObject strategic_context) {
        return makeBoolean(NIL != join_ordered_link_no_good_case_1P(join_ordered_link, consider_deepP, strategic_context) || NIL != join_ordered_link_no_good_case_2P(join_ordered_link, consider_deepP, strategic_context));
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 71700L)
    public static SubLObject join_ordered_link_no_good_case_1P(SubLObject join_ordered_link, SubLObject consider_deepP, SubLObject strategic_context) {
        SubLObject focal_problem = inference_datastructures_problem_link.mapped_problem_problem(join_ordered_link_focal_mapped_problem(join_ordered_link));
        SubLObject shared_vars = focal_vars_shared_by_non_focal(join_ordered_link);
        if (NIL != inference_worker.finished_problem_p(focal_problem, strategic_context) && $PREFERRED == inference_tactician_utilities.memoized_problem_global_preference_level(focal_problem, strategic_context, shared_vars)) {
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(focal_problem);
            SubLObject basis_object;
            SubLObject state;
            SubLObject argument_link;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object,
                    state); state = set_contents.do_set_contents_update_state(state)) {
                argument_link = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, argument_link) && NIL == inference_worker.problem_link_no_good_wrt_dependent_join_ordered_linkP(argument_link, join_ordered_link, consider_deepP, strategic_context)) {
                    return NIL;
                }
            }
            return T;
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 72500L)
    public static SubLObject join_ordered_link_no_good_case_2P(SubLObject join_ordered_link, SubLObject consider_deepP, SubLObject strategic_context) {
        if (NIL != consider_deepP) {
            SubLObject tactic = join_ordered_link_tactic(join_ordered_link);
            return inference_datastructures_tactic.tactic_discardedP(tactic);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 72700L)
    public static SubLObject join_ordered_link_with_non_focal_unbound_predicateP(SubLObject join_ordered_link) {
        SubLObject non_focal_problem = join_ordered_link_non_focal_problem(join_ordered_link);
        SubLObject cdolist_list_var;
        SubLObject non_focal_query = cdolist_list_var = inference_datastructures_problem.problem_query(non_focal_problem);
        SubLObject contextualized_clause = NIL;
        contextualized_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject sense = $NEG;
            SubLObject index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$20 = clauses.neg_lits(contextualized_clause);
            SubLObject contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$20.first();
            while (NIL != cdolist_list_var_$20) {
                SubLObject current;
                SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list88);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list88);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                    if (NIL != cycl_variables.hl_varP(pred) && NIL != subl_promotions.memberP(pred, non_focal_vars_shared_by_focal(join_ordered_link), UNPROVIDED, UNPROVIDED)) {
                        return T;
                    }
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list88);
                }
                index_var = Numbers.add(index_var, ONE_INTEGER);
                cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                contextualized_asent = cdolist_list_var_$20.first();
            }
            sense = $POS;
            index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$21 = clauses.pos_lits(contextualized_clause);
            contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$21.first();
            while (NIL != cdolist_list_var_$21) {
                SubLObject current;
                SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list88);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list88);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                    if (NIL != cycl_variables.hl_varP(pred) && NIL != subl_promotions.memberP(pred, non_focal_vars_shared_by_focal(join_ordered_link), UNPROVIDED, UNPROVIDED)) {
                        return T;
                    }
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list88);
                }
                index_var = Numbers.add(index_var, ONE_INTEGER);
                cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                contextualized_asent = cdolist_list_var_$21.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_clause = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-worker-join-ordered.lisp", position = 73400L)
    public static SubLObject join_ordered_link_with_non_focal_isa_unbound_unbound_where_arg2_is_restrictedP(SubLObject join_ordered_link) {
        SubLObject non_focal_problem = join_ordered_link_non_focal_problem(join_ordered_link);
        SubLObject cdolist_list_var;
        SubLObject non_focal_query = cdolist_list_var = inference_datastructures_problem.problem_query(non_focal_problem);
        SubLObject contextualized_clause = NIL;
        contextualized_clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject sense = $NEG;
            SubLObject index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$22 = clauses.neg_lits(contextualized_clause);
            SubLObject contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$22.first();
            while (NIL != cdolist_list_var_$22) {
                SubLObject current;
                SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list88);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list88);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                    SubLObject arg1 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                    SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                    if (pred.eql($$isa) && NIL != variables.variable_p(arg1) && NIL != variables.variable_p(arg2) && NIL != subl_promotions.memberP(arg2, non_focal_vars_shared_by_focal(join_ordered_link), UNPROVIDED, UNPROVIDED)) {
                        return T;
                    }
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list88);
                }
                index_var = Numbers.add(index_var, ONE_INTEGER);
                cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                contextualized_asent = cdolist_list_var_$22.first();
            }
            sense = $POS;
            index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var_$23 = clauses.pos_lits(contextualized_clause);
            contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var_$23.first();
            while (NIL != cdolist_list_var_$23) {
                SubLObject current;
                SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list88);
                mt = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list88);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
                    SubLObject arg1 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                    SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                    if (pred.eql($$isa) && NIL != variables.variable_p(arg1) && NIL != variables.variable_p(arg2) && NIL != subl_promotions.memberP(arg2, non_focal_vars_shared_by_focal(join_ordered_link), UNPROVIDED, UNPROVIDED)) {
                        return T;
                    }
                } else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, $list88);
                }
                index_var = Numbers.add(index_var, ONE_INTEGER);
                cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                contextualized_asent = cdolist_list_var_$23.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_clause = cdolist_list_var.first();
        }
        return NIL;
    }

    public static SubLObject declare_inference_worker_join_ordered_file() {
        declareFunction(myName, "join_ordered_link_data_print_function_trampoline", "JOIN-ORDERED-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(myName, "join_ordered_link_data_p", "JOIN-ORDERED-LINK-DATA-P", 1, 0, false);
        new $join_ordered_link_data_p$UnaryFunction();
        declareFunction(myName, "jo_link_data_focal_proof_index", "JO-LINK-DATA-FOCAL-PROOF-INDEX", 1, 0, false);
        declareFunction(myName, "jo_link_data_non_focal_proof_index", "JO-LINK-DATA-NON-FOCAL-PROOF-INDEX", 1, 0, false);
        declareFunction(myName, "jo_link_data_restricted_non_focal_link_index", "JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX", 1, 0, false);
        declareFunction(myName, "_csetf_jo_link_data_focal_proof_index", "_CSETF-JO-LINK-DATA-FOCAL-PROOF-INDEX", 2, 0, false);
        declareFunction(myName, "_csetf_jo_link_data_non_focal_proof_index", "_CSETF-JO-LINK-DATA-NON-FOCAL-PROOF-INDEX", 2, 0, false);
        declareFunction(myName, "_csetf_jo_link_data_restricted_non_focal_link_index", "_CSETF-JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX", 2, 0, false);
        declareFunction(myName, "make_join_ordered_link_data", "MAKE-JOIN-ORDERED-LINK-DATA", 0, 1, false);
        declareFunction(myName, "visit_defstruct_join_ordered_link_data", "VISIT-DEFSTRUCT-JOIN-ORDERED-LINK-DATA", 2, 0, false);
        declareFunction(myName, "visit_defstruct_object_join_ordered_link_data_method", "VISIT-DEFSTRUCT-OBJECT-JOIN-ORDERED-LINK-DATA-METHOD", 2, 0, false);
        declareFunction(myName, "valid_join_ordered_link_data_p", "VALID-JOIN-ORDERED-LINK-DATA-P", 1, 0, false);
        declareFunction(myName, "new_join_ordered_link_data", "NEW-JOIN-ORDERED-LINK-DATA", 0, 0, false);
        declareFunction(myName, "join_ordered_link_p", "JOIN-ORDERED-LINK-P", 1, 0, false);
        declareFunction(myName, "maybe_new_join_ordered_link", "MAYBE-NEW-JOIN-ORDERED-LINK", 3, 0, false);
        declareFunction(myName, "new_join_ordered_link", "NEW-JOIN-ORDERED-LINK", 3, 0, false);
        declareFunction(myName, "destroy_join_ordered_link", "DESTROY-JOIN-ORDERED-LINK", 1, 0, false);
        declareMacro(me, "do_join_ordered_link_focal_proofs", "DO-JOIN-ORDERED-LINK-FOCAL-PROOFS");
        declareMacro(me, "do_join_ordered_link_non_focal_proofs", "DO-JOIN-ORDERED-LINK-NON-FOCAL-PROOFS");
        declareMacro(me, "do_join_ordered_link_restricted_non_focal_problems", "DO-JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-PROBLEMS");
        declareMacro(me, "do_virtual_dependent_join_ordered_links", "DO-VIRTUAL-DEPENDENT-JOIN-ORDERED-LINKS");
        declareFunction(myName, "join_ordered_link_focal_proof_index", "JOIN-ORDERED-LINK-FOCAL-PROOF-INDEX", 1, 0, false);
        declareFunction(myName, "join_ordered_link_non_focal_proof_index", "JOIN-ORDERED-LINK-NON-FOCAL-PROOF-INDEX", 1, 0, false);
        declareFunction(myName, "join_ordered_link_restricted_non_focal_link_index", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK-INDEX", 1, 0, false);
        declareFunction(myName, "join_ordered_link_triggered_restriction_link", "JOIN-ORDERED-LINK-TRIGGERED-RESTRICTION-LINK", 2, 0, false);
        declareFunction(myName, "join_ordered_link_triggered_restricted_non_focal", "JOIN-ORDERED-LINK-TRIGGERED-RESTRICTED-NON-FOCAL", 2, 0, false);
        declareFunction(myName, "join_ordered_link_restricted_non_focal_links", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINKS", 1, 0, false);
        declareFunction(myName, "join_ordered_link_restricted_non_focal_triggering_proof", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-TRIGGERING-PROOF", 2, 0, false);
        declareFunction(myName, "join_ordered_link_focal_mapped_problem", "JOIN-ORDERED-LINK-FOCAL-MAPPED-PROBLEM", 1, 0, false);
        declareFunction(myName, "join_ordered_link_has_non_focal_mapped_problemP", "JOIN-ORDERED-LINK-HAS-NON-FOCAL-MAPPED-PROBLEM?", 1, 0, false);
        declareFunction(myName, "join_ordered_link_non_focal_mapped_problem", "JOIN-ORDERED-LINK-NON-FOCAL-MAPPED-PROBLEM", 1, 0, false);
        declareFunction(myName, "join_ordered_link_non_focal_manifestedP", "JOIN-ORDERED-LINK-NON-FOCAL-MANIFESTED?", 1, 0, false);
        declareFunction(myName, "join_ordered_link_focal_problem", "JOIN-ORDERED-LINK-FOCAL-PROBLEM", 1, 0, false);
        declareFunction(myName, "join_ordered_link_non_focal_problem", "JOIN-ORDERED-LINK-NON-FOCAL-PROBLEM", 1, 0, false);
        declareFunction(myName, "join_ordered_link_other_mapped_problem", "JOIN-ORDERED-LINK-OTHER-MAPPED-PROBLEM", 2, 0, false);
        declareFunction(myName, "join_ordered_link_focal_proofs_lookup", "JOIN-ORDERED-LINK-FOCAL-PROOFS-LOOKUP", 2, 0, false);
        declareFunction(myName, "join_ordered_link_non_focal_proofs_lookup", "JOIN-ORDERED-LINK-NON-FOCAL-PROOFS-LOOKUP", 2, 0, false);
        declareFunction(myName, "join_ordered_link_tactic", "JOIN-ORDERED-LINK-TACTIC", 1, 0, false);
        declareFunction(myName, "join_ordered_link_restricted_non_focal_linkP", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK?", 2, 0, false);
        declareFunction(myName, "join_ordered_link_restricted_non_focal_count", "JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-COUNT", 1, 0, false);
        declareFunction(myName, "add_join_ordered_link_focal_proof", "ADD-JOIN-ORDERED-LINK-FOCAL-PROOF", 3, 0, false);
        declareFunction(myName, "remove_join_ordered_link_focal_proof", "REMOVE-JOIN-ORDERED-LINK-FOCAL-PROOF", 3, 0, false);
        declareFunction(myName, "add_join_ordered_link_non_focal_proof", "ADD-JOIN-ORDERED-LINK-NON-FOCAL-PROOF", 3, 0, false);
        declareFunction(myName, "remove_join_ordered_link_non_focal_proof", "REMOVE-JOIN-ORDERED-LINK-NON-FOCAL-PROOF", 3, 0, false);
        declareFunction(myName, "add_join_ordered_link_restricted_non_focal_link", "ADD-JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK", 3, 0, false);
        declareFunction(myName, "remove_join_ordered_link_restricted_non_focal_link", "REMOVE-JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK", 2, 0, false);
        declareFunction(myName, "join_ordered_link_focal_supporting_problem_spec", "JOIN-ORDERED-LINK-FOCAL-SUPPORTING-PROBLEM-SPEC", 1, 0, false);
        declareFunction(myName, "join_ordered_link_non_focal_supporting_problem_spec", "JOIN-ORDERED-LINK-NON-FOCAL-SUPPORTING-PROBLEM-SPEC", 1, 0, false);
        declareFunction(myName, "join_ordered_tactic_p", "JOIN-ORDERED-TACTIC-P", 1, 0, false);
        declareFunction(myName, "single_focal_literal_join_ordered_tactic_p", "SINGLE-FOCAL-LITERAL-JOIN-ORDERED-TACTIC-P", 1, 0, false);
        declareFunction(myName, "new_join_ordered_tactic", "NEW-JOIN-ORDERED-TACTIC", 2, 0, false);
        declareFunction(myName, "join_ordered_tactic_link", "JOIN-ORDERED-TACTIC-LINK", 1, 0, false);
        declareFunction(myName, "join_ordered_tactic_focal_supporting_problem_spec", "JOIN-ORDERED-TACTIC-FOCAL-SUPPORTING-PROBLEM-SPEC", 1, 0, false);
        declareFunction(myName, "join_ordered_tactic_subsumesP", "JOIN-ORDERED-TACTIC-SUBSUMES?", 2, 0, false);
        declareFunction(myName, "find_or_create_join_ordered_tactic_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-TACTIC-FOCAL-MAPPED-PROBLEM", 1, 0, false);
        declareFunction(myName, "find_or_create_join_ordered_tactic_non_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-TACTIC-NON-FOCAL-MAPPED-PROBLEM", 1, 0, false);
        declareFunction(myName, "join_ordered_tactic_focal_problem", "JOIN-ORDERED-TACTIC-FOCAL-PROBLEM", 1, 0, false);
        declareFunction(myName, "determine_new_join_ordered_tactics", "DETERMINE-NEW-JOIN-ORDERED-TACTICS", 2, 0, false);
        declareFunction(myName, "problem_has_a_candidate_early_removal_tacticP", "PROBLEM-HAS-A-CANDIDATE-EARLY-REMOVAL-TACTIC?", 1, 0, false);
        declareFunction(myName, "determine_new_single_literal_join_ordered_tactics", "DETERMINE-NEW-SINGLE-LITERAL-JOIN-ORDERED-TACTICS", 2, 0, false);
        declareFunction(myName, "potentially_simplifying_asentP", "POTENTIALLY-SIMPLIFYING-ASENT?", 1, 0, false);
        declareFunction(myName, "determine_new_single_literal_join_ordered_tactic", "DETERMINE-NEW-SINGLE-LITERAL-JOIN-ORDERED-TACTIC", 4, 0, false);
        declareFunction(myName, "motivated_followup_multi_literal_subclause_specs_case_1", "MOTIVATED-FOLLOWUP-MULTI-LITERAL-SUBCLAUSE-SPECS-CASE-1", 2, 0, false);
        declareFunction(myName, "problem_store_followup_query_problem_p", "PROBLEM-STORE-FOLLOWUP-QUERY-PROBLEM-P", 1, 0, false);
        declareFunction(myName, "motivated_followup_multi_literal_subclause_specs_case_2", "MOTIVATED-FOLLOWUP-MULTI-LITERAL-SUBCLAUSE-SPECS-CASE-2", 2, 0, false);
        declareFunction(myName, "matching_subclause_specs", "MATCHING-SUBCLAUSE-SPECS", 2, 0, false);
        declareFunction(myName, "matching_subclause_index_dictionary", "MATCHING-SUBCLAUSE-INDEX-DICTIONARY", 2, 0, false);
        declareFunction(myName, "matching_subclause_index_dictionary_to_indices_list", "MATCHING-SUBCLAUSE-INDEX-DICTIONARY-TO-INDICES-LIST", 1, 0, false);
        declareFunction(myName, "sub_matching_subclause_specs", "SUB-MATCHING-SUBCLAUSE-SPECS", 2, 0, false);
        declareFunction(myName, "determine_new_join_ordered_tactic", "DETERMINE-NEW-JOIN-ORDERED-TACTIC", 3, 0, false);
        declareFunction(myName, "find_or_create_join_ordered_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-FOCAL-MAPPED-PROBLEM", 4, 0, false);
        declareFunction(myName, "find_or_create_join_ordered_non_focal_mapped_problem", "FIND-OR-CREATE-JOIN-ORDERED-NON-FOCAL-MAPPED-PROBLEM", 4, 0, false);
        declareFunction(myName, "lazily_create_join_ordered_link_non_focal_mapped_problem", "LAZILY-CREATE-JOIN-ORDERED-LINK-NON-FOCAL-MAPPED-PROBLEM", 1, 0, false);
        declareFunction(myName, "compute_join_ordered_problem_subclause_free_vars", "COMPUTE-JOIN-ORDERED-PROBLEM-SUBCLAUSE-FREE-VARS", 4, 0, false);
        declareFunction(myName, "compute_strategic_properties_of_join_ordered_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-JOIN-ORDERED-TACTIC", 2, 0, false);
        declareFunction(myName, "compute_join_ordered_tactic_productivity", "COMPUTE-JOIN-ORDERED-TACTIC-PRODUCTIVITY", 2, 0, false);
        declareFunction(myName, "compute_join_ordered_tactic_preference_level", "COMPUTE-JOIN-ORDERED-TACTIC-PREFERENCE-LEVEL", 2, 0, false);
        declareFunction(myName, "execute_join_ordered_tactic", "EXECUTE-JOIN-ORDERED-TACTIC", 1, 0, false);
        declareFunction(myName, "consider_strategic_ramifications_of_tactic_preference_level", "CONSIDER-STRATEGIC-RAMIFICATIONS-OF-TACTIC-PREFERENCE-LEVEL", 1, 0, false);
        declareFunction(myName, "join_ordered_tactic_lookahead_problem", "JOIN-ORDERED-TACTIC-LOOKAHEAD-PROBLEM", 1, 0, false);
        declareFunction(myName, "new_join_ordered_proof", "NEW-JOIN-ORDERED-PROOF", 2, 0, false);
        declareFunction(myName, "join_ordered_proof_p", "JOIN-ORDERED-PROOF-P", 1, 0, false);
        declareFunction(myName, "connected_conjunction_proof_p", "CONNECTED-CONJUNCTION-PROOF-P", 1, 0, false);
        declareFunction(myName, "new_conjunctive_proof", "NEW-CONJUNCTIVE-PROOF", 2, 0, false);
        declareFunction(myName, "compute_sibling_proof_bindings", "COMPUTE-SIBLING-PROOF-BINDINGS", 3, 0, false);
        declareFunction(myName, "focal_to_non_focal_variable_map", "FOCAL-TO-NON-FOCAL-VARIABLE-MAP", 1, 0, false);
        declareFunction(myName, "memoized_focal_to_non_focal_variable_map_int_internal", "MEMOIZED-FOCAL-TO-NON-FOCAL-VARIABLE-MAP-INT-INTERNAL", 1, 0, false);
        declareFunction(myName, "memoized_focal_to_non_focal_variable_map_int", "MEMOIZED-FOCAL-TO-NON-FOCAL-VARIABLE-MAP-INT", 1, 0, false);
        declareFunction(myName, "focal_to_non_focal_variable_map_int", "FOCAL-TO-NON-FOCAL-VARIABLE-MAP-INT", 1, 0, false);
        declareFunction(myName, "non_focal_to_focal_variable_map", "NON-FOCAL-TO-FOCAL-VARIABLE-MAP", 1, 0, false);
        declareFunction(myName, "memoized_non_focal_to_focal_variable_map_int_internal", "MEMOIZED-NON-FOCAL-TO-FOCAL-VARIABLE-MAP-INT-INTERNAL", 1, 0, false);
        declareFunction(myName, "memoized_non_focal_to_focal_variable_map_int", "MEMOIZED-NON-FOCAL-TO-FOCAL-VARIABLE-MAP-INT", 1, 0, false);
        declareFunction(myName, "non_focal_to_focal_variable_map_int", "NON-FOCAL-TO-FOCAL-VARIABLE-MAP-INT", 1, 0, false);
        declareFunction(myName, "trigger_to_sibling_variable_map", "TRIGGER-TO-SIBLING-VARIABLE-MAP", 2, 0, false);
        declareFunction(myName, "focal_bindings_to_non_focal_bindings", "FOCAL-BINDINGS-TO-NON-FOCAL-BINDINGS", 2, 0, false);
        declareFunction(myName, "non_focal_bindings_to_focal_bindings", "NON-FOCAL-BINDINGS-TO-FOCAL-BINDINGS", 2, 0, false);
        declareFunction(myName, "bubble_up_proof_to_join_ordered_link", "BUBBLE-UP-PROOF-TO-JOIN-ORDERED-LINK", 3, 0, false);
        declareFunction(myName, "trigger_split_restriction", "TRIGGER-SPLIT-RESTRICTION", 2, 0, false);
        declareFunction(myName, "find_split_restriction", "FIND-SPLIT-RESTRICTION", 2, 0, false);
        declareFunction(myName, "find_or_create_split_restriction_int", "FIND-OR-CREATE-SPLIT-RESTRICTION-INT", 3, 0, false);
        declareFunction(myName, "note_all_triggering_proofs_processed", "NOTE-ALL-TRIGGERING-PROOFS-PROCESSED", 1, 0, false);
        declareFunction(myName, "note_restricted_non_focal_finished", "NOTE-RESTRICTED-NON-FOCAL-FINISHED", 2, 0, false);
        declareFunction(myName, "find_or_create_restricted_non_focal_problem", "FIND-OR-CREATE-RESTRICTED-NON-FOCAL-PROBLEM", 2, 0, false);
        declareFunction(myName, "find_restricted_non_focal_problem", "FIND-RESTRICTED-NON-FOCAL-PROBLEM", 2, 0, false);
        declareFunction(myName, "find_or_create_restricted_non_focal_problem_int", "FIND-OR-CREATE-RESTRICTED-NON-FOCAL-PROBLEM-INT", 3, 0, false);
        declareFunction(myName, "find_restricted_problem_and_link", "FIND-RESTRICTED-PROBLEM-AND-LINK", 2, 0, false);
        declareFunction(myName, "find_or_create_restricted_problem_and_link_int", "FIND-OR-CREATE-RESTRICTED-PROBLEM-AND-LINK-INT", 3, 0, false);
        declareFunction(myName, "find_or_create_restricted_problem", "FIND-OR-CREATE-RESTRICTED-PROBLEM", 2, 0, false);
        declareFunction(myName, "find_or_create_restricted_problem_int", "FIND-OR-CREATE-RESTRICTED-PROBLEM-INT", 3, 0, false);
        declareFunction(myName, "focal_problem_is_a_single_literal_backchain_requiredP", "FOCAL-PROBLEM-IS-A-SINGLE-LITERAL-BACKCHAIN-REQUIRED?", 1, 0, false);
        declareFunction(myName, "corresponding_focal_problem", "CORRESPONDING-FOCAL-PROBLEM", 2, 0, false);
        declareFunction(myName, "corresponding_non_focal_problem", "CORRESPONDING-NON-FOCAL-PROBLEM", 2, 0, false);
        declareFunction(myName, "corresponding_restricted_focal_problem", "CORRESPONDING-RESTRICTED-FOCAL-PROBLEM", 2, 0, false);
        declareFunction(myName, "non_focal_restriction_link_with_corresponding_focal_proofP", "NON-FOCAL-RESTRICTION-LINK-WITH-CORRESPONDING-FOCAL-PROOF?", 2, 0, false);
        declareFunction(myName, "corresponding_restricted_non_focal_problem", "CORRESPONDING-RESTRICTED-NON-FOCAL-PROBLEM", 2, 0, false);
        declareFunction(myName, "find_restricted_focal_problem_by_bindings", "FIND-RESTRICTED-FOCAL-PROBLEM-BY-BINDINGS", 2, 0, false);
        declareFunction(myName, "mapped_proof_is_focalP", "MAPPED-PROOF-IS-FOCAL?", 3, 0, false);
        declareFunction(myName, "trigger_vars_shared_by_sibling", "TRIGGER-VARS-SHARED-BY-SIBLING", 2, 0, false);
        declareFunction(myName, "memoized_trigger_vars_shared_by_sibling_int_internal", "MEMOIZED-TRIGGER-VARS-SHARED-BY-SIBLING-INT-INTERNAL", 2, 0, false);
        declareFunction(myName, "memoized_trigger_vars_shared_by_sibling_int", "MEMOIZED-TRIGGER-VARS-SHARED-BY-SIBLING-INT", 2, 0, false);
        declareFunction(myName, "trigger_vars_shared_by_sibling_int", "TRIGGER-VARS-SHARED-BY-SIBLING-INT", 2, 0, false);
        declareFunction(myName, "non_focal_vars_shared_by_focal", "NON-FOCAL-VARS-SHARED-BY-FOCAL", 1, 0, false);
        declareFunction(myName, "focal_vars_shared_by_non_focal", "FOCAL-VARS-SHARED-BY-NON-FOCAL", 1, 0, false);
        declareFunction(myName, "canonicalize_hl_variable_list", "CANONICALIZE-HL-VARIABLE-LIST", 1, 0, false);
        declareFunction(myName, "join_ordered_link_join_vars", "JOIN-ORDERED-LINK-JOIN-VARS", 1, 0, false);
        declareFunction(myName, "join_ordered_link_focal_to_supported_variable_map", "JOIN-ORDERED-LINK-FOCAL-TO-SUPPORTED-VARIABLE-MAP", 1, 0, false);
        declareFunction(myName, "join_ordered_link_non_focal_to_supported_variable_map", "JOIN-ORDERED-LINK-NON-FOCAL-TO-SUPPORTED-VARIABLE-MAP", 1, 0, false);
        declareFunction(myName, "add_join_ordered_link_proof", "ADD-JOIN-ORDERED-LINK-PROOF", 3, 0, false);
        declareFunction(myName, "join_ordered_link_shared_proof_bindings", "JOIN-ORDERED-LINK-SHARED-PROOF-BINDINGS", 3, 0, false);
        declareFunction(myName, "remove_join_ordered_link_proof", "REMOVE-JOIN-ORDERED-LINK-PROOF", 4, 0, false);
        declareFunction(myName, "remove_join_ordered_link_proof_both_ways", "REMOVE-JOIN-ORDERED-LINK-PROOF-BOTH-WAYS", 3, 0, false);
        declareFunction(myName, "join_ordered_link_shared_proof_bindings_int", "JOIN-ORDERED-LINK-SHARED-PROOF-BINDINGS-INT", 3, 0, false);
        declareFunction(myName, "join_ordered_link_sibling_proofs_lookup", "JOIN-ORDERED-LINK-SIBLING-PROOFS-LOOKUP", 3, 0, false);
        declareFunction(myName, "bubble_up_proof_to_join_ordered_link_int", "BUBBLE-UP-PROOF-TO-JOIN-ORDERED-LINK-INT", 4, 0, false);
        declareFunction(myName, "join_ordered_link_sibling_mapped_problem", "JOIN-ORDERED-LINK-SIBLING-MAPPED-PROBLEM", 2, 0, false);
        declareFunction(myName, "join_ordered_link_could_be_finishedP", "JOIN-ORDERED-LINK-COULD-BE-FINISHED?", 2, 0, false);
        declareFunction(myName, "join_ordered_link_no_goodP", "JOIN-ORDERED-LINK-NO-GOOD?", 3, 0, false);
        declareFunction(myName, "join_ordered_link_no_good_case_1P", "JOIN-ORDERED-LINK-NO-GOOD-CASE-1?", 3, 0, false);
        declareFunction(myName, "join_ordered_link_no_good_case_2P", "JOIN-ORDERED-LINK-NO-GOOD-CASE-2?", 3, 0, false);
        declareFunction(myName, "join_ordered_link_with_non_focal_unbound_predicateP", "JOIN-ORDERED-LINK-WITH-NON-FOCAL-UNBOUND-PREDICATE?", 1, 0, false);
        declareFunction(myName, "join_ordered_link_with_non_focal_isa_unbound_unbound_where_arg2_is_restrictedP", "JOIN-ORDERED-LINK-WITH-NON-FOCAL-ISA-UNBOUND-UNBOUND-WHERE-ARG2-IS-RESTRICTED?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_worker_join_ordered_file() {
        $dtp_join_ordered_link_data$ = defconstant("*DTP-JOIN-ORDERED-LINK-DATA*", $sym0$JOIN_ORDERED_LINK_DATA);
        $join_ordered_module$ = defparameter("*JOIN-ORDERED-MODULE*", inference_modules.inference_structural_module($JOIN_ORDERED, UNPROVIDED));
        $max_subclause_spec_cartesian_product_cardinality$ = SubLFiles.defparameter("*MAX-SUBCLAUSE-SPEC-CARTESIAN-PRODUCT-CARDINALITY*", $int$21200);
        return NIL;
    }

    public static SubLObject setup_inference_worker_join_ordered_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_join_ordered_link_data$.getGlobalValue(), Symbols.symbol_function($sym7$JOIN_ORDERED_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        Structures.def_csetf($sym9$JO_LINK_DATA_FOCAL_PROOF_INDEX, $sym10$_CSETF_JO_LINK_DATA_FOCAL_PROOF_INDEX);
        Structures.def_csetf($sym11$JO_LINK_DATA_NON_FOCAL_PROOF_INDEX, $sym12$_CSETF_JO_LINK_DATA_NON_FOCAL_PROOF_INDEX);
        Structures.def_csetf($sym13$JO_LINK_DATA_RESTRICTED_NON_FOCAL_LINK_INDEX, $sym14$_CSETF_JO_LINK_DATA_RESTRICTED_NON_FOCAL_LINK_INDEX);
        Equality.identity($sym0$JOIN_ORDERED_LINK_DATA);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_join_ordered_link_data$.getGlobalValue(), Symbols.symbol_function($sym23$VISIT_DEFSTRUCT_OBJECT_JOIN_ORDERED_LINK_DATA_METHOD));
        access_macros.register_macro_helper($sym31$JOIN_ORDERED_LINK_FOCAL_PROOF_INDEX, $sym56$DO_JOIN_ORDERED_LINK_FOCAL_PROOFS);
        access_macros.register_macro_helper($sym36$JOIN_ORDERED_LINK_NON_FOCAL_PROOF_INDEX, $sym57$DO_JOIN_ORDERED_LINK_NON_FOCAL_PROOFS);
        memoization_state.note_memoized_function($sym76$MEMOIZED_FOCAL_TO_NON_FOCAL_VARIABLE_MAP_INT);
        memoization_state.note_memoized_function($sym78$MEMOIZED_NON_FOCAL_TO_FOCAL_VARIABLE_MAP_INT);
        access_macros.register_macro_helper($sym48$NON_FOCAL_RESTRICTION_LINK_WITH_CORRESPONDING_FOCAL_PROOF_, $list81);
        memoization_state.note_memoized_function($sym82$MEMOIZED_TRIGGER_VARS_SHARED_BY_SIBLING_INT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_worker_join_ordered_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_worker_join_ordered_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_worker_join_ordered_file();
    }

    static {
        me = new inference_worker_join_ordered();
        $dtp_join_ordered_link_data$ = null;
        $join_ordered_module$ = null;
        $max_subclause_spec_cartesian_product_cardinality$ = null;
        $sym0$JOIN_ORDERED_LINK_DATA = makeSymbol("JOIN-ORDERED-LINK-DATA");
        $sym1$JOIN_ORDERED_LINK_DATA_P = makeSymbol("JOIN-ORDERED-LINK-DATA-P");
        $list2 = list(makeSymbol("FOCAL-PROOF-INDEX"), makeSymbol("NON-FOCAL-PROOF-INDEX"), makeSymbol("RESTRICTED-NON-FOCAL-LINK-INDEX"));
        $list3 = list(makeKeyword("FOCAL-PROOF-INDEX"), makeKeyword("NON-FOCAL-PROOF-INDEX"), makeKeyword("RESTRICTED-NON-FOCAL-LINK-INDEX"));
        $list4 = list(makeSymbol("JO-LINK-DATA-FOCAL-PROOF-INDEX"), makeSymbol("JO-LINK-DATA-NON-FOCAL-PROOF-INDEX"), makeSymbol("JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX"));
        $list5 = list(makeSymbol("_CSETF-JO-LINK-DATA-FOCAL-PROOF-INDEX"), makeSymbol("_CSETF-JO-LINK-DATA-NON-FOCAL-PROOF-INDEX"), makeSymbol("_CSETF-JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX"));
        $sym6$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym7$JOIN_ORDERED_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("JOIN-ORDERED-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("JOIN-ORDERED-LINK-DATA-P"));
        $sym9$JO_LINK_DATA_FOCAL_PROOF_INDEX = makeSymbol("JO-LINK-DATA-FOCAL-PROOF-INDEX");
        $sym10$_CSETF_JO_LINK_DATA_FOCAL_PROOF_INDEX = makeSymbol("_CSETF-JO-LINK-DATA-FOCAL-PROOF-INDEX");
        $sym11$JO_LINK_DATA_NON_FOCAL_PROOF_INDEX = makeSymbol("JO-LINK-DATA-NON-FOCAL-PROOF-INDEX");
        $sym12$_CSETF_JO_LINK_DATA_NON_FOCAL_PROOF_INDEX = makeSymbol("_CSETF-JO-LINK-DATA-NON-FOCAL-PROOF-INDEX");
        $sym13$JO_LINK_DATA_RESTRICTED_NON_FOCAL_LINK_INDEX = makeSymbol("JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX");
        $sym14$_CSETF_JO_LINK_DATA_RESTRICTED_NON_FOCAL_LINK_INDEX = makeSymbol("_CSETF-JO-LINK-DATA-RESTRICTED-NON-FOCAL-LINK-INDEX");
        $FOCAL_PROOF_INDEX = makeKeyword("FOCAL-PROOF-INDEX");
        $NON_FOCAL_PROOF_INDEX = makeKeyword("NON-FOCAL-PROOF-INDEX");
        $RESTRICTED_NON_FOCAL_LINK_INDEX = makeKeyword("RESTRICTED-NON-FOCAL-LINK-INDEX");
        $str18$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
        $BEGIN = makeKeyword("BEGIN");
        $sym20$MAKE_JOIN_ORDERED_LINK_DATA = makeSymbol("MAKE-JOIN-ORDERED-LINK-DATA");
        $SLOT = makeKeyword("SLOT");
        $END = makeKeyword("END");
        $sym23$VISIT_DEFSTRUCT_OBJECT_JOIN_ORDERED_LINK_DATA_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-JOIN-ORDERED-LINK-DATA-METHOD");
        $JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
        $sym25$MAPPED_PROBLEM_P = makeSymbol("MAPPED-PROBLEM-P");
        $FREE = makeKeyword("FREE");
        $list27 = list(list(makeSymbol("BINDINGS-VAR"), makeSymbol("PROOF-VAR"), makeSymbol("JOIN-ORDERED-LINK")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym28$INDEX = makeUninternedSymbol("INDEX");
        $sym29$PROOF_LIST_VAR = makeUninternedSymbol("PROOF-LIST-VAR");
        $sym30$CLET = makeSymbol("CLET");
        $sym31$JOIN_ORDERED_LINK_FOCAL_PROOF_INDEX = makeSymbol("JOIN-ORDERED-LINK-FOCAL-PROOF-INDEX");
        $sym32$DO_DICTIONARY = makeSymbol("DO-DICTIONARY");
        $sym33$DO_LIST = makeSymbol("DO-LIST");
        $sym34$INDEX = makeUninternedSymbol("INDEX");
        $sym35$PROOF_LIST_VAR = makeUninternedSymbol("PROOF-LIST-VAR");
        $sym36$JOIN_ORDERED_LINK_NON_FOCAL_PROOF_INDEX = makeSymbol("JOIN-ORDERED-LINK-NON-FOCAL-PROOF-INDEX");
        $list37 = list(list(makeSymbol("RESTRICTED-NON-FOCAL-PROBLEM-VAR"), makeSymbol("JOIN-ORDERED-LINK"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list38 = list(makeKeyword("DONE"));
        $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
        $DONE = makeKeyword("DONE");
        $sym41$LINK_VAR = makeUninternedSymbol("LINK-VAR");
        $sym42$RESTRICTION_LINK = makeUninternedSymbol("RESTRICTION-LINK");
        $sym43$DO_PROBLEM_ARGUMENT_LINKS = makeSymbol("DO-PROBLEM-ARGUMENT-LINKS");
        $sym44$JOIN_ORDERED_LINK_NON_FOCAL_PROBLEM = makeSymbol("JOIN-ORDERED-LINK-NON-FOCAL-PROBLEM");
        $TYPE = makeKeyword("TYPE");
        $RESTRICTION = makeKeyword("RESTRICTION");
        $sym47$PWHEN = makeSymbol("PWHEN");
        $sym48$NON_FOCAL_RESTRICTION_LINK_WITH_CORRESPONDING_FOCAL_PROOF_ = makeSymbol("NON-FOCAL-RESTRICTION-LINK-WITH-CORRESPONDING-FOCAL-PROOF?");
        $sym49$PROBLEM_LINK_SOLE_SUPPORTING_PROBLEM = makeSymbol("PROBLEM-LINK-SOLE-SUPPORTING-PROBLEM");
        $list50 = list(list(makeSymbol("JOIN-ORDERED-LINK-VAR"), makeSymbol("RESTRICTED-NON-FOCAL-PROBLEM"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $sym51$RESTRICTION_LINK = makeUninternedSymbol("RESTRICTION-LINK");
        $sym52$NON_FOCAL_PROBLEM = makeUninternedSymbol("NON-FOCAL-PROBLEM");
        $sym53$DO_PROBLEM_DEPENDENT_LINKS = makeSymbol("DO-PROBLEM-DEPENDENT-LINKS");
        $sym54$PROBLEM_LINK_SUPPORTED_PROBLEM = makeSymbol("PROBLEM-LINK-SUPPORTED-PROBLEM");
        $sym55$JOIN_ORDERED_LINK_RESTRICTED_NON_FOCAL_LINK_ = makeSymbol("JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-LINK?");
        $sym56$DO_JOIN_ORDERED_LINK_FOCAL_PROOFS = makeSymbol("DO-JOIN-ORDERED-LINK-FOCAL-PROOFS");
        $sym57$DO_JOIN_ORDERED_LINK_NON_FOCAL_PROOFS = makeSymbol("DO-JOIN-ORDERED-LINK-NON-FOCAL-PROOFS");
        $str58$Could_not_find_the_tactic_for__a = makeString("Could not find the tactic for ~a");
        $sym59$JOIN_ORDERED_LINK_P = makeSymbol("JOIN-ORDERED-LINK-P");
        $sym60$PROOF_P = makeSymbol("PROOF-P");
        $sym61$RESTRICTION_LINK_P = makeSymbol("RESTRICTION-LINK-P");
        $SKIP = makeKeyword("SKIP");
        $sym63$PROBLEM_P = makeSymbol("PROBLEM-P");
        $NEG = makeKeyword("NEG");
        $POS = makeKeyword("POS");
        $ANSWER = makeKeyword("ANSWER");
        $UNION = makeKeyword("UNION");
        $int$21200 = makeInteger(21200);
        $str69$Too_many_possible_matches_to_chec = makeString("Too many possible matches to check (~A) for problem ~S");
        $sym70$DUPLICATES_ = makeSymbol("DUPLICATES?");
        $sym71$HL_VAR_ = makeSymbol("HL-VAR?");
        $TACTICAL = makeKeyword("TACTICAL");
        $DOOMED = makeKeyword("DOOMED");
        $sym74$STRATEGY_P = makeSymbol("STRATEGY-P");
        $list75 = cons(makeSymbol("SUBPROOF"), makeSymbol("SUB-PROOF-BINDINGS"));
        $sym76$MEMOIZED_FOCAL_TO_NON_FOCAL_VARIABLE_MAP_INT = makeSymbol("MEMOIZED-FOCAL-TO-NON-FOCAL-VARIABLE-MAP-INT");
        $sym77$_EXIT = makeSymbol("%EXIT");
        $sym78$MEMOIZED_NON_FOCAL_TO_FOCAL_VARIABLE_MAP_INT = makeSymbol("MEMOIZED-NON-FOCAL-TO-FOCAL-VARIABLE-MAP-INT");
        $str79$Finding_or_creating_a_restricted_ = makeString("Finding or creating a restricted problem of ~a requires bindings");
        $str80$Creating_a_restricted_problem_of_ = makeString("Creating a restricted problem of ~a requires bindings");
        $list81 = list(makeSymbol("DO-JOIN-ORDERED-LINK-RESTRICTED-NON-FOCAL-PROBLEMS"), makeSymbol("DO-VIRTUAL-DEPENDENT-JOIN-ORDERED-LINKS"));
        $sym82$MEMOIZED_TRIGGER_VARS_SHARED_BY_SIBLING_INT = makeSymbol("MEMOIZED-TRIGGER-VARS-SHARED-BY-SIBLING-INT");
        $sym83$VARIABLE_P = makeSymbol("VARIABLE-P");
        $sym84$VARIABLE_BINDING_VARIABLE = makeSymbol("VARIABLE-BINDING-VARIABLE");
        $str85$_a_was_a_rejected_proof = makeString("~a was a rejected proof");
        $sym86$PROOF_PROVEN_ = makeSymbol("PROOF-PROVEN?");
        $PREFERRED = makeKeyword("PREFERRED");
        $list88 = list(makeSymbol("MT"), makeSymbol("ASENT"));
        $$isa = makeConstSym(("isa"));
    }

    public static class $join_ordered_link_data_native extends SubLStructNative {
        public SubLObject $focal_proof_index;
        public SubLObject $non_focal_proof_index;
        public SubLObject $restricted_non_focal_link_index;
        private static SubLStructDeclNative structDecl;

        public $join_ordered_link_data_native() {
            this.$focal_proof_index = CommonSymbols.NIL;
            this.$non_focal_proof_index = CommonSymbols.NIL;
            this.$restricted_non_focal_link_index = CommonSymbols.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return $join_ordered_link_data_native.structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$focal_proof_index;
        }

        @Override
        public SubLObject getField3() {
            return this.$non_focal_proof_index;
        }

        @Override
        public SubLObject getField4() {
            return this.$restricted_non_focal_link_index;
        }

        @Override
        public SubLObject setField2(SubLObject value) {
            return this.$focal_proof_index = value;
        }

        @Override
        public SubLObject setField3(SubLObject value) {
            return this.$non_focal_proof_index = value;
        }

        @Override
        public SubLObject setField4(SubLObject value) {
            return this.$restricted_non_focal_link_index = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative($join_ordered_link_data_native.class, $sym0$JOIN_ORDERED_LINK_DATA, $sym1$JOIN_ORDERED_LINK_DATA_P, $list2, $list3, new String[] { "$focal_proof_index", "$non_focal_proof_index", "$restricted_non_focal_link_index" }, $list4, $list5,
                    $sym6$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static class $join_ordered_link_data_p$UnaryFunction extends UnaryFunction {
        public $join_ordered_link_data_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("JOIN-ORDERED-LINK-DATA-P"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return join_ordered_link_data_p(arg1);
        }
    }
}
/*
 *
 * Total time: 587 ms synthetic
 */