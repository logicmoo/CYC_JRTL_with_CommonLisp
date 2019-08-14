/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.dictionary_utilities.dictionary_pushnew;
import static com.cyc.cycjava.cycl.dictionary_utilities.dictionary_remove_from_value;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.isa.map_all_instances;
import static com.cyc.cycjava.cycl.list_utilities.every_in_list;
import static com.cyc.cycjava.cycl.list_utilities.member_eqP;
import static com.cyc.cycjava.cycl.list_utilities.randomize_list;
import static com.cyc.cycjava.cycl.list_utilities.singletonP;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.apply_sbhl_module_type_test;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_add_node_to_result_test;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_backward_direction;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_module_type;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_transfers_through_module;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.get_sbhl_type_test;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.sbhl_reflexive_module_p;
import static com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities.sbhl_search_direction_to_link_direction;
import static com.cyc.cycjava.cycl.set_utilities.construct_set_from_list;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_promotions.memberP;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$noting_progress_delayed_mode_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$noting_progress_delayed_mode_string$;
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
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_parameters;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SBHL-CACHE
 * source file: /cyc/top/cycl/sbhl/sbhl-cache.lisp
 * created:     2019/07/03 17:37:28
 */
public final class sbhl_cache extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sbhl_cache();

 public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_cache";


    public static final SubLSymbol $cached_isas$ = makeSymbol("*CACHED-ISAS*");

    public static final SubLSymbol $additional_fort_typing_collections$ = makeSymbol("*ADDITIONAL-FORT-TYPING-COLLECTIONS*");

    private static final SubLSymbol $cached_genl_predicates$ = makeSymbol("*CACHED-GENL-PREDICATES*");

    private static final SubLSymbol $cached_genls$ = makeSymbol("*CACHED-GENLS*");

    // 
    private static final SubLSymbol $cached_genl_predicates_set$ = makeSymbol("*CACHED-GENL-PREDICATES-SET*");

    public static final SubLSymbol $cached_isas_set$ = makeSymbol("*CACHED-ISAS-SET*");

    public static final SubLSymbol $cached_preds$ = makeSymbol("*CACHED-PREDS*");

    public static final SubLSymbol $implicit_fort_typing_collections$ = makeSymbol("*IMPLICIT-FORT-TYPING-COLLECTIONS*");



    // defconstant
    // The collections used for fort type definitional typing.
    /**
     * The collections used for fort type definitional typing.
     */
    @LispMethod(comment = "The collections used for fort type definitional typing.\ndefconstant")
    public static final SubLSymbol $definitional_fort_typing_collections$ = makeSymbol("*DEFINITIONAL-FORT-TYPING-COLLECTIONS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $application_specific_fort_typing_collections$ = makeSymbol("*APPLICATION-SPECIFIC-FORT-TYPING-COLLECTIONS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cached_quoted_isas$ = makeSymbol("*CACHED-QUOTED-ISAS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cached_quoted_isas_set$ = makeSymbol("*CACHED-QUOTED-ISAS-SET*");

    // defvar
    @LispMethod(comment = "defvar")
    public static final SubLSymbol $sbhl_cache_misses_hash_table$ = makeSymbol("*SBHL-CACHE-MISSES-HASH-TABLE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLList $list1 = list(new SubLObject[]{ reader_make_constant_shell("different"), reader_make_constant_shell("conceptuallyRelated"), reader_make_constant_shell("equals"), reader_make_constant_shell("equalSymbols"), reader_make_constant_shell("isa"), reader_make_constant_shell("quotedIsa"), reader_make_constant_shell("sksiIsa"), reader_make_constant_shell("sksiUnknownSentence"), reader_make_constant_shell("subStructures"), reader_make_constant_shell("termPhrases"), reader_make_constant_shell("termStrings"), reader_make_constant_shell("objectFoundInLocation"), reader_make_constant_shell("physicalDecompositions"), reader_make_constant_shell("properSubEvents"), reader_make_constant_shell("startsAfterEndingOf"), reader_make_constant_shell("elementOf"), reader_make_constant_shell("unknownSentence"), reader_make_constant_shell("memberOfList"), reader_make_constant_shell("quantitySubsumes"), reader_make_constant_shell("ist"), reader_make_constant_shell("agendaHasTaskWithPriority"), reader_make_constant_shell("unlikelyValueRangeForGaugeInWell") });

    public static final SubLSymbol $genl_predicate_cache$ = makeSymbol("*GENL-PREDICATE-CACHE*");

    public static final SubLSymbol $genl_inverse_cache$ = makeSymbol("*GENL-INVERSE-CACHE*");

    public static final SubLSymbol $all_mts_genl_predicate_cache$ = makeSymbol("*ALL-MTS-GENL-PREDICATE-CACHE*");

    public static final SubLSymbol $all_mts_genl_inverse_cache$ = makeSymbol("*ALL-MTS-GENL-INVERSE-CACHE*");

    private static final SubLList $list6 = list(new SubLObject[]{ reader_make_constant_shell("CycLAssertion"), reader_make_constant_shell("CycLExpression"), reader_make_constant_shell("CycLExpression-Askable"), reader_make_constant_shell("CycLExpression-Assertible"), reader_make_constant_shell("CycLFormula"), reader_make_constant_shell("CycLIndexedTerm"), reader_make_constant_shell("CycLReifiableDenotationalTerm"), reader_make_constant_shell("CycLSentence"), reader_make_constant_shell("CycLSentence-Askable"), reader_make_constant_shell("CycLSentence-Assertible"), reader_make_constant_shell("Microtheory"), reader_make_constant_shell("SubLList"), reader_make_constant_shell("Function-Denotational"), reader_make_constant_shell("CalendarMonth"), reader_make_constant_shell("Time-Quantity"), reader_make_constant_shell("Fraction") });

    public static final SubLSymbol $genls_cache$ = makeSymbol("*GENLS-CACHE*");

    public static final SubLSymbol $all_mts_genls_cache$ = makeSymbol("*ALL-MTS-GENLS-CACHE*");

    static private final SubLList $list9 = list(reader_make_constant_shell("Collection"), reader_make_constant_shell("Predicate"), reader_make_constant_shell("Function-Denotational"), reader_make_constant_shell("Microtheory"));

    private static final SubLList $list10 = list(new SubLObject[]{ reader_make_constant_shell("AntiSymmetricBinaryPredicate"), reader_make_constant_shell("AntiTransitiveBinaryPredicate"), reader_make_constant_shell("ArgTypeBinaryPredicate"), reader_make_constant_shell("ArgTypeTernaryPredicate"), reader_make_constant_shell("AsymmetricBinaryPredicate"), reader_make_constant_shell("BookkeepingPredicate"), reader_make_constant_shell("BroadMicrotheory"), reader_make_constant_shell("CalendarCoveringType"), reader_make_constant_shell("CommutativeRelation"), reader_make_constant_shell("ConventionallyClassifiedTimeIntervalSeries-DisjointWithGaps"), reader_make_constant_shell("DefaultMonotonicPredicate"), reader_make_constant_shell("DisjointCollectionType"), reader_make_constant_shell("DistributingMetaKnowledgePredicate"), reader_make_constant_shell("DocumentationPredicate"), reader_make_constant_shell("ELRelation"), reader_make_constant_shell("EvaluatableFunction"), reader_make_constant_shell("EvaluatablePredicate"), reader_make_constant_shell("EvaluatableRelation-Contextualized"), reader_make_constant_shell("ExistentialQuantifier"), reader_make_constant_shell("ExistentialQuantifier-Bounded"), reader_make_constant_shell("IndeterminateTermDenotingFunction"), reader_make_constant_shell("InferenceRelatedBookkeepingPredicate"), reader_make_constant_shell("IrreflexiveBinaryPredicate"), reader_make_constant_shell("LogicalConnective"), reader_make_constant_shell("MicrotheoryDesignatingRelation"), reader_make_constant_shell("PartiallyCommutativePredicate"), reader_make_constant_shell("PartiallyCommutativeRelation"), reader_make_constant_shell("ProblemSolvingCntxt"), reader_make_constant_shell("Quantifier"), reader_make_constant_shell("ReflexiveBinaryPredicate"), reader_make_constant_shell("ReifiableFunction"), reader_make_constant_shell("RuleMacroPredicate"), reader_make_constant_shell("ScopingRelation"), reader_make_constant_shell("SiblingDisjointCollectionType"), reader_make_constant_shell("SkolemFunction"), reader_make_constant_shell("SymmetricBinaryPredicate"), reader_make_constant_shell("TransitiveBinaryPredicate"), reader_make_constant_shell("TruthFunction"), reader_make_constant_shell("UnitOfMeasure"), reader_make_constant_shell("UnknownScalarInterval"), reader_make_constant_shell("VariableArityRelation"), reader_make_constant_shell("FirstOrderCollection"), reader_make_constant_shell("SecondOrderCollection"), reader_make_constant_shell("ThirdOrderCollection"), reader_make_constant_shell("FourthOrderCollection"), reader_make_constant_shell("CollectionDenotingFunction"), reader_make_constant_shell("WFFConstraintPredicate"), reader_make_constant_shell("MonthOfYearType") });

    private static final SubLList $list11 = list(new SubLObject[]{ reader_make_constant_shell("NLDefinitenessAttribute"), reader_make_constant_shell("NLQuantAttribute"), reader_make_constant_shell("NLSemanticPredicate"), reader_make_constant_shell("ProperNamePredicate-Strict"), reader_make_constant_shell("SpeechPart"), reader_make_constant_shell("CSQLComparisonPredicate"), reader_make_constant_shell("CSQLConstantFunction"), reader_make_constant_shell("CSQLFunction"), reader_make_constant_shell("CSQLLogicalConnective"), reader_make_constant_shell("CSQLQuantifier"), reader_make_constant_shell("LogicalSchema"), reader_make_constant_shell("SKSIContentMicrotheory"), reader_make_constant_shell("SKSIExternalTermDenotingFunction"), reader_make_constant_shell("SKSISupportedComparisonPredicate"), reader_make_constant_shell("SKSISupportedConstant"), reader_make_constant_shell("SKSISupportedFunction"), reader_make_constant_shell("StructuredKnowledgeSource"), reader_make_constant_shell("CytologicalProcessProjectKBContentTestQuery"), reader_make_constant_shell("SingleInteractionContextEventType"), reader_make_constant_shell("PlannedEvent"), reader_make_constant_shell("InteractionHistoryMicrotheory"), reader_make_constant_shell("BELLAInteractionHistoryMicrotheory"), reader_make_constant_shell("InstantaneousSimulatedActionType"), reader_make_constant_shell("MathematicalExpressionDenotingFunction"), reader_make_constant_shell("SpreadsheetSKS") });

    private static final SubLList $list12 = list(reader_make_constant_shell("Relation"));



    public static final SubLSymbol $isa_cache$ = makeSymbol("*ISA-CACHE*");

    public static final SubLSymbol $implicit_fort_type_mapping$ = makeSymbol("*IMPLICIT-FORT-TYPE-MAPPING*");

    public static final SubLSymbol $all_mts_isa_cache$ = makeSymbol("*ALL-MTS-ISA-CACHE*");

    private static final SubLList $list18 = list(reader_make_constant_shell("CoreUnionConstant"), reader_make_constant_shell("IndeterminateTerm"), reader_make_constant_shell("LogicalFieldIndexical"), reader_make_constant_shell("NonSkolemIndeterminateTerm"), reader_make_constant_shell("PhysicalFieldIndexical"), reader_make_constant_shell("TermAcceptableForQuerySearch-TriggerOnly"), reader_make_constant_shell("TermExemptFromUniqueNamesAssumption"), reader_make_constant_shell("ObsoleteConstant"));



    public static final SubLSymbol $quoted_isa_cache$ = makeSymbol("*QUOTED-ISA-CACHE*");

    public static final SubLSymbol $all_mts_quoted_isa_cache$ = makeSymbol("*ALL-MTS-QUOTED-ISA-CACHE*");

    private static final SubLList $list22 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("quotedIsa"), reader_make_constant_shell("genls"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("genlInverse"));

    private static final SubLList $list23 = list(list(makeSymbol("NODE-VAR"), makeSymbol("PRED")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol GET_CACHED_NODES_SET_FOR_PRED = makeSymbol("GET-CACHED-NODES-SET-FOR-PRED");







    private static final SubLString $str29$_sbhl_cache_misses_hash_table__is = makeString("*sbhl-cache-misses-hash-table* is not a hash table");

    private static final SubLString $str30$_A___S__ = makeString("~A: ~S~%");

    private static final SubLSymbol $sym31$_ = makeSymbol(">");

    private static final SubLSymbol SBHL_PREDICATE_P = makeSymbol("SBHL-PREDICATE-P");

    private static final SubLList $list33 = list(list(makeSymbol("CACHED-NODE-VAR"), makeSymbol("MTS-VAR"), makeSymbol("SUBNODE"), makeSymbol("PRED")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym34$SUBNODES_VAR = makeUninternedSymbol("SUBNODES-VAR");

    private static final SubLSymbol GET_SBHL_CACHE_FOR_PRED = makeSymbol("GET-SBHL-CACHE-FOR-PRED");

    private static final SubLString $$$Initializing_SBHL_cache_for_ = makeString("Initializing SBHL cache for ");

    private static final SubLString $str43$_ = makeString(".");

    private static final SubLString $$$Adding_ = makeString("Adding ");

    private static final SubLString $$$_to_SBHL_cache_for_ = makeString(" to SBHL cache for ");

    private static final SubLList $list46 = list(list(makeSymbol("LINK-NODE-VAR"), makeSymbol("SUBNODE-VAR"), makeSymbol("PRED")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym47$SUBNODES = makeUninternedSymbol("SUBNODES");

    private static final SubLSymbol $sym48$NODES = makeUninternedSymbol("NODES");

    private static final SubLSymbol $sym49$CACHE = makeUninternedSymbol("CACHE");

    private static final SubLSymbol GET_SBHL_ALL_MTS_CACHE_FOR_PRED = makeSymbol("GET-SBHL-ALL-MTS-CACHE-FOR-PRED");

    private static final SubLSymbol FORT_ID_INDEX_P = makeSymbol("FORT-ID-INDEX-P");

    private static final SubLSymbol DO_FORT_ID_INDEX = makeSymbol("DO-FORT-ID-INDEX");

    private static final SubLList $list54 = list(list(makeSymbol("CACHED-LINK-NODE"), makeSymbol("PRED"), makeSymbol("SUBNODE"), makeSymbol("MT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym55$CACHE = makeUninternedSymbol("CACHE");

    private static final SubLSymbol $sym56$CACHED_NODES_STORE = makeUninternedSymbol("CACHED-NODES-STORE");

    private static final SubLSymbol $sym57$MEMBER_ = makeSymbol("MEMBER?");

    private static final SubLList $list58 = list(list(makeSymbol("CACHED-LINK-NODE"), makeSymbol("PRED"), makeSymbol("SUBNODE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym59$CACHE = makeUninternedSymbol("CACHE");

    private static final SubLSymbol $sym60$SUBNODES = makeUninternedSymbol("SUBNODES");

    private static final SubLSymbol SBHL_PRED_ALL_MTS_CACHE_USES_ID_INDEX_P = makeSymbol("SBHL-PRED-ALL-MTS-CACHE-USES-ID-INDEX-P");

    private static final SubLSymbol SBHL_ID_INDEX_LOOKUP = makeSymbol("SBHL-ID-INDEX-LOOKUP");

    private static final SubLSymbol $sym63$SET_MEMBER_ = makeSymbol("SET-MEMBER?");

    private static final SubLList $list64 = list(reader_make_constant_shell("genlPreds"), reader_make_constant_shell("genlInverse"), reader_make_constant_shell("genls"), reader_make_constant_shell("isa"), reader_make_constant_shell("quotedIsa"));





    private static final SubLObject $$Function_Denotational = reader_make_constant_shell("Function-Denotational");





    private static final SubLString $str70$Computing_all_mts_SBHL_caches_ = makeString("Computing all-mts SBHL caches.");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLString $str72$Computing_SBHL_caches_from_all_mt = makeString("Computing SBHL caches from all-mts caches.");





    private static final SubLString $str82$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str87$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str88$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str89$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str90$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLString $str92$genlPreds___genlInverse_after_add = makeString("genlPreds / genlInverse after adding used for assertion with predicate ~a.");

    private static final SubLSymbol RESET_CACHED_GENL_PRED_AND_INVERSE_RELATIONS = makeSymbol("RESET-CACHED-GENL-PRED-AND-INVERSE-RELATIONS");

    private static final SubLSymbol RESET_CACHED_ISA_RELATIONS = makeSymbol("RESET-CACHED-ISA-RELATIONS");

    private static final SubLSymbol RESET_CACHED_QUOTED_ISA_RELATIONS = makeSymbol("RESET-CACHED-QUOTED-ISA-RELATIONS");

    private static final SubLSymbol RESET_CACHED_GENLS_RELATIONS = makeSymbol("RESET-CACHED-GENLS-RELATIONS");

    private static final SubLList $list98 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    public static final SubLObject note_sbhl_caches_initialized_alt() {
        $sbhl_caches_initializedP$.setGlobalValue(T);
        return NIL;
    }

    public static SubLObject note_sbhl_caches_initialized() {
        $sbhl_caches_initializedP$.setGlobalValue(T);
        return NIL;
    }

    public static final SubLObject sbhl_caches_initialized_p_alt() {
        return $sbhl_caches_initializedP$.getGlobalValue();
    }

    public static SubLObject sbhl_caches_initialized_p() {
        return $sbhl_caches_initializedP$.getGlobalValue();
    }

    public static final SubLSymbol $cached_genls_set$ = makeSymbol("*CACHED-GENLS-SET*");

    public static SubLObject sbhl_cache_add_new_additional_fort_typing_collection(final SubLObject collection) {
        if (NIL == member(collection, $additional_fort_typing_collections$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $additional_fort_typing_collections$.setGlobalValue(cons(collection, $additional_fort_typing_collections$.getGlobalValue()));
        }
        $cached_isas$.setGlobalValue(append($definitional_fort_typing_collections$.getGlobalValue(), $additional_fort_typing_collections$.getGlobalValue(), $application_specific_fort_typing_collections$.getGlobalValue(), $implicit_fort_typing_collections$.getGlobalValue()));
        $cached_isas_set$.setGlobalValue(set_utilities.construct_set_from_list(reverse($cached_isas$.getGlobalValue()), symbol_function(EQL), UNPROVIDED));
        SubLObject cdolist_list_var;
        final SubLObject all_instances = cdolist_list_var = list_utilities.remove_if_not(FORT_P, isa.all_instances_in_all_mts(collection), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject instance = NIL;
        instance = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            reset_cached_sbhl_relations_for_node($$isa, instance, T);
            cdolist_list_var = cdolist_list_var.rest();
            instance = cdolist_list_var.first();
        } 
        return collection;
    }

    public static final SubLObject all_fort_types_alt() {
        return $cached_isas$.getGlobalValue();
    }

    public static SubLObject all_fort_types() {
        return $cached_isas$.getGlobalValue();
    }

    /**
     * Accessor. @return booleanp; is TYPE a member of @xref all-fort-types.
     */
    @LispMethod(comment = "Accessor. @return booleanp; is TYPE a member of @xref all-fort-types.")
    public static final SubLObject valid_fort_typeP_alt(SubLObject type) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_cache.cached_nodeP(type, $$isa);
    }

    /**
     * Accessor. @return booleanp; is TYPE a member of @xref all-fort-types.
     */
    @LispMethod(comment = "Accessor. @return booleanp; is TYPE a member of @xref all-fort-types.")
    public static SubLObject valid_fort_typeP(final SubLObject type) {
        return cached_nodeP(type, $$isa);
    }

    public static SubLObject sbhl_cache_add_new_additional_fort_typing_collection_quoted(final SubLObject collection) {
        if (NIL == member(collection, $cached_quoted_isas$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $cached_quoted_isas$.setGlobalValue(cons(collection, $cached_quoted_isas$.getGlobalValue()));
        }
        $cached_quoted_isas_set$.setGlobalValue(set_utilities.construct_set_from_list(reverse($cached_quoted_isas$.getGlobalValue()), symbol_function(EQL), UNPROVIDED));
        SubLObject cdolist_list_var;
        final SubLObject all_quoted_instances = cdolist_list_var = list_utilities.remove_if_not(FORT_P, isa.all_quoted_instances_in_all_mts(collection), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject quoted_instance = NIL;
        quoted_instance = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            reset_cached_sbhl_relations_for_node($$quotedIsa, quoted_instance, T);
            cdolist_list_var = cdolist_list_var.rest();
            quoted_instance = cdolist_list_var.first();
        } 
        return collection;
    }

    /**
     * Iterates over the keys, NODE, of the sbhl-cache stores for PRED
     */
    @LispMethod(comment = "Iterates over the keys, NODE, of the sbhl-cache stores for PRED")
    public static final SubLObject do_sbhl_cached_subsumption_nodes_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt26);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject node_var = NIL;
                    SubLObject pred = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt26);
                    node_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt26);
                    pred = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(DO_SET, list(node_var, list(GET_CACHED_NODES_SET_FOR_PRED, pred)), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt26);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Iterates over the keys, NODE, of the sbhl-cache stores for PRED
     */
    @LispMethod(comment = "Iterates over the keys, NODE, of the sbhl-cache stores for PRED")
    public static SubLObject do_sbhl_cached_subsumption_nodes(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list23);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject node_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list23);
        pred = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_SET, list(node_var, list(GET_CACHED_NODES_SET_FOR_PRED, pred)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list23);
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; whether NODE is a cached superior node for PRED
     */
    @LispMethod(comment = "@return booleanp; whether NODE is a cached superior node for PRED")
    public static final SubLObject cached_nodeP_alt(SubLObject node, SubLObject pred) {
        return set.set_memberP(node, com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_cached_nodes_set_for_pred(pred));
    }

    /**
     *
     *
     * @return booleanp; whether NODE is a cached superior node for PRED
     */
    @LispMethod(comment = "@return booleanp; whether NODE is a cached superior node for PRED")
    public static SubLObject cached_nodeP(final SubLObject node, final SubLObject pred) {
        return set.set_memberP(node, get_cached_nodes_set_for_pred(pred));
    }

    /**
     * Does an @xref fort-id-index-lookup on ID-INDEX with NODE, provided node is a fort.
     */
    @LispMethod(comment = "Does an @xref fort-id-index-lookup on ID-INDEX with NODE, provided node is a fort.")
    public static final SubLObject sbhl_id_index_lookup_alt(SubLObject v_id_index, SubLObject node) {
        return NIL != forts.fort_p(node) ? ((SubLObject) (forts.fort_id_index_lookup(v_id_index, node))) : NIL;
    }

    /**
     * Does an @xref fort-id-index-lookup on ID-INDEX with NODE, provided node is a fort.
     */
    @LispMethod(comment = "Does an @xref fort-id-index-lookup on ID-INDEX with NODE, provided node is a fort.")
    public static SubLObject sbhl_id_index_lookup(final SubLObject v_id_index, final SubLObject node) {
        return NIL != forts.fort_p(node) ? forts.fort_id_index_lookup(v_id_index, node) : NIL;
    }

    /**
     *
     *
     * @return setp; the cached subsuming node set for MODULE.
     */
    @LispMethod(comment = "@return setp; the cached subsuming node set for MODULE.")
    public static final SubLObject get_cached_nodes_set_for_pred_alt(SubLObject pred) {
        {
            SubLObject pcase_var = pred;
            if (pcase_var.eql($$isa)) {
                return $cached_isas_set$.getGlobalValue();
            } else {
                if (pcase_var.eql($$genls)) {
                    return $cached_genls_set$.getGlobalValue();
                } else {
                    if (pcase_var.eql($$genlPreds)) {
                        return $cached_genl_predicates_set$.getGlobalValue();
                    } else {
                        if (pcase_var.eql($$genlInverse)) {
                            return $cached_genl_predicates_set$.getGlobalValue();
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return setp; the cached subsuming node set for MODULE.
     */
    @LispMethod(comment = "@return setp; the cached subsuming node set for MODULE.")
    public static SubLObject get_cached_nodes_set_for_pred(final SubLObject pred) {
        if (pred.eql($$isa)) {
            return $cached_isas_set$.getGlobalValue();
        }
        if (pred.eql($$quotedIsa)) {
            return $cached_quoted_isas_set$.getGlobalValue();
        }
        if (pred.eql($$genls)) {
            return $cached_genls_set$.getGlobalValue();
        }
        if (pred.eql($$genlPreds)) {
            return $cached_genl_predicates_set$.getGlobalValue();
        }
        if (pred.eql($$genlInverse)) {
            return $cached_genl_predicates_set$.getGlobalValue();
        }
        return NIL;
    }

    /**
     *
     *
     * @return listp; the cached subsuming nodes for PRED
     */
    @LispMethod(comment = "@return listp; the cached subsuming nodes for PRED")
    public static final SubLObject get_sbhl_cached_nodes_for_pred_alt(SubLObject pred) {
        {
            SubLObject pcase_var = pred;
            if (pcase_var.eql($$isa)) {
                return $cached_isas$.getGlobalValue();
            } else {
                if (pcase_var.eql($$genls)) {
                    return $cached_genls$.getGlobalValue();
                } else {
                    if (pcase_var.eql($$genlPreds)) {
                        return $cached_genl_predicates$.getGlobalValue();
                    } else {
                        if (pcase_var.eql($$genlInverse)) {
                            return $cached_genl_predicates$.getGlobalValue();
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return listp; the cached subsuming nodes for PRED
     */
    @LispMethod(comment = "@return listp; the cached subsuming nodes for PRED")
    public static SubLObject get_sbhl_cached_nodes_for_pred(final SubLObject pred) {
        if (pred.eql($$isa)) {
            return $cached_isas$.getGlobalValue();
        }
        if (pred.eql($$quotedIsa)) {
            return $cached_quoted_isas$.getGlobalValue();
        }
        if (pred.eql($$genls)) {
            return $cached_genls$.getGlobalValue();
        }
        if (pred.eql($$genlPreds)) {
            return $cached_genl_predicates$.getGlobalValue();
        }
        if (pred.eql($$genlInverse)) {
            return $cached_genl_predicates$.getGlobalValue();
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; Is PRED a cached-genl-predicate?
     */
    @LispMethod(comment = "@return booleanp; Is PRED a cached-genl-predicate?")
    public static final SubLObject valid_cached_predicate_p_alt(SubLObject pred) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_cache.cached_nodeP(pred, $$genlPreds);
    }

    /**
     *
     *
     * @return booleanp; Is PRED a cached-genl-predicate?
     */
    @LispMethod(comment = "@return booleanp; Is PRED a cached-genl-predicate?")
    public static SubLObject valid_cached_predicate_p(final SubLObject pred) {
        return cached_nodeP(pred, $$genlPreds);
    }

    /**
     *
     *
     * @return booleanp; Is COL a cached fort-type?
     */
    @LispMethod(comment = "@return booleanp; Is COL a cached fort-type?")
    public static final SubLObject valid_cached_fort_type_p_alt(SubLObject col) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_cache.cached_nodeP(col, $$isa);
    }

    /**
     *
     *
     * @return booleanp; Is COL a cached fort-type?
     */
    @LispMethod(comment = "@return booleanp; Is COL a cached fort-type?")
    public static SubLObject valid_cached_fort_type_p(final SubLObject col) {
        return cached_nodeP(col, $$isa);
    }

    /**
     *
     *
     * @return booleanp; is COL a cached-genl?
     */
    @LispMethod(comment = "@return booleanp; is COL a cached-genl?")
    public static final SubLObject valid_cached_genl_p_alt(SubLObject col) {
        return com.cyc.cycjava.cycl.sbhl.sbhl_cache.cached_nodeP(col, $$genls);
    }

    /**
     *
     *
     * @return booleanp; is COL a cached-genl?
     */
    @LispMethod(comment = "@return booleanp; is COL a cached-genl?")
    public static SubLObject valid_cached_genl_p(final SubLObject col) {
        return cached_nodeP(col, $$genls);
    }

    /**
     *
     *
     * @return booleanp; whether PRED has any caching.
     */
    @LispMethod(comment = "@return booleanp; whether PRED has any caching.")
    public static final SubLObject sbhl_pred_has_caching_p_alt(SubLObject pred) {
        return member_eqP(pred, $cached_preds$.getGlobalValue());
    }

    /**
     *
     *
     * @return booleanp; whether PRED has any caching.
     */
    @LispMethod(comment = "@return booleanp; whether PRED has any caching.")
    public static SubLObject sbhl_pred_has_caching_p(final SubLObject pred) {
        return subl_promotions.memberP(pred, $cached_preds$.getGlobalValue(), symbol_function(EQL), UNPROVIDED);
    }

    public static SubLObject print_sbhl_cache_misses_top_n(SubLObject n) {
        if (n == UNPROVIDED) {
            n = TEN_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (!$sbhl_cache_misses_hash_table$.getDynamicValue(thread).isHashtable()) {
            Errors.warn($str29$_sbhl_cache_misses_hash_table__is);
        } else {
            SubLObject cdolist_list_var = list_utilities.first_n(n, Sort.sort(remove_duplicates(hash_table_utilities.hash_table_values($sbhl_cache_misses_hash_table$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), $sym31$_, UNPROVIDED));
            SubLObject v = NIL;
            v = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$1 = hash_table_utilities.hash_table_keys_with_value($sbhl_cache_misses_hash_table$.getDynamicValue(thread), v, UNPROVIDED);
                SubLObject k = NIL;
                k = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    format(T, $str30$_A___S__, v, k);
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    k = cdolist_list_var_$1.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                v = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    /**
     * Accessor. @return booleanp. Determines whether a cache of the relation (PRED NODE1 NODE2) could exist and can currently be used
     */
    @LispMethod(comment = "Accessor. @return booleanp. Determines whether a cache of the relation (PRED NODE1 NODE2) could exist and can currently be used")
    public static final SubLObject sbhl_cache_use_possible_p_alt(SubLObject pred, SubLObject node1, SubLObject node2) {
        return makeBoolean((((NIL != sbhl_paranoia.check_sbhl_cachesP()) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_pred_has_caching_p(pred))) && (NIL != forts.fort_p(node1))) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_cache.cached_nodeP(node2, pred)));
    }

    /**
     * Accessor. @return booleanp. Determines whether a cache of the relation (PRED NODE1 NODE2) could exist and can currently be used
     */
    @LispMethod(comment = "Accessor. @return booleanp. Determines whether a cache of the relation (PRED NODE1 NODE2) could exist and can currently be used")
    public static SubLObject sbhl_cache_use_possible_p(final SubLObject pred, final SubLObject node1, final SubLObject node2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject result = makeBoolean((((NIL != sbhl_paranoia.check_sbhl_cachesP()) && (NIL != sbhl_pred_has_caching_p(pred))) && (NIL != forts.fort_p(node1))) && (NIL != cached_nodeP(node2, pred)));
        if ((($sbhl_cache_misses_hash_table$.getDynamicValue(thread).isHashtable() && (NIL != forts.fort_p(node1))) && (NIL != sbhl_paranoia.check_sbhl_cachesP())) && (NIL == result)) {
            hash_table_utilities.cinc_hash(list(pred, node2), $sbhl_cache_misses_hash_table$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
        return result;
    }

    /**
     * Accessor. @return booleanp.
     */
    @LispMethod(comment = "Accessor. @return booleanp.")
    public static final SubLObject sbhl_cache_use_possible_for_nodes_p_alt(SubLObject pred, SubLObject nodes, SubLObject node) {
        return makeBoolean((((NIL != sbhl_paranoia.check_sbhl_cachesP()) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_pred_has_caching_p(pred))) && (NIL != every_in_list(FORT_P, nodes, UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_cache.cached_nodeP(node, pred)));
    }

    /**
     * Accessor. @return booleanp.
     */
    @LispMethod(comment = "Accessor. @return booleanp.")
    public static SubLObject sbhl_cache_use_possible_for_nodes_p(final SubLObject pred, final SubLObject nodes, final SubLObject node) {
        return makeBoolean((((NIL != sbhl_paranoia.check_sbhl_cachesP()) && (NIL != sbhl_pred_has_caching_p(pred))) && (NIL != list_utilities.every_in_list(FORT_P, nodes, UNPROVIDED))) && (NIL != cached_nodeP(node, pred)));
    }

    /**
     * Accessor. @return booleanp. Returns whether the (PRED SUBNODE NODE):MT relation is cached in the sbhl caches.
     */
    @LispMethod(comment = "Accessor. @return booleanp. Returns whether the (PRED SUBNODE NODE):MT relation is cached in the sbhl caches.")
    public static final SubLObject sbhl_cached_predicate_relation_p_alt(SubLObject pred, SubLObject subnode, SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == sbhl_paranoia.check_sbhl_cachesP()) {
                Errors.warn($str_alt33$sbhl_cached_predicate_relation_p_, $sbhl_caches_initializedP$.getGlobalValue(), sbhl_paranoia.$suspend_sbhl_cache_useP$.getDynamicValue(thread));
            }
            inference_metrics.increment_sbhl_cache_attempt_historical_count();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        result = com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_cached_relation_p(pred, subnode, node);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != result) {
                    inference_metrics.increment_sbhl_cache_success_historical_count();
                }
                return result;
            }
        }
    }

    /**
     * Accessor. @return booleanp. Returns whether the (PRED SUBNODE NODE):MT relation is cached in the sbhl caches.
     */
    @LispMethod(comment = "Accessor. @return booleanp. Returns whether the (PRED SUBNODE NODE):MT relation is cached in the sbhl caches.")
    public static SubLObject sbhl_cached_predicate_relation_p(final SubLObject pred, final SubLObject subnode, final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        inference_metrics.increment_sbhl_cache_attempt_historical_count();
        possibly_initialize_sbhl_caches_for_pred_and_node(pred, node);
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = sbhl_cached_relation_p(pred, subnode, node);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL != result) {
            inference_metrics.increment_sbhl_cache_success_historical_count();
        }
        return result;
    }

    /**
     * Accessor. @return listp. Returns the list of cached nodes that NODE is related to via PRED in the sbhl caches.
     */
    @LispMethod(comment = "Accessor. @return listp. Returns the list of cached nodes that NODE is related to via PRED in the sbhl caches.")
    public static final SubLObject sbhl_cached_relations_for_node_alt(SubLObject pred, SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        result = com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_cached_relations(pred, node);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Accessor. @return listp. Returns the list of cached nodes that NODE is related to via PRED in the sbhl caches.
     */
    @LispMethod(comment = "Accessor. @return listp. Returns the list of cached nodes that NODE is related to via PRED in the sbhl caches.")
    public static SubLObject sbhl_cached_relations_for_node(final SubLObject pred, final SubLObject node, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
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
            result = sbhl_cached_relations(pred, node);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Accessor. Returns the list of SUBNODES, s.t. the relation (PRED SUBNODE CACHED-NODE) is cached in some mt.
     */
    @LispMethod(comment = "Accessor. Returns the list of SUBNODES, s.t. the relation (PRED SUBNODE CACHED-NODE) is cached in some mt.")
    public static final SubLObject sbhl_all_subnodes_for_cached_node_alt(SubLObject pred, SubLObject cached_node) {
        return dictionary.dictionary_keys(dictionary.dictionary_lookup(com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_sbhl_cache_for_pred(pred), cached_node, UNPROVIDED));
    }

    /**
     * Accessor. Returns the list of SUBNODES, s.t. the relation (PRED SUBNODE CACHED-NODE) is cached in some mt.
     */
    @LispMethod(comment = "Accessor. Returns the list of SUBNODES, s.t. the relation (PRED SUBNODE CACHED-NODE) is cached in some mt.")
    public static SubLObject sbhl_all_subnodes_for_cached_node(final SubLObject pred, final SubLObject cached_node) {
        return dictionary.dictionary_keys(dictionary.dictionary_lookup(get_sbhl_cache_for_pred(pred), cached_node, UNPROVIDED));
    }

    public static final SubLObject sbhl_cached_relation_p_alt(SubLObject pred, SubLObject subnode, SubLObject node) {
        return NIL != mt_relevance_macros.all_mts_are_relevantP() ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_cache.cached_all_mts_relation_p(pred, subnode, node))) : com.cyc.cycjava.cycl.sbhl.sbhl_cache.cached_relation_p(pred, subnode, node);
    }

    public static SubLObject sbhl_cached_relation_p(final SubLObject pred, final SubLObject subnode, final SubLObject node) {
        return NIL != mt_relevance_macros.all_mts_are_relevantP() ? cached_all_mts_relation_p(pred, subnode, node) : cached_relation_p(pred, subnode, node);
    }

    public static final SubLObject sbhl_cached_relations_alt(SubLObject pred, SubLObject node) {
        return NIL != mt_relevance_macros.all_mts_are_relevantP() ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_cache.cached_all_mts_relations_for_node(pred, node))) : com.cyc.cycjava.cycl.sbhl.sbhl_cache.cached_relations_for_node(pred, node);
    }

    public static SubLObject sbhl_cached_relations(final SubLObject pred, final SubLObject node) {
        return NIL != mt_relevance_macros.all_mts_are_relevantP() ? cached_all_mts_relations_for_node(pred, node) : cached_relations_for_node(pred, node);
    }

    /**
     * Accessor. @return sbhl-cache-p; The cached relations associated with PRED.
     */
    @LispMethod(comment = "Accessor. @return sbhl-cache-p; The cached relations associated with PRED.")
    public static final SubLObject get_sbhl_cache_for_pred_alt(SubLObject pred) {
        {
            SubLObject pcase_var = pred;
            if (pcase_var.eql($$isa)) {
                return $isa_cache$.getGlobalValue();
            } else {
                if (pcase_var.eql($$genlPreds)) {
                    return $genl_predicate_cache$.getGlobalValue();
                } else {
                    if (pcase_var.eql($$genlInverse)) {
                        return $genl_inverse_cache$.getGlobalValue();
                    } else {
                        if (pcase_var.eql($$genls)) {
                            return $genls_cache$.getGlobalValue();
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        }
    }

    /**
     * Accessor. @return sbhl-cache-p; The cached relations associated with PRED.
     */
    @LispMethod(comment = "Accessor. @return sbhl-cache-p; The cached relations associated with PRED.")
    public static SubLObject get_sbhl_cache_for_pred(final SubLObject pred) {
        possibly_initialize_sbhl_caches_for_pred(pred);
        return get_sbhl_cache_for_pred_int(pred);
    }

    public static SubLObject get_sbhl_cache_for_pred_int(final SubLObject pred) {
        if (pred.eql($$isa)) {
            return $isa_cache$.getGlobalValue();
        }
        if (pred.eql($$quotedIsa)) {
            return $quoted_isa_cache$.getGlobalValue();
        }
        if (pred.eql($$genlPreds)) {
            return $genl_predicate_cache$.getGlobalValue();
        }
        if (pred.eql($$genlInverse)) {
            return $genl_inverse_cache$.getGlobalValue();
        }
        if (pred.eql($$genls)) {
            return $genls_cache$.getGlobalValue();
        }
        return NIL;
    }

    /**
     * Accessor. @return listp; the list of mts for the cached (PRED SUBNODE NODE) relations.
     */
    @LispMethod(comment = "Accessor. @return listp; the list of mts for the cached (PRED SUBNODE NODE) relations.")
    public static final SubLObject get_mts_for_cached_sbhl_relation_alt(SubLObject pred, SubLObject subnode, SubLObject node) {
        SubLTrampolineFile.checkType(pred, SBHL_PREDICATE_P);
        {
            SubLObject v_cache = com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_sbhl_cache_for_pred(pred);
            if (NIL != v_cache) {
                {
                    SubLObject subnode_store = dictionary.dictionary_lookup_without_values(v_cache, node, UNPROVIDED);
                    return NIL != subnode_store ? ((SubLObject) (dictionary.dictionary_lookup_without_values(subnode_store, subnode, UNPROVIDED))) : NIL;
                }
            } else {
                return NIL;
            }
        }
    }

    /**
     * Accessor. @return listp; the list of mts for the cached (PRED SUBNODE NODE) relations.
     */
    @LispMethod(comment = "Accessor. @return listp; the list of mts for the cached (PRED SUBNODE NODE) relations.")
    public static SubLObject get_mts_for_cached_sbhl_relation(final SubLObject pred, final SubLObject subnode, final SubLObject node) {
        assert NIL != sbhl_module_utilities.sbhl_predicate_p(pred) : "! sbhl_module_utilities.sbhl_predicate_p(pred) " + ("sbhl_module_utilities.sbhl_predicate_p(pred) " + "CommonSymbols.NIL != sbhl_module_utilities.sbhl_predicate_p(pred) ") + pred;
        final SubLObject v_cache = get_sbhl_cache_for_pred(pred);
        if (NIL != v_cache) {
            final SubLObject subnode_store = dictionary.dictionary_lookup_without_values(v_cache, node, UNPROVIDED);
            return NIL != subnode_store ? dictionary.dictionary_lookup_without_values(subnode_store, subnode, UNPROVIDED) : NIL;
        }
        return NIL;
    }

    /**
     * Accessor. @return booleanp; Whether the (PRED SUBNODE NODE):MT relation is valid, considering cached relations.
     */
    @LispMethod(comment = "Accessor. @return booleanp; Whether the (PRED SUBNODE NODE):MT relation is valid, considering cached relations.")
    public static final SubLObject cached_relation_p_alt(SubLObject pred, SubLObject subnode, SubLObject node) {
        return mt_relevance_macros.any_relevant_mtP(com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_mts_for_cached_sbhl_relation(pred, subnode, node));
    }

    /**
     * Accessor. @return booleanp; Whether the (PRED SUBNODE NODE):MT relation is valid, considering cached relations.
     */
    @LispMethod(comment = "Accessor. @return booleanp; Whether the (PRED SUBNODE NODE):MT relation is valid, considering cached relations.")
    public static SubLObject cached_relation_p(final SubLObject pred, final SubLObject subnode, final SubLObject node) {
        return mt_relevance_macros.any_relevant_mtP(get_mts_for_cached_sbhl_relation(pred, subnode, node));
    }

    /**
     * Iterator. Iterates over the sbhl-cache for PRED, binding CACHED-NODE-VAR for each relation (PRED SUBNODE CACHED-NODE-VAR). MTS-VAR is bound to the mts for which the relation holds.
     */
    @LispMethod(comment = "Iterator. Iterates over the sbhl-cache for PRED, binding CACHED-NODE-VAR for each relation (PRED SUBNODE CACHED-NODE-VAR). MTS-VAR is bound to the mts for which the relation holds.")
    public static final SubLObject do_sbhl_cached_relations_for_node_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt35);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject cached_node_var = NIL;
                    SubLObject mts_var = NIL;
                    SubLObject subnode = NIL;
                    SubLObject pred = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt35);
                    cached_node_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt35);
                    mts_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt35);
                    subnode = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt35);
                    pred = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject subnodes_var = $sym36$SUBNODES_VAR;
                            return list(DO_DICTIONARY, list(cached_node_var, subnodes_var, list(GET_SBHL_CACHE_FOR_PRED, pred)), list(PWHEN, list(DICTIONARY_P, subnodes_var), list(CLET, list(list(mts_var, list(DICTIONARY_LOOKUP, subnodes_var, subnode))), listS(PWHEN, mts_var, append(body, NIL)))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt35);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Iterator. Iterates over the sbhl-cache for PRED, binding CACHED-NODE-VAR for each relation (PRED SUBNODE CACHED-NODE-VAR). MTS-VAR is bound to the mts for which the relation holds.
     */
    @LispMethod(comment = "Iterator. Iterates over the sbhl-cache for PRED, binding CACHED-NODE-VAR for each relation (PRED SUBNODE CACHED-NODE-VAR). MTS-VAR is bound to the mts for which the relation holds.")
    public static SubLObject do_sbhl_cached_relations_for_node(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list33);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject cached_node_var = NIL;
        SubLObject mts_var = NIL;
        SubLObject subnode = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list33);
        cached_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list33);
        mts_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list33);
        subnode = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list33);
        pred = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject subnodes_var = $sym34$SUBNODES_VAR;
            return list(DO_DICTIONARY, list(cached_node_var, subnodes_var, list(GET_SBHL_CACHE_FOR_PRED, pred)), list(PWHEN, list(DICTIONARY_P, subnodes_var), list(CLET, list(list(mts_var, list(DICTIONARY_LOOKUP, subnodes_var, subnode))), listS(PWHEN, mts_var, append(body, NIL)))));
        }
        cdestructuring_bind_error(datum, $list33);
        return NIL;
    }

    /**
     * Accessor. @return listp; The cached-nodes s.t. (PRED NODE cached-node):MT relation is valid.
     */
    @LispMethod(comment = "Accessor. @return listp; The cached-nodes s.t. (PRED NODE cached-node):MT relation is valid.")
    public static final SubLObject cached_relations_for_node_alt(SubLObject pred, SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_sbhl_cache_for_pred(pred)));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject cached_node = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject subnodes_var = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != dictionary.dictionary_p(subnodes_var)) {
                            {
                                SubLObject mts = dictionary.dictionary_lookup(subnodes_var, node, UNPROVIDED);
                                if (NIL != mts) {
                                    if (NIL != mt_relevance_macros.any_relevant_mtP(mts)) {
                                        result = cons(cached_node, result);
                                    }
                                }
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return result;
            }
        }
    }

    /**
     * Accessor. @return listp; The cached-nodes s.t. (PRED NODE cached-node):MT relation is valid.
     */
    @LispMethod(comment = "Accessor. @return listp; The cached-nodes s.t. (PRED NODE cached-node):MT relation is valid.")
    public static SubLObject cached_relations_for_node(final SubLObject pred, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(get_sbhl_cache_for_pred(pred))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject cached_node = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject subnodes_var = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != dictionary.dictionary_p(subnodes_var)) {
                final SubLObject mts = dictionary.dictionary_lookup(subnodes_var, node, UNPROVIDED);
                if ((NIL != mts) && (NIL != mt_relevance_macros.any_relevant_mtP(mts))) {
                    result = cons(cached_node, result);
                }
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }

    /**
     * Accessor. like @xref sbhl-cached-relation-p, except this looks just in the cache for an exact match for (PRED SUBNODE NODE):MT, and is not predicated on mt-relevance
     */
    @LispMethod(comment = "Accessor. like @xref sbhl-cached-relation-p, except this looks just in the cache for an exact match for (PRED SUBNODE NODE):MT, and is not predicated on mt-relevance")
    public static final SubLObject cached_relation_in_cache_p_alt(SubLObject pred, SubLObject subnode, SubLObject node, SubLObject mt) {
        return memberP(mt, dictionary.dictionary_lookup(dictionary.dictionary_lookup(com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_sbhl_cache_for_pred(pred), node, UNPROVIDED), subnode, UNPROVIDED), HLMT_EQUAL, UNPROVIDED);
    }

    /**
     * Accessor. like @xref sbhl-cached-relation-p, except this looks just in the cache for an exact match for (PRED SUBNODE NODE):MT, and is not predicated on mt-relevance
     */
    @LispMethod(comment = "Accessor. like @xref sbhl-cached-relation-p, except this looks just in the cache for an exact match for (PRED SUBNODE NODE):MT, and is not predicated on mt-relevance")
    public static SubLObject cached_relation_in_cache_p(final SubLObject pred, final SubLObject subnode, final SubLObject node, final SubLObject mt) {
        return subl_promotions.memberP(mt, dictionary.dictionary_lookup(dictionary.dictionary_lookup(get_sbhl_cache_for_pred(pred), node, UNPROVIDED), subnode, UNPROVIDED), HLMT_EQUAL, UNPROVIDED);
    }

    public static final SubLObject sbhl_pred_all_mts_cache_uses_id_index_p_alt(SubLObject pred) {
        return eq(pred, $$isa);
    }

    public static SubLObject sbhl_pred_all_mts_cache_uses_id_index_p(final SubLObject pred) {
        return eql(pred, $$isa);
    }

    public static final SubLObject sbhl_finalize_all_mts_cache_alt(SubLObject pred) {
        forts.optimize_fort_id_index(com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_sbhl_all_mts_cache_for_pred(pred));
        return NIL;
    }

    public static SubLObject sbhl_finalize_all_mts_cache(final SubLObject pred) {
        return NIL;
    }

    /**
     * Accesor. @return sbhl-all-mts-cache-; The cached all-mts relations for PRED.
     */
    @LispMethod(comment = "Accesor. @return sbhl-all-mts-cache-; The cached all-mts relations for PRED.")
    public static final SubLObject get_sbhl_all_mts_cache_for_pred_alt(SubLObject pred) {
        {
            SubLObject pcase_var = pred;
            if (pcase_var.eql($$isa)) {
                return $all_mts_isa_cache$.getGlobalValue();
            } else {
                if (pcase_var.eql($$genlPreds)) {
                    return $all_mts_genl_predicate_cache$.getGlobalValue();
                } else {
                    if (pcase_var.eql($$genlInverse)) {
                        return $all_mts_genl_inverse_cache$.getGlobalValue();
                    } else {
                        if (pcase_var.eql($$genls)) {
                            return $all_mts_genls_cache$.getGlobalValue();
                        } else {
                            return NIL;
                        }
                    }
                }
            }
        }
    }

    /**
     * Accesor. @return sbhl-all-mts-cache-; The cached all-mts relations for PRED.
     */
    @LispMethod(comment = "Accesor. @return sbhl-all-mts-cache-; The cached all-mts relations for PRED.")
    public static SubLObject get_sbhl_all_mts_cache_for_pred(final SubLObject pred) {
        possibly_initialize_sbhl_caches_for_pred(pred);
        return get_sbhl_all_mts_cache_for_pred_int(pred);
    }

    public static SubLObject get_sbhl_all_mts_cache_for_pred_int(final SubLObject pred) {
        if (pred.eql($$isa)) {
            return $all_mts_isa_cache$.getGlobalValue();
        }
        if (pred.eql($$quotedIsa)) {
            return $all_mts_quoted_isa_cache$.getGlobalValue();
        }
        if (pred.eql($$genlPreds)) {
            return $all_mts_genl_predicate_cache$.getGlobalValue();
        }
        if (pred.eql($$genlInverse)) {
            return $all_mts_genl_inverse_cache$.getGlobalValue();
        }
        if (pred.eql($$genls)) {
            return $all_mts_genls_cache$.getGlobalValue();
        }
        return NIL;
    }

    public static SubLObject possibly_initialize_sbhl_caches_for_pred(final SubLObject pred) {
        if ((NIL == get_sbhl_all_mts_cache_for_pred_int(pred)) || (NIL == get_sbhl_cache_for_pred_int(pred))) {
            initialize_sbhl_caches_for_pred(pred);
        }
        return NIL;
    }

    public static SubLObject initialize_sbhl_caches_for_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $noting_progress_delayed_mode_seconds$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $noting_progress_delayed_mode_string$.currentBinding(thread);
        try {
            $noting_progress_delayed_mode_seconds$.bind(TWO_INTEGER, thread);
            $noting_progress_delayed_mode_string$.bind(cconcatenate($$$Initializing_SBHL_cache_for_, new SubLObject[]{ format_nil.format_nil_a_no_copy(pred), $str43$_ }), thread);
            final SubLObject str = cconcatenate($$$Initializing_SBHL_cache_for_, new SubLObject[]{ format_nil.format_nil_a_no_copy(pred), $str43$_ });
            final SubLObject _prev_bind_0_$2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_1_$3 = $progress_last_pacification_time$.currentBinding(thread);
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
                reset_sbhl_all_mts_cache_for_pred(pred);
                reset_sbhl_cache_for_pred(pred);
                initialize_all_mts_caching_for_pred(pred);
                compute_sbhl_cache_from_all_mts_cache(pred);
                noting_progress_postamble();
            } finally {
                $silent_progressP$.rebind(_prev_bind_8, thread);
                $is_noting_progressP$.rebind(_prev_bind_7, thread);
                $progress_count$.rebind(_prev_bind_6, thread);
                $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                $progress_notification_count$.rebind(_prev_bind_4, thread);
                $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                $progress_last_pacification_time$.rebind(_prev_bind_1_$3, thread);
                $progress_start_time$.rebind(_prev_bind_0_$2, thread);
            }
        } finally {
            $noting_progress_delayed_mode_string$.rebind(_prev_bind_2, thread);
            $noting_progress_delayed_mode_seconds$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject possibly_initialize_sbhl_caches_for_pred_and_node(final SubLObject pred, final SubLObject node) {
        possibly_initialize_sbhl_caches_for_pred(pred);
        if (((NIL == dictionary_utilities.dictionary_has_keyP(get_sbhl_cache_for_pred_int(pred), node)) && (NIL != cached_nodeP(node, pred))) && (NIL != kb_mapping_utilities.fpred_value_in_any_mt(node, pred, TWO_INTEGER, ONE_INTEGER, UNPROVIDED))) {
            initialize_sbhl_caches_for_pred_and_node(pred, node);
        }
        return NIL;
    }

    public static SubLObject initialize_sbhl_caches_for_pred_and_node(final SubLObject pred, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (pred.eql($$isa)) {
            final SubLObject _prev_bind_0 = $noting_progress_delayed_mode_seconds$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $noting_progress_delayed_mode_string$.currentBinding(thread);
            try {
                $noting_progress_delayed_mode_seconds$.bind(TWO_INTEGER, thread);
                $noting_progress_delayed_mode_string$.bind(cconcatenate($$$Adding_, new SubLObject[]{ format_nil.format_nil_a_no_copy(node), $$$_to_SBHL_cache_for_, format_nil.format_nil_a_no_copy(pred), $str43$_ }), thread);
                final SubLObject str = cconcatenate($$$Adding_, new SubLObject[]{ format_nil.format_nil_a_no_copy(node), $$$_to_SBHL_cache_for_, format_nil.format_nil_a_no_copy(pred), $str43$_ });
                final SubLObject _prev_bind_0_$4 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$5 = $progress_last_pacification_time$.currentBinding(thread);
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
                    sbhl_cache_add_new_additional_fort_typing_collection(node);
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$5, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$4, thread);
                }
            } finally {
                $noting_progress_delayed_mode_string$.rebind(_prev_bind_2, thread);
                $noting_progress_delayed_mode_seconds$.rebind(_prev_bind_0, thread);
            }
        } else
            if (pred.eql($$quotedIsa)) {
                final SubLObject _prev_bind_0 = $noting_progress_delayed_mode_seconds$.currentBinding(thread);
                final SubLObject _prev_bind_2 = $noting_progress_delayed_mode_string$.currentBinding(thread);
                try {
                    $noting_progress_delayed_mode_seconds$.bind(TWO_INTEGER, thread);
                    $noting_progress_delayed_mode_string$.bind(cconcatenate($$$Adding_, new SubLObject[]{ format_nil.format_nil_a_no_copy(node), $$$_to_SBHL_cache_for_, format_nil.format_nil_a_no_copy(pred), $str43$_ }), thread);
                    final SubLObject str = cconcatenate($$$Adding_, new SubLObject[]{ format_nil.format_nil_a_no_copy(node), $$$_to_SBHL_cache_for_, format_nil.format_nil_a_no_copy(pred), $str43$_ });
                    final SubLObject _prev_bind_0_$5 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$6 = $progress_last_pacification_time$.currentBinding(thread);
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
                        sbhl_cache_add_new_additional_fort_typing_collection_quoted(node);
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_8, thread);
                        $is_noting_progressP$.rebind(_prev_bind_7, thread);
                        $progress_count$.rebind(_prev_bind_6, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        $progress_notification_count$.rebind(_prev_bind_4, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_1_$6, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$5, thread);
                    }
                } finally {
                    $noting_progress_delayed_mode_string$.rebind(_prev_bind_2, thread);
                    $noting_progress_delayed_mode_seconds$.rebind(_prev_bind_0, thread);
                }
            } else {
                initialize_sbhl_caches_for_pred(pred);
            }

        return NIL;
    }

    /**
     * Accessor. @return booleanp; Whether the (PRED SUBNODE NODE) relation is cached with all-mts relevance.
     */
    @LispMethod(comment = "Accessor. @return booleanp; Whether the (PRED SUBNODE NODE) relation is cached with all-mts relevance.")
    public static final SubLObject cached_all_mts_relation_p_alt(SubLObject pred, SubLObject subnode, SubLObject node) {
        {
            SubLObject pred_uses_id_indexP = com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_pred_all_mts_cache_uses_id_index_p(pred);
            SubLObject all_mts_cache = com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_sbhl_all_mts_cache_for_pred(pred);
            if (NIL == all_mts_cache) {
                Errors.error($str_alt44$All_Mts_cache_is_missing_for__A_, pred);
            }
            {
                SubLObject cached_list = (NIL != pred_uses_id_indexP) ? ((SubLObject) (com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_id_index_lookup(all_mts_cache, subnode))) : dictionary.dictionary_lookup_without_values(all_mts_cache, node, UNPROVIDED);
                return NIL != set.set_p(cached_list) ? ((SubLObject) (NIL != pred_uses_id_indexP ? ((SubLObject) (set.set_memberP(node, cached_list))) : set.set_memberP(subnode, cached_list))) : NIL;
            }
        }
    }

    /**
     * Accessor. @return booleanp; Whether the (PRED SUBNODE NODE) relation is cached with all-mts relevance.
     */
    @LispMethod(comment = "Accessor. @return booleanp; Whether the (PRED SUBNODE NODE) relation is cached with all-mts relevance.")
    public static SubLObject cached_all_mts_relation_p(final SubLObject pred, final SubLObject subnode, final SubLObject node) {
        final SubLObject pred_uses_id_indexP = sbhl_pred_all_mts_cache_uses_id_index_p(pred);
        final SubLObject all_mts_cache = get_sbhl_all_mts_cache_for_pred(pred);
        final SubLObject cached_list = (NIL != pred_uses_id_indexP) ? sbhl_id_index_lookup(all_mts_cache, subnode) : dictionary.dictionary_lookup_without_values(all_mts_cache, node, UNPROVIDED);
        return NIL != set.set_p(cached_list) ? NIL != pred_uses_id_indexP ? set.set_memberP(node, cached_list) : set.set_memberP(subnode, cached_list) : NIL;
    }

    /**
     * Accessor. @return listp; The cached-nodes s.t. (PRED NODE CACHED-NODE) relation is valid with all-mts relevance.
     */
    @LispMethod(comment = "Accessor. @return listp; The cached-nodes s.t. (PRED NODE CACHED-NODE) relation is valid with all-mts relevance.")
    public static final SubLObject cached_all_mts_relations_for_node_alt(SubLObject pred, SubLObject node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_pred_all_mts_cache_uses_id_index_p(pred)) {
                {
                    SubLObject relation_set = com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_id_index_lookup(com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_sbhl_all_mts_cache_for_pred(pred), node);
                    return NIL != set.set_p(relation_set) ? ((SubLObject) (set.set_element_list(relation_set))) : NIL;
                }
            } else {
                {
                    SubLObject cached_relations = NIL;
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_sbhl_all_mts_cache_for_pred(pred)));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject cached_node = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject subnodes = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != set.set_memberP(node, subnodes)) {
                                cached_relations = cons(cached_node, cached_relations);
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    return cached_relations;
                }
            }
        }
    }

    /**
     * Accessor. @return listp; The cached-nodes s.t. (PRED NODE CACHED-NODE) relation is valid with all-mts relevance.
     */
    @LispMethod(comment = "Accessor. @return listp; The cached-nodes s.t. (PRED NODE CACHED-NODE) relation is valid with all-mts relevance.")
    public static SubLObject cached_all_mts_relations_for_node(final SubLObject pred, final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sbhl_pred_all_mts_cache_uses_id_index_p(pred)) {
            final SubLObject relation_set = sbhl_id_index_lookup(get_sbhl_all_mts_cache_for_pred(pred), node);
            return NIL != set.set_p(relation_set) ? set.set_element_list(relation_set) : NIL;
        }
        SubLObject cached_relations = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(get_sbhl_all_mts_cache_for_pred(pred))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject cached_node = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject subnodes = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != set.set_memberP(node, subnodes)) {
                cached_relations = cons(cached_node, cached_relations);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return cached_relations;
    }

    /**
     * Iterator.  Iterates over the all-mts sbhl-cahce for PRED, binding LINK-NODE-VAR to the cached subsumption nodes, and SUB-NODE-VAR to the nodes subsumed by it.
     */
    @LispMethod(comment = "Iterator.  Iterates over the all-mts sbhl-cahce for PRED, binding LINK-NODE-VAR to the cached subsumption nodes, and SUB-NODE-VAR to the nodes subsumed by it.")
    public static final SubLObject do_sbhl_cached_all_mts_relations_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt45);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject link_node_var = NIL;
                    SubLObject subnode_var = NIL;
                    SubLObject pred = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt45);
                    link_node_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt45);
                    subnode_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt45);
                    pred = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject subnodes = $sym46$SUBNODES;
                            SubLObject nodes = $sym47$NODES;
                            SubLObject v_cache = $sym48$CACHE;
                            return list(CLET, list(list(v_cache, list(GET_SBHL_ALL_MTS_CACHE_FOR_PRED, pred))), list(PIF, list(FORT_ID_INDEX_P, v_cache), list(DO_FORT_ID_INDEX, list(subnode_var, nodes, v_cache), listS(DO_SET, list(link_node_var, nodes), append(body, NIL))), list(DO_DICTIONARY, list(link_node_var, subnodes, v_cache), listS(DO_SET, list(subnode_var, subnodes), append(body, NIL)))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt45);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Iterator.  Iterates over the all-mts sbhl-cahce for PRED, binding LINK-NODE-VAR to the cached subsumption nodes, and SUB-NODE-VAR to the nodes subsumed by it.
     */
    @LispMethod(comment = "Iterator.  Iterates over the all-mts sbhl-cahce for PRED, binding LINK-NODE-VAR to the cached subsumption nodes, and SUB-NODE-VAR to the nodes subsumed by it.")
    public static SubLObject do_sbhl_cached_all_mts_relations(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list46);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject link_node_var = NIL;
        SubLObject subnode_var = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list46);
        link_node_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list46);
        subnode_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list46);
        pred = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject subnodes = $sym47$SUBNODES;
            final SubLObject nodes = $sym48$NODES;
            final SubLObject v_cache = $sym49$CACHE;
            return list(CLET, list(list(v_cache, list(GET_SBHL_ALL_MTS_CACHE_FOR_PRED, pred))), list(PIF, list(FORT_ID_INDEX_P, v_cache), list(DO_FORT_ID_INDEX, list(subnode_var, nodes, v_cache), listS(DO_SET, list(link_node_var, nodes), append(body, NIL))), list(DO_DICTIONARY, list(link_node_var, subnodes, v_cache), listS(DO_SET, list(subnode_var, subnodes), append(body, NIL)))));
        }
        cdestructuring_bind_error(datum, $list46);
        return NIL;
    }

    /**
     * Iterator. Iterates over the CACHED-LINK-NODE nodes for relations (PRED SUBNODE CACHED-LINK-NODE):MT
     */
    @LispMethod(comment = "Iterator. Iterates over the CACHED-LINK-NODE nodes for relations (PRED SUBNODE CACHED-LINK-NODE):MT")
    public static final SubLObject do_sbhl_cached_link_nodes_for_node_in_mt_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt53);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject cached_link_node = NIL;
                    SubLObject pred = NIL;
                    SubLObject subnode = NIL;
                    SubLObject mt = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt53);
                    cached_link_node = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt53);
                    pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt53);
                    subnode = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt53);
                    mt = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject v_cache = $sym54$CACHE;
                            SubLObject cached_nodes_store = $sym55$CACHED_NODES_STORE;
                            return list(CLET, list(list(v_cache, list(GET_SBHL_CACHE_FOR_PRED, pred))), list(DO_DICTIONARY, list(cached_link_node, cached_nodes_store, v_cache), listS(PWHEN, list($sym56$MEMBER_, mt, list(DICTIONARY_LOOKUP, cached_nodes_store, subnode)), append(body, NIL))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt53);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Iterator. Iterates over the CACHED-LINK-NODE nodes for relations (PRED SUBNODE CACHED-LINK-NODE):MT
     */
    @LispMethod(comment = "Iterator. Iterates over the CACHED-LINK-NODE nodes for relations (PRED SUBNODE CACHED-LINK-NODE):MT")
    public static SubLObject do_sbhl_cached_link_nodes_for_node_in_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list54);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject cached_link_node = NIL;
        SubLObject pred = NIL;
        SubLObject subnode = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list54);
        cached_link_node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list54);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list54);
        subnode = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list54);
        mt = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject v_cache = $sym55$CACHE;
            final SubLObject cached_nodes_store = $sym56$CACHED_NODES_STORE;
            return list(CLET, list(list(v_cache, list(GET_SBHL_CACHE_FOR_PRED, pred))), list(DO_DICTIONARY, list(cached_link_node, cached_nodes_store, v_cache), listS(PWHEN, list($sym57$MEMBER_, mt, list(DICTIONARY_LOOKUP, cached_nodes_store, subnode)), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list54);
        return NIL;
    }

    /**
     * Iterator. Iterates over the CACHED-LINK-NODE nodes for all-mt relations of (PRED SUBNODE CACHED-LINK-NODE)
     */
    @LispMethod(comment = "Iterator. Iterates over the CACHED-LINK-NODE nodes for all-mt relations of (PRED SUBNODE CACHED-LINK-NODE)")
    public static final SubLObject do_sbhl_cached_all_mts_relations_for_node_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt57);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject cached_link_node = NIL;
                    SubLObject pred = NIL;
                    SubLObject subnode = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt57);
                    cached_link_node = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt57);
                    pred = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt57);
                    subnode = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject v_cache = $sym58$CACHE;
                            SubLObject subnodes = $sym59$SUBNODES;
                            return list(CLET, list(list(v_cache, list(GET_SBHL_ALL_MTS_CACHE_FOR_PRED, pred))), list(PIF, list(SBHL_PRED_ALL_MTS_CACHE_USES_ID_INDEX_P, pred), listS(DO_SET, list(cached_link_node, list(SBHL_ID_INDEX_LOOKUP, v_cache, subnode)), append(body, NIL)), list(DO_DICTIONARY, list(cached_link_node, subnodes, v_cache), listS(PWHEN, list($sym62$SET_MEMBER_, subnode, subnodes), append(body, NIL)))));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt57);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Iterator. Iterates over the CACHED-LINK-NODE nodes for all-mt relations of (PRED SUBNODE CACHED-LINK-NODE)
     */
    @LispMethod(comment = "Iterator. Iterates over the CACHED-LINK-NODE nodes for all-mt relations of (PRED SUBNODE CACHED-LINK-NODE)")
    public static SubLObject do_sbhl_cached_all_mts_relations_for_node(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject cached_link_node = NIL;
        SubLObject pred = NIL;
        SubLObject subnode = NIL;
        destructuring_bind_must_consp(current, datum, $list58);
        cached_link_node = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        subnode = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject v_cache = $sym59$CACHE;
            final SubLObject subnodes = $sym60$SUBNODES;
            return list(CLET, list(list(v_cache, list(GET_SBHL_ALL_MTS_CACHE_FOR_PRED, pred))), list(PIF, list(SBHL_PRED_ALL_MTS_CACHE_USES_ID_INDEX_P, pred), listS(DO_SET, list(cached_link_node, list(SBHL_ID_INDEX_LOOKUP, v_cache, subnode)), append(body, NIL)), list(DO_DICTIONARY, list(cached_link_node, subnodes, v_cache), listS(PWHEN, list($sym63$SET_MEMBER_, subnode, subnodes), append(body, NIL)))));
        }
        cdestructuring_bind_error(datum, $list58);
        return NIL;
    }

    public static final SubLObject initialize_sbhl_caches_alt() {
        $genl_predicate_cache$.setGlobalValue(com.cyc.cycjava.cycl.sbhl.sbhl_cache.new_sbhl_cache());
        $genl_inverse_cache$.setGlobalValue(com.cyc.cycjava.cycl.sbhl.sbhl_cache.new_sbhl_cache());
        $genls_cache$.setGlobalValue(com.cyc.cycjava.cycl.sbhl.sbhl_cache.new_sbhl_cache());
        $isa_cache$.setGlobalValue(com.cyc.cycjava.cycl.sbhl.sbhl_cache.new_sbhl_cache());
        {
            SubLObject cdolist_list_var = $list_alt63;
            SubLObject pred = NIL;
            for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                if (NIL != pred) {
                    {
                        SubLObject set_contents_var = set.do_set_internal(com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_cached_nodes_set_for_pred(pred));
                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                        SubLObject state = NIL;
                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                            {
                                SubLObject node = set_contents.do_set_contents_next(basis_object, state);
                                if (NIL != set_contents.do_set_contents_element_validP(state, node)) {
                                    {
                                        SubLObject table = com.cyc.cycjava.cycl.sbhl.sbhl_cache.new_sbhl_sub_cache();
                                        dictionary.dictionary_enter(com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_sbhl_cache_for_pred(pred), node, table);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject initialize_sbhl_caches() {
        reset_sbhl_cache_for_pred($$genlPreds);
        reset_sbhl_cache_for_pred($$genlInverse);
        reset_sbhl_cache_for_pred($$genls);
        reset_sbhl_cache_for_pred($$isa);
        reset_sbhl_cache_for_pred($$quotedIsa);
        SubLObject cdolist_list_var = $list64;
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != pred) {
                final SubLObject set_var = get_cached_nodes_set_for_pred(pred);
                final SubLObject set_contents_var = set.do_set_internal(set_var);
                SubLObject basis_object;
                SubLObject state;
                SubLObject node;
                SubLObject table;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    node = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, node)) {
                        table = new_sbhl_sub_cache();
                        dictionary.dictionary_enter(get_sbhl_cache_for_pred_int(pred), node, table);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject reset_sbhl_cache_for_pred(final SubLObject pred) {
        if (pred.eql($$isa)) {
            $isa_cache$.setGlobalValue(new_sbhl_cache());
        } else
            if (pred.eql($$quotedIsa)) {
                $quoted_isa_cache$.setGlobalValue(new_sbhl_cache());
            } else
                if (pred.eql($$genlPreds)) {
                    $genl_predicate_cache$.setGlobalValue(new_sbhl_cache());
                } else
                    if (pred.eql($$genlInverse)) {
                        $genl_inverse_cache$.setGlobalValue(new_sbhl_cache());
                    } else
                        if (pred.eql($$genls)) {
                            $genls_cache$.setGlobalValue(new_sbhl_cache());
                        }




        return NIL;
    }

    public static final SubLObject initialize_all_mts_sbhl_caches_alt() {
        $all_mts_genl_predicate_cache$.setGlobalValue(com.cyc.cycjava.cycl.sbhl.sbhl_cache.new_sbhl_cache());
        $all_mts_genl_inverse_cache$.setGlobalValue(com.cyc.cycjava.cycl.sbhl.sbhl_cache.new_sbhl_cache());
        $all_mts_genls_cache$.setGlobalValue(com.cyc.cycjava.cycl.sbhl.sbhl_cache.new_sbhl_cache());
        $all_mts_isa_cache$.setGlobalValue(forts.new_fort_id_index());
        com.cyc.cycjava.cycl.sbhl.sbhl_cache.initialize_implicit_fort_type_mapping();
        return NIL;
    }

    public static SubLObject initialize_all_mts_sbhl_caches() {
        reset_sbhl_all_mts_cache_for_pred($$genlPreds);
        reset_sbhl_all_mts_cache_for_pred($$genlInverse);
        reset_sbhl_all_mts_cache_for_pred($$genls);
        reset_sbhl_all_mts_cache_for_pred($$isa);
        reset_sbhl_all_mts_cache_for_pred($$quotedIsa);
        initialize_implicit_fort_type_mapping();
        return NIL;
    }

    public static SubLObject reset_sbhl_all_mts_cache_for_pred(final SubLObject pred) {
        if (pred.eql($$isa)) {
            $all_mts_isa_cache$.setGlobalValue(forts.new_fort_id_index());
        } else
            if (pred.eql($$quotedIsa)) {
                $all_mts_quoted_isa_cache$.setGlobalValue(new_sbhl_cache());
            } else
                if (pred.eql($$genlPreds)) {
                    $all_mts_genl_predicate_cache$.setGlobalValue(new_sbhl_cache());
                } else
                    if (pred.eql($$genlInverse)) {
                        $all_mts_genl_inverse_cache$.setGlobalValue(new_sbhl_cache());
                    } else
                        if (pred.eql($$genls)) {
                            $all_mts_genls_cache$.setGlobalValue(new_sbhl_cache());
                        }




        return NIL;
    }

    public static final SubLObject new_sbhl_cache_alt() {
        return dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject new_sbhl_cache() {
        return dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
    }

    public static final SubLObject new_sbhl_sub_cache_alt() {
        return dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject new_sbhl_sub_cache() {
        return dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
    }

    public static final SubLObject initialize_implicit_fort_type_mapping_alt() {
        $implicit_fort_type_mapping$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        dictionary.dictionary_enter($implicit_fort_type_mapping$.getGlobalValue(), $$Relation, list($$Predicate, $$Function_Denotational, $$LogicalConnective, $$Quantifier));
        return $implicit_fort_type_mapping$.getGlobalValue();
    }

    public static SubLObject initialize_implicit_fort_type_mapping() {
        $implicit_fort_type_mapping$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
        dictionary.dictionary_enter($implicit_fort_type_mapping$.getGlobalValue(), $$Relation, list($$Predicate, $$Function_Denotational, $$LogicalConnective, $$Quantifier));
        return $implicit_fort_type_mapping$.getGlobalValue();
    }

    /**
     * The Big Initializer.
     */
    @LispMethod(comment = "The Big Initializer.")
    public static final SubLObject initialize_all_sbhl_caching_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                try {
                    system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.initialize_sbhl_caches();
                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.initialize_all_mts_sbhl_caches();
                    {
                        SubLObject _prev_bind_0_1 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
                        try {
                            sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(T, thread);
                            {
                                SubLObject _prev_bind_0_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                    {
                                        SubLObject list_var = $list_alt71;
                                        $progress_note$.setDynamicValue($str_alt72$Computing_all_mts_SBHL_caches_, thread);
                                        $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                        $progress_total$.setDynamicValue(length(list_var), thread);
                                        $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                        {
                                            SubLObject _prev_bind_0_3 = $last_percent_progress_index$.currentBinding(thread);
                                            SubLObject _prev_bind_1_4 = $last_percent_progress_prediction$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                            try {
                                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                $last_percent_progress_prediction$.bind(NIL, thread);
                                                $within_noting_percent_progress$.bind(T, thread);
                                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                                {
                                                    SubLObject csome_list_var = list_var;
                                                    SubLObject pred = NIL;
                                                    for (pred = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
                                                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                        com.cyc.cycjava.cycl.sbhl.sbhl_cache.initialize_all_mts_caching_for_pred(pred);
                                                        if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_pred_all_mts_cache_uses_id_index_p(pred)) {
                                                            com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_finalize_all_mts_cache(pred);
                                                        }
                                                    }
                                                }
                                                noting_percent_progress_postamble();
                                            } finally {
                                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                $last_percent_progress_prediction$.rebind(_prev_bind_1_4, thread);
                                                $last_percent_progress_index$.rebind(_prev_bind_0_3, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_2, thread);
                                }
                            }
                            {
                                SubLObject list_var = $list_alt63;
                                $progress_note$.setDynamicValue($str_alt73$Computing_SBHL_caches_from_all_mt, thread);
                                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                $progress_total$.setDynamicValue(length(list_var), thread);
                                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                {
                                    SubLObject _prev_bind_0_5 = $last_percent_progress_index$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                        $last_percent_progress_prediction$.bind(NIL, thread);
                                        $within_noting_percent_progress$.bind(T, thread);
                                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                        {
                                            SubLObject csome_list_var = list_var;
                                            SubLObject pred = NIL;
                                            for (pred = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
                                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                com.cyc.cycjava.cycl.sbhl.sbhl_cache.compute_sbhl_cache_from_all_mts_cache(pred);
                                            }
                                        }
                                        noting_percent_progress_postamble();
                                    } finally {
                                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                        $last_percent_progress_index$.rebind(_prev_bind_0_5, thread);
                                    }
                                }
                            }
                        } finally {
                            sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_0_1, thread);
                        }
                    }
                } finally {
                    system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_0, thread);
                }
            }
            $sbhl_caches_initializedP$.setGlobalValue(T);
            return NIL;
        }
    }

    /**
     * The Big Initializer.
     */
    @LispMethod(comment = "The Big Initializer.")
    public static SubLObject initialize_all_sbhl_caching() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        try {
            system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
            initialize_all_mts_sbhl_caches();
            initialize_sbhl_caches();
            SubLObject list_var = $list64;
            final SubLObject _prev_bind_0_$8 = $progress_note$.currentBinding(thread);
            SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str70$Computing_all_mts_SBHL_caches_, thread);
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
                        initialize_all_mts_caching_for_pred(pred);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        pred = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
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
                $progress_note$.rebind(_prev_bind_0_$8, thread);
            }
            list_var = $list64;
            final SubLObject _prev_bind_0_$10 = $progress_note$.currentBinding(thread);
            _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            _prev_bind_3 = $progress_total$.currentBinding(thread);
            _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str72$Computing_SBHL_caches_from_all_mt, thread);
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
                        compute_sbhl_cache_from_all_mts_cache(pred);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        pred = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
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
                $progress_note$.rebind(_prev_bind_0_$10, thread);
            }
        } finally {
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_0, thread);
        }
        $sbhl_caches_initializedP$.setGlobalValue(T);
        return NIL;
    }

    public static final SubLObject initialize_all_mts_caching_for_pred_alt(SubLObject pred) {
        {
            SubLObject pcase_var = pred;
            if (pcase_var.eql($$genlPreds)) {
                com.cyc.cycjava.cycl.sbhl.sbhl_cache.initialize_all_mts_cache_for_genl_preds_and_inverse();
            } else {
                if (pcase_var.eql($$genls)) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.initialize_all_mts_cache_for_genls();
                } else {
                    if (pcase_var.eql($$isa)) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_cache.initialize_all_mts_cache_for_isa();
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject initialize_all_mts_caching_for_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(T, thread);
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (pred.eql($$genlPreds) || pred.eql($$genlInverse)) {
                initialize_all_mts_cache_for_genl_preds_and_inverse();
            } else
                if (pred.eql($$genls)) {
                    initialize_all_mts_cache_for_genls();
                } else
                    if (pred.eql($$isa)) {
                        initialize_all_mts_cache_for_isa();
                    } else
                        if (pred.eql($$quotedIsa)) {
                            initialize_all_mts_cache_for_quoted_isa();
                        }



        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != sbhl_pred_all_mts_cache_uses_id_index_p(pred)) {
            sbhl_finalize_all_mts_cache(pred);
        }
        return NIL;
    }

    public static final SubLObject compute_sbhl_cache_from_all_mts_cache_alt(SubLObject pred) {
        {
            SubLObject pcase_var = pred;
            if (pcase_var.eql($$genlPreds)) {
                com.cyc.cycjava.cycl.sbhl.sbhl_cache.compute_cached_predicates_from_all_mts_cache();
            } else {
                if (pcase_var.eql($$genlInverse)) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.compute_cached_inverses_from_all_mts_cache();
                } else {
                    if (pcase_var.eql($$genls)) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_cache.compute_cached_genls_from_all_mts_cache();
                    } else {
                        if (pcase_var.eql($$isa)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_cache.compute_cached_isas_from_all_mts_cache();
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject compute_sbhl_cache_from_all_mts_cache(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(T, thread);
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (pred.eql($$genlPreds)) {
                compute_cached_predicates_from_all_mts_cache();
            } else
                if (pred.eql($$genlInverse)) {
                    compute_cached_inverses_from_all_mts_cache();
                } else
                    if (pred.eql($$genls)) {
                        compute_cached_genls_from_all_mts_cache();
                    } else
                        if (pred.eql($$isa)) {
                            compute_cached_isas_from_all_mts_cache();
                        } else
                            if (pred.eql($$quotedIsa)) {
                                compute_cached_quoted_isas_from_all_mts_cache();
                            }




        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Modifier. Caches the (PRED SUBNODE NODE):MT relation in the normal and all-mts caches.
     */
    @LispMethod(comment = "Modifier. Caches the (PRED SUBNODE NODE):MT relation in the normal and all-mts caches.")
    public static final SubLObject extend_sbhl_caches_alt(SubLObject pred, SubLObject node, SubLObject subnode, SubLObject mt) {
        com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_cache(pred, node, subnode, mt);
        com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_all_mts_cache(pred, node, subnode);
        return NIL;
    }

    /**
     * Modifier. Caches the (PRED SUBNODE NODE):MT relation in the normal and all-mts caches.
     */
    @LispMethod(comment = "Modifier. Caches the (PRED SUBNODE NODE):MT relation in the normal and all-mts caches.")
    public static SubLObject extend_sbhl_caches(final SubLObject pred, final SubLObject node, final SubLObject subnode, final SubLObject mt) {
        add_to_sbhl_cache(pred, node, subnode, mt);
        add_to_sbhl_all_mts_cache(pred, node, subnode);
        return NIL;
    }

    /**
     * Modifier. Adds the MT info to the (PRED SUBNODE NODE) cache.
     */
    @LispMethod(comment = "Modifier. Adds the MT info to the (PRED SUBNODE NODE) cache.")
    public static final SubLObject add_to_sbhl_cache_alt(SubLObject pred, SubLObject node, SubLObject subnode, SubLObject mt) {
        {
            SubLObject v_cache = com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_sbhl_cache_for_pred(pred);
            SubLObject subnodes = dictionary.dictionary_lookup(v_cache, node, UNPROVIDED);
            if (NIL == subnodes) {
                subnodes = dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
            }
            dictionary_pushnew(subnodes, subnode, mt, symbol_function(EQ), UNPROVIDED);
            dictionary.dictionary_enter(v_cache, node, subnodes);
        }
        return NIL;
    }

    /**
     * Modifier. Adds the MT info to the (PRED SUBNODE NODE) cache.
     */
    @LispMethod(comment = "Modifier. Adds the MT info to the (PRED SUBNODE NODE) cache.")
    public static SubLObject add_to_sbhl_cache(final SubLObject pred, final SubLObject node, final SubLObject subnode, final SubLObject mt) {
        final SubLObject v_cache = get_sbhl_cache_for_pred(pred);
        SubLObject subnodes = dictionary.dictionary_lookup(v_cache, node, UNPROVIDED);
        if (NIL == subnodes) {
            subnodes = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
        }
        dictionary_utilities.dictionary_pushnew(subnodes, subnode, mt, symbol_function(EQL), UNPROVIDED);
        dictionary.dictionary_enter(v_cache, node, subnodes);
        return NIL;
    }

    /**
     * Modifier. Adds info to the (PRED SUBNODE NODE) cache for all relevant Mts.
     * Returns the list of relevant Mts.
     */
    @LispMethod(comment = "Modifier. Adds info to the (PRED SUBNODE NODE) cache for all relevant Mts.\r\nReturns the list of relevant Mts.\nModifier. Adds info to the (PRED SUBNODE NODE) cache for all relevant Mts.\nReturns the list of relevant Mts.")
    public static final SubLObject add_to_sbhl_cache_for_relevant_mts_alt(SubLObject pred, SubLObject node, SubLObject subnode) {
        {
            SubLObject mts = sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module(pred), subnode, node, UNPROVIDED);
            SubLObject cdolist_list_var = mts;
            SubLObject mt = NIL;
            for (mt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mt = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_cache(pred, node, subnode, mt);
            }
            return mts;
        }
    }

    /**
     * Modifier. Adds info to the (PRED SUBNODE NODE) cache for all relevant Mts.
     * Returns the list of relevant Mts.
     */
    @LispMethod(comment = "Modifier. Adds info to the (PRED SUBNODE NODE) cache for all relevant Mts.\r\nReturns the list of relevant Mts.\nModifier. Adds info to the (PRED SUBNODE NODE) cache for all relevant Mts.\nReturns the list of relevant Mts.")
    public static SubLObject add_to_sbhl_cache_for_relevant_mts(final SubLObject pred, final SubLObject node, final SubLObject subnode) {
        SubLObject cdolist_list_var;
        final SubLObject mts = cdolist_list_var = sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module(pred), subnode, node, UNPROVIDED);
        SubLObject mt = NIL;
        mt = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            add_to_sbhl_cache(pred, node, subnode, mt);
            cdolist_list_var = cdolist_list_var.rest();
            mt = cdolist_list_var.first();
        } 
        return mts;
    }

    /**
     * Modifier. Adds the (PRED SUBNODE NODE) info to the all-mts cache.
     */
    @LispMethod(comment = "Modifier. Adds the (PRED SUBNODE NODE) info to the all-mts cache.")
    public static final SubLObject add_to_sbhl_all_mts_cache_alt(SubLObject pred, SubLObject node, SubLObject subnode) {
        {
            SubLObject v_cache = com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_sbhl_all_mts_cache_for_pred(pred);
            if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_pred_all_mts_cache_uses_id_index_p(pred)) {
                {
                    SubLObject nodes = com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_id_index_lookup(v_cache, subnode);
                    if (NIL == nodes) {
                        nodes = set.new_set(symbol_function(EQ), UNPROVIDED);
                    }
                    set.set_add(node, nodes);
                    forts.fort_id_index_enter(v_cache, subnode, nodes);
                }
            } else {
                {
                    SubLObject subnodes = dictionary.dictionary_lookup(v_cache, node, UNPROVIDED);
                    if (NIL == subnodes) {
                        subnodes = set.new_set(symbol_function(EQ), UNPROVIDED);
                    }
                    set.set_add(subnode, subnodes);
                    dictionary.dictionary_enter(v_cache, node, subnodes);
                }
            }
        }
        return NIL;
    }

    /**
     * Modifier. Adds the (PRED SUBNODE NODE) info to the all-mts cache.
     */
    @LispMethod(comment = "Modifier. Adds the (PRED SUBNODE NODE) info to the all-mts cache.")
    public static SubLObject add_to_sbhl_all_mts_cache(final SubLObject pred, final SubLObject node, final SubLObject subnode) {
        final SubLObject v_cache = get_sbhl_all_mts_cache_for_pred(pred);
        if (NIL != sbhl_pred_all_mts_cache_uses_id_index_p(pred)) {
            SubLObject nodes = sbhl_id_index_lookup(v_cache, subnode);
            if (NIL == nodes) {
                nodes = set.new_set(symbol_function(EQL), UNPROVIDED);
            }
            set.set_add(node, nodes);
            forts.fort_id_index_enter(v_cache, subnode, nodes);
        } else {
            SubLObject subnodes = dictionary.dictionary_lookup(v_cache, node, UNPROVIDED);
            if (NIL == subnodes) {
                subnodes = set.new_set(symbol_function(EQL), UNPROVIDED);
            }
            set.set_add(subnode, subnodes);
            dictionary.dictionary_enter(v_cache, node, subnodes);
        }
        return NIL;
    }

    /**
     * Modifier. This is the main accessor for the SBHL to do cache maintainence.  It belongs in the after-addings of predicates with cached relations.
     */
    @LispMethod(comment = "Modifier. This is the main accessor for the SBHL to do cache maintainence.  It belongs in the after-addings of predicates with cached relations.")
    public static final SubLObject sbhl_cache_addition_maintainence_alt(SubLObject assertion) {
        if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_cache.recache_sbhl_cachesP()) {
            if (NIL != assertions_high.assertion_has_truth(assertion, $TRUE)) {
                {
                    SubLObject pred = assertions_high.gaf_predicate(assertion);
                    SubLObject pcase_var = pred;
                    if (pcase_var.eql($$isa)) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_cache.isa_cache_addition_maintainence(assertion);
                    } else {
                        if (pcase_var.eql($$genls)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_cache.genls_cache_addition_maintainence(assertion);
                        } else {
                            if (pcase_var.eql($$genlPreds)) {
                                com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_genl_preds_cache_addition_maintainence(assertion);
                            } else {
                                if (pcase_var.eql($$genlInverse)) {
                                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_genl_preds_cache_addition_maintainence(assertion);
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Modifier. This is the main accessor for the SBHL to do cache maintainence.  It belongs in the after-addings of predicates with cached relations.
     */
    @LispMethod(comment = "Modifier. This is the main accessor for the SBHL to do cache maintainence.  It belongs in the after-addings of predicates with cached relations.")
    public static SubLObject sbhl_cache_addition_maintainence(final SubLObject assertion) {
        if ((NIL != recache_sbhl_cachesP()) && (NIL != assertions_high.assertion_has_truth(assertion, $TRUE))) {
            final SubLObject pcase_var;
            final SubLObject pred = pcase_var = assertions_high.gaf_predicate(assertion);
            if (pcase_var.eql($$isa)) {
                isa_cache_addition_maintainence(assertion);
            } else
                if (pcase_var.eql($$quotedIsa)) {
                    quoted_isa_cache_addition_maintainence(assertion);
                } else
                    if (pcase_var.eql($$genls)) {
                        genls_cache_addition_maintainence(assertion);
                    } else
                        if (pcase_var.eql($$genlPreds)) {
                            sbhl_genl_preds_cache_addition_maintainence(assertion);
                        } else
                            if (pcase_var.eql($$genlInverse)) {
                                sbhl_genl_preds_cache_addition_maintainence(assertion);
                            }




        }
        return NIL;
    }

    /**
     * Modifier. @return booleanp; Returns whether or not there was addition to the sbhl-caches on account of adding ASSERTION.  This does the general addition maintainence for all preds.  Each particular pred may do additional addition maintainence besides this.
     */
    @LispMethod(comment = "Modifier. @return booleanp; Returns whether or not there was addition to the sbhl-caches on account of adding ASSERTION.  This does the general addition maintainence for all preds.  Each particular pred may do additional addition maintainence besides this.")
    public static final SubLObject possibly_add_to_sbhl_caches_alt(SubLObject assertion, SubLObject term2_check_pred, SubLObject cache_pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject addedP = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
                    try {
                        sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(T, thread);
                        {
                            SubLObject term1 = assertions_high.gaf_arg1(assertion);
                            SubLObject term2 = assertions_high.gaf_arg2(assertion);
                            SubLObject new_cached_relations = com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_predicate_relation_to_which_cached_nodes(term2_check_pred, term2, cache_pred);
                            SubLObject old_cached_relations = com.cyc.cycjava.cycl.sbhl.sbhl_cache.cached_all_mts_relations_for_node(cache_pred, term1);
                            SubLObject cached_relations_gained = set_difference(new_cached_relations, old_cached_relations, symbol_function(EQ), UNPROVIDED);
                            {
                                SubLObject cdolist_list_var = cached_relations_gained;
                                SubLObject new_cached_relation = NIL;
                                for (new_cached_relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_cached_relation = cdolist_list_var.first()) {
                                    addedP = T;
                                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_all_mts_cache(cache_pred, new_cached_relation, term1);
                                }
                            }
                            {
                                SubLObject cdolist_list_var = new_cached_relations;
                                SubLObject new_type = NIL;
                                for (new_type = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_type = cdolist_list_var.first()) {
                                    {
                                        SubLObject cdolist_list_var_6 = sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module(cache_pred), term1, term2, UNPROVIDED);
                                        SubLObject mt = NIL;
                                        for (mt = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , mt = cdolist_list_var_6.first()) {
                                            if (NIL == com.cyc.cycjava.cycl.sbhl.sbhl_cache.cached_relation_in_cache_p(cache_pred, term1, new_type, mt)) {
                                                addedP = T;
                                                com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_cache(cache_pred, new_type, term1, mt);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_0, thread);
                    }
                }
                return addedP;
            }
        }
    }

    /**
     * Modifier. @return booleanp; Returns whether or not there was addition to the sbhl-caches on account of adding ASSERTION.  This does the general addition maintainence for all preds.  Each particular pred may do additional addition maintainence besides this.
     */
    @LispMethod(comment = "Modifier. @return booleanp; Returns whether or not there was addition to the sbhl-caches on account of adding ASSERTION.  This does the general addition maintainence for all preds.  Each particular pred may do additional addition maintainence besides this.")
    public static SubLObject possibly_add_to_sbhl_caches(final SubLObject assertion, final SubLObject term2_check_pred, final SubLObject cache_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject addedP = NIL;
        final SubLObject _prev_bind_0 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
        try {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(T, thread);
            final SubLObject term1 = assertions_high.gaf_arg1(assertion);
            final SubLObject term2 = assertions_high.gaf_arg2(assertion);
            final SubLObject new_cached_relations = sbhl_predicate_relation_to_which_cached_nodes(term2_check_pred, term2, cache_pred);
            final SubLObject old_cached_relations = cached_all_mts_relations_for_node(cache_pred, term1);
            SubLObject cdolist_list_var;
            final SubLObject cached_relations_gained = cdolist_list_var = set_difference(new_cached_relations, old_cached_relations, symbol_function(EQL), UNPROVIDED);
            SubLObject new_cached_relation = NIL;
            new_cached_relation = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                addedP = T;
                add_to_sbhl_all_mts_cache(cache_pred, new_cached_relation, term1);
                cdolist_list_var = cdolist_list_var.rest();
                new_cached_relation = cdolist_list_var.first();
            } 
            cdolist_list_var = new_cached_relations;
            SubLObject new_type = NIL;
            new_type = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$12 = sbhl_search_what_mts.sbhl_max_floor_mts_of_predicate_paths(sbhl_module_vars.get_sbhl_module(cache_pred), term1, term2, UNPROVIDED);
                SubLObject mt = NIL;
                mt = cdolist_list_var_$12.first();
                while (NIL != cdolist_list_var_$12) {
                    if (NIL == cached_relation_in_cache_p(cache_pred, term1, new_type, mt)) {
                        addedP = T;
                        add_to_sbhl_cache(cache_pred, new_type, term1, mt);
                    }
                    cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                    mt = cdolist_list_var_$12.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                new_type = cdolist_list_var.first();
            } 
        } finally {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_0, thread);
        }
        return addedP;
    }

    /**
     * modifier. Removes the (PRED SUBNODE NODE):MT relation from the normal and (if necessary) all-mts caches.
     */
    @LispMethod(comment = "modifier. Removes the (PRED SUBNODE NODE):MT relation from the normal and (if necessary) all-mts caches.")
    public static final SubLObject retract_cached_relation_alt(SubLObject pred, SubLObject node, SubLObject subnode, SubLObject mt) {
        {
            SubLObject retracted_last_oneP = NIL;
            retracted_last_oneP = com.cyc.cycjava.cycl.sbhl.sbhl_cache.retract_from_sbhl_cache(pred, node, subnode, mt);
            if (NIL != retracted_last_oneP) {
                com.cyc.cycjava.cycl.sbhl.sbhl_cache.retract_from_sbhl_all_mts_cache(pred, node, subnode);
            }
        }
        return NIL;
    }

    /**
     * modifier. Removes the (PRED SUBNODE NODE):MT relation from the normal and (if necessary) all-mts caches.
     */
    @LispMethod(comment = "modifier. Removes the (PRED SUBNODE NODE):MT relation from the normal and (if necessary) all-mts caches.")
    public static SubLObject retract_cached_relation(final SubLObject pred, final SubLObject node, final SubLObject subnode, final SubLObject mt) {
        SubLObject retracted_last_oneP = NIL;
        retracted_last_oneP = retract_from_sbhl_cache(pred, node, subnode, mt);
        if (NIL != retracted_last_oneP) {
            retract_from_sbhl_all_mts_cache(pred, node, subnode);
        }
        return NIL;
    }

    /**
     * Modifier. @return booleanp; Removes MT from the cache for NODE, and returns T iff this was the last MT for the PRED SUBNODE NODE relation.
     */
    @LispMethod(comment = "Modifier. @return booleanp; Removes MT from the cache for NODE, and returns T iff this was the last MT for the PRED SUBNODE NODE relation.")
    public static final SubLObject retract_from_sbhl_cache_alt(SubLObject pred, SubLObject node, SubLObject subnode, SubLObject mt) {
        {
            SubLObject nodes_cache = dictionary.dictionary_lookup(com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_sbhl_cache_for_pred(pred), node, UNPROVIDED);
            SubLObject cached_mts = dictionary.dictionary_lookup(nodes_cache, subnode, UNPROVIDED);
            if ((NIL != singletonP(cached_mts)) && (mt == cached_mts.first())) {
                dictionary.dictionary_remove(nodes_cache, subnode);
                return T;
            } else {
                dictionary_remove_from_value(nodes_cache, subnode, mt, UNPROVIDED, UNPROVIDED);
                return NIL;
            }
        }
    }

    /**
     * Modifier. @return booleanp; Removes MT from the cache for NODE, and returns T iff this was the last MT for the PRED SUBNODE NODE relation.
     */
    @LispMethod(comment = "Modifier. @return booleanp; Removes MT from the cache for NODE, and returns T iff this was the last MT for the PRED SUBNODE NODE relation.")
    public static SubLObject retract_from_sbhl_cache(final SubLObject pred, final SubLObject node, final SubLObject subnode, final SubLObject mt) {
        final SubLObject nodes_cache = dictionary.dictionary_lookup(get_sbhl_cache_for_pred(pred), node, UNPROVIDED);
        final SubLObject cached_mts = dictionary.dictionary_lookup(nodes_cache, subnode, UNPROVIDED);
        if ((NIL != list_utilities.singletonP(cached_mts)) && mt.eql(cached_mts.first())) {
            dictionary.dictionary_remove(nodes_cache, subnode);
            return T;
        }
        dictionary_utilities.dictionary_remove_from_value(nodes_cache, subnode, mt, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject retract_from_sbhl_all_mts_cache_alt(SubLObject pred, SubLObject node, SubLObject subnode) {
        {
            SubLObject v_cache = com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_sbhl_all_mts_cache_for_pred(pred);
            if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_pred_all_mts_cache_uses_id_index_p(pred)) {
                {
                    SubLObject nodes = com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_id_index_lookup(v_cache, subnode);
                    set.set_remove(node, nodes);
                    if (NIL != set.set_emptyP(nodes)) {
                        forts.fort_id_index_remove(v_cache, subnode);
                    } else {
                        forts.fort_id_index_enter(v_cache, subnode, nodes);
                    }
                }
            } else {
                {
                    SubLObject subnodes = dictionary.dictionary_lookup(v_cache, node, UNPROVIDED);
                    set.set_remove(subnode, subnodes);
                    if (NIL != set.set_emptyP(subnodes)) {
                        dictionary.dictionary_remove(v_cache, node);
                    } else {
                        dictionary.dictionary_enter(v_cache, node, subnodes);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject retract_from_sbhl_all_mts_cache(final SubLObject pred, final SubLObject node, final SubLObject subnode) {
        final SubLObject v_cache = get_sbhl_all_mts_cache_for_pred(pred);
        if (NIL != sbhl_pred_all_mts_cache_uses_id_index_p(pred)) {
            final SubLObject nodes = sbhl_id_index_lookup(v_cache, subnode);
            set.set_remove(node, nodes);
            if (NIL != set.set_emptyP(nodes)) {
                forts.fort_id_index_remove(v_cache, subnode);
            } else {
                forts.fort_id_index_enter(v_cache, subnode, nodes);
            }
        } else {
            final SubLObject subnodes = dictionary.dictionary_lookup(v_cache, node, UNPROVIDED);
            set.set_remove(subnode, subnodes);
            if (NIL != set.set_emptyP(subnodes)) {
                dictionary.dictionary_remove(v_cache, node);
            } else {
                dictionary.dictionary_enter(v_cache, node, subnodes);
            }
        }
        return NIL;
    }

    /**
     * Modifier. This is the main accessor for the SBHL to do cache maintainence.  It belongs in the after-removing of predicates with cached relations.
     */
    @LispMethod(comment = "Modifier. This is the main accessor for the SBHL to do cache maintainence.  It belongs in the after-removing of predicates with cached relations.")
    public static final SubLObject sbhl_cache_removal_maintainence_alt(SubLObject assertion) {
        if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_cache.recache_sbhl_cachesP()) {
            if (NIL != assertions_high.assertion_has_truth(assertion, $TRUE)) {
                {
                    SubLObject pred = assertions_high.gaf_predicate(assertion);
                    SubLObject pcase_var = pred;
                    if (pcase_var.eql($$isa)) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_cache.isa_cache_removal_maintainence(assertion);
                    } else {
                        if (pcase_var.eql($$genls)) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_cache.genls_cache_removal_maintainence(assertion);
                        } else {
                            if (pcase_var.eql($$genlPreds)) {
                                com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_genl_preds_cache_removal_maintainence(assertion);
                            } else {
                                if (pcase_var.eql($$genlInverse)) {
                                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_genl_preds_cache_removal_maintainence(assertion);
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Modifier. This is the main accessor for the SBHL to do cache maintainence.  It belongs in the after-removing of predicates with cached relations.
     */
    @LispMethod(comment = "Modifier. This is the main accessor for the SBHL to do cache maintainence.  It belongs in the after-removing of predicates with cached relations.")
    public static SubLObject sbhl_cache_removal_maintainence(final SubLObject assertion) {
        if ((NIL != recache_sbhl_cachesP()) && (NIL != assertions_high.assertion_has_truth(assertion, $TRUE))) {
            final SubLObject pcase_var;
            final SubLObject pred = pcase_var = assertions_high.gaf_predicate(assertion);
            if (pcase_var.eql($$isa)) {
                isa_cache_removal_maintainence(assertion);
            } else
                if (pcase_var.eql($$quotedIsa)) {
                    quoted_isa_cache_removal_maintainence(assertion);
                } else
                    if (pcase_var.eql($$genls)) {
                        genls_cache_removal_maintainence(assertion);
                    } else
                        if (pcase_var.eql($$genlPreds)) {
                            sbhl_genl_preds_cache_removal_maintainence(assertion);
                        } else
                            if (pcase_var.eql($$genlInverse)) {
                                sbhl_genl_preds_cache_removal_maintainence(assertion);
                            }




        }
        return NIL;
    }

    /**
     * Modifier. @return booleanp; Returns whether or not there was removal from the sbhl-caches on account of removing ASSERTION.  This does the general removal maintainence for all preds.  Each particular pred may do additional removal maintainence besides this.
     */
    @LispMethod(comment = "Modifier. @return booleanp; Returns whether or not there was removal from the sbhl-caches on account of removing ASSERTION.  This does the general removal maintainence for all preds.  Each particular pred may do additional removal maintainence besides this.")
    public static final SubLObject possibly_remove_from_sbhl_caches_alt(SubLObject pred, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject retractedP = NIL;
                {
                    SubLObject _prev_bind_0 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
                    try {
                        sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(T, thread);
                        {
                            SubLObject term1 = assertions_high.gaf_arg1(assertion);
                            SubLObject mt = assertions_high.assertion_mt(assertion);
                            SubLObject current_cached_relations = com.cyc.cycjava.cycl.sbhl.sbhl_cache.cached_all_mts_relations_for_node(pred, term1);
                            SubLObject new_cached_relations = com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_predicate_relation_to_which_cached_nodes(pred, term1, pred);
                            SubLObject cached_relations_lost = set_difference(current_cached_relations, new_cached_relations, symbol_function(EQ), UNPROVIDED);
                            SubLObject cdolist_list_var = cached_relations_lost;
                            SubLObject lost_cached_relation = NIL;
                            for (lost_cached_relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lost_cached_relation = cdolist_list_var.first()) {
                                retractedP = T;
                                com.cyc.cycjava.cycl.sbhl.sbhl_cache.retract_from_sbhl_all_mts_cache(pred, lost_cached_relation, term1);
                            }
                            {
                                SubLObject mt_matching_isas = sbhl_link_methods.sbhl_mt_matching_link_nodes(sbhl_module_vars.get_sbhl_module(pred), term1, mt);
                                SubLObject v_cache = com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_sbhl_cache_for_pred(pred);
                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_cache));
                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject cached_relation = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        SubLObject cached_nodes_store = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != memberP(mt, dictionary.dictionary_lookup(cached_nodes_store, term1, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                                            if (!((NIL != mt_matching_isas) && (NIL != sbhl_search_methods.sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module(pred), term1, cached_relation, UNPROVIDED, UNPROVIDED)))) {
                                                retractedP = T;
                                                com.cyc.cycjava.cycl.sbhl.sbhl_cache.retract_from_sbhl_cache(pred, cached_relation, term1, mt);
                                            }
                                        }
                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                    }
                                } 
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                            }
                        }
                    } finally {
                        sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_0, thread);
                    }
                }
                return retractedP;
            }
        }
    }

    /**
     * Modifier. @return booleanp; Returns whether or not there was removal from the sbhl-caches on account of removing ASSERTION.  This does the general removal maintainence for all preds.  Each particular pred may do additional removal maintainence besides this.
     */
    @LispMethod(comment = "Modifier. @return booleanp; Returns whether or not there was removal from the sbhl-caches on account of removing ASSERTION.  This does the general removal maintainence for all preds.  Each particular pred may do additional removal maintainence besides this.")
    public static SubLObject possibly_remove_from_sbhl_caches(final SubLObject pred, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject retractedP = NIL;
        final SubLObject _prev_bind_0 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
        try {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(T, thread);
            final SubLObject term1 = assertions_high.gaf_arg1(assertion);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject current_cached_relations = cached_all_mts_relations_for_node(pred, term1);
            final SubLObject new_cached_relations = sbhl_predicate_relation_to_which_cached_nodes(pred, term1, pred);
            SubLObject cdolist_list_var;
            final SubLObject cached_relations_lost = cdolist_list_var = set_difference(current_cached_relations, new_cached_relations, symbol_function(EQL), UNPROVIDED);
            SubLObject lost_cached_relation = NIL;
            lost_cached_relation = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                retractedP = T;
                retract_from_sbhl_all_mts_cache(pred, lost_cached_relation, term1);
                cdolist_list_var = cdolist_list_var.rest();
                lost_cached_relation = cdolist_list_var.first();
            } 
            final SubLObject mt_matching_isas = sbhl_link_methods.sbhl_mt_matching_link_nodes(sbhl_module_vars.get_sbhl_module(pred), term1, mt);
            final SubLObject v_cache = get_sbhl_cache_for_pred(pred);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_cache)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject cached_relation = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject cached_nodes_store = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != subl_promotions.memberP(mt, dictionary.dictionary_lookup(cached_nodes_store, term1, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                    final SubLObject literal = make_binary_formula(pred, term1, cached_relation);
                    final SubLObject possibly_decontextualized_mt = (NIL != kb_accessors.decontextualized_literalP(literal)) ? kb_accessors.decontextualized_literal_convention_mt(literal) : mt;
                    if ((NIL == mt_matching_isas) || (NIL == sbhl_search_methods.sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module(pred), term1, cached_relation, possibly_decontextualized_mt, UNPROVIDED))) {
                        retractedP = T;
                        retract_from_sbhl_cache(pred, cached_relation, term1, possibly_decontextualized_mt);
                    }
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        } finally {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_0, thread);
        }
        return retractedP;
    }

    public static final SubLObject recache_sbhl_cachesP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != sbhl_paranoia.check_sbhl_cachesP()) && (NIL == sbhl_paranoia.$suppress_sbhl_recachingP$.getDynamicValue(thread)));
        }
    }

    public static SubLObject recache_sbhl_cachesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != sbhl_paranoia.check_sbhl_cachesP()) && (NIL == sbhl_paranoia.$suppress_sbhl_recachingP$.getDynamicValue(thread)));
    }

    public static final SubLObject already_in_sbhl_caches_p_alt(SubLObject pred, SubLObject subnode, SubLObject node, SubLObject mt) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.sbhl.sbhl_cache.cached_all_mts_relation_p(pred, subnode, node)) && (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_cache.cached_relation_in_cache_p(pred, subnode, node, mt)));
    }

    public static SubLObject already_in_sbhl_caches_p(final SubLObject pred, final SubLObject subnode, final SubLObject node, final SubLObject mt) {
        return makeBoolean((NIL != cached_all_mts_relation_p(pred, subnode, node)) && (NIL != cached_relation_in_cache_p(pred, subnode, node, mt)));
    }

    public static final SubLObject sbhl_predicate_relation_to_which_cached_nodes_alt(SubLObject pred, SubLObject node, SubLObject cache_pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cached_nodes = com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_sbhl_cached_nodes_for_pred(cache_pred);
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = sbhl_search_methods.sbhl_predicate_relation_to_which(sbhl_module_vars.get_sbhl_module(pred), node, cached_nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject sbhl_predicate_relation_to_which_cached_nodes(final SubLObject pred, final SubLObject node, final SubLObject cache_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cached_nodes = get_sbhl_cached_nodes_for_pred(cache_pred);
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = sbhl_search_methods.sbhl_predicate_relation_to_which(sbhl_module_vars.get_sbhl_module(pred), node, cached_nodes, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject sbhl_predicate_relation_to_which_cached_nodes_excluding_link_node_alt(SubLObject pred, SubLObject node, SubLObject cache_pred, SubLObject excl_link_node) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cached_nodes = com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_sbhl_cached_nodes_for_pred(cache_pred);
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = sbhl_search_methods.sbhl_predicate_relation_to_which_excluding_link_node(sbhl_module_vars.get_sbhl_module(pred), node, cached_nodes, excl_link_node, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject sbhl_predicate_relation_to_which_cached_nodes_excluding_link_node(final SubLObject pred, final SubLObject node, final SubLObject cache_pred, final SubLObject excl_link_node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject cached_nodes = get_sbhl_cached_nodes_for_pred(cache_pred);
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = sbhl_search_methods.sbhl_predicate_relation_to_which_excluding_link_node(sbhl_module_vars.get_sbhl_module(pred), node, cached_nodes, excl_link_node, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject clear_sbhl_cached_all_mts_relations_for_node_alt(SubLObject node, SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_pred_all_mts_cache_uses_id_index_p(pred)) {
                forts.fort_id_index_remove(com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_sbhl_all_mts_cache_for_pred(pred), node);
            } else {
                {
                    SubLObject v_cache = com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_sbhl_all_mts_cache_for_pred(pred);
                    SubLObject v_cache_7 = com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_sbhl_all_mts_cache_for_pred(pred);
                    if (NIL != com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_pred_all_mts_cache_uses_id_index_p(pred)) {
                        {
                            SubLObject set_contents_var = set.do_set_internal(com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_id_index_lookup(v_cache_7, node));
                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                            SubLObject state = NIL;
                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                    SubLObject link_node = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                                        {
                                            SubLObject v_set = dictionary.dictionary_lookup(v_cache, link_node, UNPROVIDED);
                                            if (NIL != v_set) {
                                                set.set_remove(node, v_set);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        {
                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_cache_7));
                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject link_node = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    SubLObject subnodes = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != set.set_memberP(node, subnodes)) {
                                        {
                                            SubLObject v_set = dictionary.dictionary_lookup(v_cache, link_node, UNPROVIDED);
                                            if (NIL != v_set) {
                                                set.set_remove(node, v_set);
                                            }
                                        }
                                    }
                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                }
                            } 
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject clear_sbhl_cached_all_mts_relations_for_node(final SubLObject node, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != sbhl_pred_all_mts_cache_uses_id_index_p(pred)) {
            forts.fort_id_index_remove(get_sbhl_all_mts_cache_for_pred(pred), node);
        } else {
            final SubLObject v_cache = get_sbhl_all_mts_cache_for_pred(pred);
            final SubLObject v_cache_$13 = get_sbhl_all_mts_cache_for_pred(pred);
            if (NIL != sbhl_pred_all_mts_cache_uses_id_index_p(pred)) {
                final SubLObject set_var = sbhl_id_index_lookup(v_cache_$13, node);
                final SubLObject set_contents_var = set.do_set_internal(set_var);
                SubLObject basis_object;
                SubLObject state;
                SubLObject link_node;
                SubLObject v_set;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    link_node = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, link_node)) {
                        v_set = dictionary.dictionary_lookup(v_cache, link_node, UNPROVIDED);
                        if (NIL != v_set) {
                            set.set_remove(node, v_set);
                        }
                    }
                }
            } else {
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_cache_$13)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject link_node2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject subnodes = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != set.set_memberP(node, subnodes)) {
                        final SubLObject v_set2 = dictionary.dictionary_lookup(v_cache, link_node2, UNPROVIDED);
                        if (NIL != v_set2) {
                            set.set_remove(node, v_set2);
                        }
                    }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
        }
        return NIL;
    }

    public static final SubLObject clear_sbhl_cached_relations_for_node_alt(SubLObject node, SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_sbhl_cache_for_pred(pred)));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject cached_node = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject subnodes = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != dictionary.dictionary_p(subnodes)) {
                            dictionary.dictionary_remove(subnodes, node);
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return NIL;
        }
    }

    public static SubLObject clear_sbhl_cached_relations_for_node(final SubLObject node, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(get_sbhl_cache_for_pred(pred))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject cached_node = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject subnodes = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != dictionary.dictionary_p(subnodes)) {
                dictionary.dictionary_remove(subnodes, node);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return NIL;
    }

    public static final SubLObject reset_cached_sbhl_relations_for_node_alt(SubLObject pred, SubLObject node, SubLObject clearP) {
        if (clearP == UNPROVIDED) {
            clearP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(T, thread);
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    if (NIL != clearP) {
                        com.cyc.cycjava.cycl.sbhl.sbhl_cache.clear_sbhl_cached_all_mts_relations_for_node(node, pred);
                        com.cyc.cycjava.cycl.sbhl.sbhl_cache.clear_sbhl_cached_relations_for_node(node, pred);
                    }
                    {
                        SubLObject cached_relations = com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_predicate_relation_to_which_cached_nodes(pred, node, pred);
                        SubLObject cdolist_list_var = cached_relations;
                        SubLObject cached_relation = NIL;
                        for (cached_relation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cached_relation = cdolist_list_var.first()) {
                            com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_all_mts_cache(pred, cached_relation, node);
                            if ((NIL != sbhl_reflexive_module_p(sbhl_module_vars.get_sbhl_module(pred))) && (cached_relation == node)) {
                                com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_cache(pred, node, node, $$UniversalVocabularyMt);
                            } else {
                                com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_cache_for_relevant_mts(pred, cached_relation, node);
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                    sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject reset_cached_sbhl_relations_for_node(final SubLObject pred, final SubLObject node, SubLObject clearP) {
        if (clearP == UNPROVIDED) {
            clearP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(T, thread);
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != clearP) {
                clear_sbhl_cached_all_mts_relations_for_node(node, pred);
                clear_sbhl_cached_relations_for_node(node, pred);
            }
            SubLObject cdolist_list_var;
            final SubLObject cached_relations = cdolist_list_var = sbhl_predicate_relation_to_which_cached_nodes(pred, node, pred);
            SubLObject cached_relation = NIL;
            cached_relation = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                add_to_sbhl_all_mts_cache(pred, cached_relation, node);
                if ((NIL != sbhl_module_utilities.sbhl_reflexive_module_p(sbhl_module_vars.get_sbhl_module(pred))) && cached_relation.eql(node)) {
                    add_to_sbhl_cache(pred, node, node, $$UniversalVocabularyMt);
                } else {
                    add_to_sbhl_cache_for_relevant_mts(pred, cached_relation, node);
                }
                cdolist_list_var = cdolist_list_var.rest();
                cached_relation = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject initialize_all_mts_cache_for_genl_preds_and_inverse_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject set_contents_var = set.do_set_internal(com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_cached_nodes_set_for_pred($$genlPreds));
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject pred = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, pred)) {
                            {
                                SubLObject node_var = pred;
                                SubLObject deck_type = (false) ? ((SubLObject) ($STACK)) : $QUEUE;
                                SubLObject recur_deck = deck.create_deck(deck_type);
                                SubLObject node_and_predicate_mode = NIL;
                                {
                                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                        {
                                            SubLObject tv_var = NIL;
                                            {
                                                SubLObject _prev_bind_0_8 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                    if (NIL != tv_var) {
                                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                {
                                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                    if (pcase_var.eql($ERROR)) {
                                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt81$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($CERROR)) {
                                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt81$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        } else {
                                                                            if (pcase_var.eql($WARN)) {
                                                                                Errors.warn($str_alt81$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                            } else {
                                                                                Errors.warn($str_alt86$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                Errors.cerror($$$continue_anyway, $str_alt81$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    {
                                                        SubLObject _prev_bind_0_9 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_10 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                        SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                            sbhl_search_vars.$sbhl_search_module_type$.bind(get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                {
                                                                    SubLObject _prev_bind_0_11 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1_12 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                    SubLObject _prev_bind_2_13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                        node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p());
                                                                        while (NIL != node_and_predicate_mode) {
                                                                            {
                                                                                SubLObject node_var_14 = node_and_predicate_mode.first();
                                                                                SubLObject predicate_mode = second(node_and_predicate_mode);
                                                                                SubLObject spec = node_var_14;
                                                                                {
                                                                                    SubLObject _prev_bind_0_15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                                        {
                                                                                            SubLObject inverse_mode_p = predicate_mode;
                                                                                            if (NIL != forts.fort_p(spec)) {
                                                                                                if (NIL != inverse_mode_p) {
                                                                                                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_all_mts_cache($$genlInverse, pred, spec);
                                                                                                } else {
                                                                                                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_all_mts_cache($$genlPreds, pred, spec);
                                                                                                }
                                                                                            }
                                                                                            {
                                                                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                                                SubLObject cdolist_list_var = accessible_modules;
                                                                                                SubLObject module_var = NIL;
                                                                                                for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                                    {
                                                                                                        SubLObject _prev_bind_0_16 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                        SubLObject _prev_bind_1_17 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                            {
                                                                                                                SubLObject node = function_terms.naut_to_nart(node_var_14);
                                                                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                    {
                                                                                                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != d_link) {
                                                                                                                            {
                                                                                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                                if (NIL != mt_links) {
                                                                                                                                    {
                                                                                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                            {
                                                                                                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                                    {
                                                                                                                                                        SubLObject _prev_bind_0_18 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                        try {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                            {
                                                                                                                                                                SubLObject iteration_state_19 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_19)) {
                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_19);
                                                                                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject _prev_bind_0_20 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                                try {
                                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                    {
                                                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                        SubLObject cdolist_list_var_21 = new_list;
                                                                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                        for (node_vars_link_node = cdolist_list_var_21.first(); NIL != cdolist_list_var_21; cdolist_list_var_21 = cdolist_list_var_21.rest() , node_vars_link_node = cdolist_list_var_21.first()) {
                                                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                } finally {
                                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_20, thread);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        iteration_state_19 = dictionary_contents.do_dictionary_contents_next(iteration_state_19);
                                                                                                                                                                    }
                                                                                                                                                                } 
                                                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_19);
                                                                                                                                                            }
                                                                                                                                                        } finally {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_18, thread);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                            }
                                                                                                                                        } 
                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt87$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                        {
                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (randomize_list(get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                            SubLObject cdolist_list_var_22 = new_list;
                                                                                                                            SubLObject generating_fn = NIL;
                                                                                                                            for (generating_fn = cdolist_list_var_22.first(); NIL != cdolist_list_var_22; cdolist_list_var_22 = cdolist_list_var_22.rest() , generating_fn = cdolist_list_var_22.first()) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_23 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                        {
                                                                                                                                            SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                            SubLObject new_list_24 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (randomize_list(link_nodes))) : link_nodes;
                                                                                                                                            SubLObject cdolist_list_var_25 = new_list_24;
                                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                                            for (node_vars_link_node = cdolist_list_var_25.first(); NIL != cdolist_list_var_25; cdolist_list_var_25 = cdolist_list_var_25.rest() , node_vars_link_node = cdolist_list_var_25.first()) {
                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_23, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } finally {
                                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_17, thread);
                                                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_16, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_15, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            node_and_predicate_mode = deck.deck_pop(recur_deck);
                                                                        } 
                                                                    } finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_13, thread);
                                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_12, thread);
                                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_11, thread);
                                                                    }
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt88$Node__a_does_not_pass_sbhl_type_t, pred, get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } finally {
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_10, thread);
                                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_9, thread);
                                                        }
                                                    }
                                                } finally {
                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_8, thread);
                                                }
                                            }
                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                        }
                                    } finally {
                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject initialize_all_mts_cache_for_genl_preds_and_inverse() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject set_var = get_cached_nodes_set_for_pred($$genlPreds);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject pred;
        SubLObject node_var;
        SubLObject deck_type;
        SubLObject recur_deck;
        SubLObject node_and_predicate_mode;
        SubLObject _prev_bind_0;
        SubLObject tv_var;
        SubLObject _prev_bind_0_$14;
        SubLObject _prev_bind_2;
        SubLObject pcase_var;
        SubLObject _prev_bind_0_$15;
        SubLObject _prev_bind_1_$16;
        SubLObject _prev_bind_3;
        SubLObject _prev_bind_4;
        SubLObject _prev_bind_5;
        SubLObject _prev_bind_0_$16;
        SubLObject _prev_bind_1_$17;
        SubLObject _prev_bind_2_$19;
        SubLObject node_var_$20;
        SubLObject predicate_mode;
        SubLObject spec;
        SubLObject _prev_bind_0_$17;
        SubLObject inverse_mode_p;
        SubLObject cdolist_list_var;
        SubLObject accessible_modules;
        SubLObject module_var;
        SubLObject _prev_bind_0_$18;
        SubLObject _prev_bind_1_$18;
        SubLObject node;
        SubLObject d_link;
        SubLObject mt_links;
        SubLObject iteration_state;
        SubLObject mt;
        SubLObject tv_links;
        SubLObject _prev_bind_0_$19;
        SubLObject iteration_state_$25;
        SubLObject tv;
        SubLObject link_nodes;
        SubLObject _prev_bind_0_$20;
        SubLObject sol;
        SubLObject set_contents_var_$27;
        SubLObject basis_object_$28;
        SubLObject state_$29;
        SubLObject node_vars_link_node;
        SubLObject csome_list_var;
        SubLObject node_vars_link_node2;
        SubLObject cdolist_list_var_$30;
        SubLObject new_list;
        SubLObject generating_fn;
        SubLObject _prev_bind_0_$21;
        SubLObject sol2;
        SubLObject link_nodes2;
        SubLObject set_contents_var_$28;
        SubLObject basis_object_$29;
        SubLObject state_$30;
        SubLObject node_vars_link_node3;
        SubLObject csome_list_var2;
        SubLObject node_vars_link_node4;
        SubLObject _prev_bind_0_$22;
        SubLObject _values;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            pred = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, pred)) {
                node_var = pred;
                deck_type = $QUEUE;
                recur_deck = deck.create_deck(deck_type);
                node_and_predicate_mode = NIL;
                _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        tv_var = NIL;
                        _prev_bind_0_$14 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str82$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str82$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str82$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str87$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str82$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            _prev_bind_0_$15 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            _prev_bind_1_$16 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    _prev_bind_0_$16 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    _prev_bind_1_$17 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    _prev_bind_2_$19 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            node_var_$20 = node_and_predicate_mode.first();
                                            predicate_mode = second(node_and_predicate_mode);
                                            spec = node_var_$20;
                                            _prev_bind_0_$17 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                inverse_mode_p = predicate_mode;
                                                if (NIL != forts.fort_p(spec)) {
                                                    if (NIL != inverse_mode_p) {
                                                        add_to_sbhl_all_mts_cache($$genlInverse, pred, spec);
                                                    } else {
                                                        add_to_sbhl_all_mts_cache($$genlPreds, pred, spec);
                                                    }
                                                }
                                                accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                module_var = NIL;
                                                module_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    _prev_bind_0_$18 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    _prev_bind_1_$18 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        node = function_terms.naut_to_nart(node_var_$20);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            _prev_bind_0_$19 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                for (iteration_state_$25 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$25); iteration_state_$25 = dictionary_contents.do_dictionary_contents_next(iteration_state_$25)) {
                                                                                    thread.resetMultipleValues();
                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$25);
                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        _prev_bind_0_$20 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                set_contents_var_$27 = set.do_set_internal(sol);
                                                                                                for (basis_object_$28 = set_contents.do_set_contents_basis_object(set_contents_var_$27), state_$29 = NIL, state_$29 = set_contents.do_set_contents_initial_state(basis_object_$28, set_contents_var_$27); NIL == set_contents.do_set_contents_doneP(basis_object_$28, state_$29); state_$29 = set_contents.do_set_contents_update_state(state_$29)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object_$28, state_$29);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state_$29, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    csome_list_var = sol;
                                                                                                    node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str88$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$20, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$25);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$19, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str89$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                new_list = cdolist_list_var_$30 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$30.first();
                                                                while (NIL != cdolist_list_var_$30) {
                                                                    _prev_bind_0_$21 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            set_contents_var_$28 = set.do_set_internal(sol2);
                                                                            for (basis_object_$29 = set_contents.do_set_contents_basis_object(set_contents_var_$28), state_$30 = NIL, state_$30 = set_contents.do_set_contents_initial_state(basis_object_$29, set_contents_var_$28); NIL == set_contents.do_set_contents_doneP(basis_object_$29, state_$30); state_$30 = set_contents.do_set_contents_update_state(state_$30)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object_$29, state_$30);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state_$30, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                csome_list_var2 = sol2;
                                                                                node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                while (NIL != csome_list_var2) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                    }
                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str88$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$21, thread);
                                                                    }
                                                                    cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                                                                    generating_fn = cdolist_list_var_$30.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$18, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$18, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$17, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$19, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$17, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$16, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str90$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$16, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$15, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$14, thread);
                        }
                    } finally {
                        _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject compute_cached_predicates_from_all_mts_cache_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_cache = com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_sbhl_all_mts_cache_for_pred($$genlPreds);
                if (NIL != forts.fort_id_index_p(v_cache)) {
                    {
                        SubLObject fii = v_cache;
                        {
                            SubLObject idx = forts.do_fii_get_constants(fii);
                            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                {
                                    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                                    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                                    SubLObject nodes = NIL;
                                    while (NIL != id) {
                                        nodes = do_id_index_state_object(idx, $SKIP, id, state_var);
                                        if (NIL != do_id_index_id_and_object_validP(id, nodes, $SKIP)) {
                                            {
                                                SubLObject spec = constants_high.find_constant_by_internal_id(id);
                                                if (NIL != spec) {
                                                    {
                                                        SubLObject set_contents_var = set.do_set_internal(nodes);
                                                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                                        SubLObject state = NIL;
                                                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                            {
                                                                SubLObject pred = set_contents.do_set_contents_next(basis_object, state);
                                                                if (NIL != set_contents.do_set_contents_element_validP(state, pred)) {
                                                                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_cache($$genlPreds, pred, pred, $$UniversalVocabularyMt);
                                                                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_cache_for_relevant_mts($$genlPreds, pred, spec);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        id = do_id_index_next_id(idx, NIL, id, state_var);
                                        state_var = do_id_index_next_state(idx, NIL, id, state_var);
                                    } 
                                }
                            }
                        }
                        {
                            SubLObject idx = forts.do_fii_get_narts(fii);
                            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                {
                                    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                                    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                                    SubLObject nodes = NIL;
                                    while (NIL != id) {
                                        nodes = do_id_index_state_object(idx, $SKIP, id, state_var);
                                        if (NIL != do_id_index_id_and_object_validP(id, nodes, $SKIP)) {
                                            {
                                                SubLObject spec = nart_handles.find_nart_by_id(id);
                                                if (NIL != spec) {
                                                    {
                                                        SubLObject set_contents_var = set.do_set_internal(nodes);
                                                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                                        SubLObject state = NIL;
                                                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                            {
                                                                SubLObject pred = set_contents.do_set_contents_next(basis_object, state);
                                                                if (NIL != set_contents.do_set_contents_element_validP(state, pred)) {
                                                                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_cache($$genlPreds, pred, pred, $$UniversalVocabularyMt);
                                                                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_cache_for_relevant_mts($$genlPreds, pred, spec);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        id = do_id_index_next_id(idx, NIL, id, state_var);
                                        state_var = do_id_index_next_state(idx, NIL, id, state_var);
                                    } 
                                }
                            }
                        }
                    }
                } else {
                    {
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_cache));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject subnodes = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject set_contents_var = set.do_set_internal(subnodes);
                                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                    SubLObject state = NIL;
                                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                        {
                                            SubLObject spec = set_contents.do_set_contents_next(basis_object, state);
                                            if (NIL != set_contents.do_set_contents_element_validP(state, spec)) {
                                                com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_cache($$genlPreds, pred, pred, $$UniversalVocabularyMt);
                                                com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_cache_for_relevant_mts($$genlPreds, pred, spec);
                                            }
                                        }
                                    }
                                }
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject compute_cached_predicates_from_all_mts_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_cache = get_sbhl_all_mts_cache_for_pred($$genlPreds);
        if (NIL != forts.fort_id_index_p(v_cache)) {
            final SubLObject fii = v_cache;
            SubLObject idx = forts.do_fii_get_constants(fii);
            if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                final SubLObject idx_$36 = idx;
                if (NIL == id_index_dense_objects_empty_p(idx_$36, $SKIP)) {
                    final SubLObject vector_var = id_index_dense_objects(idx_$36);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject nodes;
                    SubLObject spec;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject pred;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        nodes = aref(vector_var, id);
                        if ((NIL == id_index_tombstone_p(nodes)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            if (NIL != id_index_tombstone_p(nodes)) {
                                nodes = $SKIP;
                            }
                            spec = constants_high.find_constant_by_internal_id(id);
                            if (NIL != spec) {
                                set_contents_var = set.do_set_internal(nodes);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    pred = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, pred)) {
                                        add_to_sbhl_cache($$genlPreds, pred, pred, $$UniversalVocabularyMt);
                                        add_to_sbhl_cache_for_relevant_mts($$genlPreds, pred, spec);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$37 = idx;
                if (NIL == id_index_sparse_objects_empty_p(idx_$37)) {
                    final SubLObject cdohash_table = id_index_sparse_objects(idx_$37);
                    SubLObject id2 = NIL;
                    SubLObject nodes2 = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            id2 = getEntryKey(cdohash_entry);
                            nodes2 = getEntryValue(cdohash_entry);
                            final SubLObject spec2 = constants_high.find_constant_by_internal_id(id2);
                            if (NIL != spec2) {
                                final SubLObject set_contents_var2 = set.do_set_internal(nodes2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject pred2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    pred2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (NIL != set_contents.do_set_contents_element_validP(state2, pred2)) {
                                        add_to_sbhl_cache($$genlPreds, pred2, pred2, $$UniversalVocabularyMt);
                                        add_to_sbhl_cache_for_relevant_mts($$genlPreds, pred2, spec2);
                                    }
                                }
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            idx = forts.do_fii_get_narts(fii);
            if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                final SubLObject idx_$38 = idx;
                if (NIL == id_index_dense_objects_empty_p(idx_$38, $SKIP)) {
                    final SubLObject vector_var = id_index_dense_objects(idx_$38);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject nodes;
                    SubLObject spec;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject pred;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        nodes = aref(vector_var, id);
                        if ((NIL == id_index_tombstone_p(nodes)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            if (NIL != id_index_tombstone_p(nodes)) {
                                nodes = $SKIP;
                            }
                            spec = nart_handles.find_nart_by_id(id);
                            if (NIL != spec) {
                                set_contents_var = set.do_set_internal(nodes);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    pred = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, pred)) {
                                        add_to_sbhl_cache($$genlPreds, pred, pred, $$UniversalVocabularyMt);
                                        add_to_sbhl_cache_for_relevant_mts($$genlPreds, pred, spec);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$39 = idx;
                if (NIL == id_index_sparse_objects_empty_p(idx_$39)) {
                    final SubLObject cdohash_table = id_index_sparse_objects(idx_$39);
                    SubLObject id2 = NIL;
                    SubLObject nodes2 = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            id2 = getEntryKey(cdohash_entry);
                            nodes2 = getEntryValue(cdohash_entry);
                            final SubLObject spec2 = nart_handles.find_nart_by_id(id2);
                            if (NIL != spec2) {
                                final SubLObject set_contents_var2 = set.do_set_internal(nodes2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject pred2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    pred2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (NIL != set_contents.do_set_contents_element_validP(state2, pred2)) {
                                        add_to_sbhl_cache($$genlPreds, pred2, pred2, $$UniversalVocabularyMt);
                                        add_to_sbhl_cache_for_relevant_mts($$genlPreds, pred2, spec2);
                                    }
                                }
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        } else {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_cache)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject pred3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject subnodes = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject set_contents_var3 = set.do_set_internal(subnodes);
                SubLObject basis_object3;
                SubLObject state3;
                SubLObject spec3;
                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                    spec3 = set_contents.do_set_contents_next(basis_object3, state3);
                    if (NIL != set_contents.do_set_contents_element_validP(state3, spec3)) {
                        add_to_sbhl_cache($$genlPreds, pred3, pred3, $$UniversalVocabularyMt);
                        add_to_sbhl_cache_for_relevant_mts($$genlPreds, pred3, spec3);
                    }
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return NIL;
    }

    public static final SubLObject compute_cached_inverses_from_all_mts_cache_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_cache = com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_sbhl_all_mts_cache_for_pred($$genlInverse);
                if (NIL != forts.fort_id_index_p(v_cache)) {
                    {
                        SubLObject fii = v_cache;
                        {
                            SubLObject idx = forts.do_fii_get_constants(fii);
                            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                {
                                    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                                    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                                    SubLObject nodes = NIL;
                                    while (NIL != id) {
                                        nodes = do_id_index_state_object(idx, $SKIP, id, state_var);
                                        if (NIL != do_id_index_id_and_object_validP(id, nodes, $SKIP)) {
                                            {
                                                SubLObject spec = constants_high.find_constant_by_internal_id(id);
                                                if (NIL != spec) {
                                                    {
                                                        SubLObject set_contents_var = set.do_set_internal(nodes);
                                                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                                        SubLObject state = NIL;
                                                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                            {
                                                                SubLObject pred = set_contents.do_set_contents_next(basis_object, state);
                                                                if (NIL != set_contents.do_set_contents_element_validP(state, pred)) {
                                                                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_cache_for_relevant_mts($$genlInverse, pred, spec);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        id = do_id_index_next_id(idx, NIL, id, state_var);
                                        state_var = do_id_index_next_state(idx, NIL, id, state_var);
                                    } 
                                }
                            }
                        }
                        {
                            SubLObject idx = forts.do_fii_get_narts(fii);
                            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                {
                                    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                                    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                                    SubLObject nodes = NIL;
                                    while (NIL != id) {
                                        nodes = do_id_index_state_object(idx, $SKIP, id, state_var);
                                        if (NIL != do_id_index_id_and_object_validP(id, nodes, $SKIP)) {
                                            {
                                                SubLObject spec = nart_handles.find_nart_by_id(id);
                                                if (NIL != spec) {
                                                    {
                                                        SubLObject set_contents_var = set.do_set_internal(nodes);
                                                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                                        SubLObject state = NIL;
                                                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                            {
                                                                SubLObject pred = set_contents.do_set_contents_next(basis_object, state);
                                                                if (NIL != set_contents.do_set_contents_element_validP(state, pred)) {
                                                                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_cache_for_relevant_mts($$genlInverse, pred, spec);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        id = do_id_index_next_id(idx, NIL, id, state_var);
                                        state_var = do_id_index_next_state(idx, NIL, id, state_var);
                                    } 
                                }
                            }
                        }
                    }
                } else {
                    {
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_cache));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject subnodes = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject set_contents_var = set.do_set_internal(subnodes);
                                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                    SubLObject state = NIL;
                                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                        {
                                            SubLObject spec = set_contents.do_set_contents_next(basis_object, state);
                                            if (NIL != set_contents.do_set_contents_element_validP(state, spec)) {
                                                com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_cache_for_relevant_mts($$genlInverse, pred, spec);
                                            }
                                        }
                                    }
                                }
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject compute_cached_inverses_from_all_mts_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_cache = get_sbhl_all_mts_cache_for_pred($$genlInverse);
        if (NIL != forts.fort_id_index_p(v_cache)) {
            final SubLObject fii = v_cache;
            SubLObject idx = forts.do_fii_get_constants(fii);
            if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                final SubLObject idx_$40 = idx;
                if (NIL == id_index_dense_objects_empty_p(idx_$40, $SKIP)) {
                    final SubLObject vector_var = id_index_dense_objects(idx_$40);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject nodes;
                    SubLObject spec;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject pred;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        nodes = aref(vector_var, id);
                        if ((NIL == id_index_tombstone_p(nodes)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            if (NIL != id_index_tombstone_p(nodes)) {
                                nodes = $SKIP;
                            }
                            spec = constants_high.find_constant_by_internal_id(id);
                            if (NIL != spec) {
                                set_contents_var = set.do_set_internal(nodes);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    pred = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, pred)) {
                                        add_to_sbhl_cache_for_relevant_mts($$genlInverse, pred, spec);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$41 = idx;
                if (NIL == id_index_sparse_objects_empty_p(idx_$41)) {
                    final SubLObject cdohash_table = id_index_sparse_objects(idx_$41);
                    SubLObject id2 = NIL;
                    SubLObject nodes2 = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            id2 = getEntryKey(cdohash_entry);
                            nodes2 = getEntryValue(cdohash_entry);
                            final SubLObject spec2 = constants_high.find_constant_by_internal_id(id2);
                            if (NIL != spec2) {
                                final SubLObject set_contents_var2 = set.do_set_internal(nodes2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject pred2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    pred2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (NIL != set_contents.do_set_contents_element_validP(state2, pred2)) {
                                        add_to_sbhl_cache_for_relevant_mts($$genlInverse, pred2, spec2);
                                    }
                                }
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            idx = forts.do_fii_get_narts(fii);
            if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                final SubLObject idx_$42 = idx;
                if (NIL == id_index_dense_objects_empty_p(idx_$42, $SKIP)) {
                    final SubLObject vector_var = id_index_dense_objects(idx_$42);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject nodes;
                    SubLObject spec;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject pred;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        nodes = aref(vector_var, id);
                        if ((NIL == id_index_tombstone_p(nodes)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            if (NIL != id_index_tombstone_p(nodes)) {
                                nodes = $SKIP;
                            }
                            spec = nart_handles.find_nart_by_id(id);
                            if (NIL != spec) {
                                set_contents_var = set.do_set_internal(nodes);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    pred = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, pred)) {
                                        add_to_sbhl_cache_for_relevant_mts($$genlInverse, pred, spec);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$43 = idx;
                if (NIL == id_index_sparse_objects_empty_p(idx_$43)) {
                    final SubLObject cdohash_table = id_index_sparse_objects(idx_$43);
                    SubLObject id2 = NIL;
                    SubLObject nodes2 = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            id2 = getEntryKey(cdohash_entry);
                            nodes2 = getEntryValue(cdohash_entry);
                            final SubLObject spec2 = nart_handles.find_nart_by_id(id2);
                            if (NIL != spec2) {
                                final SubLObject set_contents_var2 = set.do_set_internal(nodes2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject pred2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    pred2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (NIL != set_contents.do_set_contents_element_validP(state2, pred2)) {
                                        add_to_sbhl_cache_for_relevant_mts($$genlInverse, pred2, spec2);
                                    }
                                }
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        } else {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_cache)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject pred3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject subnodes = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject set_contents_var3 = set.do_set_internal(subnodes);
                SubLObject basis_object3;
                SubLObject state3;
                SubLObject spec3;
                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                    spec3 = set_contents.do_set_contents_next(basis_object3, state3);
                    if (NIL != set_contents.do_set_contents_element_validP(state3, spec3)) {
                        add_to_sbhl_cache_for_relevant_mts($$genlInverse, pred3, spec3);
                    }
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return NIL;
    }

    public static final SubLObject sbhl_genl_preds_cache_addition_maintainence_alt(SubLObject assertion) {
        {
            SubLObject extendedP = NIL;
            SubLObject pcase_var = assertions_high.gaf_predicate(assertion);
            if (pcase_var.eql($$genlPreds)) {
                {
                    SubLObject genl_pred_extendedP = com.cyc.cycjava.cycl.sbhl.sbhl_cache.possibly_add_to_sbhl_caches(assertion, $$genlPreds, $$genlPreds);
                    SubLObject genl_inverse_extendedP = com.cyc.cycjava.cycl.sbhl.sbhl_cache.possibly_add_to_sbhl_caches(assertion, $$genlInverse, $$genlInverse);
                    extendedP = makeBoolean((NIL != genl_pred_extendedP) || (NIL != genl_inverse_extendedP));
                }
            } else {
                if (pcase_var.eql($$genlInverse)) {
                    {
                        SubLObject genl_pred_extendedP = com.cyc.cycjava.cycl.sbhl.sbhl_cache.possibly_add_to_sbhl_caches(assertion, $$genlPreds, $$genlInverse);
                        SubLObject genl_inverse_extendedP = com.cyc.cycjava.cycl.sbhl.sbhl_cache.possibly_add_to_sbhl_caches(assertion, $$genlInverse, $$genlPreds);
                        extendedP = makeBoolean((NIL != genl_pred_extendedP) || (NIL != genl_inverse_extendedP));
                    }
                } else {
                    sbhl_paranoia.sbhl_error(THREE_INTEGER, $str_alt90$genlPreds___genlInverse_after_add, assertions_high.gaf_predicate(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            if (NIL != extendedP) {
                {
                    SubLObject spec_pred = assertions_high.gaf_arg1(assertion);
                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.reset_cached_spec_preds_and_spec_inverses(spec_pred);
                }
            }
        }
        return NIL;
    }

    public static SubLObject sbhl_genl_preds_cache_addition_maintainence(final SubLObject assertion) {
        SubLObject extendedP = NIL;
        final SubLObject pcase_var = assertions_high.gaf_predicate(assertion);
        if (pcase_var.eql($$genlPreds)) {
            final SubLObject genl_pred_extendedP = possibly_add_to_sbhl_caches(assertion, $$genlPreds, $$genlPreds);
            final SubLObject genl_inverse_extendedP = possibly_add_to_sbhl_caches(assertion, $$genlInverse, $$genlInverse);
            extendedP = makeBoolean((NIL != genl_pred_extendedP) || (NIL != genl_inverse_extendedP));
        } else
            if (pcase_var.eql($$genlInverse)) {
                final SubLObject genl_pred_extendedP = possibly_add_to_sbhl_caches(assertion, $$genlPreds, $$genlInverse);
                final SubLObject genl_inverse_extendedP = possibly_add_to_sbhl_caches(assertion, $$genlInverse, $$genlPreds);
                extendedP = makeBoolean((NIL != genl_pred_extendedP) || (NIL != genl_inverse_extendedP));
            } else {
                sbhl_paranoia.sbhl_error(THREE_INTEGER, $str92$genlPreds___genlInverse_after_add, assertions_high.gaf_predicate(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }

        if (NIL != extendedP) {
            final SubLObject spec_pred = assertions_high.gaf_arg1(assertion);
            reset_cached_spec_preds_and_spec_inverses(spec_pred);
        }
        return NIL;
    }

    public static final SubLObject sbhl_genl_preds_cache_removal_maintainence_alt(SubLObject assertion) {
        {
            SubLObject genl_pred_retractedP = com.cyc.cycjava.cycl.sbhl.sbhl_cache.possibly_remove_from_sbhl_caches($$genlPreds, assertion);
            SubLObject genl_inverse_retractedP = com.cyc.cycjava.cycl.sbhl.sbhl_cache.possibly_remove_from_sbhl_caches($$genlInverse, assertion);
            SubLObject retractedP = makeBoolean((NIL != genl_pred_retractedP) || (NIL != genl_inverse_retractedP));
            if (NIL != retractedP) {
                {
                    SubLObject spec_pred = assertions_high.gaf_arg1(assertion);
                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.reset_cached_spec_preds_and_spec_inverses(spec_pred);
                }
            }
        }
        return NIL;
    }

    public static SubLObject sbhl_genl_preds_cache_removal_maintainence(final SubLObject assertion) {
        final SubLObject genl_pred_retractedP = possibly_remove_from_sbhl_caches($$genlPreds, assertion);
        final SubLObject genl_inverse_retractedP = possibly_remove_from_sbhl_caches($$genlInverse, assertion);
        final SubLObject retractedP = makeBoolean((NIL != genl_pred_retractedP) || (NIL != genl_inverse_retractedP));
        if (NIL != retractedP) {
            final SubLObject spec_pred = assertions_high.gaf_arg1(assertion);
            reset_cached_spec_preds_and_spec_inverses(spec_pred);
        }
        return NIL;
    }

    public static final SubLObject reset_cached_spec_preds_and_spec_inverses_alt(SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(T, thread);
                    genl_predicates.map_all_spec_preds_and_inverses(RESET_CACHED_GENL_PRED_AND_INVERSE_RELATIONS, pred, UNPROVIDED, UNPROVIDED);
                } finally {
                    sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject reset_cached_spec_preds_and_spec_inverses(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(T, thread);
            genl_predicates.map_all_spec_preds_and_inverses(RESET_CACHED_GENL_PRED_AND_INVERSE_RELATIONS, pred, UNPROVIDED, UNPROVIDED);
        } finally {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject reset_cached_genl_pred_and_inverse_relations_alt(SubLObject pred) {
        com.cyc.cycjava.cycl.sbhl.sbhl_cache.reset_cached_sbhl_relations_for_node($$genlPreds, pred, T);
        com.cyc.cycjava.cycl.sbhl.sbhl_cache.reset_cached_sbhl_relations_for_node($$genlInverse, pred, T);
        return NIL;
    }

    public static SubLObject reset_cached_genl_pred_and_inverse_relations(final SubLObject pred) {
        reset_cached_sbhl_relations_for_node($$genlPreds, pred, T);
        reset_cached_sbhl_relations_for_node($$genlInverse, pred, T);
        return NIL;
    }

    public static final SubLObject initialize_all_mts_cache_for_genls_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject set_contents_var = set.do_set_internal(com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_cached_nodes_set_for_pred($$genls));
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject genl = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, genl)) {
                            {
                                SubLObject node_var = genl;
                                SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                SubLObject recur_deck = deck.create_deck(deck_type);
                                {
                                    SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                        {
                                            SubLObject tv_var = NIL;
                                            {
                                                SubLObject _prev_bind_0_26 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                    if (NIL != tv_var) {
                                                        if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                            if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                {
                                                                    SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                    if (pcase_var.eql($ERROR)) {
                                                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt81$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    } else {
                                                                        if (pcase_var.eql($CERROR)) {
                                                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt81$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        } else {
                                                                            if (pcase_var.eql($WARN)) {
                                                                                Errors.warn($str_alt81$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                            } else {
                                                                                Errors.warn($str_alt86$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                Errors.cerror($$$continue_anyway, $str_alt81$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    {
                                                        SubLObject _prev_bind_0_27 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_28 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                        SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                        SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                            sbhl_search_vars.$sbhl_search_module_type$.bind(get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != apply_sbhl_module_type_test(genl, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                {
                                                                    SubLObject _prev_bind_0_29 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1_30 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                    SubLObject _prev_bind_2_31 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                        while (NIL != node_var) {
                                                                            {
                                                                                SubLObject spec = node_var;
                                                                                if (NIL != forts.fort_p(spec)) {
                                                                                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_all_mts_cache($$genls, genl, spec);
                                                                                }
                                                                            }
                                                                            {
                                                                                SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                                SubLObject cdolist_list_var = accessible_modules;
                                                                                SubLObject module_var = NIL;
                                                                                for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                    {
                                                                                        SubLObject _prev_bind_0_32 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                        SubLObject _prev_bind_1_33 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                            {
                                                                                                SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                    {
                                                                                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                        if (NIL != d_link) {
                                                                                                            {
                                                                                                                SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                if (NIL != mt_links) {
                                                                                                                    {
                                                                                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                            thread.resetMultipleValues();
                                                                                                                            {
                                                                                                                                SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                thread.resetMultipleValues();
                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_34 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                            {
                                                                                                                                                SubLObject iteration_state_35 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_35)) {
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    {
                                                                                                                                                        SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_35);
                                                                                                                                                        SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                            {
                                                                                                                                                                SubLObject _prev_bind_0_36 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                try {
                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                        SubLObject cdolist_list_var_37 = new_list;
                                                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                                                        for (node_vars_link_node = cdolist_list_var_37.first(); NIL != cdolist_list_var_37; cdolist_list_var_37 = cdolist_list_var_37.rest() , node_vars_link_node = cdolist_list_var_37.first()) {
                                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                } finally {
                                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_36, thread);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        iteration_state_35 = dictionary_contents.do_dictionary_contents_next(iteration_state_35);
                                                                                                                                                    }
                                                                                                                                                } 
                                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_35);
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_34, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                            }
                                                                                                                        } 
                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt87$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                        }
                                                                                                    }
                                                                                                } else {
                                                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                        {
                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (randomize_list(get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                            SubLObject cdolist_list_var_38 = new_list;
                                                                                                            SubLObject generating_fn = NIL;
                                                                                                            for (generating_fn = cdolist_list_var_38.first(); NIL != cdolist_list_var_38; cdolist_list_var_38 = cdolist_list_var_38.rest() , generating_fn = cdolist_list_var_38.first()) {
                                                                                                                {
                                                                                                                    SubLObject _prev_bind_0_39 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                    try {
                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                        {
                                                                                                                            SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                            SubLObject new_list_40 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (randomize_list(link_nodes))) : link_nodes;
                                                                                                                            SubLObject cdolist_list_var_41 = new_list_40;
                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                            for (node_vars_link_node = cdolist_list_var_41.first(); NIL != cdolist_list_var_41; cdolist_list_var_41 = cdolist_list_var_41.rest() , node_vars_link_node = cdolist_list_var_41.first()) {
                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } finally {
                                                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_39, thread);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_33, thread);
                                                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_32, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            node_var = deck.deck_pop(recur_deck);
                                                                        } 
                                                                    } finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_31, thread);
                                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_30, thread);
                                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_29, thread);
                                                                    }
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt88$Node__a_does_not_pass_sbhl_type_t, genl, get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } finally {
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_28, thread);
                                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_27, thread);
                                                        }
                                                    }
                                                } finally {
                                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1, thread);
                                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_26, thread);
                                                }
                                            }
                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                        }
                                    } finally {
                                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject initialize_all_mts_cache_for_genls() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject set_var = get_cached_nodes_set_for_pred($$genls);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject genl;
        SubLObject node_var;
        SubLObject deck_type;
        SubLObject recur_deck;
        SubLObject _prev_bind_0;
        SubLObject tv_var;
        SubLObject _prev_bind_0_$44;
        SubLObject _prev_bind_2;
        SubLObject pcase_var;
        SubLObject _prev_bind_0_$45;
        SubLObject _prev_bind_1_$46;
        SubLObject _prev_bind_3;
        SubLObject _prev_bind_4;
        SubLObject _prev_bind_5;
        SubLObject _prev_bind_0_$46;
        SubLObject _prev_bind_1_$47;
        SubLObject _prev_bind_2_$49;
        SubLObject spec;
        SubLObject cdolist_list_var;
        SubLObject accessible_modules;
        SubLObject module_var;
        SubLObject _prev_bind_0_$47;
        SubLObject _prev_bind_1_$48;
        SubLObject node;
        SubLObject d_link;
        SubLObject mt_links;
        SubLObject iteration_state;
        SubLObject mt;
        SubLObject tv_links;
        SubLObject _prev_bind_0_$48;
        SubLObject iteration_state_$53;
        SubLObject tv;
        SubLObject link_nodes;
        SubLObject _prev_bind_0_$49;
        SubLObject sol;
        SubLObject set_contents_var_$55;
        SubLObject basis_object_$56;
        SubLObject state_$57;
        SubLObject node_vars_link_node;
        SubLObject csome_list_var;
        SubLObject node_vars_link_node2;
        SubLObject cdolist_list_var_$58;
        SubLObject new_list;
        SubLObject generating_fn;
        SubLObject _prev_bind_0_$50;
        SubLObject sol2;
        SubLObject link_nodes2;
        SubLObject set_contents_var_$56;
        SubLObject basis_object_$57;
        SubLObject state_$58;
        SubLObject node_vars_link_node3;
        SubLObject csome_list_var2;
        SubLObject node_vars_link_node4;
        SubLObject _prev_bind_0_$51;
        SubLObject _values;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            genl = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, genl)) {
                node_var = genl;
                deck_type = $STACK;
                recur_deck = deck.create_deck(deck_type);
                _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        tv_var = NIL;
                        _prev_bind_0_$44 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str82$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str82$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str82$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str87$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str82$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            _prev_bind_0_$45 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            _prev_bind_1_$46 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(genl, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    _prev_bind_0_$46 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    _prev_bind_1_$47 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    _prev_bind_2_$49 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        while (NIL != node_var) {
                                            spec = node_var;
                                            if (NIL != forts.fort_p(spec)) {
                                                add_to_sbhl_all_mts_cache($$genls, genl, spec);
                                            }
                                            accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                            module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                _prev_bind_0_$47 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$48 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    node = function_terms.naut_to_nart(node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        _prev_bind_0_$48 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            for (iteration_state_$53 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$53); iteration_state_$53 = dictionary_contents.do_dictionary_contents_next(iteration_state_$53)) {
                                                                                thread.resetMultipleValues();
                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$53);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    _prev_bind_0_$49 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            set_contents_var_$55 = set.do_set_internal(sol);
                                                                                            for (basis_object_$56 = set_contents.do_set_contents_basis_object(set_contents_var_$55), state_$57 = NIL, state_$57 = set_contents.do_set_contents_initial_state(basis_object_$56, set_contents_var_$55); NIL == set_contents.do_set_contents_doneP(basis_object_$56, state_$57); state_$57 = set_contents.do_set_contents_update_state(state_$57)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object_$56, state_$57);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state_$57, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                csome_list_var = sol;
                                                                                                node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str88$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$49, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$53);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$48, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str89$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            new_list = cdolist_list_var_$58 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$58.first();
                                                            while (NIL != cdolist_list_var_$58) {
                                                                _prev_bind_0_$50 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        set_contents_var_$56 = set.do_set_internal(sol2);
                                                                        for (basis_object_$57 = set_contents.do_set_contents_basis_object(set_contents_var_$56), state_$58 = NIL, state_$58 = set_contents.do_set_contents_initial_state(basis_object_$57, set_contents_var_$56); NIL == set_contents.do_set_contents_doneP(basis_object_$57, state_$58); state_$58 = set_contents.do_set_contents_update_state(state_$58)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object_$57, state_$58);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state_$58, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            csome_list_var2 = sol2;
                                                                            node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (NIL != csome_list_var2) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str88$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$50, thread);
                                                                }
                                                                cdolist_list_var_$58 = cdolist_list_var_$58.rest();
                                                                generating_fn = cdolist_list_var_$58.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$48, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$47, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                            node_var = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$49, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$47, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$46, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str90$Node__a_does_not_pass_sbhl_type_t, genl, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$46, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$45, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$44, thread);
                        }
                    } finally {
                        _prev_bind_0_$51 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject compute_cached_genls_from_all_mts_cache_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_cache = com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_sbhl_all_mts_cache_for_pred($$genls);
                if (NIL != forts.fort_id_index_p(v_cache)) {
                    {
                        SubLObject fii = v_cache;
                        {
                            SubLObject idx = forts.do_fii_get_constants(fii);
                            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                {
                                    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                                    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                                    SubLObject nodes = NIL;
                                    while (NIL != id) {
                                        nodes = do_id_index_state_object(idx, $SKIP, id, state_var);
                                        if (NIL != do_id_index_id_and_object_validP(id, nodes, $SKIP)) {
                                            {
                                                SubLObject spec = constants_high.find_constant_by_internal_id(id);
                                                if (NIL != spec) {
                                                    {
                                                        SubLObject set_contents_var = set.do_set_internal(nodes);
                                                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                                        SubLObject state = NIL;
                                                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                            {
                                                                SubLObject genl = set_contents.do_set_contents_next(basis_object, state);
                                                                if (NIL != set_contents.do_set_contents_element_validP(state, genl)) {
                                                                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_cache($$genls, genl, genl, $$UniversalVocabularyMt);
                                                                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_cache_for_relevant_mts($$genls, genl, spec);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        id = do_id_index_next_id(idx, NIL, id, state_var);
                                        state_var = do_id_index_next_state(idx, NIL, id, state_var);
                                    } 
                                }
                            }
                        }
                        {
                            SubLObject idx = forts.do_fii_get_narts(fii);
                            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                {
                                    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                                    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                                    SubLObject nodes = NIL;
                                    while (NIL != id) {
                                        nodes = do_id_index_state_object(idx, $SKIP, id, state_var);
                                        if (NIL != do_id_index_id_and_object_validP(id, nodes, $SKIP)) {
                                            {
                                                SubLObject spec = nart_handles.find_nart_by_id(id);
                                                if (NIL != spec) {
                                                    {
                                                        SubLObject set_contents_var = set.do_set_internal(nodes);
                                                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                                        SubLObject state = NIL;
                                                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                            {
                                                                SubLObject genl = set_contents.do_set_contents_next(basis_object, state);
                                                                if (NIL != set_contents.do_set_contents_element_validP(state, genl)) {
                                                                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_cache($$genls, genl, genl, $$UniversalVocabularyMt);
                                                                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_cache_for_relevant_mts($$genls, genl, spec);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        id = do_id_index_next_id(idx, NIL, id, state_var);
                                        state_var = do_id_index_next_state(idx, NIL, id, state_var);
                                    } 
                                }
                            }
                        }
                    }
                } else {
                    {
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_cache));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject genl = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject subnodes = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject set_contents_var = set.do_set_internal(subnodes);
                                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                    SubLObject state = NIL;
                                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                        {
                                            SubLObject spec = set_contents.do_set_contents_next(basis_object, state);
                                            if (NIL != set_contents.do_set_contents_element_validP(state, spec)) {
                                                com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_cache($$genls, genl, genl, $$UniversalVocabularyMt);
                                                com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_cache_for_relevant_mts($$genls, genl, spec);
                                            }
                                        }
                                    }
                                }
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject compute_cached_genls_from_all_mts_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_cache = get_sbhl_all_mts_cache_for_pred($$genls);
        if (NIL != forts.fort_id_index_p(v_cache)) {
            final SubLObject fii = v_cache;
            SubLObject idx = forts.do_fii_get_constants(fii);
            if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                final SubLObject idx_$64 = idx;
                if (NIL == id_index_dense_objects_empty_p(idx_$64, $SKIP)) {
                    final SubLObject vector_var = id_index_dense_objects(idx_$64);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject nodes;
                    SubLObject spec;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject genl;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        nodes = aref(vector_var, id);
                        if ((NIL == id_index_tombstone_p(nodes)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            if (NIL != id_index_tombstone_p(nodes)) {
                                nodes = $SKIP;
                            }
                            spec = constants_high.find_constant_by_internal_id(id);
                            if (NIL != spec) {
                                set_contents_var = set.do_set_internal(nodes);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    genl = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, genl)) {
                                        add_to_sbhl_cache($$genls, genl, genl, $$UniversalVocabularyMt);
                                        add_to_sbhl_cache_for_relevant_mts($$genls, genl, spec);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$65 = idx;
                if (NIL == id_index_sparse_objects_empty_p(idx_$65)) {
                    final SubLObject cdohash_table = id_index_sparse_objects(idx_$65);
                    SubLObject id2 = NIL;
                    SubLObject nodes2 = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            id2 = getEntryKey(cdohash_entry);
                            nodes2 = getEntryValue(cdohash_entry);
                            final SubLObject spec2 = constants_high.find_constant_by_internal_id(id2);
                            if (NIL != spec2) {
                                final SubLObject set_contents_var2 = set.do_set_internal(nodes2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject genl2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    genl2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (NIL != set_contents.do_set_contents_element_validP(state2, genl2)) {
                                        add_to_sbhl_cache($$genls, genl2, genl2, $$UniversalVocabularyMt);
                                        add_to_sbhl_cache_for_relevant_mts($$genls, genl2, spec2);
                                    }
                                }
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            idx = forts.do_fii_get_narts(fii);
            if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                final SubLObject idx_$66 = idx;
                if (NIL == id_index_dense_objects_empty_p(idx_$66, $SKIP)) {
                    final SubLObject vector_var = id_index_dense_objects(idx_$66);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject nodes;
                    SubLObject spec;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject genl;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        nodes = aref(vector_var, id);
                        if ((NIL == id_index_tombstone_p(nodes)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            if (NIL != id_index_tombstone_p(nodes)) {
                                nodes = $SKIP;
                            }
                            spec = nart_handles.find_nart_by_id(id);
                            if (NIL != spec) {
                                set_contents_var = set.do_set_internal(nodes);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    genl = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, genl)) {
                                        add_to_sbhl_cache($$genls, genl, genl, $$UniversalVocabularyMt);
                                        add_to_sbhl_cache_for_relevant_mts($$genls, genl, spec);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$67 = idx;
                if (NIL == id_index_sparse_objects_empty_p(idx_$67)) {
                    final SubLObject cdohash_table = id_index_sparse_objects(idx_$67);
                    SubLObject id2 = NIL;
                    SubLObject nodes2 = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            id2 = getEntryKey(cdohash_entry);
                            nodes2 = getEntryValue(cdohash_entry);
                            final SubLObject spec2 = nart_handles.find_nart_by_id(id2);
                            if (NIL != spec2) {
                                final SubLObject set_contents_var2 = set.do_set_internal(nodes2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject genl2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    genl2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (NIL != set_contents.do_set_contents_element_validP(state2, genl2)) {
                                        add_to_sbhl_cache($$genls, genl2, genl2, $$UniversalVocabularyMt);
                                        add_to_sbhl_cache_for_relevant_mts($$genls, genl2, spec2);
                                    }
                                }
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        } else {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_cache)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject genl3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject subnodes = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject set_contents_var3 = set.do_set_internal(subnodes);
                SubLObject basis_object3;
                SubLObject state3;
                SubLObject spec3;
                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                    spec3 = set_contents.do_set_contents_next(basis_object3, state3);
                    if (NIL != set_contents.do_set_contents_element_validP(state3, spec3)) {
                        add_to_sbhl_cache($$genls, genl3, genl3, $$UniversalVocabularyMt);
                        add_to_sbhl_cache_for_relevant_mts($$genls, genl3, spec3);
                    }
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return NIL;
    }

    public static final SubLObject genls_cache_addition_maintainence_alt(SubLObject assertion) {
        {
            SubLObject spec = assertions_high.gaf_arg1(assertion);
            SubLObject genl = assertions_high.gaf_arg2(assertion);
            SubLObject extendedP = NIL;
            extendedP = com.cyc.cycjava.cycl.sbhl.sbhl_cache.possibly_add_to_sbhl_caches(assertion, $$genls, $$genls);
            if (NIL != extendedP) {
                com.cyc.cycjava.cycl.sbhl.sbhl_cache.reset_cached_genls_of_all_specs(spec);
            }
            {
                SubLObject new_cached_isas = com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_predicate_relation_to_which_cached_nodes($$genls, spec, $$isa);
                SubLObject old_cached_isas = com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_predicate_relation_to_which_cached_nodes_excluding_link_node($$genls, spec, $$isa, genl);
                SubLObject types_gained = set_difference(new_cached_isas, old_cached_isas, symbol_function(EQ), UNPROVIDED);
                if (NIL != types_gained) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.reset_sbhl_types_of_all_instances(spec);
                }
            }
        }
        return NIL;
    }

    public static SubLObject genls_cache_addition_maintainence(final SubLObject assertion) {
        final SubLObject spec = assertions_high.gaf_arg1(assertion);
        final SubLObject genl = assertions_high.gaf_arg2(assertion);
        SubLObject extendedP = NIL;
        extendedP = possibly_add_to_sbhl_caches(assertion, $$genls, $$genls);
        if (NIL != extendedP) {
            reset_cached_genls_of_all_specs(spec);
        }
        final SubLObject new_cached_isas = sbhl_predicate_relation_to_which_cached_nodes($$genls, spec, $$isa);
        final SubLObject old_cached_isas = sbhl_predicate_relation_to_which_cached_nodes_excluding_link_node($$genls, spec, $$isa, genl);
        SubLObject types_gained = set_difference(new_cached_isas, old_cached_isas, symbol_function(EQL), UNPROVIDED);
        if (NIL != types_gained) {
            reset_sbhl_types_of_all_instances(spec);
        }
        final SubLObject new_cached_quoted_isas = sbhl_predicate_relation_to_which_cached_nodes($$genls, spec, $$quotedIsa);
        final SubLObject old_cached_quoted_isas = sbhl_predicate_relation_to_which_cached_nodes_excluding_link_node($$genls, spec, $$quotedIsa, genl);
        types_gained = set_difference(new_cached_quoted_isas, old_cached_quoted_isas, symbol_function(EQL), UNPROVIDED);
        if (NIL != types_gained) {
            reset_sbhl_types_of_all_quoted_instances(spec);
        }
        return NIL;
    }

    public static final SubLObject genls_cache_removal_maintainence_alt(SubLObject assertion) {
        {
            SubLObject spec = assertions_high.gaf_arg1(assertion);
            SubLObject genl = assertions_high.gaf_arg2(assertion);
            SubLObject retractedP = NIL;
            retractedP = com.cyc.cycjava.cycl.sbhl.sbhl_cache.possibly_remove_from_sbhl_caches($$genls, assertion);
            if (NIL != retractedP) {
                com.cyc.cycjava.cycl.sbhl.sbhl_cache.reset_cached_genls_of_all_specs(spec);
            }
            {
                SubLObject new_cached_isas = com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_predicate_relation_to_which_cached_nodes($$genls, spec, $$isa);
                SubLObject old_cached_isas = com.cyc.cycjava.cycl.sbhl.sbhl_cache.sbhl_predicate_relation_to_which_cached_nodes($$genls, genl, $$isa);
                SubLObject types_lost = set_difference(old_cached_isas, new_cached_isas, UNPROVIDED, UNPROVIDED);
                if (NIL != types_lost) {
                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.reset_sbhl_types_of_all_instances(spec);
                }
            }
        }
        return NIL;
    }

    public static SubLObject genls_cache_removal_maintainence(final SubLObject assertion) {
        final SubLObject spec = assertions_high.gaf_arg1(assertion);
        final SubLObject genl = assertions_high.gaf_arg2(assertion);
        SubLObject retractedP = NIL;
        retractedP = possibly_remove_from_sbhl_caches($$genls, assertion);
        if (NIL != retractedP) {
            reset_cached_genls_of_all_specs(spec);
        }
        final SubLObject new_cached_isas = sbhl_predicate_relation_to_which_cached_nodes($$genls, spec, $$isa);
        final SubLObject old_cached_isas = sbhl_predicate_relation_to_which_cached_nodes($$genls, genl, $$isa);
        SubLObject types_lost = set_difference(old_cached_isas, new_cached_isas, UNPROVIDED, UNPROVIDED);
        if (NIL != types_lost) {
            reset_sbhl_types_of_all_instances(spec);
        }
        final SubLObject new_cached_quoted_isas = sbhl_predicate_relation_to_which_cached_nodes($$genls, spec, $$quotedIsa);
        final SubLObject old_cached_quoted_isas = sbhl_predicate_relation_to_which_cached_nodes($$genls, genl, $$quotedIsa);
        types_lost = set_difference(old_cached_quoted_isas, new_cached_quoted_isas, UNPROVIDED, UNPROVIDED);
        if (NIL != types_lost) {
            reset_sbhl_types_of_all_quoted_instances(spec);
        }
        return NIL;
    }

    public static final SubLObject reset_sbhl_types_of_all_instances_alt(SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(T, thread);
                    map_all_instances(RESET_CACHED_ISA_RELATIONS, col, UNPROVIDED, UNPROVIDED);
                } finally {
                    sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject reset_sbhl_types_of_all_instances(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(T, thread);
            isa.map_all_instances(RESET_CACHED_ISA_RELATIONS, col, UNPROVIDED, UNPROVIDED);
        } finally {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject reset_sbhl_types_of_all_quoted_instances(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(T, thread);
            isa.map_all_instances(RESET_CACHED_QUOTED_ISA_RELATIONS, col, UNPROVIDED, UNPROVIDED);
        } finally {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject reset_cached_genls_of_all_specs_alt(SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                SubLObject _prev_bind_2 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(T, thread);
                    genls.map_all_specs(RESET_CACHED_GENLS_RELATIONS, col, UNPROVIDED, UNPROVIDED);
                } finally {
                    sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject reset_cached_genls_of_all_specs(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_paranoia.$suspend_sbhl_cache_useP$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            sbhl_paranoia.$suspend_sbhl_cache_useP$.bind(T, thread);
            genls.map_all_specs(RESET_CACHED_GENLS_RELATIONS, col, UNPROVIDED, UNPROVIDED);
        } finally {
            sbhl_paranoia.$suspend_sbhl_cache_useP$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject reset_cached_genls_relations_alt(SubLObject col) {
        com.cyc.cycjava.cycl.sbhl.sbhl_cache.reset_cached_sbhl_relations_for_node($$genls, col, T);
        return NIL;
    }

    public static SubLObject reset_cached_genls_relations(final SubLObject col) {
        reset_cached_sbhl_relations_for_node($$genls, col, T);
        return NIL;
    }

    public static final SubLObject initialize_all_mts_cache_for_isa_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject set_contents_var = set.do_set_internal(com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_cached_nodes_set_for_pred($$isa));
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject type = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, type)) {
                            {
                                SubLObject node_var = type;
                                {
                                    SubLObject _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                    try {
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                                        sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                        {
                                            SubLObject node_var_42 = node_var;
                                            SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                            SubLObject recur_deck = deck.create_deck(deck_type);
                                            {
                                                SubLObject _prev_bind_0_43 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                                try {
                                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                    {
                                                        SubLObject tv_var = NIL;
                                                        {
                                                            SubLObject _prev_bind_0_44 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_45 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                                if (NIL != tv_var) {
                                                                    if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                        if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                            {
                                                                                SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                                if (pcase_var.eql($ERROR)) {
                                                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt81$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                } else {
                                                                                    if (pcase_var.eql($CERROR)) {
                                                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt81$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                    } else {
                                                                                        if (pcase_var.eql($WARN)) {
                                                                                            Errors.warn($str_alt81$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                        } else {
                                                                                            Errors.warn($str_alt86$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                            Errors.cerror($$$continue_anyway, $str_alt81$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                {
                                                                    SubLObject _prev_bind_0_46 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1_47 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                    SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                    SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_search_vars.$sbhl_search_module$.bind(get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                                        sbhl_search_vars.$sbhl_search_module_type$.bind(get_sbhl_module_type(get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(get_sbhl_add_node_to_result_test(get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                        sbhl_module_vars.$sbhl_module$.bind(get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                            {
                                                                                SubLObject _prev_bind_0_48 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                                SubLObject _prev_bind_1_49 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                                SubLObject _prev_bind_2_50 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var_42, UNPROVIDED);
                                                                                    while (NIL != node_var_42) {
                                                                                        {
                                                                                            SubLObject tt_node_var = node_var_42;
                                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                                            SubLObject module_var = NIL;
                                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_51 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                    SubLObject _prev_bind_1_52 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                        {
                                                                                                            SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                {
                                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    if (NIL != d_link) {
                                                                                                                        {
                                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                            if (NIL != mt_links) {
                                                                                                                                {
                                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        {
                                                                                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                                {
                                                                                                                                                    SubLObject _prev_bind_0_53 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                    try {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                        {
                                                                                                                                                            SubLObject iteration_state_54 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_54)) {
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                {
                                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_54);
                                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject _prev_bind_0_55 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                            try {
                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                    SubLObject cdolist_list_var_56 = new_list;
                                                                                                                                                                                    SubLObject instance = NIL;
                                                                                                                                                                                    for (instance = cdolist_list_var_56.first(); NIL != cdolist_list_var_56; cdolist_list_var_56 = cdolist_list_var_56.rest() , instance = cdolist_list_var_56.first()) {
                                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                                            if (NIL != forts.fort_p(instance)) {
                                                                                                                                                                                                com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_all_mts_cache($$isa, type, instance);
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            } finally {
                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_55, thread);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    iteration_state_54 = dictionary_contents.do_dictionary_contents_next(iteration_state_54);
                                                                                                                                                                }
                                                                                                                                                            } 
                                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_54);
                                                                                                                                                        }
                                                                                                                                                    } finally {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_53, thread);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                        }
                                                                                                                                    } 
                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt87$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                    }
                                                                                                                }
                                                                                                                if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                                                                    {
                                                                                                                        SubLObject csome_list_var = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                                                                        SubLObject instance_tuple = NIL;
                                                                                                                        for (instance_tuple = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , instance_tuple = csome_list_var.first()) {
                                                                                                                            {
                                                                                                                                SubLObject datum = instance_tuple;
                                                                                                                                SubLObject current = datum;
                                                                                                                                SubLObject link_node = NIL;
                                                                                                                                SubLObject mt = NIL;
                                                                                                                                SubLObject tv = NIL;
                                                                                                                                destructuring_bind_must_consp(current, datum, $list_alt95);
                                                                                                                                link_node = current.first();
                                                                                                                                current = current.rest();
                                                                                                                                destructuring_bind_must_consp(current, datum, $list_alt95);
                                                                                                                                mt = current.first();
                                                                                                                                current = current.rest();
                                                                                                                                destructuring_bind_must_consp(current, datum, $list_alt95);
                                                                                                                                tv = current.first();
                                                                                                                                current = current.rest();
                                                                                                                                if (NIL == current) {
                                                                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                        {
                                                                                                                                            SubLObject _prev_bind_0_57 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                    {
                                                                                                                                                        SubLObject _prev_bind_0_58 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                        try {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                            {
                                                                                                                                                                SubLObject link_nodes = list(link_node);
                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                SubLObject cdolist_list_var_59 = new_list;
                                                                                                                                                                SubLObject instance = NIL;
                                                                                                                                                                for (instance = cdolist_list_var_59.first(); NIL != cdolist_list_var_59; cdolist_list_var_59 = cdolist_list_var_59.rest() , instance = cdolist_list_var_59.first()) {
                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                        if (NIL != forts.fort_p(instance)) {
                                                                                                                                                                            com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_all_mts_cache($$isa, type, instance);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        } finally {
                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_58, thread);
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            } finally {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_57, thread);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    cdestructuring_bind_error(datum, $list_alt95);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                    {
                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (randomize_list(get_sbhl_module_relevant_naut_link_generators(get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : get_sbhl_module_relevant_naut_link_generators(get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        SubLObject cdolist_list_var_60 = new_list;
                                                                                                                        SubLObject generating_fn = NIL;
                                                                                                                        for (generating_fn = cdolist_list_var_60.first(); NIL != cdolist_list_var_60; cdolist_list_var_60 = cdolist_list_var_60.rest() , generating_fn = cdolist_list_var_60.first()) {
                                                                                                                            {
                                                                                                                                SubLObject _prev_bind_0_61 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                    {
                                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                        SubLObject new_list_62 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (randomize_list(link_nodes))) : link_nodes;
                                                                                                                                        SubLObject cdolist_list_var_63 = new_list_62;
                                                                                                                                        SubLObject instance = NIL;
                                                                                                                                        for (instance = cdolist_list_var_63.first(); NIL != cdolist_list_var_63; cdolist_list_var_63 = cdolist_list_var_63.rest() , instance = cdolist_list_var_63.first()) {
                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                if (NIL != forts.fort_p(instance)) {
                                                                                                                                                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_all_mts_cache($$isa, type, instance);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } finally {
                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_61, thread);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_52, thread);
                                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_51, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        {
                                                                                            SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                                                            SubLObject cdolist_list_var = accessible_modules;
                                                                                            SubLObject module_var = NIL;
                                                                                            for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_64 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                    SubLObject _prev_bind_1_65 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                        {
                                                                                                            SubLObject node = function_terms.naut_to_nart(node_var_42);
                                                                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                                {
                                                                                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    if (NIL != d_link) {
                                                                                                                        {
                                                                                                                            SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                            if (NIL != mt_links) {
                                                                                                                                {
                                                                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        {
                                                                                                                                            SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                                {
                                                                                                                                                    SubLObject _prev_bind_0_66 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                    try {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                        {
                                                                                                                                                            SubLObject iteration_state_67 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_67)) {
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                {
                                                                                                                                                                    SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_67);
                                                                                                                                                                    SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject _prev_bind_0_68 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                            try {
                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                    SubLObject cdolist_list_var_69 = new_list;
                                                                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                    for (node_vars_link_node = cdolist_list_var_69.first(); NIL != cdolist_list_var_69; cdolist_list_var_69 = cdolist_list_var_69.rest() , node_vars_link_node = cdolist_list_var_69.first()) {
                                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            } finally {
                                                                                                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_68, thread);
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    iteration_state_67 = dictionary_contents.do_dictionary_contents_next(iteration_state_67);
                                                                                                                                                                }
                                                                                                                                                            } 
                                                                                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_67);
                                                                                                                                                        }
                                                                                                                                                    } finally {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_66, thread);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                        }
                                                                                                                                    } 
                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt87$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                    }
                                                                                                                }
                                                                                                            } else {
                                                                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                    {
                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (randomize_list(get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        SubLObject cdolist_list_var_70 = new_list;
                                                                                                                        SubLObject generating_fn = NIL;
                                                                                                                        for (generating_fn = cdolist_list_var_70.first(); NIL != cdolist_list_var_70; cdolist_list_var_70 = cdolist_list_var_70.rest() , generating_fn = cdolist_list_var_70.first()) {
                                                                                                                            {
                                                                                                                                SubLObject _prev_bind_0_71 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                    {
                                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                        SubLObject new_list_72 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (randomize_list(link_nodes))) : link_nodes;
                                                                                                                                        SubLObject cdolist_list_var_73 = new_list_72;
                                                                                                                                        SubLObject node_vars_link_node = NIL;
                                                                                                                                        for (node_vars_link_node = cdolist_list_var_73.first(); NIL != cdolist_list_var_73; cdolist_list_var_73 = cdolist_list_var_73.rest() , node_vars_link_node = cdolist_list_var_73.first()) {
                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } finally {
                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_71, thread);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } finally {
                                                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_65, thread);
                                                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_64, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        node_var_42 = deck.deck_pop(recur_deck);
                                                                                    } 
                                                                                } finally {
                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_50, thread);
                                                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_49, thread);
                                                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_48, thread);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt88$Node__a_does_not_pass_sbhl_type_t, node_var, get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        }
                                                                    } finally {
                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_47, thread);
                                                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_46, thread);
                                                                    }
                                                                }
                                                            } finally {
                                                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_45, thread);
                                                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_44, thread);
                                                            }
                                                        }
                                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                    }
                                                } finally {
                                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_43, thread);
                                                }
                                            }
                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                        }
                                    } finally {
                                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1, thread);
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject initialize_all_mts_cache_for_isa() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject set_var = get_cached_nodes_set_for_pred($$isa);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject type;
        SubLObject node_var;
        SubLObject _prev_bind_0;
        SubLObject _prev_bind_2;
        SubLObject node_var_$68;
        SubLObject deck_type;
        SubLObject recur_deck;
        SubLObject _prev_bind_0_$69;
        SubLObject tv_var;
        SubLObject _prev_bind_0_$70;
        SubLObject _prev_bind_1_$71;
        SubLObject pcase_var;
        SubLObject _prev_bind_0_$71;
        SubLObject _prev_bind_1_$72;
        SubLObject _prev_bind_3;
        SubLObject _prev_bind_4;
        SubLObject _prev_bind_5;
        SubLObject _prev_bind_0_$72;
        SubLObject _prev_bind_1_$73;
        SubLObject _prev_bind_2_$76;
        SubLObject tt_node_var;
        SubLObject cdolist_list_var;
        SubLObject accessible_modules;
        SubLObject module_var;
        SubLObject _prev_bind_0_$73;
        SubLObject _prev_bind_1_$74;
        SubLObject node;
        SubLObject d_link;
        SubLObject mt_links;
        SubLObject iteration_state;
        SubLObject mt;
        SubLObject tv_links;
        SubLObject _prev_bind_0_$74;
        SubLObject iteration_state_$80;
        SubLObject tv;
        SubLObject link_nodes;
        SubLObject _prev_bind_0_$75;
        SubLObject sol;
        SubLObject set_contents_var_$82;
        SubLObject basis_object_$83;
        SubLObject state_$84;
        SubLObject instance;
        SubLObject csome_list_var;
        SubLObject instance2;
        SubLObject csome_list_var2;
        SubLObject instance_tuple;
        SubLObject current;
        SubLObject datum;
        SubLObject link_node;
        SubLObject mt2;
        SubLObject tv2;
        SubLObject _prev_bind_0_$76;
        SubLObject _prev_bind_0_$77;
        SubLObject link_nodes2;
        SubLObject set_contents_var_$83;
        SubLObject basis_object_$84;
        SubLObject state_$85;
        SubLObject csome_list_var_$90;
        SubLObject cdolist_list_var_$91;
        SubLObject new_list;
        SubLObject generating_fn;
        SubLObject _prev_bind_0_$78;
        SubLObject sol2;
        SubLObject link_nodes3;
        SubLObject set_contents_var_$84;
        SubLObject basis_object_$85;
        SubLObject state_$86;
        SubLObject instance3;
        SubLObject csome_list_var3;
        SubLObject instance4;
        SubLObject cdolist_list_var2;
        SubLObject accessible_modules2;
        SubLObject module_var2;
        SubLObject _prev_bind_0_$79;
        SubLObject _prev_bind_1_$75;
        SubLObject node2;
        SubLObject d_link2;
        SubLObject mt_links2;
        SubLObject iteration_state2;
        SubLObject mt3;
        SubLObject tv_links2;
        SubLObject _prev_bind_0_$80;
        SubLObject iteration_state_$81;
        SubLObject link_nodes4;
        SubLObject _prev_bind_0_$81;
        SubLObject sol3;
        SubLObject set_contents_var_$85;
        SubLObject basis_object_$86;
        SubLObject state_$87;
        SubLObject node_vars_link_node;
        SubLObject csome_list_var4;
        SubLObject node_vars_link_node2;
        SubLObject cdolist_list_var_$92;
        SubLObject new_list2;
        SubLObject generating_fn2;
        SubLObject _prev_bind_0_$82;
        SubLObject sol4;
        SubLObject link_nodes5;
        SubLObject set_contents_var_$86;
        SubLObject basis_object_$87;
        SubLObject state_$88;
        SubLObject node_vars_link_node3;
        SubLObject csome_list_var5;
        SubLObject node_vars_link_node4;
        SubLObject _prev_bind_0_$83;
        SubLObject _values;
        SubLObject _prev_bind_0_$84;
        SubLObject _values2;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            type = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, type)) {
                node_var = type;
                _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        node_var_$68 = node_var;
                        deck_type = $STACK;
                        recur_deck = deck.create_deck(deck_type);
                        _prev_bind_0_$69 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                tv_var = NIL;
                                _prev_bind_0_$70 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                _prev_bind_1_$71 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str82$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str82$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str82$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str87$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str82$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    _prev_bind_0_$71 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    _prev_bind_1_$72 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                            _prev_bind_0_$72 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            _prev_bind_1_$73 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            _prev_bind_2_$76 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$68, UNPROVIDED);
                                                while (NIL != node_var_$68) {
                                                    tt_node_var = node_var_$68;
                                                    accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                    module_var = NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        _prev_bind_0_$73 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$74 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node = function_terms.naut_to_nart(tt_node_var);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                _prev_bind_0_$74 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    for (iteration_state_$80 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$80); iteration_state_$80 = dictionary_contents.do_dictionary_contents_next(iteration_state_$80)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$80);
                                                                                        link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            _prev_bind_0_$75 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    set_contents_var_$82 = set.do_set_internal(sol);
                                                                                                    for (basis_object_$83 = set_contents.do_set_contents_basis_object(set_contents_var_$82), state_$84 = NIL, state_$84 = set_contents.do_set_contents_initial_state(basis_object_$83, set_contents_var_$82); NIL == set_contents.do_set_contents_doneP(basis_object_$83, state_$84); state_$84 = set_contents.do_set_contents_update_state(state_$84)) {
                                                                                                        instance = set_contents.do_set_contents_next(basis_object_$83, state_$84);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state_$84, instance)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(instance)) {
                                                                                                                add_to_sbhl_all_mts_cache($$isa, type, instance);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        csome_list_var = sol;
                                                                                                        instance2 = NIL;
                                                                                                        instance2 = csome_list_var.first();
                                                                                                        while (NIL != csome_list_var) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if (NIL != forts.fort_p(instance2)) {
                                                                                                                    add_to_sbhl_all_mts_cache($$isa, type, instance2);
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            instance2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str88$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$75, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$80);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$74, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str89$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                                if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                    csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                    instance_tuple = NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while (NIL != csome_list_var2) {
                                                                        datum = current = instance_tuple;
                                                                        link_node = NIL;
                                                                        mt2 = NIL;
                                                                        tv2 = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list98);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list98);
                                                                        mt2 = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list98);
                                                                        tv2 = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                _prev_bind_0_$76 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        _prev_bind_0_$77 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            link_nodes2 = sol = list(link_node);
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                set_contents_var_$83 = set.do_set_internal(sol);
                                                                                                for (basis_object_$84 = set_contents.do_set_contents_basis_object(set_contents_var_$83), state_$85 = NIL, state_$85 = set_contents.do_set_contents_initial_state(basis_object_$84, set_contents_var_$83); NIL == set_contents.do_set_contents_doneP(basis_object_$84, state_$85); state_$85 = set_contents.do_set_contents_update_state(state_$85)) {
                                                                                                    instance = set_contents.do_set_contents_next(basis_object_$84, state_$85);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state_$85, instance)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(instance)) {
                                                                                                            add_to_sbhl_all_mts_cache($$isa, type, instance);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    csome_list_var_$90 = sol;
                                                                                                    instance2 = NIL;
                                                                                                    instance2 = csome_list_var_$90.first();
                                                                                                    while (NIL != csome_list_var_$90) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(instance2)) {
                                                                                                                add_to_sbhl_all_mts_cache($$isa, type, instance2);
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var_$90 = csome_list_var_$90.rest();
                                                                                                        instance2 = csome_list_var_$90.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str88$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$77, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$76, thread);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, $list98);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    } 
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    new_list = cdolist_list_var_$91 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    generating_fn = NIL;
                                                                    generating_fn = cdolist_list_var_$91.first();
                                                                    while (NIL != cdolist_list_var_$91) {
                                                                        _prev_bind_0_$78 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                set_contents_var_$84 = set.do_set_internal(sol2);
                                                                                for (basis_object_$85 = set_contents.do_set_contents_basis_object(set_contents_var_$84), state_$86 = NIL, state_$86 = set_contents.do_set_contents_initial_state(basis_object_$85, set_contents_var_$84); NIL == set_contents.do_set_contents_doneP(basis_object_$85, state_$86); state_$86 = set_contents.do_set_contents_update_state(state_$86)) {
                                                                                    instance3 = set_contents.do_set_contents_next(basis_object_$85, state_$86);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state_$86, instance3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if (NIL != forts.fort_p(instance3)) {
                                                                                            add_to_sbhl_all_mts_cache($$isa, type, instance3);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    csome_list_var3 = sol2;
                                                                                    instance4 = NIL;
                                                                                    instance4 = csome_list_var3.first();
                                                                                    while (NIL != csome_list_var3) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                            if (NIL != forts.fort_p(instance4)) {
                                                                                                add_to_sbhl_all_mts_cache($$isa, type, instance4);
                                                                                            }
                                                                                        }
                                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                                        instance4 = csome_list_var3.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str88$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$78, thread);
                                                                        }
                                                                        cdolist_list_var_$91 = cdolist_list_var_$91.rest();
                                                                        generating_fn = cdolist_list_var_$91.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$74, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$73, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    } 
                                                    accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                    module_var2 = NIL;
                                                    module_var2 = cdolist_list_var2.first();
                                                    while (NIL != cdolist_list_var2) {
                                                        _prev_bind_0_$79 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$75 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node2 = function_terms.naut_to_nart(node_var_$68);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link2) {
                                                                    mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links2) {
                                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                            tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                                _prev_bind_0_$80 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                    for (iteration_state_$81 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$81); iteration_state_$81 = dictionary_contents.do_dictionary_contents_next(iteration_state_$81)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$81);
                                                                                        link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            _prev_bind_0_$81 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                sol3 = link_nodes4;
                                                                                                if (NIL != set.set_p(sol3)) {
                                                                                                    set_contents_var_$85 = set.do_set_internal(sol3);
                                                                                                    for (basis_object_$86 = set_contents.do_set_contents_basis_object(set_contents_var_$85), state_$87 = NIL, state_$87 = set_contents.do_set_contents_initial_state(basis_object_$86, set_contents_var_$85); NIL == set_contents.do_set_contents_doneP(basis_object_$86, state_$87); state_$87 = set_contents.do_set_contents_update_state(state_$87)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object_$86, state_$87);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state_$87, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol3.isList()) {
                                                                                                        csome_list_var4 = sol3;
                                                                                                        node_vars_link_node2 = NIL;
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
                                                                                                        Errors.error($str88$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$81, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$81);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$80, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str89$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                    new_list2 = cdolist_list_var_$92 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    generating_fn2 = NIL;
                                                                    generating_fn2 = cdolist_list_var_$92.first();
                                                                    while (NIL != cdolist_list_var_$92) {
                                                                        _prev_bind_0_$82 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                            link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                            if (NIL != set.set_p(sol4)) {
                                                                                set_contents_var_$86 = set.do_set_internal(sol4);
                                                                                for (basis_object_$87 = set_contents.do_set_contents_basis_object(set_contents_var_$86), state_$88 = NIL, state_$88 = set_contents.do_set_contents_initial_state(basis_object_$87, set_contents_var_$86); NIL == set_contents.do_set_contents_doneP(basis_object_$87, state_$88); state_$88 = set_contents.do_set_contents_update_state(state_$88)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object_$87, state_$88);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state_$88, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol4.isList()) {
                                                                                    csome_list_var5 = sol4;
                                                                                    node_vars_link_node4 = NIL;
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
                                                                                    Errors.error($str88$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$82, thread);
                                                                        }
                                                                        cdolist_list_var_$92 = cdolist_list_var_$92.rest();
                                                                        generating_fn2 = cdolist_list_var_$92.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$75, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$79, thread);
                                                        }
                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                        module_var2 = cdolist_list_var2.first();
                                                    } 
                                                    node_var_$68 = deck.deck_pop(recur_deck);
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$76, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$73, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$72, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str90$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$72, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$71, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$71, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$70, thread);
                                }
                            } finally {
                                _prev_bind_0_$83 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    _values = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$83, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$69, thread);
                        }
                    } finally {
                        _prev_bind_0_$84 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            _values2 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$84, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject compute_cached_isas_from_all_mts_cache_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_cache = com.cyc.cycjava.cycl.sbhl.sbhl_cache.get_sbhl_all_mts_cache_for_pred($$isa);
                if (NIL != forts.fort_id_index_p(v_cache)) {
                    {
                        SubLObject fii = v_cache;
                        {
                            SubLObject idx = forts.do_fii_get_constants(fii);
                            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                {
                                    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                                    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                                    SubLObject nodes = NIL;
                                    while (NIL != id) {
                                        nodes = do_id_index_state_object(idx, $SKIP, id, state_var);
                                        if (NIL != do_id_index_id_and_object_validP(id, nodes, $SKIP)) {
                                            {
                                                SubLObject instance = constants_high.find_constant_by_internal_id(id);
                                                if (NIL != instance) {
                                                    {
                                                        SubLObject set_contents_var = set.do_set_internal(nodes);
                                                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                                        SubLObject state = NIL;
                                                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                            {
                                                                SubLObject type = set_contents.do_set_contents_next(basis_object, state);
                                                                if (NIL != set_contents.do_set_contents_element_validP(state, type)) {
                                                                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_cache_for_relevant_mts($$isa, type, instance);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        id = do_id_index_next_id(idx, NIL, id, state_var);
                                        state_var = do_id_index_next_state(idx, NIL, id, state_var);
                                    } 
                                }
                            }
                        }
                        {
                            SubLObject idx = forts.do_fii_get_narts(fii);
                            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                {
                                    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
                                    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
                                    SubLObject nodes = NIL;
                                    while (NIL != id) {
                                        nodes = do_id_index_state_object(idx, $SKIP, id, state_var);
                                        if (NIL != do_id_index_id_and_object_validP(id, nodes, $SKIP)) {
                                            {
                                                SubLObject instance = nart_handles.find_nart_by_id(id);
                                                if (NIL != instance) {
                                                    {
                                                        SubLObject set_contents_var = set.do_set_internal(nodes);
                                                        SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                                        SubLObject state = NIL;
                                                        for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                            {
                                                                SubLObject type = set_contents.do_set_contents_next(basis_object, state);
                                                                if (NIL != set_contents.do_set_contents_element_validP(state, type)) {
                                                                    com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_cache_for_relevant_mts($$isa, type, instance);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        id = do_id_index_next_id(idx, NIL, id, state_var);
                                        state_var = do_id_index_next_state(idx, NIL, id, state_var);
                                    } 
                                }
                            }
                        }
                    }
                } else {
                    {
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_cache));
                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                            thread.resetMultipleValues();
                            {
                                SubLObject type = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject subnodes = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject set_contents_var = set.do_set_internal(subnodes);
                                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                    SubLObject state = NIL;
                                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                        {
                                            SubLObject instance = set_contents.do_set_contents_next(basis_object, state);
                                            if (NIL != set_contents.do_set_contents_element_validP(state, instance)) {
                                                com.cyc.cycjava.cycl.sbhl.sbhl_cache.add_to_sbhl_cache_for_relevant_mts($$isa, type, instance);
                                            }
                                        }
                                    }
                                }
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject compute_cached_isas_from_all_mts_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_cache = get_sbhl_all_mts_cache_for_pred($$isa);
        if (NIL != forts.fort_id_index_p(v_cache)) {
            final SubLObject fii = v_cache;
            SubLObject idx = forts.do_fii_get_constants(fii);
            if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                final SubLObject idx_$111 = idx;
                if (NIL == id_index_dense_objects_empty_p(idx_$111, $SKIP)) {
                    final SubLObject vector_var = id_index_dense_objects(idx_$111);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject nodes;
                    SubLObject instance;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject type;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        nodes = aref(vector_var, id);
                        if ((NIL == id_index_tombstone_p(nodes)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            if (NIL != id_index_tombstone_p(nodes)) {
                                nodes = $SKIP;
                            }
                            instance = constants_high.find_constant_by_internal_id(id);
                            if (NIL != instance) {
                                set_contents_var = set.do_set_internal(nodes);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    type = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, type)) {
                                        add_to_sbhl_cache_for_relevant_mts($$isa, type, instance);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$112 = idx;
                if (NIL == id_index_sparse_objects_empty_p(idx_$112)) {
                    final SubLObject cdohash_table = id_index_sparse_objects(idx_$112);
                    SubLObject id2 = NIL;
                    SubLObject nodes2 = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            id2 = getEntryKey(cdohash_entry);
                            nodes2 = getEntryValue(cdohash_entry);
                            final SubLObject instance2 = constants_high.find_constant_by_internal_id(id2);
                            if (NIL != instance2) {
                                final SubLObject set_contents_var2 = set.do_set_internal(nodes2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject type2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    type2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (NIL != set_contents.do_set_contents_element_validP(state2, type2)) {
                                        add_to_sbhl_cache_for_relevant_mts($$isa, type2, instance2);
                                    }
                                }
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            idx = forts.do_fii_get_narts(fii);
            if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                final SubLObject idx_$113 = idx;
                if (NIL == id_index_dense_objects_empty_p(idx_$113, $SKIP)) {
                    final SubLObject vector_var = id_index_dense_objects(idx_$113);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject nodes;
                    SubLObject instance;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject type;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        nodes = aref(vector_var, id);
                        if ((NIL == id_index_tombstone_p(nodes)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            if (NIL != id_index_tombstone_p(nodes)) {
                                nodes = $SKIP;
                            }
                            instance = nart_handles.find_nart_by_id(id);
                            if (NIL != instance) {
                                set_contents_var = set.do_set_internal(nodes);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    type = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, type)) {
                                        add_to_sbhl_cache_for_relevant_mts($$isa, type, instance);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$114 = idx;
                if (NIL == id_index_sparse_objects_empty_p(idx_$114)) {
                    final SubLObject cdohash_table = id_index_sparse_objects(idx_$114);
                    SubLObject id2 = NIL;
                    SubLObject nodes2 = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            id2 = getEntryKey(cdohash_entry);
                            nodes2 = getEntryValue(cdohash_entry);
                            final SubLObject instance2 = nart_handles.find_nart_by_id(id2);
                            if (NIL != instance2) {
                                final SubLObject set_contents_var2 = set.do_set_internal(nodes2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject type2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    type2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (NIL != set_contents.do_set_contents_element_validP(state2, type2)) {
                                        add_to_sbhl_cache_for_relevant_mts($$isa, type2, instance2);
                                    }
                                }
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        } else {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_cache)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject type3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject subnodes = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject set_contents_var3 = set.do_set_internal(subnodes);
                SubLObject basis_object3;
                SubLObject state3;
                SubLObject instance3;
                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                    instance3 = set_contents.do_set_contents_next(basis_object3, state3);
                    if (NIL != set_contents.do_set_contents_element_validP(state3, instance3)) {
                        add_to_sbhl_cache_for_relevant_mts($$isa, type3, instance3);
                    }
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return NIL;
    }

    public static final SubLObject isa_cache_addition_maintainence_alt(SubLObject assertion) {
        com.cyc.cycjava.cycl.sbhl.sbhl_cache.possibly_add_to_sbhl_caches(assertion, $$genls, $$isa);
        return NIL;
    }

    public static SubLObject isa_cache_addition_maintainence(final SubLObject assertion) {
        possibly_add_to_sbhl_caches(assertion, $$genls, $$isa);
        return NIL;
    }

    public static final SubLObject isa_cache_removal_maintainence_alt(SubLObject assertion) {
        com.cyc.cycjava.cycl.sbhl.sbhl_cache.possibly_remove_from_sbhl_caches($$isa, assertion);
        return NIL;
    }

    public static SubLObject isa_cache_removal_maintainence(final SubLObject assertion) {
        possibly_remove_from_sbhl_caches($$isa, assertion);
        return NIL;
    }

    public static final SubLObject reset_cached_isa_relations_alt(SubLObject node) {
        com.cyc.cycjava.cycl.sbhl.sbhl_cache.reset_cached_sbhl_relations_for_node($$isa, node, T);
        return NIL;
    }

    public static SubLObject reset_cached_isa_relations(final SubLObject node) {
        reset_cached_sbhl_relations_for_node($$isa, node, T);
        return NIL;
    }

    public static SubLObject initialize_all_mts_cache_for_quoted_isa() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject set_var = get_cached_nodes_set_for_pred($$quotedIsa);
        final SubLObject set_contents_var = set.do_set_internal(set_var);
        SubLObject basis_object;
        SubLObject state;
        SubLObject type;
        SubLObject node_var;
        SubLObject _prev_bind_0;
        SubLObject _prev_bind_2;
        SubLObject node_var_$115;
        SubLObject deck_type;
        SubLObject recur_deck;
        SubLObject _prev_bind_0_$116;
        SubLObject tv_var;
        SubLObject _prev_bind_0_$117;
        SubLObject _prev_bind_1_$118;
        SubLObject pcase_var;
        SubLObject _prev_bind_0_$118;
        SubLObject _prev_bind_1_$119;
        SubLObject _prev_bind_3;
        SubLObject _prev_bind_4;
        SubLObject _prev_bind_5;
        SubLObject _prev_bind_0_$119;
        SubLObject _prev_bind_1_$120;
        SubLObject _prev_bind_2_$123;
        SubLObject tt_node_var;
        SubLObject cdolist_list_var;
        SubLObject accessible_modules;
        SubLObject module_var;
        SubLObject _prev_bind_0_$120;
        SubLObject _prev_bind_1_$121;
        SubLObject node;
        SubLObject d_link;
        SubLObject mt_links;
        SubLObject iteration_state;
        SubLObject mt;
        SubLObject tv_links;
        SubLObject _prev_bind_0_$121;
        SubLObject iteration_state_$127;
        SubLObject tv;
        SubLObject link_nodes;
        SubLObject _prev_bind_0_$122;
        SubLObject sol;
        SubLObject set_contents_var_$129;
        SubLObject basis_object_$130;
        SubLObject state_$131;
        SubLObject instance;
        SubLObject csome_list_var;
        SubLObject instance2;
        SubLObject csome_list_var2;
        SubLObject instance_tuple;
        SubLObject current;
        SubLObject datum;
        SubLObject link_node;
        SubLObject mt2;
        SubLObject tv2;
        SubLObject _prev_bind_0_$123;
        SubLObject _prev_bind_0_$124;
        SubLObject link_nodes2;
        SubLObject set_contents_var_$130;
        SubLObject basis_object_$131;
        SubLObject state_$132;
        SubLObject csome_list_var_$137;
        SubLObject cdolist_list_var_$138;
        SubLObject new_list;
        SubLObject generating_fn;
        SubLObject _prev_bind_0_$125;
        SubLObject sol2;
        SubLObject link_nodes3;
        SubLObject set_contents_var_$131;
        SubLObject basis_object_$132;
        SubLObject state_$133;
        SubLObject instance3;
        SubLObject csome_list_var3;
        SubLObject instance4;
        SubLObject cdolist_list_var2;
        SubLObject accessible_modules2;
        SubLObject module_var2;
        SubLObject _prev_bind_0_$126;
        SubLObject _prev_bind_1_$122;
        SubLObject node2;
        SubLObject d_link2;
        SubLObject mt_links2;
        SubLObject iteration_state2;
        SubLObject mt3;
        SubLObject tv_links2;
        SubLObject _prev_bind_0_$127;
        SubLObject iteration_state_$128;
        SubLObject link_nodes4;
        SubLObject _prev_bind_0_$128;
        SubLObject sol3;
        SubLObject set_contents_var_$132;
        SubLObject basis_object_$133;
        SubLObject state_$134;
        SubLObject node_vars_link_node;
        SubLObject csome_list_var4;
        SubLObject node_vars_link_node2;
        SubLObject cdolist_list_var_$139;
        SubLObject new_list2;
        SubLObject generating_fn2;
        SubLObject _prev_bind_0_$129;
        SubLObject sol4;
        SubLObject link_nodes5;
        SubLObject set_contents_var_$133;
        SubLObject basis_object_$134;
        SubLObject state_$135;
        SubLObject node_vars_link_node3;
        SubLObject csome_list_var5;
        SubLObject node_vars_link_node4;
        SubLObject _prev_bind_0_$130;
        SubLObject _values;
        SubLObject _prev_bind_0_$131;
        SubLObject _values2;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            type = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, type)) {
                node_var = type;
                _prev_bind_0 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                _prev_bind_2 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$quotedIsa), thread);
                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        node_var_$115 = node_var;
                        deck_type = $STACK;
                        recur_deck = deck.create_deck(deck_type);
                        _prev_bind_0_$116 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                tv_var = NIL;
                                _prev_bind_0_$117 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                _prev_bind_1_$118 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str82$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str82$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str82$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str87$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str82$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    _prev_bind_0_$118 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    _prev_bind_1_$119 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa)), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa))), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa)), thread);
                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                            _prev_bind_0_$119 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            _prev_bind_1_$120 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            _prev_bind_2_$123 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$115, UNPROVIDED);
                                                while (NIL != node_var_$115) {
                                                    tt_node_var = node_var_$115;
                                                    accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$quotedIsa));
                                                    module_var = NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        _prev_bind_0_$120 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$121 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node = function_terms.naut_to_nart(tt_node_var);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                _prev_bind_0_$121 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    for (iteration_state_$127 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$127); iteration_state_$127 = dictionary_contents.do_dictionary_contents_next(iteration_state_$127)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$127);
                                                                                        link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            _prev_bind_0_$122 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    set_contents_var_$129 = set.do_set_internal(sol);
                                                                                                    for (basis_object_$130 = set_contents.do_set_contents_basis_object(set_contents_var_$129), state_$131 = NIL, state_$131 = set_contents.do_set_contents_initial_state(basis_object_$130, set_contents_var_$129); NIL == set_contents.do_set_contents_doneP(basis_object_$130, state_$131); state_$131 = set_contents.do_set_contents_update_state(state_$131)) {
                                                                                                        instance = set_contents.do_set_contents_next(basis_object_$130, state_$131);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state_$131, instance)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(instance)) {
                                                                                                                add_to_sbhl_all_mts_cache($$quotedIsa, type, instance);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        csome_list_var = sol;
                                                                                                        instance2 = NIL;
                                                                                                        instance2 = csome_list_var.first();
                                                                                                        while (NIL != csome_list_var) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if (NIL != forts.fort_p(instance2)) {
                                                                                                                    add_to_sbhl_all_mts_cache($$quotedIsa, type, instance2);
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            instance2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str88$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$122, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$127);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$121, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str89$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                                if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                    csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                    instance_tuple = NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while (NIL != csome_list_var2) {
                                                                        datum = current = instance_tuple;
                                                                        link_node = NIL;
                                                                        mt2 = NIL;
                                                                        tv2 = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list98);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list98);
                                                                        mt2 = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list98);
                                                                        tv2 = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                _prev_bind_0_$123 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        _prev_bind_0_$124 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            link_nodes2 = sol = list(link_node);
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                set_contents_var_$130 = set.do_set_internal(sol);
                                                                                                for (basis_object_$131 = set_contents.do_set_contents_basis_object(set_contents_var_$130), state_$132 = NIL, state_$132 = set_contents.do_set_contents_initial_state(basis_object_$131, set_contents_var_$130); NIL == set_contents.do_set_contents_doneP(basis_object_$131, state_$132); state_$132 = set_contents.do_set_contents_update_state(state_$132)) {
                                                                                                    instance = set_contents.do_set_contents_next(basis_object_$131, state_$132);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state_$132, instance)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(instance)) {
                                                                                                            add_to_sbhl_all_mts_cache($$quotedIsa, type, instance);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    csome_list_var_$137 = sol;
                                                                                                    instance2 = NIL;
                                                                                                    instance2 = csome_list_var_$137.first();
                                                                                                    while (NIL != csome_list_var_$137) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(instance2)) {
                                                                                                                add_to_sbhl_all_mts_cache($$quotedIsa, type, instance2);
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var_$137 = csome_list_var_$137.rest();
                                                                                                        instance2 = csome_list_var_$137.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str88$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$124, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$123, thread);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, $list98);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    } 
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    new_list = cdolist_list_var_$138 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    generating_fn = NIL;
                                                                    generating_fn = cdolist_list_var_$138.first();
                                                                    while (NIL != cdolist_list_var_$138) {
                                                                        _prev_bind_0_$125 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                set_contents_var_$131 = set.do_set_internal(sol2);
                                                                                for (basis_object_$132 = set_contents.do_set_contents_basis_object(set_contents_var_$131), state_$133 = NIL, state_$133 = set_contents.do_set_contents_initial_state(basis_object_$132, set_contents_var_$131); NIL == set_contents.do_set_contents_doneP(basis_object_$132, state_$133); state_$133 = set_contents.do_set_contents_update_state(state_$133)) {
                                                                                    instance3 = set_contents.do_set_contents_next(basis_object_$132, state_$133);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state_$133, instance3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if (NIL != forts.fort_p(instance3)) {
                                                                                            add_to_sbhl_all_mts_cache($$quotedIsa, type, instance3);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    csome_list_var3 = sol2;
                                                                                    instance4 = NIL;
                                                                                    instance4 = csome_list_var3.first();
                                                                                    while (NIL != csome_list_var3) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                            if (NIL != forts.fort_p(instance4)) {
                                                                                                add_to_sbhl_all_mts_cache($$quotedIsa, type, instance4);
                                                                                            }
                                                                                        }
                                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                                        instance4 = csome_list_var3.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str88$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$125, thread);
                                                                        }
                                                                        cdolist_list_var_$138 = cdolist_list_var_$138.rest();
                                                                        generating_fn = cdolist_list_var_$138.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$121, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$120, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    } 
                                                    accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$quotedIsa)));
                                                    module_var2 = NIL;
                                                    module_var2 = cdolist_list_var2.first();
                                                    while (NIL != cdolist_list_var2) {
                                                        _prev_bind_0_$126 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$122 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node2 = function_terms.naut_to_nart(node_var_$115);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link2) {
                                                                    mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links2) {
                                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                            tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                                _prev_bind_0_$127 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                    for (iteration_state_$128 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$128); iteration_state_$128 = dictionary_contents.do_dictionary_contents_next(iteration_state_$128)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$128);
                                                                                        link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            _prev_bind_0_$128 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                sol3 = link_nodes4;
                                                                                                if (NIL != set.set_p(sol3)) {
                                                                                                    set_contents_var_$132 = set.do_set_internal(sol3);
                                                                                                    for (basis_object_$133 = set_contents.do_set_contents_basis_object(set_contents_var_$132), state_$134 = NIL, state_$134 = set_contents.do_set_contents_initial_state(basis_object_$133, set_contents_var_$132); NIL == set_contents.do_set_contents_doneP(basis_object_$133, state_$134); state_$134 = set_contents.do_set_contents_update_state(state_$134)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object_$133, state_$134);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state_$134, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol3.isList()) {
                                                                                                        csome_list_var4 = sol3;
                                                                                                        node_vars_link_node2 = NIL;
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
                                                                                                        Errors.error($str88$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$128, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$128);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$127, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str89$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                    new_list2 = cdolist_list_var_$139 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    generating_fn2 = NIL;
                                                                    generating_fn2 = cdolist_list_var_$139.first();
                                                                    while (NIL != cdolist_list_var_$139) {
                                                                        _prev_bind_0_$129 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                            link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                            if (NIL != set.set_p(sol4)) {
                                                                                set_contents_var_$133 = set.do_set_internal(sol4);
                                                                                for (basis_object_$134 = set_contents.do_set_contents_basis_object(set_contents_var_$133), state_$135 = NIL, state_$135 = set_contents.do_set_contents_initial_state(basis_object_$134, set_contents_var_$133); NIL == set_contents.do_set_contents_doneP(basis_object_$134, state_$135); state_$135 = set_contents.do_set_contents_update_state(state_$135)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object_$134, state_$135);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state_$135, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol4.isList()) {
                                                                                    csome_list_var5 = sol4;
                                                                                    node_vars_link_node4 = NIL;
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
                                                                                    Errors.error($str88$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$129, thread);
                                                                        }
                                                                        cdolist_list_var_$139 = cdolist_list_var_$139.rest();
                                                                        generating_fn2 = cdolist_list_var_$139.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$122, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$126, thread);
                                                        }
                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                        module_var2 = cdolist_list_var2.first();
                                                    } 
                                                    node_var_$115 = deck.deck_pop(recur_deck);
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$123, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$120, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$119, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str90$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$119, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$118, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$118, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$117, thread);
                                }
                            } finally {
                                _prev_bind_0_$130 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    _values = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$130, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$116, thread);
                        }
                    } finally {
                        _prev_bind_0_$131 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            _values2 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$131, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_2, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return NIL;
    }

    public static SubLObject compute_cached_quoted_isas_from_all_mts_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_cache = get_sbhl_all_mts_cache_for_pred($$quotedIsa);
        if (NIL != forts.fort_id_index_p(v_cache)) {
            final SubLObject fii = v_cache;
            SubLObject idx = forts.do_fii_get_constants(fii);
            if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                final SubLObject idx_$158 = idx;
                if (NIL == id_index_dense_objects_empty_p(idx_$158, $SKIP)) {
                    final SubLObject vector_var = id_index_dense_objects(idx_$158);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject nodes;
                    SubLObject instance;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject type;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        nodes = aref(vector_var, id);
                        if ((NIL == id_index_tombstone_p(nodes)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            if (NIL != id_index_tombstone_p(nodes)) {
                                nodes = $SKIP;
                            }
                            instance = constants_high.find_constant_by_internal_id(id);
                            if (NIL != instance) {
                                set_contents_var = set.do_set_internal(nodes);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    type = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, type)) {
                                        add_to_sbhl_cache_for_relevant_mts($$quotedIsa, type, instance);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$159 = idx;
                if (NIL == id_index_sparse_objects_empty_p(idx_$159)) {
                    final SubLObject cdohash_table = id_index_sparse_objects(idx_$159);
                    SubLObject id2 = NIL;
                    SubLObject nodes2 = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            id2 = getEntryKey(cdohash_entry);
                            nodes2 = getEntryValue(cdohash_entry);
                            final SubLObject instance2 = constants_high.find_constant_by_internal_id(id2);
                            if (NIL != instance2) {
                                final SubLObject set_contents_var2 = set.do_set_internal(nodes2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject type2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    type2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (NIL != set_contents.do_set_contents_element_validP(state2, type2)) {
                                        add_to_sbhl_cache_for_relevant_mts($$quotedIsa, type2, instance2);
                                    }
                                }
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            idx = forts.do_fii_get_narts(fii);
            if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                final SubLObject idx_$160 = idx;
                if (NIL == id_index_dense_objects_empty_p(idx_$160, $SKIP)) {
                    final SubLObject vector_var = id_index_dense_objects(idx_$160);
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject nodes;
                    SubLObject instance;
                    SubLObject set_contents_var;
                    SubLObject basis_object;
                    SubLObject state;
                    SubLObject type;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        nodes = aref(vector_var, id);
                        if ((NIL == id_index_tombstone_p(nodes)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            if (NIL != id_index_tombstone_p(nodes)) {
                                nodes = $SKIP;
                            }
                            instance = nart_handles.find_nart_by_id(id);
                            if (NIL != instance) {
                                set_contents_var = set.do_set_internal(nodes);
                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                    type = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, type)) {
                                        add_to_sbhl_cache_for_relevant_mts($$quotedIsa, type, instance);
                                    }
                                }
                            }
                        }
                    }
                }
                final SubLObject idx_$161 = idx;
                if (NIL == id_index_sparse_objects_empty_p(idx_$161)) {
                    final SubLObject cdohash_table = id_index_sparse_objects(idx_$161);
                    SubLObject id2 = NIL;
                    SubLObject nodes2 = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            id2 = getEntryKey(cdohash_entry);
                            nodes2 = getEntryValue(cdohash_entry);
                            final SubLObject instance2 = nart_handles.find_nart_by_id(id2);
                            if (NIL != instance2) {
                                final SubLObject set_contents_var2 = set.do_set_internal(nodes2);
                                SubLObject basis_object2;
                                SubLObject state2;
                                SubLObject type2;
                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                    type2 = set_contents.do_set_contents_next(basis_object2, state2);
                                    if (NIL != set_contents.do_set_contents_element_validP(state2, type2)) {
                                        add_to_sbhl_cache_for_relevant_mts($$quotedIsa, type2, instance2);
                                    }
                                }
                            }
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
        } else {
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_cache)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject type3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject subnodes = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject set_contents_var3 = set.do_set_internal(subnodes);
                SubLObject basis_object3;
                SubLObject state3;
                SubLObject instance3;
                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                    instance3 = set_contents.do_set_contents_next(basis_object3, state3);
                    if (NIL != set_contents.do_set_contents_element_validP(state3, instance3)) {
                        add_to_sbhl_cache_for_relevant_mts($$quotedIsa, type3, instance3);
                    }
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return NIL;
    }

    public static SubLObject quoted_isa_cache_addition_maintainence(final SubLObject assertion) {
        possibly_add_to_sbhl_caches(assertion, $$genls, $$quotedIsa);
        return NIL;
    }

    public static SubLObject quoted_isa_cache_removal_maintainence(final SubLObject assertion) {
        possibly_remove_from_sbhl_caches($$quotedIsa, assertion);
        return NIL;
    }

    public static SubLObject reset_cached_quoted_isa_relations(final SubLObject node) {
        reset_cached_sbhl_relations_for_node($$quotedIsa, node, T);
        return NIL;
    }

    public static SubLObject declare_sbhl_cache_file() {
        declareFunction("note_sbhl_caches_initialized", "NOTE-SBHL-CACHES-INITIALIZED", 0, 0, false);
        declareFunction("sbhl_caches_initialized_p", "SBHL-CACHES-INITIALIZED-P", 0, 0, false);
        declareFunction("sbhl_cache_add_new_additional_fort_typing_collection", "SBHL-CACHE-ADD-NEW-ADDITIONAL-FORT-TYPING-COLLECTION", 1, 0, false);
        declareFunction("all_fort_types", "ALL-FORT-TYPES", 0, 0, false);
        declareFunction("valid_fort_typeP", "VALID-FORT-TYPE?", 1, 0, false);
        new sbhl_cache.$valid_fort_typeP$UnaryFunction();
        declareFunction("sbhl_cache_add_new_additional_fort_typing_collection_quoted", "SBHL-CACHE-ADD-NEW-ADDITIONAL-FORT-TYPING-COLLECTION-QUOTED", 1, 0, false);
        declareMacro("do_sbhl_cached_subsumption_nodes", "DO-SBHL-CACHED-SUBSUMPTION-NODES");
        declareFunction("cached_nodeP", "CACHED-NODE?", 2, 0, false);
        declareFunction("sbhl_id_index_lookup", "SBHL-ID-INDEX-LOOKUP", 2, 0, false);
        declareFunction("get_cached_nodes_set_for_pred", "GET-CACHED-NODES-SET-FOR-PRED", 1, 0, false);
        declareFunction("get_sbhl_cached_nodes_for_pred", "GET-SBHL-CACHED-NODES-FOR-PRED", 1, 0, false);
        declareFunction("valid_cached_predicate_p", "VALID-CACHED-PREDICATE-P", 1, 0, false);
        declareFunction("valid_cached_fort_type_p", "VALID-CACHED-FORT-TYPE-P", 1, 0, false);
        declareFunction("valid_cached_genl_p", "VALID-CACHED-GENL-P", 1, 0, false);
        declareFunction("sbhl_pred_has_caching_p", "SBHL-PRED-HAS-CACHING-P", 1, 0, false);
        declareFunction("print_sbhl_cache_misses_top_n", "PRINT-SBHL-CACHE-MISSES-TOP-N", 0, 1, false);
        declareFunction("sbhl_cache_use_possible_p", "SBHL-CACHE-USE-POSSIBLE-P", 3, 0, false);
        declareFunction("sbhl_cache_use_possible_for_nodes_p", "SBHL-CACHE-USE-POSSIBLE-FOR-NODES-P", 3, 0, false);
        declareFunction("sbhl_cached_predicate_relation_p", "SBHL-CACHED-PREDICATE-RELATION-P", 3, 1, false);
        declareFunction("sbhl_cached_relations_for_node", "SBHL-CACHED-RELATIONS-FOR-NODE", 2, 1, false);
        declareFunction("sbhl_all_subnodes_for_cached_node", "SBHL-ALL-SUBNODES-FOR-CACHED-NODE", 2, 0, false);
        declareFunction("sbhl_cached_relation_p", "SBHL-CACHED-RELATION-P", 3, 0, false);
        declareFunction("sbhl_cached_relations", "SBHL-CACHED-RELATIONS", 2, 0, false);
        declareFunction("get_sbhl_cache_for_pred", "GET-SBHL-CACHE-FOR-PRED", 1, 0, false);
        declareFunction("get_sbhl_cache_for_pred_int", "GET-SBHL-CACHE-FOR-PRED-INT", 1, 0, false);
        declareFunction("get_mts_for_cached_sbhl_relation", "GET-MTS-FOR-CACHED-SBHL-RELATION", 3, 0, false);
        declareFunction("cached_relation_p", "CACHED-RELATION-P", 3, 0, false);
        declareMacro("do_sbhl_cached_relations_for_node", "DO-SBHL-CACHED-RELATIONS-FOR-NODE");
        declareFunction("cached_relations_for_node", "CACHED-RELATIONS-FOR-NODE", 2, 0, false);
        declareFunction("cached_relation_in_cache_p", "CACHED-RELATION-IN-CACHE-P", 4, 0, false);
        declareFunction("sbhl_pred_all_mts_cache_uses_id_index_p", "SBHL-PRED-ALL-MTS-CACHE-USES-ID-INDEX-P", 1, 0, false);
        declareFunction("sbhl_finalize_all_mts_cache", "SBHL-FINALIZE-ALL-MTS-CACHE", 1, 0, false);
        declareFunction("get_sbhl_all_mts_cache_for_pred", "GET-SBHL-ALL-MTS-CACHE-FOR-PRED", 1, 0, false);
        declareFunction("get_sbhl_all_mts_cache_for_pred_int", "GET-SBHL-ALL-MTS-CACHE-FOR-PRED-INT", 1, 0, false);
        declareFunction("possibly_initialize_sbhl_caches_for_pred", "POSSIBLY-INITIALIZE-SBHL-CACHES-FOR-PRED", 1, 0, false);
        declareFunction("initialize_sbhl_caches_for_pred", "INITIALIZE-SBHL-CACHES-FOR-PRED", 1, 0, false);
        declareFunction("possibly_initialize_sbhl_caches_for_pred_and_node", "POSSIBLY-INITIALIZE-SBHL-CACHES-FOR-PRED-AND-NODE", 2, 0, false);
        declareFunction("initialize_sbhl_caches_for_pred_and_node", "INITIALIZE-SBHL-CACHES-FOR-PRED-AND-NODE", 2, 0, false);
        declareFunction("cached_all_mts_relation_p", "CACHED-ALL-MTS-RELATION-P", 3, 0, false);
        declareFunction("cached_all_mts_relations_for_node", "CACHED-ALL-MTS-RELATIONS-FOR-NODE", 2, 0, false);
        declareMacro("do_sbhl_cached_all_mts_relations", "DO-SBHL-CACHED-ALL-MTS-RELATIONS");
        declareMacro("do_sbhl_cached_link_nodes_for_node_in_mt", "DO-SBHL-CACHED-LINK-NODES-FOR-NODE-IN-MT");
        declareMacro("do_sbhl_cached_all_mts_relations_for_node", "DO-SBHL-CACHED-ALL-MTS-RELATIONS-FOR-NODE");
        declareFunction("initialize_sbhl_caches", "INITIALIZE-SBHL-CACHES", 0, 0, false);
        declareFunction("reset_sbhl_cache_for_pred", "RESET-SBHL-CACHE-FOR-PRED", 1, 0, false);
        declareFunction("initialize_all_mts_sbhl_caches", "INITIALIZE-ALL-MTS-SBHL-CACHES", 0, 0, false);
        declareFunction("reset_sbhl_all_mts_cache_for_pred", "RESET-SBHL-ALL-MTS-CACHE-FOR-PRED", 1, 0, false);
        declareFunction("new_sbhl_cache", "NEW-SBHL-CACHE", 0, 0, false);
        declareFunction("new_sbhl_sub_cache", "NEW-SBHL-SUB-CACHE", 0, 0, false);
        declareFunction("initialize_implicit_fort_type_mapping", "INITIALIZE-IMPLICIT-FORT-TYPE-MAPPING", 0, 0, false);
        declareFunction("initialize_all_sbhl_caching", "INITIALIZE-ALL-SBHL-CACHING", 0, 0, false);
        declareFunction("initialize_all_mts_caching_for_pred", "INITIALIZE-ALL-MTS-CACHING-FOR-PRED", 1, 0, false);
        declareFunction("compute_sbhl_cache_from_all_mts_cache", "COMPUTE-SBHL-CACHE-FROM-ALL-MTS-CACHE", 1, 0, false);
        declareFunction("extend_sbhl_caches", "EXTEND-SBHL-CACHES", 4, 0, false);
        declareFunction("add_to_sbhl_cache", "ADD-TO-SBHL-CACHE", 4, 0, false);
        declareFunction("add_to_sbhl_cache_for_relevant_mts", "ADD-TO-SBHL-CACHE-FOR-RELEVANT-MTS", 3, 0, false);
        declareFunction("add_to_sbhl_all_mts_cache", "ADD-TO-SBHL-ALL-MTS-CACHE", 3, 0, false);
        declareFunction("sbhl_cache_addition_maintainence", "SBHL-CACHE-ADDITION-MAINTAINENCE", 1, 0, false);
        declareFunction("possibly_add_to_sbhl_caches", "POSSIBLY-ADD-TO-SBHL-CACHES", 3, 0, false);
        declareFunction("retract_cached_relation", "RETRACT-CACHED-RELATION", 4, 0, false);
        declareFunction("retract_from_sbhl_cache", "RETRACT-FROM-SBHL-CACHE", 4, 0, false);
        declareFunction("retract_from_sbhl_all_mts_cache", "RETRACT-FROM-SBHL-ALL-MTS-CACHE", 3, 0, false);
        declareFunction("sbhl_cache_removal_maintainence", "SBHL-CACHE-REMOVAL-MAINTAINENCE", 1, 0, false);
        declareFunction("possibly_remove_from_sbhl_caches", "POSSIBLY-REMOVE-FROM-SBHL-CACHES", 2, 0, false);
        declareFunction("recache_sbhl_cachesP", "RECACHE-SBHL-CACHES?", 0, 0, false);
        declareFunction("already_in_sbhl_caches_p", "ALREADY-IN-SBHL-CACHES-P", 4, 0, false);
        declareFunction("sbhl_predicate_relation_to_which_cached_nodes", "SBHL-PREDICATE-RELATION-TO-WHICH-CACHED-NODES", 3, 0, false);
        declareFunction("sbhl_predicate_relation_to_which_cached_nodes_excluding_link_node", "SBHL-PREDICATE-RELATION-TO-WHICH-CACHED-NODES-EXCLUDING-LINK-NODE", 4, 0, false);
        declareFunction("clear_sbhl_cached_all_mts_relations_for_node", "CLEAR-SBHL-CACHED-ALL-MTS-RELATIONS-FOR-NODE", 2, 0, false);
        declareFunction("clear_sbhl_cached_relations_for_node", "CLEAR-SBHL-CACHED-RELATIONS-FOR-NODE", 2, 0, false);
        declareFunction("reset_cached_sbhl_relations_for_node", "RESET-CACHED-SBHL-RELATIONS-FOR-NODE", 2, 1, false);
        declareFunction("initialize_all_mts_cache_for_genl_preds_and_inverse", "INITIALIZE-ALL-MTS-CACHE-FOR-GENL-PREDS-AND-INVERSE", 0, 0, false);
        declareFunction("compute_cached_predicates_from_all_mts_cache", "COMPUTE-CACHED-PREDICATES-FROM-ALL-MTS-CACHE", 0, 0, false);
        declareFunction("compute_cached_inverses_from_all_mts_cache", "COMPUTE-CACHED-INVERSES-FROM-ALL-MTS-CACHE", 0, 0, false);
        declareFunction("sbhl_genl_preds_cache_addition_maintainence", "SBHL-GENL-PREDS-CACHE-ADDITION-MAINTAINENCE", 1, 0, false);
        declareFunction("sbhl_genl_preds_cache_removal_maintainence", "SBHL-GENL-PREDS-CACHE-REMOVAL-MAINTAINENCE", 1, 0, false);
        declareFunction("reset_cached_spec_preds_and_spec_inverses", "RESET-CACHED-SPEC-PREDS-AND-SPEC-INVERSES", 1, 0, false);
        declareFunction("reset_cached_genl_pred_and_inverse_relations", "RESET-CACHED-GENL-PRED-AND-INVERSE-RELATIONS", 1, 0, false);
        declareFunction("initialize_all_mts_cache_for_genls", "INITIALIZE-ALL-MTS-CACHE-FOR-GENLS", 0, 0, false);
        declareFunction("compute_cached_genls_from_all_mts_cache", "COMPUTE-CACHED-GENLS-FROM-ALL-MTS-CACHE", 0, 0, false);
        declareFunction("genls_cache_addition_maintainence", "GENLS-CACHE-ADDITION-MAINTAINENCE", 1, 0, false);
        declareFunction("genls_cache_removal_maintainence", "GENLS-CACHE-REMOVAL-MAINTAINENCE", 1, 0, false);
        declareFunction("reset_sbhl_types_of_all_instances", "RESET-SBHL-TYPES-OF-ALL-INSTANCES", 1, 0, false);
        declareFunction("reset_sbhl_types_of_all_quoted_instances", "RESET-SBHL-TYPES-OF-ALL-QUOTED-INSTANCES", 1, 0, false);
        declareFunction("reset_cached_genls_of_all_specs", "RESET-CACHED-GENLS-OF-ALL-SPECS", 1, 0, false);
        declareFunction("reset_cached_genls_relations", "RESET-CACHED-GENLS-RELATIONS", 1, 0, false);
        declareFunction("initialize_all_mts_cache_for_isa", "INITIALIZE-ALL-MTS-CACHE-FOR-ISA", 0, 0, false);
        declareFunction("compute_cached_isas_from_all_mts_cache", "COMPUTE-CACHED-ISAS-FROM-ALL-MTS-CACHE", 0, 0, false);
        declareFunction("isa_cache_addition_maintainence", "ISA-CACHE-ADDITION-MAINTAINENCE", 1, 0, false);
        declareFunction("isa_cache_removal_maintainence", "ISA-CACHE-REMOVAL-MAINTAINENCE", 1, 0, false);
        declareFunction("reset_cached_isa_relations", "RESET-CACHED-ISA-RELATIONS", 1, 0, false);
        declareFunction("initialize_all_mts_cache_for_quoted_isa", "INITIALIZE-ALL-MTS-CACHE-FOR-QUOTED-ISA", 0, 0, false);
        declareFunction("compute_cached_quoted_isas_from_all_mts_cache", "COMPUTE-CACHED-QUOTED-ISAS-FROM-ALL-MTS-CACHE", 0, 0, false);
        declareFunction("quoted_isa_cache_addition_maintainence", "QUOTED-ISA-CACHE-ADDITION-MAINTAINENCE", 1, 0, false);
        declareFunction("quoted_isa_cache_removal_maintainence", "QUOTED-ISA-CACHE-REMOVAL-MAINTAINENCE", 1, 0, false);
        declareFunction("reset_cached_quoted_isa_relations", "RESET-CACHED-QUOTED-ISA-RELATIONS", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_sbhl_cache_file_alt() {
        deflexical("*SBHL-CACHES-INITIALIZED?*", NIL != boundp($sbhl_caches_initializedP$) ? ((SubLObject) ($sbhl_caches_initializedP$.getGlobalValue())) : NIL);
        deflexical("*CACHED-GENL-PREDICATES*", NIL != boundp($cached_genl_predicates$) ? ((SubLObject) ($cached_genl_predicates$.getGlobalValue())) : $list_alt2);
        deflexical("*CACHED-GENL-PREDICATES-SET*", NIL != boundp($cached_genl_predicates_set$) ? ((SubLObject) ($cached_genl_predicates_set$.getGlobalValue())) : construct_set_from_list($cached_genl_predicates$.getGlobalValue(), symbol_function(EQ), UNPROVIDED));
        deflexical("*GENL-PREDICATE-CACHE*", NIL != boundp($genl_predicate_cache$) ? ((SubLObject) ($genl_predicate_cache$.getGlobalValue())) : NIL);
        deflexical("*GENL-INVERSE-CACHE*", NIL != boundp($genl_inverse_cache$) ? ((SubLObject) ($genl_inverse_cache$.getGlobalValue())) : NIL);
        deflexical("*ALL-MTS-GENL-PREDICATE-CACHE*", NIL != boundp($all_mts_genl_predicate_cache$) ? ((SubLObject) ($all_mts_genl_predicate_cache$.getGlobalValue())) : NIL);
        deflexical("*ALL-MTS-GENL-INVERSE-CACHE*", NIL != boundp($all_mts_genl_inverse_cache$) ? ((SubLObject) ($all_mts_genl_inverse_cache$.getGlobalValue())) : NIL);
        deflexical("*CACHED-GENLS*", NIL != boundp($cached_genls$) ? ((SubLObject) ($cached_genls$.getGlobalValue())) : $list_alt9);
        deflexical("*CACHED-GENLS-SET*", NIL != boundp($cached_genls_set$) ? ((SubLObject) ($cached_genls_set$.getGlobalValue())) : construct_set_from_list($cached_genls$.getGlobalValue(), symbol_function(EQ), UNPROVIDED));
        deflexical("*GENLS-CACHE*", NIL != boundp($genls_cache$) ? ((SubLObject) ($genls_cache$.getGlobalValue())) : NIL);
        deflexical("*ALL-MTS-GENLS-CACHE*", NIL != boundp($all_mts_genls_cache$) ? ((SubLObject) ($all_mts_genls_cache$.getGlobalValue())) : NIL);
        defconstant("*DEFINITIONAL-FORT-TYPING-COLLECTIONS*", $list_alt13);
        deflexical("*ADDITIONAL-FORT-TYPING-COLLECTIONS*", NIL != boundp($additional_fort_typing_collections$) ? ((SubLObject) ($additional_fort_typing_collections$.getGlobalValue())) : $list_alt15);
        deflexical("*IMPLICIT-FORT-TYPING-COLLECTIONS*", NIL != boundp($implicit_fort_typing_collections$) ? ((SubLObject) ($implicit_fort_typing_collections$.getGlobalValue())) : $list_alt17);
        deflexical("*CACHED-ISAS*", NIL != boundp($cached_isas$) ? ((SubLObject) ($cached_isas$.getGlobalValue())) : append($definitional_fort_typing_collections$.getGlobalValue(), $additional_fort_typing_collections$.getGlobalValue(), $implicit_fort_typing_collections$.getGlobalValue()));
        deflexical("*CACHED-ISAS-SET*", NIL != boundp($cached_isas_set$) ? ((SubLObject) ($cached_isas_set$.getGlobalValue())) : construct_set_from_list($cached_isas$.getGlobalValue(), symbol_function(EQ), UNPROVIDED));
        deflexical("*ISA-CACHE*", NIL != boundp($isa_cache$) ? ((SubLObject) ($isa_cache$.getGlobalValue())) : NIL);
        deflexical("*IMPLICIT-FORT-TYPE-MAPPING*", NIL != boundp($implicit_fort_type_mapping$) ? ((SubLObject) ($implicit_fort_type_mapping$.getGlobalValue())) : NIL);
        deflexical("*ALL-MTS-ISA-CACHE*", NIL != boundp($all_mts_isa_cache$) ? ((SubLObject) ($all_mts_isa_cache$.getGlobalValue())) : NIL);
        deflexical("*CACHED-PREDS*", NIL != boundp($cached_preds$) ? ((SubLObject) ($cached_preds$.getGlobalValue())) : $list_alt25);
        return NIL;
    }

    public static SubLObject init_sbhl_cache_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*SBHL-CACHES-INITIALIZED?*", SubLTrampolineFile.maybeDefault($sbhl_caches_initializedP$, $sbhl_caches_initializedP$, NIL));
            deflexical("*CACHED-GENL-PREDICATES*", $list1);
            deflexical("*CACHED-GENL-PREDICATES-SET*", set_utilities.construct_set_from_list($cached_genl_predicates$.getGlobalValue(), symbol_function(EQL), UNPROVIDED));
            deflexical("*GENL-PREDICATE-CACHE*", SubLTrampolineFile.maybeDefault($genl_predicate_cache$, $genl_predicate_cache$, NIL));
            deflexical("*GENL-INVERSE-CACHE*", SubLTrampolineFile.maybeDefault($genl_inverse_cache$, $genl_inverse_cache$, NIL));
            deflexical("*ALL-MTS-GENL-PREDICATE-CACHE*", SubLTrampolineFile.maybeDefault($all_mts_genl_predicate_cache$, $all_mts_genl_predicate_cache$, NIL));
            deflexical("*ALL-MTS-GENL-INVERSE-CACHE*", SubLTrampolineFile.maybeDefault($all_mts_genl_inverse_cache$, $all_mts_genl_inverse_cache$, NIL));
            deflexical("*CACHED-GENLS*", $list6);
            deflexical("*CACHED-GENLS-SET*", set_utilities.construct_set_from_list($cached_genls$.getGlobalValue(), symbol_function(EQL), UNPROVIDED));
            deflexical("*GENLS-CACHE*", SubLTrampolineFile.maybeDefault($genls_cache$, $genls_cache$, NIL));
            deflexical("*ALL-MTS-GENLS-CACHE*", SubLTrampolineFile.maybeDefault($all_mts_genls_cache$, $all_mts_genls_cache$, NIL));
            defconstant("*DEFINITIONAL-FORT-TYPING-COLLECTIONS*", $list9);
            deflexical("*ADDITIONAL-FORT-TYPING-COLLECTIONS*", $list10);
            defconstant("*APPLICATION-SPECIFIC-FORT-TYPING-COLLECTIONS*", $list11);
            deflexical("*IMPLICIT-FORT-TYPING-COLLECTIONS*", $list12);
            deflexical("*CACHED-ISAS*", append($definitional_fort_typing_collections$.getGlobalValue(), $additional_fort_typing_collections$.getGlobalValue(), $application_specific_fort_typing_collections$.getGlobalValue(), $implicit_fort_typing_collections$.getGlobalValue()));
            deflexical("*CACHED-ISAS-SET*", set_utilities.construct_set_from_list(reverse($cached_isas$.getGlobalValue()), symbol_function(EQL), UNPROVIDED));
            deflexical("*ISA-CACHE*", SubLTrampolineFile.maybeDefault($isa_cache$, $isa_cache$, NIL));
            deflexical("*IMPLICIT-FORT-TYPE-MAPPING*", SubLTrampolineFile.maybeDefault($implicit_fort_type_mapping$, $implicit_fort_type_mapping$, NIL));
            deflexical("*ALL-MTS-ISA-CACHE*", SubLTrampolineFile.maybeDefault($all_mts_isa_cache$, $all_mts_isa_cache$, NIL));
            deflexical("*CACHED-QUOTED-ISAS*", $list18);
            deflexical("*CACHED-QUOTED-ISAS-SET*", set_utilities.construct_set_from_list(reverse($cached_quoted_isas$.getGlobalValue()), symbol_function(EQL), UNPROVIDED));
            deflexical("*QUOTED-ISA-CACHE*", SubLTrampolineFile.maybeDefault($quoted_isa_cache$, $quoted_isa_cache$, NIL));
            deflexical("*ALL-MTS-QUOTED-ISA-CACHE*", SubLTrampolineFile.maybeDefault($all_mts_quoted_isa_cache$, $all_mts_quoted_isa_cache$, NIL));
            deflexical("*CACHED-PREDS*", $list22);
            defvar("*SBHL-CACHE-MISSES-HASH-TABLE*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SBHL-CACHES-INITIALIZED?*", NIL != boundp($sbhl_caches_initializedP$) ? ((SubLObject) ($sbhl_caches_initializedP$.getGlobalValue())) : NIL);
            deflexical("*CACHED-GENL-PREDICATES*", NIL != boundp($cached_genl_predicates$) ? ((SubLObject) ($cached_genl_predicates$.getGlobalValue())) : $list_alt2);
            deflexical("*CACHED-GENL-PREDICATES-SET*", NIL != boundp($cached_genl_predicates_set$) ? ((SubLObject) ($cached_genl_predicates_set$.getGlobalValue())) : construct_set_from_list($cached_genl_predicates$.getGlobalValue(), symbol_function(EQ), UNPROVIDED));
            deflexical("*GENL-PREDICATE-CACHE*", NIL != boundp($genl_predicate_cache$) ? ((SubLObject) ($genl_predicate_cache$.getGlobalValue())) : NIL);
            deflexical("*GENL-INVERSE-CACHE*", NIL != boundp($genl_inverse_cache$) ? ((SubLObject) ($genl_inverse_cache$.getGlobalValue())) : NIL);
            deflexical("*ALL-MTS-GENL-PREDICATE-CACHE*", NIL != boundp($all_mts_genl_predicate_cache$) ? ((SubLObject) ($all_mts_genl_predicate_cache$.getGlobalValue())) : NIL);
            deflexical("*ALL-MTS-GENL-INVERSE-CACHE*", NIL != boundp($all_mts_genl_inverse_cache$) ? ((SubLObject) ($all_mts_genl_inverse_cache$.getGlobalValue())) : NIL);
            deflexical("*CACHED-GENLS*", NIL != boundp($cached_genls$) ? ((SubLObject) ($cached_genls$.getGlobalValue())) : $list_alt9);
            deflexical("*CACHED-GENLS-SET*", NIL != boundp($cached_genls_set$) ? ((SubLObject) ($cached_genls_set$.getGlobalValue())) : construct_set_from_list($cached_genls$.getGlobalValue(), symbol_function(EQ), UNPROVIDED));
            deflexical("*GENLS-CACHE*", NIL != boundp($genls_cache$) ? ((SubLObject) ($genls_cache$.getGlobalValue())) : NIL);
            deflexical("*ALL-MTS-GENLS-CACHE*", NIL != boundp($all_mts_genls_cache$) ? ((SubLObject) ($all_mts_genls_cache$.getGlobalValue())) : NIL);
            defconstant("*DEFINITIONAL-FORT-TYPING-COLLECTIONS*", $list_alt13);
            deflexical("*ADDITIONAL-FORT-TYPING-COLLECTIONS*", NIL != boundp($additional_fort_typing_collections$) ? ((SubLObject) ($additional_fort_typing_collections$.getGlobalValue())) : $list_alt15);
            deflexical("*IMPLICIT-FORT-TYPING-COLLECTIONS*", NIL != boundp($implicit_fort_typing_collections$) ? ((SubLObject) ($implicit_fort_typing_collections$.getGlobalValue())) : $list_alt17);
            deflexical("*CACHED-ISAS*", NIL != boundp($cached_isas$) ? ((SubLObject) ($cached_isas$.getGlobalValue())) : append($definitional_fort_typing_collections$.getGlobalValue(), $additional_fort_typing_collections$.getGlobalValue(), $implicit_fort_typing_collections$.getGlobalValue()));
            deflexical("*CACHED-ISAS-SET*", NIL != boundp($cached_isas_set$) ? ((SubLObject) ($cached_isas_set$.getGlobalValue())) : construct_set_from_list($cached_isas$.getGlobalValue(), symbol_function(EQ), UNPROVIDED));
            deflexical("*ISA-CACHE*", NIL != boundp($isa_cache$) ? ((SubLObject) ($isa_cache$.getGlobalValue())) : NIL);
            deflexical("*IMPLICIT-FORT-TYPE-MAPPING*", NIL != boundp($implicit_fort_type_mapping$) ? ((SubLObject) ($implicit_fort_type_mapping$.getGlobalValue())) : NIL);
            deflexical("*ALL-MTS-ISA-CACHE*", NIL != boundp($all_mts_isa_cache$) ? ((SubLObject) ($all_mts_isa_cache$.getGlobalValue())) : NIL);
            deflexical("*CACHED-PREDS*", NIL != boundp($cached_preds$) ? ((SubLObject) ($cached_preds$.getGlobalValue())) : $list_alt25);
        }
        return NIL;
    }

    public static SubLObject init_sbhl_cache_file_Previous() {
        deflexical("*SBHL-CACHES-INITIALIZED?*", SubLTrampolineFile.maybeDefault($sbhl_caches_initializedP$, $sbhl_caches_initializedP$, NIL));
        deflexical("*CACHED-GENL-PREDICATES*", $list1);
        deflexical("*CACHED-GENL-PREDICATES-SET*", set_utilities.construct_set_from_list($cached_genl_predicates$.getGlobalValue(), symbol_function(EQL), UNPROVIDED));
        deflexical("*GENL-PREDICATE-CACHE*", SubLTrampolineFile.maybeDefault($genl_predicate_cache$, $genl_predicate_cache$, NIL));
        deflexical("*GENL-INVERSE-CACHE*", SubLTrampolineFile.maybeDefault($genl_inverse_cache$, $genl_inverse_cache$, NIL));
        deflexical("*ALL-MTS-GENL-PREDICATE-CACHE*", SubLTrampolineFile.maybeDefault($all_mts_genl_predicate_cache$, $all_mts_genl_predicate_cache$, NIL));
        deflexical("*ALL-MTS-GENL-INVERSE-CACHE*", SubLTrampolineFile.maybeDefault($all_mts_genl_inverse_cache$, $all_mts_genl_inverse_cache$, NIL));
        deflexical("*CACHED-GENLS*", $list6);
        deflexical("*CACHED-GENLS-SET*", set_utilities.construct_set_from_list($cached_genls$.getGlobalValue(), symbol_function(EQL), UNPROVIDED));
        deflexical("*GENLS-CACHE*", SubLTrampolineFile.maybeDefault($genls_cache$, $genls_cache$, NIL));
        deflexical("*ALL-MTS-GENLS-CACHE*", SubLTrampolineFile.maybeDefault($all_mts_genls_cache$, $all_mts_genls_cache$, NIL));
        defconstant("*DEFINITIONAL-FORT-TYPING-COLLECTIONS*", $list9);
        deflexical("*ADDITIONAL-FORT-TYPING-COLLECTIONS*", $list10);
        defconstant("*APPLICATION-SPECIFIC-FORT-TYPING-COLLECTIONS*", $list11);
        deflexical("*IMPLICIT-FORT-TYPING-COLLECTIONS*", $list12);
        deflexical("*CACHED-ISAS*", append($definitional_fort_typing_collections$.getGlobalValue(), $additional_fort_typing_collections$.getGlobalValue(), $application_specific_fort_typing_collections$.getGlobalValue(), $implicit_fort_typing_collections$.getGlobalValue()));
        deflexical("*CACHED-ISAS-SET*", set_utilities.construct_set_from_list(reverse($cached_isas$.getGlobalValue()), symbol_function(EQL), UNPROVIDED));
        deflexical("*ISA-CACHE*", SubLTrampolineFile.maybeDefault($isa_cache$, $isa_cache$, NIL));
        deflexical("*IMPLICIT-FORT-TYPE-MAPPING*", SubLTrampolineFile.maybeDefault($implicit_fort_type_mapping$, $implicit_fort_type_mapping$, NIL));
        deflexical("*ALL-MTS-ISA-CACHE*", SubLTrampolineFile.maybeDefault($all_mts_isa_cache$, $all_mts_isa_cache$, NIL));
        deflexical("*CACHED-QUOTED-ISAS*", $list18);
        deflexical("*CACHED-QUOTED-ISAS-SET*", set_utilities.construct_set_from_list(reverse($cached_quoted_isas$.getGlobalValue()), symbol_function(EQL), UNPROVIDED));
        deflexical("*QUOTED-ISA-CACHE*", SubLTrampolineFile.maybeDefault($quoted_isa_cache$, $quoted_isa_cache$, NIL));
        deflexical("*ALL-MTS-QUOTED-ISA-CACHE*", SubLTrampolineFile.maybeDefault($all_mts_quoted_isa_cache$, $all_mts_quoted_isa_cache$, NIL));
        deflexical("*CACHED-PREDS*", $list22);
        defvar("*SBHL-CACHE-MISSES-HASH-TABLE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_sbhl_cache_file_alt() {
        declare_defglobal($sbhl_caches_initializedP$);
        declare_defglobal($cached_genl_predicates$);
        declare_defglobal($cached_genl_predicates_set$);
        declare_defglobal($genl_predicate_cache$);
        declare_defglobal($genl_inverse_cache$);
        declare_defglobal($all_mts_genl_predicate_cache$);
        declare_defglobal($all_mts_genl_inverse_cache$);
        declare_defglobal($cached_genls$);
        declare_defglobal($cached_genls_set$);
        declare_defglobal($genls_cache$);
        declare_defglobal($all_mts_genls_cache$);
        declare_defglobal($additional_fort_typing_collections$);
        declare_defglobal($implicit_fort_typing_collections$);
        declare_defglobal($cached_isas$);
        declare_defglobal($cached_isas_set$);
        declare_defglobal($isa_cache$);
        declare_defglobal($implicit_fort_type_mapping$);
        declare_defglobal($all_mts_isa_cache$);
        declare_defglobal($cached_preds$);
        return NIL;
    }

    public static SubLObject setup_sbhl_cache_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal($sbhl_caches_initializedP$);
            declare_defglobal($genl_predicate_cache$);
            declare_defglobal($genl_inverse_cache$);
            declare_defglobal($all_mts_genl_predicate_cache$);
            declare_defglobal($all_mts_genl_inverse_cache$);
            declare_defglobal($genls_cache$);
            declare_defglobal($all_mts_genls_cache$);
            declare_defglobal($isa_cache$);
            declare_defglobal($implicit_fort_type_mapping$);
            declare_defglobal($all_mts_isa_cache$);
            declare_defglobal($quoted_isa_cache$);
            declare_defglobal($all_mts_quoted_isa_cache$);
        }
        if (SubLFiles.USE_V2) {
            declare_defglobal($sbhl_caches_initializedP$);
            declare_defglobal($cached_genl_predicates$);
            declare_defglobal($cached_genl_predicates_set$);
            declare_defglobal($cached_genls$);
            declare_defglobal($cached_genls_set$);
            declare_defglobal($additional_fort_typing_collections$);
            declare_defglobal($implicit_fort_typing_collections$);
            declare_defglobal($cached_isas$);
            declare_defglobal($cached_isas_set$);
            declare_defglobal($cached_preds$);
        }
        return NIL;
    }

    public static SubLObject setup_sbhl_cache_file_Previous() {
        declare_defglobal($sbhl_caches_initializedP$);
        declare_defglobal($genl_predicate_cache$);
        declare_defglobal($genl_inverse_cache$);
        declare_defglobal($all_mts_genl_predicate_cache$);
        declare_defglobal($all_mts_genl_inverse_cache$);
        declare_defglobal($genls_cache$);
        declare_defglobal($all_mts_genls_cache$);
        declare_defglobal($isa_cache$);
        declare_defglobal($implicit_fort_type_mapping$);
        declare_defglobal($all_mts_isa_cache$);
        declare_defglobal($quoted_isa_cache$);
        declare_defglobal($all_mts_quoted_isa_cache$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_cache_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_cache_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_cache_file();
    }

    static {
    }

    public static final class $valid_fort_typeP$UnaryFunction extends UnaryFunction {
        public $valid_fort_typeP$UnaryFunction() {
            super(extractFunctionNamed("VALID-FORT-TYPE?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return valid_fort_typeP(arg1);
        }
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $sbhl_caches_initializedP$ = makeSymbol("*SBHL-CACHES-INITIALIZED?*");

    static private final SubLList $list_alt2 = list(reader_make_constant_shell("conceptuallyRelated"));

    static private final SubLList $list_alt9 = list(new SubLObject[]{ reader_make_constant_shell("CycLExpression"), reader_make_constant_shell("CycLFormula"), reader_make_constant_shell("CycLIndexedTerm"), reader_make_constant_shell("CycLReifiableDenotationalTerm"), reader_make_constant_shell("CycLSentence"), reader_make_constant_shell("CycLSentence-Askable"), reader_make_constant_shell("CycLSentence-Assertible"), reader_make_constant_shell("GenericArgTemplate"), reader_make_constant_shell("KeywordVariableTemplate"), reader_make_constant_shell("Microtheory"), reader_make_constant_shell("SubLList") });

    static private final SubLList $list_alt13 = list(reader_make_constant_shell("Collection"), reader_make_constant_shell("Predicate"), reader_make_constant_shell("Function-Denotational"), reader_make_constant_shell("Microtheory"));

    static private final SubLList $list_alt15 = list(new SubLObject[]{ reader_make_constant_shell("AntiSymmetricBinaryPredicate"), reader_make_constant_shell("AntiTransitiveBinaryPredicate"), reader_make_constant_shell("ArgTypeBinaryPredicate"), reader_make_constant_shell("ArgTypeTernaryPredicate"), reader_make_constant_shell("AsymmetricBinaryPredicate"), reader_make_constant_shell("BookkeepingPredicate"), reader_make_constant_shell("BroadMicrotheory"), reader_make_constant_shell("CommutativeRelation"), reader_make_constant_shell("DistributingMetaKnowledgePredicate"), reader_make_constant_shell("DocumentationPredicate"), reader_make_constant_shell("ELRelation"), reader_make_constant_shell("EvaluatableFunction"), reader_make_constant_shell("EvaluatablePredicate"), reader_make_constant_shell("ExistentialQuantifier"), reader_make_constant_shell("ExistentialQuantifier-Bounded"), reader_make_constant_shell("IrreflexiveBinaryPredicate"), reader_make_constant_shell("LogicalConnective"), reader_make_constant_shell("MicrotheoryDesignatingRelation"), reader_make_constant_shell("NLDefinitenessAttribute"), reader_make_constant_shell("NLQuantAttribute"), reader_make_constant_shell("PartiallyCommutativeRelation"), reader_make_constant_shell("ProblemSolvingCntxt"), reader_make_constant_shell("Quantifier"), reader_make_constant_shell("ReflexiveBinaryPredicate"), reader_make_constant_shell("ReifiableFunction"), reader_make_constant_shell("RuleMacroPredicate"), reader_make_constant_shell("SKSIContentMicrotheory"), reader_make_constant_shell("SKSIExternalTermDenotingFunction"), reader_make_constant_shell("SKSISupportedComparisonPredicate"), reader_make_constant_shell("SKSISupportedFunction"), reader_make_constant_shell("SKSISupportedConstant"), reader_make_constant_shell("CSQLComparisonPredicate"), reader_make_constant_shell("CSQLFunction"), reader_make_constant_shell("CSQLConstantFunction"), reader_make_constant_shell("CSQLLogicalConnective"), reader_make_constant_shell("CSQLQuantifier"), reader_make_constant_shell("ScopingRelation"), reader_make_constant_shell("SiblingDisjointCollectionType"), reader_make_constant_shell("SkolemFunction"), reader_make_constant_shell("SpeechPart"), reader_make_constant_shell("SymmetricBinaryPredicate"), reader_make_constant_shell("TransitiveBinaryPredicate"), reader_make_constant_shell("TruthFunction"), reader_make_constant_shell("VariableArityRelation") });

    static private final SubLList $list_alt17 = list(reader_make_constant_shell("Relation"));

    static private final SubLList $list_alt25 = list(reader_make_constant_shell("isa"), reader_make_constant_shell("genls"), reader_make_constant_shell("genlPreds"), reader_make_constant_shell("genlInverse"));

    static private final SubLList $list_alt26 = list(list(makeSymbol("NODE-VAR"), makeSymbol("PRED")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt33$sbhl_cached_predicate_relation_p_ = makeString("sbhl-cached-predicate-relation-p call invalid! (or *sbhl-caches-initialized?*[~A] *suspend-sbhl-cache-use?*[~A])");

    static private final SubLList $list_alt35 = list(list(makeSymbol("CACHED-NODE-VAR"), makeSymbol("MTS-VAR"), makeSymbol("SUBNODE"), makeSymbol("PRED")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym36$SUBNODES_VAR = makeUninternedSymbol("SUBNODES-VAR");

    static private final SubLString $str_alt44$All_Mts_cache_is_missing_for__A_ = makeString("All Mts cache is missing for ~A.");

    static private final SubLList $list_alt45 = list(list(makeSymbol("LINK-NODE-VAR"), makeSymbol("SUBNODE-VAR"), makeSymbol("PRED")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym46$SUBNODES = makeUninternedSymbol("SUBNODES");

    static private final SubLSymbol $sym47$NODES = makeUninternedSymbol("NODES");

    static private final SubLSymbol $sym48$CACHE = makeUninternedSymbol("CACHE");

    static private final SubLList $list_alt53 = list(list(makeSymbol("CACHED-LINK-NODE"), makeSymbol("PRED"), makeSymbol("SUBNODE"), makeSymbol("MT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym54$CACHE = makeUninternedSymbol("CACHE");

    static private final SubLSymbol $sym55$CACHED_NODES_STORE = makeUninternedSymbol("CACHED-NODES-STORE");

    static private final SubLSymbol $sym56$MEMBER_ = makeSymbol("MEMBER?");

    static private final SubLList $list_alt57 = list(list(makeSymbol("CACHED-LINK-NODE"), makeSymbol("PRED"), makeSymbol("SUBNODE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym58$CACHE = makeUninternedSymbol("CACHE");

    static private final SubLSymbol $sym59$SUBNODES = makeUninternedSymbol("SUBNODES");

    static private final SubLSymbol $sym62$SET_MEMBER_ = makeSymbol("SET-MEMBER?");

    static private final SubLList $list_alt63 = list(reader_make_constant_shell("genlPreds"), reader_make_constant_shell("genlInverse"), reader_make_constant_shell("genls"), reader_make_constant_shell("isa"));

    static private final SubLList $list_alt71 = list(reader_make_constant_shell("genlPreds"), reader_make_constant_shell("genls"), reader_make_constant_shell("isa"));

    static private final SubLString $str_alt72$Computing_all_mts_SBHL_caches_ = makeString("Computing all-mts SBHL caches.");

    static private final SubLString $str_alt73$Computing_SBHL_caches_from_all_mt = makeString("Computing SBHL caches from all-mts caches.");

    static private final SubLString $str_alt81$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt86$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt87$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt88$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLString $str_alt90$genlPreds___genlInverse_after_add = makeString("genlPreds / genlInverse after adding used for assertion with predicate ~a.");

    static private final SubLList $list_alt95 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));
}

/**
 * Total time: 3475 ms
 */
