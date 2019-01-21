package com.cyc.cycjava.cycl.sbhl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.forts;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_module_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities";
    public static final String myFingerPrint = "9b08827aff7eed9c1103401ff8faec1123031ac86b08a27d567e9554e06b5485";
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 1593L)
    private static SubLSymbol $get_sbhl_predicates_caching_state$;
    private static final SubLSymbol $sym0$FORT_P;
    private static final SubLSymbol $sym1$GET_SBHL_PREDICATES;
    private static final SubLSymbol $sym2$_GET_SBHL_PREDICATES_CACHING_STATE_;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$SBHL_MODULE_P;
    private static final SubLSymbol $kw5$NAUT_FORWARD_TRUE_GENERATORS;
    private static final SubLSymbol $kw6$MARKING_INCREMENT;
    private static final SubLSymbol $kw7$ADD_NODE_TO_RESULT_TEST;
    private static final SubLSymbol $kw8$ADD_UNMARKED_NODE_TO_RESULT_TEST;
    private static final SubLSymbol $kw9$ROOT;
    private static final SubLSymbol $kw10$TRANSFERS_VIA_ARG;
    private static final SubLSymbol $kw11$PREDICATE_SEARCH_P;
    private static final SubLSymbol $kw12$MODULE_INVERTS_ARGUMENTS;
    private static final SubLSymbol $kw13$INVERTS_ARGUMENTS_OF_MODULE;
    private static final SubLSymbol $kw14$MODULE_TAG;
    private static final SubLSymbol $kw15$GRAPH;
    private static final SubLSymbol $kw16$DISJOINS_MODULE;
    private static final SubLSymbol $kw17$TRANSFERS_THROUGH_MODULE;
    private static final SubLObject $const18$genlInverse;
    private static final SubLObject $const19$genlPreds;
    private static final SubLSymbol $kw20$ERROR;
    private static final SubLString $str21$_A_is_not_a__A;
    private static final SubLSymbol $sym22$SBHL_SEARCH_DIRECTION_P;
    private static final SubLSymbol $kw23$CERROR;
    private static final SubLString $str24$continue_anyway;
    private static final SubLSymbol $kw25$WARN;
    private static final SubLString $str26$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str27$invalid_sbhl_search_direction__a;
    private static final SubLSymbol $sym28$SBHL_PREDICATE_P;
    private static final SubLObject $const29$genls;
    private static final SubLSymbol $kw30$GENLS;
    private static final SubLObject $const31$isa;
    private static final SubLObject $const32$quotedIsa;
    private static final SubLSymbol $kw33$ISA;
    private static final SubLSymbol $kw34$GENLPREDS;
    private static final SubLObject $const35$genlMt;
    private static final SubLObject $const36$negationMt;
    private static final SubLSymbol $kw37$GENLMT;
    private static final SubLObject $const38$disjointWith;
    private static final SubLSymbol $kw39$DISJOINTWITH;
    private static final SubLObject $const40$negationPreds;
    private static final SubLObject $const41$negationInverse;
    private static final SubLSymbol $kw42$NEGATIONPREDS;
    private static final SubLSymbol $kw43$NEGATION;
    private static final SubLSymbol $kw44$SUPERIOR;
    private static final SubLSymbol $kw45$INFERIOR;
    private static final SubLObject $const46$Collection;
    private static final SubLObject $const47$Predicate;
    private static final SubLObject $const48$Microtheory;
    private static final SubLSymbol $sym49$COLLECTION_P;
    private static final SubLSymbol $sym50$MICROTHEORY_P;
    private static final SubLSymbol $sym51$PREDICATE_P;
    private static final SubLSymbol $sym52$FUNCTION_SYMBOL_P;
    private static final SubLSymbol $sym53$FUNCTION_SYMBOL_LIST_P;
    private static final SubLString $str54$Data___a__associated_with_propert;
    private static final SubLString $str55$No_data_associated_with_required_;
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 740L)
    public static SubLObject init_sbhl_module_data(final SubLObject predicate, final SubLObject data) {
        assert sbhl_module_utilities.NIL != forts.fort_p(predicate) : predicate;
        final SubLObject module = sbhl_module_vars.new_sbhl_module(predicate);
        SubLObject cdolist_list_var = data;
        SubLObject data_association = (SubLObject)sbhl_module_utilities.NIL;
        data_association = cdolist_list_var.first();
        while (sbhl_module_utilities.NIL != cdolist_list_var) {
            final SubLObject property = data_association.first();
            final SubLObject property_data = conses_high.second(data_association);
            sbhl_module_vars.set_sbhl_module_property(module, property, property_data);
            cdolist_list_var = cdolist_list_var.rest();
            data_association = cdolist_list_var.first();
        }
        new_sbhl_module_graph(module);
        sbhl_module_vars.add_sbhl_module(predicate, module);
        return (SubLObject)sbhl_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 1593L)
    public static SubLObject clear_get_sbhl_predicates() {
        final SubLObject cs = sbhl_module_utilities.$get_sbhl_predicates_caching_state$.getGlobalValue();
        if (sbhl_module_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)sbhl_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 1593L)
    public static SubLObject remove_get_sbhl_predicates() {
        return memoization_state.caching_state_remove_function_results_with_args(sbhl_module_utilities.$get_sbhl_predicates_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(sbhl_module_utilities.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)sbhl_module_utilities.UNPROVIDED, (SubLObject)sbhl_module_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 1593L)
    public static SubLObject get_sbhl_predicates_internal() {
        return sbhl_module_vars.get_sbhl_predicates_int();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 1593L)
    public static SubLObject get_sbhl_predicates() {
        SubLObject caching_state = sbhl_module_utilities.$get_sbhl_predicates_caching_state$.getGlobalValue();
        if (sbhl_module_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)sbhl_module_utilities.$sym1$GET_SBHL_PREDICATES, (SubLObject)sbhl_module_utilities.$sym2$_GET_SBHL_PREDICATES_CACHING_STATE_, (SubLObject)sbhl_module_utilities.NIL, (SubLObject)sbhl_module_utilities.EQL, (SubLObject)sbhl_module_utilities.ZERO_INTEGER, (SubLObject)sbhl_module_utilities.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)sbhl_module_utilities.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_sbhl_predicates_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)sbhl_module_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 1873L)
    public static SubLObject sbhl_predicate_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, get_sbhl_predicates(), Symbols.symbol_function((SubLObject)sbhl_module_utilities.EQL), (SubLObject)sbhl_module_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 2040L)
    public static SubLObject sbhl_module_or_predicate_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(v_object) || sbhl_module_utilities.NIL != sbhl_predicate_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 2164L)
    public static SubLObject sbhl_non_time_module_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(v_object) && sbhl_module_utilities.NIL == sbhl_time_module_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 2394L)
    public static SubLObject sbhl_non_time_predicate_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_module_utilities.NIL != sbhl_predicate_p(v_object) && sbhl_module_utilities.NIL == sbhl_time_module_p(sbhl_module_vars.get_sbhl_module(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 2648L)
    public static SubLObject sbhl_graph_p(final SubLObject v_graph) {
        SubLObject graphP;
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject key;
        SubLObject module;
        SubLObject sbhl_graph;
        for (graphP = (SubLObject)sbhl_module_utilities.NIL, rest = (SubLObject)sbhl_module_utilities.NIL, rest = sbhl_module_vars.get_sbhl_modules(); sbhl_module_utilities.NIL == graphP && sbhl_module_utilities.NIL != rest; rest = rest.rest()) {
            cons = rest.first();
            datum = (current = cons);
            key = (SubLObject)sbhl_module_utilities.NIL;
            module = (SubLObject)sbhl_module_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_module_utilities.$list3);
            key = current.first();
            current = (module = current.rest());
            sbhl_graph = sbhl_module_vars.get_sbhl_module_graph(module);
            if (v_graph.eql(sbhl_graph)) {
                graphP = (SubLObject)sbhl_module_utilities.T;
            }
        }
        return graphP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 2926L)
    public static SubLObject get_sbhl_link_pred(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_module_vars.get_sbhl_module_link_pred(module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 3367L)
    public static SubLObject get_sbhl_link_style(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_module_vars.get_sbhl_module_link_style(module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 3603L)
    public static SubLObject get_sbhl_module_naut_forward_true_generators(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_module_vars.get_sbhl_module_property(module, (SubLObject)sbhl_module_utilities.$kw5$NAUT_FORWARD_TRUE_GENERATORS);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 3889L)
    public static SubLObject get_sbhl_module_type(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_module_vars.get_sbhl_module_module_type(module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 4113L)
    public static SubLObject get_sbhl_path_terminating_markP_fn(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_module_vars.get_sbhl_module_path_terminating_mark(module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 4399L)
    public static SubLObject get_sbhl_marking_fn(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_module_vars.get_sbhl_module_marking_fn(module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 4621L)
    public static SubLObject get_sbhl_unmarking_fn(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_module_vars.get_sbhl_module_unmarking_fn(module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 4849L)
    public static SubLObject get_sbhl_module_marking_increment(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_module_vars.get_sbhl_module_property(module, (SubLObject)sbhl_module_utilities.$kw6$MARKING_INCREMENT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 5108L)
    public static SubLObject get_sbhl_index_arg(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_module_vars.get_sbhl_module_index_arg(module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 5346L)
    public static SubLObject get_sbhl_gather_arg(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return Numbers.subtract((SubLObject)sbhl_module_utilities.THREE_INTEGER, get_sbhl_index_arg(module));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 5575L)
    public static SubLObject get_sbhl_add_node_to_result_test(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_module_vars.get_sbhl_module_property(module, (SubLObject)sbhl_module_utilities.$kw7$ADD_NODE_TO_RESULT_TEST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 5848L)
    public static SubLObject get_sbhl_add_unmarked_node_to_result_test(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_module_vars.get_sbhl_module_property(module, (SubLObject)sbhl_module_utilities.$kw8$ADD_UNMARKED_NODE_TO_RESULT_TEST);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 6149L)
    public static SubLObject get_sbhl_type_test(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_module_vars.get_sbhl_module_type_test(module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 6392L)
    public static SubLObject get_sbhl_module_root(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_module_vars.get_sbhl_module_property(module, (SubLObject)sbhl_module_utilities.$kw9$ROOT);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 6618L)
    public static SubLObject get_sbhl_transfers_via_arg(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_module_vars.get_sbhl_module_property(module, (SubLObject)sbhl_module_utilities.$kw10$TRANSFERS_VIA_ARG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 6910L)
    public static SubLObject get_sbhl_accessible_link_preds(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_module_vars.get_sbhl_module_accessible_link_preds(module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 7257L)
    public static SubLObject sbhl_module_indicates_predicate_search_p(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_module_vars.get_sbhl_module_property(module, (SubLObject)sbhl_module_utilities.$kw11$PREDICATE_SEARCH_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 7457L)
    public static SubLObject get_sbhl_node_modules(final SubLObject node) {
        SubLObject result = (SubLObject)sbhl_module_utilities.NIL;
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = (SubLObject)sbhl_module_utilities.NIL;
        cons = cdolist_list_var.first();
        while (sbhl_module_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)sbhl_module_utilities.NIL;
            SubLObject module = (SubLObject)sbhl_module_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_module_utilities.$list3);
            key = current.first();
            current = (module = current.rest());
            if (sbhl_module_utilities.NIL != sbhl_graphs.get_sbhl_graph_link(node, module)) {
                result = (SubLObject)ConsesLow.cons(get_sbhl_link_pred(module), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 7788L)
    public static SubLObject sbhl_disjoins_search_p() {
        return sbhl_module_vars.sbhl_disjoins_module_type_p(sbhl_search_vars.get_sbhl_search_module_type());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 7989L)
    public static SubLObject sbhl_time_search_p() {
        return sbhl_module_vars.sbhl_time_module_type_p(sbhl_search_vars.get_sbhl_search_module_type());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 8172L)
    public static SubLObject sbhl_root_p(final SubLObject node, final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return Equality.eql(node, get_sbhl_module_root(module));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 8387L)
    public static SubLObject get_sbhl_inverse_link_module(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        SubLObject inverse_module = (SubLObject)sbhl_module_utilities.NIL;
        inverse_module = get_sbhl_module_with_inverted_arguments(module);
        if (sbhl_module_utilities.NIL != inverse_module) {
            return inverse_module;
        }
        inverse_module = get_sbhl_module_which_this_module_inverts_arguments_of(module);
        if (sbhl_module_utilities.NIL != inverse_module) {
            return inverse_module;
        }
        return (SubLObject)sbhl_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 8909L)
    public static SubLObject get_sbhl_module_relevant_naut_link_generators(final SubLObject direction, final SubLObject tv, final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        if (sbhl_module_utilities.NIL != sbhl_search_vars.sbhl_true_tv_p(tv) && sbhl_module_utilities.NIL != sbhl_link_vars.sbhl_forward_directed_direction_p(direction)) {
            return get_sbhl_module_naut_forward_true_generators(module);
        }
        return (SubLObject)sbhl_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 9397L)
    public static SubLObject sbhl_simple_module_p(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_simple_reflexive_module_type_p(get_sbhl_module_type(module)) || sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_simple_non_reflexive_module_type_p(get_sbhl_module_type(module)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 9870L)
    public static SubLObject sbhl_time_module_p(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_module_vars.sbhl_time_module_type_p(get_sbhl_module_type(module));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 10140L)
    public static SubLObject sbhl_transitive_module_p(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_module_vars.sbhl_transitive_module_type_p(get_sbhl_module_type(module));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 10424L)
    public static SubLObject sbhl_inverse_module_p(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return list_utilities.sublisp_boolean(get_sbhl_module_which_this_module_inverts_arguments_of(module));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 10744L)
    public static SubLObject get_sbhl_inverse_module(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        SubLObject result = (SubLObject)sbhl_module_utilities.NIL;
        result = get_sbhl_module_with_inverted_arguments(module);
        if (sbhl_module_utilities.NIL != result) {
            return result;
        }
        return get_sbhl_module_which_this_module_inverts_arguments_of(module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 11156L)
    public static SubLObject get_sbhl_module_with_inverted_arguments(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        SubLObject inverted_arguments_module = sbhl_module_vars.get_sbhl_module_property(module, (SubLObject)sbhl_module_utilities.$kw12$MODULE_INVERTS_ARGUMENTS);
        if (sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(inverted_arguments_module)) {
            return inverted_arguments_module;
        }
        if (sbhl_module_utilities.NIL == inverted_arguments_module) {
            return (SubLObject)sbhl_module_utilities.NIL;
        }
        if (sbhl_module_utilities.NIL != sbhl_predicate_p(inverted_arguments_module)) {
            inverted_arguments_module = sbhl_module_vars.get_sbhl_module(inverted_arguments_module);
            sbhl_module_vars.set_sbhl_module_property(module, (SubLObject)sbhl_module_utilities.$kw12$MODULE_INVERTS_ARGUMENTS, inverted_arguments_module);
            return inverted_arguments_module;
        }
        return (SubLObject)sbhl_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 11946L)
    public static SubLObject get_sbhl_module_which_this_module_inverts_arguments_of(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        SubLObject inverts_arguments_of_module = sbhl_module_vars.get_sbhl_module_property(module, (SubLObject)sbhl_module_utilities.$kw13$INVERTS_ARGUMENTS_OF_MODULE);
        if (sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(inverts_arguments_of_module)) {
            return inverts_arguments_of_module;
        }
        if (sbhl_module_utilities.NIL == inverts_arguments_of_module) {
            return (SubLObject)sbhl_module_utilities.NIL;
        }
        if (sbhl_module_utilities.NIL != sbhl_predicate_p(inverts_arguments_of_module)) {
            inverts_arguments_of_module = sbhl_module_vars.get_sbhl_module(inverts_arguments_of_module);
            sbhl_module_vars.set_sbhl_module_property(module, (SubLObject)sbhl_module_utilities.$kw13$INVERTS_ARGUMENTS_OF_MODULE, inverts_arguments_of_module);
            return inverts_arguments_of_module;
        }
        return (SubLObject)sbhl_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 12766L)
    public static SubLObject get_sbhl_module_tag(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_module_vars.get_sbhl_module_property(module, (SubLObject)sbhl_module_utilities.$kw14$MODULE_TAG);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 13006L)
    public static SubLObject new_sbhl_module_graph(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject v_graph = sbhl_graphs.make_new_sbhl_graph();
        sbhl_module_vars.set_sbhl_module_property(module, (SubLObject)sbhl_module_utilities.$kw15$GRAPH, v_graph);
        return module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 13274L)
    public static SubLObject get_sbhl_graph(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_module_vars.get_sbhl_module_graph(module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 13518L)
    public static SubLObject get_sbhl_graphs() {
        SubLObject result = (SubLObject)sbhl_module_utilities.NIL;
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = (SubLObject)sbhl_module_utilities.NIL;
        cons = cdolist_list_var.first();
        while (sbhl_module_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)sbhl_module_utilities.NIL;
            SubLObject module = (SubLObject)sbhl_module_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_module_utilities.$list3);
            key = current.first();
            current = (module = current.rest());
            final SubLObject v_graph = get_sbhl_graph(module);
            if (sbhl_module_utilities.NIL != v_graph) {
                result = (SubLObject)ConsesLow.cons(v_graph, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 13784L)
    public static SubLObject sbhl_disjoins_module_p(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_module_vars.sbhl_disjoins_module_type_p(get_sbhl_module_type(module));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 14070L)
    public static SubLObject get_sbhl_disjoins_module(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        SubLObject disjoins_module = sbhl_module_vars.get_sbhl_module_property(module, (SubLObject)sbhl_module_utilities.$kw16$DISJOINS_MODULE);
        if (sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(disjoins_module)) {
            return disjoins_module;
        }
        if (sbhl_module_utilities.NIL == disjoins_module) {
            return (SubLObject)sbhl_module_utilities.NIL;
        }
        if (sbhl_module_utilities.NIL != sbhl_predicate_p(disjoins_module)) {
            disjoins_module = sbhl_module_vars.get_sbhl_module(disjoins_module);
            sbhl_module_vars.set_sbhl_module_property(module, (SubLObject)sbhl_module_utilities.$kw16$DISJOINS_MODULE, disjoins_module);
            return disjoins_module;
        }
        return (SubLObject)sbhl_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 14728L)
    public static SubLObject sbhl_transfers_through_module_p(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_module_vars.sbhl_transfers_through_module_type_p(get_sbhl_module_type(module));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 15035L)
    public static SubLObject get_sbhl_transfers_through_module(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        SubLObject tt_module = sbhl_module_vars.get_sbhl_module_property(module, (SubLObject)sbhl_module_utilities.$kw17$TRANSFERS_THROUGH_MODULE);
        if (sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(tt_module)) {
            return tt_module;
        }
        if (sbhl_module_utilities.NIL == tt_module) {
            return (SubLObject)sbhl_module_utilities.NIL;
        }
        if (sbhl_module_utilities.NIL != sbhl_predicate_p(tt_module)) {
            tt_module = sbhl_module_vars.get_sbhl_module(tt_module);
            sbhl_module_vars.set_sbhl_module_property(module, (SubLObject)sbhl_module_utilities.$kw17$TRANSFERS_THROUGH_MODULE, tt_module);
            return tt_module;
        }
        return (SubLObject)sbhl_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 15637L)
    public static SubLObject sbhl_reflexive_module_p(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_module_vars.sbhl_simple_reflexive_module_type_p(get_sbhl_module_type(module));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 15900L)
    public static SubLObject get_sbhl_disjoins_search_tt_module(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return (sbhl_module_utilities.NIL != sbhl_disjoins_module_p(module)) ? get_sbhl_transfers_through_module(module) : module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 16250L)
    public static SubLObject get_sbhl_reductions_module(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject tt_module = get_sbhl_transfers_through_module(module);
        final SubLObject search_module = (sbhl_module_utilities.NIL != module) ? module : sbhl_search_vars.get_sbhl_search_module();
        if (sbhl_module_utilities.NIL != tt_module) {
            return tt_module;
        }
        if (sbhl_module_vars.get_sbhl_module_link_pred(search_module).eql(sbhl_module_utilities.$const18$genlInverse)) {
            return sbhl_module_vars.get_sbhl_module(sbhl_module_utilities.$const19$genlPreds);
        }
        return search_module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 16900L)
    public static SubLObject get_sbhl_premark_module(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return (sbhl_module_utilities.NIL != sbhl_disjoins_module_p(module)) ? get_sbhl_transfers_through_module(module) : module;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 17226L)
    public static SubLObject sbhl_search_direction_p(final SubLObject direction) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_module_utilities.NIL != sbhl_search_vars.sbhl_forward_search_direction_p(direction) || sbhl_module_utilities.NIL != sbhl_search_vars.sbhl_backward_search_direction_p(direction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 17512L)
    public static SubLObject sbhl_forward_direction_for_module_p(final SubLObject direction, final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return Equality.eq(direction, get_sbhl_module_forward_direction(module));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 17783L)
    public static SubLObject get_sbhl_module_forward_direction(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return (sbhl_module_utilities.NIL != sbhl_module_directed_linksP(module)) ? sbhl_link_vars.get_sbhl_forward_directed_direction() : sbhl_link_vars.get_sbhl_undirected_direction();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 18133L)
    public static SubLObject get_sbhl_module_backward_direction(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return (sbhl_module_utilities.NIL != sbhl_module_directed_linksP(module)) ? sbhl_link_vars.get_sbhl_backward_directed_direction() : sbhl_link_vars.get_sbhl_undirected_direction();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 18467L)
    public static SubLObject get_sbhl_opposite_search_direction(SubLObject direction) {
        if (direction == sbhl_module_utilities.UNPROVIDED) {
            direction = (SubLObject)sbhl_module_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current_direction = (sbhl_module_utilities.NIL != direction) ? direction : sbhl_search_vars.get_sbhl_search_direction();
        if (sbhl_module_utilities.NIL != sbhl_search_vars.sbhl_forward_search_direction_p(current_direction)) {
            return sbhl_search_vars.get_sbhl_backward_search_direction();
        }
        if (sbhl_module_utilities.NIL != sbhl_search_vars.sbhl_backward_search_direction_p(current_direction)) {
            return sbhl_search_vars.get_sbhl_forward_search_direction();
        }
        if (sbhl_module_utilities.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sbhl_module_utilities.NIL == sbhl_search_direction_p(current_direction)) {
            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
            if (pcase_var.eql((SubLObject)sbhl_module_utilities.$kw20$ERROR)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_module_utilities.ONE_INTEGER, (SubLObject)sbhl_module_utilities.$str21$_A_is_not_a__A, current_direction, (SubLObject)sbhl_module_utilities.$sym22$SBHL_SEARCH_DIRECTION_P, (SubLObject)sbhl_module_utilities.UNPROVIDED, (SubLObject)sbhl_module_utilities.UNPROVIDED, (SubLObject)sbhl_module_utilities.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_module_utilities.$kw23$CERROR)) {
                sbhl_paranoia.sbhl_cerror((SubLObject)sbhl_module_utilities.ONE_INTEGER, (SubLObject)sbhl_module_utilities.$str24$continue_anyway, (SubLObject)sbhl_module_utilities.$str21$_A_is_not_a__A, current_direction, (SubLObject)sbhl_module_utilities.$sym22$SBHL_SEARCH_DIRECTION_P, (SubLObject)sbhl_module_utilities.UNPROVIDED, (SubLObject)sbhl_module_utilities.UNPROVIDED, (SubLObject)sbhl_module_utilities.UNPROVIDED);
            }
            else if (pcase_var.eql((SubLObject)sbhl_module_utilities.$kw25$WARN)) {
                Errors.warn((SubLObject)sbhl_module_utilities.$str21$_A_is_not_a__A, current_direction, (SubLObject)sbhl_module_utilities.$sym22$SBHL_SEARCH_DIRECTION_P);
            }
            else {
                Errors.warn((SubLObject)sbhl_module_utilities.$str26$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                Errors.cerror((SubLObject)sbhl_module_utilities.$str24$continue_anyway, (SubLObject)sbhl_module_utilities.$str21$_A_is_not_a__A, current_direction, (SubLObject)sbhl_module_utilities.$sym22$SBHL_SEARCH_DIRECTION_P);
            }
        }
        return (SubLObject)sbhl_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 19044L)
    public static SubLObject sbhl_module_directed_linksP(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return sbhl_module_vars.fort_denotes_sbhl_directed_graph_p(get_sbhl_link_style(module));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 19331L)
    public static SubLObject sbhl_search_direction_to_link_direction(final SubLObject direction, final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        if (sbhl_module_utilities.NIL != sbhl_search_vars.sbhl_forward_search_direction_p(direction)) {
            return get_sbhl_module_forward_direction(module);
        }
        if (sbhl_module_utilities.NIL != sbhl_search_vars.sbhl_backward_search_direction_p(direction)) {
            return get_sbhl_module_backward_direction(module);
        }
        sbhl_paranoia.sbhl_error((SubLObject)sbhl_module_utilities.ONE_INTEGER, (SubLObject)sbhl_module_utilities.$str27$invalid_sbhl_search_direction__a, direction, (SubLObject)sbhl_module_utilities.UNPROVIDED, (SubLObject)sbhl_module_utilities.UNPROVIDED, (SubLObject)sbhl_module_utilities.UNPROVIDED, (SubLObject)sbhl_module_utilities.UNPROVIDED);
        return (SubLObject)sbhl_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 19861L)
    public static SubLObject sbhl_search_direction_to_opposite_link_direction(final SubLObject direction, final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        if (sbhl_module_utilities.NIL != sbhl_search_vars.sbhl_forward_search_direction_p(direction)) {
            return get_sbhl_module_backward_direction(module);
        }
        if (sbhl_module_utilities.NIL != sbhl_search_vars.sbhl_backward_search_direction_p(direction)) {
            return get_sbhl_module_forward_direction(module);
        }
        sbhl_paranoia.sbhl_error((SubLObject)sbhl_module_utilities.ONE_INTEGER, (SubLObject)sbhl_module_utilities.$str27$invalid_sbhl_search_direction__a, direction, (SubLObject)sbhl_module_utilities.UNPROVIDED, (SubLObject)sbhl_module_utilities.UNPROVIDED, (SubLObject)sbhl_module_utilities.UNPROVIDED, (SubLObject)sbhl_module_utilities.UNPROVIDED);
        return (SubLObject)sbhl_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 20425L)
    public static SubLObject get_relevant_sbhl_directions(final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return (sbhl_module_utilities.NIL != sbhl_link_vars.get_sbhl_link_direction() && sbhl_module_utilities.NIL != module) ? sbhl_link_vars.get_sbhl_link_direction_as_list() : ((sbhl_module_utilities.NIL != sbhl_module_directed_linksP(module)) ? sbhl_link_vars.get_sbhl_directed_directions() : sbhl_link_vars.get_sbhl_undirected_direction_as_list());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 21110L)
    public static SubLObject sbhl_predicate_cardinality(final SubLObject module, final SubLObject node) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        if (sbhl_module_utilities.NIL == sbhl_link_vars.sbhl_node_object_p(node)) {
            return (SubLObject)sbhl_module_utilities.ZERO_INTEGER;
        }
        return cardinality_estimates.genl_cardinality(node);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 21482L)
    public static SubLObject sbhl_inverse_cardinality(final SubLObject module, final SubLObject node) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        if (sbhl_module_utilities.NIL == sbhl_link_vars.sbhl_node_object_p(node)) {
            return (SubLObject)sbhl_module_utilities.ZERO_INTEGER;
        }
        return cardinality_estimates.spec_cardinality(node);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 21740L)
    public static SubLObject sbhl_module_hl_support_module(final SubLObject module) {
        return sbhl_pred_hl_support_module(sbhl_module_vars.get_sbhl_module_link_pred(module));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 21997L)
    public static SubLObject sbhl_pred_hl_support_module(final SubLObject pred) {
        assert sbhl_module_utilities.NIL != sbhl_predicate_p(pred) : pred;
        if (pred.eql(sbhl_module_utilities.$const29$genls)) {
            return (SubLObject)sbhl_module_utilities.$kw30$GENLS;
        }
        if (pred.eql(sbhl_module_utilities.$const31$isa) || pred.eql(sbhl_module_utilities.$const32$quotedIsa)) {
            return (SubLObject)sbhl_module_utilities.$kw33$ISA;
        }
        if (pred.eql(sbhl_module_utilities.$const19$genlPreds) || pred.eql(sbhl_module_utilities.$const18$genlInverse)) {
            return (SubLObject)sbhl_module_utilities.$kw34$GENLPREDS;
        }
        if (pred.eql(sbhl_module_utilities.$const35$genlMt) || pred.eql(sbhl_module_utilities.$const36$negationMt)) {
            return (SubLObject)sbhl_module_utilities.$kw37$GENLMT;
        }
        if (pred.eql(sbhl_module_utilities.$const38$disjointWith)) {
            return (SubLObject)sbhl_module_utilities.$kw39$DISJOINTWITH;
        }
        if (pred.eql(sbhl_module_utilities.$const40$negationPreds) || pred.eql(sbhl_module_utilities.$const41$negationInverse)) {
            return (SubLObject)sbhl_module_utilities.$kw42$NEGATIONPREDS;
        }
        return (SubLObject)sbhl_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 22439L)
    public static SubLObject sbhl_old_mode(final SubLObject direction, final SubLObject pred) {
        assert sbhl_module_utilities.NIL != sbhl_predicate_p(pred) : pred;
        final SubLObject module = sbhl_module_vars.get_sbhl_module(pred);
        if (pred.eql(sbhl_module_utilities.$const31$isa)) {
            return (SubLObject)sbhl_module_utilities.$kw33$ISA;
        }
        if (sbhl_module_utilities.NIL != sbhl_disjoins_module_p(module)) {
            return (SubLObject)sbhl_module_utilities.$kw43$NEGATION;
        }
        if (get_sbhl_module_forward_direction(module).eql(direction)) {
            return (SubLObject)sbhl_module_utilities.$kw44$SUPERIOR;
        }
        if (get_sbhl_module_backward_direction(module).eql(direction)) {
            return (SubLObject)sbhl_module_utilities.$kw45$INFERIOR;
        }
        return (SubLObject)sbhl_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 23089L)
    public static SubLObject sbhl_pred_get_hl_module(final SubLObject pred) {
        assert sbhl_module_utilities.NIL != sbhl_predicate_p(pred) : pred;
        if (pred.eql(sbhl_module_utilities.$const29$genls)) {
            return (SubLObject)sbhl_module_utilities.$kw30$GENLS;
        }
        if (pred.eql(sbhl_module_utilities.$const31$isa)) {
            return (SubLObject)sbhl_module_utilities.$kw33$ISA;
        }
        if (pred.eql(sbhl_module_utilities.$const32$quotedIsa)) {
            return (SubLObject)sbhl_module_utilities.$kw33$ISA;
        }
        if (pred.eql(sbhl_module_utilities.$const19$genlPreds)) {
            return (SubLObject)sbhl_module_utilities.$kw34$GENLPREDS;
        }
        if (pred.eql(sbhl_module_utilities.$const18$genlInverse)) {
            return (SubLObject)sbhl_module_utilities.$kw34$GENLPREDS;
        }
        if (pred.eql(sbhl_module_utilities.$const35$genlMt)) {
            return (SubLObject)sbhl_module_utilities.$kw37$GENLMT;
        }
        if (pred.eql(sbhl_module_utilities.$const38$disjointWith)) {
            return (SubLObject)sbhl_module_utilities.$kw39$DISJOINTWITH;
        }
        if (pred.eql(sbhl_module_utilities.$const40$negationPreds)) {
            return (SubLObject)sbhl_module_utilities.$kw42$NEGATIONPREDS;
        }
        if (pred.eql(sbhl_module_utilities.$const41$negationInverse)) {
            return (SubLObject)sbhl_module_utilities.$kw42$NEGATIONPREDS;
        }
        if (pred.eql(sbhl_module_utilities.$const36$negationMt)) {
            return (SubLObject)sbhl_module_utilities.$kw37$GENLMT;
        }
        return (SubLObject)sbhl_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 23646L)
    public static SubLObject sbhl_old_module(final SubLObject pred) {
        return sbhl_pred_get_hl_module(pred);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 23743L)
    public static SubLObject sbhl_predicate_for_hl_module(final SubLObject hl_module) {
        if (hl_module.eql((SubLObject)sbhl_module_utilities.$kw30$GENLS)) {
            return sbhl_module_utilities.$const29$genls;
        }
        if (hl_module.eql((SubLObject)sbhl_module_utilities.$kw37$GENLMT)) {
            return sbhl_module_utilities.$const35$genlMt;
        }
        if (hl_module.eql((SubLObject)sbhl_module_utilities.$kw34$GENLPREDS)) {
            return sbhl_module_utilities.$const19$genlPreds;
        }
        if (hl_module.eql((SubLObject)sbhl_module_utilities.$kw33$ISA)) {
            return sbhl_module_utilities.$const31$isa;
        }
        if (hl_module.eql((SubLObject)sbhl_module_utilities.$kw39$DISJOINTWITH)) {
            return sbhl_module_utilities.$const38$disjointWith;
        }
        if (hl_module.eql((SubLObject)sbhl_module_utilities.$kw42$NEGATIONPREDS)) {
            return sbhl_module_utilities.$const40$negationPreds;
        }
        return (SubLObject)sbhl_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 24135L)
    public static SubLObject sbhl_predicate_from_fort_type(final SubLObject fort_type) {
        if (fort_type.eql(sbhl_module_utilities.$const46$Collection)) {
            return sbhl_module_utilities.$const29$genls;
        }
        if (fort_type.eql(sbhl_module_utilities.$const47$Predicate)) {
            return sbhl_module_utilities.$const19$genlPreds;
        }
        if (fort_type.eql(sbhl_module_utilities.$const48$Microtheory)) {
            return sbhl_module_utilities.$const35$genlMt;
        }
        return sbhl_module_utilities.$const31$isa;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 24396L)
    public static SubLObject sbhl_node_has_type_associated_to_predicate_p(final SubLObject node, final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        return apply_sbhl_module_type_test(node, module);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 24607L)
    public static SubLObject determine_sbhl_predicate_from_fort_type(final SubLObject node, SubLObject mt) {
        if (mt == sbhl_module_utilities.UNPROVIDED) {
            mt = (SubLObject)sbhl_module_utilities.NIL;
        }
        return sbhl_predicate_from_fort_type(fort_types_interface.definitional_fort_type(node, mt));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 24760L)
    public static SubLObject determine_sbhl_module_from_fort_type(final SubLObject node, SubLObject mt) {
        if (mt == sbhl_module_utilities.UNPROVIDED) {
            mt = (SubLObject)sbhl_module_utilities.NIL;
        }
        return sbhl_module_vars.get_sbhl_module(sbhl_predicate_from_fort_type(fort_types_interface.definitional_fort_type(node, mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 24928L)
    public static SubLObject sbhl_node_with_any_sbhl_type_p(final SubLObject fort, SubLObject mt) {
        if (mt == sbhl_module_utilities.UNPROVIDED) {
            mt = (SubLObject)sbhl_module_utilities.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_module_utilities.NIL != forts.fort_p(fort) || !sbhl_module_utilities.$const31$isa.eql(determine_sbhl_predicate_from_fort_type(fort, mt)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 25141L)
    public static SubLObject sbhl_fortP(final SubLObject fort) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_module_utilities.NIL != sbhl_links.any_sbhl_links_p(fort, sbhl_module_utilities.$const31$isa) || sbhl_module_utilities.NIL != fort_types_interface.collection_p(fort) || sbhl_module_utilities.NIL != fort_types_interface.predicate_p(fort) || sbhl_module_utilities.NIL != fort_types_interface.microtheory_p(fort));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 25369L)
    public static SubLObject sbhl_isa_collection_p(final SubLObject node) {
        return fort_types_interface.isa_collectionP(function_terms.naut_to_nart(node), (SubLObject)sbhl_module_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 25464L)
    public static SubLObject sbhl_isa_microtheory_p(final SubLObject node) {
        return fort_types_interface.isa_mtP(function_terms.naut_to_nart(node), (SubLObject)sbhl_module_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 25552L)
    public static SubLObject sbhl_isa_predicate_p(final SubLObject node) {
        return fort_types_interface.isa_predicateP(function_terms.naut_to_nart(node), (SubLObject)sbhl_module_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 25645L)
    public static SubLObject apply_sbhl_module_type_test(final SubLObject node, final SubLObject module) {
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        final SubLObject test_fn = get_sbhl_type_test(module);
        if (sbhl_module_utilities.NIL == test_fn) {
            return (SubLObject)sbhl_module_utilities.T;
        }
        final SubLObject pcase_var = test_fn;
        if (pcase_var.eql((SubLObject)sbhl_module_utilities.$sym49$COLLECTION_P)) {
            return sbhl_isa_collection_p(node);
        }
        if (pcase_var.eql((SubLObject)sbhl_module_utilities.$sym50$MICROTHEORY_P)) {
            return sbhl_isa_microtheory_p(node);
        }
        if (pcase_var.eql((SubLObject)sbhl_module_utilities.$sym51$PREDICATE_P)) {
            return sbhl_isa_predicate_p(node);
        }
        return (SubLObject)sbhl_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-utilities.lisp", position = 26125L)
    public static SubLObject sbhl_module_meets_requisitesP(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sbhl_module_utilities.NIL != sbhl_module_vars.sbhl_module_p(module) : module;
        SubLObject failP;
        SubLObject iteration_state;
        for (failP = (SubLObject)sbhl_module_utilities.NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sbhl_module_vars.get_sbhl_module_properties())); sbhl_module_utilities.NIL == failP && sbhl_module_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject property = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject data_test = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject data = sbhl_module_vars.get_sbhl_module_property(module, property);
            if (sbhl_module_utilities.NIL != data) {
                if (sbhl_module_utilities.NIL != Functions.funcall(data_test, data)) {
                    final SubLObject pcase_var = data_test;
                    if (pcase_var.eql((SubLObject)sbhl_module_utilities.$sym52$FUNCTION_SYMBOL_P)) {
                        utilities_macros.register_kb_function(data);
                    }
                    else if (pcase_var.eql((SubLObject)sbhl_module_utilities.$sym53$FUNCTION_SYMBOL_LIST_P)) {
                        SubLObject cdolist_list_var = data;
                        SubLObject symbol_function = (SubLObject)sbhl_module_utilities.NIL;
                        symbol_function = cdolist_list_var.first();
                        while (sbhl_module_utilities.NIL != cdolist_list_var) {
                            utilities_macros.register_kb_function(symbol_function);
                            cdolist_list_var = cdolist_list_var.rest();
                            symbol_function = cdolist_list_var.first();
                        }
                    }
                }
                else {
                    sbhl_paranoia.sbhl_error((SubLObject)sbhl_module_utilities.ONE_INTEGER, (SubLObject)sbhl_module_utilities.$str54$Data___a__associated_with_propert, data, property, data_test, (SubLObject)sbhl_module_utilities.UNPROVIDED, (SubLObject)sbhl_module_utilities.UNPROVIDED);
                    failP = (SubLObject)sbhl_module_utilities.T;
                }
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        SubLObject rest;
        SubLObject property2;
        for (rest = (SubLObject)sbhl_module_utilities.NIL, rest = sbhl_module_vars.get_sbhl_module_required_properties(); sbhl_module_utilities.NIL == failP && sbhl_module_utilities.NIL != rest; rest = rest.rest()) {
            property2 = rest.first();
            if (sbhl_module_utilities.NIL == sbhl_module_vars.get_sbhl_module_property(module, property2)) {
                sbhl_paranoia.sbhl_error((SubLObject)sbhl_module_utilities.ONE_INTEGER, (SubLObject)sbhl_module_utilities.$str55$No_data_associated_with_required_, property2, (SubLObject)sbhl_module_utilities.UNPROVIDED, (SubLObject)sbhl_module_utilities.UNPROVIDED, (SubLObject)sbhl_module_utilities.UNPROVIDED, (SubLObject)sbhl_module_utilities.UNPROVIDED);
                failP = (SubLObject)sbhl_module_utilities.T;
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sbhl_module_utilities.NIL == failP);
    }
    
    public static SubLObject declare_sbhl_module_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "init_sbhl_module_data", "INIT-SBHL-MODULE-DATA", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "clear_get_sbhl_predicates", "CLEAR-GET-SBHL-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "remove_get_sbhl_predicates", "REMOVE-GET-SBHL-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_predicates_internal", "GET-SBHL-PREDICATES-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_predicates", "GET-SBHL-PREDICATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_predicate_p", "SBHL-PREDICATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_module_or_predicate_p", "SBHL-MODULE-OR-PREDICATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_non_time_module_p", "SBHL-NON-TIME-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_non_time_predicate_p", "SBHL-NON-TIME-PREDICATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_graph_p", "SBHL-GRAPH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_link_pred", "GET-SBHL-LINK-PRED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_link_style", "GET-SBHL-LINK-STYLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_module_naut_forward_true_generators", "GET-SBHL-MODULE-NAUT-FORWARD-TRUE-GENERATORS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_module_type", "GET-SBHL-MODULE-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_path_terminating_markP_fn", "GET-SBHL-PATH-TERMINATING-MARK?-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_marking_fn", "GET-SBHL-MARKING-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_unmarking_fn", "GET-SBHL-UNMARKING-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_module_marking_increment", "GET-SBHL-MODULE-MARKING-INCREMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_index_arg", "GET-SBHL-INDEX-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_gather_arg", "GET-SBHL-GATHER-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_add_node_to_result_test", "GET-SBHL-ADD-NODE-TO-RESULT-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_add_unmarked_node_to_result_test", "GET-SBHL-ADD-UNMARKED-NODE-TO-RESULT-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_type_test", "GET-SBHL-TYPE-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_module_root", "GET-SBHL-MODULE-ROOT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_transfers_via_arg", "GET-SBHL-TRANSFERS-VIA-ARG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_accessible_link_preds", "GET-SBHL-ACCESSIBLE-LINK-PREDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_module_indicates_predicate_search_p", "SBHL-MODULE-INDICATES-PREDICATE-SEARCH-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_node_modules", "GET-SBHL-NODE-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_disjoins_search_p", "SBHL-DISJOINS-SEARCH-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_time_search_p", "SBHL-TIME-SEARCH-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_root_p", "SBHL-ROOT-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_inverse_link_module", "GET-SBHL-INVERSE-LINK-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_module_relevant_naut_link_generators", "GET-SBHL-MODULE-RELEVANT-NAUT-LINK-GENERATORS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_simple_module_p", "SBHL-SIMPLE-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_time_module_p", "SBHL-TIME-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_transitive_module_p", "SBHL-TRANSITIVE-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_inverse_module_p", "SBHL-INVERSE-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_inverse_module", "GET-SBHL-INVERSE-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_module_with_inverted_arguments", "GET-SBHL-MODULE-WITH-INVERTED-ARGUMENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_module_which_this_module_inverts_arguments_of", "GET-SBHL-MODULE-WHICH-THIS-MODULE-INVERTS-ARGUMENTS-OF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_module_tag", "GET-SBHL-MODULE-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "new_sbhl_module_graph", "NEW-SBHL-MODULE-GRAPH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_graph", "GET-SBHL-GRAPH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_graphs", "GET-SBHL-GRAPHS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_disjoins_module_p", "SBHL-DISJOINS-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_disjoins_module", "GET-SBHL-DISJOINS-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_transfers_through_module_p", "SBHL-TRANSFERS-THROUGH-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_transfers_through_module", "GET-SBHL-TRANSFERS-THROUGH-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_reflexive_module_p", "SBHL-REFLEXIVE-MODULE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_disjoins_search_tt_module", "GET-SBHL-DISJOINS-SEARCH-TT-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_reductions_module", "GET-SBHL-REDUCTIONS-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_premark_module", "GET-SBHL-PREMARK-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_search_direction_p", "SBHL-SEARCH-DIRECTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_forward_direction_for_module_p", "SBHL-FORWARD-DIRECTION-FOR-MODULE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_module_forward_direction", "GET-SBHL-MODULE-FORWARD-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_module_backward_direction", "GET-SBHL-MODULE-BACKWARD-DIRECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_sbhl_opposite_search_direction", "GET-SBHL-OPPOSITE-SEARCH-DIRECTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_module_directed_linksP", "SBHL-MODULE-DIRECTED-LINKS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_search_direction_to_link_direction", "SBHL-SEARCH-DIRECTION-TO-LINK-DIRECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_search_direction_to_opposite_link_direction", "SBHL-SEARCH-DIRECTION-TO-OPPOSITE-LINK-DIRECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "get_relevant_sbhl_directions", "GET-RELEVANT-SBHL-DIRECTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_predicate_cardinality", "SBHL-PREDICATE-CARDINALITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_inverse_cardinality", "SBHL-INVERSE-CARDINALITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_module_hl_support_module", "SBHL-MODULE-HL-SUPPORT-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_pred_hl_support_module", "SBHL-PRED-HL-SUPPORT-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_old_mode", "SBHL-OLD-MODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_pred_get_hl_module", "SBHL-PRED-GET-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_old_module", "SBHL-OLD-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_predicate_for_hl_module", "SBHL-PREDICATE-FOR-HL-MODULE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_predicate_from_fort_type", "SBHL-PREDICATE-FROM-FORT-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_node_has_type_associated_to_predicate_p", "SBHL-NODE-HAS-TYPE-ASSOCIATED-TO-PREDICATE-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "determine_sbhl_predicate_from_fort_type", "DETERMINE-SBHL-PREDICATE-FROM-FORT-TYPE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "determine_sbhl_module_from_fort_type", "DETERMINE-SBHL-MODULE-FROM-FORT-TYPE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_node_with_any_sbhl_type_p", "SBHL-NODE-WITH-ANY-SBHL-TYPE-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_fortP", "SBHL-FORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_isa_collection_p", "SBHL-ISA-COLLECTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_isa_microtheory_p", "SBHL-ISA-MICROTHEORY-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_isa_predicate_p", "SBHL-ISA-PREDICATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "apply_sbhl_module_type_test", "APPLY-SBHL-MODULE-TYPE-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities", "sbhl_module_meets_requisitesP", "SBHL-MODULE-MEETS-REQUISITES?", 1, 0, false);
        return (SubLObject)sbhl_module_utilities.NIL;
    }
    
    public static SubLObject init_sbhl_module_utilities_file() {
        sbhl_module_utilities.$get_sbhl_predicates_caching_state$ = SubLFiles.deflexical("*GET-SBHL-PREDICATES-CACHING-STATE*", (SubLObject)sbhl_module_utilities.NIL);
        return (SubLObject)sbhl_module_utilities.NIL;
    }
    
    public static SubLObject setup_sbhl_module_utilities_file() {
        memoization_state.note_globally_cached_function((SubLObject)sbhl_module_utilities.$sym1$GET_SBHL_PREDICATES);
        return (SubLObject)sbhl_module_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sbhl_module_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sbhl_module_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sbhl_module_utilities_file();
    }
    
    static {
        me = (SubLFile)new sbhl_module_utilities();
        sbhl_module_utilities.$get_sbhl_predicates_caching_state$ = null;
        $sym0$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym1$GET_SBHL_PREDICATES = SubLObjectFactory.makeSymbol("GET-SBHL-PREDICATES");
        $sym2$_GET_SBHL_PREDICATES_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*GET-SBHL-PREDICATES-CACHING-STATE*");
        $list3 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeUninternedSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"));
        $sym4$SBHL_MODULE_P = SubLObjectFactory.makeSymbol("SBHL-MODULE-P");
        $kw5$NAUT_FORWARD_TRUE_GENERATORS = SubLObjectFactory.makeKeyword("NAUT-FORWARD-TRUE-GENERATORS");
        $kw6$MARKING_INCREMENT = SubLObjectFactory.makeKeyword("MARKING-INCREMENT");
        $kw7$ADD_NODE_TO_RESULT_TEST = SubLObjectFactory.makeKeyword("ADD-NODE-TO-RESULT-TEST");
        $kw8$ADD_UNMARKED_NODE_TO_RESULT_TEST = SubLObjectFactory.makeKeyword("ADD-UNMARKED-NODE-TO-RESULT-TEST");
        $kw9$ROOT = SubLObjectFactory.makeKeyword("ROOT");
        $kw10$TRANSFERS_VIA_ARG = SubLObjectFactory.makeKeyword("TRANSFERS-VIA-ARG");
        $kw11$PREDICATE_SEARCH_P = SubLObjectFactory.makeKeyword("PREDICATE-SEARCH-P");
        $kw12$MODULE_INVERTS_ARGUMENTS = SubLObjectFactory.makeKeyword("MODULE-INVERTS-ARGUMENTS");
        $kw13$INVERTS_ARGUMENTS_OF_MODULE = SubLObjectFactory.makeKeyword("INVERTS-ARGUMENTS-OF-MODULE");
        $kw14$MODULE_TAG = SubLObjectFactory.makeKeyword("MODULE-TAG");
        $kw15$GRAPH = SubLObjectFactory.makeKeyword("GRAPH");
        $kw16$DISJOINS_MODULE = SubLObjectFactory.makeKeyword("DISJOINS-MODULE");
        $kw17$TRANSFERS_THROUGH_MODULE = SubLObjectFactory.makeKeyword("TRANSFERS-THROUGH-MODULE");
        $const18$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $const19$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $kw20$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str21$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym22$SBHL_SEARCH_DIRECTION_P = SubLObjectFactory.makeSymbol("SBHL-SEARCH-DIRECTION-P");
        $kw23$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str24$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw25$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str26$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str27$invalid_sbhl_search_direction__a = SubLObjectFactory.makeString("invalid sbhl-search-direction ~a");
        $sym28$SBHL_PREDICATE_P = SubLObjectFactory.makeSymbol("SBHL-PREDICATE-P");
        $const29$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $kw30$GENLS = SubLObjectFactory.makeKeyword("GENLS");
        $const31$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const32$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $kw33$ISA = SubLObjectFactory.makeKeyword("ISA");
        $kw34$GENLPREDS = SubLObjectFactory.makeKeyword("GENLPREDS");
        $const35$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $const36$negationMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationMt"));
        $kw37$GENLMT = SubLObjectFactory.makeKeyword("GENLMT");
        $const38$disjointWith = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $kw39$DISJOINTWITH = SubLObjectFactory.makeKeyword("DISJOINTWITH");
        $const40$negationPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds"));
        $const41$negationInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse"));
        $kw42$NEGATIONPREDS = SubLObjectFactory.makeKeyword("NEGATIONPREDS");
        $kw43$NEGATION = SubLObjectFactory.makeKeyword("NEGATION");
        $kw44$SUPERIOR = SubLObjectFactory.makeKeyword("SUPERIOR");
        $kw45$INFERIOR = SubLObjectFactory.makeKeyword("INFERIOR");
        $const46$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $const47$Predicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate"));
        $const48$Microtheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $sym49$COLLECTION_P = SubLObjectFactory.makeSymbol("COLLECTION-P");
        $sym50$MICROTHEORY_P = SubLObjectFactory.makeSymbol("MICROTHEORY-P");
        $sym51$PREDICATE_P = SubLObjectFactory.makeSymbol("PREDICATE-P");
        $sym52$FUNCTION_SYMBOL_P = SubLObjectFactory.makeSymbol("FUNCTION-SYMBOL-P");
        $sym53$FUNCTION_SYMBOL_LIST_P = SubLObjectFactory.makeSymbol("FUNCTION-SYMBOL-LIST-P");
        $str54$Data___a__associated_with_propert = SubLObjectFactory.makeString("Data, ~a, associated with property, ~a, does not satisfy data test, ~a");
        $str55$No_data_associated_with_required_ = SubLObjectFactory.makeString("No data associated with required property ~a");
    }
}

/*

	Total time: 157 ms
	
*/