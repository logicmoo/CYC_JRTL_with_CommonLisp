package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class psp_parse_tree_generator extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.psp_parse_tree_generator";
    public static final String myFingerPrint = "addb5b6fc674fcb31bb994b478662817623b4b5a90a62619644416e429d2139b";
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 2894L)
    public static SubLSymbol $dtp_psp_edge_equivalence_set$;
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 13080L)
    private static SubLSymbol $psp_chart_tokenizations$;
    private static final SubLSymbol $kw0$ANY;
    private static final SubLObject $const1$parseTreeOfTokenization;
    private static final SubLSymbol $sym2$PHRASE_STRUCTURE_PARSER_CHART_P;
    private static final SubLString $str3$Can_t_generate_a_node_from_no_edg;
    private static final SubLString $str4$Found_no_equivalence_sets_for__S_;
    private static final SubLSymbol $sym5$PSP_EDGE_EQUIVALENCE_SET;
    private static final SubLSymbol $sym6$PSP_EDGE_EQUIVALENCE_SET_P;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$PPRINT_PSP_EQUIVALENCE_SET;
    private static final SubLSymbol $sym12$PSP_EDGE_EQUIVALENCE_SET_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list13;
    private static final SubLSymbol $sym14$PSP_EQUIVALENCE_SET_CHOICE_DTR_NUM;
    private static final SubLSymbol $sym15$_CSETF_PSP_EQUIVALENCE_SET_CHOICE_DTR_NUM;
    private static final SubLSymbol $sym16$PSP_EQUIVALENCE_SET_EDGES;
    private static final SubLSymbol $sym17$_CSETF_PSP_EQUIVALENCE_SET_EDGES;
    private static final SubLSymbol $kw18$CHOICE_DTR_NUM;
    private static final SubLSymbol $kw19$EDGES;
    private static final SubLString $str20$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw21$BEGIN;
    private static final SubLSymbol $sym22$MAKE_PSP_EDGE_EQUIVALENCE_SET;
    private static final SubLSymbol $kw23$SLOT;
    private static final SubLSymbol $kw24$END;
    private static final SubLSymbol $sym25$VISIT_DEFSTRUCT_OBJECT_PSP_EDGE_EQUIVALENCE_SET_METHOD;
    private static final SubLString $str26$_PSP_EQUIV_SET_of__S_edges_;
    private static final SubLString $str27$New_choice_dtr_num_of__S_doesn_t_;
    private static final SubLObject $const28$proposedMeaning;
    private static final SubLSymbol $sym29$CLET;
    private static final SubLList $list30;
    private static final SubLSymbol $sym31$WITH_PARSE_TREE_MT;
    private static final SubLList $list32;
    private static final SubLSymbol $sym33$WITH_PARSE_TREE_PREFIX;
    private static final SubLString $str34$PSP;
    private static final SubLString $str35$TheCycPhraseStructureParser;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$_DTR_NODE;
    private static final SubLObject $const38$syntacticNodeNthDaughter;
    private static final SubLList $list39;
    private static final SubLString $str40$__Trying_to_add__S_to____S___as_d;
    private static final SubLSymbol $sym41$_PSP_CHART_TOKENIZATIONS_;
    private static final SubLObject $const42$CycTokenization;
    private static final SubLString $str43$ParseTreeSandboxMt;
    private static final SubLObject $const44$isa;
    private static final SubLList $list45;
    private static final SubLObject $const46$BaseKB;
    private static final SubLObject $const47$genlMt;
    private static final SubLList $list48;
    private static final SubLList $list49;
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 873L)
    public static SubLObject psp_generate_parse_tree_for_string(final SubLObject string, SubLObject category) {
        if (category == psp_parse_tree_generator.UNPROVIDED) {
            category = (SubLObject)psp_parse_tree_generator.$kw0$ANY;
        }
        return psp_generate_parse_tree_for_chart(psp_syntax.psp_chart_for_string(string, (SubLObject)psp_parse_tree_generator.UNPROVIDED, (SubLObject)psp_parse_tree_generator.UNPROVIDED, (SubLObject)psp_parse_tree_generator.UNPROVIDED), category);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 1046L)
    public static SubLObject psp_generate_parse_tree_for_chart(final SubLObject chart, SubLObject category) {
        if (category == psp_parse_tree_generator.UNPROVIDED) {
            category = (SubLObject)psp_parse_tree_generator.$kw0$ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject root_node = (SubLObject)psp_parse_tree_generator.NIL;
        final SubLObject local_state = psp_chart.psp_chart_memoization_state(chart);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject _prev_bind_0_$2 = parsing_vars.$psp_chart$.currentBinding(thread);
                try {
                    parsing_vars.$psp_chart$.bind(chart, thread);
                    final SubLObject max_edges = psp_chart.psp_input_spanning_edges((SubLObject)psp_parse_tree_generator.UNPROVIDED);
                    final SubLObject non_trivialP = (SubLObject)psp_parse_tree_generator.NIL;
                    final SubLObject pos_pred = (SubLObject)psp_parse_tree_generator.$kw0$ANY;
                    final SubLObject filtered_edges = psp_main.psp_filter_edges(max_edges, non_trivialP, category, pos_pred, (SubLObject)psp_parse_tree_generator.UNPROVIDED, (SubLObject)psp_parse_tree_generator.UNPROVIDED);
                    final SubLObject edge_set = set_utilities.construct_set_from_list(filtered_edges, (SubLObject)psp_parse_tree_generator.UNPROVIDED, (SubLObject)psp_parse_tree_generator.UNPROVIDED);
                    if (psp_parse_tree_generator.NIL == set.empty_set_p(edge_set)) {
                        root_node = psp_find_or_create_node_for_edges(edge_set);
                    }
                }
                finally {
                    parsing_vars.$psp_chart$.rebind(_prev_bind_0_$2, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)psp_parse_tree_generator.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        final SubLObject tokenization = psp_chart_tokenization(chart);
        final SubLObject mt = psp_chart_parse_tree_mt(chart);
        final SubLObject v_parse_tree = psp_create_parse_tree_with_root_node(root_node);
        parsing_utilities.assert_parse_tree_info((SubLObject)ConsesLow.list(psp_parse_tree_generator.$const1$parseTreeOfTokenization, v_parse_tree, tokenization), mt);
        return v_parse_tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 1815L)
    public static SubLObject psp_find_or_create_node_for_edges(final SubLObject edges) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert psp_parse_tree_generator.NIL != psp_chart.phrase_structure_parser_chart_p(parsing_vars.$psp_chart$.getDynamicValue(thread)) : parsing_vars.$psp_chart$.getDynamicValue(thread);
        final SubLObject found = psp_chart.psp_edge_set_lookup_node(edges, (SubLObject)psp_parse_tree_generator.UNPROVIDED);
        if (psp_parse_tree_generator.NIL != parsing_utilities.syntactic_node_p(found, (SubLObject)psp_parse_tree_generator.UNPROVIDED)) {
            return found;
        }
        final SubLObject pcase_var = set.set_size(edges);
        if (pcase_var.eql((SubLObject)psp_parse_tree_generator.ZERO_INTEGER)) {
            Errors.error((SubLObject)psp_parse_tree_generator.$str3$Can_t_generate_a_node_from_no_edg);
            return (SubLObject)psp_parse_tree_generator.NIL;
        }
        if (pcase_var.eql((SubLObject)psp_parse_tree_generator.ONE_INTEGER)) {
            return psp_create_node_for_edge(set_utilities.set_arbitrary_element(edges));
        }
        return psp_create_node_for_edges_int(edges);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 2309L)
    public static SubLObject psp_create_node_for_edges_int(final SubLObject edges) {
        final SubLObject equivalence_sets = psp_equivalence_sets_for_edges(edges);
        SubLObject node = (SubLObject)psp_parse_tree_generator.NIL;
        final SubLObject pcase_var = set.set_size(equivalence_sets);
        if (pcase_var.eql((SubLObject)psp_parse_tree_generator.ZERO_INTEGER)) {
            Errors.error((SubLObject)psp_parse_tree_generator.$str4$Found_no_equivalence_sets_for__S_, edges);
        }
        else if (pcase_var.eql((SubLObject)psp_parse_tree_generator.ONE_INTEGER)) {
            node = psp_create_node_for_equivalence_set(set_utilities.set_arbitrary_element(equivalence_sets));
        }
        else {
            node = psp_create_node_for_equivalence_sets(equivalence_sets);
        }
        psp_chart.psp_edge_set_note_node(edges, node);
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 2894L)
    public static SubLObject psp_edge_equivalence_set_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_psp_equivalence_set(v_object, stream, (SubLObject)psp_parse_tree_generator.ZERO_INTEGER);
        return (SubLObject)psp_parse_tree_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 2894L)
    public static SubLObject psp_edge_equivalence_set_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $psp_edge_equivalence_set_native.class) ? psp_parse_tree_generator.T : psp_parse_tree_generator.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 2894L)
    public static SubLObject psp_equivalence_set_choice_dtr_num(final SubLObject v_object) {
        assert psp_parse_tree_generator.NIL != psp_edge_equivalence_set_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 2894L)
    public static SubLObject psp_equivalence_set_edges(final SubLObject v_object) {
        assert psp_parse_tree_generator.NIL != psp_edge_equivalence_set_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 2894L)
    public static SubLObject _csetf_psp_equivalence_set_choice_dtr_num(final SubLObject v_object, final SubLObject value) {
        assert psp_parse_tree_generator.NIL != psp_edge_equivalence_set_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 2894L)
    public static SubLObject _csetf_psp_equivalence_set_edges(final SubLObject v_object, final SubLObject value) {
        assert psp_parse_tree_generator.NIL != psp_edge_equivalence_set_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 2894L)
    public static SubLObject make_psp_edge_equivalence_set(SubLObject arglist) {
        if (arglist == psp_parse_tree_generator.UNPROVIDED) {
            arglist = (SubLObject)psp_parse_tree_generator.NIL;
        }
        final SubLObject v_new = (SubLObject)new $psp_edge_equivalence_set_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)psp_parse_tree_generator.NIL, next = arglist; psp_parse_tree_generator.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)psp_parse_tree_generator.$kw18$CHOICE_DTR_NUM)) {
                _csetf_psp_equivalence_set_choice_dtr_num(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)psp_parse_tree_generator.$kw19$EDGES)) {
                _csetf_psp_equivalence_set_edges(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)psp_parse_tree_generator.$str20$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 2894L)
    public static SubLObject visit_defstruct_psp_edge_equivalence_set(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_parse_tree_generator.$kw21$BEGIN, (SubLObject)psp_parse_tree_generator.$sym22$MAKE_PSP_EDGE_EQUIVALENCE_SET, (SubLObject)psp_parse_tree_generator.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_parse_tree_generator.$kw23$SLOT, (SubLObject)psp_parse_tree_generator.$kw18$CHOICE_DTR_NUM, psp_equivalence_set_choice_dtr_num(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_parse_tree_generator.$kw23$SLOT, (SubLObject)psp_parse_tree_generator.$kw19$EDGES, psp_equivalence_set_edges(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)psp_parse_tree_generator.$kw24$END, (SubLObject)psp_parse_tree_generator.$sym22$MAKE_PSP_EDGE_EQUIVALENCE_SET, (SubLObject)psp_parse_tree_generator.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 2894L)
    public static SubLObject visit_defstruct_object_psp_edge_equivalence_set_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_psp_edge_equivalence_set(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 3138L)
    public static SubLObject pprint_psp_equivalence_set(final SubLObject equivalence_set, SubLObject stream, SubLObject depth) {
        if (stream == psp_parse_tree_generator.UNPROVIDED) {
            stream = (SubLObject)psp_parse_tree_generator.NIL;
        }
        if (depth == psp_parse_tree_generator.UNPROVIDED) {
            depth = (SubLObject)psp_parse_tree_generator.NIL;
        }
        return PrintLow.format(stream, (SubLObject)psp_parse_tree_generator.$str26$_PSP_EQUIV_SET_of__S_edges_, set.set_size(psp_equivalence_set_edges(equivalence_set)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 3359L)
    public static SubLObject new_psp_equivalence_set() {
        return make_psp_edge_equivalence_set((SubLObject)ConsesLow.list((SubLObject)psp_parse_tree_generator.$kw18$CHOICE_DTR_NUM, (SubLObject)psp_parse_tree_generator.NIL, (SubLObject)psp_parse_tree_generator.$kw19$EDGES, set.new_set((SubLObject)psp_parse_tree_generator.UNPROVIDED, (SubLObject)psp_parse_tree_generator.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 3497L)
    public static SubLObject psp_equivalence_set_add_edge(final SubLObject equivalence_set, final SubLObject edge, SubLObject choice_dtr_num) {
        if (choice_dtr_num == psp_parse_tree_generator.UNPROVIDED) {
            choice_dtr_num = (SubLObject)psp_parse_tree_generator.NIL;
        }
        if (psp_parse_tree_generator.NIL != subl_promotions.positive_integer_p(choice_dtr_num)) {
            final SubLObject existing = psp_equivalence_set_choice_dtr_num(equivalence_set);
            if (psp_parse_tree_generator.NIL == subl_promotions.positive_integer_p(existing)) {
                _csetf_psp_equivalence_set_choice_dtr_num(equivalence_set, choice_dtr_num);
            }
            else if (!choice_dtr_num.eql(existing)) {
                Errors.error((SubLObject)psp_parse_tree_generator.$str27$New_choice_dtr_num_of__S_doesn_t_, choice_dtr_num, equivalence_set);
            }
        }
        return set.set_add(edge, psp_equivalence_set_edges(equivalence_set));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 4057L)
    public static SubLObject psp_equivalence_sets_for_edges(final SubLObject edges) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject equivalence_sets = set.new_set((SubLObject)psp_parse_tree_generator.UNPROVIDED, (SubLObject)psp_parse_tree_generator.UNPROVIDED);
        final SubLObject set_contents_var = set.do_set_internal(edges);
        SubLObject basis_object;
        SubLObject state;
        SubLObject edge;
        SubLObject foundP;
        SubLObject set_contents_var_$4;
        SubLObject basis_object_$5;
        SubLObject state_$6;
        SubLObject equivalence_set;
        SubLObject fitsP;
        SubLObject choice_dtr_num;
        SubLObject new_equivalence_set;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)psp_parse_tree_generator.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); psp_parse_tree_generator.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            edge = set_contents.do_set_contents_next(basis_object, state);
            if (psp_parse_tree_generator.NIL != set_contents.do_set_contents_element_validP(state, edge)) {
                foundP = (SubLObject)psp_parse_tree_generator.NIL;
                set_contents_var_$4 = set.do_set_internal(equivalence_sets);
                for (basis_object_$5 = set_contents.do_set_contents_basis_object(set_contents_var_$4), state_$6 = (SubLObject)psp_parse_tree_generator.NIL, state_$6 = set_contents.do_set_contents_initial_state(basis_object_$5, set_contents_var_$4); psp_parse_tree_generator.NIL == foundP && psp_parse_tree_generator.NIL == set_contents.do_set_contents_doneP(basis_object_$5, state_$6); state_$6 = set_contents.do_set_contents_update_state(state_$6)) {
                    equivalence_set = set_contents.do_set_contents_next(basis_object_$5, state_$6);
                    if (psp_parse_tree_generator.NIL != set_contents.do_set_contents_element_validP(state_$6, equivalence_set)) {
                        thread.resetMultipleValues();
                        fitsP = psp_edge_fits_in_equivalence_setP(edge, equivalence_set);
                        choice_dtr_num = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (psp_parse_tree_generator.NIL != fitsP) {
                            foundP = (SubLObject)psp_parse_tree_generator.T;
                            psp_equivalence_set_add_edge(equivalence_set, edge, choice_dtr_num);
                        }
                    }
                }
                if (psp_parse_tree_generator.NIL == foundP) {
                    new_equivalence_set = new_psp_equivalence_set();
                    psp_equivalence_set_add_edge(new_equivalence_set, edge, (SubLObject)psp_parse_tree_generator.UNPROVIDED);
                    set.set_add(new_equivalence_set, equivalence_sets);
                }
            }
        }
        return equivalence_sets;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 4819L)
    public static SubLObject psp_edge_fits_in_equivalence_setP(final SubLObject edge, final SubLObject equivalence_set) {
        final SubLObject edges = psp_equivalence_set_edges(equivalence_set);
        final SubLObject choice_dtr_num = psp_equivalence_set_choice_dtr_num(equivalence_set);
        final SubLObject representative_edge = set_utilities.set_arbitrary_element(edges);
        return psp_edges_choice_node_equivalentP(edge, representative_edge, choice_dtr_num);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 5169L)
    public static SubLObject psp_edges_choice_node_equivalentP(final SubLObject edge1, final SubLObject edge2, SubLObject choice_dtr_num) {
        SubLObject equivalentP = (SubLObject)psp_parse_tree_generator.NIL;
        if (psp_chart.get_psp_edge_category(edge1).equal(psp_chart.get_psp_edge_category(edge2)) && psp_chart.get_psp_edge_rule(edge1).eql(psp_chart.get_psp_edge_rule(edge2)) && psp_parse_tree_generator.NIL != list_utilities.same_length_p(psp_chart.get_psp_edge_non_head_dtrs(edge1), psp_chart.get_psp_edge_non_head_dtrs(edge2))) {
            SubLObject mismatchP = (SubLObject)psp_parse_tree_generator.NIL;
            SubLObject list_var = (SubLObject)psp_parse_tree_generator.NIL;
            SubLObject dtr = (SubLObject)psp_parse_tree_generator.NIL;
            SubLObject i = (SubLObject)psp_parse_tree_generator.NIL;
            list_var = psp_chart.psp_edge_dtrs(edge1);
            dtr = list_var.first();
            for (i = (SubLObject)psp_parse_tree_generator.ZERO_INTEGER; psp_parse_tree_generator.NIL == mismatchP && psp_parse_tree_generator.NIL != list_var; list_var = list_var.rest(), dtr = list_var.first(), i = Numbers.add((SubLObject)psp_parse_tree_generator.ONE_INTEGER, i)) {
                final SubLObject dtr_num = number_utilities.f_1X(i);
                if (!dtr_num.eql(choice_dtr_num)) {
                    if (!dtr.eql(psp_chart.psp_edge_nth_dtr(dtr_num, edge2))) {
                        if (psp_parse_tree_generator.NIL == choice_dtr_num) {
                            choice_dtr_num = dtr_num;
                        }
                        else {
                            mismatchP = (SubLObject)psp_parse_tree_generator.T;
                        }
                    }
                }
            }
            equivalentP = (SubLObject)SubLObjectFactory.makeBoolean(psp_parse_tree_generator.NIL == mismatchP);
        }
        return Values.values(equivalentP, choice_dtr_num);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 5979L)
    public static SubLObject psp_create_node_for_equivalence_sets(final SubLObject equivalence_sets) {
        final SubLObject choice_node = psp_generate_choice_node();
        final SubLObject set_contents_var = set.do_set_internal(equivalence_sets);
        SubLObject basis_object;
        SubLObject state;
        SubLObject equivalence_set;
        SubLObject option_node;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)psp_parse_tree_generator.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); psp_parse_tree_generator.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            equivalence_set = set_contents.do_set_contents_next(basis_object, state);
            if (psp_parse_tree_generator.NIL != set_contents.do_set_contents_element_validP(state, equivalence_set)) {
                option_node = psp_find_or_create_node_for_equivalence_set(equivalence_set);
                psp_choice_node_add_option_node(choice_node, option_node);
            }
        }
        return choice_node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 6364L)
    public static SubLObject psp_find_or_create_node_for_equivalence_set(final SubLObject equivalence_set) {
        final SubLObject edges = psp_equivalence_set_edges(equivalence_set);
        final SubLObject found = psp_chart.psp_edge_set_lookup_node(edges, (SubLObject)psp_parse_tree_generator.UNPROVIDED);
        if (psp_parse_tree_generator.NIL != parsing_utilities.syntactic_node_p(found, (SubLObject)psp_parse_tree_generator.UNPROVIDED)) {
            return found;
        }
        return psp_create_node_for_equivalence_set(equivalence_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 6724L)
    public static SubLObject psp_create_node_for_equivalence_set(final SubLObject equivalence_set) {
        final SubLObject edges = psp_equivalence_set_edges(equivalence_set);
        final SubLObject representative_edge = set_utilities.set_arbitrary_element(edges);
        if (psp_parse_tree_generator.ONE_INTEGER.eql(set.set_size(edges))) {
            return psp_find_or_create_node_for_edge(representative_edge);
        }
        final SubLObject choice_node = psp_create_node_shell_for_edge(representative_edge);
        final SubLObject choice_dtr_num = psp_equivalence_set_choice_dtr_num(equivalence_set);
        SubLObject list_var = (SubLObject)psp_parse_tree_generator.NIL;
        SubLObject dtr = (SubLObject)psp_parse_tree_generator.NIL;
        SubLObject i = (SubLObject)psp_parse_tree_generator.NIL;
        list_var = psp_chart.psp_edge_dtrs(representative_edge);
        dtr = list_var.first();
        for (i = (SubLObject)psp_parse_tree_generator.ZERO_INTEGER; psp_parse_tree_generator.NIL != list_var; list_var = list_var.rest(), dtr = list_var.first(), i = Numbers.add((SubLObject)psp_parse_tree_generator.ONE_INTEGER, i)) {
            final SubLObject dtr_num = number_utilities.f_1X(i);
            SubLObject dtr_node = (SubLObject)psp_parse_tree_generator.NIL;
            if (dtr_num.eql(choice_dtr_num)) {
                final SubLObject option_nodes = set.new_set((SubLObject)psp_parse_tree_generator.UNPROVIDED, (SubLObject)psp_parse_tree_generator.UNPROVIDED);
                final SubLObject set_contents_var = set.do_set_internal(edges);
                SubLObject basis_object;
                SubLObject state;
                SubLObject edge;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)psp_parse_tree_generator.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); psp_parse_tree_generator.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    edge = set_contents.do_set_contents_next(basis_object, state);
                    if (psp_parse_tree_generator.NIL != set_contents.do_set_contents_element_validP(state, edge)) {
                        set.set_add(psp_chart.psp_edge_nth_dtr(dtr_num, edge), option_nodes);
                    }
                }
                dtr_node = psp_find_or_create_node_for_edges(option_nodes);
            }
            else {
                dtr_node = psp_find_or_create_node_for_edge(dtr);
            }
            psp_node_add_dtr(choice_node, dtr_node, dtr_num);
        }
        psp_chart.psp_edge_set_note_node(edges, choice_node);
        return choice_node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 7785L)
    public static SubLObject psp_find_or_create_node_for_edge(final SubLObject edge) {
        final SubLObject found = psp_chart.psp_edge_lookup_node(edge, (SubLObject)psp_parse_tree_generator.UNPROVIDED);
        if (psp_parse_tree_generator.NIL != parsing_utilities.syntactic_node_p(found, (SubLObject)psp_parse_tree_generator.UNPROVIDED)) {
            return found;
        }
        return psp_create_node_for_edge(edge);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 7979L)
    public static SubLObject psp_create_node_for_edge(final SubLObject edge) {
        final SubLObject node = psp_create_node_shell_for_edge(edge);
        SubLObject list_var = (SubLObject)psp_parse_tree_generator.NIL;
        SubLObject dtr = (SubLObject)psp_parse_tree_generator.NIL;
        SubLObject i = (SubLObject)psp_parse_tree_generator.NIL;
        list_var = psp_chart.psp_edge_dtrs(edge);
        dtr = list_var.first();
        for (i = (SubLObject)psp_parse_tree_generator.ZERO_INTEGER; psp_parse_tree_generator.NIL != list_var; list_var = list_var.rest(), dtr = list_var.first(), i = Numbers.add((SubLObject)psp_parse_tree_generator.ONE_INTEGER, i)) {
            final SubLObject dtr_num = number_utilities.f_1X(i);
            psp_node_add_dtr(node, psp_find_or_create_node_for_edge(dtr), dtr_num);
        }
        psp_chart.psp_edge_note_node(edge, node);
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 8352L)
    public static SubLObject psp_create_node_shell_for_edge(final SubLObject edge) {
        final SubLObject lexicalP = Numbers.zerop(psp_chart.psp_edge_dtr_count(edge));
        final SubLObject node = psp_create_node(psp_chart.get_psp_edge_category(edge), psp_chart.psp_edge_rule_fort(edge), psp_chart.get_psp_edge_span(edge), lexicalP, psp_chart.get_psp_edge_string(edge));
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 8680L)
    public static SubLObject psp_edge_note_meaning_on_node_if_known(final SubLObject edge, final SubLObject meaning, SubLObject pred) {
        if (pred == psp_parse_tree_generator.UNPROVIDED) {
            pred = psp_parse_tree_generator.$const28$proposedMeaning;
        }
        final SubLObject node = psp_chart.psp_edge_lookup_node(edge, (SubLObject)psp_parse_tree_generator.UNPROVIDED);
        if (psp_parse_tree_generator.NIL != parsing_utilities.syntactic_node_p(node, (SubLObject)psp_parse_tree_generator.UNPROVIDED)) {
            psp_node_propose_meaning(node, meaning, pred);
        }
        return edge;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 8958L)
    public static SubLObject psp_note_semantic_dependency(final SubLObject focal_edge, final SubLObject focal_edge_semx, final SubLObject other_edge, final SubLObject other_edge_semx) {
        final SubLObject focal_edge_node = psp_chart.psp_edge_lookup_node(focal_edge, (SubLObject)psp_parse_tree_generator.UNPROVIDED);
        final SubLObject other_edge_node = psp_chart.psp_edge_lookup_node(other_edge, (SubLObject)psp_parse_tree_generator.UNPROVIDED);
        if (psp_parse_tree_generator.NIL != parsing_utilities.syntactic_node_p(focal_edge_node, (SubLObject)psp_parse_tree_generator.UNPROVIDED) && psp_parse_tree_generator.NIL != parsing_utilities.syntactic_node_p(other_edge_node, (SubLObject)psp_parse_tree_generator.UNPROVIDED)) {
            psp_node_note_semantic_dependency(focal_edge_node, focal_edge_semx, other_edge_node, other_edge_semx);
        }
        return (SubLObject)psp_parse_tree_generator.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 9645L)
    public static SubLObject with_psp_parse_tree_assert_parameters(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)psp_parse_tree_generator.$sym29$CLET, (SubLObject)psp_parse_tree_generator.$list30, (SubLObject)ConsesLow.list((SubLObject)psp_parse_tree_generator.$sym31$WITH_PARSE_TREE_MT, (SubLObject)psp_parse_tree_generator.$list32, (SubLObject)ConsesLow.listS((SubLObject)psp_parse_tree_generator.$sym33$WITH_PARSE_TREE_PREFIX, (SubLObject)psp_parse_tree_generator.$str34$PSP, ConsesLow.append(body, (SubLObject)psp_parse_tree_generator.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 9887L)
    public static SubLObject psp_create_parse_tree_with_root_node(final SubLObject root_node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tree = (SubLObject)psp_parse_tree_generator.NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
            parsing_vars.$parse_tree_mt$.bind(psp_chart_parse_tree_mt((SubLObject)psp_parse_tree_generator.UNPROVIDED), thread);
            parsing_vars.$parse_tree_prefix$.bind((SubLObject)psp_parse_tree_generator.$str34$PSP, thread);
            tree = parsing_utilities.create_parse_tree_with_root_node(root_node, (SubLObject)psp_parse_tree_generator.UNPROVIDED, (SubLObject)psp_parse_tree_generator.UNPROVIDED);
        }
        finally {
            parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_3, thread);
            parsing_vars.$parse_tree_mt$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return tree;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 10093L)
    public static SubLObject psp_agent() {
        final SubLObject constant = constants_high.find_constant((SubLObject)psp_parse_tree_generator.$str35$TheCycPhraseStructureParser);
        return (psp_parse_tree_generator.NIL != constant) ? constant : czer_main.cyc_find_or_create_nart((SubLObject)psp_parse_tree_generator.$list36, (SubLObject)psp_parse_tree_generator.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 10432L)
    public static SubLObject psp_create_instance(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject instance = (SubLObject)psp_parse_tree_generator.NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
            parsing_vars.$parse_tree_mt$.bind(psp_chart_parse_tree_mt((SubLObject)psp_parse_tree_generator.UNPROVIDED), thread);
            parsing_vars.$parse_tree_prefix$.bind((SubLObject)psp_parse_tree_generator.$str34$PSP, thread);
            instance = parsing_utilities.create_parse_tree_element(col, (SubLObject)psp_parse_tree_generator.UNPROVIDED, (SubLObject)psp_parse_tree_generator.UNPROVIDED);
        }
        finally {
            parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_3, thread);
            parsing_vars.$parse_tree_mt$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return instance;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 10664L)
    public static SubLObject psp_create_node(final SubLObject category, final SubLObject rule, final SubLObject local_span, final SubLObject lexical_nodeP, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tokenization = psp_chart_tokenization((SubLObject)psp_parse_tree_generator.UNPROVIDED);
        final SubLObject span_wrt_tokenization = psp_span_wrt_tokenization(local_span, tokenization);
        final SubLObject creator = psp_agent();
        SubLObject node = (SubLObject)psp_parse_tree_generator.NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
            parsing_vars.$parse_tree_mt$.bind(psp_chart_parse_tree_mt((SubLObject)psp_parse_tree_generator.UNPROVIDED), thread);
            parsing_vars.$parse_tree_prefix$.bind((SubLObject)psp_parse_tree_generator.$str34$PSP, thread);
            node = parsing_utilities.create_syntactic_node(tokenization, creator, category, span_wrt_tokenization, lexical_nodeP, string, rule, (SubLObject)psp_parse_tree_generator.UNPROVIDED, (SubLObject)psp_parse_tree_generator.UNPROVIDED);
        }
        finally {
            parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_3, thread);
            parsing_vars.$parse_tree_mt$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 11139L)
    public static SubLObject psp_span_wrt_tokenization(final SubLObject local_span, final SubLObject tokenization) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_start = interval_span.interval_span_start(local_span);
        final SubLObject local_end = interval_span.interval_span_end(local_span);
        final SubLObject offset = parsing_vars.$parse_tokenization_offset$.getDynamicValue(thread);
        return interval_span.get_interval_span(Numbers.add(local_start, offset), Numbers.add(local_end, offset));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 11522L)
    public static SubLObject psp_node_add_dtr(final SubLObject node, final SubLObject dtr_node, final SubLObject dtr_num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject existing = ask_utilities.ask_variable((SubLObject)psp_parse_tree_generator.$sym37$_DTR_NODE, (SubLObject)ConsesLow.listS(psp_parse_tree_generator.$const38$syntacticNodeNthDaughter, node, dtr_num, (SubLObject)psp_parse_tree_generator.$list39), psp_chart_parse_tree_mt((SubLObject)psp_parse_tree_generator.UNPROVIDED), (SubLObject)psp_parse_tree_generator.UNPROVIDED, (SubLObject)psp_parse_tree_generator.UNPROVIDED, (SubLObject)psp_parse_tree_generator.UNPROVIDED, (SubLObject)psp_parse_tree_generator.UNPROVIDED);
        final SubLObject otherP = (SubLObject)psp_parse_tree_generator.NIL;
        if (psp_parse_tree_generator.NIL == otherP) {
            SubLObject csome_list_var = existing;
            SubLObject existing_dtr = (SubLObject)psp_parse_tree_generator.NIL;
            existing_dtr = csome_list_var.first();
            while (psp_parse_tree_generator.NIL == otherP && psp_parse_tree_generator.NIL != csome_list_var) {
                if (!existing_dtr.eql(dtr_node)) {
                    Errors.sublisp_break((SubLObject)psp_parse_tree_generator.$str40$__Trying_to_add__S_to____S___as_d, new SubLObject[] { dtr_node, existing, dtr_num, node });
                }
                csome_list_var = csome_list_var.rest();
                existing_dtr = csome_list_var.first();
            }
        }
        if (psp_parse_tree_generator.NIL == existing) {
            final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
            final SubLObject _prev_bind_2 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
            final SubLObject _prev_bind_3 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
            try {
                api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
                parsing_vars.$parse_tree_mt$.bind(psp_chart_parse_tree_mt((SubLObject)psp_parse_tree_generator.UNPROVIDED), thread);
                parsing_vars.$parse_tree_prefix$.bind((SubLObject)psp_parse_tree_generator.$str34$PSP, thread);
                parsing_utilities.syntactic_node_add_dtr(node, dtr_node, dtr_num, (SubLObject)psp_parse_tree_generator.UNPROVIDED);
            }
            finally {
                parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_3, thread);
                parsing_vars.$parse_tree_mt$.rebind(_prev_bind_2, thread);
                api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
            }
        }
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 12100L)
    public static SubLObject psp_node_propose_meaning(final SubLObject node, final SubLObject meaning, SubLObject pred) {
        if (pred == psp_parse_tree_generator.UNPROVIDED) {
            pred = psp_parse_tree_generator.$const28$proposedMeaning;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
            parsing_vars.$parse_tree_mt$.bind(psp_chart_parse_tree_mt((SubLObject)psp_parse_tree_generator.UNPROVIDED), thread);
            parsing_vars.$parse_tree_prefix$.bind((SubLObject)psp_parse_tree_generator.$str34$PSP, thread);
            parsing_utilities.syntactic_node_propose_meaning(node, meaning, pred, (SubLObject)psp_parse_tree_generator.UNPROVIDED);
        }
        finally {
            parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_3, thread);
            parsing_vars.$parse_tree_mt$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 12303L)
    public static SubLObject psp_node_note_semantic_dependency(final SubLObject mother, final SubLObject mother_meaning, final SubLObject dtr, final SubLObject dtr_meaning) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
            parsing_vars.$parse_tree_mt$.bind(psp_chart_parse_tree_mt((SubLObject)psp_parse_tree_generator.UNPROVIDED), thread);
            parsing_vars.$parse_tree_prefix$.bind((SubLObject)psp_parse_tree_generator.$str34$PSP, thread);
            parsing_utilities.syntactic_node_note_semantic_dependency(mother, psp_semantics.psp_cycl_cycl(mother_meaning), dtr, psp_semantics.psp_cycl_cycl(dtr_meaning), (SubLObject)psp_parse_tree_generator.UNPROVIDED);
        }
        finally {
            parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_3, thread);
            parsing_vars.$parse_tree_mt$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return mother;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 12579L)
    public static SubLObject psp_generate_choice_node() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject creator = psp_agent();
        SubLObject node = (SubLObject)psp_parse_tree_generator.NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
            parsing_vars.$parse_tree_mt$.bind(psp_chart_parse_tree_mt((SubLObject)psp_parse_tree_generator.UNPROVIDED), thread);
            parsing_vars.$parse_tree_prefix$.bind((SubLObject)psp_parse_tree_generator.$str34$PSP, thread);
            node = parsing_utilities.generate_choice_node(creator, (SubLObject)psp_parse_tree_generator.UNPROVIDED, (SubLObject)psp_parse_tree_generator.UNPROVIDED);
        }
        finally {
            parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_3, thread);
            parsing_vars.$parse_tree_mt$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 12826L)
    public static SubLObject psp_choice_node_add_option_node(final SubLObject choice_node, final SubLObject option_node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
            parsing_vars.$parse_tree_mt$.bind(psp_chart_parse_tree_mt((SubLObject)psp_parse_tree_generator.UNPROVIDED), thread);
            parsing_vars.$parse_tree_prefix$.bind((SubLObject)psp_parse_tree_generator.$str34$PSP, thread);
            parsing_utilities.choice_node_add_option_node(choice_node, option_node, (SubLObject)psp_parse_tree_generator.UNPROVIDED);
        }
        finally {
            parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_3, thread);
            parsing_vars.$parse_tree_mt$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return choice_node;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 13144L)
    public static SubLObject psp_chart_tokenization(SubLObject chart) {
        if (chart == psp_parse_tree_generator.UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (psp_parse_tree_generator.NIL != forts.fort_p(parsing_vars.$parse_tokenization$.getDynamicValue(thread))) {
            return parsing_vars.$parse_tokenization$.getDynamicValue(thread);
        }
        SubLObject tokenization = dictionary.dictionary_lookup(psp_parse_tree_generator.$psp_chart_tokenizations$.getGlobalValue(), chart, (SubLObject)psp_parse_tree_generator.UNPROVIDED);
        if (psp_parse_tree_generator.NIL == forts.fort_p(tokenization)) {
            tokenization = psp_create_instance(psp_parse_tree_generator.$const42$CycTokenization);
            dictionary.dictionary_enter(psp_parse_tree_generator.$psp_chart_tokenizations$.getGlobalValue(), chart, tokenization);
        }
        return tokenization;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/psp-parse-tree-generator.lisp", position = 13641L)
    public static SubLObject psp_chart_parse_tree_mt(SubLObject chart) {
        if (chart == psp_parse_tree_generator.UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (psp_parse_tree_generator.NIL != hlmt.hlmt_p(parsing_vars.$parse_tree_mt$.getDynamicValue(thread))) {
            return parsing_vars.$parse_tree_mt$.getDynamicValue(thread);
        }
        final SubLObject name = (SubLObject)psp_parse_tree_generator.$str43$ParseTreeSandboxMt;
        SubLObject mt = constants_high.find_constant(name);
        if (psp_parse_tree_generator.NIL == constant_handles.valid_constantP(mt, (SubLObject)psp_parse_tree_generator.UNPROVIDED)) {
            final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
            try {
                api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
                ke.ke_create_now(name, (SubLObject)psp_parse_tree_generator.UNPROVIDED);
                mt = constants_high.find_constant(name);
                ke.ke_assert_now((SubLObject)ConsesLow.listS(psp_parse_tree_generator.$const44$isa, mt, (SubLObject)psp_parse_tree_generator.$list45), psp_parse_tree_generator.$const46$BaseKB, (SubLObject)psp_parse_tree_generator.UNPROVIDED, (SubLObject)psp_parse_tree_generator.UNPROVIDED);
                ke.ke_assert_now((SubLObject)ConsesLow.listS(psp_parse_tree_generator.$const47$genlMt, mt, (SubLObject)psp_parse_tree_generator.$list48), psp_parse_tree_generator.$const46$BaseKB, (SubLObject)psp_parse_tree_generator.UNPROVIDED, (SubLObject)psp_parse_tree_generator.UNPROVIDED);
                ke.ke_assert_now((SubLObject)ConsesLow.listS(psp_parse_tree_generator.$const47$genlMt, mt, (SubLObject)psp_parse_tree_generator.$list49), psp_parse_tree_generator.$const46$BaseKB, (SubLObject)psp_parse_tree_generator.UNPROVIDED, (SubLObject)psp_parse_tree_generator.UNPROVIDED);
            }
            finally {
                api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
            }
        }
        return mt;
    }
    
    public static SubLObject declare_psp_parse_tree_generator_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_generate_parse_tree_for_string", "PSP-GENERATE-PARSE-TREE-FOR-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_generate_parse_tree_for_chart", "PSP-GENERATE-PARSE-TREE-FOR-CHART", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_find_or_create_node_for_edges", "PSP-FIND-OR-CREATE-NODE-FOR-EDGES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_create_node_for_edges_int", "PSP-CREATE-NODE-FOR-EDGES-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_edge_equivalence_set_print_function_trampoline", "PSP-EDGE-EQUIVALENCE-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_edge_equivalence_set_p", "PSP-EDGE-EQUIVALENCE-SET-P", 1, 0, false);
        new $psp_edge_equivalence_set_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_equivalence_set_choice_dtr_num", "PSP-EQUIVALENCE-SET-CHOICE-DTR-NUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_equivalence_set_edges", "PSP-EQUIVALENCE-SET-EDGES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "_csetf_psp_equivalence_set_choice_dtr_num", "_CSETF-PSP-EQUIVALENCE-SET-CHOICE-DTR-NUM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "_csetf_psp_equivalence_set_edges", "_CSETF-PSP-EQUIVALENCE-SET-EDGES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "make_psp_edge_equivalence_set", "MAKE-PSP-EDGE-EQUIVALENCE-SET", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "visit_defstruct_psp_edge_equivalence_set", "VISIT-DEFSTRUCT-PSP-EDGE-EQUIVALENCE-SET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "visit_defstruct_object_psp_edge_equivalence_set_method", "VISIT-DEFSTRUCT-OBJECT-PSP-EDGE-EQUIVALENCE-SET-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "pprint_psp_equivalence_set", "PPRINT-PSP-EQUIVALENCE-SET", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "new_psp_equivalence_set", "NEW-PSP-EQUIVALENCE-SET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_equivalence_set_add_edge", "PSP-EQUIVALENCE-SET-ADD-EDGE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_equivalence_sets_for_edges", "PSP-EQUIVALENCE-SETS-FOR-EDGES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_edge_fits_in_equivalence_setP", "PSP-EDGE-FITS-IN-EQUIVALENCE-SET?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_edges_choice_node_equivalentP", "PSP-EDGES-CHOICE-NODE-EQUIVALENT?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_create_node_for_equivalence_sets", "PSP-CREATE-NODE-FOR-EQUIVALENCE-SETS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_find_or_create_node_for_equivalence_set", "PSP-FIND-OR-CREATE-NODE-FOR-EQUIVALENCE-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_create_node_for_equivalence_set", "PSP-CREATE-NODE-FOR-EQUIVALENCE-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_find_or_create_node_for_edge", "PSP-FIND-OR-CREATE-NODE-FOR-EDGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_create_node_for_edge", "PSP-CREATE-NODE-FOR-EDGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_create_node_shell_for_edge", "PSP-CREATE-NODE-SHELL-FOR-EDGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_edge_note_meaning_on_node_if_known", "PSP-EDGE-NOTE-MEANING-ON-NODE-IF-KNOWN", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_note_semantic_dependency", "PSP-NOTE-SEMANTIC-DEPENDENCY", 4, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.psp_parse_tree_generator", "with_psp_parse_tree_assert_parameters", "WITH-PSP-PARSE-TREE-ASSERT-PARAMETERS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_create_parse_tree_with_root_node", "PSP-CREATE-PARSE-TREE-WITH-ROOT-NODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_agent", "PSP-AGENT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_create_instance", "PSP-CREATE-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_create_node", "PSP-CREATE-NODE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_span_wrt_tokenization", "PSP-SPAN-WRT-TOKENIZATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_node_add_dtr", "PSP-NODE-ADD-DTR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_node_propose_meaning", "PSP-NODE-PROPOSE-MEANING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_node_note_semantic_dependency", "PSP-NODE-NOTE-SEMANTIC-DEPENDENCY", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_generate_choice_node", "PSP-GENERATE-CHOICE-NODE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_choice_node_add_option_node", "PSP-CHOICE-NODE-ADD-OPTION-NODE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_chart_tokenization", "PSP-CHART-TOKENIZATION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.psp_parse_tree_generator", "psp_chart_parse_tree_mt", "PSP-CHART-PARSE-TREE-MT", 0, 1, false);
        return (SubLObject)psp_parse_tree_generator.NIL;
    }
    
    public static SubLObject init_psp_parse_tree_generator_file() {
        psp_parse_tree_generator.$dtp_psp_edge_equivalence_set$ = SubLFiles.defconstant("*DTP-PSP-EDGE-EQUIVALENCE-SET*", (SubLObject)psp_parse_tree_generator.$sym5$PSP_EDGE_EQUIVALENCE_SET);
        psp_parse_tree_generator.$psp_chart_tokenizations$ = SubLFiles.deflexical("*PSP-CHART-TOKENIZATIONS*", maybeDefault((SubLObject)psp_parse_tree_generator.$sym41$_PSP_CHART_TOKENIZATIONS_, psp_parse_tree_generator.$psp_chart_tokenizations$, ()->(dictionary.new_dictionary((SubLObject)psp_parse_tree_generator.UNPROVIDED, (SubLObject)psp_parse_tree_generator.UNPROVIDED))));
        return (SubLObject)psp_parse_tree_generator.NIL;
    }
    
    public static SubLObject setup_psp_parse_tree_generator_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), psp_parse_tree_generator.$dtp_psp_edge_equivalence_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)psp_parse_tree_generator.$sym12$PSP_EDGE_EQUIVALENCE_SET_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)psp_parse_tree_generator.$list13);
        Structures.def_csetf((SubLObject)psp_parse_tree_generator.$sym14$PSP_EQUIVALENCE_SET_CHOICE_DTR_NUM, (SubLObject)psp_parse_tree_generator.$sym15$_CSETF_PSP_EQUIVALENCE_SET_CHOICE_DTR_NUM);
        Structures.def_csetf((SubLObject)psp_parse_tree_generator.$sym16$PSP_EQUIVALENCE_SET_EDGES, (SubLObject)psp_parse_tree_generator.$sym17$_CSETF_PSP_EQUIVALENCE_SET_EDGES);
        Equality.identity((SubLObject)psp_parse_tree_generator.$sym5$PSP_EDGE_EQUIVALENCE_SET);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), psp_parse_tree_generator.$dtp_psp_edge_equivalence_set$.getGlobalValue(), Symbols.symbol_function((SubLObject)psp_parse_tree_generator.$sym25$VISIT_DEFSTRUCT_OBJECT_PSP_EDGE_EQUIVALENCE_SET_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)psp_parse_tree_generator.$sym41$_PSP_CHART_TOKENIZATIONS_);
        return (SubLObject)psp_parse_tree_generator.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_psp_parse_tree_generator_file();
    }
    
    @Override
	public void initializeVariables() {
        init_psp_parse_tree_generator_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_psp_parse_tree_generator_file();
    }
    
    static {
        me = (SubLFile)new psp_parse_tree_generator();
        psp_parse_tree_generator.$dtp_psp_edge_equivalence_set$ = null;
        psp_parse_tree_generator.$psp_chart_tokenizations$ = null;
        $kw0$ANY = SubLObjectFactory.makeKeyword("ANY");
        $const1$parseTreeOfTokenization = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("parseTreeOfTokenization"));
        $sym2$PHRASE_STRUCTURE_PARSER_CHART_P = SubLObjectFactory.makeSymbol("PHRASE-STRUCTURE-PARSER-CHART-P");
        $str3$Can_t_generate_a_node_from_no_edg = SubLObjectFactory.makeString("Can't generate a node from no edges!");
        $str4$Found_no_equivalence_sets_for__S_ = SubLObjectFactory.makeString("Found no equivalence sets for ~S.");
        $sym5$PSP_EDGE_EQUIVALENCE_SET = SubLObjectFactory.makeSymbol("PSP-EDGE-EQUIVALENCE-SET");
        $sym6$PSP_EDGE_EQUIVALENCE_SET_P = SubLObjectFactory.makeSymbol("PSP-EDGE-EQUIVALENCE-SET-P");
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHOICE-DTR-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("EDGES"));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CHOICE-DTR-NUM"), (SubLObject)SubLObjectFactory.makeKeyword("EDGES"));
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PSP-EQUIVALENCE-SET-CHOICE-DTR-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("PSP-EQUIVALENCE-SET-EDGES"));
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PSP-EQUIVALENCE-SET-CHOICE-DTR-NUM"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PSP-EQUIVALENCE-SET-EDGES"));
        $sym11$PPRINT_PSP_EQUIVALENCE_SET = SubLObjectFactory.makeSymbol("PPRINT-PSP-EQUIVALENCE-SET");
        $sym12$PSP_EDGE_EQUIVALENCE_SET_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PSP-EDGE-EQUIVALENCE-SET-PRINT-FUNCTION-TRAMPOLINE");
        $list13 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PSP-EDGE-EQUIVALENCE-SET-P"));
        $sym14$PSP_EQUIVALENCE_SET_CHOICE_DTR_NUM = SubLObjectFactory.makeSymbol("PSP-EQUIVALENCE-SET-CHOICE-DTR-NUM");
        $sym15$_CSETF_PSP_EQUIVALENCE_SET_CHOICE_DTR_NUM = SubLObjectFactory.makeSymbol("_CSETF-PSP-EQUIVALENCE-SET-CHOICE-DTR-NUM");
        $sym16$PSP_EQUIVALENCE_SET_EDGES = SubLObjectFactory.makeSymbol("PSP-EQUIVALENCE-SET-EDGES");
        $sym17$_CSETF_PSP_EQUIVALENCE_SET_EDGES = SubLObjectFactory.makeSymbol("_CSETF-PSP-EQUIVALENCE-SET-EDGES");
        $kw18$CHOICE_DTR_NUM = SubLObjectFactory.makeKeyword("CHOICE-DTR-NUM");
        $kw19$EDGES = SubLObjectFactory.makeKeyword("EDGES");
        $str20$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw21$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym22$MAKE_PSP_EDGE_EQUIVALENCE_SET = SubLObjectFactory.makeSymbol("MAKE-PSP-EDGE-EQUIVALENCE-SET");
        $kw23$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw24$END = SubLObjectFactory.makeKeyword("END");
        $sym25$VISIT_DEFSTRUCT_OBJECT_PSP_EDGE_EQUIVALENCE_SET_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PSP-EDGE-EQUIVALENCE-SET-METHOD");
        $str26$_PSP_EQUIV_SET_of__S_edges_ = SubLObjectFactory.makeString("<PSP-EQUIV-SET of ~S edges>");
        $str27$New_choice_dtr_num_of__S_doesn_t_ = SubLObjectFactory.makeString("New choice-dtr-num of ~S doesn't match ~S");
        $const28$proposedMeaning = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("proposedMeaning"));
        $sym29$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list30 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*THE-CYCLIST*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PSP-AGENT"))));
        $sym31$WITH_PARSE_TREE_MT = SubLObjectFactory.makeSymbol("WITH-PARSE-TREE-MT");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PSP-CHART-PARSE-TREE-MT"));
        $sym33$WITH_PARSE_TREE_PREFIX = SubLObjectFactory.makeSymbol("WITH-PARSE-TREE-PREFIX");
        $str34$PSP = SubLObjectFactory.makeString("PSP");
        $str35$TheCycPhraseStructureParser = SubLObjectFactory.makeString("TheCycPhraseStructureParser");
        $list36 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InstanceWithRelationFromFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProgramCopyFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycPhraseStructureParser"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("partOfIBT")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cyc")));
        $sym37$_DTR_NODE = SubLObjectFactory.makeSymbol("?DTR-NODE");
        $const38$syntacticNodeNthDaughter = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("syntacticNodeNthDaughter"));
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?DTR-NODE"));
        $str40$__Trying_to_add__S_to____S___as_d = SubLObjectFactory.makeString("~&Trying to add ~S to~% ~S~% as dtr ~S of ~S~%");
        $sym41$_PSP_CHART_TOKENIZATIONS_ = SubLObjectFactory.makeSymbol("*PSP-CHART-TOKENIZATIONS*");
        $const42$CycTokenization = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycTokenization"));
        $str43$ParseTreeSandboxMt = SubLObjectFactory.makeString("ParseTreeSandboxMt");
        $const44$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list45 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory")));
        $const46$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $const47$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $list48 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DiscourseModellingVocabularyMt")));
        $list49 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt")));
    }
    
    public static final class $psp_edge_equivalence_set_native extends SubLStructNative
    {
        public SubLObject $choice_dtr_num;
        public SubLObject $edges;
        private static final SubLStructDeclNative structDecl;
        
        public $psp_edge_equivalence_set_native() {
            this.$choice_dtr_num = (SubLObject)CommonSymbols.NIL;
            this.$edges = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$psp_edge_equivalence_set_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$choice_dtr_num;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$edges;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$choice_dtr_num = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$edges = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$psp_edge_equivalence_set_native.class, psp_parse_tree_generator.$sym5$PSP_EDGE_EQUIVALENCE_SET, psp_parse_tree_generator.$sym6$PSP_EDGE_EQUIVALENCE_SET_P, psp_parse_tree_generator.$list7, psp_parse_tree_generator.$list8, new String[] { "$choice_dtr_num", "$edges" }, psp_parse_tree_generator.$list9, psp_parse_tree_generator.$list10, psp_parse_tree_generator.$sym11$PPRINT_PSP_EQUIVALENCE_SET);
        }
    }
    
    public static final class $psp_edge_equivalence_set_p$UnaryFunction extends UnaryFunction
    {
        public $psp_edge_equivalence_set_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PSP-EDGE-EQUIVALENCE-SET-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return psp_parse_tree_generator.psp_edge_equivalence_set_p(arg1);
        }
    }
}

/*

	Total time: 207 ms
	
*/