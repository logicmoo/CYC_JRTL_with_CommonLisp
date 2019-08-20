/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.zerop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      PSP-PARSE-TREE-GENERATOR
 * source file: /cyc/top/cycl/psp-parse-tree-generator.lisp
 * created:     2019/07/03 17:38:25
 */
public final class psp_parse_tree_generator extends SubLTranslatedFile implements V12 {
    public static final class $psp_edge_equivalence_set_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.psp_parse_tree_generator.$psp_edge_equivalence_set_native.this.$choice_dtr_num;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.psp_parse_tree_generator.$psp_edge_equivalence_set_native.this.$edges;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.psp_parse_tree_generator.$psp_edge_equivalence_set_native.this.$choice_dtr_num = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.psp_parse_tree_generator.$psp_edge_equivalence_set_native.this.$edges = value;
        }

        public SubLObject $choice_dtr_num = Lisp.NIL;

        public SubLObject $edges = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.psp_parse_tree_generator.$psp_edge_equivalence_set_native.class, PSP_EDGE_EQUIVALENCE_SET, PSP_EDGE_EQUIVALENCE_SET_P, $list_alt8, $list_alt9, new String[]{ "$choice_dtr_num", "$edges" }, $list_alt10, $list_alt11, PPRINT_PSP_EQUIVALENCE_SET);
    }

    public static final SubLFile me = new psp_parse_tree_generator();



    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_psp_edge_equivalence_set$ = makeSymbol("*DTP-PSP-EDGE-EQUIVALENCE-SET*");



    private static final SubLSymbol PHRASE_STRUCTURE_PARSER_CHART_P = makeSymbol("PHRASE-STRUCTURE-PARSER-CHART-P");

    private static final SubLString $str3$Can_t_generate_a_node_from_no_edg = makeString("Can't generate a node from no edges!");

    private static final SubLString $str4$Found_no_equivalence_sets_for__S_ = makeString("Found no equivalence sets for ~S.");

    private static final SubLSymbol PSP_EDGE_EQUIVALENCE_SET = makeSymbol("PSP-EDGE-EQUIVALENCE-SET");

    private static final SubLSymbol PSP_EDGE_EQUIVALENCE_SET_P = makeSymbol("PSP-EDGE-EQUIVALENCE-SET-P");

    private static final SubLList $list7 = list(makeSymbol("CHOICE-DTR-NUM"), makeSymbol("EDGES"));

    static private final SubLList $list8 = list(makeKeyword("CHOICE-DTR-NUM"), makeKeyword("EDGES"));

    static private final SubLList $list9 = list(makeSymbol("PSP-EQUIVALENCE-SET-CHOICE-DTR-NUM"), makeSymbol("PSP-EQUIVALENCE-SET-EDGES"));

    static private final SubLList $list10 = list(makeSymbol("_CSETF-PSP-EQUIVALENCE-SET-CHOICE-DTR-NUM"), makeSymbol("_CSETF-PSP-EQUIVALENCE-SET-EDGES"));

    private static final SubLSymbol PPRINT_PSP_EQUIVALENCE_SET = makeSymbol("PPRINT-PSP-EQUIVALENCE-SET");

    private static final SubLSymbol PSP_EDGE_EQUIVALENCE_SET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PSP-EDGE-EQUIVALENCE-SET-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list13 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PSP-EDGE-EQUIVALENCE-SET-P"));

    private static final SubLSymbol PSP_EQUIVALENCE_SET_CHOICE_DTR_NUM = makeSymbol("PSP-EQUIVALENCE-SET-CHOICE-DTR-NUM");

    public static final SubLSymbol _CSETF_PSP_EQUIVALENCE_SET_CHOICE_DTR_NUM = makeSymbol("_CSETF-PSP-EQUIVALENCE-SET-CHOICE-DTR-NUM");

    private static final SubLSymbol PSP_EQUIVALENCE_SET_EDGES = makeSymbol("PSP-EQUIVALENCE-SET-EDGES");

    public static final SubLSymbol _CSETF_PSP_EQUIVALENCE_SET_EDGES = makeSymbol("_CSETF-PSP-EQUIVALENCE-SET-EDGES");

    private static final SubLSymbol $CHOICE_DTR_NUM = makeKeyword("CHOICE-DTR-NUM");

    static private final SubLString $str20$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_PSP_EDGE_EQUIVALENCE_SET = makeSymbol("MAKE-PSP-EDGE-EQUIVALENCE-SET");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PSP_EDGE_EQUIVALENCE_SET_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PSP-EDGE-EQUIVALENCE-SET-METHOD");

    private static final SubLString $str26$_PSP_EQUIV_SET_of__S_edges_ = makeString("<PSP-EQUIV-SET of ~S edges>");

    private static final SubLString $str27$New_choice_dtr_num_of__S_doesn_t_ = makeString("New choice-dtr-num of ~S doesn't match ~S");



    private static final SubLList $list30 = list(list(makeSymbol("*THE-CYCLIST*"), list(makeSymbol("PSP-AGENT"))));

    private static final SubLSymbol WITH_PARSE_TREE_MT = makeSymbol("WITH-PARSE-TREE-MT");

    private static final SubLList $list32 = list(makeSymbol("PSP-CHART-PARSE-TREE-MT"));

    private static final SubLSymbol WITH_PARSE_TREE_PREFIX = makeSymbol("WITH-PARSE-TREE-PREFIX");

    private static final SubLString $$$PSP = makeString("PSP");

    private static final SubLString $$$TheCycPhraseStructureParser = makeString("TheCycPhraseStructureParser");

    private static final SubLList $list36 = list(reader_make_constant_shell("InstanceWithRelationFromFn"), list(reader_make_constant_shell("ProgramCopyFn"), reader_make_constant_shell("CycPhraseStructureParser")), reader_make_constant_shell("partOfIBT"), reader_make_constant_shell("Cyc"));

    private static final SubLSymbol $sym37$_DTR_NODE = makeSymbol("?DTR-NODE");



    private static final SubLList $list39 = list(makeSymbol("?DTR-NODE"));

    private static final SubLString $str40$__Trying_to_add__S_to____S___as_d = makeString("~&Trying to add ~S to~% ~S~% as dtr ~S of ~S~%");

    private static final SubLSymbol $psp_chart_tokenizations$ = makeSymbol("*PSP-CHART-TOKENIZATIONS*");



    private static final SubLString $$$ParseTreeSandboxMt = makeString("ParseTreeSandboxMt");



    private static final SubLList $list45 = list(reader_make_constant_shell("Microtheory"));





    private static final SubLList $list48 = list(reader_make_constant_shell("DiscourseModellingVocabularyMt"));

    private static final SubLList $list49 = list(reader_make_constant_shell("EnglishMt"));

    // Definitions
    public static final SubLObject psp_generate_parse_tree_for_string_alt(SubLObject string, SubLObject category) {
        if (category == UNPROVIDED) {
            category = $ANY;
        }
        return psp_generate_parse_tree_for_chart(psp_syntax.psp_chart_for_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED), category);
    }

    // Definitions
    public static SubLObject psp_generate_parse_tree_for_string(final SubLObject string, SubLObject category) {
        if (category == UNPROVIDED) {
            category = $ANY;
        }
        return psp_generate_parse_tree_for_chart(psp_syntax.psp_chart_for_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED), category);
    }

    public static final SubLObject psp_generate_parse_tree_for_chart_alt(SubLObject chart, SubLObject category) {
        if (category == UNPROVIDED) {
            category = $ANY;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject root_node = NIL;
                SubLObject chart_1 = chart;
                SubLObject local_state = psp_chart.psp_chart_memoization_state(chart_1);
                {
                    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt1$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject _prev_bind_0_2 = parsing_vars.$psp_chart$.currentBinding(thread);
                                    try {
                                        parsing_vars.$psp_chart$.bind(chart_1, thread);
                                        {
                                            SubLObject max_edges = psp_chart.psp_input_spanning_edges(UNPROVIDED);
                                            SubLObject non_trivialP = NIL;
                                            SubLObject pos_pred = $ANY;
                                            SubLObject filtered_edges = psp_main.psp_filter_edges(max_edges, non_trivialP, category, pos_pred, UNPROVIDED, UNPROVIDED);
                                            SubLObject edge_set = set_utilities.construct_set_from_list(filtered_edges, UNPROVIDED, UNPROVIDED);
                                            if (NIL == set.empty_set_p(edge_set)) {
                                                root_node = psp_find_or_create_node_for_edges(edge_set);
                                            }
                                        }
                                    } finally {
                                        parsing_vars.$psp_chart$.rebind(_prev_bind_0_2, thread);
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_3, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject tokenization = psp_chart_tokenization(chart);
                    SubLObject mt = psp_chart_parse_tree_mt(chart);
                    SubLObject v_parse_tree = psp_create_parse_tree_with_root_node(root_node);
                    parsing_utilities.assert_parse_tree_info(list($$parseTreeOfTokenization, v_parse_tree, tokenization), mt);
                    return v_parse_tree;
                }
            }
        }
    }

    public static SubLObject psp_generate_parse_tree_for_chart(final SubLObject chart, SubLObject category) {
        if (category == UNPROVIDED) {
            category = $ANY;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject root_node = NIL;
        final SubLObject local_state = psp_chart.psp_chart_memoization_state(chart);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject _prev_bind_0_$2 = parsing_vars.$psp_chart$.currentBinding(thread);
                try {
                    parsing_vars.$psp_chart$.bind(chart, thread);
                    final SubLObject max_edges = psp_chart.psp_input_spanning_edges(UNPROVIDED);
                    final SubLObject non_trivialP = NIL;
                    final SubLObject pos_pred = $ANY;
                    final SubLObject filtered_edges = psp_main.psp_filter_edges(max_edges, non_trivialP, category, pos_pred, UNPROVIDED, UNPROVIDED);
                    final SubLObject edge_set = set_utilities.construct_set_from_list(filtered_edges, UNPROVIDED, UNPROVIDED);
                    if (NIL == set.empty_set_p(edge_set)) {
                        root_node = psp_find_or_create_node_for_edges(edge_set);
                    }
                } finally {
                    parsing_vars.$psp_chart$.rebind(_prev_bind_0_$2, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        final SubLObject tokenization = psp_chart_tokenization(chart);
        final SubLObject mt = psp_chart_parse_tree_mt(chart);
        final SubLObject v_parse_tree = psp_create_parse_tree_with_root_node(root_node);
        parsing_utilities.assert_parse_tree_info(list($$parseTreeOfTokenization, v_parse_tree, tokenization), mt);
        return v_parse_tree;
    }

    public static final SubLObject psp_find_or_create_node_for_edges_alt(SubLObject edges) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(parsing_vars.$psp_chart$.getDynamicValue(thread), PHRASE_STRUCTURE_PARSER_CHART_P);
            {
                SubLObject found = psp_chart.psp_edge_set_lookup_node(edges, UNPROVIDED);
                if (NIL != parsing_utilities.syntactic_node_p(found, UNPROVIDED)) {
                    return found;
                }
            }
            {
                SubLObject pcase_var = set.set_size(edges);
                if (pcase_var.eql(ZERO_INTEGER)) {
                    Errors.error($str_alt4$Can_t_generate_a_node_from_no_edg);
                } else {
                    if (pcase_var.eql(ONE_INTEGER)) {
                        return psp_create_node_for_edge(set_utilities.set_arbitrary_element(edges));
                    } else {
                        return psp_create_node_for_edges_int(edges);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject psp_find_or_create_node_for_edges(final SubLObject edges) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != psp_chart.phrase_structure_parser_chart_p(parsing_vars.$psp_chart$.getDynamicValue(thread)) : "! psp_chart.phrase_structure_parser_chart_p(parsing_vars.$psp_chart$.getDynamicValue(thread)) " + ("psp_chart.phrase_structure_parser_chart_p(parsing_vars.$psp_chart$.getDynamicValue(thread)) " + "CommonSymbols.NIL != psp_chart.phrase_structure_parser_chart_p(parsing_vars.$psp_chart$.getDynamicValue(thread)) ") + parsing_vars.$psp_chart$.getDynamicValue(thread);
        final SubLObject found = psp_chart.psp_edge_set_lookup_node(edges, UNPROVIDED);
        if (NIL != parsing_utilities.syntactic_node_p(found, UNPROVIDED)) {
            return found;
        }
        final SubLObject pcase_var = set.set_size(edges);
        if (pcase_var.eql(ZERO_INTEGER)) {
            Errors.error($str3$Can_t_generate_a_node_from_no_edg);
            return NIL;
        }
        if (pcase_var.eql(ONE_INTEGER)) {
            return psp_create_node_for_edge(set_utilities.set_arbitrary_element(edges));
        }
        return psp_create_node_for_edges_int(edges);
    }

    /**
     *
     *
     * @param EDGES
     * 		set-p;
     * 		Generate a node representing a choice among EDGES.
     */
    @LispMethod(comment = "@param EDGES\r\n\t\tset-p;\r\n\t\tGenerate a node representing a choice among EDGES.")
    public static final SubLObject psp_create_node_for_edges_int_alt(SubLObject edges) {
        {
            SubLObject equivalence_sets = psp_equivalence_sets_for_edges(edges);
            SubLObject node = NIL;
            SubLObject pcase_var = set.set_size(equivalence_sets);
            if (pcase_var.eql(ZERO_INTEGER)) {
                Errors.error($str_alt5$Found_no_equivalence_sets_for__S_, edges);
            } else {
                if (pcase_var.eql(ONE_INTEGER)) {
                    node = psp_create_node_for_equivalence_set(set_utilities.set_arbitrary_element(equivalence_sets));
                } else {
                    node = psp_create_node_for_equivalence_sets(equivalence_sets);
                }
            }
            psp_chart.psp_edge_set_note_node(edges, node);
            return node;
        }
    }

    /**
     *
     *
     * @param EDGES
     * 		set-p;
     * 		Generate a node representing a choice among EDGES.
     */
    @LispMethod(comment = "@param EDGES\r\n\t\tset-p;\r\n\t\tGenerate a node representing a choice among EDGES.")
    public static SubLObject psp_create_node_for_edges_int(final SubLObject edges) {
        final SubLObject equivalence_sets = psp_equivalence_sets_for_edges(edges);
        SubLObject node = NIL;
        final SubLObject pcase_var = set.set_size(equivalence_sets);
        if (pcase_var.eql(ZERO_INTEGER)) {
            Errors.error($str4$Found_no_equivalence_sets_for__S_, edges);
        } else
            if (pcase_var.eql(ONE_INTEGER)) {
                node = psp_create_node_for_equivalence_set(set_utilities.set_arbitrary_element(equivalence_sets));
            } else {
                node = psp_create_node_for_equivalence_sets(equivalence_sets);
            }

        psp_chart.psp_edge_set_note_node(edges, node);
        return node;
    }

    public static final SubLObject psp_edge_equivalence_set_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        pprint_psp_equivalence_set(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject psp_edge_equivalence_set_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_psp_equivalence_set(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject psp_edge_equivalence_set_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.psp_parse_tree_generator.$psp_edge_equivalence_set_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject psp_edge_equivalence_set_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.psp_parse_tree_generator.$psp_edge_equivalence_set_native.class ? T : NIL;
    }

    public static final SubLObject psp_equivalence_set_choice_dtr_num_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PSP_EDGE_EQUIVALENCE_SET_P);
        return v_object.getField2();
    }

    public static SubLObject psp_equivalence_set_choice_dtr_num(final SubLObject v_object) {
        assert NIL != psp_edge_equivalence_set_p(v_object) : "! psp_parse_tree_generator.psp_edge_equivalence_set_p(v_object) " + "psp_parse_tree_generator.psp_edge_equivalence_set_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject psp_equivalence_set_edges_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PSP_EDGE_EQUIVALENCE_SET_P);
        return v_object.getField3();
    }

    public static SubLObject psp_equivalence_set_edges(final SubLObject v_object) {
        assert NIL != psp_edge_equivalence_set_p(v_object) : "! psp_parse_tree_generator.psp_edge_equivalence_set_p(v_object) " + "psp_parse_tree_generator.psp_edge_equivalence_set_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_psp_equivalence_set_choice_dtr_num_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PSP_EDGE_EQUIVALENCE_SET_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_psp_equivalence_set_choice_dtr_num(final SubLObject v_object, final SubLObject value) {
        assert NIL != psp_edge_equivalence_set_p(v_object) : "! psp_parse_tree_generator.psp_edge_equivalence_set_p(v_object) " + "psp_parse_tree_generator.psp_edge_equivalence_set_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_psp_equivalence_set_edges_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PSP_EDGE_EQUIVALENCE_SET_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_psp_equivalence_set_edges(final SubLObject v_object, final SubLObject value) {
        assert NIL != psp_edge_equivalence_set_p(v_object) : "! psp_parse_tree_generator.psp_edge_equivalence_set_p(v_object) " + "psp_parse_tree_generator.psp_edge_equivalence_set_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_psp_edge_equivalence_set_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.psp_parse_tree_generator.$psp_edge_equivalence_set_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($CHOICE_DTR_NUM)) {
                        _csetf_psp_equivalence_set_choice_dtr_num(v_new, current_value);
                    } else {
                        if (pcase_var.eql($EDGES)) {
                            _csetf_psp_equivalence_set_edges(v_new, current_value);
                        } else {
                            Errors.error($str_alt20$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_psp_edge_equivalence_set(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.psp_parse_tree_generator.$psp_edge_equivalence_set_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CHOICE_DTR_NUM)) {
                _csetf_psp_equivalence_set_choice_dtr_num(v_new, current_value);
            } else
                if (pcase_var.eql($EDGES)) {
                    _csetf_psp_equivalence_set_edges(v_new, current_value);
                } else {
                    Errors.error($str20$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_psp_edge_equivalence_set(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_PSP_EDGE_EQUIVALENCE_SET, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CHOICE_DTR_NUM, psp_equivalence_set_choice_dtr_num(obj));
        funcall(visitor_fn, obj, $SLOT, $EDGES, psp_equivalence_set_edges(obj));
        funcall(visitor_fn, obj, $END, MAKE_PSP_EDGE_EQUIVALENCE_SET, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_psp_edge_equivalence_set_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_psp_edge_equivalence_set(obj, visitor_fn);
    }

    public static final SubLObject pprint_psp_equivalence_set_alt(SubLObject equivalence_set, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        return format(stream, $str_alt21$_PSP_EQUIV_SET_of__S_edges_, set.set_size(psp_equivalence_set_edges(equivalence_set)));
    }

    public static SubLObject pprint_psp_equivalence_set(final SubLObject equivalence_set, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        return format(stream, $str26$_PSP_EQUIV_SET_of__S_edges_, set.set_size(psp_equivalence_set_edges(equivalence_set)));
    }

    public static final SubLObject new_psp_equivalence_set_alt() {
        return make_psp_edge_equivalence_set(list($CHOICE_DTR_NUM, NIL, $EDGES, set.new_set(UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject new_psp_equivalence_set() {
        return make_psp_edge_equivalence_set(list($CHOICE_DTR_NUM, NIL, $EDGES, set.new_set(UNPROVIDED, UNPROVIDED)));
    }

    public static final SubLObject psp_equivalence_set_add_edge_alt(SubLObject equivalence_set, SubLObject edge, SubLObject choice_dtr_num) {
        if (choice_dtr_num == UNPROVIDED) {
            choice_dtr_num = NIL;
        }
        if (NIL != subl_promotions.positive_integer_p(choice_dtr_num)) {
            {
                SubLObject existing = psp_equivalence_set_choice_dtr_num(equivalence_set);
                if (NIL == subl_promotions.positive_integer_p(existing)) {
                    _csetf_psp_equivalence_set_choice_dtr_num(equivalence_set, choice_dtr_num);
                } else {
                    if (!choice_dtr_num.eql(existing)) {
                        Errors.error($str_alt22$New_choice_dtr_num_of__S_doesn_t_, choice_dtr_num, equivalence_set);
                    }
                }
            }
        }
        return set.set_add(edge, psp_equivalence_set_edges(equivalence_set));
    }

    public static SubLObject psp_equivalence_set_add_edge(final SubLObject equivalence_set, final SubLObject edge, SubLObject choice_dtr_num) {
        if (choice_dtr_num == UNPROVIDED) {
            choice_dtr_num = NIL;
        }
        if (NIL != subl_promotions.positive_integer_p(choice_dtr_num)) {
            final SubLObject existing = psp_equivalence_set_choice_dtr_num(equivalence_set);
            if (NIL == subl_promotions.positive_integer_p(existing)) {
                _csetf_psp_equivalence_set_choice_dtr_num(equivalence_set, choice_dtr_num);
            } else
                if (!choice_dtr_num.eql(existing)) {
                    Errors.error($str27$New_choice_dtr_num_of__S_doesn_t_, choice_dtr_num, equivalence_set);
                }

        }
        return set.set_add(edge, psp_equivalence_set_edges(equivalence_set));
    }

    /**
     *
     *
     * @param EDGES
     * 		set-p.
     * 		Divide EDGES into one or more sets such that all edges in a set can be combined.
     */
    @LispMethod(comment = "@param EDGES\r\n\t\tset-p.\r\n\t\tDivide EDGES into one or more sets such that all edges in a set can be combined.")
    public static final SubLObject psp_equivalence_sets_for_edges_alt(SubLObject edges) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject equivalence_sets = set.new_set(UNPROVIDED, UNPROVIDED);
                SubLObject set_contents_var = set.do_set_internal(edges);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject edge = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, edge)) {
                            {
                                SubLObject foundP = NIL;
                                SubLObject set_contents_var_4 = set.do_set_internal(equivalence_sets);
                                SubLObject basis_object_5 = set_contents.do_set_contents_basis_object(set_contents_var_4);
                                SubLObject state_6 = NIL;
                                for (state_6 = set_contents.do_set_contents_initial_state(basis_object_5, set_contents_var_4); !((NIL != foundP) || (NIL != set_contents.do_set_contents_doneP(basis_object_5, state_6))); state_6 = set_contents.do_set_contents_update_state(state_6)) {
                                    {
                                        SubLObject equivalence_set = set_contents.do_set_contents_next(basis_object_5, state_6);
                                        if (NIL != set_contents.do_set_contents_element_validP(state_6, equivalence_set)) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject fitsP = psp_edge_fits_in_equivalence_setP(edge, equivalence_set);
                                                SubLObject choice_dtr_num = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != fitsP) {
                                                    foundP = T;
                                                    psp_equivalence_set_add_edge(equivalence_set, edge, choice_dtr_num);
                                                }
                                            }
                                        }
                                    }
                                }
                                if (NIL == foundP) {
                                    {
                                        SubLObject new_equivalence_set = new_psp_equivalence_set();
                                        psp_equivalence_set_add_edge(new_equivalence_set, edge, UNPROVIDED);
                                        set.set_add(new_equivalence_set, equivalence_sets);
                                    }
                                }
                            }
                        }
                    }
                }
                return equivalence_sets;
            }
        }
    }

    /**
     *
     *
     * @param EDGES
     * 		set-p.
     * 		Divide EDGES into one or more sets such that all edges in a set can be combined.
     */
    @LispMethod(comment = "@param EDGES\r\n\t\tset-p.\r\n\t\tDivide EDGES into one or more sets such that all edges in a set can be combined.")
    public static SubLObject psp_equivalence_sets_for_edges(final SubLObject edges) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject equivalence_sets = set.new_set(UNPROVIDED, UNPROVIDED);
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
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            edge = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, edge)) {
                foundP = NIL;
                set_contents_var_$4 = set.do_set_internal(equivalence_sets);
                for (basis_object_$5 = set_contents.do_set_contents_basis_object(set_contents_var_$4), state_$6 = NIL, state_$6 = set_contents.do_set_contents_initial_state(basis_object_$5, set_contents_var_$4); (NIL == foundP) && (NIL == set_contents.do_set_contents_doneP(basis_object_$5, state_$6)); state_$6 = set_contents.do_set_contents_update_state(state_$6)) {
                    equivalence_set = set_contents.do_set_contents_next(basis_object_$5, state_$6);
                    if (NIL != set_contents.do_set_contents_element_validP(state_$6, equivalence_set)) {
                        thread.resetMultipleValues();
                        fitsP = psp_edge_fits_in_equivalence_setP(edge, equivalence_set);
                        choice_dtr_num = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != fitsP) {
                            foundP = T;
                            psp_equivalence_set_add_edge(equivalence_set, edge, choice_dtr_num);
                        }
                    }
                }
                if (NIL == foundP) {
                    new_equivalence_set = new_psp_equivalence_set();
                    psp_equivalence_set_add_edge(new_equivalence_set, edge, UNPROVIDED);
                    set.set_add(new_equivalence_set, equivalence_sets);
                }
            }
        }
        return equivalence_sets;
    }

    public static final SubLObject psp_edge_fits_in_equivalence_setP_alt(SubLObject edge, SubLObject equivalence_set) {
        {
            SubLObject edges = psp_equivalence_set_edges(equivalence_set);
            SubLObject choice_dtr_num = psp_equivalence_set_choice_dtr_num(equivalence_set);
            SubLObject representative_edge = set_utilities.set_arbitrary_element(edges);
            return psp_edges_choice_node_equivalentP(edge, representative_edge, choice_dtr_num);
        }
    }

    public static SubLObject psp_edge_fits_in_equivalence_setP(final SubLObject edge, final SubLObject equivalence_set) {
        final SubLObject edges = psp_equivalence_set_edges(equivalence_set);
        final SubLObject choice_dtr_num = psp_equivalence_set_choice_dtr_num(equivalence_set);
        final SubLObject representative_edge = set_utilities.set_arbitrary_element(edges);
        return psp_edges_choice_node_equivalentP(edge, representative_edge, choice_dtr_num);
    }

    public static final SubLObject psp_edges_choice_node_equivalentP_alt(SubLObject edge1, SubLObject edge2, SubLObject choice_dtr_num) {
        {
            SubLObject equivalentP = NIL;
            if ((psp_chart.get_psp_edge_category(edge1).equal(psp_chart.get_psp_edge_category(edge2)) && psp_chart.get_psp_edge_rule(edge1).eql(psp_chart.get_psp_edge_rule(edge2))) && (NIL != list_utilities.same_length_p(psp_chart.get_psp_edge_non_head_dtrs(edge1), psp_chart.get_psp_edge_non_head_dtrs(edge2)))) {
                {
                    SubLObject mismatchP = NIL;
                    SubLObject list_var = NIL;
                    SubLObject dtr = NIL;
                    SubLObject i = NIL;
                    for (list_var = psp_chart.psp_edge_dtrs(edge1), dtr = list_var.first(), i = ZERO_INTEGER; !((NIL != mismatchP) || (NIL == list_var)); list_var = list_var.rest() , dtr = list_var.first() , i = add(ONE_INTEGER, i)) {
                        {
                            SubLObject dtr_num = number_utilities.f_1X(i);
                            if (dtr_num.eql(choice_dtr_num) || dtr.eql(psp_chart.psp_edge_nth_dtr(dtr_num, edge2))) {
                            } else {
                                if (NIL == choice_dtr_num) {
                                    choice_dtr_num = dtr_num;
                                } else {
                                    mismatchP = T;
                                }
                            }
                        }
                    }
                    equivalentP = makeBoolean(NIL == mismatchP);
                }
            }
            return values(equivalentP, choice_dtr_num);
        }
    }

    public static SubLObject psp_edges_choice_node_equivalentP(final SubLObject edge1, final SubLObject edge2, SubLObject choice_dtr_num) {
        SubLObject equivalentP = NIL;
        if ((psp_chart.get_psp_edge_category(edge1).equal(psp_chart.get_psp_edge_category(edge2)) && psp_chart.get_psp_edge_rule(edge1).eql(psp_chart.get_psp_edge_rule(edge2))) && (NIL != list_utilities.same_length_p(psp_chart.get_psp_edge_non_head_dtrs(edge1), psp_chart.get_psp_edge_non_head_dtrs(edge2)))) {
            SubLObject mismatchP = NIL;
            SubLObject list_var = NIL;
            SubLObject dtr = NIL;
            SubLObject i = NIL;
            list_var = psp_chart.psp_edge_dtrs(edge1);
            dtr = list_var.first();
            for (i = ZERO_INTEGER; (NIL == mismatchP) && (NIL != list_var); list_var = list_var.rest() , dtr = list_var.first() , i = add(ONE_INTEGER, i)) {
                final SubLObject dtr_num = number_utilities.f_1X(i);
                if (!dtr_num.eql(choice_dtr_num)) {
                    if (!dtr.eql(psp_chart.psp_edge_nth_dtr(dtr_num, edge2))) {
                        if (NIL == choice_dtr_num) {
                            choice_dtr_num = dtr_num;
                        } else {
                            mismatchP = T;
                        }
                    }
                }
            }
            equivalentP = makeBoolean(NIL == mismatchP);
        }
        return values(equivalentP, choice_dtr_num);
    }

    public static final SubLObject psp_create_node_for_equivalence_sets_alt(SubLObject equivalence_sets) {
        {
            SubLObject choice_node = psp_generate_choice_node();
            SubLObject set_contents_var = set.do_set_internal(equivalence_sets);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject equivalence_set = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, equivalence_set)) {
                        {
                            SubLObject option_node = psp_find_or_create_node_for_equivalence_set(equivalence_set);
                            psp_choice_node_add_option_node(choice_node, option_node);
                        }
                    }
                }
            }
            return choice_node;
        }
    }

    public static SubLObject psp_create_node_for_equivalence_sets(final SubLObject equivalence_sets) {
        final SubLObject choice_node = psp_generate_choice_node();
        final SubLObject set_contents_var = set.do_set_internal(equivalence_sets);
        SubLObject basis_object;
        SubLObject state;
        SubLObject equivalence_set;
        SubLObject option_node;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            equivalence_set = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, equivalence_set)) {
                option_node = psp_find_or_create_node_for_equivalence_set(equivalence_set);
                psp_choice_node_add_option_node(choice_node, option_node);
            }
        }
        return choice_node;
    }

    public static final SubLObject psp_find_or_create_node_for_equivalence_set_alt(SubLObject equivalence_set) {
        {
            SubLObject edges = psp_equivalence_set_edges(equivalence_set);
            SubLObject found = psp_chart.psp_edge_set_lookup_node(edges, UNPROVIDED);
            if (NIL != parsing_utilities.syntactic_node_p(found, UNPROVIDED)) {
                return found;
            } else {
                return psp_create_node_for_equivalence_set(equivalence_set);
            }
        }
    }

    public static SubLObject psp_find_or_create_node_for_equivalence_set(final SubLObject equivalence_set) {
        final SubLObject edges = psp_equivalence_set_edges(equivalence_set);
        final SubLObject found = psp_chart.psp_edge_set_lookup_node(edges, UNPROVIDED);
        if (NIL != parsing_utilities.syntactic_node_p(found, UNPROVIDED)) {
            return found;
        }
        return psp_create_node_for_equivalence_set(equivalence_set);
    }

    public static final SubLObject psp_create_node_for_equivalence_set_alt(SubLObject equivalence_set) {
        {
            SubLObject edges = psp_equivalence_set_edges(equivalence_set);
            SubLObject representative_edge = set_utilities.set_arbitrary_element(edges);
            if (ONE_INTEGER.eql(set.set_size(edges))) {
                return psp_find_or_create_node_for_edge(representative_edge);
            } else {
                {
                    SubLObject choice_node = psp_create_node_shell_for_edge(representative_edge);
                    SubLObject choice_dtr_num = psp_equivalence_set_choice_dtr_num(equivalence_set);
                    SubLObject list_var = NIL;
                    SubLObject dtr = NIL;
                    SubLObject i = NIL;
                    for (list_var = psp_chart.psp_edge_dtrs(representative_edge), dtr = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , dtr = list_var.first() , i = add(ONE_INTEGER, i)) {
                        {
                            SubLObject dtr_num = number_utilities.f_1X(i);
                            SubLObject dtr_node = NIL;
                            if (dtr_num == choice_dtr_num) {
                                {
                                    SubLObject option_nodes = set.new_set(UNPROVIDED, UNPROVIDED);
                                    SubLObject set_contents_var = set.do_set_internal(edges);
                                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                    SubLObject state = NIL;
                                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                        {
                                            SubLObject edge = set_contents.do_set_contents_next(basis_object, state);
                                            if (NIL != set_contents.do_set_contents_element_validP(state, edge)) {
                                                set.set_add(psp_chart.psp_edge_nth_dtr(dtr_num, edge), option_nodes);
                                            }
                                        }
                                    }
                                    dtr_node = psp_find_or_create_node_for_edges(option_nodes);
                                }
                            } else {
                                dtr_node = psp_find_or_create_node_for_edge(dtr);
                            }
                            psp_node_add_dtr(choice_node, dtr_node, dtr_num);
                        }
                    }
                    psp_chart.psp_edge_set_note_node(edges, choice_node);
                    return choice_node;
                }
            }
        }
    }

    public static SubLObject psp_create_node_for_equivalence_set(final SubLObject equivalence_set) {
        final SubLObject edges = psp_equivalence_set_edges(equivalence_set);
        final SubLObject representative_edge = set_utilities.set_arbitrary_element(edges);
        if (ONE_INTEGER.eql(set.set_size(edges))) {
            return psp_find_or_create_node_for_edge(representative_edge);
        }
        final SubLObject choice_node = psp_create_node_shell_for_edge(representative_edge);
        final SubLObject choice_dtr_num = psp_equivalence_set_choice_dtr_num(equivalence_set);
        SubLObject list_var = NIL;
        SubLObject dtr = NIL;
        SubLObject i = NIL;
        list_var = psp_chart.psp_edge_dtrs(representative_edge);
        dtr = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , dtr = list_var.first() , i = add(ONE_INTEGER, i)) {
            final SubLObject dtr_num = number_utilities.f_1X(i);
            SubLObject dtr_node = NIL;
            if (dtr_num.eql(choice_dtr_num)) {
                final SubLObject option_nodes = set.new_set(UNPROVIDED, UNPROVIDED);
                final SubLObject set_contents_var = set.do_set_internal(edges);
                SubLObject basis_object;
                SubLObject state;
                SubLObject edge;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    edge = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, edge)) {
                        set.set_add(psp_chart.psp_edge_nth_dtr(dtr_num, edge), option_nodes);
                    }
                }
                dtr_node = psp_find_or_create_node_for_edges(option_nodes);
            } else {
                dtr_node = psp_find_or_create_node_for_edge(dtr);
            }
            psp_node_add_dtr(choice_node, dtr_node, dtr_num);
        }
        psp_chart.psp_edge_set_note_node(edges, choice_node);
        return choice_node;
    }

    public static final SubLObject psp_find_or_create_node_for_edge_alt(SubLObject edge) {
        {
            SubLObject found = psp_chart.psp_edge_lookup_node(edge, UNPROVIDED);
            if (NIL != parsing_utilities.syntactic_node_p(found, UNPROVIDED)) {
                return found;
            } else {
                return psp_create_node_for_edge(edge);
            }
        }
    }

    public static SubLObject psp_find_or_create_node_for_edge(final SubLObject edge) {
        final SubLObject found = psp_chart.psp_edge_lookup_node(edge, UNPROVIDED);
        if (NIL != parsing_utilities.syntactic_node_p(found, UNPROVIDED)) {
            return found;
        }
        return psp_create_node_for_edge(edge);
    }

    public static final SubLObject psp_create_node_for_edge_alt(SubLObject edge) {
        {
            SubLObject node = psp_create_node_shell_for_edge(edge);
            SubLObject list_var = NIL;
            SubLObject dtr = NIL;
            SubLObject i = NIL;
            for (list_var = psp_chart.psp_edge_dtrs(edge), dtr = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , dtr = list_var.first() , i = add(ONE_INTEGER, i)) {
                {
                    SubLObject dtr_num = number_utilities.f_1X(i);
                    psp_node_add_dtr(node, psp_find_or_create_node_for_edge(dtr), dtr_num);
                }
            }
            psp_chart.psp_edge_note_node(edge, node);
            return node;
        }
    }

    public static SubLObject psp_create_node_for_edge(final SubLObject edge) {
        final SubLObject node = psp_create_node_shell_for_edge(edge);
        SubLObject list_var = NIL;
        SubLObject dtr = NIL;
        SubLObject i = NIL;
        list_var = psp_chart.psp_edge_dtrs(edge);
        dtr = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , dtr = list_var.first() , i = add(ONE_INTEGER, i)) {
            final SubLObject dtr_num = number_utilities.f_1X(i);
            psp_node_add_dtr(node, psp_find_or_create_node_for_edge(dtr), dtr_num);
        }
        psp_chart.psp_edge_note_node(edge, node);
        return node;
    }

    public static final SubLObject psp_create_node_shell_for_edge_alt(SubLObject edge) {
        {
            SubLObject lexicalP = zerop(psp_chart.psp_edge_dtr_count(edge));
            SubLObject node = psp_create_node(psp_chart.get_psp_edge_category(edge), psp_chart.psp_edge_rule_fort(edge), psp_chart.get_psp_edge_span(edge), lexicalP, psp_chart.get_psp_edge_string(edge));
            return node;
        }
    }

    public static SubLObject psp_create_node_shell_for_edge(final SubLObject edge) {
        final SubLObject lexicalP = zerop(psp_chart.psp_edge_dtr_count(edge));
        final SubLObject node = psp_create_node(psp_chart.get_psp_edge_category(edge), psp_chart.psp_edge_rule_fort(edge), psp_chart.get_psp_edge_span(edge), lexicalP, psp_chart.get_psp_edge_string(edge));
        return node;
    }

    public static final SubLObject psp_edge_note_meaning_on_node_if_known_alt(SubLObject edge, SubLObject meaning, SubLObject pred) {
        if (pred == UNPROVIDED) {
            pred = $$proposedMeaning;
        }
        {
            SubLObject node = psp_chart.psp_edge_lookup_node(edge, UNPROVIDED);
            if (NIL != parsing_utilities.syntactic_node_p(node, UNPROVIDED)) {
                psp_node_propose_meaning(node, meaning, pred);
            }
        }
        return edge;
    }

    public static SubLObject psp_edge_note_meaning_on_node_if_known(final SubLObject edge, final SubLObject meaning, SubLObject pred) {
        if (pred == UNPROVIDED) {
            pred = $$proposedMeaning;
        }
        final SubLObject node = psp_chart.psp_edge_lookup_node(edge, UNPROVIDED);
        if (NIL != parsing_utilities.syntactic_node_p(node, UNPROVIDED)) {
            psp_node_propose_meaning(node, meaning, pred);
        }
        return edge;
    }

    /**
     * Note that FOCAL-EDGE can mean FOCAL-EDGE-SEMX only if OTHER-EDGE means OTHER-EDGE-SEMX.
     */
    @LispMethod(comment = "Note that FOCAL-EDGE can mean FOCAL-EDGE-SEMX only if OTHER-EDGE means OTHER-EDGE-SEMX.")
    public static final SubLObject psp_note_semantic_dependency_alt(SubLObject focal_edge, SubLObject focal_edge_semx, SubLObject other_edge, SubLObject other_edge_semx) {
        {
            SubLObject focal_edge_node = psp_chart.psp_edge_lookup_node(focal_edge, UNPROVIDED);
            SubLObject other_edge_node = psp_chart.psp_edge_lookup_node(other_edge, UNPROVIDED);
            if ((NIL != parsing_utilities.syntactic_node_p(focal_edge_node, UNPROVIDED)) && (NIL != parsing_utilities.syntactic_node_p(other_edge_node, UNPROVIDED))) {
                psp_node_note_semantic_dependency(focal_edge_node, focal_edge_semx, other_edge_node, other_edge_semx);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Note that FOCAL-EDGE can mean FOCAL-EDGE-SEMX only if OTHER-EDGE means OTHER-EDGE-SEMX.")
    public static SubLObject psp_note_semantic_dependency(final SubLObject focal_edge, final SubLObject focal_edge_semx, final SubLObject other_edge, final SubLObject other_edge_semx) {
        final SubLObject focal_edge_node = psp_chart.psp_edge_lookup_node(focal_edge, UNPROVIDED);
        final SubLObject other_edge_node = psp_chart.psp_edge_lookup_node(other_edge, UNPROVIDED);
        if ((NIL != parsing_utilities.syntactic_node_p(focal_edge_node, UNPROVIDED)) && (NIL != parsing_utilities.syntactic_node_p(other_edge_node, UNPROVIDED))) {
            psp_node_note_semantic_dependency(focal_edge_node, focal_edge_semx, other_edge_node, other_edge_semx);
        }
        return NIL;
    }

    public static final SubLObject with_psp_parse_tree_assert_parameters_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return list(CLET, $list_alt25, list(WITH_PARSE_TREE_MT, $list_alt27, listS(WITH_PARSE_TREE_PREFIX, $$$PSP, append(body, NIL))));
        }
    }

    public static SubLObject with_psp_parse_tree_assert_parameters(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, $list30, list(WITH_PARSE_TREE_MT, $list32, listS(WITH_PARSE_TREE_PREFIX, $$$PSP, append(body, NIL))));
    }

    public static final SubLObject psp_create_parse_tree_with_root_node_alt(SubLObject root_node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tree = NIL;
                {
                    SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_1 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
                    try {
                        api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
                        parsing_vars.$parse_tree_mt$.bind(psp_chart_parse_tree_mt(UNPROVIDED), thread);
                        parsing_vars.$parse_tree_prefix$.bind($$$PSP, thread);
                        tree = parsing_utilities.create_parse_tree_with_root_node(root_node, UNPROVIDED, UNPROVIDED);
                    } finally {
                        parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_2, thread);
                        parsing_vars.$parse_tree_mt$.rebind(_prev_bind_1, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                    }
                }
                return tree;
            }
        }
    }

    public static SubLObject psp_create_parse_tree_with_root_node(final SubLObject root_node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tree = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
            parsing_vars.$parse_tree_mt$.bind(psp_chart_parse_tree_mt(UNPROVIDED), thread);
            parsing_vars.$parse_tree_prefix$.bind($$$PSP, thread);
            tree = parsing_utilities.create_parse_tree_with_root_node(root_node, UNPROVIDED, UNPROVIDED);
        } finally {
            parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_3, thread);
            parsing_vars.$parse_tree_mt$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return tree;
    }

    /**
     *
     *
     * @return NART-P; denoting the PSP that is part of the current #$Cyc.
     */
    @LispMethod(comment = "@return NART-P; denoting the PSP that is part of the current #$Cyc.")
    public static final SubLObject psp_agent_alt() {
        {
            SubLObject constant = constants_high.find_constant($$$TheCycPhraseStructureParser);
            return NIL != constant ? ((SubLObject) (constant)) : czer_main.cyc_find_or_create_nart($list_alt31, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return NART-P; denoting the PSP that is part of the current #$Cyc.
     */
    @LispMethod(comment = "@return NART-P; denoting the PSP that is part of the current #$Cyc.")
    public static SubLObject psp_agent() {
        final SubLObject constant = constants_high.find_constant($$$TheCycPhraseStructureParser);
        return NIL != constant ? constant : czer_main.cyc_find_or_create_nart($list36, UNPROVIDED);
    }

    /**
     * Hypothesize and return a new instance of COL.
     */
    @LispMethod(comment = "Hypothesize and return a new instance of COL.")
    public static final SubLObject psp_create_instance_alt(SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject instance = NIL;
                {
                    SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_1 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
                    try {
                        api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
                        parsing_vars.$parse_tree_mt$.bind(psp_chart_parse_tree_mt(UNPROVIDED), thread);
                        parsing_vars.$parse_tree_prefix$.bind($$$PSP, thread);
                        instance = parsing_utilities.create_parse_tree_element(col, UNPROVIDED, UNPROVIDED);
                    } finally {
                        parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_2, thread);
                        parsing_vars.$parse_tree_mt$.rebind(_prev_bind_1, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                    }
                }
                return instance;
            }
        }
    }

    /**
     * Hypothesize and return a new instance of COL.
     */
    @LispMethod(comment = "Hypothesize and return a new instance of COL.")
    public static SubLObject psp_create_instance(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject instance = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
            parsing_vars.$parse_tree_mt$.bind(psp_chart_parse_tree_mt(UNPROVIDED), thread);
            parsing_vars.$parse_tree_prefix$.bind($$$PSP, thread);
            instance = parsing_utilities.create_parse_tree_element(col, UNPROVIDED, UNPROVIDED);
        } finally {
            parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_3, thread);
            parsing_vars.$parse_tree_mt$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return instance;
    }

    /**
     *
     *
     * @return SYNTACTIC-NODE-P; #$SyntacticNode.
     */
    @LispMethod(comment = "@return SYNTACTIC-NODE-P; #$SyntacticNode.")
    public static final SubLObject psp_create_node_alt(SubLObject category, SubLObject rule, SubLObject local_span, SubLObject lexical_nodeP, SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tokenization = psp_chart_tokenization(UNPROVIDED);
                SubLObject span_wrt_tokenization = psp_span_wrt_tokenization(local_span, tokenization);
                SubLObject creator = psp_agent();
                SubLObject node = NIL;
                {
                    SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_1 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
                    try {
                        api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
                        parsing_vars.$parse_tree_mt$.bind(psp_chart_parse_tree_mt(UNPROVIDED), thread);
                        parsing_vars.$parse_tree_prefix$.bind($$$PSP, thread);
                        node = parsing_utilities.create_syntactic_node(tokenization, creator, category, span_wrt_tokenization, lexical_nodeP, string, rule, UNPROVIDED, UNPROVIDED);
                    } finally {
                        parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_2, thread);
                        parsing_vars.$parse_tree_mt$.rebind(_prev_bind_1, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                    }
                }
                return node;
            }
        }
    }

    /**
     *
     *
     * @return SYNTACTIC-NODE-P; #$SyntacticNode.
     */
    @LispMethod(comment = "@return SYNTACTIC-NODE-P; #$SyntacticNode.")
    public static SubLObject psp_create_node(final SubLObject category, final SubLObject rule, final SubLObject local_span, final SubLObject lexical_nodeP, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tokenization = psp_chart_tokenization(UNPROVIDED);
        final SubLObject span_wrt_tokenization = psp_span_wrt_tokenization(local_span, tokenization);
        final SubLObject creator = psp_agent();
        SubLObject node = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
            parsing_vars.$parse_tree_mt$.bind(psp_chart_parse_tree_mt(UNPROVIDED), thread);
            parsing_vars.$parse_tree_prefix$.bind($$$PSP, thread);
            node = parsing_utilities.create_syntactic_node(tokenization, creator, category, span_wrt_tokenization, lexical_nodeP, string, rule, UNPROVIDED, UNPROVIDED);
        } finally {
            parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_3, thread);
            parsing_vars.$parse_tree_mt$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return node;
    }

    /**
     *
     *
     * @return INTERVAL-SPAN-P; LOCAL-SPAN adjusted for the current offset.
     */
    @LispMethod(comment = "@return INTERVAL-SPAN-P; LOCAL-SPAN adjusted for the current offset.")
    public static final SubLObject psp_span_wrt_tokenization_alt(SubLObject local_span, SubLObject tokenization) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject local_start = interval_span.interval_span_start(local_span);
                SubLObject local_end = interval_span.interval_span_end(local_span);
                SubLObject offset = parsing_vars.$parse_tokenization_offset$.getDynamicValue(thread);
                return interval_span.get_interval_span(add(local_start, offset), add(local_end, offset));
            }
        }
    }

    /**
     *
     *
     * @return INTERVAL-SPAN-P; LOCAL-SPAN adjusted for the current offset.
     */
    @LispMethod(comment = "@return INTERVAL-SPAN-P; LOCAL-SPAN adjusted for the current offset.")
    public static SubLObject psp_span_wrt_tokenization(final SubLObject local_span, final SubLObject tokenization) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_start = interval_span.interval_span_start(local_span);
        final SubLObject local_end = interval_span.interval_span_end(local_span);
        final SubLObject offset = parsing_vars.$parse_tokenization_offset$.getDynamicValue(thread);
        return interval_span.get_interval_span(add(local_start, offset), add(local_end, offset));
    }

    /**
     * Add DTR-NODE as the DTR-NUMth daughter of NODE.
     */
    @LispMethod(comment = "Add DTR-NODE as the DTR-NUMth daughter of NODE.")
    public static final SubLObject psp_node_add_dtr_alt(SubLObject node, SubLObject dtr_node, SubLObject dtr_num) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject existing = ask_utilities.ask_variable($sym32$_DTR_NODE, listS($$syntacticNodeNthDaughter, node, dtr_num, $list_alt34), psp_chart_parse_tree_mt(UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject otherP = NIL;
                if (NIL == otherP) {
                    {
                        SubLObject csome_list_var = existing;
                        SubLObject existing_dtr = NIL;
                        for (existing_dtr = csome_list_var.first(); !((NIL != otherP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , existing_dtr = csome_list_var.first()) {
                            if (existing_dtr != dtr_node) {
                                Errors.sublisp_break($str_alt35$__Trying_to_add__S_to____S___as_d, new SubLObject[]{ dtr_node, existing, dtr_num, node });
                            }
                        }
                    }
                }
                if (NIL == existing) {
                    {
                        SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                        SubLObject _prev_bind_1 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
                        SubLObject _prev_bind_2 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
                        try {
                            api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
                            parsing_vars.$parse_tree_mt$.bind(psp_chart_parse_tree_mt(UNPROVIDED), thread);
                            parsing_vars.$parse_tree_prefix$.bind($$$PSP, thread);
                            parsing_utilities.syntactic_node_add_dtr(node, dtr_node, dtr_num, UNPROVIDED);
                        } finally {
                            parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_2, thread);
                            parsing_vars.$parse_tree_mt$.rebind(_prev_bind_1, thread);
                            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return node;
        }
    }

    /**
     * Add DTR-NODE as the DTR-NUMth daughter of NODE.
     */
    @LispMethod(comment = "Add DTR-NODE as the DTR-NUMth daughter of NODE.")
    public static SubLObject psp_node_add_dtr(final SubLObject node, final SubLObject dtr_node, final SubLObject dtr_num) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject existing = ask_utilities.ask_variable($sym37$_DTR_NODE, listS($$syntacticNodeNthDaughter, node, dtr_num, $list39), psp_chart_parse_tree_mt(UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject otherP = NIL;
        if (NIL == otherP) {
            SubLObject csome_list_var = existing;
            SubLObject existing_dtr = NIL;
            existing_dtr = csome_list_var.first();
            while ((NIL == otherP) && (NIL != csome_list_var)) {
                if (!existing_dtr.eql(dtr_node)) {
                    Errors.sublisp_break($str40$__Trying_to_add__S_to____S___as_d, new SubLObject[]{ dtr_node, existing, dtr_num, node });
                }
                csome_list_var = csome_list_var.rest();
                existing_dtr = csome_list_var.first();
            } 
        }
        if (NIL == existing) {
            final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
            final SubLObject _prev_bind_2 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
            final SubLObject _prev_bind_3 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
            try {
                api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
                parsing_vars.$parse_tree_mt$.bind(psp_chart_parse_tree_mt(UNPROVIDED), thread);
                parsing_vars.$parse_tree_prefix$.bind($$$PSP, thread);
                parsing_utilities.syntactic_node_add_dtr(node, dtr_node, dtr_num, UNPROVIDED);
            } finally {
                parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_3, thread);
                parsing_vars.$parse_tree_mt$.rebind(_prev_bind_2, thread);
                api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
            }
        }
        return node;
    }

    public static final SubLObject psp_node_propose_meaning_alt(SubLObject node, SubLObject meaning, SubLObject pred) {
        if (pred == UNPROVIDED) {
            pred = $$proposedMeaning;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                SubLObject _prev_bind_1 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
                SubLObject _prev_bind_2 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
                try {
                    api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
                    parsing_vars.$parse_tree_mt$.bind(psp_chart_parse_tree_mt(UNPROVIDED), thread);
                    parsing_vars.$parse_tree_prefix$.bind($$$PSP, thread);
                    parsing_utilities.syntactic_node_propose_meaning(node, meaning, pred, UNPROVIDED);
                } finally {
                    parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_2, thread);
                    parsing_vars.$parse_tree_mt$.rebind(_prev_bind_1, thread);
                    api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                }
            }
            return node;
        }
    }

    public static SubLObject psp_node_propose_meaning(final SubLObject node, final SubLObject meaning, SubLObject pred) {
        if (pred == UNPROVIDED) {
            pred = $$proposedMeaning;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
            parsing_vars.$parse_tree_mt$.bind(psp_chart_parse_tree_mt(UNPROVIDED), thread);
            parsing_vars.$parse_tree_prefix$.bind($$$PSP, thread);
            parsing_utilities.syntactic_node_propose_meaning(node, meaning, pred, UNPROVIDED);
        } finally {
            parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_3, thread);
            parsing_vars.$parse_tree_mt$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return node;
    }

    public static final SubLObject psp_node_note_semantic_dependency_alt(SubLObject mother, SubLObject mother_meaning, SubLObject dtr, SubLObject dtr_meaning) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                SubLObject _prev_bind_1 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
                SubLObject _prev_bind_2 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
                try {
                    api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
                    parsing_vars.$parse_tree_mt$.bind(psp_chart_parse_tree_mt(UNPROVIDED), thread);
                    parsing_vars.$parse_tree_prefix$.bind($$$PSP, thread);
                    parsing_utilities.syntactic_node_note_semantic_dependency(mother, psp_semantics.psp_cycl_cycl(mother_meaning), dtr, psp_semantics.psp_cycl_cycl(dtr_meaning), UNPROVIDED);
                } finally {
                    parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_2, thread);
                    parsing_vars.$parse_tree_mt$.rebind(_prev_bind_1, thread);
                    api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                }
            }
            return mother;
        }
    }

    public static SubLObject psp_node_note_semantic_dependency(final SubLObject mother, final SubLObject mother_meaning, final SubLObject dtr, final SubLObject dtr_meaning) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
            parsing_vars.$parse_tree_mt$.bind(psp_chart_parse_tree_mt(UNPROVIDED), thread);
            parsing_vars.$parse_tree_prefix$.bind($$$PSP, thread);
            parsing_utilities.syntactic_node_note_semantic_dependency(mother, psp_semantics.psp_cycl_cycl(mother_meaning), dtr, psp_semantics.psp_cycl_cycl(dtr_meaning), UNPROVIDED);
        } finally {
            parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_3, thread);
            parsing_vars.$parse_tree_mt$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return mother;
    }

    /**
     * Generate and return a new #$SyntacticChoiceNode
     */
    @LispMethod(comment = "Generate and return a new #$SyntacticChoiceNode")
    public static final SubLObject psp_generate_choice_node_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject creator = psp_agent();
                SubLObject node = NIL;
                {
                    SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                    SubLObject _prev_bind_1 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
                    SubLObject _prev_bind_2 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
                    try {
                        api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
                        parsing_vars.$parse_tree_mt$.bind(psp_chart_parse_tree_mt(UNPROVIDED), thread);
                        parsing_vars.$parse_tree_prefix$.bind($$$PSP, thread);
                        node = parsing_utilities.generate_choice_node(creator, UNPROVIDED, UNPROVIDED);
                    } finally {
                        parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_2, thread);
                        parsing_vars.$parse_tree_mt$.rebind(_prev_bind_1, thread);
                        api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                    }
                }
                return node;
            }
        }
    }

    @LispMethod(comment = "Generate and return a new #$SyntacticChoiceNode")
    public static SubLObject psp_generate_choice_node() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject creator = psp_agent();
        SubLObject node = NIL;
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
            parsing_vars.$parse_tree_mt$.bind(psp_chart_parse_tree_mt(UNPROVIDED), thread);
            parsing_vars.$parse_tree_prefix$.bind($$$PSP, thread);
            node = parsing_utilities.generate_choice_node(creator, UNPROVIDED, UNPROVIDED);
        } finally {
            parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_3, thread);
            parsing_vars.$parse_tree_mt$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return node;
    }/**
     * Generate and return a new #$SyntacticChoiceNode
     */


    /**
     * Add OPTION-NODE as a new option node for CHOICE-NODE.
     */
    @LispMethod(comment = "Add OPTION-NODE as a new option node for CHOICE-NODE.")
    public static final SubLObject psp_choice_node_add_option_node_alt(SubLObject choice_node, SubLObject option_node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                SubLObject _prev_bind_1 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
                SubLObject _prev_bind_2 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
                try {
                    api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
                    parsing_vars.$parse_tree_mt$.bind(psp_chart_parse_tree_mt(UNPROVIDED), thread);
                    parsing_vars.$parse_tree_prefix$.bind($$$PSP, thread);
                    parsing_utilities.choice_node_add_option_node(choice_node, option_node, UNPROVIDED);
                } finally {
                    parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_2, thread);
                    parsing_vars.$parse_tree_mt$.rebind(_prev_bind_1, thread);
                    api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                }
            }
            return choice_node;
        }
    }

    @LispMethod(comment = "Add OPTION-NODE as a new option node for CHOICE-NODE.")
    public static SubLObject psp_choice_node_add_option_node(final SubLObject choice_node, final SubLObject option_node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$parse_tree_mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = parsing_vars.$parse_tree_prefix$.currentBinding(thread);
        try {
            api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
            parsing_vars.$parse_tree_mt$.bind(psp_chart_parse_tree_mt(UNPROVIDED), thread);
            parsing_vars.$parse_tree_prefix$.bind($$$PSP, thread);
            parsing_utilities.choice_node_add_option_node(choice_node, option_node, UNPROVIDED);
        } finally {
            parsing_vars.$parse_tree_prefix$.rebind(_prev_bind_3, thread);
            parsing_vars.$parse_tree_mt$.rebind(_prev_bind_2, thread);
            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
        }
        return choice_node;
    }/**
     * Add OPTION-NODE as a new option node for CHOICE-NODE.
     */


    /**
     *
     *
     * @return FORT-P; Instance of #$CycTokenization that CHART is a parse for.
     * @unknown 
     */
    @LispMethod(comment = "@return FORT-P; Instance of #$CycTokenization that CHART is a parse for.\r\n@unknown")
    public static final SubLObject psp_chart_tokenization_alt(SubLObject chart) {
        if (chart == UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != forts.fort_p(parsing_vars.$parse_tokenization$.getDynamicValue(thread))) {
                return parsing_vars.$parse_tokenization$.getDynamicValue(thread);
            }
            {
                SubLObject tokenization = dictionary.dictionary_lookup($psp_chart_tokenizations$.getGlobalValue(), chart, UNPROVIDED);
                if (NIL == forts.fort_p(tokenization)) {
                    tokenization = psp_create_instance($$CycTokenization);
                    dictionary.dictionary_enter($psp_chart_tokenizations$.getGlobalValue(), chart, tokenization);
                }
                return tokenization;
            }
        }
    }

    /**
     *
     *
     * @return FORT-P; Instance of #$CycTokenization that CHART is a parse for.
     * @unknown 
     */
    @LispMethod(comment = "@return FORT-P; Instance of #$CycTokenization that CHART is a parse for.\r\n@unknown")
    public static SubLObject psp_chart_tokenization(SubLObject chart) {
        if (chart == UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forts.fort_p(parsing_vars.$parse_tokenization$.getDynamicValue(thread))) {
            return parsing_vars.$parse_tokenization$.getDynamicValue(thread);
        }
        SubLObject tokenization = dictionary.dictionary_lookup($psp_chart_tokenizations$.getGlobalValue(), chart, UNPROVIDED);
        if (NIL == forts.fort_p(tokenization)) {
            tokenization = psp_create_instance($$CycTokenization);
            dictionary.dictionary_enter($psp_chart_tokenizations$.getGlobalValue(), chart, tokenization);
        }
        return tokenization;
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static final SubLObject psp_chart_parse_tree_mt_alt(SubLObject chart) {
        if (chart == UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != hlmt.hlmt_p(parsing_vars.$parse_tree_mt$.getDynamicValue(thread))) {
                return parsing_vars.$parse_tree_mt$.getDynamicValue(thread);
            }
            {
                SubLObject name = $$$ParseTreeSandboxMt;
                SubLObject mt = constants_high.find_constant(name);
                if (NIL == valid_constantP(mt, UNPROVIDED)) {
                    {
                        SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
                        try {
                            api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
                            ke.ke_create_now(name, UNPROVIDED);
                            mt = constants_high.find_constant(name);
                            ke.ke_assert_now(listS($$isa, mt, $list_alt40), $$BaseKB, UNPROVIDED, UNPROVIDED);
                            ke.ke_assert_now(listS($$genlMt, mt, $list_alt43), $$BaseKB, UNPROVIDED, UNPROVIDED);
                            ke.ke_assert_now(listS($$genlMt, mt, $list_alt44), $$BaseKB, UNPROVIDED, UNPROVIDED);
                        } finally {
                            api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return mt;
            }
        }
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static SubLObject psp_chart_parse_tree_mt(SubLObject chart) {
        if (chart == UNPROVIDED) {
            chart = parsing_vars.$psp_chart$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != hlmt.hlmt_p(parsing_vars.$parse_tree_mt$.getDynamicValue(thread))) {
            return parsing_vars.$parse_tree_mt$.getDynamicValue(thread);
        }
        final SubLObject name = $$$ParseTreeSandboxMt;
        SubLObject mt = constants_high.find_constant(name);
        if (NIL == valid_constantP(mt, UNPROVIDED)) {
            final SubLObject _prev_bind_0 = api_control_vars.$the_cyclist$.currentBinding(thread);
            try {
                api_control_vars.$the_cyclist$.bind(psp_agent(), thread);
                ke.ke_create_now(name, UNPROVIDED);
                mt = constants_high.find_constant(name);
                ke.ke_assert_now(listS($$isa, mt, $list45), $$BaseKB, UNPROVIDED, UNPROVIDED);
                ke.ke_assert_now(listS($$genlMt, mt, $list48), $$BaseKB, UNPROVIDED, UNPROVIDED);
                ke.ke_assert_now(listS($$genlMt, mt, $list49), $$BaseKB, UNPROVIDED, UNPROVIDED);
            } finally {
                api_control_vars.$the_cyclist$.rebind(_prev_bind_0, thread);
            }
        }
        return mt;
    }

    public static SubLObject declare_psp_parse_tree_generator_file() {
        declareFunction("psp_generate_parse_tree_for_string", "PSP-GENERATE-PARSE-TREE-FOR-STRING", 1, 1, false);
        declareFunction("psp_generate_parse_tree_for_chart", "PSP-GENERATE-PARSE-TREE-FOR-CHART", 1, 1, false);
        declareFunction("psp_find_or_create_node_for_edges", "PSP-FIND-OR-CREATE-NODE-FOR-EDGES", 1, 0, false);
        declareFunction("psp_create_node_for_edges_int", "PSP-CREATE-NODE-FOR-EDGES-INT", 1, 0, false);
        declareFunction("psp_edge_equivalence_set_print_function_trampoline", "PSP-EDGE-EQUIVALENCE-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("psp_edge_equivalence_set_p", "PSP-EDGE-EQUIVALENCE-SET-P", 1, 0, false);
        new psp_parse_tree_generator.$psp_edge_equivalence_set_p$UnaryFunction();
        declareFunction("psp_equivalence_set_choice_dtr_num", "PSP-EQUIVALENCE-SET-CHOICE-DTR-NUM", 1, 0, false);
        declareFunction("psp_equivalence_set_edges", "PSP-EQUIVALENCE-SET-EDGES", 1, 0, false);
        declareFunction("_csetf_psp_equivalence_set_choice_dtr_num", "_CSETF-PSP-EQUIVALENCE-SET-CHOICE-DTR-NUM", 2, 0, false);
        declareFunction("_csetf_psp_equivalence_set_edges", "_CSETF-PSP-EQUIVALENCE-SET-EDGES", 2, 0, false);
        declareFunction("make_psp_edge_equivalence_set", "MAKE-PSP-EDGE-EQUIVALENCE-SET", 0, 1, false);
        declareFunction("visit_defstruct_psp_edge_equivalence_set", "VISIT-DEFSTRUCT-PSP-EDGE-EQUIVALENCE-SET", 2, 0, false);
        declareFunction("visit_defstruct_object_psp_edge_equivalence_set_method", "VISIT-DEFSTRUCT-OBJECT-PSP-EDGE-EQUIVALENCE-SET-METHOD", 2, 0, false);
        declareFunction("pprint_psp_equivalence_set", "PPRINT-PSP-EQUIVALENCE-SET", 1, 2, false);
        declareFunction("new_psp_equivalence_set", "NEW-PSP-EQUIVALENCE-SET", 0, 0, false);
        declareFunction("psp_equivalence_set_add_edge", "PSP-EQUIVALENCE-SET-ADD-EDGE", 2, 1, false);
        declareFunction("psp_equivalence_sets_for_edges", "PSP-EQUIVALENCE-SETS-FOR-EDGES", 1, 0, false);
        declareFunction("psp_edge_fits_in_equivalence_setP", "PSP-EDGE-FITS-IN-EQUIVALENCE-SET?", 2, 0, false);
        declareFunction("psp_edges_choice_node_equivalentP", "PSP-EDGES-CHOICE-NODE-EQUIVALENT?", 3, 0, false);
        declareFunction("psp_create_node_for_equivalence_sets", "PSP-CREATE-NODE-FOR-EQUIVALENCE-SETS", 1, 0, false);
        declareFunction("psp_find_or_create_node_for_equivalence_set", "PSP-FIND-OR-CREATE-NODE-FOR-EQUIVALENCE-SET", 1, 0, false);
        declareFunction("psp_create_node_for_equivalence_set", "PSP-CREATE-NODE-FOR-EQUIVALENCE-SET", 1, 0, false);
        declareFunction("psp_find_or_create_node_for_edge", "PSP-FIND-OR-CREATE-NODE-FOR-EDGE", 1, 0, false);
        declareFunction("psp_create_node_for_edge", "PSP-CREATE-NODE-FOR-EDGE", 1, 0, false);
        declareFunction("psp_create_node_shell_for_edge", "PSP-CREATE-NODE-SHELL-FOR-EDGE", 1, 0, false);
        declareFunction("psp_edge_note_meaning_on_node_if_known", "PSP-EDGE-NOTE-MEANING-ON-NODE-IF-KNOWN", 2, 1, false);
        declareFunction("psp_note_semantic_dependency", "PSP-NOTE-SEMANTIC-DEPENDENCY", 4, 0, false);
        declareMacro("with_psp_parse_tree_assert_parameters", "WITH-PSP-PARSE-TREE-ASSERT-PARAMETERS");
        declareFunction("psp_create_parse_tree_with_root_node", "PSP-CREATE-PARSE-TREE-WITH-ROOT-NODE", 1, 0, false);
        declareFunction("psp_agent", "PSP-AGENT", 0, 0, false);
        declareFunction("psp_create_instance", "PSP-CREATE-INSTANCE", 1, 0, false);
        declareFunction("psp_create_node", "PSP-CREATE-NODE", 5, 0, false);
        declareFunction("psp_span_wrt_tokenization", "PSP-SPAN-WRT-TOKENIZATION", 2, 0, false);
        declareFunction("psp_node_add_dtr", "PSP-NODE-ADD-DTR", 3, 0, false);
        declareFunction("psp_node_propose_meaning", "PSP-NODE-PROPOSE-MEANING", 2, 1, false);
        declareFunction("psp_node_note_semantic_dependency", "PSP-NODE-NOTE-SEMANTIC-DEPENDENCY", 4, 0, false);
        declareFunction("psp_generate_choice_node", "PSP-GENERATE-CHOICE-NODE", 0, 0, false);
        declareFunction("psp_choice_node_add_option_node", "PSP-CHOICE-NODE-ADD-OPTION-NODE", 2, 0, false);
        declareFunction("psp_chart_tokenization", "PSP-CHART-TOKENIZATION", 0, 1, false);
        declareFunction("psp_chart_parse_tree_mt", "PSP-CHART-PARSE-TREE-MT", 0, 1, false);
        return NIL;
    }

    public static final SubLObject init_psp_parse_tree_generator_file_alt() {
        defconstant("*DTP-PSP-EDGE-EQUIVALENCE-SET*", PSP_EDGE_EQUIVALENCE_SET);
        deflexical("*PSP-CHART-TOKENIZATIONS*", NIL != boundp($psp_chart_tokenizations$) ? ((SubLObject) ($psp_chart_tokenizations$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject init_psp_parse_tree_generator_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*DTP-PSP-EDGE-EQUIVALENCE-SET*", PSP_EDGE_EQUIVALENCE_SET);
            deflexical("*PSP-CHART-TOKENIZATIONS*", SubLTrampolineFile.maybeDefault($psp_chart_tokenizations$, $psp_chart_tokenizations$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*PSP-CHART-TOKENIZATIONS*", NIL != boundp($psp_chart_tokenizations$) ? ((SubLObject) ($psp_chart_tokenizations$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_psp_parse_tree_generator_file_Previous() {
        defconstant("*DTP-PSP-EDGE-EQUIVALENCE-SET*", PSP_EDGE_EQUIVALENCE_SET);
        deflexical("*PSP-CHART-TOKENIZATIONS*", SubLTrampolineFile.maybeDefault($psp_chart_tokenizations$, $psp_chart_tokenizations$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        return NIL;
    }

    public static SubLObject setup_psp_parse_tree_generator_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_psp_edge_equivalence_set$.getGlobalValue(), symbol_function(PSP_EDGE_EQUIVALENCE_SET_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list13);
        def_csetf(PSP_EQUIVALENCE_SET_CHOICE_DTR_NUM, _CSETF_PSP_EQUIVALENCE_SET_CHOICE_DTR_NUM);
        def_csetf(PSP_EQUIVALENCE_SET_EDGES, _CSETF_PSP_EQUIVALENCE_SET_EDGES);
        identity(PSP_EDGE_EQUIVALENCE_SET);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_psp_edge_equivalence_set$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PSP_EDGE_EQUIVALENCE_SET_METHOD));
        declare_defglobal($psp_chart_tokenizations$);
        return NIL;
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
    }

    public static final class $psp_edge_equivalence_set_p$UnaryFunction extends UnaryFunction {
        public $psp_edge_equivalence_set_p$UnaryFunction() {
            super(extractFunctionNamed("PSP-EDGE-EQUIVALENCE-SET-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return psp_edge_equivalence_set_p(arg1);
        }
    }

    static private final SubLString $str_alt1$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLString $str_alt4$Can_t_generate_a_node_from_no_edg = makeString("Can't generate a node from no edges!");

    static private final SubLString $str_alt5$Found_no_equivalence_sets_for__S_ = makeString("Found no equivalence sets for ~S.");

    static private final SubLList $list_alt8 = list(makeSymbol("CHOICE-DTR-NUM"), makeSymbol("EDGES"));

    static private final SubLList $list_alt9 = list(makeKeyword("CHOICE-DTR-NUM"), makeKeyword("EDGES"));

    static private final SubLList $list_alt10 = list(makeSymbol("PSP-EQUIVALENCE-SET-CHOICE-DTR-NUM"), makeSymbol("PSP-EQUIVALENCE-SET-EDGES"));

    static private final SubLList $list_alt11 = list(makeSymbol("_CSETF-PSP-EQUIVALENCE-SET-CHOICE-DTR-NUM"), makeSymbol("_CSETF-PSP-EQUIVALENCE-SET-EDGES"));

    static private final SubLString $str_alt20$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt21$_PSP_EQUIV_SET_of__S_edges_ = makeString("<PSP-EQUIV-SET of ~S edges>");

    static private final SubLString $str_alt22$New_choice_dtr_num_of__S_doesn_t_ = makeString("New choice-dtr-num of ~S doesn't match ~S");

    static private final SubLList $list_alt25 = list(list(makeSymbol("*THE-CYCLIST*"), list(makeSymbol("PSP-AGENT"))));

    static private final SubLList $list_alt27 = list(makeSymbol("PSP-CHART-PARSE-TREE-MT"));

    static private final SubLList $list_alt31 = list(reader_make_constant_shell("InstanceWithRelationFromFn"), list(reader_make_constant_shell("ProgramCopyFn"), reader_make_constant_shell("CycPhraseStructureParser")), reader_make_constant_shell("partOfIBT"), reader_make_constant_shell("Cyc"));

    static private final SubLSymbol $sym32$_DTR_NODE = makeSymbol("?DTR-NODE");

    static private final SubLList $list_alt34 = list(makeSymbol("?DTR-NODE"));

    static private final SubLString $str_alt35$__Trying_to_add__S_to____S___as_d = makeString("~&Trying to add ~S to~% ~S~% as dtr ~S of ~S~%");

    static private final SubLList $list_alt40 = list(reader_make_constant_shell("Microtheory"));

    static private final SubLList $list_alt43 = list(reader_make_constant_shell("DiscourseModellingVocabularyMt"));

    static private final SubLList $list_alt44 = list(reader_make_constant_shell("EnglishMt"));
}

/**
 * Total time: 207 ms
 */
