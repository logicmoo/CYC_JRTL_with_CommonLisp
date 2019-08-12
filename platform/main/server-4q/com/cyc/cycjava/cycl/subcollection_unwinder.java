package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.harness.conjunctive_strategist;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class subcollection_unwinder extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new subcollection_unwinder();

    public static final String myName = "com.cyc.cycjava_2.cycl.subcollection_unwinder";


    // defparameter
    private static final SubLSymbol $subcol_unwind_existential_variables$ = makeSymbol("*SUBCOL-UNWIND-EXISTENTIAL-VARIABLES*");



    // defparameter
    private static final SubLSymbol $isa_subcol_unwind_patterns_complex$ = makeSymbol("*ISA-SUBCOL-UNWIND-PATTERNS-COMPLEX*");



    // defparameter
    private static final SubLSymbol $existential_unwind_patterns$ = makeSymbol("*EXISTENTIAL-UNWIND-PATTERNS*");





    private static final SubLList $list2 = list(EQL, makeSymbol("*SUBCOL-UNWIND-EXISTENTIAL-VARIABLES*"), makeKeyword("UNINITIALIZED"));



    private static final SubLList $list4 = list(list(makeSymbol("*SUBCOL-UNWIND-EXISTENTIAL-VARIABLES*"), NIL));



    private static final SubLSymbol $sym6$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol SUBCOL_UNWIND_LITERAL_INT = makeSymbol("SUBCOL-UNWIND-LITERAL-INT");

    private static final SubLSymbol $EXISTS = makeKeyword("EXISTS");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$equals = reader_make_constant_shell(makeString("equals"));

    private static final SubLObject $$equalSymbols = reader_make_constant_shell(makeString("equalSymbols"));

    private static final SubLObject $$Kappa = reader_make_constant_shell(makeString("Kappa"));

    private static final SubLObject $$TheSetOf = reader_make_constant_shell(makeString("TheSetOf"));

    private static final SubLSymbol DMR_SUBCOL_EXPAND_SIGNATURE = makeSymbol("DMR-SUBCOL-EXPAND-SIGNATURE");

    private static final SubLList $list15 = list(makeSymbol("SCG-SUBCOL-EXPAND-SIGNATURE"));



    private static final SubLObject $const17$subcollectionFunctionClassificati = reader_make_constant_shell(makeString("subcollectionFunctionClassificationPredicate"));

    private static final SubLSymbol $sym18$EL_VAR_ = makeSymbol("EL-VAR?");

    private static final SubLSymbol EL_VAR_TO_KEYWORD = makeSymbol("EL-VAR-TO-KEYWORD");

    private static final SubLList $list20 = list(cons($TERM, makeKeyword("OBJ")));

    private static final SubLSymbol $isa_subcol_unwind_patterns$ = makeSymbol("*ISA-SUBCOL-UNWIND-PATTERNS*");

    private static final SubLSymbol IS_SUBCOLLECTION_PATTERN_PREDICATE_ASSERTION = makeSymbol("IS-SUBCOLLECTION-PATTERN-PREDICATE-ASSERTION");



    private static final SubLObject $list24 = _constant_24_initializer();

    private static final SubLSymbol $isa_subcol_unwind_template_map$ = makeSymbol("*ISA-SUBCOL-UNWIND-TEMPLATE-MAP*");

    private static final SubLList $list26 = list(makeSymbol("MATCH-PATTERN"), makeSymbol("SUBSTITUTE-PATTERN"));

    private static final SubLSymbol META_VARIABLE_P = makeSymbol("META-VARIABLE-P");

    private static final SubLList $list28 = list(makeKeyword("AND"), makeKeyword("OR"), makeKeyword("NOT"), $BIND);









    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLObject $$CollectionIntersection2Fn = reader_make_constant_shell(makeString("CollectionIntersection2Fn"));

    private static final SubLList $list35 = listS(makeSymbol("FIRST"), makeSymbol("SECOND"), makeSymbol("THIRD"), makeSymbol("REST"));

    private static final SubLList $list36 = list(reader_make_constant_shell(makeString("Set-Mathematical")));

    private static final SubLObject $$elementOf = reader_make_constant_shell(makeString("elementOf"));

    private static final SubLList $list38 = list(list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("relationInstanceExists")), list($BIND, makeSymbol("PRED")), list($BIND, makeSymbol("OBJ")), list($BIND, makeSymbol("TYPE"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), list(makeKeyword("VALUE"), makeKeyword("EXISTS")), list(makeKeyword("VALUE"), makeSymbol("TYPE"))), list(list(makeKeyword("VALUE"), makeSymbol("PRED")), list(makeKeyword("VALUE"), makeSymbol("OBJ")), list(makeKeyword("VALUE"), makeKeyword("EXISTS"))))), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("relationExistsInstance")), list($BIND, makeSymbol("PRED")), list($BIND, makeSymbol("TYPE")), list($BIND, makeSymbol("OBJ"))), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), list(makeKeyword("VALUE"), makeKeyword("EXISTS")), list(makeKeyword("VALUE"), makeSymbol("TYPE"))), list(list(makeKeyword("VALUE"), makeSymbol("PRED")), list(makeKeyword("VALUE"), makeKeyword("EXISTS")), list(makeKeyword("VALUE"), makeSymbol("OBJ"))))), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("thereExists")), list($BIND, makeSymbol("VAR")), list($BIND, makeSymbol("BODY"))), list($CALL, makeSymbol("SUBCOL-SUBSTITUTE-PATTERN-EXISTENTIAL"), list(makeKeyword("VALUE"), makeSymbol("VAR")), list(makeKeyword("VALUE"), makeKeyword("EXISTS")), list(makeKeyword("VALUE"), makeSymbol("BODY")))));

    private static final SubLList $list39 = list(reader_make_constant_shell(makeString("relationInstanceExists")), reader_make_constant_shell(makeString("relationExistsInstance")), reader_make_constant_shell(makeString("thereExists")));

    private static final SubLSymbol CAADR = makeSymbol("CAADR");

    private static final SubLList $list41 = list(new SubLObject[]{ makeSymbol("?X"), makeSymbol("?Y"), makeSymbol("?Z-0"), makeSymbol("?Z-1"), makeSymbol("?Z-2"), makeSymbol("?Z-3"), makeSymbol("?Z-4"), makeSymbol("?Z-5"), makeSymbol("?Z-6"), makeSymbol("?Z-7"), makeSymbol("?Z-8"), makeSymbol("?Z-9") });

    public static SubLObject with_existential_variable_tracking(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(PIF, $list2, listS(CLET, $list4, append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
    }

    public static SubLObject subcol_unwind_literal(final SubLObject literal) {
        return subcol_unwind_literals(list(literal));
    }

    public static SubLObject subcol_unwind_literals(final SubLObject literals) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($subcol_unwind_existential_variables$.getDynamicValue(thread).eql($UNINITIALIZED)) {
            final SubLObject _prev_bind_0 = $subcol_unwind_existential_variables$.currentBinding(thread);
            try {
                $subcol_unwind_existential_variables$.bind(NIL, thread);
                SubLObject unwound_literals = NIL;
                SubLObject v_variables = NIL;
                unwound_literals = subcol_unwind_literals_int(literals);
                v_variables = reverse($subcol_unwind_existential_variables$.getDynamicValue(thread));
                unwound_literals = delete_duplicates(unwound_literals, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                unwound_literals = kb_utilities.sort_terms(unwound_literals, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return values(unwound_literals, v_variables);
            } finally {
                $subcol_unwind_existential_variables$.rebind(_prev_bind_0, thread);
            }
        }
        SubLObject unwound_literals2 = NIL;
        SubLObject v_variables2 = NIL;
        unwound_literals2 = subcol_unwind_literals_int(literals);
        v_variables2 = reverse($subcol_unwind_existential_variables$.getDynamicValue(thread));
        unwound_literals2 = delete_duplicates(unwound_literals2, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        unwound_literals2 = kb_utilities.sort_terms(unwound_literals2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return values(unwound_literals2, v_variables2);
    }

    public static SubLObject subcol_unwind_literals_int(final SubLObject literals) {
        SubLObject unwindings;
        for (unwindings = list(Mapping.mapcar(symbol_function(SUBCOL_UNWIND_LITERAL_INT), literals)); ONE_INTEGER.numE(length(unwindings)); unwindings = unwindings.first()) {
        }
        return unwindings;
    }

    public static SubLObject subcol_unwind_literal_int(final SubLObject literal) {
        SubLObject result = literal;
        if (NIL != isa_naut_literalP(literal)) {
            final SubLObject operator = cycl_utilities.formula_operator(cycl_utilities.formula_arg2(literal, UNPROVIDED));
            final SubLObject template = subcol_unwind_template_lookup(operator);
            if (NIL != template) {
                final SubLObject unwindings = formula_pattern_match.pattern_transform_formula(template, literal, UNPROVIDED);
                result = subcol_unwind_literals_int(unwindings);
            }
        } else
            if (NIL != existential_introduction_literalP(literal)) {
                final SubLObject operator = cycl_utilities.formula_operator(literal);
                final SubLObject template = subcol_existential_unwind_template_lookup(operator);
                if (NIL != template) {
                    final SubLObject variable = subcol_unwind_allocate_existential_variable();
                    final SubLObject v_bindings = list(bq_cons($EXISTS, variable));
                    final SubLObject unwindings2 = formula_pattern_match.pattern_transform_formula(template, literal, v_bindings);
                    result = subcol_unwind_literals_int(unwindings2);
                }
            } else
                if (NIL != kappa_asent_p(literal)) {
                    final SubLObject kappa_predicate = cycl_utilities.formula_operator(literal);
                    final SubLObject kappa_predicate_vars = kappa_predicate_formal_args(kappa_predicate);
                    final SubLObject kappa_asent_args = cycl_utilities.formula_args(literal, UNPROVIDED);
                    SubLObject var_subs = NIL;
                    SubLObject cdolist_list_var = kappa_predicate_vars;
                    SubLObject kappa_var = NIL;
                    kappa_var = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        var_subs = cons(bq_cons(kappa_var, cycl_variables.make_el_var(gensym(UNPROVIDED))), var_subs);
                        cdolist_list_var = cdolist_list_var.rest();
                        kappa_var = cdolist_list_var.first();
                    } 
                    result = bq_cons(sublis(var_subs, kappa_predicate, UNPROVIDED, UNPROVIDED), append(kappa_asent_args, NIL));
                }


        return result;
    }

    public static SubLObject isa_naut_literalP(final SubLObject v_object) {
        return binary_pred_arg2_naut_literalP(v_object, $$isa);
    }

    public static SubLObject equals_naut_literalP(final SubLObject v_object) {
        return binary_pred_arg2_naut_literalP(v_object, $$equals);
    }

    public static SubLObject equal_symbols_naut_literalP(final SubLObject v_object) {
        return binary_pred_arg2_naut_literalP(v_object, $$equalSymbols);
    }

    public static SubLObject binary_pred_arg2_naut_literalP(final SubLObject v_object, final SubLObject pred) {
        return makeBoolean(((NIL != el_formula_with_operator_p(v_object, pred)) && (NIL != el_binary_formula_p(v_object))) && (NIL != possibly_naut_p(cycl_utilities.el_formula_arg2(v_object, UNPROVIDED))));
    }

    public static SubLObject subcollection_kappa_expansion(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != constrained_parsing.subcollection_naut_p(sentence)) {
            if ($subcol_unwind_existential_variables$.getDynamicValue(thread).eql($UNINITIALIZED)) {
                final SubLObject _prev_bind_0 = $subcol_unwind_existential_variables$.currentBinding(thread);
                try {
                    $subcol_unwind_existential_variables$.bind(NIL, thread);
                    thread.resetMultipleValues();
                    final SubLObject unwound_sentence = scg_subcl_expand_signature_int(sentence);
                    final SubLObject v_variables = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject variable = subcol_unwind_allocate_existential_variable();
                    final SubLObject existentially_wrapped_sentence = conjunctive_strategist.el_wrap_existentials(v_variables, unwound_sentence);
                    return make_binary_formula($$Kappa, list(variable), existentially_wrapped_sentence);
                } finally {
                    $subcol_unwind_existential_variables$.rebind(_prev_bind_0, thread);
                }
            }
            thread.resetMultipleValues();
            final SubLObject unwound_sentence2 = scg_subcl_expand_signature_int(sentence);
            final SubLObject v_variables2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject variable2 = subcol_unwind_allocate_existential_variable();
            final SubLObject existentially_wrapped_sentence2 = conjunctive_strategist.el_wrap_existentials(v_variables2, unwound_sentence2);
            return make_binary_formula($$Kappa, list(variable2), existentially_wrapped_sentence2);
        }
        return sentence;
    }

    public static SubLObject subcollection_the_set_of_expansion(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != constrained_parsing.subcollection_naut_p(sentence)) {
            if ($subcol_unwind_existential_variables$.getDynamicValue(thread).eql($UNINITIALIZED)) {
                final SubLObject _prev_bind_0 = $subcol_unwind_existential_variables$.currentBinding(thread);
                try {
                    $subcol_unwind_existential_variables$.bind(NIL, thread);
                    thread.resetMultipleValues();
                    final SubLObject unwound_sentence = scg_subcl_expand_signature_int(sentence);
                    final SubLObject v_variables = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject variable = subcol_unwind_allocate_existential_variable();
                    final SubLObject existentially_wrapped_sentence = conjunctive_strategist.el_wrap_existentials(v_variables, unwound_sentence);
                    return make_binary_formula($$TheSetOf, variable, existentially_wrapped_sentence);
                } finally {
                    $subcol_unwind_existential_variables$.rebind(_prev_bind_0, thread);
                }
            }
            thread.resetMultipleValues();
            final SubLObject unwound_sentence2 = scg_subcl_expand_signature_int(sentence);
            final SubLObject v_variables2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject variable2 = subcol_unwind_allocate_existential_variable();
            final SubLObject existentially_wrapped_sentence2 = conjunctive_strategist.el_wrap_existentials(v_variables2, unwound_sentence2);
            return make_binary_formula($$TheSetOf, variable2, existentially_wrapped_sentence2);
        }
        return sentence;
    }

    public static SubLObject scg_subcol_expand_to_existential_sentence(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($subcol_unwind_existential_variables$.getDynamicValue(thread).eql($UNINITIALIZED)) {
            final SubLObject _prev_bind_0 = $subcol_unwind_existential_variables$.currentBinding(thread);
            try {
                $subcol_unwind_existential_variables$.bind(NIL, thread);
                thread.resetMultipleValues();
                final SubLObject unwound_sentence = scg_subcol_expand_signature(sentence);
                final SubLObject v_variables = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return conjunctive_strategist.el_wrap_existentials(kb_utilities.sort_terms(v_variables, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), unwound_sentence);
            } finally {
                $subcol_unwind_existential_variables$.rebind(_prev_bind_0, thread);
            }
        }
        thread.resetMultipleValues();
        final SubLObject unwound_sentence2 = scg_subcol_expand_signature(sentence);
        final SubLObject v_variables2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return conjunctive_strategist.el_wrap_existentials(kb_utilities.sort_terms(v_variables2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), unwound_sentence2);
    }

    public static SubLObject scg_subcol_expand_signature(final SubLObject sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($subcol_unwind_existential_variables$.getDynamicValue(thread).eql($UNINITIALIZED)) {
            final SubLObject _prev_bind_0 = $subcol_unwind_existential_variables$.currentBinding(thread);
            try {
                $subcol_unwind_existential_variables$.bind(NIL, thread);
                if ((NIL != equals_naut_literalP(sentence)) || (NIL != equal_symbols_naut_literalP(sentence))) {
                    return scg_subcl_expand_signature_int(cycl_utilities.formula_arg2(sentence, UNPROVIDED));
                }
                if (NIL != isa_naut_literalP(sentence)) {
                    return scg_subcl_expand_signature_int(cycl_utilities.formula_arg2(sentence, UNPROVIDED));
                }
                if (NIL != el_conjunction_p(sentence)) {
                    final SubLObject conjuncts = sentence.rest();
                    SubLObject unwound_literals = NIL;
                    SubLObject v_variables = NIL;
                    SubLObject cdolist_list_var = conjuncts;
                    SubLObject conjunct = NIL;
                    conjunct = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        thread.resetMultipleValues();
                        final SubLObject unwound_sentence = scg_subcol_expand_signature(conjunct);
                        final SubLObject conjunct_variables = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        unwound_literals = append(unwound_literals, list(unwound_sentence));
                        v_variables = union(v_variables, conjunct_variables, symbol_function(EQUAL), UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        conjunct = cdolist_list_var.first();
                    } 
                    return subl_promotions.values2(simplifier.simplify_cycl_sentence_syntax(make_conjunction(unwound_literals), UNPROVIDED), v_variables);
                }
            } finally {
                $subcol_unwind_existential_variables$.rebind(_prev_bind_0, thread);
            }
        } else {
            if ((NIL != equals_naut_literalP(sentence)) || (NIL != equal_symbols_naut_literalP(sentence))) {
                return scg_subcl_expand_signature_int(cycl_utilities.formula_arg2(sentence, UNPROVIDED));
            }
            if (NIL != isa_naut_literalP(sentence)) {
                return scg_subcl_expand_signature_int(cycl_utilities.formula_arg2(sentence, UNPROVIDED));
            }
            if (NIL != el_conjunction_p(sentence)) {
                final SubLObject conjuncts2 = sentence.rest();
                SubLObject unwound_literals2 = NIL;
                SubLObject v_variables2 = NIL;
                SubLObject cdolist_list_var2 = conjuncts2;
                SubLObject conjunct2 = NIL;
                conjunct2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    thread.resetMultipleValues();
                    final SubLObject unwound_sentence2 = scg_subcol_expand_signature(conjunct2);
                    final SubLObject conjunct_variables2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    unwound_literals2 = append(unwound_literals2, list(unwound_sentence2));
                    v_variables2 = union(v_variables2, conjunct_variables2, symbol_function(EQUAL), UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    conjunct2 = cdolist_list_var2.first();
                } 
                return subl_promotions.values2(simplifier.simplify_cycl_sentence_syntax(make_conjunction(unwound_literals2), UNPROVIDED), v_variables2);
            }
        }
        return subl_promotions.values2(sentence, NIL);
    }

    public static SubLObject scg_subcl_expand_signature_int(final SubLObject subcol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($subcol_unwind_existential_variables$.getDynamicValue(thread).eql($UNINITIALIZED)) {
            final SubLObject _prev_bind_0 = $subcol_unwind_existential_variables$.currentBinding(thread);
            try {
                $subcol_unwind_existential_variables$.bind(NIL, thread);
                if (NIL == subcol_unwind_template_lookup(cycl_utilities.formula_arg0(subcol))) {
                    return subl_promotions.values2(simplifier.simplify_cycl_sentence_syntax(subcol, UNPROVIDED), NIL);
                }
                final SubLObject variable = subcol_unwind_allocate_existential_variable();
                final SubLObject literal = make_binary_formula($$isa, variable, subcol);
                thread.resetMultipleValues();
                final SubLObject unwound_literal = subcol_unwind_literal(literal);
                final SubLObject v_variables = thread.secondMultipleValue();
                thread.resetMultipleValues();
                return subl_promotions.values2(simplifier.simplify_cycl_sentence_syntax(unwound_literal, UNPROVIDED), v_variables);
            } finally {
                $subcol_unwind_existential_variables$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL == subcol_unwind_template_lookup(cycl_utilities.formula_arg0(subcol))) {
            return subl_promotions.values2(simplifier.simplify_cycl_sentence_syntax(subcol, UNPROVIDED), NIL);
        }
        final SubLObject variable2 = subcol_unwind_allocate_existential_variable();
        final SubLObject literal2 = make_binary_formula($$isa, variable2, subcol);
        thread.resetMultipleValues();
        final SubLObject unwound_literal2 = subcol_unwind_literal(literal2);
        final SubLObject v_variables2 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return subl_promotions.values2(simplifier.simplify_cycl_sentence_syntax(unwound_literal2, UNPROVIDED), v_variables2);
    }

    public static SubLObject dmr_subcol_expand_signature(final SubLObject sentence) {
        return scg_subcol_expand_signature(sentence);
    }

    public static SubLObject scg_sentence_fully_unwoundP(final SubLObject scg_sentence) {
        final SubLObject match_patterns = Mapping.mapcar(symbol_function(CAAR), $isa_subcol_unwind_patterns$.getGlobalValue());
        final SubLObject flat_scg_sent = list_utilities.flatten(scg_sentence);
        final SubLObject unwound_terms = intersection(match_patterns, flat_scg_sent, UNPROVIDED, UNPROVIDED);
        if (NIL != unwound_terms) {
            return values(NIL, unwound_terms);
        }
        return values(T, NIL);
    }

    public static SubLObject is_subcollection_pattern_predicate_assertion(final SubLObject arg0) {
        return eql(arg0, $const17$subcollectionFunctionClassificati);
    }

    public static SubLObject create_subcollection_unwind_template(final SubLObject subcollection_assertion) {
        final SubLObject subcollection_operator = cycl_utilities.formula_arg1(subcollection_assertion, UNPROVIDED);
        final SubLObject subcollection_kappa = cycl_utilities.formula_arg2(subcollection_assertion, UNPROVIDED);
        final SubLObject var_list = cycl_utilities.formula_arg1(subcollection_kappa, UNPROVIDED);
        final SubLObject body = cycl_utilities.formula_arg2(subcollection_kappa, UNPROVIDED);
        final SubLObject unwind_pattern_el = list(adjoin(subcollection_operator, var_list.rest(), UNPROVIDED, UNPROVIDED), body);
        SubLObject unwind_pattern = cycl_utilities.formula_transform(unwind_pattern_el, $sym18$EL_VAR_, EL_VAR_TO_KEYWORD, UNPROVIDED, UNPROVIDED);
        unwind_pattern = nsublis($list20, unwind_pattern, UNPROVIDED, UNPROVIDED);
        return unwind_pattern;
    }

    public static SubLObject get_subcollection_patterns_from_kb() {
        if (NIL == $isa_subcol_unwind_patterns$.getGlobalValue()) {
            final SubLObject all_assertions = kb_accessors.all_term_assertions($const17$subcollectionFunctionClassificati, UNPROVIDED);
            SubLObject cdolist_list_var;
            final SubLObject subcollection_assertions = cdolist_list_var = list_utilities.remove_if_not(symbol_function(IS_SUBCOLLECTION_PATTERN_PREDICATE_ASSERTION), all_assertions, symbol_function(FORMULA_ARG0), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject subcol_assert = NIL;
            subcol_assert = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                $isa_subcol_unwind_patterns$.setGlobalValue(cons(create_subcollection_unwind_template(subcol_assert), $isa_subcol_unwind_patterns$.getGlobalValue()));
                cdolist_list_var = cdolist_list_var.rest();
                subcol_assert = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    public static SubLObject subcol_unwind_template_lookup(final SubLObject operator) {
        get_subcollection_patterns_from_kb();
        possibly_initialize_isa_subcol_unwind_template_map();
        return gethash_without_values(operator, $isa_subcol_unwind_template_map$.getGlobalValue(), NIL);
    }

    public static SubLObject possibly_initialize_isa_subcol_unwind_template_map() {
        if (NIL == $isa_subcol_unwind_template_map$.getGlobalValue()) {
            $isa_subcol_unwind_template_map$.setGlobalValue(make_hash_table(length($isa_subcol_unwind_patterns$.getGlobalValue()), symbol_function(EQL), UNPROVIDED));
            return rebuild_isa_subcol_unwind_template_map();
        }
        return NIL;
    }

    public static SubLObject rebuild_isa_subcol_unwind_template_map() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clrhash($isa_subcol_unwind_template_map$.getGlobalValue());
        SubLObject cdolist_list_var = append($isa_subcol_unwind_patterns$.getGlobalValue(), $isa_subcol_unwind_patterns_complex$.getDynamicValue(thread));
        SubLObject one_pattern = NIL;
        one_pattern = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = one_pattern;
            SubLObject match_pattern = NIL;
            SubLObject substitute_pattern = NIL;
            destructuring_bind_must_consp(current, datum, $list26);
            match_pattern = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list26);
            substitute_pattern = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject operator = cycl_utilities.formula_operator(match_pattern);
                final SubLObject template = compute_isa_subcol_unwind_template(match_pattern, substitute_pattern);
                sethash(operator, $isa_subcol_unwind_template_map$.getGlobalValue(), template);
            } else {
                cdestructuring_bind_error(datum, $list26);
            }
            cdolist_list_var = cdolist_list_var.rest();
            one_pattern = cdolist_list_var.first();
        } 
        return hash_table_size($isa_subcol_unwind_template_map$.getGlobalValue());
    }

    public static SubLObject compute_isa_subcol_unwind_template(SubLObject match_pattern, SubLObject substitute_pattern) {
        SubLObject meta_variables = cycl_utilities.expression_gather(match_pattern, symbol_function(META_VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject bind_mapping = NIL;
        SubLObject value_mapping = NIL;
        meta_variables = nset_difference(meta_variables, $list28, UNPROVIDED, UNPROVIDED);
        final SubLObject item_var = $OBJ;
        if (NIL == member(item_var, meta_variables, symbol_function(EQL), symbol_function(IDENTITY))) {
            meta_variables = cons(item_var, meta_variables);
        }
        SubLObject cdolist_list_var = meta_variables;
        SubLObject meta_variable = NIL;
        meta_variable = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pattern_symbol = intern(symbol_name(meta_variable), $cyc_package$.getGlobalValue());
            bind_mapping = cons(cons(meta_variable, list($BIND, pattern_symbol)), bind_mapping);
            value_mapping = cons(cons(meta_variable, list($VALUE, pattern_symbol)), value_mapping);
            cdolist_list_var = cdolist_list_var.rest();
            meta_variable = cdolist_list_var.first();
        } 
        match_pattern = list($$isa, $OBJ, match_pattern);
        match_pattern = sublis(bind_mapping, match_pattern, UNPROVIDED, UNPROVIDED);
        substitute_pattern = sublis(value_mapping, substitute_pattern, UNPROVIDED, UNPROVIDED);
        final SubLObject template = list($TEMPLATE, match_pattern, substitute_pattern);
        return template;
    }

    public static SubLObject subcol_unwind_collection_intersection_set(final SubLObject el_set) {
        final SubLObject elements = extensional_set_elements(el_set);
        return subcol_unwind_collection_intersection_set_recursive(elements);
    }

    public static SubLObject subcol_unwind_collection_intersection_set_recursive(final SubLObject elements) {
        if (NIL == elements) {
            return $$Thing;
        }
        if (NIL != list_utilities.singletonP(elements)) {
            return elements.first();
        }
        if (NIL != list_utilities.doubletonP(elements)) {
            return make_binary_formula($$CollectionIntersection2Fn, elements.first(), second(elements));
        }
        SubLObject first = NIL;
        SubLObject second = NIL;
        SubLObject third = NIL;
        SubLObject rest = NIL;
        destructuring_bind_must_consp(elements, elements, $list35);
        first = elements.first();
        SubLObject current = elements.rest();
        destructuring_bind_must_consp(current, elements, $list35);
        second = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, elements, $list35);
        third = current.first();
        current = rest = current.rest();
        final SubLObject subsolution = subcol_unwind_collection_intersection_set_recursive(listS(second, third, rest));
        return make_binary_formula($$CollectionIntersection2Fn, first, subsolution);
    }

    public static SubLObject subcol_unwind_the_set(final SubLObject elements, final SubLObject predicate, final SubLObject outer_existential) {
        final SubLObject existential = subcol_unwind_allocate_existential_variable();
        SubLObject result = list(listS($$isa, existential, $list36), list(predicate, outer_existential, existential));
        SubLObject cdolist_list_var = elements;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(list($$elementOf, elem, existential), result);
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return make_conjunction(nreverse(result));
    }

    public static SubLObject subcol_substitute_pattern_existential(final SubLObject var, final SubLObject allocated_existential, final SubLObject body) {
        return sublis(list(bq_cons(var, allocated_existential)), body, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject existential_introduction_literalP(final SubLObject v_object) {
        return el_formula_with_any_of_operators_p(v_object, $list39);
    }

    public static SubLObject subcol_existential_unwind_template_lookup(final SubLObject operator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return find(operator, $existential_unwind_patterns$.getDynamicValue(thread), symbol_function(EQL), symbol_function(CAADR), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject subcol_unwind_allocate_existential_variable() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject num_alloc = length($subcol_unwind_existential_variables$.getDynamicValue(thread));
        final SubLObject new_var = nth(num_alloc, $list41);
        $subcol_unwind_existential_variables$.setDynamicValue(cons(new_var, $subcol_unwind_existential_variables$.getDynamicValue(thread)), thread);
        return new_var;
    }

    public static SubLObject declare_subcollection_unwinder_file() {
        declareMacro("with_existential_variable_tracking", "WITH-EXISTENTIAL-VARIABLE-TRACKING");
        declareFunction("subcol_unwind_literal", "SUBCOL-UNWIND-LITERAL", 1, 0, false);
        declareFunction("subcol_unwind_literals", "SUBCOL-UNWIND-LITERALS", 1, 0, false);
        declareFunction("subcol_unwind_literals_int", "SUBCOL-UNWIND-LITERALS-INT", 1, 0, false);
        declareFunction("subcol_unwind_literal_int", "SUBCOL-UNWIND-LITERAL-INT", 1, 0, false);
        declareFunction("isa_naut_literalP", "ISA-NAUT-LITERAL?", 1, 0, false);
        declareFunction("equals_naut_literalP", "EQUALS-NAUT-LITERAL?", 1, 0, false);
        declareFunction("equal_symbols_naut_literalP", "EQUAL-SYMBOLS-NAUT-LITERAL?", 1, 0, false);
        declareFunction("binary_pred_arg2_naut_literalP", "BINARY-PRED-ARG2-NAUT-LITERAL?", 2, 0, false);
        declareFunction("subcollection_kappa_expansion", "SUBCOLLECTION-KAPPA-EXPANSION", 1, 0, false);
        declareFunction("subcollection_the_set_of_expansion", "SUBCOLLECTION-THE-SET-OF-EXPANSION", 1, 0, false);
        declareFunction("scg_subcol_expand_to_existential_sentence", "SCG-SUBCOL-EXPAND-TO-EXISTENTIAL-SENTENCE", 1, 0, false);
        declareFunction("scg_subcol_expand_signature", "SCG-SUBCOL-EXPAND-SIGNATURE", 1, 0, false);
        declareFunction("scg_subcl_expand_signature_int", "SCG-SUBCL-EXPAND-SIGNATURE-INT", 1, 0, false);
        declareFunction("dmr_subcol_expand_signature", "DMR-SUBCOL-EXPAND-SIGNATURE", 1, 0, false);
        declareFunction("scg_sentence_fully_unwoundP", "SCG-SENTENCE-FULLY-UNWOUND?", 1, 0, false);
        declareFunction("is_subcollection_pattern_predicate_assertion", "IS-SUBCOLLECTION-PATTERN-PREDICATE-ASSERTION", 1, 0, false);
        declareFunction("create_subcollection_unwind_template", "CREATE-SUBCOLLECTION-UNWIND-TEMPLATE", 1, 0, false);
        declareFunction("get_subcollection_patterns_from_kb", "GET-SUBCOLLECTION-PATTERNS-FROM-KB", 0, 0, false);
        declareFunction("subcol_unwind_template_lookup", "SUBCOL-UNWIND-TEMPLATE-LOOKUP", 1, 0, false);
        declareFunction("possibly_initialize_isa_subcol_unwind_template_map", "POSSIBLY-INITIALIZE-ISA-SUBCOL-UNWIND-TEMPLATE-MAP", 0, 0, false);
        declareFunction("rebuild_isa_subcol_unwind_template_map", "REBUILD-ISA-SUBCOL-UNWIND-TEMPLATE-MAP", 0, 0, false);
        declareFunction("compute_isa_subcol_unwind_template", "COMPUTE-ISA-SUBCOL-UNWIND-TEMPLATE", 2, 0, false);
        declareFunction("subcol_unwind_collection_intersection_set", "SUBCOL-UNWIND-COLLECTION-INTERSECTION-SET", 1, 0, false);
        declareFunction("subcol_unwind_collection_intersection_set_recursive", "SUBCOL-UNWIND-COLLECTION-INTERSECTION-SET-RECURSIVE", 1, 0, false);
        declareFunction("subcol_unwind_the_set", "SUBCOL-UNWIND-THE-SET", 3, 0, false);
        declareFunction("subcol_substitute_pattern_existential", "SUBCOL-SUBSTITUTE-PATTERN-EXISTENTIAL", 3, 0, false);
        declareFunction("existential_introduction_literalP", "EXISTENTIAL-INTRODUCTION-LITERAL?", 1, 0, false);
        declareFunction("subcol_existential_unwind_template_lookup", "SUBCOL-EXISTENTIAL-UNWIND-TEMPLATE-LOOKUP", 1, 0, false);
        declareFunction("subcol_unwind_allocate_existential_variable", "SUBCOL-UNWIND-ALLOCATE-EXISTENTIAL-VARIABLE", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_subcollection_unwinder_file() {
        defparameter("*SUBCOL-UNWIND-EXISTENTIAL-VARIABLES*", $UNINITIALIZED);
        deflexical("*ISA-SUBCOL-UNWIND-PATTERNS*", SubLTrampolineFile.maybeDefault($isa_subcol_unwind_patterns$, $isa_subcol_unwind_patterns$, NIL));
        defparameter("*ISA-SUBCOL-UNWIND-PATTERNS-COMPLEX*", $list24);
        deflexical("*ISA-SUBCOL-UNWIND-TEMPLATE-MAP*", SubLTrampolineFile.maybeDefault($isa_subcol_unwind_template_map$, $isa_subcol_unwind_template_map$, NIL));
        defparameter("*EXISTENTIAL-UNWIND-PATTERNS*", $list38);
        return NIL;
    }

    public static SubLObject setup_subcollection_unwinder_file() {
        define_obsolete_register(DMR_SUBCOL_EXPAND_SIGNATURE, $list15);
        declare_defglobal($isa_subcol_unwind_patterns$);
        declare_defglobal($isa_subcol_unwind_template_map$);
        return NIL;
    }

    private static SubLObject _constant_24_initializer() {
        return list(new SubLObject[]{ list(list(reader_make_constant_shell(makeString("CollectionIntersectionFn")), list(makeKeyword("AND"), makeKeyword("SET"), cons(reader_make_constant_shell(makeString("TheSet")), makeKeyword("ANYTHING")))), list(list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), list($CALL, makeSymbol("SUBCOL-UNWIND-COLLECTION-INTERSECTION-SET"), makeKeyword("SET"))))), list(list(reader_make_constant_shell(makeString("SitTypeSpecWithTypeRestrictionOnRolePlayerFn")), makeKeyword("COL"), $ROLE, $TYPE), list(list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), makeKeyword("COL"), $ROLE, $TYPE)))), list(list(reader_make_constant_shell(makeString("GenreFn")), makeKeyword("COL1"), makeKeyword("COL2")), list(list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), list(reader_make_constant_shell(makeString("CollectionIntersection2Fn")), makeKeyword("COL1"), makeKeyword("COL2"))))), list(list(reader_make_constant_shell(makeString("CollectionUnionFn")), makeKeyword("SET")), list(list(reader_make_constant_shell(makeString("thereExists")), makeKeyword("COL"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), makeKeyword("COL")), list(reader_make_constant_shell(makeString("elementOf")), makeKeyword("COL"), makeKeyword("SET")))))), list(list(reader_make_constant_shell(makeString("GroupFn")), makeKeyword("COL")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("Group"))), list(reader_make_constant_shell(makeString("relationInstanceExists")), reader_make_constant_shell(makeString("groupMembers")), makeKeyword("OBJ"), makeKeyword("COL")))), list(list(reader_make_constant_shell(makeString("TransportViaFn")), makeKeyword("COL")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("TransportationEvent"))), list(reader_make_constant_shell(makeString("relationInstanceExists")), reader_make_constant_shell(makeString("transporter")), makeKeyword("OBJ"), makeKeyword("COL")))), list(list(reader_make_constant_shell(makeString("StockInFn")), makeKeyword("CORPORATION")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("Stock"))), list(reader_make_constant_shell(makeString("stockIssuedBy")), makeKeyword("OBJ"), makeKeyword("CORPORATION")))), list(list(reader_make_constant_shell(makeString("WholeTypeForPartTypeFn")), makeKeyword("PART-TYPE"), makeKeyword("WHOLE-TYPE")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), makeKeyword("WHOLE-TYPE")), list(reader_make_constant_shell(makeString("relationExistsInstance")), reader_make_constant_shell(makeString("properPhysicalParts")), makeKeyword("PART-TYPE"), makeKeyword("OBJ")))), list(list(reader_make_constant_shell(makeString("VideoClipOfSubjectFn")), makeKeyword("SUBJECT")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("VideoRecordedObject"))), list(reader_make_constant_shell(makeString("containsInformationAbout")), makeKeyword("OBJ"), makeKeyword("SUBJECT")))), list(list(reader_make_constant_shell(makeString("VideoClipTypeOfSubjectTypeFn")), makeKeyword("SUBJECT-TYPE")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("VideoRecordedObject"))), list(reader_make_constant_shell(makeString("containsInformationAbout")), makeKeyword("OBJ"), makeKeyword("SUBJECT-TYPE")))), list(list(reader_make_constant_shell(makeString("IssuingCredentialTypeFn")), makeKeyword("COL")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("GrantingPermission"))), list(reader_make_constant_shell(makeString("relationInstanceExists")), reader_make_constant_shell(makeString("permissionsGranted")), makeKeyword("OBJ"), makeKeyword("COL")))), list(list(reader_make_constant_shell(makeString("RecreationalFn")), makeKeyword("ACTION-TYPE")), list(list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), list(reader_make_constant_shell(makeString("CollectionIntersection2Fn")), makeKeyword("ACTION-TYPE"), reader_make_constant_shell(makeString("RecreationalActivity")))))), list(list(reader_make_constant_shell(makeString("PlayerOfInstrumentFn")), $TYPE), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("MusicalInstrumentPlayer"))), list(reader_make_constant_shell(makeString("skillCapableOf")), makeKeyword("OBJ"), list(reader_make_constant_shell(makeString("InstrumentPlayingFn")), $TYPE), reader_make_constant_shell(makeString("performedBy"))))), list(list(reader_make_constant_shell(makeString("ModelFn")), makeKeyword("OBJ-TYPE")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("Model-Artifact"))), list(reader_make_constant_shell(makeString("visuallyDepicts-Type")), makeKeyword("OBJ"), makeKeyword("OBJ-TYPE")))), list(list(reader_make_constant_shell(makeString("ProductionOfFn")), $TYPE), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("Production-Generic"))), list(reader_make_constant_shell(makeString("relationInstanceExists")), reader_make_constant_shell(makeString("outputsCreated")), makeKeyword("OBJ"), $TYPE))), list(list(reader_make_constant_shell(makeString("RoleWithResponsibilityForFn")), $TYPE, makeKeyword("ACTIVITY")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), $TYPE), list(reader_make_constant_shell(makeString("relationInstanceExists")), reader_make_constant_shell(makeString("responsibleFor")), makeKeyword("OBJ"), makeKeyword("ACTIVITY")))), list(list(reader_make_constant_shell(makeString("CitizenFn")), makeKeyword("GEOPOLITICAL-ENTITY")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("Person"))), list(reader_make_constant_shell(makeString("citizens")), makeKeyword("GEOPOLITICAL-ENTITY"), makeKeyword("OBJ")))), list(list(reader_make_constant_shell(makeString("ProfessionalFn")), $TYPE), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("PersonWithOccupation"))), list(reader_make_constant_shell(makeString("occupation")), makeKeyword("OBJ"), $TYPE))), list(list(reader_make_constant_shell(makeString("ResidentFn")), makeKeyword("REGION")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("Individual"))), list(reader_make_constant_shell(makeString("residesInRegion")), makeKeyword("OBJ"), makeKeyword("REGION")))), list(list(reader_make_constant_shell(makeString("FrequentPerformerFn")), $TYPE), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("Person"))), list(reader_make_constant_shell(makeString("playsRoleInTypeWithFrequency")), makeKeyword("OBJ"), $TYPE, reader_make_constant_shell(makeString("performedBy")), reader_make_constant_shell(makeString("Often"))))), list(list(reader_make_constant_shell(makeString("UsingAFn")), $TYPE), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("UsingADevice"))), list(reader_make_constant_shell(makeString("relationInstanceExists")), reader_make_constant_shell(makeString("deviceUsed")), makeKeyword("OBJ"), $TYPE))), list(list(reader_make_constant_shell(makeString("BelieverFn")), makeKeyword("BELIEF-SYSTEM")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("IntelligentAgent"))), list(reader_make_constant_shell(makeString("hasBeliefSystems")), makeKeyword("OBJ"), makeKeyword("BELIEF-SYSTEM")))), list(list(reader_make_constant_shell(makeString("MaleFn")), $TYPE), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("MaleAnimal"))), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), $TYPE))), list(list(reader_make_constant_shell(makeString("FemaleFn")), $TYPE), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("FemaleAnimal"))), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), $TYPE))), list(list(reader_make_constant_shell(makeString("UsingAForFn")), makeKeyword("OBJ-TYPE"), makeKeyword("ACT-TYPE"), $ROLE), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), makeKeyword("ACT-TYPE")), list(reader_make_constant_shell(makeString("relationInstanceExists")), $ROLE, makeKeyword("OBJ"), makeKeyword("OBJ-TYPE")))), list(list(reader_make_constant_shell(makeString("GlobalOrganizationFn")), $TYPE), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), $TYPE), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("InternationalOrganization"))))), list(list(reader_make_constant_shell(makeString("ExperiencingEmotionFn")), $TYPE), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("ExperiencingEmotion"))), list(reader_make_constant_shell(makeString("feelingTypeExperienced")), makeKeyword("OBJ"), $TYPE))), list(list(reader_make_constant_shell(makeString("GroupOfMinSizeFn")), makeKeyword("N"), $TYPE), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("Group"))), list(reader_make_constant_shell(makeString("groupCardinalityMin")), makeKeyword("OBJ"), makeKeyword("N")), list(reader_make_constant_shell(makeString("relationInstanceExists")), reader_make_constant_shell(makeString("groupMembers")), makeKeyword("OBJ"), $TYPE))), list(list(reader_make_constant_shell(makeString("CharacteristicSoundTypeFromActionTypeFn")), $TYPE), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("AudibleSound"))), list(reader_make_constant_shell(makeString("relationExistsInstance")), reader_make_constant_shell(makeString("soundEmitted")), $TYPE, makeKeyword("OBJ")))), list(list(reader_make_constant_shell(makeString("MilitaryFn")), makeKeyword("COUNTRY")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("GovernmentMilitaryOrganization"))), list(reader_make_constant_shell(makeString("officialArmedForces")), makeKeyword("OBJ"), makeKeyword("COUNTRY")))), list(list(reader_make_constant_shell(makeString("SubcollectionOfWithCapabilityFn")), makeKeyword("COL"), makeKeyword("SIT-TYPE"), $ROLE), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), makeKeyword("COL")), list(reader_make_constant_shell(makeString("behaviorCapable")), makeKeyword("OBJ"), makeKeyword("SIT-TYPE"), $ROLE))), list(list(reader_make_constant_shell(makeString("GroupActivityFn")), $TYPE), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), list(reader_make_constant_shell(makeString("CollectionIntersection2Fn")), $TYPE, reader_make_constant_shell(makeString("SingleDoerAction")))), list(reader_make_constant_shell(makeString("relationInstanceExists")), reader_make_constant_shell(makeString("doneBy")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("Agent-PartiallyTangible"))))), list(list(reader_make_constant_shell(makeString("AcquiringFn")), $TYPE), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("AcquiringAnObject"))), list(reader_make_constant_shell(makeString("relationInstanceExists")), reader_make_constant_shell(makeString("objectOfPossessionTransfer")), makeKeyword("OBJ"), $TYPE))), list(list(reader_make_constant_shell(makeString("SubCollectionNamedFn")), makeKeyword("STRING"), $TYPE), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), $TYPE), list(reader_make_constant_shell(makeString("nameString")), makeKeyword("OBJ"), makeKeyword("STRING")))), list(list(reader_make_constant_shell(makeString("ProperSubcollectionNamedFn-Ternary")), makeKeyword("STRING"), makeKeyword("COL"), $GUID), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), makeKeyword("COL")), list(reader_make_constant_shell(makeString("nameString")), makeKeyword("OBJ"), makeKeyword("STRING")))), list(list(reader_make_constant_shell(makeString("TechnologyForUseContextsOfTypeFn")), makeKeyword("SIT-TYPE")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("Artifact-Generic"))), list(reader_make_constant_shell(makeString("intendedPrimaryFunction")), makeKeyword("OBJ"), makeKeyword("SIT-TYPE"), reader_make_constant_shell(makeString("deviceUsed"))))), list(list(reader_make_constant_shell(makeString("JuvenileFn")), $TYPE), list(list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), list(reader_make_constant_shell(makeString("CollectionIntersection2Fn")), reader_make_constant_shell(makeString("JuvenileAnimal")), $TYPE)))), list(list(reader_make_constant_shell(makeString("ProperSubSituationTypeFn")), makeKeyword("SIT-TYPE"), makeKeyword("SUB-SIT-TYPE")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("Situation"))), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), makeKeyword("SUB-SIT-TYPE")), list(reader_make_constant_shell(makeString("relationInstanceExists")), reader_make_constant_shell(makeString("properSubSituations")), makeKeyword("OBJ"), makeKeyword("SIT-TYPE")))), list(list(reader_make_constant_shell(makeString("SensorTypeByTargetSituationTypeFn")), makeKeyword("SIT-TYPE")), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), reader_make_constant_shell(makeString("Sensor-Device"))), list(reader_make_constant_shell(makeString("intendedPrimaryFunction")), makeKeyword("OBJ"), makeKeyword("SIT-TYPE"), reader_make_constant_shell(makeString("detector"))))), list(list(reader_make_constant_shell(makeString("TheFn")), makeKeyword("COL")), list(list(reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ"), makeKeyword("COL")))), list(list(reader_make_constant_shell(makeString("TheSet")), $BIND, makeSymbol("ELEMENTS")), list(list($CALL, makeSymbol("SUBCOL-UNWIND-THE-SET"), list(makeKeyword("VALUE"), makeSymbol("ELEMENTS")), reader_make_constant_shell(makeString("isa")), makeKeyword("OBJ")))) });
    }

    @Override
    public void declareFunctions() {
        declare_subcollection_unwinder_file();
    }

    @Override
    public void initializeVariables() {
        init_subcollection_unwinder_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_subcollection_unwinder_file();
    }

    static {
















































    }
}

/**
 * Total time: 242 ms
 */
