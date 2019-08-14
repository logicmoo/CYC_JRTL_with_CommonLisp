/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.el_utilities.ist_sentence_p;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
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
 * module:      CLAUSES
 * source file: /cyc/top/cycl/clauses.lisp
 * created:     2019/07/03 17:37:25
 */
public final class clauses extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new clauses();

 public static final String myName = "com.cyc.cycjava.cycl.clauses";


    // defparameter
    // The empty clause (commonly called 'box')
    /**
     * The empty clause (commonly called 'box')
     */
    @LispMethod(comment = "The empty clause (commonly called \'box\')\ndefparameter")
    private static final SubLSymbol $empty_clause$ = makeSymbol("*EMPTY-CLAUSE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol CLAUSE_P = makeSymbol("CLAUSE-P");

    static private final SubLList $list1 = list(makeSymbol("OBJECT"));

    static private final SubLString $str2$Returns_T_iff_OBJECT_is_either_a_ = makeString("Returns T iff OBJECT is either a CNF or DNF clause.");

    static private final SubLList $list3 = list(makeSymbol("BOOLEANP"));

    private static final SubLSymbol MAKE_CLAUSE = makeSymbol("MAKE-CLAUSE");

    static private final SubLList $list6 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));

    static private final SubLString $str7$Construct_a_clause_from_NEG_LITS_ = makeString("Construct a clause from NEG-LITS and POS-LITS, each of which are lists of literals.");

    static private final SubLList $list8 = list(list(makeSymbol("NEG-LITS"), makeSymbol("LISTP")), list(makeSymbol("POS-LITS"), makeSymbol("LISTP")));

    static private final SubLList $list9 = list(makeSymbol("CLAUSE-P"));

    static private final SubLList $list11 = list(makeSymbol("CLAUSE"));

    static private final SubLString $str12$Return_the_neg_lits_of_CLAUSE_ = makeString("Return the neg-lits of CLAUSE.");

    static private final SubLList $list13 = list(list(makeSymbol("CLAUSE"), makeSymbol("CLAUSE-P")));

    static private final SubLList $list14 = list(makeSymbol("LISTP"));

    static private final SubLString $str16$Return_the_pos_lits_of_CLAUSE_ = makeString("Return the pos-lits of CLAUSE.");

    private static final SubLSymbol GROUND_CLAUSE_P = makeSymbol("GROUND-CLAUSE-P");

    static private final SubLString $str21$Return_T_iff_CLAUSE_is_a_ground_c = makeString("Return T iff CLAUSE is a ground clause.");

    private static final SubLSymbol ATOMIC_CLAUSE_P = makeSymbol("ATOMIC-CLAUSE-P");

    static private final SubLString $str23$Return_T_iff_CLAUSE_is_an_atomic_ = makeString("Return T iff CLAUSE is an atomic clause.");

    private static final SubLSymbol CLAUSE_EQUAL = makeSymbol("CLAUSE-EQUAL");

    static private final SubLList $list25 = list(makeSymbol("CLAUSE1"), makeSymbol("CLAUSE2"));

    static private final SubLString $str26$Return_T_iff_CLAUSE1_and_CLAUSE2_ = makeString("Return T iff CLAUSE1 and CLAUSE2 are both equivalent ");

    private static final SubLSymbol EMPTY_CLAUSE = makeSymbol("EMPTY-CLAUSE");

    static private final SubLString $str28$Return_the_empty_clause_ = makeString("Return the empty clause.");

    static private final SubLSymbol $sym29$EMPTY_CLAUSE_ = makeSymbol("EMPTY-CLAUSE?");

    static private final SubLString $str30$Return_T_iff_CLAUSE_is_empty_ = makeString("Return T iff CLAUSE is empty.");

    private static final SubLSymbol CLAUSE_LITERAL = makeSymbol("CLAUSE-LITERAL");

    static private final SubLList $list33 = list(makeSymbol("CLAUSE"), makeSymbol("SENSE"), makeSymbol("NUM"));

    static private final SubLString $str34$Return_literal_in_CLAUSE_specifie = makeString("Return literal in CLAUSE specified by SENSE and NUM.\n  SENSE must be either :pos or :neg.");

    static private final SubLList $list35 = list(list(makeSymbol("CLAUSE"), makeSymbol("CLAUSE-P")), list(makeSymbol("SENSE"), makeSymbol("SENSE-P")), list(makeSymbol("NUM"), makeSymbol("INTEGERP")));

    private static final SubLSymbol CLAUSE_WITHOUT_LITERAL = makeSymbol("CLAUSE-WITHOUT-LITERAL");

    static private final SubLString $str37$Return_a_new_clause_which_is_CLAU = makeString("Return a new clause which is CLAUSE without the literal specified by SENSE and NUM.\n  SENSE must be either :pos or :neg.");

    static private final SubLString $str39$Returns_T_iff_OBJECT_is_a_canonic = makeString("Returns T iff OBJECT is a canonicalized CycL formula in conjunctive normal form.");

    static private final SubLSymbol $sym40$GAF_CNF_ = makeSymbol("GAF-CNF?");

    static private final SubLList $list41 = list(makeSymbol("CNF"));

    static private final SubLString $str42$Return_T_iff_CNF_is_a_cnf_represe = makeString("Return T iff CNF is a cnf representation of a gaf formula.");









    private static final SubLSymbol CNF_FORMULA = makeSymbol("CNF-FORMULA");

    static private final SubLList $list51 = list(makeSymbol("CNF"), makeSymbol("&OPTIONAL"), list(makeSymbol("TRUTH"), $TRUE));

    static private final SubLString $str52$Return_a_readable_formula_of_CNF_ = makeString("Return a readable formula of CNF\n   TRUTH only gets looked at for ground, single pos lit cnfs\n   in which case TRUTH gives the truth of the gaf.");

    static private final SubLList $list53 = list(list(makeSymbol("CNF"), makeSymbol("CNF-P")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));

    static private final SubLList $list54 = list(makeSymbol("EL-FORMULA-P"));

    private static final SubLSymbol CNF_FORMULA_FROM_CLAUSES = makeSymbol("CNF-FORMULA-FROM-CLAUSES");

    static private final SubLList $list56 = list(makeSymbol("CNF-CLAUSES"));

    static private final SubLString $str57$Return_a_readable_formula_from_a_ = makeString("Return a readable formula from a list of CNF-CLAUSES.");

    static private final SubLList $list58 = list(list(makeSymbol("CNF-CLAUSES"), makeSymbol("LISTP")));

    private static final SubLSymbol NEGATE = makeSymbol("NEGATE");

    private static final SubLSymbol DNF_FORMULA = makeSymbol("DNF-FORMULA");

    static private final SubLList $list61 = list(makeSymbol("DNF"));

    static private final SubLString $str62$Return_a_readable_formula_of_DNF_ = makeString("Return a readable formula of DNF.");

    private static final SubLSymbol DNF_FORMULA_FROM_CLAUSES = makeSymbol("DNF-FORMULA-FROM-CLAUSES");

    static private final SubLList $list64 = list(makeSymbol("DNF-CLAUSES"));

    static private final SubLString $str65$Return_a_readable_formula_from_a_ = makeString("Return a readable formula from a list of DNF-CLAUSES.");

    static private final SubLList $list66 = list(list(makeSymbol("DNF-CLAUSES"), makeSymbol("LISTP")));

    // Definitions
    /**
     * Returns T iff OBJECT is either a CNF or DNF clause.
     */
    @LispMethod(comment = "Returns T iff OBJECT is either a CNF or DNF clause.")
    public static final SubLObject clause_p_alt(SubLObject v_object) {
        return makeBoolean(((v_object.isList() && TWO_INTEGER.numE(length(v_object))) && v_object.first().isList()) && second(v_object).isList());
    }

    // Definitions
    /**
     * Returns T iff OBJECT is either a CNF or DNF clause.
     */
    @LispMethod(comment = "Returns T iff OBJECT is either a CNF or DNF clause.")
    public static SubLObject clause_p(final SubLObject v_object) {
        return makeBoolean(((v_object.isList() && TWO_INTEGER.numE(length(v_object))) && v_object.first().isList()) && second(v_object).isList());
    }

    /**
     * Construct a clause from NEG-LITS and POS-LITS, each of which are lists of literals.
     */
    @LispMethod(comment = "Construct a clause from NEG-LITS and POS-LITS, each of which are lists of literals.")
    public static final SubLObject make_clause_alt(SubLObject neg_lits, SubLObject pos_lits) {
        SubLTrampolineFile.checkType(neg_lits, LISTP);
        SubLTrampolineFile.checkType(pos_lits, LISTP);
        return list(neg_lits, pos_lits);
    }

    /**
     * Construct a clause from NEG-LITS and POS-LITS, each of which are lists of literals.
     */
    @LispMethod(comment = "Construct a clause from NEG-LITS and POS-LITS, each of which are lists of literals.")
    public static SubLObject make_clause(final SubLObject neg_lits, final SubLObject pos_lits) {
        SubLTrampolineFile.enforceType(neg_lits, LISTP);
        SubLTrampolineFile.enforceType(pos_lits, LISTP);
        return list(neg_lits, pos_lits);
    }

    /**
     * Return the neg-lits of CLAUSE.
     */
    @LispMethod(comment = "Return the neg-lits of CLAUSE.")
    public static final SubLObject neg_lits_alt(SubLObject clause) {
        SubLTrampolineFile.checkType(clause, CLAUSE_P);
        return clause.first();
    }

    /**
     * Return the neg-lits of CLAUSE.
     */
    @LispMethod(comment = "Return the neg-lits of CLAUSE.")
    public static SubLObject neg_lits(final SubLObject clause) {
        SubLTrampolineFile.enforceType(clause, CLAUSE_P);
        return clause.first();
    }

    /**
     * Destructively modify the neg-lits of CLAUSE to be NEG-LITS.
     */
    @LispMethod(comment = "Destructively modify the neg-lits of CLAUSE to be NEG-LITS.")
    public static final SubLObject set_clause_neg_lits_alt(SubLObject clause, SubLObject neg_lits) {
        rplaca(clause, neg_lits);
        return clause;
    }

    /**
     * Destructively modify the neg-lits of CLAUSE to be NEG-LITS.
     */
    @LispMethod(comment = "Destructively modify the neg-lits of CLAUSE to be NEG-LITS.")
    public static SubLObject set_clause_neg_lits(final SubLObject clause, final SubLObject neg_lits) {
        rplaca(clause, neg_lits);
        return clause;
    }

    /**
     * Return the pos-lits of CLAUSE.
     */
    @LispMethod(comment = "Return the pos-lits of CLAUSE.")
    public static final SubLObject pos_lits_alt(SubLObject clause) {
        SubLTrampolineFile.checkType(clause, CLAUSE_P);
        return second(clause);
    }

    /**
     * Return the pos-lits of CLAUSE.
     */
    @LispMethod(comment = "Return the pos-lits of CLAUSE.")
    public static SubLObject pos_lits(final SubLObject clause) {
        SubLTrampolineFile.enforceType(clause, CLAUSE_P);
        return second(clause);
    }

    /**
     * Destructively modify the pos-lits of CLAUSE to be POS-LITS.
     */
    @LispMethod(comment = "Destructively modify the pos-lits of CLAUSE to be POS-LITS.")
    public static final SubLObject set_clause_pos_lits_alt(SubLObject clause, SubLObject pos_lits) {
        rplaca(clause.rest(), pos_lits);
        return clause;
    }

    /**
     * Destructively modify the pos-lits of CLAUSE to be POS-LITS.
     */
    @LispMethod(comment = "Destructively modify the pos-lits of CLAUSE to be POS-LITS.")
    public static SubLObject set_clause_pos_lits(final SubLObject clause, final SubLObject pos_lits) {
        rplaca(clause.rest(), pos_lits);
        return clause;
    }

    /**
     * Return the SENSE literal list of CLAUSE.
     */
    @LispMethod(comment = "Return the SENSE literal list of CLAUSE.")
    public static final SubLObject clause_sense_lits_alt(SubLObject clause, SubLObject sense) {
        SubLTrampolineFile.checkType(clause, CLAUSE_P);
        SubLTrampolineFile.checkType(sense, SENSE_P);
        {
            SubLObject pcase_var = sense;
            if (pcase_var.eql($NEG)) {
                return com.cyc.cycjava.cycl.clauses.neg_lits(clause);
            } else {
                if (pcase_var.eql($POS)) {
                    return com.cyc.cycjava.cycl.clauses.pos_lits(clause);
                }
            }
        }
        return NIL;
    }

    /**
     * Return the SENSE literal list of CLAUSE.
     */
    @LispMethod(comment = "Return the SENSE literal list of CLAUSE.")
    public static SubLObject clause_sense_lits(final SubLObject clause, final SubLObject sense) {
        assert NIL != clause_p(clause) : "! clauses.clause_p(clause) " + ("clauses.clause_p(clause) " + "CommonSymbols.NIL != clauses.clause_p(clause) ") + clause;
        assert NIL != enumeration_types.sense_p(sense) : "! enumeration_types.sense_p(sense) " + ("enumeration_types.sense_p(sense) " + "CommonSymbols.NIL != enumeration_types.sense_p(sense) ") + sense;
        if (sense.eql($NEG)) {
            return neg_lits(clause);
        }
        if (sense.eql($POS)) {
            return pos_lits(clause);
        }
        return NIL;
    }

    /**
     * Return T iff CLAUSE is a ground clause.
     */
    @LispMethod(comment = "Return T iff CLAUSE is a ground clause.")
    public static final SubLObject ground_clause_p_alt(SubLObject clause) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.clauses.clause_p(clause)) && (NIL != variables.fully_bound_p(clause)));
    }

    /**
     * Return T iff CLAUSE is a ground clause.
     */
    @LispMethod(comment = "Return T iff CLAUSE is a ground clause.")
    public static SubLObject ground_clause_p(final SubLObject clause) {
        return makeBoolean((NIL != clause_p(clause)) && (NIL != variables.fully_bound_p(clause)));
    }

    /**
     * Return T iff CLAUSE is an atomic clause.
     */
    @LispMethod(comment = "Return T iff CLAUSE is an atomic clause.")
    public static final SubLObject atomic_clause_p_alt(SubLObject clause) {
        if (NIL != com.cyc.cycjava.cycl.clauses.clause_p(clause)) {
            {
                SubLObject neg_lits = com.cyc.cycjava.cycl.clauses.neg_lits(clause);
                SubLObject pos_lits = com.cyc.cycjava.cycl.clauses.pos_lits(clause);
                return makeBoolean(((NIL == neg_lits) && (NIL != list_utilities.singletonP(pos_lits))) || ((NIL == pos_lits) && (NIL != list_utilities.singletonP(neg_lits))));
            }
        }
        return NIL;
    }

    /**
     * Return T iff CLAUSE is an atomic clause.
     */
    @LispMethod(comment = "Return T iff CLAUSE is an atomic clause.")
    public static SubLObject atomic_clause_p(final SubLObject clause) {
        if (NIL != clause_p(clause)) {
            final SubLObject neg_lits = neg_lits(clause);
            final SubLObject pos_lits = pos_lits(clause);
            return makeBoolean(((NIL == neg_lits) && (NIL != list_utilities.singletonP(pos_lits))) || ((NIL == pos_lits) && (NIL != list_utilities.singletonP(neg_lits))));
        }
        return NIL;
    }

    /**
     * Return T iff CLAUSE is a clause that expresses a lifting rule between mts.
     */
    @LispMethod(comment = "Return T iff CLAUSE is a clause that expresses a lifting rule between mts.")
    public static final SubLObject lifting_clause_p_alt(SubLObject clause) {
        if (NIL != com.cyc.cycjava.cycl.clauses.clause_p(clause)) {
            {
                SubLObject index_var = ZERO_INTEGER;
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.clauses.neg_lits(clause);
                SubLObject asent = NIL;
                for (asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , asent = cdolist_list_var.first()) {
                    {
                        SubLObject sense = $NEG;
                        if (NIL != ist_sentence_p(asent)) {
                            return T;
                        }
                    }
                    index_var = add(index_var, ONE_INTEGER);
                }
            }
            {
                SubLObject index_var = ZERO_INTEGER;
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.clauses.pos_lits(clause);
                SubLObject asent = NIL;
                for (asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , asent = cdolist_list_var.first()) {
                    {
                        SubLObject sense = $POS;
                        if (NIL != ist_sentence_p(asent)) {
                            return T;
                        }
                    }
                    index_var = add(index_var, ONE_INTEGER);
                }
            }
        }
        return NIL;
    }

    /**
     * Return T iff CLAUSE is a clause that expresses a lifting rule between mts.
     */
    @LispMethod(comment = "Return T iff CLAUSE is a clause that expresses a lifting rule between mts.")
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

    /**
     * Return T iff CLAUSE1 and CLAUSE2 are both equivalent clauses.
     */
    @LispMethod(comment = "Return T iff CLAUSE1 and CLAUSE2 are both equivalent clauses.")
    public static final SubLObject clause_equal_alt(SubLObject clause1, SubLObject clause2) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.clauses.clause_p(clause1)) && clause1.equal(clause2));
    }

    /**
     * Return T iff CLAUSE1 and CLAUSE2 are both equivalent clauses.
     */
    @LispMethod(comment = "Return T iff CLAUSE1 and CLAUSE2 are both equivalent clauses.")
    public static SubLObject clause_equal(final SubLObject clause1, final SubLObject clause2) {
        return makeBoolean((NIL != clause_p(clause1)) && clause1.equal(clause2));
    }

    /**
     * Return the empty clause.
     */
    @LispMethod(comment = "Return the empty clause.")
    public static final SubLObject empty_clause_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $empty_clause$.getDynamicValue(thread);
        }
    }

    /**
     * Return the empty clause.
     */
    @LispMethod(comment = "Return the empty clause.")
    public static SubLObject empty_clause() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $empty_clause$.getDynamicValue(thread);
    }

    /**
     * Return T iff CLAUSE is empty.
     */
    @LispMethod(comment = "Return T iff CLAUSE is empty.")
    public static final SubLObject empty_clauseP_alt(SubLObject clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(clause, CLAUSE_P);
            return com.cyc.cycjava.cycl.clauses.clause_equal(clause, $empty_clause$.getDynamicValue(thread));
        }
    }

    /**
     * Return T iff CLAUSE is empty.
     */
    @LispMethod(comment = "Return T iff CLAUSE is empty.")
    public static SubLObject empty_clauseP(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(clause, CLAUSE_P);
        return clause_equal(clause, $empty_clause$.getDynamicValue(thread));
    }

    /**
     * Return literal in CLAUSE specified by SENSE and NUM.
     * SENSE must be either :pos or :neg.
     */
    @LispMethod(comment = "Return literal in CLAUSE specified by SENSE and NUM.\r\nSENSE must be either :pos or :neg.\nReturn literal in CLAUSE specified by SENSE and NUM.\nSENSE must be either :pos or :neg.")
    public static final SubLObject clause_literal_alt(SubLObject clause, SubLObject sense, SubLObject num) {
        SubLTrampolineFile.checkType(clause, CLAUSE_P);
        SubLTrampolineFile.checkType(sense, SENSE_P);
        SubLTrampolineFile.checkType(num, INTEGERP);
        return nth(num, sense == $POS ? ((SubLObject) (com.cyc.cycjava.cycl.clauses.pos_lits(clause))) : com.cyc.cycjava.cycl.clauses.neg_lits(clause));
    }

    /**
     * Return literal in CLAUSE specified by SENSE and NUM.
     * SENSE must be either :pos or :neg.
     */
    @LispMethod(comment = "Return literal in CLAUSE specified by SENSE and NUM.\r\nSENSE must be either :pos or :neg.\nReturn literal in CLAUSE specified by SENSE and NUM.\nSENSE must be either :pos or :neg.")
    public static SubLObject clause_literal(final SubLObject clause, final SubLObject sense, final SubLObject num) {
        SubLTrampolineFile.enforceType(clause, CLAUSE_P);
        SubLTrampolineFile.enforceType(sense, SENSE_P);
        SubLTrampolineFile.enforceType(num, INTEGERP);
        return nth(num, sense == $POS ? pos_lits(clause) : neg_lits(clause));
    }

    /**
     * Return a new clause which is CLAUSE without the literal specified by SENSE and NUM.
     * SENSE must be either :pos or :neg.
     */
    @LispMethod(comment = "Return a new clause which is CLAUSE without the literal specified by SENSE and NUM.\r\nSENSE must be either :pos or :neg.\nReturn a new clause which is CLAUSE without the literal specified by SENSE and NUM.\nSENSE must be either :pos or :neg.")
    public static final SubLObject clause_without_literal_alt(SubLObject clause, SubLObject sense, SubLObject num) {
        SubLTrampolineFile.checkType(clause, CLAUSE_P);
        SubLTrampolineFile.checkType(sense, SENSE_P);
        SubLTrampolineFile.checkType(num, INTEGERP);
        {
            SubLObject neg_lits = copy_tree(com.cyc.cycjava.cycl.clauses.neg_lits(clause));
            SubLObject pos_lits = copy_tree(com.cyc.cycjava.cycl.clauses.pos_lits(clause));
            if (sense == $POS) {
                pos_lits = list_utilities.delete_nth(num, pos_lits);
            } else {
                neg_lits = list_utilities.delete_nth(num, neg_lits);
            }
            return com.cyc.cycjava.cycl.clauses.make_clause(neg_lits, pos_lits);
        }
    }

    /**
     * Return a new clause which is CLAUSE without the literal specified by SENSE and NUM.
     * SENSE must be either :pos or :neg.
     */
    @LispMethod(comment = "Return a new clause which is CLAUSE without the literal specified by SENSE and NUM.\r\nSENSE must be either :pos or :neg.\nReturn a new clause which is CLAUSE without the literal specified by SENSE and NUM.\nSENSE must be either :pos or :neg.")
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

    /**
     * Construct an xnf (either cnf or dnf) clause from NEG-LITS and POS-LITS, each of which are lists of literals.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Construct an xnf (either cnf or dnf) clause from NEG-LITS and POS-LITS, each of which are lists of literals.\r\n\r\n@unknown pace")
    public static final SubLObject make_xnf_alt(SubLObject neg_lits, SubLObject pos_lits) {
        return com.cyc.cycjava.cycl.clauses.make_clause(neg_lits, pos_lits);
    }

    /**
     * Construct an xnf (either cnf or dnf) clause from NEG-LITS and POS-LITS, each of which are lists of literals.
     *
     * @unknown pace
     */
    @LispMethod(comment = "Construct an xnf (either cnf or dnf) clause from NEG-LITS and POS-LITS, each of which are lists of literals.\r\n\r\n@unknown pace")
    public static SubLObject make_xnf(final SubLObject neg_lits, final SubLObject pos_lits) {
        return make_clause(neg_lits, pos_lits);
    }

    /**
     * Returns T iff OBJECT is a canonicalized CycL formula in conjunctive normal form.
     */
    @LispMethod(comment = "Returns T iff OBJECT is a canonicalized CycL formula in conjunctive normal form.")
    public static final SubLObject cnf_p_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.clauses.clause_p(v_object);
    }

    /**
     * Returns T iff OBJECT is a canonicalized CycL formula in conjunctive normal form.
     */
    @LispMethod(comment = "Returns T iff OBJECT is a canonicalized CycL formula in conjunctive normal form.")
    public static SubLObject cnf_p(final SubLObject v_object) {
        return clause_p(v_object);
    }

    /**
     * Returns T iff OBJECT is a canonicalized CycL formula in disjunctive normal form.
     */
    @LispMethod(comment = "Returns T iff OBJECT is a canonicalized CycL formula in disjunctive normal form.")
    public static final SubLObject dnf_p_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.clauses.clause_p(v_object);
    }

    /**
     * Returns T iff OBJECT is a canonicalized CycL formula in disjunctive normal form.
     */
    @LispMethod(comment = "Returns T iff OBJECT is a canonicalized CycL formula in disjunctive normal form.")
    public static SubLObject dnf_p(final SubLObject v_object) {
        return clause_p(v_object);
    }

    /**
     * Return T iff CNF is a cnf representation of a gaf formula.
     */
    @LispMethod(comment = "Return T iff CNF is a cnf representation of a gaf formula.")
    public static final SubLObject gaf_cnfP_alt(SubLObject cnf) {
        return makeBoolean((NIL != clause_utilities.pos_atomic_cnf_p(cnf)) && (NIL != com.cyc.cycjava.cycl.clauses.ground_clause_p(cnf)));
    }

    /**
     * Return T iff CNF is a cnf representation of a gaf formula.
     */
    @LispMethod(comment = "Return T iff CNF is a cnf representation of a gaf formula.")
    public static SubLObject gaf_cnfP(final SubLObject cnf) {
        return makeBoolean((NIL != clause_utilities.pos_atomic_cnf_p(cnf)) && (NIL != ground_clause_p(cnf)));
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a non-empty list of CNF clauses.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a non-empty list of CNF clauses.")
    public static final SubLObject clauses_p_alt(SubLObject v_object) {
        if (NIL != list_utilities.non_dotted_list_p(v_object)) {
            {
                SubLObject cdolist_list_var = v_object;
                SubLObject clause = NIL;
                for (clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , clause = cdolist_list_var.first()) {
                    if (NIL == com.cyc.cycjava.cycl.clauses.cnf_p(clause)) {
                        return NIL;
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a non-empty list of CNF clauses.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a non-empty list of CNF clauses.")
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

    /**
     *
     *
     * @return boolean; t iff OBJECT is a non-empty list of DNF clauses.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a non-empty list of DNF clauses.")
    public static final SubLObject dnf_clauses_p_alt(SubLObject v_object) {
        if (NIL != list_utilities.non_dotted_list_p(v_object)) {
            {
                SubLObject cdolist_list_var = v_object;
                SubLObject clause = NIL;
                for (clause = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , clause = cdolist_list_var.first()) {
                    if (NIL == com.cyc.cycjava.cycl.clauses.dnf_p(clause)) {
                        return NIL;
                    }
                }
            }
            return T;
        }
        return NIL;
    }

    /**
     *
     *
     * @return boolean; t iff OBJECT is a non-empty list of DNF clauses.
     */
    @LispMethod(comment = "@return boolean; t iff OBJECT is a non-empty list of DNF clauses.")
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

    /**
     * Construct a cnf clause from NEG-LITS and POS-LITS, each of which are lists of literals.
     */
    @LispMethod(comment = "Construct a cnf clause from NEG-LITS and POS-LITS, each of which are lists of literals.")
    public static final SubLObject make_cnf_alt(SubLObject neg_lits, SubLObject pos_lits) {
        return com.cyc.cycjava.cycl.clauses.make_clause(neg_lits, pos_lits);
    }

    /**
     * Construct a cnf clause from NEG-LITS and POS-LITS, each of which are lists of literals.
     */
    @LispMethod(comment = "Construct a cnf clause from NEG-LITS and POS-LITS, each of which are lists of literals.")
    public static SubLObject make_cnf(final SubLObject neg_lits, final SubLObject pos_lits) {
        return make_clause(neg_lits, pos_lits);
    }

    public static final SubLObject cnf_equal_alt(SubLObject cnf1, SubLObject cnf2) {
        return com.cyc.cycjava.cycl.clauses.clause_equal(cnf1, cnf2);
    }

    public static SubLObject cnf_equal(final SubLObject cnf1, final SubLObject cnf2) {
        return clause_equal(cnf1, cnf2);
    }

    /**
     * Return a readable formula of CNF
     * TRUTH only gets looked at for ground, single pos lit cnfs
     * in which case TRUTH gives the truth of the gaf.
     */
    @LispMethod(comment = "Return a readable formula of CNF\r\nTRUTH only gets looked at for ground, single pos lit cnfs\r\nin which case TRUTH gives the truth of the gaf.\nReturn a readable formula of CNF\nTRUTH only gets looked at for ground, single pos lit cnfs\nin which case TRUTH gives the truth of the gaf.")
    public static final SubLObject cnf_formula_alt(SubLObject cnf, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        SubLTrampolineFile.checkType(cnf, CNF_P);
        SubLTrampolineFile.checkType(truth, TRUTH_P);
        cnf = czer_utilities.possibly_escape_quote_hl_vars(cnf, UNPROVIDED);
        {
            SubLObject pos_lits = com.cyc.cycjava.cycl.clauses.pos_lits(cnf);
            SubLObject neg_lits = com.cyc.cycjava.cycl.clauses.neg_lits(cnf);
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
            } else {
                if (NIL != neg_lits) {
                    return list($$not, neg_lits);
                } else {
                    if (NIL != pos_lits) {
                        if (((NIL != com.cyc.cycjava.cycl.clauses.pos_lits(cnf).rest()) || (NIL == variables.fully_bound_p(pos_lits))) || (truth != $FALSE)) {
                            return pos_lits;
                        } else {
                            return list($$not, pos_lits);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Return a readable formula of CNF
     * TRUTH only gets looked at for ground, single pos lit cnfs
     * in which case TRUTH gives the truth of the gaf.
     */
    @LispMethod(comment = "Return a readable formula of CNF\r\nTRUTH only gets looked at for ground, single pos lit cnfs\r\nin which case TRUTH gives the truth of the gaf.\nReturn a readable formula of CNF\nTRUTH only gets looked at for ground, single pos lit cnfs\nin which case TRUTH gives the truth of the gaf.")
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

    /**
     * Return a readable formula from a list of CNF-CLAUSES.
     */
    @LispMethod(comment = "Return a readable formula from a list of CNF-CLAUSES.")
    public static final SubLObject cnf_formula_from_clauses_alt(SubLObject cnf_clauses) {
        SubLTrampolineFile.checkType(cnf_clauses, LISTP);
        SubLTrampolineFile.checkType(cnf_clauses, LISTP);
        if (length(cnf_clauses).numE(ONE_INTEGER)) {
            return com.cyc.cycjava.cycl.clauses.cnf_formula(cnf_clauses.first(), UNPROVIDED);
        } else {
            return bq_cons($$and, append(Mapping.mapcar(symbol_function(CNF_FORMULA), cnf_clauses), NIL));
        }
    }

    /**
     * Return a readable formula from a list of CNF-CLAUSES.
     */
    @LispMethod(comment = "Return a readable formula from a list of CNF-CLAUSES.")
    public static SubLObject cnf_formula_from_clauses(final SubLObject cnf_clauses) {
        SubLTrampolineFile.enforceType(cnf_clauses, LISTP);
        assert NIL != listp(cnf_clauses) : "! listp(cnf_clauses) " + ("Types.listp(cnf_clauses) " + "CommonSymbols.NIL != Types.listp(cnf_clauses) ") + cnf_clauses;
        if (length(cnf_clauses).numE(ONE_INTEGER)) {
            return cnf_formula(cnf_clauses.first(), UNPROVIDED);
        }
        return bq_cons($$and, append(Mapping.mapcar(symbol_function(CNF_FORMULA), cnf_clauses), NIL));
    }

    /**
     * Construct a dnf clause from NEG-LITS and POS-LITS, each of which are lists of literals.
     */
    @LispMethod(comment = "Construct a dnf clause from NEG-LITS and POS-LITS, each of which are lists of literals.")
    public static final SubLObject make_dnf_alt(SubLObject neg_lits, SubLObject pos_lits) {
        return com.cyc.cycjava.cycl.clauses.make_clause(neg_lits, pos_lits);
    }

    /**
     * Construct a dnf clause from NEG-LITS and POS-LITS, each of which are lists of literals.
     */
    @LispMethod(comment = "Construct a dnf clause from NEG-LITS and POS-LITS, each of which are lists of literals.")
    public static SubLObject make_dnf(final SubLObject neg_lits, final SubLObject pos_lits) {
        return make_clause(neg_lits, pos_lits);
    }

    public static final SubLObject literal_of_dnf_alt(SubLObject dnf, SubLObject sense, SubLObject num) {
        return com.cyc.cycjava.cycl.clauses.clause_literal(dnf, sense, num);
    }

    public static SubLObject literal_of_dnf(final SubLObject dnf, final SubLObject sense, final SubLObject num) {
        return clause_literal(dnf, sense, num);
    }

    /**
     * Return a readable formula of DNF.
     */
    @LispMethod(comment = "Return a readable formula of DNF.")
    public static final SubLObject dnf_formula_alt(SubLObject dnf) {
        {
            SubLObject pos_lits = com.cyc.cycjava.cycl.clauses.pos_lits(dnf);
            SubLObject neg_lits = Mapping.mapcar(symbol_function(NEGATE), com.cyc.cycjava.cycl.clauses.neg_lits(dnf));
            if (NIL == neg_lits) {
                if (NIL != pos_lits.rest()) {
                    return bq_cons($$and, append(pos_lits, NIL));
                } else {
                    return pos_lits.first();
                }
            } else {
                if (NIL == pos_lits) {
                    if (NIL != neg_lits.rest()) {
                        return bq_cons($$and, append(neg_lits, NIL));
                    } else {
                        return neg_lits.first();
                    }
                } else {
                    return bq_cons($$and, append(append(neg_lits, pos_lits), NIL));
                }
            }
        }
    }

    /**
     * Return a readable formula of DNF.
     */
    @LispMethod(comment = "Return a readable formula of DNF.")
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

    /**
     * Return a readable formula from a list of DNF-CLAUSES.
     */
    @LispMethod(comment = "Return a readable formula from a list of DNF-CLAUSES.")
    public static final SubLObject dnf_formula_from_clauses_alt(SubLObject dnf_clauses) {
        SubLTrampolineFile.checkType(dnf_clauses, LISTP);
        SubLTrampolineFile.checkType(dnf_clauses, LISTP);
        if (length(dnf_clauses).numE(ONE_INTEGER)) {
            return com.cyc.cycjava.cycl.clauses.dnf_formula(dnf_clauses.first());
        } else {
            return bq_cons($$or, append(Mapping.mapcar(symbol_function(DNF_FORMULA), dnf_clauses), NIL));
        }
    }

    /**
     * Return a readable formula from a list of DNF-CLAUSES.
     */
    @LispMethod(comment = "Return a readable formula from a list of DNF-CLAUSES.")
    public static SubLObject dnf_formula_from_clauses(final SubLObject dnf_clauses) {
        SubLTrampolineFile.enforceType(dnf_clauses, LISTP);
        assert NIL != listp(dnf_clauses) : "! listp(dnf_clauses) " + ("Types.listp(dnf_clauses) " + "CommonSymbols.NIL != Types.listp(dnf_clauses) ") + dnf_clauses;
        if (length(dnf_clauses).numE(ONE_INTEGER)) {
            return dnf_formula(dnf_clauses.first());
        }
        return uncanonicalizer.implications_in(bq_cons($$or, append(Mapping.mapcar(symbol_function(DNF_FORMULA), dnf_clauses), NIL)));
    }

    public static SubLObject declare_clauses_file() {
        declareFunction("clause_p", "CLAUSE-P", 1, 0, false);
        declareFunction("make_clause", "MAKE-CLAUSE", 2, 0, false);
        declareFunction("neg_lits", "NEG-LITS", 1, 0, false);
        declareFunction("set_clause_neg_lits", "SET-CLAUSE-NEG-LITS", 2, 0, false);
        declareFunction("pos_lits", "POS-LITS", 1, 0, false);
        declareFunction("set_clause_pos_lits", "SET-CLAUSE-POS-LITS", 2, 0, false);
        declareFunction("clause_sense_lits", "CLAUSE-SENSE-LITS", 2, 0, false);
        declareFunction("ground_clause_p", "GROUND-CLAUSE-P", 1, 0, false);
        declareFunction("atomic_clause_p", "ATOMIC-CLAUSE-P", 1, 0, false);
        declareFunction("lifting_clause_p", "LIFTING-CLAUSE-P", 1, 0, false);
        declareFunction("clause_equal", "CLAUSE-EQUAL", 2, 0, false);
        declareFunction("empty_clause", "EMPTY-CLAUSE", 0, 0, false);
        declareFunction("empty_clauseP", "EMPTY-CLAUSE?", 1, 0, false);
        declareFunction("clause_literal", "CLAUSE-LITERAL", 3, 0, false);
        declareFunction("clause_without_literal", "CLAUSE-WITHOUT-LITERAL", 3, 0, false);
        declareFunction("singleton_clause_literal", "SINGLETON-CLAUSE-LITERAL", 1, 0, false);
        declareFunction("make_xnf", "MAKE-XNF", 2, 0, false);
        declareFunction("cnf_p", "CNF-P", 1, 0, false);
        declareFunction("dnf_p", "DNF-P", 1, 0, false);
        declareFunction("gaf_cnfP", "GAF-CNF?", 1, 0, false);
        declareFunction("clauses_p", "CLAUSES-P", 1, 0, false);
        declareFunction("cnfs_p", "CNFS-P", 1, 0, false);
        declareFunction("dnf_clauses_p", "DNF-CLAUSES-P", 1, 0, false);
        declareFunction("make_cnf", "MAKE-CNF", 2, 0, false);
        declareFunction("cnf_equal", "CNF-EQUAL", 2, 0, false);
        declareFunction("cnf_formula", "CNF-FORMULA", 1, 1, false);
        declareFunction("cnf_formula_from_clauses", "CNF-FORMULA-FROM-CLAUSES", 1, 0, false);
        declareFunction("make_dnf", "MAKE-DNF", 2, 0, false);
        declareFunction("literal_of_dnf", "LITERAL-OF-DNF", 3, 0, false);
        declareFunction("dnf_formula", "DNF-FORMULA", 1, 0, false);
        declareFunction("dnf_formula_from_clauses", "DNF-FORMULA-FROM-CLAUSES", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt1 = list(makeSymbol("OBJECT"));

    static private final SubLString $str_alt2$Returns_T_iff_OBJECT_is_either_a_ = makeString("Returns T iff OBJECT is either a CNF or DNF clause.");

    static private final SubLList $list_alt3 = list(makeSymbol("BOOLEANP"));

    static private final SubLList $list_alt6 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));

    static private final SubLString $str_alt7$Construct_a_clause_from_NEG_LITS_ = makeString("Construct a clause from NEG-LITS and POS-LITS, each of which are lists of literals.");

    static private final SubLList $list_alt8 = list(list(makeSymbol("NEG-LITS"), makeSymbol("LISTP")), list(makeSymbol("POS-LITS"), makeSymbol("LISTP")));

    static private final SubLList $list_alt9 = list(makeSymbol("CLAUSE-P"));

    static private final SubLList $list_alt11 = list(makeSymbol("CLAUSE"));

    static private final SubLString $str_alt12$Return_the_neg_lits_of_CLAUSE_ = makeString("Return the neg-lits of CLAUSE.");

    static private final SubLList $list_alt13 = list(list(makeSymbol("CLAUSE"), makeSymbol("CLAUSE-P")));

    static private final SubLList $list_alt14 = list(makeSymbol("LISTP"));

    static private final SubLString $str_alt16$Return_the_pos_lits_of_CLAUSE_ = makeString("Return the pos-lits of CLAUSE.");

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

    static private final SubLString $str_alt21$Return_T_iff_CLAUSE_is_a_ground_c = makeString("Return T iff CLAUSE is a ground clause.");

    static private final SubLString $str_alt23$Return_T_iff_CLAUSE_is_an_atomic_ = makeString("Return T iff CLAUSE is an atomic clause.");

    static private final SubLList $list_alt25 = list(makeSymbol("CLAUSE1"), makeSymbol("CLAUSE2"));

    static private final SubLString $str_alt26$Return_T_iff_CLAUSE1_and_CLAUSE2_ = makeString("Return T iff CLAUSE1 and CLAUSE2 are both equivalent clauses.");

    static private final SubLString $str_alt28$Return_the_empty_clause_ = makeString("Return the empty clause.");

    static private final SubLString $str_alt30$Return_T_iff_CLAUSE_is_empty_ = makeString("Return T iff CLAUSE is empty.");

    static private final SubLList $list_alt33 = list(makeSymbol("CLAUSE"), makeSymbol("SENSE"), makeSymbol("NUM"));

    static private final SubLString $str_alt34$Return_literal_in_CLAUSE_specifie = makeString("Return literal in CLAUSE specified by SENSE and NUM.\n  SENSE must be either :pos or :neg.");

    static private final SubLList $list_alt35 = list(list(makeSymbol("CLAUSE"), makeSymbol("CLAUSE-P")), list(makeSymbol("SENSE"), makeSymbol("SENSE-P")), list(makeSymbol("NUM"), makeSymbol("INTEGERP")));

    static private final SubLString $str_alt37$Return_a_new_clause_which_is_CLAU = makeString("Return a new clause which is CLAUSE without the literal specified by SENSE and NUM.\n  SENSE must be either :pos or :neg.");

    @Override
    public void declareFunctions() {
        declare_clauses_file();
    }

    static private final SubLString $str_alt39$Returns_T_iff_OBJECT_is_a_canonic = makeString("Returns T iff OBJECT is a canonicalized CycL formula in conjunctive normal form.");

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

    static private final SubLList $list_alt41 = list(makeSymbol("CNF"));

    static private final SubLString $str_alt42$Return_T_iff_CNF_is_a_cnf_represe = makeString("Return T iff CNF is a cnf representation of a gaf formula.");

    static private final SubLList $list_alt51 = list(makeSymbol("CNF"), makeSymbol("&OPTIONAL"), list(makeSymbol("TRUTH"), $TRUE));

    static private final SubLString $str_alt52$Return_a_readable_formula_of_CNF_ = makeString("Return a readable formula of CNF\n   TRUTH only gets looked at for ground, single pos lit cnfs\n   in which case TRUTH gives the truth of the gaf.");

    static private final SubLList $list_alt53 = list(list(makeSymbol("CNF"), makeSymbol("CNF-P")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));

    static private final SubLList $list_alt54 = list(makeSymbol("EL-FORMULA-P"));

    static private final SubLList $list_alt56 = list(makeSymbol("CNF-CLAUSES"));

    static private final SubLString $str_alt57$Return_a_readable_formula_from_a_ = makeString("Return a readable formula from a list of CNF-CLAUSES.");

    static private final SubLList $list_alt58 = list(list(makeSymbol("CNF-CLAUSES"), makeSymbol("LISTP")));

    static private final SubLList $list_alt61 = list(makeSymbol("DNF"));

    static private final SubLString $str_alt62$Return_a_readable_formula_of_DNF_ = makeString("Return a readable formula of DNF.");

    static private final SubLList $list_alt64 = list(makeSymbol("DNF-CLAUSES"));

    static private final SubLString $str_alt65$Return_a_readable_formula_from_a_ = makeString("Return a readable formula from a list of DNF-CLAUSES.");

    static private final SubLList $list_alt66 = list(list(makeSymbol("DNF-CLAUSES"), makeSymbol("LISTP")));
}

/**
 * Total time: 174 ms
 */
