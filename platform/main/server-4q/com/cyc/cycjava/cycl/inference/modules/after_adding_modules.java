package com.cyc.cycjava.cycl.inference.modules;


import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.at_utilities;
import com.cyc.cycjava.cycl.at_var_types;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.clausifier;
import com.cyc.cycjava.cycl.constant_completion_high;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.constants_low;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.deduction_handles;
import com.cyc.cycjava.cycl.deductions_high;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.encapsulation;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.fi_edit;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.hl_macros;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.hl_transcript_tracing;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.after_adding;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.rule_after_adding;
import com.cyc.cycjava.cycl.inference.modules.after_adding_modules;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_known_antecedent_rule;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_cache;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.operation_queues;
import com.cyc.cycjava.cycl.pph_functions;
import com.cyc.cycjava.cycl.pph_templates;
import com.cyc.cycjava.cycl.predicate_relevance_cache;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.queues;
import com.cyc.cycjava.cycl.reformulator_datastructures;
import com.cyc.cycjava.cycl.sdc;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subcollection_unwinder;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.tersifier;
import com.cyc.cycjava.cycl.tms;
import com.cyc.cycjava.cycl.transcript_utilities;
import com.cyc.cycjava.cycl.tva_cache;
import com.cyc.cycjava.cycl.tva_utilities;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.wff_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.$use_transcriptP$;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.inference.modules.after_adding_modules.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hyphen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class after_adding_modules extends SubLTranslatedFile {
    public static final SubLFile me = new after_adding_modules();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.after_adding_modules";

    public static final String myFingerPrint = "c970f052a455d7d122dfb380b7600b3d572585cb2eef92f653724136159aa181";

    // deflexical
    // Definitions
    private static final SubLSymbol $cycl_functions_used_as_after_addings$ = makeSymbol("*CYCL-FUNCTIONS-USED-AS-AFTER-ADDINGS*");

    // defparameter
    // Protection against infinite recursion.
    private static final SubLSymbol $inside_clear_genls_dependent_cachesP$ = makeSymbol("*INSIDE-CLEAR-GENLS-DEPENDENT-CACHES?*");

    // defparameter
    // Protection against infinite recursion.
    private static final SubLSymbol $inside_clear_isa_dependent_cachesP$ = makeSymbol("*INSIDE-CLEAR-ISA-DEPENDENT-CACHES?*");

    // defparameter
    // Protection against infinite recursion.
    private static final SubLSymbol $inside_clear_quoted_isa_dependent_cachesP$ = makeSymbol("*INSIDE-CLEAR-QUOTED-ISA-DEPENDENT-CACHES?*");

    // defparameter
    private static final SubLSymbol $true_rule_template$ = makeSymbol("*TRUE-RULE-TEMPLATE*");



    // defparameter
    private static final SubLSymbol $cyc_except_mt_repropagate_mt_contents_cutoff$ = makeSymbol("*CYC-EXCEPT-MT-REPROPAGATE-MT-CONTENTS-CUTOFF*");

    // defparameter
    private static final SubLSymbol $debug_do_create_from_descriptionP$ = makeSymbol("*DEBUG-DO-CREATE-FROM-DESCRIPTION?*");

    // defparameter
    private static final SubLSymbol $instantiate_from_subcollection_expression_constant_prefix$ = makeSymbol("*INSTANTIATE-FROM-SUBCOLLECTION-EXPRESSION-CONSTANT-PREFIX*");

    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("CLEAR-PARAPHRASE-CACHES"));



    public static final SubLSymbol DECACHE_AFTER_ADDINGS = makeSymbol("DECACHE-AFTER-ADDINGS");

    public static final SubLSymbol DECACHE_AFTER_REMOVINGS = makeSymbol("DECACHE-AFTER-REMOVINGS");

    public static final SubLSymbol DECACHE_RULE_AFTER_ADDINGS = makeSymbol("DECACHE-RULE-AFTER-ADDINGS");

    public static final SubLSymbol DECACHE_RULE_AFTER_REMOVINGS = makeSymbol("DECACHE-RULE-AFTER-REMOVINGS");

    public static final SubLSymbol CLEAR_MT_DEPENDENT_CACHES = makeSymbol("CLEAR-MT-DEPENDENT-CACHES");

    public static final SubLSymbol CLEAR_GENLS_DEPENDENT_CACHES = makeSymbol("CLEAR-GENLS-DEPENDENT-CACHES");

    public static final SubLSymbol CLEAR_ISA_DEPENDENT_CACHES = makeSymbol("CLEAR-ISA-DEPENDENT-CACHES");

    public static final SubLSymbol CLEAR_QUOTED_ISA_DEPENDENT_CACHES = makeSymbol("CLEAR-QUOTED-ISA-DEPENDENT-CACHES");

    public static final SubLSymbol CLEAR_GENL_PRED_DEPENDENT_CACHES = makeSymbol("CLEAR-GENL-PRED-DEPENDENT-CACHES");

    public static final SubLSymbol ADD_TRANSITIVE_VIA_ARG = makeSymbol("ADD-TRANSITIVE-VIA-ARG");

    public static final SubLSymbol REMOVE_TRANSITIVE_VIA_ARG = makeSymbol("REMOVE-TRANSITIVE-VIA-ARG");

    public static final SubLSymbol ADD_TRANSITIVE_VIA_ARG_INVERSE = makeSymbol("ADD-TRANSITIVE-VIA-ARG-INVERSE");

    public static final SubLSymbol REMOVE_TRANSITIVE_VIA_ARG_INVERSE = makeSymbol("REMOVE-TRANSITIVE-VIA-ARG-INVERSE");

    public static final SubLSymbol CLEAR_CACHED_TVA_CHECKS = makeSymbol("CLEAR-CACHED-TVA-CHECKS");

    public static final SubLSymbol CLEAR_CACHED_SOME_TVA_CHECKS = makeSymbol("CLEAR-CACHED-SOME-TVA-CHECKS");

    public static final SubLSymbol CLEAR_CACHED_CVA_CHECKS = makeSymbol("CLEAR-CACHED-CVA-CHECKS");

    public static final SubLSymbol CLEAR_CACHED_SOME_CVA_CHECKS = makeSymbol("CLEAR-CACHED-SOME-CVA-CHECKS");

    public static final SubLSymbol SKOLEM_AFTER_REMOVING = makeSymbol("SKOLEM-AFTER-REMOVING");

    public static final SubLSymbol ADD_OLD_CONSTANT_NAME = makeSymbol("ADD-OLD-CONSTANT-NAME");

    public static final SubLSymbol REMOVE_OLD_CONSTANT_NAME = makeSymbol("REMOVE-OLD-CONSTANT-NAME");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    public static final SubLSymbol PROPAGATE_TO_ISA = makeSymbol("PROPAGATE-TO-ISA");

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    public static final SubLSymbol PROPAGATE_TO_GENLS = makeSymbol("PROPAGATE-TO-GENLS");

    private static final SubLObject $$disjointWith = reader_make_constant_shell(makeString("disjointWith"));

    public static final SubLSymbol PROPAGATE_TO_DISJOINTWITH = makeSymbol("PROPAGATE-TO-DISJOINTWITH");

    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));

    public static final SubLSymbol PROPAGATE_TO_GENLMT = makeSymbol("PROPAGATE-TO-GENLMT");

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    public static final SubLSymbol PROPAGATE_TO_GENLPREDS = makeSymbol("PROPAGATE-TO-GENLPREDS");

    private static final SubLObject $$negationPreds = reader_make_constant_shell(makeString("negationPreds"));

    public static final SubLSymbol PROPAGATE_TO_NEGATIONPREDS = makeSymbol("PROPAGATE-TO-NEGATIONPREDS");

    private static final SubLObject $$genlInverse = reader_make_constant_shell(makeString("genlInverse"));

    public static final SubLSymbol PROPAGATE_TO_GENLINVERSE = makeSymbol("PROPAGATE-TO-GENLINVERSE");

    private static final SubLObject $$negationInverse = reader_make_constant_shell(makeString("negationInverse"));

    public static final SubLSymbol PROPAGATE_TO_NEGATIONINVERSE = makeSymbol("PROPAGATE-TO-NEGATIONINVERSE");

    public static final SubLSymbol PROPAGATE_INVERSE_TO_ISA = makeSymbol("PROPAGATE-INVERSE-TO-ISA");

    public static final SubLSymbol PROPAGATE_INVERSE_TO_GENLS = makeSymbol("PROPAGATE-INVERSE-TO-GENLS");

    public static final SubLSymbol PROPAGATE_INVERSE_TO_GENLMT = makeSymbol("PROPAGATE-INVERSE-TO-GENLMT");

    public static final SubLSymbol PROPAGATE_INVERSE_TO_GENLPREDS = makeSymbol("PROPAGATE-INVERSE-TO-GENLPREDS");

    public static final SubLSymbol PROPAGATE_INVERSE_TO_GENLINVERSE = makeSymbol("PROPAGATE-INVERSE-TO-GENLINVERSE");

    public static final SubLList $list43 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));





    private static final SubLList $list46 = list(makeSymbol("IST"), makeSymbol("MT"), makeSymbol("FORMULA"));

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    private static final SubLSymbol ADD_IST = makeSymbol("ADD-IST");

    private static final SubLObject $$implies = reader_make_constant_shell(makeString("implies"));

    private static final SubLList $list50 = list(makeSymbol("?FORMULA"));





    private static final SubLSymbol ADD_TRUE_RULE = makeSymbol("ADD-TRUE-RULE");

    private static final SubLList $list54 = list(reader_make_constant_shell(makeString("implies")), list(reader_make_constant_shell(makeString("trueRule")), makeSymbol("?TEMPLATE"), makeSymbol("?FORMULA")), makeSymbol("?FORMULA"));

    public static final SubLSymbol $true_rule_defining_mt$ = makeSymbol("*TRUE-RULE-DEFINING-MT*");

    private static final SubLObject $$CoreCycLMt = reader_make_constant_shell(makeString("CoreCycLMt"));

    private static final SubLObject $$trueRule = reader_make_constant_shell(makeString("trueRule"));



    private static final SubLObject $$ruleTemplateDirection = reader_make_constant_shell(makeString("ruleTemplateDirection"));

    private static final SubLObject $$Forward_AssertionDirection = reader_make_constant_shell(makeString("Forward-AssertionDirection"));



    private static final SubLObject $$Backward_AssertionDirection = reader_make_constant_shell(makeString("Backward-AssertionDirection"));



    private static final SubLSymbol ADD_RULE_TEMPLATE_DIRECTION = makeSymbol("ADD-RULE-TEMPLATE-DIRECTION");

    private static final SubLSymbol REMOVE_RULE_TEMPLATE_DIRECTION = makeSymbol("REMOVE-RULE-TEMPLATE-DIRECTION");







    private static final SubLSymbol TRUE_RULE_SUPPORT_P = makeSymbol("TRUE-RULE-SUPPORT-P");

    private static final SubLSymbol REMOVE_DEPENDENT_TERM = makeSymbol("REMOVE-DEPENDENT-TERM");

    private static final SubLObject $$arity = reader_make_constant_shell(makeString("arity"));

    private static final SubLSymbol PROPAGATE_TO_ARITY = makeSymbol("PROPAGATE-TO-ARITY");

    private static final SubLSymbol ADD_ARITY = makeSymbol("ADD-ARITY");

    private static final SubLSymbol REMOVE_ARITY = makeSymbol("REMOVE-ARITY");

    private static final SubLObject $$arityMin = reader_make_constant_shell(makeString("arityMin"));

    private static final SubLSymbol PROPAGATE_TO_ARITY_MIN = makeSymbol("PROPAGATE-TO-ARITY-MIN");

    private static final SubLSymbol ADD_ARITY_MIN = makeSymbol("ADD-ARITY-MIN");

    private static final SubLSymbol REMOVE_ARITY_MIN = makeSymbol("REMOVE-ARITY-MIN");

    private static final SubLObject $$arityMax = reader_make_constant_shell(makeString("arityMax"));

    private static final SubLSymbol PROPAGATE_TO_ARITY_MAX = makeSymbol("PROPAGATE-TO-ARITY-MAX");

    private static final SubLSymbol ADD_ARITY_MAX = makeSymbol("ADD-ARITY-MAX");

    private static final SubLSymbol REMOVE_ARITY_MAX = makeSymbol("REMOVE-ARITY-MAX");

    private static final SubLSymbol INTER_ARG_ISA_AFTER_ADDING = makeSymbol("INTER-ARG-ISA-AFTER-ADDING");

    private static final SubLSymbol INTER_ARG_ISA_AFTER_REMOVING = makeSymbol("INTER-ARG-ISA-AFTER-REMOVING");

    private static final SubLSymbol INTER_ARG_FORMAT_AFTER_ADDING = makeSymbol("INTER-ARG-FORMAT-AFTER-ADDING");

    private static final SubLSymbol INTER_ARG_FORMAT_AFTER_REMOVING = makeSymbol("INTER-ARG-FORMAT-AFTER-REMOVING");

    private static final SubLSymbol ADD_TO_CONTRACTION_HT = makeSymbol("ADD-TO-CONTRACTION-HT");

    private static final SubLSymbol REMOVE_FROM_CONTRACTION_HT = makeSymbol("REMOVE-FROM-CONTRACTION-HT");

    private static final SubLSymbol ADD_GEN_TEMPLATE_EXPANSION = makeSymbol("ADD-GEN-TEMPLATE-EXPANSION");

    private static final SubLSymbol REMOVE_GEN_TEMPLATE_EXPANSION = makeSymbol("REMOVE-GEN-TEMPLATE-EXPANSION");

    private static final SubLObject $$expansion = reader_make_constant_shell(makeString("expansion"));

    private static final SubLList $list92 = list(reader_make_constant_shell(makeString("afterAdding")), reader_make_constant_shell(makeString("expansionAxiom")), makeSymbol("ADD-EXPANSION-AXIOM"));

    private static final SubLObject $$expansionAxiom = reader_make_constant_shell(makeString("expansionAxiom"));







    private static final SubLObject $$True = reader_make_constant_shell(makeString("True"));

    private static final SubLSymbol ADD_EXPANSION_AXIOM = makeSymbol("ADD-EXPANSION-AXIOM");

    private static final SubLSymbol CYC_ADD_REFORMULATION_ASSERTION = makeSymbol("CYC-ADD-REFORMULATION-ASSERTION");

    private static final SubLSymbol CYC_REMOVE_REFORMULATION_ASSERTION = makeSymbol("CYC-REMOVE-REFORMULATION-ASSERTION");

    private static final SubLList $list101 = list(makeSymbol("EO"), makeSymbol("TERM"), makeSymbol("SETEXPR"));

    private static final SubLObject $$elementOf = reader_make_constant_shell(makeString("elementOf"));

    private static final SubLObject $$TheSetOf = reader_make_constant_shell(makeString("TheSetOf"));

    private static final SubLList $list104 = list(makeSymbol("TSO"), makeSymbol("VAR"), makeSymbol("PROP"));

    private static final SubLSymbol CYC_ADD_ELEMENT_OF = makeSymbol("CYC-ADD-ELEMENT-OF");

    private static final SubLSymbol CLEAR_UNIT_MULTIPLICATION_FACTOR_CACHES = makeSymbol("CLEAR-UNIT-MULTIPLICATION-FACTOR-CACHES");

    private static final SubLSymbol $sym107$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");

    private static final SubLSymbol $sym108$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");

    private static final SubLSymbol CYC_ADD_KNOWN_ANTECEDENT_RULE = makeSymbol("CYC-ADD-KNOWN-ANTECEDENT-RULE");

    private static final SubLSymbol CYC_REMOVE_KNOWN_ANTECEDENT_RULE = makeSymbol("CYC-REMOVE-KNOWN-ANTECEDENT-RULE");

    private static final SubLSymbol ADD_MERGED_CONSTANT_GUID = makeSymbol("ADD-MERGED-CONSTANT-GUID");

    private static final SubLSymbol REMOVE_MERGED_CONSTANT_GUID = makeSymbol("REMOVE-MERGED-CONSTANT-GUID");







    private static final SubLString $str116$do_broad_mt_index = makeString("do-broad-mt-index");





    private static final SubLSymbol CYC_EXCEPT_MT_ADDED = makeSymbol("CYC-EXCEPT-MT-ADDED");

    private static final SubLString $str120$Skipping_propagating_mt_contents_ = makeString("Skipping propagating mt contents of ~S");

    private static final SubLSymbol CYC_EXCEPT_MT_REMOVED = makeSymbol("CYC-EXCEPT-MT-REMOVED");

    private static final SubLSymbol CYC_EXCEPT_ADDED = makeSymbol("CYC-EXCEPT-ADDED");

    private static final SubLSymbol CYC_EXCEPT_REMOVED = makeSymbol("CYC-EXCEPT-REMOVED");

    private static final SubLObject $$except = reader_make_constant_shell(makeString("except"));



    private static final SubLSymbol ADD_RELATION_INSTANCE_ALL = makeSymbol("ADD-RELATION-INSTANCE-ALL");

    private static final SubLSymbol REMOVE_RELATION_INSTANCE_ALL = makeSymbol("REMOVE-RELATION-INSTANCE-ALL");

    private static final SubLSymbol ADD_RELATION_ALL_INSTANCE = makeSymbol("ADD-RELATION-ALL-INSTANCE");

    private static final SubLSymbol REMOVE_RELATION_ALL_INSTANCE = makeSymbol("REMOVE-RELATION-ALL-INSTANCE");

    private static final SubLString $str130$__do_create_from_description_mark = makeString("~&do-create-from-description marking as instantiated: ~S~%");

    private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));

    private static final SubLObject $$InstantiatedConstant = reader_make_constant_shell(makeString("InstantiatedConstant"));

    private static final SubLObject $$BookkeepingMt = reader_make_constant_shell(makeString("BookkeepingMt"));





    private static final SubLList $list136 = list(reader_make_constant_shell(makeString("BookkeepingMt")));

    private static final SubLString $str137$__do_create_from_description_crea = makeString("~&do-create-from-description creating new instantiated constant: ~A~%");

    private static final SubLSymbol FI_TIMESTAMP_ASSERTION = makeSymbol("FI-TIMESTAMP-ASSERTION");

    private static final SubLSymbol FI_TIMESTAMP_CONSTANT = makeSymbol("FI-TIMESTAMP-CONSTANT");

    private static final SubLString $str140$__do_create_from_description_afte = makeString("~&do-create-from-description after-adding called in forward inference using rule: ~S~%");

    private static final SubLSymbol $sym141$_TERM = makeSymbol("?TERM");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLString $str143$__do_create_from_description_reus = makeString("~&do-create-from-description reusing instantiated constant: ~S~%");

    private static final SubLString $str144$do_create_from_description_found_ = makeString("do-create-from-description found multiple terms ~S matching description pred ~S~%");

    private static final SubLString $str145$__do_create_from_description_reus = makeString("~&do-create-from-description reusing exiting term: ~S~%");

    private static final SubLString $str146$__do_create_from_description_reus = makeString("~&do-create-from-description reusing bare constant: ~S~%");

    private static final SubLString $str147$__do_create_from_description_reus = makeString("~&do-create-from-description reusing bare instantiated constant: ~S~%");



    private static final SubLSymbol DO_CREATE_FROM_DESCRIPTION = makeSymbol("DO-CREATE-FROM-DESCRIPTION");

    private static final SubLSymbol INSTANTIATED_CONSTANT_P = makeSymbol("INSTANTIATED-CONSTANT-P");



    private static final SubLSymbol MAKE_VALID_CONSTANT_NAME = makeSymbol("MAKE-VALID-CONSTANT-NAME");

    private static final SubLString $str153$do_create_from_description_multip = makeString("do-create-from-description-multiple found multiple terms~%~S~%matching description pred~%~S~%");

    private static final SubLSymbol $sym154$_ = makeSymbol(">");

    private static final SubLSymbol EXPRESSION_INSTANTIATED_CONSTANT_COUNT = makeSymbol("EXPRESSION-INSTANTIATED-CONSTANT-COUNT");

    private static final SubLSymbol $sym156$POSSIBLE_INSTANTIATED_CONSTANT_TO_REUSE_ = makeSymbol("POSSIBLE-INSTANTIATED-CONSTANT-TO-REUSE?");

    private static final SubLSymbol $sym157$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    private static final SubLSymbol DO_CREATE_FROM_DESCRIPTION_MULTIPLE = makeSymbol("DO-CREATE-FROM-DESCRIPTION-MULTIPLE");

    private static final SubLString $$$INST = makeString("INST");



    private static final SubLSymbol NART_EL_FORMULA = makeSymbol("NART-EL-FORMULA");

    private static final SubLSymbol CONSTANT_INSTANTIATED_FROM_SUBCOLLECTION_EXPRESSION_P = makeSymbol("CONSTANT-INSTANTIATED-FROM-SUBCOLLECTION-EXPRESSION-P");



    private static final SubLString $str164$More_than_one_terms_match_found_f = makeString("More than one terms match found for ~S.  Using first of: ~S");



    private static final SubLList $list166 = list(makeString("undeterminableName"));

    private static final SubLSymbol INSTANTIATE_FROM_SUBCOLLECTION_EXPRESSION = makeSymbol("INSTANTIATE-FROM-SUBCOLLECTION-EXPRESSION");

    private static final SubLString $str168$Finding_constants_with_no_asserti = makeString("Finding constants with no assertions");

    private static final SubLString $str169$Killing_constants_with_no_asserti = makeString("Killing constants with no assertions and with prefix in ");

    private static final SubLString $str170$__Killing__A__ = makeString("~&Killing ~A~%");

    private static final SubLString $str171$___A_constants_killed__ = makeString("~&~A constants killed~%");

    private static final SubLString $str172$Finding_instantiated_constants_wi = makeString("Finding instantiated constants with only one assertion");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLString $$$Gathering_instantiated_constants = makeString("Gathering instantiated constants");

    private static final SubLString $str176$Identifying_unused_instantiated_c = makeString("Identifying unused instantiated constants");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLString $$$Removing_ = makeString("Removing ");

    private static final SubLString $$$_unused_instantiated_constant = makeString(" unused instantiated constant");

    private static final SubLString $str180$ = makeString("");

    private static final SubLString $$$s = makeString("s");

    private static final SubLList $list182 = list(reader_make_constant_shell(makeString("MultiMediaAnalysisMt")), reader_make_constant_shell(makeString("SPRLAnnotationGenerationMt")), reader_make_constant_shell(makeString("DreamcatcherSKSIHelperMt")));

    private static final SubLSymbol DEDUCTION_SUPPORTED_OBJECT = makeSymbol("DEDUCTION-SUPPORTED-OBJECT");

    private static final SubLSymbol ASSERTION_EL_FORMULA = makeSymbol("ASSERTION-EL-FORMULA");

    private static final SubLObject $$doCreateFromDescription = reader_make_constant_shell(makeString("doCreateFromDescription"));

    private static final SubLObject $$doCreateFromDescription_Multiple = reader_make_constant_shell(makeString("doCreateFromDescription-Multiple"));

    private static final SubLString $str187$could_not_determine_created_const = makeString("could not determine created constants for ~A");

    private static final SubLString $str188$too_many_instantiated_constant_ga = makeString("too many instantiated constant gafs for ~A");

    private static final SubLString $str189$not_enough_instantiated_constant_ = makeString("not enough instantiated constant gafs for ~A");

    private static final SubLList $list190 = list(reader_make_constant_shell(makeString("doCreateFromDescription")), reader_make_constant_shell(makeString("doCreateFromDescription-Multiple")));



    private static final SubLList $list192 = list(makeKeyword("CHECK-WFF?"), NIL);

    private static final SubLSymbol RETAIN_MT_CONTENTS = makeSymbol("RETAIN-MT-CONTENTS");

    public static SubLObject decache_after_addings(final SubLObject argument, final SubLObject assertion) {
        assert NIL != arguments.argument_p(argument) : "arguments.argument_p(argument) " + "CommonSymbols.NIL != arguments.argument_p(argument) " + argument;
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject pred = assertions_high.gaf_arg(assertion, ONE_INTEGER);
            after_adding.recache_gaf_after_addings(pred);
        }
        return NIL;
    }

    public static SubLObject decache_after_removings(final SubLObject argument, final SubLObject assertion) {
        assert NIL != arguments.argument_p(argument) : "arguments.argument_p(argument) " + "CommonSymbols.NIL != arguments.argument_p(argument) " + argument;
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject pred = assertions_high.gaf_arg(assertion, ONE_INTEGER);
            after_adding.recache_gaf_after_removings(pred);
        }
        return NIL;
    }

    public static SubLObject decache_rule_after_addings(final SubLObject argument, final SubLObject assertion) {
        assert NIL != arguments.argument_p(argument) : "arguments.argument_p(argument) " + "CommonSymbols.NIL != arguments.argument_p(argument) " + argument;
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject pred = assertions_high.gaf_arg(assertion, ONE_INTEGER);
            rule_after_adding.recache_rule_after_addings(pred);
        }
        return NIL;
    }

    public static SubLObject decache_rule_after_removings(final SubLObject argument, final SubLObject assertion) {
        assert NIL != arguments.argument_p(argument) : "arguments.argument_p(argument) " + "CommonSymbols.NIL != arguments.argument_p(argument) " + argument;
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject pred = assertions_high.gaf_arg(assertion, ONE_INTEGER);
            rule_after_adding.recache_rule_after_removings(pred);
        }
        return NIL;
    }

    public static SubLObject clear_mt_dependent_caches(final SubLObject argument, final SubLObject assertion) {
        return possibly_clear_mt_dependent_caches(argument, assertion);
    }

    public static SubLObject possibly_clear_mt_dependent_caches(final SubLObject argument, final SubLObject assertion) {
        if (NIL != memoization_state.clear_mt_dependent_cachesP()) {
            clear_mt_dependent_caches_int(argument, assertion);
        }
        return NIL;
    }

    public static SubLObject clear_mt_dependent_caches_int(final SubLObject argument, final SubLObject assertion) {
        genl_mts.clear_all_base_mts();
        mt_relevance_cache.update_mt_relevance_cache(argument, assertion);
        predicate_relevance_cache.clear_predicate_relevance_cache();
        sdc.clear_cached_all_isa_sdct();
        tva_utilities.clear_cached_some_tva_for_predicate();
        SubLObject cdolist_list_var = memoization_state.$mt_dependent_cache_clear_callbacks$.getGlobalValue();
        SubLObject callback = NIL;
        callback = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != fboundp(callback)) {
                funcall(callback);
            }
            cdolist_list_var = cdolist_list_var.rest();
            callback = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject clear_genls_dependent_caches(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $inside_clear_genls_dependent_cachesP$.getDynamicValue(thread)) {
            final SubLObject _prev_bind_0 = $inside_clear_genls_dependent_cachesP$.currentBinding(thread);
            try {
                $inside_clear_genls_dependent_cachesP$.bind(T, thread);
                SubLObject cdolist_list_var = memoization_state.$genls_dependent_cache_clear_callbacks$.getGlobalValue();
                SubLObject callback = NIL;
                callback = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != fboundp(callback)) {
                        funcall(callback);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    callback = cdolist_list_var.first();
                } 
                clear_isa_dependent_caches_internal();
                clear_quoted_isa_dependent_caches_internal();
            } finally {
                $inside_clear_genls_dependent_cachesP$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject clear_isa_dependent_caches(final SubLObject argument, final SubLObject assertion) {
        clear_isa_dependent_caches_internal();
        return NIL;
    }

    public static SubLObject clear_isa_dependent_caches_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $inside_clear_isa_dependent_cachesP$.getDynamicValue(thread)) {
            final SubLObject _prev_bind_0 = $inside_clear_isa_dependent_cachesP$.currentBinding(thread);
            try {
                $inside_clear_isa_dependent_cachesP$.bind(T, thread);
                sdc.clear_cached_all_isa_sdct();
                sksi_kb_accessors.clear_sksi_content_mts();
                SubLObject cdolist_list_var = memoization_state.$isa_dependent_cache_clear_callbacks$.getGlobalValue();
                SubLObject callback = NIL;
                callback = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != fboundp(callback)) {
                        funcall(callback);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    callback = cdolist_list_var.first();
                } 
            } finally {
                $inside_clear_isa_dependent_cachesP$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject clear_quoted_isa_dependent_caches(final SubLObject argument, final SubLObject assertion) {
        clear_quoted_isa_dependent_caches_internal();
        return NIL;
    }

    public static SubLObject clear_quoted_isa_dependent_caches_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $inside_clear_quoted_isa_dependent_cachesP$.getDynamicValue(thread)) {
            final SubLObject _prev_bind_0 = $inside_clear_quoted_isa_dependent_cachesP$.currentBinding(thread);
            try {
                $inside_clear_quoted_isa_dependent_cachesP$.bind(T, thread);
                SubLObject cdolist_list_var = memoization_state.$quoted_isa_dependent_cache_clear_callbacks$.getGlobalValue();
                SubLObject callback = NIL;
                callback = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != fboundp(callback)) {
                        funcall(callback);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    callback = cdolist_list_var.first();
                } 
            } finally {
                $inside_clear_quoted_isa_dependent_cachesP$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject clear_genl_pred_dependent_caches(final SubLObject argument, final SubLObject assertion) {
        predicate_relevance_cache.clear_predicate_relevance_cache();
        tva_utilities.clear_cached_some_tva_for_predicate();
        SubLObject cdolist_list_var = memoization_state.$genl_preds_dependent_cache_clear_callbacks$.getGlobalValue();
        SubLObject callback = NIL;
        callback = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != fboundp(callback)) {
                funcall(callback);
            }
            cdolist_list_var = cdolist_list_var.rest();
            callback = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject add_transitive_via_arg(final SubLObject argument, final SubLObject assertion) {
        tva_cache.tva_cache_add_transitive_via_arg(assertion);
        return NIL;
    }

    public static SubLObject remove_transitive_via_arg(final SubLObject argument, final SubLObject assertion) {
        tva_cache.tva_cache_remove_transitive_via_arg(assertion);
        return NIL;
    }

    public static SubLObject add_transitive_via_arg_inverse(final SubLObject argument, final SubLObject assertion) {
        tva_cache.tva_cache_add_transitive_via_arg_inverse(assertion);
        return NIL;
    }

    public static SubLObject remove_transitive_via_arg_inverse(final SubLObject argument, final SubLObject assertion) {
        tva_cache.tva_cache_remove_transitive_via_arg_inverse(assertion);
        return NIL;
    }

    public static SubLObject clear_cached_tva_checks(final SubLObject argument, final SubLObject assertion) {
        tva_utilities.clear_cached_some_tva_for_predicate();
        return NIL;
    }

    public static SubLObject clear_cached_some_tva_checks(final SubLObject argument, final SubLObject assertion) {
        tva_utilities.clear_cached_some_tva_for_predicate();
        return NIL;
    }

    public static SubLObject clear_cached_cva_checks(final SubLObject argument, final SubLObject assertion) {
        tva_utilities.clear_cached_some_cva_for_predicate();
        return NIL;
    }

    public static SubLObject clear_cached_some_cva_checks(final SubLObject argument, final SubLObject assertion) {
        tva_utilities.clear_cached_some_cva_for_predicate();
        return NIL;
    }

    public static SubLObject skolem_after_removing(final SubLObject argument, final SubLObject assertion) {
        final SubLObject skolem_function = assertions_high.gaf_arg1(assertion);
        if (NIL == hl_macros.fort_being_removedP(skolem_function)) {
            cyc_kernel.cyc_kill(skolem_function);
        }
        return NIL;
    }

    public static SubLObject add_old_constant_name(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject constant = assertions_high.gaf_arg(assertion, ONE_INTEGER);
            final SubLObject string = assertions_high.gaf_arg(assertion, TWO_INTEGER);
            if ((NIL != constant_p(constant)) && (NIL == constant_p(constants_high.find_constant(string)))) {
                ke.cache_old_constant_name(string, constant);
            }
            return NIL;
        }
        return NIL;
    }

    public static SubLObject remove_old_constant_name(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject constant = assertions_high.gaf_arg(assertion, ONE_INTEGER);
            final SubLObject string = assertions_high.gaf_arg(assertion, TWO_INTEGER);
            if ((NIL != constant_p(constant)) && (NIL == constant_p(constants_high.find_constant(string)))) {
                ke.decache_old_constant_name(string, constant);
            }
            return NIL;
        }
        return NIL;
    }

    public static SubLObject propagate_to_isa(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses($$isa, assertion);
    }

    public static SubLObject propagate_to_genls(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses($$genls, assertion);
    }

    public static SubLObject propagate_to_disjointwith(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses($$disjointWith, assertion);
    }

    public static SubLObject propagate_to_genlmt(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses($$genlMt, assertion);
    }

    public static SubLObject propagate_to_genlpreds(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses($$genlPreds, assertion);
    }

    public static SubLObject propagate_to_negationpreds(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses($$negationPreds, assertion);
    }

    public static SubLObject propagate_to_genlinverse(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses($$genlInverse, assertion);
    }

    public static SubLObject propagate_to_negationinverse(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses($$negationInverse, assertion);
    }

    public static SubLObject propagate_inverse_to_isa(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_inverse_uses($$isa, assertion);
    }

    public static SubLObject propagate_inverse_to_genls(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_inverse_uses($$genls, assertion);
    }

    public static SubLObject propagate_inverse_to_genlmt(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_inverse_uses($$genlMt, assertion);
    }

    public static SubLObject propagate_inverse_to_genlpreds(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_inverse_uses($$genlPreds, assertion);
    }

    public static SubLObject propagate_inverse_to_genlinverse(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_inverse_uses($$genlInverse, assertion);
    }

    public static SubLObject propagate_sbhl_spec_pred_uses(final SubLObject sbhl_pred, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            final SubLObject formula = assertions_high.gaf_formula(assertion);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            if (literal_arity(formula, UNPROVIDED).numE(TWO_INTEGER)) {
                SubLObject current;
                final SubLObject datum = current = formula;
                SubLObject pred = NIL;
                SubLObject arg1 = NIL;
                SubLObject arg2 = NIL;
                destructuring_bind_must_consp(current, datum, $list43);
                pred = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list43);
                arg1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list43);
                arg2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != genl_predicates.genl_predP(pred, sbhl_pred, mt, UNPROVIDED)) {
                        final SubLObject result_formula = list(sbhl_pred, arg1, arg2);
                        final SubLObject more_support_formula = list($$genlPreds, pred, sbhl_pred);
                        final SubLObject more_support = fi.make_el_support($GENLPREDS, more_support_formula, mt, $MONOTONIC);
                        final SubLObject supports = list(assertion, more_support);
                        fi.fi_add_argument_int(result_formula, mt, supports, UNPROVIDED, UNPROVIDED);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list43);
                }
            }
        }
        return NIL;
    }

    public static SubLObject propagate_sbhl_spec_inverse_uses(final SubLObject sbhl_pred, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            final SubLObject formula = assertions_high.gaf_formula(assertion);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            if (literal_arity(formula, UNPROVIDED).numE(TWO_INTEGER)) {
                SubLObject current;
                final SubLObject datum = current = formula;
                SubLObject pred = NIL;
                SubLObject arg1 = NIL;
                SubLObject arg2 = NIL;
                destructuring_bind_must_consp(current, datum, $list43);
                pred = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list43);
                arg1 = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list43);
                arg2 = current.first();
                current = current.rest();
                if (NIL == current) {
                    if (NIL != genl_predicates.genl_inverseP(pred, sbhl_pred, mt, UNPROVIDED)) {
                        final SubLObject result_formula = list(sbhl_pred, arg2, arg1);
                        final SubLObject more_support_formula = list($$genlInverse, pred, sbhl_pred);
                        final SubLObject more_support = fi.make_el_support($GENLPREDS, more_support_formula, mt, $MONOTONIC);
                        final SubLObject supports = list(assertion, more_support);
                        fi.fi_add_argument_int(result_formula, mt, supports, UNPROVIDED, UNPROVIDED);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list43);
                }
            }
        }
        return NIL;
    }

    public static SubLObject add_ist(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_assertionP(assertion)) {
            final SubLObject ist_formula = fi.assertion_fi_formula(assertion, UNPROVIDED);
            final SubLObject direction = assertions_high.assertion_direction(assertion);
            SubLObject current;
            final SubLObject datum = current = ist_formula;
            SubLObject ist = NIL;
            SubLObject mt = NIL;
            SubLObject formula = NIL;
            destructuring_bind_must_consp(current, datum, $list46);
            ist = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list46);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list46);
            formula = current.first();
            current = current.rest();
            if (NIL == current) {
                if (ist.eql($$ist)) {
                    final SubLObject hl_rule_support = add_ist_el_support(mt);
                    final SubLObject supports = list(hl_rule_support, assertion);
                    fi.fi_add_argument_int(formula, mt, supports, direction, UNPROVIDED);
                }
            } else {
                cdestructuring_bind_error(datum, $list46);
            }
        }
        return NIL;
    }

    public static SubLObject add_ist_el_support(final SubLObject mt) {
        final SubLObject hl_rule = listS($$implies, listS($$ist, mt, $list50), $list50);
        return fi.make_el_support($CODE, hl_rule, mt, $MONOTONIC);
    }

    public static SubLObject add_true_rule(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject template = assertions_high.gaf_arg1(assertion);
            final SubLObject rule_formula = assertions_high.gaf_arg2(assertion);
            final SubLObject direction = rule_template_direction(template, mt);
            final SubLObject true_rule_el_support = true_rule_el_support();
            final SubLObject supports = list(true_rule_el_support, assertion);
            final SubLObject environment = forward.get_forward_inference_environment();
            assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
            final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                fi.fi_add_argument_int(rule_formula, mt, supports, direction, UNPROVIDED);
            } finally {
                kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject true_rule_el_support() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hl_rule = $true_rule_template$.getDynamicValue(thread);
        return fi.make_el_support($CODE, hl_rule, $true_rule_defining_mt$.getGlobalValue(), $MONOTONIC);
    }

    public static SubLObject true_rule_support_p(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL == assertion_handles.assertion_p(support)) && $true_rule_template$.getDynamicValue(thread).equal(arguments.support_formula(support)));
    }

    public static SubLObject rule_template_direction(final SubLObject rule_template, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        assert NIL != forts.fort_p(rule_template) : "forts.fort_p(rule_template) " + "CommonSymbols.NIL != forts.fort_p(rule_template) " + rule_template;
        final SubLObject pcase_var;
        final SubLObject direction = pcase_var = kb_mapping_utilities.fpred_value_in_relevant_mts(rule_template, $$ruleTemplateDirection, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (pcase_var.eql($$Forward_AssertionDirection)) {
            return $FORWARD;
        }
        if (pcase_var.eql($$Backward_AssertionDirection)) {
            return $BACKWARD;
        }
        return $BACKWARD;
    }

    public static SubLObject add_rule_template_direction(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject template = assertions_high.gaf_arg1(assertion);
            final SubLObject direction = assertions_high.gaf_arg2(assertion);
            final SubLObject template_instantiations = rule_template_instantiations(template, mt);
            final SubLObject pcase_var = direction;
            if (pcase_var.eql($$Forward_AssertionDirection)) {
                SubLObject cdolist_list_var = template_instantiations;
                SubLObject template_instantiation = NIL;
                template_instantiation = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    tms.tms_change_direction(template_instantiation, $FORWARD);
                    cdolist_list_var = cdolist_list_var.rest();
                    template_instantiation = cdolist_list_var.first();
                } 
                forward.perform_forward_inference();
            } else
                if (pcase_var.eql($$Backward_AssertionDirection)) {
                    SubLObject cdolist_list_var = template_instantiations;
                    SubLObject template_instantiation = NIL;
                    template_instantiation = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        tms.tms_change_direction(template_instantiation, $BACKWARD);
                        cdolist_list_var = cdolist_list_var.rest();
                        template_instantiation = cdolist_list_var.first();
                    } 
                }

        }
        return NIL;
    }

    public static SubLObject remove_rule_template_direction(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject template = assertions_high.gaf_arg1(assertion);
            SubLObject cdolist_list_var;
            final SubLObject template_instantiations = cdolist_list_var = rule_template_instantiations(template, mt);
            SubLObject template_instantiation = NIL;
            template_instantiation = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                tms.tms_change_direction(template_instantiation, $BACKWARD);
                cdolist_list_var = cdolist_list_var.rest();
                template_instantiation = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject rule_template_instantiations(final SubLObject template, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject instantiations = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject pred_var = $$trueRule;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(template, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(template, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$1 = NIL;
                            final SubLObject token_var_$2 = NIL;
                            while (NIL == done_var_$1) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(ass));
                                if (NIL != valid_$3) {
                                    final SubLObject set_contents_var = assertions_high.assertion_dependents(ass);
                                    SubLObject basis_object;
                                    SubLObject state;
                                    SubLObject deduction;
                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                        deduction = set_contents.do_set_contents_next(basis_object, state);
                                        if ((NIL != set_contents.do_set_contents_element_validP(state, deduction)) && (NIL != rule_template_instantiation_deduction(deduction))) {
                                            instantiations = cons(deductions_high.deduction_supported_object(deduction), instantiations);
                                        }
                                    }
                                }
                                done_var_$1 = makeBoolean(NIL == valid_$3);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
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
        return nreverse(instantiations);
    }

    public static SubLObject rule_template_instantiation_deduction(final SubLObject deduction) {
        assert NIL != deduction_handles.deduction_p(deduction) : "deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) " + deduction;
        return find_if(symbol_function(TRUE_RULE_SUPPORT_P), deductions_high.deduction_supports(deduction), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_dependent_term(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            final SubLObject dependent_term = assertions_high.gaf_arg1(assertion);
            if ((NIL != forts.fort_p(dependent_term)) && (NIL == hl_macros.fort_being_removedP(dependent_term))) {
                final SubLObject independent_term = assertions_high.gaf_arg2(assertion);
                if ((NIL != forts.fort_p(independent_term)) && (NIL != hl_macros.fort_being_removed_or_will_be_removedP(independent_term))) {
                    return cyc_kernel.cyc_kill(dependent_term);
                }
            }
        }
        return NIL;
    }

    public static SubLObject propagate_to_arity(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses($$arity, assertion);
    }

    public static SubLObject add_arity(final SubLObject argument, final SubLObject assertion) {
        if ((NIL != assertion_utilities.true_assertionP(assertion)) && (NIL != assertions_high.only_argument_of_assertion_p(assertion, argument))) {
            final SubLObject relation = assertions_high.gaf_arg1(assertion);
            final SubLObject v_arity = assertions_high.gaf_arg2(assertion);
            arity.maybe_add_arity_for_relation(relation, v_arity);
        }
        return assertion;
    }

    public static SubLObject remove_arity(final SubLObject argument, final SubLObject assertion) {
        if (NIL == kb_accessors.assertion_still_thereP(assertion, $TRUE)) {
            final SubLObject relation = assertions_high.gaf_arg1(assertion);
            final SubLObject v_arity = assertions_high.gaf_arg2(assertion);
            arity.maybe_remove_arity_for_relation(relation, v_arity);
        }
        return assertion;
    }

    public static SubLObject propagate_to_arity_min(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses($$arityMin, assertion);
    }

    public static SubLObject add_arity_min(final SubLObject argument, final SubLObject assertion) {
        if ((NIL != assertion_utilities.true_assertionP(assertion)) && (NIL != assertions_high.only_argument_of_assertion_p(assertion, argument))) {
            final SubLObject relation = assertions_high.gaf_arg1(assertion);
            final SubLObject arity_min = assertions_high.gaf_arg2(assertion);
            arity.maybe_add_arity_min_for_relation(relation, arity_min);
        }
        return assertion;
    }

    public static SubLObject remove_arity_min(final SubLObject argument, final SubLObject assertion) {
        if (NIL == kb_accessors.assertion_still_thereP(assertion, $TRUE)) {
            final SubLObject relation = assertions_high.gaf_arg1(assertion);
            arity.maybe_remove_arity_min_for_relation(relation);
        }
        return assertion;
    }

    public static SubLObject propagate_to_arity_max(final SubLObject argument, final SubLObject assertion) {
        return propagate_sbhl_spec_pred_uses($$arityMax, assertion);
    }

    public static SubLObject add_arity_max(final SubLObject argument, final SubLObject assertion) {
        if ((NIL != assertion_utilities.true_assertionP(assertion)) && (NIL != assertions_high.only_argument_of_assertion_p(assertion, argument))) {
            final SubLObject relation = assertions_high.gaf_arg1(assertion);
            final SubLObject arity_max = assertions_high.gaf_arg2(assertion);
            arity.maybe_add_arity_max_for_relation(relation, arity_max);
        }
        return assertion;
    }

    public static SubLObject remove_arity_max(final SubLObject argument, final SubLObject assertion) {
        if (NIL == kb_accessors.assertion_still_thereP(assertion, $TRUE)) {
            final SubLObject relation = assertions_high.gaf_arg1(assertion);
            arity.maybe_remove_arity_max_for_relation(relation);
        }
        return assertion;
    }

    public static SubLObject inter_arg_isa_after_adding(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            final SubLObject reln = assertions_high.gaf_arg1(assertion);
            at_utilities.some_inter_arg_isa_assertion_somewhere_cache_add(reln);
        }
        return NIL;
    }

    public static SubLObject inter_arg_isa_after_removing(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            final SubLObject reln = assertions_high.gaf_arg1(assertion);
            at_utilities.some_inter_arg_isa_assertion_somewhere_cache_maybe_remove(reln);
        }
        return NIL;
    }

    public static SubLObject inter_arg_format_after_adding(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            final SubLObject reln = assertions_high.gaf_arg1(assertion);
            at_utilities.some_inter_arg_format_assertion_somewhere_cache_add(reln);
        }
        return NIL;
    }

    public static SubLObject inter_arg_format_after_removing(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertion_utilities.true_gaf_assertionP(assertion)) {
            final SubLObject reln = assertions_high.gaf_arg1(assertion);
            at_utilities.some_inter_arg_format_assertion_somewhere_cache_maybe_remove(reln);
        }
        return NIL;
    }

    public static SubLObject add_to_contraction_ht(final SubLObject argument, final SubLObject assertion) {
        return tersifier.add_assertion_to_contraction_ht(assertion);
    }

    public static SubLObject remove_from_contraction_ht(final SubLObject argument, final SubLObject assertion) {
        return tersifier.remove_assertion_from_contraction_ht(assertion);
    }

    public static SubLObject add_gen_template_expansion(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject reln = assertions_high.gaf_arg1(assertion);
            if (NIL != pph_functions.pph_phrase_fnP(reln, UNPROVIDED)) {
                pph_templates.reinitialize_gen_templates_referencing_phrase_fn(reln);
            }
        }
        return assertion;
    }

    public static SubLObject remove_gen_template_expansion(final SubLObject argument, final SubLObject assertion) {
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject reln = assertions_high.gaf_arg1(assertion);
            if (NIL != pph_functions.pph_phrase_fnP(reln, UNPROVIDED)) {
                pph_templates.reinitialize_gen_templates_referencing_phrase_fn(reln);
            }
        }
        return assertion;
    }

    public static SubLObject add_expansion_axiom(final SubLObject argument, final SubLObject meta_assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != after_adding.initial_assertion_argumentP(argument, meta_assertion)) && (NIL != assertion_utilities.true_assertionP(meta_assertion))) {
            final SubLObject rm_pred = assertions_high.gaf_arg1(meta_assertion);
            final SubLObject assertion = assertions_high.gaf_arg2(meta_assertion);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            if (NIL == kb_mapping_utilities.fpred_value_in_relevant_mts(rm_pred, $$expansion, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                final SubLObject add_expansion_axiom_assertion = czer_utilities.safe_find_gaf_genl_mts($list92, mt);
                SubLObject validP = T;
                if (NIL != add_expansion_axiom_assertion) {
                    final SubLObject formula = uncanonicalizer.assertion_el_formula(assertion);
                    final SubLObject sibling_expansion_axioms = remove(assertion, kb_mapping_utilities.pred_values_in_relevant_mts(rm_pred, $$expansionAxiom, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject cnfs = NIL;
                    SubLObject expansion = NIL;
                    if (NIL != sibling_expansion_axioms) {
                        SubLObject invalidP = NIL;
                        if (NIL == invalidP) {
                            SubLObject csome_list_var;
                            SubLObject sibling_expansion_axiom;
                            for (csome_list_var = sibling_expansion_axioms, sibling_expansion_axiom = NIL, sibling_expansion_axiom = csome_list_var.first(); (NIL == invalidP) && (NIL != csome_list_var); invalidP = makeBoolean(!formula.equal(uncanonicalizer.assertion_el_formula(sibling_expansion_axiom))) , csome_list_var = csome_list_var.rest() , sibling_expansion_axiom = csome_list_var.first()) {
                            }
                        }
                        validP = makeBoolean(NIL == invalidP);
                    }
                    if (NIL != validP) {
                        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                            mt_relevance_macros.$mt$.bind(mt, thread);
                            wff.reset_wff_state();
                            cnfs = clausifier.clausal_form(formula, mt, $CNF);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                        if (cnfs.isList() && (NIL != list_utilities.singletonP(remove_duplicates(Mapping.mapcar(symbol_function(NEG_LITS), cnfs), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                            SubLObject pred_neg_lit = NIL;
                            SubLObject blist = NIL;
                            final SubLObject cnf = cnfs.first();
                            final SubLObject neg_lits = clauses.neg_lits(cnf);
                            if (NIL == pred_neg_lit) {
                                SubLObject csome_list_var2 = neg_lits;
                                SubLObject neg_lit = NIL;
                                neg_lit = csome_list_var2.first();
                                while ((NIL == pred_neg_lit) && (NIL != csome_list_var2)) {
                                    if (rm_pred.eql(literal_arg0(neg_lit, UNPROVIDED))) {
                                        SubLObject argnum = ZERO_INTEGER;
                                        SubLObject non_varP = NIL;
                                        if (NIL == non_varP) {
                                            SubLObject csome_list_var_$5 = literal_args(neg_lit, UNPROVIDED);
                                            SubLObject arg = NIL;
                                            arg = csome_list_var_$5.first();
                                            while ((NIL == non_varP) && (NIL != csome_list_var_$5)) {
                                                argnum = add(argnum, ONE_INTEGER);
                                                if (NIL != cycl_variables.el_varP(arg)) {
                                                    blist = cons(cons(arg, at_utilities.get_generic_arg(argnum)), blist);
                                                } else {
                                                    non_varP = T;
                                                }
                                                csome_list_var_$5 = csome_list_var_$5.rest();
                                                arg = csome_list_var_$5.first();
                                            } 
                                        }
                                        if (NIL == non_varP) {
                                            pred_neg_lit = neg_lit;
                                        }
                                    }
                                    csome_list_var2 = csome_list_var2.rest();
                                    neg_lit = csome_list_var2.first();
                                } 
                            }
                            if ((NIL != pred_neg_lit) && (NIL != blist)) {
                                final SubLObject _prev_bind_3 = wff_vars.$permit_generic_arg_variablesP$.currentBinding(thread);
                                try {
                                    wff_vars.$permit_generic_arg_variablesP$.bind(T, thread);
                                    final SubLObject _prev_bind_0_$6 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                        mt_relevance_macros.$mt$.bind(mt, thread);
                                        expansion = simplifier.simplify_cycl_sentence(sublis(blist, subst($$True, pred_neg_lit, formula, symbol_function(EQUAL), UNPROVIDED), UNPROVIDED, UNPROVIDED), UNPROVIDED);
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$6, thread);
                                    }
                                    if (((NIL != el_formula_p(expansion)) && (NIL != wff.el_wffP(expansion, mt, UNPROVIDED))) && (NIL == list_utilities.tree_find(rm_pred, expansion, UNPROVIDED, UNPROVIDED))) {
                                        fi.fi_add_argument_int(list($$expansion, rm_pred, expansion), mt, list(meta_assertion, add_expansion_axiom_assertion), $FORWARD, T);
                                    }
                                } finally {
                                    wff_vars.$permit_generic_arg_variablesP$.rebind(_prev_bind_3, thread);
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cyc_add_reformulation_assertion(final SubLObject argument, final SubLObject assertion) {
        if (((NIL != after_adding.initial_assertion_argumentP(argument, assertion)) && (NIL != reformulator_datastructures.reformulator_initializedP())) && (NIL != reformulator_datastructures.reformulator_relevant_assertionP(assertion))) {
            reformulator_datastructures.add_reformulation_assertion(assertion);
        }
        return NIL;
    }

    public static SubLObject cyc_remove_reformulation_assertion(final SubLObject argument, final SubLObject assertion) {
        if ((NIL != after_adding.final_assertion_argumentP(argument, assertion)) && (NIL != reformulator_datastructures.reformulator_initializedP())) {
            reformulator_datastructures.remove_reformulation_assertion(assertion);
        }
        return NIL;
    }

    public static SubLObject cyc_add_element_of(final SubLObject argument, final SubLObject assertion) {
        if ((NIL != after_adding.initial_assertion_argumentP(argument, assertion)) && (NIL != assertion_utilities.true_assertionP(assertion))) {
            final SubLObject eo_formula = fi.assertion_fi_formula(assertion, UNPROVIDED);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            SubLObject current;
            final SubLObject datum = current = eo_formula;
            SubLObject eo = NIL;
            SubLObject v_term = NIL;
            SubLObject setexpr = NIL;
            destructuring_bind_must_consp(current, datum, $list101);
            eo = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list101);
            v_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list101);
            setexpr = current.first();
            current = current.rest();
            if (NIL == current) {
                if (eo.eql($$elementOf) && (NIL != el_formula_with_operator_p(setexpr, $$TheSetOf))) {
                    SubLObject current_$8;
                    final SubLObject datum_$7 = current_$8 = setexpr;
                    SubLObject tso = NIL;
                    SubLObject var = NIL;
                    SubLObject prop = NIL;
                    destructuring_bind_must_consp(current_$8, datum_$7, $list104);
                    tso = current_$8.first();
                    current_$8 = current_$8.rest();
                    destructuring_bind_must_consp(current_$8, datum_$7, $list104);
                    var = current_$8.first();
                    current_$8 = current_$8.rest();
                    destructuring_bind_must_consp(current_$8, datum_$7, $list104);
                    prop = current_$8.first();
                    current_$8 = current_$8.rest();
                    if (NIL == current_$8) {
                        final SubLObject transformed_conclusion = cycl_utilities.expression_subst(v_term, var, prop, UNPROVIDED, UNPROVIDED);
                        fi.fi_add_argument_int(transformed_conclusion, mt, list(assertion), $FORWARD, T);
                    } else {
                        cdestructuring_bind_error(datum_$7, $list104);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list101);
            }
        }
        return NIL;
    }

    public static SubLObject clear_unit_multiplication_factor_caches(final SubLObject argument, final SubLObject assertion) {
        quantities.clear_get_definitional_unit_multiplication_factor();
        return NIL;
    }

    public static SubLObject cyc_add_known_antecedent_rule(final SubLObject argument, final SubLObject assertion) {
        assert NIL != assertions_high.gaf_assertionP(assertion) : "assertions_high.gaf_assertionP(assertion) " + "CommonSymbols.NIL != assertions_high.gaf_assertionP(assertion) " + assertion;
        final SubLObject rule = assertions_high.gaf_arg1(assertion);
        assert NIL != assertions_high.rule_assertionP(rule) : "assertions_high.rule_assertionP(rule) " + "CommonSymbols.NIL != assertions_high.rule_assertionP(rule) " + rule;
        removal_modules_known_antecedent_rule.declare_known_antecedent_rule_removal_module_for_rule(rule, T);
        return NIL;
    }

    public static SubLObject cyc_remove_known_antecedent_rule(final SubLObject argument, final SubLObject assertion) {
        assert NIL != assertions_high.gaf_assertionP(assertion) : "assertions_high.gaf_assertionP(assertion) " + "CommonSymbols.NIL != assertions_high.gaf_assertionP(assertion) " + assertion;
        final SubLObject rule = assertions_high.gaf_arg1(assertion);
        assert NIL != assertions_high.rule_assertionP(rule) : "assertions_high.rule_assertionP(rule) " + "CommonSymbols.NIL != assertions_high.rule_assertionP(rule) " + rule;
        removal_modules_known_antecedent_rule.undeclare_known_antecedent_rule_removal_module_for_rule(rule, T);
        return NIL;
    }

    public static SubLObject add_merged_constant_guid(final SubLObject argument, final SubLObject assertion) {
        assert NIL != assertions_high.gaf_assertionP(assertion) : "assertions_high.gaf_assertionP(assertion) " + "CommonSymbols.NIL != assertions_high.gaf_assertionP(assertion) " + assertion;
        final SubLObject constant = assertions_high.gaf_arg1(assertion);
        final SubLObject guid_string = assertions_high.gaf_arg2(assertion);
        final SubLObject guid = Guids.string_to_guid(guid_string);
        if ((NIL != constant_p(constant)) && (NIL == constant_p(constants_high.find_constant_by_guid(guid)))) {
            constants_low.install_constant_merged_guid(constant, guid);
        }
        return NIL;
    }

    public static SubLObject remove_merged_constant_guid(final SubLObject argument, final SubLObject assertion) {
        assert NIL != assertions_high.gaf_assertionP(assertion) : "assertions_high.gaf_assertionP(assertion) " + "CommonSymbols.NIL != assertions_high.gaf_assertionP(assertion) " + assertion;
        final SubLObject constant = assertions_high.gaf_arg1(assertion);
        final SubLObject guid_string = assertions_high.gaf_arg2(assertion);
        final SubLObject guid = Guids.string_to_guid(guid_string);
        if ((NIL != constant_p(constant)) && (NIL == constant_p(constants_high.find_constant_by_guid(guid)))) {
            constants_low.uninstall_constant_merged_guid(constant, guid);
        }
        return NIL;
    }

    public static SubLObject cyc_except_mt_added(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != after_adding.initial_assertion_argumentP(argument, assertion)) && (NIL != assertion_utilities.true_assertionP(assertion))) {
            if (NIL != hl_transcript_tracing.within_hl_evalP()) {
                return NIL;
            }
            if (NIL == fi_edit.$within_fi_edit_add_old_exceptP$.getDynamicValue(thread)) {
                SubLObject sub_assertions = NIL;
                final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(assertions_high.gaf_arg1(assertion));
                if (pcase_var.eql($MT)) {
                    if (NIL != kb_mapping_macros.do_mt_index_key_validator(assertions_high.gaf_arg1(assertion), NIL)) {
                        final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(assertions_high.gaf_arg1(assertion));
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject sub_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(sub_assertion));
                                if (NIL != valid) {
                                    sub_assertions = cons(sub_assertion, sub_assertions);
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
                    if (pcase_var.eql($BROAD_MT) && (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(assertions_high.gaf_arg1(assertion), NIL))) {
                        final SubLObject idx = assertion_handles.do_assertions_table();
                        final SubLObject mess = $str116$do_broad_mt_index;
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
                                final SubLObject idx_$9 = idx;
                                if (NIL == id_index_objects_empty_p(idx_$9, $SKIP)) {
                                    final SubLObject idx_$10 = idx_$9;
                                    if (NIL == id_index_dense_objects_empty_p(idx_$10, $SKIP)) {
                                        final SubLObject vector_var = id_index_dense_objects(idx_$10);
                                        final SubLObject backwardP_var = NIL;
                                        SubLObject length;
                                        SubLObject v_iteration;
                                        SubLObject a_id;
                                        SubLObject a_handle;
                                        SubLObject sub_assertion2;
                                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                            a_handle = aref(vector_var, a_id);
                                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                if (NIL != id_index_tombstone_p(a_handle)) {
                                                    a_handle = $SKIP;
                                                }
                                                sub_assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                                if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(sub_assertion2, assertions_high.gaf_arg1(assertion), NIL, NIL)) {
                                                    sub_assertions = cons(sub_assertion2, sub_assertions);
                                                }
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                            }
                                        }
                                    }
                                    final SubLObject idx_$11 = idx_$9;
                                    if ((NIL == id_index_sparse_objects_empty_p(idx_$11)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        final SubLObject sparse = id_index_sparse_objects(idx_$11);
                                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$11);
                                        final SubLObject end_id = id_index_next_id(idx_$11);
                                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                        while (a_id2.numL(end_id)) {
                                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                                final SubLObject sub_assertion3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                                if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(sub_assertion3, assertions_high.gaf_arg1(assertion), NIL, NIL)) {
                                                    sub_assertions = cons(sub_assertion3, sub_assertions);
                                                }
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                            }
                                            a_id2 = add(a_id2, ONE_INTEGER);
                                        } 
                                    }
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    noting_percent_progress_postamble();
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                                }
                            }
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_2, thread);
                        }
                    }

                assertion_utilities.remove_relevant_assertions_dependents(sub_assertions, assertions_high.assertion_mt(assertion));
            }
        }
        return NIL;
    }

    public static SubLObject cyc_except_mt_removed(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != after_adding.final_assertion_argumentP(argument, assertion)) && (NIL != assertion_utilities.true_assertionP(assertion))) {
            if (NIL != hl_transcript_tracing.within_hl_evalP()) {
                return NIL;
            }
            final SubLObject num_mt_index = kb_indexing.num_mt_index(assertions_high.gaf_arg1(assertion));
            if (ZERO_INTEGER.numL(num_mt_index) && num_mt_index.numL($cyc_except_mt_repropagate_mt_contents_cutoff$.getDynamicValue(thread))) {
                final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(assertions_high.gaf_arg1(assertion));
                if (pcase_var.eql($MT)) {
                    if (NIL != kb_mapping_macros.do_mt_index_key_validator(assertions_high.gaf_arg1(assertion), NIL)) {
                        final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(assertions_high.gaf_arg1(assertion));
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject sub_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(sub_assertion));
                                if (NIL != valid) {
                                    forward.queue_forward_assertion(sub_assertion);
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
                    if (pcase_var.eql($BROAD_MT) && (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(assertions_high.gaf_arg1(assertion), NIL))) {
                        final SubLObject idx = assertion_handles.do_assertions_table();
                        final SubLObject mess = $str116$do_broad_mt_index;
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
                                final SubLObject idx_$13 = idx;
                                if (NIL == id_index_objects_empty_p(idx_$13, $SKIP)) {
                                    final SubLObject idx_$14 = idx_$13;
                                    if (NIL == id_index_dense_objects_empty_p(idx_$14, $SKIP)) {
                                        final SubLObject vector_var = id_index_dense_objects(idx_$14);
                                        final SubLObject backwardP_var = NIL;
                                        SubLObject length;
                                        SubLObject v_iteration;
                                        SubLObject a_id;
                                        SubLObject a_handle;
                                        SubLObject sub_assertion2;
                                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                            a_handle = aref(vector_var, a_id);
                                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                if (NIL != id_index_tombstone_p(a_handle)) {
                                                    a_handle = $SKIP;
                                                }
                                                sub_assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                                if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(sub_assertion2, assertions_high.gaf_arg1(assertion), NIL, NIL)) {
                                                    forward.queue_forward_assertion(sub_assertion2);
                                                }
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                            }
                                        }
                                    }
                                    final SubLObject idx_$15 = idx_$13;
                                    if ((NIL == id_index_sparse_objects_empty_p(idx_$15)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        final SubLObject sparse = id_index_sparse_objects(idx_$15);
                                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$15);
                                        final SubLObject end_id = id_index_next_id(idx_$15);
                                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                        while (a_id2.numL(end_id)) {
                                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                                final SubLObject sub_assertion3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                                if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(sub_assertion3, assertions_high.gaf_arg1(assertion), NIL, NIL)) {
                                                    forward.queue_forward_assertion(sub_assertion3);
                                                }
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                            }
                                            a_id2 = add(a_id2, ONE_INTEGER);
                                        } 
                                    }
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    noting_percent_progress_postamble();
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                                }
                            }
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_2, thread);
                        }
                    }

            } else {
                Errors.warn($str120$Skipping_propagating_mt_contents_, assertions_high.gaf_arg1(assertion));
            }
        }
        return NIL;
    }

    public static SubLObject cyc_except_added(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != after_adding.initial_assertion_argumentP(argument, assertion)) && (NIL != assertion_utilities.true_assertionP(assertion))) {
            if (NIL != hl_transcript_tracing.within_hl_evalP()) {
                return NIL;
            }
            final SubLObject sub_assertion = assertions_high.gaf_arg1(assertion);
            if (NIL != except_of_hl_gaf_p(assertion)) {
                add_hl_gaf_denial(sub_assertion, assertion);
            }
            if (NIL == fi_edit.$within_fi_edit_add_old_exceptP$.getDynamicValue(thread)) {
                assertion_utilities.remove_relevant_assertion_dependents(sub_assertion, assertions_high.assertion_mt(assertion));
            }
        }
        return NIL;
    }

    public static SubLObject cyc_except_removed(final SubLObject argument, final SubLObject assertion) {
        if ((NIL != after_adding.final_assertion_argumentP(argument, assertion)) && (NIL != assertion_utilities.true_assertionP(assertion))) {
            if (NIL != hl_transcript_tracing.within_hl_evalP()) {
                return NIL;
            }
            final SubLObject sub_assertion = assertions_high.gaf_arg1(assertion);
            if (NIL != except_of_hl_gaf_p(assertion)) {
                rem_hl_gaf_denial(sub_assertion, assertion);
            }
            forward.queue_forward_assertion(sub_assertion);
        }
        return NIL;
    }

    public static SubLObject hl_gaf_p(final SubLObject v_object) {
        return makeBoolean(((NIL != assertion_handles.assertion_p(v_object)) && (NIL != assertions_high.gaf_assertionP(v_object))) && (NIL != hl_supports.hl_predicate_p(assertions_high.gaf_predicate(v_object))));
    }

    public static SubLObject except_of_hl_gaf_p(final SubLObject v_object) {
        if (((NIL != assertion_handles.assertion_p(v_object)) && (NIL != assertions_high.gaf_assertionP(v_object))) && (NIL != kb_utilities.kbeq($$except, assertions_high.gaf_predicate(v_object)))) {
            final SubLObject sub_assertion = assertions_high.gaf_arg1(v_object);
            return makeBoolean((NIL != hl_gaf_p(sub_assertion)) && (NIL != hlmt.hlmt_equal(assertions_high.assertion_mt(v_object), assertions_high.assertion_mt(sub_assertion))));
        }
        return NIL;
    }

    public static SubLObject add_hl_gaf_denial(final SubLObject hl_gaf, final SubLObject except) {
        final SubLObject supports = list(except);
        final SubLObject truth = $UNKNOWN;
        final SubLObject denial_deduction = tms.tms_add_deduction_for_assertion(hl_gaf, supports, truth, UNPROVIDED, UNPROVIDED);
        return denial_deduction;
    }

    public static SubLObject rem_hl_gaf_denial(final SubLObject hl_gaf, final SubLObject except) {
        final SubLObject supports = list(except);
        final SubLObject truth = $UNKNOWN;
        final SubLObject denial_deduction = deductions_high.find_deduction(hl_gaf, supports, truth);
        if (NIL != deduction_handles.deduction_p(denial_deduction)) {
            tms.tms_remove_deduction(denial_deduction);
            return hl_gaf;
        }
        return NIL;
    }

    public static SubLObject add_relation_instance_all(final SubLObject argument, final SubLObject assertion) {
        if (NIL != after_adding.initial_assertion_argumentP(argument, assertion)) {
            tva_cache.tva_cache_add_relation_instance_all_gaf(assertion);
        }
        return NIL;
    }

    public static SubLObject remove_relation_instance_all(final SubLObject argument, final SubLObject assertion) {
        if (NIL != after_adding.final_assertion_argumentP(argument, assertion)) {
            tva_cache.tva_cache_remove_relation_instance_all_gaf(assertion);
        }
        return NIL;
    }

    public static SubLObject add_relation_all_instance(final SubLObject argument, final SubLObject assertion) {
        if (NIL != after_adding.initial_assertion_argumentP(argument, assertion)) {
            tva_cache.tva_cache_add_relation_all_instance_gaf(assertion);
        }
        return NIL;
    }

    public static SubLObject remove_relation_all_instance(final SubLObject argument, final SubLObject assertion) {
        if (NIL != after_adding.final_assertion_argumentP(argument, assertion)) {
            tva_cache.tva_cache_remove_relation_all_instance_gaf(assertion);
        }
        return NIL;
    }

    public static SubLObject mark_constant_as_instantiated(final SubLObject constant, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $debug_do_create_from_descriptionP$.getDynamicValue(thread)) {
            format_nil.force_format(T, $str130$__do_create_from_description_mark, constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject result = NIL;
        if (NIL != constant_p(constant)) {
            final SubLObject sentence = make_binary_formula($$quotedIsa, constant, $$InstantiatedConstant);
            if (NIL != $use_transcriptP$.getDynamicValue(thread)) {
                result = fi.fi_assert_int(sentence, $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
                transcript_utilities.transcript_form(listS(FI_ASSERT, list(QUOTE, sentence), $list136), UNPROVIDED);
            } else {
                result = fi.fi_assert_int(sentence, $$BookkeepingMt, UNPROVIDED, UNPROVIDED);
            }
            if (NIL != assertion) {
                fi.fi_add_argument_int(sentence, $$BookkeepingMt, list(assertion), assertions_high.assertion_direction(assertion), UNPROVIDED);
            }
        }
        return result;
    }

    public static SubLObject cyc_create_new_instantiated_permanent(final SubLObject constant_name, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $debug_do_create_from_descriptionP$.getDynamicValue(thread)) {
            format_nil.force_format(T, $str137$__do_create_from_description_crea, constant_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        SubLObject constant = NIL;
        SubLObject cyclist = NIL;
        SubLObject time = NIL;
        SubLObject why = NIL;
        SubLObject second = NIL;
        if (NIL != $use_transcriptP$.getDynamicValue(thread)) {
            final SubLObject possible_fi_timestamp_assertion_op = operation_queues.local_queue_peek();
            if (FI_TIMESTAMP_ASSERTION == possible_fi_timestamp_assertion_op.first()) {
                cyclist = list_utilities.quotify(encapsulation.unencapsulate(eval(nth(ONE_INTEGER, possible_fi_timestamp_assertion_op))));
                time = nth(TWO_INTEGER, possible_fi_timestamp_assertion_op);
                why = nth(THREE_INTEGER, possible_fi_timestamp_assertion_op);
                second = nth(FOUR_INTEGER, possible_fi_timestamp_assertion_op);
            } else {
                if (NIL == cyclist) {
                    cyclist = operation_communication.the_cyclist();
                }
                if (NIL == time) {
                    time = fi.the_date();
                }
                if (NIL == why) {
                    why = fi.ke_purpose();
                }
                if (NIL == second) {
                    second = fi.the_second();
                }
            }
        }
        if (NIL != $use_transcriptP$.getDynamicValue(thread)) {
            constant = cyc_kernel.cyc_create_new_permanent(constant_name);
            fi.fi_timestamp_constant_int(cyclist, time, why, second);
            transcript_utilities.transcript_form(list(FI_TIMESTAMP_CONSTANT, cyclist, time, why, second), UNPROVIDED);
        } else {
            constant = cyc_kernel.cyc_create_new_ephemeral(constant_name);
        }
        mark_constant_as_instantiated(constant, assertion);
        return constant;
    }

    public static SubLObject instantiated_constant_p(final SubLObject v_object) {
        return makeBoolean((NIL != constant_p(v_object)) && (NIL != isa.quoted_isa_in_any_mtP(v_object, $$InstantiatedConstant)));
    }

    public static SubLObject possible_instantiated_constant_with_no_assertionsP(final SubLObject constant) {
        return makeBoolean((NIL != constant_p(constant)) && kb_indexing.num_index(constant).isZero());
    }

    public static SubLObject instantiated_constant_with_one_assertionP(final SubLObject constant) {
        return makeBoolean(((NIL != constant_p(constant)) && (NIL != instantiated_constant_p(constant))) && (NIL != number_utilities.onep(kb_indexing.num_index(constant))));
    }

    public static SubLObject possible_instantiated_constant_to_reuseP(final SubLObject constant) {
        return makeBoolean((NIL != possible_instantiated_constant_with_no_assertionsP(constant)) || (NIL != instantiated_constant_with_one_assertionP(constant)));
    }

    public static SubLObject do_create_from_description(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == after_adding.initial_assertion_argumentP(argument, assertion)) || (NIL == assertion_utilities.true_assertionP(assertion))) {
            return NIL;
        }
        if (NIL != hl_transcript_tracing.within_hl_evalP()) {
            return NIL;
        }
        if ((NIL != $debug_do_create_from_descriptionP$.getDynamicValue(thread)) && (NIL != forward.current_forward_inference_rule())) {
            format_nil.force_format(T, $str140$__do_create_from_description_afte, sefify(forward.current_forward_inference_rule()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject constant_name = string_utilities.make_valid_constant_name(assertions_high.gaf_arg1(assertion), UNPROVIDED);
        final SubLObject pred = assertions_high.gaf_arg2(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject possible_constant = constants_high.find_constant(constant_name);
        final SubLObject existing_terms = ask_utilities.query_variable($sym141$_TERM, make_binary_formula($$and, make_ist_sentence($$BookkeepingMt, make_binary_formula($$quotedIsa, $sym141$_TERM, $$InstantiatedConstant)), make_unary_formula(pred, $sym141$_TERM)), mt, UNPROVIDED);
        SubLObject v_term = NIL;
        if (NIL != list_utilities.member_kbeqP(possible_constant, existing_terms)) {
            if (NIL != $debug_do_create_from_descriptionP$.getDynamicValue(thread)) {
                format_nil.force_format(T, $str143$__do_create_from_description_reus, possible_constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
            v_term = possible_constant;
        } else
            if (NIL != existing_terms) {
                if (NIL != list_utilities.lengthG(existing_terms, ONE_INTEGER, UNPROVIDED)) {
                    Errors.warn($str144$do_create_from_description_found_, existing_terms, pred);
                }
                if (NIL != $debug_do_create_from_descriptionP$.getDynamicValue(thread)) {
                    format_nil.force_format(T, $str145$__do_create_from_description_reus, existing_terms.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                v_term = existing_terms.first();
            } else
                if (NIL != possible_instantiated_constant_with_no_assertionsP(possible_constant)) {
                    if (NIL != $debug_do_create_from_descriptionP$.getDynamicValue(thread)) {
                        format_nil.force_format(T, $str146$__do_create_from_description_reus, possible_constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    mark_constant_as_instantiated(possible_constant, assertion);
                    v_term = possible_constant;
                } else
                    if (NIL != instantiated_constant_with_one_assertionP(possible_constant)) {
                        if (NIL != $debug_do_create_from_descriptionP$.getDynamicValue(thread)) {
                            format_nil.force_format(T, $str147$__do_create_from_description_reus, possible_constant, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        mark_constant_as_instantiated(possible_constant, assertion);
                        v_term = possible_constant;
                    } else
                        if (NIL != valid_constantP(possible_constant, UNPROVIDED)) {
                            v_term = cyc_create_new_instantiated_permanent(constant_completion_high.uniquify_constant_name(constant_name, UNPROVIDED), assertion);
                        } else {
                            v_term = cyc_create_new_instantiated_permanent(constant_name, assertion);
                        }




        final SubLObject description_sentence = make_unary_formula(pred, v_term);
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$wff_mode$.currentBinding(thread);
        try {
            kb_control_vars.$within_forward_inferenceP$.bind(NIL, thread);
            czer_vars.$simplify_literalP$.bind(T, thread);
            wff_vars.$wff_mode$.bind($ASSERTIVE, thread);
            result = fi.fi_add_argument_int(description_sentence, mt, list(assertion), assertions_high.assertion_direction(assertion), UNPROVIDED);
        } finally {
            wff_vars.$wff_mode$.rebind(_prev_bind_3, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject expression_instantiated_constant_count(final SubLObject expression) {
        return length(cycl_utilities.expression_gather(expression, INSTANTIATED_CONSTANT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject expression_has_instantiated_constantP(final SubLObject expression) {
        return plusp(expression_instantiated_constant_count(expression));
    }

    public static SubLObject do_create_from_description_multiple(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == after_adding.initial_assertion_argumentP(argument, assertion)) || (NIL == assertion_utilities.true_assertionP(assertion))) {
            return NIL;
        }
        if (NIL != hl_transcript_tracing.within_hl_evalP()) {
            return NIL;
        }
        final SubLObject pred = assertions_high.gaf_arg2(assertion);
        final SubLObject constant_names = el_list_items(assertions_high.gaf_arg1(assertion));
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject possible_constants = Mapping.mapcar(FIND_CONSTANT, Mapping.mapcar(MAKE_VALID_CONSTANT_NAME, constant_names));
        final SubLObject el_vars = (NIL != kappa_predicate_p(pred)) ? kappa_predicate_formal_args(pred) : sentence_free_variables(assertions_high.gaf_formula(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject existing_terms = ask_utilities.query_template(el_vars, make_do_create_from_description_query(el_vars, pred), mt, UNPROVIDED);
        SubLObject terms = NIL;
        if (NIL != subl_promotions.memberP(possible_constants, existing_terms, symbol_function(EQUAL), UNPROVIDED)) {
            terms = possible_constants;
        } else
            if (NIL != existing_terms) {
                if (NIL != list_utilities.lengthG(existing_terms, ONE_INTEGER, UNPROVIDED)) {
                    Errors.warn($str153$do_create_from_description_multip, existing_terms, pred);
                }
                terms = Sort.sort(existing_terms, $sym154$_, EXPRESSION_INSTANTIATED_CONSTANT_COUNT).first();
            } else
                if (NIL != list_utilities.every_in_list($sym156$POSSIBLE_INSTANTIATED_CONSTANT_TO_REUSE_, possible_constants, UNPROVIDED)) {
                    SubLObject cdolist_list_var = possible_constants;
                    SubLObject constant = NIL;
                    constant = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        mark_constant_as_instantiated(constant, assertion);
                        cdolist_list_var = cdolist_list_var.rest();
                        constant = cdolist_list_var.first();
                    } 
                    terms = possible_constants;
                } else
                    if (NIL != list_utilities.any_in_list($sym157$VALID_CONSTANT_, possible_constants, UNPROVIDED)) {
                        SubLObject cdolist_list_var = constant_names;
                        SubLObject constant_name = NIL;
                        constant_name = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            terms = cons(cyc_create_new_instantiated_permanent(constant_completion_high.uniquify_constant_name(constant_name, UNPROVIDED), assertion), terms);
                            cdolist_list_var = cdolist_list_var.rest();
                            constant_name = cdolist_list_var.first();
                        } 
                        terms = nreverse(terms);
                    } else {
                        SubLObject cdolist_list_var = constant_names;
                        SubLObject constant_name = NIL;
                        constant_name = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            terms = cons(cyc_create_new_instantiated_permanent(constant_name, assertion), terms);
                            cdolist_list_var = cdolist_list_var.rest();
                            constant_name = cdolist_list_var.first();
                        } 
                        terms = nreverse(terms);
                    }



        final SubLObject description_sentence = cons(pred, terms);
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$simplify_literalP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$wff_mode$.currentBinding(thread);
        try {
            kb_control_vars.$within_forward_inferenceP$.bind(NIL, thread);
            czer_vars.$simplify_literalP$.bind(T, thread);
            wff_vars.$wff_mode$.bind($ASSERTIVE, thread);
            result = fi.fi_add_argument_int(description_sentence, mt, list(assertion), assertions_high.assertion_direction(assertion), UNPROVIDED);
        } finally {
            wff_vars.$wff_mode$.rebind(_prev_bind_3, thread);
            czer_vars.$simplify_literalP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject make_do_create_from_description_query(final SubLObject el_vars, final SubLObject pred) {
        SubLObject conjuncts = NIL;
        conjuncts = cons(cons(pred, el_vars), conjuncts);
        SubLObject cdolist_list_var = el_vars;
        SubLObject el_var = NIL;
        el_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            conjuncts = cons(make_ist_sentence($$BookkeepingMt, make_binary_formula($$quotedIsa, el_var, $$InstantiatedConstant)), conjuncts);
            cdolist_list_var = cdolist_list_var.rest();
            el_var = cdolist_list_var.first();
        } 
        return make_conjunction(conjuncts);
    }

    public static SubLObject constant_instantiated_from_subcollection_expression_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != constant_p(v_object)) && (NIL != string_utilities.starts_with(constants_high.constant_name(v_object), $instantiate_from_subcollection_expression_constant_prefix$.getDynamicValue(thread))));
    }

    public static SubLObject instantiate_from_subcollection_expression(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != after_adding.initial_assertion_argumentP(argument, assertion)) && (NIL != assertion_utilities.true_assertionP(assertion))) {
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject raw_subcollection_expression = assertions_high.gaf_arg1(assertion);
            SubLObject result = NIL;
            thread.resetMultipleValues();
            SubLObject subcollection_expression = possibly_unquote_closed_formula(raw_subcollection_expression);
            final SubLObject subcollection_expression_quotedP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            subcollection_expression = cycl_utilities.expression_transform(subcollection_expression, NART_P, NART_EL_FORMULA, UNPROVIDED, UNPROVIDED);
            final SubLObject raw_unwound_sentence = subcollection_unwinder.scg_subcl_expand_signature_int(subcollection_expression);
            final SubLObject el_vars = sentence_free_variables(raw_unwound_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject existing_terms_list = ask_utilities.query_template(el_vars, raw_unwound_sentence, mt, UNPROVIDED);
            SubLObject existing_terms = NIL;
            if (NIL != list_utilities.singletonP(existing_terms_list)) {
                existing_terms = existing_terms_list.first();
            } else
                if (NIL != list_utilities.sublisp_boolean(existing_terms_list)) {
                    final SubLObject existing_terms_list_hash = make_hash_table(ZERO_INTEGER, UNPROVIDED, UNPROVIDED);
                    SubLObject cdolist_list_var = existing_terms_list;
                    SubLObject existing_terms_entry = NIL;
                    existing_terms_entry = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject inst_constant_count = cycl_utilities.expression_gather(existing_terms_entry, CONSTANT_INSTANTIATED_FROM_SUBCOLLECTION_EXPRESSION_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        hash_table_utilities.push_hash(length(inst_constant_count), existing_terms_entry, existing_terms_list_hash);
                        cdolist_list_var = cdolist_list_var.rest();
                        existing_terms_entry = cdolist_list_var.first();
                    } 
                    final SubLObject counts = hash_table_utilities.hash_table_keys(existing_terms_list_hash);
                    final SubLObject max_count = (NIL != counts) ? apply(MAX, hash_table_utilities.hash_table_keys(existing_terms_list_hash)) : NIL;
                    if ((NIL != counts) && ZERO_INTEGER.numL(max_count)) {
                        existing_terms_list = gethash(max_count, existing_terms_list_hash, UNPROVIDED);
                        if (NIL != list_utilities.lengthG(existing_terms_list, ONE_INTEGER, UNPROVIDED)) {
                            Errors.warn($str164$More_than_one_terms_match_found_f, assertion, existing_terms_list);
                        }
                        existing_terms = existing_terms_list.first();
                    }
                }

            if (NIL == existing_terms) {
                final SubLObject variables_arg_constraints_dict = at_var_types.formula_variables_arg_constraints_dict(raw_unwound_sentence, mt, UNPROVIDED, UNPROVIDED);
                final SubLObject constant_name_hash = make_hash_table(ZERO_INTEGER, UNPROVIDED, UNPROVIDED);
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(variables_arg_constraints_dict)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject variable = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject isa_genl_qisa = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject v_isa = isa_genl_qisa.first();
                    final SubLObject genl = second(isa_genl_qisa);
                    final SubLObject qisa = third(isa_genl_qisa);
                    SubLObject cname_strings = NIL;
                    if (NIL != genl) {
                        cname_strings = Mapping.mapcar(FORT_NAME, genl);
                    } else
                        if (NIL != v_isa) {
                            cname_strings = Mapping.mapcar(FORT_NAME, v_isa);
                        } else
                            if (NIL != qisa) {
                                cname_strings = Mapping.mapcar(FORT_NAME, qisa);
                            } else {
                                cname_strings = $list166;
                            }


                    cname_strings = cons($instantiate_from_subcollection_expression_constant_prefix$.getDynamicValue(thread), cname_strings);
                    sethash(variable, constant_name_hash, string_utilities.make_valid_constant_name(string_utilities.bunge(cname_strings, CHAR_hyphen), UNPROVIDED));
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                SubLObject cdolist_list_var2 = el_vars;
                SubLObject el_var = NIL;
                el_var = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    existing_terms = cons(cyc_create_new_instantiated_permanent(constant_completion_high.uniquify_constant_name(gethash(el_var, constant_name_hash, UNPROVIDED), UNPROVIDED), assertion), existing_terms);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    el_var = cdolist_list_var2.first();
                } 
                existing_terms = nreverse(existing_terms);
            }
            SubLObject bound_unwound_sentence = copy_list(raw_unwound_sentence);
            SubLObject el_var2 = NIL;
            SubLObject el_var_$17 = NIL;
            SubLObject existing_term = NIL;
            SubLObject existing_term_$18 = NIL;
            el_var2 = el_vars;
            el_var_$17 = el_var2.first();
            existing_term = existing_terms;
            existing_term_$18 = existing_term.first();
            while ((NIL != existing_term) || (NIL != el_var2)) {
                bound_unwound_sentence = cycl_utilities.expression_subst(existing_term_$18, el_var_$17, bound_unwound_sentence, UNPROVIDED, UNPROVIDED);
                el_var2 = el_var2.rest();
                el_var_$17 = el_var2.first();
                existing_term = existing_term.rest();
                existing_term_$18 = existing_term.first();
            } 
            final SubLObject _prev_bind_0 = kb_control_vars.$within_forward_inferenceP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = czer_vars.$simplify_literalP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = wff_vars.$wff_mode$.currentBinding(thread);
            try {
                kb_control_vars.$within_forward_inferenceP$.bind(NIL, thread);
                czer_vars.$simplify_literalP$.bind(T, thread);
                wff_vars.$wff_mode$.bind($ASSERTIVE, thread);
                result = fi.fi_add_argument_int(bound_unwound_sentence, mt, list(assertion), assertions_high.assertion_direction(assertion), UNPROVIDED);
            } finally {
                wff_vars.$wff_mode$.rebind(_prev_bind_3, thread);
                czer_vars.$simplify_literalP$.rebind(_prev_bind_2, thread);
                kb_control_vars.$within_forward_inferenceP$.rebind(_prev_bind_0, thread);
            }
            return result;
        }
        return NIL;
    }

    public static SubLObject show_constants_with_no_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject idx = do_constants_table();
        final SubLObject mess = $str168$Finding_constants_with_no_asserti;
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
                final SubLObject idx_$19 = idx;
                if (NIL == id_index_objects_empty_p(idx_$19, $SKIP)) {
                    final SubLObject idx_$20 = idx_$19;
                    if (NIL == id_index_dense_objects_empty_p(idx_$20, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$20);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject c;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            c = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(c)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(c)) {
                                    c = $SKIP;
                                }
                                if (kb_indexing.num_index(c).isZero()) {
                                    print(constants_high.constant_name(c), UNPROVIDED);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$21 = idx_$19;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$21)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$21);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$21);
                        final SubLObject end_id = id_index_next_id(idx_$21);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject c2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(c2))) {
                                if (kb_indexing.num_index(c2).isZero()) {
                                    print(constants_high.constant_name(c2), UNPROVIDED);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject kill_constants_with_no_assertions_by_prefix(final SubLObject prefixes) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject kill_count = ZERO_INTEGER;
        SubLObject result = NIL;
        final SubLObject idx = do_constants_table();
        final SubLObject mess = cconcatenate($str169$Killing_constants_with_no_asserti, format_nil.format_nil_s_no_copy(prefixes));
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
                final SubLObject idx_$23 = idx;
                if (NIL == id_index_objects_empty_p(idx_$23, $SKIP)) {
                    final SubLObject idx_$24 = idx_$23;
                    if (NIL == id_index_dense_objects_empty_p(idx_$24, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$24);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject c;
                        SubLObject constant_name;
                        SubLObject killedP;
                        SubLObject csome_list_var;
                        SubLObject prefix;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            c = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(c)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(c)) {
                                    c = $SKIP;
                                }
                                if (kb_indexing.num_index(c).isZero()) {
                                    constant_name = constants_high.constant_name(c);
                                    killedP = NIL;
                                    if (NIL == killedP) {
                                        csome_list_var = prefixes;
                                        prefix = NIL;
                                        prefix = csome_list_var.first();
                                        while ((NIL == killedP) && (NIL != csome_list_var)) {
                                            if ((NIL != string_utilities.non_empty_stringP(prefix)) && (NIL != string_utilities.starts_with(constant_name, prefix))) {
                                                format(T, $str170$__Killing__A__, c);
                                                fi.fi_kill_int(c);
                                                kill_count = add(kill_count, ONE_INTEGER);
                                                result = cons(constant_name, result);
                                                killedP = T;
                                            }
                                            csome_list_var = csome_list_var.rest();
                                            prefix = csome_list_var.first();
                                        } 
                                    }
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$25 = idx_$23;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$25)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$25);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$25);
                        final SubLObject end_id = id_index_next_id(idx_$25);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject c2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(c2))) {
                                if (kb_indexing.num_index(c2).isZero()) {
                                    final SubLObject constant_name2 = constants_high.constant_name(c2);
                                    SubLObject killedP2 = NIL;
                                    if (NIL == killedP2) {
                                        SubLObject csome_list_var2 = prefixes;
                                        SubLObject prefix2 = NIL;
                                        prefix2 = csome_list_var2.first();
                                        while ((NIL == killedP2) && (NIL != csome_list_var2)) {
                                            if ((NIL != string_utilities.non_empty_stringP(prefix2)) && (NIL != string_utilities.starts_with(constant_name2, prefix2))) {
                                                format(T, $str170$__Killing__A__, c2);
                                                fi.fi_kill_int(c2);
                                                kill_count = add(kill_count, ONE_INTEGER);
                                                result = cons(constant_name2, result);
                                                killedP2 = T;
                                            }
                                            csome_list_var2 = csome_list_var2.rest();
                                            prefix2 = csome_list_var2.first();
                                        } 
                                    }
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        format(T, $str171$___A_constants_killed__, kill_count);
        return result;
    }

    public static SubLObject show_unused_instantiated_constants() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject idx = do_constants_table();
        final SubLObject mess = $str172$Finding_instantiated_constants_wi;
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
                final SubLObject idx_$27 = idx;
                if (NIL == id_index_objects_empty_p(idx_$27, $SKIP)) {
                    final SubLObject idx_$28 = idx_$27;
                    if (NIL == id_index_dense_objects_empty_p(idx_$28, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$28);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject c;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            c = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(c)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(c)) {
                                    c = $SKIP;
                                }
                                if ((NIL != number_utilities.onep(kb_indexing.num_index(c))) && (NIL != instantiated_constant_p(c))) {
                                    print(constants_high.constant_name(c), UNPROVIDED);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$29 = idx_$27;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$29)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$29);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$29);
                        final SubLObject end_id = id_index_next_id(idx_$29);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject c2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(c2))) {
                                if ((NIL != number_utilities.onep(kb_indexing.num_index(c2))) && (NIL != instantiated_constant_p(c2))) {
                                    print(constants_high.constant_name(c2), UNPROVIDED);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject forget_unused_instantiated_constants() {
        if (NIL != valid_constant($$InstantiatedConstant, T)) {
            return kill_unused_instantiated_constants();
        }
        return NIL;
    }

    public static SubLObject kill_unused_instantiated_constants() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_instances = NIL;
        SubLObject candidates = NIL;
        SubLObject removed = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject str = $$$Gathering_instantiated_constants;
            final SubLObject _prev_bind_0_$31 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_1_$32 = $progress_last_pacification_time$.currentBinding(thread);
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
                v_instances = isa.all_quoted_instances($$InstantiatedConstant, UNPROVIDED, UNPROVIDED);
                noting_progress_postamble();
            } finally {
                $silent_progressP$.rebind(_prev_bind_8, thread);
                $is_noting_progressP$.rebind(_prev_bind_7, thread);
                $progress_count$.rebind(_prev_bind_6, thread);
                $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                $progress_notification_count$.rebind(_prev_bind_4, thread);
                $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                $progress_last_pacification_time$.rebind(_prev_bind_1_$32, thread);
                $progress_start_time$.rebind(_prev_bind_0_$31, thread);
            }
            if (NIL != v_instances) {
                final SubLObject list_var = v_instances;
                final SubLObject _prev_bind_0_$32 = $progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_1_$33 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_9 = $progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_10 = $progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_11 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_12 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_13 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_14 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $progress_note$.bind($str176$Identifying_unused_instantiated_c, thread);
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
                            if ((NIL != constant_p(v_term)) && (NIL != number_utilities.onep(kb_indexing.num_index(v_term)))) {
                                candidates = cons(v_term, candidates);
                            }
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            v_term = csome_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_14, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_13, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_12, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_11, thread);
                    $progress_sofar$.rebind(_prev_bind_10, thread);
                    $progress_total$.rebind(_prev_bind_9, thread);
                    $progress_start_time$.rebind(_prev_bind_1_$33, thread);
                    $progress_note$.rebind(_prev_bind_0_$32, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        final SubLObject candidate_count = length(candidates);
        final SubLObject msg = cconcatenate($$$Removing_, new SubLObject[]{ format_nil.format_nil_a_no_copy(candidate_count), $$$_unused_instantiated_constant, format_nil.format_nil_a_no_copy(NIL != number_utilities.onep(candidate_count) ? $str180$ : $$$s) });
        final SubLObject list_var2 = candidates;
        final SubLObject _prev_bind_15 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_16 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(NIL != msg ? msg : $$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var2), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var2 = list_var2;
                SubLObject c = NIL;
                c = csome_list_var2.first();
                while (NIL != csome_list_var2) {
                    final SubLObject constant_name = constants_high.constant_name(c);
                    format(T, $str170$__Killing__A__, constant_name);
                    cyc_kernel.cyc_kill(c);
                    removed = cons(constant_name, removed);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var2 = csome_list_var2.rest();
                    c = csome_list_var2.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_16, thread);
            $progress_note$.rebind(_prev_bind_15, thread);
        }
        return removed;
    }

    public static SubLObject assert_missing_quoted_isa_instantiated_constant_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = $list190;
            SubLObject do_create_predicate = NIL;
            do_create_predicate = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject pred_var = do_create_predicate;
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_0_$37 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$38 = $progress_last_pacification_time$.currentBinding(thread);
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
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                    SubLObject done_var_$39 = NIL;
                                    final SubLObject token_var_$40 = NIL;
                                    while (NIL == done_var_$39) {
                                        final SubLObject do_create_assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$40);
                                        final SubLObject valid_$41 = makeBoolean(!token_var_$40.eql(do_create_assertion));
                                        if ((NIL != valid_$41) && (NIL == list_utilities.member_kbeqP(assertions_high.assertion_mt(do_create_assertion), $list182))) {
                                            final SubLObject do_create_dependents = Mapping.mapcar(DEDUCTION_SUPPORTED_OBJECT, assertions_high.assertion_dependents(do_create_assertion));
                                            SubLObject instantiated_constant_gafs = NIL;
                                            SubLObject cdolist_list_var_$42 = do_create_dependents;
                                            SubLObject do_create_dependent = NIL;
                                            do_create_dependent = cdolist_list_var_$42.first();
                                            while (NIL != cdolist_list_var_$42) {
                                                if ((NIL != assertion_utilities.gaf_assertion_with_pred_p(do_create_dependent, $$quotedIsa)) && (NIL != kb_utilities.kbeq($$InstantiatedConstant, assertions_high.gaf_arg2(do_create_dependent)))) {
                                                    instantiated_constant_gafs = cons(do_create_dependent, instantiated_constant_gafs);
                                                }
                                                cdolist_list_var_$42 = cdolist_list_var_$42.rest();
                                                do_create_dependent = cdolist_list_var_$42.first();
                                            } 
                                            if (NIL == instantiated_constant_gafs) {
                                                final SubLObject all_dependent_el_formulas = Mapping.mapcar(ASSERTION_EL_FORMULA, do_create_dependents);
                                                final SubLObject possible_instantiated_constants = list_utilities.intersect_all(all_dependent_el_formulas, UNPROVIDED, UNPROVIDED);
                                                SubLObject add_quoted_isasP = NIL;
                                                if ((NIL != kb_utilities.kbeq(do_create_predicate, $$doCreateFromDescription)) && (NIL != list_utilities.singletonP(possible_instantiated_constants))) {
                                                    add_quoted_isasP = T;
                                                } else
                                                    if ((NIL != kb_utilities.kbeq(do_create_predicate, $$doCreateFromDescription_Multiple)) && (NIL != list_utilities.lengthG(possible_instantiated_constants, ONE_INTEGER, UNPROVIDED))) {
                                                        add_quoted_isasP = T;
                                                    } else
                                                        if (NIL != kb_utilities.kbeq(do_create_predicate, $$doCreateFromDescription_Multiple)) {
                                                            Errors.warn($str187$could_not_determine_created_const, do_create_assertion);
                                                        }


                                                if (NIL != add_quoted_isasP) {
                                                    SubLObject cdolist_list_var_$43 = possible_instantiated_constants;
                                                    SubLObject possible_instantiated_constant = NIL;
                                                    possible_instantiated_constant = cdolist_list_var_$43.first();
                                                    while (NIL != cdolist_list_var_$43) {
                                                        count = add(count, ONE_INTEGER);
                                                        mark_constant_as_instantiated(possible_instantiated_constant, do_create_assertion);
                                                        cdolist_list_var_$43 = cdolist_list_var_$43.rest();
                                                        possible_instantiated_constant = cdolist_list_var_$43.first();
                                                    } 
                                                }
                                            } else
                                                if ((NIL != kb_utilities.kbeq(do_create_predicate, $$doCreateFromDescription)) && (NIL != list_utilities.lengthG(instantiated_constant_gafs, ONE_INTEGER, UNPROVIDED))) {
                                                    Errors.warn($str188$too_many_instantiated_constant_ga);
                                                } else
                                                    if ((NIL != kb_utilities.kbeq(do_create_predicate, $$doCreateFromDescription_Multiple)) && (NIL != list_utilities.singletonP(instantiated_constant_gafs))) {
                                                        Errors.warn($str189$not_enough_instantiated_constant_);
                                                    }


                                        }
                                        done_var_$39 = makeBoolean(NIL == valid_$41);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$38 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
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
                        $progress_last_pacification_time$.rebind(_prev_bind_1_$38, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$37, thread);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                do_create_predicate = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject retain_mt_contents(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != after_adding.initial_assertion_argumentP(argument, assertion)) && (NIL != assertion_utilities.true_assertionP(assertion))) {
            final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = after_adding.$after_addings_disabledP$.currentBinding(thread);
            try {
                kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
                after_adding.$after_addings_disabledP$.bind(T, thread);
                final SubLObject v_hlmt = assertions_high.gaf_arg1(assertion);
                final SubLObject _prev_bind_0_$45 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$46 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EQ, thread);
                    mt_relevance_macros.$mt$.bind(v_hlmt, thread);
                    SubLObject cdolist_list_var = virtual_indexing.gather_overlap_index(list_utilities.flatten(v_hlmt), UNPROVIDED);
                    SubLObject mt_assertion = NIL;
                    mt_assertion = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != hlmt.hlmt_equalP(v_hlmt, hlmt.assertion_hlmt(mt_assertion))) {
                            cyc_kernel.cyc_add_argument(fi.assertion_hl_formula(mt_assertion, UNPROVIDED), list(assertion), assertions_high.assertion_mt(mt_assertion), $list192, UNPROVIDED);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        mt_assertion = cdolist_list_var.first();
                    } 
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$46, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$45, thread);
                }
            } finally {
                after_adding.$after_addings_disabledP$.rebind(_prev_bind_2, thread);
                kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject declare_after_adding_modules_file() {
        declareFunction(me, "decache_after_addings", "DECACHE-AFTER-ADDINGS", 2, 0, false);
        declareFunction(me, "decache_after_removings", "DECACHE-AFTER-REMOVINGS", 2, 0, false);
        declareFunction(me, "decache_rule_after_addings", "DECACHE-RULE-AFTER-ADDINGS", 2, 0, false);
        declareFunction(me, "decache_rule_after_removings", "DECACHE-RULE-AFTER-REMOVINGS", 2, 0, false);
        declareFunction(me, "clear_mt_dependent_caches", "CLEAR-MT-DEPENDENT-CACHES", 2, 0, false);
        declareFunction(me, "possibly_clear_mt_dependent_caches", "POSSIBLY-CLEAR-MT-DEPENDENT-CACHES", 2, 0, false);
        declareFunction(me, "clear_mt_dependent_caches_int", "CLEAR-MT-DEPENDENT-CACHES-INT", 2, 0, false);
        declareFunction(me, "clear_genls_dependent_caches", "CLEAR-GENLS-DEPENDENT-CACHES", 2, 0, false);
        declareFunction(me, "clear_isa_dependent_caches", "CLEAR-ISA-DEPENDENT-CACHES", 2, 0, false);
        new after_adding_modules.$clear_isa_dependent_caches$BinaryFunction();
        declareFunction(me, "clear_isa_dependent_caches_internal", "CLEAR-ISA-DEPENDENT-CACHES-INTERNAL", 0, 0, false);
        declareFunction(me, "clear_quoted_isa_dependent_caches", "CLEAR-QUOTED-ISA-DEPENDENT-CACHES", 2, 0, false);
        declareFunction(me, "clear_quoted_isa_dependent_caches_internal", "CLEAR-QUOTED-ISA-DEPENDENT-CACHES-INTERNAL", 0, 0, false);
        declareFunction(me, "clear_genl_pred_dependent_caches", "CLEAR-GENL-PRED-DEPENDENT-CACHES", 2, 0, false);
        declareFunction(me, "add_transitive_via_arg", "ADD-TRANSITIVE-VIA-ARG", 2, 0, false);
        declareFunction(me, "remove_transitive_via_arg", "REMOVE-TRANSITIVE-VIA-ARG", 2, 0, false);
        declareFunction(me, "add_transitive_via_arg_inverse", "ADD-TRANSITIVE-VIA-ARG-INVERSE", 2, 0, false);
        declareFunction(me, "remove_transitive_via_arg_inverse", "REMOVE-TRANSITIVE-VIA-ARG-INVERSE", 2, 0, false);
        declareFunction(me, "clear_cached_tva_checks", "CLEAR-CACHED-TVA-CHECKS", 2, 0, false);
        declareFunction(me, "clear_cached_some_tva_checks", "CLEAR-CACHED-SOME-TVA-CHECKS", 2, 0, false);
        declareFunction(me, "clear_cached_cva_checks", "CLEAR-CACHED-CVA-CHECKS", 2, 0, false);
        declareFunction(me, "clear_cached_some_cva_checks", "CLEAR-CACHED-SOME-CVA-CHECKS", 2, 0, false);
        declareFunction(me, "skolem_after_removing", "SKOLEM-AFTER-REMOVING", 2, 0, false);
        declareFunction(me, "add_old_constant_name", "ADD-OLD-CONSTANT-NAME", 2, 0, false);
        declareFunction(me, "remove_old_constant_name", "REMOVE-OLD-CONSTANT-NAME", 2, 0, false);
        declareFunction(me, "propagate_to_isa", "PROPAGATE-TO-ISA", 2, 0, false);
        declareFunction(me, "propagate_to_genls", "PROPAGATE-TO-GENLS", 2, 0, false);
        declareFunction(me, "propagate_to_disjointwith", "PROPAGATE-TO-DISJOINTWITH", 2, 0, false);
        declareFunction(me, "propagate_to_genlmt", "PROPAGATE-TO-GENLMT", 2, 0, false);
        declareFunction(me, "propagate_to_genlpreds", "PROPAGATE-TO-GENLPREDS", 2, 0, false);
        declareFunction(me, "propagate_to_negationpreds", "PROPAGATE-TO-NEGATIONPREDS", 2, 0, false);
        declareFunction(me, "propagate_to_genlinverse", "PROPAGATE-TO-GENLINVERSE", 2, 0, false);
        declareFunction(me, "propagate_to_negationinverse", "PROPAGATE-TO-NEGATIONINVERSE", 2, 0, false);
        declareFunction(me, "propagate_inverse_to_isa", "PROPAGATE-INVERSE-TO-ISA", 2, 0, false);
        declareFunction(me, "propagate_inverse_to_genls", "PROPAGATE-INVERSE-TO-GENLS", 2, 0, false);
        declareFunction(me, "propagate_inverse_to_genlmt", "PROPAGATE-INVERSE-TO-GENLMT", 2, 0, false);
        declareFunction(me, "propagate_inverse_to_genlpreds", "PROPAGATE-INVERSE-TO-GENLPREDS", 2, 0, false);
        declareFunction(me, "propagate_inverse_to_genlinverse", "PROPAGATE-INVERSE-TO-GENLINVERSE", 2, 0, false);
        declareFunction(me, "propagate_sbhl_spec_pred_uses", "PROPAGATE-SBHL-SPEC-PRED-USES", 2, 0, false);
        declareFunction(me, "propagate_sbhl_spec_inverse_uses", "PROPAGATE-SBHL-SPEC-INVERSE-USES", 2, 0, false);
        declareFunction(me, "add_ist", "ADD-IST", 2, 0, false);
        declareFunction(me, "add_ist_el_support", "ADD-IST-EL-SUPPORT", 1, 0, false);
        declareFunction(me, "add_true_rule", "ADD-TRUE-RULE", 2, 0, false);
        declareFunction(me, "true_rule_el_support", "TRUE-RULE-EL-SUPPORT", 0, 0, false);
        declareFunction(me, "true_rule_support_p", "TRUE-RULE-SUPPORT-P", 1, 0, false);
        declareFunction(me, "rule_template_direction", "RULE-TEMPLATE-DIRECTION", 1, 1, false);
        declareFunction(me, "add_rule_template_direction", "ADD-RULE-TEMPLATE-DIRECTION", 2, 0, false);
        declareFunction(me, "remove_rule_template_direction", "REMOVE-RULE-TEMPLATE-DIRECTION", 2, 0, false);
        declareFunction(me, "rule_template_instantiations", "RULE-TEMPLATE-INSTANTIATIONS", 1, 1, false);
        declareFunction(me, "rule_template_instantiation_deduction", "RULE-TEMPLATE-INSTANTIATION-DEDUCTION", 1, 0, false);
        declareFunction(me, "remove_dependent_term", "REMOVE-DEPENDENT-TERM", 2, 0, false);
        declareFunction(me, "propagate_to_arity", "PROPAGATE-TO-ARITY", 2, 0, false);
        declareFunction(me, "add_arity", "ADD-ARITY", 2, 0, false);
        declareFunction(me, "remove_arity", "REMOVE-ARITY", 2, 0, false);
        declareFunction(me, "propagate_to_arity_min", "PROPAGATE-TO-ARITY-MIN", 2, 0, false);
        declareFunction(me, "add_arity_min", "ADD-ARITY-MIN", 2, 0, false);
        declareFunction(me, "remove_arity_min", "REMOVE-ARITY-MIN", 2, 0, false);
        declareFunction(me, "propagate_to_arity_max", "PROPAGATE-TO-ARITY-MAX", 2, 0, false);
        declareFunction(me, "add_arity_max", "ADD-ARITY-MAX", 2, 0, false);
        declareFunction(me, "remove_arity_max", "REMOVE-ARITY-MAX", 2, 0, false);
        declareFunction(me, "inter_arg_isa_after_adding", "INTER-ARG-ISA-AFTER-ADDING", 2, 0, false);
        declareFunction(me, "inter_arg_isa_after_removing", "INTER-ARG-ISA-AFTER-REMOVING", 2, 0, false);
        declareFunction(me, "inter_arg_format_after_adding", "INTER-ARG-FORMAT-AFTER-ADDING", 2, 0, false);
        declareFunction(me, "inter_arg_format_after_removing", "INTER-ARG-FORMAT-AFTER-REMOVING", 2, 0, false);
        declareFunction(me, "add_to_contraction_ht", "ADD-TO-CONTRACTION-HT", 2, 0, false);
        declareFunction(me, "remove_from_contraction_ht", "REMOVE-FROM-CONTRACTION-HT", 2, 0, false);
        declareFunction(me, "add_gen_template_expansion", "ADD-GEN-TEMPLATE-EXPANSION", 2, 0, false);
        declareFunction(me, "remove_gen_template_expansion", "REMOVE-GEN-TEMPLATE-EXPANSION", 2, 0, false);
        declareFunction(me, "add_expansion_axiom", "ADD-EXPANSION-AXIOM", 2, 0, false);
        declareFunction(me, "cyc_add_reformulation_assertion", "CYC-ADD-REFORMULATION-ASSERTION", 2, 0, false);
        declareFunction(me, "cyc_remove_reformulation_assertion", "CYC-REMOVE-REFORMULATION-ASSERTION", 2, 0, false);
        declareFunction(me, "cyc_add_element_of", "CYC-ADD-ELEMENT-OF", 2, 0, false);
        declareFunction(me, "clear_unit_multiplication_factor_caches", "CLEAR-UNIT-MULTIPLICATION-FACTOR-CACHES", 2, 0, false);
        declareFunction(me, "cyc_add_known_antecedent_rule", "CYC-ADD-KNOWN-ANTECEDENT-RULE", 2, 0, false);
        declareFunction(me, "cyc_remove_known_antecedent_rule", "CYC-REMOVE-KNOWN-ANTECEDENT-RULE", 2, 0, false);
        declareFunction(me, "add_merged_constant_guid", "ADD-MERGED-CONSTANT-GUID", 2, 0, false);
        declareFunction(me, "remove_merged_constant_guid", "REMOVE-MERGED-CONSTANT-GUID", 2, 0, false);
        declareFunction(me, "cyc_except_mt_added", "CYC-EXCEPT-MT-ADDED", 2, 0, false);
        declareFunction(me, "cyc_except_mt_removed", "CYC-EXCEPT-MT-REMOVED", 2, 0, false);
        declareFunction(me, "cyc_except_added", "CYC-EXCEPT-ADDED", 2, 0, false);
        declareFunction(me, "cyc_except_removed", "CYC-EXCEPT-REMOVED", 2, 0, false);
        declareFunction(me, "hl_gaf_p", "HL-GAF-P", 1, 0, false);
        declareFunction(me, "except_of_hl_gaf_p", "EXCEPT-OF-HL-GAF-P", 1, 0, false);
        declareFunction(me, "add_hl_gaf_denial", "ADD-HL-GAF-DENIAL", 2, 0, false);
        declareFunction(me, "rem_hl_gaf_denial", "REM-HL-GAF-DENIAL", 2, 0, false);
        declareFunction(me, "add_relation_instance_all", "ADD-RELATION-INSTANCE-ALL", 2, 0, false);
        declareFunction(me, "remove_relation_instance_all", "REMOVE-RELATION-INSTANCE-ALL", 2, 0, false);
        declareFunction(me, "add_relation_all_instance", "ADD-RELATION-ALL-INSTANCE", 2, 0, false);
        declareFunction(me, "remove_relation_all_instance", "REMOVE-RELATION-ALL-INSTANCE", 2, 0, false);
        declareFunction(me, "mark_constant_as_instantiated", "MARK-CONSTANT-AS-INSTANTIATED", 2, 0, false);
        declareFunction(me, "cyc_create_new_instantiated_permanent", "CYC-CREATE-NEW-INSTANTIATED-PERMANENT", 2, 0, false);
        declareFunction(me, "instantiated_constant_p", "INSTANTIATED-CONSTANT-P", 1, 0, false);
        declareFunction(me, "possible_instantiated_constant_with_no_assertionsP", "POSSIBLE-INSTANTIATED-CONSTANT-WITH-NO-ASSERTIONS?", 1, 0, false);
        declareFunction(me, "instantiated_constant_with_one_assertionP", "INSTANTIATED-CONSTANT-WITH-ONE-ASSERTION?", 1, 0, false);
        declareFunction(me, "possible_instantiated_constant_to_reuseP", "POSSIBLE-INSTANTIATED-CONSTANT-TO-REUSE?", 1, 0, false);
        declareFunction(me, "do_create_from_description", "DO-CREATE-FROM-DESCRIPTION", 2, 0, false);
        declareFunction(me, "expression_instantiated_constant_count", "EXPRESSION-INSTANTIATED-CONSTANT-COUNT", 1, 0, false);
        declareFunction(me, "expression_has_instantiated_constantP", "EXPRESSION-HAS-INSTANTIATED-CONSTANT?", 1, 0, false);
        declareFunction(me, "do_create_from_description_multiple", "DO-CREATE-FROM-DESCRIPTION-MULTIPLE", 2, 0, false);
        declareFunction(me, "make_do_create_from_description_query", "MAKE-DO-CREATE-FROM-DESCRIPTION-QUERY", 2, 0, false);
        declareFunction(me, "constant_instantiated_from_subcollection_expression_p", "CONSTANT-INSTANTIATED-FROM-SUBCOLLECTION-EXPRESSION-P", 1, 0, false);
        declareFunction(me, "instantiate_from_subcollection_expression", "INSTANTIATE-FROM-SUBCOLLECTION-EXPRESSION", 2, 0, false);
        declareFunction(me, "show_constants_with_no_assertions", "SHOW-CONSTANTS-WITH-NO-ASSERTIONS", 0, 0, false);
        declareFunction(me, "kill_constants_with_no_assertions_by_prefix", "KILL-CONSTANTS-WITH-NO-ASSERTIONS-BY-PREFIX", 1, 0, false);
        declareFunction(me, "show_unused_instantiated_constants", "SHOW-UNUSED-INSTANTIATED-CONSTANTS", 0, 0, false);
        declareFunction(me, "forget_unused_instantiated_constants", "FORGET-UNUSED-INSTANTIATED-CONSTANTS", 0, 0, false);
        declareFunction(me, "kill_unused_instantiated_constants", "KILL-UNUSED-INSTANTIATED-CONSTANTS", 0, 0, false);
        declareFunction(me, "assert_missing_quoted_isa_instantiated_constant_assertions", "ASSERT-MISSING-QUOTED-ISA-INSTANTIATED-CONSTANT-ASSERTIONS", 0, 0, false);
        declareFunction(me, "retain_mt_contents", "RETAIN-MT-CONTENTS", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_after_adding_modules_file() {
        deflexical("*CYCL-FUNCTIONS-USED-AS-AFTER-ADDINGS*", $list0);
        defparameter("*INSIDE-CLEAR-GENLS-DEPENDENT-CACHES?*", NIL);
        defparameter("*INSIDE-CLEAR-ISA-DEPENDENT-CACHES?*", NIL);
        defparameter("*INSIDE-CLEAR-QUOTED-ISA-DEPENDENT-CACHES?*", NIL);
        defparameter("*TRUE-RULE-TEMPLATE*", $list54);
        deflexical("*TRUE-RULE-DEFINING-MT*", SubLTrampolineFile.maybeDefault($true_rule_defining_mt$, $true_rule_defining_mt$, $$CoreCycLMt));
        defparameter("*CYC-EXCEPT-MT-REPROPAGATE-MT-CONTENTS-CUTOFF*", $int$256);
        defparameter("*DEBUG-DO-CREATE-FROM-DESCRIPTION?*", NIL);
        defparameter("*INSTANTIATE-FROM-SUBCOLLECTION-EXPRESSION-CONSTANT-PREFIX*", $$$INST);
        return NIL;
    }

    public static SubLObject setup_after_adding_modules_file() {
        SubLObject cdolist_list_var = $cycl_functions_used_as_after_addings$.getGlobalValue();
        SubLObject symbol = NIL;
        symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            register_kb_function(symbol);
            cdolist_list_var = cdolist_list_var.rest();
            symbol = cdolist_list_var.first();
        } 
        register_kb_function(DECACHE_AFTER_ADDINGS);
        register_kb_function(DECACHE_AFTER_REMOVINGS);
        register_kb_function(DECACHE_RULE_AFTER_ADDINGS);
        register_kb_function(DECACHE_RULE_AFTER_REMOVINGS);
        register_kb_function(CLEAR_MT_DEPENDENT_CACHES);
        register_kb_function(CLEAR_GENLS_DEPENDENT_CACHES);
        register_kb_function(CLEAR_ISA_DEPENDENT_CACHES);
        register_kb_function(CLEAR_QUOTED_ISA_DEPENDENT_CACHES);
        register_kb_function(CLEAR_GENL_PRED_DEPENDENT_CACHES);
        register_kb_function(ADD_TRANSITIVE_VIA_ARG);
        register_kb_function(REMOVE_TRANSITIVE_VIA_ARG);
        register_kb_function(ADD_TRANSITIVE_VIA_ARG_INVERSE);
        register_kb_function(REMOVE_TRANSITIVE_VIA_ARG_INVERSE);
        register_kb_function(CLEAR_CACHED_TVA_CHECKS);
        register_kb_function(CLEAR_CACHED_SOME_TVA_CHECKS);
        register_kb_function(CLEAR_CACHED_CVA_CHECKS);
        register_kb_function(CLEAR_CACHED_SOME_CVA_CHECKS);
        register_kb_function(SKOLEM_AFTER_REMOVING);
        register_kb_function(ADD_OLD_CONSTANT_NAME);
        register_kb_function(REMOVE_OLD_CONSTANT_NAME);
        register_kb_function(PROPAGATE_TO_ISA);
        register_kb_function(PROPAGATE_TO_GENLS);
        register_kb_function(PROPAGATE_TO_DISJOINTWITH);
        register_kb_function(PROPAGATE_TO_GENLMT);
        register_kb_function(PROPAGATE_TO_GENLPREDS);
        register_kb_function(PROPAGATE_TO_NEGATIONPREDS);
        register_kb_function(PROPAGATE_TO_GENLINVERSE);
        register_kb_function(PROPAGATE_TO_NEGATIONINVERSE);
        register_kb_function(PROPAGATE_INVERSE_TO_ISA);
        register_kb_function(PROPAGATE_INVERSE_TO_GENLS);
        register_kb_function(PROPAGATE_INVERSE_TO_GENLMT);
        register_kb_function(PROPAGATE_INVERSE_TO_GENLPREDS);
        register_kb_function(PROPAGATE_INVERSE_TO_GENLINVERSE);
        register_kb_function(ADD_IST);
        register_kb_function(ADD_TRUE_RULE);
        declare_defglobal($true_rule_defining_mt$);
        mt_vars.note_mt_var($true_rule_defining_mt$, $$trueRule);
        register_kb_function(ADD_RULE_TEMPLATE_DIRECTION);
        register_kb_function(REMOVE_RULE_TEMPLATE_DIRECTION);
        register_kb_function(REMOVE_DEPENDENT_TERM);
        register_kb_function(PROPAGATE_TO_ARITY);
        register_kb_function(ADD_ARITY);
        register_kb_function(REMOVE_ARITY);
        register_kb_function(PROPAGATE_TO_ARITY_MIN);
        register_kb_function(ADD_ARITY_MIN);
        register_kb_function(REMOVE_ARITY_MIN);
        register_kb_function(PROPAGATE_TO_ARITY_MAX);
        register_kb_function(ADD_ARITY_MAX);
        register_kb_function(REMOVE_ARITY_MAX);
        register_kb_function(INTER_ARG_ISA_AFTER_ADDING);
        register_kb_function(INTER_ARG_ISA_AFTER_REMOVING);
        register_kb_function(INTER_ARG_FORMAT_AFTER_ADDING);
        register_kb_function(INTER_ARG_FORMAT_AFTER_REMOVING);
        register_kb_function(ADD_TO_CONTRACTION_HT);
        register_kb_function(REMOVE_FROM_CONTRACTION_HT);
        register_kb_function(ADD_GEN_TEMPLATE_EXPANSION);
        register_kb_function(REMOVE_GEN_TEMPLATE_EXPANSION);
        register_kb_function(ADD_EXPANSION_AXIOM);
        register_kb_function(CYC_ADD_REFORMULATION_ASSERTION);
        register_kb_function(CYC_REMOVE_REFORMULATION_ASSERTION);
        register_kb_function(CYC_ADD_ELEMENT_OF);
        register_kb_function(CLEAR_UNIT_MULTIPLICATION_FACTOR_CACHES);
        register_kb_function(CYC_ADD_KNOWN_ANTECEDENT_RULE);
        register_kb_function(CYC_REMOVE_KNOWN_ANTECEDENT_RULE);
        register_kb_function(ADD_MERGED_CONSTANT_GUID);
        register_kb_function(REMOVE_MERGED_CONSTANT_GUID);
        register_kb_function(CYC_EXCEPT_MT_ADDED);
        register_kb_function(CYC_EXCEPT_MT_REMOVED);
        register_kb_function(CYC_EXCEPT_ADDED);
        register_kb_function(CYC_EXCEPT_REMOVED);
        register_kb_function(ADD_RELATION_INSTANCE_ALL);
        register_kb_function(REMOVE_RELATION_INSTANCE_ALL);
        register_kb_function(ADD_RELATION_ALL_INSTANCE);
        register_kb_function(REMOVE_RELATION_ALL_INSTANCE);
        register_kb_function(DO_CREATE_FROM_DESCRIPTION);
        register_kb_function(DO_CREATE_FROM_DESCRIPTION_MULTIPLE);
        register_kb_function(INSTANTIATE_FROM_SUBCOLLECTION_EXPRESSION);
        register_kb_function(RETAIN_MT_CONTENTS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_after_adding_modules_file();
    }

    @Override
    public void initializeVariables() {
        init_after_adding_modules_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_after_adding_modules_file();
    }

    static {












































































































































































































    }

    public static final class $clear_isa_dependent_caches$BinaryFunction extends BinaryFunction {
        public $clear_isa_dependent_caches$BinaryFunction() {
            super(extractFunctionNamed("CLEAR-ISA-DEPENDENT-CACHES"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return clear_isa_dependent_caches(arg1, arg2);
        }
    }
}

/**
 * Total time: 1007 ms
 */
