package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.narts_high.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class narts_high extends SubLTranslatedFile {
    public static final SubLFile me = new narts_high();

    public static final String myName = "com.cyc.cycjava.cycl.narts_high";

    public static final String myFingerPrint = "1f3c93da4de9c6ad82d396a9e3101f6b79209582eb2aea100664a70978618a8d";

    // defparameter
    public static final SubLSymbol $nart_dump_id_table$ = makeSymbol("*NART-DUMP-ID-TABLE*");

    private static final SubLList $list0 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), makeSymbol("NUM"), list(makeSymbol("PROGRESS-MESSAGE"), makeString("mapping narts for sweep")), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list1 = list(makeKeyword("NUM"), makeKeyword("PROGRESS-MESSAGE"), makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    private static final SubLString $$$mapping_narts_for_sweep = makeString("mapping narts for sweep");







    private static final SubLSymbol PROGRESS_CSOME = makeSymbol("PROGRESS-CSOME");

    private static final SubLSymbol NARTS_AROUND = makeSymbol("NARTS-AROUND");

    private static final SubLList $list11 = list(makeSymbol("NEXT-NART-ID"));

    private static final SubLSymbol DO_NARTS = makeSymbol("DO-NARTS");



    private static final SubLSymbol NART_HL_FORMULA = makeSymbol("NART-HL-FORMULA");

    public static final SubLList $list15 = list(makeSymbol("NART"));

    private static final SubLString $str16$Return_the_hl_formula_of_this_NAR = makeString("Return the hl formula of this NART.");

    public static final SubLList $list17 = list(list(makeSymbol("NART"), makeSymbol("NART-P")));

    private static final SubLList $list18 = list(list(makeSymbol("NIL-OR"), makeSymbol("CONSP")));



    private static final SubLList $list20 = list(makeSymbol("OBJECT"));

    private static final SubLString $str21$Return_T_iff_OBJECT_is_a_datastru = makeString("Return T iff OBJECT is a datastructure implementing a non-atomic unreified term (NAUT).\n   By definition, this satisies @xref CYCL-NAT-P but not @xref NART-P.");

    private static final SubLList $list22 = list(makeSymbol("BOOLEANP"));

    private static final SubLSymbol NART_EL_FORMULA = makeSymbol("NART-EL-FORMULA");

    private static final SubLString $str24$Return_the_el_formula_of_this_NAR = makeString("Return the el formula of this NART.");

    private static final SubLSymbol POSSIBLY_NAUT_P = makeSymbol("POSSIBLY-NAUT-P");



    private static final SubLSymbol RANDOM_NART = makeSymbol("RANDOM-NART");

    public static final SubLList $list28 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(makeSymbol("FUNCTION"), makeSymbol("TRUE"))));

    private static final SubLString $str29$Return_a_randomly_chosen_NART_tha = makeString("Return a randomly chosen NART that satisfies TEST");

    public static final SubLList $list30 = list(makeSymbol("NART-P"));

    private static final SubLInteger $int$500 = makeInteger(500);



    private static final SubLSymbol HL_FIND_OR_CREATE_NART = makeSymbol("HL-FIND-OR-CREATE-NART");

    private static final SubLList $list34 = list(makeSymbol("CYC-FIND-OR-CREATE-NART"));

    private static final SubLSymbol FIND_OR_CREATE_NART = makeSymbol("FIND-OR-CREATE-NART");

    private static final SubLList $list36 = list(makeSymbol("HL-FIND-OR-CREATE-NART"));



    private static final SubLString $str38$A_horrible_and_gross_circularity_ = makeString("A horrible and gross circularity has occurred -- ~s is a dependent of itself!");

    private static final SubLSymbol REMOVE_NART = makeSymbol("REMOVE-NART");

    private static final SubLString $str40$Remove_NART_from_the_KB_ = makeString("Remove NART from the KB.");

    private static final SubLList $list41 = list(makeSymbol("NULL"));

    private static final SubLList $list42 = list(makeSymbol("CHECKPOINT-COUNT"), makeSymbol("CHECKPOINT-NEXT-ID"));



    private static final SubLList $list44 = list(list(makeSymbol("*NART-DUMP-ID-TABLE*"), list(makeSymbol("CREATE-NART-DUMP-ID-TABLE"))), list(makeSymbol("*CFASL-NART-HANDLE-FUNC*"), list(makeSymbol("QUOTE"), makeSymbol("NART-DUMP-ID"))));



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    private static final SubLObject $$forwardReificationRule = reader_make_constant_shell(makeString("forwardReificationRule"));

    private static final SubLSymbol $sym49$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol NART_INDEPENDENT_ASSERTIONS_INTERNAL = makeSymbol("NART-INDEPENDENT-ASSERTIONS-INTERNAL");

    private static final SubLString $$$Looking_for_bad_narts = makeString("Looking for bad narts");





    private static final SubLList $list54 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));











    private static final SubLSymbol FIND_NART_BY_ID = makeSymbol("FIND-NART-BY-ID");

    public static SubLObject do_recent_narts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list0);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list0);
            if (NIL == member(current_$1, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list0);
        }
        final SubLObject num_tail = property_list_member($NUM, current);
        final SubLObject num = (NIL != num_tail) ? cadr(num_tail) : NIL;
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : $$$mapping_narts_for_sweep;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(PIF, list(POSITIVE_INTEGER_P, num), listS(PROGRESS_CSOME, list(var, list(NARTS_AROUND, $list11, num, num), progress_message, done), append(body, NIL)), listS(DO_NARTS, list(var, progress_message, $DONE, done), append(body, NIL)));
    }

    public static SubLObject nart_hl_formula(final SubLObject nart) {
        SubLTrampolineFile.enforceType(nart, NART_P);
        return NIL != nart_handles.nart_handle_validP(nart) ? narts_interface.kb_nart_hl_formula(nart) : NIL;
    }

    public static SubLObject nart_lookup(final SubLObject nart_hl_formula) {
        return narts_interface.kb_lookup_nart(nart_hl_formula);
    }

    public static SubLObject naut_p(final SubLObject v_object) {
        if (NIL != possibly_naut_p(v_object)) {
            return cycl_grammar.cycl_nat_p(v_object);
        }
        return NIL;
    }

    public static SubLObject invalid_nartP(final SubLObject nart, SubLObject robust) {
        if (robust == UNPROVIDED) {
            robust = NIL;
        }
        return makeBoolean((NIL != nart_handles.nart_p(nart)) && (NIL == nart_handles.valid_nartP(nart, UNPROVIDED)));
    }

    public static SubLObject invalid_nart_robustP(final SubLObject nart) {
        SubLObject invalidP = makeBoolean((NIL != nart_handles.nart_p(nart)) && (NIL == nart_handles.valid_nart_robustP(nart)));
        if (NIL == invalidP) {
            final SubLObject tou = function_terms.term_of_unit_assertion(nart);
            if (NIL == tou) {
                return T;
            }
            invalidP = makeBoolean(!assertions_high.gaf_arg2(tou).equal(nart_hl_formula(nart)));
        }
        return invalidP;
    }

    public static SubLObject nart_el_formula(final SubLObject nart) {
        SubLTrampolineFile.enforceType(nart, NART_P);
        return transform_list_utilities.transform(nart, symbol_function(NART_P), symbol_function(NART_HL_FORMULA), UNPROVIDED);
    }

    public static SubLObject find_nart(final SubLObject nart_hl_formula) {
        assert NIL != possibly_naut_p(nart_hl_formula) : "el_utilities.possibly_naut_p(nart_hl_formula) " + "CommonSymbols.NIL != el_utilities.possibly_naut_p(nart_hl_formula) " + nart_hl_formula;
        final SubLObject nart = nart_substitute(nart_hl_formula);
        return NIL != nart_handles.nart_p(nart) ? nart : NIL;
    }

    public static SubLObject random_nart(SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(TRUE);
        }
        if (nart_handles.nart_count().numG(ZERO_INTEGER)) {
            final SubLObject max_id = nart_handles.next_nart_id();
            SubLObject v_answer;
            SubLObject candidate;
            for (v_answer = NIL; NIL == v_answer; v_answer = candidate) {
                candidate = nart_handles.find_nart_by_id(random.random(max_id));
                if ((NIL != candidate) && (NIL != funcall(test, candidate))) {
                }
            }
            return v_answer;
        }
        return NIL;
    }

    public static SubLObject sample_narts(SubLObject n, SubLObject allow_repeatsP, SubLObject test) {
        if (n == UNPROVIDED) {
            n = $int$500;
        }
        if (allow_repeatsP == UNPROVIDED) {
            allow_repeatsP = NIL;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(TRUE);
        }
        assert NIL != subl_promotions.non_negative_integer_p(n) : "subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) " + n;
        if (NIL != allow_repeatsP) {
            SubLObject result = NIL;
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
                result = cons(random_nart(test), result);
            }
            return result;
        }
        SubLObject result;
        for (result = set_contents.new_set_contents(n, symbol_function(EQL)); set_contents.set_contents_size(result).numL(n); result = set_contents.set_contents_add(random_nart(test), result, symbol_function(EQL))) {
        }
        return set_contents.set_contents_element_list(result);
    }

    public static SubLObject hl_find_or_create_nart(final SubLObject nart_hl_formula) {
        assert NIL != possibly_naut_p(nart_hl_formula) : "el_utilities.possibly_naut_p(nart_hl_formula) " + "CommonSymbols.NIL != el_utilities.possibly_naut_p(nart_hl_formula) " + nart_hl_formula;
        return czer_main.cyc_find_or_create_nart(nart_hl_formula, UNPROVIDED);
    }

    public static SubLObject tl_find_or_create_nart(final SubLObject canonical_naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
            result = czer_main.cyc_find_or_create_nart(canon_tl.transform_tl_terms_to_hl(canonical_naut), UNPROVIDED);
        } finally {
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject find_or_create_nart(final SubLObject nart_hl_formula) {
        return hl_find_or_create_nart(nart_hl_formula);
    }

    public static SubLObject remove_dependent_narts(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        SubLObject cdolist_list_var;
        final SubLObject dependencies = cdolist_list_var = indexing_utilities.dependent_narts(fort);
        SubLObject dependent = NIL;
        dependent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != nart_handles.valid_nartP(dependent, UNPROVIDED)) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && fort.eql(dependent)) {
                    Errors.error($str38$A_horrible_and_gross_circularity_, fort);
                }
                cyc_kernel.cyc_kill(dependent);
            }
            cdolist_list_var = cdolist_list_var.rest();
            dependent = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject remove_nart(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(nart, NART_P);
        final SubLObject _prev_bind_0 = hl_macros.$forts_being_removed$.currentBinding(thread);
        try {
            hl_macros.$forts_being_removed$.bind(cons(nart, hl_macros.$forts_being_removed$.getDynamicValue(thread)), thread);
            if ((NIL != kb_control_vars.time_kb_loaded_p()) && (NIL != sbhl_time_utilities.sbhl_temporality_term_p(nart))) {
                sbhl_time_assertion_processing.remove_fort_from_sbhl_temporality_structures(nart);
            }
            remove_dependent_narts(nart);
            kb_indexing.remove_term_indices(nart);
            kb_hl_supports_high.tms_remove_kb_hl_supports_mentioning_term(nart);
            cardinality_estimates.clear_cardinality_estimates(nart);
        } finally {
            hl_macros.$forts_being_removed$.rebind(_prev_bind_0, thread);
        }
        if (NIL != tms.tms_please_kill_this_term_for_me(nart)) {
            return nart;
        }
        return narts_interface.kb_remove_nart(nart);
    }

    public static SubLObject nart_expand(SubLObject v_object) {
        if (NIL != list_utilities.tree_find_if(symbol_function(NART_P), v_object, UNPROVIDED)) {
            v_object = transform_list_utilities.transform(v_object, symbol_function(NART_P), symbol_function(NART_EL_FORMULA), UNPROVIDED);
        }
        return v_object;
    }

    public static SubLObject nart_substitute(final SubLObject v_object) {
        if (NIL == possibly_naut_p(v_object)) {
            return v_object;
        }
        return nart_substitute_recursive(v_object);
    }

    public static SubLObject nart_substitute_recursive(final SubLObject tree) {
        if (NIL != subl_escape_p(tree)) {
            return tree;
        }
        SubLObject result = NIL;
        if (NIL != contains_nat_formula_as_elementP(tree)) {
            final SubLObject new_tree = copy_list(tree);
            SubLObject list;
            SubLObject arg;
            SubLObject sub_nart;
            for (list = NIL, list = new_tree; !list.isAtom(); list = list.rest()) {
                arg = list.first();
                if (NIL != function_terms.nat_formula_p(arg)) {
                    sub_nart = nart_substitute_recursive(arg);
                    if (NIL != sub_nart) {
                        rplaca(list, sub_nart);
                    }
                }
            }
            result = new_tree;
        } else {
            result = tree;
        }
        final SubLObject nart = nart_lookup(result);
        return NIL != nart_handles.nart_p(nart) ? nart : result;
    }

    public static SubLObject contains_nat_formula_as_elementP(final SubLObject list) {
        SubLObject rest;
        SubLObject arg;
        for (rest = NIL, rest = list; !rest.isAtom(); rest = rest.rest()) {
            arg = rest.first();
            if (NIL != function_terms.nat_formula_p(arg)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject nart_with_functor_p(final SubLObject functor, final SubLObject v_object) {
        return makeBoolean((NIL != nart_handles.nart_p(v_object)) && functor.eql(cycl_utilities.nat_functor(v_object)));
    }

    public static SubLObject nart_checkpoint_p(final SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != list_utilities.every_in_list(NON_NEGATIVE_INTEGER_P, v_object, UNPROVIDED)));
    }

    public static SubLObject new_nart_checkpoint() {
        final SubLObject nart_count = nart_handles.nart_count();
        final SubLObject next_nart_id = nart_handles.next_nart_id();
        return list(nart_count, next_nart_id);
    }

    public static SubLObject nart_checkpoint_currentP(final SubLObject nart_checkpoint) {
        SubLObject checkpoint_count = NIL;
        SubLObject checkpoint_next_id = NIL;
        destructuring_bind_must_consp(nart_checkpoint, nart_checkpoint, $list42);
        checkpoint_count = nart_checkpoint.first();
        SubLObject current = nart_checkpoint.rest();
        destructuring_bind_must_consp(current, nart_checkpoint, $list42);
        checkpoint_next_id = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean(checkpoint_count.numE(nart_handles.nart_count()) && checkpoint_next_id.numE(nart_handles.next_nart_id()));
        }
        cdestructuring_bind_error(nart_checkpoint, $list42);
        return NIL;
    }

    public static SubLObject nart_dump_id(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id = nart_handles.nart_id(nart);
        final SubLObject dump_table = $nart_dump_id_table$.getDynamicValue(thread);
        if (NIL != dump_table) {
            id = id_index_lookup(dump_table, id, UNPROVIDED);
        }
        return id;
    }

    public static SubLObject find_nart_by_dump_id(final SubLObject dump_id) {
        return nart_handles.find_nart_by_id(dump_id);
    }

    public static SubLObject with_nart_dump_id_table(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list44, append(body, NIL));
    }

    public static SubLObject useful_nartP(final SubLObject nart) {
        return makeBoolean(((NIL != nart_handles.nart_p(nart)) && (NIL != function_terms.nat_formula_p(nart_hl_formula(nart)))) && (((NIL != nart_specified_to_be_retainedP(nart)) || (NIL != skolemize_forward_nartP(nart))) || (NIL != nart_independent_assertions(nart))));
    }

    public static SubLObject useless_nartP(final SubLObject nart) {
        return makeBoolean((NIL != nart_handles.nart_p(nart)) && (NIL == useful_nartP(nart)));
    }

    public static SubLObject nart_specified_to_be_retainedP(final SubLObject nart) {
        return kb_accessors.term_specified_to_be_retainedP(nart);
    }

    public static SubLObject skolemize_forward_nartP(final SubLObject nart) {
        return makeBoolean((NIL != kb_accessors.skolemize_forward_somewhereP(cycl_utilities.nat_functor(nart))) || (NIL != appears_in_forward_reification_ruleP(cycl_utilities.nat_functor(nart))));
    }

    public static SubLObject appears_in_forward_reification_ruleP(final SubLObject functor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != kb_mapping_macros.do_function_rule_index_key_validator(functor, NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_function_rule_final_index_spec_iterator(functor, NIL);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $RULE, NIL, NIL);
                            SubLObject done_var_$2 = NIL;
                            final SubLObject token_var_$3 = NIL;
                            while (NIL == done_var_$2) {
                                final SubLObject rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$3);
                                final SubLObject valid_$4 = makeBoolean(!token_var_$3.eql(rule));
                                if ((NIL != valid_$4) && (NIL != kb_mapping_utilities.pred_u_v_holds($$forwardReificationRule, functor, rule, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    return T;
                                }
                                done_var_$2 = makeBoolean(NIL == valid_$4);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject nart_dependent_assertions(final SubLObject nart) {
        assert NIL != nart_handles.nart_p(nart) : "nart_handles.nart_p(nart) " + "CommonSymbols.NIL != nart_handles.nart_p(nart) " + nart;
        return assertions_interface.all_dependent_assertions(function_terms.term_of_unit_assertion(nart));
    }

    public static SubLObject nart_independent_assertions(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != nart_handles.nart_p(nart) : "nart_handles.nart_p(nart) " + "CommonSymbols.NIL != nart_handles.nart_p(nart) " + nart;
        final SubLObject term_of_unit = function_terms.term_of_unit_assertion(nart);
        if (NIL != term_of_unit) {
            SubLObject independent_assertions = NIL;
            final SubLObject _prev_bind_0 = $mapping_target$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $mapping_answer$.currentBinding(thread);
            try {
                $mapping_target$.bind(assertions_low.assertion_dependencies(term_of_unit), thread);
                $mapping_answer$.bind(make_hash_table(integerDivide(kb_indexing.num_index(nart), FOUR_INTEGER), UNPROVIDED, UNPROVIDED), thread);
                final SubLObject _prev_bind_0_$6 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$7 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    kb_mapping.map_term(symbol_function(NART_INDEPENDENT_ASSERTIONS_INTERNAL), nart);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$7, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$6, thread);
                }
                independent_assertions = hash_table_utilities.hash_table_keys($mapping_answer$.getDynamicValue(thread));
            } finally {
                $mapping_answer$.rebind(_prev_bind_2, thread);
                $mapping_target$.rebind(_prev_bind_0, thread);
            }
            return independent_assertions;
        }
        return NIL;
    }

    public static SubLObject nart_independent_assertions_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == gethash(assertion, $mapping_target$.getDynamicValue(thread), UNPROVIDED)) {
            sethash(assertion, $mapping_answer$.getDynamicValue(thread), T);
        }
        return NIL;
    }

    public static SubLObject nart_id_from_recipe(final SubLObject nart_hl_formula) {
        final SubLObject nart = nart_lookup(nart_hl_formula);
        return NIL != nart_handles.nart_p(nart) ? nart_handles.nart_id(nart) : NIL;
    }

    public static SubLObject nart_knows_its_hl_formulaP(final SubLObject nart) {
        return el_formula_p(nart_hl_formula(nart));
    }

    public static SubLObject all_narts_know_their_hl_formulasP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject badP = NIL;
        final SubLObject idx = nart_handles.do_narts_table();
        final SubLObject mess = $$$Looking_for_bad_narts;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$8 = idx;
                if (NIL == id_index_objects_empty_p(idx_$8, $SKIP)) {
                    final SubLObject idx_$9 = idx_$8;
                    if (NIL == id_index_dense_objects_empty_p(idx_$9, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$9);
                        final SubLObject backwardP_var = NIL;
                        final SubLObject length = length(vector_var);
                        SubLObject current;
                        final SubLObject datum = current = (NIL != backwardP_var) ? list(subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length, ONE_INTEGER);
                        SubLObject start = NIL;
                        SubLObject end = NIL;
                        SubLObject delta = NIL;
                        destructuring_bind_must_consp(current, datum, $list54);
                        start = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list54);
                        end = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list54);
                        delta = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL == badP) {
                                SubLObject end_var;
                                SubLObject id;
                                SubLObject nart;
                                for (end_var = end, id = NIL, id = start; (NIL == badP) && (NIL == subl_macros.do_numbers_endtest(id, delta, end_var)); id = add(id, delta)) {
                                    nart = aref(vector_var, id);
                                    if ((NIL == id_index_tombstone_p(nart)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(nart)) {
                                            nart = $SKIP;
                                        }
                                        if (NIL == nart_knows_its_hl_formulaP(nart)) {
                                            badP = T;
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list54);
                        }
                    }
                    final SubLObject idx_$10 = idx_$8;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$10)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$10);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$10);
                        final SubLObject end_id = id_index_next_id(idx_$10);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id) && (NIL == badP)) {
                            final SubLObject nart2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(nart2))) {
                                if (NIL == nart_knows_its_hl_formulaP(nart2)) {
                                    badP = T;
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return makeBoolean(NIL == badP);
    }

    public static SubLObject narts_that_dont_know_their_hl_formulas() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject bad_narts = NIL;
        final SubLObject idx = nart_handles.do_narts_table();
        final SubLObject mess = $$$Looking_for_bad_narts;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$12 = idx;
                if (NIL == id_index_objects_empty_p(idx_$12, $SKIP)) {
                    final SubLObject idx_$13 = idx_$12;
                    if (NIL == id_index_dense_objects_empty_p(idx_$13, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$13);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject nart;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            nart = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(nart)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(nart)) {
                                    nart = $SKIP;
                                }
                                if (NIL == nart_knows_its_hl_formulaP(nart)) {
                                    bad_narts = cons(nart, bad_narts);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$14 = idx_$12;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$14)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$14);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$14);
                        final SubLObject end_id = id_index_next_id(idx_$14);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject nart2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(nart2))) {
                                if (NIL == nart_knows_its_hl_formulaP(nart2)) {
                                    bad_narts = cons(nart2, bad_narts);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return bad_narts;
    }

    public static SubLObject nart_findable_by_hl_formulaP(final SubLObject nart) {
        final SubLObject nart_hl_formula = nart_hl_formula(nart);
        final SubLObject found_nart = find_nart(nart_hl_formula);
        return eql(nart, found_nart);
    }

    public static SubLObject cleanup_invalid_nart(final SubLObject nart_hl_formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != possibly_naut_p(nart_hl_formula)) {
            final SubLObject ans = NIL;
            final SubLObject l_index = kb_indexing.best_nat_lookup_index(nart_hl_formula, NIL);
            final SubLObject pcase_var;
            final SubLObject method = pcase_var = kb_mapping_macros.do_nli_extract_method(l_index);
            if (pcase_var.eql($NART_ARG)) {
                thread.resetMultipleValues();
                final SubLObject v_term = kb_mapping_macros.do_nli_vna_extract_keys(l_index);
                final SubLObject argnum = thread.secondMultipleValue();
                final SubLObject functor = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != argnum) {
                    if (NIL != functor) {
                        if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, argnum, functor)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, argnum, functor);
                            SubLObject done_var = ans;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$16 = ans;
                                        final SubLObject token_var_$17 = NIL;
                                        while (NIL == done_var_$16) {
                                            final SubLObject tou_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$17);
                                            final SubLObject valid_$18 = makeBoolean(!token_var_$17.eql(tou_assertion));
                                            if ((NIL != valid_$18) && (NIL != assertion_handles.valid_assertionP(tou_assertion, UNPROVIDED))) {
                                                final SubLObject naut = assertions_high.gaf_arg2(tou_assertion);
                                                if ((NIL != possibly_naut_p(naut)) && (NIL != funcall($nat_matching_predicate$.getDynamicValue(thread), naut, nart_hl_formula))) {
                                                    final SubLObject nart = assertions_high.gaf_arg1(tou_assertion);
                                                    if (NIL == nart_handles.valid_nartP(nart, UNPROVIDED)) {
                                                        return tms.tms_remove_assertion(tou_assertion);
                                                    }
                                                }
                                            }
                                            done_var_$16 = makeBoolean((NIL == valid_$18) || (NIL != ans));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != ans));
                            } 
                        }
                    } else
                        if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, argnum, NIL)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, argnum, NIL);
                            SubLObject done_var = ans;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$17 = ans;
                                        final SubLObject token_var_$18 = NIL;
                                        while (NIL == done_var_$17) {
                                            final SubLObject tou_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$18);
                                            final SubLObject valid_$19 = makeBoolean(!token_var_$18.eql(tou_assertion));
                                            if ((NIL != valid_$19) && (NIL != assertion_handles.valid_assertionP(tou_assertion, UNPROVIDED))) {
                                                final SubLObject naut = assertions_high.gaf_arg2(tou_assertion);
                                                if ((NIL != possibly_naut_p(naut)) && (NIL != funcall($nat_matching_predicate$.getDynamicValue(thread), naut, nart_hl_formula))) {
                                                    final SubLObject nart = assertions_high.gaf_arg1(tou_assertion);
                                                    if (NIL == nart_handles.valid_nartP(nart, UNPROVIDED)) {
                                                        return tms.tms_remove_assertion(tou_assertion);
                                                    }
                                                }
                                            }
                                            done_var_$17 = makeBoolean((NIL == valid_$19) || (NIL != ans));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != ans));
                            } 
                        }

                } else
                    if (NIL != functor) {
                        if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, NIL, functor)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, NIL, functor);
                            SubLObject done_var = ans;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$18 = ans;
                                        final SubLObject token_var_$19 = NIL;
                                        while (NIL == done_var_$18) {
                                            final SubLObject tou_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
                                            final SubLObject valid_$20 = makeBoolean(!token_var_$19.eql(tou_assertion));
                                            if ((NIL != valid_$20) && (NIL != assertion_handles.valid_assertionP(tou_assertion, UNPROVIDED))) {
                                                final SubLObject naut = assertions_high.gaf_arg2(tou_assertion);
                                                if ((NIL != possibly_naut_p(naut)) && (NIL != funcall($nat_matching_predicate$.getDynamicValue(thread), naut, nart_hl_formula))) {
                                                    final SubLObject nart = assertions_high.gaf_arg1(tou_assertion);
                                                    if (NIL == nart_handles.valid_nartP(nart, UNPROVIDED)) {
                                                        return tms.tms_remove_assertion(tou_assertion);
                                                    }
                                                }
                                            }
                                            done_var_$18 = makeBoolean((NIL == valid_$20) || (NIL != ans));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values3 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values3);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != ans));
                            } 
                        }
                    } else
                        if (NIL != kb_mapping_macros.do_nart_arg_index_key_validator(v_term, NIL, NIL)) {
                            final SubLObject iterator_var = kb_mapping_macros.new_nart_arg_final_index_spec_iterator(v_term, NIL, NIL);
                            SubLObject done_var = ans;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$19 = ans;
                                        final SubLObject token_var_$20 = NIL;
                                        while (NIL == done_var_$19) {
                                            final SubLObject tou_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$20);
                                            final SubLObject valid_$21 = makeBoolean(!token_var_$20.eql(tou_assertion));
                                            if ((NIL != valid_$21) && (NIL != assertion_handles.valid_assertionP(tou_assertion, UNPROVIDED))) {
                                                final SubLObject naut = assertions_high.gaf_arg2(tou_assertion);
                                                if ((NIL != possibly_naut_p(naut)) && (NIL != funcall($nat_matching_predicate$.getDynamicValue(thread), naut, nart_hl_formula))) {
                                                    final SubLObject nart = assertions_high.gaf_arg1(tou_assertion);
                                                    if (NIL == nart_handles.valid_nartP(nart, UNPROVIDED)) {
                                                        return tms.tms_remove_assertion(tou_assertion);
                                                    }
                                                }
                                            }
                                            done_var_$19 = makeBoolean((NIL == valid_$21) || (NIL != ans));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values4 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values4);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != ans));
                            } 
                        }


            } else
                if (pcase_var.eql($FUNCTION_EXTENT)) {
                    if (NIL != kb_mapping_macros.do_function_extent_index_key_validator(kb_mapping_macros.do_nli_vfe_extract_key(l_index))) {
                        final SubLObject final_index_spec2 = kb_mapping_macros.function_extent_final_index_spec(kb_mapping_macros.do_nli_vfe_extract_key(l_index));
                        SubLObject final_index_iterator2 = NIL;
                        try {
                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
                            SubLObject done_var2 = ans;
                            final SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                final SubLObject tou_assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var2);
                                final SubLObject valid2 = makeBoolean(!token_var2.eql(tou_assertion2));
                                if ((NIL != valid2) && (NIL != assertion_handles.valid_assertionP(tou_assertion2, UNPROVIDED))) {
                                    final SubLObject naut2 = assertions_high.gaf_arg2(tou_assertion2);
                                    if ((NIL != possibly_naut_p(naut2)) && (NIL != funcall($nat_matching_predicate$.getDynamicValue(thread), naut2, nart_hl_formula))) {
                                        final SubLObject nart2 = assertions_high.gaf_arg1(tou_assertion2);
                                        if (NIL == nart_handles.valid_nartP(nart2, UNPROVIDED)) {
                                            return tms.tms_remove_assertion(tou_assertion2);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean((NIL == valid2) || (NIL != ans));
                            } 
                        } finally {
                            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values5 = getValuesAsVector();
                                if (NIL != final_index_iterator2) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                }
                                restoreValuesFromVector(_values5);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                            }
                        }
                    }
                } else
                    if (pcase_var.eql($OVERLAP)) {
                        SubLObject rest;
                        SubLObject tou_assertion3;
                        SubLObject naut3;
                        SubLObject nart3;
                        for (rest = NIL, rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_nli_vo_extract_key(l_index), UNPROVIDED); (NIL == ans) && (NIL != rest); rest = rest.rest()) {
                            tou_assertion3 = rest.first();
                            if (NIL != assertion_handles.valid_assertionP(tou_assertion3, UNPROVIDED)) {
                                naut3 = assertions_high.gaf_arg2(tou_assertion3);
                                if ((NIL != possibly_naut_p(naut3)) && (NIL != funcall($nat_matching_predicate$.getDynamicValue(thread), naut3, nart_hl_formula))) {
                                    nart3 = assertions_high.gaf_arg1(tou_assertion3);
                                    if (NIL == nart_handles.valid_nartP(nart3, UNPROVIDED)) {
                                        return tms.tms_remove_assertion(tou_assertion3);
                                    }
                                }
                            }
                        }
                    } else {
                        kb_mapping_macros.do_nli_method_error(l_index, method);
                    }


            return ans;
        }
        return NIL;
    }

    public static SubLObject narts_around_nart(final SubLObject nart, SubLObject total, SubLObject before, SubLObject after) {
        if (total == UNPROVIDED) {
            total = $int$100;
        }
        if (before == UNPROVIDED) {
            before = ZERO_INTEGER;
        }
        if (after == UNPROVIDED) {
            after = subtract(total, before);
        }
        assert NIL != nart_handles.nart_p(nart) : "nart_handles.nart_p(nart) " + "CommonSymbols.NIL != nart_handles.nart_p(nart) " + nart;
        return narts_around(nart_handles.nart_id(nart), total, before, after);
    }

    public static SubLObject narts_around(final SubLObject nart_id, SubLObject total, SubLObject before, SubLObject after) {
        if (total == UNPROVIDED) {
            total = $int$100;
        }
        if (before == UNPROVIDED) {
            before = ZERO_INTEGER;
        }
        if (after == UNPROVIDED) {
            after = subtract(total, before);
        }
        assert NIL != subl_promotions.non_negative_integer_p(nart_id) : "subl_promotions.non_negative_integer_p(nart_id) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(nart_id) " + nart_id;
        return assertions_high.kb_objects_around_id(FIND_NART_BY_ID, ZERO_INTEGER, nart_id, nart_handles.next_nart_id(), total, before, after);
    }

    public static SubLObject declare_narts_high_file() {
        declareMacro(me, "do_recent_narts", "DO-RECENT-NARTS");
        declareFunction(me, "nart_hl_formula", "NART-HL-FORMULA", 1, 0, false);
        new narts_high.$nart_hl_formula$UnaryFunction();
        declareFunction(me, "nart_lookup", "NART-LOOKUP", 1, 0, false);
        declareFunction(me, "naut_p", "NAUT-P", 1, 0, false);
        declareFunction(me, "invalid_nartP", "INVALID-NART?", 1, 1, false);
        declareFunction(me, "invalid_nart_robustP", "INVALID-NART-ROBUST?", 1, 0, false);
        declareFunction(me, "nart_el_formula", "NART-EL-FORMULA", 1, 0, false);
        declareFunction(me, "find_nart", "FIND-NART", 1, 0, false);
        new narts_high.$find_nart$UnaryFunction();
        declareFunction(me, "random_nart", "RANDOM-NART", 0, 1, false);
        declareFunction(me, "sample_narts", "SAMPLE-NARTS", 0, 3, false);
        declareFunction(me, "hl_find_or_create_nart", "HL-FIND-OR-CREATE-NART", 1, 0, false);
        declareFunction(me, "tl_find_or_create_nart", "TL-FIND-OR-CREATE-NART", 1, 0, false);
        declareFunction(me, "find_or_create_nart", "FIND-OR-CREATE-NART", 1, 0, false);
        declareFunction(me, "remove_dependent_narts", "REMOVE-DEPENDENT-NARTS", 1, 0, false);
        declareFunction(me, "remove_nart", "REMOVE-NART", 1, 0, false);
        declareFunction(me, "nart_expand", "NART-EXPAND", 1, 0, false);
        declareFunction(me, "nart_substitute", "NART-SUBSTITUTE", 1, 0, false);
        declareFunction(me, "nart_substitute_recursive", "NART-SUBSTITUTE-RECURSIVE", 1, 0, false);
        declareFunction(me, "contains_nat_formula_as_elementP", "CONTAINS-NAT-FORMULA-AS-ELEMENT?", 1, 0, false);
        declareFunction(me, "nart_with_functor_p", "NART-WITH-FUNCTOR-P", 2, 0, false);
        declareFunction(me, "nart_checkpoint_p", "NART-CHECKPOINT-P", 1, 0, false);
        declareFunction(me, "new_nart_checkpoint", "NEW-NART-CHECKPOINT", 0, 0, false);
        declareFunction(me, "nart_checkpoint_currentP", "NART-CHECKPOINT-CURRENT?", 1, 0, false);
        declareFunction(me, "nart_dump_id", "NART-DUMP-ID", 1, 0, false);
        declareFunction(me, "find_nart_by_dump_id", "FIND-NART-BY-DUMP-ID", 1, 0, false);
        declareMacro(me, "with_nart_dump_id_table", "WITH-NART-DUMP-ID-TABLE");
        declareFunction(me, "useful_nartP", "USEFUL-NART?", 1, 0, false);
        declareFunction(me, "useless_nartP", "USELESS-NART?", 1, 0, false);
        declareFunction(me, "nart_specified_to_be_retainedP", "NART-SPECIFIED-TO-BE-RETAINED?", 1, 0, false);
        declareFunction(me, "skolemize_forward_nartP", "SKOLEMIZE-FORWARD-NART?", 1, 0, false);
        declareFunction(me, "appears_in_forward_reification_ruleP", "APPEARS-IN-FORWARD-REIFICATION-RULE?", 1, 0, false);
        declareFunction(me, "nart_dependent_assertions", "NART-DEPENDENT-ASSERTIONS", 1, 0, false);
        declareFunction(me, "nart_independent_assertions", "NART-INDEPENDENT-ASSERTIONS", 1, 0, false);
        declareFunction(me, "nart_independent_assertions_internal", "NART-INDEPENDENT-ASSERTIONS-INTERNAL", 1, 0, false);
        declareFunction(me, "nart_id_from_recipe", "NART-ID-FROM-RECIPE", 1, 0, false);
        declareFunction(me, "nart_knows_its_hl_formulaP", "NART-KNOWS-ITS-HL-FORMULA?", 1, 0, false);
        declareFunction(me, "all_narts_know_their_hl_formulasP", "ALL-NARTS-KNOW-THEIR-HL-FORMULAS?", 0, 0, false);
        declareFunction(me, "narts_that_dont_know_their_hl_formulas", "NARTS-THAT-DONT-KNOW-THEIR-HL-FORMULAS", 0, 0, false);
        declareFunction(me, "nart_findable_by_hl_formulaP", "NART-FINDABLE-BY-HL-FORMULA?", 1, 0, false);
        declareFunction(me, "cleanup_invalid_nart", "CLEANUP-INVALID-NART", 1, 0, false);
        declareFunction(me, "narts_around_nart", "NARTS-AROUND-NART", 1, 3, false);
        declareFunction(me, "narts_around", "NARTS-AROUND", 1, 3, false);
        return NIL;
    }

    public static SubLObject init_narts_high_file() {
        defparameter("*NART-DUMP-ID-TABLE*", NIL);
        return NIL;
    }

    public static SubLObject setup_narts_high_file() {
        register_cyc_api_function(NART_HL_FORMULA, $list15, $str16$Return_the_hl_formula_of_this_NAR, $list17, $list18);
        register_cyc_api_function(NAUT_P, $list20, $str21$Return_T_iff_OBJECT_is_a_datastru, NIL, $list22);
        register_cyc_api_function(NART_EL_FORMULA, $list15, $str24$Return_the_el_formula_of_this_NAR, $list17, $list18);
        register_cyc_api_function(RANDOM_NART, $list28, $str29$Return_a_randomly_chosen_NART_tha, NIL, $list30);
        define_obsolete_register(HL_FIND_OR_CREATE_NART, $list34);
        define_obsolete_register(FIND_OR_CREATE_NART, $list36);
        register_cyc_api_function(REMOVE_NART, $list15, $str40$Remove_NART_from_the_KB_, $list17, $list41);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_narts_high_file();
    }

    @Override
    public void initializeVariables() {
        init_narts_high_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_narts_high_file();
    }

    static {































































    }

    public static final class $nart_hl_formula$UnaryFunction extends UnaryFunction {
        public $nart_hl_formula$UnaryFunction() {
            super(extractFunctionNamed("NART-HL-FORMULA"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return nart_hl_formula(arg1);
        }
    }

    public static final class $find_nart$UnaryFunction extends UnaryFunction {
        public $find_nart$UnaryFunction() {
            super(extractFunctionNamed("FIND-NART"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return find_nart(arg1);
        }
    }
}

/**
 * Total time: 598 ms
 */
