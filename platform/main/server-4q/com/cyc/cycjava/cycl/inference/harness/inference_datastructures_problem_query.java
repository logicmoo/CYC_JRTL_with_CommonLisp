/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;


import static com.cyc.cycjava.cycl.el_utilities.possibly_sentence_p;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-DATASTRUCTURES-PROBLEM-QUERY
 * source file: /cyc/top/cycl/inference/harness/inference-datastructures-problem-query.lisp
 * created:     2019/07/03 17:37:38
 */
public final class inference_datastructures_problem_query extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new inference_datastructures_problem_query();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $formula_term_signature_counts$ = makeSymbol("*FORMULA-TERM-SIGNATURE-COUNTS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(list(makeSymbol("ASENT-VAR"), makeSymbol("MT-VAR"), makeSymbol("SENSE-VAR"), makeSymbol("CONTEXTUALIZED-CLAUSE"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list1 = list(makeKeyword("INDEX"), $DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLSymbol $sym5$INDEX_VAR = makeUninternedSymbol("INDEX-VAR");

    private static final SubLSymbol DO_CONTEXTUALIZED_CLAUSE_LITERALS = makeSymbol("DO-CONTEXTUALIZED-CLAUSE-LITERALS");

    static private final SubLSymbol $sym8$CONTEXTUALIZED_ASENT = makeUninternedSymbol("CONTEXTUALIZED-ASENT");

    static private final SubLList $list11 = list(makeKeyword("NEG"));

    private static final SubLSymbol DO_NEG_LITS_NUMBERED = makeSymbol("DO-NEG-LITS-NUMBERED");

    private static final SubLSymbol DESTRUCTURE_CONTEXTUALIZED_ASENT = makeSymbol("DESTRUCTURE-CONTEXTUALIZED-ASENT");

    static private final SubLList $list14 = list(makeKeyword("POS"));

    private static final SubLSymbol DO_POS_LITS_NUMBERED = makeSymbol("DO-POS-LITS-NUMBERED");

    static private final SubLList $list16 = list(makeSymbol("MT"), makeSymbol("ASENT"));

    static private final SubLString $str19$_a_was_not_an_atomic_contextualiz = makeString("~a was not an atomic contextualized-clause");

    static private final SubLList $list20 = list(list(makeSymbol("ASENT-VAR"), makeSymbol("MT-VAR"), makeSymbol("SENSE-VAR"), makeSymbol("QUERY"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list21 = list($DONE);

    static private final SubLSymbol $sym22$CONTEXTUALIZED_CLAUSE = makeUninternedSymbol("CONTEXTUALIZED-CLAUSE");

    private static final SubLSymbol DO_CLAUSES = makeSymbol("DO-CLAUSES");

    private static final SubLSymbol ATOMIC_CLAUSES_P = makeSymbol("ATOMIC-CLAUSES-P");

    static private final SubLSymbol $sym25$SINGLETON_ = makeSymbol("SINGLETON?");

    private static final SubLSymbol SUBCLAUSE_SPEC_P = makeSymbol("SUBCLAUSE-SPEC-P");

    private static final SubLSymbol DO_CONTEXTUALIZED_CLAUSES_LITERALS = makeSymbol("DO-CONTEXTUALIZED-CLAUSES-LITERALS");

    static private final SubLString $str31$Unexpected_equality_reasoning_dom = makeString("Unexpected equality reasoning domain ~a");

    private static final SubLSymbol SINGLE_CLAUSE_PROBLEM_QUERY_P = makeSymbol("SINGLE-CLAUSE-PROBLEM-QUERY-P");

    private static final SubLSymbol FORMULA_TERM_SIGNATURE_VISIT = makeSymbol("FORMULA-TERM-SIGNATURE-VISIT");

    static private final SubLSymbol $sym35$TERM__ = makeSymbol("TERM-<");

    static private final SubLSymbol $sym37$_ = makeSymbol(">");

    // Definitions
    public static final SubLObject hl_contextualized_asent_p_alt(SubLObject v_object) {
        return makeBoolean(((v_object.isCons() && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.inference_context_spec_p(v_object.first()))) && (NIL != possibly_sentence_p(second(v_object))));
    }

    // Definitions
    public static SubLObject hl_contextualized_asent_p(final SubLObject v_object) {
        return makeBoolean(((v_object.isCons() && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != inference_context_spec_p(v_object.first()))) && (NIL != possibly_sentence_p(second(v_object))));
    }

    public static final SubLObject inference_context_spec_p_alt(SubLObject v_object) {
        return hlmt.possibly_hlmt_p(v_object);
    }

    public static SubLObject inference_context_spec_p(final SubLObject v_object) {
        return hlmt.possibly_hlmt_p(v_object);
    }

    public static final SubLObject make_contextualized_asent_alt(SubLObject mt, SubLObject asent) {
        return list(mt, asent);
    }

    public static SubLObject make_contextualized_asent(final SubLObject mt, final SubLObject asent) {
        return list(mt, asent);
    }

    public static final SubLObject contextualized_asent_mt_alt(SubLObject contextualized_asent) {
        return contextualized_asent.first();
    }

    public static SubLObject contextualized_asent_mt(final SubLObject contextualized_asent) {
        return contextualized_asent.first();
    }

    public static final SubLObject contextualized_asent_asent_alt(SubLObject contextualized_asent) {
        return second(contextualized_asent);
    }

    public static SubLObject contextualized_asent_asent(final SubLObject contextualized_asent) {
        return second(contextualized_asent);
    }

    public static final SubLObject contextualized_asent_predicate_alt(SubLObject contextualized_asent) {
        return cycl_utilities.atomic_sentence_predicate(com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.contextualized_asent_asent(contextualized_asent));
    }

    public static SubLObject contextualized_asent_predicate(final SubLObject contextualized_asent) {
        return cycl_utilities.atomic_sentence_predicate(contextualized_asent_asent(contextualized_asent));
    }

    public static final SubLObject contextualized_dnf_clause_p_alt(SubLObject v_object) {
        if (NIL != clauses.dnf_p(v_object)) {
            {
                SubLObject cdolist_list_var = clauses.neg_lits(v_object);
                SubLObject asent = NIL;
                for (asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , asent = cdolist_list_var.first()) {
                    if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.hl_contextualized_asent_p(asent)) {
                        return NIL;
                    }
                }
            }
            {
                SubLObject cdolist_list_var = clauses.pos_lits(v_object);
                SubLObject asent = NIL;
                for (asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , asent = cdolist_list_var.first()) {
                    if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.hl_contextualized_asent_p(asent)) {
                        return NIL;
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject contextualized_dnf_clause_p(final SubLObject v_object) {
        if (NIL != clauses.dnf_p(v_object)) {
            SubLObject cdolist_list_var = clauses.neg_lits(v_object);
            SubLObject asent = NIL;
            asent = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == hl_contextualized_asent_p(asent)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                asent = cdolist_list_var.first();
            } 
            cdolist_list_var = clauses.pos_lits(v_object);
            asent = NIL;
            asent = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == hl_contextualized_asent_p(asent)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                asent = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    public static final SubLObject do_contextualized_clause_literals_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject asent_var = NIL;
                    SubLObject mt_var = NIL;
                    SubLObject sense_var = NIL;
                    SubLObject contextualized_clause = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    asent_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    mt_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    sense_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    contextualized_clause = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt0);
                            if (NIL == member(current_1, $list_alt1, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt0);
                        }
                        {
                            SubLObject index_tail = property_list_member($INDEX, current);
                            SubLObject index = (NIL != index_tail) ? ((SubLObject) (cadr(index_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                if (NIL == index) {
                                    {
                                        SubLObject index_var = $sym5$INDEX_VAR;
                                        return listS(DO_CONTEXTUALIZED_CLAUSE_LITERALS, list(asent_var, mt_var, sense_var, contextualized_clause, $INDEX, index_var, $DONE, done), list(IGNORE, index_var), append(body, NIL));
                                    }
                                }
                                {
                                    SubLObject contextualized_asent = $sym8$CONTEXTUALIZED_ASENT;
                                    return list(PROGN, list(CLET, list(bq_cons(sense_var, $list_alt11)), list(DO_NEG_LITS_NUMBERED, list(contextualized_asent, index, contextualized_clause, $DONE, done), listS(DESTRUCTURE_CONTEXTUALIZED_ASENT, list(mt_var, asent_var), contextualized_asent, append(body, NIL)))), list(CLET, list(bq_cons(sense_var, $list_alt14)), list(DO_POS_LITS_NUMBERED, list(contextualized_asent, index, contextualized_clause, $DONE, done), listS(DESTRUCTURE_CONTEXTUALIZED_ASENT, list(mt_var, asent_var), contextualized_asent, append(body, NIL)))));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_contextualized_clause_literals(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject asent_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject sense_var = NIL;
        SubLObject contextualized_clause = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        asent_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        sense_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        contextualized_clause = current.first();
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
        final SubLObject index_tail = property_list_member($INDEX, current);
        final SubLObject index = (NIL != index_tail) ? cadr(index_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        if (NIL == index) {
            final SubLObject index_var = $sym5$INDEX_VAR;
            return listS(DO_CONTEXTUALIZED_CLAUSE_LITERALS, list(asent_var, mt_var, sense_var, contextualized_clause, $INDEX, index_var, $DONE, done), list(IGNORE, index_var), append(body, NIL));
        }
        final SubLObject contextualized_asent = $sym8$CONTEXTUALIZED_ASENT;
        return list(PROGN, list(CLET, list(bq_cons(sense_var, $list11)), list(DO_NEG_LITS_NUMBERED, list(contextualized_asent, index, contextualized_clause, $DONE, done), listS(DESTRUCTURE_CONTEXTUALIZED_ASENT, list(mt_var, asent_var), contextualized_asent, append(body, NIL)))), list(CLET, list(bq_cons(sense_var, $list14)), list(DO_POS_LITS_NUMBERED, list(contextualized_asent, index, contextualized_clause, $DONE, done), listS(DESTRUCTURE_CONTEXTUALIZED_ASENT, list(mt_var, asent_var), contextualized_asent, append(body, NIL)))));
    }

    public static final SubLObject contextualized_clause_has_literal_with_predicateP_alt(SubLObject contextualized_clause, SubLObject predicate) {
        {
            SubLObject cdolist_list_var = clauses.neg_lits(contextualized_clause);
            SubLObject contextualized_asent = NIL;
            for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                {
                    SubLObject datum = contextualized_asent;
                    SubLObject current = datum;
                    SubLObject mt = NIL;
                    SubLObject asent = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt16);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt16);
                    asent = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, predicate)) {
                            return T;
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt16);
                    }
                }
            }
        }
        {
            SubLObject cdolist_list_var = clauses.pos_lits(contextualized_clause);
            SubLObject contextualized_asent = NIL;
            for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                {
                    SubLObject datum = contextualized_asent;
                    SubLObject current = datum;
                    SubLObject mt = NIL;
                    SubLObject asent = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt16);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt16);
                    asent = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, predicate)) {
                            return T;
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt16);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject contextualized_clause_has_literal_with_predicateP(final SubLObject contextualized_clause, final SubLObject predicate) {
        SubLObject cdolist_list_var = clauses.neg_lits(contextualized_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            destructuring_bind_must_consp(current, datum, $list16);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list16);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, predicate)) {
                    return T;
                }
            } else {
                cdestructuring_bind_error(datum, $list16);
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        cdolist_list_var = clauses.pos_lits(contextualized_clause);
        contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            destructuring_bind_must_consp(current, datum, $list16);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list16);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, predicate)) {
                    return T;
                }
            } else {
                cdestructuring_bind_error(datum, $list16);
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * assumes CONTEXTUALIZED-CLAUSE is an atomic-clause-p
     */
    @LispMethod(comment = "assumes CONTEXTUALIZED-CLAUSE is an atomic-clause-p")
    public static final SubLObject mt_asent_sense_from_atomic_contextualized_clause_alt(SubLObject contextualized_clause) {
        if (NIL != clause_utilities.pos_atomic_clause_p(contextualized_clause)) {
            {
                SubLObject contextualized_asent = clause_utilities.atomic_clause_asent(contextualized_clause);
                SubLObject datum = contextualized_asent;
                SubLObject current = datum;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt16);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt16);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    return values(mt, asent, $POS);
                } else {
                    cdestructuring_bind_error(datum, $list_alt16);
                }
            }
        } else {
            if (NIL != clause_utilities.neg_atomic_clause_p(contextualized_clause)) {
                {
                    SubLObject contextualized_asent = clause_utilities.atomic_clause_asent(contextualized_clause);
                    SubLObject datum = contextualized_asent;
                    SubLObject current = datum;
                    SubLObject mt = NIL;
                    SubLObject asent = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt16);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt16);
                    asent = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        return values(mt, asent, $NEG);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt16);
                    }
                }
            } else {
                Errors.error($str_alt19$_a_was_not_an_atomic_contextualiz, contextualized_clause);
            }
        }
        return NIL;
    }

    /**
     * assumes CONTEXTUALIZED-CLAUSE is an atomic-clause-p
     */
    @LispMethod(comment = "assumes CONTEXTUALIZED-CLAUSE is an atomic-clause-p")
    public static SubLObject mt_asent_sense_from_atomic_contextualized_clause(final SubLObject contextualized_clause) {
        if (NIL != clause_utilities.pos_atomic_clause_p(contextualized_clause)) {
            final SubLObject contextualized_asent = clause_utilities.atomic_clause_asent(contextualized_clause);
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            destructuring_bind_must_consp(current, datum, $list16);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list16);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                return subl_promotions.values3(mt, asent, $POS);
            }
            cdestructuring_bind_error(datum, $list16);
        } else
            if (NIL != clause_utilities.neg_atomic_clause_p(contextualized_clause)) {
                final SubLObject contextualized_asent = clause_utilities.atomic_clause_asent(contextualized_clause);
                SubLObject current;
                final SubLObject datum = current = contextualized_asent;
                SubLObject mt = NIL;
                SubLObject asent = NIL;
                destructuring_bind_must_consp(current, datum, $list16);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list16);
                asent = current.first();
                current = current.rest();
                if (NIL == current) {
                    return subl_promotions.values3(mt, asent, $NEG);
                }
                cdestructuring_bind_error(datum, $list16);
            } else {
                Errors.error($str19$_a_was_not_an_atomic_contextualiz, contextualized_clause);
            }

        return NIL;
    }

    public static final SubLObject contextualized_dnf_clauses_p_alt(SubLObject v_object) {
        if (NIL != clauses.dnf_clauses_p(v_object)) {
            {
                SubLObject cdolist_list_var = v_object;
                SubLObject dnf_clause = NIL;
                for (dnf_clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , dnf_clause = cdolist_list_var.first()) {
                    if (NIL == com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.contextualized_dnf_clause_p(dnf_clause)) {
                        return NIL;
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    public static SubLObject contextualized_dnf_clauses_p(final SubLObject v_object) {
        if (NIL != clauses.dnf_clauses_p(v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject dnf_clause = NIL;
            dnf_clause = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == contextualized_dnf_clause_p(dnf_clause)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                dnf_clause = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    public static final SubLObject do_contextualized_clauses_literals_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject asent_var = NIL;
                    SubLObject mt_var = NIL;
                    SubLObject sense_var = NIL;
                    SubLObject query = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    asent_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    mt_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    sense_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    query = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt20);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt20);
                            if (NIL == member(current_2, $list_alt21, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt20);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject contextualized_clause = $sym22$CONTEXTUALIZED_CLAUSE;
                                return list(DO_CLAUSES, list(contextualized_clause, query, $DONE, done), listS(DO_CONTEXTUALIZED_CLAUSE_LITERALS, list(asent_var, mt_var, sense_var, contextualized_clause), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_contextualized_clauses_literals(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject asent_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject sense_var = NIL;
        SubLObject query = NIL;
        destructuring_bind_must_consp(current, datum, $list20);
        asent_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        sense_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        query = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list20);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list20);
            if (NIL == member(current_$2, $list21, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list20);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject contextualized_clause = $sym22$CONTEXTUALIZED_CLAUSE;
        return list(DO_CLAUSES, list(contextualized_clause, query, $DONE, done), listS(DO_CONTEXTUALIZED_CLAUSE_LITERALS, list(asent_var, mt_var, sense_var, contextualized_clause), append(body, NIL)));
    }

    public static final SubLObject sole_contextualized_asent_from_contextualized_clauses_alt(SubLObject contextualized_clauses) {
        SubLTrampolineFile.checkType(contextualized_clauses, ATOMIC_CLAUSES_P);
        {
            SubLObject contextualized_clause = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.sole_contextualized_clause_from_singleton_contextualized_clauses(contextualized_clauses);
            return clause_utilities.atomic_clause_asent(contextualized_clause);
        }
    }

    public static SubLObject sole_contextualized_asent_from_contextualized_clauses(final SubLObject contextualized_clauses) {
        assert NIL != clause_utilities.atomic_clauses_p(contextualized_clauses) : "! clause_utilities.atomic_clauses_p(contextualized_clauses) " + ("clause_utilities.atomic_clauses_p(contextualized_clauses) " + "CommonSymbols.NIL != clause_utilities.atomic_clauses_p(contextualized_clauses) ") + contextualized_clauses;
        final SubLObject contextualized_clause = sole_contextualized_clause_from_singleton_contextualized_clauses(contextualized_clauses);
        return clause_utilities.atomic_clause_asent(contextualized_clause);
    }

    public static final SubLObject sole_contextualized_clause_from_singleton_contextualized_clauses_alt(SubLObject contextualized_clauses) {
        SubLTrampolineFile.checkType(contextualized_clauses, $sym25$SINGLETON_);
        return contextualized_clauses.first();
    }

    public static SubLObject sole_contextualized_clause_from_singleton_contextualized_clauses(final SubLObject contextualized_clauses) {
        assert NIL != list_utilities.singletonP(contextualized_clauses) : "! list_utilities.singletonP(contextualized_clauses) " + ("list_utilities.singletonP(contextualized_clauses) " + "CommonSymbols.NIL != list_utilities.singletonP(contextualized_clauses) ") + contextualized_clauses;
        return contextualized_clauses.first();
    }

    public static final SubLObject problem_query_p_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.contextualized_dnf_clauses_p(v_object);
    }

    public static SubLObject problem_query_p(final SubLObject v_object) {
        return contextualized_dnf_clauses_p(v_object);
    }

    public static final SubLObject explanatory_subquery_spec_p_alt(SubLObject v_object) {
        return makeBoolean(($ALL == v_object) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.problem_query_p(v_object)));
    }

    public static SubLObject explanatory_subquery_spec_p(final SubLObject v_object) {
        return makeBoolean(($ALL == v_object) || (NIL != problem_query_p(v_object)));
    }

    public static final SubLObject non_explanatory_subquery_spec_p_alt(SubLObject v_object) {
        return makeBoolean((NIL == v_object) || (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.problem_query_p(v_object)));
    }

    public static SubLObject non_explanatory_subquery_spec_p(final SubLObject v_object) {
        return makeBoolean((NIL == v_object) || (NIL != problem_query_p(v_object)));
    }

    public static final SubLObject new_problem_query_from_contextualized_clause_alt(SubLObject contextualized_clause) {
        return list(contextualized_clause);
    }

    public static SubLObject new_problem_query_from_contextualized_clause(final SubLObject contextualized_clause) {
        return list(contextualized_clause);
    }

    public static final SubLObject new_problem_query_without_literal_alt(SubLObject clause, SubLObject sense, SubLObject index) {
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.new_problem_query_from_contextualized_clause(clauses.clause_without_literal(clause, sense, index));
    }

    public static SubLObject new_problem_query_without_literal(final SubLObject clause, final SubLObject sense, final SubLObject index) {
        return new_problem_query_from_contextualized_clause(clauses.clause_without_literal(clause, sense, index));
    }

    public static final SubLObject new_problem_query_from_subclause_spec_alt(SubLObject contextualized_clause, SubLObject subclause_spec) {
        SubLTrampolineFile.checkType(subclause_spec, SUBCLAUSE_SPEC_P);
        {
            SubLObject contextualized_subclause = clause_utilities.subclause_specified_by_spec(contextualized_clause, subclause_spec);
            return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.new_problem_query_from_contextualized_clause(contextualized_subclause);
        }
    }

    public static SubLObject new_problem_query_from_subclause_spec(final SubLObject contextualized_clause, final SubLObject subclause_spec) {
        assert NIL != clause_utilities.subclause_spec_p(subclause_spec) : "! clause_utilities.subclause_spec_p(subclause_spec) " + ("clause_utilities.subclause_spec_p(subclause_spec) " + "CommonSymbols.NIL != clause_utilities.subclause_spec_p(subclause_spec) ") + subclause_spec;
        final SubLObject contextualized_subclause = clause_utilities.subclause_specified_by_spec(contextualized_clause, subclause_spec);
        return new_problem_query_from_contextualized_clause(contextualized_subclause);
    }

    public static final SubLObject new_problem_query_without_subclause_spec_alt(SubLObject contextualized_clause, SubLObject subclause_spec) {
        SubLTrampolineFile.checkType(subclause_spec, SUBCLAUSE_SPEC_P);
        {
            SubLObject contextualized_subclause = clause_utilities.complement_of_subclause_specified_by_spec(contextualized_clause, subclause_spec);
            return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.new_problem_query_from_contextualized_clause(contextualized_subclause);
        }
    }

    public static SubLObject new_problem_query_without_subclause_spec(final SubLObject contextualized_clause, final SubLObject subclause_spec) {
        assert NIL != clause_utilities.subclause_spec_p(subclause_spec) : "! clause_utilities.subclause_spec_p(subclause_spec) " + ("clause_utilities.subclause_spec_p(subclause_spec) " + "CommonSymbols.NIL != clause_utilities.subclause_spec_p(subclause_spec) ") + subclause_spec;
        final SubLObject contextualized_subclause = clause_utilities.complement_of_subclause_specified_by_spec(contextualized_clause, subclause_spec);
        return new_problem_query_from_contextualized_clause(contextualized_subclause);
    }

    public static final SubLObject new_problem_query_from_contextualized_asent_sense_alt(SubLObject contextualized_asent, SubLObject sense) {
        {
            SubLObject pcase_var = sense;
            if (pcase_var.eql($POS)) {
                return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.new_problem_query_from_contextualized_clause(clauses.make_clause(NIL, list(contextualized_asent)));
            } else {
                if (pcase_var.eql($NEG)) {
                    return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.new_problem_query_from_contextualized_clause(clauses.make_clause(list(contextualized_asent), NIL));
                }
            }
        }
        return NIL;
    }

    public static SubLObject new_problem_query_from_contextualized_asent_sense(final SubLObject contextualized_asent, final SubLObject sense) {
        if (sense.eql($POS)) {
            return new_problem_query_from_contextualized_clause(clauses.make_clause(NIL, list(contextualized_asent)));
        }
        if (sense.eql($NEG)) {
            return new_problem_query_from_contextualized_clause(clauses.make_clause(list(contextualized_asent), NIL));
        }
        return NIL;
    }

    public static final SubLObject new_problem_query_from_mt_asent_sense_alt(SubLObject mt, SubLObject asent, SubLObject sense) {
        {
            SubLObject contextualized_asent = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.make_contextualized_asent(mt, asent);
            return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.new_problem_query_from_contextualized_asent_sense(contextualized_asent, sense);
        }
    }

    public static SubLObject new_problem_query_from_mt_asent_sense(final SubLObject mt, final SubLObject asent, final SubLObject sense) {
        final SubLObject contextualized_asent = make_contextualized_asent(mt, asent);
        return new_problem_query_from_contextualized_asent_sense(contextualized_asent, sense);
    }

    public static final SubLObject do_problem_query_literals_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject asent_var = NIL;
                    SubLObject mt_var = NIL;
                    SubLObject sense_var = NIL;
                    SubLObject query = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    asent_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    mt_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    sense_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    query = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt20);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt20);
                            if (NIL == member(current_3, $list_alt21, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt20);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_CONTEXTUALIZED_CLAUSES_LITERALS, list(asent_var, mt_var, sense_var, query, $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_problem_query_literals(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject asent_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject sense_var = NIL;
        SubLObject query = NIL;
        destructuring_bind_must_consp(current, datum, $list20);
        asent_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        mt_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        sense_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        query = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list20);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list20);
            if (NIL == member(current_$3, $list21, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list20);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_CONTEXTUALIZED_CLAUSES_LITERALS, list(asent_var, mt_var, sense_var, query, $DONE, done), append(body, NIL));
    }

    public static final SubLObject problem_query_in_equality_reasoning_domainP_alt(SubLObject query, SubLObject equality_reasoning_domain) {
        {
            SubLObject pcase_var = equality_reasoning_domain;
            if (pcase_var.eql($NONE)) {
                return NIL;
            } else {
                if (pcase_var.eql($ALL)) {
                    return T;
                } else {
                    if (pcase_var.eql($SINGLE_LITERAL)) {
                        return clause_utilities.atomic_clauses_p(query);
                    } else {
                        Errors.error($str_alt31$Unexpected_equality_reasoning_dom, equality_reasoning_domain);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject problem_query_in_equality_reasoning_domainP(final SubLObject query, final SubLObject equality_reasoning_domain) {
        if (equality_reasoning_domain.eql($NONE)) {
            return NIL;
        }
        if (equality_reasoning_domain.eql($ALL)) {
            return T;
        }
        if (equality_reasoning_domain.eql($SINGLE_LITERAL)) {
            return clause_utilities.atomic_clauses_p(query);
        }
        Errors.error($str31$Unexpected_equality_reasoning_dom, equality_reasoning_domain);
        return NIL;
    }

    public static final SubLObject problem_query_variables_alt(SubLObject query) {
        return cycl_utilities.expression_gather(query, HL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject problem_query_variables(final SubLObject query) {
        return cycl_utilities.expression_gather(query, HL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject single_clause_problem_query_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.problem_query_p(v_object)) && (NIL != list_utilities.singletonP(v_object)));
    }

    public static SubLObject single_clause_problem_query_p(final SubLObject v_object) {
        return makeBoolean((NIL != problem_query_p(v_object)) && (NIL != list_utilities.singletonP(v_object)));
    }

    public static final SubLObject sole_contextualized_clause_from_single_clause_problem_query_alt(SubLObject problem_query) {
        SubLTrampolineFile.checkType(problem_query, SINGLE_CLAUSE_PROBLEM_QUERY_P);
        return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.sole_contextualized_clause_from_singleton_contextualized_clauses(problem_query);
    }

    public static SubLObject sole_contextualized_clause_from_single_clause_problem_query(final SubLObject problem_query) {
        assert NIL != single_clause_problem_query_p(problem_query) : "! inference_datastructures_problem_query.single_clause_problem_query_p(problem_query) " + ("inference_datastructures_problem_query.single_clause_problem_query_p(problem_query) " + "CommonSymbols.NIL != inference_datastructures_problem_query.single_clause_problem_query_p(problem_query) ") + problem_query;
        return sole_contextualized_clause_from_singleton_contextualized_clauses(problem_query);
    }

    /**
     *
     *
     * @return boolean; whether OBJECT is a problem query consisting of
    a single contextualized literal (either positive or negative).
     */
    @LispMethod(comment = "@return boolean; whether OBJECT is a problem query consisting of\r\na single contextualized literal (either positive or negative).")
    public static final SubLObject single_literal_problem_query_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.problem_query_p(v_object)) && (NIL != com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.problem_query_has_single_literal_p(v_object)));
    }

    /**
     *
     *
     * @return boolean; whether OBJECT is a problem query consisting of
    a single contextualized literal (either positive or negative).
     */
    @LispMethod(comment = "@return boolean; whether OBJECT is a problem query consisting of\r\na single contextualized literal (either positive or negative).")
    public static SubLObject single_literal_problem_query_p(final SubLObject v_object) {
        return makeBoolean((NIL != problem_query_p(v_object)) && (NIL != problem_query_has_single_literal_p(v_object)));
    }

    /**
     *
     *
     * @return boolean; whether PROBLEM-QUERY has only
    a single contextualized literal (either positive or negative).
     */
    @LispMethod(comment = "@return boolean; whether PROBLEM-QUERY has only\r\na single contextualized literal (either positive or negative).")
    public static final SubLObject problem_query_has_single_literal_p_alt(SubLObject problem_query) {
        return makeBoolean((NIL != list_utilities.singletonP(problem_query)) && (NIL != clauses.atomic_clause_p(problem_query.first())));
    }

    /**
     *
     *
     * @return boolean; whether PROBLEM-QUERY has only
    a single contextualized literal (either positive or negative).
     */
    @LispMethod(comment = "@return boolean; whether PROBLEM-QUERY has only\r\na single contextualized literal (either positive or negative).")
    public static SubLObject problem_query_has_single_literal_p(final SubLObject problem_query) {
        return makeBoolean((NIL != list_utilities.singletonP(problem_query)) && (NIL != clauses.atomic_clause_p(problem_query.first())));
    }

    /**
     *
     *
     * @return single-literal-problem-query-p;  Converts ASENT SENSE and MT into a single-literal problem query.
     */
    @LispMethod(comment = "@return single-literal-problem-query-p;  Converts ASENT SENSE and MT into a single-literal problem query.")
    public static final SubLObject asent_sense_and_mt_to_problem_query_alt(SubLObject asent, SubLObject sense, SubLObject mt) {
        {
            SubLObject truth = enumeration_types.sense_truth(sense);
            SubLObject dnf = clause_utilities.make_gaf_dnf_with_truth(asent, truth);
            SubLObject contextualized_clause = inference_czer.contextualize_clause(dnf, mt, UNPROVIDED);
            return list(contextualized_clause);
        }
    }

    /**
     *
     *
     * @return single-literal-problem-query-p;  Converts ASENT SENSE and MT into a single-literal problem query.
     */
    @LispMethod(comment = "@return single-literal-problem-query-p;  Converts ASENT SENSE and MT into a single-literal problem query.")
    public static SubLObject asent_sense_and_mt_to_problem_query(final SubLObject asent, final SubLObject sense, final SubLObject mt) {
        final SubLObject truth = enumeration_types.sense_truth(sense);
        final SubLObject dnf = clause_utilities.make_gaf_dnf_with_truth(asent, truth);
        final SubLObject contextualized_clause = inference_czer.contextualize_clause(dnf, mt, UNPROVIDED);
        return list(contextualized_clause);
    }

    /**
     *
     *
     * @param QUERY
    atomic-clauses-p;
     * 		
     * @return sense-p;  Returns the sense of query.
     */
    @LispMethod(comment = "@param QUERY\natomic-clauses-p;\r\n\t\t\r\n@return sense-p;  Returns the sense of query.")
    public static final SubLObject single_literal_problem_query_sense_alt(SubLObject query) {
        if (NIL != clause_utilities.pos_atomic_clauses_p(query)) {
            return $POS;
        } else {
            return $NEG;
        }
    }

    /**
     *
     *
     * @param QUERY
    atomic-clauses-p;
     * 		
     * @return sense-p;  Returns the sense of query.
     */
    @LispMethod(comment = "@param QUERY\natomic-clauses-p;\r\n\t\t\r\n@return sense-p;  Returns the sense of query.")
    public static SubLObject single_literal_problem_query_sense(final SubLObject query) {
        if (NIL != clause_utilities.pos_atomic_clauses_p(query)) {
            return $POS;
        }
        return $NEG;
    }

    public static final SubLObject single_literal_problem_query_mt_alt(SubLObject query) {
        {
            SubLObject dnf_clause = query.first();
            SubLObject contextualized_asent = clause_utilities.atomic_clause_asent(dnf_clause);
            SubLObject datum = contextualized_asent;
            SubLObject current = datum;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt16);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt16);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                return mt;
            } else {
                cdestructuring_bind_error(datum, $list_alt16);
            }
        }
        return NIL;
    }

    public static SubLObject single_literal_problem_query_mt(final SubLObject query) {
        final SubLObject dnf_clause = query.first();
        final SubLObject contextualized_asent = clause_utilities.atomic_clause_asent(dnf_clause);
        SubLObject current;
        final SubLObject datum = current = contextualized_asent;
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        destructuring_bind_must_consp(current, datum, $list16);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list16);
        asent = current.first();
        current = current.rest();
        if (NIL == current) {
            return mt;
        }
        cdestructuring_bind_error(datum, $list16);
        return NIL;
    }

    public static final SubLObject single_literal_problem_query_atomic_sentence_alt(SubLObject query) {
        {
            SubLObject dnf_clause = query.first();
            SubLObject contextualized_asent = clause_utilities.atomic_clause_asent(dnf_clause);
            if (NIL != contextualized_asent) {
                {
                    SubLObject datum = contextualized_asent;
                    SubLObject current = datum;
                    SubLObject mt = NIL;
                    SubLObject asent = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt16);
                    mt = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt16);
                    asent = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        return asent;
                    } else {
                        cdestructuring_bind_error(datum, $list_alt16);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject single_literal_problem_query_atomic_sentence(final SubLObject query) {
        final SubLObject dnf_clause = query.first();
        final SubLObject contextualized_asent = clause_utilities.atomic_clause_asent(dnf_clause);
        if (NIL != contextualized_asent) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            destructuring_bind_must_consp(current, datum, $list16);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list16);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                return asent;
            }
            cdestructuring_bind_error(datum, $list16);
        }
        return NIL;
    }

    /**
     * Assuming QUERY is a @xref single-literal-problem-query-p,
     * returns the predicate of its single contextualized literal.
     */
    @LispMethod(comment = "Assuming QUERY is a @xref single-literal-problem-query-p,\r\nreturns the predicate of its single contextualized literal.\nAssuming QUERY is a @xref single-literal-problem-query-p,\nreturns the predicate of its single contextualized literal.")
    public static final SubLObject single_literal_problem_query_predicate_alt(SubLObject query) {
        {
            SubLObject asent = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.single_literal_problem_query_atomic_sentence(query);
            SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
            return predicate;
        }
    }

    @LispMethod(comment = "Assuming QUERY is a @xref single-literal-problem-query-p,\r\nreturns the predicate of its single contextualized literal.\nAssuming QUERY is a @xref single-literal-problem-query-p,\nreturns the predicate of its single contextualized literal.")
    public static SubLObject single_literal_problem_query_predicate(final SubLObject query) {
        final SubLObject asent = single_literal_problem_query_atomic_sentence(query);
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        return predicate;
    }/**
     * Assuming QUERY is a @xref single-literal-problem-query-p,
     * returns the predicate of its single contextualized literal.
     */


    /**
     * assumes QUERY is a singleton contextualized-dnf-clauses-p
     * whose single element is an atomic-clause-p
     */
    @LispMethod(comment = "assumes QUERY is a singleton contextualized-dnf-clauses-p\r\nwhose single element is an atomic-clause-p\nassumes QUERY is a singleton contextualized-dnf-clauses-p\nwhose single element is an atomic-clause-p")
    public static final SubLObject mt_asent_sense_from_singleton_query_alt(SubLObject query) {
        {
            SubLObject clause = query.first();
            return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.mt_asent_sense_from_atomic_contextualized_clause(clause);
        }
    }

    @LispMethod(comment = "assumes QUERY is a singleton contextualized-dnf-clauses-p\r\nwhose single element is an atomic-clause-p\nassumes QUERY is a singleton contextualized-dnf-clauses-p\nwhose single element is an atomic-clause-p")
    public static SubLObject mt_asent_sense_from_singleton_query(final SubLObject query) {
        final SubLObject clause = query.first();
        return mt_asent_sense_from_atomic_contextualized_clause(clause);
    }/**
     * assumes QUERY is a singleton contextualized-dnf-clauses-p
     * whose single element is an atomic-clause-p
     */


    /**
     * Return a PLIST of TERM COUNT pairs which is signature suitable as a necessary condition match
     * between two differenly canonicalized formulas.  Every atom in problem query wil have
     * a TERM entry in the result.  Each TERM only appears once in the result, except for ?var0
     * which is repeatedly used for all HL variables.
     */
    @LispMethod(comment = "Return a PLIST of TERM COUNT pairs which is signature suitable as a necessary condition match\r\nbetween two differenly canonicalized formulas.  Every atom in problem query wil have\r\na TERM entry in the result.  Each TERM only appears once in the result, except for ?var0\r\nwhich is repeatedly used for all HL variables.\nReturn a PLIST of TERM COUNT pairs which is signature suitable as a necessary condition match\nbetween two differenly canonicalized formulas.  Every atom in problem query wil have\na TERM entry in the result.  Each TERM only appears once in the result, except for ?var0\nwhich is repeatedly used for all HL variables.")
    public static final SubLObject formula_term_signature_alt(SubLObject formula, SubLObject signature_size) {
        if (signature_size == UNPROVIDED) {
            signature_size = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = $formula_term_signature_counts$.currentBinding(thread);
                    try {
                        $formula_term_signature_counts$.bind(dictionary.new_dictionary(symbol_function(EQUAL), signature_size), thread);
                        list_utilities.tree_map(FORMULA_TERM_SIGNATURE_VISIT, formula, UNPROVIDED);
                        result = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.postprocess_formula_term_signature($formula_term_signature_counts$.getDynamicValue(thread));
                    } finally {
                        $formula_term_signature_counts$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    @LispMethod(comment = "Return a PLIST of TERM COUNT pairs which is signature suitable as a necessary condition match\r\nbetween two differenly canonicalized formulas.  Every atom in problem query wil have\r\na TERM entry in the result.  Each TERM only appears once in the result, except for ?var0\r\nwhich is repeatedly used for all HL variables.\nReturn a PLIST of TERM COUNT pairs which is signature suitable as a necessary condition match\nbetween two differenly canonicalized formulas.  Every atom in problem query wil have\na TERM entry in the result.  Each TERM only appears once in the result, except for ?var0\nwhich is repeatedly used for all HL variables.")
    public static SubLObject formula_term_signature(final SubLObject formula, SubLObject signature_size) {
        if (signature_size == UNPROVIDED) {
            signature_size = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = $formula_term_signature_counts$.currentBinding(thread);
        try {
            $formula_term_signature_counts$.bind(dictionary.new_dictionary(symbol_function(EQUAL), signature_size), thread);
            list_utilities.tree_map(FORMULA_TERM_SIGNATURE_VISIT, formula, UNPROVIDED);
            result = postprocess_formula_term_signature($formula_term_signature_counts$.getDynamicValue(thread));
        } finally {
            $formula_term_signature_counts$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Return a PLIST of TERM COUNT pairs which is signature suitable as a necessary condition match
     * between two differenly canonicalized problem queries.  Every atom in problem query wil have
     * a TERM entry in the result.  Each TERM only appears once in the result, except for ?var0
     * which is repeatedly used for all HL variables.
     */
    @LispMethod(comment = "Return a PLIST of TERM COUNT pairs which is signature suitable as a necessary condition match\r\nbetween two differenly canonicalized problem queries.  Every atom in problem query wil have\r\na TERM entry in the result.  Each TERM only appears once in the result, except for ?var0\r\nwhich is repeatedly used for all HL variables.\nReturn a PLIST of TERM COUNT pairs which is signature suitable as a necessary condition match\nbetween two differenly canonicalized problem queries.  Every atom in problem query wil have\na TERM entry in the result.  Each TERM only appears once in the result, except for ?var0\nwhich is repeatedly used for all HL variables.")
    public static final SubLObject problem_query_term_signature_alt(SubLObject problem_query) {
        {
            SubLObject estimated_size = com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.problem_query_term_signature_estimated_size(problem_query);
            return com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query.formula_term_signature(problem_query, estimated_size);
        }
    }

    @LispMethod(comment = "Return a PLIST of TERM COUNT pairs which is signature suitable as a necessary condition match\r\nbetween two differenly canonicalized problem queries.  Every atom in problem query wil have\r\na TERM entry in the result.  Each TERM only appears once in the result, except for ?var0\r\nwhich is repeatedly used for all HL variables.\nReturn a PLIST of TERM COUNT pairs which is signature suitable as a necessary condition match\nbetween two differenly canonicalized problem queries.  Every atom in problem query wil have\na TERM entry in the result.  Each TERM only appears once in the result, except for ?var0\nwhich is repeatedly used for all HL variables.")
    public static SubLObject problem_query_term_signature(final SubLObject problem_query) {
        final SubLObject estimated_size = problem_query_term_signature_estimated_size(problem_query);
        return formula_term_signature(problem_query, estimated_size);
    }/**
     * Return a PLIST of TERM COUNT pairs which is signature suitable as a necessary condition match
     * between two differenly canonicalized problem queries.  Every atom in problem query wil have
     * a TERM entry in the result.  Each TERM only appears once in the result, except for ?var0
     * which is repeatedly used for all HL variables.
     */


    public static final SubLObject problem_query_term_signature_estimated_size_alt(SubLObject problem_query) {
        {
            SubLObject literal_count = inference_datastructures_problem.problem_query_literal_count(problem_query, UNPROVIDED);
            return add(THREE_INTEGER, literal_count);
        }
    }

    public static SubLObject problem_query_term_signature_estimated_size(final SubLObject problem_query) {
        final SubLObject literal_count = inference_datastructures_problem.problem_query_literal_count(problem_query, UNPROVIDED);
        return add(THREE_INTEGER, literal_count);
    }

    public static final SubLObject formula_term_signature_visit_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((NIL != v_object) && v_object.isAtom()) {
                dictionary_utilities.dictionary_increment($formula_term_signature_counts$.getDynamicValue(thread), v_object, UNPROVIDED);
            }
            return NIL;
        }
    }

    public static SubLObject formula_term_signature_visit(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != v_object) && v_object.isAtom()) {
            dictionary_utilities.dictionary_increment($formula_term_signature_counts$.getDynamicValue(thread), v_object, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject postprocess_formula_term_signature_alt(SubLObject counts_map) {
        {
            SubLObject alist = dictionary_utilities.dictionary_to_alist(counts_map);
            SubLObject var0 = variables.get_variable(ZERO_INTEGER);
            SubLObject cdolist_list_var = alist;
            SubLObject tuple = NIL;
            for (tuple = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tuple = cdolist_list_var.first()) {
                if (NIL != variables.variable_p(tuple.first())) {
                    rplaca(tuple, var0);
                }
            }
            alist = Sort.sort(alist, symbol_function($sym35$TERM__), symbol_function(CAR));
            alist = Sort.stable_sort(alist, symbol_function($sym37$_), symbol_function(CDR));
            return list_utilities.alist_to_plist(alist);
        }
    }

    public static SubLObject postprocess_formula_term_signature(final SubLObject counts_map) {
        SubLObject alist = dictionary_utilities.dictionary_to_alist(counts_map);
        final SubLObject var0 = variables.get_variable(ZERO_INTEGER);
        SubLObject cdolist_list_var = alist;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != variables.variable_p(tuple.first())) {
                rplaca(tuple, var0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        alist = Sort.sort(alist, symbol_function($sym35$TERM__), symbol_function(CAR));
        alist = Sort.stable_sort(alist, symbol_function($sym37$_), symbol_function(CDR));
        return list_utilities.alist_to_plist(alist);
    }

    public static SubLObject declare_inference_datastructures_problem_query_file() {
        declareFunction("hl_contextualized_asent_p", "HL-CONTEXTUALIZED-ASENT-P", 1, 0, false);
        declareFunction("inference_context_spec_p", "INFERENCE-CONTEXT-SPEC-P", 1, 0, false);
        declareFunction("make_contextualized_asent", "MAKE-CONTEXTUALIZED-ASENT", 2, 0, false);
        declareFunction("contextualized_asent_mt", "CONTEXTUALIZED-ASENT-MT", 1, 0, false);
        declareFunction("contextualized_asent_asent", "CONTEXTUALIZED-ASENT-ASENT", 1, 0, false);
        declareFunction("contextualized_asent_predicate", "CONTEXTUALIZED-ASENT-PREDICATE", 1, 0, false);
        declareFunction("contextualized_dnf_clause_p", "CONTEXTUALIZED-DNF-CLAUSE-P", 1, 0, false);
        declareMacro("do_contextualized_clause_literals", "DO-CONTEXTUALIZED-CLAUSE-LITERALS");
        declareFunction("contextualized_clause_has_literal_with_predicateP", "CONTEXTUALIZED-CLAUSE-HAS-LITERAL-WITH-PREDICATE?", 2, 0, false);
        declareFunction("mt_asent_sense_from_atomic_contextualized_clause", "MT-ASENT-SENSE-FROM-ATOMIC-CONTEXTUALIZED-CLAUSE", 1, 0, false);
        declareFunction("contextualized_dnf_clauses_p", "CONTEXTUALIZED-DNF-CLAUSES-P", 1, 0, false);
        declareMacro("do_contextualized_clauses_literals", "DO-CONTEXTUALIZED-CLAUSES-LITERALS");
        declareFunction("sole_contextualized_asent_from_contextualized_clauses", "SOLE-CONTEXTUALIZED-ASENT-FROM-CONTEXTUALIZED-CLAUSES", 1, 0, false);
        declareFunction("sole_contextualized_clause_from_singleton_contextualized_clauses", "SOLE-CONTEXTUALIZED-CLAUSE-FROM-SINGLETON-CONTEXTUALIZED-CLAUSES", 1, 0, false);
        declareFunction("problem_query_p", "PROBLEM-QUERY-P", 1, 0, false);
        declareFunction("explanatory_subquery_spec_p", "EXPLANATORY-SUBQUERY-SPEC-P", 1, 0, false);
        declareFunction("non_explanatory_subquery_spec_p", "NON-EXPLANATORY-SUBQUERY-SPEC-P", 1, 0, false);
        declareFunction("new_problem_query_from_contextualized_clause", "NEW-PROBLEM-QUERY-FROM-CONTEXTUALIZED-CLAUSE", 1, 0, false);
        declareFunction("new_problem_query_without_literal", "NEW-PROBLEM-QUERY-WITHOUT-LITERAL", 3, 0, false);
        declareFunction("new_problem_query_from_subclause_spec", "NEW-PROBLEM-QUERY-FROM-SUBCLAUSE-SPEC", 2, 0, false);
        declareFunction("new_problem_query_without_subclause_spec", "NEW-PROBLEM-QUERY-WITHOUT-SUBCLAUSE-SPEC", 2, 0, false);
        declareFunction("new_problem_query_from_contextualized_asent_sense", "NEW-PROBLEM-QUERY-FROM-CONTEXTUALIZED-ASENT-SENSE", 2, 0, false);
        declareFunction("new_problem_query_from_mt_asent_sense", "NEW-PROBLEM-QUERY-FROM-MT-ASENT-SENSE", 3, 0, false);
        declareMacro("do_problem_query_literals", "DO-PROBLEM-QUERY-LITERALS");
        declareFunction("problem_query_in_equality_reasoning_domainP", "PROBLEM-QUERY-IN-EQUALITY-REASONING-DOMAIN?", 2, 0, false);
        declareFunction("problem_query_variables", "PROBLEM-QUERY-VARIABLES", 1, 0, false);
        declareFunction("single_clause_problem_query_p", "SINGLE-CLAUSE-PROBLEM-QUERY-P", 1, 0, false);
        declareFunction("sole_contextualized_clause_from_single_clause_problem_query", "SOLE-CONTEXTUALIZED-CLAUSE-FROM-SINGLE-CLAUSE-PROBLEM-QUERY", 1, 0, false);
        declareFunction("single_literal_problem_query_p", "SINGLE-LITERAL-PROBLEM-QUERY-P", 1, 0, false);
        declareFunction("problem_query_has_single_literal_p", "PROBLEM-QUERY-HAS-SINGLE-LITERAL-P", 1, 0, false);
        declareFunction("asent_sense_and_mt_to_problem_query", "ASENT-SENSE-AND-MT-TO-PROBLEM-QUERY", 3, 0, false);
        declareFunction("single_literal_problem_query_sense", "SINGLE-LITERAL-PROBLEM-QUERY-SENSE", 1, 0, false);
        declareFunction("single_literal_problem_query_mt", "SINGLE-LITERAL-PROBLEM-QUERY-MT", 1, 0, false);
        declareFunction("single_literal_problem_query_atomic_sentence", "SINGLE-LITERAL-PROBLEM-QUERY-ATOMIC-SENTENCE", 1, 0, false);
        declareFunction("single_literal_problem_query_predicate", "SINGLE-LITERAL-PROBLEM-QUERY-PREDICATE", 1, 0, false);
        declareFunction("mt_asent_sense_from_singleton_query", "MT-ASENT-SENSE-FROM-SINGLETON-QUERY", 1, 0, false);
        declareFunction("formula_term_signature", "FORMULA-TERM-SIGNATURE", 1, 1, false);
        declareFunction("problem_query_term_signature", "PROBLEM-QUERY-TERM-SIGNATURE", 1, 0, false);
        declareFunction("problem_query_term_signature_estimated_size", "PROBLEM-QUERY-TERM-SIGNATURE-ESTIMATED-SIZE", 1, 0, false);
        declareFunction("formula_term_signature_visit", "FORMULA-TERM-SIGNATURE-VISIT", 1, 0, false);
        new inference_datastructures_problem_query.$formula_term_signature_visit$UnaryFunction();
        declareFunction("postprocess_formula_term_signature", "POSTPROCESS-FORMULA-TERM-SIGNATURE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_datastructures_problem_query_file() {
        defparameter("*FORMULA-TERM-SIGNATURE-COUNTS*", NIL);
        return NIL;
    }

    public static SubLObject setup_inference_datastructures_problem_query_file() {
        note_funcall_helper_function(FORMULA_TERM_SIGNATURE_VISIT);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_inference_datastructures_problem_query_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_datastructures_problem_query_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_datastructures_problem_query_file();
    }

    static {
    }

    public static final class $formula_term_signature_visit$UnaryFunction extends UnaryFunction {
        public $formula_term_signature_visit$UnaryFunction() {
            super(extractFunctionNamed("FORMULA-TERM-SIGNATURE-VISIT"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return formula_term_signature_visit(arg1);
        }
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(list(makeSymbol("ASENT-VAR"), makeSymbol("MT-VAR"), makeSymbol("SENSE-VAR"), makeSymbol("CONTEXTUALIZED-CLAUSE"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt1 = list(makeKeyword("INDEX"), $DONE);

    static private final SubLList $list_alt11 = list(makeKeyword("NEG"));

    static private final SubLList $list_alt14 = list(makeKeyword("POS"));

    static private final SubLList $list_alt16 = list(makeSymbol("MT"), makeSymbol("ASENT"));

    static private final SubLString $str_alt19$_a_was_not_an_atomic_contextualiz = makeString("~a was not an atomic contextualized-clause");

    static private final SubLList $list_alt20 = list(list(makeSymbol("ASENT-VAR"), makeSymbol("MT-VAR"), makeSymbol("SENSE-VAR"), makeSymbol("QUERY"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt21 = list($DONE);

    static private final SubLString $str_alt31$Unexpected_equality_reasoning_dom = makeString("Unexpected equality reasoning domain ~a");
}

/**
 * Total time: 229 ms
 */
