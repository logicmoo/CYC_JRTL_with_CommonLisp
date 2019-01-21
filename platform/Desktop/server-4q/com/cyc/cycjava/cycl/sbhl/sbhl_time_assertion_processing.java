package com.cyc.cycjava.cycl.sbhl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.agenda;
import com.cyc.cycjava.cycl.conflicts;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.fi;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_time_assertion_processing extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing";
    public static final String myFingerPrint = "2e7b93bf34747f8c18694a2f5479922cb3ce3b07f33f55385ff2d75e32dcbe58";
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 824L)
    public static SubLSymbol $sbhl_time_default_link_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 881L)
    public static SubLSymbol $hl_start_end_fn_defining_mt$;
    private static final SubLSymbol $sym0$_SBHL_TIME_DEFAULT_LINK_MT_;
    private static final SubLObject $const1$BaseKB;
    private static final SubLSymbol $sym2$_HL_START_END_FN_DEFINING_MT_;
    private static final SubLObject $const3$HL_StartFn;
    private static final SubLSymbol $sym4$NOT_EQL;
    private static final SubLSymbol $sym5$RELEVANT_MT_IS_GENL_MT;
    private static final SubLString $str6$skip_subsumption_op;
    private static final SubLString $str7$_s_is_not_a_sbhl_time_predicate_p;
    private static final SubLString $str8$_s_is_not_a_sbhl_time_arg_p;
    private static final SubLString $str9$gaf_is_effectively_date_date_asse;
    private static final SubLSymbol $kw10$ADD;
    private static final SubLSymbol $sym11$ADD_TEMPORAL_RELATION;
    private static final SubLSymbol $sym12$RELEVANT_MT_IS_EQ;
    private static final SubLString $str13$_sbhl__genls__skipping_remove_op_;
    private static final SubLSymbol $sym14$REMOVE_TEMPORAL_RELATION;
    private static final SubLSymbol $kw15$CONJUNCTION_FN;
    private static final SubLSymbol $kw16$POS;
    private static final SubLSymbol $kw17$NEG;
    private static final SubLSymbol $kw18$START;
    private static final SubLSymbol $kw19$END;
    private static final SubLSymbol $kw20$DEFINITIONAL;
    private static final SubLSymbol $kw21$WEAK;
    private static final SubLSymbol $kw22$BEGINNING_OF_TIME;
    private static final SubLSymbol $kw23$END_OF_TIME;
    private static final SubLSymbol $sym24$EXTENDED_UNIVERSAL_DATE_;
    private static final SubLSymbol $kw25$SUCCESSOR;
    private static final SubLSymbol $kw26$SUCCESSOR_STRICT;
    private static final SubLList $list27;
    private static final SubLSymbol $kw28$COORDINATE;
    private static final SubLSymbol $kw29$STRICT;
    private static final SubLSymbol $kw30$WEAK_SUCCESSOR;
    private static final SubLList $list31;
    private static final SubLString $str32$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$SYMBOLP;
    private static final SubLSymbol $sym35$__;
    private static final SubLSymbol $sym36$_;
    private static final SubLSymbol $sym37$____;
    private static final SubLSymbol $sym38$__;
    private static final SubLSymbol $sym39$FORT_P;
    private static final SubLSymbol $sym40$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const41$EverythingPSC;
    private static final SubLSymbol $kw42$GAF;
    private static final SubLString $str43$sbhl_conflict___s__a__a__;
    private static final SubLString $str44$sbhl_conflict___s__a__a________be;
    private static final SubLString $str45$__a;
    private static final SubLSymbol $kw46$IGNORE;
    private static final SubLSymbol $kw47$HALT;
    private static final SubLSymbol $kw48$DEBUG;
    private static final SubLString $str49$leave_the_kb_inconsistent_for_now;
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 1054L)
    public static SubLObject add_temporal_relation(SubLObject source, final SubLObject assertion, SubLObject source_must_be_uniqueP) {
        if (source_must_be_uniqueP == sbhl_time_assertion_processing.UNPROVIDED) {
            source_must_be_uniqueP = (SubLObject)sbhl_time_assertion_processing.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_time_assertion_processing.NIL != sbhl_time_vars.sbhl_temporality_activeP() && (sbhl_time_assertion_processing.NIL == source_must_be_uniqueP || sbhl_time_assertion_processing.NIL == subl_promotions.memberP(source, assertions_high.assertion_arguments(assertion), Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.$sym4$NOT_EQL), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED))) {
            final SubLObject _prev_bind_0 = sbhl_link_vars.$added_source$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_link_vars.$added_assertion$.currentBinding(thread);
            try {
                sbhl_link_vars.$added_source$.bind(source, thread);
                sbhl_link_vars.$added_assertion$.bind(assertion, thread);
                final SubLObject truth = assertions_high.assertion_truth(assertion);
                final SubLObject sense = enumeration_types.truth_sense(truth);
                final SubLObject mt = assertions_high.assertion_mt(assertion);
                final SubLObject pred = assertions_high.gaf_arg0(assertion);
                final SubLObject arg1 = assertions_high.gaf_arg1(assertion);
                final SubLObject arg2 = assertions_high.gaf_arg2(assertion);
                final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sbhl_time_assertion_processing.$sym5$RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    if (sbhl_time_assertion_processing.NIL == sbhl_time_utilities.sbhl_time_predicate_p(pred)) {
                        sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_time_assertion_processing.THREE_INTEGER, (SubLObject)sbhl_time_assertion_processing.$str6$skip_subsumption_op, (SubLObject)sbhl_time_assertion_processing.$str7$_s_is_not_a_sbhl_time_predicate_p, pred, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
                    }
                    else if (sbhl_time_assertion_processing.NIL == sbhl_time_utilities.sbhl_time_arg_p(arg1)) {
                        sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_time_assertion_processing.THREE_INTEGER, (SubLObject)sbhl_time_assertion_processing.$str6$skip_subsumption_op, (SubLObject)sbhl_time_assertion_processing.$str8$_s_is_not_a_sbhl_time_arg_p, arg1, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
                    }
                    else if (sbhl_time_assertion_processing.NIL == sbhl_time_utilities.sbhl_time_arg_p(arg2)) {
                        sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_time_assertion_processing.THREE_INTEGER, (SubLObject)sbhl_time_assertion_processing.$str6$skip_subsumption_op, (SubLObject)sbhl_time_assertion_processing.$str8$_s_is_not_a_sbhl_time_arg_p, arg2, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
                    }
                    else if (sbhl_time_assertion_processing.NIL == sbhl_assimilable_temporality_gafP(pred, arg1, arg2)) {
                        sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_time_assertion_processing.FOUR_INTEGER, (SubLObject)sbhl_time_assertion_processing.$str6$skip_subsumption_op, (SubLObject)sbhl_time_assertion_processing.$str9$gaf_is_effectively_date_date_asse, (SubLObject)ConsesLow.list(pred, arg1, arg2), truth, mt, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
                    }
                    else {
                        final SubLObject _prev_bind_0_$2 = sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.currentBinding(thread);
                        try {
                            sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.bind((SubLObject)sbhl_time_assertion_processing.T, thread);
                            if (sbhl_time_assertion_processing.NIL != sbhl_time_query_processing.true_temporal_relation_literalP(pred, arg1, arg2, enumeration_types.inverse_sense(sense), mt)) {
                                handle_temporal_relation_literal_conflict(pred, arg1, arg2, sense, mt, (SubLObject)sbhl_time_assertion_processing.$kw10$ADD);
                            }
                            else {
                                add_temporal_relation_literal(assertion, pred, arg1, arg2, sense, mt);
                            }
                        }
                        finally {
                            sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$1, thread);
                }
            }
            finally {
                sbhl_link_vars.$added_assertion$.rebind(_prev_bind_2, thread);
                sbhl_link_vars.$added_source$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 2964L)
    public static SubLObject add_wff_temporal_relation(SubLObject source, final SubLObject assertion, SubLObject source_must_be_uniqueP) {
        if (source_must_be_uniqueP == sbhl_time_assertion_processing.UNPROVIDED) {
            source_must_be_uniqueP = (SubLObject)sbhl_time_assertion_processing.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_time_assertion_processing.NIL != sbhl_time_vars.sbhl_temporality_activeP() && (sbhl_time_assertion_processing.NIL == source_must_be_uniqueP || sbhl_time_assertion_processing.NIL == subl_promotions.memberP(source, assertions_high.assertion_arguments(assertion), Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.$sym4$NOT_EQL), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED))) {
            final SubLObject _prev_bind_0 = sbhl_link_vars.$added_source$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sbhl_link_vars.$added_assertion$.currentBinding(thread);
            try {
                sbhl_link_vars.$added_source$.bind(source, thread);
                sbhl_link_vars.$added_assertion$.bind(assertion, thread);
                final SubLObject truth = assertions_high.assertion_truth(assertion);
                final SubLObject sense = enumeration_types.truth_sense(truth);
                final SubLObject mt = assertions_high.assertion_mt(assertion);
                final SubLObject pred = assertions_high.gaf_arg0(assertion);
                final SubLObject arg1 = assertions_high.gaf_arg1(assertion);
                final SubLObject arg2 = assertions_high.gaf_arg2(assertion);
                final SubLObject _prev_bind_0_$4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$5 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sbhl_time_assertion_processing.$sym5$RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    if (sbhl_time_assertion_processing.NIL == sbhl_time_utilities.sbhl_time_predicate_p(pred)) {
                        sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_time_assertion_processing.THREE_INTEGER, (SubLObject)sbhl_time_assertion_processing.$str6$skip_subsumption_op, (SubLObject)sbhl_time_assertion_processing.$str7$_s_is_not_a_sbhl_time_predicate_p, pred, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
                    }
                    else if (sbhl_time_assertion_processing.NIL == sbhl_time_utilities.sbhl_time_arg_p(arg1)) {
                        sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_time_assertion_processing.THREE_INTEGER, (SubLObject)sbhl_time_assertion_processing.$str6$skip_subsumption_op, (SubLObject)sbhl_time_assertion_processing.$str8$_s_is_not_a_sbhl_time_arg_p, arg1, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
                    }
                    else if (sbhl_time_assertion_processing.NIL == sbhl_time_utilities.sbhl_time_arg_p(arg2)) {
                        sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_time_assertion_processing.THREE_INTEGER, (SubLObject)sbhl_time_assertion_processing.$str6$skip_subsumption_op, (SubLObject)sbhl_time_assertion_processing.$str8$_s_is_not_a_sbhl_time_arg_p, arg2, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
                    }
                    else if (sbhl_time_assertion_processing.NIL == sbhl_assimilable_temporality_gafP(pred, arg1, arg2)) {
                        sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_time_assertion_processing.FOUR_INTEGER, (SubLObject)sbhl_time_assertion_processing.$str6$skip_subsumption_op, (SubLObject)sbhl_time_assertion_processing.$str9$gaf_is_effectively_date_date_asse, (SubLObject)ConsesLow.list(pred, arg1, arg2), truth, mt, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
                    }
                    else {
                        final SubLObject _prev_bind_0_$5 = sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.currentBinding(thread);
                        try {
                            sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.bind((SubLObject)sbhl_time_assertion_processing.T, thread);
                            add_temporal_relation_literal(assertion, pred, arg1, arg2, sense, mt);
                        }
                        finally {
                            sbhl_time_vars.$sbhl_temporality_consider_link_disjunctionsP$.rebind(_prev_bind_0_$5, thread);
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$5, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$4, thread);
                }
            }
            finally {
                sbhl_link_vars.$added_assertion$.rebind(_prev_bind_2, thread);
                sbhl_link_vars.$added_source$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 4603L)
    public static SubLObject remove_temporal_relation(SubLObject source, final SubLObject assertion, SubLObject warn_when_assertion_existsP) {
        if (warn_when_assertion_existsP == sbhl_time_assertion_processing.UNPROVIDED) {
            warn_when_assertion_existsP = (SubLObject)sbhl_time_assertion_processing.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_time_assertion_processing.NIL != sbhl_time_vars.sbhl_temporality_activeP()) {
            final SubLObject truth = assertions_high.assertion_truth(assertion);
            final SubLObject sense = enumeration_types.truth_sense(truth);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject pred = assertions_high.gaf_arg0(assertion);
            final SubLObject arg1 = assertions_high.gaf_arg1(assertion);
            final SubLObject arg2 = assertions_high.gaf_arg2(assertion);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sbhl_time_assertion_processing.$sym12$RELEVANT_MT_IS_EQ, thread);
                mt_relevance_macros.$mt$.bind(mt, thread);
                if (sbhl_time_assertion_processing.NIL != warn_when_assertion_existsP && sbhl_time_assertion_processing.NIL != kb_accessors.assertion_still_thereP(assertion, truth)) {
                    sbhl_paranoia.sbhl_warn((SubLObject)sbhl_time_assertion_processing.THREE_INTEGER, (SubLObject)sbhl_time_assertion_processing.$str13$_sbhl__genls__skipping_remove_op_, assertion, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
                }
                else if (sbhl_time_assertion_processing.NIL == sbhl_time_utilities.sbhl_time_predicate_p(pred)) {
                    sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_time_assertion_processing.THREE_INTEGER, (SubLObject)sbhl_time_assertion_processing.$str6$skip_subsumption_op, (SubLObject)sbhl_time_assertion_processing.$str7$_s_is_not_a_sbhl_time_predicate_p, pred, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
                }
                else if (sbhl_time_assertion_processing.NIL == sbhl_time_utilities.sbhl_time_arg_p(arg1)) {
                    sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_time_assertion_processing.THREE_INTEGER, (SubLObject)sbhl_time_assertion_processing.$str6$skip_subsumption_op, (SubLObject)sbhl_time_assertion_processing.$str8$_s_is_not_a_sbhl_time_arg_p, arg1, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
                }
                else if (sbhl_time_assertion_processing.NIL == sbhl_time_utilities.sbhl_time_arg_p(arg2)) {
                    sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_time_assertion_processing.THREE_INTEGER, (SubLObject)sbhl_time_assertion_processing.$str6$skip_subsumption_op, (SubLObject)sbhl_time_assertion_processing.$str8$_s_is_not_a_sbhl_time_arg_p, arg2, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
                }
                else {
                    remove_temporal_relation_literal(assertion, pred, arg1, arg2, sense, mt);
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 5629L)
    public static SubLObject sbhl_assimilable_temporality_gafP(final SubLObject pred, final SubLObject arg1, final SubLObject arg2) {
        if (sbhl_time_assertion_processing.NIL == sbhl_time_utilities.valid_sbhl_time_literal_argsP(pred, arg1, arg2)) {
            return (SubLObject)sbhl_time_assertion_processing.NIL;
        }
        final SubLObject conjunction_fn = sbhl_time_modules.get_sbhl_time_module(pred, (SubLObject)sbhl_time_assertion_processing.$kw15$CONJUNCTION_FN, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
        if (sbhl_time_assertion_processing.NIL == Symbols.fboundp(conjunction_fn)) {
            return (SubLObject)sbhl_time_assertion_processing.NIL;
        }
        final SubLObject conjuncts = Functions.funcall(conjunction_fn, arg1, arg2);
        SubLObject not_date_date_quasi_linkP = (SubLObject)sbhl_time_assertion_processing.NIL;
        if (sbhl_time_assertion_processing.NIL == not_date_date_quasi_linkP) {
            SubLObject csome_list_var;
            SubLObject conjunct;
            for (csome_list_var = conjuncts, conjunct = (SubLObject)sbhl_time_assertion_processing.NIL, conjunct = csome_list_var.first(); sbhl_time_assertion_processing.NIL == not_date_date_quasi_linkP && sbhl_time_assertion_processing.NIL != csome_list_var; not_date_date_quasi_linkP = (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_assertion_processing.NIL == sbhl_time_query_processing.date_date_quasi_link_p(conjunct)), csome_list_var = csome_list_var.rest(), conjunct = csome_list_var.first()) {}
        }
        return not_date_date_quasi_linkP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 6177L)
    public static SubLObject add_temporal_relation_literal(final SubLObject support, final SubLObject pred, final SubLObject arg1, final SubLObject arg2, final SubLObject sense, final SubLObject mt) {
        if (sbhl_time_assertion_processing.NIL == sbhl_time_utilities.valid_sbhl_time_literal_argsP(pred, arg1, arg2)) {
            return (SubLObject)sbhl_time_assertion_processing.NIL;
        }
        final SubLObject conjunction_fn = sbhl_time_modules.get_sbhl_time_module(pred, (SubLObject)sbhl_time_assertion_processing.$kw15$CONJUNCTION_FN, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
        if (sbhl_time_assertion_processing.NIL == Symbols.fboundp(conjunction_fn)) {
            return (SubLObject)sbhl_time_assertion_processing.NIL;
        }
        final SubLObject conjuncts = Functions.funcall(conjunction_fn, arg1, arg2);
        if (sense.eql((SubLObject)sbhl_time_assertion_processing.$kw16$POS)) {
            if (sbhl_time_assertion_processing.NIL != sbhl_time_utilities.conjunctive_temporal_relation_predP(pred)) {
                add_temporal_quasi_link_conjunction(support, conjuncts, mt);
            }
            else if (sbhl_time_assertion_processing.NIL != sbhl_time_utilities.disjunctive_temporal_relation_predP(pred)) {
                add_temporal_quasi_link_conjunction_negation(support, conjuncts, mt);
            }
        }
        else if (sense.eql((SubLObject)sbhl_time_assertion_processing.$kw17$NEG)) {
            if (sbhl_time_assertion_processing.NIL != sbhl_time_utilities.conjunctive_temporal_relation_predP(pred)) {
                add_temporal_quasi_link_conjunction_negation(support, conjuncts, mt);
            }
            else if (sbhl_time_assertion_processing.NIL != sbhl_time_utilities.disjunctive_temporal_relation_predP(pred)) {
                add_temporal_quasi_link_conjunction(support, conjuncts, mt);
            }
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 7063L)
    public static SubLObject remove_temporal_relation_literal(final SubLObject support, final SubLObject pred, final SubLObject arg1, final SubLObject arg2, final SubLObject sense, final SubLObject mt) {
        if (sbhl_time_assertion_processing.NIL == sbhl_time_utilities.valid_sbhl_time_literal_argsP(pred, arg1, arg2)) {
            return (SubLObject)sbhl_time_assertion_processing.NIL;
        }
        final SubLObject conjunction_fn = sbhl_time_modules.get_sbhl_time_module(pred, (SubLObject)sbhl_time_assertion_processing.$kw15$CONJUNCTION_FN, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
        if (sbhl_time_assertion_processing.NIL == Symbols.fboundp(conjunction_fn)) {
            return (SubLObject)sbhl_time_assertion_processing.NIL;
        }
        final SubLObject conjuncts = Functions.funcall(conjunction_fn, arg1, arg2);
        if (sense.eql((SubLObject)sbhl_time_assertion_processing.$kw16$POS)) {
            if (sbhl_time_assertion_processing.NIL != sbhl_time_utilities.conjunctive_temporal_relation_predP(pred)) {
                remove_temporal_quasi_link_conjunction(support, conjuncts, mt);
            }
            else if (sbhl_time_assertion_processing.NIL != sbhl_time_utilities.disjunctive_temporal_relation_predP(pred)) {
                remove_temporal_quasi_link_conjunction_negation(support, conjuncts, mt);
            }
        }
        else if (sense.eql((SubLObject)sbhl_time_assertion_processing.$kw17$NEG)) {
            if (sbhl_time_assertion_processing.NIL != sbhl_time_utilities.conjunctive_temporal_relation_predP(pred)) {
                remove_temporal_quasi_link_conjunction_negation(support, conjuncts, mt);
            }
            else if (sbhl_time_assertion_processing.NIL != sbhl_time_utilities.disjunctive_temporal_relation_predP(pred)) {
                remove_temporal_quasi_link_conjunction(support, conjuncts, mt);
            }
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 7964L)
    public static SubLObject add_temporal_quasi_link_conjunction(final SubLObject support, final SubLObject conjuncts, final SubLObject mt) {
        if (sbhl_time_assertion_processing.NIL == sbhl_time_query_processing.date_date_quasi_link_p(conjuncts.first())) {
            SubLObject cdolist_list_var = conjuncts;
            SubLObject conjunct = (SubLObject)sbhl_time_assertion_processing.NIL;
            conjunct = cdolist_list_var.first();
            while (sbhl_time_assertion_processing.NIL != cdolist_list_var) {
                final SubLObject link_tag = conjunct.first();
                final SubLObject before = find_or_create_hl_temporal_point(conses_high.second(conjunct));
                final SubLObject after = find_or_create_hl_temporal_point(conses_high.third(conjunct));
                add_temporal_link(support, link_tag, before, after, mt);
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            }
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 8450L)
    public static SubLObject remove_temporal_quasi_link_conjunction(final SubLObject support, final SubLObject conjuncts, final SubLObject mt) {
        SubLObject cdolist_list_var = conjuncts;
        SubLObject conjunct = (SubLObject)sbhl_time_assertion_processing.NIL;
        conjunct = cdolist_list_var.first();
        while (sbhl_time_assertion_processing.NIL != cdolist_list_var) {
            final SubLObject link_tag = conjunct.first();
            final SubLObject before = find_hl_temporal_point(conses_high.second(conjunct));
            final SubLObject after = find_hl_temporal_point(conses_high.third(conjunct));
            remove_temporal_link(support, link_tag, before, after, mt);
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 8807L)
    public static SubLObject find_or_create_hl_temporal_point(final SubLObject quasi_point) {
        final SubLObject point_tag = quasi_point.first();
        final SubLObject point_time = conses_high.second(quasi_point);
        final SubLObject pcase_var = point_tag;
        if (pcase_var.eql((SubLObject)sbhl_time_assertion_processing.$kw18$START)) {
            if (point_time.isInteger()) {
                add_hl_start_for_extended_universal_date(point_time);
            }
            else if (sbhl_time_assertion_processing.NIL != el_utilities.closedP(point_time, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED)) {
                add_hl_start_for_non_date(point_time);
            }
            return sbhl_time_utilities.hl_start(point_time);
        }
        if (pcase_var.eql((SubLObject)sbhl_time_assertion_processing.$kw19$END)) {
            if (point_time.isInteger()) {
                add_hl_end_for_extended_universal_date(point_time);
            }
            else if (sbhl_time_assertion_processing.NIL != el_utilities.closedP(point_time, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED)) {
                add_hl_end_for_non_date(point_time);
            }
            return sbhl_time_utilities.hl_end(point_time);
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 9397L)
    public static SubLObject find_hl_temporal_point(final SubLObject quasi_point) {
        final SubLObject point_tag = quasi_point.first();
        final SubLObject point_time = conses_high.second(quasi_point);
        final SubLObject pcase_var = point_tag;
        if (pcase_var.eql((SubLObject)sbhl_time_assertion_processing.$kw18$START)) {
            return sbhl_time_utilities.hl_start(point_time);
        }
        if (pcase_var.eql((SubLObject)sbhl_time_assertion_processing.$kw19$END)) {
            return sbhl_time_utilities.hl_end(point_time);
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 9659L)
    public static SubLObject add_hl_start_for_non_date(final SubLObject time) {
        final SubLObject start = sbhl_time_utilities.hl_start(time);
        final SubLObject end = sbhl_time_utilities.hl_end(time);
        add_temporal_link((SubLObject)sbhl_time_assertion_processing.$kw20$DEFINITIONAL, (SubLObject)sbhl_time_assertion_processing.$kw21$WEAK, start, end, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
        add_temporal_link((SubLObject)sbhl_time_assertion_processing.$kw20$DEFINITIONAL, (SubLObject)sbhl_time_assertion_processing.$kw21$WEAK, sbhl_time_utilities.hl_end((SubLObject)sbhl_time_assertion_processing.$kw22$BEGINNING_OF_TIME), start, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
        add_temporal_link((SubLObject)sbhl_time_assertion_processing.$kw20$DEFINITIONAL, (SubLObject)sbhl_time_assertion_processing.$kw21$WEAK, end, sbhl_time_utilities.hl_start((SubLObject)sbhl_time_assertion_processing.$kw23$END_OF_TIME), sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 10076L)
    public static SubLObject find_or_create_hl_start(final SubLObject time) {
        return sbhl_time_utilities.hl_start(time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 10151L)
    public static SubLObject add_hl_end_for_non_date(final SubLObject time) {
        final SubLObject end = sbhl_time_utilities.hl_end(time);
        final SubLObject start = sbhl_time_utilities.hl_start(time);
        add_temporal_link((SubLObject)sbhl_time_assertion_processing.$kw20$DEFINITIONAL, (SubLObject)sbhl_time_assertion_processing.$kw21$WEAK, start, end, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
        add_temporal_link((SubLObject)sbhl_time_assertion_processing.$kw20$DEFINITIONAL, (SubLObject)sbhl_time_assertion_processing.$kw21$WEAK, sbhl_time_utilities.hl_end((SubLObject)sbhl_time_assertion_processing.$kw22$BEGINNING_OF_TIME), start, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
        add_temporal_link((SubLObject)sbhl_time_assertion_processing.$kw20$DEFINITIONAL, (SubLObject)sbhl_time_assertion_processing.$kw21$WEAK, end, sbhl_time_utilities.hl_start((SubLObject)sbhl_time_assertion_processing.$kw23$END_OF_TIME), sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 10566L)
    public static SubLObject find_or_create_hl_end(final SubLObject time) {
        return sbhl_time_utilities.hl_end(time);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 10637L)
    public static SubLObject add_hl_start_for_extended_universal_date(final SubLObject eu_date) {
        final SubLObject start = sbhl_time_utilities.hl_start(eu_date);
        if (sbhl_time_assertion_processing.NIL == sbhl_time_utilities.sbhl_temporal_node_p(start)) {
            if (sbhl_time_assertion_processing.NIL == subl_promotions.memberP(eu_date, sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue(), Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.EQL), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED)) {
                sbhl_time_vars.$sbhl_extended_universal_date_list$.setGlobalValue(Sort.cmerge(conses_high.copy_list(sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue()), (SubLObject)ConsesLow.list(eu_date), (SubLObject)sbhl_time_assertion_processing.$sym24$EXTENDED_UNIVERSAL_DATE_, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED));
            }
            final SubLObject end = sbhl_time_utilities.hl_end(eu_date);
            final SubLObject n = Sequences.position(eu_date, sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue(), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
            final SubLObject date_list_last_position = Numbers.subtract(Sequences.length(sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue()), (SubLObject)sbhl_time_assertion_processing.ONE_INTEGER);
            SubLObject eu_date_before = (SubLObject)sbhl_time_assertion_processing.NIL;
            SubLObject date_point_before = (SubLObject)sbhl_time_assertion_processing.NIL;
            SubLObject eu_date_after = (SubLObject)sbhl_time_assertion_processing.NIL;
            SubLObject date_point_after = (SubLObject)sbhl_time_assertion_processing.NIL;
            if (n.numG((SubLObject)sbhl_time_assertion_processing.ZERO_INTEGER)) {
                eu_date_before = ConsesLow.nth(Numbers.subtract(n, (SubLObject)sbhl_time_assertion_processing.ONE_INTEGER), sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue());
                date_point_before = closest_hl_point_node_at_or_before_end(eu_date_before);
            }
            if (n.numL(date_list_last_position)) {
                eu_date_after = ConsesLow.nth(Numbers.add(n, (SubLObject)sbhl_time_assertion_processing.ONE_INTEGER), sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue());
                date_point_after = closest_hl_point_node_at_or_after_start(eu_date_after);
            }
            if (sbhl_time_assertion_processing.NIL != date_point_before) {
                if (eu_date_before.numE(numeric_date_utilities.preceding_extended_universal_date(eu_date)) && sbhl_time_assertion_processing.NIL != sbhl_time_utilities.hl_end_p(date_point_before)) {
                    add_temporal_link((SubLObject)sbhl_time_assertion_processing.$kw20$DEFINITIONAL, (SubLObject)sbhl_time_assertion_processing.$kw25$SUCCESSOR, date_point_before, start, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
                }
                else {
                    add_temporal_link((SubLObject)sbhl_time_assertion_processing.$kw20$DEFINITIONAL, (SubLObject)sbhl_time_assertion_processing.$kw26$SUCCESSOR_STRICT, date_point_before, start, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
                }
            }
            if (sbhl_time_assertion_processing.NIL != sbhl_time_utilities.sbhl_temporal_node_p(end)) {
                add_temporal_link((SubLObject)sbhl_time_assertion_processing.$kw20$DEFINITIONAL, (SubLObject)sbhl_time_assertion_processing.$kw26$SUCCESSOR_STRICT, start, end, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
            }
            else if (sbhl_time_assertion_processing.NIL != date_point_after) {
                add_temporal_link((SubLObject)sbhl_time_assertion_processing.$kw20$DEFINITIONAL, (SubLObject)sbhl_time_assertion_processing.$kw26$SUCCESSOR_STRICT, start, date_point_after, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
            }
            if (sbhl_time_assertion_processing.NIL != date_point_before) {
                if (sbhl_time_assertion_processing.NIL != sbhl_time_utilities.sbhl_temporal_node_p(end)) {
                    remove_temporal_link((SubLObject)sbhl_time_assertion_processing.$kw20$DEFINITIONAL, (SubLObject)sbhl_time_assertion_processing.$kw26$SUCCESSOR_STRICT, date_point_before, end, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
                }
                else if (sbhl_time_assertion_processing.NIL != date_point_after) {
                    remove_temporal_link((SubLObject)sbhl_time_assertion_processing.$kw20$DEFINITIONAL, (SubLObject)sbhl_time_assertion_processing.$kw26$SUCCESSOR_STRICT, date_point_before, date_point_after, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
                }
            }
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 12852L)
    public static SubLObject add_hl_end_for_extended_universal_date(final SubLObject eu_date) {
        final SubLObject end = sbhl_time_utilities.hl_end(eu_date);
        if (sbhl_time_assertion_processing.NIL == sbhl_time_utilities.sbhl_temporal_node_p(end)) {
            if (sbhl_time_assertion_processing.NIL == subl_promotions.memberP(eu_date, sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue(), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED)) {
                sbhl_time_vars.$sbhl_extended_universal_date_list$.setGlobalValue(Sort.cmerge(conses_high.copy_list(sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue()), (SubLObject)ConsesLow.list(eu_date), (SubLObject)sbhl_time_assertion_processing.$sym24$EXTENDED_UNIVERSAL_DATE_, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED));
            }
            final SubLObject start = sbhl_time_utilities.hl_start(eu_date);
            final SubLObject n = Sequences.position(eu_date, sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue(), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
            final SubLObject date_list_last_position = Numbers.subtract(Sequences.length(sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue()), (SubLObject)sbhl_time_assertion_processing.ONE_INTEGER);
            SubLObject eu_date_before = (SubLObject)sbhl_time_assertion_processing.NIL;
            SubLObject date_point_before = (SubLObject)sbhl_time_assertion_processing.NIL;
            SubLObject eu_date_after = (SubLObject)sbhl_time_assertion_processing.NIL;
            SubLObject date_point_after = (SubLObject)sbhl_time_assertion_processing.NIL;
            if (n.numG((SubLObject)sbhl_time_assertion_processing.ZERO_INTEGER)) {
                eu_date_before = ConsesLow.nth(Numbers.subtract(n, (SubLObject)sbhl_time_assertion_processing.ONE_INTEGER), sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue());
                date_point_before = closest_hl_point_node_at_or_before_end(eu_date_before);
            }
            if (n.numL(date_list_last_position)) {
                eu_date_after = ConsesLow.nth(Numbers.add(n, (SubLObject)sbhl_time_assertion_processing.ONE_INTEGER), sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue());
                date_point_after = closest_hl_point_node_at_or_after_start(eu_date_after);
            }
            if (sbhl_time_assertion_processing.NIL != sbhl_time_utilities.sbhl_temporal_node_p(start)) {
                add_temporal_link((SubLObject)sbhl_time_assertion_processing.$kw20$DEFINITIONAL, (SubLObject)sbhl_time_assertion_processing.$kw26$SUCCESSOR_STRICT, start, end, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
            }
            else if (sbhl_time_assertion_processing.NIL != date_point_before) {
                add_temporal_link((SubLObject)sbhl_time_assertion_processing.$kw20$DEFINITIONAL, (SubLObject)sbhl_time_assertion_processing.$kw26$SUCCESSOR_STRICT, date_point_before, end, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
            }
            if (sbhl_time_assertion_processing.NIL != date_point_after) {
                if (eu_date_after.numE(numeric_date_utilities.succeeding_extended_universal_date(eu_date)) && sbhl_time_assertion_processing.NIL != sbhl_time_utilities.hl_start_p(date_point_after)) {
                    add_temporal_link((SubLObject)sbhl_time_assertion_processing.$kw20$DEFINITIONAL, (SubLObject)sbhl_time_assertion_processing.$kw25$SUCCESSOR, end, date_point_after, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
                }
                else {
                    add_temporal_link((SubLObject)sbhl_time_assertion_processing.$kw20$DEFINITIONAL, (SubLObject)sbhl_time_assertion_processing.$kw26$SUCCESSOR_STRICT, end, date_point_after, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
                }
            }
            if (sbhl_time_assertion_processing.NIL != date_point_after) {
                if (sbhl_time_assertion_processing.NIL != sbhl_time_utilities.sbhl_temporal_node_p(start)) {
                    remove_temporal_link((SubLObject)sbhl_time_assertion_processing.$kw20$DEFINITIONAL, (SubLObject)sbhl_time_assertion_processing.$kw26$SUCCESSOR_STRICT, start, date_point_after, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
                }
                else if (sbhl_time_assertion_processing.NIL != date_point_before) {
                    remove_temporal_link((SubLObject)sbhl_time_assertion_processing.$kw20$DEFINITIONAL, (SubLObject)sbhl_time_assertion_processing.$kw26$SUCCESSOR_STRICT, date_point_before, date_point_after, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
                }
            }
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 15029L)
    public static SubLObject closest_hl_point_node_at_or_after_start(final SubLObject time) {
        SubLObject point = sbhl_time_utilities.hl_start(time);
        if (sbhl_time_assertion_processing.NIL != sbhl_time_utilities.sbhl_temporal_node_p(point)) {
            return point;
        }
        point = sbhl_time_utilities.hl_end(time);
        return (SubLObject)((sbhl_time_assertion_processing.NIL != sbhl_time_utilities.sbhl_temporal_node_p(point)) ? point : sbhl_time_assertion_processing.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 15277L)
    public static SubLObject closest_hl_point_node_at_or_before_end(final SubLObject time) {
        SubLObject point = sbhl_time_utilities.hl_end(time);
        if (sbhl_time_assertion_processing.NIL != sbhl_time_utilities.sbhl_temporal_node_p(point)) {
            return point;
        }
        point = sbhl_time_utilities.hl_start(time);
        return (SubLObject)((sbhl_time_assertion_processing.NIL != sbhl_time_utilities.sbhl_temporal_node_p(point)) ? point : sbhl_time_assertion_processing.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 15524L)
    public static SubLObject add_temporal_link(final SubLObject support, final SubLObject val, final SubLObject before, final SubLObject after, final SubLObject mt) {
        SubLObject link_addedP = (SubLObject)sbhl_time_assertion_processing.NIL;
        if (!before.eql(after) && sbhl_time_assertion_processing.NIL != sbhl_time_utilities.hl_endpoint_p(before) && sbhl_time_assertion_processing.NIL != sbhl_time_utilities.hl_endpoint_p(after)) {
            if (sbhl_time_assertion_processing.NIL != list_utilities.member_eqP(val, (SubLObject)sbhl_time_assertion_processing.$list27)) {
                link_addedP = add_temporal_link_int(support, val, before, after, mt);
            }
            else if (val == sbhl_time_assertion_processing.$kw28$COORDINATE) {
                link_addedP = add_temporal_link_int(support, (SubLObject)sbhl_time_assertion_processing.$kw21$WEAK, before, after, mt);
                link_addedP = (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_assertion_processing.NIL != add_temporal_link_int(support, (SubLObject)sbhl_time_assertion_processing.$kw21$WEAK, after, before, mt) || sbhl_time_assertion_processing.NIL != link_addedP);
            }
            else if (val == sbhl_time_assertion_processing.$kw25$SUCCESSOR) {
                link_addedP = add_temporal_link_int(support, (SubLObject)sbhl_time_assertion_processing.$kw29$STRICT, before, after, mt);
                link_addedP = (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_assertion_processing.NIL != add_temporal_link_int(support, (SubLObject)sbhl_time_assertion_processing.$kw30$WEAK_SUCCESSOR, after, before, mt) || sbhl_time_assertion_processing.NIL != link_addedP);
            }
        }
        return link_addedP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 16348L)
    public static SubLObject remove_temporal_link(final SubLObject support, final SubLObject val, final SubLObject before, final SubLObject after, final SubLObject mt) {
        if (sbhl_time_assertion_processing.NIL != sbhl_time_utilities.hl_endpoint_p(before) && sbhl_time_assertion_processing.NIL != sbhl_time_utilities.hl_endpoint_p(after)) {
            if (sbhl_time_assertion_processing.NIL != list_utilities.member_eqP(val, (SubLObject)sbhl_time_assertion_processing.$list27)) {
                remove_temporal_link_int(support, val, before, after, mt);
            }
            else if (val == sbhl_time_assertion_processing.$kw28$COORDINATE) {
                remove_temporal_link_int(support, (SubLObject)sbhl_time_assertion_processing.$kw21$WEAK, before, after, mt);
                remove_temporal_link_int(support, (SubLObject)sbhl_time_assertion_processing.$kw21$WEAK, after, before, mt);
            }
            else if (val == sbhl_time_assertion_processing.$kw25$SUCCESSOR) {
                remove_temporal_link_int(support, (SubLObject)sbhl_time_assertion_processing.$kw29$STRICT, before, after, mt);
                remove_temporal_link_int(support, (SubLObject)sbhl_time_assertion_processing.$kw30$WEAK_SUCCESSOR, after, before, mt);
            }
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 16991L)
    public static SubLObject add_temporal_link_int(final SubLObject support, final SubLObject val, final SubLObject before, final SubLObject after, final SubLObject mt) {
        if (sbhl_time_assertion_processing.NIL != sbhl_time_utilities.hl_date_point_p(before) || sbhl_time_assertion_processing.NIL != sbhl_time_utilities.hl_date_point_p(after)) {
            return sbhl_time_dates.sbhl_time_dates_add_link_support(support, val, before, after, mt);
        }
        if (sbhl_time_assertion_processing.NIL != existing_temporal_link_supportP(val, before, after, mt)) {
            if (!support.isCons()) {
                add_temporal_link_support(support, val, before, after, mt);
            }
            return (SubLObject)sbhl_time_assertion_processing.NIL;
        }
        sbhl_time_search.add_precedence_link(before, mt, val, after);
        add_temporal_link_support(support, val, before, after, mt);
        return (SubLObject)sbhl_time_assertion_processing.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 17610L)
    public static SubLObject remove_temporal_link_int(final SubLObject support, final SubLObject val, final SubLObject before, final SubLObject after, final SubLObject mt) {
        if (sbhl_time_assertion_processing.NIL != sbhl_time_utilities.hl_date_point_p(before) || sbhl_time_assertion_processing.NIL != sbhl_time_utilities.hl_date_point_p(after)) {
            sbhl_time_dates.sbhl_time_dates_remove_link_support(support, val, before, after, mt);
        }
        else {
            remove_temporal_link_support(support, val, before, after, mt);
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 17979L)
    public static SubLObject existing_temporal_link_supportP(final SubLObject val, final SubLObject before, final SubLObject after, final SubLObject mt) {
        return existing_temporal_link_object_supportP((SubLObject)ConsesLow.list(val, before, after, mt), sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 18162L)
    public static SubLObject existing_temporal_link_object_supportP(final SubLObject link_object, final SubLObject table) {
        final SubLObject value = Hashtables.gethash_without_values(link_object, table, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
        SubLObject cdolist_list_var;
        SubLObject supports = cdolist_list_var = value;
        SubLObject support = (SubLObject)sbhl_time_assertion_processing.NIL;
        support = cdolist_list_var.first();
        while (sbhl_time_assertion_processing.NIL != cdolist_list_var) {
            if (sbhl_time_assertion_processing.NIL != assertion_handles.assertion_p(support) && sbhl_time_assertion_processing.NIL == assertions_high.valid_assertion(support, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED)) {
                supports = Sequences.remove(support, supports, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        }
        if (sbhl_time_assertion_processing.NIL == supports) {
            Hashtables.remhash(link_object, table);
        }
        else if (!value.equal(supports)) {
            Hashtables.sethash(link_object, table, supports);
        }
        return list_utilities.sublisp_boolean(supports);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 18687L)
    public static SubLObject add_temporal_link_support(final SubLObject support, final SubLObject val, final SubLObject before, final SubLObject after, final SubLObject mt) {
        return add_temporal_link_object_support(support, (SubLObject)ConsesLow.list(val, before, after, mt), sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 18874L)
    public static SubLObject add_temporal_link_object_support(final SubLObject support, final SubLObject link_object, final SubLObject table) {
        hash_table_utilities.pushnew_hash(link_object, support, table, Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.EQUAL));
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 19016L)
    public static SubLObject remove_temporal_link_support(final SubLObject support, final SubLObject val, final SubLObject before, final SubLObject after, final SubLObject mt) {
        final SubLObject link = (SubLObject)ConsesLow.list(val, before, after, mt);
        SubLObject supports = Hashtables.gethash_without_values(link, sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue(), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
        SubLObject cdolist_list_var;
        supports = (cdolist_list_var = Sequences.remove(support, supports, Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.EQUAL), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED));
        SubLObject new_support = (SubLObject)sbhl_time_assertion_processing.NIL;
        new_support = cdolist_list_var.first();
        while (sbhl_time_assertion_processing.NIL != cdolist_list_var) {
            if (sbhl_time_assertion_processing.NIL != assertion_handles.assertion_p(new_support) && sbhl_time_assertion_processing.NIL == assertions_high.valid_assertion(new_support, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED)) {
                supports = Sequences.remove(new_support, supports, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            new_support = cdolist_list_var.first();
        }
        if (sbhl_time_assertion_processing.NIL != supports) {
            Hashtables.sethash(link, sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue(), supports);
        }
        else {
            sbhl_time_search.remove_precedence_link(before, mt, val, after);
            Hashtables.remhash(link, sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue());
            if (sbhl_time_assertion_processing.NIL != assertion_handles.assertion_p(support)) {
                consider_removing_definitional_links(before);
                consider_removing_definitional_links(after);
                consider_removing_temporal_point(before);
                consider_removing_temporal_point(after);
            }
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 19914L)
    public static SubLObject consider_removing_temporal_point(final SubLObject temporal_point) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_time_assertion_processing.NIL != sbhl_time_utilities.hl_endpoint_p(temporal_point) && sbhl_time_assertion_processing.NIL == sbhl_time_utilities.sbhl_temporal_node_p(temporal_point) && sbhl_time_assertion_processing.NIL == Hashtables.gethash_without_values(temporal_point, sbhl_time_vars.$sbhl_temporal_link_disjunction_term_table$.getGlobalValue(), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED) && sbhl_time_assertion_processing.NIL == subl_promotions.memberP(temporal_point, sbhl_time_vars.$sbhl_temporal_points_being_removed$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.EQL), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED)) {
            final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_points_being_removed$.currentBinding(thread);
            try {
                sbhl_time_vars.$sbhl_temporal_points_being_removed$.bind((SubLObject)ConsesLow.cons(temporal_point, sbhl_time_vars.$sbhl_temporal_points_being_removed$.getDynamicValue(thread)), thread);
                sbhl_time_utilities.remove_hl_endpoint(temporal_point);
            }
            finally {
                sbhl_time_vars.$sbhl_temporal_points_being_removed$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 20438L)
    public static SubLObject consider_removing_definitional_links(final SubLObject temporal_point) {
        if (sbhl_time_assertion_processing.NIL == sbhl_time_utilities.temporal_link_disjunction_term_p(temporal_point)) {
            if (sbhl_time_assertion_processing.NIL != sbhl_time_utilities.hl_date_point_p(temporal_point)) {
                consider_removing_definitional_links_for_date_point(temporal_point);
            }
            else {
                consider_removing_definitional_links_for_non_date_point(temporal_point);
            }
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 20773L)
    public static SubLObject consider_removing_definitional_links_for_date_point(final SubLObject point) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject eu_date = cycl_utilities.formula_arg1(point, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
        SubLObject before = (SubLObject)sbhl_time_assertion_processing.NIL;
        SubLObject after = (SubLObject)sbhl_time_assertion_processing.NIL;
        SubLObject before_link_tag = (SubLObject)sbhl_time_assertion_processing.NIL;
        SubLObject after_link_tag = (SubLObject)sbhl_time_assertion_processing.NIL;
        SubLObject preceding_link_tag = (SubLObject)sbhl_time_assertion_processing.NIL;
        SubLObject preceding_node = (SubLObject)sbhl_time_assertion_processing.NIL;
        SubLObject succeeding_link_tag = (SubLObject)sbhl_time_assertion_processing.NIL;
        SubLObject succeeding_node = (SubLObject)sbhl_time_assertion_processing.NIL;
        SubLObject do_not_removeP;
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject key;
        SubLObject module;
        SubLObject module_$7;
        SubLObject _prev_bind_0;
        SubLObject d_link;
        SubLObject rest_$8;
        SubLObject direction;
        SubLObject mt_links;
        SubLObject iteration_state;
        SubLObject mt;
        SubLObject tv_links;
        SubLObject iteration_state_$9;
        SubLObject tv;
        SubLObject link_nodes_var;
        SubLObject sol;
        SubLObject set_contents_var;
        SubLObject basis_object;
        SubLObject state;
        SubLObject link_node;
        SubLObject csome_list_var;
        SubLObject link_node2;
        SubLObject rest_$9;
        SubLObject iteration_state_$10;
        for (do_not_removeP = (SubLObject)sbhl_time_assertion_processing.NIL, rest = (SubLObject)sbhl_time_assertion_processing.NIL, rest = sbhl_module_vars.get_sbhl_modules(); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL != rest; rest = rest.rest()) {
            cons = rest.first();
            datum = (current = cons);
            key = (SubLObject)sbhl_time_assertion_processing.NIL;
            module = (SubLObject)sbhl_time_assertion_processing.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_assertion_processing.$list31);
            key = current.first();
            current = (module = current.rest());
            if (sbhl_time_assertion_processing.NIL != sbhl_module_utilities.sbhl_time_module_p(module)) {
                module_$7 = module;
                _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind((sbhl_time_assertion_processing.NIL != module_$7) ? module_$7 : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                    d_link = sbhl_graphs.get_sbhl_graph_link(point, module_$7);
                    if (sbhl_time_assertion_processing.NIL != d_link) {
                        for (rest_$8 = (SubLObject)sbhl_time_assertion_processing.NIL, rest_$8 = sbhl_module_utilities.get_relevant_sbhl_directions(module_$7); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL != rest_$8; rest_$8 = rest_$8.rest()) {
                            direction = rest_$8.first();
                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module_$7);
                            if (sbhl_time_assertion_processing.NIL != mt_links && direction.eql(sbhl_module_utilities.get_sbhl_module_forward_direction(module_$7))) {
                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                    thread.resetMultipleValues();
                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    for (iteration_state_$9 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$9); iteration_state_$9 = dictionary_contents.do_dictionary_contents_next(iteration_state_$9)) {
                                        thread.resetMultipleValues();
                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$9);
                                        link_nodes_var = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (sbhl_time_assertion_processing.NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                            sol = link_nodes_var;
                                            if (sbhl_time_assertion_processing.NIL != set.set_p(sol)) {
                                                set_contents_var = set.do_set_internal(sol);
                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_time_assertion_processing.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                    link_node = set_contents.do_set_contents_next(basis_object, state);
                                                    if (sbhl_time_assertion_processing.NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                        if (sbhl_time_assertion_processing.NIL != after) {
                                                            do_not_removeP = (SubLObject)sbhl_time_assertion_processing.T;
                                                        }
                                                        else {
                                                            after = link_node;
                                                            after_link_tag = sbhl_module_utilities.get_sbhl_module_tag(module_$7);
                                                        }
                                                    }
                                                }
                                            }
                                            else if (sol.isList()) {
                                                if (sbhl_time_assertion_processing.NIL == do_not_removeP) {
                                                    csome_list_var = sol;
                                                    link_node2 = (SubLObject)sbhl_time_assertion_processing.NIL;
                                                    link_node2 = csome_list_var.first();
                                                    while (sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL != csome_list_var) {
                                                        if (sbhl_time_assertion_processing.NIL != after) {
                                                            do_not_removeP = (SubLObject)sbhl_time_assertion_processing.T;
                                                        }
                                                        else {
                                                            after = link_node2;
                                                            after_link_tag = sbhl_module_utilities.get_sbhl_module_tag(module_$7);
                                                        }
                                                        csome_list_var = csome_list_var.rest();
                                                        link_node2 = csome_list_var.first();
                                                    }
                                                }
                                            }
                                            else {
                                                Errors.error((SubLObject)sbhl_time_assertion_processing.$str32$_A_is_neither_SET_P_nor_LISTP_, sol);
                                            }
                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$9);
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                        }
                    }
                }
                finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
                _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind((sbhl_time_assertion_processing.NIL != module_$7) ? module_$7 : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                    d_link = sbhl_graphs.get_sbhl_graph_link(point, module_$7);
                    if (sbhl_time_assertion_processing.NIL != d_link) {
                        for (rest_$9 = (SubLObject)sbhl_time_assertion_processing.NIL, rest_$9 = sbhl_module_utilities.get_relevant_sbhl_directions(module_$7); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL != rest_$9; rest_$9 = rest_$9.rest()) {
                            direction = rest_$9.first();
                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module_$7);
                            if (sbhl_time_assertion_processing.NIL != mt_links && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(module_$7))) {
                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                    thread.resetMultipleValues();
                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    for (iteration_state_$10 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$10); iteration_state_$10 = dictionary_contents.do_dictionary_contents_next(iteration_state_$10)) {
                                        thread.resetMultipleValues();
                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$10);
                                        link_nodes_var = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (sbhl_time_assertion_processing.NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                            sol = link_nodes_var;
                                            if (sbhl_time_assertion_processing.NIL != set.set_p(sol)) {
                                                set_contents_var = set.do_set_internal(sol);
                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_time_assertion_processing.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                    link_node = set_contents.do_set_contents_next(basis_object, state);
                                                    if (sbhl_time_assertion_processing.NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                        if (sbhl_time_assertion_processing.NIL != before) {
                                                            do_not_removeP = (SubLObject)sbhl_time_assertion_processing.T;
                                                        }
                                                        else {
                                                            before = link_node;
                                                            before_link_tag = sbhl_module_utilities.get_sbhl_module_tag(module_$7);
                                                        }
                                                    }
                                                }
                                            }
                                            else if (sol.isList()) {
                                                if (sbhl_time_assertion_processing.NIL == do_not_removeP) {
                                                    csome_list_var = sol;
                                                    link_node2 = (SubLObject)sbhl_time_assertion_processing.NIL;
                                                    link_node2 = csome_list_var.first();
                                                    while (sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL != csome_list_var) {
                                                        if (sbhl_time_assertion_processing.NIL != before) {
                                                            do_not_removeP = (SubLObject)sbhl_time_assertion_processing.T;
                                                        }
                                                        else {
                                                            before = link_node2;
                                                            before_link_tag = sbhl_module_utilities.get_sbhl_module_tag(module_$7);
                                                        }
                                                        csome_list_var = csome_list_var.rest();
                                                        link_node2 = csome_list_var.first();
                                                    }
                                                }
                                            }
                                            else {
                                                Errors.error((SubLObject)sbhl_time_assertion_processing.$str32$_A_is_neither_SET_P_nor_LISTP_, sol);
                                            }
                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$10);
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                        }
                    }
                }
                finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
            }
        }
        if (sbhl_time_assertion_processing.NIL != do_not_removeP || sbhl_time_assertion_processing.NIL == before || sbhl_time_assertion_processing.NIL == after) {
            return (SubLObject)sbhl_time_assertion_processing.NIL;
        }
        final SubLObject before_link = (SubLObject)ConsesLow.list(before_link_tag, before, point, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
        final SubLObject before_supports = Hashtables.gethash_without_values(before_link, sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue(), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
        if (!before_supports.eql((SubLObject)sbhl_time_assertion_processing.$list33)) {
            return (SubLObject)sbhl_time_assertion_processing.NIL;
        }
        final SubLObject after_link = (SubLObject)ConsesLow.list(after_link_tag, point, after, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
        final SubLObject after_supports = Hashtables.gethash_without_values(after_link, sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue(), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
        if (!after_supports.eql((SubLObject)sbhl_time_assertion_processing.$list33)) {
            return (SubLObject)sbhl_time_assertion_processing.NIL;
        }
        SubLObject pcase_var = before_link_tag;
        if (pcase_var.eql((SubLObject)sbhl_time_assertion_processing.$kw29$STRICT)) {
            preceding_link_tag = (SubLObject)sbhl_time_assertion_processing.$kw25$SUCCESSOR;
            preceding_node = before;
        }
        else if (pcase_var.eql((SubLObject)sbhl_time_assertion_processing.$kw26$SUCCESSOR_STRICT)) {
            preceding_link_tag = (SubLObject)sbhl_time_assertion_processing.$kw26$SUCCESSOR_STRICT;
            preceding_node = before;
        }
        pcase_var = after_link_tag;
        if (pcase_var.eql((SubLObject)sbhl_time_assertion_processing.$kw29$STRICT)) {
            succeeding_link_tag = (SubLObject)sbhl_time_assertion_processing.$kw25$SUCCESSOR;
            succeeding_node = after;
        }
        else if (pcase_var.eql((SubLObject)sbhl_time_assertion_processing.$kw26$SUCCESSOR_STRICT)) {
            succeeding_link_tag = (SubLObject)sbhl_time_assertion_processing.$kw26$SUCCESSOR_STRICT;
            succeeding_node = after;
        }
        if (sbhl_time_assertion_processing.NIL != preceding_node && sbhl_time_assertion_processing.NIL != succeeding_node) {
            add_temporal_link((SubLObject)sbhl_time_assertion_processing.$kw20$DEFINITIONAL, (SubLObject)sbhl_time_assertion_processing.$kw26$SUCCESSOR_STRICT, preceding_node, succeeding_node, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
            remove_temporal_link((SubLObject)sbhl_time_assertion_processing.$kw20$DEFINITIONAL, preceding_link_tag, preceding_node, point, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
            remove_temporal_link((SubLObject)sbhl_time_assertion_processing.$kw20$DEFINITIONAL, succeeding_link_tag, point, succeeding_node, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
        }
        else if (sbhl_time_assertion_processing.NIL != preceding_node) {
            remove_temporal_link((SubLObject)sbhl_time_assertion_processing.$kw20$DEFINITIONAL, preceding_link_tag, preceding_node, point, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
        }
        else if (sbhl_time_assertion_processing.NIL != succeeding_node) {
            remove_temporal_link((SubLObject)sbhl_time_assertion_processing.$kw20$DEFINITIONAL, succeeding_link_tag, point, succeeding_node, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
        }
        sbhl_time_vars.$sbhl_extended_universal_date_list$.setGlobalValue(Sequences.remove(eu_date, sbhl_time_vars.$sbhl_extended_universal_date_list$.getGlobalValue(), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED));
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 23594L)
    public static SubLObject link_type_keyword_for_symbol(final SubLObject link_type_symbol) {
        assert sbhl_time_assertion_processing.NIL != Types.symbolp(link_type_symbol) : link_type_symbol;
        if (link_type_symbol.eql((SubLObject)sbhl_time_assertion_processing.$sym35$__)) {
            return (SubLObject)sbhl_time_assertion_processing.$kw21$WEAK;
        }
        if (link_type_symbol.eql((SubLObject)sbhl_time_assertion_processing.$sym36$_)) {
            return (SubLObject)sbhl_time_assertion_processing.$kw29$STRICT;
        }
        if (link_type_symbol.eql((SubLObject)sbhl_time_assertion_processing.$sym37$____)) {
            return (SubLObject)sbhl_time_assertion_processing.$kw30$WEAK_SUCCESSOR;
        }
        if (link_type_symbol.eql((SubLObject)sbhl_time_assertion_processing.$sym38$__)) {
            return (SubLObject)sbhl_time_assertion_processing.$kw26$SUCCESSOR_STRICT;
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 23887L)
    public static SubLObject consider_removing_definitional_links_for_non_date_point(final SubLObject temporal_point) {
        if (sbhl_time_assertion_processing.NIL != sbhl_time_utilities.hl_start_p(temporal_point)) {
            consider_removing_definitional_links_for_non_date_point_start(temporal_point);
        }
        else if (sbhl_time_assertion_processing.NIL != sbhl_time_utilities.hl_end_p(temporal_point)) {
            consider_removing_definitional_links_for_non_date_point_end(temporal_point);
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 24228L)
    public static SubLObject consider_removing_definitional_links_for_non_date_point_start(final SubLObject before) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject after = (SubLObject)sbhl_time_assertion_processing.NIL;
        SubLObject after_link_tag = (SubLObject)sbhl_time_assertion_processing.NIL;
        SubLObject do_not_removeP;
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject key;
        SubLObject module;
        SubLObject module_$12;
        SubLObject _prev_bind_0;
        SubLObject d_link;
        SubLObject rest_$13;
        SubLObject direction;
        SubLObject mt_links;
        SubLObject iteration_state;
        SubLObject mt;
        SubLObject tv_links;
        SubLObject iteration_state_$14;
        SubLObject tv;
        SubLObject link_nodes_var;
        SubLObject sol;
        SubLObject set_contents_var;
        SubLObject basis_object;
        SubLObject state;
        SubLObject link_node;
        SubLObject csome_list_var;
        SubLObject link_node2;
        SubLObject rest_$14;
        SubLObject iteration_state_$15;
        for (do_not_removeP = (SubLObject)sbhl_time_assertion_processing.NIL, rest = (SubLObject)sbhl_time_assertion_processing.NIL, rest = sbhl_module_vars.get_sbhl_modules(); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL != rest; rest = rest.rest()) {
            cons = rest.first();
            datum = (current = cons);
            key = (SubLObject)sbhl_time_assertion_processing.NIL;
            module = (SubLObject)sbhl_time_assertion_processing.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_assertion_processing.$list31);
            key = current.first();
            current = (module = current.rest());
            if (sbhl_time_assertion_processing.NIL != sbhl_module_utilities.sbhl_time_module_p(module)) {
                module_$12 = module;
                _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind((sbhl_time_assertion_processing.NIL != module_$12) ? module_$12 : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                    d_link = sbhl_graphs.get_sbhl_graph_link(before, module_$12);
                    if (sbhl_time_assertion_processing.NIL != d_link) {
                        for (rest_$13 = (SubLObject)sbhl_time_assertion_processing.NIL, rest_$13 = sbhl_module_utilities.get_relevant_sbhl_directions(module_$12); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL != rest_$13; rest_$13 = rest_$13.rest()) {
                            direction = rest_$13.first();
                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module_$12);
                            if (sbhl_time_assertion_processing.NIL != mt_links && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(module_$12))) {
                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                    thread.resetMultipleValues();
                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    for (iteration_state_$14 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$14); iteration_state_$14 = dictionary_contents.do_dictionary_contents_next(iteration_state_$14)) {
                                        thread.resetMultipleValues();
                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$14);
                                        link_nodes_var = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (sbhl_time_assertion_processing.NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                            sol = link_nodes_var;
                                            if (sbhl_time_assertion_processing.NIL != set.set_p(sol)) {
                                                set_contents_var = set.do_set_internal(sol);
                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_time_assertion_processing.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                    link_node = set_contents.do_set_contents_next(basis_object, state);
                                                    if (sbhl_time_assertion_processing.NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                        do_not_removeP = (SubLObject)sbhl_time_assertion_processing.T;
                                                    }
                                                }
                                            }
                                            else if (sol.isList()) {
                                                if (sbhl_time_assertion_processing.NIL == do_not_removeP) {
                                                    csome_list_var = sol;
                                                    link_node2 = (SubLObject)sbhl_time_assertion_processing.NIL;
                                                    link_node2 = csome_list_var.first();
                                                    while (sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL != csome_list_var) {
                                                        do_not_removeP = (SubLObject)sbhl_time_assertion_processing.T;
                                                        csome_list_var = csome_list_var.rest();
                                                        link_node2 = csome_list_var.first();
                                                    }
                                                }
                                            }
                                            else {
                                                Errors.error((SubLObject)sbhl_time_assertion_processing.$str32$_A_is_neither_SET_P_nor_LISTP_, sol);
                                            }
                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$14);
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                        }
                    }
                }
                finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
                _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind((sbhl_time_assertion_processing.NIL != module_$12) ? module_$12 : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                    d_link = sbhl_graphs.get_sbhl_graph_link(before, module_$12);
                    if (sbhl_time_assertion_processing.NIL != d_link) {
                        for (rest_$14 = (SubLObject)sbhl_time_assertion_processing.NIL, rest_$14 = sbhl_module_utilities.get_relevant_sbhl_directions(module_$12); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL != rest_$14; rest_$14 = rest_$14.rest()) {
                            direction = rest_$14.first();
                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module_$12);
                            if (sbhl_time_assertion_processing.NIL != mt_links && direction.eql(sbhl_module_utilities.get_sbhl_module_forward_direction(module_$12))) {
                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                    thread.resetMultipleValues();
                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    for (iteration_state_$15 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$15); iteration_state_$15 = dictionary_contents.do_dictionary_contents_next(iteration_state_$15)) {
                                        thread.resetMultipleValues();
                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$15);
                                        link_nodes_var = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (sbhl_time_assertion_processing.NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                            sol = link_nodes_var;
                                            if (sbhl_time_assertion_processing.NIL != set.set_p(sol)) {
                                                set_contents_var = set.do_set_internal(sol);
                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_time_assertion_processing.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                    link_node = set_contents.do_set_contents_next(basis_object, state);
                                                    if (sbhl_time_assertion_processing.NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                        if (sbhl_time_assertion_processing.NIL != after) {
                                                            do_not_removeP = (SubLObject)sbhl_time_assertion_processing.T;
                                                        }
                                                        else {
                                                            after = link_node;
                                                            after_link_tag = sbhl_module_utilities.get_sbhl_module_tag(module_$12);
                                                        }
                                                    }
                                                }
                                            }
                                            else if (sol.isList()) {
                                                if (sbhl_time_assertion_processing.NIL == do_not_removeP) {
                                                    csome_list_var = sol;
                                                    link_node2 = (SubLObject)sbhl_time_assertion_processing.NIL;
                                                    link_node2 = csome_list_var.first();
                                                    while (sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL != csome_list_var) {
                                                        if (sbhl_time_assertion_processing.NIL != after) {
                                                            do_not_removeP = (SubLObject)sbhl_time_assertion_processing.T;
                                                        }
                                                        else {
                                                            after = link_node2;
                                                            after_link_tag = sbhl_module_utilities.get_sbhl_module_tag(module_$12);
                                                        }
                                                        csome_list_var = csome_list_var.rest();
                                                        link_node2 = csome_list_var.first();
                                                    }
                                                }
                                            }
                                            else {
                                                Errors.error((SubLObject)sbhl_time_assertion_processing.$str32$_A_is_neither_SET_P_nor_LISTP_, sol);
                                            }
                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$15);
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                        }
                    }
                }
                finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
            }
        }
        if (sbhl_time_assertion_processing.NIL != do_not_removeP || sbhl_time_assertion_processing.NIL == after) {
            return (SubLObject)sbhl_time_assertion_processing.NIL;
        }
        final SubLObject after_link = (SubLObject)ConsesLow.list(after_link_tag, before, after, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
        final SubLObject supports = Hashtables.gethash_without_values(after_link, sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue(), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
        if (!supports.equal((SubLObject)sbhl_time_assertion_processing.$list33)) {
            return (SubLObject)sbhl_time_assertion_processing.NIL;
        }
        remove_temporal_link((SubLObject)sbhl_time_assertion_processing.$kw20$DEFINITIONAL, after_link_tag, before, after, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 25212L)
    public static SubLObject consider_removing_definitional_links_for_non_date_point_end(final SubLObject after) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject before = (SubLObject)sbhl_time_assertion_processing.NIL;
        SubLObject before_link_tag = (SubLObject)sbhl_time_assertion_processing.NIL;
        SubLObject do_not_removeP;
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject key;
        SubLObject module;
        SubLObject module_$17;
        SubLObject _prev_bind_0;
        SubLObject d_link;
        SubLObject rest_$18;
        SubLObject direction;
        SubLObject mt_links;
        SubLObject iteration_state;
        SubLObject mt;
        SubLObject tv_links;
        SubLObject iteration_state_$19;
        SubLObject tv;
        SubLObject link_nodes_var;
        SubLObject sol;
        SubLObject set_contents_var;
        SubLObject basis_object;
        SubLObject state;
        SubLObject link_node;
        SubLObject csome_list_var;
        SubLObject link_node2;
        SubLObject rest_$19;
        SubLObject iteration_state_$20;
        for (do_not_removeP = (SubLObject)sbhl_time_assertion_processing.NIL, rest = (SubLObject)sbhl_time_assertion_processing.NIL, rest = sbhl_module_vars.get_sbhl_modules(); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL != rest; rest = rest.rest()) {
            cons = rest.first();
            datum = (current = cons);
            key = (SubLObject)sbhl_time_assertion_processing.NIL;
            module = (SubLObject)sbhl_time_assertion_processing.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_assertion_processing.$list31);
            key = current.first();
            current = (module = current.rest());
            if (sbhl_time_assertion_processing.NIL != sbhl_module_utilities.sbhl_time_module_p(module)) {
                module_$17 = module;
                _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind((sbhl_time_assertion_processing.NIL != module_$17) ? module_$17 : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                    d_link = sbhl_graphs.get_sbhl_graph_link(after, module_$17);
                    if (sbhl_time_assertion_processing.NIL != d_link) {
                        for (rest_$18 = (SubLObject)sbhl_time_assertion_processing.NIL, rest_$18 = sbhl_module_utilities.get_relevant_sbhl_directions(module_$17); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL != rest_$18; rest_$18 = rest_$18.rest()) {
                            direction = rest_$18.first();
                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module_$17);
                            if (sbhl_time_assertion_processing.NIL != mt_links && direction.eql(sbhl_module_utilities.get_sbhl_module_forward_direction(module_$17))) {
                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                    thread.resetMultipleValues();
                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    for (iteration_state_$19 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$19); iteration_state_$19 = dictionary_contents.do_dictionary_contents_next(iteration_state_$19)) {
                                        thread.resetMultipleValues();
                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$19);
                                        link_nodes_var = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (sbhl_time_assertion_processing.NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                            sol = link_nodes_var;
                                            if (sbhl_time_assertion_processing.NIL != set.set_p(sol)) {
                                                set_contents_var = set.do_set_internal(sol);
                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_time_assertion_processing.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                    link_node = set_contents.do_set_contents_next(basis_object, state);
                                                    if (sbhl_time_assertion_processing.NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                        do_not_removeP = (SubLObject)sbhl_time_assertion_processing.T;
                                                    }
                                                }
                                            }
                                            else if (sol.isList()) {
                                                if (sbhl_time_assertion_processing.NIL == do_not_removeP) {
                                                    csome_list_var = sol;
                                                    link_node2 = (SubLObject)sbhl_time_assertion_processing.NIL;
                                                    link_node2 = csome_list_var.first();
                                                    while (sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL != csome_list_var) {
                                                        do_not_removeP = (SubLObject)sbhl_time_assertion_processing.T;
                                                        csome_list_var = csome_list_var.rest();
                                                        link_node2 = csome_list_var.first();
                                                    }
                                                }
                                            }
                                            else {
                                                Errors.error((SubLObject)sbhl_time_assertion_processing.$str32$_A_is_neither_SET_P_nor_LISTP_, sol);
                                            }
                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$19);
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                        }
                    }
                }
                finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
                _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind((sbhl_time_assertion_processing.NIL != module_$17) ? module_$17 : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                    d_link = sbhl_graphs.get_sbhl_graph_link(after, module_$17);
                    if (sbhl_time_assertion_processing.NIL != d_link) {
                        for (rest_$19 = (SubLObject)sbhl_time_assertion_processing.NIL, rest_$19 = sbhl_module_utilities.get_relevant_sbhl_directions(module_$17); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL != rest_$19; rest_$19 = rest_$19.rest()) {
                            direction = rest_$19.first();
                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module_$17);
                            if (sbhl_time_assertion_processing.NIL != mt_links && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(module_$17))) {
                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                    thread.resetMultipleValues();
                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    for (iteration_state_$20 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$20); iteration_state_$20 = dictionary_contents.do_dictionary_contents_next(iteration_state_$20)) {
                                        thread.resetMultipleValues();
                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$20);
                                        link_nodes_var = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (sbhl_time_assertion_processing.NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                            sol = link_nodes_var;
                                            if (sbhl_time_assertion_processing.NIL != set.set_p(sol)) {
                                                set_contents_var = set.do_set_internal(sol);
                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_time_assertion_processing.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                    link_node = set_contents.do_set_contents_next(basis_object, state);
                                                    if (sbhl_time_assertion_processing.NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                                        if (sbhl_time_assertion_processing.NIL != before) {
                                                            do_not_removeP = (SubLObject)sbhl_time_assertion_processing.T;
                                                        }
                                                        else {
                                                            before = link_node;
                                                            before_link_tag = sbhl_module_utilities.get_sbhl_module_tag(module_$17);
                                                        }
                                                    }
                                                }
                                            }
                                            else if (sol.isList()) {
                                                if (sbhl_time_assertion_processing.NIL == do_not_removeP) {
                                                    csome_list_var = sol;
                                                    link_node2 = (SubLObject)sbhl_time_assertion_processing.NIL;
                                                    link_node2 = csome_list_var.first();
                                                    while (sbhl_time_assertion_processing.NIL == do_not_removeP && sbhl_time_assertion_processing.NIL != csome_list_var) {
                                                        if (sbhl_time_assertion_processing.NIL != before) {
                                                            do_not_removeP = (SubLObject)sbhl_time_assertion_processing.T;
                                                        }
                                                        else {
                                                            before = link_node2;
                                                            before_link_tag = sbhl_module_utilities.get_sbhl_module_tag(module_$17);
                                                        }
                                                        csome_list_var = csome_list_var.rest();
                                                        link_node2 = csome_list_var.first();
                                                    }
                                                }
                                            }
                                            else {
                                                Errors.error((SubLObject)sbhl_time_assertion_processing.$str32$_A_is_neither_SET_P_nor_LISTP_, sol);
                                            }
                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$20);
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                        }
                    }
                }
                finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
            }
        }
        if (sbhl_time_assertion_processing.NIL != do_not_removeP || sbhl_time_assertion_processing.NIL == before) {
            return (SubLObject)sbhl_time_assertion_processing.NIL;
        }
        final SubLObject before_link = (SubLObject)ConsesLow.list(before_link_tag, before, after, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
        final SubLObject supports = Hashtables.gethash_without_values(before_link, sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue(), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
        if (!supports.equal((SubLObject)sbhl_time_assertion_processing.$list33)) {
            return (SubLObject)sbhl_time_assertion_processing.NIL;
        }
        remove_temporal_link((SubLObject)sbhl_time_assertion_processing.$kw20$DEFINITIONAL, before_link_tag, before, after, sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue());
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 26208L)
    public static SubLObject add_temporal_quasi_link_conjunction_negation(final SubLObject support, final SubLObject conjuncts, final SubLObject mt) {
        if (sbhl_time_assertion_processing.NIL == sbhl_time_query_processing.date_date_quasi_link_p(conjuncts.first())) {
            final SubLObject disjuncts = sbhl_time_query_processing.temporal_link_conjunction_negation(conjuncts);
            if (sbhl_time_assertion_processing.NIL != list_utilities.singletonP(disjuncts)) {
                add_temporal_quasi_link_conjunction(support, disjuncts, mt);
            }
            else {
                add_temporal_link_disjunction(support, disjuncts, mt);
            }
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 26638L)
    public static SubLObject remove_temporal_quasi_link_conjunction_negation(final SubLObject support, final SubLObject conjuncts, final SubLObject mt) {
        final SubLObject disjuncts = sbhl_time_query_processing.temporal_link_conjunction_negation(conjuncts);
        if (sbhl_time_assertion_processing.NIL != list_utilities.singletonP(disjuncts)) {
            remove_temporal_quasi_link_conjunction(support, disjuncts, mt);
        }
        else {
            remove_temporal_link_disjunction(support, disjuncts, mt);
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 26964L)
    public static SubLObject add_temporal_link_disjunction(final SubLObject support, final SubLObject disjuncts, final SubLObject mt) {
        final SubLObject link_disjunction = (SubLObject)ConsesLow.list(disjuncts, mt);
        if (sbhl_time_assertion_processing.NIL != existing_temporal_link_disjunction_supportP(link_disjunction)) {
            add_temporal_link_disjunction_support(support, link_disjunction);
        }
        else {
            add_temporal_link_disjunction_support(support, link_disjunction);
            add_note_of_temporal_link_disjunction_terms(link_disjunction);
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 27383L)
    public static SubLObject remove_temporal_link_disjunction(final SubLObject support, final SubLObject disjuncts, final SubLObject mt) {
        remove_temporal_link_disjunction_support(support, (SubLObject)ConsesLow.list(disjuncts, mt));
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 27542L)
    public static SubLObject existing_temporal_link_disjunction_supportP(final SubLObject link_disjunction) {
        return existing_temporal_link_object_supportP(link_disjunction, sbhl_time_vars.$sbhl_temporal_link_disjunction_support_table$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 27736L)
    public static SubLObject add_temporal_link_disjunction_support(final SubLObject support, final SubLObject link_disjunction) {
        add_temporal_link_object_support(support, link_disjunction, sbhl_time_vars.$sbhl_temporal_link_disjunction_support_table$.getGlobalValue());
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 27940L)
    public static SubLObject remove_temporal_link_disjunction_support(final SubLObject support, final SubLObject link_disjunction) {
        SubLObject supports = Hashtables.gethash_without_values(link_disjunction, sbhl_time_vars.$sbhl_temporal_link_disjunction_support_table$.getGlobalValue(), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
        SubLObject cdolist_list_var;
        supports = (cdolist_list_var = Sequences.remove(support, supports, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED));
        SubLObject new_support = (SubLObject)sbhl_time_assertion_processing.NIL;
        new_support = cdolist_list_var.first();
        while (sbhl_time_assertion_processing.NIL != cdolist_list_var) {
            if (sbhl_time_assertion_processing.NIL == assertions_high.valid_assertion(new_support, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED)) {
                supports = Sequences.remove(new_support, supports, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            new_support = cdolist_list_var.first();
        }
        if (sbhl_time_assertion_processing.NIL != supports) {
            Hashtables.sethash(link_disjunction, sbhl_time_vars.$sbhl_temporal_link_disjunction_support_table$.getGlobalValue(), supports);
        }
        else {
            Hashtables.remhash(link_disjunction, sbhl_time_vars.$sbhl_temporal_link_disjunction_support_table$.getGlobalValue());
            remove_note_of_temporal_link_disjunction_terms(link_disjunction);
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 28596L)
    public static SubLObject add_note_of_temporal_link_disjunction_terms(final SubLObject link_disjunction) {
        final SubLObject disjuncts = link_disjunction.first();
        SubLObject terms = (SubLObject)sbhl_time_assertion_processing.NIL;
        SubLObject cdolist_list_var = disjuncts;
        SubLObject disjunct = (SubLObject)sbhl_time_assertion_processing.NIL;
        disjunct = cdolist_list_var.first();
        while (sbhl_time_assertion_processing.NIL != cdolist_list_var) {
            final SubLObject before = find_or_create_hl_temporal_point(conses_high.second(disjunct));
            final SubLObject after = find_or_create_hl_temporal_point(conses_high.third(disjunct));
            SubLObject item_var = before;
            if (sbhl_time_assertion_processing.NIL == conses_high.member(item_var, terms, Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.EQL), Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.IDENTITY))) {
                terms = (SubLObject)ConsesLow.cons(item_var, terms);
            }
            item_var = after;
            if (sbhl_time_assertion_processing.NIL == conses_high.member(item_var, terms, Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.EQL), Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.IDENTITY))) {
                terms = (SubLObject)ConsesLow.cons(item_var, terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            disjunct = cdolist_list_var.first();
        }
        cdolist_list_var = terms;
        SubLObject v_term = (SubLObject)sbhl_time_assertion_processing.NIL;
        v_term = cdolist_list_var.first();
        while (sbhl_time_assertion_processing.NIL != cdolist_list_var) {
            add_temporal_link_disjunction_term_support(link_disjunction, v_term);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 29101L)
    public static SubLObject remove_note_of_temporal_link_disjunction_terms(final SubLObject link_disjunction) {
        final SubLObject disjuncts = link_disjunction.first();
        SubLObject terms = (SubLObject)sbhl_time_assertion_processing.NIL;
        SubLObject cdolist_list_var = disjuncts;
        SubLObject disjunct = (SubLObject)sbhl_time_assertion_processing.NIL;
        disjunct = cdolist_list_var.first();
        while (sbhl_time_assertion_processing.NIL != cdolist_list_var) {
            final SubLObject before = find_hl_temporal_point(conses_high.second(disjunct));
            final SubLObject after = find_hl_temporal_point(conses_high.third(disjunct));
            if (sbhl_time_assertion_processing.NIL != before) {
                final SubLObject item_var = before;
                if (sbhl_time_assertion_processing.NIL == conses_high.member(item_var, terms, Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.EQL), Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.IDENTITY))) {
                    terms = (SubLObject)ConsesLow.cons(item_var, terms);
                }
            }
            if (sbhl_time_assertion_processing.NIL != after) {
                final SubLObject item_var = after;
                if (sbhl_time_assertion_processing.NIL == conses_high.member(item_var, terms, Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.EQL), Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.IDENTITY))) {
                    terms = (SubLObject)ConsesLow.cons(item_var, terms);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            disjunct = cdolist_list_var.first();
        }
        cdolist_list_var = terms;
        SubLObject v_term = (SubLObject)sbhl_time_assertion_processing.NIL;
        v_term = cdolist_list_var.first();
        while (sbhl_time_assertion_processing.NIL != cdolist_list_var) {
            remove_temporal_link_disjunction_term_support(link_disjunction, v_term);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 29641L)
    public static SubLObject add_temporal_link_disjunction_term_support(final SubLObject support, final SubLObject temporal_point) {
        add_temporal_link_object_support(support, temporal_point, sbhl_time_vars.$sbhl_temporal_link_disjunction_term_table$.getGlobalValue());
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 29843L)
    public static SubLObject remove_temporal_link_disjunction_term_support(final SubLObject support, final SubLObject temporal_point) {
        SubLObject supports = Hashtables.gethash_without_values(temporal_point, sbhl_time_vars.$sbhl_temporal_link_disjunction_term_table$.getGlobalValue(), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
        supports = Sequences.remove(support, supports, Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.EQUAL), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
        if (sbhl_time_assertion_processing.NIL != supports) {
            Hashtables.sethash(temporal_point, sbhl_time_vars.$sbhl_temporal_link_disjunction_term_table$.getGlobalValue(), supports);
        }
        else {
            Hashtables.remhash(temporal_point, sbhl_time_vars.$sbhl_temporal_link_disjunction_term_table$.getGlobalValue());
            consider_removing_definitional_links(temporal_point);
            consider_removing_temporal_point(temporal_point);
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 30399L)
    public static SubLObject remove_fort_from_sbhl_temporality_structures(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sbhl_time_assertion_processing.NIL != forts.fort_p(fort) : fort;
        if (sbhl_time_assertion_processing.NIL != sbhl_time_utilities.time_stored_in_hl_p(fort)) {
            final SubLObject hl_start = sbhl_time_utilities.find_hl_start(fort);
            final SubLObject hl_end = sbhl_time_utilities.find_hl_end(fort);
            if (sbhl_time_assertion_processing.NIL == subl_promotions.memberP(hl_start, sbhl_time_vars.$sbhl_temporal_points_being_removed$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.EQL), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED)) {
                final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_points_being_removed$.currentBinding(thread);
                try {
                    sbhl_time_vars.$sbhl_temporal_points_being_removed$.bind((SubLObject)ConsesLow.cons(hl_start, sbhl_time_vars.$sbhl_temporal_points_being_removed$.getDynamicValue(thread)), thread);
                    SubLObject cdolist_list_var;
                    final SubLObject assertions = cdolist_list_var = temporal_point_assertion_supports(hl_start);
                    SubLObject assertion = (SubLObject)sbhl_time_assertion_processing.NIL;
                    assertion = cdolist_list_var.first();
                    while (sbhl_time_assertion_processing.NIL != cdolist_list_var) {
                        remove_temporal_relation((SubLObject)sbhl_time_assertion_processing.NIL, assertion, (SubLObject)sbhl_time_assertion_processing.NIL);
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                    }
                }
                finally {
                    sbhl_time_vars.$sbhl_temporal_points_being_removed$.rebind(_prev_bind_0, thread);
                }
            }
            sbhl_time_utilities.remove_hl_start(fort, hl_start);
            if (sbhl_time_assertion_processing.NIL == subl_promotions.memberP(hl_end, sbhl_time_vars.$sbhl_temporal_points_being_removed$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.EQL), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED)) {
                final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporal_points_being_removed$.currentBinding(thread);
                try {
                    sbhl_time_vars.$sbhl_temporal_points_being_removed$.bind((SubLObject)ConsesLow.cons(hl_end, sbhl_time_vars.$sbhl_temporal_points_being_removed$.getDynamicValue(thread)), thread);
                    SubLObject cdolist_list_var;
                    final SubLObject assertions = cdolist_list_var = temporal_point_assertion_supports(hl_end);
                    SubLObject assertion = (SubLObject)sbhl_time_assertion_processing.NIL;
                    assertion = cdolist_list_var.first();
                    while (sbhl_time_assertion_processing.NIL != cdolist_list_var) {
                        remove_temporal_relation((SubLObject)sbhl_time_assertion_processing.NIL, assertion, (SubLObject)sbhl_time_assertion_processing.NIL);
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                    }
                }
                finally {
                    sbhl_time_vars.$sbhl_temporal_points_being_removed$.rebind(_prev_bind_0, thread);
                }
            }
            sbhl_time_utilities.remove_hl_end(fort, hl_end);
        }
        SubLObject cdolist_list_var2 = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = (SubLObject)sbhl_time_assertion_processing.NIL;
        cons = cdolist_list_var2.first();
        while (sbhl_time_assertion_processing.NIL != cdolist_list_var2) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)sbhl_time_assertion_processing.NIL;
            SubLObject module = (SubLObject)sbhl_time_assertion_processing.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_assertion_processing.$list31);
            key = current.first();
            current = (module = current.rest());
            if (sbhl_time_assertion_processing.NIL != sbhl_module_utilities.sbhl_time_module_p(module)) {
                final SubLObject module_$22 = module;
                final SubLObject pred = sbhl_module_vars.get_sbhl_module_link_pred(module_$22);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sbhl_time_assertion_processing.$sym40$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(sbhl_time_assertion_processing.$const41$EverythingPSC, thread);
                    SubLObject pred_var = pred;
                    if (sbhl_time_assertion_processing.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, (SubLObject)sbhl_time_assertion_processing.ONE_INTEGER, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, (SubLObject)sbhl_time_assertion_processing.ONE_INTEGER, pred_var);
                        SubLObject done_var = (SubLObject)sbhl_time_assertion_processing.NIL;
                        final SubLObject token_var = (SubLObject)sbhl_time_assertion_processing.NIL;
                        while (sbhl_time_assertion_processing.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (sbhl_time_assertion_processing.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)sbhl_time_assertion_processing.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sbhl_time_assertion_processing.$kw42$GAF, (SubLObject)sbhl_time_assertion_processing.NIL, (SubLObject)sbhl_time_assertion_processing.NIL);
                                    SubLObject done_var_$23 = (SubLObject)sbhl_time_assertion_processing.NIL;
                                    final SubLObject token_var_$24 = (SubLObject)sbhl_time_assertion_processing.NIL;
                                    while (sbhl_time_assertion_processing.NIL == done_var_$23) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$24);
                                        final SubLObject valid_$25 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$24.eql(assertion2));
                                        if (sbhl_time_assertion_processing.NIL != valid_$25) {
                                            remove_temporal_relation((SubLObject)sbhl_time_assertion_processing.NIL, assertion2, (SubLObject)sbhl_time_assertion_processing.NIL);
                                        }
                                        done_var_$23 = (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_assertion_processing.NIL == valid_$25);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sbhl_time_assertion_processing.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (sbhl_time_assertion_processing.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_assertion_processing.NIL == valid);
                        }
                    }
                    pred_var = pred;
                    if (sbhl_time_assertion_processing.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, (SubLObject)sbhl_time_assertion_processing.TWO_INTEGER, pred_var)) {
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, (SubLObject)sbhl_time_assertion_processing.TWO_INTEGER, pred_var);
                        SubLObject done_var = (SubLObject)sbhl_time_assertion_processing.NIL;
                        final SubLObject token_var = (SubLObject)sbhl_time_assertion_processing.NIL;
                        while (sbhl_time_assertion_processing.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (sbhl_time_assertion_processing.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)sbhl_time_assertion_processing.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)sbhl_time_assertion_processing.$kw42$GAF, (SubLObject)sbhl_time_assertion_processing.NIL, (SubLObject)sbhl_time_assertion_processing.NIL);
                                    SubLObject done_var_$24 = (SubLObject)sbhl_time_assertion_processing.NIL;
                                    final SubLObject token_var_$25 = (SubLObject)sbhl_time_assertion_processing.NIL;
                                    while (sbhl_time_assertion_processing.NIL == done_var_$24) {
                                        final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$25);
                                        final SubLObject valid_$26 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$25.eql(assertion2));
                                        if (sbhl_time_assertion_processing.NIL != valid_$26) {
                                            remove_temporal_relation((SubLObject)sbhl_time_assertion_processing.NIL, assertion2, (SubLObject)sbhl_time_assertion_processing.NIL);
                                        }
                                        done_var_$24 = (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_assertion_processing.NIL == valid_$26);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sbhl_time_assertion_processing.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        if (sbhl_time_assertion_processing.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(sbhl_time_assertion_processing.NIL == valid);
                        }
                    }
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            cons = cdolist_list_var2.first();
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 31735L)
    public static SubLObject temporal_point_assertion_supports(final SubLObject point) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject link_disjunctions = Hashtables.gethash_without_values(point, sbhl_time_vars.$sbhl_temporal_link_disjunction_term_table$.getGlobalValue(), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
        SubLObject assertions = (SubLObject)sbhl_time_assertion_processing.NIL;
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = (SubLObject)sbhl_time_assertion_processing.NIL;
        cons = cdolist_list_var.first();
        while (sbhl_time_assertion_processing.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)sbhl_time_assertion_processing.NIL;
            SubLObject module = (SubLObject)sbhl_time_assertion_processing.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_time_assertion_processing.$list31);
            key = current.first();
            current = (module = current.rest());
            if (sbhl_time_assertion_processing.NIL != sbhl_module_utilities.sbhl_time_module_p(module)) {
                final SubLObject module_$31 = module;
                final SubLObject tag = sbhl_module_utilities.get_sbhl_module_tag(module_$31);
                SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind((sbhl_time_assertion_processing.NIL != module_$31) ? module_$31 : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(point, module_$31);
                    if (sbhl_time_assertion_processing.NIL != d_link) {
                        SubLObject cdolist_list_var_$32 = sbhl_module_utilities.get_relevant_sbhl_directions(module_$31);
                        SubLObject direction = (SubLObject)sbhl_time_assertion_processing.NIL;
                        direction = cdolist_list_var_$32.first();
                        while (sbhl_time_assertion_processing.NIL != cdolist_list_var_$32) {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module_$31);
                            if (sbhl_time_assertion_processing.NIL != mt_links && direction.eql(sbhl_module_utilities.get_sbhl_module_forward_direction(module_$31))) {
                                SubLObject iteration_state;
                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); sbhl_time_assertion_processing.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                    thread.resetMultipleValues();
                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    final SubLObject tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    SubLObject iteration_state_$33;
                                    for (iteration_state_$33 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); sbhl_time_assertion_processing.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$33); iteration_state_$33 = dictionary_contents.do_dictionary_contents_next(iteration_state_$33)) {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$33);
                                        final SubLObject link_nodes_var = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (sbhl_time_assertion_processing.NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                            final SubLObject sol = link_nodes_var;
                                            if (sbhl_time_assertion_processing.NIL != set.set_p(sol)) {
                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject after;
                                                SubLObject cdolist_list_var_$33;
                                                SubLObject supports;
                                                SubLObject support;
                                                SubLObject item_var;
                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_time_assertion_processing.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_time_assertion_processing.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                    after = set_contents.do_set_contents_next(basis_object, state);
                                                    if (sbhl_time_assertion_processing.NIL != set_contents.do_set_contents_element_validP(state, after)) {
                                                        supports = (cdolist_list_var_$33 = Hashtables.gethash_without_values((SubLObject)ConsesLow.list(tag, point, after, mt), sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue(), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED));
                                                        support = (SubLObject)sbhl_time_assertion_processing.NIL;
                                                        support = cdolist_list_var_$33.first();
                                                        while (sbhl_time_assertion_processing.NIL != cdolist_list_var_$33) {
                                                            if (sbhl_time_assertion_processing.NIL != assertions_high.valid_assertion(support, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED)) {
                                                                item_var = support;
                                                                if (sbhl_time_assertion_processing.NIL == conses_high.member(item_var, assertions, Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.EQL), Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.IDENTITY))) {
                                                                    assertions = (SubLObject)ConsesLow.cons(item_var, assertions);
                                                                }
                                                            }
                                                            cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                                                            support = cdolist_list_var_$33.first();
                                                        }
                                                    }
                                                }
                                            }
                                            else if (sol.isList()) {
                                                SubLObject csome_list_var = sol;
                                                SubLObject after2 = (SubLObject)sbhl_time_assertion_processing.NIL;
                                                after2 = csome_list_var.first();
                                                while (sbhl_time_assertion_processing.NIL != csome_list_var) {
                                                    SubLObject cdolist_list_var_$34;
                                                    final SubLObject supports2 = cdolist_list_var_$34 = Hashtables.gethash_without_values((SubLObject)ConsesLow.list(tag, point, after2, mt), sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue(), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
                                                    SubLObject support2 = (SubLObject)sbhl_time_assertion_processing.NIL;
                                                    support2 = cdolist_list_var_$34.first();
                                                    while (sbhl_time_assertion_processing.NIL != cdolist_list_var_$34) {
                                                        if (sbhl_time_assertion_processing.NIL != assertions_high.valid_assertion(support2, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED)) {
                                                            final SubLObject item_var2 = support2;
                                                            if (sbhl_time_assertion_processing.NIL == conses_high.member(item_var2, assertions, Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.EQL), Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.IDENTITY))) {
                                                                assertions = (SubLObject)ConsesLow.cons(item_var2, assertions);
                                                            }
                                                        }
                                                        cdolist_list_var_$34 = cdolist_list_var_$34.rest();
                                                        support2 = cdolist_list_var_$34.first();
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    after2 = csome_list_var.first();
                                                }
                                            }
                                            else {
                                                Errors.error((SubLObject)sbhl_time_assertion_processing.$str32$_A_is_neither_SET_P_nor_LISTP_, sol);
                                            }
                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$33);
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                            cdolist_list_var_$32 = cdolist_list_var_$32.rest();
                            direction = cdolist_list_var_$32.first();
                        }
                    }
                }
                finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
                _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind((sbhl_time_assertion_processing.NIL != module_$31) ? module_$31 : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(point, module_$31);
                    if (sbhl_time_assertion_processing.NIL != d_link) {
                        SubLObject cdolist_list_var_$35 = sbhl_module_utilities.get_relevant_sbhl_directions(module_$31);
                        SubLObject direction = (SubLObject)sbhl_time_assertion_processing.NIL;
                        direction = cdolist_list_var_$35.first();
                        while (sbhl_time_assertion_processing.NIL != cdolist_list_var_$35) {
                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, module_$31);
                            if (sbhl_time_assertion_processing.NIL != mt_links && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(module_$31))) {
                                SubLObject iteration_state;
                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); sbhl_time_assertion_processing.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                    thread.resetMultipleValues();
                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    final SubLObject tv_links = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    SubLObject iteration_state_$34;
                                    for (iteration_state_$34 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); sbhl_time_assertion_processing.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$34); iteration_state_$34 = dictionary_contents.do_dictionary_contents_next(iteration_state_$34)) {
                                        thread.resetMultipleValues();
                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$34);
                                        final SubLObject link_nodes_var = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (sbhl_time_assertion_processing.NIL != sbhl_search_vars.sbhl_true_tv_p(tv)) {
                                            final SubLObject sol = link_nodes_var;
                                            if (sbhl_time_assertion_processing.NIL != set.set_p(sol)) {
                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject supports;
                                                SubLObject support;
                                                SubLObject item_var;
                                                SubLObject before;
                                                SubLObject cdolist_list_var_$36;
                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sbhl_time_assertion_processing.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sbhl_time_assertion_processing.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                    before = set_contents.do_set_contents_next(basis_object, state);
                                                    if (sbhl_time_assertion_processing.NIL != set_contents.do_set_contents_element_validP(state, before)) {
                                                        supports = (cdolist_list_var_$36 = Hashtables.gethash_without_values((SubLObject)ConsesLow.list(tag, before, point, mt), sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue(), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED));
                                                        support = (SubLObject)sbhl_time_assertion_processing.NIL;
                                                        support = cdolist_list_var_$36.first();
                                                        while (sbhl_time_assertion_processing.NIL != cdolist_list_var_$36) {
                                                            if (sbhl_time_assertion_processing.NIL != assertions_high.valid_assertion(support, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED)) {
                                                                item_var = support;
                                                                if (sbhl_time_assertion_processing.NIL == conses_high.member(item_var, assertions, Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.EQL), Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.IDENTITY))) {
                                                                    assertions = (SubLObject)ConsesLow.cons(item_var, assertions);
                                                                }
                                                            }
                                                            cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                                                            support = cdolist_list_var_$36.first();
                                                        }
                                                    }
                                                }
                                            }
                                            else if (sol.isList()) {
                                                SubLObject csome_list_var = sol;
                                                SubLObject before2 = (SubLObject)sbhl_time_assertion_processing.NIL;
                                                before2 = csome_list_var.first();
                                                while (sbhl_time_assertion_processing.NIL != csome_list_var) {
                                                    SubLObject cdolist_list_var_$37;
                                                    final SubLObject supports2 = cdolist_list_var_$37 = Hashtables.gethash_without_values((SubLObject)ConsesLow.list(tag, before2, point, mt), sbhl_time_vars.$sbhl_temporal_link_support_table$.getGlobalValue(), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
                                                    SubLObject support2 = (SubLObject)sbhl_time_assertion_processing.NIL;
                                                    support2 = cdolist_list_var_$37.first();
                                                    while (sbhl_time_assertion_processing.NIL != cdolist_list_var_$37) {
                                                        if (sbhl_time_assertion_processing.NIL != assertions_high.valid_assertion(support2, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED)) {
                                                            final SubLObject item_var2 = support2;
                                                            if (sbhl_time_assertion_processing.NIL == conses_high.member(item_var2, assertions, Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.EQL), Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.IDENTITY))) {
                                                                assertions = (SubLObject)ConsesLow.cons(item_var2, assertions);
                                                            }
                                                        }
                                                        cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                                                        support2 = cdolist_list_var_$37.first();
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    before2 = csome_list_var.first();
                                                }
                                            }
                                            else {
                                                Errors.error((SubLObject)sbhl_time_assertion_processing.$str32$_A_is_neither_SET_P_nor_LISTP_, sol);
                                            }
                                        }
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$34);
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                            cdolist_list_var_$35 = cdolist_list_var_$35.rest();
                            direction = cdolist_list_var_$35.first();
                        }
                    }
                }
                finally {
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        cdolist_list_var = link_disjunctions;
        SubLObject link_disjunction = (SubLObject)sbhl_time_assertion_processing.NIL;
        link_disjunction = cdolist_list_var.first();
        while (sbhl_time_assertion_processing.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$38;
            final SubLObject link_disjunction_supports = cdolist_list_var_$38 = Hashtables.gethash_without_values(link_disjunction, sbhl_time_vars.$sbhl_temporal_link_disjunction_support_table$.getGlobalValue(), (SubLObject)sbhl_time_assertion_processing.UNPROVIDED);
            SubLObject support3 = (SubLObject)sbhl_time_assertion_processing.NIL;
            support3 = cdolist_list_var_$38.first();
            while (sbhl_time_assertion_processing.NIL != cdolist_list_var_$38) {
                if (sbhl_time_assertion_processing.NIL != assertions_high.valid_assertion(support3, (SubLObject)sbhl_time_assertion_processing.UNPROVIDED)) {
                    final SubLObject item_var3 = support3;
                    if (sbhl_time_assertion_processing.NIL == conses_high.member(item_var3, assertions, Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.EQL), Symbols.symbol_function((SubLObject)sbhl_time_assertion_processing.IDENTITY))) {
                        assertions = (SubLObject)ConsesLow.cons(item_var3, assertions);
                    }
                }
                cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                support3 = cdolist_list_var_$38.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            link_disjunction = cdolist_list_var.first();
        }
        return assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 32927L)
    public static SubLObject handle_temporal_relation_literal_conflict(final SubLObject pred, final SubLObject arg1, final SubLObject arg2, final SubLObject sense, final SubLObject mt, SubLObject op) {
        if (op == sbhl_time_assertion_processing.UNPROVIDED) {
            op = (SubLObject)sbhl_time_assertion_processing.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sbhl_time_assertion_processing.NIL == sbhl_time_utilities.valid_sbhl_time_literal_argsP(pred, arg1, arg2)) {
            return (SubLObject)sbhl_time_assertion_processing.NIL;
        }
        final SubLObject gaf = narts_high.nart_expand(fi.assertion_expand((SubLObject)ConsesLow.list(pred, arg1, arg2)));
        final SubLObject truth = enumeration_types.sense_truth(sense);
        if (sbhl_time_assertion_processing.NIL == control_vars.$suppress_conflict_noticesP$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)sbhl_time_assertion_processing.$str43$sbhl_conflict___s__a__a__, gaf, truth, mt);
            if (sbhl_time_assertion_processing.NIL == control_vars.$ignore_conflictsP$.getDynamicValue(thread)) {
                final SubLObject _prev_bind_0 = sbhl_time_vars.$sbhl_temporality_verbose_justsP$.currentBinding(thread);
                try {
                    sbhl_time_vars.$sbhl_temporality_verbose_justsP$.bind((SubLObject)sbhl_time_assertion_processing.NIL, thread);
                    final SubLObject why = sbhl_time_query_processing.why_true_temporal_relation_literalP(pred, arg1, arg2, enumeration_types.inverse_sense(sense), mt);
                    sbhl_temporality_conflict_notify((SubLObject)sbhl_time_assertion_processing.$str44$sbhl_conflict___s__a__a________be, gaf, truth, mt, why);
                }
                finally {
                    sbhl_time_vars.$sbhl_temporality_verbose_justsP$.rebind(_prev_bind_0, thread);
                }
                conflicts.$current_conflicts$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(gaf, mt, truth, op), conflicts.$current_conflicts$.getGlobalValue()));
                conflicts.$mt_conflicts$.setGlobalValue((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(gaf, mt, truth, op), conflicts.$mt_conflicts$.getGlobalValue()));
            }
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-time-assertion-processing.lisp", position = 33764L)
    public static SubLObject sbhl_temporality_conflict_notify(final SubLObject format_string, final SubLObject gaf, final SubLObject truth, final SubLObject mt, SubLObject supports) {
        if (supports == sbhl_time_assertion_processing.UNPROVIDED) {
            supports = (SubLObject)sbhl_time_assertion_processing.NIL;
        }
        final SubLObject new_format_string = Sequences.cconcatenate(format_string, (SubLObject)sbhl_time_assertion_processing.$str45$__a);
        if (sbhl_time_assertion_processing.NIL != agenda.within_agenda()) {
            final SubLObject pcase_var = agenda.agenda_error_mode();
            if (pcase_var.eql((SubLObject)sbhl_time_assertion_processing.$kw46$IGNORE)) {
                Errors.warn(new_format_string, new SubLObject[] { gaf, truth, mt, supports });
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_assertion_processing.$kw47$HALT)) {
                control_vars.$last_agenda_error_explanatory_supports$.setGlobalValue(supports);
                Errors.error(format_string, gaf, truth, mt);
            }
            else if (pcase_var.eql((SubLObject)sbhl_time_assertion_processing.$kw48$DEBUG)) {
                Errors.cerror((SubLObject)sbhl_time_assertion_processing.$str49$leave_the_kb_inconsistent_for_now, new_format_string, new SubLObject[] { gaf, truth, mt, supports });
            }
        }
        else {
            Errors.cerror((SubLObject)sbhl_time_assertion_processing.$str49$leave_the_kb_inconsistent_for_now, new_format_string, new SubLObject[] { gaf, truth, mt, supports });
        }
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    public static SubLObject declare_sbhl_time_assertion_processing_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "add_temporal_relation", "ADD-TEMPORAL-RELATION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "add_wff_temporal_relation", "ADD-WFF-TEMPORAL-RELATION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "remove_temporal_relation", "REMOVE-TEMPORAL-RELATION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "sbhl_assimilable_temporality_gafP", "SBHL-ASSIMILABLE-TEMPORALITY-GAF?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "add_temporal_relation_literal", "ADD-TEMPORAL-RELATION-LITERAL", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "remove_temporal_relation_literal", "REMOVE-TEMPORAL-RELATION-LITERAL", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "add_temporal_quasi_link_conjunction", "ADD-TEMPORAL-QUASI-LINK-CONJUNCTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "remove_temporal_quasi_link_conjunction", "REMOVE-TEMPORAL-QUASI-LINK-CONJUNCTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "find_or_create_hl_temporal_point", "FIND-OR-CREATE-HL-TEMPORAL-POINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "find_hl_temporal_point", "FIND-HL-TEMPORAL-POINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "add_hl_start_for_non_date", "ADD-HL-START-FOR-NON-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "find_or_create_hl_start", "FIND-OR-CREATE-HL-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "add_hl_end_for_non_date", "ADD-HL-END-FOR-NON-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "find_or_create_hl_end", "FIND-OR-CREATE-HL-END", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "add_hl_start_for_extended_universal_date", "ADD-HL-START-FOR-EXTENDED-UNIVERSAL-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "add_hl_end_for_extended_universal_date", "ADD-HL-END-FOR-EXTENDED-UNIVERSAL-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "closest_hl_point_node_at_or_after_start", "CLOSEST-HL-POINT-NODE-AT-OR-AFTER-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "closest_hl_point_node_at_or_before_end", "CLOSEST-HL-POINT-NODE-AT-OR-BEFORE-END", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "add_temporal_link", "ADD-TEMPORAL-LINK", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "remove_temporal_link", "REMOVE-TEMPORAL-LINK", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "add_temporal_link_int", "ADD-TEMPORAL-LINK-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "remove_temporal_link_int", "REMOVE-TEMPORAL-LINK-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "existing_temporal_link_supportP", "EXISTING-TEMPORAL-LINK-SUPPORT?", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "existing_temporal_link_object_supportP", "EXISTING-TEMPORAL-LINK-OBJECT-SUPPORT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "add_temporal_link_support", "ADD-TEMPORAL-LINK-SUPPORT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "add_temporal_link_object_support", "ADD-TEMPORAL-LINK-OBJECT-SUPPORT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "remove_temporal_link_support", "REMOVE-TEMPORAL-LINK-SUPPORT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "consider_removing_temporal_point", "CONSIDER-REMOVING-TEMPORAL-POINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "consider_removing_definitional_links", "CONSIDER-REMOVING-DEFINITIONAL-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "consider_removing_definitional_links_for_date_point", "CONSIDER-REMOVING-DEFINITIONAL-LINKS-FOR-DATE-POINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "link_type_keyword_for_symbol", "LINK-TYPE-KEYWORD-FOR-SYMBOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "consider_removing_definitional_links_for_non_date_point", "CONSIDER-REMOVING-DEFINITIONAL-LINKS-FOR-NON-DATE-POINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "consider_removing_definitional_links_for_non_date_point_start", "CONSIDER-REMOVING-DEFINITIONAL-LINKS-FOR-NON-DATE-POINT-START", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "consider_removing_definitional_links_for_non_date_point_end", "CONSIDER-REMOVING-DEFINITIONAL-LINKS-FOR-NON-DATE-POINT-END", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "add_temporal_quasi_link_conjunction_negation", "ADD-TEMPORAL-QUASI-LINK-CONJUNCTION-NEGATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "remove_temporal_quasi_link_conjunction_negation", "REMOVE-TEMPORAL-QUASI-LINK-CONJUNCTION-NEGATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "add_temporal_link_disjunction", "ADD-TEMPORAL-LINK-DISJUNCTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "remove_temporal_link_disjunction", "REMOVE-TEMPORAL-LINK-DISJUNCTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "existing_temporal_link_disjunction_supportP", "EXISTING-TEMPORAL-LINK-DISJUNCTION-SUPPORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "add_temporal_link_disjunction_support", "ADD-TEMPORAL-LINK-DISJUNCTION-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "remove_temporal_link_disjunction_support", "REMOVE-TEMPORAL-LINK-DISJUNCTION-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "add_note_of_temporal_link_disjunction_terms", "ADD-NOTE-OF-TEMPORAL-LINK-DISJUNCTION-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "remove_note_of_temporal_link_disjunction_terms", "REMOVE-NOTE-OF-TEMPORAL-LINK-DISJUNCTION-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "add_temporal_link_disjunction_term_support", "ADD-TEMPORAL-LINK-DISJUNCTION-TERM-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "remove_temporal_link_disjunction_term_support", "REMOVE-TEMPORAL-LINK-DISJUNCTION-TERM-SUPPORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "remove_fort_from_sbhl_temporality_structures", "REMOVE-FORT-FROM-SBHL-TEMPORALITY-STRUCTURES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "temporal_point_assertion_supports", "TEMPORAL-POINT-ASSERTION-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "handle_temporal_relation_literal_conflict", "HANDLE-TEMPORAL-RELATION-LITERAL-CONFLICT", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_time_assertion_processing", "sbhl_temporality_conflict_notify", "SBHL-TEMPORALITY-CONFLICT-NOTIFY", 4, 1, false);
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    public static SubLObject init_sbhl_time_assertion_processing_file() {
        sbhl_time_assertion_processing.$sbhl_time_default_link_mt$ = SubLFiles.deflexical("*SBHL-TIME-DEFAULT-LINK-MT*", (sbhl_time_assertion_processing.NIL != Symbols.boundp((SubLObject)sbhl_time_assertion_processing.$sym0$_SBHL_TIME_DEFAULT_LINK_MT_)) ? sbhl_time_assertion_processing.$sbhl_time_default_link_mt$.getGlobalValue() : sbhl_time_assertion_processing.$const1$BaseKB);
        sbhl_time_assertion_processing.$hl_start_end_fn_defining_mt$ = SubLFiles.deflexical("*HL-START-END-FN-DEFINING-MT*", (sbhl_time_assertion_processing.NIL != Symbols.boundp((SubLObject)sbhl_time_assertion_processing.$sym2$_HL_START_END_FN_DEFINING_MT_)) ? sbhl_time_assertion_processing.$hl_start_end_fn_defining_mt$.getGlobalValue() : sbhl_time_assertion_processing.$const1$BaseKB);
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    public static SubLObject setup_sbhl_time_assertion_processing_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_time_assertion_processing.$sym0$_SBHL_TIME_DEFAULT_LINK_MT_);
        mt_vars.note_mt_var((SubLObject)sbhl_time_assertion_processing.$sym0$_SBHL_TIME_DEFAULT_LINK_MT_, (SubLObject)sbhl_time_assertion_processing.NIL);
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_time_assertion_processing.$sym2$_HL_START_END_FN_DEFINING_MT_);
        mt_vars.note_mt_var((SubLObject)sbhl_time_assertion_processing.$sym2$_HL_START_END_FN_DEFINING_MT_, sbhl_time_assertion_processing.$const3$HL_StartFn);
        utilities_macros.register_kb_function((SubLObject)sbhl_time_assertion_processing.$sym11$ADD_TEMPORAL_RELATION);
        utilities_macros.register_kb_function((SubLObject)sbhl_time_assertion_processing.$sym14$REMOVE_TEMPORAL_RELATION);
        return (SubLObject)sbhl_time_assertion_processing.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sbhl_time_assertion_processing_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sbhl_time_assertion_processing_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sbhl_time_assertion_processing_file();
    }
    
    static {
        me = (SubLFile)new sbhl_time_assertion_processing();
        sbhl_time_assertion_processing.$sbhl_time_default_link_mt$ = null;
        sbhl_time_assertion_processing.$hl_start_end_fn_defining_mt$ = null;
        $sym0$_SBHL_TIME_DEFAULT_LINK_MT_ = SubLObjectFactory.makeSymbol("*SBHL-TIME-DEFAULT-LINK-MT*");
        $const1$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $sym2$_HL_START_END_FN_DEFINING_MT_ = SubLObjectFactory.makeSymbol("*HL-START-END-FN-DEFINING-MT*");
        $const3$HL_StartFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HL-StartFn"));
        $sym4$NOT_EQL = SubLObjectFactory.makeSymbol("NOT-EQL");
        $sym5$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $str6$skip_subsumption_op = SubLObjectFactory.makeString("skip subsumption op");
        $str7$_s_is_not_a_sbhl_time_predicate_p = SubLObjectFactory.makeString("~s is not a sbhl-time-predicate-p");
        $str8$_s_is_not_a_sbhl_time_arg_p = SubLObjectFactory.makeString("~s is not a sbhl-time-arg-p");
        $str9$gaf_is_effectively_date_date_asse = SubLObjectFactory.makeString("gaf is effectively date-date assertion: ~s ~a ~a~%");
        $kw10$ADD = SubLObjectFactory.makeKeyword("ADD");
        $sym11$ADD_TEMPORAL_RELATION = SubLObjectFactory.makeSymbol("ADD-TEMPORAL-RELATION");
        $sym12$RELEVANT_MT_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ");
        $str13$_sbhl__genls__skipping_remove_op_ = SubLObjectFactory.makeString("[sbhl :genls] skipping remove op; assertion still there: ~%~s");
        $sym14$REMOVE_TEMPORAL_RELATION = SubLObjectFactory.makeSymbol("REMOVE-TEMPORAL-RELATION");
        $kw15$CONJUNCTION_FN = SubLObjectFactory.makeKeyword("CONJUNCTION-FN");
        $kw16$POS = SubLObjectFactory.makeKeyword("POS");
        $kw17$NEG = SubLObjectFactory.makeKeyword("NEG");
        $kw18$START = SubLObjectFactory.makeKeyword("START");
        $kw19$END = SubLObjectFactory.makeKeyword("END");
        $kw20$DEFINITIONAL = SubLObjectFactory.makeKeyword("DEFINITIONAL");
        $kw21$WEAK = SubLObjectFactory.makeKeyword("WEAK");
        $kw22$BEGINNING_OF_TIME = SubLObjectFactory.makeKeyword("BEGINNING-OF-TIME");
        $kw23$END_OF_TIME = SubLObjectFactory.makeKeyword("END-OF-TIME");
        $sym24$EXTENDED_UNIVERSAL_DATE_ = SubLObjectFactory.makeSymbol("EXTENDED-UNIVERSAL-DATE<");
        $kw25$SUCCESSOR = SubLObjectFactory.makeKeyword("SUCCESSOR");
        $kw26$SUCCESSOR_STRICT = SubLObjectFactory.makeKeyword("SUCCESSOR-STRICT");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("WEAK"), (SubLObject)SubLObjectFactory.makeKeyword("STRICT"), (SubLObject)SubLObjectFactory.makeKeyword("WEAK-SUCCESSOR"), (SubLObject)SubLObjectFactory.makeKeyword("SUCCESSOR-STRICT"));
        $kw28$COORDINATE = SubLObjectFactory.makeKeyword("COORDINATE");
        $kw29$STRICT = SubLObjectFactory.makeKeyword("STRICT");
        $kw30$WEAK_SUCCESSOR = SubLObjectFactory.makeKeyword("WEAK-SUCCESSOR");
        $list31 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeUninternedSymbol("KEY"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("MODULE"));
        $str32$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEFINITIONAL"));
        $sym34$SYMBOLP = SubLObjectFactory.makeSymbol("SYMBOLP");
        $sym35$__ = SubLObjectFactory.makeSymbol("<=");
        $sym36$_ = SubLObjectFactory.makeSymbol("<");
        $sym37$____ = SubLObjectFactory.makeSymbol("<=<=");
        $sym38$__ = SubLObjectFactory.makeSymbol("<<");
        $sym39$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym40$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const41$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw42$GAF = SubLObjectFactory.makeKeyword("GAF");
        $str43$sbhl_conflict___s__a__a__ = SubLObjectFactory.makeString("sbhl conflict: ~s ~a ~a~%");
        $str44$sbhl_conflict___s__a__a________be = SubLObjectFactory.makeString("sbhl conflict: ~s ~a ~a~%      because:");
        $str45$__a = SubLObjectFactory.makeString(" ~a");
        $kw46$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $kw47$HALT = SubLObjectFactory.makeKeyword("HALT");
        $kw48$DEBUG = SubLObjectFactory.makeKeyword("DEBUG");
        $str49$leave_the_kb_inconsistent_for_now = SubLObjectFactory.makeString("leave the kb inconsistent for now and resolve the conflict later");
    }
}

/*

	Total time: 828 ms
	
*/