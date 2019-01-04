package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class clauses extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.clauses";
    public static final String myFingerPrint = "6984aec1cb596f013d91bd8244382fad1d07257204f2d73ee0e7618c0ea52cc0";
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 3284L)
    private static SubLSymbol $empty_clause$;
    private static final SubLSymbol $sym0$CLAUSE_P;
    private static final SubLList $list1;
    private static final SubLString $str2$Returns_T_iff_OBJECT_is_either_a_;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$LISTP;
    private static final SubLSymbol $sym5$MAKE_CLAUSE;
    private static final SubLList $list6;
    private static final SubLString $str7$Construct_a_clause_from_NEG_LITS_;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLSymbol $sym10$NEG_LITS;
    private static final SubLList $list11;
    private static final SubLString $str12$Return_the_neg_lits_of_CLAUSE_;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$POS_LITS;
    private static final SubLString $str16$Return_the_pos_lits_of_CLAUSE_;
    private static final SubLSymbol $sym17$SENSE_P;
    private static final SubLSymbol $kw18$NEG;
    private static final SubLSymbol $kw19$POS;
    private static final SubLSymbol $sym20$GROUND_CLAUSE_P;
    private static final SubLString $str21$Return_T_iff_CLAUSE_is_a_ground_c;
    private static final SubLSymbol $sym22$ATOMIC_CLAUSE_P;
    private static final SubLString $str23$Return_T_iff_CLAUSE_is_an_atomic_;
    private static final SubLSymbol $sym24$CLAUSE_EQUAL;
    private static final SubLList $list25;
    private static final SubLString $str26$Return_T_iff_CLAUSE1_and_CLAUSE2_;
    private static final SubLSymbol $sym27$EMPTY_CLAUSE;
    private static final SubLString $str28$Return_the_empty_clause_;
    private static final SubLSymbol $sym29$EMPTY_CLAUSE_;
    private static final SubLString $str30$Return_T_iff_CLAUSE_is_empty_;
    private static final SubLSymbol $sym31$INTEGERP;
    private static final SubLSymbol $sym32$CLAUSE_LITERAL;
    private static final SubLList $list33;
    private static final SubLString $str34$Return_literal_in_CLAUSE_specifie;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$CLAUSE_WITHOUT_LITERAL;
    private static final SubLString $str37$Return_a_new_clause_which_is_CLAU;
    private static final SubLSymbol $sym38$CNF_P;
    private static final SubLString $str39$Returns_T_iff_OBJECT_is_a_canonic;
    private static final SubLSymbol $sym40$GAF_CNF_;
    private static final SubLList $list41;
    private static final SubLString $str42$Return_T_iff_CNF_is_a_cnf_represe;
    private static final SubLSymbol $kw43$TRUE;
    private static final SubLSymbol $sym44$TRUTH_P;
    private static final SubLObject $const45$and;
    private static final SubLObject $const46$or;
    private static final SubLObject $const47$implies;
    private static final SubLObject $const48$not;
    private static final SubLSymbol $kw49$FALSE;
    private static final SubLSymbol $sym50$CNF_FORMULA;
    private static final SubLList $list51;
    private static final SubLString $str52$Return_a_readable_formula_of_CNF_;
    private static final SubLList $list53;
    private static final SubLList $list54;
    private static final SubLSymbol $sym55$CNF_FORMULA_FROM_CLAUSES;
    private static final SubLList $list56;
    private static final SubLString $str57$Return_a_readable_formula_from_a_;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$NEGATE;
    private static final SubLSymbol $sym60$DNF_FORMULA;
    private static final SubLList $list61;
    private static final SubLString $str62$Return_a_readable_formula_of_DNF_;
    private static final SubLSymbol $sym63$DNF_FORMULA_FROM_CLAUSES;
    private static final SubLList $list64;
    private static final SubLString $str65$Return_a_readable_formula_from_a_;
    private static final SubLList $list66;
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 775L)
    public static SubLObject clause_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isList() && clauses.TWO_INTEGER.numE(Sequences.length(v_object)) && v_object.first().isList() && conses_high.second(v_object).isList());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 1155L)
    public static SubLObject make_clause(final SubLObject neg_lits, final SubLObject pos_lits) {
        enforceType(neg_lits, clauses.$sym4$LISTP);
        enforceType(pos_lits, clauses.$sym4$LISTP);
        return (SubLObject)ConsesLow.list(neg_lits, pos_lits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 1414L)
    public static SubLObject neg_lits(final SubLObject clause) {
        enforceType(clause, clauses.$sym0$CLAUSE_P);
        return clause.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 1574L)
    public static SubLObject set_clause_neg_lits(final SubLObject clause, final SubLObject neg_lits) {
        ConsesLow.rplaca(clause, neg_lits);
        return clause;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 1735L)
    public static SubLObject pos_lits(final SubLObject clause) {
        enforceType(clause, clauses.$sym0$CLAUSE_P);
        return conses_high.second(clause);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 1895L)
    public static SubLObject set_clause_pos_lits(final SubLObject clause, final SubLObject pos_lits) {
        ConsesLow.rplaca(clause.rest(), pos_lits);
        return clause;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 2062L)
    public static SubLObject clause_sense_lits(final SubLObject clause, final SubLObject sense) {
        assert clauses.NIL != clause_p(clause) : clause;
        assert clauses.NIL != enumeration_types.sense_p(sense) : sense;
        if (sense.eql((SubLObject)clauses.$kw18$NEG)) {
            return neg_lits(clause);
        }
        if (sense.eql((SubLObject)clauses.$kw19$POS)) {
            return pos_lits(clause);
        }
        return (SubLObject)clauses.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 2303L)
    public static SubLObject ground_clause_p(final SubLObject clause) {
        return (SubLObject)SubLObjectFactory.makeBoolean(clauses.NIL != clause_p(clause) && clauses.NIL != variables.fully_bound_p(clause));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 2477L)
    public static SubLObject atomic_clause_p(final SubLObject clause) {
        if (clauses.NIL != clause_p(clause)) {
            final SubLObject neg_lits = neg_lits(clause);
            final SubLObject pos_lits = pos_lits(clause);
            return (SubLObject)SubLObjectFactory.makeBoolean((clauses.NIL == neg_lits && clauses.NIL != list_utilities.singletonP(pos_lits)) || (clauses.NIL == pos_lits && clauses.NIL != list_utilities.singletonP(neg_lits)));
        }
        return (SubLObject)clauses.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 2819L)
    public static SubLObject lifting_clause_p(final SubLObject clause) {
        if (clauses.NIL != clause_p(clause)) {
            SubLObject index_var = (SubLObject)clauses.ZERO_INTEGER;
            SubLObject cdolist_list_var = neg_lits(clause);
            SubLObject asent = (SubLObject)clauses.NIL;
            asent = cdolist_list_var.first();
            while (clauses.NIL != cdolist_list_var) {
                final SubLObject sense = (SubLObject)clauses.$kw18$NEG;
                if (clauses.NIL != el_utilities.ist_sentence_p(asent, (SubLObject)clauses.UNPROVIDED)) {
                    return (SubLObject)clauses.T;
                }
                index_var = Numbers.add(index_var, (SubLObject)clauses.ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                asent = cdolist_list_var.first();
            }
            index_var = (SubLObject)clauses.ZERO_INTEGER;
            cdolist_list_var = pos_lits(clause);
            asent = (SubLObject)clauses.NIL;
            asent = cdolist_list_var.first();
            while (clauses.NIL != cdolist_list_var) {
                final SubLObject sense = (SubLObject)clauses.$kw19$POS;
                if (clauses.NIL != el_utilities.ist_sentence_p(asent, (SubLObject)clauses.UNPROVIDED)) {
                    return (SubLObject)clauses.T;
                }
                index_var = Numbers.add(index_var, (SubLObject)clauses.ONE_INTEGER);
                cdolist_list_var = cdolist_list_var.rest();
                asent = cdolist_list_var.first();
            }
        }
        return (SubLObject)clauses.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 3080L)
    public static SubLObject clause_equal(final SubLObject clause1, final SubLObject clause2) {
        return (SubLObject)SubLObjectFactory.makeBoolean(clauses.NIL != clause_p(clause1) && clause1.equal(clause2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 3390L)
    public static SubLObject empty_clause() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return clauses.$empty_clause$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 3501L)
    public static SubLObject empty_clauseP(final SubLObject clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(clause, clauses.$sym0$CLAUSE_P);
        return clause_equal(clause, clauses.$empty_clause$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 3689L)
    public static SubLObject clause_literal(final SubLObject clause, final SubLObject sense, final SubLObject num) {
        enforceType(clause, clauses.$sym0$CLAUSE_P);
        enforceType(sense, clauses.$sym17$SENSE_P);
        enforceType(num, clauses.$sym31$INTEGERP);
        return ConsesLow.nth(num, (sense == clauses.$kw19$POS) ? pos_lits(clause) : neg_lits(clause));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 4001L)
    public static SubLObject clause_without_literal(final SubLObject clause, final SubLObject sense, final SubLObject num) {
        enforceType(clause, clauses.$sym0$CLAUSE_P);
        enforceType(sense, clauses.$sym17$SENSE_P);
        enforceType(num, clauses.$sym31$INTEGERP);
        SubLObject neg_lits = conses_high.copy_tree(neg_lits(clause));
        SubLObject pos_lits = conses_high.copy_tree(pos_lits(clause));
        if (sense == clauses.$kw19$POS) {
            pos_lits = list_utilities.delete_nth(num, pos_lits);
        }
        else {
            neg_lits = list_utilities.delete_nth(num, neg_lits);
        }
        return make_clause(neg_lits, pos_lits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 4546L)
    public static SubLObject singleton_clause_literal(final SubLObject clause) {
        final SubLObject pos_lits = pos_lits(clause);
        final SubLObject neg_lits = neg_lits(clause);
        if (clauses.NIL != list_utilities.singletonP(pos_lits) && clauses.NIL == neg_lits) {
            return Values.values(pos_lits.first(), (SubLObject)clauses.$kw19$POS);
        }
        if (clauses.NIL == pos_lits && clauses.NIL != list_utilities.singletonP(neg_lits)) {
            return Values.values(neg_lits.first(), (SubLObject)clauses.$kw18$NEG);
        }
        return Values.values((SubLObject)clauses.NIL, (SubLObject)clauses.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 4911L)
    public static SubLObject make_xnf(final SubLObject neg_lits, final SubLObject pos_lits) {
        return make_clause(neg_lits, pos_lits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 5157L)
    public static SubLObject cnf_p(final SubLObject v_object) {
        return clause_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 5351L)
    public static SubLObject dnf_p(final SubLObject v_object) {
        return clause_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 5494L)
    public static SubLObject gaf_cnfP(final SubLObject cnf) {
        return (SubLObject)SubLObjectFactory.makeBoolean(clauses.NIL != clause_utilities.pos_atomic_cnf_p(cnf) && clauses.NIL != ground_clause_p(cnf));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 5681L)
    public static SubLObject clauses_p(final SubLObject v_object) {
        return cnfs_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 5811L)
    public static SubLObject cnfs_p(final SubLObject v_object) {
        if (clauses.NIL != list_utilities.non_dotted_list_p(v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject clause = (SubLObject)clauses.NIL;
            clause = cdolist_list_var.first();
            while (clauses.NIL != cdolist_list_var) {
                if (clauses.NIL == cnf_p(clause)) {
                    return (SubLObject)clauses.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                clause = cdolist_list_var.first();
            }
            return (SubLObject)clauses.T;
        }
        return (SubLObject)clauses.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 5977L)
    public static SubLObject dnf_clauses_p(final SubLObject v_object) {
        if (clauses.NIL != list_utilities.non_dotted_list_p(v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject clause = (SubLObject)clauses.NIL;
            clause = cdolist_list_var.first();
            while (clauses.NIL != cdolist_list_var) {
                if (clauses.NIL == dnf_p(clause)) {
                    return (SubLObject)clauses.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                clause = cdolist_list_var.first();
            }
            return (SubLObject)clauses.T;
        }
        return (SubLObject)clauses.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 6220L)
    public static SubLObject make_cnf(final SubLObject neg_lits, final SubLObject pos_lits) {
        return make_clause(neg_lits, pos_lits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 6424L)
    public static SubLObject cnf_equal(final SubLObject cnf1, final SubLObject cnf2) {
        return clause_equal(cnf1, cnf2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 6496L)
    public static SubLObject cnf_formula(SubLObject cnf, SubLObject truth) {
        if (truth == clauses.UNPROVIDED) {
            truth = (SubLObject)clauses.$kw43$TRUE;
        }
        enforceType(cnf, clauses.$sym38$CNF_P);
        enforceType(truth, clauses.$sym44$TRUTH_P);
        cnf = czer_utilities.possibly_escape_quote_hl_vars(cnf, (SubLObject)clauses.UNPROVIDED);
        SubLObject pos_lits = pos_lits(cnf);
        SubLObject neg_lits = neg_lits(cnf);
        if (clauses.NIL != neg_lits.rest()) {
            neg_lits = (SubLObject)ConsesLow.cons(clauses.$const45$and, neg_lits);
        }
        else {
            neg_lits = neg_lits.first();
        }
        if (clauses.NIL != pos_lits.rest()) {
            pos_lits = (SubLObject)ConsesLow.cons(clauses.$const46$or, pos_lits);
        }
        else {
            pos_lits = pos_lits.first();
        }
        if (clauses.NIL != pos_lits && clauses.NIL != neg_lits) {
            return (SubLObject)ConsesLow.list(clauses.$const47$implies, neg_lits, pos_lits);
        }
        if (clauses.NIL != neg_lits) {
            return (SubLObject)ConsesLow.list(clauses.$const48$not, neg_lits);
        }
        if (clauses.NIL == pos_lits) {
            return (SubLObject)clauses.NIL;
        }
        if (clauses.NIL != pos_lits(cnf).rest() || clauses.NIL == variables.fully_bound_p(pos_lits) || truth != clauses.$kw49$FALSE) {
            return pos_lits;
        }
        return (SubLObject)ConsesLow.list(clauses.$const48$not, pos_lits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 7409L)
    public static SubLObject cnf_formula_from_clauses(final SubLObject cnf_clauses) {
        enforceType(cnf_clauses, clauses.$sym4$LISTP);
        assert clauses.NIL != Types.listp(cnf_clauses) : cnf_clauses;
        if (Sequences.length(cnf_clauses).numE((SubLObject)clauses.ONE_INTEGER)) {
            return cnf_formula(cnf_clauses.first(), (SubLObject)clauses.UNPROVIDED);
        }
        return reader.bq_cons(clauses.$const45$and, ConsesLow.append(Mapping.mapcar(Symbols.symbol_function((SubLObject)clauses.$sym50$CNF_FORMULA), cnf_clauses), (SubLObject)clauses.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 7770L)
    public static SubLObject make_dnf(final SubLObject neg_lits, final SubLObject pos_lits) {
        return make_clause(neg_lits, pos_lits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 7999L)
    public static SubLObject literal_of_dnf(final SubLObject dnf, final SubLObject sense, final SubLObject num) {
        return clause_literal(dnf, sense, num);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 8086L)
    public static SubLObject dnf_formula(final SubLObject dnf) {
        final SubLObject pos_lits = pos_lits(dnf);
        final SubLObject neg_lits = Mapping.mapcar(Symbols.symbol_function((SubLObject)clauses.$sym59$NEGATE), neg_lits(dnf));
        if (clauses.NIL == neg_lits) {
            if (clauses.NIL != pos_lits.rest()) {
                return reader.bq_cons(clauses.$const45$and, ConsesLow.append(pos_lits, (SubLObject)clauses.NIL));
            }
            return pos_lits.first();
        }
        else {
            if (clauses.NIL != pos_lits) {
                return reader.bq_cons(clauses.$const45$and, ConsesLow.append(ConsesLow.append(neg_lits, pos_lits), (SubLObject)clauses.NIL));
            }
            if (clauses.NIL != neg_lits.rest()) {
                return reader.bq_cons(clauses.$const45$and, ConsesLow.append(neg_lits, (SubLObject)clauses.NIL));
            }
            return neg_lits.first();
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clauses.lisp", position = 8563L)
    public static SubLObject dnf_formula_from_clauses(final SubLObject dnf_clauses) {
        enforceType(dnf_clauses, clauses.$sym4$LISTP);
        assert clauses.NIL != Types.listp(dnf_clauses) : dnf_clauses;
        if (Sequences.length(dnf_clauses).numE((SubLObject)clauses.ONE_INTEGER)) {
            return dnf_formula(dnf_clauses.first());
        }
        return uncanonicalizer.implications_in(reader.bq_cons(clauses.$const46$or, ConsesLow.append(Mapping.mapcar(Symbols.symbol_function((SubLObject)clauses.$sym60$DNF_FORMULA), dnf_clauses), (SubLObject)clauses.NIL)));
    }
    
    public static SubLObject declare_clauses_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "clause_p", "CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "make_clause", "MAKE-CLAUSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "neg_lits", "NEG-LITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "set_clause_neg_lits", "SET-CLAUSE-NEG-LITS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "pos_lits", "POS-LITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "set_clause_pos_lits", "SET-CLAUSE-POS-LITS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "clause_sense_lits", "CLAUSE-SENSE-LITS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "ground_clause_p", "GROUND-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "atomic_clause_p", "ATOMIC-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "lifting_clause_p", "LIFTING-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "clause_equal", "CLAUSE-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "empty_clause", "EMPTY-CLAUSE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "empty_clauseP", "EMPTY-CLAUSE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "clause_literal", "CLAUSE-LITERAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "clause_without_literal", "CLAUSE-WITHOUT-LITERAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "singleton_clause_literal", "SINGLETON-CLAUSE-LITERAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "make_xnf", "MAKE-XNF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "cnf_p", "CNF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "dnf_p", "DNF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "gaf_cnfP", "GAF-CNF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "clauses_p", "CLAUSES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "cnfs_p", "CNFS-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "dnf_clauses_p", "DNF-CLAUSES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "make_cnf", "MAKE-CNF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "cnf_equal", "CNF-EQUAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "cnf_formula", "CNF-FORMULA", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "cnf_formula_from_clauses", "CNF-FORMULA-FROM-CLAUSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "make_dnf", "MAKE-DNF", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "literal_of_dnf", "LITERAL-OF-DNF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "dnf_formula", "DNF-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clauses", "dnf_formula_from_clauses", "DNF-FORMULA-FROM-CLAUSES", 1, 0, false);
        return (SubLObject)clauses.NIL;
    }
    
    public static SubLObject init_clauses_file() {
        clauses.$empty_clause$ = SubLFiles.defparameter("*EMPTY-CLAUSE*", make_clause((SubLObject)clauses.NIL, (SubLObject)clauses.NIL));
        return (SubLObject)clauses.NIL;
    }
    
    public static SubLObject setup_clauses_file() {
        utilities_macros.register_cyc_api_function((SubLObject)clauses.$sym0$CLAUSE_P, (SubLObject)clauses.$list1, (SubLObject)clauses.$str2$Returns_T_iff_OBJECT_is_either_a_, (SubLObject)clauses.NIL, (SubLObject)clauses.$list3);
        utilities_macros.register_cyc_api_function((SubLObject)clauses.$sym5$MAKE_CLAUSE, (SubLObject)clauses.$list6, (SubLObject)clauses.$str7$Construct_a_clause_from_NEG_LITS_, (SubLObject)clauses.$list8, (SubLObject)clauses.$list9);
        utilities_macros.register_cyc_api_function((SubLObject)clauses.$sym10$NEG_LITS, (SubLObject)clauses.$list11, (SubLObject)clauses.$str12$Return_the_neg_lits_of_CLAUSE_, (SubLObject)clauses.$list13, (SubLObject)clauses.$list14);
        utilities_macros.register_cyc_api_function((SubLObject)clauses.$sym15$POS_LITS, (SubLObject)clauses.$list11, (SubLObject)clauses.$str16$Return_the_pos_lits_of_CLAUSE_, (SubLObject)clauses.$list13, (SubLObject)clauses.$list14);
        utilities_macros.register_cyc_api_function((SubLObject)clauses.$sym20$GROUND_CLAUSE_P, (SubLObject)clauses.$list11, (SubLObject)clauses.$str21$Return_T_iff_CLAUSE_is_a_ground_c, (SubLObject)clauses.NIL, (SubLObject)clauses.$list3);
        utilities_macros.register_cyc_api_function((SubLObject)clauses.$sym22$ATOMIC_CLAUSE_P, (SubLObject)clauses.$list11, (SubLObject)clauses.$str23$Return_T_iff_CLAUSE_is_an_atomic_, (SubLObject)clauses.NIL, (SubLObject)clauses.$list3);
        utilities_macros.register_cyc_api_function((SubLObject)clauses.$sym24$CLAUSE_EQUAL, (SubLObject)clauses.$list25, (SubLObject)clauses.$str26$Return_T_iff_CLAUSE1_and_CLAUSE2_, (SubLObject)clauses.NIL, (SubLObject)clauses.$list3);
        utilities_macros.register_cyc_api_function((SubLObject)clauses.$sym27$EMPTY_CLAUSE, (SubLObject)clauses.NIL, (SubLObject)clauses.$str28$Return_the_empty_clause_, (SubLObject)clauses.NIL, (SubLObject)clauses.$list9);
        utilities_macros.register_cyc_api_function((SubLObject)clauses.$sym29$EMPTY_CLAUSE_, (SubLObject)clauses.$list11, (SubLObject)clauses.$str30$Return_T_iff_CLAUSE_is_empty_, (SubLObject)clauses.$list13, (SubLObject)clauses.$list3);
        utilities_macros.register_cyc_api_function((SubLObject)clauses.$sym32$CLAUSE_LITERAL, (SubLObject)clauses.$list33, (SubLObject)clauses.$str34$Return_literal_in_CLAUSE_specifie, (SubLObject)clauses.$list35, (SubLObject)clauses.NIL);
        utilities_macros.register_cyc_api_function((SubLObject)clauses.$sym36$CLAUSE_WITHOUT_LITERAL, (SubLObject)clauses.$list33, (SubLObject)clauses.$str37$Return_a_new_clause_which_is_CLAU, (SubLObject)clauses.$list35, (SubLObject)clauses.$list9);
        utilities_macros.register_cyc_api_function((SubLObject)clauses.$sym38$CNF_P, (SubLObject)clauses.$list1, (SubLObject)clauses.$str39$Returns_T_iff_OBJECT_is_a_canonic, (SubLObject)clauses.NIL, (SubLObject)clauses.$list3);
        utilities_macros.register_cyc_api_function((SubLObject)clauses.$sym40$GAF_CNF_, (SubLObject)clauses.$list41, (SubLObject)clauses.$str42$Return_T_iff_CNF_is_a_cnf_represe, (SubLObject)clauses.NIL, (SubLObject)clauses.$list3);
        utilities_macros.register_cyc_api_function((SubLObject)clauses.$sym50$CNF_FORMULA, (SubLObject)clauses.$list51, (SubLObject)clauses.$str52$Return_a_readable_formula_of_CNF_, (SubLObject)clauses.$list53, (SubLObject)clauses.$list54);
        utilities_macros.register_cyc_api_function((SubLObject)clauses.$sym55$CNF_FORMULA_FROM_CLAUSES, (SubLObject)clauses.$list56, (SubLObject)clauses.$str57$Return_a_readable_formula_from_a_, (SubLObject)clauses.$list58, (SubLObject)clauses.$list54);
        utilities_macros.register_cyc_api_function((SubLObject)clauses.$sym60$DNF_FORMULA, (SubLObject)clauses.$list61, (SubLObject)clauses.$str62$Return_a_readable_formula_of_DNF_, (SubLObject)clauses.NIL, (SubLObject)clauses.$list54);
        utilities_macros.register_cyc_api_function((SubLObject)clauses.$sym63$DNF_FORMULA_FROM_CLAUSES, (SubLObject)clauses.$list64, (SubLObject)clauses.$str65$Return_a_readable_formula_from_a_, (SubLObject)clauses.$list66, (SubLObject)clauses.$list54);
        return (SubLObject)clauses.NIL;
    }
    
    public void declareFunctions() {
        declare_clauses_file();
    }
    
    public void initializeVariables() {
        init_clauses_file();
    }
    
    public void runTopLevelForms() {
        setup_clauses_file();
    }
    
    static {
        me = (SubLFile)new clauses();
        clauses.$empty_clause$ = null;
        $sym0$CLAUSE_P = SubLObjectFactory.makeSymbol("CLAUSE-P");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT"));
        $str2$Returns_T_iff_OBJECT_is_either_a_ = SubLObjectFactory.makeString("Returns T iff OBJECT is either a CNF or DNF clause.");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $sym4$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym5$MAKE_CLAUSE = SubLObjectFactory.makeSymbol("MAKE-CLAUSE");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LITS"));
        $str7$Construct_a_clause_from_NEG_LITS_ = SubLObjectFactory.makeString("Construct a clause from NEG-LITS and POS-LITS, each of which are lists of literals.");
        $list8 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLAUSE-P"));
        $sym10$NEG_LITS = SubLObjectFactory.makeSymbol("NEG-LITS");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLAUSE"));
        $str12$Return_the_neg_lits_of_CLAUSE_ = SubLObjectFactory.makeString("Return the neg-lits of CLAUSE.");
        $list13 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLAUSE"), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSE-P")));
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $sym15$POS_LITS = SubLObjectFactory.makeSymbol("POS-LITS");
        $str16$Return_the_pos_lits_of_CLAUSE_ = SubLObjectFactory.makeString("Return the pos-lits of CLAUSE.");
        $sym17$SENSE_P = SubLObjectFactory.makeSymbol("SENSE-P");
        $kw18$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw19$POS = SubLObjectFactory.makeKeyword("POS");
        $sym20$GROUND_CLAUSE_P = SubLObjectFactory.makeSymbol("GROUND-CLAUSE-P");
        $str21$Return_T_iff_CLAUSE_is_a_ground_c = SubLObjectFactory.makeString("Return T iff CLAUSE is a ground clause.");
        $sym22$ATOMIC_CLAUSE_P = SubLObjectFactory.makeSymbol("ATOMIC-CLAUSE-P");
        $str23$Return_T_iff_CLAUSE_is_an_atomic_ = SubLObjectFactory.makeString("Return T iff CLAUSE is an atomic clause.");
        $sym24$CLAUSE_EQUAL = SubLObjectFactory.makeSymbol("CLAUSE-EQUAL");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLAUSE1"), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSE2"));
        $str26$Return_T_iff_CLAUSE1_and_CLAUSE2_ = SubLObjectFactory.makeString("Return T iff CLAUSE1 and CLAUSE2 are both equivalent clauses.");
        $sym27$EMPTY_CLAUSE = SubLObjectFactory.makeSymbol("EMPTY-CLAUSE");
        $str28$Return_the_empty_clause_ = SubLObjectFactory.makeString("Return the empty clause.");
        $sym29$EMPTY_CLAUSE_ = SubLObjectFactory.makeSymbol("EMPTY-CLAUSE?");
        $str30$Return_T_iff_CLAUSE_is_empty_ = SubLObjectFactory.makeString("Return T iff CLAUSE is empty.");
        $sym31$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $sym32$CLAUSE_LITERAL = SubLObjectFactory.makeSymbol("CLAUSE-LITERAL");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLAUSE"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE"), (SubLObject)SubLObjectFactory.makeSymbol("NUM"));
        $str34$Return_literal_in_CLAUSE_specifie = SubLObjectFactory.makeString("Return literal in CLAUSE specified by SENSE and NUM.\n  SENSE must be either :pos or :neg.");
        $list35 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLAUSE"), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENSE"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUM"), (SubLObject)SubLObjectFactory.makeSymbol("INTEGERP")));
        $sym36$CLAUSE_WITHOUT_LITERAL = SubLObjectFactory.makeSymbol("CLAUSE-WITHOUT-LITERAL");
        $str37$Return_a_new_clause_which_is_CLAU = SubLObjectFactory.makeString("Return a new clause which is CLAUSE without the literal specified by SENSE and NUM.\n  SENSE must be either :pos or :neg.");
        $sym38$CNF_P = SubLObjectFactory.makeSymbol("CNF-P");
        $str39$Returns_T_iff_OBJECT_is_a_canonic = SubLObjectFactory.makeString("Returns T iff OBJECT is a canonicalized CycL formula in conjunctive normal form.");
        $sym40$GAF_CNF_ = SubLObjectFactory.makeSymbol("GAF-CNF?");
        $list41 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNF"));
        $str42$Return_T_iff_CNF_is_a_cnf_represe = SubLObjectFactory.makeString("Return T iff CNF is a cnf representation of a gaf formula.");
        $kw43$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym44$TRUTH_P = SubLObjectFactory.makeSymbol("TRUTH-P");
        $const45$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $const46$or = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or"));
        $const47$implies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies"));
        $const48$not = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("not"));
        $kw49$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $sym50$CNF_FORMULA = SubLObjectFactory.makeSymbol("CNF-FORMULA");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNF"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("TRUE")));
        $str52$Return_a_readable_formula_of_CNF_ = SubLObjectFactory.makeString("Return a readable formula of CNF\n   TRUTH only gets looked at for ground, single pos lit cnfs\n   in which case TRUTH gives the truth of the gaf.");
        $list53 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNF"), (SubLObject)SubLObjectFactory.makeSymbol("CNF-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH-P")));
        $list54 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-FORMULA-P"));
        $sym55$CNF_FORMULA_FROM_CLAUSES = SubLObjectFactory.makeSymbol("CNF-FORMULA-FROM-CLAUSES");
        $list56 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNF-CLAUSES"));
        $str57$Return_a_readable_formula_from_a_ = SubLObjectFactory.makeString("Return a readable formula from a list of CNF-CLAUSES.");
        $list58 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNF-CLAUSES"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $sym59$NEGATE = SubLObjectFactory.makeSymbol("NEGATE");
        $sym60$DNF_FORMULA = SubLObjectFactory.makeSymbol("DNF-FORMULA");
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DNF"));
        $str62$Return_a_readable_formula_of_DNF_ = SubLObjectFactory.makeString("Return a readable formula of DNF.");
        $sym63$DNF_FORMULA_FROM_CLAUSES = SubLObjectFactory.makeSymbol("DNF-FORMULA-FROM-CLAUSES");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DNF-CLAUSES"));
        $str65$Return_a_readable_formula_from_a_ = SubLObjectFactory.makeString("Return a readable formula from a list of DNF-CLAUSES.");
        $list66 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DNF-CLAUSES"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
    }
}

/*

	Total time: 174 ms
	
*/