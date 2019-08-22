package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class clause_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new clause_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.clause_utilities";

    public static final String myFingerPrint = "353dc36d5fd951962470191f751993be17d78f307af6ae25f4542b4a0bf4b416";

    // Internal Constants
    public static final SubLList $list0 = list(list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS")), makeSymbol("CLAUSE"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list2 = list(list(makeSymbol("ASENT"), makeSymbol("SENSE"), makeSymbol("CLAUSE"), makeSymbol("SUBCLAUSE-SPEC")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym3$INDEX = makeUninternedSymbol("INDEX");

    public static final SubLSymbol DO_LITERALS_NUMBERED = makeSymbol("DO-LITERALS-NUMBERED");



    public static final SubLSymbol $sym6$INDEX_AND_SENSE_MATCH_SUBCLAUSE_SPEC_ = makeSymbol("INDEX-AND-SENSE-MATCH-SUBCLAUSE-SPEC?");

    public static final SubLSymbol $sym7$INDEX = makeUninternedSymbol("INDEX");



    public static final SubLList $list9 = list(list(makeSymbol("MT"), makeSymbol("ASENT")), makeSymbol("CONTEXTUALIZED-ASENT"), makeSymbol("&BODY"), makeSymbol("BODY"));







    public static final SubLList $list13 = list(makeKeyword("CNF"), makeKeyword("DNF"));

    public static final SubLSymbol $sym14$CYC_VAR_ = makeSymbol("CYC-VAR?");





    private static final SubLString $str17$_a_was_not_an_atomic_clause = makeString("~a was not an atomic clause");

    private static final SubLList $list18 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));

    private static final SubLSymbol NEGATE_CLAUSE = makeSymbol("NEGATE-CLAUSE");

    private static final SubLSymbol NEGATE_ATOMIC = makeSymbol("NEGATE-ATOMIC");

    private static final SubLList $list21 = list(makeSymbol("MT"), makeSymbol("LITERAL"));

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    private static final SubLSymbol CONTEXTUALIZED_LITERAL_TO_IST_SENTENCE = makeSymbol("CONTEXTUALIZED-LITERAL-TO-IST-SENTENCE");

    private static final SubLSymbol NEGATE = makeSymbol("NEGATE");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));



    private static final SubLObject $$or = reader_make_constant_shell(makeString("or"));

    private static final SubLSymbol CONTEXTUALIZED_DNF_FORMULA = makeSymbol("CONTEXTUALIZED-DNF-FORMULA");

    private static final SubLSymbol CONTEXTUALIZED_ASENT_ASENT = makeSymbol("CONTEXTUALIZED-ASENT-ASENT");

    private static final SubLSymbol DECONTEXTUALIZE_CONTEXTUALIZED_CLAUSE = makeSymbol("DECONTEXTUALIZE-CONTEXTUALIZED-CLAUSE");





    public static final SubLSymbol $sym33$_ = makeSymbol("<");

    private static final SubLList $list34 = list(makeSymbol("NEG-INDICES"), makeSymbol("POS-INDICES"));

    private static final SubLSymbol $sym35$_ = makeSymbol("=");

    public static SubLObject destructure_clause(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject neg_lits = NIL;
        SubLObject pos_lits = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        neg_lits = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        pos_lits = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject clause = NIL;
            destructuring_bind_must_consp(current, datum, $list0);
            clause = current.first();
            final SubLObject body;
            current = body = current.rest();
            return listS(CDESTRUCTURING_BIND, list(neg_lits, pos_lits), clause, append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static SubLObject do_subclause_spec(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject asent = NIL;
        SubLObject sense = NIL;
        SubLObject clause = NIL;
        SubLObject subclause_spec = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        sense = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        clause = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        subclause_spec = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject index = $sym3$INDEX;
            return list(DO_LITERALS_NUMBERED, list(asent, index, sense, clause), listS(PWHEN, list($sym6$INDEX_AND_SENSE_MATCH_SUBCLAUSE_SPEC_, index, sense, subclause_spec), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list2);
        return NIL;
    }

    public static SubLObject do_subclause_spec_complement(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject asent = NIL;
        SubLObject sense = NIL;
        SubLObject clause = NIL;
        SubLObject subclause_spec = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        sense = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        clause = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        subclause_spec = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject index = $sym7$INDEX;
            return list(DO_LITERALS_NUMBERED, list(asent, index, sense, clause), listS(PUNLESS, list($sym6$INDEX_AND_SENSE_MATCH_SUBCLAUSE_SPEC_, index, sense, subclause_spec), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list2);
        return NIL;
    }

    public static SubLObject destructure_contextualized_asent(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        asent = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject contextualized_asent = NIL;
            destructuring_bind_must_consp(current, datum, $list9);
            contextualized_asent = current.first();
            final SubLObject body;
            current = body = current.rest();
            return listS(CDESTRUCTURING_BIND, list(mt, asent), contextualized_asent, append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list9);
        return NIL;
    }

    public static SubLObject remake_clause(final SubLObject neg_lits, final SubLObject pos_lits, final SubLObject clause) {
        if (neg_lits.eql(clauses.neg_lits(clause)) && pos_lits.eql(clauses.pos_lits(clause))) {
            return clause;
        }
        return clauses.make_clause(neg_lits, pos_lits);
    }

    public static SubLObject nmake_clause(final SubLObject neg_lits, final SubLObject pos_lits, final SubLObject clause) {
        if (!neg_lits.eql(clauses.neg_lits(clause))) {
            set_nth(ZERO_INTEGER, clause, neg_lits);
        }
        if (!pos_lits.eql(clauses.pos_lits(clause))) {
            set_nth(ONE_INTEGER, clause, pos_lits);
        }
        return clause;
    }

    public static SubLObject remake_cnf(final SubLObject neg_lits, final SubLObject pos_lits, final SubLObject cnf) {
        return remake_clause(neg_lits, pos_lits, cnf);
    }

    public static SubLObject make_gaf_cnf(final SubLObject asent) {
        return clauses.make_cnf(NIL, list(asent));
    }

    public static SubLObject make_false_gaf_cnf(final SubLObject asent) {
        return clauses.make_cnf(list(asent), NIL);
    }

    public static SubLObject make_gaf_dnf(final SubLObject asent) {
        return clauses.make_dnf(NIL, list(asent));
    }

    public static SubLObject make_false_gaf_dnf(final SubLObject asent) {
        return clauses.make_dnf(list(asent), NIL);
    }

    public static SubLObject make_gaf_cnf_with_truth(final SubLObject literal, final SubLObject truth) {
        return $TRUE == truth ? make_gaf_cnf(literal) : make_false_gaf_cnf(literal);
    }

    public static SubLObject make_gaf_dnf_with_truth(final SubLObject literal, final SubLObject truth) {
        return $TRUE == truth ? make_gaf_dnf(literal) : make_false_gaf_dnf(literal);
    }

    public static SubLObject remake_dnf(final SubLObject neg_lits, final SubLObject pos_lits, final SubLObject dnf) {
        return remake_clause(neg_lits, pos_lits, dnf);
    }

    public static SubLObject nmake_dnf(final SubLObject neg_lits, final SubLObject pos_lits, final SubLObject dnf) {
        return nmake_clause(neg_lits, pos_lits, dnf);
    }

    public static SubLObject asent_sense_to_literal(final SubLObject asent, final SubLObject sense) {
        assert NIL != enumeration_types.sense_p(sense) : "enumeration_types.sense_p(sense) " + "CommonSymbols.NIL != enumeration_types.sense_p(sense) " + sense;
        return $NEG == sense ? cycl_utilities.negate(asent) : asent;
    }

    public static SubLObject clausal_form_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $list13);
    }

    public static SubLObject clause_with_lit_counts_p(final SubLObject clause, final SubLObject neg_lit_count, final SubLObject pos_lit_count) {
        return makeBoolean(((NIL != clauses.clause_p(clause)) && (NIL != list_utilities.lengthE(clauses.neg_lits(clause), neg_lit_count, UNPROVIDED))) && (NIL != list_utilities.lengthE(clauses.pos_lits(clause), pos_lit_count, UNPROVIDED)));
    }

    public static SubLObject pos_atomic_cnf_p(final SubLObject cnf) {
        return makeBoolean((NIL != clauses.cnf_p(cnf)) && (NIL != clause_with_lit_counts_p(cnf, ZERO_INTEGER, ONE_INTEGER)));
    }

    public static SubLObject pos_atomic_clause_p(final SubLObject clause) {
        return clause_with_lit_counts_p(clause, ZERO_INTEGER, ONE_INTEGER);
    }

    public static SubLObject pos_atomic_cnf_with_pred_p(final SubLObject v_object, final SubLObject pred) {
        if (NIL != pos_atomic_cnf_p(v_object)) {
            final SubLObject asent = gaf_cnf_literal(v_object);
            return el_formula_with_operator_p(asent, pred);
        }
        return NIL;
    }

    public static SubLObject neg_atomic_cnf_p(final SubLObject cnf) {
        return makeBoolean((NIL != clauses.cnf_p(cnf)) && (NIL != clause_with_lit_counts_p(cnf, ONE_INTEGER, ZERO_INTEGER)));
    }

    public static SubLObject neg_atomic_clause_p(final SubLObject clause) {
        return clause_with_lit_counts_p(clause, ONE_INTEGER, ZERO_INTEGER);
    }

    public static SubLObject neg_atomic_cnf_with_pred_p(final SubLObject v_object, final SubLObject pred) {
        if (NIL != neg_atomic_cnf_p(v_object)) {
            final SubLObject asent = gaf_cnf_literal(v_object);
            return el_formula_with_operator_p(asent, pred);
        }
        return NIL;
    }

    public static SubLObject atomic_clause_with_all_var_argsP(final SubLObject clause) {
        if (NIL != clauses.atomic_clause_p(clause)) {
            final SubLObject asent = atomic_clause_asent(clause);
            final SubLObject asent_args = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
            if (NIL != list_utilities.every_in_list($sym14$CYC_VAR_, asent_args, UNPROVIDED)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject gaf_cnf_literal(final SubLObject cnf) {
        return clauses.pos_lits(cnf).first();
    }

    public static SubLObject literals_with_sense(final SubLObject clause, final SubLObject sense) {
        assert NIL != enumeration_types.sense_p(sense) : "enumeration_types.sense_p(sense) " + "CommonSymbols.NIL != enumeration_types.sense_p(sense) " + sense;
        if (sense.eql($POS)) {
            return clauses.pos_lits(clause);
        }
        if (sense.eql($NEG)) {
            return clauses.neg_lits(clause);
        }
        return NIL;
    }

    public static SubLObject atomic_cnf_asent(final SubLObject atomic_clause) {
        return NIL != pos_atomic_cnf_p(atomic_clause) ? clauses.pos_lits(atomic_clause).first() : clauses.neg_lits(atomic_clause).first();
    }

    public static SubLObject atomic_clause_asent(final SubLObject atomic_clause) {
        return NIL != pos_atomic_clause_p(atomic_clause) ? clauses.pos_lits(atomic_clause).first() : clauses.neg_lits(atomic_clause).first();
    }

    public static SubLObject atomic_cnf_predicate(final SubLObject atomic_clause) {
        final SubLObject asent = atomic_cnf_asent(atomic_clause);
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        return predicate;
    }

    public static SubLObject atomic_clause_predicate(final SubLObject atomic_clause) {
        final SubLObject asent = atomic_clause_asent(atomic_clause);
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        return predicate;
    }

    public static SubLObject asent_truth_from_atomic_clause(final SubLObject clause) {
        if (NIL != pos_atomic_clause_p(clause)) {
            final SubLObject asent = atomic_clause_asent(clause);
            return subl_promotions.values2(asent, $TRUE);
        }
        if (NIL != neg_atomic_clause_p(clause)) {
            final SubLObject asent = atomic_clause_asent(clause);
            return subl_promotions.values2(asent, $FALSE);
        }
        return Errors.error($str17$_a_was_not_an_atomic_clause, clause);
    }

    public static SubLObject negate_clause(final SubLObject clause) {
        SubLObject neg_lits = NIL;
        SubLObject pos_lits = NIL;
        destructuring_bind_must_consp(clause, clause, $list18);
        neg_lits = clause.first();
        SubLObject current = clause.rest();
        destructuring_bind_must_consp(current, clause, $list18);
        pos_lits = current.first();
        current = current.rest();
        if (NIL == current) {
            return clauses.make_clause(pos_lits, neg_lits);
        }
        cdestructuring_bind_error(clause, $list18);
        return NIL;
    }

    public static SubLObject negate_clauses(final SubLObject v_clauses) {
        return Mapping.mapcar(NEGATE_CLAUSE, v_clauses);
    }

    public static SubLObject atomic_clauses_p(final SubLObject v_object) {
        return makeBoolean((v_object.isCons() && (NIL != list_utilities.singletonP(v_object))) && (NIL != clauses.atomic_clause_p(v_object.first())));
    }

    public static SubLObject pos_atomic_clauses_p(final SubLObject v_object) {
        return makeBoolean((v_object.isCons() && (NIL != list_utilities.singletonP(v_object))) && (NIL != pos_atomic_clause_p(v_object.first())));
    }

    public static SubLObject neg_atomic_clauses_p(final SubLObject v_object) {
        return makeBoolean((v_object.isCons() && (NIL != list_utilities.singletonP(v_object))) && (NIL != neg_atomic_clause_p(v_object.first())));
    }

    public static SubLObject atomic_clauses_asent(final SubLObject atomic_clauses) {
        return atomic_clause_asent(atomic_clauses.first());
    }

    public static SubLObject atomic_clauses_predicate(final SubLObject atomic_clauses) {
        return atomic_clause_predicate(atomic_clauses.first());
    }

    public static SubLObject group_clauses_having_common_neg_lits(final SubLObject v_clauses, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        final SubLObject table = make_hash_table(length(v_clauses), test, UNPROVIDED);
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = NIL;
        clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            hash_table_utilities.push_hash(clauses.neg_lits(clause), clause, table);
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        } 
        return hash_table_utilities.hash_table_values(table);
    }

    public static SubLObject unmake_clause(final SubLObject clause) {
        return values(clauses.neg_lits(clause), clauses.pos_lits(clause));
    }

    public static SubLObject cnfP(final SubLObject v_object) {
        return clauseP(v_object, UNPROVIDED);
    }

    public static SubLObject clauseP(final SubLObject v_object, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym14$CYC_VAR_;
        }
        return makeBoolean(((v_object.isList() && length(v_object).numE(TWO_INTEGER)) && (NIL != literals_specP(v_object.first(), varP))) && (NIL != literals_specP(second(v_object), varP)));
    }

    public static SubLObject literals_specP(final SubLObject v_object, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym14$CYC_VAR_;
        }
        return makeBoolean((v_object.isList() && (NIL != literal_specP(v_object.first(), varP))) || (NIL != funcall(varP, v_object)));
    }

    public static SubLObject literal_specP(final SubLObject v_object, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym14$CYC_VAR_;
        }
        return makeBoolean((NIL != literalP(v_object)) || (NIL != funcall(varP, v_object)));
    }

    public static SubLObject clause_literals(final SubLObject clause) {
        return cconcatenate(Mapping.mapcar(NEGATE_ATOMIC, clauses.neg_lits(clause)), clauses.pos_lits(clause));
    }

    public static SubLObject cnf_literals(final SubLObject cnf) {
        return clause_literals(cnf);
    }

    public static SubLObject dnf_literals(final SubLObject dnf) {
        return clause_literals(dnf);
    }

    public static SubLObject clause_from_el_literals(final SubLObject el_literals) {
        SubLObject neg_lits = NIL;
        SubLObject pos_lits = NIL;
        SubLObject cdolist_list_var = el_literals;
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != cycl_utilities.negatedP(lit)) {
                neg_lits = cons(lit, neg_lits);
            } else {
                pos_lits = cons(lit, pos_lits);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        return clauses.make_clause(nreverse(neg_lits), nreverse(pos_lits));
    }

    public static SubLObject clause_number_of_literals(final SubLObject clause) {
        return clause_literal_count(clause);
    }

    public static SubLObject clause_literal_count(final SubLObject clause) {
        SubLObject lit_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(clause);
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            lit_count = add(lit_count, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        cdolist_list_var = clauses.pos_lits(clause);
        lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            lit_count = add(lit_count, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        return lit_count;
    }

    public static SubLObject unary_clause_p(final SubLObject clause) {
        return numE(ONE_INTEGER, clause_number_of_literals(clause));
    }

    public static SubLObject binary_clause_p(final SubLObject clause) {
        return numE(TWO_INTEGER, clause_number_of_literals(clause));
    }

    public static SubLObject ternary_clause_p(final SubLObject clause) {
        return numE(THREE_INTEGER, clause_number_of_literals(clause));
    }

    public static SubLObject all_literals_as_asents(final SubLObject clause) {
        return append(clauses.neg_lits(clause), clauses.pos_lits(clause));
    }

    public static SubLObject cnf_isa_lits(final SubLObject cnf) {
        return list_utilities.ordered_union(isa_lits(clauses.neg_lits(cnf)), isa_lits(clauses.pos_lits(cnf)), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject cnf_tou_lits(final SubLObject cnf) {
        return list_utilities.ordered_union(tou_lits(clauses.neg_lits(cnf)), tou_lits(clauses.pos_lits(cnf)), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject cnf_pred_lits(final SubLObject cnf, final SubLObject pred) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = clauses.neg_lits(cnf);
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != pred_litP(literal, pred)) {
                result = cons(literal, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        cdolist_list_var = clauses.pos_lits(cnf);
        literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != pred_litP(literal, pred)) {
                result = cons(literal, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject gaf_clauseP(final SubLObject clause) {
        final SubLObject pos_lits = clauses.pos_lits(clause);
        final SubLObject neg_lits = clauses.neg_lits(clause);
        return makeBoolean((((NIL != list_utilities.singletonP(pos_lits)) && (NIL == neg_lits)) || ((NIL != list_utilities.singletonP(neg_lits)) && (NIL == pos_lits))) && (NIL != groundP(clause, UNPROVIDED)));
    }

    public static SubLObject clause_variables(final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym14$CYC_VAR_;
        }
        SubLObject neg_lits = NIL;
        SubLObject pos_lits = NIL;
        destructuring_bind_must_consp(clause, clause, $list18);
        neg_lits = clause.first();
        SubLObject current = clause.rest();
        destructuring_bind_must_consp(current, clause, $list18);
        pos_lits = current.first();
        current = current.rest();
        if (NIL == current) {
            return nunion(literals_variables(neg_lits, varP), literals_variables(pos_lits, varP), UNPROVIDED, UNPROVIDED);
        }
        cdestructuring_bind_error(clause, $list18);
        return NIL;
    }

    public static SubLObject clause_free_sequence_variables(final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym14$CYC_VAR_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject neg_lits = NIL;
        SubLObject pos_lits = NIL;
        destructuring_bind_must_consp(clause, clause, $list18);
        neg_lits = clause.first();
        SubLObject current = clause.rest();
        destructuring_bind_must_consp(current, clause, $list18);
        pos_lits = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(clause, $list18);
            return NIL;
        }
        final SubLObject bound = NIL;
        if ((NIL != clauses.atomic_clause_p(clause)) && (NIL != tou_litP(pos_lits.first()))) {
            SubLObject result = NIL;
            final SubLObject _prev_bind_0 = at_vars.$within_tou_gafP$.currentBinding(thread);
            try {
                at_vars.$within_tou_gafP$.bind(T, thread);
                result = list_utilities.ordered_union(literals_free_sequence_variables(neg_lits, bound, varP), literals_free_sequence_variables(pos_lits, bound, varP), UNPROVIDED, UNPROVIDED);
            } finally {
                at_vars.$within_tou_gafP$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return list_utilities.ordered_union(literals_free_sequence_variables(neg_lits, bound, varP), literals_free_sequence_variables(pos_lits, bound, varP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject clause_free_term_variables(final SubLObject clause, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = $sym14$CYC_VAR_;
        }
        return clause_free_variables(clause, varP, NIL);
    }

    public static SubLObject clause_free_variables(final SubLObject clause, SubLObject varP, SubLObject include_sequence_varsP) {
        if (varP == UNPROVIDED) {
            varP = $sym14$CYC_VAR_;
        }
        if (include_sequence_varsP == UNPROVIDED) {
            include_sequence_varsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject neg_lits = NIL;
        SubLObject pos_lits = NIL;
        destructuring_bind_must_consp(clause, clause, $list18);
        neg_lits = clause.first();
        SubLObject current = clause.rest();
        destructuring_bind_must_consp(current, clause, $list18);
        pos_lits = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(clause, $list18);
            return NIL;
        }
        final SubLObject bound = NIL;
        if ((NIL != clauses.atomic_clause_p(clause)) && (NIL != tou_litP(pos_lits.first()))) {
            SubLObject result = NIL;
            final SubLObject _prev_bind_0 = at_vars.$within_tou_gafP$.currentBinding(thread);
            try {
                at_vars.$within_tou_gafP$.bind(T, thread);
                result = list_utilities.ordered_union(literals_free_variables(neg_lits, bound, varP, include_sequence_varsP), literals_free_variables(pos_lits, bound, varP, include_sequence_varsP), UNPROVIDED, UNPROVIDED);
            } finally {
                at_vars.$within_tou_gafP$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return list_utilities.ordered_union(literals_free_variables(neg_lits, bound, varP, include_sequence_varsP), literals_free_variables(pos_lits, bound, varP, include_sequence_varsP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject terms_clauses(final SubLObject terms, final SubLObject v_clauses, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        SubLObject result = NIL;
        SubLObject foundP = NIL;
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = NIL;
        clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            foundP = NIL;
            if (NIL == foundP) {
                SubLObject csome_list_var = terms;
                SubLObject v_term = NIL;
                v_term = csome_list_var.first();
                while ((NIL == foundP) && (NIL != csome_list_var)) {
                    if (NIL != list_utilities.tree_find(v_term, clause, test, UNPROVIDED)) {
                        foundP = T;
                        result = cons(clause, result);
                    }
                    csome_list_var = csome_list_var.rest();
                    v_term = csome_list_var.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject term_clauses(final SubLObject v_term, final SubLObject v_clauses, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        SubLObject included_clauses = NIL;
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = NIL;
        clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != list_utilities.tree_find(v_term, clause, test, UNPROVIDED)) {
                included_clauses = cons(clause, included_clauses);
            }
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        } 
        return nreverse(included_clauses);
    }

    public static SubLObject term_clauses_including_refd_vars(final SubLObject v_term, final SubLObject v_clauses, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        SubLObject included = NIL;
        SubLObject excluded = NIL;
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = NIL;
        clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != list_utilities.tree_find(v_term, clause, test, UNPROVIDED)) {
                included = cons(clause, included);
            } else {
                excluded = cons(clause, excluded);
            }
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        } 
        return nreverse(clauses_referencing_vars_recursive(included, excluded, list_utilities.tree_gather(included, $sym14$CYC_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject clauses_referencing_vars_recursive(final SubLObject included, final SubLObject excluded, final SubLObject vars) {
        SubLObject new_included = NIL;
        SubLObject new_excluded = NIL;
        SubLObject new_clause_addedP = NIL;
        SubLObject cdolist_list_var = excluded;
        SubLObject clause = NIL;
        clause = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject include_this_clauseP = NIL;
            if (NIL == include_this_clauseP) {
                SubLObject csome_list_var = vars;
                SubLObject var = NIL;
                var = csome_list_var.first();
                while ((NIL == include_this_clauseP) && (NIL != csome_list_var)) {
                    if (NIL != list_utilities.tree_find(var, clause, UNPROVIDED, UNPROVIDED)) {
                        new_included = cons(clause, new_included);
                        include_this_clauseP = T;
                        new_clause_addedP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    var = csome_list_var.first();
                } 
            }
            if (NIL == include_this_clauseP) {
                new_excluded = cons(clause, new_excluded);
            }
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        } 
        if (NIL != new_clause_addedP) {
            return clauses_referencing_vars_recursive(nconc(included, new_included), new_excluded, list_utilities.tree_gather(new_included, $sym14$CYC_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return included;
    }

    public static SubLObject contextualized_literal_to_ist_sentence(final SubLObject contextualized_literal) {
        SubLObject mt = NIL;
        SubLObject literal = NIL;
        destructuring_bind_must_consp(contextualized_literal, contextualized_literal, $list21);
        mt = contextualized_literal.first();
        SubLObject current = contextualized_literal.rest();
        destructuring_bind_must_consp(current, contextualized_literal, $list21);
        literal = current.first();
        current = current.rest();
        if (NIL == current) {
            return list($$ist, mt, literal);
        }
        cdestructuring_bind_error(contextualized_literal, $list21);
        return NIL;
    }

    public static SubLObject contextualized_dnf_formula(final SubLObject dnf) {
        final SubLObject pos_lits = Mapping.mapcar(CONTEXTUALIZED_LITERAL_TO_IST_SENTENCE, clauses.pos_lits(dnf));
        final SubLObject neg_lits = Mapping.mapcar(NEGATE, Mapping.mapcar(CONTEXTUALIZED_LITERAL_TO_IST_SENTENCE, clauses.neg_lits(dnf)));
        if (NIL == neg_lits) {
            if (NIL != pos_lits.rest()) {
                return bq_cons($$and, append(pos_lits, NIL));
            }
            return pos_lits.first();
        } else {
            if (NIL != pos_lits) {
                return bq_cons($$and, append(append(neg_lits, pos_lits), NIL));
            }
            if (NIL != neg_lits.rest()) {
                return bq_cons($$and, append(neg_lits, NIL));
            }
            return neg_lits.first();
        }
    }

    public static SubLObject contextualized_dnf_formula_from_clauses(final SubLObject dnf_clauses) {
        assert NIL != listp(dnf_clauses) : "Types.listp(dnf_clauses) " + "CommonSymbols.NIL != Types.listp(dnf_clauses) " + dnf_clauses;
        if (length(dnf_clauses).numE(ONE_INTEGER)) {
            return contextualized_dnf_formula(dnf_clauses.first());
        }
        return bq_cons($$or, append(Mapping.mapcar(symbol_function(CONTEXTUALIZED_DNF_FORMULA), dnf_clauses), NIL));
    }

    public static SubLObject decontextualize_contextualized_clause(final SubLObject contextualized_clause) {
        final SubLObject neg_lits = Mapping.mapcar(CONTEXTUALIZED_ASENT_ASENT, clauses.neg_lits(contextualized_clause));
        final SubLObject pos_lits = Mapping.mapcar(CONTEXTUALIZED_ASENT_ASENT, clauses.pos_lits(contextualized_clause));
        return clauses.make_clause(neg_lits, pos_lits);
    }

    public static SubLObject decontextualize_contextualized_clauses(final SubLObject contextualized_clauses) {
        return Mapping.mapcar(DECONTEXTUALIZE_CONTEXTUALIZED_CLAUSE, contextualized_clauses);
    }

    public static SubLObject subclause_spec_p(final SubLObject v_object) {
        return makeBoolean((((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != number_utilities.list_of_non_negative_integer_p(v_object.first()))) && (NIL != number_utilities.list_of_non_negative_integer_p(second(v_object))));
    }

    public static SubLObject new_subclause_spec(SubLObject negative_indices, SubLObject positive_indices) {
        SubLObject list_var = negative_indices;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != subl_promotions.non_negative_integer_p(elem) : "subl_promotions.non_negative_integer_p(elem) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        list_var = positive_indices;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        cdolist_list_var = list_var;
        elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != subl_promotions.non_negative_integer_p(elem) : "subl_promotions.non_negative_integer_p(elem) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        negative_indices = canonicalize_literal_indices(negative_indices);
        positive_indices = canonicalize_literal_indices(positive_indices);
        return list(negative_indices, positive_indices);
    }

    public static SubLObject new_total_subclause_spec(final SubLObject clause) {
        final SubLObject negative_indices = list_utilities.num_list(length(clauses.neg_lits(clause)), UNPROVIDED);
        final SubLObject positive_indices = list_utilities.num_list(length(clauses.pos_lits(clause)), UNPROVIDED);
        return new_subclause_spec(negative_indices, positive_indices);
    }

    public static SubLObject new_pos_subclause_spec(final SubLObject positive_indices) {
        return new_subclause_spec(NIL, positive_indices);
    }

    public static SubLObject new_neg_subclause_spec(final SubLObject negative_indices) {
        return new_subclause_spec(negative_indices, NIL);
    }

    public static SubLObject new_single_literal_subclause_spec(final SubLObject sense, final SubLObject index) {
        final SubLObject negative_indices = (sense == $NEG) ? list(index) : NIL;
        final SubLObject positive_indices = (sense == $POS) ? list(index) : NIL;
        return new_subclause_spec(negative_indices, positive_indices);
    }

    public static SubLObject ncanonicalize_literal_indices(final SubLObject indices) {
        return Sort.sort(indices, symbol_function($sym33$_), UNPROVIDED);
    }

    public static SubLObject canonicalize_literal_indices(final SubLObject indices) {
        return ncanonicalize_literal_indices(copy_list(indices));
    }

    public static SubLObject new_complement_subclause_spec(final SubLObject subclause_spec, final SubLObject sample_clause) {
        final SubLObject neg_lit_count = length(clauses.neg_lits(sample_clause));
        final SubLObject pos_lit_count = length(clauses.pos_lits(sample_clause));
        SubLObject neg_indices = NIL;
        SubLObject pos_indices = NIL;
        destructuring_bind_must_consp(subclause_spec, subclause_spec, $list34);
        neg_indices = subclause_spec.first();
        SubLObject current = subclause_spec.rest();
        destructuring_bind_must_consp(current, subclause_spec, $list34);
        pos_indices = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject complement_neg_indices = NIL;
            SubLObject complement_pos_indices = NIL;
            SubLObject neg_index;
            for (neg_index = NIL, neg_index = ZERO_INTEGER; neg_index.numL(neg_lit_count); neg_index = add(neg_index, ONE_INTEGER)) {
                if (NIL == subl_promotions.memberP(neg_index, neg_indices, UNPROVIDED, UNPROVIDED)) {
                    complement_neg_indices = cons(neg_index, complement_neg_indices);
                }
            }
            SubLObject pos_index;
            for (pos_index = NIL, pos_index = ZERO_INTEGER; pos_index.numL(pos_lit_count); pos_index = add(pos_index, ONE_INTEGER)) {
                if (NIL == subl_promotions.memberP(pos_index, pos_indices, UNPROVIDED, UNPROVIDED)) {
                    complement_pos_indices = cons(pos_index, complement_pos_indices);
                }
            }
            return new_subclause_spec(complement_neg_indices, complement_pos_indices);
        }
        cdestructuring_bind_error(subclause_spec, $list34);
        return NIL;
    }

    public static SubLObject subclause_spec_negative_indices(final SubLObject subclause_spec) {
        return subclause_spec.first();
    }

    public static SubLObject subclause_spec_positive_indices(final SubLObject subclause_spec) {
        return second(subclause_spec);
    }

    public static SubLObject subclause_spec_subsumesP(final SubLObject subsuming_subclause_spec, final SubLObject subsumed_subclause_spec) {
        return makeBoolean((NIL != subsetp(subclause_spec_positive_indices(subsumed_subclause_spec), subclause_spec_positive_indices(subsuming_subclause_spec), symbol_function($sym35$_), UNPROVIDED)) && (NIL != subsetp(subclause_spec_negative_indices(subsumed_subclause_spec), subclause_spec_negative_indices(subsuming_subclause_spec), symbol_function($sym35$_), UNPROVIDED)));
    }

    public static SubLObject index_and_sense_match_subclause_specP(final SubLObject index, final SubLObject sense, final SubLObject subclause_spec) {
        return list_utilities.member_eqP(index, $NEG == sense ? subclause_spec_negative_indices(subclause_spec) : subclause_spec_positive_indices(subclause_spec));
    }

    public static SubLObject subclause_specified_by_spec(final SubLObject clause, final SubLObject subclause_spec) {
        SubLObject neg_lits = NIL;
        SubLObject pos_lits = NIL;
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(clause);
        SubLObject asent = NIL;
        asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sense = $NEG;
            if (NIL != index_and_sense_match_subclause_specP(index, sense, subclause_spec)) {
                if ($NEG == sense) {
                    neg_lits = cons(asent, neg_lits);
                } else {
                    pos_lits = cons(asent, pos_lits);
                }
            }
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        } 
        index = ZERO_INTEGER;
        cdolist_list_var = clauses.pos_lits(clause);
        asent = NIL;
        asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sense = $POS;
            if (NIL != index_and_sense_match_subclause_specP(index, sense, subclause_spec)) {
                if ($NEG == sense) {
                    neg_lits = cons(asent, neg_lits);
                } else {
                    pos_lits = cons(asent, pos_lits);
                }
            }
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        } 
        final SubLObject subclause = clauses.make_clause(nreverse(neg_lits), nreverse(pos_lits));
        return subclause;
    }

    public static SubLObject complement_of_subclause_specified_by_spec(final SubLObject clause, final SubLObject subclause_spec) {
        SubLObject neg_lits = NIL;
        SubLObject pos_lits = NIL;
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(clause);
        SubLObject asent = NIL;
        asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sense = $NEG;
            if (NIL == index_and_sense_match_subclause_specP(index, sense, subclause_spec)) {
                if ($NEG == sense) {
                    neg_lits = cons(asent, neg_lits);
                } else {
                    pos_lits = cons(asent, pos_lits);
                }
            }
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        } 
        index = ZERO_INTEGER;
        cdolist_list_var = clauses.pos_lits(clause);
        asent = NIL;
        asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sense = $POS;
            if (NIL == index_and_sense_match_subclause_specP(index, sense, subclause_spec)) {
                if ($NEG == sense) {
                    neg_lits = cons(asent, neg_lits);
                } else {
                    pos_lits = cons(asent, pos_lits);
                }
            }
            index = add(index, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        } 
        final SubLObject subclause = clauses.make_clause(nreverse(neg_lits), nreverse(pos_lits));
        return subclause;
    }

    public static SubLObject subclause_spec_from_clauses(final SubLObject big_clause, final SubLObject little_clause) {
        final SubLObject neg_indices = literal_indices_from_literals(clauses.neg_lits(big_clause), clauses.neg_lits(little_clause));
        final SubLObject pos_indices = literal_indices_from_literals(clauses.pos_lits(big_clause), clauses.pos_lits(little_clause));
        return new_subclause_spec(neg_indices, pos_indices);
    }

    public static SubLObject literal_indices_from_literals(final SubLObject big_lits, final SubLObject little_lits) {
        SubLObject indices = NIL;
        SubLObject cdolist_list_var = little_lits;
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject index = position(lit, big_lits, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            indices = cons(index, indices);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        return nreverse(indices);
    }

    public static SubLObject subclause_spec_literal_count(final SubLObject subclause_spec) {
        return add(length(subclause_spec_positive_indices(subclause_spec)), length(subclause_spec_negative_indices(subclause_spec)));
    }

    public static SubLObject empty_subclause_specP(final SubLObject subclause_spec) {
        return numE(ZERO_INTEGER, subclause_spec_literal_count(subclause_spec));
    }

    public static SubLObject single_literal_subclause_specP(final SubLObject subclause_spec) {
        return numE(ONE_INTEGER, subclause_spec_literal_count(subclause_spec));
    }

    public static SubLObject multi_literal_subclause_specP(final SubLObject subclause_spec) {
        return numG(subclause_spec_literal_count(subclause_spec), ONE_INTEGER);
    }

    public static SubLObject total_subclause_specP(final SubLObject subclause_spec, final SubLObject clause) {
        return makeBoolean(length(subclause_spec_positive_indices(subclause_spec)).numE(length(clauses.pos_lits(clause))) && length(subclause_spec_negative_indices(subclause_spec)).numE(length(clauses.neg_lits(clause))));
    }

    public static SubLObject clause_difference(final SubLObject clause, final SubLObject subtract_clause) {
        final SubLObject clause_neg_lits = clauses.neg_lits(clause);
        final SubLObject clause_pos_lits = clauses.pos_lits(clause);
        final SubLObject subtract_clause_neg_lits = clauses.neg_lits(subtract_clause);
        final SubLObject subtract_clause_pos_lits = clauses.pos_lits(subtract_clause);
        SubLObject new_neg_lits = NIL;
        SubLObject new_pos_lits = NIL;
        SubLObject cdolist_list_var = clause_neg_lits;
        SubLObject neg_lit = NIL;
        neg_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == list_utilities.member_equalP(neg_lit, subtract_clause_neg_lits)) {
                new_neg_lits = cons(neg_lit, new_neg_lits);
            }
            cdolist_list_var = cdolist_list_var.rest();
            neg_lit = cdolist_list_var.first();
        } 
        new_neg_lits = nreverse(new_neg_lits);
        cdolist_list_var = clause_pos_lits;
        SubLObject pos_lit = NIL;
        pos_lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == list_utilities.member_equalP(pos_lit, subtract_clause_pos_lits)) {
                new_pos_lits = cons(pos_lit, new_pos_lits);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pos_lit = cdolist_list_var.first();
        } 
        new_pos_lits = nreverse(new_pos_lits);
        return clauses.make_clause(new_neg_lits, new_pos_lits);
    }

    public static SubLObject declare_clause_utilities_file() {
        declareMacro(me, "destructure_clause", "DESTRUCTURE-CLAUSE");
        declareMacro(me, "do_subclause_spec", "DO-SUBCLAUSE-SPEC");
        declareMacro(me, "do_subclause_spec_complement", "DO-SUBCLAUSE-SPEC-COMPLEMENT");
        declareMacro(me, "destructure_contextualized_asent", "DESTRUCTURE-CONTEXTUALIZED-ASENT");
        declareFunction(me, "remake_clause", "REMAKE-CLAUSE", 3, 0, false);
        declareFunction(me, "nmake_clause", "NMAKE-CLAUSE", 3, 0, false);
        declareFunction(me, "remake_cnf", "REMAKE-CNF", 3, 0, false);
        declareFunction(me, "make_gaf_cnf", "MAKE-GAF-CNF", 1, 0, false);
        declareFunction(me, "make_false_gaf_cnf", "MAKE-FALSE-GAF-CNF", 1, 0, false);
        declareFunction(me, "make_gaf_dnf", "MAKE-GAF-DNF", 1, 0, false);
        declareFunction(me, "make_false_gaf_dnf", "MAKE-FALSE-GAF-DNF", 1, 0, false);
        declareFunction(me, "make_gaf_cnf_with_truth", "MAKE-GAF-CNF-WITH-TRUTH", 2, 0, false);
        declareFunction(me, "make_gaf_dnf_with_truth", "MAKE-GAF-DNF-WITH-TRUTH", 2, 0, false);
        declareFunction(me, "remake_dnf", "REMAKE-DNF", 3, 0, false);
        declareFunction(me, "nmake_dnf", "NMAKE-DNF", 3, 0, false);
        declareFunction(me, "asent_sense_to_literal", "ASENT-SENSE-TO-LITERAL", 2, 0, false);
        declareFunction(me, "clausal_form_p", "CLAUSAL-FORM-P", 1, 0, false);
        declareFunction(me, "clause_with_lit_counts_p", "CLAUSE-WITH-LIT-COUNTS-P", 3, 0, false);
        declareFunction(me, "pos_atomic_cnf_p", "POS-ATOMIC-CNF-P", 1, 0, false);
        declareFunction(me, "pos_atomic_clause_p", "POS-ATOMIC-CLAUSE-P", 1, 0, false);
        declareFunction(me, "pos_atomic_cnf_with_pred_p", "POS-ATOMIC-CNF-WITH-PRED-P", 2, 0, false);
        declareFunction(me, "neg_atomic_cnf_p", "NEG-ATOMIC-CNF-P", 1, 0, false);
        declareFunction(me, "neg_atomic_clause_p", "NEG-ATOMIC-CLAUSE-P", 1, 0, false);
        declareFunction(me, "neg_atomic_cnf_with_pred_p", "NEG-ATOMIC-CNF-WITH-PRED-P", 2, 0, false);
        declareFunction(me, "atomic_clause_with_all_var_argsP", "ATOMIC-CLAUSE-WITH-ALL-VAR-ARGS?", 1, 0, false);
        declareFunction(me, "gaf_cnf_literal", "GAF-CNF-LITERAL", 1, 0, false);
        declareFunction(me, "literals_with_sense", "LITERALS-WITH-SENSE", 2, 0, false);
        declareFunction(me, "atomic_cnf_asent", "ATOMIC-CNF-ASENT", 1, 0, false);
        declareFunction(me, "atomic_clause_asent", "ATOMIC-CLAUSE-ASENT", 1, 0, false);
        declareFunction(me, "atomic_cnf_predicate", "ATOMIC-CNF-PREDICATE", 1, 0, false);
        declareFunction(me, "atomic_clause_predicate", "ATOMIC-CLAUSE-PREDICATE", 1, 0, false);
        declareFunction(me, "asent_truth_from_atomic_clause", "ASENT-TRUTH-FROM-ATOMIC-CLAUSE", 1, 0, false);
        declareFunction(me, "negate_clause", "NEGATE-CLAUSE", 1, 0, false);
        declareFunction(me, "negate_clauses", "NEGATE-CLAUSES", 1, 0, false);
        declareFunction(me, "atomic_clauses_p", "ATOMIC-CLAUSES-P", 1, 0, false);
        declareFunction(me, "pos_atomic_clauses_p", "POS-ATOMIC-CLAUSES-P", 1, 0, false);
        declareFunction(me, "neg_atomic_clauses_p", "NEG-ATOMIC-CLAUSES-P", 1, 0, false);
        declareFunction(me, "atomic_clauses_asent", "ATOMIC-CLAUSES-ASENT", 1, 0, false);
        declareFunction(me, "atomic_clauses_predicate", "ATOMIC-CLAUSES-PREDICATE", 1, 0, false);
        declareFunction(me, "group_clauses_having_common_neg_lits", "GROUP-CLAUSES-HAVING-COMMON-NEG-LITS", 1, 1, false);
        declareFunction(me, "unmake_clause", "UNMAKE-CLAUSE", 1, 0, false);
        declareFunction(me, "cnfP", "CNF?", 1, 0, false);
        declareFunction(me, "clauseP", "CLAUSE?", 1, 1, false);
        declareFunction(me, "literals_specP", "LITERALS-SPEC?", 1, 1, false);
        declareFunction(me, "literal_specP", "LITERAL-SPEC?", 1, 1, false);
        declareFunction(me, "clause_literals", "CLAUSE-LITERALS", 1, 0, false);
        declareFunction(me, "cnf_literals", "CNF-LITERALS", 1, 0, false);
        declareFunction(me, "dnf_literals", "DNF-LITERALS", 1, 0, false);
        declareFunction(me, "clause_from_el_literals", "CLAUSE-FROM-EL-LITERALS", 1, 0, false);
        declareFunction(me, "clause_number_of_literals", "CLAUSE-NUMBER-OF-LITERALS", 1, 0, false);
        declareFunction(me, "clause_literal_count", "CLAUSE-LITERAL-COUNT", 1, 0, false);
        declareFunction(me, "unary_clause_p", "UNARY-CLAUSE-P", 1, 0, false);
        declareFunction(me, "binary_clause_p", "BINARY-CLAUSE-P", 1, 0, false);
        declareFunction(me, "ternary_clause_p", "TERNARY-CLAUSE-P", 1, 0, false);
        declareFunction(me, "all_literals_as_asents", "ALL-LITERALS-AS-ASENTS", 1, 0, false);
        declareFunction(me, "cnf_isa_lits", "CNF-ISA-LITS", 1, 0, false);
        declareFunction(me, "cnf_tou_lits", "CNF-TOU-LITS", 1, 0, false);
        declareFunction(me, "cnf_pred_lits", "CNF-PRED-LITS", 2, 0, false);
        declareFunction(me, "gaf_clauseP", "GAF-CLAUSE?", 1, 0, false);
        declareFunction(me, "clause_variables", "CLAUSE-VARIABLES", 1, 1, false);
        declareFunction(me, "clause_free_sequence_variables", "CLAUSE-FREE-SEQUENCE-VARIABLES", 1, 1, false);
        declareFunction(me, "clause_free_term_variables", "CLAUSE-FREE-TERM-VARIABLES", 1, 1, false);
        declareFunction(me, "clause_free_variables", "CLAUSE-FREE-VARIABLES", 1, 2, false);
        declareFunction(me, "terms_clauses", "TERMS-CLAUSES", 2, 1, false);
        declareFunction(me, "term_clauses", "TERM-CLAUSES", 2, 1, false);
        declareFunction(me, "term_clauses_including_refd_vars", "TERM-CLAUSES-INCLUDING-REFD-VARS", 2, 1, false);
        declareFunction(me, "clauses_referencing_vars_recursive", "CLAUSES-REFERENCING-VARS-RECURSIVE", 3, 0, false);
        declareFunction(me, "contextualized_literal_to_ist_sentence", "CONTEXTUALIZED-LITERAL-TO-IST-SENTENCE", 1, 0, false);
        declareFunction(me, "contextualized_dnf_formula", "CONTEXTUALIZED-DNF-FORMULA", 1, 0, false);
        declareFunction(me, "contextualized_dnf_formula_from_clauses", "CONTEXTUALIZED-DNF-FORMULA-FROM-CLAUSES", 1, 0, false);
        declareFunction(me, "decontextualize_contextualized_clause", "DECONTEXTUALIZE-CONTEXTUALIZED-CLAUSE", 1, 0, false);
        declareFunction(me, "decontextualize_contextualized_clauses", "DECONTEXTUALIZE-CONTEXTUALIZED-CLAUSES", 1, 0, false);
        declareFunction(me, "subclause_spec_p", "SUBCLAUSE-SPEC-P", 1, 0, false);
        declareFunction(me, "new_subclause_spec", "NEW-SUBCLAUSE-SPEC", 2, 0, false);
        declareFunction(me, "new_total_subclause_spec", "NEW-TOTAL-SUBCLAUSE-SPEC", 1, 0, false);
        declareFunction(me, "new_pos_subclause_spec", "NEW-POS-SUBCLAUSE-SPEC", 1, 0, false);
        declareFunction(me, "new_neg_subclause_spec", "NEW-NEG-SUBCLAUSE-SPEC", 1, 0, false);
        declareFunction(me, "new_single_literal_subclause_spec", "NEW-SINGLE-LITERAL-SUBCLAUSE-SPEC", 2, 0, false);
        declareFunction(me, "ncanonicalize_literal_indices", "NCANONICALIZE-LITERAL-INDICES", 1, 0, false);
        declareFunction(me, "canonicalize_literal_indices", "CANONICALIZE-LITERAL-INDICES", 1, 0, false);
        declareFunction(me, "new_complement_subclause_spec", "NEW-COMPLEMENT-SUBCLAUSE-SPEC", 2, 0, false);
        declareFunction(me, "subclause_spec_negative_indices", "SUBCLAUSE-SPEC-NEGATIVE-INDICES", 1, 0, false);
        declareFunction(me, "subclause_spec_positive_indices", "SUBCLAUSE-SPEC-POSITIVE-INDICES", 1, 0, false);
        declareFunction(me, "subclause_spec_subsumesP", "SUBCLAUSE-SPEC-SUBSUMES?", 2, 0, false);
        declareFunction(me, "index_and_sense_match_subclause_specP", "INDEX-AND-SENSE-MATCH-SUBCLAUSE-SPEC?", 3, 0, false);
        declareFunction(me, "subclause_specified_by_spec", "SUBCLAUSE-SPECIFIED-BY-SPEC", 2, 0, false);
        declareFunction(me, "complement_of_subclause_specified_by_spec", "COMPLEMENT-OF-SUBCLAUSE-SPECIFIED-BY-SPEC", 2, 0, false);
        declareFunction(me, "subclause_spec_from_clauses", "SUBCLAUSE-SPEC-FROM-CLAUSES", 2, 0, false);
        declareFunction(me, "literal_indices_from_literals", "LITERAL-INDICES-FROM-LITERALS", 2, 0, false);
        declareFunction(me, "subclause_spec_literal_count", "SUBCLAUSE-SPEC-LITERAL-COUNT", 1, 0, false);
        declareFunction(me, "empty_subclause_specP", "EMPTY-SUBCLAUSE-SPEC?", 1, 0, false);
        declareFunction(me, "single_literal_subclause_specP", "SINGLE-LITERAL-SUBCLAUSE-SPEC?", 1, 0, false);
        declareFunction(me, "multi_literal_subclause_specP", "MULTI-LITERAL-SUBCLAUSE-SPEC?", 1, 0, false);
        declareFunction(me, "total_subclause_specP", "TOTAL-SUBCLAUSE-SPEC?", 2, 0, false);
        declareFunction(me, "clause_difference", "CLAUSE-DIFFERENCE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_clause_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_clause_utilities_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_clause_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_clause_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_clause_utilities_file();
    }

    
}

/**
 * Total time: 279 ms
 */
