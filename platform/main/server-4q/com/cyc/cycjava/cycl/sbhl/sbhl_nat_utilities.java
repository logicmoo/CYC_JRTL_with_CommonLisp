/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.el_utilities.make_nat_formula;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SBHL-NAT-UTILITIES
 * source file: /cyc/top/cycl/sbhl/sbhl-nat-utilities.lisp
 * created:     2019/07/03 17:37:25
 */
public final class sbhl_nat_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sbhl_nat_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol RESET_NAT_ISA_LINKS_INT = makeSymbol("RESET-NAT-ISA-LINKS-INT");







    private static final SubLSymbol SBHL_RESULT_GENL = makeSymbol("SBHL-RESULT-GENL");

    private static final SubLSymbol RESULT_GENL_ARGS = makeSymbol("RESULT-GENL-ARGS");

    private static final SubLSymbol RESULT_INTER_ARG_GENL = makeSymbol("RESULT-INTER-ARG-GENL");

    private static final SubLSymbol RESULT_INTER_ARG_GENL_RELN = makeSymbol("RESULT-INTER-ARG-GENL-RELN");

    private static final SubLSymbol RESULT_GENL_VIA_ARG_ARG_GENL = makeSymbol("RESULT-GENL-VIA-ARG-ARG-GENL");

    private static final SubLSymbol SBHL_RESULT_ISA = makeSymbol("SBHL-RESULT-ISA");

    private static final SubLSymbol RESULT_ISA_ARGS = makeSymbol("RESULT-ISA-ARGS");

    private static final SubLSymbol RESULT_INTER_ARG_ISA = makeSymbol("RESULT-INTER-ARG-ISA");

    private static final SubLSymbol RESULT_INTER_ARG_ISA_RELN = makeSymbol("RESULT-INTER-ARG-ISA-RELN");

    private static final SubLSymbol RESULT_ISA_VIA_ARG_ARG_ISA = makeSymbol("RESULT-ISA-VIA-ARG-ARG-ISA");

    private static final SubLSymbol RESULT_ISA_ARG_ISAS = makeSymbol("RESULT-ISA-ARG-ISAS");

    private static final SubLSymbol RESULT_ISA_WHEN_ARG_ISA = makeSymbol("RESULT-ISA-WHEN-ARG-ISA");

    private static final SubLSymbol RESULT_ISA_VIA_CLOSED_UNDER = makeSymbol("RESULT-ISA-VIA-CLOSED-UNDER");

    private static final SubLSymbol SBHL_EVALUATION_RESULT_QUOTED_ISA = makeSymbol("SBHL-EVALUATION-RESULT-QUOTED-ISA");

    private static final SubLSymbol SBHL_RESULT_QUOTED_ISA = makeSymbol("SBHL-RESULT-QUOTED-ISA");



























    private static final SubLSymbol RESULT_GENL = makeSymbol("RESULT-GENL");

    private static final SubLSymbol RESULT_ISA = makeSymbol("RESULT-ISA");

    private static final SubLSymbol RESULT_ISA_ARG_ISA = makeSymbol("RESULT-ISA-ARG-ISA");

    private static final SubLSymbol EVALUATION_RESULT_QUOTED_ISA = makeSymbol("EVALUATION-RESULT-QUOTED-ISA");

    private static final SubLSymbol RESULT_QUOTED_ISA = makeSymbol("RESULT-QUOTED-ISA");

    private static final SubLString $str40$_a_is_not_a_supported_NAUT_link_g = makeString("~a is not a supported NAUT link generator");

    private static final SubLSymbol $sym41$CYC_VAR_ = makeSymbol("CYC-VAR?");

    // Definitions
    public static final SubLObject reset_nat_isa_links_alt() {
        kb_mapping.map_predicate_extent_index(symbol_function(RESET_NAT_ISA_LINKS_INT), $$termOfUnit, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    // Definitions
    public static SubLObject reset_nat_isa_links() {
        kb_mapping.map_predicate_extent_index(symbol_function(RESET_NAT_ISA_LINKS_INT), $$termOfUnit, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject reset_nat_isa_links_int_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(assertion, ASSERTION_P);
            {
                SubLObject nat = assertions_high.gaf_arg1(assertion);
                SubLObject redoP = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        redoP = sublisp_null(isa.isa(nat, UNPROVIDED, UNPROVIDED));
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != redoP) {
                    {
                        SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                        try {
                            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                            isa.reset_isa_links(nat);
                        } finally {
                            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject reset_nat_isa_links_int(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        final SubLObject nat = assertions_high.gaf_arg1(assertion);
        SubLObject redoP = NIL;
        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            redoP = sublisp_null(isa.isa(nat, UNPROVIDED, UNPROVIDED));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != redoP) {
            _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
            try {
                system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                isa.reset_isa_links(nat);
            } finally {
                system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    /**
     * Accessor: calls @see result-genl on the functor of NODE.
     */
    @LispMethod(comment = "Accessor: calls @see result-genl on the functor of NODE.")
    public static final SubLObject sbhl_result_genl_alt(SubLObject node) {
        return kb_accessors.result_genl(cycl_utilities.nat_functor(node), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Accessor: calls @see result-genl on the functor of NODE.
     */
    @LispMethod(comment = "Accessor: calls @see result-genl on the functor of NODE.")
    public static SubLObject sbhl_result_genl(final SubLObject node) {
        return kb_accessors.result_genl(cycl_utilities.nat_functor(node), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Accessor: calls @see result-isa on the functor of NODE.
     */
    @LispMethod(comment = "Accessor: calls @see result-isa on the functor of NODE.")
    public static final SubLObject sbhl_result_isa_alt(SubLObject node) {
        return kb_accessors.result_isa(cycl_utilities.nat_functor(node), UNPROVIDED);
    }

    /**
     * Accessor: calls @see result-isa on the functor of NODE.
     */
    @LispMethod(comment = "Accessor: calls @see result-isa on the functor of NODE.")
    public static SubLObject sbhl_result_isa(final SubLObject node) {
        return kb_accessors.result_isa(cycl_utilities.nat_functor(node), UNPROVIDED);
    }

    /**
     * Accessor: calls @see evaluation-result-quoted-isa on the functor of NODE.
     */
    @LispMethod(comment = "Accessor: calls @see evaluation-result-quoted-isa on the functor of NODE.")
    public static final SubLObject sbhl_evaluation_result_quoted_isa_alt(SubLObject node) {
        return kb_accessors.evaluation_result_quoted_isa(cycl_utilities.nat_functor(node), UNPROVIDED);
    }

    /**
     * Accessor: calls @see evaluation-result-quoted-isa on the functor of NODE.
     */
    @LispMethod(comment = "Accessor: calls @see evaluation-result-quoted-isa on the functor of NODE.")
    public static SubLObject sbhl_evaluation_result_quoted_isa(final SubLObject node) {
        return kb_accessors.evaluation_result_quoted_isa(cycl_utilities.nat_functor(node), UNPROVIDED);
    }

    /**
     * Accessor: calls @see evaluation-result-quoted-isa on the functor of NODE.
     */
    @LispMethod(comment = "Accessor: calls @see evaluation-result-quoted-isa on the functor of NODE.")
    public static final SubLObject sbhl_result_quoted_isa_alt(SubLObject node) {
        return kb_accessors.result_quoted_isa(cycl_utilities.nat_functor(node), UNPROVIDED);
    }

    /**
     * Accessor: calls @see evaluation-result-quoted-isa on the functor of NODE.
     */
    @LispMethod(comment = "Accessor: calls @see evaluation-result-quoted-isa on the functor of NODE.")
    public static SubLObject sbhl_result_quoted_isa(final SubLObject node) {
        return kb_accessors.result_quoted_isa(cycl_utilities.nat_functor(node), UNPROVIDED);
    }

    public static final SubLObject sbhl_naut_forward_genl_mts_alt(SubLObject node) {
        {
            SubLObject pcase_var = cycl_utilities.nat_functor(node);
            if (pcase_var.eql($$MtUnionFn)) {
                return hlmt.mt_union_mts(node);
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject sbhl_naut_forward_genl_mts(final SubLObject node) {
        final SubLObject pcase_var = cycl_utilities.nat_functor(node);
        if (pcase_var.eql($$MtUnionFn)) {
            return hlmt.mt_union_mts(node);
        }
        return NIL;
    }

    public static final SubLObject sbhl_determine_naut_just_step_alt(SubLObject node, SubLObject link_node, SubLObject link_generator) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pcase_var = link_generator;
                if (pcase_var.eql(SBHL_RESULT_GENL)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.sbhl_result_genl_just(node, link_node);
                } else {
                    if (pcase_var.eql(RESULT_GENL_ARGS)) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.sbhl_result_genl_args_just(node, link_node);
                    } else {
                        if (pcase_var.eql(RESULT_INTER_ARG_GENL)) {
                            return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.sbhl_inter_arg_genl_just(node, link_node);
                        } else {
                            if (pcase_var.eql(RESULT_INTER_ARG_GENL_RELN)) {
                                return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.sbhl_inter_arg_genl_reln_just(node, link_node);
                            } else {
                                if (pcase_var.eql(RESULT_GENL_VIA_ARG_ARG_GENL)) {
                                    return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.sbhl_result_genl_via_arg_arg_genl_just(node, link_node);
                                } else {
                                    if (pcase_var.eql(SBHL_RESULT_ISA)) {
                                        return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.sbhl_result_isa_just(node, link_node);
                                    } else {
                                        if (pcase_var.eql(RESULT_ISA_ARGS)) {
                                            return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.sbhl_result_isa_args_just(node, link_node);
                                        } else {
                                            if (pcase_var.eql(RESULT_INTER_ARG_ISA)) {
                                                return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.sbhl_result_inter_arg_isa_just(node, link_node);
                                            } else {
                                                if (pcase_var.eql(RESULT_INTER_ARG_ISA_RELN)) {
                                                    return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.sbhl_result_inter_arg_isa_reln_just(node, link_node);
                                                } else {
                                                    if (pcase_var.eql(RESULT_ISA_VIA_ARG_ARG_ISA)) {
                                                        return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.sbhl_result_isa_via_arg_arg_isa_just(node, link_node);
                                                    } else {
                                                        if (pcase_var.eql(RESULT_ISA_ARG_ISAS)) {
                                                            return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.sbhl_result_isa_arg_isas_just(node, link_node);
                                                        } else {
                                                            if (pcase_var.eql(RESULT_ISA_VIA_CLOSED_UNDER)) {
                                                                return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.sbhl_result_isa_via_closed_under_just(node, link_node);
                                                            } else {
                                                                if (pcase_var.eql(SBHL_EVALUATION_RESULT_QUOTED_ISA)) {
                                                                    return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.sbhl_evaluation_result_quoted_isa_just(node, link_node);
                                                                } else {
                                                                    if (pcase_var.eql(SBHL_RESULT_QUOTED_ISA)) {
                                                                        return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.sbhl_result_quoted_isa_just(node, link_node);
                                                                    } else {
                                                                        return arguments.make_hl_support(sbhl_module_utilities.sbhl_pred_get_hl_module(sbhl_module_vars.get_sbhl_module_link_pred(sbhl_search_vars.$sbhl_search_module$.getDynamicValue(thread))), list(sbhl_module_vars.get_sbhl_module_link_pred(sbhl_search_vars.$sbhl_search_module$.getDynamicValue(thread)), node, link_node), mt_relevance_macros.$mt$.getDynamicValue(thread), sbhl_search_utilities.hl_default_tv(sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread)));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject sbhl_determine_naut_just_step(final SubLObject node, final SubLObject link_node, final SubLObject link_generator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (link_generator.eql(SBHL_RESULT_GENL)) {
            return sbhl_result_genl_just(node, link_node);
        }
        if (link_generator.eql(RESULT_GENL_ARGS)) {
            return sbhl_result_genl_args_just(node, link_node);
        }
        if (link_generator.eql(RESULT_INTER_ARG_GENL)) {
            return sbhl_inter_arg_genl_just(node, link_node);
        }
        if (link_generator.eql(RESULT_INTER_ARG_GENL_RELN)) {
            return sbhl_inter_arg_genl_reln_just(node, link_node);
        }
        if (link_generator.eql(RESULT_GENL_VIA_ARG_ARG_GENL)) {
            return sbhl_result_genl_via_arg_arg_genl_just(node, link_node);
        }
        if (link_generator.eql(SBHL_RESULT_ISA)) {
            return sbhl_result_isa_just(node, link_node);
        }
        if (link_generator.eql(RESULT_ISA_ARGS)) {
            return sbhl_result_isa_args_just(node, link_node);
        }
        if (link_generator.eql(RESULT_INTER_ARG_ISA)) {
            return sbhl_result_inter_arg_isa_just(node, link_node);
        }
        if (link_generator.eql(RESULT_INTER_ARG_ISA_RELN)) {
            return sbhl_result_inter_arg_isa_reln_just(node, link_node);
        }
        if (link_generator.eql(RESULT_ISA_VIA_ARG_ARG_ISA)) {
            return sbhl_result_isa_via_arg_arg_isa_just(node, link_node);
        }
        if (link_generator.eql(RESULT_ISA_ARG_ISAS)) {
            return sbhl_result_isa_arg_isas_just(node, link_node);
        }
        if (link_generator.eql(RESULT_ISA_WHEN_ARG_ISA)) {
            return sbhl_result_isa_when_arg_isa_just(node, link_node);
        }
        if (link_generator.eql(RESULT_ISA_VIA_CLOSED_UNDER)) {
            return sbhl_result_isa_via_closed_under_just(node, link_node);
        }
        if (link_generator.eql(SBHL_EVALUATION_RESULT_QUOTED_ISA)) {
            return sbhl_evaluation_result_quoted_isa_just(node, link_node);
        }
        if (link_generator.eql(SBHL_RESULT_QUOTED_ISA)) {
            return sbhl_result_quoted_isa_just(node, link_node);
        }
        return arguments.make_hl_support(sbhl_module_utilities.sbhl_pred_get_hl_module(sbhl_module_vars.get_sbhl_module_link_pred(sbhl_search_vars.$sbhl_search_module$.getDynamicValue(thread))), list(sbhl_module_vars.get_sbhl_module_link_pred(sbhl_search_vars.$sbhl_search_module$.getDynamicValue(thread)), node, link_node), mt_relevance_macros.$mt$.getDynamicValue(thread), sbhl_search_utilities.hl_default_tv(sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread)));
    }

    public static final SubLObject sbhl_result_genl_just_alt(SubLObject node, SubLObject link_node) {
        return list(list($$resultGenl, cycl_utilities.nat_functor(node), link_node), NIL, $TRUE);
    }

    public static SubLObject sbhl_result_genl_just(final SubLObject node, final SubLObject link_node) {
        return list(list($$resultGenl, cycl_utilities.nat_functor(node), link_node), NIL, $TRUE);
    }

    public static final SubLObject sbhl_result_genl_args_just_alt(SubLObject node, SubLObject link_node) {
        {
            SubLObject args = kb_accessors.result_genl_via_argnums(node, link_node, UNPROVIDED, UNPROVIDED);
            return list(list($$resultGenlArg, cycl_utilities.nat_functor(node), args.first()), NIL, $TRUE);
        }
    }

    public static SubLObject sbhl_result_genl_args_just(final SubLObject node, final SubLObject link_node) {
        final SubLObject args = kb_accessors.result_genl_via_argnums(node, link_node, UNPROVIDED, UNPROVIDED);
        return list(list($$resultGenlArg, cycl_utilities.nat_functor(node), args.first()), NIL, $TRUE);
    }

    public static final SubLObject sbhl_inter_arg_genl_just_alt(SubLObject node, SubLObject link_node) {
        {
            SubLObject args = kb_accessors.result_inter_arg_genl_via_which_args(node, link_node, UNPROVIDED).first();
            SubLObject arg = args.first();
            SubLObject ind_col = second(args);
            SubLObject dep_col = third(args);
            return list(list($$interArgResultGenl, cycl_utilities.nat_functor(node), arg, ind_col, dep_col), NIL, $TRUE);
        }
    }

    public static SubLObject sbhl_inter_arg_genl_just(final SubLObject node, final SubLObject link_node) {
        final SubLObject args = kb_accessors.result_inter_arg_genl_via_which_args(node, link_node, UNPROVIDED).first();
        final SubLObject arg = args.first();
        final SubLObject ind_col = second(args);
        final SubLObject dep_col = third(args);
        return list(list($$interArgResultGenl, cycl_utilities.nat_functor(node), arg, ind_col, dep_col), NIL, $TRUE);
    }

    public static final SubLObject sbhl_inter_arg_genl_reln_just_alt(SubLObject node, SubLObject link_node) {
        {
            SubLObject args = kb_accessors.result_inter_arg_genl_reln_via_which_args(node, link_node, UNPROVIDED, UNPROVIDED).first();
            SubLObject rel_sentence = args.first().first();
            SubLObject arg = second(args);
            SubLObject rel = cycl_utilities.formula_operator(rel_sentence);
            SubLObject rel_nat_term_arg = third(args);
            SubLObject rel_col_arg = fourth(args);
            return list(list($$interArgResultGenlReln, cycl_utilities.nat_functor(node), arg, rel, rel_nat_term_arg, rel_col_arg), NIL, $TRUE);
        }
    }

    public static SubLObject sbhl_inter_arg_genl_reln_just(final SubLObject node, final SubLObject link_node) {
        final SubLObject args = kb_accessors.result_inter_arg_genl_reln_via_which_args(node, link_node, UNPROVIDED, UNPROVIDED).first();
        final SubLObject rel_sentence = args.first().first();
        final SubLObject arg = second(args);
        final SubLObject rel = cycl_utilities.formula_operator(rel_sentence);
        final SubLObject rel_nat_term_arg = third(args);
        final SubLObject rel_col_arg = fourth(args);
        return list(list($$interArgResultGenlReln, cycl_utilities.nat_functor(node), arg, rel, rel_nat_term_arg, rel_col_arg), NIL, $TRUE);
    }

    public static final SubLObject sbhl_result_genl_via_arg_arg_genl_just_alt(SubLObject node, SubLObject link_node) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.sbhl_result_genl_args_just(node, link_node);
    }

    public static SubLObject sbhl_result_genl_via_arg_arg_genl_just(final SubLObject node, final SubLObject link_node) {
        return sbhl_result_genl_args_just(node, link_node);
    }

    public static final SubLObject sbhl_result_isa_just_alt(SubLObject node, SubLObject link_node) {
        return list(list($$resultIsa, cycl_utilities.nat_functor(node), link_node), NIL, $TRUE);
    }

    public static SubLObject sbhl_result_isa_just(final SubLObject node, final SubLObject link_node) {
        return list(list($$resultIsa, cycl_utilities.nat_functor(node), link_node), NIL, $TRUE);
    }

    public static final SubLObject sbhl_result_isa_args_just_alt(SubLObject node, SubLObject link_node) {
        {
            SubLObject args = kb_accessors.result_isa_via_argnums(node, link_node, UNPROVIDED, UNPROVIDED);
            return list(list($$resultIsaArg, cycl_utilities.nat_functor(node), args.first()), NIL, $TRUE);
        }
    }

    public static SubLObject sbhl_result_isa_args_just(final SubLObject node, final SubLObject link_node) {
        final SubLObject args = kb_accessors.result_isa_via_argnums(node, link_node, UNPROVIDED, UNPROVIDED);
        return list(list($$resultIsaArg, cycl_utilities.nat_functor(node), args.first()), NIL, $TRUE);
    }

    public static final SubLObject sbhl_result_inter_arg_isa_just_alt(SubLObject node, SubLObject link_node) {
        {
            SubLObject args = kb_accessors.result_inter_arg_isa_via_which_args(node, link_node, UNPROVIDED, UNPROVIDED).first();
            SubLObject arg = args.first();
            SubLObject ind_col = second(args);
            SubLObject dep_col = third(args);
            return list(list($$interArgResultIsa, cycl_utilities.nat_functor(node), arg, ind_col, dep_col), NIL, $TRUE);
        }
    }

    public static SubLObject sbhl_result_inter_arg_isa_just(final SubLObject node, final SubLObject link_node) {
        final SubLObject args = kb_accessors.result_inter_arg_isa_via_which_args(node, link_node, UNPROVIDED, UNPROVIDED).first();
        final SubLObject arg = args.first();
        final SubLObject ind_col = second(args);
        final SubLObject dep_col = third(args);
        return list(list($$interArgResultIsa, cycl_utilities.nat_functor(node), arg, ind_col, dep_col), NIL, $TRUE);
    }

    public static final SubLObject sbhl_result_inter_arg_isa_reln_just_alt(SubLObject node, SubLObject link_node) {
        {
            SubLObject args = kb_accessors.result_inter_arg_isa_reln_via_which_args(node, link_node, UNPROVIDED, UNPROVIDED).first();
            SubLObject rel_sentence = args.first().first();
            SubLObject arg = second(args);
            SubLObject rel = cycl_utilities.formula_operator(rel_sentence);
            SubLObject rel_nat_term_arg = third(args);
            SubLObject rel_col_arg = fourth(args);
            return list(list($$interArgResultIsaReln, cycl_utilities.nat_functor(node), arg, rel, rel_nat_term_arg, rel_col_arg), NIL, $TRUE);
        }
    }

    public static SubLObject sbhl_result_inter_arg_isa_reln_just(final SubLObject node, final SubLObject link_node) {
        final SubLObject args = kb_accessors.result_inter_arg_isa_reln_via_which_args(node, link_node, UNPROVIDED, UNPROVIDED).first();
        final SubLObject rel_sentence = args.first().first();
        final SubLObject arg = second(args);
        final SubLObject rel = cycl_utilities.formula_operator(rel_sentence);
        final SubLObject rel_nat_term_arg = third(args);
        final SubLObject rel_col_arg = fourth(args);
        return list(list($$interArgResultIsaReln, cycl_utilities.nat_functor(node), arg, rel, rel_nat_term_arg, rel_col_arg), NIL, $TRUE);
    }

    public static final SubLObject sbhl_result_isa_arg_isas_just_alt(SubLObject node, SubLObject link_node) {
        {
            SubLObject args = kb_accessors.result_isa_arg_isa_via_argnums(node, link_node, UNPROVIDED, UNPROVIDED);
            SubLObject isa_arg = args.first();
            return list(list($$resultIsaArgIsa, cycl_utilities.nat_functor(node), isa_arg), NIL, $TRUE);
        }
    }

    public static SubLObject sbhl_result_isa_arg_isas_just(final SubLObject node, final SubLObject link_node) {
        final SubLObject args = kb_accessors.result_isa_arg_isa_via_argnums(node, link_node, UNPROVIDED, UNPROVIDED);
        final SubLObject isa_arg = args.first();
        return list(list($$resultIsaArgIsa, cycl_utilities.nat_functor(node), isa_arg), NIL, $TRUE);
    }

    public static SubLObject sbhl_result_isa_when_arg_isa_just(final SubLObject node, final SubLObject link_node) {
        final SubLObject resultcol_argnum_col = kb_accessors.result_isa_when_arg_isa_via_argnums(node, link_node, UNPROVIDED, UNPROVIDED);
        final SubLObject resultcol = resultcol_argnum_col.first();
        final SubLObject argnum = second(resultcol_argnum_col);
        final SubLObject col = third(resultcol_argnum_col);
        return list(list($$resultIsaWhenArgIsa, cycl_utilities.nat_functor(node), resultcol, argnum, col), NIL, $TRUE);
    }

    public static final SubLObject sbhl_result_isa_via_closed_under_just_alt(SubLObject node, SubLObject link_node) {
        {
            SubLObject result = NIL;
            result = list(list($$closedUnder, link_node, cycl_utilities.nat_functor(node)), NIL, $TRUE);
            return result;
        }
    }

    public static SubLObject sbhl_result_isa_via_closed_under_just(final SubLObject node, final SubLObject link_node) {
        SubLObject result = NIL;
        result = list(list($$closedUnder, link_node, cycl_utilities.nat_functor(node)), NIL, $TRUE);
        return result;
    }

    public static final SubLObject sbhl_result_isa_via_arg_arg_isa_just_alt(SubLObject node, SubLObject link_node) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.sbhl_result_isa_args_just(node, link_node);
    }

    public static SubLObject sbhl_result_isa_via_arg_arg_isa_just(final SubLObject node, final SubLObject link_node) {
        return sbhl_result_isa_args_just(node, link_node);
    }

    public static final SubLObject sbhl_evaluation_result_quoted_isa_just_alt(SubLObject node, SubLObject link_node) {
        return list(list($$evaluationResultQuotedIsa, cycl_utilities.nat_functor(node), link_node), NIL, $TRUE);
    }

    public static SubLObject sbhl_evaluation_result_quoted_isa_just(final SubLObject node, final SubLObject link_node) {
        return list(list($$evaluationResultQuotedIsa, cycl_utilities.nat_functor(node), link_node), NIL, $TRUE);
    }

    public static final SubLObject sbhl_result_quoted_isa_just_alt(SubLObject node, SubLObject link_node) {
        return list(list($$resultQuotedIsa, cycl_utilities.nat_functor(node), link_node), NIL, $TRUE);
    }

    public static SubLObject sbhl_result_quoted_isa_just(final SubLObject node, final SubLObject link_node) {
        return list(list($$resultQuotedIsa, cycl_utilities.nat_functor(node), link_node), NIL, $TRUE);
    }

    public static final SubLObject sbhl_determine_naut_link_mts_alt(SubLObject node, SubLObject link_node, SubLObject link_generator) {
        {
            SubLObject pcase_var = link_generator;
            if (pcase_var.eql(RESULT_GENL)) {
                return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.result_genl_by_what_mts(node, link_node);
            } else {
                if (pcase_var.eql(RESULT_GENL_ARGS)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.result_genl_arg_by_what_mts(node, link_node);
                } else {
                    if (pcase_var.eql(RESULT_INTER_ARG_GENL)) {
                        return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.result_inter_arg_genl_by_what_mts(node, link_node);
                    } else {
                        if (pcase_var.eql(RESULT_INTER_ARG_GENL_RELN)) {
                            return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.result_inter_arg_genl_reln_by_what_mts(node, link_node);
                        } else {
                            if (pcase_var.eql(RESULT_GENL_VIA_ARG_ARG_GENL)) {
                                return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.result_genl_via_arg_arg_genl_by_what_mts(node, link_node);
                            } else {
                                if (pcase_var.eql(RESULT_ISA)) {
                                    return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.result_isa_by_what_mts(node, link_node);
                                } else {
                                    if (pcase_var.eql(RESULT_ISA_ARGS)) {
                                        return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.result_isa_arg_by_what_mts(node, link_node);
                                    } else {
                                        if (pcase_var.eql(RESULT_INTER_ARG_ISA)) {
                                            return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.result_inter_arg_isa_by_what_mts(node, link_node);
                                        } else {
                                            if (pcase_var.eql(RESULT_INTER_ARG_ISA_RELN)) {
                                                return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.result_inter_arg_isa_reln_by_what_mts(node, link_node);
                                            } else {
                                                if (pcase_var.eql(RESULT_ISA_VIA_ARG_ARG_ISA)) {
                                                    return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.result_isa_via_arg_arg_isa_by_what_mts(node, link_node);
                                                } else {
                                                    if (pcase_var.eql(RESULT_ISA_ARG_ISAS)) {
                                                        return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.result_isa_arg_isa_by_what_mts(node, link_node);
                                                    } else {
                                                        if (pcase_var.eql(RESULT_ISA_VIA_CLOSED_UNDER)) {
                                                            return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.result_isa_via_closed_under_by_what_mts(node, link_node);
                                                        } else {
                                                            if (pcase_var.eql(EVALUATION_RESULT_QUOTED_ISA)) {
                                                                return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.evaluation_result_quoted_isa_by_what_mts(node, link_node);
                                                            } else {
                                                                if (pcase_var.eql(RESULT_QUOTED_ISA)) {
                                                                    return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.result_quoted_isa_by_what_mts(node, link_node);
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt37$_a_is_not_a_supported_NAUT_link_g, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    return NIL;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject sbhl_determine_naut_link_mts(final SubLObject node, final SubLObject link_node, final SubLObject link_generator) {
        if (link_generator.eql(RESULT_GENL)) {
            return result_genl_by_what_mts(node, link_node);
        }
        if (link_generator.eql(RESULT_GENL_ARGS)) {
            return result_genl_arg_by_what_mts(node, link_node);
        }
        if (link_generator.eql(RESULT_INTER_ARG_GENL)) {
            return result_inter_arg_genl_by_what_mts(node, link_node);
        }
        if (link_generator.eql(RESULT_INTER_ARG_GENL_RELN)) {
            return result_inter_arg_genl_reln_by_what_mts(node, link_node);
        }
        if (link_generator.eql(RESULT_GENL_VIA_ARG_ARG_GENL)) {
            return result_genl_via_arg_arg_genl_by_what_mts(node, link_node);
        }
        if (link_generator.eql(RESULT_ISA)) {
            return result_isa_by_what_mts(node, link_node);
        }
        if (link_generator.eql(RESULT_ISA_ARGS)) {
            return result_isa_arg_by_what_mts(node, link_node);
        }
        if (link_generator.eql(RESULT_INTER_ARG_ISA)) {
            return result_inter_arg_isa_by_what_mts(node, link_node);
        }
        if (link_generator.eql(RESULT_INTER_ARG_ISA_RELN)) {
            return result_inter_arg_isa_reln_by_what_mts(node, link_node);
        }
        if (link_generator.eql(RESULT_ISA_VIA_ARG_ARG_ISA)) {
            return result_isa_via_arg_arg_isa_by_what_mts(node, link_node);
        }
        if (link_generator.eql(RESULT_ISA_ARG_ISAS)) {
            return result_isa_arg_isa_by_what_mts(node, link_node);
        }
        if (link_generator.eql(RESULT_ISA_ARG_ISA)) {
            return result_isa_when_arg_isa_by_what_mts(node, link_node);
        }
        if (link_generator.eql(RESULT_ISA_VIA_CLOSED_UNDER)) {
            return result_isa_via_closed_under_by_what_mts(node, link_node);
        }
        if (link_generator.eql(EVALUATION_RESULT_QUOTED_ISA)) {
            return evaluation_result_quoted_isa_by_what_mts(node, link_node);
        }
        if (link_generator.eql(RESULT_QUOTED_ISA)) {
            return result_quoted_isa_by_what_mts(node, link_node);
        }
        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str40$_a_is_not_a_supported_NAUT_link_g, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject result_genl_by_what_mts_alt(SubLObject node, SubLObject link_node) {
        {
            SubLObject functor = cycl_utilities.nat_functor(node);
            if (NIL != forts.fort_p(functor)) {
                return kb_indexing.gaf_mts(list($$resultGenl, node, link_node));
            } else {
                if (NIL != czer_utilities.naut_with_corresponding_nartP(functor)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.result_genl_by_what_mts(make_nat_formula(narts_high.find_nart(functor), cycl_utilities.nat_args(node, UNPROVIDED)), link_node);
                } else {
                    if (NIL != obsolete.reifiable_natP(functor, symbol_function($sym38$CYC_VAR_), UNPROVIDED)) {
                        sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
                        return NIL;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject result_genl_by_what_mts(final SubLObject node, final SubLObject link_node) {
        final SubLObject functor = cycl_utilities.nat_functor(node);
        if (NIL != forts.fort_p(functor)) {
            return kb_indexing.gaf_mts(list($$resultGenl, node, link_node));
        }
        if (NIL != czer_utilities.naut_with_corresponding_nartP(functor)) {
            return result_genl_by_what_mts(make_nat_formula(narts_high.find_nart(functor), cycl_utilities.nat_args(node, UNPROVIDED)), link_node);
        }
        if (NIL != obsolete.reifiable_natP(functor, symbol_function($sym41$CYC_VAR_), UNPROVIDED)) {
            sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject result_genl_arg_by_what_mts_alt(SubLObject node, SubLObject link_node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject functor = cycl_utilities.nat_functor(node);
                SubLObject result = NIL;
                if (NIL != forts.fort_p(functor)) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            {
                                SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(functor, $$resultGenlArg, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject arg = NIL;
                                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                    if (arg.isInteger()) {
                                        if (cycl_utilities.nat_arg(node, arg, UNPROVIDED).equal(link_node)) {
                                            result = nconc(kb_indexing.gaf_mts(list($$resultGenlArg, functor, arg)), result);
                                        }
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    if (NIL != czer_utilities.naut_with_corresponding_nartP(functor)) {
                        result = com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.result_genl_arg_by_what_mts(make_nat_formula(narts_high.find_nart(functor), cycl_utilities.nat_args(node, UNPROVIDED)), link_node);
                    } else {
                        if (NIL != obsolete.reifiable_natP(functor, symbol_function($sym38$CYC_VAR_), UNPROVIDED)) {
                            sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject result_genl_arg_by_what_mts(final SubLObject node, final SubLObject link_node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject functor = cycl_utilities.nat_functor(node);
        SubLObject result = NIL;
        if (NIL != forts.fort_p(functor)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(functor, $$resultGenlArg, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (arg.isInteger() && cycl_utilities.nat_arg(node, arg, UNPROVIDED).equal(link_node)) {
                        result = nconc(kb_indexing.gaf_mts(list($$resultGenlArg, functor, arg)), result);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL != czer_utilities.naut_with_corresponding_nartP(functor)) {
                result = result_genl_arg_by_what_mts(make_nat_formula(narts_high.find_nart(functor), cycl_utilities.nat_args(node, UNPROVIDED)), link_node);
            } else
                if (NIL != obsolete.reifiable_natP(functor, symbol_function($sym41$CYC_VAR_), UNPROVIDED)) {
                    sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
                }


        return result;
    }

    public static final SubLObject result_genl_via_arg_arg_genl_by_what_mts_alt(SubLObject node, SubLObject link_node) {
        sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
        return NIL;
    }

    public static SubLObject result_genl_via_arg_arg_genl_by_what_mts(final SubLObject node, final SubLObject link_node) {
        sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
        return NIL;
    }

    public static final SubLObject result_inter_arg_genl_by_what_mts_alt(SubLObject node, SubLObject link_node) {
        sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
        return NIL;
    }

    public static SubLObject result_inter_arg_genl_by_what_mts(final SubLObject node, final SubLObject link_node) {
        sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
        return NIL;
    }

    public static final SubLObject result_inter_arg_genl_reln_by_what_mts_alt(SubLObject node, SubLObject link_node) {
        sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
        return NIL;
    }

    public static SubLObject result_inter_arg_genl_reln_by_what_mts(final SubLObject node, final SubLObject link_node) {
        sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
        return NIL;
    }

    public static final SubLObject result_isa_by_what_mts_alt(SubLObject node, SubLObject link_node) {
        {
            SubLObject functor = cycl_utilities.nat_functor(node);
            if (NIL != forts.fort_p(functor)) {
                return kb_indexing.gaf_mts(list($$resultIsa, node, link_node));
            } else {
                if (NIL != czer_utilities.naut_with_corresponding_nartP(functor)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.result_isa_by_what_mts(make_nat_formula(narts_high.find_nart(functor), cycl_utilities.nat_args(node, UNPROVIDED)), link_node);
                } else {
                    if (NIL != obsolete.reifiable_natP(functor, symbol_function($sym38$CYC_VAR_), UNPROVIDED)) {
                        sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
                        return NIL;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject result_isa_by_what_mts(final SubLObject node, final SubLObject link_node) {
        final SubLObject functor = cycl_utilities.nat_functor(node);
        if (NIL != forts.fort_p(functor)) {
            return kb_indexing.gaf_mts(list($$resultIsa, node, link_node));
        }
        if (NIL != czer_utilities.naut_with_corresponding_nartP(functor)) {
            return result_isa_by_what_mts(make_nat_formula(narts_high.find_nart(functor), cycl_utilities.nat_args(node, UNPROVIDED)), link_node);
        }
        if (NIL != obsolete.reifiable_natP(functor, symbol_function($sym41$CYC_VAR_), UNPROVIDED)) {
            sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject result_isa_arg_by_what_mts_alt(SubLObject node, SubLObject link_node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject functor = cycl_utilities.nat_functor(node);
                SubLObject result = NIL;
                if (NIL != forts.fort_p(functor)) {
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            {
                                SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(functor, $$resultIsaArg, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject arg = NIL;
                                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                                    if (arg.isInteger()) {
                                        if (cycl_utilities.nat_arg(node, arg, UNPROVIDED).equal(link_node)) {
                                            result = nconc(kb_indexing.gaf_mts(list($$resultIsaArg, functor, arg)), result);
                                        }
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    if (NIL != czer_utilities.naut_with_corresponding_nartP(functor)) {
                        result = com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.result_isa_arg_by_what_mts(make_nat_formula(narts_high.find_nart(functor), cycl_utilities.nat_args(node, UNPROVIDED)), link_node);
                    } else {
                        if (NIL != obsolete.reifiable_natP(functor, symbol_function($sym38$CYC_VAR_), UNPROVIDED)) {
                            sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
                        }
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject result_isa_arg_by_what_mts(final SubLObject node, final SubLObject link_node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject functor = cycl_utilities.nat_functor(node);
        SubLObject result = NIL;
        if (NIL != forts.fort_p(functor)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(functor, $$resultIsaArg, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject arg = NIL;
                arg = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (arg.isInteger() && cycl_utilities.nat_arg(node, arg, UNPROVIDED).equal(link_node)) {
                        result = nconc(kb_indexing.gaf_mts(list($$resultIsaArg, functor, arg)), result);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    arg = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL != czer_utilities.naut_with_corresponding_nartP(functor)) {
                result = result_isa_arg_by_what_mts(make_nat_formula(narts_high.find_nart(functor), cycl_utilities.nat_args(node, UNPROVIDED)), link_node);
            } else
                if (NIL != obsolete.reifiable_natP(functor, symbol_function($sym41$CYC_VAR_), UNPROVIDED)) {
                    sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
                }


        return result;
    }

    public static final SubLObject result_isa_via_arg_arg_isa_by_what_mts_alt(SubLObject node, SubLObject link_node) {
        sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
        return NIL;
    }

    public static SubLObject result_isa_via_arg_arg_isa_by_what_mts(final SubLObject node, final SubLObject link_node) {
        sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
        return NIL;
    }

    public static final SubLObject result_inter_arg_isa_by_what_mts_alt(SubLObject node, SubLObject link_node) {
        sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
        return NIL;
    }

    public static SubLObject result_inter_arg_isa_by_what_mts(final SubLObject node, final SubLObject link_node) {
        sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
        return NIL;
    }

    public static final SubLObject result_inter_arg_isa_reln_by_what_mts_alt(SubLObject node, SubLObject link_node) {
        sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
        return NIL;
    }

    public static SubLObject result_inter_arg_isa_reln_by_what_mts(final SubLObject node, final SubLObject link_node) {
        sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
        return NIL;
    }

    public static final SubLObject result_isa_arg_isa_by_what_mts_alt(SubLObject node, SubLObject link_node) {
        sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
        return NIL;
    }

    public static SubLObject result_isa_arg_isa_by_what_mts(final SubLObject node, final SubLObject link_node) {
        sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
        return NIL;
    }

    public static SubLObject result_isa_when_arg_isa_by_what_mts(final SubLObject node, final SubLObject link_node) {
        sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
        return NIL;
    }

    public static final SubLObject result_isa_via_closed_under_by_what_mts_alt(SubLObject node, SubLObject link_node) {
        {
            SubLObject mts = NIL;
            SubLObject result = NIL;
            {
                SubLObject cdolist_list_var = cycl_utilities.nat_args(node, UNPROVIDED);
                SubLObject arg = NIL;
                for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                    mts = nconc(isa.max_floor_mts_of_isa_paths(arg, link_node, UNPROVIDED), mts);
                }
            }
            mts = genl_mts.max_floor_mts(mts, UNPROVIDED, UNPROVIDED);
            {
                SubLObject closed_under_assertions = kb_indexing.find_all_gafs(list($$closedUnder, link_node, cycl_utilities.nat_functor(node), NIL, $TRUE));
                SubLObject cdolist_list_var = closed_under_assertions;
                SubLObject cu_ass = NIL;
                for (cu_ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cu_ass = cdolist_list_var.first()) {
                    {
                        SubLObject cu_mt = assertions_high.assertion_mt(cu_ass);
                        result = nconc(genl_mts.max_floor_mts(cons(cu_mt, mts), UNPROVIDED, UNPROVIDED), result);
                    }
                }
            }
            return list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject result_isa_via_closed_under_by_what_mts(final SubLObject node, final SubLObject link_node) {
        SubLObject mts = NIL;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = cycl_utilities.nat_args(node, UNPROVIDED);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            mts = nconc(isa.max_floor_mts_of_isa_paths(arg, link_node, UNPROVIDED), mts);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        mts = genl_mts.max_floor_mts(mts, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var2;
        final SubLObject closed_under_assertions = cdolist_list_var2 = kb_indexing.find_all_gafs(list($$closedUnder, link_node, cycl_utilities.nat_functor(node), NIL, $TRUE));
        SubLObject cu_ass = NIL;
        cu_ass = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject cu_mt = assertions_high.assertion_mt(cu_ass);
            result = nconc(genl_mts.max_floor_mts(cons(cu_mt, mts), UNPROVIDED, UNPROVIDED), result);
            cdolist_list_var2 = cdolist_list_var2.rest();
            cu_ass = cdolist_list_var2.first();
        } 
        return list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject evaluation_result_quoted_isa_by_what_mts_alt(SubLObject node, SubLObject link_node) {
        {
            SubLObject functor = cycl_utilities.nat_functor(node);
            if (NIL != forts.fort_p(functor)) {
                return kb_indexing.gaf_mts(list($$evaluationResultQuotedIsa, node, link_node));
            } else {
                if (NIL != czer_utilities.naut_with_corresponding_nartP(functor)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.evaluation_result_quoted_isa_by_what_mts(make_nat_formula(narts_high.find_nart(functor), cycl_utilities.nat_args(node, UNPROVIDED)), link_node);
                } else {
                    if (NIL != obsolete.reifiable_natP(functor, symbol_function($sym38$CYC_VAR_), UNPROVIDED)) {
                        sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
                        return NIL;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject evaluation_result_quoted_isa_by_what_mts(final SubLObject node, final SubLObject link_node) {
        final SubLObject functor = cycl_utilities.nat_functor(node);
        if (NIL != forts.fort_p(functor)) {
            return kb_indexing.gaf_mts(list($$evaluationResultQuotedIsa, node, link_node));
        }
        if (NIL != czer_utilities.naut_with_corresponding_nartP(functor)) {
            return evaluation_result_quoted_isa_by_what_mts(make_nat_formula(narts_high.find_nart(functor), cycl_utilities.nat_args(node, UNPROVIDED)), link_node);
        }
        if (NIL != obsolete.reifiable_natP(functor, symbol_function($sym41$CYC_VAR_), UNPROVIDED)) {
            sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject result_quoted_isa_by_what_mts_alt(SubLObject node, SubLObject link_node) {
        {
            SubLObject functor = cycl_utilities.nat_functor(node);
            if (NIL != forts.fort_p(functor)) {
                return kb_indexing.gaf_mts(list($$resultQuotedIsa, node, link_node));
            } else {
                if (NIL != czer_utilities.naut_with_corresponding_nartP(functor)) {
                    return com.cyc.cycjava.cycl.sbhl.sbhl_nat_utilities.result_quoted_isa_by_what_mts(make_nat_formula(narts_high.find_nart(functor), cycl_utilities.nat_args(node, UNPROVIDED)), link_node);
                } else {
                    if (NIL != obsolete.reifiable_natP(functor, symbol_function($sym38$CYC_VAR_), UNPROVIDED)) {
                        sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
                        return NIL;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject result_quoted_isa_by_what_mts(final SubLObject node, final SubLObject link_node) {
        final SubLObject functor = cycl_utilities.nat_functor(node);
        if (NIL != forts.fort_p(functor)) {
            return kb_indexing.gaf_mts(list($$resultQuotedIsa, node, link_node));
        }
        if (NIL != czer_utilities.naut_with_corresponding_nartP(functor)) {
            return result_quoted_isa_by_what_mts(make_nat_formula(narts_high.find_nart(functor), cycl_utilities.nat_args(node, UNPROVIDED)), link_node);
        }
        if (NIL != obsolete.reifiable_natP(functor, symbol_function($sym41$CYC_VAR_), UNPROVIDED)) {
            sbhl_search_what_mts.sbhl_encountered_difficult_naut_mt_generator();
            return NIL;
        }
        return NIL;
    }

    public static SubLObject declare_sbhl_nat_utilities_file() {
        declareFunction("reset_nat_isa_links", "RESET-NAT-ISA-LINKS", 0, 0, false);
        declareFunction("reset_nat_isa_links_int", "RESET-NAT-ISA-LINKS-INT", 1, 0, false);
        declareFunction("sbhl_result_genl", "SBHL-RESULT-GENL", 1, 0, false);
        declareFunction("sbhl_result_isa", "SBHL-RESULT-ISA", 1, 0, false);
        declareFunction("sbhl_evaluation_result_quoted_isa", "SBHL-EVALUATION-RESULT-QUOTED-ISA", 1, 0, false);
        declareFunction("sbhl_result_quoted_isa", "SBHL-RESULT-QUOTED-ISA", 1, 0, false);
        declareFunction("sbhl_naut_forward_genl_mts", "SBHL-NAUT-FORWARD-GENL-MTS", 1, 0, false);
        declareFunction("sbhl_determine_naut_just_step", "SBHL-DETERMINE-NAUT-JUST-STEP", 3, 0, false);
        declareFunction("sbhl_result_genl_just", "SBHL-RESULT-GENL-JUST", 2, 0, false);
        declareFunction("sbhl_result_genl_args_just", "SBHL-RESULT-GENL-ARGS-JUST", 2, 0, false);
        declareFunction("sbhl_inter_arg_genl_just", "SBHL-INTER-ARG-GENL-JUST", 2, 0, false);
        declareFunction("sbhl_inter_arg_genl_reln_just", "SBHL-INTER-ARG-GENL-RELN-JUST", 2, 0, false);
        declareFunction("sbhl_result_genl_via_arg_arg_genl_just", "SBHL-RESULT-GENL-VIA-ARG-ARG-GENL-JUST", 2, 0, false);
        declareFunction("sbhl_result_isa_just", "SBHL-RESULT-ISA-JUST", 2, 0, false);
        declareFunction("sbhl_result_isa_args_just", "SBHL-RESULT-ISA-ARGS-JUST", 2, 0, false);
        declareFunction("sbhl_result_inter_arg_isa_just", "SBHL-RESULT-INTER-ARG-ISA-JUST", 2, 0, false);
        declareFunction("sbhl_result_inter_arg_isa_reln_just", "SBHL-RESULT-INTER-ARG-ISA-RELN-JUST", 2, 0, false);
        declareFunction("sbhl_result_isa_arg_isas_just", "SBHL-RESULT-ISA-ARG-ISAS-JUST", 2, 0, false);
        declareFunction("sbhl_result_isa_when_arg_isa_just", "SBHL-RESULT-ISA-WHEN-ARG-ISA-JUST", 2, 0, false);
        declareFunction("sbhl_result_isa_via_closed_under_just", "SBHL-RESULT-ISA-VIA-CLOSED-UNDER-JUST", 2, 0, false);
        declareFunction("sbhl_result_isa_via_arg_arg_isa_just", "SBHL-RESULT-ISA-VIA-ARG-ARG-ISA-JUST", 2, 0, false);
        declareFunction("sbhl_evaluation_result_quoted_isa_just", "SBHL-EVALUATION-RESULT-QUOTED-ISA-JUST", 2, 0, false);
        declareFunction("sbhl_result_quoted_isa_just", "SBHL-RESULT-QUOTED-ISA-JUST", 2, 0, false);
        declareFunction("sbhl_determine_naut_link_mts", "SBHL-DETERMINE-NAUT-LINK-MTS", 3, 0, false);
        declareFunction("result_genl_by_what_mts", "RESULT-GENL-BY-WHAT-MTS", 2, 0, false);
        declareFunction("result_genl_arg_by_what_mts", "RESULT-GENL-ARG-BY-WHAT-MTS", 2, 0, false);
        declareFunction("result_genl_via_arg_arg_genl_by_what_mts", "RESULT-GENL-VIA-ARG-ARG-GENL-BY-WHAT-MTS", 2, 0, false);
        declareFunction("result_inter_arg_genl_by_what_mts", "RESULT-INTER-ARG-GENL-BY-WHAT-MTS", 2, 0, false);
        declareFunction("result_inter_arg_genl_reln_by_what_mts", "RESULT-INTER-ARG-GENL-RELN-BY-WHAT-MTS", 2, 0, false);
        declareFunction("result_isa_by_what_mts", "RESULT-ISA-BY-WHAT-MTS", 2, 0, false);
        declareFunction("result_isa_arg_by_what_mts", "RESULT-ISA-ARG-BY-WHAT-MTS", 2, 0, false);
        declareFunction("result_isa_via_arg_arg_isa_by_what_mts", "RESULT-ISA-VIA-ARG-ARG-ISA-BY-WHAT-MTS", 2, 0, false);
        declareFunction("result_inter_arg_isa_by_what_mts", "RESULT-INTER-ARG-ISA-BY-WHAT-MTS", 2, 0, false);
        declareFunction("result_inter_arg_isa_reln_by_what_mts", "RESULT-INTER-ARG-ISA-RELN-BY-WHAT-MTS", 2, 0, false);
        declareFunction("result_isa_arg_isa_by_what_mts", "RESULT-ISA-ARG-ISA-BY-WHAT-MTS", 2, 0, false);
        declareFunction("result_isa_when_arg_isa_by_what_mts", "RESULT-ISA-WHEN-ARG-ISA-BY-WHAT-MTS", 2, 0, false);
        declareFunction("result_isa_via_closed_under_by_what_mts", "RESULT-ISA-VIA-CLOSED-UNDER-BY-WHAT-MTS", 2, 0, false);
        declareFunction("evaluation_result_quoted_isa_by_what_mts", "EVALUATION-RESULT-QUOTED-ISA-BY-WHAT-MTS", 2, 0, false);
        declareFunction("result_quoted_isa_by_what_mts", "RESULT-QUOTED-ISA-BY-WHAT-MTS", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_sbhl_nat_utilities_file() {
        return NIL;
    }

    public static SubLObject setup_sbhl_nat_utilities_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_nat_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_nat_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_nat_utilities_file();
    }

    static {
    }

    static private final SubLString $str_alt37$_a_is_not_a_supported_NAUT_link_g = makeString("~a is not a supported NAUT link generator");

    static private final SubLSymbol $sym38$CYC_VAR_ = makeSymbol("CYC-VAR?");
}

/**
 * Total time: 103 ms
 */
