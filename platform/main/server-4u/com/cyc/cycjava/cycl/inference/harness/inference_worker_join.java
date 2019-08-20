/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.bindings.apply_bindings_backwards;
import static com.cyc.cycjava.cycl.bindings.bindings_equalP;
import static com.cyc.cycjava.cycl.bindings.filter_bindings_by_variables;
import static com.cyc.cycjava.cycl.bindings.transfer_variable_map_to_bindings;
import static com.cyc.cycjava.cycl.bindings.transfer_variable_map_to_bindings_filtered;
import static com.cyc.cycjava.cycl.bindings.variable_binding_value;
import static com.cyc.cycjava.cycl.clause_utilities.binary_clause_p;
import static com.cyc.cycjava.cycl.clause_utilities.new_single_literal_subclause_spec;
import static com.cyc.cycjava.cycl.clause_utilities.subclause_spec_p;
import static com.cyc.cycjava.cycl.clauses.neg_lits;
import static com.cyc.cycjava.cycl.clauses.pos_lits;
import static com.cyc.cycjava.cycl.dictionary.clear_dictionary;
import static com.cyc.cycjava.cycl.dictionary.dictionary_lookup;
import static com.cyc.cycjava.cycl.dictionary.dictionary_p;
import static com.cyc.cycjava.cycl.dictionary.new_dictionary;
import static com.cyc.cycjava.cycl.dictionary_utilities.dictionary_delete_from_value;
import static com.cyc.cycjava.cycl.dictionary_utilities.dictionary_push;
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
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store.problem_store_inference_id_index;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_bindings;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_p;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_provenP;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_supported_problem;
import static com.cyc.cycjava.cycl.inference.harness.inference_datastructures_proof.proof_type;
import static com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_level_L;
import static com.cyc.cycjava.cycl.inference.modules.preference_modules.preference_level_p;
import static com.cyc.cycjava.cycl.list_utilities.cartesian_product;
import static com.cyc.cycjava.cycl.list_utilities.remove_if_not;
import static com.cyc.cycjava.cycl.list_utilities.singletonP;
import static com.cyc.cycjava.cycl.set.do_set_internal;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_basis_object;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_doneP;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_element_validP;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_initial_state;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_next;
import static com.cyc.cycjava.cycl.set_contents.do_set_contents_update_state;
import static com.cyc.cycjava.cycl.subl_promotions.memberP;
import static com.cyc.cycjava.cycl.variables.sort_hl_variable_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
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
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-WORKER-JOIN
 * source file: /cyc/top/cycl/inference/harness/inference-worker-join.lisp
 * created:     2019/07/03 17:37:40
 */
