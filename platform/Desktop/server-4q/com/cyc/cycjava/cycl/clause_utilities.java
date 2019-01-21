package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class clause_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.clause_utilities";
    public static final String myFingerPrint = "353dc36d5fd951962470191f751993be17d78f307af6ae25f4542b4a0bf4b416";
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$CDESTRUCTURING_BIND;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$INDEX;
    private static final SubLSymbol $sym4$DO_LITERALS_NUMBERED;
    private static final SubLSymbol $sym5$PWHEN;
    private static final SubLSymbol $sym6$INDEX_AND_SENSE_MATCH_SUBCLAUSE_SPEC_;
    private static final SubLSymbol $sym7$INDEX;
    private static final SubLSymbol $sym8$PUNLESS;
    private static final SubLList $list9;
    private static final SubLSymbol $kw10$TRUE;
    private static final SubLSymbol $sym11$SENSE_P;
    private static final SubLSymbol $kw12$NEG;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$CYC_VAR_;
    private static final SubLSymbol $kw15$POS;
    private static final SubLSymbol $kw16$FALSE;
    private static final SubLString $str17$_a_was_not_an_atomic_clause;
    private static final SubLList $list18;
    private static final SubLSymbol $sym19$NEGATE_CLAUSE;
    private static final SubLSymbol $sym20$NEGATE_ATOMIC;
    private static final SubLList $list21;
    private static final SubLObject $const22$ist;
    private static final SubLSymbol $sym23$CONTEXTUALIZED_LITERAL_TO_IST_SENTENCE;
    private static final SubLSymbol $sym24$NEGATE;
    private static final SubLObject $const25$and;
    private static final SubLSymbol $sym26$LISTP;
    private static final SubLObject $const27$or;
    private static final SubLSymbol $sym28$CONTEXTUALIZED_DNF_FORMULA;
    private static final SubLSymbol $sym29$CONTEXTUALIZED_ASENT_ASENT;
    private static final SubLSymbol $sym30$DECONTEXTUALIZE_CONTEXTUALIZED_CLAUSE;
    private static final SubLSymbol $sym31$NON_DOTTED_LIST_P;
    private static final SubLSymbol $sym32$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $sym33$_;
    private static final SubLList $list34;
    private static final SubLSymbol $sym35$_;
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 717L)
    public static SubLObject destructure_clause(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)clause_utilities.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject neg_lits = (SubLObject)clause_utilities.NIL;
        SubLObject pos_lits = (SubLObject)clause_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)clause_utilities.$list0);
        neg_lits = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)clause_utilities.$list0);
        pos_lits = current.first();
        current = current.rest();
        if (clause_utilities.NIL == current) {
            current = temp;
            SubLObject clause = (SubLObject)clause_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)clause_utilities.$list0);
            clause = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)clause_utilities.$sym1$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(neg_lits, pos_lits), clause, ConsesLow.append(body, (SubLObject)clause_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)clause_utilities.$list0);
        return (SubLObject)clause_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 877L)
    public static SubLObject do_subclause_spec(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)clause_utilities.$list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject asent = (SubLObject)clause_utilities.NIL;
        SubLObject sense = (SubLObject)clause_utilities.NIL;
        SubLObject clause = (SubLObject)clause_utilities.NIL;
        SubLObject subclause_spec = (SubLObject)clause_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)clause_utilities.$list2);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)clause_utilities.$list2);
        sense = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)clause_utilities.$list2);
        clause = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)clause_utilities.$list2);
        subclause_spec = current.first();
        current = current.rest();
        if (clause_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject index = (SubLObject)clause_utilities.$sym3$INDEX;
            return (SubLObject)ConsesLow.list((SubLObject)clause_utilities.$sym4$DO_LITERALS_NUMBERED, (SubLObject)ConsesLow.list(asent, index, sense, clause), (SubLObject)ConsesLow.listS((SubLObject)clause_utilities.$sym5$PWHEN, (SubLObject)ConsesLow.list((SubLObject)clause_utilities.$sym6$INDEX_AND_SENSE_MATCH_SUBCLAUSE_SPEC_, index, sense, subclause_spec), ConsesLow.append(body, (SubLObject)clause_utilities.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)clause_utilities.$list2);
        return (SubLObject)clause_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 1237L)
    public static SubLObject do_subclause_spec_complement(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)clause_utilities.$list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject asent = (SubLObject)clause_utilities.NIL;
        SubLObject sense = (SubLObject)clause_utilities.NIL;
        SubLObject clause = (SubLObject)clause_utilities.NIL;
        SubLObject subclause_spec = (SubLObject)clause_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)clause_utilities.$list2);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)clause_utilities.$list2);
        sense = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)clause_utilities.$list2);
        clause = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)clause_utilities.$list2);
        subclause_spec = current.first();
        current = current.rest();
        if (clause_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject index = (SubLObject)clause_utilities.$sym7$INDEX;
            return (SubLObject)ConsesLow.list((SubLObject)clause_utilities.$sym4$DO_LITERALS_NUMBERED, (SubLObject)ConsesLow.list(asent, index, sense, clause), (SubLObject)ConsesLow.listS((SubLObject)clause_utilities.$sym8$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)clause_utilities.$sym6$INDEX_AND_SENSE_MATCH_SUBCLAUSE_SPEC_, index, sense, subclause_spec), ConsesLow.append(body, (SubLObject)clause_utilities.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)clause_utilities.$list2);
        return (SubLObject)clause_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 1610L)
    public static SubLObject destructure_contextualized_asent(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)clause_utilities.$list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject mt = (SubLObject)clause_utilities.NIL;
        SubLObject asent = (SubLObject)clause_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)clause_utilities.$list9);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)clause_utilities.$list9);
        asent = current.first();
        current = current.rest();
        if (clause_utilities.NIL == current) {
            current = temp;
            SubLObject contextualized_asent = (SubLObject)clause_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)clause_utilities.$list9);
            contextualized_asent = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)clause_utilities.$sym1$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(mt, asent), contextualized_asent, ConsesLow.append(body, (SubLObject)clause_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)clause_utilities.$list9);
        return (SubLObject)clause_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 1786L)
    public static SubLObject remake_clause(final SubLObject neg_lits, final SubLObject pos_lits, final SubLObject clause) {
        if (neg_lits.eql(clauses.neg_lits(clause)) && pos_lits.eql(clauses.pos_lits(clause))) {
            return clause;
        }
        return clauses.make_clause(neg_lits, pos_lits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 2011L)
    public static SubLObject nmake_clause(final SubLObject neg_lits, final SubLObject pos_lits, final SubLObject clause) {
        if (!neg_lits.eql(clauses.neg_lits(clause))) {
            ConsesLow.set_nth((SubLObject)clause_utilities.ZERO_INTEGER, clause, neg_lits);
        }
        if (!pos_lits.eql(clauses.pos_lits(clause))) {
            ConsesLow.set_nth((SubLObject)clause_utilities.ONE_INTEGER, clause, pos_lits);
        }
        return clause;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 2306L)
    public static SubLObject remake_cnf(final SubLObject neg_lits, final SubLObject pos_lits, final SubLObject cnf) {
        return remake_clause(neg_lits, pos_lits, cnf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 2534L)
    public static SubLObject make_gaf_cnf(final SubLObject asent) {
        return clauses.make_cnf((SubLObject)clause_utilities.NIL, (SubLObject)ConsesLow.list(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 2675L)
    public static SubLObject make_false_gaf_cnf(final SubLObject asent) {
        return clauses.make_cnf((SubLObject)ConsesLow.list(asent), (SubLObject)clause_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 2825L)
    public static SubLObject make_gaf_dnf(final SubLObject asent) {
        return clauses.make_dnf((SubLObject)clause_utilities.NIL, (SubLObject)ConsesLow.list(asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 2966L)
    public static SubLObject make_false_gaf_dnf(final SubLObject asent) {
        return clauses.make_dnf((SubLObject)ConsesLow.list(asent), (SubLObject)clause_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 3116L)
    public static SubLObject make_gaf_cnf_with_truth(final SubLObject literal, final SubLObject truth) {
        return (clause_utilities.$kw10$TRUE == truth) ? make_gaf_cnf(literal) : make_false_gaf_cnf(literal);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 3332L)
    public static SubLObject make_gaf_dnf_with_truth(final SubLObject literal, final SubLObject truth) {
        return (clause_utilities.$kw10$TRUE == truth) ? make_gaf_dnf(literal) : make_false_gaf_dnf(literal);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 3548L)
    public static SubLObject remake_dnf(final SubLObject neg_lits, final SubLObject pos_lits, final SubLObject dnf) {
        return remake_clause(neg_lits, pos_lits, dnf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 3776L)
    public static SubLObject nmake_dnf(final SubLObject neg_lits, final SubLObject pos_lits, final SubLObject dnf) {
        return nmake_clause(neg_lits, pos_lits, dnf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 3955L)
    public static SubLObject asent_sense_to_literal(final SubLObject asent, final SubLObject sense) {
        assert clause_utilities.NIL != enumeration_types.sense_p(sense) : sense;
        return (clause_utilities.$kw12$NEG == sense) ? cycl_utilities.negate(asent) : asent;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 4089L)
    public static SubLObject clausal_form_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, (SubLObject)clause_utilities.$list13);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 4186L)
    public static SubLObject clause_with_lit_counts_p(final SubLObject clause, final SubLObject neg_lit_count, final SubLObject pos_lit_count) {
        return (SubLObject)SubLObjectFactory.makeBoolean(clause_utilities.NIL != clauses.clause_p(clause) && clause_utilities.NIL != list_utilities.lengthE(clauses.neg_lits(clause), neg_lit_count, (SubLObject)clause_utilities.UNPROVIDED) && clause_utilities.NIL != list_utilities.lengthE(clauses.pos_lits(clause), pos_lit_count, (SubLObject)clause_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 4511L)
    public static SubLObject pos_atomic_cnf_p(final SubLObject cnf) {
        return (SubLObject)SubLObjectFactory.makeBoolean(clause_utilities.NIL != clauses.cnf_p(cnf) && clause_utilities.NIL != clause_with_lit_counts_p(cnf, (SubLObject)clause_utilities.ZERO_INTEGER, (SubLObject)clause_utilities.ONE_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 4805L)
    public static SubLObject pos_atomic_clause_p(final SubLObject clause) {
        return clause_with_lit_counts_p(clause, (SubLObject)clause_utilities.ZERO_INTEGER, (SubLObject)clause_utilities.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 5034L)
    public static SubLObject pos_atomic_cnf_with_pred_p(final SubLObject v_object, final SubLObject pred) {
        if (clause_utilities.NIL != pos_atomic_cnf_p(v_object)) {
            final SubLObject asent = gaf_cnf_literal(v_object);
            return el_utilities.el_formula_with_operator_p(asent, pred);
        }
        return (SubLObject)clause_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 5226L)
    public static SubLObject neg_atomic_cnf_p(final SubLObject cnf) {
        return (SubLObject)SubLObjectFactory.makeBoolean(clause_utilities.NIL != clauses.cnf_p(cnf) && clause_utilities.NIL != clause_with_lit_counts_p(cnf, (SubLObject)clause_utilities.ONE_INTEGER, (SubLObject)clause_utilities.ZERO_INTEGER));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 5518L)
    public static SubLObject neg_atomic_clause_p(final SubLObject clause) {
        return clause_with_lit_counts_p(clause, (SubLObject)clause_utilities.ONE_INTEGER, (SubLObject)clause_utilities.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 5747L)
    public static SubLObject neg_atomic_cnf_with_pred_p(final SubLObject v_object, final SubLObject pred) {
        if (clause_utilities.NIL != neg_atomic_cnf_p(v_object)) {
            final SubLObject asent = gaf_cnf_literal(v_object);
            return el_utilities.el_formula_with_operator_p(asent, pred);
        }
        return (SubLObject)clause_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 5939L)
    public static SubLObject atomic_clause_with_all_var_argsP(final SubLObject clause) {
        if (clause_utilities.NIL != clauses.atomic_clause_p(clause)) {
            final SubLObject asent = atomic_clause_asent(clause);
            final SubLObject asent_args = cycl_utilities.atomic_sentence_args(asent, (SubLObject)clause_utilities.UNPROVIDED);
            if (clause_utilities.NIL != list_utilities.every_in_list((SubLObject)clause_utilities.$sym14$CYC_VAR_, asent_args, (SubLObject)clause_utilities.UNPROVIDED)) {
                return (SubLObject)clause_utilities.T;
            }
        }
        return (SubLObject)clause_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 6320L)
    public static SubLObject gaf_cnf_literal(final SubLObject cnf) {
        return clauses.pos_lits(cnf).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 6437L)
    public static SubLObject literals_with_sense(final SubLObject clause, final SubLObject sense) {
        assert clause_utilities.NIL != enumeration_types.sense_p(sense) : sense;
        if (sense.eql((SubLObject)clause_utilities.$kw15$POS)) {
            return clauses.pos_lits(clause);
        }
        if (sense.eql((SubLObject)clause_utilities.$kw12$NEG)) {
            return clauses.neg_lits(clause);
        }
        return (SubLObject)clause_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 6604L)
    public static SubLObject atomic_cnf_asent(final SubLObject atomic_clause) {
        return (clause_utilities.NIL != pos_atomic_cnf_p(atomic_clause)) ? clauses.pos_lits(atomic_clause).first() : clauses.neg_lits(atomic_clause).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 6877L)
    public static SubLObject atomic_clause_asent(final SubLObject atomic_clause) {
        return (clause_utilities.NIL != pos_atomic_clause_p(atomic_clause)) ? clauses.pos_lits(atomic_clause).first() : clauses.neg_lits(atomic_clause).first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 7162L)
    public static SubLObject atomic_cnf_predicate(final SubLObject atomic_clause) {
        final SubLObject asent = atomic_cnf_asent(atomic_clause);
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        return predicate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 7336L)
    public static SubLObject atomic_clause_predicate(final SubLObject atomic_clause) {
        final SubLObject asent = atomic_clause_asent(atomic_clause);
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        return predicate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 7516L)
    public static SubLObject asent_truth_from_atomic_clause(final SubLObject clause) {
        if (clause_utilities.NIL != pos_atomic_clause_p(clause)) {
            final SubLObject asent = atomic_clause_asent(clause);
            return subl_promotions.values2(asent, (SubLObject)clause_utilities.$kw10$TRUE);
        }
        if (clause_utilities.NIL != neg_atomic_clause_p(clause)) {
            final SubLObject asent = atomic_clause_asent(clause);
            return subl_promotions.values2(asent, (SubLObject)clause_utilities.$kw16$FALSE);
        }
        return Errors.error((SubLObject)clause_utilities.$str17$_a_was_not_an_atomic_clause, clause);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 7963L)
    public static SubLObject negate_clause(final SubLObject clause) {
        SubLObject neg_lits = (SubLObject)clause_utilities.NIL;
        SubLObject pos_lits = (SubLObject)clause_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(clause, clause, (SubLObject)clause_utilities.$list18);
        neg_lits = clause.first();
        SubLObject current = clause.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, clause, (SubLObject)clause_utilities.$list18);
        pos_lits = current.first();
        current = current.rest();
        if (clause_utilities.NIL == current) {
            return clauses.make_clause(pos_lits, neg_lits);
        }
        cdestructuring_bind.cdestructuring_bind_error(clause, (SubLObject)clause_utilities.$list18);
        return (SubLObject)clause_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 8141L)
    public static SubLObject negate_clauses(final SubLObject v_clauses) {
        return Mapping.mapcar((SubLObject)clause_utilities.$sym19$NEGATE_CLAUSE, v_clauses);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 8285L)
    public static SubLObject atomic_clauses_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && clause_utilities.NIL != list_utilities.singletonP(v_object) && clause_utilities.NIL != clauses.atomic_clause_p(v_object.first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 8514L)
    public static SubLObject pos_atomic_clauses_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && clause_utilities.NIL != list_utilities.singletonP(v_object) && clause_utilities.NIL != pos_atomic_clause_p(v_object.first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 8755L)
    public static SubLObject neg_atomic_clauses_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && clause_utilities.NIL != list_utilities.singletonP(v_object) && clause_utilities.NIL != neg_atomic_clause_p(v_object.first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 8996L)
    public static SubLObject atomic_clauses_asent(final SubLObject atomic_clauses) {
        return atomic_clause_asent(atomic_clauses.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 9104L)
    public static SubLObject atomic_clauses_predicate(final SubLObject atomic_clauses) {
        return atomic_clause_predicate(atomic_clauses.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 9220L)
    public static SubLObject group_clauses_having_common_neg_lits(final SubLObject v_clauses, SubLObject test) {
        if (test == clause_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)clause_utilities.EQUAL);
        }
        final SubLObject table = Hashtables.make_hash_table(Sequences.length(v_clauses), test, (SubLObject)clause_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = (SubLObject)clause_utilities.NIL;
        clause = cdolist_list_var.first();
        while (clause_utilities.NIL != cdolist_list_var) {
            hash_table_utilities.push_hash(clauses.neg_lits(clause), clause, table);
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        }
        return hash_table_utilities.hash_table_values(table);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 9656L)
    public static SubLObject unmake_clause(final SubLObject clause) {
        return Values.values(clauses.neg_lits(clause), clauses.pos_lits(clause));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 9904L)
    public static SubLObject cnfP(final SubLObject v_object) {
        return clauseP(v_object, (SubLObject)clause_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 9960L)
    public static SubLObject clauseP(final SubLObject v_object, SubLObject varP) {
        if (varP == clause_utilities.UNPROVIDED) {
            varP = (SubLObject)clause_utilities.$sym14$CYC_VAR_;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isList() && Sequences.length(v_object).numE((SubLObject)clause_utilities.TWO_INTEGER) && clause_utilities.NIL != literals_specP(v_object.first(), varP) && clause_utilities.NIL != literals_specP(conses_high.second(v_object), varP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 10166L)
    public static SubLObject literals_specP(final SubLObject v_object, SubLObject varP) {
        if (varP == clause_utilities.UNPROVIDED) {
            varP = (SubLObject)clause_utilities.$sym14$CYC_VAR_;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean((v_object.isList() && clause_utilities.NIL != literal_specP(v_object.first(), varP)) || clause_utilities.NIL != Functions.funcall(varP, v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 10338L)
    public static SubLObject literal_specP(final SubLObject v_object, SubLObject varP) {
        if (varP == clause_utilities.UNPROVIDED) {
            varP = (SubLObject)clause_utilities.$sym14$CYC_VAR_;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(clause_utilities.NIL != el_utilities.literalP(v_object) || clause_utilities.NIL != Functions.funcall(varP, v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 10465L)
    public static SubLObject clause_literals(final SubLObject clause) {
        return Sequences.cconcatenate(Mapping.mapcar((SubLObject)clause_utilities.$sym20$NEGATE_ATOMIC, clauses.neg_lits(clause)), clauses.pos_lits(clause));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 10590L)
    public static SubLObject cnf_literals(final SubLObject cnf) {
        return clause_literals(cnf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 10656L)
    public static SubLObject dnf_literals(final SubLObject dnf) {
        return clause_literals(dnf);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 10722L)
    public static SubLObject clause_from_el_literals(final SubLObject el_literals) {
        SubLObject neg_lits = (SubLObject)clause_utilities.NIL;
        SubLObject pos_lits = (SubLObject)clause_utilities.NIL;
        SubLObject cdolist_list_var = el_literals;
        SubLObject lit = (SubLObject)clause_utilities.NIL;
        lit = cdolist_list_var.first();
        while (clause_utilities.NIL != cdolist_list_var) {
            if (clause_utilities.NIL != cycl_utilities.negatedP(lit)) {
                neg_lits = (SubLObject)ConsesLow.cons(lit, neg_lits);
            }
            else {
                pos_lits = (SubLObject)ConsesLow.cons(lit, pos_lits);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        return clauses.make_clause(Sequences.nreverse(neg_lits), Sequences.nreverse(pos_lits));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 11173L)
    public static SubLObject clause_number_of_literals(final SubLObject clause) {
        return clause_literal_count(clause);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 11363L)
    public static SubLObject clause_literal_count(final SubLObject clause) {
        SubLObject lit_count = (SubLObject)clause_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(clause);
        SubLObject lit = (SubLObject)clause_utilities.NIL;
        lit = cdolist_list_var.first();
        while (clause_utilities.NIL != cdolist_list_var) {
            lit_count = Numbers.add(lit_count, (SubLObject)clause_utilities.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        cdolist_list_var = clauses.pos_lits(clause);
        lit = (SubLObject)clause_utilities.NIL;
        lit = cdolist_list_var.first();
        while (clause_utilities.NIL != cdolist_list_var) {
            lit_count = Numbers.add(lit_count, (SubLObject)clause_utilities.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        return lit_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 11601L)
    public static SubLObject unary_clause_p(final SubLObject clause) {
        return Numbers.numE((SubLObject)clause_utilities.ONE_INTEGER, clause_number_of_literals(clause));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 11691L)
    public static SubLObject binary_clause_p(final SubLObject clause) {
        return Numbers.numE((SubLObject)clause_utilities.TWO_INTEGER, clause_number_of_literals(clause));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 11782L)
    public static SubLObject ternary_clause_p(final SubLObject clause) {
        return Numbers.numE((SubLObject)clause_utilities.THREE_INTEGER, clause_number_of_literals(clause));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 11874L)
    public static SubLObject all_literals_as_asents(final SubLObject clause) {
        return ConsesLow.append(clauses.neg_lits(clause), clauses.pos_lits(clause));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 11976L)
    public static SubLObject cnf_isa_lits(final SubLObject cnf) {
        return list_utilities.ordered_union(el_utilities.isa_lits(clauses.neg_lits(cnf)), el_utilities.isa_lits(clauses.pos_lits(cnf)), Symbols.symbol_function((SubLObject)clause_utilities.EQUAL), (SubLObject)clause_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 12102L)
    public static SubLObject cnf_tou_lits(final SubLObject cnf) {
        return list_utilities.ordered_union(el_utilities.tou_lits(clauses.neg_lits(cnf)), el_utilities.tou_lits(clauses.pos_lits(cnf)), Symbols.symbol_function((SubLObject)clause_utilities.EQUAL), (SubLObject)clause_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 12228L)
    public static SubLObject cnf_pred_lits(final SubLObject cnf, final SubLObject pred) {
        SubLObject result = (SubLObject)clause_utilities.NIL;
        SubLObject cdolist_list_var = clauses.neg_lits(cnf);
        SubLObject literal = (SubLObject)clause_utilities.NIL;
        literal = cdolist_list_var.first();
        while (clause_utilities.NIL != cdolist_list_var) {
            if (clause_utilities.NIL != el_utilities.pred_litP(literal, pred)) {
                result = (SubLObject)ConsesLow.cons(literal, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        }
        cdolist_list_var = clauses.pos_lits(cnf);
        literal = (SubLObject)clause_utilities.NIL;
        literal = cdolist_list_var.first();
        while (clause_utilities.NIL != cdolist_list_var) {
            if (clause_utilities.NIL != el_utilities.pred_litP(literal, pred)) {
                result = (SubLObject)ConsesLow.cons(literal, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 12518L)
    public static SubLObject gaf_clauseP(final SubLObject clause) {
        final SubLObject pos_lits = clauses.pos_lits(clause);
        final SubLObject neg_lits = clauses.neg_lits(clause);
        return (SubLObject)SubLObjectFactory.makeBoolean(((clause_utilities.NIL != list_utilities.singletonP(pos_lits) && clause_utilities.NIL == neg_lits) || (clause_utilities.NIL != list_utilities.singletonP(neg_lits) && clause_utilities.NIL == pos_lits)) && clause_utilities.NIL != el_utilities.groundP(clause, (SubLObject)clause_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 12771L)
    public static SubLObject clause_variables(final SubLObject clause, SubLObject varP) {
        if (varP == clause_utilities.UNPROVIDED) {
            varP = (SubLObject)clause_utilities.$sym14$CYC_VAR_;
        }
        SubLObject neg_lits = (SubLObject)clause_utilities.NIL;
        SubLObject pos_lits = (SubLObject)clause_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(clause, clause, (SubLObject)clause_utilities.$list18);
        neg_lits = clause.first();
        SubLObject current = clause.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, clause, (SubLObject)clause_utilities.$list18);
        pos_lits = current.first();
        current = current.rest();
        if (clause_utilities.NIL == current) {
            return conses_high.nunion(el_utilities.literals_variables(neg_lits, varP), el_utilities.literals_variables(pos_lits, varP), (SubLObject)clause_utilities.UNPROVIDED, (SubLObject)clause_utilities.UNPROVIDED);
        }
        cdestructuring_bind.cdestructuring_bind_error(clause, (SubLObject)clause_utilities.$list18);
        return (SubLObject)clause_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 12983L)
    public static SubLObject clause_free_sequence_variables(final SubLObject clause, SubLObject varP) {
        if (varP == clause_utilities.UNPROVIDED) {
            varP = (SubLObject)clause_utilities.$sym14$CYC_VAR_;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject neg_lits = (SubLObject)clause_utilities.NIL;
        SubLObject pos_lits = (SubLObject)clause_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(clause, clause, (SubLObject)clause_utilities.$list18);
        neg_lits = clause.first();
        SubLObject current = clause.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, clause, (SubLObject)clause_utilities.$list18);
        pos_lits = current.first();
        current = current.rest();
        if (clause_utilities.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(clause, (SubLObject)clause_utilities.$list18);
            return (SubLObject)clause_utilities.NIL;
        }
        final SubLObject bound = (SubLObject)clause_utilities.NIL;
        if (clause_utilities.NIL != clauses.atomic_clause_p(clause) && clause_utilities.NIL != el_utilities.tou_litP(pos_lits.first())) {
            SubLObject result = (SubLObject)clause_utilities.NIL;
            final SubLObject _prev_bind_0 = at_vars.$within_tou_gafP$.currentBinding(thread);
            try {
                at_vars.$within_tou_gafP$.bind((SubLObject)clause_utilities.T, thread);
                result = list_utilities.ordered_union(el_utilities.literals_free_sequence_variables(neg_lits, bound, varP), el_utilities.literals_free_sequence_variables(pos_lits, bound, varP), (SubLObject)clause_utilities.UNPROVIDED, (SubLObject)clause_utilities.UNPROVIDED);
            }
            finally {
                at_vars.$within_tou_gafP$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return list_utilities.ordered_union(el_utilities.literals_free_sequence_variables(neg_lits, bound, varP), el_utilities.literals_free_sequence_variables(pos_lits, bound, varP), (SubLObject)clause_utilities.UNPROVIDED, (SubLObject)clause_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 13592L)
    public static SubLObject clause_free_term_variables(final SubLObject clause, SubLObject varP) {
        if (varP == clause_utilities.UNPROVIDED) {
            varP = (SubLObject)clause_utilities.$sym14$CYC_VAR_;
        }
        return clause_free_variables(clause, varP, (SubLObject)clause_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 13737L)
    public static SubLObject clause_free_variables(final SubLObject clause, SubLObject varP, SubLObject include_sequence_varsP) {
        if (varP == clause_utilities.UNPROVIDED) {
            varP = (SubLObject)clause_utilities.$sym14$CYC_VAR_;
        }
        if (include_sequence_varsP == clause_utilities.UNPROVIDED) {
            include_sequence_varsP = (SubLObject)clause_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject neg_lits = (SubLObject)clause_utilities.NIL;
        SubLObject pos_lits = (SubLObject)clause_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(clause, clause, (SubLObject)clause_utilities.$list18);
        neg_lits = clause.first();
        SubLObject current = clause.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, clause, (SubLObject)clause_utilities.$list18);
        pos_lits = current.first();
        current = current.rest();
        if (clause_utilities.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(clause, (SubLObject)clause_utilities.$list18);
            return (SubLObject)clause_utilities.NIL;
        }
        final SubLObject bound = (SubLObject)clause_utilities.NIL;
        if (clause_utilities.NIL != clauses.atomic_clause_p(clause) && clause_utilities.NIL != el_utilities.tou_litP(pos_lits.first())) {
            SubLObject result = (SubLObject)clause_utilities.NIL;
            final SubLObject _prev_bind_0 = at_vars.$within_tou_gafP$.currentBinding(thread);
            try {
                at_vars.$within_tou_gafP$.bind((SubLObject)clause_utilities.T, thread);
                result = list_utilities.ordered_union(el_utilities.literals_free_variables(neg_lits, bound, varP, include_sequence_varsP), el_utilities.literals_free_variables(pos_lits, bound, varP, include_sequence_varsP), (SubLObject)clause_utilities.UNPROVIDED, (SubLObject)clause_utilities.UNPROVIDED);
            }
            finally {
                at_vars.$within_tou_gafP$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return list_utilities.ordered_union(el_utilities.literals_free_variables(neg_lits, bound, varP, include_sequence_varsP), el_utilities.literals_free_variables(pos_lits, bound, varP, include_sequence_varsP), (SubLObject)clause_utilities.UNPROVIDED, (SubLObject)clause_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 14420L)
    public static SubLObject terms_clauses(final SubLObject terms, final SubLObject v_clauses, SubLObject test) {
        if (test == clause_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)clause_utilities.EQL);
        }
        SubLObject result = (SubLObject)clause_utilities.NIL;
        SubLObject foundP = (SubLObject)clause_utilities.NIL;
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = (SubLObject)clause_utilities.NIL;
        clause = cdolist_list_var.first();
        while (clause_utilities.NIL != cdolist_list_var) {
            foundP = (SubLObject)clause_utilities.NIL;
            if (clause_utilities.NIL == foundP) {
                SubLObject csome_list_var = terms;
                SubLObject v_term = (SubLObject)clause_utilities.NIL;
                v_term = csome_list_var.first();
                while (clause_utilities.NIL == foundP && clause_utilities.NIL != csome_list_var) {
                    if (clause_utilities.NIL != list_utilities.tree_find(v_term, clause, test, (SubLObject)clause_utilities.UNPROVIDED)) {
                        foundP = (SubLObject)clause_utilities.T;
                        result = (SubLObject)ConsesLow.cons(clause, result);
                    }
                    csome_list_var = csome_list_var.rest();
                    v_term = csome_list_var.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 14788L)
    public static SubLObject term_clauses(final SubLObject v_term, final SubLObject v_clauses, SubLObject test) {
        if (test == clause_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)clause_utilities.EQL);
        }
        SubLObject included_clauses = (SubLObject)clause_utilities.NIL;
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = (SubLObject)clause_utilities.NIL;
        clause = cdolist_list_var.first();
        while (clause_utilities.NIL != cdolist_list_var) {
            if (clause_utilities.NIL != list_utilities.tree_find(v_term, clause, test, (SubLObject)clause_utilities.UNPROVIDED)) {
                included_clauses = (SubLObject)ConsesLow.cons(clause, included_clauses);
            }
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        }
        return Sequences.nreverse(included_clauses);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 15085L)
    public static SubLObject term_clauses_including_refd_vars(final SubLObject v_term, final SubLObject v_clauses, SubLObject test) {
        if (test == clause_utilities.UNPROVIDED) {
            test = Symbols.symbol_function((SubLObject)clause_utilities.EQL);
        }
        SubLObject included = (SubLObject)clause_utilities.NIL;
        SubLObject excluded = (SubLObject)clause_utilities.NIL;
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = (SubLObject)clause_utilities.NIL;
        clause = cdolist_list_var.first();
        while (clause_utilities.NIL != cdolist_list_var) {
            if (clause_utilities.NIL != list_utilities.tree_find(v_term, clause, test, (SubLObject)clause_utilities.UNPROVIDED)) {
                included = (SubLObject)ConsesLow.cons(clause, included);
            }
            else {
                excluded = (SubLObject)ConsesLow.cons(clause, excluded);
            }
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        }
        return Sequences.nreverse(clauses_referencing_vars_recursive(included, excluded, list_utilities.tree_gather(included, (SubLObject)clause_utilities.$sym14$CYC_VAR_, (SubLObject)clause_utilities.UNPROVIDED, (SubLObject)clause_utilities.UNPROVIDED, (SubLObject)clause_utilities.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 15770L)
    public static SubLObject clauses_referencing_vars_recursive(final SubLObject included, final SubLObject excluded, final SubLObject vars) {
        SubLObject new_included = (SubLObject)clause_utilities.NIL;
        SubLObject new_excluded = (SubLObject)clause_utilities.NIL;
        SubLObject new_clause_addedP = (SubLObject)clause_utilities.NIL;
        SubLObject cdolist_list_var = excluded;
        SubLObject clause = (SubLObject)clause_utilities.NIL;
        clause = cdolist_list_var.first();
        while (clause_utilities.NIL != cdolist_list_var) {
            SubLObject include_this_clauseP = (SubLObject)clause_utilities.NIL;
            if (clause_utilities.NIL == include_this_clauseP) {
                SubLObject csome_list_var = vars;
                SubLObject var = (SubLObject)clause_utilities.NIL;
                var = csome_list_var.first();
                while (clause_utilities.NIL == include_this_clauseP && clause_utilities.NIL != csome_list_var) {
                    if (clause_utilities.NIL != list_utilities.tree_find(var, clause, (SubLObject)clause_utilities.UNPROVIDED, (SubLObject)clause_utilities.UNPROVIDED)) {
                        new_included = (SubLObject)ConsesLow.cons(clause, new_included);
                        include_this_clauseP = (SubLObject)clause_utilities.T;
                        new_clause_addedP = (SubLObject)clause_utilities.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    var = csome_list_var.first();
                }
            }
            if (clause_utilities.NIL == include_this_clauseP) {
                new_excluded = (SubLObject)ConsesLow.cons(clause, new_excluded);
            }
            cdolist_list_var = cdolist_list_var.rest();
            clause = cdolist_list_var.first();
        }
        if (clause_utilities.NIL != new_clause_addedP) {
            return clauses_referencing_vars_recursive(ConsesLow.nconc(included, new_included), new_excluded, list_utilities.tree_gather(new_included, (SubLObject)clause_utilities.$sym14$CYC_VAR_, (SubLObject)clause_utilities.UNPROVIDED, (SubLObject)clause_utilities.UNPROVIDED, (SubLObject)clause_utilities.UNPROVIDED));
        }
        return included;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 16779L)
    public static SubLObject contextualized_literal_to_ist_sentence(final SubLObject contextualized_literal) {
        SubLObject mt = (SubLObject)clause_utilities.NIL;
        SubLObject literal = (SubLObject)clause_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(contextualized_literal, contextualized_literal, (SubLObject)clause_utilities.$list21);
        mt = contextualized_literal.first();
        SubLObject current = contextualized_literal.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, contextualized_literal, (SubLObject)clause_utilities.$list21);
        literal = current.first();
        current = current.rest();
        if (clause_utilities.NIL == current) {
            return (SubLObject)ConsesLow.list(clause_utilities.$const22$ist, mt, literal);
        }
        cdestructuring_bind.cdestructuring_bind_error(contextualized_literal, (SubLObject)clause_utilities.$list21);
        return (SubLObject)clause_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 16979L)
    public static SubLObject contextualized_dnf_formula(final SubLObject dnf) {
        final SubLObject pos_lits = Mapping.mapcar((SubLObject)clause_utilities.$sym23$CONTEXTUALIZED_LITERAL_TO_IST_SENTENCE, clauses.pos_lits(dnf));
        final SubLObject neg_lits = Mapping.mapcar((SubLObject)clause_utilities.$sym24$NEGATE, Mapping.mapcar((SubLObject)clause_utilities.$sym23$CONTEXTUALIZED_LITERAL_TO_IST_SENTENCE, clauses.neg_lits(dnf)));
        if (clause_utilities.NIL == neg_lits) {
            if (clause_utilities.NIL != pos_lits.rest()) {
                return reader.bq_cons(clause_utilities.$const25$and, ConsesLow.append(pos_lits, (SubLObject)clause_utilities.NIL));
            }
            return pos_lits.first();
        }
        else {
            if (clause_utilities.NIL != pos_lits) {
                return reader.bq_cons(clause_utilities.$const25$and, ConsesLow.append(ConsesLow.append(neg_lits, pos_lits), (SubLObject)clause_utilities.NIL));
            }
            if (clause_utilities.NIL != neg_lits.rest()) {
                return reader.bq_cons(clause_utilities.$const25$and, ConsesLow.append(neg_lits, (SubLObject)clause_utilities.NIL));
            }
            return neg_lits.first();
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 17547L)
    public static SubLObject contextualized_dnf_formula_from_clauses(final SubLObject dnf_clauses) {
        assert clause_utilities.NIL != Types.listp(dnf_clauses) : dnf_clauses;
        if (Sequences.length(dnf_clauses).numE((SubLObject)clause_utilities.ONE_INTEGER)) {
            return contextualized_dnf_formula(dnf_clauses.first());
        }
        return reader.bq_cons(clause_utilities.$const27$or, ConsesLow.append(Mapping.mapcar(Symbols.symbol_function((SubLObject)clause_utilities.$sym28$CONTEXTUALIZED_DNF_FORMULA), dnf_clauses), (SubLObject)clause_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 17819L)
    public static SubLObject decontextualize_contextualized_clause(final SubLObject contextualized_clause) {
        final SubLObject neg_lits = Mapping.mapcar((SubLObject)clause_utilities.$sym29$CONTEXTUALIZED_ASENT_ASENT, clauses.neg_lits(contextualized_clause));
        final SubLObject pos_lits = Mapping.mapcar((SubLObject)clause_utilities.$sym29$CONTEXTUALIZED_ASENT_ASENT, clauses.pos_lits(contextualized_clause));
        return clauses.make_clause(neg_lits, pos_lits);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 18115L)
    public static SubLObject decontextualize_contextualized_clauses(final SubLObject contextualized_clauses) {
        return Mapping.mapcar((SubLObject)clause_utilities.$sym30$DECONTEXTUALIZE_CONTEXTUALIZED_CLAUSE, contextualized_clauses);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 18275L)
    public static SubLObject subclause_spec_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(clause_utilities.NIL != list_utilities.proper_list_p(v_object) && clause_utilities.NIL != list_utilities.lengthE(v_object, (SubLObject)clause_utilities.TWO_INTEGER, (SubLObject)clause_utilities.UNPROVIDED) && clause_utilities.NIL != number_utilities.list_of_non_negative_integer_p(v_object.first()) && clause_utilities.NIL != number_utilities.list_of_non_negative_integer_p(conses_high.second(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 18662L)
    public static SubLObject new_subclause_spec(SubLObject negative_indices, SubLObject positive_indices) {
        SubLObject list_var = negative_indices;
        assert clause_utilities.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = (SubLObject)clause_utilities.NIL;
        elem = cdolist_list_var.first();
        while (clause_utilities.NIL != cdolist_list_var) {
            assert clause_utilities.NIL != subl_promotions.non_negative_integer_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        list_var = positive_indices;
        assert clause_utilities.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        cdolist_list_var = list_var;
        elem = (SubLObject)clause_utilities.NIL;
        elem = cdolist_list_var.first();
        while (clause_utilities.NIL != cdolist_list_var) {
            assert clause_utilities.NIL != subl_promotions.non_negative_integer_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        negative_indices = canonicalize_literal_indices(negative_indices);
        positive_indices = canonicalize_literal_indices(positive_indices);
        return (SubLObject)ConsesLow.list(negative_indices, positive_indices);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 19106L)
    public static SubLObject new_total_subclause_spec(final SubLObject clause) {
        final SubLObject negative_indices = list_utilities.num_list(Sequences.length(clauses.neg_lits(clause)), (SubLObject)clause_utilities.UNPROVIDED);
        final SubLObject positive_indices = list_utilities.num_list(Sequences.length(clauses.pos_lits(clause)), (SubLObject)clause_utilities.UNPROVIDED);
        return new_subclause_spec(negative_indices, positive_indices);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 19352L)
    public static SubLObject new_pos_subclause_spec(final SubLObject positive_indices) {
        return new_subclause_spec((SubLObject)clause_utilities.NIL, positive_indices);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 19464L)
    public static SubLObject new_neg_subclause_spec(final SubLObject negative_indices) {
        return new_subclause_spec(negative_indices, (SubLObject)clause_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 19576L)
    public static SubLObject new_single_literal_subclause_spec(final SubLObject sense, final SubLObject index) {
        final SubLObject negative_indices = (SubLObject)((sense == clause_utilities.$kw12$NEG) ? ConsesLow.list(index) : clause_utilities.NIL);
        final SubLObject positive_indices = (SubLObject)((sense == clause_utilities.$kw15$POS) ? ConsesLow.list(index) : clause_utilities.NIL);
        return new_subclause_spec(negative_indices, positive_indices);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 19834L)
    public static SubLObject ncanonicalize_literal_indices(final SubLObject indices) {
        return Sort.sort(indices, Symbols.symbol_function((SubLObject)clause_utilities.$sym33$_), (SubLObject)clause_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 19919L)
    public static SubLObject canonicalize_literal_indices(final SubLObject indices) {
        return ncanonicalize_literal_indices(conses_high.copy_list(indices));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 20036L)
    public static SubLObject new_complement_subclause_spec(final SubLObject subclause_spec, final SubLObject sample_clause) {
        final SubLObject neg_lit_count = Sequences.length(clauses.neg_lits(sample_clause));
        final SubLObject pos_lit_count = Sequences.length(clauses.pos_lits(sample_clause));
        SubLObject neg_indices = (SubLObject)clause_utilities.NIL;
        SubLObject pos_indices = (SubLObject)clause_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(subclause_spec, subclause_spec, (SubLObject)clause_utilities.$list34);
        neg_indices = subclause_spec.first();
        SubLObject current = subclause_spec.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, subclause_spec, (SubLObject)clause_utilities.$list34);
        pos_indices = current.first();
        current = current.rest();
        if (clause_utilities.NIL == current) {
            SubLObject complement_neg_indices = (SubLObject)clause_utilities.NIL;
            SubLObject complement_pos_indices = (SubLObject)clause_utilities.NIL;
            SubLObject neg_index;
            for (neg_index = (SubLObject)clause_utilities.NIL, neg_index = (SubLObject)clause_utilities.ZERO_INTEGER; neg_index.numL(neg_lit_count); neg_index = Numbers.add(neg_index, (SubLObject)clause_utilities.ONE_INTEGER)) {
                if (clause_utilities.NIL == subl_promotions.memberP(neg_index, neg_indices, (SubLObject)clause_utilities.UNPROVIDED, (SubLObject)clause_utilities.UNPROVIDED)) {
                    complement_neg_indices = (SubLObject)ConsesLow.cons(neg_index, complement_neg_indices);
                }
            }
            SubLObject pos_index;
            for (pos_index = (SubLObject)clause_utilities.NIL, pos_index = (SubLObject)clause_utilities.ZERO_INTEGER; pos_index.numL(pos_lit_count); pos_index = Numbers.add(pos_index, (SubLObject)clause_utilities.ONE_INTEGER)) {
                if (clause_utilities.NIL == subl_promotions.memberP(pos_index, pos_indices, (SubLObject)clause_utilities.UNPROVIDED, (SubLObject)clause_utilities.UNPROVIDED)) {
                    complement_pos_indices = (SubLObject)ConsesLow.cons(pos_index, complement_pos_indices);
                }
            }
            return new_subclause_spec(complement_neg_indices, complement_pos_indices);
        }
        cdestructuring_bind.cdestructuring_bind_error(subclause_spec, (SubLObject)clause_utilities.$list34);
        return (SubLObject)clause_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 20706L)
    public static SubLObject subclause_spec_negative_indices(final SubLObject subclause_spec) {
        return subclause_spec.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 20866L)
    public static SubLObject subclause_spec_positive_indices(final SubLObject subclause_spec) {
        return conses_high.second(subclause_spec);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 21013L)
    public static SubLObject subclause_spec_subsumesP(final SubLObject subsuming_subclause_spec, final SubLObject subsumed_subclause_spec) {
        return (SubLObject)SubLObjectFactory.makeBoolean(clause_utilities.NIL != conses_high.subsetp(subclause_spec_positive_indices(subsumed_subclause_spec), subclause_spec_positive_indices(subsuming_subclause_spec), Symbols.symbol_function((SubLObject)clause_utilities.$sym35$_), (SubLObject)clause_utilities.UNPROVIDED) && clause_utilities.NIL != conses_high.subsetp(subclause_spec_negative_indices(subsumed_subclause_spec), subclause_spec_negative_indices(subsuming_subclause_spec), Symbols.symbol_function((SubLObject)clause_utilities.$sym35$_), (SubLObject)clause_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 21540L)
    public static SubLObject index_and_sense_match_subclause_specP(final SubLObject index, final SubLObject sense, final SubLObject subclause_spec) {
        return list_utilities.member_eqP(index, (clause_utilities.$kw12$NEG == sense) ? subclause_spec_negative_indices(subclause_spec) : subclause_spec_positive_indices(subclause_spec));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 21834L)
    public static SubLObject subclause_specified_by_spec(final SubLObject clause, final SubLObject subclause_spec) {
        SubLObject neg_lits = (SubLObject)clause_utilities.NIL;
        SubLObject pos_lits = (SubLObject)clause_utilities.NIL;
        SubLObject index = (SubLObject)clause_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(clause);
        SubLObject asent = (SubLObject)clause_utilities.NIL;
        asent = cdolist_list_var.first();
        while (clause_utilities.NIL != cdolist_list_var) {
            final SubLObject sense = (SubLObject)clause_utilities.$kw12$NEG;
            if (clause_utilities.NIL != index_and_sense_match_subclause_specP(index, sense, subclause_spec)) {
                if (clause_utilities.$kw12$NEG == sense) {
                    neg_lits = (SubLObject)ConsesLow.cons(asent, neg_lits);
                }
                else {
                    pos_lits = (SubLObject)ConsesLow.cons(asent, pos_lits);
                }
            }
            index = Numbers.add(index, (SubLObject)clause_utilities.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        }
        index = (SubLObject)clause_utilities.ZERO_INTEGER;
        cdolist_list_var = clauses.pos_lits(clause);
        asent = (SubLObject)clause_utilities.NIL;
        asent = cdolist_list_var.first();
        while (clause_utilities.NIL != cdolist_list_var) {
            final SubLObject sense = (SubLObject)clause_utilities.$kw15$POS;
            if (clause_utilities.NIL != index_and_sense_match_subclause_specP(index, sense, subclause_spec)) {
                if (clause_utilities.$kw12$NEG == sense) {
                    neg_lits = (SubLObject)ConsesLow.cons(asent, neg_lits);
                }
                else {
                    pos_lits = (SubLObject)ConsesLow.cons(asent, pos_lits);
                }
            }
            index = Numbers.add(index, (SubLObject)clause_utilities.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        }
        final SubLObject subclause = clauses.make_clause(Sequences.nreverse(neg_lits), Sequences.nreverse(pos_lits));
        return subclause;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 22190L)
    public static SubLObject complement_of_subclause_specified_by_spec(final SubLObject clause, final SubLObject subclause_spec) {
        SubLObject neg_lits = (SubLObject)clause_utilities.NIL;
        SubLObject pos_lits = (SubLObject)clause_utilities.NIL;
        SubLObject index = (SubLObject)clause_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(clause);
        SubLObject asent = (SubLObject)clause_utilities.NIL;
        asent = cdolist_list_var.first();
        while (clause_utilities.NIL != cdolist_list_var) {
            final SubLObject sense = (SubLObject)clause_utilities.$kw12$NEG;
            if (clause_utilities.NIL == index_and_sense_match_subclause_specP(index, sense, subclause_spec)) {
                if (clause_utilities.$kw12$NEG == sense) {
                    neg_lits = (SubLObject)ConsesLow.cons(asent, neg_lits);
                }
                else {
                    pos_lits = (SubLObject)ConsesLow.cons(asent, pos_lits);
                }
            }
            index = Numbers.add(index, (SubLObject)clause_utilities.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        }
        index = (SubLObject)clause_utilities.ZERO_INTEGER;
        cdolist_list_var = clauses.pos_lits(clause);
        asent = (SubLObject)clause_utilities.NIL;
        asent = cdolist_list_var.first();
        while (clause_utilities.NIL != cdolist_list_var) {
            final SubLObject sense = (SubLObject)clause_utilities.$kw15$POS;
            if (clause_utilities.NIL == index_and_sense_match_subclause_specP(index, sense, subclause_spec)) {
                if (clause_utilities.$kw12$NEG == sense) {
                    neg_lits = (SubLObject)ConsesLow.cons(asent, neg_lits);
                }
                else {
                    pos_lits = (SubLObject)ConsesLow.cons(asent, pos_lits);
                }
            }
            index = Numbers.add(index, (SubLObject)clause_utilities.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        }
        final SubLObject subclause = clauses.make_clause(Sequences.nreverse(neg_lits), Sequences.nreverse(pos_lits));
        return subclause;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 22571L)
    public static SubLObject subclause_spec_from_clauses(final SubLObject big_clause, final SubLObject little_clause) {
        final SubLObject neg_indices = literal_indices_from_literals(clauses.neg_lits(big_clause), clauses.neg_lits(little_clause));
        final SubLObject pos_indices = literal_indices_from_literals(clauses.pos_lits(big_clause), clauses.pos_lits(little_clause));
        return new_subclause_spec(neg_indices, pos_indices);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 22900L)
    public static SubLObject literal_indices_from_literals(final SubLObject big_lits, final SubLObject little_lits) {
        SubLObject indices = (SubLObject)clause_utilities.NIL;
        SubLObject cdolist_list_var = little_lits;
        SubLObject lit = (SubLObject)clause_utilities.NIL;
        lit = cdolist_list_var.first();
        while (clause_utilities.NIL != cdolist_list_var) {
            final SubLObject index = Sequences.position(lit, big_lits, Symbols.symbol_function((SubLObject)clause_utilities.EQUAL), (SubLObject)clause_utilities.UNPROVIDED, (SubLObject)clause_utilities.UNPROVIDED, (SubLObject)clause_utilities.UNPROVIDED);
            indices = (SubLObject)ConsesLow.cons(index, indices);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        return Sequences.nreverse(indices);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 23141L)
    public static SubLObject subclause_spec_literal_count(final SubLObject subclause_spec) {
        return Numbers.add(Sequences.length(subclause_spec_positive_indices(subclause_spec)), Sequences.length(subclause_spec_negative_indices(subclause_spec)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 23357L)
    public static SubLObject empty_subclause_specP(final SubLObject subclause_spec) {
        return Numbers.numE((SubLObject)clause_utilities.ZERO_INTEGER, subclause_spec_literal_count(subclause_spec));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 23575L)
    public static SubLObject single_literal_subclause_specP(final SubLObject subclause_spec) {
        return Numbers.numE((SubLObject)clause_utilities.ONE_INTEGER, subclause_spec_literal_count(subclause_spec));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 23811L)
    public static SubLObject multi_literal_subclause_specP(final SubLObject subclause_spec) {
        return Numbers.numG(subclause_spec_literal_count(subclause_spec), (SubLObject)clause_utilities.ONE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 24051L)
    public static SubLObject total_subclause_specP(final SubLObject subclause_spec, final SubLObject clause) {
        return (SubLObject)SubLObjectFactory.makeBoolean(Sequences.length(subclause_spec_positive_indices(subclause_spec)).numE(Sequences.length(clauses.pos_lits(clause))) && Sequences.length(subclause_spec_negative_indices(subclause_spec)).numE(Sequences.length(clauses.neg_lits(clause))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/clause-utilities.lisp", position = 24466L)
    public static SubLObject clause_difference(final SubLObject clause, final SubLObject subtract_clause) {
        final SubLObject clause_neg_lits = clauses.neg_lits(clause);
        final SubLObject clause_pos_lits = clauses.pos_lits(clause);
        final SubLObject subtract_clause_neg_lits = clauses.neg_lits(subtract_clause);
        final SubLObject subtract_clause_pos_lits = clauses.pos_lits(subtract_clause);
        SubLObject new_neg_lits = (SubLObject)clause_utilities.NIL;
        SubLObject new_pos_lits = (SubLObject)clause_utilities.NIL;
        SubLObject cdolist_list_var = clause_neg_lits;
        SubLObject neg_lit = (SubLObject)clause_utilities.NIL;
        neg_lit = cdolist_list_var.first();
        while (clause_utilities.NIL != cdolist_list_var) {
            if (clause_utilities.NIL == list_utilities.member_equalP(neg_lit, subtract_clause_neg_lits)) {
                new_neg_lits = (SubLObject)ConsesLow.cons(neg_lit, new_neg_lits);
            }
            cdolist_list_var = cdolist_list_var.rest();
            neg_lit = cdolist_list_var.first();
        }
        new_neg_lits = Sequences.nreverse(new_neg_lits);
        cdolist_list_var = clause_pos_lits;
        SubLObject pos_lit = (SubLObject)clause_utilities.NIL;
        pos_lit = cdolist_list_var.first();
        while (clause_utilities.NIL != cdolist_list_var) {
            if (clause_utilities.NIL == list_utilities.member_equalP(pos_lit, subtract_clause_pos_lits)) {
                new_pos_lits = (SubLObject)ConsesLow.cons(pos_lit, new_pos_lits);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pos_lit = cdolist_list_var.first();
        }
        new_pos_lits = Sequences.nreverse(new_pos_lits);
        return clauses.make_clause(new_neg_lits, new_pos_lits);
    }
    
    public static SubLObject declare_clause_utilities_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.clause_utilities", "destructure_clause", "DESTRUCTURE-CLAUSE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.clause_utilities", "do_subclause_spec", "DO-SUBCLAUSE-SPEC");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.clause_utilities", "do_subclause_spec_complement", "DO-SUBCLAUSE-SPEC-COMPLEMENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.clause_utilities", "destructure_contextualized_asent", "DESTRUCTURE-CONTEXTUALIZED-ASENT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "remake_clause", "REMAKE-CLAUSE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "nmake_clause", "NMAKE-CLAUSE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "remake_cnf", "REMAKE-CNF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "make_gaf_cnf", "MAKE-GAF-CNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "make_false_gaf_cnf", "MAKE-FALSE-GAF-CNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "make_gaf_dnf", "MAKE-GAF-DNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "make_false_gaf_dnf", "MAKE-FALSE-GAF-DNF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "make_gaf_cnf_with_truth", "MAKE-GAF-CNF-WITH-TRUTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "make_gaf_dnf_with_truth", "MAKE-GAF-DNF-WITH-TRUTH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "remake_dnf", "REMAKE-DNF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "nmake_dnf", "NMAKE-DNF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "asent_sense_to_literal", "ASENT-SENSE-TO-LITERAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "clausal_form_p", "CLAUSAL-FORM-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "clause_with_lit_counts_p", "CLAUSE-WITH-LIT-COUNTS-P", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "pos_atomic_cnf_p", "POS-ATOMIC-CNF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "pos_atomic_clause_p", "POS-ATOMIC-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "pos_atomic_cnf_with_pred_p", "POS-ATOMIC-CNF-WITH-PRED-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "neg_atomic_cnf_p", "NEG-ATOMIC-CNF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "neg_atomic_clause_p", "NEG-ATOMIC-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "neg_atomic_cnf_with_pred_p", "NEG-ATOMIC-CNF-WITH-PRED-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "atomic_clause_with_all_var_argsP", "ATOMIC-CLAUSE-WITH-ALL-VAR-ARGS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "gaf_cnf_literal", "GAF-CNF-LITERAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "literals_with_sense", "LITERALS-WITH-SENSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "atomic_cnf_asent", "ATOMIC-CNF-ASENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "atomic_clause_asent", "ATOMIC-CLAUSE-ASENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "atomic_cnf_predicate", "ATOMIC-CNF-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "atomic_clause_predicate", "ATOMIC-CLAUSE-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "asent_truth_from_atomic_clause", "ASENT-TRUTH-FROM-ATOMIC-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "negate_clause", "NEGATE-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "negate_clauses", "NEGATE-CLAUSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "atomic_clauses_p", "ATOMIC-CLAUSES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "pos_atomic_clauses_p", "POS-ATOMIC-CLAUSES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "neg_atomic_clauses_p", "NEG-ATOMIC-CLAUSES-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "atomic_clauses_asent", "ATOMIC-CLAUSES-ASENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "atomic_clauses_predicate", "ATOMIC-CLAUSES-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "group_clauses_having_common_neg_lits", "GROUP-CLAUSES-HAVING-COMMON-NEG-LITS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "unmake_clause", "UNMAKE-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "cnfP", "CNF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "clauseP", "CLAUSE?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "literals_specP", "LITERALS-SPEC?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "literal_specP", "LITERAL-SPEC?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "clause_literals", "CLAUSE-LITERALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "cnf_literals", "CNF-LITERALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "dnf_literals", "DNF-LITERALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "clause_from_el_literals", "CLAUSE-FROM-EL-LITERALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "clause_number_of_literals", "CLAUSE-NUMBER-OF-LITERALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "clause_literal_count", "CLAUSE-LITERAL-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "unary_clause_p", "UNARY-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "binary_clause_p", "BINARY-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "ternary_clause_p", "TERNARY-CLAUSE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "all_literals_as_asents", "ALL-LITERALS-AS-ASENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "cnf_isa_lits", "CNF-ISA-LITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "cnf_tou_lits", "CNF-TOU-LITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "cnf_pred_lits", "CNF-PRED-LITS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "gaf_clauseP", "GAF-CLAUSE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "clause_variables", "CLAUSE-VARIABLES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "clause_free_sequence_variables", "CLAUSE-FREE-SEQUENCE-VARIABLES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "clause_free_term_variables", "CLAUSE-FREE-TERM-VARIABLES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "clause_free_variables", "CLAUSE-FREE-VARIABLES", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "terms_clauses", "TERMS-CLAUSES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "term_clauses", "TERM-CLAUSES", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "term_clauses_including_refd_vars", "TERM-CLAUSES-INCLUDING-REFD-VARS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "clauses_referencing_vars_recursive", "CLAUSES-REFERENCING-VARS-RECURSIVE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "contextualized_literal_to_ist_sentence", "CONTEXTUALIZED-LITERAL-TO-IST-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "contextualized_dnf_formula", "CONTEXTUALIZED-DNF-FORMULA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "contextualized_dnf_formula_from_clauses", "CONTEXTUALIZED-DNF-FORMULA-FROM-CLAUSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "decontextualize_contextualized_clause", "DECONTEXTUALIZE-CONTEXTUALIZED-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "decontextualize_contextualized_clauses", "DECONTEXTUALIZE-CONTEXTUALIZED-CLAUSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "subclause_spec_p", "SUBCLAUSE-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "new_subclause_spec", "NEW-SUBCLAUSE-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "new_total_subclause_spec", "NEW-TOTAL-SUBCLAUSE-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "new_pos_subclause_spec", "NEW-POS-SUBCLAUSE-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "new_neg_subclause_spec", "NEW-NEG-SUBCLAUSE-SPEC", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "new_single_literal_subclause_spec", "NEW-SINGLE-LITERAL-SUBCLAUSE-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "ncanonicalize_literal_indices", "NCANONICALIZE-LITERAL-INDICES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "canonicalize_literal_indices", "CANONICALIZE-LITERAL-INDICES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "new_complement_subclause_spec", "NEW-COMPLEMENT-SUBCLAUSE-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "subclause_spec_negative_indices", "SUBCLAUSE-SPEC-NEGATIVE-INDICES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "subclause_spec_positive_indices", "SUBCLAUSE-SPEC-POSITIVE-INDICES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "subclause_spec_subsumesP", "SUBCLAUSE-SPEC-SUBSUMES?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "index_and_sense_match_subclause_specP", "INDEX-AND-SENSE-MATCH-SUBCLAUSE-SPEC?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "subclause_specified_by_spec", "SUBCLAUSE-SPECIFIED-BY-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "complement_of_subclause_specified_by_spec", "COMPLEMENT-OF-SUBCLAUSE-SPECIFIED-BY-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "subclause_spec_from_clauses", "SUBCLAUSE-SPEC-FROM-CLAUSES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "literal_indices_from_literals", "LITERAL-INDICES-FROM-LITERALS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "subclause_spec_literal_count", "SUBCLAUSE-SPEC-LITERAL-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "empty_subclause_specP", "EMPTY-SUBCLAUSE-SPEC?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "single_literal_subclause_specP", "SINGLE-LITERAL-SUBCLAUSE-SPEC?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "multi_literal_subclause_specP", "MULTI-LITERAL-SUBCLAUSE-SPEC?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "total_subclause_specP", "TOTAL-SUBCLAUSE-SPEC?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.clause_utilities", "clause_difference", "CLAUSE-DIFFERENCE", 2, 0, false);
        return (SubLObject)clause_utilities.NIL;
    }
    
    public static SubLObject init_clause_utilities_file() {
        return (SubLObject)clause_utilities.NIL;
    }
    
    public static SubLObject setup_clause_utilities_file() {
        return (SubLObject)clause_utilities.NIL;
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
    
    static {
        me = (SubLFile)new clause_utilities();
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LITS")), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE"), (SubLObject)SubLObjectFactory.makeSymbol("CLAUSE"), (SubLObject)SubLObjectFactory.makeSymbol("SUBCLAUSE-SPEC")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym3$INDEX = SubLObjectFactory.makeUninternedSymbol("INDEX");
        $sym4$DO_LITERALS_NUMBERED = SubLObjectFactory.makeSymbol("DO-LITERALS-NUMBERED");
        $sym5$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym6$INDEX_AND_SENSE_MATCH_SUBCLAUSE_SPEC_ = SubLObjectFactory.makeSymbol("INDEX-AND-SENSE-MATCH-SUBCLAUSE-SPEC?");
        $sym7$INDEX = SubLObjectFactory.makeUninternedSymbol("INDEX");
        $sym8$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $list9 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT")), (SubLObject)SubLObjectFactory.makeSymbol("CONTEXTUALIZED-ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $kw10$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym11$SENSE_P = SubLObjectFactory.makeSymbol("SENSE-P");
        $kw12$NEG = SubLObjectFactory.makeKeyword("NEG");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CNF"), (SubLObject)SubLObjectFactory.makeKeyword("DNF"));
        $sym14$CYC_VAR_ = SubLObjectFactory.makeSymbol("CYC-VAR?");
        $kw15$POS = SubLObjectFactory.makeKeyword("POS");
        $kw16$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $str17$_a_was_not_an_atomic_clause = SubLObjectFactory.makeString("~a was not an atomic clause");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-LITS"), (SubLObject)SubLObjectFactory.makeSymbol("POS-LITS"));
        $sym19$NEGATE_CLAUSE = SubLObjectFactory.makeSymbol("NEGATE-CLAUSE");
        $sym20$NEGATE_ATOMIC = SubLObjectFactory.makeSymbol("NEGATE-ATOMIC");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("LITERAL"));
        $const22$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $sym23$CONTEXTUALIZED_LITERAL_TO_IST_SENTENCE = SubLObjectFactory.makeSymbol("CONTEXTUALIZED-LITERAL-TO-IST-SENTENCE");
        $sym24$NEGATE = SubLObjectFactory.makeSymbol("NEGATE");
        $const25$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $sym26$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $const27$or = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("or"));
        $sym28$CONTEXTUALIZED_DNF_FORMULA = SubLObjectFactory.makeSymbol("CONTEXTUALIZED-DNF-FORMULA");
        $sym29$CONTEXTUALIZED_ASENT_ASENT = SubLObjectFactory.makeSymbol("CONTEXTUALIZED-ASENT-ASENT");
        $sym30$DECONTEXTUALIZE_CONTEXTUALIZED_CLAUSE = SubLObjectFactory.makeSymbol("DECONTEXTUALIZE-CONTEXTUALIZED-CLAUSE");
        $sym31$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $sym32$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $sym33$_ = SubLObjectFactory.makeSymbol("<");
        $list34 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEG-INDICES"), (SubLObject)SubLObjectFactory.makeSymbol("POS-INDICES"));
        $sym35$_ = SubLObjectFactory.makeSymbol("=");
    }
}

/*

	Total time: 279 ms
	
*/