package com.cyc.cycjava.cycl.sksi.query_sks;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.inference.harness.inference_czer;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_enumerated_types;
import com.cyc.cycjava.cycl.evaluation_defns;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.cycjava.cycl.map_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.relation_evaluation;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.inference.modules.simplification_modules;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_generation;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_query;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.somewhere_cache;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_conjunctive_removal_module_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities";
    public static final String myFingerPrint = "6d934afef708d7ba8a025b929dc6878336113bb716ab71ddc47c9b4ec346562c";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 920L)
    public static SubLSymbol $sksi_crms_check_required_fieldsP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 18463L)
    public static SubLSymbol $sksi_asserted_joinabilityP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 30516L)
    public static SubLSymbol $sksi_sparql_recursive_sksi_sort_bound_variables$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 33195L)
    private static SubLSymbol $sksi_sort_asents_unselected_asents$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 33292L)
    private static SubLSymbol $sksi_sort_asents_unbound_vars$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 33693L)
    public static SubLSymbol $sksi_sort_asents_use_cost_path_lookahead_methodP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 33898L)
    public static SubLSymbol $sksi_sort_asents_override_cost_path_lookahead_method_max_literal_count$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 37007L)
    private static SubLSymbol $sksi_sort_asent_estimated_cost_path_transform_asent_unbound_vars$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 38877L)
    private static SubLSymbol $sksi_asent_cost_constant_sksi_cost_dne$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 39001L)
    private static SubLSymbol $sksi_asent_cost_constant_0_unbound_vars_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 39164L)
    private static SubLSymbol $sksi_asent_cost_constant_1_unbound_var_zero_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 39317L)
    private static SubLSymbol $sksi_asent_cost_constant_1_unbound_var_one_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 39469L)
    private static SubLSymbol $sksi_asent_cost_constant_1_unbound_var_cost_divisor$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 39785L)
    private static SubLSymbol $sksi_asent_cost_constant_2_unbound_var_one_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 39943L)
    private static SubLSymbol $sksi_asent_cost_constant_2_unbound_var_evaluate_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 51477L)
    private static SubLSymbol $recursive_sksi_crm_generate_csql_for_queryP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 51612L)
    private static SubLSymbol $sksi_sparql_recursive_sksi_crm_generate_outer_scope_defined_variables$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 52005L)
    private static SubLSymbol $sksi_sparql_recursive_sksi_crm_generate_var_lit_pfis$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 52088L)
    private static SubLSymbol $sksi_sparql_recursive_sksi_crm_generate_var_pfis_encodings$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 52176L)
    private static SubLSymbol $sksi_sparql_recursive_sksi_crm_generate_lit_pfi_selects$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 52261L)
    private static SubLSymbol $sksi_sparql_recursive_sksi_crm_generate_var_lfi_map$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 52342L)
    private static SubLSymbol $sksi_sparql_recursive_sksi_crm_generate_var_lit_decodings$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 52429L)
    private static SubLSymbol $sksi_sparql_recursive_sksi_crm_generate_tac$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 52502L)
    public static SubLSymbol $sksi_crm_generate_csql_suppress_optimizationP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 52729L)
    public static SubLSymbol $sksi_crm_generate_csql_suppress_comparison_literal_sortingP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 64281L)
    public static SubLSymbol $csql_simplification_wrt_field_equivalance_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 70809L)
    private static SubLSymbol $csql_aliases$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 72068L)
    private static SubLSymbol $csql_transform_kill_name$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 72137L)
    private static SubLSymbol $csql_transform_kill_namespace$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 72196L)
    private static SubLSymbol $csql_transform_keep_name$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 72250L)
    private static SubLSymbol $csql_transform_keep_namespace$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 73345L)
    private static SubLSymbol $csql_transform_kill$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 73396L)
    private static SubLSymbol $csql_transform_keep$;
    private static final SubLSymbol $kw0$POS;
    private static final SubLObject $const1$sksiUnknownSentence;
    private static final SubLObject $const2$disallowMeaningSentencesForUnboun;
    private static final SubLList $list3;
    private static final SubLSymbol $sym4$IST_MEANING_SENTENCE_GAF_P;
    private static final SubLSymbol $sym5$GET_MEANING_SENTENCE_GAFS_FOR_ASENT_MEMOIZED;
    private static final SubLInteger $int6$2048;
    private static final SubLSymbol $sym7$GET_CONDITIONAL_MEANING_SENTENCE_GAFS_FOR_ASENT_MEMOIZED;
    private static final SubLSymbol $sym8$ITERATE_LIST_DONE;
    private static final SubLSymbol $sym9$ITERATE_LIST_NEXT;
    private static final SubLList $list10;
    private static final SubLSymbol $sym11$FIND_FIRST_APPLICABLE_MEANING_SENTENCE_GAF_FOR_ASENT_MEMOIZED;
    private static final SubLSymbol $sym12$SKSI_RELEVANT_SPEC_PREDS_FROM_MEANING_SENTENCE_PRED;
    private static final SubLSymbol $sym13$SKSI_RELEVANT_SPEC_INVERSES_FROM_MEANING_SENTENCE_PRED;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$VARIABLE_P;
    private static final SubLSymbol $sym16$LOGICAL_FIELD_INDEXICALS_JOINABLE_;
    private static final SubLInteger $int17$1000;
    private static final SubLSymbol $kw18$SKSI_MISSING_LOGICAL_FIELD_FOR_INDEXICAL;
    private static final SubLObject $const19$StringObject;
    private static final SubLObject $const20$CSQLEquals;
    private static final SubLSymbol $sym21$SKSI_SORT_ASENTS_BOUND_VAR_P;
    private static final SubLSymbol $sym22$SKSI_SORT_ASENTS_UNBOUND_VAR_P;
    private static final SubLInteger $int23$41;
    private static final SubLSymbol $sym24$SKSI_ASENT_BETTER_P;
    private static final SubLSymbol $sym25$SKSI_ASENT_BETTER_WRT_PRIMARY_CHARACTERICS;
    private static final SubLSymbol $sym26$ASENT_AND_COST_PATH__;
    private static final SubLSymbol $kw27$FULLY_BOUND;
    private static final SubLFloat $float28$0_2;
    private static final SubLFloat $float29$0_01;
    private static final SubLFloat $float30$0_1;
    private static final SubLFloat $float31$0_007;
    private static final SubLInteger $int32$18000;
    private static final SubLFloat $float33$1_0e_4;
    private static final SubLFloat $float34$5_0e_5;
    private static final SubLSymbol $sym35$SKSI_SORT_ASENT_ESTIMATED_COST_PATH;
    private static final SubLSymbol $sym36$SKSI_SORT_ASENT_ESTIMATED_COST_PATH_TRANSFORM_ASENT_ELEM;
    private static final SubLObject $const37$CCF_SDB_SDBMySQLExportStore_Cyc_K;
    private static final SubLInteger $int38$88888888;
    private static final SubLList $list39;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$SKSI_ASENT_FANOUT_ARG_TERM;
    private static final SubLObject $const42$EverythingPSC;
    private static final SubLSymbol $sym43$SKSI_EVALUATABLE_PREDICATE_;
    private static final SubLObject $const44$RDFTripleStore_Physical;
    private static final SubLSymbol $kw45$SKSI_MISSING_DECODINGS;
    private static final SubLSymbol $kw46$SKSI_MISSING_ENCODINGS;
    private static final SubLSymbol $kw47$SKSI_MISSING_FIELDS;
    private static final SubLSymbol $kw48$SKSI_MISSING_PHYSICAL_FIELD_FOR_INDEXICAL;
    private static final SubLSymbol $kw49$SKSI_MISSING_REQUIRED_FIELD_VALUE;
    private static final SubLSymbol $kw50$SKSI_LIT_MS_ARG_MISMATCH;
    private static final SubLSymbol $kw51$SKSI_UNREFORMULATABLE;
    private static final SubLSymbol $kw52$SKSI_COMPARISON_ASENT_INAPPLICABLE;
    private static final SubLSymbol $kw53$SKSI_COMPARISON_OPERATOR_FORBIDDEN;
    private static final SubLSymbol $kw54$SKSI_COMPARISON_ASENT_NO_VARIABLE_FOUND;
    private static final SubLSymbol $kw55$SKSI_LIST_LENGTH_MISMATCH;
    private static final SubLSymbol $kw56$SKSI_EVALUATE_CSQL_UNPRODUCIBLE;
    private static final SubLSymbol $kw57$SKSI_UNKNOWN_SENTENCE_CSQL_UNPRODUCIBLE;
    private static final SubLSymbol $sym58$DECODING_PHYSICAL_FIELD_INDEXICALS;
    private static final SubLSymbol $kw59$RS_INDEX;
    private static final SubLSymbol $sym60$PHYSICAL_FIELD_INDEXICAL_P;
    private static final SubLObject $const61$evaluate;
    private static final SubLSymbol $sym62$HL_VARIABLE_P;
    private static final SubLSymbol $sym63$CAR_IF_LIST_OR_NIL;
    private static final SubLList $list64;
    private static final SubLSymbol $kw65$SELECT;
    private static final SubLList $list66;
    private static final SubLSymbol $kw67$WHERE;
    private static final SubLList $list68;
    private static final SubLSymbol $kw69$FROM;
    private static final SubLList $list70;
    private static final SubLList $list71;
    private static final SubLList $list72;
    private static final SubLSymbol $kw73$FIELD;
    private static final SubLSymbol $sym74$THIRD;
    private static final SubLString $str75$expected__S_got__S_instead;
    private static final SubLList $list76;
    private static final SubLList $list77;
    private static final SubLSymbol $sym78$_EXIT;
    private static final SubLSymbol $sym79$CSQL_ALIASED_EXPRESSION_WITH_NAMESPACE_;
    private static final SubLSymbol $sym80$CSQL_EXPRESSION_REMOVE_NAMESPACE;
    private static final SubLSymbol $sym81$SECOND;
    private static final SubLList $list82;
    private static final SubLList $list83;
    private static final SubLSymbol $sym84$CSQL_KILL_TABLE_ALIAS_FIELD_P;
    private static final SubLList $list85;
    private static final SubLSymbol $sym86$CSQL_TRANSFORM_TABLE_ALIAS_FIELD;
    private static final SubLSymbol $sym87$CSQL_RESULT_SET_INDEX_TO_RENUMBER_P;
    private static final SubLList $list88;
    private static final SubLSymbol $sym89$CSQL_RENUMBER_RESULT_SET_INDEX;
    private static final SubLSymbol $sym90$TRUE;
    private static final SubLSymbol $sym91$_;
    private static final SubLSymbol $sym92$CADAR;
    private static final SubLList $list93;
    private static final SubLList $list94;
    private static final SubLList $list95;
    private static final SubLSymbol $sym96$FIRST;
    private static final SubLSymbol $sym97$GET_DECODINGS_FOR_LOGICAL_FIELD_INDEXICAL;
    private static final SubLSymbol $sym98$GET_PFI_ENCODING_PAIRS_FOR_LOGICAL_FIELD_INDEXICAL;
    private static final SubLSymbol $sym99$GET_PRIMARY_KEYS_FOR_LOGICAL_FIELD_INDEXICAL;
    private static final SubLSymbol $sym100$GET_PRIMARY_KEYS_FROM_DECODINGS;
    private static final SubLSymbol $sym101$PHYSICAL_FIELD_FOR_INDEXICAL;
    private static final SubLSymbol $sym102$CSQL_FIELD_EXPRESSION_TABLE_NAME;
    private static final SubLObject $const103$CSQLStrictlyEquals;
    private static final SubLList $list104;
    private static final SubLSymbol $kw105$AND;
    private static final SubLSymbol $kw106$OR;
    private static final SubLSymbol $kw107$IGNORE;
    private static final SubLList $list108;
    private static final SubLList $list109;
    private static final SubLSymbol $sym110$CDR;
    private static final SubLSymbol $sym111$EL_VARIABLE_P;
    private static final SubLSymbol $sym112$CAR;
    private static final SubLList $list113;
    private static final SubLList $list114;
    private static final SubLObject $const115$CSQLExists;
    private static final SubLSymbol $sym116$CSQL_FALSE_P;
    private static final SubLSymbol $sym117$SKSI_CRM_CSQL_OPERATOR_ARGNUM_ENCODINGS_OVERRIDE;
    private static final SubLSymbol $sym118$RELEVANT_MT_IS_GENL_MT;
    private static final SubLObject $const119$fieldEncodingOverrideForCompariso;
    private static final SubLSymbol $kw120$TRUE;
    private static final SubLInteger $int121$200;
    private static final SubLSymbol $sym122$CSQL_DISJOIN_EXPRESSIONS;
    private static final SubLSymbol $sym123$CSQL_CONJOIN_EXPRESSIONS;
    private static final SubLSymbol $sym124$CSQL_FIELD_EXPRESSION_P;
    private static final SubLList $list125;
    private static final SubLList $list126;
    private static final SubLList $list127;
    private static final SubLList $list128;
    private static final SubLList $list129;
    private static final SubLSymbol $kw130$EVAL;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 983L)
    public static SubLObject sksi_disallow_meaning_sentences_for_unbound_predicatesP(final SubLObject sk_source) {
        SubLObject cdolist_list_var = sksi_kb_accessors.sk_source_super_ks_closure(sk_source);
        SubLObject sks = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        sks = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
            if (sksi_conjunctive_removal_module_utilities.NIL != sksi_disallow_meaning_sentences_for_unbound_predicates_for_just_this_sourceP(sks)) {
                return (SubLObject)sksi_conjunctive_removal_module_utilities.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            sks = cdolist_list_var.first();
        }
        return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 1423L)
    public static SubLObject sksi_disallow_meaning_sentences_for_unbound_predicates_for_just_this_sourceP(final SubLObject sk_source) {
        if (sksi_conjunctive_removal_module_utilities.NIL != somewhere_cache.some_pred_assertion_somewhereP(sksi_conjunctive_removal_module_utilities.$const2$disallowMeaningSentencesForUnboun, sk_source, (SubLObject)sksi_conjunctive_removal_module_utilities.ONE_INTEGER, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED)) {
            return kb_mapping_utilities.tuple_holds((SubLObject)ConsesLow.list(sksi_conjunctive_removal_module_utilities.$const2$disallowMeaningSentencesForUnboun, sk_source), (SubLObject)sksi_conjunctive_removal_module_utilities.ONE_INTEGER, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        }
        return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 1719L)
    public static SubLObject get_all_meaning_sentence_gafs_for_contextualized_dnf_clause(final SubLObject contextualized_dnf_clause, final SubLObject logical_schemata, final SubLObject sks, SubLObject memoizeP, SubLObject meta_mt, SubLObject strength) {
        if (memoizeP == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (meta_mt == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            meta_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            strength = sksi_macros.$sksi_default_ms_type_check_strength$.getDynamicValue();
        }
        SubLObject meaning_sentence_gafs = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject lit = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        lit = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = lit;
            SubLObject mt = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject asent = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list3);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list3);
            asent = current.first();
            current = current.rest();
            if (sksi_conjunctive_removal_module_utilities.NIL == current) {
                if (sksi_conjunctive_removal_module_utilities.NIL != sksi_query_utilities.comparison_literal_p(asent)) {
                    meaning_sentence_gafs = (SubLObject)ConsesLow.cons((SubLObject)sksi_conjunctive_removal_module_utilities.NIL, meaning_sentence_gafs);
                }
                else {
                    meaning_sentence_gafs = (SubLObject)ConsesLow.cons(Sequences.remove_if((SubLObject)sksi_conjunctive_removal_module_utilities.$sym4$IST_MEANING_SENTENCE_GAF_P, get_all_meaning_sentence_gafs_for_asent(asent, logical_schemata, sks, memoizeP, mt, meta_mt, strength), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED), meaning_sentence_gafs);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list3);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        return Sequences.nreverse(meaning_sentence_gafs);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 2740L)
    public static SubLObject get_all_meaning_sentence_gafs_for_asent(final SubLObject asent, final SubLObject logical_schemata, final SubLObject sks, SubLObject memoizeP, SubLObject mt, SubLObject meta_mt, SubLObject strength) {
        if (memoizeP == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (mt == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (meta_mt == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            meta_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            strength = sksi_macros.$sksi_default_ms_type_check_strength$.getDynamicValue();
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != variables.not_fully_bound_p(cycl_utilities.formula_operator(asent)) && sksi_conjunctive_removal_module_utilities.NIL != sksi_disallow_meaning_sentences_for_unbound_predicatesP(sks)) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        return ConsesLow.append(get_meaning_sentence_gafs_for_asent(asent, logical_schemata, memoizeP, mt, meta_mt, strength), get_conditional_meaning_sentence_gafs_for_asent(asent, logical_schemata, sks, memoizeP, mt, meta_mt, strength));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 3415L)
    public static SubLObject get_meaning_sentence_gafs_for_asent(final SubLObject asent, final SubLObject logical_schemata, SubLObject memoizeP, SubLObject mt, SubLObject meta_mt, SubLObject strength) {
        if (memoizeP == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (mt == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (meta_mt == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            meta_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            strength = sksi_macros.$sksi_default_ms_type_check_strength$.getDynamicValue();
        }
        return (sksi_conjunctive_removal_module_utilities.NIL != memoizeP) ? get_meaning_sentence_gafs_for_asent_memoized(asent, logical_schemata, memoizeP, mt, meta_mt, strength) : get_meaning_sentence_gafs_for_asent_int(asent, logical_schemata, memoizeP, mt, meta_mt, strength);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 4014L)
    public static SubLObject get_meaning_sentence_gafs_for_asent_memoized_internal(final SubLObject asent, final SubLObject logical_schemata, final SubLObject memoizeP, final SubLObject mt, final SubLObject meta_mt, final SubLObject strength) {
        return get_meaning_sentence_gafs_for_asent_int(asent, logical_schemata, memoizeP, mt, meta_mt, strength);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 4014L)
    public static SubLObject get_meaning_sentence_gafs_for_asent_memoized(final SubLObject asent, final SubLObject logical_schemata, final SubLObject memoizeP, final SubLObject mt, final SubLObject meta_mt, final SubLObject strength) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL == v_memoization_state) {
            return get_meaning_sentence_gafs_for_asent_memoized_internal(asent, logical_schemata, memoizeP, mt, meta_mt, strength);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym5$GET_MEANING_SENTENCE_GAFS_FOR_ASENT_MEMOIZED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (sksi_conjunctive_removal_module_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_conjunctive_removal_module_utilities.$sym5$GET_MEANING_SENTENCE_GAFS_FOR_ASENT_MEMOIZED, (SubLObject)sksi_conjunctive_removal_module_utilities.SIX_INTEGER, (SubLObject)sksi_conjunctive_removal_module_utilities.$int6$2048, (SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym5$GET_MEANING_SENTENCE_GAFS_FOR_ASENT_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(asent, logical_schemata, memoizeP, mt, meta_mt, strength);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (asent.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (logical_schemata.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (memoizeP.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (mt.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (meta_mt.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (sksi_conjunctive_removal_module_utilities.NIL != cached_args && sksi_conjunctive_removal_module_utilities.NIL == cached_args.rest() && strength.equal(cached_args.first())) {
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
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_meaning_sentence_gafs_for_asent_memoized_internal(asent, logical_schemata, memoizeP, mt, meta_mt, strength)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(asent, logical_schemata, memoizeP, mt, meta_mt, strength));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 4266L)
    public static SubLObject get_meaning_sentence_gafs_for_asent_int(final SubLObject asent, final SubLObject logical_schemata, final SubLObject memoizeP, final SubLObject mt, final SubLObject meta_mt, final SubLObject strength) {
        final SubLObject meaning_sentence_gafs = sksi_meaning_sentence_utilities.logical_schemata_meaning_sentence_gafs(logical_schemata, memoizeP);
        return filter_meaning_sentence_gafs_for_asent(asent, meaning_sentence_gafs, memoizeP, mt, meta_mt, strength);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 4588L)
    public static SubLObject get_conditional_meaning_sentence_gafs_for_asent(final SubLObject asent, final SubLObject logical_schemata, final SubLObject sks, SubLObject memoizeP, SubLObject mt, SubLObject meta_mt, SubLObject strength) {
        if (memoizeP == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (mt == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (meta_mt == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            meta_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            strength = sksi_macros.$sksi_default_ms_type_check_strength$.getDynamicValue();
        }
        return (sksi_conjunctive_removal_module_utilities.NIL != memoizeP) ? get_conditional_meaning_sentence_gafs_for_asent_memoized(asent, logical_schemata, sks, memoizeP, mt, meta_mt, strength) : get_conditional_meaning_sentence_gafs_for_asent_int(asent, logical_schemata, sks, memoizeP, mt, meta_mt, strength);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 5271L)
    public static SubLObject get_conditional_meaning_sentence_gafs_for_asent_memoized_internal(final SubLObject asent, final SubLObject logical_schemata, final SubLObject sks, final SubLObject memoizeP, final SubLObject mt, final SubLObject meta_mt, final SubLObject strength) {
        return get_conditional_meaning_sentence_gafs_for_asent_int(asent, logical_schemata, sks, memoizeP, mt, meta_mt, strength);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 5271L)
    public static SubLObject get_conditional_meaning_sentence_gafs_for_asent_memoized(final SubLObject asent, final SubLObject logical_schemata, final SubLObject sks, final SubLObject memoizeP, final SubLObject mt, final SubLObject meta_mt, final SubLObject strength) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL == v_memoization_state) {
            return get_conditional_meaning_sentence_gafs_for_asent_memoized_internal(asent, logical_schemata, sks, memoizeP, mt, meta_mt, strength);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym7$GET_CONDITIONAL_MEANING_SENTENCE_GAFS_FOR_ASENT_MEMOIZED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (sksi_conjunctive_removal_module_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_conjunctive_removal_module_utilities.$sym7$GET_CONDITIONAL_MEANING_SENTENCE_GAFS_FOR_ASENT_MEMOIZED, (SubLObject)sksi_conjunctive_removal_module_utilities.SEVEN_INTEGER, (SubLObject)sksi_conjunctive_removal_module_utilities.$int6$2048, (SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym7$GET_CONDITIONAL_MEANING_SENTENCE_GAFS_FOR_ASENT_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_7(asent, logical_schemata, sks, memoizeP, mt, meta_mt, strength);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (asent.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (logical_schemata.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sks.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (memoizeP.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (mt.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (meta_mt.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (sksi_conjunctive_removal_module_utilities.NIL != cached_args && sksi_conjunctive_removal_module_utilities.NIL == cached_args.rest() && strength.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
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
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_conditional_meaning_sentence_gafs_for_asent_memoized_internal(asent, logical_schemata, sks, memoizeP, mt, meta_mt, strength)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(asent, logical_schemata, sks, memoizeP, mt, meta_mt, strength));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 5555L)
    public static SubLObject get_conditional_meaning_sentence_gafs_for_asent_int(final SubLObject asent, final SubLObject logical_schemata, final SubLObject sks, final SubLObject memoizeP, final SubLObject mt, final SubLObject meta_mt, final SubLObject strength) {
        final SubLObject conditional_ms_gafs = sksi_meaning_sentence_utilities.logical_schemata_consequent_conditional_meaning_sentence_gafs(logical_schemata, memoizeP, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        return filter_conditional_meaning_sentence_gafs_for_asent(asent, conditional_ms_gafs, sks, memoizeP, mt, meta_mt, strength);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 5932L)
    public static SubLObject filter_meaning_sentence_gafs_for_asent(final SubLObject asent, final SubLObject meaning_sentence_gafs, SubLObject memoizeP, SubLObject mt, SubLObject meta_mt, SubLObject strength) {
        if (memoizeP == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (mt == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (meta_mt == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            meta_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            strength = sksi_macros.$sksi_default_ms_type_check_strength$.getDynamicValue();
        }
        SubLObject new_gafs = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject cdolist_list_var = meaning_sentence_gafs;
        SubLObject gaf = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
            final SubLObject meaning_sentence = sksi_meaning_sentence_utilities.get_meaning_sentence_from_gaf(gaf, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            if (sksi_conjunctive_removal_module_utilities.NIL != filter_meaning_sentence_for_asent(asent, meaning_sentence, memoizeP, mt, meta_mt, strength)) {
                new_gafs = (SubLObject)ConsesLow.cons(gaf, new_gafs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return new_gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 6511L)
    public static SubLObject filter_conditional_meaning_sentence_gafs_for_asent(final SubLObject asent, final SubLObject conditional_meaning_sentence_gafs, final SubLObject sks, SubLObject memoizeP, SubLObject mt, SubLObject meta_mt, SubLObject strength) {
        if (memoizeP == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (mt == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (meta_mt == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            meta_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            strength = sksi_macros.$sksi_default_ms_type_check_strength$.getDynamicValue();
        }
        SubLObject new_gafs = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject cdolist_list_var = conditional_meaning_sentence_gafs;
        SubLObject gaf = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        gaf = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
            final SubLObject consequent_meaning_sentence = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(gaf, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            final SubLObject antecedent_meaning_sentence = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_gaf(gaf);
            final SubLObject new_consequent_sentence = (sksi_conjunctive_removal_module_utilities.NIL != sksi_meaning_sentence_utilities.meaning_sentence_with_logical_field_indexical_predicateP(consequent_meaning_sentence)) ? sksi_meaning_sentence_utilities.possibly_constrain_consequent_meaning_sentence(antecedent_meaning_sentence, consequent_meaning_sentence) : consequent_meaning_sentence;
            if (sksi_conjunctive_removal_module_utilities.NIL != filter_meaning_sentence_for_asent(asent, new_consequent_sentence, memoizeP, mt, meta_mt, strength) && sksi_conjunctive_removal_module_utilities.NIL != sksi_meaning_sentence_utilities.supported_conditional_meaning_sentence_gaf_p(gaf, sks)) {
                new_gafs = (SubLObject)ConsesLow.cons(gaf, new_gafs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return new_gafs;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 7706L)
    public static SubLObject filter_meaning_sentence_for_asent(final SubLObject asent, final SubLObject meaning_sentence, final SubLObject memoizeP, final SubLObject mt, final SubLObject meta_mt, final SubLObject strength) {
        final SubLObject meaning_sentence_pred = cycl_utilities.formula_operator(meaning_sentence);
        final SubLObject asent_pred = cycl_utilities.formula_operator(asent);
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL != ((sksi_conjunctive_removal_module_utilities.NIL != variables.not_fully_bound_p(asent_pred)) ? SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL != sksi_kb_accessors.logical_field_indexical_p(meaning_sentence_pred) || sksi_conjunctive_removal_module_utilities.NIL != unification.unify(meaning_sentence_pred, asent_pred, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED)) : SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL != genl_pred_meaning_sentenceP(meaning_sentence, asent, mt, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED) || sksi_conjunctive_removal_module_utilities.NIL != genl_inverse_meaning_sentenceP(meaning_sentence, asent, mt, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED))) && sksi_conjunctive_removal_module_utilities.NIL != sksi_meaning_sentence_utilities.meaning_sentence_type_check(asent, meaning_sentence, memoizeP, mt, meta_mt, strength, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 8400L)
    public static SubLObject get_meaning_sentence_gaf_iterators_for_contextualized_dnf_clause(final SubLObject contextualized_dnf_clause, final SubLObject logical_schemata, SubLObject memoizeP, SubLObject meta_mt, SubLObject strength) {
        if (memoizeP == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (meta_mt == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            meta_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            strength = sksi_macros.$sksi_default_ms_type_check_strength$.getDynamicValue();
        }
        SubLObject iterators = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        SubLObject lit = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        lit = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = lit;
            SubLObject mt = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject asent = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list3);
            mt = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list3);
            asent = current.first();
            current = current.rest();
            if (sksi_conjunctive_removal_module_utilities.NIL == current) {
                if (sksi_conjunctive_removal_module_utilities.NIL != sksi_query_utilities.comparison_literal_p(asent)) {
                    iterators = (SubLObject)ConsesLow.cons((SubLObject)sksi_conjunctive_removal_module_utilities.NIL, iterators);
                }
                else {
                    iterators = (SubLObject)ConsesLow.cons(get_meaning_sentence_gaf_iterator_for_asent(asent, logical_schemata, memoizeP, mt, meta_mt, strength, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED), iterators);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list3);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        return Sequences.nreverse(iterators);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 9148L)
    public static SubLObject get_meaning_sentence_gaf_iterator_for_asent(final SubLObject asent, final SubLObject logical_schemata, final SubLObject sks, SubLObject memoizeP, SubLObject mt, SubLObject meta_mt, SubLObject strength) {
        if (memoizeP == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (mt == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (meta_mt == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            meta_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            strength = sksi_macros.$sksi_default_ms_type_check_strength$.getDynamicValue();
        }
        final SubLObject gafs = get_all_meaning_sentence_gafs_for_asent(asent, logical_schemata, sks, memoizeP, mt, meta_mt, strength);
        return (SubLObject)((sksi_conjunctive_removal_module_utilities.NIL != gafs) ? iteration.new_reusable_iterator(gafs, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym8$ITERATE_LIST_DONE, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym9$ITERATE_LIST_NEXT, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED) : sksi_conjunctive_removal_module_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 10993L)
    public static SubLObject meaning_sentence_gaf_iterator_done(final SubLObject state) {
        return Types.sublisp_null(state.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 11083L)
    public static SubLObject meaning_sentence_gaf_iterator_next(final SubLObject state) {
        SubLObject meaning_sentence_gafs = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject asent = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject memoizeP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject mt = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject meta_mt = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject strength = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)sksi_conjunctive_removal_module_utilities.$list10);
        meaning_sentence_gafs = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_conjunctive_removal_module_utilities.$list10);
        asent = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_conjunctive_removal_module_utilities.$list10);
        memoizeP = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_conjunctive_removal_module_utilities.$list10);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_conjunctive_removal_module_utilities.$list10);
        meta_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_conjunctive_removal_module_utilities.$list10);
        strength = current.first();
        current = current.rest();
        if (sksi_conjunctive_removal_module_utilities.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)sksi_conjunctive_removal_module_utilities.$list10);
            return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        final SubLObject remaining_gafs = find_first_applicable_meaning_sentence_gaf_for_asent(asent, meaning_sentence_gafs, memoizeP, mt, meta_mt, strength);
        if (sksi_conjunctive_removal_module_utilities.NIL == remaining_gafs) {
            return Values.values((SubLObject)sksi_conjunctive_removal_module_utilities.NIL, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, (SubLObject)sksi_conjunctive_removal_module_utilities.T);
        }
        ConsesLow.set_nth((SubLObject)sksi_conjunctive_removal_module_utilities.ZERO_INTEGER, state, remaining_gafs.rest());
        return Values.values(remaining_gafs.first(), state, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 11656L)
    public static SubLObject find_first_applicable_meaning_sentence_gaf_for_asent(final SubLObject asent, final SubLObject meaning_sentence_gafs, SubLObject memoizeP, SubLObject mt, SubLObject meta_mt, SubLObject strength) {
        if (memoizeP == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            memoizeP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (mt == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (meta_mt == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            meta_mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (strength == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            strength = sksi_macros.$sksi_default_ms_type_check_strength$.getDynamicValue();
        }
        return (sksi_conjunctive_removal_module_utilities.NIL != memoizeP) ? find_first_applicable_meaning_sentence_gaf_for_asent_memoized(asent, meaning_sentence_gafs, mt, meta_mt, strength) : find_first_applicable_meaning_sentence_gaf_for_asent_int(asent, meaning_sentence_gafs, memoizeP, mt, meta_mt, strength);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 12368L)
    public static SubLObject find_first_applicable_meaning_sentence_gaf_for_asent_memoized_internal(final SubLObject asent, final SubLObject meaning_sentence_gafs, final SubLObject mt, final SubLObject meta_mt, final SubLObject strength) {
        return find_first_applicable_meaning_sentence_gaf_for_asent_int(asent, meaning_sentence_gafs, (SubLObject)sksi_conjunctive_removal_module_utilities.T, mt, meta_mt, strength);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 12368L)
    public static SubLObject find_first_applicable_meaning_sentence_gaf_for_asent_memoized(final SubLObject asent, final SubLObject meaning_sentence_gafs, final SubLObject mt, final SubLObject meta_mt, final SubLObject strength) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL == v_memoization_state) {
            return find_first_applicable_meaning_sentence_gaf_for_asent_memoized_internal(asent, meaning_sentence_gafs, mt, meta_mt, strength);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym11$FIND_FIRST_APPLICABLE_MEANING_SENTENCE_GAF_FOR_ASENT_MEMOIZED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (sksi_conjunctive_removal_module_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_conjunctive_removal_module_utilities.$sym11$FIND_FIRST_APPLICABLE_MEANING_SENTENCE_GAF_FOR_ASENT_MEMOIZED, (SubLObject)sksi_conjunctive_removal_module_utilities.FIVE_INTEGER, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, (SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym11$FIND_FIRST_APPLICABLE_MEANING_SENTENCE_GAF_FOR_ASENT_MEMOIZED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(asent, meaning_sentence_gafs, mt, meta_mt, strength);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (asent.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (meaning_sentence_gafs.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (meta_mt.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (sksi_conjunctive_removal_module_utilities.NIL != cached_args && sksi_conjunctive_removal_module_utilities.NIL == cached_args.rest() && strength.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(find_first_applicable_meaning_sentence_gaf_for_asent_memoized_internal(asent, meaning_sentence_gafs, mt, meta_mt, strength)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(asent, meaning_sentence_gafs, mt, meta_mt, strength));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 12633L)
    public static SubLObject find_first_applicable_meaning_sentence_gaf_for_asent_int(final SubLObject asent, final SubLObject meaning_sentence_gafs, final SubLObject memoizeP, final SubLObject mt, final SubLObject meta_mt, final SubLObject strength) {
        if (sksi_conjunctive_removal_module_utilities.NIL == meaning_sentence_gafs || (sksi_conjunctive_removal_module_utilities.NIL == sksi_meaning_sentence_utilities.ist_meaning_sentence_gaf_p(meaning_sentence_gafs.first()) && sksi_conjunctive_removal_module_utilities.NIL != sksi_meaning_sentence_utilities.meaning_sentence_gaf_type_check(asent, meaning_sentence_gafs.first(), memoizeP, mt, meta_mt, strength))) {
            return meaning_sentence_gafs;
        }
        return find_first_applicable_meaning_sentence_gaf_for_asent_int(asent, meaning_sentence_gafs.rest(), memoizeP, mt, meta_mt, strength);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 13309L)
    public static SubLObject genl_pred_meaning_sentenceP(final SubLObject meaning_sentence, final SubLObject asent, SubLObject mt, SubLObject unwrap_if_istP) {
        if (mt == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            mt = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (unwrap_if_istP == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            unwrap_if_istP = (SubLObject)sksi_conjunctive_removal_module_utilities.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL != variable_predicate_litP(asent) || sksi_conjunctive_removal_module_utilities.NIL != sksi_relevant_spec_preds_from_meaning_sentence(el_utilities.literal_predicate(asent, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED), meaning_sentence, mt, unwrap_if_istP, (SubLObject)sksi_conjunctive_removal_module_utilities.T));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 13694L)
    public static SubLObject genl_inverse_meaning_sentenceP(final SubLObject meaning_sentence, final SubLObject asent, SubLObject mt, SubLObject unwrap_if_istP) {
        if (mt == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            mt = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (unwrap_if_istP == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            unwrap_if_istP = (SubLObject)sksi_conjunctive_removal_module_utilities.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean((sksi_conjunctive_removal_module_utilities.NIL != variable_predicate_litP(asent) && sksi_conjunctive_removal_module_utilities.NIL != binary_litP(asent)) || sksi_conjunctive_removal_module_utilities.NIL != sksi_relevant_spec_inverses_from_meaning_sentence(el_utilities.literal_predicate(asent, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED), meaning_sentence, mt, unwrap_if_istP, (SubLObject)sksi_conjunctive_removal_module_utilities.T));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 14020L)
    public static SubLObject genl_pred_meaning_sentence_gafP(final SubLObject meaning_sentence_gaf, final SubLObject asent, SubLObject unwrap_if_istP) {
        if (unwrap_if_istP == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            unwrap_if_istP = (SubLObject)sksi_conjunctive_removal_module_utilities.T;
        }
        final SubLObject meaning_sentence = sksi_meaning_sentence_utilities.get_meaning_sentence_from_gaf(meaning_sentence_gaf, unwrap_if_istP);
        return genl_pred_meaning_sentenceP(meaning_sentence, asent, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 14300L)
    public static SubLObject genl_pred_consequent_conditional_meaning_sentence_gafP(final SubLObject conditional_meaning_sentence_gaf, final SubLObject asent, SubLObject unwrap_if_istP) {
        if (unwrap_if_istP == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            unwrap_if_istP = (SubLObject)sksi_conjunctive_removal_module_utilities.T;
        }
        final SubLObject consequent_meaning_sentence = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(conditional_meaning_sentence_gaf, unwrap_if_istP);
        return genl_pred_meaning_sentenceP(consequent_meaning_sentence, asent, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 14659L)
    public static SubLObject genl_inverse_meaning_sentence_gafP(final SubLObject meaning_sentence_gaf, final SubLObject asent, SubLObject unwrap_if_istP) {
        if (unwrap_if_istP == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            unwrap_if_istP = (SubLObject)sksi_conjunctive_removal_module_utilities.T;
        }
        final SubLObject meaning_sentence = sksi_meaning_sentence_utilities.get_meaning_sentence_from_gaf(meaning_sentence_gaf, unwrap_if_istP);
        return genl_inverse_meaning_sentenceP(meaning_sentence, asent, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 14944L)
    public static SubLObject genl_inverse_consequent_conditional_meaning_sentence_gafP(final SubLObject conditional_meaning_sentence_gaf, final SubLObject asent, SubLObject unwrap_if_istP) {
        if (unwrap_if_istP == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            unwrap_if_istP = (SubLObject)sksi_conjunctive_removal_module_utilities.T;
        }
        final SubLObject consequent_meaning_sentence = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(conditional_meaning_sentence_gaf, unwrap_if_istP);
        return genl_inverse_meaning_sentenceP(consequent_meaning_sentence, asent, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 15309L)
    public static SubLObject sksi_relevant_spec_preds_from_meaning_sentence(final SubLObject pred, final SubLObject meaning_sentence, SubLObject mt, SubLObject unwrap_if_istP, SubLObject return_one_answerP) {
        if (mt == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            mt = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (unwrap_if_istP == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            unwrap_if_istP = (SubLObject)sksi_conjunctive_removal_module_utilities.T;
        }
        if (return_one_answerP == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            return_one_answerP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        final SubLObject ms_pred = cycl_utilities.formula_operator((sksi_conjunctive_removal_module_utilities.NIL != unwrap_if_istP) ? sksi_meaning_sentence_utilities.unwrap_meaning_sentence_if_ist(meaning_sentence) : meaning_sentence);
        return sksi_relevant_spec_preds_from_meaning_sentence_pred(pred, ms_pred, mt, mt_relevance_macros.mt_info((SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED), return_one_answerP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 15772L)
    public static SubLObject sksi_relevant_spec_preds_from_meaning_sentence_pred_internal(final SubLObject pred, final SubLObject ms_pred, SubLObject genl_pred_mt, SubLObject mt_info, SubLObject return_one_answerP) {
        if (genl_pred_mt == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            genl_pred_mt = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (mt_info == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        }
        if (return_one_answerP == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            return_one_answerP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (sksi_conjunctive_removal_module_utilities.NIL == forts.fort_p(pred)) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        final SubLObject candidate_preds = (SubLObject)((sksi_conjunctive_removal_module_utilities.NIL != sksi_kb_accessors.logical_field_indexical_p(ms_pred)) ? sksi_meaning_sentence_utilities.sksi_code_mapping_predicates_for_logical_field_indexical(ms_pred, mt_info) : ConsesLow.list(ms_pred));
        if (sksi_conjunctive_removal_module_utilities.NIL != return_one_answerP) {
            SubLObject relevant_pred = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            if (sksi_conjunctive_removal_module_utilities.NIL == relevant_pred) {
                SubLObject csome_list_var = candidate_preds;
                SubLObject candidate_pred = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                candidate_pred = csome_list_var.first();
                while (sksi_conjunctive_removal_module_utilities.NIL == relevant_pred && sksi_conjunctive_removal_module_utilities.NIL != csome_list_var) {
                    if (sksi_conjunctive_removal_module_utilities.NIL != sksi_infrastructure_utilities.genl_predicate_memoizedP(candidate_pred, pred, genl_pred_mt, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED)) {
                        relevant_pred = candidate_pred;
                    }
                    csome_list_var = csome_list_var.rest();
                    candidate_pred = csome_list_var.first();
                }
            }
            return relevant_pred;
        }
        SubLObject relevant_preds = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject cdolist_list_var = candidate_preds;
        SubLObject candidate_pred = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        candidate_pred = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
            if (sksi_conjunctive_removal_module_utilities.NIL != sksi_infrastructure_utilities.genl_predicate_memoizedP(candidate_pred, pred, genl_pred_mt, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED)) {
                relevant_preds = (SubLObject)ConsesLow.cons(candidate_pred, relevant_preds);
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_pred = cdolist_list_var.first();
        }
        return relevant_preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 15772L)
    public static SubLObject sksi_relevant_spec_preds_from_meaning_sentence_pred(final SubLObject pred, final SubLObject ms_pred, SubLObject genl_pred_mt, SubLObject mt_info, SubLObject return_one_answerP) {
        if (genl_pred_mt == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            genl_pred_mt = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (mt_info == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        }
        if (return_one_answerP == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            return_one_answerP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL == v_memoization_state) {
            return sksi_relevant_spec_preds_from_meaning_sentence_pred_internal(pred, ms_pred, genl_pred_mt, mt_info, return_one_answerP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym12$SKSI_RELEVANT_SPEC_PREDS_FROM_MEANING_SENTENCE_PRED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (sksi_conjunctive_removal_module_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_conjunctive_removal_module_utilities.$sym12$SKSI_RELEVANT_SPEC_PREDS_FROM_MEANING_SENTENCE_PRED, (SubLObject)sksi_conjunctive_removal_module_utilities.FIVE_INTEGER, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, (SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym12$SKSI_RELEVANT_SPEC_PREDS_FROM_MEANING_SENTENCE_PRED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(pred, ms_pred, genl_pred_mt, mt_info, return_one_answerP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (ms_pred.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (genl_pred_mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (mt_info.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (sksi_conjunctive_removal_module_utilities.NIL != cached_args && sksi_conjunctive_removal_module_utilities.NIL == cached_args.rest() && return_one_answerP.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_relevant_spec_preds_from_meaning_sentence_pred_internal(pred, ms_pred, genl_pred_mt, mt_info, return_one_answerP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, ms_pred, genl_pred_mt, mt_info, return_one_answerP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 16880L)
    public static SubLObject sksi_relevant_spec_inverses_from_meaning_sentence(final SubLObject pred, final SubLObject meaning_sentence, SubLObject mt, SubLObject unwrap_if_istP, SubLObject return_one_answerP) {
        if (mt == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            mt = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (unwrap_if_istP == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            unwrap_if_istP = (SubLObject)sksi_conjunctive_removal_module_utilities.T;
        }
        if (return_one_answerP == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            return_one_answerP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        final SubLObject ms_pred = cycl_utilities.formula_operator((sksi_conjunctive_removal_module_utilities.NIL != unwrap_if_istP) ? sksi_meaning_sentence_utilities.unwrap_meaning_sentence_if_ist(meaning_sentence) : meaning_sentence);
        return sksi_relevant_spec_inverses_from_meaning_sentence_pred(pred, ms_pred, mt, mt_relevance_macros.mt_info((SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED), return_one_answerP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 17348L)
    public static SubLObject sksi_relevant_spec_inverses_from_meaning_sentence_pred_internal(final SubLObject pred, final SubLObject ms_pred, SubLObject genl_inverse_mt, SubLObject mt_info, SubLObject return_one_answerP) {
        if (genl_inverse_mt == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            genl_inverse_mt = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (mt_info == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        }
        if (return_one_answerP == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            return_one_answerP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (sksi_conjunctive_removal_module_utilities.NIL == forts.fort_p(pred)) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        final SubLObject candidate_preds = (SubLObject)((sksi_conjunctive_removal_module_utilities.NIL != sksi_kb_accessors.logical_field_indexical_p(ms_pred)) ? sksi_meaning_sentence_utilities.sksi_code_mapping_predicates_for_logical_field_indexical(ms_pred, mt_info) : ConsesLow.list(ms_pred));
        if (sksi_conjunctive_removal_module_utilities.NIL != return_one_answerP) {
            SubLObject relevant_pred = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            if (sksi_conjunctive_removal_module_utilities.NIL == relevant_pred) {
                SubLObject csome_list_var = candidate_preds;
                SubLObject candidate_pred = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                candidate_pred = csome_list_var.first();
                while (sksi_conjunctive_removal_module_utilities.NIL == relevant_pred && sksi_conjunctive_removal_module_utilities.NIL != csome_list_var) {
                    if (sksi_conjunctive_removal_module_utilities.NIL != sksi_infrastructure_utilities.genl_inverse_memoizedP(candidate_pred, pred, genl_inverse_mt, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED)) {
                        relevant_pred = candidate_pred;
                    }
                    csome_list_var = csome_list_var.rest();
                    candidate_pred = csome_list_var.first();
                }
            }
            return relevant_pred;
        }
        SubLObject relevant_preds = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject cdolist_list_var = candidate_preds;
        SubLObject candidate_pred = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        candidate_pred = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
            if (sksi_conjunctive_removal_module_utilities.NIL != sksi_infrastructure_utilities.genl_inverse_memoizedP(candidate_pred, pred, genl_inverse_mt, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED)) {
                relevant_preds = (SubLObject)ConsesLow.cons(candidate_pred, relevant_preds);
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate_pred = cdolist_list_var.first();
        }
        return relevant_preds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 17348L)
    public static SubLObject sksi_relevant_spec_inverses_from_meaning_sentence_pred(final SubLObject pred, final SubLObject ms_pred, SubLObject genl_inverse_mt, SubLObject mt_info, SubLObject return_one_answerP) {
        if (genl_inverse_mt == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            genl_inverse_mt = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (mt_info == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        }
        if (return_one_answerP == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            return_one_answerP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL == v_memoization_state) {
            return sksi_relevant_spec_inverses_from_meaning_sentence_pred_internal(pred, ms_pred, genl_inverse_mt, mt_info, return_one_answerP);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym13$SKSI_RELEVANT_SPEC_INVERSES_FROM_MEANING_SENTENCE_PRED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (sksi_conjunctive_removal_module_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_conjunctive_removal_module_utilities.$sym13$SKSI_RELEVANT_SPEC_INVERSES_FROM_MEANING_SENTENCE_PRED, (SubLObject)sksi_conjunctive_removal_module_utilities.FIVE_INTEGER, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, (SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym13$SKSI_RELEVANT_SPEC_INVERSES_FROM_MEANING_SENTENCE_PRED, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(pred, ms_pred, genl_inverse_mt, mt_info, return_one_answerP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (ms_pred.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (genl_inverse_mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (mt_info.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (sksi_conjunctive_removal_module_utilities.NIL != cached_args && sksi_conjunctive_removal_module_utilities.NIL == cached_args.rest() && return_one_answerP.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_relevant_spec_inverses_from_meaning_sentence_pred_internal(pred, ms_pred, genl_inverse_mt, mt_info, return_one_answerP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(pred, ms_pred, genl_inverse_mt, mt_info, return_one_answerP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 19151L)
    public static SubLObject sksi_joinability_assertedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sksi_conjunctive_removal_module_utilities.$sksi_asserted_joinabilityP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 19238L)
    public static SubLObject sksi_crm_joinable_asentsP(final SubLObject asents, final SubLObject meaning_sentence_gafs, final SubLObject physical_schemata) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL == sksi_crm_unjoinable_asents_int(asents.first(), asents.rest(), meaning_sentence_gafs.first(), meaning_sentence_gafs.rest(), physical_schemata));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 19572L)
    public static SubLObject sksi_crm_unjoinable_asents_int(final SubLObject asent0, final SubLObject asents, final SubLObject meaning_sentence_gaf0, final SubLObject meaning_sentence_gafs, final SubLObject physical_schemata) {
        if (sksi_conjunctive_removal_module_utilities.NIL == asents) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        SubLObject unjoinableP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        final SubLObject asent0_asent = inference_datastructures_problem_query.contextualized_asent_asent(asent0);
        final SubLObject meaning_sentence0 = sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf(meaning_sentence_gaf0, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (sksi_conjunctive_removal_module_utilities.NIL == unjoinableP) {
            SubLObject asent = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject asent_$1 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject meaning_sentence_gaf = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject meaning_sentence_gaf_$2 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            asent = asents;
            asent_$1 = asent.first();
            meaning_sentence_gaf = meaning_sentence_gafs;
            meaning_sentence_gaf_$2 = meaning_sentence_gaf.first();
            while (sksi_conjunctive_removal_module_utilities.NIL == unjoinableP && (sksi_conjunctive_removal_module_utilities.NIL != meaning_sentence_gaf || sksi_conjunctive_removal_module_utilities.NIL != asent)) {
                final SubLObject meaning_sentence2 = sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf(meaning_sentence_gaf_$2, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                final SubLObject asent_asent = inference_datastructures_problem_query.contextualized_asent_asent(asent_$1);
                unjoinableP = sksi_crm_literals_incoherent_together(asent0_asent, meaning_sentence0, asent_asent, meaning_sentence2, physical_schemata);
                asent = asent.rest();
                asent_$1 = asent.first();
                meaning_sentence_gaf = meaning_sentence_gaf.rest();
                meaning_sentence_gaf_$2 = meaning_sentence_gaf.first();
            }
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != unjoinableP) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.T;
        }
        return sksi_crm_unjoinable_asents_int(asents.first(), asents.rest(), meaning_sentence_gafs.first(), meaning_sentence_gafs.rest(), physical_schemata);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 20722L)
    public static SubLObject sksi_crm_literal_coherent_with_other_literalsP(final SubLObject lit, final SubLObject meaning_sentence_gaf, final SubLObject other_lits, final SubLObject other_meaning_sentence_gafs, final SubLObject physical_schemata) {
        SubLObject incoherentP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject mt = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject asent = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(lit, lit, (SubLObject)sksi_conjunctive_removal_module_utilities.$list3);
        mt = lit.first();
        SubLObject current = lit.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, lit, (SubLObject)sksi_conjunctive_removal_module_utilities.$list3);
        asent = current.first();
        current = current.rest();
        if (sksi_conjunctive_removal_module_utilities.NIL == current) {
            final SubLObject ms = sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf(meaning_sentence_gaf, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            final SubLObject genl_pred_msP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL != sksi_meaning_sentence_utilities.meaning_sentence_with_logical_field_indexical_predicateP(ms) || sksi_conjunctive_removal_module_utilities.NIL != genl_pred_meaning_sentenceP(ms, asent, mt, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED));
            final SubLObject genl_inv_msP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL != sksi_meaning_sentence_utilities.meaning_sentence_with_logical_field_indexical_predicateP(ms) || sksi_conjunctive_removal_module_utilities.NIL != genl_inverse_meaning_sentenceP(ms, asent, mt, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED));
            if (sksi_conjunctive_removal_module_utilities.NIL == incoherentP) {
                SubLObject other_lit = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                SubLObject other_lit_$3 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                SubLObject other_meaning_sentence_gaf = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                SubLObject other_meaning_sentence_gaf_$4 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                other_lit = other_lits;
                other_lit_$3 = other_lit.first();
                other_meaning_sentence_gaf = other_meaning_sentence_gafs;
                other_meaning_sentence_gaf_$4 = other_meaning_sentence_gaf.first();
                while (sksi_conjunctive_removal_module_utilities.NIL == incoherentP && (sksi_conjunctive_removal_module_utilities.NIL != other_meaning_sentence_gaf || sksi_conjunctive_removal_module_utilities.NIL != other_lit)) {
                    SubLObject coherentP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                    SubLObject current_$6;
                    final SubLObject datum_$5 = current_$6 = other_lit_$3;
                    SubLObject other_mt = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                    SubLObject other_asent = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$6, datum_$5, (SubLObject)sksi_conjunctive_removal_module_utilities.$list14);
                    other_mt = current_$6.first();
                    current_$6 = current_$6.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$6, datum_$5, (SubLObject)sksi_conjunctive_removal_module_utilities.$list14);
                    other_asent = current_$6.first();
                    current_$6 = current_$6.rest();
                    if (sksi_conjunctive_removal_module_utilities.NIL == current_$6) {
                        final SubLObject other_ms = sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf(other_meaning_sentence_gaf_$4, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                        final SubLObject other_genl_pred_msP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL != sksi_meaning_sentence_utilities.meaning_sentence_with_logical_field_indexical_predicateP(other_ms) || sksi_conjunctive_removal_module_utilities.NIL != genl_pred_meaning_sentenceP(other_ms, other_asent, other_mt, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED));
                        final SubLObject other_genl_inv_msP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL != sksi_meaning_sentence_utilities.meaning_sentence_with_logical_field_indexical_predicateP(other_ms) || sksi_conjunctive_removal_module_utilities.NIL != genl_inverse_meaning_sentenceP(other_ms, other_asent, other_mt, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED));
                        if (sksi_conjunctive_removal_module_utilities.NIL != genl_pred_msP) {
                            if (sksi_conjunctive_removal_module_utilities.NIL != other_genl_pred_msP && sksi_conjunctive_removal_module_utilities.NIL == sksi_crm_literals_incoherent_together(asent, ms, other_asent, other_ms, physical_schemata)) {
                                coherentP = (SubLObject)sksi_conjunctive_removal_module_utilities.T;
                            }
                            if (sksi_conjunctive_removal_module_utilities.NIL == coherentP && sksi_conjunctive_removal_module_utilities.NIL != other_genl_inv_msP) {
                                final SubLObject other_operator = cycl_utilities.formula_operator(other_asent);
                                final SubLObject other_args = Sequences.reverse(cycl_utilities.formula_args(other_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED));
                                final SubLObject other_inv_asent = el_utilities.make_formula(other_operator, other_args, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                if (sksi_conjunctive_removal_module_utilities.NIL == sksi_crm_literals_incoherent_together(asent, ms, other_inv_asent, other_ms, physical_schemata)) {
                                    coherentP = (SubLObject)sksi_conjunctive_removal_module_utilities.T;
                                }
                            }
                        }
                        if (sksi_conjunctive_removal_module_utilities.NIL == coherentP && sksi_conjunctive_removal_module_utilities.NIL != genl_inv_msP) {
                            final SubLObject operator = cycl_utilities.formula_operator(asent);
                            final SubLObject args = Sequences.reverse(cycl_utilities.formula_args(asent, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED));
                            final SubLObject inv_asent = el_utilities.make_formula(operator, args, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                            if (sksi_conjunctive_removal_module_utilities.NIL != other_genl_pred_msP && sksi_conjunctive_removal_module_utilities.NIL == sksi_crm_literals_incoherent_together(inv_asent, ms, other_asent, other_ms, physical_schemata)) {
                                coherentP = (SubLObject)sksi_conjunctive_removal_module_utilities.T;
                            }
                            if (sksi_conjunctive_removal_module_utilities.NIL == coherentP && sksi_conjunctive_removal_module_utilities.NIL != other_genl_inv_msP) {
                                final SubLObject other_operator2 = cycl_utilities.formula_operator(other_asent);
                                final SubLObject other_args2 = Sequences.reverse(cycl_utilities.formula_args(other_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED));
                                final SubLObject other_inv_asent2 = el_utilities.make_formula(other_operator2, other_args2, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                if (sksi_conjunctive_removal_module_utilities.NIL == sksi_crm_literals_incoherent_together(inv_asent, ms, other_inv_asent2, other_ms, physical_schemata)) {
                                    coherentP = (SubLObject)sksi_conjunctive_removal_module_utilities.T;
                                }
                            }
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$5, (SubLObject)sksi_conjunctive_removal_module_utilities.$list14);
                    }
                    incoherentP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL == coherentP);
                    other_lit = other_lit.rest();
                    other_lit_$3 = other_lit.first();
                    other_meaning_sentence_gaf = other_meaning_sentence_gaf.rest();
                    other_meaning_sentence_gaf_$4 = other_meaning_sentence_gaf.first();
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(lit, (SubLObject)sksi_conjunctive_removal_module_utilities.$list3);
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL == incoherentP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 24121L)
    public static SubLObject sksi_crm_literals_incoherent_together(final SubLObject lit0, final SubLObject lit0_meaning_sentence, final SubLObject lit1, final SubLObject lit1_meaning_sentence, final SubLObject physical_schemata) {
        final SubLObject lit0_list = el_utilities.elf_to_list(lit0);
        final SubLObject lit1_list = el_utilities.elf_to_list(lit1);
        final SubLObject lit0_meaning_sentence_list = el_utilities.elf_to_list(lit0_meaning_sentence);
        final SubLObject lit1_meaning_sentence_list = el_utilities.elf_to_list(lit1_meaning_sentence);
        final SubLObject lit0_vars = list_utilities.tree_gather(lit0_list, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym15$VARIABLE_P, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQ), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        SubLObject incoherentP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL == incoherentP) {
            SubLObject csome_list_var = lit0_vars;
            SubLObject lit0_var = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            lit0_var = csome_list_var.first();
            while (sksi_conjunctive_removal_module_utilities.NIL == incoherentP && sksi_conjunctive_removal_module_utilities.NIL != csome_list_var) {
                final SubLObject lit1_var_position = list_utilities.tree_position_bfs(lit0_var, lit1_list, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQ));
                if (sksi_conjunctive_removal_module_utilities.NIL != lit1_var_position) {
                    final SubLObject lit0_var_position = list_utilities.tree_position_bfs(lit0_var, lit0_list, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQ));
                    final SubLObject lit0_meaning_sentence_term = list_utilities.get_nested_nth(lit0_meaning_sentence_list, lit0_var_position, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                    final SubLObject lit1_meaning_sentence_term = list_utilities.get_nested_nth(lit1_meaning_sentence_list, lit1_var_position, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                    incoherentP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL == lit0_meaning_sentence_term || sksi_conjunctive_removal_module_utilities.NIL == lit1_meaning_sentence_term);
                    if (sksi_conjunctive_removal_module_utilities.NIL == incoherentP && !lit0_meaning_sentence_term.equal(lit1_meaning_sentence_term)) {
                        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_kb_accessors.logical_field_indexical_p(lit0_meaning_sentence_term) && sksi_conjunctive_removal_module_utilities.NIL != sksi_kb_accessors.logical_field_indexical_p(lit1_meaning_sentence_term)) {
                            incoherentP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL == logical_field_indexicals_joinableP(lit0_meaning_sentence_term, lit1_meaning_sentence_term, physical_schemata));
                        }
                        else {
                            incoherentP = (SubLObject)SubLObjectFactory.makeBoolean(!lit0_meaning_sentence_term.equal(lit1_meaning_sentence_term));
                        }
                    }
                }
                csome_list_var = csome_list_var.rest();
                lit0_var = csome_list_var.first();
            }
        }
        return incoherentP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 25961L)
    public static SubLObject logical_field_indexicals_joinableP_internal(final SubLObject lfi0, final SubLObject lfi1, SubLObject physical_schemata) {
        if (physical_schemata == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        return (SubLObject)((sksi_conjunctive_removal_module_utilities.NIL != sksi_joinability_assertedP()) ? logical_field_indexicals_joinable_asserted(lfi0, lfi1) : SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL != logical_field_indexicals_joinable_asserted(lfi0, lfi1) || sksi_conjunctive_removal_module_utilities.NIL != logical_field_indexicals_joinable_deduced(lfi0, lfi1, physical_schemata)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 25961L)
    public static SubLObject logical_field_indexicals_joinableP(final SubLObject lfi0, final SubLObject lfi1, SubLObject physical_schemata) {
        if (physical_schemata == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            physical_schemata = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL == v_memoization_state) {
            return logical_field_indexicals_joinableP_internal(lfi0, lfi1, physical_schemata);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym16$LOGICAL_FIELD_INDEXICALS_JOINABLE_, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (sksi_conjunctive_removal_module_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_conjunctive_removal_module_utilities.$sym16$LOGICAL_FIELD_INDEXICALS_JOINABLE_, (SubLObject)sksi_conjunctive_removal_module_utilities.THREE_INTEGER, (SubLObject)sksi_conjunctive_removal_module_utilities.$int17$1000, (SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym16$LOGICAL_FIELD_INDEXICALS_JOINABLE_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(lfi0, lfi1, physical_schemata);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (lfi0.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (lfi1.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sksi_conjunctive_removal_module_utilities.NIL != cached_args && sksi_conjunctive_removal_module_utilities.NIL == cached_args.rest() && physical_schemata.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(logical_field_indexicals_joinableP_internal(lfi0, lfi1, physical_schemata)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(lfi0, lfi1, physical_schemata));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 26409L)
    public static SubLObject logical_field_indexicals_joinable_asserted(final SubLObject lfi0, final SubLObject lfi1) {
        final SubLObject lf0 = sksi_kb_accessors.logical_field_for_indexical(lfi0);
        final SubLObject lf2 = sksi_kb_accessors.logical_field_for_indexical(lfi1);
        if (sksi_conjunctive_removal_module_utilities.NIL == lf0) {
            Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw18$SKSI_MISSING_LOGICAL_FIELD_FOR_INDEXICAL, lfi0);
        }
        if (sksi_conjunctive_removal_module_utilities.NIL == lf2) {
            Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw18$SKSI_MISSING_LOGICAL_FIELD_FOR_INDEXICAL, lfi1);
        }
        return sksi_kb_accessors.logical_fields_joinableP(lf0, lf2, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 26787L)
    public static SubLObject logical_field_indexicals_joinable_deduced(final SubLObject lfi0, final SubLObject lfi1, final SubLObject physical_schemata) {
        SubLObject decodings0 = sksi_field_translation_utilities.generate_decoding_compositions_for_logical_field_indexical(lfi0, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        SubLObject decodings2 = sksi_field_translation_utilities.generate_decoding_compositions_for_logical_field_indexical(lfi1, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (sksi_conjunctive_removal_module_utilities.NIL != physical_schemata) {
            decodings0 = sksi_field_translation_utilities.filter_decodings(decodings0, physical_schemata);
            decodings2 = sksi_field_translation_utilities.filter_decodings(decodings2, physical_schemata);
        }
        return sksi_field_translation_utilities.some_decodings_equivalentP(decodings0, decodings2, (SubLObject)sksi_conjunctive_removal_module_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 27293L)
    public static SubLObject sksi_generate_csql_where_lists_for_fixed_physical_indexicals(final SubLObject lit, final SubLObject sks_profile, final SubLObject logical_schemata, final SubLObject tac, final SubLObject fixed_physical_field_indexicals) {
        final SubLObject physical_schemata = sksi_query_datastructures.sks_profile_physical_schemata(sks_profile);
        SubLObject result = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject cdolist_list_var = fixed_physical_field_indexicals;
        SubLObject pfi = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        pfi = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
            final SubLObject table_name = sksi_kb_accessors.physical_field_indexical_sk_source_name(pfi);
            final SubLObject namespace = sksi_kb_accessors.physical_field_indexical_sk_source_namespace(pfi);
            final SubLObject aliasing_index = sksi_kb_accessors.pfi_index_for_pfi(pfi, (SubLObject)sksi_conjunctive_removal_module_utilities.ZERO_INTEGER);
            final SubLObject alias = sksi_query_datastructures.tac_alias_table(tac, lit, table_name, namespace, aliasing_index);
            final SubLObject fixed_value = sksi_csql_generation.sksi_fixed_physical_field_indexical_value(pfi, logical_schemata, physical_schemata);
            final SubLObject pf = sksi_kb_accessors.physical_field_for_indexical(pfi);
            if (sksi_conjunctive_removal_module_utilities.NIL != pf) {
                final SubLObject field_name = sksi_kb_accessors.physical_field_name(pf);
                final SubLObject field_expression = sksi_csql_utilities.construct_csql_field_expression(field_name, alias, namespace);
                final SubLObject pair = (SubLObject)((sksi_conjunctive_removal_module_utilities.NIL != kb_utilities.kbeq(sksi_conjunctive_removal_module_utilities.$const19$StringObject, sksi_kb_accessors.physical_field_data_type(pf))) ? ConsesLow.list(sksi_conjunctive_removal_module_utilities.$const20$CSQLEquals, field_expression, fixed_value) : ConsesLow.list(sksi_csql_generation.$csql_default_db_equals$.getGlobalValue(), field_expression, fixed_value));
                result = (SubLObject)ConsesLow.cons(pair, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pfi = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 28626L)
    public static SubLObject sksi_sort_asents_and_meaning_sentence_gafs(SubLObject asents, final SubLObject meaning_sentence_gafs, SubLObject comparison_asents) {
        if (comparison_asents == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            comparison_asents = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != comparison_asents) {
            asents = ConsesLow.append(asents, comparison_asents);
        }
        SubLObject sorted_asents = sksi_sort_asents(asents);
        final SubLObject sorted_meaning_sentence_gafs = (SubLObject)ConsesLow.make_list(Sequences.length(meaning_sentence_gafs), (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        SubLObject sorted_comparison_asents = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject comparison_literal_reorderings = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject list_var = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject sorted_asent = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject insert_index = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        list_var = sorted_asents;
        sorted_asent = list_var.first();
        for (insert_index = (SubLObject)sksi_conjunctive_removal_module_utilities.ZERO_INTEGER; sksi_conjunctive_removal_module_utilities.NIL != list_var; list_var = list_var.rest(), sorted_asent = list_var.first(), insert_index = Numbers.add((SubLObject)sksi_conjunctive_removal_module_utilities.ONE_INTEGER, insert_index)) {
            final SubLObject pos = Sequences.position(sorted_asent, comparison_asents, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            if (sksi_conjunctive_removal_module_utilities.NIL != subl_promotions.non_negative_integer_p(pos)) {
                comparison_literal_reorderings = (SubLObject)ConsesLow.cons(insert_index, comparison_literal_reorderings);
                sorted_comparison_asents = (SubLObject)ConsesLow.cons(sorted_asent, sorted_comparison_asents);
            }
        }
        sorted_comparison_asents = Sequences.nreverse(sorted_comparison_asents);
        if (sksi_conjunctive_removal_module_utilities.NIL != comparison_literal_reorderings) {
            SubLObject cdolist_list_var = comparison_literal_reorderings;
            SubLObject comparison_asent_index = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            comparison_asent_index = cdolist_list_var.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
                sorted_asents = list_utilities.remove_nth(comparison_asent_index, sorted_asents);
                cdolist_list_var = cdolist_list_var.rest();
                comparison_asent_index = cdolist_list_var.first();
            }
        }
        comparison_literal_reorderings = Sequences.nreverse(comparison_literal_reorderings);
        comparison_literal_reorderings = (SubLObject)ConsesLow.cons(Sequences.length(asents), comparison_literal_reorderings);
        list_var = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        sorted_asent = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject new_index = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        list_var = sorted_asents;
        sorted_asent = list_var.first();
        for (new_index = (SubLObject)sksi_conjunctive_removal_module_utilities.ZERO_INTEGER; sksi_conjunctive_removal_module_utilities.NIL != list_var; list_var = list_var.rest(), sorted_asent = list_var.first(), new_index = Numbers.add((SubLObject)sksi_conjunctive_removal_module_utilities.ONE_INTEGER, new_index)) {
            final SubLObject old_index = Sequences.position(sorted_asent, asents, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            ConsesLow.set_nth(new_index, sorted_meaning_sentence_gafs, ConsesLow.nth(old_index, meaning_sentence_gafs));
        }
        return Values.values(sorted_asents, sorted_meaning_sentence_gafs, sorted_comparison_asents, comparison_literal_reorderings);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 30748L)
    public static SubLObject sksi_sort_asents(SubLObject asents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        asents = conses_high.copy_list(asents);
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_sort_bound_variables$.getDynamicValue(thread)) {
            return sksi_sort_asents_rest((SubLObject)sksi_conjunctive_removal_module_utilities.NIL, asents, sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_sort_bound_variables$.getDynamicValue(thread));
        }
        thread.resetMultipleValues();
        final SubLObject first_asent = sksi_sort_compute_best_initial_asent(asents);
        final SubLObject rest_asents = thread.secondMultipleValue();
        final SubLObject unbound_vars = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (sksi_conjunctive_removal_module_utilities.NIL == first_asent) {
            return sksi_sort_asents_rest(asents, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, unbound_vars);
        }
        final SubLObject selected_asents = (SubLObject)ConsesLow.list(first_asent);
        final SubLObject unselected_asents = rest_asents;
        return sksi_sort_asents_rest(selected_asents, unselected_asents, unbound_vars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 31383L)
    public static SubLObject sksi_sort_asents_rest(SubLObject selected_asents, SubLObject unselected_asents, SubLObject unbound_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                while (sksi_conjunctive_removal_module_utilities.NIL != unselected_asents) {
                    final SubLObject most_constrainted_asent = sksi_sort_select_best_asent(unselected_asents, unbound_vars);
                    final SubLObject newly_constrained_vars = sksi_determine_newly_constrained_vars(most_constrainted_asent, unbound_vars);
                    selected_asents = (SubLObject)ConsesLow.cons(most_constrainted_asent, selected_asents);
                    unselected_asents = list_utilities.delete_first(most_constrainted_asent, unselected_asents, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL));
                    unbound_vars = conses_high.nset_difference(unbound_vars, newly_constrained_vars, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQ), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_conjunctive_removal_module_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(selected_asents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 32155L)
    public static SubLObject sksi_sort_compute_best_initial_asent(final SubLObject asents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject first_asent = inference_utilities.join_ordered_committed_literal(clauses.make_clause((SubLObject)sksi_conjunctive_removal_module_utilities.NIL, asents), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        final SubLObject sense = thread.secondMultipleValue();
        final SubLObject preference = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (sksi_conjunctive_removal_module_utilities.NIL != preference_modules.disallowed_or_doomed_preference_level_p(preference)) {
            return Values.values((SubLObject)sksi_conjunctive_removal_module_utilities.NIL, asents, variables.gather_hl_variables(asents));
        }
        final SubLObject rest_asents = Sequences.delete(first_asent, asents, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        final SubLObject first_vars = variables.gather_hl_variables(first_asent);
        final SubLObject rest_vars = variables.gather_hl_variables(rest_asents);
        final SubLObject unbound_vars = conses_high.nset_difference(rest_vars, first_vars, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQ), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        return Values.values(first_asent, rest_asents, unbound_vars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 32855L)
    public static SubLObject sksi_determine_newly_constrained_vars(final SubLObject most_constrainted_asent, final SubLObject unbound_vars) {
        SubLObject newly_constrained_vars = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject cdolist_list_var = unbound_vars;
        SubLObject unbound_var = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        unbound_var = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
            if (sksi_conjunctive_removal_module_utilities.NIL != list_utilities.simple_tree_findP(unbound_var, most_constrainted_asent)) {
                newly_constrained_vars = (SubLObject)ConsesLow.cons(unbound_var, newly_constrained_vars);
            }
            cdolist_list_var = cdolist_list_var.rest();
            unbound_var = cdolist_list_var.first();
        }
        return Sequences.nreverse(newly_constrained_vars);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 33356L)
    public static SubLObject sksi_sort_asents_bound_var_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL != variables.variable_p(v_object) && sksi_conjunctive_removal_module_utilities.NIL == list_utilities.member_eqP(v_object, sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_unbound_vars$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 33527L)
    public static SubLObject sksi_sort_asents_unbound_var_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL != variables.variable_p(v_object) && sksi_conjunctive_removal_module_utilities.NIL != list_utilities.member_eqP(v_object, sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_unbound_vars$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 34131L)
    public static SubLObject sksi_sort_asents_use_cost_path_lookahead_methodP(final SubLObject unselected_asents) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL == sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_use_cost_path_lookahead_methodP$.getDynamicValue(thread) || (sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_override_cost_path_lookahead_method_max_literal_count$.getDynamicValue(thread).isInteger() && Sequences.length(unselected_asents).numG(sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_override_cost_path_lookahead_method_max_literal_count$.getDynamicValue(thread))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 34494L)
    public static SubLObject sksi_sort_select_best_asent(final SubLObject unselected_asents, final SubLObject unbound_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        final SubLObject _prev_bind_0 = sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_unselected_asents$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_unbound_vars$.currentBinding(thread);
        try {
            sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_unselected_asents$.bind(unselected_asents, thread);
            sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_unbound_vars$.bind(unbound_vars, thread);
            if (sksi_conjunctive_removal_module_utilities.NIL != sksi_sort_asents_use_cost_path_lookahead_methodP(unselected_asents)) {
                result = list_utilities.extremal(unselected_asents, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym24$SKSI_ASENT_BETTER_P, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            }
            else {
                result = sksi_sort_select_best_asent_with_cost_path_lookahead(unselected_asents, unbound_vars);
            }
        }
        finally {
            sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_unbound_vars$.rebind(_prev_bind_2, thread);
            sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_unselected_asents$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 35035L)
    public static SubLObject sksi_sort_select_best_asent_and_cost_values(final SubLObject unselected_asents, final SubLObject unbound_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject result_cost_path = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        final SubLObject _prev_bind_0 = sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_unselected_asents$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_unbound_vars$.currentBinding(thread);
        try {
            sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_unselected_asents$.bind(unselected_asents, thread);
            sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_unbound_vars$.bind(unbound_vars, thread);
            if (sksi_conjunctive_removal_module_utilities.NIL != sksi_sort_asents_use_cost_path_lookahead_methodP(unselected_asents)) {
                result = list_utilities.extremal(unselected_asents, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym24$SKSI_ASENT_BETTER_P, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            }
            else {
                thread.resetMultipleValues();
                final SubLObject result_$8 = sksi_sort_select_best_asent_with_cost_path_lookahead(unselected_asents, unbound_vars);
                final SubLObject result_cost_path_$9 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = result_$8;
                result_cost_path = result_cost_path_$9;
            }
        }
        finally {
            sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_unbound_vars$.rebind(_prev_bind_2, thread);
            sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_unselected_asents$.rebind(_prev_bind_0, thread);
        }
        return Values.values(result, result_cost_path);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 35741L)
    public static SubLObject sksi_sort_select_best_asent_with_cost_path_lookahead(final SubLObject unselected_asents, final SubLObject unbound_vars) {
        final SubLObject candidate_results = list_utilities.extremals(unselected_asents, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym25$SKSI_ASENT_BETTER_WRT_PRIMARY_CHARACTERICS, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        SubLObject result = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject result_cost_path = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL != list_utilities.singletonP(candidate_results)) {
            result = candidate_results.first();
            result_cost_path = sksi_sort_asent_estimated_cost_path(result, unselected_asents, unbound_vars);
        }
        else {
            SubLObject result_cost_path_alist = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject cdolist_list_var = candidate_results;
            SubLObject candidate_result = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            candidate_result = cdolist_list_var.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
                result_cost_path_alist = list_utilities.alist_enter(result_cost_path_alist, candidate_result, sksi_sort_asent_estimated_cost_path(candidate_result, unselected_asents, unbound_vars), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                candidate_result = cdolist_list_var.first();
            }
            final SubLObject result_cost_path_pair = list_utilities.extremal(result_cost_path_alist, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym26$ASENT_AND_COST_PATH__, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            result = result_cost_path_pair.first();
            result_cost_path = result_cost_path_pair.rest();
        }
        return Values.values(result, result_cost_path);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 37104L)
    public static SubLObject sksi_sort_asent_estimated_cost_path_transform_asent_elem(final SubLObject asent_elem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_conjunctive_removal_module_utilities.NIL != variables.variable_p(asent_elem) && sksi_conjunctive_removal_module_utilities.NIL == list_utilities.member_eqP(asent_elem, sksi_conjunctive_removal_module_utilities.$sksi_sort_asent_estimated_cost_path_transform_asent_unbound_vars$.getDynamicValue(thread))) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.$kw27$FULLY_BOUND;
        }
        return asent_elem;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 37385L)
    public static SubLObject asent_and_cost_path_L(final SubLObject asent_cost_path1, final SubLObject asent_cost_path2) {
        if (sksi_conjunctive_removal_module_utilities.NIL != cost_path_L(asent_cost_path1.rest(), asent_cost_path2.rest())) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.T;
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != cost_path_L(asent_cost_path2.rest(), asent_cost_path1.rest())) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_asent_better_wrt_secondary_characterics(asent_cost_path1.first(), asent_cost_path2.first())) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.T;
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_asent_better_wrt_secondary_characterics(asent_cost_path2.first(), asent_cost_path1.first())) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 37883L)
    public static SubLObject cost_path_L(final SubLObject path1, final SubLObject path2) {
        if (sksi_conjunctive_removal_module_utilities.NIL == path1) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (sksi_conjunctive_removal_module_utilities.NIL == path2) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.T;
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != list_utilities.singletonP(path2) && sksi_conjunctive_removal_module_utilities.NIL == list_utilities.singletonP(path1)) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.T;
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != list_utilities.singletonP(path1) && sksi_conjunctive_removal_module_utilities.NIL == list_utilities.singletonP(path2)) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        final SubLObject path1_cost = cost_path_computed_cost(path1);
        final SubLObject path2_cost = cost_path_computed_cost(path2);
        if (path1_cost.numE(path2_cost)) {
            return cost_path_L_wrt_first_differing_cost(path1, path2);
        }
        return Numbers.numL(path1_cost, path2_cost);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 38414L)
    public static SubLObject cost_path_computed_cost(final SubLObject path) {
        if (sksi_conjunctive_removal_module_utilities.NIL == path) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.ONE_INTEGER;
        }
        return Numbers.multiply(path.first(), cost_path_computed_cost(path.rest()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 38572L)
    public static SubLObject cost_path_L_wrt_first_differing_cost(final SubLObject path1, final SubLObject path2) {
        if (sksi_conjunctive_removal_module_utilities.NIL == path1) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (sksi_conjunctive_removal_module_utilities.NIL == path2) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.T;
        }
        if (path1.first().numG(path2.first())) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (path1.first().numL(path2.first())) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.T;
        }
        return cost_path_L_wrt_first_differing_cost(path1.rest(), path2.rest());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 40194L)
    public static SubLObject sksi_sort_asent_estimated_cost_path_internal(final SubLObject contextualized_asent, final SubLObject unselected_asents, final SubLObject unbound_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cost = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject cost_path = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        final SubLObject asent = inference_datastructures_problem_query.contextualized_asent_asent(contextualized_asent);
        final SubLObject asent_vars = list_utilities.find_all_if((SubLObject)sksi_conjunctive_removal_module_utilities.$sym15$VARIABLE_P, asent, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        final SubLObject asent_var_count = Sequences.length(asent_vars);
        SubLObject asent_unbound_vars = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject bound_asent = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        final SubLObject _prev_bind_0 = sksi_conjunctive_removal_module_utilities.$sksi_sort_asent_estimated_cost_path_transform_asent_unbound_vars$.currentBinding(thread);
        try {
            sksi_conjunctive_removal_module_utilities.$sksi_sort_asent_estimated_cost_path_transform_asent_unbound_vars$.bind(unbound_vars, thread);
            bound_asent = list_utilities.tree_transform_if(asent, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym15$VARIABLE_P, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym36$SKSI_SORT_ASENT_ESTIMATED_COST_PATH_TRANSFORM_ASENT_ELEM, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        }
        finally {
            sksi_conjunctive_removal_module_utilities.$sksi_sort_asent_estimated_cost_path_transform_asent_unbound_vars$.rebind(_prev_bind_0, thread);
        }
        asent_unbound_vars = list_utilities.find_all_if((SubLObject)sksi_conjunctive_removal_module_utilities.$sym15$VARIABLE_P, bound_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        cost = sksi_query_utilities.look_up_sksi_query_cost_asent_sense(bound_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.$kw0$POS, sksi_conjunctive_removal_module_utilities.$const37$CCF_SDB_SDBMySQLExportStore_Cyc_K, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_evaluatable_predicateP(cycl_utilities.atomic_sentence_predicate(asent))) {
            if (sksi_conjunctive_removal_module_utilities.NIL != sksi_evaluatable_predicateP(cycl_utilities.atomic_sentence_predicate(asent)) && sksi_conjunctive_removal_module_utilities.NIL != asent_unbound_vars) {
                cost = (SubLObject)sksi_conjunctive_removal_module_utilities.$int38$88888888;
            }
            else if (sksi_conjunctive_removal_module_utilities.NIL != list_utilities.lengthGE(asent_vars, (SubLObject)sksi_conjunctive_removal_module_utilities.TWO_INTEGER, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED)) {
                cost = sksi_conjunctive_removal_module_utilities.$sksi_asent_cost_constant_2_unbound_var_evaluate_cost$.getDynamicValue(thread);
            }
            else {
                cost = sksi_conjunctive_removal_module_utilities.$sksi_asent_cost_constant_sksi_cost_dne$.getDynamicValue(thread);
            }
        }
        else {
            SubLObject new_unselected_asents = Sequences.remove(contextualized_asent, unselected_asents, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            final SubLObject new_unbound_vars = conses_high.set_difference(unbound_vars, asent_vars, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            final SubLObject var_reachable_equivalence_map = simplification_modules.new_equivalence_map((SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            SubLObject cdolist_list_var = unselected_asents;
            SubLObject unselected_asent = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            unselected_asent = cdolist_list_var.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
                final SubLObject unselected_asent_asent = inference_datastructures_problem_query.contextualized_asent_asent(unselected_asent);
                final SubLObject unselected_asent_vars = list_utilities.find_all_if((SubLObject)sksi_conjunctive_removal_module_utilities.$sym15$VARIABLE_P, unselected_asent_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                final SubLObject unselected_asent_var_count = Sequences.length(unselected_asent_vars);
                if (sksi_conjunctive_removal_module_utilities.NIL != list_utilities.doubletonP(asent_unbound_vars)) {
                    simplification_modules.equivalence_map_join(asent_unbound_vars.first(), conses_high.second(asent_unbound_vars), var_reachable_equivalence_map);
                }
                SubLObject cdolist_list_var_$10 = unselected_asent_vars;
                SubLObject unselected_asent_var = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                unselected_asent_var = cdolist_list_var_$10.first();
                while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var_$10) {
                    simplification_modules.equivalence_map_insert(unselected_asent_var, var_reachable_equivalence_map);
                    cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                    unselected_asent_var = cdolist_list_var_$10.first();
                }
                if (sksi_conjunctive_removal_module_utilities.TWO_INTEGER.numE(unselected_asent_var_count)) {
                    simplification_modules.equivalence_map_join(unselected_asent_vars.first(), conses_high.second(unselected_asent_vars), var_reachable_equivalence_map);
                }
                cdolist_list_var = cdolist_list_var.rest();
                unselected_asent = cdolist_list_var.first();
            }
            final SubLObject map_id = simplification_modules.equivalence_map_class_id_for_object(var_reachable_equivalence_map, asent_vars.first());
            final SubLObject relevant_vars = simplification_modules.equivalence_map_class_list_by_id(map_id, var_reachable_equivalence_map);
            SubLObject new_new_unselected_asents = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject cdolist_list_var2 = new_unselected_asents;
            SubLObject new_unselected_asent = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            new_unselected_asent = cdolist_list_var2.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var2) {
                SubLObject addedP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                if (sksi_conjunctive_removal_module_utilities.NIL == addedP) {
                    SubLObject csome_list_var = relevant_vars;
                    SubLObject relevant_var = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                    relevant_var = csome_list_var.first();
                    while (sksi_conjunctive_removal_module_utilities.NIL == addedP && sksi_conjunctive_removal_module_utilities.NIL != csome_list_var) {
                        if (sksi_conjunctive_removal_module_utilities.NIL != list_utilities.simple_tree_findP(relevant_var, new_unselected_asent)) {
                            new_new_unselected_asents = (SubLObject)ConsesLow.cons(new_unselected_asent, new_new_unselected_asents);
                            addedP = (SubLObject)sksi_conjunctive_removal_module_utilities.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        relevant_var = csome_list_var.first();
                    }
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                new_unselected_asent = cdolist_list_var2.first();
            }
            new_unselected_asents = Sequences.nreverse(new_new_unselected_asents);
            if (cost.isZero()) {
                cost = sksi_conjunctive_removal_module_utilities.$sksi_asent_cost_constant_sksi_cost_dne$.getDynamicValue(thread);
            }
            if (sksi_conjunctive_removal_module_utilities.NIL == unbound_vars) {
                cost = sksi_conjunctive_removal_module_utilities.$sksi_asent_cost_constant_0_unbound_vars_cost$.getDynamicValue(thread);
            }
            else if (asent_var_count.numE((SubLObject)sksi_conjunctive_removal_module_utilities.ONE_INTEGER)) {
                SubLObject unbound_cost = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                unbound_cost = sksi_query_utilities.look_up_sksi_query_cost_asent_sense(asent, (SubLObject)sksi_conjunctive_removal_module_utilities.$kw0$POS, sksi_conjunctive_removal_module_utilities.$const37$CCF_SDB_SDBMySQLExportStore_Cyc_K, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                if (unbound_cost.isZero()) {
                    unbound_cost = sksi_conjunctive_removal_module_utilities.$sksi_asent_cost_constant_1_unbound_var_zero_cost$.getDynamicValue(thread);
                }
                else if (unbound_cost.numE((SubLObject)sksi_conjunctive_removal_module_utilities.ONE_INTEGER)) {
                    unbound_cost = sksi_conjunctive_removal_module_utilities.$sksi_asent_cost_constant_1_unbound_var_one_cost$.getDynamicValue(thread);
                }
                else if (unbound_cost.numGE((SubLObject)sksi_conjunctive_removal_module_utilities.TWO_INTEGER)) {
                    unbound_cost = Numbers.divide(unbound_cost, sksi_conjunctive_removal_module_utilities.$sksi_asent_cost_constant_1_unbound_var_cost_divisor$.getDynamicValue(thread));
                }
                cost = unbound_cost;
            }
            else if (asent_var_count.numE((SubLObject)sksi_conjunctive_removal_module_utilities.TWO_INTEGER) && cost.numE((SubLObject)sksi_conjunctive_removal_module_utilities.ONE_INTEGER)) {
                cost = sksi_conjunctive_removal_module_utilities.$sksi_asent_cost_constant_2_unbound_var_one_cost$.getDynamicValue(thread);
            }
            if (sksi_conjunctive_removal_module_utilities.NIL != new_unselected_asents) {
                thread.resetMultipleValues();
                final SubLObject next_asent = sksi_sort_select_best_asent_and_cost_values(new_unselected_asents, new_unbound_vars);
                final SubLObject next_asent_cost_path = thread.secondMultipleValue();
                thread.resetMultipleValues();
                cost_path = next_asent_cost_path;
            }
        }
        cost_path = (SubLObject)ConsesLow.cons(cost, cost_path);
        return cost_path;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 40194L)
    public static SubLObject sksi_sort_asent_estimated_cost_path(final SubLObject contextualized_asent, final SubLObject unselected_asents, final SubLObject unbound_vars) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL == v_memoization_state) {
            return sksi_sort_asent_estimated_cost_path_internal(contextualized_asent, unselected_asents, unbound_vars);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym35$SKSI_SORT_ASENT_ESTIMATED_COST_PATH, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (sksi_conjunctive_removal_module_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_conjunctive_removal_module_utilities.$sym35$SKSI_SORT_ASENT_ESTIMATED_COST_PATH, (SubLObject)sksi_conjunctive_removal_module_utilities.THREE_INTEGER, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, (SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym35$SKSI_SORT_ASENT_ESTIMATED_COST_PATH, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(contextualized_asent, unselected_asents, unbound_vars);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (contextualized_asent.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (unselected_asents.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sksi_conjunctive_removal_module_utilities.NIL != cached_args && sksi_conjunctive_removal_module_utilities.NIL == cached_args.rest() && unbound_vars.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_sort_asent_estimated_cost_path_internal(contextualized_asent, unselected_asents, unbound_vars)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(contextualized_asent, unselected_asents, unbound_vars));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 44794L)
    public static SubLObject sksi_asent_better_p(final SubLObject better_asent, final SubLObject worse_asent) {
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_asent_better_wrt_primary_characterics(better_asent, worse_asent)) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.T;
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_asent_better_wrt_primary_characterics(worse_asent, better_asent)) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_asent_better_wrt_secondary_characterics(better_asent, worse_asent)) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.T;
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_asent_better_wrt_secondary_characterics(worse_asent, better_asent)) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 45267L)
    public static SubLObject sksi_asent_better_wrt_primary_characterics(final SubLObject better_asent, final SubLObject worse_asent) {
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_asent_better_wrt_unbound_vars(better_asent, worse_asent)) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.T;
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_asent_better_wrt_unbound_vars(worse_asent, better_asent)) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_asent_better_wrt_bound_vars(better_asent, worse_asent)) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.T;
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_asent_better_wrt_bound_vars(worse_asent, better_asent)) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_asent_better_wrt_evaluatable_pred(better_asent, worse_asent)) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.T;
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_asent_better_wrt_evaluatable_pred(worse_asent, better_asent)) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_asent_better_wrt_own_fanout_args(better_asent, worse_asent)) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.T;
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_asent_better_wrt_own_fanout_args(worse_asent, better_asent)) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 46081L)
    public static SubLObject sksi_asent_better_wrt_secondary_characterics(final SubLObject better_asent, final SubLObject worse_asent) {
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_asent_better_wrt_other_fanout_args(better_asent, worse_asent)) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.T;
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_asent_better_wrt_other_fanout_args(worse_asent, better_asent)) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_asent_better_wrt_total_var_bindings(better_asent, worse_asent)) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.T;
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_asent_better_wrt_total_var_bindings(worse_asent, better_asent)) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_asent_better_wrt_arbitrary(better_asent, worse_asent)) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.T;
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_asent_better_wrt_arbitrary(worse_asent, better_asent)) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 46727L)
    public static SubLObject sksi_asent_better_wrt_unbound_vars(final SubLObject better_asent, final SubLObject worse_asent) {
        SubLObject mt1 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject b_asent = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(better_asent, better_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.$list39);
        mt1 = better_asent.first();
        SubLObject current = better_asent.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, better_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.$list39);
        b_asent = current.first();
        current = current.rest();
        if (sksi_conjunctive_removal_module_utilities.NIL == current) {
            SubLObject mt2 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject w_asent = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(worse_asent, worse_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.$list40);
            mt2 = worse_asent.first();
            SubLObject current_$12 = worse_asent.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$12, worse_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.$list40);
            w_asent = current_$12.first();
            current_$12 = current_$12.rest();
            if (sksi_conjunctive_removal_module_utilities.NIL == current_$12) {
                final SubLObject better_asent_unbound_var_count = sksi_asent_unbound_var_count(b_asent);
                final SubLObject worse_asent_unbound_var_count = sksi_asent_unbound_var_count(w_asent);
                if (better_asent_unbound_var_count.numG((SubLObject)sksi_conjunctive_removal_module_utilities.ZERO_INTEGER) && sksi_conjunctive_removal_module_utilities.NIL != sksi_evaluatable_predicateP(cycl_utilities.atomic_sentence_predicate(b_asent))) {
                    return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                }
                if (worse_asent_unbound_var_count.numG((SubLObject)sksi_conjunctive_removal_module_utilities.ZERO_INTEGER) && sksi_conjunctive_removal_module_utilities.NIL != sksi_evaluatable_predicateP(cycl_utilities.atomic_sentence_predicate(w_asent))) {
                    return (SubLObject)sksi_conjunctive_removal_module_utilities.T;
                }
                return Numbers.numL(better_asent_unbound_var_count, worse_asent_unbound_var_count);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(worse_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.$list40);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(better_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.$list39);
        }
        return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 47512L)
    public static SubLObject sksi_asent_unbound_var_count(final SubLObject asent) {
        return list_utilities.tree_count_if((SubLObject)sksi_conjunctive_removal_module_utilities.$sym22$SKSI_SORT_ASENTS_UNBOUND_VAR_P, asent, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 47633L)
    public static SubLObject sksi_asent_better_wrt_other_fanout_args(final SubLObject better_asent, final SubLObject worse_asent) {
        return Numbers.numG(sksi_asent_other_fanout_arg_count(better_asent), sksi_asent_other_fanout_arg_count(worse_asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 47878L)
    public static SubLObject sksi_asent_other_fanout_arg_count(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent_unbound_args = list_utilities.tree_gather(asent, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym22$SKSI_SORT_ASENTS_UNBOUND_VAR_P, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        SubLObject count = (SubLObject)sksi_conjunctive_removal_module_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var = sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_unselected_asents$.getDynamicValue(thread);
        SubLObject other_asent = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        other_asent = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
            if (!other_asent.equal(asent)) {
                final SubLObject fan_out_arg_term = sksi_asent_fanout_arg_term(other_asent);
                if (sksi_conjunctive_removal_module_utilities.NIL != fan_out_arg_term && sksi_conjunctive_removal_module_utilities.NIL != sksi_sort_asents_unbound_var_p(fan_out_arg_term) && sksi_conjunctive_removal_module_utilities.NIL != list_utilities.member_eqP(fan_out_arg_term, asent_unbound_args)) {
                    count = Numbers.add(count, (SubLObject)sksi_conjunctive_removal_module_utilities.ONE_INTEGER);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            other_asent = cdolist_list_var.first();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 48631L)
    public static SubLObject sksi_asent_fanout_arg_term_internal(final SubLObject contextualized_asent) {
        SubLObject mt = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject asent = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(contextualized_asent, contextualized_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.$list3);
        mt = contextualized_asent.first();
        SubLObject current = contextualized_asent.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, contextualized_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.$list3);
        asent = current.first();
        current = current.rest();
        if (sksi_conjunctive_removal_module_utilities.NIL == current) {
            if (sksi_conjunctive_removal_module_utilities.NIL != el_utilities.el_formula_p(asent)) {
                final SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
                if (sksi_conjunctive_removal_module_utilities.NIL != forts.fort_p(predicate)) {
                    final SubLObject fan_out_argnum = kb_accessors.asserted_fan_out_arg(predicate, sksi_conjunctive_removal_module_utilities.$const42$EverythingPSC);
                    if (sksi_conjunctive_removal_module_utilities.NIL != fan_out_argnum) {
                        return cycl_utilities.atomic_sentence_arg(asent, fan_out_argnum, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                    }
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(contextualized_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.$list3);
        }
        return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 48631L)
    public static SubLObject sksi_asent_fanout_arg_term(final SubLObject contextualized_asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL == v_memoization_state) {
            return sksi_asent_fanout_arg_term_internal(contextualized_asent);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym41$SKSI_ASENT_FANOUT_ARG_TERM, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (sksi_conjunctive_removal_module_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_conjunctive_removal_module_utilities.$sym41$SKSI_ASENT_FANOUT_ARG_TERM, (SubLObject)sksi_conjunctive_removal_module_utilities.ONE_INTEGER, (SubLObject)sksi_conjunctive_removal_module_utilities.$int17$1000, (SubLObject)sksi_conjunctive_removal_module_utilities.EQ, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym41$SKSI_ASENT_FANOUT_ARG_TERM, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, contextualized_asent, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_asent_fanout_arg_term_internal(contextualized_asent)));
            memoization_state.caching_state_put(caching_state, contextualized_asent, results, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 49144L)
    public static SubLObject sksi_asent_better_wrt_total_var_bindings(final SubLObject better_asent, final SubLObject worse_asent) {
        return Numbers.numG(sksi_asent_total_var_binding_count(better_asent), sksi_asent_total_var_binding_count(worse_asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 49389L)
    public static SubLObject sksi_asent_total_var_binding_count(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent_unbound_vars = list_utilities.tree_gather(asent, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym22$SKSI_SORT_ASENTS_UNBOUND_VAR_P, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        SubLObject count = (SubLObject)sksi_conjunctive_removal_module_utilities.ZERO_INTEGER;
        SubLObject cdolist_list_var = sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_unselected_asents$.getDynamicValue(thread);
        SubLObject other_asent = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        other_asent = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$13 = asent_unbound_vars;
            SubLObject asent_unbound_var = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            asent_unbound_var = cdolist_list_var_$13.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var_$13) {
                count = Numbers.add(count, list_utilities.tree_count(asent_unbound_var, other_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED));
                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                asent_unbound_var = cdolist_list_var_$13.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            other_asent = cdolist_list_var.first();
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 49794L)
    public static SubLObject sksi_asent_better_wrt_evaluatable_pred(final SubLObject better_asent, final SubLObject worse_asent) {
        SubLObject mt1 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject b_asent = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(better_asent, better_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.$list39);
        mt1 = better_asent.first();
        SubLObject current = better_asent.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, better_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.$list39);
        b_asent = current.first();
        current = current.rest();
        if (sksi_conjunctive_removal_module_utilities.NIL == current) {
            SubLObject mt2 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject w_asent = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(worse_asent, worse_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.$list40);
            mt2 = worse_asent.first();
            SubLObject current_$15 = worse_asent.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$15, worse_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.$list40);
            w_asent = current_$15.first();
            current_$15 = current_$15.rest();
            if (sksi_conjunctive_removal_module_utilities.NIL == current_$15) {
                return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL != sksi_evaluatable_predicateP(cycl_utilities.atomic_sentence_predicate(w_asent)) && sksi_conjunctive_removal_module_utilities.NIL == sksi_evaluatable_predicateP(cycl_utilities.atomic_sentence_predicate(b_asent)));
            }
            cdestructuring_bind.cdestructuring_bind_error(worse_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.$list40);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(better_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.$list39);
        }
        return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 50298L)
    public static SubLObject sksi_evaluatable_predicateP_internal(final SubLObject predicate) {
        return relation_evaluation.evaluatable_predicateP(predicate, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 50298L)
    public static SubLObject sksi_evaluatable_predicateP(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL == v_memoization_state) {
            return sksi_evaluatable_predicateP_internal(predicate);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym43$SKSI_EVALUATABLE_PREDICATE_, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (sksi_conjunctive_removal_module_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_conjunctive_removal_module_utilities.$sym43$SKSI_EVALUATABLE_PREDICATE_, (SubLObject)sksi_conjunctive_removal_module_utilities.ONE_INTEGER, (SubLObject)sksi_conjunctive_removal_module_utilities.$int17$1000, (SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym43$SKSI_EVALUATABLE_PREDICATE_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, predicate, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_evaluatable_predicateP_internal(predicate)));
            memoization_state.caching_state_put(caching_state, predicate, results, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 50450L)
    public static SubLObject sksi_asent_better_wrt_own_fanout_args(final SubLObject better_asent, final SubLObject worse_asent) {
        return Numbers.numG(sksi_asent_fanout_arg_count(better_asent), sksi_asent_fanout_arg_count(worse_asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 50679L)
    public static SubLObject sksi_asent_fanout_arg_count(final SubLObject asent) {
        final SubLObject fan_out_arg_term = sksi_asent_fanout_arg_term(asent);
        if (sksi_conjunctive_removal_module_utilities.NIL != variables.variable_p(fan_out_arg_term) && sksi_conjunctive_removal_module_utilities.NIL == sksi_sort_asents_unbound_var_p(fan_out_arg_term)) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.ONE_INTEGER;
        }
        return (SubLObject)sksi_conjunctive_removal_module_utilities.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 50945L)
    public static SubLObject sksi_asent_better_wrt_bound_vars(final SubLObject better_asent, final SubLObject worse_asent) {
        return Numbers.numG(sksi_asent_bound_var_count(better_asent), sksi_asent_bound_var_count(worse_asent));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 51154L)
    public static SubLObject sksi_asent_bound_var_count(final SubLObject asent) {
        return list_utilities.tree_count_if((SubLObject)sksi_conjunctive_removal_module_utilities.$sym21$SKSI_SORT_ASENTS_BOUND_VAR_P, asent, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 51269L)
    public static SubLObject sksi_asent_better_wrt_arbitrary(final SubLObject better_asent, final SubLObject worse_asent) {
        return kb_utilities.term_L(better_asent, worse_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 52938L)
    public static SubLObject sksi_crm_generate_csql_for_query(SubLObject asents, SubLObject comparison_asents, final SubLObject evaluate_asents, final SubLObject sksi_unknown_sentence_asents, SubLObject meaning_sentence_gafs, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject comparison_literal_reorderings = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL == sksi_conjunctive_removal_module_utilities.$sksi_crm_generate_csql_suppress_optimizationP$.getDynamicValue(thread) && sksi_conjunctive_removal_module_utilities.NIL != kb_utilities.kbeq(sksi_query_datastructures.sks_profile_type(sks_profile), sksi_conjunctive_removal_module_utilities.$const44$RDFTripleStore_Physical)) {
            if (sksi_conjunctive_removal_module_utilities.NIL != sksi_conjunctive_removal_module_utilities.$sksi_crm_generate_csql_suppress_comparison_literal_sortingP$.getDynamicValue(thread)) {
                thread.resetMultipleValues();
                final SubLObject asents_$16 = sksi_sort_asents_and_meaning_sentence_gafs(asents, meaning_sentence_gafs, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                final SubLObject meaning_sentence_gafs_$17 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                asents = asents_$16;
                meaning_sentence_gafs = meaning_sentence_gafs_$17;
            }
            else {
                thread.resetMultipleValues();
                final SubLObject asents_$17 = sksi_sort_asents_and_meaning_sentence_gafs(asents, meaning_sentence_gafs, comparison_asents);
                final SubLObject meaning_sentence_gafs_$18 = thread.secondMultipleValue();
                final SubLObject comparison_asents_$20 = thread.thirdMultipleValue();
                final SubLObject comparison_literal_reorderings_$21 = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                asents = asents_$17;
                meaning_sentence_gafs = meaning_sentence_gafs_$18;
                comparison_asents = comparison_asents_$20;
                comparison_literal_reorderings = comparison_literal_reorderings_$21;
            }
        }
        SubLObject var_decoding_map = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQ), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        SubLObject var_lit_pfis = (sksi_conjunctive_removal_module_utilities.NIL != sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_lit_pfis$.getDynamicValue(thread)) ? sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_lit_pfis$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQ), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        final SubLObject var_pfi_encodings = (sksi_conjunctive_removal_module_utilities.NIL != sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_pfis_encodings$.getDynamicValue(thread)) ? sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_pfis_encodings$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQ), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        final SubLObject lit_pfi_selects = (sksi_conjunctive_removal_module_utilities.NIL != sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_lit_pfi_selects$.getDynamicValue(thread)) ? sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_lit_pfi_selects$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        SubLObject var_lfi_map = (sksi_conjunctive_removal_module_utilities.NIL != sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_lfi_map$.getDynamicValue(thread)) ? sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_lfi_map$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQ), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        SubLObject csql = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        final SubLObject booleanP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject error_message = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject result = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        try {
            thread.throwStack.push(sksi_conjunctive_removal_module_utilities.$kw45$SKSI_MISSING_DECODINGS);
            SubLObject result_$22 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            try {
                thread.throwStack.push(sksi_conjunctive_removal_module_utilities.$kw46$SKSI_MISSING_ENCODINGS);
                SubLObject result_$23 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                try {
                    thread.throwStack.push(sksi_conjunctive_removal_module_utilities.$kw47$SKSI_MISSING_FIELDS);
                    SubLObject result_$24 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                    try {
                        thread.throwStack.push(sksi_conjunctive_removal_module_utilities.$kw48$SKSI_MISSING_PHYSICAL_FIELD_FOR_INDEXICAL);
                        SubLObject result_$25 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                        try {
                            thread.throwStack.push(sksi_conjunctive_removal_module_utilities.$kw18$SKSI_MISSING_LOGICAL_FIELD_FOR_INDEXICAL);
                            SubLObject result_$26 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                            try {
                                thread.throwStack.push(sksi_conjunctive_removal_module_utilities.$kw49$SKSI_MISSING_REQUIRED_FIELD_VALUE);
                                SubLObject result_$27 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                try {
                                    thread.throwStack.push(sksi_conjunctive_removal_module_utilities.$kw50$SKSI_LIT_MS_ARG_MISMATCH);
                                    SubLObject result_$28 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                    try {
                                        thread.throwStack.push(sksi_conjunctive_removal_module_utilities.$kw51$SKSI_UNREFORMULATABLE);
                                        SubLObject result_$29 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                        try {
                                            thread.throwStack.push(sksi_conjunctive_removal_module_utilities.$kw52$SKSI_COMPARISON_ASENT_INAPPLICABLE);
                                            SubLObject result_$30 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                            try {
                                                thread.throwStack.push(sksi_conjunctive_removal_module_utilities.$kw53$SKSI_COMPARISON_OPERATOR_FORBIDDEN);
                                                SubLObject result_$31 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                                try {
                                                    thread.throwStack.push(sksi_conjunctive_removal_module_utilities.$kw54$SKSI_COMPARISON_ASENT_NO_VARIABLE_FOUND);
                                                    SubLObject result_$32 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                                    try {
                                                        thread.throwStack.push(sksi_conjunctive_removal_module_utilities.$kw55$SKSI_LIST_LENGTH_MISMATCH);
                                                        SubLObject result_$33 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                                        try {
                                                            thread.throwStack.push(sksi_conjunctive_removal_module_utilities.$kw56$SKSI_EVALUATE_CSQL_UNPRODUCIBLE);
                                                            SubLObject result_$34 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                                            try {
                                                                thread.throwStack.push(sksi_conjunctive_removal_module_utilities.$kw57$SKSI_UNKNOWN_SENTENCE_CSQL_UNPRODUCIBLE);
                                                                final SubLObject var_lit_decodings = (sksi_conjunctive_removal_module_utilities.NIL != sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_lit_decodings$.getDynamicValue(thread)) ? sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_lit_decodings$.getDynamicValue(thread) : dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQ), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                                                final SubLObject select_indices = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                                                final SubLObject tac = (sksi_conjunctive_removal_module_utilities.NIL != sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_tac$.getDynamicValue(thread)) ? sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_tac$.getDynamicValue(thread) : sksi_query_datastructures.new_table_aliasing_context();
                                                                SubLObject vars = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                                                SubLObject select = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                                                SubLObject from = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                                                SubLObject from_exclusions = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                                                SubLObject where = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                                                SubLObject eval_var_selects = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQ), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                                                SubLObject var_eval_expressions = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQ), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                                                final SubLObject _prev_bind_0 = sksi_conjunctive_removal_module_utilities.$recursive_sksi_crm_generate_csql_for_queryP$.currentBinding(thread);
                                                                try {
                                                                    sksi_conjunctive_removal_module_utilities.$recursive_sksi_crm_generate_csql_for_queryP$.bind((SubLObject)sksi_conjunctive_removal_module_utilities.T, thread);
                                                                    SubLObject asent = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                                                    SubLObject asent_$35 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                                                    SubLObject meaning_sentence_gaf = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                                                    SubLObject meaning_sentence_gaf_$36 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                                                    asent = asents;
                                                                    asent_$35 = asent.first();
                                                                    meaning_sentence_gaf = meaning_sentence_gafs;
                                                                    meaning_sentence_gaf_$36 = meaning_sentence_gaf.first();
                                                                    while (sksi_conjunctive_removal_module_utilities.NIL != meaning_sentence_gaf || sksi_conjunctive_removal_module_utilities.NIL != asent) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject ms_vars = sksi_crm_generate_csql_for_asent(asent_$35, meaning_sentence_gaf_$36, sks_profile, var_lit_decodings, var_lit_pfis, var_pfi_encodings, lit_pfi_selects, tac, var_lfi_map);
                                                                        final SubLObject ms_select = thread.secondMultipleValue();
                                                                        final SubLObject ms_where = thread.thirdMultipleValue();
                                                                        final SubLObject asent_var_lfi_map = thread.fourthMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        vars = ConsesLow.nconc(vars, ms_vars);
                                                                        select = ConsesLow.nconc(select, ms_select);
                                                                        where = ConsesLow.nconc(where, ms_where);
                                                                        var_lfi_map = asent_var_lfi_map;
                                                                        asent = asent.rest();
                                                                        asent_$35 = asent.first();
                                                                        meaning_sentence_gaf = meaning_sentence_gaf.rest();
                                                                        meaning_sentence_gaf_$36 = meaning_sentence_gaf.first();
                                                                    }
                                                                    vars = list_utilities.delete_duplicates_from_end(vars, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQ), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                                                    if (sksi_conjunctive_removal_module_utilities.NIL != evaluate_asents) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject evaluate_selects = sksi_crm_get_select_expressions_from_evaluations(comparison_asents, evaluate_asents, vars, var_lit_decodings, var_pfi_encodings, var_lit_pfis, lit_pfi_selects, sks_profile, tac);
                                                                        final SubLObject var_select_mapping = thread.secondMultipleValue();
                                                                        final SubLObject var_eval_expression_mapping = thread.thirdMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        select = ConsesLow.nconc(select, evaluate_selects);
                                                                        eval_var_selects = var_select_mapping;
                                                                        var_eval_expressions = var_eval_expression_mapping;
                                                                    }
                                                                    if (sksi_conjunctive_removal_module_utilities.NIL != sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_outer_scope_defined_variables$.getDynamicValue(thread)) {
                                                                        SubLObject cdolist_list_var = sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_outer_scope_defined_variables$.getDynamicValue(thread);
                                                                        SubLObject hl_var = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                                                        hl_var = cdolist_list_var.first();
                                                                        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
                                                                            vars = (SubLObject)ConsesLow.cons(hl_var, vars);
                                                                            cdolist_list_var = cdolist_list_var.rest();
                                                                            hl_var = cdolist_list_var.first();
                                                                        }
                                                                    }
                                                                    final SubLObject decoding_where = sksi_crm_get_where_clauses_from_decodings(var_lit_decodings, var_lit_pfis, sks_profile, tac);
                                                                    if (sksi_conjunctive_removal_module_utilities.NIL == sksi_csql_utilities.csql_true_p(decoding_where)) {
                                                                        where = (SubLObject)ConsesLow.cons(decoding_where, where);
                                                                    }
                                                                    if (sksi_conjunctive_removal_module_utilities.NIL != comparison_asents) {
                                                                        final SubLObject comparison_where = sksi_crm_get_where_clauses_from_comparisons(comparison_asents, eval_var_selects, var_eval_expressions, vars, var_pfi_encodings, var_lit_pfis, lit_pfi_selects, sks_profile, tac);
                                                                        if (sksi_conjunctive_removal_module_utilities.NIL == sksi_csql_utilities.csql_true_p(comparison_where)) {
                                                                            where = (SubLObject)ConsesLow.cons(comparison_where, where);
                                                                        }
                                                                    }
                                                                    from = sksi_query_datastructures.tac_lookup_all_table_expressions(tac);
                                                                    if (sksi_conjunctive_removal_module_utilities.NIL != sksi_unknown_sentence_asents) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject unknown_sentence_where = sksi_crm_get_where_clauses_from_sksi_unknown_sentence_asents(asents, meaning_sentence_gafs, sksi_unknown_sentence_asents, eval_var_selects, var_eval_expressions, vars, var_pfi_encodings, var_lit_pfis, lit_pfi_selects, var_lfi_map, sks_profile, tac, var_lit_decodings);
                                                                        final SubLObject unknown_sentence_from = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        from_exclusions = unknown_sentence_from;
                                                                        if (sksi_conjunctive_removal_module_utilities.NIL == sksi_csql_utilities.csql_true_p(unknown_sentence_where)) {
                                                                            where = (SubLObject)ConsesLow.cons(unknown_sentence_where, where);
                                                                        }
                                                                    }
                                                                }
                                                                finally {
                                                                    sksi_conjunctive_removal_module_utilities.$recursive_sksi_crm_generate_csql_for_queryP$.rebind(_prev_bind_0, thread);
                                                                }
                                                                final SubLObject alias_map = sksi_query_datastructures.tac_realias_tables(tac);
                                                                select = list_utilities.delete_duplicates_from_end(conses_high.sublis(alias_map, select, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                                                from = list_utilities.delete_duplicates_from_end(conses_high.sublis(alias_map, from, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                                                where = list_utilities.delete_duplicates_from_end(conses_high.sublis(alias_map, where, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                                                if (sksi_conjunctive_removal_module_utilities.NIL == sksi_conjunctive_removal_module_utilities.$recursive_sksi_crm_generate_csql_for_queryP$.getDynamicValue(thread)) {
                                                                    sksi_query_datastructures.fix_table_aliasing_context(tac);
                                                                }
                                                                from = list_utilities.ordered_set_difference(from, from_exclusions, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                                                SubLObject list_var = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                                                SubLObject select_expression = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                                                SubLObject index = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                                                list_var = select;
                                                                select_expression = list_var.first();
                                                                for (index = (SubLObject)sksi_conjunctive_removal_module_utilities.ZERO_INTEGER; sksi_conjunctive_removal_module_utilities.NIL != list_var; list_var = list_var.rest(), select_expression = list_var.first(), index = Numbers.add((SubLObject)sksi_conjunctive_removal_module_utilities.ONE_INTEGER, index)) {
                                                                    dictionary.dictionary_enter(select_indices, select_expression, index);
                                                                }
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(var_lit_decodings)); sksi_conjunctive_removal_module_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject lit_decodings = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    SubLObject iteration_state_$37;
                                                                    for (iteration_state_$37 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit_decodings)); sksi_conjunctive_removal_module_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$37); iteration_state_$37 = dictionary_contents.do_dictionary_contents_next(iteration_state_$37)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject lit = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$37);
                                                                        final SubLObject decodings = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject pfi_selects = dictionary.dictionary_lookup(lit_pfi_selects, lit, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                                                        final SubLObject pfis = list_utilities.delete_duplicates_from_end(Mapping.mapcan((SubLObject)sksi_conjunctive_removal_module_utilities.$sym58$DECODING_PHYSICAL_FIELD_INDEXICALS, decodings, sksi_conjunctive_removal_module_utilities.EMPTY_SUBL_OBJECT_ARRAY), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                                                        SubLObject alist = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                                                        if (sksi_conjunctive_removal_module_utilities.NIL != pfis) {
                                                                            SubLObject cdolist_list_var2 = pfis;
                                                                            SubLObject pfi = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                                                            pfi = cdolist_list_var2.first();
                                                                            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var2) {
                                                                                SubLObject cdolist_list_var_$38 = dictionary.dictionary_lookup(pfi_selects, pfi, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                                                                SubLObject select_expression2 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                                                                select_expression2 = cdolist_list_var_$38.first();
                                                                                while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var_$38) {
                                                                                    final SubLObject new_select = conses_high.sublis(alias_map, select_expression2, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                                                                    final SubLObject select_index = dictionary.dictionary_lookup(select_indices, new_select, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                                                                    if (sksi_conjunctive_removal_module_utilities.NIL != select_index) {
                                                                                        alist = list_utilities.alist_enter(alist, pfi, (SubLObject)ConsesLow.list((SubLObject)sksi_conjunctive_removal_module_utilities.$kw59$RS_INDEX, select_index), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL));
                                                                                    }
                                                                                    cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                                                                                    select_expression2 = cdolist_list_var_$38.first();
                                                                                }
                                                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                                                pfi = cdolist_list_var2.first();
                                                                            }
                                                                            cdolist_list_var2 = decodings;
                                                                            SubLObject decoding = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                                                            decoding = cdolist_list_var2.first();
                                                                            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var2) {
                                                                                final SubLObject modified_decoding = conses_high.sublis(alist, decoding, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                                                                if (sksi_conjunctive_removal_module_utilities.NIL == list_utilities.tree_find_if((SubLObject)sksi_conjunctive_removal_module_utilities.$sym60$PHYSICAL_FIELD_INDEXICAL_P, modified_decoding, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED)) {
                                                                                    dictionary_utilities.dictionary_pushnew(var_decoding_map, var, modified_decoding, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                                                                }
                                                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                                                decoding = cdolist_list_var2.first();
                                                                            }
                                                                        }
                                                                        else {
                                                                            final SubLObject select_expression3 = dictionary.dictionary_lookup(eval_var_selects, var, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                                                            final SubLObject new_select2 = conses_high.sublis(alias_map, select_expression3, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                                                            final SubLObject select_index2 = dictionary.dictionary_lookup(select_indices, new_select2, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                                                            if (sksi_conjunctive_removal_module_utilities.NIL != select_index2) {
                                                                                dictionary_utilities.dictionary_pushnew(var_decoding_map, var, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sksi_conjunctive_removal_module_utilities.$kw59$RS_INDEX, select_index2)), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$37);
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                SubLObject cdolist_list_var3 = evaluate_asents;
                                                                SubLObject evaluate_asent = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                                                evaluate_asent = cdolist_list_var3.first();
                                                                while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var3) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = evaluate_asent;
                                                                    SubLObject mt = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                                                    SubLObject asent2 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list3);
                                                                    mt = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list3);
                                                                    asent2 = current.first();
                                                                    current = current.rest();
                                                                    if (sksi_conjunctive_removal_module_utilities.NIL == current) {
                                                                        if (sksi_conjunctive_removal_module_utilities.NIL != kb_utilities.kbeq(sksi_conjunctive_removal_module_utilities.$const61$evaluate, cycl_utilities.sentence_arg0(asent2))) {
                                                                            final SubLObject evaluate_var = cycl_utilities.sentence_arg1(asent2, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                                                            final SubLObject evaluated_vars = list_utilities.tree_find_all_if((SubLObject)sksi_conjunctive_removal_module_utilities.$sym62$HL_VARIABLE_P, cycl_utilities.sentence_args(asent2, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED).rest(), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                                                            if (sksi_conjunctive_removal_module_utilities.NIL != list_utilities.singletonP(evaluated_vars)) {
                                                                                final SubLObject copy_from_var = evaluated_vars.first();
                                                                                final SubLObject copy_from_decoding = conses_high.copy_list(dictionary.dictionary_lookup(var_decoding_map, copy_from_var, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED));
                                                                                final SubLObject replace_rs_index = list_utilities.tree_find((SubLObject)sksi_conjunctive_removal_module_utilities.$kw59$RS_INDEX, copy_from_decoding, (SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym63$CAR_IF_LIST_OR_NIL);
                                                                                final SubLObject this_rs_index = list_utilities.tree_find((SubLObject)sksi_conjunctive_removal_module_utilities.$kw59$RS_INDEX, dictionary.dictionary_lookup(var_decoding_map, evaluate_var, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED), (SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym63$CAR_IF_LIST_OR_NIL);
                                                                                final SubLObject new_decodings = (SubLObject)((sksi_conjunctive_removal_module_utilities.NIL != list_utilities.doubletonP(replace_rs_index) && sksi_conjunctive_removal_module_utilities.NIL != list_utilities.doubletonP(this_rs_index)) ? list_utilities.tree_substitute(copy_from_decoding, replace_rs_index, this_rs_index) : sksi_conjunctive_removal_module_utilities.NIL);
                                                                                if (sksi_conjunctive_removal_module_utilities.NIL != new_decodings) {
                                                                                    dictionary.dictionary_enter(var_decoding_map, evaluate_var, new_decodings);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list3);
                                                                    }
                                                                    cdolist_list_var3 = cdolist_list_var3.rest();
                                                                    evaluate_asent = cdolist_list_var3.first();
                                                                }
                                                                select = remove_namespaces_made_redundant_by_aliases(select, from);
                                                                where = remove_namespaces_made_redundant_by_aliases(where, from);
                                                                if (sksi_conjunctive_removal_module_utilities.NIL == sksi_conjunctive_removal_module_utilities.$recursive_sksi_crm_generate_csql_for_queryP$.getDynamicValue(thread) && sksi_conjunctive_removal_module_utilities.NIL != kb_utilities.kbeq(sksi_query_datastructures.sks_profile_type(sks_profile), sksi_conjunctive_removal_module_utilities.$const44$RDFTripleStore_Physical)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject csql_$39 = make_sparql_csql_query_and_decoding_map(select, from, where, select_indices, var_decoding_map, comparison_literal_reorderings);
                                                                    final SubLObject var_decoding_map_$40 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    csql = csql_$39;
                                                                    var_decoding_map = var_decoding_map_$40;
                                                                }
                                                                else {
                                                                    csql = sksi_csql_utilities.make_csql_query(select, from, where, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                                                }
                                                            }
                                                            catch (Throwable ccatch_env_var) {
                                                                result_$34 = Errors.handleThrowable(ccatch_env_var, (SubLObject)sksi_conjunctive_removal_module_utilities.$kw57$SKSI_UNKNOWN_SENTENCE_CSQL_UNPRODUCIBLE);
                                                            }
                                                            finally {
                                                                thread.throwStack.pop();
                                                            }
                                                            if (sksi_conjunctive_removal_module_utilities.NIL != result_$34) {
                                                                error_message = sksi_debugging.sksi_violation_message((SubLObject)sksi_conjunctive_removal_module_utilities.$kw57$SKSI_UNKNOWN_SENTENCE_CSQL_UNPRODUCIBLE, result_$34);
                                                            }
                                                        }
                                                        catch (Throwable ccatch_env_var2) {
                                                            result_$33 = Errors.handleThrowable(ccatch_env_var2, (SubLObject)sksi_conjunctive_removal_module_utilities.$kw56$SKSI_EVALUATE_CSQL_UNPRODUCIBLE);
                                                        }
                                                        finally {
                                                            thread.throwStack.pop();
                                                        }
                                                        if (sksi_conjunctive_removal_module_utilities.NIL != result_$33) {
                                                            error_message = sksi_debugging.sksi_violation_message((SubLObject)sksi_conjunctive_removal_module_utilities.$kw56$SKSI_EVALUATE_CSQL_UNPRODUCIBLE, result_$33);
                                                        }
                                                    }
                                                    catch (Throwable ccatch_env_var3) {
                                                        result_$32 = Errors.handleThrowable(ccatch_env_var3, (SubLObject)sksi_conjunctive_removal_module_utilities.$kw55$SKSI_LIST_LENGTH_MISMATCH);
                                                    }
                                                    finally {
                                                        thread.throwStack.pop();
                                                    }
                                                    if (sksi_conjunctive_removal_module_utilities.NIL != result_$32) {
                                                        error_message = sksi_debugging.sksi_violation_message((SubLObject)sksi_conjunctive_removal_module_utilities.$kw55$SKSI_LIST_LENGTH_MISMATCH, result_$32);
                                                    }
                                                }
                                                catch (Throwable ccatch_env_var4) {
                                                    result_$31 = Errors.handleThrowable(ccatch_env_var4, (SubLObject)sksi_conjunctive_removal_module_utilities.$kw54$SKSI_COMPARISON_ASENT_NO_VARIABLE_FOUND);
                                                }
                                                finally {
                                                    thread.throwStack.pop();
                                                }
                                                if (sksi_conjunctive_removal_module_utilities.NIL != result_$31) {
                                                    error_message = sksi_debugging.sksi_violation_message((SubLObject)sksi_conjunctive_removal_module_utilities.$kw54$SKSI_COMPARISON_ASENT_NO_VARIABLE_FOUND, result_$31);
                                                }
                                            }
                                            catch (Throwable ccatch_env_var5) {
                                                result_$30 = Errors.handleThrowable(ccatch_env_var5, (SubLObject)sksi_conjunctive_removal_module_utilities.$kw53$SKSI_COMPARISON_OPERATOR_FORBIDDEN);
                                            }
                                            finally {
                                                thread.throwStack.pop();
                                            }
                                            if (sksi_conjunctive_removal_module_utilities.NIL != result_$30) {
                                                error_message = sksi_debugging.sksi_violation_message((SubLObject)sksi_conjunctive_removal_module_utilities.$kw53$SKSI_COMPARISON_OPERATOR_FORBIDDEN, result_$30);
                                            }
                                        }
                                        catch (Throwable ccatch_env_var6) {
                                            result_$29 = Errors.handleThrowable(ccatch_env_var6, (SubLObject)sksi_conjunctive_removal_module_utilities.$kw52$SKSI_COMPARISON_ASENT_INAPPLICABLE);
                                        }
                                        finally {
                                            thread.throwStack.pop();
                                        }
                                        if (sksi_conjunctive_removal_module_utilities.NIL != result_$29) {
                                            error_message = sksi_debugging.sksi_violation_message((SubLObject)sksi_conjunctive_removal_module_utilities.$kw52$SKSI_COMPARISON_ASENT_INAPPLICABLE, result_$29);
                                        }
                                    }
                                    catch (Throwable ccatch_env_var7) {
                                        result_$28 = Errors.handleThrowable(ccatch_env_var7, (SubLObject)sksi_conjunctive_removal_module_utilities.$kw51$SKSI_UNREFORMULATABLE);
                                    }
                                    finally {
                                        thread.throwStack.pop();
                                    }
                                    if (sksi_conjunctive_removal_module_utilities.NIL != result_$28) {
                                        error_message = sksi_debugging.sksi_violation_message((SubLObject)sksi_conjunctive_removal_module_utilities.$kw51$SKSI_UNREFORMULATABLE, result_$28);
                                    }
                                }
                                catch (Throwable ccatch_env_var8) {
                                    result_$27 = Errors.handleThrowable(ccatch_env_var8, (SubLObject)sksi_conjunctive_removal_module_utilities.$kw50$SKSI_LIT_MS_ARG_MISMATCH);
                                }
                                finally {
                                    thread.throwStack.pop();
                                }
                                if (sksi_conjunctive_removal_module_utilities.NIL != result_$27) {
                                    error_message = sksi_debugging.sksi_violation_message((SubLObject)sksi_conjunctive_removal_module_utilities.$kw50$SKSI_LIT_MS_ARG_MISMATCH, result_$27);
                                }
                            }
                            catch (Throwable ccatch_env_var9) {
                                result_$26 = Errors.handleThrowable(ccatch_env_var9, (SubLObject)sksi_conjunctive_removal_module_utilities.$kw49$SKSI_MISSING_REQUIRED_FIELD_VALUE);
                            }
                            finally {
                                thread.throwStack.pop();
                            }
                            if (sksi_conjunctive_removal_module_utilities.NIL != result_$26) {
                                error_message = sksi_debugging.sksi_violation_message((SubLObject)sksi_conjunctive_removal_module_utilities.$kw49$SKSI_MISSING_REQUIRED_FIELD_VALUE, result_$26);
                            }
                        }
                        catch (Throwable ccatch_env_var10) {
                            result_$25 = Errors.handleThrowable(ccatch_env_var10, (SubLObject)sksi_conjunctive_removal_module_utilities.$kw18$SKSI_MISSING_LOGICAL_FIELD_FOR_INDEXICAL);
                        }
                        finally {
                            thread.throwStack.pop();
                        }
                        if (sksi_conjunctive_removal_module_utilities.NIL != result_$25) {
                            error_message = sksi_debugging.sksi_violation_message((SubLObject)sksi_conjunctive_removal_module_utilities.$kw18$SKSI_MISSING_LOGICAL_FIELD_FOR_INDEXICAL, result_$25);
                        }
                    }
                    catch (Throwable ccatch_env_var11) {
                        result_$24 = Errors.handleThrowable(ccatch_env_var11, (SubLObject)sksi_conjunctive_removal_module_utilities.$kw48$SKSI_MISSING_PHYSICAL_FIELD_FOR_INDEXICAL);
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    if (sksi_conjunctive_removal_module_utilities.NIL != result_$24) {
                        error_message = sksi_debugging.sksi_violation_message((SubLObject)sksi_conjunctive_removal_module_utilities.$kw48$SKSI_MISSING_PHYSICAL_FIELD_FOR_INDEXICAL, result_$24);
                    }
                }
                catch (Throwable ccatch_env_var12) {
                    result_$23 = Errors.handleThrowable(ccatch_env_var12, (SubLObject)sksi_conjunctive_removal_module_utilities.$kw47$SKSI_MISSING_FIELDS);
                }
                finally {
                    thread.throwStack.pop();
                }
                if (sksi_conjunctive_removal_module_utilities.NIL != result_$23) {
                    error_message = sksi_debugging.sksi_violation_message((SubLObject)sksi_conjunctive_removal_module_utilities.$kw47$SKSI_MISSING_FIELDS, result_$23);
                }
            }
            catch (Throwable ccatch_env_var13) {
                result_$22 = Errors.handleThrowable(ccatch_env_var13, (SubLObject)sksi_conjunctive_removal_module_utilities.$kw46$SKSI_MISSING_ENCODINGS);
            }
            finally {
                thread.throwStack.pop();
            }
            if (sksi_conjunctive_removal_module_utilities.NIL != result_$22) {
                error_message = sksi_debugging.sksi_violation_message((SubLObject)sksi_conjunctive_removal_module_utilities.$kw46$SKSI_MISSING_ENCODINGS, result_$22);
            }
        }
        catch (Throwable ccatch_env_var14) {
            result = Errors.handleThrowable(ccatch_env_var14, (SubLObject)sksi_conjunctive_removal_module_utilities.$kw45$SKSI_MISSING_DECODINGS);
        }
        finally {
            thread.throwStack.pop();
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != result) {
            error_message = sksi_debugging.sksi_violation_message((SubLObject)sksi_conjunctive_removal_module_utilities.$kw45$SKSI_MISSING_DECODINGS, result);
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != error_message) {
            return Values.values((SubLObject)sksi_conjunctive_removal_module_utilities.NIL, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, error_message, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        }
        if (sksi_conjunctive_removal_module_utilities.NIL == sksi_conjunctive_removal_module_utilities.$sksi_crm_generate_csql_suppress_optimizationP$.getDynamicValue(thread)) {
            thread.resetMultipleValues();
            final SubLObject csql_$40 = possibly_simplify_csql_wrt_field_equivalences(csql, var_decoding_map, var_lit_pfis);
            final SubLObject var_decoding_map_$41 = thread.secondMultipleValue();
            final SubLObject var_lit_pfis_$43 = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            csql = csql_$40;
            var_decoding_map = var_decoding_map_$41;
            var_lit_pfis = var_lit_pfis_$43;
        }
        return Values.values(csql, var_decoding_map, booleanP, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, var_pfi_encodings, var_lit_pfis, lit_pfi_selects, var_lfi_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 64477L)
    public static SubLObject possibly_simplify_csql_wrt_field_equivalences(SubLObject csql, SubLObject var_decoding_map, SubLObject var_lit_pfis) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_conjunctive_removal_module_utilities.$csql_simplification_wrt_field_equivalance_enabledP$.getDynamicValue(thread)) {
            SubLObject equals_constraint = csql_identify_equivalent_field_constraint(csql);
            if (sksi_conjunctive_removal_module_utilities.NIL != equals_constraint) {
                while (sksi_conjunctive_removal_module_utilities.NIL != equals_constraint) {
                    final SubLObject old_fields = conses_high.second(csql);
                    var_decoding_map = simplify_var_decoding_map_wrt_equivalent_field_constraint(var_decoding_map, equals_constraint, old_fields);
                    csql = simplify_csql_wrt_equivalent_field_constraint(csql, equals_constraint);
                    var_lit_pfis = simplify_var_lit_pfis_wrt_equivalent_field_constraint(var_lit_pfis, equals_constraint);
                    equals_constraint = csql_identify_equivalent_field_constraint(csql);
                }
            }
        }
        return Values.values(csql, var_decoding_map, var_lit_pfis);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 65972L)
    public static SubLObject csql_identify_equivalent_field_constraint(final SubLObject csql) {
        SubLObject select_keyword = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject fields = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject from = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(csql, csql, (SubLObject)sksi_conjunctive_removal_module_utilities.$list64);
        select_keyword = csql.first();
        SubLObject current = csql.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, csql, (SubLObject)sksi_conjunctive_removal_module_utilities.$list64);
        fields = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, csql, (SubLObject)sksi_conjunctive_removal_module_utilities.$list64);
        from = current.first();
        current = current.rest();
        final SubLObject where = (SubLObject)(current.isCons() ? current.first() : sksi_conjunctive_removal_module_utilities.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, csql, (SubLObject)sksi_conjunctive_removal_module_utilities.$list64);
        current = current.rest();
        final SubLObject limit = (SubLObject)(current.isCons() ? current.first() : sksi_conjunctive_removal_module_utilities.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, csql, (SubLObject)sksi_conjunctive_removal_module_utilities.$list64);
        current = current.rest();
        final SubLObject offset = (SubLObject)(current.isCons() ? current.first() : sksi_conjunctive_removal_module_utilities.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, csql, (SubLObject)sksi_conjunctive_removal_module_utilities.$list64);
        current = current.rest();
        if (sksi_conjunctive_removal_module_utilities.NIL == current) {
            must_eq(select_keyword, (SubLObject)sksi_conjunctive_removal_module_utilities.$kw65$SELECT);
            if (sksi_conjunctive_removal_module_utilities.NIL != where) {
                SubLObject current_$45;
                final SubLObject datum_$44 = current_$45 = where;
                SubLObject where_keyword = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                SubLObject constraints = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$45, datum_$44, (SubLObject)sksi_conjunctive_removal_module_utilities.$list66);
                where_keyword = current_$45.first();
                current_$45 = current_$45.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$45, datum_$44, (SubLObject)sksi_conjunctive_removal_module_utilities.$list66);
                constraints = current_$45.first();
                current_$45 = current_$45.rest();
                if (sksi_conjunctive_removal_module_utilities.NIL == current_$45) {
                    must_eq(where_keyword, (SubLObject)sksi_conjunctive_removal_module_utilities.$kw67$WHERE);
                    SubLObject current_$46;
                    final SubLObject datum_$45 = current_$46 = from;
                    SubLObject from_keyword = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                    SubLObject tables = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current_$46, datum_$45, (SubLObject)sksi_conjunctive_removal_module_utilities.$list68);
                    from_keyword = current_$46.first();
                    current_$46 = current_$46.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$46, datum_$45, (SubLObject)sksi_conjunctive_removal_module_utilities.$list68);
                    tables = current_$46.first();
                    current_$46 = current_$46.rest();
                    if (sksi_conjunctive_removal_module_utilities.NIL == current_$46) {
                        must_eq(from_keyword, (SubLObject)sksi_conjunctive_removal_module_utilities.$kw69$FROM);
                        SubLObject cdolist_list_var = constraints;
                        SubLObject constraint = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                        constraint = cdolist_list_var.first();
                        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
                            if (sksi_conjunctive_removal_module_utilities.NIL != kb_utilities.kbeq(constraint.first(), sksi_conjunctive_removal_module_utilities.$const20$CSQLEquals)) {
                                SubLObject current_$47;
                                final SubLObject datum_$46 = current_$47 = constraint.rest();
                                SubLObject item1 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                SubLObject item2 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current_$47, datum_$46, (SubLObject)sksi_conjunctive_removal_module_utilities.$list70);
                                item1 = current_$47.first();
                                current_$47 = current_$47.rest();
                                cdestructuring_bind.destructuring_bind_must_consp(current_$47, datum_$46, (SubLObject)sksi_conjunctive_removal_module_utilities.$list70);
                                item2 = current_$47.first();
                                current_$47 = current_$47.rest();
                                if (sksi_conjunctive_removal_module_utilities.NIL == current_$47) {
                                    if (sksi_conjunctive_removal_module_utilities.NIL != sksi_csql_utilities.csql_field_p(item1) && sksi_conjunctive_removal_module_utilities.NIL != sksi_csql_utilities.csql_field_p(item2)) {
                                        SubLObject current_$48;
                                        final SubLObject datum_$47 = current_$48 = item1;
                                        SubLObject fk1 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                        SubLObject field1_name = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current_$48, datum_$47, (SubLObject)sksi_conjunctive_removal_module_utilities.$list71);
                                        fk1 = current_$48.first();
                                        current_$48 = current_$48.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current_$48, datum_$47, (SubLObject)sksi_conjunctive_removal_module_utilities.$list71);
                                        field1_name = current_$48.first();
                                        current_$48 = current_$48.rest();
                                        final SubLObject field1_table_alias = (SubLObject)(current_$48.isCons() ? current_$48.first() : sksi_conjunctive_removal_module_utilities.NIL);
                                        cdestructuring_bind.destructuring_bind_must_listp(current_$48, datum_$47, (SubLObject)sksi_conjunctive_removal_module_utilities.$list71);
                                        current_$48 = current_$48.rest();
                                        final SubLObject field1_namespace = (SubLObject)(current_$48.isCons() ? current_$48.first() : sksi_conjunctive_removal_module_utilities.NIL);
                                        cdestructuring_bind.destructuring_bind_must_listp(current_$48, datum_$47, (SubLObject)sksi_conjunctive_removal_module_utilities.$list71);
                                        current_$48 = current_$48.rest();
                                        if (sksi_conjunctive_removal_module_utilities.NIL == current_$48) {
                                            SubLObject current_$49;
                                            final SubLObject datum_$48 = current_$49 = item2;
                                            SubLObject fk2 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                            SubLObject field2_name = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                            cdestructuring_bind.destructuring_bind_must_consp(current_$49, datum_$48, (SubLObject)sksi_conjunctive_removal_module_utilities.$list72);
                                            fk2 = current_$49.first();
                                            current_$49 = current_$49.rest();
                                            cdestructuring_bind.destructuring_bind_must_consp(current_$49, datum_$48, (SubLObject)sksi_conjunctive_removal_module_utilities.$list72);
                                            field2_name = current_$49.first();
                                            current_$49 = current_$49.rest();
                                            final SubLObject field2_table_alias = (SubLObject)(current_$49.isCons() ? current_$49.first() : sksi_conjunctive_removal_module_utilities.NIL);
                                            cdestructuring_bind.destructuring_bind_must_listp(current_$49, datum_$48, (SubLObject)sksi_conjunctive_removal_module_utilities.$list72);
                                            current_$49 = current_$49.rest();
                                            final SubLObject field2_namespace = (SubLObject)(current_$49.isCons() ? current_$49.first() : sksi_conjunctive_removal_module_utilities.NIL);
                                            cdestructuring_bind.destructuring_bind_must_listp(current_$49, datum_$48, (SubLObject)sksi_conjunctive_removal_module_utilities.$list72);
                                            current_$49 = current_$49.rest();
                                            if (sksi_conjunctive_removal_module_utilities.NIL == current_$49) {
                                                must_eq(fk1, (SubLObject)sksi_conjunctive_removal_module_utilities.$kw73$FIELD);
                                                must_eq(fk2, (SubLObject)sksi_conjunctive_removal_module_utilities.$kw73$FIELD);
                                                if (field1_name.equal(field2_name) && field1_namespace.equal(field2_namespace)) {
                                                    final SubLObject field1_table = conses_high.second(Sequences.find(field1_table_alias, tables, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym74$THIRD), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED));
                                                    final SubLObject field2_table = conses_high.second(Sequences.find(field2_table_alias, tables, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym74$THIRD), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED));
                                                    if (field1_table.equal(field2_table)) {
                                                        return constraint;
                                                    }
                                                }
                                            }
                                            else {
                                                cdestructuring_bind.cdestructuring_bind_error(datum_$48, (SubLObject)sksi_conjunctive_removal_module_utilities.$list72);
                                            }
                                        }
                                        else {
                                            cdestructuring_bind.cdestructuring_bind_error(datum_$47, (SubLObject)sksi_conjunctive_removal_module_utilities.$list71);
                                        }
                                    }
                                }
                                else {
                                    cdestructuring_bind.cdestructuring_bind_error(datum_$46, (SubLObject)sksi_conjunctive_removal_module_utilities.$list70);
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            constraint = cdolist_list_var.first();
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum_$45, (SubLObject)sksi_conjunctive_removal_module_utilities.$list68);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$44, (SubLObject)sksi_conjunctive_removal_module_utilities.$list66);
                }
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(csql, (SubLObject)sksi_conjunctive_removal_module_utilities.$list64);
        }
        return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 67364L)
    public static SubLObject must_eq(final SubLObject item, final SubLObject expected_item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_conjunctive_removal_module_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !item.eql(expected_item)) {
            Errors.error((SubLObject)sksi_conjunctive_removal_module_utilities.$str75$expected__S_got__S_instead, expected_item, item);
        }
        return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 67503L)
    public static SubLObject must_kbeq(final SubLObject item, final SubLObject expected_item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_conjunctive_removal_module_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_conjunctive_removal_module_utilities.NIL == kb_utilities.kbeq(item, expected_item)) {
            Errors.error((SubLObject)sksi_conjunctive_removal_module_utilities.$str75$expected__S_got__S_instead, expected_item, item);
        }
        return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 67646L)
    public static SubLObject simplify_csql_wrt_equivalent_field_constraint(SubLObject csql, final SubLObject equals_constraint) {
        SubLObject current;
        final SubLObject datum = current = csql;
        SubLObject select_keyword = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject fields = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject from = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject where = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list76);
        select_keyword = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list76);
        fields = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list76);
        from = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list76);
        where = current.first();
        current = current.rest();
        final SubLObject limit = (SubLObject)(current.isCons() ? current.first() : sksi_conjunctive_removal_module_utilities.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list76);
        current = current.rest();
        final SubLObject offset = (SubLObject)(current.isCons() ? current.first() : sksi_conjunctive_removal_module_utilities.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list76);
        current = current.rest();
        if (sksi_conjunctive_removal_module_utilities.NIL == current) {
            SubLObject current_$55;
            final SubLObject datum_$54 = current_$55 = from;
            SubLObject from_keyword = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject tables = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$55, datum_$54, (SubLObject)sksi_conjunctive_removal_module_utilities.$list68);
            from_keyword = current_$55.first();
            current_$55 = current_$55.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$55, datum_$54, (SubLObject)sksi_conjunctive_removal_module_utilities.$list68);
            tables = current_$55.first();
            current_$55 = current_$55.rest();
            if (sksi_conjunctive_removal_module_utilities.NIL == current_$55) {
                SubLObject current_$56;
                final SubLObject datum_$55 = current_$56 = where;
                SubLObject where_keyword = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                SubLObject constraints = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$56, datum_$55, (SubLObject)sksi_conjunctive_removal_module_utilities.$list66);
                where_keyword = current_$56.first();
                current_$56 = current_$56.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$56, datum_$55, (SubLObject)sksi_conjunctive_removal_module_utilities.$list66);
                constraints = current_$56.first();
                current_$56 = current_$56.rest();
                if (sksi_conjunctive_removal_module_utilities.NIL == current_$56) {
                    SubLObject csql_equals = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                    SubLObject keep_field = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                    SubLObject kill_field = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(equals_constraint, equals_constraint, (SubLObject)sksi_conjunctive_removal_module_utilities.$list77);
                    csql_equals = equals_constraint.first();
                    SubLObject current_$57 = equals_constraint.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$57, equals_constraint, (SubLObject)sksi_conjunctive_removal_module_utilities.$list77);
                    keep_field = current_$57.first();
                    current_$57 = current_$57.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current_$57, equals_constraint, (SubLObject)sksi_conjunctive_removal_module_utilities.$list77);
                    kill_field = current_$57.first();
                    current_$57 = current_$57.rest();
                    if (sksi_conjunctive_removal_module_utilities.NIL == current_$57) {
                        must_kbeq(csql_equals, sksi_conjunctive_removal_module_utilities.$const20$CSQLEquals);
                        constraints = Sequences.remove(equals_constraint, constraints, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                        if (!keep_field.equal(kill_field)) {
                            final SubLObject keep_table_alias = sksi_csql_utilities.csql_field_expression_table_name(keep_field);
                            final SubLObject keep_table_namespace = sksi_csql_utilities.csql_field_expression_namespace(keep_field);
                            final SubLObject kill_table_alias = sksi_csql_utilities.csql_field_expression_table_name(kill_field);
                            final SubLObject kill_table_namespace = sksi_csql_utilities.csql_field_expression_namespace(kill_field);
                            fields = Sequences.remove(kill_field, fields, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                            fields = csql_field_subst_wrt_table_alias(fields, kill_table_alias, kill_table_namespace, keep_table_alias, keep_table_namespace);
                            tables = Sequences.remove(kill_table_alias, tables, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym74$THIRD), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                            constraints = csql_field_subst_wrt_table_alias(constraints, kill_table_alias, kill_table_namespace, keep_table_alias, keep_table_namespace);
                            constraints = Sequences.remove_duplicates(constraints, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                        }
                        csql = (SubLObject)ConsesLow.listS(select_keyword, fields, (SubLObject)ConsesLow.list(from_keyword, tables), (SubLObject)ConsesLow.list(where_keyword, constraints), ConsesLow.append((SubLObject)((sksi_conjunctive_removal_module_utilities.NIL != limit) ? ConsesLow.list(limit) : sksi_conjunctive_removal_module_utilities.NIL), (SubLObject)((sksi_conjunctive_removal_module_utilities.NIL != offset) ? ConsesLow.list(offset) : sksi_conjunctive_removal_module_utilities.NIL), (SubLObject)sksi_conjunctive_removal_module_utilities.NIL));
                        return csql;
                    }
                    cdestructuring_bind.cdestructuring_bind_error(equals_constraint, (SubLObject)sksi_conjunctive_removal_module_utilities.$list77);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$55, (SubLObject)sksi_conjunctive_removal_module_utilities.$list66);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$54, (SubLObject)sksi_conjunctive_removal_module_utilities.$list68);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list76);
        }
        return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 69163L)
    public static SubLObject simplify_var_decoding_map_wrt_equivalent_field_constraint(final SubLObject var_decoding_map, final SubLObject equals_constraint, final SubLObject old_fields) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject csql_equals = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject keep_field = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject kill_field = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(equals_constraint, equals_constraint, (SubLObject)sksi_conjunctive_removal_module_utilities.$list77);
        csql_equals = equals_constraint.first();
        SubLObject current = equals_constraint.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, equals_constraint, (SubLObject)sksi_conjunctive_removal_module_utilities.$list77);
        keep_field = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, equals_constraint, (SubLObject)sksi_conjunctive_removal_module_utilities.$list77);
        kill_field = current.first();
        current = current.rest();
        if (sksi_conjunctive_removal_module_utilities.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(equals_constraint, (SubLObject)sksi_conjunctive_removal_module_utilities.$list77);
            return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        must_kbeq(csql_equals, sksi_conjunctive_removal_module_utilities.$const20$CSQLEquals);
        if (keep_field.equal(kill_field)) {
            return var_decoding_map;
        }
        final SubLObject keep_field_index = Sequences.position(keep_field, old_fields, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        final SubLObject kill_field_index = Sequences.position(kill_field, old_fields, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        final SubLObject new_map = map_utilities.new_map_with_same_properties(var_decoding_map);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(var_decoding_map)); sksi_conjunctive_removal_module_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            value = csql_decoding_subst_wrt_rs_index(value, kill_field_index, keep_field_index);
            value = Sequences.remove_duplicates(value, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            dictionary.dictionary_enter(new_map, key, value);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return new_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 69924L)
    public static SubLObject simplify_var_lit_pfis_wrt_equivalent_field_constraint(final SubLObject var_lit_pfis, final SubLObject equals_constraint) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject csql_equals = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject keep_field = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject kill_field = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(equals_constraint, equals_constraint, (SubLObject)sksi_conjunctive_removal_module_utilities.$list77);
        csql_equals = equals_constraint.first();
        SubLObject current = equals_constraint.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, equals_constraint, (SubLObject)sksi_conjunctive_removal_module_utilities.$list77);
        keep_field = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, equals_constraint, (SubLObject)sksi_conjunctive_removal_module_utilities.$list77);
        kill_field = current.first();
        current = current.rest();
        if (sksi_conjunctive_removal_module_utilities.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(equals_constraint, (SubLObject)sksi_conjunctive_removal_module_utilities.$list77);
            return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        must_kbeq(csql_equals, sksi_conjunctive_removal_module_utilities.$const20$CSQLEquals);
        if (keep_field.equal(kill_field)) {
            return var_lit_pfis;
        }
        final SubLObject keep_table_alias = sksi_csql_utilities.csql_field_expression_table_name(keep_field);
        final SubLObject keep_table_namespace = sksi_csql_utilities.csql_field_expression_namespace(keep_field);
        final SubLObject kill_table_alias = sksi_csql_utilities.csql_field_expression_table_name(kill_field);
        final SubLObject kill_table_namespace = sksi_csql_utilities.csql_field_expression_namespace(kill_field);
        final SubLObject new_map = map_utilities.new_map_with_same_properties(var_lit_pfis);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(var_lit_pfis)); sksi_conjunctive_removal_module_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            SubLObject value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            value = csql_field_subst_wrt_table_alias(value, kill_table_alias, kill_table_namespace, keep_table_alias, keep_table_namespace);
            dictionary.dictionary_enter(new_map, key, value);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return new_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 70852L)
    public static SubLObject remove_namespaces_made_redundant_by_aliases(final SubLObject csql, final SubLObject from) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sksi_conjunctive_removal_module_utilities.$csql_aliases$.currentBinding(thread);
        try {
            sksi_conjunctive_removal_module_utilities.$csql_aliases$.bind(gather_csql_aliases(from), thread);
            return transform_list_utilities.transform(csql, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym79$CSQL_ALIASED_EXPRESSION_WITH_NAMESPACE_, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym80$CSQL_EXPRESSION_REMOVE_NAMESPACE, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        }
        finally {
            sksi_conjunctive_removal_module_utilities.$csql_aliases$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 71083L)
    public static SubLObject gather_csql_aliases(final SubLObject from) {
        return Mapping.mapcar((SubLObject)sksi_conjunctive_removal_module_utilities.$sym81$SECOND, from);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 71158L)
    public static SubLObject csql_aliased_expression_with_namespaceP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_csql_utilities.csql_table_expression_p(v_object)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL != list_utilities.member_equalP(sksi_csql_utilities.csql_table_expression_alias(v_object), sksi_conjunctive_removal_module_utilities.$csql_aliases$.getDynamicValue(thread)) && sksi_conjunctive_removal_module_utilities.NIL != sksi_csql_utilities.csql_table_expression_has_namespaceP(v_object));
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_csql_utilities.csql_field_expression_p(v_object)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL != list_utilities.member_equalP(sksi_csql_utilities.csql_field_expression_table_name(v_object), sksi_conjunctive_removal_module_utilities.$csql_aliases$.getDynamicValue(thread)) && sksi_conjunctive_removal_module_utilities.NIL != sksi_csql_utilities.csql_field_expression_has_namespaceP(v_object));
        }
        return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 71598L)
    public static SubLObject csql_expression_remove_namespace(final SubLObject v_object) {
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_csql_utilities.csql_table_expression_p(v_object)) {
            SubLObject table_keyword = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject table_name = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject alias = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject namespace = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(v_object, v_object, (SubLObject)sksi_conjunctive_removal_module_utilities.$list82);
            table_keyword = v_object.first();
            SubLObject current = v_object.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)sksi_conjunctive_removal_module_utilities.$list82);
            table_name = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)sksi_conjunctive_removal_module_utilities.$list82);
            alias = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)sksi_conjunctive_removal_module_utilities.$list82);
            namespace = current.first();
            current = current.rest();
            if (sksi_conjunctive_removal_module_utilities.NIL == current) {
                return (SubLObject)ConsesLow.list(table_keyword, table_name, alias);
            }
            cdestructuring_bind.cdestructuring_bind_error(v_object, (SubLObject)sksi_conjunctive_removal_module_utilities.$list82);
        }
        else {
            if (sksi_conjunctive_removal_module_utilities.NIL == sksi_csql_utilities.csql_field_expression_p(v_object)) {
                return v_object;
            }
            SubLObject field_keyword = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject field_name = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject table_name2 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject namespace = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(v_object, v_object, (SubLObject)sksi_conjunctive_removal_module_utilities.$list83);
            field_keyword = v_object.first();
            SubLObject current = v_object.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)sksi_conjunctive_removal_module_utilities.$list83);
            field_name = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)sksi_conjunctive_removal_module_utilities.$list83);
            table_name2 = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)sksi_conjunctive_removal_module_utilities.$list83);
            namespace = current.first();
            current = current.rest();
            if (sksi_conjunctive_removal_module_utilities.NIL == current) {
                return (SubLObject)ConsesLow.list(field_keyword, field_name, table_name2);
            }
            cdestructuring_bind.cdestructuring_bind_error(v_object, (SubLObject)sksi_conjunctive_removal_module_utilities.$list83);
        }
        return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 72309L)
    public static SubLObject csql_kill_table_alias_field_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL != sksi_csql_utilities.csql_field_expression_p(v_object) && sksi_csql_utilities.csql_field_expression_table_name(v_object).equal(sksi_conjunctive_removal_module_utilities.$csql_transform_kill_name$.getDynamicValue(thread)) && sksi_csql_utilities.csql_field_expression_namespace(v_object).equal(sksi_conjunctive_removal_module_utilities.$csql_transform_kill_namespace$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 72593L)
    public static SubLObject csql_transform_table_alias_field(final SubLObject field) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject field_keyword = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject name = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject kill_alias = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(field, field, (SubLObject)sksi_conjunctive_removal_module_utilities.$list85);
        field_keyword = field.first();
        SubLObject current = field.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, field, (SubLObject)sksi_conjunctive_removal_module_utilities.$list85);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, field, (SubLObject)sksi_conjunctive_removal_module_utilities.$list85);
        kill_alias = current.first();
        current = current.rest();
        final SubLObject kill_namespace = (SubLObject)(current.isCons() ? current.first() : sksi_conjunctive_removal_module_utilities.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, field, (SubLObject)sksi_conjunctive_removal_module_utilities.$list85);
        current = current.rest();
        if (sksi_conjunctive_removal_module_utilities.NIL == current) {
            return sksi_csql_utilities.construct_csql_field_expression(name, sksi_conjunctive_removal_module_utilities.$csql_transform_keep_name$.getDynamicValue(thread), sksi_conjunctive_removal_module_utilities.$csql_transform_keep_namespace$.getDynamicValue(thread));
        }
        cdestructuring_bind.cdestructuring_bind_error(field, (SubLObject)sksi_conjunctive_removal_module_utilities.$list85);
        return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 72908L)
    public static SubLObject csql_field_subst_wrt_table_alias(SubLObject v_object, final SubLObject kill_alias, final SubLObject kill_namespace, final SubLObject keep_alias, final SubLObject keep_namespace) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sksi_conjunctive_removal_module_utilities.$csql_transform_kill_name$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sksi_conjunctive_removal_module_utilities.$csql_transform_kill_namespace$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sksi_conjunctive_removal_module_utilities.$csql_transform_keep_name$.currentBinding(thread);
        final SubLObject _prev_bind_4 = sksi_conjunctive_removal_module_utilities.$csql_transform_keep_namespace$.currentBinding(thread);
        try {
            sksi_conjunctive_removal_module_utilities.$csql_transform_kill_name$.bind(kill_alias, thread);
            sksi_conjunctive_removal_module_utilities.$csql_transform_kill_namespace$.bind(kill_namespace, thread);
            sksi_conjunctive_removal_module_utilities.$csql_transform_keep_name$.bind(keep_alias, thread);
            sksi_conjunctive_removal_module_utilities.$csql_transform_keep_namespace$.bind(keep_namespace, thread);
            v_object = transform_list_utilities.transform(v_object, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym84$CSQL_KILL_TABLE_ALIAS_FIELD_P), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym86$CSQL_TRANSFORM_TABLE_ALIAS_FIELD), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        }
        finally {
            sksi_conjunctive_removal_module_utilities.$csql_transform_keep_namespace$.rebind(_prev_bind_4, thread);
            sksi_conjunctive_removal_module_utilities.$csql_transform_keep_name$.rebind(_prev_bind_3, thread);
            sksi_conjunctive_removal_module_utilities.$csql_transform_kill_namespace$.rebind(_prev_bind_2, thread);
            sksi_conjunctive_removal_module_utilities.$csql_transform_kill_name$.rebind(_prev_bind_0, thread);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 73445L)
    public static SubLObject csql_result_set_index_to_renumber_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL != list_utilities.list_of_length_p(v_object, (SubLObject)sksi_conjunctive_removal_module_utilities.TWO_INTEGER, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED) && sksi_conjunctive_removal_module_utilities.$kw59$RS_INDEX == v_object.first() && conses_high.second(v_object).numGE(sksi_conjunctive_removal_module_utilities.$csql_transform_kill$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 73644L)
    public static SubLObject csql_renumber_result_set_index(final SubLObject rs_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rs_keyword = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject index = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(rs_index, rs_index, (SubLObject)sksi_conjunctive_removal_module_utilities.$list88);
        rs_keyword = rs_index.first();
        SubLObject current = rs_index.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, rs_index, (SubLObject)sksi_conjunctive_removal_module_utilities.$list88);
        index = current.first();
        current = current.rest();
        if (sksi_conjunctive_removal_module_utilities.NIL == current) {
            if (index.numE(sksi_conjunctive_removal_module_utilities.$csql_transform_kill$.getDynamicValue(thread))) {
                index = sksi_conjunctive_removal_module_utilities.$csql_transform_keep$.getDynamicValue(thread);
            }
            if (index.numG(sksi_conjunctive_removal_module_utilities.$csql_transform_kill$.getDynamicValue(thread))) {
                index = number_utilities.f_1_(index);
            }
            return (SubLObject)ConsesLow.list(rs_keyword, index);
        }
        cdestructuring_bind.cdestructuring_bind_error(rs_index, (SubLObject)sksi_conjunctive_removal_module_utilities.$list88);
        return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 73959L)
    public static SubLObject csql_decoding_subst_wrt_rs_index(SubLObject v_object, final SubLObject kill_field_index, final SubLObject keep_field_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sksi_conjunctive_removal_module_utilities.$csql_transform_kill$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sksi_conjunctive_removal_module_utilities.$csql_transform_keep$.currentBinding(thread);
        try {
            sksi_conjunctive_removal_module_utilities.$csql_transform_kill$.bind(kill_field_index, thread);
            sksi_conjunctive_removal_module_utilities.$csql_transform_keep$.bind(keep_field_index, thread);
            v_object = transform_list_utilities.quiescent_transform(v_object, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym87$CSQL_RESULT_SET_INDEX_TO_RENUMBER_P), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym89$CSQL_RENUMBER_RESULT_SET_INDEX), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.IDENTITY), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym90$TRUE));
        }
        finally {
            sksi_conjunctive_removal_module_utilities.$csql_transform_keep$.rebind(_prev_bind_2, thread);
            sksi_conjunctive_removal_module_utilities.$csql_transform_kill$.rebind(_prev_bind_0, thread);
        }
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 74300L)
    public static SubLObject make_sparql_csql_query_and_decoding_map(final SubLObject select, final SubLObject from, final SubLObject where, final SubLObject select_indices, final SubLObject var_decoding_map, SubLObject comparison_literal_reorderings) {
        if (comparison_literal_reorderings == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            comparison_literal_reorderings = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject csql = sksi_csql_utilities.make_sparql_csql_query(select, from, where, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, comparison_literal_reorderings);
        final SubLObject equivalent_field_map = thread.secondMultipleValue();
        final SubLObject field_result_index_map = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject new_decoding_map = sksi_sparql_csql_compute_decoding_map(select_indices, equivalent_field_map, field_result_index_map, var_decoding_map);
        return Values.values(csql, new_decoding_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 75126L)
    public static SubLObject sksi_sparql_csql_compute_decoding_map(final SubLObject select_indices, final SubLObject equivalent_field_map, final SubLObject field_result_index_map, final SubLObject var_decoding_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rs_index_map = sksi_sparql_compute_result_set_index_map(select_indices, equivalent_field_map, field_result_index_map);
        final SubLObject new_var_decoding_map = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQ), dictionary.dictionary_length(var_decoding_map));
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(var_decoding_map)); sksi_conjunctive_removal_module_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject old_decodings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject old_decoding = old_decodings.first();
            final SubLObject new_decoding = conses_high.sublis(rs_index_map, old_decoding, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            dictionary.dictionary_enter(new_var_decoding_map, var, (SubLObject)ConsesLow.list(new_decoding));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return new_var_decoding_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 76342L)
    public static SubLObject sksi_sparql_compute_result_set_index_map(final SubLObject select_indices, final SubLObject equivalent_field_map, final SubLObject field_result_index_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rs_index_map = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(select_indices)); sksi_conjunctive_removal_module_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject field = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject old_rs_index = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject canonical_field = dictionary.dictionary_lookup_without_values(equivalent_field_map, field, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            final SubLObject new_rs_index = dictionary.dictionary_lookup_without_values(field_result_index_map, canonical_field, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            rs_index_map = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list((SubLObject)sksi_conjunctive_removal_module_utilities.$kw59$RS_INDEX, old_rs_index), (SubLObject)ConsesLow.list((SubLObject)sksi_conjunctive_removal_module_utilities.$kw59$RS_INDEX, new_rs_index)), rs_index_map);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        rs_index_map = Sort.sort(rs_index_map, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym91$_, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym92$CADAR);
        return rs_index_map;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 76917L)
    public static SubLObject sksi_crm_generate_csql_for_asent(final SubLObject asent, final SubLObject ms_gaf, final SubLObject sks_profile, final SubLObject var_lit_decodings, final SubLObject var_lit_pfis, final SubLObject var_pfi_encodings, final SubLObject lit_pfi_selects, final SubLObject tac, SubLObject var_lfi_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject problem = inference_worker.currently_active_problem();
        final SubLObject store = (SubLObject)((sksi_conjunctive_removal_module_utilities.NIL != problem) ? inference_datastructures_problem.problem_store(problem) : sksi_conjunctive_removal_module_utilities.NIL);
        final SubLObject problem_free_hl_vars = (SubLObject)((sksi_conjunctive_removal_module_utilities.NIL != problem) ? inference_datastructures_problem.problem_free_hl_vars(problem) : sksi_conjunctive_removal_module_utilities.NIL);
        final SubLObject meaning_sentence = sksi_meaning_sentence_utilities.get_relevant_meaning_sentence_from_gaf(ms_gaf, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        final SubLObject meaning_sentence_args = el_utilities.elf_to_list(meaning_sentence);
        final SubLObject lit = inference_datastructures_problem_query.contextualized_asent_asent(asent);
        final SubLObject lit_args = el_utilities.elf_to_list(lit);
        final SubLObject mt = inference_datastructures_problem_query.contextualized_asent_mt(asent);
        final SubLObject logical_schemata = (SubLObject)ConsesLow.list(assertions_high.gaf_arg1(ms_gaf));
        final SubLObject physical_schemata = sksi_query_datastructures.sks_profile_physical_schemata(sks_profile);
        SubLObject vars = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject select = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject where = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject ms_arg = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject ms_arg_$60 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject lit_arg = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject lit_arg_$61 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        ms_arg = meaning_sentence_args;
        ms_arg_$60 = ms_arg.first();
        lit_arg = lit_args;
        lit_arg_$61 = lit_arg.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != lit_arg || sksi_conjunctive_removal_module_utilities.NIL != ms_arg) {
            thread.resetMultipleValues();
            final SubLObject arg_vars = sksi_crm_generate_csql_for_arg(lit_arg_$61, ms_arg_$60, ms_gaf, lit, mt, sks_profile, var_lit_decodings, var_lit_pfis, var_pfi_encodings, lit_pfi_selects, tac, var_lfi_map);
            final SubLObject arg_select = thread.secondMultipleValue();
            final SubLObject arg_where = thread.thirdMultipleValue();
            final SubLObject arg_var_lfi_map = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            if (sksi_conjunctive_removal_module_utilities.NIL != store && sksi_conjunctive_removal_module_utilities.NIL != inference_datastructures_problem_store.problem_store_allows_problem_hl_free_vars_optimizationP(store)) {
                if (sksi_conjunctive_removal_module_utilities.NIL != cycl_variables.hl_varP(lit_arg_$61) && sksi_conjunctive_removal_module_utilities.NIL != list_utilities.member_eqP(lit_arg_$61, problem_free_hl_vars)) {
                    select = ConsesLow.nconc(select, arg_select);
                }
            }
            else {
                select = ConsesLow.nconc(select, arg_select);
            }
            var_lfi_map = arg_var_lfi_map;
            if (sksi_conjunctive_removal_module_utilities.NIL == sksi_csql_utilities.csql_true_p(arg_where)) {
                where = (SubLObject)ConsesLow.cons(arg_where, where);
            }
            final SubLObject fixed_physical_field_indexicals = sksi_infrastructure_utilities.sksi_determine_fixed_physical_field_indexicals(logical_schemata, physical_schemata);
            SubLObject cdolist_list_var = sksi_generate_csql_where_lists_for_fixed_physical_indexicals(lit, sks_profile, logical_schemata, tac, fixed_physical_field_indexicals);
            SubLObject fixed_where = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            fixed_where = cdolist_list_var.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
                where = (SubLObject)ConsesLow.cons(fixed_where, where);
                cdolist_list_var = cdolist_list_var.rest();
                fixed_where = cdolist_list_var.first();
            }
            vars = ConsesLow.nconc(vars, arg_vars);
            ms_arg = ms_arg.rest();
            ms_arg_$60 = ms_arg.first();
            lit_arg = lit_arg.rest();
            lit_arg_$61 = lit_arg.first();
        }
        sksi_query_datastructures.tac_add_lit(tac, lit);
        return Values.values(vars, select, where, var_lfi_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 79169L)
    public static SubLObject sksi_crm_generate_csql_for_arg(final SubLObject lit_arg, final SubLObject ms_arg, final SubLObject ms_gaf, final SubLObject lit, final SubLObject mt, final SubLObject sks_profile, final SubLObject var_lit_decodings, final SubLObject var_lit_pfis, final SubLObject var_pfi_encodings, final SubLObject lit_pfi_selects, final SubLObject tac, SubLObject var_lfi_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_conjunctive_removal_module_utilities.NIL != variables.variable_p(lit_arg)) {
            return sksi_crm_generate_csql_for_variable_arg(lit_arg, ms_arg, ms_gaf, lit, sks_profile, var_lit_decodings, var_lit_pfis, var_pfi_encodings, lit_pfi_selects, tac, var_lfi_map);
        }
        if (lit_arg.isList() && sksi_conjunctive_removal_module_utilities.NIL != list_utilities.tree_find_if((SubLObject)sksi_conjunctive_removal_module_utilities.$sym15$VARIABLE_P, lit_arg, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED)) {
            SubLObject vars = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject select = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject where = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            if (ms_arg.isList() && sksi_conjunctive_removal_module_utilities.NIL != list_utilities.same_length_p(lit_arg, ms_arg)) {
                SubLObject sub_lit_arg = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                SubLObject sub_lit_arg_$62 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                SubLObject sub_ms_arg = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                SubLObject sub_ms_arg_$63 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                sub_lit_arg = lit_arg;
                sub_lit_arg_$62 = sub_lit_arg.first();
                sub_ms_arg = ms_arg;
                sub_ms_arg_$63 = sub_ms_arg.first();
                while (sksi_conjunctive_removal_module_utilities.NIL != sub_ms_arg || sksi_conjunctive_removal_module_utilities.NIL != sub_lit_arg) {
                    thread.resetMultipleValues();
                    final SubLObject sub_vars = sksi_crm_generate_csql_for_arg(sub_lit_arg_$62, sub_ms_arg_$63, ms_gaf, lit, mt, sks_profile, var_lit_decodings, var_lit_pfis, var_pfi_encodings, lit_pfi_selects, tac, var_lfi_map);
                    final SubLObject sub_select = thread.secondMultipleValue();
                    final SubLObject sub_where = thread.thirdMultipleValue();
                    final SubLObject sub_var_lfi_map = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    vars = ConsesLow.nconc(vars, sub_vars);
                    select = ConsesLow.nconc(select, sub_select);
                    var_lfi_map = sub_var_lfi_map;
                    where = (SubLObject)ConsesLow.cons(sub_where, where);
                    sub_lit_arg = sub_lit_arg.rest();
                    sub_lit_arg_$62 = sub_lit_arg.first();
                    sub_ms_arg = sub_ms_arg.rest();
                    sub_ms_arg_$63 = sub_ms_arg.first();
                }
            }
            else {
                Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw50$SKSI_LIT_MS_ARG_MISMATCH, (SubLObject)ConsesLow.list(lit_arg, ms_arg));
            }
            where = sksi_csql_utilities.csql_conjoin_expressions(where);
            return Values.values(vars, select, where, var_lfi_map);
        }
        return sksi_crm_generate_csql_for_other_arg(lit_arg, ms_arg, ms_gaf, lit, mt, sks_profile, tac, var_lfi_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 80798L)
    public static SubLObject double_dictionary_pushnew(final SubLObject double_dictionary, final SubLObject key1, final SubLObject key2, final SubLObject value, SubLObject key2_test, SubLObject value_test) {
        if (key2_test == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            key2_test = Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL);
        }
        if (value_test == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            value_test = Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL);
        }
        SubLObject sub_dictionary = dictionary.dictionary_lookup(double_dictionary, key1, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (sksi_conjunctive_removal_module_utilities.NIL == dictionary.dictionary_p(sub_dictionary)) {
            sub_dictionary = dictionary.new_dictionary(key2_test, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            dictionary.dictionary_enter(double_dictionary, key1, sub_dictionary);
        }
        return dictionary_utilities.dictionary_pushnew(sub_dictionary, key2, value, value_test, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 81231L)
    public static SubLObject double_dictionary_enter(final SubLObject double_dictionary, final SubLObject key1, final SubLObject key2, final SubLObject value, SubLObject key2_test) {
        if (key2_test == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            key2_test = Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL);
        }
        SubLObject sub_dictionary = dictionary.dictionary_lookup(double_dictionary, key1, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (sksi_conjunctive_removal_module_utilities.NIL == dictionary.dictionary_p(sub_dictionary)) {
            sub_dictionary = dictionary.new_dictionary(key2_test, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            dictionary.dictionary_enter(double_dictionary, key1, sub_dictionary);
        }
        return dictionary.dictionary_enter(sub_dictionary, key2, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 81629L)
    public static SubLObject sksi_crm_generate_csql_for_variable_arg(final SubLObject var, final SubLObject ms_arg, final SubLObject ms_gaf, final SubLObject lit, final SubLObject sks_profile, final SubLObject var_lit_decodings, final SubLObject var_lit_pfis, final SubLObject var_pfi_encodings, final SubLObject lit_pfi_selects, final SubLObject tac, final SubLObject var_lfi_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sks = sksi_query_datastructures.sks_profile_sks(sks_profile);
        final SubLObject physical_schemata = sksi_query_datastructures.sks_profile_physical_schemata(sks_profile);
        SubLObject vars = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject select = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject where = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_kb_accessors.logical_field_indexical_p(ms_arg)) {
            dictionary_utilities.dictionary_push(var_lfi_map, var, ms_arg);
            final SubLObject decodings = get_decodings_for_logical_field_indexical(ms_arg, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, physical_schemata);
            final SubLObject pfi_encoding_pairs = get_pfi_encoding_pairs_for_logical_field_indexical(ms_arg, physical_schemata);
            if (sksi_conjunctive_removal_module_utilities.NIL == decodings) {
                Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw45$SKSI_MISSING_DECODINGS, ms_arg);
            }
            else if (sksi_conjunctive_removal_module_utilities.NIL == pfi_encoding_pairs) {
                Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw46$SKSI_MISSING_ENCODINGS, ms_arg);
            }
            select = get_decoding_field_expressions_for_logical_field_indexical(lit, ms_arg, sks, lit_pfi_selects, tac);
            SubLObject cdolist_list_var;
            final SubLObject primary_keys = cdolist_list_var = get_primary_keys_for_logical_field_indexical(ms_arg, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, physical_schemata, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            SubLObject primary_key = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            primary_key = cdolist_list_var.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
                sksi_query_datastructures.tac_add_primary_key_and_value(tac, lit, primary_key, var);
                cdolist_list_var = cdolist_list_var.rest();
                primary_key = cdolist_list_var.first();
            }
            if (sksi_conjunctive_removal_module_utilities.NIL != sksi_meaning_sentence_utilities.gaf_assertion_is_conditional_meaning_sentence_gafP(ms_gaf)) {
                final SubLObject content_mt = sksi_query_datastructures.sks_profile_content_mt(sks_profile);
                thread.resetMultipleValues();
                final SubLObject cms_where = sksi_query_utilities.get_where_expression_from_antecedent_meaning_sentence(ms_gaf, content_mt, sks, physical_schemata, lit, tac);
                final SubLObject cms_evals = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (sksi_conjunctive_removal_module_utilities.NIL == sksi_csql_utilities.csql_true_p(cms_where)) {
                    where = (SubLObject)ConsesLow.cons(cms_where, where);
                }
                if (sksi_conjunctive_removal_module_utilities.NIL != cms_evals) {
                    SubLObject cdolist_list_var2 = cms_evals;
                    SubLObject cms_eval = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                    cms_eval = cdolist_list_var2.first();
                    while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var2) {
                        SubLObject current;
                        final SubLObject datum = current = cms_eval;
                        SubLObject eval_lfi = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                        SubLObject eval_expression = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                        SubLObject eval_conditions = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list93);
                        eval_lfi = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list93);
                        eval_expression = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list93);
                        eval_conditions = current.first();
                        current = current.rest();
                        if (sksi_conjunctive_removal_module_utilities.NIL == current) {
                            if (eval_lfi.eql(ms_arg)) {
                                final SubLObject eval_pfis = Mapping.mapcan((SubLObject)sksi_conjunctive_removal_module_utilities.$sym58$DECODING_PHYSICAL_FIELD_INDEXICALS, sksi_field_translation_utilities.generate_decoding_compositions_for_logical_field_indexical(eval_lfi, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED), sksi_conjunctive_removal_module_utilities.EMPTY_SUBL_OBJECT_ARRAY);
                                if (sksi_conjunctive_removal_module_utilities.NIL != eval_pfis) {
                                    SubLObject cdolist_list_var_$64 = list_utilities.delete_duplicates_from_end(eval_pfis, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                    SubLObject eval_pfi = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                    eval_pfi = cdolist_list_var_$64.first();
                                    while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var_$64) {
                                        double_dictionary_pushnew(lit_pfi_selects, lit, eval_pfi, eval_expression, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL));
                                        cdolist_list_var_$64 = cdolist_list_var_$64.rest();
                                        eval_pfi = cdolist_list_var_$64.first();
                                    }
                                }
                                select = (SubLObject)ConsesLow.cons(eval_expression, select);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list93);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        cms_eval = cdolist_list_var2.first();
                    }
                }
            }
            if (sksi_conjunctive_removal_module_utilities.NIL == select) {
                Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw47$SKSI_MISSING_FIELDS, ms_arg);
            }
            vars = (SubLObject)ConsesLow.cons(var, vars);
            SubLObject cdolist_list_var3 = decodings;
            SubLObject decoding = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            decoding = cdolist_list_var3.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var3) {
                double_dictionary_pushnew(var_lit_decodings, var, lit, decoding, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL));
                SubLObject cdolist_list_var_$65 = sksi_field_translation_utilities.decoding_physical_field_indexicals(decoding);
                SubLObject pfi = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                pfi = cdolist_list_var_$65.first();
                while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var_$65) {
                    double_dictionary_pushnew(var_lit_pfis, var, lit, pfi, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL));
                    cdolist_list_var_$65 = cdolist_list_var_$65.rest();
                    pfi = cdolist_list_var_$65.first();
                }
                cdolist_list_var3 = cdolist_list_var3.rest();
                decoding = cdolist_list_var3.first();
            }
            cdolist_list_var3 = pfi_encoding_pairs;
            SubLObject pfi_encoding_pair = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            pfi_encoding_pair = cdolist_list_var3.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var3) {
                SubLObject current2;
                final SubLObject datum2 = current2 = pfi_encoding_pair;
                SubLObject pfi2 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                SubLObject encoding = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_conjunctive_removal_module_utilities.$list94);
                pfi2 = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_conjunctive_removal_module_utilities.$list94);
                encoding = current2.first();
                current2 = current2.rest();
                if (sksi_conjunctive_removal_module_utilities.NIL == current2) {
                    double_dictionary_pushnew(var_pfi_encodings, var, pfi2, encoding, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL));
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)sksi_conjunctive_removal_module_utilities.$list94);
                }
                cdolist_list_var3 = cdolist_list_var3.rest();
                pfi_encoding_pair = cdolist_list_var3.first();
            }
        }
        else if (ms_arg.isList()) {
            Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw50$SKSI_LIT_MS_ARG_MISMATCH, (SubLObject)ConsesLow.list(var, ms_arg));
        }
        else {
            vars = (SubLObject)ConsesLow.cons(var, vars);
            double_dictionary_pushnew(var_lit_decodings, var, lit, ms_arg, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL));
        }
        where = sksi_csql_utilities.csql_conjoin_expressions(where);
        return Values.values(vars, select, where, var_lfi_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 85164L)
    public static SubLObject sksi_crm_generate_csql_for_other_arg(final SubLObject lit_arg, final SubLObject ms_arg, final SubLObject ms_gaf, final SubLObject lit, final SubLObject mt, final SubLObject sks_profile, final SubLObject tac, final SubLObject var_lfi_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sks = sksi_query_datastructures.sks_profile_sks(sks_profile);
        final SubLObject physical_schemata = sksi_query_datastructures.sks_profile_physical_schemata(sks_profile);
        final SubLObject vars = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        final SubLObject select = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject where = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_kb_accessors.logical_field_indexical_p(ms_arg)) {
            final SubLObject fields = get_encoding_field_expressions_for_logical_field_indexical(lit, ms_arg, sks, tac);
            final SubLObject pfi_encoding_pairs = get_pfi_encoding_pairs_for_logical_field_indexical(ms_arg, physical_schemata);
            final SubLObject alist = conses_high.acons(ms_arg, lit_arg, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
            SubLObject eval = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            if (sksi_conjunctive_removal_module_utilities.NIL == pfi_encoding_pairs) {
                Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw46$SKSI_MISSING_ENCODINGS, ms_arg);
            }
            SubLObject cdolist_list_var;
            final SubLObject primary_keys = cdolist_list_var = get_primary_keys_for_logical_field_indexical(ms_arg, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, physical_schemata, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            SubLObject primary_key = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            primary_key = cdolist_list_var.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
                sksi_query_datastructures.tac_add_primary_key_and_value(tac, lit, primary_key, lit_arg);
                cdolist_list_var = cdolist_list_var.rest();
                primary_key = cdolist_list_var.first();
            }
            if (sksi_conjunctive_removal_module_utilities.NIL != sksi_meaning_sentence_utilities.gaf_assertion_is_conditional_meaning_sentence_gafP(ms_gaf)) {
                final SubLObject content_mt = sksi_query_datastructures.sks_profile_content_mt(sks_profile);
                thread.resetMultipleValues();
                final SubLObject cms_where = sksi_query_utilities.get_where_expression_from_antecedent_meaning_sentence(ms_gaf, content_mt, sks, physical_schemata, lit, tac);
                final SubLObject cms_evals = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (sksi_conjunctive_removal_module_utilities.NIL == sksi_csql_utilities.csql_true_p(cms_where)) {
                    where = (SubLObject)ConsesLow.cons(cms_where, where);
                }
                if (sksi_conjunctive_removal_module_utilities.NIL != cms_evals) {
                    SubLObject cdolist_list_var2 = cms_evals;
                    SubLObject cms_eval = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                    cms_eval = cdolist_list_var2.first();
                    while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var2) {
                        SubLObject current;
                        final SubLObject datum = current = cms_eval;
                        SubLObject eval_lfi = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                        SubLObject eval_expression = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                        SubLObject eval_conditions = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list93);
                        eval_lfi = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list93);
                        eval_expression = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list93);
                        eval_conditions = current.first();
                        current = current.rest();
                        if (sksi_conjunctive_removal_module_utilities.NIL == current) {
                            if (eval_lfi.eql(ms_arg)) {
                                eval = eval_expression;
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list93);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        cms_eval = cdolist_list_var2.first();
                    }
                }
            }
            if (sksi_conjunctive_removal_module_utilities.NIL == fields && sksi_conjunctive_removal_module_utilities.NIL == eval) {
                Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw47$SKSI_MISSING_FIELDS, ms_arg);
            }
            SubLObject reformulatableP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            cdolist_list_var = pfi_encoding_pairs;
            SubLObject pfi_encoding_pair = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            pfi_encoding_pair = cdolist_list_var.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
                SubLObject current2;
                final SubLObject datum2 = current2 = pfi_encoding_pair;
                SubLObject physical_field_indexical = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                SubLObject encoding = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_conjunctive_removal_module_utilities.$list95);
                physical_field_indexical = current2.first();
                current2 = current2.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_conjunctive_removal_module_utilities.$list95);
                encoding = current2.first();
                current2 = current2.rest();
                if (sksi_conjunctive_removal_module_utilities.NIL == current2) {
                    final SubLObject reformed = sksi_field_translation_utilities.sksi_apply_encoding_and_reformulate(alist, encoding, sks, mt);
                    if (sksi_conjunctive_removal_module_utilities.NIL == sksi_query_utilities.sksi_unreformulatable_p(reformed)) {
                        reformulatableP = (SubLObject)sksi_conjunctive_removal_module_utilities.T;
                        if (sksi_conjunctive_removal_module_utilities.NIL != fields && sksi_conjunctive_removal_module_utilities.NIL == sksi_kb_accessors.physical_field_indexical_virtualP(physical_field_indexical)) {
                            final SubLObject physical_schema = sksi_kb_accessors.physical_field_indexical_schema(physical_field_indexical);
                            final SubLObject field_name = sksi_kb_accessors.physical_field_indexical_name(physical_field_indexical);
                            final SubLObject aliasing_index = sksi_kb_accessors.pfi_index_for_pfi(physical_field_indexical, (SubLObject)sksi_conjunctive_removal_module_utilities.ZERO_INTEGER);
                            final SubLObject tables = sksi_query_utilities.sk_sources_for_physical_schema(physical_schema, sks);
                            if (sksi_conjunctive_removal_module_utilities.NIL != field_name) {
                                SubLObject cdolist_list_var_$66 = tables;
                                SubLObject table = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                table = cdolist_list_var_$66.first();
                                while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var_$66) {
                                    final SubLObject table_name = sksi_kb_accessors.sk_source_name(table);
                                    final SubLObject namespace = sksi_kb_accessors.sk_source_namespace(table);
                                    final SubLObject alias = sksi_query_datastructures.tac_alias_table(tac, lit, table_name, namespace, aliasing_index);
                                    final SubLObject field_expression = sksi_csql_utilities.construct_csql_field_expression(field_name, alias, namespace);
                                    if (sksi_conjunctive_removal_module_utilities.NIL != list_utilities.member_equalP(field_expression, fields)) {
                                        if (sksi_conjunctive_removal_module_utilities.NIL != el_utilities.el_list_p(reformed)) {
                                            final SubLObject reformed_list = evaluation_defns.el_list_to_subl_list(reformed);
                                            SubLObject or_list = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                            SubLObject cdolist_list_var_$67 = reformed_list;
                                            SubLObject reformed_element = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                            reformed_element = cdolist_list_var_$67.first();
                                            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var_$67) {
                                                if (reformed_element.isString()) {
                                                    or_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(sksi_conjunctive_removal_module_utilities.$const20$CSQLEquals, field_expression, reformed_element), or_list);
                                                }
                                                else {
                                                    or_list = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(sksi_csql_generation.$csql_default_db_equals$.getGlobalValue(), field_expression, reformed_element), or_list);
                                                }
                                                cdolist_list_var_$67 = cdolist_list_var_$67.rest();
                                                reformed_element = cdolist_list_var_$67.first();
                                            }
                                            final SubLObject item_var;
                                            or_list = (item_var = sksi_csql_utilities.csql_disjoin_expressions(or_list));
                                            if (sksi_conjunctive_removal_module_utilities.NIL == conses_high.member(item_var, where, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.IDENTITY))) {
                                                where = (SubLObject)ConsesLow.cons(item_var, where);
                                            }
                                        }
                                        else if (reformed.isString()) {
                                            final SubLObject item_var2 = (SubLObject)ConsesLow.list(sksi_conjunctive_removal_module_utilities.$const20$CSQLEquals, field_expression, reformed);
                                            if (sksi_conjunctive_removal_module_utilities.NIL == conses_high.member(item_var2, where, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.IDENTITY))) {
                                                where = (SubLObject)ConsesLow.cons(item_var2, where);
                                            }
                                        }
                                        else {
                                            final SubLObject item_var2 = (SubLObject)ConsesLow.list(sksi_csql_generation.$csql_default_db_equals$.getGlobalValue(), field_expression, reformed);
                                            if (sksi_conjunctive_removal_module_utilities.NIL == conses_high.member(item_var2, where, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.IDENTITY))) {
                                                where = (SubLObject)ConsesLow.cons(item_var2, where);
                                            }
                                        }
                                    }
                                    cdolist_list_var_$66 = cdolist_list_var_$66.rest();
                                    table = cdolist_list_var_$66.first();
                                }
                            }
                        }
                        if (sksi_conjunctive_removal_module_utilities.NIL != eval) {
                            if (sksi_conjunctive_removal_module_utilities.NIL != el_utilities.el_list_p(reformed)) {
                                final SubLObject reformed_list2 = evaluation_defns.el_list_to_subl_list(reformed);
                                SubLObject or_list2 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                SubLObject cdolist_list_var_$68 = reformed_list2;
                                SubLObject reformed_element2 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                reformed_element2 = cdolist_list_var_$68.first();
                                while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var_$68) {
                                    if (reformed_element2.isString()) {
                                        or_list2 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(sksi_conjunctive_removal_module_utilities.$const20$CSQLEquals, eval, reformed_element2), or_list2);
                                    }
                                    else {
                                        or_list2 = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(sksi_csql_generation.$csql_default_db_equals$.getGlobalValue(), eval, reformed_element2), or_list2);
                                    }
                                    cdolist_list_var_$68 = cdolist_list_var_$68.rest();
                                    reformed_element2 = cdolist_list_var_$68.first();
                                }
                                final SubLObject item_var3;
                                or_list2 = (item_var3 = sksi_csql_utilities.csql_disjoin_expressions(or_list2));
                                if (sksi_conjunctive_removal_module_utilities.NIL == conses_high.member(item_var3, where, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.IDENTITY))) {
                                    where = (SubLObject)ConsesLow.cons(item_var3, where);
                                }
                            }
                            else if (reformed.isString()) {
                                final SubLObject item_var4 = (SubLObject)ConsesLow.list(sksi_conjunctive_removal_module_utilities.$const20$CSQLEquals, eval, reformed);
                                if (sksi_conjunctive_removal_module_utilities.NIL == conses_high.member(item_var4, where, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.IDENTITY))) {
                                    where = (SubLObject)ConsesLow.cons(item_var4, where);
                                }
                            }
                            else {
                                final SubLObject item_var4 = (SubLObject)ConsesLow.list(sksi_csql_generation.$csql_default_db_equals$.getGlobalValue(), eval, reformed);
                                if (sksi_conjunctive_removal_module_utilities.NIL == conses_high.member(item_var4, where, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.IDENTITY))) {
                                    where = (SubLObject)ConsesLow.cons(item_var4, where);
                                }
                            }
                        }
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum2, (SubLObject)sksi_conjunctive_removal_module_utilities.$list95);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pfi_encoding_pair = cdolist_list_var.first();
            }
            if (sksi_conjunctive_removal_module_utilities.NIL == reformulatableP) {
                Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw51$SKSI_UNREFORMULATABLE, lit_arg);
            }
        }
        else if (ms_arg.isList()) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification.unify(lit_arg, ms_arg, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            final SubLObject justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sksi_conjunctive_removal_module_utilities.NIL == v_bindings) {
                Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw50$SKSI_LIT_MS_ARG_MISMATCH, (SubLObject)ConsesLow.list(lit_arg, ms_arg));
            }
        }
        where = sksi_csql_utilities.csql_conjoin_expressions(where);
        return Values.values(vars, select, where, var_lfi_map);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 91327L)
    public static SubLObject get_decoding_field_expressions_for_logical_field_indexical(final SubLObject lit, final SubLObject logical_field_indexical, final SubLObject sks, final SubLObject lit_pfi_selects, final SubLObject tac) {
        final SubLObject lfi_index = sksi_kb_accessors.lfi_index_for_lfi(logical_field_indexical, (SubLObject)sksi_conjunctive_removal_module_utilities.ZERO_INTEGER);
        if (lfi_index.isZero()) {
            final SubLObject logical_field = sksi_kb_accessors.logical_field_for_indexical(logical_field_indexical);
            if (sksi_conjunctive_removal_module_utilities.NIL == logical_field) {
                Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw18$SKSI_MISSING_LOGICAL_FIELD_FOR_INDEXICAL, logical_field_indexical);
            }
            return get_decoding_field_expressions_for_logical_field(lit, logical_field, sks, lit_pfi_selects, tac);
        }
        final SubLObject decodings = sksi_field_translation_utilities.generate_decoding_compositions_for_logical_field_indexical(logical_field_indexical, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        SubLObject field_expressions = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject cdolist_list_var = decodings;
        SubLObject decoding = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        decoding = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$69;
            final SubLObject physical_field_indexicals = cdolist_list_var_$69 = sksi_field_translation_utilities.decoding_physical_field_indexicals(decoding);
            SubLObject physical_field_indexical = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            physical_field_indexical = cdolist_list_var_$69.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var_$69) {
                if (sksi_conjunctive_removal_module_utilities.NIL == sksi_kb_accessors.physical_field_indexical_virtualP(physical_field_indexical)) {
                    final SubLObject pfi = sksi_kb_accessors.pfi_fort_for_pfi(physical_field_indexical);
                    final SubLObject aliasing_index = sksi_kb_accessors.pfi_index_for_pfi(physical_field_indexical, (SubLObject)sksi_conjunctive_removal_module_utilities.ZERO_INTEGER);
                    final SubLObject field = sksi_kb_accessors.physical_field_indexical_name(pfi);
                    final SubLObject physical_schema = sksi_kb_accessors.physical_field_indexical_schema(pfi);
                    SubLObject cdolist_list_var_$70;
                    final SubLObject tables = cdolist_list_var_$70 = sksi_query_utilities.sk_sources_for_physical_schema(physical_schema, sks);
                    SubLObject table = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                    table = cdolist_list_var_$70.first();
                    while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var_$70) {
                        final SubLObject table_name = sksi_kb_accessors.sk_source_name(table);
                        final SubLObject namespace = sksi_kb_accessors.sk_source_namespace(table);
                        final SubLObject alias = sksi_query_datastructures.tac_alias_table(tac, lit, table_name, namespace, aliasing_index);
                        final SubLObject field_expression = sksi_csql_utilities.construct_csql_field_expression(field, alias, namespace);
                        double_dictionary_pushnew(lit_pfi_selects, lit, physical_field_indexical, field_expression, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL));
                        field_expressions = (SubLObject)ConsesLow.cons(field_expression, field_expressions);
                        cdolist_list_var_$70 = cdolist_list_var_$70.rest();
                        table = cdolist_list_var_$70.first();
                    }
                }
                cdolist_list_var_$69 = cdolist_list_var_$69.rest();
                physical_field_indexical = cdolist_list_var_$69.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            decoding = cdolist_list_var.first();
        }
        return field_expressions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 93432L)
    public static SubLObject get_decoding_field_expressions_for_logical_field(final SubLObject lit, final SubLObject logical_field, final SubLObject sks, final SubLObject lit_pfi_selects, final SubLObject tac) {
        final SubLObject physical_fields = sksi_kb_accessors.sksi_get_decoding_mapped_physical_fields_for_logical_field(logical_field);
        SubLObject field_expressions = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject cdolist_list_var = physical_fields;
        SubLObject physical_field = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        physical_field = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
            if (sksi_conjunctive_removal_module_utilities.NIL == sksi_kb_accessors.physical_field_virtualP(physical_field)) {
                final SubLObject field = sksi_kb_accessors.physical_field_name(physical_field);
                final SubLObject physical_schema = sksi_kb_accessors.physical_field_schema(physical_field);
                SubLObject cdolist_list_var_$71;
                final SubLObject tables = cdolist_list_var_$71 = sksi_query_utilities.sk_sources_for_physical_schema(physical_schema, sks);
                SubLObject table = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                table = cdolist_list_var_$71.first();
                while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var_$71) {
                    final SubLObject table_name = sksi_kb_accessors.sk_source_name(table);
                    final SubLObject namespace = sksi_kb_accessors.sk_source_namespace(table);
                    final SubLObject alias = sksi_query_datastructures.tac_alias_table(tac, lit, table_name, namespace, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                    final SubLObject field_expression = sksi_csql_utilities.construct_csql_field_expression(field, alias, namespace);
                    final SubLObject pfi = sksi_kb_accessors.indexical_for_physical_field(physical_field);
                    if (sksi_conjunctive_removal_module_utilities.NIL != pfi) {
                        double_dictionary_pushnew(lit_pfi_selects, lit, pfi, field_expression, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL));
                    }
                    field_expressions = (SubLObject)ConsesLow.cons(field_expression, field_expressions);
                    cdolist_list_var_$71 = cdolist_list_var_$71.rest();
                    table = cdolist_list_var_$71.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            physical_field = cdolist_list_var.first();
        }
        return field_expressions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 94619L)
    public static SubLObject get_encoding_field_expressions_for_logical_field_indexical(final SubLObject lit, final SubLObject logical_field_indexical, final SubLObject sks, final SubLObject tac) {
        final SubLObject lfi_index = sksi_kb_accessors.lfi_index_for_lfi(logical_field_indexical, (SubLObject)sksi_conjunctive_removal_module_utilities.ZERO_INTEGER);
        if (lfi_index.isZero()) {
            final SubLObject logical_field = sksi_kb_accessors.logical_field_for_indexical(logical_field_indexical);
            if (sksi_conjunctive_removal_module_utilities.NIL == logical_field) {
                Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw18$SKSI_MISSING_LOGICAL_FIELD_FOR_INDEXICAL, logical_field_indexical);
            }
            return get_encoding_field_expressions_for_logical_field(lit, logical_field, sks, tac);
        }
        final SubLObject pfi_encoding_pairs = sksi_field_translation_utilities.generate_encoding_compositions_from_logical_field_indexical(logical_field_indexical, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        final SubLObject physical_field_indexicals = list_utilities.delete_duplicates_from_end(Mapping.mapcar(Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym96$FIRST), pfi_encoding_pairs), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        SubLObject field_expressions = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject cdolist_list_var = physical_field_indexicals;
        SubLObject physical_field_indexical = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        physical_field_indexical = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
            if (sksi_conjunctive_removal_module_utilities.NIL == sksi_kb_accessors.physical_field_indexical_virtualP(physical_field_indexical)) {
                final SubLObject pfi = sksi_kb_accessors.pfi_fort_for_pfi(physical_field_indexical);
                final SubLObject aliasing_index = sksi_kb_accessors.pfi_index_for_pfi(physical_field_indexical, (SubLObject)sksi_conjunctive_removal_module_utilities.ZERO_INTEGER);
                final SubLObject field = sksi_kb_accessors.physical_field_indexical_name(pfi);
                final SubLObject physical_schema = sksi_kb_accessors.physical_field_indexical_schema(pfi);
                SubLObject cdolist_list_var_$72;
                final SubLObject tables = cdolist_list_var_$72 = sksi_query_utilities.sk_sources_for_physical_schema(physical_schema, sks);
                SubLObject table = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                table = cdolist_list_var_$72.first();
                while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var_$72) {
                    final SubLObject table_name = sksi_kb_accessors.sk_source_name(table);
                    final SubLObject namespace = sksi_kb_accessors.sk_source_namespace(table);
                    final SubLObject alias = sksi_query_datastructures.tac_alias_table(tac, lit, table_name, namespace, aliasing_index);
                    field_expressions = (SubLObject)ConsesLow.cons(sksi_csql_utilities.construct_csql_field_expression(field, alias, namespace), field_expressions);
                    cdolist_list_var_$72 = cdolist_list_var_$72.rest();
                    table = cdolist_list_var_$72.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            physical_field_indexical = cdolist_list_var.first();
        }
        return field_expressions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 96424L)
    public static SubLObject get_encoding_field_expressions_for_logical_field(final SubLObject lit, final SubLObject logical_field, final SubLObject sks, final SubLObject tac) {
        final SubLObject physical_fields = sksi_kb_accessors.sksi_get_encoding_mapped_physical_fields_for_logical_field(logical_field);
        SubLObject field_expressions = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject cdolist_list_var = physical_fields;
        SubLObject physical_field = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        physical_field = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
            if (sksi_conjunctive_removal_module_utilities.NIL == sksi_kb_accessors.physical_field_virtualP(physical_field)) {
                final SubLObject field = sksi_kb_accessors.physical_field_name(physical_field);
                final SubLObject physical_schema = sksi_kb_accessors.physical_field_schema(physical_field);
                SubLObject cdolist_list_var_$73;
                final SubLObject tables = cdolist_list_var_$73 = sksi_query_utilities.sk_sources_for_physical_schema(physical_schema, sks);
                SubLObject table = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                table = cdolist_list_var_$73.first();
                while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var_$73) {
                    final SubLObject table_name = sksi_kb_accessors.sk_source_name(table);
                    final SubLObject namespace = sksi_kb_accessors.sk_source_namespace(table);
                    final SubLObject alias = sksi_query_datastructures.tac_alias_table(tac, lit, table_name, namespace, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                    field_expressions = (SubLObject)ConsesLow.cons(sksi_csql_utilities.construct_csql_field_expression(field, alias, namespace), field_expressions);
                    cdolist_list_var_$73 = cdolist_list_var_$73.rest();
                    table = cdolist_list_var_$73.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            physical_field = cdolist_list_var.first();
        }
        return field_expressions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 97311L)
    public static SubLObject get_field_expressions_for_physical_field(final SubLObject physical_field, final SubLObject sks, SubLObject tac) {
        if (tac == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            tac = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        SubLObject field_expressions = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL == sksi_kb_accessors.physical_field_virtualP(physical_field)) {
            final SubLObject field_name = sksi_kb_accessors.physical_field_name(physical_field);
            final SubLObject physical_schema = sksi_kb_accessors.physical_field_schema(physical_field);
            SubLObject cdolist_list_var;
            final SubLObject tables = cdolist_list_var = sksi_query_utilities.sk_sources_for_physical_schema(physical_schema, sks);
            SubLObject table = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            table = cdolist_list_var.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
                final SubLObject table_name = sksi_kb_accessors.sk_source_name(table);
                final SubLObject namespace = sksi_kb_accessors.sk_source_namespace(table);
                if (sksi_conjunctive_removal_module_utilities.NIL != sksi_query_datastructures.table_aliasing_context_p(tac)) {
                    SubLObject cdolist_list_var_$74;
                    final SubLObject aliases = cdolist_list_var_$74 = sksi_query_datastructures.tac_lookup_aliases_for_table(tac, table_name, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                    SubLObject alias = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                    alias = cdolist_list_var_$74.first();
                    while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var_$74) {
                        field_expressions = (SubLObject)ConsesLow.cons(sksi_csql_utilities.construct_csql_field_expression(field_name, alias, namespace), field_expressions);
                        cdolist_list_var_$74 = cdolist_list_var_$74.rest();
                        alias = cdolist_list_var_$74.first();
                    }
                }
                else {
                    field_expressions = (SubLObject)ConsesLow.cons(sksi_csql_utilities.construct_csql_field_expression(field_name, table_name, namespace), field_expressions);
                }
                cdolist_list_var = cdolist_list_var.rest();
                table = cdolist_list_var.first();
            }
        }
        return field_expressions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 98191L)
    public static SubLObject get_decodings_for_logical_field_indexical_internal(final SubLObject logical_field_indexical, final SubLObject logical_schemata, final SubLObject physical_schemata) {
        return sksi_field_translation_utilities.generate_decoding_compositions_for_logical_field_indexical(logical_field_indexical, logical_schemata, physical_schemata);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 98191L)
    public static SubLObject get_decodings_for_logical_field_indexical(final SubLObject logical_field_indexical, final SubLObject logical_schemata, final SubLObject physical_schemata) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL == v_memoization_state) {
            return get_decodings_for_logical_field_indexical_internal(logical_field_indexical, logical_schemata, physical_schemata);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym97$GET_DECODINGS_FOR_LOGICAL_FIELD_INDEXICAL, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (sksi_conjunctive_removal_module_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_conjunctive_removal_module_utilities.$sym97$GET_DECODINGS_FOR_LOGICAL_FIELD_INDEXICAL, (SubLObject)sksi_conjunctive_removal_module_utilities.THREE_INTEGER, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, (SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym97$GET_DECODINGS_FOR_LOGICAL_FIELD_INDEXICAL, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(logical_field_indexical, logical_schemata, physical_schemata);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (logical_field_indexical.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (logical_schemata.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sksi_conjunctive_removal_module_utilities.NIL != cached_args && sksi_conjunctive_removal_module_utilities.NIL == cached_args.rest() && physical_schemata.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_decodings_for_logical_field_indexical_internal(logical_field_indexical, logical_schemata, physical_schemata)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(logical_field_indexical, logical_schemata, physical_schemata));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 98561L)
    public static SubLObject get_pfi_encoding_pairs_for_logical_field_indexical_internal(final SubLObject logical_field_indexical, final SubLObject physical_schemata) {
        return sksi_field_translation_utilities.generate_encoding_compositions_from_logical_field_indexical(logical_field_indexical, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, physical_schemata, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 98561L)
    public static SubLObject get_pfi_encoding_pairs_for_logical_field_indexical(final SubLObject logical_field_indexical, final SubLObject physical_schemata) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL == v_memoization_state) {
            return get_pfi_encoding_pairs_for_logical_field_indexical_internal(logical_field_indexical, physical_schemata);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym98$GET_PFI_ENCODING_PAIRS_FOR_LOGICAL_FIELD_INDEXICAL, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (sksi_conjunctive_removal_module_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_conjunctive_removal_module_utilities.$sym98$GET_PFI_ENCODING_PAIRS_FOR_LOGICAL_FIELD_INDEXICAL, (SubLObject)sksi_conjunctive_removal_module_utilities.TWO_INTEGER, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, (SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym98$GET_PFI_ENCODING_PAIRS_FOR_LOGICAL_FIELD_INDEXICAL, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(logical_field_indexical, physical_schemata);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (logical_field_indexical.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_conjunctive_removal_module_utilities.NIL != cached_args && sksi_conjunctive_removal_module_utilities.NIL == cached_args.rest() && physical_schemata.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_pfi_encoding_pairs_for_logical_field_indexical_internal(logical_field_indexical, physical_schemata)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(logical_field_indexical, physical_schemata));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 98937L)
    public static SubLObject get_primary_keys_for_logical_field_indexical_internal(final SubLObject logical_field_indexical, final SubLObject logical_schemata, final SubLObject physical_schemata, SubLObject mt_info) {
        if (mt_info == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        }
        final SubLObject decodings = get_decodings_for_logical_field_indexical(logical_field_indexical, logical_schemata, physical_schemata);
        return get_primary_keys_from_decodings(decodings, physical_schemata);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 98937L)
    public static SubLObject get_primary_keys_for_logical_field_indexical(final SubLObject logical_field_indexical, final SubLObject logical_schemata, final SubLObject physical_schemata, SubLObject mt_info) {
        if (mt_info == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info((SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL == v_memoization_state) {
            return get_primary_keys_for_logical_field_indexical_internal(logical_field_indexical, logical_schemata, physical_schemata, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym99$GET_PRIMARY_KEYS_FOR_LOGICAL_FIELD_INDEXICAL, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (sksi_conjunctive_removal_module_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_conjunctive_removal_module_utilities.$sym99$GET_PRIMARY_KEYS_FOR_LOGICAL_FIELD_INDEXICAL, (SubLObject)sksi_conjunctive_removal_module_utilities.FOUR_INTEGER, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, (SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym99$GET_PRIMARY_KEYS_FOR_LOGICAL_FIELD_INDEXICAL, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(logical_field_indexical, logical_schemata, physical_schemata, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (logical_field_indexical.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (logical_schemata.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (physical_schemata.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (sksi_conjunctive_removal_module_utilities.NIL != cached_args && sksi_conjunctive_removal_module_utilities.NIL == cached_args.rest() && mt_info.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_primary_keys_for_logical_field_indexical_internal(logical_field_indexical, logical_schemata, physical_schemata, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(logical_field_indexical, logical_schemata, physical_schemata, mt_info));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 99345L)
    public static SubLObject get_primary_keys_from_decodings_internal(final SubLObject decodings, final SubLObject physical_schemata) {
        SubLObject primary_keys = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject cdolist_list_var = decodings;
        SubLObject decoding = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        decoding = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
            final SubLObject pfi_list = sksi_field_translation_utilities.decoding_physical_field_indexicals_ordered(decoding);
            final SubLObject pf_list = Mapping.mapcar((SubLObject)sksi_conjunctive_removal_module_utilities.$sym101$PHYSICAL_FIELD_FOR_INDEXICAL, pfi_list);
            if (sksi_conjunctive_removal_module_utilities.NIL != primary_key_for_some_physical_schemaP(pf_list, physical_schemata)) {
                primary_keys = (SubLObject)ConsesLow.cons(pf_list, primary_keys);
            }
            cdolist_list_var = cdolist_list_var.rest();
            decoding = cdolist_list_var.first();
        }
        return primary_keys;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 99345L)
    public static SubLObject get_primary_keys_from_decodings(final SubLObject decodings, final SubLObject physical_schemata) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL == v_memoization_state) {
            return get_primary_keys_from_decodings_internal(decodings, physical_schemata);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym100$GET_PRIMARY_KEYS_FROM_DECODINGS, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (sksi_conjunctive_removal_module_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_conjunctive_removal_module_utilities.$sym100$GET_PRIMARY_KEYS_FROM_DECODINGS, (SubLObject)sksi_conjunctive_removal_module_utilities.TWO_INTEGER, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, (SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym100$GET_PRIMARY_KEYS_FROM_DECODINGS, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(decodings, physical_schemata);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (decodings.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (sksi_conjunctive_removal_module_utilities.NIL != cached_args && sksi_conjunctive_removal_module_utilities.NIL == cached_args.rest() && physical_schemata.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(get_primary_keys_from_decodings_internal(decodings, physical_schemata)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(decodings, physical_schemata));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 99816L)
    public static SubLObject primary_key_for_some_physical_schemaP(final SubLObject key, final SubLObject physical_schemata) {
        SubLObject primary_keyP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL == primary_keyP) {
            SubLObject csome_list_var;
            SubLObject physical_schema;
            for (csome_list_var = physical_schemata, physical_schema = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, physical_schema = csome_list_var.first(); sksi_conjunctive_removal_module_utilities.NIL == primary_keyP && sksi_conjunctive_removal_module_utilities.NIL != csome_list_var; primary_keyP = sksi_kb_accessors.physical_schema_primary_key_p(physical_schema, key), csome_list_var = csome_list_var.rest(), physical_schema = csome_list_var.first()) {}
        }
        return primary_keyP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 100083L)
    public static SubLObject sksi_crm_required_fields_have_values_in_where_clauseP(final SubLObject where_clause, final SubLObject sks_profile, final SubLObject tac) {
        final SubLObject required_fields = sksi_query_datastructures.sks_profile_required_fields(sks_profile);
        final SubLObject sks = sksi_query_datastructures.sks_profile_sks(sks_profile);
        SubLObject failureP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL == failureP) {
            SubLObject csome_list_var = required_fields;
            SubLObject required_field = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            required_field = csome_list_var.first();
            while (sksi_conjunctive_removal_module_utilities.NIL == failureP && sksi_conjunctive_removal_module_utilities.NIL != csome_list_var) {
                final SubLObject field_expressions = get_field_expressions_for_physical_field(required_field, sks, tac);
                SubLObject successP = (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL == sksi_crm_relevant_table_present_in_where_clauseP(where_clause, field_expressions));
                if (sksi_conjunctive_removal_module_utilities.NIL == successP) {
                    SubLObject csome_list_var_$75 = where_clause;
                    SubLObject where_expression = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                    where_expression = csome_list_var_$75.first();
                    while (sksi_conjunctive_removal_module_utilities.NIL == successP && sksi_conjunctive_removal_module_utilities.NIL != csome_list_var_$75) {
                        if (sksi_conjunctive_removal_module_utilities.NIL == successP) {
                            SubLObject csome_list_var_$76 = field_expressions;
                            SubLObject field_expression = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                            field_expression = csome_list_var_$76.first();
                            while (sksi_conjunctive_removal_module_utilities.NIL == successP && sksi_conjunctive_removal_module_utilities.NIL != csome_list_var_$76) {
                                if (sksi_conjunctive_removal_module_utilities.NIL != where_expression_contains_value_for_field_expressionP(where_expression, field_expression)) {
                                    successP = (SubLObject)sksi_conjunctive_removal_module_utilities.T;
                                }
                                csome_list_var_$76 = csome_list_var_$76.rest();
                                field_expression = csome_list_var_$76.first();
                            }
                        }
                        csome_list_var_$75 = csome_list_var_$75.rest();
                        where_expression = csome_list_var_$75.first();
                    }
                }
                if (sksi_conjunctive_removal_module_utilities.NIL == successP) {
                    failureP = (SubLObject)sksi_conjunctive_removal_module_utilities.T;
                    Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw49$SKSI_MISSING_REQUIRED_FIELD_VALUE, (SubLObject)ConsesLow.list(required_field, sksi_kb_accessors.physical_field_schema(required_field)));
                }
                csome_list_var = csome_list_var.rest();
                required_field = csome_list_var.first();
            }
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL == failureP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 101068L)
    public static SubLObject sksi_crm_relevant_table_present_in_where_clauseP(final SubLObject where_clause, final SubLObject field_expressions) {
        final SubLObject table_names = Mapping.mapcar((SubLObject)sksi_conjunctive_removal_module_utilities.$sym102$CSQL_FIELD_EXPRESSION_TABLE_NAME, field_expressions);
        SubLObject presentP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL == presentP) {
            SubLObject csome_list_var = table_names;
            SubLObject table_name = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            table_name = csome_list_var.first();
            while (sksi_conjunctive_removal_module_utilities.NIL == presentP && sksi_conjunctive_removal_module_utilities.NIL != csome_list_var) {
                if (sksi_conjunctive_removal_module_utilities.NIL != list_utilities.tree_find(table_name, where_clause, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED)) {
                    presentP = (SubLObject)sksi_conjunctive_removal_module_utilities.T;
                }
                csome_list_var = csome_list_var.rest();
                table_name = csome_list_var.first();
            }
        }
        return presentP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 101422L)
    public static SubLObject where_expression_contains_value_for_field_expressionP(final SubLObject where_expression, final SubLObject field_expression) {
        if (!where_expression.isList()) {
            return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        final SubLObject pcase_var = where_expression.first();
        if (pcase_var.eql(sksi_conjunctive_removal_module_utilities.$const20$CSQLEquals) || pcase_var.eql(sksi_conjunctive_removal_module_utilities.$const103$CSQLStrictlyEquals)) {
            SubLObject current;
            final SubLObject datum = current = where_expression.rest();
            SubLObject left = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject right = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list104);
            left = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list104);
            right = current.first();
            current = current.rest();
            if (sksi_conjunctive_removal_module_utilities.NIL == current) {
                return (SubLObject)((sksi_conjunctive_removal_module_utilities.NIL != sksi_csql_utilities.csql_field_expression_p(left)) ? SubLObjectFactory.makeBoolean(field_expression.equal(left) && sksi_conjunctive_removal_module_utilities.NIL == sksi_csql_utilities.csql_field_expression_p(right)) : SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL != sksi_csql_utilities.csql_field_expression_p(right) && field_expression.equal(right)));
            }
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list104);
            return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        else {
            if (pcase_var.eql((SubLObject)sksi_conjunctive_removal_module_utilities.$kw105$AND)) {
                SubLObject successP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                if (sksi_conjunctive_removal_module_utilities.NIL == successP) {
                    SubLObject csome_list_var = where_expression.rest();
                    SubLObject subexp = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                    subexp = csome_list_var.first();
                    while (sksi_conjunctive_removal_module_utilities.NIL == successP && sksi_conjunctive_removal_module_utilities.NIL != csome_list_var) {
                        if (sksi_conjunctive_removal_module_utilities.NIL != where_expression_contains_value_for_field_expressionP(subexp, field_expression)) {
                            successP = (SubLObject)sksi_conjunctive_removal_module_utilities.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        subexp = csome_list_var.first();
                    }
                }
                return successP;
            }
            if (pcase_var.eql((SubLObject)sksi_conjunctive_removal_module_utilities.$kw106$OR)) {
                SubLObject failureP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                if (sksi_conjunctive_removal_module_utilities.NIL == failureP) {
                    SubLObject csome_list_var = where_expression.rest();
                    SubLObject subexp = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                    subexp = csome_list_var.first();
                    while (sksi_conjunctive_removal_module_utilities.NIL == failureP && sksi_conjunctive_removal_module_utilities.NIL != csome_list_var) {
                        if (sksi_conjunctive_removal_module_utilities.NIL == where_expression_contains_value_for_field_expressionP(subexp, field_expression)) {
                            failureP = (SubLObject)sksi_conjunctive_removal_module_utilities.T;
                        }
                        csome_list_var = csome_list_var.rest();
                        subexp = csome_list_var.first();
                    }
                }
                return (SubLObject)SubLObjectFactory.makeBoolean(sksi_conjunctive_removal_module_utilities.NIL == failureP);
            }
            return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 102693L)
    public static SubLObject sksi_crm_get_where_clauses_from_conditional_meaning_sentence_gaf(final SubLObject meaning_sentence_gaf, final SubLObject lit, final SubLObject sks_profile, final SubLObject tac) {
        final SubLObject sks = sksi_query_datastructures.sks_profile_sks(sks_profile);
        final SubLObject content_mt = sksi_query_datastructures.sks_profile_content_mt(sks_profile);
        final SubLObject physical_schemata = sksi_query_datastructures.sks_profile_physical_schemata(sks_profile);
        final SubLObject where_exp = sksi_query_utilities.get_where_expression_from_antecedent_meaning_sentence(meaning_sentence_gaf, content_mt, sks, physical_schemata, lit, tac);
        final SubLObject where_clause = (SubLObject)ConsesLow.list(where_exp);
        return sksi_csql_utilities.csql_conjoin_expressions(where_clause);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 103390L)
    public static SubLObject sksi_crm_get_where_clauses_from_sksi_unknown_sentence_asents(final SubLObject asents, final SubLObject meaning_sentence_gafs, final SubLObject sksi_unknown_sentence_asents, final SubLObject eval_var_selects, final SubLObject var_eval_expressions, final SubLObject vars, final SubLObject var_pfi_encodings, final SubLObject var_lit_pfis, final SubLObject lit_pfi_selects, final SubLObject var_lfi_map, final SubLObject sks_profile, final SubLObject tac, final SubLObject var_lit_decodings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject where = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject from = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        sksi_query_datastructures.tac_clear_lits(tac);
        SubLObject cdolist_list_var = sksi_unknown_sentence_asents;
        SubLObject unknown_sentence_asent = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        unknown_sentence_asent = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_lit_pfis$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_pfis_encodings$.currentBinding(thread);
            final SubLObject _prev_bind_3 = sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_lit_pfi_selects$.currentBinding(thread);
            final SubLObject _prev_bind_4 = sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_lfi_map$.currentBinding(thread);
            final SubLObject _prev_bind_5 = sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_lit_decodings$.currentBinding(thread);
            final SubLObject _prev_bind_6 = sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_tac$.currentBinding(thread);
            try {
                sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_lit_pfis$.bind(dictionary_utilities.copy_dictionary_recursive(var_lit_pfis), thread);
                sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_pfis_encodings$.bind(dictionary_utilities.copy_dictionary_recursive(var_pfi_encodings), thread);
                sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_lit_pfi_selects$.bind(dictionary_utilities.copy_dictionary_recursive(lit_pfi_selects), thread);
                sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_lfi_map$.bind(dictionary_utilities.copy_dictionary_recursive(var_lfi_map), thread);
                sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_lit_decodings$.bind(dictionary_utilities.copy_dictionary_recursive(var_lit_decodings), thread);
                sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_tac$.bind(tac, thread);
                final SubLObject tac_copy = sksi_query_datastructures.copy_table_aliasing_context(tac);
                thread.resetMultipleValues();
                final SubLObject unknown_sentence_asent_where = sksi_crm_get_where_clauses_from_sksi_unknown_sentence_asent(asents, meaning_sentence_gafs, unknown_sentence_asent, eval_var_selects, var_eval_expressions, vars, var_pfi_encodings, var_lit_pfis, lit_pfi_selects, var_lfi_map, sks_profile, tac_copy);
                final SubLObject unknown_sentence_asent_from = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (sksi_conjunctive_removal_module_utilities.NIL != unknown_sentence_asent_where) {
                    where = (SubLObject)ConsesLow.cons(unknown_sentence_asent_where, where);
                    from = ConsesLow.append(from, unknown_sentence_asent_from);
                }
                else {
                    Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw57$SKSI_UNKNOWN_SENTENCE_CSQL_UNPRODUCIBLE, unknown_sentence_asent);
                }
                where = ConsesLow.append(where, remake_where_clause(where, tac_copy, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED));
            }
            finally {
                sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_tac$.rebind(_prev_bind_6, thread);
                sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_lit_decodings$.rebind(_prev_bind_5, thread);
                sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_lfi_map$.rebind(_prev_bind_4, thread);
                sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_lit_pfi_selects$.rebind(_prev_bind_3, thread);
                sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_pfis_encodings$.rebind(_prev_bind_2, thread);
                sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_lit_pfis$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            unknown_sentence_asent = cdolist_list_var.first();
        }
        where = remake_where_clause(where, tac, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        return Values.values(sksi_csql_utilities.csql_conjoin_expressions(where), from);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 105724L)
    public static SubLObject sksi_crm_get_where_clauses_from_sksi_unknown_sentence_asent(final SubLObject asents, final SubLObject meaning_sentence_gafs, final SubLObject unknown_sentence_asent, final SubLObject eval_var_selects, final SubLObject var_eval_expressions, final SubLObject vars, final SubLObject var_pfi_encodings, final SubLObject var_lit_pfis, final SubLObject lit_pfi_selects, final SubLObject var_lfi_map, final SubLObject sks_profile, final SubLObject tac) {
        final SubLObject asent_asent = inference_datastructures_problem_query.contextualized_asent_asent(unknown_sentence_asent);
        final SubLObject asent_mt = inference_datastructures_problem_query.contextualized_asent_mt(unknown_sentence_asent);
        final SubLObject unknown_sentence = cycl_utilities.atomic_sentence_arg1(asent_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        final SubLObject sks = sksi_query_datastructures.sks_profile_sks(sks_profile);
        final SubLObject logical_schemata = sksi_query_datastructures.sks_profile_logical_schemata(sks_profile);
        final SubLObject physical_schemata = sksi_query_datastructures.sks_profile_physical_schemata(sks_profile);
        return sksi_crm_get_where_clauses_from_sksi_unknown_sentence_asent_recursive(asents, meaning_sentence_gafs, unknown_sentence, asent_mt, sks, logical_schemata, physical_schemata, tac, var_pfi_encodings, var_lit_pfis, lit_pfi_selects, var_lfi_map, sks_profile);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 106698L)
    public static SubLObject sksi_crm_get_where_clauses_from_sksi_unknown_sentence_asent_recursive(final SubLObject asents, final SubLObject meaning_sentence_gafs, final SubLObject unknown_sentence, final SubLObject asent_mt, final SubLObject sks, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject tac, final SubLObject var_pfi_encodings, final SubLObject var_lit_pfis, final SubLObject lit_pfi_selects, final SubLObject var_lfi_map, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_conjunctive_removal_module_utilities.NIL != el_utilities.atomic_sentenceP(unknown_sentence)) {
            if (sksi_conjunctive_removal_module_utilities.NIL != kb_utilities.kbeq(sksi_query_datastructures.sks_profile_type(sks_profile), sksi_conjunctive_removal_module_utilities.$const44$RDFTripleStore_Physical)) {
                return sksi_crm_get_where_clauses_from_sksi_conjunctive_unknown_sentence(asents, meaning_sentence_gafs, unknown_sentence, asent_mt, sks, logical_schemata, physical_schemata, tac, var_pfi_encodings, var_lit_pfis, lit_pfi_selects, var_lfi_map, sks_profile);
            }
            return sksi_crm_get_where_clauses_from_sksi_atomic_unknown_sentence(asents, meaning_sentence_gafs, unknown_sentence, asent_mt, sks, logical_schemata, physical_schemata, tac, var_pfi_encodings, var_lit_pfis, lit_pfi_selects, var_lfi_map);
        }
        else {
            if (sksi_conjunctive_removal_module_utilities.NIL != el_utilities.el_existential_p(unknown_sentence)) {
                return sksi_crm_get_where_clauses_from_sksi_unknown_sentence_asent_recursive(asents, meaning_sentence_gafs, cycl_utilities.formula_arg2(unknown_sentence, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED), asent_mt, sks, logical_schemata, physical_schemata, tac, var_pfi_encodings, var_lit_pfis, lit_pfi_selects, var_lfi_map, sks_profile);
            }
            if (sksi_conjunctive_removal_module_utilities.NIL != el_utilities.el_disjunction_p(unknown_sentence)) {
                SubLObject csql_conjuncts = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                SubLObject from = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                SubLObject failP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                final SubLObject args = cycl_utilities.formula_args(unknown_sentence, (SubLObject)sksi_conjunctive_removal_module_utilities.$kw107$IGNORE);
                SubLObject rest;
                SubLObject disjunct;
                SubLObject csql_conjunct;
                SubLObject conjunct_from;
                for (rest = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, rest = args; sksi_conjunctive_removal_module_utilities.NIL == failP && sksi_conjunctive_removal_module_utilities.NIL != rest; rest = rest.rest()) {
                    disjunct = rest.first();
                    thread.resetMultipleValues();
                    csql_conjunct = sksi_crm_get_where_clauses_from_sksi_unknown_sentence_asent_recursive(asents, meaning_sentence_gafs, disjunct, asent_mt, sks, logical_schemata, physical_schemata, tac, var_pfi_encodings, var_lit_pfis, lit_pfi_selects, var_lfi_map, sks_profile);
                    conjunct_from = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (sksi_conjunctive_removal_module_utilities.NIL != csql_conjunct) {
                        csql_conjuncts = (SubLObject)ConsesLow.cons(csql_conjunct, csql_conjuncts);
                        from = ConsesLow.append(conjunct_from, from);
                    }
                    else {
                        failP = (SubLObject)sksi_conjunctive_removal_module_utilities.T;
                    }
                }
                if (sksi_conjunctive_removal_module_utilities.NIL == failP && sksi_conjunctive_removal_module_utilities.NIL != csql_conjuncts) {
                    return Values.values(sksi_csql_utilities.csql_conjoin_expressions(Sequences.nreverse(csql_conjuncts)), from);
                }
                return Values.values((SubLObject)sksi_conjunctive_removal_module_utilities.NIL, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
            }
            else {
                if (sksi_conjunctive_removal_module_utilities.NIL != el_utilities.el_conjunction_p(unknown_sentence)) {
                    return sksi_crm_get_where_clauses_from_sksi_conjunctive_unknown_sentence(asents, meaning_sentence_gafs, unknown_sentence, asent_mt, sks, logical_schemata, physical_schemata, tac, var_pfi_encodings, var_lit_pfis, lit_pfi_selects, var_lfi_map, sks_profile);
                }
                return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 109244L)
    public static SubLObject sksi_crm_get_where_clauses_from_sksi_conjunctive_unknown_sentence(final SubLObject asents, final SubLObject meaning_sentence_gafs, final SubLObject unknown_sentence, final SubLObject unknown_sentence_mt, final SubLObject sks, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject tac, final SubLObject var_pfi_encodings, final SubLObject var_lit_pfis, final SubLObject lit_pfi_selects, final SubLObject var_lfi_map, final SubLObject sks_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject select = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject from = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject where = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        thread.resetMultipleValues();
        SubLObject contextualized_dnf_clauses = inference_czer.inference_canonicalize_ask_int(unknown_sentence, unknown_sentence_mt, inference_datastructures_enumerated_types.$default_inference_disjunction_free_el_vars_policy$.getGlobalValue());
        SubLObject v_bindings = thread.secondMultipleValue();
        final SubLObject free_el_vars = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        final SubLObject outer_scope_hl_vars = (SubLObject)((sksi_conjunctive_removal_module_utilities.NIL != sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_pfis_encodings$.getDynamicValue(thread)) ? dictionary.dictionary_keys(sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_pfis_encodings$.getDynamicValue(thread)) : sksi_conjunctive_removal_module_utilities.NIL);
        SubLObject new_variable_id_start = (SubLObject)sksi_conjunctive_removal_module_utilities.ZERO_INTEGER;
        SubLObject replacement_alist = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject cdolist_list_var = outer_scope_hl_vars;
        SubLObject outer_variable = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        outer_variable = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
            new_variable_id_start = Numbers.max(new_variable_id_start, Numbers.add((SubLObject)sksi_conjunctive_removal_module_utilities.ONE_INTEGER, variables.variable_id(outer_variable)));
            cdolist_list_var = cdolist_list_var.rest();
            outer_variable = cdolist_list_var.first();
        }
        SubLObject list_var = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject inner_hl_variable = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject num = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        list_var = list_utilities.alist_values(v_bindings);
        inner_hl_variable = list_var.first();
        for (num = (SubLObject)sksi_conjunctive_removal_module_utilities.ZERO_INTEGER; sksi_conjunctive_removal_module_utilities.NIL != list_var; list_var = list_var.rest(), inner_hl_variable = list_var.first(), num = Numbers.add((SubLObject)sksi_conjunctive_removal_module_utilities.ONE_INTEGER, num)) {
            new_variable_id_start = Numbers.max(new_variable_id_start, Numbers.add((SubLObject)sksi_conjunctive_removal_module_utilities.ONE_INTEGER, variables.variable_id(inner_hl_variable)));
            replacement_alist = list_utilities.alist_enter(replacement_alist, inner_hl_variable, variables.get_variable(Numbers.add(num, new_variable_id_start)), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        }
        cdolist_list_var = v_bindings;
        SubLObject cons = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        cons = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject possible_outer_hl_var = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject inner_hl_var = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list108);
            possible_outer_hl_var = current.first();
            current = (inner_hl_var = current.rest());
            if (sksi_conjunctive_removal_module_utilities.NIL != cycl_variables.hl_varP(possible_outer_hl_var)) {
                replacement_alist = list_utilities.alist_enter(replacement_alist, inner_hl_var, possible_outer_hl_var, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        contextualized_dnf_clauses = bindings.apply_bindings(replacement_alist, contextualized_dnf_clauses);
        SubLObject new_bindings = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject cdolist_list_var2 = v_bindings;
        SubLObject cons2 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        cons2 = cdolist_list_var2.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var2) {
            SubLObject current2;
            final SubLObject datum2 = current2 = cons2;
            SubLObject old_var = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject new_var = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current2, datum2, (SubLObject)sksi_conjunctive_removal_module_utilities.$list109);
            old_var = current2.first();
            current2 = (new_var = current2.rest());
            new_bindings = list_utilities.alist_enter(new_bindings, old_var, list_utilities.alist_lookup(replacement_alist, new_var, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            cdolist_list_var2 = cdolist_list_var2.rest();
            cons2 = cdolist_list_var2.first();
        }
        v_bindings = new_bindings;
        SubLObject cdolist_list_var3 = contextualized_dnf_clauses;
        SubLObject contextualized_dnf_clause = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        contextualized_dnf_clause = cdolist_list_var3.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var3) {
            final SubLObject _prev_bind_0 = sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_sort_bound_variables$.currentBinding(thread);
            final SubLObject _prev_bind_2 = sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_outer_scope_defined_variables$.currentBinding(thread);
            try {
                sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_sort_bound_variables$.bind(Mapping.mapcar((SubLObject)sksi_conjunctive_removal_module_utilities.$sym110$CDR, list_utilities.find_all_if((SubLObject)sksi_conjunctive_removal_module_utilities.$sym111$EL_VARIABLE_P, v_bindings, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym112$CAR)), thread);
                sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_outer_scope_defined_variables$.bind(Mapping.mapcar((SubLObject)sksi_conjunctive_removal_module_utilities.$sym110$CDR, list_utilities.find_all_if_not((SubLObject)sksi_conjunctive_removal_module_utilities.$sym111$EL_VARIABLE_P, v_bindings, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym112$CAR)), thread);
                SubLObject cdolist_list_var_$77;
                final SubLObject csqls = cdolist_list_var_$77 = sksi_conjunctive_removal_modules_expand.removal_sksi_conjunction_pos_lits_output_generate(contextualized_dnf_clause, sks_profile, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
                SubLObject csql_and_various_maps = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                csql_and_various_maps = cdolist_list_var_$77.first();
                while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var_$77) {
                    SubLObject current3;
                    final SubLObject datum3 = current3 = csql_and_various_maps;
                    SubLObject sub_csql = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                    SubLObject csql_var_decoding_map = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                    SubLObject csql_var_pfi_encodings = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                    SubLObject csql_var_lit_pfis = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                    SubLObject csql_lit_pfi_selects = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                    SubLObject csql_var_lfi_map = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current3, datum3, (SubLObject)sksi_conjunctive_removal_module_utilities.$list113);
                    sub_csql = current3.first();
                    current3 = current3.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current3, datum3, (SubLObject)sksi_conjunctive_removal_module_utilities.$list113);
                    csql_var_decoding_map = current3.first();
                    current3 = current3.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current3, datum3, (SubLObject)sksi_conjunctive_removal_module_utilities.$list113);
                    csql_var_pfi_encodings = current3.first();
                    current3 = current3.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current3, datum3, (SubLObject)sksi_conjunctive_removal_module_utilities.$list113);
                    csql_var_lit_pfis = current3.first();
                    current3 = current3.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current3, datum3, (SubLObject)sksi_conjunctive_removal_module_utilities.$list113);
                    csql_lit_pfi_selects = current3.first();
                    current3 = current3.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current3, datum3, (SubLObject)sksi_conjunctive_removal_module_utilities.$list113);
                    csql_var_lfi_map = current3.first();
                    current3 = current3.rest();
                    if (sksi_conjunctive_removal_module_utilities.NIL == current3) {
                        SubLObject current_$79;
                        final SubLObject datum_$78 = current_$79 = sub_csql;
                        SubLObject select_keyword = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                        SubLObject select_fields = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                        SubLObject from_clause = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current_$79, datum_$78, (SubLObject)sksi_conjunctive_removal_module_utilities.$list114);
                        select_keyword = current_$79.first();
                        current_$79 = current_$79.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$79, datum_$78, (SubLObject)sksi_conjunctive_removal_module_utilities.$list114);
                        select_fields = current_$79.first();
                        current_$79 = current_$79.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$79, datum_$78, (SubLObject)sksi_conjunctive_removal_module_utilities.$list114);
                        from_clause = current_$79.first();
                        current_$79 = current_$79.rest();
                        final SubLObject where_clause = (SubLObject)(current_$79.isCons() ? current_$79.first() : sksi_conjunctive_removal_module_utilities.NIL);
                        cdestructuring_bind.destructuring_bind_must_listp(current_$79, datum_$78, (SubLObject)sksi_conjunctive_removal_module_utilities.$list114);
                        current_$79 = current_$79.rest();
                        if (sksi_conjunctive_removal_module_utilities.NIL == current_$79) {
                            final SubLObject sub_select = select_fields;
                            final SubLObject sub_from = conses_high.second(from_clause);
                            SubLObject sub_where = conses_high.second(where_clause);
                            SubLObject cdolist_list_var_$78 = v_bindings;
                            SubLObject binding = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                            binding = cdolist_list_var_$78.first();
                            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var_$78) {
                                final SubLObject super_var = binding.first();
                                final SubLObject sub_var = binding.rest();
                                SubLObject super_pfi_select = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                SubLObject sub_pfi_select = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                if (sksi_conjunctive_removal_module_utilities.NIL != cycl_variables.hl_varP(sub_var)) {
                                    final SubLObject super_var_lfis = dictionary.dictionary_lookup(var_lfi_map, super_var, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                    final SubLObject sub_var_lfis = dictionary.dictionary_lookup(csql_var_lfi_map, sub_var, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                    if (sksi_conjunctive_removal_module_utilities.NIL != list_utilities.intersectP(super_var_lfis, sub_var_lfis, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym16$LOGICAL_FIELD_INDEXICALS_JOINABLE_, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED)) {
                                        final SubLObject super_var_lit_pfis = dictionary.dictionary_lookup(var_lit_pfis, super_var, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                        SubLObject iteration_state;
                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(super_var_lit_pfis)); sksi_conjunctive_removal_module_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                            thread.resetMultipleValues();
                                            final SubLObject lit = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                            final SubLObject pfis = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            final SubLObject super_lit_pfi_selects = dictionary.dictionary_lookup(lit_pfi_selects, lit, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                            SubLObject cdolist_list_var_$79 = pfis;
                                            SubLObject pfi = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                            pfi = cdolist_list_var_$79.first();
                                            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var_$79) {
                                                final SubLObject pfi_selects = dictionary.dictionary_lookup(super_lit_pfi_selects, pfi, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                                super_pfi_select = pfi_selects.first();
                                                cdolist_list_var_$79 = cdolist_list_var_$79.rest();
                                                pfi = cdolist_list_var_$79.first();
                                            }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                        final SubLObject sub_var_lit_pfis = dictionary.dictionary_lookup(csql_var_lit_pfis, sub_var, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(sub_var_lit_pfis)); sksi_conjunctive_removal_module_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                            thread.resetMultipleValues();
                                            final SubLObject lit = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                            final SubLObject pfis = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            final SubLObject sub_lit_pfi_selects = dictionary.dictionary_lookup(csql_lit_pfi_selects, lit, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                            SubLObject cdolist_list_var_$80 = pfis;
                                            SubLObject pfi = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                            pfi = cdolist_list_var_$80.first();
                                            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var_$80) {
                                                SubLObject cdolist_list_var_$81;
                                                final SubLObject pfi_selects = cdolist_list_var_$81 = dictionary.dictionary_lookup(sub_lit_pfi_selects, pfi, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                                                SubLObject pfi_select = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                                                pfi_select = cdolist_list_var_$81.first();
                                                while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var_$81) {
                                                    if (!pfi_select.equal(super_pfi_select) && sksi_conjunctive_removal_module_utilities.NIL != list_utilities.tree_find(sksi_csql_utilities.csql_field_table_name(pfi_select), sub_where, (SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED)) {
                                                        sub_pfi_select = pfi_select;
                                                    }
                                                    cdolist_list_var_$81 = cdolist_list_var_$81.rest();
                                                    pfi_select = cdolist_list_var_$81.first();
                                                }
                                                cdolist_list_var_$80 = cdolist_list_var_$80.rest();
                                                pfi = cdolist_list_var_$80.first();
                                            }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                        if (sksi_conjunctive_removal_module_utilities.NIL != super_pfi_select && sksi_conjunctive_removal_module_utilities.NIL != sub_pfi_select) {
                                            sub_where = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(sksi_conjunctive_removal_module_utilities.$const20$CSQLEquals, sub_pfi_select, super_pfi_select), sub_where);
                                        }
                                    }
                                }
                                cdolist_list_var_$78 = cdolist_list_var_$78.rest();
                                binding = cdolist_list_var_$78.first();
                            }
                            select = ConsesLow.append(select, sub_select);
                            where = ConsesLow.append(where, sub_where);
                            from = ConsesLow.append(from, sub_from);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum_$78, (SubLObject)sksi_conjunctive_removal_module_utilities.$list114);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum3, (SubLObject)sksi_conjunctive_removal_module_utilities.$list113);
                    }
                    cdolist_list_var_$77 = cdolist_list_var_$77.rest();
                    csql_and_various_maps = cdolist_list_var_$77.first();
                }
            }
            finally {
                sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_outer_scope_defined_variables$.rebind(_prev_bind_2, thread);
                sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_sort_bound_variables$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var3 = cdolist_list_var3.rest();
            contextualized_dnf_clause = cdolist_list_var3.first();
        }
        select = list_utilities.delete_duplicates_from_end(select, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (sksi_conjunctive_removal_module_utilities.NIL != from && sksi_conjunctive_removal_module_utilities.NIL != where) {
            final SubLObject select_csql = (sksi_conjunctive_removal_module_utilities.NIL != kb_utilities.kbeq(sksi_query_datastructures.sks_profile_type(sks_profile), sksi_conjunctive_removal_module_utilities.$const44$RDFTripleStore_Physical)) ? sksi_csql_utilities.make_csql_query(select, from, where, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED) : sksi_csql_utilities.make_csql_query((SubLObject)sksi_conjunctive_removal_module_utilities.ONE_INTEGER, from, where, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            final SubLObject exists_csql = sksi_csql_utilities.make_csql_expression(sksi_conjunctive_removal_module_utilities.$const115$CSQLExists, (SubLObject)ConsesLow.list(select_csql));
            final SubLObject not_exists_csql = sksi_csql_utilities.csql_negate_expression(exists_csql);
            return Values.values(not_exists_csql, from);
        }
        return Values.values((SubLObject)sksi_conjunctive_removal_module_utilities.NIL, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 117495L)
    public static SubLObject sksi_crm_get_where_clauses_from_sksi_atomic_unknown_sentence(final SubLObject asents, final SubLObject meaning_sentence_gafs, final SubLObject unknown_sentence, final SubLObject asent_mt, final SubLObject sks, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject tac, final SubLObject var_pfi_encodings, final SubLObject var_lit_pfis, final SubLObject lit_pfi_selects, final SubLObject var_lfi_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ms_gafs = get_all_meaning_sentence_gafs_for_asent(unknown_sentence, logical_schemata, sks, (SubLObject)sksi_conjunctive_removal_module_utilities.T, asent_mt, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        SubLObject csql_conjuncts = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject from = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject cdolist_list_var = ms_gafs;
        SubLObject ms_gaf = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        ms_gaf = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject meaning_sentence_logical_schemata = sksi_meaning_sentence_utilities.get_relevant_logical_schemata_and_meaning_sentence_from_gaf(ms_gaf, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            final SubLObject meaning_sentence = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject meaning_sentence_sks = sksi_kb_accessors.logical_schemata_sources(meaning_sentence_logical_schemata).first();
            thread.resetMultipleValues();
            SubLObject sub_where = sksi_query_utilities.get_where_expression_from_meaning_sentence(unknown_sentence, meaning_sentence, meaning_sentence_logical_schemata, sksi_kb_accessors.logical_schemata_physical_schemata(meaning_sentence_logical_schemata), meaning_sentence_sks, unknown_sentence, tac, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, var_pfi_encodings, var_lit_pfis, lit_pfi_selects, var_lfi_map, asents, meaning_sentence_gafs, physical_schemata);
            final SubLObject sub_from = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sksi_conjunctive_removal_module_utilities.NIL != sub_from && sksi_conjunctive_removal_module_utilities.NIL == sksi_csql_utilities.invalid_csql_expressionP(sub_where)) {
                if (sksi_conjunctive_removal_module_utilities.NIL == sksi_csql_utilities.csql_conjunction_p(sub_where)) {
                    sub_where = sksi_csql_utilities.make_csql_implicit_conjunction(sub_where);
                }
                from = ConsesLow.append(from, sub_from);
                final SubLObject select_csql = sksi_csql_utilities.make_csql_query((SubLObject)sksi_conjunctive_removal_module_utilities.ONE_INTEGER, sub_from, sub_where, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                final SubLObject exists_csql = sksi_csql_utilities.make_csql_expression(sksi_conjunctive_removal_module_utilities.$const115$CSQLExists, (SubLObject)ConsesLow.list(select_csql));
                final SubLObject not_exists_csql = sksi_csql_utilities.csql_negate_expression(exists_csql);
                csql_conjuncts = (SubLObject)ConsesLow.cons(not_exists_csql, csql_conjuncts);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ms_gaf = cdolist_list_var.first();
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != csql_conjuncts) {
            return Values.values(sksi_csql_utilities.csql_conjoin_expressions(csql_conjuncts), from);
        }
        return Values.values((SubLObject)sksi_conjunctive_removal_module_utilities.NIL, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 119436L)
    public static SubLObject sksi_crm_get_where_clauses_from_comparisons(final SubLObject comparison_asents, final SubLObject eval_var_selects_mapping, final SubLObject var_eval_expression_mapping, final SubLObject vars, final SubLObject var_pfi_encodings, final SubLObject var_lit_pfis, final SubLObject lit_pfi_selects, final SubLObject sks_profile, final SubLObject tac) {
        final SubLObject content_mt = sksi_query_datastructures.sks_profile_content_mt(sks_profile);
        final SubLObject sks = sksi_query_datastructures.sks_profile_sks(sks_profile);
        SubLObject where = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject cdolist_list_var = comparison_asents;
        SubLObject comparison_asent = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        comparison_asent = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
            final SubLObject comparison_asent_where = sksi_crm_get_where_clauses_from_comparison_asent(comparison_asent, eval_var_selects_mapping, var_eval_expression_mapping, vars, var_pfi_encodings, var_lit_pfis, lit_pfi_selects, content_mt, sks);
            if (sksi_conjunctive_removal_module_utilities.NIL != kb_utilities.kbeq(sksi_query_datastructures.sks_profile_type(sks_profile), sksi_conjunctive_removal_module_utilities.$const44$RDFTripleStore_Physical) && sksi_conjunctive_removal_module_utilities.NIL != list_utilities.any_in_list((SubLObject)sksi_conjunctive_removal_module_utilities.$sym116$CSQL_FALSE_P, comparison_asent_where, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED)) {
                Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw52$SKSI_COMPARISON_ASENT_INAPPLICABLE, comparison_asent);
            }
            where = ConsesLow.nconc(where, comparison_asent_where);
            cdolist_list_var = cdolist_list_var.rest();
            comparison_asent = cdolist_list_var.first();
        }
        where = remake_where_clause(where, tac, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        return sksi_csql_utilities.csql_conjoin_expressions(where);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 120455L)
    public static SubLObject sksi_crm_get_where_clauses_from_comparison_asent(final SubLObject comparison_asent, final SubLObject eval_var_selects_mapping, final SubLObject var_eval_expression_mapping, final SubLObject vars, final SubLObject var_pfi_encodings, final SubLObject var_lit_pfis, final SubLObject lit_pfi_selects, final SubLObject content_mt, final SubLObject sks) {
        final SubLObject asent_asent = inference_datastructures_problem_query.contextualized_asent_asent(comparison_asent);
        final SubLObject asent_pred = el_utilities.literal_predicate(asent_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        final SubLObject asent_args = cycl_utilities.formula_args(asent_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        final SubLObject left = asent_args.first();
        final SubLObject right = conses_high.second(asent_args);
        final SubLObject csql_operator = sksi_kb_accessors.cycl_operator_to_csql_operator(asent_pred);
        SubLObject where = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL != variables.variable_p(left)) {
            final SubLObject left_eval_expression = dictionary.dictionary_lookup(var_eval_expression_mapping, left, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            if (sksi_conjunctive_removal_module_utilities.NIL != left_eval_expression) {
                final SubLObject left_csql = dictionary.dictionary_lookup(eval_var_selects_mapping, left, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                if (sksi_conjunctive_removal_module_utilities.NIL != variables.variable_p(right)) {
                    final SubLObject right_eval_expression = dictionary.dictionary_lookup(var_eval_expression_mapping, right, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                    if (sksi_conjunctive_removal_module_utilities.NIL != right_eval_expression) {
                        final SubLObject right_csql = dictionary.dictionary_lookup(eval_var_selects_mapping, right, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                        where = (SubLObject)ConsesLow.list(sksi_csql_utilities.make_csql_expression(csql_operator, (SubLObject)ConsesLow.list(left_csql, right_csql)));
                    }
                    else {
                        if (sksi_conjunctive_removal_module_utilities.NIL == list_utilities.member_eqP(right, vars)) {
                            Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw52$SKSI_COMPARISON_ASENT_INAPPLICABLE, comparison_asent);
                        }
                        final SubLObject right_lit_pfis = dictionary.dictionary_lookup(var_lit_pfis, right, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                        final SubLObject right_pfi_encodings = dictionary.dictionary_lookup(var_pfi_encodings, right, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                        where = sksi_crm_get_where_clauses_from_comparison_asent_single_var(asent_pred, csql_operator, (SubLObject)sksi_conjunctive_removal_module_utilities.ONE_INTEGER, left_csql, right_lit_pfis, right_pfi_encodings, lit_pfi_selects, sks, content_mt, (SubLObject)sksi_conjunctive_removal_module_utilities.T);
                    }
                }
                else {
                    where = (SubLObject)ConsesLow.list(sksi_csql_utilities.make_csql_expression(csql_operator, (SubLObject)ConsesLow.list(left_csql, right)));
                }
            }
            else {
                if (sksi_conjunctive_removal_module_utilities.NIL == list_utilities.member_eqP(left, vars)) {
                    Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw52$SKSI_COMPARISON_ASENT_INAPPLICABLE, comparison_asent);
                }
                final SubLObject left_lit_pfis = dictionary.dictionary_lookup(var_lit_pfis, left, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                final SubLObject left_pfi_encodings = dictionary.dictionary_lookup(var_pfi_encodings, left, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                if (sksi_conjunctive_removal_module_utilities.NIL != variables.variable_p(right)) {
                    final SubLObject right_eval_expression2 = dictionary.dictionary_lookup(var_eval_expression_mapping, right, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                    if (sksi_conjunctive_removal_module_utilities.NIL != right_eval_expression2) {
                        final SubLObject right_csql2 = dictionary.dictionary_lookup(eval_var_selects_mapping, right, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                        where = sksi_crm_get_where_clauses_from_comparison_asent_single_var(asent_pred, csql_operator, (SubLObject)sksi_conjunctive_removal_module_utilities.TWO_INTEGER, right_csql2, left_lit_pfis, left_pfi_encodings, lit_pfi_selects, sks, content_mt, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
                    }
                    else {
                        if (sksi_conjunctive_removal_module_utilities.NIL == list_utilities.member_eqP(right, vars)) {
                            Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw52$SKSI_COMPARISON_ASENT_INAPPLICABLE, comparison_asent);
                        }
                        final SubLObject right_lit_pfis2 = dictionary.dictionary_lookup(var_lit_pfis, right, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                        where = sksi_crm_get_where_clauses_from_comparison_asent_double_vars(comparison_asent, asent_pred, csql_operator, left_lit_pfis, right_lit_pfis2, lit_pfi_selects);
                    }
                }
                else {
                    where = sksi_crm_get_where_clauses_from_comparison_asent_single_var(asent_pred, csql_operator, (SubLObject)sksi_conjunctive_removal_module_utilities.TWO_INTEGER, right, left_lit_pfis, left_pfi_encodings, lit_pfi_selects, sks, content_mt, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
                }
            }
        }
        else if (sksi_conjunctive_removal_module_utilities.NIL != variables.variable_p(right)) {
            final SubLObject eval_expression = dictionary.dictionary_lookup(var_eval_expression_mapping, right, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            if (sksi_conjunctive_removal_module_utilities.NIL != eval_expression) {
                final SubLObject right_csql3 = dictionary.dictionary_lookup(eval_var_selects_mapping, right, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                where = (SubLObject)ConsesLow.list(sksi_csql_utilities.make_csql_expression(csql_operator, (SubLObject)ConsesLow.list(left, right_csql3)));
            }
            else {
                if (sksi_conjunctive_removal_module_utilities.NIL == list_utilities.member_eqP(right, vars)) {
                    Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw52$SKSI_COMPARISON_ASENT_INAPPLICABLE, comparison_asent);
                }
                final SubLObject right_lit_pfis3 = dictionary.dictionary_lookup(var_lit_pfis, right, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                final SubLObject right_pfi_encodings2 = dictionary.dictionary_lookup(var_pfi_encodings, right, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                where = sksi_crm_get_where_clauses_from_comparison_asent_single_var(asent_pred, csql_operator, (SubLObject)sksi_conjunctive_removal_module_utilities.ONE_INTEGER, left, right_lit_pfis3, right_pfi_encodings2, lit_pfi_selects, sks, content_mt, (SubLObject)sksi_conjunctive_removal_module_utilities.T);
            }
        }
        else {
            Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw54$SKSI_COMPARISON_ASENT_NO_VARIABLE_FOUND, comparison_asent);
        }
        return where;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 124342L)
    public static SubLObject sksi_crm_get_where_clauses_from_comparison_asent_single_var(final SubLObject asent_pred, final SubLObject csql_operator, final SubLObject argnum, final SubLObject value, final SubLObject var_lit_pfis, final SubLObject var_pfi_encodings, final SubLObject lit_pfi_selects, final SubLObject sks, final SubLObject content_mt, SubLObject reverse_argsP) {
        if (reverse_argsP == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            reverse_argsP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject where = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL != var_lit_pfis) {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(var_lit_pfis)); sksi_conjunctive_removal_module_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject var_lit = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject var_pfis = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (sksi_conjunctive_removal_module_utilities.NIL != sksi_query_utilities.comparison_operator_forbidden_for_some_physical_field_indexicalP(asent_pred, var_pfis)) {
                    Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw53$SKSI_COMPARISON_OPERATOR_FORBIDDEN, asent_pred);
                }
                final SubLObject pfi_selects = dictionary.dictionary_lookup(lit_pfi_selects, var_lit, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                final SubLObject expression = sksi_crm_apply_csql_operator_to_pfi_list_value_pair(asent_pred, csql_operator, argnum, var_pfis, value, var_pfi_encodings, pfi_selects, sks, content_mt, reverse_argsP);
                where = (SubLObject)ConsesLow.cons(expression, where);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return where;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 125095L)
    public static SubLObject sksi_crm_get_where_clauses_from_comparison_asent_double_vars(final SubLObject comparison_asent, final SubLObject asent_pred, final SubLObject csql_operator, final SubLObject left_lit_pfis, final SubLObject right_lit_pfis, final SubLObject lit_pfi_selects) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject where = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL != left_lit_pfis && sksi_conjunctive_removal_module_utilities.NIL != right_lit_pfis) {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(left_lit_pfis)); sksi_conjunctive_removal_module_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject left_lit = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject left_pfis = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject iteration_state_$84;
                for (iteration_state_$84 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(right_lit_pfis)); sksi_conjunctive_removal_module_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$84); iteration_state_$84 = dictionary_contents.do_dictionary_contents_next(iteration_state_$84)) {
                    thread.resetMultipleValues();
                    final SubLObject right_lit = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$84);
                    final SubLObject right_pfis = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (sksi_conjunctive_removal_module_utilities.NIL == list_utilities.same_length_p(left_pfis, right_pfis)) {
                        Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw52$SKSI_COMPARISON_ASENT_INAPPLICABLE, comparison_asent);
                    }
                    if (sksi_conjunctive_removal_module_utilities.NIL != sksi_query_utilities.comparison_operator_forbidden_for_some_physical_field_indexicalP(asent_pred, left_pfis) || sksi_conjunctive_removal_module_utilities.NIL != sksi_query_utilities.comparison_operator_forbidden_for_some_physical_field_indexicalP(asent_pred, right_pfis)) {
                        Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw53$SKSI_COMPARISON_OPERATOR_FORBIDDEN, asent_pred);
                    }
                    final SubLObject expression = sksi_crm_apply_csql_operator_to_pfi_list_pair(csql_operator, left_lit, left_pfis, right_lit, right_pfis, lit_pfi_selects);
                    where = (SubLObject)ConsesLow.cons(expression, where);
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$84);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return where;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 126020L)
    public static SubLObject sksi_crm_apply_csql_operator_to_pfi_list_pair(final SubLObject operator, final SubLObject lit0, final SubLObject pfi_list0, final SubLObject lit1, final SubLObject pfi_list1, final SubLObject lit_pfi_selects) {
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_csql_utilities.csql_where_clause_reflexive_comparison_operator_p(operator) && lit0.equal(lit1) && pfi_list0.equal(pfi_list1)) {
            return sksi_csql_utilities.$csql_true$.getGlobalValue();
        }
        if (sksi_conjunctive_removal_module_utilities.NIL != sksi_csql_utilities.csql_where_clause_anti_reflexive_comparison_operator_p(operator) && lit0.equal(lit1) && pfi_list0.equal(pfi_list1)) {
            return sksi_csql_utilities.$csql_false$.getGlobalValue();
        }
        if (sksi_conjunctive_removal_module_utilities.NIL == list_utilities.same_length_p(pfi_list0, pfi_list1)) {
            Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw55$SKSI_LIST_LENGTH_MISMATCH, (SubLObject)ConsesLow.list(pfi_list0, pfi_list1));
        }
        final SubLObject pfi_selects0 = dictionary.dictionary_lookup(lit_pfi_selects, lit0, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        final SubLObject pfi_selects2 = dictionary.dictionary_lookup(lit_pfi_selects, lit1, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        SubLObject multi_alist = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject pfi_expressions = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject pfi0 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject pfi0_$85 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject pfi2 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject pfi1_$86 = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        pfi0 = pfi_list0;
        pfi0_$85 = pfi0.first();
        pfi2 = pfi_list1;
        pfi1_$86 = pfi2.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != pfi2 || sksi_conjunctive_removal_module_utilities.NIL != pfi0) {
            final SubLObject selects0 = dictionary.dictionary_lookup(pfi_selects0, pfi0_$85, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            final SubLObject selects2 = dictionary.dictionary_lookup(pfi_selects2, pfi1_$86, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            final SubLObject sym0 = Symbols.gensym((SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            final SubLObject sym2 = Symbols.gensym((SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            if (sksi_conjunctive_removal_module_utilities.NIL != selects0 && sksi_conjunctive_removal_module_utilities.NIL != selects2) {
                multi_alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(sym0, selects0), multi_alist);
                multi_alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(sym2, selects2), multi_alist);
                pfi_expressions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(operator, sym0, sym2), pfi_expressions);
            }
            pfi0 = pfi0.rest();
            pfi0_$85 = pfi0.first();
            pfi2 = pfi2.rest();
            pfi1_$86 = pfi2.first();
        }
        final SubLObject pfi_expression = (sksi_conjunctive_removal_module_utilities.NIL != sksi_csql_utilities.csql_where_clause_negated_comparison_operator_p(operator)) ? sksi_csql_utilities.csql_disjoin_expressions(pfi_expressions) : sksi_csql_utilities.csql_conjoin_expressions(pfi_expressions);
        return sksi_csql_utilities.csql_conjoin_expressions(list_utilities.multi_sublis(multi_alist, pfi_expression, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQ), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 127789L)
    public static SubLObject sksi_crm_csql_operator_argnum_encodings_override_internal(final SubLObject asent_pred, final SubLObject argnum, final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject encodings = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)sksi_conjunctive_removal_module_utilities.$sym118$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(sksi_kb_accessors.sk_source_mapping_mt(sks), thread);
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs(asent_pred, sksi_conjunctive_removal_module_utilities.$const119$fieldEncodingOverrideForCompariso, (SubLObject)sksi_conjunctive_removal_module_utilities.TWO_INTEGER, (SubLObject)sksi_conjunctive_removal_module_utilities.$kw120$TRUE);
            SubLObject field_encoding_assertion = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            field_encoding_assertion = cdolist_list_var.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
                if (argnum.eql(assertions_high.gaf_arg3(field_encoding_assertion))) {
                    encodings = (SubLObject)ConsesLow.cons(assertions_high.gaf_arg4(field_encoding_assertion), encodings);
                }
                cdolist_list_var = cdolist_list_var.rest();
                field_encoding_assertion = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return encodings;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 127789L)
    public static SubLObject sksi_crm_csql_operator_argnum_encodings_override(final SubLObject asent_pred, final SubLObject argnum, final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        if (sksi_conjunctive_removal_module_utilities.NIL == v_memoization_state) {
            return sksi_crm_csql_operator_argnum_encodings_override_internal(asent_pred, argnum, sks);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym117$SKSI_CRM_CSQL_OPERATOR_ARGNUM_ENCODINGS_OVERRIDE, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (sksi_conjunctive_removal_module_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_conjunctive_removal_module_utilities.$sym117$SKSI_CRM_CSQL_OPERATOR_ARGNUM_ENCODINGS_OVERRIDE, (SubLObject)sksi_conjunctive_removal_module_utilities.THREE_INTEGER, (SubLObject)sksi_conjunctive_removal_module_utilities.$int121$200, (SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym117$SKSI_CRM_CSQL_OPERATOR_ARGNUM_ENCODINGS_OVERRIDE, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(asent_pred, argnum, sks);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            collision = cdolist_list_var.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (asent_pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (argnum.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (sksi_conjunctive_removal_module_utilities.NIL != cached_args && sksi_conjunctive_removal_module_utilities.NIL == cached_args.rest() && sks.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_crm_csql_operator_argnum_encodings_override_internal(asent_pred, argnum, sks)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(asent_pred, argnum, sks));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 128370L)
    public static SubLObject sksi_crm_apply_csql_operator_to_pfi_list_value_pair(final SubLObject asent_pred, final SubLObject operator, final SubLObject argnum, final SubLObject pfi_list, final SubLObject value, final SubLObject pfi_encodings, final SubLObject pfi_selects, final SubLObject sks, final SubLObject mt, SubLObject reverseP) {
        if (reverseP == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            reverseP = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        final SubLObject aggregation_fn = (SubLObject)((sksi_conjunctive_removal_module_utilities.NIL != sksi_csql_utilities.csql_where_clause_negated_comparison_operator_p(operator)) ? sksi_conjunctive_removal_module_utilities.$sym122$CSQL_DISJOIN_EXPRESSIONS : sksi_conjunctive_removal_module_utilities.$sym123$CSQL_CONJOIN_EXPRESSIONS);
        SubLObject expressions = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject multi_alist = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject cdolist_list_var = pfi_list;
        SubLObject pfi = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        pfi = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
            final SubLObject selects = dictionary.dictionary_lookup(pfi_selects, pfi, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            SubLObject encodings = dictionary.dictionary_lookup(pfi_encodings, pfi, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            SubLObject pfi_expressions = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            multi_alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(pfi, selects), multi_alist);
            final SubLObject possible_override_encodings = sksi_crm_csql_operator_argnum_encodings_override(asent_pred, argnum, sks);
            if (sksi_conjunctive_removal_module_utilities.NIL != possible_override_encodings) {
                encodings = possible_override_encodings;
            }
            SubLObject cdolist_list_var_$87 = encodings;
            SubLObject encoding = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            encoding = cdolist_list_var_$87.first();
            while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var_$87) {
                final SubLObject lfis = sksi_field_translation_utilities.encoding_logical_field_indexicals(encoding);
                SubLObject alist = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                SubLObject cdolist_list_var_$88 = lfis;
                SubLObject lfi = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                lfi = cdolist_list_var_$88.first();
                while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var_$88) {
                    alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(lfi, value), alist);
                    cdolist_list_var_$88 = cdolist_list_var_$88.rest();
                    lfi = cdolist_list_var_$88.first();
                }
                final SubLObject reformed = (sksi_conjunctive_removal_module_utilities.NIL != sksi_csql_utilities.csql_eval_expression_p(value)) ? conses_high.second(value) : sksi_field_translation_utilities.sksi_apply_encoding_and_reformulate(alist, encoding, sks, mt);
                if (sksi_conjunctive_removal_module_utilities.NIL != sksi_query_utilities.sksi_unreformulatable_p(reformed)) {
                    Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw51$SKSI_UNREFORMULATABLE, value);
                }
                if (sksi_conjunctive_removal_module_utilities.NIL != reverseP) {
                    pfi_expressions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(operator, reformed, pfi), pfi_expressions);
                }
                else {
                    pfi_expressions = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(operator, pfi, reformed), pfi_expressions);
                }
                cdolist_list_var_$87 = cdolist_list_var_$87.rest();
                encoding = cdolist_list_var_$87.first();
            }
            expressions = (SubLObject)ConsesLow.cons(sksi_csql_utilities.csql_conjoin_expressions(pfi_expressions), expressions);
            cdolist_list_var = cdolist_list_var.rest();
            pfi = cdolist_list_var.first();
        }
        return sksi_csql_utilities.csql_conjoin_expressions(list_utilities.multi_sublis(multi_alist, Functions.funcall(aggregation_fn, expressions), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQ), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 130294L)
    public static SubLObject sksi_crm_get_where_clauses_from_decodings(final SubLObject var_lit_decodings, final SubLObject var_lit_pfis, final SubLObject sks_profile, final SubLObject tac) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sks = sksi_query_datastructures.sks_profile_sks(sks_profile);
        SubLObject where = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(var_lit_decodings)); sksi_conjunctive_removal_module_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject lit_decodings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (dictionary.dictionary_length(lit_decodings).numG((SubLObject)sksi_conjunctive_removal_module_utilities.ONE_INTEGER)) {
                final SubLObject lit_pfis = dictionary.dictionary_lookup(var_lit_pfis, var, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                if (sksi_conjunctive_removal_module_utilities.NIL != dictionary.dictionary_p(lit_pfis)) {
                    SubLObject iteration_state_$89;
                    for (iteration_state_$89 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit_pfis)); sksi_conjunctive_removal_module_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$89); iteration_state_$89 = dictionary_contents.do_dictionary_contents_next(iteration_state_$89)) {
                        thread.resetMultipleValues();
                        final SubLObject lit0 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$89);
                        final SubLObject pfis0 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        SubLObject iteration_state_$90;
                        for (iteration_state_$90 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lit_pfis)); sksi_conjunctive_removal_module_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$90); iteration_state_$90 = dictionary_contents.do_dictionary_contents_next(iteration_state_$90)) {
                            thread.resetMultipleValues();
                            final SubLObject lit2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$90);
                            final SubLObject pfis2 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (!lit0.equal(lit2) && sksi_conjunctive_removal_module_utilities.NIL != list_utilities.same_length_p(pfis0, pfis2)) {
                                where = (SubLObject)ConsesLow.cons(apply_csql_operator_to_lit_pfi_list_pair(sksi_conjunctive_removal_module_utilities.$const20$CSQLEquals, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(lit0, pfis0), (SubLObject)ConsesLow.list(lit2, pfis2)), sks, tac), where);
                            }
                        }
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$90);
                    }
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$89);
                }
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return sksi_csql_utilities.csql_conjoin_expressions(where);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 131069L)
    public static SubLObject remake_where_clause(final SubLObject where, final SubLObject tac, SubLObject lit) {
        if (lit == sksi_conjunctive_removal_module_utilities.UNPROVIDED) {
            lit = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        }
        return (sksi_conjunctive_removal_module_utilities.NIL != lit) ? remake_where_clause_single(where, lit, tac) : remake_where_clause_multiple(where, tac);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 131259L)
    public static SubLObject remake_where_clause_single(final SubLObject where, final SubLObject lit, final SubLObject tac) {
        final SubLObject field_expressions = list_utilities.tree_gather(where, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym124$CSQL_FIELD_EXPRESSION_P, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        SubLObject alist = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject cdolist_list_var = field_expressions;
        SubLObject field_expression = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        field_expression = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = field_expression;
            SubLObject keyword = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject field = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject table_name = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list125);
            keyword = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list125);
            field = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list125);
            table_name = current.first();
            current = current.rest();
            final SubLObject namespace = (SubLObject)(current.isCons() ? current.first() : sksi_conjunctive_removal_module_utilities.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list125);
            current = current.rest();
            if (sksi_conjunctive_removal_module_utilities.NIL == current) {
                must_eq(keyword, (SubLObject)sksi_conjunctive_removal_module_utilities.$kw73$FIELD);
                final SubLObject alias = sksi_query_datastructures.tac_alias_table(tac, lit, table_name, namespace, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(field_expression, sksi_csql_utilities.construct_csql_field_expression(field, alias, namespace)), alist);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list125);
            }
            cdolist_list_var = cdolist_list_var.rest();
            field_expression = cdolist_list_var.first();
        }
        final SubLObject new_where = conses_high.sublis(alist, where, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        return sksi_csql_utilities.csql_conjoin_expressions(new_where);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 131867L)
    public static SubLObject remake_where_clause_multiple(final SubLObject where, final SubLObject tac) {
        final SubLObject field_expressions = list_utilities.tree_gather(where, (SubLObject)sksi_conjunctive_removal_module_utilities.$sym124$CSQL_FIELD_EXPRESSION_P, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        SubLObject multi_alist = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject cdolist_list_var = field_expressions;
        SubLObject field_expression = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        field_expression = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = field_expression;
            SubLObject keyword = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject field = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject table_name = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list125);
            keyword = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list125);
            field = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list125);
            table_name = current.first();
            current = current.rest();
            final SubLObject namespace = (SubLObject)(current.isCons() ? current.first() : sksi_conjunctive_removal_module_utilities.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list125);
            current = current.rest();
            if (sksi_conjunctive_removal_module_utilities.NIL == current) {
                must_eq(keyword, (SubLObject)sksi_conjunctive_removal_module_utilities.$kw73$FIELD);
                final SubLObject aliases = sksi_query_datastructures.tac_lookup_aliases_for_table(tac, table_name, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
                SubLObject multi_assoc = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                SubLObject cdolist_list_var_$91 = aliases;
                SubLObject alias = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                alias = cdolist_list_var_$91.first();
                while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var_$91) {
                    multi_assoc = (SubLObject)ConsesLow.cons(sksi_csql_utilities.construct_csql_field_expression(field, alias, namespace), multi_assoc);
                    cdolist_list_var_$91 = cdolist_list_var_$91.rest();
                    alias = cdolist_list_var_$91.first();
                }
                if (sksi_conjunctive_removal_module_utilities.NIL != multi_assoc) {
                    multi_alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(field_expression, multi_assoc), multi_alist);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_conjunctive_removal_module_utilities.$list125);
            }
            cdolist_list_var = cdolist_list_var.rest();
            field_expression = cdolist_list_var.first();
        }
        final SubLObject new_where = list_utilities.multi_sublis(multi_alist, where, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        return sksi_csql_utilities.csql_conjoin_expressions(new_where);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 132649L)
    public static SubLObject get_lit_pfi_list_pairs(final SubLObject decoding_lit_pair) {
        SubLObject lit = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject decoding = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(decoding_lit_pair, decoding_lit_pair, (SubLObject)sksi_conjunctive_removal_module_utilities.$list126);
        lit = decoding_lit_pair.first();
        SubLObject current = decoding_lit_pair.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, decoding_lit_pair, (SubLObject)sksi_conjunctive_removal_module_utilities.$list126);
        decoding = current.first();
        current = current.rest();
        if (sksi_conjunctive_removal_module_utilities.NIL == current) {
            final SubLObject pfi_list = sksi_field_translation_utilities.decoding_physical_field_indexicals_ordered(decoding);
            return (SubLObject)ConsesLow.list(lit, pfi_list);
        }
        cdestructuring_bind.cdestructuring_bind_error(decoding_lit_pair, (SubLObject)sksi_conjunctive_removal_module_utilities.$list126);
        return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 132875L)
    public static SubLObject apply_csql_operator_to_lit_pfi_list_pair(final SubLObject operator, final SubLObject lit_pfi_list_pair, final SubLObject sks, final SubLObject tac) {
        SubLObject left_lit_pfi_list = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject right_lit_pfi_list = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(lit_pfi_list_pair, lit_pfi_list_pair, (SubLObject)sksi_conjunctive_removal_module_utilities.$list127);
        left_lit_pfi_list = lit_pfi_list_pair.first();
        SubLObject current = lit_pfi_list_pair.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, lit_pfi_list_pair, (SubLObject)sksi_conjunctive_removal_module_utilities.$list127);
        right_lit_pfi_list = current.first();
        current = current.rest();
        if (sksi_conjunctive_removal_module_utilities.NIL == current) {
            SubLObject current_$93;
            final SubLObject datum_$92 = current_$93 = left_lit_pfi_list;
            SubLObject left_lit = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            SubLObject left_pfi_list = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$93, datum_$92, (SubLObject)sksi_conjunctive_removal_module_utilities.$list128);
            left_lit = current_$93.first();
            current_$93 = current_$93.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$93, datum_$92, (SubLObject)sksi_conjunctive_removal_module_utilities.$list128);
            left_pfi_list = current_$93.first();
            current_$93 = current_$93.rest();
            if (sksi_conjunctive_removal_module_utilities.NIL == current_$93) {
                SubLObject current_$94;
                final SubLObject datum_$93 = current_$94 = right_lit_pfi_list;
                SubLObject right_lit = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                SubLObject right_pfi_list = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$94, datum_$93, (SubLObject)sksi_conjunctive_removal_module_utilities.$list129);
                right_lit = current_$94.first();
                current_$94 = current_$94.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$94, datum_$93, (SubLObject)sksi_conjunctive_removal_module_utilities.$list129);
                right_pfi_list = current_$94.first();
                current_$94 = current_$94.rest();
                if (sksi_conjunctive_removal_module_utilities.NIL == current_$94) {
                    return sksi_query_utilities.apply_csql_operator_to_pfi_list_pair(operator, left_pfi_list, right_pfi_list, sks, left_lit, right_lit, tac);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$93, (SubLObject)sksi_conjunctive_removal_module_utilities.$list129);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$92, (SubLObject)sksi_conjunctive_removal_module_utilities.$list128);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(lit_pfi_list_pair, (SubLObject)sksi_conjunctive_removal_module_utilities.$list127);
        }
        return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 133314L)
    public static SubLObject sksi_crm_get_select_expressions_from_evaluations(final SubLObject comparison_asents, final SubLObject evaluate_asents, final SubLObject vars, final SubLObject var_lit_decodings, final SubLObject var_pfi_encodings, final SubLObject var_lit_pfis, final SubLObject lit_pfi_selects, final SubLObject sks_profile, final SubLObject tac) {
        final SubLObject problem = inference_worker.currently_active_problem();
        final SubLObject store = (SubLObject)((sksi_conjunctive_removal_module_utilities.NIL != problem) ? inference_datastructures_problem.problem_store(problem) : sksi_conjunctive_removal_module_utilities.NIL);
        final SubLObject problem_free_hl_vars = (SubLObject)((sksi_conjunctive_removal_module_utilities.NIL != problem) ? inference_datastructures_problem.problem_free_hl_vars(problem) : sksi_conjunctive_removal_module_utilities.NIL);
        final SubLObject content_mt = sksi_query_datastructures.sks_profile_content_mt(sks_profile);
        final SubLObject sks = sksi_query_datastructures.sks_profile_sks(sks_profile);
        final SubLObject eval_var_selects = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQ), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        final SubLObject var_eval_expressions = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQ), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
        SubLObject selects = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        SubLObject cdolist_list_var = evaluate_asents;
        SubLObject evaluate_asent = (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
        evaluate_asent = cdolist_list_var.first();
        while (sksi_conjunctive_removal_module_utilities.NIL != cdolist_list_var) {
            final SubLObject asent_asent = inference_datastructures_problem_query.contextualized_asent_asent(evaluate_asent);
            final SubLObject asent_args = cycl_utilities.formula_args(asent_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
            final SubLObject asent_var = asent_args.first();
            final SubLObject evaluatable_expression = conses_high.second(asent_args);
            SubLObject csql = sksi_query_utilities.get_csql_expression_for_evaluatable_expression(evaluatable_expression, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, sks, evaluate_asent, tac, var_lit_pfis, var_pfi_encodings, lit_pfi_selects);
            if (sksi_conjunctive_removal_module_utilities.NIL != csql) {
                csql = (SubLObject)ConsesLow.list((SubLObject)sksi_conjunctive_removal_module_utilities.$kw130$EVAL, csql);
                double_dictionary_pushnew(var_lit_decodings, asent_var, asent_asent, (SubLObject)sksi_conjunctive_removal_module_utilities.NIL, Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL), Symbols.symbol_function((SubLObject)sksi_conjunctive_removal_module_utilities.EQUAL));
                dictionary.dictionary_enter(eval_var_selects, asent_var, csql);
                dictionary.dictionary_enter(var_eval_expressions, asent_var, evaluatable_expression);
                if (sksi_conjunctive_removal_module_utilities.NIL != store && sksi_conjunctive_removal_module_utilities.NIL != inference_datastructures_problem_store.problem_store_allows_problem_hl_free_vars_optimizationP(store)) {
                    if (sksi_conjunctive_removal_module_utilities.NIL != cycl_variables.hl_varP(asent_var) && sksi_conjunctive_removal_module_utilities.NIL != list_utilities.member_eqP(asent_var, problem_free_hl_vars)) {
                        selects = (SubLObject)ConsesLow.cons(csql, selects);
                    }
                }
                else {
                    selects = (SubLObject)ConsesLow.cons(csql, selects);
                }
            }
            else {
                Dynamic.sublisp_throw((SubLObject)sksi_conjunctive_removal_module_utilities.$kw56$SKSI_EVALUATE_CSQL_UNPRODUCIBLE, evaluatable_expression);
            }
            cdolist_list_var = cdolist_list_var.rest();
            evaluate_asent = cdolist_list_var.first();
        }
        return Values.values(Sequences.nreverse(selects), eval_var_selects, var_eval_expressions);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 135226L)
    public static SubLObject variable_predicate_litP(final SubLObject lit) {
        return variables.variable_p(el_utilities.literal_predicate(lit, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 135350L)
    public static SubLObject binary_litP(final SubLObject lit) {
        return list_utilities.lengthE(el_utilities.literal_args(lit, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED), (SubLObject)sksi_conjunctive_removal_module_utilities.TWO_INTEGER, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/query-sks/sksi-conjunctive-removal-module-utilities.lisp", position = 135427L)
    public static SubLObject invert_lit(final SubLObject lit) {
        return el_utilities.make_formula(el_utilities.literal_predicate(lit, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED), Sequences.reverse(el_utilities.literal_args(lit, (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED)), (SubLObject)sksi_conjunctive_removal_module_utilities.UNPROVIDED);
    }
    
    public static SubLObject declare_sksi_conjunctive_removal_module_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_disallow_meaning_sentences_for_unbound_predicatesP", "SKSI-DISALLOW-MEANING-SENTENCES-FOR-UNBOUND-PREDICATES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_disallow_meaning_sentences_for_unbound_predicates_for_just_this_sourceP", "SKSI-DISALLOW-MEANING-SENTENCES-FOR-UNBOUND-PREDICATES-FOR-JUST-THIS-SOURCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_all_meaning_sentence_gafs_for_contextualized_dnf_clause", "GET-ALL-MEANING-SENTENCE-GAFS-FOR-CONTEXTUALIZED-DNF-CLAUSE", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_all_meaning_sentence_gafs_for_asent", "GET-ALL-MEANING-SENTENCE-GAFS-FOR-ASENT", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_meaning_sentence_gafs_for_asent", "GET-MEANING-SENTENCE-GAFS-FOR-ASENT", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_meaning_sentence_gafs_for_asent_memoized_internal", "GET-MEANING-SENTENCE-GAFS-FOR-ASENT-MEMOIZED-INTERNAL", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_meaning_sentence_gafs_for_asent_memoized", "GET-MEANING-SENTENCE-GAFS-FOR-ASENT-MEMOIZED", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_meaning_sentence_gafs_for_asent_int", "GET-MEANING-SENTENCE-GAFS-FOR-ASENT-INT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_conditional_meaning_sentence_gafs_for_asent", "GET-CONDITIONAL-MEANING-SENTENCE-GAFS-FOR-ASENT", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_conditional_meaning_sentence_gafs_for_asent_memoized_internal", "GET-CONDITIONAL-MEANING-SENTENCE-GAFS-FOR-ASENT-MEMOIZED-INTERNAL", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_conditional_meaning_sentence_gafs_for_asent_memoized", "GET-CONDITIONAL-MEANING-SENTENCE-GAFS-FOR-ASENT-MEMOIZED", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_conditional_meaning_sentence_gafs_for_asent_int", "GET-CONDITIONAL-MEANING-SENTENCE-GAFS-FOR-ASENT-INT", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "filter_meaning_sentence_gafs_for_asent", "FILTER-MEANING-SENTENCE-GAFS-FOR-ASENT", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "filter_conditional_meaning_sentence_gafs_for_asent", "FILTER-CONDITIONAL-MEANING-SENTENCE-GAFS-FOR-ASENT", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "filter_meaning_sentence_for_asent", "FILTER-MEANING-SENTENCE-FOR-ASENT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_meaning_sentence_gaf_iterators_for_contextualized_dnf_clause", "GET-MEANING-SENTENCE-GAF-ITERATORS-FOR-CONTEXTUALIZED-DNF-CLAUSE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_meaning_sentence_gaf_iterator_for_asent", "GET-MEANING-SENTENCE-GAF-ITERATOR-FOR-ASENT", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "meaning_sentence_gaf_iterator_done", "MEANING-SENTENCE-GAF-ITERATOR-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "meaning_sentence_gaf_iterator_next", "MEANING-SENTENCE-GAF-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "find_first_applicable_meaning_sentence_gaf_for_asent", "FIND-FIRST-APPLICABLE-MEANING-SENTENCE-GAF-FOR-ASENT", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "find_first_applicable_meaning_sentence_gaf_for_asent_memoized_internal", "FIND-FIRST-APPLICABLE-MEANING-SENTENCE-GAF-FOR-ASENT-MEMOIZED-INTERNAL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "find_first_applicable_meaning_sentence_gaf_for_asent_memoized", "FIND-FIRST-APPLICABLE-MEANING-SENTENCE-GAF-FOR-ASENT-MEMOIZED", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "find_first_applicable_meaning_sentence_gaf_for_asent_int", "FIND-FIRST-APPLICABLE-MEANING-SENTENCE-GAF-FOR-ASENT-INT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "genl_pred_meaning_sentenceP", "GENL-PRED-MEANING-SENTENCE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "genl_inverse_meaning_sentenceP", "GENL-INVERSE-MEANING-SENTENCE?", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "genl_pred_meaning_sentence_gafP", "GENL-PRED-MEANING-SENTENCE-GAF?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "genl_pred_consequent_conditional_meaning_sentence_gafP", "GENL-PRED-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAF?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "genl_inverse_meaning_sentence_gafP", "GENL-INVERSE-MEANING-SENTENCE-GAF?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "genl_inverse_consequent_conditional_meaning_sentence_gafP", "GENL-INVERSE-CONSEQUENT-CONDITIONAL-MEANING-SENTENCE-GAF?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_relevant_spec_preds_from_meaning_sentence", "SKSI-RELEVANT-SPEC-PREDS-FROM-MEANING-SENTENCE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_relevant_spec_preds_from_meaning_sentence_pred_internal", "SKSI-RELEVANT-SPEC-PREDS-FROM-MEANING-SENTENCE-PRED-INTERNAL", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_relevant_spec_preds_from_meaning_sentence_pred", "SKSI-RELEVANT-SPEC-PREDS-FROM-MEANING-SENTENCE-PRED", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_relevant_spec_inverses_from_meaning_sentence", "SKSI-RELEVANT-SPEC-INVERSES-FROM-MEANING-SENTENCE", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_relevant_spec_inverses_from_meaning_sentence_pred_internal", "SKSI-RELEVANT-SPEC-INVERSES-FROM-MEANING-SENTENCE-PRED-INTERNAL", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_relevant_spec_inverses_from_meaning_sentence_pred", "SKSI-RELEVANT-SPEC-INVERSES-FROM-MEANING-SENTENCE-PRED", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_joinability_assertedP", "SKSI-JOINABILITY-ASSERTED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_joinable_asentsP", "SKSI-CRM-JOINABLE-ASENTS?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_unjoinable_asents_int", "SKSI-CRM-UNJOINABLE-ASENTS-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_literal_coherent_with_other_literalsP", "SKSI-CRM-LITERAL-COHERENT-WITH-OTHER-LITERALS?", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_literals_incoherent_together", "SKSI-CRM-LITERALS-INCOHERENT-TOGETHER", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "logical_field_indexicals_joinableP_internal", "LOGICAL-FIELD-INDEXICALS-JOINABLE?-INTERNAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "logical_field_indexicals_joinableP", "LOGICAL-FIELD-INDEXICALS-JOINABLE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "logical_field_indexicals_joinable_asserted", "LOGICAL-FIELD-INDEXICALS-JOINABLE-ASSERTED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "logical_field_indexicals_joinable_deduced", "LOGICAL-FIELD-INDEXICALS-JOINABLE-DEDUCED", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_generate_csql_where_lists_for_fixed_physical_indexicals", "SKSI-GENERATE-CSQL-WHERE-LISTS-FOR-FIXED-PHYSICAL-INDEXICALS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_sort_asents_and_meaning_sentence_gafs", "SKSI-SORT-ASENTS-AND-MEANING-SENTENCE-GAFS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_sort_asents", "SKSI-SORT-ASENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_sort_asents_rest", "SKSI-SORT-ASENTS-REST", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_sort_compute_best_initial_asent", "SKSI-SORT-COMPUTE-BEST-INITIAL-ASENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_determine_newly_constrained_vars", "SKSI-DETERMINE-NEWLY-CONSTRAINED-VARS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_sort_asents_bound_var_p", "SKSI-SORT-ASENTS-BOUND-VAR-P", 1, 0, false);
        new $sksi_sort_asents_bound_var_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_sort_asents_unbound_var_p", "SKSI-SORT-ASENTS-UNBOUND-VAR-P", 1, 0, false);
        new $sksi_sort_asents_unbound_var_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_sort_asents_use_cost_path_lookahead_methodP", "SKSI-SORT-ASENTS-USE-COST-PATH-LOOKAHEAD-METHOD?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_sort_select_best_asent", "SKSI-SORT-SELECT-BEST-ASENT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_sort_select_best_asent_and_cost_values", "SKSI-SORT-SELECT-BEST-ASENT-AND-COST-VALUES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_sort_select_best_asent_with_cost_path_lookahead", "SKSI-SORT-SELECT-BEST-ASENT-WITH-COST-PATH-LOOKAHEAD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_sort_asent_estimated_cost_path_transform_asent_elem", "SKSI-SORT-ASENT-ESTIMATED-COST-PATH-TRANSFORM-ASENT-ELEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "asent_and_cost_path_L", "ASENT-AND-COST-PATH-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "cost_path_L", "COST-PATH-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "cost_path_computed_cost", "COST-PATH-COMPUTED-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "cost_path_L_wrt_first_differing_cost", "COST-PATH-<-WRT-FIRST-DIFFERING-COST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_sort_asent_estimated_cost_path_internal", "SKSI-SORT-ASENT-ESTIMATED-COST-PATH-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_sort_asent_estimated_cost_path", "SKSI-SORT-ASENT-ESTIMATED-COST-PATH", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_asent_better_p", "SKSI-ASENT-BETTER-P", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_asent_better_wrt_primary_characterics", "SKSI-ASENT-BETTER-WRT-PRIMARY-CHARACTERICS", 2, 0, false);
        new $sksi_asent_better_wrt_primary_characterics$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_asent_better_wrt_secondary_characterics", "SKSI-ASENT-BETTER-WRT-SECONDARY-CHARACTERICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_asent_better_wrt_unbound_vars", "SKSI-ASENT-BETTER-WRT-UNBOUND-VARS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_asent_unbound_var_count", "SKSI-ASENT-UNBOUND-VAR-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_asent_better_wrt_other_fanout_args", "SKSI-ASENT-BETTER-WRT-OTHER-FANOUT-ARGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_asent_other_fanout_arg_count", "SKSI-ASENT-OTHER-FANOUT-ARG-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_asent_fanout_arg_term_internal", "SKSI-ASENT-FANOUT-ARG-TERM-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_asent_fanout_arg_term", "SKSI-ASENT-FANOUT-ARG-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_asent_better_wrt_total_var_bindings", "SKSI-ASENT-BETTER-WRT-TOTAL-VAR-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_asent_total_var_binding_count", "SKSI-ASENT-TOTAL-VAR-BINDING-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_asent_better_wrt_evaluatable_pred", "SKSI-ASENT-BETTER-WRT-EVALUATABLE-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_evaluatable_predicateP_internal", "SKSI-EVALUATABLE-PREDICATE?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_evaluatable_predicateP", "SKSI-EVALUATABLE-PREDICATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_asent_better_wrt_own_fanout_args", "SKSI-ASENT-BETTER-WRT-OWN-FANOUT-ARGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_asent_fanout_arg_count", "SKSI-ASENT-FANOUT-ARG-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_asent_better_wrt_bound_vars", "SKSI-ASENT-BETTER-WRT-BOUND-VARS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_asent_bound_var_count", "SKSI-ASENT-BOUND-VAR-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_asent_better_wrt_arbitrary", "SKSI-ASENT-BETTER-WRT-ARBITRARY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_generate_csql_for_query", "SKSI-CRM-GENERATE-CSQL-FOR-QUERY", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "possibly_simplify_csql_wrt_field_equivalences", "POSSIBLY-SIMPLIFY-CSQL-WRT-FIELD-EQUIVALENCES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "csql_identify_equivalent_field_constraint", "CSQL-IDENTIFY-EQUIVALENT-FIELD-CONSTRAINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "must_eq", "MUST-EQ", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "must_kbeq", "MUST-KBEQ", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "simplify_csql_wrt_equivalent_field_constraint", "SIMPLIFY-CSQL-WRT-EQUIVALENT-FIELD-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "simplify_var_decoding_map_wrt_equivalent_field_constraint", "SIMPLIFY-VAR-DECODING-MAP-WRT-EQUIVALENT-FIELD-CONSTRAINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "simplify_var_lit_pfis_wrt_equivalent_field_constraint", "SIMPLIFY-VAR-LIT-PFIS-WRT-EQUIVALENT-FIELD-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "remove_namespaces_made_redundant_by_aliases", "REMOVE-NAMESPACES-MADE-REDUNDANT-BY-ALIASES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "gather_csql_aliases", "GATHER-CSQL-ALIASES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "csql_aliased_expression_with_namespaceP", "CSQL-ALIASED-EXPRESSION-WITH-NAMESPACE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "csql_expression_remove_namespace", "CSQL-EXPRESSION-REMOVE-NAMESPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "csql_kill_table_alias_field_p", "CSQL-KILL-TABLE-ALIAS-FIELD-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "csql_transform_table_alias_field", "CSQL-TRANSFORM-TABLE-ALIAS-FIELD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "csql_field_subst_wrt_table_alias", "CSQL-FIELD-SUBST-WRT-TABLE-ALIAS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "csql_result_set_index_to_renumber_p", "CSQL-RESULT-SET-INDEX-TO-RENUMBER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "csql_renumber_result_set_index", "CSQL-RENUMBER-RESULT-SET-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "csql_decoding_subst_wrt_rs_index", "CSQL-DECODING-SUBST-WRT-RS-INDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "make_sparql_csql_query_and_decoding_map", "MAKE-SPARQL-CSQL-QUERY-AND-DECODING-MAP", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_sparql_csql_compute_decoding_map", "SKSI-SPARQL-CSQL-COMPUTE-DECODING-MAP", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_sparql_compute_result_set_index_map", "SKSI-SPARQL-COMPUTE-RESULT-SET-INDEX-MAP", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_generate_csql_for_asent", "SKSI-CRM-GENERATE-CSQL-FOR-ASENT", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_generate_csql_for_arg", "SKSI-CRM-GENERATE-CSQL-FOR-ARG", 12, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "double_dictionary_pushnew", "DOUBLE-DICTIONARY-PUSHNEW", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "double_dictionary_enter", "DOUBLE-DICTIONARY-ENTER", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_generate_csql_for_variable_arg", "SKSI-CRM-GENERATE-CSQL-FOR-VARIABLE-ARG", 11, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_generate_csql_for_other_arg", "SKSI-CRM-GENERATE-CSQL-FOR-OTHER-ARG", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_decoding_field_expressions_for_logical_field_indexical", "GET-DECODING-FIELD-EXPRESSIONS-FOR-LOGICAL-FIELD-INDEXICAL", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_decoding_field_expressions_for_logical_field", "GET-DECODING-FIELD-EXPRESSIONS-FOR-LOGICAL-FIELD", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_encoding_field_expressions_for_logical_field_indexical", "GET-ENCODING-FIELD-EXPRESSIONS-FOR-LOGICAL-FIELD-INDEXICAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_encoding_field_expressions_for_logical_field", "GET-ENCODING-FIELD-EXPRESSIONS-FOR-LOGICAL-FIELD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_field_expressions_for_physical_field", "GET-FIELD-EXPRESSIONS-FOR-PHYSICAL-FIELD", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_decodings_for_logical_field_indexical_internal", "GET-DECODINGS-FOR-LOGICAL-FIELD-INDEXICAL-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_decodings_for_logical_field_indexical", "GET-DECODINGS-FOR-LOGICAL-FIELD-INDEXICAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_pfi_encoding_pairs_for_logical_field_indexical_internal", "GET-PFI-ENCODING-PAIRS-FOR-LOGICAL-FIELD-INDEXICAL-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_pfi_encoding_pairs_for_logical_field_indexical", "GET-PFI-ENCODING-PAIRS-FOR-LOGICAL-FIELD-INDEXICAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_primary_keys_for_logical_field_indexical_internal", "GET-PRIMARY-KEYS-FOR-LOGICAL-FIELD-INDEXICAL-INTERNAL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_primary_keys_for_logical_field_indexical", "GET-PRIMARY-KEYS-FOR-LOGICAL-FIELD-INDEXICAL", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_primary_keys_from_decodings_internal", "GET-PRIMARY-KEYS-FROM-DECODINGS-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_primary_keys_from_decodings", "GET-PRIMARY-KEYS-FROM-DECODINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "primary_key_for_some_physical_schemaP", "PRIMARY-KEY-FOR-SOME-PHYSICAL-SCHEMA?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_required_fields_have_values_in_where_clauseP", "SKSI-CRM-REQUIRED-FIELDS-HAVE-VALUES-IN-WHERE-CLAUSE?", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_relevant_table_present_in_where_clauseP", "SKSI-CRM-RELEVANT-TABLE-PRESENT-IN-WHERE-CLAUSE?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "where_expression_contains_value_for_field_expressionP", "WHERE-EXPRESSION-CONTAINS-VALUE-FOR-FIELD-EXPRESSION?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_get_where_clauses_from_conditional_meaning_sentence_gaf", "SKSI-CRM-GET-WHERE-CLAUSES-FROM-CONDITIONAL-MEANING-SENTENCE-GAF", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_get_where_clauses_from_sksi_unknown_sentence_asents", "SKSI-CRM-GET-WHERE-CLAUSES-FROM-SKSI-UNKNOWN-SENTENCE-ASENTS", 13, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_get_where_clauses_from_sksi_unknown_sentence_asent", "SKSI-CRM-GET-WHERE-CLAUSES-FROM-SKSI-UNKNOWN-SENTENCE-ASENT", 12, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_get_where_clauses_from_sksi_unknown_sentence_asent_recursive", "SKSI-CRM-GET-WHERE-CLAUSES-FROM-SKSI-UNKNOWN-SENTENCE-ASENT-RECURSIVE", 13, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_get_where_clauses_from_sksi_conjunctive_unknown_sentence", "SKSI-CRM-GET-WHERE-CLAUSES-FROM-SKSI-CONJUNCTIVE-UNKNOWN-SENTENCE", 13, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_get_where_clauses_from_sksi_atomic_unknown_sentence", "SKSI-CRM-GET-WHERE-CLAUSES-FROM-SKSI-ATOMIC-UNKNOWN-SENTENCE", 12, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_get_where_clauses_from_comparisons", "SKSI-CRM-GET-WHERE-CLAUSES-FROM-COMPARISONS", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_get_where_clauses_from_comparison_asent", "SKSI-CRM-GET-WHERE-CLAUSES-FROM-COMPARISON-ASENT", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_get_where_clauses_from_comparison_asent_single_var", "SKSI-CRM-GET-WHERE-CLAUSES-FROM-COMPARISON-ASENT-SINGLE-VAR", 9, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_get_where_clauses_from_comparison_asent_double_vars", "SKSI-CRM-GET-WHERE-CLAUSES-FROM-COMPARISON-ASENT-DOUBLE-VARS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_apply_csql_operator_to_pfi_list_pair", "SKSI-CRM-APPLY-CSQL-OPERATOR-TO-PFI-LIST-PAIR", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_csql_operator_argnum_encodings_override_internal", "SKSI-CRM-CSQL-OPERATOR-ARGNUM-ENCODINGS-OVERRIDE-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_csql_operator_argnum_encodings_override", "SKSI-CRM-CSQL-OPERATOR-ARGNUM-ENCODINGS-OVERRIDE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_apply_csql_operator_to_pfi_list_value_pair", "SKSI-CRM-APPLY-CSQL-OPERATOR-TO-PFI-LIST-VALUE-PAIR", 9, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_get_where_clauses_from_decodings", "SKSI-CRM-GET-WHERE-CLAUSES-FROM-DECODINGS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "remake_where_clause", "REMAKE-WHERE-CLAUSE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "remake_where_clause_single", "REMAKE-WHERE-CLAUSE-SINGLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "remake_where_clause_multiple", "REMAKE-WHERE-CLAUSE-MULTIPLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "get_lit_pfi_list_pairs", "GET-LIT-PFI-LIST-PAIRS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "apply_csql_operator_to_lit_pfi_list_pair", "APPLY-CSQL-OPERATOR-TO-LIT-PFI-LIST-PAIR", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "sksi_crm_get_select_expressions_from_evaluations", "SKSI-CRM-GET-SELECT-EXPRESSIONS-FROM-EVALUATIONS", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "variable_predicate_litP", "VARIABLE-PREDICATE-LIT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "binary_litP", "BINARY-LIT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.query_sks.sksi_conjunctive_removal_module_utilities", "invert_lit", "INVERT-LIT", 1, 0, false);
        return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
    }
    
    public static SubLObject init_sksi_conjunctive_removal_module_utilities_file() {
        sksi_conjunctive_removal_module_utilities.$sksi_crms_check_required_fieldsP$ = SubLFiles.defparameter("*SKSI-CRMS-CHECK-REQUIRED-FIELDS?*", (SubLObject)sksi_conjunctive_removal_module_utilities.T);
        sksi_conjunctive_removal_module_utilities.$sksi_asserted_joinabilityP$ = SubLFiles.defparameter("*SKSI-ASSERTED-JOINABILITY?*", (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_sort_bound_variables$ = SubLFiles.defparameter("*SKSI-SPARQL-RECURSIVE-SKSI-SORT-BOUND-VARIABLES*", (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_unselected_asents$ = SubLFiles.defparameter("*SKSI-SORT-ASENTS-UNSELECTED-ASENTS*", (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_unbound_vars$ = SubLFiles.defparameter("*SKSI-SORT-ASENTS-UNBOUND-VARS*", (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_use_cost_path_lookahead_methodP$ = SubLFiles.defparameter("*SKSI-SORT-ASENTS-USE-COST-PATH-LOOKAHEAD-METHOD?*", (SubLObject)sksi_conjunctive_removal_module_utilities.T);
        sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_override_cost_path_lookahead_method_max_literal_count$ = SubLFiles.defparameter("*SKSI-SORT-ASENTS-OVERRIDE-COST-PATH-LOOKAHEAD-METHOD-MAX-LITERAL-COUNT*", (SubLObject)sksi_conjunctive_removal_module_utilities.$int23$41);
        sksi_conjunctive_removal_module_utilities.$sksi_sort_asent_estimated_cost_path_transform_asent_unbound_vars$ = SubLFiles.defparameter("*SKSI-SORT-ASENT-ESTIMATED-COST-PATH-TRANSFORM-ASENT-UNBOUND-VARS*", (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        sksi_conjunctive_removal_module_utilities.$sksi_asent_cost_constant_sksi_cost_dne$ = SubLFiles.defparameter("*SKSI-ASENT-COST-CONSTANT-SKSI-COST-DNE*", (SubLObject)sksi_conjunctive_removal_module_utilities.$float28$0_2);
        sksi_conjunctive_removal_module_utilities.$sksi_asent_cost_constant_0_unbound_vars_cost$ = SubLFiles.defparameter("*SKSI-ASENT-COST-CONSTANT-0-UNBOUND-VARS-COST*", (SubLObject)sksi_conjunctive_removal_module_utilities.$float29$0_01);
        sksi_conjunctive_removal_module_utilities.$sksi_asent_cost_constant_1_unbound_var_zero_cost$ = SubLFiles.defparameter("*SKSI-ASENT-COST-CONSTANT-1-UNBOUND-VAR-ZERO-COST*", (SubLObject)sksi_conjunctive_removal_module_utilities.$float30$0_1);
        sksi_conjunctive_removal_module_utilities.$sksi_asent_cost_constant_1_unbound_var_one_cost$ = SubLFiles.defparameter("*SKSI-ASENT-COST-CONSTANT-1-UNBOUND-VAR-ONE-COST*", (SubLObject)sksi_conjunctive_removal_module_utilities.$float31$0_007);
        sksi_conjunctive_removal_module_utilities.$sksi_asent_cost_constant_1_unbound_var_cost_divisor$ = SubLFiles.defparameter("*SKSI-ASENT-COST-CONSTANT-1-UNBOUND-VAR-COST-DIVISOR*", (SubLObject)sksi_conjunctive_removal_module_utilities.$int32$18000);
        sksi_conjunctive_removal_module_utilities.$sksi_asent_cost_constant_2_unbound_var_one_cost$ = SubLFiles.defparameter("*SKSI-ASENT-COST-CONSTANT-2-UNBOUND-VAR-ONE-COST*", (SubLObject)sksi_conjunctive_removal_module_utilities.$float33$1_0e_4);
        sksi_conjunctive_removal_module_utilities.$sksi_asent_cost_constant_2_unbound_var_evaluate_cost$ = SubLFiles.defparameter("*SKSI-ASENT-COST-CONSTANT-2-UNBOUND-VAR-EVALUATE-COST*", (SubLObject)sksi_conjunctive_removal_module_utilities.$float34$5_0e_5);
        sksi_conjunctive_removal_module_utilities.$recursive_sksi_crm_generate_csql_for_queryP$ = SubLFiles.defparameter("*RECURSIVE-SKSI-CRM-GENERATE-CSQL-FOR-QUERY?*", (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_outer_scope_defined_variables$ = SubLFiles.defparameter("*SKSI-SPARQL-RECURSIVE-SKSI-CRM-GENERATE-OUTER-SCOPE-DEFINED-VARIABLES*", (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_lit_pfis$ = SubLFiles.defparameter("*SKSI-SPARQL-RECURSIVE-SKSI-CRM-GENERATE-VAR-LIT-PFIS*", (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_pfis_encodings$ = SubLFiles.defparameter("*SKSI-SPARQL-RECURSIVE-SKSI-CRM-GENERATE-VAR-PFIS-ENCODINGS*", (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_lit_pfi_selects$ = SubLFiles.defparameter("*SKSI-SPARQL-RECURSIVE-SKSI-CRM-GENERATE-LIT-PFI-SELECTS*", (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_lfi_map$ = SubLFiles.defparameter("*SKSI-SPARQL-RECURSIVE-SKSI-CRM-GENERATE-VAR-LFI-MAP*", (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_lit_decodings$ = SubLFiles.defparameter("*SKSI-SPARQL-RECURSIVE-SKSI-CRM-GENERATE-VAR-LIT-DECODINGS*", (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_tac$ = SubLFiles.defparameter("*SKSI-SPARQL-RECURSIVE-SKSI-CRM-GENERATE-TAC*", (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        sksi_conjunctive_removal_module_utilities.$sksi_crm_generate_csql_suppress_optimizationP$ = SubLFiles.defparameter("*SKSI-CRM-GENERATE-CSQL-SUPPRESS-OPTIMIZATION?*", (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        sksi_conjunctive_removal_module_utilities.$sksi_crm_generate_csql_suppress_comparison_literal_sortingP$ = SubLFiles.defparameter("*SKSI-CRM-GENERATE-CSQL-SUPPRESS-COMPARISON-LITERAL-SORTING?*", (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        sksi_conjunctive_removal_module_utilities.$csql_simplification_wrt_field_equivalance_enabledP$ = SubLFiles.defvar("*CSQL-SIMPLIFICATION-WRT-FIELD-EQUIVALANCE-ENABLED?*", (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        sksi_conjunctive_removal_module_utilities.$csql_aliases$ = SubLFiles.defparameter("*CSQL-ALIASES*", (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        sksi_conjunctive_removal_module_utilities.$csql_transform_kill_name$ = SubLFiles.defparameter("*CSQL-TRANSFORM-KILL-NAME*", (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        sksi_conjunctive_removal_module_utilities.$csql_transform_kill_namespace$ = SubLFiles.defparameter("*CSQL-TRANSFORM-KILL-NAMESPACE*", (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        sksi_conjunctive_removal_module_utilities.$csql_transform_keep_name$ = SubLFiles.defparameter("*CSQL-TRANSFORM-KEEP-NAME*", (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        sksi_conjunctive_removal_module_utilities.$csql_transform_keep_namespace$ = SubLFiles.defparameter("*CSQL-TRANSFORM-KEEP-NAMESPACE*", (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        sksi_conjunctive_removal_module_utilities.$csql_transform_kill$ = SubLFiles.defparameter("*CSQL-TRANSFORM-KILL*", (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        sksi_conjunctive_removal_module_utilities.$csql_transform_keep$ = SubLFiles.defparameter("*CSQL-TRANSFORM-KEEP*", (SubLObject)sksi_conjunctive_removal_module_utilities.NIL);
        return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
    }
    
    public static SubLObject setup_sksi_conjunctive_removal_module_utilities_file() {
        preference_modules.doomed_unless_all_args_bindable((SubLObject)sksi_conjunctive_removal_module_utilities.$kw0$POS, sksi_conjunctive_removal_module_utilities.$const1$sksiUnknownSentence);
        memoization_state.note_memoized_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym5$GET_MEANING_SENTENCE_GAFS_FOR_ASENT_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym7$GET_CONDITIONAL_MEANING_SENTENCE_GAFS_FOR_ASENT_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym11$FIND_FIRST_APPLICABLE_MEANING_SENTENCE_GAF_FOR_ASENT_MEMOIZED);
        memoization_state.note_memoized_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym12$SKSI_RELEVANT_SPEC_PREDS_FROM_MEANING_SENTENCE_PRED);
        memoization_state.note_memoized_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym13$SKSI_RELEVANT_SPEC_INVERSES_FROM_MEANING_SENTENCE_PRED);
        memoization_state.note_memoized_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym16$LOGICAL_FIELD_INDEXICALS_JOINABLE_);
        utilities_macros.note_funcall_helper_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym21$SKSI_SORT_ASENTS_BOUND_VAR_P);
        utilities_macros.note_funcall_helper_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym22$SKSI_SORT_ASENTS_UNBOUND_VAR_P);
        memoization_state.note_memoized_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym35$SKSI_SORT_ASENT_ESTIMATED_COST_PATH);
        utilities_macros.note_funcall_helper_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym24$SKSI_ASENT_BETTER_P);
        memoization_state.note_memoized_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym41$SKSI_ASENT_FANOUT_ARG_TERM);
        memoization_state.note_memoized_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym43$SKSI_EVALUATABLE_PREDICATE_);
        utilities_macros.note_funcall_helper_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym84$CSQL_KILL_TABLE_ALIAS_FIELD_P);
        utilities_macros.note_funcall_helper_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym86$CSQL_TRANSFORM_TABLE_ALIAS_FIELD);
        utilities_macros.note_funcall_helper_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym87$CSQL_RESULT_SET_INDEX_TO_RENUMBER_P);
        utilities_macros.note_funcall_helper_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym89$CSQL_RENUMBER_RESULT_SET_INDEX);
        memoization_state.note_memoized_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym97$GET_DECODINGS_FOR_LOGICAL_FIELD_INDEXICAL);
        memoization_state.note_memoized_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym98$GET_PFI_ENCODING_PAIRS_FOR_LOGICAL_FIELD_INDEXICAL);
        memoization_state.note_memoized_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym99$GET_PRIMARY_KEYS_FOR_LOGICAL_FIELD_INDEXICAL);
        memoization_state.note_memoized_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym100$GET_PRIMARY_KEYS_FROM_DECODINGS);
        memoization_state.note_memoized_function((SubLObject)sksi_conjunctive_removal_module_utilities.$sym117$SKSI_CRM_CSQL_OPERATOR_ARGNUM_ENCODINGS_OVERRIDE);
        return (SubLObject)sksi_conjunctive_removal_module_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sksi_conjunctive_removal_module_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sksi_conjunctive_removal_module_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sksi_conjunctive_removal_module_utilities_file();
    }
    
    static {
        me = (SubLFile)new sksi_conjunctive_removal_module_utilities();
        sksi_conjunctive_removal_module_utilities.$sksi_crms_check_required_fieldsP$ = null;
        sksi_conjunctive_removal_module_utilities.$sksi_asserted_joinabilityP$ = null;
        sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_sort_bound_variables$ = null;
        sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_unselected_asents$ = null;
        sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_unbound_vars$ = null;
        sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_use_cost_path_lookahead_methodP$ = null;
        sksi_conjunctive_removal_module_utilities.$sksi_sort_asents_override_cost_path_lookahead_method_max_literal_count$ = null;
        sksi_conjunctive_removal_module_utilities.$sksi_sort_asent_estimated_cost_path_transform_asent_unbound_vars$ = null;
        sksi_conjunctive_removal_module_utilities.$sksi_asent_cost_constant_sksi_cost_dne$ = null;
        sksi_conjunctive_removal_module_utilities.$sksi_asent_cost_constant_0_unbound_vars_cost$ = null;
        sksi_conjunctive_removal_module_utilities.$sksi_asent_cost_constant_1_unbound_var_zero_cost$ = null;
        sksi_conjunctive_removal_module_utilities.$sksi_asent_cost_constant_1_unbound_var_one_cost$ = null;
        sksi_conjunctive_removal_module_utilities.$sksi_asent_cost_constant_1_unbound_var_cost_divisor$ = null;
        sksi_conjunctive_removal_module_utilities.$sksi_asent_cost_constant_2_unbound_var_one_cost$ = null;
        sksi_conjunctive_removal_module_utilities.$sksi_asent_cost_constant_2_unbound_var_evaluate_cost$ = null;
        sksi_conjunctive_removal_module_utilities.$recursive_sksi_crm_generate_csql_for_queryP$ = null;
        sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_outer_scope_defined_variables$ = null;
        sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_lit_pfis$ = null;
        sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_pfis_encodings$ = null;
        sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_lit_pfi_selects$ = null;
        sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_lfi_map$ = null;
        sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_var_lit_decodings$ = null;
        sksi_conjunctive_removal_module_utilities.$sksi_sparql_recursive_sksi_crm_generate_tac$ = null;
        sksi_conjunctive_removal_module_utilities.$sksi_crm_generate_csql_suppress_optimizationP$ = null;
        sksi_conjunctive_removal_module_utilities.$sksi_crm_generate_csql_suppress_comparison_literal_sortingP$ = null;
        sksi_conjunctive_removal_module_utilities.$csql_simplification_wrt_field_equivalance_enabledP$ = null;
        sksi_conjunctive_removal_module_utilities.$csql_aliases$ = null;
        sksi_conjunctive_removal_module_utilities.$csql_transform_kill_name$ = null;
        sksi_conjunctive_removal_module_utilities.$csql_transform_kill_namespace$ = null;
        sksi_conjunctive_removal_module_utilities.$csql_transform_keep_name$ = null;
        sksi_conjunctive_removal_module_utilities.$csql_transform_keep_namespace$ = null;
        sksi_conjunctive_removal_module_utilities.$csql_transform_kill$ = null;
        sksi_conjunctive_removal_module_utilities.$csql_transform_keep$ = null;
        $kw0$POS = SubLObjectFactory.makeKeyword("POS");
        $const1$sksiUnknownSentence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksiUnknownSentence"));
        $const2$disallowMeaningSentencesForUnboun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disallowMeaningSentencesForUnboundPredicates"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"));
        $sym4$IST_MEANING_SENTENCE_GAF_P = SubLObjectFactory.makeSymbol("IST-MEANING-SENTENCE-GAF-P");
        $sym5$GET_MEANING_SENTENCE_GAFS_FOR_ASENT_MEMOIZED = SubLObjectFactory.makeSymbol("GET-MEANING-SENTENCE-GAFS-FOR-ASENT-MEMOIZED");
        $int6$2048 = SubLObjectFactory.makeInteger(2048);
        $sym7$GET_CONDITIONAL_MEANING_SENTENCE_GAFS_FOR_ASENT_MEMOIZED = SubLObjectFactory.makeSymbol("GET-CONDITIONAL-MEANING-SENTENCE-GAFS-FOR-ASENT-MEMOIZED");
        $sym8$ITERATE_LIST_DONE = SubLObjectFactory.makeSymbol("ITERATE-LIST-DONE");
        $sym9$ITERATE_LIST_NEXT = SubLObjectFactory.makeSymbol("ITERATE-LIST-NEXT");
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEANING-SENTENCE-GAFS"), (SubLObject)SubLObjectFactory.makeSymbol("ASENT"), (SubLObject)SubLObjectFactory.makeSymbol("MEMOIZE?"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("META-MT"), (SubLObject)SubLObjectFactory.makeSymbol("STRENGTH"));
        $sym11$FIND_FIRST_APPLICABLE_MEANING_SENTENCE_GAF_FOR_ASENT_MEMOIZED = SubLObjectFactory.makeSymbol("FIND-FIRST-APPLICABLE-MEANING-SENTENCE-GAF-FOR-ASENT-MEMOIZED");
        $sym12$SKSI_RELEVANT_SPEC_PREDS_FROM_MEANING_SENTENCE_PRED = SubLObjectFactory.makeSymbol("SKSI-RELEVANT-SPEC-PREDS-FROM-MEANING-SENTENCE-PRED");
        $sym13$SKSI_RELEVANT_SPEC_INVERSES_FROM_MEANING_SENTENCE_PRED = SubLObjectFactory.makeSymbol("SKSI-RELEVANT-SPEC-INVERSES-FROM-MEANING-SENTENCE-PRED");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OTHER-MT"), (SubLObject)SubLObjectFactory.makeSymbol("OTHER-ASENT"));
        $sym15$VARIABLE_P = SubLObjectFactory.makeSymbol("VARIABLE-P");
        $sym16$LOGICAL_FIELD_INDEXICALS_JOINABLE_ = SubLObjectFactory.makeSymbol("LOGICAL-FIELD-INDEXICALS-JOINABLE?");
        $int17$1000 = SubLObjectFactory.makeInteger(1000);
        $kw18$SKSI_MISSING_LOGICAL_FIELD_FOR_INDEXICAL = SubLObjectFactory.makeKeyword("SKSI-MISSING-LOGICAL-FIELD-FOR-INDEXICAL");
        $const19$StringObject = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StringObject"));
        $const20$CSQLEquals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLEquals"));
        $sym21$SKSI_SORT_ASENTS_BOUND_VAR_P = SubLObjectFactory.makeSymbol("SKSI-SORT-ASENTS-BOUND-VAR-P");
        $sym22$SKSI_SORT_ASENTS_UNBOUND_VAR_P = SubLObjectFactory.makeSymbol("SKSI-SORT-ASENTS-UNBOUND-VAR-P");
        $int23$41 = SubLObjectFactory.makeInteger(41);
        $sym24$SKSI_ASENT_BETTER_P = SubLObjectFactory.makeSymbol("SKSI-ASENT-BETTER-P");
        $sym25$SKSI_ASENT_BETTER_WRT_PRIMARY_CHARACTERICS = SubLObjectFactory.makeSymbol("SKSI-ASENT-BETTER-WRT-PRIMARY-CHARACTERICS");
        $sym26$ASENT_AND_COST_PATH__ = SubLObjectFactory.makeSymbol("ASENT-AND-COST-PATH-<");
        $kw27$FULLY_BOUND = SubLObjectFactory.makeKeyword("FULLY-BOUND");
        $float28$0_2 = (SubLFloat)SubLObjectFactory.makeDouble(0.2);
        $float29$0_01 = (SubLFloat)SubLObjectFactory.makeDouble(0.01);
        $float30$0_1 = (SubLFloat)SubLObjectFactory.makeDouble(0.1);
        $float31$0_007 = (SubLFloat)SubLObjectFactory.makeDouble(0.007);
        $int32$18000 = SubLObjectFactory.makeInteger(18000);
        $float33$1_0e_4 = (SubLFloat)SubLObjectFactory.makeDouble(1.0E-4);
        $float34$5_0e_5 = (SubLFloat)SubLObjectFactory.makeDouble(5.0E-5);
        $sym35$SKSI_SORT_ASENT_ESTIMATED_COST_PATH = SubLObjectFactory.makeSymbol("SKSI-SORT-ASENT-ESTIMATED-COST-PATH");
        $sym36$SKSI_SORT_ASENT_ESTIMATED_COST_PATH_TRANSFORM_ASENT_ELEM = SubLObjectFactory.makeSymbol("SKSI-SORT-ASENT-ESTIMATED-COST-PATH-TRANSFORM-ASENT-ELEM");
        $const37$CCF_SDB_SDBMySQLExportStore_Cyc_K = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CCF-SDB-SDBMySQLExportStore-Cyc-KS"));
        $int38$88888888 = SubLObjectFactory.makeInteger(88888888);
        $list39 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT1"), (SubLObject)SubLObjectFactory.makeSymbol("B-ASENT"));
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT2"), (SubLObject)SubLObjectFactory.makeSymbol("W-ASENT"));
        $sym41$SKSI_ASENT_FANOUT_ARG_TERM = SubLObjectFactory.makeSymbol("SKSI-ASENT-FANOUT-ARG-TERM");
        $const42$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym43$SKSI_EVALUATABLE_PREDICATE_ = SubLObjectFactory.makeSymbol("SKSI-EVALUATABLE-PREDICATE?");
        $const44$RDFTripleStore_Physical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RDFTripleStore-Physical"));
        $kw45$SKSI_MISSING_DECODINGS = SubLObjectFactory.makeKeyword("SKSI-MISSING-DECODINGS");
        $kw46$SKSI_MISSING_ENCODINGS = SubLObjectFactory.makeKeyword("SKSI-MISSING-ENCODINGS");
        $kw47$SKSI_MISSING_FIELDS = SubLObjectFactory.makeKeyword("SKSI-MISSING-FIELDS");
        $kw48$SKSI_MISSING_PHYSICAL_FIELD_FOR_INDEXICAL = SubLObjectFactory.makeKeyword("SKSI-MISSING-PHYSICAL-FIELD-FOR-INDEXICAL");
        $kw49$SKSI_MISSING_REQUIRED_FIELD_VALUE = SubLObjectFactory.makeKeyword("SKSI-MISSING-REQUIRED-FIELD-VALUE");
        $kw50$SKSI_LIT_MS_ARG_MISMATCH = SubLObjectFactory.makeKeyword("SKSI-LIT-MS-ARG-MISMATCH");
        $kw51$SKSI_UNREFORMULATABLE = SubLObjectFactory.makeKeyword("SKSI-UNREFORMULATABLE");
        $kw52$SKSI_COMPARISON_ASENT_INAPPLICABLE = SubLObjectFactory.makeKeyword("SKSI-COMPARISON-ASENT-INAPPLICABLE");
        $kw53$SKSI_COMPARISON_OPERATOR_FORBIDDEN = SubLObjectFactory.makeKeyword("SKSI-COMPARISON-OPERATOR-FORBIDDEN");
        $kw54$SKSI_COMPARISON_ASENT_NO_VARIABLE_FOUND = SubLObjectFactory.makeKeyword("SKSI-COMPARISON-ASENT-NO-VARIABLE-FOUND");
        $kw55$SKSI_LIST_LENGTH_MISMATCH = SubLObjectFactory.makeKeyword("SKSI-LIST-LENGTH-MISMATCH");
        $kw56$SKSI_EVALUATE_CSQL_UNPRODUCIBLE = SubLObjectFactory.makeKeyword("SKSI-EVALUATE-CSQL-UNPRODUCIBLE");
        $kw57$SKSI_UNKNOWN_SENTENCE_CSQL_UNPRODUCIBLE = SubLObjectFactory.makeKeyword("SKSI-UNKNOWN-SENTENCE-CSQL-UNPRODUCIBLE");
        $sym58$DECODING_PHYSICAL_FIELD_INDEXICALS = SubLObjectFactory.makeSymbol("DECODING-PHYSICAL-FIELD-INDEXICALS");
        $kw59$RS_INDEX = SubLObjectFactory.makeKeyword("RS-INDEX");
        $sym60$PHYSICAL_FIELD_INDEXICAL_P = SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-INDEXICAL-P");
        $const61$evaluate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluate"));
        $sym62$HL_VARIABLE_P = SubLObjectFactory.makeSymbol("HL-VARIABLE-P");
        $sym63$CAR_IF_LIST_OR_NIL = SubLObjectFactory.makeSymbol("CAR-IF-LIST-OR-NIL");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SELECT-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("FIELDS"), (SubLObject)SubLObjectFactory.makeSymbol("FROM"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("WHERE"), (SubLObject)SubLObjectFactory.makeSymbol("LIMIT"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET"));
        $kw65$SELECT = SubLObjectFactory.makeKeyword("SELECT");
        $list66 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WHERE-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINTS"));
        $kw67$WHERE = SubLObjectFactory.makeKeyword("WHERE");
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FROM-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("TABLES"));
        $kw69$FROM = SubLObjectFactory.makeKeyword("FROM");
        $list70 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ITEM1"), (SubLObject)SubLObjectFactory.makeSymbol("ITEM2"));
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FK1"), (SubLObject)SubLObjectFactory.makeSymbol("FIELD1-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("FIELD1-TABLE-ALIAS"), (SubLObject)SubLObjectFactory.makeSymbol("FIELD1-NAMESPACE"));
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FK2"), (SubLObject)SubLObjectFactory.makeSymbol("FIELD2-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("FIELD2-TABLE-ALIAS"), (SubLObject)SubLObjectFactory.makeSymbol("FIELD2-NAMESPACE"));
        $kw73$FIELD = SubLObjectFactory.makeKeyword("FIELD");
        $sym74$THIRD = SubLObjectFactory.makeSymbol("THIRD");
        $str75$expected__S_got__S_instead = SubLObjectFactory.makeString("expected ~S got ~S instead");
        $list76 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SELECT-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("FIELDS"), (SubLObject)SubLObjectFactory.makeSymbol("FROM"), (SubLObject)SubLObjectFactory.makeSymbol("WHERE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("LIMIT"), (SubLObject)SubLObjectFactory.makeSymbol("OFFSET"));
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSQL-EQUALS"), (SubLObject)SubLObjectFactory.makeSymbol("KEEP-FIELD"), (SubLObject)SubLObjectFactory.makeSymbol("KILL-FIELD"));
        $sym78$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym79$CSQL_ALIASED_EXPRESSION_WITH_NAMESPACE_ = SubLObjectFactory.makeSymbol("CSQL-ALIASED-EXPRESSION-WITH-NAMESPACE?");
        $sym80$CSQL_EXPRESSION_REMOVE_NAMESPACE = SubLObjectFactory.makeSymbol("CSQL-EXPRESSION-REMOVE-NAMESPACE");
        $sym81$SECOND = SubLObjectFactory.makeSymbol("SECOND");
        $list82 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TABLE-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ALIAS"), (SubLObject)SubLObjectFactory.makeSymbol("NAMESPACE"));
        $list83 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIELD-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("FIELD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("NAMESPACE"));
        $sym84$CSQL_KILL_TABLE_ALIAS_FIELD_P = SubLObjectFactory.makeSymbol("CSQL-KILL-TABLE-ALIAS-FIELD-P");
        $list85 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIELD-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("KILL-ALIAS"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("KILL-NAMESPACE"));
        $sym86$CSQL_TRANSFORM_TABLE_ALIAS_FIELD = SubLObjectFactory.makeSymbol("CSQL-TRANSFORM-TABLE-ALIAS-FIELD");
        $sym87$CSQL_RESULT_SET_INDEX_TO_RENUMBER_P = SubLObjectFactory.makeSymbol("CSQL-RESULT-SET-INDEX-TO-RENUMBER-P");
        $list88 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RS-KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"));
        $sym89$CSQL_RENUMBER_RESULT_SET_INDEX = SubLObjectFactory.makeSymbol("CSQL-RENUMBER-RESULT-SET-INDEX");
        $sym90$TRUE = SubLObjectFactory.makeSymbol("TRUE");
        $sym91$_ = SubLObjectFactory.makeSymbol("<");
        $sym92$CADAR = SubLObjectFactory.makeSymbol("CADAR");
        $list93 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EVAL-LFI"), (SubLObject)SubLObjectFactory.makeSymbol("EVAL-EXPRESSION"), (SubLObject)SubLObjectFactory.makeSymbol("EVAL-CONDITIONS"));
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PFI"), (SubLObject)SubLObjectFactory.makeSymbol("ENCODING"));
        $list95 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-INDEXICAL"), (SubLObject)SubLObjectFactory.makeSymbol("ENCODING"));
        $sym96$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $sym97$GET_DECODINGS_FOR_LOGICAL_FIELD_INDEXICAL = SubLObjectFactory.makeSymbol("GET-DECODINGS-FOR-LOGICAL-FIELD-INDEXICAL");
        $sym98$GET_PFI_ENCODING_PAIRS_FOR_LOGICAL_FIELD_INDEXICAL = SubLObjectFactory.makeSymbol("GET-PFI-ENCODING-PAIRS-FOR-LOGICAL-FIELD-INDEXICAL");
        $sym99$GET_PRIMARY_KEYS_FOR_LOGICAL_FIELD_INDEXICAL = SubLObjectFactory.makeSymbol("GET-PRIMARY-KEYS-FOR-LOGICAL-FIELD-INDEXICAL");
        $sym100$GET_PRIMARY_KEYS_FROM_DECODINGS = SubLObjectFactory.makeSymbol("GET-PRIMARY-KEYS-FROM-DECODINGS");
        $sym101$PHYSICAL_FIELD_FOR_INDEXICAL = SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-FOR-INDEXICAL");
        $sym102$CSQL_FIELD_EXPRESSION_TABLE_NAME = SubLObjectFactory.makeSymbol("CSQL-FIELD-EXPRESSION-TABLE-NAME");
        $const103$CSQLStrictlyEquals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLStrictlyEquals"));
        $list104 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEFT"), (SubLObject)SubLObjectFactory.makeSymbol("RIGHT"));
        $kw105$AND = SubLObjectFactory.makeKeyword("AND");
        $kw106$OR = SubLObjectFactory.makeKeyword("OR");
        $kw107$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $list108 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("POSSIBLE-OUTER-HL-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("INNER-HL-VAR"));
        $list109 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("OLD-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("NEW-VAR"));
        $sym110$CDR = SubLObjectFactory.makeSymbol("CDR");
        $sym111$EL_VARIABLE_P = SubLObjectFactory.makeSymbol("EL-VARIABLE-P");
        $sym112$CAR = SubLObjectFactory.makeSymbol("CAR");
        $list113 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SUB-CSQL"), (SubLObject)SubLObjectFactory.makeSymbol("CSQL-VAR-DECODING-MAP"), (SubLObject)SubLObjectFactory.makeSymbol("CSQL-VAR-PFI-ENCODINGS"), (SubLObject)SubLObjectFactory.makeSymbol("CSQL-VAR-LIT-PFIS"), (SubLObject)SubLObjectFactory.makeSymbol("CSQL-LIT-PFI-SELECTS"), (SubLObject)SubLObjectFactory.makeSymbol("CSQL-VAR-LFI-MAP"));
        $list114 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("SELECT-KEYWORD"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("SELECT-FIELDS"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("FROM-CLAUSE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("WHERE-CLAUSE"));
        $const115$CSQLExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CSQLExists"));
        $sym116$CSQL_FALSE_P = SubLObjectFactory.makeSymbol("CSQL-FALSE-P");
        $sym117$SKSI_CRM_CSQL_OPERATOR_ARGNUM_ENCODINGS_OVERRIDE = SubLObjectFactory.makeSymbol("SKSI-CRM-CSQL-OPERATOR-ARGNUM-ENCODINGS-OVERRIDE");
        $sym118$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $const119$fieldEncodingOverrideForCompariso = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldEncodingOverrideForComparisonOperatorArg"));
        $kw120$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $int121$200 = SubLObjectFactory.makeInteger(200);
        $sym122$CSQL_DISJOIN_EXPRESSIONS = SubLObjectFactory.makeSymbol("CSQL-DISJOIN-EXPRESSIONS");
        $sym123$CSQL_CONJOIN_EXPRESSIONS = SubLObjectFactory.makeSymbol("CSQL-CONJOIN-EXPRESSIONS");
        $sym124$CSQL_FIELD_EXPRESSION_P = SubLObjectFactory.makeSymbol("CSQL-FIELD-EXPRESSION-P");
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYWORD"), (SubLObject)SubLObjectFactory.makeSymbol("FIELD"), (SubLObject)SubLObjectFactory.makeSymbol("TABLE-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("NAMESPACE"));
        $list126 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIT"), (SubLObject)SubLObjectFactory.makeSymbol("DECODING"));
        $list127 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEFT-LIT-PFI-LIST"), (SubLObject)SubLObjectFactory.makeSymbol("RIGHT-LIT-PFI-LIST"));
        $list128 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEFT-LIT"), (SubLObject)SubLObjectFactory.makeSymbol("LEFT-PFI-LIST"));
        $list129 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RIGHT-LIT"), (SubLObject)SubLObjectFactory.makeSymbol("RIGHT-PFI-LIST"));
        $kw130$EVAL = SubLObjectFactory.makeKeyword("EVAL");
    }
    
    public static final class $sksi_sort_asents_bound_var_p$UnaryFunction extends UnaryFunction
    {
        public $sksi_sort_asents_bound_var_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SKSI-SORT-ASENTS-BOUND-VAR-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sksi_conjunctive_removal_module_utilities.sksi_sort_asents_bound_var_p(arg1);
        }
    }
    
    public static final class $sksi_sort_asents_unbound_var_p$UnaryFunction extends UnaryFunction
    {
        public $sksi_sort_asents_unbound_var_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SKSI-SORT-ASENTS-UNBOUND-VAR-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return sksi_conjunctive_removal_module_utilities.sksi_sort_asents_unbound_var_p(arg1);
        }
    }
    
    public static final class $sksi_asent_better_wrt_primary_characterics$BinaryFunction extends BinaryFunction
    {
        public $sksi_asent_better_wrt_primary_characterics$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("SKSI-ASENT-BETTER-WRT-PRIMARY-CHARACTERICS"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return sksi_conjunctive_removal_module_utilities.sksi_asent_better_wrt_primary_characterics(arg1, arg2);
        }
    }
}

/*

	Total time: 2472 ms
	
*/