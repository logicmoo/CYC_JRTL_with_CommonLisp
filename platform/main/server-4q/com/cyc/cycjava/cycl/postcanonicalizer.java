/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      POSTCANONICALIZER
 * source file: /cyc/top/cycl/postcanonicalizer.lisp
 * created:     2019/07/03 17:37:29
 */
public final class postcanonicalizer extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new postcanonicalizer();

 public static final String myName = "com.cyc.cycjava.cycl.postcanonicalizer";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol EL_MEETS_PRAGMATIC_REQUIREMENT_P = makeSymbol("EL-MEETS-PRAGMATIC-REQUIREMENT-P");

    private static final SubLSymbol $DISJUNCT_IN_PRAGMATIC_REQUIREMENT = makeKeyword("DISJUNCT-IN-PRAGMATIC-REQUIREMENT");

    static private final SubLList $list3 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));

    // Definitions
    /**
     *
     *
     * @return 0 EL sentence
     * @return 1 mt
    Performs some canonicalizations which could not be handled by the canonicalizer.
    Canonicalizes the pragmatic requirement condition as a high level query.
     */
    @LispMethod(comment = "@return 0 EL sentence\r\n@return 1 mt\r\nPerforms some canonicalizations which could not be handled by the canonicalizer.\r\nCanonicalizes the pragmatic requirement condition as a high level query.")
    public static final SubLObject postcanonicalizations_alt(SubLObject sentence, SubLObject mt) {
        return com.cyc.cycjava.cycl.postcanonicalizer.postcanonicalizations_int(sentence, mt);
    }

    /**
     *
     *
     * @return 0 EL sentence
     * @return 1 mt
    Performs some canonicalizations which could not be handled by the canonicalizer.
    Canonicalizes the pragmatic requirement condition as a high level query.
     */
    @LispMethod(comment = "@return 0 EL sentence\r\n@return 1 mt\r\nPerforms some canonicalizations which could not be handled by the canonicalizer.\r\nCanonicalizes the pragmatic requirement condition as a high level query.")
    public static SubLObject postcanonicalizations(final SubLObject sentence, final SubLObject mt) {
        return postcanonicalizations_int(sentence, mt);
    }

    /**
     *
     *
     * @return 0 EL sentence
     * @return 1 mt
     */
    @LispMethod(comment = "@return 0 EL sentence\r\n@return 1 mt")
    public static final SubLObject postcanonicalizations_int_alt(SubLObject sentence, SubLObject mt) {
        if (NIL == list_utilities.tree_find_if(EL_MEETS_PRAGMATIC_REQUIREMENT_P, cycl_utilities.sentence_args(sentence, UNPROVIDED), UNPROVIDED)) {
            return values(sentence, mt);
        }
        if (NIL != el_conjunction_p(sentence)) {
            {
                SubLObject conjuncts = NIL;
                SubLObject args = cycl_utilities.formula_args(sentence, $IGNORE);
                SubLObject cdolist_list_var = args;
                SubLObject conjunct = NIL;
                for (conjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , conjunct = cdolist_list_var.first()) {
                    conjuncts = cons(com.cyc.cycjava.cycl.postcanonicalizer.postcanonicalize_possible_disjunction(conjunct, mt), conjuncts);
                }
                sentence = make_conjunction(nreverse(conjuncts));
            }
        } else {
            if (NIL != el_disjunction_p(sentence)) {
                sentence = com.cyc.cycjava.cycl.postcanonicalizer.postcanonicalize_possible_disjunction(sentence, mt);
            }
        }
        return values(sentence, mt);
    }

    /**
     *
     *
     * @return 0 EL sentence
     * @return 1 mt
     */
    @LispMethod(comment = "@return 0 EL sentence\r\n@return 1 mt")
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

    /**
     *
     *
     * @return EL sentence
     */
    @LispMethod(comment = "@return EL sentence")
    public static final SubLObject postcanonicalize_possible_disjunction_alt(SubLObject sentence, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != el_disjunction_p(sentence)) {
                {
                    SubLObject disjuncts = NIL;
                    SubLObject canonicalized_disjunct = NIL;
                    SubLObject args = cycl_utilities.formula_args(sentence, $IGNORE);
                    SubLObject cdolist_list_var = args;
                    SubLObject disjunct = NIL;
                    for (disjunct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , disjunct = cdolist_list_var.first()) {
                        if ((NIL != el_negation_p(disjunct)) && (NIL != el_query_sentence_p(cycl_utilities.sentence_arg1(disjunct, UNPROVIDED)))) {
                            {
                                SubLObject pragmatic_condition = cycl_utilities.sentence_arg1(cycl_utilities.sentence_arg1(disjunct, UNPROVIDED), UNPROVIDED);
                                canonicalized_disjunct = czer_main.canonicalize_ask(pragmatic_condition, UNPROVIDED);
                                if (NIL == list_utilities.singletonP(canonicalized_disjunct)) {
                                    if ((NIL != wff_macros.within_wffP()) && (NIL != wff_vars.$accumulating_wff_violationsP$.getDynamicValue(thread))) {
                                        wff.note_wff_violation(list($DISJUNCT_IN_PRAGMATIC_REQUIREMENT, pragmatic_condition, clausifier.clausifier_input_sentence(), clausifier.clausifier_input_mt()));
                                        return values(sentence, mt);
                                    } else {
                                        return values(NIL, NIL);
                                    }
                                }
                                disjuncts = cons(com.cyc.cycjava.cycl.postcanonicalizer.transform_dnf_and_binding_list_to_negated_el(canonicalized_disjunct), disjuncts);
                            }
                        } else {
                            disjuncts = cons(disjunct, disjuncts);
                        }
                    }
                    sentence = make_disjunction(nreverse(disjuncts));
                }
            }
            return values(sentence, mt);
        }
    }

    /**
     *
     *
     * @return EL sentence
     */
    @LispMethod(comment = "@return EL sentence")
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

    /**
     *
     *
     * @return el-sentence-p.  Transforms dnf and binding list to its negated el sentence.
     */
    @LispMethod(comment = "@return el-sentence-p.  Transforms dnf and binding list to its negated el sentence.")
    public static final SubLObject transform_dnf_and_binding_list_to_negated_el_alt(SubLObject clause_with_binding_list) {
        {
            SubLObject dnf_clause = czer_utilities.extract_el_clauses(clause_with_binding_list).first();
            SubLObject datum = dnf_clause;
            SubLObject current = datum;
            SubLObject neg_lits = NIL;
            SubLObject pos_lits = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt3);
            neg_lits = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt3);
            pos_lits = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject swapped_clause = clauses.make_dnf(pos_lits, neg_lits);
                    return czer_utilities.unpackage_cnf_clause(swapped_clause);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt3);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return el-sentence-p.  Transforms dnf and binding list to its negated el sentence.
     */
    @LispMethod(comment = "@return el-sentence-p.  Transforms dnf and binding list to its negated el sentence.")
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
        declareFunction("postcanonicalizations", "POSTCANONICALIZATIONS", 2, 0, false);
        declareFunction("postcanonicalizations_int", "POSTCANONICALIZATIONS-INT", 2, 0, false);
        declareFunction("postcanonicalize_possible_disjunction", "POSTCANONICALIZE-POSSIBLE-DISJUNCTION", 2, 0, false);
        declareFunction("transform_dnf_and_binding_list_to_negated_el", "TRANSFORM-DNF-AND-BINDING-LIST-TO-NEGATED-EL", 1, 0, false);
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

    static {
    }

    static private final SubLList $list_alt3 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));
}

/**
 * Total time: 124 ms
 */
