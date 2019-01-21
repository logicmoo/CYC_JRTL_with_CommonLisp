package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class at_vars extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.at_vars";
    public static final String myFingerPrint = "fe354a75746d4cc1951231c34a319bef6992a6867c391aed7c023e71d4595335";
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 527L)
    public static SubLSymbol $semantic_dnf_hl_filtering_enabled$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 696L)
    public static SubLSymbol $at_check_fn_symbolP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 877L)
    public static SubLSymbol $at_check_arg_genlsP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 946L)
    public static SubLSymbol $at_check_arg_isaP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 1011L)
    public static SubLSymbol $at_check_arg_quoted_isaP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 1088L)
    public static SubLSymbol $at_check_arg_not_isaP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 1159L)
    public static SubLSymbol $at_check_arg_typesP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 1291L)
    public static SubLSymbol $at_possibly_check_defining_mtsP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 1394L)
    public static SubLSymbol $at_check_defining_mtsP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 1577L)
    public static SubLSymbol $at_check_inter_arg_isaP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 1655L)
    public static SubLSymbol $at_check_inter_arg_not_isaP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 1739L)
    public static SubLSymbol $at_check_inter_arg_genlP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 1820L)
    public static SubLSymbol $at_check_inter_arg_not_genlP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 1906L)
    public static SubLSymbol $at_check_inter_arg_isa_genlP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 1992L)
    public static SubLSymbol $at_check_inter_arg_genl_isaP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 2078L)
    public static SubLSymbol $at_check_non_constant_inter_arg_isaP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 2184L)
    public static SubLSymbol $at_check_non_constant_inter_arg_genlP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 2292L)
    public static SubLSymbol $at_check_non_constant_inter_arg_formatP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 2421L)
    public static SubLSymbol $at_check_not_isa_disjointP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 2514L)
    public static SubLSymbol $at_check_not_quoted_isa_disjointP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 2620L)
    public static SubLSymbol $at_check_not_genls_disjointP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 2716L)
    public static SubLSymbol $at_check_not_mdwP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 2804L)
    public static SubLSymbol $at_check_not_sdcP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 2892L)
    public static SubLSymbol $at_check_arg_formatP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 2964L)
    public static SubLSymbol $at_check_relator_constraintsP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 3066L)
    public static SubLSymbol $at_ensure_consistencyP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 3228L)
    public static SubLSymbol $at_pred_constraints$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 3594L)
    public static SubLSymbol $at_predicate_violations$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 3671L)
    public static SubLSymbol $at_check_inter_assert_format_wXo_arg_indexP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 3792L)
    public static SubLSymbol $at_check_inter_assert_format_wXo_arg_index_gaf_count_threshold$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 3971L)
    public static SubLSymbol $fag_search_limit$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 4074L)
    public static SubLSymbol $at_gaf_search_limit$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 4243L)
    public static SubLSymbol $at_check_inter_arg_formatP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 4344L)
    public static SubLSymbol $at_check_inter_arg_differentP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 4447L)
    public static SubLSymbol $at_check_genl_predsP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 4525L)
    public static SubLSymbol $at_check_genl_inversesP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 4608L)
    public static SubLSymbol $at_include_isa_literal_constraints$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 4726L)
    public static SubLSymbol $at_include_genl_literal_constraints$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 4847L)
    public static SubLSymbol $gather_at_constraintsP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 4925L)
    public static SubLSymbol $gather_at_assertionsP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 5001L)
    public static SubLSymbol $gather_at_format_violationsP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 5089L)
    public static SubLSymbol $gather_at_different_violationsP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 5183L)
    public static SubLSymbol $gather_at_predicate_violationsP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 5310L)
    public static SubLSymbol $at_format_violations$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 5381L)
    public static SubLSymbol $at_different_violations$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 5458L)
    public static SubLSymbol $within_at_suggestionP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 5558L)
    public static SubLSymbol $within_at_mappingP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 5648L)
    public static SubLSymbol $at_break_on_failureP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 5733L)
    public static SubLSymbol $accumulating_at_violationsP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 5856L)
    public static SubLSymbol $noting_at_violationsP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 5955L)
    public static SubLSymbol $at_trace_level$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 6101L)
    public static SubLSymbol $at_test_level$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 6193L)
    public static SubLSymbol $appraising_disjunctP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 6417L)
    public static SubLSymbol $within_decontextualizedP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 6541L)
    public static SubLSymbol $within_disjunctionP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 6641L)
    public static SubLSymbol $within_conjunctionP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 6741L)
    public static SubLSymbol $within_negated_disjunctionP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 6865L)
    public static SubLSymbol $within_negated_conjunctionP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 6989L)
    public static SubLSymbol $within_functionP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 7102L)
    public static SubLSymbol $within_predicateP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 7206L)
    public static SubLSymbol $within_tou_gafP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 7432L)
    public static SubLSymbol $relax_arg_constraints_for_disjunctionsP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 7584L)
    public static SubLSymbol $at_relax_arg_constraints_for_opaque_expansion_natsP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 7736L)
    public static SubLSymbol $at_admit_consistent_nautsP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 8218L)
    public static SubLSymbol $at_admit_consistent_nartsP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 8409L)
    public static SubLSymbol $at_result$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 8483L)
    public static SubLSymbol $at_some_arg_isaP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 8620L)
    public static SubLSymbol $at_some_arg_isa_requiredP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 8976L)
    public static SubLSymbol $at_consider_multiargs_at_predP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 9332L)
    public static SubLSymbol $at_isa_constraints$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 9431L)
    public static SubLSymbol $at_genl_constraints$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 9531L)
    public static SubLSymbol $at_format_constraints$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 9635L)
    public static SubLSymbol $at_different_constraints$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 9745L)
    public static SubLSymbol $at_isa_assertions$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 9841L)
    public static SubLSymbol $at_genl_assertions$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 9939L)
    public static SubLSymbol $at_format_assertions$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 10041L)
    public static SubLSymbol $at_different_assertions$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 10149L)
    public static SubLSymbol $at_mode$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 10240L)
    public static SubLSymbol $at_constraint_type$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 10349L)
    public static SubLSymbol $at_arg_type$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 10465L)
    public static SubLSymbol $at_base_fn$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 10568L)
    public static SubLSymbol $at_formula$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 10627L)
    public static SubLSymbol $at_pred$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 10779L)
    public static SubLSymbol $at_inverse$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 10888L)
    public static SubLSymbol $at_reln$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 10970L)
    public static SubLSymbol $at_arg$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 11050L)
    public static SubLSymbol $at_argnum$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 11138L)
    public static SubLSymbol $at_arg1$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 11244L)
    public static SubLSymbol $at_arg2$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 11350L)
    public static SubLSymbol $at_ind_argnum$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 11459L)
    public static SubLSymbol $at_ind_arg$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 11565L)
    public static SubLSymbol $at_ind_isa$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 11666L)
    public static SubLSymbol $at_ind_genl$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 11769L)
    public static SubLSymbol $at_arg_isa$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 11853L)
    public static SubLSymbol $at_source$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 11970L)
    public static SubLSymbol $at_mapping_genl_inversesP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 12089L)
    public static SubLSymbol $at_search_genl_predsP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 12174L)
    public static SubLSymbol $at_search_genl_inversesP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 12405L)
    public static SubLSymbol $at_profile_term$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 12519L)
    public static SubLSymbol $at_constraint_gaf$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 12619L)
    public static SubLSymbol $include_at_constraint_gafP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 12760L)
    public static SubLSymbol $at_var_isa$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 12956L)
    public static SubLSymbol $at_var_genl$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 13082L)
    public static SubLSymbol $at_var_types_standard$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 13209L)
    public static SubLSymbol $at_assume_conjuncts_independentP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 13492L)
    public static SubLSymbol $current_at_violation$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 13640L)
    public static SubLSymbol $at_violations$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 13755L)
    public static SubLSymbol $at_disjoins_space$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 13898L)
    public static SubLSymbol $at_isa_space$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 13974L)
    public static SubLSymbol $at_genls_space$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 14054L)
    public static SubLSymbol $at_defns_availableP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 14359L)
    public static SubLSymbol $at_apply_necessary_defnsP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 14463L)
    public static SubLSymbol $at_additional_defn_checking$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 14829L)
    public static SubLSymbol $sort_suf_defn_assertionsP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 14954L)
    public static SubLSymbol $sort_suf_function_assertionsP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 15159L)
    public static SubLSymbol $at_collection_specific_defns$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 15312L)
    public static SubLSymbol $defn_trace_level$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 15474L)
    public static SubLSymbol $defn_test_level$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 15570L)
    public static SubLSymbol $defn_metersP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 15656L)
    public static SubLSymbol $defn_meter_caches$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 15849L)
    public static SubLSymbol $defn_collection$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 16132L)
    public static SubLSymbol $permitting_denotational_terms_admitted_by_defn_via_isaP$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 16619L)
    public static SubLSymbol $at_defn$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 16690L)
    public static SubLSymbol $at_defns$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 16762L)
    public static SubLSymbol $at_function$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 16854L)
    public static SubLSymbol $at_functions$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 16945L)
    public static SubLSymbol $defn_fn_history_default_size$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 17082L)
    public static SubLSymbol $defn_col_history_default_size$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 17186L)
    public static SubLSymbol $defn_col_history$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 17341L)
    public static SubLSymbol $quoted_defn_col_history$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 17510L)
    public static SubLSymbol $defn_fn_history$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 17661L)
    public static SubLSymbol $quoted_defn_fn_history$;
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 17826L)
    public static SubLSymbol $defn_stack$;
    private static final SubLSymbol $sym0$_SEMANTIC_DNF_HL_FILTERING_ENABLED_;
    private static final SubLSymbol $sym1$_AT_CHECK_FN_SYMBOL__;
    private static final SubLSymbol $sym2$_AT_CHECK_ARG_GENLS__;
    private static final SubLSymbol $sym3$_AT_CHECK_ARG_ISA__;
    private static final SubLSymbol $sym4$_AT_CHECK_ARG_QUOTED_ISA__;
    private static final SubLSymbol $sym5$_AT_CHECK_ARG_NOT_ISA__;
    private static final SubLSymbol $sym6$_AT_CHECK_ARG_TYPES__;
    private static final SubLSymbol $sym7$_AT_POSSIBLY_CHECK_DEFINING_MTS__;
    private static final SubLSymbol $sym8$_AT_CHECK_DEFINING_MTS__;
    private static final SubLSymbol $sym9$_AT_CHECK_INTER_ARG_ISA__;
    private static final SubLSymbol $sym10$_AT_CHECK_INTER_ARG_NOT_ISA__;
    private static final SubLSymbol $sym11$_AT_CHECK_INTER_ARG_GENL__;
    private static final SubLSymbol $sym12$_AT_CHECK_INTER_ARG_NOT_GENL__;
    private static final SubLSymbol $sym13$_AT_CHECK_INTER_ARG_ISA_GENL__;
    private static final SubLSymbol $sym14$_AT_CHECK_INTER_ARG_GENL_ISA__;
    private static final SubLSymbol $sym15$_AT_CHECK_NON_CONSTANT_INTER_ARG_ISA__;
    private static final SubLSymbol $sym16$_AT_CHECK_NON_CONSTANT_INTER_ARG_GENL__;
    private static final SubLSymbol $sym17$_AT_CHECK_NON_CONSTANT_INTER_ARG_FORMAT__;
    private static final SubLSymbol $sym18$_AT_CHECK_NOT_ISA_DISJOINT__;
    private static final SubLSymbol $sym19$_AT_CHECK_NOT_QUOTED_ISA_DISJOINT__;
    private static final SubLSymbol $sym20$_AT_CHECK_NOT_GENLS_DISJOINT__;
    private static final SubLSymbol $sym21$_AT_CHECK_NOT_MDW__;
    private static final SubLSymbol $sym22$_AT_CHECK_NOT_SDC__;
    private static final SubLSymbol $sym23$_AT_CHECK_ARG_FORMAT__;
    private static final SubLSymbol $sym24$_AT_CHECK_RELATOR_CONSTRAINTS__;
    private static final SubLSymbol $sym25$_AT_ENSURE_CONSISTENCY__;
    private static final SubLList $list26;
    private static final SubLSymbol $sym27$_AT_PRED_CONSTRAINTS_;
    private static final SubLSymbol $sym28$_AT_PREDICATE_VIOLATIONS_;
    private static final SubLSymbol $sym29$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX__;
    private static final SubLInteger $int30$100;
    private static final SubLSymbol $sym31$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX_GAF_COUNT_THRESHOLD_;
    private static final SubLSymbol $sym32$_FAG_SEARCH_LIMIT_;
    private static final SubLSymbol $sym33$_AT_GAF_SEARCH_LIMIT_;
    private static final SubLSymbol $sym34$_AT_CHECK_INTER_ARG_FORMAT__;
    private static final SubLSymbol $sym35$_AT_CHECK_INTER_ARG_DIFFERENT__;
    private static final SubLSymbol $sym36$_AT_CHECK_GENL_PREDS__;
    private static final SubLSymbol $sym37$_AT_CHECK_GENL_INVERSES__;
    private static final SubLSymbol $sym38$_AT_INCLUDE_ISA_LITERAL_CONSTRAINTS_;
    private static final SubLSymbol $sym39$_AT_INCLUDE_GENL_LITERAL_CONSTRAINTS_;
    private static final SubLSymbol $sym40$_GATHER_AT_CONSTRAINTS__;
    private static final SubLSymbol $sym41$_GATHER_AT_ASSERTIONS__;
    private static final SubLSymbol $sym42$_GATHER_AT_FORMAT_VIOLATIONS__;
    private static final SubLSymbol $sym43$_GATHER_AT_DIFFERENT_VIOLATIONS__;
    private static final SubLSymbol $sym44$_GATHER_AT_PREDICATE_VIOLATIONS__;
    private static final SubLSymbol $sym45$_AT_FORMAT_VIOLATIONS_;
    private static final SubLSymbol $sym46$_AT_DIFFERENT_VIOLATIONS_;
    private static final SubLSymbol $sym47$_WITHIN_AT_SUGGESTION__;
    private static final SubLSymbol $sym48$_WITHIN_AT_MAPPING__;
    private static final SubLSymbol $sym49$_AT_BREAK_ON_FAILURE__;
    private static final SubLSymbol $sym50$_ACCUMULATING_AT_VIOLATIONS__;
    private static final SubLSymbol $sym51$_NOTING_AT_VIOLATIONS__;
    private static final SubLSymbol $sym52$_AT_TRACE_LEVEL_;
    private static final SubLSymbol $sym53$_AT_TEST_LEVEL_;
    private static final SubLSymbol $sym54$_APPRAISING_DISJUNCT__;
    private static final SubLSymbol $sym55$_WITHIN_DECONTEXTUALIZED__;
    private static final SubLSymbol $sym56$_WITHIN_DISJUNCTION__;
    private static final SubLSymbol $sym57$_WITHIN_CONJUNCTION__;
    private static final SubLSymbol $sym58$_WITHIN_NEGATED_DISJUNCTION__;
    private static final SubLSymbol $sym59$_WITHIN_NEGATED_CONJUNCTION__;
    private static final SubLSymbol $sym60$_WITHIN_FUNCTION__;
    private static final SubLSymbol $sym61$_WITHIN_PREDICATE__;
    private static final SubLSymbol $sym62$_WITHIN_TOU_GAF__;
    private static final SubLSymbol $sym63$_RELAX_ARG_CONSTRAINTS_FOR_DISJUNCTIONS__;
    private static final SubLSymbol $sym64$_AT_RELAX_ARG_CONSTRAINTS_FOR_OPAQUE_EXPANSION_NATS__;
    private static final SubLSymbol $sym65$_AT_ADMIT_CONSISTENT_NAUTS__;
    private static final SubLSymbol $sym66$_AT_ADMIT_CONSISTENT_NARTS__;
    private static final SubLSymbol $sym67$_AT_RESULT_;
    private static final SubLSymbol $sym68$_AT_SOME_ARG_ISA__;
    private static final SubLSymbol $sym69$_AT_SOME_ARG_ISA_REQUIRED__;
    private static final SubLSymbol $sym70$_AT_CONSIDER_MULTIARGS_AT_PRED__;
    private static final SubLInteger $int71$64;
    private static final SubLSymbol $sym72$_AT_ISA_CONSTRAINTS_;
    private static final SubLSymbol $sym73$_AT_GENL_CONSTRAINTS_;
    private static final SubLSymbol $sym74$_AT_FORMAT_CONSTRAINTS_;
    private static final SubLSymbol $sym75$_AT_DIFFERENT_CONSTRAINTS_;
    private static final SubLSymbol $sym76$_AT_ISA_ASSERTIONS_;
    private static final SubLSymbol $sym77$_AT_GENL_ASSERTIONS_;
    private static final SubLSymbol $sym78$_AT_FORMAT_ASSERTIONS_;
    private static final SubLSymbol $sym79$_AT_DIFFERENT_ASSERTIONS_;
    private static final SubLSymbol $sym80$_AT_MODE_;
    private static final SubLSymbol $sym81$_AT_CONSTRAINT_TYPE_;
    private static final SubLSymbol $sym82$_AT_ARG_TYPE_;
    private static final SubLSymbol $sym83$_AT_BASE_FN_;
    private static final SubLSymbol $sym84$_AT_FORMULA_;
    private static final SubLSymbol $sym85$_AT_PRED_;
    private static final SubLSymbol $sym86$_AT_INVERSE_;
    private static final SubLSymbol $sym87$_AT_RELN_;
    private static final SubLSymbol $sym88$_AT_ARG_;
    private static final SubLSymbol $sym89$_AT_ARGNUM_;
    private static final SubLSymbol $sym90$_AT_ARG1_;
    private static final SubLSymbol $sym91$_AT_ARG2_;
    private static final SubLSymbol $sym92$_AT_IND_ARGNUM_;
    private static final SubLSymbol $sym93$_AT_IND_ARG_;
    private static final SubLSymbol $sym94$_AT_IND_ISA_;
    private static final SubLSymbol $sym95$_AT_IND_GENL_;
    private static final SubLSymbol $sym96$_AT_ARG_ISA_;
    private static final SubLSymbol $sym97$_AT_SOURCE_;
    private static final SubLSymbol $sym98$_AT_MAPPING_GENL_INVERSES__;
    private static final SubLSymbol $sym99$_AT_SEARCH_GENL_PREDS__;
    private static final SubLSymbol $sym100$_AT_SEARCH_GENL_INVERSES__;
    private static final SubLSymbol $sym101$_AT_PROFILE_TERM_;
    private static final SubLSymbol $sym102$_AT_CONSTRAINT_GAF_;
    private static final SubLSymbol $sym103$_INCLUDE_AT_CONSTRAINT_GAF__;
    private static final SubLSymbol $sym104$_AT_VAR_ISA_;
    private static final SubLSymbol $sym105$_AT_VAR_GENL_;
    private static final SubLSymbol $kw106$NOT_DISJOINT;
    private static final SubLSymbol $sym107$_AT_VAR_TYPES_STANDARD_;
    private static final SubLSymbol $sym108$_AT_ASSUME_CONJUNCTS_INDEPENDENT__;
    private static final SubLSymbol $sym109$_CURRENT_AT_VIOLATION_;
    private static final SubLSymbol $sym110$_AT_VIOLATIONS_;
    private static final SubLSymbol $sym111$_AT_DISJOINS_SPACE_;
    private static final SubLSymbol $sym112$_AT_ISA_SPACE_;
    private static final SubLSymbol $sym113$_AT_GENLS_SPACE_;
    private static final SubLSymbol $sym114$_AT_DEFNS_AVAILABLE__;
    private static final SubLSymbol $sym115$_AT_APPLY_NECESSARY_DEFNS__;
    private static final SubLSymbol $kw116$DISJOINT;
    private static final SubLSymbol $sym117$_AT_ADDITIONAL_DEFN_CHECKING_;
    private static final SubLSymbol $sym118$_SORT_SUF_DEFN_ASSERTIONS__;
    private static final SubLSymbol $sym119$_SORT_SUF_FUNCTION_ASSERTIONS__;
    private static final SubLSymbol $sym120$_AT_COLLECTION_SPECIFIC_DEFNS_;
    private static final SubLSymbol $sym121$_DEFN_TRACE_LEVEL_;
    private static final SubLSymbol $sym122$_DEFN_TEST_LEVEL_;
    private static final SubLSymbol $sym123$_DEFN_METERS__;
    private static final SubLSymbol $sym124$_DEFN_METER_CACHES_;
    private static final SubLSymbol $sym125$_DEFN_COLLECTION_;
    private static final SubLSymbol $sym126$_PERMITTING_DENOTATIONAL_TERMS_ADMITTED_BY_DEFN_VIA_ISA__;
    private static final SubLSymbol $sym127$CLET;
    private static final SubLList $list128;
    private static final SubLSymbol $sym129$_AT_DEFN_;
    private static final SubLSymbol $sym130$_AT_DEFNS_;
    private static final SubLSymbol $sym131$_AT_FUNCTION_;
    private static final SubLSymbol $sym132$_AT_FUNCTIONS_;
    private static final SubLSymbol $sym133$_DEFN_FN_HISTORY_DEFAULT_SIZE_;
    private static final SubLSymbol $sym134$_DEFN_COL_HISTORY_DEFAULT_SIZE_;
    private static final SubLSymbol $kw135$UNINITIALIZED;
    private static final SubLSymbol $sym136$_DEFN_COL_HISTORY_;
    private static final SubLSymbol $sym137$_QUOTED_DEFN_COL_HISTORY_;
    private static final SubLSymbol $sym138$_DEFN_FN_HISTORY_;
    private static final SubLSymbol $sym139$_QUOTED_DEFN_FN_HISTORY_;
    private static final SubLSymbol $sym140$_DEFN_STACK_;
    private static final SubLSymbol $kw141$DEFAULT;
    private static final SubLSymbol $kw142$NO_DEFINING_MTS;
    private static final SubLSymbol $kw143$NO_ARG_TYPES;
    private static final SubLSymbol $kw144$NO_ARG_FORMAT;
    
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 1230L)
    public static SubLObject at_check_arg_types_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return at_vars.$at_check_arg_typesP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 1469L)
    public static SubLObject at_check_defining_mts_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(at_vars.NIL != at_vars.$at_check_defining_mtsP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_possibly_check_defining_mtsP$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 7296L)
    public static SubLObject within_tou_gafP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return at_vars.$within_tou_gafP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 8773L)
    public static SubLObject at_some_arg_isa_requiredP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return at_vars.$at_some_arg_isa_requiredP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 9127L)
    public static SubLObject consider_multiargs_at_predP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return at_vars.$at_consider_multiargs_at_predP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 12265L)
    public static SubLObject at_searching_genl_predsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return at_vars.$at_search_genl_predsP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 12332L)
    public static SubLObject at_searching_genl_inversesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return at_vars.$at_search_genl_inversesP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 15945L)
    public static SubLObject defn_collection() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return at_vars.$defn_collection$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 16283L)
    public static SubLObject permitting_denotational_terms_admitted_by_defn_via_isaP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 16428L)
    public static SubLObject without_permitting_denotational_terms_admitted_by_defn_via_isaP(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)at_vars.$sym127$CLET, (SubLObject)at_vars.$list128, ConsesLow.append(body, (SubLObject)at_vars.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 18109L)
    public static SubLObject new_at_parameter_state_from_context() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.NIL != default_at_parameter_stateP()) {
            return (SubLObject)at_vars.$kw141$DEFAULT;
        }
        if (at_vars.NIL != no_defining_mts_at_parameter_stateP()) {
            return (SubLObject)at_vars.$kw142$NO_DEFINING_MTS;
        }
        if (at_vars.NIL != no_arg_types_at_parameter_stateP()) {
            return (SubLObject)at_vars.$kw143$NO_ARG_TYPES;
        }
        if (at_vars.NIL != no_arg_format_at_parameter_stateP()) {
            return (SubLObject)at_vars.$kw144$NO_ARG_FORMAT;
        }
        final SubLObject state = (SubLObject)ConsesLow.list(new SubLObject[] { at_vars.$at_check_arg_typesP$.getDynamicValue(thread), at_vars.$at_check_defining_mtsP$.getDynamicValue(thread), at_vars.$at_check_arg_genlsP$.getDynamicValue(thread), at_vars.$at_check_arg_formatP$.getDynamicValue(thread), at_vars.$at_check_arg_isaP$.getDynamicValue(thread), at_vars.$at_check_not_isa_disjointP$.getDynamicValue(thread), at_vars.$at_check_inter_arg_differentP$.getDynamicValue(thread), at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread), at_vars.$at_check_inter_arg_genlP$.getDynamicValue(thread), at_vars.$at_check_inter_arg_formatP$.getDynamicValue(thread), at_vars.$at_check_relator_constraintsP$.getDynamicValue(thread), at_vars.$at_some_arg_isa_requiredP$.getDynamicValue(thread), wff_vars.wff_mode() });
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 19399L)
    public static SubLObject default_at_parameter_stateP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(at_vars.NIL != at_vars.$at_check_arg_typesP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_defining_mtsP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_arg_genlsP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_arg_formatP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_arg_isaP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_not_isa_disjointP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_inter_arg_differentP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread) && at_vars.NIL == at_vars.$at_check_inter_arg_genlP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_inter_arg_formatP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_relator_constraintsP$.getDynamicValue(thread) && at_vars.NIL == at_vars.$at_some_arg_isa_requiredP$.getDynamicValue(thread) && at_vars.NIL != wff_vars.wff_strictP());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 19878L)
    public static SubLObject no_defining_mts_at_parameter_stateP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(at_vars.NIL != at_vars.$at_check_arg_typesP$.getDynamicValue(thread) && at_vars.NIL == at_vars.$at_check_defining_mtsP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_arg_genlsP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_arg_formatP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_arg_isaP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_not_isa_disjointP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_inter_arg_differentP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread) && at_vars.NIL == at_vars.$at_check_inter_arg_genlP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_inter_arg_formatP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_relator_constraintsP$.getDynamicValue(thread) && at_vars.NIL == at_vars.$at_some_arg_isa_requiredP$.getDynamicValue(thread) && at_vars.NIL != wff_vars.wff_strictP());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 20372L)
    public static SubLObject no_arg_types_at_parameter_stateP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(at_vars.NIL == at_vars.$at_check_arg_typesP$.getDynamicValue(thread) && at_vars.NIL == at_vars.$at_check_defining_mtsP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_arg_genlsP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_arg_formatP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_arg_isaP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_not_isa_disjointP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_inter_arg_differentP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread) && at_vars.NIL == at_vars.$at_check_inter_arg_genlP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_inter_arg_formatP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_relator_constraintsP$.getDynamicValue(thread) && at_vars.NIL == at_vars.$at_some_arg_isa_requiredP$.getDynamicValue(thread) && at_vars.NIL != wff_vars.wff_strictP());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/at-vars.lisp", position = 20870L)
    public static SubLObject no_arg_format_at_parameter_stateP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(at_vars.NIL != at_vars.$at_check_arg_typesP$.getDynamicValue(thread) && at_vars.NIL == at_vars.$at_check_defining_mtsP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_arg_genlsP$.getDynamicValue(thread) && at_vars.NIL == at_vars.$at_check_arg_formatP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_arg_isaP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_not_isa_disjointP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_inter_arg_differentP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread) && at_vars.NIL == at_vars.$at_check_inter_arg_genlP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_inter_arg_formatP$.getDynamicValue(thread) && at_vars.NIL != at_vars.$at_check_relator_constraintsP$.getDynamicValue(thread) && at_vars.NIL == at_vars.$at_some_arg_isa_requiredP$.getDynamicValue(thread) && at_vars.NIL != wff_vars.wff_strictP());
    }
    
    public static SubLObject declare_at_vars_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_vars", "at_check_arg_types_p", "AT-CHECK-ARG-TYPES-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_vars", "at_check_defining_mts_p", "AT-CHECK-DEFINING-MTS-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_vars", "within_tou_gafP", "WITHIN-TOU-GAF?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_vars", "at_some_arg_isa_requiredP", "AT-SOME-ARG-ISA-REQUIRED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_vars", "consider_multiargs_at_predP", "CONSIDER-MULTIARGS-AT-PRED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_vars", "at_searching_genl_predsP", "AT-SEARCHING-GENL-PREDS?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_vars", "at_searching_genl_inversesP", "AT-SEARCHING-GENL-INVERSES?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_vars", "defn_collection", "DEFN-COLLECTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_vars", "permitting_denotational_terms_admitted_by_defn_via_isaP", "PERMITTING-DENOTATIONAL-TERMS-ADMITTED-BY-DEFN-VIA-ISA?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.at_vars", "without_permitting_denotational_terms_admitted_by_defn_via_isaP", "WITHOUT-PERMITTING-DENOTATIONAL-TERMS-ADMITTED-BY-DEFN-VIA-ISA?");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_vars", "new_at_parameter_state_from_context", "NEW-AT-PARAMETER-STATE-FROM-CONTEXT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_vars", "default_at_parameter_stateP", "DEFAULT-AT-PARAMETER-STATE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_vars", "no_defining_mts_at_parameter_stateP", "NO-DEFINING-MTS-AT-PARAMETER-STATE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_vars", "no_arg_types_at_parameter_stateP", "NO-ARG-TYPES-AT-PARAMETER-STATE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.at_vars", "no_arg_format_at_parameter_stateP", "NO-ARG-FORMAT-AT-PARAMETER-STATE?", 0, 0, false);
        return (SubLObject)at_vars.NIL;
    }
    
    public static SubLObject init_at_vars_file() {
        at_vars.$semantic_dnf_hl_filtering_enabled$ = SubLFiles.defparameter("*SEMANTIC-DNF-HL-FILTERING-ENABLED*", (SubLObject)at_vars.NIL);
        at_vars.$at_check_fn_symbolP$ = SubLFiles.defparameter("*AT-CHECK-FN-SYMBOL?*", (SubLObject)at_vars.T);
        at_vars.$at_check_arg_genlsP$ = SubLFiles.defparameter("*AT-CHECK-ARG-GENLS?*", (SubLObject)at_vars.T);
        at_vars.$at_check_arg_isaP$ = SubLFiles.defparameter("*AT-CHECK-ARG-ISA?*", (SubLObject)at_vars.T);
        at_vars.$at_check_arg_quoted_isaP$ = SubLFiles.defparameter("*AT-CHECK-ARG-QUOTED-ISA?*", (SubLObject)at_vars.T);
        at_vars.$at_check_arg_not_isaP$ = SubLFiles.defparameter("*AT-CHECK-ARG-NOT-ISA?*", (SubLObject)at_vars.T);
        at_vars.$at_check_arg_typesP$ = SubLFiles.defparameter("*AT-CHECK-ARG-TYPES?*", (SubLObject)at_vars.T);
        at_vars.$at_possibly_check_defining_mtsP$ = SubLFiles.defparameter("*AT-POSSIBLY-CHECK-DEFINING-MTS?*", (SubLObject)at_vars.NIL);
        at_vars.$at_check_defining_mtsP$ = SubLFiles.defparameter("*AT-CHECK-DEFINING-MTS?*", (SubLObject)at_vars.T);
        at_vars.$at_check_inter_arg_isaP$ = SubLFiles.defparameter("*AT-CHECK-INTER-ARG-ISA?*", (SubLObject)at_vars.T);
        at_vars.$at_check_inter_arg_not_isaP$ = SubLFiles.defparameter("*AT-CHECK-INTER-ARG-NOT-ISA?*", (SubLObject)at_vars.T);
        at_vars.$at_check_inter_arg_genlP$ = SubLFiles.defparameter("*AT-CHECK-INTER-ARG-GENL?*", (SubLObject)at_vars.NIL);
        at_vars.$at_check_inter_arg_not_genlP$ = SubLFiles.defparameter("*AT-CHECK-INTER-ARG-NOT-GENL?*", (SubLObject)at_vars.T);
        at_vars.$at_check_inter_arg_isa_genlP$ = SubLFiles.defparameter("*AT-CHECK-INTER-ARG-ISA-GENL?*", (SubLObject)at_vars.T);
        at_vars.$at_check_inter_arg_genl_isaP$ = SubLFiles.defparameter("*AT-CHECK-INTER-ARG-GENL-ISA?*", (SubLObject)at_vars.T);
        at_vars.$at_check_non_constant_inter_arg_isaP$ = SubLFiles.defparameter("*AT-CHECK-NON-CONSTANT-INTER-ARG-ISA?*", (SubLObject)at_vars.T);
        at_vars.$at_check_non_constant_inter_arg_genlP$ = SubLFiles.defparameter("*AT-CHECK-NON-CONSTANT-INTER-ARG-GENL?*", (SubLObject)at_vars.T);
        at_vars.$at_check_non_constant_inter_arg_formatP$ = SubLFiles.defparameter("*AT-CHECK-NON-CONSTANT-INTER-ARG-FORMAT?*", (SubLObject)at_vars.T);
        at_vars.$at_check_not_isa_disjointP$ = SubLFiles.defparameter("*AT-CHECK-NOT-ISA-DISJOINT?*", (SubLObject)at_vars.T);
        at_vars.$at_check_not_quoted_isa_disjointP$ = SubLFiles.defparameter("*AT-CHECK-NOT-QUOTED-ISA-DISJOINT?*", (SubLObject)at_vars.T);
        at_vars.$at_check_not_genls_disjointP$ = SubLFiles.defparameter("*AT-CHECK-NOT-GENLS-DISJOINT?*", (SubLObject)at_vars.T);
        at_vars.$at_check_not_mdwP$ = SubLFiles.defparameter("*AT-CHECK-NOT-MDW?*", (SubLObject)at_vars.T);
        at_vars.$at_check_not_sdcP$ = SubLFiles.defparameter("*AT-CHECK-NOT-SDC?*", (SubLObject)at_vars.T);
        at_vars.$at_check_arg_formatP$ = SubLFiles.defparameter("*AT-CHECK-ARG-FORMAT?*", (SubLObject)at_vars.T);
        at_vars.$at_check_relator_constraintsP$ = SubLFiles.defparameter("*AT-CHECK-RELATOR-CONSTRAINTS?*", (SubLObject)at_vars.T);
        at_vars.$at_ensure_consistencyP$ = SubLFiles.defparameter("*AT-ENSURE-CONSISTENCY?*", (SubLObject)at_vars.NIL);
        at_vars.$at_pred_constraints$ = SubLFiles.defparameter("*AT-PRED-CONSTRAINTS*", (SubLObject)at_vars.$list26);
        at_vars.$at_predicate_violations$ = SubLFiles.defparameter("*AT-PREDICATE-VIOLATIONS*", (SubLObject)at_vars.NIL);
        at_vars.$at_check_inter_assert_format_wXo_arg_indexP$ = SubLFiles.defparameter("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX?*", (SubLObject)at_vars.T);
        at_vars.$at_check_inter_assert_format_wXo_arg_index_gaf_count_threshold$ = SubLFiles.defparameter("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX-GAF-COUNT-THRESHOLD*", (SubLObject)at_vars.$int30$100);
        at_vars.$fag_search_limit$ = SubLFiles.defparameter("*FAG-SEARCH-LIMIT*", (SubLObject)at_vars.NIL);
        at_vars.$at_gaf_search_limit$ = SubLFiles.defparameter("*AT-GAF-SEARCH-LIMIT*", (SubLObject)at_vars.$int30$100);
        at_vars.$at_check_inter_arg_formatP$ = SubLFiles.defparameter("*AT-CHECK-INTER-ARG-FORMAT?*", (SubLObject)at_vars.T);
        at_vars.$at_check_inter_arg_differentP$ = SubLFiles.defparameter("*AT-CHECK-INTER-ARG-DIFFERENT?*", (SubLObject)at_vars.T);
        at_vars.$at_check_genl_predsP$ = SubLFiles.defparameter("*AT-CHECK-GENL-PREDS?*", (SubLObject)at_vars.T);
        at_vars.$at_check_genl_inversesP$ = SubLFiles.defparameter("*AT-CHECK-GENL-INVERSES?*", (SubLObject)at_vars.T);
        at_vars.$at_include_isa_literal_constraints$ = SubLFiles.defparameter("*AT-INCLUDE-ISA-LITERAL-CONSTRAINTS*", (SubLObject)at_vars.T);
        at_vars.$at_include_genl_literal_constraints$ = SubLFiles.defparameter("*AT-INCLUDE-GENL-LITERAL-CONSTRAINTS*", (SubLObject)at_vars.T);
        at_vars.$gather_at_constraintsP$ = SubLFiles.defparameter("*GATHER-AT-CONSTRAINTS?*", (SubLObject)at_vars.NIL);
        at_vars.$gather_at_assertionsP$ = SubLFiles.defparameter("*GATHER-AT-ASSERTIONS?*", (SubLObject)at_vars.NIL);
        at_vars.$gather_at_format_violationsP$ = SubLFiles.defparameter("*GATHER-AT-FORMAT-VIOLATIONS?*", (SubLObject)at_vars.NIL);
        at_vars.$gather_at_different_violationsP$ = SubLFiles.defparameter("*GATHER-AT-DIFFERENT-VIOLATIONS?*", (SubLObject)at_vars.NIL);
        at_vars.$gather_at_predicate_violationsP$ = SubLFiles.defparameter("*GATHER-AT-PREDICATE-VIOLATIONS?*", (SubLObject)at_vars.NIL);
        at_vars.$at_format_violations$ = SubLFiles.defparameter("*AT-FORMAT-VIOLATIONS*", (SubLObject)at_vars.NIL);
        at_vars.$at_different_violations$ = SubLFiles.defparameter("*AT-DIFFERENT-VIOLATIONS*", (SubLObject)at_vars.NIL);
        at_vars.$within_at_suggestionP$ = SubLFiles.defparameter("*WITHIN-AT-SUGGESTION?*", (SubLObject)at_vars.NIL);
        at_vars.$within_at_mappingP$ = SubLFiles.defparameter("*WITHIN-AT-MAPPING?*", (SubLObject)at_vars.NIL);
        at_vars.$at_break_on_failureP$ = SubLFiles.defparameter("*AT-BREAK-ON-FAILURE?*", (SubLObject)at_vars.NIL);
        at_vars.$accumulating_at_violationsP$ = SubLFiles.defparameter("*ACCUMULATING-AT-VIOLATIONS?*", (SubLObject)at_vars.NIL);
        at_vars.$noting_at_violationsP$ = SubLFiles.defparameter("*NOTING-AT-VIOLATIONS?*", (SubLObject)at_vars.NIL);
        at_vars.$at_trace_level$ = SubLFiles.defparameter("*AT-TRACE-LEVEL*", (SubLObject)at_vars.ONE_INTEGER);
        at_vars.$at_test_level$ = SubLFiles.defparameter("*AT-TEST-LEVEL*", (SubLObject)at_vars.THREE_INTEGER);
        at_vars.$appraising_disjunctP$ = SubLFiles.defparameter("*APPRAISING-DISJUNCT?*", (SubLObject)at_vars.NIL);
        at_vars.$within_decontextualizedP$ = SubLFiles.defparameter("*WITHIN-DECONTEXTUALIZED?*", (SubLObject)at_vars.NIL);
        at_vars.$within_disjunctionP$ = SubLFiles.defparameter("*WITHIN-DISJUNCTION?*", (SubLObject)at_vars.NIL);
        at_vars.$within_conjunctionP$ = SubLFiles.defparameter("*WITHIN-CONJUNCTION?*", (SubLObject)at_vars.NIL);
        at_vars.$within_negated_disjunctionP$ = SubLFiles.defparameter("*WITHIN-NEGATED-DISJUNCTION?*", (SubLObject)at_vars.NIL);
        at_vars.$within_negated_conjunctionP$ = SubLFiles.defparameter("*WITHIN-NEGATED-CONJUNCTION?*", (SubLObject)at_vars.NIL);
        at_vars.$within_functionP$ = SubLFiles.defparameter("*WITHIN-FUNCTION?*", (SubLObject)at_vars.NIL);
        at_vars.$within_predicateP$ = SubLFiles.defparameter("*WITHIN-PREDICATE?*", (SubLObject)at_vars.NIL);
        at_vars.$within_tou_gafP$ = SubLFiles.defparameter("*WITHIN-TOU-GAF?*", (SubLObject)at_vars.NIL);
        at_vars.$relax_arg_constraints_for_disjunctionsP$ = SubLFiles.defparameter("*RELAX-ARG-CONSTRAINTS-FOR-DISJUNCTIONS?*", (SubLObject)at_vars.T);
        at_vars.$at_relax_arg_constraints_for_opaque_expansion_natsP$ = SubLFiles.defparameter("*AT-RELAX-ARG-CONSTRAINTS-FOR-OPAQUE-EXPANSION-NATS?*", (SubLObject)at_vars.T);
        at_vars.$at_admit_consistent_nautsP$ = SubLFiles.defparameter("*AT-ADMIT-CONSISTENT-NAUTS?*", (SubLObject)at_vars.T);
        at_vars.$at_admit_consistent_nartsP$ = SubLFiles.defparameter("*AT-ADMIT-CONSISTENT-NARTS?*", (SubLObject)at_vars.NIL);
        at_vars.$at_result$ = SubLFiles.defparameter("*AT-RESULT*", (SubLObject)at_vars.NIL);
        at_vars.$at_some_arg_isaP$ = SubLFiles.defparameter("*AT-SOME-ARG-ISA?*", (SubLObject)at_vars.NIL);
        at_vars.$at_some_arg_isa_requiredP$ = SubLFiles.defparameter("*AT-SOME-ARG-ISA-REQUIRED?*", (SubLObject)at_vars.NIL);
        at_vars.$at_consider_multiargs_at_predP$ = SubLFiles.defparameter("*AT-CONSIDER-MULTIARGS-AT-PRED?*", (SubLObject)at_vars.T);
        at_vars.$at_isa_constraints$ = SubLFiles.defparameter("*AT-ISA-CONSTRAINTS*", Hashtables.make_hash_table((SubLObject)at_vars.$int71$64, (SubLObject)at_vars.UNPROVIDED, (SubLObject)at_vars.UNPROVIDED));
        at_vars.$at_genl_constraints$ = SubLFiles.defparameter("*AT-GENL-CONSTRAINTS*", Hashtables.make_hash_table((SubLObject)at_vars.$int71$64, (SubLObject)at_vars.UNPROVIDED, (SubLObject)at_vars.UNPROVIDED));
        at_vars.$at_format_constraints$ = SubLFiles.defparameter("*AT-FORMAT-CONSTRAINTS*", Hashtables.make_hash_table((SubLObject)at_vars.$int71$64, (SubLObject)at_vars.UNPROVIDED, (SubLObject)at_vars.UNPROVIDED));
        at_vars.$at_different_constraints$ = SubLFiles.defparameter("*AT-DIFFERENT-CONSTRAINTS*", Hashtables.make_hash_table((SubLObject)at_vars.$int71$64, (SubLObject)at_vars.UNPROVIDED, (SubLObject)at_vars.UNPROVIDED));
        at_vars.$at_isa_assertions$ = SubLFiles.defparameter("*AT-ISA-ASSERTIONS*", Hashtables.make_hash_table((SubLObject)at_vars.$int71$64, (SubLObject)at_vars.UNPROVIDED, (SubLObject)at_vars.UNPROVIDED));
        at_vars.$at_genl_assertions$ = SubLFiles.defparameter("*AT-GENL-ASSERTIONS*", Hashtables.make_hash_table((SubLObject)at_vars.$int71$64, (SubLObject)at_vars.UNPROVIDED, (SubLObject)at_vars.UNPROVIDED));
        at_vars.$at_format_assertions$ = SubLFiles.defparameter("*AT-FORMAT-ASSERTIONS*", Hashtables.make_hash_table((SubLObject)at_vars.$int71$64, (SubLObject)at_vars.UNPROVIDED, (SubLObject)at_vars.UNPROVIDED));
        at_vars.$at_different_assertions$ = SubLFiles.defparameter("*AT-DIFFERENT-ASSERTIONS*", Hashtables.make_hash_table((SubLObject)at_vars.$int71$64, (SubLObject)at_vars.UNPROVIDED, (SubLObject)at_vars.UNPROVIDED));
        at_vars.$at_mode$ = SubLFiles.defparameter("*AT-MODE*", (SubLObject)at_vars.NIL);
        at_vars.$at_constraint_type$ = SubLFiles.defparameter("*AT-CONSTRAINT-TYPE*", (SubLObject)at_vars.NIL);
        at_vars.$at_arg_type$ = SubLFiles.defparameter("*AT-ARG-TYPE*", (SubLObject)at_vars.NIL);
        at_vars.$at_base_fn$ = SubLFiles.defparameter("*AT-BASE-FN*", (SubLObject)at_vars.NIL);
        at_vars.$at_formula$ = SubLFiles.defparameter("*AT-FORMULA*", (SubLObject)at_vars.NIL);
        at_vars.$at_pred$ = SubLFiles.defparameter("*AT-PRED*", (SubLObject)at_vars.NIL);
        at_vars.$at_inverse$ = SubLFiles.defparameter("*AT-INVERSE*", (SubLObject)at_vars.NIL);
        at_vars.$at_reln$ = SubLFiles.defparameter("*AT-RELN*", (SubLObject)at_vars.NIL);
        at_vars.$at_arg$ = SubLFiles.defparameter("*AT-ARG*", (SubLObject)at_vars.NIL);
        at_vars.$at_argnum$ = SubLFiles.defparameter("*AT-ARGNUM*", (SubLObject)at_vars.NIL);
        at_vars.$at_arg1$ = SubLFiles.defparameter("*AT-ARG1*", (SubLObject)at_vars.NIL);
        at_vars.$at_arg2$ = SubLFiles.defparameter("*AT-ARG2*", (SubLObject)at_vars.NIL);
        at_vars.$at_ind_argnum$ = SubLFiles.defparameter("*AT-IND-ARGNUM*", (SubLObject)at_vars.NIL);
        at_vars.$at_ind_arg$ = SubLFiles.defparameter("*AT-IND-ARG*", (SubLObject)at_vars.NIL);
        at_vars.$at_ind_isa$ = SubLFiles.defparameter("*AT-IND-ISA*", (SubLObject)at_vars.NIL);
        at_vars.$at_ind_genl$ = SubLFiles.defparameter("*AT-IND-GENL*", (SubLObject)at_vars.NIL);
        at_vars.$at_arg_isa$ = SubLFiles.defparameter("*AT-ARG-ISA*", (SubLObject)at_vars.NIL);
        at_vars.$at_source$ = SubLFiles.defparameter("*AT-SOURCE*", (SubLObject)at_vars.NIL);
        at_vars.$at_mapping_genl_inversesP$ = SubLFiles.defparameter("*AT-MAPPING-GENL-INVERSES?*", (SubLObject)at_vars.NIL);
        at_vars.$at_search_genl_predsP$ = SubLFiles.defparameter("*AT-SEARCH-GENL-PREDS?*", (SubLObject)at_vars.T);
        at_vars.$at_search_genl_inversesP$ = SubLFiles.defparameter("*AT-SEARCH-GENL-INVERSES?*", (SubLObject)at_vars.T);
        at_vars.$at_profile_term$ = SubLFiles.defparameter("*AT-PROFILE-TERM*", (SubLObject)at_vars.NIL);
        at_vars.$at_constraint_gaf$ = SubLFiles.defparameter("*AT-CONSTRAINT-GAF*", (SubLObject)at_vars.NIL);
        at_vars.$include_at_constraint_gafP$ = SubLFiles.defparameter("*INCLUDE-AT-CONSTRAINT-GAF?*", (SubLObject)at_vars.T);
        at_vars.$at_var_isa$ = SubLFiles.defparameter("*AT-VAR-ISA*", (SubLObject)at_vars.NIL);
        at_vars.$at_var_genl$ = SubLFiles.defparameter("*AT-VAR-GENL*", (SubLObject)at_vars.NIL);
        at_vars.$at_var_types_standard$ = SubLFiles.defparameter("*AT-VAR-TYPES-STANDARD*", (SubLObject)at_vars.$kw106$NOT_DISJOINT);
        at_vars.$at_assume_conjuncts_independentP$ = SubLFiles.defparameter("*AT-ASSUME-CONJUNCTS-INDEPENDENT?*", (SubLObject)at_vars.T);
        at_vars.$current_at_violation$ = SubLFiles.defparameter("*CURRENT-AT-VIOLATION*", (SubLObject)at_vars.NIL);
        at_vars.$at_violations$ = SubLFiles.defparameter("*AT-VIOLATIONS*", (SubLObject)at_vars.NIL);
        at_vars.$at_disjoins_space$ = SubLFiles.defparameter("*AT-DISJOINS-SPACE*", (SubLObject)at_vars.NIL);
        at_vars.$at_isa_space$ = SubLFiles.defparameter("*AT-ISA-SPACE*", (SubLObject)at_vars.NIL);
        at_vars.$at_genls_space$ = SubLFiles.defparameter("*AT-GENLS-SPACE*", (SubLObject)at_vars.NIL);
        at_vars.$at_defns_availableP$ = SubLFiles.defparameter("*AT-DEFNS-AVAILABLE?*", (SubLObject)at_vars.T);
        at_vars.$at_apply_necessary_defnsP$ = SubLFiles.defparameter("*AT-APPLY-NECESSARY-DEFNS?*", (SubLObject)at_vars.T);
        at_vars.$at_additional_defn_checking$ = SubLFiles.defparameter("*AT-ADDITIONAL-DEFN-CHECKING*", (SubLObject)at_vars.$kw116$DISJOINT);
        at_vars.$sort_suf_defn_assertionsP$ = SubLFiles.defparameter("*SORT-SUF-DEFN-ASSERTIONS?*", (SubLObject)at_vars.T);
        at_vars.$sort_suf_function_assertionsP$ = SubLFiles.defparameter("*SORT-SUF-FUNCTION-ASSERTIONS?*", (SubLObject)at_vars.NIL);
        at_vars.$at_collection_specific_defns$ = SubLFiles.defvar("*AT-COLLECTION-SPECIFIC-DEFNS*", (SubLObject)at_vars.NIL);
        at_vars.$defn_trace_level$ = SubLFiles.defparameter("*DEFN-TRACE-LEVEL*", (SubLObject)at_vars.ONE_INTEGER);
        at_vars.$defn_test_level$ = SubLFiles.defparameter("*DEFN-TEST-LEVEL*", (SubLObject)at_vars.THREE_INTEGER);
        at_vars.$defn_metersP$ = SubLFiles.defparameter("*DEFN-METERS?*", (SubLObject)at_vars.NIL);
        at_vars.$defn_meter_caches$ = SubLFiles.defparameter("*DEFN-METER-CACHES*", (SubLObject)at_vars.NIL);
        at_vars.$defn_collection$ = SubLFiles.defparameter("*DEFN-COLLECTION*", (SubLObject)at_vars.NIL);
        at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$ = SubLFiles.defparameter("*PERMITTING-DENOTATIONAL-TERMS-ADMITTED-BY-DEFN-VIA-ISA?*", (SubLObject)at_vars.T);
        at_vars.$at_defn$ = SubLFiles.defparameter("*AT-DEFN*", (SubLObject)at_vars.NIL);
        at_vars.$at_defns$ = SubLFiles.defparameter("*AT-DEFNS*", (SubLObject)at_vars.NIL);
        at_vars.$at_function$ = SubLFiles.defparameter("*AT-FUNCTION*", (SubLObject)at_vars.NIL);
        at_vars.$at_functions$ = SubLFiles.defparameter("*AT-FUNCTIONS*", (SubLObject)at_vars.NIL);
        at_vars.$defn_fn_history_default_size$ = SubLFiles.defparameter("*DEFN-FN-HISTORY-DEFAULT-SIZE*", (SubLObject)at_vars.ZERO_INTEGER);
        at_vars.$defn_col_history_default_size$ = SubLFiles.defparameter("*DEFN-COL-HISTORY-DEFAULT-SIZE*", (SubLObject)at_vars.ZERO_INTEGER);
        at_vars.$defn_col_history$ = SubLFiles.defparameter("*DEFN-COL-HISTORY*", (SubLObject)at_vars.$kw135$UNINITIALIZED);
        at_vars.$quoted_defn_col_history$ = SubLFiles.defparameter("*QUOTED-DEFN-COL-HISTORY*", (SubLObject)at_vars.$kw135$UNINITIALIZED);
        at_vars.$defn_fn_history$ = SubLFiles.defparameter("*DEFN-FN-HISTORY*", (SubLObject)at_vars.$kw135$UNINITIALIZED);
        at_vars.$quoted_defn_fn_history$ = SubLFiles.defparameter("*QUOTED-DEFN-FN-HISTORY*", (SubLObject)at_vars.$kw135$UNINITIALIZED);
        at_vars.$defn_stack$ = SubLFiles.defparameter("*DEFN-STACK*", (SubLObject)at_vars.$kw135$UNINITIALIZED);
        return (SubLObject)at_vars.NIL;
    }
    
    public static SubLObject setup_at_vars_file() {
        SubLObject item_var = (SubLObject)at_vars.$sym0$_SEMANTIC_DNF_HL_FILTERING_ENABLED_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym1$_AT_CHECK_FN_SYMBOL__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym2$_AT_CHECK_ARG_GENLS__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym3$_AT_CHECK_ARG_ISA__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym4$_AT_CHECK_ARG_QUOTED_ISA__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym5$_AT_CHECK_ARG_NOT_ISA__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym6$_AT_CHECK_ARG_TYPES__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym7$_AT_POSSIBLY_CHECK_DEFINING_MTS__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym8$_AT_CHECK_DEFINING_MTS__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym9$_AT_CHECK_INTER_ARG_ISA__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym10$_AT_CHECK_INTER_ARG_NOT_ISA__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym11$_AT_CHECK_INTER_ARG_GENL__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym12$_AT_CHECK_INTER_ARG_NOT_GENL__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym13$_AT_CHECK_INTER_ARG_ISA_GENL__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym14$_AT_CHECK_INTER_ARG_GENL_ISA__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym15$_AT_CHECK_NON_CONSTANT_INTER_ARG_ISA__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym16$_AT_CHECK_NON_CONSTANT_INTER_ARG_GENL__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym17$_AT_CHECK_NON_CONSTANT_INTER_ARG_FORMAT__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym18$_AT_CHECK_NOT_ISA_DISJOINT__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym19$_AT_CHECK_NOT_QUOTED_ISA_DISJOINT__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym20$_AT_CHECK_NOT_GENLS_DISJOINT__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym21$_AT_CHECK_NOT_MDW__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym22$_AT_CHECK_NOT_SDC__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym23$_AT_CHECK_ARG_FORMAT__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym24$_AT_CHECK_RELATOR_CONSTRAINTS__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym25$_AT_ENSURE_CONSISTENCY__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym27$_AT_PRED_CONSTRAINTS_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym28$_AT_PREDICATE_VIOLATIONS_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym29$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym31$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX_GAF_COUNT_THRESHOLD_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym32$_FAG_SEARCH_LIMIT_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym33$_AT_GAF_SEARCH_LIMIT_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym34$_AT_CHECK_INTER_ARG_FORMAT__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym35$_AT_CHECK_INTER_ARG_DIFFERENT__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym36$_AT_CHECK_GENL_PREDS__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym37$_AT_CHECK_GENL_INVERSES__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym38$_AT_INCLUDE_ISA_LITERAL_CONSTRAINTS_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym39$_AT_INCLUDE_GENL_LITERAL_CONSTRAINTS_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym40$_GATHER_AT_CONSTRAINTS__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym41$_GATHER_AT_ASSERTIONS__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym42$_GATHER_AT_FORMAT_VIOLATIONS__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym43$_GATHER_AT_DIFFERENT_VIOLATIONS__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym44$_GATHER_AT_PREDICATE_VIOLATIONS__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym45$_AT_FORMAT_VIOLATIONS_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym46$_AT_DIFFERENT_VIOLATIONS_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym47$_WITHIN_AT_SUGGESTION__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym48$_WITHIN_AT_MAPPING__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym49$_AT_BREAK_ON_FAILURE__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym50$_ACCUMULATING_AT_VIOLATIONS__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym51$_NOTING_AT_VIOLATIONS__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym52$_AT_TRACE_LEVEL_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym53$_AT_TEST_LEVEL_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym54$_APPRAISING_DISJUNCT__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym55$_WITHIN_DECONTEXTUALIZED__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym56$_WITHIN_DISJUNCTION__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym57$_WITHIN_CONJUNCTION__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym58$_WITHIN_NEGATED_DISJUNCTION__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym59$_WITHIN_NEGATED_CONJUNCTION__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym60$_WITHIN_FUNCTION__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym61$_WITHIN_PREDICATE__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym62$_WITHIN_TOU_GAF__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym63$_RELAX_ARG_CONSTRAINTS_FOR_DISJUNCTIONS__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym64$_AT_RELAX_ARG_CONSTRAINTS_FOR_OPAQUE_EXPANSION_NATS__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym65$_AT_ADMIT_CONSISTENT_NAUTS__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym66$_AT_ADMIT_CONSISTENT_NARTS__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym67$_AT_RESULT_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym68$_AT_SOME_ARG_ISA__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym69$_AT_SOME_ARG_ISA_REQUIRED__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym70$_AT_CONSIDER_MULTIARGS_AT_PRED__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym72$_AT_ISA_CONSTRAINTS_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym73$_AT_GENL_CONSTRAINTS_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym74$_AT_FORMAT_CONSTRAINTS_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym75$_AT_DIFFERENT_CONSTRAINTS_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym76$_AT_ISA_ASSERTIONS_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym77$_AT_GENL_ASSERTIONS_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym78$_AT_FORMAT_ASSERTIONS_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym79$_AT_DIFFERENT_ASSERTIONS_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym80$_AT_MODE_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym81$_AT_CONSTRAINT_TYPE_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym82$_AT_ARG_TYPE_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym83$_AT_BASE_FN_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym84$_AT_FORMULA_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym85$_AT_PRED_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym86$_AT_INVERSE_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym87$_AT_RELN_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym88$_AT_ARG_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym89$_AT_ARGNUM_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym90$_AT_ARG1_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym91$_AT_ARG2_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym92$_AT_IND_ARGNUM_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym93$_AT_IND_ARG_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym94$_AT_IND_ISA_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym95$_AT_IND_GENL_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym96$_AT_ARG_ISA_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym97$_AT_SOURCE_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym98$_AT_MAPPING_GENL_INVERSES__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym99$_AT_SEARCH_GENL_PREDS__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym100$_AT_SEARCH_GENL_INVERSES__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym101$_AT_PROFILE_TERM_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym102$_AT_CONSTRAINT_GAF_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym103$_INCLUDE_AT_CONSTRAINT_GAF__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym104$_AT_VAR_ISA_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym105$_AT_VAR_GENL_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym107$_AT_VAR_TYPES_STANDARD_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym108$_AT_ASSUME_CONJUNCTS_INDEPENDENT__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym109$_CURRENT_AT_VIOLATION_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym110$_AT_VIOLATIONS_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym111$_AT_DISJOINS_SPACE_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym112$_AT_ISA_SPACE_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym113$_AT_GENLS_SPACE_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$at_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$at_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$at_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym114$_AT_DEFNS_AVAILABLE__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym115$_AT_APPLY_NECESSARY_DEFNS__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym117$_AT_ADDITIONAL_DEFN_CHECKING_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym118$_SORT_SUF_DEFN_ASSERTIONS__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym119$_SORT_SUF_FUNCTION_ASSERTIONS__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym120$_AT_COLLECTION_SPECIFIC_DEFNS_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym121$_DEFN_TRACE_LEVEL_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym122$_DEFN_TEST_LEVEL_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym123$_DEFN_METERS__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym124$_DEFN_METER_CACHES_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym125$_DEFN_COLLECTION_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym126$_PERMITTING_DENOTATIONAL_TERMS_ADMITTED_BY_DEFN_VIA_ISA__;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym129$_AT_DEFN_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym130$_AT_DEFNS_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym131$_AT_FUNCTION_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym132$_AT_FUNCTIONS_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym133$_DEFN_FN_HISTORY_DEFAULT_SIZE_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym134$_DEFN_COL_HISTORY_DEFAULT_SIZE_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym136$_DEFN_COL_HISTORY_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym137$_QUOTED_DEFN_COL_HISTORY_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym138$_DEFN_FN_HISTORY_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym139$_QUOTED_DEFN_FN_HISTORY_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        item_var = (SubLObject)at_vars.$sym140$_DEFN_STACK_;
        if (at_vars.NIL == conses_high.member(item_var, utilities_macros.$defn_state_variables$.getGlobalValue(), Symbols.symbol_function((SubLObject)at_vars.EQL), Symbols.symbol_function((SubLObject)at_vars.IDENTITY))) {
            utilities_macros.$defn_state_variables$.setGlobalValue((SubLObject)ConsesLow.cons(item_var, utilities_macros.$defn_state_variables$.getGlobalValue()));
        }
        return (SubLObject)at_vars.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_at_vars_file();
    }
    
    @Override
	public void initializeVariables() {
        init_at_vars_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_at_vars_file();
    }
    
    static {
        me = (SubLFile)new at_vars();
        at_vars.$semantic_dnf_hl_filtering_enabled$ = null;
        at_vars.$at_check_fn_symbolP$ = null;
        at_vars.$at_check_arg_genlsP$ = null;
        at_vars.$at_check_arg_isaP$ = null;
        at_vars.$at_check_arg_quoted_isaP$ = null;
        at_vars.$at_check_arg_not_isaP$ = null;
        at_vars.$at_check_arg_typesP$ = null;
        at_vars.$at_possibly_check_defining_mtsP$ = null;
        at_vars.$at_check_defining_mtsP$ = null;
        at_vars.$at_check_inter_arg_isaP$ = null;
        at_vars.$at_check_inter_arg_not_isaP$ = null;
        at_vars.$at_check_inter_arg_genlP$ = null;
        at_vars.$at_check_inter_arg_not_genlP$ = null;
        at_vars.$at_check_inter_arg_isa_genlP$ = null;
        at_vars.$at_check_inter_arg_genl_isaP$ = null;
        at_vars.$at_check_non_constant_inter_arg_isaP$ = null;
        at_vars.$at_check_non_constant_inter_arg_genlP$ = null;
        at_vars.$at_check_non_constant_inter_arg_formatP$ = null;
        at_vars.$at_check_not_isa_disjointP$ = null;
        at_vars.$at_check_not_quoted_isa_disjointP$ = null;
        at_vars.$at_check_not_genls_disjointP$ = null;
        at_vars.$at_check_not_mdwP$ = null;
        at_vars.$at_check_not_sdcP$ = null;
        at_vars.$at_check_arg_formatP$ = null;
        at_vars.$at_check_relator_constraintsP$ = null;
        at_vars.$at_ensure_consistencyP$ = null;
        at_vars.$at_pred_constraints$ = null;
        at_vars.$at_predicate_violations$ = null;
        at_vars.$at_check_inter_assert_format_wXo_arg_indexP$ = null;
        at_vars.$at_check_inter_assert_format_wXo_arg_index_gaf_count_threshold$ = null;
        at_vars.$fag_search_limit$ = null;
        at_vars.$at_gaf_search_limit$ = null;
        at_vars.$at_check_inter_arg_formatP$ = null;
        at_vars.$at_check_inter_arg_differentP$ = null;
        at_vars.$at_check_genl_predsP$ = null;
        at_vars.$at_check_genl_inversesP$ = null;
        at_vars.$at_include_isa_literal_constraints$ = null;
        at_vars.$at_include_genl_literal_constraints$ = null;
        at_vars.$gather_at_constraintsP$ = null;
        at_vars.$gather_at_assertionsP$ = null;
        at_vars.$gather_at_format_violationsP$ = null;
        at_vars.$gather_at_different_violationsP$ = null;
        at_vars.$gather_at_predicate_violationsP$ = null;
        at_vars.$at_format_violations$ = null;
        at_vars.$at_different_violations$ = null;
        at_vars.$within_at_suggestionP$ = null;
        at_vars.$within_at_mappingP$ = null;
        at_vars.$at_break_on_failureP$ = null;
        at_vars.$accumulating_at_violationsP$ = null;
        at_vars.$noting_at_violationsP$ = null;
        at_vars.$at_trace_level$ = null;
        at_vars.$at_test_level$ = null;
        at_vars.$appraising_disjunctP$ = null;
        at_vars.$within_decontextualizedP$ = null;
        at_vars.$within_disjunctionP$ = null;
        at_vars.$within_conjunctionP$ = null;
        at_vars.$within_negated_disjunctionP$ = null;
        at_vars.$within_negated_conjunctionP$ = null;
        at_vars.$within_functionP$ = null;
        at_vars.$within_predicateP$ = null;
        at_vars.$within_tou_gafP$ = null;
        at_vars.$relax_arg_constraints_for_disjunctionsP$ = null;
        at_vars.$at_relax_arg_constraints_for_opaque_expansion_natsP$ = null;
        at_vars.$at_admit_consistent_nautsP$ = null;
        at_vars.$at_admit_consistent_nartsP$ = null;
        at_vars.$at_result$ = null;
        at_vars.$at_some_arg_isaP$ = null;
        at_vars.$at_some_arg_isa_requiredP$ = null;
        at_vars.$at_consider_multiargs_at_predP$ = null;
        at_vars.$at_isa_constraints$ = null;
        at_vars.$at_genl_constraints$ = null;
        at_vars.$at_format_constraints$ = null;
        at_vars.$at_different_constraints$ = null;
        at_vars.$at_isa_assertions$ = null;
        at_vars.$at_genl_assertions$ = null;
        at_vars.$at_format_assertions$ = null;
        at_vars.$at_different_assertions$ = null;
        at_vars.$at_mode$ = null;
        at_vars.$at_constraint_type$ = null;
        at_vars.$at_arg_type$ = null;
        at_vars.$at_base_fn$ = null;
        at_vars.$at_formula$ = null;
        at_vars.$at_pred$ = null;
        at_vars.$at_inverse$ = null;
        at_vars.$at_reln$ = null;
        at_vars.$at_arg$ = null;
        at_vars.$at_argnum$ = null;
        at_vars.$at_arg1$ = null;
        at_vars.$at_arg2$ = null;
        at_vars.$at_ind_argnum$ = null;
        at_vars.$at_ind_arg$ = null;
        at_vars.$at_ind_isa$ = null;
        at_vars.$at_ind_genl$ = null;
        at_vars.$at_arg_isa$ = null;
        at_vars.$at_source$ = null;
        at_vars.$at_mapping_genl_inversesP$ = null;
        at_vars.$at_search_genl_predsP$ = null;
        at_vars.$at_search_genl_inversesP$ = null;
        at_vars.$at_profile_term$ = null;
        at_vars.$at_constraint_gaf$ = null;
        at_vars.$include_at_constraint_gafP$ = null;
        at_vars.$at_var_isa$ = null;
        at_vars.$at_var_genl$ = null;
        at_vars.$at_var_types_standard$ = null;
        at_vars.$at_assume_conjuncts_independentP$ = null;
        at_vars.$current_at_violation$ = null;
        at_vars.$at_violations$ = null;
        at_vars.$at_disjoins_space$ = null;
        at_vars.$at_isa_space$ = null;
        at_vars.$at_genls_space$ = null;
        at_vars.$at_defns_availableP$ = null;
        at_vars.$at_apply_necessary_defnsP$ = null;
        at_vars.$at_additional_defn_checking$ = null;
        at_vars.$sort_suf_defn_assertionsP$ = null;
        at_vars.$sort_suf_function_assertionsP$ = null;
        at_vars.$at_collection_specific_defns$ = null;
        at_vars.$defn_trace_level$ = null;
        at_vars.$defn_test_level$ = null;
        at_vars.$defn_metersP$ = null;
        at_vars.$defn_meter_caches$ = null;
        at_vars.$defn_collection$ = null;
        at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$ = null;
        at_vars.$at_defn$ = null;
        at_vars.$at_defns$ = null;
        at_vars.$at_function$ = null;
        at_vars.$at_functions$ = null;
        at_vars.$defn_fn_history_default_size$ = null;
        at_vars.$defn_col_history_default_size$ = null;
        at_vars.$defn_col_history$ = null;
        at_vars.$quoted_defn_col_history$ = null;
        at_vars.$defn_fn_history$ = null;
        at_vars.$quoted_defn_fn_history$ = null;
        at_vars.$defn_stack$ = null;
        $sym0$_SEMANTIC_DNF_HL_FILTERING_ENABLED_ = SubLObjectFactory.makeSymbol("*SEMANTIC-DNF-HL-FILTERING-ENABLED*");
        $sym1$_AT_CHECK_FN_SYMBOL__ = SubLObjectFactory.makeSymbol("*AT-CHECK-FN-SYMBOL?*");
        $sym2$_AT_CHECK_ARG_GENLS__ = SubLObjectFactory.makeSymbol("*AT-CHECK-ARG-GENLS?*");
        $sym3$_AT_CHECK_ARG_ISA__ = SubLObjectFactory.makeSymbol("*AT-CHECK-ARG-ISA?*");
        $sym4$_AT_CHECK_ARG_QUOTED_ISA__ = SubLObjectFactory.makeSymbol("*AT-CHECK-ARG-QUOTED-ISA?*");
        $sym5$_AT_CHECK_ARG_NOT_ISA__ = SubLObjectFactory.makeSymbol("*AT-CHECK-ARG-NOT-ISA?*");
        $sym6$_AT_CHECK_ARG_TYPES__ = SubLObjectFactory.makeSymbol("*AT-CHECK-ARG-TYPES?*");
        $sym7$_AT_POSSIBLY_CHECK_DEFINING_MTS__ = SubLObjectFactory.makeSymbol("*AT-POSSIBLY-CHECK-DEFINING-MTS?*");
        $sym8$_AT_CHECK_DEFINING_MTS__ = SubLObjectFactory.makeSymbol("*AT-CHECK-DEFINING-MTS?*");
        $sym9$_AT_CHECK_INTER_ARG_ISA__ = SubLObjectFactory.makeSymbol("*AT-CHECK-INTER-ARG-ISA?*");
        $sym10$_AT_CHECK_INTER_ARG_NOT_ISA__ = SubLObjectFactory.makeSymbol("*AT-CHECK-INTER-ARG-NOT-ISA?*");
        $sym11$_AT_CHECK_INTER_ARG_GENL__ = SubLObjectFactory.makeSymbol("*AT-CHECK-INTER-ARG-GENL?*");
        $sym12$_AT_CHECK_INTER_ARG_NOT_GENL__ = SubLObjectFactory.makeSymbol("*AT-CHECK-INTER-ARG-NOT-GENL?*");
        $sym13$_AT_CHECK_INTER_ARG_ISA_GENL__ = SubLObjectFactory.makeSymbol("*AT-CHECK-INTER-ARG-ISA-GENL?*");
        $sym14$_AT_CHECK_INTER_ARG_GENL_ISA__ = SubLObjectFactory.makeSymbol("*AT-CHECK-INTER-ARG-GENL-ISA?*");
        $sym15$_AT_CHECK_NON_CONSTANT_INTER_ARG_ISA__ = SubLObjectFactory.makeSymbol("*AT-CHECK-NON-CONSTANT-INTER-ARG-ISA?*");
        $sym16$_AT_CHECK_NON_CONSTANT_INTER_ARG_GENL__ = SubLObjectFactory.makeSymbol("*AT-CHECK-NON-CONSTANT-INTER-ARG-GENL?*");
        $sym17$_AT_CHECK_NON_CONSTANT_INTER_ARG_FORMAT__ = SubLObjectFactory.makeSymbol("*AT-CHECK-NON-CONSTANT-INTER-ARG-FORMAT?*");
        $sym18$_AT_CHECK_NOT_ISA_DISJOINT__ = SubLObjectFactory.makeSymbol("*AT-CHECK-NOT-ISA-DISJOINT?*");
        $sym19$_AT_CHECK_NOT_QUOTED_ISA_DISJOINT__ = SubLObjectFactory.makeSymbol("*AT-CHECK-NOT-QUOTED-ISA-DISJOINT?*");
        $sym20$_AT_CHECK_NOT_GENLS_DISJOINT__ = SubLObjectFactory.makeSymbol("*AT-CHECK-NOT-GENLS-DISJOINT?*");
        $sym21$_AT_CHECK_NOT_MDW__ = SubLObjectFactory.makeSymbol("*AT-CHECK-NOT-MDW?*");
        $sym22$_AT_CHECK_NOT_SDC__ = SubLObjectFactory.makeSymbol("*AT-CHECK-NOT-SDC?*");
        $sym23$_AT_CHECK_ARG_FORMAT__ = SubLObjectFactory.makeSymbol("*AT-CHECK-ARG-FORMAT?*");
        $sym24$_AT_CHECK_RELATOR_CONSTRAINTS__ = SubLObjectFactory.makeSymbol("*AT-CHECK-RELATOR-CONSTRAINTS?*");
        $sym25$_AT_ENSURE_CONSISTENCY__ = SubLObjectFactory.makeSymbol("*AT-ENSURE-CONSISTENCY?*");
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ASYMMETRIC-PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("ANTI-SYMMETRIC-PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("IRREFLEXIVE-PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("ANTI-TRANSITIVE-PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("NEGATION-PREDS"), (SubLObject)SubLObjectFactory.makeKeyword("NEGATION-INVERSES"));
        $sym27$_AT_PRED_CONSTRAINTS_ = SubLObjectFactory.makeSymbol("*AT-PRED-CONSTRAINTS*");
        $sym28$_AT_PREDICATE_VIOLATIONS_ = SubLObjectFactory.makeSymbol("*AT-PREDICATE-VIOLATIONS*");
        $sym29$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX__ = SubLObjectFactory.makeSymbol("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX?*");
        $int30$100 = SubLObjectFactory.makeInteger(100);
        $sym31$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX_GAF_COUNT_THRESHOLD_ = SubLObjectFactory.makeSymbol("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX-GAF-COUNT-THRESHOLD*");
        $sym32$_FAG_SEARCH_LIMIT_ = SubLObjectFactory.makeSymbol("*FAG-SEARCH-LIMIT*");
        $sym33$_AT_GAF_SEARCH_LIMIT_ = SubLObjectFactory.makeSymbol("*AT-GAF-SEARCH-LIMIT*");
        $sym34$_AT_CHECK_INTER_ARG_FORMAT__ = SubLObjectFactory.makeSymbol("*AT-CHECK-INTER-ARG-FORMAT?*");
        $sym35$_AT_CHECK_INTER_ARG_DIFFERENT__ = SubLObjectFactory.makeSymbol("*AT-CHECK-INTER-ARG-DIFFERENT?*");
        $sym36$_AT_CHECK_GENL_PREDS__ = SubLObjectFactory.makeSymbol("*AT-CHECK-GENL-PREDS?*");
        $sym37$_AT_CHECK_GENL_INVERSES__ = SubLObjectFactory.makeSymbol("*AT-CHECK-GENL-INVERSES?*");
        $sym38$_AT_INCLUDE_ISA_LITERAL_CONSTRAINTS_ = SubLObjectFactory.makeSymbol("*AT-INCLUDE-ISA-LITERAL-CONSTRAINTS*");
        $sym39$_AT_INCLUDE_GENL_LITERAL_CONSTRAINTS_ = SubLObjectFactory.makeSymbol("*AT-INCLUDE-GENL-LITERAL-CONSTRAINTS*");
        $sym40$_GATHER_AT_CONSTRAINTS__ = SubLObjectFactory.makeSymbol("*GATHER-AT-CONSTRAINTS?*");
        $sym41$_GATHER_AT_ASSERTIONS__ = SubLObjectFactory.makeSymbol("*GATHER-AT-ASSERTIONS?*");
        $sym42$_GATHER_AT_FORMAT_VIOLATIONS__ = SubLObjectFactory.makeSymbol("*GATHER-AT-FORMAT-VIOLATIONS?*");
        $sym43$_GATHER_AT_DIFFERENT_VIOLATIONS__ = SubLObjectFactory.makeSymbol("*GATHER-AT-DIFFERENT-VIOLATIONS?*");
        $sym44$_GATHER_AT_PREDICATE_VIOLATIONS__ = SubLObjectFactory.makeSymbol("*GATHER-AT-PREDICATE-VIOLATIONS?*");
        $sym45$_AT_FORMAT_VIOLATIONS_ = SubLObjectFactory.makeSymbol("*AT-FORMAT-VIOLATIONS*");
        $sym46$_AT_DIFFERENT_VIOLATIONS_ = SubLObjectFactory.makeSymbol("*AT-DIFFERENT-VIOLATIONS*");
        $sym47$_WITHIN_AT_SUGGESTION__ = SubLObjectFactory.makeSymbol("*WITHIN-AT-SUGGESTION?*");
        $sym48$_WITHIN_AT_MAPPING__ = SubLObjectFactory.makeSymbol("*WITHIN-AT-MAPPING?*");
        $sym49$_AT_BREAK_ON_FAILURE__ = SubLObjectFactory.makeSymbol("*AT-BREAK-ON-FAILURE?*");
        $sym50$_ACCUMULATING_AT_VIOLATIONS__ = SubLObjectFactory.makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*");
        $sym51$_NOTING_AT_VIOLATIONS__ = SubLObjectFactory.makeSymbol("*NOTING-AT-VIOLATIONS?*");
        $sym52$_AT_TRACE_LEVEL_ = SubLObjectFactory.makeSymbol("*AT-TRACE-LEVEL*");
        $sym53$_AT_TEST_LEVEL_ = SubLObjectFactory.makeSymbol("*AT-TEST-LEVEL*");
        $sym54$_APPRAISING_DISJUNCT__ = SubLObjectFactory.makeSymbol("*APPRAISING-DISJUNCT?*");
        $sym55$_WITHIN_DECONTEXTUALIZED__ = SubLObjectFactory.makeSymbol("*WITHIN-DECONTEXTUALIZED?*");
        $sym56$_WITHIN_DISJUNCTION__ = SubLObjectFactory.makeSymbol("*WITHIN-DISJUNCTION?*");
        $sym57$_WITHIN_CONJUNCTION__ = SubLObjectFactory.makeSymbol("*WITHIN-CONJUNCTION?*");
        $sym58$_WITHIN_NEGATED_DISJUNCTION__ = SubLObjectFactory.makeSymbol("*WITHIN-NEGATED-DISJUNCTION?*");
        $sym59$_WITHIN_NEGATED_CONJUNCTION__ = SubLObjectFactory.makeSymbol("*WITHIN-NEGATED-CONJUNCTION?*");
        $sym60$_WITHIN_FUNCTION__ = SubLObjectFactory.makeSymbol("*WITHIN-FUNCTION?*");
        $sym61$_WITHIN_PREDICATE__ = SubLObjectFactory.makeSymbol("*WITHIN-PREDICATE?*");
        $sym62$_WITHIN_TOU_GAF__ = SubLObjectFactory.makeSymbol("*WITHIN-TOU-GAF?*");
        $sym63$_RELAX_ARG_CONSTRAINTS_FOR_DISJUNCTIONS__ = SubLObjectFactory.makeSymbol("*RELAX-ARG-CONSTRAINTS-FOR-DISJUNCTIONS?*");
        $sym64$_AT_RELAX_ARG_CONSTRAINTS_FOR_OPAQUE_EXPANSION_NATS__ = SubLObjectFactory.makeSymbol("*AT-RELAX-ARG-CONSTRAINTS-FOR-OPAQUE-EXPANSION-NATS?*");
        $sym65$_AT_ADMIT_CONSISTENT_NAUTS__ = SubLObjectFactory.makeSymbol("*AT-ADMIT-CONSISTENT-NAUTS?*");
        $sym66$_AT_ADMIT_CONSISTENT_NARTS__ = SubLObjectFactory.makeSymbol("*AT-ADMIT-CONSISTENT-NARTS?*");
        $sym67$_AT_RESULT_ = SubLObjectFactory.makeSymbol("*AT-RESULT*");
        $sym68$_AT_SOME_ARG_ISA__ = SubLObjectFactory.makeSymbol("*AT-SOME-ARG-ISA?*");
        $sym69$_AT_SOME_ARG_ISA_REQUIRED__ = SubLObjectFactory.makeSymbol("*AT-SOME-ARG-ISA-REQUIRED?*");
        $sym70$_AT_CONSIDER_MULTIARGS_AT_PRED__ = SubLObjectFactory.makeSymbol("*AT-CONSIDER-MULTIARGS-AT-PRED?*");
        $int71$64 = SubLObjectFactory.makeInteger(64);
        $sym72$_AT_ISA_CONSTRAINTS_ = SubLObjectFactory.makeSymbol("*AT-ISA-CONSTRAINTS*");
        $sym73$_AT_GENL_CONSTRAINTS_ = SubLObjectFactory.makeSymbol("*AT-GENL-CONSTRAINTS*");
        $sym74$_AT_FORMAT_CONSTRAINTS_ = SubLObjectFactory.makeSymbol("*AT-FORMAT-CONSTRAINTS*");
        $sym75$_AT_DIFFERENT_CONSTRAINTS_ = SubLObjectFactory.makeSymbol("*AT-DIFFERENT-CONSTRAINTS*");
        $sym76$_AT_ISA_ASSERTIONS_ = SubLObjectFactory.makeSymbol("*AT-ISA-ASSERTIONS*");
        $sym77$_AT_GENL_ASSERTIONS_ = SubLObjectFactory.makeSymbol("*AT-GENL-ASSERTIONS*");
        $sym78$_AT_FORMAT_ASSERTIONS_ = SubLObjectFactory.makeSymbol("*AT-FORMAT-ASSERTIONS*");
        $sym79$_AT_DIFFERENT_ASSERTIONS_ = SubLObjectFactory.makeSymbol("*AT-DIFFERENT-ASSERTIONS*");
        $sym80$_AT_MODE_ = SubLObjectFactory.makeSymbol("*AT-MODE*");
        $sym81$_AT_CONSTRAINT_TYPE_ = SubLObjectFactory.makeSymbol("*AT-CONSTRAINT-TYPE*");
        $sym82$_AT_ARG_TYPE_ = SubLObjectFactory.makeSymbol("*AT-ARG-TYPE*");
        $sym83$_AT_BASE_FN_ = SubLObjectFactory.makeSymbol("*AT-BASE-FN*");
        $sym84$_AT_FORMULA_ = SubLObjectFactory.makeSymbol("*AT-FORMULA*");
        $sym85$_AT_PRED_ = SubLObjectFactory.makeSymbol("*AT-PRED*");
        $sym86$_AT_INVERSE_ = SubLObjectFactory.makeSymbol("*AT-INVERSE*");
        $sym87$_AT_RELN_ = SubLObjectFactory.makeSymbol("*AT-RELN*");
        $sym88$_AT_ARG_ = SubLObjectFactory.makeSymbol("*AT-ARG*");
        $sym89$_AT_ARGNUM_ = SubLObjectFactory.makeSymbol("*AT-ARGNUM*");
        $sym90$_AT_ARG1_ = SubLObjectFactory.makeSymbol("*AT-ARG1*");
        $sym91$_AT_ARG2_ = SubLObjectFactory.makeSymbol("*AT-ARG2*");
        $sym92$_AT_IND_ARGNUM_ = SubLObjectFactory.makeSymbol("*AT-IND-ARGNUM*");
        $sym93$_AT_IND_ARG_ = SubLObjectFactory.makeSymbol("*AT-IND-ARG*");
        $sym94$_AT_IND_ISA_ = SubLObjectFactory.makeSymbol("*AT-IND-ISA*");
        $sym95$_AT_IND_GENL_ = SubLObjectFactory.makeSymbol("*AT-IND-GENL*");
        $sym96$_AT_ARG_ISA_ = SubLObjectFactory.makeSymbol("*AT-ARG-ISA*");
        $sym97$_AT_SOURCE_ = SubLObjectFactory.makeSymbol("*AT-SOURCE*");
        $sym98$_AT_MAPPING_GENL_INVERSES__ = SubLObjectFactory.makeSymbol("*AT-MAPPING-GENL-INVERSES?*");
        $sym99$_AT_SEARCH_GENL_PREDS__ = SubLObjectFactory.makeSymbol("*AT-SEARCH-GENL-PREDS?*");
        $sym100$_AT_SEARCH_GENL_INVERSES__ = SubLObjectFactory.makeSymbol("*AT-SEARCH-GENL-INVERSES?*");
        $sym101$_AT_PROFILE_TERM_ = SubLObjectFactory.makeSymbol("*AT-PROFILE-TERM*");
        $sym102$_AT_CONSTRAINT_GAF_ = SubLObjectFactory.makeSymbol("*AT-CONSTRAINT-GAF*");
        $sym103$_INCLUDE_AT_CONSTRAINT_GAF__ = SubLObjectFactory.makeSymbol("*INCLUDE-AT-CONSTRAINT-GAF?*");
        $sym104$_AT_VAR_ISA_ = SubLObjectFactory.makeSymbol("*AT-VAR-ISA*");
        $sym105$_AT_VAR_GENL_ = SubLObjectFactory.makeSymbol("*AT-VAR-GENL*");
        $kw106$NOT_DISJOINT = SubLObjectFactory.makeKeyword("NOT-DISJOINT");
        $sym107$_AT_VAR_TYPES_STANDARD_ = SubLObjectFactory.makeSymbol("*AT-VAR-TYPES-STANDARD*");
        $sym108$_AT_ASSUME_CONJUNCTS_INDEPENDENT__ = SubLObjectFactory.makeSymbol("*AT-ASSUME-CONJUNCTS-INDEPENDENT?*");
        $sym109$_CURRENT_AT_VIOLATION_ = SubLObjectFactory.makeSymbol("*CURRENT-AT-VIOLATION*");
        $sym110$_AT_VIOLATIONS_ = SubLObjectFactory.makeSymbol("*AT-VIOLATIONS*");
        $sym111$_AT_DISJOINS_SPACE_ = SubLObjectFactory.makeSymbol("*AT-DISJOINS-SPACE*");
        $sym112$_AT_ISA_SPACE_ = SubLObjectFactory.makeSymbol("*AT-ISA-SPACE*");
        $sym113$_AT_GENLS_SPACE_ = SubLObjectFactory.makeSymbol("*AT-GENLS-SPACE*");
        $sym114$_AT_DEFNS_AVAILABLE__ = SubLObjectFactory.makeSymbol("*AT-DEFNS-AVAILABLE?*");
        $sym115$_AT_APPLY_NECESSARY_DEFNS__ = SubLObjectFactory.makeSymbol("*AT-APPLY-NECESSARY-DEFNS?*");
        $kw116$DISJOINT = SubLObjectFactory.makeKeyword("DISJOINT");
        $sym117$_AT_ADDITIONAL_DEFN_CHECKING_ = SubLObjectFactory.makeSymbol("*AT-ADDITIONAL-DEFN-CHECKING*");
        $sym118$_SORT_SUF_DEFN_ASSERTIONS__ = SubLObjectFactory.makeSymbol("*SORT-SUF-DEFN-ASSERTIONS?*");
        $sym119$_SORT_SUF_FUNCTION_ASSERTIONS__ = SubLObjectFactory.makeSymbol("*SORT-SUF-FUNCTION-ASSERTIONS?*");
        $sym120$_AT_COLLECTION_SPECIFIC_DEFNS_ = SubLObjectFactory.makeSymbol("*AT-COLLECTION-SPECIFIC-DEFNS*");
        $sym121$_DEFN_TRACE_LEVEL_ = SubLObjectFactory.makeSymbol("*DEFN-TRACE-LEVEL*");
        $sym122$_DEFN_TEST_LEVEL_ = SubLObjectFactory.makeSymbol("*DEFN-TEST-LEVEL*");
        $sym123$_DEFN_METERS__ = SubLObjectFactory.makeSymbol("*DEFN-METERS?*");
        $sym124$_DEFN_METER_CACHES_ = SubLObjectFactory.makeSymbol("*DEFN-METER-CACHES*");
        $sym125$_DEFN_COLLECTION_ = SubLObjectFactory.makeSymbol("*DEFN-COLLECTION*");
        $sym126$_PERMITTING_DENOTATIONAL_TERMS_ADMITTED_BY_DEFN_VIA_ISA__ = SubLObjectFactory.makeSymbol("*PERMITTING-DENOTATIONAL-TERMS-ADMITTED-BY-DEFN-VIA-ISA?*");
        $sym127$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list128 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PERMITTING-DENOTATIONAL-TERMS-ADMITTED-BY-DEFN-VIA-ISA?*"), (SubLObject)at_vars.NIL));
        $sym129$_AT_DEFN_ = SubLObjectFactory.makeSymbol("*AT-DEFN*");
        $sym130$_AT_DEFNS_ = SubLObjectFactory.makeSymbol("*AT-DEFNS*");
        $sym131$_AT_FUNCTION_ = SubLObjectFactory.makeSymbol("*AT-FUNCTION*");
        $sym132$_AT_FUNCTIONS_ = SubLObjectFactory.makeSymbol("*AT-FUNCTIONS*");
        $sym133$_DEFN_FN_HISTORY_DEFAULT_SIZE_ = SubLObjectFactory.makeSymbol("*DEFN-FN-HISTORY-DEFAULT-SIZE*");
        $sym134$_DEFN_COL_HISTORY_DEFAULT_SIZE_ = SubLObjectFactory.makeSymbol("*DEFN-COL-HISTORY-DEFAULT-SIZE*");
        $kw135$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym136$_DEFN_COL_HISTORY_ = SubLObjectFactory.makeSymbol("*DEFN-COL-HISTORY*");
        $sym137$_QUOTED_DEFN_COL_HISTORY_ = SubLObjectFactory.makeSymbol("*QUOTED-DEFN-COL-HISTORY*");
        $sym138$_DEFN_FN_HISTORY_ = SubLObjectFactory.makeSymbol("*DEFN-FN-HISTORY*");
        $sym139$_QUOTED_DEFN_FN_HISTORY_ = SubLObjectFactory.makeSymbol("*QUOTED-DEFN-FN-HISTORY*");
        $sym140$_DEFN_STACK_ = SubLObjectFactory.makeSymbol("*DEFN-STACK*");
        $kw141$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw142$NO_DEFINING_MTS = SubLObjectFactory.makeKeyword("NO-DEFINING-MTS");
        $kw143$NO_ARG_TYPES = SubLObjectFactory.makeKeyword("NO-ARG-TYPES");
        $kw144$NO_ARG_FORMAT = SubLObjectFactory.makeKeyword("NO-ARG-FORMAT");
    }
}

/*

	Total time: 677 ms
	
*/