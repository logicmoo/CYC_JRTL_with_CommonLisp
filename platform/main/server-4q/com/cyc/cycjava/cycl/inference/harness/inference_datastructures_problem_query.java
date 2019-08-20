package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.variables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_datastructures_problem_query extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "8a090912a0eaaeed9fdbfe35d7574ad773ec3b0ac212544d0b39086a3b4e5108";
    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 11000L)
    private static SubLSymbol $formula_term_signature_counts$;
    private static SubLList $list0;
    private static SubLList $list1;
    private static SubLSymbol $ALLOW_OTHER_KEYS;
    private static SubLSymbol $INDEX;
    private static SubLSymbol $DONE;
    private static SubLSymbol $sym5$INDEX_VAR;
    private static SubLSymbol $sym6$DO_CONTEXTUALIZED_CLAUSE_LITERALS;
    private static SubLSymbol $sym7$IGNORE;
    private static SubLSymbol $sym8$CONTEXTUALIZED_ASENT;
    private static SubLSymbol $sym9$PROGN;
    private static SubLSymbol $sym10$CLET;
    private static SubLList $list11;
    private static SubLSymbol $sym12$DO_NEG_LITS_NUMBERED;
    private static SubLSymbol $sym13$DESTRUCTURE_CONTEXTUALIZED_ASENT;
    private static SubLList $list14;
    private static SubLSymbol $sym15$DO_POS_LITS_NUMBERED;
    private static SubLList $list16;
    private static SubLSymbol $POS;
    private static SubLSymbol $NEG;
    private static SubLString $str19$_a_was_not_an_atomic_contextualiz;
    private static SubLList $list20;
    private static SubLList $list21;
    private static SubLSymbol $sym22$CONTEXTUALIZED_CLAUSE;
    private static SubLSymbol $sym23$DO_CLAUSES;
    private static SubLSymbol $sym24$ATOMIC_CLAUSES_P;
    private static SubLSymbol $sym25$SINGLETON_;
    private static SubLSymbol $ALL;
    private static SubLSymbol $sym27$SUBCLAUSE_SPEC_P;
    private static SubLSymbol $sym28$DO_CONTEXTUALIZED_CLAUSES_LITERALS;
    private static SubLSymbol $NONE;
    private static SubLSymbol $SINGLE_LITERAL;
    private static SubLString $str31$Unexpected_equality_reasoning_dom;
    private static SubLSymbol $sym32$HL_VARIABLE_P;
    private static SubLSymbol $sym33$SINGLE_CLAUSE_PROBLEM_QUERY_P;
    private static SubLSymbol $sym34$FORMULA_TERM_SIGNATURE_VISIT;
    private static SubLSymbol $sym35$TERM__;
    private static SubLSymbol $sym36$CAR;
    private static SubLSymbol $sym37$_;
    private static SubLSymbol $sym38$CDR;

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 800L)
    public static SubLObject hl_contextualized_asent_p(SubLObject v_object) {
        return makeBoolean(v_object.isCons() && NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED) && NIL != inference_context_spec_p(v_object.first()) && NIL != el_utilities.possibly_sentence_p(conses_high.second(v_object)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 1200L)
    public static SubLObject inference_context_spec_p(SubLObject v_object) {
        return hlmt.possibly_hlmt_p(v_object);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 1300L)
    public static SubLObject make_contextualized_asent(SubLObject mt, SubLObject asent) {
        return list(mt, asent);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 1400L)
    public static SubLObject contextualized_asent_mt(SubLObject contextualized_asent) {
        return contextualized_asent.first();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 1500L)
    public static SubLObject contextualized_asent_asent(SubLObject contextualized_asent) {
        return conses_high.second(contextualized_asent);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 1600L)
    public static SubLObject contextualized_asent_predicate(SubLObject contextualized_asent) {
        return cycl_utilities.atomic_sentence_predicate(contextualized_asent_asent(contextualized_asent));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 1800L)
    public static SubLObject contextualized_dnf_clause_p(SubLObject v_object) {
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

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 2100L)
    public static SubLObject do_contextualized_clause_literals(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject asent_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject sense_var = NIL;
        SubLObject contextualized_clause = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
        asent_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
        sense_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list0);
        contextualized_clause = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list0);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list0);
            if (NIL == conses_high.member(current_$1, $list1, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list0);
        }
        SubLObject index_tail = cdestructuring_bind.property_list_member($INDEX, current);
        SubLObject index = (NIL != index_tail) ? conses_high.cadr(index_tail) : NIL;
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        if (NIL == index) {
            SubLObject index_var = $sym5$INDEX_VAR;
            return listS($sym6$DO_CONTEXTUALIZED_CLAUSE_LITERALS, list(asent_var, mt_var, sense_var, contextualized_clause, $INDEX, index_var, $DONE, done), list($sym7$IGNORE, index_var), append(body, NIL));
        }
        SubLObject contextualized_asent = $sym8$CONTEXTUALIZED_ASENT;
        return list($sym9$PROGN,
                list($sym10$CLET, list(reader.bq_cons(sense_var, $list11)), list($sym12$DO_NEG_LITS_NUMBERED, list(contextualized_asent, index, contextualized_clause, $DONE, done), listS($sym13$DESTRUCTURE_CONTEXTUALIZED_ASENT, list(mt_var, asent_var), contextualized_asent, append(body, NIL)))),
                list($sym10$CLET, list(reader.bq_cons(sense_var, $list14)), list($sym15$DO_POS_LITS_NUMBERED, list(contextualized_asent, index, contextualized_clause, $DONE, done), listS($sym13$DESTRUCTURE_CONTEXTUALIZED_ASENT, list(mt_var, asent_var), contextualized_asent, append(body, NIL)))));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 3000L)
    public static SubLObject contextualized_clause_has_literal_with_predicateP(SubLObject contextualized_clause, SubLObject predicate) {
        SubLObject cdolist_list_var = clauses.neg_lits(contextualized_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = contextualized_asent;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, predicate)) {
                    return T;
                }
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list16);
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        cdolist_list_var = clauses.pos_lits(contextualized_clause);
        contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            SubLObject datum = current = contextualized_asent;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if (NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, predicate)) {
                    return T;
                }
            } else {
                cdestructuring_bind.cdestructuring_bind_error(datum, $list16);
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 3300L)
    public static SubLObject mt_asent_sense_from_atomic_contextualized_clause(SubLObject contextualized_clause) {
        if (NIL != clause_utilities.pos_atomic_clause_p(contextualized_clause)) {
            SubLObject contextualized_asent = clause_utilities.atomic_clause_asent(contextualized_clause);
            SubLObject current;
            SubLObject datum = current = contextualized_asent;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                return subl_promotions.values3(mt, asent, $POS);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, $list16);
        } else if (NIL != clause_utilities.neg_atomic_clause_p(contextualized_clause)) {
            SubLObject contextualized_asent = clause_utilities.atomic_clause_asent(contextualized_clause);
            SubLObject current;
            SubLObject datum = current = contextualized_asent;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                return subl_promotions.values3(mt, asent, $NEG);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, $list16);
        } else {
            Errors.error($str19$_a_was_not_an_atomic_contextualiz, contextualized_clause);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 4000L)
    public static SubLObject contextualized_dnf_clauses_p(SubLObject v_object) {
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

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 4400L)
    public static SubLObject do_contextualized_clauses_literals(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list20);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject asent_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject sense_var = NIL;
        SubLObject query = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list20);
        asent_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list20);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list20);
        sense_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list20);
        query = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list20);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list20);
            if (NIL == conses_high.member(current_$2, $list21, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list20);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        SubLObject contextualized_clause = $sym22$CONTEXTUALIZED_CLAUSE;
        return list($sym23$DO_CLAUSES, list(contextualized_clause, query, $DONE, done), listS($sym6$DO_CONTEXTUALIZED_CLAUSE_LITERALS, list(asent_var, mt_var, sense_var, contextualized_clause), append(body, NIL)));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 4700L)
    public static SubLObject sole_contextualized_asent_from_contextualized_clauses(SubLObject contextualized_clauses) {
        assert NIL != clause_utilities.atomic_clauses_p(contextualized_clauses) : contextualized_clauses;
        SubLObject contextualized_clause = sole_contextualized_clause_from_singleton_contextualized_clauses(contextualized_clauses);
        return clause_utilities.atomic_clause_asent(contextualized_clause);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 5000L)
    public static SubLObject sole_contextualized_clause_from_singleton_contextualized_clauses(SubLObject contextualized_clauses) {
        assert NIL != list_utilities.singletonP(contextualized_clauses) : contextualized_clauses;
        return contextualized_clauses.first();
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 5200L)
    public static SubLObject problem_query_p(SubLObject v_object) {
        return contextualized_dnf_clauses_p(v_object);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 5500L)
    public static SubLObject explanatory_subquery_spec_p(SubLObject v_object) {
        return makeBoolean($ALL == v_object || NIL != problem_query_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 5600L)
    public static SubLObject non_explanatory_subquery_spec_p(SubLObject v_object) {
        return makeBoolean(NIL == v_object || NIL != problem_query_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 5700L)
    public static SubLObject new_problem_query_from_contextualized_clause(SubLObject contextualized_clause) {
        return list(contextualized_clause);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 5900L)
    public static SubLObject new_problem_query_without_literal(SubLObject clause, SubLObject sense, SubLObject index) {
        return new_problem_query_from_contextualized_clause(clauses.clause_without_literal(clause, sense, index));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 6000L)
    public static SubLObject new_problem_query_from_subclause_spec(SubLObject contextualized_clause, SubLObject subclause_spec) {
        assert NIL != clause_utilities.subclause_spec_p(subclause_spec) : subclause_spec;
        SubLObject contextualized_subclause = clause_utilities.subclause_specified_by_spec(contextualized_clause, subclause_spec);
        return new_problem_query_from_contextualized_clause(contextualized_subclause);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 6400L)
    public static SubLObject new_problem_query_without_subclause_spec(SubLObject contextualized_clause, SubLObject subclause_spec) {
        assert NIL != clause_utilities.subclause_spec_p(subclause_spec) : subclause_spec;
        SubLObject contextualized_subclause = clause_utilities.complement_of_subclause_specified_by_spec(contextualized_clause, subclause_spec);
        return new_problem_query_from_contextualized_clause(contextualized_subclause);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 6700L)
    public static SubLObject new_problem_query_from_contextualized_asent_sense(SubLObject contextualized_asent, SubLObject sense) {
        if (sense.eql($POS)) {
            return new_problem_query_from_contextualized_clause(clauses.make_clause(NIL, list(contextualized_asent)));
        }
        if (sense.eql($NEG)) {
            return new_problem_query_from_contextualized_clause(clauses.make_clause(list(contextualized_asent), NIL));
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 7100L)
    public static SubLObject new_problem_query_from_mt_asent_sense(SubLObject mt, SubLObject asent, SubLObject sense) {
        SubLObject contextualized_asent = make_contextualized_asent(mt, asent);
        return new_problem_query_from_contextualized_asent_sense(contextualized_asent, sense);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 7300L)
    public static SubLObject do_problem_query_literals(SubLObject macroform, SubLObject environment) {
        SubLObject current;
        SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list20);
        SubLObject temp = current.rest();
        current = current.first();
        SubLObject asent_var = NIL;
        SubLObject mt_var = NIL;
        SubLObject sense_var = NIL;
        SubLObject query = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list20);
        asent_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list20);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list20);
        sense_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list20);
        query = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list20);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list20);
            if (NIL == conses_high.member(current_$3, $list21, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (NIL != bad && NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list20);
        }
        SubLObject done_tail = cdestructuring_bind.property_list_member($DONE, current);
        SubLObject done = (NIL != done_tail) ? conses_high.cadr(done_tail) : NIL;
        SubLObject body;
        current = (body = temp);
        return listS($sym28$DO_CONTEXTUALIZED_CLAUSES_LITERALS, list(asent_var, mt_var, sense_var, query, $DONE, done), append(body, NIL));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 7500L)
    public static SubLObject problem_query_in_equality_reasoning_domainP(SubLObject query, SubLObject equality_reasoning_domain) {
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

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 7900L)
    public static SubLObject problem_query_variables(SubLObject query) {
        return cycl_utilities.expression_gather(query, $sym32$HL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 8000L)
    public static SubLObject single_clause_problem_query_p(SubLObject v_object) {
        return makeBoolean(NIL != problem_query_p(v_object) && NIL != list_utilities.singletonP(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 8200L)
    public static SubLObject sole_contextualized_clause_from_single_clause_problem_query(SubLObject problem_query) {
        assert NIL != single_clause_problem_query_p(problem_query) : problem_query;
        return sole_contextualized_clause_from_singleton_contextualized_clauses(problem_query);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 8500L)
    public static SubLObject single_literal_problem_query_p(SubLObject v_object) {
        return makeBoolean(NIL != problem_query_p(v_object) && NIL != problem_query_has_single_literal_p(v_object));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 8900L)
    public static SubLObject problem_query_has_single_literal_p(SubLObject problem_query) {
        return makeBoolean(NIL != list_utilities.singletonP(problem_query) && NIL != clauses.atomic_clause_p(problem_query.first()));
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 9200L)
    public static SubLObject asent_sense_and_mt_to_problem_query(SubLObject asent, SubLObject sense, SubLObject mt) {
        SubLObject truth = enumeration_types.sense_truth(sense);
        SubLObject dnf = clause_utilities.make_gaf_dnf_with_truth(asent, truth);
        SubLObject contextualized_clause = inference_czer.contextualize_clause(dnf, mt, UNPROVIDED);
        return list(contextualized_clause);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 9600L)
    public static SubLObject single_literal_problem_query_sense(SubLObject query) {
        if (NIL != clause_utilities.pos_atomic_clauses_p(query)) {
            return $POS;
        }
        return $NEG;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 9800L)
    public static SubLObject single_literal_problem_query_mt(SubLObject query) {
        SubLObject dnf_clause = query.first();
        SubLObject contextualized_asent = clause_utilities.atomic_clause_asent(dnf_clause);
        SubLObject current;
        SubLObject datum = current = contextualized_asent;
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
        asent = current.first();
        current = current.rest();
        if (NIL == current) {
            return mt;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, $list16);
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 10100L)
    public static SubLObject single_literal_problem_query_atomic_sentence(SubLObject query) {
        SubLObject dnf_clause = query.first();
        SubLObject contextualized_asent = clause_utilities.atomic_clause_asent(dnf_clause);
        if (NIL != contextualized_asent) {
            SubLObject current;
            SubLObject datum = current = contextualized_asent;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                return asent;
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, $list16);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 10400L)
    public static SubLObject single_literal_problem_query_predicate(SubLObject query) {
        SubLObject asent = single_literal_problem_query_atomic_sentence(query);
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        return predicate;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 10700L)
    public static SubLObject mt_asent_sense_from_singleton_query(SubLObject query) {
        SubLObject clause = query.first();
        return mt_asent_sense_from_atomic_contextualized_clause(clause);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 11200L)
    public static SubLObject formula_term_signature(SubLObject formula, SubLObject signature_size) {
        if (signature_size == UNPROVIDED) {
            signature_size = ZERO_INTEGER;
        }
        SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject _prev_bind_0 = $formula_term_signature_counts$.currentBinding(thread);
        try {
            $formula_term_signature_counts$.bind(dictionary.new_dictionary(Symbols.symbol_function(EQUAL), signature_size), thread);
            list_utilities.tree_map($sym34$FORMULA_TERM_SIGNATURE_VISIT, formula, UNPROVIDED);
            result = postprocess_formula_term_signature($formula_term_signature_counts$.getDynamicValue(thread));
        } finally {
            $formula_term_signature_counts$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 11800L)
    public static SubLObject problem_query_term_signature(SubLObject problem_query) {
        SubLObject estimated_size = problem_query_term_signature_estimated_size(problem_query);
        return formula_term_signature(problem_query, estimated_size);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 12400L)
    public static SubLObject problem_query_term_signature_estimated_size(SubLObject problem_query) {
        SubLObject literal_count = inference_datastructures_problem.problem_query_literal_count(problem_query, UNPROVIDED);
        return Numbers.add(THREE_INTEGER, literal_count);
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 12700L)
    public static SubLObject formula_term_signature_visit(SubLObject v_object) {
        SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != v_object && v_object.isAtom()) {
            dictionary_utilities.dictionary_increment($formula_term_signature_counts$.getDynamicValue(thread), v_object, UNPROVIDED);
        }
        return NIL;
    }

    @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 12900L)
    public static SubLObject postprocess_formula_term_signature(SubLObject counts_map) {
        SubLObject alist = dictionary_utilities.dictionary_to_alist(counts_map);
        SubLObject var0 = variables.get_variable(ZERO_INTEGER);
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
        alist = Sort.sort(alist, Symbols.symbol_function($sym35$TERM__), Symbols.symbol_function($sym36$CAR));
        alist = Sort.stable_sort(alist, Symbols.symbol_function($sym37$_), Symbols.symbol_function($sym38$CDR));
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
        new $formula_term_signature_visit$UnaryFunction();
        declareFunction("postprocess_formula_term_signature", "POSTPROCESS-FORMULA-TERM-SIGNATURE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_inference_datastructures_problem_query_file() {
        $formula_term_signature_counts$ = defparameter("*FORMULA-TERM-SIGNATURE-COUNTS*", NIL);
        return NIL;
    }

    public static SubLObject setup_inference_datastructures_problem_query_file() {
        utilities_macros.note_funcall_helper_function($sym34$FORMULA_TERM_SIGNATURE_VISIT);
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
        me = new inference_datastructures_problem_query();
        $formula_term_signature_counts$ = null;
        $list0 = list(list(makeSymbol("ASENT-VAR"), makeSymbol("MT-VAR"), makeSymbol("SENSE-VAR"), makeSymbol("CONTEXTUALIZED-CLAUSE"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list1 = list(makeKeyword("INDEX"), makeKeyword("DONE"));
        $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
        $INDEX = makeKeyword("INDEX");
        $DONE = makeKeyword("DONE");
        $sym5$INDEX_VAR = makeUninternedSymbol("INDEX-VAR");
        $sym6$DO_CONTEXTUALIZED_CLAUSE_LITERALS = makeSymbol("DO-CONTEXTUALIZED-CLAUSE-LITERALS");
        $sym7$IGNORE = makeSymbol("IGNORE");
        $sym8$CONTEXTUALIZED_ASENT = makeUninternedSymbol("CONTEXTUALIZED-ASENT");
        $sym9$PROGN = makeSymbol("PROGN");
        $sym10$CLET = makeSymbol("CLET");
        $list11 = list(makeKeyword("NEG"));
        $sym12$DO_NEG_LITS_NUMBERED = makeSymbol("DO-NEG-LITS-NUMBERED");
        $sym13$DESTRUCTURE_CONTEXTUALIZED_ASENT = makeSymbol("DESTRUCTURE-CONTEXTUALIZED-ASENT");
        $list14 = list(makeKeyword("POS"));
        $sym15$DO_POS_LITS_NUMBERED = makeSymbol("DO-POS-LITS-NUMBERED");
        $list16 = list(makeSymbol("MT"), makeSymbol("ASENT"));
        $POS = makeKeyword("POS");
        $NEG = makeKeyword("NEG");
        $str19$_a_was_not_an_atomic_contextualiz = makeString("~a was not an atomic contextualized-clause");
        $list20 = list(list(makeSymbol("ASENT-VAR"), makeSymbol("MT-VAR"), makeSymbol("SENSE-VAR"), makeSymbol("QUERY"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
        $list21 = list(makeKeyword("DONE"));
        $sym22$CONTEXTUALIZED_CLAUSE = makeUninternedSymbol("CONTEXTUALIZED-CLAUSE");
        $sym23$DO_CLAUSES = makeSymbol("DO-CLAUSES");
        $sym24$ATOMIC_CLAUSES_P = makeSymbol("ATOMIC-CLAUSES-P");
        $sym25$SINGLETON_ = makeSymbol("SINGLETON?");
        $ALL = makeKeyword("ALL");
        $sym27$SUBCLAUSE_SPEC_P = makeSymbol("SUBCLAUSE-SPEC-P");
        $sym28$DO_CONTEXTUALIZED_CLAUSES_LITERALS = makeSymbol("DO-CONTEXTUALIZED-CLAUSES-LITERALS");
        $NONE = makeKeyword("NONE");
        $SINGLE_LITERAL = makeKeyword("SINGLE-LITERAL");
        $str31$Unexpected_equality_reasoning_dom = makeString("Unexpected equality reasoning domain ~a");
        $sym32$HL_VARIABLE_P = makeSymbol("HL-VARIABLE-P");
        $sym33$SINGLE_CLAUSE_PROBLEM_QUERY_P = makeSymbol("SINGLE-CLAUSE-PROBLEM-QUERY-P");
        $sym34$FORMULA_TERM_SIGNATURE_VISIT = makeSymbol("FORMULA-TERM-SIGNATURE-VISIT");
        $sym35$TERM__ = makeSymbol("TERM-<");
        $sym36$CAR = makeSymbol("CAR");
        $sym37$_ = makeSymbol(">");
        $sym38$CDR = makeSymbol("CDR");
    }

    public static class $formula_term_signature_visit$UnaryFunction extends UnaryFunction {
        public $formula_term_signature_visit$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORMULA-TERM-SIGNATURE-VISIT"));
        }

        @Override
        public SubLObject processItem(SubLObject arg1) {
            return formula_term_signature_visit(arg1);
        }
    }
}
/*
 *
 * Total time: 229 ms
 *
 */