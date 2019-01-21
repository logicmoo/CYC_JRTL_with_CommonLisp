package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.cycjava.cycl.sbhl.sbhl_cache;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.inference.harness.after_adding;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.kb_utilities";
    public static final String myFingerPrint = "5f7103db7f8226e9e87961bd306352915e824f60180ae9fff8f78e1b114d2f63";
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 13003L)
    private static SubLSymbol $estimated_assertions_per_constant$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 13113L)
    private static SubLSymbol $estimated_constants_per_nart$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 13187L)
    private static SubLSymbol $estimated_assertions_per_deduction$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 13261L)
    private static SubLSymbol $estimated_assertions_per_clause_struc$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 13335L)
    private static SubLSymbol $estimated_assertions_per_meta_assertion$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 13409L)
    private static SubLSymbol $estimated_arguments_per_assertion$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 13483L)
    private static SubLSymbol $estimated_assertions_per_unrepresented_term$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 13555L)
    private static SubLSymbol $estimated_deductions_per_hl_support$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 15494L)
    private static SubLSymbol $kb_table_padding_multiplier$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 20002L)
    private static SubLSymbol $default_estimated_constant_count$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 31677L)
    private static SubLSymbol $get_kb_object_managers$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 44989L)
    private static SubLSymbol $sort_terms_constants_by_name$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 45140L)
    private static SubLSymbol $sort_terms_ignore_variable_symbols$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 45204L)
    private static SubLSymbol $sort_terms_by_internal_idP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 51743L)
    private static SubLSymbol $definitional_pred_sort_order$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 53691L)
    public static SubLSymbol $term_order_method_table$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 63779L)
    private static SubLSymbol $cached_term_last_asserted_assertion_date_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 64156L)
    private static SubLSymbol $cached_creation_time_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 64572L)
    private static SubLSymbol $cached_creator_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 81168L)
    private static SubLSymbol $set_to_collection_uses_reformulatorP$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 83442L)
    private static SubLSymbol $cached_union_all_specs_count_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 84667L)
    private static SubLSymbol $forbidden_kb_covering_collection_types$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 84883L)
    private static SubLSymbol $forbidden_kb_covering_quoted_collection_types$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 85121L)
    private static SubLSymbol $forbidden_cols$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 85323L)
    private static SubLSymbol $forbidden_specs$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 89533L)
    private static SubLSymbol $min_each_spec_cardinality$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 90270L)
    private static SubLSymbol $forbidden_kb_covering_collections_set_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 92516L)
    private static SubLSymbol $all_specs_set_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 92721L)
    private static SubLSymbol $all_genls_set_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 121270L)
    private static SubLSymbol $predicate_type_arity_table$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 128626L)
    private static SubLSymbol $coasserted_fort_source$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 128740L)
    private static SubLSymbol $coasserted_fort_set$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 129659L)
    private static SubLSymbol $cached_compact_hl_external_id_string_caching_state$;
    private static final SubLSymbol $kw0$VERBOSE;
    private static final SubLString $str1$__No_KB_is_currently_loaded_;
    private static final SubLSymbol $sym2$DOUBLE_FLOAT;
    private static final SubLString $str3$______KB__A_statistics;
    private static final SubLString $str4$__FORTs______________________9___;
    private static final SubLString $str5$___Constants_________________9___;
    private static final SubLString $str6$____cached_indexing__________9___;
    private static final SubLString $str7$___NARTs_____________________9___;
    private static final SubLString $str8$____cached_HL_formulas_______9___;
    private static final SubLString $str9$__Assertions_________________9___;
    private static final SubLString $str10$___KB_Assertions_____________9___;
    private static final SubLString $str11$____cached___________________9___;
    private static final SubLString $str12$___Bookkeeping_Assertions____9___;
    private static final SubLString $str13$___Virtual_Assertions________9___;
    private static final SubLString $str14$__Deductions_________________9___;
    private static final SubLString $str15$__KB_HL_supports_____________9___;
    private static final SubLString $str16$__Unrepresented_terms________9___;
    private static final SubLString $str17$______KB__A_content_statistics;
    private static final SubLString $str18$__Terms______________9___D;
    private static final SubLString $str19$___Collections_______9___D;
    private static final SubLObject $const20$Collection;
    private static final SubLString $str21$____First_Order______9___D;
    private static final SubLObject $const22$FirstOrderCollection;
    private static final SubLString $str23$____Second_Order_____9___D;
    private static final SubLObject $const24$SecondOrderCollection;
    private static final SubLString $str25$____Third_Order______9___D;
    private static final SubLObject $const26$ThirdOrderCollection;
    private static final SubLString $str27$___Relations_________9___D;
    private static final SubLObject $const28$Relation;
    private static final SubLString $str29$____Functions________9___D;
    private static final SubLObject $const30$Function_Denotational;
    private static final SubLString $str31$____Predicates_______9___D;
    private static final SubLObject $const32$Predicate;
    private static final SubLString $str33$___Microtheories_____9___D;
    private static final SubLObject $const34$Microtheory;
    private static final SubLString $str35$___Individuals_______9___D;
    private static final SubLObject $const36$Individual;
    private static final SubLString $str37$__KB_Assertions______9___D;
    private static final SubLSymbol $kw38$CONSTANT;
    private static final SubLSymbol $kw39$NART;
    private static final SubLSymbol $kw40$ASSERTION;
    private static final SubLSymbol $kw41$DEDUCTION;
    private static final SubLSymbol $kw42$KB_HL_SUPPORT;
    private static final SubLSymbol $kw43$UNPREPRESENTED_TERM;
    private static final SubLList $list44;
    private static final SubLList $list45;
    private static final SubLString $str46$___18_A____9A____9A____9A;
    private static final SubLString $str47$Object_Type;
    private static final SubLString $str48$committed;
    private static final SubLString $str49$swappable;
    private static final SubLString $str50$in_memory;
    private static final SubLString $str51$_________________________________;
    private static final SubLList $list52;
    private static final SubLString $str53$___18_A____9_A____9_A____9_A;
    private static final SubLSymbol $sym54$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const55$EverythingPSC;
    private static final SubLString $str56$Calculating_cardinalities_of_pred;
    private static final SubLString $str57$cdolist;
    private static final SubLSymbol $kw58$GAF;
    private static final SubLSymbol $sym59$_;
    private static final SubLSymbol $sym60$CDR;
    private static final SubLSymbol $kw61$MT;
    private static final SubLSymbol $kw62$BROAD_MT;
    private static final SubLString $str63$do_broad_mt_index;
    private static final SubLSymbol $sym64$STRINGP;
    private static final SubLSymbol $kw65$SKIP;
    private static final SubLObject $const66$isa;
    private static final SubLSymbol $kw67$BREADTH;
    private static final SubLSymbol $kw68$QUEUE;
    private static final SubLSymbol $kw69$STACK;
    private static final SubLSymbol $sym70$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw71$ERROR;
    private static final SubLString $str72$_A_is_not_a__A;
    private static final SubLSymbol $sym73$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw74$CERROR;
    private static final SubLString $str75$continue_anyway;
    private static final SubLSymbol $kw76$WARN;
    private static final SubLString $str77$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str78$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str79$attempting_to_bind_direction_link;
    private static final SubLList $list80;
    private static final SubLString $str81$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLSymbol $sym82$RELEVANT_MT_IS_IN_LIST;
    private static final SubLSymbol $kw83$TRUE;
    private static final SubLSymbol $sym84$_;
    private static final SubLSymbol $sym85$_;
    private static final SubLFloat $float86$17_1;
    private static final SubLFloat $float87$1_41;
    private static final SubLFloat $float88$2_67;
    private static final SubLFloat $float89$39_3;
    private static final SubLFloat $float90$30_3;
    private static final SubLFloat $float91$1_12;
    private static final SubLFloat $float92$7_97;
    private static final SubLFloat $float93$1_05;
    private static final SubLInteger $int94$1000;
    private static final SubLInteger $int95$50000;
    private static final SubLSymbol $sym96$INIT_CONSTANT;
    private static final SubLSymbol $sym97$SHOW_NEW_KB_STATE;
    private static final SubLString $str98$______KB__S_new_KB_objects__;
    private static final SubLString $str99$__New_FORTs__________________9___;
    private static final SubLString $str100$___New_Constants_____________9___;
    private static final SubLString $str101$___New_NARTs_________________9___;
    private static final SubLString $str102$__New_Assertions_____________9___;
    private static final SubLString $str103$__New_Deductions_____________9___;
    private static final SubLString $str104$__New_KB_HL_Supports_________9___;
    private static final SubLString $str105$__New_Unrepresented_Terms____9___;
    private static final SubLSymbol $sym106$CLEAR_NEW_KB_STATE;
    private static final SubLSymbol $sym107$SHOW_NEW_KB_CONTENT;
    private static final SubLList $list108;
    private static final SubLString $str109$__Recent_constants___;
    private static final SubLString $str110$mapping_constants_for_sweep;
    private static final SubLString $str111$_____S__;
    private static final SubLString $str112$__Recent_NARTs___;
    private static final SubLString $str113$mapping_narts_for_sweep;
    private static final SubLString $str114$__Recent_assertions___;
    private static final SubLString $str115$mapping_assertions_for_sweep;
    private static final SubLString $str116$__Recent_deductions___;
    private static final SubLString $str117$mapping_deductions_for_sweep;
    private static final SubLSymbol $kw118$KB_HL_SUPPORTS;
    private static final SubLString $str119$__Recent_KB_HL_supports___;
    private static final SubLString $str120$mapping_kb_hl_supports_for_sweep;
    private static final SubLString $str121$__;
    private static final SubLString $str122$Cyc_Structures___;
    private static final SubLString $str123$__;
    private static final SubLString $str124$__Problem_stores___A_A___A_infere;
    private static final SubLString $str125$_problem_stores___A_A__inferences;
    private static final SubLSymbol $kw126$PROBLEM_STORES;
    private static final SubLSymbol $kw127$FORWARD_PROBLEM_STORES;
    private static final SubLString $str128$__;
    private static final SubLString $str129$_forward_;
    private static final SubLString $str130$;
    private static final SubLSymbol $kw131$INFERENCES;
    private static final SubLSymbol $kw132$PROOFS;
    private static final SubLSymbol $kw133$PROBLEMS;
    private static final SubLString $str134$__KB_Objects_swapped_in___A__;
    private static final SubLString $str135$_____kb_objects_swapped_in___A_;
    private static final SubLSymbol $kw136$KB_OBJECTS_IN_MEMORY;
    private static final SubLString $str137$__Ephemeral_terms___A__;
    private static final SubLString $str138$_ephemeral_terms___A_;
    private static final SubLSymbol $kw139$EPHEMERAL_TERMS;
    private static final SubLSymbol $kw140$SBHL_CACHE_MISSES;
    private static final SubLString $str141$__SBHL_cache_misses_hash_table___;
    private static final SubLString $str142$_sbhl_cache_misses___A_;
    private static final SubLSymbol $sym143$PRINT_SBHL_CACHE_MISSES_TOP_N;
    private static final SubLString $str144$__Global_cache_entries___A__;
    private static final SubLString $str145$_global_cache_entries___A__;
    private static final SubLSymbol $kw146$GLOBAL_CACHE_ENTRIES;
    private static final SubLSymbol $kw147$UNDESTROYED_ITEMS;
    private static final SubLSymbol $kw148$FORWARD_INFERENCE_METRICS;
    private static final SubLString $str149$____;
    private static final SubLString $str150$__Undestroyed_items___A__;
    private static final SubLString $str151$_undestroyed_items___A;
    private static final SubLString $str152$_;
    private static final SubLString $str153$__Forward_inference_metrics___A__;
    private static final SubLString $str154$_forward_metrics___A;
    private static final SubLSymbol $sym155$PROBLEM_STORE_FORWARD_;
    private static final SubLSymbol $sym156$_;
    private static final SubLSymbol $sym157$PROBLEM_STORE_PROBLEM_COUNT;
    private static final SubLSymbol $sym158$PROBLEM_STORE_PROOF_COUNT;
    private static final SubLSymbol $sym159$CACHING_STATE_SIZE_ROBUST;
    private static final SubLSymbol $sym160$DELAYED_PROCESSOR_QUEUE_SIZE;
    private static final SubLString $str161$BEFORE___;
    private static final SubLInteger $int162$10000;
    private static final SubLString $str163$Performing_full_GC;
    private static final SubLString $str164$AFTER___;
    private static final SubLSymbol $kw165$UNINITIALIZED;
    private static final SubLString $str166$Unable_to_initialize__A__;
    private static final SubLSymbol $kw167$LOCKER;
    private static final SubLSymbol $kw168$WAITER;
    private static final SubLString $str169$__lock_hog___A__writer__S_waiters;
    private static final SubLString $str170$__lock_hog___A__locker__S___;
    private static final SubLInteger $int171$212;
    private static final SubLInteger $int172$100;
    private static final SubLList $list173;
    private static final SubLSymbol $sym174$KB_CHECKPOINT_P;
    private static final SubLList $list175;
    private static final SubLSymbol $sym176$THEORY_CHECKPOINT_P;
    private static final SubLSymbol $sym177$HL_INTERNAL_ID_STRING_P;
    private static final SubLSymbol $sym178$COMPACT_HL_INTERNAL_ID_STRING_P;
    private static final SubLSymbol $sym179$HL_INTERNAL_ID_STRING;
    private static final SubLSymbol $sym180$COMPACT_HL_INTERNAL_ID_STRING;
    private static final SubLSymbol $sym181$FIND_OBJECT_BY_HL_INTERNAL_ID_STRING;
    private static final SubLSymbol $kw182$HEX;
    private static final SubLSymbol $sym183$FIND_OBJECT_BY_COMPACT_HL_INTERNAL_ID_STRING;
    private static final SubLSymbol $kw184$64;
    private static final SubLSymbol $sym185$MAYBE_FIND_OBJECT_BY_HL_INTERNAL_ID_STRING;
    private static final SubLSymbol $sym186$MAYBE_FIND_OBJECT_BY_COMPACT_HL_INTERNAL_ID_STRING;
    private static final SubLSymbol $sym187$HL_EXTERNAL_ID_STRING_P;
    private static final SubLSymbol $sym188$COMPACT_HL_EXTERNAL_ID_STRING_P;
    private static final SubLSymbol $sym189$COMPACT_HL_EXTERNAL_ID_STRING_;
    private static final SubLSymbol $kw190$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym191$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $sym192$_EXIT;
    private static final SubLSymbol $sym193$COMPACT_HL_EXTERNAL_ID_STRING_;
    private static final SubLSymbol $sym194$HL_EXTERNAL_ID_STRING;
    private static final SubLSymbol $sym195$COMPACT_HL_EXTERNAL_ID_STRING;
    private static final SubLSymbol $sym196$FIND_OBJECT_BY_HL_EXTERNAL_ID_STRING;
    private static final SubLSymbol $sym197$FIND_CYCL_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING;
    private static final SubLString $str198$Invalid_hl_external_id____A____fo;
    private static final SubLSymbol $sym199$FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING;
    private static final SubLSymbol $sym200$MAYBE_FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING;
    private static final SubLString $str201$invalid_mode__S;
    private static final SubLSymbol $sym202$INVALID_HL_OBJECT_P;
    private static final SubLString $str203$an_unnamed_constant;
    private static final SubLString $str204$_a;
    private static final SubLSymbol $sym205$STABLE_SORT;
    private static final SubLSymbol $sym206$SORT;
    private static final SubLSymbol $sym207$FORM_SORT_PRED;
    private static final SubLSymbol $sym208$FORT_P;
    private static final SubLSymbol $sym209$FORT__;
    private static final SubLList $list210;
    private static final SubLInteger $int211$256;
    private static final SubLSymbol $sym212$TERM_ORDER_ASSERTION_METHOD;
    private static final SubLSymbol $sym213$TERM_ORDER_CONS_METHOD;
    private static final SubLInteger $int214$500;
    private static final SubLSymbol $sym215$VALUES;
    private static final SubLSymbol $sym216$TERM_SIMILARITY_METRIC_GENERALIZATIONS;
    private static final SubLSymbol $kw217$ALL;
    private static final SubLSymbol $sym218$NON_NEGATIVE_INTEGER_P;
    private static final SubLSymbol $sym219$VECTOR;
    private static final SubLString $str220$cdotimes;
    private static final SubLSymbol $sym221$INTEGERP;
    private static final SubLString $str222$examining_creation_times_by__S;
    private static final SubLString $str223$examining_all_creation_times;
    private static final SubLSymbol $sym224$TERM__;
    private static final SubLSymbol $sym225$CONSTANT_NAME;
    private static final SubLSymbol $sym226$CREATION_TIME__;
    private static final SubLSymbol $sym227$CREATOR__;
    private static final SubLSymbol $sym228$FIND_GROUND_NAUT;
    private static final SubLSymbol $sym229$TERM_OF_UNIT;
    private static final SubLString $str230$examining_assertion_timestamps;
    private static final SubLSymbol $sym231$ASSERTION_CNF;
    private static final SubLSymbol $sym232$ASSERT_DATE__;
    private static final SubLSymbol $sym233$ASSERT_CYCLIST__;
    private static final SubLSymbol $sym234$ASSERT_TIMESTAMP__;
    private static final SubLSymbol $sym235$TERM_LAST_ASSERTED_ASSERTION_DATE;
    private static final SubLSymbol $sym236$CACHED_TERM_LAST_ASSERTED_ASSERTION_DATE;
    private static final SubLSymbol $sym237$_CACHED_TERM_LAST_ASSERTED_ASSERTION_DATE_CACHING_STATE_;
    private static final SubLSymbol $sym238$CACHED_CREATION_TIME;
    private static final SubLSymbol $sym239$_CACHED_CREATION_TIME_CACHING_STATE_;
    private static final SubLInteger $int240$512;
    private static final SubLInteger $int241$200;
    private static final SubLSymbol $sym242$CACHED_CREATOR;
    private static final SubLSymbol $sym243$_CACHED_CREATOR_CACHING_STATE_;
    private static final SubLString $str244$searching_for_probably_most_recen;
    private static final SubLString $str245$Gathering_all_constants;
    private static final SubLString $str246$Gathering_all_narts;
    private static final SubLString $str247$Gathering_all_forts;
    private static final SubLString $str248$Gathering_all_deductions;
    private static final SubLString $str249$Gathering_all_KB_HL_supports;
    private static final SubLString $str250$Gathering_all_assertions;
    private static final SubLString $str251$Gathering_all_gafs;
    private static final SubLString $str252$Gathering_all_forward_gafs;
    private static final SubLString $str253$Gathering_all_backward_gafs;
    private static final SubLString $str254$Gathering_all_rules;
    private static final SubLString $str255$Gathering_all_forward_rules;
    private static final SubLString $str256$Gathering_all_backward_rules;
    private static final SubLSymbol $sym257$DEDUCED_ASSERTION_;
    private static final SubLSymbol $sym258$SAFE__;
    private static final SubLSymbol $sym259$ASSERTED_WHEN;
    private static final SubLList $list260;
    private static final SubLList $list261;
    private static final SubLSymbol $kw262$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw263$KB_CHANGED_MESSAGE;
    private static final SubLSymbol $kw264$KB_UNCHANGED_MESSAGE;
    private static final SubLSymbol $kw265$VERBOSITY;
    private static final SubLSymbol $sym266$KB_OBJECT_COUNT_LIST_1;
    private static final SubLSymbol $sym267$KB_OBJECT_COUNT_LIST_2;
    private static final SubLSymbol $sym268$NEW_CONSTANT_COUNT;
    private static final SubLSymbol $sym269$NEW_NART_COUNT;
    private static final SubLSymbol $sym270$NEW_ASSERTION_COUNT;
    private static final SubLSymbol $sym271$NEW_KB_HL_SUPPORT_COUNT;
    private static final SubLSymbol $sym272$NEW_DEDUCTION_COUNT;
    private static final SubLSymbol $sym273$CLET;
    private static final SubLList $list274;
    private static final SubLSymbol $sym275$KB_OBJECT_COUNT_LISTS_NEW_CONSTANT_COUNT;
    private static final SubLSymbol $sym276$KB_OBJECT_COUNT_LISTS_NEW_NART_COUNT;
    private static final SubLSymbol $sym277$KB_OBJECT_COUNT_LISTS_NEW_ASSERTION_COUNT;
    private static final SubLSymbol $sym278$KB_OBJECT_COUNT_LISTS_NEW_KB_HL_SUPPORT_COUNT;
    private static final SubLSymbol $sym279$KB_OBJECT_COUNT_LISTS_NEW_DEDUCTION_COUNT;
    private static final SubLSymbol $sym280$PCOND;
    private static final SubLList $list281;
    private static final SubLSymbol $sym282$COR;
    private static final SubLSymbol $sym283$NON_ZERO_INTEGER_P;
    private static final SubLSymbol $sym284$PWHEN;
    private static final SubLSymbol $sym285$FORMAT;
    private static final SubLString $str286$___A__;
    private static final SubLString $str287$___s_constant_A__A__;
    private static final SubLSymbol $sym288$ABS;
    private static final SubLSymbol $sym289$FIF;
    private static final SubLList $list290;
    private static final SubLList $list291;
    private static final SubLSymbol $sym292$POSITIVE_INTEGER_P;
    private static final SubLList $list293;
    private static final SubLString $str294$___s_nart_A__A__;
    private static final SubLString $str295$___s_assertion_A__A__;
    private static final SubLString $str296$___s_kb_hl_support_A__A__;
    private static final SubLString $str297$___s_deduction_A__A__;
    private static final SubLList $list298;
    private static final SubLString $str299$mapping_Cyc_constants;
    private static final SubLSymbol $kw300$UNKNOWN_SECOND;
    private static final SubLSymbol $sym301$CONSTANT_SORTING_FUNKY__;
    private static final SubLSymbol $sym302$FOURTH;
    private static final SubLSymbol $sym303$SORT_CONSTANTS_BY_SORTING_INFO;
    private static final SubLSymbol $sym304$FIRST;
    private static final SubLSymbol $kw305$UNKNOWN_DATE;
    private static final SubLSymbol $kw306$UNKNOWN_ID;
    private static final SubLList $list307;
    private static final SubLList $list308;
    private static final SubLList $list309;
    private static final SubLList $list310;
    private static final SubLSymbol $kw311$INDEX;
    private static final SubLSymbol $kw312$PREDICATE;
    private static final SubLSymbol $kw313$TRUTH;
    private static final SubLSymbol $kw314$DIRECTION;
    private static final SubLSymbol $kw315$DONE;
    private static final SubLSymbol $sym316$INDEXED_TERMS;
    private static final SubLSymbol $sym317$EXPRESSION_GATHER;
    private static final SubLList $list318;
    private static final SubLSymbol $sym319$INDEXED_TERM_P;
    private static final SubLSymbol $sym320$CPUSH;
    private static final SubLSymbol $sym321$DO_OVERLAP_INDEX;
    private static final SubLSymbol $sym322$CAND;
    private static final SubLSymbol $sym323$NULL;
    private static final SubLSymbol $sym324$ASSERTION_DIRECTION;
    private static final SubLSymbol $sym325$FORMULA_OPERATOR;
    private static final SubLSymbol $sym326$ASSERTION_FORMULA;
    private static final SubLSymbol $sym327$FORMULA_ARG;
    private static final SubLSymbol $sym328$TERM_OCCURS_AS_FORMULA_ARGUMENT;
    private static final SubLList $list329;
    private static final SubLList $list330;
    private static final SubLSymbol $sym331$INDEXED_TERMS;
    private static final SubLList $list332;
    private static final SubLSymbol $sym333$CNOT;
    private static final SubLSymbol $sym334$EXPRESSION_FIND;
    private static final SubLList $list335;
    private static final SubLSymbol $sym336$ASSERTION_MT;
    private static final SubLSymbol $sym337$FUNCTION_SPEC_P;
    private static final SubLSymbol $sym338$NAUT_P;
    private static final SubLSymbol $kw339$MAPPING_DONE;
    private static final SubLObject $const340$InferencePSC;
    private static final SubLSymbol $sym341$EL_SET_P;
    private static final SubLObject $const342$Nothing;
    private static final SubLObject $const343$CollectionSubsetFn;
    private static final SubLList $list344;
    private static final SubLList $list345;
    private static final SubLList $list346;
    private static final SubLObject $const347$CollectionIntersection2Fn;
    private static final SubLObject $const348$CollectionIntersectionFn;
    private static final SubLObject $const349$TheSet;
    private static final SubLObject $const350$Thing;
    private static final SubLString $str351$_S_was_not_a_set;
    private static final SubLSymbol $sym352$CACHED_UNION_ALL_SPECS_COUNT;
    private static final SubLSymbol $sym353$_CACHED_UNION_ALL_SPECS_COUNT_CACHING_STATE_;
    private static final SubLSymbol $sym354$CLEAR_CACHED_UNION_ALL_SPECS_COUNT;
    private static final SubLList $list355;
    private static final SubLSymbol $sym356$CONSTANT_P;
    private static final SubLList $list357;
    private static final SubLList $list358;
    private static final SubLList $list359;
    private static final SubLSymbol $sym360$SPEC_CARDINALITY;
    private static final SubLString $str361$_5_d__s__;
    private static final SubLString $str362$__Total_coverage___S___;
    private static final SubLString $str363$__Optimizing_coverage_via_relativ;
    private static final SubLString $str364$_s___s_unique_spec_p__;
    private static final SubLSymbol $sym365$FORBIDDEN_KB_COVERING_COLLECTION_;
    private static final SubLSymbol $sym366$ALL_SPECS_SET;
    private static final SubLSymbol $sym367$FORBIDDEN_KB_COVERING_COLLECTIONS_SET;
    private static final SubLSymbol $sym368$_FORBIDDEN_KB_COVERING_COLLECTIONS_SET_CACHING_STATE_;
    private static final SubLSymbol $sym369$CLEAR_FORBIDDEN_KB_COVERING_COLLECTIONS_SET;
    private static final SubLSymbol $sym370$_ALL_SPECS_SET_CACHING_STATE_;
    private static final SubLSymbol $sym371$CLEAR_ALL_SPECS_SET;
    private static final SubLSymbol $sym372$ALL_GENLS_SET;
    private static final SubLSymbol $sym373$_ALL_GENLS_SET_CACHING_STATE_;
    private static final SubLSymbol $sym374$CLEAR_ALL_GENLS_SET;
    private static final SubLList $list375;
    private static final SubLSymbol $sym376$NON_DOTTED_LIST_P;
    private static final SubLSymbol $sym377$COLLECTION_P;
    private static final SubLSymbol $sym378$SET_SIZE;
    private static final SubLList $list379;
    private static final SubLSymbol $sym380$LIST;
    private static final SubLSymbol $sym381$PREDICATE_P;
    private static final SubLList $list382;
    private static final SubLList $list383;
    private static final SubLString $str384$All_args_of__s_were_open;
    private static final SubLObject $const385$BinaryPredicate;
    private static final SubLSymbol $sym386$DATE_;
    private static final SubLObject $const387$Date;
    private static final SubLSymbol $sym388$VALID_CONSTANT_NAME_CHAR_P;
    private static final SubLList $list389;
    private static final SubLSymbol $sym390$GAF_ASSERTION_;
    private static final SubLSymbol $kw391$IGNORE;
    private static final SubLList $list392;
    private static final SubLObject $const393$oldConstantName;
    private static final SubLSymbol $sym394$VISIT_COASSERTED_FORT;
    private static final SubLSymbol $sym395$CACHED_COMPACT_HL_EXTERNAL_ID_STRING;
    private static final SubLSymbol $sym396$_CACHED_COMPACT_HL_EXTERNAL_ID_STRING_CACHING_STATE_;
    private static final SubLString $str397$_;
    private static final SubLSymbol $kw398$OUTPUT;
    private static final SubLString $str399$Unable_to_open__S;
    private static final SubLString $str400$Writing_coasserted_forts;
    private static final SubLSymbol $sym401$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__;
    private static final SubLList $list402;
    private static final SubLSymbol $sym403$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym404$CSETQ;
    private static final SubLString $str405$_A;
    private static final SubLObject $const406$CoreUnionConstant;
    private static final SubLObject $const407$BookkeepingMt;
    private static final SubLSymbol $sym408$NON_CORE_UNION_CONSTANT_;
    private static final SubLString $str409$SpecMt;
    private static final SubLSymbol $sym410$MICROTHEORY_P;
    private static final SubLInteger $int411$100000;
    private static final SubLObject $const412$genlMt;
    private static final SubLString $str413$Unable_to_create_HL_object_evalua;
    private static final SubLString $str414$_;
    private static final SubLString $str415$_string_to_guid_;
    private static final SubLString $str416$_;
    private static final SubLString $str417$_find_variable_by_id_;
    private static final SubLSymbol $sym418$IS_TRANSFORMABLE_HL_OBJECT_INT_;
    private static final SubLSymbol $sym419$MAKE_HL_READABLE_INT;
    private static final SubLString $str420$AAAAAAAAAAAAA;
    private static final SubLString $str421$__find_nart__;
    private static final SubLString $str422$_AAAAAAAAAAAAAFIND_NART_;
    private static final SubLString $str423$__find_variable_by_id_;
    private static final SubLString $str424$_AAAAAAAAAAAAAFIND_VARIABLE_BY_ID;
    private static final SubLString $str425$__string_to_guid_;
    private static final SubLString $str426$_AAAAAAAAAAAAASTRING_TO_GUID_;
    private static final SubLString $str427$__find_assertion__;
    private static final SubLString $str428$_AAAAAAAAAAAAAFIND_ASSERTION_;
    private static final SubLString $str429$__find_deduction__;
    private static final SubLString $str430$_AAAAAAAAAAAAAFIND_DEDUCTION_;
    private static final SubLString $str431$__find_kb_hl_support__;
    private static final SubLString $str432$_AAAAAAAAAAAAAFIND_KB_HL_SUPPORT_;
    private static final SubLString $str433$_;
    private static final SubLString $str434$_AAAAAAAAAAAAA__;
    private static final SubLString $str435$_AAAAAAAAAAAAAFIND_VARIABLE_BY_ID;
    private static final SubLString $str436$AAAAAAAAAAAAAFIND_VARIABLE_BY_ID;
    private static final SubLString $str437$_0_9__;
    private static final SubLList $list438;
    private static final SubLString $str439$_____find_variable_by_id_;
    private static final SubLString $str440$Unable_to_create_HL_object_evalua;
    private static final SubLSymbol $sym441$AAAAAAAAAAAAAFIND_NART;
    private static final SubLSymbol $sym442$AAAAAAAAAAAAAFIND_VARIABLE_BY_ID;
    private static final SubLSymbol $sym443$AAAAAAAAAAAAASTRING_TO_GUID;
    private static final SubLSymbol $sym444$AAAAAAAAAAAAAFIND_ASSERTION;
    private static final SubLList $list445;
    private static final SubLSymbol $sym446$AAAAAAAAAAAAAFIND_DEDUCTION;
    private static final SubLSymbol $sym447$AAAAAAAAAAAAAFIND_KB_HL_SUPPORT;
    private static final SubLString $str448$Unexpected_situation_;
    private static final SubLString $str449$_;
    private static final SubLSymbol $sym450$RELEVANT_MT_IS_EQ;
    private static final SubLList $list451;
    private static final SubLSymbol $sym452$RANDOMLY_SELECT_CONSTANTS;
    private static final SubLSymbol $sym453$FIND_CONSTANT_BY_SUID;
    private static final SubLSymbol $sym454$RANDOMLY_SELECT_NARTS;
    private static final SubLSymbol $sym455$FIND_NART_BY_ID;
    private static final SubLSymbol $sym456$RANDOMLY_SELECT_ASSERTIONS;
    private static final SubLSymbol $sym457$FIND_ASSERTION_BY_ID;
    private static final SubLSymbol $sym458$RANDOMLY_SELECT_DEDUCTIONS;
    private static final SubLSymbol $sym459$FIND_DEDUCTION_BY_ID;
    private static final SubLSymbol $sym460$RANDOMLY_SELECT_KB_HL_SUPPORTS;
    private static final SubLSymbol $sym461$FIND_KB_HL_SUPPORT_BY_ID;
    private static final SubLSymbol $sym462$RANDOMLY_SELECT_CLAUSE_STRUCS;
    private static final SubLSymbol $sym463$FIND_CLAUSE_STRUC_BY_ID;
    private static final SubLSymbol $sym464$DEDUCTION_P;
    private static final SubLSymbol $sym465$ASSERTION_P;
    private static final SubLSymbol $sym466$NART_P;
    private static final SubLSymbol $sym467$KB_HL_SUPPORT_P;
    private static final SubLSymbol $sym468$SET_TO_COLLECTION;
    private static final SubLSymbol $kw469$TEST;
    private static final SubLSymbol $kw470$OWNER;
    private static final SubLSymbol $kw471$CLASSES;
    private static final SubLSymbol $kw472$KB;
    private static final SubLSymbol $kw473$FULL;
    private static final SubLSymbol $kw474$WORKING_;
    private static final SubLList $list475;
    private static final SubLSymbol $sym476$COLLECTION_SUBSUMPTION_PATHS;
    private static final SubLSymbol $sym477$SETS_EQUAL_EQUAL_;
    private static final SubLList $list478;
    private static final SubLSymbol $sym479$PREDICATE_SUBSUMPTION_PATHS;
    private static final SubLList $list480;
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 941L)
    public static SubLObject kb_statistics(SubLObject stream, SubLObject verbosity) {
        if (stream == kb_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (verbosity == kb_utilities.UNPROVIDED) {
            verbosity = (SubLObject)kb_utilities.$kw0$VERBOSE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_utilities.NIL == control_vars.kb_loaded()) {
            return PrintLow.format(stream, (SubLObject)kb_utilities.$str1$__No_KB_is_currently_loaded_);
        }
        final SubLObject constant_count = constant_handles.constant_count();
        final SubLObject cached_constant_index_count = constant_index_manager.cached_constant_index_count();
        final SubLObject nart_count = nart_handles.nart_count();
        final SubLObject cached_nart_index_count = nart_index_manager.cached_nart_index_count();
        final SubLObject cached_nart_hl_formula_count = nart_hl_formula_manager.cached_nart_hl_formula_count();
        final SubLObject fort_count = forts.fort_count();
        final SubLObject kb_assertion_count = assertion_handles.assertion_count();
        final SubLObject cached_assertion_count = assertion_manager.cached_assertion_count();
        final SubLObject bookkeeping_assertion_count = bookkeeping_store.bookkeeping_assertion_count();
        SubLObject virtual_assertion_count = (SubLObject)kb_utilities.ZERO_INTEGER;
        final SubLObject deduction_count = deduction_handles.deduction_count();
        final SubLObject cached_deduction_count = deduction_manager.cached_deduction_count();
        final SubLObject kb_hl_support_count = kb_hl_support_handles.kb_hl_support_count();
        final SubLObject cached_kb_hl_support_count = kb_hl_support_manager.cached_kb_hl_support_count();
        final SubLObject unrepresented_term_count = unrepresented_terms.kb_unrepresented_term_count();
        final SubLObject cached_unrepresented_term_index_count = unrepresented_term_index_manager.cached_unrepresented_term_index_count();
        final SubLObject clause_struc_count = clause_strucs.clause_struc_count();
        SubLObject total_assertion_count = (SubLObject)kb_utilities.NIL;
        virtual_assertion_count = sksi_removal_module_generation.virtual_assertion_count();
        total_assertion_count = Numbers.add(kb_assertion_count, bookkeeping_assertion_count, virtual_assertion_count);
        final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding(thread);
        try {
            reader.$read_default_float_format$.bind((SubLObject)kb_utilities.$sym2$DOUBLE_FLOAT, thread);
            PrintLow.format(stream, (SubLObject)kb_utilities.$str3$______KB__A_statistics, operation_communication.kb_version_string());
            PrintLow.format(stream, (SubLObject)kb_utilities.$str4$__FORTs______________________9___, fort_count);
            PrintLow.format(stream, (SubLObject)kb_utilities.$str5$___Constants_________________9___, constant_count);
            if (verbosity == kb_utilities.$kw0$VERBOSE && !constant_count.isZero()) {
                PrintLow.format(stream, (SubLObject)kb_utilities.$str6$____cached_indexing__________9___, cached_constant_index_count, number_utilities.percent(cached_constant_index_count, constant_count, (SubLObject)kb_utilities.THREE_INTEGER));
            }
            PrintLow.format(stream, (SubLObject)kb_utilities.$str7$___NARTs_____________________9___, nart_count);
            if (verbosity == kb_utilities.$kw0$VERBOSE && !nart_count.isZero()) {
                PrintLow.format(stream, (SubLObject)kb_utilities.$str6$____cached_indexing__________9___, cached_nart_index_count, number_utilities.percent(cached_nart_index_count, nart_count, (SubLObject)kb_utilities.THREE_INTEGER));
                PrintLow.format(stream, (SubLObject)kb_utilities.$str8$____cached_HL_formulas_______9___, cached_nart_hl_formula_count, number_utilities.percent(cached_nart_hl_formula_count, nart_count, (SubLObject)kb_utilities.THREE_INTEGER));
            }
            PrintLow.format(stream, (SubLObject)kb_utilities.$str9$__Assertions_________________9___, total_assertion_count);
            PrintLow.format(stream, (SubLObject)kb_utilities.$str10$___KB_Assertions_____________9___, kb_assertion_count);
            if (verbosity == kb_utilities.$kw0$VERBOSE && !kb_assertion_count.isZero()) {
                PrintLow.format(stream, (SubLObject)kb_utilities.$str11$____cached___________________9___, cached_assertion_count, number_utilities.percent(cached_assertion_count, kb_assertion_count, (SubLObject)kb_utilities.THREE_INTEGER));
            }
            if (!bookkeeping_assertion_count.isZero()) {
                PrintLow.format(stream, (SubLObject)kb_utilities.$str12$___Bookkeeping_Assertions____9___, bookkeeping_assertion_count);
            }
            if (!virtual_assertion_count.isZero()) {
                PrintLow.format(stream, (SubLObject)kb_utilities.$str13$___Virtual_Assertions________9___, virtual_assertion_count);
            }
            PrintLow.format(stream, (SubLObject)kb_utilities.$str14$__Deductions_________________9___, deduction_count);
            if (verbosity == kb_utilities.$kw0$VERBOSE && !deduction_count.isZero()) {
                PrintLow.format(stream, (SubLObject)kb_utilities.$str11$____cached___________________9___, cached_deduction_count, number_utilities.percent(cached_deduction_count, deduction_count, (SubLObject)kb_utilities.THREE_INTEGER));
            }
            PrintLow.format(stream, (SubLObject)kb_utilities.$str15$__KB_HL_supports_____________9___, kb_hl_support_count);
            if (verbosity == kb_utilities.$kw0$VERBOSE && !kb_hl_support_count.isZero()) {
                PrintLow.format(stream, (SubLObject)kb_utilities.$str11$____cached___________________9___, cached_kb_hl_support_count, number_utilities.percent(cached_kb_hl_support_count, kb_hl_support_count, (SubLObject)kb_utilities.THREE_INTEGER));
            }
            PrintLow.format(stream, (SubLObject)kb_utilities.$str16$__Unrepresented_terms________9___, unrepresented_term_count);
            if (verbosity == kb_utilities.$kw0$VERBOSE && !unrepresented_term_count.isZero()) {
                PrintLow.format(stream, (SubLObject)kb_utilities.$str6$____cached_indexing__________9___, cached_unrepresented_term_index_count, number_utilities.percent(cached_unrepresented_term_index_count, unrepresented_term_count, (SubLObject)kb_utilities.THREE_INTEGER));
            }
            streams_high.terpri(stream);
        }
        finally {
            reader.$read_default_float_format$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 5268L)
    public static SubLObject kb_content_statistics(SubLObject stream) {
        if (stream == kb_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        format_nil.force_format(stream, (SubLObject)kb_utilities.$str17$______KB__A_content_statistics, operation_communication.kb_version_string(), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        format_nil.force_format(stream, (SubLObject)kb_utilities.$str18$__Terms______________9___D, forts.fort_count(), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        format_nil.force_format(stream, (SubLObject)kb_utilities.$str19$___Collections_______9___D, Sequences.length(fort_types_interface.all_forts_of_type(kb_utilities.$const20$Collection)), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        format_nil.force_format(stream, (SubLObject)kb_utilities.$str21$____First_Order______9___D, Sequences.length(isa.all_fort_instances_in_all_mts(kb_utilities.$const22$FirstOrderCollection)), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        format_nil.force_format(stream, (SubLObject)kb_utilities.$str23$____Second_Order_____9___D, Sequences.length(isa.all_fort_instances_in_all_mts(kb_utilities.$const24$SecondOrderCollection)), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        format_nil.force_format(stream, (SubLObject)kb_utilities.$str25$____Third_Order______9___D, Sequences.length(isa.all_fort_instances_in_all_mts(kb_utilities.$const26$ThirdOrderCollection)), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        format_nil.force_format(stream, (SubLObject)kb_utilities.$str27$___Relations_________9___D, Sequences.length(fort_types_interface.all_forts_of_type(kb_utilities.$const28$Relation)), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        format_nil.force_format(stream, (SubLObject)kb_utilities.$str29$____Functions________9___D, Sequences.length(fort_types_interface.all_forts_of_type(kb_utilities.$const30$Function_Denotational)), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        format_nil.force_format(stream, (SubLObject)kb_utilities.$str31$____Predicates_______9___D, Sequences.length(fort_types_interface.all_forts_of_type(kb_utilities.$const32$Predicate)), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        format_nil.force_format(stream, (SubLObject)kb_utilities.$str33$___Microtheories_____9___D, Sequences.length(fort_types_interface.all_forts_of_type(kb_utilities.$const34$Microtheory)), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        format_nil.force_format(stream, (SubLObject)kb_utilities.$str35$___Individuals_______9___D, Sequences.length(isa.all_fort_instances_in_all_mts(kb_utilities.$const36$Individual)), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        format_nil.force_format(stream, (SubLObject)kb_utilities.$str37$__KB_Assertions______9___D, assertion_handles.assertion_count(), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 6568L)
    public static SubLObject kb_object_memory_commitment_analysis() {
        final SubLObject managers = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kb_utilities.$kw38$CONSTANT, constant_index_manager.$constant_index_manager$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$kw39$NART, nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$kw40$ASSERTION, assertion_manager.$assertion_content_manager$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$kw41$DEDUCTION, deduction_manager.$deduction_content_manager$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$kw42$KB_HL_SUPPORT, kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue()), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$kw43$UNPREPRESENTED_TERM, unrepresented_term_index_manager.$unrepresented_term_index_manager$.getGlobalValue()));
        SubLObject tuples = (SubLObject)kb_utilities.NIL;
        SubLObject cdolist_list_var = managers;
        SubLObject manager_spec = (SubLObject)kb_utilities.NIL;
        manager_spec = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = manager_spec;
            SubLObject type = (SubLObject)kb_utilities.NIL;
            SubLObject kbom = (SubLObject)kb_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list44);
            type = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list44);
            kbom = current.first();
            current = current.rest();
            if (kb_utilities.NIL == current) {
                final SubLObject in_memory = kb_object_manager.cached_kb_object_count(kbom);
                final SubLObject swappable = kb_object_manager.swappable_kb_object_count(kbom);
                final SubLObject committed = Numbers.subtract(in_memory, swappable);
                tuples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(type, committed, swappable, in_memory), tuples);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_utilities.$list44);
            }
            cdolist_list_var = cdolist_list_var.rest();
            manager_spec = cdolist_list_var.first();
        }
        return Sequences.nreverse(tuples);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 7928L)
    public static SubLObject kb_object_memory_commitment_report(SubLObject stream) {
        if (stream == kb_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject kb_object_type_name_map = (SubLObject)kb_utilities.$list45;
        final SubLObject analysis_tuples = kb_object_memory_commitment_analysis();
        format_nil.force_format(stream, (SubLObject)kb_utilities.$str46$___18_A____9A____9A____9A, (SubLObject)kb_utilities.$str47$Object_Type, (SubLObject)kb_utilities.$str48$committed, (SubLObject)kb_utilities.$str49$swappable, (SubLObject)kb_utilities.$str50$in_memory, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        format_nil.force_format(stream, (SubLObject)kb_utilities.$str51$_________________________________, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = analysis_tuples;
        SubLObject tuple = (SubLObject)kb_utilities.NIL;
        tuple = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject type = (SubLObject)kb_utilities.NIL;
            SubLObject committed = (SubLObject)kb_utilities.NIL;
            SubLObject swappable = (SubLObject)kb_utilities.NIL;
            SubLObject in_memory = (SubLObject)kb_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list52);
            type = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list52);
            committed = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list52);
            swappable = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list52);
            in_memory = current.first();
            current = current.rest();
            if (kb_utilities.NIL == current) {
                final SubLObject name = list_utilities.alist_lookup_without_values(kb_object_type_name_map, type, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
                PrintLow.format(stream, (SubLObject)kb_utilities.$str53$___18_A____9_A____9_A____9_A, new SubLObject[] { name, committed, swappable, in_memory });
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_utilities.$list52);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 8950L)
    public static SubLObject histogram_of_predicate_extent(SubLObject asserted_onlyP, SubLObject excluded_collections) {
        if (asserted_onlyP == kb_utilities.UNPROVIDED) {
            asserted_onlyP = (SubLObject)kb_utilities.T;
        }
        if (excluded_collections == kb_utilities.UNPROVIDED) {
            excluded_collections = (SubLObject)kb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)kb_utilities.ZERO_INTEGER;
        SubLObject hist = (SubLObject)kb_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_utilities.$sym54$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_utilities.$const55$EverythingPSC, thread);
            final SubLObject list_var = isa.all_fort_instances(kb_utilities.$const32$Predicate, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind((SubLObject)kb_utilities.$str56$Calculating_cardinalities_of_pred, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject pred = (SubLObject)kb_utilities.NIL;
                    pred = csome_list_var.first();
                    while (kb_utilities.NIL != csome_list_var) {
                        if (kb_utilities.NIL == isa.isa_anyP(pred, excluded_collections, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED)) {
                            SubLObject num = (SubLObject)kb_utilities.ZERO_INTEGER;
                            if (kb_utilities.NIL != asserted_onlyP) {
                                final SubLObject pred_var = pred;
                                if (kb_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                    final SubLObject str = (SubLObject)kb_utilities.NIL;
                                    final SubLObject _prev_bind_0_$2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$3 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$5 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                                    final SubLObject _prev_bind_3_$6 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                                    final SubLObject _prev_bind_4_$7 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                                    final SubLObject _prev_bind_5_$8 = utilities_macros.$progress_count$.currentBinding(thread);
                                    final SubLObject _prev_bind_6_$9 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                                    final SubLObject _prev_bind_7_$10 = utilities_macros.$silent_progressP$.currentBinding(thread);
                                    try {
                                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                        utilities_macros.$progress_notification_count$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                                        utilities_macros.$progress_count$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                                        utilities_macros.$is_noting_progressP$.bind((SubLObject)kb_utilities.T, thread);
                                        utilities_macros.$silent_progressP$.bind((SubLObject)((kb_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kb_utilities.T), thread);
                                        utilities_macros.noting_progress_preamble(str);
                                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                        SubLObject done_var = (SubLObject)kb_utilities.NIL;
                                        final SubLObject token_var = (SubLObject)kb_utilities.NIL;
                                        while (kb_utilities.NIL == done_var) {
                                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                            if (kb_utilities.NIL != valid) {
                                                utilities_macros.note_progress();
                                                SubLObject final_index_iterator = (SubLObject)kb_utilities.NIL;
                                                try {
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_utilities.$kw58$GAF, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.NIL);
                                                    SubLObject done_var_$11 = (SubLObject)kb_utilities.NIL;
                                                    final SubLObject token_var_$12 = (SubLObject)kb_utilities.NIL;
                                                    while (kb_utilities.NIL == done_var_$11) {
                                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$12);
                                                        final SubLObject valid_$13 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$12.eql(ass));
                                                        if (kb_utilities.NIL != valid_$13 && (kb_utilities.NIL == asserted_onlyP || kb_utilities.NIL != assertions_high.asserted_assertionP(ass))) {
                                                            num = Numbers.add(num, (SubLObject)kb_utilities.ONE_INTEGER);
                                                        }
                                                        done_var_$11 = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid_$13);
                                                    }
                                                }
                                                finally {
                                                    final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                                                        final SubLObject _values = Values.getValuesAsVector();
                                                        if (kb_utilities.NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                        Values.restoreValuesFromVector(_values);
                                                    }
                                                    finally {
                                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                                    }
                                                }
                                            }
                                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid);
                                        }
                                        utilities_macros.noting_progress_postamble();
                                    }
                                    finally {
                                        utilities_macros.$silent_progressP$.rebind(_prev_bind_7_$10, thread);
                                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_6_$9, thread);
                                        utilities_macros.$progress_count$.rebind(_prev_bind_5_$8, thread);
                                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$7, thread);
                                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_3_$6, thread);
                                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$5, thread);
                                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$3, thread);
                                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$2, thread);
                                    }
                                }
                            }
                            else {
                                num = kb_indexing.num_predicate_extent_index(pred, (SubLObject)kb_utilities.UNPROVIDED);
                            }
                            if (num.isPositive()) {
                                count = Numbers.add(count, num);
                                hist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(pred, num), hist);
                            }
                        }
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kb_utilities.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        pred = csome_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
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
                utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$2, thread);
                utilities_macros.$progress_note$.rebind(_prev_bind_0_$1, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        hist = Sort.sort(hist, Symbols.symbol_function((SubLObject)kb_utilities.$sym59$_), Symbols.symbol_function((SubLObject)kb_utilities.$sym60$CDR));
        return Values.values(hist, count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 10010L)
    public static SubLObject mt_assertion_count(final SubLObject mt) {
        if (kb_utilities.NIL != kb_indexing.broad_mtP(mt)) {
            return broad_mt_assertion_count(mt);
        }
        return kb_indexing.num_mt_index(mt);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 10148L)
    public static SubLObject broad_mt_assertion_count(final SubLObject broad_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)kb_utilities.ZERO_INTEGER;
        final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(broad_mt);
        if (pcase_var.eql((SubLObject)kb_utilities.$kw61$MT)) {
            if (kb_utilities.NIL != kb_mapping_macros.do_mt_index_key_validator(broad_mt, (SubLObject)kb_utilities.NIL)) {
                final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(broad_mt);
                SubLObject final_index_iterator = (SubLObject)kb_utilities.NIL;
                try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.NIL);
                    SubLObject done_var = (SubLObject)kb_utilities.NIL;
                    final SubLObject token_var = (SubLObject)kb_utilities.NIL;
                    while (kb_utilities.NIL == done_var) {
                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(ass));
                        if (kb_utilities.NIL != valid) {
                            count = Numbers.add(count, (SubLObject)kb_utilities.ONE_INTEGER);
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        if (kb_utilities.NIL != final_index_iterator) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                        }
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
        else if (pcase_var.eql((SubLObject)kb_utilities.$kw62$BROAD_MT) && kb_utilities.NIL != kb_mapping_macros.do_broad_mt_index_key_validator(broad_mt, (SubLObject)kb_utilities.NIL)) {
            final SubLObject idx = assertion_handles.do_assertions_table();
            final SubLObject mess = (SubLObject)kb_utilities.$str63$do_broad_mt_index;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)kb_utilities.ZERO_INTEGER;
            assert kb_utilities.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$16 = idx;
                    if (kb_utilities.NIL == id_index.id_index_objects_empty_p(idx_$16, (SubLObject)kb_utilities.$kw65$SKIP)) {
                        final SubLObject idx_$17 = idx_$16;
                        if (kb_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$17, (SubLObject)kb_utilities.$kw65$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$17);
                            final SubLObject backwardP_var = (SubLObject)kb_utilities.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject a_id;
                            SubLObject a_handle;
                            SubLObject ass2;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_utilities.NIL, v_iteration = (SubLObject)kb_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_utilities.ONE_INTEGER)) {
                                a_id = ((kb_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_utilities.ONE_INTEGER) : v_iteration);
                                a_handle = Vectors.aref(vector_var, a_id);
                                if (kb_utilities.NIL == id_index.id_index_tombstone_p(a_handle) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                    if (kb_utilities.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                        a_handle = (SubLObject)kb_utilities.$kw65$SKIP;
                                    }
                                    ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                    if (kb_utilities.NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass2, broad_mt, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.NIL)) {
                                        count = Numbers.add(count, (SubLObject)kb_utilities.ONE_INTEGER);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$18 = idx_$16;
                        if (kb_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$18) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$18);
                            SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$18);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$18);
                            final SubLObject v_default = (SubLObject)((kb_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) ? kb_utilities.NIL : kb_utilities.$kw65$SKIP);
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                if (kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP) || kb_utilities.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                    final SubLObject ass3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    if (kb_utilities.NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass3, broad_mt, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.NIL)) {
                                        count = Numbers.add(count, (SubLObject)kb_utilities.ONE_INTEGER);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                a_id2 = Numbers.add(a_id2, (SubLObject)kb_utilities.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 10313L)
    public static SubLObject most_populous_predicates_in_relevant_mts(final SubLObject mt, SubLObject n) {
        if (n == kb_utilities.UNPROVIDED) {
            n = (SubLObject)kb_utilities.TEN_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)kb_utilities.EQL), (SubLObject)kb_utilities.UNPROVIDED);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject node_var = kb_utilities.$const32$Predicate;
            final SubLObject _prev_bind_0_$20 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$21 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(kb_utilities.$const66$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$22 = node_var;
                    final SubLObject deck_type = (SubLObject)kb_utilities.$kw69$STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$21 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = (SubLObject)kb_utilities.NIL;
                            final SubLObject _prev_bind_0_$22 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$22 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((kb_utilities.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((kb_utilities.NIL != tv_var) ? kb_utilities.$sym70$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                if (kb_utilities.NIL != tv_var && kb_utilities.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && kb_utilities.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql((SubLObject)kb_utilities.$kw71$ERROR)) {
                                        sbhl_paranoia.sbhl_error((SubLObject)kb_utilities.ONE_INTEGER, (SubLObject)kb_utilities.$str72$_A_is_not_a__A, tv_var, (SubLObject)kb_utilities.$sym73$SBHL_TRUE_TV_P, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)kb_utilities.$kw74$CERROR)) {
                                        sbhl_paranoia.sbhl_cerror((SubLObject)kb_utilities.ONE_INTEGER, (SubLObject)kb_utilities.$str75$continue_anyway, (SubLObject)kb_utilities.$str72$_A_is_not_a__A, tv_var, (SubLObject)kb_utilities.$sym73$SBHL_TRUE_TV_P, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)kb_utilities.$kw76$WARN)) {
                                        Errors.warn((SubLObject)kb_utilities.$str72$_A_is_not_a__A, tv_var, (SubLObject)kb_utilities.$sym73$SBHL_TRUE_TV_P);
                                    }
                                    else {
                                        Errors.warn((SubLObject)kb_utilities.$str77$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror((SubLObject)kb_utilities.$str75$continue_anyway, (SubLObject)kb_utilities.$str72$_A_is_not_a__A, tv_var, (SubLObject)kb_utilities.$sym73$SBHL_TRUE_TV_P);
                                    }
                                }
                                final SubLObject _prev_bind_0_$23 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$23 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$28 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kb_utilities.$const66$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kb_utilities.$const66$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kb_utilities.$const66$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kb_utilities.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kb_utilities.$const66$isa)), thread);
                                    if (kb_utilities.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || kb_utilities.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)kb_utilities.UNPROVIDED))) {
                                        final SubLObject _prev_bind_0_$24 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$24 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$29 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kb_utilities.$const66$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kb_utilities.NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$22, (SubLObject)kb_utilities.UNPROVIDED);
                                            while (kb_utilities.NIL != node_var_$22) {
                                                final SubLObject tt_node_var = node_var_$22;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(kb_utilities.$const66$isa));
                                                SubLObject module_var = (SubLObject)kb_utilities.NIL;
                                                module_var = cdolist_list_var.first();
                                                while (kb_utilities.NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$25 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$25 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((kb_utilities.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kb_utilities.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (kb_utilities.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)kb_utilities.UNPROVIDED));
                                                            if (kb_utilities.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kb_utilities.$const66$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)kb_utilities.UNPROVIDED));
                                                                if (kb_utilities.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); kb_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt_$34 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (kb_utilities.NIL != mt_relevance_macros.relevant_mtP(mt_$34)) {
                                                                            final SubLObject _prev_bind_0_$26 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$34, thread);
                                                                                SubLObject iteration_state_$36;
                                                                                for (iteration_state_$36 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); kb_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$36); iteration_state_$36 = dictionary_contents.do_dictionary_contents_next(iteration_state_$36)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$36);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (kb_utilities.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$27 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (kb_utilities.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject pred;
                                                                                                SubLObject count;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    pred = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (kb_utilities.NIL != set_contents.do_set_contents_element_validP(state, pred) && kb_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (kb_utilities.NIL != forts.fort_p(pred)) {
                                                                                                            count = kb_indexing.relevant_num_predicate_extent_index(pred);
                                                                                                            if (count.isPositive()) {
                                                                                                                dictionary.dictionary_enter(dict, pred, count);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject pred2 = (SubLObject)kb_utilities.NIL;
                                                                                                pred2 = csome_list_var.first();
                                                                                                while (kb_utilities.NIL != csome_list_var) {
                                                                                                    if (kb_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (kb_utilities.NIL != forts.fort_p(pred2)) {
                                                                                                            final SubLObject count2 = kb_indexing.relevant_num_predicate_extent_index(pred2);
                                                                                                            if (count2.isPositive()) {
                                                                                                                dictionary.dictionary_enter(dict, pred2, count2);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    pred2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)kb_utilities.$str78$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$27, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$36);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$26, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)kb_utilities.FIVE_INTEGER, (SubLObject)kb_utilities.$str79$attempting_to_bind_direction_link, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
                                                            }
                                                            if (kb_utilities.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)kb_utilities.UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = (SubLObject)kb_utilities.NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (kb_utilities.NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = (SubLObject)kb_utilities.NIL;
                                                                    SubLObject mt_$35 = (SubLObject)kb_utilities.NIL;
                                                                    SubLObject tv2 = (SubLObject)kb_utilities.NIL;
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list80);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list80);
                                                                    mt_$35 = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list80);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (kb_utilities.NIL == current) {
                                                                        if (kb_utilities.NIL != mt_relevance_macros.relevant_mtP(mt_$35)) {
                                                                            final SubLObject _prev_bind_0_$28 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$35, thread);
                                                                                if (kb_utilities.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                        if (kb_utilities.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject pred;
                                                                                            SubLObject count;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                pred = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (kb_utilities.NIL != set_contents.do_set_contents_element_validP(state, pred) && kb_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (kb_utilities.NIL != forts.fort_p(pred)) {
                                                                                                        count = kb_indexing.relevant_num_predicate_extent_index(pred);
                                                                                                        if (count.isPositive()) {
                                                                                                            dictionary.dictionary_enter(dict, pred, count);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$41 = sol;
                                                                                            SubLObject pred2 = (SubLObject)kb_utilities.NIL;
                                                                                            pred2 = csome_list_var_$41.first();
                                                                                            while (kb_utilities.NIL != csome_list_var_$41) {
                                                                                                if (kb_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (kb_utilities.NIL != forts.fort_p(pred2)) {
                                                                                                        final SubLObject count2 = kb_indexing.relevant_num_predicate_extent_index(pred2);
                                                                                                        if (count2.isPositive()) {
                                                                                                            dictionary.dictionary_enter(dict, pred2, count2);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var_$41 = csome_list_var_$41.rest();
                                                                                                pred2 = csome_list_var_$41.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)kb_utilities.$str78$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$29, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$28, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_utilities.$list80);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                }
                                                            }
                                                        }
                                                        else if (kb_utilities.NIL != obsolete.cnat_p(node, (SubLObject)kb_utilities.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$42;
                                                            final SubLObject new_list = cdolist_list_var_$42 = ((kb_utilities.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kb_utilities.$const66$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kb_utilities.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kb_utilities.$const66$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kb_utilities.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)kb_utilities.NIL;
                                                            generating_fn = cdolist_list_var_$42.first();
                                                            while (kb_utilities.NIL != cdolist_list_var_$42) {
                                                                final SubLObject _prev_bind_0_$30 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (kb_utilities.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject pred3;
                                                                        SubLObject count3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)kb_utilities.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); kb_utilities.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            pred3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (kb_utilities.NIL != set_contents.do_set_contents_element_validP(state2, pred3) && kb_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (kb_utilities.NIL != forts.fort_p(pred3)) {
                                                                                    count3 = kb_indexing.relevant_num_predicate_extent_index(pred3);
                                                                                    if (count3.isPositive()) {
                                                                                        dictionary.dictionary_enter(dict, pred3, count3);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var3 = sol2;
                                                                        SubLObject pred4 = (SubLObject)kb_utilities.NIL;
                                                                        pred4 = csome_list_var3.first();
                                                                        while (kb_utilities.NIL != csome_list_var3) {
                                                                            if (kb_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (kb_utilities.NIL != forts.fort_p(pred4)) {
                                                                                    final SubLObject count4 = kb_indexing.relevant_num_predicate_extent_index(pred4);
                                                                                    if (count4.isPositive()) {
                                                                                        dictionary.dictionary_enter(dict, pred4, count4);
                                                                                    }
                                                                                }
                                                                            }
                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                            pred4 = csome_list_var3.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)kb_utilities.$str78$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$30, thread);
                                                                }
                                                                cdolist_list_var_$42 = cdolist_list_var_$42.rest();
                                                                generating_fn = cdolist_list_var_$42.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$25, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$25, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kb_utilities.$const66$isa)));
                                                SubLObject module_var2 = (SubLObject)kb_utilities.NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (kb_utilities.NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$31 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$26 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((kb_utilities.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kb_utilities.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$22);
                                                        if (kb_utilities.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)kb_utilities.UNPROVIDED));
                                                            if (kb_utilities.NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)kb_utilities.UNPROVIDED));
                                                                if (kb_utilities.NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); kb_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt_$36 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (kb_utilities.NIL != mt_relevance_macros.relevant_mtP(mt_$36)) {
                                                                            final SubLObject _prev_bind_0_$32 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$36, thread);
                                                                                SubLObject iteration_state_$37;
                                                                                for (iteration_state_$37 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); kb_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$37); iteration_state_$37 = dictionary_contents.do_dictionary_contents_next(iteration_state_$37)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$37);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (kb_utilities.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$33 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes4;
                                                                                            if (kb_utilities.NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)kb_utilities.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); kb_utilities.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if (kb_utilities.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && kb_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)kb_utilities.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)kb_utilities.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)kb_utilities.NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (kb_utilities.NIL != csome_list_var4) {
                                                                                                    if (kb_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)kb_utilities.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)kb_utilities.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)kb_utilities.$str78$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$33, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$37);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$32, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)kb_utilities.FIVE_INTEGER, (SubLObject)kb_utilities.$str79$attempting_to_bind_direction_link, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (kb_utilities.NIL != obsolete.cnat_p(node2, (SubLObject)kb_utilities.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$43;
                                                            final SubLObject new_list2 = cdolist_list_var_$43 = ((kb_utilities.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kb_utilities.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kb_utilities.UNPROVIDED)));
                                                            SubLObject generating_fn2 = (SubLObject)kb_utilities.NIL;
                                                            generating_fn2 = cdolist_list_var_$43.first();
                                                            while (kb_utilities.NIL != cdolist_list_var_$43) {
                                                                final SubLObject _prev_bind_0_$34 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                    if (kb_utilities.NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)kb_utilities.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); kb_utilities.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if (kb_utilities.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && kb_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)kb_utilities.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)kb_utilities.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol4.isList()) {
                                                                        SubLObject csome_list_var5 = sol4;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)kb_utilities.NIL;
                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                        while (kb_utilities.NIL != csome_list_var5) {
                                                                            if (kb_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)kb_utilities.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)kb_utilities.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var5 = csome_list_var5.rest();
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)kb_utilities.$str78$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$34, thread);
                                                                }
                                                                cdolist_list_var_$43 = cdolist_list_var_$43.rest();
                                                                generating_fn2 = cdolist_list_var_$43.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$26, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$31, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                }
                                                node_var_$22 = deck.deck_pop(recur_deck);
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$29, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$24, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$24, thread);
                                        }
                                    }
                                    else {
                                        sbhl_paranoia.sbhl_warn((SubLObject)kb_utilities.TWO_INTEGER, (SubLObject)kb_utilities.$str81$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)kb_utilities.UNPROVIDED)), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
                                    }
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$28, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$23, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$23, thread);
                                }
                            }
                            finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$22, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$22, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$21, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$36 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$21, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$20, thread);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.first_n(n, list_utilities.alist_keys(dictionary_utilities.sort_dictionary_by_values(dict, Symbols.symbol_function((SubLObject)kb_utilities.$sym59$_))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 10801L)
    public static SubLObject most_populous_predicates_in_mts(final SubLObject mts, SubLObject n, SubLObject return_countsP) {
        if (n == kb_utilities.UNPROVIDED) {
            n = (SubLObject)kb_utilities.TEN_INTEGER;
        }
        if (return_countsP == kb_utilities.UNPROVIDED) {
            return_countsP = (SubLObject)kb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)kb_utilities.EQL), (SubLObject)kb_utilities.UNPROVIDED);
        final SubLObject node_var = kb_utilities.$const32$Predicate;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(kb_utilities.$const66$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject node_var_$54 = node_var;
                final SubLObject deck_type = (SubLObject)kb_utilities.$kw69$STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$55 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = (SubLObject)kb_utilities.NIL;
                        final SubLObject _prev_bind_0_$56 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$57 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind((kb_utilities.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((kb_utilities.NIL != tv_var) ? kb_utilities.$sym70$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                            if (kb_utilities.NIL != tv_var && kb_utilities.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && kb_utilities.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql((SubLObject)kb_utilities.$kw71$ERROR)) {
                                    sbhl_paranoia.sbhl_error((SubLObject)kb_utilities.ONE_INTEGER, (SubLObject)kb_utilities.$str72$_A_is_not_a__A, tv_var, (SubLObject)kb_utilities.$sym73$SBHL_TRUE_TV_P, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)kb_utilities.$kw74$CERROR)) {
                                    sbhl_paranoia.sbhl_cerror((SubLObject)kb_utilities.ONE_INTEGER, (SubLObject)kb_utilities.$str75$continue_anyway, (SubLObject)kb_utilities.$str72$_A_is_not_a__A, tv_var, (SubLObject)kb_utilities.$sym73$SBHL_TRUE_TV_P, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
                                }
                                else if (pcase_var.eql((SubLObject)kb_utilities.$kw76$WARN)) {
                                    Errors.warn((SubLObject)kb_utilities.$str72$_A_is_not_a__A, tv_var, (SubLObject)kb_utilities.$sym73$SBHL_TRUE_TV_P);
                                }
                                else {
                                    Errors.warn((SubLObject)kb_utilities.$str77$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror((SubLObject)kb_utilities.$str75$continue_anyway, (SubLObject)kb_utilities.$str72$_A_is_not_a__A, tv_var, (SubLObject)kb_utilities.$sym73$SBHL_TRUE_TV_P);
                                }
                            }
                            final SubLObject _prev_bind_0_$57 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$58 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kb_utilities.$const66$isa)), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kb_utilities.$const66$isa))), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kb_utilities.$const66$isa))), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kb_utilities.NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kb_utilities.$const66$isa)), thread);
                                if (kb_utilities.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || kb_utilities.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)kb_utilities.UNPROVIDED))) {
                                    final SubLObject _prev_bind_0_$58 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$59 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$62 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kb_utilities.$const66$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kb_utilities.NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$54, (SubLObject)kb_utilities.UNPROVIDED);
                                        while (kb_utilities.NIL != node_var_$54) {
                                            final SubLObject tt_node_var = node_var_$54;
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(kb_utilities.$const66$isa));
                                            SubLObject module_var = (SubLObject)kb_utilities.NIL;
                                            module_var = cdolist_list_var.first();
                                            while (kb_utilities.NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$59 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$60 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((kb_utilities.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kb_utilities.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                    if (kb_utilities.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)kb_utilities.UNPROVIDED));
                                                        if (kb_utilities.NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kb_utilities.$const66$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)kb_utilities.UNPROVIDED));
                                                            if (kb_utilities.NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); kb_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (kb_utilities.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$60 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$66;
                                                                            for (iteration_state_$66 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); kb_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$66); iteration_state_$66 = dictionary_contents.do_dictionary_contents_next(iteration_state_$66)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$66);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (kb_utilities.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$61 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (kb_utilities.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject pred;
                                                                                            SubLObject _prev_bind_0_$62;
                                                                                            SubLObject _prev_bind_1_$61;
                                                                                            SubLObject count;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                pred = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (kb_utilities.NIL != set_contents.do_set_contents_element_validP(state, pred) && kb_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (kb_utilities.NIL != forts.fort_p(pred)) {
                                                                                                        _prev_bind_0_$62 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                                                        _prev_bind_1_$61 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                                                                        try {
                                                                                                            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_utilities.$sym82$RELEVANT_MT_IS_IN_LIST, thread);
                                                                                                            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
                                                                                                            count = kb_indexing.relevant_num_predicate_extent_index(pred);
                                                                                                            if (count.isPositive()) {
                                                                                                                dictionary.dictionary_enter(dict, pred, count);
                                                                                                            }
                                                                                                        }
                                                                                                        finally {
                                                                                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1_$61, thread);
                                                                                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$62, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject pred2 = (SubLObject)kb_utilities.NIL;
                                                                                            pred2 = csome_list_var.first();
                                                                                            while (kb_utilities.NIL != csome_list_var) {
                                                                                                if (kb_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (kb_utilities.NIL != forts.fort_p(pred2)) {
                                                                                                        final SubLObject _prev_bind_0_$63 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                                                        final SubLObject _prev_bind_1_$62 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                                                                        try {
                                                                                                            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_utilities.$sym82$RELEVANT_MT_IS_IN_LIST, thread);
                                                                                                            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
                                                                                                            final SubLObject count2 = kb_indexing.relevant_num_predicate_extent_index(pred2);
                                                                                                            if (count2.isPositive()) {
                                                                                                                dictionary.dictionary_enter(dict, pred2, count2);
                                                                                                            }
                                                                                                        }
                                                                                                        finally {
                                                                                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1_$62, thread);
                                                                                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$63, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                pred2 = csome_list_var.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)kb_utilities.$str78$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$61, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$66);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$60, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)kb_utilities.FIVE_INTEGER, (SubLObject)kb_utilities.$str79$attempting_to_bind_direction_link, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
                                                        }
                                                        if (kb_utilities.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)kb_utilities.UNPROVIDED))) {
                                                            SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                            SubLObject instance_tuple = (SubLObject)kb_utilities.NIL;
                                                            instance_tuple = csome_list_var2.first();
                                                            while (kb_utilities.NIL != csome_list_var2) {
                                                                SubLObject current;
                                                                final SubLObject datum = current = instance_tuple;
                                                                SubLObject link_node = (SubLObject)kb_utilities.NIL;
                                                                SubLObject mt2 = (SubLObject)kb_utilities.NIL;
                                                                SubLObject tv2 = (SubLObject)kb_utilities.NIL;
                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list80);
                                                                link_node = current.first();
                                                                current = current.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list80);
                                                                mt2 = current.first();
                                                                current = current.rest();
                                                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list80);
                                                                tv2 = current.first();
                                                                current = current.rest();
                                                                if (kb_utilities.NIL == current) {
                                                                    if (kb_utilities.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$64 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            if (kb_utilities.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                final SubLObject _prev_bind_0_$65 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                    final SubLObject sol;
                                                                                    final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                    if (kb_utilities.NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject pred;
                                                                                        SubLObject count;
                                                                                        SubLObject _prev_bind_0_$66;
                                                                                        SubLObject _prev_bind_1_$63;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            pred = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if (kb_utilities.NIL != set_contents.do_set_contents_element_validP(state, pred) && kb_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (kb_utilities.NIL != forts.fort_p(pred)) {
                                                                                                    _prev_bind_0_$66 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                                                    _prev_bind_1_$63 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                                                                    try {
                                                                                                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_utilities.$sym82$RELEVANT_MT_IS_IN_LIST, thread);
                                                                                                        mt_relevance_macros.$relevant_mts$.bind(mts, thread);
                                                                                                        count = kb_indexing.relevant_num_predicate_extent_index(pred);
                                                                                                        if (count.isPositive()) {
                                                                                                            dictionary.dictionary_enter(dict, pred, count);
                                                                                                        }
                                                                                                    }
                                                                                                    finally {
                                                                                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1_$63, thread);
                                                                                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$66, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    else if (sol.isList()) {
                                                                                        SubLObject csome_list_var_$76 = sol;
                                                                                        SubLObject pred2 = (SubLObject)kb_utilities.NIL;
                                                                                        pred2 = csome_list_var_$76.first();
                                                                                        while (kb_utilities.NIL != csome_list_var_$76) {
                                                                                            if (kb_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (kb_utilities.NIL != forts.fort_p(pred2)) {
                                                                                                    final SubLObject _prev_bind_0_$67 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                                                    final SubLObject _prev_bind_1_$64 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                                                                    try {
                                                                                                        mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_utilities.$sym82$RELEVANT_MT_IS_IN_LIST, thread);
                                                                                                        mt_relevance_macros.$relevant_mts$.bind(mts, thread);
                                                                                                        final SubLObject count2 = kb_indexing.relevant_num_predicate_extent_index(pred2);
                                                                                                        if (count2.isPositive()) {
                                                                                                            dictionary.dictionary_enter(dict, pred2, count2);
                                                                                                        }
                                                                                                    }
                                                                                                    finally {
                                                                                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1_$64, thread);
                                                                                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$67, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            csome_list_var_$76 = csome_list_var_$76.rest();
                                                                                            pred2 = csome_list_var_$76.first();
                                                                                        }
                                                                                    }
                                                                                    else {
                                                                                        Errors.error((SubLObject)kb_utilities.$str78$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$65, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$64, thread);
                                                                        }
                                                                    }
                                                                }
                                                                else {
                                                                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_utilities.$list80);
                                                                }
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                instance_tuple = csome_list_var2.first();
                                                            }
                                                        }
                                                    }
                                                    else if (kb_utilities.NIL != obsolete.cnat_p(node, (SubLObject)kb_utilities.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$79;
                                                        final SubLObject new_list = cdolist_list_var_$79 = ((kb_utilities.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kb_utilities.$const66$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kb_utilities.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kb_utilities.$const66$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kb_utilities.UNPROVIDED)));
                                                        SubLObject generating_fn = (SubLObject)kb_utilities.NIL;
                                                        generating_fn = cdolist_list_var_$79.first();
                                                        while (kb_utilities.NIL != cdolist_list_var_$79) {
                                                            final SubLObject _prev_bind_0_$68 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                if (kb_utilities.NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject pred3;
                                                                    SubLObject _prev_bind_0_$69;
                                                                    SubLObject _prev_bind_1_$65;
                                                                    SubLObject count3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)kb_utilities.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); kb_utilities.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        pred3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if (kb_utilities.NIL != set_contents.do_set_contents_element_validP(state2, pred3) && kb_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            if (kb_utilities.NIL != forts.fort_p(pred3)) {
                                                                                _prev_bind_0_$69 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                                _prev_bind_1_$65 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                                                try {
                                                                                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_utilities.$sym82$RELEVANT_MT_IS_IN_LIST, thread);
                                                                                    mt_relevance_macros.$relevant_mts$.bind(mts, thread);
                                                                                    count3 = kb_indexing.relevant_num_predicate_extent_index(pred3);
                                                                                    if (count3.isPositive()) {
                                                                                        dictionary.dictionary_enter(dict, pred3, count3);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1_$65, thread);
                                                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$69, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol2.isList()) {
                                                                    SubLObject csome_list_var3 = sol2;
                                                                    SubLObject pred4 = (SubLObject)kb_utilities.NIL;
                                                                    pred4 = csome_list_var3.first();
                                                                    while (kb_utilities.NIL != csome_list_var3) {
                                                                        if (kb_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                            if (kb_utilities.NIL != forts.fort_p(pred4)) {
                                                                                final SubLObject _prev_bind_0_$70 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                                final SubLObject _prev_bind_1_$66 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                                                try {
                                                                                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_utilities.$sym82$RELEVANT_MT_IS_IN_LIST, thread);
                                                                                    mt_relevance_macros.$relevant_mts$.bind(mts, thread);
                                                                                    final SubLObject count4 = kb_indexing.relevant_num_predicate_extent_index(pred4);
                                                                                    if (count4.isPositive()) {
                                                                                        dictionary.dictionary_enter(dict, pred4, count4);
                                                                                    }
                                                                                }
                                                                                finally {
                                                                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1_$66, thread);
                                                                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$70, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                        pred4 = csome_list_var3.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)kb_utilities.$str78$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$68, thread);
                                                            }
                                                            cdolist_list_var_$79 = cdolist_list_var_$79.rest();
                                                            generating_fn = cdolist_list_var_$79.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$60, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$59, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            }
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kb_utilities.$const66$isa)));
                                            SubLObject module_var2 = (SubLObject)kb_utilities.NIL;
                                            module_var2 = cdolist_list_var2.first();
                                            while (kb_utilities.NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$71 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$67 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((kb_utilities.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kb_utilities.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                    final SubLObject node2 = function_terms.naut_to_nart(node_var_$54);
                                                    if (kb_utilities.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                        final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)kb_utilities.UNPROVIDED));
                                                        if (kb_utilities.NIL != d_link2) {
                                                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)kb_utilities.UNPROVIDED));
                                                            if (kb_utilities.NIL != mt_links2) {
                                                                SubLObject iteration_state2;
                                                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); kb_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (kb_utilities.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                        final SubLObject _prev_bind_0_$72 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                            SubLObject iteration_state_$67;
                                                                            for (iteration_state_$67 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); kb_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$67); iteration_state_$67 = dictionary_contents.do_dictionary_contents_next(iteration_state_$67)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$67);
                                                                                final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (kb_utilities.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$73 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol3 = link_nodes4;
                                                                                        if (kb_utilities.NIL != set.set_p(sol3)) {
                                                                                            final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                            SubLObject basis_object3;
                                                                                            SubLObject state3;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)kb_utilities.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); kb_utilities.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                if (kb_utilities.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && kb_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)kb_utilities.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)kb_utilities.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol3.isList()) {
                                                                                            SubLObject csome_list_var4 = sol3;
                                                                                            SubLObject node_vars_link_node2 = (SubLObject)kb_utilities.NIL;
                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                            while (kb_utilities.NIL != csome_list_var4) {
                                                                                                if (kb_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)kb_utilities.UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)kb_utilities.UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                }
                                                                                                csome_list_var4 = csome_list_var4.rest();
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)kb_utilities.$str78$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$73, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$67);
                                                                        }
                                                                        finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$72, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                            }
                                                        }
                                                        else {
                                                            sbhl_paranoia.sbhl_error((SubLObject)kb_utilities.FIVE_INTEGER, (SubLObject)kb_utilities.$str79$attempting_to_bind_direction_link, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
                                                        }
                                                    }
                                                    else if (kb_utilities.NIL != obsolete.cnat_p(node2, (SubLObject)kb_utilities.UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$80;
                                                        final SubLObject new_list2 = cdolist_list_var_$80 = ((kb_utilities.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kb_utilities.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kb_utilities.UNPROVIDED)));
                                                        SubLObject generating_fn2 = (SubLObject)kb_utilities.NIL;
                                                        generating_fn2 = cdolist_list_var_$80.first();
                                                        while (kb_utilities.NIL != cdolist_list_var_$80) {
                                                            final SubLObject _prev_bind_0_$74 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                final SubLObject sol4;
                                                                final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                if (kb_utilities.NIL != set.set_p(sol4)) {
                                                                    final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                    SubLObject basis_object4;
                                                                    SubLObject state4;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)kb_utilities.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); kb_utilities.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                        if (kb_utilities.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && kb_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)kb_utilities.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)kb_utilities.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                        }
                                                                    }
                                                                }
                                                                else if (sol4.isList()) {
                                                                    SubLObject csome_list_var5 = sol4;
                                                                    SubLObject node_vars_link_node4 = (SubLObject)kb_utilities.NIL;
                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                    while (kb_utilities.NIL != csome_list_var5) {
                                                                        if (kb_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)kb_utilities.UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)kb_utilities.UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                        }
                                                                        csome_list_var5 = csome_list_var5.rest();
                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                    }
                                                                }
                                                                else {
                                                                    Errors.error((SubLObject)kb_utilities.$str78$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                }
                                                            }
                                                            finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$74, thread);
                                                            }
                                                            cdolist_list_var_$80 = cdolist_list_var_$80.rest();
                                                            generating_fn2 = cdolist_list_var_$80.first();
                                                        }
                                                    }
                                                }
                                                finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$67, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$71, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var2 = cdolist_list_var2.first();
                                            }
                                            node_var_$54 = deck.deck_pop(recur_deck);
                                        }
                                    }
                                    finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$62, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$59, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$58, thread);
                                    }
                                }
                                else {
                                    sbhl_paranoia.sbhl_warn((SubLObject)kb_utilities.TWO_INTEGER, (SubLObject)kb_utilities.$str81$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)kb_utilities.UNPROVIDED)), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
                                }
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$58, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$57, thread);
                            }
                        }
                        finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$57, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$56, thread);
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$75 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$75, thread);
                        }
                    }
                }
                finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$55, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$76 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$76, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        final SubLObject alist = dictionary_utilities.sort_dictionary_by_values(dict, Symbols.symbol_function((SubLObject)kb_utilities.$sym59$_));
        final SubLObject uncut_result = (kb_utilities.NIL != return_countsP) ? alist : list_utilities.alist_keys(alist);
        return list_utilities.first_n(n, uncut_result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 11287L)
    public static SubLObject most_populous_predicates_in_mt(final SubLObject mt, SubLObject n, SubLObject filter_function) {
        if (n == kb_utilities.UNPROVIDED) {
            n = (SubLObject)kb_utilities.TEN_INTEGER;
        }
        if (filter_function == kb_utilities.UNPROVIDED) {
            filter_function = (SubLObject)kb_utilities.NIL;
        }
        final SubLObject contents_breakdown = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)kb_utilities.EQL), (SubLObject)kb_utilities.UNPROVIDED);
        if (kb_utilities.NIL != kb_mapping_macros.do_mt_index_key_validator(mt, (SubLObject)kb_utilities.NIL)) {
            final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
            SubLObject final_index_iterator = (SubLObject)kb_utilities.NIL;
            try {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.NIL);
                SubLObject done_var = (SubLObject)kb_utilities.NIL;
                final SubLObject token_var = (SubLObject)kb_utilities.NIL;
                while (kb_utilities.NIL == done_var) {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(assertion));
                    if (kb_utilities.NIL != valid && kb_utilities.NIL != assertions_high.gaf_assertionP(assertion)) {
                        final SubLObject pred = assertions_high.gaf_predicate(assertion);
                        dictionary_utilities.dictionary_increment(contents_breakdown, pred, (SubLObject)kb_utilities.ONE_INTEGER);
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)kb_utilities.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (kb_utilities.NIL != final_index_iterator) {
                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        }
        if (kb_utilities.NIL == filter_function) {
            return list_utilities.first_n(n, list_utilities.alist_keys(dictionary_utilities.sort_dictionary_by_values(contents_breakdown, Symbols.symbol_function((SubLObject)kb_utilities.$sym59$_))));
        }
        final SubLObject preds = list_utilities.alist_keys(dictionary_utilities.sort_dictionary_by_values(contents_breakdown, Symbols.symbol_function((SubLObject)kb_utilities.$sym59$_)));
        SubLObject count = (SubLObject)kb_utilities.ZERO_INTEGER;
        SubLObject result = (SubLObject)kb_utilities.NIL;
        SubLObject cdolist_list_var = preds;
        SubLObject pred2 = (SubLObject)kb_utilities.NIL;
        pred2 = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            if (kb_utilities.NIL == Eval.eval((SubLObject)ConsesLow.list(filter_function, pred2))) {
                count = Numbers.add(count, (SubLObject)kb_utilities.ONE_INTEGER);
                result = (SubLObject)ConsesLow.cons(pred2, result);
                if (count.numGE(n)) {
                    return Sequences.nreverse(result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred2 = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 12080L)
    public static SubLObject most_populous_collections_in_mts(final SubLObject mts, SubLObject n, SubLObject return_countsP) {
        if (n == kb_utilities.UNPROVIDED) {
            n = (SubLObject)kb_utilities.TEN_INTEGER;
        }
        if (return_countsP == kb_utilities.UNPROVIDED) {
            return_countsP = (SubLObject)kb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)kb_utilities.EQL), (SubLObject)kb_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_utilities.$sym82$RELEVANT_MT_IS_IN_LIST, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            final SubLObject pred_var = kb_utilities.$const66$isa;
            if (kb_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = (SubLObject)kb_utilities.NIL;
                final SubLObject _prev_bind_0_$94 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$95 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)kb_utilities.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((kb_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kb_utilities.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = (SubLObject)kb_utilities.NIL;
                    final SubLObject token_var = (SubLObject)kb_utilities.NIL;
                    while (kb_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (kb_utilities.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)kb_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_utilities.$kw58$GAF, (SubLObject)kb_utilities.$kw83$TRUE, (SubLObject)kb_utilities.NIL);
                                SubLObject done_var_$96 = (SubLObject)kb_utilities.NIL;
                                final SubLObject token_var_$97 = (SubLObject)kb_utilities.NIL;
                                while (kb_utilities.NIL == done_var_$96) {
                                    final SubLObject isa_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$97);
                                    final SubLObject valid_$98 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$97.eql(isa_gaf));
                                    if (kb_utilities.NIL != valid_$98) {
                                        final SubLObject col = assertions_high.gaf_arg2(isa_gaf);
                                        dictionary_utilities.dictionary_increment(dict, col, (SubLObject)kb_utilities.UNPROVIDED);
                                    }
                                    done_var_$96 = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid_$98);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$95 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (kb_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$95, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$95, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$94, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        final SubLObject alist = dictionary_utilities.sort_dictionary_by_values(dict, Symbols.symbol_function((SubLObject)kb_utilities.$sym59$_));
        final SubLObject uncut_result = (kb_utilities.NIL != return_countsP) ? alist : list_utilities.alist_keys(alist);
        return list_utilities.first_n(n, uncut_result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 12597L)
    public static SubLObject setup_kb_shelf(final SubLObject size, final SubLObject key, final SubLObject minor_limit, final SubLObject major_limit) {
        final SubLObject info = shelfs.make_shelf_info((SubLObject)kb_utilities.UNPROVIDED);
        shelfs._csetf_shelf_info_key(info, key);
        shelfs._csetf_shelf_info_test(info, Symbols.symbol_function((SubLObject)kb_utilities.$sym84$_));
        shelfs._csetf_shelf_info_compare(info, Symbols.symbol_function((SubLObject)kb_utilities.$sym85$_));
        shelfs._csetf_shelf_info_minor_limit(info, minor_limit);
        shelfs._csetf_shelf_info_major_limit(info, major_limit);
        return shelfs.allocate_shelf(size, info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 13625L)
    public static SubLObject estimated_assertions_per_constant() {
        return kb_utilities.$estimated_assertions_per_constant$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 13726L)
    public static SubLObject estimated_constants_per_nart() {
        return kb_utilities.$estimated_constants_per_nart$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 13816L)
    public static SubLObject estimated_assertions_per_deduction() {
        return kb_utilities.$estimated_assertions_per_deduction$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 13918L)
    public static SubLObject estimated_assertions_per_clause_struc() {
        return kb_utilities.$estimated_assertions_per_clause_struc$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 14026L)
    public static SubLObject estimated_assertions_per_meta_assertion() {
        return kb_utilities.$estimated_assertions_per_meta_assertion$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 14138L)
    public static SubLObject estimated_arguments_per_assertion() {
        return kb_utilities.$estimated_arguments_per_assertion$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 14238L)
    public static SubLObject estimated_assertions_per_unrepresented_term() {
        return kb_utilities.$estimated_assertions_per_unrepresented_term$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 14358L)
    public static SubLObject estimated_deductions_per_hl_support() {
        return kb_utilities.$estimated_deductions_per_hl_support$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 14462L)
    public static SubLObject estimated_assertions_per_hl_support() {
        return Numbers.multiply(estimated_assertions_per_deduction(), estimated_deductions_per_hl_support());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 14608L)
    public static SubLObject setup_kb_tables(final SubLObject constant_count) {
        final SubLObject nart_count = Numbers.truncate(Numbers.divide(constant_count, kb_utilities.$estimated_constants_per_nart$.getGlobalValue()), (SubLObject)kb_utilities.UNPROVIDED);
        final SubLObject assertion_count = Numbers.truncate(Numbers.multiply(constant_count, kb_utilities.$estimated_assertions_per_constant$.getGlobalValue()), (SubLObject)kb_utilities.UNPROVIDED);
        final SubLObject deduction_count = Numbers.truncate(Numbers.divide(assertion_count, kb_utilities.$estimated_assertions_per_deduction$.getGlobalValue()), (SubLObject)kb_utilities.UNPROVIDED);
        final SubLObject kb_hl_support_count = Numbers.truncate(Numbers.divide(deduction_count, kb_utilities.$estimated_deductions_per_hl_support$.getGlobalValue()), (SubLObject)kb_utilities.UNPROVIDED);
        final SubLObject clause_struc_count = Numbers.truncate(Numbers.divide(assertion_count, kb_utilities.$estimated_assertions_per_clause_struc$.getGlobalValue()), (SubLObject)kb_utilities.UNPROVIDED);
        final SubLObject unrepresented_term_count = Numbers.truncate(Numbers.divide(assertion_count, kb_utilities.$estimated_assertions_per_unrepresented_term$.getGlobalValue()), (SubLObject)kb_utilities.UNPROVIDED);
        return setup_kb_tables_int((SubLObject)kb_utilities.NIL, constant_count, nart_count, assertion_count, deduction_count, kb_hl_support_count, clause_struc_count, unrepresented_term_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 15551L)
    public static SubLObject setup_kb_tables_int(final SubLObject exactP, SubLObject constant_count, SubLObject nart_count, SubLObject assertion_count, SubLObject deduction_count, SubLObject kb_hl_support_count, SubLObject clause_struc_count, SubLObject kb_unrepresented_term_count) {
        if (kb_unrepresented_term_count == kb_utilities.UNPROVIDED) {
            kb_unrepresented_term_count = (SubLObject)kb_utilities.NIL;
        }
        if (kb_utilities.NIL == kb_unrepresented_term_count) {
            kb_unrepresented_term_count = Numbers.truncate(Numbers.divide(assertion_count, kb_utilities.$estimated_assertions_per_unrepresented_term$.getGlobalValue()), (SubLObject)kb_utilities.UNPROVIDED);
        }
        constant_count = Numbers.ceiling(Numbers.multiply(constant_count, kb_utilities.$kb_table_padding_multiplier$.getGlobalValue()), (SubLObject)kb_utilities.UNPROVIDED);
        nart_count = Numbers.ceiling(Numbers.multiply(nart_count, kb_utilities.$kb_table_padding_multiplier$.getGlobalValue()), (SubLObject)kb_utilities.UNPROVIDED);
        assertion_count = Numbers.ceiling(Numbers.multiply(assertion_count, kb_utilities.$kb_table_padding_multiplier$.getGlobalValue()), (SubLObject)kb_utilities.UNPROVIDED);
        deduction_count = Numbers.ceiling(Numbers.multiply(deduction_count, kb_utilities.$kb_table_padding_multiplier$.getGlobalValue()), (SubLObject)kb_utilities.UNPROVIDED);
        kb_hl_support_count = Numbers.ceiling(Numbers.multiply(kb_hl_support_count, kb_utilities.$kb_table_padding_multiplier$.getGlobalValue()), (SubLObject)kb_utilities.UNPROVIDED);
        clause_struc_count = Numbers.ceiling(Numbers.multiply(clause_struc_count, kb_utilities.$kb_table_padding_multiplier$.getGlobalValue()), (SubLObject)kb_utilities.UNPROVIDED);
        kb_unrepresented_term_count = Numbers.ceiling(Numbers.multiply(kb_unrepresented_term_count, kb_utilities.$kb_table_padding_multiplier$.getGlobalValue()), (SubLObject)kb_utilities.UNPROVIDED);
        setup_kb_fort_tables(constant_count, nart_count, exactP);
        setup_kb_assertion_tables(assertion_count, exactP);
        setup_kb_deduction_tables(deduction_count, exactP);
        setup_kb_hl_support_tables(kb_hl_support_count, exactP);
        clause_strucs.setup_clause_struc_table(clause_struc_count, exactP);
        unrepresented_terms.setup_unrepresented_term_table(kb_unrepresented_term_count, exactP);
        variables.setup_variable_table();
        kb_indexing_datastructures.setup_indexing_tables(constant_count);
        assertions_low.setup_rule_set(assertion_count);
        cardinality_estimates.setup_cardinality_tables(constant_count);
        return constant_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 17442L)
    public static SubLObject resize_all_kb_object_manager_lru_caches() {
        constant_index_manager.resize_constant_index_kbom_lru((SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        nart_index_manager.resize_nart_index_kbom_lru((SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        nart_hl_formula_manager.resize_nart_hl_formula_kbom_lru((SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        assertion_manager.resize_assertion_content_kbom_lru((SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        kb_hl_support_manager.resize_kb_hl_support_content_kbom_lru((SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        deduction_manager.resize_deduction_content_kbom_lru((SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        unrepresented_term_index_manager.resize_unrepresented_term_index_kbom_lru((SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 17957L)
    public static SubLObject resize_kb_object_manager_lru_caches_for_rebuild() {
        constant_index_manager.resize_constant_index_kbom_lru((SubLObject)kb_utilities.ONE_INTEGER, (SubLObject)kb_utilities.$int94$1000);
        nart_index_manager.resize_nart_index_kbom_lru((SubLObject)kb_utilities.ONE_INTEGER, (SubLObject)kb_utilities.$int94$1000);
        nart_hl_formula_manager.resize_nart_hl_formula_kbom_lru((SubLObject)kb_utilities.ONE_INTEGER, (SubLObject)kb_utilities.$int94$1000);
        assertion_manager.resize_assertion_content_kbom_lru((SubLObject)kb_utilities.ONE_INTEGER, (SubLObject)kb_utilities.$int94$1000);
        kb_hl_support_manager.resize_kb_hl_support_content_kbom_lru((SubLObject)kb_utilities.ONE_INTEGER, (SubLObject)kb_utilities.$int94$1000);
        deduction_manager.resize_deduction_content_kbom_lru((SubLObject)kb_utilities.ONE_INTEGER, (SubLObject)kb_utilities.$int94$1000);
        unrepresented_term_index_manager.resize_unrepresented_term_index_kbom_lru((SubLObject)kb_utilities.ONE_INTEGER, (SubLObject)kb_utilities.$int94$1000);
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 18467L)
    public static SubLObject setup_kb_fort_tables(final SubLObject constant_count, final SubLObject nart_count, final SubLObject exactP) {
        constant_handles.setup_constant_tables(constant_count, exactP);
        nart_handles.setup_nart_table(nart_count, exactP);
        nart_hl_formula_manager.setup_nart_hl_formula_table(nart_count, exactP);
        nart_index_manager.setup_nart_index_table(nart_count, exactP);
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 18989L)
    public static SubLObject setup_kb_assertion_tables(final SubLObject assertion_table_size, final SubLObject exactP) {
        assertion_handles.setup_assertion_table(assertion_table_size, exactP);
        assertion_manager.setup_assertion_content_table(assertion_table_size, exactP);
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 19199L)
    public static SubLObject setup_kb_deduction_tables(final SubLObject deduction_table_size, final SubLObject exactP) {
        deduction_handles.setup_deduction_table(deduction_table_size, exactP);
        deduction_manager.setup_deduction_content_table(deduction_table_size, exactP);
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 19413L)
    public static SubLObject setup_kb_hl_support_tables(final SubLObject size, final SubLObject exactP) {
        kb_hl_support_handles.setup_kb_hl_support_id_tables(size, exactP);
        kb_hl_support_handles.setup_kb_hl_support_index_table();
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 19568L)
    public static SubLObject finalize_kb_tables() {
        finalize_kb_fort_tables();
        assertion_handles.finalize_assertions((SubLObject)kb_utilities.UNPROVIDED);
        deduction_handles.finalize_deductions((SubLObject)kb_utilities.UNPROVIDED);
        kb_hl_support_handles.finalize_kb_hl_supports((SubLObject)kb_utilities.UNPROVIDED);
        clause_strucs.finalize_clause_strucs((SubLObject)kb_utilities.UNPROVIDED);
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 19911L)
    public static SubLObject finalize_kb_fort_tables() {
        constant_handles.finalize_constants((SubLObject)kb_utilities.UNPROVIDED);
        nart_handles.finalize_narts((SubLObject)kb_utilities.UNPROVIDED);
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 20370L)
    public static SubLObject clear_kb_state(SubLObject constant_count) {
        if (constant_count == kb_utilities.UNPROVIDED) {
            constant_count = kb_utilities.$default_estimated_constant_count$.getDynamicValue();
        }
        setup_kb_tables(constant_count);
        return clear_kb_state_int();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 20588L)
    public static SubLObject clear_kb_state_int() {
        clause_strucs.free_all_clause_strucs();
        kb_hl_support_handles.free_all_kb_hl_support();
        deduction_handles.free_all_deductions();
        assertion_handles.free_all_assertions();
        nart_handles.free_all_narts();
        constant_handles.free_all_constants();
        constant_completion_high.map_constants_in_completions(Symbols.symbol_function((SubLObject)kb_utilities.$sym96$INIT_CONSTANT));
        unrepresented_terms.clear_unrepresented_term_table();
        bookkeeping_store.clear_bookkeeping_binary_gaf_store();
        clear_kb_state_hashes();
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 21246L)
    public static SubLObject clear_kb_fort_state(SubLObject constant_count) {
        if (constant_count == kb_utilities.UNPROVIDED) {
            constant_count = kb_utilities.$default_estimated_constant_count$.getDynamicValue();
        }
        final SubLObject nart_count = Numbers.truncate(Numbers.divide(constant_count, kb_utilities.$estimated_constants_per_nart$.getGlobalValue()), (SubLObject)kb_utilities.UNPROVIDED);
        setup_kb_fort_tables(constant_count, nart_count, (SubLObject)kb_utilities.NIL);
        nart_handles.free_all_narts();
        constant_handles.free_all_constants();
        constant_completion_high.map_constants_in_completions(Symbols.symbol_function((SubLObject)kb_utilities.$sym96$INIT_CONSTANT));
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 21794L)
    public static SubLObject possibly_clear_dumpable_kb_state_hashes() {
        if (kb_utilities.NIL != defns.defns_cache_unbuiltP()) {
            defns.clear_defns_cache();
        }
        if (kb_utilities.NIL != somewhere_cache.somewhere_cache_unbuiltP()) {
            somewhere_cache.clear_all_somewhere_caches();
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 22032L)
    public static SubLObject possibly_initialize_dumpable_kb_state_hashes() {
        if (kb_utilities.NIL != nart_hl_formula_manager.nart_hl_formulas_unbuiltP()) {
            narts_interface.initialize_nart_hl_formulas();
        }
        if (kb_utilities.NIL != sbhl_link_methods.non_fort_isa_tables_unbuiltP()) {
            sbhl_link_methods.rebuild_non_fort_isa_tables();
        }
        if (kb_utilities.NIL != tva_cache.tva_cache_unbuiltP()) {
            tva_cache.rebuild_tva_cache();
        }
        if (kb_utilities.NIL != defns.defns_cache_unbuiltP()) {
            defns.rebuild_defns_cache();
        }
        if (kb_utilities.NIL != somewhere_cache.somewhere_cache_unbuiltP()) {
            somewhere_cache.rebuild_somewhere_cache();
        }
        if (kb_utilities.NIL != arity.arity_cache_unbuiltP()) {
            arity.rebuild_arity_cache();
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 22552L)
    public static SubLObject clear_kb_state_hashes() {
        possibly_clear_dumpable_kb_state_hashes();
        after_adding.clear_after_addings();
        after_adding.clear_after_removings();
        equality_store.clear_some_equality_assertions_somewhere_set();
        at_utilities.clear_all_arg_type_predicate_caches();
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 22921L)
    public static SubLObject initialize_kb_state_hashes() {
        possibly_initialize_dumpable_kb_state_hashes();
        after_adding.rebuild_after_adding_caches();
        equality_store.initialize_some_equality_assertions_somewhere_set();
        at_utilities.initialize_all_arg_type_predicate_caches();
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 23210L)
    public static SubLObject swap_out_all_pristine_kb_objects() {
        assertion_manager.swap_out_all_pristine_assertions();
        deduction_manager.swap_out_all_pristine_deductions();
        constant_index_manager.swap_out_all_pristine_constant_indices();
        nart_index_manager.swap_out_all_pristine_nart_indices();
        nart_hl_formula_manager.swap_out_all_pristine_nart_hl_formulas();
        unrepresented_term_index_manager.swap_out_all_pristine_unrepresented_term_indices();
        kb_hl_support_manager.swap_out_all_pristine_kb_hl_supports();
        sbhl_graphs.swap_out_all_pristine_sbhl_module_graph_links();
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 23621L)
    public static SubLObject show_new_kb_state(SubLObject stream) {
        if (stream == kb_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject new_constant_count = constant_handles.new_constant_count();
        final SubLObject new_nart_count = nart_handles.new_nart_count();
        final SubLObject new_assertion_count = assertion_handles.new_assertion_count();
        final SubLObject new_deduction_count = deduction_handles.new_deduction_count();
        final SubLObject new_kb_hl_support_count = kb_hl_support_handles.new_kb_hl_support_count();
        final SubLObject new_unrepresented_term_count = unrepresented_terms.new_unrepresented_term_count();
        final SubLObject new_clause_struc_count = clause_strucs.new_clause_struc_count();
        PrintLow.format(stream, (SubLObject)kb_utilities.$str98$______KB__S_new_KB_objects__, control_vars.kb_loaded());
        PrintLow.format(stream, (SubLObject)kb_utilities.$str99$__New_FORTs__________________9___, Numbers.add(new_constant_count, new_nart_count));
        PrintLow.format(stream, (SubLObject)kb_utilities.$str100$___New_Constants_____________9___, new_constant_count);
        PrintLow.format(stream, (SubLObject)kb_utilities.$str101$___New_NARTs_________________9___, new_nart_count);
        PrintLow.format(stream, (SubLObject)kb_utilities.$str102$__New_Assertions_____________9___, new_assertion_count);
        PrintLow.format(stream, (SubLObject)kb_utilities.$str103$__New_Deductions_____________9___, new_deduction_count);
        PrintLow.format(stream, (SubLObject)kb_utilities.$str104$__New_KB_HL_Supports_________9___, new_kb_hl_support_count);
        PrintLow.format(stream, (SubLObject)kb_utilities.$str105$__New_Unrepresented_Terms____9___, new_unrepresented_term_count);
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 24969L)
    public static SubLObject clear_new_kb_state() {
        SubLObject start = constant_handles.new_constant_suid_threshold();
        SubLObject table_var = constant_handles.do_constants_table();
        SubLObject end_var;
        SubLObject end;
        SubLObject id;
        SubLObject constant;
        for (end = (end_var = id_index.id_index_next_id(table_var)), id = (SubLObject)kb_utilities.NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            constant = id_index.id_index_lookup(table_var, id, (SubLObject)kb_utilities.UNPROVIDED);
            if (kb_utilities.NIL != constant) {
                constants_high.remove_constant(constant);
            }
        }
        start = nart_handles.new_nart_id_threshold();
        table_var = nart_handles.do_narts_table();
        SubLObject nart;
        for (end = (end_var = id_index.id_index_next_id(table_var)), id = (SubLObject)kb_utilities.NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            nart = id_index.id_index_lookup(table_var, id, (SubLObject)kb_utilities.UNPROVIDED);
            if (kb_utilities.NIL != nart) {
                narts_high.remove_nart(nart);
            }
        }
        final SubLObject table_var2 = kb_hl_support_handles.do_kb_hl_supports_table();
        final SubLObject first_id_var = kb_hl_support_handles.new_kb_hl_support_id_threshold();
        SubLObject kb_hl_support;
        for (end = (end_var = id_index.id_index_next_id(table_var2)), id = (SubLObject)kb_utilities.NIL, id = first_id_var; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            kb_hl_support = id_index.id_index_lookup(table_var2, id, (SubLObject)kb_utilities.UNPROVIDED);
            if (kb_utilities.NIL != kb_hl_support) {
                kb_hl_supports_high.tms_remove_kb_hl_support(kb_hl_support);
            }
        }
        start = assertion_handles.get_file_backed_assertion_internal_id_threshold();
        table_var = assertion_handles.do_assertions_table();
        SubLObject assertion;
        for (end = (end_var = id_index.id_index_next_id(table_var)), id = (SubLObject)kb_utilities.NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            assertion = id_index.id_index_lookup(table_var, id, (SubLObject)kb_utilities.UNPROVIDED);
            if (kb_utilities.NIL != assertion) {
                tms.tms_remove_assertion(assertion);
            }
        }
        start = deduction_handles.get_file_backed_deduction_internal_id_threshold();
        table_var = deduction_handles.do_deductions_table();
        SubLObject deduction;
        for (end = (end_var = id_index.id_index_next_id(table_var)), id = (SubLObject)kb_utilities.NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            deduction = id_index.id_index_lookup(table_var, id, (SubLObject)kb_utilities.UNPROVIDED);
            if (kb_utilities.NIL != deduction) {
                tms.tms_remove_deduction(deduction);
            }
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 25428L)
    public static SubLObject show_new_kb_content(SubLObject n, SubLObject types, SubLObject stream) {
        if (n == kb_utilities.UNPROVIDED) {
            n = (SubLObject)kb_utilities.FIVE_INTEGER;
        }
        if (types == kb_utilities.UNPROVIDED) {
            types = (SubLObject)kb_utilities.$list108;
        }
        if (stream == kb_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)kb_utilities.T, thread);
            if (kb_utilities.NIL != list_utilities.member_eqP((SubLObject)kb_utilities.$kw38$CONSTANT, types)) {
                PrintLow.format(stream, (SubLObject)kb_utilities.$str109$__Recent_constants___);
                if (kb_utilities.NIL != subl_promotions.positive_integer_p(n)) {
                    final SubLObject list_var = constants_high.constants_around(constant_handles.next_constant_suid(), n, n, (SubLObject)kb_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$100 = utilities_macros.$progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_note$.bind((SubLObject)kb_utilities.$str110$mapping_constants_for_sweep, thread);
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                        utilities_macros.$progress_sofar$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject o = (SubLObject)kb_utilities.NIL;
                            o = csome_list_var.first();
                            while (kb_utilities.NIL != csome_list_var) {
                                PrintLow.format(stream, (SubLObject)kb_utilities.$str111$_____S__, o);
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kb_utilities.ONE_INTEGER), thread);
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                o = csome_list_var.first();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$101 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$101, thread);
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
                        utilities_macros.$progress_note$.rebind(_prev_bind_0_$100, thread);
                    }
                }
                else {
                    final SubLObject idx = constant_handles.do_constants_table();
                    final SubLObject mess = (SubLObject)kb_utilities.$str110$mapping_constants_for_sweep;
                    final SubLObject total = id_index.id_index_count(idx);
                    SubLObject sofar = (SubLObject)kb_utilities.ZERO_INTEGER;
                    assert kb_utilities.NIL != Types.stringp(mess) : mess;
                    final SubLObject _prev_bind_0_$102 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(mess);
                            final SubLObject idx_$103 = idx;
                            if (kb_utilities.NIL == id_index.id_index_objects_empty_p(idx_$103, (SubLObject)kb_utilities.$kw65$SKIP)) {
                                final SubLObject idx_$104 = idx_$103;
                                if (kb_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$104, (SubLObject)kb_utilities.$kw65$SKIP)) {
                                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$104);
                                    final SubLObject backwardP_var = (SubLObject)kb_utilities.NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject id;
                                    SubLObject o2;
                                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_utilities.NIL, v_iteration = (SubLObject)kb_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_utilities.ONE_INTEGER)) {
                                        id = ((kb_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_utilities.ONE_INTEGER) : v_iteration);
                                        o2 = Vectors.aref(vector_var, id);
                                        if (kb_utilities.NIL == id_index.id_index_tombstone_p(o2) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                            if (kb_utilities.NIL != id_index.id_index_tombstone_p(o2)) {
                                                o2 = (SubLObject)kb_utilities.$kw65$SKIP;
                                            }
                                            PrintLow.format(stream, (SubLObject)kb_utilities.$str111$_____S__, o2);
                                            sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$105 = idx_$103;
                                if (kb_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$105) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                    final SubLObject sparse = id_index.id_index_sparse_objects(idx_$105);
                                    SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$105);
                                    final SubLObject end_id = id_index.id_index_next_id(idx_$105);
                                    final SubLObject v_default = (SubLObject)((kb_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) ? kb_utilities.NIL : kb_utilities.$kw65$SKIP);
                                    while (id2.numL(end_id)) {
                                        final SubLObject o3 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                        if (kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP) || kb_utilities.NIL == id_index.id_index_tombstone_p(o3)) {
                                            PrintLow.format(stream, (SubLObject)kb_utilities.$str111$_____S__, o3);
                                            sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                        id2 = Numbers.add(id2, (SubLObject)kb_utilities.ONE_INTEGER);
                                    }
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$103 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$103, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_11, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_10, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_9, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$102, thread);
                    }
                }
            }
            if (kb_utilities.NIL != list_utilities.member_eqP((SubLObject)kb_utilities.$kw39$NART, types)) {
                PrintLow.format(stream, (SubLObject)kb_utilities.$str112$__Recent_NARTs___);
                if (kb_utilities.NIL != subl_promotions.positive_integer_p(n)) {
                    final SubLObject list_var = narts_high.narts_around(nart_handles.next_nart_id(), n, n, (SubLObject)kb_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$104 = utilities_macros.$progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_note$.bind((SubLObject)kb_utilities.$str113$mapping_narts_for_sweep, thread);
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                        utilities_macros.$progress_sofar$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject o = (SubLObject)kb_utilities.NIL;
                            o = csome_list_var.first();
                            while (kb_utilities.NIL != csome_list_var) {
                                PrintLow.format(stream, (SubLObject)kb_utilities.$str111$_____S__, narts_high.nart_el_formula(o));
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kb_utilities.ONE_INTEGER), thread);
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                o = csome_list_var.first();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$105 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                                final SubLObject _values3 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values3);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$105, thread);
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
                        utilities_macros.$progress_note$.rebind(_prev_bind_0_$104, thread);
                    }
                }
                else {
                    final SubLObject idx = nart_handles.do_narts_table();
                    final SubLObject mess = (SubLObject)kb_utilities.$str113$mapping_narts_for_sweep;
                    final SubLObject total = id_index.id_index_count(idx);
                    SubLObject sofar = (SubLObject)kb_utilities.ZERO_INTEGER;
                    assert kb_utilities.NIL != Types.stringp(mess) : mess;
                    final SubLObject _prev_bind_0_$106 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(mess);
                            final SubLObject idx_$106 = idx;
                            if (kb_utilities.NIL == id_index.id_index_objects_empty_p(idx_$106, (SubLObject)kb_utilities.$kw65$SKIP)) {
                                final SubLObject idx_$107 = idx_$106;
                                if (kb_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$107, (SubLObject)kb_utilities.$kw65$SKIP)) {
                                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$107);
                                    final SubLObject backwardP_var = (SubLObject)kb_utilities.NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject id;
                                    SubLObject o2;
                                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_utilities.NIL, v_iteration = (SubLObject)kb_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_utilities.ONE_INTEGER)) {
                                        id = ((kb_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_utilities.ONE_INTEGER) : v_iteration);
                                        o2 = Vectors.aref(vector_var, id);
                                        if (kb_utilities.NIL == id_index.id_index_tombstone_p(o2) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                            if (kb_utilities.NIL != id_index.id_index_tombstone_p(o2)) {
                                                o2 = (SubLObject)kb_utilities.$kw65$SKIP;
                                            }
                                            PrintLow.format(stream, (SubLObject)kb_utilities.$str111$_____S__, narts_high.nart_el_formula(o2));
                                            sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$108 = idx_$106;
                                if (kb_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$108) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                    final SubLObject sparse = id_index.id_index_sparse_objects(idx_$108);
                                    SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$108);
                                    final SubLObject end_id = id_index.id_index_next_id(idx_$108);
                                    final SubLObject v_default = (SubLObject)((kb_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) ? kb_utilities.NIL : kb_utilities.$kw65$SKIP);
                                    while (id2.numL(end_id)) {
                                        final SubLObject o3 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                        if (kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP) || kb_utilities.NIL == id_index.id_index_tombstone_p(o3)) {
                                            PrintLow.format(stream, (SubLObject)kb_utilities.$str111$_____S__, narts_high.nart_el_formula(o3));
                                            sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                        id2 = Numbers.add(id2, (SubLObject)kb_utilities.ONE_INTEGER);
                                    }
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$107 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                                final SubLObject _values4 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values4);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$107, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_11, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_10, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_9, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$106, thread);
                    }
                }
            }
            if (kb_utilities.NIL != list_utilities.member_eqP((SubLObject)kb_utilities.$kw40$ASSERTION, types)) {
                PrintLow.format(stream, (SubLObject)kb_utilities.$str114$__Recent_assertions___);
                if (kb_utilities.NIL != subl_promotions.positive_integer_p(n)) {
                    final SubLObject list_var = assertions_high.assertions_around(assertion_handles.next_assertion_id(), n, n, (SubLObject)kb_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$108 = utilities_macros.$progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_note$.bind((SubLObject)kb_utilities.$str115$mapping_assertions_for_sweep, thread);
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                        utilities_macros.$progress_sofar$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject o = (SubLObject)kb_utilities.NIL;
                            o = csome_list_var.first();
                            while (kb_utilities.NIL != csome_list_var) {
                                PrintLow.format(stream, (SubLObject)kb_utilities.$str111$_____S__, uncanonicalizer.assertion_el_ist_formula(o));
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kb_utilities.ONE_INTEGER), thread);
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                o = csome_list_var.first();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$109 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                                final SubLObject _values5 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values5);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$109, thread);
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
                        utilities_macros.$progress_note$.rebind(_prev_bind_0_$108, thread);
                    }
                }
                else {
                    final SubLObject idx = assertion_handles.do_assertions_table();
                    final SubLObject mess = (SubLObject)kb_utilities.$str115$mapping_assertions_for_sweep;
                    final SubLObject total = id_index.id_index_count(idx);
                    SubLObject sofar = (SubLObject)kb_utilities.ZERO_INTEGER;
                    assert kb_utilities.NIL != Types.stringp(mess) : mess;
                    final SubLObject _prev_bind_0_$110 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(mess);
                            final SubLObject idx_$109 = idx;
                            if (kb_utilities.NIL == id_index.id_index_objects_empty_p(idx_$109, (SubLObject)kb_utilities.$kw65$SKIP)) {
                                final SubLObject idx_$110 = idx_$109;
                                if (kb_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$110, (SubLObject)kb_utilities.$kw65$SKIP)) {
                                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$110);
                                    final SubLObject backwardP_var = (SubLObject)kb_utilities.NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject a_id;
                                    SubLObject a_handle;
                                    SubLObject o4;
                                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_utilities.NIL, v_iteration = (SubLObject)kb_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_utilities.ONE_INTEGER)) {
                                        a_id = ((kb_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_utilities.ONE_INTEGER) : v_iteration);
                                        a_handle = Vectors.aref(vector_var, a_id);
                                        if (kb_utilities.NIL == id_index.id_index_tombstone_p(a_handle) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                            if (kb_utilities.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                                a_handle = (SubLObject)kb_utilities.$kw65$SKIP;
                                            }
                                            o4 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                            PrintLow.format(stream, (SubLObject)kb_utilities.$str111$_____S__, uncanonicalizer.assertion_el_ist_formula(o4));
                                            sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$111 = idx_$109;
                                if (kb_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$111) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                    final SubLObject sparse = id_index.id_index_sparse_objects(idx_$111);
                                    SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$111);
                                    final SubLObject end_id = id_index.id_index_next_id(idx_$111);
                                    final SubLObject v_default = (SubLObject)((kb_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) ? kb_utilities.NIL : kb_utilities.$kw65$SKIP);
                                    while (a_id2.numL(end_id)) {
                                        final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                        if (kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP) || kb_utilities.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                            final SubLObject o2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                            PrintLow.format(stream, (SubLObject)kb_utilities.$str111$_____S__, uncanonicalizer.assertion_el_ist_formula(o2));
                                            sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                        a_id2 = Numbers.add(a_id2, (SubLObject)kb_utilities.ONE_INTEGER);
                                    }
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$111 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                                final SubLObject _values6 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values6);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$111, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_11, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_10, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_9, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$110, thread);
                    }
                }
            }
            if (kb_utilities.NIL != list_utilities.member_eqP((SubLObject)kb_utilities.$kw41$DEDUCTION, types)) {
                PrintLow.format(stream, (SubLObject)kb_utilities.$str116$__Recent_deductions___);
                if (kb_utilities.NIL != subl_promotions.positive_integer_p(n)) {
                    final SubLObject list_var = deductions_high.deductions_around(deduction_handles.next_deduction_id(), n, n, (SubLObject)kb_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$112 = utilities_macros.$progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_note$.bind((SubLObject)kb_utilities.$str117$mapping_deductions_for_sweep, thread);
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                        utilities_macros.$progress_sofar$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject o = (SubLObject)kb_utilities.NIL;
                            o = csome_list_var.first();
                            while (kb_utilities.NIL != csome_list_var) {
                                PrintLow.format(stream, (SubLObject)kb_utilities.$str111$_____S__, o);
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kb_utilities.ONE_INTEGER), thread);
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                o = csome_list_var.first();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$113 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                                final SubLObject _values7 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values7);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$113, thread);
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
                        utilities_macros.$progress_note$.rebind(_prev_bind_0_$112, thread);
                    }
                }
                else {
                    final SubLObject idx = deduction_handles.do_deductions_table();
                    final SubLObject mess = (SubLObject)kb_utilities.$str117$mapping_deductions_for_sweep;
                    final SubLObject total = id_index.id_index_count(idx);
                    SubLObject sofar = (SubLObject)kb_utilities.ZERO_INTEGER;
                    assert kb_utilities.NIL != Types.stringp(mess) : mess;
                    final SubLObject _prev_bind_0_$114 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(mess);
                            final SubLObject idx_$112 = idx;
                            if (kb_utilities.NIL == id_index.id_index_objects_empty_p(idx_$112, (SubLObject)kb_utilities.$kw65$SKIP)) {
                                final SubLObject idx_$113 = idx_$112;
                                if (kb_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$113, (SubLObject)kb_utilities.$kw65$SKIP)) {
                                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$113);
                                    final SubLObject backwardP_var = (SubLObject)kb_utilities.NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject o4;
                                    SubLObject d_id;
                                    SubLObject d_handle;
                                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_utilities.NIL, v_iteration = (SubLObject)kb_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_utilities.ONE_INTEGER)) {
                                        d_id = ((kb_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_utilities.ONE_INTEGER) : v_iteration);
                                        d_handle = Vectors.aref(vector_var, d_id);
                                        if (kb_utilities.NIL == id_index.id_index_tombstone_p(d_handle) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                            if (kb_utilities.NIL != id_index.id_index_tombstone_p(d_handle)) {
                                                d_handle = (SubLObject)kb_utilities.$kw65$SKIP;
                                            }
                                            o4 = deduction_handles.resolve_deduction_id_value_pair(d_id, d_handle);
                                            PrintLow.format(stream, (SubLObject)kb_utilities.$str111$_____S__, o4);
                                            sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$114 = idx_$112;
                                if (kb_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$114) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                    final SubLObject sparse = id_index.id_index_sparse_objects(idx_$114);
                                    SubLObject d_id2 = id_index.id_index_sparse_id_threshold(idx_$114);
                                    final SubLObject end_id = id_index.id_index_next_id(idx_$114);
                                    final SubLObject v_default = (SubLObject)((kb_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) ? kb_utilities.NIL : kb_utilities.$kw65$SKIP);
                                    while (d_id2.numL(end_id)) {
                                        final SubLObject d_handle2 = Hashtables.gethash_without_values(d_id2, sparse, v_default);
                                        if (kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP) || kb_utilities.NIL == id_index.id_index_tombstone_p(d_handle2)) {
                                            final SubLObject o2 = deduction_handles.resolve_deduction_id_value_pair(d_id2, d_handle2);
                                            PrintLow.format(stream, (SubLObject)kb_utilities.$str111$_____S__, o2);
                                            sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                        d_id2 = Numbers.add(d_id2, (SubLObject)kb_utilities.ONE_INTEGER);
                                    }
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$115 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                                final SubLObject _values8 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values8);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$115, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_11, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_10, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_9, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$114, thread);
                    }
                }
            }
            if (kb_utilities.NIL != list_utilities.member_eqP((SubLObject)kb_utilities.$kw118$KB_HL_SUPPORTS, types)) {
                PrintLow.format(stream, (SubLObject)kb_utilities.$str119$__Recent_KB_HL_supports___);
                if (kb_utilities.NIL != subl_promotions.positive_integer_p(n)) {
                    final SubLObject list_var = kb_hl_supports_high.kb_hl_supports_around(kb_hl_support_handles.next_kb_hl_support_id(), n, n, (SubLObject)kb_utilities.UNPROVIDED);
                    final SubLObject _prev_bind_0_$116 = utilities_macros.$progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_note$.bind((SubLObject)kb_utilities.$str120$mapping_kb_hl_supports_for_sweep, thread);
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                        utilities_macros.$progress_sofar$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject o = (SubLObject)kb_utilities.NIL;
                            o = csome_list_var.first();
                            while (kb_utilities.NIL != csome_list_var) {
                                PrintLow.format(stream, (SubLObject)kb_utilities.$str111$_____S__, el_utilities.sefify(o));
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kb_utilities.ONE_INTEGER), thread);
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                o = csome_list_var.first();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$117 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                                final SubLObject _values9 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values9);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$117, thread);
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
                        utilities_macros.$progress_note$.rebind(_prev_bind_0_$116, thread);
                    }
                }
                else {
                    final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
                    final SubLObject mess = (SubLObject)kb_utilities.$str120$mapping_kb_hl_supports_for_sweep;
                    final SubLObject total = id_index.id_index_count(idx);
                    SubLObject sofar = (SubLObject)kb_utilities.ZERO_INTEGER;
                    assert kb_utilities.NIL != Types.stringp(mess) : mess;
                    final SubLObject _prev_bind_0_$118 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(mess);
                            final SubLObject idx_$115 = idx;
                            if (kb_utilities.NIL == id_index.id_index_objects_empty_p(idx_$115, (SubLObject)kb_utilities.$kw65$SKIP)) {
                                final SubLObject idx_$116 = idx_$115;
                                if (kb_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$116, (SubLObject)kb_utilities.$kw65$SKIP)) {
                                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$116);
                                    final SubLObject backwardP_var = (SubLObject)kb_utilities.NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject o4;
                                    SubLObject s_id;
                                    SubLObject s_handle;
                                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_utilities.NIL, v_iteration = (SubLObject)kb_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_utilities.ONE_INTEGER)) {
                                        s_id = ((kb_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_utilities.ONE_INTEGER) : v_iteration);
                                        s_handle = Vectors.aref(vector_var, s_id);
                                        if (kb_utilities.NIL == id_index.id_index_tombstone_p(s_handle) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                            if (kb_utilities.NIL != id_index.id_index_tombstone_p(s_handle)) {
                                                s_handle = (SubLObject)kb_utilities.$kw65$SKIP;
                                            }
                                            o4 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                            PrintLow.format(stream, (SubLObject)kb_utilities.$str111$_____S__, el_utilities.sefify(o4));
                                            sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$117 = idx_$115;
                                if (kb_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$117) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                    final SubLObject sparse = id_index.id_index_sparse_objects(idx_$117);
                                    SubLObject s_id2 = id_index.id_index_sparse_id_threshold(idx_$117);
                                    final SubLObject end_id = id_index.id_index_next_id(idx_$117);
                                    final SubLObject v_default = (SubLObject)((kb_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) ? kb_utilities.NIL : kb_utilities.$kw65$SKIP);
                                    while (s_id2.numL(end_id)) {
                                        final SubLObject s_handle2 = Hashtables.gethash_without_values(s_id2, sparse, v_default);
                                        if (kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP) || kb_utilities.NIL == id_index.id_index_tombstone_p(s_handle2)) {
                                            final SubLObject o2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                            PrintLow.format(stream, (SubLObject)kb_utilities.$str111$_____S__, el_utilities.sefify(o2));
                                            sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                            utilities_macros.note_percent_progress(sofar, total);
                                        }
                                        s_id2 = Numbers.add(s_id2, (SubLObject)kb_utilities.ONE_INTEGER);
                                    }
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$119 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                                final SubLObject _values10 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values10);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$119, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_11, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_10, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_9, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$118, thread);
                    }
                }
            }
        }
        finally {
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 26505L)
    public static SubLObject cyc_memory_hogs(SubLObject verboseP, SubLObject stream) {
        if (verboseP == kb_utilities.UNPROVIDED) {
            verboseP = (SubLObject)kb_utilities.NIL;
        }
        if (stream == kb_utilities.UNPROVIDED) {
            stream = (SubLObject)kb_utilities.T;
        }
        final SubLObject data = cyc_memory_hogs_data();
        format_nil.force_format(stream, (SubLObject)kb_utilities.$str121$__, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        PrintLow.format(stream, (SubLObject)((kb_utilities.NIL != verboseP) ? kb_utilities.$str122$Cyc_Structures___ : kb_utilities.$str123$__));
        PrintLow.format(stream, (SubLObject)((kb_utilities.NIL != verboseP) ? kb_utilities.$str124$__Problem_stores___A_A___A_infere : kb_utilities.$str125$_problem_stores___A_A__inferences), new SubLObject[] { conses_high.getf(data, (SubLObject)kb_utilities.$kw126$PROBLEM_STORES, (SubLObject)kb_utilities.UNPROVIDED), conses_high.getf(data, (SubLObject)kb_utilities.$kw127$FORWARD_PROBLEM_STORES, (SubLObject)kb_utilities.UNPROVIDED).isZero() ? kb_utilities.$str130$ : Sequences.cconcatenate((SubLObject)kb_utilities.$str128$__, new SubLObject[] { format_nil.format_nil_s_no_copy(conses_high.getf(data, (SubLObject)kb_utilities.$kw127$FORWARD_PROBLEM_STORES, (SubLObject)kb_utilities.UNPROVIDED)), kb_utilities.$str129$_forward_ }), conses_high.getf(data, (SubLObject)kb_utilities.$kw131$INFERENCES, (SubLObject)kb_utilities.UNPROVIDED), conses_high.getf(data, (SubLObject)kb_utilities.$kw132$PROOFS, (SubLObject)kb_utilities.UNPROVIDED), conses_high.getf(data, (SubLObject)kb_utilities.$kw133$PROBLEMS, (SubLObject)kb_utilities.UNPROVIDED) });
        PrintLow.format(stream, (SubLObject)((kb_utilities.NIL != verboseP) ? kb_utilities.$str134$__KB_Objects_swapped_in___A__ : kb_utilities.$str135$_____kb_objects_swapped_in___A_), conses_high.getf(data, (SubLObject)kb_utilities.$kw136$KB_OBJECTS_IN_MEMORY, (SubLObject)kb_utilities.UNPROVIDED));
        PrintLow.format(stream, (SubLObject)((kb_utilities.NIL != verboseP) ? kb_utilities.$str137$__Ephemeral_terms___A__ : kb_utilities.$str138$_ephemeral_terms___A_), conses_high.getf(data, (SubLObject)kb_utilities.$kw139$EPHEMERAL_TERMS, (SubLObject)kb_utilities.UNPROVIDED));
        if (kb_utilities.NIL != conses_high.getf(data, (SubLObject)kb_utilities.$kw140$SBHL_CACHE_MISSES, (SubLObject)kb_utilities.UNPROVIDED)) {
            PrintLow.format(stream, (SubLObject)((kb_utilities.NIL != verboseP) ? kb_utilities.$str141$__SBHL_cache_misses_hash_table___ : kb_utilities.$str142$_sbhl_cache_misses___A_), conses_high.getf(data, (SubLObject)kb_utilities.$kw140$SBHL_CACHE_MISSES, (SubLObject)kb_utilities.UNPROVIDED));
            if (kb_utilities.NIL != verboseP) {
                Functions.funcall((SubLObject)kb_utilities.$sym143$PRINT_SBHL_CACHE_MISSES_TOP_N);
            }
        }
        PrintLow.format(stream, (SubLObject)((kb_utilities.NIL != verboseP) ? kb_utilities.$str144$__Global_cache_entries___A__ : kb_utilities.$str145$_global_cache_entries___A__), conses_high.getf(data, (SubLObject)kb_utilities.$kw146$GLOBAL_CACHE_ENTRIES, (SubLObject)kb_utilities.UNPROVIDED));
        streams_high.force_output((SubLObject)kb_utilities.T);
        SubLObjectFactory.makeBoolean(kb_utilities.ZERO_INTEGER.numL(conses_high.getf(data, (SubLObject)kb_utilities.$kw147$UNDESTROYED_ITEMS, (SubLObject)kb_utilities.UNPROVIDED)) || kb_utilities.ZERO_INTEGER.numL(conses_high.getf(data, (SubLObject)kb_utilities.$kw148$FORWARD_INFERENCE_METRICS, (SubLObject)kb_utilities.UNPROVIDED)));
        if (kb_utilities.NIL == verboseP) {
            PrintLow.format(stream, (SubLObject)kb_utilities.$str149$____);
        }
        if (kb_utilities.ZERO_INTEGER.numL(conses_high.getf(data, (SubLObject)kb_utilities.$kw147$UNDESTROYED_ITEMS, (SubLObject)kb_utilities.UNPROVIDED))) {
            PrintLow.format(stream, (SubLObject)((kb_utilities.NIL != verboseP) ? kb_utilities.$str150$__Undestroyed_items___A__ : kb_utilities.$str151$_undestroyed_items___A), conses_high.getf(data, (SubLObject)kb_utilities.$kw147$UNDESTROYED_ITEMS, (SubLObject)kb_utilities.UNPROVIDED));
        }
        if (kb_utilities.ZERO_INTEGER.numL(conses_high.getf(data, (SubLObject)kb_utilities.$kw148$FORWARD_INFERENCE_METRICS, (SubLObject)kb_utilities.UNPROVIDED))) {
            if (kb_utilities.ZERO_INTEGER.numL(conses_high.getf(data, (SubLObject)kb_utilities.$kw147$UNDESTROYED_ITEMS, (SubLObject)kb_utilities.UNPROVIDED))) {
                PrintLow.format(stream, (SubLObject)kb_utilities.$str152$_);
            }
            PrintLow.format(stream, (SubLObject)((kb_utilities.NIL != verboseP) ? kb_utilities.$str153$__Forward_inference_metrics___A__ : kb_utilities.$str154$_forward_metrics___A), conses_high.getf(data, (SubLObject)kb_utilities.$kw148$FORWARD_INFERENCE_METRICS, (SubLObject)kb_utilities.UNPROVIDED));
        }
        if (kb_utilities.NIL == verboseP) {
            streams_high.terpri(stream);
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 28701L)
    public static SubLObject cyc_memory_hogs_data() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject data = (SubLObject)kb_utilities.NIL;
        final SubLObject cached_constant_index_count = constant_index_manager.cached_constant_index_count();
        final SubLObject cached_nart_index_count = nart_index_manager.cached_nart_index_count();
        final SubLObject cached_nart_hl_formula_count = nart_hl_formula_manager.cached_nart_hl_formula_count();
        final SubLObject cached_assertion_count = assertion_manager.cached_assertion_count();
        final SubLObject cached_deduction_count = deduction_manager.cached_deduction_count();
        final SubLObject cached_kb_hl_support_count = kb_hl_support_manager.cached_kb_hl_support_count();
        final SubLObject cached_unrepresented_term_index_count = unrepresented_term_index_manager.cached_unrepresented_term_index_count();
        final SubLObject total_object_count = Numbers.add(new SubLObject[] { cached_constant_index_count, cached_nart_index_count, cached_nart_hl_formula_count, cached_assertion_count, cached_deduction_count, cached_kb_hl_support_count, cached_unrepresented_term_index_count });
        data = conses_high.putf(data, (SubLObject)kb_utilities.$kw126$PROBLEM_STORES, inference_datastructures_problem_store.problem_store_count());
        data = conses_high.putf(data, (SubLObject)kb_utilities.$kw131$INFERENCES, inference_datastructures_inference.inference_count());
        data = conses_high.putf(data, (SubLObject)kb_utilities.$kw127$FORWARD_PROBLEM_STORES, (SubLObject)((kb_utilities.NIL != Sequences.find_if((SubLObject)kb_utilities.$sym155$PROBLEM_STORE_FORWARD_, inference_datastructures_problem_store.all_problem_stores(), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED)) ? Sequences.count_if((SubLObject)kb_utilities.$sym155$PROBLEM_STORE_FORWARD_, inference_datastructures_problem_store.all_problem_stores(), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED) : kb_utilities.ZERO_INTEGER));
        data = conses_high.putf(data, (SubLObject)kb_utilities.$kw133$PROBLEMS, Functions.apply((SubLObject)kb_utilities.$sym156$_, Mapping.mapcar((SubLObject)kb_utilities.$sym157$PROBLEM_STORE_PROBLEM_COUNT, inference_datastructures_problem_store.all_problem_stores())));
        data = conses_high.putf(data, (SubLObject)kb_utilities.$kw132$PROOFS, Functions.apply((SubLObject)kb_utilities.$sym156$_, Mapping.mapcar((SubLObject)kb_utilities.$sym158$PROBLEM_STORE_PROOF_COUNT, inference_datastructures_problem_store.all_problem_stores())));
        data = conses_high.putf(data, (SubLObject)kb_utilities.$kw148$FORWARD_INFERENCE_METRICS, Sequences.length(inference_metrics.forward_inference_metrics_info((SubLObject)kb_utilities.UNPROVIDED)));
        data = conses_high.putf(data, (SubLObject)kb_utilities.$kw136$KB_OBJECTS_IN_MEMORY, total_object_count);
        data = conses_high.putf(data, (SubLObject)kb_utilities.$kw139$EPHEMERAL_TERMS, Sequences.length(kb_cleanup.all_ephemeral_terms()));
        if (kb_utilities.NIL != sbhl_cache.$sbhl_cache_misses_hash_table$.getDynamicValue(thread)) {
            data = conses_high.putf(data, (SubLObject)kb_utilities.$kw140$SBHL_CACHE_MISSES, Hashtables.hash_table_count(sbhl_cache.$sbhl_cache_misses_hash_table$.getDynamicValue(thread)));
        }
        data = conses_high.putf(data, (SubLObject)kb_utilities.$kw146$GLOBAL_CACHE_ENTRIES, Functions.apply((SubLObject)kb_utilities.$sym156$_, Mapping.mapcar((SubLObject)kb_utilities.$sym159$CACHING_STATE_SIZE_ROBUST, memoization_state.global_cache_variable_values())));
        data = conses_high.putf(data, (SubLObject)kb_utilities.$kw147$UNDESTROYED_ITEMS, Functions.apply((SubLObject)kb_utilities.$sym156$_, Mapping.mapcar((SubLObject)kb_utilities.$sym160$DELAYED_PROCESSOR_QUEUE_SIZE, (SubLObject)ConsesLow.list(pph_utilities.pph_inference_destroyer(), pph_phrase.pph_phrase_destroyer(), cb_proof_view.cb_proof_view_destroyer(), Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("INFERENCE-MONITOR-DEMO-INFERENCE-SMITER")), Functions.funcall((SubLObject)SubLObjectFactory.makeSymbol("RUN-QS-SMITER"))))));
        return data;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 30795L)
    public static SubLObject cyc_free_memory_hogs(SubLObject verboseP) {
        if (verboseP == kb_utilities.UNPROVIDED) {
            verboseP = (SubLObject)kb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        PrintLow.format((SubLObject)kb_utilities.T, (SubLObject)kb_utilities.$str161$BEFORE___);
        cyc_memory_hogs(verboseP, (SubLObject)kb_utilities.UNPROVIDED);
        inference_datastructures_problem_store.destroy_all_problem_stores();
        inference_metrics.clear_forward_inference_metrics();
        kb_cleanup.forget_ephemeral_terms((SubLObject)kb_utilities.UNPROVIDED);
        swap_out_all_pristine_kb_objects();
        if (kb_utilities.NIL != sbhl_cache.$sbhl_cache_misses_hash_table$.getDynamicValue(thread)) {
            sbhl_cache.$sbhl_cache_misses_hash_table$.setDynamicValue(Hashtables.make_hash_table((SubLObject)kb_utilities.$int162$10000, Symbols.symbol_function((SubLObject)kb_utilities.EQUAL), (SubLObject)kb_utilities.UNPROVIDED), thread);
        }
        memoization_state.clear_all_globally_cached_functions((SubLObject)kb_utilities.T);
        final SubLObject str = (SubLObject)kb_utilities.$str163$Performing_full_GC;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
        try {
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
            utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
            utilities_macros.$progress_notification_count$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
            utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
            utilities_macros.$progress_count$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
            utilities_macros.$is_noting_progressP$.bind((SubLObject)kb_utilities.T, thread);
            utilities_macros.$silent_progressP$.bind((SubLObject)((kb_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kb_utilities.T), thread);
            utilities_macros.noting_progress_preamble(str);
            Storage.gc_full();
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
        PrintLow.format((SubLObject)kb_utilities.T, (SubLObject)kb_utilities.$str164$AFTER___);
        cyc_memory_hogs(verboseP, (SubLObject)kb_utilities.UNPROVIDED);
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 31677L)
    public static SubLObject get_kb_object_managers() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_utilities.$get_kb_object_managers$.getDynamicValue(thread) == kb_utilities.$kw165$UNINITIALIZED) {
            final SubLObject init_value = (SubLObject)ConsesLow.list(constant_index_manager.$constant_index_manager$.getGlobalValue(), nart_index_manager.$nart_index_manager$.getGlobalValue(), nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue(), assertion_manager.$assertion_content_manager$.getGlobalValue(), deduction_manager.$deduction_content_manager$.getGlobalValue(), kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue(), unrepresented_term_index_manager.$unrepresented_term_index_manager$.getGlobalValue());
            if (init_value == kb_utilities.$kw165$UNINITIALIZED) {
                Errors.error((SubLObject)kb_utilities.$str166$Unable_to_initialize__A__, kb_utilities.$get_kb_object_managers$.getDynamicValue(thread));
            }
            kb_utilities.$get_kb_object_managers$.setDynamicValue(init_value, thread);
        }
        return kb_utilities.$get_kb_object_managers$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 31946L)
    public static SubLObject cyc_lock_hogs(SubLObject stream) {
        if (stream == kb_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject lock_process_action_triples = (SubLObject)kb_utilities.NIL;
        SubLObject cdolist_list_var = (SubLObject)ConsesLow.list(sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue(), memoization_state.$global_caching_lock$.getGlobalValue());
        SubLObject rw_lock = (SubLObject)kb_utilities.NIL;
        rw_lock = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            final SubLObject writer = ReadWriteLocks.rw_lock_writer(rw_lock);
            final SubLObject waiters = ReadWriteLocks.rw_lock_waiters(rw_lock);
            if (kb_utilities.NIL != writer || kb_utilities.NIL != waiters) {
                lock_process_action_triples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rw_lock, writer, (SubLObject)kb_utilities.$kw167$LOCKER), lock_process_action_triples);
                SubLObject cdolist_list_var_$135 = waiters;
                SubLObject waiter = (SubLObject)kb_utilities.NIL;
                waiter = cdolist_list_var_$135.first();
                while (kb_utilities.NIL != cdolist_list_var_$135) {
                    lock_process_action_triples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rw_lock, waiter, (SubLObject)kb_utilities.$kw168$WAITER), lock_process_action_triples);
                    cdolist_list_var_$135 = cdolist_list_var_$135.rest();
                    waiter = cdolist_list_var_$135.first();
                }
                PrintLow.format(stream, (SubLObject)kb_utilities.$str169$__lock_hog___A__writer__S_waiters, new SubLObject[] { ReadWriteLocks.rw_lock_name(rw_lock), writer, waiters });
            }
            cdolist_list_var = cdolist_list_var.rest();
            rw_lock = cdolist_list_var.first();
        }
        cdolist_list_var = get_kb_object_managers();
        SubLObject manager = (SubLObject)kb_utilities.NIL;
        manager = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            final SubLObject lock = kb_object_manager.kb_object_manager_content_lock(manager);
            final SubLObject locker = Locks.lock_locker(lock);
            if (kb_utilities.NIL != locker) {
                lock_process_action_triples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(lock, locker, (SubLObject)kb_utilities.$kw167$LOCKER), lock_process_action_triples);
                PrintLow.format(stream, (SubLObject)kb_utilities.$str170$__lock_hog___A__locker__S___, Locks.lock_name(lock), locker);
            }
            cdolist_list_var = cdolist_list_var.rest();
            manager = cdolist_list_var.first();
        }
        cdolist_list_var = (SubLObject)ConsesLow.list(new SubLObject[] { unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue(), sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), tva_cache.$swappable_tva_cache_lock$.getGlobalValue(), nl_trie.$nl_trie_lock$.getGlobalValue(), operation_queues.$local_queue_lock$.getDynamicValue(thread), operation_queues.$remote_queue_lock$.getDynamicValue(thread), operation_queues.$transcript_queue_lock$.getDynamicValue(thread), operation_queues.$hl_transcript_queue_lock$.getDynamicValue(thread), operation_queues.$auxiliary_queue_lock$.getDynamicValue(thread), operation_queues.$transmit_queue_lock$.getDynamicValue(thread), operation_queues.$local_operation_storage_queue_lock$.getDynamicValue(thread) });
        SubLObject lock2 = (SubLObject)kb_utilities.NIL;
        lock2 = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            if (lock2.isLock()) {
                final SubLObject locker2 = Locks.lock_locker(lock2);
                if (kb_utilities.NIL != locker2) {
                    lock_process_action_triples = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(lock2, locker2, (SubLObject)kb_utilities.$kw167$LOCKER), lock_process_action_triples);
                    PrintLow.format(stream, (SubLObject)kb_utilities.$str170$__lock_hog___A__locker__S___, Locks.lock_name(lock2), locker2);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            lock2 = cdolist_list_var.first();
        }
        return lock_process_action_triples;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 33612L)
    public static SubLObject cyc_lock_users_sampled(SubLObject samples, SubLObject delay) {
        if (samples == kb_utilities.UNPROVIDED) {
            samples = (SubLObject)kb_utilities.$int171$212;
        }
        if (delay == kb_utilities.UNPROVIDED) {
            delay = (SubLObject)kb_utilities.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lock_process_action_triples_counts = Hashtables.make_hash_table((SubLObject)kb_utilities.$int172$100, Symbols.symbol_function((SubLObject)kb_utilities.EQUAL), (SubLObject)kb_utilities.UNPROVIDED);
        SubLObject n;
        SubLObject cdolist_list_var;
        SubLObject lock_process_action_triple;
        for (n = (SubLObject)kb_utilities.NIL, n = (SubLObject)kb_utilities.ZERO_INTEGER; n.numL(samples); n = Numbers.add(n, (SubLObject)kb_utilities.ONE_INTEGER)) {
            cdolist_list_var = cyc_lock_hogs(StreamsLow.$null_output$.getDynamicValue(thread));
            lock_process_action_triple = (SubLObject)kb_utilities.NIL;
            lock_process_action_triple = cdolist_list_var.first();
            while (kb_utilities.NIL != cdolist_list_var) {
                hash_table_utilities.cinc_hash(lock_process_action_triple, lock_process_action_triples_counts, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                lock_process_action_triple = cdolist_list_var.first();
            }
            if (kb_utilities.ZERO_INTEGER.numL(delay)) {
                Threads.sleep(delay);
            }
        }
        return lock_process_action_triples_counts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 34047L)
    public static SubLObject kb_checkpoint_p(final SubLObject v_object) {
        if (kb_utilities.NIL != list_utilities.proper_list_p(v_object) && kb_utilities.NIL != list_utilities.lengthE(v_object, (SubLObject)kb_utilities.FOUR_INTEGER, (SubLObject)kb_utilities.UNPROVIDED)) {
            SubLObject constant_cp = (SubLObject)kb_utilities.NIL;
            SubLObject nart_cp = (SubLObject)kb_utilities.NIL;
            SubLObject assertion_cp = (SubLObject)kb_utilities.NIL;
            SubLObject deduction_cp = (SubLObject)kb_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(v_object, v_object, (SubLObject)kb_utilities.$list173);
            constant_cp = v_object.first();
            SubLObject current = v_object.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)kb_utilities.$list173);
            nart_cp = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)kb_utilities.$list173);
            assertion_cp = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)kb_utilities.$list173);
            deduction_cp = current.first();
            current = current.rest();
            if (kb_utilities.NIL == current) {
                return (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL != constants_high.constant_checkpoint_p(constant_cp) && kb_utilities.NIL != narts_high.nart_checkpoint_p(nart_cp) && kb_utilities.NIL != assertions_high.assertion_checkpoint_p(assertion_cp) && kb_utilities.NIL != deductions_high.deduction_checkpoint_p(deduction_cp));
            }
            cdestructuring_bind.cdestructuring_bind_error(v_object, (SubLObject)kb_utilities.$list173);
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 34657L)
    public static SubLObject new_kb_checkpoint() {
        final SubLObject constant_checkpoint = constants_high.new_constant_checkpoint();
        final SubLObject nart_checkpoint = narts_high.new_nart_checkpoint();
        final SubLObject assertion_checkpoint = assertions_high.new_assertion_checkpoint();
        final SubLObject deduction_checkpoint = deductions_high.new_deduction_checkpoint();
        return (SubLObject)ConsesLow.list(constant_checkpoint, nart_checkpoint, assertion_checkpoint, deduction_checkpoint);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 35080L)
    public static SubLObject kb_checkpoint_currentP(final SubLObject kb_checkpoint) {
        assert kb_utilities.NIL != kb_checkpoint_p(kb_checkpoint) : kb_checkpoint;
        SubLObject constant_cp = (SubLObject)kb_utilities.NIL;
        SubLObject nart_cp = (SubLObject)kb_utilities.NIL;
        SubLObject assertion_cp = (SubLObject)kb_utilities.NIL;
        SubLObject deduction_cp = (SubLObject)kb_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(kb_checkpoint, kb_checkpoint, (SubLObject)kb_utilities.$list173);
        constant_cp = kb_checkpoint.first();
        SubLObject current = kb_checkpoint.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, kb_checkpoint, (SubLObject)kb_utilities.$list173);
        nart_cp = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, kb_checkpoint, (SubLObject)kb_utilities.$list173);
        assertion_cp = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, kb_checkpoint, (SubLObject)kb_utilities.$list173);
        deduction_cp = current.first();
        current = current.rest();
        if (kb_utilities.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL != constants_high.constant_checkpoint_currentP(constant_cp) && kb_utilities.NIL != narts_high.nart_checkpoint_currentP(nart_cp) && kb_utilities.NIL != assertions_high.assertion_checkpoint_currentP(assertion_cp) && kb_utilities.NIL != deductions_high.deduction_checkpoint_currentP(deduction_cp));
        }
        cdestructuring_bind.cdestructuring_bind_error(kb_checkpoint, (SubLObject)kb_utilities.$list173);
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 35531L)
    public static SubLObject theory_checkpoint_p(final SubLObject v_object) {
        if (kb_utilities.NIL != list_utilities.proper_list_p(v_object) && kb_utilities.NIL != list_utilities.lengthE(v_object, (SubLObject)kb_utilities.TWO_INTEGER, (SubLObject)kb_utilities.UNPROVIDED)) {
            SubLObject assertion_cp = (SubLObject)kb_utilities.NIL;
            SubLObject deduction_cp = (SubLObject)kb_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(v_object, v_object, (SubLObject)kb_utilities.$list175);
            assertion_cp = v_object.first();
            SubLObject current = v_object.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, v_object, (SubLObject)kb_utilities.$list175);
            deduction_cp = current.first();
            current = current.rest();
            if (kb_utilities.NIL == current) {
                return (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL != assertions_high.assertion_checkpoint_p(assertion_cp) && kb_utilities.NIL != deductions_high.deduction_checkpoint_p(deduction_cp));
            }
            cdestructuring_bind.cdestructuring_bind_error(v_object, (SubLObject)kb_utilities.$list175);
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 35915L)
    public static SubLObject new_theory_checkpoint() {
        final SubLObject assertion_checkpoint = assertions_high.new_assertion_checkpoint();
        final SubLObject deduction_checkpoint = deductions_high.new_deduction_checkpoint();
        return (SubLObject)ConsesLow.list(assertion_checkpoint, deduction_checkpoint);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 36200L)
    public static SubLObject theory_checkpoint_currentP(final SubLObject theory_checkpoint) {
        assert kb_utilities.NIL != theory_checkpoint_p(theory_checkpoint) : theory_checkpoint;
        SubLObject assertion_cp = (SubLObject)kb_utilities.NIL;
        SubLObject deduction_cp = (SubLObject)kb_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(theory_checkpoint, theory_checkpoint, (SubLObject)kb_utilities.$list175);
        assertion_cp = theory_checkpoint.first();
        SubLObject current = theory_checkpoint.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, theory_checkpoint, (SubLObject)kb_utilities.$list175);
        deduction_cp = current.first();
        current = current.rest();
        if (kb_utilities.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL != assertions_high.assertion_checkpoint_currentP(assertion_cp) && kb_utilities.NIL != deductions_high.deduction_checkpoint_currentP(deduction_cp));
        }
        cdestructuring_bind.cdestructuring_bind_error(theory_checkpoint, (SubLObject)kb_utilities.$list175);
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 36555L)
    public static SubLObject hl_internal_id_string_p(final SubLObject v_object) {
        return string_utilities.hex_char_string_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 36793L)
    public static SubLObject compact_hl_internal_id_string_p(final SubLObject v_object) {
        return string_utilities.f_64_bit_string_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 36965L)
    public static SubLObject hl_internal_id_string(final SubLObject v_object) {
        return vector_utilities.byte_vector_to_hex_char_string(cfasl.cfasl_encode(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 37166L)
    public static SubLObject compact_hl_internal_id_string(final SubLObject v_object) {
        return vector_utilities.byte_vector_to_64_bit_char_string(cfasl.cfasl_encode(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 37385L)
    public static SubLObject find_object_by_hl_internal_id_string(final SubLObject id_string) {
        assert kb_utilities.NIL != hl_internal_id_string_p(id_string) : id_string;
        return find_object_by_hl_id_string(id_string, (SubLObject)kb_utilities.$kw182$HEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 37691L)
    public static SubLObject find_object_by_compact_hl_internal_id_string(final SubLObject id_string) {
        assert kb_utilities.NIL != compact_hl_internal_id_string_p(id_string) : id_string;
        return find_object_by_hl_id_string(id_string, (SubLObject)kb_utilities.$kw184$64);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 38019L)
    public static SubLObject maybe_find_object_by_hl_internal_id_string(final SubLObject id_string) {
        if (kb_utilities.NIL == hl_external_id_string_p(id_string)) {
            return Values.values((SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.NIL);
        }
        return find_object_by_hl_id_string(id_string, (SubLObject)kb_utilities.$kw182$HEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 38492L)
    public static SubLObject maybe_find_object_by_compact_hl_internal_id_string(final SubLObject id_string) {
        if (kb_utilities.NIL == compact_hl_external_id_string_p(id_string)) {
            return Values.values((SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.NIL);
        }
        return find_object_by_hl_id_string(id_string, (SubLObject)kb_utilities.$kw184$64);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 39003L)
    public static SubLObject hl_external_id_string_p(final SubLObject v_object) {
        return string_utilities.hex_char_string_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 39242L)
    public static SubLObject compact_hl_external_id_string_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isString() && kb_utilities.NIL != list_utilities.lengthGE(v_object, (SubLObject)kb_utilities.TWO_INTEGER, (SubLObject)kb_utilities.UNPROVIDED) && kb_utilities.NIL != Characters.charE((SubLObject)Characters.CHAR_M, Strings.sublisp_char(v_object, (SubLObject)kb_utilities.ZERO_INTEGER)) && kb_utilities.NIL != string_utilities.f_64_bit_string_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 39504L)
    public static SubLObject compact_hl_external_id_stringP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_utilities.NIL != compact_hl_external_id_string_p(v_object)) {
            SubLObject ignore_errors_tag = (SubLObject)kb_utilities.NIL;
            try {
                thread.throwStack.push(kb_utilities.$kw190$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)kb_utilities.$sym191$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject hl_term = find_object_by_compact_hl_external_id_string(v_object);
                        if (v_object.equal(compact_hl_external_id_string(hl_term))) {
                            return Values.values((SubLObject)kb_utilities.T, hl_term);
                        }
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)kb_utilities.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)kb_utilities.$kw190$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        return Values.values((SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 40360L)
    public static SubLObject compact_hl_external_id_stringE(final SubLObject id_string_a, final SubLObject id_string_b) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL != compact_hl_external_id_string_p(id_string_a) && kb_utilities.NIL != compact_hl_external_id_string_p(id_string_b) && kb_utilities.NIL != Strings.stringE(id_string_a, id_string_b, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 40695L)
    public static SubLObject hl_external_id_string(final SubLObject v_object) {
        return vector_utilities.byte_vector_to_hex_char_string(cfasl.cfasl_encode_externalized_terse(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 40910L)
    public static SubLObject compact_hl_external_id_string(final SubLObject v_object) {
        return vector_utilities.byte_vector_to_64_bit_char_string(cfasl.cfasl_encode_externalized_terse(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 41143L)
    public static SubLObject find_object_by_hl_external_id_string(final SubLObject id_string) {
        enforceType(id_string, kb_utilities.$sym187$HL_EXTERNAL_ID_STRING_P);
        return find_object_by_hl_id_string(id_string, (SubLObject)kb_utilities.$kw182$HEX);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 41451L)
    public static SubLObject find_cycl_object_by_compact_hl_external_id_string(final SubLObject id_string) {
        final SubLObject result = find_object_by_compact_hl_external_id_string(id_string);
        if (kb_utilities.NIL == cycl_grammar.cycl_term_p(result)) {
            Errors.error((SubLObject)kb_utilities.$str198$Invalid_hl_external_id____A____fo, id_string);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 41738L)
    public static SubLObject find_object_by_compact_hl_external_id_string(final SubLObject id_string) {
        enforceType(id_string, kb_utilities.$sym188$COMPACT_HL_EXTERNAL_ID_STRING_P);
        return find_object_by_hl_id_string(id_string, (SubLObject)kb_utilities.$kw184$64);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 42495L)
    public static SubLObject maybe_find_object_by_compact_hl_external_id_string(final SubLObject id_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kb_utilities.NIL != Types.stringp(id_string) : id_string;
        if (kb_utilities.NIL != compact_hl_external_id_string_p(id_string)) {
            thread.resetMultipleValues();
            final SubLObject foundP = compact_hl_external_id_stringP(id_string);
            final SubLObject v_term = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (kb_utilities.NIL != foundP) {
                return Values.values(v_term, foundP);
            }
        }
        return Values.values((SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 43358L)
    public static SubLObject find_object_by_hl_id_string(final SubLObject id_string, final SubLObject mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject byte_vector = (SubLObject)kb_utilities.NIL;
        SubLObject v_object = (SubLObject)kb_utilities.NIL;
        SubLObject valid = (SubLObject)kb_utilities.NIL;
        if (mode.eql((SubLObject)kb_utilities.$kw182$HEX)) {
            byte_vector = vector_utilities.hex_char_string_to_byte_vector(id_string);
        }
        else if (mode.eql((SubLObject)kb_utilities.$kw184$64)) {
            byte_vector = vector_utilities.f_64_bit_char_string_to_byte_vector(id_string);
        }
        else {
            Errors.error((SubLObject)kb_utilities.$str201$invalid_mode__S, mode);
        }
        SubLObject ignore_errors_tag = (SubLObject)kb_utilities.NIL;
        try {
            thread.throwStack.push(kb_utilities.$kw190$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)kb_utilities.$sym191$IGNORE_ERRORS_HANDLER), thread);
                try {
                    v_object = cfasl.cfasl_decode(byte_vector);
                    valid = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == list_utilities.tree_find_if((SubLObject)kb_utilities.$sym202$INVALID_HL_OBJECT_P, v_object, (SubLObject)kb_utilities.UNPROVIDED));
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)kb_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)kb_utilities.$kw190$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return Values.values(v_object, valid);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 43901L)
    public static SubLObject invalid_hl_object_p(final SubLObject v_object) {
        if (kb_utilities.NIL != constant_handles.constant_p(v_object)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == constant_handles.valid_constantP(v_object, (SubLObject)kb_utilities.UNPROVIDED));
        }
        if (kb_utilities.NIL != nart_handles.nart_p(v_object)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == nart_handles.valid_nartP(v_object, (SubLObject)kb_utilities.UNPROVIDED));
        }
        if (kb_utilities.NIL != assertion_handles.assertion_p(v_object)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == assertion_handles.valid_assertionP(v_object, (SubLObject)kb_utilities.UNPROVIDED));
        }
        if (kb_utilities.NIL != deduction_handles.deduction_p(v_object)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == deduction_handles.valid_deductionP(v_object, (SubLObject)kb_utilities.UNPROVIDED));
        }
        if (kb_utilities.NIL != kb_hl_support_handles.kb_hl_support_p(v_object)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == kb_hl_support_handles.valid_kb_hl_supportP(v_object, (SubLObject)kb_utilities.UNPROVIDED));
        }
        if (kb_utilities.NIL != clause_strucs.clause_struc_p(v_object)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == clause_strucs.valid_clause_struc(v_object, (SubLObject)kb_utilities.UNPROVIDED));
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 44425L)
    public static SubLObject string_for_unlexified_term(final SubLObject v_term, SubLObject use_morphologyP) {
        if (use_morphologyP == kb_utilities.UNPROVIDED) {
            use_morphologyP = (SubLObject)kb_utilities.T;
        }
        if (kb_utilities.NIL != constant_handles.constant_p(v_term) && kb_utilities.NIL == nart_handles.nart_p(v_term)) {
            final SubLObject name = constants_high.constant_name(v_term);
            return (SubLObject)(name.isString() ? string_utilities.space_dont_uncapitalize(name) : kb_utilities.$str203$an_unnamed_constant);
        }
        if (kb_utilities.NIL != misc_kb_utilities.nat_objectP(v_term)) {
            return misc_kb_utilities.coerce_name(v_term);
        }
        return PrintLow.format((SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.$str204$_a, function_terms.nart_to_naut(v_term));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 45305L)
    public static SubLObject sort_terms(final SubLObject list, SubLObject copyP, SubLObject stableP, SubLObject constants_by_nameP, SubLObject ignore_variable_symbolsP, SubLObject key, SubLObject use_internal_idsP) {
        if (copyP == kb_utilities.UNPROVIDED) {
            copyP = (SubLObject)kb_utilities.NIL;
        }
        if (stableP == kb_utilities.UNPROVIDED) {
            stableP = (SubLObject)kb_utilities.NIL;
        }
        if (constants_by_nameP == kb_utilities.UNPROVIDED) {
            constants_by_nameP = (SubLObject)kb_utilities.NIL;
        }
        if (ignore_variable_symbolsP == kb_utilities.UNPROVIDED) {
            ignore_variable_symbolsP = (SubLObject)kb_utilities.NIL;
        }
        if (key == kb_utilities.UNPROVIDED) {
            key = Symbols.symbol_function((SubLObject)kb_utilities.IDENTITY);
        }
        if (use_internal_idsP == kb_utilities.UNPROVIDED) {
            use_internal_idsP = (SubLObject)kb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)kb_utilities.NIL;
        final SubLObject _prev_bind_0 = kb_utilities.$sort_terms_constants_by_name$.currentBinding(thread);
        final SubLObject _prev_bind_2 = kb_utilities.$sort_terms_ignore_variable_symbols$.currentBinding(thread);
        final SubLObject _prev_bind_3 = kb_utilities.$sort_terms_by_internal_idP$.currentBinding(thread);
        try {
            kb_utilities.$sort_terms_constants_by_name$.bind(constants_by_nameP, thread);
            kb_utilities.$sort_terms_ignore_variable_symbols$.bind(ignore_variable_symbolsP, thread);
            kb_utilities.$sort_terms_by_internal_idP$.bind(use_internal_idsP, thread);
            final SubLObject seq = (kb_utilities.NIL != copyP) ? conses_high.copy_list(list) : list;
            final SubLObject sort_func = (kb_utilities.NIL != stableP) ? Symbols.symbol_function((SubLObject)kb_utilities.$sym205$STABLE_SORT) : Symbols.symbol_function((SubLObject)kb_utilities.$sym206$SORT);
            ans = Functions.funcall(sort_func, seq, Symbols.symbol_function((SubLObject)kb_utilities.$sym207$FORM_SORT_PRED), key);
        }
        finally {
            kb_utilities.$sort_terms_by_internal_idP$.rebind(_prev_bind_3, thread);
            kb_utilities.$sort_terms_ignore_variable_symbols$.rebind(_prev_bind_2, thread);
            kb_utilities.$sort_terms_constants_by_name$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 45809L)
    public static SubLObject term_L(final SubLObject term1, final SubLObject term2, SubLObject constants_by_nameP, SubLObject ignore_variable_symbolsP, SubLObject use_internal_idsP) {
        if (constants_by_nameP == kb_utilities.UNPROVIDED) {
            constants_by_nameP = (SubLObject)kb_utilities.NIL;
        }
        if (ignore_variable_symbolsP == kb_utilities.UNPROVIDED) {
            ignore_variable_symbolsP = (SubLObject)kb_utilities.NIL;
        }
        if (use_internal_idsP == kb_utilities.UNPROVIDED) {
            use_internal_idsP = (SubLObject)kb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)kb_utilities.NIL;
        final SubLObject _prev_bind_0 = kb_utilities.$sort_terms_constants_by_name$.currentBinding(thread);
        final SubLObject _prev_bind_2 = kb_utilities.$sort_terms_ignore_variable_symbols$.currentBinding(thread);
        final SubLObject _prev_bind_3 = kb_utilities.$sort_terms_by_internal_idP$.currentBinding(thread);
        try {
            kb_utilities.$sort_terms_constants_by_name$.bind(constants_by_nameP, thread);
            kb_utilities.$sort_terms_ignore_variable_symbols$.bind(ignore_variable_symbolsP, thread);
            kb_utilities.$sort_terms_by_internal_idP$.bind(use_internal_idsP, thread);
            ans = form_sort_pred(term1, term2);
        }
        finally {
            kb_utilities.$sort_terms_by_internal_idP$.rebind(_prev_bind_3, thread);
            kb_utilities.$sort_terms_ignore_variable_symbols$.rebind(_prev_bind_2, thread);
            kb_utilities.$sort_terms_constants_by_name$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 46174L)
    public static SubLObject term_L_with_constant_by_name(final SubLObject term1, final SubLObject term2, SubLObject ignore_variable_symbolsP) {
        if (ignore_variable_symbolsP == kb_utilities.UNPROVIDED) {
            ignore_variable_symbolsP = (SubLObject)kb_utilities.NIL;
        }
        return term_L(term1, term2, (SubLObject)kb_utilities.T, ignore_variable_symbolsP, (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 46325L)
    public static SubLObject form_sort_pred(final SubLObject form1, final SubLObject form2) {
        if (form1.eql(form2)) {
            return (SubLObject)kb_utilities.NIL;
        }
        if (form1.isAtom()) {
            if (form2.isAtom()) {
                return atom_sort_pred(form1, form2);
            }
            return (SubLObject)kb_utilities.T;
        }
        else {
            if (form2.isAtom()) {
                return (SubLObject)kb_utilities.NIL;
            }
            return cons_sort_pred(form1, form2);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 46742L)
    public static SubLObject cons_sort_pred(final SubLObject cons1, final SubLObject cons2) {
        SubLObject curr_cons1 = (SubLObject)kb_utilities.NIL;
        SubLObject curr_cons2 = (SubLObject)kb_utilities.NIL;
        curr_cons1 = cons1;
        curr_cons2 = cons2;
        while (true) {
            final SubLObject car1 = curr_cons1.first();
            final SubLObject car2 = curr_cons2.first();
            if (kb_utilities.NIL != form_sort_pred(car1, car2)) {
                return (SubLObject)kb_utilities.T;
            }
            if (kb_utilities.NIL != form_sort_pred(car2, car1)) {
                return (SubLObject)kb_utilities.NIL;
            }
            final SubLObject cdr1 = curr_cons1.rest();
            final SubLObject cdr2 = curr_cons2.rest();
            if (cdr1.isAtom()) {
                if (cdr2.isAtom()) {
                    return atom_sort_pred(cdr1, cdr2);
                }
                return (SubLObject)kb_utilities.T;
            }
            else {
                if (cdr2.isAtom()) {
                    return (SubLObject)kb_utilities.NIL;
                }
                curr_cons1 = curr_cons1.rest();
                curr_cons2 = curr_cons2.rest();
            }
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 47498L)
    public static SubLObject atom_sort_pred(final SubLObject atom1, final SubLObject atom2) {
        if (atom1.eql(atom2)) {
            return (SubLObject)kb_utilities.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean((kb_utilities.NIL != forts.fort_p(atom1) && (kb_utilities.NIL == forts.fort_p(atom2) || kb_utilities.NIL != fort_sort_pred(atom1, atom2))) || (kb_utilities.NIL == forts.fort_p(atom2) && ((kb_utilities.NIL != variables.variable_p(atom1) && (kb_utilities.NIL == variables.variable_p(atom2) || kb_utilities.NIL != variables.variable_L(atom1, atom2))) || (kb_utilities.NIL == variables.variable_p(atom2) && ((atom1.isSymbol() && (!atom2.isSymbol() || kb_utilities.NIL != symbol_sort_pred(atom1, atom2))) || (!atom2.isSymbol() && ((atom1.isString() && (!atom2.isString() || kb_utilities.NIL != Strings.stringL(atom1, atom2, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED))) || (!atom2.isString() && ((atom1.isNumber() && (!atom2.isNumber() || atom1.numL(atom2))) || (atom1.isChar() && !atom2.isNumber() && (!atom2.isChar() || kb_utilities.NIL != Characters.charL(atom1, atom2))))))))))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 48757L)
    public static SubLObject symbol_sort_pred(final SubLObject symbol1, final SubLObject symbol2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean((symbol1.isKeyword() && (!symbol2.isKeyword() || kb_utilities.NIL != Strings.stringL(Symbols.symbol_name(symbol1), Symbols.symbol_name(symbol2), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED))) || (!symbol2.isKeyword() && ((kb_utilities.NIL != variables.variable_symbolp(symbol1) && (kb_utilities.NIL == variables.variable_symbolp(symbol2) || (kb_utilities.NIL == kb_utilities.$sort_terms_ignore_variable_symbols$.getDynamicValue(thread) && kb_utilities.NIL != Strings.stringL(Symbols.symbol_name(symbol1), Symbols.symbol_name(symbol2), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED)))) || (kb_utilities.NIL == variables.variable_symbolp(symbol2) && kb_utilities.NIL != Strings.stringL(Symbols.symbol_name(symbol1), Symbols.symbol_name(symbol2), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED)))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 49592L)
    public static SubLObject fort_sort_pred(final SubLObject fort1, final SubLObject fort2) {
        if (kb_utilities.NIL != nart_handles.nart_p(fort1)) {
            if (kb_utilities.NIL != nart_handles.nart_p(fort2)) {
                return nart_sort_pred(fort1, fort2);
            }
            return (SubLObject)kb_utilities.NIL;
        }
        else {
            if (kb_utilities.NIL != nart_handles.nart_p(fort2)) {
                return (SubLObject)kb_utilities.T;
            }
            return constant_sort_pred(fort1, fort2);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 49963L)
    public static SubLObject constant_sort_pred(final SubLObject constant1, final SubLObject constant2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_utilities.NIL != kb_utilities.$sort_terms_by_internal_idP$.getDynamicValue(thread)) {
            return constants_high.constant_internal_id_L(constant1, constant2);
        }
        if (kb_utilities.NIL != kb_utilities.$sort_terms_constants_by_name$.getDynamicValue(thread)) {
            return atom_sort_pred(constants_high.constant_name(constant1), constants_high.constant_name(constant2));
        }
        return constants_high.constant_external_id_L(constant1, constant2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 50474L)
    public static SubLObject nart_sort_pred(final SubLObject nart1, final SubLObject nart2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_utilities.NIL != kb_utilities.$sort_terms_constants_by_name$.getDynamicValue(thread) && kb_utilities.NIL == kb_utilities.$sort_terms_by_internal_idP$.getDynamicValue(thread)) {
            return form_sort_pred(narts_high.nart_el_formula(nart1), narts_high.nart_el_formula(nart2));
        }
        return atom_sort_pred(nart_handles.nart_id(nart1), nart_handles.nart_id(nart2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 50930L)
    public static SubLObject fort_L(final SubLObject fort1, final SubLObject fort2) {
        assert kb_utilities.NIL != forts.fort_p(fort1) : fort1;
        assert kb_utilities.NIL != forts.fort_p(fort2) : fort2;
        if (kb_utilities.NIL != constant_handles.constant_p(fort1)) {
            if (kb_utilities.NIL != constant_handles.constant_p(fort2)) {
                return constants_high.constant_internal_id_L(fort1, fort2);
            }
            return (SubLObject)kb_utilities.T;
        }
        else {
            if (kb_utilities.NIL != constant_handles.constant_p(fort2)) {
                return (SubLObject)kb_utilities.NIL;
            }
            return Numbers.numL(nart_handles.nart_id(fort1), nart_handles.nart_id(fort2));
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 51592L)
    public static SubLObject sort_forts(final SubLObject v_forts) {
        return Sort.sort(v_forts, Symbols.symbol_function((SubLObject)kb_utilities.$sym209$FORT__), (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 52733L)
    public static SubLObject definitional_pred_L(final SubLObject pred1, final SubLObject pred2, SubLObject constants_by_name) {
        if (constants_by_name == kb_utilities.UNPROVIDED) {
            constants_by_name = (SubLObject)kb_utilities.NIL;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL != list_utilities.position_L(pred1, pred2, kb_utilities.$definitional_pred_sort_order$.getGlobalValue(), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED) || (kb_utilities.NIL == list_utilities.position_L(pred2, pred1, kb_utilities.$definitional_pred_sort_order$.getGlobalValue(), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED) && kb_utilities.NIL != term_L(pred1, pred2, constants_by_name, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 53291L)
    public static SubLObject definitional_assertion_L(final SubLObject obj1, final SubLObject obj2) {
        final SubLObject pred1 = cycl_utilities.formula_operator(obj1);
        final SubLObject pred2 = cycl_utilities.formula_operator(obj2);
        if (kb_utilities.NIL != kbeq(pred1, pred2) && kb_utilities.NIL != fort_types_interface.arg_type_ternary_predicate_p(pred1)) {
            return Numbers.numL(assertions_high.gaf_arg2(obj1), assertions_high.gaf_arg2(obj2));
        }
        return definitional_pred_L(pred1, pred2, (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 53691L)
    public static SubLObject term_order(final SubLObject v_object) {
        final SubLObject method_function = Structures.method_func(v_object, kb_utilities.$term_order_method_table$.getGlobalValue());
        if (kb_utilities.NIL != method_function) {
            return Functions.funcall(method_function, v_object);
        }
        return (SubLObject)kb_utilities.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 53915L)
    public static SubLObject term_order_assertion_method(final SubLObject v_object) {
        return Numbers.add((SubLObject)kb_utilities.ONE_INTEGER, term_order(assertions_high.assertion_cnf(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 54077L)
    public static SubLObject term_order_cons_method(final SubLObject v_object) {
        SubLObject order = (SubLObject)kb_utilities.ZERO_INTEGER;
        SubLObject rest = (SubLObject)kb_utilities.NIL;
        SubLObject item = (SubLObject)kb_utilities.NIL;
        rest = v_object;
        item = rest.first();
        while (rest.rest().isCons()) {
            order = Numbers.max(order, term_order(item));
            rest = rest.rest();
            item = rest.first();
        }
        order = Numbers.max(order, term_order(item));
        if (kb_utilities.NIL != rest.rest()) {
            order = Numbers.max(order, term_order(rest.rest()));
        }
        return order;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 54539L)
    public static SubLObject term_similarity_metric(final SubLObject term1, final SubLObject term2) {
        if (term1.equal(term2)) {
            return (SubLObject)kb_utilities.ONE_INTEGER;
        }
        final SubLObject term1_generalizations = term_similarity_metric_generalizations(term1);
        final SubLObject term2_generalizations = term_similarity_metric_generalizations(term2);
        SubLObject union_count = keyhash.keyhash_count(term1_generalizations);
        SubLObject intersection_count = (SubLObject)kb_utilities.ZERO_INTEGER;
        final SubLObject cdohash_table = keyhash.do_keyhash_nodes(term2_generalizations);
        SubLObject key = (SubLObject)kb_utilities.NIL;
        SubLObject the_value = (SubLObject)kb_utilities.NIL;
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
            while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                key = Hashtables.getEntryKey(cdohash_entry);
                the_value = Hashtables.getEntryValue(cdohash_entry);
                if (kb_utilities.NIL != keyhash.getkeyhash(key, term1_generalizations)) {
                    intersection_count = Numbers.add(intersection_count, (SubLObject)kb_utilities.ONE_INTEGER);
                }
                else {
                    union_count = Numbers.add(union_count, (SubLObject)kb_utilities.ONE_INTEGER);
                }
            }
        }
        finally {
            Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
        return Numbers.divide(intersection_count, union_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 55369L)
    public static SubLObject instance_similarity_statistics(final SubLObject collection, SubLObject sample) {
        if (sample == kb_utilities.UNPROVIDED) {
            sample = (SubLObject)kb_utilities.$int214$500;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kb_utilities.NIL != forts.fort_p(collection) : collection;
        SubLObject result = (SubLObject)kb_utilities.NIL;
        SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource((SubLObject)kb_utilities.FOUR_INTEGER);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)kb_utilities.T, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
            try {
                final SubLObject _prev_bind_0_$136 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$137 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_utilities.$sym54$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(kb_utilities.$const55$EverythingPSC, thread);
                    result = similarity_statistics_int(isa.all_fort_instances(collection, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED), sample);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$137, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$136, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$137 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$137, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0, thread);
        }
        return Functions.apply(Symbols.symbol_function((SubLObject)kb_utilities.$sym215$VALUES), result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 56022L)
    public static SubLObject spec_similarity_statistics(final SubLObject collection, SubLObject sample) {
        if (sample == kb_utilities.UNPROVIDED) {
            sample = (SubLObject)kb_utilities.$int214$500;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kb_utilities.NIL != forts.fort_p(collection) : collection;
        SubLObject result = (SubLObject)kb_utilities.NIL;
        SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource((SubLObject)kb_utilities.FOUR_INTEGER);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)kb_utilities.T, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
            try {
                final SubLObject _prev_bind_0_$139 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$140 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_utilities.$sym54$RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind(kb_utilities.$const55$EverythingPSC, thread);
                    result = similarity_statistics_int(genls.all_specs(collection, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED), sample);
                }
                finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$140, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$139, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$140 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$140, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0, thread);
        }
        return Functions.apply(Symbols.symbol_function((SubLObject)kb_utilities.$sym215$VALUES), result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 56658L)
    public static SubLObject term_similarity_metric_generalizations_internal(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject size = Numbers.add(control_vars.$average_all_isa_count$.getDynamicValue(thread), (SubLObject)((kb_utilities.NIL != fort_types_interface.collection_p(v_term)) ? control_vars.$average_all_genls_count$.getDynamicValue(thread) : kb_utilities.ZERO_INTEGER));
        final SubLObject generalizations = keyhash.new_keyhash(size, Symbols.symbol_function((SubLObject)kb_utilities.EQUAL));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_utilities.$sym54$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_utilities.$const55$EverythingPSC, thread);
            keyhash.setkeyhash(v_term, generalizations);
            SubLObject cdolist_list_var = term_similarity_all_isa(v_term);
            SubLObject gen = (SubLObject)kb_utilities.NIL;
            gen = cdolist_list_var.first();
            while (kb_utilities.NIL != cdolist_list_var) {
                keyhash.setkeyhash(gen, generalizations);
                cdolist_list_var = cdolist_list_var.rest();
                gen = cdolist_list_var.first();
            }
            if (kb_utilities.NIL != fort_types_interface.collection_p(v_term)) {
                cdolist_list_var = genls.all_genls(v_term, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
                gen = (SubLObject)kb_utilities.NIL;
                gen = cdolist_list_var.first();
                while (kb_utilities.NIL != cdolist_list_var) {
                    keyhash.setkeyhash(gen, generalizations);
                    cdolist_list_var = cdolist_list_var.rest();
                    gen = cdolist_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return generalizations;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 56658L)
    public static SubLObject term_similarity_metric_generalizations(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)kb_utilities.NIL;
        if (kb_utilities.NIL == v_memoization_state) {
            return term_similarity_metric_generalizations_internal(v_term);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)kb_utilities.$sym216$TERM_SIMILARITY_METRIC_GENERALIZATIONS, (SubLObject)kb_utilities.UNPROVIDED);
        if (kb_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)kb_utilities.$sym216$TERM_SIMILARITY_METRIC_GENERALIZATIONS, (SubLObject)kb_utilities.ONE_INTEGER, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.EQUAL, (SubLObject)kb_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)kb_utilities.$sym216$TERM_SIMILARITY_METRIC_GENERALIZATIONS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(term_similarity_metric_generalizations_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, (SubLObject)kb_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 57382L)
    public static SubLObject term_similarity_all_isa(final SubLObject v_term) {
        return rkf_ontology_utilities.rkf_all_isa(v_term, (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 57580L)
    public static SubLObject similarity_statistics_int(final SubLObject terms, final SubLObject sample) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = (SubLObject)kb_utilities.NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state((SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                if (sample.eql((SubLObject)kb_utilities.$kw217$ALL)) {
                    final SubLObject _prev_bind_0_$142 = utilities_macros.$progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_note$.bind((SubLObject)kb_utilities.$str57$cdolist, thread);
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.bind(Sequences.length(terms), thread);
                        utilities_macros.$progress_sofar$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = terms;
                            SubLObject term1 = (SubLObject)kb_utilities.NIL;
                            term1 = csome_list_var.first();
                            while (kb_utilities.NIL != csome_list_var) {
                                SubLObject cdolist_list_var = terms;
                                SubLObject term2 = (SubLObject)kb_utilities.NIL;
                                term2 = cdolist_list_var.first();
                                while (kb_utilities.NIL != cdolist_list_var) {
                                    if (!term1.eql(term2)) {
                                        final SubLObject result = term_similarity_metric(term1, term2);
                                        if (!result.isZero()) {
                                            results = (SubLObject)ConsesLow.cons(result, results);
                                        }
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    term2 = cdolist_list_var.first();
                                }
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kb_utilities.ONE_INTEGER), thread);
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                term1 = csome_list_var.first();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$143 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$143, thread);
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
                        utilities_macros.$progress_note$.rebind(_prev_bind_0_$142, thread);
                    }
                }
                else {
                    assert kb_utilities.NIL != subl_promotions.non_negative_integer_p(sample) : sample;
                    final SubLObject terms_vector = Functions.apply(Symbols.symbol_function((SubLObject)kb_utilities.$sym219$VECTOR), terms);
                    final SubLObject term_count = Sequences.length(terms_vector);
                    final SubLObject _prev_bind_0_$144 = utilities_macros.$progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = utilities_macros.$progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = utilities_macros.$progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_13 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_14 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_15 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_note$.bind((SubLObject)kb_utilities.$str220$cdotimes, thread);
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.bind(sample, thread);
                        utilities_macros.$progress_sofar$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject term2;
                            SubLObject result;
                            SubLObject i;
                            SubLObject term3;
                            for (i = (SubLObject)kb_utilities.NIL, i = (SubLObject)kb_utilities.ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)kb_utilities.ONE_INTEGER)) {
                                term3 = Vectors.aref(terms_vector, random.random(term_count));
                                term2 = Vectors.aref(terms_vector, random.random(term_count));
                                result = term_similarity_metric(term3, term2);
                                if (!result.isZero()) {
                                    results = (SubLObject)ConsesLow.cons(result, results);
                                }
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kb_utilities.ONE_INTEGER), thread);
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$145 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                                final SubLObject _values2 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values2);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$145, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_15, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_14, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_13, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_12, thread);
                        utilities_macros.$progress_sofar$.rebind(_prev_bind_11, thread);
                        utilities_macros.$progress_total$.rebind(_prev_bind_10, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_9, thread);
                        utilities_macros.$progress_note$.rebind(_prev_bind_0_$144, thread);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$146 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                    final SubLObject _values3 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values3);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$146, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)ConsesLow.list(number_utilities.median(results, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED), number_utilities.mean(results), number_utilities.standard_deviation(results));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 58470L)
    public static SubLObject constants_created_between(final SubLObject start_date, final SubLObject end_date, SubLObject who) {
        if (who == kb_utilities.UNPROVIDED) {
            who = (SubLObject)kb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kb_utilities.NIL != Types.integerp(start_date) : start_date;
        assert kb_utilities.NIL != Types.integerp(end_date) : end_date;
        if (!start_date.numLE(end_date)) {
            return (SubLObject)kb_utilities.NIL;
        }
        SubLObject v_answer = (SubLObject)kb_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_utilities.$sym54$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_utilities.$const55$EverythingPSC, thread);
            if (kb_utilities.NIL != forts.fort_p(who)) {
                final SubLObject list_var = bookkeeping_store.terms_created_by(who, (SubLObject)kb_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$147 = utilities_macros.$progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_1_$148 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((SubLObject)((kb_utilities.NIL != PrintLow.format((SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.$str222$examining_creation_times_by__S, who)) ? PrintLow.format((SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.$str222$examining_creation_times_by__S, who) : kb_utilities.$str57$cdolist), thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                    utilities_macros.$progress_sofar$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject v_term = (SubLObject)kb_utilities.NIL;
                        v_term = csome_list_var.first();
                        while (kb_utilities.NIL != csome_list_var) {
                            final SubLObject date = bookkeeping_store.creation_time(v_term, (SubLObject)kb_utilities.UNPROVIDED);
                            if (kb_utilities.NIL != date && date.numGE(start_date) && date.numLE(end_date)) {
                                v_answer = (SubLObject)ConsesLow.cons(v_term, v_answer);
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kb_utilities.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            v_term = csome_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$148 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$148, thread);
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
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$148, thread);
                    utilities_macros.$progress_note$.rebind(_prev_bind_0_$147, thread);
                }
            }
            else {
                final SubLObject idx = constant_handles.do_constants_table();
                final SubLObject mess = (SubLObject)kb_utilities.$str223$examining_all_creation_times;
                final SubLObject total = id_index.id_index_count(idx);
                SubLObject sofar = (SubLObject)kb_utilities.ZERO_INTEGER;
                assert kb_utilities.NIL != Types.stringp(mess) : mess;
                final SubLObject _prev_bind_0_$149 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_1_$149 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_9 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_10 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(mess);
                        final SubLObject idx_$152 = idx;
                        if (kb_utilities.NIL == id_index.id_index_objects_empty_p(idx_$152, (SubLObject)kb_utilities.$kw65$SKIP)) {
                            final SubLObject idx_$153 = idx_$152;
                            if (kb_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$153, (SubLObject)kb_utilities.$kw65$SKIP)) {
                                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$153);
                                final SubLObject backwardP_var = (SubLObject)kb_utilities.NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject id;
                                SubLObject v_term2;
                                SubLObject date2;
                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_utilities.NIL, v_iteration = (SubLObject)kb_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_utilities.ONE_INTEGER)) {
                                    id = ((kb_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_utilities.ONE_INTEGER) : v_iteration);
                                    v_term2 = Vectors.aref(vector_var, id);
                                    if (kb_utilities.NIL == id_index.id_index_tombstone_p(v_term2) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                        if (kb_utilities.NIL != id_index.id_index_tombstone_p(v_term2)) {
                                            v_term2 = (SubLObject)kb_utilities.$kw65$SKIP;
                                        }
                                        date2 = bookkeeping_store.creation_time(v_term2, (SubLObject)kb_utilities.UNPROVIDED);
                                        if (kb_utilities.NIL != date2 && date2.numGE(start_date) && date2.numLE(end_date)) {
                                            v_answer = (SubLObject)ConsesLow.cons(v_term2, v_answer);
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                }
                            }
                            final SubLObject idx_$154 = idx_$152;
                            if (kb_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$154) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                final SubLObject sparse = id_index.id_index_sparse_objects(idx_$154);
                                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$154);
                                final SubLObject end_id = id_index.id_index_next_id(idx_$154);
                                final SubLObject v_default = (SubLObject)((kb_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) ? kb_utilities.NIL : kb_utilities.$kw65$SKIP);
                                while (id2.numL(end_id)) {
                                    final SubLObject v_term3 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                    if (kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP) || kb_utilities.NIL == id_index.id_index_tombstone_p(v_term3)) {
                                        final SubLObject date3 = bookkeeping_store.creation_time(v_term3, (SubLObject)kb_utilities.UNPROVIDED);
                                        if (kb_utilities.NIL != date3 && date3.numGE(start_date) && date3.numLE(end_date)) {
                                            v_answer = (SubLObject)ConsesLow.cons(v_term3, v_answer);
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                    }
                                    id2 = Numbers.add(id2, (SubLObject)kb_utilities.ONE_INTEGER);
                                }
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$150 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$150, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_10, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_9, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$149, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$149, thread);
                }
            }
            clear_cached_creation_time();
            v_answer = Sort.sort(v_answer, Symbols.symbol_function((SubLObject)kb_utilities.$sym224$TERM__), Symbols.symbol_function((SubLObject)kb_utilities.$sym225$CONSTANT_NAME));
            v_answer = Sort.stable_sort(v_answer, Symbols.symbol_function((SubLObject)kb_utilities.$sym226$CREATION_TIME__), (SubLObject)kb_utilities.UNPROVIDED);
            if (kb_utilities.NIL == who) {
                clear_cached_creator();
                v_answer = Sort.stable_sort(v_answer, Symbols.symbol_function((SubLObject)kb_utilities.$sym227$CREATOR__), (SubLObject)kb_utilities.UNPROVIDED);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 59904L)
    public static SubLObject assertion_nats(final SubLObject assertion) {
        return list_utilities.tree_gather(assertions_high.assertion_cnf(assertion), (SubLObject)kb_utilities.$sym228$FIND_GROUND_NAUT, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 60084L)
    public static SubLObject assertion_tous(final SubLObject assertion) {
        return list_utilities.tree_gather(assertions_high.assertion_cnf(assertion), (SubLObject)kb_utilities.$sym229$TERM_OF_UNIT, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 60184L)
    public static SubLObject assertions_between(final SubLObject start_date, final SubLObject end_date, SubLObject who) {
        if (who == kb_utilities.UNPROVIDED) {
            who = (SubLObject)kb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kb_utilities.NIL != Types.integerp(start_date) : start_date;
        assert kb_utilities.NIL != Types.integerp(end_date) : end_date;
        if (!start_date.numLE(end_date)) {
            return (SubLObject)kb_utilities.NIL;
        }
        SubLObject v_answer = (SubLObject)kb_utilities.NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)kb_utilities.$str230$examining_assertion_timestamps;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_utilities.ZERO_INTEGER;
        assert kb_utilities.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$156 = idx;
                if (kb_utilities.NIL == id_index.id_index_objects_empty_p(idx_$156, (SubLObject)kb_utilities.$kw65$SKIP)) {
                    final SubLObject idx_$157 = idx_$156;
                    if (kb_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$157, (SubLObject)kb_utilities.$kw65$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$157);
                        final SubLObject backwardP_var = (SubLObject)kb_utilities.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        SubLObject cyclist;
                        SubLObject date;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_utilities.NIL, v_iteration = (SubLObject)kb_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_utilities.ONE_INTEGER)) {
                            a_id = ((kb_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_utilities.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (kb_utilities.NIL == id_index.id_index_tombstone_p(a_handle) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                if (kb_utilities.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)kb_utilities.$kw65$SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (kb_utilities.NIL != assertions_high.asserted_assertionP(ass)) {
                                    cyclist = assertions_high.asserted_by(ass);
                                    date = assertions_high.asserted_when(ass);
                                    if (kb_utilities.NIL != date && (kb_utilities.NIL == who || who.eql(cyclist)) && date.numGE(start_date) && date.numLE(end_date)) {
                                        v_answer = (SubLObject)ConsesLow.cons(ass, v_answer);
                                    }
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$158 = idx_$156;
                    if (kb_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$158) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$158);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$158);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$158);
                        final SubLObject v_default = (SubLObject)((kb_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) ? kb_utilities.NIL : kb_utilities.$kw65$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP) || kb_utilities.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (kb_utilities.NIL != assertions_high.asserted_assertionP(ass2)) {
                                    final SubLObject cyclist2 = assertions_high.asserted_by(ass2);
                                    final SubLObject date2 = assertions_high.asserted_when(ass2);
                                    if (kb_utilities.NIL != date2 && (kb_utilities.NIL == who || who.eql(cyclist2)) && date2.numGE(start_date) && date2.numLE(end_date)) {
                                        v_answer = (SubLObject)ConsesLow.cons(ass2, v_answer);
                                    }
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)kb_utilities.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$159 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$159, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        v_answer = Sort.sort(v_answer, Symbols.symbol_function((SubLObject)kb_utilities.$sym224$TERM__), Symbols.symbol_function((SubLObject)kb_utilities.$sym231$ASSERTION_CNF));
        v_answer = Sort.stable_sort(v_answer, Symbols.symbol_function((SubLObject)kb_utilities.$sym232$ASSERT_DATE__), (SubLObject)kb_utilities.UNPROVIDED);
        if (kb_utilities.NIL == who) {
            v_answer = Sort.stable_sort(v_answer, Symbols.symbol_function((SubLObject)kb_utilities.$sym233$ASSERT_CYCLIST__), (SubLObject)kb_utilities.UNPROVIDED);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 61277L)
    public static SubLObject term_assertions_between(final SubLObject v_term, final SubLObject start_date, final SubLObject end_date, SubLObject who) {
        if (who == kb_utilities.UNPROVIDED) {
            who = (SubLObject)kb_utilities.NIL;
        }
        assert kb_utilities.NIL != Types.integerp(start_date) : start_date;
        assert kb_utilities.NIL != Types.integerp(end_date) : end_date;
        if (!start_date.numLE(end_date)) {
            return (SubLObject)kb_utilities.NIL;
        }
        SubLObject v_answer = (SubLObject)kb_utilities.NIL;
        SubLObject cdolist_list_var = kb_accessors.all_term_assertions(v_term, (SubLObject)kb_utilities.UNPROVIDED);
        SubLObject ass = (SubLObject)kb_utilities.NIL;
        ass = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            if (kb_utilities.NIL != assertions_high.asserted_assertionP(ass)) {
                final SubLObject cyclist = assertions_high.asserted_by(ass);
                final SubLObject date = assertions_high.asserted_when(ass);
                if (kb_utilities.NIL != date && (kb_utilities.NIL == who || who.eql(cyclist)) && date.numGE(start_date) && date.numLE(end_date)) {
                    v_answer = (SubLObject)ConsesLow.cons(ass, v_answer);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            ass = cdolist_list_var.first();
        }
        v_answer = Sort.sort(v_answer, Symbols.symbol_function((SubLObject)kb_utilities.$sym224$TERM__), Symbols.symbol_function((SubLObject)kb_utilities.$sym231$ASSERTION_CNF));
        v_answer = Sort.stable_sort(v_answer, Symbols.symbol_function((SubLObject)kb_utilities.$sym232$ASSERT_DATE__), (SubLObject)kb_utilities.UNPROVIDED);
        if (kb_utilities.NIL == who) {
            v_answer = Sort.stable_sort(v_answer, Symbols.symbol_function((SubLObject)kb_utilities.$sym233$ASSERT_CYCLIST__), (SubLObject)kb_utilities.UNPROVIDED);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 62379L)
    public static SubLObject term_assertions_in_chronological_order(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = (SubLObject)kb_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_utilities.$sym54$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_utilities.$const55$EverythingPSC, thread);
            final SubLObject assertions_seen = dictionary.new_dictionary((SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
            if (kb_utilities.NIL != kb_mapping_macros.do_term_index_key_validator(v_term, (SubLObject)kb_utilities.NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, (SubLObject)kb_utilities.NIL);
                SubLObject done_var = (SubLObject)kb_utilities.NIL;
                final SubLObject token_var = (SubLObject)kb_utilities.NIL;
                while (kb_utilities.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (kb_utilities.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)kb_utilities.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.NIL);
                            SubLObject done_var_$160 = (SubLObject)kb_utilities.NIL;
                            final SubLObject token_var_$161 = (SubLObject)kb_utilities.NIL;
                            while (kb_utilities.NIL == done_var_$160) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$161);
                                final SubLObject valid_$162 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$161.eql(ass));
                                if (kb_utilities.NIL != valid_$162 && kb_utilities.NIL != kb_mapping_macros.do_term_index_assertion_match_p(ass, final_index_spec) && kb_utilities.NIL != assertions_high.asserted_assertionP(ass)) {
                                    dictionary.dictionary_enter(assertions_seen, ass, ass);
                                }
                                done_var_$160 = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid_$162);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$163 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (kb_utilities.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$163, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid);
                }
            }
            final SubLObject raw_assertions = dictionary.dictionary_keys(assertions_seen);
            final SubLObject adding_order = assertion_utilities.sort_assertions(raw_assertions);
            final SubLObject tstamp_order = Sort.stable_sort(adding_order, (SubLObject)kb_utilities.$sym234$ASSERT_TIMESTAMP__, (SubLObject)kb_utilities.UNPROVIDED);
            assertions = Sequences.nreverse(tstamp_order);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 62953L)
    public static SubLObject term_assertions_in_id_order(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = (SubLObject)kb_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_utilities.$sym54$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_utilities.$const55$EverythingPSC, thread);
            final SubLObject assertions_seen = dictionary.new_dictionary((SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
            if (kb_utilities.NIL != kb_mapping_macros.do_term_index_key_validator(v_term, (SubLObject)kb_utilities.NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, (SubLObject)kb_utilities.NIL);
                SubLObject done_var = (SubLObject)kb_utilities.NIL;
                final SubLObject token_var = (SubLObject)kb_utilities.NIL;
                while (kb_utilities.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (kb_utilities.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)kb_utilities.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.NIL);
                            SubLObject done_var_$164 = (SubLObject)kb_utilities.NIL;
                            final SubLObject token_var_$165 = (SubLObject)kb_utilities.NIL;
                            while (kb_utilities.NIL == done_var_$164) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$165);
                                final SubLObject valid_$166 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$165.eql(ass));
                                if (kb_utilities.NIL != valid_$166 && kb_utilities.NIL != kb_mapping_macros.do_term_index_assertion_match_p(ass, final_index_spec)) {
                                    dictionary.dictionary_enter(assertions_seen, ass, ass);
                                }
                                done_var_$164 = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid_$166);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$167 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (kb_utilities.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$167, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid);
                }
            }
            final SubLObject raw_assertions = dictionary.dictionary_keys(assertions_seen);
            final SubLObject adding_order = assertion_utilities.sort_assertions(raw_assertions);
            assertions = Sequences.nreverse(adding_order);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 63386L)
    public static SubLObject term_last_asserted_assertion_date_internal(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_utilities.$sym54$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_utilities.$const55$EverythingPSC, thread);
            if (kb_utilities.NIL != kb_mapping_macros.do_term_index_key_validator(v_term, (SubLObject)kb_utilities.NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, (SubLObject)kb_utilities.NIL);
                SubLObject done_var = (SubLObject)kb_utilities.NIL;
                final SubLObject token_var = (SubLObject)kb_utilities.NIL;
                while (kb_utilities.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (kb_utilities.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)kb_utilities.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.NIL);
                            SubLObject done_var_$168 = (SubLObject)kb_utilities.NIL;
                            final SubLObject token_var_$169 = (SubLObject)kb_utilities.NIL;
                            while (kb_utilities.NIL == done_var_$168) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$169);
                                final SubLObject valid_$170 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$169.eql(ass));
                                if (kb_utilities.NIL != valid_$170 && kb_utilities.NIL != kb_mapping_macros.do_term_index_assertion_match_p(ass, final_index_spec) && kb_utilities.NIL != assertions_high.asserted_assertionP(ass)) {
                                    final SubLObject asserted_when = assertions_high.asserted_when(ass);
                                    if (kb_utilities.NIL != asserted_when && (kb_utilities.NIL == result || asserted_when.numG(result))) {
                                        result = asserted_when;
                                    }
                                }
                                done_var_$168 = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid_$170);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$171 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (kb_utilities.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$171, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 63386L)
    public static SubLObject term_last_asserted_assertion_date(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)kb_utilities.NIL;
        if (kb_utilities.NIL == v_memoization_state) {
            return term_last_asserted_assertion_date_internal(v_term);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)kb_utilities.$sym235$TERM_LAST_ASSERTED_ASSERTION_DATE, (SubLObject)kb_utilities.UNPROVIDED);
        if (kb_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)kb_utilities.$sym235$TERM_LAST_ASSERTED_ASSERTION_DATE, (SubLObject)kb_utilities.ONE_INTEGER, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.EQL, (SubLObject)kb_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)kb_utilities.$sym235$TERM_LAST_ASSERTED_ASSERTION_DATE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(term_last_asserted_assertion_date_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, (SubLObject)kb_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 63779L)
    public static SubLObject clear_cached_term_last_asserted_assertion_date() {
        final SubLObject cs = kb_utilities.$cached_term_last_asserted_assertion_date_caching_state$.getGlobalValue();
        if (kb_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 63779L)
    public static SubLObject remove_cached_term_last_asserted_assertion_date(final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args(kb_utilities.$cached_term_last_asserted_assertion_date_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_term), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 63779L)
    public static SubLObject cached_term_last_asserted_assertion_date_internal(final SubLObject v_term) {
        return term_last_asserted_assertion_date(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 63779L)
    public static SubLObject cached_term_last_asserted_assertion_date(final SubLObject v_term) {
        SubLObject caching_state = kb_utilities.$cached_term_last_asserted_assertion_date_caching_state$.getGlobalValue();
        if (kb_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)kb_utilities.$sym236$CACHED_TERM_LAST_ASSERTED_ASSERTION_DATE, (SubLObject)kb_utilities.$sym237$_CACHED_TERM_LAST_ASSERTED_ASSERTION_DATE_CACHING_STATE_, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.EQL, (SubLObject)kb_utilities.ONE_INTEGER, (SubLObject)kb_utilities.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_term_last_asserted_assertion_date_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, (SubLObject)kb_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 64011L)
    public static SubLObject creation_time_L(final SubLObject term1, final SubLObject term2) {
        return term_L(cached_creation_time(term1), cached_creation_time(term2), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 64156L)
    public static SubLObject clear_cached_creation_time() {
        final SubLObject cs = kb_utilities.$cached_creation_time_caching_state$.getGlobalValue();
        if (kb_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 64156L)
    public static SubLObject remove_cached_creation_time(final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args(kb_utilities.$cached_creation_time_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_term), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 64156L)
    public static SubLObject cached_creation_time_internal(final SubLObject v_term) {
        return bookkeeping_store.creation_time(v_term, (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 64156L)
    public static SubLObject cached_creation_time(final SubLObject v_term) {
        SubLObject caching_state = kb_utilities.$cached_creation_time_caching_state$.getGlobalValue();
        if (kb_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)kb_utilities.$sym238$CACHED_CREATION_TIME, (SubLObject)kb_utilities.$sym239$_CACHED_CREATION_TIME_CACHING_STATE_, (SubLObject)kb_utilities.$int240$512, (SubLObject)kb_utilities.EQL, (SubLObject)kb_utilities.ONE_INTEGER, (SubLObject)kb_utilities.$int241$200);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_creation_time_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, (SubLObject)kb_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 64277L)
    public static SubLObject creator_L(final SubLObject term1, final SubLObject term2) {
        final SubLObject creator1 = cached_creator(term1);
        final SubLObject creator2 = cached_creator(term2);
        if (kb_utilities.NIL != constant_handles.constant_p(creator1) && kb_utilities.NIL != constant_handles.constant_p(creator2)) {
            return term_L(constants_high.constant_name(creator1), constants_high.constant_name(creator2), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        }
        return term_L(creator1, creator2, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 64572L)
    public static SubLObject clear_cached_creator() {
        final SubLObject cs = kb_utilities.$cached_creator_caching_state$.getGlobalValue();
        if (kb_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 64572L)
    public static SubLObject remove_cached_creator(final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args(kb_utilities.$cached_creator_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_term), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 64572L)
    public static SubLObject cached_creator_internal(final SubLObject v_term) {
        return bookkeeping_store.creator(v_term, (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 64572L)
    public static SubLObject cached_creator(final SubLObject v_term) {
        SubLObject caching_state = kb_utilities.$cached_creator_caching_state$.getGlobalValue();
        if (kb_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)kb_utilities.$sym242$CACHED_CREATOR, (SubLObject)kb_utilities.$sym243$_CACHED_CREATOR_CACHING_STATE_, (SubLObject)kb_utilities.$int240$512, (SubLObject)kb_utilities.EQL, (SubLObject)kb_utilities.ONE_INTEGER, (SubLObject)kb_utilities.$int241$200);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_creator_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, (SubLObject)kb_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 64681L)
    public static SubLObject assert_date_L(final SubLObject ass1, final SubLObject ass2) {
        return term_L(assertions_high.asserted_when(ass1), assertions_high.asserted_when(ass2), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 64793L)
    public static SubLObject assert_cyclist_L(final SubLObject ass1, final SubLObject ass2) {
        final SubLObject cyclist1 = assertions_high.asserted_by(ass1);
        final SubLObject cyclist2 = assertions_high.asserted_by(ass2);
        if (kb_utilities.NIL != constant_handles.constant_p(cyclist1) && kb_utilities.NIL != constant_handles.constant_p(cyclist2)) {
            return term_L(constants_high.constant_name(cyclist1), constants_high.constant_name(cyclist2), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        }
        return term_L(cyclist1, cyclist2, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 65084L)
    public static SubLObject probably_most_recent_assertion() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject most_recent_assertion = (SubLObject)kb_utilities.NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)kb_utilities.$str244$searching_for_probably_most_recen;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_utilities.ZERO_INTEGER;
        assert kb_utilities.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$172 = idx;
                if (kb_utilities.NIL == id_index.id_index_objects_empty_p(idx_$172, (SubLObject)kb_utilities.$kw65$SKIP)) {
                    final SubLObject idx_$173 = idx_$172;
                    if (kb_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$173, (SubLObject)kb_utilities.$kw65$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$173);
                        final SubLObject backwardP_var = (SubLObject)kb_utilities.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_utilities.NIL, v_iteration = (SubLObject)kb_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_utilities.ONE_INTEGER)) {
                            a_id = ((kb_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_utilities.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (kb_utilities.NIL == id_index.id_index_tombstone_p(a_handle) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                if (kb_utilities.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)kb_utilities.$kw65$SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (kb_utilities.NIL != assertions_high.asserted_assertionP(ass) && (kb_utilities.NIL == most_recent_assertion || kb_utilities.NIL != assert_timestamp_L(most_recent_assertion, ass))) {
                                    most_recent_assertion = ass;
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$174 = idx_$172;
                    if (kb_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$174) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$174);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$174);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$174);
                        final SubLObject v_default = (SubLObject)((kb_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) ? kb_utilities.NIL : kb_utilities.$kw65$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP) || kb_utilities.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (kb_utilities.NIL != assertions_high.asserted_assertionP(ass2) && (kb_utilities.NIL == most_recent_assertion || kb_utilities.NIL != assert_timestamp_L(most_recent_assertion, ass2))) {
                                    most_recent_assertion = ass2;
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)kb_utilities.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$175 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$175, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return most_recent_assertion;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 65475L)
    public static SubLObject assert_timestamp_L(final SubLObject ass1, final SubLObject ass2) {
        if (assertions_high.asserted_when(ass1).equal(assertions_high.asserted_when(ass2))) {
            return term_L(assertions_high.asserted_second(ass1), assertions_high.asserted_second(ass2), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        }
        return assert_date_L(ass1, ass2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 65719L)
    public static SubLObject all_constants() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_utilities.NIL;
        final SubLObject idx = constant_handles.do_constants_table();
        final SubLObject mess = (SubLObject)kb_utilities.$str245$Gathering_all_constants;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_utilities.ZERO_INTEGER;
        assert kb_utilities.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$176 = idx;
                if (kb_utilities.NIL == id_index.id_index_objects_empty_p(idx_$176, (SubLObject)kb_utilities.$kw65$SKIP)) {
                    final SubLObject idx_$177 = idx_$176;
                    if (kb_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$177, (SubLObject)kb_utilities.$kw65$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$177);
                        final SubLObject backwardP_var = (SubLObject)kb_utilities.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject constant;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_utilities.NIL, v_iteration = (SubLObject)kb_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_utilities.ONE_INTEGER)) {
                            id = ((kb_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_utilities.ONE_INTEGER) : v_iteration);
                            constant = Vectors.aref(vector_var, id);
                            if (kb_utilities.NIL == id_index.id_index_tombstone_p(constant) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                if (kb_utilities.NIL != id_index.id_index_tombstone_p(constant)) {
                                    constant = (SubLObject)kb_utilities.$kw65$SKIP;
                                }
                                result = (SubLObject)ConsesLow.cons(constant, result);
                                sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$178 = idx_$176;
                    if (kb_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$178) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$178);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$178);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$178);
                        final SubLObject v_default = (SubLObject)((kb_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) ? kb_utilities.NIL : kb_utilities.$kw65$SKIP);
                        while (id2.numL(end_id)) {
                            final SubLObject constant2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP) || kb_utilities.NIL == id_index.id_index_tombstone_p(constant2)) {
                                result = (SubLObject)ConsesLow.cons(constant2, result);
                                sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, (SubLObject)kb_utilities.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$179 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$179, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 65928L)
    public static SubLObject all_narts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_utilities.NIL;
        final SubLObject idx = nart_handles.do_narts_table();
        final SubLObject mess = (SubLObject)kb_utilities.$str246$Gathering_all_narts;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_utilities.ZERO_INTEGER;
        assert kb_utilities.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$180 = idx;
                if (kb_utilities.NIL == id_index.id_index_objects_empty_p(idx_$180, (SubLObject)kb_utilities.$kw65$SKIP)) {
                    final SubLObject idx_$181 = idx_$180;
                    if (kb_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$181, (SubLObject)kb_utilities.$kw65$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$181);
                        final SubLObject backwardP_var = (SubLObject)kb_utilities.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject nart;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_utilities.NIL, v_iteration = (SubLObject)kb_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_utilities.ONE_INTEGER)) {
                            id = ((kb_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_utilities.ONE_INTEGER) : v_iteration);
                            nart = Vectors.aref(vector_var, id);
                            if (kb_utilities.NIL == id_index.id_index_tombstone_p(nart) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                if (kb_utilities.NIL != id_index.id_index_tombstone_p(nart)) {
                                    nart = (SubLObject)kb_utilities.$kw65$SKIP;
                                }
                                result = (SubLObject)ConsesLow.cons(nart, result);
                                sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$182 = idx_$180;
                    if (kb_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$182) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$182);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$182);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$182);
                        final SubLObject v_default = (SubLObject)((kb_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) ? kb_utilities.NIL : kb_utilities.$kw65$SKIP);
                        while (id2.numL(end_id)) {
                            final SubLObject nart2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP) || kb_utilities.NIL == id_index.id_index_tombstone_p(nart2)) {
                                result = (SubLObject)ConsesLow.cons(nart2, result);
                                sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, (SubLObject)kb_utilities.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$183 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$183, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 66074L)
    public static SubLObject all_forts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_utilities.NIL;
        final SubLObject message = (SubLObject)kb_utilities.$str247$Gathering_all_forts;
        final SubLObject total = forts.fort_count();
        SubLObject sofar = (SubLObject)kb_utilities.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(message);
                SubLObject cdolist_list_var = forts.do_forts_tables();
                SubLObject table_var = (SubLObject)kb_utilities.NIL;
                table_var = cdolist_list_var.first();
                while (kb_utilities.NIL != cdolist_list_var) {
                    final SubLObject idx = table_var;
                    if (kb_utilities.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)kb_utilities.$kw65$SKIP)) {
                        final SubLObject idx_$184 = idx;
                        if (kb_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$184, (SubLObject)kb_utilities.$kw65$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$184);
                            final SubLObject backwardP_var = (SubLObject)kb_utilities.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject fort;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_utilities.NIL, v_iteration = (SubLObject)kb_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_utilities.ONE_INTEGER)) {
                                id = ((kb_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_utilities.ONE_INTEGER) : v_iteration);
                                fort = Vectors.aref(vector_var, id);
                                if (kb_utilities.NIL == id_index.id_index_tombstone_p(fort) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                    if (kb_utilities.NIL != id_index.id_index_tombstone_p(fort)) {
                                        fort = (SubLObject)kb_utilities.$kw65$SKIP;
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                    result = (SubLObject)ConsesLow.cons(fort, result);
                                }
                            }
                        }
                        final SubLObject idx_$185 = idx;
                        if (kb_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$185) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$185);
                            SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$185);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$185);
                            final SubLObject v_default = (SubLObject)((kb_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) ? kb_utilities.NIL : kb_utilities.$kw65$SKIP);
                            while (id2.numL(end_id)) {
                                final SubLObject fort2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                if (kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP) || kb_utilities.NIL == id_index.id_index_tombstone_p(fort2)) {
                                    sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                    result = (SubLObject)ConsesLow.cons(fort2, result);
                                }
                                id2 = Numbers.add(id2, (SubLObject)kb_utilities.ONE_INTEGER);
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    table_var = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$186 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$186, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 66220L)
    public static SubLObject all_deductions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_utilities.NIL;
        final SubLObject idx = deduction_handles.do_deductions_table();
        final SubLObject mess = (SubLObject)kb_utilities.$str248$Gathering_all_deductions;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_utilities.ZERO_INTEGER;
        assert kb_utilities.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$187 = idx;
                if (kb_utilities.NIL == id_index.id_index_objects_empty_p(idx_$187, (SubLObject)kb_utilities.$kw65$SKIP)) {
                    final SubLObject idx_$188 = idx_$187;
                    if (kb_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$188, (SubLObject)kb_utilities.$kw65$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$188);
                        final SubLObject backwardP_var = (SubLObject)kb_utilities.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject d_id;
                        SubLObject d_handle;
                        SubLObject deduction;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_utilities.NIL, v_iteration = (SubLObject)kb_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_utilities.ONE_INTEGER)) {
                            d_id = ((kb_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_utilities.ONE_INTEGER) : v_iteration);
                            d_handle = Vectors.aref(vector_var, d_id);
                            if (kb_utilities.NIL == id_index.id_index_tombstone_p(d_handle) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                if (kb_utilities.NIL != id_index.id_index_tombstone_p(d_handle)) {
                                    d_handle = (SubLObject)kb_utilities.$kw65$SKIP;
                                }
                                deduction = deduction_handles.resolve_deduction_id_value_pair(d_id, d_handle);
                                result = (SubLObject)ConsesLow.cons(deduction, result);
                                sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$189 = idx_$187;
                    if (kb_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$189) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$189);
                        SubLObject d_id2 = id_index.id_index_sparse_id_threshold(idx_$189);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$189);
                        final SubLObject v_default = (SubLObject)((kb_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) ? kb_utilities.NIL : kb_utilities.$kw65$SKIP);
                        while (d_id2.numL(end_id)) {
                            final SubLObject d_handle2 = Hashtables.gethash_without_values(d_id2, sparse, v_default);
                            if (kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP) || kb_utilities.NIL == id_index.id_index_tombstone_p(d_handle2)) {
                                final SubLObject deduction2 = deduction_handles.resolve_deduction_id_value_pair(d_id2, d_handle2);
                                result = (SubLObject)ConsesLow.cons(deduction2, result);
                                sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            d_id2 = Numbers.add(d_id2, (SubLObject)kb_utilities.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$190 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$190, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 66391L)
    public static SubLObject all_kb_hl_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_utilities.NIL;
        final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
        final SubLObject mess = (SubLObject)kb_utilities.$str249$Gathering_all_KB_HL_supports;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_utilities.ZERO_INTEGER;
        assert kb_utilities.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$191 = idx;
                if (kb_utilities.NIL == id_index.id_index_objects_empty_p(idx_$191, (SubLObject)kb_utilities.$kw65$SKIP)) {
                    final SubLObject idx_$192 = idx_$191;
                    if (kb_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$192, (SubLObject)kb_utilities.$kw65$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$192);
                        final SubLObject backwardP_var = (SubLObject)kb_utilities.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject s_id;
                        SubLObject s_handle;
                        SubLObject kb_hl_support;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_utilities.NIL, v_iteration = (SubLObject)kb_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_utilities.ONE_INTEGER)) {
                            s_id = ((kb_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_utilities.ONE_INTEGER) : v_iteration);
                            s_handle = Vectors.aref(vector_var, s_id);
                            if (kb_utilities.NIL == id_index.id_index_tombstone_p(s_handle) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                if (kb_utilities.NIL != id_index.id_index_tombstone_p(s_handle)) {
                                    s_handle = (SubLObject)kb_utilities.$kw65$SKIP;
                                }
                                kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                result = (SubLObject)ConsesLow.cons(kb_hl_support, result);
                                sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$193 = idx_$191;
                    if (kb_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$193) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$193);
                        SubLObject s_id2 = id_index.id_index_sparse_id_threshold(idx_$193);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$193);
                        final SubLObject v_default = (SubLObject)((kb_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) ? kb_utilities.NIL : kb_utilities.$kw65$SKIP);
                        while (s_id2.numL(end_id)) {
                            final SubLObject s_handle2 = Hashtables.gethash_without_values(s_id2, sparse, v_default);
                            if (kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP) || kb_utilities.NIL == id_index.id_index_tombstone_p(s_handle2)) {
                                final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                result = (SubLObject)ConsesLow.cons(kb_hl_support2, result);
                                sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            s_id2 = Numbers.add(s_id2, (SubLObject)kb_utilities.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$194 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$194, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 66600L)
    public static SubLObject all_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_utilities.NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)kb_utilities.$str250$Gathering_all_assertions;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_utilities.ZERO_INTEGER;
        assert kb_utilities.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$195 = idx;
                if (kb_utilities.NIL == id_index.id_index_objects_empty_p(idx_$195, (SubLObject)kb_utilities.$kw65$SKIP)) {
                    final SubLObject idx_$196 = idx_$195;
                    if (kb_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$196, (SubLObject)kb_utilities.$kw65$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$196);
                        final SubLObject backwardP_var = (SubLObject)kb_utilities.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_utilities.NIL, v_iteration = (SubLObject)kb_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_utilities.ONE_INTEGER)) {
                            a_id = ((kb_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_utilities.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (kb_utilities.NIL == id_index.id_index_tombstone_p(a_handle) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                if (kb_utilities.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)kb_utilities.$kw65$SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                result = (SubLObject)ConsesLow.cons(ass, result);
                                sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$197 = idx_$195;
                    if (kb_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$197) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$197);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$197);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$197);
                        final SubLObject v_default = (SubLObject)((kb_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) ? kb_utilities.NIL : kb_utilities.$kw65$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP) || kb_utilities.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                result = (SubLObject)ConsesLow.cons(ass2, result);
                                sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)kb_utilities.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$198 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$198, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 66759L)
    public static SubLObject all_gafs() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_utilities.NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)kb_utilities.$str251$Gathering_all_gafs;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_utilities.ZERO_INTEGER;
        assert kb_utilities.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$199 = idx;
                if (kb_utilities.NIL == id_index.id_index_objects_empty_p(idx_$199, (SubLObject)kb_utilities.$kw65$SKIP)) {
                    final SubLObject idx_$200 = idx_$199;
                    if (kb_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$200, (SubLObject)kb_utilities.$kw65$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$200);
                        final SubLObject backwardP_var = (SubLObject)kb_utilities.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_utilities.NIL, v_iteration = (SubLObject)kb_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_utilities.ONE_INTEGER)) {
                            a_id = ((kb_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_utilities.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (kb_utilities.NIL == id_index.id_index_tombstone_p(a_handle) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                if (kb_utilities.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)kb_utilities.$kw65$SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (kb_utilities.NIL != assertions_high.gaf_assertionP(ass)) {
                                    result = (SubLObject)ConsesLow.cons(ass, result);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$201 = idx_$199;
                    if (kb_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$201) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$201);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$201);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$201);
                        final SubLObject v_default = (SubLObject)((kb_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) ? kb_utilities.NIL : kb_utilities.$kw65$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP) || kb_utilities.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (kb_utilities.NIL != assertions_high.gaf_assertionP(ass2)) {
                                    result = (SubLObject)ConsesLow.cons(ass2, result);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)kb_utilities.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$202 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$202, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 66936L)
    public static SubLObject all_forward_gafs() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_utilities.NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)kb_utilities.$str252$Gathering_all_forward_gafs;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_utilities.ZERO_INTEGER;
        assert kb_utilities.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$203 = idx;
                if (kb_utilities.NIL == id_index.id_index_objects_empty_p(idx_$203, (SubLObject)kb_utilities.$kw65$SKIP)) {
                    final SubLObject idx_$204 = idx_$203;
                    if (kb_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$204, (SubLObject)kb_utilities.$kw65$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$204);
                        final SubLObject backwardP_var = (SubLObject)kb_utilities.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_utilities.NIL, v_iteration = (SubLObject)kb_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_utilities.ONE_INTEGER)) {
                            a_id = ((kb_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_utilities.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (kb_utilities.NIL == id_index.id_index_tombstone_p(a_handle) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                if (kb_utilities.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)kb_utilities.$kw65$SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (kb_utilities.NIL != assertions_high.forward_gafP(ass)) {
                                    result = (SubLObject)ConsesLow.cons(ass, result);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$205 = idx_$203;
                    if (kb_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$205) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$205);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$205);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$205);
                        final SubLObject v_default = (SubLObject)((kb_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) ? kb_utilities.NIL : kb_utilities.$kw65$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP) || kb_utilities.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (kb_utilities.NIL != assertions_high.forward_gafP(ass2)) {
                                    result = (SubLObject)ConsesLow.cons(ass2, result);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)kb_utilities.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$206 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$206, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 67127L)
    public static SubLObject all_backward_gafs() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_utilities.NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)kb_utilities.$str253$Gathering_all_backward_gafs;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_utilities.ZERO_INTEGER;
        assert kb_utilities.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$207 = idx;
                if (kb_utilities.NIL == id_index.id_index_objects_empty_p(idx_$207, (SubLObject)kb_utilities.$kw65$SKIP)) {
                    final SubLObject idx_$208 = idx_$207;
                    if (kb_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$208, (SubLObject)kb_utilities.$kw65$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$208);
                        final SubLObject backwardP_var = (SubLObject)kb_utilities.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_utilities.NIL, v_iteration = (SubLObject)kb_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_utilities.ONE_INTEGER)) {
                            a_id = ((kb_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_utilities.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (kb_utilities.NIL == id_index.id_index_tombstone_p(a_handle) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                if (kb_utilities.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)kb_utilities.$kw65$SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (kb_utilities.NIL != assertions_high.backward_gafP(ass)) {
                                    result = (SubLObject)ConsesLow.cons(ass, result);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$209 = idx_$207;
                    if (kb_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$209) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$209);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$209);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$209);
                        final SubLObject v_default = (SubLObject)((kb_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) ? kb_utilities.NIL : kb_utilities.$kw65$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP) || kb_utilities.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (kb_utilities.NIL != assertions_high.backward_gafP(ass2)) {
                                    result = (SubLObject)ConsesLow.cons(ass2, result);
                                }
                                sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)kb_utilities.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$210 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$210, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return assertion_utilities.sort_assertions(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 67328L)
    public static SubLObject all_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_utilities.NIL;
        final SubLObject message_var = (SubLObject)kb_utilities.$str254$Gathering_all_rules;
        final SubLObject total = assertions_low.rule_count();
        SubLObject sofar = (SubLObject)kb_utilities.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(message_var);
                final SubLObject iterator_var = kb_iterators.new_rule_iterator();
                SubLObject valid;
                for (SubLObject done_var = (SubLObject)kb_utilities.NIL; kb_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject rule = iteration.iteration_next(iterator_var);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (kb_utilities.NIL != valid) {
                        sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                        utilities_macros.note_percent_progress(sofar, total);
                        result = (SubLObject)ConsesLow.cons(rule, result);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$211 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$211, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return assertion_utilities.sort_assertions(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 67499L)
    public static SubLObject all_forward_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_utilities.NIL;
        final SubLObject message_var = (SubLObject)kb_utilities.$str255$Gathering_all_forward_rules;
        final SubLObject total = assertions_low.rule_count();
        SubLObject sofar = (SubLObject)kb_utilities.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(message_var);
                final SubLObject iterator_var = kb_iterators.new_rule_iterator();
                SubLObject valid;
                for (SubLObject done_var = (SubLObject)kb_utilities.NIL; kb_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject rule = iteration.iteration_next(iterator_var);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (kb_utilities.NIL != valid) {
                        sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                        utilities_macros.note_percent_progress(sofar, total);
                        if (kb_utilities.NIL != assertions_high.forward_ruleP(rule)) {
                            result = (SubLObject)ConsesLow.cons(rule, result);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$212 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$212, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return assertion_utilities.sort_assertions(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 67716L)
    public static SubLObject all_backward_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_utilities.NIL;
        final SubLObject message_var = (SubLObject)kb_utilities.$str256$Gathering_all_backward_rules;
        final SubLObject total = assertions_low.rule_count();
        SubLObject sofar = (SubLObject)kb_utilities.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(message_var);
                final SubLObject iterator_var = kb_iterators.new_rule_iterator();
                SubLObject valid;
                for (SubLObject done_var = (SubLObject)kb_utilities.NIL; kb_utilities.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject rule = iteration.iteration_next(iterator_var);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (kb_utilities.NIL != valid) {
                        sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                        utilities_macros.note_percent_progress(sofar, total);
                        if (kb_utilities.NIL != assertions_high.backward_ruleP(rule)) {
                            result = (SubLObject)ConsesLow.cons(rule, result);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$213 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$213, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return assertion_utilities.sort_assertions(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 67936L)
    public static SubLObject sorted_non_deduced_backward_gafs() {
        return Sort.stable_sort(Sequences.remove_if((SubLObject)kb_utilities.$sym257$DEDUCED_ASSERTION_, all_backward_gafs(), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED), (SubLObject)kb_utilities.$sym258$SAFE__, (SubLObject)kb_utilities.$sym259$ASSERTED_WHEN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 68087L)
    public static SubLObject all_new_narts() {
        SubLObject result = (SubLObject)kb_utilities.NIL;
        final SubLObject start = nart_handles.new_nart_id_threshold();
        final SubLObject table_var = nart_handles.do_narts_table();
        SubLObject end_var;
        SubLObject end;
        SubLObject id;
        SubLObject nart;
        for (end = (end_var = id_index.id_index_next_id(table_var)), id = (SubLObject)kb_utilities.NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            nart = id_index.id_index_lookup(table_var, id, (SubLObject)kb_utilities.UNPROVIDED);
            if (kb_utilities.NIL != nart) {
                result = (SubLObject)ConsesLow.cons(nart, result);
            }
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 68224L)
    public static SubLObject kb_object_count_list() {
        return (SubLObject)ConsesLow.list(constant_handles.constant_count(), nart_handles.nart_count(), assertion_handles.assertion_count(), kb_hl_support_handles.kb_hl_support_count(), deduction_handles.deduction_count());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 68453L)
    public static SubLObject kb_object_count_lists_new_constant_count(final SubLObject kb_object_count_list_1, final SubLObject kb_object_count_list_2) {
        return Numbers.subtract(kb_object_count_list_1.first(), kb_object_count_list_2.first());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 68636L)
    public static SubLObject kb_object_count_lists_new_nart_count(final SubLObject kb_object_count_list_1, final SubLObject kb_object_count_list_2) {
        return Numbers.subtract(conses_high.second(kb_object_count_list_1), conses_high.second(kb_object_count_list_2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 68819L)
    public static SubLObject kb_object_count_lists_new_assertion_count(final SubLObject kb_object_count_list_1, final SubLObject kb_object_count_list_2) {
        return Numbers.subtract(conses_high.third(kb_object_count_list_1), conses_high.third(kb_object_count_list_2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 69005L)
    public static SubLObject kb_object_count_lists_new_kb_hl_support_count(final SubLObject kb_object_count_list_1, final SubLObject kb_object_count_list_2) {
        return Numbers.subtract(conses_high.fourth(kb_object_count_list_1), conses_high.fourth(kb_object_count_list_2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 69197L)
    public static SubLObject kb_object_count_lists_new_deduction_count(final SubLObject kb_object_count_list_1, final SubLObject kb_object_count_list_2) {
        return Numbers.subtract(conses_high.fifth(kb_object_count_list_1), conses_high.fifth(kb_object_count_list_2));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 69383L)
    public static SubLObject kb_object_count_lists_differentP(final SubLObject kb_object_count_list_1, final SubLObject kb_object_count_list_2) {
        return Equality.equal(kb_object_count_list_1, kb_object_count_list_2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 69546L)
    public static SubLObject showing_new_kb_object_counts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list260);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)kb_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_utilities.NIL;
        SubLObject current_$214 = (SubLObject)kb_utilities.NIL;
        while (kb_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_utilities.$list260);
            current_$214 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_utilities.$list260);
            if (kb_utilities.NIL == conses_high.member(current_$214, (SubLObject)kb_utilities.$list261, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED)) {
                bad = (SubLObject)kb_utilities.T;
            }
            if (current_$214 == kb_utilities.$kw262$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_utilities.NIL != bad && kb_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_utilities.$list260);
        }
        final SubLObject kb_changed_message_tail = cdestructuring_bind.property_list_member((SubLObject)kb_utilities.$kw263$KB_CHANGED_MESSAGE, current);
        final SubLObject kb_changed_message = (SubLObject)((kb_utilities.NIL != kb_changed_message_tail) ? conses_high.cadr(kb_changed_message_tail) : kb_utilities.NIL);
        final SubLObject kb_unchanged_message_tail = cdestructuring_bind.property_list_member((SubLObject)kb_utilities.$kw264$KB_UNCHANGED_MESSAGE, current);
        final SubLObject kb_unchanged_message = (SubLObject)((kb_utilities.NIL != kb_unchanged_message_tail) ? conses_high.cadr(kb_unchanged_message_tail) : kb_utilities.NIL);
        final SubLObject verbosity_tail = cdestructuring_bind.property_list_member((SubLObject)kb_utilities.$kw265$VERBOSITY, current);
        final SubLObject verbosity = (SubLObject)((kb_utilities.NIL != verbosity_tail) ? conses_high.cadr(verbosity_tail) : kb_utilities.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject kb_object_count_list_1 = (SubLObject)kb_utilities.$sym266$KB_OBJECT_COUNT_LIST_1;
        final SubLObject kb_object_count_list_2 = (SubLObject)kb_utilities.$sym267$KB_OBJECT_COUNT_LIST_2;
        final SubLObject new_constant_count = (SubLObject)kb_utilities.$sym268$NEW_CONSTANT_COUNT;
        final SubLObject new_nart_count = (SubLObject)kb_utilities.$sym269$NEW_NART_COUNT;
        final SubLObject new_assertion_count = (SubLObject)kb_utilities.$sym270$NEW_ASSERTION_COUNT;
        final SubLObject new_kb_hl_support_count = (SubLObject)kb_utilities.$sym271$NEW_KB_HL_SUPPORT_COUNT;
        final SubLObject new_deduction_count = (SubLObject)kb_utilities.$sym272$NEW_DEDUCTION_COUNT;
        return (SubLObject)ConsesLow.listS((SubLObject)kb_utilities.$sym273$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(kb_object_count_list_1, (SubLObject)kb_utilities.$list274)), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)kb_utilities.$sym273$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(kb_object_count_list_2, (SubLObject)kb_utilities.$list274), (SubLObject)ConsesLow.list(new_constant_count, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym275$KB_OBJECT_COUNT_LISTS_NEW_CONSTANT_COUNT, kb_object_count_list_2, kb_object_count_list_1)), (SubLObject)ConsesLow.list(new_nart_count, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym276$KB_OBJECT_COUNT_LISTS_NEW_NART_COUNT, kb_object_count_list_2, kb_object_count_list_1)), (SubLObject)ConsesLow.list(new_assertion_count, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym277$KB_OBJECT_COUNT_LISTS_NEW_ASSERTION_COUNT, kb_object_count_list_2, kb_object_count_list_1)), (SubLObject)ConsesLow.list(new_kb_hl_support_count, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym278$KB_OBJECT_COUNT_LISTS_NEW_KB_HL_SUPPORT_COUNT, kb_object_count_list_2, kb_object_count_list_1)), (SubLObject)ConsesLow.list(new_deduction_count, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym279$KB_OBJECT_COUNT_LISTS_NEW_DEDUCTION_COUNT, kb_object_count_list_2, kb_object_count_list_1))), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym280$PCOND, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.listS((SubLObject)kb_utilities.EQ, verbosity, (SubLObject)kb_utilities.$list281)), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym282$COR, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym283$NON_ZERO_INTEGER_P, new_constant_count), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym283$NON_ZERO_INTEGER_P, new_nart_count), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym283$NON_ZERO_INTEGER_P, new_assertion_count), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym283$NON_ZERO_INTEGER_P, new_kb_hl_support_count), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym283$NON_ZERO_INTEGER_P, new_deduction_count)), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym284$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym64$STRINGP, kb_changed_message), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym285$FORMAT, (SubLObject)kb_utilities.T, (SubLObject)kb_utilities.$str286$___A__, kb_changed_message)), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym284$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym283$NON_ZERO_INTEGER_P, new_constant_count), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym285$FORMAT, (SubLObject)kb_utilities.T, (SubLObject)kb_utilities.$str287$___s_constant_A__A__, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym288$ABS, new_constant_count), (SubLObject)ConsesLow.listS((SubLObject)kb_utilities.$sym289$FIF, (SubLObject)ConsesLow.listS((SubLObject)kb_utilities.$sym59$_, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym288$ABS, new_constant_count), (SubLObject)kb_utilities.$list290), (SubLObject)kb_utilities.$list291), (SubLObject)ConsesLow.listS((SubLObject)kb_utilities.$sym289$FIF, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym292$POSITIVE_INTEGER_P, new_constant_count), (SubLObject)kb_utilities.$list293))), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym284$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym283$NON_ZERO_INTEGER_P, new_nart_count), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym285$FORMAT, (SubLObject)kb_utilities.T, (SubLObject)kb_utilities.$str294$___s_nart_A__A__, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym288$ABS, new_nart_count), (SubLObject)ConsesLow.listS((SubLObject)kb_utilities.$sym289$FIF, (SubLObject)ConsesLow.listS((SubLObject)kb_utilities.$sym59$_, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym288$ABS, new_nart_count), (SubLObject)kb_utilities.$list290), (SubLObject)kb_utilities.$list291), (SubLObject)ConsesLow.listS((SubLObject)kb_utilities.$sym289$FIF, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym292$POSITIVE_INTEGER_P, new_nart_count), (SubLObject)kb_utilities.$list293))), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym284$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym283$NON_ZERO_INTEGER_P, new_assertion_count), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym285$FORMAT, (SubLObject)kb_utilities.T, (SubLObject)kb_utilities.$str295$___s_assertion_A__A__, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym288$ABS, new_assertion_count), (SubLObject)ConsesLow.listS((SubLObject)kb_utilities.$sym289$FIF, (SubLObject)ConsesLow.listS((SubLObject)kb_utilities.$sym59$_, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym288$ABS, new_assertion_count), (SubLObject)kb_utilities.$list290), (SubLObject)kb_utilities.$list291), (SubLObject)ConsesLow.listS((SubLObject)kb_utilities.$sym289$FIF, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym292$POSITIVE_INTEGER_P, new_assertion_count), (SubLObject)kb_utilities.$list293))), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym284$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym283$NON_ZERO_INTEGER_P, new_kb_hl_support_count), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym285$FORMAT, (SubLObject)kb_utilities.T, (SubLObject)kb_utilities.$str296$___s_kb_hl_support_A__A__, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym288$ABS, new_kb_hl_support_count), (SubLObject)ConsesLow.listS((SubLObject)kb_utilities.$sym289$FIF, (SubLObject)ConsesLow.listS((SubLObject)kb_utilities.$sym59$_, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym288$ABS, new_kb_hl_support_count), (SubLObject)kb_utilities.$list290), (SubLObject)kb_utilities.$list291), (SubLObject)ConsesLow.listS((SubLObject)kb_utilities.$sym289$FIF, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym292$POSITIVE_INTEGER_P, new_kb_hl_support_count), (SubLObject)kb_utilities.$list293))), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym284$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym283$NON_ZERO_INTEGER_P, new_deduction_count), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym285$FORMAT, (SubLObject)kb_utilities.T, (SubLObject)kb_utilities.$str297$___s_deduction_A__A__, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym288$ABS, new_deduction_count), (SubLObject)ConsesLow.listS((SubLObject)kb_utilities.$sym289$FIF, (SubLObject)ConsesLow.listS((SubLObject)kb_utilities.$sym59$_, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym288$ABS, new_deduction_count), (SubLObject)kb_utilities.$list290), (SubLObject)kb_utilities.$list291), (SubLObject)ConsesLow.listS((SubLObject)kb_utilities.$sym289$FIF, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym292$POSITIVE_INTEGER_P, new_deduction_count), (SubLObject)kb_utilities.$list293)))), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.T, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym284$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym64$STRINGP, kb_unchanged_message), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym285$FORMAT, (SubLObject)kb_utilities.T, (SubLObject)kb_utilities.$str286$___A__, kb_unchanged_message)))), (SubLObject)kb_utilities.$list298))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 72414L)
    public static SubLObject all_constants_sorted_by_creation_time_estimate() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constants_with_sorting_info = (SubLObject)kb_utilities.NIL;
        final SubLObject idx = constant_handles.do_constants_table();
        final SubLObject mess = (SubLObject)kb_utilities.$str299$mapping_Cyc_constants;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kb_utilities.ZERO_INTEGER;
        assert kb_utilities.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$215 = idx;
                if (kb_utilities.NIL == id_index.id_index_objects_empty_p(idx_$215, (SubLObject)kb_utilities.$kw65$SKIP)) {
                    final SubLObject idx_$216 = idx_$215;
                    if (kb_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$216, (SubLObject)kb_utilities.$kw65$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$216);
                        final SubLObject backwardP_var = (SubLObject)kb_utilities.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject v_const;
                        SubLObject creation_time;
                        SubLObject creation_second;
                        SubLObject lowest_assertion_id;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_utilities.NIL, v_iteration = (SubLObject)kb_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_utilities.ONE_INTEGER)) {
                            id = ((kb_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_utilities.ONE_INTEGER) : v_iteration);
                            v_const = Vectors.aref(vector_var, id);
                            if (kb_utilities.NIL == id_index.id_index_tombstone_p(v_const) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                if (kb_utilities.NIL != id_index.id_index_tombstone_p(v_const)) {
                                    v_const = (SubLObject)kb_utilities.$kw65$SKIP;
                                }
                                creation_time = bookkeeping_store.creation_time(v_const, (SubLObject)kb_utilities.UNPROVIDED);
                                creation_second = bookkeeping_store.creation_second(v_const, (SubLObject)kb_utilities.UNPROVIDED);
                                lowest_assertion_id = lowest_assertion_id_for_constant(v_const);
                                if (kb_utilities.NIL == creation_time) {
                                    creation_time = guess_constant_creation_time(v_const);
                                }
                                if (kb_utilities.NIL == creation_second) {
                                    creation_second = (SubLObject)kb_utilities.$kw300$UNKNOWN_SECOND;
                                }
                                constants_with_sorting_info = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_const, creation_time, creation_second, lowest_assertion_id, creation_time), constants_with_sorting_info);
                                sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$217 = idx_$215;
                    if (kb_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$217) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$217);
                        SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$217);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$217);
                        final SubLObject v_default = (SubLObject)((kb_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) ? kb_utilities.NIL : kb_utilities.$kw65$SKIP);
                        while (id2.numL(end_id)) {
                            final SubLObject v_const2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                            if (kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP) || kb_utilities.NIL == id_index.id_index_tombstone_p(v_const2)) {
                                SubLObject creation_time2 = bookkeeping_store.creation_time(v_const2, (SubLObject)kb_utilities.UNPROVIDED);
                                SubLObject creation_second2 = bookkeeping_store.creation_second(v_const2, (SubLObject)kb_utilities.UNPROVIDED);
                                final SubLObject lowest_assertion_id2 = lowest_assertion_id_for_constant(v_const2);
                                if (kb_utilities.NIL == creation_time2) {
                                    creation_time2 = guess_constant_creation_time(v_const2);
                                }
                                if (kb_utilities.NIL == creation_second2) {
                                    creation_second2 = (SubLObject)kb_utilities.$kw300$UNKNOWN_SECOND;
                                }
                                constants_with_sorting_info = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(v_const2, creation_time2, creation_second2, lowest_assertion_id2, creation_time2), constants_with_sorting_info);
                                sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            id2 = Numbers.add(id2, (SubLObject)kb_utilities.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$218 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$218, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        constants_with_sorting_info = Sequences.nreverse(constants_with_sorting_info);
        constants_with_sorting_info = Sort.stable_sort(constants_with_sorting_info, (SubLObject)kb_utilities.$sym301$CONSTANT_SORTING_FUNKY__, Symbols.symbol_function((SubLObject)kb_utilities.$sym302$FOURTH));
        SubLObject last_date = (SubLObject)kb_utilities.NIL;
        SubLObject cdolist_list_var = constants_with_sorting_info;
        SubLObject info = (SubLObject)kb_utilities.NIL;
        info = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            final SubLObject date = conses_high.second(info);
            if (date.isNumber()) {
                last_date = date;
            }
            else {
                ConsesLow.rplaca(conses_high.nthcdr((SubLObject)kb_utilities.FOUR_INTEGER, info), last_date);
            }
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        }
        constants_with_sorting_info = Sort.stable_sort(constants_with_sorting_info, (SubLObject)kb_utilities.$sym303$SORT_CONSTANTS_BY_SORTING_INFO, Symbols.symbol_function((SubLObject)kb_utilities.$sym60$CDR));
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)kb_utilities.$sym304$FIRST), constants_with_sorting_info);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 74021L)
    public static SubLObject guess_constant_creation_time(final SubLObject v_const) {
        SubLObject earliest_time = Numbers.$most_positive_fixnum$.getGlobalValue();
        SubLObject cdolist_list_var = kb_accessors.all_term_assertions(v_const, (SubLObject)kb_utilities.NIL);
        SubLObject ass = (SubLObject)kb_utilities.NIL;
        ass = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            final SubLObject when = assertions_high.asserted_when(ass);
            if (kb_utilities.NIL != when && when.numL(earliest_time)) {
                earliest_time = when;
            }
            cdolist_list_var = cdolist_list_var.rest();
            ass = cdolist_list_var.first();
        }
        if (earliest_time.numE(Numbers.$most_positive_fixnum$.getGlobalValue())) {
            return (SubLObject)kb_utilities.$kw305$UNKNOWN_DATE;
        }
        return earliest_time;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 74395L)
    public static SubLObject lowest_assertion_id_for_constant(final SubLObject v_const) {
        SubLObject lowest_id = Numbers.$most_positive_fixnum$.getGlobalValue();
        SubLObject cdolist_list_var = kb_accessors.all_term_assertions(v_const, (SubLObject)kb_utilities.NIL);
        SubLObject ass = (SubLObject)kb_utilities.NIL;
        ass = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            final SubLObject id = assertion_handles.assertion_id(ass);
            if (kb_utilities.NIL != id && id.numL(lowest_id)) {
                lowest_id = id;
            }
            cdolist_list_var = cdolist_list_var.rest();
            ass = cdolist_list_var.first();
        }
        if (lowest_id.numE(Numbers.$most_positive_fixnum$.getGlobalValue())) {
            return (SubLObject)kb_utilities.$kw306$UNKNOWN_ID;
        }
        return lowest_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 74742L)
    public static SubLObject sort_constants_by_sorting_info(final SubLObject info1, final SubLObject info2) {
        SubLObject date1 = (SubLObject)kb_utilities.NIL;
        SubLObject second1 = (SubLObject)kb_utilities.NIL;
        SubLObject id1 = (SubLObject)kb_utilities.NIL;
        SubLObject dwimmed_date1 = (SubLObject)kb_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(info1, info1, (SubLObject)kb_utilities.$list307);
        date1 = info1.first();
        SubLObject current = info1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, info1, (SubLObject)kb_utilities.$list307);
        second1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, info1, (SubLObject)kb_utilities.$list307);
        id1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, info1, (SubLObject)kb_utilities.$list307);
        dwimmed_date1 = current.first();
        current = current.rest();
        if (kb_utilities.NIL == current) {
            SubLObject date2 = (SubLObject)kb_utilities.NIL;
            SubLObject second2 = (SubLObject)kb_utilities.NIL;
            SubLObject id2 = (SubLObject)kb_utilities.NIL;
            SubLObject dwimmed_date2 = (SubLObject)kb_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(info2, info2, (SubLObject)kb_utilities.$list308);
            date2 = info2.first();
            SubLObject current_$220 = info2.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$220, info2, (SubLObject)kb_utilities.$list308);
            second2 = current_$220.first();
            current_$220 = current_$220.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$220, info2, (SubLObject)kb_utilities.$list308);
            id2 = current_$220.first();
            current_$220 = current_$220.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$220, info2, (SubLObject)kb_utilities.$list308);
            dwimmed_date2 = current_$220.first();
            current_$220 = current_$220.rest();
            if (kb_utilities.NIL == current_$220) {
                if (dwimmed_date1.isNumber() && dwimmed_date2.isNumber() && dwimmed_date1.numL(dwimmed_date2)) {
                    return (SubLObject)kb_utilities.T;
                }
                if (dwimmed_date1.isNumber() && dwimmed_date2.isNumber() && dwimmed_date1.numG(dwimmed_date2)) {
                    return (SubLObject)kb_utilities.NIL;
                }
                if (second1.isNumber() && second2.isNumber() && second1.numL(second2)) {
                    return (SubLObject)kb_utilities.T;
                }
                if (second1.isNumber() && second2.isNumber() && second1.numG(second2)) {
                    return (SubLObject)kb_utilities.NIL;
                }
                if (id1.isNumber() && id2.isNumber() && id1.numL(id2)) {
                    return (SubLObject)kb_utilities.T;
                }
                if (id1.isNumber() && id2.isNumber() && id1.numG(id2)) {
                    return (SubLObject)kb_utilities.NIL;
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(info2, (SubLObject)kb_utilities.$list308);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(info1, (SubLObject)kb_utilities.$list307);
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 75696L)
    public static SubLObject constant_sorting_funky_L(final SubLObject object1, final SubLObject object2) {
        return (SubLObject)(object1.isNumber() ? (object2.isNumber() ? Numbers.numL(object1, object2) : kb_utilities.T) : (object2.isNumber() ? kb_utilities.NIL : kb_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 75969L)
    public static SubLObject definitional_type_for_naut(final SubLObject naut) {
        if (kb_utilities.NIL != isa.isaP(naut, kb_utilities.$const20$Collection, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED)) {
            return kb_utilities.$const20$Collection;
        }
        if (kb_utilities.NIL != isa.isaP(naut, kb_utilities.$const30$Function_Denotational, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED)) {
            return kb_utilities.$const30$Function_Denotational;
        }
        if (kb_utilities.NIL != isa.isaP(naut, kb_utilities.$const32$Predicate, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED)) {
            return kb_utilities.$const32$Predicate;
        }
        if (kb_utilities.NIL != isa.isaP(naut, kb_utilities.$const34$Microtheory, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED)) {
            return kb_utilities.$const34$Microtheory;
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 76548L)
    public static SubLObject do_gaf_arg_index_naut(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list309);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = (SubLObject)kb_utilities.NIL;
        SubLObject v_term = (SubLObject)kb_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list309);
        assertion_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list309);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_utilities.NIL;
        SubLObject current_$221 = (SubLObject)kb_utilities.NIL;
        while (kb_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_utilities.$list309);
            current_$221 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_utilities.$list309);
            if (kb_utilities.NIL == conses_high.member(current_$221, (SubLObject)kb_utilities.$list310, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED)) {
                bad = (SubLObject)kb_utilities.T;
            }
            if (current_$221 == kb_utilities.$kw262$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_utilities.NIL != bad && kb_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_utilities.$list309);
        }
        final SubLObject index_tail = cdestructuring_bind.property_list_member((SubLObject)kb_utilities.$kw311$INDEX, current);
        final SubLObject index = (SubLObject)((kb_utilities.NIL != index_tail) ? conses_high.cadr(index_tail) : kb_utilities.NIL);
        final SubLObject predicate_tail = cdestructuring_bind.property_list_member((SubLObject)kb_utilities.$kw312$PREDICATE, current);
        final SubLObject predicate = (SubLObject)((kb_utilities.NIL != predicate_tail) ? conses_high.cadr(predicate_tail) : kb_utilities.NIL);
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)kb_utilities.$kw313$TRUTH, current);
        final SubLObject truth = (SubLObject)((kb_utilities.NIL != truth_tail) ? conses_high.cadr(truth_tail) : kb_utilities.NIL);
        final SubLObject direction_tail = cdestructuring_bind.property_list_member((SubLObject)kb_utilities.$kw314$DIRECTION, current);
        final SubLObject direction = (SubLObject)((kb_utilities.NIL != direction_tail) ? conses_high.cadr(direction_tail) : kb_utilities.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_utilities.$kw315$DONE, current);
        final SubLObject done = (SubLObject)((kb_utilities.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_utilities.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject indexed_terms = (SubLObject)kb_utilities.$sym316$INDEXED_TERMS;
        return (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym273$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(indexed_terms, (SubLObject)ConsesLow.listS((SubLObject)kb_utilities.$sym317$EXPRESSION_GATHER, v_term, (SubLObject)kb_utilities.$list318))), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym284$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym319$INDEXED_TERM_P, predicate), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym320$CPUSH, predicate, indexed_terms)), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym321$DO_OVERLAP_INDEX, (SubLObject)ConsesLow.list(assertion_var, indexed_terms, (SubLObject)kb_utilities.$kw313$TRUTH, truth, (SubLObject)kb_utilities.$kw315$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_utilities.$sym284$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym322$CAND, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym282$COR, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym323$NULL, direction), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.EQ, direction, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym324$ASSERTION_DIRECTION, assertion_var))), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym282$COR, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym323$NULL, predicate), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.EQUAL, predicate, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym325$FORMULA_OPERATOR, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym326$ASSERTION_FORMULA, assertion_var)))), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym289$FIF, index, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.EQUAL, v_term, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym327$FORMULA_ARG, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym326$ASSERTION_FORMULA, assertion_var), index)), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym328$TERM_OCCURS_AS_FORMULA_ARGUMENT, v_term, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym326$ASSERTION_FORMULA, assertion_var)))), ConsesLow.append(body, (SubLObject)kb_utilities.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 77458L)
    public static SubLObject do_misc_index_naut(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list329);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = (SubLObject)kb_utilities.NIL;
        SubLObject v_term = (SubLObject)kb_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list329);
        assertion_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list329);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kb_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kb_utilities.NIL;
        SubLObject current_$222 = (SubLObject)kb_utilities.NIL;
        while (kb_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_utilities.$list329);
            current_$222 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kb_utilities.$list329);
            if (kb_utilities.NIL == conses_high.member(current_$222, (SubLObject)kb_utilities.$list330, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED)) {
                bad = (SubLObject)kb_utilities.T;
            }
            if (current_$222 == kb_utilities.$kw262$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kb_utilities.NIL != bad && kb_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_utilities.$list329);
        }
        final SubLObject truth_tail = cdestructuring_bind.property_list_member((SubLObject)kb_utilities.$kw313$TRUTH, current);
        final SubLObject truth = (SubLObject)((kb_utilities.NIL != truth_tail) ? conses_high.cadr(truth_tail) : kb_utilities.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kb_utilities.$kw315$DONE, current);
        final SubLObject done = (SubLObject)((kb_utilities.NIL != done_tail) ? conses_high.cadr(done_tail) : kb_utilities.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject indexed_terms = (SubLObject)kb_utilities.$sym331$INDEXED_TERMS;
        return (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym273$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(indexed_terms, (SubLObject)ConsesLow.listS((SubLObject)kb_utilities.$sym317$EXPRESSION_GATHER, v_term, (SubLObject)kb_utilities.$list332))), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym321$DO_OVERLAP_INDEX, (SubLObject)ConsesLow.list(assertion_var, indexed_terms, (SubLObject)kb_utilities.$kw313$TRUTH, truth, (SubLObject)kb_utilities.$kw315$DONE, done), (SubLObject)ConsesLow.listS((SubLObject)kb_utilities.$sym284$PWHEN, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym322$CAND, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym333$CNOT, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym328$TERM_OCCURS_AS_FORMULA_ARGUMENT, v_term, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym326$ASSERTION_FORMULA, assertion_var))), (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym282$COR, (SubLObject)ConsesLow.listS((SubLObject)kb_utilities.$sym334$EXPRESSION_FIND, v_term, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym326$ASSERTION_FORMULA, assertion_var), (SubLObject)kb_utilities.$list335), (SubLObject)ConsesLow.listS((SubLObject)kb_utilities.$sym334$EXPRESSION_FIND, v_term, (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym336$ASSERTION_MT, assertion_var), (SubLObject)kb_utilities.$list335))), ConsesLow.append(body, (SubLObject)kb_utilities.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 78123L)
    public static SubLObject map_gaf_arg_index_naut(final SubLObject function, final SubLObject v_term, final SubLObject argnum, SubLObject predicate, SubLObject truth, SubLObject mt) {
        if (predicate == kb_utilities.UNPROVIDED) {
            predicate = (SubLObject)kb_utilities.NIL;
        }
        if (truth == kb_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_utilities.NIL;
        }
        if (mt == kb_utilities.UNPROVIDED) {
            mt = (SubLObject)kb_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kb_utilities.NIL != Types.function_spec_p(function) : function;
        assert kb_utilities.NIL != narts_high.naut_p(v_term) : v_term;
        assert kb_utilities.NIL != subl_promotions.positive_integer_p(argnum) : argnum;
        SubLObject catch_var = (SubLObject)kb_utilities.NIL;
        try {
            thread.throwStack.push(kb_utilities.$kw339$MAPPING_DONE);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                SubLObject indexed_terms = cycl_utilities.expression_gather(v_term, (SubLObject)kb_utilities.$sym319$INDEXED_TERM_P, (SubLObject)kb_utilities.NIL, Symbols.symbol_function((SubLObject)kb_utilities.EQUAL), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
                if (kb_utilities.NIL != kb_indexing_datastructures.indexed_term_p(predicate)) {
                    indexed_terms = (SubLObject)ConsesLow.cons(predicate, indexed_terms);
                }
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(indexed_terms, (SubLObject)kb_utilities.UNPROVIDED);
                SubLObject assertion = (SubLObject)kb_utilities.NIL;
                assertion = cdolist_list_var.first();
                while (kb_utilities.NIL != cdolist_list_var) {
                    if ((kb_utilities.NIL == truth || kb_utilities.NIL != assertions_high.assertion_has_truth(assertion, truth)) && (kb_utilities.NIL == predicate || predicate.equal(cycl_utilities.formula_operator(assertions_high.assertion_formula(assertion)))) && kb_utilities.NIL != ((kb_utilities.NIL != argnum) ? Equality.equal(v_term, cycl_utilities.formula_arg(assertions_high.assertion_formula(assertion), argnum, (SubLObject)kb_utilities.UNPROVIDED)) : el_utilities.term_occurs_as_formula_argument(v_term, assertions_high.assertion_formula(assertion)))) {
                        Functions.funcall(function, assertion);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, (SubLObject)kb_utilities.$kw339$MAPPING_DONE);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 80526L)
    public static SubLObject map_misc_index_naut(final SubLObject function, final SubLObject v_term, SubLObject truth) {
        if (truth == kb_utilities.UNPROVIDED) {
            truth = (SubLObject)kb_utilities.NIL;
        }
        assert kb_utilities.NIL != Types.function_spec_p(function) : function;
        assert kb_utilities.NIL != narts_high.naut_p(v_term) : v_term;
        final SubLObject indexed_terms = cycl_utilities.expression_gather(v_term, (SubLObject)kb_utilities.$sym319$INDEXED_TERM_P, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(indexed_terms, (SubLObject)kb_utilities.UNPROVIDED);
        SubLObject assertion = (SubLObject)kb_utilities.NIL;
        assertion = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            if ((kb_utilities.NIL == truth || kb_utilities.NIL != assertions_high.assertion_has_truth(assertion, truth)) && kb_utilities.NIL == el_utilities.term_occurs_as_formula_argument(v_term, assertions_high.assertion_formula(assertion)) && (kb_utilities.NIL != cycl_utilities.expression_find(v_term, assertions_high.assertion_formula(assertion), (SubLObject)kb_utilities.T, Symbols.symbol_function((SubLObject)kb_utilities.EQUAL), (SubLObject)kb_utilities.UNPROVIDED) || kb_utilities.NIL != cycl_utilities.expression_find(v_term, assertions_high.assertion_mt(assertion), (SubLObject)kb_utilities.T, Symbols.symbol_function((SubLObject)kb_utilities.EQUAL), (SubLObject)kb_utilities.UNPROVIDED))) {
                Functions.funcall(function, assertion);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 81993L)
    public static SubLObject set_to_collection(final SubLObject v_set, SubLObject mt) {
        if (mt == kb_utilities.UNPROVIDED) {
            mt = kb_utilities.$const340$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kb_utilities.NIL != el_utilities.el_set_p(v_set) : v_set;
        final SubLObject base_col = set_type_constraint(v_set, mt);
        if (kb_utilities.$const342$Nothing.eql(base_col)) {
            return base_col;
        }
        SubLObject col = el_utilities.make_binary_formula(kb_utilities.$const343$CollectionSubsetFn, base_col, v_set);
        if (kb_utilities.NIL != kb_utilities.$set_to_collection_uses_reformulatorP$.getDynamicValue(thread)) {
            col = reformulator_hub.reformulate_cycl(col, mt, (SubLObject)kb_utilities.$list344);
            col = reformulator_hub.reformulate_cycl(col, mt, (SubLObject)kb_utilities.$list345);
        }
        return col;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 82692L)
    public static SubLObject set_type_constraint(final SubLObject v_set, SubLObject mt) {
        if (mt == kb_utilities.UNPROVIDED) {
            mt = (SubLObject)kb_utilities.NIL;
        }
        if (kb_utilities.NIL != el_utilities.el_intensional_set_p(v_set)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.nat_args(v_set, (SubLObject)kb_utilities.UNPROVIDED);
            SubLObject el_variable = (SubLObject)kb_utilities.NIL;
            SubLObject expression = (SubLObject)kb_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list346);
            el_variable = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list346);
            expression = current.first();
            current = current.rest();
            if (kb_utilities.NIL != current) {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_utilities.$list346);
                return (SubLObject)kb_utilities.NIL;
            }
            final SubLObject cols = at_var_types.formula_variable_isa_constraints(el_variable, expression, mt, (SubLObject)kb_utilities.UNPROVIDED);
            if (kb_utilities.NIL == cols) {
                return kb_utilities.$const342$Nothing;
            }
            if (kb_utilities.NIL != list_utilities.singletonP(cols)) {
                return cols.first();
            }
            if (kb_utilities.NIL != list_utilities.doubletonP(cols)) {
                return el_utilities.make_binary_formula(kb_utilities.$const347$CollectionIntersection2Fn, cols.first(), conses_high.second(cols));
            }
            return el_utilities.make_unary_formula(kb_utilities.$const348$CollectionIntersectionFn, el_utilities.make_formula(kb_utilities.$const349$TheSet, cols, (SubLObject)kb_utilities.UNPROVIDED));
        }
        else {
            if (kb_utilities.NIL != el_utilities.el_non_empty_set_p(v_set)) {
                return kb_utilities.$const350$Thing;
            }
            if (kb_utilities.NIL != el_utilities.el_empty_set_p(v_set)) {
                return kb_utilities.$const342$Nothing;
            }
            return Errors.error((SubLObject)kb_utilities.$str351$_S_was_not_a_set, v_set);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 83442L)
    public static SubLObject clear_cached_union_all_specs_count() {
        final SubLObject cs = kb_utilities.$cached_union_all_specs_count_caching_state$.getGlobalValue();
        if (kb_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 83442L)
    public static SubLObject remove_cached_union_all_specs_count(final SubLObject cols, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args(kb_utilities.$cached_union_all_specs_count_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(cols, mt), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 83442L)
    public static SubLObject cached_union_all_specs_count_internal(final SubLObject cols, final SubLObject mt) {
        return genls.union_all_specs_count(cols, mt, (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 83442L)
    public static SubLObject cached_union_all_specs_count(final SubLObject cols, final SubLObject mt) {
        SubLObject caching_state = kb_utilities.$cached_union_all_specs_count_caching_state$.getGlobalValue();
        if (kb_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)kb_utilities.$sym352$CACHED_UNION_ALL_SPECS_COUNT, (SubLObject)kb_utilities.$sym353$_CACHED_UNION_ALL_SPECS_COUNT_CACHING_STATE_, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.EQL, (SubLObject)kb_utilities.TWO_INTEGER, (SubLObject)kb_utilities.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)kb_utilities.$sym354$CLEAR_CACHED_UNION_ALL_SPECS_COUNT);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(cols, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)kb_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)kb_utilities.NIL;
            collision = cdolist_list_var.first();
            while (kb_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (cols.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (kb_utilities.NIL != cached_args && kb_utilities.NIL == cached_args.rest() && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_union_all_specs_count_internal(cols, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(cols, mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 83624L)
    public static SubLObject collection_coverage_ratio(final SubLObject numerator_cols, SubLObject denominator_cols, SubLObject mt) {
        if (denominator_cols == kb_utilities.UNPROVIDED) {
            denominator_cols = (SubLObject)kb_utilities.$list355;
        }
        if (mt == kb_utilities.UNPROVIDED) {
            mt = kb_utilities.$const55$EverythingPSC;
        }
        final SubLObject numerator = cached_union_all_specs_count(numerator_cols, mt);
        final SubLObject denominator = cached_union_all_specs_count(denominator_cols, mt);
        return Numbers.divide(numerator, denominator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 84072L)
    public static SubLObject union_all_constant_specs_count(final SubLObject cols, final SubLObject mt) {
        return Sequences.count_if((SubLObject)kb_utilities.$sym356$CONSTANT_P, genls.union_all_specs(cols, mt, (SubLObject)kb_utilities.UNPROVIDED), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 84188L)
    public static SubLObject constant_collection_coverage_ratio(final SubLObject numerator_cols, SubLObject denominator_cols, SubLObject mt) {
        if (denominator_cols == kb_utilities.UNPROVIDED) {
            denominator_cols = (SubLObject)kb_utilities.$list355;
        }
        if (mt == kb_utilities.UNPROVIDED) {
            mt = kb_utilities.$const55$EverythingPSC;
        }
        final SubLObject numerator = union_all_constant_specs_count(numerator_cols, mt);
        final SubLObject denominator = union_all_constant_specs_count(denominator_cols, mt);
        return Numbers.divide(numerator, denominator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 85427L)
    public static SubLObject compute_kb_covering_collections(final SubLObject n, final SubLObject max_each_spec_cardinality, final SubLObject min_each_spec_cardinality, final SubLObject reorder_wrt_overlap) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_covering_collections = (SubLObject)kb_utilities.$list355;
        final SubLObject broken_collections_set = set.new_set(Symbols.symbol_function((SubLObject)kb_utilities.EQL), (SubLObject)kb_utilities.UNPROVIDED);
        SubLObject covering_collections = all_covering_collections;
        final SubLObject coverage = (SubLObject)kb_utilities.ONE_INTEGER;
        SubLObject smallest_spec_cardinality;
        SubLObject largest_spec_cardinality = smallest_spec_cardinality = cardinality_estimates.spec_cardinality(kb_utilities.$const350$Thing);
        final SubLObject min_total_coverage = (SubLObject)kb_utilities.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_utilities.$sym54$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_utilities.$const55$EverythingPSC, thread);
            final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$223 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
            final SubLObject _prev_bind_1_$224 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
            final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)kb_utilities.SIX_INTEGER), thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)kb_utilities.T, thread);
                while (kb_utilities.NIL != list_utilities.lengthL(covering_collections, n, (SubLObject)kb_utilities.UNPROVIDED) || coverage.numL(min_total_coverage) || largest_spec_cardinality.numG(max_each_spec_cardinality) || smallest_spec_cardinality.numL(min_each_spec_cardinality)) {
                    final SubLObject break_col = number_utilities.maximum(all_covering_collections, Symbols.symbol_function((SubLObject)kb_utilities.$sym360$SPEC_CARDINALITY));
                    all_covering_collections = Sequences.remove(break_col, all_covering_collections, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
                    set.set_add(break_col, broken_collections_set);
                    all_covering_collections = break_col_into_specs_and_merge(break_col, all_covering_collections, broken_collections_set, min_each_spec_cardinality);
                    all_covering_collections = Sort.sort(all_covering_collections, Symbols.symbol_function((SubLObject)kb_utilities.$sym59$_), Symbols.symbol_function((SubLObject)kb_utilities.$sym360$SPEC_CARDINALITY));
                    covering_collections = list_utilities.first_n(n, all_covering_collections);
                    largest_spec_cardinality = cardinality_estimates.spec_cardinality(covering_collections.first());
                    smallest_spec_cardinality = cardinality_estimates.spec_cardinality(list_utilities.last_one(covering_collections));
                    print_high.print((SubLObject)ConsesLow.list(largest_spec_cardinality, smallest_spec_cardinality, break_col, Sequences.length(all_covering_collections)), (SubLObject)kb_utilities.UNPROVIDED);
                    streams_high.force_output((SubLObject)kb_utilities.UNPROVIDED);
                }
            }
            finally {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$224, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$223, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject i;
        for (i = (SubLObject)kb_utilities.NIL, i = (SubLObject)kb_utilities.ZERO_INTEGER; i.numL(reorder_wrt_overlap); i = Numbers.add(i, (SubLObject)kb_utilities.ONE_INTEGER)) {
            covering_collections = optimize_coverage(all_covering_collections, n);
        }
        return covering_collections;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 88507L)
    public static SubLObject print_kb_covering_collections(final SubLObject cols) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        streams_high.terpri((SubLObject)kb_utilities.UNPROVIDED);
        streams_high.terpri((SubLObject)kb_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = cols;
        SubLObject col = (SubLObject)kb_utilities.NIL;
        col = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            PrintLow.format((SubLObject)kb_utilities.T, (SubLObject)kb_utilities.$str361$_5_d__s__, cardinality_estimates.spec_cardinality(col), col);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding(thread);
        try {
            reader.$read_default_float_format$.bind((SubLObject)kb_utilities.$sym2$DOUBLE_FLOAT, thread);
            PrintLow.format((SubLObject)kb_utilities.T, (SubLObject)kb_utilities.$str362$__Total_coverage___S___, Numbers.multiply((SubLObject)kb_utilities.$int172$100, number_utilities.significant_digits(special_collection_coverage_ratio(cols), (SubLObject)kb_utilities.FOUR_INTEGER)));
        }
        finally {
            reader.$read_default_float_format$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 88915L)
    public static SubLObject optimize_coverage(final SubLObject cols, final SubLObject n) {
        PrintLow.format((SubLObject)kb_utilities.T, (SubLObject)kb_utilities.$str363$__Optimizing_coverage_via_relativ);
        SubLObject alist = (SubLObject)kb_utilities.NIL;
        final SubLObject covering_collections = list_utilities.first_n(n, cols);
        SubLObject cdolist_list_var = cols;
        SubLObject col = (SubLObject)kb_utilities.NIL;
        col = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            final SubLObject col_coverage = spec_union_overlap_cardinality(col, Sequences.remove(col, covering_collections, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED));
            PrintLow.format((SubLObject)kb_utilities.T, (SubLObject)kb_utilities.$str364$_s___s_unique_spec_p__, new SubLObject[] { col, col_coverage, col_coverage });
            streams_high.force_output((SubLObject)kb_utilities.UNPROVIDED);
            alist = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(col, col_coverage), alist);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        final SubLObject best_cols = list_utilities.first_n(n, list_utilities.alist_keys(list_utilities.sort_alist_by_values(alist, Symbols.symbol_function((SubLObject)kb_utilities.$sym59$_))));
        return best_cols;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 89650L)
    public static SubLObject break_col_into_specs_and_merge(final SubLObject break_col, final SubLObject already_covered_cols, final SubLObject broken_collections_set, final SubLObject min_each_spec_cardinality) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject unsubsumed_new_cols = (SubLObject)kb_utilities.NIL;
        final SubLObject _prev_bind_0 = kb_utilities.$min_each_spec_cardinality$.currentBinding(thread);
        try {
            kb_utilities.$min_each_spec_cardinality$.bind(min_each_spec_cardinality, thread);
            SubLObject cdolist_list_var;
            final SubLObject new_cols = cdolist_list_var = Sequences.remove_if((SubLObject)kb_utilities.$sym365$FORBIDDEN_KB_COVERING_COLLECTION_, genls.specs(break_col, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
            SubLObject new_col = (SubLObject)kb_utilities.NIL;
            new_col = cdolist_list_var.first();
            while (kb_utilities.NIL != cdolist_list_var) {
                if (kb_utilities.NIL == set.set_memberP(new_col, broken_collections_set) && kb_utilities.NIL == set_utilities.set_subset_anyP(all_specs_set(new_col), Mapping.mapcar((SubLObject)kb_utilities.$sym366$ALL_SPECS_SET, already_covered_cols))) {
                    unsubsumed_new_cols = (SubLObject)ConsesLow.cons(new_col, unsubsumed_new_cols);
                }
                cdolist_list_var = cdolist_list_var.rest();
                new_col = cdolist_list_var.first();
            }
        }
        finally {
            kb_utilities.$min_each_spec_cardinality$.rebind(_prev_bind_0, thread);
        }
        return ConsesLow.append(unsubsumed_new_cols, already_covered_cols);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 90270L)
    public static SubLObject clear_forbidden_kb_covering_collections_set() {
        final SubLObject cs = kb_utilities.$forbidden_kb_covering_collections_set_caching_state$.getGlobalValue();
        if (kb_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 90270L)
    public static SubLObject remove_forbidden_kb_covering_collections_set() {
        return memoization_state.caching_state_remove_function_results_with_args(kb_utilities.$forbidden_kb_covering_collections_set_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(kb_utilities.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 90270L)
    public static SubLObject forbidden_kb_covering_collections_set_internal() {
        return set_utilities.set_union((SubLObject)ConsesLow.list(set_utilities.construct_set_from_list(isa.union_all_instances(kb_utilities.$forbidden_kb_covering_collection_types$.getGlobalValue(), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED), Symbols.symbol_function((SubLObject)kb_utilities.EQL), (SubLObject)kb_utilities.UNPROVIDED), set_utilities.construct_set_from_list(isa.union_all_quoted_instances(kb_utilities.$forbidden_kb_covering_quoted_collection_types$.getGlobalValue(), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED), Symbols.symbol_function((SubLObject)kb_utilities.EQL), (SubLObject)kb_utilities.UNPROVIDED), set_utilities.construct_set_from_list(genls.union_all_specs(kb_utilities.$forbidden_specs$.getGlobalValue(), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED), Symbols.symbol_function((SubLObject)kb_utilities.EQL), (SubLObject)kb_utilities.UNPROVIDED), set_utilities.construct_set_from_list(kb_utilities.$forbidden_cols$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_utilities.EQL), (SubLObject)kb_utilities.UNPROVIDED)), Symbols.symbol_function((SubLObject)kb_utilities.EQL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 90270L)
    public static SubLObject forbidden_kb_covering_collections_set() {
        SubLObject caching_state = kb_utilities.$forbidden_kb_covering_collections_set_caching_state$.getGlobalValue();
        if (kb_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)kb_utilities.$sym367$FORBIDDEN_KB_COVERING_COLLECTIONS_SET, (SubLObject)kb_utilities.$sym368$_FORBIDDEN_KB_COVERING_COLLECTIONS_SET_CACHING_STATE_, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.EQL, (SubLObject)kb_utilities.ZERO_INTEGER, (SubLObject)kb_utilities.ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback((SubLObject)kb_utilities.$sym369$CLEAR_FORBIDDEN_KB_COVERING_COLLECTIONS_SET);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)kb_utilities.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(forbidden_kb_covering_collections_set_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)kb_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 90746L)
    public static SubLObject forbidden_kb_covering_collectionP(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_utilities.NIL != nart_handles.nart_p(col)) {
            return (SubLObject)kb_utilities.T;
        }
        if (kb_utilities.NIL != kb_utilities.$min_each_spec_cardinality$.getDynamicValue(thread) && cardinality_estimates.spec_cardinality(col).numL(kb_utilities.$min_each_spec_cardinality$.getDynamicValue(thread))) {
            return (SubLObject)kb_utilities.T;
        }
        if (kb_utilities.NIL != set.set_memberP(col, forbidden_kb_covering_collections_set())) {
            return (SubLObject)kb_utilities.T;
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 91032L)
    public static SubLObject spec_union_overlap_cardinality(final SubLObject col, final SubLObject cols) {
        final SubLObject col_specs_set = all_specs_set(col);
        final SubLObject col_spec_cardinality = set.set_size(col_specs_set);
        final SubLObject cols_specs_set = set_utilities.set_union(Mapping.mapcar((SubLObject)kb_utilities.$sym366$ALL_SPECS_SET, cols), Symbols.symbol_function((SubLObject)kb_utilities.EQL));
        final SubLObject common_specs_set = set_utilities.set_intersection((SubLObject)ConsesLow.list(col_specs_set, cols_specs_set), Symbols.symbol_function((SubLObject)kb_utilities.EQL));
        final SubLObject common_spec_cardinality = set.set_size(common_specs_set);
        final SubLObject col_unique_spec_cardinality = Numbers.subtract(col_spec_cardinality, common_spec_cardinality);
        return col_unique_spec_cardinality;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 91688L)
    public static SubLObject spec_overlap_cardinality(final SubLObject col1, final SubLObject col2) {
        final SubLObject col1_specs_set = all_specs_set(col1);
        final SubLObject col1_spec_cardinality = set.set_size(col1_specs_set);
        final SubLObject col2_specs_set = all_specs_set(col2);
        final SubLObject col2_spec_cardinality = set.set_size(col2_specs_set);
        final SubLObject common_specs_set = set_utilities.set_intersection((SubLObject)ConsesLow.list(col1_specs_set, col2_specs_set), Symbols.symbol_function((SubLObject)kb_utilities.EQL));
        final SubLObject common_spec_cardinality = set.set_size(common_specs_set);
        final SubLObject col1_unique_spec_cardinality = Numbers.subtract(col1_spec_cardinality, common_spec_cardinality);
        final SubLObject col2_unique_spec_cardinality = Numbers.subtract(col2_spec_cardinality, common_spec_cardinality);
        return Values.values(col1_unique_spec_cardinality, col2_unique_spec_cardinality);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 92516L)
    public static SubLObject clear_all_specs_set() {
        final SubLObject cs = kb_utilities.$all_specs_set_caching_state$.getGlobalValue();
        if (kb_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 92516L)
    public static SubLObject remove_all_specs_set(final SubLObject col) {
        return memoization_state.caching_state_remove_function_results_with_args(kb_utilities.$all_specs_set_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(col), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 92516L)
    public static SubLObject all_specs_set_internal(final SubLObject col) {
        return set_utilities.construct_set_from_list(genls.all_specs(col, kb_utilities.$const55$EverythingPSC, (SubLObject)kb_utilities.UNPROVIDED), Symbols.symbol_function((SubLObject)kb_utilities.EQL), (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 92516L)
    public static SubLObject all_specs_set(final SubLObject col) {
        SubLObject caching_state = kb_utilities.$all_specs_set_caching_state$.getGlobalValue();
        if (kb_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)kb_utilities.$sym366$ALL_SPECS_SET, (SubLObject)kb_utilities.$sym370$_ALL_SPECS_SET_CACHING_STATE_, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.EQL, (SubLObject)kb_utilities.ONE_INTEGER, (SubLObject)kb_utilities.ZERO_INTEGER);
            memoization_state.register_genls_dependent_cache_clear_callback((SubLObject)kb_utilities.$sym371$CLEAR_ALL_SPECS_SET);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, col, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(all_specs_set_internal(col)));
            memoization_state.caching_state_put(caching_state, col, results, (SubLObject)kb_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 92721L)
    public static SubLObject clear_all_genls_set() {
        final SubLObject cs = kb_utilities.$all_genls_set_caching_state$.getGlobalValue();
        if (kb_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 92721L)
    public static SubLObject remove_all_genls_set(final SubLObject col) {
        return memoization_state.caching_state_remove_function_results_with_args(kb_utilities.$all_genls_set_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(col), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 92721L)
    public static SubLObject all_genls_set_internal(final SubLObject col) {
        return set_utilities.construct_set_from_list(genls.all_genls(col, kb_utilities.$const55$EverythingPSC, (SubLObject)kb_utilities.UNPROVIDED), Symbols.symbol_function((SubLObject)kb_utilities.EQL), (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 92721L)
    public static SubLObject all_genls_set(final SubLObject col) {
        SubLObject caching_state = kb_utilities.$all_genls_set_caching_state$.getGlobalValue();
        if (kb_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)kb_utilities.$sym372$ALL_GENLS_SET, (SubLObject)kb_utilities.$sym373$_ALL_GENLS_SET_CACHING_STATE_, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.EQL, (SubLObject)kb_utilities.ONE_INTEGER, (SubLObject)kb_utilities.ZERO_INTEGER);
            memoization_state.register_genls_dependent_cache_clear_callback((SubLObject)kb_utilities.$sym374$CLEAR_ALL_GENLS_SET);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, col, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(all_genls_set_internal(col)));
            memoization_state.caching_state_put(caching_state, col, results, (SubLObject)kb_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 92878L)
    public static SubLObject special_collection_coverage_ratio(final SubLObject cols) {
        final SubLObject all_specs = set_utilities.set_union(Mapping.mapcar((SubLObject)kb_utilities.$sym366$ALL_SPECS_SET, cols), (SubLObject)kb_utilities.UNPROVIDED);
        final SubLObject all_specs_count = set.set_size(all_specs);
        final SubLObject denominator = set.set_size(all_specs_set(kb_utilities.$const350$Thing));
        return Numbers.divide(all_specs_count, denominator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 93250L)
    public static SubLObject max_non_overlapping_kb_coverage_cols(final SubLObject cols) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_utilities.$sym54$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_utilities.$const55$EverythingPSC, thread);
            final SubLObject all_cols = all_specs_set(kb_utilities.$const350$Thing);
            final SubLObject bad_specs = set_utilities.set_union(Mapping.mapcar((SubLObject)kb_utilities.$sym366$ALL_SPECS_SET, cols), (SubLObject)kb_utilities.UNPROVIDED);
            final SubLObject bad_cols = set_utilities.set_union((SubLObject)ConsesLow.listS(bad_specs, Mapping.mapcar((SubLObject)kb_utilities.$sym372$ALL_GENLS_SET, cols)), (SubLObject)kb_utilities.UNPROVIDED);
            final SubLObject potential_cols = Sequences.remove_if((SubLObject)kb_utilities.$sym365$FORBIDDEN_KB_COVERING_COLLECTION_, set.set_element_list(set_utilities.set_minus(all_cols, bad_cols, (SubLObject)kb_utilities.UNPROVIDED)), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
            SubLObject good_cols = (SubLObject)kb_utilities.NIL;
            SubLObject cdolist_list_var = potential_cols;
            SubLObject col = (SubLObject)kb_utilities.NIL;
            col = cdolist_list_var.first();
            while (kb_utilities.NIL != cdolist_list_var) {
                if (kb_utilities.NIL == set_utilities.sets_intersectP((SubLObject)ConsesLow.list(all_specs_set(col), bad_cols))) {
                    good_cols = (SubLObject)ConsesLow.cons(col, good_cols);
                }
                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            }
            final SubLObject max_good_cols = genls.max_cols(good_cols, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
            result = Sort.sort(max_good_cols, Symbols.symbol_function((SubLObject)kb_utilities.$sym59$_), (SubLObject)kb_utilities.$sym360$SPEC_CARDINALITY);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 94136L)
    public static SubLObject pretty_print_cycl_to_string(final SubLObject cycl, SubLObject depth) {
        if (depth == kb_utilities.UNPROVIDED) {
            depth = (SubLObject)kb_utilities.ZERO_INTEGER;
        }
        return string_remove_nart_affixes(string_utilities.string_remove_constant_reader_prefixes(format_cycl_expression.format_cycl_expression_to_string(cycl, depth)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 94600L)
    public static SubLObject string_remove_nart_affixes(final SubLObject string) {
        return string_utilities.do_string_substitutions_robust(string, (SubLObject)kb_utilities.$list375, (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 94734L)
    public static SubLObject collection_subsumption_paths(final SubLObject cols) {
        assert kb_utilities.NIL != list_utilities.non_dotted_list_p(cols) : cols;
        SubLObject cdolist_list_var = cols;
        SubLObject elem = (SubLObject)kb_utilities.NIL;
        elem = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            assert kb_utilities.NIL != fort_types_interface.collection_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        if (kb_utilities.NIL == cols) {
            return (SubLObject)kb_utilities.NIL;
        }
        if (kb_utilities.NIL != list_utilities.singletonP(cols)) {
            return (SubLObject)ConsesLow.list(cols);
        }
        SubLObject col_alist = (SubLObject)kb_utilities.NIL;
        cdolist_list_var = cols;
        SubLObject col = (SubLObject)kb_utilities.NIL;
        col = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            final SubLObject v_set = set_utilities.construct_set_from_list(genls.all_genls_among(col, Sequences.remove(col, cols, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED), Symbols.symbol_function((SubLObject)kb_utilities.EQL), (SubLObject)kb_utilities.UNPROVIDED);
            col_alist = list_utilities.alist_enter(col_alist, col, v_set, (SubLObject)kb_utilities.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        col_alist = Sequences.nreverse(col_alist);
        return collection_subsumption_paths_int(col_alist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 116213L)
    public static SubLObject collection_subsumption_paths_int(final SubLObject col_alist) {
        final SubLObject max_genls_count = number_utilities.maximum(Mapping.mapcar((SubLObject)kb_utilities.$sym378$SET_SIZE, list_utilities.alist_values(col_alist)), (SubLObject)kb_utilities.UNPROVIDED);
        SubLObject lowest_cols = (SubLObject)kb_utilities.NIL;
        SubLObject cdolist_list_var = col_alist;
        SubLObject cons = (SubLObject)kb_utilities.NIL;
        cons = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject col = (SubLObject)kb_utilities.NIL;
            SubLObject v_set = (SubLObject)kb_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list379);
            col = current.first();
            current = (v_set = current.rest());
            if (max_genls_count.numE(set.set_size(v_set))) {
                lowest_cols = (SubLObject)ConsesLow.cons(col, lowest_cols);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        final SubLObject co_genl_col = collection_subsumption_paths_co_genl_col(lowest_cols, col_alist);
        if (kb_utilities.NIL != co_genl_col) {
            lowest_cols = (SubLObject)ConsesLow.list(co_genl_col);
        }
        final SubLObject other_cols = list_utilities.fast_set_difference(list_utilities.alist_keys(col_alist), lowest_cols, (SubLObject)kb_utilities.UNPROVIDED);
        final SubLObject recursive_result = collection_subsumption_paths(other_cols);
        if (kb_utilities.NIL == recursive_result) {
            return Mapping.mapcar((SubLObject)kb_utilities.$sym380$LIST, lowest_cols);
        }
        SubLObject result = (SubLObject)kb_utilities.NIL;
        SubLObject cdolist_list_var2 = recursive_result;
        SubLObject partial_recursive_result = (SubLObject)kb_utilities.NIL;
        partial_recursive_result = cdolist_list_var2.first();
        while (kb_utilities.NIL != cdolist_list_var2) {
            final SubLObject lowest_recursive_col = partial_recursive_result.first();
            SubLObject used_partial_recursive_resultP = (SubLObject)kb_utilities.NIL;
            SubLObject cdolist_list_var_$225 = lowest_cols;
            SubLObject lowest_col = (SubLObject)kb_utilities.NIL;
            lowest_col = cdolist_list_var_$225.first();
            while (kb_utilities.NIL != cdolist_list_var_$225) {
                final SubLObject lowest_col_genls_set = list_utilities.alist_lookup(col_alist, lowest_col, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
                if (kb_utilities.NIL != set.set_memberP(lowest_recursive_col, lowest_col_genls_set)) {
                    result = (SubLObject)ConsesLow.cons(ConsesLow.append((SubLObject)ConsesLow.list(lowest_col), partial_recursive_result), result);
                    used_partial_recursive_resultP = (SubLObject)kb_utilities.T;
                }
                cdolist_list_var_$225 = cdolist_list_var_$225.rest();
                lowest_col = cdolist_list_var_$225.first();
            }
            if (kb_utilities.NIL == used_partial_recursive_resultP) {
                result = (SubLObject)ConsesLow.cons(partial_recursive_result, result);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            partial_recursive_result = cdolist_list_var2.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 117800L)
    public static SubLObject collection_subsumption_paths_co_genl_col(final SubLObject lowest_cols, final SubLObject col_alist) {
        SubLObject cdolist_list_var = lowest_cols;
        SubLObject col = (SubLObject)kb_utilities.NIL;
        col = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            final SubLObject genls_set = list_utilities.alist_lookup(col_alist, col, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
            final SubLObject set_contents_var = set.do_set_internal(genls_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject genl;
            SubLObject genls_genls_set;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                genl = set_contents.do_set_contents_next(basis_object, state);
                if (kb_utilities.NIL != set_contents.do_set_contents_element_validP(state, genl)) {
                    genls_genls_set = list_utilities.alist_lookup(col_alist, genl, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
                    if (kb_utilities.NIL != set.set_memberP(col, genls_genls_set)) {
                        return col;
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 118218L)
    public static SubLObject predicate_subsumption_paths(final SubLObject preds) {
        assert kb_utilities.NIL != list_utilities.non_dotted_list_p(preds) : preds;
        SubLObject cdolist_list_var = preds;
        SubLObject elem = (SubLObject)kb_utilities.NIL;
        elem = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            assert kb_utilities.NIL != fort_types_interface.predicate_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        if (kb_utilities.NIL == preds) {
            return (SubLObject)kb_utilities.NIL;
        }
        if (kb_utilities.NIL != list_utilities.singletonP(preds)) {
            return (SubLObject)ConsesLow.list(preds);
        }
        SubLObject pred_alist = (SubLObject)kb_utilities.NIL;
        cdolist_list_var = preds;
        SubLObject pred = (SubLObject)kb_utilities.NIL;
        pred = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            final SubLObject v_set = set_utilities.construct_set_from_list(genl_predicates.all_genl_preds_among(pred, Sequences.remove(pred, preds, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED), Symbols.symbol_function((SubLObject)kb_utilities.EQL), (SubLObject)kb_utilities.UNPROVIDED);
            pred_alist = list_utilities.alist_enter(pred_alist, pred, v_set, (SubLObject)kb_utilities.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        pred_alist = Sequences.nreverse(pred_alist);
        return predicate_subsumption_paths_int(pred_alist);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 119151L)
    public static SubLObject predicate_subsumption_paths_int(final SubLObject pred_alist) {
        final SubLObject max_genl_preds_count = number_utilities.maximum(Mapping.mapcar((SubLObject)kb_utilities.$sym378$SET_SIZE, list_utilities.alist_values(pred_alist)), (SubLObject)kb_utilities.UNPROVIDED);
        SubLObject lowest_preds = (SubLObject)kb_utilities.NIL;
        SubLObject cdolist_list_var = pred_alist;
        SubLObject cons = (SubLObject)kb_utilities.NIL;
        cons = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject pred = (SubLObject)kb_utilities.NIL;
            SubLObject v_set = (SubLObject)kb_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list382);
            pred = current.first();
            current = (v_set = current.rest());
            if (max_genl_preds_count.numE(set.set_size(v_set))) {
                lowest_preds = (SubLObject)ConsesLow.cons(pred, lowest_preds);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        final SubLObject co_genl_pred = predicate_subsumption_paths_co_genl_pred(lowest_preds, pred_alist);
        if (kb_utilities.NIL != co_genl_pred) {
            lowest_preds = (SubLObject)ConsesLow.list(co_genl_pred);
        }
        final SubLObject other_preds = list_utilities.fast_set_difference(list_utilities.alist_keys(pred_alist), lowest_preds, (SubLObject)kb_utilities.UNPROVIDED);
        final SubLObject recursive_result = predicate_subsumption_paths(other_preds);
        if (kb_utilities.NIL == recursive_result) {
            return Mapping.mapcar((SubLObject)kb_utilities.$sym380$LIST, lowest_preds);
        }
        SubLObject result = (SubLObject)kb_utilities.NIL;
        SubLObject cdolist_list_var2 = recursive_result;
        SubLObject partial_recursive_result = (SubLObject)kb_utilities.NIL;
        partial_recursive_result = cdolist_list_var2.first();
        while (kb_utilities.NIL != cdolist_list_var2) {
            final SubLObject lowest_recursive_pred = partial_recursive_result.first();
            SubLObject used_partial_recursive_resultP = (SubLObject)kb_utilities.NIL;
            SubLObject cdolist_list_var_$226 = lowest_preds;
            SubLObject lowest_pred = (SubLObject)kb_utilities.NIL;
            lowest_pred = cdolist_list_var_$226.first();
            while (kb_utilities.NIL != cdolist_list_var_$226) {
                final SubLObject lowest_pred_genl_preds_set = list_utilities.alist_lookup(pred_alist, lowest_pred, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
                if (kb_utilities.NIL != set.set_memberP(lowest_recursive_pred, lowest_pred_genl_preds_set)) {
                    result = (SubLObject)ConsesLow.cons(ConsesLow.append((SubLObject)ConsesLow.list(lowest_pred), partial_recursive_result), result);
                    used_partial_recursive_resultP = (SubLObject)kb_utilities.T;
                }
                cdolist_list_var_$226 = cdolist_list_var_$226.rest();
                lowest_pred = cdolist_list_var_$226.first();
            }
            if (kb_utilities.NIL == used_partial_recursive_resultP) {
                result = (SubLObject)ConsesLow.cons(partial_recursive_result, result);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            partial_recursive_result = cdolist_list_var2.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 120808L)
    public static SubLObject predicate_subsumption_paths_co_genl_pred(final SubLObject lowest_preds, final SubLObject pred_alist) {
        SubLObject cdolist_list_var = lowest_preds;
        SubLObject pred = (SubLObject)kb_utilities.NIL;
        pred = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            final SubLObject genl_preds_set = list_utilities.alist_lookup(pred_alist, pred, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
            final SubLObject set_contents_var = set.do_set_internal(genl_preds_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject genl;
            SubLObject genl_preds_genl_preds_set;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kb_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kb_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                genl = set_contents.do_set_contents_next(basis_object, state);
                if (kb_utilities.NIL != set_contents.do_set_contents_element_validP(state, genl)) {
                    genl_preds_genl_preds_set = list_utilities.alist_lookup(pred_alist, genl, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
                    if (kb_utilities.NIL != set.set_memberP(pred, genl_preds_genl_preds_set)) {
                        return pred;
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 121518L)
    public static SubLObject predicate_type_for_arity(final SubLObject v_arity) {
        final SubLObject predicate_type = list_utilities.alist_lookup(kb_utilities.$predicate_type_arity_table$.getGlobalValue(), v_arity, Symbols.symbol_function((SubLObject)kb_utilities.EQL), (SubLObject)kb_utilities.UNPROVIDED);
        assert kb_utilities.NIL != forts.fort_p(predicate_type) : predicate_type;
        return predicate_type;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 121716L)
    public static SubLObject arity_of_predicate_type(final SubLObject predicate_type) {
        final SubLObject v_arity = list_utilities.alist_reverse_lookup(kb_utilities.$predicate_type_arity_table$.getGlobalValue(), predicate_type, Symbols.symbol_function((SubLObject)kb_utilities.EQL), (SubLObject)kb_utilities.UNPROVIDED);
        assert kb_utilities.NIL != subl_promotions.positive_integer_p(v_arity) : v_arity;
        return v_arity;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 121924L)
    public static SubLObject random_hl_gaf() {
        SubLObject gaf;
        for (gaf = (SubLObject)kb_utilities.NIL; kb_utilities.NIL == hl_gafP(gaf); gaf = assertions_high.random_gaf()) {}
        return gaf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 122044L)
    public static SubLObject random_non_hl_gaf() {
        SubLObject gaf;
        for (gaf = (SubLObject)kb_utilities.NIL; kb_utilities.NIL == non_hl_gafP(gaf); gaf = assertions_high.random_gaf()) {}
        return gaf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 122172L)
    public static SubLObject random_sbhl_gaf() {
        SubLObject gaf;
        for (gaf = (SubLObject)kb_utilities.NIL; kb_utilities.NIL == sbhl_gafP(gaf); gaf = assertions_high.random_gaf()) {}
        return gaf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 122296L)
    public static SubLObject random_non_sbhl_gaf() {
        SubLObject gaf;
        for (gaf = (SubLObject)kb_utilities.NIL; kb_utilities.NIL == non_sbhl_gafP(gaf); gaf = assertions_high.random_gaf()) {}
        return gaf;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 122428L)
    public static SubLObject hl_gafP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL != assertions_high.gaf_assertionP(v_object) && kb_utilities.NIL != hl_supports.hl_predicate_p(assertions_high.gaf_predicate(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 122547L)
    public static SubLObject non_hl_gafP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL != assertions_high.gaf_assertionP(v_object) && kb_utilities.NIL == hl_supports.hl_predicate_p(assertions_high.gaf_predicate(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 122677L)
    public static SubLObject sbhl_gafP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL != assertions_high.gaf_assertionP(v_object) && kb_utilities.NIL != sbhl_module_utilities.sbhl_predicate_p(assertions_high.gaf_predicate(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 122800L)
    public static SubLObject non_sbhl_gafP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL != assertions_high.gaf_assertionP(v_object) && kb_utilities.NIL == sbhl_module_utilities.sbhl_predicate_p(assertions_high.gaf_predicate(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 122934L)
    public static SubLObject random_argnum(final SubLObject formula, SubLObject consider_predicateP) {
        if (consider_predicateP == kb_utilities.UNPROVIDED) {
            consider_predicateP = (SubLObject)kb_utilities.NIL;
        }
        final SubLObject n = Numbers.add(el_utilities.formula_arity(formula, (SubLObject)kb_utilities.UNPROVIDED), (SubLObject)((kb_utilities.NIL != consider_predicateP) ? kb_utilities.ONE_INTEGER : kb_utilities.ZERO_INTEGER));
        final SubLObject argnum = Numbers.add(random.random(n), (SubLObject)((kb_utilities.NIL != consider_predicateP) ? kb_utilities.ZERO_INTEGER : kb_utilities.ONE_INTEGER));
        return argnum;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 123297L)
    public static SubLObject safe_random_closed_argnum(final SubLObject formula, SubLObject consider_predicateP) {
        if (consider_predicateP == kb_utilities.UNPROVIDED) {
            consider_predicateP = (SubLObject)kb_utilities.NIL;
        }
        return random_closed_argnum_int(formula, consider_predicateP, (SubLObject)kb_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 123552L)
    public static SubLObject random_closed_argnum(final SubLObject formula, SubLObject consider_predicateP) {
        if (consider_predicateP == kb_utilities.UNPROVIDED) {
            consider_predicateP = (SubLObject)kb_utilities.NIL;
        }
        return random_closed_argnum_int(formula, consider_predicateP, (SubLObject)kb_utilities.T);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 123785L)
    public static SubLObject random_closed_argnum_int(final SubLObject formula, final SubLObject consider_predicateP, final SubLObject error_if_all_args_openP) {
        SubLObject result = (SubLObject)kb_utilities.NIL;
        SubLObject count = (SubLObject)kb_utilities.ZERO_INTEGER;
        while (kb_utilities.NIL == result) {
            count = Numbers.add(count, (SubLObject)kb_utilities.ONE_INTEGER);
            if (count.numG((SubLObject)kb_utilities.$int162$10000)) {
                if (kb_utilities.NIL == error_if_all_args_openP) {
                    Errors.warn((SubLObject)kb_utilities.$str384$All_args_of__s_were_open, formula);
                    return (SubLObject)kb_utilities.NIL;
                }
                Errors.error((SubLObject)kb_utilities.$str384$All_args_of__s_were_open, formula);
            }
            final SubLObject argnum = random_argnum(formula, consider_predicateP);
            if (kb_utilities.NIL != el_utilities.closedP(cycl_utilities.formula_arg(formula, argnum, (SubLObject)kb_utilities.UNPROVIDED), (SubLObject)kb_utilities.UNPROVIDED)) {
                result = argnum;
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 124298L)
    public static SubLObject turn_a_random_arg_into_a_variable(final SubLObject formula, SubLObject consider_predicateP) {
        if (consider_predicateP == kb_utilities.UNPROVIDED) {
            consider_predicateP = (SubLObject)kb_utilities.NIL;
        }
        final SubLObject argnum = random_argnum(formula, consider_predicateP);
        final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(formula, (SubLObject)kb_utilities.UNPROVIDED);
        return el_utilities.replace_formula_arg(argnum, new_var, formula);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 124643L)
    public static SubLObject random_predicate() {
        SubLObject pred;
        for (pred = (SubLObject)kb_utilities.NIL; kb_utilities.NIL == fort_types_interface.predicate_p(pred); pred = forts.random_fort((SubLObject)kb_utilities.UNPROVIDED)) {}
        return pred;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 124851L)
    public static SubLObject random_binary_predicate() {
        SubLObject pred;
        for (pred = (SubLObject)kb_utilities.NIL; kb_utilities.NIL == fort_types_interface.predicate_p(pred) || kb_utilities.NIL == isa.isaP(pred, kb_utilities.$const385$BinaryPredicate, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED); pred = forts.random_fort((SubLObject)kb_utilities.UNPROVIDED)) {}
        return pred;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 125027L)
    public static SubLObject gather_dates(final SubLObject expression, SubLObject mt) {
        if (mt == kb_utilities.UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kb_utilities.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = cycl_utilities.expression_gather(expression, (SubLObject)kb_utilities.$sym386$DATE_, (SubLObject)kb_utilities.T, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 125232L)
    public static SubLObject dateP(final SubLObject v_object) {
        return at_defns.quiet_has_typeP(v_object, kb_utilities.$const387$Date, (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 125305L)
    public static SubLObject not_at_all_commutative_predicate_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL != fort_types_interface.predicate_p(v_object) && kb_utilities.NIL == fort_types_interface.commutative_relation_p(v_object) && kb_utilities.NIL == fort_types_interface.partially_commutative_relation_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 125502L)
    public static SubLObject at_least_partially_commutative_predicate_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL != fort_types_interface.predicate_p(v_object) && (kb_utilities.NIL != fort_types_interface.commutative_relation_p(v_object) || kb_utilities.NIL != fort_types_interface.partially_commutative_relation_p(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 125697L)
    public static SubLObject not_at_all_commutative_relation_p(final SubLObject relation) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == fort_types_interface.commutative_relation_p(relation) && kb_utilities.NIL == fort_types_interface.partially_commutative_relation_p(relation));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 125907L)
    public static SubLObject at_least_partially_commutative_relation_p(final SubLObject relation) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL != fort_types_interface.commutative_relation_p(relation) || kb_utilities.NIL != fort_types_interface.partially_commutative_relation_p(relation));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 126109L)
    public static SubLObject find_invalid_constant_references(final SubLObject string) {
        SubLObject references = (SubLObject)kb_utilities.NIL;
        SubLObject cdolist_list_var = string_utilities.search_all(constant_reader.constant_reader_prefix(), string, Symbols.symbol_function((SubLObject)kb_utilities.EQUAL), (SubLObject)kb_utilities.UNPROVIDED);
        SubLObject position = (SubLObject)kb_utilities.NIL;
        position = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            final SubLObject start = Numbers.add(position, (SubLObject)kb_utilities.TWO_INTEGER);
            final SubLObject end = list_utilities.position_if_not((SubLObject)kb_utilities.$sym388$VALID_CONSTANT_NAME_CHAR_P, string, Symbols.symbol_function((SubLObject)kb_utilities.IDENTITY), start, (SubLObject)kb_utilities.UNPROVIDED);
            final SubLObject name_string = string_utilities.substring(string, start, end);
            SubLObject validP = constant_handles.valid_constantP(constants_high.find_constant(name_string), (SubLObject)kb_utilities.UNPROVIDED);
            for (SubLObject shortened = name_string; kb_utilities.NIL == validP && kb_utilities.NIL != string_utilities.non_empty_string_p(shortened) && kb_utilities.NIL != conses_high.member(string_utilities.last_char(shortened), (SubLObject)kb_utilities.$list389, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED); shortened = string_utilities.remove_last_char(shortened, (SubLObject)kb_utilities.UNPROVIDED), validP = constants_high.find_constant(shortened)) {}
            if (kb_utilities.NIL == validP) {
                references = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(start, name_string), references);
            }
            cdolist_list_var = cdolist_list_var.rest();
            position = cdolist_list_var.first();
        }
        return references;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 127120L)
    public static SubLObject fix_invalid_constant_references(final SubLObject assertion) {
        assert kb_utilities.NIL != assertions_high.gaf_assertionP(assertion) : assertion;
        SubLObject new_sentence;
        final SubLObject old_sentence = new_sentence = ke.ke_assertion_edit_formula(assertion);
        final SubLObject terms = cycl_utilities.formula_terms(old_sentence, (SubLObject)kb_utilities.$kw391$IGNORE);
        SubLObject list_var = (SubLObject)kb_utilities.NIL;
        SubLObject v_term = (SubLObject)kb_utilities.NIL;
        SubLObject argnum = (SubLObject)kb_utilities.NIL;
        list_var = terms;
        v_term = list_var.first();
        for (argnum = (SubLObject)kb_utilities.ZERO_INTEGER; kb_utilities.NIL != list_var; list_var = list_var.rest(), v_term = list_var.first(), argnum = number_utilities.f_1X(argnum)) {
            if (v_term.isString()) {
                SubLObject new_string = v_term;
                SubLObject cdolist_list_var = list_utilities.sort_alist_by_keys(find_invalid_constant_references(v_term), Symbols.symbol_function((SubLObject)kb_utilities.$sym59$_));
                SubLObject cons = (SubLObject)kb_utilities.NIL;
                cons = cdolist_list_var.first();
                while (kb_utilities.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = cons;
                    SubLObject start = (SubLObject)kb_utilities.NIL;
                    SubLObject name = (SubLObject)kb_utilities.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list392);
                    start = current.first();
                    current = (name = current.rest());
                    new_string = fix_invalid_constant_reference(new_string, name, start, (SubLObject)kb_utilities.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    cons = cdolist_list_var.first();
                }
                if (!new_string.eql(v_term)) {
                    new_sentence = el_utilities.replace_formula_arg(argnum, new_string, new_sentence);
                }
            }
        }
        if (!new_sentence.eql(old_sentence)) {
            ke.ke_edit_assertion_strings(assertion, new_sentence, assertion_utilities.all_meta_assertions(assertion));
        }
        return (SubLObject)(new_sentence.eql(old_sentence) ? kb_utilities.NIL : new_sentence);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 127916L)
    public static SubLObject fix_invalid_constant_reference(final SubLObject string, final SubLObject name, final SubLObject start, SubLObject recursedP) {
        if (recursedP == kb_utilities.UNPROVIDED) {
            recursedP = (SubLObject)kb_utilities.NIL;
        }
        final SubLObject former_constants = find_former_constants_named(name);
        SubLObject new_string = string;
        if (kb_utilities.NIL != list_utilities.singletonP(former_constants)) {
            new_string = string_utilities.nreplace_substring_at(new_string, start, Sequences.length(name), constants_high.constant_name(former_constants.first()));
        }
        else if (kb_utilities.NIL == recursedP && kb_utilities.NIL != list_utilities.empty_list_p(former_constants) && kb_utilities.NIL != string_utilities.non_empty_string_p(name) && Characters.CHAR_s.eql(string_utilities.last_char(name))) {
            new_string = fix_invalid_constant_reference(string, string_utilities.remove_last_char(name, (SubLObject)kb_utilities.UNPROVIDED), start, (SubLObject)kb_utilities.T);
        }
        return new_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 128511L)
    public static SubLObject find_former_constants_named(final SubLObject string) {
        return kb_mapping_utilities.pred_values_in_any_mt(string, kb_utilities.$const393$oldConstantName, (SubLObject)kb_utilities.TWO_INTEGER, (SubLObject)kb_utilities.ONE_INTEGER, (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 128792L)
    public static SubLObject coasserted_forts(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kb_utilities.NIL != forts.fort_p(fort) : fort;
        SubLObject v_forts = (SubLObject)kb_utilities.NIL;
        final SubLObject _prev_bind_0 = kb_utilities.$coasserted_fort_source$.currentBinding(thread);
        final SubLObject _prev_bind_2 = kb_utilities.$coasserted_fort_set$.currentBinding(thread);
        try {
            kb_utilities.$coasserted_fort_source$.bind(fort, thread);
            kb_utilities.$coasserted_fort_set$.bind(set_contents.new_set_contents(kb_indexing.num_index(fort), Symbols.symbol_function((SubLObject)kb_utilities.EQL)), thread);
            if (kb_utilities.NIL != kb_mapping_macros.do_term_index_key_validator(fort, (SubLObject)kb_utilities.NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(fort, (SubLObject)kb_utilities.NIL);
                SubLObject done_var = (SubLObject)kb_utilities.NIL;
                final SubLObject token_var = (SubLObject)kb_utilities.NIL;
                while (kb_utilities.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (kb_utilities.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)kb_utilities.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.NIL);
                            SubLObject done_var_$227 = (SubLObject)kb_utilities.NIL;
                            final SubLObject token_var_$228 = (SubLObject)kb_utilities.NIL;
                            while (kb_utilities.NIL == done_var_$227) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$228);
                                final SubLObject valid_$229 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$228.eql(assertion));
                                if (kb_utilities.NIL != valid_$229 && kb_utilities.NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec)) {
                                    final SubLObject assertion_cons = assertions_high.assertion_cons(assertion);
                                    list_utilities.tree_find_if(Symbols.symbol_function((SubLObject)kb_utilities.$sym394$VISIT_COASSERTED_FORT), assertion_cons, (SubLObject)kb_utilities.UNPROVIDED);
                                }
                                done_var_$227 = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid_$229);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$230 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (kb_utilities.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$230, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid);
                }
            }
            v_forts = set_contents.set_contents_element_list(kb_utilities.$coasserted_fort_set$.getDynamicValue(thread));
        }
        finally {
            kb_utilities.$coasserted_fort_set$.rebind(_prev_bind_2, thread);
            kb_utilities.$coasserted_fort_source$.rebind(_prev_bind_0, thread);
        }
        return v_forts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 129400L)
    public static SubLObject visit_coasserted_fort(final SubLObject other_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_utilities.NIL != forts.fort_p(other_fort) && !other_fort.eql(kb_utilities.$coasserted_fort_source$.getDynamicValue(thread))) {
            kb_utilities.$coasserted_fort_set$.setDynamicValue(set_contents.set_contents_add(other_fort, kb_utilities.$coasserted_fort_set$.getDynamicValue(thread), Symbols.symbol_function((SubLObject)kb_utilities.EQL)), thread);
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 129659L)
    public static SubLObject clear_cached_compact_hl_external_id_string() {
        final SubLObject cs = kb_utilities.$cached_compact_hl_external_id_string_caching_state$.getGlobalValue();
        if (kb_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 129659L)
    public static SubLObject remove_cached_compact_hl_external_id_string(final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args(kb_utilities.$cached_compact_hl_external_id_string_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(v_term), (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 129659L)
    public static SubLObject cached_compact_hl_external_id_string_internal(final SubLObject v_term) {
        return compact_hl_external_id_string(v_term);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 129659L)
    public static SubLObject cached_compact_hl_external_id_string(final SubLObject v_term) {
        SubLObject caching_state = kb_utilities.$cached_compact_hl_external_id_string_caching_state$.getGlobalValue();
        if (kb_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)kb_utilities.$sym395$CACHED_COMPACT_HL_EXTERNAL_ID_STRING, (SubLObject)kb_utilities.$sym396$_CACHED_COMPACT_HL_EXTERNAL_ID_STRING_CACHING_STATE_, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.EQL, (SubLObject)kb_utilities.ONE_INTEGER, (SubLObject)kb_utilities.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(cached_compact_hl_external_id_string_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, (SubLObject)kb_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 129785L)
    public static SubLObject write_coasserted_forts(final SubLObject fort, SubLObject stream) {
        if (stream == kb_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject other_forts = coasserted_forts(fort);
        streams_high.write_string(cached_compact_hl_external_id_string(fort), stream, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = other_forts;
        SubLObject other_fort = (SubLObject)kb_utilities.NIL;
        other_fort = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            streams_high.write_string((SubLObject)kb_utilities.$str397$_, stream, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
            streams_high.write_string(cached_compact_hl_external_id_string(other_fort), stream, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            other_fort = cdolist_list_var.first();
        }
        streams_high.terpri(stream);
        return Sequences.length(other_forts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 130189L)
    public static SubLObject write_all_coasserted_forts_to_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = (SubLObject)kb_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)kb_utilities.NIL, thread);
                stream = compatibility.open_text(filename, (SubLObject)kb_utilities.$kw398$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)kb_utilities.$str399$Unable_to_open__S, filename);
            }
            final SubLObject stream_$231 = stream;
            final SubLObject message = (SubLObject)kb_utilities.$str400$Writing_coasserted_forts;
            final SubLObject total = forts.fort_count();
            SubLObject sofar = (SubLObject)kb_utilities.ZERO_INTEGER;
            final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kb_utilities.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kb_utilities.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(message);
                    SubLObject cdolist_list_var = forts.do_forts_tables();
                    SubLObject table_var = (SubLObject)kb_utilities.NIL;
                    table_var = cdolist_list_var.first();
                    while (kb_utilities.NIL != cdolist_list_var) {
                        final SubLObject idx = table_var;
                        if (kb_utilities.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)kb_utilities.$kw65$SKIP)) {
                            final SubLObject idx_$232 = idx;
                            if (kb_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$232, (SubLObject)kb_utilities.$kw65$SKIP)) {
                                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$232);
                                final SubLObject backwardP_var = (SubLObject)kb_utilities.NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject id;
                                SubLObject fort;
                                SubLObject message_var;
                                SubLObject was_appendingP;
                                SubLObject _prev_bind_0_$233;
                                SubLObject _prev_bind_0_$234;
                                SubLObject _values;
                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kb_utilities.NIL, v_iteration = (SubLObject)kb_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kb_utilities.ONE_INTEGER)) {
                                    id = ((kb_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kb_utilities.ONE_INTEGER) : v_iteration);
                                    fort = Vectors.aref(vector_var, id);
                                    if (kb_utilities.NIL == id_index.id_index_tombstone_p(fort) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                        if (kb_utilities.NIL != id_index.id_index_tombstone_p(fort)) {
                                            fort = (SubLObject)kb_utilities.$kw65$SKIP;
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                        message_var = (SubLObject)kb_utilities.NIL;
                                        was_appendingP = Eval.eval((SubLObject)kb_utilities.$sym401$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
                                        Eval.eval((SubLObject)kb_utilities.$list402);
                                        try {
                                            try {
                                                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                                _prev_bind_0_$233 = Errors.$error_handler$.currentBinding(thread);
                                                try {
                                                    Errors.$error_handler$.bind((SubLObject)kb_utilities.$sym403$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                    try {
                                                        write_coasserted_forts(fort, stream_$231);
                                                    }
                                                    catch (Throwable catch_var) {
                                                        Errors.handleThrowable(catch_var, (SubLObject)kb_utilities.NIL);
                                                    }
                                                }
                                                finally {
                                                    Errors.$error_handler$.rebind(_prev_bind_0_$233, thread);
                                                }
                                            }
                                            catch (Throwable ccatch_env_var) {
                                                message_var = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                            }
                                            finally {
                                                thread.throwStack.pop();
                                            }
                                        }
                                        finally {
                                            _prev_bind_0_$234 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                                                _values = Values.getValuesAsVector();
                                                Eval.eval((SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym404$CSETQ, (SubLObject)kb_utilities.$sym401$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                                                Values.restoreValuesFromVector(_values);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$234, thread);
                                            }
                                        }
                                        if (message_var.isString()) {
                                            Errors.warn((SubLObject)kb_utilities.$str405$_A, message_var);
                                        }
                                    }
                                }
                            }
                            final SubLObject idx_$233 = idx;
                            if (kb_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$233) || kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) {
                                final SubLObject sparse = id_index.id_index_sparse_objects(idx_$233);
                                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$233);
                                final SubLObject end_id = id_index.id_index_next_id(idx_$233);
                                final SubLObject v_default = (SubLObject)((kb_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP)) ? kb_utilities.NIL : kb_utilities.$kw65$SKIP);
                                while (id2.numL(end_id)) {
                                    final SubLObject fort2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                    if (kb_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kb_utilities.$kw65$SKIP) || kb_utilities.NIL == id_index.id_index_tombstone_p(fort2)) {
                                        sofar = Numbers.add(sofar, (SubLObject)kb_utilities.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                        SubLObject message_var2 = (SubLObject)kb_utilities.NIL;
                                        final SubLObject was_appendingP2 = Eval.eval((SubLObject)kb_utilities.$sym401$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
                                        Eval.eval((SubLObject)kb_utilities.$list402);
                                        try {
                                            try {
                                                thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                                final SubLObject _prev_bind_0_$235 = Errors.$error_handler$.currentBinding(thread);
                                                try {
                                                    Errors.$error_handler$.bind((SubLObject)kb_utilities.$sym403$CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                    try {
                                                        write_coasserted_forts(fort2, stream_$231);
                                                    }
                                                    catch (Throwable catch_var2) {
                                                        Errors.handleThrowable(catch_var2, (SubLObject)kb_utilities.NIL);
                                                    }
                                                }
                                                finally {
                                                    Errors.$error_handler$.rebind(_prev_bind_0_$235, thread);
                                                }
                                            }
                                            catch (Throwable ccatch_env_var2) {
                                                message_var2 = Errors.handleThrowable(ccatch_env_var2, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                            }
                                            finally {
                                                thread.throwStack.pop();
                                            }
                                        }
                                        finally {
                                            final SubLObject _prev_bind_0_$236 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                                                final SubLObject _values2 = Values.getValuesAsVector();
                                                Eval.eval((SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym404$CSETQ, (SubLObject)kb_utilities.$sym401$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP2));
                                                Values.restoreValuesFromVector(_values2);
                                            }
                                            finally {
                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$236, thread);
                                            }
                                        }
                                        if (message_var2.isString()) {
                                            Errors.warn((SubLObject)kb_utilities.$str405$_A, message_var2);
                                        }
                                    }
                                    id2 = Numbers.add(id2, (SubLObject)kb_utilities.ONE_INTEGER);
                                }
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        table_var = cdolist_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$237 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$237, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_5, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                final SubLObject _values4 = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kb_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values4);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 130427L)
    public static SubLObject core_union_constantP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL != constant_handles.constant_p(v_object) && kb_utilities.NIL != isa.quoted_isaP(v_object, kb_utilities.$const406$CoreUnionConstant, kb_utilities.$const407$BookkeepingMt, (SubLObject)kb_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 130578L)
    public static SubLObject non_core_union_constantP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL != constant_handles.constant_p(v_object) && kb_utilities.NIL == core_union_constantP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 130707L)
    public static SubLObject non_core_union_constants(final SubLObject expression) {
        return cycl_utilities.expression_gather(expression, (SubLObject)kb_utilities.$sym408$NON_CORE_UNION_CONSTANT_, (SubLObject)kb_utilities.T, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 130829L)
    public static SubLObject create_spec_mt(final SubLObject mt, SubLObject name_prefix) {
        if (name_prefix == kb_utilities.UNPROVIDED) {
            name_prefix = (SubLObject)kb_utilities.$str409$SpecMt;
        }
        assert kb_utilities.NIL != fort_types_interface.microtheory_p(mt) : mt;
        final SubLObject name = Sequences.cconcatenate(name_prefix, string_utilities.str(random.random((SubLObject)kb_utilities.$int411$100000)));
        final SubLObject spec_mt = cyc_kernel.cyc_create_new_ephemeral(name);
        return cyc_kernel.cyc_assert((SubLObject)ConsesLow.list(kb_utilities.$const412$genlMt, spec_mt, mt), mt_vars.$mt_mt$.getGlobalValue(), (SubLObject)kb_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 131104L)
    public static SubLObject hl_object_to_evaluatable_string(final SubLObject v_object, SubLObject testP) {
        if (testP == kb_utilities.UNPROVIDED) {
            testP = (SubLObject)kb_utilities.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        dumper.$last_invalid_assertion$.setDynamicValue((SubLObject)kb_utilities.NIL, thread);
        final SubLObject _prev_bind_0 = print_high.$print_pretty$.currentBinding(thread);
        final SubLObject _prev_bind_2 = print_high.$print_length$.currentBinding(thread);
        final SubLObject _prev_bind_3 = print_high.$print_level$.currentBinding(thread);
        try {
            print_high.$print_pretty$.bind((SubLObject)kb_utilities.NIL, thread);
            print_high.$print_length$.bind((SubLObject)kb_utilities.NIL, thread);
            print_high.$print_level$.bind((SubLObject)kb_utilities.NIL, thread);
            if (kb_utilities.NIL == v_object || kb_utilities.NIL != constant_handles.constant_p(v_object) || v_object.isString() || v_object.isNumber() || v_object.isKeyword()) {
                final SubLObject result = print_high.prin1_to_string(v_object);
                if (kb_utilities.NIL != testP && !v_object.equalp(Eval.eval(reader.read_from_string(result, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED)))) {
                    Errors.warn((SubLObject)kb_utilities.$str413$Unable_to_create_HL_object_evalua, v_object);
                    return (SubLObject)kb_utilities.NIL;
                }
                return result;
            }
            else if (v_object.isSymbol()) {
                SubLObject result = print_high.prin1_to_string(v_object);
                result = Sequences.cconcatenate((SubLObject)kb_utilities.$str414$_, result);
                if (kb_utilities.NIL != testP && !v_object.equalp(Eval.eval(reader.read_from_string(result, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED)))) {
                    Errors.warn((SubLObject)kb_utilities.$str413$Unable_to_create_HL_object_evalua, v_object);
                    return (SubLObject)kb_utilities.NIL;
                }
                return result;
            }
            else if (kb_utilities.NIL != Guids.guid_p(v_object)) {
                final SubLObject result = Sequences.cconcatenate((SubLObject)kb_utilities.$str415$_string_to_guid_, new SubLObject[] { print_high.prin1_to_string(Guids.guid_to_string(v_object)), kb_utilities.$str416$_ });
                if (kb_utilities.NIL != testP && !v_object.equalp(Eval.eval(reader.read_from_string(result, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED)))) {
                    Errors.warn((SubLObject)kb_utilities.$str413$Unable_to_create_HL_object_evalua, v_object);
                    return (SubLObject)kb_utilities.NIL;
                }
                return result;
            }
            else {
                if (kb_utilities.NIL == variables.variable_p(v_object)) {
                    final SubLObject transformed_object = transform_list_utilities.transform(v_object, (SubLObject)kb_utilities.$sym418$IS_TRANSFORMABLE_HL_OBJECT_INT_, (SubLObject)kb_utilities.$sym419$MAKE_HL_READABLE_INT, (SubLObject)kb_utilities.UNPROVIDED);
                    final SubLObject orig_result = print_high.prin1_to_string(transformed_object);
                    SubLObject result2 = string_utilities.copy_string(orig_result);
                    if (kb_utilities.NIL != string_utilities.substringP((SubLObject)kb_utilities.$str420$AAAAAAAAAAAAA, result2, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED)) {
                        SubLObject input_string;
                        SubLObject function_name;
                        SubLObject pattern;
                        SubLObject offset;
                        SubLObject current;
                        SubLObject datum;
                        SubLObject start;
                        SubLObject end;
                        SubLObject index;
                        SubLObject num = null;
                        for (result2 = string_utilities.string_substitute((SubLObject)kb_utilities.$str421$__find_nart__, (SubLObject)kb_utilities.$str422$_AAAAAAAAAAAAAFIND_NART_, result2, (SubLObject)kb_utilities.UNPROVIDED), result2 = string_utilities.string_substitute((SubLObject)kb_utilities.$str423$__find_variable_by_id_, (SubLObject)kb_utilities.$str424$_AAAAAAAAAAAAAFIND_VARIABLE_BY_ID, result2, (SubLObject)kb_utilities.UNPROVIDED), result2 = string_utilities.string_substitute((SubLObject)kb_utilities.$str425$__string_to_guid_, (SubLObject)kb_utilities.$str426$_AAAAAAAAAAAAASTRING_TO_GUID_, result2, (SubLObject)kb_utilities.UNPROVIDED), result2 = string_utilities.string_substitute((SubLObject)kb_utilities.$str427$__find_assertion__, (SubLObject)kb_utilities.$str428$_AAAAAAAAAAAAAFIND_ASSERTION_, result2, (SubLObject)kb_utilities.UNPROVIDED), result2 = string_utilities.string_substitute((SubLObject)kb_utilities.$str429$__find_deduction__, (SubLObject)kb_utilities.$str430$_AAAAAAAAAAAAAFIND_DEDUCTION_, result2, (SubLObject)kb_utilities.UNPROVIDED), result2 = string_utilities.string_substitute((SubLObject)kb_utilities.$str431$__find_kb_hl_support__, (SubLObject)kb_utilities.$str432$_AAAAAAAAAAAAAFIND_KB_HL_SUPPORT_, result2, (SubLObject)kb_utilities.UNPROVIDED), result2 = string_utilities.string_substitute((SubLObject)kb_utilities.$str433$_, (SubLObject)kb_utilities.$str434$_AAAAAAAAAAAAA__, result2, (SubLObject)kb_utilities.UNPROVIDED); kb_utilities.NIL != string_utilities.substringP((SubLObject)kb_utilities.$str435$_AAAAAAAAAAAAAFIND_VARIABLE_BY_ID, result2, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED); result2 = string_utilities.string_substitute(Sequences.cconcatenate((SubLObject)kb_utilities.$str439$_____find_variable_by_id_, new SubLObject[] { num, kb_utilities.$str416$_ }), Sequences.cconcatenate((SubLObject)kb_utilities.$str435$_AAAAAAAAAAAAAFIND_VARIABLE_BY_ID, num), result2, (SubLObject)kb_utilities.UNPROVIDED)) {
                            input_string = result2;
                            function_name = (SubLObject)kb_utilities.$str436$AAAAAAAAAAAAAFIND_VARIABLE_BY_ID;
                            pattern = Sequences.cconcatenate(function_name, new SubLObject[] { kb_utilities.$str397$_, kb_utilities.$str437$_0_9__ });
                            offset = regular_expression_utilities.offsets_of_regex_matches(pattern, input_string, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED).first();
                            if (offset.isCons()) {
                                datum = (current = offset);
                                start = (SubLObject)kb_utilities.NIL;
                                end = (SubLObject)kb_utilities.NIL;
                                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list438);
                                start = current.first();
                                current = (end = current.rest());
                                index = Numbers.add(start, Sequences.length(function_name), Sequences.length((SubLObject)kb_utilities.$str397$_));
                                num = string_utilities.substring(input_string, index, end);
                            }
                        }
                    }
                    if (!orig_result.equalp(result2)) {
                        result2 = Sequences.cconcatenate((SubLObject)kb_utilities.$str433$_, result2);
                    }
                    else if (transformed_object.isList()) {
                        result2 = Sequences.cconcatenate((SubLObject)kb_utilities.$str414$_, result2);
                    }
                    final SubLObject _prev_bind_0_$239 = control_vars.$bootstrapping_kbP$.currentBinding(thread);
                    try {
                        control_vars.$bootstrapping_kbP$.bind((SubLObject)kb_utilities.T, thread);
                        if (kb_utilities.NIL != testP && !v_object.equalp(Eval.eval(reader.read_from_string(result2, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED)))) {
                            Errors.warn((SubLObject)kb_utilities.$str440$Unable_to_create_HL_object_evalua, v_object);
                            return (SubLObject)kb_utilities.NIL;
                        }
                    }
                    finally {
                        control_vars.$bootstrapping_kbP$.rebind(_prev_bind_0_$239, thread);
                    }
                    return result2;
                }
                final SubLObject result = Sequences.cconcatenate((SubLObject)kb_utilities.$str417$_find_variable_by_id_, new SubLObject[] { print_high.prin1_to_string(variables.variable_id(v_object)), kb_utilities.$str416$_ });
                if (kb_utilities.NIL != testP && !v_object.equalp(Eval.eval(reader.read_from_string(result, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED, (SubLObject)kb_utilities.UNPROVIDED)))) {
                    Errors.warn((SubLObject)kb_utilities.$str413$Unable_to_create_HL_object_evalua, v_object);
                    return (SubLObject)kb_utilities.NIL;
                }
                return result;
            }
        }
        finally {
            print_high.$print_level$.rebind(_prev_bind_3, thread);
            print_high.$print_length$.rebind(_prev_bind_2, thread);
            print_high.$print_pretty$.rebind(_prev_bind_0, thread);
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 136093L)
    public static SubLObject is_transformable_hl_object_intP(final SubLObject obj) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL != nart_handles.nart_p(obj) || kb_utilities.NIL != variables.variable_p(obj) || kb_utilities.NIL != Guids.guid_p(obj) || kb_utilities.NIL != assertion_handles.assertion_p(obj) || kb_utilities.NIL != kb_hl_support_handles.kb_hl_support_p(obj) || kb_utilities.NIL != deduction_handles.deduction_p(obj));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 136264L)
    public static SubLObject make_hl_readable_int(final SubLObject hl) {
        if (kb_utilities.NIL != nart_handles.nart_p(hl)) {
            return (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym441$AAAAAAAAAAAAAFIND_NART, narts_high.nart_hl_formula(hl));
        }
        if (kb_utilities.NIL != variables.variable_p(hl)) {
            return (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym442$AAAAAAAAAAAAAFIND_VARIABLE_BY_ID, variables.variable_id(hl));
        }
        if (kb_utilities.NIL != Guids.guid_p(hl)) {
            return (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym443$AAAAAAAAAAAAASTRING_TO_GUID, Guids.guid_to_string(hl));
        }
        if (kb_utilities.NIL != assertion_handles.assertion_p(hl)) {
            return (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym444$AAAAAAAAAAAAAFIND_ASSERTION, assertions_high.assertion_cnf(hl), (SubLObject)kb_utilities.$list445, assertions_high.assertion_mt(hl));
        }
        if (kb_utilities.NIL != deduction_handles.deduction_p(hl)) {
            return (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym446$AAAAAAAAAAAAAFIND_DEDUCTION, deductions_high.deduction_supported_object(hl), (SubLObject)kb_utilities.$list445, deductions_high.deduction_supports(hl), deductions_high.deduction_truth(hl));
        }
        if (kb_utilities.NIL != kb_hl_support_handles.kb_hl_support_p(hl)) {
            return (SubLObject)ConsesLow.list((SubLObject)kb_utilities.$sym447$AAAAAAAAAAAAAFIND_KB_HL_SUPPORT, kb_hl_supports_high.kb_hl_support_hl_support(hl));
        }
        Errors.error((SubLObject)kb_utilities.$str448$Unexpected_situation_);
        return (SubLObject)kb_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 137102L)
    public static SubLObject kbeq(final SubLObject obj1, final SubLObject obj2) {
        return Equality.eq(obj1, obj2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 137219L)
    public static SubLObject binary_gaf_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL != assertions_high.gaf_assertionP(v_object) && kb_utilities.NIL != el_utilities.el_binary_formula_p(assertions_high.gaf_formula(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 137346L)
    public static SubLObject fort_alphanumeric_name(final SubLObject fort) {
        assert kb_utilities.NIL != forts.fort_p(fort) : fort;
        if (kb_utilities.NIL != constant_handles.constant_p(fort)) {
            return constants_high.constant_name(fort);
        }
        return string_utilities.alphanumericize_admitting_hyphens(string_utilities.string_subst((SubLObject)kb_utilities.$str449$_, (SubLObject)kb_utilities.$str397$_, string_utilities.str(fort), (SubLObject)kb_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 137563L)
    public static SubLObject unassert_gaf_arg_index(final SubLObject fort, final SubLObject pred, final SubLObject argnum, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject asents_to_blast = (SubLObject)kb_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_utilities.$sym450$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            if (kb_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, argnum, pred)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, argnum, pred);
                SubLObject done_var = (SubLObject)kb_utilities.NIL;
                final SubLObject token_var = (SubLObject)kb_utilities.NIL;
                while (kb_utilities.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (kb_utilities.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)kb_utilities.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_utilities.$kw58$GAF, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.NIL);
                            SubLObject done_var_$240 = (SubLObject)kb_utilities.NIL;
                            final SubLObject token_var_$241 = (SubLObject)kb_utilities.NIL;
                            while (kb_utilities.NIL == done_var_$240) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$241);
                                final SubLObject valid_$242 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$241.eql(gaf));
                                if (kb_utilities.NIL != valid_$242) {
                                    asents_to_blast = (SubLObject)ConsesLow.cons(fi.assertion_hl_formula(gaf, (SubLObject)kb_utilities.UNPROVIDED), asents_to_blast);
                                }
                                done_var_$240 = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid_$242);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$243 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (kb_utilities.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$243, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid);
                }
            }
            SubLObject cdolist_list_var = asents_to_blast;
            SubLObject asent_to_blast = (SubLObject)kb_utilities.NIL;
            asent_to_blast = cdolist_list_var.first();
            while (kb_utilities.NIL != cdolist_list_var) {
                cyc_kernel.cyc_remove_all_arguments(asent_to_blast, mt);
                cdolist_list_var = cdolist_list_var.rest();
                asent_to_blast = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return asents_to_blast;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 138022L)
    public static SubLObject unassert_entire_gaf_arg_index(final SubLObject fort, final SubLObject pred, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject asent_mt_pairs_to_blast = (SubLObject)kb_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_utilities.$sym54$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_utilities.$const55$EverythingPSC, thread);
            if (kb_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, argnum, pred)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, argnum, pred);
                SubLObject done_var = (SubLObject)kb_utilities.NIL;
                final SubLObject token_var = (SubLObject)kb_utilities.NIL;
                while (kb_utilities.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (kb_utilities.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)kb_utilities.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_utilities.$kw58$GAF, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.NIL);
                            SubLObject done_var_$244 = (SubLObject)kb_utilities.NIL;
                            final SubLObject token_var_$245 = (SubLObject)kb_utilities.NIL;
                            while (kb_utilities.NIL == done_var_$244) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$245);
                                final SubLObject valid_$246 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$245.eql(gaf));
                                if (kb_utilities.NIL != valid_$246) {
                                    asent_mt_pairs_to_blast = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(fi.assertion_hl_formula(gaf, (SubLObject)kb_utilities.UNPROVIDED), assertions_high.assertion_mt(gaf)), asent_mt_pairs_to_blast);
                                }
                                done_var_$244 = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid_$246);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$247 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (kb_utilities.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$247, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = asent_mt_pairs_to_blast;
        SubLObject asent_mt_pair_to_blast = (SubLObject)kb_utilities.NIL;
        asent_mt_pair_to_blast = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = asent_mt_pair_to_blast;
            SubLObject asent_to_blast = (SubLObject)kb_utilities.NIL;
            SubLObject mt = (SubLObject)kb_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list451);
            asent_to_blast = current.first();
            current = (mt = current.rest());
            cyc_kernel.cyc_remove_all_arguments(asent_to_blast, mt);
            cdolist_list_var = cdolist_list_var.rest();
            asent_mt_pair_to_blast = cdolist_list_var.first();
        }
        return asent_mt_pairs_to_blast;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 138596L)
    public static SubLObject unassert_predicate_extent_index(final SubLObject pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject asents_to_blast = (SubLObject)kb_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_utilities.$sym450$RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            if (kb_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) {
                final SubLObject str = (SubLObject)kb_utilities.NIL;
                final SubLObject _prev_bind_0_$248 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$249 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)kb_utilities.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((kb_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kb_utilities.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred);
                    SubLObject done_var = (SubLObject)kb_utilities.NIL;
                    final SubLObject token_var = (SubLObject)kb_utilities.NIL;
                    while (kb_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (kb_utilities.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)kb_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_utilities.$kw58$GAF, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.NIL);
                                SubLObject done_var_$250 = (SubLObject)kb_utilities.NIL;
                                final SubLObject token_var_$251 = (SubLObject)kb_utilities.NIL;
                                while (kb_utilities.NIL == done_var_$250) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$251);
                                    final SubLObject valid_$252 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$251.eql(gaf));
                                    if (kb_utilities.NIL != valid_$252) {
                                        asents_to_blast = (SubLObject)ConsesLow.cons(fi.assertion_hl_formula(gaf, (SubLObject)kb_utilities.UNPROVIDED), asents_to_blast);
                                    }
                                    done_var_$250 = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid_$252);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$249 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (kb_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$249, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$249, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$248, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = asents_to_blast;
        SubLObject asent_to_blast = (SubLObject)kb_utilities.NIL;
        asent_to_blast = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            cyc_kernel.cyc_remove_all_arguments(asent_to_blast, mt);
            cdolist_list_var = cdolist_list_var.rest();
            asent_to_blast = cdolist_list_var.first();
        }
        return asents_to_blast;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 138974L)
    public static SubLObject unassert_entire_predicate_extent_index(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject asent_mt_pairs_to_blast = (SubLObject)kb_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kb_utilities.$sym54$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kb_utilities.$const55$EverythingPSC, thread);
            if (kb_utilities.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) {
                final SubLObject str = (SubLObject)kb_utilities.NIL;
                final SubLObject _prev_bind_0_$254 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$255 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)kb_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)kb_utilities.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((kb_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kb_utilities.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred);
                    SubLObject done_var = (SubLObject)kb_utilities.NIL;
                    final SubLObject token_var = (SubLObject)kb_utilities.NIL;
                    while (kb_utilities.NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                        if (kb_utilities.NIL != valid) {
                            utilities_macros.note_progress();
                            SubLObject final_index_iterator = (SubLObject)kb_utilities.NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_utilities.$kw58$GAF, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.NIL);
                                SubLObject done_var_$256 = (SubLObject)kb_utilities.NIL;
                                final SubLObject token_var_$257 = (SubLObject)kb_utilities.NIL;
                                while (kb_utilities.NIL == done_var_$256) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$257);
                                    final SubLObject valid_$258 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$257.eql(gaf));
                                    if (kb_utilities.NIL != valid_$258) {
                                        asent_mt_pairs_to_blast = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(fi.assertion_hl_formula(gaf, (SubLObject)kb_utilities.UNPROVIDED), assertions_high.assertion_mt(gaf)), asent_mt_pairs_to_blast);
                                    }
                                    done_var_$256 = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid_$258);
                                }
                            }
                            finally {
                                final SubLObject _prev_bind_0_$255 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_utilities.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (kb_utilities.NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$255, thread);
                                }
                            }
                        }
                        done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid);
                    }
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$255, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$254, thread);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = asent_mt_pairs_to_blast;
        SubLObject asent_mt_pair_to_blast = (SubLObject)kb_utilities.NIL;
        asent_mt_pair_to_blast = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = asent_mt_pair_to_blast;
            SubLObject asent_to_blast = (SubLObject)kb_utilities.NIL;
            SubLObject mt = (SubLObject)kb_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_utilities.$list451);
            asent_to_blast = current.first();
            current = (mt = current.rest());
            cyc_kernel.cyc_remove_all_arguments(asent_to_blast, mt);
            cdolist_list_var = cdolist_list_var.rest();
            asent_mt_pair_to_blast = cdolist_list_var.first();
        }
        return asent_mt_pairs_to_blast;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 139481L)
    public static SubLObject unassert_entire_function_extent_index(final SubLObject func) {
        SubLObject narts_to_kill = (SubLObject)kb_utilities.NIL;
        if (kb_utilities.NIL != kb_mapping_macros.do_function_extent_index_key_validator(func)) {
            final SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec(func);
            SubLObject final_index_iterator = (SubLObject)kb_utilities.NIL;
            try {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kb_utilities.$kw58$GAF, (SubLObject)kb_utilities.NIL, (SubLObject)kb_utilities.NIL);
                SubLObject done_var = (SubLObject)kb_utilities.NIL;
                final SubLObject token_var = (SubLObject)kb_utilities.NIL;
                while (kb_utilities.NIL == done_var) {
                    final SubLObject tou_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(tou_gaf));
                    if (kb_utilities.NIL != valid) {
                        final SubLObject nart = assertions_high.gaf_arg1(tou_gaf);
                        narts_to_kill = (SubLObject)ConsesLow.cons(nart, narts_to_kill);
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(kb_utilities.NIL == valid);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)kb_utilities.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (kb_utilities.NIL != final_index_iterator) {
                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        }
        SubLObject cdolist_list_var = narts_to_kill;
        SubLObject nart_to_kill = (SubLObject)kb_utilities.NIL;
        nart_to_kill = cdolist_list_var.first();
        while (kb_utilities.NIL != cdolist_list_var) {
            cyc_kernel.cyc_kill(nart_to_kill);
            cdolist_list_var = cdolist_list_var.rest();
            nart_to_kill = cdolist_list_var.first();
        }
        return narts_to_kill;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 139785L)
    public static SubLObject randomly_select_constants(final SubLObject n) {
        return randomly_select_interned_items(n, constant_handles.constant_count(), (SubLObject)kb_utilities.$sym453$FIND_CONSTANT_BY_SUID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 140102L)
    public static SubLObject randomly_select_narts(final SubLObject n) {
        return randomly_select_interned_items(n, nart_handles.nart_count(), (SubLObject)kb_utilities.$sym455$FIND_NART_BY_ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 140334L)
    public static SubLObject randomly_select_assertions(final SubLObject n) {
        return randomly_select_interned_items(n, assertion_handles.assertion_count(), (SubLObject)kb_utilities.$sym457$FIND_ASSERTION_BY_ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 140586L)
    public static SubLObject randomly_select_deductions(final SubLObject n) {
        return randomly_select_interned_items(n, deduction_handles.deduction_count(), (SubLObject)kb_utilities.$sym459$FIND_DEDUCTION_BY_ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 140844L)
    public static SubLObject randomly_select_kb_hl_supports(final SubLObject n) {
        return randomly_select_interned_items(n, kb_hl_support_handles.kb_hl_support_count(), (SubLObject)kb_utilities.$sym461$FIND_KB_HL_SUPPORT_BY_ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 141122L)
    public static SubLObject randomly_select_clause_strucs(final SubLObject n) {
        return randomly_select_interned_items(n, clause_strucs.clause_struc_count(), (SubLObject)kb_utilities.$sym463$FIND_CLAUSE_STRUC_BY_ID);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 141394L)
    public static SubLObject randomly_select_interned_items(SubLObject num, final SubLObject high, final SubLObject finder_fn) {
        final SubLObject slice = Numbers.integerDivide(high, num);
        SubLObject curr = (SubLObject)kb_utilities.ZERO_INTEGER;
        SubLObject items = (SubLObject)kb_utilities.NIL;
        while (num.isPositive() && curr.numL(high)) {
            for (SubLObject attempts = slice, item = (SubLObject)kb_utilities.NIL; attempts.isPositive() && kb_utilities.NIL == item; attempts = Numbers.subtract(attempts, (SubLObject)kb_utilities.ONE_INTEGER)) {
                final SubLObject spot = Numbers.add(curr, random.random(slice));
                item = Functions.funcall(finder_fn, spot);
                if (kb_utilities.NIL != item) {
                    num = Numbers.subtract(num, (SubLObject)kb_utilities.ONE_INTEGER);
                    items = (SubLObject)ConsesLow.cons(item, items);
                }
            }
            curr = Numbers.add(curr, slice);
        }
        return Sequences.nreverse(items);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 142025L)
    public static SubLObject next_deduction(final SubLObject deduction) {
        return next_deduction_from_id(deduction_handles.deduction_id(deduction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 142225L)
    public static SubLObject next_deduction_from_id(final SubLObject d_id) {
        return interned_kb_object_next(d_id, (SubLObject)kb_utilities.$sym459$FIND_DEDUCTION_BY_ID, (SubLObject)kb_utilities.$sym464$DEDUCTION_P, deduction_handles.next_deduction_id());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 142460L)
    public static SubLObject next_assertion(final SubLObject assertion) {
        return next_assertion_from_id(assertion_handles.assertion_id(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 142610L)
    public static SubLObject next_assertion_from_id(final SubLObject a_id) {
        return interned_kb_object_next(a_id, (SubLObject)kb_utilities.$sym457$FIND_ASSERTION_BY_ID, (SubLObject)kb_utilities.$sym465$ASSERTION_P, assertion_handles.next_assertion_id());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 142847L)
    public static SubLObject next_constant(final SubLObject constant) {
        return next_constant_from_id(constant_handles.constant_suid(constant));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 142993L)
    public static SubLObject next_constant_from_id(final SubLObject c_id) {
        return interned_kb_object_next(c_id, (SubLObject)kb_utilities.$sym453$FIND_CONSTANT_BY_SUID, (SubLObject)kb_utilities.$sym356$CONSTANT_P, constant_handles.next_constant_suid());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 143228L)
    public static SubLObject next_nart(final SubLObject nart) {
        return next_nart_from_id(nart_handles.nart_id(nart));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 143348L)
    public static SubLObject next_nart_from_id(final SubLObject n_id) {
        return interned_kb_object_next(n_id, (SubLObject)kb_utilities.$sym455$FIND_NART_BY_ID, (SubLObject)kb_utilities.$sym466$NART_P, nart_handles.next_nart_id());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 143555L)
    public static SubLObject next_kb_hl_support(final SubLObject support) {
        return next_kb_hl_support_from_id(kb_hl_support_handles.kb_hl_support_id(support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 143717L)
    public static SubLObject next_kb_hl_support_from_id(final SubLObject k_id) {
        return interned_kb_object_next(k_id, (SubLObject)kb_utilities.$sym461$FIND_KB_HL_SUPPORT_BY_ID, (SubLObject)kb_utilities.$sym467$KB_HL_SUPPORT_P, kb_hl_support_handles.next_kb_hl_support_id());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 143978L)
    public static SubLObject previous_deduction(final SubLObject deduction) {
        return previous_deduction_from_id(deduction_handles.deduction_id(deduction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 144133L)
    public static SubLObject previous_deduction_from_id(final SubLObject d_id) {
        return interned_kb_object_previous(d_id, (SubLObject)kb_utilities.$sym459$FIND_DEDUCTION_BY_ID, (SubLObject)kb_utilities.$sym464$DEDUCTION_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 144343L)
    public static SubLObject previous_assertion(final SubLObject assertion) {
        return previous_assertion_from_id(assertion_handles.assertion_id(assertion));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 144497L)
    public static SubLObject previous_assertion_from_id(final SubLObject a_id) {
        return interned_kb_object_previous(a_id, (SubLObject)kb_utilities.$sym457$FIND_ASSERTION_BY_ID, (SubLObject)kb_utilities.$sym465$ASSERTION_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 144709L)
    public static SubLObject previous_constant(final SubLObject constant) {
        return previous_constant_from_id(constant_handles.constant_suid(constant));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 144859L)
    public static SubLObject previous_constant_from_id(final SubLObject c_id) {
        return interned_kb_object_previous(c_id, (SubLObject)kb_utilities.$sym453$FIND_CONSTANT_BY_SUID, (SubLObject)kb_utilities.$sym356$CONSTANT_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 145068L)
    public static SubLObject previous_nart(final SubLObject nart) {
        return previous_nart_from_id(nart_handles.nart_id(nart));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 145192L)
    public static SubLObject previous_nart_from_id(final SubLObject n_id) {
        return interned_kb_object_previous(n_id, (SubLObject)kb_utilities.$sym455$FIND_NART_BY_ID, (SubLObject)kb_utilities.$sym466$NART_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 145379L)
    public static SubLObject previous_kb_hl_support(final SubLObject support) {
        return previous_kb_hl_support_from_id(kb_hl_support_handles.kb_hl_support_id(support));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 145545L)
    public static SubLObject previous_kb_hl_support_from_id(final SubLObject k_id) {
        return interned_kb_object_previous(k_id, (SubLObject)kb_utilities.$sym461$FIND_KB_HL_SUPPORT_BY_ID, (SubLObject)kb_utilities.$sym467$KB_HL_SUPPORT_P);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 145777L)
    public static SubLObject interned_kb_object_next(SubLObject id, final SubLObject finder_func, final SubLObject test_func, SubLObject limit) {
        if (limit == kb_utilities.UNPROVIDED) {
            limit = (SubLObject)kb_utilities.NIL;
        }
        SubLObject following;
        for (following = (SubLObject)kb_utilities.NIL; kb_utilities.NIL == Functions.funcall(test_func, following); following = Functions.funcall(finder_func, id)) {
            id = Numbers.add(id, (SubLObject)kb_utilities.ONE_INTEGER);
            if (limit.isNumber() && limit.numLE(id)) {
                return (SubLObject)kb_utilities.NIL;
            }
        }
        return following;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-utilities.lisp", position = 146227L)
    public static SubLObject interned_kb_object_previous(SubLObject id, final SubLObject finder_func, final SubLObject test_func) {
        SubLObject previous;
        for (previous = (SubLObject)kb_utilities.NIL; kb_utilities.NIL == Functions.funcall(test_func, previous); previous = Functions.funcall(finder_func, id)) {
            id = Numbers.subtract(id, (SubLObject)kb_utilities.ONE_INTEGER);
            if (id.isNegative()) {
                return (SubLObject)kb_utilities.NIL;
            }
        }
        return previous;
    }
    
    public static SubLObject declare_kb_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "kb_statistics", "KB-STATISTICS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "kb_content_statistics", "KB-CONTENT-STATISTICS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "kb_object_memory_commitment_analysis", "KB-OBJECT-MEMORY-COMMITMENT-ANALYSIS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "kb_object_memory_commitment_report", "KB-OBJECT-MEMORY-COMMITMENT-REPORT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "histogram_of_predicate_extent", "HISTOGRAM-OF-PREDICATE-EXTENT", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "mt_assertion_count", "MT-ASSERTION-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "broad_mt_assertion_count", "BROAD-MT-ASSERTION-COUNT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "most_populous_predicates_in_relevant_mts", "MOST-POPULOUS-PREDICATES-IN-RELEVANT-MTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "most_populous_predicates_in_mts", "MOST-POPULOUS-PREDICATES-IN-MTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "most_populous_predicates_in_mt", "MOST-POPULOUS-PREDICATES-IN-MT", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "most_populous_collections_in_mts", "MOST-POPULOUS-COLLECTIONS-IN-MTS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "setup_kb_shelf", "SETUP-KB-SHELF", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "estimated_assertions_per_constant", "ESTIMATED-ASSERTIONS-PER-CONSTANT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "estimated_constants_per_nart", "ESTIMATED-CONSTANTS-PER-NART", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "estimated_assertions_per_deduction", "ESTIMATED-ASSERTIONS-PER-DEDUCTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "estimated_assertions_per_clause_struc", "ESTIMATED-ASSERTIONS-PER-CLAUSE-STRUC", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "estimated_assertions_per_meta_assertion", "ESTIMATED-ASSERTIONS-PER-META-ASSERTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "estimated_arguments_per_assertion", "ESTIMATED-ARGUMENTS-PER-ASSERTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "estimated_assertions_per_unrepresented_term", "ESTIMATED-ASSERTIONS-PER-UNREPRESENTED-TERM", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "estimated_deductions_per_hl_support", "ESTIMATED-DEDUCTIONS-PER-HL-SUPPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "estimated_assertions_per_hl_support", "ESTIMATED-ASSERTIONS-PER-HL-SUPPORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "setup_kb_tables", "SETUP-KB-TABLES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "setup_kb_tables_int", "SETUP-KB-TABLES-INT", 7, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "resize_all_kb_object_manager_lru_caches", "RESIZE-ALL-KB-OBJECT-MANAGER-LRU-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "resize_kb_object_manager_lru_caches_for_rebuild", "RESIZE-KB-OBJECT-MANAGER-LRU-CACHES-FOR-REBUILD", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "setup_kb_fort_tables", "SETUP-KB-FORT-TABLES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "setup_kb_assertion_tables", "SETUP-KB-ASSERTION-TABLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "setup_kb_deduction_tables", "SETUP-KB-DEDUCTION-TABLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "setup_kb_hl_support_tables", "SETUP-KB-HL-SUPPORT-TABLES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "finalize_kb_tables", "FINALIZE-KB-TABLES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "finalize_kb_fort_tables", "FINALIZE-KB-FORT-TABLES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "clear_kb_state", "CLEAR-KB-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "clear_kb_state_int", "CLEAR-KB-STATE-INT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "clear_kb_fort_state", "CLEAR-KB-FORT-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "possibly_clear_dumpable_kb_state_hashes", "POSSIBLY-CLEAR-DUMPABLE-KB-STATE-HASHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "possibly_initialize_dumpable_kb_state_hashes", "POSSIBLY-INITIALIZE-DUMPABLE-KB-STATE-HASHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "clear_kb_state_hashes", "CLEAR-KB-STATE-HASHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "initialize_kb_state_hashes", "INITIALIZE-KB-STATE-HASHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "swap_out_all_pristine_kb_objects", "SWAP-OUT-ALL-PRISTINE-KB-OBJECTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "show_new_kb_state", "SHOW-NEW-KB-STATE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "clear_new_kb_state", "CLEAR-NEW-KB-STATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "show_new_kb_content", "SHOW-NEW-KB-CONTENT", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "cyc_memory_hogs", "CYC-MEMORY-HOGS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "cyc_memory_hogs_data", "CYC-MEMORY-HOGS-DATA", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "cyc_free_memory_hogs", "CYC-FREE-MEMORY-HOGS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "get_kb_object_managers", "GET-KB-OBJECT-MANAGERS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "cyc_lock_hogs", "CYC-LOCK-HOGS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "cyc_lock_users_sampled", "CYC-LOCK-USERS-SAMPLED", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "kb_checkpoint_p", "KB-CHECKPOINT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "new_kb_checkpoint", "NEW-KB-CHECKPOINT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "kb_checkpoint_currentP", "KB-CHECKPOINT-CURRENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "theory_checkpoint_p", "THEORY-CHECKPOINT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "new_theory_checkpoint", "NEW-THEORY-CHECKPOINT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "theory_checkpoint_currentP", "THEORY-CHECKPOINT-CURRENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "hl_internal_id_string_p", "HL-INTERNAL-ID-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "compact_hl_internal_id_string_p", "COMPACT-HL-INTERNAL-ID-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "hl_internal_id_string", "HL-INTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "compact_hl_internal_id_string", "COMPACT-HL-INTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "find_object_by_hl_internal_id_string", "FIND-OBJECT-BY-HL-INTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "find_object_by_compact_hl_internal_id_string", "FIND-OBJECT-BY-COMPACT-HL-INTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "maybe_find_object_by_hl_internal_id_string", "MAYBE-FIND-OBJECT-BY-HL-INTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "maybe_find_object_by_compact_hl_internal_id_string", "MAYBE-FIND-OBJECT-BY-COMPACT-HL-INTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "hl_external_id_string_p", "HL-EXTERNAL-ID-STRING-P", 1, 0, false);
        new $hl_external_id_string_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "compact_hl_external_id_string_p", "COMPACT-HL-EXTERNAL-ID-STRING-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "compact_hl_external_id_stringP", "COMPACT-HL-EXTERNAL-ID-STRING?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "compact_hl_external_id_stringE", "COMPACT-HL-EXTERNAL-ID-STRING=", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "hl_external_id_string", "HL-EXTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "compact_hl_external_id_string", "COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "find_object_by_hl_external_id_string", "FIND-OBJECT-BY-HL-EXTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "find_cycl_object_by_compact_hl_external_id_string", "FIND-CYCL-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "find_object_by_compact_hl_external_id_string", "FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "maybe_find_object_by_compact_hl_external_id_string", "MAYBE-FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "find_object_by_hl_id_string", "FIND-OBJECT-BY-HL-ID-STRING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "invalid_hl_object_p", "INVALID-HL-OBJECT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "string_for_unlexified_term", "STRING-FOR-UNLEXIFIED-TERM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "sort_terms", "SORT-TERMS", 1, 6, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "term_L", "TERM-<", 2, 3, false);
        new $term_L$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "term_L_with_constant_by_name", "TERM-<-WITH-CONSTANT-BY-NAME", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "form_sort_pred", "FORM-SORT-PRED", 2, 0, false);
        new $form_sort_pred$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "cons_sort_pred", "CONS-SORT-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "atom_sort_pred", "ATOM-SORT-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "symbol_sort_pred", "SYMBOL-SORT-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "fort_sort_pred", "FORT-SORT-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "constant_sort_pred", "CONSTANT-SORT-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "nart_sort_pred", "NART-SORT-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "fort_L", "FORT-<", 2, 0, false);
        new $fort_L$BinaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "sort_forts", "SORT-FORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "definitional_pred_L", "DEFINITIONAL-PRED-<", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "definitional_assertion_L", "DEFINITIONAL-ASSERTION-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "term_order", "TERM-ORDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "term_order_assertion_method", "TERM-ORDER-ASSERTION-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "term_order_cons_method", "TERM-ORDER-CONS-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "term_similarity_metric", "TERM-SIMILARITY-METRIC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "instance_similarity_statistics", "INSTANCE-SIMILARITY-STATISTICS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "spec_similarity_statistics", "SPEC-SIMILARITY-STATISTICS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "term_similarity_metric_generalizations_internal", "TERM-SIMILARITY-METRIC-GENERALIZATIONS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "term_similarity_metric_generalizations", "TERM-SIMILARITY-METRIC-GENERALIZATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "term_similarity_all_isa", "TERM-SIMILARITY-ALL-ISA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "similarity_statistics_int", "SIMILARITY-STATISTICS-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "constants_created_between", "CONSTANTS-CREATED-BETWEEN", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "assertion_nats", "ASSERTION-NATS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "assertion_tous", "ASSERTION-TOUS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "assertions_between", "ASSERTIONS-BETWEEN", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "term_assertions_between", "TERM-ASSERTIONS-BETWEEN", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "term_assertions_in_chronological_order", "TERM-ASSERTIONS-IN-CHRONOLOGICAL-ORDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "term_assertions_in_id_order", "TERM-ASSERTIONS-IN-ID-ORDER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "term_last_asserted_assertion_date_internal", "TERM-LAST-ASSERTED-ASSERTION-DATE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "term_last_asserted_assertion_date", "TERM-LAST-ASSERTED-ASSERTION-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "clear_cached_term_last_asserted_assertion_date", "CLEAR-CACHED-TERM-LAST-ASSERTED-ASSERTION-DATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "remove_cached_term_last_asserted_assertion_date", "REMOVE-CACHED-TERM-LAST-ASSERTED-ASSERTION-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "cached_term_last_asserted_assertion_date_internal", "CACHED-TERM-LAST-ASSERTED-ASSERTION-DATE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "cached_term_last_asserted_assertion_date", "CACHED-TERM-LAST-ASSERTED-ASSERTION-DATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "creation_time_L", "CREATION-TIME-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "clear_cached_creation_time", "CLEAR-CACHED-CREATION-TIME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "remove_cached_creation_time", "REMOVE-CACHED-CREATION-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "cached_creation_time_internal", "CACHED-CREATION-TIME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "cached_creation_time", "CACHED-CREATION-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "creator_L", "CREATOR-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "clear_cached_creator", "CLEAR-CACHED-CREATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "remove_cached_creator", "REMOVE-CACHED-CREATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "cached_creator_internal", "CACHED-CREATOR-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "cached_creator", "CACHED-CREATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "assert_date_L", "ASSERT-DATE-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "assert_cyclist_L", "ASSERT-CYCLIST-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "probably_most_recent_assertion", "PROBABLY-MOST-RECENT-ASSERTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "assert_timestamp_L", "ASSERT-TIMESTAMP-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "all_constants", "ALL-CONSTANTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "all_narts", "ALL-NARTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "all_forts", "ALL-FORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "all_deductions", "ALL-DEDUCTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "all_kb_hl_supports", "ALL-KB-HL-SUPPORTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "all_assertions", "ALL-ASSERTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "all_gafs", "ALL-GAFS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "all_forward_gafs", "ALL-FORWARD-GAFS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "all_backward_gafs", "ALL-BACKWARD-GAFS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "all_rules", "ALL-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "all_forward_rules", "ALL-FORWARD-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "all_backward_rules", "ALL-BACKWARD-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "sorted_non_deduced_backward_gafs", "SORTED-NON-DEDUCED-BACKWARD-GAFS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "all_new_narts", "ALL-NEW-NARTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "kb_object_count_list", "KB-OBJECT-COUNT-LIST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "kb_object_count_lists_new_constant_count", "KB-OBJECT-COUNT-LISTS-NEW-CONSTANT-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "kb_object_count_lists_new_nart_count", "KB-OBJECT-COUNT-LISTS-NEW-NART-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "kb_object_count_lists_new_assertion_count", "KB-OBJECT-COUNT-LISTS-NEW-ASSERTION-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "kb_object_count_lists_new_kb_hl_support_count", "KB-OBJECT-COUNT-LISTS-NEW-KB-HL-SUPPORT-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "kb_object_count_lists_new_deduction_count", "KB-OBJECT-COUNT-LISTS-NEW-DEDUCTION-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "kb_object_count_lists_differentP", "KB-OBJECT-COUNT-LISTS-DIFFERENT?", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_utilities", "showing_new_kb_object_counts", "SHOWING-NEW-KB-OBJECT-COUNTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "all_constants_sorted_by_creation_time_estimate", "ALL-CONSTANTS-SORTED-BY-CREATION-TIME-ESTIMATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "guess_constant_creation_time", "GUESS-CONSTANT-CREATION-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "lowest_assertion_id_for_constant", "LOWEST-ASSERTION-ID-FOR-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "sort_constants_by_sorting_info", "SORT-CONSTANTS-BY-SORTING-INFO", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "constant_sorting_funky_L", "CONSTANT-SORTING-FUNKY-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "definitional_type_for_naut", "DEFINITIONAL-TYPE-FOR-NAUT", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_utilities", "do_gaf_arg_index_naut", "DO-GAF-ARG-INDEX-NAUT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_utilities", "do_misc_index_naut", "DO-MISC-INDEX-NAUT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "map_gaf_arg_index_naut", "MAP-GAF-ARG-INDEX-NAUT", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "map_misc_index_naut", "MAP-MISC-INDEX-NAUT", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "set_to_collection", "SET-TO-COLLECTION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "set_type_constraint", "SET-TYPE-CONSTRAINT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "clear_cached_union_all_specs_count", "CLEAR-CACHED-UNION-ALL-SPECS-COUNT", 0, 0, false);
        new $clear_cached_union_all_specs_count$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "remove_cached_union_all_specs_count", "REMOVE-CACHED-UNION-ALL-SPECS-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "cached_union_all_specs_count_internal", "CACHED-UNION-ALL-SPECS-COUNT-INTERNAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "cached_union_all_specs_count", "CACHED-UNION-ALL-SPECS-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "collection_coverage_ratio", "COLLECTION-COVERAGE-RATIO", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "union_all_constant_specs_count", "UNION-ALL-CONSTANT-SPECS-COUNT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "constant_collection_coverage_ratio", "CONSTANT-COLLECTION-COVERAGE-RATIO", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "compute_kb_covering_collections", "COMPUTE-KB-COVERING-COLLECTIONS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "print_kb_covering_collections", "PRINT-KB-COVERING-COLLECTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "optimize_coverage", "OPTIMIZE-COVERAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "break_col_into_specs_and_merge", "BREAK-COL-INTO-SPECS-AND-MERGE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "clear_forbidden_kb_covering_collections_set", "CLEAR-FORBIDDEN-KB-COVERING-COLLECTIONS-SET", 0, 0, false);
        new $clear_forbidden_kb_covering_collections_set$ZeroArityFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "remove_forbidden_kb_covering_collections_set", "REMOVE-FORBIDDEN-KB-COVERING-COLLECTIONS-SET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "forbidden_kb_covering_collections_set_internal", "FORBIDDEN-KB-COVERING-COLLECTIONS-SET-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "forbidden_kb_covering_collections_set", "FORBIDDEN-KB-COVERING-COLLECTIONS-SET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "forbidden_kb_covering_collectionP", "FORBIDDEN-KB-COVERING-COLLECTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "spec_union_overlap_cardinality", "SPEC-UNION-OVERLAP-CARDINALITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "spec_overlap_cardinality", "SPEC-OVERLAP-CARDINALITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "clear_all_specs_set", "CLEAR-ALL-SPECS-SET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "remove_all_specs_set", "REMOVE-ALL-SPECS-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "all_specs_set_internal", "ALL-SPECS-SET-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "all_specs_set", "ALL-SPECS-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "clear_all_genls_set", "CLEAR-ALL-GENLS-SET", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "remove_all_genls_set", "REMOVE-ALL-GENLS-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "all_genls_set_internal", "ALL-GENLS-SET-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "all_genls_set", "ALL-GENLS-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "special_collection_coverage_ratio", "SPECIAL-COLLECTION-COVERAGE-RATIO", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "max_non_overlapping_kb_coverage_cols", "MAX-NON-OVERLAPPING-KB-COVERAGE-COLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "pretty_print_cycl_to_string", "PRETTY-PRINT-CYCL-TO-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "string_remove_nart_affixes", "STRING-REMOVE-NART-AFFIXES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "collection_subsumption_paths", "COLLECTION-SUBSUMPTION-PATHS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "collection_subsumption_paths_int", "COLLECTION-SUBSUMPTION-PATHS-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "collection_subsumption_paths_co_genl_col", "COLLECTION-SUBSUMPTION-PATHS-CO-GENL-COL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "predicate_subsumption_paths", "PREDICATE-SUBSUMPTION-PATHS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "predicate_subsumption_paths_int", "PREDICATE-SUBSUMPTION-PATHS-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "predicate_subsumption_paths_co_genl_pred", "PREDICATE-SUBSUMPTION-PATHS-CO-GENL-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "predicate_type_for_arity", "PREDICATE-TYPE-FOR-ARITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "arity_of_predicate_type", "ARITY-OF-PREDICATE-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "random_hl_gaf", "RANDOM-HL-GAF", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "random_non_hl_gaf", "RANDOM-NON-HL-GAF", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "random_sbhl_gaf", "RANDOM-SBHL-GAF", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "random_non_sbhl_gaf", "RANDOM-NON-SBHL-GAF", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "hl_gafP", "HL-GAF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "non_hl_gafP", "NON-HL-GAF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "sbhl_gafP", "SBHL-GAF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "non_sbhl_gafP", "NON-SBHL-GAF?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "random_argnum", "RANDOM-ARGNUM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "safe_random_closed_argnum", "SAFE-RANDOM-CLOSED-ARGNUM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "random_closed_argnum", "RANDOM-CLOSED-ARGNUM", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "random_closed_argnum_int", "RANDOM-CLOSED-ARGNUM-INT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "turn_a_random_arg_into_a_variable", "TURN-A-RANDOM-ARG-INTO-A-VARIABLE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "random_predicate", "RANDOM-PREDICATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "random_binary_predicate", "RANDOM-BINARY-PREDICATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "gather_dates", "GATHER-DATES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "dateP", "DATE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "not_at_all_commutative_predicate_p", "NOT-AT-ALL-COMMUTATIVE-PREDICATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "at_least_partially_commutative_predicate_p", "AT-LEAST-PARTIALLY-COMMUTATIVE-PREDICATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "not_at_all_commutative_relation_p", "NOT-AT-ALL-COMMUTATIVE-RELATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "at_least_partially_commutative_relation_p", "AT-LEAST-PARTIALLY-COMMUTATIVE-RELATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "find_invalid_constant_references", "FIND-INVALID-CONSTANT-REFERENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "fix_invalid_constant_references", "FIX-INVALID-CONSTANT-REFERENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "fix_invalid_constant_reference", "FIX-INVALID-CONSTANT-REFERENCE", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "find_former_constants_named", "FIND-FORMER-CONSTANTS-NAMED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "coasserted_forts", "COASSERTED-FORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "visit_coasserted_fort", "VISIT-COASSERTED-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "clear_cached_compact_hl_external_id_string", "CLEAR-CACHED-COMPACT-HL-EXTERNAL-ID-STRING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "remove_cached_compact_hl_external_id_string", "REMOVE-CACHED-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "cached_compact_hl_external_id_string_internal", "CACHED-COMPACT-HL-EXTERNAL-ID-STRING-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "cached_compact_hl_external_id_string", "CACHED-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "write_coasserted_forts", "WRITE-COASSERTED-FORTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "write_all_coasserted_forts_to_file", "WRITE-ALL-COASSERTED-FORTS-TO-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "core_union_constantP", "CORE-UNION-CONSTANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "non_core_union_constantP", "NON-CORE-UNION-CONSTANT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "non_core_union_constants", "NON-CORE-UNION-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "create_spec_mt", "CREATE-SPEC-MT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "hl_object_to_evaluatable_string", "HL-OBJECT-TO-EVALUATABLE-STRING", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "is_transformable_hl_object_intP", "IS-TRANSFORMABLE-HL-OBJECT-INT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "make_hl_readable_int", "MAKE-HL-READABLE-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "kbeq", "KBEQ", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "binary_gaf_p", "BINARY-GAF-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "fort_alphanumeric_name", "FORT-ALPHANUMERIC-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "unassert_gaf_arg_index", "UNASSERT-GAF-ARG-INDEX", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "unassert_entire_gaf_arg_index", "UNASSERT-ENTIRE-GAF-ARG-INDEX", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "unassert_predicate_extent_index", "UNASSERT-PREDICATE-EXTENT-INDEX", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "unassert_entire_predicate_extent_index", "UNASSERT-ENTIRE-PREDICATE-EXTENT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "unassert_entire_function_extent_index", "UNASSERT-ENTIRE-FUNCTION-EXTENT-INDEX", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "randomly_select_constants", "RANDOMLY-SELECT-CONSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "randomly_select_narts", "RANDOMLY-SELECT-NARTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "randomly_select_assertions", "RANDOMLY-SELECT-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "randomly_select_deductions", "RANDOMLY-SELECT-DEDUCTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "randomly_select_kb_hl_supports", "RANDOMLY-SELECT-KB-HL-SUPPORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "randomly_select_clause_strucs", "RANDOMLY-SELECT-CLAUSE-STRUCS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "randomly_select_interned_items", "RANDOMLY-SELECT-INTERNED-ITEMS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "next_deduction", "NEXT-DEDUCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "next_deduction_from_id", "NEXT-DEDUCTION-FROM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "next_assertion", "NEXT-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "next_assertion_from_id", "NEXT-ASSERTION-FROM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "next_constant", "NEXT-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "next_constant_from_id", "NEXT-CONSTANT-FROM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "next_nart", "NEXT-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "next_nart_from_id", "NEXT-NART-FROM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "next_kb_hl_support", "NEXT-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "next_kb_hl_support_from_id", "NEXT-KB-HL-SUPPORT-FROM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "previous_deduction", "PREVIOUS-DEDUCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "previous_deduction_from_id", "PREVIOUS-DEDUCTION-FROM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "previous_assertion", "PREVIOUS-ASSERTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "previous_assertion_from_id", "PREVIOUS-ASSERTION-FROM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "previous_constant", "PREVIOUS-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "previous_constant_from_id", "PREVIOUS-CONSTANT-FROM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "previous_nart", "PREVIOUS-NART", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "previous_nart_from_id", "PREVIOUS-NART-FROM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "previous_kb_hl_support", "PREVIOUS-KB-HL-SUPPORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "previous_kb_hl_support_from_id", "PREVIOUS-KB-HL-SUPPORT-FROM-ID", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "interned_kb_object_next", "INTERNED-KB-OBJECT-NEXT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_utilities", "interned_kb_object_previous", "INTERNED-KB-OBJECT-PREVIOUS", 3, 0, false);
        return (SubLObject)kb_utilities.NIL;
    }
    
    public static SubLObject init_kb_utilities_file() {
        kb_utilities.$estimated_assertions_per_constant$ = SubLFiles.deflexical("*ESTIMATED-ASSERTIONS-PER-CONSTANT*", (SubLObject)kb_utilities.$float86$17_1);
        kb_utilities.$estimated_constants_per_nart$ = SubLFiles.deflexical("*ESTIMATED-CONSTANTS-PER-NART*", (SubLObject)kb_utilities.$float87$1_41);
        kb_utilities.$estimated_assertions_per_deduction$ = SubLFiles.deflexical("*ESTIMATED-ASSERTIONS-PER-DEDUCTION*", (SubLObject)kb_utilities.$float88$2_67);
        kb_utilities.$estimated_assertions_per_clause_struc$ = SubLFiles.deflexical("*ESTIMATED-ASSERTIONS-PER-CLAUSE-STRUC*", (SubLObject)kb_utilities.$float89$39_3);
        kb_utilities.$estimated_assertions_per_meta_assertion$ = SubLFiles.deflexical("*ESTIMATED-ASSERTIONS-PER-META-ASSERTION*", (SubLObject)kb_utilities.$float90$30_3);
        kb_utilities.$estimated_arguments_per_assertion$ = SubLFiles.deflexical("*ESTIMATED-ARGUMENTS-PER-ASSERTION*", (SubLObject)kb_utilities.$float91$1_12);
        kb_utilities.$estimated_assertions_per_unrepresented_term$ = SubLFiles.deflexical("*ESTIMATED-ASSERTIONS-PER-UNREPRESENTED-TERM*", (SubLObject)kb_utilities.$float92$7_97);
        kb_utilities.$estimated_deductions_per_hl_support$ = SubLFiles.deflexical("*ESTIMATED-DEDUCTIONS-PER-HL-SUPPORT*", (SubLObject)kb_utilities.TEN_INTEGER);
        kb_utilities.$kb_table_padding_multiplier$ = SubLFiles.deflexical("*KB-TABLE-PADDING-MULTIPLIER*", (SubLObject)kb_utilities.$float93$1_05);
        kb_utilities.$default_estimated_constant_count$ = SubLFiles.defparameter("*DEFAULT-ESTIMATED-CONSTANT-COUNT*", (SubLObject)kb_utilities.$int95$50000);
        kb_utilities.$get_kb_object_managers$ = SubLFiles.defparameter("*GET-KB-OBJECT-MANAGERS*", (SubLObject)kb_utilities.$kw165$UNINITIALIZED);
        kb_utilities.$sort_terms_constants_by_name$ = SubLFiles.defparameter("*SORT-TERMS-CONSTANTS-BY-NAME*", (SubLObject)kb_utilities.T);
        kb_utilities.$sort_terms_ignore_variable_symbols$ = SubLFiles.defparameter("*SORT-TERMS-IGNORE-VARIABLE-SYMBOLS*", (SubLObject)kb_utilities.NIL);
        kb_utilities.$sort_terms_by_internal_idP$ = SubLFiles.defparameter("*SORT-TERMS-BY-INTERNAL-ID?*", (SubLObject)kb_utilities.NIL);
        kb_utilities.$definitional_pred_sort_order$ = SubLFiles.deflexical("*DEFINITIONAL-PRED-SORT-ORDER*", (SubLObject)kb_utilities.$list210);
        kb_utilities.$term_order_method_table$ = SubLFiles.deflexical("*TERM-ORDER-METHOD-TABLE*", Vectors.make_vector((SubLObject)kb_utilities.$int211$256, (SubLObject)kb_utilities.NIL));
        kb_utilities.$cached_term_last_asserted_assertion_date_caching_state$ = SubLFiles.deflexical("*CACHED-TERM-LAST-ASSERTED-ASSERTION-DATE-CACHING-STATE*", (SubLObject)kb_utilities.NIL);
        kb_utilities.$cached_creation_time_caching_state$ = SubLFiles.deflexical("*CACHED-CREATION-TIME-CACHING-STATE*", (SubLObject)kb_utilities.NIL);
        kb_utilities.$cached_creator_caching_state$ = SubLFiles.deflexical("*CACHED-CREATOR-CACHING-STATE*", (SubLObject)kb_utilities.NIL);
        kb_utilities.$set_to_collection_uses_reformulatorP$ = SubLFiles.defparameter("*SET-TO-COLLECTION-USES-REFORMULATOR?*", (SubLObject)kb_utilities.T);
        kb_utilities.$cached_union_all_specs_count_caching_state$ = SubLFiles.deflexical("*CACHED-UNION-ALL-SPECS-COUNT-CACHING-STATE*", (SubLObject)kb_utilities.NIL);
        kb_utilities.$forbidden_kb_covering_collection_types$ = SubLFiles.deflexical("*FORBIDDEN-KB-COVERING-COLLECTION-TYPES*", (SubLObject)kb_utilities.$list357);
        kb_utilities.$forbidden_kb_covering_quoted_collection_types$ = SubLFiles.deflexical("*FORBIDDEN-KB-COVERING-QUOTED-COLLECTION-TYPES*", (SubLObject)kb_utilities.$list358);
        kb_utilities.$forbidden_cols$ = SubLFiles.deflexical("*FORBIDDEN-COLS*", (SubLObject)kb_utilities.$list359);
        kb_utilities.$forbidden_specs$ = SubLFiles.deflexical("*FORBIDDEN-SPECS*", (SubLObject)kb_utilities.NIL);
        kb_utilities.$min_each_spec_cardinality$ = SubLFiles.defparameter("*MIN-EACH-SPEC-CARDINALITY*", (SubLObject)kb_utilities.NIL);
        kb_utilities.$forbidden_kb_covering_collections_set_caching_state$ = SubLFiles.deflexical("*FORBIDDEN-KB-COVERING-COLLECTIONS-SET-CACHING-STATE*", (SubLObject)kb_utilities.NIL);
        kb_utilities.$all_specs_set_caching_state$ = SubLFiles.deflexical("*ALL-SPECS-SET-CACHING-STATE*", (SubLObject)kb_utilities.NIL);
        kb_utilities.$all_genls_set_caching_state$ = SubLFiles.deflexical("*ALL-GENLS-SET-CACHING-STATE*", (SubLObject)kb_utilities.NIL);
        kb_utilities.$predicate_type_arity_table$ = SubLFiles.deflexical("*PREDICATE-TYPE-ARITY-TABLE*", (SubLObject)kb_utilities.$list383);
        kb_utilities.$coasserted_fort_source$ = SubLFiles.defparameter("*COASSERTED-FORT-SOURCE*", (SubLObject)kb_utilities.NIL);
        kb_utilities.$coasserted_fort_set$ = SubLFiles.defparameter("*COASSERTED-FORT-SET*", (SubLObject)kb_utilities.NIL);
        kb_utilities.$cached_compact_hl_external_id_string_caching_state$ = SubLFiles.deflexical("*CACHED-COMPACT-HL-EXTERNAL-ID-STRING-CACHING-STATE*", (SubLObject)kb_utilities.NIL);
        return (SubLObject)kb_utilities.NIL;
    }
    
    public static SubLObject setup_kb_utilities_file() {
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym97$SHOW_NEW_KB_STATE);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym106$CLEAR_NEW_KB_STATE);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym107$SHOW_NEW_KB_CONTENT);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym177$HL_INTERNAL_ID_STRING_P);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym178$COMPACT_HL_INTERNAL_ID_STRING_P);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym179$HL_INTERNAL_ID_STRING);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym180$COMPACT_HL_INTERNAL_ID_STRING);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym181$FIND_OBJECT_BY_HL_INTERNAL_ID_STRING);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym183$FIND_OBJECT_BY_COMPACT_HL_INTERNAL_ID_STRING);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym185$MAYBE_FIND_OBJECT_BY_HL_INTERNAL_ID_STRING);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym186$MAYBE_FIND_OBJECT_BY_COMPACT_HL_INTERNAL_ID_STRING);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym187$HL_EXTERNAL_ID_STRING_P);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym188$COMPACT_HL_EXTERNAL_ID_STRING_P);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym189$COMPACT_HL_EXTERNAL_ID_STRING_);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym193$COMPACT_HL_EXTERNAL_ID_STRING_);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym194$HL_EXTERNAL_ID_STRING);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym195$COMPACT_HL_EXTERNAL_ID_STRING);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym196$FIND_OBJECT_BY_HL_EXTERNAL_ID_STRING);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym197$FIND_CYCL_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym199$FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym200$MAYBE_FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING);
        Structures.register_method(kb_utilities.$term_order_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_utilities.$sym212$TERM_ORDER_ASSERTION_METHOD));
        Structures.register_method(kb_utilities.$term_order_method_table$.getGlobalValue(), Types.$dtp_cons$.getGlobalValue(), Symbols.symbol_function((SubLObject)kb_utilities.$sym213$TERM_ORDER_CONS_METHOD));
        memoization_state.note_memoized_function((SubLObject)kb_utilities.$sym216$TERM_SIMILARITY_METRIC_GENERALIZATIONS);
        memoization_state.note_memoized_function((SubLObject)kb_utilities.$sym235$TERM_LAST_ASSERTED_ASSERTION_DATE);
        memoization_state.note_globally_cached_function((SubLObject)kb_utilities.$sym236$CACHED_TERM_LAST_ASSERTED_ASSERTION_DATE);
        memoization_state.note_globally_cached_function((SubLObject)kb_utilities.$sym238$CACHED_CREATION_TIME);
        memoization_state.note_globally_cached_function((SubLObject)kb_utilities.$sym242$CACHED_CREATOR);
        memoization_state.note_globally_cached_function((SubLObject)kb_utilities.$sym352$CACHED_UNION_ALL_SPECS_COUNT);
        memoization_state.note_globally_cached_function((SubLObject)kb_utilities.$sym367$FORBIDDEN_KB_COVERING_COLLECTIONS_SET);
        memoization_state.note_globally_cached_function((SubLObject)kb_utilities.$sym366$ALL_SPECS_SET);
        memoization_state.note_globally_cached_function((SubLObject)kb_utilities.$sym372$ALL_GENLS_SET);
        utilities_macros.note_funcall_helper_function((SubLObject)kb_utilities.$sym394$VISIT_COASSERTED_FORT);
        memoization_state.note_globally_cached_function((SubLObject)kb_utilities.$sym395$CACHED_COMPACT_HL_EXTERNAL_ID_STRING);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym452$RANDOMLY_SELECT_CONSTANTS);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym454$RANDOMLY_SELECT_NARTS);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym456$RANDOMLY_SELECT_ASSERTIONS);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym458$RANDOMLY_SELECT_DEDUCTIONS);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym460$RANDOMLY_SELECT_KB_HL_SUPPORTS);
        access_macros.register_external_symbol((SubLObject)kb_utilities.$sym462$RANDOMLY_SELECT_CLAUSE_STRUCS);
        generic_testing.define_test_case_table_int((SubLObject)kb_utilities.$sym468$SET_TO_COLLECTION, (SubLObject)ConsesLow.list(new SubLObject[] { kb_utilities.$kw469$TEST, kb_utilities.NIL, kb_utilities.$kw470$OWNER, kb_utilities.NIL, kb_utilities.$kw471$CLASSES, kb_utilities.NIL, kb_utilities.$kw472$KB, kb_utilities.$kw473$FULL, kb_utilities.$kw474$WORKING_, kb_utilities.T }), (SubLObject)kb_utilities.$list475);
        generic_testing.define_test_case_table_int((SubLObject)kb_utilities.$sym476$COLLECTION_SUBSUMPTION_PATHS, (SubLObject)ConsesLow.list(new SubLObject[] { kb_utilities.$kw469$TEST, kb_utilities.$sym477$SETS_EQUAL_EQUAL_, kb_utilities.$kw470$OWNER, kb_utilities.NIL, kb_utilities.$kw471$CLASSES, kb_utilities.NIL, kb_utilities.$kw472$KB, kb_utilities.$kw473$FULL, kb_utilities.$kw474$WORKING_, kb_utilities.T }), (SubLObject)kb_utilities.$list478);
        generic_testing.define_test_case_table_int((SubLObject)kb_utilities.$sym479$PREDICATE_SUBSUMPTION_PATHS, (SubLObject)ConsesLow.list(new SubLObject[] { kb_utilities.$kw469$TEST, kb_utilities.$sym477$SETS_EQUAL_EQUAL_, kb_utilities.$kw470$OWNER, kb_utilities.NIL, kb_utilities.$kw471$CLASSES, kb_utilities.NIL, kb_utilities.$kw472$KB, kb_utilities.$kw473$FULL, kb_utilities.$kw474$WORKING_, kb_utilities.T }), (SubLObject)kb_utilities.$list480);
        return (SubLObject)kb_utilities.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_kb_utilities_file();
    }
    
    @Override
	public void initializeVariables() {
        init_kb_utilities_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_kb_utilities_file();
    }
    
    static {
        me = (SubLFile)new kb_utilities();
        kb_utilities.$estimated_assertions_per_constant$ = null;
        kb_utilities.$estimated_constants_per_nart$ = null;
        kb_utilities.$estimated_assertions_per_deduction$ = null;
        kb_utilities.$estimated_assertions_per_clause_struc$ = null;
        kb_utilities.$estimated_assertions_per_meta_assertion$ = null;
        kb_utilities.$estimated_arguments_per_assertion$ = null;
        kb_utilities.$estimated_assertions_per_unrepresented_term$ = null;
        kb_utilities.$estimated_deductions_per_hl_support$ = null;
        kb_utilities.$kb_table_padding_multiplier$ = null;
        kb_utilities.$default_estimated_constant_count$ = null;
        kb_utilities.$get_kb_object_managers$ = null;
        kb_utilities.$sort_terms_constants_by_name$ = null;
        kb_utilities.$sort_terms_ignore_variable_symbols$ = null;
        kb_utilities.$sort_terms_by_internal_idP$ = null;
        kb_utilities.$definitional_pred_sort_order$ = null;
        kb_utilities.$term_order_method_table$ = null;
        kb_utilities.$cached_term_last_asserted_assertion_date_caching_state$ = null;
        kb_utilities.$cached_creation_time_caching_state$ = null;
        kb_utilities.$cached_creator_caching_state$ = null;
        kb_utilities.$set_to_collection_uses_reformulatorP$ = null;
        kb_utilities.$cached_union_all_specs_count_caching_state$ = null;
        kb_utilities.$forbidden_kb_covering_collection_types$ = null;
        kb_utilities.$forbidden_kb_covering_quoted_collection_types$ = null;
        kb_utilities.$forbidden_cols$ = null;
        kb_utilities.$forbidden_specs$ = null;
        kb_utilities.$min_each_spec_cardinality$ = null;
        kb_utilities.$forbidden_kb_covering_collections_set_caching_state$ = null;
        kb_utilities.$all_specs_set_caching_state$ = null;
        kb_utilities.$all_genls_set_caching_state$ = null;
        kb_utilities.$predicate_type_arity_table$ = null;
        kb_utilities.$coasserted_fort_source$ = null;
        kb_utilities.$coasserted_fort_set$ = null;
        kb_utilities.$cached_compact_hl_external_id_string_caching_state$ = null;
        $kw0$VERBOSE = SubLObjectFactory.makeKeyword("VERBOSE");
        $str1$__No_KB_is_currently_loaded_ = SubLObjectFactory.makeString("~%No KB is currently loaded.");
        $sym2$DOUBLE_FLOAT = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
        $str3$______KB__A_statistics = SubLObjectFactory.makeString("~%;;; KB ~A statistics");
        $str4$__FORTs______________________9___ = SubLObjectFactory.makeString("~%FORTs                   : ~9,' D");
        $str5$___Constants_________________9___ = SubLObjectFactory.makeString("~% Constants              : ~9,' D");
        $str6$____cached_indexing__________9___ = SubLObjectFactory.makeString("~%  cached indexing       : ~9,' D  (~A%)");
        $str7$___NARTs_____________________9___ = SubLObjectFactory.makeString("~% NARTs                  : ~9,' D");
        $str8$____cached_HL_formulas_______9___ = SubLObjectFactory.makeString("~%  cached HL formulas    : ~9,' D  (~A%)");
        $str9$__Assertions_________________9___ = SubLObjectFactory.makeString("~%Assertions              : ~9,' D");
        $str10$___KB_Assertions_____________9___ = SubLObjectFactory.makeString("~% KB Assertions          : ~9,' D");
        $str11$____cached___________________9___ = SubLObjectFactory.makeString("~%  cached                : ~9,' D  (~A%)");
        $str12$___Bookkeeping_Assertions____9___ = SubLObjectFactory.makeString("~% Bookkeeping Assertions : ~9,' D");
        $str13$___Virtual_Assertions________9___ = SubLObjectFactory.makeString("~% Virtual Assertions     : ~9,' D");
        $str14$__Deductions_________________9___ = SubLObjectFactory.makeString("~%Deductions              : ~9,' D");
        $str15$__KB_HL_supports_____________9___ = SubLObjectFactory.makeString("~%KB HL supports          : ~9,' D");
        $str16$__Unrepresented_terms________9___ = SubLObjectFactory.makeString("~%Unrepresented terms     : ~9,' D");
        $str17$______KB__A_content_statistics = SubLObjectFactory.makeString("~%;;; KB ~A content statistics");
        $str18$__Terms______________9___D = SubLObjectFactory.makeString("~%Terms           : ~9,' D");
        $str19$___Collections_______9___D = SubLObjectFactory.makeString("~% Collections    : ~9,' D");
        $const20$Collection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"));
        $str21$____First_Order______9___D = SubLObjectFactory.makeString("~%  First Order   : ~9,' D");
        $const22$FirstOrderCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FirstOrderCollection"));
        $str23$____Second_Order_____9___D = SubLObjectFactory.makeString("~%  Second Order  : ~9,' D");
        $const24$SecondOrderCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SecondOrderCollection"));
        $str25$____Third_Order______9___D = SubLObjectFactory.makeString("~%  Third Order   : ~9,' D");
        $const26$ThirdOrderCollection = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ThirdOrderCollection"));
        $str27$___Relations_________9___D = SubLObjectFactory.makeString("~% Relations      : ~9,' D");
        $const28$Relation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Relation"));
        $str29$____Functions________9___D = SubLObjectFactory.makeString("~%  Functions     : ~9,' D");
        $const30$Function_Denotational = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Function-Denotational"));
        $str31$____Predicates_______9___D = SubLObjectFactory.makeString("~%  Predicates    : ~9,' D");
        $const32$Predicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Predicate"));
        $str33$___Microtheories_____9___D = SubLObjectFactory.makeString("~% Microtheories  : ~9,' D");
        $const34$Microtheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory"));
        $str35$___Individuals_______9___D = SubLObjectFactory.makeString("~% Individuals    : ~9,' D");
        $const36$Individual = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"));
        $str37$__KB_Assertions______9___D = SubLObjectFactory.makeString("~%KB Assertions   : ~9,' D");
        $kw38$CONSTANT = SubLObjectFactory.makeKeyword("CONSTANT");
        $kw39$NART = SubLObjectFactory.makeKeyword("NART");
        $kw40$ASSERTION = SubLObjectFactory.makeKeyword("ASSERTION");
        $kw41$DEDUCTION = SubLObjectFactory.makeKeyword("DEDUCTION");
        $kw42$KB_HL_SUPPORT = SubLObjectFactory.makeKeyword("KB-HL-SUPPORT");
        $kw43$UNPREPRESENTED_TERM = SubLObjectFactory.makeKeyword("UNPREPRESENTED-TERM");
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("KBOM"));
        $list45 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeString("Constant")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("NART"), (SubLObject)SubLObjectFactory.makeString("NART")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"), (SubLObject)SubLObjectFactory.makeString("Assertion")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("DEDUCTION"), (SubLObject)SubLObjectFactory.makeString("Deduction")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("KB-HL-SUPPORT"), (SubLObject)SubLObjectFactory.makeString("KB HL Support")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("UNPREPRESENTED-TERM"), (SubLObject)SubLObjectFactory.makeString("Unrepresented Term")));
        $str46$___18_A____9A____9A____9A = SubLObjectFactory.makeString("~%~18@A : ~9A + ~9A = ~9A");
        $str47$Object_Type = SubLObjectFactory.makeString("Object Type");
        $str48$committed = SubLObjectFactory.makeString("committed");
        $str49$swappable = SubLObjectFactory.makeString("swappable");
        $str50$in_memory = SubLObjectFactory.makeString("in-memory");
        $str51$_________________________________ = SubLObjectFactory.makeString("~%------------------------------------------------------");
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("COMMITTED"), (SubLObject)SubLObjectFactory.makeSymbol("SWAPPABLE"), (SubLObject)SubLObjectFactory.makeSymbol("IN-MEMORY"));
        $str53$___18_A____9_A____9_A____9_A = SubLObjectFactory.makeString("~%~18@A : ~9@A + ~9@A = ~9@A");
        $sym54$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const55$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $str56$Calculating_cardinalities_of_pred = SubLObjectFactory.makeString("Calculating cardinalities of predicate extents");
        $str57$cdolist = SubLObjectFactory.makeString("cdolist");
        $kw58$GAF = SubLObjectFactory.makeKeyword("GAF");
        $sym59$_ = SubLObjectFactory.makeSymbol(">");
        $sym60$CDR = SubLObjectFactory.makeSymbol("CDR");
        $kw61$MT = SubLObjectFactory.makeKeyword("MT");
        $kw62$BROAD_MT = SubLObjectFactory.makeKeyword("BROAD-MT");
        $str63$do_broad_mt_index = SubLObjectFactory.makeString("do-broad-mt-index");
        $sym64$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw65$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $const66$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw67$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw68$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw69$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym70$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw71$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str72$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym73$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw74$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str75$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw76$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str77$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str78$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str79$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("LINK-NODE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("MT"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("TV"));
        $str81$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $sym82$RELEVANT_MT_IS_IN_LIST = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-IN-LIST");
        $kw83$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $sym84$_ = SubLObjectFactory.makeSymbol("=");
        $sym85$_ = SubLObjectFactory.makeSymbol("<");
        $float86$17_1 = (SubLFloat)SubLObjectFactory.makeDouble(17.1);
        $float87$1_41 = (SubLFloat)SubLObjectFactory.makeDouble(1.41);
        $float88$2_67 = (SubLFloat)SubLObjectFactory.makeDouble(2.67);
        $float89$39_3 = (SubLFloat)SubLObjectFactory.makeDouble(39.3);
        $float90$30_3 = (SubLFloat)SubLObjectFactory.makeDouble(30.3);
        $float91$1_12 = (SubLFloat)SubLObjectFactory.makeDouble(1.12);
        $float92$7_97 = (SubLFloat)SubLObjectFactory.makeDouble(7.97);
        $float93$1_05 = (SubLFloat)SubLObjectFactory.makeDouble(1.05);
        $int94$1000 = SubLObjectFactory.makeInteger(1000);
        $int95$50000 = SubLObjectFactory.makeInteger(50000);
        $sym96$INIT_CONSTANT = SubLObjectFactory.makeSymbol("INIT-CONSTANT");
        $sym97$SHOW_NEW_KB_STATE = SubLObjectFactory.makeSymbol("SHOW-NEW-KB-STATE");
        $str98$______KB__S_new_KB_objects__ = SubLObjectFactory.makeString("~&;;; KB ~S new KB objects~%");
        $str99$__New_FORTs__________________9___ = SubLObjectFactory.makeString("~&New FORTs               : ~9,' D~%");
        $str100$___New_Constants_____________9___ = SubLObjectFactory.makeString("~& New Constants          : ~9,' D~%");
        $str101$___New_NARTs_________________9___ = SubLObjectFactory.makeString("~& New NARTs              : ~9,' D~%");
        $str102$__New_Assertions_____________9___ = SubLObjectFactory.makeString("~&New Assertions          : ~9,' D~%");
        $str103$__New_Deductions_____________9___ = SubLObjectFactory.makeString("~&New Deductions          : ~9,' D~%");
        $str104$__New_KB_HL_Supports_________9___ = SubLObjectFactory.makeString("~&New KB HL Supports      : ~9,' D~%");
        $str105$__New_Unrepresented_Terms____9___ = SubLObjectFactory.makeString("~&New Unrepresented Terms : ~9,' D~%");
        $sym106$CLEAR_NEW_KB_STATE = SubLObjectFactory.makeSymbol("CLEAR-NEW-KB-STATE");
        $sym107$SHOW_NEW_KB_CONTENT = SubLObjectFactory.makeSymbol("SHOW-NEW-KB-CONTENT");
        $list108 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONSTANT"), (SubLObject)SubLObjectFactory.makeKeyword("NART"), (SubLObject)SubLObjectFactory.makeKeyword("ASSERTION"));
        $str109$__Recent_constants___ = SubLObjectFactory.makeString("~&Recent constants:~%");
        $str110$mapping_constants_for_sweep = SubLObjectFactory.makeString("mapping constants for sweep");
        $str111$_____S__ = SubLObjectFactory.makeString("~&  ~S~%");
        $str112$__Recent_NARTs___ = SubLObjectFactory.makeString("~&Recent NARTs:~%");
        $str113$mapping_narts_for_sweep = SubLObjectFactory.makeString("mapping narts for sweep");
        $str114$__Recent_assertions___ = SubLObjectFactory.makeString("~&Recent assertions:~%");
        $str115$mapping_assertions_for_sweep = SubLObjectFactory.makeString("mapping assertions for sweep");
        $str116$__Recent_deductions___ = SubLObjectFactory.makeString("~&Recent deductions:~%");
        $str117$mapping_deductions_for_sweep = SubLObjectFactory.makeString("mapping deductions for sweep");
        $kw118$KB_HL_SUPPORTS = SubLObjectFactory.makeKeyword("KB-HL-SUPPORTS");
        $str119$__Recent_KB_HL_supports___ = SubLObjectFactory.makeString("~&Recent KB HL supports:~%");
        $str120$mapping_kb_hl_supports_for_sweep = SubLObjectFactory.makeString("mapping kb-hl-supports for sweep");
        $str121$__ = SubLObjectFactory.makeString("~&");
        $str122$Cyc_Structures___ = SubLObjectFactory.makeString("Cyc Structures:~%");
        $str123$__ = SubLObjectFactory.makeString(";;");
        $str124$__Problem_stores___A_A___A_infere = SubLObjectFactory.makeString("  Problem stores: ~A~A (~A inferences) (~A proofs) (~A problems)~%");
        $str125$_problem_stores___A_A__inferences = SubLObjectFactory.makeString(" problem-stores: ~A~A, inferences: ~A, proofs: ~A, problems: ~A");
        $kw126$PROBLEM_STORES = SubLObjectFactory.makeKeyword("PROBLEM-STORES");
        $kw127$FORWARD_PROBLEM_STORES = SubLObjectFactory.makeKeyword("FORWARD-PROBLEM-STORES");
        $str128$__ = SubLObjectFactory.makeString(" (");
        $str129$_forward_ = SubLObjectFactory.makeString(" forward)");
        $str130$ = SubLObjectFactory.makeString("");
        $kw131$INFERENCES = SubLObjectFactory.makeKeyword("INFERENCES");
        $kw132$PROOFS = SubLObjectFactory.makeKeyword("PROOFS");
        $kw133$PROBLEMS = SubLObjectFactory.makeKeyword("PROBLEMS");
        $str134$__KB_Objects_swapped_in___A__ = SubLObjectFactory.makeString("  KB Objects swapped in: ~A~%");
        $str135$_____kb_objects_swapped_in___A_ = SubLObjectFactory.makeString("~&;; kb-objects-swapped-in: ~A,");
        $kw136$KB_OBJECTS_IN_MEMORY = SubLObjectFactory.makeKeyword("KB-OBJECTS-IN-MEMORY");
        $str137$__Ephemeral_terms___A__ = SubLObjectFactory.makeString("  Ephemeral terms: ~A~%");
        $str138$_ephemeral_terms___A_ = SubLObjectFactory.makeString(" ephemeral-terms: ~A,");
        $kw139$EPHEMERAL_TERMS = SubLObjectFactory.makeKeyword("EPHEMERAL-TERMS");
        $kw140$SBHL_CACHE_MISSES = SubLObjectFactory.makeKeyword("SBHL-CACHE-MISSES");
        $str141$__SBHL_cache_misses_hash_table___ = SubLObjectFactory.makeString("  SBHL cache misses hash table: ~A~%");
        $str142$_sbhl_cache_misses___A_ = SubLObjectFactory.makeString(" sbhl-cache-misses: ~A,");
        $sym143$PRINT_SBHL_CACHE_MISSES_TOP_N = SubLObjectFactory.makeSymbol("PRINT-SBHL-CACHE-MISSES-TOP-N");
        $str144$__Global_cache_entries___A__ = SubLObjectFactory.makeString("  Global cache entries: ~A~%");
        $str145$_global_cache_entries___A__ = SubLObjectFactory.makeString(" global-cache-entries: ~A~%");
        $kw146$GLOBAL_CACHE_ENTRIES = SubLObjectFactory.makeKeyword("GLOBAL-CACHE-ENTRIES");
        $kw147$UNDESTROYED_ITEMS = SubLObjectFactory.makeKeyword("UNDESTROYED-ITEMS");
        $kw148$FORWARD_INFERENCE_METRICS = SubLObjectFactory.makeKeyword("FORWARD-INFERENCE-METRICS");
        $str149$____ = SubLObjectFactory.makeString("~&;;");
        $str150$__Undestroyed_items___A__ = SubLObjectFactory.makeString("  Undestroyed items: ~A~%");
        $str151$_undestroyed_items___A = SubLObjectFactory.makeString(" undestroyed-items: ~A");
        $str152$_ = SubLObjectFactory.makeString(",");
        $str153$__Forward_inference_metrics___A__ = SubLObjectFactory.makeString("  Forward inference metrics: ~A~%");
        $str154$_forward_metrics___A = SubLObjectFactory.makeString(" forward-metrics: ~A");
        $sym155$PROBLEM_STORE_FORWARD_ = SubLObjectFactory.makeSymbol("PROBLEM-STORE-FORWARD?");
        $sym156$_ = SubLObjectFactory.makeSymbol("+");
        $sym157$PROBLEM_STORE_PROBLEM_COUNT = SubLObjectFactory.makeSymbol("PROBLEM-STORE-PROBLEM-COUNT");
        $sym158$PROBLEM_STORE_PROOF_COUNT = SubLObjectFactory.makeSymbol("PROBLEM-STORE-PROOF-COUNT");
        $sym159$CACHING_STATE_SIZE_ROBUST = SubLObjectFactory.makeSymbol("CACHING-STATE-SIZE-ROBUST");
        $sym160$DELAYED_PROCESSOR_QUEUE_SIZE = SubLObjectFactory.makeSymbol("DELAYED-PROCESSOR-QUEUE-SIZE");
        $str161$BEFORE___ = SubLObjectFactory.makeString("BEFORE:~%");
        $int162$10000 = SubLObjectFactory.makeInteger(10000);
        $str163$Performing_full_GC = SubLObjectFactory.makeString("Performing full GC");
        $str164$AFTER___ = SubLObjectFactory.makeString("AFTER:~%");
        $kw165$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $str166$Unable_to_initialize__A__ = SubLObjectFactory.makeString("Unable to initialize ~A~%");
        $kw167$LOCKER = SubLObjectFactory.makeKeyword("LOCKER");
        $kw168$WAITER = SubLObjectFactory.makeKeyword("WAITER");
        $str169$__lock_hog___A__writer__S_waiters = SubLObjectFactory.makeString("~&lock-hog: ~A (writer=~S waiters=~S)~%");
        $str170$__lock_hog___A__locker__S___ = SubLObjectFactory.makeString("~&lock-hog: ~A (locker=~S)~%");
        $int171$212 = SubLObjectFactory.makeInteger(212);
        $int172$100 = SubLObjectFactory.makeInteger(100);
        $list173 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONSTANT-CP"), (SubLObject)SubLObjectFactory.makeSymbol("NART-CP"), (SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-CP"), (SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION-CP"));
        $sym174$KB_CHECKPOINT_P = SubLObjectFactory.makeSymbol("KB-CHECKPOINT-P");
        $list175 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-CP"), (SubLObject)SubLObjectFactory.makeSymbol("DEDUCTION-CP"));
        $sym176$THEORY_CHECKPOINT_P = SubLObjectFactory.makeSymbol("THEORY-CHECKPOINT-P");
        $sym177$HL_INTERNAL_ID_STRING_P = SubLObjectFactory.makeSymbol("HL-INTERNAL-ID-STRING-P");
        $sym178$COMPACT_HL_INTERNAL_ID_STRING_P = SubLObjectFactory.makeSymbol("COMPACT-HL-INTERNAL-ID-STRING-P");
        $sym179$HL_INTERNAL_ID_STRING = SubLObjectFactory.makeSymbol("HL-INTERNAL-ID-STRING");
        $sym180$COMPACT_HL_INTERNAL_ID_STRING = SubLObjectFactory.makeSymbol("COMPACT-HL-INTERNAL-ID-STRING");
        $sym181$FIND_OBJECT_BY_HL_INTERNAL_ID_STRING = SubLObjectFactory.makeSymbol("FIND-OBJECT-BY-HL-INTERNAL-ID-STRING");
        $kw182$HEX = SubLObjectFactory.makeKeyword("HEX");
        $sym183$FIND_OBJECT_BY_COMPACT_HL_INTERNAL_ID_STRING = SubLObjectFactory.makeSymbol("FIND-OBJECT-BY-COMPACT-HL-INTERNAL-ID-STRING");
        $kw184$64 = SubLObjectFactory.makeKeyword("64");
        $sym185$MAYBE_FIND_OBJECT_BY_HL_INTERNAL_ID_STRING = SubLObjectFactory.makeSymbol("MAYBE-FIND-OBJECT-BY-HL-INTERNAL-ID-STRING");
        $sym186$MAYBE_FIND_OBJECT_BY_COMPACT_HL_INTERNAL_ID_STRING = SubLObjectFactory.makeSymbol("MAYBE-FIND-OBJECT-BY-COMPACT-HL-INTERNAL-ID-STRING");
        $sym187$HL_EXTERNAL_ID_STRING_P = SubLObjectFactory.makeSymbol("HL-EXTERNAL-ID-STRING-P");
        $sym188$COMPACT_HL_EXTERNAL_ID_STRING_P = SubLObjectFactory.makeSymbol("COMPACT-HL-EXTERNAL-ID-STRING-P");
        $sym189$COMPACT_HL_EXTERNAL_ID_STRING_ = SubLObjectFactory.makeSymbol("COMPACT-HL-EXTERNAL-ID-STRING?");
        $kw190$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym191$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym192$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym193$COMPACT_HL_EXTERNAL_ID_STRING_ = SubLObjectFactory.makeSymbol("COMPACT-HL-EXTERNAL-ID-STRING=");
        $sym194$HL_EXTERNAL_ID_STRING = SubLObjectFactory.makeSymbol("HL-EXTERNAL-ID-STRING");
        $sym195$COMPACT_HL_EXTERNAL_ID_STRING = SubLObjectFactory.makeSymbol("COMPACT-HL-EXTERNAL-ID-STRING");
        $sym196$FIND_OBJECT_BY_HL_EXTERNAL_ID_STRING = SubLObjectFactory.makeSymbol("FIND-OBJECT-BY-HL-EXTERNAL-ID-STRING");
        $sym197$FIND_CYCL_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING = SubLObjectFactory.makeSymbol("FIND-CYCL-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING");
        $str198$Invalid_hl_external_id____A____fo = SubLObjectFactory.makeString("Invalid hl external id, '~A',  for a cycl term.~%.");
        $sym199$FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING = SubLObjectFactory.makeSymbol("FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING");
        $sym200$MAYBE_FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING = SubLObjectFactory.makeSymbol("MAYBE-FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING");
        $str201$invalid_mode__S = SubLObjectFactory.makeString("invalid mode ~S");
        $sym202$INVALID_HL_OBJECT_P = SubLObjectFactory.makeSymbol("INVALID-HL-OBJECT-P");
        $str203$an_unnamed_constant = SubLObjectFactory.makeString("an unnamed constant");
        $str204$_a = SubLObjectFactory.makeString("~a");
        $sym205$STABLE_SORT = SubLObjectFactory.makeSymbol("STABLE-SORT");
        $sym206$SORT = SubLObjectFactory.makeSymbol("SORT");
        $sym207$FORM_SORT_PRED = SubLObjectFactory.makeSymbol("FORM-SORT-PRED");
        $sym208$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym209$FORT__ = SubLObjectFactory.makeSymbol("FORT-<");
        $list210 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defnIff")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defnSufficient")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("defnNecessary")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultIsaArg")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultGenl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("resultGenlArg")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arity")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arityMin")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arityMax")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argsIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argsGenl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg3Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg3Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg4Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg4Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg5Isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg5Genl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argIsa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argGenl")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fanOutArg")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluationDefn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("afterAdding")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("afterRemoving")) });
        $int211$256 = SubLObjectFactory.makeInteger(256);
        $sym212$TERM_ORDER_ASSERTION_METHOD = SubLObjectFactory.makeSymbol("TERM-ORDER-ASSERTION-METHOD");
        $sym213$TERM_ORDER_CONS_METHOD = SubLObjectFactory.makeSymbol("TERM-ORDER-CONS-METHOD");
        $int214$500 = SubLObjectFactory.makeInteger(500);
        $sym215$VALUES = SubLObjectFactory.makeSymbol("VALUES");
        $sym216$TERM_SIMILARITY_METRIC_GENERALIZATIONS = SubLObjectFactory.makeSymbol("TERM-SIMILARITY-METRIC-GENERALIZATIONS");
        $kw217$ALL = SubLObjectFactory.makeKeyword("ALL");
        $sym218$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $sym219$VECTOR = SubLObjectFactory.makeSymbol("VECTOR");
        $str220$cdotimes = SubLObjectFactory.makeString("cdotimes");
        $sym221$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
        $str222$examining_creation_times_by__S = SubLObjectFactory.makeString("examining creation times by ~S");
        $str223$examining_all_creation_times = SubLObjectFactory.makeString("examining all creation times");
        $sym224$TERM__ = SubLObjectFactory.makeSymbol("TERM-<");
        $sym225$CONSTANT_NAME = SubLObjectFactory.makeSymbol("CONSTANT-NAME");
        $sym226$CREATION_TIME__ = SubLObjectFactory.makeSymbol("CREATION-TIME-<");
        $sym227$CREATOR__ = SubLObjectFactory.makeSymbol("CREATOR-<");
        $sym228$FIND_GROUND_NAUT = SubLObjectFactory.makeSymbol("FIND-GROUND-NAUT");
        $sym229$TERM_OF_UNIT = SubLObjectFactory.makeSymbol("TERM-OF-UNIT");
        $str230$examining_assertion_timestamps = SubLObjectFactory.makeString("examining assertion timestamps");
        $sym231$ASSERTION_CNF = SubLObjectFactory.makeSymbol("ASSERTION-CNF");
        $sym232$ASSERT_DATE__ = SubLObjectFactory.makeSymbol("ASSERT-DATE-<");
        $sym233$ASSERT_CYCLIST__ = SubLObjectFactory.makeSymbol("ASSERT-CYCLIST-<");
        $sym234$ASSERT_TIMESTAMP__ = SubLObjectFactory.makeSymbol("ASSERT-TIMESTAMP-<");
        $sym235$TERM_LAST_ASSERTED_ASSERTION_DATE = SubLObjectFactory.makeSymbol("TERM-LAST-ASSERTED-ASSERTION-DATE");
        $sym236$CACHED_TERM_LAST_ASSERTED_ASSERTION_DATE = SubLObjectFactory.makeSymbol("CACHED-TERM-LAST-ASSERTED-ASSERTION-DATE");
        $sym237$_CACHED_TERM_LAST_ASSERTED_ASSERTION_DATE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-TERM-LAST-ASSERTED-ASSERTION-DATE-CACHING-STATE*");
        $sym238$CACHED_CREATION_TIME = SubLObjectFactory.makeSymbol("CACHED-CREATION-TIME");
        $sym239$_CACHED_CREATION_TIME_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-CREATION-TIME-CACHING-STATE*");
        $int240$512 = SubLObjectFactory.makeInteger(512);
        $int241$200 = SubLObjectFactory.makeInteger(200);
        $sym242$CACHED_CREATOR = SubLObjectFactory.makeSymbol("CACHED-CREATOR");
        $sym243$_CACHED_CREATOR_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-CREATOR-CACHING-STATE*");
        $str244$searching_for_probably_most_recen = SubLObjectFactory.makeString("searching for probably most recent assertion");
        $str245$Gathering_all_constants = SubLObjectFactory.makeString("Gathering all constants");
        $str246$Gathering_all_narts = SubLObjectFactory.makeString("Gathering all narts");
        $str247$Gathering_all_forts = SubLObjectFactory.makeString("Gathering all forts");
        $str248$Gathering_all_deductions = SubLObjectFactory.makeString("Gathering all deductions");
        $str249$Gathering_all_KB_HL_supports = SubLObjectFactory.makeString("Gathering all KB HL supports");
        $str250$Gathering_all_assertions = SubLObjectFactory.makeString("Gathering all assertions");
        $str251$Gathering_all_gafs = SubLObjectFactory.makeString("Gathering all gafs");
        $str252$Gathering_all_forward_gafs = SubLObjectFactory.makeString("Gathering all forward gafs");
        $str253$Gathering_all_backward_gafs = SubLObjectFactory.makeString("Gathering all backward gafs");
        $str254$Gathering_all_rules = SubLObjectFactory.makeString("Gathering all rules");
        $str255$Gathering_all_forward_rules = SubLObjectFactory.makeString("Gathering all forward rules");
        $str256$Gathering_all_backward_rules = SubLObjectFactory.makeString("Gathering all backward rules");
        $sym257$DEDUCED_ASSERTION_ = SubLObjectFactory.makeSymbol("DEDUCED-ASSERTION?");
        $sym258$SAFE__ = SubLObjectFactory.makeSymbol("SAFE->");
        $sym259$ASSERTED_WHEN = SubLObjectFactory.makeSymbol("ASSERTED-WHEN");
        $list260 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("KB-CHANGED-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("KB-UNCHANGED-MESSAGE"), (SubLObject)SubLObjectFactory.makeSymbol("VERBOSITY")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list261 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("KB-CHANGED-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("KB-UNCHANGED-MESSAGE"), (SubLObject)SubLObjectFactory.makeKeyword("VERBOSITY"));
        $kw262$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw263$KB_CHANGED_MESSAGE = SubLObjectFactory.makeKeyword("KB-CHANGED-MESSAGE");
        $kw264$KB_UNCHANGED_MESSAGE = SubLObjectFactory.makeKeyword("KB-UNCHANGED-MESSAGE");
        $kw265$VERBOSITY = SubLObjectFactory.makeKeyword("VERBOSITY");
        $sym266$KB_OBJECT_COUNT_LIST_1 = SubLObjectFactory.makeUninternedSymbol("KB-OBJECT-COUNT-LIST-1");
        $sym267$KB_OBJECT_COUNT_LIST_2 = SubLObjectFactory.makeUninternedSymbol("KB-OBJECT-COUNT-LIST-2");
        $sym268$NEW_CONSTANT_COUNT = SubLObjectFactory.makeUninternedSymbol("NEW-CONSTANT-COUNT");
        $sym269$NEW_NART_COUNT = SubLObjectFactory.makeUninternedSymbol("NEW-NART-COUNT");
        $sym270$NEW_ASSERTION_COUNT = SubLObjectFactory.makeUninternedSymbol("NEW-ASSERTION-COUNT");
        $sym271$NEW_KB_HL_SUPPORT_COUNT = SubLObjectFactory.makeUninternedSymbol("NEW-KB-HL-SUPPORT-COUNT");
        $sym272$NEW_DEDUCTION_COUNT = SubLObjectFactory.makeUninternedSymbol("NEW-DEDUCTION-COUNT");
        $sym273$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list274 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KB-OBJECT-COUNT-LIST")));
        $sym275$KB_OBJECT_COUNT_LISTS_NEW_CONSTANT_COUNT = SubLObjectFactory.makeSymbol("KB-OBJECT-COUNT-LISTS-NEW-CONSTANT-COUNT");
        $sym276$KB_OBJECT_COUNT_LISTS_NEW_NART_COUNT = SubLObjectFactory.makeSymbol("KB-OBJECT-COUNT-LISTS-NEW-NART-COUNT");
        $sym277$KB_OBJECT_COUNT_LISTS_NEW_ASSERTION_COUNT = SubLObjectFactory.makeSymbol("KB-OBJECT-COUNT-LISTS-NEW-ASSERTION-COUNT");
        $sym278$KB_OBJECT_COUNT_LISTS_NEW_KB_HL_SUPPORT_COUNT = SubLObjectFactory.makeSymbol("KB-OBJECT-COUNT-LISTS-NEW-KB-HL-SUPPORT-COUNT");
        $sym279$KB_OBJECT_COUNT_LISTS_NEW_DEDUCTION_COUNT = SubLObjectFactory.makeSymbol("KB-OBJECT-COUNT-LISTS-NEW-DEDUCTION-COUNT");
        $sym280$PCOND = SubLObjectFactory.makeSymbol("PCOND");
        $list281 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SILENT"));
        $sym282$COR = SubLObjectFactory.makeSymbol("COR");
        $sym283$NON_ZERO_INTEGER_P = SubLObjectFactory.makeSymbol("NON-ZERO-INTEGER-P");
        $sym284$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym285$FORMAT = SubLObjectFactory.makeSymbol("FORMAT");
        $str286$___A__ = SubLObjectFactory.makeString("~&~A~%");
        $str287$___s_constant_A__A__ = SubLObjectFactory.makeString("  ~s constant~A ~A~%");
        $sym288$ABS = SubLObjectFactory.makeSymbol("ABS");
        $sym289$FIF = SubLObjectFactory.makeSymbol("FIF");
        $list290 = ConsesLow.list((SubLObject)kb_utilities.ONE_INTEGER);
        $list291 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("s were"), (SubLObject)SubLObjectFactory.makeString(" was"));
        $sym292$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $list293 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("created"), (SubLObject)SubLObjectFactory.makeString("destroyed"));
        $str294$___s_nart_A__A__ = SubLObjectFactory.makeString("  ~s nart~A ~A~%");
        $str295$___s_assertion_A__A__ = SubLObjectFactory.makeString("  ~s assertion~A ~A~%");
        $str296$___s_kb_hl_support_A__A__ = SubLObjectFactory.makeString("  ~s kb-hl-support~A ~A~%");
        $str297$___s_deduction_A__A__ = SubLObjectFactory.makeString("  ~s deduction~A ~A~%");
        $list298 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FORCE-OUTPUT"), (SubLObject)kb_utilities.T));
        $str299$mapping_Cyc_constants = SubLObjectFactory.makeString("mapping Cyc constants");
        $kw300$UNKNOWN_SECOND = SubLObjectFactory.makeKeyword("UNKNOWN-SECOND");
        $sym301$CONSTANT_SORTING_FUNKY__ = SubLObjectFactory.makeSymbol("CONSTANT-SORTING-FUNKY-<");
        $sym302$FOURTH = SubLObjectFactory.makeSymbol("FOURTH");
        $sym303$SORT_CONSTANTS_BY_SORTING_INFO = SubLObjectFactory.makeSymbol("SORT-CONSTANTS-BY-SORTING-INFO");
        $sym304$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $kw305$UNKNOWN_DATE = SubLObjectFactory.makeKeyword("UNKNOWN-DATE");
        $kw306$UNKNOWN_ID = SubLObjectFactory.makeKeyword("UNKNOWN-ID");
        $list307 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATE1"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND1"), (SubLObject)SubLObjectFactory.makeSymbol("ID1"), (SubLObject)SubLObjectFactory.makeSymbol("DWIMMED-DATE1"));
        $list308 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DATE2"), (SubLObject)SubLObjectFactory.makeSymbol("SECOND2"), (SubLObject)SubLObjectFactory.makeSymbol("ID2"), (SubLObject)SubLObjectFactory.makeSymbol("DWIMMED-DATE2"));
        $list309 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeSymbol("PREDICATE"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTION"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list310 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("PREDICATE"), (SubLObject)SubLObjectFactory.makeKeyword("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw311$INDEX = SubLObjectFactory.makeKeyword("INDEX");
        $kw312$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $kw313$TRUTH = SubLObjectFactory.makeKeyword("TRUTH");
        $kw314$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $kw315$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym316$INDEXED_TERMS = SubLObjectFactory.makeUninternedSymbol("INDEXED-TERMS");
        $sym317$EXPRESSION_GATHER = SubLObjectFactory.makeSymbol("EXPRESSION-GATHER");
        $list318 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)kb_utilities.NIL, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)kb_utilities.EQUAL));
        $sym319$INDEXED_TERM_P = SubLObjectFactory.makeSymbol("INDEXED-TERM-P");
        $sym320$CPUSH = SubLObjectFactory.makeSymbol("CPUSH");
        $sym321$DO_OVERLAP_INDEX = SubLObjectFactory.makeSymbol("DO-OVERLAP-INDEX");
        $sym322$CAND = SubLObjectFactory.makeSymbol("CAND");
        $sym323$NULL = SubLObjectFactory.makeSymbol("NULL");
        $sym324$ASSERTION_DIRECTION = SubLObjectFactory.makeSymbol("ASSERTION-DIRECTION");
        $sym325$FORMULA_OPERATOR = SubLObjectFactory.makeSymbol("FORMULA-OPERATOR");
        $sym326$ASSERTION_FORMULA = SubLObjectFactory.makeSymbol("ASSERTION-FORMULA");
        $sym327$FORMULA_ARG = SubLObjectFactory.makeSymbol("FORMULA-ARG");
        $sym328$TERM_OCCURS_AS_FORMULA_ARGUMENT = SubLObjectFactory.makeSymbol("TERM-OCCURS-AS-FORMULA-ARGUMENT");
        $list329 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ASSERTION-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("TRUTH"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list330 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TRUTH"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $sym331$INDEXED_TERMS = SubLObjectFactory.makeUninternedSymbol("INDEXED-TERMS");
        $list332 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), (SubLObject)kb_utilities.NIL);
        $sym333$CNOT = SubLObjectFactory.makeSymbol("CNOT");
        $sym334$EXPRESSION_FIND = SubLObjectFactory.makeSymbol("EXPRESSION-FIND");
        $list335 = ConsesLow.list((SubLObject)kb_utilities.T, (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)kb_utilities.EQUAL));
        $sym336$ASSERTION_MT = SubLObjectFactory.makeSymbol("ASSERTION-MT");
        $sym337$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");
        $sym338$NAUT_P = SubLObjectFactory.makeSymbol("NAUT-P");
        $kw339$MAPPING_DONE = SubLObjectFactory.makeKeyword("MAPPING-DONE");
        $const340$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $sym341$EL_SET_P = SubLObjectFactory.makeSymbol("EL-SET-P");
        $const342$Nothing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Nothing"));
        $const343$CollectionSubsetFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn"));
        $list344 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("IGNORE-RL-MODULES"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionSimplifierRLModule"))));
        $list345 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FOCUS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionSimplifierRLModule")));
        $list346 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("EL-VARIABLE"), (SubLObject)SubLObjectFactory.makeSymbol("EXPRESSION"));
        $const347$CollectionIntersection2Fn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn"));
        $const348$CollectionIntersectionFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersectionFn"));
        $const349$TheSet = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet"));
        $const350$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $str351$_S_was_not_a_set = SubLObjectFactory.makeString("~S was not a set");
        $sym352$CACHED_UNION_ALL_SPECS_COUNT = SubLObjectFactory.makeSymbol("CACHED-UNION-ALL-SPECS-COUNT");
        $sym353$_CACHED_UNION_ALL_SPECS_COUNT_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-UNION-ALL-SPECS-COUNT-CACHING-STATE*");
        $sym354$CLEAR_CACHED_UNION_ALL_SPECS_COUNT = SubLObjectFactory.makeSymbol("CLEAR-CACHED-UNION-ALL-SPECS-COUNT");
        $list355 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")));
        $sym356$CONSTANT_P = SubLObjectFactory.makeSymbol("CONSTANT-P");
        $list357 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnderspecifiedCollectionType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycKBSubsetCollection")));
        $list358 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WorkflowConstant")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TPTP-PLA001-1-ProblemFORT")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PoorlyOntologized")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StubTerm")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IndeterminateTerm")));
        $list359 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PotentialCBRNEThreat")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Y2KThing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BPVMilitaryUnit")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BPVEvent")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BPVArtifact")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BPVAgent")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HPKB-TransnationalAgent")));
        $sym360$SPEC_CARDINALITY = SubLObjectFactory.makeSymbol("SPEC-CARDINALITY");
        $str361$_5_d__s__ = SubLObjectFactory.makeString("~5,d ~s~%");
        $str362$__Total_coverage___S___ = SubLObjectFactory.makeString("~%Total coverage: ~S%~%");
        $str363$__Optimizing_coverage_via_relativ = SubLObjectFactory.makeString("~%Optimizing coverage via relative overlap:~%");
        $str364$_s___s_unique_spec_p__ = SubLObjectFactory.makeString("~s: ~s unique spec~p~%");
        $sym365$FORBIDDEN_KB_COVERING_COLLECTION_ = SubLObjectFactory.makeSymbol("FORBIDDEN-KB-COVERING-COLLECTION?");
        $sym366$ALL_SPECS_SET = SubLObjectFactory.makeSymbol("ALL-SPECS-SET");
        $sym367$FORBIDDEN_KB_COVERING_COLLECTIONS_SET = SubLObjectFactory.makeSymbol("FORBIDDEN-KB-COVERING-COLLECTIONS-SET");
        $sym368$_FORBIDDEN_KB_COVERING_COLLECTIONS_SET_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*FORBIDDEN-KB-COVERING-COLLECTIONS-SET-CACHING-STATE*");
        $sym369$CLEAR_FORBIDDEN_KB_COVERING_COLLECTIONS_SET = SubLObjectFactory.makeSymbol("CLEAR-FORBIDDEN-KB-COVERING-COLLECTIONS-SET");
        $sym370$_ALL_SPECS_SET_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*ALL-SPECS-SET-CACHING-STATE*");
        $sym371$CLEAR_ALL_SPECS_SET = SubLObjectFactory.makeSymbol("CLEAR-ALL-SPECS-SET");
        $sym372$ALL_GENLS_SET = SubLObjectFactory.makeSymbol("ALL-GENLS-SET");
        $sym373$_ALL_GENLS_SET_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*ALL-GENLS-SET-CACHING-STATE*");
        $sym374$CLEAR_ALL_GENLS_SET = SubLObjectFactory.makeSymbol("CLEAR-ALL-GENLS-SET");
        $list375 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString("#<("), (SubLObject)SubLObjectFactory.makeString("(")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeString(")>"), (SubLObject)SubLObjectFactory.makeString(")")));
        $sym376$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $sym377$COLLECTION_P = SubLObjectFactory.makeSymbol("COLLECTION-P");
        $sym378$SET_SIZE = SubLObjectFactory.makeSymbol("SET-SIZE");
        $list379 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("COL"), (SubLObject)SubLObjectFactory.makeSymbol("SET"));
        $sym380$LIST = SubLObjectFactory.makeSymbol("LIST");
        $sym381$PREDICATE_P = SubLObjectFactory.makeSymbol("PREDICATE-P");
        $list382 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("SET"));
        $list383 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)kb_utilities.ONE_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UnaryPredicate"))), (SubLObject)ConsesLow.cons((SubLObject)kb_utilities.TWO_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate"))), (SubLObject)ConsesLow.cons((SubLObject)kb_utilities.THREE_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TernaryPredicate"))), (SubLObject)ConsesLow.cons((SubLObject)kb_utilities.FOUR_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuaternaryPredicate"))), (SubLObject)ConsesLow.cons((SubLObject)kb_utilities.FIVE_INTEGER, constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuintaryPredicate"))));
        $str384$All_args_of__s_were_open = SubLObjectFactory.makeString("All args of ~s were open");
        $const385$BinaryPredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate"));
        $sym386$DATE_ = SubLObjectFactory.makeSymbol("DATE?");
        $const387$Date = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Date"));
        $sym388$VALID_CONSTANT_NAME_CHAR_P = SubLObjectFactory.makeSymbol("VALID-CONSTANT-NAME-CHAR-P");
        $list389 = ConsesLow.list((SubLObject)Characters.CHAR_s, (SubLObject)Characters.CHAR_colon);
        $sym390$GAF_ASSERTION_ = SubLObjectFactory.makeSymbol("GAF-ASSERTION?");
        $kw391$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $list392 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"));
        $const393$oldConstantName = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("oldConstantName"));
        $sym394$VISIT_COASSERTED_FORT = SubLObjectFactory.makeSymbol("VISIT-COASSERTED-FORT");
        $sym395$CACHED_COMPACT_HL_EXTERNAL_ID_STRING = SubLObjectFactory.makeSymbol("CACHED-COMPACT-HL-EXTERNAL-ID-STRING");
        $sym396$_CACHED_COMPACT_HL_EXTERNAL_ID_STRING_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*CACHED-COMPACT-HL-EXTERNAL-ID-STRING-CACHING-STATE*");
        $str397$_ = SubLObjectFactory.makeString(" ");
        $kw398$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str399$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str400$Writing_coasserted_forts = SubLObjectFactory.makeString("Writing coasserted forts");
        $sym401$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");
        $list402 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CSETQ"), (SubLObject)SubLObjectFactory.makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), (SubLObject)kb_utilities.NIL);
        $sym403$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym404$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $str405$_A = SubLObjectFactory.makeString("~A");
        $const406$CoreUnionConstant = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CoreUnionConstant"));
        $const407$BookkeepingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BookkeepingMt"));
        $sym408$NON_CORE_UNION_CONSTANT_ = SubLObjectFactory.makeSymbol("NON-CORE-UNION-CONSTANT?");
        $str409$SpecMt = SubLObjectFactory.makeString("SpecMt");
        $sym410$MICROTHEORY_P = SubLObjectFactory.makeSymbol("MICROTHEORY-P");
        $int411$100000 = SubLObjectFactory.makeInteger(100000);
        $const412$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $str413$Unable_to_create_HL_object_evalua = SubLObjectFactory.makeString("Unable to create HL object evaluatably: ~S~%");
        $str414$_ = SubLObjectFactory.makeString("'");
        $str415$_string_to_guid_ = SubLObjectFactory.makeString("(string-to-guid ");
        $str416$_ = SubLObjectFactory.makeString(")");
        $str417$_find_variable_by_id_ = SubLObjectFactory.makeString("(find-variable-by-id ");
        $sym418$IS_TRANSFORMABLE_HL_OBJECT_INT_ = SubLObjectFactory.makeSymbol("IS-TRANSFORMABLE-HL-OBJECT-INT?");
        $sym419$MAKE_HL_READABLE_INT = SubLObjectFactory.makeSymbol("MAKE-HL-READABLE-INT");
        $str420$AAAAAAAAAAAAA = SubLObjectFactory.makeString("AAAAAAAAAAAAA");
        $str421$__find_nart__ = SubLObjectFactory.makeString(",(find-nart `");
        $str422$_AAAAAAAAAAAAAFIND_NART_ = SubLObjectFactory.makeString("(AAAAAAAAAAAAAFIND-NART ");
        $str423$__find_variable_by_id_ = SubLObjectFactory.makeString(",(find-variable-by-id ");
        $str424$_AAAAAAAAAAAAAFIND_VARIABLE_BY_ID = SubLObjectFactory.makeString("(AAAAAAAAAAAAAFIND-VARIABLE-BY-ID ");
        $str425$__string_to_guid_ = SubLObjectFactory.makeString(",(string-to-guid ");
        $str426$_AAAAAAAAAAAAASTRING_TO_GUID_ = SubLObjectFactory.makeString("(AAAAAAAAAAAAASTRING-TO-GUID ");
        $str427$__find_assertion__ = SubLObjectFactory.makeString(",(find-assertion `");
        $str428$_AAAAAAAAAAAAAFIND_ASSERTION_ = SubLObjectFactory.makeString("(AAAAAAAAAAAAAFIND-ASSERTION ");
        $str429$__find_deduction__ = SubLObjectFactory.makeString(",(find-deduction `");
        $str430$_AAAAAAAAAAAAAFIND_DEDUCTION_ = SubLObjectFactory.makeString("(AAAAAAAAAAAAAFIND-DEDUCTION ");
        $str431$__find_kb_hl_support__ = SubLObjectFactory.makeString(",(find-kb-hl-support `");
        $str432$_AAAAAAAAAAAAAFIND_KB_HL_SUPPORT_ = SubLObjectFactory.makeString("(AAAAAAAAAAAAAFIND-KB-HL-SUPPORT ");
        $str433$_ = SubLObjectFactory.makeString("`");
        $str434$_AAAAAAAAAAAAA__ = SubLObjectFactory.makeString("(AAAAAAAAAAAAA) ");
        $str435$_AAAAAAAAAAAAAFIND_VARIABLE_BY_ID = SubLObjectFactory.makeString(" AAAAAAAAAAAAAFIND-VARIABLE-BY-ID ");
        $str436$AAAAAAAAAAAAAFIND_VARIABLE_BY_ID = SubLObjectFactory.makeString("AAAAAAAAAAAAAFIND-VARIABLE-BY-ID");
        $str437$_0_9__ = SubLObjectFactory.makeString("[0-9]+");
        $list438 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("START"), (SubLObject)SubLObjectFactory.makeSymbol("END"));
        $str439$_____find_variable_by_id_ = SubLObjectFactory.makeString(" . ,(find-variable-by-id ");
        $str440$Unable_to_create_HL_object_evalua = SubLObjectFactory.makeString("Unable to create HL object evaluatably: ~S");
        $sym441$AAAAAAAAAAAAAFIND_NART = SubLObjectFactory.makeSymbol("AAAAAAAAAAAAAFIND-NART");
        $sym442$AAAAAAAAAAAAAFIND_VARIABLE_BY_ID = SubLObjectFactory.makeSymbol("AAAAAAAAAAAAAFIND-VARIABLE-BY-ID");
        $sym443$AAAAAAAAAAAAASTRING_TO_GUID = SubLObjectFactory.makeSymbol("AAAAAAAAAAAAASTRING-TO-GUID");
        $sym444$AAAAAAAAAAAAAFIND_ASSERTION = SubLObjectFactory.makeSymbol("AAAAAAAAAAAAAFIND-ASSERTION");
        $list445 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("AAAAAAAAAAAAA"));
        $sym446$AAAAAAAAAAAAAFIND_DEDUCTION = SubLObjectFactory.makeSymbol("AAAAAAAAAAAAAFIND-DEDUCTION");
        $sym447$AAAAAAAAAAAAAFIND_KB_HL_SUPPORT = SubLObjectFactory.makeSymbol("AAAAAAAAAAAAAFIND-KB-HL-SUPPORT");
        $str448$Unexpected_situation_ = SubLObjectFactory.makeString("Unexpected situation.");
        $str449$_ = SubLObjectFactory.makeString("-");
        $sym450$RELEVANT_MT_IS_EQ = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EQ");
        $list451 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ASENT-TO-BLAST"), (SubLObject)SubLObjectFactory.makeSymbol("MT"));
        $sym452$RANDOMLY_SELECT_CONSTANTS = SubLObjectFactory.makeSymbol("RANDOMLY-SELECT-CONSTANTS");
        $sym453$FIND_CONSTANT_BY_SUID = SubLObjectFactory.makeSymbol("FIND-CONSTANT-BY-SUID");
        $sym454$RANDOMLY_SELECT_NARTS = SubLObjectFactory.makeSymbol("RANDOMLY-SELECT-NARTS");
        $sym455$FIND_NART_BY_ID = SubLObjectFactory.makeSymbol("FIND-NART-BY-ID");
        $sym456$RANDOMLY_SELECT_ASSERTIONS = SubLObjectFactory.makeSymbol("RANDOMLY-SELECT-ASSERTIONS");
        $sym457$FIND_ASSERTION_BY_ID = SubLObjectFactory.makeSymbol("FIND-ASSERTION-BY-ID");
        $sym458$RANDOMLY_SELECT_DEDUCTIONS = SubLObjectFactory.makeSymbol("RANDOMLY-SELECT-DEDUCTIONS");
        $sym459$FIND_DEDUCTION_BY_ID = SubLObjectFactory.makeSymbol("FIND-DEDUCTION-BY-ID");
        $sym460$RANDOMLY_SELECT_KB_HL_SUPPORTS = SubLObjectFactory.makeSymbol("RANDOMLY-SELECT-KB-HL-SUPPORTS");
        $sym461$FIND_KB_HL_SUPPORT_BY_ID = SubLObjectFactory.makeSymbol("FIND-KB-HL-SUPPORT-BY-ID");
        $sym462$RANDOMLY_SELECT_CLAUSE_STRUCS = SubLObjectFactory.makeSymbol("RANDOMLY-SELECT-CLAUSE-STRUCS");
        $sym463$FIND_CLAUSE_STRUC_BY_ID = SubLObjectFactory.makeSymbol("FIND-CLAUSE-STRUC-BY-ID");
        $sym464$DEDUCTION_P = SubLObjectFactory.makeSymbol("DEDUCTION-P");
        $sym465$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $sym466$NART_P = SubLObjectFactory.makeSymbol("NART-P");
        $sym467$KB_HL_SUPPORT_P = SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-P");
        $sym468$SET_TO_COLLECTION = SubLObjectFactory.makeSymbol("SET-TO-COLLECTION");
        $kw469$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw470$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw471$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw472$KB = SubLObjectFactory.makeKeyword("KB");
        $kw473$FULL = SubLObjectFactory.makeKeyword("FULL");
        $kw474$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list475 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("eventOccursAt")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Israel"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristAttack"))))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOccursAtFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristAttack")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Israel")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CarBombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristAttack"))))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristAttack")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CarBombing")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?ATTACK"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?NUM"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?ATTACK"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristSuicideBombing-Nuclear"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?ATTACK"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CarBombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExistsCount")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("organismKilled")), (SubLObject)SubLObjectFactory.makeSymbol("?ATTACK"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), (SubLObject)SubLObjectFactory.makeSymbol("?NUM"))))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristSuicideBombing-Nuclear")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CarBombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?ATTACK"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?NUM"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceExistsCount")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("organismKilled")), (SubLObject)SubLObjectFactory.makeSymbol("?ATTACK"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person")), (SubLObject)SubLObjectFactory.makeSymbol("?NUM")))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?EVT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dentist"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasMembers")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristOrganization-Hamas")), (SubLObject)SubLObjectFactory.makeSymbol("?X")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?EVT"), (SubLObject)SubLObjectFactory.makeSymbol("?X"))))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Action")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?EVT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dentist"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasMembers")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristOrganization-Hamas")), (SubLObject)SubLObjectFactory.makeSymbol("?X")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?EVT"), (SubLObject)SubLObjectFactory.makeSymbol("?X"))))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?EVT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dentist"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristAttack"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?EVT"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KillingPerson"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasMembers")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristOrganization-Hamas")), (SubLObject)SubLObjectFactory.makeSymbol("?X")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?EVT"), (SubLObject)SubLObjectFactory.makeSymbol("?X"))))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionSubsetFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersectionFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSet")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristAttack")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Bombing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KillingPerson")))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?EVT"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Dentist"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hasMembers")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristOrganization-Hamas")), (SubLObject)SubLObjectFactory.makeSymbol("?X")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?EVT"), (SubLObject)SubLObjectFactory.makeSymbol("?X"))))))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWBush")))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Action")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWBush")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fishing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWBush"))))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Fishing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWBush")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheSetOf")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Event-Localized"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), (SubLObject)SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWBush"))))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBSourceSpindleCollectorMt"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubcollectionOfWithRelationToFn")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CollectionIntersection2Fn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Action")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Event-Localized"))), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GeorgeWBush")))));
        $sym476$COLLECTION_SUBSUMPTION_PATHS = SubLObjectFactory.makeSymbol("COLLECTION-SUBSUMPTION-PATHS");
        $sym477$SETS_EQUAL_EQUAL_ = SubLObjectFactory.makeSymbol("SETS-EQUAL-EQUAL?");
        $list478 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FirstOrderCollection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Book-CW")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FirstOrderCollection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Book-CW")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FirstOrderCollection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Book-CW")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FirstOrderCollection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Book-CW")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AdultMaleHuman")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MaleHuman")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HumanAdult")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HomoSapiens")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AdultMaleHuman")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HumanAdult")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HomoSapiens"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AdultMaleHuman")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MaleHuman")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HomoSapiens"))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LandTransportationDevice")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Book-CW")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Book-CW")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LandTransportationDevice")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLTerm")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLExpression")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLExpression")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLTerm"))))), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLTerm")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLExpression")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLSentence")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLSentence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLTerm")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLExpression")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"))))) });
        $sym479$PREDICATE_SUBSUMPTION_PATHS = SubLObjectFactory.makeSymbol("PREDICATE-SUBSUMPTION-PATHS");
        $list480 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("actors")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("doneBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("perpetrator")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("objectActedOn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("actors"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("perpetrator")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("performedBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("doneBy")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("actors"))))));
    }
    
    public static final class $hl_external_id_string_p$UnaryFunction extends UnaryFunction
    {
        public $hl_external_id_string_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HL-EXTERNAL-ID-STRING-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return kb_utilities.hl_external_id_string_p(arg1);
        }
    }
    
    public static final class $term_L$BinaryFunction extends BinaryFunction
    {
        public $term_L$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("TERM-<"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return kb_utilities.term_L(arg1, arg2, (SubLObject)$term_L$BinaryFunction.UNPROVIDED, (SubLObject)$term_L$BinaryFunction.UNPROVIDED, (SubLObject)$term_L$BinaryFunction.UNPROVIDED);
        }
    }
    
    public static final class $form_sort_pred$BinaryFunction extends BinaryFunction
    {
        public $form_sort_pred$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORM-SORT-PRED"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return kb_utilities.form_sort_pred(arg1, arg2);
        }
    }
    
    public static final class $fort_L$BinaryFunction extends BinaryFunction
    {
        public $fort_L$BinaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("FORT-<"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return kb_utilities.fort_L(arg1, arg2);
        }
    }
    
    public static final class $clear_cached_union_all_specs_count$ZeroArityFunction extends ZeroArityFunction
    {
        public $clear_cached_union_all_specs_count$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-CACHED-UNION-ALL-SPECS-COUNT"));
        }
        
        @Override
		public SubLObject processItem() {
            return kb_utilities.clear_cached_union_all_specs_count();
        }
    }
    
    public static final class $clear_forbidden_kb_covering_collections_set$ZeroArityFunction extends ZeroArityFunction
    {
        public $clear_forbidden_kb_covering_collections_set$ZeroArityFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("CLEAR-FORBIDDEN-KB-COVERING-COLLECTIONS-SET"));
        }
        
        @Override
		public SubLObject processItem() {
            return kb_utilities.clear_forbidden_kb_covering_collections_set();
        }
    }
}

/*

	Total time: 7640 ms
	
*/