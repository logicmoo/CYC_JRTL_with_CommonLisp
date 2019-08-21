package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.clauses;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.clauses.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class clauses extends SubLTranslatedFile {
    public static final SubLFile me = new clauses();

    public static final String myName = "com.cyc.cycjava.cycl.clauses";

    public static final String myFingerPrint = "6984aec1cb596f013d91bd8244382fad1d07257204f2d73ee0e7618c0ea52cc0";

    // defparameter
    // The empty clause (commonly called 'box')
    private static final SubLSymbol $empty_clause$ = makeSymbol("*EMPTY-CLAUSE*");

    // Internal Constants
    public static final SubLSymbol CLAUSE_P = makeSymbol("CLAUSE-P");

    public static final SubLList $list1 = list(makeSymbol("OBJECT"));

    public static final SubLString $str2$Returns_T_iff_OBJECT_is_either_a_ = makeString("Returns T iff OBJECT is either a CNF or DNF clause.");

    public static final SubLList $list3 = list(makeSymbol("BOOLEANP"));



    public static final SubLSymbol MAKE_CLAUSE = makeSymbol("MAKE-CLAUSE");

    public static final SubLList $list6 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));

    public static final SubLString $str7$Construct_a_clause_from_NEG_LITS_ = makeString("Construct a clause from NEG-LITS and POS-LITS, each of which are lists of literals.");

    public static final SubLList $list8 = list(list(makeSymbol("NEG-LITS"), makeSymbol("LISTP")), list(makeSymbol("POS-LITS"), makeSymbol("LISTP")));

    public static final SubLList $list9 = list(makeSymbol("CLAUSE-P"));



    public static final SubLList $list11 = list(makeSymbol("CLAUSE"));

    public static final SubLString $str12$Return_the_neg_lits_of_CLAUSE_ = makeString("Return the neg-lits of CLAUSE.");

    public static final SubLList $list13 = list(list(makeSymbol("CLAUSE"), makeSymbol("CLAUSE-P")));

    public static final SubLList $list14 = list(makeSymbol("LISTP"));



    public static final SubLString $str16$Return_the_pos_lits_of_CLAUSE_ = makeString("Return the pos-lits of CLAUSE.");







    public static final SubLSymbol GROUND_CLAUSE_P = makeSymbol("GROUND-CLAUSE-P");

    public static final SubLString $str21$Return_T_iff_CLAUSE_is_a_ground_c = makeString("Return T iff CLAUSE is a ground clause.");

    public static final SubLSymbol ATOMIC_CLAUSE_P = makeSymbol("ATOMIC-CLAUSE-P");

    public static final SubLString $str23$Return_T_iff_CLAUSE_is_an_atomic_ = makeString("Return T iff CLAUSE is an atomic clause.");

    public static final SubLSymbol CLAUSE_EQUAL = makeSymbol("CLAUSE-EQUAL");

    public static final SubLList $list25 = list(makeSymbol("CLAUSE1"), makeSymbol("CLAUSE2"));

    public static final SubLString $str26$Return_T_iff_CLAUSE1_and_CLAUSE2_ = makeString("Return T iff CLAUSE1 and CLAUSE2 are both equivalent ");

    public static final SubLSymbol EMPTY_CLAUSE = makeSymbol("EMPTY-CLAUSE");

    public static final SubLString $str28$Return_the_empty_clause_ = makeString("Return the empty clause.");

    public static final SubLSymbol $sym29$EMPTY_CLAUSE_ = makeSymbol("EMPTY-CLAUSE?");

    public static final SubLString $str30$Return_T_iff_CLAUSE_is_empty_ = makeString("Return T iff CLAUSE is empty.");



    public static final SubLSymbol CLAUSE_LITERAL = makeSymbol("CLAUSE-LITERAL");

    public static final SubLList $list33 = list(makeSymbol("CLAUSE"), makeSymbol("SENSE"), makeSymbol("NUM"));

    public static final SubLString $str34$Return_literal_in_CLAUSE_specifie = makeString("Return literal in CLAUSE specified by SENSE and NUM.\n  SENSE must be either :pos or :neg.");

    public static final SubLList $list35 = list(list(makeSymbol("CLAUSE"), makeSymbol("CLAUSE-P")), list(makeSymbol("SENSE"), makeSymbol("SENSE-P")), list(makeSymbol("NUM"), makeSymbol("INTEGERP")));

    public static final SubLSymbol CLAUSE_WITHOUT_LITERAL = makeSymbol("CLAUSE-WITHOUT-LITERAL");

    public static final SubLString $str37$Return_a_new_clause_which_is_CLAU = makeString("Return a new clause which is CLAUSE without the literal specified by SENSE and NUM.\n  SENSE must be either :pos or :neg.");



    public static final SubLString $str39$Returns_T_iff_OBJECT_is_a_canonic = makeString("Returns T iff OBJECT is a canonicalized CycL formula in conjunctive normal form.");

    public static final SubLSymbol $sym40$GAF_CNF_ = makeSymbol("GAF-CNF?");

    public static final SubLList $list41 = list(makeSymbol("CNF"));

    public static final SubLString $str42$Return_T_iff_CNF_is_a_cnf_represe = makeString("Return T iff CNF is a cnf representation of a gaf formula.");





    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLObject $$or = reader_make_constant_shell(makeString("or"));

    private static final SubLObject $$implies = reader_make_constant_shell(makeString("implies"));

    private static final SubLObject $$not = reader_make_constant_shell(makeString("not"));



    public static final SubLSymbol CNF_FORMULA = makeSymbol("CNF-FORMULA");

    public static final SubLList $list51 = list(makeSymbol("CNF"), makeSymbol("&OPTIONAL"), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));

    public static final SubLString $str52$Return_a_readable_formula_of_CNF_ = makeString("Return a readable formula of CNF\n   TRUTH only gets looked at for ground, single pos lit cnfs\n   in which case TRUTH gives the truth of the gaf.");

    public static final SubLList $list53 = list(list(makeSymbol("CNF"), makeSymbol("CNF-P")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));

    public static final SubLList $list54 = list(makeSymbol("EL-FORMULA-P"));

    public static final SubLSymbol CNF_FORMULA_FROM_CLAUSES = makeSymbol("CNF-FORMULA-FROM-CLAUSES");

    public static final SubLList $list56 = list(makeSymbol("CNF-CLAUSES"));

    public static final SubLString $str57$Return_a_readable_formula_from_a_ = makeString("Return a readable formula from a list of CNF-CLAUSES.");

    public static final SubLList $list58 = list(list(makeSymbol("CNF-CLAUSES"), makeSymbol("LISTP")));

    public static final SubLSymbol NEGATE = makeSymbol("NEGATE");

    public static final SubLSymbol DNF_FORMULA = makeSymbol("DNF-FORMULA");

    public static final SubLList $list61 = list(makeSymbol("DNF"));

    public static final SubLString $str62$Return_a_readable_formula_of_DNF_ = makeString("Return a readable formula of DNF.");

    public static final SubLSymbol DNF_FORMULA_FROM_CLAUSES = makeSymbol("DNF-FORMULA-FROM-CLAUSES");

    public static final SubLList $list64 = list(makeSymbol("DNF-CLAUSES"));

    public static final SubLString $str65$Return_a_readable_formula_from_a_ = makeString("Return a readable formula from a list of DNF-CLAUSES.");

    public static final SubLList $list66 = list(list(makeSymbol("DNF-CLAUSES"), makeSymbol("LISTP")));

    public static SubLObject clause_p(final SubLObject v_object) {
        return makeBoolean(((v_object.isList() && TWO_INTEGER.numE(length(v_object))) && v_object.first().isList()) && second(v_object).isList());
    }

    public static SubLObject make_clause(final SubLObject neg_lits, final SubLObject pos_lits) {
        SubLTrampolineFile.enforceType(neg_lits, LISTP);
        SubLTrampolineFile.enforceType(pos_lits, LISTP);
        return list(neg_lits, pos_lits);
    }

    public static SubLObject neg_lits(final SubLObject clause) {
        SubLTrampolineFile.enforceType(clause, CLAUSE_P);
        return clause.first();
    }

    public static SubLObject set_clause_neg_lits(final SubLObject clause, final SubLObject neg_lits) {
        rplaca(clause, neg_lits);
        return clause;
    }

    public static SubLObject pos_lits(final SubLObject clause) {
        SubLTrampolineFile.enforceType(clause, CLAUSE_P);
        return second(clause);
    }

    public static SubLObject set_clause_pos_lits(final SubLObject clause, final SubLObject pos_lits) {
        rplaca(clause.rest(), pos_lits);
        return clause;
    }

    public static SubLObject clause_sense_lits(final SubLObject clause, final SubLObject sense) {
        assert NIL != clause_p(clause) : "clauses.clause_p(clause) " + "CommonSymbols.NIL != clauses.clause_p(clause) " + clause;
        assert NIL != enumeration_types.sense_p(sense) : "enumeration_types.sense_p(sense) " + "CommonSymbols.NIL != enumeration_types.sense_p(sense) " + sense;
        if (sense.eql($NEG)) {
            return neg_lits(clause);
        }
        if (sense.eql($POS)) {
            return pos_lits(clause);
        }
        return NIL;
    }

    public static SubLObject ground_clause_p(final SubLObject clause) {
        return makeBoolean((NIL != clause_p(clause)) && (NIL != variables.fully_bound_p(clause)));
    }

    public static SubLObject atomic_clause_p(final SubLObject clause) {
        if (NIL != clause_p(clause)) {
            final SubLObject neg_lits = neg_lits(clause);
            final SubLObject pos_lits = pos_lits(clause);
            return makeBoolean(((NIL == neg_lits) && (NIL != list_utilities.singletonP(pos_lits))) || ((NIL == pos_lits) && (NIL != list_utilities.singletonP(neg_lits))));
        }
        return NIL;
    }

    public static SubLObject lifting_clause_p(final SubLObject clause) {
        if (NIL != clause_p(clause)) {
            SubLObject index_var = ZERO_INTEGER;
            SubLObject cdolist_list_var = neg_lits(clause);
            SubLObject asent = NIL;
            asent = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject sense = $NEG;
                if (NIL != ist_sentence_p(asent, UNPROVIDED)) {
                    return T;
                }
                index_var = add(index_var, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                asent = cdolist_list_var.first();
            } 
            index_var = ZERO_INTEGER;
            cdolist_list_var = pos_lits(clause);
            asent = NIL;
            asent = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject sense = $POS;
                if (NIL != ist_sentence_p(asent, UNPROVIDED)) {
                    return T;
                }
                index_var = add(index_var, ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                asent = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject clause_equal(final SubLObject clause1, final SubLObject clause2) {
        return makeBoolean((NIL != clause_p(clause1)) && clause1.equal(clause2));
    }

    public static SubLObject empty_clause() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $empty_clause$.getDynamicValue(thread);
    }

    public static SubLObject empty_clauseP(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(clause, CLAUSE_P);
        return clause_equal(clause, $empty_clause$.getDynamicValue(thread));
    }

    public static SubLObject clause_literal(final SubLObject clause, final SubLObject sense, final SubLObject num) {
        SubLTrampolineFile.enforceType(clause, CLAUSE_P);
        SubLTrampolineFile.enforceType(sense, SENSE_P);
        SubLTrampolineFile.enforceType(num, INTEGERP);
        return nth(num, sense == $POS ? pos_lits(clause) : neg_lits(clause));
    }

    public static SubLObject clause_without_literal(final SubLObject clause, final SubLObject sense, final SubLObject num) {
        SubLTrampolineFile.enforceType(clause, CLAUSE_P);
        SubLTrampolineFile.enforceType(sense, SENSE_P);
        SubLTrampolineFile.enforceType(num, INTEGERP);
        SubLObject neg_lits = copy_tree(neg_lits(clause));
        SubLObject pos_lits = copy_tree(pos_lits(clause));
        if (sense == $POS) {
            pos_lits = list_utilities.delete_nth(num, pos_lits);
        } else {
            neg_lits = list_utilities.delete_nth(num, neg_lits);
        }
        return make_clause(neg_lits, pos_lits);
    }

    public static SubLObject singleton_clause_literal(final SubLObject clause) {
        final SubLObject pos_lits = pos_lits(clause);
        final SubLObject neg_lits = neg_lits(clause);
        if ((NIL != list_utilities.singletonP(pos_lits)) && (NIL == neg_lits)) {
            return values(pos_lits.first(), $POS);
        }
        if ((NIL == pos_lits) && (NIL != list_utilities.singletonP(neg_lits))) {
            return values(neg_lits.first(), $NEG);
        }
        return values(NIL, NIL);
    }

    public static SubLObject make_xnf(final SubLObject neg_lits, final SubLObject pos_lits) {
        return make_clause(neg_lits, pos_lits);
    }

    public static SubLObject cnf_p(final SubLObject v_object) {
        return clause_p(v_object);
    }

    public static SubLObject dnf_p(final SubLObject v_object) {
        return clause_p(v_object);
    }

    public static SubLObject gaf_cnfP(final SubLObject cnf) {
        return makeBoolean((NIL != clause_utilities.pos_atomic_cnf_p(cnf)) && (NIL != ground_clause_p(cnf)));
    }

    public static SubLObject clauses_p(final SubLObject v_object) {
        return cnfs_p(v_object);
    }

    public static SubLObject cnfs_p(final SubLObject v_object) {
        if (NIL != list_utilities.non_dotted_list_p(v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject clause = NIL;
            clause = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == cnf_p(clause)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                clause = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    public static SubLObject dnf_clauses_p(final SubLObject v_object) {
        if (NIL != list_utilities.non_dotted_list_p(v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject clause = NIL;
            clause = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == dnf_p(clause)) {
                    return NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                clause = cdolist_list_var.first();
            } 
            return T;
        }
        return NIL;
    }

    public static SubLObject make_cnf(final SubLObject neg_lits, final SubLObject pos_lits) {
        return make_clause(neg_lits, pos_lits);
    }

    public static SubLObject cnf_equal(final SubLObject cnf1, final SubLObject cnf2) {
        return clause_equal(cnf1, cnf2);
    }

    public static SubLObject cnf_formula(SubLObject cnf, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        SubLTrampolineFile.enforceType(cnf, CNF_P);
        SubLTrampolineFile.enforceType(truth, TRUTH_P);
        cnf = czer_utilities.possibly_escape_quote_hl_vars(cnf, UNPROVIDED);
        SubLObject pos_lits = pos_lits(cnf);
        SubLObject neg_lits = neg_lits(cnf);
        if (NIL != neg_lits.rest()) {
            neg_lits = cons($$and, neg_lits);
        } else {
            neg_lits = neg_lits.first();
        }
        if (NIL != pos_lits.rest()) {
            pos_lits = cons($$or, pos_lits);
        } else {
            pos_lits = pos_lits.first();
        }
        if ((NIL != pos_lits) && (NIL != neg_lits)) {
            return list($$implies, neg_lits, pos_lits);
        }
        if (NIL != neg_lits) {
            return list($$not, neg_lits);
        }
        if (NIL == pos_lits) {
            return NIL;
        }
        if (((NIL != pos_lits(cnf).rest()) || (NIL == variables.fully_bound_p(pos_lits))) || (truth != $FALSE)) {
            return pos_lits;
        }
        return list($$not, pos_lits);
    }

    public static SubLObject cnf_formula_from_clauses(final SubLObject cnf_clauses) {
        SubLTrampolineFile.enforceType(cnf_clauses, LISTP);
        assert NIL != listp(cnf_clauses) : "Types.listp(cnf_clauses) " + "CommonSymbols.NIL != Types.listp(cnf_clauses) " + cnf_clauses;
        if (length(cnf_clauses).numE(ONE_INTEGER)) {
            return cnf_formula(cnf_clauses.first(), UNPROVIDED);
        }
        return bq_cons($$and, append(Mapping.mapcar(symbol_function(CNF_FORMULA), cnf_clauses), NIL));
    }

    public static SubLObject make_dnf(final SubLObject neg_lits, final SubLObject pos_lits) {
        return make_clause(neg_lits, pos_lits);
    }

    public static SubLObject literal_of_dnf(final SubLObject dnf, final SubLObject sense, final SubLObject num) {
        return clause_literal(dnf, sense, num);
    }

    public static SubLObject dnf_formula(final SubLObject dnf) {
        final SubLObject pos_lits = pos_lits(dnf);
        final SubLObject neg_lits = Mapping.mapcar(symbol_function(NEGATE), neg_lits(dnf));
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

    public static SubLObject dnf_formula_from_clauses(final SubLObject dnf_clauses) {
        SubLTrampolineFile.enforceType(dnf_clauses, LISTP);
        assert NIL != listp(dnf_clauses) : "Types.listp(dnf_clauses) " + "CommonSymbols.NIL != Types.listp(dnf_clauses) " + dnf_clauses;
        if (length(dnf_clauses).numE(ONE_INTEGER)) {
            return dnf_formula(dnf_clauses.first());
        }
        return uncanonicalizer.implications_in(bq_cons($$or, append(Mapping.mapcar(symbol_function(DNF_FORMULA), dnf_clauses), NIL)));
    }

    public static SubLObject declare_clauses_file() {
        declareFunction(me, "clause_p", "CLAUSE-P", 1, 0, false);
        declareFunction(me, "make_clause", "MAKE-CLAUSE", 2, 0, false);
        declareFunction(me, "neg_lits", "NEG-LITS", 1, 0, false);
        declareFunction(me, "set_clause_neg_lits", "SET-CLAUSE-NEG-LITS", 2, 0, false);
        declareFunction(me, "pos_lits", "POS-LITS", 1, 0, false);
        declareFunction(me, "set_clause_pos_lits", "SET-CLAUSE-POS-LITS", 2, 0, false);
        declareFunction(me, "clause_sense_lits", "CLAUSE-SENSE-LITS", 2, 0, false);
        declareFunction(me, "ground_clause_p", "GROUND-CLAUSE-P", 1, 0, false);
        declareFunction(me, "atomic_clause_p", "ATOMIC-CLAUSE-P", 1, 0, false);
        declareFunction(me, "lifting_clause_p", "LIFTING-CLAUSE-P", 1, 0, false);
        declareFunction(me, "clause_equal", "CLAUSE-EQUAL", 2, 0, false);
        declareFunction(me, "empty_clause", "EMPTY-CLAUSE", 0, 0, false);
        declareFunction(me, "empty_clauseP", "EMPTY-CLAUSE?", 1, 0, false);
        declareFunction(me, "clause_literal", "CLAUSE-LITERAL", 3, 0, false);
        declareFunction(me, "clause_without_literal", "CLAUSE-WITHOUT-LITERAL", 3, 0, false);
        declareFunction(me, "singleton_clause_literal", "SINGLETON-CLAUSE-LITERAL", 1, 0, false);
        declareFunction(me, "make_xnf", "MAKE-XNF", 2, 0, false);
        declareFunction(me, "cnf_p", "CNF-P", 1, 0, false);
        declareFunction(me, "dnf_p", "DNF-P", 1, 0, false);
        declareFunction(me, "gaf_cnfP", "GAF-CNF?", 1, 0, false);
        declareFunction(me, "clauses_p", "CLAUSES-P", 1, 0, false);
        declareFunction(me, "cnfs_p", "CNFS-P", 1, 0, false);
        declareFunction(me, "dnf_clauses_p", "DNF-CLAUSES-P", 1, 0, false);
        declareFunction(me, "make_cnf", "MAKE-CNF", 2, 0, false);
        declareFunction(me, "cnf_equal", "CNF-EQUAL", 2, 0, false);
        declareFunction(me, "cnf_formula", "CNF-FORMULA", 1, 1, false);
        declareFunction(me, "cnf_formula_from_clauses", "CNF-FORMULA-FROM-CLAUSES", 1, 0, false);
        declareFunction(me, "make_dnf", "MAKE-DNF", 2, 0, false);
        declareFunction(me, "literal_of_dnf", "LITERAL-OF-DNF", 3, 0, false);
        declareFunction(me, "dnf_formula", "DNF-FORMULA", 1, 0, false);
        declareFunction(me, "dnf_formula_from_clauses", "DNF-FORMULA-FROM-CLAUSES", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_clauses_file() {
        defparameter("*EMPTY-CLAUSE*", make_clause(NIL, NIL));
        return NIL;
    }

    public static SubLObject setup_clauses_file() {
        register_cyc_api_function(CLAUSE_P, $list1, $str2$Returns_T_iff_OBJECT_is_either_a_, NIL, $list3);
        register_cyc_api_function(MAKE_CLAUSE, $list6, $str7$Construct_a_clause_from_NEG_LITS_, $list8, $list9);
        register_cyc_api_function(NEG_LITS, $list11, $str12$Return_the_neg_lits_of_CLAUSE_, $list13, $list14);
        register_cyc_api_function(POS_LITS, $list11, $str16$Return_the_pos_lits_of_CLAUSE_, $list13, $list14);
        register_cyc_api_function(GROUND_CLAUSE_P, $list11, $str21$Return_T_iff_CLAUSE_is_a_ground_c, NIL, $list3);
        register_cyc_api_function(ATOMIC_CLAUSE_P, $list11, $str23$Return_T_iff_CLAUSE_is_an_atomic_, NIL, $list3);
        register_cyc_api_function(CLAUSE_EQUAL, $list25, $str26$Return_T_iff_CLAUSE1_and_CLAUSE2_, NIL, $list3);
        register_cyc_api_function(EMPTY_CLAUSE, NIL, $str28$Return_the_empty_clause_, NIL, $list9);
        register_cyc_api_function($sym29$EMPTY_CLAUSE_, $list11, $str30$Return_T_iff_CLAUSE_is_empty_, $list13, $list3);
        register_cyc_api_function(CLAUSE_LITERAL, $list33, $str34$Return_literal_in_CLAUSE_specifie, $list35, NIL);
        register_cyc_api_function(CLAUSE_WITHOUT_LITERAL, $list33, $str37$Return_a_new_clause_which_is_CLAU, $list35, $list9);
        register_cyc_api_function(CNF_P, $list1, $str39$Returns_T_iff_OBJECT_is_a_canonic, NIL, $list3);
        register_cyc_api_function($sym40$GAF_CNF_, $list41, $str42$Return_T_iff_CNF_is_a_cnf_represe, NIL, $list3);
        register_cyc_api_function(CNF_FORMULA, $list51, $str52$Return_a_readable_formula_of_CNF_, $list53, $list54);
        register_cyc_api_function(CNF_FORMULA_FROM_CLAUSES, $list56, $str57$Return_a_readable_formula_from_a_, $list58, $list54);
        register_cyc_api_function(DNF_FORMULA, $list61, $str62$Return_a_readable_formula_of_DNF_, NIL, $list54);
        register_cyc_api_function(DNF_FORMULA_FROM_CLAUSES, $list64, $str65$Return_a_readable_formula_from_a_, $list66, $list54);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_clauses_file();
    }

    @Override
    public void initializeVariables() {
        init_clauses_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_clauses_file();
    }

    static {





































































    }
}

/**
 * Total time: 174 ms
 */
