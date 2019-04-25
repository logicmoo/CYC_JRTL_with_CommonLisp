package com.cyc.cycjava.cycl.inference.harness;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class inference_datastructures_problem_query extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query";
    public static final String myFingerPrint = "8a090912a0eaaeed9fdbfe35d7574ad773ec3b0ac212544d0b39086a3b4e5108";
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 11024L)
    private static SubLSymbol $formula_term_signature_counts$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw3$INDEX;
    private static final SubLSymbol $kw4$DONE;
    private static final SubLSymbol $sym5$INDEX_VAR;
    private static final SubLSymbol $sym6$DO_CONTEXTUALIZED_CLAUSE_LITERALS;
    private static final SubLSymbol $sym7$IGNORE;
    private static final SubLSymbol $sym8$CONTEXTUALIZED_ASENT;
    private static final SubLSymbol $sym9$PROGN;
    private static final SubLSymbol $sym10$CLET;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$DO_NEG_LITS_NUMBERED;
    private static final SubLSymbol $sym13$DESTRUCTURE_CONTEXTUALIZED_ASENT;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$DO_POS_LITS_NUMBERED;
    private static final SubLList $list16;
    private static final SubLSymbol $kw17$POS;
    private static final SubLSymbol $kw18$NEG;
    private static final SubLString $str19$_a_was_not_an_atomic_contextualiz;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$CONTEXTUALIZED_CLAUSE;
    private static final SubLSymbol $sym23$DO_CLAUSES;
    private static final SubLSymbol $sym24$ATOMIC_CLAUSES_P;
    private static final SubLSymbol $sym25$SINGLETON_;
    private static final SubLSymbol $kw26$ALL;
    private static final SubLSymbol $sym27$SUBCLAUSE_SPEC_P;
    private static final SubLSymbol $sym28$DO_CONTEXTUALIZED_CLAUSES_LITERALS;
    private static final SubLSymbol $kw29$NONE;
    private static final SubLSymbol $kw30$SINGLE_LITERAL;
    private static final SubLString $str31$Unexpected_equality_reasoning_dom;
    private static final SubLSymbol $sym32$HL_VARIABLE_P;
    private static final SubLSymbol $sym33$SINGLE_CLAUSE_PROBLEM_QUERY_P;
    private static final SubLSymbol $sym34$FORMULA_TERM_SIGNATURE_VISIT;
    private static final SubLSymbol $sym35$TERM__;
    private static final SubLSymbol $sym36$CAR;
    private static final SubLSymbol $sym37$_;
    private static final SubLSymbol $sym38$CDR;
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 898L)
    public static SubLObject hl_contextualized_asent_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && inference_datastructures_problem_query.NIL != list_utilities.lengthE(v_object, (SubLObject)inference_datastructures_problem_query.TWO_INTEGER, (SubLObject)inference_datastructures_problem_query.UNPROVIDED) && inference_datastructures_problem_query.NIL != inference_context_spec_p(v_object.first()) && inference_datastructures_problem_query.NIL != el_utilities.possibly_sentence_p(conses_high.second(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 1244L)
    public static SubLObject inference_context_spec_p(final SubLObject v_object) {
        return hlmt.possibly_hlmt_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 1329L)
    public static SubLObject make_contextualized_asent(final SubLObject mt, final SubLObject asent) {
        return (SubLObject)ConsesLow.list(mt, asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 1426L)
    public static SubLObject contextualized_asent_mt(final SubLObject contextualized_asent) {
        return contextualized_asent.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 1542L)
    public static SubLObject contextualized_asent_asent(final SubLObject contextualized_asent) {
        return conses_high.second(contextualized_asent);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 1650L)
    public static SubLObject contextualized_asent_predicate(final SubLObject contextualized_asent) {
        return cycl_utilities.atomic_sentence_predicate(contextualized_asent_asent(contextualized_asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 1824L)
    public static SubLObject contextualized_dnf_clause_p(final SubLObject v_object) {
        if (inference_datastructures_problem_query.NIL != clauses.dnf_p(v_object)) {
            SubLObject cdolist_list_var = clauses.neg_lits(v_object);
            SubLObject asent = (SubLObject)inference_datastructures_problem_query.NIL;
            asent = cdolist_list_var.first();
            while (inference_datastructures_problem_query.NIL != cdolist_list_var) {
                if (inference_datastructures_problem_query.NIL == hl_contextualized_asent_p(asent)) {
                    return (SubLObject)inference_datastructures_problem_query.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                asent = cdolist_list_var.first();
            }
            cdolist_list_var = clauses.pos_lits(v_object);
            asent = (SubLObject)inference_datastructures_problem_query.NIL;
            asent = cdolist_list_var.first();
            while (inference_datastructures_problem_query.NIL != cdolist_list_var) {
                if (inference_datastructures_problem_query.NIL == hl_contextualized_asent_p(asent)) {
                    return (SubLObject)inference_datastructures_problem_query.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                asent = cdolist_list_var.first();
            }
            return (SubLObject)inference_datastructures_problem_query.T;
        }
        return (SubLObject)inference_datastructures_problem_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 2195L)
    public static SubLObject do_contextualized_clause_literals(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject asent_var = (SubLObject)inference_datastructures_problem_query.NIL;
        SubLObject mt_var = (SubLObject)inference_datastructures_problem_query.NIL;
        SubLObject sense_var = (SubLObject)inference_datastructures_problem_query.NIL;
        SubLObject contextualized_clause = (SubLObject)inference_datastructures_problem_query.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list0);
        asent_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list0);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list0);
        sense_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list0);
        contextualized_clause = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_datastructures_problem_query.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_datastructures_problem_query.NIL;
        SubLObject current_$1 = (SubLObject)inference_datastructures_problem_query.NIL;
        while (inference_datastructures_problem_query.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem_query.$list0);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem_query.$list0);
            if (inference_datastructures_problem_query.NIL == conses_high.member(current_$1, (SubLObject)inference_datastructures_problem_query.$list1, (SubLObject)inference_datastructures_problem_query.UNPROVIDED, (SubLObject)inference_datastructures_problem_query.UNPROVIDED)) {
                bad = (SubLObject)inference_datastructures_problem_query.T;
            }
            if (current_$1 == inference_datastructures_problem_query.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_datastructures_problem_query.NIL != bad && inference_datastructures_problem_query.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem_query.$list0);
        }
        final SubLObject index_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem_query.$kw3$INDEX, current);
        final SubLObject index = (SubLObject)((inference_datastructures_problem_query.NIL != index_tail) ? conses_high.cadr(index_tail) : inference_datastructures_problem_query.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem_query.$kw4$DONE, current);
        final SubLObject done = (SubLObject)((inference_datastructures_problem_query.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_datastructures_problem_query.NIL);
        final SubLObject body;
        current = (body = temp);
        if (inference_datastructures_problem_query.NIL == index) {
            final SubLObject index_var = (SubLObject)inference_datastructures_problem_query.$sym5$INDEX_VAR;
            return (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem_query.$sym6$DO_CONTEXTUALIZED_CLAUSE_LITERALS, (SubLObject)ConsesLow.list(asent_var, mt_var, sense_var, contextualized_clause, (SubLObject)inference_datastructures_problem_query.$kw3$INDEX, index_var, (SubLObject)inference_datastructures_problem_query.$kw4$DONE, done), (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem_query.$sym7$IGNORE, index_var), ConsesLow.append(body, (SubLObject)inference_datastructures_problem_query.NIL));
        }
        final SubLObject contextualized_asent = (SubLObject)inference_datastructures_problem_query.$sym8$CONTEXTUALIZED_ASENT;
        return (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem_query.$sym9$PROGN, (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem_query.$sym10$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(sense_var, (SubLObject)inference_datastructures_problem_query.$list11)), (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem_query.$sym12$DO_NEG_LITS_NUMBERED, (SubLObject)ConsesLow.list(contextualized_asent, index, contextualized_clause, (SubLObject)inference_datastructures_problem_query.$kw4$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem_query.$sym13$DESTRUCTURE_CONTEXTUALIZED_ASENT, (SubLObject)ConsesLow.list(mt_var, asent_var), contextualized_asent, ConsesLow.append(body, (SubLObject)inference_datastructures_problem_query.NIL)))), (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem_query.$sym10$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(sense_var, (SubLObject)inference_datastructures_problem_query.$list14)), (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem_query.$sym15$DO_POS_LITS_NUMBERED, (SubLObject)ConsesLow.list(contextualized_asent, index, contextualized_clause, (SubLObject)inference_datastructures_problem_query.$kw4$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem_query.$sym13$DESTRUCTURE_CONTEXTUALIZED_ASENT, (SubLObject)ConsesLow.list(mt_var, asent_var), contextualized_asent, ConsesLow.append(body, (SubLObject)inference_datastructures_problem_query.NIL)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 3056L)
    public static SubLObject contextualized_clause_has_literal_with_predicateP(final SubLObject contextualized_clause, final SubLObject predicate) {
        SubLObject cdolist_list_var = clauses.neg_lits(contextualized_clause);
        SubLObject contextualized_asent = (SubLObject)inference_datastructures_problem_query.NIL;
        contextualized_asent = cdolist_list_var.first();
        while (inference_datastructures_problem_query.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject mt = (SubLObject)inference_datastructures_problem_query.NIL;
            SubLObject asent = (SubLObject)inference_datastructures_problem_query.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list16);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list16);
            asent = current.first();
            current = current.rest();
            if (inference_datastructures_problem_query.NIL == current) {
                if (inference_datastructures_problem_query.NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, predicate)) {
                    return (SubLObject)inference_datastructures_problem_query.T;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem_query.$list16);
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        cdolist_list_var = clauses.pos_lits(contextualized_clause);
        contextualized_asent = (SubLObject)inference_datastructures_problem_query.NIL;
        contextualized_asent = cdolist_list_var.first();
        while (inference_datastructures_problem_query.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject mt = (SubLObject)inference_datastructures_problem_query.NIL;
            SubLObject asent = (SubLObject)inference_datastructures_problem_query.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list16);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list16);
            asent = current.first();
            current = current.rest();
            if (inference_datastructures_problem_query.NIL == current) {
                if (inference_datastructures_problem_query.NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, predicate)) {
                    return (SubLObject)inference_datastructures_problem_query.T;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem_query.$list16);
            }
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        }
        return (SubLObject)inference_datastructures_problem_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 3389L)
    public static SubLObject mt_asent_sense_from_atomic_contextualized_clause(final SubLObject contextualized_clause) {
        if (inference_datastructures_problem_query.NIL != clause_utilities.pos_atomic_clause_p(contextualized_clause)) {
            final SubLObject contextualized_asent = clause_utilities.atomic_clause_asent(contextualized_clause);
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject mt = (SubLObject)inference_datastructures_problem_query.NIL;
            SubLObject asent = (SubLObject)inference_datastructures_problem_query.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list16);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list16);
            asent = current.first();
            current = current.rest();
            if (inference_datastructures_problem_query.NIL == current) {
                return subl_promotions.values3(mt, asent, (SubLObject)inference_datastructures_problem_query.$kw17$POS);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem_query.$list16);
        }
        else if (inference_datastructures_problem_query.NIL != clause_utilities.neg_atomic_clause_p(contextualized_clause)) {
            final SubLObject contextualized_asent = clause_utilities.atomic_clause_asent(contextualized_clause);
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject mt = (SubLObject)inference_datastructures_problem_query.NIL;
            SubLObject asent = (SubLObject)inference_datastructures_problem_query.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list16);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list16);
            asent = current.first();
            current = current.rest();
            if (inference_datastructures_problem_query.NIL == current) {
                return subl_promotions.values3(mt, asent, (SubLObject)inference_datastructures_problem_query.$kw18$NEG);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem_query.$list16);
        }
        else {
            Errors.error((SubLObject)inference_datastructures_problem_query.$str19$_a_was_not_an_atomic_contextualiz, contextualized_clause);
        }
        return (SubLObject)inference_datastructures_problem_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 4099L)
    public static SubLObject contextualized_dnf_clauses_p(final SubLObject v_object) {
        if (inference_datastructures_problem_query.NIL != clauses.dnf_clauses_p(v_object)) {
            SubLObject cdolist_list_var = v_object;
            SubLObject dnf_clause = (SubLObject)inference_datastructures_problem_query.NIL;
            dnf_clause = cdolist_list_var.first();
            while (inference_datastructures_problem_query.NIL != cdolist_list_var) {
                if (inference_datastructures_problem_query.NIL == contextualized_dnf_clause_p(dnf_clause)) {
                    return (SubLObject)inference_datastructures_problem_query.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                dnf_clause = cdolist_list_var.first();
            }
            return (SubLObject)inference_datastructures_problem_query.T;
        }
        return (SubLObject)inference_datastructures_problem_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 4404L)
    public static SubLObject do_contextualized_clauses_literals(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list20);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject asent_var = (SubLObject)inference_datastructures_problem_query.NIL;
        SubLObject mt_var = (SubLObject)inference_datastructures_problem_query.NIL;
        SubLObject sense_var = (SubLObject)inference_datastructures_problem_query.NIL;
        SubLObject query = (SubLObject)inference_datastructures_problem_query.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list20);
        asent_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list20);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list20);
        sense_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list20);
        query = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_datastructures_problem_query.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_datastructures_problem_query.NIL;
        SubLObject current_$2 = (SubLObject)inference_datastructures_problem_query.NIL;
        while (inference_datastructures_problem_query.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem_query.$list20);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem_query.$list20);
            if (inference_datastructures_problem_query.NIL == conses_high.member(current_$2, (SubLObject)inference_datastructures_problem_query.$list21, (SubLObject)inference_datastructures_problem_query.UNPROVIDED, (SubLObject)inference_datastructures_problem_query.UNPROVIDED)) {
                bad = (SubLObject)inference_datastructures_problem_query.T;
            }
            if (current_$2 == inference_datastructures_problem_query.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_datastructures_problem_query.NIL != bad && inference_datastructures_problem_query.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem_query.$list20);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem_query.$kw4$DONE, current);
        final SubLObject done = (SubLObject)((inference_datastructures_problem_query.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_datastructures_problem_query.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject contextualized_clause = (SubLObject)inference_datastructures_problem_query.$sym22$CONTEXTUALIZED_CLAUSE;
        return (SubLObject)ConsesLow.list((SubLObject)inference_datastructures_problem_query.$sym23$DO_CLAUSES, (SubLObject)ConsesLow.list(contextualized_clause, query, (SubLObject)inference_datastructures_problem_query.$kw4$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem_query.$sym6$DO_CONTEXTUALIZED_CLAUSE_LITERALS, (SubLObject)ConsesLow.list(asent_var, mt_var, sense_var, contextualized_clause), ConsesLow.append(body, (SubLObject)inference_datastructures_problem_query.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 4740L)
    public static SubLObject sole_contextualized_asent_from_contextualized_clauses(final SubLObject contextualized_clauses) {
        assert inference_datastructures_problem_query.NIL != clause_utilities.atomic_clauses_p(contextualized_clauses) : contextualized_clauses;
        final SubLObject contextualized_clause = sole_contextualized_clause_from_singleton_contextualized_clauses(contextualized_clauses);
        return clause_utilities.atomic_clause_asent(contextualized_clause);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 5073L)
    public static SubLObject sole_contextualized_clause_from_singleton_contextualized_clauses(final SubLObject contextualized_clauses) {
        assert inference_datastructures_problem_query.NIL != list_utilities.singletonP(contextualized_clauses) : contextualized_clauses;
        return contextualized_clauses.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 5271L)
    public static SubLObject problem_query_p(final SubLObject v_object) {
        return contextualized_dnf_clauses_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 5504L)
    public static SubLObject explanatory_subquery_spec_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem_query.$kw26$ALL == v_object || inference_datastructures_problem_query.NIL != problem_query_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 5622L)
    public static SubLObject non_explanatory_subquery_spec_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem_query.NIL == v_object || inference_datastructures_problem_query.NIL != problem_query_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 5773L)
    public static SubLObject new_problem_query_from_contextualized_clause(final SubLObject contextualized_clause) {
        return (SubLObject)ConsesLow.list(contextualized_clause);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 5916L)
    public static SubLObject new_problem_query_without_literal(final SubLObject clause, final SubLObject sense, final SubLObject index) {
        return new_problem_query_from_contextualized_clause(clauses.clause_without_literal(clause, sense, index));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 6091L)
    public static SubLObject new_problem_query_from_subclause_spec(final SubLObject contextualized_clause, final SubLObject subclause_spec) {
        assert inference_datastructures_problem_query.NIL != clause_utilities.subclause_spec_p(subclause_spec) : subclause_spec;
        final SubLObject contextualized_subclause = clause_utilities.subclause_specified_by_spec(contextualized_clause, subclause_spec);
        return new_problem_query_from_contextualized_clause(contextualized_subclause);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 6422L)
    public static SubLObject new_problem_query_without_subclause_spec(final SubLObject contextualized_clause, final SubLObject subclause_spec) {
        assert inference_datastructures_problem_query.NIL != clause_utilities.subclause_spec_p(subclause_spec) : subclause_spec;
        final SubLObject contextualized_subclause = clause_utilities.complement_of_subclause_specified_by_spec(contextualized_clause, subclause_spec);
        return new_problem_query_from_contextualized_clause(contextualized_subclause);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 6770L)
    public static SubLObject new_problem_query_from_contextualized_asent_sense(final SubLObject contextualized_asent, final SubLObject sense) {
        if (sense.eql((SubLObject)inference_datastructures_problem_query.$kw17$POS)) {
            return new_problem_query_from_contextualized_clause(clauses.make_clause((SubLObject)inference_datastructures_problem_query.NIL, (SubLObject)ConsesLow.list(contextualized_asent)));
        }
        if (sense.eql((SubLObject)inference_datastructures_problem_query.$kw18$NEG)) {
            return new_problem_query_from_contextualized_clause(clauses.make_clause((SubLObject)ConsesLow.list(contextualized_asent), (SubLObject)inference_datastructures_problem_query.NIL));
        }
        return (SubLObject)inference_datastructures_problem_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 7115L)
    public static SubLObject new_problem_query_from_mt_asent_sense(final SubLObject mt, final SubLObject asent, final SubLObject sense) {
        final SubLObject contextualized_asent = make_contextualized_asent(mt, asent);
        return new_problem_query_from_contextualized_asent_sense(contextualized_asent, sense);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 7350L)
    public static SubLObject do_problem_query_literals(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list20);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject asent_var = (SubLObject)inference_datastructures_problem_query.NIL;
        SubLObject mt_var = (SubLObject)inference_datastructures_problem_query.NIL;
        SubLObject sense_var = (SubLObject)inference_datastructures_problem_query.NIL;
        SubLObject query = (SubLObject)inference_datastructures_problem_query.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list20);
        asent_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list20);
        mt_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list20);
        sense_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list20);
        query = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)inference_datastructures_problem_query.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)inference_datastructures_problem_query.NIL;
        SubLObject current_$3 = (SubLObject)inference_datastructures_problem_query.NIL;
        while (inference_datastructures_problem_query.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem_query.$list20);
            current_$3 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)inference_datastructures_problem_query.$list20);
            if (inference_datastructures_problem_query.NIL == conses_high.member(current_$3, (SubLObject)inference_datastructures_problem_query.$list21, (SubLObject)inference_datastructures_problem_query.UNPROVIDED, (SubLObject)inference_datastructures_problem_query.UNPROVIDED)) {
                bad = (SubLObject)inference_datastructures_problem_query.T;
            }
            if (current_$3 == inference_datastructures_problem_query.$kw2$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (inference_datastructures_problem_query.NIL != bad && inference_datastructures_problem_query.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem_query.$list20);
        }
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)inference_datastructures_problem_query.$kw4$DONE, current);
        final SubLObject done = (SubLObject)((inference_datastructures_problem_query.NIL != done_tail) ? conses_high.cadr(done_tail) : inference_datastructures_problem_query.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)inference_datastructures_problem_query.$sym28$DO_CONTEXTUALIZED_CLAUSES_LITERALS, (SubLObject)ConsesLow.list(asent_var, mt_var, sense_var, query, (SubLObject)inference_datastructures_problem_query.$kw4$DONE, done), ConsesLow.append(body, (SubLObject)inference_datastructures_problem_query.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 7577L)
    public static SubLObject problem_query_in_equality_reasoning_domainP(final SubLObject query, final SubLObject equality_reasoning_domain) {
        if (equality_reasoning_domain.eql((SubLObject)inference_datastructures_problem_query.$kw29$NONE)) {
            return (SubLObject)inference_datastructures_problem_query.NIL;
        }
        if (equality_reasoning_domain.eql((SubLObject)inference_datastructures_problem_query.$kw26$ALL)) {
            return (SubLObject)inference_datastructures_problem_query.T;
        }
        if (equality_reasoning_domain.eql((SubLObject)inference_datastructures_problem_query.$kw30$SINGLE_LITERAL)) {
            return clause_utilities.atomic_clauses_p(query);
        }
        Errors.error((SubLObject)inference_datastructures_problem_query.$str31$Unexpected_equality_reasoning_dom, equality_reasoning_domain);
        return (SubLObject)inference_datastructures_problem_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 7938L)
    public static SubLObject problem_query_variables(final SubLObject query) {
        return cycl_utilities.expression_gather(query, (SubLObject)inference_datastructures_problem_query.$sym32$HL_VARIABLE_P, (SubLObject)inference_datastructures_problem_query.UNPROVIDED, (SubLObject)inference_datastructures_problem_query.UNPROVIDED, (SubLObject)inference_datastructures_problem_query.UNPROVIDED, (SubLObject)inference_datastructures_problem_query.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 8039L)
    public static SubLObject single_clause_problem_query_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem_query.NIL != problem_query_p(v_object) && inference_datastructures_problem_query.NIL != list_utilities.singletonP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 8260L)
    public static SubLObject sole_contextualized_clause_from_single_clause_problem_query(final SubLObject problem_query) {
        assert inference_datastructures_problem_query.NIL != single_clause_problem_query_p(problem_query) : problem_query;
        return sole_contextualized_clause_from_singleton_contextualized_clauses(problem_query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 8506L)
    public static SubLObject single_literal_problem_query_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem_query.NIL != problem_query_p(v_object) && inference_datastructures_problem_query.NIL != problem_query_has_single_literal_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 8924L)
    public static SubLObject problem_query_has_single_literal_p(final SubLObject problem_query) {
        return (SubLObject)SubLObjectFactory.makeBoolean(inference_datastructures_problem_query.NIL != list_utilities.singletonP(problem_query) && inference_datastructures_problem_query.NIL != clauses.atomic_clause_p(problem_query.first()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 9248L)
    public static SubLObject asent_sense_and_mt_to_problem_query(final SubLObject asent, final SubLObject sense, final SubLObject mt) {
        final SubLObject truth = enumeration_types.sense_truth(sense);
        final SubLObject dnf = clause_utilities.make_gaf_dnf_with_truth(asent, truth);
        final SubLObject contextualized_clause = inference_czer.contextualize_clause(dnf, mt, (SubLObject)inference_datastructures_problem_query.UNPROVIDED);
        return (SubLObject)ConsesLow.list(contextualized_clause);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 9629L)
    public static SubLObject single_literal_problem_query_sense(final SubLObject query) {
        if (inference_datastructures_problem_query.NIL != clause_utilities.pos_atomic_clauses_p(query)) {
            return (SubLObject)inference_datastructures_problem_query.$kw17$POS;
        }
        return (SubLObject)inference_datastructures_problem_query.$kw18$NEG;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 9863L)
    public static SubLObject single_literal_problem_query_mt(final SubLObject query) {
        final SubLObject dnf_clause = query.first();
        final SubLObject contextualized_asent = clause_utilities.atomic_clause_asent(dnf_clause);
        SubLObject current;
        final SubLObject datum = current = contextualized_asent;
        SubLObject mt = (SubLObject)inference_datastructures_problem_query.NIL;
        SubLObject asent = (SubLObject)inference_datastructures_problem_query.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list16);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list16);
        asent = current.first();
        current = current.rest();
        if (inference_datastructures_problem_query.NIL == current) {
            return mt;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem_query.$list16);
        return (SubLObject)inference_datastructures_problem_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 10126L)
    public static SubLObject single_literal_problem_query_atomic_sentence(final SubLObject query) {
        final SubLObject dnf_clause = query.first();
        final SubLObject contextualized_asent = clause_utilities.atomic_clause_asent(dnf_clause);
        if (inference_datastructures_problem_query.NIL != contextualized_asent) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject mt = (SubLObject)inference_datastructures_problem_query.NIL;
            SubLObject asent = (SubLObject)inference_datastructures_problem_query.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list16);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)inference_datastructures_problem_query.$list16);
            asent = current.first();
            current = current.rest();
            if (inference_datastructures_problem_query.NIL == current) {
                return asent;
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)inference_datastructures_problem_query.$list16);
        }
        return (SubLObject)inference_datastructures_problem_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 10427L)
    public static SubLObject single_literal_problem_query_predicate(final SubLObject query) {
        final SubLObject asent = single_literal_problem_query_atomic_sentence(query);
        final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        return predicate;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 10756L)
    public static SubLObject mt_asent_sense_from_singleton_query(final SubLObject query) {
        final SubLObject clause = query.first();
        return mt_asent_sense_from_atomic_contextualized_clause(clause);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 11215L)
    public static SubLObject formula_term_signature(final SubLObject formula, SubLObject signature_size) {
        if (signature_size == inference_datastructures_problem_query.UNPROVIDED) {
            signature_size = (SubLObject)inference_datastructures_problem_query.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)inference_datastructures_problem_query.NIL;
        final SubLObject _prev_bind_0 = inference_datastructures_problem_query.$formula_term_signature_counts$.currentBinding(thread);
        try {
            inference_datastructures_problem_query.$formula_term_signature_counts$.bind(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)inference_datastructures_problem_query.EQUAL), signature_size), thread);
            list_utilities.tree_map((SubLObject)inference_datastructures_problem_query.$sym34$FORMULA_TERM_SIGNATURE_VISIT, formula, (SubLObject)inference_datastructures_problem_query.UNPROVIDED);
            result = postprocess_formula_term_signature(inference_datastructures_problem_query.$formula_term_signature_counts$.getDynamicValue(thread));
        }
        finally {
            inference_datastructures_problem_query.$formula_term_signature_counts$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 11890L)
    public static SubLObject problem_query_term_signature(final SubLObject problem_query) {
        final SubLObject estimated_size = problem_query_term_signature_estimated_size(problem_query);
        return formula_term_signature(problem_query, estimated_size);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 12440L)
    public static SubLObject problem_query_term_signature_estimated_size(final SubLObject problem_query) {
        final SubLObject literal_count = inference_datastructures_problem.problem_query_literal_count(problem_query, (SubLObject)inference_datastructures_problem_query.UNPROVIDED);
        return Numbers.add((SubLObject)inference_datastructures_problem_query.THREE_INTEGER, literal_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 12727L)
    public static SubLObject formula_term_signature_visit(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (inference_datastructures_problem_query.NIL != v_object && v_object.isAtom()) {
            dictionary_utilities.dictionary_increment(inference_datastructures_problem_query.$formula_term_signature_counts$.getDynamicValue(thread), v_object, (SubLObject)inference_datastructures_problem_query.UNPROVIDED);
        }
        return (SubLObject)inference_datastructures_problem_query.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 12907L)
    public static SubLObject postprocess_formula_term_signature(final SubLObject counts_map) {
        SubLObject alist = dictionary_utilities.dictionary_to_alist(counts_map);
        final SubLObject var0 = variables.get_variable((SubLObject)inference_datastructures_problem_query.ZERO_INTEGER);
        SubLObject cdolist_list_var = alist;
        SubLObject tuple = (SubLObject)inference_datastructures_problem_query.NIL;
        tuple = cdolist_list_var.first();
        while (inference_datastructures_problem_query.NIL != cdolist_list_var) {
            if (inference_datastructures_problem_query.NIL != variables.variable_p(tuple.first())) {
                ConsesLow.rplaca(tuple, var0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        alist = Sort.sort(alist, Symbols.symbol_function((SubLObject)inference_datastructures_problem_query.$sym35$TERM__), Symbols.symbol_function((SubLObject)inference_datastructures_problem_query.$sym36$CAR));
        alist = Sort.stable_sort(alist, Symbols.symbol_function((SubLObject)inference_datastructures_problem_query.$sym37$_), Symbols.symbol_function((SubLObject)inference_datastructures_problem_query.$sym38$CDR));
        return list_utilities.alist_to_plist(alist);
    }
    
    public static SubLObject declare_inference_datastructures_problem_query_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "hl_contextualized_asent_p", "HL-CONTEXTUALIZED-ASENT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "inference_context_spec_p", "INFERENCE-CONTEXT-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "make_contextualized_asent", "MAKE-CONTEXTUALIZED-ASENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "contextualized_asent_mt", "CONTEXTUALIZED-ASENT-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "contextualized_asent_asent", "CONTEXTUALIZED-ASENT-ASENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "contextualized_asent_predicate", "CONTEXTUALIZED-ASENT-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "contextualized_dnf_clause_p", "CONTEXTUALIZED-DNF-CLAUSE-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "do_contextualized_clause_literals", "DO-CONTEXTUALIZED-CLAUSE-LITERALS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "contextualized_clause_has_literal_with_predicateP", "CONTEXTUALIZED-CLAUSE-HAS-LITERAL-WITH-PREDICATE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "mt_asent_sense_from_atomic_contextualized_clause", "MT-ASENT-SENSE-FROM-ATOMIC-CONTEXTUALIZED-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "contextualized_dnf_clauses_p", "CONTEXTUALIZED-DNF-CLAUSES-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "do_contextualized_clauses_literals", "DO-CONTEXTUALIZED-CLAUSES-LITERALS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "sole_contextualized_asent_from_contextualized_clauses", "SOLE-CONTEXTUALIZED-ASENT-FROM-CONTEXTUALIZED-CLAUSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "sole_contextualized_clause_from_singleton_contextualized_clauses", "SOLE-CONTEXTUALIZED-CLAUSE-FROM-SINGLETON-CONTEXTUALIZED-CLAUSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "problem_query_p", "PROBLEM-QUERY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "explanatory_subquery_spec_p", "EXPLANATORY-SUBQUERY-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "non_explanatory_subquery_spec_p", "NON-EXPLANATORY-SUBQUERY-SPEC-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "new_problem_query_from_contextualized_clause", "NEW-PROBLEM-QUERY-FROM-CONTEXTUALIZED-CLAUSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "new_problem_query_without_literal", "NEW-PROBLEM-QUERY-WITHOUT-LITERAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "new_problem_query_from_subclause_spec", "NEW-PROBLEM-QUERY-FROM-SUBCLAUSE-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "new_problem_query_without_subclause_spec", "NEW-PROBLEM-QUERY-WITHOUT-SUBCLAUSE-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "new_problem_query_from_contextualized_asent_sense", "NEW-PROBLEM-QUERY-FROM-CONTEXTUALIZED-ASENT-SENSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "new_problem_query_from_mt_asent_sense", "NEW-PROBLEM-QUERY-FROM-MT-ASENT-SENSE", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "do_problem_query_literals", "DO-PROBLEM-QUERY-LITERALS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "problem_query_in_equality_reasoning_domainP", "PROBLEM-QUERY-IN-EQUALITY-REASONING-DOMAIN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "problem_query_variables", "PROBLEM-QUERY-VARIABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "single_clause_problem_query_p", "SINGLE-CLAUSE-PROBLEM-QUERY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "sole_contextualized_clause_from_single_clause_problem_query", "SOLE-CONTEXTUALIZED-CLAUSE-FROM-SINGLE-CLAUSE-PROBLEM-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "single_literal_problem_query_p", "SINGLE-LITERAL-PROBLEM-QUERY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "problem_query_has_single_literal_p", "PROBLEM-QUERY-HAS-SINGLE-LITERAL-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "asent_sense_and_mt_to_problem_query", "ASENT-SENSE-AND-MT-TO-PROBLEM-QUERY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "single_literal_problem_query_sense", "SINGLE-LITERAL-PROBLEM-QUERY-SENSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "single_literal_problem_query_mt", "SINGLE-LITERAL-PROBLEM-QUERY-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "single_literal_problem_query_atomic_sentence", "SINGLE-LITERAL-PROBLEM-QUERY-ATOMIC-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "single_literal_problem_query_predicate", "SINGLE-LITERAL-PROBLEM-QUERY-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "mt_asent_sense_from_singleton_query", "MT-ASENT-SENSE-FROM-SINGLETON-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "formula_term_signature", "FORMULA-TERM-SIGNATURE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "problem_query_term_signature", "PROBLEM-QUERY-TERM-SIGNATURE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "problem_query_term_signature_estimated_size", "PROBLEM-QUERY-TERM-SIGNATURE-ESTIMATED-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "formula_term_signature_visit", "FORMULA-TERM-SIGNATURE-VISIT", 1, 0, false);
        new $formula_term_signature_visit$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query", "postprocess_formula_term_signature", "POSTPROCESS-FORMULA-TERM-SIGNATURE", 1, 0, false);
        return (SubLObject)inference_datastructures_problem_query.NIL;
    }
    
    public static SubLObject init_inference_datastructures_problem_query_file() {
        inference_datastructures_problem_query.$formula_term_signature_counts$ = SubLFiles.defparameter("*FORMULA-TERM-SIGNATURE-COUNTS*", (SubLObject)inference_datastructures_problem_query.NIL);
        return (SubLObject)inference_datastructures_problem_query.NIL;
    }
    
    public static SubLObject setup_inference_datastructures_problem_query_file() {
        utilities_macros.note_funcall_helper_function((SubLObject)inference_datastructures_problem_query.$sym34$FORMULA_TERM_SIGNATURE_VISIT);
        return (SubLObject)inference_datastructures_problem_query.NIL;
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
        me = (SubLFile)new inference_datastructures_problem_query();
        inference_datastructures_problem_query.$formula_term_signature_counts$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASENT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("CONTEXTUALIZED-CLAUSE"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw2$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw3$INDEX = SubLObjectFactory.makeKeyword("INDEX");
        $kw4$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym5$INDEX_VAR = SubLObjectFactory.makeUninternedSymbol("INDEX-VAR");
        $sym6$DO_CONTEXTUALIZED_CLAUSE_LITERALS = SubLObjectFactory.makeSymbol("DO-CONTEXTUALIZED-CLAUSE-LITERALS");
        $sym7$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $sym8$CONTEXTUALIZED_ASENT = SubLObjectFactory.makeUninternedSymbol("CONTEXTUALIZED-ASENT");
        $sym9$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym10$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NEG"));
        $sym12$DO_NEG_LITS_NUMBERED = SubLObjectFactory.makeSymbol("DO-NEG-LITS-NUMBERED");
        $sym13$DESTRUCTURE_CONTEXTUALIZED_ASENT = SubLObjectFactory.makeSymbol("DESTRUCTURE-CONTEXTUALIZED-ASENT");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POS"));
        $sym15$DO_POS_LITS_NUMBERED = SubLObjectFactory.makeSymbol("DO-POS-LITS-NUMBERED");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"));
        $kw17$POS = SubLObjectFactory.makeKeyword("POS");
        $kw18$NEG = SubLObjectFactory.makeKeyword("NEG");
        $str19$_a_was_not_an_atomic_contextualiz = SubLObjectFactory.makeString("~a was not an atomic contextualized-clause");
        $list20 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASENT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("SENSE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym22$CONTEXTUALIZED_CLAUSE = SubLObjectFactory.makeUninternedSymbol("CONTEXTUALIZED-CLAUSE");
        $sym23$DO_CLAUSES = SubLObjectFactory.makeSymbol("DO-CLAUSES");
        $sym24$ATOMIC_CLAUSES_P = SubLObjectFactory.makeSymbol("ATOMIC-CLAUSES-P");
        $sym25$SINGLETON_ = SubLObjectFactory.makeSymbol("SINGLETON?");
        $kw26$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym27$SUBCLAUSE_SPEC_P = SubLObjectFactory.makeSymbol("SUBCLAUSE-SPEC-P");
        $sym28$DO_CONTEXTUALIZED_CLAUSES_LITERALS = SubLObjectFactory.makeSymbol("DO-CONTEXTUALIZED-CLAUSES-LITERALS");
        $kw29$NONE = SubLObjectFactory.makeKeyword("NONE");
        $kw30$SINGLE_LITERAL = SubLObjectFactory.makeKeyword("SINGLE-LITERAL");
        $str31$Unexpected_equality_reasoning_dom = SubLObjectFactory.makeString("Unexpected equality reasoning domain ~a");
        $sym32$HL_VARIABLE_P = SubLObjectFactory.makeSymbol("HL-VARIABLE-P");
        $sym33$SINGLE_CLAUSE_PROBLEM_QUERY_P = SubLObjectFactory.makeSymbol("SINGLE-CLAUSE-PROBLEM-QUERY-P");
        $sym34$FORMULA_TERM_SIGNATURE_VISIT = SubLObjectFactory.makeSymbol("FORMULA-TERM-SIGNATURE-VISIT");
        $sym35$TERM__ = SubLObjectFactory.makeSymbol("TERM-<");
        $sym36$CAR = SubLObjectFactory.makeSymbol("CAR");
        $sym37$_ = SubLObjectFactory.makeSymbol(">");
        $sym38$CDR = SubLObjectFactory.makeSymbol("CDR");
    }
    
    public static final class $formula_term_signature_visit$UnaryFunction extends UnaryFunction
    {
        public $formula_term_signature_visit$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORMULA-TERM-SIGNATURE-VISIT"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return inference_datastructures_problem_query.formula_term_signature_visit(arg1);
        }
    }
}

/*

	Total time: 229 ms
	
*/