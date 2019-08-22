package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_disjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_negation_p;
import static com.cyc.cycjava.cycl.el_utilities.el_query_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.make_conjunction;
import static com.cyc.cycjava.cycl.el_utilities.make_disjunction;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class postcanonicalizer extends SubLTranslatedFile {
    public static final SubLFile me = new postcanonicalizer();

    public static final String myName = "com.cyc.cycjava.cycl.postcanonicalizer";

    public static final String myFingerPrint = "0e3dd0b5cb17997b8d3f346f16db2abb487e496707cc87323ea4f97fa655d943";

    // Internal Constants
    public static final SubLSymbol EL_MEETS_PRAGMATIC_REQUIREMENT_P = makeSymbol("EL-MEETS-PRAGMATIC-REQUIREMENT-P");



    private static final SubLSymbol $DISJUNCT_IN_PRAGMATIC_REQUIREMENT = makeKeyword("DISJUNCT-IN-PRAGMATIC-REQUIREMENT");

    public static final SubLList $list3 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));

    public static SubLObject postcanonicalizations(final SubLObject sentence, final SubLObject mt) {
        return postcanonicalizations_int(sentence, mt);
    }

    public static SubLObject postcanonicalizations_int(SubLObject sentence, final SubLObject mt) {
        if (NIL == list_utilities.tree_find_if(EL_MEETS_PRAGMATIC_REQUIREMENT_P, cycl_utilities.sentence_args(sentence, UNPROVIDED), UNPROVIDED)) {
            return values(sentence, mt);
        }
        if (NIL != el_conjunction_p(sentence)) {
            SubLObject conjuncts = NIL;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, $IGNORE);
            SubLObject conjunct = NIL;
            conjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                conjuncts = cons(postcanonicalize_possible_disjunction(conjunct, mt), conjuncts);
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            } 
            sentence = make_conjunction(nreverse(conjuncts));
        } else
            if (NIL != el_disjunction_p(sentence)) {
                sentence = postcanonicalize_possible_disjunction(sentence, mt);
            }

        return values(sentence, mt);
    }

    public static SubLObject postcanonicalize_possible_disjunction(SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != el_disjunction_p(sentence)) {
            SubLObject disjuncts = NIL;
            SubLObject canonicalized_disjunct = NIL;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, $IGNORE);
            SubLObject disjunct = NIL;
            disjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL != el_negation_p(disjunct)) && (NIL != el_query_sentence_p(cycl_utilities.sentence_arg1(disjunct, UNPROVIDED)))) {
                    final SubLObject pragmatic_condition = cycl_utilities.sentence_arg1(cycl_utilities.sentence_arg1(disjunct, UNPROVIDED), UNPROVIDED);
                    canonicalized_disjunct = czer_main.canonicalize_ask(pragmatic_condition, UNPROVIDED);
                    if (NIL == list_utilities.singletonP(canonicalized_disjunct)) {
                        if ((NIL != wff_macros.within_wffP()) && (NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread))) {
                            wff.note_wff_violation(list($DISJUNCT_IN_PRAGMATIC_REQUIREMENT, pragmatic_condition, clausifier.clausifier_input_sentence(), clausifier.clausifier_input_mt()));
                            return values(sentence, mt);
                        }
                        return values(NIL, NIL);
                    } else {
                        disjuncts = cons(transform_dnf_and_binding_list_to_negated_el(canonicalized_disjunct), disjuncts);
                    }
                } else {
                    disjuncts = cons(disjunct, disjuncts);
                }
                cdolist_list_var = cdolist_list_var.rest();
                disjunct = cdolist_list_var.first();
            } 
            sentence = make_disjunction(nreverse(disjuncts));
        }
        return values(sentence, mt);
    }

    public static SubLObject transform_dnf_and_binding_list_to_negated_el(final SubLObject clause_with_binding_list) {
        final SubLObject dnf_clause = czer_utilities.extract_el_clauses(clause_with_binding_list).first();
        SubLObject current;
        final SubLObject datum = current = dnf_clause;
        SubLObject neg_lits = NIL;
        SubLObject pos_lits = NIL;
        destructuring_bind_must_consp(current, datum, $list3);
        neg_lits = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list3);
        pos_lits = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject swapped_clause = clauses.make_dnf(pos_lits, neg_lits);
            return czer_utilities.unpackage_cnf_clause(swapped_clause);
        }
        cdestructuring_bind_error(datum, $list3);
        return NIL;
    }

    public static SubLObject declare_postcanonicalizer_file() {
        declareFunction(me, "postcanonicalizations", "POSTCANONICALIZATIONS", 2, 0, false);
        declareFunction(me, "postcanonicalizations_int", "POSTCANONICALIZATIONS-INT", 2, 0, false);
        declareFunction(me, "postcanonicalize_possible_disjunction", "POSTCANONICALIZE-POSSIBLE-DISJUNCTION", 2, 0, false);
        declareFunction(me, "transform_dnf_and_binding_list_to_negated_el", "TRANSFORM-DNF-AND-BINDING-LIST-TO-NEGATED-EL", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_postcanonicalizer_file() {
        return NIL;
    }

    public static SubLObject setup_postcanonicalizer_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_postcanonicalizer_file();
    }

    @Override
    public void initializeVariables() {
        init_postcanonicalizer_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_postcanonicalizer_file();
    }

    
}

/**
 * Total time: 124 ms
 */
