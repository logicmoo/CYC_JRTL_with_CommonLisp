package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_what_mts;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_implied_relations;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class disjoint_with extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.disjoint_with";
    public static final String myFingerPrint = "3282973491d945c2997f39b7a1ba8f4ff1d2625720e16ca109bb47952186fb93";
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 8274L)
    private static SubLSymbol $any_disjoint_with_anyP_cached_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 15929L)
    private static SubLSymbol $maximal_consistent_subsets$;
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 16078L)
    private static SubLSymbol $maximal_consistent_subsets_visited_subsets$;
    private static final SubLObject $const0$disjointWith;
    private static final SubLSymbol $sym1$LISTP;
    private static final SubLSymbol $sym2$ANY_DISJOINT_COLLECTION_PAIR;
    private static final SubLList $list3;
    private static final SubLString $str4$Returns_a_pair_of_disjoint_elemen;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLObject $const7$genls;
    private static final SubLSymbol $kw8$ISA;
    private static final SubLObject $const9$isa;
    private static final SubLSymbol $kw10$DISJOINTWITH;
    private static final SubLSymbol $sym11$ANY_DISJOINT_WITH_ANY__MEMOIZED_INT;
    private static final SubLSymbol $sym12$ANY_DISJOINT_WITH_ANY__CACHED;
    private static final SubLSymbol $sym13$_EXIT;
    private static final SubLSymbol $sym14$_ANY_DISJOINT_WITH_ANY__CACHED_CACHING_STATE_;
    private static final SubLInteger $int15$4096;
    private static final SubLSymbol $sym16$CLEAR_ANY_DISJOINT_WITH_ANY__CACHED;
    private static final SubLSymbol $sym17$ANY_DISJOINT_COLLECTION_PAIR_;
    private static final SubLString $str18$Are_any_two_collections_in_COLS_d;
    private static final SubLList $list19;
    private static final SubLSymbol $sym20$EL_FORT_P;
    private static final SubLSymbol $sym21$COLLECTIONS_DISJOINT_;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLString $str24$_see_disjoint_with_;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$WHY_COLLECTIONS_DISJOINT_;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLString $str29$_see_why_disjoint_with_;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$MDW_AFTER_ADDING;
    private static final SubLSymbol $sym33$MDW_AFTER_REMOVING;
    private static final SubLSymbol $sym34$SUPERSETP;
    private static final SubLSymbol $sym35$SUBSETP;
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 778L)
    public static SubLObject local_disjoint_with(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        return sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), col, mt, tv, (SubLObject)disjoint_with.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 1299L)
    public static SubLObject local_max_disjoint_with(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        return sbhl_search_methods.sbhl_max_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), col, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 1528L)
    public static SubLObject local_not_disjoint_with(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        return sbhl_link_methods.sbhl_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), col, mt, tv, (SubLObject)disjoint_with.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 1763L)
    public static SubLObject local_min_not_disjoint_with(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        return sbhl_search_methods.sbhl_min_forward_false_link_nodes(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), col, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 2000L)
    public static SubLObject all_disjoint_with(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        return sbhl_search_implied_relations.sbhl_all_implied_disjoins(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), col, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 2236L)
    public static SubLObject all_not_disjoint_with(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        return sbhl_search_methods.sbhl_all_forward_false_nodes(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), col, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 2423L)
    public static SubLObject max_all_disjoint_with(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_max_disjoins(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), col, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 2657L)
    public static SubLObject max_all_disjoint_with_no_sdc(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        return sbhl_search_methods.sbhl_max_true_disjoins(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), col, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 2889L)
    public static SubLObject min_all_not_disjoint_with(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        return sbhl_search_methods.sbhl_implied_min_false_disjoins(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), col, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 3103L)
    public static SubLObject min_implied_not_disjoint_with(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        return sbhl_search_methods.sbhl_leaf_nodes(sbhl_module_utilities.get_sbhl_reductions_module(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith)), col, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 3313L)
    public static SubLObject min_all_asserted_not_disjoint_with(final SubLObject col, SubLObject mt, SubLObject tv) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        return sbhl_search_methods.sbhl_min_asserted_false_disjoins(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), col, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 3545L)
    public static SubLObject any_disjoint_collection_pair(final SubLObject cols, SubLObject mt) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        enforceType(cols, disjoint_with.$sym1$LISTP);
        SubLObject disjoint = (SubLObject)disjoint_with.NIL;
        SubLObject n = (SubLObject)disjoint_with.ZERO_INTEGER;
        if (disjoint_with.NIL == disjoint) {
            SubLObject csome_list_var = cols;
            SubLObject col_1 = (SubLObject)disjoint_with.NIL;
            col_1 = csome_list_var.first();
            while (disjoint_with.NIL == disjoint && disjoint_with.NIL != csome_list_var) {
                n = Numbers.add(n, (SubLObject)disjoint_with.ONE_INTEGER);
                if (disjoint_with.NIL == disjoint) {
                    SubLObject csome_list_var_$1 = conses_high.nthcdr(n, cols);
                    SubLObject col_2 = (SubLObject)disjoint_with.NIL;
                    col_2 = csome_list_var_$1.first();
                    while (disjoint_with.NIL == disjoint && disjoint_with.NIL != csome_list_var_$1) {
                        if (disjoint_with.NIL != disjoint_withP(col_1, col_2, mt, (SubLObject)disjoint_with.UNPROVIDED)) {
                            disjoint = (SubLObject)ConsesLow.list(col_1, col_2);
                        }
                        csome_list_var_$1 = csome_list_var_$1.rest();
                        col_2 = csome_list_var_$1.first();
                    }
                }
                csome_list_var = csome_list_var.rest();
                col_1 = csome_list_var.first();
            }
        }
        return disjoint;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 3998L)
    public static SubLObject sbhl_record_max_true_disjoint_with(final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        sbhl_marking_methods.sbhl_record_max_true_disjoins(sbhl_module_vars.get_sbhl_module(disjoint_with.$const7$genls), node, mt, tv);
        return (SubLObject)disjoint_with.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 4288L)
    public static SubLObject sbhl_unrecord_max_true_disjoint_with(final SubLObject node, SubLObject mt, SubLObject tv) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        sbhl_marking_methods.sbhl_unrecord_max_true_disjoins(sbhl_module_vars.get_sbhl_module(disjoint_with.$const7$genls), node, mt, tv);
        return (SubLObject)disjoint_with.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 4526L)
    public static SubLObject instances_of_disjoint_collectionsP(final SubLObject term1, final SubLObject term2, SubLObject mt, SubLObject tv) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        if (term1.eql(term2)) {
            return (SubLObject)disjoint_with.NIL;
        }
        final SubLObject term1_isas = isa.min_isa(term1, mt, tv);
        final SubLObject term2_isas = isa.min_isa(term2, mt, tv);
        return any_disjoint_with_anyP(term1_isas, term2_isas, mt, tv, (SubLObject)disjoint_with.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 4904L)
    public static SubLObject why_instances_of_disjoint_collections(final SubLObject term1, final SubLObject term2, SubLObject mt, SubLObject tv) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = (SubLObject)disjoint_with.NIL;
        SubLObject disjointP = (SubLObject)disjoint_with.NIL;
        if (term1.eql(term2)) {
            return (SubLObject)disjoint_with.NIL;
        }
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)disjoint_with.FOUR_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)disjoint_with.T, thread);
            final SubLObject term1_isas = isa.min_isa(term1, mt, tv);
            final SubLObject term2_isas = isa.min_isa(term2, mt, tv);
            if (disjoint_with.NIL == disjointP) {
                SubLObject csome_list_var = term1_isas;
                SubLObject term1_isa = (SubLObject)disjoint_with.NIL;
                term1_isa = csome_list_var.first();
                while (disjoint_with.NIL == disjointP && disjoint_with.NIL != csome_list_var) {
                    if (disjoint_with.NIL == disjointP) {
                        SubLObject csome_list_var_$2 = term2_isas;
                        SubLObject term2_isa = (SubLObject)disjoint_with.NIL;
                        term2_isa = csome_list_var_$2.first();
                        while (disjoint_with.NIL == disjointP && disjoint_with.NIL != csome_list_var_$2) {
                            if (disjoint_with.NIL != disjoint_withP(term1_isa, term2_isa, mt, tv)) {
                                supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)disjoint_with.$kw8$ISA, el_utilities.make_binary_formula(disjoint_with.$const9$isa, term1, term1_isa), (SubLObject)disjoint_with.UNPROVIDED, (SubLObject)disjoint_with.UNPROVIDED), supports);
                                supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)disjoint_with.$kw8$ISA, el_utilities.make_binary_formula(disjoint_with.$const9$isa, term2, term2_isa), (SubLObject)disjoint_with.UNPROVIDED, (SubLObject)disjoint_with.UNPROVIDED), supports);
                                supports = (SubLObject)ConsesLow.cons(arguments.make_hl_support((SubLObject)disjoint_with.$kw10$DISJOINTWITH, el_utilities.make_binary_formula(disjoint_with.$const0$disjointWith, term1_isa, term2_isa), (SubLObject)disjoint_with.UNPROVIDED, (SubLObject)disjoint_with.UNPROVIDED), supports);
                                disjointP = (SubLObject)disjoint_with.T;
                            }
                            csome_list_var_$2 = csome_list_var_$2.rest();
                            term2_isa = csome_list_var_$2.first();
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    term1_isa = csome_list_var.first();
                }
            }
        }
        finally {
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return supports;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 5861L)
    public static SubLObject disjoint_withP(final SubLObject c1, final SubLObject c2, SubLObject mt, SubLObject tv) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        if (disjoint_with.NIL != term.first_order_nautP(c1)) {
            return nat_disjoint_withP(c1, c2, mt, tv);
        }
        return sbhl_search_implied_relations.sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), c1, c2, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 6285L)
    public static SubLObject nat_disjoint_withP(final SubLObject nat_formula, final SubLObject col_2, SubLObject mt, SubLObject tv) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        final SubLObject nat = narts_high.find_nart(nat_formula);
        if (disjoint_with.NIL != nart_handles.nart_p(nat)) {
            return disjoint_withP(nat, col_2, mt, tv);
        }
        return any_disjoint_withP(genls.nat_min_genls(nat_formula, mt, (SubLObject)disjoint_with.UNPROVIDED), col_2, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 6638L)
    public static SubLObject any_disjoint_withP(final SubLObject c1s, final SubLObject c2, SubLObject mt, SubLObject tv) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        if (disjoint_with.NIL == c1s) {
            return (SubLObject)disjoint_with.NIL;
        }
        return sbhl_search_implied_relations.sbhl_any_with_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), c1s, c2, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 6864L)
    public static SubLObject any_disjoint_with_anyP(final SubLObject c1s, final SubLObject c2s, SubLObject mt, SubLObject tv, SubLObject assume_cols_not_self_disjointP) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        if (assume_cols_not_self_disjointP == disjoint_with.UNPROVIDED) {
            assume_cols_not_self_disjointP = (SubLObject)disjoint_with.NIL;
        }
        if (disjoint_with.NIL != assume_cols_not_self_disjointP) {
            final SubLObject use_c1P = list_utilities.lesser_length_p(c1s, c2s);
            final SubLObject shorter = (disjoint_with.NIL != use_c1P) ? c1s : c2s;
            final SubLObject longer = (disjoint_with.NIL != use_c1P) ? c2s : c1s;
            SubLObject cdolist_list_var = shorter;
            SubLObject c = (SubLObject)disjoint_with.NIL;
            c = cdolist_list_var.first();
            while (disjoint_with.NIL != cdolist_list_var) {
                if (disjoint_with.NIL != any_disjoint_withP(Sequences.remove(c, longer, Symbols.symbol_function((SubLObject)disjoint_with.EQUAL), (SubLObject)disjoint_with.UNPROVIDED, (SubLObject)disjoint_with.UNPROVIDED, (SubLObject)disjoint_with.UNPROVIDED, (SubLObject)disjoint_with.UNPROVIDED), c, mt, tv)) {
                    return (SubLObject)disjoint_with.T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                c = cdolist_list_var.first();
            }
            return (SubLObject)disjoint_with.NIL;
        }
        return sbhl_search_implied_relations.sbhl_implied_disjoins_relation_between_any_p(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), c1s, c2s, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 7550L)
    public static SubLObject any_disjoint_with_anyP_memoized(final SubLObject cols1, final SubLObject cols2, SubLObject mt, SubLObject assume_cols_not_self_disjointP, SubLObject ignoring_sdcP) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (assume_cols_not_self_disjointP == disjoint_with.UNPROVIDED) {
            assume_cols_not_self_disjointP = (SubLObject)disjoint_with.NIL;
        }
        if (ignoring_sdcP == disjoint_with.UNPROVIDED) {
            ignoring_sdcP = sdc.$ignoring_sdcP$.getDynamicValue();
        }
        return any_disjoint_with_anyP_memoized_int(kb_utilities.sort_terms(cols1, (SubLObject)disjoint_with.T, (SubLObject)disjoint_with.UNPROVIDED, (SubLObject)disjoint_with.UNPROVIDED, (SubLObject)disjoint_with.UNPROVIDED, (SubLObject)disjoint_with.UNPROVIDED, (SubLObject)disjoint_with.UNPROVIDED), kb_utilities.sort_terms(cols2, (SubLObject)disjoint_with.T, (SubLObject)disjoint_with.UNPROVIDED, (SubLObject)disjoint_with.UNPROVIDED, (SubLObject)disjoint_with.UNPROVIDED, (SubLObject)disjoint_with.UNPROVIDED, (SubLObject)disjoint_with.UNPROVIDED), mt, assume_cols_not_self_disjointP, ignoring_sdcP, (SubLObject)disjoint_with.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 7832L)
    public static SubLObject any_disjoint_with_anyP_memoized_int_internal(final SubLObject cols1, final SubLObject cols2, final SubLObject mt, final SubLObject assume_cols_not_self_disjointP, final SubLObject ignoring_sdcP, SubLObject exception_transfers_thru_specsP) {
        if (exception_transfers_thru_specsP == disjoint_with.UNPROVIDED) {
            exception_transfers_thru_specsP = sdc.$sdc_exception_transfers_thru_specsP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)disjoint_with.NIL;
        final SubLObject _prev_bind_0 = sdc.$ignoring_sdcP$.currentBinding(thread);
        try {
            sdc.$ignoring_sdcP$.bind(ignoring_sdcP, thread);
            result = any_disjoint_with_anyP_cached(cols1, cols2, mt, assume_cols_not_self_disjointP, ignoring_sdcP, exception_transfers_thru_specsP);
        }
        finally {
            sdc.$ignoring_sdcP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 7832L)
    public static SubLObject any_disjoint_with_anyP_memoized_int(final SubLObject cols1, final SubLObject cols2, final SubLObject mt, final SubLObject assume_cols_not_self_disjointP, final SubLObject ignoring_sdcP, SubLObject exception_transfers_thru_specsP) {
        if (exception_transfers_thru_specsP == disjoint_with.UNPROVIDED) {
            exception_transfers_thru_specsP = sdc.$sdc_exception_transfers_thru_specsP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)disjoint_with.NIL;
        if (disjoint_with.NIL == v_memoization_state) {
            return any_disjoint_with_anyP_memoized_int_internal(cols1, cols2, mt, assume_cols_not_self_disjointP, ignoring_sdcP, exception_transfers_thru_specsP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)disjoint_with.$sym11$ANY_DISJOINT_WITH_ANY__MEMOIZED_INT, (SubLObject)disjoint_with.UNPROVIDED);
        if (disjoint_with.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)disjoint_with.$sym11$ANY_DISJOINT_WITH_ANY__MEMOIZED_INT, (SubLObject)disjoint_with.SIX_INTEGER, (SubLObject)disjoint_with.NIL, (SubLObject)disjoint_with.EQUAL, (SubLObject)disjoint_with.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)disjoint_with.$sym11$ANY_DISJOINT_WITH_ANY__MEMOIZED_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(cols1, cols2, mt, assume_cols_not_self_disjointP, ignoring_sdcP, exception_transfers_thru_specsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)disjoint_with.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)disjoint_with.NIL;
            collision = cdolist_list_var.first();
            while (disjoint_with.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (cols1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (cols2.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (assume_cols_not_self_disjointP.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (ignoring_sdcP.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (disjoint_with.NIL != cached_args && disjoint_with.NIL == cached_args.rest() && exception_transfers_thru_specsP.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(any_disjoint_with_anyP_memoized_int_internal(cols1, cols2, mt, assume_cols_not_self_disjointP, ignoring_sdcP, exception_transfers_thru_specsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(cols1, cols2, mt, assume_cols_not_self_disjointP, ignoring_sdcP, exception_transfers_thru_specsP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 8274L)
    public static SubLObject clear_any_disjoint_with_anyP_cached() {
        final SubLObject cs = disjoint_with.$any_disjoint_with_anyP_cached_caching_state$.getGlobalValue();
        if (disjoint_with.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)disjoint_with.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 8274L)
    public static SubLObject remove_any_disjoint_with_anyP_cached(final SubLObject cols1, final SubLObject cols2, final SubLObject mt, final SubLObject assume_cols_not_self_disjointP, final SubLObject ignoring_sdcP, final SubLObject exception_transfers_thru_specsP) {
        return memoization_state.caching_state_remove_function_results_with_args(disjoint_with.$any_disjoint_with_anyP_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(cols1, cols2, mt, assume_cols_not_self_disjointP, ignoring_sdcP, exception_transfers_thru_specsP), (SubLObject)disjoint_with.UNPROVIDED, (SubLObject)disjoint_with.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 8274L)
    public static SubLObject any_disjoint_with_anyP_cached_internal(final SubLObject cols1, final SubLObject cols2, final SubLObject mt, final SubLObject assume_cols_not_self_disjointP, final SubLObject ignoring_sdcP, final SubLObject exception_transfers_thru_specsP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sdc.$sdc_exception_transfers_thru_specsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sdc.$ignoring_sdcP$.currentBinding(thread);
        try {
            sdc.$sdc_exception_transfers_thru_specsP$.bind(exception_transfers_thru_specsP, thread);
            sdc.$ignoring_sdcP$.bind(ignoring_sdcP, thread);
            return any_disjoint_with_anyP(cols1, cols2, mt, (SubLObject)disjoint_with.NIL, assume_cols_not_self_disjointP);
        }
        finally {
            sdc.$ignoring_sdcP$.rebind(_prev_bind_2, thread);
            sdc.$sdc_exception_transfers_thru_specsP$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 8274L)
    public static SubLObject any_disjoint_with_anyP_cached(final SubLObject cols1, final SubLObject cols2, final SubLObject mt, final SubLObject assume_cols_not_self_disjointP, final SubLObject ignoring_sdcP, final SubLObject exception_transfers_thru_specsP) {
        SubLObject caching_state = disjoint_with.$any_disjoint_with_anyP_cached_caching_state$.getGlobalValue();
        if (disjoint_with.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)disjoint_with.$sym12$ANY_DISJOINT_WITH_ANY__CACHED, (SubLObject)disjoint_with.$sym14$_ANY_DISJOINT_WITH_ANY__CACHED_CACHING_STATE_, (SubLObject)disjoint_with.$int15$4096, (SubLObject)disjoint_with.EQUAL, (SubLObject)disjoint_with.SIX_INTEGER, (SubLObject)disjoint_with.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)disjoint_with.$sym16$CLEAR_ANY_DISJOINT_WITH_ANY__CACHED);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(cols1, cols2, mt, assume_cols_not_self_disjointP, ignoring_sdcP, exception_transfers_thru_specsP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)disjoint_with.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)disjoint_with.NIL;
            collision = cdolist_list_var.first();
            while (disjoint_with.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (cols1.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (cols2.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (assume_cols_not_self_disjointP.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (ignoring_sdcP.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (disjoint_with.NIL != cached_args && disjoint_with.NIL == cached_args.rest() && exception_transfers_thru_specsP.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(any_disjoint_with_anyP_cached_internal(cols1, cols2, mt, assume_cols_not_self_disjointP, ignoring_sdcP, exception_transfers_thru_specsP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(cols1, cols2, mt, assume_cols_not_self_disjointP, ignoring_sdcP, exception_transfers_thru_specsP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 8702L)
    public static SubLObject not_disjoint_withP(final SubLObject c1, final SubLObject c2, SubLObject mt, SubLObject tv) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        return sbhl_search_methods.sbhl_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), c1, c2, mt, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 9069L)
    public static SubLObject disjoint_with_specsP(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        final SubLObject max_disjoins = max_all_disjoint_with(col_1, mt, (SubLObject)disjoint_with.UNPROVIDED);
        return sbhl_search_methods.sbhl_inverse_relation_with_any_p(sbhl_module_vars.get_sbhl_module(disjoint_with.$const7$genls), col_2, max_disjoins, mt, (SubLObject)disjoint_with.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 9378L)
    public static SubLObject any_disjoint_collection_pairP(final SubLObject cols, SubLObject mt) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        enforceType(cols, disjoint_with.$sym1$LISTP);
        SubLObject disjointP = (SubLObject)disjoint_with.NIL;
        SubLObject n = (SubLObject)disjoint_with.ZERO_INTEGER;
        if (disjoint_with.NIL == disjointP) {
            SubLObject csome_list_var = cols;
            SubLObject col_1 = (SubLObject)disjoint_with.NIL;
            col_1 = csome_list_var.first();
            while (disjoint_with.NIL == disjointP && disjoint_with.NIL != csome_list_var) {
                n = Numbers.add(n, (SubLObject)disjoint_with.ONE_INTEGER);
                if (disjoint_with.NIL == disjointP) {
                    SubLObject csome_list_var_$3 = conses_high.nthcdr(n, cols);
                    SubLObject col_2 = (SubLObject)disjoint_with.NIL;
                    col_2 = csome_list_var_$3.first();
                    while (disjoint_with.NIL == disjointP && disjoint_with.NIL != csome_list_var_$3) {
                        if (disjoint_with.NIL != disjoint_withP(col_1, col_2, mt, (SubLObject)disjoint_with.UNPROVIDED)) {
                            disjointP = (SubLObject)disjoint_with.T;
                        }
                        csome_list_var_$3 = csome_list_var_$3.rest();
                        col_2 = csome_list_var_$3.first();
                    }
                }
                csome_list_var = csome_list_var.rest();
                col_1 = csome_list_var.first();
            }
        }
        return disjointP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 9803L)
    public static SubLObject collections_disjointP(final SubLObject col_1, final SubLObject col_2, SubLObject mt) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        enforceType(col_1, disjoint_with.$sym20$EL_FORT_P);
        enforceType(col_2, disjoint_with.$sym20$EL_FORT_P);
        return disjoint_withP(col_1, col_2, mt, (SubLObject)disjoint_with.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 10068L)
    public static SubLObject basis_for_not_mdwP(final SubLObject collection1, final SubLObject collection2, SubLObject mt, SubLObject tv) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject known_not_mdwP = (SubLObject)disjoint_with.NIL;
        if (collection1.eql(collection2)) {
            final SubLObject _prev_bind_0 = sbhl_module_vars.$assume_sbhl_extensions_nonempty$.currentBinding(thread);
            try {
                sbhl_module_vars.$assume_sbhl_extensions_nonempty$.bind((SubLObject)disjoint_with.NIL, thread);
                known_not_mdwP = not_disjoint_withP(collection1, collection2, mt, tv);
            }
            finally {
                sbhl_module_vars.$assume_sbhl_extensions_nonempty$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean((collection1.eql(collection2) && disjoint_with.NIL != known_not_mdwP) || (!collection1.eql(collection2) && disjoint_with.NIL != not_disjoint_withP(collection1, collection2, mt, tv)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 11039L)
    public static SubLObject why_disjoint_withP(final SubLObject c1, final SubLObject c2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        if (behavior == disjoint_with.UNPROVIDED) {
            behavior = (SubLObject)disjoint_with.NIL;
        }
        return sbhl_search_implied_relations.why_sbhl_implied_disjoins_relation_p(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), c1, c2, mt, tv, behavior);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 11311L)
    public static SubLObject why_collections_disjointP(final SubLObject c1, final SubLObject c2, SubLObject mt) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        enforceType(c1, disjoint_with.$sym20$EL_FORT_P);
        enforceType(c2, disjoint_with.$sym20$EL_FORT_P);
        return why_disjoint_withP(c1, c2, mt, (SubLObject)disjoint_with.UNPROVIDED, (SubLObject)disjoint_with.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 11570L)
    public static SubLObject why_not_disjoint_withP(final SubLObject c1, final SubLObject c2, SubLObject mt, SubLObject tv, SubLObject behavior) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        if (behavior == disjoint_with.UNPROVIDED) {
            behavior = (SubLObject)disjoint_with.NIL;
        }
        return sbhl_search_methods.why_sbhl_false_predicate_relation_p(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), c1, c2, mt, tv, behavior);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 11791L)
    public static SubLObject max_floor_mts_of_disjoint_with_paths(final SubLObject col1, final SubLObject col2, SubLObject tv) {
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), col1, col2, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 12153L)
    public static SubLObject min_mts_of_disjoint_with_paths(final SubLObject col1, final SubLObject col2, SubLObject tv) {
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), col1, col2, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 12417L)
    public static SubLObject max_floor_mts_of_not_disjoint_with_paths(final SubLObject col1, final SubLObject col2, SubLObject tv) {
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        return sbhl_search_what_mts.sbhl_max_floor_mts_of_false_predicate_paths(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), col2, col1, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 12704L)
    public static SubLObject min_mts_of_not_disjoint_with_paths(final SubLObject col1, final SubLObject col2, SubLObject tv) {
        if (tv == disjoint_with.UNPROVIDED) {
            tv = (SubLObject)disjoint_with.NIL;
        }
        return sbhl_search_what_mts.sbhl_min_mts_of_false_predicate_paths(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), col2, col1, tv);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 12985L)
    public static SubLObject disjoint_with_mts(final SubLObject col) {
        return kb_accessors.pred_mts(col, disjoint_with.$const0$disjointWith, (SubLObject)disjoint_with.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 13269L)
    public static SubLObject asserted_disjoint_with(final SubLObject col, SubLObject mt) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), col, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 13486L)
    public static SubLObject asserted_not_disjoint_with(final SubLObject col, SubLObject mt) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        return sbhl_link_methods.sbhl_asserted_false_links(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), col, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 13709L)
    public static SubLObject supported_disjoint_with(final SubLObject col, SubLObject mt) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        return sbhl_link_methods.sbhl_supported_true_links(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), col, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 13929L)
    public static SubLObject supported_not_disjoint_with(final SubLObject col, SubLObject mt) {
        if (mt == disjoint_with.UNPROVIDED) {
            mt = (SubLObject)disjoint_with.NIL;
        }
        return sbhl_link_methods.sbhl_supported_false_links(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), col, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 14155L)
    public static SubLObject mdw_after_adding(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith));
        return (SubLObject)disjoint_with.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 14592L)
    public static SubLObject mdw_after_removing(SubLObject source, final SubLObject assertion) {
        sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith));
        return (SubLObject)disjoint_with.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 14862L)
    public static SubLObject clear_mdw_graph() {
        sbhl_link_methods.clear_sbhl_module_graph(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith));
        return (SubLObject)disjoint_with.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 15159L)
    public static SubLObject clear_node_mdw_links(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        try {
            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), thread);
            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith)), thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith)), thread);
            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)disjoint_with.NIL, thread);
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), thread);
            SubLObject cdolist_list_var = sbhl_link_methods.sbhl_link_mts(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith), node);
            SubLObject mt = (SubLObject)disjoint_with.NIL;
            mt = cdolist_list_var.first();
            while (disjoint_with.NIL != cdolist_list_var) {
                if (disjoint_with.NIL != fort_types_interface.collectionP(node)) {
                    sbhl_link_methods.clear_sbhl_links_within_mt(node, mt, (SubLObject)disjoint_with.UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                mt = cdolist_list_var.first();
            }
        }
        finally {
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_2, thread);
            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)disjoint_with.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 15421L)
    public static SubLObject reset_mdw_links(final SubLObject col) {
        final SubLObject mts = disjoint_with_mts(col);
        clear_node_mdw_links(col);
        SubLObject cdolist_list_var = mts;
        SubLObject mt = (SubLObject)disjoint_with.NIL;
        mt = cdolist_list_var.first();
        while (disjoint_with.NIL != cdolist_list_var) {
            if (disjoint_with.NIL != fort_types_interface.collectionP(col)) {
                reset_mdw_links_in_mt(col, mt);
            }
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        }
        return (SubLObject)disjoint_with.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 15632L)
    public static SubLObject reset_mdw_links_in_mt(final SubLObject col, final SubLObject mt) {
        sbhl_link_methods.sbhl_recompute_links(col, mt, sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith));
        return (SubLObject)disjoint_with.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 15757L)
    public static SubLObject reset_mdw_graph(SubLObject clearP) {
        if (clearP == disjoint_with.UNPROVIDED) {
            clearP = (SubLObject)disjoint_with.T;
        }
        if (disjoint_with.NIL != clearP) {
            clear_mdw_graph();
        }
        sbhl_link_methods.sbhl_recompute_graph_links(sbhl_module_vars.get_sbhl_module(disjoint_with.$const0$disjointWith));
        return (SubLObject)disjoint_with.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 16150L)
    public static SubLObject maximal_consistent_subsets(final SubLObject cols) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject disjointness_map = disjointness_map(cols);
        SubLObject subsets = (SubLObject)disjoint_with.NIL;
        if (disjoint_with.NIL != dictionary.dictionary_empty_p(disjointness_map)) {
            subsets = (SubLObject)ConsesLow.list(cols);
        }
        else {
            final SubLObject _prev_bind_0 = disjoint_with.$maximal_consistent_subsets$.currentBinding(thread);
            final SubLObject _prev_bind_2 = disjoint_with.$maximal_consistent_subsets_visited_subsets$.currentBinding(thread);
            try {
                disjoint_with.$maximal_consistent_subsets$.bind((SubLObject)disjoint_with.NIL, thread);
                disjoint_with.$maximal_consistent_subsets_visited_subsets$.bind(set.new_set(Symbols.symbol_function((SubLObject)disjoint_with.EQUAL), (SubLObject)disjoint_with.UNPROVIDED), thread);
                maximal_consistent_subsets_recursive(cols, disjointness_map);
                subsets = list_utilities.delete_subsumed_items(disjoint_with.$maximal_consistent_subsets$.getDynamicValue(thread), (SubLObject)disjoint_with.$sym34$SUPERSETP, (SubLObject)disjoint_with.UNPROVIDED);
            }
            finally {
                disjoint_with.$maximal_consistent_subsets_visited_subsets$.rebind(_prev_bind_2, thread);
                disjoint_with.$maximal_consistent_subsets$.rebind(_prev_bind_0, thread);
            }
        }
        return subsets;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 16623L)
    public static SubLObject maximal_consistent_subsetP(final SubLObject cols, final SubLObject subset) {
        SubLObject maximal_consistent_subsetP = (SubLObject)disjoint_with.NIL;
        if (disjoint_with.NIL != conses_high.subsetp(subset, cols, (SubLObject)disjoint_with.UNPROVIDED, (SubLObject)disjoint_with.UNPROVIDED)) {
            final SubLObject disjointness_map = disjointness_map(cols);
            if (disjoint_with.NIL == first_disjointness(subset, disjointness_map)) {
                final SubLObject remaining_cols = conses_high.set_difference(cols, subset, Symbols.symbol_function((SubLObject)disjoint_with.EQUAL), (SubLObject)disjoint_with.UNPROVIDED);
                SubLObject failureP = (SubLObject)disjoint_with.NIL;
                if (disjoint_with.NIL == failureP) {
                    SubLObject csome_list_var = remaining_cols;
                    SubLObject col = (SubLObject)disjoint_with.NIL;
                    col = csome_list_var.first();
                    while (disjoint_with.NIL == failureP && disjoint_with.NIL != csome_list_var) {
                        final SubLObject disjoint_cols = dictionary.dictionary_lookup_without_values(disjointness_map, col, (SubLObject)disjoint_with.UNPROVIDED);
                        if (disjoint_with.NIL == keyhash_utilities.fast_intersectP(subset, disjoint_cols, Symbols.symbol_function((SubLObject)disjoint_with.EQUAL), (SubLObject)disjoint_with.UNPROVIDED, (SubLObject)disjoint_with.UNPROVIDED)) {
                            failureP = (SubLObject)disjoint_with.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        col = csome_list_var.first();
                    }
                }
                maximal_consistent_subsetP = (SubLObject)SubLObjectFactory.makeBoolean(disjoint_with.NIL == failureP);
            }
        }
        return maximal_consistent_subsetP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 17286L)
    public static SubLObject maximal_consistent_subsets_recursive(final SubLObject cols, final SubLObject disjointness_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (disjoint_with.NIL == set.set_memberP(cols, disjoint_with.$maximal_consistent_subsets_visited_subsets$.getDynamicValue(thread)) && disjoint_with.NIL == subl_promotions.memberP(cols, disjoint_with.$maximal_consistent_subsets$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)disjoint_with.$sym35$SUBSETP), (SubLObject)disjoint_with.UNPROVIDED)) {
            set.set_add(cols, disjoint_with.$maximal_consistent_subsets_visited_subsets$.getDynamicValue(thread));
            final SubLObject first_disjointness = first_disjointness(cols, disjointness_map);
            if (disjoint_with.NIL != first_disjointness) {
                final SubLObject cols2 = Sequences.remove(first_disjointness.first(), cols, Symbols.symbol_function((SubLObject)disjoint_with.EQUAL), (SubLObject)disjoint_with.UNPROVIDED, (SubLObject)disjoint_with.UNPROVIDED, (SubLObject)disjoint_with.UNPROVIDED, (SubLObject)disjoint_with.UNPROVIDED);
                final SubLObject cols3 = conses_high.set_difference(cols, first_disjointness.rest(), Symbols.symbol_function((SubLObject)disjoint_with.EQUAL), (SubLObject)disjoint_with.UNPROVIDED);
                maximal_consistent_subsets_recursive(cols2, disjointness_map);
                maximal_consistent_subsets_recursive(cols3, disjointness_map);
            }
            else {
                disjoint_with.$maximal_consistent_subsets$.setDynamicValue((SubLObject)ConsesLow.cons(cols, disjoint_with.$maximal_consistent_subsets$.getDynamicValue(thread)), thread);
            }
        }
        return (SubLObject)disjoint_with.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 18004L)
    public static SubLObject disjointness_map(final SubLObject cols) {
        final SubLObject disjointness_map = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)disjoint_with.EQUAL), (SubLObject)disjoint_with.UNPROVIDED);
        SubLObject cdr_var;
        SubLObject col;
        SubLObject cdolist_list_var;
        SubLObject remainder;
        SubLObject other_col;
        for (cdr_var = (SubLObject)disjoint_with.NIL, cdr_var = cols; !cdr_var.isAtom(); cdr_var = cdr_var.rest()) {
            col = cdr_var.first();
            remainder = (cdolist_list_var = cdr_var.rest());
            other_col = (SubLObject)disjoint_with.NIL;
            other_col = cdolist_list_var.first();
            while (disjoint_with.NIL != cdolist_list_var) {
                if (disjoint_with.NIL != disjoint_withP(col, other_col, (SubLObject)disjoint_with.UNPROVIDED, (SubLObject)disjoint_with.UNPROVIDED)) {
                    dictionary_utilities.dictionary_pushnew(disjointness_map, col, other_col, Symbols.symbol_function((SubLObject)disjoint_with.EQUAL), (SubLObject)disjoint_with.UNPROVIDED);
                    dictionary_utilities.dictionary_pushnew(disjointness_map, other_col, col, Symbols.symbol_function((SubLObject)disjoint_with.EQUAL), (SubLObject)disjoint_with.UNPROVIDED);
                }
                cdolist_list_var = cdolist_list_var.rest();
                other_col = cdolist_list_var.first();
            }
        }
        return disjointness_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/disjoint-with.lisp", position = 18377L)
    public static SubLObject first_disjointness(final SubLObject subset, final SubLObject disjointness_map) {
        SubLObject first_disjointness;
        SubLObject cdr_var;
        SubLObject col;
        SubLObject tail;
        SubLObject disjoint_cols;
        SubLObject intersection;
        for (first_disjointness = (SubLObject)disjoint_with.NIL, cdr_var = (SubLObject)disjoint_with.NIL, cdr_var = subset; disjoint_with.NIL == first_disjointness && !cdr_var.isAtom(); cdr_var = cdr_var.rest()) {
            col = cdr_var.first();
            tail = cdr_var.rest();
            if (disjoint_with.NIL != tail) {
                disjoint_cols = dictionary.dictionary_lookup_without_values(disjointness_map, col, (SubLObject)disjoint_with.UNPROVIDED);
                intersection = keyhash_utilities.fast_intersection(disjoint_cols, tail, Symbols.symbol_function((SubLObject)disjoint_with.EQUAL), (SubLObject)disjoint_with.UNPROVIDED, (SubLObject)disjoint_with.UNPROVIDED);
                if (disjoint_with.NIL != intersection) {
                    first_disjointness = (SubLObject)ConsesLow.cons(col, intersection);
                }
            }
        }
        return first_disjointness;
    }
    
    public static SubLObject declare_disjoint_with_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "local_disjoint_with", "LOCAL-DISJOINT-WITH", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "local_max_disjoint_with", "LOCAL-MAX-DISJOINT-WITH", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "local_not_disjoint_with", "LOCAL-NOT-DISJOINT-WITH", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "local_min_not_disjoint_with", "LOCAL-MIN-NOT-DISJOINT-WITH", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "all_disjoint_with", "ALL-DISJOINT-WITH", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "all_not_disjoint_with", "ALL-NOT-DISJOINT-WITH", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "max_all_disjoint_with", "MAX-ALL-DISJOINT-WITH", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "max_all_disjoint_with_no_sdc", "MAX-ALL-DISJOINT-WITH-NO-SDC", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "min_all_not_disjoint_with", "MIN-ALL-NOT-DISJOINT-WITH", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "min_implied_not_disjoint_with", "MIN-IMPLIED-NOT-DISJOINT-WITH", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "min_all_asserted_not_disjoint_with", "MIN-ALL-ASSERTED-NOT-DISJOINT-WITH", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "any_disjoint_collection_pair", "ANY-DISJOINT-COLLECTION-PAIR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "sbhl_record_max_true_disjoint_with", "SBHL-RECORD-MAX-TRUE-DISJOINT-WITH", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "sbhl_unrecord_max_true_disjoint_with", "SBHL-UNRECORD-MAX-TRUE-DISJOINT-WITH", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "instances_of_disjoint_collectionsP", "INSTANCES-OF-DISJOINT-COLLECTIONS?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "why_instances_of_disjoint_collections", "WHY-INSTANCES-OF-DISJOINT-COLLECTIONS", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "disjoint_withP", "DISJOINT-WITH?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "nat_disjoint_withP", "NAT-DISJOINT-WITH?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "any_disjoint_withP", "ANY-DISJOINT-WITH?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "any_disjoint_with_anyP", "ANY-DISJOINT-WITH-ANY?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "any_disjoint_with_anyP_memoized", "ANY-DISJOINT-WITH-ANY?-MEMOIZED", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "any_disjoint_with_anyP_memoized_int_internal", "ANY-DISJOINT-WITH-ANY?-MEMOIZED-INT-INTERNAL", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "any_disjoint_with_anyP_memoized_int", "ANY-DISJOINT-WITH-ANY?-MEMOIZED-INT", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "clear_any_disjoint_with_anyP_cached", "CLEAR-ANY-DISJOINT-WITH-ANY?-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "remove_any_disjoint_with_anyP_cached", "REMOVE-ANY-DISJOINT-WITH-ANY?-CACHED", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "any_disjoint_with_anyP_cached_internal", "ANY-DISJOINT-WITH-ANY?-CACHED-INTERNAL", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "any_disjoint_with_anyP_cached", "ANY-DISJOINT-WITH-ANY?-CACHED", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "not_disjoint_withP", "NOT-DISJOINT-WITH?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "disjoint_with_specsP", "DISJOINT-WITH-SPECS?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "any_disjoint_collection_pairP", "ANY-DISJOINT-COLLECTION-PAIR?", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "collections_disjointP", "COLLECTIONS-DISJOINT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "basis_for_not_mdwP", "BASIS-FOR-NOT-MDW?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "why_disjoint_withP", "WHY-DISJOINT-WITH?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "why_collections_disjointP", "WHY-COLLECTIONS-DISJOINT?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "why_not_disjoint_withP", "WHY-NOT-DISJOINT-WITH?", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "max_floor_mts_of_disjoint_with_paths", "MAX-FLOOR-MTS-OF-DISJOINT-WITH-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "min_mts_of_disjoint_with_paths", "MIN-MTS-OF-DISJOINT-WITH-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "max_floor_mts_of_not_disjoint_with_paths", "MAX-FLOOR-MTS-OF-NOT-DISJOINT-WITH-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "min_mts_of_not_disjoint_with_paths", "MIN-MTS-OF-NOT-DISJOINT-WITH-PATHS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "disjoint_with_mts", "DISJOINT-WITH-MTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "asserted_disjoint_with", "ASSERTED-DISJOINT-WITH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "asserted_not_disjoint_with", "ASSERTED-NOT-DISJOINT-WITH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "supported_disjoint_with", "SUPPORTED-DISJOINT-WITH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "supported_not_disjoint_with", "SUPPORTED-NOT-DISJOINT-WITH", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "mdw_after_adding", "MDW-AFTER-ADDING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "mdw_after_removing", "MDW-AFTER-REMOVING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "clear_mdw_graph", "CLEAR-MDW-GRAPH", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "clear_node_mdw_links", "CLEAR-NODE-MDW-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "reset_mdw_links", "RESET-MDW-LINKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "reset_mdw_links_in_mt", "RESET-MDW-LINKS-IN-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "reset_mdw_graph", "RESET-MDW-GRAPH", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "maximal_consistent_subsets", "MAXIMAL-CONSISTENT-SUBSETS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "maximal_consistent_subsetP", "MAXIMAL-CONSISTENT-SUBSET?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "maximal_consistent_subsets_recursive", "MAXIMAL-CONSISTENT-SUBSETS-RECURSIVE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "disjointness_map", "DISJOINTNESS-MAP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.disjoint_with", "first_disjointness", "FIRST-DISJOINTNESS", 2, 0, false);
        return (SubLObject)disjoint_with.NIL;
    }
    
    public static SubLObject init_disjoint_with_file() {
        disjoint_with.$any_disjoint_with_anyP_cached_caching_state$ = SubLFiles.deflexical("*ANY-DISJOINT-WITH-ANY?-CACHED-CACHING-STATE*", (SubLObject)disjoint_with.NIL);
        disjoint_with.$maximal_consistent_subsets$ = SubLFiles.defparameter("*MAXIMAL-CONSISTENT-SUBSETS*", (SubLObject)disjoint_with.NIL);
        disjoint_with.$maximal_consistent_subsets_visited_subsets$ = SubLFiles.defparameter("*MAXIMAL-CONSISTENT-SUBSETS-VISITED-SUBSETS*", (SubLObject)disjoint_with.NIL);
        return (SubLObject)disjoint_with.NIL;
    }
    
    public static SubLObject setup_disjoint_with_file() {
        utilities_macros.register_cyc_api_function((SubLObject)disjoint_with.$sym2$ANY_DISJOINT_COLLECTION_PAIR, (SubLObject)disjoint_with.$list3, (SubLObject)disjoint_with.$str4$Returns_a_pair_of_disjoint_elemen, (SubLObject)disjoint_with.$list5, (SubLObject)disjoint_with.$list6);
        memoization_state.note_memoized_function((SubLObject)disjoint_with.$sym11$ANY_DISJOINT_WITH_ANY__MEMOIZED_INT);
        memoization_state.note_globally_cached_function((SubLObject)disjoint_with.$sym12$ANY_DISJOINT_WITH_ANY__CACHED);
        utilities_macros.register_cyc_api_function((SubLObject)disjoint_with.$sym17$ANY_DISJOINT_COLLECTION_PAIR_, (SubLObject)disjoint_with.$list3, (SubLObject)disjoint_with.$str18$Are_any_two_collections_in_COLS_d, (SubLObject)disjoint_with.$list5, (SubLObject)disjoint_with.$list19);
        utilities_macros.register_obsolete_cyc_api_function((SubLObject)disjoint_with.$sym21$COLLECTIONS_DISJOINT_, (SubLObject)disjoint_with.$list22, (SubLObject)disjoint_with.$list23, (SubLObject)disjoint_with.$str24$_see_disjoint_with_, (SubLObject)disjoint_with.$list25, (SubLObject)disjoint_with.$list19);
        utilities_macros.register_obsolete_cyc_api_function((SubLObject)disjoint_with.$sym26$WHY_COLLECTIONS_DISJOINT_, (SubLObject)disjoint_with.$list27, (SubLObject)disjoint_with.$list28, (SubLObject)disjoint_with.$str29$_see_why_disjoint_with_, (SubLObject)disjoint_with.$list30, (SubLObject)disjoint_with.$list31);
        utilities_macros.register_kb_function((SubLObject)disjoint_with.$sym32$MDW_AFTER_ADDING);
        utilities_macros.register_kb_function((SubLObject)disjoint_with.$sym33$MDW_AFTER_REMOVING);
        return (SubLObject)disjoint_with.NIL;
    }
    
    public void declareFunctions() {
        declare_disjoint_with_file();
    }
    
    public void initializeVariables() {
        init_disjoint_with_file();
    }
    
    public void runTopLevelForms() {
        setup_disjoint_with_file();
    }
    
    static {
        me = (SubLFile)new disjoint_with();
        disjoint_with.$any_disjoint_with_anyP_cached_caching_state$ = null;
        disjoint_with.$maximal_consistent_subsets$ = null;
        disjoint_with.$maximal_consistent_subsets_visited_subsets$ = null;
        $const0$disjointWith = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $sym1$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym2$ANY_DISJOINT_COLLECTION_PAIR = SubLObjectFactory.makeSymbol("ANY-DISJOINT-COLLECTION-PAIR");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str4$Returns_a_pair_of_disjoint_elemen = SubLObjectFactory.makeString("Returns a pair of disjoint elements of COLS (if any exist)");
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COLS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")));
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("FORT-P")));
        $const7$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $kw8$ISA = SubLObjectFactory.makeKeyword("ISA");
        $const9$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw10$DISJOINTWITH = SubLObjectFactory.makeKeyword("DISJOINTWITH");
        $sym11$ANY_DISJOINT_WITH_ANY__MEMOIZED_INT = SubLObjectFactory.makeSymbol("ANY-DISJOINT-WITH-ANY?-MEMOIZED-INT");
        $sym12$ANY_DISJOINT_WITH_ANY__CACHED = SubLObjectFactory.makeSymbol("ANY-DISJOINT-WITH-ANY?-CACHED");
        $sym13$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym14$_ANY_DISJOINT_WITH_ANY__CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*ANY-DISJOINT-WITH-ANY?-CACHED-CACHING-STATE*");
        $int15$4096 = SubLObjectFactory.makeInteger(4096);
        $sym16$CLEAR_ANY_DISJOINT_WITH_ANY__CACHED = SubLObjectFactory.makeSymbol("CLEAR-ANY-DISJOINT-WITH-ANY?-CACHED");
        $sym17$ANY_DISJOINT_COLLECTION_PAIR_ = SubLObjectFactory.makeSymbol("ANY-DISJOINT-COLLECTION-PAIR?");
        $str18$Are_any_two_collections_in_COLS_d = SubLObjectFactory.makeString("Are any two collections in COLS disjoint?");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BOOLEANP"));
        $sym20$EL_FORT_P = SubLObjectFactory.makeSymbol("EL-FORT-P");
        $sym21$COLLECTIONS_DISJOINT_ = SubLObjectFactory.makeSymbol("COLLECTIONS-DISJOINT?");
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DISJOINT-WITH?"));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL-1"), (SubLObject)SubLObjectFactory.makeSymbol("COL-2"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str24$_see_disjoint_with_ = SubLObjectFactory.makeString("@see disjoint-with?");
        $list25 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL-1"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COL-2"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")));
        $sym26$WHY_COLLECTIONS_DISJOINT_ = SubLObjectFactory.makeSymbol("WHY-COLLECTIONS-DISJOINT?");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHY-DISJOINT-WITH?"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("C1"), (SubLObject)SubLObjectFactory.makeSymbol("C2"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $str29$_see_why_disjoint_with_ = SubLObjectFactory.makeString("@see why-disjoint-with?");
        $list30 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("C1"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("C2"), (SubLObject)SubLObjectFactory.makeSymbol("EL-FORT-P")));
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $sym32$MDW_AFTER_ADDING = SubLObjectFactory.makeSymbol("MDW-AFTER-ADDING");
        $sym33$MDW_AFTER_REMOVING = SubLObjectFactory.makeSymbol("MDW-AFTER-REMOVING");
        $sym34$SUPERSETP = SubLObjectFactory.makeSymbol("SUPERSETP");
        $sym35$SUBSETP = SubLObjectFactory.makeSymbol("SUBSETP");
    }
}

/*

	Total time: 323 ms
	
*/