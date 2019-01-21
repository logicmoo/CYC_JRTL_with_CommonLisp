package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.modules.after_adding_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class negation_mt extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.negation_mt";
    public static final String myFingerPrint = "ae6bfd254d69083006457ddd45a410abf2b29ffd97e1a15c11351ee7aa13cd28";
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 14534L)
    private static SubLSymbol $no_of_ext_incompatiable_mt_assertions_to_be_unasserted$;
    private static final SubLObject $const0$negationMt;
    private static final SubLObject $const1$incompatibleMt;
    private static final SubLSymbol $sym2$INCOMPATIBLE_MT_AFTER_ADDING;
    private static final SubLSymbol $sym3$INCOMPATIBLE_MT_AFTER_REMOVING;
    private static final SubLSymbol $sym4$PROPAGATE_TO_INCOMPATIBLE_MT;
    private static final SubLObject $const5$intensionallyIncompatibleMt;
    private static final SubLSymbol $sym6$INTENSIONALLY_INCOMPATIBLE_MT_AFTER_ADDING;
    private static final SubLSymbol $sym7$INTENSIONALLY_INCOMPATIBLE_MT_AFTER_REMOVING;
    private static final SubLSymbol $sym8$UPDATE_EXTENSIONALLY_INCOMPATIBLE_MT_ASSERTIONS;
    private static final SubLSymbol $sym9$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const10$EverythingPSC;
    private static final SubLList $list11;
    private static final SubLObject $const12$extensionallyIncompatibleMt;
    private static final SubLSymbol $sym13$_EXIT;
    private static final SubLString $str14$The_function_update_extensionally;
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 775L)
    public static SubLObject local_negation_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == negation_mt.UNPROVIDED) {
            mt_mt = (SubLObject)negation_mt.NIL;
        }
        if (tv == negation_mt.UNPROVIDED) {
            tv = (SubLObject)negation_mt.NIL;
        }
        return sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt), mt, mt_mt, tv, (SubLObject)negation_mt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 1001L)
    public static SubLObject local_max_negation_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == negation_mt.UNPROVIDED) {
            mt_mt = (SubLObject)negation_mt.NIL;
        }
        if (tv == negation_mt.UNPROVIDED) {
            tv = (SubLObject)negation_mt.NIL;
        }
        return sbhl_search_methods.sbhl_max_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt), mt, mt_mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 1230L)
    public static SubLObject local_not_negation_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == negation_mt.UNPROVIDED) {
            mt_mt = (SubLObject)negation_mt.NIL;
        }
        if (tv == negation_mt.UNPROVIDED) {
            tv = (SubLObject)negation_mt.NIL;
        }
        return sbhl_link_methods.sbhl_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt), mt, mt_mt, tv, (SubLObject)negation_mt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 1469L)
    public static SubLObject local_min_not_negation_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == negation_mt.UNPROVIDED) {
            mt_mt = (SubLObject)negation_mt.NIL;
        }
        if (tv == negation_mt.UNPROVIDED) {
            tv = (SubLObject)negation_mt.NIL;
        }
        return sbhl_search_methods.sbhl_min_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt), mt, mt_mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 1708L)
    public static SubLObject all_negation_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == negation_mt.UNPROVIDED) {
            mt_mt = (SubLObject)negation_mt.NIL;
        }
        if (tv == negation_mt.UNPROVIDED) {
            tv = (SubLObject)negation_mt.NIL;
        }
        return sbhl_search_implied_relations.sbhl_all_implied_disjoins(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt), mt, mt_mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 1944L)
    public static SubLObject all_not_negation_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == negation_mt.UNPROVIDED) {
            mt_mt = (SubLObject)negation_mt.NIL;
        }
        if (tv == negation_mt.UNPROVIDED) {
            tv = (SubLObject)negation_mt.NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_false_nodes(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt), mt, mt_mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 2135L)
    public static SubLObject max_negation_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == negation_mt.UNPROVIDED) {
            mt_mt = (SubLObject)negation_mt.NIL;
        }
        if (tv == negation_mt.UNPROVIDED) {
            tv = (SubLObject)negation_mt.NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_max_disjoins(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt), mt, mt_mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 2376L)
    public static SubLObject negation_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == negation_mt.UNPROVIDED) {
            mt_mt = (SubLObject)negation_mt.NIL;
        }
        if (tv == negation_mt.UNPROVIDED) {
            tv = (SubLObject)negation_mt.NIL;
        }
        return max_negation_mts(mt, mt_mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 2475L)
    public static SubLObject min_all_not_negation_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == negation_mt.UNPROVIDED) {
            mt_mt = (SubLObject)negation_mt.NIL;
        }
        if (tv == negation_mt.UNPROVIDED) {
            tv = (SubLObject)negation_mt.NIL;
        }
        return sbhl_search_methods.sbhl_implied_min_false_disjoins(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt), mt, mt_mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 2696L)
    public static SubLObject min_implied_not_negation_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == negation_mt.UNPROVIDED) {
            mt_mt = (SubLObject)negation_mt.NIL;
        }
        if (tv == negation_mt.UNPROVIDED) {
            tv = (SubLObject)negation_mt.NIL;
        }
        return sbhl_search_methods.sbhl_leaf_nodes(sbhl_module_utilities.get_sbhl_reductions_module(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt)), mt, mt_mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 2914L)
    public static SubLObject min_all_asserted_not_negation_mts(final SubLObject mt, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == negation_mt.UNPROVIDED) {
            mt_mt = (SubLObject)negation_mt.NIL;
        }
        if (tv == negation_mt.UNPROVIDED) {
            tv = (SubLObject)negation_mt.NIL;
        }
        return sbhl_search_methods.sbhl_min_asserted_false_disjoins(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt), mt, mt_mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 3163L)
    public static SubLObject any_disjoint_mt_pair(final SubLObject mts, SubLObject mt_mt) {
        if (mt_mt == negation_mt.UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        SubLObject disjoint = (SubLObject)negation_mt.NIL;
        SubLObject n = (SubLObject)negation_mt.ZERO_INTEGER;
        if (negation_mt.NIL == disjoint) {
            SubLObject csome_list_var = mts;
            SubLObject mt1 = (SubLObject)negation_mt.NIL;
            mt1 = csome_list_var.first();
            while (negation_mt.NIL == disjoint && negation_mt.NIL != csome_list_var) {
                n = Numbers.add(n, (SubLObject)negation_mt.ONE_INTEGER);
                if (negation_mt.NIL == disjoint) {
                    SubLObject csome_list_var_$1 = conses_high.nthcdr(n, mts);
                    SubLObject mt2 = (SubLObject)negation_mt.NIL;
                    mt2 = csome_list_var_$1.first();
                    while (negation_mt.NIL == disjoint && negation_mt.NIL != csome_list_var_$1) {
                        if (negation_mt.NIL != negation_mtP(mt1, mt2, mt_mt, (SubLObject)negation_mt.UNPROVIDED)) {
                            disjoint = (SubLObject)ConsesLow.list(mt1, mt2);
                        }
                        csome_list_var_$1 = csome_list_var_$1.rest();
                        mt2 = csome_list_var_$1.first();
                    }
                }
                csome_list_var = csome_list_var.rest();
                mt1 = csome_list_var.first();
            }
        }
        return disjoint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 3527L)
    public static SubLObject negation_mtP(final SubLObject mt1, final SubLObject mt2, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == negation_mt.UNPROVIDED) {
            mt_mt = (SubLObject)negation_mt.NIL;
        }
        if (tv == negation_mt.UNPROVIDED) {
            tv = (SubLObject)negation_mt.NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt), mt1, mt2, mt_mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 4103L)
    public static SubLObject any_negation_mtP(final SubLObject mt1s, final SubLObject mt2, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == negation_mt.UNPROVIDED) {
            mt_mt = (SubLObject)negation_mt.NIL;
        }
        if (tv == negation_mt.UNPROVIDED) {
            tv = (SubLObject)negation_mt.NIL;
        }
        return sbhl_search_implied_relations.sbhl_any_with_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt), mt1s, mt2, mt_mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 4312L)
    public static SubLObject any_negation_mt_anyP(final SubLObject mt1s, final SubLObject mt2s, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == negation_mt.UNPROVIDED) {
            mt_mt = (SubLObject)negation_mt.NIL;
        }
        if (tv == negation_mt.UNPROVIDED) {
            tv = (SubLObject)negation_mt.NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_disjoins_relation_between_any_p(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt), mt1s, mt2s, mt_mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 4544L)
    public static SubLObject not_negation_mtP(final SubLObject mt1, final SubLObject mt2, SubLObject mt_mt, SubLObject tv) {
        if (mt_mt == negation_mt.UNPROVIDED) {
            mt_mt = (SubLObject)negation_mt.NIL;
        }
        if (tv == negation_mt.UNPROVIDED) {
            tv = (SubLObject)negation_mt.NIL;
        }
        return sbhl_search_methods.sbhl_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt), mt1, mt2, mt_mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 4959L)
    public static SubLObject mts_disjointP(final SubLObject mt1, final SubLObject mt2, SubLObject mt_mt) {
        if (mt_mt == negation_mt.UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return negation_mtP(mt1, mt2, mt_mt, (SubLObject)negation_mt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 5257L)
    public static SubLObject disjoint_mtsP(final SubLObject mt1, final SubLObject mt2, SubLObject mt_mt) {
        if (mt_mt == negation_mt.UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        return negation_mtP(mt1, mt2, mt_mt, (SubLObject)negation_mt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 5367L)
    public static SubLObject any_disjoint_mtsP(final SubLObject mts, SubLObject mt_mt) {
        if (mt_mt == negation_mt.UNPROVIDED) {
            mt_mt = mt_vars.$mt_mt$.getGlobalValue();
        }
        SubLObject disjointP = (SubLObject)negation_mt.NIL;
        SubLObject n = (SubLObject)negation_mt.ZERO_INTEGER;
        if (negation_mt.NIL == disjointP) {
            SubLObject csome_list_var = mts;
            SubLObject mt1 = (SubLObject)negation_mt.NIL;
            mt1 = csome_list_var.first();
            while (negation_mt.NIL == disjointP && negation_mt.NIL != csome_list_var) {
                n = Numbers.add(n, (SubLObject)negation_mt.ONE_INTEGER);
                if (negation_mt.NIL == disjointP) {
                    SubLObject csome_list_var_$2 = conses_high.nthcdr(n, mts);
                    SubLObject mt2 = (SubLObject)negation_mt.NIL;
                    mt2 = csome_list_var_$2.first();
                    while (negation_mt.NIL == disjointP && negation_mt.NIL != csome_list_var_$2) {
                        if (negation_mt.NIL != negation_mtP(mt1, mt2, mt_mt, (SubLObject)negation_mt.UNPROVIDED)) {
                            disjointP = (SubLObject)negation_mt.T;
                        }
                        csome_list_var_$2 = csome_list_var_$2.rest();
                        mt2 = csome_list_var_$2.first();
                    }
                }
                csome_list_var = csome_list_var.rest();
                mt1 = csome_list_var.first();
            }
        }
        return disjointP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 5717L)
    public static SubLObject basis_for_not_negation_mtP(final SubLObject mt1, final SubLObject mt2, SubLObject mt_mt) {
        if (mt_mt == negation_mt.UNPROVIDED) {
            mt_mt = (SubLObject)negation_mt.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject known_not_negation_mtP = (SubLObject)negation_mt.NIL;
        if (mt1.eql(mt2)) {
            final SubLObject _prev_bind_0 = sbhl_module_vars.$assume_sbhl_extensions_nonempty$.currentBinding(thread);
            try {
                sbhl_module_vars.$assume_sbhl_extensions_nonempty$.bind((SubLObject)negation_mt.NIL, thread);
                known_not_negation_mtP = not_negation_mtP(mt1, mt2, mt_mt, (SubLObject)negation_mt.UNPROVIDED);
            }
            finally {
                sbhl_module_vars.$assume_sbhl_extensions_nonempty$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean((mt1.eql(mt2) && negation_mt.NIL != known_not_negation_mtP) || (!mt1.eql(mt2) && negation_mt.NIL != not_negation_mtP(mt1, mt2, mt_mt, (SubLObject)negation_mt.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 6620L)
    public static SubLObject why_negation_mtP(final SubLObject mt1, final SubLObject mt2, SubLObject mt_mt, SubLObject tv, SubLObject behavior) {
        if (mt_mt == negation_mt.UNPROVIDED) {
            mt_mt = (SubLObject)negation_mt.NIL;
        }
        if (tv == negation_mt.UNPROVIDED) {
            tv = (SubLObject)negation_mt.NIL;
        }
        if (behavior == negation_mt.UNPROVIDED) {
            behavior = (SubLObject)negation_mt.NIL;
        }
        return sbhl_search_implied_relations.why_sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt), mt1, mt2, mt_mt, tv, behavior);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 6880L)
    public static SubLObject negation_mt_mts(final SubLObject mt) {
        return kb_accessors.pred_mts(mt, sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt), (SubLObject)negation_mt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 7173L)
    public static SubLObject asserted_negation_mts(final SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == negation_mt.UNPROVIDED) {
            mt_mt = (SubLObject)negation_mt.NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt), mt, mt_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 7391L)
    public static SubLObject asserted_not_negation_mts(final SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == negation_mt.UNPROVIDED) {
            mt_mt = (SubLObject)negation_mt.NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_links(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt), mt, mt_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 7615L)
    public static SubLObject supported_negation_mts(final SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == negation_mt.UNPROVIDED) {
            mt_mt = (SubLObject)negation_mt.NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_links(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt), mt, mt_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 7836L)
    public static SubLObject supported_not_negation_mts(final SubLObject mt, SubLObject mt_mt) {
        if (mt_mt == negation_mt.UNPROVIDED) {
            mt_mt = (SubLObject)negation_mt.NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_links(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt), mt, mt_mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 8063L)
    public static SubLObject negation_mt_after_adding(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt));
        return (SubLObject)negation_mt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 8523L)
    public static SubLObject negation_mt_after_removing(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt));
        return (SubLObject)negation_mt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 8807L)
    public static SubLObject clear_negation_mt_graph() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt));
        return (SubLObject)negation_mt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 9162L)
    public static SubLObject clear_node_negation_mt_links(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)negation_mt.NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt), thread);
            if (negation_mt.NIL != fort_types_interface.mtP(node)) {
                SubLObject cdolist_list_var = sbhl_link_methods.sbhl_link_mts(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt), node);
                SubLObject mt_mt = (SubLObject)negation_mt.NIL;
                mt_mt = cdolist_list_var.first();
                while (negation_mt.NIL != cdolist_list_var) {
                    sbhl_link_methods.clear_sbhl_links_within_mt(node, mt_mt, (SubLObject)negation_mt.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    mt_mt = cdolist_list_var.first();
                }
            }
        }
        finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)negation_mt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 9480L)
    public static SubLObject reset_negation_mt_links(final SubLObject mt) {
        final SubLObject mt_mts = negation_mt_mts(mt);
        clear_node_negation_mt_links(mt);
        if (negation_mt.NIL != fort_types_interface.mtP(mt)) {
            SubLObject cdolist_list_var = mt_mts;
            SubLObject mt_mt = (SubLObject)negation_mt.NIL;
            mt_mt = cdolist_list_var.first();
            while (negation_mt.NIL != cdolist_list_var) {
                reset_negation_mt_links_in_mt(mt, mt_mt);
                cdolist_list_var = cdolist_list_var.rest();
                mt_mt = cdolist_list_var.first();
            }
        }
        return (SubLObject)negation_mt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 9780L)
    public static SubLObject reset_negation_mt_links_in_mt(final SubLObject mt, final SubLObject mt_mt) {
        sbhl_link_methods.sbhl_recompute_links(mt, mt_mt, sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt));
        return (SubLObject)negation_mt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 10010L)
    public static SubLObject reset_negation_mt_graph(SubLObject clearP) {
        if (clearP == negation_mt.UNPROVIDED) {
            clearP = (SubLObject)negation_mt.T;
        }
        if (negation_mt.NIL != clearP) {
            clear_negation_mt_graph();
        }
        sbhl_link_methods.sbhl_recompute_graph_links(sbhl_module_vars.get_sbhl_module(negation_mt.$const0$negationMt));
        return (SubLObject)negation_mt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 10244L)
    public static SubLObject incompatible_mtsP(final SubLObject mt1, final SubLObject mt2, SubLObject mt, SubLObject tv) {
        if (mt == negation_mt.UNPROVIDED) {
            mt = (SubLObject)negation_mt.NIL;
        }
        if (tv == negation_mt.UNPROVIDED) {
            tv = (SubLObject)negation_mt.NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module(negation_mt.$const1$incompatibleMt), mt1, mt2, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 10473L)
    public static SubLObject incompatible_mt_after_adding(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module(negation_mt.$const1$incompatibleMt));
        return (SubLObject)negation_mt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 10713L)
    public static SubLObject incompatible_mt_after_removing(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module(negation_mt.$const1$incompatibleMt));
        return (SubLObject)negation_mt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 10965L)
    public static SubLObject propagate_to_incompatible_mt(final SubLObject argument, final SubLObject assertion) {
        return after_adding_modules.propagate_sbhl_spec_pred_uses(negation_mt.$const1$incompatibleMt, assertion);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 11150L)
    public static SubLObject why_incompatible_mtsP(final SubLObject mt_1, final SubLObject mt_2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == negation_mt.UNPROVIDED) {
            mt = (SubLObject)negation_mt.NIL;
        }
        if (tv == negation_mt.UNPROVIDED) {
            tv = (SubLObject)negation_mt.NIL;
        }
        if (behavior == negation_mt.UNPROVIDED) {
            behavior = (SubLObject)negation_mt.NIL;
        }
        return sbhl_search_implied_relations.why_sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module(negation_mt.$const1$incompatibleMt), mt_1, mt_2, mt, tv, behavior);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 11397L)
    public static SubLObject clear_incompatible_mt_graph() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module(negation_mt.$const1$incompatibleMt));
        return (SubLObject)negation_mt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 11538L)
    public static SubLObject intensionally_incompatible_mtsP(final SubLObject mt1, final SubLObject mt2, SubLObject mt, SubLObject tv) {
        if (mt == negation_mt.UNPROVIDED) {
            mt = (SubLObject)negation_mt.NIL;
        }
        if (tv == negation_mt.UNPROVIDED) {
            tv = (SubLObject)negation_mt.NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module(negation_mt.$const5$intensionallyIncompatibleMt), mt1, mt2, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 11800L)
    public static SubLObject intensionally_incompatible_mt_after_adding(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module(negation_mt.$const5$intensionallyIncompatibleMt));
        return (SubLObject)negation_mt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 12044L)
    public static SubLObject intensionally_incompatible_mt_after_removing(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module(negation_mt.$const5$intensionallyIncompatibleMt));
        return (SubLObject)negation_mt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 12293L)
    public static SubLObject why_intensionally_incompatible_mtsP(final SubLObject mt_1, final SubLObject mt_2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == negation_mt.UNPROVIDED) {
            mt = (SubLObject)negation_mt.NIL;
        }
        if (tv == negation_mt.UNPROVIDED) {
            tv = (SubLObject)negation_mt.NIL;
        }
        if (behavior == negation_mt.UNPROVIDED) {
            behavior = (SubLObject)negation_mt.NIL;
        }
        return sbhl_search_implied_relations.why_sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module(negation_mt.$const5$intensionallyIncompatibleMt), mt_1, mt_2, mt, tv, behavior);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 12552L)
    public static SubLObject clear_intensionally_incompatible_mt_graph() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module(negation_mt.$const5$intensionallyIncompatibleMt));
        return (SubLObject)negation_mt.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 12705L)
    public static SubLObject generalize_mt_pairs_for_incompatible_mt_assertions(final SubLObject mt_1, final SubLObject mt_2, SubLObject visited_nodes) {
        if (visited_nodes == negation_mt.UNPROVIDED) {
            visited_nodes = (SubLObject)negation_mt.NIL;
        }
        if (negation_mt.NIL != genl_mts.genl_mtP(mt_1, mt_2, (SubLObject)negation_mt.UNPROVIDED, (SubLObject)negation_mt.UNPROVIDED) || negation_mt.NIL != genl_mts.genl_mtP(mt_2, mt_1, (SubLObject)negation_mt.UNPROVIDED, (SubLObject)negation_mt.UNPROVIDED)) {
            return (SubLObject)negation_mt.NIL;
        }
        if (negation_mt.NIL == conses_high.member(el_utilities.elify((SubLObject)ConsesLow.list(mt_1, mt_2)), visited_nodes, Symbols.symbol_function((SubLObject)negation_mt.EQUAL), (SubLObject)negation_mt.UNPROVIDED)) {
            SubLObject genl_mt_list_1 = genl_mts.genl_mts(mt_1, (SubLObject)negation_mt.UNPROVIDED, (SubLObject)negation_mt.UNPROVIDED);
            SubLObject genl_mt_list_2 = genl_mts.genl_mts(mt_2, (SubLObject)negation_mt.UNPROVIDED, (SubLObject)negation_mt.UNPROVIDED);
            genl_mt_list_1 = (SubLObject)ConsesLow.cons(mt_1, genl_mt_list_1);
            genl_mt_list_2 = (SubLObject)ConsesLow.cons(mt_2, genl_mt_list_2);
            SubLObject cdolist_list_var = genl_mt_list_1;
            SubLObject genl_mt_of_mt_1 = (SubLObject)negation_mt.NIL;
            genl_mt_of_mt_1 = cdolist_list_var.first();
            while (negation_mt.NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$3 = genl_mt_list_2;
                SubLObject genl_mt_of_mt_2 = (SubLObject)negation_mt.NIL;
                genl_mt_of_mt_2 = cdolist_list_var_$3.first();
                while (negation_mt.NIL != cdolist_list_var_$3) {
                    if ((!genl_mt_of_mt_1.equal(mt_1) || !genl_mt_of_mt_2.equal(mt_2)) && negation_mt.NIL == common_spec_mt_existsP(genl_mt_of_mt_1, genl_mt_of_mt_2)) {
                        return generalize_mt_pairs_for_incompatible_mt_assertions(genl_mt_of_mt_1, genl_mt_of_mt_2, ConsesLow.append(visited_nodes, (SubLObject)ConsesLow.list(el_utilities.elify((SubLObject)ConsesLow.list(mt_1, mt_2)))));
                    }
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    genl_mt_of_mt_2 = cdolist_list_var_$3.first();
                }
                cdolist_list_var = cdolist_list_var.rest();
                genl_mt_of_mt_1 = cdolist_list_var.first();
            }
        }
        return (SubLObject)ConsesLow.list(mt_1, mt_2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 14016L)
    public static SubLObject common_spec_mt_existsP(final SubLObject mt_1, final SubLObject mt_2) {
        return genl_mts.max_floor_mts(el_utilities.hlify((SubLObject)ConsesLow.list(mt_1, mt_2)), (SubLObject)negation_mt.UNPROVIDED, (SubLObject)negation_mt.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 14121L)
    public static SubLObject update_extensionally_incompatible_mt_assertions(SubLObject source, final SubLObject genl_mt_assertion) {
        if (negation_mt.NIL != hl_transcript_tracing.within_hl_evalP()) {
            return (SubLObject)negation_mt.NIL;
        }
        final SubLObject gaf = assertions_high.gaf_formula(genl_mt_assertion);
        final SubLObject mt_1 = cycl_utilities.formula_arg1(gaf, (SubLObject)negation_mt.UNPROVIDED);
        final SubLObject mt_2 = cycl_utilities.formula_arg2(gaf, (SubLObject)negation_mt.UNPROVIDED);
        return update_extensionally_incompatible_mt_assertions_int(mt_1, mt_2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/negation-mt.lisp", position = 14618L)
    public static SubLObject update_extensionally_incompatible_mt_assertions_int(final SubLObject mt_1, final SubLObject mt_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)negation_mt.$sym9$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(negation_mt.$const10$EverythingPSC, thread);
            SubLObject number_of_iterations = (SubLObject)negation_mt.ZERO_INTEGER;
            while (negation_mt.NIL != incompatible_mtsP(mt_1, mt_2, (SubLObject)negation_mt.UNPROVIDED, (SubLObject)negation_mt.UNPROVIDED)) {
                number_of_iterations = Numbers.add(number_of_iterations, (SubLObject)negation_mt.ONE_INTEGER);
                final SubLObject justifications = sbhl_search_implied_relations.why_sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module(negation_mt.$const1$incompatibleMt), mt_1, mt_2, (SubLObject)negation_mt.UNPROVIDED, (SubLObject)negation_mt.UNPROVIDED, (SubLObject)negation_mt.UNPROVIDED);
                SubLObject any_assertion_foundP = (SubLObject)negation_mt.NIL;
                SubLObject cdolist_list_var = justifications;
                SubLObject justification = (SubLObject)negation_mt.NIL;
                justification = cdolist_list_var.first();
                while (negation_mt.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = justification;
                    SubLObject gaf = (SubLObject)negation_mt.NIL;
                    SubLObject truth = (SubLObject)negation_mt.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)negation_mt.$list11);
                    gaf = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)negation_mt.$list11);
                    truth = current.first();
                    current = current.rest();
                    if (negation_mt.NIL == current) {
                        final SubLObject pred = cycl_utilities.formula_arg0(gaf);
                        if (pred.eql(negation_mt.$const1$incompatibleMt)) {
                            final SubLObject assertion = czer_meta.find_assertion_cycl(gaf, (SubLObject)negation_mt.UNPROVIDED);
                            SubLObject cdolist_list_var_$4 = assertions_high.assertion_arguments(assertion);
                            SubLObject argument = (SubLObject)negation_mt.NIL;
                            argument = cdolist_list_var_$4.first();
                            while (negation_mt.NIL != cdolist_list_var_$4) {
                                if (negation_mt.NIL != deduction_handles.deduction_p(argument)) {
                                    SubLObject cdolist_list_var_$5 = dictionary.dictionary_contents(assertion_utilities.deduction_asserted_assertion_supports(argument, (SubLObject)negation_mt.FIVE_INTEGER));
                                    SubLObject content = (SubLObject)negation_mt.NIL;
                                    content = cdolist_list_var_$5.first();
                                    while (negation_mt.NIL != cdolist_list_var_$5) {
                                        final SubLObject support = content.first();
                                        if (negation_mt.NIL != assertion_handles.assertion_p(support) && negation_mt.NIL == assertions_high.rule_assertionP(support)) {
                                            final SubLObject support_pred = cycl_utilities.formula_arg0(support);
                                            if (negation_mt.NIL != genl_predicates.genl_predP(support_pred, negation_mt.$const12$extensionallyIncompatibleMt, (SubLObject)negation_mt.UNPROVIDED, (SubLObject)negation_mt.UNPROVIDED)) {
                                                tms.tms_remove_assertion(support);
                                                any_assertion_foundP = (SubLObject)negation_mt.T;
                                            }
                                        }
                                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                                        content = cdolist_list_var_$5.first();
                                    }
                                }
                                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                                argument = cdolist_list_var_$4.first();
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)negation_mt.$list11);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    justification = cdolist_list_var.first();
                }
                if (negation_mt.NIL == any_assertion_foundP) {
                    return (SubLObject)negation_mt.NIL;
                }
                if (number_of_iterations.numG(negation_mt.$no_of_ext_incompatiable_mt_assertions_to_be_unasserted$.getDynamicValue(thread))) {
                    Errors.warn((SubLObject)negation_mt.$str14$The_function_update_extensionally);
                    return (SubLObject)negation_mt.NIL;
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)negation_mt.NIL;
    }
    
    public static SubLObject declare_negation_mt_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "local_negation_mts", "LOCAL-NEGATION-MTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "local_max_negation_mts", "LOCAL-MAX-NEGATION-MTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "local_not_negation_mts", "LOCAL-NOT-NEGATION-MTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "local_min_not_negation_mts", "LOCAL-MIN-NOT-NEGATION-MTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "all_negation_mts", "ALL-NEGATION-MTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "all_not_negation_mts", "ALL-NOT-NEGATION-MTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "max_negation_mts", "MAX-NEGATION-MTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "negation_mts", "NEGATION-MTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "min_all_not_negation_mts", "MIN-ALL-NOT-NEGATION-MTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "min_implied_not_negation_mts", "MIN-IMPLIED-NOT-NEGATION-MTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "min_all_asserted_not_negation_mts", "MIN-ALL-ASSERTED-NOT-NEGATION-MTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "any_disjoint_mt_pair", "ANY-DISJOINT-MT-PAIR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "negation_mtP", "NEGATION-MT?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "any_negation_mtP", "ANY-NEGATION-MT?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "any_negation_mt_anyP", "ANY-NEGATION-MT-ANY?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "not_negation_mtP", "NOT-NEGATION-MT?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "mts_disjointP", "MTS-DISJOINT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "disjoint_mtsP", "DISJOINT-MTS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "any_disjoint_mtsP", "ANY-DISJOINT-MTS?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "basis_for_not_negation_mtP", "BASIS-FOR-NOT-NEGATION-MT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "why_negation_mtP", "WHY-NEGATION-MT?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "negation_mt_mts", "NEGATION-MT-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "asserted_negation_mts", "ASSERTED-NEGATION-MTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "asserted_not_negation_mts", "ASSERTED-NOT-NEGATION-MTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "supported_negation_mts", "SUPPORTED-NEGATION-MTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "supported_not_negation_mts", "SUPPORTED-NOT-NEGATION-MTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "negation_mt_after_adding", "NEGATION-MT-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "negation_mt_after_removing", "NEGATION-MT-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "clear_negation_mt_graph", "CLEAR-NEGATION-MT-GRAPH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "clear_node_negation_mt_links", "CLEAR-NODE-NEGATION-MT-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "reset_negation_mt_links", "RESET-NEGATION-MT-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "reset_negation_mt_links_in_mt", "RESET-NEGATION-MT-LINKS-IN-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "reset_negation_mt_graph", "RESET-NEGATION-MT-GRAPH", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "incompatible_mtsP", "INCOMPATIBLE-MTS?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "incompatible_mt_after_adding", "INCOMPATIBLE-MT-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "incompatible_mt_after_removing", "INCOMPATIBLE-MT-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "propagate_to_incompatible_mt", "PROPAGATE-TO-INCOMPATIBLE-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "why_incompatible_mtsP", "WHY-INCOMPATIBLE-MTS?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "clear_incompatible_mt_graph", "CLEAR-INCOMPATIBLE-MT-GRAPH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "intensionally_incompatible_mtsP", "INTENSIONALLY-INCOMPATIBLE-MTS?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "intensionally_incompatible_mt_after_adding", "INTENSIONALLY-INCOMPATIBLE-MT-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "intensionally_incompatible_mt_after_removing", "INTENSIONALLY-INCOMPATIBLE-MT-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "why_intensionally_incompatible_mtsP", "WHY-INTENSIONALLY-INCOMPATIBLE-MTS?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "clear_intensionally_incompatible_mt_graph", "CLEAR-INTENSIONALLY-INCOMPATIBLE-MT-GRAPH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "generalize_mt_pairs_for_incompatible_mt_assertions", "GENERALIZE-MT-PAIRS-FOR-INCOMPATIBLE-MT-ASSERTIONS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "common_spec_mt_existsP", "COMMON-SPEC-MT-EXISTS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "update_extensionally_incompatible_mt_assertions", "UPDATE-EXTENSIONALLY-INCOMPATIBLE-MT-ASSERTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.negation_mt", "update_extensionally_incompatible_mt_assertions_int", "UPDATE-EXTENSIONALLY-INCOMPATIBLE-MT-ASSERTIONS-INT", 2, 0, false);
        return (SubLObject)negation_mt.NIL;
    }
    
    public static SubLObject init_negation_mt_file() {
        negation_mt.$no_of_ext_incompatiable_mt_assertions_to_be_unasserted$ = SubLFiles.defparameter("*NO-OF-EXT-INCOMPATIABLE-MT-ASSERTIONS-TO-BE-UNASSERTED*", (SubLObject)negation_mt.TWENTY_INTEGER);
        return (SubLObject)negation_mt.NIL;
    }
    
    public static SubLObject setup_negation_mt_file() {
        utilities_macros.register_kb_function((SubLObject)negation_mt.$sym2$INCOMPATIBLE_MT_AFTER_ADDING);
        utilities_macros.register_kb_function((SubLObject)negation_mt.$sym3$INCOMPATIBLE_MT_AFTER_REMOVING);
        utilities_macros.register_kb_function((SubLObject)negation_mt.$sym4$PROPAGATE_TO_INCOMPATIBLE_MT);
        utilities_macros.register_kb_function((SubLObject)negation_mt.$sym6$INTENSIONALLY_INCOMPATIBLE_MT_AFTER_ADDING);
        utilities_macros.register_kb_function((SubLObject)negation_mt.$sym7$INTENSIONALLY_INCOMPATIBLE_MT_AFTER_REMOVING);
        utilities_macros.register_kb_function((SubLObject)negation_mt.$sym8$UPDATE_EXTENSIONALLY_INCOMPATIBLE_MT_ASSERTIONS);
        return (SubLObject)negation_mt.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_negation_mt_file();
    }
    
    @Override
	public void initializeVariables() {
        init_negation_mt_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_negation_mt_file();
    }
    
    static {
        me = (SubLFile)new negation_mt();
        negation_mt.$no_of_ext_incompatiable_mt_assertions_to_be_unasserted$ = null;
        $const0$negationMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationMt"));
        $const1$incompatibleMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("incompatibleMt"));
        $sym2$INCOMPATIBLE_MT_AFTER_ADDING = SubLObjectFactory.makeSymbol("INCOMPATIBLE-MT-AFTER-ADDING");
        $sym3$INCOMPATIBLE_MT_AFTER_REMOVING = SubLObjectFactory.makeSymbol("INCOMPATIBLE-MT-AFTER-REMOVING");
        $sym4$PROPAGATE_TO_INCOMPATIBLE_MT = SubLObjectFactory.makeSymbol("PROPAGATE-TO-INCOMPATIBLE-MT");
        $const5$intensionallyIncompatibleMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("intensionallyIncompatibleMt"));
        $sym6$INTENSIONALLY_INCOMPATIBLE_MT_AFTER_ADDING = SubLObjectFactory.makeSymbol("INTENSIONALLY-INCOMPATIBLE-MT-AFTER-ADDING");
        $sym7$INTENSIONALLY_INCOMPATIBLE_MT_AFTER_REMOVING = SubLObjectFactory.makeSymbol("INTENSIONALLY-INCOMPATIBLE-MT-AFTER-REMOVING");
        $sym8$UPDATE_EXTENSIONALLY_INCOMPATIBLE_MT_ASSERTIONS = SubLObjectFactory.makeSymbol("UPDATE-EXTENSIONALLY-INCOMPATIBLE-MT-ASSERTIONS");
        $sym9$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const10$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GAF"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH"));
        $const12$extensionallyIncompatibleMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("extensionallyIncompatibleMt"));
        $sym13$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $str14$The_function_update_extensionally = SubLObjectFactory.makeString("The function update-extensionally-incompatible-mt-assertions-int was terminated prematurely.");
    }
}

/*

	Total time: 205 ms
	
*/