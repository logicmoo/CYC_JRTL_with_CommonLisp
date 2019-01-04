package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class facets extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.facets";
    public static final String myFingerPrint = "d00f35e11eac0fdbba0292a70ebfc1db17a5f8d5b1cdaebc5473c4ee6d283b19";
    @SubLTranslatedFile.SubL(source = "cycl/facets.lisp", position = 879L)
    public static SubLSymbol $facet_predicates_disjoint$;
    @SubLTranslatedFile.SubL(source = "cycl/facets.lisp", position = 1097L)
    public static SubLSymbol $facet_predicates_not_disjoint$;
    @SubLTranslatedFile.SubL(source = "cycl/facets.lisp", position = 1202L)
    public static SubLSymbol $facet_predicates$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLSymbol $kw2$DISJOINT;
    private static final SubLSymbol $kw3$NOT_DISJOINT;
    private static final SubLSymbol $sym4$ASSERTION_P;
    private static final SubLSymbol $sym5$FACET_P;
    private static final SubLObject $const6$ThePartition;
    private static final SubLObject $const7$TheCovering;
    private static final SubLSymbol $sym8$GENERALITY_ESTIMATE_;
    private static final SubLSymbol $sym9$APPEND;
    private static final SubLSymbol $sym10$COLLECTION_P;
    private static final SubLSymbol $sym11$RELEVANT_MT_IS_GENL_MT;
    private static final SubLObject $const12$facets_Partition;
    private static final SubLObject $const13$partitionedInto;
    private static final SubLObject $const14$facets_Strict;
    private static final SubLList $list15;
    private static final SubLSymbol $kw16$TRUE;
    private static final SubLSymbol $kw17$FALSE;
    private static final SubLSymbol $kw18$ASSERTED_TRUE;
    private static final SubLSymbol $kw19$REDUNDANT_TRUE;
    private static final SubLSymbol $kw20$COEXTENSIONAL;
    private static final SubLSymbol $kw21$REDUNDANT_FALSE;
    private static final SubLSymbol $kw22$ASSERTED_FALSE;
    
    @SubLTranslatedFile.SubL(source = "cycl/facets.lisp", position = 1414L)
    public static SubLObject facet_predicates(SubLObject type) {
        if (type == facets.UNPROVIDED) {
            type = (SubLObject)facets.NIL;
        }
        if (facets.NIL == type) {
            return facets.$facet_predicates$.getGlobalValue();
        }
        if (type == facets.$kw2$DISJOINT) {
            return facets.$facet_predicates_disjoint$.getGlobalValue();
        }
        if (type == facets.$kw3$NOT_DISJOINT) {
            return facets.$facet_predicates_not_disjoint$.getGlobalValue();
        }
        return (SubLObject)facets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/facets.lisp", position = 1736L)
    public static SubLObject facet_p(final SubLObject facet) {
        assert facets.NIL != assertion_handles.assertion_p(facet) : facet;
        if (facets.NIL != subl_promotions.memberP(cycl_utilities.formula_arg0(assertions_high.assertion_formula(facet)), facet_predicates((SubLObject)facets.UNPROVIDED), (SubLObject)facets.UNPROVIDED, (SubLObject)facets.UNPROVIDED)) {
            return (SubLObject)facets.T;
        }
        return (SubLObject)facets.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/facets.lisp", position = 2148L)
    public static SubLObject facet_assertion(final SubLObject facet) {
        assert facets.NIL != facet_p(facet) : facet;
        return facet;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/facets.lisp", position = 2297L)
    public static SubLObject facet_id(final SubLObject facet) {
        assert facets.NIL != facet_p(facet) : facet;
        return assertion_handles.assertion_id(facet);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/facets.lisp", position = 2454L)
    public static SubLObject find_facet_by_id(final SubLObject facet_id) {
        return assertion_handles.find_assertion_by_id(facet_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/facets.lisp", position = 2604L)
    public static SubLObject facet_strength(final SubLObject facet) {
        assert facets.NIL != facet_p(facet) : facet;
        final SubLObject facet_formula = assertions_high.assertion_formula(facet);
        return cycl_utilities.formula_arg0(facet_formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/facets.lisp", position = 2830L)
    public static SubLObject facet_col(final SubLObject facet) {
        assert facets.NIL != facet_p(facet) : facet;
        final SubLObject facet_formula = assertions_high.assertion_formula(facet);
        return cycl_utilities.formula_arg1(facet_formula, (SubLObject)facets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/facets.lisp", position = 3034L)
    public static SubLObject facet_col_type(final SubLObject facet) {
        assert facets.NIL != facet_p(facet) : facet;
        final SubLObject facet_formula = assertions_high.assertion_formula(facet);
        return cycl_utilities.formula_arg2(facet_formula, (SubLObject)facets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/facets.lisp", position = 3259L)
    public static SubLObject facet_mt(final SubLObject facet) {
        assert facets.NIL != facet_p(facet) : facet;
        return assertions_high.assertion_mt(facet);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/facets.lisp", position = 3404L)
    public static SubLObject facet_instances(final SubLObject facet, SubLObject mt) {
        if (mt == facets.UNPROVIDED) {
            mt = (SubLObject)facets.NIL;
        }
        assert facets.NIL != facet_p(facet) : facet;
        final SubLObject facet_col_type = facet_col_type(facet);
        SubLObject v_instances = (SubLObject)facets.NIL;
        if (facets.$const6$ThePartition.equal(cycl_utilities.formula_arg0(facet_col_type)) || facets.$const7$TheCovering.equal(cycl_utilities.formula_arg0(facet_col_type))) {
            v_instances = conses_high.copy_tree(cycl_utilities.formula_args(facet_col_type, (SubLObject)facets.UNPROVIDED));
        }
        else {
            v_instances = isa.all_fort_instances(facet_col_type, mt, (SubLObject)facets.UNPROVIDED);
        }
        return v_instances;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/facets.lisp", position = 3987L)
    public static SubLObject facet_instances_in_facet_mt(final SubLObject facet) {
        assert facets.NIL != facet_p(facet) : facet;
        final SubLObject mt = facet_mt(facet);
        return facet_instances(facet, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/facets.lisp", position = 4271L)
    public static SubLObject facets_from_cols(final SubLObject cols, SubLObject mt) {
        if (mt == facets.UNPROVIDED) {
            mt = (SubLObject)facets.NIL;
        }
        SubLObject all_facets = (SubLObject)facets.NIL;
        SubLObject all_col_types_list = (SubLObject)facets.NIL;
        SubLObject all_col_types = (SubLObject)facets.NIL;
        SubLObject cdolist_list_var = Sequences.nreverse(Sort.sort(cols, Symbols.symbol_function((SubLObject)facets.$sym8$GENERALITY_ESTIMATE_), (SubLObject)facets.UNPROVIDED));
        SubLObject col = (SubLObject)facets.NIL;
        col = cdolist_list_var.first();
        while (facets.NIL != cdolist_list_var) {
            all_col_types_list = (SubLObject)ConsesLow.cons(all_col_types(col), all_col_types_list);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        all_col_types = Functions.apply(Symbols.symbol_function((SubLObject)facets.$sym9$APPEND), all_col_types_list);
        all_col_types = list_utilities.remove_if_not(Symbols.symbol_function((SubLObject)facets.$sym10$COLLECTION_P), all_col_types, (SubLObject)facets.UNPROVIDED, (SubLObject)facets.UNPROVIDED, (SubLObject)facets.UNPROVIDED, (SubLObject)facets.UNPROVIDED);
        all_col_types = genls.min_cols(all_col_types, mt, (SubLObject)facets.UNPROVIDED);
        all_facets = facets_from_col_types(all_col_types, mt);
        return all_facets;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/facets.lisp", position = 5427L)
    public static SubLObject facets_from_col_types(final SubLObject col_types, SubLObject mt) {
        if (mt == facets.UNPROVIDED) {
            mt = (SubLObject)facets.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_facets = (SubLObject)facets.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)facets.$sym11$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            SubLObject cdolist_list_var = col_types;
            SubLObject col_type = (SubLObject)facets.NIL;
            col_type = cdolist_list_var.first();
            while (facets.NIL != cdolist_list_var) {
                SubLObject foundP = (SubLObject)facets.NIL;
                SubLObject some_assertions = (SubLObject)facets.NIL;
                if (facets.NIL == foundP) {
                    SubLObject csome_list_var = facets.$facet_predicates$.getGlobalValue();
                    SubLObject facet_pred = (SubLObject)facets.NIL;
                    facet_pred = csome_list_var.first();
                    while (facets.NIL == foundP && facets.NIL != csome_list_var) {
                        some_assertions = kb_mapping.gather_gaf_arg_index(col_type, (SubLObject)facets.TWO_INTEGER, facet_pred, (SubLObject)facets.UNPROVIDED, (SubLObject)facets.UNPROVIDED);
                        if (facets.NIL != some_assertions) {
                            SubLObject cdolist_list_var_$1 = some_assertions;
                            SubLObject an_assertion = (SubLObject)facets.NIL;
                            an_assertion = cdolist_list_var_$1.first();
                            while (facets.NIL != cdolist_list_var_$1) {
                                final SubLObject item_var = an_assertion;
                                if (facets.NIL == conses_high.member(item_var, all_facets, Symbols.symbol_function((SubLObject)facets.EQL), Symbols.symbol_function((SubLObject)facets.IDENTITY))) {
                                    all_facets = (SubLObject)ConsesLow.cons(item_var, all_facets);
                                }
                                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                                an_assertion = cdolist_list_var_$1.first();
                            }
                            foundP = (SubLObject)facets.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        facet_pred = csome_list_var.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                col_type = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(all_facets);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/facets.lisp", position = 6038L)
    public static SubLObject all_facets_with_mt(final SubLObject fort, SubLObject mt) {
        if (mt == facets.UNPROVIDED) {
            mt = (SubLObject)facets.NIL;
        }
        return facets_from_cols(isa.all_isa(fort, mt, (SubLObject)facets.UNPROVIDED), mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/facets.lisp", position = 6428L)
    public static SubLObject current_fort_faceting(final SubLObject fort, final SubLObject facet, SubLObject mt) {
        if (mt == facets.UNPROVIDED) {
            mt = (SubLObject)facets.NIL;
        }
        SubLObject sup_facet_cols = (SubLObject)facets.NIL;
        SubLObject not_sup_facet_cols = (SubLObject)facets.NIL;
        final SubLObject facet_strength = facet_strength(facet);
        final SubLObject all_fort_instances = facet_instances(facet, mt);
        sup_facet_cols = isa.all_isa_among(fort, all_fort_instances, mt, (SubLObject)facets.UNPROVIDED);
        if (facets.$const12$facets_Partition.equal(facet_strength) || facets.$const13$partitionedInto.equal(facet_strength) || facets.$const14$facets_Strict.equal(facet_strength)) {
            if (facets.NIL != all_fort_instances && facets.NIL != sup_facet_cols) {
                not_sup_facet_cols = conses_high.set_difference(all_fort_instances, sup_facet_cols, (SubLObject)facets.UNPROVIDED, (SubLObject)facets.UNPROVIDED);
            }
        }
        else {
            not_sup_facet_cols = isa.not_isa_among(fort, all_fort_instances, mt, (SubLObject)facets.UNPROVIDED);
        }
        return Values.values(sup_facet_cols, not_sup_facet_cols);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/facets.lisp", position = 7354L)
    public static SubLObject all_col_types(final SubLObject col) {
        SubLObject all_col_types = (SubLObject)facets.NIL;
        SubLObject cdolist_list_var = facets.$facet_predicates$.getGlobalValue();
        SubLObject facet_predicate = (SubLObject)facets.NIL;
        facet_predicate = cdolist_list_var.first();
        while (facets.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2;
            final SubLObject possible_col_types = cdolist_list_var_$2 = kb_mapping_utilities.pred_values_in_any_mt(col, facet_predicate, (SubLObject)facets.UNPROVIDED, (SubLObject)facets.UNPROVIDED, (SubLObject)facets.UNPROVIDED);
            SubLObject possible_col_type = (SubLObject)facets.NIL;
            possible_col_type = cdolist_list_var_$2.first();
            while (facets.NIL != cdolist_list_var_$2) {
                if (facets.NIL != forts.fort_p(possible_col_type)) {
                    all_col_types = (SubLObject)ConsesLow.cons(possible_col_type, all_col_types);
                }
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                possible_col_type = cdolist_list_var_$2.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            facet_predicate = cdolist_list_var.first();
        }
        return all_col_types;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/facets.lisp", position = 7912L)
    public static SubLObject min_col_types(final SubLObject col) {
        return genls.min_cols(all_col_types(col), (SubLObject)facets.UNPROVIDED, (SubLObject)facets.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/facets.lisp", position = 8036L)
    public static SubLObject all_specs_no_instances_of(final SubLObject col, SubLObject filter_cols, SubLObject mt) {
        if (filter_cols == facets.UNPROVIDED) {
            filter_cols = (SubLObject)facets.NIL;
        }
        if (mt == facets.UNPROVIDED) {
            mt = (SubLObject)facets.NIL;
        }
        final SubLObject all_specs = genls.all_specs(col, mt, (SubLObject)facets.UNPROVIDED);
        SubLObject all_specs_ok = (SubLObject)facets.NIL;
        SubLObject cdolist_list_var = all_specs;
        SubLObject spec = (SubLObject)facets.NIL;
        spec = cdolist_list_var.first();
        while (facets.NIL != cdolist_list_var) {
            if (!spec.eql(col) && facets.NIL == isa.isa_anyP(spec, filter_cols, (SubLObject)facets.UNPROVIDED, (SubLObject)facets.UNPROVIDED)) {
                all_specs_ok = (SubLObject)ConsesLow.cons(spec, all_specs_ok);
            }
            cdolist_list_var = cdolist_list_var.rest();
            spec = cdolist_list_var.first();
        }
        return Sequences.nreverse(all_specs_ok);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/facets.lisp", position = 8533L)
    public static SubLObject all_specs_no_arbitrary(final SubLObject col, SubLObject mt) {
        if (mt == facets.UNPROVIDED) {
            mt = (SubLObject)facets.NIL;
        }
        return all_specs_no_instances_of(col, (SubLObject)facets.$list15, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/facets.lisp", position = 8656L)
    public static SubLObject all_genls_no_instances_of(final SubLObject col, final SubLObject filter_cols, SubLObject mt) {
        if (mt == facets.UNPROVIDED) {
            mt = (SubLObject)facets.NIL;
        }
        final SubLObject all_genls = genls.all_genls(col, mt, (SubLObject)facets.UNPROVIDED);
        SubLObject all_genls_ok = (SubLObject)facets.NIL;
        SubLObject cdolist_list_var = all_genls;
        SubLObject genl = (SubLObject)facets.NIL;
        genl = cdolist_list_var.first();
        while (facets.NIL != cdolist_list_var) {
            if (!genl.eql(col) && facets.NIL == isa.isa_anyP(genl, filter_cols, (SubLObject)facets.UNPROVIDED, (SubLObject)facets.UNPROVIDED)) {
                all_genls_ok = (SubLObject)ConsesLow.cons(genl, all_genls_ok);
            }
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        }
        return Sequences.nreverse(all_genls_ok);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/facets.lisp", position = 8958L)
    public static SubLObject all_genls_no_arbitrary(final SubLObject col, SubLObject mt) {
        if (mt == facets.UNPROVIDED) {
            mt = (SubLObject)facets.NIL;
        }
        return all_genls_no_instances_of(col, (SubLObject)facets.$list15, mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/facets.lisp", position = 9081L)
    public static SubLObject asserted_links(final SubLObject v_term, final SubLObject pred, final SubLObject inverseP, final SubLObject mt) {
        final SubLObject asserted_true = kb_mapping_utilities.pred_values_in_relevant_mts(v_term, pred, mt, (SubLObject)((facets.NIL != inverseP) ? facets.TWO_INTEGER : facets.ONE_INTEGER), (SubLObject)((facets.NIL != inverseP) ? facets.ONE_INTEGER : facets.TWO_INTEGER), (SubLObject)facets.$kw16$TRUE);
        final SubLObject asserted_false = kb_mapping_utilities.pred_values_in_relevant_mts(v_term, pred, mt, (SubLObject)((facets.NIL != inverseP) ? facets.TWO_INTEGER : facets.ONE_INTEGER), (SubLObject)((facets.NIL != inverseP) ? facets.ONE_INTEGER : facets.TWO_INTEGER), (SubLObject)facets.$kw17$FALSE);
        final SubLObject coextensional = (facets.NIL != inverseP) ? sbhl_search_methods.sbhl_all_forward_true_nodes_among(sbhl_module_vars.get_sbhl_module(pred), v_term, asserted_true, mt, (SubLObject)facets.UNPROVIDED) : sbhl_search_methods.sbhl_all_backward_true_nodes_among(sbhl_module_vars.get_sbhl_module(pred), v_term, asserted_true, mt, (SubLObject)facets.UNPROVIDED);
        final SubLObject strict_asserted_true = conses_high.set_difference(asserted_true, coextensional, (SubLObject)facets.UNPROVIDED, (SubLObject)facets.UNPROVIDED);
        final SubLObject strict_asserted_false = conses_high.set_difference(asserted_false, coextensional, (SubLObject)facets.UNPROVIDED, (SubLObject)facets.UNPROVIDED);
        final SubLObject reduced_asserted_true = (facets.NIL != inverseP) ? sbhl_search_methods.sbhl_max_nodes(sbhl_module_vars.get_sbhl_module(pred), strict_asserted_true, mt, (SubLObject)facets.UNPROVIDED, (SubLObject)facets.UNPROVIDED) : sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module(pred), strict_asserted_true, mt, (SubLObject)facets.UNPROVIDED);
        final SubLObject reduced_asserted_false = (facets.NIL != inverseP) ? sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module(pred), strict_asserted_true, mt, (SubLObject)facets.UNPROVIDED) : sbhl_search_methods.sbhl_max_nodes(sbhl_module_vars.get_sbhl_module(pred), strict_asserted_true, mt, (SubLObject)facets.UNPROVIDED, (SubLObject)facets.UNPROVIDED);
        final SubLObject redundant_true = list_utilities.fast_set_difference(strict_asserted_true, reduced_asserted_true, (SubLObject)facets.UNPROVIDED);
        final SubLObject redundant_false = list_utilities.fast_set_difference(strict_asserted_false, reduced_asserted_false, (SubLObject)facets.UNPROVIDED);
        return (SubLObject)ConsesLow.list(new SubLObject[] { facets.$kw18$ASSERTED_TRUE, asserted_true, facets.$kw19$REDUNDANT_TRUE, redundant_true, facets.$kw20$COEXTENSIONAL, coextensional, facets.$kw21$REDUNDANT_FALSE, redundant_false, facets.$kw22$ASSERTED_FALSE, asserted_false });
    }
    
    public static SubLObject declare_facets_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.facets", "facet_predicates", "FACET-PREDICATES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.facets", "facet_p", "FACET-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.facets", "facet_assertion", "FACET-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.facets", "facet_id", "FACET-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.facets", "find_facet_by_id", "FIND-FACET-BY-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.facets", "facet_strength", "FACET-STRENGTH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.facets", "facet_col", "FACET-COL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.facets", "facet_col_type", "FACET-COL-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.facets", "facet_mt", "FACET-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.facets", "facet_instances", "FACET-INSTANCES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.facets", "facet_instances_in_facet_mt", "FACET-INSTANCES-IN-FACET-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.facets", "facets_from_cols", "FACETS-FROM-COLS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.facets", "facets_from_col_types", "FACETS-FROM-COL-TYPES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.facets", "all_facets_with_mt", "ALL-FACETS-WITH-MT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.facets", "current_fort_faceting", "CURRENT-FORT-FACETING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.facets", "all_col_types", "ALL-COL-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.facets", "min_col_types", "MIN-COL-TYPES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.facets", "all_specs_no_instances_of", "ALL-SPECS-NO-INSTANCES-OF", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.facets", "all_specs_no_arbitrary", "ALL-SPECS-NO-ARBITRARY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.facets", "all_genls_no_instances_of", "ALL-GENLS-NO-INSTANCES-OF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.facets", "all_genls_no_arbitrary", "ALL-GENLS-NO-ARBITRARY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.facets", "asserted_links", "ASSERTED-LINKS", 4, 0, false);
        return (SubLObject)facets.NIL;
    }
    
    public static SubLObject init_facets_file() {
        facets.$facet_predicates_disjoint$ = SubLFiles.defconstant("*FACET-PREDICATES-DISJOINT*", (SubLObject)facets.$list0);
        facets.$facet_predicates_not_disjoint$ = SubLFiles.defconstant("*FACET-PREDICATES-NOT-DISJOINT*", (SubLObject)facets.$list1);
        facets.$facet_predicates$ = SubLFiles.defconstant("*FACET-PREDICATES*", ConsesLow.append(facets.$facet_predicates_disjoint$.getGlobalValue(), facets.$facet_predicates_not_disjoint$.getGlobalValue()));
        return (SubLObject)facets.NIL;
    }
    
    public static SubLObject setup_facets_file() {
        return (SubLObject)facets.NIL;
    }
    
    public void declareFunctions() {
        declare_facets_file();
    }
    
    public void initializeVariables() {
        init_facets_file();
    }
    
    public void runTopLevelForms() {
        setup_facets_file();
    }
    
    static {
        me = (SubLFile)new facets();
        facets.$facet_predicates_disjoint$ = null;
        facets.$facet_predicates_not_disjoint$ = null;
        facets.$facet_predicates$ = null;
        $list0 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("facets-Partition")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("partitionedInto")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("facets-Strict")));
        $list1 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("facets-Covering")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("covering")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("facets-Generic")));
        $kw2$DISJOINT = SubLObjectFactory.makeKeyword("DISJOINT");
        $kw3$NOT_DISJOINT = SubLObjectFactory.makeKeyword("NOT-DISJOINT");
        $sym4$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $sym5$FACET_P = SubLObjectFactory.makeSymbol("FACET-P");
        $const6$ThePartition = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThePartition"));
        $const7$TheCovering = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheCovering"));
        $sym8$GENERALITY_ESTIMATE_ = SubLObjectFactory.makeSymbol("GENERALITY-ESTIMATE<");
        $sym9$APPEND = SubLObjectFactory.makeSymbol("APPEND");
        $sym10$COLLECTION_P = SubLObjectFactory.makeSymbol("COLLECTION-P");
        $sym11$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $const12$facets_Partition = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("facets-Partition"));
        $const13$partitionedInto = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("partitionedInto"));
        $const14$facets_Strict = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("facets-Strict"));
        $list15 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ArbitraryUnion")));
        $kw16$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $kw17$FALSE = SubLObjectFactory.makeKeyword("FALSE");
        $kw18$ASSERTED_TRUE = SubLObjectFactory.makeKeyword("ASSERTED-TRUE");
        $kw19$REDUNDANT_TRUE = SubLObjectFactory.makeKeyword("REDUNDANT-TRUE");
        $kw20$COEXTENSIONAL = SubLObjectFactory.makeKeyword("COEXTENSIONAL");
        $kw21$REDUNDANT_FALSE = SubLObjectFactory.makeKeyword("REDUNDANT-FALSE");
        $kw22$ASSERTED_FALSE = SubLObjectFactory.makeKeyword("ASSERTED-FALSE");
    }
}

/*

	Total time: 195 ms
	
*/