public final class inference_worker_join extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new inference_worker_join();



    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_join_link_data$ = makeSymbol("*DTP-JOIN-LINK-DATA*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $join_module$ = makeSymbol("*JOIN-MODULE*");

    // defparameter
    /**
     *
     *
     * @unknown a scaling factor by which to reduce the estimated productivities of join tactics.
    This should really be done by adding an additional cost factor to consider instead of
    lumping it into productivity.
     */
    @LispMethod(comment = "@unknown a scaling factor by which to reduce the estimated productivities of join tactics.\r\nThis should really be done by adding an additional cost factor to consider instead of\r\nlumping it into productivity.\ndefparameter")
    private static final SubLSymbol $join_productivity_scaling_factor$ = makeSymbol("*JOIN-PRODUCTIVITY-SCALING-FACTOR*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol JOIN_LINK_DATA = makeSymbol("JOIN-LINK-DATA");

    private static final SubLSymbol JOIN_LINK_DATA_P = makeSymbol("JOIN-LINK-DATA-P");

    static private final SubLList $list2 = list(makeSymbol("JOIN-VARS"), makeSymbol("FIRST-PROOF-INDEX"), makeSymbol("SECOND-PROOF-INDEX"));

    static private final SubLList $list3 = list(makeKeyword("JOIN-VARS"), makeKeyword("FIRST-PROOF-INDEX"), makeKeyword("SECOND-PROOF-INDEX"));

    static private final SubLList $list4 = list(makeSymbol("J-LINK-DATA-JOIN-VARS"), makeSymbol("J-LINK-DATA-FIRST-PROOF-INDEX"), makeSymbol("J-LINK-DATA-SECOND-PROOF-INDEX"));

    static private final SubLList $list5 = list(makeSymbol("_CSETF-J-LINK-DATA-JOIN-VARS"), makeSymbol("_CSETF-J-LINK-DATA-FIRST-PROOF-INDEX"), makeSymbol("_CSETF-J-LINK-DATA-SECOND-PROOF-INDEX"));

    private static final SubLSymbol JOIN_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("JOIN-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE");

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

    static private final SubLSymbol $sym28$INDEX = makeUninternedSymbol("INDEX");

    static private final SubLSymbol $sym29$PROOF_LIST_VAR = makeUninternedSymbol("PROOF-LIST-VAR");

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

    public static final SubLObject join_link_data_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject join_link_data_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject join_link_data_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.harness.inference_worker_join.$join_link_data_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject join_link_data_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.inference.harness.inference_worker_join.$join_link_data_native.class ? T : NIL;
    }

    public static final SubLObject j_link_data_join_vars_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, JOIN_LINK_DATA_P);
        return v_object.getField2();
    }

    public static SubLObject j_link_data_join_vars(final SubLObject v_object) {
        assert NIL != inference_worker_join.join_link_data_p(v_object) : "! inference_worker_join.join_link_data_p(v_object) " + "inference_worker_join.join_link_data_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject j_link_data_first_proof_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, JOIN_LINK_DATA_P);
        return v_object.getField3();
    }

    public static SubLObject j_link_data_first_proof_index(final SubLObject v_object) {
        assert NIL != inference_worker_join.join_link_data_p(v_object) : "! inference_worker_join.join_link_data_p(v_object) " + "inference_worker_join.join_link_data_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject j_link_data_second_proof_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, JOIN_LINK_DATA_P);
        return v_object.getField4();
    }

    public static SubLObject j_link_data_second_proof_index(final SubLObject v_object) {
        assert NIL != inference_worker_join.join_link_data_p(v_object) : "! inference_worker_join.join_link_data_p(v_object) " + "inference_worker_join.join_link_data_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_j_link_data_join_vars_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, JOIN_LINK_DATA_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_j_link_data_join_vars(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_worker_join.join_link_data_p(v_object) : "! inference_worker_join.join_link_data_p(v_object) " + "inference_worker_join.join_link_data_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_j_link_data_first_proof_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, JOIN_LINK_DATA_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_j_link_data_first_proof_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_worker_join.join_link_data_p(v_object) : "! inference_worker_join.join_link_data_p(v_object) " + "inference_worker_join.join_link_data_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_j_link_data_second_proof_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, JOIN_LINK_DATA_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_j_link_data_second_proof_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != inference_worker_join.join_link_data_p(v_object) : "! inference_worker_join.join_link_data_p(v_object) " + "inference_worker_join.join_link_data_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_join_link_data_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.inference.harness.inference_worker_join.$join_link_data_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($JOIN_VARS)) {
                        com.cyc.cycjava.cycl.inference.harness.inference_worker_join._csetf_j_link_data_join_vars(v_new, current_value);
                    } else {
                        if (pcase_var.eql($FIRST_PROOF_INDEX)) {
                            com.cyc.cycjava.cycl.inference.harness.inference_worker_join._csetf_j_link_data_first_proof_index(v_new, current_value);
                        } else {
                            if (pcase_var.eql($SECOND_PROOF_INDEX)) {
                                com.cyc.cycjava.cycl.inference.harness.inference_worker_join._csetf_j_link_data_second_proof_index(v_new, current_value);
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

    public static SubLObject make_join_link_data(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.inference.harness.inference_worker_join.$join_link_data_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($JOIN_VARS)) {
                inference_worker_join._csetf_j_link_data_join_vars(v_new, current_value);
            } else
                if (pcase_var.eql(inference_worker_join.$FIRST_PROOF_INDEX)) {
                    inference_worker_join._csetf_j_link_data_first_proof_index(v_new, current_value);
                } else
                    if (pcase_var.eql(inference_worker_join.$SECOND_PROOF_INDEX)) {
                        inference_worker_join._csetf_j_link_data_second_proof_index(v_new, current_value);
                    } else {
                        Errors.error(inference_worker_join.$str18$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_join_link_data(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, inference_worker_join.MAKE_JOIN_LINK_DATA, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $JOIN_VARS, inference_worker_join.j_link_data_join_vars(obj));
        funcall(visitor_fn, obj, $SLOT, inference_worker_join.$FIRST_PROOF_INDEX, inference_worker_join.j_link_data_first_proof_index(obj));
        funcall(visitor_fn, obj, $SLOT, inference_worker_join.$SECOND_PROOF_INDEX, inference_worker_join.j_link_data_second_proof_index(obj));
        funcall(visitor_fn, obj, $END, inference_worker_join.MAKE_JOIN_LINK_DATA, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_join_link_data_method(final SubLObject obj, final SubLObject visitor_fn) {
        return inference_worker_join.visit_defstruct_join_link_data(obj, visitor_fn);
    }

    public static final SubLObject valid_join_link_data_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_data_p(v_object)) && (NIL != dictionary.dictionary_p(com.cyc.cycjava.cycl.inference.harness.inference_worker_join.j_link_data_first_proof_index(v_object))));
    }

    public static SubLObject valid_join_link_data_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_worker_join.join_link_data_p(v_object)) && (NIL != dictionary_p(inference_worker_join.j_link_data_first_proof_index(v_object))));
    }

    public static final SubLObject new_join_link_data_alt(SubLObject first_mapped_problem, SubLObject second_mapped_problem) {
        {
            SubLObject data = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.make_join_link_data(UNPROVIDED);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_join._csetf_j_link_data_join_vars(data, com.cyc.cycjava.cycl.inference.harness.inference_worker_join.shared_sibling_vars(first_mapped_problem, second_mapped_problem));
            com.cyc.cycjava.cycl.inference.harness.inference_worker_join._csetf_j_link_data_first_proof_index(data, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
            com.cyc.cycjava.cycl.inference.harness.inference_worker_join._csetf_j_link_data_second_proof_index(data, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
            return data;
        }
    }

    public static SubLObject new_join_link_data(final SubLObject first_mapped_problem, final SubLObject second_mapped_problem) {
        final SubLObject data = inference_worker_join.make_join_link_data(UNPROVIDED);
        inference_worker_join._csetf_j_link_data_join_vars(data, inference_worker_join.shared_sibling_vars(first_mapped_problem, second_mapped_problem));
        inference_worker_join._csetf_j_link_data_first_proof_index(data, new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        inference_worker_join._csetf_j_link_data_second_proof_index(data, new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        return data;
    }

    public static final SubLObject join_link_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_problem_link.problem_link_p(v_object)) && ($JOIN == inference_datastructures_problem_link.problem_link_type(v_object)));
    }

    public static SubLObject join_link_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_problem_link.problem_link_p(v_object)) && ($JOIN == inference_datastructures_problem_link.problem_link_type(v_object)));
    }

    /**
     *
     *
     * @return join-link-p, either the already existing one or a new one.
     */
    @LispMethod(comment = "@return join-link-p, either the already existing one or a new one.")
    public static final SubLObject maybe_new_join_link_alt(SubLObject supported_problem, SubLObject first_supporting_mapped_problem, SubLObject second_supporting_mapped_problem) {
        {
            SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(supported_problem);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject candidate_link = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, candidate_link)) {
                        if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(candidate_link, $JOIN)) {
                            if ((NIL != inference_datastructures_problem_link.mapped_problem_equal(first_supporting_mapped_problem, com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_first_mapped_problem(candidate_link))) && (NIL != inference_datastructures_problem_link.mapped_problem_equal(second_supporting_mapped_problem, com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_second_mapped_problem(candidate_link)))) {
                                return candidate_link;
                            }
                        }
                    }
                }
            }
        }
        return com.cyc.cycjava.cycl.inference.harness.inference_worker_join.new_join_link(supported_problem, first_supporting_mapped_problem, second_supporting_mapped_problem);
    }

    /**
     *
     *
     * @return join-link-p, either the already existing one or a new one.
     */
    @LispMethod(comment = "@return join-link-p, either the already existing one or a new one.")
    public static SubLObject maybe_new_join_link(final SubLObject supported_problem, final SubLObject first_supporting_mapped_problem, final SubLObject second_supporting_mapped_problem) {
        final SubLObject set_contents_var = inference_datastructures_problem.problem_argument_links(supported_problem);
        SubLObject basis_object;
        SubLObject state;
        SubLObject candidate_link;
        for (basis_object = do_set_contents_basis_object(set_contents_var), state = NIL, state = do_set_contents_initial_state(basis_object, set_contents_var); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
            candidate_link = do_set_contents_next(basis_object, state);
            if ((((NIL != do_set_contents_element_validP(state, candidate_link)) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(candidate_link, $JOIN))) && (NIL != inference_datastructures_problem_link.mapped_problem_equal(first_supporting_mapped_problem, inference_worker_join.join_link_first_mapped_problem(candidate_link)))) && (NIL != inference_datastructures_problem_link.mapped_problem_equal(second_supporting_mapped_problem, inference_worker_join.join_link_second_mapped_problem(candidate_link)))) {
                return candidate_link;
            }
        }
        return inference_worker_join.new_join_link(supported_problem, first_supporting_mapped_problem, second_supporting_mapped_problem);
    }

    public static final SubLObject new_join_link_alt(SubLObject supported_problem, SubLObject first_supporting_mapped_problem, SubLObject second_supporting_mapped_problem) {
        SubLTrampolineFile.checkType(first_supporting_mapped_problem, MAPPED_PROBLEM_P);
        SubLTrampolineFile.checkType(second_supporting_mapped_problem, MAPPED_PROBLEM_P);
        {
            SubLObject link = inference_datastructures_problem_link.new_problem_link($JOIN, supported_problem);
            SubLObject data = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.new_join_link_data(first_supporting_mapped_problem, second_supporting_mapped_problem);
            inference_datastructures_problem_link.set_problem_link_data(link, data);
            inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(second_supporting_mapped_problem, link);
            inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(first_supporting_mapped_problem, link);
            inference_worker.propagate_problem_link(link);
            return link;
        }
    }

    public static SubLObject new_join_link(final SubLObject supported_problem, final SubLObject first_supporting_mapped_problem, final SubLObject second_supporting_mapped_problem) {
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(first_supporting_mapped_problem) : "! inference_datastructures_problem_link.mapped_problem_p(first_supporting_mapped_problem) " + ("inference_datastructures_problem_link.mapped_problem_p(first_supporting_mapped_problem) " + "CommonSymbols.NIL != inference_datastructures_problem_link.mapped_problem_p(first_supporting_mapped_problem) ") + first_supporting_mapped_problem;
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(second_supporting_mapped_problem) : "! inference_datastructures_problem_link.mapped_problem_p(second_supporting_mapped_problem) " + ("inference_datastructures_problem_link.mapped_problem_p(second_supporting_mapped_problem) " + "CommonSymbols.NIL != inference_datastructures_problem_link.mapped_problem_p(second_supporting_mapped_problem) ") + second_supporting_mapped_problem;
        final SubLObject link = inference_datastructures_problem_link.new_problem_link($JOIN, supported_problem);
        final SubLObject data = inference_worker_join.new_join_link_data(first_supporting_mapped_problem, second_supporting_mapped_problem);
        inference_datastructures_problem_link.set_problem_link_data(link, data);
        inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(second_supporting_mapped_problem, link);
        inference_datastructures_problem_link.connect_supporting_mapped_problem_with_dependent_link(first_supporting_mapped_problem, link);
        inference_worker.propagate_problem_link(link);
        return link;
    }

    public static final SubLObject destroy_join_link_alt(SubLObject join_link) {
        {
            SubLObject tactic = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_tactic_int(join_link);
            if (NIL != inference_datastructures_tactic.valid_tactic_p(tactic)) {
                inference_datastructures_tactic.destroy_problem_tactic_and_backpointers(tactic);
            }
        }
        {
            SubLObject data = inference_datastructures_problem_link.problem_link_data(join_link);
            if (NIL != com.cyc.cycjava.cycl.inference.harness.inference_worker_join.valid_join_link_data_p(data)) {
                com.cyc.cycjava.cycl.inference.harness.inference_worker_join._csetf_j_link_data_join_vars(data, $FREE);
                dictionary.clear_dictionary(com.cyc.cycjava.cycl.inference.harness.inference_worker_join.j_link_data_first_proof_index(data));
                com.cyc.cycjava.cycl.inference.harness.inference_worker_join._csetf_j_link_data_first_proof_index(data, $FREE);
                dictionary.clear_dictionary(com.cyc.cycjava.cycl.inference.harness.inference_worker_join.j_link_data_second_proof_index(data));
                com.cyc.cycjava.cycl.inference.harness.inference_worker_join._csetf_j_link_data_second_proof_index(data, $FREE);
            }
        }
        return join_link;
    }

    public static SubLObject destroy_join_link(final SubLObject join_link) {
        final SubLObject tactic = inference_worker_join.join_link_tactic_int(join_link);
        if (NIL != inference_datastructures_tactic.valid_tactic_p(tactic)) {
            inference_datastructures_tactic.destroy_problem_tactic_and_backpointers(tactic);
        }
        final SubLObject data = inference_datastructures_problem_link.problem_link_data(join_link);
        if (NIL != inference_worker_join.valid_join_link_data_p(data)) {
            inference_worker_join._csetf_j_link_data_join_vars(data, $FREE);
            clear_dictionary(inference_worker_join.j_link_data_first_proof_index(data));
            inference_worker_join._csetf_j_link_data_first_proof_index(data, $FREE);
            clear_dictionary(inference_worker_join.j_link_data_second_proof_index(data));
            inference_worker_join._csetf_j_link_data_second_proof_index(data, $FREE);
        }
        return join_link;
    }

    public static final SubLObject do_join_link_first_proofs_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt21);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject bindings_var = NIL;
                    SubLObject proof_var = NIL;
                    SubLObject join_link = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    bindings_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    proof_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    join_link = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject index = $sym22$INDEX;
                            SubLObject proof_list_var = $sym23$PROOF_LIST_VAR;
                            return list(CLET, list(list(index, list(JOIN_LINK_FIRST_PROOF_INDEX, join_link))), list(DO_DICTIONARY, list(bindings_var, proof_list_var, index), listS(DO_LIST, list(proof_var, proof_list_var), append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt21);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_join_link_first_proofs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, inference_worker_join.$list27);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject bindings_var = NIL;
        SubLObject proof_var = NIL;
        SubLObject join_link = NIL;
        destructuring_bind_must_consp(current, datum, inference_worker_join.$list27);
        bindings_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_worker_join.$list27);
        proof_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_worker_join.$list27);
        join_link = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject index = inference_worker_join.$sym28$INDEX;
            final SubLObject proof_list_var = inference_worker_join.$sym29$PROOF_LIST_VAR;
            return list(CLET, list(list(index, list(inference_worker_join.JOIN_LINK_FIRST_PROOF_INDEX, join_link))), list(DO_DICTIONARY, list(bindings_var, proof_list_var, index), listS(DO_LIST, list(proof_var, proof_list_var), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, inference_worker_join.$list27);
        return NIL;
    }

    public static final SubLObject do_join_link_second_proofs_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt21);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject bindings_var = NIL;
                    SubLObject proof_var = NIL;
                    SubLObject join_link = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    bindings_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    proof_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    join_link = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject index = $sym28$INDEX;
                            SubLObject proof_list_var = $sym29$PROOF_LIST_VAR;
                            return list(CLET, list(list(index, list(JOIN_LINK_SECOND_PROOF_INDEX, join_link))), list(DO_DICTIONARY, list(bindings_var, proof_list_var, index), listS(DO_LIST, list(proof_var, proof_list_var), append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt21);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_join_link_second_proofs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, inference_worker_join.$list27);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject bindings_var = NIL;
        SubLObject proof_var = NIL;
        SubLObject join_link = NIL;
        destructuring_bind_must_consp(current, datum, inference_worker_join.$list27);
        bindings_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_worker_join.$list27);
        proof_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, inference_worker_join.$list27);
        join_link = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject index = inference_worker_join.$sym34$INDEX;
            final SubLObject proof_list_var = inference_worker_join.$sym35$PROOF_LIST_VAR;
            return list(CLET, list(list(index, list(inference_worker_join.JOIN_LINK_SECOND_PROOF_INDEX, join_link))), list(DO_DICTIONARY, list(bindings_var, proof_list_var, index), listS(DO_LIST, list(proof_var, proof_list_var), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, inference_worker_join.$list27);
        return NIL;
    }

    public static final SubLObject join_link_join_vars_alt(SubLObject join_link) {
        return com.cyc.cycjava.cycl.inference.harness.inference_worker_join.j_link_data_join_vars(inference_datastructures_problem_link.problem_link_data(join_link));
    }

    public static SubLObject join_link_join_vars(final SubLObject join_link) {
        return inference_worker_join.j_link_data_join_vars(inference_datastructures_problem_link.problem_link_data(join_link));
    }

    public static final SubLObject join_link_first_proof_index_alt(SubLObject join_link) {
        return com.cyc.cycjava.cycl.inference.harness.inference_worker_join.j_link_data_first_proof_index(inference_datastructures_problem_link.problem_link_data(join_link));
    }

    public static SubLObject join_link_first_proof_index(final SubLObject join_link) {
        return inference_worker_join.j_link_data_first_proof_index(inference_datastructures_problem_link.problem_link_data(join_link));
    }

    public static final SubLObject join_link_second_proof_index_alt(SubLObject join_link) {
        return com.cyc.cycjava.cycl.inference.harness.inference_worker_join.j_link_data_second_proof_index(inference_datastructures_problem_link.problem_link_data(join_link));
    }

    public static SubLObject join_link_second_proof_index(final SubLObject join_link) {
        return inference_worker_join.j_link_data_second_proof_index(inference_datastructures_problem_link.problem_link_data(join_link));
    }

    public static final SubLObject join_link_first_mapped_problem_alt(SubLObject join_link) {
        return inference_datastructures_problem_link.problem_link_supporting_mapped_problems(join_link).first();
    }

    public static SubLObject join_link_first_mapped_problem(final SubLObject join_link) {
        return inference_datastructures_problem_link.problem_link_supporting_mapped_problems(join_link).first();
    }

    public static final SubLObject join_link_second_mapped_problem_alt(SubLObject join_link) {
        return second(inference_datastructures_problem_link.problem_link_supporting_mapped_problems(join_link));
    }

    public static SubLObject join_link_second_mapped_problem(final SubLObject join_link) {
        return second(inference_datastructures_problem_link.problem_link_supporting_mapped_problems(join_link));
    }

    public static final SubLObject join_link_first_problem_alt(SubLObject join_link) {
        return inference_datastructures_problem_link.mapped_problem_problem(com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_first_mapped_problem(join_link));
    }

    public static SubLObject join_link_first_problem(final SubLObject join_link) {
        return inference_datastructures_problem_link.mapped_problem_problem(inference_worker_join.join_link_first_mapped_problem(join_link));
    }

    public static final SubLObject join_link_second_problem_alt(SubLObject join_link) {
        return inference_datastructures_problem_link.mapped_problem_problem(com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_second_mapped_problem(join_link));
    }

    public static SubLObject join_link_second_problem(final SubLObject join_link) {
        return inference_datastructures_problem_link.mapped_problem_problem(inference_worker_join.join_link_second_mapped_problem(join_link));
    }

    public static final SubLObject join_link_trigger_variable_map_alt(SubLObject join_link, SubLObject trigger_is_firstP) {
        return inference_datastructures_problem_link.mapped_problem_variable_map(com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_trigger_mapped_problem(join_link, trigger_is_firstP));
    }

    public static SubLObject join_link_trigger_variable_map(final SubLObject join_link, final SubLObject trigger_is_firstP) {
        return inference_datastructures_problem_link.mapped_problem_variable_map(inference_worker_join.join_link_trigger_mapped_problem(join_link, trigger_is_firstP));
    }

    public static final SubLObject join_link_trigger_mapped_problem_alt(SubLObject join_link, SubLObject trigger_is_firstP) {
        return NIL != trigger_is_firstP ? ((SubLObject) (com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_first_mapped_problem(join_link))) : com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_second_mapped_problem(join_link);
    }

    public static SubLObject join_link_trigger_mapped_problem(final SubLObject join_link, final SubLObject trigger_is_firstP) {
        return NIL != trigger_is_firstP ? inference_worker_join.join_link_first_mapped_problem(join_link) : inference_worker_join.join_link_second_mapped_problem(join_link);
    }

    public static final SubLObject join_link_sibling_mapped_problem_alt(SubLObject join_link, SubLObject trigger_is_firstP) {
        return NIL != trigger_is_firstP ? ((SubLObject) (com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_second_mapped_problem(join_link))) : com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_first_mapped_problem(join_link);
    }

    public static SubLObject join_link_sibling_mapped_problem(final SubLObject join_link, final SubLObject trigger_is_firstP) {
        return NIL != trigger_is_firstP ? inference_worker_join.join_link_second_mapped_problem(join_link) : inference_worker_join.join_link_first_mapped_problem(join_link);
    }

    public static final SubLObject join_link_first_proofs_lookup_alt(SubLObject join_link, SubLObject proof_bindings) {
        {
            SubLObject index = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_first_proof_index(join_link);
            SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(proof_bindings);
            SubLObject first_proofs = dictionary.dictionary_lookup(index, canonical_proof_bindings, UNPROVIDED);
            return first_proofs;
        }
    }

    public static SubLObject join_link_first_proofs_lookup(final SubLObject join_link, final SubLObject proof_bindings) {
        final SubLObject index = inference_worker_join.join_link_first_proof_index(join_link);
        final SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(proof_bindings);
        final SubLObject first_proofs = dictionary_lookup(index, canonical_proof_bindings, UNPROVIDED);
        return first_proofs;
    }

    public static final SubLObject join_link_second_proofs_lookup_alt(SubLObject join_link, SubLObject proof_bindings) {
        {
            SubLObject index = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_second_proof_index(join_link);
            SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(proof_bindings);
            SubLObject second_proofs = dictionary.dictionary_lookup(index, canonical_proof_bindings, UNPROVIDED);
            return second_proofs;
        }
    }

    public static SubLObject join_link_second_proofs_lookup(final SubLObject join_link, final SubLObject proof_bindings) {
        final SubLObject index = inference_worker_join.join_link_second_proof_index(join_link);
        final SubLObject canonical_proof_bindings = inference_worker.canonicalize_proof_bindings(proof_bindings);
        final SubLObject second_proofs = dictionary_lookup(index, canonical_proof_bindings, UNPROVIDED);
        return second_proofs;
    }

    public static final SubLObject join_link_sibling_proofs_lookup_alt(SubLObject join_link, SubLObject trigger_proof_bindings_wrt_supported, SubLObject trigger_is_firstP) {
        return NIL != trigger_is_firstP ? ((SubLObject) (com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_second_proofs_lookup(join_link, trigger_proof_bindings_wrt_supported))) : com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_first_proofs_lookup(join_link, trigger_proof_bindings_wrt_supported);
    }

    public static SubLObject join_link_sibling_proofs_lookup(final SubLObject join_link, final SubLObject trigger_proof_bindings_wrt_supported, final SubLObject trigger_is_firstP) {
        return NIL != trigger_is_firstP ? inference_worker_join.join_link_second_proofs_lookup(join_link, trigger_proof_bindings_wrt_supported) : inference_worker_join.join_link_first_proofs_lookup(join_link, trigger_proof_bindings_wrt_supported);
    }

    public static final SubLObject join_link_shared_proof_bindings_alt(SubLObject join_link, SubLObject trigger_proof_bindings, SubLObject trigger_is_firstP) {
        {
            SubLObject shared_supported_vars = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_join_vars(join_link);
            SubLObject trigger_to_supported_variable_map = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_trigger_variable_map(join_link, trigger_is_firstP);
            SubLObject trigger_proof_bindings_wrt_supported = bindings.transfer_variable_map_to_bindings_filtered(trigger_to_supported_variable_map, trigger_proof_bindings);
            SubLObject shared_trigger_proof_bindings_wrt_supported = bindings.filter_bindings_by_variables(trigger_proof_bindings_wrt_supported, shared_supported_vars);
            return shared_trigger_proof_bindings_wrt_supported;
        }
    }

    public static SubLObject join_link_shared_proof_bindings(final SubLObject join_link, final SubLObject trigger_proof_bindings, final SubLObject trigger_is_firstP) {
        final SubLObject shared_supported_vars = inference_worker_join.join_link_join_vars(join_link);
        final SubLObject trigger_to_supported_variable_map = inference_worker_join.join_link_trigger_variable_map(join_link, trigger_is_firstP);
        final SubLObject trigger_proof_bindings_wrt_supported = transfer_variable_map_to_bindings_filtered(trigger_to_supported_variable_map, trigger_proof_bindings);
        final SubLObject shared_trigger_proof_bindings_wrt_supported = filter_bindings_by_variables(trigger_proof_bindings_wrt_supported, shared_supported_vars);
        return shared_trigger_proof_bindings_wrt_supported;
    }

    public static final SubLObject join_link_tactic_alt(SubLObject join_link) {
        {
            SubLObject join_tactic = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_tactic_int(join_link);
            if (NIL != join_tactic) {
                return join_tactic;
            } else {
                if (NIL == inference_datastructures_problem.tactically_unexamined_problem_p(inference_datastructures_problem_link.problem_link_supported_problem(join_link))) {
                    return Errors.error($str_alt33$couldn_t_find_the_join_tactic_for, join_link);
                }
            }
        }
        return NIL;
    }

    public static SubLObject join_link_tactic(final SubLObject join_link) {
        final SubLObject join_tactic = inference_worker_join.join_link_tactic_int(join_link);
        if (NIL != join_tactic) {
            return join_tactic;
        }
        if (NIL == inference_datastructures_problem.tactically_unexamined_problem_p(inference_datastructures_problem_link.problem_link_supported_problem(join_link))) {
            return Errors.error(inference_worker_join.$str39$couldn_t_find_the_join_tactic_for, join_link);
        }
        return NIL;
    }

    public static final SubLObject join_link_tactic_int_alt(SubLObject join_link) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(join_link);
                SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(supported_problem);
                SubLObject join_tactic = NIL;
                for (join_tactic = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , join_tactic = cdolist_list_var.first()) {
                    if (NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match(join_tactic, $join_module$.getDynamicValue(thread))) {
                        if (join_link == com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_tactic_link(join_tactic)) {
                            return join_tactic;
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject join_link_tactic_int(final SubLObject join_link) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject supported_problem = inference_datastructures_problem_link.problem_link_supported_problem(join_link);
        SubLObject cdolist_list_var = inference_datastructures_problem.problem_tactics(supported_problem);
        SubLObject join_tactic = NIL;
        join_tactic = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != inference_datastructures_problem.do_problem_tactics_hl_module_match(join_tactic, inference_worker_join.$join_module$.getDynamicValue(thread))) && join_link.eql(inference_worker_join.join_tactic_link(join_tactic))) {
                return join_tactic;
            }
            cdolist_list_var = cdolist_list_var.rest();
            join_tactic = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Indexes PROOF by BINDINGS as a first proof in JOIN-LINK
     */
    @LispMethod(comment = "Indexes PROOF by BINDINGS as a first proof in JOIN-LINK")
    public static final SubLObject add_join_link_first_proof_alt(SubLObject join_link, SubLObject v_bindings, SubLObject proof) {
        SubLTrampolineFile.checkType(join_link, JOIN_LINK_P);
        SubLTrampolineFile.checkType(proof, PROOF_P);
        {
            SubLObject index = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_first_proof_index(join_link);
            SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
            dictionary_utilities.dictionary_push(index, canonical_bindings, proof);
        }
        return join_link;
    }

    /**
     * Indexes PROOF by BINDINGS as a first proof in JOIN-LINK
     */
    @LispMethod(comment = "Indexes PROOF by BINDINGS as a first proof in JOIN-LINK")
    public static SubLObject add_join_link_first_proof(final SubLObject join_link, final SubLObject v_bindings, final SubLObject proof) {
        assert NIL != inference_worker_join.join_link_p(join_link) : "! inference_worker_join.join_link_p(join_link) " + ("inference_worker_join.join_link_p(join_link) " + "CommonSymbols.NIL != inference_worker_join.join_link_p(join_link) ") + join_link;
        assert NIL != inference_datastructures_proof.proof_p(proof) : "! inference_datastructures_proof.proof_p(proof) " + ("inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) ") + proof;
        final SubLObject index = inference_worker_join.join_link_first_proof_index(join_link);
        final SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
        dictionary_push(index, canonical_bindings, proof);
        return join_link;
    }

    /**
     * Unindexes PROOF by BINDINGS as a first proof in JOIN-LINK
     */
    @LispMethod(comment = "Unindexes PROOF by BINDINGS as a first proof in JOIN-LINK")
    public static final SubLObject remove_join_link_first_proof_alt(SubLObject join_link, SubLObject v_bindings, SubLObject proof) {
        SubLTrampolineFile.checkType(join_link, JOIN_LINK_P);
        SubLTrampolineFile.checkType(proof, PROOF_P);
        {
            SubLObject index = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_first_proof_index(join_link);
            SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
            dictionary_utilities.dictionary_delete_from_value(index, canonical_bindings, proof, UNPROVIDED, UNPROVIDED);
        }
        return join_link;
    }

    /**
     * Unindexes PROOF by BINDINGS as a first proof in JOIN-LINK
     */
    @LispMethod(comment = "Unindexes PROOF by BINDINGS as a first proof in JOIN-LINK")
    public static SubLObject remove_join_link_first_proof(final SubLObject join_link, final SubLObject v_bindings, final SubLObject proof) {
        assert NIL != inference_worker_join.join_link_p(join_link) : "! inference_worker_join.join_link_p(join_link) " + ("inference_worker_join.join_link_p(join_link) " + "CommonSymbols.NIL != inference_worker_join.join_link_p(join_link) ") + join_link;
        assert NIL != inference_datastructures_proof.proof_p(proof) : "! inference_datastructures_proof.proof_p(proof) " + ("inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) ") + proof;
        final SubLObject index = inference_worker_join.join_link_first_proof_index(join_link);
        final SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
        dictionary_delete_from_value(index, canonical_bindings, proof, UNPROVIDED, UNPROVIDED);
        return join_link;
    }

    /**
     * Indexes PROOF by BINDINGS as a second proof in JOIN-LINK
     */
    @LispMethod(comment = "Indexes PROOF by BINDINGS as a second proof in JOIN-LINK")
    public static final SubLObject add_join_link_second_proof_alt(SubLObject join_link, SubLObject v_bindings, SubLObject proof) {
        SubLTrampolineFile.checkType(join_link, JOIN_LINK_P);
        SubLTrampolineFile.checkType(proof, PROOF_P);
        {
            SubLObject index = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_second_proof_index(join_link);
            SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
            dictionary_utilities.dictionary_push(index, canonical_bindings, proof);
        }
        return join_link;
    }

    /**
     * Indexes PROOF by BINDINGS as a second proof in JOIN-LINK
     */
    @LispMethod(comment = "Indexes PROOF by BINDINGS as a second proof in JOIN-LINK")
    public static SubLObject add_join_link_second_proof(final SubLObject join_link, final SubLObject v_bindings, final SubLObject proof) {
        assert NIL != inference_worker_join.join_link_p(join_link) : "! inference_worker_join.join_link_p(join_link) " + ("inference_worker_join.join_link_p(join_link) " + "CommonSymbols.NIL != inference_worker_join.join_link_p(join_link) ") + join_link;
        assert NIL != inference_datastructures_proof.proof_p(proof) : "! inference_datastructures_proof.proof_p(proof) " + ("inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) ") + proof;
        final SubLObject index = inference_worker_join.join_link_second_proof_index(join_link);
        final SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
        dictionary_push(index, canonical_bindings, proof);
        return join_link;
    }

    /**
     * Unindexes PROOF by BINDINGS as a second proof in JOIN-LINK
     */
    @LispMethod(comment = "Unindexes PROOF by BINDINGS as a second proof in JOIN-LINK")
    public static final SubLObject remove_join_link_second_proof_alt(SubLObject join_link, SubLObject v_bindings, SubLObject proof) {
        SubLTrampolineFile.checkType(join_link, JOIN_LINK_P);
        SubLTrampolineFile.checkType(proof, PROOF_P);
        {
            SubLObject index = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_second_proof_index(join_link);
            SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
            dictionary_utilities.dictionary_delete_from_value(index, canonical_bindings, proof, UNPROVIDED, UNPROVIDED);
        }
        return join_link;
    }

    /**
     * Unindexes PROOF by BINDINGS as a second proof in JOIN-LINK
     */
    @LispMethod(comment = "Unindexes PROOF by BINDINGS as a second proof in JOIN-LINK")
    public static SubLObject remove_join_link_second_proof(final SubLObject join_link, final SubLObject v_bindings, final SubLObject proof) {
        assert NIL != inference_worker_join.join_link_p(join_link) : "! inference_worker_join.join_link_p(join_link) " + ("inference_worker_join.join_link_p(join_link) " + "CommonSymbols.NIL != inference_worker_join.join_link_p(join_link) ") + join_link;
        assert NIL != inference_datastructures_proof.proof_p(proof) : "! inference_datastructures_proof.proof_p(proof) " + ("inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) ") + proof;
        final SubLObject index = inference_worker_join.join_link_second_proof_index(join_link);
        final SubLObject canonical_bindings = inference_worker.canonicalize_proof_bindings(v_bindings);
        dictionary_delete_from_value(index, canonical_bindings, proof, UNPROVIDED, UNPROVIDED);
        return join_link;
    }

    /**
     *
     *
     * @unknown TRIGGER-PROOF must be a :proven proof, because otherwise it would not have bubbled up
    to JOIN-LINK.
     */
    @LispMethod(comment = "@unknown TRIGGER-PROOF must be a :proven proof, because otherwise it would not have bubbled up\r\nto JOIN-LINK.")
    public static final SubLObject add_join_link_proof_alt(SubLObject join_link, SubLObject trigger_proof, SubLObject trigger_is_firstP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == proof_provenP(trigger_proof)) {
                    Errors.error($str_alt36$_a_was_a_rejected_proof, trigger_proof);
                }
            }
            {
                SubLObject shared_trigger_proof_bindings = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_shared_proof_bindings(join_link, proof_bindings(trigger_proof), trigger_is_firstP);
                if (NIL != trigger_is_firstP) {
                    com.cyc.cycjava.cycl.inference.harness.inference_worker_join.add_join_link_first_proof(join_link, shared_trigger_proof_bindings, trigger_proof);
                } else {
                    com.cyc.cycjava.cycl.inference.harness.inference_worker_join.add_join_link_second_proof(join_link, shared_trigger_proof_bindings, trigger_proof);
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @unknown TRIGGER-PROOF must be a :proven proof, because otherwise it would not have bubbled up
    to JOIN-LINK.
     */
    @LispMethod(comment = "@unknown TRIGGER-PROOF must be a :proven proof, because otherwise it would not have bubbled up\r\nto JOIN-LINK.")
    public static SubLObject add_join_link_proof(final SubLObject join_link, final SubLObject trigger_proof, final SubLObject trigger_is_firstP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == inference_datastructures_proof.proof_provenP(trigger_proof))) {
            Errors.error(inference_worker_join.$str42$_a_was_a_rejected_proof, trigger_proof);
        }
        final SubLObject shared_trigger_proof_bindings = inference_worker_join.join_link_shared_proof_bindings(join_link, inference_datastructures_proof.proof_bindings(trigger_proof), trigger_is_firstP);
        if (NIL != trigger_is_firstP) {
            inference_worker_join.add_join_link_first_proof(join_link, shared_trigger_proof_bindings, trigger_proof);
        } else {
            inference_worker_join.add_join_link_second_proof(join_link, shared_trigger_proof_bindings, trigger_proof);
        }
        return NIL;
    }

    public static final SubLObject remove_join_link_proof_both_ways_alt(SubLObject join_link, SubLObject proof, SubLObject v_bindings) {
        com.cyc.cycjava.cycl.inference.harness.inference_worker_join.remove_join_link_proof(join_link, proof, v_bindings, T);
        com.cyc.cycjava.cycl.inference.harness.inference_worker_join.remove_join_link_proof(join_link, proof, v_bindings, NIL);
        return NIL;
    }

    public static SubLObject remove_join_link_proof_both_ways(final SubLObject join_link, final SubLObject proof, final SubLObject v_bindings) {
        inference_worker_join.remove_join_link_proof(join_link, proof, v_bindings, T);
        inference_worker_join.remove_join_link_proof(join_link, proof, v_bindings, NIL);
        return NIL;
    }

    public static final SubLObject remove_join_link_proof_alt(SubLObject join_link, SubLObject trigger_proof, SubLObject trigger_proof_bindings, SubLObject trigger_is_firstP) {
        {
            SubLObject shared_trigger_proof_bindings = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_shared_proof_bindings(join_link, trigger_proof_bindings, trigger_is_firstP);
            if (NIL != trigger_is_firstP) {
                com.cyc.cycjava.cycl.inference.harness.inference_worker_join.remove_join_link_first_proof(join_link, shared_trigger_proof_bindings, trigger_proof);
            } else {
                com.cyc.cycjava.cycl.inference.harness.inference_worker_join.remove_join_link_second_proof(join_link, shared_trigger_proof_bindings, trigger_proof);
            }
        }
        return NIL;
    }

    public static SubLObject remove_join_link_proof(final SubLObject join_link, final SubLObject trigger_proof, final SubLObject trigger_proof_bindings, final SubLObject trigger_is_firstP) {
        final SubLObject shared_trigger_proof_bindings = inference_worker_join.join_link_shared_proof_bindings(join_link, trigger_proof_bindings, trigger_is_firstP);
        if (NIL != trigger_is_firstP) {
            inference_worker_join.remove_join_link_first_proof(join_link, shared_trigger_proof_bindings, trigger_proof);
        } else {
            inference_worker_join.remove_join_link_second_proof(join_link, shared_trigger_proof_bindings, trigger_proof);
        }
        return NIL;
    }

    public static final SubLObject find_or_create_join_link_supporting_mapped_problems(SubLObject store, SubLObject dnf_clause, SubLObject first_supporting_problem_spec) {
        {
            SubLObject first_mapped_problem = inference_worker.find_or_create_problem_from_subclause_spec(store, dnf_clause, first_supporting_problem_spec);
            SubLObject second_mapped_problem = inference_worker.find_or_create_problem_without_subclause_spec(store, dnf_clause, first_supporting_problem_spec);
            return values(first_mapped_problem, second_mapped_problem);
        }
    }

    public static SubLObject find_or_create_join_link_supporting_mapped_problems(final SubLObject store, final SubLObject dnf_clause, final SubLObject first_supporting_problem_spec, final SubLObject supported_problem) {
        final SubLObject first_mapped_query = inference_datastructures_problem_query.new_problem_query_from_subclause_spec(dnf_clause, first_supporting_problem_spec);
        final SubLObject second_mapped_query = inference_datastructures_problem_query.new_problem_query_without_subclause_spec(dnf_clause, first_supporting_problem_spec);
        final SubLObject first_mapped_query_vars = cycl_utilities.expression_gather(first_mapped_query, inference_worker_join.$sym43$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject second_mapped_query_vars = cycl_utilities.expression_gather(second_mapped_query, inference_worker_join.$sym43$HL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject free_hl_vars = (NIL != inference_datastructures_problem_store.problem_store_allows_problem_hl_free_vars_optimizationP(store)) ? union(inference_datastructures_problem.problem_free_hl_vars(supported_problem), intersection(first_mapped_query_vars, second_mapped_query_vars, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED) : NIL;
        final SubLObject first_mapped_query_free_vars = intersection(free_hl_vars, first_mapped_query_vars, UNPROVIDED, UNPROVIDED);
        final SubLObject second_mapped_query_free_vars = intersection(free_hl_vars, second_mapped_query_vars, UNPROVIDED, UNPROVIDED);
        final SubLObject first_mapped_problem = inference_worker.find_or_create_problem(store, first_mapped_query, first_mapped_query_free_vars, UNPROVIDED);
        final SubLObject second_mapped_problem = inference_worker.find_or_create_problem(store, second_mapped_query, second_mapped_query_free_vars, UNPROVIDED);
        return values(first_mapped_problem, second_mapped_problem);
    }

    /**
     *
     *
     * @return listp; the sorted list of variables in FIRST-MAPPED-PROBLEM that also appear
    (modulo variable maps) in SECOND-MAPPED-PROBLEM.
     */
    @LispMethod(comment = "@return listp; the sorted list of variables in FIRST-MAPPED-PROBLEM that also appear\r\n(modulo variable maps) in SECOND-MAPPED-PROBLEM.")
    public static final SubLObject first_problem_shared_vars_alt(SubLObject first_mapped_problem, SubLObject second_mapped_problem) {
        {
            SubLObject shared_sibling_vars = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.shared_sibling_vars(first_mapped_problem, second_mapped_problem);
            return bindings.apply_bindings_backwards(inference_datastructures_problem_link.mapped_problem_variable_map(first_mapped_problem), shared_sibling_vars);
        }
    }

    /**
     *
     *
     * @return listp; the sorted list of variables in FIRST-MAPPED-PROBLEM that also appear
    (modulo variable maps) in SECOND-MAPPED-PROBLEM.
     */
    @LispMethod(comment = "@return listp; the sorted list of variables in FIRST-MAPPED-PROBLEM that also appear\r\n(modulo variable maps) in SECOND-MAPPED-PROBLEM.")
    public static SubLObject first_problem_shared_vars(final SubLObject first_mapped_problem, final SubLObject second_mapped_problem) {
        final SubLObject shared_sibling_vars = inference_worker_join.shared_sibling_vars(first_mapped_problem, second_mapped_problem);
        return apply_bindings_backwards(inference_datastructures_problem_link.mapped_problem_variable_map(first_mapped_problem), shared_sibling_vars);
    }

    /**
     *
     *
     * @return listp; the sorted list of variables in SECOND-MAPPED-PROBLEM that also appear
    (modulo variable maps) in FIRST-MAPPED-PROBLEM.
     */
    @LispMethod(comment = "@return listp; the sorted list of variables in SECOND-MAPPED-PROBLEM that also appear\r\n(modulo variable maps) in FIRST-MAPPED-PROBLEM.")
    public static final SubLObject second_problem_shared_vars_alt(SubLObject first_mapped_problem, SubLObject second_mapped_problem) {
        {
            SubLObject shared_sibling_vars = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.shared_sibling_vars(first_mapped_problem, second_mapped_problem);
            return bindings.apply_bindings_backwards(inference_datastructures_problem_link.mapped_problem_variable_map(second_mapped_problem), shared_sibling_vars);
        }
    }

    /**
     *
     *
     * @return listp; the sorted list of variables in SECOND-MAPPED-PROBLEM that also appear
    (modulo variable maps) in FIRST-MAPPED-PROBLEM.
     */
    @LispMethod(comment = "@return listp; the sorted list of variables in SECOND-MAPPED-PROBLEM that also appear\r\n(modulo variable maps) in FIRST-MAPPED-PROBLEM.")
    public static SubLObject second_problem_shared_vars(final SubLObject first_mapped_problem, final SubLObject second_mapped_problem) {
        final SubLObject shared_sibling_vars = inference_worker_join.shared_sibling_vars(first_mapped_problem, second_mapped_problem);
        return apply_bindings_backwards(inference_datastructures_problem_link.mapped_problem_variable_map(second_mapped_problem), shared_sibling_vars);
    }

    /**
     *
     *
     * @return listp; the sorted list of variables in both FIRST-MAPPED-PROBLEM and SECOND-MAPPED-PROBLEM
    in the variable space of their common supported problem.
    Since the values (cdrs) of each variable map are already in the variable space of
    their common supported problem, we just take the intersection of the values of
    those two variable maps.
     */
    @LispMethod(comment = "@return listp; the sorted list of variables in both FIRST-MAPPED-PROBLEM and SECOND-MAPPED-PROBLEM\r\nin the variable space of their common supported problem.\r\nSince the values (cdrs) of each variable map are already in the variable space of\r\ntheir common supported problem, we just take the intersection of the values of\r\nthose two variable maps.")
    public static final SubLObject shared_sibling_vars_alt(SubLObject first_mapped_problem, SubLObject second_mapped_problem) {
        {
            SubLObject shared_vars = NIL;
            SubLObject first_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(first_mapped_problem);
            SubLObject second_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(second_mapped_problem);
            SubLObject cdolist_list_var = first_variable_map;
            SubLObject variable_binding = NIL;
            for (variable_binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , variable_binding = cdolist_list_var.first()) {
                {
                    SubLObject supported_var = bindings.variable_binding_value(variable_binding);
                    if (NIL != subl_promotions.memberP(supported_var, second_variable_map, symbol_function(EQ), symbol_function(VARIABLE_BINDING_VALUE))) {
                        shared_vars = cons(supported_var, shared_vars);
                    }
                }
            }
            return variables.sort_hl_variable_list(shared_vars);
        }
    }

    /**
     *
     *
     * @return listp; the sorted list of variables in both FIRST-MAPPED-PROBLEM and SECOND-MAPPED-PROBLEM
    in the variable space of their common supported problem.
    Since the values (cdrs) of each variable map are already in the variable space of
    their common supported problem, we just take the intersection of the values of
    those two variable maps.
     */
    @LispMethod(comment = "@return listp; the sorted list of variables in both FIRST-MAPPED-PROBLEM and SECOND-MAPPED-PROBLEM\r\nin the variable space of their common supported problem.\r\nSince the values (cdrs) of each variable map are already in the variable space of\r\ntheir common supported problem, we just take the intersection of the values of\r\nthose two variable maps.")
    public static SubLObject shared_sibling_vars(final SubLObject first_mapped_problem, final SubLObject second_mapped_problem) {
        SubLObject shared_vars = NIL;
        final SubLObject first_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(first_mapped_problem);
        final SubLObject second_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(second_mapped_problem);
        SubLObject cdolist_list_var = first_variable_map;
        SubLObject variable_binding = NIL;
        variable_binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject supported_var = variable_binding_value(variable_binding);
            if (NIL != memberP(supported_var, second_variable_map, symbol_function(EQL), symbol_function(inference_worker_join.VARIABLE_BINDING_VALUE))) {
                shared_vars = cons(supported_var, shared_vars);
            }
            cdolist_list_var = cdolist_list_var.rest();
            variable_binding = cdolist_list_var.first();
        } 
        return sort_hl_variable_list(shared_vars);
    }

    public static final SubLObject join_tactic_p_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != inference_datastructures_tactic.tactic_p(v_object)) && ($join_module$.getDynamicValue(thread) == inference_datastructures_tactic.tactic_hl_module(v_object)));
        }
    }

    public static SubLObject join_tactic_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != inference_datastructures_tactic.tactic_p(v_object)) && inference_worker_join.$join_module$.getDynamicValue(thread).eql(inference_datastructures_tactic.tactic_hl_module(v_object)));
    }

    public static final SubLObject new_join_tactic_alt(SubLObject join_link, SubLObject first_supporting_problem_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(join_link);
                SubLObject data = list(join_link, first_supporting_problem_spec);
                SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, $join_module$.getDynamicValue(thread), data);
                SubLObject prob = problem;
                SubLObject store = inference_datastructures_problem.problem_store(prob);
                SubLObject idx = problem_store_inference_id_index(store);
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
                return tactic;
            }
        }
    }

    public static SubLObject new_join_tactic(final SubLObject join_link, final SubLObject first_supporting_problem_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem = inference_datastructures_problem_link.problem_link_supported_problem(join_link);
        final SubLObject data = list(join_link, first_supporting_problem_spec);
        final SubLObject tactic = inference_datastructures_tactic.new_tactic(problem, inference_worker_join.$join_module$.getDynamicValue(thread), data);
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

    /**
     *
     *
     * @return nil or problem-link-p; the link created by JOIN-TACTIC
    NIL should only occur if the tactic has been discarded.
     */
    @LispMethod(comment = "@return nil or problem-link-p; the link created by JOIN-TACTIC\r\nNIL should only occur if the tactic has been discarded.")
    public static final SubLObject join_tactic_link_alt(SubLObject join_tactic) {
        return inference_datastructures_tactic.tactic_data(join_tactic).first();
    }

    /**
     *
     *
     * @return nil or problem-link-p; the link created by JOIN-TACTIC
    NIL should only occur if the tactic has been discarded.
     */
    @LispMethod(comment = "@return nil or problem-link-p; the link created by JOIN-TACTIC\r\nNIL should only occur if the tactic has been discarded.")
    public static SubLObject join_tactic_link(final SubLObject join_tactic) {
        return inference_datastructures_tactic.tactic_data(join_tactic).first();
    }

    /**
     *
     *
     * @return subclause-spec-p
     */
    @LispMethod(comment = "@return subclause-spec-p")
    public static final SubLObject join_tactic_first_supporting_problem_spec_alt(SubLObject tactic) {
        return second(inference_datastructures_tactic.tactic_data(tactic));
    }

    /**
     *
     *
     * @return subclause-spec-p
     */
    @LispMethod(comment = "@return subclause-spec-p")
    public static SubLObject join_tactic_first_supporting_problem_spec(final SubLObject tactic) {
        return second(inference_datastructures_tactic.tactic_data(tactic));
    }

    public static final SubLObject join_tactic_first_problem_alt(SubLObject join_tactic) {
        {
            SubLObject link = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_tactic_link(join_tactic);
            if (NIL != link) {
                return com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_first_problem(link);
            }
        }
        return NIL;
    }

    public static SubLObject join_tactic_first_problem(final SubLObject join_tactic) {
        final SubLObject link = inference_worker_join.join_tactic_link(join_tactic);
        if (NIL != link) {
            return inference_worker_join.join_link_first_problem(link);
        }
        return NIL;
    }

    public static final SubLObject join_tactic_second_problem_alt(SubLObject join_tactic) {
        {
            SubLObject link = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_tactic_link(join_tactic);
            if (NIL != link) {
                return com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_second_problem(link);
            }
        }
        return NIL;
    }

    public static SubLObject join_tactic_second_problem(final SubLObject join_tactic) {
        final SubLObject link = inference_worker_join.join_tactic_link(join_tactic);
        if (NIL != link) {
            return inference_worker_join.join_link_second_problem(link);
        }
        return NIL;
    }

    public static final SubLObject join_tactic_lookahead_problems_alt(SubLObject join_tactic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject first_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_tactic_first_problem(join_tactic);
                SubLObject second_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_tactic_second_problem(join_tactic);
                if (!((NIL != first_problem) && (NIL != second_problem))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject first_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.find_or_create_join_tactic_supporting_mapped_problems(join_tactic);
                        SubLObject second_mapped_problem = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        first_problem = inference_datastructures_problem_link.mapped_problem_problem(first_mapped_problem);
                        second_problem = inference_datastructures_problem_link.mapped_problem_problem(second_mapped_problem);
                    }
                }
                return values(first_problem, second_problem);
            }
        }
    }

    public static SubLObject join_tactic_lookahead_problems(final SubLObject join_tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject first_problem = inference_worker_join.join_tactic_first_problem(join_tactic);
        SubLObject second_problem = inference_worker_join.join_tactic_second_problem(join_tactic);
        if ((NIL == first_problem) || (NIL == second_problem)) {
            thread.resetMultipleValues();
            final SubLObject first_mapped_problem = inference_worker_join.find_or_create_join_tactic_supporting_mapped_problems(join_tactic);
            final SubLObject second_mapped_problem = thread.secondMultipleValue();
            thread.resetMultipleValues();
            first_problem = inference_datastructures_problem_link.mapped_problem_problem(first_mapped_problem);
            second_problem = inference_datastructures_problem_link.mapped_problem_problem(second_mapped_problem);
        }
        return values(first_problem, second_problem);
    }

    public static final SubLObject determine_new_join_tactics_alt(SubLObject supported_problem, SubLObject dnf_clause) {
        if (NIL != clause_utilities.binary_clause_p(dnf_clause)) {
            if (NIL == inference_trampolines.inference_some_backchain_required_asent_in_clauseP(dnf_clause)) {
                {
                    SubLObject doneP = NIL;
                    {
                        SubLObject index = ZERO_INTEGER;
                        SubLObject cdolist_list_var = clauses.neg_lits(dnf_clause);
                        SubLObject contextualized_asent = NIL;
                        for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                            {
                                SubLObject sense = $NEG;
                                if (NIL == doneP) {
                                    {
                                        SubLObject first_supporting_problem_spec = clause_utilities.new_single_literal_subclause_spec(sense, index);
                                        com.cyc.cycjava.cycl.inference.harness.inference_worker_join.possibly_determine_new_join_tactic(supported_problem, first_supporting_problem_spec, dnf_clause);
                                    }
                                    doneP = T;
                                }
                            }
                            index = add(index, ONE_INTEGER);
                        }
                    }
                    {
                        SubLObject index = ZERO_INTEGER;
                        SubLObject cdolist_list_var = clauses.pos_lits(dnf_clause);
                        SubLObject contextualized_asent = NIL;
                        for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                            {
                                SubLObject sense = $POS;
                                if (NIL == doneP) {
                                    {
                                        SubLObject first_supporting_problem_spec = clause_utilities.new_single_literal_subclause_spec(sense, index);
                                        com.cyc.cycjava.cycl.inference.harness.inference_worker_join.possibly_determine_new_join_tactic(supported_problem, first_supporting_problem_spec, dnf_clause);
                                    }
                                    doneP = T;
                                }
                            }
                            index = add(index, ONE_INTEGER);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject determine_new_join_tactics(final SubLObject supported_problem, final SubLObject dnf_clause) {
        if ((NIL != binary_clause_p(dnf_clause)) && (NIL == inference_trampolines.inference_some_backchain_required_asent_in_clauseP(dnf_clause))) {
            SubLObject doneP = NIL;
            SubLObject index = ZERO_INTEGER;
            SubLObject cdolist_list_var = neg_lits(dnf_clause);
            SubLObject contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject sense = $NEG;
                if (NIL == doneP) {
                    final SubLObject first_supporting_problem_spec = new_single_literal_subclause_spec(sense, index);
                    inference_worker_join.possibly_determine_new_join_tactic(supported_problem, first_supporting_problem_spec, dnf_clause);
                    doneP = T;
                }
                index = add(index, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_asent = cdolist_list_var.first();
            } 
            index = ZERO_INTEGER;
            cdolist_list_var = pos_lits(dnf_clause);
            contextualized_asent = NIL;
            contextualized_asent = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject sense = $POS;
                if (NIL == doneP) {
                    final SubLObject first_supporting_problem_spec = new_single_literal_subclause_spec(sense, index);
                    inference_worker_join.possibly_determine_new_join_tactic(supported_problem, first_supporting_problem_spec, dnf_clause);
                    doneP = T;
                }
                index = add(index, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                contextualized_asent = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    /**
     * Possibly create a new :JOIN tactic for PROBLEM in which FIRST-SUPPORTING-PROBLEM-SPEC
     * specifies the literals of DNF-CLAUSE which should be the first supporting problem
     * and the remaining literals should be the second supporting problem.
     */
    @LispMethod(comment = "Possibly create a new :JOIN tactic for PROBLEM in which FIRST-SUPPORTING-PROBLEM-SPEC\r\nspecifies the literals of DNF-CLAUSE which should be the first supporting problem\r\nand the remaining literals should be the second supporting problem.\nPossibly create a new :JOIN tactic for PROBLEM in which FIRST-SUPPORTING-PROBLEM-SPEC\nspecifies the literals of DNF-CLAUSE which should be the first supporting problem\nand the remaining literals should be the second supporting problem.")
    public static final SubLObject possibly_determine_new_join_tactic_alt(SubLObject supported_problem, SubLObject first_supporting_problem_spec, SubLObject dnf_clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(first_supporting_problem_spec, SUBCLAUSE_SPEC_P);
            {
                SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
                thread.resetMultipleValues();
                {
                    SubLObject first_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.find_or_create_join_link_supporting_mapped_problems(store, dnf_clause, first_supporting_problem_spec);
                    SubLObject second_mapped_problem = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject join_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.maybe_new_join_link(supported_problem, first_mapped_problem, second_mapped_problem);
                        return com.cyc.cycjava.cycl.inference.harness.inference_worker_join.new_join_tactic(join_link, first_supporting_problem_spec);
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Possibly create a new :JOIN tactic for PROBLEM in which FIRST-SUPPORTING-PROBLEM-SPEC\r\nspecifies the literals of DNF-CLAUSE which should be the first supporting problem\r\nand the remaining literals should be the second supporting problem.\nPossibly create a new :JOIN tactic for PROBLEM in which FIRST-SUPPORTING-PROBLEM-SPEC\nspecifies the literals of DNF-CLAUSE which should be the first supporting problem\nand the remaining literals should be the second supporting problem.")
    public static SubLObject possibly_determine_new_join_tactic(final SubLObject supported_problem, final SubLObject first_supporting_problem_spec, final SubLObject dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subclause_spec_p(first_supporting_problem_spec) : "! clause_utilities.subclause_spec_p(first_supporting_problem_spec) " + ("clause_utilities.subclause_spec_p(first_supporting_problem_spec) " + "CommonSymbols.NIL != clause_utilities.subclause_spec_p(first_supporting_problem_spec) ") + first_supporting_problem_spec;
        final SubLObject store = inference_datastructures_problem.problem_store(supported_problem);
        thread.resetMultipleValues();
        final SubLObject first_mapped_problem = inference_worker_join.find_or_create_join_link_supporting_mapped_problems(store, dnf_clause, first_supporting_problem_spec, supported_problem);
        final SubLObject second_mapped_problem = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject join_link = inference_worker_join.maybe_new_join_link(supported_problem, first_mapped_problem, second_mapped_problem);
        return inference_worker_join.new_join_tactic(join_link, first_supporting_problem_spec);
    }

    public static final SubLObject compute_strategic_properties_of_join_tactic_alt(SubLObject tactic, SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(tactic, JOIN_TACTIC_P);
            SubLTrampolineFile.checkType(strategy, STRATEGY_P);
            {
                SubLObject join_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_tactic_link(tactic);
                SubLObject first_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_first_mapped_problem(join_link);
                SubLObject second_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_second_mapped_problem(join_link);
                if (NIL == preference_modules.preference_level_p(inference_datastructures_tactic.tactic_preference_level(tactic))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject preference_level = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.compute_join_tactic_preference_level(first_mapped_problem, second_mapped_problem, $TACTICAL);
                        SubLObject justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        inference_datastructures_tactic.set_tactic_preference_level(tactic, preference_level, justification);
                    }
                }
                thread.resetMultipleValues();
                {
                    SubLObject preference_level = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.compute_join_tactic_preference_level(first_mapped_problem, second_mapped_problem, strategy);
                    SubLObject justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    inference_datastructures_strategy.set_tactic_strategic_preference_level(tactic, strategy, preference_level, justification);
                }
                {
                    SubLObject productivity = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.compute_join_tactic_productivity(first_mapped_problem, second_mapped_problem, strategy);
                    inference_datastructures_strategy.set_tactic_strategic_productivity(tactic, strategy, productivity);
                }
                return tactic;
            }
        }
    }

    public static SubLObject compute_strategic_properties_of_join_tactic(final SubLObject tactic, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_worker_join.join_tactic_p(tactic) : "! inference_worker_join.join_tactic_p(tactic) " + ("inference_worker_join.join_tactic_p(tactic) " + "CommonSymbols.NIL != inference_worker_join.join_tactic_p(tactic) ") + tactic;
        assert NIL != inference_datastructures_strategy.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) " + ("inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ") + strategy;
        final SubLObject join_link = inference_worker_join.join_tactic_link(tactic);
        final SubLObject first_mapped_problem = inference_worker_join.join_link_first_mapped_problem(join_link);
        final SubLObject second_mapped_problem = inference_worker_join.join_link_second_mapped_problem(join_link);
        if (NIL == preference_level_p(inference_datastructures_tactic.tactic_preference_level(tactic))) {
            thread.resetMultipleValues();
            final SubLObject preference_level = inference_worker_join.compute_join_tactic_preference_level(first_mapped_problem, second_mapped_problem, $TACTICAL);
            final SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            inference_datastructures_tactic.set_tactic_preference_level(tactic, preference_level, justification);
            if ($DOOMED == preference_level) {
                inference_worker.note_tactic_doomed(tactic, $TACTICAL);
            }
        }
        thread.resetMultipleValues();
        final SubLObject preference_level = inference_worker_join.compute_join_tactic_preference_level(first_mapped_problem, second_mapped_problem, strategy);
        final SubLObject justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        inference_datastructures_strategy.set_tactic_strategic_preference_level(tactic, strategy, preference_level, justification);
        if ($DOOMED == preference_level) {
            inference_worker.note_tactic_doomed(tactic, strategy);
        }
        final SubLObject productivity = inference_worker_join.compute_join_tactic_productivity(first_mapped_problem, second_mapped_problem, strategy);
        inference_datastructures_strategy.set_tactic_strategic_productivity(tactic, strategy, productivity);
        return tactic;
    }

    /**
     * The productivity of a :join tactic is the sum of the productivities of its subproblems.
     */
    @LispMethod(comment = "The productivity of a :join tactic is the sum of the productivities of its subproblems.")
    public static final SubLObject compute_join_tactic_productivity_alt(SubLObject first_mapped_problem, SubLObject second_mapped_problem, SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(first_mapped_problem, MAPPED_PROBLEM_P);
            SubLTrampolineFile.checkType(second_mapped_problem, MAPPED_PROBLEM_P);
            SubLTrampolineFile.checkType(strategy, STRATEGY_P);
            {
                SubLObject first_problem = inference_datastructures_problem_link.mapped_problem_problem(first_mapped_problem);
                SubLObject second_problem = inference_datastructures_problem_link.mapped_problem_problem(second_mapped_problem);
                SubLObject first_productivity = inference_lookahead_productivity.memoized_problem_max_removal_productivity(first_problem, strategy);
                SubLObject second_productivity = inference_lookahead_productivity.memoized_problem_max_removal_productivity(second_problem, strategy);
                SubLObject raw_join_productivity = inference_datastructures_enumerated_types.productivity_max(first_productivity, second_productivity);
                SubLObject join_productivity = inference_datastructures_enumerated_types.productivity_divide_number(raw_join_productivity, $join_productivity_scaling_factor$.getDynamicValue(thread));
                return join_productivity;
            }
        }
    }

    @LispMethod(comment = "The productivity of a :join tactic is the sum of the productivities of its subproblems.")
    public static SubLObject compute_join_tactic_productivity(final SubLObject first_mapped_problem, final SubLObject second_mapped_problem, final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(first_mapped_problem) : "! inference_datastructures_problem_link.mapped_problem_p(first_mapped_problem) " + ("inference_datastructures_problem_link.mapped_problem_p(first_mapped_problem) " + "CommonSymbols.NIL != inference_datastructures_problem_link.mapped_problem_p(first_mapped_problem) ") + first_mapped_problem;
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(second_mapped_problem) : "! inference_datastructures_problem_link.mapped_problem_p(second_mapped_problem) " + ("inference_datastructures_problem_link.mapped_problem_p(second_mapped_problem) " + "CommonSymbols.NIL != inference_datastructures_problem_link.mapped_problem_p(second_mapped_problem) ") + second_mapped_problem;
        assert NIL != inference_datastructures_strategy.strategy_p(strategy) : "! inference_datastructures_strategy.strategy_p(strategy) " + ("inference_datastructures_strategy.strategy_p(strategy) " + "CommonSymbols.NIL != inference_datastructures_strategy.strategy_p(strategy) ") + strategy;
        final SubLObject first_problem = inference_datastructures_problem_link.mapped_problem_problem(first_mapped_problem);
        final SubLObject second_problem = inference_datastructures_problem_link.mapped_problem_problem(second_mapped_problem);
        final SubLObject first_productivity = inference_lookahead_productivity.memoized_problem_max_removal_productivity(first_problem, strategy);
        final SubLObject second_productivity = inference_lookahead_productivity.memoized_problem_max_removal_productivity(second_problem, strategy);
        final SubLObject raw_join_productivity = inference_datastructures_enumerated_types.productivity_max(first_productivity, second_productivity);
        final SubLObject join_productivity = inference_datastructures_enumerated_types.productivity_divide_number(raw_join_productivity, inference_worker_join.$join_productivity_scaling_factor$.getDynamicValue(thread));
        return join_productivity;
    }

    /**
     * The preference level of a :join tactic is the min of the preference levels of its subproblems.
     */
    @LispMethod(comment = "The preference level of a :join tactic is the min of the preference levels of its subproblems.")
    public static final SubLObject compute_join_tactic_preference_level_alt(SubLObject first_mapped_problem, SubLObject second_mapped_problem, SubLObject strategic_context) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(first_mapped_problem, MAPPED_PROBLEM_P);
            SubLTrampolineFile.checkType(second_mapped_problem, MAPPED_PROBLEM_P);
            SubLTrampolineFile.checkType(strategic_context, STRATEGIC_CONTEXT_P);
            {
                SubLObject first_problem = inference_datastructures_problem_link.mapped_problem_problem(first_mapped_problem);
                SubLObject first_problem_shared_vars = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.first_problem_shared_vars(first_mapped_problem, second_mapped_problem);
                SubLObject second_problem = inference_datastructures_problem_link.mapped_problem_problem(second_mapped_problem);
                SubLObject second_problem_shared_vars = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.second_problem_shared_vars(first_mapped_problem, second_mapped_problem);
                thread.resetMultipleValues();
                {
                    SubLObject first_preference_level = inference_tactician_utilities.memoized_problem_global_preference_level(first_problem, strategic_context, first_problem_shared_vars);
                    SubLObject first_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    thread.resetMultipleValues();
                    {
                        SubLObject second_preference_level = inference_tactician_utilities.memoized_problem_global_preference_level(second_problem, strategic_context, second_problem_shared_vars);
                        SubLObject second_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != preference_modules.preference_level_L(first_preference_level, second_preference_level)) {
                            {
                                SubLObject justification = cconcatenate($str_alt46$first_problem__, first_justification);
                                return values(first_preference_level, justification);
                            }
                        } else {
                            {
                                SubLObject justification = cconcatenate($str_alt47$second_problem__, second_justification);
                                return values(second_preference_level, justification);
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "The preference level of a :join tactic is the min of the preference levels of its subproblems.")
    public static SubLObject compute_join_tactic_preference_level(final SubLObject first_mapped_problem, final SubLObject second_mapped_problem, final SubLObject strategic_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(first_mapped_problem) : "! inference_datastructures_problem_link.mapped_problem_p(first_mapped_problem) " + ("inference_datastructures_problem_link.mapped_problem_p(first_mapped_problem) " + "CommonSymbols.NIL != inference_datastructures_problem_link.mapped_problem_p(first_mapped_problem) ") + first_mapped_problem;
        assert NIL != inference_datastructures_problem_link.mapped_problem_p(second_mapped_problem) : "! inference_datastructures_problem_link.mapped_problem_p(second_mapped_problem) " + ("inference_datastructures_problem_link.mapped_problem_p(second_mapped_problem) " + "CommonSymbols.NIL != inference_datastructures_problem_link.mapped_problem_p(second_mapped_problem) ") + second_mapped_problem;
        assert NIL != inference_worker.strategic_context_p(strategic_context) : "! inference_worker.strategic_context_p(strategic_context) " + ("inference_worker.strategic_context_p(strategic_context) " + "CommonSymbols.NIL != inference_worker.strategic_context_p(strategic_context) ") + strategic_context;
        final SubLObject first_problem = inference_datastructures_problem_link.mapped_problem_problem(first_mapped_problem);
        final SubLObject first_problem_shared_vars = inference_worker_join.first_problem_shared_vars(first_mapped_problem, second_mapped_problem);
        final SubLObject second_problem = inference_datastructures_problem_link.mapped_problem_problem(second_mapped_problem);
        final SubLObject second_problem_shared_vars = inference_worker_join.second_problem_shared_vars(first_mapped_problem, second_mapped_problem);
        thread.resetMultipleValues();
        final SubLObject first_preference_level = inference_tactician_utilities.memoized_problem_global_preference_level(first_problem, strategic_context, first_problem_shared_vars);
        final SubLObject first_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        final SubLObject second_preference_level = inference_tactician_utilities.memoized_problem_global_preference_level(second_problem, strategic_context, second_problem_shared_vars);
        final SubLObject second_justification = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((((first_preference_level == $DISPREFERRED) && (NIL != Strings.stringE(first_justification, inference_worker_join.$str55$TVA_POS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (second_preference_level == $DISPREFERRED)) && (NIL != Strings.stringE(second_justification, inference_worker_join.$str55$TVA_POS, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            return values($GROSSLY_DISPREFERRED, inference_worker_join.$str57$DOUBLE_TVA_POS);
        }
        if (NIL != preference_level_L(first_preference_level, second_preference_level)) {
            final SubLObject justification = cconcatenate(inference_worker_join.$str58$first_problem__, first_justification);
            return values(first_preference_level, justification);
        }
        final SubLObject justification = cconcatenate(inference_worker_join.$str59$second_problem__, second_justification);
        return values(second_preference_level, justification);
    }

    public static final SubLObject execute_join_tactic_alt(SubLObject tactic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject first_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.find_or_create_join_tactic_supporting_mapped_problems(tactic);
                SubLObject second_mapped_problem = thread.secondMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject join_link = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_tactic_link(tactic);
                    inference_worker.problem_link_open_and_repropagate_supporting_mapped_problem(join_link, first_mapped_problem);
                    inference_worker.problem_link_open_and_repropagate_supporting_mapped_problem(join_link, second_mapped_problem);
                }
            }
            if (NIL != inference_tactician_strategic_uninterestingness.tactic_preferredP(tactic, $TACTICAL)) {
                inference_worker.possibly_discard_all_other_possible_structural_conjunctive_tactics(tactic);
            }
            inference_worker_join_ordered.consider_strategic_ramifications_of_tactic_preference_level(tactic);
            return tactic;
        }
    }

    public static SubLObject execute_join_tactic(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject first_mapped_problem = inference_worker_join.find_or_create_join_tactic_supporting_mapped_problems(tactic);
        final SubLObject second_mapped_problem = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject join_link = inference_worker_join.join_tactic_link(tactic);
        inference_worker.problem_link_open_and_repropagate_supporting_mapped_problem(join_link, first_mapped_problem);
        inference_worker.problem_link_open_and_repropagate_supporting_mapped_problem(join_link, second_mapped_problem);
        if (NIL != inference_tactician_strategic_uninterestingness.tactic_preferredP(tactic, $TACTICAL)) {
            inference_worker.possibly_discard_all_other_possible_structural_conjunctive_tactics(tactic);
        }
        inference_worker_join_ordered.consider_strategic_ramifications_of_tactic_preference_level(tactic);
        return tactic;
    }

    public static final SubLObject find_or_create_join_tactic_supporting_mapped_problems_alt(SubLObject tactic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
                SubLObject query = inference_datastructures_problem.problem_query(problem);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == list_utilities.singletonP(query)) {
                        Errors.error($str_alt48$Join_tactics_like__a_must_only_ap, tactic, query);
                    }
                }
                {
                    SubLObject store = inference_datastructures_problem.problem_store(problem);
                    SubLObject dnf_clause = query.first();
                    SubLObject first_supporting_problem_spec = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_tactic_first_supporting_problem_spec(tactic);
                    return com.cyc.cycjava.cycl.inference.harness.inference_worker_join.find_or_create_join_link_supporting_mapped_problems(store, dnf_clause, first_supporting_problem_spec);
                }
            }
        }
    }

    public static SubLObject find_or_create_join_tactic_supporting_mapped_problems(final SubLObject tactic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem = inference_datastructures_tactic.tactic_problem(tactic);
        final SubLObject query = inference_datastructures_problem.problem_query(problem);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == singletonP(query))) {
            Errors.error(inference_worker_join.$str60$Join_tactics_like__a_must_only_ap, tactic, query);
        }
        final SubLObject store = inference_datastructures_problem.problem_store(problem);
        final SubLObject dnf_clause = query.first();
        final SubLObject first_supporting_problem_spec = inference_worker_join.join_tactic_first_supporting_problem_spec(tactic);
        return inference_worker_join.find_or_create_join_link_supporting_mapped_problems(store, dnf_clause, first_supporting_problem_spec, problem);
    }

    /**
     *
     *
     * @return 0 proof-p
     * @return 1 whether the returned proof was newly created
     */
    @LispMethod(comment = "@return 0 proof-p\r\n@return 1 whether the returned proof was newly created")
    public static final SubLObject new_join_proof_alt(SubLObject join_link, SubLObject subproofs_with_sub_bindings) {
        return inference_worker_join_ordered.new_conjunctive_proof(join_link, subproofs_with_sub_bindings);
    }

    /**
     *
     *
     * @return 0 proof-p
     * @return 1 whether the returned proof was newly created
     */
    @LispMethod(comment = "@return 0 proof-p\r\n@return 1 whether the returned proof was newly created")
    public static SubLObject new_join_proof(final SubLObject join_link, final SubLObject subproofs_with_sub_bindings) {
        return inference_worker_join_ordered.new_conjunctive_proof(join_link, subproofs_with_sub_bindings);
    }

    public static final SubLObject join_proof_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != proof_p(v_object)) && ($JOIN == proof_type(v_object)));
    }

    public static SubLObject join_proof_p(final SubLObject v_object) {
        return makeBoolean((NIL != inference_datastructures_proof.proof_p(v_object)) && ($JOIN == inference_datastructures_proof.proof_type(v_object)));
    }

    public static final SubLObject bubble_up_proof_to_join_link_alt(SubLObject trigger_subproof, SubLObject variable_map, SubLObject join_link) {
        {
            SubLObject trigger_is_firstP = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.mapped_proof_is_firstP(trigger_subproof, variable_map, join_link);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_join.add_join_link_proof(join_link, trigger_subproof, trigger_is_firstP);
            com.cyc.cycjava.cycl.inference.harness.inference_worker_join.bubble_up_proof_to_join_link_int(trigger_subproof, variable_map, join_link, trigger_is_firstP);
        }
        return NIL;
    }

    public static SubLObject bubble_up_proof_to_join_link(final SubLObject trigger_subproof, final SubLObject variable_map, final SubLObject join_link) {
        final SubLObject trigger_is_firstP = inference_worker_join.mapped_proof_is_firstP(trigger_subproof, variable_map, join_link);
        inference_worker_join.add_join_link_proof(join_link, trigger_subproof, trigger_is_firstP);
        inference_worker_join.bubble_up_proof_to_join_link_int(trigger_subproof, variable_map, join_link, trigger_is_firstP);
        return NIL;
    }

    public static final SubLObject mapped_proof_is_firstP_alt(SubLObject subproof, SubLObject proof_variable_map, SubLObject join_link) {
        {
            SubLObject first_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_first_mapped_problem(join_link);
            SubLObject first_problem = inference_datastructures_problem_link.mapped_problem_problem(first_mapped_problem);
            SubLObject subproof_supported_problem = proof_supported_problem(subproof);
            if (first_problem == subproof_supported_problem) {
                {
                    SubLObject first_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(first_mapped_problem);
                    if (NIL != bindings.bindings_equalP(first_variable_map, proof_variable_map)) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject mapped_proof_is_firstP(final SubLObject subproof, final SubLObject proof_variable_map, final SubLObject join_link) {
        final SubLObject first_mapped_problem = inference_worker_join.join_link_first_mapped_problem(join_link);
        final SubLObject first_problem = inference_datastructures_problem_link.mapped_problem_problem(first_mapped_problem);
        final SubLObject subproof_supported_problem = inference_datastructures_proof.proof_supported_problem(subproof);
        if (first_problem.eql(subproof_supported_problem)) {
            final SubLObject first_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(first_mapped_problem);
            if (NIL != bindings_equalP(first_variable_map, proof_variable_map)) {
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject bubble_up_proof_to_join_link_int_alt(SubLObject trigger_subproof, SubLObject variable_map, SubLObject join_link, SubLObject trigger_is_firstP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject proofs = NIL;
                SubLObject trigger_proof_bindings = proof_bindings(trigger_subproof);
                SubLObject join_bindings = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_shared_proof_bindings(join_link, trigger_proof_bindings, trigger_is_firstP);
                SubLObject sibling_proofs = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_sibling_proofs_lookup(join_link, join_bindings, trigger_is_firstP);
                if (NIL != sibling_proofs) {
                    {
                        SubLObject sibling_mapped_problem = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.join_link_sibling_mapped_problem(join_link, trigger_is_firstP);
                        SubLObject sibling_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(sibling_mapped_problem);
                        SubLObject sibling_proofs_with_bindings = NIL;
                        {
                            SubLObject cdolist_list_var = sibling_proofs;
                            SubLObject sibling_proof = NIL;
                            for (sibling_proof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sibling_proof = cdolist_list_var.first()) {
                                {
                                    SubLObject sibling_sub_proof_bindings = bindings.transfer_variable_map_to_bindings(sibling_variable_map, proof_bindings(sibling_proof));
                                    sibling_proofs_with_bindings = cons(cons(sibling_proof, sibling_sub_proof_bindings), sibling_proofs_with_bindings);
                                }
                            }
                        }
                        sibling_proofs_with_bindings = nreverse(sibling_proofs_with_bindings);
                        {
                            SubLObject trigger_sub_proof_bindings = bindings.transfer_variable_map_to_bindings(variable_map, trigger_proof_bindings);
                            SubLObject supporting_mapped_proof_lists_by_supporting_problem = (NIL != trigger_is_firstP) ? ((SubLObject) (list(list(cons(trigger_subproof, trigger_sub_proof_bindings)), sibling_proofs_with_bindings))) : list(sibling_proofs_with_bindings, list(cons(trigger_subproof, trigger_sub_proof_bindings)));
                            SubLObject mapped_subproof_lists = list_utilities.cartesian_product(supporting_mapped_proof_lists_by_supporting_problem, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject cdolist_list_var = mapped_subproof_lists;
                            SubLObject mapped_subproof_list = NIL;
                            for (mapped_subproof_list = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mapped_subproof_list = cdolist_list_var.first()) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject proof = com.cyc.cycjava.cycl.inference.harness.inference_worker_join.new_join_proof(join_link, mapped_subproof_list);
                                    SubLObject newP = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != newP) {
                                        proofs = cons(proof, proofs);
                                    } else {
                                        inference_worker.possibly_note_proof_processed(trigger_subproof);
                                    }
                                }
                            }
                        }
                    }
                    proofs = nreverse(proofs);
                    {
                        SubLObject cdolist_list_var = proofs;
                        SubLObject proof = NIL;
                        for (proof = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , proof = cdolist_list_var.first()) {
                            inference_worker.bubble_up_proof(proof);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject bubble_up_proof_to_join_link_int(final SubLObject trigger_subproof, final SubLObject variable_map, final SubLObject join_link, final SubLObject trigger_is_firstP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject proofs = NIL;
        final SubLObject trigger_proof_bindings = inference_datastructures_proof.proof_bindings(trigger_subproof);
        final SubLObject join_bindings = inference_worker_join.join_link_shared_proof_bindings(join_link, trigger_proof_bindings, trigger_is_firstP);
        final SubLObject sibling_proofs = remove_if_not(inference_worker_join.$sym61$PROOF_PROVEN_, inference_worker_join.join_link_sibling_proofs_lookup(join_link, join_bindings, trigger_is_firstP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != sibling_proofs) {
            final SubLObject sibling_mapped_problem = inference_worker_join.join_link_sibling_mapped_problem(join_link, trigger_is_firstP);
            final SubLObject sibling_variable_map = inference_datastructures_problem_link.mapped_problem_variable_map(sibling_mapped_problem);
            SubLObject sibling_proofs_with_bindings = NIL;
            SubLObject cdolist_list_var = sibling_proofs;
            SubLObject sibling_proof = NIL;
            sibling_proof = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject sibling_sub_proof_bindings = transfer_variable_map_to_bindings(sibling_variable_map, inference_datastructures_proof.proof_bindings(sibling_proof));
                sibling_proofs_with_bindings = cons(cons(sibling_proof, sibling_sub_proof_bindings), sibling_proofs_with_bindings);
                cdolist_list_var = cdolist_list_var.rest();
                sibling_proof = cdolist_list_var.first();
            } 
            sibling_proofs_with_bindings = nreverse(sibling_proofs_with_bindings);
            final SubLObject trigger_sub_proof_bindings = transfer_variable_map_to_bindings(variable_map, trigger_proof_bindings);
            final SubLObject supporting_mapped_proof_lists_by_supporting_problem = (NIL != trigger_is_firstP) ? list(list(cons(trigger_subproof, trigger_sub_proof_bindings)), sibling_proofs_with_bindings) : list(sibling_proofs_with_bindings, list(cons(trigger_subproof, trigger_sub_proof_bindings)));
            SubLObject cdolist_list_var2;
            final SubLObject mapped_subproof_lists = cdolist_list_var2 = cartesian_product(supporting_mapped_proof_lists_by_supporting_problem, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject mapped_subproof_list = NIL;
            mapped_subproof_list = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                thread.resetMultipleValues();
                final SubLObject proof = inference_worker_join.new_join_proof(join_link, mapped_subproof_list);
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

    public static final SubLObject declare_inference_worker_join_file_alt() {
        declareFunction("join_link_data_print_function_trampoline", "JOIN-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("join_link_data_p", "JOIN-LINK-DATA-P", 1, 0, false);
        new com.cyc.cycjava.cycl.inference.harness.inference_worker_join.$join_link_data_p$UnaryFunction();
        declareFunction("j_link_data_join_vars", "J-LINK-DATA-JOIN-VARS", 1, 0, false);
        declareFunction("j_link_data_first_proof_index", "J-LINK-DATA-FIRST-PROOF-INDEX", 1, 0, false);
        declareFunction("j_link_data_second_proof_index", "J-LINK-DATA-SECOND-PROOF-INDEX", 1, 0, false);
        declareFunction("_csetf_j_link_data_join_vars", "_CSETF-J-LINK-DATA-JOIN-VARS", 2, 0, false);
        declareFunction("_csetf_j_link_data_first_proof_index", "_CSETF-J-LINK-DATA-FIRST-PROOF-INDEX", 2, 0, false);
        declareFunction("_csetf_j_link_data_second_proof_index", "_CSETF-J-LINK-DATA-SECOND-PROOF-INDEX", 2, 0, false);
        declareFunction("make_join_link_data", "MAKE-JOIN-LINK-DATA", 0, 1, false);
        declareFunction("valid_join_link_data_p", "VALID-JOIN-LINK-DATA-P", 1, 0, false);
        declareFunction("new_join_link_data", "NEW-JOIN-LINK-DATA", 2, 0, false);
        declareFunction("join_link_p", "JOIN-LINK-P", 1, 0, false);
        declareFunction("maybe_new_join_link", "MAYBE-NEW-JOIN-LINK", 3, 0, false);
        declareFunction("new_join_link", "NEW-JOIN-LINK", 3, 0, false);
        declareFunction("destroy_join_link", "DESTROY-JOIN-LINK", 1, 0, false);
        declareMacro("do_join_link_first_proofs", "DO-JOIN-LINK-FIRST-PROOFS");
        declareMacro("do_join_link_second_proofs", "DO-JOIN-LINK-SECOND-PROOFS");
        declareFunction("join_link_join_vars", "JOIN-LINK-JOIN-VARS", 1, 0, false);
        declareFunction("join_link_first_proof_index", "JOIN-LINK-FIRST-PROOF-INDEX", 1, 0, false);
        declareFunction("join_link_second_proof_index", "JOIN-LINK-SECOND-PROOF-INDEX", 1, 0, false);
        declareFunction("join_link_first_mapped_problem", "JOIN-LINK-FIRST-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("join_link_second_mapped_problem", "JOIN-LINK-SECOND-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("join_link_first_problem", "JOIN-LINK-FIRST-PROBLEM", 1, 0, false);
        declareFunction("join_link_second_problem", "JOIN-LINK-SECOND-PROBLEM", 1, 0, false);
        declareFunction("join_link_trigger_variable_map", "JOIN-LINK-TRIGGER-VARIABLE-MAP", 2, 0, false);
        declareFunction("join_link_trigger_mapped_problem", "JOIN-LINK-TRIGGER-MAPPED-PROBLEM", 2, 0, false);
        declareFunction("join_link_sibling_mapped_problem", "JOIN-LINK-SIBLING-MAPPED-PROBLEM", 2, 0, false);
        declareFunction("join_link_first_proofs_lookup", "JOIN-LINK-FIRST-PROOFS-LOOKUP", 2, 0, false);
        declareFunction("join_link_second_proofs_lookup", "JOIN-LINK-SECOND-PROOFS-LOOKUP", 2, 0, false);
        declareFunction("join_link_sibling_proofs_lookup", "JOIN-LINK-SIBLING-PROOFS-LOOKUP", 3, 0, false);
        declareFunction("join_link_shared_proof_bindings", "JOIN-LINK-SHARED-PROOF-BINDINGS", 3, 0, false);
        declareFunction("join_link_tactic", "JOIN-LINK-TACTIC", 1, 0, false);
        declareFunction("join_link_tactic_int", "JOIN-LINK-TACTIC-INT", 1, 0, false);
        declareFunction("add_join_link_first_proof", "ADD-JOIN-LINK-FIRST-PROOF", 3, 0, false);
        declareFunction("remove_join_link_first_proof", "REMOVE-JOIN-LINK-FIRST-PROOF", 3, 0, false);
        declareFunction("add_join_link_second_proof", "ADD-JOIN-LINK-SECOND-PROOF", 3, 0, false);
        declareFunction("remove_join_link_second_proof", "REMOVE-JOIN-LINK-SECOND-PROOF", 3, 0, false);
        declareFunction("add_join_link_proof", "ADD-JOIN-LINK-PROOF", 3, 0, false);
        declareFunction("remove_join_link_proof_both_ways", "REMOVE-JOIN-LINK-PROOF-BOTH-WAYS", 3, 0, false);
        declareFunction("remove_join_link_proof", "REMOVE-JOIN-LINK-PROOF", 4, 0, false);
        declareFunction("find_or_create_join_link_supporting_mapped_problems", "FIND-OR-CREATE-JOIN-LINK-SUPPORTING-MAPPED-PROBLEMS", 3, 0, false);
        declareFunction("first_problem_shared_vars", "FIRST-PROBLEM-SHARED-VARS", 2, 0, false);
        declareFunction("second_problem_shared_vars", "SECOND-PROBLEM-SHARED-VARS", 2, 0, false);
        declareFunction("shared_sibling_vars", "SHARED-SIBLING-VARS", 2, 0, false);
        declareFunction("join_tactic_p", "JOIN-TACTIC-P", 1, 0, false);
        declareFunction("new_join_tactic", "NEW-JOIN-TACTIC", 2, 0, false);
        declareFunction("join_tactic_link", "JOIN-TACTIC-LINK", 1, 0, false);
        declareFunction("join_tactic_first_supporting_problem_spec", "JOIN-TACTIC-FIRST-SUPPORTING-PROBLEM-SPEC", 1, 0, false);
        declareFunction("join_tactic_first_problem", "JOIN-TACTIC-FIRST-PROBLEM", 1, 0, false);
        declareFunction("join_tactic_second_problem", "JOIN-TACTIC-SECOND-PROBLEM", 1, 0, false);
        declareFunction("join_tactic_lookahead_problems", "JOIN-TACTIC-LOOKAHEAD-PROBLEMS", 1, 0, false);
        declareFunction("determine_new_join_tactics", "DETERMINE-NEW-JOIN-TACTICS", 2, 0, false);
        declareFunction("possibly_determine_new_join_tactic", "POSSIBLY-DETERMINE-NEW-JOIN-TACTIC", 3, 0, false);
        declareFunction("compute_strategic_properties_of_join_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-JOIN-TACTIC", 2, 0, false);
        declareFunction("compute_join_tactic_productivity", "COMPUTE-JOIN-TACTIC-PRODUCTIVITY", 3, 0, false);
        declareFunction("compute_join_tactic_preference_level", "COMPUTE-JOIN-TACTIC-PREFERENCE-LEVEL", 3, 0, false);
        declareFunction("execute_join_tactic", "EXECUTE-JOIN-TACTIC", 1, 0, false);
        declareFunction("find_or_create_join_tactic_supporting_mapped_problems", "FIND-OR-CREATE-JOIN-TACTIC-SUPPORTING-MAPPED-PROBLEMS", 1, 0, false);
        declareFunction("new_join_proof", "NEW-JOIN-PROOF", 2, 0, false);
        declareFunction("join_proof_p", "JOIN-PROOF-P", 1, 0, false);
        declareFunction("bubble_up_proof_to_join_link", "BUBBLE-UP-PROOF-TO-JOIN-LINK", 3, 0, false);
        declareFunction("mapped_proof_is_firstP", "MAPPED-PROOF-IS-FIRST?", 3, 0, false);
        declareFunction("bubble_up_proof_to_join_link_int", "BUBBLE-UP-PROOF-TO-JOIN-LINK-INT", 4, 0, false);
        return NIL;
    }

    public static SubLObject declare_inference_worker_join_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("join_link_data_print_function_trampoline", "JOIN-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("join_link_data_p", "JOIN-LINK-DATA-P", 1, 0, false);
            new inference_worker_join.$join_link_data_p$UnaryFunction();
            declareFunction("j_link_data_join_vars", "J-LINK-DATA-JOIN-VARS", 1, 0, false);
            declareFunction("j_link_data_first_proof_index", "J-LINK-DATA-FIRST-PROOF-INDEX", 1, 0, false);
            declareFunction("j_link_data_second_proof_index", "J-LINK-DATA-SECOND-PROOF-INDEX", 1, 0, false);
            declareFunction("_csetf_j_link_data_join_vars", "_CSETF-J-LINK-DATA-JOIN-VARS", 2, 0, false);
            declareFunction("_csetf_j_link_data_first_proof_index", "_CSETF-J-LINK-DATA-FIRST-PROOF-INDEX", 2, 0, false);
            declareFunction("_csetf_j_link_data_second_proof_index", "_CSETF-J-LINK-DATA-SECOND-PROOF-INDEX", 2, 0, false);
            declareFunction("make_join_link_data", "MAKE-JOIN-LINK-DATA", 0, 1, false);
            declareFunction("visit_defstruct_join_link_data", "VISIT-DEFSTRUCT-JOIN-LINK-DATA", 2, 0, false);
            declareFunction("visit_defstruct_object_join_link_data_method", "VISIT-DEFSTRUCT-OBJECT-JOIN-LINK-DATA-METHOD", 2, 0, false);
            declareFunction("valid_join_link_data_p", "VALID-JOIN-LINK-DATA-P", 1, 0, false);
            declareFunction("new_join_link_data", "NEW-JOIN-LINK-DATA", 2, 0, false);
            declareFunction("join_link_p", "JOIN-LINK-P", 1, 0, false);
            declareFunction("maybe_new_join_link", "MAYBE-NEW-JOIN-LINK", 3, 0, false);
            declareFunction("new_join_link", "NEW-JOIN-LINK", 3, 0, false);
            declareFunction("destroy_join_link", "DESTROY-JOIN-LINK", 1, 0, false);
            declareMacro("do_join_link_first_proofs", "DO-JOIN-LINK-FIRST-PROOFS");
            declareMacro("do_join_link_second_proofs", "DO-JOIN-LINK-SECOND-PROOFS");
            declareFunction("join_link_join_vars", "JOIN-LINK-JOIN-VARS", 1, 0, false);
            declareFunction("join_link_first_proof_index", "JOIN-LINK-FIRST-PROOF-INDEX", 1, 0, false);
            declareFunction("join_link_second_proof_index", "JOIN-LINK-SECOND-PROOF-INDEX", 1, 0, false);
            declareFunction("join_link_first_mapped_problem", "JOIN-LINK-FIRST-MAPPED-PROBLEM", 1, 0, false);
            declareFunction("join_link_second_mapped_problem", "JOIN-LINK-SECOND-MAPPED-PROBLEM", 1, 0, false);
            declareFunction("join_link_first_problem", "JOIN-LINK-FIRST-PROBLEM", 1, 0, false);
            declareFunction("join_link_second_problem", "JOIN-LINK-SECOND-PROBLEM", 1, 0, false);
            declareFunction("join_link_trigger_variable_map", "JOIN-LINK-TRIGGER-VARIABLE-MAP", 2, 0, false);
            declareFunction("join_link_trigger_mapped_problem", "JOIN-LINK-TRIGGER-MAPPED-PROBLEM", 2, 0, false);
            declareFunction("join_link_sibling_mapped_problem", "JOIN-LINK-SIBLING-MAPPED-PROBLEM", 2, 0, false);
            declareFunction("join_link_first_proofs_lookup", "JOIN-LINK-FIRST-PROOFS-LOOKUP", 2, 0, false);
            declareFunction("join_link_second_proofs_lookup", "JOIN-LINK-SECOND-PROOFS-LOOKUP", 2, 0, false);
            declareFunction("join_link_sibling_proofs_lookup", "JOIN-LINK-SIBLING-PROOFS-LOOKUP", 3, 0, false);
            declareFunction("join_link_shared_proof_bindings", "JOIN-LINK-SHARED-PROOF-BINDINGS", 3, 0, false);
            declareFunction("join_link_tactic", "JOIN-LINK-TACTIC", 1, 0, false);
            declareFunction("join_link_tactic_int", "JOIN-LINK-TACTIC-INT", 1, 0, false);
            declareFunction("add_join_link_first_proof", "ADD-JOIN-LINK-FIRST-PROOF", 3, 0, false);
            declareFunction("remove_join_link_first_proof", "REMOVE-JOIN-LINK-FIRST-PROOF", 3, 0, false);
            declareFunction("add_join_link_second_proof", "ADD-JOIN-LINK-SECOND-PROOF", 3, 0, false);
            declareFunction("remove_join_link_second_proof", "REMOVE-JOIN-LINK-SECOND-PROOF", 3, 0, false);
            declareFunction("add_join_link_proof", "ADD-JOIN-LINK-PROOF", 3, 0, false);
            declareFunction("remove_join_link_proof_both_ways", "REMOVE-JOIN-LINK-PROOF-BOTH-WAYS", 3, 0, false);
            declareFunction("remove_join_link_proof", "REMOVE-JOIN-LINK-PROOF", 4, 0, false);
            declareFunction("find_or_create_join_link_supporting_mapped_problems", "FIND-OR-CREATE-JOIN-LINK-SUPPORTING-MAPPED-PROBLEMS", 4, 0, false);
            declareFunction("first_problem_shared_vars", "FIRST-PROBLEM-SHARED-VARS", 2, 0, false);
            declareFunction("second_problem_shared_vars", "SECOND-PROBLEM-SHARED-VARS", 2, 0, false);
            declareFunction("shared_sibling_vars", "SHARED-SIBLING-VARS", 2, 0, false);
            declareFunction("join_tactic_p", "JOIN-TACTIC-P", 1, 0, false);
            declareFunction("new_join_tactic", "NEW-JOIN-TACTIC", 2, 0, false);
            declareFunction("join_tactic_link", "JOIN-TACTIC-LINK", 1, 0, false);
            declareFunction("join_tactic_first_supporting_problem_spec", "JOIN-TACTIC-FIRST-SUPPORTING-PROBLEM-SPEC", 1, 0, false);
            declareFunction("join_tactic_first_problem", "JOIN-TACTIC-FIRST-PROBLEM", 1, 0, false);
            declareFunction("join_tactic_second_problem", "JOIN-TACTIC-SECOND-PROBLEM", 1, 0, false);
            declareFunction("join_tactic_lookahead_problems", "JOIN-TACTIC-LOOKAHEAD-PROBLEMS", 1, 0, false);
            declareFunction("determine_new_join_tactics", "DETERMINE-NEW-JOIN-TACTICS", 2, 0, false);
            declareFunction("possibly_determine_new_join_tactic", "POSSIBLY-DETERMINE-NEW-JOIN-TACTIC", 3, 0, false);
            declareFunction("compute_strategic_properties_of_join_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-JOIN-TACTIC", 2, 0, false);
            declareFunction("compute_join_tactic_productivity", "COMPUTE-JOIN-TACTIC-PRODUCTIVITY", 3, 0, false);
            declareFunction("compute_join_tactic_preference_level", "COMPUTE-JOIN-TACTIC-PREFERENCE-LEVEL", 3, 0, false);
            declareFunction("execute_join_tactic", "EXECUTE-JOIN-TACTIC", 1, 0, false);
            declareFunction("find_or_create_join_tactic_supporting_mapped_problems", "FIND-OR-CREATE-JOIN-TACTIC-SUPPORTING-MAPPED-PROBLEMS", 1, 0, false);
            declareFunction("new_join_proof", "NEW-JOIN-PROOF", 2, 0, false);
            declareFunction("join_proof_p", "JOIN-PROOF-P", 1, 0, false);
            declareFunction("bubble_up_proof_to_join_link", "BUBBLE-UP-PROOF-TO-JOIN-LINK", 3, 0, false);
            declareFunction("mapped_proof_is_firstP", "MAPPED-PROOF-IS-FIRST?", 3, 0, false);
            declareFunction("bubble_up_proof_to_join_link_int", "BUBBLE-UP-PROOF-TO-JOIN-LINK-INT", 4, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("find_or_create_join_link_supporting_mapped_problems", "FIND-OR-CREATE-JOIN-LINK-SUPPORTING-MAPPED-PROBLEMS", 3, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_inference_worker_join_file_Previous() {
        declareFunction("join_link_data_print_function_trampoline", "JOIN-LINK-DATA-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("join_link_data_p", "JOIN-LINK-DATA-P", 1, 0, false);
        new inference_worker_join.$join_link_data_p$UnaryFunction();
        declareFunction("j_link_data_join_vars", "J-LINK-DATA-JOIN-VARS", 1, 0, false);
        declareFunction("j_link_data_first_proof_index", "J-LINK-DATA-FIRST-PROOF-INDEX", 1, 0, false);
        declareFunction("j_link_data_second_proof_index", "J-LINK-DATA-SECOND-PROOF-INDEX", 1, 0, false);
        declareFunction("_csetf_j_link_data_join_vars", "_CSETF-J-LINK-DATA-JOIN-VARS", 2, 0, false);
        declareFunction("_csetf_j_link_data_first_proof_index", "_CSETF-J-LINK-DATA-FIRST-PROOF-INDEX", 2, 0, false);
        declareFunction("_csetf_j_link_data_second_proof_index", "_CSETF-J-LINK-DATA-SECOND-PROOF-INDEX", 2, 0, false);
        declareFunction("make_join_link_data", "MAKE-JOIN-LINK-DATA", 0, 1, false);
        declareFunction("visit_defstruct_join_link_data", "VISIT-DEFSTRUCT-JOIN-LINK-DATA", 2, 0, false);
        declareFunction("visit_defstruct_object_join_link_data_method", "VISIT-DEFSTRUCT-OBJECT-JOIN-LINK-DATA-METHOD", 2, 0, false);
        declareFunction("valid_join_link_data_p", "VALID-JOIN-LINK-DATA-P", 1, 0, false);
        declareFunction("new_join_link_data", "NEW-JOIN-LINK-DATA", 2, 0, false);
        declareFunction("join_link_p", "JOIN-LINK-P", 1, 0, false);
        declareFunction("maybe_new_join_link", "MAYBE-NEW-JOIN-LINK", 3, 0, false);
        declareFunction("new_join_link", "NEW-JOIN-LINK", 3, 0, false);
        declareFunction("destroy_join_link", "DESTROY-JOIN-LINK", 1, 0, false);
        declareMacro("do_join_link_first_proofs", "DO-JOIN-LINK-FIRST-PROOFS");
        declareMacro("do_join_link_second_proofs", "DO-JOIN-LINK-SECOND-PROOFS");
        declareFunction("join_link_join_vars", "JOIN-LINK-JOIN-VARS", 1, 0, false);
        declareFunction("join_link_first_proof_index", "JOIN-LINK-FIRST-PROOF-INDEX", 1, 0, false);
        declareFunction("join_link_second_proof_index", "JOIN-LINK-SECOND-PROOF-INDEX", 1, 0, false);
        declareFunction("join_link_first_mapped_problem", "JOIN-LINK-FIRST-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("join_link_second_mapped_problem", "JOIN-LINK-SECOND-MAPPED-PROBLEM", 1, 0, false);
        declareFunction("join_link_first_problem", "JOIN-LINK-FIRST-PROBLEM", 1, 0, false);
        declareFunction("join_link_second_problem", "JOIN-LINK-SECOND-PROBLEM", 1, 0, false);
        declareFunction("join_link_trigger_variable_map", "JOIN-LINK-TRIGGER-VARIABLE-MAP", 2, 0, false);
        declareFunction("join_link_trigger_mapped_problem", "JOIN-LINK-TRIGGER-MAPPED-PROBLEM", 2, 0, false);
        declareFunction("join_link_sibling_mapped_problem", "JOIN-LINK-SIBLING-MAPPED-PROBLEM", 2, 0, false);
        declareFunction("join_link_first_proofs_lookup", "JOIN-LINK-FIRST-PROOFS-LOOKUP", 2, 0, false);
        declareFunction("join_link_second_proofs_lookup", "JOIN-LINK-SECOND-PROOFS-LOOKUP", 2, 0, false);
        declareFunction("join_link_sibling_proofs_lookup", "JOIN-LINK-SIBLING-PROOFS-LOOKUP", 3, 0, false);
        declareFunction("join_link_shared_proof_bindings", "JOIN-LINK-SHARED-PROOF-BINDINGS", 3, 0, false);
        declareFunction("join_link_tactic", "JOIN-LINK-TACTIC", 1, 0, false);
        declareFunction("join_link_tactic_int", "JOIN-LINK-TACTIC-INT", 1, 0, false);
        declareFunction("add_join_link_first_proof", "ADD-JOIN-LINK-FIRST-PROOF", 3, 0, false);
        declareFunction("remove_join_link_first_proof", "REMOVE-JOIN-LINK-FIRST-PROOF", 3, 0, false);
        declareFunction("add_join_link_second_proof", "ADD-JOIN-LINK-SECOND-PROOF", 3, 0, false);
        declareFunction("remove_join_link_second_proof", "REMOVE-JOIN-LINK-SECOND-PROOF", 3, 0, false);
        declareFunction("add_join_link_proof", "ADD-JOIN-LINK-PROOF", 3, 0, false);
        declareFunction("remove_join_link_proof_both_ways", "REMOVE-JOIN-LINK-PROOF-BOTH-WAYS", 3, 0, false);
        declareFunction("remove_join_link_proof", "REMOVE-JOIN-LINK-PROOF", 4, 0, false);
        declareFunction("find_or_create_join_link_supporting_mapped_problems", "FIND-OR-CREATE-JOIN-LINK-SUPPORTING-MAPPED-PROBLEMS", 4, 0, false);
        declareFunction("first_problem_shared_vars", "FIRST-PROBLEM-SHARED-VARS", 2, 0, false);
        declareFunction("second_problem_shared_vars", "SECOND-PROBLEM-SHARED-VARS", 2, 0, false);
        declareFunction("shared_sibling_vars", "SHARED-SIBLING-VARS", 2, 0, false);
        declareFunction("join_tactic_p", "JOIN-TACTIC-P", 1, 0, false);
        declareFunction("new_join_tactic", "NEW-JOIN-TACTIC", 2, 0, false);
        declareFunction("join_tactic_link", "JOIN-TACTIC-LINK", 1, 0, false);
        declareFunction("join_tactic_first_supporting_problem_spec", "JOIN-TACTIC-FIRST-SUPPORTING-PROBLEM-SPEC", 1, 0, false);
        declareFunction("join_tactic_first_problem", "JOIN-TACTIC-FIRST-PROBLEM", 1, 0, false);
        declareFunction("join_tactic_second_problem", "JOIN-TACTIC-SECOND-PROBLEM", 1, 0, false);
        declareFunction("join_tactic_lookahead_problems", "JOIN-TACTIC-LOOKAHEAD-PROBLEMS", 1, 0, false);
        declareFunction("determine_new_join_tactics", "DETERMINE-NEW-JOIN-TACTICS", 2, 0, false);
        declareFunction("possibly_determine_new_join_tactic", "POSSIBLY-DETERMINE-NEW-JOIN-TACTIC", 3, 0, false);
        declareFunction("compute_strategic_properties_of_join_tactic", "COMPUTE-STRATEGIC-PROPERTIES-OF-JOIN-TACTIC", 2, 0, false);
        declareFunction("compute_join_tactic_productivity", "COMPUTE-JOIN-TACTIC-PRODUCTIVITY", 3, 0, false);
        declareFunction("compute_join_tactic_preference_level", "COMPUTE-JOIN-TACTIC-PREFERENCE-LEVEL", 3, 0, false);
        declareFunction("execute_join_tactic", "EXECUTE-JOIN-TACTIC", 1, 0, false);
        declareFunction("find_or_create_join_tactic_supporting_mapped_problems", "FIND-OR-CREATE-JOIN-TACTIC-SUPPORTING-MAPPED-PROBLEMS", 1, 0, false);
        declareFunction("new_join_proof", "NEW-JOIN-PROOF", 2, 0, false);
        declareFunction("join_proof_p", "JOIN-PROOF-P", 1, 0, false);
        declareFunction("bubble_up_proof_to_join_link", "BUBBLE-UP-PROOF-TO-JOIN-LINK", 3, 0, false);
        declareFunction("mapped_proof_is_firstP", "MAPPED-PROOF-IS-FIRST?", 3, 0, false);
        declareFunction("bubble_up_proof_to_join_link_int", "BUBBLE-UP-PROOF-TO-JOIN-LINK-INT", 4, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("JOIN-VARS"), makeSymbol("FIRST-PROOF-INDEX"), makeSymbol("SECOND-PROOF-INDEX"));

    static private final SubLList $list_alt3 = list(makeKeyword("JOIN-VARS"), makeKeyword("FIRST-PROOF-INDEX"), makeKeyword("SECOND-PROOF-INDEX"));

    static private final SubLList $list_alt4 = list(makeSymbol("J-LINK-DATA-JOIN-VARS"), makeSymbol("J-LINK-DATA-FIRST-PROOF-INDEX"), makeSymbol("J-LINK-DATA-SECOND-PROOF-INDEX"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-J-LINK-DATA-JOIN-VARS"), makeSymbol("_CSETF-J-LINK-DATA-FIRST-PROOF-INDEX"), makeSymbol("_CSETF-J-LINK-DATA-SECOND-PROOF-INDEX"));

    static private final SubLString $str_alt17$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt21 = list(list(makeSymbol("BINDINGS-VAR"), makeSymbol("PROOF-VAR"), makeSymbol("JOIN-LINK")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym22$INDEX = makeUninternedSymbol("INDEX");

    static private final SubLSymbol $sym23$PROOF_LIST_VAR = makeUninternedSymbol("PROOF-LIST-VAR");

    static private final SubLString $str_alt33$couldn_t_find_the_join_tactic_for = makeString("couldn't find the join tactic for ~s");

    static private final SubLString $str_alt36$_a_was_a_rejected_proof = makeString("~a was a rejected proof");

    public static SubLObject init_inference_worker_join_file() {
        defconstant("*DTP-JOIN-LINK-DATA*", inference_worker_join.JOIN_LINK_DATA);
        defparameter("*JOIN-MODULE*", inference_modules.inference_structural_module($JOIN, UNPROVIDED));
        defparameter("*JOIN-PRODUCTIVITY-SCALING-FACTOR*", EIGHT_INTEGER);
        return NIL;
    }

    static private final SubLString $str_alt46$first_problem__ = makeString("first problem: ");

    public static SubLObject setup_inference_worker_join_file() {
        register_method($print_object_method_table$.getGlobalValue(), inference_worker_join.$dtp_join_link_data$.getGlobalValue(), symbol_function(inference_worker_join.JOIN_LINK_DATA_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(inference_worker_join.$list8);
        def_csetf(inference_worker_join.J_LINK_DATA_JOIN_VARS, inference_worker_join._CSETF_J_LINK_DATA_JOIN_VARS);
        def_csetf(inference_worker_join.J_LINK_DATA_FIRST_PROOF_INDEX, inference_worker_join._CSETF_J_LINK_DATA_FIRST_PROOF_INDEX);
        def_csetf(inference_worker_join.J_LINK_DATA_SECOND_PROOF_INDEX, inference_worker_join._CSETF_J_LINK_DATA_SECOND_PROOF_INDEX);
        identity(inference_worker_join.JOIN_LINK_DATA);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), inference_worker_join.$dtp_join_link_data$.getGlobalValue(), symbol_function(inference_worker_join.VISIT_DEFSTRUCT_OBJECT_JOIN_LINK_DATA_METHOD));
        register_macro_helper(inference_worker_join.JOIN_LINK_FIRST_PROOF_INDEX, inference_worker_join.DO_JOIN_LINK_FIRST_PROOFS);
        register_macro_helper(inference_worker_join.JOIN_LINK_SECOND_PROOF_INDEX, inference_worker_join.DO_JOIN_LINK_SECOND_PROOFS);
        return NIL;
    }

    static private final SubLString $str_alt47$second_problem__ = makeString("second problem: ");

    static private final SubLString $str_alt48$Join_tactics_like__a_must_only_ap = makeString("Join tactics like ~a must only apply to singleton problem queries, but ~s was not a singleton");

    @Override
    public void declareFunctions() {
        inference_worker_join.declare_inference_worker_join_file();
    }

    @Override
    public void initializeVariables() {
        inference_worker_join.init_inference_worker_join_file();
    }

    @Override
    public void runTopLevelForms() {
        inference_worker_join.setup_inference_worker_join_file();
    }

    static {
    }

    public static final class $join_link_data_native extends SubLStructNative {
        public SubLObject $join_vars;

        public SubLObject $first_proof_index;

        public SubLObject $second_proof_index;

        private static final SubLStructDeclNative structDecl;

        public $join_link_data_native() {
            inference_worker_join.$join_link_data_native.this.$join_vars = Lisp.NIL;
            inference_worker_join.$join_link_data_native.this.$first_proof_index = Lisp.NIL;
            inference_worker_join.$join_link_data_native.this.$second_proof_index = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return inference_worker_join.$join_link_data_native.this.$join_vars;
        }

        @Override
        public SubLObject getField3() {
            return inference_worker_join.$join_link_data_native.this.$first_proof_index;
        }

        @Override
        public SubLObject getField4() {
            return inference_worker_join.$join_link_data_native.this.$second_proof_index;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return inference_worker_join.$join_link_data_native.this.$join_vars = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return inference_worker_join.$join_link_data_native.this.$first_proof_index = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return inference_worker_join.$join_link_data_native.this.$second_proof_index = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.inference.harness.inference_worker_join.$join_link_data_native.class, inference_worker_join.JOIN_LINK_DATA, inference_worker_join.JOIN_LINK_DATA_P, inference_worker_join.$list2, inference_worker_join.$list3, new String[]{ "$join_vars", "$first_proof_index", "$second_proof_index" }, inference_worker_join.$list4, inference_worker_join.$list5, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $join_link_data_p$UnaryFunction extends UnaryFunction {
        public $join_link_data_p$UnaryFunction() {
            super(extractFunctionNamed("JOIN-LINK-DATA-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return inference_worker_join.join_link_data_p(arg1);
        }
    }
}

/**
 * Total time: 246 ms
 */
