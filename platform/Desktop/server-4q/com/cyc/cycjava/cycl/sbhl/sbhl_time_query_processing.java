package com.cyc.cycjava.cycl.sbhl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.cb_utilities;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.el_utilities;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_time_query_processing extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing";
    public static final String myFingerPrint = "439b201871f86a4dbd6f9dcb8ec1099667de30bb3240c4af3cdba56107432af2";
    private static final SubLSymbol $kw0$CONJUNCTION_FN;
    private static final SubLSymbol $kw1$POS;
    private static final SubLSymbol $kw2$NEG;
    private static final SubLList $list3;
    private static final SubLSymbol $kw4$CONDITIONAL_PROOF;
    private static final SubLSymbol $kw5$WEAK;
    private static final SubLSymbol $kw6$STRICT;
    private static final SubLSymbol $kw7$WEAK_SUCCESSOR;
    private static final SubLSymbol $kw8$SUCCESSOR_STRICT;
    private static final SubLSymbol $kw9$COORDINATE;
    private static final SubLSymbol $kw10$SUCCESSOR;
    private static final SubLSymbol $kw11$START;
    private static final SubLSymbol $kw12$END;
    private static final SubLSymbol $kw13$WEAK_SUCCESSORS_SUCCESSOR;
    private static final SubLSymbol $kw14$WEAK_SUCCESSORS_SUCCESSORS_SUCCESSOR;
    private static final SubLSymbol $kw15$SUCCESSORS_SUCCESSOR_STRICT;
    private static final SubLSymbol $kw16$SUCCESSORS_SUCCESSOR;
    private static final SubLSymbol $kw17$PREDECESSOR;
    private static final SubLSymbol $kw18$WEAK_SUCCESSORS_SUCCESSOR_SUCCESSOR;
    private static final SubLInteger $int19$1000;
    private static final SubLSymbol $kw20$DO_HASH_TABLE;
    private static final SubLInteger $int21$_2;
    private static final SubLSymbol $kw22$REFLEXIVE;
    private static final SubLObject $const23$equals;
    private static final SubLSymbol $kw24$EQUALITY;
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 796L)
    public static SubLObject true_temporal_relation_literalP(final SubLObject pred, final SubLObject arg1, final SubLObject arg2, final SubLObject sense, SubLObject mt) {
        if (mt == sbhl_time_query_processing.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_query_processing.NIL;
        }
        if (sbhl_time_query_processing.NIL == sbhl_time_utilities.valid_sbhl_time_literal_argsP(pred, arg1, arg2)) {
            return (SubLObject)sbhl_time_query_processing.NIL;
        }
        final SubLObject conjunction_fn = sbhl_time_modules.get_sbhl_time_module(pred, (SubLObject)sbhl_time_query_processing.$kw0$CONJUNCTION_FN, (SubLObject)sbhl_time_query_processing.UNPROVIDED);
        if (!conjunction_fn.isFunctionSpec()) {
            return (SubLObject)sbhl_time_query_processing.NIL;
        }
        final SubLObject conjuncts = Functions.funcall(conjunction_fn, arg1, arg2);
        if (sense.eql((SubLObject)sbhl_time_query_processing.$kw1$POS)) {
            if (sbhl_time_query_processing.NIL != sbhl_time_utilities.conjunctive_temporal_relation_predP(pred)) {
                return true_temporal_quasi_link_conjunctionP(conjuncts, mt);
            }
            if (sbhl_time_query_processing.NIL != sbhl_time_utilities.disjunctive_temporal_relation_predP(pred)) {
                return false_temporal_quasi_link_conjunctionP(conjuncts, mt);
            }
        }
        else if (sense.eql((SubLObject)sbhl_time_query_processing.$kw2$NEG)) {
            if (sbhl_time_query_processing.NIL != sbhl_time_utilities.conjunctive_temporal_relation_predP(pred)) {
                return false_temporal_quasi_link_conjunctionP(conjuncts, mt);
            }
            if (sbhl_time_query_processing.NIL != sbhl_time_utilities.disjunctive_temporal_relation_predP(pred)) {
                return true_temporal_quasi_link_conjunctionP(conjuncts, mt);
            }
        }
        return (SubLObject)sbhl_time_query_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 1813L)
    public static SubLObject true_temporal_quasi_link_conjunctionP(final SubLObject quasi_conjuncts, SubLObject mt) {
        if (mt == sbhl_time_query_processing.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_query_processing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject unverified_conjunctP = (SubLObject)sbhl_time_query_processing.NIL;
        final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding(thread);
        try {
            sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind((SubLObject)sbhl_time_query_processing.NIL, thread);
            if (sbhl_time_query_processing.NIL == mt && sbhl_time_query_processing.NIL == mt_relevance_macros.all_mts_are_relevantP() && sbhl_time_query_processing.NIL == mt_relevance_macros.any_mt_is_relevantP()) {
                mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
            }
            if (sbhl_time_query_processing.NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                add_temporal_link_disjunction_consequents(mt);
            }
            if (sbhl_time_query_processing.NIL == unverified_conjunctP) {
                SubLObject csome_list_var = quasi_conjuncts;
                SubLObject conjunct = (SubLObject)sbhl_time_query_processing.NIL;
                conjunct = csome_list_var.first();
                while (sbhl_time_query_processing.NIL == unverified_conjunctP && sbhl_time_query_processing.NIL != csome_list_var) {
                    final SubLObject link_tag = conjunct.first();
                    final SubLObject before = conses_high.second(conjunct);
                    final SubLObject after = conses_high.third(conjunct);
                    unverified_conjunctP = (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_query_processing.NIL == true_temporal_quasi_linkP(link_tag, before, after, mt));
                    csome_list_var = csome_list_var.rest();
                    conjunct = csome_list_var.first();
                }
            }
            if (sbhl_time_query_processing.NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                remove_temporal_link_disjunction_consequents(mt);
            }
        }
        finally {
            sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_query_processing.NIL == unverified_conjunctP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 2314L)
    public static SubLObject false_temporal_quasi_link_conjunctionP(final SubLObject quasi_conjuncts, SubLObject mt) {
        if (mt == sbhl_time_query_processing.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_query_processing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject quasi_disjuncts = temporal_link_conjunction_negation(quasi_conjuncts);
        SubLObject verified_disjunctP = (SubLObject)sbhl_time_query_processing.NIL;
        final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding(thread);
        try {
            sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind((SubLObject)sbhl_time_query_processing.NIL, thread);
            if (sbhl_time_query_processing.NIL == mt && sbhl_time_query_processing.NIL == mt_relevance_macros.all_mts_are_relevantP() && sbhl_time_query_processing.NIL == mt_relevance_macros.any_mt_is_relevantP()) {
                mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
            }
            if (sbhl_time_query_processing.NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                add_temporal_link_disjunction_consequents(mt);
            }
            if (sbhl_time_query_processing.NIL == verified_disjunctP) {
                SubLObject csome_list_var = quasi_disjuncts;
                SubLObject quasi_disjunct = (SubLObject)sbhl_time_query_processing.NIL;
                quasi_disjunct = csome_list_var.first();
                while (sbhl_time_query_processing.NIL == verified_disjunctP && sbhl_time_query_processing.NIL != csome_list_var) {
                    final SubLObject link_tag = quasi_disjunct.first();
                    final SubLObject before = conses_high.second(quasi_disjunct);
                    final SubLObject after = conses_high.third(quasi_disjunct);
                    verified_disjunctP = true_temporal_quasi_linkP(link_tag, before, after, mt);
                    csome_list_var = csome_list_var.rest();
                    quasi_disjunct = csome_list_var.first();
                }
            }
            if (sbhl_time_query_processing.NIL == verified_disjunctP) {
                SubLObject disjunct = (SubLObject)sbhl_time_query_processing.NIL;
                SubLObject disjuncts = (SubLObject)sbhl_time_query_processing.NIL;
                SubLObject cdolist_list_var = quasi_disjuncts;
                SubLObject quasi_disjunct2 = (SubLObject)sbhl_time_query_processing.NIL;
                quasi_disjunct2 = cdolist_list_var.first();
                while (sbhl_time_query_processing.NIL != cdolist_list_var) {
                    final SubLObject link = adjust_temporal_quasi_link_to_link_disjunction_terms_and_existing_nodes(quasi_disjunct2);
                    final SubLObject link_tag2 = link.first();
                    if (sbhl_time_query_processing.NIL != link) {
                        if (sbhl_time_query_processing.NIL != disjunct) {
                            disjuncts = (SubLObject)ConsesLow.cons(link, disjuncts);
                        }
                        else if (sbhl_time_query_processing.NIL != subl_promotions.memberP(link_tag2, (SubLObject)sbhl_time_query_processing.$list3, (SubLObject)sbhl_time_query_processing.UNPROVIDED, (SubLObject)sbhl_time_query_processing.UNPROVIDED)) {
                            disjunct = link;
                        }
                        else {
                            disjuncts = (SubLObject)ConsesLow.cons(link, disjuncts);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    quasi_disjunct2 = cdolist_list_var.first();
                }
                if (sbhl_time_query_processing.NIL == disjunct) {
                    disjunct = disjuncts.first();
                    disjuncts = disjuncts.rest();
                }
                if (sbhl_time_query_processing.NIL != disjuncts) {
                    SubLObject conjuncts = (SubLObject)sbhl_time_query_processing.NIL;
                    SubLObject link_addedP = (SubLObject)sbhl_time_query_processing.NIL;
                    if (sbhl_time_query_processing.NIL == mt) {
                        mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                    }
                    SubLObject cdolist_list_var2 = disjuncts;
                    SubLObject link2 = (SubLObject)sbhl_time_query_processing.NIL;
                    link2 = cdolist_list_var2.first();
                    while (sbhl_time_query_processing.NIL != cdolist_list_var2) {
                        conjuncts = (SubLObject)ConsesLow.cons(temporal_link_negation(link2), conjuncts);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        link2 = cdolist_list_var2.first();
                    }
                    cdolist_list_var2 = conjuncts;
                    SubLObject conjunct = (SubLObject)sbhl_time_query_processing.NIL;
                    conjunct = cdolist_list_var2.first();
                    while (sbhl_time_query_processing.NIL != cdolist_list_var2) {
                        final SubLObject link_tag3 = conjunct.first();
                        final SubLObject before2 = conses_high.second(conjunct);
                        final SubLObject after2 = conses_high.third(conjunct);
                        link_addedP = (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_query_processing.NIL != sbhl_time_assertion_processing.add_temporal_link((SubLObject)sbhl_time_query_processing.$kw4$CONDITIONAL_PROOF, link_tag3, before2, after2, mt) || sbhl_time_query_processing.NIL != link_addedP);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        conjunct = cdolist_list_var2.first();
                    }
                    if (sbhl_time_query_processing.NIL != link_addedP) {
                        if (sbhl_time_query_processing.NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                            add_temporal_link_disjunction_consequents(mt);
                        }
                        final SubLObject link_tag4 = disjunct.first();
                        final SubLObject before3 = conses_high.second(disjunct);
                        final SubLObject after3 = conses_high.third(disjunct);
                        verified_disjunctP = true_temporal_linkP(link_tag4, before3, after3, mt);
                    }
                    cdolist_list_var2 = conjuncts;
                    conjunct = (SubLObject)sbhl_time_query_processing.NIL;
                    conjunct = cdolist_list_var2.first();
                    while (sbhl_time_query_processing.NIL != cdolist_list_var2) {
                        final SubLObject link_tag3 = conjunct.first();
                        final SubLObject before2 = conses_high.second(conjunct);
                        final SubLObject after2 = conses_high.third(conjunct);
                        sbhl_time_assertion_processing.remove_temporal_link((SubLObject)sbhl_time_query_processing.$kw4$CONDITIONAL_PROOF, link_tag3, before2, after2, mt);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        conjunct = cdolist_list_var2.first();
                    }
                }
            }
            if (sbhl_time_query_processing.NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                remove_temporal_link_disjunction_consequents(mt);
            }
        }
        finally {
            sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind(_prev_bind_0, thread);
        }
        return verified_disjunctP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 4856L)
    public static SubLObject temporal_link_conjunction_negation(final SubLObject conjuncts) {
        SubLObject disjuncts = (SubLObject)sbhl_time_query_processing.NIL;
        SubLObject cdolist_list_var = conjuncts;
        SubLObject conjunct = (SubLObject)sbhl_time_query_processing.NIL;
        conjunct = cdolist_list_var.first();
        while (sbhl_time_query_processing.NIL != cdolist_list_var) {
            final SubLObject link_tag = conjunct.first();
            final SubLObject before = conses_high.second(conjunct);
            final SubLObject after = conses_high.third(conjunct);
            final SubLObject pcase_var = link_tag;
            if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw5$WEAK)) {
                disjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)sbhl_time_query_processing.$kw6$STRICT, after, before), disjuncts);
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw6$STRICT)) {
                disjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)sbhl_time_query_processing.$kw5$WEAK, after, before), disjuncts);
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw7$WEAK_SUCCESSOR)) {
                disjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)sbhl_time_query_processing.$kw8$SUCCESSOR_STRICT, after, before), disjuncts);
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw8$SUCCESSOR_STRICT)) {
                disjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)sbhl_time_query_processing.$kw7$WEAK_SUCCESSOR, after, before), disjuncts);
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw9$COORDINATE)) {
                disjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)sbhl_time_query_processing.$kw6$STRICT, after, before), disjuncts);
                disjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)sbhl_time_query_processing.$kw6$STRICT, before, after), disjuncts);
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw10$SUCCESSOR)) {
                disjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)sbhl_time_query_processing.$kw5$WEAK, after, before), disjuncts);
                disjuncts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)sbhl_time_query_processing.$kw8$SUCCESSOR_STRICT, before, after), disjuncts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        }
        return disjuncts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 5712L)
    public static SubLObject temporal_link_negation(final SubLObject link) {
        final SubLObject link_tag = link.first();
        final SubLObject before = conses_high.second(link);
        final SubLObject after = conses_high.third(link);
        final SubLObject pcase_var = link_tag;
        if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw5$WEAK)) {
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_time_query_processing.$kw6$STRICT, after, before);
        }
        if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw6$STRICT)) {
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_time_query_processing.$kw5$WEAK, after, before);
        }
        if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw7$WEAK_SUCCESSOR)) {
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_time_query_processing.$kw8$SUCCESSOR_STRICT, after, before);
        }
        if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw8$SUCCESSOR_STRICT)) {
            return (SubLObject)ConsesLow.list((SubLObject)sbhl_time_query_processing.$kw7$WEAK_SUCCESSOR, after, before);
        }
        return (SubLObject)sbhl_time_query_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 6152L)
    public static SubLObject adjust_temporal_quasi_link_to_existing_nodes(final SubLObject quasi_link) {
        SubLObject link_tag = quasi_link.first();
        SubLObject before = conses_high.second(quasi_link);
        SubLObject after = conses_high.third(quasi_link);
        final SubLObject link_before_half = adjust_quasi_link_before_half_to_existing_nodes(link_tag, before);
        if (sbhl_time_query_processing.NIL == link_before_half) {
            return (SubLObject)sbhl_time_query_processing.NIL;
        }
        link_tag = link_before_half.first();
        before = conses_high.second(link_before_half);
        final SubLObject link_after_half = adjust_quasi_link_after_half_to_existing_nodes(link_tag, after);
        if (sbhl_time_query_processing.NIL == link_after_half) {
            return (SubLObject)sbhl_time_query_processing.NIL;
        }
        link_tag = link_after_half.first();
        after = conses_high.second(link_after_half);
        return (SubLObject)ConsesLow.list(link_tag, before, after);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 6882L)
    public static SubLObject adjust_quasi_link_before_half_to_existing_nodes(SubLObject link_tag, final SubLObject quasi_before) {
        final SubLObject before_tag = quasi_before.first();
        final SubLObject before_time = conses_high.second(quasi_before);
        SubLObject before = (SubLObject)sbhl_time_query_processing.NIL;
        SubLObject date_adjusted_to_predecessorP = (SubLObject)sbhl_time_query_processing.NIL;
        SubLObject date_adjusted_to_successorP = (SubLObject)sbhl_time_query_processing.NIL;
        SubLObject date_adjusted_to_closest_existing_dateP = (SubLObject)sbhl_time_query_processing.NIL;
        if (sbhl_time_query_processing.NIL != sbhl_time_dates.sbhl_date_p(before_time)) {
            final SubLObject pcase_var = before_tag;
            if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw11$START)) {
                return (SubLObject)ConsesLow.list(link_tag, sbhl_time_utilities.hl_start(before_time));
            }
            if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw12$END)) {
                return (SubLObject)ConsesLow.list(link_tag, sbhl_time_utilities.hl_end(before_time));
            }
        }
        SubLObject pcase_var = before_tag;
        if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw11$START)) {
            before = sbhl_time_utilities.hl_start(before_time);
            if (sbhl_time_query_processing.NIL == sbhl_time_utilities.sbhl_temporal_node_p(before)) {
                if (before_time.isInteger()) {
                    before = sbhl_time_utilities.hl_date_predecessor_of_start(before_time);
                    date_adjusted_to_predecessorP = (SubLObject)sbhl_time_query_processing.T;
                    if (sbhl_time_query_processing.NIL == sbhl_time_utilities.sbhl_temporal_node_p(before)) {
                        before = sbhl_time_utilities.hl_end(before_time);
                        date_adjusted_to_closest_existing_dateP = (SubLObject)sbhl_time_query_processing.T;
                        if (sbhl_time_query_processing.NIL == sbhl_time_utilities.sbhl_temporal_node_p(before)) {
                            before = closest_existing_date_point_after(before_time);
                        }
                    }
                }
                else {
                    before = sbhl_time_utilities.hl_end(before_time);
                }
            }
        }
        else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw12$END)) {
            before = sbhl_time_utilities.hl_end(before_time);
            if (sbhl_time_query_processing.NIL == sbhl_time_utilities.sbhl_temporal_node_p(before) && before_time.isInteger()) {
                before = sbhl_time_utilities.hl_date_successor_of_end(before_time);
                date_adjusted_to_successorP = (SubLObject)sbhl_time_query_processing.T;
                if (sbhl_time_query_processing.NIL == sbhl_time_utilities.sbhl_temporal_node_p(before)) {
                    before = closest_existing_date_point_after(before_time);
                    date_adjusted_to_closest_existing_dateP = (SubLObject)sbhl_time_query_processing.T;
                }
            }
        }
        if (sbhl_time_query_processing.NIL == sbhl_time_utilities.sbhl_temporal_node_p(before)) {
            return (SubLObject)sbhl_time_query_processing.NIL;
        }
        if (sbhl_time_query_processing.NIL != date_adjusted_to_closest_existing_dateP) {
            pcase_var = link_tag;
            if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw5$WEAK)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw13$WEAK_SUCCESSORS_SUCCESSOR;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw6$STRICT)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw7$WEAK_SUCCESSOR;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw7$WEAK_SUCCESSOR)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw14$WEAK_SUCCESSORS_SUCCESSORS_SUCCESSOR;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw8$SUCCESSOR_STRICT)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw5$WEAK;
            }
            else {
                if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw9$COORDINATE)) {
                    return (SubLObject)sbhl_time_query_processing.NIL;
                }
                if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw10$SUCCESSOR)) {
                    return (SubLObject)sbhl_time_query_processing.NIL;
                }
            }
        }
        else if (sbhl_time_query_processing.NIL != date_adjusted_to_predecessorP) {
            pcase_var = link_tag;
            if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw5$WEAK)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw6$STRICT;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw6$STRICT)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw8$SUCCESSOR_STRICT;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw7$WEAK_SUCCESSOR)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw5$WEAK;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw8$SUCCESSOR_STRICT)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw15$SUCCESSORS_SUCCESSOR_STRICT;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw9$COORDINATE)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw10$SUCCESSOR;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw10$SUCCESSOR)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw16$SUCCESSORS_SUCCESSOR;
            }
        }
        else if (sbhl_time_query_processing.NIL != date_adjusted_to_successorP) {
            pcase_var = link_tag;
            if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw5$WEAK)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw7$WEAK_SUCCESSOR;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw6$STRICT)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw5$WEAK;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw7$WEAK_SUCCESSOR)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw13$WEAK_SUCCESSORS_SUCCESSOR;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw8$SUCCESSOR_STRICT)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw6$STRICT;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw9$COORDINATE)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw17$PREDECESSOR;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw10$SUCCESSOR)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw9$COORDINATE;
            }
        }
        return (SubLObject)ConsesLow.list(link_tag, before);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 9561L)
    public static SubLObject adjust_quasi_link_after_half_to_existing_nodes(SubLObject link_tag, final SubLObject quasi_after) {
        final SubLObject after_tag = quasi_after.first();
        final SubLObject after_time = conses_high.second(quasi_after);
        SubLObject after = (SubLObject)sbhl_time_query_processing.NIL;
        SubLObject date_adjusted_to_predecessorP = (SubLObject)sbhl_time_query_processing.NIL;
        SubLObject date_adjusted_to_successorP = (SubLObject)sbhl_time_query_processing.NIL;
        SubLObject date_adjusted_to_closest_existing_dateP = (SubLObject)sbhl_time_query_processing.NIL;
        if (sbhl_time_query_processing.NIL != sbhl_time_dates.sbhl_date_p(after_time)) {
            final SubLObject pcase_var = after_tag;
            if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw11$START)) {
                return (SubLObject)ConsesLow.list(link_tag, sbhl_time_utilities.hl_start(after_time));
            }
            if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw12$END)) {
                return (SubLObject)ConsesLow.list(link_tag, sbhl_time_utilities.hl_end(after_time));
            }
        }
        SubLObject pcase_var = after_tag;
        if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw11$START)) {
            after = sbhl_time_utilities.hl_start(after_time);
            if (sbhl_time_query_processing.NIL == sbhl_time_utilities.sbhl_temporal_node_p(after) && after_time.isInteger()) {
                after = sbhl_time_utilities.hl_date_predecessor_of_start(after_time);
                date_adjusted_to_predecessorP = (SubLObject)sbhl_time_query_processing.T;
                if (sbhl_time_query_processing.NIL == sbhl_time_utilities.sbhl_temporal_node_p(after)) {
                    after = closest_existing_date_point_before(after_time);
                    date_adjusted_to_closest_existing_dateP = (SubLObject)sbhl_time_query_processing.T;
                }
            }
        }
        else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw12$END)) {
            after = sbhl_time_utilities.hl_end(after_time);
            if (sbhl_time_query_processing.NIL == sbhl_time_utilities.sbhl_temporal_node_p(after)) {
                if (after_time.isInteger()) {
                    after = sbhl_time_utilities.hl_date_successor_of_end(after_time);
                    date_adjusted_to_successorP = (SubLObject)sbhl_time_query_processing.T;
                    if (sbhl_time_query_processing.NIL == sbhl_time_utilities.sbhl_temporal_node_p(after)) {
                        after = sbhl_time_utilities.hl_start(after_time);
                        date_adjusted_to_closest_existing_dateP = (SubLObject)sbhl_time_query_processing.T;
                        if (sbhl_time_query_processing.NIL == sbhl_time_utilities.sbhl_temporal_node_p(after)) {
                            after = closest_existing_date_point_before(after_time);
                        }
                    }
                }
                else {
                    after = sbhl_time_utilities.hl_start(after_time);
                }
            }
        }
        if (sbhl_time_query_processing.NIL == sbhl_time_utilities.sbhl_temporal_node_p(after)) {
            return (SubLObject)sbhl_time_query_processing.NIL;
        }
        if (sbhl_time_query_processing.NIL != date_adjusted_to_closest_existing_dateP) {
            pcase_var = link_tag;
            if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw5$WEAK)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw13$WEAK_SUCCESSORS_SUCCESSOR;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw6$STRICT)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw7$WEAK_SUCCESSOR;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw7$WEAK_SUCCESSOR)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw14$WEAK_SUCCESSORS_SUCCESSORS_SUCCESSOR;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw8$SUCCESSOR_STRICT)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw5$WEAK;
            }
            else {
                if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw9$COORDINATE)) {
                    return (SubLObject)sbhl_time_query_processing.NIL;
                }
                if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw10$SUCCESSOR)) {
                    return (SubLObject)sbhl_time_query_processing.NIL;
                }
            }
        }
        else if (sbhl_time_query_processing.NIL != date_adjusted_to_predecessorP) {
            pcase_var = link_tag;
            if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw5$WEAK)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw7$WEAK_SUCCESSOR;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw6$STRICT)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw5$WEAK;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw7$WEAK_SUCCESSOR)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw13$WEAK_SUCCESSORS_SUCCESSOR;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw8$SUCCESSOR_STRICT)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw6$STRICT;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw9$COORDINATE)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw17$PREDECESSOR;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw10$SUCCESSOR)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw9$COORDINATE;
            }
        }
        else if (sbhl_time_query_processing.NIL != date_adjusted_to_successorP) {
            pcase_var = link_tag;
            if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw5$WEAK)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw6$STRICT;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw6$STRICT)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw8$SUCCESSOR_STRICT;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw7$WEAK_SUCCESSOR)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw5$WEAK;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw8$SUCCESSOR_STRICT)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw15$SUCCESSORS_SUCCESSOR_STRICT;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw9$COORDINATE)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw10$SUCCESSOR;
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw10$SUCCESSOR)) {
                link_tag = (SubLObject)sbhl_time_query_processing.$kw16$SUCCESSORS_SUCCESSOR;
            }
        }
        return (SubLObject)ConsesLow.list(link_tag, after);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 12209L)
    public static SubLObject adjust_temporal_quasi_link_to_link_disjunction_terms_and_existing_nodes(final SubLObject quasi_link) {
        SubLObject link_tag = quasi_link.first();
        SubLObject before = conses_high.second(quasi_link);
        SubLObject after = conses_high.third(quasi_link);
        final SubLObject link_before_half = adjust_quasi_link_before_half_to_link_disjunction_terms_and_existing_nodes(link_tag, before);
        if (sbhl_time_query_processing.NIL == link_before_half) {
            return (SubLObject)sbhl_time_query_processing.NIL;
        }
        link_tag = link_before_half.first();
        before = conses_high.second(link_before_half);
        final SubLObject link_after_half = adjust_quasi_link_after_half_to_link_disjunction_terms_and_existing_nodes(link_tag, after);
        if (sbhl_time_query_processing.NIL == link_after_half) {
            return (SubLObject)sbhl_time_query_processing.NIL;
        }
        link_tag = link_after_half.first();
        after = conses_high.second(link_after_half);
        return (SubLObject)ConsesLow.list(link_tag, before, after);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 12991L)
    public static SubLObject adjust_quasi_link_before_half_to_link_disjunction_terms_and_existing_nodes(final SubLObject link_tag, final SubLObject quasi_before) {
        final SubLObject before_tag = quasi_before.first();
        final SubLObject before_time = conses_high.second(quasi_before);
        SubLObject before = (SubLObject)sbhl_time_query_processing.NIL;
        final SubLObject pcase_var = before_tag;
        if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw11$START)) {
            before = sbhl_time_utilities.hl_start(before_time);
        }
        else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw12$END)) {
            before = sbhl_time_utilities.hl_end(before_time);
        }
        return (SubLObject)((sbhl_time_query_processing.NIL != sbhl_time_utilities.temporal_link_disjunction_term_p(before)) ? ConsesLow.list(link_tag, before) : adjust_quasi_link_before_half_to_existing_nodes(link_tag, quasi_before));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 13522L)
    public static SubLObject adjust_quasi_link_after_half_to_link_disjunction_terms_and_existing_nodes(final SubLObject link_tag, final SubLObject quasi_after) {
        final SubLObject after_tag = quasi_after.first();
        final SubLObject after_time = conses_high.second(quasi_after);
        SubLObject after = (SubLObject)sbhl_time_query_processing.NIL;
        final SubLObject pcase_var = after_tag;
        if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw11$START)) {
            after = sbhl_time_utilities.hl_start(after_time);
        }
        else if (pcase_var.eql((SubLObject)sbhl_time_query_processing.$kw12$END)) {
            after = sbhl_time_utilities.hl_end(after_time);
        }
        return (SubLObject)((sbhl_time_query_processing.NIL != sbhl_time_utilities.temporal_link_disjunction_term_p(after)) ? ConsesLow.list(link_tag, after) : adjust_quasi_link_after_half_to_existing_nodes(link_tag, quasi_after));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 14037L)
    public static SubLObject closest_existing_date_point_before(final SubLObject eu_date) {
        SubLObject eu_date_before = (SubLObject)sbhl_time_query_processing.NIL;
        SubLObject date_point_before = (SubLObject)sbhl_time_query_processing.NIL;
        SubLObject doneP = (SubLObject)sbhl_time_query_processing.NIL;
        if (sbhl_time_query_processing.NIL != sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue() && eu_date.numG(sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue().first())) {
            if (sbhl_time_query_processing.NIL == doneP) {
                SubLObject csome_list_var = sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue();
                SubLObject existing_eu_date = (SubLObject)sbhl_time_query_processing.NIL;
                existing_eu_date = csome_list_var.first();
                while (sbhl_time_query_processing.NIL == doneP && sbhl_time_query_processing.NIL != csome_list_var) {
                    if (eu_date.numLE(existing_eu_date)) {
                        doneP = (SubLObject)sbhl_time_query_processing.T;
                    }
                    else {
                        eu_date_before = existing_eu_date;
                    }
                    csome_list_var = csome_list_var.rest();
                    existing_eu_date = csome_list_var.first();
                }
            }
            if (sbhl_time_query_processing.NIL != eu_date_before) {
                date_point_before = sbhl_time_utilities.hl_end(eu_date_before);
                if (sbhl_time_query_processing.NIL != sbhl_time_utilities.sbhl_temporal_node_p(date_point_before)) {
                    return date_point_before;
                }
                date_point_before = sbhl_time_utilities.hl_start(eu_date_before);
                if (sbhl_time_query_processing.NIL != sbhl_time_utilities.sbhl_temporal_node_p(date_point_before)) {
                    return date_point_before;
                }
            }
        }
        return (SubLObject)sbhl_time_query_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 14828L)
    public static SubLObject closest_existing_date_point_after(final SubLObject eu_date) {
        SubLObject eu_date_after = (SubLObject)sbhl_time_query_processing.NIL;
        SubLObject date_point_after = (SubLObject)sbhl_time_query_processing.NIL;
        if (sbhl_time_query_processing.NIL == eu_date_after) {
            SubLObject csome_list_var = sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue();
            SubLObject existing_eu_date = (SubLObject)sbhl_time_query_processing.NIL;
            existing_eu_date = csome_list_var.first();
            while (sbhl_time_query_processing.NIL == eu_date_after && sbhl_time_query_processing.NIL != csome_list_var) {
                if (eu_date.numL(existing_eu_date)) {
                    eu_date_after = existing_eu_date;
                }
                csome_list_var = csome_list_var.rest();
                existing_eu_date = csome_list_var.first();
            }
        }
        if (sbhl_time_query_processing.NIL != eu_date_after) {
            date_point_after = sbhl_time_utilities.hl_start(eu_date_after);
            if (sbhl_time_query_processing.NIL != sbhl_time_utilities.sbhl_temporal_node_p(date_point_after)) {
                return date_point_after;
            }
            date_point_after = sbhl_time_utilities.hl_end(eu_date_after);
            if (sbhl_time_query_processing.NIL != sbhl_time_utilities.sbhl_temporal_node_p(date_point_after)) {
                return date_point_after;
            }
        }
        return (SubLObject)sbhl_time_query_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 15438L)
    public static SubLObject true_temporal_quasi_linkP(SubLObject link_tag, SubLObject before, SubLObject after, SubLObject mt) {
        if (mt == sbhl_time_query_processing.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_query_processing.NIL;
        }
        final SubLObject before_tag = before.first();
        final SubLObject before_time = conses_high.second(before);
        final SubLObject after_tag = after.first();
        final SubLObject after_time = conses_high.second(after);
        if (before_time.isInteger() && after_time.isInteger()) {
            return true_date_date_quasi_linkP(link_tag, before, after);
        }
        if (before_time.equal(after_time) && (link_tag == sbhl_time_query_processing.$kw5$WEAK || link_tag == sbhl_time_query_processing.$kw7$WEAK_SUCCESSOR) && (after_tag == sbhl_time_query_processing.$kw12$END || (before_tag == sbhl_time_query_processing.$kw11$START && after_tag == sbhl_time_query_processing.$kw11$START))) {
            return (SubLObject)sbhl_time_query_processing.T;
        }
        if (before_time.equal(after_time) && link_tag == sbhl_time_query_processing.$kw9$COORDINATE && ((before_tag == sbhl_time_query_processing.$kw11$START && after_tag == sbhl_time_query_processing.$kw11$START) || (before_tag == sbhl_time_query_processing.$kw12$END && after_tag == sbhl_time_query_processing.$kw12$END))) {
            return (SubLObject)sbhl_time_query_processing.T;
        }
        final SubLObject quasi_link = (SubLObject)ConsesLow.list(link_tag, before, after);
        final SubLObject link = adjust_temporal_quasi_link_to_existing_nodes(quasi_link);
        if (sbhl_time_query_processing.NIL == link) {
            return (SubLObject)sbhl_time_query_processing.NIL;
        }
        link_tag = link.first();
        before = conses_high.second(link);
        after = conses_high.third(link);
        return true_temporal_linkP(link_tag, before, after, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 16561L)
    public static SubLObject date_date_quasi_link_p(final SubLObject quasi_link) {
        final SubLObject before = conses_high.second(quasi_link);
        final SubLObject before_time = conses_high.second(before);
        final SubLObject after = conses_high.third(quasi_link);
        final SubLObject after_time = conses_high.second(after);
        return (SubLObject)SubLObjectFactory.makeBoolean(before_time.isInteger() && after_time.isInteger());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 16846L)
    public static SubLObject true_date_date_quasi_linkP(final SubLObject link_tag, final SubLObject before, final SubLObject after) {
        final SubLObject before_tag = before.first();
        final SubLObject before_time = conses_high.second(before);
        final SubLObject after_tag = after.first();
        final SubLObject after_time = conses_high.second(after);
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw5$WEAK)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(before_time.numL(after_time) || (before_time.numE(after_time) && (before_tag == sbhl_time_query_processing.$kw11$START || after_tag == sbhl_time_query_processing.$kw12$END)));
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw6$STRICT)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(before_time.numL(after_time) || (before_time.numE(after_time) && before_tag == sbhl_time_query_processing.$kw11$START && after_tag == sbhl_time_query_processing.$kw12$END));
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw9$COORDINATE)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(before_time.numE(after_time) && before_tag.eql(after_tag));
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw10$SUCCESSOR)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(before_tag == sbhl_time_query_processing.$kw12$END && after_tag == sbhl_time_query_processing.$kw11$START && numeric_date_utilities.succeeding_extended_universal_date(before_time).numE(after_time));
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw8$SUCCESSOR_STRICT)) {
            return (SubLObject)SubLObjectFactory.makeBoolean((before_time.numL(after_time) && (before_tag == sbhl_time_query_processing.$kw11$START || after_tag == sbhl_time_query_processing.$kw12$END)) || (before_time.numE(after_time) && before_tag == sbhl_time_query_processing.$kw11$START && after_tag == sbhl_time_query_processing.$kw12$END) || numeric_date_utilities.succeeding_extended_universal_date(before_time).numL(after_time));
        }
        return (SubLObject)sbhl_time_query_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 17970L)
    public static SubLObject true_temporal_linkP(final SubLObject link_tag, final SubLObject before, final SubLObject after, SubLObject mt) {
        if (mt == sbhl_time_query_processing.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_query_processing.NIL;
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw5$WEAK)) {
            return sbhl_time_search.weakly_precedesP(before, after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw6$STRICT)) {
            return sbhl_time_search.strictly_precedesP(before, after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw7$WEAK_SUCCESSOR)) {
            return sbhl_time_search.weakly_precedes_successorP(before, after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw8$SUCCESSOR_STRICT)) {
            return sbhl_time_search.successor_strictly_precedesP(before, after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw9$COORDINATE)) {
            return sbhl_time_search.coordinateP(before, after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw10$SUCCESSOR)) {
            return sbhl_time_search.successorP(before, after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw17$PREDECESSOR)) {
            return sbhl_time_search.predecessorP(before, after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw13$WEAK_SUCCESSORS_SUCCESSOR)) {
            return sbhl_time_search.weakly_precedes_successors_successorP(before, after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw18$WEAK_SUCCESSORS_SUCCESSOR_SUCCESSOR)) {
            return sbhl_time_search.weakly_precedes_successors_successors_successorP(before, after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw16$SUCCESSORS_SUCCESSOR)) {
            return sbhl_time_search.successors_successorP(before, after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw15$SUCCESSORS_SUCCESSOR_STRICT)) {
            return sbhl_time_search.successors_successor_strictly_precedesP(before, after, mt);
        }
        return (SubLObject)sbhl_time_query_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 18927L)
    public static SubLObject add_temporal_link_disjunction_consequents(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.getDynamicValue(thread).isHashtable()) {
            sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.setDynamicValue(Hashtables.make_hash_table((SubLObject)sbhl_time_query_processing.$int19$1000, Symbols.symbol_function((SubLObject)sbhl_time_query_processing.EQUAL), (SubLObject)sbhl_time_query_processing.UNPROVIDED), thread);
        }
        SubLObject link_addedP = (SubLObject)sbhl_time_query_processing.NIL;
        if (sbhl_time_query_processing.NIL == link_addedP) {
            SubLObject catch_var = (SubLObject)sbhl_time_query_processing.NIL;
            try {
                thread.throwStack.push(sbhl_time_query_processing.$kw20$DO_HASH_TABLE);
                SubLObject link_disjunction = (SubLObject)sbhl_time_query_processing.NIL;
                SubLObject supports = (SubLObject)sbhl_time_query_processing.NIL;
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(sbhl_time_vars.$sbhl_temporal_link_disjunction_support_table$.getGlobalValue());
                try {
                    while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                        link_disjunction = Hashtables.getEntryKey(cdohash_entry);
                        supports = Hashtables.getEntryValue(cdohash_entry);
                        subl_macros.do_hash_table_done_check(link_addedP);
                        final SubLObject disjuncts = link_disjunction.first();
                        final SubLObject link_disjunction_mt = conses_high.second(link_disjunction);
                        SubLObject consequent = (SubLObject)sbhl_time_query_processing.NIL;
                        if (sbhl_time_query_processing.NIL == Hashtables.gethash(link_disjunction, sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.getDynamicValue(thread), (SubLObject)sbhl_time_query_processing.UNPROVIDED) && sbhl_time_query_processing.NIL != genl_mts.genl_mtP(mt, link_disjunction_mt, (SubLObject)sbhl_time_query_processing.UNPROVIDED, (SubLObject)sbhl_time_query_processing.UNPROVIDED)) {
                            consequent = determine_temporal_link_disjunction_consequent(disjuncts, mt);
                            if (sbhl_time_query_processing.NIL == consequent) {
                                continue;
                            }
                            Hashtables.sethash(link_disjunction, sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.getDynamicValue(thread), consequent);
                            final SubLObject link_tag = consequent.first();
                            final SubLObject before = sbhl_time_assertion_processing.find_or_create_hl_temporal_point(conses_high.second(consequent));
                            final SubLObject after = sbhl_time_assertion_processing.find_or_create_hl_temporal_point(conses_high.third(consequent));
                            link_addedP = sbhl_time_assertion_processing.add_temporal_link(link_disjunction, link_tag, before, after, mt);
                        }
                    }
                }
                finally {
                    Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
            }
            catch (Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)sbhl_time_query_processing.$kw20$DO_HASH_TABLE);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        if (sbhl_time_query_processing.NIL != link_addedP) {
            add_temporal_link_disjunction_consequents(mt);
        }
        return (SubLObject)sbhl_time_query_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 20233L)
    public static SubLObject remove_temporal_link_disjunction_consequents(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.getDynamicValue(thread).isHashtable()) {
            final SubLObject cdohash_table = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.getDynamicValue(thread);
            SubLObject link_disjunction = (SubLObject)sbhl_time_query_processing.NIL;
            SubLObject consequent = (SubLObject)sbhl_time_query_processing.NIL;
            final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
            try {
                while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    link_disjunction = Hashtables.getEntryKey(cdohash_entry);
                    consequent = Hashtables.getEntryValue(cdohash_entry);
                    final SubLObject link_tag = consequent.first();
                    final SubLObject before = sbhl_time_assertion_processing.find_hl_temporal_point(conses_high.second(consequent));
                    final SubLObject after = sbhl_time_assertion_processing.find_hl_temporal_point(conses_high.third(consequent));
                    sbhl_time_assertion_processing.remove_temporal_link(link_disjunction, link_tag, before, after, mt);
                }
            }
            finally {
                Hashtables.releaseEntrySetIterator(cdohash_iterator);
            }
        }
        return (SubLObject)sbhl_time_query_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 20734L)
    public static SubLObject determine_temporal_link_disjunction_consequent(final SubLObject disjuncts, final SubLObject mt) {
        SubLObject consequent = (SubLObject)sbhl_time_query_processing.NIL;
        SubLObject cdolist_list_var = disjuncts;
        SubLObject disjunct = (SubLObject)sbhl_time_query_processing.NIL;
        disjunct = cdolist_list_var.first();
        while (sbhl_time_query_processing.NIL != cdolist_list_var) {
            final SubLObject negation = temporal_link_negation(disjunct);
            final SubLObject negation_link_tag = negation.first();
            final SubLObject negation_before = conses_high.second(negation);
            final SubLObject negation_after = conses_high.third(negation);
            if (sbhl_time_query_processing.NIL == true_temporal_quasi_linkP(negation_link_tag, negation_before, negation_after, mt)) {
                if (sbhl_time_query_processing.NIL != consequent) {
                    return (SubLObject)sbhl_time_query_processing.NIL;
                }
                consequent = disjunct;
            }
            cdolist_list_var = cdolist_list_var.rest();
            disjunct = cdolist_list_var.first();
        }
        if (sbhl_time_query_processing.NIL != consequent) {
            final SubLObject link_tag = consequent.first();
            final SubLObject before = conses_high.second(consequent);
            final SubLObject after = conses_high.third(consequent);
            if (sbhl_time_query_processing.NIL != true_temporal_quasi_linkP(link_tag, before, after, mt)) {
                consequent = (SubLObject)sbhl_time_query_processing.NIL;
            }
        }
        return consequent;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 21531L)
    public static SubLObject all_weakly_before_quasi_link(final SubLObject quasi_after, SubLObject mt) {
        if (mt == sbhl_time_query_processing.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_query_processing.NIL;
        }
        final SubLObject link_after_half = adjust_quasi_link_after_half_to_existing_nodes((SubLObject)sbhl_time_query_processing.$kw5$WEAK, quasi_after);
        final SubLObject link_tag = link_after_half.first();
        final SubLObject after = conses_high.second(link_after_half);
        return (SubLObject)((sbhl_time_query_processing.NIL != link_after_half) ? all_temporal_link_before(link_tag, after, mt) : sbhl_time_query_processing.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 21981L)
    public static SubLObject all_weakly_after_quasi_link(final SubLObject quasi_before, SubLObject mt) {
        if (mt == sbhl_time_query_processing.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_query_processing.NIL;
        }
        final SubLObject link_before_half = adjust_quasi_link_before_half_to_existing_nodes((SubLObject)sbhl_time_query_processing.$kw5$WEAK, quasi_before);
        final SubLObject link_tag = link_before_half.first();
        final SubLObject before = conses_high.second(link_before_half);
        return (SubLObject)((sbhl_time_query_processing.NIL != link_before_half) ? all_temporal_link_after(link_tag, before, mt) : sbhl_time_query_processing.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 22359L)
    public static SubLObject all_strictly_before_quasi_link(final SubLObject quasi_after, SubLObject mt) {
        if (mt == sbhl_time_query_processing.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_query_processing.NIL;
        }
        final SubLObject link_after_half = adjust_quasi_link_after_half_to_existing_nodes((SubLObject)sbhl_time_query_processing.$kw6$STRICT, quasi_after);
        final SubLObject link_tag = link_after_half.first();
        final SubLObject after = conses_high.second(link_after_half);
        return (SubLObject)((sbhl_time_query_processing.NIL != link_after_half) ? all_temporal_link_before(link_tag, after, mt) : sbhl_time_query_processing.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 22733L)
    public static SubLObject all_strictly_after_quasi_link(final SubLObject quasi_before, SubLObject mt) {
        if (mt == sbhl_time_query_processing.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_query_processing.NIL;
        }
        final SubLObject link_before_half = adjust_quasi_link_before_half_to_existing_nodes((SubLObject)sbhl_time_query_processing.$kw6$STRICT, quasi_before);
        final SubLObject link_tag = link_before_half.first();
        final SubLObject before = conses_high.second(link_before_half);
        return (SubLObject)((sbhl_time_query_processing.NIL != link_before_half) ? all_temporal_link_after(link_tag, before, mt) : sbhl_time_query_processing.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 23115L)
    public static SubLObject all_coordinate_quasi_link(final SubLObject quasi_link, SubLObject mt) {
        if (mt == sbhl_time_query_processing.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_query_processing.NIL;
        }
        final SubLObject link_before_half = adjust_quasi_link_before_half_to_existing_nodes((SubLObject)sbhl_time_query_processing.$kw9$COORDINATE, quasi_link);
        final SubLObject link_tag = link_before_half.first();
        final SubLObject before = conses_high.second(link_before_half);
        return (SubLObject)((sbhl_time_query_processing.NIL != link_before_half) ? all_temporal_link_after(link_tag, before, mt) : sbhl_time_query_processing.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 23493L)
    public static SubLObject all_successors_quasi_link(final SubLObject quasi_before, SubLObject mt) {
        if (mt == sbhl_time_query_processing.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_query_processing.NIL;
        }
        final SubLObject link_before_half = adjust_quasi_link_before_half_to_existing_nodes((SubLObject)sbhl_time_query_processing.$kw10$SUCCESSOR, quasi_before);
        final SubLObject link_tag = link_before_half.first();
        final SubLObject before = conses_high.second(link_before_half);
        return (SubLObject)((sbhl_time_query_processing.NIL != link_before_half) ? all_temporal_link_after(link_tag, before, mt) : sbhl_time_query_processing.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 23874L)
    public static SubLObject all_predecessors_quasi_link(final SubLObject quasi_after, SubLObject mt) {
        if (mt == sbhl_time_query_processing.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_query_processing.NIL;
        }
        final SubLObject link_after_half = adjust_quasi_link_after_half_to_existing_nodes((SubLObject)sbhl_time_query_processing.$kw10$SUCCESSOR, quasi_after);
        final SubLObject link_tag = link_after_half.first();
        final SubLObject after = conses_high.second(link_after_half);
        return (SubLObject)((sbhl_time_query_processing.NIL != link_after_half) ? all_temporal_link_before(link_tag, after, mt) : sbhl_time_query_processing.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 24248L)
    public static SubLObject all_temporal_link_before(final SubLObject link_tag, final SubLObject after, SubLObject mt) {
        if (mt == sbhl_time_query_processing.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_query_processing.NIL;
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw5$WEAK)) {
            return sbhl_time_search.all_weakly_precedes_inverse(after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw6$STRICT)) {
            return sbhl_time_search.all_strictly_precedes_inverse(after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw7$WEAK_SUCCESSOR)) {
            return sbhl_time_search.all_weakly_precedes_successor_inverse(after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw8$SUCCESSOR_STRICT)) {
            return sbhl_time_search.all_successor_strictly_precedes_inverse(after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw9$COORDINATE)) {
            return sbhl_time_search.all_coordinate(after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw10$SUCCESSOR)) {
            return sbhl_time_search.all_predecessors(after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw17$PREDECESSOR)) {
            return sbhl_time_search.all_successors(after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw13$WEAK_SUCCESSORS_SUCCESSOR)) {
            return sbhl_time_search.all_weakly_precedes_successors_successor_inverse(after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw16$SUCCESSORS_SUCCESSOR)) {
            return sbhl_time_search.all_predecessors_predecessors(after, mt);
        }
        return (SubLObject)sbhl_time_query_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 24989L)
    public static SubLObject all_temporal_link_after(final SubLObject link_tag, final SubLObject before, SubLObject mt) {
        if (mt == sbhl_time_query_processing.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_query_processing.NIL;
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw5$WEAK)) {
            return sbhl_time_search.all_weakly_precedes(before, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw6$STRICT)) {
            return sbhl_time_search.all_strictly_precedes(before, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw7$WEAK_SUCCESSOR)) {
            return sbhl_time_search.all_weakly_precedes_successor(before, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw8$SUCCESSOR_STRICT)) {
            return sbhl_time_search.all_successor_strictly_precedes(before, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw9$COORDINATE)) {
            return sbhl_time_search.all_coordinate(before, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw10$SUCCESSOR)) {
            return sbhl_time_search.all_successors(before, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw17$PREDECESSOR)) {
            return sbhl_time_search.all_predecessors(before, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw13$WEAK_SUCCESSORS_SUCCESSOR)) {
            return sbhl_time_search.all_weakly_precedes_successors_successor(before, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw16$SUCCESSORS_SUCCESSOR)) {
            return sbhl_time_search.all_successors_successors(before, mt);
        }
        return (SubLObject)sbhl_time_query_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 25695L)
    public static SubLObject all_weakly_between_quasi_links(final SubLObject quasi_before, final SubLObject quasi_after, SubLObject mt) {
        if (mt == sbhl_time_query_processing.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_query_processing.NIL;
        }
        final SubLObject link_before_half = adjust_quasi_link_before_half_to_existing_nodes((SubLObject)sbhl_time_query_processing.$kw5$WEAK, quasi_before);
        final SubLObject before_link_tag = link_before_half.first();
        final SubLObject before = conses_high.second(link_before_half);
        if (sbhl_time_query_processing.NIL == link_before_half) {
            return (SubLObject)sbhl_time_query_processing.NIL;
        }
        final SubLObject link_after_half = adjust_quasi_link_after_half_to_existing_nodes((SubLObject)sbhl_time_query_processing.$kw5$WEAK, quasi_after);
        final SubLObject after_link_tag = link_after_half.first();
        final SubLObject after = conses_high.second(link_after_half);
        if (sbhl_time_query_processing.NIL == link_after_half) {
            return (SubLObject)sbhl_time_query_processing.NIL;
        }
        return all_temporal_link_between(before_link_tag, before, after_link_tag, after, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 26381L)
    public static SubLObject all_strictly_between_quasi_links(final SubLObject quasi_before, final SubLObject quasi_after, SubLObject mt) {
        if (mt == sbhl_time_query_processing.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_query_processing.NIL;
        }
        final SubLObject link_before_half = adjust_quasi_link_before_half_to_existing_nodes((SubLObject)sbhl_time_query_processing.$kw6$STRICT, quasi_before);
        final SubLObject before_link_tag = link_before_half.first();
        final SubLObject before = conses_high.second(link_before_half);
        if (sbhl_time_query_processing.NIL == link_before_half) {
            return (SubLObject)sbhl_time_query_processing.NIL;
        }
        final SubLObject link_after_half = adjust_quasi_link_after_half_to_existing_nodes((SubLObject)sbhl_time_query_processing.$kw6$STRICT, quasi_after);
        final SubLObject after_link_tag = link_after_half.first();
        final SubLObject after = conses_high.second(link_after_half);
        if (sbhl_time_query_processing.NIL == link_after_half) {
            return (SubLObject)sbhl_time_query_processing.NIL;
        }
        return all_temporal_link_between(before_link_tag, before, after_link_tag, after, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 27051L)
    public static SubLObject all_temporal_link_between(final SubLObject before_link_tag, final SubLObject before, final SubLObject after_link_tag, final SubLObject after, SubLObject mt) {
        if (mt == sbhl_time_query_processing.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_query_processing.NIL;
        }
        SubLObject initial_marking_depth = (SubLObject)sbhl_time_query_processing.NIL;
        SubLObject initial_searching_depth = (SubLObject)sbhl_time_query_processing.NIL;
        if (before_link_tag.eql((SubLObject)sbhl_time_query_processing.$kw5$WEAK)) {
            initial_marking_depth = (SubLObject)sbhl_time_query_processing.ZERO_INTEGER;
        }
        else if (before_link_tag.eql((SubLObject)sbhl_time_query_processing.$kw6$STRICT)) {
            initial_marking_depth = (SubLObject)sbhl_time_query_processing.MINUS_ONE_INTEGER;
        }
        else if (before_link_tag.eql((SubLObject)sbhl_time_query_processing.$kw7$WEAK_SUCCESSOR)) {
            initial_marking_depth = (SubLObject)sbhl_time_query_processing.ONE_INTEGER;
        }
        else if (before_link_tag.eql((SubLObject)sbhl_time_query_processing.$kw8$SUCCESSOR_STRICT)) {
            initial_marking_depth = (SubLObject)sbhl_time_query_processing.$int21$_2;
        }
        else if (before_link_tag.eql((SubLObject)sbhl_time_query_processing.$kw13$WEAK_SUCCESSORS_SUCCESSOR)) {
            initial_marking_depth = (SubLObject)sbhl_time_query_processing.TWO_INTEGER;
        }
        if (after_link_tag.eql((SubLObject)sbhl_time_query_processing.$kw5$WEAK)) {
            initial_searching_depth = (SubLObject)sbhl_time_query_processing.ZERO_INTEGER;
        }
        else if (after_link_tag.eql((SubLObject)sbhl_time_query_processing.$kw6$STRICT)) {
            initial_searching_depth = (SubLObject)sbhl_time_query_processing.MINUS_ONE_INTEGER;
        }
        else if (after_link_tag.eql((SubLObject)sbhl_time_query_processing.$kw7$WEAK_SUCCESSOR)) {
            initial_searching_depth = (SubLObject)sbhl_time_query_processing.ONE_INTEGER;
        }
        else if (after_link_tag.eql((SubLObject)sbhl_time_query_processing.$kw8$SUCCESSOR_STRICT)) {
            initial_searching_depth = (SubLObject)sbhl_time_query_processing.$int21$_2;
        }
        else if (after_link_tag.eql((SubLObject)sbhl_time_query_processing.$kw13$WEAK_SUCCESSORS_SUCCESSOR)) {
            initial_searching_depth = (SubLObject)sbhl_time_query_processing.TWO_INTEGER;
        }
        return sbhl_time_search.all_between(initial_marking_depth, initial_searching_depth, before, after, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 27997L)
    public static SubLObject why_temporal_relationP(final SubLObject literal, SubLObject mt) {
        if (mt == sbhl_time_query_processing.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_query_processing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_time_query_processing.NIL != el_utilities.literalP(literal) && el_utilities.literal_arity(el_utilities.literal_atomic_sentence(literal), (SubLObject)sbhl_time_query_processing.UNPROVIDED).numE((SubLObject)sbhl_time_query_processing.TWO_INTEGER) && (sbhl_time_query_processing.NIL == mt || sbhl_time_query_processing.NIL != hlmt.hlmt_p(mt))) {
            final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_verbose_justsP$.currentBinding(thread);
            try {
                sbhl_time_vars.$sbhl_temporality_verbose_justsP$.bind((SubLObject)sbhl_time_query_processing.NIL, thread);
                final SubLObject gaf = el_utilities.literal_atomic_sentence(literal);
                final SubLObject pred = cycl_utilities.formula_arg0(gaf);
                final SubLObject arg1 = cycl_utilities.formula_arg1(gaf, (SubLObject)sbhl_time_query_processing.UNPROVIDED);
                final SubLObject arg2 = cycl_utilities.formula_arg2(gaf, (SubLObject)sbhl_time_query_processing.UNPROVIDED);
                final SubLObject sense = (SubLObject)((sbhl_time_query_processing.NIL != el_utilities.el_negation_p(literal)) ? sbhl_time_query_processing.$kw2$NEG : sbhl_time_query_processing.$kw1$POS);
                SubLObject cdolist_list_var;
                final SubLObject supports = cdolist_list_var = why_true_temporal_relation_literalP(pred, arg1, arg2, sense, mt);
                SubLObject support = (SubLObject)sbhl_time_query_processing.NIL;
                support = cdolist_list_var.first();
                while (sbhl_time_query_processing.NIL != cdolist_list_var) {
                    if (!support.eql(supports.first())) {
                        html_utilities.html_newline((SubLObject)sbhl_time_query_processing.UNPROVIDED);
                    }
                    if (sbhl_time_query_processing.NIL != assertion_handles.assertion_p(support)) {
                        cb_utilities.cb_show_assertion_readably(support, (SubLObject)sbhl_time_query_processing.T, (SubLObject)sbhl_time_query_processing.UNPROVIDED);
                    }
                    else {
                        cb_utilities.cb_form(support, (SubLObject)sbhl_time_query_processing.ZERO_INTEGER, (SubLObject)sbhl_time_query_processing.T);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    support = cdolist_list_var.first();
                }
            }
            finally {
                sbhl_time_vars.$sbhl_temporality_verbose_justsP$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)sbhl_time_query_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 28996L)
    public static SubLObject why_true_temporal_relation_literalP(final SubLObject pred, final SubLObject arg1, final SubLObject arg2, final SubLObject sense, SubLObject mt) {
        if (mt == sbhl_time_query_processing.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_query_processing.NIL;
        }
        if (sbhl_time_query_processing.NIL == sbhl_time_utilities.valid_sbhl_time_literal_argsP(pred, arg1, arg2)) {
            return (SubLObject)sbhl_time_query_processing.NIL;
        }
        if (arg1.equal(arg2) && sense == sbhl_time_query_processing.$kw1$POS && sbhl_time_query_processing.NIL != kb_accessors.reflexive_predicateP(pred)) {
            return (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)sbhl_time_query_processing.$kw22$REFLEXIVE, (SubLObject)ConsesLow.list(pred, arg1, arg2), sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue(), (SubLObject)sbhl_time_query_processing.UNPROVIDED));
        }
        if (arg1.equal(arg2) && sense == sbhl_time_query_processing.$kw2$NEG && sbhl_time_query_processing.NIL != kb_accessors.irreflexive_predicateP(pred)) {
            return (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)sbhl_time_query_processing.$kw22$REFLEXIVE, (SubLObject)ConsesLow.list(pred, arg1, arg2), sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue(), (SubLObject)sbhl_time_query_processing.UNPROVIDED));
        }
        final SubLObject conjunction_fn = sbhl_time_modules.get_sbhl_time_module(pred, (SubLObject)sbhl_time_query_processing.$kw0$CONJUNCTION_FN, (SubLObject)sbhl_time_query_processing.UNPROVIDED);
        if (sbhl_time_query_processing.NIL == Symbols.fboundp(conjunction_fn)) {
            return (SubLObject)sbhl_time_query_processing.NIL;
        }
        final SubLObject conjuncts = Functions.funcall(conjunction_fn, arg1, arg2);
        if (sense.eql((SubLObject)sbhl_time_query_processing.$kw1$POS)) {
            if (sbhl_time_query_processing.NIL != sbhl_time_utilities.conjunctive_temporal_relation_predP(pred)) {
                return why_true_temporal_quasi_link_conjunctionP(conjuncts, mt);
            }
            if (sbhl_time_query_processing.NIL != sbhl_time_utilities.disjunctive_temporal_relation_predP(pred)) {
                return why_false_temporal_quasi_link_conjunctionP(conjuncts, mt);
            }
        }
        else if (sense.eql((SubLObject)sbhl_time_query_processing.$kw2$NEG)) {
            if (sbhl_time_query_processing.NIL != sbhl_time_utilities.conjunctive_temporal_relation_predP(pred)) {
                return why_false_temporal_quasi_link_conjunctionP(conjuncts, mt);
            }
            if (sbhl_time_query_processing.NIL != sbhl_time_utilities.disjunctive_temporal_relation_predP(pred)) {
                return why_true_temporal_quasi_link_conjunctionP(conjuncts, mt);
            }
        }
        return (SubLObject)sbhl_time_query_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 30239L)
    public static SubLObject why_true_temporal_quasi_link_conjunctionP(final SubLObject quasi_conjuncts, SubLObject mt) {
        if (mt == sbhl_time_query_processing.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_query_processing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = (SubLObject)sbhl_time_query_processing.NIL;
        SubLObject missing_partial_justP = (SubLObject)sbhl_time_query_processing.NIL;
        final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding(thread);
        try {
            sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.bind((SubLObject)sbhl_time_query_processing.NIL, thread);
            sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind((SubLObject)sbhl_time_query_processing.NIL, thread);
            if (sbhl_time_query_processing.NIL == mt && sbhl_time_query_processing.NIL == mt_relevance_macros.all_mts_are_relevantP() && sbhl_time_query_processing.NIL == mt_relevance_macros.any_mt_is_relevantP()) {
                mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
            }
            if (sbhl_time_query_processing.NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                add_temporal_link_disjunction_consequents(mt);
            }
            if (sbhl_time_query_processing.NIL == missing_partial_justP) {
                SubLObject csome_list_var = quasi_conjuncts;
                SubLObject conjunct = (SubLObject)sbhl_time_query_processing.NIL;
                conjunct = csome_list_var.first();
                while (sbhl_time_query_processing.NIL == missing_partial_justP && sbhl_time_query_processing.NIL != csome_list_var) {
                    final SubLObject link_tag = conjunct.first();
                    final SubLObject before = conses_high.second(conjunct);
                    final SubLObject after = conses_high.third(conjunct);
                    SubLObject partial_just = (SubLObject)sbhl_time_query_processing.NIL;
                    partial_just = why_true_temporal_quasi_linkP(link_tag, before, after, mt);
                    if (sbhl_time_query_processing.NIL != partial_just) {
                        if (partial_just.first().isList() && sbhl_time_query_processing.$const23$equals.eql(conses_high.caar(partial_just))) {
                            final SubLObject item_var = partial_just.first();
                            if (sbhl_time_query_processing.NIL == conses_high.member(item_var, just, Symbols.symbol_function((SubLObject)sbhl_time_query_processing.EQUAL), Symbols.symbol_function((SubLObject)sbhl_time_query_processing.IDENTITY))) {
                                just = (SubLObject)ConsesLow.cons(item_var, just);
                            }
                        }
                        else {
                            just = ConsesLow.append(partial_just, just);
                        }
                    }
                    else {
                        missing_partial_justP = (SubLObject)sbhl_time_query_processing.T;
                    }
                    csome_list_var = csome_list_var.rest();
                    conjunct = csome_list_var.first();
                }
            }
            if (sbhl_time_query_processing.NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                remove_temporal_link_disjunction_consequents(mt);
            }
        }
        finally {
            sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind(_prev_bind_2, thread);
            sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)((sbhl_time_query_processing.NIL != missing_partial_justP) ? sbhl_time_query_processing.NIL : ((sbhl_time_query_processing.NIL != sbhl_time_vars.$sbhl_temporality_verbose_justsP$.getDynamicValue(thread)) ? just : Sequences.remove_duplicates(just, Symbols.symbol_function((SubLObject)sbhl_time_query_processing.EQUAL), (SubLObject)sbhl_time_query_processing.UNPROVIDED, (SubLObject)sbhl_time_query_processing.UNPROVIDED, (SubLObject)sbhl_time_query_processing.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 31389L)
    public static SubLObject why_false_temporal_quasi_link_conjunctionP(final SubLObject quasi_conjuncts, SubLObject mt) {
        if (mt == sbhl_time_query_processing.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_query_processing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = (SubLObject)sbhl_time_query_processing.NIL;
        final SubLObject quasi_disjuncts = temporal_link_conjunction_negation(quasi_conjuncts);
        final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.currentBinding(thread);
        try {
            sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.bind((SubLObject)sbhl_time_query_processing.NIL, thread);
            sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.bind((SubLObject)sbhl_time_query_processing.NIL, thread);
            if (sbhl_time_query_processing.NIL == mt && sbhl_time_query_processing.NIL == mt_relevance_macros.all_mts_are_relevantP() && sbhl_time_query_processing.NIL == mt_relevance_macros.any_mt_is_relevantP()) {
                mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
            }
            if (sbhl_time_query_processing.NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                add_temporal_link_disjunction_consequents(mt);
            }
            if (sbhl_time_query_processing.NIL == just) {
                SubLObject csome_list_var = quasi_disjuncts;
                SubLObject quasi_disjunct = (SubLObject)sbhl_time_query_processing.NIL;
                quasi_disjunct = csome_list_var.first();
                while (sbhl_time_query_processing.NIL == just && sbhl_time_query_processing.NIL != csome_list_var) {
                    final SubLObject link_tag = quasi_disjunct.first();
                    final SubLObject before = conses_high.second(quasi_disjunct);
                    final SubLObject after = conses_high.third(quasi_disjunct);
                    just = why_true_temporal_quasi_linkP(link_tag, before, after, mt);
                    csome_list_var = csome_list_var.rest();
                    quasi_disjunct = csome_list_var.first();
                }
            }
            if (sbhl_time_query_processing.NIL == just) {
                SubLObject disjunct = (SubLObject)sbhl_time_query_processing.NIL;
                SubLObject disjuncts = (SubLObject)sbhl_time_query_processing.NIL;
                SubLObject cdolist_list_var = quasi_disjuncts;
                SubLObject quasi_disjunct2 = (SubLObject)sbhl_time_query_processing.NIL;
                quasi_disjunct2 = cdolist_list_var.first();
                while (sbhl_time_query_processing.NIL != cdolist_list_var) {
                    final SubLObject link = adjust_temporal_quasi_link_to_link_disjunction_terms_and_existing_nodes(quasi_disjunct2);
                    final SubLObject link_tag2 = link.first();
                    if (sbhl_time_query_processing.NIL != link) {
                        if (sbhl_time_query_processing.NIL != disjunct) {
                            disjuncts = (SubLObject)ConsesLow.cons(link, disjuncts);
                        }
                        else if (sbhl_time_query_processing.NIL != subl_promotions.memberP(link_tag2, (SubLObject)sbhl_time_query_processing.$list3, (SubLObject)sbhl_time_query_processing.UNPROVIDED, (SubLObject)sbhl_time_query_processing.UNPROVIDED)) {
                            disjunct = link;
                        }
                        else {
                            disjuncts = (SubLObject)ConsesLow.cons(link, disjuncts);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    quasi_disjunct2 = cdolist_list_var.first();
                }
                if (sbhl_time_query_processing.NIL == disjunct) {
                    disjunct = disjuncts.first();
                    disjuncts = disjuncts.rest();
                }
                if (sbhl_time_query_processing.NIL != disjuncts) {
                    SubLObject conjuncts = (SubLObject)sbhl_time_query_processing.NIL;
                    SubLObject link_addedP = (SubLObject)sbhl_time_query_processing.NIL;
                    if (sbhl_time_query_processing.NIL == mt) {
                        mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                    }
                    SubLObject cdolist_list_var2 = disjuncts;
                    SubLObject link2 = (SubLObject)sbhl_time_query_processing.NIL;
                    link2 = cdolist_list_var2.first();
                    while (sbhl_time_query_processing.NIL != cdolist_list_var2) {
                        conjuncts = (SubLObject)ConsesLow.cons(temporal_link_negation(link2), conjuncts);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        link2 = cdolist_list_var2.first();
                    }
                    cdolist_list_var2 = conjuncts;
                    SubLObject conjunct = (SubLObject)sbhl_time_query_processing.NIL;
                    conjunct = cdolist_list_var2.first();
                    while (sbhl_time_query_processing.NIL != cdolist_list_var2) {
                        final SubLObject link_tag3 = conjunct.first();
                        final SubLObject before2 = conses_high.second(conjunct);
                        final SubLObject after2 = conses_high.third(conjunct);
                        link_addedP = (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_query_processing.NIL != sbhl_time_assertion_processing.add_temporal_link((SubLObject)sbhl_time_query_processing.$kw4$CONDITIONAL_PROOF, link_tag3, before2, after2, mt) || sbhl_time_query_processing.NIL != link_addedP);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        conjunct = cdolist_list_var2.first();
                    }
                    if (sbhl_time_query_processing.NIL != link_addedP) {
                        if (sbhl_time_query_processing.NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                            add_temporal_link_disjunction_consequents(mt);
                        }
                        final SubLObject link_tag4 = disjunct.first();
                        final SubLObject before3 = conses_high.second(disjunct);
                        final SubLObject after3 = conses_high.third(disjunct);
                        just = why_true_temporal_linkP(link_tag4, before3, after3, mt);
                    }
                    cdolist_list_var2 = conjuncts;
                    conjunct = (SubLObject)sbhl_time_query_processing.NIL;
                    conjunct = cdolist_list_var2.first();
                    while (sbhl_time_query_processing.NIL != cdolist_list_var2) {
                        final SubLObject link_tag3 = conjunct.first();
                        final SubLObject before2 = conses_high.second(conjunct);
                        final SubLObject after2 = conses_high.third(conjunct);
                        sbhl_time_assertion_processing.remove_temporal_link((SubLObject)sbhl_time_query_processing.$kw4$CONDITIONAL_PROOF, link_tag3, before2, after2, mt);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        conjunct = cdolist_list_var2.first();
                    }
                }
            }
            if (sbhl_time_query_processing.NIL != sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.getDynamicValue(thread)) {
                remove_temporal_link_disjunction_consequents(mt);
            }
        }
        finally {
            sbhl_time_vars.$sbhl_temporal_link_disjunction_consequent_table$.rebind(_prev_bind_2, thread);
            sbhl_time_vars.$sbhl_temporality_consequent_links_search_passed_through$.rebind(_prev_bind_0, thread);
        }
        return (sbhl_time_query_processing.NIL != sbhl_time_vars.$sbhl_temporality_verbose_justsP$.getDynamicValue(thread)) ? just : Sequences.remove_duplicates(just, Symbols.symbol_function((SubLObject)sbhl_time_query_processing.EQUAL), (SubLObject)sbhl_time_query_processing.UNPROVIDED, (SubLObject)sbhl_time_query_processing.UNPROVIDED, (SubLObject)sbhl_time_query_processing.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 34302L)
    public static SubLObject why_true_temporal_quasi_linkP(SubLObject link_tag, SubLObject before, SubLObject after, SubLObject mt) {
        if (mt == sbhl_time_query_processing.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_query_processing.NIL;
        }
        final SubLObject before_tag = before.first();
        final SubLObject before_time = conses_high.second(before);
        final SubLObject after_tag = after.first();
        final SubLObject after_time = conses_high.second(after);
        if (before_time.isInteger() && after_time.isInteger()) {
            return (SubLObject)sbhl_time_query_processing.NIL;
        }
        if (before_time.equal(after_time) && (link_tag == sbhl_time_query_processing.$kw5$WEAK || link_tag == sbhl_time_query_processing.$kw7$WEAK_SUCCESSOR) && (after_tag == sbhl_time_query_processing.$kw12$END || (before_tag == sbhl_time_query_processing.$kw11$START && after_tag == sbhl_time_query_processing.$kw11$START))) {
            return (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)sbhl_time_query_processing.$kw24$EQUALITY, (SubLObject)ConsesLow.list(sbhl_time_query_processing.$const23$equals, before_time, after_time), mt, (SubLObject)sbhl_time_query_processing.UNPROVIDED));
        }
        if (before_time.equal(after_time) && link_tag == sbhl_time_query_processing.$kw9$COORDINATE && ((before_tag == sbhl_time_query_processing.$kw11$START && after_tag == sbhl_time_query_processing.$kw11$START) || (before_tag == sbhl_time_query_processing.$kw12$END && after_tag == sbhl_time_query_processing.$kw12$END))) {
            return (SubLObject)ConsesLow.list(arguments.make_hl_support((SubLObject)sbhl_time_query_processing.$kw24$EQUALITY, (SubLObject)ConsesLow.list(sbhl_time_query_processing.$const23$equals, before_time, after_time), mt, (SubLObject)sbhl_time_query_processing.UNPROVIDED));
        }
        final SubLObject quasi_link = (SubLObject)ConsesLow.list(link_tag, before, after);
        final SubLObject link = adjust_temporal_quasi_link_to_existing_nodes(quasi_link);
        if (sbhl_time_query_processing.NIL == link) {
            return (SubLObject)sbhl_time_query_processing.NIL;
        }
        link_tag = link.first();
        before = conses_high.second(link);
        after = conses_high.third(link);
        return why_true_temporal_linkP(link_tag, before, after, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-query-processing.lisp", position = 35608L)
    public static SubLObject why_true_temporal_linkP(final SubLObject link_tag, final SubLObject before, final SubLObject after, SubLObject mt) {
        if (mt == sbhl_time_query_processing.UNPROVIDED) {
            mt = (SubLObject)sbhl_time_query_processing.NIL;
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw5$WEAK)) {
            return sbhl_time_search.why_weakly_precedesP(before, after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw6$STRICT)) {
            return sbhl_time_search.why_strictly_precedesP(before, after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw7$WEAK_SUCCESSOR)) {
            return sbhl_time_search.why_weakly_precedes_successorP(before, after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw8$SUCCESSOR_STRICT)) {
            return sbhl_time_search.why_successor_strictly_precedesP(before, after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw9$COORDINATE)) {
            return sbhl_time_search.why_coordinateP(before, after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw10$SUCCESSOR)) {
            return sbhl_time_search.why_successorP(before, after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw17$PREDECESSOR)) {
            return sbhl_time_search.why_predecessorP(before, after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw13$WEAK_SUCCESSORS_SUCCESSOR)) {
            return sbhl_time_search.why_weakly_precedes_successors_successorP(before, after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw18$WEAK_SUCCESSORS_SUCCESSOR_SUCCESSOR)) {
            return sbhl_time_search.why_weakly_precedes_successors_successors_successorP(before, after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw16$SUCCESSORS_SUCCESSOR)) {
            return sbhl_time_search.why_successors_successorP(before, after, mt);
        }
        if (link_tag.eql((SubLObject)sbhl_time_query_processing.$kw15$SUCCESSORS_SUCCESSOR_STRICT)) {
            return sbhl_time_search.why_successors_successor_strictly_precedesP(before, after, mt);
        }
        return (SubLObject)sbhl_time_query_processing.NIL;
    }
    
    public static SubLObject declare_sbhl_time_query_processing_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "true_temporal_relation_literalP", "TRUE-TEMPORAL-RELATION-LITERAL?", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "true_temporal_quasi_link_conjunctionP", "TRUE-TEMPORAL-QUASI-LINK-CONJUNCTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "false_temporal_quasi_link_conjunctionP", "FALSE-TEMPORAL-QUASI-LINK-CONJUNCTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "temporal_link_conjunction_negation", "TEMPORAL-LINK-CONJUNCTION-NEGATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "temporal_link_negation", "TEMPORAL-LINK-NEGATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "adjust_temporal_quasi_link_to_existing_nodes", "ADJUST-TEMPORAL-QUASI-LINK-TO-EXISTING-NODES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "adjust_quasi_link_before_half_to_existing_nodes", "ADJUST-QUASI-LINK-BEFORE-HALF-TO-EXISTING-NODES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "adjust_quasi_link_after_half_to_existing_nodes", "ADJUST-QUASI-LINK-AFTER-HALF-TO-EXISTING-NODES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "adjust_temporal_quasi_link_to_link_disjunction_terms_and_existing_nodes", "ADJUST-TEMPORAL-QUASI-LINK-TO-LINK-DISJUNCTION-TERMS-AND-EXISTING-NODES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "adjust_quasi_link_before_half_to_link_disjunction_terms_and_existing_nodes", "ADJUST-QUASI-LINK-BEFORE-HALF-TO-LINK-DISJUNCTION-TERMS-AND-EXISTING-NODES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "adjust_quasi_link_after_half_to_link_disjunction_terms_and_existing_nodes", "ADJUST-QUASI-LINK-AFTER-HALF-TO-LINK-DISJUNCTION-TERMS-AND-EXISTING-NODES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "closest_existing_date_point_before", "CLOSEST-EXISTING-DATE-POINT-BEFORE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "closest_existing_date_point_after", "CLOSEST-EXISTING-DATE-POINT-AFTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "true_temporal_quasi_linkP", "TRUE-TEMPORAL-QUASI-LINK?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "date_date_quasi_link_p", "DATE-DATE-QUASI-LINK-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "true_date_date_quasi_linkP", "TRUE-DATE-DATE-QUASI-LINK?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "true_temporal_linkP", "TRUE-TEMPORAL-LINK?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "add_temporal_link_disjunction_consequents", "ADD-TEMPORAL-LINK-DISJUNCTION-CONSEQUENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "remove_temporal_link_disjunction_consequents", "REMOVE-TEMPORAL-LINK-DISJUNCTION-CONSEQUENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "determine_temporal_link_disjunction_consequent", "DETERMINE-TEMPORAL-LINK-DISJUNCTION-CONSEQUENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "all_weakly_before_quasi_link", "ALL-WEAKLY-BEFORE-QUASI-LINK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "all_weakly_after_quasi_link", "ALL-WEAKLY-AFTER-QUASI-LINK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "all_strictly_before_quasi_link", "ALL-STRICTLY-BEFORE-QUASI-LINK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "all_strictly_after_quasi_link", "ALL-STRICTLY-AFTER-QUASI-LINK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "all_coordinate_quasi_link", "ALL-COORDINATE-QUASI-LINK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "all_successors_quasi_link", "ALL-SUCCESSORS-QUASI-LINK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "all_predecessors_quasi_link", "ALL-PREDECESSORS-QUASI-LINK", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "all_temporal_link_before", "ALL-TEMPORAL-LINK-BEFORE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "all_temporal_link_after", "ALL-TEMPORAL-LINK-AFTER", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "all_weakly_between_quasi_links", "ALL-WEAKLY-BETWEEN-QUASI-LINKS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "all_strictly_between_quasi_links", "ALL-STRICTLY-BETWEEN-QUASI-LINKS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "all_temporal_link_between", "ALL-TEMPORAL-LINK-BETWEEN", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "why_temporal_relationP", "WHY-TEMPORAL-RELATION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "why_true_temporal_relation_literalP", "WHY-TRUE-TEMPORAL-RELATION-LITERAL?", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "why_true_temporal_quasi_link_conjunctionP", "WHY-TRUE-TEMPORAL-QUASI-LINK-CONJUNCTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "why_false_temporal_quasi_link_conjunctionP", "WHY-FALSE-TEMPORAL-QUASI-LINK-CONJUNCTION?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "why_true_temporal_quasi_linkP", "WHY-TRUE-TEMPORAL-QUASI-LINK?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_query_processing", "why_true_temporal_linkP", "WHY-TRUE-TEMPORAL-LINK?", 3, 1, false);
        return (SubLObject)sbhl_time_query_processing.NIL;
    }
    
    public static SubLObject init_sbhl_time_query_processing_file() {
        return (SubLObject)sbhl_time_query_processing.NIL;
    }
    
    public static SubLObject setup_sbhl_time_query_processing_file() {
        return (SubLObject)sbhl_time_query_processing.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sbhl_time_query_processing_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sbhl_time_query_processing_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sbhl_time_query_processing_file();
    }
    
    static {
        me = (SubLFile)new sbhl_time_query_processing();
        $kw0$CONJUNCTION_FN = SubLObjectFactory.makeKeyword("CONJUNCTION-FN");
        $kw1$POS = SubLObjectFactory.makeKeyword("POS");
        $kw2$NEG = SubLObjectFactory.makeKeyword("NEG");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WEAK-SUCCESSORS-SUCCESSOR"), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESSORS-SUCCESSOR-STRICT"));
        $kw4$CONDITIONAL_PROOF = SubLObjectFactory.makeKeyword("CONDITIONAL-PROOF");
        $kw5$WEAK = SubLObjectFactory.makeKeyword("WEAK");
        $kw6$STRICT = SubLObjectFactory.makeKeyword("STRICT");
        $kw7$WEAK_SUCCESSOR = SubLObjectFactory.makeKeyword("WEAK-SUCCESSOR");
        $kw8$SUCCESSOR_STRICT = SubLObjectFactory.makeKeyword("SUCCESSOR-STRICT");
        $kw9$COORDINATE = SubLObjectFactory.makeKeyword("COORDINATE");
        $kw10$SUCCESSOR = SubLObjectFactory.makeKeyword("SUCCESSOR");
        $kw11$START = SubLObjectFactory.makeKeyword("START");
        $kw12$END = SubLObjectFactory.makeKeyword("END");
        $kw13$WEAK_SUCCESSORS_SUCCESSOR = SubLObjectFactory.makeKeyword("WEAK-SUCCESSORS-SUCCESSOR");
        $kw14$WEAK_SUCCESSORS_SUCCESSORS_SUCCESSOR = SubLObjectFactory.makeKeyword("WEAK-SUCCESSORS-SUCCESSORS-SUCCESSOR");
        $kw15$SUCCESSORS_SUCCESSOR_STRICT = SubLObjectFactory.makeKeyword("SUCCESSORS-SUCCESSOR-STRICT");
        $kw16$SUCCESSORS_SUCCESSOR = SubLObjectFactory.makeKeyword("SUCCESSORS-SUCCESSOR");
        $kw17$PREDECESSOR = SubLObjectFactory.makeKeyword("PREDECESSOR");
        $kw18$WEAK_SUCCESSORS_SUCCESSOR_SUCCESSOR = SubLObjectFactory.makeKeyword("WEAK-SUCCESSORS-SUCCESSOR-SUCCESSOR");
        $int19$1000 = SubLObjectFactory.makeInteger(1000);
        $kw20$DO_HASH_TABLE = SubLObjectFactory.makeKeyword("DO-HASH-TABLE");
        $int21$_2 = SubLObjectFactory.makeInteger(-2);
        $kw22$REFLEXIVE = SubLObjectFactory.makeKeyword("REFLEXIVE");
        $const23$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $kw24$EQUALITY = SubLObjectFactory.makeKeyword("EQUALITY");
    }
}

/*

	Total time: 595 ms
	
*/