package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.inference.harness.after_adding;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava.cycl.sbhl.sbhl_cache;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class kb_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new kb_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.kb_utilities";

    public static final String myFingerPrint = "5f7103db7f8226e9e87961bd306352915e824f60180ae9fff8f78e1b114d2f63";

    // deflexical
    private static final SubLSymbol $estimated_assertions_per_constant$ = makeSymbol("*ESTIMATED-ASSERTIONS-PER-CONSTANT*");

    // deflexical
    private static final SubLSymbol $estimated_constants_per_nart$ = makeSymbol("*ESTIMATED-CONSTANTS-PER-NART*");

    // deflexical
    private static final SubLSymbol $estimated_assertions_per_deduction$ = makeSymbol("*ESTIMATED-ASSERTIONS-PER-DEDUCTION*");

    // deflexical
    private static final SubLSymbol $estimated_assertions_per_clause_struc$ = makeSymbol("*ESTIMATED-ASSERTIONS-PER-CLAUSE-STRUC*");

    // deflexical
    private static final SubLSymbol $estimated_assertions_per_meta_assertion$ = makeSymbol("*ESTIMATED-ASSERTIONS-PER-META-ASSERTION*");

    // deflexical
    private static final SubLSymbol $estimated_arguments_per_assertion$ = makeSymbol("*ESTIMATED-ARGUMENTS-PER-ASSERTION*");

    // deflexical
    private static final SubLSymbol $estimated_assertions_per_unrepresented_term$ = makeSymbol("*ESTIMATED-ASSERTIONS-PER-UNREPRESENTED-TERM*");

    // deflexical
    private static final SubLSymbol $estimated_deductions_per_hl_support$ = makeSymbol("*ESTIMATED-DEDUCTIONS-PER-HL-SUPPORT*");

    // deflexical
    private static final SubLSymbol $kb_table_padding_multiplier$ = makeSymbol("*KB-TABLE-PADDING-MULTIPLIER*");

    // defparameter
    private static final SubLSymbol $default_estimated_constant_count$ = makeSymbol("*DEFAULT-ESTIMATED-CONSTANT-COUNT*");

    // defparameter
    private static final SubLSymbol $get_kb_object_managers$ = makeSymbol("*GET-KB-OBJECT-MANAGERS*");

    // defparameter
    private static final SubLSymbol $sort_terms_constants_by_name$ = makeSymbol("*SORT-TERMS-CONSTANTS-BY-NAME*");

    // defparameter
    private static final SubLSymbol $sort_terms_ignore_variable_symbols$ = makeSymbol("*SORT-TERMS-IGNORE-VARIABLE-SYMBOLS*");

    // defparameter
    // This trumps *sort-terms-constants-by-name*
    private static final SubLSymbol $sort_terms_by_internal_idP$ = makeSymbol("*SORT-TERMS-BY-INTERNAL-ID?*");

    // deflexical
    private static final SubLSymbol $definitional_pred_sort_order$ = makeSymbol("*DEFINITIONAL-PRED-SORT-ORDER*");

    // deflexical
    public static final SubLSymbol $term_order_method_table$ = makeSymbol("*TERM-ORDER-METHOD-TABLE*");







    // defparameter
    // Temporary variable. @todo hard-code to T
    private static final SubLSymbol $set_to_collection_uses_reformulatorP$ = makeSymbol("*SET-TO-COLLECTION-USES-REFORMULATOR?*");



    // deflexical
    // Instances of any of these collections are forbidden
    private static final SubLSymbol $forbidden_kb_covering_collection_types$ = makeSymbol("*FORBIDDEN-KB-COVERING-COLLECTION-TYPES*");

    // deflexical
    // Quoted instances of any of these collections are forbidden
    private static final SubLSymbol $forbidden_kb_covering_quoted_collection_types$ = makeSymbol("*FORBIDDEN-KB-COVERING-QUOTED-COLLECTION-TYPES*");

    // deflexical
    // These exact collections are forbidden
    private static final SubLSymbol $forbidden_cols$ = makeSymbol("*FORBIDDEN-COLS*");

    // deflexical
    // Specs of any of these collections are forbidden
    private static final SubLSymbol $forbidden_specs$ = makeSymbol("*FORBIDDEN-SPECS*");

    // defparameter
    // temporary variable for forbidden-kb-covering-collection?
    private static final SubLSymbol $min_each_spec_cardinality$ = makeSymbol("*MIN-EACH-SPEC-CARDINALITY*");







    // deflexical
    private static final SubLSymbol $predicate_type_arity_table$ = makeSymbol("*PREDICATE-TYPE-ARITY-TABLE*");

    // defparameter
    private static final SubLSymbol $coasserted_fort_source$ = makeSymbol("*COASSERTED-FORT-SOURCE*");

    // defparameter
    private static final SubLSymbol $coasserted_fort_set$ = makeSymbol("*COASSERTED-FORT-SET*");





    private static final SubLString $str1$__No_KB_is_currently_loaded_ = makeString("~%No KB is currently loaded.");



    private static final SubLString $str3$______KB__A_statistics = makeString("~%;;; KB ~A statistics");

    private static final SubLString $str4$__FORTs______________________9___ = makeString("~%FORTs                   : ~9,' D");

    private static final SubLString $str5$___Constants_________________9___ = makeString("~% Constants              : ~9,' D");

    private static final SubLString $str6$____cached_indexing__________9___ = makeString("~%  cached indexing       : ~9,' D  (~A%)");

    private static final SubLString $str7$___NARTs_____________________9___ = makeString("~% NARTs                  : ~9,' D");

    private static final SubLString $str8$____cached_HL_formulas_______9___ = makeString("~%  cached HL formulas    : ~9,' D  (~A%)");

    private static final SubLString $str9$__Assertions_________________9___ = makeString("~%Assertions              : ~9,' D");

    private static final SubLString $str10$___KB_Assertions_____________9___ = makeString("~% KB Assertions          : ~9,' D");

    private static final SubLString $str11$____cached___________________9___ = makeString("~%  cached                : ~9,' D  (~A%)");

    private static final SubLString $str12$___Bookkeeping_Assertions____9___ = makeString("~% Bookkeeping Assertions : ~9,' D");

    private static final SubLString $str13$___Virtual_Assertions________9___ = makeString("~% Virtual Assertions     : ~9,' D");

    private static final SubLString $str14$__Deductions_________________9___ = makeString("~%Deductions              : ~9,' D");

    private static final SubLString $str15$__KB_HL_supports_____________9___ = makeString("~%KB HL supports          : ~9,' D");

    private static final SubLString $str16$__Unrepresented_terms________9___ = makeString("~%Unrepresented terms     : ~9,' D");

    private static final SubLString $str17$______KB__A_content_statistics = makeString("~%;;; KB ~A content statistics");

    private static final SubLString $str18$__Terms______________9___D = makeString("~%Terms           : ~9,' D");

    private static final SubLString $str19$___Collections_______9___D = makeString("~% Collections    : ~9,' D");

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLString $str21$____First_Order______9___D = makeString("~%  First Order   : ~9,' D");

    private static final SubLObject $$FirstOrderCollection = reader_make_constant_shell(makeString("FirstOrderCollection"));

    private static final SubLString $str23$____Second_Order_____9___D = makeString("~%  Second Order  : ~9,' D");

    private static final SubLObject $$SecondOrderCollection = reader_make_constant_shell(makeString("SecondOrderCollection"));

    private static final SubLString $str25$____Third_Order______9___D = makeString("~%  Third Order   : ~9,' D");

    private static final SubLObject $$ThirdOrderCollection = reader_make_constant_shell(makeString("ThirdOrderCollection"));

    private static final SubLString $str27$___Relations_________9___D = makeString("~% Relations      : ~9,' D");

    private static final SubLObject $$Relation = reader_make_constant_shell(makeString("Relation"));

    private static final SubLString $str29$____Functions________9___D = makeString("~%  Functions     : ~9,' D");

    private static final SubLObject $$Function_Denotational = reader_make_constant_shell(makeString("Function-Denotational"));

    private static final SubLString $str31$____Predicates_______9___D = makeString("~%  Predicates    : ~9,' D");

    private static final SubLObject $$Predicate = reader_make_constant_shell(makeString("Predicate"));

    private static final SubLString $str33$___Microtheories_____9___D = makeString("~% Microtheories  : ~9,' D");

    private static final SubLObject $$Microtheory = reader_make_constant_shell(makeString("Microtheory"));

    private static final SubLString $str35$___Individuals_______9___D = makeString("~% Individuals    : ~9,' D");

    private static final SubLObject $$Individual = reader_make_constant_shell(makeString("Individual"));

    private static final SubLString $str37$__KB_Assertions______9___D = makeString("~%KB Assertions   : ~9,' D");









    private static final SubLSymbol $KB_HL_SUPPORT = makeKeyword("KB-HL-SUPPORT");



    private static final SubLList $list44 = list(makeSymbol("TYPE"), makeSymbol("KBOM"));

    private static final SubLList $list45 = list(cons(makeKeyword("CONSTANT"), makeString("Constant")), cons(makeKeyword("NART"), makeString("NART")), cons(makeKeyword("ASSERTION"), makeString("Assertion")), cons(makeKeyword("DEDUCTION"), makeString("Deduction")), cons(makeKeyword("KB-HL-SUPPORT"), makeString("KB HL Support")), cons(makeKeyword("UNPREPRESENTED-TERM"), makeString("Unrepresented Term")));

    private static final SubLString $str46$___18_A____9A____9A____9A = makeString("~%~18@A : ~9A + ~9A = ~9A");

    private static final SubLString $$$Object_Type = makeString("Object Type");

    private static final SubLString $$$committed = makeString("committed");

    private static final SubLString $$$swappable = makeString("swappable");

    private static final SubLString $str50$in_memory = makeString("in-memory");

    private static final SubLString $str51$_________________________________ = makeString("~%------------------------------------------------------");

    private static final SubLList $list52 = list(makeSymbol("TYPE"), makeSymbol("COMMITTED"), makeSymbol("SWAPPABLE"), makeSymbol("IN-MEMORY"));

    private static final SubLString $str53$___18_A____9_A____9_A____9_A = makeString("~%~18@A : ~9@A + ~9@A = ~9@A");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLString $str56$Calculating_cardinalities_of_pred = makeString("Calculating cardinalities of predicate extents");

    private static final SubLString $$$cdolist = makeString("cdolist");



    private static final SubLSymbol $sym59$_ = makeSymbol(">");







    private static final SubLString $str63$do_broad_mt_index = makeString("do-broad-mt-index");





    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));











    private static final SubLString $str72$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str77$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str78$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str79$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLList $list80 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    private static final SubLString $str81$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");





    private static final SubLSymbol $sym84$_ = makeSymbol("=");

    private static final SubLSymbol $sym85$_ = makeSymbol("<");

    private static final SubLFloat $float$17_1 = makeDouble(17.1);

    private static final SubLFloat $float$1_41 = makeDouble(1.41);

    private static final SubLFloat $float$2_67 = makeDouble(2.67);

    private static final SubLFloat $float$39_3 = makeDouble(39.3);

    private static final SubLFloat $float$30_3 = makeDouble(30.3);

    private static final SubLFloat $float$1_12 = makeDouble(1.12);

    private static final SubLFloat $float$7_97 = makeDouble(7.97);

    private static final SubLFloat $float$1_05 = makeDouble(1.05);



    private static final SubLInteger $int$50000 = makeInteger(50000);

    private static final SubLSymbol INIT_CONSTANT = makeSymbol("INIT-CONSTANT");

    private static final SubLSymbol SHOW_NEW_KB_STATE = makeSymbol("SHOW-NEW-KB-STATE");

    private static final SubLString $str98$______KB__S_new_KB_objects__ = makeString("~&;;; KB ~S new KB objects~%");

    private static final SubLString $str99$__New_FORTs__________________9___ = makeString("~&New FORTs               : ~9,' D~%");

    private static final SubLString $str100$___New_Constants_____________9___ = makeString("~& New Constants          : ~9,' D~%");

    private static final SubLString $str101$___New_NARTs_________________9___ = makeString("~& New NARTs              : ~9,' D~%");

    private static final SubLString $str102$__New_Assertions_____________9___ = makeString("~&New Assertions          : ~9,' D~%");

    private static final SubLString $str103$__New_Deductions_____________9___ = makeString("~&New Deductions          : ~9,' D~%");

    private static final SubLString $str104$__New_KB_HL_Supports_________9___ = makeString("~&New KB HL Supports      : ~9,' D~%");

    private static final SubLString $str105$__New_Unrepresented_Terms____9___ = makeString("~&New Unrepresented Terms : ~9,' D~%");

    private static final SubLSymbol CLEAR_NEW_KB_STATE = makeSymbol("CLEAR-NEW-KB-STATE");

    private static final SubLSymbol SHOW_NEW_KB_CONTENT = makeSymbol("SHOW-NEW-KB-CONTENT");

    private static final SubLList $list108 = list(makeKeyword("CONSTANT"), makeKeyword("NART"), makeKeyword("ASSERTION"));

    private static final SubLString $str109$__Recent_constants___ = makeString("~&Recent constants:~%");

    private static final SubLString $$$mapping_constants_for_sweep = makeString("mapping constants for sweep");

    private static final SubLString $str111$_____S__ = makeString("~&  ~S~%");

    private static final SubLString $str112$__Recent_NARTs___ = makeString("~&Recent NARTs:~%");

    private static final SubLString $$$mapping_narts_for_sweep = makeString("mapping narts for sweep");

    private static final SubLString $str114$__Recent_assertions___ = makeString("~&Recent assertions:~%");

    private static final SubLString $$$mapping_assertions_for_sweep = makeString("mapping assertions for sweep");

    private static final SubLString $str116$__Recent_deductions___ = makeString("~&Recent deductions:~%");

    private static final SubLString $$$mapping_deductions_for_sweep = makeString("mapping deductions for sweep");

    private static final SubLSymbol $KB_HL_SUPPORTS = makeKeyword("KB-HL-SUPPORTS");

    private static final SubLString $str119$__Recent_KB_HL_supports___ = makeString("~&Recent KB HL supports:~%");

    private static final SubLString $str120$mapping_kb_hl_supports_for_sweep = makeString("mapping kb-hl-supports for sweep");

    private static final SubLString $str121$__ = makeString("~&");

    private static final SubLString $str122$Cyc_Structures___ = makeString("Cyc Structures:~%");

    private static final SubLString $str123$__ = makeString(";;");

    private static final SubLString $str124$__Problem_stores___A_A___A_infere = makeString("  Problem stores: ~A~A (~A inferences) (~A proofs) (~A problems)~%");

    private static final SubLString $str125$_problem_stores___A_A__inferences = makeString(" problem-stores: ~A~A, inferences: ~A, proofs: ~A, problems: ~A");



    private static final SubLSymbol $FORWARD_PROBLEM_STORES = makeKeyword("FORWARD-PROBLEM-STORES");

    private static final SubLString $str128$__ = makeString(" (");

    private static final SubLString $str129$_forward_ = makeString(" forward)");

    private static final SubLString $str130$ = makeString("");







    private static final SubLString $str134$__KB_Objects_swapped_in___A__ = makeString("  KB Objects swapped in: ~A~%");

    private static final SubLString $str135$_____kb_objects_swapped_in___A_ = makeString("~&;; kb-objects-swapped-in: ~A,");

    private static final SubLSymbol $KB_OBJECTS_IN_MEMORY = makeKeyword("KB-OBJECTS-IN-MEMORY");

    private static final SubLString $str137$__Ephemeral_terms___A__ = makeString("  Ephemeral terms: ~A~%");

    private static final SubLString $str138$_ephemeral_terms___A_ = makeString(" ephemeral-terms: ~A,");



    private static final SubLSymbol $SBHL_CACHE_MISSES = makeKeyword("SBHL-CACHE-MISSES");

    private static final SubLString $str141$__SBHL_cache_misses_hash_table___ = makeString("  SBHL cache misses hash table: ~A~%");

    private static final SubLString $str142$_sbhl_cache_misses___A_ = makeString(" sbhl-cache-misses: ~A,");

    private static final SubLSymbol PRINT_SBHL_CACHE_MISSES_TOP_N = makeSymbol("PRINT-SBHL-CACHE-MISSES-TOP-N");

    private static final SubLString $str144$__Global_cache_entries___A__ = makeString("  Global cache entries: ~A~%");

    private static final SubLString $str145$_global_cache_entries___A__ = makeString(" global-cache-entries: ~A~%");

    private static final SubLSymbol $GLOBAL_CACHE_ENTRIES = makeKeyword("GLOBAL-CACHE-ENTRIES");



    private static final SubLSymbol $FORWARD_INFERENCE_METRICS = makeKeyword("FORWARD-INFERENCE-METRICS");

    private static final SubLString $str149$____ = makeString("~&;;");

    private static final SubLString $str150$__Undestroyed_items___A__ = makeString("  Undestroyed items: ~A~%");

    private static final SubLString $str151$_undestroyed_items___A = makeString(" undestroyed-items: ~A");

    private static final SubLString $str152$_ = makeString(",");

    private static final SubLString $str153$__Forward_inference_metrics___A__ = makeString("  Forward inference metrics: ~A~%");

    private static final SubLString $str154$_forward_metrics___A = makeString(" forward-metrics: ~A");

    private static final SubLSymbol $sym155$PROBLEM_STORE_FORWARD_ = makeSymbol("PROBLEM-STORE-FORWARD?");

    private static final SubLSymbol $sym156$_ = makeSymbol("+");

    private static final SubLSymbol PROBLEM_STORE_PROBLEM_COUNT = makeSymbol("PROBLEM-STORE-PROBLEM-COUNT");

    private static final SubLSymbol PROBLEM_STORE_PROOF_COUNT = makeSymbol("PROBLEM-STORE-PROOF-COUNT");

    private static final SubLSymbol CACHING_STATE_SIZE_ROBUST = makeSymbol("CACHING-STATE-SIZE-ROBUST");

    private static final SubLSymbol DELAYED_PROCESSOR_QUEUE_SIZE = makeSymbol("DELAYED-PROCESSOR-QUEUE-SIZE");

    private static final SubLString $str161$BEFORE___ = makeString("BEFORE:~%");

    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLString $$$Performing_full_GC = makeString("Performing full GC");

    private static final SubLString $str164$AFTER___ = makeString("AFTER:~%");



    private static final SubLString $str166$Unable_to_initialize__A__ = makeString("Unable to initialize ~A~%");





    private static final SubLString $str169$__lock_hog___A__writer__S_waiters = makeString("~&lock-hog: ~A (writer=~S waiters=~S)~%");

    private static final SubLString $str170$__lock_hog___A__locker__S___ = makeString("~&lock-hog: ~A (locker=~S)~%");

    private static final SubLInteger $int$212 = makeInteger(212);



    private static final SubLList $list173 = list(makeSymbol("CONSTANT-CP"), makeSymbol("NART-CP"), makeSymbol("ASSERTION-CP"), makeSymbol("DEDUCTION-CP"));

    private static final SubLSymbol KB_CHECKPOINT_P = makeSymbol("KB-CHECKPOINT-P");

    private static final SubLList $list175 = list(makeSymbol("ASSERTION-CP"), makeSymbol("DEDUCTION-CP"));

    private static final SubLSymbol THEORY_CHECKPOINT_P = makeSymbol("THEORY-CHECKPOINT-P");

    private static final SubLSymbol HL_INTERNAL_ID_STRING_P = makeSymbol("HL-INTERNAL-ID-STRING-P");

    private static final SubLSymbol COMPACT_HL_INTERNAL_ID_STRING_P = makeSymbol("COMPACT-HL-INTERNAL-ID-STRING-P");

    private static final SubLSymbol HL_INTERNAL_ID_STRING = makeSymbol("HL-INTERNAL-ID-STRING");

    private static final SubLSymbol COMPACT_HL_INTERNAL_ID_STRING = makeSymbol("COMPACT-HL-INTERNAL-ID-STRING");

    private static final SubLSymbol FIND_OBJECT_BY_HL_INTERNAL_ID_STRING = makeSymbol("FIND-OBJECT-BY-HL-INTERNAL-ID-STRING");



    private static final SubLSymbol FIND_OBJECT_BY_COMPACT_HL_INTERNAL_ID_STRING = makeSymbol("FIND-OBJECT-BY-COMPACT-HL-INTERNAL-ID-STRING");



    private static final SubLSymbol MAYBE_FIND_OBJECT_BY_HL_INTERNAL_ID_STRING = makeSymbol("MAYBE-FIND-OBJECT-BY-HL-INTERNAL-ID-STRING");

    private static final SubLSymbol MAYBE_FIND_OBJECT_BY_COMPACT_HL_INTERNAL_ID_STRING = makeSymbol("MAYBE-FIND-OBJECT-BY-COMPACT-HL-INTERNAL-ID-STRING");

    private static final SubLSymbol HL_EXTERNAL_ID_STRING_P = makeSymbol("HL-EXTERNAL-ID-STRING-P");

    private static final SubLSymbol COMPACT_HL_EXTERNAL_ID_STRING_P = makeSymbol("COMPACT-HL-EXTERNAL-ID-STRING-P");

    private static final SubLSymbol $sym189$COMPACT_HL_EXTERNAL_ID_STRING_ = makeSymbol("COMPACT-HL-EXTERNAL-ID-STRING?");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol $sym192$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol $sym193$COMPACT_HL_EXTERNAL_ID_STRING_ = makeSymbol("COMPACT-HL-EXTERNAL-ID-STRING=");

    private static final SubLSymbol HL_EXTERNAL_ID_STRING = makeSymbol("HL-EXTERNAL-ID-STRING");

    private static final SubLSymbol COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol("COMPACT-HL-EXTERNAL-ID-STRING");



    private static final SubLSymbol FIND_CYCL_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol("FIND-CYCL-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING");

    private static final SubLString $str198$Invalid_hl_external_id____A____fo = makeString("Invalid hl external id, '~A',  for a cycl term.~%.");

    private static final SubLSymbol FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol("FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING");

    private static final SubLSymbol MAYBE_FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol("MAYBE-FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING");

    private static final SubLString $str201$invalid_mode__S = makeString("invalid mode ~S");

    private static final SubLSymbol INVALID_HL_OBJECT_P = makeSymbol("INVALID-HL-OBJECT-P");

    private static final SubLString $$$an_unnamed_constant = makeString("an unnamed constant");

    private static final SubLString $str204$_a = makeString("~a");

    private static final SubLSymbol STABLE_SORT = makeSymbol("STABLE-SORT");



    private static final SubLSymbol FORM_SORT_PRED = makeSymbol("FORM-SORT-PRED");



    private static final SubLSymbol $sym209$FORT__ = makeSymbol("FORT-<");

    private static final SubLList $list210 = list(new SubLObject[]{ reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("genls")), reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("genlInverse")), reader_make_constant_shell(makeString("genlMt")), reader_make_constant_shell(makeString("disjointWith")), reader_make_constant_shell(makeString("negationPreds")), reader_make_constant_shell(makeString("negationInverse")), reader_make_constant_shell(makeString("negationMt")), reader_make_constant_shell(makeString("defnIff")), reader_make_constant_shell(makeString("defnSufficient")), reader_make_constant_shell(makeString("defnNecessary")), reader_make_constant_shell(makeString("resultIsa")), reader_make_constant_shell(makeString("resultIsaArg")), reader_make_constant_shell(makeString("resultGenl")), reader_make_constant_shell(makeString("resultGenlArg")), reader_make_constant_shell(makeString("arity")), reader_make_constant_shell(makeString("arityMin")), reader_make_constant_shell(makeString("arityMax")), reader_make_constant_shell(makeString("argsIsa")), reader_make_constant_shell(makeString("argsGenl")), reader_make_constant_shell(makeString("arg1Isa")), reader_make_constant_shell(makeString("arg1Genl")), reader_make_constant_shell(makeString("arg2Isa")), reader_make_constant_shell(makeString("arg2Genl")), reader_make_constant_shell(makeString("arg3Isa")), reader_make_constant_shell(makeString("arg3Genl")), reader_make_constant_shell(makeString("arg4Isa")), reader_make_constant_shell(makeString("arg4Genl")), reader_make_constant_shell(makeString("arg5Isa")), reader_make_constant_shell(makeString("arg5Genl")), reader_make_constant_shell(makeString("argIsa")), reader_make_constant_shell(makeString("argGenl")), reader_make_constant_shell(makeString("fanOutArg")), reader_make_constant_shell(makeString("evaluationDefn")), reader_make_constant_shell(makeString("afterAdding")), reader_make_constant_shell(makeString("afterRemoving")) });



    private static final SubLSymbol TERM_ORDER_ASSERTION_METHOD = makeSymbol("TERM-ORDER-ASSERTION-METHOD");

    private static final SubLSymbol TERM_ORDER_CONS_METHOD = makeSymbol("TERM-ORDER-CONS-METHOD");

    private static final SubLInteger $int$500 = makeInteger(500);



    private static final SubLSymbol TERM_SIMILARITY_METRIC_GENERALIZATIONS = makeSymbol("TERM-SIMILARITY-METRIC-GENERALIZATIONS");







    private static final SubLString $$$cdotimes = makeString("cdotimes");



    private static final SubLString $str222$examining_creation_times_by__S = makeString("examining creation times by ~S");

    private static final SubLString $$$examining_all_creation_times = makeString("examining all creation times");

    private static final SubLSymbol $sym224$TERM__ = makeSymbol("TERM-<");



    private static final SubLSymbol $sym226$CREATION_TIME__ = makeSymbol("CREATION-TIME-<");

    private static final SubLSymbol $sym227$CREATOR__ = makeSymbol("CREATOR-<");

    private static final SubLSymbol FIND_GROUND_NAUT = makeSymbol("FIND-GROUND-NAUT");

    private static final SubLSymbol TERM_OF_UNIT = makeSymbol("TERM-OF-UNIT");

    private static final SubLString $$$examining_assertion_timestamps = makeString("examining assertion timestamps");

    private static final SubLSymbol ASSERTION_CNF = makeSymbol("ASSERTION-CNF");

    private static final SubLSymbol $sym232$ASSERT_DATE__ = makeSymbol("ASSERT-DATE-<");

    private static final SubLSymbol $sym233$ASSERT_CYCLIST__ = makeSymbol("ASSERT-CYCLIST-<");

    private static final SubLSymbol $sym234$ASSERT_TIMESTAMP__ = makeSymbol("ASSERT-TIMESTAMP-<");

    private static final SubLSymbol TERM_LAST_ASSERTED_ASSERTION_DATE = makeSymbol("TERM-LAST-ASSERTED-ASSERTION-DATE");

    private static final SubLSymbol CACHED_TERM_LAST_ASSERTED_ASSERTION_DATE = makeSymbol("CACHED-TERM-LAST-ASSERTED-ASSERTION-DATE");

    private static final SubLSymbol $cached_term_last_asserted_assertion_date_caching_state$ = makeSymbol("*CACHED-TERM-LAST-ASSERTED-ASSERTION-DATE-CACHING-STATE*");

    private static final SubLSymbol CACHED_CREATION_TIME = makeSymbol("CACHED-CREATION-TIME");

    private static final SubLSymbol $cached_creation_time_caching_state$ = makeSymbol("*CACHED-CREATION-TIME-CACHING-STATE*");



    private static final SubLInteger $int$200 = makeInteger(200);

    private static final SubLSymbol CACHED_CREATOR = makeSymbol("CACHED-CREATOR");

    private static final SubLSymbol $cached_creator_caching_state$ = makeSymbol("*CACHED-CREATOR-CACHING-STATE*");

    private static final SubLString $str244$searching_for_probably_most_recen = makeString("searching for probably most recent assertion");

    private static final SubLString $$$Gathering_all_constants = makeString("Gathering all constants");

    private static final SubLString $$$Gathering_all_narts = makeString("Gathering all narts");

    private static final SubLString $$$Gathering_all_forts = makeString("Gathering all forts");

    private static final SubLString $$$Gathering_all_deductions = makeString("Gathering all deductions");

    private static final SubLString $$$Gathering_all_KB_HL_supports = makeString("Gathering all KB HL supports");

    private static final SubLString $$$Gathering_all_assertions = makeString("Gathering all assertions");

    private static final SubLString $$$Gathering_all_gafs = makeString("Gathering all gafs");

    private static final SubLString $$$Gathering_all_forward_gafs = makeString("Gathering all forward gafs");

    private static final SubLString $$$Gathering_all_backward_gafs = makeString("Gathering all backward gafs");

    private static final SubLString $$$Gathering_all_rules = makeString("Gathering all rules");

    private static final SubLString $$$Gathering_all_forward_rules = makeString("Gathering all forward rules");

    private static final SubLString $$$Gathering_all_backward_rules = makeString("Gathering all backward rules");

    private static final SubLSymbol $sym257$DEDUCED_ASSERTION_ = makeSymbol("DEDUCED-ASSERTION?");

    private static final SubLSymbol $sym258$SAFE__ = makeSymbol("SAFE->");



    private static final SubLList $list260 = list(list(makeSymbol("&KEY"), makeSymbol("KB-CHANGED-MESSAGE"), makeSymbol("KB-UNCHANGED-MESSAGE"), makeSymbol("VERBOSITY")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list261 = list(makeKeyword("KB-CHANGED-MESSAGE"), makeKeyword("KB-UNCHANGED-MESSAGE"), makeKeyword("VERBOSITY"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $KB_CHANGED_MESSAGE = makeKeyword("KB-CHANGED-MESSAGE");

    private static final SubLSymbol $KB_UNCHANGED_MESSAGE = makeKeyword("KB-UNCHANGED-MESSAGE");



    private static final SubLSymbol $sym266$KB_OBJECT_COUNT_LIST_1 = makeUninternedSymbol("KB-OBJECT-COUNT-LIST-1");

    private static final SubLSymbol $sym267$KB_OBJECT_COUNT_LIST_2 = makeUninternedSymbol("KB-OBJECT-COUNT-LIST-2");

    private static final SubLSymbol $sym268$NEW_CONSTANT_COUNT = makeUninternedSymbol("NEW-CONSTANT-COUNT");

    private static final SubLSymbol $sym269$NEW_NART_COUNT = makeUninternedSymbol("NEW-NART-COUNT");

    private static final SubLSymbol $sym270$NEW_ASSERTION_COUNT = makeUninternedSymbol("NEW-ASSERTION-COUNT");

    private static final SubLSymbol $sym271$NEW_KB_HL_SUPPORT_COUNT = makeUninternedSymbol("NEW-KB-HL-SUPPORT-COUNT");

    private static final SubLSymbol $sym272$NEW_DEDUCTION_COUNT = makeUninternedSymbol("NEW-DEDUCTION-COUNT");



    private static final SubLList $list274 = list(list(makeSymbol("KB-OBJECT-COUNT-LIST")));

    private static final SubLSymbol KB_OBJECT_COUNT_LISTS_NEW_CONSTANT_COUNT = makeSymbol("KB-OBJECT-COUNT-LISTS-NEW-CONSTANT-COUNT");

    private static final SubLSymbol KB_OBJECT_COUNT_LISTS_NEW_NART_COUNT = makeSymbol("KB-OBJECT-COUNT-LISTS-NEW-NART-COUNT");

    private static final SubLSymbol KB_OBJECT_COUNT_LISTS_NEW_ASSERTION_COUNT = makeSymbol("KB-OBJECT-COUNT-LISTS-NEW-ASSERTION-COUNT");

    private static final SubLSymbol KB_OBJECT_COUNT_LISTS_NEW_KB_HL_SUPPORT_COUNT = makeSymbol("KB-OBJECT-COUNT-LISTS-NEW-KB-HL-SUPPORT-COUNT");

    private static final SubLSymbol KB_OBJECT_COUNT_LISTS_NEW_DEDUCTION_COUNT = makeSymbol("KB-OBJECT-COUNT-LISTS-NEW-DEDUCTION-COUNT");



    private static final SubLList $list281 = list(makeKeyword("SILENT"));



    private static final SubLSymbol NON_ZERO_INTEGER_P = makeSymbol("NON-ZERO-INTEGER-P");





    private static final SubLString $str286$___A__ = makeString("~&~A~%");

    private static final SubLString $str287$___s_constant_A__A__ = makeString("  ~s constant~A ~A~%");

    private static final SubLSymbol ABS = makeSymbol("ABS");



    public static final SubLList $list290 = list(ONE_INTEGER);

    public static final SubLList $list291 = list(makeString("s were"), makeString(" was"));



    private static final SubLList $list293 = list(makeString("created"), makeString("destroyed"));

    private static final SubLString $str294$___s_nart_A__A__ = makeString("  ~s nart~A ~A~%");

    private static final SubLString $str295$___s_assertion_A__A__ = makeString("  ~s assertion~A ~A~%");

    private static final SubLString $str296$___s_kb_hl_support_A__A__ = makeString("  ~s kb-hl-support~A ~A~%");

    private static final SubLString $str297$___s_deduction_A__A__ = makeString("  ~s deduction~A ~A~%");

    public static final SubLList $list298 = list(list(makeSymbol("FORCE-OUTPUT"), T));

    private static final SubLString $$$mapping_Cyc_constants = makeString("mapping Cyc constants");



    private static final SubLSymbol $sym301$CONSTANT_SORTING_FUNKY__ = makeSymbol("CONSTANT-SORTING-FUNKY-<");



    private static final SubLSymbol SORT_CONSTANTS_BY_SORTING_INFO = makeSymbol("SORT-CONSTANTS-BY-SORTING-INFO");







    private static final SubLList $list307 = list(makeSymbol("DATE1"), makeSymbol("SECOND1"), makeSymbol("ID1"), makeSymbol("DWIMMED-DATE1"));

    private static final SubLList $list308 = list(makeSymbol("DATE2"), makeSymbol("SECOND2"), makeSymbol("ID2"), makeSymbol("DWIMMED-DATE2"));

    private static final SubLList $list309 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("PREDICATE"), makeSymbol("TRUTH"), makeSymbol("DIRECTION"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list310 = list(makeKeyword("INDEX"), makeKeyword("PREDICATE"), makeKeyword("TRUTH"), makeKeyword("DIRECTION"), makeKeyword("DONE"));











    private static final SubLSymbol $sym316$INDEXED_TERMS = makeUninternedSymbol("INDEXED-TERMS");

    private static final SubLSymbol EXPRESSION_GATHER = makeSymbol("EXPRESSION-GATHER");

    private static final SubLList $list318 = list(list(makeSymbol("QUOTE"), makeSymbol("INDEXED-TERM-P")), NIL, list(makeSymbol("FUNCTION"), EQUAL));





    private static final SubLSymbol DO_OVERLAP_INDEX = makeSymbol("DO-OVERLAP-INDEX");





    private static final SubLSymbol ASSERTION_DIRECTION = makeSymbol("ASSERTION-DIRECTION");







    private static final SubLSymbol TERM_OCCURS_AS_FORMULA_ARGUMENT = makeSymbol("TERM-OCCURS-AS-FORMULA-ARGUMENT");

    private static final SubLList $list329 = list(list(makeSymbol("ASSERTION-VAR"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("TRUTH"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list330 = list(makeKeyword("TRUTH"), makeKeyword("DONE"));

    private static final SubLSymbol $sym331$INDEXED_TERMS = makeUninternedSymbol("INDEXED-TERMS");

    private static final SubLList $list332 = list(list(makeSymbol("QUOTE"), makeSymbol("INDEXED-TERM-P")), NIL);



    private static final SubLSymbol EXPRESSION_FIND = makeSymbol("EXPRESSION-FIND");

    private static final SubLList $list335 = list(T, list(makeSymbol("FUNCTION"), EQUAL));









    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLSymbol EL_SET_P = makeSymbol("EL-SET-P");

    private static final SubLObject $$Nothing = reader_make_constant_shell(makeString("Nothing"));

    private static final SubLObject $$CollectionSubsetFn = reader_make_constant_shell(makeString("CollectionSubsetFn"));

    private static final SubLList $list344 = list(makeKeyword("IGNORE-RL-MODULES"), list(reader_make_constant_shell(makeString("SubcollectionSimplifierRLModule"))));

    private static final SubLList $list345 = list(makeKeyword("FOCUS"), reader_make_constant_shell(makeString("SubcollectionSimplifierRLModule")));

    private static final SubLList $list346 = list(makeSymbol("EL-VARIABLE"), makeSymbol("EXPRESSION"));

    private static final SubLObject $$CollectionIntersection2Fn = reader_make_constant_shell(makeString("CollectionIntersection2Fn"));

    private static final SubLObject $$CollectionIntersectionFn = reader_make_constant_shell(makeString("CollectionIntersectionFn"));

    private static final SubLObject $$TheSet = reader_make_constant_shell(makeString("TheSet"));

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLString $str351$_S_was_not_a_set = makeString("~S was not a set");

    private static final SubLSymbol CACHED_UNION_ALL_SPECS_COUNT = makeSymbol("CACHED-UNION-ALL-SPECS-COUNT");

    private static final SubLSymbol $cached_union_all_specs_count_caching_state$ = makeSymbol("*CACHED-UNION-ALL-SPECS-COUNT-CACHING-STATE*");

    private static final SubLSymbol CLEAR_CACHED_UNION_ALL_SPECS_COUNT = makeSymbol("CLEAR-CACHED-UNION-ALL-SPECS-COUNT");

    private static final SubLList $list355 = list(reader_make_constant_shell(makeString("Thing")));



    private static final SubLList $list357 = list(reader_make_constant_shell(makeString("UnderspecifiedCollectionType")), reader_make_constant_shell(makeString("CycKBSubsetCollection")));

    private static final SubLList $list358 = list(reader_make_constant_shell(makeString("WorkflowConstant")), reader_make_constant_shell(makeString("TPTP-PLA001-1-ProblemFORT")), reader_make_constant_shell(makeString("PoorlyOntologized")), reader_make_constant_shell(makeString("StubTerm")), reader_make_constant_shell(makeString("IndeterminateTerm")));

    private static final SubLList $list359 = list(reader_make_constant_shell(makeString("PotentialCBRNEThreat")), reader_make_constant_shell(makeString("Y2KThing")), reader_make_constant_shell(makeString("BPVMilitaryUnit")), reader_make_constant_shell(makeString("BPVEvent")), reader_make_constant_shell(makeString("BPVArtifact")), reader_make_constant_shell(makeString("BPVAgent")), reader_make_constant_shell(makeString("HPKB-TransnationalAgent")));

    private static final SubLSymbol SPEC_CARDINALITY = makeSymbol("SPEC-CARDINALITY");

    private static final SubLString $str361$_5_d__s__ = makeString("~5,d ~s~%");

    private static final SubLString $str362$__Total_coverage___S___ = makeString("~%Total coverage: ~S%~%");

    private static final SubLString $str363$__Optimizing_coverage_via_relativ = makeString("~%Optimizing coverage via relative overlap:~%");

    private static final SubLString $str364$_s___s_unique_spec_p__ = makeString("~s: ~s unique spec~p~%");

    private static final SubLSymbol $sym365$FORBIDDEN_KB_COVERING_COLLECTION_ = makeSymbol("FORBIDDEN-KB-COVERING-COLLECTION?");

    private static final SubLSymbol ALL_SPECS_SET = makeSymbol("ALL-SPECS-SET");

    private static final SubLSymbol FORBIDDEN_KB_COVERING_COLLECTIONS_SET = makeSymbol("FORBIDDEN-KB-COVERING-COLLECTIONS-SET");

    private static final SubLSymbol $forbidden_kb_covering_collections_set_caching_state$ = makeSymbol("*FORBIDDEN-KB-COVERING-COLLECTIONS-SET-CACHING-STATE*");

    private static final SubLSymbol CLEAR_FORBIDDEN_KB_COVERING_COLLECTIONS_SET = makeSymbol("CLEAR-FORBIDDEN-KB-COVERING-COLLECTIONS-SET");

    private static final SubLSymbol $all_specs_set_caching_state$ = makeSymbol("*ALL-SPECS-SET-CACHING-STATE*");

    private static final SubLSymbol CLEAR_ALL_SPECS_SET = makeSymbol("CLEAR-ALL-SPECS-SET");

    private static final SubLSymbol ALL_GENLS_SET = makeSymbol("ALL-GENLS-SET");

    private static final SubLSymbol $all_genls_set_caching_state$ = makeSymbol("*ALL-GENLS-SET-CACHING-STATE*");

    private static final SubLSymbol CLEAR_ALL_GENLS_SET = makeSymbol("CLEAR-ALL-GENLS-SET");

    private static final SubLList $list375 = list(cons(makeString("#<("), makeString("(")), cons(makeString(")>"), makeString(")")));





    private static final SubLSymbol SET_SIZE = makeSymbol("SET-SIZE");

    private static final SubLList $list379 = cons(makeSymbol("COL"), makeSymbol("SET"));





    private static final SubLList $list382 = cons(makeSymbol("PRED"), makeSymbol("SET"));

    private static final SubLList $list383 = list(cons(ONE_INTEGER, reader_make_constant_shell(makeString("UnaryPredicate"))), cons(TWO_INTEGER, reader_make_constant_shell(makeString("BinaryPredicate"))), cons(THREE_INTEGER, reader_make_constant_shell(makeString("TernaryPredicate"))), cons(FOUR_INTEGER, reader_make_constant_shell(makeString("QuaternaryPredicate"))), cons(FIVE_INTEGER, reader_make_constant_shell(makeString("QuintaryPredicate"))));

    private static final SubLString $str384$All_args_of__s_were_open = makeString("All args of ~s were open");

    private static final SubLObject $$BinaryPredicate = reader_make_constant_shell(makeString("BinaryPredicate"));

    private static final SubLSymbol $sym386$DATE_ = makeSymbol("DATE?");

    private static final SubLObject $$Date = reader_make_constant_shell(makeString("Date"));



    private static final SubLList $list389 = list(CHAR_s, CHAR_colon);

    private static final SubLSymbol $sym390$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");



    private static final SubLList $list392 = cons(makeSymbol("START"), makeSymbol("NAME"));

    private static final SubLObject $$oldConstantName = reader_make_constant_shell(makeString("oldConstantName"));

    private static final SubLSymbol VISIT_COASSERTED_FORT = makeSymbol("VISIT-COASSERTED-FORT");

    private static final SubLSymbol CACHED_COMPACT_HL_EXTERNAL_ID_STRING = makeSymbol("CACHED-COMPACT-HL-EXTERNAL-ID-STRING");

    private static final SubLSymbol $cached_compact_hl_external_id_string_caching_state$ = makeSymbol("*CACHED-COMPACT-HL-EXTERNAL-ID-STRING-CACHING-STATE*");

    private static final SubLString $$$_ = makeString(" ");



    private static final SubLString $str399$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $$$Writing_coasserted_forts = makeString("Writing coasserted forts");

    private static final SubLSymbol $sym401$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__ = makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*");

    private static final SubLList $list402 = list(makeSymbol("CSETQ"), makeSymbol("*APPEND-STACK-TRACES-TO-ERROR-MESSAGES?*"), NIL);





    private static final SubLString $str405$_A = makeString("~A");

    private static final SubLObject $$CoreUnionConstant = reader_make_constant_shell(makeString("CoreUnionConstant"));

    private static final SubLObject $$BookkeepingMt = reader_make_constant_shell(makeString("BookkeepingMt"));

    private static final SubLSymbol $sym408$NON_CORE_UNION_CONSTANT_ = makeSymbol("NON-CORE-UNION-CONSTANT?");

    private static final SubLString $$$SpecMt = makeString("SpecMt");



    private static final SubLInteger $int$100000 = makeInteger(100000);

    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));

    private static final SubLString $str413$Unable_to_create_HL_object_evalua = makeString("Unable to create HL object evaluatably: ~S~%");

    private static final SubLString $str414$_ = makeString("'");

    private static final SubLString $str415$_string_to_guid_ = makeString("(string-to-guid ");

    private static final SubLString $str416$_ = makeString(")");

    private static final SubLString $str417$_find_variable_by_id_ = makeString("(find-variable-by-id ");

    private static final SubLSymbol $sym418$IS_TRANSFORMABLE_HL_OBJECT_INT_ = makeSymbol("IS-TRANSFORMABLE-HL-OBJECT-INT?");

    private static final SubLSymbol MAKE_HL_READABLE_INT = makeSymbol("MAKE-HL-READABLE-INT");

    private static final SubLString $$$AAAAAAAAAAAAA = makeString("AAAAAAAAAAAAA");

    private static final SubLString $str421$__find_nart__ = makeString(",(find-nart `");

    private static final SubLString $str422$_AAAAAAAAAAAAAFIND_NART_ = makeString("(AAAAAAAAAAAAAFIND-NART ");

    private static final SubLString $str423$__find_variable_by_id_ = makeString(",(find-variable-by-id ");

    private static final SubLString $str424$_AAAAAAAAAAAAAFIND_VARIABLE_BY_ID = makeString("(AAAAAAAAAAAAAFIND-VARIABLE-BY-ID ");

    private static final SubLString $str425$__string_to_guid_ = makeString(",(string-to-guid ");

    private static final SubLString $str426$_AAAAAAAAAAAAASTRING_TO_GUID_ = makeString("(AAAAAAAAAAAAASTRING-TO-GUID ");

    private static final SubLString $str427$__find_assertion__ = makeString(",(find-assertion `");

    private static final SubLString $str428$_AAAAAAAAAAAAAFIND_ASSERTION_ = makeString("(AAAAAAAAAAAAAFIND-ASSERTION ");

    private static final SubLString $str429$__find_deduction__ = makeString(",(find-deduction `");

    private static final SubLString $str430$_AAAAAAAAAAAAAFIND_DEDUCTION_ = makeString("(AAAAAAAAAAAAAFIND-DEDUCTION ");

    private static final SubLString $str431$__find_kb_hl_support__ = makeString(",(find-kb-hl-support `");

    private static final SubLString $str432$_AAAAAAAAAAAAAFIND_KB_HL_SUPPORT_ = makeString("(AAAAAAAAAAAAAFIND-KB-HL-SUPPORT ");

    private static final SubLString $str433$_ = makeString("`");

    private static final SubLString $str434$_AAAAAAAAAAAAA__ = makeString("(AAAAAAAAAAAAA) ");

    private static final SubLString $str435$_AAAAAAAAAAAAAFIND_VARIABLE_BY_ID = makeString(" AAAAAAAAAAAAAFIND-VARIABLE-BY-ID ");

    private static final SubLString $str436$AAAAAAAAAAAAAFIND_VARIABLE_BY_ID = makeString("AAAAAAAAAAAAAFIND-VARIABLE-BY-ID");

    private static final SubLString $str437$_0_9__ = makeString("[0-9]+");

    private static final SubLList $list438 = cons(makeSymbol("START"), makeSymbol("END"));

    private static final SubLString $str439$_____find_variable_by_id_ = makeString(" . ,(find-variable-by-id ");

    private static final SubLString $str440$Unable_to_create_HL_object_evalua = makeString("Unable to create HL object evaluatably: ~S");

    private static final SubLSymbol AAAAAAAAAAAAAFIND_NART = makeSymbol("AAAAAAAAAAAAAFIND-NART");

    private static final SubLSymbol AAAAAAAAAAAAAFIND_VARIABLE_BY_ID = makeSymbol("AAAAAAAAAAAAAFIND-VARIABLE-BY-ID");

    private static final SubLSymbol AAAAAAAAAAAAASTRING_TO_GUID = makeSymbol("AAAAAAAAAAAAASTRING-TO-GUID");

    private static final SubLSymbol AAAAAAAAAAAAAFIND_ASSERTION = makeSymbol("AAAAAAAAAAAAAFIND-ASSERTION");

    private static final SubLList $list445 = list(makeSymbol("AAAAAAAAAAAAA"));

    private static final SubLSymbol AAAAAAAAAAAAAFIND_DEDUCTION = makeSymbol("AAAAAAAAAAAAAFIND-DEDUCTION");

    private static final SubLSymbol AAAAAAAAAAAAAFIND_KB_HL_SUPPORT = makeSymbol("AAAAAAAAAAAAAFIND-KB-HL-SUPPORT");

    private static final SubLString $str448$Unexpected_situation_ = makeString("Unexpected situation.");

    private static final SubLString $str449$_ = makeString("-");



    private static final SubLList $list451 = cons(makeSymbol("ASENT-TO-BLAST"), makeSymbol("MT"));

    private static final SubLSymbol RANDOMLY_SELECT_CONSTANTS = makeSymbol("RANDOMLY-SELECT-CONSTANTS");

    private static final SubLSymbol FIND_CONSTANT_BY_SUID = makeSymbol("FIND-CONSTANT-BY-SUID");

    private static final SubLSymbol RANDOMLY_SELECT_NARTS = makeSymbol("RANDOMLY-SELECT-NARTS");

    private static final SubLSymbol FIND_NART_BY_ID = makeSymbol("FIND-NART-BY-ID");

    private static final SubLSymbol RANDOMLY_SELECT_ASSERTIONS = makeSymbol("RANDOMLY-SELECT-ASSERTIONS");



    private static final SubLSymbol RANDOMLY_SELECT_DEDUCTIONS = makeSymbol("RANDOMLY-SELECT-DEDUCTIONS");

    private static final SubLSymbol FIND_DEDUCTION_BY_ID = makeSymbol("FIND-DEDUCTION-BY-ID");

    private static final SubLSymbol RANDOMLY_SELECT_KB_HL_SUPPORTS = makeSymbol("RANDOMLY-SELECT-KB-HL-SUPPORTS");

    private static final SubLSymbol FIND_KB_HL_SUPPORT_BY_ID = makeSymbol("FIND-KB-HL-SUPPORT-BY-ID");

    private static final SubLSymbol RANDOMLY_SELECT_CLAUSE_STRUCS = makeSymbol("RANDOMLY-SELECT-CLAUSE-STRUCS");

    private static final SubLSymbol FIND_CLAUSE_STRUC_BY_ID = makeSymbol("FIND-CLAUSE-STRUC-BY-ID");









    private static final SubLSymbol SET_TO_COLLECTION = makeSymbol("SET-TO-COLLECTION");













    private static final SubLList $list475 = list(list(list(list(reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("eventOccursAt")), makeSymbol("?X"), reader_make_constant_shell(makeString("Israel"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("TerroristAttack"))))), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt"))), list(reader_make_constant_shell(makeString("SubcollectionOccursAtFn")), reader_make_constant_shell(makeString("TerroristAttack")), reader_make_constant_shell(makeString("Israel")))), list(list(list(reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("CarBombing"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("TerroristAttack"))))), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt"))), list(reader_make_constant_shell(makeString("CollectionIntersection2Fn")), reader_make_constant_shell(makeString("TerroristAttack")), reader_make_constant_shell(makeString("CarBombing")))), list(list(list(reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?ATTACK"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?NUM"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?ATTACK"), reader_make_constant_shell(makeString("TerroristSuicideBombing-Nuclear"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?ATTACK"), reader_make_constant_shell(makeString("CarBombing"))), list(reader_make_constant_shell(makeString("relationInstanceExistsCount")), reader_make_constant_shell(makeString("organismKilled")), makeSymbol("?ATTACK"), reader_make_constant_shell(makeString("Person")), makeSymbol("?NUM"))))), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt"))), list(reader_make_constant_shell(makeString("CollectionSubsetFn")), list(reader_make_constant_shell(makeString("CollectionIntersection2Fn")), reader_make_constant_shell(makeString("TerroristSuicideBombing-Nuclear")), reader_make_constant_shell(makeString("CarBombing"))), list(reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?ATTACK"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?NUM"), list(reader_make_constant_shell(makeString("relationInstanceExistsCount")), reader_make_constant_shell(makeString("organismKilled")), makeSymbol("?ATTACK"), reader_make_constant_shell(makeString("Person")), makeSymbol("?NUM")))))), list(list(list(reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?EVT"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Dentist"))), list(reader_make_constant_shell(makeString("hasMembers")), reader_make_constant_shell(makeString("TerroristOrganization-Hamas")), makeSymbol("?X")), list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?EVT"), makeSymbol("?X"))))), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt"))), list(reader_make_constant_shell(makeString("CollectionSubsetFn")), reader_make_constant_shell(makeString("Action")), list(reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?EVT"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Dentist"))), list(reader_make_constant_shell(makeString("hasMembers")), reader_make_constant_shell(makeString("TerroristOrganization-Hamas")), makeSymbol("?X")), list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?EVT"), makeSymbol("?X"))))))), list(list(list(reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?EVT"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Dentist"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVT"), reader_make_constant_shell(makeString("TerroristAttack"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVT"), reader_make_constant_shell(makeString("Bombing"))), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?EVT"), reader_make_constant_shell(makeString("KillingPerson"))), list(reader_make_constant_shell(makeString("hasMembers")), reader_make_constant_shell(makeString("TerroristOrganization-Hamas")), makeSymbol("?X")), list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?EVT"), makeSymbol("?X"))))), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt"))), list(reader_make_constant_shell(makeString("CollectionSubsetFn")), list(reader_make_constant_shell(makeString("CollectionIntersectionFn")), list(reader_make_constant_shell(makeString("TheSet")), reader_make_constant_shell(makeString("TerroristAttack")), reader_make_constant_shell(makeString("Bombing")), reader_make_constant_shell(makeString("KillingPerson")))), list(reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?EVT"), list(reader_make_constant_shell(makeString("thereExists")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Dentist"))), list(reader_make_constant_shell(makeString("hasMembers")), reader_make_constant_shell(makeString("TerroristOrganization-Hamas")), makeSymbol("?X")), list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?EVT"), makeSymbol("?X"))))))), list(list(list(reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?X"), reader_make_constant_shell(makeString("GeorgeWBush")))), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt"))), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("Action")), reader_make_constant_shell(makeString("performedBy")), reader_make_constant_shell(makeString("GeorgeWBush")))), list(list(list(reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Fishing"))), list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?X"), reader_make_constant_shell(makeString("GeorgeWBush"))))), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt"))), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("Fishing")), reader_make_constant_shell(makeString("performedBy")), reader_make_constant_shell(makeString("GeorgeWBush")))), list(list(list(reader_make_constant_shell(makeString("TheSetOf")), makeSymbol("?X"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("isa")), makeSymbol("?X"), reader_make_constant_shell(makeString("Event-Localized"))), list(reader_make_constant_shell(makeString("performedBy")), makeSymbol("?X"), reader_make_constant_shell(makeString("GeorgeWBush"))))), reader_make_constant_shell(makeString("TKBSourceSpindleCollectorMt"))), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), list(reader_make_constant_shell(makeString("CollectionIntersection2Fn")), reader_make_constant_shell(makeString("Action")), reader_make_constant_shell(makeString("Event-Localized"))), reader_make_constant_shell(makeString("performedBy")), reader_make_constant_shell(makeString("GeorgeWBush")))));

    private static final SubLSymbol COLLECTION_SUBSUMPTION_PATHS = makeSymbol("COLLECTION-SUBSUMPTION-PATHS");

    private static final SubLSymbol $sym477$SETS_EQUAL_EQUAL_ = makeSymbol("SETS-EQUAL-EQUAL?");

    private static final SubLList $list478 = list(new SubLObject[]{ list(list(list(reader_make_constant_shell(makeString("Thing")))), list(list(reader_make_constant_shell(makeString("Thing"))))), list(list(list(reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("Individual")))), list(list(reader_make_constant_shell(makeString("Individual")), reader_make_constant_shell(makeString("Thing"))))), list(list(list(reader_make_constant_shell(makeString("Individual")), reader_make_constant_shell(makeString("Thing")))), list(list(reader_make_constant_shell(makeString("Individual")), reader_make_constant_shell(makeString("Thing"))))), list(list(list(reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("Individual")), reader_make_constant_shell(makeString("Collection")))), list(list(reader_make_constant_shell(makeString("Collection")), reader_make_constant_shell(makeString("Thing"))), list(reader_make_constant_shell(makeString("Individual")), reader_make_constant_shell(makeString("Thing"))))), list(list(list(reader_make_constant_shell(makeString("Individual")), reader_make_constant_shell(makeString("Collection")))), list(list(reader_make_constant_shell(makeString("Collection"))), list(reader_make_constant_shell(makeString("Individual"))))), list(list(list(reader_make_constant_shell(makeString("Individual")), reader_make_constant_shell(makeString("Collection")), reader_make_constant_shell(makeString("FirstOrderCollection")), reader_make_constant_shell(makeString("Book-CW")))), list(list(reader_make_constant_shell(makeString("FirstOrderCollection")), reader_make_constant_shell(makeString("Collection"))), list(reader_make_constant_shell(makeString("Book-CW")), reader_make_constant_shell(makeString("Individual"))))), list(list(list(reader_make_constant_shell(makeString("Individual")), reader_make_constant_shell(makeString("Collection")), reader_make_constant_shell(makeString("FirstOrderCollection")), reader_make_constant_shell(makeString("Book-CW")), reader_make_constant_shell(makeString("Thing")))), list(list(reader_make_constant_shell(makeString("FirstOrderCollection")), reader_make_constant_shell(makeString("Collection")), reader_make_constant_shell(makeString("Thing"))), list(reader_make_constant_shell(makeString("Book-CW")), reader_make_constant_shell(makeString("Individual")), reader_make_constant_shell(makeString("Thing"))))), list(list(list(reader_make_constant_shell(makeString("AdultMaleHuman")), reader_make_constant_shell(makeString("MaleHuman")), reader_make_constant_shell(makeString("HumanAdult")), reader_make_constant_shell(makeString("HomoSapiens")))), list(list(reader_make_constant_shell(makeString("AdultMaleHuman")), reader_make_constant_shell(makeString("HumanAdult")), reader_make_constant_shell(makeString("HomoSapiens"))), list(reader_make_constant_shell(makeString("AdultMaleHuman")), reader_make_constant_shell(makeString("MaleHuman")), reader_make_constant_shell(makeString("HomoSapiens"))))), list(list(list(reader_make_constant_shell(makeString("Individual")), reader_make_constant_shell(makeString("Collection")), reader_make_constant_shell(makeString("LandTransportationDevice")), reader_make_constant_shell(makeString("Book-CW")))), list(list(reader_make_constant_shell(makeString("Collection"))), list(reader_make_constant_shell(makeString("Book-CW")), reader_make_constant_shell(makeString("Individual"))), list(reader_make_constant_shell(makeString("LandTransportationDevice")), reader_make_constant_shell(makeString("Individual"))))), list(list(list(reader_make_constant_shell(makeString("CycLTerm")), reader_make_constant_shell(makeString("CycLExpression")))), list(list(reader_make_constant_shell(makeString("CycLExpression")), reader_make_constant_shell(makeString("CycLTerm"))))), list(list(list(reader_make_constant_shell(makeString("CycLTerm")), reader_make_constant_shell(makeString("CycLExpression")), reader_make_constant_shell(makeString("Thing")), reader_make_constant_shell(makeString("CycLSentence")))), list(list(reader_make_constant_shell(makeString("CycLSentence")), reader_make_constant_shell(makeString("CycLTerm")), reader_make_constant_shell(makeString("CycLExpression")), reader_make_constant_shell(makeString("Thing"))))) });

    private static final SubLSymbol PREDICATE_SUBSUMPTION_PATHS = makeSymbol("PREDICATE-SUBSUMPTION-PATHS");

    private static final SubLList $list480 = list(list(list(list(reader_make_constant_shell(makeString("actors")), reader_make_constant_shell(makeString("doneBy")), reader_make_constant_shell(makeString("performedBy")), reader_make_constant_shell(makeString("perpetrator")), reader_make_constant_shell(makeString("objectActedOn")))), list(list(reader_make_constant_shell(makeString("objectActedOn")), reader_make_constant_shell(makeString("actors"))), list(reader_make_constant_shell(makeString("perpetrator")), reader_make_constant_shell(makeString("performedBy")), reader_make_constant_shell(makeString("doneBy")), reader_make_constant_shell(makeString("actors"))))));

    public static SubLObject kb_statistics(SubLObject stream, SubLObject verbosity) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (verbosity == UNPROVIDED) {
            verbosity = $VERBOSE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == kb_loaded()) {
            return format(stream, $str1$__No_KB_is_currently_loaded_);
        }
        final SubLObject constant_count = constant_count();
        final SubLObject cached_constant_index_count = constant_index_manager.cached_constant_index_count();
        final SubLObject nart_count = nart_handles.nart_count();
        final SubLObject cached_nart_index_count = nart_index_manager.cached_nart_index_count();
        final SubLObject cached_nart_hl_formula_count = nart_hl_formula_manager.cached_nart_hl_formula_count();
        final SubLObject fort_count = forts.fort_count();
        final SubLObject kb_assertion_count = assertion_handles.assertion_count();
        final SubLObject cached_assertion_count = assertion_manager.cached_assertion_count();
        final SubLObject bookkeeping_assertion_count = bookkeeping_store.bookkeeping_assertion_count();
        SubLObject virtual_assertion_count = ZERO_INTEGER;
        final SubLObject deduction_count = deduction_handles.deduction_count();
        final SubLObject cached_deduction_count = deduction_manager.cached_deduction_count();
        final SubLObject kb_hl_support_count = kb_hl_support_handles.kb_hl_support_count();
        final SubLObject cached_kb_hl_support_count = kb_hl_support_manager.cached_kb_hl_support_count();
        final SubLObject unrepresented_term_count = unrepresented_terms.kb_unrepresented_term_count();
        final SubLObject cached_unrepresented_term_index_count = unrepresented_term_index_manager.cached_unrepresented_term_index_count();
        final SubLObject clause_struc_count = clause_strucs.clause_struc_count();
        SubLObject total_assertion_count = NIL;
        virtual_assertion_count = sksi_removal_module_generation.virtual_assertion_count();
        total_assertion_count = add(kb_assertion_count, bookkeeping_assertion_count, virtual_assertion_count);
        final SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
        try {
            $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
            format(stream, $str3$______KB__A_statistics, operation_communication.kb_version_string());
            format(stream, $str4$__FORTs______________________9___, fort_count);
            format(stream, $str5$___Constants_________________9___, constant_count);
            if ((verbosity == $VERBOSE) && (!constant_count.isZero())) {
                format(stream, $str6$____cached_indexing__________9___, cached_constant_index_count, number_utilities.percent(cached_constant_index_count, constant_count, THREE_INTEGER));
            }
            format(stream, $str7$___NARTs_____________________9___, nart_count);
            if ((verbosity == $VERBOSE) && (!nart_count.isZero())) {
                format(stream, $str6$____cached_indexing__________9___, cached_nart_index_count, number_utilities.percent(cached_nart_index_count, nart_count, THREE_INTEGER));
                format(stream, $str8$____cached_HL_formulas_______9___, cached_nart_hl_formula_count, number_utilities.percent(cached_nart_hl_formula_count, nart_count, THREE_INTEGER));
            }
            format(stream, $str9$__Assertions_________________9___, total_assertion_count);
            format(stream, $str10$___KB_Assertions_____________9___, kb_assertion_count);
            if ((verbosity == $VERBOSE) && (!kb_assertion_count.isZero())) {
                format(stream, $str11$____cached___________________9___, cached_assertion_count, number_utilities.percent(cached_assertion_count, kb_assertion_count, THREE_INTEGER));
            }
            if (!bookkeeping_assertion_count.isZero()) {
                format(stream, $str12$___Bookkeeping_Assertions____9___, bookkeeping_assertion_count);
            }
            if (!virtual_assertion_count.isZero()) {
                format(stream, $str13$___Virtual_Assertions________9___, virtual_assertion_count);
            }
            format(stream, $str14$__Deductions_________________9___, deduction_count);
            if ((verbosity == $VERBOSE) && (!deduction_count.isZero())) {
                format(stream, $str11$____cached___________________9___, cached_deduction_count, number_utilities.percent(cached_deduction_count, deduction_count, THREE_INTEGER));
            }
            format(stream, $str15$__KB_HL_supports_____________9___, kb_hl_support_count);
            if ((verbosity == $VERBOSE) && (!kb_hl_support_count.isZero())) {
                format(stream, $str11$____cached___________________9___, cached_kb_hl_support_count, number_utilities.percent(cached_kb_hl_support_count, kb_hl_support_count, THREE_INTEGER));
            }
            format(stream, $str16$__Unrepresented_terms________9___, unrepresented_term_count);
            if ((verbosity == $VERBOSE) && (!unrepresented_term_count.isZero())) {
                format(stream, $str6$____cached_indexing__________9___, cached_unrepresented_term_index_count, number_utilities.percent(cached_unrepresented_term_index_count, unrepresented_term_count, THREE_INTEGER));
            }
            terpri(stream);
        } finally {
            $read_default_float_format$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject kb_content_statistics(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        format_nil.force_format(stream, $str17$______KB__A_content_statistics, operation_communication.kb_version_string(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format_nil.force_format(stream, $str18$__Terms______________9___D, forts.fort_count(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format_nil.force_format(stream, $str19$___Collections_______9___D, length(fort_types_interface.all_forts_of_type($$Collection)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format_nil.force_format(stream, $str21$____First_Order______9___D, length(isa.all_fort_instances_in_all_mts($$FirstOrderCollection)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format_nil.force_format(stream, $str23$____Second_Order_____9___D, length(isa.all_fort_instances_in_all_mts($$SecondOrderCollection)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format_nil.force_format(stream, $str25$____Third_Order______9___D, length(isa.all_fort_instances_in_all_mts($$ThirdOrderCollection)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format_nil.force_format(stream, $str27$___Relations_________9___D, length(fort_types_interface.all_forts_of_type($$Relation)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format_nil.force_format(stream, $str29$____Functions________9___D, length(fort_types_interface.all_forts_of_type($$Function_Denotational)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format_nil.force_format(stream, $str31$____Predicates_______9___D, length(fort_types_interface.all_forts_of_type($$Predicate)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format_nil.force_format(stream, $str33$___Microtheories_____9___D, length(fort_types_interface.all_forts_of_type($$Microtheory)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format_nil.force_format(stream, $str35$___Individuals_______9___D, length(isa.all_fort_instances_in_all_mts($$Individual)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format_nil.force_format(stream, $str37$__KB_Assertions______9___D, assertion_handles.assertion_count(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject kb_object_memory_commitment_analysis() {
        final SubLObject managers = list(list($CONSTANT, constant_index_manager.$constant_index_manager$.getGlobalValue()), list($NART, nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue()), list($ASSERTION, assertion_manager.$assertion_content_manager$.getGlobalValue()), list($DEDUCTION, deduction_manager.$deduction_content_manager$.getGlobalValue()), list($KB_HL_SUPPORT, kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue()), list($UNPREPRESENTED_TERM, unrepresented_term_index_manager.$unrepresented_term_index_manager$.getGlobalValue()));
        SubLObject tuples = NIL;
        SubLObject cdolist_list_var = managers;
        SubLObject manager_spec = NIL;
        manager_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = manager_spec;
            SubLObject type = NIL;
            SubLObject kbom = NIL;
            destructuring_bind_must_consp(current, datum, $list44);
            type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list44);
            kbom = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject in_memory = kb_object_manager.cached_kb_object_count(kbom);
                final SubLObject swappable = kb_object_manager.swappable_kb_object_count(kbom);
                final SubLObject committed = subtract(in_memory, swappable);
                tuples = cons(list(type, committed, swappable, in_memory), tuples);
            } else {
                cdestructuring_bind_error(datum, $list44);
            }
            cdolist_list_var = cdolist_list_var.rest();
            manager_spec = cdolist_list_var.first();
        } 
        return nreverse(tuples);
    }

    public static SubLObject kb_object_memory_commitment_report(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject kb_object_type_name_map = $list45;
        final SubLObject analysis_tuples = kb_object_memory_commitment_analysis();
        format_nil.force_format(stream, $str46$___18_A____9A____9A____9A, $$$Object_Type, $$$committed, $$$swappable, $str50$in_memory, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format_nil.force_format(stream, $str51$_________________________________, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = analysis_tuples;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject type = NIL;
            SubLObject committed = NIL;
            SubLObject swappable = NIL;
            SubLObject in_memory = NIL;
            destructuring_bind_must_consp(current, datum, $list52);
            type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list52);
            committed = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list52);
            swappable = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list52);
            in_memory = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject name = list_utilities.alist_lookup_without_values(kb_object_type_name_map, type, UNPROVIDED, UNPROVIDED);
                format(stream, $str53$___18_A____9_A____9_A____9_A, new SubLObject[]{ name, committed, swappable, in_memory });
            } else {
                cdestructuring_bind_error(datum, $list52);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject histogram_of_predicate_extent(SubLObject asserted_onlyP, SubLObject excluded_collections) {
        if (asserted_onlyP == UNPROVIDED) {
            asserted_onlyP = T;
        }
        if (excluded_collections == UNPROVIDED) {
            excluded_collections = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject hist = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject list_var = isa.all_fort_instances($$Predicate, UNPROVIDED, UNPROVIDED);
            final SubLObject _prev_bind_0_$1 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str56$Calculating_cardinalities_of_pred, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject pred = NIL;
                    pred = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if (NIL == isa.isa_anyP(pred, excluded_collections, UNPROVIDED, UNPROVIDED)) {
                            SubLObject num = ZERO_INTEGER;
                            if (NIL != asserted_onlyP) {
                                final SubLObject pred_var = pred;
                                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                    final SubLObject str = NIL;
                                    final SubLObject _prev_bind_0_$2 = $progress_start_time$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$3 = $progress_last_pacification_time$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$5 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                                    final SubLObject _prev_bind_3_$6 = $progress_notification_count$.currentBinding(thread);
                                    final SubLObject _prev_bind_4_$7 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                                    final SubLObject _prev_bind_5_$8 = $progress_count$.currentBinding(thread);
                                    final SubLObject _prev_bind_6_$9 = $is_noting_progressP$.currentBinding(thread);
                                    final SubLObject _prev_bind_7_$10 = $silent_progressP$.currentBinding(thread);
                                    try {
                                        $progress_start_time$.bind(get_universal_time(), thread);
                                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                                        $progress_count$.bind(ZERO_INTEGER, thread);
                                        $is_noting_progressP$.bind(T, thread);
                                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                                        noting_progress_preamble(str);
                                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                        SubLObject done_var = NIL;
                                        final SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                            if (NIL != valid) {
                                                note_progress();
                                                SubLObject final_index_iterator = NIL;
                                                try {
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                    SubLObject done_var_$11 = NIL;
                                                    final SubLObject token_var_$12 = NIL;
                                                    while (NIL == done_var_$11) {
                                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$12);
                                                        final SubLObject valid_$13 = makeBoolean(!token_var_$12.eql(ass));
                                                        if ((NIL != valid_$13) && ((NIL == asserted_onlyP) || (NIL != assertions_high.asserted_assertionP(ass)))) {
                                                            num = add(num, ONE_INTEGER);
                                                        }
                                                        done_var_$11 = makeBoolean(NIL == valid_$13);
                                                    } 
                                                } finally {
                                                    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values = getValuesAsVector();
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                        restoreValuesFromVector(_values);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        } 
                                        noting_progress_postamble();
                                    } finally {
                                        $silent_progressP$.rebind(_prev_bind_7_$10, thread);
                                        $is_noting_progressP$.rebind(_prev_bind_6_$9, thread);
                                        $progress_count$.rebind(_prev_bind_5_$8, thread);
                                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_4_$7, thread);
                                        $progress_notification_count$.rebind(_prev_bind_3_$6, thread);
                                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$5, thread);
                                        $progress_last_pacification_time$.rebind(_prev_bind_1_$3, thread);
                                        $progress_start_time$.rebind(_prev_bind_0_$2, thread);
                                    }
                                }
                            } else {
                                num = kb_indexing.num_predicate_extent_index(pred, UNPROVIDED);
                            }
                            if (num.isPositive()) {
                                count = add(count, num);
                                hist = cons(cons(pred, num), hist);
                            }
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        pred = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_1_$2, thread);
                $progress_note$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        hist = Sort.sort(hist, symbol_function($sym59$_), symbol_function(CDR));
        return values(hist, count);
    }

    public static SubLObject mt_assertion_count(final SubLObject mt) {
        if (NIL != kb_indexing.broad_mtP(mt)) {
            return broad_mt_assertion_count(mt);
        }
        return kb_indexing.num_mt_index(mt);
    }

    public static SubLObject broad_mt_assertion_count(final SubLObject broad_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(broad_mt);
        if (pcase_var.eql($MT)) {
            if (NIL != kb_mapping_macros.do_mt_index_key_validator(broad_mt, NIL)) {
                final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(broad_mt);
                SubLObject final_index_iterator = NIL;
                try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(ass));
                        if (NIL != valid) {
                            count = add(count, ONE_INTEGER);
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                } finally {
                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL != final_index_iterator) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        } else
            if (pcase_var.eql($BROAD_MT) && (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(broad_mt, NIL))) {
                final SubLObject idx = assertion_handles.do_assertions_table();
                final SubLObject mess = $str63$do_broad_mt_index;
                final SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble(mess);
                        final SubLObject idx_$16 = idx;
                        if (NIL == id_index_objects_empty_p(idx_$16, $SKIP)) {
                            final SubLObject idx_$17 = idx_$16;
                            if (NIL == id_index_dense_objects_empty_p(idx_$17, $SKIP)) {
                                final SubLObject vector_var = id_index_dense_objects(idx_$17);
                                final SubLObject backwardP_var = NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject a_id;
                                SubLObject a_handle;
                                SubLObject ass2;
                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                    a_handle = aref(vector_var, a_id);
                                    if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(a_handle)) {
                                            a_handle = $SKIP;
                                        }
                                        ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                        if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass2, broad_mt, NIL, NIL)) {
                                            count = add(count, ONE_INTEGER);
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                }
                            }
                            final SubLObject idx_$18 = idx_$16;
                            if ((NIL == id_index_sparse_objects_empty_p(idx_$18)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                final SubLObject sparse = id_index_sparse_objects(idx_$18);
                                SubLObject a_id2 = id_index_sparse_id_threshold(idx_$18);
                                final SubLObject end_id = id_index_next_id(idx_$18);
                                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                while (a_id2.numL(end_id)) {
                                    final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                        final SubLObject ass3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                        if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass3, broad_mt, NIL, NIL)) {
                                            count = add(count, ONE_INTEGER);
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                    a_id2 = add(a_id2, ONE_INTEGER);
                                } 
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_2, thread);
                }
            }

        return count;
    }

    public static SubLObject most_populous_predicates_in_relevant_mts(final SubLObject mt, SubLObject n) {
        if (n == UNPROVIDED) {
            n = TEN_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject node_var = $$Predicate;
            final SubLObject _prev_bind_0_$20 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$21 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$22 = node_var;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$21 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = NIL;
                            final SubLObject _prev_bind_0_$22 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$22 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str72$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str72$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str72$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str77$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str72$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$23 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$23 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$28 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$24 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$24 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$29 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$22, UNPROVIDED);
                                            while (NIL != node_var_$22) {
                                                final SubLObject tt_node_var = node_var_$22;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$25 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$25 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt_$34 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$34)) {
                                                                            final SubLObject _prev_bind_0_$26 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$34, thread);
                                                                                SubLObject iteration_state_$36;
                                                                                for (iteration_state_$36 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$36); iteration_state_$36 = dictionary_contents.do_dictionary_contents_next(iteration_state_$36)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$36);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$27 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject pred;
                                                                                                SubLObject count;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    pred = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, pred)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(pred)) {
                                                                                                            count = kb_indexing.relevant_num_predicate_extent_index(pred);
                                                                                                            if (count.isPositive()) {
                                                                                                                dictionary.dictionary_enter(dict, pred, count);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject pred2 = NIL;
                                                                                                    pred2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(pred2)) {
                                                                                                                final SubLObject count2 = kb_indexing.relevant_num_predicate_extent_index(pred2);
                                                                                                                if (count2.isPositive()) {
                                                                                                                    dictionary.dictionary_enter(dict, pred2, count2);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        pred2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str78$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$27, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$36);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$26, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str79$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                            if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = NIL;
                                                                    SubLObject mt_$35 = NIL;
                                                                    SubLObject tv2 = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list80);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list80);
                                                                    mt_$35 = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list80);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$35)) {
                                                                            final SubLObject _prev_bind_0_$28 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$35, thread);
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = list(link_node);
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject pred;
                                                                                            SubLObject count;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                pred = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, pred)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != forts.fort_p(pred)) {
                                                                                                        count = kb_indexing.relevant_num_predicate_extent_index(pred);
                                                                                                        if (count.isPositive()) {
                                                                                                            dictionary.dictionary_enter(dict, pred, count);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var_$41 = sol;
                                                                                                SubLObject pred2 = NIL;
                                                                                                pred2 = csome_list_var_$41.first();
                                                                                                while (NIL != csome_list_var_$41) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(pred2)) {
                                                                                                            final SubLObject count2 = kb_indexing.relevant_num_predicate_extent_index(pred2);
                                                                                                            if (count2.isPositive()) {
                                                                                                                dictionary.dictionary_enter(dict, pred2, count2);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var_$41 = csome_list_var_$41.rest();
                                                                                                    pred2 = csome_list_var_$41.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str78$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$29, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$28, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list80);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                } 
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$42;
                                                                final SubLObject new_list = cdolist_list_var_$42 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$42.first();
                                                                while (NIL != cdolist_list_var_$42) {
                                                                    final SubLObject _prev_bind_0_$30 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject pred3;
                                                                            SubLObject count3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                pred3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, pred3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (NIL != forts.fort_p(pred3)) {
                                                                                        count3 = kb_indexing.relevant_num_predicate_extent_index(pred3);
                                                                                        if (count3.isPositive()) {
                                                                                            dictionary.dictionary_enter(dict, pred3, count3);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var3 = sol2;
                                                                                SubLObject pred4 = NIL;
                                                                                pred4 = csome_list_var3.first();
                                                                                while (NIL != csome_list_var3) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if (NIL != forts.fort_p(pred4)) {
                                                                                            final SubLObject count4 = kb_indexing.relevant_num_predicate_extent_index(pred4);
                                                                                            if (count4.isPositive()) {
                                                                                                dictionary.dictionary_enter(dict, pred4, count4);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    pred4 = csome_list_var3.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str78$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$30, thread);
                                                                    }
                                                                    cdolist_list_var_$42 = cdolist_list_var_$42.rest();
                                                                    generating_fn = cdolist_list_var_$42.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$25, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$25, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                } 
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                SubLObject module_var2 = NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$31 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$26 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$22);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt_$36 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$36)) {
                                                                            final SubLObject _prev_bind_0_$32 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$36, thread);
                                                                                SubLObject iteration_state_$37;
                                                                                for (iteration_state_$37 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$37); iteration_state_$37 = dictionary_contents.do_dictionary_contents_next(iteration_state_$37)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$37);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$33 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes4;
                                                                                            if (NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol3.isList()) {
                                                                                                    SubLObject csome_list_var4 = sol3;
                                                                                                    SubLObject node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                    while (NIL != csome_list_var4) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var4 = csome_list_var4.rest();
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str78$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$33, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$37);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$32, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str79$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$43;
                                                                final SubLObject new_list2 = cdolist_list_var_$43 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn2 = NIL;
                                                                generating_fn2 = cdolist_list_var_$43.first();
                                                                while (NIL != cdolist_list_var_$43) {
                                                                    final SubLObject _prev_bind_0_$34 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                        final SubLObject sol4;
                                                                        final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                        if (NIL != set.set_p(sol4)) {
                                                                            final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                            SubLObject basis_object4;
                                                                            SubLObject state4;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol4.isList()) {
                                                                                SubLObject csome_list_var5 = sol4;
                                                                                SubLObject node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                                while (NIL != csome_list_var5) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var5 = csome_list_var5.rest();
                                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str78$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$34, thread);
                                                                    }
                                                                    cdolist_list_var_$43 = cdolist_list_var_$43.rest();
                                                                    generating_fn2 = cdolist_list_var_$43.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$26, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$31, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                } 
                                                node_var_$22 = deck.deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$29, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$24, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$24, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str81$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$28, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$23, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$23, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$22, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$22, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$21, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$36 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$21, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$20, thread);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.first_n(n, list_utilities.alist_keys(dictionary_utilities.sort_dictionary_by_values(dict, symbol_function($sym59$_))));
    }

    public static SubLObject most_populous_predicates_in_mts(final SubLObject mts, SubLObject n, SubLObject return_countsP) {
        if (n == UNPROVIDED) {
            n = TEN_INTEGER;
        }
        if (return_countsP == UNPROVIDED) {
            return_countsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
        final SubLObject node_var = $$Predicate;
        final SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
        try {
            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                SubLObject node_var_$54 = node_var;
                final SubLObject deck_type = $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0_$55 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$56 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$57 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str72$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str72$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str72$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str77$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str72$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$57 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$58 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$58 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$59 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$62 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$54, UNPROVIDED);
                                        while (NIL != node_var_$54) {
                                            final SubLObject tt_node_var = node_var_$54;
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$59 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$60 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$60 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$66;
                                                                            for (iteration_state_$66 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$66); iteration_state_$66 = dictionary_contents.do_dictionary_contents_next(iteration_state_$66)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$66);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$61 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject pred;
                                                                                            SubLObject _prev_bind_0_$62;
                                                                                            SubLObject _prev_bind_1_$61;
                                                                                            SubLObject count;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                pred = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, pred)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != forts.fort_p(pred)) {
                                                                                                        _prev_bind_0_$62 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                                                        _prev_bind_1_$61 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                                                                        try {
                                                                                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
                                                                                                            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
                                                                                                            count = kb_indexing.relevant_num_predicate_extent_index(pred);
                                                                                                            if (count.isPositive()) {
                                                                                                                dictionary.dictionary_enter(dict, pred, count);
                                                                                                            }
                                                                                                        } finally {
                                                                                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1_$61, thread);
                                                                                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$62, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject pred2 = NIL;
                                                                                                pred2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(pred2)) {
                                                                                                            final SubLObject _prev_bind_0_$63 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                                                            final SubLObject _prev_bind_1_$62 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                                                                            try {
                                                                                                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
                                                                                                                mt_relevance_macros.$relevant_mts$.bind(mts, thread);
                                                                                                                final SubLObject count2 = kb_indexing.relevant_num_predicate_extent_index(pred2);
                                                                                                                if (count2.isPositive()) {
                                                                                                                    dictionary.dictionary_enter(dict, pred2, count2);
                                                                                                                }
                                                                                                            } finally {
                                                                                                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1_$62, thread);
                                                                                                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$63, thread);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    pred2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str78$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$61, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$66);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$60, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str79$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                        if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                            SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                            SubLObject instance_tuple = NIL;
                                                            instance_tuple = csome_list_var2.first();
                                                            while (NIL != csome_list_var2) {
                                                                SubLObject current;
                                                                final SubLObject datum = current = instance_tuple;
                                                                SubLObject link_node = NIL;
                                                                SubLObject mt2 = NIL;
                                                                SubLObject tv2 = NIL;
                                                                destructuring_bind_must_consp(current, datum, $list80);
                                                                link_node = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list80);
                                                                mt2 = current.first();
                                                                current = current.rest();
                                                                destructuring_bind_must_consp(current, datum, $list80);
                                                                tv2 = current.first();
                                                                current = current.rest();
                                                                if (NIL == current) {
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$64 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                final SubLObject _prev_bind_0_$65 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                    final SubLObject sol;
                                                                                    final SubLObject link_nodes2 = sol = list(link_node);
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject pred;
                                                                                        SubLObject count;
                                                                                        SubLObject _prev_bind_0_$66;
                                                                                        SubLObject _prev_bind_1_$63;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            pred = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, pred)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(pred, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if (NIL != forts.fort_p(pred)) {
                                                                                                    _prev_bind_0_$66 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                                                    _prev_bind_1_$63 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                                                                    try {
                                                                                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
                                                                                                        mt_relevance_macros.$relevant_mts$.bind(mts, thread);
                                                                                                        count = kb_indexing.relevant_num_predicate_extent_index(pred);
                                                                                                        if (count.isPositive()) {
                                                                                                            dictionary.dictionary_enter(dict, pred, count);
                                                                                                        }
                                                                                                    } finally {
                                                                                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1_$63, thread);
                                                                                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$66, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$76 = sol;
                                                                                            SubLObject pred2 = NIL;
                                                                                            pred2 = csome_list_var_$76.first();
                                                                                            while (NIL != csome_list_var_$76) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != forts.fort_p(pred2)) {
                                                                                                        final SubLObject _prev_bind_0_$67 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                                                        final SubLObject _prev_bind_1_$64 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                                                                        try {
                                                                                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
                                                                                                            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
                                                                                                            final SubLObject count2 = kb_indexing.relevant_num_predicate_extent_index(pred2);
                                                                                                            if (count2.isPositive()) {
                                                                                                                dictionary.dictionary_enter(dict, pred2, count2);
                                                                                                            }
                                                                                                        } finally {
                                                                                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1_$64, thread);
                                                                                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$67, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var_$76 = csome_list_var_$76.rest();
                                                                                                pred2 = csome_list_var_$76.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str78$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$65, thread);
                                                                                }
                                                                            }
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$64, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    cdestructuring_bind_error(datum, $list80);
                                                                }
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                instance_tuple = csome_list_var2.first();
                                                            } 
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$79;
                                                            final SubLObject new_list = cdolist_list_var_$79 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$79.first();
                                                            while (NIL != cdolist_list_var_$79) {
                                                                final SubLObject _prev_bind_0_$68 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject pred3;
                                                                        SubLObject _prev_bind_0_$69;
                                                                        SubLObject _prev_bind_1_$65;
                                                                        SubLObject count3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            pred3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, pred3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(pred3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (NIL != forts.fort_p(pred3)) {
                                                                                    _prev_bind_0_$69 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                                    _prev_bind_1_$65 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                                                    try {
                                                                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
                                                                                        mt_relevance_macros.$relevant_mts$.bind(mts, thread);
                                                                                        count3 = kb_indexing.relevant_num_predicate_extent_index(pred3);
                                                                                        if (count3.isPositive()) {
                                                                                            dictionary.dictionary_enter(dict, pred3, count3);
                                                                                        }
                                                                                    } finally {
                                                                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1_$65, thread);
                                                                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$69, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var3 = sol2;
                                                                            SubLObject pred4 = NIL;
                                                                            pred4 = csome_list_var3.first();
                                                                            while (NIL != csome_list_var3) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(pred4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (NIL != forts.fort_p(pred4)) {
                                                                                        final SubLObject _prev_bind_0_$70 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                                                        final SubLObject _prev_bind_1_$66 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                                                        try {
                                                                                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
                                                                                            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
                                                                                            final SubLObject count4 = kb_indexing.relevant_num_predicate_extent_index(pred4);
                                                                                            if (count4.isPositive()) {
                                                                                                dictionary.dictionary_enter(dict, pred4, count4);
                                                                                            }
                                                                                        } finally {
                                                                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_1_$66, thread);
                                                                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$70, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                pred4 = csome_list_var3.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str78$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$68, thread);
                                                                }
                                                                cdolist_list_var_$79 = cdolist_list_var_$79.rest();
                                                                generating_fn = cdolist_list_var_$79.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$60, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$59, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                            SubLObject module_var2 = NIL;
                                            module_var2 = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$71 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$67 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node2 = function_terms.naut_to_nart(node_var_$54);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                        final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link2) {
                                                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links2) {
                                                                SubLObject iteration_state2;
                                                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                        final SubLObject _prev_bind_0_$72 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                            SubLObject iteration_state_$67;
                                                                            for (iteration_state_$67 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$67); iteration_state_$67 = dictionary_contents.do_dictionary_contents_next(iteration_state_$67)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$67);
                                                                                final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$73 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol3 = link_nodes4;
                                                                                        if (NIL != set.set_p(sol3)) {
                                                                                            final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                            SubLObject basis_object3;
                                                                                            SubLObject state3;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (NIL != csome_list_var4) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str78$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$73, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$67);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$72, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str79$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$80;
                                                            final SubLObject new_list2 = cdolist_list_var_$80 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn2 = NIL;
                                                            generating_fn2 = cdolist_list_var_$80.first();
                                                            while (NIL != cdolist_list_var_$80) {
                                                                final SubLObject _prev_bind_0_$74 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                    if (NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol4.isList()) {
                                                                            SubLObject csome_list_var5 = sol4;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                            while (NIL != csome_list_var5) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var5 = csome_list_var5.rest();
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str78$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$74, thread);
                                                                }
                                                                cdolist_list_var_$80 = cdolist_list_var_$80.rest();
                                                                generating_fn2 = cdolist_list_var_$80.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$67, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$71, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var2 = cdolist_list_var2.first();
                                            } 
                                            node_var_$54 = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$62, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$59, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$58, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str81$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$58, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$57, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$57, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$56, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$75 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$75, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$55, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$76 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$76, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
        }
        final SubLObject alist = dictionary_utilities.sort_dictionary_by_values(dict, symbol_function($sym59$_));
        final SubLObject uncut_result = (NIL != return_countsP) ? alist : list_utilities.alist_keys(alist);
        return list_utilities.first_n(n, uncut_result);
    }

    public static SubLObject most_populous_predicates_in_mt(final SubLObject mt, SubLObject n, SubLObject filter_function) {
        if (n == UNPROVIDED) {
            n = TEN_INTEGER;
        }
        if (filter_function == UNPROVIDED) {
            filter_function = NIL;
        }
        final SubLObject contents_breakdown = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
        if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, NIL)) {
            final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
            SubLObject final_index_iterator = NIL;
            try {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(assertion));
                    if ((NIL != valid) && (NIL != assertions_high.gaf_assertionP(assertion))) {
                        final SubLObject pred = assertions_high.gaf_predicate(assertion);
                        dictionary_utilities.dictionary_increment(contents_breakdown, pred, ONE_INTEGER);
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            } finally {
                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL != final_index_iterator) {
                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        }
        if (NIL == filter_function) {
            return list_utilities.first_n(n, list_utilities.alist_keys(dictionary_utilities.sort_dictionary_by_values(contents_breakdown, symbol_function($sym59$_))));
        }
        final SubLObject preds = list_utilities.alist_keys(dictionary_utilities.sort_dictionary_by_values(contents_breakdown, symbol_function($sym59$_)));
        SubLObject count = ZERO_INTEGER;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = preds;
        SubLObject pred2 = NIL;
        pred2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == eval(list(filter_function, pred2))) {
                count = add(count, ONE_INTEGER);
                result = cons(pred2, result);
                if (count.numGE(n)) {
                    return nreverse(result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred2 = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject most_populous_collections_in_mts(final SubLObject mts, SubLObject n, SubLObject return_countsP) {
        if (n == UNPROVIDED) {
            n = TEN_INTEGER;
        }
        if (return_countsP == UNPROVIDED) {
            return_countsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_IN_LIST, thread);
            mt_relevance_macros.$relevant_mts$.bind(mts, thread);
            final SubLObject pred_var = $$isa;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$94 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$95 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                try {
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    $progress_count$.bind(ZERO_INTEGER, thread);
                    $is_noting_progressP$.bind(T, thread);
                    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                    noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$96 = NIL;
                                final SubLObject token_var_$97 = NIL;
                                while (NIL == done_var_$96) {
                                    final SubLObject isa_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$97);
                                    final SubLObject valid_$98 = makeBoolean(!token_var_$97.eql(isa_gaf));
                                    if (NIL != valid_$98) {
                                        final SubLObject col = assertions_high.gaf_arg2(isa_gaf);
                                        dictionary_utilities.dictionary_increment(dict, col, UNPROVIDED);
                                    }
                                    done_var_$96 = makeBoolean(NIL == valid_$98);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$95 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$95, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$95, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$94, thread);
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        final SubLObject alist = dictionary_utilities.sort_dictionary_by_values(dict, symbol_function($sym59$_));
        final SubLObject uncut_result = (NIL != return_countsP) ? alist : list_utilities.alist_keys(alist);
        return list_utilities.first_n(n, uncut_result);
    }

    public static SubLObject setup_kb_shelf(final SubLObject size, final SubLObject key, final SubLObject minor_limit, final SubLObject major_limit) {
        final SubLObject info = shelfs.make_shelf_info(UNPROVIDED);
        shelfs._csetf_shelf_info_key(info, key);
        shelfs._csetf_shelf_info_test(info, symbol_function($sym84$_));
        shelfs._csetf_shelf_info_compare(info, symbol_function($sym85$_));
        shelfs._csetf_shelf_info_minor_limit(info, minor_limit);
        shelfs._csetf_shelf_info_major_limit(info, major_limit);
        return shelfs.allocate_shelf(size, info);
    }

    public static SubLObject estimated_assertions_per_constant() {
        return $estimated_assertions_per_constant$.getGlobalValue();
    }

    public static SubLObject estimated_constants_per_nart() {
        return $estimated_constants_per_nart$.getGlobalValue();
    }

    public static SubLObject estimated_assertions_per_deduction() {
        return $estimated_assertions_per_deduction$.getGlobalValue();
    }

    public static SubLObject estimated_assertions_per_clause_struc() {
        return $estimated_assertions_per_clause_struc$.getGlobalValue();
    }

    public static SubLObject estimated_assertions_per_meta_assertion() {
        return $estimated_assertions_per_meta_assertion$.getGlobalValue();
    }

    public static SubLObject estimated_arguments_per_assertion() {
        return $estimated_arguments_per_assertion$.getGlobalValue();
    }

    public static SubLObject estimated_assertions_per_unrepresented_term() {
        return $estimated_assertions_per_unrepresented_term$.getGlobalValue();
    }

    public static SubLObject estimated_deductions_per_hl_support() {
        return $estimated_deductions_per_hl_support$.getGlobalValue();
    }

    public static SubLObject estimated_assertions_per_hl_support() {
        return multiply(estimated_assertions_per_deduction(), estimated_deductions_per_hl_support());
    }

    public static SubLObject setup_kb_tables(final SubLObject constant_count) {
        final SubLObject nart_count = truncate(divide(constant_count, $estimated_constants_per_nart$.getGlobalValue()), UNPROVIDED);
        final SubLObject assertion_count = truncate(multiply(constant_count, $estimated_assertions_per_constant$.getGlobalValue()), UNPROVIDED);
        final SubLObject deduction_count = truncate(divide(assertion_count, $estimated_assertions_per_deduction$.getGlobalValue()), UNPROVIDED);
        final SubLObject kb_hl_support_count = truncate(divide(deduction_count, $estimated_deductions_per_hl_support$.getGlobalValue()), UNPROVIDED);
        final SubLObject clause_struc_count = truncate(divide(assertion_count, $estimated_assertions_per_clause_struc$.getGlobalValue()), UNPROVIDED);
        final SubLObject unrepresented_term_count = truncate(divide(assertion_count, $estimated_assertions_per_unrepresented_term$.getGlobalValue()), UNPROVIDED);
        return setup_kb_tables_int(NIL, constant_count, nart_count, assertion_count, deduction_count, kb_hl_support_count, clause_struc_count, unrepresented_term_count);
    }

    public static SubLObject setup_kb_tables_int(final SubLObject exactP, SubLObject constant_count, SubLObject nart_count, SubLObject assertion_count, SubLObject deduction_count, SubLObject kb_hl_support_count, SubLObject clause_struc_count, SubLObject kb_unrepresented_term_count) {
        if (kb_unrepresented_term_count == UNPROVIDED) {
            kb_unrepresented_term_count = NIL;
        }
        if (NIL == kb_unrepresented_term_count) {
            kb_unrepresented_term_count = truncate(divide(assertion_count, $estimated_assertions_per_unrepresented_term$.getGlobalValue()), UNPROVIDED);
        }
        constant_count = ceiling(multiply(constant_count, $kb_table_padding_multiplier$.getGlobalValue()), UNPROVIDED);
        nart_count = ceiling(multiply(nart_count, $kb_table_padding_multiplier$.getGlobalValue()), UNPROVIDED);
        assertion_count = ceiling(multiply(assertion_count, $kb_table_padding_multiplier$.getGlobalValue()), UNPROVIDED);
        deduction_count = ceiling(multiply(deduction_count, $kb_table_padding_multiplier$.getGlobalValue()), UNPROVIDED);
        kb_hl_support_count = ceiling(multiply(kb_hl_support_count, $kb_table_padding_multiplier$.getGlobalValue()), UNPROVIDED);
        clause_struc_count = ceiling(multiply(clause_struc_count, $kb_table_padding_multiplier$.getGlobalValue()), UNPROVIDED);
        kb_unrepresented_term_count = ceiling(multiply(kb_unrepresented_term_count, $kb_table_padding_multiplier$.getGlobalValue()), UNPROVIDED);
        setup_kb_fort_tables(constant_count, nart_count, exactP);
        setup_kb_assertion_tables(assertion_count, exactP);
        setup_kb_deduction_tables(deduction_count, exactP);
        setup_kb_hl_support_tables(kb_hl_support_count, exactP);
        clause_strucs.setup_clause_struc_table(clause_struc_count, exactP);
        unrepresented_terms.setup_unrepresented_term_table(kb_unrepresented_term_count, exactP);
        variables.setup_variable_table();
        setup_indexing_tables(constant_count);
        assertions_low.setup_rule_set(assertion_count);
        cardinality_estimates.setup_cardinality_tables(constant_count);
        return constant_count;
    }

    public static SubLObject resize_all_kb_object_manager_lru_caches() {
        constant_index_manager.resize_constant_index_kbom_lru(UNPROVIDED, UNPROVIDED);
        nart_index_manager.resize_nart_index_kbom_lru(UNPROVIDED, UNPROVIDED);
        nart_hl_formula_manager.resize_nart_hl_formula_kbom_lru(UNPROVIDED, UNPROVIDED);
        assertion_manager.resize_assertion_content_kbom_lru(UNPROVIDED, UNPROVIDED);
        kb_hl_support_manager.resize_kb_hl_support_content_kbom_lru(UNPROVIDED, UNPROVIDED);
        deduction_manager.resize_deduction_content_kbom_lru(UNPROVIDED, UNPROVIDED);
        unrepresented_term_index_manager.resize_unrepresented_term_index_kbom_lru(UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject resize_kb_object_manager_lru_caches_for_rebuild() {
        constant_index_manager.resize_constant_index_kbom_lru(ONE_INTEGER, $int$1000);
        nart_index_manager.resize_nart_index_kbom_lru(ONE_INTEGER, $int$1000);
        nart_hl_formula_manager.resize_nart_hl_formula_kbom_lru(ONE_INTEGER, $int$1000);
        assertion_manager.resize_assertion_content_kbom_lru(ONE_INTEGER, $int$1000);
        kb_hl_support_manager.resize_kb_hl_support_content_kbom_lru(ONE_INTEGER, $int$1000);
        deduction_manager.resize_deduction_content_kbom_lru(ONE_INTEGER, $int$1000);
        unrepresented_term_index_manager.resize_unrepresented_term_index_kbom_lru(ONE_INTEGER, $int$1000);
        return NIL;
    }

    public static SubLObject setup_kb_fort_tables(final SubLObject constant_count, final SubLObject nart_count, final SubLObject exactP) {
        setup_constant_tables(constant_count, exactP);
        nart_handles.setup_nart_table(nart_count, exactP);
        nart_hl_formula_manager.setup_nart_hl_formula_table(nart_count, exactP);
        nart_index_manager.setup_nart_index_table(nart_count, exactP);
        return NIL;
    }

    public static SubLObject setup_kb_assertion_tables(final SubLObject assertion_table_size, final SubLObject exactP) {
        assertion_handles.setup_assertion_table(assertion_table_size, exactP);
        assertion_manager.setup_assertion_content_table(assertion_table_size, exactP);
        return NIL;
    }

    public static SubLObject setup_kb_deduction_tables(final SubLObject deduction_table_size, final SubLObject exactP) {
        deduction_handles.setup_deduction_table(deduction_table_size, exactP);
        deduction_manager.setup_deduction_content_table(deduction_table_size, exactP);
        return NIL;
    }

    public static SubLObject setup_kb_hl_support_tables(final SubLObject size, final SubLObject exactP) {
        kb_hl_support_handles.setup_kb_hl_support_id_tables(size, exactP);
        kb_hl_support_handles.setup_kb_hl_support_index_table();
        return NIL;
    }

    public static SubLObject finalize_kb_tables() {
        finalize_kb_fort_tables();
        assertion_handles.finalize_assertions(UNPROVIDED);
        deduction_handles.finalize_deductions(UNPROVIDED);
        kb_hl_support_handles.finalize_kb_hl_supports(UNPROVIDED);
        clause_strucs.finalize_clause_strucs(UNPROVIDED);
        return NIL;
    }

    public static SubLObject finalize_kb_fort_tables() {
        finalize_constants(UNPROVIDED);
        nart_handles.finalize_narts(UNPROVIDED);
        return NIL;
    }

    public static SubLObject clear_kb_state(SubLObject constant_count) {
        if (constant_count == UNPROVIDED) {
            constant_count = $default_estimated_constant_count$.getDynamicValue();
        }
        setup_kb_tables(constant_count);
        return clear_kb_state_int();
    }

    public static SubLObject clear_kb_state_int() {
        clause_strucs.free_all_clause_strucs();
        kb_hl_support_handles.free_all_kb_hl_support();
        deduction_handles.free_all_deductions();
        assertion_handles.free_all_assertions();
        nart_handles.free_all_narts();
        free_all_constants();
        constant_completion_high.map_constants_in_completions(symbol_function(INIT_CONSTANT));
        unrepresented_terms.clear_unrepresented_term_table();
        bookkeeping_store.clear_bookkeeping_binary_gaf_store();
        clear_kb_state_hashes();
        return NIL;
    }

    public static SubLObject clear_kb_fort_state(SubLObject constant_count) {
        if (constant_count == UNPROVIDED) {
            constant_count = $default_estimated_constant_count$.getDynamicValue();
        }
        final SubLObject nart_count = truncate(divide(constant_count, $estimated_constants_per_nart$.getGlobalValue()), UNPROVIDED);
        setup_kb_fort_tables(constant_count, nart_count, NIL);
        nart_handles.free_all_narts();
        free_all_constants();
        constant_completion_high.map_constants_in_completions(symbol_function(INIT_CONSTANT));
        return NIL;
    }

    public static SubLObject possibly_clear_dumpable_kb_state_hashes() {
        if (NIL != defns.defns_cache_unbuiltP()) {
            defns.clear_defns_cache();
        }
        if (NIL != somewhere_cache.somewhere_cache_unbuiltP()) {
            somewhere_cache.clear_all_somewhere_caches();
        }
        return NIL;
    }

    public static SubLObject possibly_initialize_dumpable_kb_state_hashes() {
        if (NIL != nart_hl_formula_manager.nart_hl_formulas_unbuiltP()) {
            narts_interface.initialize_nart_hl_formulas();
        }
        if (NIL != sbhl_link_methods.non_fort_isa_tables_unbuiltP()) {
            sbhl_link_methods.rebuild_non_fort_isa_tables();
        }
        if (NIL != tva_cache.tva_cache_unbuiltP()) {
            tva_cache.rebuild_tva_cache();
        }
        if (NIL != defns.defns_cache_unbuiltP()) {
            defns.rebuild_defns_cache();
        }
        if (NIL != somewhere_cache.somewhere_cache_unbuiltP()) {
            somewhere_cache.rebuild_somewhere_cache();
        }
        if (NIL != arity.arity_cache_unbuiltP()) {
            arity.rebuild_arity_cache();
        }
        return NIL;
    }

    public static SubLObject clear_kb_state_hashes() {
        possibly_clear_dumpable_kb_state_hashes();
        after_adding.clear_after_addings();
        after_adding.clear_after_removings();
        equality_store.clear_some_equality_assertions_somewhere_set();
        at_utilities.clear_all_arg_type_predicate_caches();
        return NIL;
    }

    public static SubLObject initialize_kb_state_hashes() {
        possibly_initialize_dumpable_kb_state_hashes();
        after_adding.rebuild_after_adding_caches();
        equality_store.initialize_some_equality_assertions_somewhere_set();
        at_utilities.initialize_all_arg_type_predicate_caches();
        return NIL;
    }

    public static SubLObject swap_out_all_pristine_kb_objects() {
        assertion_manager.swap_out_all_pristine_assertions();
        deduction_manager.swap_out_all_pristine_deductions();
        constant_index_manager.swap_out_all_pristine_constant_indices();
        nart_index_manager.swap_out_all_pristine_nart_indices();
        nart_hl_formula_manager.swap_out_all_pristine_nart_hl_formulas();
        unrepresented_term_index_manager.swap_out_all_pristine_unrepresented_term_indices();
        kb_hl_support_manager.swap_out_all_pristine_kb_hl_supports();
        sbhl_graphs.swap_out_all_pristine_sbhl_module_graph_links();
        return NIL;
    }

    public static SubLObject show_new_kb_state(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject new_constant_count = new_constant_count();
        final SubLObject new_nart_count = nart_handles.new_nart_count();
        final SubLObject new_assertion_count = assertion_handles.new_assertion_count();
        final SubLObject new_deduction_count = deduction_handles.new_deduction_count();
        final SubLObject new_kb_hl_support_count = kb_hl_support_handles.new_kb_hl_support_count();
        final SubLObject new_unrepresented_term_count = unrepresented_terms.new_unrepresented_term_count();
        final SubLObject new_clause_struc_count = clause_strucs.new_clause_struc_count();
        format(stream, $str98$______KB__S_new_KB_objects__, kb_loaded());
        format(stream, $str99$__New_FORTs__________________9___, add(new_constant_count, new_nart_count));
        format(stream, $str100$___New_Constants_____________9___, new_constant_count);
        format(stream, $str101$___New_NARTs_________________9___, new_nart_count);
        format(stream, $str102$__New_Assertions_____________9___, new_assertion_count);
        format(stream, $str103$__New_Deductions_____________9___, new_deduction_count);
        format(stream, $str104$__New_KB_HL_Supports_________9___, new_kb_hl_support_count);
        format(stream, $str105$__New_Unrepresented_Terms____9___, new_unrepresented_term_count);
        return NIL;
    }

    public static SubLObject clear_new_kb_state() {
        SubLObject start = new_constant_suid_threshold();
        SubLObject table_var = do_constants_table();
        SubLObject end_var;
        SubLObject end;
        SubLObject id;
        SubLObject constant;
        for (end = end_var = id_index_next_id(table_var), id = NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            constant = id_index_lookup(table_var, id, UNPROVIDED);
            if (NIL != constant) {
                constants_high.remove_constant(constant);
            }
        }
        start = nart_handles.new_nart_id_threshold();
        table_var = nart_handles.do_narts_table();
        SubLObject nart;
        for (end = end_var = id_index_next_id(table_var), id = NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            nart = id_index_lookup(table_var, id, UNPROVIDED);
            if (NIL != nart) {
                narts_high.remove_nart(nart);
            }
        }
        final SubLObject table_var2 = kb_hl_support_handles.do_kb_hl_supports_table();
        final SubLObject first_id_var = kb_hl_support_handles.new_kb_hl_support_id_threshold();
        SubLObject kb_hl_support;
        for (end = end_var = id_index_next_id(table_var2), id = NIL, id = first_id_var; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            kb_hl_support = id_index_lookup(table_var2, id, UNPROVIDED);
            if (NIL != kb_hl_support) {
                kb_hl_supports_high.tms_remove_kb_hl_support(kb_hl_support);
            }
        }
        start = assertion_handles.get_file_backed_assertion_internal_id_threshold();
        table_var = assertion_handles.do_assertions_table();
        SubLObject assertion;
        for (end = end_var = id_index_next_id(table_var), id = NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            assertion = id_index_lookup(table_var, id, UNPROVIDED);
            if (NIL != assertion) {
                tms.tms_remove_assertion(assertion);
            }
        }
        start = deduction_handles.get_file_backed_deduction_internal_id_threshold();
        table_var = deduction_handles.do_deductions_table();
        SubLObject deduction;
        for (end = end_var = id_index_next_id(table_var), id = NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            deduction = id_index_lookup(table_var, id, UNPROVIDED);
            if (NIL != deduction) {
                tms.tms_remove_deduction(deduction);
            }
        }
        return NIL;
    }

    public static SubLObject show_new_kb_content(SubLObject n, SubLObject types, SubLObject stream) {
        if (n == UNPROVIDED) {
            n = FIVE_INTEGER;
        }
        if (types == UNPROVIDED) {
            types = $list108;
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(T, thread);
            if (NIL != list_utilities.member_eqP($CONSTANT, types)) {
                format(stream, $str109$__Recent_constants___);
                if (NIL != subl_promotions.positive_integer_p(n)) {
                    final SubLObject list_var = constants_high.constants_around(next_constant_suid(), n, n, UNPROVIDED);
                    final SubLObject _prev_bind_0_$100 = $progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $progress_note$.bind($$$mapping_constants_for_sweep, thread);
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_total$.bind(length(list_var), thread);
                        $progress_sofar$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject o = NIL;
                            o = csome_list_var.first();
                            while (NIL != csome_list_var) {
                                format(stream, $str111$_____S__, o);
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                o = csome_list_var.first();
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$101 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$101, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        $progress_sofar$.rebind(_prev_bind_4, thread);
                        $progress_total$.rebind(_prev_bind_3, thread);
                        $progress_start_time$.rebind(_prev_bind_2, thread);
                        $progress_note$.rebind(_prev_bind_0_$100, thread);
                    }
                } else {
                    final SubLObject idx = do_constants_table();
                    final SubLObject mess = $$$mapping_constants_for_sweep;
                    final SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                    final SubLObject _prev_bind_0_$102 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble(mess);
                            final SubLObject idx_$103 = idx;
                            if (NIL == id_index_objects_empty_p(idx_$103, $SKIP)) {
                                final SubLObject idx_$104 = idx_$103;
                                if (NIL == id_index_dense_objects_empty_p(idx_$104, $SKIP)) {
                                    final SubLObject vector_var = id_index_dense_objects(idx_$104);
                                    final SubLObject backwardP_var = NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject id;
                                    SubLObject o2;
                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                        o2 = aref(vector_var, id);
                                        if ((NIL == id_index_tombstone_p(o2)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                            if (NIL != id_index_tombstone_p(o2)) {
                                                o2 = $SKIP;
                                            }
                                            format(stream, $str111$_____S__, o2);
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$105 = idx_$103;
                                if ((NIL == id_index_sparse_objects_empty_p(idx_$105)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    final SubLObject sparse = id_index_sparse_objects(idx_$105);
                                    SubLObject id2 = id_index_sparse_id_threshold(idx_$105);
                                    final SubLObject end_id = id_index_next_id(idx_$105);
                                    final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                    while (id2.numL(end_id)) {
                                        final SubLObject o3 = gethash_without_values(id2, sparse, v_default);
                                        if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(o3))) {
                                            format(stream, $str111$_____S__, o3);
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                        id2 = add(id2, ONE_INTEGER);
                                    } 
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$103 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$103, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_11, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_10, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_9, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0_$102, thread);
                    }
                }
            }
            if (NIL != list_utilities.member_eqP($NART, types)) {
                format(stream, $str112$__Recent_NARTs___);
                if (NIL != subl_promotions.positive_integer_p(n)) {
                    final SubLObject list_var = narts_high.narts_around(nart_handles.next_nart_id(), n, n, UNPROVIDED);
                    final SubLObject _prev_bind_0_$104 = $progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $progress_note$.bind($$$mapping_narts_for_sweep, thread);
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_total$.bind(length(list_var), thread);
                        $progress_sofar$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject o = NIL;
                            o = csome_list_var.first();
                            while (NIL != csome_list_var) {
                                format(stream, $str111$_____S__, narts_high.nart_el_formula(o));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                o = csome_list_var.first();
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$105 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$105, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        $progress_sofar$.rebind(_prev_bind_4, thread);
                        $progress_total$.rebind(_prev_bind_3, thread);
                        $progress_start_time$.rebind(_prev_bind_2, thread);
                        $progress_note$.rebind(_prev_bind_0_$104, thread);
                    }
                } else {
                    final SubLObject idx = nart_handles.do_narts_table();
                    final SubLObject mess = $$$mapping_narts_for_sweep;
                    final SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                    final SubLObject _prev_bind_0_$106 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble(mess);
                            final SubLObject idx_$106 = idx;
                            if (NIL == id_index_objects_empty_p(idx_$106, $SKIP)) {
                                final SubLObject idx_$107 = idx_$106;
                                if (NIL == id_index_dense_objects_empty_p(idx_$107, $SKIP)) {
                                    final SubLObject vector_var = id_index_dense_objects(idx_$107);
                                    final SubLObject backwardP_var = NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject id;
                                    SubLObject o2;
                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                        o2 = aref(vector_var, id);
                                        if ((NIL == id_index_tombstone_p(o2)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                            if (NIL != id_index_tombstone_p(o2)) {
                                                o2 = $SKIP;
                                            }
                                            format(stream, $str111$_____S__, narts_high.nart_el_formula(o2));
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$108 = idx_$106;
                                if ((NIL == id_index_sparse_objects_empty_p(idx_$108)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    final SubLObject sparse = id_index_sparse_objects(idx_$108);
                                    SubLObject id2 = id_index_sparse_id_threshold(idx_$108);
                                    final SubLObject end_id = id_index_next_id(idx_$108);
                                    final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                    while (id2.numL(end_id)) {
                                        final SubLObject o3 = gethash_without_values(id2, sparse, v_default);
                                        if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(o3))) {
                                            format(stream, $str111$_____S__, narts_high.nart_el_formula(o3));
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                        id2 = add(id2, ONE_INTEGER);
                                    } 
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$107 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values4 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values4);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$107, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_11, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_10, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_9, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0_$106, thread);
                    }
                }
            }
            if (NIL != list_utilities.member_eqP($ASSERTION, types)) {
                format(stream, $str114$__Recent_assertions___);
                if (NIL != subl_promotions.positive_integer_p(n)) {
                    final SubLObject list_var = assertions_high.assertions_around(assertion_handles.next_assertion_id(), n, n, UNPROVIDED);
                    final SubLObject _prev_bind_0_$108 = $progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $progress_note$.bind($$$mapping_assertions_for_sweep, thread);
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_total$.bind(length(list_var), thread);
                        $progress_sofar$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject o = NIL;
                            o = csome_list_var.first();
                            while (NIL != csome_list_var) {
                                format(stream, $str111$_____S__, uncanonicalizer.assertion_el_ist_formula(o));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                o = csome_list_var.first();
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$109 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values5 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values5);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$109, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        $progress_sofar$.rebind(_prev_bind_4, thread);
                        $progress_total$.rebind(_prev_bind_3, thread);
                        $progress_start_time$.rebind(_prev_bind_2, thread);
                        $progress_note$.rebind(_prev_bind_0_$108, thread);
                    }
                } else {
                    final SubLObject idx = assertion_handles.do_assertions_table();
                    final SubLObject mess = $$$mapping_assertions_for_sweep;
                    final SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                    final SubLObject _prev_bind_0_$110 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble(mess);
                            final SubLObject idx_$109 = idx;
                            if (NIL == id_index_objects_empty_p(idx_$109, $SKIP)) {
                                final SubLObject idx_$110 = idx_$109;
                                if (NIL == id_index_dense_objects_empty_p(idx_$110, $SKIP)) {
                                    final SubLObject vector_var = id_index_dense_objects(idx_$110);
                                    final SubLObject backwardP_var = NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject a_id;
                                    SubLObject a_handle;
                                    SubLObject o4;
                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                        a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                        a_handle = aref(vector_var, a_id);
                                        if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                            if (NIL != id_index_tombstone_p(a_handle)) {
                                                a_handle = $SKIP;
                                            }
                                            o4 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                            format(stream, $str111$_____S__, uncanonicalizer.assertion_el_ist_formula(o4));
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$111 = idx_$109;
                                if ((NIL == id_index_sparse_objects_empty_p(idx_$111)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    final SubLObject sparse = id_index_sparse_objects(idx_$111);
                                    SubLObject a_id2 = id_index_sparse_id_threshold(idx_$111);
                                    final SubLObject end_id = id_index_next_id(idx_$111);
                                    final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                    while (a_id2.numL(end_id)) {
                                        final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                        if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                            final SubLObject o2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                            format(stream, $str111$_____S__, uncanonicalizer.assertion_el_ist_formula(o2));
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                        a_id2 = add(a_id2, ONE_INTEGER);
                                    } 
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$111 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values6 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values6);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$111, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_11, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_10, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_9, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0_$110, thread);
                    }
                }
            }
            if (NIL != list_utilities.member_eqP($DEDUCTION, types)) {
                format(stream, $str116$__Recent_deductions___);
                if (NIL != subl_promotions.positive_integer_p(n)) {
                    final SubLObject list_var = deductions_high.deductions_around(deduction_handles.next_deduction_id(), n, n, UNPROVIDED);
                    final SubLObject _prev_bind_0_$112 = $progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $progress_note$.bind($$$mapping_deductions_for_sweep, thread);
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_total$.bind(length(list_var), thread);
                        $progress_sofar$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject o = NIL;
                            o = csome_list_var.first();
                            while (NIL != csome_list_var) {
                                format(stream, $str111$_____S__, o);
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                o = csome_list_var.first();
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$113 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values7 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values7);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$113, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        $progress_sofar$.rebind(_prev_bind_4, thread);
                        $progress_total$.rebind(_prev_bind_3, thread);
                        $progress_start_time$.rebind(_prev_bind_2, thread);
                        $progress_note$.rebind(_prev_bind_0_$112, thread);
                    }
                } else {
                    final SubLObject idx = deduction_handles.do_deductions_table();
                    final SubLObject mess = $$$mapping_deductions_for_sweep;
                    final SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                    final SubLObject _prev_bind_0_$114 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble(mess);
                            final SubLObject idx_$112 = idx;
                            if (NIL == id_index_objects_empty_p(idx_$112, $SKIP)) {
                                final SubLObject idx_$113 = idx_$112;
                                if (NIL == id_index_dense_objects_empty_p(idx_$113, $SKIP)) {
                                    final SubLObject vector_var = id_index_dense_objects(idx_$113);
                                    final SubLObject backwardP_var = NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject o4;
                                    SubLObject d_id;
                                    SubLObject d_handle;
                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                        d_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                        d_handle = aref(vector_var, d_id);
                                        if ((NIL == id_index_tombstone_p(d_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                            if (NIL != id_index_tombstone_p(d_handle)) {
                                                d_handle = $SKIP;
                                            }
                                            o4 = deduction_handles.resolve_deduction_id_value_pair(d_id, d_handle);
                                            format(stream, $str111$_____S__, o4);
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$114 = idx_$112;
                                if ((NIL == id_index_sparse_objects_empty_p(idx_$114)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    final SubLObject sparse = id_index_sparse_objects(idx_$114);
                                    SubLObject d_id2 = id_index_sparse_id_threshold(idx_$114);
                                    final SubLObject end_id = id_index_next_id(idx_$114);
                                    final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                    while (d_id2.numL(end_id)) {
                                        final SubLObject d_handle2 = gethash_without_values(d_id2, sparse, v_default);
                                        if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(d_handle2))) {
                                            final SubLObject o2 = deduction_handles.resolve_deduction_id_value_pair(d_id2, d_handle2);
                                            format(stream, $str111$_____S__, o2);
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                        d_id2 = add(d_id2, ONE_INTEGER);
                                    } 
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$115 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values8 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values8);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$115, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_11, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_10, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_9, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0_$114, thread);
                    }
                }
            }
            if (NIL != list_utilities.member_eqP($KB_HL_SUPPORTS, types)) {
                format(stream, $str119$__Recent_KB_HL_supports___);
                if (NIL != subl_promotions.positive_integer_p(n)) {
                    final SubLObject list_var = kb_hl_supports_high.kb_hl_supports_around(kb_hl_support_handles.next_kb_hl_support_id(), n, n, UNPROVIDED);
                    final SubLObject _prev_bind_0_$116 = $progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $progress_note$.bind($str120$mapping_kb_hl_supports_for_sweep, thread);
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_total$.bind(length(list_var), thread);
                        $progress_sofar$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject o = NIL;
                            o = csome_list_var.first();
                            while (NIL != csome_list_var) {
                                format(stream, $str111$_____S__, sefify(o));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                o = csome_list_var.first();
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$117 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values9 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values9);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$117, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        $progress_sofar$.rebind(_prev_bind_4, thread);
                        $progress_total$.rebind(_prev_bind_3, thread);
                        $progress_start_time$.rebind(_prev_bind_2, thread);
                        $progress_note$.rebind(_prev_bind_0_$116, thread);
                    }
                } else {
                    final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
                    final SubLObject mess = $str120$mapping_kb_hl_supports_for_sweep;
                    final SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                    final SubLObject _prev_bind_0_$118 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble(mess);
                            final SubLObject idx_$115 = idx;
                            if (NIL == id_index_objects_empty_p(idx_$115, $SKIP)) {
                                final SubLObject idx_$116 = idx_$115;
                                if (NIL == id_index_dense_objects_empty_p(idx_$116, $SKIP)) {
                                    final SubLObject vector_var = id_index_dense_objects(idx_$116);
                                    final SubLObject backwardP_var = NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject o4;
                                    SubLObject s_id;
                                    SubLObject s_handle;
                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                        s_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                        s_handle = aref(vector_var, s_id);
                                        if ((NIL == id_index_tombstone_p(s_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                            if (NIL != id_index_tombstone_p(s_handle)) {
                                                s_handle = $SKIP;
                                            }
                                            o4 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                            format(stream, $str111$_____S__, sefify(o4));
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$117 = idx_$115;
                                if ((NIL == id_index_sparse_objects_empty_p(idx_$117)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    final SubLObject sparse = id_index_sparse_objects(idx_$117);
                                    SubLObject s_id2 = id_index_sparse_id_threshold(idx_$117);
                                    final SubLObject end_id = id_index_next_id(idx_$117);
                                    final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                    while (s_id2.numL(end_id)) {
                                        final SubLObject s_handle2 = gethash_without_values(s_id2, sparse, v_default);
                                        if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(s_handle2))) {
                                            final SubLObject o2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                            format(stream, $str111$_____S__, sefify(o2));
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                        s_id2 = add(s_id2, ONE_INTEGER);
                                    } 
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$119 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values10 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values10);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$119, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_11, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_10, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_9, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0_$118, thread);
                    }
                }
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject cyc_memory_hogs(SubLObject verboseP, SubLObject stream) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLObject data = cyc_memory_hogs_data();
        format_nil.force_format(stream, $str121$__, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        format(stream, NIL != verboseP ? $str122$Cyc_Structures___ : $str123$__);
        format(stream, NIL != verboseP ? $str124$__Problem_stores___A_A___A_infere : $str125$_problem_stores___A_A__inferences, new SubLObject[]{ getf(data, $PROBLEM_STORES, UNPROVIDED), getf(data, $FORWARD_PROBLEM_STORES, UNPROVIDED).isZero() ? $str130$ : cconcatenate($str128$__, new SubLObject[]{ format_nil.format_nil_s_no_copy(getf(data, $FORWARD_PROBLEM_STORES, UNPROVIDED)), $str129$_forward_ }), getf(data, $INFERENCES, UNPROVIDED), getf(data, $PROOFS, UNPROVIDED), getf(data, $PROBLEMS, UNPROVIDED) });
        format(stream, NIL != verboseP ? $str134$__KB_Objects_swapped_in___A__ : $str135$_____kb_objects_swapped_in___A_, getf(data, $KB_OBJECTS_IN_MEMORY, UNPROVIDED));
        format(stream, NIL != verboseP ? $str137$__Ephemeral_terms___A__ : $str138$_ephemeral_terms___A_, getf(data, $EPHEMERAL_TERMS, UNPROVIDED));
        if (NIL != getf(data, $SBHL_CACHE_MISSES, UNPROVIDED)) {
            format(stream, NIL != verboseP ? $str141$__SBHL_cache_misses_hash_table___ : $str142$_sbhl_cache_misses___A_, getf(data, $SBHL_CACHE_MISSES, UNPROVIDED));
            if (NIL != verboseP) {
                funcall(PRINT_SBHL_CACHE_MISSES_TOP_N);
            }
        }
        format(stream, NIL != verboseP ? $str144$__Global_cache_entries___A__ : $str145$_global_cache_entries___A__, getf(data, $GLOBAL_CACHE_ENTRIES, UNPROVIDED));
        force_output(T);
        makeBoolean(ZERO_INTEGER.numL(getf(data, $UNDESTROYED_ITEMS, UNPROVIDED)) || ZERO_INTEGER.numL(getf(data, $FORWARD_INFERENCE_METRICS, UNPROVIDED)));
        if (NIL == verboseP) {
            format(stream, $str149$____);
        }
        if (ZERO_INTEGER.numL(getf(data, $UNDESTROYED_ITEMS, UNPROVIDED))) {
            format(stream, NIL != verboseP ? $str150$__Undestroyed_items___A__ : $str151$_undestroyed_items___A, getf(data, $UNDESTROYED_ITEMS, UNPROVIDED));
        }
        if (ZERO_INTEGER.numL(getf(data, $FORWARD_INFERENCE_METRICS, UNPROVIDED))) {
            if (ZERO_INTEGER.numL(getf(data, $UNDESTROYED_ITEMS, UNPROVIDED))) {
                format(stream, $str152$_);
            }
            format(stream, NIL != verboseP ? $str153$__Forward_inference_metrics___A__ : $str154$_forward_metrics___A, getf(data, $FORWARD_INFERENCE_METRICS, UNPROVIDED));
        }
        if (NIL == verboseP) {
            terpri(stream);
        }
        return NIL;
    }

    public static SubLObject cyc_memory_hogs_data() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject data = NIL;
        final SubLObject cached_constant_index_count = constant_index_manager.cached_constant_index_count();
        final SubLObject cached_nart_index_count = nart_index_manager.cached_nart_index_count();
        final SubLObject cached_nart_hl_formula_count = nart_hl_formula_manager.cached_nart_hl_formula_count();
        final SubLObject cached_assertion_count = assertion_manager.cached_assertion_count();
        final SubLObject cached_deduction_count = deduction_manager.cached_deduction_count();
        final SubLObject cached_kb_hl_support_count = kb_hl_support_manager.cached_kb_hl_support_count();
        final SubLObject cached_unrepresented_term_index_count = unrepresented_term_index_manager.cached_unrepresented_term_index_count();
        final SubLObject total_object_count = add(new SubLObject[]{ cached_constant_index_count, cached_nart_index_count, cached_nart_hl_formula_count, cached_assertion_count, cached_deduction_count, cached_kb_hl_support_count, cached_unrepresented_term_index_count });
        data = putf(data, $PROBLEM_STORES, inference_datastructures_problem_store.problem_store_count());
        data = putf(data, $INFERENCES, inference_datastructures_inference.inference_count());
        data = putf(data, $FORWARD_PROBLEM_STORES, NIL != find_if($sym155$PROBLEM_STORE_FORWARD_, inference_datastructures_problem_store.all_problem_stores(), UNPROVIDED, UNPROVIDED, UNPROVIDED) ? count_if($sym155$PROBLEM_STORE_FORWARD_, inference_datastructures_problem_store.all_problem_stores(), UNPROVIDED, UNPROVIDED, UNPROVIDED) : ZERO_INTEGER);
        data = putf(data, $PROBLEMS, apply($sym156$_, Mapping.mapcar(PROBLEM_STORE_PROBLEM_COUNT, inference_datastructures_problem_store.all_problem_stores())));
        data = putf(data, $PROOFS, apply($sym156$_, Mapping.mapcar(PROBLEM_STORE_PROOF_COUNT, inference_datastructures_problem_store.all_problem_stores())));
        data = putf(data, $FORWARD_INFERENCE_METRICS, length(inference_metrics.forward_inference_metrics_info(UNPROVIDED)));
        data = putf(data, $KB_OBJECTS_IN_MEMORY, total_object_count);
        data = putf(data, $EPHEMERAL_TERMS, length(kb_cleanup.all_ephemeral_terms()));
        if (NIL != sbhl_cache.$sbhl_cache_misses_hash_table$.getDynamicValue(thread)) {
            data = putf(data, $SBHL_CACHE_MISSES, hash_table_count(sbhl_cache.$sbhl_cache_misses_hash_table$.getDynamicValue(thread)));
        }
        data = putf(data, $GLOBAL_CACHE_ENTRIES, apply($sym156$_, Mapping.mapcar(CACHING_STATE_SIZE_ROBUST, memoization_state.global_cache_variable_values())));
        data = putf(data, $UNDESTROYED_ITEMS, apply($sym156$_, Mapping.mapcar(DELAYED_PROCESSOR_QUEUE_SIZE, list(pph_utilities.pph_inference_destroyer(), pph_phrase.pph_phrase_destroyer(), cb_proof_view.cb_proof_view_destroyer(), funcall(makeSymbol("INFERENCE-MONITOR-DEMO-INFERENCE-SMITER")), funcall(makeSymbol("RUN-QS-SMITER"))))));
        return data;
    }

    public static SubLObject cyc_free_memory_hogs(SubLObject verboseP) {
        if (verboseP == UNPROVIDED) {
            verboseP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(T, $str161$BEFORE___);
        cyc_memory_hogs(verboseP, UNPROVIDED);
        inference_datastructures_problem_store.destroy_all_problem_stores();
        inference_metrics.clear_forward_inference_metrics();
        kb_cleanup.forget_ephemeral_terms(UNPROVIDED);
        swap_out_all_pristine_kb_objects();
        if (NIL != sbhl_cache.$sbhl_cache_misses_hash_table$.getDynamicValue(thread)) {
            sbhl_cache.$sbhl_cache_misses_hash_table$.setDynamicValue(make_hash_table($int$10000, symbol_function(EQUAL), UNPROVIDED), thread);
        }
        memoization_state.clear_all_globally_cached_functions(T);
        final SubLObject str = $$$Performing_full_GC;
        final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
        try {
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
            $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
            $progress_notification_count$.bind(ZERO_INTEGER, thread);
            $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
            $progress_count$.bind(ZERO_INTEGER, thread);
            $is_noting_progressP$.bind(T, thread);
            $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
            noting_progress_preamble(str);
            Storage.gc_full();
            noting_progress_postamble();
        } finally {
            $silent_progressP$.rebind(_prev_bind_8, thread);
            $is_noting_progressP$.rebind(_prev_bind_7, thread);
            $progress_count$.rebind(_prev_bind_6, thread);
            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            $progress_notification_count$.rebind(_prev_bind_4, thread);
            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            $progress_start_time$.rebind(_prev_bind_0, thread);
        }
        format(T, $str164$AFTER___);
        cyc_memory_hogs(verboseP, UNPROVIDED);
        return NIL;
    }

    public static SubLObject get_kb_object_managers() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($get_kb_object_managers$.getDynamicValue(thread) == $UNINITIALIZED) {
            final SubLObject init_value = list(constant_index_manager.$constant_index_manager$.getGlobalValue(), nart_index_manager.$nart_index_manager$.getGlobalValue(), nart_hl_formula_manager.$nart_hl_formula_manager$.getGlobalValue(), assertion_manager.$assertion_content_manager$.getGlobalValue(), deduction_manager.$deduction_content_manager$.getGlobalValue(), kb_hl_support_manager.$kb_hl_support_content_manager$.getGlobalValue(), unrepresented_term_index_manager.$unrepresented_term_index_manager$.getGlobalValue());
            if (init_value == $UNINITIALIZED) {
                Errors.error($str166$Unable_to_initialize__A__, $get_kb_object_managers$.getDynamicValue(thread));
            }
            $get_kb_object_managers$.setDynamicValue(init_value, thread);
        }
        return $get_kb_object_managers$.getDynamicValue(thread);
    }

    public static SubLObject cyc_lock_hogs(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject lock_process_action_triples = NIL;
        SubLObject cdolist_list_var = list(sbhl_link_vars.$sbhl_rw_lock$.getGlobalValue(), memoization_state.$global_caching_lock$.getGlobalValue());
        SubLObject rw_lock = NIL;
        rw_lock = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject writer = ReadWriteLocks.rw_lock_writer(rw_lock);
            final SubLObject waiters = ReadWriteLocks.rw_lock_waiters(rw_lock);
            if ((NIL != writer) || (NIL != waiters)) {
                lock_process_action_triples = cons(list(rw_lock, writer, $LOCKER), lock_process_action_triples);
                SubLObject cdolist_list_var_$135 = waiters;
                SubLObject waiter = NIL;
                waiter = cdolist_list_var_$135.first();
                while (NIL != cdolist_list_var_$135) {
                    lock_process_action_triples = cons(list(rw_lock, waiter, $WAITER), lock_process_action_triples);
                    cdolist_list_var_$135 = cdolist_list_var_$135.rest();
                    waiter = cdolist_list_var_$135.first();
                } 
                format(stream, $str169$__lock_hog___A__writer__S_waiters, new SubLObject[]{ ReadWriteLocks.rw_lock_name(rw_lock), writer, waiters });
            }
            cdolist_list_var = cdolist_list_var.rest();
            rw_lock = cdolist_list_var.first();
        } 
        cdolist_list_var = get_kb_object_managers();
        SubLObject manager = NIL;
        manager = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject lock = kb_object_manager.kb_object_manager_content_lock(manager);
            final SubLObject locker = lock_locker(lock);
            if (NIL != locker) {
                lock_process_action_triples = cons(list(lock, locker, $LOCKER), lock_process_action_triples);
                format(stream, $str170$__lock_hog___A__locker__S___, lock_name(lock), locker);
            }
            cdolist_list_var = cdolist_list_var.rest();
            manager = cdolist_list_var.first();
        } 
        cdolist_list_var = list(new SubLObject[]{ unrepresented_terms.$unrepresented_term_fht_lock$.getGlobalValue(), sbhl_graphs.$sbhl_file_vector_data_stream_lock$.getGlobalValue(), tva_cache.$swappable_tva_cache_lock$.getGlobalValue(), nl_trie.$nl_trie_lock$.getGlobalValue(), operation_queues.$local_queue_lock$.getDynamicValue(thread), operation_queues.$remote_queue_lock$.getDynamicValue(thread), operation_queues.$transcript_queue_lock$.getDynamicValue(thread), operation_queues.$hl_transcript_queue_lock$.getDynamicValue(thread), operation_queues.$auxiliary_queue_lock$.getDynamicValue(thread), operation_queues.$transmit_queue_lock$.getDynamicValue(thread), operation_queues.$local_operation_storage_queue_lock$.getDynamicValue(thread) });
        SubLObject lock2 = NIL;
        lock2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (lock2.isLock()) {
                final SubLObject locker2 = lock_locker(lock2);
                if (NIL != locker2) {
                    lock_process_action_triples = cons(list(lock2, locker2, $LOCKER), lock_process_action_triples);
                    format(stream, $str170$__lock_hog___A__locker__S___, lock_name(lock2), locker2);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            lock2 = cdolist_list_var.first();
        } 
        return lock_process_action_triples;
    }

    public static SubLObject cyc_lock_users_sampled(SubLObject samples, SubLObject delay) {
        if (samples == UNPROVIDED) {
            samples = $int$212;
        }
        if (delay == UNPROVIDED) {
            delay = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lock_process_action_triples_counts = make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED);
        SubLObject n;
        SubLObject cdolist_list_var;
        SubLObject lock_process_action_triple;
        for (n = NIL, n = ZERO_INTEGER; n.numL(samples); n = add(n, ONE_INTEGER)) {
            cdolist_list_var = cyc_lock_hogs(StreamsLow.$null_output$.getDynamicValue(thread));
            lock_process_action_triple = NIL;
            lock_process_action_triple = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                hash_table_utilities.cinc_hash(lock_process_action_triple, lock_process_action_triples_counts, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                lock_process_action_triple = cdolist_list_var.first();
            } 
            if (ZERO_INTEGER.numL(delay)) {
                sleep(delay);
            }
        }
        return lock_process_action_triples_counts;
    }

    public static SubLObject kb_checkpoint_p(final SubLObject v_object) {
        if ((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, FOUR_INTEGER, UNPROVIDED))) {
            SubLObject constant_cp = NIL;
            SubLObject nart_cp = NIL;
            SubLObject assertion_cp = NIL;
            SubLObject deduction_cp = NIL;
            destructuring_bind_must_consp(v_object, v_object, $list173);
            constant_cp = v_object.first();
            SubLObject current = v_object.rest();
            destructuring_bind_must_consp(current, v_object, $list173);
            nart_cp = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, v_object, $list173);
            assertion_cp = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, v_object, $list173);
            deduction_cp = current.first();
            current = current.rest();
            if (NIL == current) {
                return makeBoolean((((NIL != constants_high.constant_checkpoint_p(constant_cp)) && (NIL != narts_high.nart_checkpoint_p(nart_cp))) && (NIL != assertions_high.assertion_checkpoint_p(assertion_cp))) && (NIL != deductions_high.deduction_checkpoint_p(deduction_cp)));
            }
            cdestructuring_bind_error(v_object, $list173);
        }
        return NIL;
    }

    public static SubLObject new_kb_checkpoint() {
        final SubLObject constant_checkpoint = constants_high.new_constant_checkpoint();
        final SubLObject nart_checkpoint = narts_high.new_nart_checkpoint();
        final SubLObject assertion_checkpoint = assertions_high.new_assertion_checkpoint();
        final SubLObject deduction_checkpoint = deductions_high.new_deduction_checkpoint();
        return list(constant_checkpoint, nart_checkpoint, assertion_checkpoint, deduction_checkpoint);
    }

    public static SubLObject kb_checkpoint_currentP(final SubLObject kb_checkpoint) {
        assert NIL != kb_checkpoint_p(kb_checkpoint) : "kb_utilities.kb_checkpoint_p(kb_checkpoint) " + "CommonSymbols.NIL != kb_utilities.kb_checkpoint_p(kb_checkpoint) " + kb_checkpoint;
        SubLObject constant_cp = NIL;
        SubLObject nart_cp = NIL;
        SubLObject assertion_cp = NIL;
        SubLObject deduction_cp = NIL;
        destructuring_bind_must_consp(kb_checkpoint, kb_checkpoint, $list173);
        constant_cp = kb_checkpoint.first();
        SubLObject current = kb_checkpoint.rest();
        destructuring_bind_must_consp(current, kb_checkpoint, $list173);
        nart_cp = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, kb_checkpoint, $list173);
        assertion_cp = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, kb_checkpoint, $list173);
        deduction_cp = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean((((NIL != constants_high.constant_checkpoint_currentP(constant_cp)) && (NIL != narts_high.nart_checkpoint_currentP(nart_cp))) && (NIL != assertions_high.assertion_checkpoint_currentP(assertion_cp))) && (NIL != deductions_high.deduction_checkpoint_currentP(deduction_cp)));
        }
        cdestructuring_bind_error(kb_checkpoint, $list173);
        return NIL;
    }

    public static SubLObject theory_checkpoint_p(final SubLObject v_object) {
        if ((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) {
            SubLObject assertion_cp = NIL;
            SubLObject deduction_cp = NIL;
            destructuring_bind_must_consp(v_object, v_object, $list175);
            assertion_cp = v_object.first();
            SubLObject current = v_object.rest();
            destructuring_bind_must_consp(current, v_object, $list175);
            deduction_cp = current.first();
            current = current.rest();
            if (NIL == current) {
                return makeBoolean((NIL != assertions_high.assertion_checkpoint_p(assertion_cp)) && (NIL != deductions_high.deduction_checkpoint_p(deduction_cp)));
            }
            cdestructuring_bind_error(v_object, $list175);
        }
        return NIL;
    }

    public static SubLObject new_theory_checkpoint() {
        final SubLObject assertion_checkpoint = assertions_high.new_assertion_checkpoint();
        final SubLObject deduction_checkpoint = deductions_high.new_deduction_checkpoint();
        return list(assertion_checkpoint, deduction_checkpoint);
    }

    public static SubLObject theory_checkpoint_currentP(final SubLObject theory_checkpoint) {
        assert NIL != theory_checkpoint_p(theory_checkpoint) : "kb_utilities.theory_checkpoint_p(theory_checkpoint) " + "CommonSymbols.NIL != kb_utilities.theory_checkpoint_p(theory_checkpoint) " + theory_checkpoint;
        SubLObject assertion_cp = NIL;
        SubLObject deduction_cp = NIL;
        destructuring_bind_must_consp(theory_checkpoint, theory_checkpoint, $list175);
        assertion_cp = theory_checkpoint.first();
        SubLObject current = theory_checkpoint.rest();
        destructuring_bind_must_consp(current, theory_checkpoint, $list175);
        deduction_cp = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean((NIL != assertions_high.assertion_checkpoint_currentP(assertion_cp)) && (NIL != deductions_high.deduction_checkpoint_currentP(deduction_cp)));
        }
        cdestructuring_bind_error(theory_checkpoint, $list175);
        return NIL;
    }

    public static SubLObject hl_internal_id_string_p(final SubLObject v_object) {
        return string_utilities.hex_char_string_p(v_object);
    }

    public static SubLObject compact_hl_internal_id_string_p(final SubLObject v_object) {
        return string_utilities.f_64_bit_string_p(v_object);
    }

    public static SubLObject hl_internal_id_string(final SubLObject v_object) {
        return vector_utilities.byte_vector_to_hex_char_string(cfasl_encode(v_object));
    }

    public static SubLObject compact_hl_internal_id_string(final SubLObject v_object) {
        return vector_utilities.byte_vector_to_64_bit_char_string(cfasl_encode(v_object));
    }

    public static SubLObject find_object_by_hl_internal_id_string(final SubLObject id_string) {
        assert NIL != hl_internal_id_string_p(id_string) : "kb_utilities.hl_internal_id_string_p(id_string) " + "CommonSymbols.NIL != kb_utilities.hl_internal_id_string_p(id_string) " + id_string;
        return find_object_by_hl_id_string(id_string, $HEX);
    }

    public static SubLObject find_object_by_compact_hl_internal_id_string(final SubLObject id_string) {
        assert NIL != compact_hl_internal_id_string_p(id_string) : "kb_utilities.compact_hl_internal_id_string_p(id_string) " + "CommonSymbols.NIL != kb_utilities.compact_hl_internal_id_string_p(id_string) " + id_string;
        return find_object_by_hl_id_string(id_string, $64);
    }

    public static SubLObject maybe_find_object_by_hl_internal_id_string(final SubLObject id_string) {
        if (NIL == hl_external_id_string_p(id_string)) {
            return values(NIL, NIL);
        }
        return find_object_by_hl_id_string(id_string, $HEX);
    }

    public static SubLObject maybe_find_object_by_compact_hl_internal_id_string(final SubLObject id_string) {
        if (NIL == compact_hl_external_id_string_p(id_string)) {
            return values(NIL, NIL);
        }
        return find_object_by_hl_id_string(id_string, $64);
    }

    public static SubLObject hl_external_id_string_p(final SubLObject v_object) {
        return string_utilities.hex_char_string_p(v_object);
    }

    public static SubLObject compact_hl_external_id_string_p(final SubLObject v_object) {
        return makeBoolean(((v_object.isString() && (NIL != list_utilities.lengthGE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != charE(CHAR_M, Strings.sublisp_char(v_object, ZERO_INTEGER)))) && (NIL != string_utilities.f_64_bit_string_p(v_object)));
    }

    public static SubLObject compact_hl_external_id_stringP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != compact_hl_external_id_string_p(v_object)) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject hl_term = find_object_by_compact_hl_external_id_string(v_object);
                        if (v_object.equal(compact_hl_external_id_string(hl_term))) {
                            return values(T, hl_term);
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        }
        return values(NIL, NIL);
    }

    public static SubLObject compact_hl_external_id_stringE(final SubLObject id_string_a, final SubLObject id_string_b) {
        return makeBoolean(((NIL != compact_hl_external_id_string_p(id_string_a)) && (NIL != compact_hl_external_id_string_p(id_string_b))) && (NIL != Strings.stringE(id_string_a, id_string_b, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject hl_external_id_string(final SubLObject v_object) {
        return vector_utilities.byte_vector_to_hex_char_string(cfasl_encode_externalized_terse(v_object));
    }

    public static SubLObject compact_hl_external_id_string(final SubLObject v_object) {
        return vector_utilities.byte_vector_to_64_bit_char_string(cfasl_encode_externalized_terse(v_object));
    }

    public static SubLObject find_object_by_hl_external_id_string(final SubLObject id_string) {
        SubLTrampolineFile.enforceType(id_string, HL_EXTERNAL_ID_STRING_P);
        return find_object_by_hl_id_string(id_string, $HEX);
    }

    public static SubLObject find_cycl_object_by_compact_hl_external_id_string(final SubLObject id_string) {
        final SubLObject result = find_object_by_compact_hl_external_id_string(id_string);
        if (NIL == cycl_grammar.cycl_term_p(result)) {
            Errors.error($str198$Invalid_hl_external_id____A____fo, id_string);
        }
        return result;
    }

    public static SubLObject find_object_by_compact_hl_external_id_string(final SubLObject id_string) {
        SubLTrampolineFile.enforceType(id_string, COMPACT_HL_EXTERNAL_ID_STRING_P);
        return find_object_by_hl_id_string(id_string, $64);
    }

    public static SubLObject maybe_find_object_by_compact_hl_external_id_string(final SubLObject id_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(id_string) : "Types.stringp(id_string) " + "CommonSymbols.NIL != Types.stringp(id_string) " + id_string;
        if (NIL != compact_hl_external_id_string_p(id_string)) {
            thread.resetMultipleValues();
            final SubLObject foundP = compact_hl_external_id_stringP(id_string);
            final SubLObject v_term = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != foundP) {
                return values(v_term, foundP);
            }
        }
        return values(NIL, NIL);
    }

    public static SubLObject find_object_by_hl_id_string(final SubLObject id_string, final SubLObject mode) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject byte_vector = NIL;
        SubLObject v_object = NIL;
        SubLObject valid = NIL;
        if (mode.eql($HEX)) {
            byte_vector = vector_utilities.hex_char_string_to_byte_vector(id_string);
        } else
            if (mode.eql($64)) {
                byte_vector = vector_utilities.f_64_bit_char_string_to_byte_vector(id_string);
            } else {
                Errors.error($str201$invalid_mode__S, mode);
            }

        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    v_object = cfasl_decode(byte_vector);
                    valid = makeBoolean(NIL == list_utilities.tree_find_if(INVALID_HL_OBJECT_P, v_object, UNPROVIDED));
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return values(v_object, valid);
    }

    public static SubLObject invalid_hl_object_p(final SubLObject v_object) {
        if (NIL != constant_p(v_object)) {
            return makeBoolean(NIL == valid_constantP(v_object, UNPROVIDED));
        }
        if (NIL != nart_handles.nart_p(v_object)) {
            return makeBoolean(NIL == nart_handles.valid_nartP(v_object, UNPROVIDED));
        }
        if (NIL != assertion_handles.assertion_p(v_object)) {
            return makeBoolean(NIL == assertion_handles.valid_assertionP(v_object, UNPROVIDED));
        }
        if (NIL != deduction_handles.deduction_p(v_object)) {
            return makeBoolean(NIL == deduction_handles.valid_deductionP(v_object, UNPROVIDED));
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(v_object)) {
            return makeBoolean(NIL == kb_hl_support_handles.valid_kb_hl_supportP(v_object, UNPROVIDED));
        }
        if (NIL != clause_strucs.clause_struc_p(v_object)) {
            return makeBoolean(NIL == clause_strucs.valid_clause_struc(v_object, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject string_for_unlexified_term(final SubLObject v_term, SubLObject use_morphologyP) {
        if (use_morphologyP == UNPROVIDED) {
            use_morphologyP = T;
        }
        if ((NIL != constant_p(v_term)) && (NIL == nart_handles.nart_p(v_term))) {
            final SubLObject name = constants_high.constant_name(v_term);
            return name.isString() ? string_utilities.space_dont_uncapitalize(name) : $$$an_unnamed_constant;
        }
        if (NIL != misc_kb_utilities.nat_objectP(v_term)) {
            return misc_kb_utilities.coerce_name(v_term);
        }
        return format(NIL, $str204$_a, function_terms.nart_to_naut(v_term));
    }

    public static SubLObject sort_terms(final SubLObject list, SubLObject copyP, SubLObject stableP, SubLObject constants_by_nameP, SubLObject ignore_variable_symbolsP, SubLObject key, SubLObject use_internal_idsP) {
        if (copyP == UNPROVIDED) {
            copyP = NIL;
        }
        if (stableP == UNPROVIDED) {
            stableP = NIL;
        }
        if (constants_by_nameP == UNPROVIDED) {
            constants_by_nameP = NIL;
        }
        if (ignore_variable_symbolsP == UNPROVIDED) {
            ignore_variable_symbolsP = NIL;
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (use_internal_idsP == UNPROVIDED) {
            use_internal_idsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $sort_terms_constants_by_name$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $sort_terms_ignore_variable_symbols$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $sort_terms_by_internal_idP$.currentBinding(thread);
        try {
            $sort_terms_constants_by_name$.bind(constants_by_nameP, thread);
            $sort_terms_ignore_variable_symbols$.bind(ignore_variable_symbolsP, thread);
            $sort_terms_by_internal_idP$.bind(use_internal_idsP, thread);
            final SubLObject seq = (NIL != copyP) ? copy_list(list) : list;
            final SubLObject sort_func = (NIL != stableP) ? symbol_function(STABLE_SORT) : symbol_function(SORT);
            ans = funcall(sort_func, seq, symbol_function(FORM_SORT_PRED), key);
        } finally {
            $sort_terms_by_internal_idP$.rebind(_prev_bind_3, thread);
            $sort_terms_ignore_variable_symbols$.rebind(_prev_bind_2, thread);
            $sort_terms_constants_by_name$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject term_L(final SubLObject term1, final SubLObject term2, SubLObject constants_by_nameP, SubLObject ignore_variable_symbolsP, SubLObject use_internal_idsP) {
        if (constants_by_nameP == UNPROVIDED) {
            constants_by_nameP = NIL;
        }
        if (ignore_variable_symbolsP == UNPROVIDED) {
            ignore_variable_symbolsP = NIL;
        }
        if (use_internal_idsP == UNPROVIDED) {
            use_internal_idsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $sort_terms_constants_by_name$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $sort_terms_ignore_variable_symbols$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $sort_terms_by_internal_idP$.currentBinding(thread);
        try {
            $sort_terms_constants_by_name$.bind(constants_by_nameP, thread);
            $sort_terms_ignore_variable_symbols$.bind(ignore_variable_symbolsP, thread);
            $sort_terms_by_internal_idP$.bind(use_internal_idsP, thread);
            ans = form_sort_pred(term1, term2);
        } finally {
            $sort_terms_by_internal_idP$.rebind(_prev_bind_3, thread);
            $sort_terms_ignore_variable_symbols$.rebind(_prev_bind_2, thread);
            $sort_terms_constants_by_name$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject term_L_with_constant_by_name(final SubLObject term1, final SubLObject term2, SubLObject ignore_variable_symbolsP) {
        if (ignore_variable_symbolsP == UNPROVIDED) {
            ignore_variable_symbolsP = NIL;
        }
        return term_L(term1, term2, T, ignore_variable_symbolsP, UNPROVIDED);
    }

    public static SubLObject form_sort_pred(final SubLObject form1, final SubLObject form2) {
        if (form1.eql(form2)) {
            return NIL;
        }
        if (form1.isAtom()) {
            if (form2.isAtom()) {
                return atom_sort_pred(form1, form2);
            }
            return T;
        } else {
            if (form2.isAtom()) {
                return NIL;
            }
            return cons_sort_pred(form1, form2);
        }
    }

    public static SubLObject cons_sort_pred(final SubLObject cons1, final SubLObject cons2) {
        SubLObject curr_cons1 = NIL;
        SubLObject curr_cons2 = NIL;
        curr_cons1 = cons1;
        curr_cons2 = cons2;
        while (true) {
            final SubLObject car1 = curr_cons1.first();
            final SubLObject car2 = curr_cons2.first();
            if (NIL != form_sort_pred(car1, car2)) {
                return T;
            }
            if (NIL != form_sort_pred(car2, car1)) {
                return NIL;
            }
            final SubLObject cdr1 = curr_cons1.rest();
            final SubLObject cdr2 = curr_cons2.rest();
            if (cdr1.isAtom()) {
                if (cdr2.isAtom()) {
                    return atom_sort_pred(cdr1, cdr2);
                }
                return T;
            } else {
                if (cdr2.isAtom()) {
                    return NIL;
                }
                curr_cons1 = curr_cons1.rest();
                curr_cons2 = curr_cons2.rest();
            }
        } 
    }

    public static SubLObject atom_sort_pred(final SubLObject atom1, final SubLObject atom2) {
        if (atom1.eql(atom2)) {
            return NIL;
        }
        return makeBoolean(((NIL != forts.fort_p(atom1)) && ((NIL == forts.fort_p(atom2)) || (NIL != fort_sort_pred(atom1, atom2)))) || ((NIL == forts.fort_p(atom2)) && (((NIL != variables.variable_p(atom1)) && ((NIL == variables.variable_p(atom2)) || (NIL != variables.variable_L(atom1, atom2)))) || ((NIL == variables.variable_p(atom2)) && ((atom1.isSymbol() && ((!atom2.isSymbol()) || (NIL != symbol_sort_pred(atom1, atom2)))) || ((!atom2.isSymbol()) && ((atom1.isString() && ((!atom2.isString()) || (NIL != Strings.stringL(atom1, atom2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) || ((!atom2.isString()) && ((atom1.isNumber() && ((!atom2.isNumber()) || atom1.numL(atom2))) || ((atom1.isChar() && (!atom2.isNumber())) && ((!atom2.isChar()) || (NIL != charL(atom1, atom2)))))))))))));
    }

    public static SubLObject symbol_sort_pred(final SubLObject symbol1, final SubLObject symbol2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((symbol1.isKeyword() && ((!symbol2.isKeyword()) || (NIL != Strings.stringL(symbol_name(symbol1), symbol_name(symbol2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) || ((!symbol2.isKeyword()) && (((NIL != variables.variable_symbolp(symbol1)) && ((NIL == variables.variable_symbolp(symbol2)) || ((NIL == $sort_terms_ignore_variable_symbols$.getDynamicValue(thread)) && (NIL != Strings.stringL(symbol_name(symbol1), symbol_name(symbol2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))))) || ((NIL == variables.variable_symbolp(symbol2)) && (NIL != Strings.stringL(symbol_name(symbol1), symbol_name(symbol2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))))));
    }

    public static SubLObject fort_sort_pred(final SubLObject fort1, final SubLObject fort2) {
        if (NIL != nart_handles.nart_p(fort1)) {
            if (NIL != nart_handles.nart_p(fort2)) {
                return nart_sort_pred(fort1, fort2);
            }
            return NIL;
        } else {
            if (NIL != nart_handles.nart_p(fort2)) {
                return T;
            }
            return constant_sort_pred(fort1, fort2);
        }
    }

    public static SubLObject constant_sort_pred(final SubLObject constant1, final SubLObject constant2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $sort_terms_by_internal_idP$.getDynamicValue(thread)) {
            return constants_high.constant_internal_id_L(constant1, constant2);
        }
        if (NIL != $sort_terms_constants_by_name$.getDynamicValue(thread)) {
            return atom_sort_pred(constants_high.constant_name(constant1), constants_high.constant_name(constant2));
        }
        return constants_high.constant_external_id_L(constant1, constant2);
    }

    public static SubLObject nart_sort_pred(final SubLObject nart1, final SubLObject nart2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $sort_terms_constants_by_name$.getDynamicValue(thread)) && (NIL == $sort_terms_by_internal_idP$.getDynamicValue(thread))) {
            return form_sort_pred(narts_high.nart_el_formula(nart1), narts_high.nart_el_formula(nart2));
        }
        return atom_sort_pred(nart_handles.nart_id(nart1), nart_handles.nart_id(nart2));
    }

    public static SubLObject fort_L(final SubLObject fort1, final SubLObject fort2) {
        assert NIL != forts.fort_p(fort1) : "forts.fort_p(fort1) " + "CommonSymbols.NIL != forts.fort_p(fort1) " + fort1;
        assert NIL != forts.fort_p(fort2) : "forts.fort_p(fort2) " + "CommonSymbols.NIL != forts.fort_p(fort2) " + fort2;
        if (NIL != constant_p(fort1)) {
            if (NIL != constant_p(fort2)) {
                return constants_high.constant_internal_id_L(fort1, fort2);
            }
            return T;
        } else {
            if (NIL != constant_p(fort2)) {
                return NIL;
            }
            return numL(nart_handles.nart_id(fort1), nart_handles.nart_id(fort2));
        }
    }

    public static SubLObject sort_forts(final SubLObject v_forts) {
        return Sort.sort(v_forts, symbol_function($sym209$FORT__), UNPROVIDED);
    }

    public static SubLObject definitional_pred_L(final SubLObject pred1, final SubLObject pred2, SubLObject constants_by_name) {
        if (constants_by_name == UNPROVIDED) {
            constants_by_name = NIL;
        }
        return makeBoolean((NIL != list_utilities.position_L(pred1, pred2, $definitional_pred_sort_order$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) || ((NIL == list_utilities.position_L(pred2, pred1, $definitional_pred_sort_order$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) && (NIL != term_L(pred1, pred2, constants_by_name, UNPROVIDED, UNPROVIDED))));
    }

    public static SubLObject definitional_assertion_L(final SubLObject obj1, final SubLObject obj2) {
        final SubLObject pred1 = cycl_utilities.formula_operator(obj1);
        final SubLObject pred2 = cycl_utilities.formula_operator(obj2);
        if ((NIL != kbeq(pred1, pred2)) && (NIL != fort_types_interface.arg_type_ternary_predicate_p(pred1))) {
            return numL(assertions_high.gaf_arg2(obj1), assertions_high.gaf_arg2(obj2));
        }
        return definitional_pred_L(pred1, pred2, UNPROVIDED);
    }

    public static SubLObject term_order(final SubLObject v_object) {
        final SubLObject method_function = method_func(v_object, $term_order_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object);
        }
        return ZERO_INTEGER;
    }

    public static SubLObject term_order_assertion_method(final SubLObject v_object) {
        return add(ONE_INTEGER, term_order(assertions_high.assertion_cnf(v_object)));
    }

    public static SubLObject term_order_cons_method(final SubLObject v_object) {
        SubLObject order = ZERO_INTEGER;
        SubLObject rest = NIL;
        SubLObject item = NIL;
        rest = v_object;
        item = rest.first();
        while (rest.rest().isCons()) {
            order = max(order, term_order(item));
            rest = rest.rest();
            item = rest.first();
        } 
        order = max(order, term_order(item));
        if (NIL != rest.rest()) {
            order = max(order, term_order(rest.rest()));
        }
        return order;
    }

    public static SubLObject term_similarity_metric(final SubLObject term1, final SubLObject term2) {
        if (term1.equal(term2)) {
            return ONE_INTEGER;
        }
        final SubLObject term1_generalizations = term_similarity_metric_generalizations(term1);
        final SubLObject term2_generalizations = term_similarity_metric_generalizations(term2);
        SubLObject union_count = keyhash.keyhash_count(term1_generalizations);
        SubLObject intersection_count = ZERO_INTEGER;
        final SubLObject cdohash_table = keyhash.do_keyhash_nodes(term2_generalizations);
        SubLObject key = NIL;
        SubLObject the_value = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                the_value = getEntryValue(cdohash_entry);
                if (NIL != keyhash.getkeyhash(key, term1_generalizations)) {
                    intersection_count = add(intersection_count, ONE_INTEGER);
                } else {
                    union_count = add(union_count, ONE_INTEGER);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return divide(intersection_count, union_count);
    }

    public static SubLObject instance_similarity_statistics(final SubLObject collection, SubLObject sample) {
        if (sample == UNPROVIDED) {
            sample = $int$500;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(collection) : "forts.fort_p(collection) " + "CommonSymbols.NIL != forts.fort_p(collection) " + collection;
        SubLObject result = NIL;
        SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource(FOUR_INTEGER);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
            try {
                final SubLObject _prev_bind_0_$136 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$137 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    result = similarity_statistics_int(isa.all_fort_instances(collection, UNPROVIDED, UNPROVIDED), sample);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$137, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$136, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$137 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$137, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0, thread);
        }
        return apply(symbol_function(VALUES), result);
    }

    public static SubLObject spec_similarity_statistics(final SubLObject collection, SubLObject sample) {
        if (sample == UNPROVIDED) {
            sample = $int$500;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(collection) : "forts.fort_p(collection) " + "CommonSymbols.NIL != forts.fort_p(collection) " + collection;
        SubLObject result = NIL;
        SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource(FOUR_INTEGER);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
            try {
                final SubLObject _prev_bind_0_$139 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$140 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    result = similarity_statistics_int(genls.all_specs(collection, UNPROVIDED, UNPROVIDED), sample);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$140, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$139, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$140 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$140, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0, thread);
        }
        return apply(symbol_function(VALUES), result);
    }

    public static SubLObject term_similarity_metric_generalizations_internal(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject size = add($average_all_isa_count$.getDynamicValue(thread), NIL != fort_types_interface.collection_p(v_term) ? $average_all_genls_count$.getDynamicValue(thread) : ZERO_INTEGER);
        final SubLObject generalizations = keyhash.new_keyhash(size, symbol_function(EQUAL));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            keyhash.setkeyhash(v_term, generalizations);
            SubLObject cdolist_list_var = term_similarity_all_isa(v_term);
            SubLObject gen = NIL;
            gen = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                keyhash.setkeyhash(gen, generalizations);
                cdolist_list_var = cdolist_list_var.rest();
                gen = cdolist_list_var.first();
            } 
            if (NIL != fort_types_interface.collection_p(v_term)) {
                cdolist_list_var = genls.all_genls(v_term, UNPROVIDED, UNPROVIDED);
                gen = NIL;
                gen = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    keyhash.setkeyhash(gen, generalizations);
                    cdolist_list_var = cdolist_list_var.rest();
                    gen = cdolist_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return generalizations;
    }

    public static SubLObject term_similarity_metric_generalizations(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return term_similarity_metric_generalizations_internal(v_term);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TERM_SIMILARITY_METRIC_GENERALIZATIONS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TERM_SIMILARITY_METRIC_GENERALIZATIONS, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, TERM_SIMILARITY_METRIC_GENERALIZATIONS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(term_similarity_metric_generalizations_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject term_similarity_all_isa(final SubLObject v_term) {
        return rkf_ontology_utilities.rkf_all_isa(v_term, UNPROVIDED);
    }

    public static SubLObject similarity_statistics_int(final SubLObject terms, final SubLObject sample) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject results = NIL;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                if (sample.eql($ALL)) {
                    final SubLObject _prev_bind_0_$142 = $progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $progress_note$.bind($$$cdolist, thread);
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_total$.bind(length(terms), thread);
                        $progress_sofar$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = terms;
                            SubLObject term1 = NIL;
                            term1 = csome_list_var.first();
                            while (NIL != csome_list_var) {
                                SubLObject cdolist_list_var = terms;
                                SubLObject term2 = NIL;
                                term2 = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    if (!term1.eql(term2)) {
                                        final SubLObject result = term_similarity_metric(term1, term2);
                                        if (!result.isZero()) {
                                            results = cons(result, results);
                                        }
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    term2 = cdolist_list_var.first();
                                } 
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                term1 = csome_list_var.first();
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$143 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$143, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        $progress_sofar$.rebind(_prev_bind_4, thread);
                        $progress_total$.rebind(_prev_bind_3, thread);
                        $progress_start_time$.rebind(_prev_bind_2, thread);
                        $progress_note$.rebind(_prev_bind_0_$142, thread);
                    }
                } else {
                    assert NIL != subl_promotions.non_negative_integer_p(sample) : "subl_promotions.non_negative_integer_p(sample) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(sample) " + sample;
                    final SubLObject terms_vector = apply(symbol_function(VECTOR), terms);
                    final SubLObject term_count = length(terms_vector);
                    final SubLObject _prev_bind_0_$144 = $progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_9 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_13 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_14 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_15 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $progress_note$.bind($$$cdotimes, thread);
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_total$.bind(sample, thread);
                        $progress_sofar$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                            SubLObject term2;
                            SubLObject result;
                            SubLObject i;
                            SubLObject term3;
                            for (i = NIL, i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                                term3 = aref(terms_vector, random.random(term_count));
                                term2 = aref(terms_vector, random.random(term_count));
                                result = term_similarity_metric(term3, term2);
                                if (!result.isZero()) {
                                    results = cons(result, results);
                                }
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$145 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$145, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_15, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_14, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_13, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_12, thread);
                        $progress_sofar$.rebind(_prev_bind_11, thread);
                        $progress_total$.rebind(_prev_bind_10, thread);
                        $progress_start_time$.rebind(_prev_bind_9, thread);
                        $progress_note$.rebind(_prev_bind_0_$144, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$146 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$146, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return list(number_utilities.median(results, UNPROVIDED, UNPROVIDED), number_utilities.mean(results), number_utilities.standard_deviation(results));
    }

    public static SubLObject constants_created_between(final SubLObject start_date, final SubLObject end_date, SubLObject who) {
        if (who == UNPROVIDED) {
            who = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(start_date) : "Types.integerp(start_date) " + "CommonSymbols.NIL != Types.integerp(start_date) " + start_date;
        assert NIL != integerp(end_date) : "Types.integerp(end_date) " + "CommonSymbols.NIL != Types.integerp(end_date) " + end_date;
        if (!start_date.numLE(end_date)) {
            return NIL;
        }
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != forts.fort_p(who)) {
                final SubLObject list_var = bookkeeping_store.terms_created_by(who, UNPROVIDED);
                final SubLObject _prev_bind_0_$147 = $progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_1_$148 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $progress_note$.bind(NIL != format(NIL, $str222$examining_creation_times_by__S, who) ? format(NIL, $str222$examining_creation_times_by__S, who) : $$$cdolist, thread);
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_total$.bind(length(list_var), thread);
                    $progress_sofar$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject v_term = NIL;
                        v_term = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            final SubLObject date = bookkeeping_store.creation_time(v_term, UNPROVIDED);
                            if (((NIL != date) && date.numGE(start_date)) && date.numLE(end_date)) {
                                v_answer = cons(v_term, v_answer);
                            }
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            v_term = csome_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$148 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$148, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    $progress_sofar$.rebind(_prev_bind_4, thread);
                    $progress_total$.rebind(_prev_bind_3, thread);
                    $progress_start_time$.rebind(_prev_bind_1_$148, thread);
                    $progress_note$.rebind(_prev_bind_0_$147, thread);
                }
            } else {
                final SubLObject idx = do_constants_table();
                final SubLObject mess = $$$examining_all_creation_times;
                final SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                final SubLObject _prev_bind_0_$149 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_1_$149 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_9 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_10 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble(mess);
                        final SubLObject idx_$152 = idx;
                        if (NIL == id_index_objects_empty_p(idx_$152, $SKIP)) {
                            final SubLObject idx_$153 = idx_$152;
                            if (NIL == id_index_dense_objects_empty_p(idx_$153, $SKIP)) {
                                final SubLObject vector_var = id_index_dense_objects(idx_$153);
                                final SubLObject backwardP_var = NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject id;
                                SubLObject v_term2;
                                SubLObject date2;
                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                    v_term2 = aref(vector_var, id);
                                    if ((NIL == id_index_tombstone_p(v_term2)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(v_term2)) {
                                            v_term2 = $SKIP;
                                        }
                                        date2 = bookkeeping_store.creation_time(v_term2, UNPROVIDED);
                                        if (((NIL != date2) && date2.numGE(start_date)) && date2.numLE(end_date)) {
                                            v_answer = cons(v_term2, v_answer);
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                }
                            }
                            final SubLObject idx_$154 = idx_$152;
                            if ((NIL == id_index_sparse_objects_empty_p(idx_$154)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                final SubLObject sparse = id_index_sparse_objects(idx_$154);
                                SubLObject id2 = id_index_sparse_id_threshold(idx_$154);
                                final SubLObject end_id = id_index_next_id(idx_$154);
                                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                while (id2.numL(end_id)) {
                                    final SubLObject v_term3 = gethash_without_values(id2, sparse, v_default);
                                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(v_term3))) {
                                        final SubLObject date3 = bookkeeping_store.creation_time(v_term3, UNPROVIDED);
                                        if (((NIL != date3) && date3.numGE(start_date)) && date3.numLE(end_date)) {
                                            v_answer = cons(v_term3, v_answer);
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                    id2 = add(id2, ONE_INTEGER);
                                } 
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$150 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$150, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_10, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_9, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_1_$149, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_0_$149, thread);
                }
            }
            clear_cached_creation_time();
            v_answer = Sort.sort(v_answer, symbol_function($sym224$TERM__), symbol_function(CONSTANT_NAME));
            v_answer = Sort.stable_sort(v_answer, symbol_function($sym226$CREATION_TIME__), UNPROVIDED);
            if (NIL == who) {
                clear_cached_creator();
                v_answer = Sort.stable_sort(v_answer, symbol_function($sym227$CREATOR__), UNPROVIDED);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject assertion_nats(final SubLObject assertion) {
        return list_utilities.tree_gather(assertions_high.assertion_cnf(assertion), FIND_GROUND_NAUT, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject assertion_tous(final SubLObject assertion) {
        return list_utilities.tree_gather(assertions_high.assertion_cnf(assertion), TERM_OF_UNIT, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject assertions_between(final SubLObject start_date, final SubLObject end_date, SubLObject who) {
        if (who == UNPROVIDED) {
            who = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(start_date) : "Types.integerp(start_date) " + "CommonSymbols.NIL != Types.integerp(start_date) " + start_date;
        assert NIL != integerp(end_date) : "Types.integerp(end_date) " + "CommonSymbols.NIL != Types.integerp(end_date) " + end_date;
        if (!start_date.numLE(end_date)) {
            return NIL;
        }
        SubLObject v_answer = NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $$$examining_assertion_timestamps;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$156 = idx;
                if (NIL == id_index_objects_empty_p(idx_$156, $SKIP)) {
                    final SubLObject idx_$157 = idx_$156;
                    if (NIL == id_index_dense_objects_empty_p(idx_$157, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$157);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        SubLObject cyclist;
                        SubLObject date;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (NIL != assertions_high.asserted_assertionP(ass)) {
                                    cyclist = assertions_high.asserted_by(ass);
                                    date = assertions_high.asserted_when(ass);
                                    if ((((NIL != date) && ((NIL == who) || who.eql(cyclist))) && date.numGE(start_date)) && date.numLE(end_date)) {
                                        v_answer = cons(ass, v_answer);
                                    }
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$158 = idx_$156;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$158)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$158);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$158);
                        final SubLObject end_id = id_index_next_id(idx_$158);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (NIL != assertions_high.asserted_assertionP(ass2)) {
                                    final SubLObject cyclist2 = assertions_high.asserted_by(ass2);
                                    final SubLObject date2 = assertions_high.asserted_when(ass2);
                                    if ((((NIL != date2) && ((NIL == who) || who.eql(cyclist2))) && date2.numGE(start_date)) && date2.numLE(end_date)) {
                                        v_answer = cons(ass2, v_answer);
                                    }
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$159 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$159, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        v_answer = Sort.sort(v_answer, symbol_function($sym224$TERM__), symbol_function(ASSERTION_CNF));
        v_answer = Sort.stable_sort(v_answer, symbol_function($sym232$ASSERT_DATE__), UNPROVIDED);
        if (NIL == who) {
            v_answer = Sort.stable_sort(v_answer, symbol_function($sym233$ASSERT_CYCLIST__), UNPROVIDED);
        }
        return v_answer;
    }

    public static SubLObject term_assertions_between(final SubLObject v_term, final SubLObject start_date, final SubLObject end_date, SubLObject who) {
        if (who == UNPROVIDED) {
            who = NIL;
        }
        assert NIL != integerp(start_date) : "Types.integerp(start_date) " + "CommonSymbols.NIL != Types.integerp(start_date) " + start_date;
        assert NIL != integerp(end_date) : "Types.integerp(end_date) " + "CommonSymbols.NIL != Types.integerp(end_date) " + end_date;
        if (!start_date.numLE(end_date)) {
            return NIL;
        }
        SubLObject v_answer = NIL;
        SubLObject cdolist_list_var = kb_accessors.all_term_assertions(v_term, UNPROVIDED);
        SubLObject ass = NIL;
        ass = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertions_high.asserted_assertionP(ass)) {
                final SubLObject cyclist = assertions_high.asserted_by(ass);
                final SubLObject date = assertions_high.asserted_when(ass);
                if ((((NIL != date) && ((NIL == who) || who.eql(cyclist))) && date.numGE(start_date)) && date.numLE(end_date)) {
                    v_answer = cons(ass, v_answer);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            ass = cdolist_list_var.first();
        } 
        v_answer = Sort.sort(v_answer, symbol_function($sym224$TERM__), symbol_function(ASSERTION_CNF));
        v_answer = Sort.stable_sort(v_answer, symbol_function($sym232$ASSERT_DATE__), UNPROVIDED);
        if (NIL == who) {
            v_answer = Sort.stable_sort(v_answer, symbol_function($sym233$ASSERT_CYCLIST__), UNPROVIDED);
        }
        return v_answer;
    }

    public static SubLObject term_assertions_in_chronological_order(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject assertions_seen = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                            SubLObject done_var_$160 = NIL;
                            final SubLObject token_var_$161 = NIL;
                            while (NIL == done_var_$160) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$161);
                                final SubLObject valid_$162 = makeBoolean(!token_var_$161.eql(ass));
                                if (((NIL != valid_$162) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(ass, final_index_spec))) && (NIL != assertions_high.asserted_assertionP(ass))) {
                                    dictionary.dictionary_enter(assertions_seen, ass, ass);
                                }
                                done_var_$160 = makeBoolean(NIL == valid_$162);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$163 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$163, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            final SubLObject raw_assertions = dictionary.dictionary_keys(assertions_seen);
            final SubLObject adding_order = assertion_utilities.sort_assertions(raw_assertions);
            final SubLObject tstamp_order = Sort.stable_sort(adding_order, $sym234$ASSERT_TIMESTAMP__, UNPROVIDED);
            assertions = nreverse(tstamp_order);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }

    public static SubLObject term_assertions_in_id_order(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject assertions_seen = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                            SubLObject done_var_$164 = NIL;
                            final SubLObject token_var_$165 = NIL;
                            while (NIL == done_var_$164) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$165);
                                final SubLObject valid_$166 = makeBoolean(!token_var_$165.eql(ass));
                                if ((NIL != valid_$166) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(ass, final_index_spec))) {
                                    dictionary.dictionary_enter(assertions_seen, ass, ass);
                                }
                                done_var_$164 = makeBoolean(NIL == valid_$166);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$167 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$167, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            final SubLObject raw_assertions = dictionary.dictionary_keys(assertions_seen);
            final SubLObject adding_order = assertion_utilities.sort_assertions(raw_assertions);
            assertions = nreverse(adding_order);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }

    public static SubLObject term_last_asserted_assertion_date_internal(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != kb_mapping_macros.do_term_index_key_validator(v_term, NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(v_term, NIL);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                            SubLObject done_var_$168 = NIL;
                            final SubLObject token_var_$169 = NIL;
                            while (NIL == done_var_$168) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$169);
                                final SubLObject valid_$170 = makeBoolean(!token_var_$169.eql(ass));
                                if (((NIL != valid_$170) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(ass, final_index_spec))) && (NIL != assertions_high.asserted_assertionP(ass))) {
                                    final SubLObject asserted_when = assertions_high.asserted_when(ass);
                                    if ((NIL != asserted_when) && ((NIL == result) || asserted_when.numG(result))) {
                                        result = asserted_when;
                                    }
                                }
                                done_var_$168 = makeBoolean(NIL == valid_$170);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$171 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$171, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject term_last_asserted_assertion_date(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return term_last_asserted_assertion_date_internal(v_term);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TERM_LAST_ASSERTED_ASSERTION_DATE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TERM_LAST_ASSERTED_ASSERTION_DATE, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, TERM_LAST_ASSERTED_ASSERTION_DATE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(term_last_asserted_assertion_date_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_cached_term_last_asserted_assertion_date() {
        final SubLObject cs = $cached_term_last_asserted_assertion_date_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_term_last_asserted_assertion_date(final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_term_last_asserted_assertion_date_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_term_last_asserted_assertion_date_internal(final SubLObject v_term) {
        return term_last_asserted_assertion_date(v_term);
    }

    public static SubLObject cached_term_last_asserted_assertion_date(final SubLObject v_term) {
        SubLObject caching_state = $cached_term_last_asserted_assertion_date_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_TERM_LAST_ASSERTED_ASSERTION_DATE, $cached_term_last_asserted_assertion_date_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_term_last_asserted_assertion_date_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject creation_time_L(final SubLObject term1, final SubLObject term2) {
        return term_L(cached_creation_time(term1), cached_creation_time(term2), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject clear_cached_creation_time() {
        final SubLObject cs = $cached_creation_time_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_creation_time(final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_creation_time_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_creation_time_internal(final SubLObject v_term) {
        return bookkeeping_store.creation_time(v_term, UNPROVIDED);
    }

    public static SubLObject cached_creation_time(final SubLObject v_term) {
        SubLObject caching_state = $cached_creation_time_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_CREATION_TIME, $cached_creation_time_caching_state$, $int$512, EQL, ONE_INTEGER, $int$200);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_creation_time_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject creator_L(final SubLObject term1, final SubLObject term2) {
        final SubLObject creator1 = cached_creator(term1);
        final SubLObject creator2 = cached_creator(term2);
        if ((NIL != constant_p(creator1)) && (NIL != constant_p(creator2))) {
            return term_L(constants_high.constant_name(creator1), constants_high.constant_name(creator2), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return term_L(creator1, creator2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject clear_cached_creator() {
        final SubLObject cs = $cached_creator_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_creator(final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_creator_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_creator_internal(final SubLObject v_term) {
        return bookkeeping_store.creator(v_term, UNPROVIDED);
    }

    public static SubLObject cached_creator(final SubLObject v_term) {
        SubLObject caching_state = $cached_creator_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_CREATOR, $cached_creator_caching_state$, $int$512, EQL, ONE_INTEGER, $int$200);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_creator_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject assert_date_L(final SubLObject ass1, final SubLObject ass2) {
        return term_L(assertions_high.asserted_when(ass1), assertions_high.asserted_when(ass2), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject assert_cyclist_L(final SubLObject ass1, final SubLObject ass2) {
        final SubLObject cyclist1 = assertions_high.asserted_by(ass1);
        final SubLObject cyclist2 = assertions_high.asserted_by(ass2);
        if ((NIL != constant_p(cyclist1)) && (NIL != constant_p(cyclist2))) {
            return term_L(constants_high.constant_name(cyclist1), constants_high.constant_name(cyclist2), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return term_L(cyclist1, cyclist2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject probably_most_recent_assertion() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject most_recent_assertion = NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $str244$searching_for_probably_most_recen;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$172 = idx;
                if (NIL == id_index_objects_empty_p(idx_$172, $SKIP)) {
                    final SubLObject idx_$173 = idx_$172;
                    if (NIL == id_index_dense_objects_empty_p(idx_$173, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$173);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if ((NIL != assertions_high.asserted_assertionP(ass)) && ((NIL == most_recent_assertion) || (NIL != assert_timestamp_L(most_recent_assertion, ass)))) {
                                    most_recent_assertion = ass;
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$174 = idx_$172;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$174)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$174);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$174);
                        final SubLObject end_id = id_index_next_id(idx_$174);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if ((NIL != assertions_high.asserted_assertionP(ass2)) && ((NIL == most_recent_assertion) || (NIL != assert_timestamp_L(most_recent_assertion, ass2)))) {
                                    most_recent_assertion = ass2;
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$175 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$175, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return most_recent_assertion;
    }

    public static SubLObject assert_timestamp_L(final SubLObject ass1, final SubLObject ass2) {
        if (assertions_high.asserted_when(ass1).equal(assertions_high.asserted_when(ass2))) {
            return term_L(assertions_high.asserted_second(ass1), assertions_high.asserted_second(ass2), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return assert_date_L(ass1, ass2);
    }

    public static SubLObject all_constants() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject idx = do_constants_table();
        final SubLObject mess = $$$Gathering_all_constants;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$176 = idx;
                if (NIL == id_index_objects_empty_p(idx_$176, $SKIP)) {
                    final SubLObject idx_$177 = idx_$176;
                    if (NIL == id_index_dense_objects_empty_p(idx_$177, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$177);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject constant;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            constant = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(constant)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(constant)) {
                                    constant = $SKIP;
                                }
                                result = cons(constant, result);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$178 = idx_$176;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$178)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$178);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$178);
                        final SubLObject end_id = id_index_next_id(idx_$178);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject constant2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(constant2))) {
                                result = cons(constant2, result);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$179 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$179, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static SubLObject all_narts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject idx = nart_handles.do_narts_table();
        final SubLObject mess = $$$Gathering_all_narts;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$180 = idx;
                if (NIL == id_index_objects_empty_p(idx_$180, $SKIP)) {
                    final SubLObject idx_$181 = idx_$180;
                    if (NIL == id_index_dense_objects_empty_p(idx_$181, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$181);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject nart;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            nart = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(nart)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(nart)) {
                                    nart = $SKIP;
                                }
                                result = cons(nart, result);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$182 = idx_$180;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$182)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$182);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$182);
                        final SubLObject end_id = id_index_next_id(idx_$182);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject nart2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(nart2))) {
                                result = cons(nart2, result);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$183 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$183, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static SubLObject all_forts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject message = $$$Gathering_all_forts;
        final SubLObject total = forts.fort_count();
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(message);
                SubLObject cdolist_list_var = forts.do_forts_tables();
                SubLObject table_var = NIL;
                table_var = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject idx = table_var;
                    if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                        final SubLObject idx_$184 = idx;
                        if (NIL == id_index_dense_objects_empty_p(idx_$184, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$184);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject fort;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                fort = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(fort)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(fort)) {
                                        fort = $SKIP;
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                    result = cons(fort, result);
                                }
                            }
                        }
                        final SubLObject idx_$185 = idx;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$185)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$185);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$185);
                            final SubLObject end_id = id_index_next_id(idx_$185);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id)) {
                                final SubLObject fort2 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort2))) {
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                    result = cons(fort2, result);
                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    table_var = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$186 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$186, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static SubLObject all_deductions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject idx = deduction_handles.do_deductions_table();
        final SubLObject mess = $$$Gathering_all_deductions;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$187 = idx;
                if (NIL == id_index_objects_empty_p(idx_$187, $SKIP)) {
                    final SubLObject idx_$188 = idx_$187;
                    if (NIL == id_index_dense_objects_empty_p(idx_$188, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$188);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject d_id;
                        SubLObject d_handle;
                        SubLObject deduction;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            d_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            d_handle = aref(vector_var, d_id);
                            if ((NIL == id_index_tombstone_p(d_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(d_handle)) {
                                    d_handle = $SKIP;
                                }
                                deduction = deduction_handles.resolve_deduction_id_value_pair(d_id, d_handle);
                                result = cons(deduction, result);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$189 = idx_$187;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$189)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$189);
                        SubLObject d_id2 = id_index_sparse_id_threshold(idx_$189);
                        final SubLObject end_id = id_index_next_id(idx_$189);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (d_id2.numL(end_id)) {
                            final SubLObject d_handle2 = gethash_without_values(d_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(d_handle2))) {
                                final SubLObject deduction2 = deduction_handles.resolve_deduction_id_value_pair(d_id2, d_handle2);
                                result = cons(deduction2, result);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            d_id2 = add(d_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$190 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$190, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static SubLObject all_kb_hl_supports() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject idx = kb_hl_support_handles.do_kb_hl_supports_table();
        final SubLObject mess = $$$Gathering_all_KB_HL_supports;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$191 = idx;
                if (NIL == id_index_objects_empty_p(idx_$191, $SKIP)) {
                    final SubLObject idx_$192 = idx_$191;
                    if (NIL == id_index_dense_objects_empty_p(idx_$192, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$192);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject s_id;
                        SubLObject s_handle;
                        SubLObject kb_hl_support;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            s_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            s_handle = aref(vector_var, s_id);
                            if ((NIL == id_index_tombstone_p(s_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(s_handle)) {
                                    s_handle = $SKIP;
                                }
                                kb_hl_support = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id, s_handle);
                                result = cons(kb_hl_support, result);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$193 = idx_$191;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$193)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$193);
                        SubLObject s_id2 = id_index_sparse_id_threshold(idx_$193);
                        final SubLObject end_id = id_index_next_id(idx_$193);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (s_id2.numL(end_id)) {
                            final SubLObject s_handle2 = gethash_without_values(s_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(s_handle2))) {
                                final SubLObject kb_hl_support2 = kb_hl_support_handles.resolve_kb_hl_support_id_value_pair(s_id2, s_handle2);
                                result = cons(kb_hl_support2, result);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            s_id2 = add(s_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$194 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$194, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static SubLObject all_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $$$Gathering_all_assertions;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$195 = idx;
                if (NIL == id_index_objects_empty_p(idx_$195, $SKIP)) {
                    final SubLObject idx_$196 = idx_$195;
                    if (NIL == id_index_dense_objects_empty_p(idx_$196, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$196);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                result = cons(ass, result);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$197 = idx_$195;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$197)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$197);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$197);
                        final SubLObject end_id = id_index_next_id(idx_$197);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                result = cons(ass2, result);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$198 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$198, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static SubLObject all_gafs() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $$$Gathering_all_gafs;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$199 = idx;
                if (NIL == id_index_objects_empty_p(idx_$199, $SKIP)) {
                    final SubLObject idx_$200 = idx_$199;
                    if (NIL == id_index_dense_objects_empty_p(idx_$200, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$200);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (NIL != assertions_high.gaf_assertionP(ass)) {
                                    result = cons(ass, result);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$201 = idx_$199;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$201)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$201);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$201);
                        final SubLObject end_id = id_index_next_id(idx_$201);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (NIL != assertions_high.gaf_assertionP(ass2)) {
                                    result = cons(ass2, result);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$202 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$202, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static SubLObject all_forward_gafs() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $$$Gathering_all_forward_gafs;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$203 = idx;
                if (NIL == id_index_objects_empty_p(idx_$203, $SKIP)) {
                    final SubLObject idx_$204 = idx_$203;
                    if (NIL == id_index_dense_objects_empty_p(idx_$204, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$204);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (NIL != assertions_high.forward_gafP(ass)) {
                                    result = cons(ass, result);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$205 = idx_$203;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$205)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$205);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$205);
                        final SubLObject end_id = id_index_next_id(idx_$205);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (NIL != assertions_high.forward_gafP(ass2)) {
                                    result = cons(ass2, result);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$206 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$206, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    public static SubLObject all_backward_gafs() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $$$Gathering_all_backward_gafs;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$207 = idx;
                if (NIL == id_index_objects_empty_p(idx_$207, $SKIP)) {
                    final SubLObject idx_$208 = idx_$207;
                    if (NIL == id_index_dense_objects_empty_p(idx_$208, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$208);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (NIL != assertions_high.backward_gafP(ass)) {
                                    result = cons(ass, result);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$209 = idx_$207;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$209)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$209);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$209);
                        final SubLObject end_id = id_index_next_id(idx_$209);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (NIL != assertions_high.backward_gafP(ass2)) {
                                    result = cons(ass2, result);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$210 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$210, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return assertion_utilities.sort_assertions(result);
    }

    public static SubLObject all_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject message_var = $$$Gathering_all_rules;
        final SubLObject total = assertions_low.rule_count();
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(message_var);
                final SubLObject iterator_var = kb_iterators.new_rule_iterator();
                SubLObject valid;
                for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject rule = iteration.iteration_next(iterator_var);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid) {
                        sofar = add(sofar, ONE_INTEGER);
                        note_percent_progress(sofar, total);
                        result = cons(rule, result);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$211 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$211, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return assertion_utilities.sort_assertions(result);
    }

    public static SubLObject all_forward_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject message_var = $$$Gathering_all_forward_rules;
        final SubLObject total = assertions_low.rule_count();
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(message_var);
                final SubLObject iterator_var = kb_iterators.new_rule_iterator();
                SubLObject valid;
                for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject rule = iteration.iteration_next(iterator_var);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid) {
                        sofar = add(sofar, ONE_INTEGER);
                        note_percent_progress(sofar, total);
                        if (NIL != assertions_high.forward_ruleP(rule)) {
                            result = cons(rule, result);
                        }
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$212 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$212, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return assertion_utilities.sort_assertions(result);
    }

    public static SubLObject all_backward_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject message_var = $$$Gathering_all_backward_rules;
        final SubLObject total = assertions_low.rule_count();
        SubLObject sofar = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(message_var);
                final SubLObject iterator_var = kb_iterators.new_rule_iterator();
                SubLObject valid;
                for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject rule = iteration.iteration_next(iterator_var);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid) {
                        sofar = add(sofar, ONE_INTEGER);
                        note_percent_progress(sofar, total);
                        if (NIL != assertions_high.backward_ruleP(rule)) {
                            result = cons(rule, result);
                        }
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$213 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$213, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return assertion_utilities.sort_assertions(result);
    }

    public static SubLObject sorted_non_deduced_backward_gafs() {
        return Sort.stable_sort(remove_if($sym257$DEDUCED_ASSERTION_, all_backward_gafs(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $sym258$SAFE__, ASSERTED_WHEN);
    }

    public static SubLObject all_new_narts() {
        SubLObject result = NIL;
        final SubLObject start = nart_handles.new_nart_id_threshold();
        final SubLObject table_var = nart_handles.do_narts_table();
        SubLObject end_var;
        SubLObject end;
        SubLObject id;
        SubLObject nart;
        for (end = end_var = id_index_next_id(table_var), id = NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
            nart = id_index_lookup(table_var, id, UNPROVIDED);
            if (NIL != nart) {
                result = cons(nart, result);
            }
        }
        return nreverse(result);
    }

    public static SubLObject kb_object_count_list() {
        return list(constant_count(), nart_handles.nart_count(), assertion_handles.assertion_count(), kb_hl_support_handles.kb_hl_support_count(), deduction_handles.deduction_count());
    }

    public static SubLObject kb_object_count_lists_new_constant_count(final SubLObject kb_object_count_list_1, final SubLObject kb_object_count_list_2) {
        return subtract(kb_object_count_list_1.first(), kb_object_count_list_2.first());
    }

    public static SubLObject kb_object_count_lists_new_nart_count(final SubLObject kb_object_count_list_1, final SubLObject kb_object_count_list_2) {
        return subtract(second(kb_object_count_list_1), second(kb_object_count_list_2));
    }

    public static SubLObject kb_object_count_lists_new_assertion_count(final SubLObject kb_object_count_list_1, final SubLObject kb_object_count_list_2) {
        return subtract(third(kb_object_count_list_1), third(kb_object_count_list_2));
    }

    public static SubLObject kb_object_count_lists_new_kb_hl_support_count(final SubLObject kb_object_count_list_1, final SubLObject kb_object_count_list_2) {
        return subtract(fourth(kb_object_count_list_1), fourth(kb_object_count_list_2));
    }

    public static SubLObject kb_object_count_lists_new_deduction_count(final SubLObject kb_object_count_list_1, final SubLObject kb_object_count_list_2) {
        return subtract(fifth(kb_object_count_list_1), fifth(kb_object_count_list_2));
    }

    public static SubLObject kb_object_count_lists_differentP(final SubLObject kb_object_count_list_1, final SubLObject kb_object_count_list_2) {
        return equal(kb_object_count_list_1, kb_object_count_list_2);
    }

    public static SubLObject showing_new_kb_object_counts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list260);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$214 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list260);
            current_$214 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list260);
            if (NIL == member(current_$214, $list261, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$214 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list260);
        }
        final SubLObject kb_changed_message_tail = property_list_member($KB_CHANGED_MESSAGE, current);
        final SubLObject kb_changed_message = (NIL != kb_changed_message_tail) ? cadr(kb_changed_message_tail) : NIL;
        final SubLObject kb_unchanged_message_tail = property_list_member($KB_UNCHANGED_MESSAGE, current);
        final SubLObject kb_unchanged_message = (NIL != kb_unchanged_message_tail) ? cadr(kb_unchanged_message_tail) : NIL;
        final SubLObject verbosity_tail = property_list_member($VERBOSITY, current);
        final SubLObject verbosity = (NIL != verbosity_tail) ? cadr(verbosity_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject kb_object_count_list_1 = $sym266$KB_OBJECT_COUNT_LIST_1;
        final SubLObject kb_object_count_list_2 = $sym267$KB_OBJECT_COUNT_LIST_2;
        final SubLObject new_constant_count = $sym268$NEW_CONSTANT_COUNT;
        final SubLObject new_nart_count = $sym269$NEW_NART_COUNT;
        final SubLObject new_assertion_count = $sym270$NEW_ASSERTION_COUNT;
        final SubLObject new_kb_hl_support_count = $sym271$NEW_KB_HL_SUPPORT_COUNT;
        final SubLObject new_deduction_count = $sym272$NEW_DEDUCTION_COUNT;
        return listS(CLET, list(bq_cons(kb_object_count_list_1, $list274)), append(body, list(listS(CLET, list(bq_cons(kb_object_count_list_2, $list274), list(new_constant_count, list(KB_OBJECT_COUNT_LISTS_NEW_CONSTANT_COUNT, kb_object_count_list_2, kb_object_count_list_1)), list(new_nart_count, list(KB_OBJECT_COUNT_LISTS_NEW_NART_COUNT, kb_object_count_list_2, kb_object_count_list_1)), list(new_assertion_count, list(KB_OBJECT_COUNT_LISTS_NEW_ASSERTION_COUNT, kb_object_count_list_2, kb_object_count_list_1)), list(new_kb_hl_support_count, list(KB_OBJECT_COUNT_LISTS_NEW_KB_HL_SUPPORT_COUNT, kb_object_count_list_2, kb_object_count_list_1)), list(new_deduction_count, list(KB_OBJECT_COUNT_LISTS_NEW_DEDUCTION_COUNT, kb_object_count_list_2, kb_object_count_list_1))), list(PCOND, list(listS(EQ, verbosity, $list281)), list(list(COR, list(NON_ZERO_INTEGER_P, new_constant_count), list(NON_ZERO_INTEGER_P, new_nart_count), list(NON_ZERO_INTEGER_P, new_assertion_count), list(NON_ZERO_INTEGER_P, new_kb_hl_support_count), list(NON_ZERO_INTEGER_P, new_deduction_count)), list(PWHEN, list(STRINGP, kb_changed_message), list(FORMAT, T, $str286$___A__, kb_changed_message)), list(PWHEN, list(NON_ZERO_INTEGER_P, new_constant_count), list(FORMAT, T, $str287$___s_constant_A__A__, list(ABS, new_constant_count), listS(FIF, listS($sym59$_, list(ABS, new_constant_count), $list290), $list291), listS(FIF, list(POSITIVE_INTEGER_P, new_constant_count), $list293))), list(PWHEN, list(NON_ZERO_INTEGER_P, new_nart_count), list(FORMAT, T, $str294$___s_nart_A__A__, list(ABS, new_nart_count), listS(FIF, listS($sym59$_, list(ABS, new_nart_count), $list290), $list291), listS(FIF, list(POSITIVE_INTEGER_P, new_nart_count), $list293))), list(PWHEN, list(NON_ZERO_INTEGER_P, new_assertion_count), list(FORMAT, T, $str295$___s_assertion_A__A__, list(ABS, new_assertion_count), listS(FIF, listS($sym59$_, list(ABS, new_assertion_count), $list290), $list291), listS(FIF, list(POSITIVE_INTEGER_P, new_assertion_count), $list293))), list(PWHEN, list(NON_ZERO_INTEGER_P, new_kb_hl_support_count), list(FORMAT, T, $str296$___s_kb_hl_support_A__A__, list(ABS, new_kb_hl_support_count), listS(FIF, listS($sym59$_, list(ABS, new_kb_hl_support_count), $list290), $list291), listS(FIF, list(POSITIVE_INTEGER_P, new_kb_hl_support_count), $list293))), list(PWHEN, list(NON_ZERO_INTEGER_P, new_deduction_count), list(FORMAT, T, $str297$___s_deduction_A__A__, list(ABS, new_deduction_count), listS(FIF, listS($sym59$_, list(ABS, new_deduction_count), $list290), $list291), listS(FIF, list(POSITIVE_INTEGER_P, new_deduction_count), $list293)))), list(T, list(PWHEN, list(STRINGP, kb_unchanged_message), list(FORMAT, T, $str286$___A__, kb_unchanged_message)))), $list298))));
    }

    public static SubLObject all_constants_sorted_by_creation_time_estimate() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constants_with_sorting_info = NIL;
        final SubLObject idx = do_constants_table();
        final SubLObject mess = $$$mapping_Cyc_constants;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$215 = idx;
                if (NIL == id_index_objects_empty_p(idx_$215, $SKIP)) {
                    final SubLObject idx_$216 = idx_$215;
                    if (NIL == id_index_dense_objects_empty_p(idx_$216, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$216);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject v_const;
                        SubLObject creation_time;
                        SubLObject creation_second;
                        SubLObject lowest_assertion_id;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            v_const = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(v_const)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(v_const)) {
                                    v_const = $SKIP;
                                }
                                creation_time = bookkeeping_store.creation_time(v_const, UNPROVIDED);
                                creation_second = bookkeeping_store.creation_second(v_const, UNPROVIDED);
                                lowest_assertion_id = lowest_assertion_id_for_constant(v_const);
                                if (NIL == creation_time) {
                                    creation_time = guess_constant_creation_time(v_const);
                                }
                                if (NIL == creation_second) {
                                    creation_second = $UNKNOWN_SECOND;
                                }
                                constants_with_sorting_info = cons(list(v_const, creation_time, creation_second, lowest_assertion_id, creation_time), constants_with_sorting_info);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$217 = idx_$215;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$217)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$217);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$217);
                        final SubLObject end_id = id_index_next_id(idx_$217);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject v_const2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(v_const2))) {
                                SubLObject creation_time2 = bookkeeping_store.creation_time(v_const2, UNPROVIDED);
                                SubLObject creation_second2 = bookkeeping_store.creation_second(v_const2, UNPROVIDED);
                                final SubLObject lowest_assertion_id2 = lowest_assertion_id_for_constant(v_const2);
                                if (NIL == creation_time2) {
                                    creation_time2 = guess_constant_creation_time(v_const2);
                                }
                                if (NIL == creation_second2) {
                                    creation_second2 = $UNKNOWN_SECOND;
                                }
                                constants_with_sorting_info = cons(list(v_const2, creation_time2, creation_second2, lowest_assertion_id2, creation_time2), constants_with_sorting_info);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$218 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$218, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        constants_with_sorting_info = nreverse(constants_with_sorting_info);
        constants_with_sorting_info = Sort.stable_sort(constants_with_sorting_info, $sym301$CONSTANT_SORTING_FUNKY__, symbol_function(FOURTH));
        SubLObject last_date = NIL;
        SubLObject cdolist_list_var = constants_with_sorting_info;
        SubLObject info = NIL;
        info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject date = second(info);
            if (date.isNumber()) {
                last_date = date;
            } else {
                rplaca(nthcdr(FOUR_INTEGER, info), last_date);
            }
            cdolist_list_var = cdolist_list_var.rest();
            info = cdolist_list_var.first();
        } 
        constants_with_sorting_info = Sort.stable_sort(constants_with_sorting_info, SORT_CONSTANTS_BY_SORTING_INFO, symbol_function(CDR));
        return Mapping.mapcar(symbol_function(FIRST), constants_with_sorting_info);
    }

    public static SubLObject guess_constant_creation_time(final SubLObject v_const) {
        SubLObject earliest_time = $most_positive_fixnum$.getGlobalValue();
        SubLObject cdolist_list_var = kb_accessors.all_term_assertions(v_const, NIL);
        SubLObject ass = NIL;
        ass = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject when = assertions_high.asserted_when(ass);
            if ((NIL != when) && when.numL(earliest_time)) {
                earliest_time = when;
            }
            cdolist_list_var = cdolist_list_var.rest();
            ass = cdolist_list_var.first();
        } 
        if (earliest_time.numE($most_positive_fixnum$.getGlobalValue())) {
            return $UNKNOWN_DATE;
        }
        return earliest_time;
    }

    public static SubLObject lowest_assertion_id_for_constant(final SubLObject v_const) {
        SubLObject lowest_id = $most_positive_fixnum$.getGlobalValue();
        SubLObject cdolist_list_var = kb_accessors.all_term_assertions(v_const, NIL);
        SubLObject ass = NIL;
        ass = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject id = assertion_handles.assertion_id(ass);
            if ((NIL != id) && id.numL(lowest_id)) {
                lowest_id = id;
            }
            cdolist_list_var = cdolist_list_var.rest();
            ass = cdolist_list_var.first();
        } 
        if (lowest_id.numE($most_positive_fixnum$.getGlobalValue())) {
            return $UNKNOWN_ID;
        }
        return lowest_id;
    }

    public static SubLObject sort_constants_by_sorting_info(final SubLObject info1, final SubLObject info2) {
        SubLObject date1 = NIL;
        SubLObject second1 = NIL;
        SubLObject id1 = NIL;
        SubLObject dwimmed_date1 = NIL;
        destructuring_bind_must_consp(info1, info1, $list307);
        date1 = info1.first();
        SubLObject current = info1.rest();
        destructuring_bind_must_consp(current, info1, $list307);
        second1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, info1, $list307);
        id1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, info1, $list307);
        dwimmed_date1 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject date2 = NIL;
            SubLObject second2 = NIL;
            SubLObject id2 = NIL;
            SubLObject dwimmed_date2 = NIL;
            destructuring_bind_must_consp(info2, info2, $list308);
            date2 = info2.first();
            SubLObject current_$220 = info2.rest();
            destructuring_bind_must_consp(current_$220, info2, $list308);
            second2 = current_$220.first();
            current_$220 = current_$220.rest();
            destructuring_bind_must_consp(current_$220, info2, $list308);
            id2 = current_$220.first();
            current_$220 = current_$220.rest();
            destructuring_bind_must_consp(current_$220, info2, $list308);
            dwimmed_date2 = current_$220.first();
            current_$220 = current_$220.rest();
            if (NIL == current_$220) {
                if ((dwimmed_date1.isNumber() && dwimmed_date2.isNumber()) && dwimmed_date1.numL(dwimmed_date2)) {
                    return T;
                }
                if ((dwimmed_date1.isNumber() && dwimmed_date2.isNumber()) && dwimmed_date1.numG(dwimmed_date2)) {
                    return NIL;
                }
                if ((second1.isNumber() && second2.isNumber()) && second1.numL(second2)) {
                    return T;
                }
                if ((second1.isNumber() && second2.isNumber()) && second1.numG(second2)) {
                    return NIL;
                }
                if ((id1.isNumber() && id2.isNumber()) && id1.numL(id2)) {
                    return T;
                }
                if ((id1.isNumber() && id2.isNumber()) && id1.numG(id2)) {
                    return NIL;
                }
            } else {
                cdestructuring_bind_error(info2, $list308);
            }
        } else {
            cdestructuring_bind_error(info1, $list307);
        }
        return NIL;
    }

    public static SubLObject constant_sorting_funky_L(final SubLObject object1, final SubLObject object2) {
        return object1.isNumber() ? object2.isNumber() ? numL(object1, object2) : T : object2.isNumber() ? NIL : NIL;
    }

    public static SubLObject definitional_type_for_naut(final SubLObject naut) {
        if (NIL != isa.isaP(naut, $$Collection, UNPROVIDED, UNPROVIDED)) {
            return $$Collection;
        }
        if (NIL != isa.isaP(naut, $$Function_Denotational, UNPROVIDED, UNPROVIDED)) {
            return $$Function_Denotational;
        }
        if (NIL != isa.isaP(naut, $$Predicate, UNPROVIDED, UNPROVIDED)) {
            return $$Predicate;
        }
        if (NIL != isa.isaP(naut, $$Microtheory, UNPROVIDED, UNPROVIDED)) {
            return $$Microtheory;
        }
        return NIL;
    }

    public static SubLObject do_gaf_arg_index_naut(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list309);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list309);
        assertion_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list309);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$221 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list309);
            current_$221 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list309);
            if (NIL == member(current_$221, $list310, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$221 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list309);
        }
        final SubLObject index_tail = property_list_member($INDEX, current);
        final SubLObject index = (NIL != index_tail) ? cadr(index_tail) : NIL;
        final SubLObject predicate_tail = property_list_member($PREDICATE, current);
        final SubLObject predicate = (NIL != predicate_tail) ? cadr(predicate_tail) : NIL;
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject direction_tail = property_list_member($DIRECTION, current);
        final SubLObject direction = (NIL != direction_tail) ? cadr(direction_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject indexed_terms = $sym316$INDEXED_TERMS;
        return list(CLET, list(list(indexed_terms, listS(EXPRESSION_GATHER, v_term, $list318))), list(PWHEN, list(INDEXED_TERM_P, predicate), list(CPUSH, predicate, indexed_terms)), list(DO_OVERLAP_INDEX, list(assertion_var, indexed_terms, $TRUTH, truth, $DONE, done), listS(PWHEN, list(CAND, list(COR, list(NULL, direction), list(EQ, direction, list(ASSERTION_DIRECTION, assertion_var))), list(COR, list(NULL, predicate), list(EQUAL, predicate, list(FORMULA_OPERATOR, list(ASSERTION_FORMULA, assertion_var)))), list(FIF, index, list(EQUAL, v_term, list(FORMULA_ARG, list(ASSERTION_FORMULA, assertion_var), index)), list(TERM_OCCURS_AS_FORMULA_ARGUMENT, v_term, list(ASSERTION_FORMULA, assertion_var)))), append(body, NIL))));
    }

    public static SubLObject do_misc_index_naut(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list329);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list329);
        assertion_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list329);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$222 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list329);
            current_$222 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list329);
            if (NIL == member(current_$222, $list330, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$222 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list329);
        }
        final SubLObject truth_tail = property_list_member($TRUTH, current);
        final SubLObject truth = (NIL != truth_tail) ? cadr(truth_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject indexed_terms = $sym331$INDEXED_TERMS;
        return list(CLET, list(list(indexed_terms, listS(EXPRESSION_GATHER, v_term, $list332))), list(DO_OVERLAP_INDEX, list(assertion_var, indexed_terms, $TRUTH, truth, $DONE, done), listS(PWHEN, list(CAND, list(CNOT, list(TERM_OCCURS_AS_FORMULA_ARGUMENT, v_term, list(ASSERTION_FORMULA, assertion_var))), list(COR, listS(EXPRESSION_FIND, v_term, list(ASSERTION_FORMULA, assertion_var), $list335), listS(EXPRESSION_FIND, v_term, list(ASSERTION_MT, assertion_var), $list335))), append(body, NIL))));
    }

    public static SubLObject map_gaf_arg_index_naut(final SubLObject function, final SubLObject v_term, final SubLObject argnum, SubLObject predicate, SubLObject truth, SubLObject mt) {
        if (predicate == UNPROVIDED) {
            predicate = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != function_spec_p(function) : "Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) " + function;
        assert NIL != narts_high.naut_p(v_term) : "narts_high.naut_p(v_term) " + "CommonSymbols.NIL != narts_high.naut_p(v_term) " + v_term;
        assert NIL != subl_promotions.positive_integer_p(argnum) : "subl_promotions.positive_integer_p(argnum) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(argnum) " + argnum;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_with_just_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_with_just_mt_determine_mt(mt_var), thread);
                SubLObject indexed_terms = cycl_utilities.expression_gather(v_term, INDEXED_TERM_P, NIL, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
                if (NIL != indexed_term_p(predicate)) {
                    indexed_terms = cons(predicate, indexed_terms);
                }
                SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(indexed_terms, UNPROVIDED);
                SubLObject assertion = NIL;
                assertion = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((((NIL == truth) || (NIL != assertions_high.assertion_has_truth(assertion, truth))) && ((NIL == predicate) || predicate.equal(cycl_utilities.formula_operator(assertions_high.assertion_formula(assertion))))) && (NIL != (NIL != argnum ? equal(v_term, cycl_utilities.formula_arg(assertions_high.assertion_formula(assertion), argnum, UNPROVIDED)) : term_occurs_as_formula_argument(v_term, assertions_high.assertion_formula(assertion))))) {
                        funcall(function, assertion);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    public static SubLObject map_misc_index_naut(final SubLObject function, final SubLObject v_term, SubLObject truth) {
        if (truth == UNPROVIDED) {
            truth = NIL;
        }
        assert NIL != function_spec_p(function) : "Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) " + function;
        assert NIL != narts_high.naut_p(v_term) : "narts_high.naut_p(v_term) " + "CommonSymbols.NIL != narts_high.naut_p(v_term) " + v_term;
        final SubLObject indexed_terms = cycl_utilities.expression_gather(v_term, INDEXED_TERM_P, NIL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(indexed_terms, UNPROVIDED);
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((((NIL == truth) || (NIL != assertions_high.assertion_has_truth(assertion, truth))) && (NIL == term_occurs_as_formula_argument(v_term, assertions_high.assertion_formula(assertion)))) && ((NIL != cycl_utilities.expression_find(v_term, assertions_high.assertion_formula(assertion), T, symbol_function(EQUAL), UNPROVIDED)) || (NIL != cycl_utilities.expression_find(v_term, assertions_high.assertion_mt(assertion), T, symbol_function(EQUAL), UNPROVIDED)))) {
                funcall(function, assertion);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject set_to_collection(final SubLObject v_set, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != el_set_p(v_set) : "el_utilities.el_set_p(v_set) " + "CommonSymbols.NIL != el_utilities.el_set_p(v_set) " + v_set;
        final SubLObject base_col = set_type_constraint(v_set, mt);
        if ($$Nothing.eql(base_col)) {
            return base_col;
        }
        SubLObject col = make_binary_formula($$CollectionSubsetFn, base_col, v_set);
        if (NIL != $set_to_collection_uses_reformulatorP$.getDynamicValue(thread)) {
            col = reformulator_hub.reformulate_cycl(col, mt, $list344);
            col = reformulator_hub.reformulate_cycl(col, mt, $list345);
        }
        return col;
    }

    public static SubLObject set_type_constraint(final SubLObject v_set, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != el_intensional_set_p(v_set)) {
            SubLObject current;
            final SubLObject datum = current = cycl_utilities.nat_args(v_set, UNPROVIDED);
            SubLObject el_variable = NIL;
            SubLObject expression = NIL;
            destructuring_bind_must_consp(current, datum, $list346);
            el_variable = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list346);
            expression = current.first();
            current = current.rest();
            if (NIL != current) {
                cdestructuring_bind_error(datum, $list346);
                return NIL;
            }
            final SubLObject cols = at_var_types.formula_variable_isa_constraints(el_variable, expression, mt, UNPROVIDED);
            if (NIL == cols) {
                return $$Nothing;
            }
            if (NIL != list_utilities.singletonP(cols)) {
                return cols.first();
            }
            if (NIL != list_utilities.doubletonP(cols)) {
                return make_binary_formula($$CollectionIntersection2Fn, cols.first(), second(cols));
            }
            return make_unary_formula($$CollectionIntersectionFn, make_formula($$TheSet, cols, UNPROVIDED));
        } else {
            if (NIL != el_non_empty_set_p(v_set)) {
                return $$Thing;
            }
            if (NIL != el_empty_set_p(v_set)) {
                return $$Nothing;
            }
            return Errors.error($str351$_S_was_not_a_set, v_set);
        }
    }

    public static SubLObject clear_cached_union_all_specs_count() {
        final SubLObject cs = $cached_union_all_specs_count_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_union_all_specs_count(final SubLObject cols, final SubLObject mt) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_union_all_specs_count_caching_state$.getGlobalValue(), list(cols, mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_union_all_specs_count_internal(final SubLObject cols, final SubLObject mt) {
        return genls.union_all_specs_count(cols, mt, UNPROVIDED);
    }

    public static SubLObject cached_union_all_specs_count(final SubLObject cols, final SubLObject mt) {
        SubLObject caching_state = $cached_union_all_specs_count_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_UNION_ALL_SPECS_COUNT, $cached_union_all_specs_count_caching_state$, NIL, EQL, TWO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_CACHED_UNION_ALL_SPECS_COUNT);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(cols, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (cols.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(cached_union_all_specs_count_internal(cols, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(cols, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject collection_coverage_ratio(final SubLObject numerator_cols, SubLObject denominator_cols, SubLObject mt) {
        if (denominator_cols == UNPROVIDED) {
            denominator_cols = $list355;
        }
        if (mt == UNPROVIDED) {
            mt = $$EverythingPSC;
        }
        final SubLObject numerator = cached_union_all_specs_count(numerator_cols, mt);
        final SubLObject denominator = cached_union_all_specs_count(denominator_cols, mt);
        return divide(numerator, denominator);
    }

    public static SubLObject union_all_constant_specs_count(final SubLObject cols, final SubLObject mt) {
        return count_if(CONSTANT_P, genls.union_all_specs(cols, mt, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject constant_collection_coverage_ratio(final SubLObject numerator_cols, SubLObject denominator_cols, SubLObject mt) {
        if (denominator_cols == UNPROVIDED) {
            denominator_cols = $list355;
        }
        if (mt == UNPROVIDED) {
            mt = $$EverythingPSC;
        }
        final SubLObject numerator = union_all_constant_specs_count(numerator_cols, mt);
        final SubLObject denominator = union_all_constant_specs_count(denominator_cols, mt);
        return divide(numerator, denominator);
    }

    public static SubLObject compute_kb_covering_collections(final SubLObject n, final SubLObject max_each_spec_cardinality, final SubLObject min_each_spec_cardinality, final SubLObject reorder_wrt_overlap) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_covering_collections = $list355;
        final SubLObject broken_collections_set = set.new_set(symbol_function(EQL), UNPROVIDED);
        SubLObject covering_collections = all_covering_collections;
        final SubLObject coverage = ONE_INTEGER;
        SubLObject smallest_spec_cardinality;
        SubLObject largest_spec_cardinality = smallest_spec_cardinality = cardinality_estimates.spec_cardinality($$Thing);
        final SubLObject min_total_coverage = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$223 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
            final SubLObject _prev_bind_1_$224 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
            final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                while ((((NIL != list_utilities.lengthL(covering_collections, n, UNPROVIDED)) || coverage.numL(min_total_coverage)) || largest_spec_cardinality.numG(max_each_spec_cardinality)) || smallest_spec_cardinality.numL(min_each_spec_cardinality)) {
                    final SubLObject break_col = number_utilities.maximum(all_covering_collections, symbol_function(SPEC_CARDINALITY));
                    all_covering_collections = remove(break_col, all_covering_collections, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    set.set_add(break_col, broken_collections_set);
                    all_covering_collections = break_col_into_specs_and_merge(break_col, all_covering_collections, broken_collections_set, min_each_spec_cardinality);
                    all_covering_collections = Sort.sort(all_covering_collections, symbol_function($sym59$_), symbol_function(SPEC_CARDINALITY));
                    covering_collections = list_utilities.first_n(n, all_covering_collections);
                    largest_spec_cardinality = cardinality_estimates.spec_cardinality(covering_collections.first());
                    smallest_spec_cardinality = cardinality_estimates.spec_cardinality(list_utilities.last_one(covering_collections));
                    print(list(largest_spec_cardinality, smallest_spec_cardinality, break_col, length(all_covering_collections)), UNPROVIDED);
                    force_output(UNPROVIDED);
                } 
            } finally {
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$224, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$223, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(reorder_wrt_overlap); i = add(i, ONE_INTEGER)) {
            covering_collections = optimize_coverage(all_covering_collections, n);
        }
        return covering_collections;
    }

    public static SubLObject print_kb_covering_collections(final SubLObject cols) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        terpri(UNPROVIDED);
        terpri(UNPROVIDED);
        SubLObject cdolist_list_var = cols;
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(T, $str361$_5_d__s__, cardinality_estimates.spec_cardinality(col), col);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        final SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
        try {
            $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
            format(T, $str362$__Total_coverage___S___, multiply($int$100, number_utilities.significant_digits(special_collection_coverage_ratio(cols), FOUR_INTEGER)));
        } finally {
            $read_default_float_format$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject optimize_coverage(final SubLObject cols, final SubLObject n) {
        format(T, $str363$__Optimizing_coverage_via_relativ);
        SubLObject alist = NIL;
        final SubLObject covering_collections = list_utilities.first_n(n, cols);
        SubLObject cdolist_list_var = cols;
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject col_coverage = spec_union_overlap_cardinality(col, remove(col, covering_collections, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            format(T, $str364$_s___s_unique_spec_p__, new SubLObject[]{ col, col_coverage, col_coverage });
            force_output(UNPROVIDED);
            alist = cons(cons(col, col_coverage), alist);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        final SubLObject best_cols = list_utilities.first_n(n, list_utilities.alist_keys(list_utilities.sort_alist_by_values(alist, symbol_function($sym59$_))));
        return best_cols;
    }

    public static SubLObject break_col_into_specs_and_merge(final SubLObject break_col, final SubLObject already_covered_cols, final SubLObject broken_collections_set, final SubLObject min_each_spec_cardinality) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject unsubsumed_new_cols = NIL;
        final SubLObject _prev_bind_0 = $min_each_spec_cardinality$.currentBinding(thread);
        try {
            $min_each_spec_cardinality$.bind(min_each_spec_cardinality, thread);
            SubLObject cdolist_list_var;
            final SubLObject new_cols = cdolist_list_var = remove_if($sym365$FORBIDDEN_KB_COVERING_COLLECTION_, genls.specs(break_col, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject new_col = NIL;
            new_col = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL == set.set_memberP(new_col, broken_collections_set)) && (NIL == set_utilities.set_subset_anyP(all_specs_set(new_col), Mapping.mapcar(ALL_SPECS_SET, already_covered_cols)))) {
                    unsubsumed_new_cols = cons(new_col, unsubsumed_new_cols);
                }
                cdolist_list_var = cdolist_list_var.rest();
                new_col = cdolist_list_var.first();
            } 
        } finally {
            $min_each_spec_cardinality$.rebind(_prev_bind_0, thread);
        }
        return append(unsubsumed_new_cols, already_covered_cols);
    }

    public static SubLObject clear_forbidden_kb_covering_collections_set() {
        final SubLObject cs = $forbidden_kb_covering_collections_set_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_forbidden_kb_covering_collections_set() {
        return memoization_state.caching_state_remove_function_results_with_args($forbidden_kb_covering_collections_set_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject forbidden_kb_covering_collections_set_internal() {
        return set_utilities.set_union(list(set_utilities.construct_set_from_list(isa.union_all_instances($forbidden_kb_covering_collection_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED), symbol_function(EQL), UNPROVIDED), set_utilities.construct_set_from_list(isa.union_all_quoted_instances($forbidden_kb_covering_quoted_collection_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED), symbol_function(EQL), UNPROVIDED), set_utilities.construct_set_from_list(genls.union_all_specs($forbidden_specs$.getGlobalValue(), UNPROVIDED, UNPROVIDED), symbol_function(EQL), UNPROVIDED), set_utilities.construct_set_from_list($forbidden_cols$.getGlobalValue(), symbol_function(EQL), UNPROVIDED)), symbol_function(EQL));
    }

    public static SubLObject forbidden_kb_covering_collections_set() {
        SubLObject caching_state = $forbidden_kb_covering_collections_set_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(FORBIDDEN_KB_COVERING_COLLECTIONS_SET, $forbidden_kb_covering_collections_set_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback(CLEAR_FORBIDDEN_KB_COVERING_COLLECTIONS_SET);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(forbidden_kb_covering_collections_set_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject forbidden_kb_covering_collectionP(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != nart_handles.nart_p(col)) {
            return T;
        }
        if ((NIL != $min_each_spec_cardinality$.getDynamicValue(thread)) && cardinality_estimates.spec_cardinality(col).numL($min_each_spec_cardinality$.getDynamicValue(thread))) {
            return T;
        }
        if (NIL != set.set_memberP(col, forbidden_kb_covering_collections_set())) {
            return T;
        }
        return NIL;
    }

    public static SubLObject spec_union_overlap_cardinality(final SubLObject col, final SubLObject cols) {
        final SubLObject col_specs_set = all_specs_set(col);
        final SubLObject col_spec_cardinality = set.set_size(col_specs_set);
        final SubLObject cols_specs_set = set_utilities.set_union(Mapping.mapcar(ALL_SPECS_SET, cols), symbol_function(EQL));
        final SubLObject common_specs_set = set_utilities.set_intersection(list(col_specs_set, cols_specs_set), symbol_function(EQL));
        final SubLObject common_spec_cardinality = set.set_size(common_specs_set);
        final SubLObject col_unique_spec_cardinality = subtract(col_spec_cardinality, common_spec_cardinality);
        return col_unique_spec_cardinality;
    }

    public static SubLObject spec_overlap_cardinality(final SubLObject col1, final SubLObject col2) {
        final SubLObject col1_specs_set = all_specs_set(col1);
        final SubLObject col1_spec_cardinality = set.set_size(col1_specs_set);
        final SubLObject col2_specs_set = all_specs_set(col2);
        final SubLObject col2_spec_cardinality = set.set_size(col2_specs_set);
        final SubLObject common_specs_set = set_utilities.set_intersection(list(col1_specs_set, col2_specs_set), symbol_function(EQL));
        final SubLObject common_spec_cardinality = set.set_size(common_specs_set);
        final SubLObject col1_unique_spec_cardinality = subtract(col1_spec_cardinality, common_spec_cardinality);
        final SubLObject col2_unique_spec_cardinality = subtract(col2_spec_cardinality, common_spec_cardinality);
        return values(col1_unique_spec_cardinality, col2_unique_spec_cardinality);
    }

    public static SubLObject clear_all_specs_set() {
        final SubLObject cs = $all_specs_set_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_all_specs_set(final SubLObject col) {
        return memoization_state.caching_state_remove_function_results_with_args($all_specs_set_caching_state$.getGlobalValue(), list(col), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject all_specs_set_internal(final SubLObject col) {
        return set_utilities.construct_set_from_list(genls.all_specs(col, $$EverythingPSC, UNPROVIDED), symbol_function(EQL), UNPROVIDED);
    }

    public static SubLObject all_specs_set(final SubLObject col) {
        SubLObject caching_state = $all_specs_set_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ALL_SPECS_SET, $all_specs_set_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_genls_dependent_cache_clear_callback(CLEAR_ALL_SPECS_SET);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, col, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(all_specs_set_internal(col)));
            memoization_state.caching_state_put(caching_state, col, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_all_genls_set() {
        final SubLObject cs = $all_genls_set_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_all_genls_set(final SubLObject col) {
        return memoization_state.caching_state_remove_function_results_with_args($all_genls_set_caching_state$.getGlobalValue(), list(col), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject all_genls_set_internal(final SubLObject col) {
        return set_utilities.construct_set_from_list(genls.all_genls(col, $$EverythingPSC, UNPROVIDED), symbol_function(EQL), UNPROVIDED);
    }

    public static SubLObject all_genls_set(final SubLObject col) {
        SubLObject caching_state = $all_genls_set_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ALL_GENLS_SET, $all_genls_set_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
            memoization_state.register_genls_dependent_cache_clear_callback(CLEAR_ALL_GENLS_SET);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, col, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(all_genls_set_internal(col)));
            memoization_state.caching_state_put(caching_state, col, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject special_collection_coverage_ratio(final SubLObject cols) {
        final SubLObject all_specs = set_utilities.set_union(Mapping.mapcar(ALL_SPECS_SET, cols), UNPROVIDED);
        final SubLObject all_specs_count = set.set_size(all_specs);
        final SubLObject denominator = set.set_size(all_specs_set($$Thing));
        return divide(all_specs_count, denominator);
    }

    public static SubLObject max_non_overlapping_kb_coverage_cols(final SubLObject cols) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject all_cols = all_specs_set($$Thing);
            final SubLObject bad_specs = set_utilities.set_union(Mapping.mapcar(ALL_SPECS_SET, cols), UNPROVIDED);
            final SubLObject bad_cols = set_utilities.set_union(listS(bad_specs, Mapping.mapcar(ALL_GENLS_SET, cols)), UNPROVIDED);
            final SubLObject potential_cols = remove_if($sym365$FORBIDDEN_KB_COVERING_COLLECTION_, set.set_element_list(set_utilities.set_minus(all_cols, bad_cols, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject good_cols = NIL;
            SubLObject cdolist_list_var = potential_cols;
            SubLObject col = NIL;
            col = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == set_utilities.sets_intersectP(list(all_specs_set(col), bad_cols))) {
                    good_cols = cons(col, good_cols);
                }
                cdolist_list_var = cdolist_list_var.rest();
                col = cdolist_list_var.first();
            } 
            final SubLObject max_good_cols = genls.max_cols(good_cols, UNPROVIDED, UNPROVIDED);
            result = Sort.sort(max_good_cols, symbol_function($sym59$_), SPEC_CARDINALITY);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject pretty_print_cycl_to_string(final SubLObject cycl, SubLObject depth) {
        if (depth == UNPROVIDED) {
            depth = ZERO_INTEGER;
        }
        return string_remove_nart_affixes(string_utilities.string_remove_constant_reader_prefixes(format_cycl_expression.format_cycl_expression_to_string(cycl, depth)));
    }

    public static SubLObject string_remove_nart_affixes(final SubLObject string) {
        return string_utilities.do_string_substitutions_robust(string, $list375, UNPROVIDED);
    }

    public static SubLObject collection_subsumption_paths(final SubLObject cols) {
        assert NIL != list_utilities.non_dotted_list_p(cols) : "list_utilities.non_dotted_list_p(cols) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(cols) " + cols;
        SubLObject cdolist_list_var = cols;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != fort_types_interface.collection_p(elem) : "fort_types_interface.collection_p(elem) " + "CommonSymbols.NIL != fort_types_interface.collection_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        if (NIL == cols) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(cols)) {
            return list(cols);
        }
        SubLObject col_alist = NIL;
        cdolist_list_var = cols;
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_set = set_utilities.construct_set_from_list(genls.all_genls_among(col, remove(col, cols, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED), symbol_function(EQL), UNPROVIDED);
            col_alist = list_utilities.alist_enter(col_alist, col, v_set, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        col_alist = nreverse(col_alist);
        return collection_subsumption_paths_int(col_alist);
    }

    public static SubLObject collection_subsumption_paths_int(final SubLObject col_alist) {
        final SubLObject max_genls_count = number_utilities.maximum(Mapping.mapcar(SET_SIZE, list_utilities.alist_values(col_alist)), UNPROVIDED);
        SubLObject lowest_cols = NIL;
        SubLObject cdolist_list_var = col_alist;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject col = NIL;
            SubLObject v_set = NIL;
            destructuring_bind_must_consp(current, datum, $list379);
            col = current.first();
            current = v_set = current.rest();
            if (max_genls_count.numE(set.set_size(v_set))) {
                lowest_cols = cons(col, lowest_cols);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        final SubLObject co_genl_col = collection_subsumption_paths_co_genl_col(lowest_cols, col_alist);
        if (NIL != co_genl_col) {
            lowest_cols = list(co_genl_col);
        }
        final SubLObject other_cols = list_utilities.fast_set_difference(list_utilities.alist_keys(col_alist), lowest_cols, UNPROVIDED);
        final SubLObject recursive_result = collection_subsumption_paths(other_cols);
        if (NIL == recursive_result) {
            return Mapping.mapcar(LIST, lowest_cols);
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var2 = recursive_result;
        SubLObject partial_recursive_result = NIL;
        partial_recursive_result = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject lowest_recursive_col = partial_recursive_result.first();
            SubLObject used_partial_recursive_resultP = NIL;
            SubLObject cdolist_list_var_$225 = lowest_cols;
            SubLObject lowest_col = NIL;
            lowest_col = cdolist_list_var_$225.first();
            while (NIL != cdolist_list_var_$225) {
                final SubLObject lowest_col_genls_set = list_utilities.alist_lookup(col_alist, lowest_col, UNPROVIDED, UNPROVIDED);
                if (NIL != set.set_memberP(lowest_recursive_col, lowest_col_genls_set)) {
                    result = cons(append(list(lowest_col), partial_recursive_result), result);
                    used_partial_recursive_resultP = T;
                }
                cdolist_list_var_$225 = cdolist_list_var_$225.rest();
                lowest_col = cdolist_list_var_$225.first();
            } 
            if (NIL == used_partial_recursive_resultP) {
                result = cons(partial_recursive_result, result);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            partial_recursive_result = cdolist_list_var2.first();
        } 
        return nreverse(result);
    }

    public static SubLObject collection_subsumption_paths_co_genl_col(final SubLObject lowest_cols, final SubLObject col_alist) {
        SubLObject cdolist_list_var = lowest_cols;
        SubLObject col = NIL;
        col = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject genls_set = list_utilities.alist_lookup(col_alist, col, UNPROVIDED, UNPROVIDED);
            final SubLObject set_contents_var = set.do_set_internal(genls_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject genl;
            SubLObject genls_genls_set;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                genl = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, genl)) {
                    genls_genls_set = list_utilities.alist_lookup(col_alist, genl, UNPROVIDED, UNPROVIDED);
                    if (NIL != set.set_memberP(col, genls_genls_set)) {
                        return col;
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            col = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject predicate_subsumption_paths(final SubLObject preds) {
        assert NIL != list_utilities.non_dotted_list_p(preds) : "list_utilities.non_dotted_list_p(preds) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(preds) " + preds;
        SubLObject cdolist_list_var = preds;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != fort_types_interface.predicate_p(elem) : "fort_types_interface.predicate_p(elem) " + "CommonSymbols.NIL != fort_types_interface.predicate_p(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        if (NIL == preds) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(preds)) {
            return list(preds);
        }
        SubLObject pred_alist = NIL;
        cdolist_list_var = preds;
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_set = set_utilities.construct_set_from_list(genl_predicates.all_genl_preds_among(pred, remove(pred, preds, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED), symbol_function(EQL), UNPROVIDED);
            pred_alist = list_utilities.alist_enter(pred_alist, pred, v_set, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        pred_alist = nreverse(pred_alist);
        return predicate_subsumption_paths_int(pred_alist);
    }

    public static SubLObject predicate_subsumption_paths_int(final SubLObject pred_alist) {
        final SubLObject max_genl_preds_count = number_utilities.maximum(Mapping.mapcar(SET_SIZE, list_utilities.alist_values(pred_alist)), UNPROVIDED);
        SubLObject lowest_preds = NIL;
        SubLObject cdolist_list_var = pred_alist;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject pred = NIL;
            SubLObject v_set = NIL;
            destructuring_bind_must_consp(current, datum, $list382);
            pred = current.first();
            current = v_set = current.rest();
            if (max_genl_preds_count.numE(set.set_size(v_set))) {
                lowest_preds = cons(pred, lowest_preds);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        final SubLObject co_genl_pred = predicate_subsumption_paths_co_genl_pred(lowest_preds, pred_alist);
        if (NIL != co_genl_pred) {
            lowest_preds = list(co_genl_pred);
        }
        final SubLObject other_preds = list_utilities.fast_set_difference(list_utilities.alist_keys(pred_alist), lowest_preds, UNPROVIDED);
        final SubLObject recursive_result = predicate_subsumption_paths(other_preds);
        if (NIL == recursive_result) {
            return Mapping.mapcar(LIST, lowest_preds);
        }
        SubLObject result = NIL;
        SubLObject cdolist_list_var2 = recursive_result;
        SubLObject partial_recursive_result = NIL;
        partial_recursive_result = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject lowest_recursive_pred = partial_recursive_result.first();
            SubLObject used_partial_recursive_resultP = NIL;
            SubLObject cdolist_list_var_$226 = lowest_preds;
            SubLObject lowest_pred = NIL;
            lowest_pred = cdolist_list_var_$226.first();
            while (NIL != cdolist_list_var_$226) {
                final SubLObject lowest_pred_genl_preds_set = list_utilities.alist_lookup(pred_alist, lowest_pred, UNPROVIDED, UNPROVIDED);
                if (NIL != set.set_memberP(lowest_recursive_pred, lowest_pred_genl_preds_set)) {
                    result = cons(append(list(lowest_pred), partial_recursive_result), result);
                    used_partial_recursive_resultP = T;
                }
                cdolist_list_var_$226 = cdolist_list_var_$226.rest();
                lowest_pred = cdolist_list_var_$226.first();
            } 
            if (NIL == used_partial_recursive_resultP) {
                result = cons(partial_recursive_result, result);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            partial_recursive_result = cdolist_list_var2.first();
        } 
        return nreverse(result);
    }

    public static SubLObject predicate_subsumption_paths_co_genl_pred(final SubLObject lowest_preds, final SubLObject pred_alist) {
        SubLObject cdolist_list_var = lowest_preds;
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject genl_preds_set = list_utilities.alist_lookup(pred_alist, pred, UNPROVIDED, UNPROVIDED);
            final SubLObject set_contents_var = set.do_set_internal(genl_preds_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject genl;
            SubLObject genl_preds_genl_preds_set;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                genl = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, genl)) {
                    genl_preds_genl_preds_set = list_utilities.alist_lookup(pred_alist, genl, UNPROVIDED, UNPROVIDED);
                    if (NIL != set.set_memberP(pred, genl_preds_genl_preds_set)) {
                        return pred;
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject predicate_type_for_arity(final SubLObject v_arity) {
        final SubLObject predicate_type = list_utilities.alist_lookup($predicate_type_arity_table$.getGlobalValue(), v_arity, symbol_function(EQL), UNPROVIDED);
        assert NIL != forts.fort_p(predicate_type) : "forts.fort_p(predicate_type) " + "CommonSymbols.NIL != forts.fort_p(predicate_type) " + predicate_type;
        return predicate_type;
    }

    public static SubLObject arity_of_predicate_type(final SubLObject predicate_type) {
        final SubLObject v_arity = list_utilities.alist_reverse_lookup($predicate_type_arity_table$.getGlobalValue(), predicate_type, symbol_function(EQL), UNPROVIDED);
        assert NIL != subl_promotions.positive_integer_p(v_arity) : "subl_promotions.positive_integer_p(v_arity) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(v_arity) " + v_arity;
        return v_arity;
    }

    public static SubLObject random_hl_gaf() {
        SubLObject gaf;
        for (gaf = NIL; NIL == hl_gafP(gaf); gaf = assertions_high.random_gaf()) {
        }
        return gaf;
    }

    public static SubLObject random_non_hl_gaf() {
        SubLObject gaf;
        for (gaf = NIL; NIL == non_hl_gafP(gaf); gaf = assertions_high.random_gaf()) {
        }
        return gaf;
    }

    public static SubLObject random_sbhl_gaf() {
        SubLObject gaf;
        for (gaf = NIL; NIL == sbhl_gafP(gaf); gaf = assertions_high.random_gaf()) {
        }
        return gaf;
    }

    public static SubLObject random_non_sbhl_gaf() {
        SubLObject gaf;
        for (gaf = NIL; NIL == non_sbhl_gafP(gaf); gaf = assertions_high.random_gaf()) {
        }
        return gaf;
    }

    public static SubLObject hl_gafP(final SubLObject v_object) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(v_object)) && (NIL != hl_supports.hl_predicate_p(assertions_high.gaf_predicate(v_object))));
    }

    public static SubLObject non_hl_gafP(final SubLObject v_object) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(v_object)) && (NIL == hl_supports.hl_predicate_p(assertions_high.gaf_predicate(v_object))));
    }

    public static SubLObject sbhl_gafP(final SubLObject v_object) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(v_object)) && (NIL != sbhl_module_utilities.sbhl_predicate_p(assertions_high.gaf_predicate(v_object))));
    }

    public static SubLObject non_sbhl_gafP(final SubLObject v_object) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(v_object)) && (NIL == sbhl_module_utilities.sbhl_predicate_p(assertions_high.gaf_predicate(v_object))));
    }

    public static SubLObject random_argnum(final SubLObject formula, SubLObject consider_predicateP) {
        if (consider_predicateP == UNPROVIDED) {
            consider_predicateP = NIL;
        }
        final SubLObject n = add(formula_arity(formula, UNPROVIDED), NIL != consider_predicateP ? ONE_INTEGER : ZERO_INTEGER);
        final SubLObject argnum = add(random.random(n), NIL != consider_predicateP ? ZERO_INTEGER : ONE_INTEGER);
        return argnum;
    }

    public static SubLObject safe_random_closed_argnum(final SubLObject formula, SubLObject consider_predicateP) {
        if (consider_predicateP == UNPROVIDED) {
            consider_predicateP = NIL;
        }
        return random_closed_argnum_int(formula, consider_predicateP, NIL);
    }

    public static SubLObject random_closed_argnum(final SubLObject formula, SubLObject consider_predicateP) {
        if (consider_predicateP == UNPROVIDED) {
            consider_predicateP = NIL;
        }
        return random_closed_argnum_int(formula, consider_predicateP, T);
    }

    public static SubLObject random_closed_argnum_int(final SubLObject formula, final SubLObject consider_predicateP, final SubLObject error_if_all_args_openP) {
        SubLObject result = NIL;
        SubLObject count = ZERO_INTEGER;
        while (NIL == result) {
            count = add(count, ONE_INTEGER);
            if (count.numG($int$10000)) {
                if (NIL == error_if_all_args_openP) {
                    Errors.warn($str384$All_args_of__s_were_open, formula);
                    return NIL;
                }
                Errors.error($str384$All_args_of__s_were_open, formula);
            }
            final SubLObject argnum = random_argnum(formula, consider_predicateP);
            if (NIL != closedP(cycl_utilities.formula_arg(formula, argnum, UNPROVIDED), UNPROVIDED)) {
                result = argnum;
            }
        } 
        return result;
    }

    public static SubLObject turn_a_random_arg_into_a_variable(final SubLObject formula, SubLObject consider_predicateP) {
        if (consider_predicateP == UNPROVIDED) {
            consider_predicateP = NIL;
        }
        final SubLObject argnum = random_argnum(formula, consider_predicateP);
        final SubLObject new_var = czer_utilities.unique_el_var_wrt_expression(formula, UNPROVIDED);
        return replace_formula_arg(argnum, new_var, formula);
    }

    public static SubLObject random_predicate() {
        SubLObject pred;
        for (pred = NIL; NIL == fort_types_interface.predicate_p(pred); pred = forts.random_fort(UNPROVIDED)) {
        }
        return pred;
    }

    public static SubLObject random_binary_predicate() {
        SubLObject pred;
        for (pred = NIL; (NIL == fort_types_interface.predicate_p(pred)) || (NIL == isa.isaP(pred, $$BinaryPredicate, UNPROVIDED, UNPROVIDED)); pred = forts.random_fort(UNPROVIDED)) {
        }
        return pred;
    }

    public static SubLObject gather_dates(final SubLObject expression, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = cycl_utilities.expression_gather(expression, $sym386$DATE_, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject dateP(final SubLObject v_object) {
        return at_defns.quiet_has_typeP(v_object, $$Date, UNPROVIDED);
    }

    public static SubLObject not_at_all_commutative_predicate_p(final SubLObject v_object) {
        return makeBoolean(((NIL != fort_types_interface.predicate_p(v_object)) && (NIL == fort_types_interface.commutative_relation_p(v_object))) && (NIL == fort_types_interface.partially_commutative_relation_p(v_object)));
    }

    public static SubLObject at_least_partially_commutative_predicate_p(final SubLObject v_object) {
        return makeBoolean((NIL != fort_types_interface.predicate_p(v_object)) && ((NIL != fort_types_interface.commutative_relation_p(v_object)) || (NIL != fort_types_interface.partially_commutative_relation_p(v_object))));
    }

    public static SubLObject not_at_all_commutative_relation_p(final SubLObject relation) {
        return makeBoolean((NIL == fort_types_interface.commutative_relation_p(relation)) && (NIL == fort_types_interface.partially_commutative_relation_p(relation)));
    }

    public static SubLObject at_least_partially_commutative_relation_p(final SubLObject relation) {
        return makeBoolean((NIL != fort_types_interface.commutative_relation_p(relation)) || (NIL != fort_types_interface.partially_commutative_relation_p(relation)));
    }

    public static SubLObject find_invalid_constant_references(final SubLObject string) {
        SubLObject references = NIL;
        SubLObject cdolist_list_var = string_utilities.search_all(constant_reader.constant_reader_prefix(), string, symbol_function(EQUAL), UNPROVIDED);
        SubLObject position = NIL;
        position = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject start = add(position, TWO_INTEGER);
            final SubLObject end = list_utilities.position_if_not(VALID_CONSTANT_NAME_CHAR_P, string, symbol_function(IDENTITY), start, UNPROVIDED);
            final SubLObject name_string = string_utilities.substring(string, start, end);
            SubLObject validP = valid_constantP(constants_high.find_constant(name_string), UNPROVIDED);
            for (SubLObject shortened = name_string; ((NIL == validP) && (NIL != string_utilities.non_empty_string_p(shortened))) && (NIL != member(string_utilities.last_char(shortened), $list389, UNPROVIDED, UNPROVIDED)); shortened = string_utilities.remove_last_char(shortened, UNPROVIDED) , validP = constants_high.find_constant(shortened)) {
            }
            if (NIL == validP) {
                references = cons(cons(start, name_string), references);
            }
            cdolist_list_var = cdolist_list_var.rest();
            position = cdolist_list_var.first();
        } 
        return references;
    }

    public static SubLObject fix_invalid_constant_references(final SubLObject assertion) {
        assert NIL != assertions_high.gaf_assertionP(assertion) : "assertions_high.gaf_assertionP(assertion) " + "CommonSymbols.NIL != assertions_high.gaf_assertionP(assertion) " + assertion;
        SubLObject new_sentence;
        final SubLObject old_sentence = new_sentence = ke.ke_assertion_edit_formula(assertion);
        final SubLObject terms = cycl_utilities.formula_terms(old_sentence, $IGNORE);
        SubLObject list_var = NIL;
        SubLObject v_term = NIL;
        SubLObject argnum = NIL;
        list_var = terms;
        v_term = list_var.first();
        for (argnum = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , v_term = list_var.first() , argnum = number_utilities.f_1X(argnum)) {
            if (v_term.isString()) {
                SubLObject new_string = v_term;
                SubLObject cdolist_list_var = list_utilities.sort_alist_by_keys(find_invalid_constant_references(v_term), symbol_function($sym59$_));
                SubLObject cons = NIL;
                cons = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = cons;
                    SubLObject start = NIL;
                    SubLObject name = NIL;
                    destructuring_bind_must_consp(current, datum, $list392);
                    start = current.first();
                    current = name = current.rest();
                    new_string = fix_invalid_constant_reference(new_string, name, start, UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    cons = cdolist_list_var.first();
                } 
                if (!new_string.eql(v_term)) {
                    new_sentence = replace_formula_arg(argnum, new_string, new_sentence);
                }
            }
        }
        if (!new_sentence.eql(old_sentence)) {
            ke.ke_edit_assertion_strings(assertion, new_sentence, assertion_utilities.all_meta_assertions(assertion));
        }
        return new_sentence.eql(old_sentence) ? NIL : new_sentence;
    }

    public static SubLObject fix_invalid_constant_reference(final SubLObject string, final SubLObject name, final SubLObject start, SubLObject recursedP) {
        if (recursedP == UNPROVIDED) {
            recursedP = NIL;
        }
        final SubLObject former_constants = find_former_constants_named(name);
        SubLObject new_string = string;
        if (NIL != list_utilities.singletonP(former_constants)) {
            new_string = string_utilities.nreplace_substring_at(new_string, start, length(name), constants_high.constant_name(former_constants.first()));
        } else
            if ((((NIL == recursedP) && (NIL != list_utilities.empty_list_p(former_constants))) && (NIL != string_utilities.non_empty_string_p(name))) && CHAR_s.eql(string_utilities.last_char(name))) {
                new_string = fix_invalid_constant_reference(string, string_utilities.remove_last_char(name, UNPROVIDED), start, T);
            }

        return new_string;
    }

    public static SubLObject find_former_constants_named(final SubLObject string) {
        return kb_mapping_utilities.pred_values_in_any_mt(string, $$oldConstantName, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
    }

    public static SubLObject coasserted_forts(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        SubLObject v_forts = NIL;
        final SubLObject _prev_bind_0 = $coasserted_fort_source$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $coasserted_fort_set$.currentBinding(thread);
        try {
            $coasserted_fort_source$.bind(fort, thread);
            $coasserted_fort_set$.bind(set_contents.new_set_contents(kb_indexing.num_index(fort), symbol_function(EQL)), thread);
            if (NIL != kb_mapping_macros.do_term_index_key_validator(fort, NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(fort, NIL);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                            SubLObject done_var_$227 = NIL;
                            final SubLObject token_var_$228 = NIL;
                            while (NIL == done_var_$227) {
                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$228);
                                final SubLObject valid_$229 = makeBoolean(!token_var_$228.eql(assertion));
                                if ((NIL != valid_$229) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(assertion, final_index_spec))) {
                                    final SubLObject assertion_cons = assertions_high.assertion_cons(assertion);
                                    list_utilities.tree_find_if(symbol_function(VISIT_COASSERTED_FORT), assertion_cons, UNPROVIDED);
                                }
                                done_var_$227 = makeBoolean(NIL == valid_$229);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$230 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$230, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            v_forts = set_contents.set_contents_element_list($coasserted_fort_set$.getDynamicValue(thread));
        } finally {
            $coasserted_fort_set$.rebind(_prev_bind_2, thread);
            $coasserted_fort_source$.rebind(_prev_bind_0, thread);
        }
        return v_forts;
    }

    public static SubLObject visit_coasserted_fort(final SubLObject other_fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != forts.fort_p(other_fort)) && (!other_fort.eql($coasserted_fort_source$.getDynamicValue(thread)))) {
            $coasserted_fort_set$.setDynamicValue(set_contents.set_contents_add(other_fort, $coasserted_fort_set$.getDynamicValue(thread), symbol_function(EQL)), thread);
        }
        return NIL;
    }

    public static SubLObject clear_cached_compact_hl_external_id_string() {
        final SubLObject cs = $cached_compact_hl_external_id_string_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_compact_hl_external_id_string(final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_compact_hl_external_id_string_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_compact_hl_external_id_string_internal(final SubLObject v_term) {
        return compact_hl_external_id_string(v_term);
    }

    public static SubLObject cached_compact_hl_external_id_string(final SubLObject v_term) {
        SubLObject caching_state = $cached_compact_hl_external_id_string_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(CACHED_COMPACT_HL_EXTERNAL_ID_STRING, $cached_compact_hl_external_id_string_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_compact_hl_external_id_string_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject write_coasserted_forts(final SubLObject fort, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject other_forts = coasserted_forts(fort);
        write_string(cached_compact_hl_external_id_string(fort), stream, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = other_forts;
        SubLObject other_fort = NIL;
        other_fort = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
            write_string(cached_compact_hl_external_id_string(other_fort), stream, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            other_fort = cdolist_list_var.first();
        } 
        terpri(stream);
        return length(other_forts);
    }

    public static SubLObject write_all_coasserted_forts_to_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str399$Unable_to_open__S, filename);
            }
            final SubLObject stream_$231 = stream;
            final SubLObject message = $$$Writing_coasserted_forts;
            final SubLObject total = forts.fort_count();
            SubLObject sofar = ZERO_INTEGER;
            final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message);
                    SubLObject cdolist_list_var = forts.do_forts_tables();
                    SubLObject table_var = NIL;
                    table_var = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject idx = table_var;
                        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                            final SubLObject idx_$232 = idx;
                            if (NIL == id_index_dense_objects_empty_p(idx_$232, $SKIP)) {
                                final SubLObject vector_var = id_index_dense_objects(idx_$232);
                                final SubLObject backwardP_var = NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject id;
                                SubLObject fort;
                                SubLObject message_var;
                                SubLObject was_appendingP;
                                SubLObject _prev_bind_0_$233;
                                SubLObject _prev_bind_0_$234;
                                SubLObject _values;
                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                    fort = aref(vector_var, id);
                                    if ((NIL == id_index_tombstone_p(fort)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(fort)) {
                                            fort = $SKIP;
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                        message_var = NIL;
                                        was_appendingP = eval($sym401$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
                                        eval($list402);
                                        try {
                                            try {
                                                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                                _prev_bind_0_$233 = Errors.$error_handler$.currentBinding(thread);
                                                try {
                                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                    try {
                                                        write_coasserted_forts(fort, stream_$231);
                                                    } catch (final Throwable catch_var) {
                                                        Errors.handleThrowable(catch_var, NIL);
                                                    }
                                                } finally {
                                                    Errors.$error_handler$.rebind(_prev_bind_0_$233, thread);
                                                }
                                            } catch (final Throwable ccatch_env_var) {
                                                message_var = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                            } finally {
                                                thread.throwStack.pop();
                                            }
                                        } finally {
                                            _prev_bind_0_$234 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                _values = getValuesAsVector();
                                                eval(list(CSETQ, $sym401$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP));
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$234, thread);
                                            }
                                        }
                                        if (message_var.isString()) {
                                            Errors.warn($str405$_A, message_var);
                                        }
                                    }
                                }
                            }
                            final SubLObject idx_$233 = idx;
                            if ((NIL == id_index_sparse_objects_empty_p(idx_$233)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                final SubLObject sparse = id_index_sparse_objects(idx_$233);
                                SubLObject id2 = id_index_sparse_id_threshold(idx_$233);
                                final SubLObject end_id = id_index_next_id(idx_$233);
                                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                while (id2.numL(end_id)) {
                                    final SubLObject fort2 = gethash_without_values(id2, sparse, v_default);
                                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort2))) {
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                        SubLObject message_var2 = NIL;
                                        final SubLObject was_appendingP2 = eval($sym401$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__);
                                        eval($list402);
                                        try {
                                            try {
                                                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                                final SubLObject _prev_bind_0_$235 = Errors.$error_handler$.currentBinding(thread);
                                                try {
                                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                    try {
                                                        write_coasserted_forts(fort2, stream_$231);
                                                    } catch (final Throwable catch_var2) {
                                                        Errors.handleThrowable(catch_var2, NIL);
                                                    }
                                                } finally {
                                                    Errors.$error_handler$.rebind(_prev_bind_0_$235, thread);
                                                }
                                            } catch (final Throwable ccatch_env_var2) {
                                                message_var2 = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
                                            } finally {
                                                thread.throwStack.pop();
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$236 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values2 = getValuesAsVector();
                                                eval(list(CSETQ, $sym401$_APPEND_STACK_TRACES_TO_ERROR_MESSAGES__, was_appendingP2));
                                                restoreValuesFromVector(_values2);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$236, thread);
                                            }
                                        }
                                        if (message_var2.isString()) {
                                            Errors.warn($str405$_A, message_var2);
                                        }
                                    }
                                    id2 = add(id2, ONE_INTEGER);
                                } 
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        table_var = cdolist_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$237 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$237, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                $last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values4 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values4);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return NIL;
    }

    public static SubLObject core_union_constantP(final SubLObject v_object) {
        return makeBoolean((NIL != constant_p(v_object)) && (NIL != isa.quoted_isaP(v_object, $$CoreUnionConstant, $$BookkeepingMt, UNPROVIDED)));
    }

    public static SubLObject non_core_union_constantP(final SubLObject v_object) {
        return makeBoolean((NIL != constant_p(v_object)) && (NIL == core_union_constantP(v_object)));
    }

    public static SubLObject non_core_union_constants(final SubLObject expression) {
        return cycl_utilities.expression_gather(expression, $sym408$NON_CORE_UNION_CONSTANT_, T, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject create_spec_mt(final SubLObject mt, SubLObject name_prefix) {
        if (name_prefix == UNPROVIDED) {
            name_prefix = $$$SpecMt;
        }
        assert NIL != fort_types_interface.microtheory_p(mt) : "fort_types_interface.microtheory_p(mt) " + "CommonSymbols.NIL != fort_types_interface.microtheory_p(mt) " + mt;
        final SubLObject name = cconcatenate(name_prefix, string_utilities.str(random.random($int$100000)));
        final SubLObject spec_mt = cyc_kernel.cyc_create_new_ephemeral(name);
        return cyc_kernel.cyc_assert(list($$genlMt, spec_mt, mt), mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject hl_object_to_evaluatable_string(final SubLObject v_object, SubLObject testP) {
        if (testP == UNPROVIDED) {
            testP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        dumper.$last_invalid_assertion$.setDynamicValue(NIL, thread);
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $print_length$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $print_level$.currentBinding(thread);
        try {
            $print_pretty$.bind(NIL, thread);
            $print_length$.bind(NIL, thread);
            $print_level$.bind(NIL, thread);
            if (((((NIL == v_object) || (NIL != constant_p(v_object))) || v_object.isString()) || v_object.isNumber()) || v_object.isKeyword()) {
                final SubLObject result = prin1_to_string(v_object);
                if ((NIL != testP) && (!v_object.equalp(eval(read_from_string(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))))) {
                    Errors.warn($str413$Unable_to_create_HL_object_evalua, v_object);
                    return NIL;
                }
                return result;
            } else
                if (v_object.isSymbol()) {
                    SubLObject result = prin1_to_string(v_object);
                    result = cconcatenate($str414$_, result);
                    if ((NIL != testP) && (!v_object.equalp(eval(read_from_string(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))))) {
                        Errors.warn($str413$Unable_to_create_HL_object_evalua, v_object);
                        return NIL;
                    }
                    return result;
                } else
                    if (NIL != Guids.guid_p(v_object)) {
                        final SubLObject result = cconcatenate($str415$_string_to_guid_, new SubLObject[]{ prin1_to_string(Guids.guid_to_string(v_object)), $str416$_ });
                        if ((NIL != testP) && (!v_object.equalp(eval(read_from_string(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))))) {
                            Errors.warn($str413$Unable_to_create_HL_object_evalua, v_object);
                            return NIL;
                        }
                        return result;
                    } else {
                        if (NIL == variables.variable_p(v_object)) {
                            final SubLObject transformed_object = transform_list_utilities.transform(v_object, $sym418$IS_TRANSFORMABLE_HL_OBJECT_INT_, MAKE_HL_READABLE_INT, UNPROVIDED);
                            final SubLObject orig_result = prin1_to_string(transformed_object);
                            SubLObject result2 = string_utilities.copy_string(orig_result);
                            if (NIL != string_utilities.substringP($$$AAAAAAAAAAAAA, result2, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
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
                                for (result2 = string_utilities.string_substitute($str421$__find_nart__, $str422$_AAAAAAAAAAAAAFIND_NART_, result2, UNPROVIDED), result2 = string_utilities.string_substitute($str423$__find_variable_by_id_, $str424$_AAAAAAAAAAAAAFIND_VARIABLE_BY_ID, result2, UNPROVIDED), result2 = string_utilities.string_substitute($str425$__string_to_guid_, $str426$_AAAAAAAAAAAAASTRING_TO_GUID_, result2, UNPROVIDED), result2 = string_utilities.string_substitute($str427$__find_assertion__, $str428$_AAAAAAAAAAAAAFIND_ASSERTION_, result2, UNPROVIDED), result2 = string_utilities.string_substitute($str429$__find_deduction__, $str430$_AAAAAAAAAAAAAFIND_DEDUCTION_, result2, UNPROVIDED), result2 = string_utilities.string_substitute($str431$__find_kb_hl_support__, $str432$_AAAAAAAAAAAAAFIND_KB_HL_SUPPORT_, result2, UNPROVIDED), result2 = string_utilities.string_substitute($str433$_, $str434$_AAAAAAAAAAAAA__, result2, UNPROVIDED); NIL != string_utilities.substringP($str435$_AAAAAAAAAAAAAFIND_VARIABLE_BY_ID, result2, UNPROVIDED, UNPROVIDED, UNPROVIDED); result2 = string_utilities.string_substitute(cconcatenate($str439$_____find_variable_by_id_, new SubLObject[]{ num, $str416$_ }), cconcatenate($str435$_AAAAAAAAAAAAAFIND_VARIABLE_BY_ID, num), result2, UNPROVIDED)) {
                                    input_string = result2;
                                    function_name = $str436$AAAAAAAAAAAAAFIND_VARIABLE_BY_ID;
                                    pattern = cconcatenate(function_name, new SubLObject[]{ $$$_, $str437$_0_9__ });
                                    offset = regular_expression_utilities.offsets_of_regex_matches(pattern, input_string, UNPROVIDED, UNPROVIDED).first();
                                    if (offset.isCons()) {
                                        datum = current = offset;
                                        start = NIL;
                                        end = NIL;
                                        destructuring_bind_must_consp(current, datum, $list438);
                                        start = current.first();
                                        current = end = current.rest();
                                        index = add(start, length(function_name), length($$$_));
                                        num = string_utilities.substring(input_string, index, end);
                                    }
                                }
                            }
                            if (!orig_result.equalp(result2)) {
                                result2 = cconcatenate($str433$_, result2);
                            } else
                                if (transformed_object.isList()) {
                                    result2 = cconcatenate($str414$_, result2);
                                }

                            final SubLObject _prev_bind_0_$239 = $bootstrapping_kbP$.currentBinding(thread);
                            try {
                                $bootstrapping_kbP$.bind(T, thread);
                                if ((NIL != testP) && (!v_object.equalp(eval(read_from_string(result2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))))) {
                                    Errors.warn($str440$Unable_to_create_HL_object_evalua, v_object);
                                    return NIL;
                                }
                            } finally {
                                $bootstrapping_kbP$.rebind(_prev_bind_0_$239, thread);
                            }
                            return result2;
                        }
                        final SubLObject result = cconcatenate($str417$_find_variable_by_id_, new SubLObject[]{ prin1_to_string(variables.variable_id(v_object)), $str416$_ });
                        if ((NIL != testP) && (!v_object.equalp(eval(read_from_string(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))))) {
                            Errors.warn($str413$Unable_to_create_HL_object_evalua, v_object);
                            return NIL;
                        }
                        return result;
                    }


        } finally {
            $print_level$.rebind(_prev_bind_3, thread);
            $print_length$.rebind(_prev_bind_2, thread);
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject is_transformable_hl_object_intP(final SubLObject obj) {
        return makeBoolean((((((NIL != nart_handles.nart_p(obj)) || (NIL != variables.variable_p(obj))) || (NIL != Guids.guid_p(obj))) || (NIL != assertion_handles.assertion_p(obj))) || (NIL != kb_hl_support_handles.kb_hl_support_p(obj))) || (NIL != deduction_handles.deduction_p(obj)));
    }

    public static SubLObject make_hl_readable_int(final SubLObject hl) {
        if (NIL != nart_handles.nart_p(hl)) {
            return list(AAAAAAAAAAAAAFIND_NART, narts_high.nart_hl_formula(hl));
        }
        if (NIL != variables.variable_p(hl)) {
            return list(AAAAAAAAAAAAAFIND_VARIABLE_BY_ID, variables.variable_id(hl));
        }
        if (NIL != Guids.guid_p(hl)) {
            return list(AAAAAAAAAAAAASTRING_TO_GUID, Guids.guid_to_string(hl));
        }
        if (NIL != assertion_handles.assertion_p(hl)) {
            return list(AAAAAAAAAAAAAFIND_ASSERTION, assertions_high.assertion_cnf(hl), $list445, assertions_high.assertion_mt(hl));
        }
        if (NIL != deduction_handles.deduction_p(hl)) {
            return list(AAAAAAAAAAAAAFIND_DEDUCTION, deductions_high.deduction_supported_object(hl), $list445, deductions_high.deduction_supports(hl), deductions_high.deduction_truth(hl));
        }
        if (NIL != kb_hl_support_handles.kb_hl_support_p(hl)) {
            return list(AAAAAAAAAAAAAFIND_KB_HL_SUPPORT, kb_hl_supports_high.kb_hl_support_hl_support(hl));
        }
        Errors.error($str448$Unexpected_situation_);
        return NIL;
    }

    public static SubLObject kbeq(final SubLObject obj1, final SubLObject obj2) {
        return eq(obj1, obj2);
    }

    public static SubLObject binary_gaf_p(final SubLObject v_object) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(v_object)) && (NIL != el_binary_formula_p(assertions_high.gaf_formula(v_object))));
    }

    public static SubLObject fort_alphanumeric_name(final SubLObject fort) {
        assert NIL != forts.fort_p(fort) : "forts.fort_p(fort) " + "CommonSymbols.NIL != forts.fort_p(fort) " + fort;
        if (NIL != constant_p(fort)) {
            return constants_high.constant_name(fort);
        }
        return string_utilities.alphanumericize_admitting_hyphens(string_utilities.string_subst($str449$_, $$$_, string_utilities.str(fort), UNPROVIDED));
    }

    public static SubLObject unassert_gaf_arg_index(final SubLObject fort, final SubLObject pred, final SubLObject argnum, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject asents_to_blast = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, argnum, pred)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, argnum, pred);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$240 = NIL;
                            final SubLObject token_var_$241 = NIL;
                            while (NIL == done_var_$240) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$241);
                                final SubLObject valid_$242 = makeBoolean(!token_var_$241.eql(gaf));
                                if (NIL != valid_$242) {
                                    asents_to_blast = cons(fi.assertion_hl_formula(gaf, UNPROVIDED), asents_to_blast);
                                }
                                done_var_$240 = makeBoolean(NIL == valid_$242);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$243 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$243, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            SubLObject cdolist_list_var = asents_to_blast;
            SubLObject asent_to_blast = NIL;
            asent_to_blast = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cyc_kernel.cyc_remove_all_arguments(asent_to_blast, mt);
                cdolist_list_var = cdolist_list_var.rest();
                asent_to_blast = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return asents_to_blast;
    }

    public static SubLObject unassert_entire_gaf_arg_index(final SubLObject fort, final SubLObject pred, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject asent_mt_pairs_to_blast = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(fort, argnum, pred)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(fort, argnum, pred);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$244 = NIL;
                            final SubLObject token_var_$245 = NIL;
                            while (NIL == done_var_$244) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$245);
                                final SubLObject valid_$246 = makeBoolean(!token_var_$245.eql(gaf));
                                if (NIL != valid_$246) {
                                    asent_mt_pairs_to_blast = cons(cons(fi.assertion_hl_formula(gaf, UNPROVIDED), assertions_high.assertion_mt(gaf)), asent_mt_pairs_to_blast);
                                }
                                done_var_$244 = makeBoolean(NIL == valid_$246);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$247 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$247, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = asent_mt_pairs_to_blast;
        SubLObject asent_mt_pair_to_blast = NIL;
        asent_mt_pair_to_blast = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = asent_mt_pair_to_blast;
            SubLObject asent_to_blast = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list451);
            asent_to_blast = current.first();
            current = mt = current.rest();
            cyc_kernel.cyc_remove_all_arguments(asent_to_blast, mt);
            cdolist_list_var = cdolist_list_var.rest();
            asent_mt_pair_to_blast = cdolist_list_var.first();
        } 
        return asent_mt_pairs_to_blast;
    }

    public static SubLObject unassert_predicate_extent_index(final SubLObject pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject asents_to_blast = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$248 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$249 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                try {
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    $progress_count$.bind(ZERO_INTEGER, thread);
                    $is_noting_progressP$.bind(T, thread);
                    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                    noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$250 = NIL;
                                final SubLObject token_var_$251 = NIL;
                                while (NIL == done_var_$250) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$251);
                                    final SubLObject valid_$252 = makeBoolean(!token_var_$251.eql(gaf));
                                    if (NIL != valid_$252) {
                                        asents_to_blast = cons(fi.assertion_hl_formula(gaf, UNPROVIDED), asents_to_blast);
                                    }
                                    done_var_$250 = makeBoolean(NIL == valid_$252);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$249 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$249, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$249, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$248, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = asents_to_blast;
        SubLObject asent_to_blast = NIL;
        asent_to_blast = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cyc_kernel.cyc_remove_all_arguments(asent_to_blast, mt);
            cdolist_list_var = cdolist_list_var.rest();
            asent_to_blast = cdolist_list_var.first();
        } 
        return asents_to_blast;
    }

    public static SubLObject unassert_entire_predicate_extent_index(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject asent_mt_pairs_to_blast = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$254 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$255 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                try {
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    $progress_count$.bind(ZERO_INTEGER, thread);
                    $is_noting_progressP$.bind(T, thread);
                    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                    noting_progress_preamble(str);
                    final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            note_progress();
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                SubLObject done_var_$256 = NIL;
                                final SubLObject token_var_$257 = NIL;
                                while (NIL == done_var_$256) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$257);
                                    final SubLObject valid_$258 = makeBoolean(!token_var_$257.eql(gaf));
                                    if (NIL != valid_$258) {
                                        asent_mt_pairs_to_blast = cons(cons(fi.assertion_hl_formula(gaf, UNPROVIDED), assertions_high.assertion_mt(gaf)), asent_mt_pairs_to_blast);
                                    }
                                    done_var_$256 = makeBoolean(NIL == valid_$258);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$255 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$255, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$255, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$254, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var = asent_mt_pairs_to_blast;
        SubLObject asent_mt_pair_to_blast = NIL;
        asent_mt_pair_to_blast = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = asent_mt_pair_to_blast;
            SubLObject asent_to_blast = NIL;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list451);
            asent_to_blast = current.first();
            current = mt = current.rest();
            cyc_kernel.cyc_remove_all_arguments(asent_to_blast, mt);
            cdolist_list_var = cdolist_list_var.rest();
            asent_mt_pair_to_blast = cdolist_list_var.first();
        } 
        return asent_mt_pairs_to_blast;
    }

    public static SubLObject unassert_entire_function_extent_index(final SubLObject func) {
        SubLObject narts_to_kill = NIL;
        if (NIL != kb_mapping_macros.do_function_extent_index_key_validator(func)) {
            final SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec(func);
            SubLObject final_index_iterator = NIL;
            try {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject tou_gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(tou_gaf));
                    if (NIL != valid) {
                        final SubLObject nart = assertions_high.gaf_arg1(tou_gaf);
                        narts_to_kill = cons(nart, narts_to_kill);
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            } finally {
                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values = getValuesAsVector();
                    if (NIL != final_index_iterator) {
                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
        }
        SubLObject cdolist_list_var = narts_to_kill;
        SubLObject nart_to_kill = NIL;
        nart_to_kill = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            cyc_kernel.cyc_kill(nart_to_kill);
            cdolist_list_var = cdolist_list_var.rest();
            nart_to_kill = cdolist_list_var.first();
        } 
        return narts_to_kill;
    }

    public static SubLObject randomly_select_constants(final SubLObject n) {
        return randomly_select_interned_items(n, constant_count(), FIND_CONSTANT_BY_SUID);
    }

    public static SubLObject randomly_select_narts(final SubLObject n) {
        return randomly_select_interned_items(n, nart_handles.nart_count(), FIND_NART_BY_ID);
    }

    public static SubLObject randomly_select_assertions(final SubLObject n) {
        return randomly_select_interned_items(n, assertion_handles.assertion_count(), FIND_ASSERTION_BY_ID);
    }

    public static SubLObject randomly_select_deductions(final SubLObject n) {
        return randomly_select_interned_items(n, deduction_handles.deduction_count(), FIND_DEDUCTION_BY_ID);
    }

    public static SubLObject randomly_select_kb_hl_supports(final SubLObject n) {
        return randomly_select_interned_items(n, kb_hl_support_handles.kb_hl_support_count(), FIND_KB_HL_SUPPORT_BY_ID);
    }

    public static SubLObject randomly_select_clause_strucs(final SubLObject n) {
        return randomly_select_interned_items(n, clause_strucs.clause_struc_count(), FIND_CLAUSE_STRUC_BY_ID);
    }

    public static SubLObject randomly_select_interned_items(SubLObject num, final SubLObject high, final SubLObject finder_fn) {
        final SubLObject slice = integerDivide(high, num);
        SubLObject curr = ZERO_INTEGER;
        SubLObject items = NIL;
        while (num.isPositive() && curr.numL(high)) {
            for (SubLObject attempts = slice, item = NIL; attempts.isPositive() && (NIL == item); attempts = subtract(attempts, ONE_INTEGER)) {
                final SubLObject spot = add(curr, random.random(slice));
                item = funcall(finder_fn, spot);
                if (NIL != item) {
                    num = subtract(num, ONE_INTEGER);
                    items = cons(item, items);
                }
            }
            curr = add(curr, slice);
        } 
        return nreverse(items);
    }

    public static SubLObject next_deduction(final SubLObject deduction) {
        return next_deduction_from_id(deduction_handles.deduction_id(deduction));
    }

    public static SubLObject next_deduction_from_id(final SubLObject d_id) {
        return interned_kb_object_next(d_id, FIND_DEDUCTION_BY_ID, DEDUCTION_P, deduction_handles.next_deduction_id());
    }

    public static SubLObject next_assertion(final SubLObject assertion) {
        return next_assertion_from_id(assertion_handles.assertion_id(assertion));
    }

    public static SubLObject next_assertion_from_id(final SubLObject a_id) {
        return interned_kb_object_next(a_id, FIND_ASSERTION_BY_ID, ASSERTION_P, assertion_handles.next_assertion_id());
    }

    public static SubLObject next_constant(final SubLObject constant) {
        return next_constant_from_id(constant_suid(constant));
    }

    public static SubLObject next_constant_from_id(final SubLObject c_id) {
        return interned_kb_object_next(c_id, FIND_CONSTANT_BY_SUID, CONSTANT_P, next_constant_suid());
    }

    public static SubLObject next_nart(final SubLObject nart) {
        return next_nart_from_id(nart_handles.nart_id(nart));
    }

    public static SubLObject next_nart_from_id(final SubLObject n_id) {
        return interned_kb_object_next(n_id, FIND_NART_BY_ID, NART_P, nart_handles.next_nart_id());
    }

    public static SubLObject next_kb_hl_support(final SubLObject support) {
        return next_kb_hl_support_from_id(kb_hl_support_handles.kb_hl_support_id(support));
    }

    public static SubLObject next_kb_hl_support_from_id(final SubLObject k_id) {
        return interned_kb_object_next(k_id, FIND_KB_HL_SUPPORT_BY_ID, KB_HL_SUPPORT_P, kb_hl_support_handles.next_kb_hl_support_id());
    }

    public static SubLObject previous_deduction(final SubLObject deduction) {
        return previous_deduction_from_id(deduction_handles.deduction_id(deduction));
    }

    public static SubLObject previous_deduction_from_id(final SubLObject d_id) {
        return interned_kb_object_previous(d_id, FIND_DEDUCTION_BY_ID, DEDUCTION_P);
    }

    public static SubLObject previous_assertion(final SubLObject assertion) {
        return previous_assertion_from_id(assertion_handles.assertion_id(assertion));
    }

    public static SubLObject previous_assertion_from_id(final SubLObject a_id) {
        return interned_kb_object_previous(a_id, FIND_ASSERTION_BY_ID, ASSERTION_P);
    }

    public static SubLObject previous_constant(final SubLObject constant) {
        return previous_constant_from_id(constant_suid(constant));
    }

    public static SubLObject previous_constant_from_id(final SubLObject c_id) {
        return interned_kb_object_previous(c_id, FIND_CONSTANT_BY_SUID, CONSTANT_P);
    }

    public static SubLObject previous_nart(final SubLObject nart) {
        return previous_nart_from_id(nart_handles.nart_id(nart));
    }

    public static SubLObject previous_nart_from_id(final SubLObject n_id) {
        return interned_kb_object_previous(n_id, FIND_NART_BY_ID, NART_P);
    }

    public static SubLObject previous_kb_hl_support(final SubLObject support) {
        return previous_kb_hl_support_from_id(kb_hl_support_handles.kb_hl_support_id(support));
    }

    public static SubLObject previous_kb_hl_support_from_id(final SubLObject k_id) {
        return interned_kb_object_previous(k_id, FIND_KB_HL_SUPPORT_BY_ID, KB_HL_SUPPORT_P);
    }

    public static SubLObject interned_kb_object_next(SubLObject id, final SubLObject finder_func, final SubLObject test_func, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        SubLObject following;
        for (following = NIL; NIL == funcall(test_func, following); following = funcall(finder_func, id)) {
            id = add(id, ONE_INTEGER);
            if (limit.isNumber() && limit.numLE(id)) {
                return NIL;
            }
        }
        return following;
    }

    public static SubLObject interned_kb_object_previous(SubLObject id, final SubLObject finder_func, final SubLObject test_func) {
        SubLObject previous;
        for (previous = NIL; NIL == funcall(test_func, previous); previous = funcall(finder_func, id)) {
            id = subtract(id, ONE_INTEGER);
            if (id.isNegative()) {
                return NIL;
            }
        }
        return previous;
    }

    public static SubLObject declare_kb_utilities_file() {
        declareFunction(me, "kb_statistics", "KB-STATISTICS", 0, 2, false);
        declareFunction(me, "kb_content_statistics", "KB-CONTENT-STATISTICS", 0, 1, false);
        declareFunction(me, "kb_object_memory_commitment_analysis", "KB-OBJECT-MEMORY-COMMITMENT-ANALYSIS", 0, 0, false);
        declareFunction(me, "kb_object_memory_commitment_report", "KB-OBJECT-MEMORY-COMMITMENT-REPORT", 0, 1, false);
        declareFunction(me, "histogram_of_predicate_extent", "HISTOGRAM-OF-PREDICATE-EXTENT", 0, 2, false);
        declareFunction(me, "mt_assertion_count", "MT-ASSERTION-COUNT", 1, 0, false);
        declareFunction(me, "broad_mt_assertion_count", "BROAD-MT-ASSERTION-COUNT", 1, 0, false);
        declareFunction(me, "most_populous_predicates_in_relevant_mts", "MOST-POPULOUS-PREDICATES-IN-RELEVANT-MTS", 1, 1, false);
        declareFunction(me, "most_populous_predicates_in_mts", "MOST-POPULOUS-PREDICATES-IN-MTS", 1, 2, false);
        declareFunction(me, "most_populous_predicates_in_mt", "MOST-POPULOUS-PREDICATES-IN-MT", 1, 2, false);
        declareFunction(me, "most_populous_collections_in_mts", "MOST-POPULOUS-COLLECTIONS-IN-MTS", 1, 2, false);
        declareFunction(me, "setup_kb_shelf", "SETUP-KB-SHELF", 4, 0, false);
        declareFunction(me, "estimated_assertions_per_constant", "ESTIMATED-ASSERTIONS-PER-CONSTANT", 0, 0, false);
        declareFunction(me, "estimated_constants_per_nart", "ESTIMATED-CONSTANTS-PER-NART", 0, 0, false);
        declareFunction(me, "estimated_assertions_per_deduction", "ESTIMATED-ASSERTIONS-PER-DEDUCTION", 0, 0, false);
        declareFunction(me, "estimated_assertions_per_clause_struc", "ESTIMATED-ASSERTIONS-PER-CLAUSE-STRUC", 0, 0, false);
        declareFunction(me, "estimated_assertions_per_meta_assertion", "ESTIMATED-ASSERTIONS-PER-META-ASSERTION", 0, 0, false);
        declareFunction(me, "estimated_arguments_per_assertion", "ESTIMATED-ARGUMENTS-PER-ASSERTION", 0, 0, false);
        declareFunction(me, "estimated_assertions_per_unrepresented_term", "ESTIMATED-ASSERTIONS-PER-UNREPRESENTED-TERM", 0, 0, false);
        declareFunction(me, "estimated_deductions_per_hl_support", "ESTIMATED-DEDUCTIONS-PER-HL-SUPPORT", 0, 0, false);
        declareFunction(me, "estimated_assertions_per_hl_support", "ESTIMATED-ASSERTIONS-PER-HL-SUPPORT", 0, 0, false);
        declareFunction(me, "setup_kb_tables", "SETUP-KB-TABLES", 1, 0, false);
        declareFunction(me, "setup_kb_tables_int", "SETUP-KB-TABLES-INT", 7, 1, false);
        declareFunction(me, "resize_all_kb_object_manager_lru_caches", "RESIZE-ALL-KB-OBJECT-MANAGER-LRU-CACHES", 0, 0, false);
        declareFunction(me, "resize_kb_object_manager_lru_caches_for_rebuild", "RESIZE-KB-OBJECT-MANAGER-LRU-CACHES-FOR-REBUILD", 0, 0, false);
        declareFunction(me, "setup_kb_fort_tables", "SETUP-KB-FORT-TABLES", 3, 0, false);
        declareFunction(me, "setup_kb_assertion_tables", "SETUP-KB-ASSERTION-TABLES", 2, 0, false);
        declareFunction(me, "setup_kb_deduction_tables", "SETUP-KB-DEDUCTION-TABLES", 2, 0, false);
        declareFunction(me, "setup_kb_hl_support_tables", "SETUP-KB-HL-SUPPORT-TABLES", 2, 0, false);
        declareFunction(me, "finalize_kb_tables", "FINALIZE-KB-TABLES", 0, 0, false);
        declareFunction(me, "finalize_kb_fort_tables", "FINALIZE-KB-FORT-TABLES", 0, 0, false);
        declareFunction(me, "clear_kb_state", "CLEAR-KB-STATE", 0, 1, false);
        declareFunction(me, "clear_kb_state_int", "CLEAR-KB-STATE-INT", 0, 0, false);
        declareFunction(me, "clear_kb_fort_state", "CLEAR-KB-FORT-STATE", 0, 1, false);
        declareFunction(me, "possibly_clear_dumpable_kb_state_hashes", "POSSIBLY-CLEAR-DUMPABLE-KB-STATE-HASHES", 0, 0, false);
        declareFunction(me, "possibly_initialize_dumpable_kb_state_hashes", "POSSIBLY-INITIALIZE-DUMPABLE-KB-STATE-HASHES", 0, 0, false);
        declareFunction(me, "clear_kb_state_hashes", "CLEAR-KB-STATE-HASHES", 0, 0, false);
        declareFunction(me, "initialize_kb_state_hashes", "INITIALIZE-KB-STATE-HASHES", 0, 0, false);
        declareFunction(me, "swap_out_all_pristine_kb_objects", "SWAP-OUT-ALL-PRISTINE-KB-OBJECTS", 0, 0, false);
        declareFunction(me, "show_new_kb_state", "SHOW-NEW-KB-STATE", 0, 1, false);
        declareFunction(me, "clear_new_kb_state", "CLEAR-NEW-KB-STATE", 0, 0, false);
        declareFunction(me, "show_new_kb_content", "SHOW-NEW-KB-CONTENT", 0, 3, false);
        declareFunction(me, "cyc_memory_hogs", "CYC-MEMORY-HOGS", 0, 2, false);
        declareFunction(me, "cyc_memory_hogs_data", "CYC-MEMORY-HOGS-DATA", 0, 0, false);
        declareFunction(me, "cyc_free_memory_hogs", "CYC-FREE-MEMORY-HOGS", 0, 1, false);
        declareFunction(me, "get_kb_object_managers", "GET-KB-OBJECT-MANAGERS", 0, 0, false);
        declareFunction(me, "cyc_lock_hogs", "CYC-LOCK-HOGS", 0, 1, false);
        declareFunction(me, "cyc_lock_users_sampled", "CYC-LOCK-USERS-SAMPLED", 0, 2, false);
        declareFunction(me, "kb_checkpoint_p", "KB-CHECKPOINT-P", 1, 0, false);
        declareFunction(me, "new_kb_checkpoint", "NEW-KB-CHECKPOINT", 0, 0, false);
        declareFunction(me, "kb_checkpoint_currentP", "KB-CHECKPOINT-CURRENT?", 1, 0, false);
        declareFunction(me, "theory_checkpoint_p", "THEORY-CHECKPOINT-P", 1, 0, false);
        declareFunction(me, "new_theory_checkpoint", "NEW-THEORY-CHECKPOINT", 0, 0, false);
        declareFunction(me, "theory_checkpoint_currentP", "THEORY-CHECKPOINT-CURRENT?", 1, 0, false);
        declareFunction(me, "hl_internal_id_string_p", "HL-INTERNAL-ID-STRING-P", 1, 0, false);
        declareFunction(me, "compact_hl_internal_id_string_p", "COMPACT-HL-INTERNAL-ID-STRING-P", 1, 0, false);
        declareFunction(me, "hl_internal_id_string", "HL-INTERNAL-ID-STRING", 1, 0, false);
        declareFunction(me, "compact_hl_internal_id_string", "COMPACT-HL-INTERNAL-ID-STRING", 1, 0, false);
        declareFunction(me, "find_object_by_hl_internal_id_string", "FIND-OBJECT-BY-HL-INTERNAL-ID-STRING", 1, 0, false);
        declareFunction(me, "find_object_by_compact_hl_internal_id_string", "FIND-OBJECT-BY-COMPACT-HL-INTERNAL-ID-STRING", 1, 0, false);
        declareFunction(me, "maybe_find_object_by_hl_internal_id_string", "MAYBE-FIND-OBJECT-BY-HL-INTERNAL-ID-STRING", 1, 0, false);
        declareFunction(me, "maybe_find_object_by_compact_hl_internal_id_string", "MAYBE-FIND-OBJECT-BY-COMPACT-HL-INTERNAL-ID-STRING", 1, 0, false);
        declareFunction(me, "hl_external_id_string_p", "HL-EXTERNAL-ID-STRING-P", 1, 0, false);
        new kb_utilities.$hl_external_id_string_p$UnaryFunction();
        declareFunction(me, "compact_hl_external_id_string_p", "COMPACT-HL-EXTERNAL-ID-STRING-P", 1, 0, false);
        declareFunction(me, "compact_hl_external_id_stringP", "COMPACT-HL-EXTERNAL-ID-STRING?", 1, 0, false);
        declareFunction(me, "compact_hl_external_id_stringE", "COMPACT-HL-EXTERNAL-ID-STRING=", 2, 0, false);
        declareFunction(me, "hl_external_id_string", "HL-EXTERNAL-ID-STRING", 1, 0, false);
        declareFunction(me, "compact_hl_external_id_string", "COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
        declareFunction(me, "find_object_by_hl_external_id_string", "FIND-OBJECT-BY-HL-EXTERNAL-ID-STRING", 1, 0, false);
        declareFunction(me, "find_cycl_object_by_compact_hl_external_id_string", "FIND-CYCL-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
        declareFunction(me, "find_object_by_compact_hl_external_id_string", "FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
        declareFunction(me, "maybe_find_object_by_compact_hl_external_id_string", "MAYBE-FIND-OBJECT-BY-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
        declareFunction(me, "find_object_by_hl_id_string", "FIND-OBJECT-BY-HL-ID-STRING", 2, 0, false);
        declareFunction(me, "invalid_hl_object_p", "INVALID-HL-OBJECT-P", 1, 0, false);
        declareFunction(me, "string_for_unlexified_term", "STRING-FOR-UNLEXIFIED-TERM", 1, 1, false);
        declareFunction(me, "sort_terms", "SORT-TERMS", 1, 6, false);
        declareFunction(me, "term_L", "TERM-<", 2, 3, false);
        new kb_utilities.$term_L$BinaryFunction();
        declareFunction(me, "term_L_with_constant_by_name", "TERM-<-WITH-CONSTANT-BY-NAME", 2, 1, false);
        declareFunction(me, "form_sort_pred", "FORM-SORT-PRED", 2, 0, false);
        new kb_utilities.$form_sort_pred$BinaryFunction();
        declareFunction(me, "cons_sort_pred", "CONS-SORT-PRED", 2, 0, false);
        declareFunction(me, "atom_sort_pred", "ATOM-SORT-PRED", 2, 0, false);
        declareFunction(me, "symbol_sort_pred", "SYMBOL-SORT-PRED", 2, 0, false);
        declareFunction(me, "fort_sort_pred", "FORT-SORT-PRED", 2, 0, false);
        declareFunction(me, "constant_sort_pred", "CONSTANT-SORT-PRED", 2, 0, false);
        declareFunction(me, "nart_sort_pred", "NART-SORT-PRED", 2, 0, false);
        declareFunction(me, "fort_L", "FORT-<", 2, 0, false);
        new kb_utilities.$fort_L$BinaryFunction();
        declareFunction(me, "sort_forts", "SORT-FORTS", 1, 0, false);
        declareFunction(me, "definitional_pred_L", "DEFINITIONAL-PRED-<", 2, 1, false);
        declareFunction(me, "definitional_assertion_L", "DEFINITIONAL-ASSERTION-<", 2, 0, false);
        declareFunction(me, "term_order", "TERM-ORDER", 1, 0, false);
        declareFunction(me, "term_order_assertion_method", "TERM-ORDER-ASSERTION-METHOD", 1, 0, false);
        declareFunction(me, "term_order_cons_method", "TERM-ORDER-CONS-METHOD", 1, 0, false);
        declareFunction(me, "term_similarity_metric", "TERM-SIMILARITY-METRIC", 2, 0, false);
        declareFunction(me, "instance_similarity_statistics", "INSTANCE-SIMILARITY-STATISTICS", 1, 1, false);
        declareFunction(me, "spec_similarity_statistics", "SPEC-SIMILARITY-STATISTICS", 1, 1, false);
        declareFunction(me, "term_similarity_metric_generalizations_internal", "TERM-SIMILARITY-METRIC-GENERALIZATIONS-INTERNAL", 1, 0, false);
        declareFunction(me, "term_similarity_metric_generalizations", "TERM-SIMILARITY-METRIC-GENERALIZATIONS", 1, 0, false);
        declareFunction(me, "term_similarity_all_isa", "TERM-SIMILARITY-ALL-ISA", 1, 0, false);
        declareFunction(me, "similarity_statistics_int", "SIMILARITY-STATISTICS-INT", 2, 0, false);
        declareFunction(me, "constants_created_between", "CONSTANTS-CREATED-BETWEEN", 2, 1, false);
        declareFunction(me, "assertion_nats", "ASSERTION-NATS", 1, 0, false);
        declareFunction(me, "assertion_tous", "ASSERTION-TOUS", 1, 0, false);
        declareFunction(me, "assertions_between", "ASSERTIONS-BETWEEN", 2, 1, false);
        declareFunction(me, "term_assertions_between", "TERM-ASSERTIONS-BETWEEN", 3, 1, false);
        declareFunction(me, "term_assertions_in_chronological_order", "TERM-ASSERTIONS-IN-CHRONOLOGICAL-ORDER", 1, 0, false);
        declareFunction(me, "term_assertions_in_id_order", "TERM-ASSERTIONS-IN-ID-ORDER", 1, 0, false);
        declareFunction(me, "term_last_asserted_assertion_date_internal", "TERM-LAST-ASSERTED-ASSERTION-DATE-INTERNAL", 1, 0, false);
        declareFunction(me, "term_last_asserted_assertion_date", "TERM-LAST-ASSERTED-ASSERTION-DATE", 1, 0, false);
        declareFunction(me, "clear_cached_term_last_asserted_assertion_date", "CLEAR-CACHED-TERM-LAST-ASSERTED-ASSERTION-DATE", 0, 0, false);
        declareFunction(me, "remove_cached_term_last_asserted_assertion_date", "REMOVE-CACHED-TERM-LAST-ASSERTED-ASSERTION-DATE", 1, 0, false);
        declareFunction(me, "cached_term_last_asserted_assertion_date_internal", "CACHED-TERM-LAST-ASSERTED-ASSERTION-DATE-INTERNAL", 1, 0, false);
        declareFunction(me, "cached_term_last_asserted_assertion_date", "CACHED-TERM-LAST-ASSERTED-ASSERTION-DATE", 1, 0, false);
        declareFunction(me, "creation_time_L", "CREATION-TIME-<", 2, 0, false);
        declareFunction(me, "clear_cached_creation_time", "CLEAR-CACHED-CREATION-TIME", 0, 0, false);
        declareFunction(me, "remove_cached_creation_time", "REMOVE-CACHED-CREATION-TIME", 1, 0, false);
        declareFunction(me, "cached_creation_time_internal", "CACHED-CREATION-TIME-INTERNAL", 1, 0, false);
        declareFunction(me, "cached_creation_time", "CACHED-CREATION-TIME", 1, 0, false);
        declareFunction(me, "creator_L", "CREATOR-<", 2, 0, false);
        declareFunction(me, "clear_cached_creator", "CLEAR-CACHED-CREATOR", 0, 0, false);
        declareFunction(me, "remove_cached_creator", "REMOVE-CACHED-CREATOR", 1, 0, false);
        declareFunction(me, "cached_creator_internal", "CACHED-CREATOR-INTERNAL", 1, 0, false);
        declareFunction(me, "cached_creator", "CACHED-CREATOR", 1, 0, false);
        declareFunction(me, "assert_date_L", "ASSERT-DATE-<", 2, 0, false);
        declareFunction(me, "assert_cyclist_L", "ASSERT-CYCLIST-<", 2, 0, false);
        declareFunction(me, "probably_most_recent_assertion", "PROBABLY-MOST-RECENT-ASSERTION", 0, 0, false);
        declareFunction(me, "assert_timestamp_L", "ASSERT-TIMESTAMP-<", 2, 0, false);
        declareFunction(me, "all_constants", "ALL-CONSTANTS", 0, 0, false);
        declareFunction(me, "all_narts", "ALL-NARTS", 0, 0, false);
        declareFunction(me, "all_forts", "ALL-FORTS", 0, 0, false);
        declareFunction(me, "all_deductions", "ALL-DEDUCTIONS", 0, 0, false);
        declareFunction(me, "all_kb_hl_supports", "ALL-KB-HL-SUPPORTS", 0, 0, false);
        declareFunction(me, "all_assertions", "ALL-ASSERTIONS", 0, 0, false);
        declareFunction(me, "all_gafs", "ALL-GAFS", 0, 0, false);
        declareFunction(me, "all_forward_gafs", "ALL-FORWARD-GAFS", 0, 0, false);
        declareFunction(me, "all_backward_gafs", "ALL-BACKWARD-GAFS", 0, 0, false);
        declareFunction(me, "all_rules", "ALL-RULES", 0, 0, false);
        declareFunction(me, "all_forward_rules", "ALL-FORWARD-RULES", 0, 0, false);
        declareFunction(me, "all_backward_rules", "ALL-BACKWARD-RULES", 0, 0, false);
        declareFunction(me, "sorted_non_deduced_backward_gafs", "SORTED-NON-DEDUCED-BACKWARD-GAFS", 0, 0, false);
        declareFunction(me, "all_new_narts", "ALL-NEW-NARTS", 0, 0, false);
        declareFunction(me, "kb_object_count_list", "KB-OBJECT-COUNT-LIST", 0, 0, false);
        declareFunction(me, "kb_object_count_lists_new_constant_count", "KB-OBJECT-COUNT-LISTS-NEW-CONSTANT-COUNT", 2, 0, false);
        declareFunction(me, "kb_object_count_lists_new_nart_count", "KB-OBJECT-COUNT-LISTS-NEW-NART-COUNT", 2, 0, false);
        declareFunction(me, "kb_object_count_lists_new_assertion_count", "KB-OBJECT-COUNT-LISTS-NEW-ASSERTION-COUNT", 2, 0, false);
        declareFunction(me, "kb_object_count_lists_new_kb_hl_support_count", "KB-OBJECT-COUNT-LISTS-NEW-KB-HL-SUPPORT-COUNT", 2, 0, false);
        declareFunction(me, "kb_object_count_lists_new_deduction_count", "KB-OBJECT-COUNT-LISTS-NEW-DEDUCTION-COUNT", 2, 0, false);
        declareFunction(me, "kb_object_count_lists_differentP", "KB-OBJECT-COUNT-LISTS-DIFFERENT?", 2, 0, false);
        declareMacro(me, "showing_new_kb_object_counts", "SHOWING-NEW-KB-OBJECT-COUNTS");
        declareFunction(me, "all_constants_sorted_by_creation_time_estimate", "ALL-CONSTANTS-SORTED-BY-CREATION-TIME-ESTIMATE", 0, 0, false);
        declareFunction(me, "guess_constant_creation_time", "GUESS-CONSTANT-CREATION-TIME", 1, 0, false);
        declareFunction(me, "lowest_assertion_id_for_constant", "LOWEST-ASSERTION-ID-FOR-CONSTANT", 1, 0, false);
        declareFunction(me, "sort_constants_by_sorting_info", "SORT-CONSTANTS-BY-SORTING-INFO", 2, 0, false);
        declareFunction(me, "constant_sorting_funky_L", "CONSTANT-SORTING-FUNKY-<", 2, 0, false);
        declareFunction(me, "definitional_type_for_naut", "DEFINITIONAL-TYPE-FOR-NAUT", 1, 0, false);
        declareMacro(me, "do_gaf_arg_index_naut", "DO-GAF-ARG-INDEX-NAUT");
        declareMacro(me, "do_misc_index_naut", "DO-MISC-INDEX-NAUT");
        declareFunction(me, "map_gaf_arg_index_naut", "MAP-GAF-ARG-INDEX-NAUT", 3, 3, false);
        declareFunction(me, "map_misc_index_naut", "MAP-MISC-INDEX-NAUT", 2, 1, false);
        declareFunction(me, "set_to_collection", "SET-TO-COLLECTION", 1, 1, false);
        declareFunction(me, "set_type_constraint", "SET-TYPE-CONSTRAINT", 1, 1, false);
        declareFunction(me, "clear_cached_union_all_specs_count", "CLEAR-CACHED-UNION-ALL-SPECS-COUNT", 0, 0, false);
        new kb_utilities.$clear_cached_union_all_specs_count$ZeroArityFunction();
        declareFunction(me, "remove_cached_union_all_specs_count", "REMOVE-CACHED-UNION-ALL-SPECS-COUNT", 2, 0, false);
        declareFunction(me, "cached_union_all_specs_count_internal", "CACHED-UNION-ALL-SPECS-COUNT-INTERNAL", 2, 0, false);
        declareFunction(me, "cached_union_all_specs_count", "CACHED-UNION-ALL-SPECS-COUNT", 2, 0, false);
        declareFunction(me, "collection_coverage_ratio", "COLLECTION-COVERAGE-RATIO", 1, 2, false);
        declareFunction(me, "union_all_constant_specs_count", "UNION-ALL-CONSTANT-SPECS-COUNT", 2, 0, false);
        declareFunction(me, "constant_collection_coverage_ratio", "CONSTANT-COLLECTION-COVERAGE-RATIO", 1, 2, false);
        declareFunction(me, "compute_kb_covering_collections", "COMPUTE-KB-COVERING-COLLECTIONS", 4, 0, false);
        declareFunction(me, "print_kb_covering_collections", "PRINT-KB-COVERING-COLLECTIONS", 1, 0, false);
        declareFunction(me, "optimize_coverage", "OPTIMIZE-COVERAGE", 2, 0, false);
        declareFunction(me, "break_col_into_specs_and_merge", "BREAK-COL-INTO-SPECS-AND-MERGE", 4, 0, false);
        declareFunction(me, "clear_forbidden_kb_covering_collections_set", "CLEAR-FORBIDDEN-KB-COVERING-COLLECTIONS-SET", 0, 0, false);
        new kb_utilities.$clear_forbidden_kb_covering_collections_set$ZeroArityFunction();
        declareFunction(me, "remove_forbidden_kb_covering_collections_set", "REMOVE-FORBIDDEN-KB-COVERING-COLLECTIONS-SET", 0, 0, false);
        declareFunction(me, "forbidden_kb_covering_collections_set_internal", "FORBIDDEN-KB-COVERING-COLLECTIONS-SET-INTERNAL", 0, 0, false);
        declareFunction(me, "forbidden_kb_covering_collections_set", "FORBIDDEN-KB-COVERING-COLLECTIONS-SET", 0, 0, false);
        declareFunction(me, "forbidden_kb_covering_collectionP", "FORBIDDEN-KB-COVERING-COLLECTION?", 1, 0, false);
        declareFunction(me, "spec_union_overlap_cardinality", "SPEC-UNION-OVERLAP-CARDINALITY", 2, 0, false);
        declareFunction(me, "spec_overlap_cardinality", "SPEC-OVERLAP-CARDINALITY", 2, 0, false);
        declareFunction(me, "clear_all_specs_set", "CLEAR-ALL-SPECS-SET", 0, 0, false);
        declareFunction(me, "remove_all_specs_set", "REMOVE-ALL-SPECS-SET", 1, 0, false);
        declareFunction(me, "all_specs_set_internal", "ALL-SPECS-SET-INTERNAL", 1, 0, false);
        declareFunction(me, "all_specs_set", "ALL-SPECS-SET", 1, 0, false);
        declareFunction(me, "clear_all_genls_set", "CLEAR-ALL-GENLS-SET", 0, 0, false);
        declareFunction(me, "remove_all_genls_set", "REMOVE-ALL-GENLS-SET", 1, 0, false);
        declareFunction(me, "all_genls_set_internal", "ALL-GENLS-SET-INTERNAL", 1, 0, false);
        declareFunction(me, "all_genls_set", "ALL-GENLS-SET", 1, 0, false);
        declareFunction(me, "special_collection_coverage_ratio", "SPECIAL-COLLECTION-COVERAGE-RATIO", 1, 0, false);
        declareFunction(me, "max_non_overlapping_kb_coverage_cols", "MAX-NON-OVERLAPPING-KB-COVERAGE-COLS", 1, 0, false);
        declareFunction(me, "pretty_print_cycl_to_string", "PRETTY-PRINT-CYCL-TO-STRING", 1, 1, false);
        declareFunction(me, "string_remove_nart_affixes", "STRING-REMOVE-NART-AFFIXES", 1, 0, false);
        declareFunction(me, "collection_subsumption_paths", "COLLECTION-SUBSUMPTION-PATHS", 1, 0, false);
        declareFunction(me, "collection_subsumption_paths_int", "COLLECTION-SUBSUMPTION-PATHS-INT", 1, 0, false);
        declareFunction(me, "collection_subsumption_paths_co_genl_col", "COLLECTION-SUBSUMPTION-PATHS-CO-GENL-COL", 2, 0, false);
        declareFunction(me, "predicate_subsumption_paths", "PREDICATE-SUBSUMPTION-PATHS", 1, 0, false);
        declareFunction(me, "predicate_subsumption_paths_int", "PREDICATE-SUBSUMPTION-PATHS-INT", 1, 0, false);
        declareFunction(me, "predicate_subsumption_paths_co_genl_pred", "PREDICATE-SUBSUMPTION-PATHS-CO-GENL-PRED", 2, 0, false);
        declareFunction(me, "predicate_type_for_arity", "PREDICATE-TYPE-FOR-ARITY", 1, 0, false);
        declareFunction(me, "arity_of_predicate_type", "ARITY-OF-PREDICATE-TYPE", 1, 0, false);
        declareFunction(me, "random_hl_gaf", "RANDOM-HL-GAF", 0, 0, false);
        declareFunction(me, "random_non_hl_gaf", "RANDOM-NON-HL-GAF", 0, 0, false);
        declareFunction(me, "random_sbhl_gaf", "RANDOM-SBHL-GAF", 0, 0, false);
        declareFunction(me, "random_non_sbhl_gaf", "RANDOM-NON-SBHL-GAF", 0, 0, false);
        declareFunction(me, "hl_gafP", "HL-GAF?", 1, 0, false);
        declareFunction(me, "non_hl_gafP", "NON-HL-GAF?", 1, 0, false);
        declareFunction(me, "sbhl_gafP", "SBHL-GAF?", 1, 0, false);
        declareFunction(me, "non_sbhl_gafP", "NON-SBHL-GAF?", 1, 0, false);
        declareFunction(me, "random_argnum", "RANDOM-ARGNUM", 1, 1, false);
        declareFunction(me, "safe_random_closed_argnum", "SAFE-RANDOM-CLOSED-ARGNUM", 1, 1, false);
        declareFunction(me, "random_closed_argnum", "RANDOM-CLOSED-ARGNUM", 1, 1, false);
        declareFunction(me, "random_closed_argnum_int", "RANDOM-CLOSED-ARGNUM-INT", 3, 0, false);
        declareFunction(me, "turn_a_random_arg_into_a_variable", "TURN-A-RANDOM-ARG-INTO-A-VARIABLE", 1, 1, false);
        declareFunction(me, "random_predicate", "RANDOM-PREDICATE", 0, 0, false);
        declareFunction(me, "random_binary_predicate", "RANDOM-BINARY-PREDICATE", 0, 0, false);
        declareFunction(me, "gather_dates", "GATHER-DATES", 1, 1, false);
        declareFunction(me, "dateP", "DATE?", 1, 0, false);
        declareFunction(me, "not_at_all_commutative_predicate_p", "NOT-AT-ALL-COMMUTATIVE-PREDICATE-P", 1, 0, false);
        declareFunction(me, "at_least_partially_commutative_predicate_p", "AT-LEAST-PARTIALLY-COMMUTATIVE-PREDICATE-P", 1, 0, false);
        declareFunction(me, "not_at_all_commutative_relation_p", "NOT-AT-ALL-COMMUTATIVE-RELATION-P", 1, 0, false);
        declareFunction(me, "at_least_partially_commutative_relation_p", "AT-LEAST-PARTIALLY-COMMUTATIVE-RELATION-P", 1, 0, false);
        declareFunction(me, "find_invalid_constant_references", "FIND-INVALID-CONSTANT-REFERENCES", 1, 0, false);
        declareFunction(me, "fix_invalid_constant_references", "FIX-INVALID-CONSTANT-REFERENCES", 1, 0, false);
        declareFunction(me, "fix_invalid_constant_reference", "FIX-INVALID-CONSTANT-REFERENCE", 3, 1, false);
        declareFunction(me, "find_former_constants_named", "FIND-FORMER-CONSTANTS-NAMED", 1, 0, false);
        declareFunction(me, "coasserted_forts", "COASSERTED-FORTS", 1, 0, false);
        declareFunction(me, "visit_coasserted_fort", "VISIT-COASSERTED-FORT", 1, 0, false);
        declareFunction(me, "clear_cached_compact_hl_external_id_string", "CLEAR-CACHED-COMPACT-HL-EXTERNAL-ID-STRING", 0, 0, false);
        declareFunction(me, "remove_cached_compact_hl_external_id_string", "REMOVE-CACHED-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
        declareFunction(me, "cached_compact_hl_external_id_string_internal", "CACHED-COMPACT-HL-EXTERNAL-ID-STRING-INTERNAL", 1, 0, false);
        declareFunction(me, "cached_compact_hl_external_id_string", "CACHED-COMPACT-HL-EXTERNAL-ID-STRING", 1, 0, false);
        declareFunction(me, "write_coasserted_forts", "WRITE-COASSERTED-FORTS", 1, 1, false);
        declareFunction(me, "write_all_coasserted_forts_to_file", "WRITE-ALL-COASSERTED-FORTS-TO-FILE", 1, 0, false);
        declareFunction(me, "core_union_constantP", "CORE-UNION-CONSTANT?", 1, 0, false);
        declareFunction(me, "non_core_union_constantP", "NON-CORE-UNION-CONSTANT?", 1, 0, false);
        declareFunction(me, "non_core_union_constants", "NON-CORE-UNION-CONSTANTS", 1, 0, false);
        declareFunction(me, "create_spec_mt", "CREATE-SPEC-MT", 1, 1, false);
        declareFunction(me, "hl_object_to_evaluatable_string", "HL-OBJECT-TO-EVALUATABLE-STRING", 1, 1, false);
        declareFunction(me, "is_transformable_hl_object_intP", "IS-TRANSFORMABLE-HL-OBJECT-INT?", 1, 0, false);
        declareFunction(me, "make_hl_readable_int", "MAKE-HL-READABLE-INT", 1, 0, false);
        declareFunction(me, "kbeq", "KBEQ", 2, 0, false);
        declareFunction(me, "binary_gaf_p", "BINARY-GAF-P", 1, 0, false);
        declareFunction(me, "fort_alphanumeric_name", "FORT-ALPHANUMERIC-NAME", 1, 0, false);
        declareFunction(me, "unassert_gaf_arg_index", "UNASSERT-GAF-ARG-INDEX", 4, 0, false);
        declareFunction(me, "unassert_entire_gaf_arg_index", "UNASSERT-ENTIRE-GAF-ARG-INDEX", 3, 0, false);
        declareFunction(me, "unassert_predicate_extent_index", "UNASSERT-PREDICATE-EXTENT-INDEX", 2, 0, false);
        declareFunction(me, "unassert_entire_predicate_extent_index", "UNASSERT-ENTIRE-PREDICATE-EXTENT-INDEX", 1, 0, false);
        declareFunction(me, "unassert_entire_function_extent_index", "UNASSERT-ENTIRE-FUNCTION-EXTENT-INDEX", 1, 0, false);
        declareFunction(me, "randomly_select_constants", "RANDOMLY-SELECT-CONSTANTS", 1, 0, false);
        declareFunction(me, "randomly_select_narts", "RANDOMLY-SELECT-NARTS", 1, 0, false);
        declareFunction(me, "randomly_select_assertions", "RANDOMLY-SELECT-ASSERTIONS", 1, 0, false);
        declareFunction(me, "randomly_select_deductions", "RANDOMLY-SELECT-DEDUCTIONS", 1, 0, false);
        declareFunction(me, "randomly_select_kb_hl_supports", "RANDOMLY-SELECT-KB-HL-SUPPORTS", 1, 0, false);
        declareFunction(me, "randomly_select_clause_strucs", "RANDOMLY-SELECT-CLAUSE-STRUCS", 1, 0, false);
        declareFunction(me, "randomly_select_interned_items", "RANDOMLY-SELECT-INTERNED-ITEMS", 3, 0, false);
        declareFunction(me, "next_deduction", "NEXT-DEDUCTION", 1, 0, false);
        declareFunction(me, "next_deduction_from_id", "NEXT-DEDUCTION-FROM-ID", 1, 0, false);
        declareFunction(me, "next_assertion", "NEXT-ASSERTION", 1, 0, false);
        declareFunction(me, "next_assertion_from_id", "NEXT-ASSERTION-FROM-ID", 1, 0, false);
        declareFunction(me, "next_constant", "NEXT-CONSTANT", 1, 0, false);
        declareFunction(me, "next_constant_from_id", "NEXT-CONSTANT-FROM-ID", 1, 0, false);
        declareFunction(me, "next_nart", "NEXT-NART", 1, 0, false);
        declareFunction(me, "next_nart_from_id", "NEXT-NART-FROM-ID", 1, 0, false);
        declareFunction(me, "next_kb_hl_support", "NEXT-KB-HL-SUPPORT", 1, 0, false);
        declareFunction(me, "next_kb_hl_support_from_id", "NEXT-KB-HL-SUPPORT-FROM-ID", 1, 0, false);
        declareFunction(me, "previous_deduction", "PREVIOUS-DEDUCTION", 1, 0, false);
        declareFunction(me, "previous_deduction_from_id", "PREVIOUS-DEDUCTION-FROM-ID", 1, 0, false);
        declareFunction(me, "previous_assertion", "PREVIOUS-ASSERTION", 1, 0, false);
        declareFunction(me, "previous_assertion_from_id", "PREVIOUS-ASSERTION-FROM-ID", 1, 0, false);
        declareFunction(me, "previous_constant", "PREVIOUS-CONSTANT", 1, 0, false);
        declareFunction(me, "previous_constant_from_id", "PREVIOUS-CONSTANT-FROM-ID", 1, 0, false);
        declareFunction(me, "previous_nart", "PREVIOUS-NART", 1, 0, false);
        declareFunction(me, "previous_nart_from_id", "PREVIOUS-NART-FROM-ID", 1, 0, false);
        declareFunction(me, "previous_kb_hl_support", "PREVIOUS-KB-HL-SUPPORT", 1, 0, false);
        declareFunction(me, "previous_kb_hl_support_from_id", "PREVIOUS-KB-HL-SUPPORT-FROM-ID", 1, 0, false);
        declareFunction(me, "interned_kb_object_next", "INTERNED-KB-OBJECT-NEXT", 3, 1, false);
        declareFunction(me, "interned_kb_object_previous", "INTERNED-KB-OBJECT-PREVIOUS", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_kb_utilities_file() {
        deflexical("*ESTIMATED-ASSERTIONS-PER-CONSTANT*", $float$17_1);
        deflexical("*ESTIMATED-CONSTANTS-PER-NART*", $float$1_41);
        deflexical("*ESTIMATED-ASSERTIONS-PER-DEDUCTION*", $float$2_67);
        deflexical("*ESTIMATED-ASSERTIONS-PER-CLAUSE-STRUC*", $float$39_3);
        deflexical("*ESTIMATED-ASSERTIONS-PER-META-ASSERTION*", $float$30_3);
        deflexical("*ESTIMATED-ARGUMENTS-PER-ASSERTION*", $float$1_12);
        deflexical("*ESTIMATED-ASSERTIONS-PER-UNREPRESENTED-TERM*", $float$7_97);
        deflexical("*ESTIMATED-DEDUCTIONS-PER-HL-SUPPORT*", TEN_INTEGER);
        deflexical("*KB-TABLE-PADDING-MULTIPLIER*", $float$1_05);
        defparameter("*DEFAULT-ESTIMATED-CONSTANT-COUNT*", $int$50000);
        defparameter("*GET-KB-OBJECT-MANAGERS*", $UNINITIALIZED);
        defparameter("*SORT-TERMS-CONSTANTS-BY-NAME*", T);
        defparameter("*SORT-TERMS-IGNORE-VARIABLE-SYMBOLS*", NIL);
        defparameter("*SORT-TERMS-BY-INTERNAL-ID?*", NIL);
        deflexical("*DEFINITIONAL-PRED-SORT-ORDER*", $list210);
        deflexical("*TERM-ORDER-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*CACHED-TERM-LAST-ASSERTED-ASSERTION-DATE-CACHING-STATE*", NIL);
        deflexical("*CACHED-CREATION-TIME-CACHING-STATE*", NIL);
        deflexical("*CACHED-CREATOR-CACHING-STATE*", NIL);
        defparameter("*SET-TO-COLLECTION-USES-REFORMULATOR?*", T);
        deflexical("*CACHED-UNION-ALL-SPECS-COUNT-CACHING-STATE*", NIL);
        deflexical("*FORBIDDEN-KB-COVERING-COLLECTION-TYPES*", $list357);
        deflexical("*FORBIDDEN-KB-COVERING-QUOTED-COLLECTION-TYPES*", $list358);
        deflexical("*FORBIDDEN-COLS*", $list359);
        deflexical("*FORBIDDEN-SPECS*", NIL);
        defparameter("*MIN-EACH-SPEC-CARDINALITY*", NIL);
        deflexical("*FORBIDDEN-KB-COVERING-COLLECTIONS-SET-CACHING-STATE*", NIL);
        deflexical("*ALL-SPECS-SET-CACHING-STATE*", NIL);
        deflexical("*ALL-GENLS-SET-CACHING-STATE*", NIL);
        deflexical("*PREDICATE-TYPE-ARITY-TABLE*", $list383);
        defparameter("*COASSERTED-FORT-SOURCE*", NIL);
        defparameter("*COASSERTED-FORT-SET*", NIL);
        deflexical("*CACHED-COMPACT-HL-EXTERNAL-ID-STRING-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_kb_utilities_file() {
        register_external_symbol(SHOW_NEW_KB_STATE);
        register_external_symbol(CLEAR_NEW_KB_STATE);
        register_external_symbol(SHOW_NEW_KB_CONTENT);
        register_external_symbol(HL_INTERNAL_ID_STRING_P);
        register_external_symbol(COMPACT_HL_INTERNAL_ID_STRING_P);
        register_external_symbol(HL_INTERNAL_ID_STRING);
        register_external_symbol(COMPACT_HL_INTERNAL_ID_STRING);
        register_external_symbol(FIND_OBJECT_BY_HL_INTERNAL_ID_STRING);
        register_external_symbol(FIND_OBJECT_BY_COMPACT_HL_INTERNAL_ID_STRING);
        register_external_symbol(MAYBE_FIND_OBJECT_BY_HL_INTERNAL_ID_STRING);
        register_external_symbol(MAYBE_FIND_OBJECT_BY_COMPACT_HL_INTERNAL_ID_STRING);
        register_external_symbol(HL_EXTERNAL_ID_STRING_P);
        register_external_symbol(COMPACT_HL_EXTERNAL_ID_STRING_P);
        register_external_symbol($sym189$COMPACT_HL_EXTERNAL_ID_STRING_);
        register_external_symbol($sym193$COMPACT_HL_EXTERNAL_ID_STRING_);
        register_external_symbol(HL_EXTERNAL_ID_STRING);
        register_external_symbol(COMPACT_HL_EXTERNAL_ID_STRING);
        register_external_symbol(FIND_OBJECT_BY_HL_EXTERNAL_ID_STRING);
        register_external_symbol(FIND_CYCL_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING);
        register_external_symbol(FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING);
        register_external_symbol(MAYBE_FIND_OBJECT_BY_COMPACT_HL_EXTERNAL_ID_STRING);
        register_method($term_order_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), symbol_function(TERM_ORDER_ASSERTION_METHOD));
        register_method($term_order_method_table$.getGlobalValue(), $dtp_cons$.getGlobalValue(), symbol_function(TERM_ORDER_CONS_METHOD));
        memoization_state.note_memoized_function(TERM_SIMILARITY_METRIC_GENERALIZATIONS);
        memoization_state.note_memoized_function(TERM_LAST_ASSERTED_ASSERTION_DATE);
        memoization_state.note_globally_cached_function(CACHED_TERM_LAST_ASSERTED_ASSERTION_DATE);
        memoization_state.note_globally_cached_function(CACHED_CREATION_TIME);
        memoization_state.note_globally_cached_function(CACHED_CREATOR);
        memoization_state.note_globally_cached_function(CACHED_UNION_ALL_SPECS_COUNT);
        memoization_state.note_globally_cached_function(FORBIDDEN_KB_COVERING_COLLECTIONS_SET);
        memoization_state.note_globally_cached_function(ALL_SPECS_SET);
        memoization_state.note_globally_cached_function(ALL_GENLS_SET);
        note_funcall_helper_function(VISIT_COASSERTED_FORT);
        memoization_state.note_globally_cached_function(CACHED_COMPACT_HL_EXTERNAL_ID_STRING);
        register_external_symbol(RANDOMLY_SELECT_CONSTANTS);
        register_external_symbol(RANDOMLY_SELECT_NARTS);
        register_external_symbol(RANDOMLY_SELECT_ASSERTIONS);
        register_external_symbol(RANDOMLY_SELECT_DEDUCTIONS);
        register_external_symbol(RANDOMLY_SELECT_KB_HL_SUPPORTS);
        register_external_symbol(RANDOMLY_SELECT_CLAUSE_STRUCS);
        define_test_case_table_int(SET_TO_COLLECTION, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list475);
        define_test_case_table_int(COLLECTION_SUBSUMPTION_PATHS, list(new SubLObject[]{ $TEST, $sym477$SETS_EQUAL_EQUAL_, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list478);
        define_test_case_table_int(PREDICATE_SUBSUMPTION_PATHS, list(new SubLObject[]{ $TEST, $sym477$SETS_EQUAL_EQUAL_, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list480);
        return NIL;
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

    

    public static final class $hl_external_id_string_p$UnaryFunction extends UnaryFunction {
        public $hl_external_id_string_p$UnaryFunction() {
            super(extractFunctionNamed("HL-EXTERNAL-ID-STRING-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return hl_external_id_string_p(arg1);
        }
    }

    public static final class $term_L$BinaryFunction extends BinaryFunction {
        public $term_L$BinaryFunction() {
            super(extractFunctionNamed("TERM-<"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return term_L(arg1, arg2, kb_utilities.$term_L$BinaryFunction.UNPROVIDED, kb_utilities.$term_L$BinaryFunction.UNPROVIDED, kb_utilities.$term_L$BinaryFunction.UNPROVIDED);
        }
    }

    public static final class $form_sort_pred$BinaryFunction extends BinaryFunction {
        public $form_sort_pred$BinaryFunction() {
            super(extractFunctionNamed("FORM-SORT-PRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return form_sort_pred(arg1, arg2);
        }
    }

    public static final class $fort_L$BinaryFunction extends BinaryFunction {
        public $fort_L$BinaryFunction() {
            super(extractFunctionNamed("FORT-<"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return fort_L(arg1, arg2);
        }
    }

    public static final class $clear_cached_union_all_specs_count$ZeroArityFunction extends ZeroArityFunction {
        public $clear_cached_union_all_specs_count$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-CACHED-UNION-ALL-SPECS-COUNT"));
        }

        @Override
        public SubLObject processItem() {
            return clear_cached_union_all_specs_count();
        }
    }

    public static final class $clear_forbidden_kb_covering_collections_set$ZeroArityFunction extends ZeroArityFunction {
        public $clear_forbidden_kb_covering_collections_set$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-FORBIDDEN-KB-COVERING-COLLECTIONS-SET"));
        }

        @Override
        public SubLObject processItem() {
            return clear_forbidden_kb_covering_collections_set();
        }
    }
}

/**
 * Total time: 7640 ms
 */
