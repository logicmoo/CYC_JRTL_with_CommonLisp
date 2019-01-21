package com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.deck;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.isa;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class simple_db extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db";
    public static final String myFingerPrint = "e696903350934ff662518a0cd11a32d734b25bde6e9890451b866066b7459cbb";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 1350L)
    private static SubLSymbol $simple_sksi_terms_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 2592L)
    private static SubLSymbol $simple_sksi_assertions_for_sks_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 3154L)
    public static SubLSymbol $sksi_transcript_source_repropagationP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 4016L)
    private static SubLSymbol $simplified_sksi_predicates$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 4934L)
    private static SubLSymbol $simple_db_validation_problems$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 16558L)
    private static SubLSymbol $convert_simple_sksi_db_to_complex_override_properties$;
    private static final SubLObject $const0$SimpleDatabase;
    private static final SubLSymbol $sym1$SIMPLE_SKSI_TERMS;
    private static final SubLObject $const2$TestPace;
    private static final SubLSymbol $kw3$NEG;
    private static final SubLObject $const4$SimplifiedSKSIConstant;
    private static final SubLSymbol $sym5$_SIMPLE_SKSI_TERMS_CACHING_STATE_;
    private static final SubLSymbol $sym6$CLEAR_SIMPLE_SKSI_TERMS;
    private static final SubLSymbol $sym7$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const8$EverythingPSC;
    private static final SubLSymbol $sym9$SIMPLE_SKSI_ASSERTIONS_FOR_SKS;
    private static final SubLString $str10$Gathering_simple_SKSI_assertions_;
    private static final SubLString $str11$cdolist;
    private static final SubLSymbol $sym12$_SIMPLE_SKSI_ASSERTIONS_FOR_SKS_CACHING_STATE_;
    private static final SubLSymbol $sym13$CLEAR_SIMPLE_SKSI_ASSERTIONS_FOR_SKS;
    private static final SubLSymbol $sym14$SIMPLE_SKSI_TERM_;
    private static final SubLSymbol $sym15$SK_SOURCE_IN_ANY_MT_P;
    private static final SubLSymbol $sym16$MICROTHEORY_P;
    private static final SubLString $str17$Repropagating_;
    private static final SubLList $list18;
    private static final SubLSymbol $kw19$UNINITIALIZED;
    private static final SubLList $list20;
    private static final SubLString $str21$Simple_DB_invalid___s;
    private static final SubLString $str22$Validating__a_____;
    private static final SubLString $str23$DB_was_not_simple__returning__loo;
    private static final SubLList $list24;
    private static final SubLObject $const25$SKSIMt;
    private static final SubLList $list26;
    private static final SubLString $str27$Using_mapping_mt__a__;
    private static final SubLList $list28;
    private static final SubLList $list29;
    private static final SubLString $str30$_is_not___sksRepresentationComple;
    private static final SubLString $str31$could_not_find_any_tables_in_;
    private static final SubLString $str32$in_mappingMt_;
    private static final SubLList $list33;
    private static final SubLObject $const34$schemaTranslation;
    private static final SubLSymbol $kw35$DEPTH;
    private static final SubLSymbol $kw36$STACK;
    private static final SubLSymbol $kw37$QUEUE;
    private static final SubLSymbol $sym38$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw39$ERROR;
    private static final SubLString $str40$_A_is_not_a__A;
    private static final SubLSymbol $sym41$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw42$CERROR;
    private static final SubLString $str43$continue_anyway;
    private static final SubLSymbol $kw44$WARN;
    private static final SubLString $str45$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const46$genlPreds;
    private static final SubLString $str47$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str48$attempting_to_bind_direction_link;
    private static final SubLString $str49$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLString $str50$no___schemaTranslation_for_;
    private static final SubLString $str51$_in_;
    private static final SubLObject $const52$objectSchemaTranslation;
    private static final SubLList $list53;
    private static final SubLObject $const54$objectSchemaColumnPredicate;
    private static final SubLObject $const55$columnInDBTableNamed;
    private static final SubLString $str56$expected_at_least_2_columns__via_;
    private static final SubLString $str57$__got_;
    private static final SubLString $str58$no_columns__via___columnInDBTable;
    private static final SubLString $str59$_have_an___objectSchemaColumnPred;
    private static final SubLObject $const60$relationshipSchemaTranslation;
    private static final SubLList $list61;
    private static final SubLObject $const62$assertionSchemaTranslation;
    private static final SubLList $list63;
    private static final SubLObject $const64$DatabaseColumn;
    private static final SubLString $str65$_is_not_a___DatabaseColumn__argum;
    private static final SubLString $str66$_;
    private static final SubLList $list67;
    private static final SubLObject $const68$dBTableArgNumMapping;
    private static final SubLString $str69$unexpected_schema_translation_pre;
    private static final SubLString $str70$_for_;
    private static final SubLString $str71$Expected_exactly_one_physical_sch;
    private static final SubLString $str72$__via___physicalSchemaSourceMap__;
    private static final SubLObject $const73$tableFieldNameList;
    private static final SubLSymbol $kw74$TRUE;
    private static final SubLString $str75$Found_column_;
    private static final SubLString $str76$_not_listed_in___tableFieldNameLi;
    private static final SubLString $str77$__If_it_is_a_column_in_the_table_;
    private static final SubLObject $const78$NonCanonicallyTemporallyIndexedDB;
    private static final SubLObject $const79$CanonicallyTemporallyIndexedDBTab;
    private static final SubLList $list80;
    private static final SubLObject $const81$temporalTranslationColumns;
    private static final SubLString $str82$Found_no___temporalTranslationCol;
    private static final SubLList $list83;
    private static final SubLString $str84$_is_not_known_to_be_a___Canonical;
    private static final SubLList $list85;
    private static final SubLObject $const86$fieldEncoding;
    private static final SubLString $str87$Expected_exactly_one_logical_sche;
    private static final SubLString $str88$__via___logicalPhysicalSchemaMap_;
    private static final SubLList $list89;
    private static final SubLList $list90;
    private static final SubLSymbol $sym91$CMLS_FN_NART_P;
    private static final SubLObject $const92$codeMapping;
    private static final SubLSymbol $kw93$GAF;
    private static final SubLObject $const94$logicalFieldValueWithFieldName;
    private static final SubLString $str95$Found_no___codeMapping_for_;
    private static final SubLString $str96$__the_indexical_for_the_field_nam;
    private static final SubLString $str97$__Ensure_one_exists_via_either_as;
    private static final SubLObject $const98$fieldDecoding;
    private static final SubLObject $const99$CMLSFn;
    private static final SubLSymbol $sym100$LISTP;
    private static final SubLString $str101$_is_missing_an_asserted_value_for;
    private static final SubLString $str102$_is_missing_a_value_for_;
    private static final SubLSymbol $kw103$REPROPAGATE_;
    private static final SubLString $str104$Processing_;
    private static final SubLString $str105$__seed__simple_sksi_assertions_fo;
    private static final SubLString $str106$___A_simple_sksi_assertions_check;
    private static final SubLSymbol $kw107$VERBOSE_;
    private static final SubLString $str108$___S_in__S__;
    private static final SubLString $str109$___S_in__S__;
    private static final SubLSymbol $kw110$READ_ONLY_;
    private static final SubLString $str111$Adding_asserted_arguments_to_;
    private static final SubLString $str112$_complex_sksi_assertions_for_;
    private static final SubLString $str113$Assert_failed_for__A;
    private static final SubLString $str114$Killing_;
    private static final SubLString $str115$_simple_sksi_assertions_for_;
    private static final SubLObject $const116$isa;
    private static final SubLObject $const117$Database_Physical;
    private static final SubLObject $const118$StructuredKnowledgeSource_TopLeve;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 1264L)
    public static SubLObject simple_sksi_dbP(final SubLObject db) {
        return isa.isa_in_any_mtP(db, simple_db.$const0$SimpleDatabase);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 1350L)
    public static SubLObject clear_simple_sksi_terms() {
        final SubLObject cs = simple_db.$simple_sksi_terms_caching_state$.getGlobalValue();
        if (simple_db.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)simple_db.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 1350L)
    public static SubLObject remove_simple_sksi_terms() {
        return memoization_state.caching_state_remove_function_results_with_args(simple_db.$simple_sksi_terms_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(simple_db.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 1350L)
    public static SubLObject simple_sksi_terms_internal() {
        SubLObject result = (SubLObject)simple_db.NIL;
        SubLObject cdolist_list_var = isa.all_quoted_instances_in_all_mts(simple_db.$const4$SimplifiedSKSIConstant);
        SubLObject candidate = (SubLObject)simple_db.NIL;
        candidate = cdolist_list_var.first();
        while (simple_db.NIL != cdolist_list_var) {
            SubLObject skip_candidateP = (SubLObject)simple_db.NIL;
            if (simple_db.NIL != kb_utilities.kbeq(candidate, simple_db.$const2$TestPace)) {
                skip_candidateP = (SubLObject)simple_db.T;
            }
            else if (simple_db.NIL != fort_types_interface.predicateP(candidate)) {
                if (kb_indexing.num_predicate_rule_index(candidate, (SubLObject)simple_db.$kw3$NEG, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED).isZero()) {
                    skip_candidateP = (SubLObject)simple_db.T;
                }
                else {
                    final SubLObject antecedent_rules = kb_mapping.gather_predicate_rule_index(candidate, (SubLObject)simple_db.$kw3$NEG, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED);
                    SubLObject forward_rule_foundP = (SubLObject)simple_db.T;
                    if (simple_db.NIL == forward_rule_foundP) {
                        SubLObject csome_list_var = antecedent_rules;
                        SubLObject antecedent_rule = (SubLObject)simple_db.NIL;
                        antecedent_rule = csome_list_var.first();
                        while (simple_db.NIL == forward_rule_foundP && simple_db.NIL != csome_list_var) {
                            if (simple_db.NIL != assertions_high.forward_assertionP(antecedent_rule)) {
                                forward_rule_foundP = (SubLObject)simple_db.T;
                            }
                            csome_list_var = csome_list_var.rest();
                            antecedent_rule = csome_list_var.first();
                        }
                    }
                    if (simple_db.NIL == forward_rule_foundP) {
                        skip_candidateP = (SubLObject)simple_db.T;
                    }
                }
            }
            if (simple_db.NIL == skip_candidateP) {
                final SubLObject item_var = candidate;
                if (simple_db.NIL == conses_high.member(item_var, result, Symbols.symbol_function((SubLObject)simple_db.EQL), Symbols.symbol_function((SubLObject)simple_db.IDENTITY))) {
                    result = (SubLObject)ConsesLow.cons(item_var, result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            candidate = cdolist_list_var.first();
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 1350L)
    public static SubLObject simple_sksi_terms() {
        SubLObject caching_state = simple_db.$simple_sksi_terms_caching_state$.getGlobalValue();
        if (simple_db.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)simple_db.$sym1$SIMPLE_SKSI_TERMS, (SubLObject)simple_db.$sym5$_SIMPLE_SKSI_TERMS_CACHING_STATE_, (SubLObject)simple_db.NIL, (SubLObject)simple_db.EQL, (SubLObject)simple_db.ZERO_INTEGER, (SubLObject)simple_db.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)simple_db.$sym6$CLEAR_SIMPLE_SKSI_TERMS);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)simple_db.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(simple_sksi_terms_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)simple_db.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 2187L)
    public static SubLObject simple_sksi_termP(final SubLObject v_object) {
        return list_utilities.member_kbeqP(v_object, simple_sksi_terms());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 2284L)
    public static SubLObject simple_sksi_assertions_for_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)simple_db.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)simple_db.$sym7$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(simple_db.$const8$EverythingPSC, thread);
            SubLObject cdolist_list_var = simple_sksi_terms();
            SubLObject simple_sksi_term = (SubLObject)simple_db.NIL;
            simple_sksi_term = cdolist_list_var.first();
            while (simple_db.NIL != cdolist_list_var) {
                if (simple_db.NIL == fort_types_interface.functorP(simple_sksi_term)) {
                    SubLObject cdolist_list_var_$1 = virtual_indexing.assertions_mentioning_terms((SubLObject)ConsesLow.list(v_term, simple_sksi_term), (SubLObject)simple_db.UNPROVIDED);
                    SubLObject a = (SubLObject)simple_db.NIL;
                    a = cdolist_list_var_$1.first();
                    while (simple_db.NIL != cdolist_list_var_$1) {
                        final SubLObject item_var = a;
                        if (simple_db.NIL == conses_high.member(item_var, result, Symbols.symbol_function((SubLObject)simple_db.EQL), Symbols.symbol_function((SubLObject)simple_db.IDENTITY))) {
                            result = (SubLObject)ConsesLow.cons(item_var, result);
                        }
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        a = cdolist_list_var_$1.first();
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                simple_sksi_term = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 2592L)
    public static SubLObject clear_simple_sksi_assertions_for_sks() {
        final SubLObject cs = simple_db.$simple_sksi_assertions_for_sks_caching_state$.getGlobalValue();
        if (simple_db.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)simple_db.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 2592L)
    public static SubLObject remove_simple_sksi_assertions_for_sks(final SubLObject sks) {
        return memoization_state.caching_state_remove_function_results_with_args(simple_db.$simple_sksi_assertions_for_sks_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(sks), (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 2592L)
    public static SubLObject simple_sksi_assertions_for_sks_internal(final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = simple_sksi_assertions_for_term(sks);
        final SubLObject mapping_mt = sksi_sks_accessors.sks_get_defining_mt(sks, (SubLObject)simple_db.UNPROVIDED);
        final SubLObject list_var = kb_mapping.gather_mt_index(mapping_mt);
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)((simple_db.NIL != Sequences.cconcatenate((SubLObject)simple_db.$str10$Gathering_simple_SKSI_assertions_, format_nil.format_nil_s_no_copy(mapping_mt))) ? Sequences.cconcatenate((SubLObject)simple_db.$str10$Gathering_simple_SKSI_assertions_, format_nil.format_nil_s_no_copy(mapping_mt)) : simple_db.$str11$cdolist), thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)simple_db.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)simple_db.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)simple_db.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)simple_db.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject a = (SubLObject)simple_db.NIL;
                a = csome_list_var.first();
                while (simple_db.NIL != csome_list_var) {
                    if (simple_db.NIL != simple_sksi_assertionP(a)) {
                        final SubLObject item_var = a;
                        if (simple_db.NIL == conses_high.member(item_var, result, Symbols.symbol_function((SubLObject)simple_db.EQL), Symbols.symbol_function((SubLObject)simple_db.IDENTITY))) {
                            result = (SubLObject)ConsesLow.cons(item_var, result);
                        }
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)simple_db.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    a = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_db.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 2592L)
    public static SubLObject simple_sksi_assertions_for_sks(final SubLObject sks) {
        SubLObject caching_state = simple_db.$simple_sksi_assertions_for_sks_caching_state$.getGlobalValue();
        if (simple_db.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)simple_db.$sym9$SIMPLE_SKSI_ASSERTIONS_FOR_SKS, (SubLObject)simple_db.$sym12$_SIMPLE_SKSI_ASSERTIONS_FOR_SKS_CACHING_STATE_, (SubLObject)simple_db.FOUR_INTEGER, (SubLObject)simple_db.EQL, (SubLObject)simple_db.ONE_INTEGER, (SubLObject)simple_db.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)simple_db.$sym13$CLEAR_SIMPLE_SKSI_ASSERTIONS_FOR_SKS);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, sks, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(simple_sksi_assertions_for_sks_internal(sks)));
            memoization_state.caching_state_put(caching_state, sks, results, (SubLObject)simple_db.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 3025L)
    public static SubLObject simple_sksi_assertionP(final SubLObject assertion) {
        return cycl_utilities.expression_find_if((SubLObject)simple_db.$sym14$SIMPLE_SKSI_TERM_, assertions_high.assertion_cnf(assertion), (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 3370L)
    public static SubLObject repropagate_knowledge_source(final SubLObject sk_source, SubLObject only_these_predicates) {
        if (only_these_predicates == simple_db.UNPROVIDED) {
            only_these_predicates = (SubLObject)simple_db.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert simple_db.NIL != sksi_kb_accessors.sk_source_in_any_mt_p(sk_source) : sk_source;
        SubLObject count = (SubLObject)simple_db.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = control_vars.$use_transcriptP$.currentBinding(thread);
        try {
            control_vars.$use_transcriptP$.bind(simple_db.$sksi_transcript_source_repropagationP$.getDynamicValue(thread), thread);
            final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sk_source);
            assert simple_db.NIL != fort_types_interface.microtheory_p(mapping_mt) : mapping_mt;
            final SubLObject list_var = kb_mapping.gather_mt_index(mapping_mt);
            final SubLObject _prev_bind_0_$3 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)((simple_db.NIL != Sequences.cconcatenate((SubLObject)simple_db.$str17$Repropagating_, format_nil.format_nil_a_no_copy(sk_source))) ? Sequences.cconcatenate((SubLObject)simple_db.$str17$Repropagating_, format_nil.format_nil_a_no_copy(sk_source)) : simple_db.$str11$cdolist), thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)simple_db.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)simple_db.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)simple_db.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)simple_db.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject gaf = (SubLObject)simple_db.NIL;
                    gaf = csome_list_var.first();
                    while (simple_db.NIL != csome_list_var) {
                        if (simple_db.NIL != assertions_high.gaf_assertionP(gaf) && (simple_db.NIL == only_these_predicates || simple_db.NIL != assertion_utilities.gaf_assertion_with_any_of_preds_p(gaf, only_these_predicates))) {
                            ke.ke_repropagate_assertion_now(gaf);
                            count = Numbers.add(count, (SubLObject)simple_db.ONE_INTEGER);
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)simple_db.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        gaf = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_db.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$3, thread);
            }
        }
        finally {
            control_vars.$use_transcriptP$.rebind(_prev_bind_0, thread);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 4676L)
    public static SubLObject repropagate_simple_db(final SubLObject db) {
        return repropagate_knowledge_source(db, simple_db.$simplified_sksi_predicates$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 5048L)
    public static SubLObject ensure_simple_db_valid(final SubLObject db, SubLObject validate_queryableP, SubLObject verboseP) {
        if (validate_queryableP == simple_db.UNPROVIDED) {
            validate_queryableP = (SubLObject)simple_db.T;
        }
        if (verboseP == simple_db.UNPROVIDED) {
            verboseP = (SubLObject)simple_db.T;
        }
        final SubLObject validation_result = validate_simple_db(db, validate_queryableP, verboseP);
        if (simple_db.$list20.equal(validation_result)) {
            return validation_result;
        }
        return Errors.error((SubLObject)simple_db.$str21$Simple_DB_invalid___s, validation_result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 5359L)
    public static SubLObject validate_simple_db(final SubLObject db, SubLObject validate_queryableP, SubLObject verboseP) {
        if (validate_queryableP == simple_db.UNPROVIDED) {
            validate_queryableP = (SubLObject)simple_db.T;
        }
        if (verboseP == simple_db.UNPROVIDED) {
            verboseP = (SubLObject)simple_db.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (simple_db.NIL != verboseP) {
            format_nil.force_format((SubLObject)simple_db.T, (SubLObject)simple_db.$str22$Validating__a_____, db, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED);
        }
        if (simple_db.NIL == simple_sksi_dbP(db)) {
            Errors.warn((SubLObject)simple_db.$str23$DB_was_not_simple__returning__loo);
            return (SubLObject)simple_db.$list20;
        }
        SubLObject result = (SubLObject)simple_db.NIL;
        final SubLObject _prev_bind_0 = simple_db.$simple_db_validation_problems$.currentBinding(thread);
        try {
            simple_db.$simple_db_validation_problems$.bind((SubLObject)simple_db.NIL, thread);
            ensure_preds_have_deduced_values(db, (SubLObject)simple_db.$list24, simple_db.$const25$SKSIMt, (SubLObject)simple_db.UNPROVIDED);
            ensure_preds_have_deduced_values(db, (SubLObject)simple_db.$list26, simple_db.$const25$SKSIMt, (SubLObject)simple_db.UNPROVIDED);
            final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(db);
            if (simple_db.NIL != verboseP) {
                format_nil.force_format((SubLObject)simple_db.T, (SubLObject)simple_db.$str27$Using_mapping_mt__a__, mapping_mt, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED);
            }
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mapping_mt);
            final SubLObject _prev_bind_0_$5 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                ensure_preds_have_deduced_values(db, (SubLObject)simple_db.$list28, mapping_mt, (SubLObject)simple_db.UNPROVIDED);
                ensure_preds_have_deduced_values(db, (SubLObject)simple_db.$list29, mapping_mt, (SubLObject)simple_db.UNPROVIDED);
                if (simple_db.NIL == sksi_kb_accessors.knowledge_source_representation_completeP(db)) {
                    note_simple_db_validation_problem(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(db), (SubLObject)simple_db.$str30$_is_not___sksRepresentationComple));
                }
                SubLObject tables = (SubLObject)simple_db.NIL;
                final SubLObject _prev_bind_0_$6 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$7 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)simple_db.$sym7$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(simple_db.$const8$EverythingPSC, thread);
                    tables = sksi_kb_accessors.sk_source_sub_ks_direct(db);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$7, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$6, thread);
                }
                if (simple_db.NIL == tables) {
                    note_simple_db_validation_problem(Sequences.cconcatenate((SubLObject)simple_db.$str31$could_not_find_any_tables_in_, format_nil.format_nil_a_no_copy(db)));
                }
                SubLObject cdolist_list_var = tables;
                SubLObject table = (SubLObject)simple_db.NIL;
                table = cdolist_list_var.first();
                while (simple_db.NIL != cdolist_list_var) {
                    validate_simple_table(table, mapping_mt, validate_queryableP);
                    cdolist_list_var = cdolist_list_var.rest();
                    table = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$5, thread);
            }
            if (simple_db.NIL == simple_db.$simple_db_validation_problems$.getDynamicValue(thread)) {
                result = (SubLObject)simple_db.$list20;
            }
            else {
                note_simple_db_validation_problem(Sequences.cconcatenate((SubLObject)simple_db.$str32$in_mappingMt_, format_nil.format_nil_a_no_copy(mapping_mt)));
                result = Sequences.nreverse(simple_db.$simple_db_validation_problems$.getDynamicValue(thread));
            }
        }
        finally {
            simple_db.$simple_db_validation_problems$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 7301L)
    public static SubLObject validate_simple_table(final SubLObject table, final SubLObject mapping_mt, final SubLObject validate_queryableP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mapping_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ensure_preds_have_deduced_values(table, (SubLObject)simple_db.$list33, mapping_mt, (SubLObject)simple_db.UNPROVIDED);
            ensure_all_fields_are_listed(table, mapping_mt);
            SubLObject schema_translation_pred = (SubLObject)simple_db.NIL;
            if (simple_db.NIL == schema_translation_pred) {
                final SubLObject node_var = simple_db.$const34$schemaTranslation;
                final SubLObject deck_type = (SubLObject)simple_db.$kw37$QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = (SubLObject)simple_db.NIL;
                final SubLObject _prev_bind_0_$8 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)simple_db.NIL;
                        final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$10 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((simple_db.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((simple_db.NIL != tv_var) ? simple_db.$sym38$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (simple_db.NIL != tv_var && simple_db.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && simple_db.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)simple_db.$kw39$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)simple_db.ONE_INTEGER, (SubLObject)simple_db.$str40$_A_is_not_a__A, tv_var, (SubLObject)simple_db.$sym41$SBHL_TRUE_TV_P, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)simple_db.$kw42$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)simple_db.ONE_INTEGER, (SubLObject)simple_db.$str43$continue_anyway, (SubLObject)simple_db.$str40$_A_is_not_a__A, tv_var, (SubLObject)simple_db.$sym41$SBHL_TRUE_TV_P, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)simple_db.$kw44$WARN)) {
                                    Errors.warn((SubLObject)simple_db.$str40$_A_is_not_a__A, tv_var, (SubLObject)simple_db.$sym41$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)simple_db.$str45$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)simple_db.$str43$continue_anyway, (SubLObject)simple_db.$str40$_A_is_not_a__A, tv_var, (SubLObject)simple_db.$sym41$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$10 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$11 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$13 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(simple_db.$const46$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(simple_db.$const46$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(simple_db.$const46$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)simple_db.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(simple_db.$const46$genlPreds), thread);
                                if (simple_db.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || simple_db.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(simple_db.$const34$schemaTranslation, sbhl_module_vars.get_sbhl_module((SubLObject)simple_db.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$11 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$12 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$14 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module(simple_db.$const46$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)simple_db.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)simple_db.UNPROVIDED);
                                        for (node_and_predicate_mode = (SubLObject)ConsesLow.list(simple_db.$const34$schemaTranslation, sbhl_search_vars.genl_inverse_mode_p()); simple_db.NIL != node_and_predicate_mode && simple_db.NIL == schema_translation_pred; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$17 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = conses_high.second(node_and_predicate_mode);
                                            final SubLObject spec_pred = node_var_$17;
                                            final SubLObject _prev_bind_0_$12 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                final SubLObject inverseP = predicate_mode;
                                                if (simple_db.NIL != kb_mapping_utilities.fpred_value(table, spec_pred, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED)) {
                                                    schema_translation_pred = spec_pred;
                                                }
                                                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(simple_db.$const46$genlPreds));
                                                SubLObject rest;
                                                SubLObject module_var;
                                                SubLObject _prev_bind_0_$13;
                                                SubLObject _prev_bind_1_$13;
                                                SubLObject node;
                                                SubLObject d_link;
                                                SubLObject mt_links;
                                                SubLObject iteration_state;
                                                SubLObject mt;
                                                SubLObject tv_links;
                                                SubLObject _prev_bind_0_$14;
                                                SubLObject iteration_state_$22;
                                                SubLObject tv;
                                                SubLObject link_nodes;
                                                SubLObject _prev_bind_0_$15;
                                                SubLObject sol;
                                                SubLObject set_contents_var;
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_vars_link_node;
                                                SubLObject csome_list_var;
                                                SubLObject node_vars_link_node2;
                                                SubLObject new_list;
                                                SubLObject rest_$24;
                                                SubLObject generating_fn;
                                                SubLObject _prev_bind_0_$16;
                                                SubLObject sol2;
                                                SubLObject link_nodes2;
                                                SubLObject set_contents_var2;
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject node_vars_link_node3;
                                                SubLObject csome_list_var2;
                                                SubLObject node_vars_link_node4;
                                                for (rest = (SubLObject)simple_db.NIL, rest = accessible_modules; simple_db.NIL == schema_translation_pred && simple_db.NIL != rest; rest = rest.rest()) {
                                                    module_var = rest.first();
                                                    _prev_bind_0_$13 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    _prev_bind_1_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((simple_db.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(simple_db.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        node = function_terms.naut_to_nart(node_var_$17);
                                                        if (simple_db.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)simple_db.UNPROVIDED));
                                                            if (simple_db.NIL != d_link) {
                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)simple_db.UNPROVIDED));
                                                                if (simple_db.NIL != mt_links) {
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); simple_db.NIL == schema_translation_pred && simple_db.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (simple_db.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                for (iteration_state_$22 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); simple_db.NIL == schema_translation_pred && simple_db.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$22); iteration_state_$22 = dictionary_contents.do_dictionary_contents_next(iteration_state_$22)) {
                                                                                    thread.resetMultipleValues();
                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$22);
                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (simple_db.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            sol = link_nodes;
                                                                                            if (simple_db.NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)simple_db.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); simple_db.NIL == schema_translation_pred && simple_db.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (simple_db.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && simple_db.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)simple_db.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)simple_db.UNPROVIDED);
                                                                                                        deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                if (simple_db.NIL == schema_translation_pred) {
                                                                                                    csome_list_var = sol;
                                                                                                    node_vars_link_node2 = (SubLObject)simple_db.NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while (simple_db.NIL == schema_translation_pred && simple_db.NIL != csome_list_var) {
                                                                                                        if (simple_db.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)simple_db.UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)simple_db.UNPROVIDED);
                                                                                                            deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)simple_db.$str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$15, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$22);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$14, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)simple_db.FIVE_INTEGER, (SubLObject)simple_db.$str48$attempting_to_bind_direction_link, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (simple_db.NIL != obsolete.cnat_p(node, (SubLObject)simple_db.UNPROVIDED)) {
                                                            new_list = ((simple_db.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)simple_db.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)simple_db.UNPROVIDED)));
                                                            for (rest_$24 = (SubLObject)simple_db.NIL, rest_$24 = new_list; simple_db.NIL == schema_translation_pred && simple_db.NIL != rest_$24; rest_$24 = rest_$24.rest()) {
                                                                generating_fn = rest_$24.first();
                                                                _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    link_nodes2 = (sol2 = Functions.funcall(generating_fn, node));
                                                                    if (simple_db.NIL != set.set_p(sol2)) {
                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)simple_db.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); simple_db.NIL == schema_translation_pred && simple_db.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (simple_db.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && simple_db.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)simple_db.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)simple_db.UNPROVIDED);
                                                                                deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        if (simple_db.NIL == schema_translation_pred) {
                                                                            csome_list_var2 = sol2;
                                                                            node_vars_link_node4 = (SubLObject)simple_db.NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (simple_db.NIL == schema_translation_pred && simple_db.NIL != csome_list_var2) {
                                                                                if (simple_db.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)simple_db.UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)simple_db.UNPROVIDED);
                                                                                    deck.deck_push((SubLObject)ConsesLow.list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)simple_db.$str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$16, thread);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$13, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$13, thread);
                                                    }
                                                }
                                            }
                                            finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$12, thread);
                                            }
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$14, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$12, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$11, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)simple_db.TWO_INTEGER, (SubLObject)simple_db.$str49$Node__a_does_not_pass_sbhl_type_t, simple_db.$const34$schemaTranslation, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)simple_db.UNPROVIDED)), (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$13, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$11, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$10, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$10, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$9, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_db.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$8, thread);
                }
            }
            if (simple_db.NIL == schema_translation_pred) {
                note_simple_db_validation_problem(Sequences.cconcatenate((SubLObject)simple_db.$str50$no___schemaTranslation_for_, new SubLObject[] { format_nil.format_nil_a_no_copy(table), simple_db.$str51$_in_, format_nil.format_nil_a_no_copy(mapping_mt) }));
            }
            final SubLObject pcase_var2 = schema_translation_pred;
            if (pcase_var2.eql(simple_db.$const52$objectSchemaTranslation)) {
                ensure_preds_have_deduced_values(table, (SubLObject)simple_db.$list53, mapping_mt, (SubLObject)simple_db.UNPROVIDED);
                SubLObject column_count = (SubLObject)simple_db.ZERO_INTEGER;
                SubLObject found_a_column_predicateP = (SubLObject)simple_db.NIL;
                SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(table, simple_db.$const55$columnInDBTableNamed, (SubLObject)simple_db.TWO_INTEGER, (SubLObject)simple_db.ONE_INTEGER, (SubLObject)simple_db.UNPROVIDED);
                SubLObject column = (SubLObject)simple_db.NIL;
                column = cdolist_list_var.first();
                while (simple_db.NIL != cdolist_list_var) {
                    column_count = Numbers.add(column_count, (SubLObject)simple_db.ONE_INTEGER);
                    if (simple_db.NIL != kb_mapping_utilities.fpred_value(column, simple_db.$const54$objectSchemaColumnPredicate, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED)) {
                        found_a_column_predicateP = (SubLObject)simple_db.T;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    column = cdolist_list_var.first();
                }
                if (column_count.numL((SubLObject)simple_db.TWO_INTEGER)) {
                    note_simple_db_validation_problem(Sequences.cconcatenate((SubLObject)simple_db.$str56$expected_at_least_2_columns__via_, new SubLObject[] { format_nil.format_nil_a_no_copy(table), simple_db.$str57$__got_, format_nil.format_nil_a_no_copy(column_count) }));
                }
                if (simple_db.NIL == found_a_column_predicateP) {
                    note_simple_db_validation_problem(Sequences.cconcatenate((SubLObject)simple_db.$str58$no_columns__via___columnInDBTable, new SubLObject[] { format_nil.format_nil_a_no_copy(table), simple_db.$str59$_have_an___objectSchemaColumnPred }));
                }
            }
            else if (pcase_var2.eql(simple_db.$const60$relationshipSchemaTranslation)) {
                ensure_preds_have_deduced_values(table, (SubLObject)simple_db.$list61, mapping_mt, (SubLObject)simple_db.UNPROVIDED);
                final SubLObject column_count = Sequences.length(kb_mapping_utilities.pred_values(table, simple_db.$const55$columnInDBTableNamed, (SubLObject)simple_db.TWO_INTEGER, (SubLObject)simple_db.ONE_INTEGER, (SubLObject)simple_db.UNPROVIDED));
                if (column_count.numL((SubLObject)simple_db.TWO_INTEGER)) {
                    note_simple_db_validation_problem(Sequences.cconcatenate((SubLObject)simple_db.$str56$expected_at_least_2_columns__via_, new SubLObject[] { format_nil.format_nil_a_no_copy(table), simple_db.$str57$__got_, format_nil.format_nil_a_no_copy(column_count) }));
                }
                ensure_temporal_or_atemporal_table(table, mapping_mt);
            }
            else if (pcase_var2.eql(simple_db.$const62$assertionSchemaTranslation)) {
                ensure_preds_have_deduced_values(table, (SubLObject)simple_db.$list63, mapping_mt, (SubLObject)simple_db.UNPROVIDED);
                final SubLObject column_count = Sequences.length(kb_mapping_utilities.pred_values(table, simple_db.$const55$columnInDBTableNamed, (SubLObject)simple_db.TWO_INTEGER, (SubLObject)simple_db.ONE_INTEGER, (SubLObject)simple_db.UNPROVIDED));
                if (column_count.numL((SubLObject)simple_db.TWO_INTEGER)) {
                    note_simple_db_validation_problem(Sequences.cconcatenate((SubLObject)simple_db.$str56$expected_at_least_2_columns__via_, new SubLObject[] { format_nil.format_nil_a_no_copy(table), simple_db.$str57$__got_, format_nil.format_nil_a_no_copy(column_count) }));
                }
                SubLObject cdolist_list_var2 = el_utilities.el_list_items(kb_mapping_utilities.fpred_value(table, simple_db.$const68$dBTableArgNumMapping, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED));
                SubLObject column2 = (SubLObject)simple_db.NIL;
                column2 = cdolist_list_var2.first();
                while (simple_db.NIL != cdolist_list_var2) {
                    if (simple_db.NIL == isa.isaP(column2, simple_db.$const64$DatabaseColumn, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED)) {
                        note_simple_db_validation_problem(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(column2), new SubLObject[] { simple_db.$str65$_is_not_a___DatabaseColumn__argum, format_nil.format_nil_a_no_copy(table), simple_db.$str66$_ }));
                    }
                    ensure_preds_have_deduced_values(column2, (SubLObject)simple_db.$list67, mapping_mt, (SubLObject)simple_db.UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    column2 = cdolist_list_var2.first();
                }
                ensure_temporal_or_atemporal_table(table, mapping_mt);
            }
            else {
                note_simple_db_validation_problem(Sequences.cconcatenate((SubLObject)simple_db.$str69$unexpected_schema_translation_pre, new SubLObject[] { format_nil.format_nil_a_no_copy(schema_translation_pred), simple_db.$str70$_for_, format_nil.format_nil_a_no_copy(table) }));
            }
            if (simple_db.NIL == sksi_kb_accessors.knowledge_source_representation_completeP(table)) {
                note_simple_db_validation_problem(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(table), (SubLObject)simple_db.$str30$_is_not___sksRepresentationComple));
            }
            final SubLObject ps_list = sksi_kb_accessors.sk_source_physical_schemata(table);
            if (simple_db.NIL == list_utilities.singletonP(ps_list)) {
                note_simple_db_validation_problem(Sequences.cconcatenate((SubLObject)simple_db.$str71$Expected_exactly_one_physical_sch, new SubLObject[] { format_nil.format_nil_a_no_copy(table), simple_db.$str72$__via___physicalSchemaSourceMap__, format_nil.format_nil_a_no_copy(ps_list) }));
            }
            else {
                validate_simple_physical_schema(list_utilities.only_one(ps_list), mapping_mt, validate_queryableP);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)simple_db.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 10780L)
    public static SubLObject ensure_all_fields_are_listed(final SubLObject table, final SubLObject mapping_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mapping_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject field_name_el_list = kb_mapping_utilities.fpred_value(table, simple_db.$const73$tableFieldNameList, (SubLObject)simple_db.ONE_INTEGER, (SubLObject)simple_db.TWO_INTEGER, (SubLObject)simple_db.$kw74$TRUE);
            final SubLObject field_name_items = (SubLObject)((simple_db.NIL != field_name_el_list) ? el_utilities.el_list_items(field_name_el_list) : simple_db.NIL);
            final SubLObject field_set = set_utilities.construct_set_from_list(field_name_items, Symbols.symbol_function((SubLObject)simple_db.EQUALP), (SubLObject)simple_db.UNPROVIDED);
            SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(table, simple_db.$const55$columnInDBTableNamed, (SubLObject)simple_db.TWO_INTEGER, (SubLObject)simple_db.THREE_INTEGER, (SubLObject)simple_db.$kw74$TRUE);
            SubLObject column = (SubLObject)simple_db.NIL;
            column = cdolist_list_var.first();
            while (simple_db.NIL != cdolist_list_var) {
                if (simple_db.NIL == set.set_memberP(column, field_set)) {
                    note_simple_db_validation_problem(Sequences.cconcatenate((SubLObject)simple_db.$str75$Found_column_, new SubLObject[] { format_nil.format_nil_a_no_copy(column), simple_db.$str76$_not_listed_in___tableFieldNameLi, format_nil.format_nil_a_no_copy(table), simple_db.$str77$__If_it_is_a_column_in_the_table_ }));
                }
                cdolist_list_var = cdolist_list_var.rest();
                column = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)simple_db.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 11500L)
    public static SubLObject ensure_temporal_or_atemporal_table(final SubLObject table, final SubLObject mapping_mt) {
        if (simple_db.NIL == isa.isaP(table, simple_db.$const78$NonCanonicallyTemporallyIndexedDB, mapping_mt, (SubLObject)simple_db.UNPROVIDED)) {
            if (simple_db.NIL != isa.isaP(table, simple_db.$const79$CanonicallyTemporallyIndexedDBTab, mapping_mt, (SubLObject)simple_db.UNPROVIDED)) {
                ensure_preds_have_deduced_values(table, (SubLObject)simple_db.$list80, mapping_mt, (SubLObject)simple_db.UNPROVIDED);
                final SubLObject gaf = kb_mapping_utilities.fpred_value_gaf(table, simple_db.$const81$temporalTranslationColumns, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED);
                if (simple_db.NIL == gaf) {
                    note_simple_db_validation_problem(Sequences.cconcatenate((SubLObject)simple_db.$str82$Found_no___temporalTranslationCol, format_nil.format_nil_a_no_copy(table)));
                }
                else {
                    final SubLObject column_1 = assertions_high.gaf_arg2(gaf);
                    final SubLObject column_2 = assertions_high.gaf_arg3(gaf);
                    ensure_preds_have_deduced_values(column_1, (SubLObject)simple_db.$list83, mapping_mt, (SubLObject)simple_db.UNPROVIDED);
                    ensure_preds_have_deduced_values(column_2, (SubLObject)simple_db.$list83, mapping_mt, (SubLObject)simple_db.UNPROVIDED);
                }
            }
            else {
                note_simple_db_validation_problem(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(table), new SubLObject[] { simple_db.$str84$_is_not_known_to_be_a___Canonical, format_nil.format_nil_a_no_copy(mapping_mt) }));
            }
        }
        return (SubLObject)simple_db.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 12468L)
    public static SubLObject validate_simple_physical_schema(final SubLObject ps, final SubLObject mapping_mt, final SubLObject validate_queryableP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mapping_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject preds = (SubLObject)simple_db.$list85;
            if (simple_db.NIL != validate_queryableP) {
                preds = (SubLObject)ConsesLow.cons(simple_db.$const86$fieldEncoding, preds);
            }
            ensure_preds_have_deduced_values(ps, preds, mapping_mt, (SubLObject)simple_db.UNPROVIDED);
            final SubLObject ls_list = sksi_kb_accessors.physical_schema_logical_schemata(ps);
            if (simple_db.NIL == list_utilities.singletonP(ls_list)) {
                note_simple_db_validation_problem(Sequences.cconcatenate((SubLObject)simple_db.$str87$Expected_exactly_one_logical_sche, new SubLObject[] { format_nil.format_nil_a_no_copy(ps), simple_db.$str88$__via___logicalPhysicalSchemaMap_, format_nil.format_nil_a_no_copy(ls_list) }));
            }
            else {
                validate_simple_logical_schema(list_utilities.only_one(ls_list), mapping_mt, validate_queryableP);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)simple_db.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 13171L)
    public static SubLObject validate_simple_logical_schema(final SubLObject ls, final SubLObject mapping_mt, final SubLObject validate_queryableP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mapping_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ensure_preds_have_deduced_values(ls, (SubLObject)simple_db.$list89, mapping_mt, (SubLObject)simple_db.UNPROVIDED);
            SubLObject cdolist_list_var = sksi_meaning_sentence_utilities.logical_schema_logical_field_indexicals_used_in_meaning_sentences(ls);
            SubLObject lfi = (SubLObject)simple_db.NIL;
            lfi = cdolist_list_var.first();
            while (simple_db.NIL != cdolist_list_var) {
                validate_simple_logical_field_indexical(lfi, mapping_mt, validate_queryableP);
                cdolist_list_var = cdolist_list_var.rest();
                lfi = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)simple_db.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 13806L)
    public static SubLObject validate_simple_logical_field_indexical(final SubLObject lfi, final SubLObject mapping_mt, final SubLObject validate_queryableP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = (SubLObject)simple_db.$list90;
        if (simple_db.NIL != validate_queryableP) {
            preds = (SubLObject)ConsesLow.cons(simple_db.$const86$fieldEncoding, preds);
        }
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mapping_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ensure_preds_have_deduced_values(lfi, preds, mapping_mt, (SubLObject)simple_db.T);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)simple_db.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 14231L)
    public static SubLObject ensure_field_decoding_has_code_mappings(final SubLObject lfi) {
        SubLObject cdolist_list_var = kb_mapping_utilities.pred_values(lfi, simple_db.$const98$fieldDecoding, (SubLObject)simple_db.TWO_INTEGER, (SubLObject)simple_db.FOUR_INTEGER, (SubLObject)simple_db.$kw74$TRUE);
        SubLObject decoding = (SubLObject)simple_db.NIL;
        decoding = cdolist_list_var.first();
        while (simple_db.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$27;
            final SubLObject cmls_fn_narts = cdolist_list_var_$27 = cycl_utilities.expression_gather(decoding, (SubLObject)simple_db.$sym91$CMLS_FN_NART_P, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED);
            SubLObject cmls_fn_nart = (SubLObject)simple_db.NIL;
            cmls_fn_nart = cdolist_list_var_$27.first();
            while (simple_db.NIL != cdolist_list_var_$27) {
                SubLObject code_mapping_foundP = (SubLObject)simple_db.NIL;
                final SubLObject pred_var = simple_db.$const92$codeMapping;
                if (simple_db.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(cmls_fn_nart, (SubLObject)simple_db.ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(cmls_fn_nart, (SubLObject)simple_db.ONE_INTEGER, pred_var);
                    SubLObject done_var = code_mapping_foundP;
                    final SubLObject token_var = (SubLObject)simple_db.NIL;
                    while (simple_db.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (simple_db.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)simple_db.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)simple_db.$kw93$GAF, (SubLObject)simple_db.$kw74$TRUE, (SubLObject)simple_db.NIL);
                                SubLObject done_var_$28 = code_mapping_foundP;
                                final SubLObject token_var_$29 = (SubLObject)simple_db.NIL;
                                while (simple_db.NIL == done_var_$28) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$29);
                                    final SubLObject valid_$30 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$29.eql(gaf));
                                    if (simple_db.NIL != valid_$30) {
                                        code_mapping_foundP = (SubLObject)simple_db.T;
                                    }
                                    done_var_$28 = (SubLObject)SubLObjectFactory.makeBoolean(simple_db.NIL == valid_$30 || simple_db.NIL != code_mapping_foundP);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                                try {
                                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)simple_db.T);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (simple_db.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(simple_db.NIL == valid || simple_db.NIL != code_mapping_foundP);
                    }
                }
                if (simple_db.NIL == code_mapping_foundP) {
                    final SubLObject field_name = kb_mapping_utilities.fpred_value(lfi, simple_db.$const94$logicalFieldValueWithFieldName, (SubLObject)simple_db.THREE_INTEGER, (SubLObject)simple_db.TWO_INTEGER, (SubLObject)simple_db.$kw74$TRUE);
                    note_simple_db_validation_problem(Sequences.cconcatenate((SubLObject)simple_db.$str95$Found_no___codeMapping_for_, new SubLObject[] { format_nil.format_nil_a_no_copy(lfi), simple_db.$str96$__the_indexical_for_the_field_nam, format_nil.format_nil_a_no_copy(field_name), simple_db.$str97$__Ensure_one_exists_via_either_as }));
                }
                cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                cmls_fn_nart = cdolist_list_var_$27.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            decoding = cdolist_list_var.first();
        }
        return (SubLObject)simple_db.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 15065L)
    public static SubLObject cmls_fn_nart_p(final SubLObject v_object) {
        return narts_high.nart_with_functor_p(simple_db.$const99$CMLSFn, v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 15153L)
    public static SubLObject note_simple_db_validation_problem(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert simple_db.NIL != Types.listp(simple_db.$simple_db_validation_problems$.getDynamicValue(thread)) : simple_db.$simple_db_validation_problems$.getDynamicValue(thread);
        simple_db.$simple_db_validation_problems$.setDynamicValue((SubLObject)ConsesLow.cons(string, simple_db.$simple_db_validation_problems$.getDynamicValue(thread)), thread);
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 15343L)
    public static SubLObject ensure_preds_have_deduced_values(final SubLObject fort, final SubLObject preds, final SubLObject mt, SubLObject find_as_subtermP) {
        if (find_as_subtermP == simple_db.UNPROVIDED) {
            find_as_subtermP = (SubLObject)simple_db.NIL;
        }
        return ensure_preds_have_values(fort, preds, mt, (SubLObject)simple_db.NIL, find_as_subtermP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 15507L)
    public static SubLObject ensure_preds_have_values(final SubLObject fort, final SubLObject preds, final SubLObject mt, final SubLObject ensure_assertedP, final SubLObject find_as_subtermP) {
        SubLObject cdolist_list_var = preds;
        SubLObject pred = (SubLObject)simple_db.NIL;
        pred = cdolist_list_var.first();
        while (simple_db.NIL != cdolist_list_var) {
            ensure_pred_has_value(fort, pred, mt, ensure_assertedP, find_as_subtermP);
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        return (SubLObject)simple_db.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 15712L)
    public static SubLObject ensure_pred_has_value(final SubLObject fort, final SubLObject pred, final SubLObject mt, final SubLObject ensure_assertedP, final SubLObject find_as_subtermP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject foundP = (SubLObject)simple_db.NIL;
            SubLObject found_assertedP = (SubLObject)simple_db.NIL;
            if (simple_db.NIL != find_as_subtermP) {
                if (simple_db.NIL != kb_mapping_macros.do_term_index_key_validator(fort, (SubLObject)simple_db.$kw93$GAF)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(fort, (SubLObject)simple_db.$kw93$GAF);
                    SubLObject done_var = (SubLObject)simple_db.NIL;
                    final SubLObject token_var = (SubLObject)simple_db.NIL;
                    while (simple_db.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (simple_db.NIL != valid) {
                            SubLObject final_index_iterator = (SubLObject)simple_db.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)simple_db.$kw93$GAF, (SubLObject)simple_db.NIL, (SubLObject)simple_db.NIL);
                                SubLObject done_var_$31 = (SubLObject)simple_db.NIL;
                                final SubLObject token_var_$32 = (SubLObject)simple_db.NIL;
                                while (simple_db.NIL == done_var_$31) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$32);
                                    final SubLObject valid_$33 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$32.eql(gaf));
                                    if (simple_db.NIL != valid_$33 && simple_db.NIL != kb_mapping_macros.do_term_index_assertion_match_p(gaf, final_index_spec) && pred.eql(assertions_high.gaf_predicate(gaf))) {
                                        foundP = (SubLObject)simple_db.T;
                                        if (simple_db.NIL != assertions_high.asserted_assertionP(gaf)) {
                                            found_assertedP = (SubLObject)simple_db.T;
                                        }
                                    }
                                    done_var_$31 = (SubLObject)SubLObjectFactory.makeBoolean(simple_db.NIL == valid_$33);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_db.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (simple_db.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(simple_db.NIL == valid);
                    }
                }
            }
            else if (simple_db.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, (SubLObject)simple_db.NIL, pred)) {
                final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, (SubLObject)simple_db.NIL, pred);
                SubLObject done_var2 = (SubLObject)simple_db.NIL;
                final SubLObject token_var2 = (SubLObject)simple_db.NIL;
                while (simple_db.NIL == done_var2) {
                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                    final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                    if (simple_db.NIL != valid2) {
                        SubLObject final_index_iterator2 = (SubLObject)simple_db.NIL;
                        try {
                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)simple_db.$kw93$GAF, (SubLObject)simple_db.NIL, (SubLObject)simple_db.NIL);
                            SubLObject done_var_$32 = (SubLObject)simple_db.NIL;
                            final SubLObject token_var_$33 = (SubLObject)simple_db.NIL;
                            while (simple_db.NIL == done_var_$32) {
                                final SubLObject gaf2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$33);
                                final SubLObject valid_$34 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$33.eql(gaf2));
                                if (simple_db.NIL != valid_$34) {
                                    foundP = (SubLObject)simple_db.T;
                                    if (simple_db.NIL != assertions_high.asserted_assertionP(gaf2)) {
                                        found_assertedP = (SubLObject)simple_db.T;
                                    }
                                }
                                done_var_$32 = (SubLObject)SubLObjectFactory.makeBoolean(simple_db.NIL == valid_$34);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_db.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                if (simple_db.NIL != final_index_iterator2) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                }
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                            }
                        }
                    }
                    done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(simple_db.NIL == valid2);
                }
            }
            if (simple_db.NIL != ensure_assertedP) {
                if (simple_db.NIL == found_assertedP) {
                    note_simple_db_validation_problem(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(fort), new SubLObject[] { simple_db.$str101$_is_missing_an_asserted_value_for, format_nil.format_nil_a_no_copy(pred), simple_db.$str51$_in_, format_nil.format_nil_a_no_copy(mt) }));
                }
            }
            else if (simple_db.NIL == foundP) {
                note_simple_db_validation_problem(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(fort), new SubLObject[] { simple_db.$str102$_is_missing_a_value_for_, format_nil.format_nil_a_no_copy(pred), simple_db.$str51$_in_, format_nil.format_nil_a_no_copy(mt) }));
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)simple_db.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/modeling-tools/schema-validator/simple-db.lisp", position = 16769L)
    public static SubLObject convert_simple_sksi_db_to_complex(final SubLObject sks, SubLObject v_properties) {
        if (v_properties == simple_db.UNPROVIDED) {
            v_properties = (SubLObject)simple_db.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        v_properties = list_utilities.merge_plist(v_properties, simple_db.$convert_simple_sksi_db_to_complex_override_properties$.getDynamicValue(thread));
        final SubLObject repropagateP = conses_high.getf(v_properties, (SubLObject)simple_db.$kw103$REPROPAGATE_, (SubLObject)simple_db.UNPROVIDED);
        if (simple_db.NIL != repropagateP) {
            SubLObject times;
            SubLObject n;
            for (times = (SubLObject)((simple_db.NIL != subl_promotions.positive_integer_p(repropagateP)) ? repropagateP : simple_db.ONE_INTEGER), n = (SubLObject)simple_db.NIL, n = (SubLObject)simple_db.ZERO_INTEGER; n.numL(times); n = Numbers.add(n, (SubLObject)simple_db.ONE_INTEGER)) {
                repropagate_simple_db(sks);
            }
        }
        final SubLObject simple_assertions_queue = queues.create_queue((SubLObject)simple_db.UNPROVIDED);
        SubLObject simple_assertions_checked_count = (SubLObject)simple_db.ZERO_INTEGER;
        SubLObject complex_assertions_asserted_count = (SubLObject)simple_db.ZERO_INTEGER;
        SubLObject simple_assertions_removed_count = (SubLObject)simple_db.ZERO_INTEGER;
        SubLObject processed_simple_assertions = (SubLObject)simple_db.NIL;
        SubLObject complex_assertions_to_assert = (SubLObject)simple_db.NIL;
        queues.enqueue_all(simple_sksi_assertions_for_sks(sks), simple_assertions_queue);
        final SubLObject str = Sequences.cconcatenate((SubLObject)simple_db.$str104$Processing_, new SubLObject[] { format_nil.format_nil_a_no_copy(queues.queue_size(simple_assertions_queue)), simple_db.$str105$__seed__simple_sksi_assertions_fo, format_nil.format_nil_a_no_copy(sks) });
        SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
        SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
        SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
        SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
        SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
        SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
        SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
        SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
            utilities_macros.$progress_notification_count$.bind((SubLObject)simple_db.ZERO_INTEGER, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)simple_db.ZERO_INTEGER, thread);
            utilities_macros.$progress_count$.bind((SubLObject)simple_db.ZERO_INTEGER, thread);
            utilities_macros.$is_noting_progressP$.bind((SubLObject)simple_db.T, thread);
            utilities_macros.$silent_progressP$.bind((SubLObject)((simple_db.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : simple_db.T), thread);
            utilities_macros.noting_progress_preamble(str);
            while (simple_db.NIL != queues.queue_not_empty_p(simple_assertions_queue)) {
                final SubLObject simple_assertion = queues.dequeue(simple_assertions_queue);
                simple_assertions_checked_count = Numbers.add(simple_assertions_checked_count, (SubLObject)simple_db.ONE_INTEGER);
                processed_simple_assertions = (SubLObject)ConsesLow.cons(simple_assertion, processed_simple_assertions);
                final SubLObject set_contents_var = assertions_high.assertion_dependents(simple_assertion);
                SubLObject basis_object;
                SubLObject state;
                SubLObject deduction;
                SubLObject dependent_assertion;
                SubLObject item_var;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)simple_db.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); simple_db.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    deduction = set_contents.do_set_contents_next(basis_object, state);
                    if (simple_db.NIL != set_contents.do_set_contents_element_validP(state, deduction)) {
                        dependent_assertion = deductions_high.deduction_supported_object(deduction);
                        if (simple_db.NIL != assertion_handles.assertion_p(dependent_assertion)) {
                            if (simple_db.NIL == subl_promotions.memberP(dependent_assertion, processed_simple_assertions, (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED)) {
                                if (simple_db.NIL != simple_sksi_assertionP(dependent_assertion)) {
                                    queues.enqueue(dependent_assertion, simple_assertions_queue);
                                }
                                else if (simple_db.NIL == assertions_high.asserted_assertionP(dependent_assertion)) {
                                    item_var = dependent_assertion;
                                    if (simple_db.NIL == conses_high.member(item_var, complex_assertions_to_assert, Symbols.symbol_function((SubLObject)simple_db.EQL), Symbols.symbol_function((SubLObject)simple_db.IDENTITY))) {
                                        complex_assertions_to_assert = (SubLObject)ConsesLow.cons(item_var, complex_assertions_to_assert);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            PrintLow.format((SubLObject)simple_db.T, (SubLObject)simple_db.$str106$___A_simple_sksi_assertions_check, simple_assertions_checked_count);
            utilities_macros.noting_progress_postamble();
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
            utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
            utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
        }
        if (simple_db.NIL != conses_high.getf(v_properties, (SubLObject)simple_db.$kw107$VERBOSE_, (SubLObject)simple_db.UNPROVIDED)) {
            SubLObject cdolist_list_var = complex_assertions_to_assert;
            SubLObject a = (SubLObject)simple_db.NIL;
            a = cdolist_list_var.first();
            while (simple_db.NIL != cdolist_list_var) {
                PrintLow.format((SubLObject)simple_db.T, (SubLObject)simple_db.$str108$___S_in__S__, uncanonicalizer.assertion_el_formula(a), assertions_high.assertion_mt(a));
                cdolist_list_var = cdolist_list_var.rest();
                a = cdolist_list_var.first();
            }
            cdolist_list_var = processed_simple_assertions;
            a = (SubLObject)simple_db.NIL;
            a = cdolist_list_var.first();
            while (simple_db.NIL != cdolist_list_var) {
                PrintLow.format((SubLObject)simple_db.T, (SubLObject)simple_db.$str109$___S_in__S__, uncanonicalizer.assertion_el_formula(a), assertions_high.assertion_mt(a));
                cdolist_list_var = cdolist_list_var.rest();
                a = cdolist_list_var.first();
            }
        }
        if (simple_db.NIL != conses_high.getf(v_properties, (SubLObject)simple_db.$kw110$READ_ONLY_, (SubLObject)simple_db.UNPROVIDED)) {
            return (SubLObject)simple_db.NIL;
        }
        final SubLObject list_var = complex_assertions_to_assert;
        _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)((simple_db.NIL != Sequences.cconcatenate((SubLObject)simple_db.$str111$Adding_asserted_arguments_to_, new SubLObject[] { format_nil.format_nil_a_no_copy(Sequences.length(complex_assertions_to_assert)), simple_db.$str112$_complex_sksi_assertions_for_, format_nil.format_nil_a_no_copy(sks) })) ? Sequences.cconcatenate((SubLObject)simple_db.$str111$Adding_asserted_arguments_to_, new SubLObject[] { format_nil.format_nil_a_no_copy(Sequences.length(complex_assertions_to_assert)), simple_db.$str112$_complex_sksi_assertions_for_, format_nil.format_nil_a_no_copy(sks) }) : simple_db.$str11$cdolist), thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)simple_db.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)simple_db.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)simple_db.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)simple_db.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject a2 = (SubLObject)simple_db.NIL;
                a2 = csome_list_var.first();
                while (simple_db.NIL != csome_list_var) {
                    ke.ke_assert_now(uncanonicalizer.assertion_el_formula(a2), assertions_high.assertion_mt(a2), assertions_high.assertion_strength(a2), assertions_high.assertion_direction(a2));
                    if (simple_db.NIL != assertions_high.asserted_assertionP(a2)) {
                        complex_assertions_asserted_count = Numbers.add(complex_assertions_asserted_count, (SubLObject)simple_db.ONE_INTEGER);
                    }
                    else {
                        Errors.warn((SubLObject)simple_db.$str113$Assert_failed_for__A, a2);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)simple_db.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    a2 = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_db.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_2, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_0, thread);
        }
        SubLObject simple_assertions_to_kill = (SubLObject)simple_db.NIL;
        SubLObject cdolist_list_var2 = processed_simple_assertions;
        SubLObject a3 = (SubLObject)simple_db.NIL;
        a3 = cdolist_list_var2.first();
        while (simple_db.NIL != cdolist_list_var2) {
            if (simple_db.NIL != assertions_high.assertion_dependents(a3)) {
                simple_assertions_to_kill = (SubLObject)ConsesLow.cons(a3, simple_assertions_to_kill);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            a3 = cdolist_list_var2.first();
        }
        final SubLObject list_var2 = simple_assertions_to_kill;
        final SubLObject _prev_bind_9 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_10 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_11 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_12 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_13 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_14 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_15 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_16 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)((simple_db.NIL != Sequences.cconcatenate((SubLObject)simple_db.$str114$Killing_, new SubLObject[] { format_nil.format_nil_a_no_copy(Sequences.length(processed_simple_assertions)), simple_db.$str115$_simple_sksi_assertions_for_, format_nil.format_nil_a_no_copy(sks) })) ? Sequences.cconcatenate((SubLObject)simple_db.$str114$Killing_, new SubLObject[] { format_nil.format_nil_a_no_copy(Sequences.length(processed_simple_assertions)), simple_db.$str115$_simple_sksi_assertions_for_, format_nil.format_nil_a_no_copy(sks) }) : simple_db.$str11$cdolist), thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(list_var2), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)simple_db.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)simple_db.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)simple_db.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)simple_db.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var2 = list_var2;
                SubLObject a4 = (SubLObject)simple_db.NIL;
                a4 = csome_list_var2.first();
                while (simple_db.NIL != csome_list_var2) {
                    if (simple_db.NIL != assertion_handles.valid_assertionP(a4, (SubLObject)simple_db.UNPROVIDED)) {
                        if (simple_db.NIL != assertion_utilities.gaf_assertion_with_pred_p(a4, simple_db.$const116$isa) && simple_db.NIL != kb_utilities.kbeq(assertions_high.gaf_arg2(a4), simple_db.$const0$SimpleDatabase)) {
                            ke.ke_assert_now(el_utilities.make_binary_formula(simple_db.$const116$isa, assertions_high.gaf_arg1(a4), simple_db.$const117$Database_Physical), assertions_high.assertion_mt(a4), (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED);
                            ke.ke_assert_now(el_utilities.make_binary_formula(simple_db.$const116$isa, assertions_high.gaf_arg1(a4), simple_db.$const118$StructuredKnowledgeSource_TopLeve), assertions_high.assertion_mt(a4), (SubLObject)simple_db.UNPROVIDED, (SubLObject)simple_db.UNPROVIDED);
                            complex_assertions_asserted_count = Numbers.add(complex_assertions_asserted_count, (SubLObject)simple_db.TWO_INTEGER);
                        }
                        simple_assertions_removed_count = Numbers.add(simple_assertions_removed_count, (SubLObject)simple_db.ONE_INTEGER);
                        ke.ke_unassert_assertion_now(a4);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)simple_db.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var2 = csome_list_var2.rest();
                    a4 = csome_list_var2.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)simple_db.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$40, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_16, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_15, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_13, thread);
            utilities_macros.$progress_sofar$.rebind(_prev_bind_12, thread);
            utilities_macros.$progress_total$.rebind(_prev_bind_11, thread);
            utilities_macros.$progress_start_time$.rebind(_prev_bind_10, thread);
            utilities_macros.$progress_note$.rebind(_prev_bind_9, thread);
        }
        return Values.values(complex_assertions_asserted_count, simple_assertions_removed_count);
    }
    
    public static SubLObject declare_simple_db_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "simple_sksi_dbP", "SIMPLE-SKSI-DB?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "clear_simple_sksi_terms", "CLEAR-SIMPLE-SKSI-TERMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "remove_simple_sksi_terms", "REMOVE-SIMPLE-SKSI-TERMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "simple_sksi_terms_internal", "SIMPLE-SKSI-TERMS-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "simple_sksi_terms", "SIMPLE-SKSI-TERMS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "simple_sksi_termP", "SIMPLE-SKSI-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "simple_sksi_assertions_for_term", "SIMPLE-SKSI-ASSERTIONS-FOR-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "clear_simple_sksi_assertions_for_sks", "CLEAR-SIMPLE-SKSI-ASSERTIONS-FOR-SKS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "remove_simple_sksi_assertions_for_sks", "REMOVE-SIMPLE-SKSI-ASSERTIONS-FOR-SKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "simple_sksi_assertions_for_sks_internal", "SIMPLE-SKSI-ASSERTIONS-FOR-SKS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "simple_sksi_assertions_for_sks", "SIMPLE-SKSI-ASSERTIONS-FOR-SKS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "simple_sksi_assertionP", "SIMPLE-SKSI-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "repropagate_knowledge_source", "REPROPAGATE-KNOWLEDGE-SOURCE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "repropagate_simple_db", "REPROPAGATE-SIMPLE-DB", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "ensure_simple_db_valid", "ENSURE-SIMPLE-DB-VALID", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "validate_simple_db", "VALIDATE-SIMPLE-DB", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "validate_simple_table", "VALIDATE-SIMPLE-TABLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "ensure_all_fields_are_listed", "ENSURE-ALL-FIELDS-ARE-LISTED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "ensure_temporal_or_atemporal_table", "ENSURE-TEMPORAL-OR-ATEMPORAL-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "validate_simple_physical_schema", "VALIDATE-SIMPLE-PHYSICAL-SCHEMA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "validate_simple_logical_schema", "VALIDATE-SIMPLE-LOGICAL-SCHEMA", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "validate_simple_logical_field_indexical", "VALIDATE-SIMPLE-LOGICAL-FIELD-INDEXICAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "ensure_field_decoding_has_code_mappings", "ENSURE-FIELD-DECODING-HAS-CODE-MAPPINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "cmls_fn_nart_p", "CMLS-FN-NART-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "note_simple_db_validation_problem", "NOTE-SIMPLE-DB-VALIDATION-PROBLEM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "ensure_preds_have_deduced_values", "ENSURE-PREDS-HAVE-DEDUCED-VALUES", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "ensure_preds_have_values", "ENSURE-PREDS-HAVE-VALUES", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "ensure_pred_has_value", "ENSURE-PRED-HAS-VALUE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.modeling_tools.schema_validator.simple_db", "convert_simple_sksi_db_to_complex", "CONVERT-SIMPLE-SKSI-DB-TO-COMPLEX", 1, 1, false);
        return (SubLObject)simple_db.NIL;
    }
    
    public static SubLObject init_simple_db_file() {
        simple_db.$simple_sksi_terms_caching_state$ = SubLFiles.deflexical("*SIMPLE-SKSI-TERMS-CACHING-STATE*", (SubLObject)simple_db.NIL);
        simple_db.$simple_sksi_assertions_for_sks_caching_state$ = SubLFiles.deflexical("*SIMPLE-SKSI-ASSERTIONS-FOR-SKS-CACHING-STATE*", (SubLObject)simple_db.NIL);
        simple_db.$sksi_transcript_source_repropagationP$ = SubLFiles.defparameter("*SKSI-TRANSCRIPT-SOURCE-REPROPAGATION?*", (SubLObject)simple_db.T);
        simple_db.$simplified_sksi_predicates$ = SubLFiles.deflexical("*SIMPLIFIED-SKSI-PREDICATES*", (SubLObject)simple_db.$list18);
        simple_db.$simple_db_validation_problems$ = SubLFiles.defparameter("*SIMPLE-DB-VALIDATION-PROBLEMS*", (SubLObject)simple_db.$kw19$UNINITIALIZED);
        simple_db.$convert_simple_sksi_db_to_complex_override_properties$ = SubLFiles.defparameter("*CONVERT-SIMPLE-SKSI-DB-TO-COMPLEX-OVERRIDE-PROPERTIES*", (SubLObject)simple_db.NIL);
        return (SubLObject)simple_db.NIL;
    }
    
    public static SubLObject setup_simple_db_file() {
        memoization_state.note_globally_cached_function((SubLObject)simple_db.$sym1$SIMPLE_SKSI_TERMS);
        memoization_state.note_globally_cached_function((SubLObject)simple_db.$sym9$SIMPLE_SKSI_ASSERTIONS_FOR_SKS);
        return (SubLObject)simple_db.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_simple_db_file();
    }
    
    @Override
	public void initializeVariables() {
        init_simple_db_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_simple_db_file();
    }
    
    static {
        me = (SubLFile)new simple_db();
        simple_db.$simple_sksi_terms_caching_state$ = null;
        simple_db.$simple_sksi_assertions_for_sks_caching_state$ = null;
        simple_db.$sksi_transcript_source_repropagationP$ = null;
        simple_db.$simplified_sksi_predicates$ = null;
        simple_db.$simple_db_validation_problems$ = null;
        simple_db.$convert_simple_sksi_db_to_complex_override_properties$ = null;
        $const0$SimpleDatabase = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SimpleDatabase"));
        $sym1$SIMPLE_SKSI_TERMS = SubLObjectFactory.makeSymbol("SIMPLE-SKSI-TERMS");
        $const2$TestPace = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestPace"));
        $kw3$NEG = SubLObjectFactory.makeKeyword("NEG");
        $const4$SimplifiedSKSIConstant = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SimplifiedSKSIConstant"));
        $sym5$_SIMPLE_SKSI_TERMS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SIMPLE-SKSI-TERMS-CACHING-STATE*");
        $sym6$CLEAR_SIMPLE_SKSI_TERMS = SubLObjectFactory.makeSymbol("CLEAR-SIMPLE-SKSI-TERMS");
        $sym7$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const8$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $sym9$SIMPLE_SKSI_ASSERTIONS_FOR_SKS = SubLObjectFactory.makeSymbol("SIMPLE-SKSI-ASSERTIONS-FOR-SKS");
        $str10$Gathering_simple_SKSI_assertions_ = SubLObjectFactory.makeString("Gathering simple SKSI assertions in ");
        $str11$cdolist = SubLObjectFactory.makeString("cdolist");
        $sym12$_SIMPLE_SKSI_ASSERTIONS_FOR_SKS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SIMPLE-SKSI-ASSERTIONS-FOR-SKS-CACHING-STATE*");
        $sym13$CLEAR_SIMPLE_SKSI_ASSERTIONS_FOR_SKS = SubLObjectFactory.makeSymbol("CLEAR-SIMPLE-SKSI-ASSERTIONS-FOR-SKS");
        $sym14$SIMPLE_SKSI_TERM_ = SubLObjectFactory.makeSymbol("SIMPLE-SKSI-TERM?");
        $sym15$SK_SOURCE_IN_ANY_MT_P = SubLObjectFactory.makeSymbol("SK-SOURCE-IN-ANY-MT-P");
        $sym16$MICROTHEORY_P = SubLObjectFactory.makeSymbol("MICROTHEORY-P");
        $str17$Repropagating_ = SubLObjectFactory.makeString("Repropagating ");
        $list18 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tableInDBNamed")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("columnInDBTableNamed")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectSchemaTranslation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationshipSchemaTranslation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionSchemaTranslation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tablePrimaryKey-SingleColumn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tablePrimaryKey")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectSchemaColumnPredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionTablePredicateColumn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dBTableArgNumMapping")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dBTablePredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tableFieldNameList")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("identityTranslationColumn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporalTranslationColumns")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dBTableLogicalFieldIndexicalForArgNum")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dBTableTemporalLogicalFieldIndexicals")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalFieldIndexicalTranslationType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dBFieldTranslationInputs")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("predicateAndArgnumForLogicalFieldIndexical")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonContextualizedMeaningSentence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("schemaFieldNameList")) });
        $kw19$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("LOOKS-GOOD"));
        $str21$Simple_DB_invalid___s = SubLObjectFactory.makeString("Simple DB invalid: ~s");
        $str22$Validating__a_____ = SubLObjectFactory.makeString("Validating ~a...~%");
        $str23$DB_was_not_simple__returning__loo = SubLObjectFactory.makeString("DB was not simple, returning :looks-good anyway");
        $list24 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")));
        $const25$SKSIMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSIMt"));
        $list26 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mappingMt")));
        $str27$Using_mapping_mt__a__ = SubLObjectFactory.makeString("Using mapping mt ~a~%");
        $list28 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("structuredKnowledgeSourceName")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("userNameForSKS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("passwordForSKS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("serverOfSKS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("portNumberForSKS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksProxyHost")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sksProxyPort")));
        $list29 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subProtocolForSKS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sqlProgramForSKS")));
        $str30$_is_not___sksRepresentationComple = SubLObjectFactory.makeString(" is not #$sksRepresentationComplete");
        $str31$could_not_find_any_tables_in_ = SubLObjectFactory.makeString("could not find any tables in ");
        $str32$in_mappingMt_ = SubLObjectFactory.makeString("in mappingMt ");
        $list33 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tableInDBNamed")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tableFieldNameList")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("contentMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("physicalSchemaWithNameForKS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalSchemaWithNameForKS")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("columnInDBTableNamed")));
        $const34$schemaTranslation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("schemaTranslation"));
        $kw35$DEPTH = SubLObjectFactory.makeKeyword("DEPTH");
        $kw36$STACK = SubLObjectFactory.makeKeyword("STACK");
        $kw37$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $sym38$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw39$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str40$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym41$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw42$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str43$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw44$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str45$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const46$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $str47$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str48$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str49$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $str50$no___schemaTranslation_for_ = SubLObjectFactory.makeString("no #$schemaTranslation for ");
        $str51$_in_ = SubLObjectFactory.makeString(" in ");
        $const52$objectSchemaTranslation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectSchemaTranslation"));
        $list53 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tablePrimaryKey-SingleColumn")));
        $const54$objectSchemaColumnPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectSchemaColumnPredicate"));
        $const55$columnInDBTableNamed = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("columnInDBTableNamed"));
        $str56$expected_at_least_2_columns__via_ = SubLObjectFactory.makeString("expected at least 2 columns (via #$columnInDBTableNamed) in ");
        $str57$__got_ = SubLObjectFactory.makeString(", got ");
        $str58$no_columns__via___columnInDBTable = SubLObjectFactory.makeString("no columns (via #$columnInDBTableNamed) in ");
        $str59$_have_an___objectSchemaColumnPred = SubLObjectFactory.makeString(" have an #$objectSchemaColumnPredicate");
        $const60$relationshipSchemaTranslation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationshipSchemaTranslation"));
        $list61 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dBTablePredicate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dBTableArgNumMapping")));
        $const62$assertionSchemaTranslation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionSchemaTranslation"));
        $list63 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionTablePredicateColumn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dBTableArgNumMapping")));
        $const64$DatabaseColumn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DatabaseColumn"));
        $str65$_is_not_a___DatabaseColumn__argum = SubLObjectFactory.makeString(" is not a #$DatabaseColumn (argument to #$dBTableArgNumMapping for ");
        $str66$_ = SubLObjectFactory.makeString(")");
        $list67 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("identityTranslationColumn")));
        $const68$dBTableArgNumMapping = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dBTableArgNumMapping"));
        $str69$unexpected_schema_translation_pre = SubLObjectFactory.makeString("unexpected schema translation pred ");
        $str70$_for_ = SubLObjectFactory.makeString(" for ");
        $str71$Expected_exactly_one_physical_sch = SubLObjectFactory.makeString("Expected exactly one physical schema for ");
        $str72$__via___physicalSchemaSourceMap__ = SubLObjectFactory.makeString(" (via #$physicalSchemaSourceMap), got ");
        $const73$tableFieldNameList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tableFieldNameList"));
        $kw74$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $str75$Found_column_ = SubLObjectFactory.makeString("Found column ");
        $str76$_not_listed_in___tableFieldNameLi = SubLObjectFactory.makeString(" not listed in #$tableFieldNameList for ");
        $str77$__If_it_is_a_column_in_the_table_ = SubLObjectFactory.makeString(". If it is a column in the table, add it to the #$tableFieldNameList. If not, remove it as a #$columnInDBTableNamed.");
        $const78$NonCanonicallyTemporallyIndexedDB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NonCanonicallyTemporallyIndexedDBTable"));
        $const79$CanonicallyTemporallyIndexedDBTab = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CanonicallyTemporallyIndexedDBTable"));
        $list80 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporalTranslationColumns")));
        $const81$temporalTranslationColumns = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporalTranslationColumns"));
        $str82$Found_no___temporalTranslationCol = SubLObjectFactory.makeString("Found no #$temporalTranslationColumns for ");
        $list83 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("temporalColumnNullMapsTo")));
        $str84$_is_not_known_to_be_a___Canonical = SubLObjectFactory.makeString(" is not known to be a #$CanonicallyTemporallyIndexedDBTable or a #$NonCanonicallyTemporallyIndexedDBTable in ");
        $list85 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("physicalFields")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("physicalFieldIndexicals")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("schemaFieldList")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("primaryKey")));
        $const86$fieldEncoding = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldEncoding"));
        $str87$Expected_exactly_one_logical_sche = SubLObjectFactory.makeString("Expected exactly one logical schema for ");
        $str88$__via___logicalPhysicalSchemaMap_ = SubLObjectFactory.makeString(" (via #$logicalPhysicalSchemaMap), got ");
        $list89 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldDecoding")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalFields")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalFieldIndexicals")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalPhysicalSchemaMap")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalSchemaFieldOfTypeWithMultiplicity")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalSchemaFieldIndexicalOfTypeWithMultiplicity")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalSchemaSourceMap")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nonContextualizedMeaningSentence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("meaningSentenceOfSchema")) });
        $list90 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldDecoding")));
        $sym91$CMLS_FN_NART_P = SubLObjectFactory.makeSymbol("CMLS-FN-NART-P");
        $const92$codeMapping = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("codeMapping"));
        $kw93$GAF = SubLObjectFactory.makeKeyword("GAF");
        $const94$logicalFieldValueWithFieldName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("logicalFieldValueWithFieldName"));
        $str95$Found_no___codeMapping_for_ = SubLObjectFactory.makeString("Found no #$codeMapping for ");
        $str96$__the_indexical_for_the_field_nam = SubLObjectFactory.makeString(", the indexical for the field named ");
        $str97$__Ensure_one_exists_via_either_as = SubLObjectFactory.makeString(". Ensure one exists via either asserting it directly or concluding it via #$synonymousExternalConceptToken.");
        $const98$fieldDecoding = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldDecoding"));
        $const99$CMLSFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CMLSFn"));
        $sym100$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $str101$_is_missing_an_asserted_value_for = SubLObjectFactory.makeString(" is missing an asserted value for ");
        $str102$_is_missing_a_value_for_ = SubLObjectFactory.makeString(" is missing a value for ");
        $kw103$REPROPAGATE_ = SubLObjectFactory.makeKeyword("REPROPAGATE?");
        $str104$Processing_ = SubLObjectFactory.makeString("Processing ");
        $str105$__seed__simple_sksi_assertions_fo = SubLObjectFactory.makeString(" (seed) simple sksi assertions for ");
        $str106$___A_simple_sksi_assertions_check = SubLObjectFactory.makeString("~&~A simple sksi assertions checked~%");
        $kw107$VERBOSE_ = SubLObjectFactory.makeKeyword("VERBOSE?");
        $str108$___S_in__S__ = SubLObjectFactory.makeString("+ ~S in ~S~%");
        $str109$___S_in__S__ = SubLObjectFactory.makeString("- ~S in ~S~%");
        $kw110$READ_ONLY_ = SubLObjectFactory.makeKeyword("READ-ONLY?");
        $str111$Adding_asserted_arguments_to_ = SubLObjectFactory.makeString("Adding asserted arguments to ");
        $str112$_complex_sksi_assertions_for_ = SubLObjectFactory.makeString(" complex sksi assertions for ");
        $str113$Assert_failed_for__A = SubLObjectFactory.makeString("Assert failed for ~A");
        $str114$Killing_ = SubLObjectFactory.makeString("Killing ");
        $str115$_simple_sksi_assertions_for_ = SubLObjectFactory.makeString(" simple sksi assertions for ");
        $const116$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const117$Database_Physical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Database-Physical"));
        $const118$StructuredKnowledgeSource_TopLeve = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StructuredKnowledgeSource-TopLevel"));
    }
}

/*

	Total time: 2712 ms
	
*/