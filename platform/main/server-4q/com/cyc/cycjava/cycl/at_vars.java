package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.utilities_macros.$at_state_variables$;
import static com.cyc.cycjava.cycl.utilities_macros.$defn_state_variables$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class at_vars extends SubLTranslatedFile {
    public static final SubLFile me = new at_vars();

    public static final String myName = "com.cyc.cycjava.cycl.at_vars";

    public static final String myFingerPrint = "fe354a75746d4cc1951231c34a319bef6992a6867c391aed7c023e71d4595335";



    // defparameter
    public static final SubLSymbol $at_check_fn_symbolP$ = makeSymbol("*AT-CHECK-FN-SYMBOL?*");

    // defparameter
    public static final SubLSymbol $at_check_arg_genlsP$ = makeSymbol("*AT-CHECK-ARG-GENLS?*");

    // defparameter
    public static final SubLSymbol $at_check_arg_isaP$ = makeSymbol("*AT-CHECK-ARG-ISA?*");

    // defparameter
    public static final SubLSymbol $at_check_arg_quoted_isaP$ = makeSymbol("*AT-CHECK-ARG-QUOTED-ISA?*");

    // defparameter
    public static final SubLSymbol $at_check_arg_not_isaP$ = makeSymbol("*AT-CHECK-ARG-NOT-ISA?*");

    // defparameter
    public static final SubLSymbol $at_check_arg_typesP$ = makeSymbol("*AT-CHECK-ARG-TYPES?*");

    // defparameter
    public static final SubLSymbol $at_possibly_check_defining_mtsP$ = makeSymbol("*AT-POSSIBLY-CHECK-DEFINING-MTS?*");

    // defparameter
    public static final SubLSymbol $at_check_defining_mtsP$ = makeSymbol("*AT-CHECK-DEFINING-MTS?*");

    // defparameter
    public static final SubLSymbol $at_check_inter_arg_isaP$ = makeSymbol("*AT-CHECK-INTER-ARG-ISA?*");

    // defparameter
    public static final SubLSymbol $at_check_inter_arg_not_isaP$ = makeSymbol("*AT-CHECK-INTER-ARG-NOT-ISA?*");

    // defparameter
    public static final SubLSymbol $at_check_inter_arg_genlP$ = makeSymbol("*AT-CHECK-INTER-ARG-GENL?*");

    // defparameter
    public static final SubLSymbol $at_check_inter_arg_not_genlP$ = makeSymbol("*AT-CHECK-INTER-ARG-NOT-GENL?*");

    // defparameter
    public static final SubLSymbol $at_check_inter_arg_isa_genlP$ = makeSymbol("*AT-CHECK-INTER-ARG-ISA-GENL?*");

    // defparameter
    public static final SubLSymbol $at_check_inter_arg_genl_isaP$ = makeSymbol("*AT-CHECK-INTER-ARG-GENL-ISA?*");

    // defparameter
    public static final SubLSymbol $at_check_non_constant_inter_arg_isaP$ = makeSymbol("*AT-CHECK-NON-CONSTANT-INTER-ARG-ISA?*");

    // defparameter
    public static final SubLSymbol $at_check_non_constant_inter_arg_genlP$ = makeSymbol("*AT-CHECK-NON-CONSTANT-INTER-ARG-GENL?*");

    // defparameter
    public static final SubLSymbol $at_check_non_constant_inter_arg_formatP$ = makeSymbol("*AT-CHECK-NON-CONSTANT-INTER-ARG-FORMAT?*");

    // defparameter
    public static final SubLSymbol $at_check_not_isa_disjointP$ = makeSymbol("*AT-CHECK-NOT-ISA-DISJOINT?*");

    // defparameter
    public static final SubLSymbol $at_check_not_quoted_isa_disjointP$ = makeSymbol("*AT-CHECK-NOT-QUOTED-ISA-DISJOINT?*");

    // defparameter
    public static final SubLSymbol $at_check_not_genls_disjointP$ = makeSymbol("*AT-CHECK-NOT-GENLS-DISJOINT?*");

    // defparameter
    public static final SubLSymbol $at_check_not_mdwP$ = makeSymbol("*AT-CHECK-NOT-MDW?*");

    // defparameter
    public static final SubLSymbol $at_check_not_sdcP$ = makeSymbol("*AT-CHECK-NOT-SDC?*");

    // defparameter
    public static final SubLSymbol $at_check_arg_formatP$ = makeSymbol("*AT-CHECK-ARG-FORMAT?*");

    // defparameter
    public static final SubLSymbol $at_check_relator_constraintsP$ = makeSymbol("*AT-CHECK-RELATOR-CONSTRAINTS?*");

    // defparameter
    public static final SubLSymbol $at_ensure_consistencyP$ = makeSymbol("*AT-ENSURE-CONSISTENCY?*");





    // defparameter
    public static final SubLSymbol $at_check_inter_assert_format_wXo_arg_indexP$ = makeSymbol("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX?*");

    // defparameter
    public static final SubLSymbol $at_check_inter_assert_format_wXo_arg_index_gaf_count_threshold$ = makeSymbol("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX-GAF-COUNT-THRESHOLD*");





    // defparameter
    public static final SubLSymbol $at_check_inter_arg_formatP$ = makeSymbol("*AT-CHECK-INTER-ARG-FORMAT?*");

    // defparameter
    public static final SubLSymbol $at_check_inter_arg_differentP$ = makeSymbol("*AT-CHECK-INTER-ARG-DIFFERENT?*");

    // defparameter
    public static final SubLSymbol $at_check_genl_predsP$ = makeSymbol("*AT-CHECK-GENL-PREDS?*");

    // defparameter
    public static final SubLSymbol $at_check_genl_inversesP$ = makeSymbol("*AT-CHECK-GENL-INVERSES?*");





    // defparameter
    public static final SubLSymbol $gather_at_constraintsP$ = makeSymbol("*GATHER-AT-CONSTRAINTS?*");

    // defparameter
    public static final SubLSymbol $gather_at_assertionsP$ = makeSymbol("*GATHER-AT-ASSERTIONS?*");

    // defparameter
    public static final SubLSymbol $gather_at_format_violationsP$ = makeSymbol("*GATHER-AT-FORMAT-VIOLATIONS?*");

    // defparameter
    public static final SubLSymbol $gather_at_different_violationsP$ = makeSymbol("*GATHER-AT-DIFFERENT-VIOLATIONS?*");

    // defparameter
    public static final SubLSymbol $gather_at_predicate_violationsP$ = makeSymbol("*GATHER-AT-PREDICATE-VIOLATIONS?*");





    // defparameter
    public static final SubLSymbol $within_at_suggestionP$ = makeSymbol("*WITHIN-AT-SUGGESTION?*");

    // defparameter
    public static final SubLSymbol $within_at_mappingP$ = makeSymbol("*WITHIN-AT-MAPPING?*");

    // defparameter
    public static final SubLSymbol $at_break_on_failureP$ = makeSymbol("*AT-BREAK-ON-FAILURE?*");

    // defparameter
    public static final SubLSymbol $accumulating_at_violationsP$ = makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*");

    // defparameter
    public static final SubLSymbol $noting_at_violationsP$ = makeSymbol("*NOTING-AT-VIOLATIONS?*");





    // defparameter
    public static final SubLSymbol $appraising_disjunctP$ = makeSymbol("*APPRAISING-DISJUNCT?*");

    // defparameter
    public static final SubLSymbol $within_decontextualizedP$ = makeSymbol("*WITHIN-DECONTEXTUALIZED?*");

    // defparameter
    public static final SubLSymbol $within_disjunctionP$ = makeSymbol("*WITHIN-DISJUNCTION?*");

    // defparameter
    public static final SubLSymbol $within_conjunctionP$ = makeSymbol("*WITHIN-CONJUNCTION?*");

    // defparameter
    public static final SubLSymbol $within_negated_disjunctionP$ = makeSymbol("*WITHIN-NEGATED-DISJUNCTION?*");

    // defparameter
    public static final SubLSymbol $within_negated_conjunctionP$ = makeSymbol("*WITHIN-NEGATED-CONJUNCTION?*");

    // defparameter
    public static final SubLSymbol $within_functionP$ = makeSymbol("*WITHIN-FUNCTION?*");

    // defparameter
    public static final SubLSymbol $within_predicateP$ = makeSymbol("*WITHIN-PREDICATE?*");

    // defparameter
    public static final SubLSymbol $within_tou_gafP$ = makeSymbol("*WITHIN-TOU-GAF?*");

    // defparameter
    public static final SubLSymbol $relax_arg_constraints_for_disjunctionsP$ = makeSymbol("*RELAX-ARG-CONSTRAINTS-FOR-DISJUNCTIONS?*");

    // defparameter
    public static final SubLSymbol $at_relax_arg_constraints_for_opaque_expansion_natsP$ = makeSymbol("*AT-RELAX-ARG-CONSTRAINTS-FOR-OPAQUE-EXPANSION-NATS?*");

    // defparameter
    public static final SubLSymbol $at_admit_consistent_nautsP$ = makeSymbol("*AT-ADMIT-CONSISTENT-NAUTS?*");

    // defparameter
    public static final SubLSymbol $at_admit_consistent_nartsP$ = makeSymbol("*AT-ADMIT-CONSISTENT-NARTS?*");



    // defparameter
    public static final SubLSymbol $at_some_arg_isaP$ = makeSymbol("*AT-SOME-ARG-ISA?*");

    // defparameter
    public static final SubLSymbol $at_some_arg_isa_requiredP$ = makeSymbol("*AT-SOME-ARG-ISA-REQUIRED?*");

    // defparameter
    public static final SubLSymbol $at_consider_multiargs_at_predP$ = makeSymbol("*AT-CONSIDER-MULTIARGS-AT-PRED?*");





































    // defparameter
    public static final SubLSymbol $at_arg1$ = makeSymbol("*AT-ARG1*");

    // defparameter
    public static final SubLSymbol $at_arg2$ = makeSymbol("*AT-ARG2*");













    // defparameter
    public static final SubLSymbol $at_mapping_genl_inversesP$ = makeSymbol("*AT-MAPPING-GENL-INVERSES?*");

    // defparameter
    public static final SubLSymbol $at_search_genl_predsP$ = makeSymbol("*AT-SEARCH-GENL-PREDS?*");

    // defparameter
    public static final SubLSymbol $at_search_genl_inversesP$ = makeSymbol("*AT-SEARCH-GENL-INVERSES?*");





    // defparameter
    public static final SubLSymbol $include_at_constraint_gafP$ = makeSymbol("*INCLUDE-AT-CONSTRAINT-GAF?*");







    // defparameter
    public static final SubLSymbol $at_assume_conjuncts_independentP$ = makeSymbol("*AT-ASSUME-CONJUNCTS-INDEPENDENT?*");











    // defparameter
    public static final SubLSymbol $at_defns_availableP$ = makeSymbol("*AT-DEFNS-AVAILABLE?*");

    // defparameter
    public static final SubLSymbol $at_apply_necessary_defnsP$ = makeSymbol("*AT-APPLY-NECESSARY-DEFNS?*");



    // defparameter
    public static final SubLSymbol $sort_suf_defn_assertionsP$ = makeSymbol("*SORT-SUF-DEFN-ASSERTIONS?*");

    // defparameter
    public static final SubLSymbol $sort_suf_function_assertionsP$ = makeSymbol("*SORT-SUF-FUNCTION-ASSERTIONS?*");







    // defparameter
    public static final SubLSymbol $defn_metersP$ = makeSymbol("*DEFN-METERS?*");





    // defparameter
    public static final SubLSymbol $permitting_denotational_terms_admitted_by_defn_via_isaP$ = makeSymbol("*PERMITTING-DENOTATIONAL-TERMS-ADMITTED-BY-DEFN-VIA-ISA?*");























    // Internal Constants
    public static final SubLSymbol $semantic_dnf_hl_filtering_enabled$ = makeSymbol("*SEMANTIC-DNF-HL-FILTERING-ENABLED*");

    private static final SubLSymbol $sym1$_AT_CHECK_FN_SYMBOL__ = makeSymbol("*AT-CHECK-FN-SYMBOL?*");

    private static final SubLSymbol $sym2$_AT_CHECK_ARG_GENLS__ = makeSymbol("*AT-CHECK-ARG-GENLS?*");

    private static final SubLSymbol $sym3$_AT_CHECK_ARG_ISA__ = makeSymbol("*AT-CHECK-ARG-ISA?*");

    private static final SubLSymbol $sym4$_AT_CHECK_ARG_QUOTED_ISA__ = makeSymbol("*AT-CHECK-ARG-QUOTED-ISA?*");

    private static final SubLSymbol $sym5$_AT_CHECK_ARG_NOT_ISA__ = makeSymbol("*AT-CHECK-ARG-NOT-ISA?*");

    private static final SubLSymbol $sym6$_AT_CHECK_ARG_TYPES__ = makeSymbol("*AT-CHECK-ARG-TYPES?*");

    private static final SubLSymbol $sym7$_AT_POSSIBLY_CHECK_DEFINING_MTS__ = makeSymbol("*AT-POSSIBLY-CHECK-DEFINING-MTS?*");

    private static final SubLSymbol $sym8$_AT_CHECK_DEFINING_MTS__ = makeSymbol("*AT-CHECK-DEFINING-MTS?*");

    private static final SubLSymbol $sym9$_AT_CHECK_INTER_ARG_ISA__ = makeSymbol("*AT-CHECK-INTER-ARG-ISA?*");

    private static final SubLSymbol $sym10$_AT_CHECK_INTER_ARG_NOT_ISA__ = makeSymbol("*AT-CHECK-INTER-ARG-NOT-ISA?*");

    private static final SubLSymbol $sym11$_AT_CHECK_INTER_ARG_GENL__ = makeSymbol("*AT-CHECK-INTER-ARG-GENL?*");

    private static final SubLSymbol $sym12$_AT_CHECK_INTER_ARG_NOT_GENL__ = makeSymbol("*AT-CHECK-INTER-ARG-NOT-GENL?*");

    private static final SubLSymbol $sym13$_AT_CHECK_INTER_ARG_ISA_GENL__ = makeSymbol("*AT-CHECK-INTER-ARG-ISA-GENL?*");

    private static final SubLSymbol $sym14$_AT_CHECK_INTER_ARG_GENL_ISA__ = makeSymbol("*AT-CHECK-INTER-ARG-GENL-ISA?*");

    private static final SubLSymbol $sym15$_AT_CHECK_NON_CONSTANT_INTER_ARG_ISA__ = makeSymbol("*AT-CHECK-NON-CONSTANT-INTER-ARG-ISA?*");

    private static final SubLSymbol $sym16$_AT_CHECK_NON_CONSTANT_INTER_ARG_GENL__ = makeSymbol("*AT-CHECK-NON-CONSTANT-INTER-ARG-GENL?*");

    private static final SubLSymbol $sym17$_AT_CHECK_NON_CONSTANT_INTER_ARG_FORMAT__ = makeSymbol("*AT-CHECK-NON-CONSTANT-INTER-ARG-FORMAT?*");

    private static final SubLSymbol $sym18$_AT_CHECK_NOT_ISA_DISJOINT__ = makeSymbol("*AT-CHECK-NOT-ISA-DISJOINT?*");

    private static final SubLSymbol $sym19$_AT_CHECK_NOT_QUOTED_ISA_DISJOINT__ = makeSymbol("*AT-CHECK-NOT-QUOTED-ISA-DISJOINT?*");

    private static final SubLSymbol $sym20$_AT_CHECK_NOT_GENLS_DISJOINT__ = makeSymbol("*AT-CHECK-NOT-GENLS-DISJOINT?*");

    private static final SubLSymbol $sym21$_AT_CHECK_NOT_MDW__ = makeSymbol("*AT-CHECK-NOT-MDW?*");

    private static final SubLSymbol $sym22$_AT_CHECK_NOT_SDC__ = makeSymbol("*AT-CHECK-NOT-SDC?*");

    private static final SubLSymbol $sym23$_AT_CHECK_ARG_FORMAT__ = makeSymbol("*AT-CHECK-ARG-FORMAT?*");

    private static final SubLSymbol $sym24$_AT_CHECK_RELATOR_CONSTRAINTS__ = makeSymbol("*AT-CHECK-RELATOR-CONSTRAINTS?*");

    private static final SubLSymbol $sym25$_AT_ENSURE_CONSISTENCY__ = makeSymbol("*AT-ENSURE-CONSISTENCY?*");

    private static final SubLList $list26 = list(makeKeyword("ASYMMETRIC-PREDICATE"), makeKeyword("ANTI-SYMMETRIC-PREDICATE"), makeKeyword("IRREFLEXIVE-PREDICATE"), makeKeyword("ANTI-TRANSITIVE-PREDICATE"), makeKeyword("NEGATION-PREDS"), makeKeyword("NEGATION-INVERSES"));

    public static final SubLSymbol $at_pred_constraints$ = makeSymbol("*AT-PRED-CONSTRAINTS*");

    public static final SubLSymbol $at_predicate_violations$ = makeSymbol("*AT-PREDICATE-VIOLATIONS*");

    private static final SubLSymbol $sym29$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX__ = makeSymbol("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX?*");



    private static final SubLSymbol $sym31$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX_GAF_COUNT_THRESHOLD_ = makeSymbol("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX-GAF-COUNT-THRESHOLD*");

    public static final SubLSymbol $fag_search_limit$ = makeSymbol("*FAG-SEARCH-LIMIT*");

    public static final SubLSymbol $at_gaf_search_limit$ = makeSymbol("*AT-GAF-SEARCH-LIMIT*");

    private static final SubLSymbol $sym34$_AT_CHECK_INTER_ARG_FORMAT__ = makeSymbol("*AT-CHECK-INTER-ARG-FORMAT?*");

    private static final SubLSymbol $sym35$_AT_CHECK_INTER_ARG_DIFFERENT__ = makeSymbol("*AT-CHECK-INTER-ARG-DIFFERENT?*");

    private static final SubLSymbol $sym36$_AT_CHECK_GENL_PREDS__ = makeSymbol("*AT-CHECK-GENL-PREDS?*");

    private static final SubLSymbol $sym37$_AT_CHECK_GENL_INVERSES__ = makeSymbol("*AT-CHECK-GENL-INVERSES?*");

    public static final SubLSymbol $at_include_isa_literal_constraints$ = makeSymbol("*AT-INCLUDE-ISA-LITERAL-CONSTRAINTS*");

    public static final SubLSymbol $at_include_genl_literal_constraints$ = makeSymbol("*AT-INCLUDE-GENL-LITERAL-CONSTRAINTS*");

    private static final SubLSymbol $sym40$_GATHER_AT_CONSTRAINTS__ = makeSymbol("*GATHER-AT-CONSTRAINTS?*");

    private static final SubLSymbol $sym41$_GATHER_AT_ASSERTIONS__ = makeSymbol("*GATHER-AT-ASSERTIONS?*");

    private static final SubLSymbol $sym42$_GATHER_AT_FORMAT_VIOLATIONS__ = makeSymbol("*GATHER-AT-FORMAT-VIOLATIONS?*");

    private static final SubLSymbol $sym43$_GATHER_AT_DIFFERENT_VIOLATIONS__ = makeSymbol("*GATHER-AT-DIFFERENT-VIOLATIONS?*");

    private static final SubLSymbol $sym44$_GATHER_AT_PREDICATE_VIOLATIONS__ = makeSymbol("*GATHER-AT-PREDICATE-VIOLATIONS?*");

    public static final SubLSymbol $at_format_violations$ = makeSymbol("*AT-FORMAT-VIOLATIONS*");

    public static final SubLSymbol $at_different_violations$ = makeSymbol("*AT-DIFFERENT-VIOLATIONS*");

    private static final SubLSymbol $sym47$_WITHIN_AT_SUGGESTION__ = makeSymbol("*WITHIN-AT-SUGGESTION?*");

    private static final SubLSymbol $sym48$_WITHIN_AT_MAPPING__ = makeSymbol("*WITHIN-AT-MAPPING?*");

    private static final SubLSymbol $sym49$_AT_BREAK_ON_FAILURE__ = makeSymbol("*AT-BREAK-ON-FAILURE?*");

    private static final SubLSymbol $sym50$_ACCUMULATING_AT_VIOLATIONS__ = makeSymbol("*ACCUMULATING-AT-VIOLATIONS?*");

    private static final SubLSymbol $sym51$_NOTING_AT_VIOLATIONS__ = makeSymbol("*NOTING-AT-VIOLATIONS?*");

    public static final SubLSymbol $at_trace_level$ = makeSymbol("*AT-TRACE-LEVEL*");

    public static final SubLSymbol $at_test_level$ = makeSymbol("*AT-TEST-LEVEL*");

    private static final SubLSymbol $sym54$_APPRAISING_DISJUNCT__ = makeSymbol("*APPRAISING-DISJUNCT?*");

    private static final SubLSymbol $sym55$_WITHIN_DECONTEXTUALIZED__ = makeSymbol("*WITHIN-DECONTEXTUALIZED?*");

    private static final SubLSymbol $sym56$_WITHIN_DISJUNCTION__ = makeSymbol("*WITHIN-DISJUNCTION?*");

    private static final SubLSymbol $sym57$_WITHIN_CONJUNCTION__ = makeSymbol("*WITHIN-CONJUNCTION?*");

    private static final SubLSymbol $sym58$_WITHIN_NEGATED_DISJUNCTION__ = makeSymbol("*WITHIN-NEGATED-DISJUNCTION?*");

    private static final SubLSymbol $sym59$_WITHIN_NEGATED_CONJUNCTION__ = makeSymbol("*WITHIN-NEGATED-CONJUNCTION?*");

    private static final SubLSymbol $sym60$_WITHIN_FUNCTION__ = makeSymbol("*WITHIN-FUNCTION?*");

    private static final SubLSymbol $sym61$_WITHIN_PREDICATE__ = makeSymbol("*WITHIN-PREDICATE?*");

    private static final SubLSymbol $sym62$_WITHIN_TOU_GAF__ = makeSymbol("*WITHIN-TOU-GAF?*");

    private static final SubLSymbol $sym63$_RELAX_ARG_CONSTRAINTS_FOR_DISJUNCTIONS__ = makeSymbol("*RELAX-ARG-CONSTRAINTS-FOR-DISJUNCTIONS?*");

    private static final SubLSymbol $sym64$_AT_RELAX_ARG_CONSTRAINTS_FOR_OPAQUE_EXPANSION_NATS__ = makeSymbol("*AT-RELAX-ARG-CONSTRAINTS-FOR-OPAQUE-EXPANSION-NATS?*");

    private static final SubLSymbol $sym65$_AT_ADMIT_CONSISTENT_NAUTS__ = makeSymbol("*AT-ADMIT-CONSISTENT-NAUTS?*");

    private static final SubLSymbol $sym66$_AT_ADMIT_CONSISTENT_NARTS__ = makeSymbol("*AT-ADMIT-CONSISTENT-NARTS?*");

    public static final SubLSymbol $at_result$ = makeSymbol("*AT-RESULT*");

    private static final SubLSymbol $sym68$_AT_SOME_ARG_ISA__ = makeSymbol("*AT-SOME-ARG-ISA?*");

    private static final SubLSymbol $sym69$_AT_SOME_ARG_ISA_REQUIRED__ = makeSymbol("*AT-SOME-ARG-ISA-REQUIRED?*");

    private static final SubLSymbol $sym70$_AT_CONSIDER_MULTIARGS_AT_PRED__ = makeSymbol("*AT-CONSIDER-MULTIARGS-AT-PRED?*");



    public static final SubLSymbol $at_isa_constraints$ = makeSymbol("*AT-ISA-CONSTRAINTS*");

    public static final SubLSymbol $at_genl_constraints$ = makeSymbol("*AT-GENL-CONSTRAINTS*");

    public static final SubLSymbol $at_format_constraints$ = makeSymbol("*AT-FORMAT-CONSTRAINTS*");

    public static final SubLSymbol $at_different_constraints$ = makeSymbol("*AT-DIFFERENT-CONSTRAINTS*");

    public static final SubLSymbol $at_isa_assertions$ = makeSymbol("*AT-ISA-ASSERTIONS*");

    public static final SubLSymbol $at_genl_assertions$ = makeSymbol("*AT-GENL-ASSERTIONS*");

    public static final SubLSymbol $at_format_assertions$ = makeSymbol("*AT-FORMAT-ASSERTIONS*");

    public static final SubLSymbol $at_different_assertions$ = makeSymbol("*AT-DIFFERENT-ASSERTIONS*");

    public static final SubLSymbol $at_mode$ = makeSymbol("*AT-MODE*");

    public static final SubLSymbol $at_constraint_type$ = makeSymbol("*AT-CONSTRAINT-TYPE*");

    public static final SubLSymbol $at_arg_type$ = makeSymbol("*AT-ARG-TYPE*");

    public static final SubLSymbol $at_base_fn$ = makeSymbol("*AT-BASE-FN*");

    public static final SubLSymbol $at_formula$ = makeSymbol("*AT-FORMULA*");

    public static final SubLSymbol $at_pred$ = makeSymbol("*AT-PRED*");

    public static final SubLSymbol $at_inverse$ = makeSymbol("*AT-INVERSE*");

    public static final SubLSymbol $at_reln$ = makeSymbol("*AT-RELN*");

    public static final SubLSymbol $at_arg$ = makeSymbol("*AT-ARG*");

    public static final SubLSymbol $at_argnum$ = makeSymbol("*AT-ARGNUM*");

    private static final SubLSymbol $sym90$_AT_ARG1_ = makeSymbol("*AT-ARG1*");

    private static final SubLSymbol $sym91$_AT_ARG2_ = makeSymbol("*AT-ARG2*");

    public static final SubLSymbol $at_ind_argnum$ = makeSymbol("*AT-IND-ARGNUM*");

    public static final SubLSymbol $at_ind_arg$ = makeSymbol("*AT-IND-ARG*");

    public static final SubLSymbol $at_ind_isa$ = makeSymbol("*AT-IND-ISA*");

    public static final SubLSymbol $at_ind_genl$ = makeSymbol("*AT-IND-GENL*");

    public static final SubLSymbol $at_arg_isa$ = makeSymbol("*AT-ARG-ISA*");

    public static final SubLSymbol $at_source$ = makeSymbol("*AT-SOURCE*");

    private static final SubLSymbol $sym98$_AT_MAPPING_GENL_INVERSES__ = makeSymbol("*AT-MAPPING-GENL-INVERSES?*");

    private static final SubLSymbol $sym99$_AT_SEARCH_GENL_PREDS__ = makeSymbol("*AT-SEARCH-GENL-PREDS?*");

    private static final SubLSymbol $sym100$_AT_SEARCH_GENL_INVERSES__ = makeSymbol("*AT-SEARCH-GENL-INVERSES?*");

    public static final SubLSymbol $at_profile_term$ = makeSymbol("*AT-PROFILE-TERM*");

    public static final SubLSymbol $at_constraint_gaf$ = makeSymbol("*AT-CONSTRAINT-GAF*");

    private static final SubLSymbol $sym103$_INCLUDE_AT_CONSTRAINT_GAF__ = makeSymbol("*INCLUDE-AT-CONSTRAINT-GAF?*");

    public static final SubLSymbol $at_var_isa$ = makeSymbol("*AT-VAR-ISA*");

    public static final SubLSymbol $at_var_genl$ = makeSymbol("*AT-VAR-GENL*");



    public static final SubLSymbol $at_var_types_standard$ = makeSymbol("*AT-VAR-TYPES-STANDARD*");

    private static final SubLSymbol $sym108$_AT_ASSUME_CONJUNCTS_INDEPENDENT__ = makeSymbol("*AT-ASSUME-CONJUNCTS-INDEPENDENT?*");

    public static final SubLSymbol $current_at_violation$ = makeSymbol("*CURRENT-AT-VIOLATION*");

    public static final SubLSymbol $at_violations$ = makeSymbol("*AT-VIOLATIONS*");

    public static final SubLSymbol $at_disjoins_space$ = makeSymbol("*AT-DISJOINS-SPACE*");

    public static final SubLSymbol $at_isa_space$ = makeSymbol("*AT-ISA-SPACE*");

    public static final SubLSymbol $at_genls_space$ = makeSymbol("*AT-GENLS-SPACE*");

    private static final SubLSymbol $sym114$_AT_DEFNS_AVAILABLE__ = makeSymbol("*AT-DEFNS-AVAILABLE?*");

    private static final SubLSymbol $sym115$_AT_APPLY_NECESSARY_DEFNS__ = makeSymbol("*AT-APPLY-NECESSARY-DEFNS?*");



    public static final SubLSymbol $at_additional_defn_checking$ = makeSymbol("*AT-ADDITIONAL-DEFN-CHECKING*");

    private static final SubLSymbol $sym118$_SORT_SUF_DEFN_ASSERTIONS__ = makeSymbol("*SORT-SUF-DEFN-ASSERTIONS?*");

    private static final SubLSymbol $sym119$_SORT_SUF_FUNCTION_ASSERTIONS__ = makeSymbol("*SORT-SUF-FUNCTION-ASSERTIONS?*");

    public static final SubLSymbol $at_collection_specific_defns$ = makeSymbol("*AT-COLLECTION-SPECIFIC-DEFNS*");

    public static final SubLSymbol $defn_trace_level$ = makeSymbol("*DEFN-TRACE-LEVEL*");

    public static final SubLSymbol $defn_test_level$ = makeSymbol("*DEFN-TEST-LEVEL*");

    private static final SubLSymbol $sym123$_DEFN_METERS__ = makeSymbol("*DEFN-METERS?*");

    public static final SubLSymbol $defn_meter_caches$ = makeSymbol("*DEFN-METER-CACHES*");

    public static final SubLSymbol $defn_collection$ = makeSymbol("*DEFN-COLLECTION*");

    private static final SubLSymbol $sym126$_PERMITTING_DENOTATIONAL_TERMS_ADMITTED_BY_DEFN_VIA_ISA__ = makeSymbol("*PERMITTING-DENOTATIONAL-TERMS-ADMITTED-BY-DEFN-VIA-ISA?*");



    private static final SubLList $list128 = list(list(makeSymbol("*PERMITTING-DENOTATIONAL-TERMS-ADMITTED-BY-DEFN-VIA-ISA?*"), NIL));

    public static final SubLSymbol $at_defn$ = makeSymbol("*AT-DEFN*");

    public static final SubLSymbol $at_defns$ = makeSymbol("*AT-DEFNS*");

    public static final SubLSymbol $at_function$ = makeSymbol("*AT-FUNCTION*");

    public static final SubLSymbol $at_functions$ = makeSymbol("*AT-FUNCTIONS*");

    public static final SubLSymbol $defn_fn_history_default_size$ = makeSymbol("*DEFN-FN-HISTORY-DEFAULT-SIZE*");

    public static final SubLSymbol $defn_col_history_default_size$ = makeSymbol("*DEFN-COL-HISTORY-DEFAULT-SIZE*");



    public static final SubLSymbol $defn_col_history$ = makeSymbol("*DEFN-COL-HISTORY*");

    public static final SubLSymbol $quoted_defn_col_history$ = makeSymbol("*QUOTED-DEFN-COL-HISTORY*");

    public static final SubLSymbol $defn_fn_history$ = makeSymbol("*DEFN-FN-HISTORY*");

    public static final SubLSymbol $quoted_defn_fn_history$ = makeSymbol("*QUOTED-DEFN-FN-HISTORY*");

    public static final SubLSymbol $defn_stack$ = makeSymbol("*DEFN-STACK*");



    private static final SubLSymbol $NO_DEFINING_MTS = makeKeyword("NO-DEFINING-MTS");

    private static final SubLSymbol $NO_ARG_TYPES = makeKeyword("NO-ARG-TYPES");

    private static final SubLSymbol $NO_ARG_FORMAT = makeKeyword("NO-ARG-FORMAT");

    public static SubLObject at_check_arg_types_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $at_check_arg_typesP$.getDynamicValue(thread);
    }

    public static SubLObject at_check_defining_mts_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $at_check_defining_mtsP$.getDynamicValue(thread)) && (NIL != $at_possibly_check_defining_mtsP$.getDynamicValue(thread)));
    }

    public static SubLObject within_tou_gafP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $within_tou_gafP$.getDynamicValue(thread);
    }

    public static SubLObject at_some_arg_isa_requiredP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $at_some_arg_isa_requiredP$.getDynamicValue(thread);
    }

    public static SubLObject consider_multiargs_at_predP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $at_consider_multiargs_at_predP$.getDynamicValue(thread);
    }

    public static SubLObject at_searching_genl_predsP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $at_search_genl_predsP$.getDynamicValue(thread);
    }

    public static SubLObject at_searching_genl_inversesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $at_search_genl_inversesP$.getDynamicValue(thread);
    }

    public static SubLObject defn_collection() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $defn_collection$.getDynamicValue(thread);
    }

    public static SubLObject permitting_denotational_terms_admitted_by_defn_via_isaP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $permitting_denotational_terms_admitted_by_defn_via_isaP$.getDynamicValue(thread);
    }

    public static SubLObject without_permitting_denotational_terms_admitted_by_defn_via_isaP(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list128, append(body, NIL));
    }

    public static SubLObject new_at_parameter_state_from_context() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != default_at_parameter_stateP()) {
            return $DEFAULT;
        }
        if (NIL != no_defining_mts_at_parameter_stateP()) {
            return $NO_DEFINING_MTS;
        }
        if (NIL != no_arg_types_at_parameter_stateP()) {
            return $NO_ARG_TYPES;
        }
        if (NIL != no_arg_format_at_parameter_stateP()) {
            return $NO_ARG_FORMAT;
        }
        final SubLObject state = list(new SubLObject[]{ $at_check_arg_typesP$.getDynamicValue(thread), $at_check_defining_mtsP$.getDynamicValue(thread), $at_check_arg_genlsP$.getDynamicValue(thread), $at_check_arg_formatP$.getDynamicValue(thread), $at_check_arg_isaP$.getDynamicValue(thread), $at_check_not_isa_disjointP$.getDynamicValue(thread), $at_check_inter_arg_differentP$.getDynamicValue(thread), $at_check_inter_arg_isaP$.getDynamicValue(thread), $at_check_inter_arg_genlP$.getDynamicValue(thread), $at_check_inter_arg_formatP$.getDynamicValue(thread), $at_check_relator_constraintsP$.getDynamicValue(thread), $at_some_arg_isa_requiredP$.getDynamicValue(thread), wff_vars.wff_mode() });
        return state;
    }

    public static SubLObject default_at_parameter_stateP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((((((((((((NIL != $at_check_arg_typesP$.getDynamicValue(thread)) && (NIL != $at_check_defining_mtsP$.getDynamicValue(thread))) && (NIL != $at_check_arg_genlsP$.getDynamicValue(thread))) && (NIL != $at_check_arg_formatP$.getDynamicValue(thread))) && (NIL != $at_check_arg_isaP$.getDynamicValue(thread))) && (NIL != $at_check_not_isa_disjointP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_differentP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_isaP$.getDynamicValue(thread))) && (NIL == $at_check_inter_arg_genlP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_formatP$.getDynamicValue(thread))) && (NIL != $at_check_relator_constraintsP$.getDynamicValue(thread))) && (NIL == $at_some_arg_isa_requiredP$.getDynamicValue(thread))) && (NIL != wff_vars.wff_strictP()));
    }

    public static SubLObject no_defining_mts_at_parameter_stateP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((((((((((((NIL != $at_check_arg_typesP$.getDynamicValue(thread)) && (NIL == $at_check_defining_mtsP$.getDynamicValue(thread))) && (NIL != $at_check_arg_genlsP$.getDynamicValue(thread))) && (NIL != $at_check_arg_formatP$.getDynamicValue(thread))) && (NIL != $at_check_arg_isaP$.getDynamicValue(thread))) && (NIL != $at_check_not_isa_disjointP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_differentP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_isaP$.getDynamicValue(thread))) && (NIL == $at_check_inter_arg_genlP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_formatP$.getDynamicValue(thread))) && (NIL != $at_check_relator_constraintsP$.getDynamicValue(thread))) && (NIL == $at_some_arg_isa_requiredP$.getDynamicValue(thread))) && (NIL != wff_vars.wff_strictP()));
    }

    public static SubLObject no_arg_types_at_parameter_stateP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((((((((((((NIL == $at_check_arg_typesP$.getDynamicValue(thread)) && (NIL == $at_check_defining_mtsP$.getDynamicValue(thread))) && (NIL != $at_check_arg_genlsP$.getDynamicValue(thread))) && (NIL != $at_check_arg_formatP$.getDynamicValue(thread))) && (NIL != $at_check_arg_isaP$.getDynamicValue(thread))) && (NIL != $at_check_not_isa_disjointP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_differentP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_isaP$.getDynamicValue(thread))) && (NIL == $at_check_inter_arg_genlP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_formatP$.getDynamicValue(thread))) && (NIL != $at_check_relator_constraintsP$.getDynamicValue(thread))) && (NIL == $at_some_arg_isa_requiredP$.getDynamicValue(thread))) && (NIL != wff_vars.wff_strictP()));
    }

    public static SubLObject no_arg_format_at_parameter_stateP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((((((((((((NIL != $at_check_arg_typesP$.getDynamicValue(thread)) && (NIL == $at_check_defining_mtsP$.getDynamicValue(thread))) && (NIL != $at_check_arg_genlsP$.getDynamicValue(thread))) && (NIL == $at_check_arg_formatP$.getDynamicValue(thread))) && (NIL != $at_check_arg_isaP$.getDynamicValue(thread))) && (NIL != $at_check_not_isa_disjointP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_differentP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_isaP$.getDynamicValue(thread))) && (NIL == $at_check_inter_arg_genlP$.getDynamicValue(thread))) && (NIL != $at_check_inter_arg_formatP$.getDynamicValue(thread))) && (NIL != $at_check_relator_constraintsP$.getDynamicValue(thread))) && (NIL == $at_some_arg_isa_requiredP$.getDynamicValue(thread))) && (NIL != wff_vars.wff_strictP()));
    }

    public static SubLObject declare_at_vars_file() {
        declareFunction(me, "at_check_arg_types_p", "AT-CHECK-ARG-TYPES-P", 0, 0, false);
        declareFunction(me, "at_check_defining_mts_p", "AT-CHECK-DEFINING-MTS-P", 0, 0, false);
        declareFunction(me, "within_tou_gafP", "WITHIN-TOU-GAF?", 0, 0, false);
        declareFunction(me, "at_some_arg_isa_requiredP", "AT-SOME-ARG-ISA-REQUIRED?", 0, 0, false);
        declareFunction(me, "consider_multiargs_at_predP", "CONSIDER-MULTIARGS-AT-PRED?", 0, 0, false);
        declareFunction(me, "at_searching_genl_predsP", "AT-SEARCHING-GENL-PREDS?", 0, 0, false);
        declareFunction(me, "at_searching_genl_inversesP", "AT-SEARCHING-GENL-INVERSES?", 0, 0, false);
        declareFunction(me, "defn_collection", "DEFN-COLLECTION", 0, 0, false);
        declareFunction(me, "permitting_denotational_terms_admitted_by_defn_via_isaP", "PERMITTING-DENOTATIONAL-TERMS-ADMITTED-BY-DEFN-VIA-ISA?", 0, 0, false);
        declareMacro(me, "without_permitting_denotational_terms_admitted_by_defn_via_isaP", "WITHOUT-PERMITTING-DENOTATIONAL-TERMS-ADMITTED-BY-DEFN-VIA-ISA?");
        declareFunction(me, "new_at_parameter_state_from_context", "NEW-AT-PARAMETER-STATE-FROM-CONTEXT", 0, 0, false);
        declareFunction(me, "default_at_parameter_stateP", "DEFAULT-AT-PARAMETER-STATE?", 0, 0, false);
        declareFunction(me, "no_defining_mts_at_parameter_stateP", "NO-DEFINING-MTS-AT-PARAMETER-STATE?", 0, 0, false);
        declareFunction(me, "no_arg_types_at_parameter_stateP", "NO-ARG-TYPES-AT-PARAMETER-STATE?", 0, 0, false);
        declareFunction(me, "no_arg_format_at_parameter_stateP", "NO-ARG-FORMAT-AT-PARAMETER-STATE?", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_at_vars_file() {
        defparameter("*SEMANTIC-DNF-HL-FILTERING-ENABLED*", NIL);
        defparameter("*AT-CHECK-FN-SYMBOL?*", T);
        defparameter("*AT-CHECK-ARG-GENLS?*", T);
        defparameter("*AT-CHECK-ARG-ISA?*", T);
        defparameter("*AT-CHECK-ARG-QUOTED-ISA?*", T);
        defparameter("*AT-CHECK-ARG-NOT-ISA?*", T);
        defparameter("*AT-CHECK-ARG-TYPES?*", T);
        defparameter("*AT-POSSIBLY-CHECK-DEFINING-MTS?*", NIL);
        defparameter("*AT-CHECK-DEFINING-MTS?*", T);
        defparameter("*AT-CHECK-INTER-ARG-ISA?*", T);
        defparameter("*AT-CHECK-INTER-ARG-NOT-ISA?*", T);
        defparameter("*AT-CHECK-INTER-ARG-GENL?*", NIL);
        defparameter("*AT-CHECK-INTER-ARG-NOT-GENL?*", T);
        defparameter("*AT-CHECK-INTER-ARG-ISA-GENL?*", T);
        defparameter("*AT-CHECK-INTER-ARG-GENL-ISA?*", T);
        defparameter("*AT-CHECK-NON-CONSTANT-INTER-ARG-ISA?*", T);
        defparameter("*AT-CHECK-NON-CONSTANT-INTER-ARG-GENL?*", T);
        defparameter("*AT-CHECK-NON-CONSTANT-INTER-ARG-FORMAT?*", T);
        defparameter("*AT-CHECK-NOT-ISA-DISJOINT?*", T);
        defparameter("*AT-CHECK-NOT-QUOTED-ISA-DISJOINT?*", T);
        defparameter("*AT-CHECK-NOT-GENLS-DISJOINT?*", T);
        defparameter("*AT-CHECK-NOT-MDW?*", T);
        defparameter("*AT-CHECK-NOT-SDC?*", T);
        defparameter("*AT-CHECK-ARG-FORMAT?*", T);
        defparameter("*AT-CHECK-RELATOR-CONSTRAINTS?*", T);
        defparameter("*AT-ENSURE-CONSISTENCY?*", NIL);
        defparameter("*AT-PRED-CONSTRAINTS*", $list26);
        defparameter("*AT-PREDICATE-VIOLATIONS*", NIL);
        defparameter("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX?*", T);
        defparameter("*AT-CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX-GAF-COUNT-THRESHOLD*", $int$100);
        defparameter("*FAG-SEARCH-LIMIT*", NIL);
        defparameter("*AT-GAF-SEARCH-LIMIT*", $int$100);
        defparameter("*AT-CHECK-INTER-ARG-FORMAT?*", T);
        defparameter("*AT-CHECK-INTER-ARG-DIFFERENT?*", T);
        defparameter("*AT-CHECK-GENL-PREDS?*", T);
        defparameter("*AT-CHECK-GENL-INVERSES?*", T);
        defparameter("*AT-INCLUDE-ISA-LITERAL-CONSTRAINTS*", T);
        defparameter("*AT-INCLUDE-GENL-LITERAL-CONSTRAINTS*", T);
        defparameter("*GATHER-AT-CONSTRAINTS?*", NIL);
        defparameter("*GATHER-AT-ASSERTIONS?*", NIL);
        defparameter("*GATHER-AT-FORMAT-VIOLATIONS?*", NIL);
        defparameter("*GATHER-AT-DIFFERENT-VIOLATIONS?*", NIL);
        defparameter("*GATHER-AT-PREDICATE-VIOLATIONS?*", NIL);
        defparameter("*AT-FORMAT-VIOLATIONS*", NIL);
        defparameter("*AT-DIFFERENT-VIOLATIONS*", NIL);
        defparameter("*WITHIN-AT-SUGGESTION?*", NIL);
        defparameter("*WITHIN-AT-MAPPING?*", NIL);
        defparameter("*AT-BREAK-ON-FAILURE?*", NIL);
        defparameter("*ACCUMULATING-AT-VIOLATIONS?*", NIL);
        defparameter("*NOTING-AT-VIOLATIONS?*", NIL);
        defparameter("*AT-TRACE-LEVEL*", ONE_INTEGER);
        defparameter("*AT-TEST-LEVEL*", THREE_INTEGER);
        defparameter("*APPRAISING-DISJUNCT?*", NIL);
        defparameter("*WITHIN-DECONTEXTUALIZED?*", NIL);
        defparameter("*WITHIN-DISJUNCTION?*", NIL);
        defparameter("*WITHIN-CONJUNCTION?*", NIL);
        defparameter("*WITHIN-NEGATED-DISJUNCTION?*", NIL);
        defparameter("*WITHIN-NEGATED-CONJUNCTION?*", NIL);
        defparameter("*WITHIN-FUNCTION?*", NIL);
        defparameter("*WITHIN-PREDICATE?*", NIL);
        defparameter("*WITHIN-TOU-GAF?*", NIL);
        defparameter("*RELAX-ARG-CONSTRAINTS-FOR-DISJUNCTIONS?*", T);
        defparameter("*AT-RELAX-ARG-CONSTRAINTS-FOR-OPAQUE-EXPANSION-NATS?*", T);
        defparameter("*AT-ADMIT-CONSISTENT-NAUTS?*", T);
        defparameter("*AT-ADMIT-CONSISTENT-NARTS?*", NIL);
        defparameter("*AT-RESULT*", NIL);
        defparameter("*AT-SOME-ARG-ISA?*", NIL);
        defparameter("*AT-SOME-ARG-ISA-REQUIRED?*", NIL);
        defparameter("*AT-CONSIDER-MULTIARGS-AT-PRED?*", T);
        defparameter("*AT-ISA-CONSTRAINTS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
        defparameter("*AT-GENL-CONSTRAINTS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
        defparameter("*AT-FORMAT-CONSTRAINTS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
        defparameter("*AT-DIFFERENT-CONSTRAINTS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
        defparameter("*AT-ISA-ASSERTIONS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
        defparameter("*AT-GENL-ASSERTIONS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
        defparameter("*AT-FORMAT-ASSERTIONS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
        defparameter("*AT-DIFFERENT-ASSERTIONS*", make_hash_table($int$64, UNPROVIDED, UNPROVIDED));
        defparameter("*AT-MODE*", NIL);
        defparameter("*AT-CONSTRAINT-TYPE*", NIL);
        defparameter("*AT-ARG-TYPE*", NIL);
        defparameter("*AT-BASE-FN*", NIL);
        defparameter("*AT-FORMULA*", NIL);
        defparameter("*AT-PRED*", NIL);
        defparameter("*AT-INVERSE*", NIL);
        defparameter("*AT-RELN*", NIL);
        defparameter("*AT-ARG*", NIL);
        defparameter("*AT-ARGNUM*", NIL);
        defparameter("*AT-ARG1*", NIL);
        defparameter("*AT-ARG2*", NIL);
        defparameter("*AT-IND-ARGNUM*", NIL);
        defparameter("*AT-IND-ARG*", NIL);
        defparameter("*AT-IND-ISA*", NIL);
        defparameter("*AT-IND-GENL*", NIL);
        defparameter("*AT-ARG-ISA*", NIL);
        defparameter("*AT-SOURCE*", NIL);
        defparameter("*AT-MAPPING-GENL-INVERSES?*", NIL);
        defparameter("*AT-SEARCH-GENL-PREDS?*", T);
        defparameter("*AT-SEARCH-GENL-INVERSES?*", T);
        defparameter("*AT-PROFILE-TERM*", NIL);
        defparameter("*AT-CONSTRAINT-GAF*", NIL);
        defparameter("*INCLUDE-AT-CONSTRAINT-GAF?*", T);
        defparameter("*AT-VAR-ISA*", NIL);
        defparameter("*AT-VAR-GENL*", NIL);
        defparameter("*AT-VAR-TYPES-STANDARD*", $NOT_DISJOINT);
        defparameter("*AT-ASSUME-CONJUNCTS-INDEPENDENT?*", T);
        defparameter("*CURRENT-AT-VIOLATION*", NIL);
        defparameter("*AT-VIOLATIONS*", NIL);
        defparameter("*AT-DISJOINS-SPACE*", NIL);
        defparameter("*AT-ISA-SPACE*", NIL);
        defparameter("*AT-GENLS-SPACE*", NIL);
        defparameter("*AT-DEFNS-AVAILABLE?*", T);
        defparameter("*AT-APPLY-NECESSARY-DEFNS?*", T);
        defparameter("*AT-ADDITIONAL-DEFN-CHECKING*", $DISJOINT);
        defparameter("*SORT-SUF-DEFN-ASSERTIONS?*", T);
        defparameter("*SORT-SUF-FUNCTION-ASSERTIONS?*", NIL);
        defvar("*AT-COLLECTION-SPECIFIC-DEFNS*", NIL);
        defparameter("*DEFN-TRACE-LEVEL*", ONE_INTEGER);
        defparameter("*DEFN-TEST-LEVEL*", THREE_INTEGER);
        defparameter("*DEFN-METERS?*", NIL);
        defparameter("*DEFN-METER-CACHES*", NIL);
        defparameter("*DEFN-COLLECTION*", NIL);
        defparameter("*PERMITTING-DENOTATIONAL-TERMS-ADMITTED-BY-DEFN-VIA-ISA?*", T);
        defparameter("*AT-DEFN*", NIL);
        defparameter("*AT-DEFNS*", NIL);
        defparameter("*AT-FUNCTION*", NIL);
        defparameter("*AT-FUNCTIONS*", NIL);
        defparameter("*DEFN-FN-HISTORY-DEFAULT-SIZE*", ZERO_INTEGER);
        defparameter("*DEFN-COL-HISTORY-DEFAULT-SIZE*", ZERO_INTEGER);
        defparameter("*DEFN-COL-HISTORY*", $UNINITIALIZED);
        defparameter("*QUOTED-DEFN-COL-HISTORY*", $UNINITIALIZED);
        defparameter("*DEFN-FN-HISTORY*", $UNINITIALIZED);
        defparameter("*QUOTED-DEFN-FN-HISTORY*", $UNINITIALIZED);
        defparameter("*DEFN-STACK*", $UNINITIALIZED);
        return NIL;
    }

    public static SubLObject setup_at_vars_file() {
        SubLObject item_var = $semantic_dnf_hl_filtering_enabled$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym1$_AT_CHECK_FN_SYMBOL__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym2$_AT_CHECK_ARG_GENLS__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym3$_AT_CHECK_ARG_ISA__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym4$_AT_CHECK_ARG_QUOTED_ISA__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym5$_AT_CHECK_ARG_NOT_ISA__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym6$_AT_CHECK_ARG_TYPES__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym7$_AT_POSSIBLY_CHECK_DEFINING_MTS__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym8$_AT_CHECK_DEFINING_MTS__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym9$_AT_CHECK_INTER_ARG_ISA__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym10$_AT_CHECK_INTER_ARG_NOT_ISA__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym11$_AT_CHECK_INTER_ARG_GENL__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym12$_AT_CHECK_INTER_ARG_NOT_GENL__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym13$_AT_CHECK_INTER_ARG_ISA_GENL__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym14$_AT_CHECK_INTER_ARG_GENL_ISA__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym15$_AT_CHECK_NON_CONSTANT_INTER_ARG_ISA__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym16$_AT_CHECK_NON_CONSTANT_INTER_ARG_GENL__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym17$_AT_CHECK_NON_CONSTANT_INTER_ARG_FORMAT__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym18$_AT_CHECK_NOT_ISA_DISJOINT__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym19$_AT_CHECK_NOT_QUOTED_ISA_DISJOINT__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym20$_AT_CHECK_NOT_GENLS_DISJOINT__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym21$_AT_CHECK_NOT_MDW__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym22$_AT_CHECK_NOT_SDC__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym23$_AT_CHECK_ARG_FORMAT__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym24$_AT_CHECK_RELATOR_CONSTRAINTS__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym25$_AT_ENSURE_CONSISTENCY__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_pred_constraints$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_predicate_violations$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym29$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym31$_AT_CHECK_INTER_ASSERT_FORMAT_W_O_ARG_INDEX_GAF_COUNT_THRESHOLD_;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $fag_search_limit$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_gaf_search_limit$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym34$_AT_CHECK_INTER_ARG_FORMAT__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym35$_AT_CHECK_INTER_ARG_DIFFERENT__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym36$_AT_CHECK_GENL_PREDS__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym37$_AT_CHECK_GENL_INVERSES__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_include_isa_literal_constraints$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_include_genl_literal_constraints$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym40$_GATHER_AT_CONSTRAINTS__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym41$_GATHER_AT_ASSERTIONS__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym42$_GATHER_AT_FORMAT_VIOLATIONS__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym43$_GATHER_AT_DIFFERENT_VIOLATIONS__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym44$_GATHER_AT_PREDICATE_VIOLATIONS__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_format_violations$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_different_violations$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym47$_WITHIN_AT_SUGGESTION__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym48$_WITHIN_AT_MAPPING__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym49$_AT_BREAK_ON_FAILURE__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym50$_ACCUMULATING_AT_VIOLATIONS__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym51$_NOTING_AT_VIOLATIONS__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_trace_level$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_test_level$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym54$_APPRAISING_DISJUNCT__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym55$_WITHIN_DECONTEXTUALIZED__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym56$_WITHIN_DISJUNCTION__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym57$_WITHIN_CONJUNCTION__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym58$_WITHIN_NEGATED_DISJUNCTION__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym59$_WITHIN_NEGATED_CONJUNCTION__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym60$_WITHIN_FUNCTION__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym61$_WITHIN_PREDICATE__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym62$_WITHIN_TOU_GAF__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym63$_RELAX_ARG_CONSTRAINTS_FOR_DISJUNCTIONS__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym64$_AT_RELAX_ARG_CONSTRAINTS_FOR_OPAQUE_EXPANSION_NATS__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym65$_AT_ADMIT_CONSISTENT_NAUTS__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym66$_AT_ADMIT_CONSISTENT_NARTS__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_result$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym68$_AT_SOME_ARG_ISA__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym69$_AT_SOME_ARG_ISA_REQUIRED__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym70$_AT_CONSIDER_MULTIARGS_AT_PRED__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_isa_constraints$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_genl_constraints$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_format_constraints$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_different_constraints$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_isa_assertions$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_genl_assertions$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_format_assertions$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_different_assertions$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_mode$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_constraint_type$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_arg_type$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_base_fn$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_formula$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_pred$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_inverse$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_reln$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_arg$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_argnum$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym90$_AT_ARG1_;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym91$_AT_ARG2_;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_ind_argnum$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_ind_arg$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_ind_isa$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_ind_genl$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_arg_isa$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_source$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym98$_AT_MAPPING_GENL_INVERSES__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym99$_AT_SEARCH_GENL_PREDS__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym100$_AT_SEARCH_GENL_INVERSES__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_profile_term$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_constraint_gaf$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym103$_INCLUDE_AT_CONSTRAINT_GAF__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_var_isa$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_var_genl$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_var_types_standard$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym108$_AT_ASSUME_CONJUNCTS_INDEPENDENT__;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $current_at_violation$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_violations$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_disjoins_space$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_isa_space$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $at_genls_space$;
        if (NIL == member(item_var, $at_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $at_state_variables$.setGlobalValue(cons(item_var, $at_state_variables$.getGlobalValue()));
        }
        item_var = $sym114$_AT_DEFNS_AVAILABLE__;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        item_var = $sym115$_AT_APPLY_NECESSARY_DEFNS__;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        item_var = $at_additional_defn_checking$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        item_var = $sym118$_SORT_SUF_DEFN_ASSERTIONS__;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        item_var = $sym119$_SORT_SUF_FUNCTION_ASSERTIONS__;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        item_var = $at_collection_specific_defns$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        item_var = $defn_trace_level$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        item_var = $defn_test_level$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        item_var = $sym123$_DEFN_METERS__;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        item_var = $defn_meter_caches$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        item_var = $defn_collection$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        item_var = $sym126$_PERMITTING_DENOTATIONAL_TERMS_ADMITTED_BY_DEFN_VIA_ISA__;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        item_var = $at_defn$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        item_var = $at_defns$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        item_var = $at_function$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        item_var = $at_functions$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        item_var = $defn_fn_history_default_size$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        item_var = $defn_col_history_default_size$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        item_var = $defn_col_history$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        item_var = $quoted_defn_col_history$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        item_var = $defn_fn_history$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        item_var = $quoted_defn_fn_history$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        item_var = $defn_stack$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        return NIL;
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

    
}

/**
 * Total time: 677 ms
 */
