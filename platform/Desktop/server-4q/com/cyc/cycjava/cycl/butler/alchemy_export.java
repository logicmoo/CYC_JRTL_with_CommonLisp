package com.cyc.cycjava.cycl.butler;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.arity;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.constants_high;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.folification;
import com.cyc.cycjava.cycl.format_cycl_expression;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.id_index;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_info;
import com.cyc.cycjava.cycl.term;
import com.cyc.cycjava.cycl.uncanonicalizer;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.verbosifier;
import com.cyc.cycjava.cycl.virtual_indexing;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class alchemy_export extends SubLTranslatedFile
{
    public static final SubLFile me = new alchemy_export();
    public static final String myName = "com.cyc.cycjava.cycl.butler.alchemy_export";
    public static final String myFingerPrint = "f93f198b092b391aea3f548dca30c74396343e741da70e23a484d3e581039697";
    private static SubLSymbol $alchemy_export_cafs_or_rulesP$ = null;
    private static SubLSymbol $atomic_assertion_selection_criteria$ = null;
    private static SubLSymbol $assertion_selection_arg_types_by_operator$ = null;
    private static SubLSymbol $delayed_atomic_assertion_selection_criteria$ = null;
    private static SubLSymbol $delayed_assertion_selection_criterion_operators$ = null;
    private static SubLSymbol $ae_number_of_sentences$ = null;
    private static SubLSymbol $ae_number_of_training_predicates$ = null;
    private static SubLSymbol $ae_number_of_evidence_terms$ = null;
    private static SubLSymbol $alchemy_export_numeric_terms$ = null;
    private static SubLSymbol $alchemy_export_dropped_predicates$ = null;
    private static SubLSymbol $alchemy_folification_properties$ = null;
    private static SubLSymbol $alchemy_export_sentential_relation_caching_state$ = null;
    private static SubLSymbol $alchemy_export_type_prefix$ = null;
    private static SubLSymbol $alchemy_export_predicate_prefix$ = null;
    private static SubLSymbol $alchemy_export_constant_prefix$ = null;
    private static SubLSymbol $alchemy_export_hl_id_prefix$ = null;
    private static SubLSymbol $double_quote_string$ = null;
    public static SubLSymbol $central_regression_dir$ = null;
    private static SubLSymbol $regression_calls$ = null;
    private static final SubLSymbol $kw0$BOTH = SubLObjectFactory.makeKeyword("BOTH");
    private static final SubLSymbol $kw1$SKIP = SubLObjectFactory.makeKeyword("SKIP");
    private static final SubLString $str2$____Inference_answers_in_Alchemy_ = SubLObjectFactory.makeString("/*~%Inference answers in Alchemy format~%Created on ~A~%");
    private static final SubLString $str3$Generated_from_KB__A_running_on_C = SubLObjectFactory.makeString("Generated from KB ~A running on CycL version ~A~%");
    private static final SubLString $str4$Query_sentence___S__Mt___S_______ = SubLObjectFactory.makeString("Query sentence: ~S~%Mt: ~S~%*/~%~%");
    private static final SubLSymbol $kw5$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
    private static final SubLString $str6$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
    private static final SubLSymbol $sym7$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
    private static final SubLString $str8$____Couldn_t_export_the_sentence_ = SubLObjectFactory.makeString("/*~%Couldn't export the sentence ~S:~%~A~%*/");
    private static final SubLSymbol $kw9$ALCHEMY = SubLObjectFactory.makeKeyword("ALCHEMY");
    private static final SubLSymbol $sym10$ATOMIC_ASSERTION_SELECTION_CRITERION_P = SubLObjectFactory.makeSymbol("ATOMIC-ASSERTION-SELECTION-CRITERION-P");
    private static final SubLString $str11$Invalid_assertion_selection_crite = SubLObjectFactory.makeString("Invalid assertion-selection criterion ~S: neither a keyword nor a proper list");
    private static final SubLSymbol $kw12$RULE = SubLObjectFactory.makeKeyword("RULE");
    private static final SubLSymbol $kw13$GAF = SubLObjectFactory.makeKeyword("GAF");
    private static final SubLList $list14 = ConsesLow.cons(SubLObjectFactory.makeSymbol("OPERATOR"), SubLObjectFactory.makeSymbol("ARGS"));
    private static final SubLSymbol $kw15$NOT_FOUND = SubLObjectFactory.makeKeyword("NOT-FOUND");
    private static final SubLString $str16$Invalid_assertion_selection_crite = SubLObjectFactory.makeString("Invalid assertion-selection criterion ~S: unknown operator ~S");
    private static final SubLString $str17$The_assertion_selection_operator_ = SubLObjectFactory.makeString("The assertion-selection operator ~S requires exactly ~S arguments ~S.  ~S arguments were passed in ~S");
    private static final SubLSymbol $kw18$CRITERION = SubLObjectFactory.makeKeyword("CRITERION");
    private static final SubLString $str19$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
    private static final SubLList $list20 = ConsesLow.list(new SubLObject[] {
        SubLObjectFactory.makeKeyword("UNION"), SubLObjectFactory.makeKeyword("CRITERION"), SubLObjectFactory.makeKeyword("INTERSECTION"), SubLObjectFactory.makeKeyword("CRITERION"), SubLObjectFactory.makeKeyword("EXCEPTION"), ConsesLow.list(SubLObjectFactory.makeKeyword("CRITERION"), SubLObjectFactory.makeKeyword("CRITERION")), SubLObjectFactory.makeKeyword("IN-MT"), ConsesLow.list(SubLObjectFactory.makeSymbol("HLMT-P")), SubLObjectFactory.makeKeyword("VISIBLE-FROM-MT"), ConsesLow.list(SubLObjectFactory.makeSymbol("HLMT-P")),
        SubLObjectFactory.makeKeyword("COLLECTION-EXTENT"), ConsesLow.list(SubLObjectFactory.makeSymbol("COLLECTION-P")), SubLObjectFactory.makeKeyword("COLLECTION-EXTENTS"), ConsesLow.list(SubLObjectFactory.makeSymbol("CYCL-DENOTATIONAL-TERM-P")), SubLObjectFactory.makeKeyword("COLLECTION-EXTENTS-QUOTED"), ConsesLow.list(SubLObjectFactory.makeSymbol("COLLECTION-P")), SubLObjectFactory.makeKeyword("PREDICATE-EXTENT"), ConsesLow.list(SubLObjectFactory.makeSymbol("PREDICATE-P")), SubLObjectFactory.makeKeyword("PREDICATE-EXTENTS"), ConsesLow.list(SubLObjectFactory.makeSymbol("CYCL-DENOTATIONAL-TERM-P")),
        SubLObjectFactory.makeKeyword("PREDICATE-EXTENTS-QUOTED"), ConsesLow.list(SubLObjectFactory.makeSymbol("COLLECTION-P")), SubLObjectFactory.makeKeyword("ASSERTIONS-MEETING-CRITERION-PLUS-EXTENTS-OF-PREDICATES-MENTIONED"), ConsesLow.list(SubLObjectFactory.makeKeyword("CRITERION")), SubLObjectFactory.makeKeyword("ASSERTIONS-MEETING-CRITERION-PLUS-EXTENTS-OF-PREDICATES-AND-COLLECTIONS-MENTIONED"), ConsesLow.list(SubLObjectFactory.makeKeyword("CRITERION")), SubLObjectFactory.makeKeyword("MENTIONS-TERM"), ConsesLow.list(SubLObjectFactory.makeSymbol("INDEXED-TERM-P")), SubLObjectFactory.makeKeyword("MENTIONS-TERM-AT-LEAST-N-TIMES"), ConsesLow.list(SubLObjectFactory.makeSymbol("INDEXED-TERM-P"), SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P")),
        SubLObjectFactory.makeKeyword("MENTIONS-TERM-IN-ARGPOS"), ConsesLow.list(SubLObjectFactory.makeSymbol("INDEXED-TERM-P"), SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P")), SubLObjectFactory.makeKeyword("MENTIONS-ANY-INSTANTIATION-OF"), ConsesLow.list(SubLObjectFactory.makeSymbol("CYCL-DENOTATIONAL-TERM-P")), SubLObjectFactory.makeKeyword("MENTIONS-ANY-QUOTED-INSTANCE-OF"), ConsesLow.list(SubLObjectFactory.makeSymbol("COLLECTION-P")), SubLObjectFactory.makeKeyword("MENTIONS-INSTANTIATIONS-OF-AT-LEAST-N-TIMES"), ConsesLow.list(SubLObjectFactory.makeSymbol("CYCL-DENOTATIONAL-TERM-P"), SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P")), SubLObjectFactory.makeKeyword("MENTIONS-QUOTED-INSTANCES-OF-AT-LEAST-N-TIMES"), ConsesLow.list(SubLObjectFactory.makeSymbol("COLLECTION-P"), SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P")),
        SubLObjectFactory.makeKeyword("MENTIONS-ANY-INSTANTIATION-OF-IN-ARGPOS"), ConsesLow.list(SubLObjectFactory.makeSymbol("CYCL-DENOTATIONAL-TERM-P"), SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P")), SubLObjectFactory.makeKeyword("MENTIONS-ANY-QUOTED-INSTANCE-OF-IN-ARGPOS"), ConsesLow.list(SubLObjectFactory.makeSymbol("COLLECTION-P"), SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P")), SubLObjectFactory.makeKeyword("MENTIONS-ALL-INSTANTIATIONS-OF"), ConsesLow.list(SubLObjectFactory.makeSymbol("CYCL-DENOTATIONAL-TERM-P")), SubLObjectFactory.makeKeyword("MENTIONS-ALL-QUOTED-INSTANCES-OF"), ConsesLow.list(SubLObjectFactory.makeSymbol("COLLECTION-P")), SubLObjectFactory.makeKeyword("MENTIONS-ONLY-INSTANTIATIONS-OF"), ConsesLow.list(SubLObjectFactory.makeSymbol("CYCL-DENOTATIONAL-TERM-P")),
        SubLObjectFactory.makeKeyword("MENTIONS-ONLY-QUOTED-INSTANCES-OF"), ConsesLow.list(SubLObjectFactory.makeSymbol("COLLECTION-P"))
    });
    private static final SubLSymbol $sym21$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
    private static final SubLString $str22$Unknown_atomic_assertion_selectio = SubLObjectFactory.makeString("Unknown atomic assertion-selection criterion: ~S");
    private static final SubLSymbol $kw23$UNION = SubLObjectFactory.makeKeyword("UNION");
    private static final SubLSymbol $sym24$FIND_ASSERTIONS_BY_CRITERION_INT = SubLObjectFactory.makeSymbol("FIND-ASSERTIONS-BY-CRITERION-INT");
    private static final SubLSymbol $kw25$INTERSECTION = SubLObjectFactory.makeKeyword("INTERSECTION");
    private static final SubLSymbol $kw26$EXCEPTION = SubLObjectFactory.makeKeyword("EXCEPTION");
    private static final SubLList $list27 = ConsesLow.list(SubLObjectFactory.makeSymbol("POSITIVE-CRITERION"), SubLObjectFactory.makeSymbol("NEGATIVE-CRITERION"));
    private static final SubLSymbol $kw28$IN_MT = SubLObjectFactory.makeKeyword("IN-MT");
    private static final SubLList $list29 = ConsesLow.list(SubLObjectFactory.makeSymbol("MT"));
    private static final SubLSymbol $kw30$VISIBLE_FROM_MT = SubLObjectFactory.makeKeyword("VISIBLE-FROM-MT");
    private static final SubLSymbol $kw31$COLLECTION_EXTENT = SubLObjectFactory.makeKeyword("COLLECTION-EXTENT");
    private static final SubLList $list32 = ConsesLow.list(SubLObjectFactory.makeSymbol("COLL"));
    private static final SubLSymbol $kw33$COLLECTION_EXTENTS = SubLObjectFactory.makeKeyword("COLLECTION-EXTENTS");
    private static final SubLList $list34 = ConsesLow.list(SubLObjectFactory.makeSymbol("SET-OR-COLL"));
    private static final SubLSymbol $kw35$COLLECTION_EXTENTS_QUOTED = SubLObjectFactory.makeKeyword("COLLECTION-EXTENTS-QUOTED");
    private static final SubLSymbol $kw36$PREDICATE_EXTENT = SubLObjectFactory.makeKeyword("PREDICATE-EXTENT");
    private static final SubLList $list37 = ConsesLow.list(SubLObjectFactory.makeSymbol("PRED"));
    private static final SubLSymbol $kw38$PREDICATE_EXTENTS = SubLObjectFactory.makeKeyword("PREDICATE-EXTENTS");
    private static final SubLSymbol $kw39$PREDICATE_EXTENTS_QUOTED = SubLObjectFactory.makeKeyword("PREDICATE-EXTENTS-QUOTED");
    private static final SubLSymbol $kw40$ASSERTIONS_MEETING_CRITERION_PLUS_EXTENTS_OF_PREDICATES_MENTIONED = SubLObjectFactory.makeKeyword("ASSERTIONS-MEETING-CRITERION-PLUS-EXTENTS-OF-PREDICATES-MENTIONED");
    private static final SubLList $list41 = ConsesLow.list(SubLObjectFactory.makeSymbol("CRITERION"));
    private static final SubLSymbol $kw42$ASSERTIONS_MEETING_CRITERION_PLUS_EXTENTS_OF_PREDICATES_AND_COLLE = SubLObjectFactory.makeKeyword("ASSERTIONS-MEETING-CRITERION-PLUS-EXTENTS-OF-PREDICATES-AND-COLLECTIONS-MENTIONED");
    private static final SubLSymbol $kw43$MENTIONS_TERM = SubLObjectFactory.makeKeyword("MENTIONS-TERM");
    private static final SubLList $list44 = ConsesLow.list(SubLObjectFactory.makeSymbol("TERM"));
    private static final SubLSymbol $kw45$MENTIONS_TERM_AT_LEAST_N_TIMES = SubLObjectFactory.makeKeyword("MENTIONS-TERM-AT-LEAST-N-TIMES");
    private static final SubLList $list46 = ConsesLow.list(SubLObjectFactory.makeSymbol("TERM"), SubLObjectFactory.makeSymbol("N"));
    private static final SubLSymbol $kw47$MENTIONS_TERM_IN_ARGPOS = SubLObjectFactory.makeKeyword("MENTIONS-TERM-IN-ARGPOS");
    private static final SubLList $list48 = ConsesLow.list(SubLObjectFactory.makeSymbol("TERM"), SubLObjectFactory.makeSymbol("ARGPOS"));
    private static final SubLSymbol $kw49$MENTIONS_ANY_INSTANTIATION_OF = SubLObjectFactory.makeKeyword("MENTIONS-ANY-INSTANTIATION-OF");
    private static final SubLSymbol $kw50$MENTIONS_ANY_QUOTED_INSTANCE_OF = SubLObjectFactory.makeKeyword("MENTIONS-ANY-QUOTED-INSTANCE-OF");
    private static final SubLSymbol $kw51$MENTIONS_INSTANTIATIONS_OF_AT_LEAST_N_TIMES = SubLObjectFactory.makeKeyword("MENTIONS-INSTANTIATIONS-OF-AT-LEAST-N-TIMES");
    private static final SubLList $list52 = ConsesLow.list(SubLObjectFactory.makeSymbol("SET-OR-COLL"), SubLObjectFactory.makeSymbol("N"));
    private static final SubLSymbol $kw53$MENTIONS_QUOTED_INSTANCES_OF_AT_LEAST_N_TIMES = SubLObjectFactory.makeKeyword("MENTIONS-QUOTED-INSTANCES-OF-AT-LEAST-N-TIMES");
    private static final SubLList $list54 = ConsesLow.list(SubLObjectFactory.makeSymbol("COLL"), SubLObjectFactory.makeSymbol("N"));
    private static final SubLSymbol $kw55$MENTIONS_ANY_INSTANTIATION_OF_IN_ARGPOS = SubLObjectFactory.makeKeyword("MENTIONS-ANY-INSTANTIATION-OF-IN-ARGPOS");
    private static final SubLList $list56 = ConsesLow.list(SubLObjectFactory.makeSymbol("SET-OR-COLL"), SubLObjectFactory.makeSymbol("ARGPOS"));
    private static final SubLSymbol $kw57$MENTIONS_ANY_QUOTED_INSTANCE_OF_IN_ARGPOS = SubLObjectFactory.makeKeyword("MENTIONS-ANY-QUOTED-INSTANCE-OF-IN-ARGPOS");
    private static final SubLList $list58 = ConsesLow.list(SubLObjectFactory.makeSymbol("COLL"), SubLObjectFactory.makeSymbol("ARGPOS"));
    private static final SubLSymbol $kw59$MENTIONS_ALL_INSTANTIATIONS_OF = SubLObjectFactory.makeKeyword("MENTIONS-ALL-INSTANTIATIONS-OF");
    private static final SubLSymbol $kw60$MENTIONS_ALL_QUOTED_INSTANCES_OF = SubLObjectFactory.makeKeyword("MENTIONS-ALL-QUOTED-INSTANCES-OF");
    private static final SubLSymbol $kw61$MENTIONS_ONLY_INSTANTIATIONS_OF = SubLObjectFactory.makeKeyword("MENTIONS-ONLY-INSTANTIATIONS-OF");
    private static final SubLSymbol $kw62$MENTIONS_ONLY_QUOTED_INSTANCES_OF = SubLObjectFactory.makeKeyword("MENTIONS-ONLY-QUOTED-INSTANCES-OF");
    private static final SubLString $str63$Invalid_assertion_selection_crite = SubLObjectFactory.makeString("Invalid assertion-selection criterion ~S: neither a keyword nor a list");
    private static final SubLSymbol $sym64$DELAYED_ASSERTION_SELECTION_CRITERION_ = SubLObjectFactory.makeSymbol("DELAYED-ASSERTION-SELECTION-CRITERION?");
    private static final SubLString $str65$Internal_error__Invalid_atomic_cr = SubLObjectFactory.makeString("Internal error: Invalid atomic criterion for find-assertions-meeting-criterion-among: ~S");
    private static final SubLString $str66$Internal_error__Invalid_criterion = SubLObjectFactory.makeString("Internal error: Invalid criterion operator for find-assertions-meeting-criterion-among: ~S");
    private static final SubLObject $const67$InferencePSC = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("InferencePSC"));
    private static final SubLObject $const68$not = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("not"));
    private static final SubLObject $const69$and = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("and"));
    private static final SubLObject $const70$or = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("or"));
    private static final SubLString $str71$Collecting_assertions_visible_fro = SubLObjectFactory.makeString("Collecting assertions visible from ");
    private static final SubLSymbol $sym72$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
    private static final SubLSymbol $sym73$RELEVANT_ASSERTION_ = SubLObjectFactory.makeSymbol("RELEVANT-ASSERTION?");
    private static final SubLSymbol $sym74$RELEVANT_MT_IS_ANY_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-ANY-MT");
    private static final SubLObject $const75$isa = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("isa"));
    private static final SubLSymbol $sym76$ASSERTION_PREDICATES = SubLObjectFactory.makeSymbol("ASSERTION-PREDICATES");
    private static final SubLSymbol $sym77$PREDICATE_P = SubLObjectFactory.makeSymbol("PREDICATE-P");
    private static final SubLSymbol $sym78$ASSERTION_PREDICATES_AND_COLLECTIONS = SubLObjectFactory.makeSymbol("ASSERTION-PREDICATES-AND-COLLECTIONS");
    private static final SubLString $str79$__finding_pred_or_coll_extent_for = SubLObjectFactory.makeString("  finding pred-or-coll-extent for: ~A~%");
    private static final SubLSymbol $sym80$PREDICATE_OR_COLLECTION_P = SubLObjectFactory.makeSymbol("PREDICATE-OR-COLLECTION-P");
    private static final SubLSymbol $kw81$TRUE = SubLObjectFactory.makeKeyword("TRUE");
    private static final SubLString $str82$_5D_seconds_duration__ = SubLObjectFactory.makeString("~5D seconds duration~%");
    private static final SubLSymbol $sym83$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
    private static final SubLString $str84$_S_and__S_are_not_lists_of_the_sa = SubLObjectFactory.makeString("~S and ~S are not lists of the same length");
    private static final SubLString $str85$_____5D_training_gafs__ = SubLObjectFactory.makeString("~%~%~5D training gafs~%");
    private static final SubLString $str86$_5D_training_terms__ = SubLObjectFactory.makeString("~5D training terms~%");
    private static final SubLString $str87$_5D_training_rules__ = SubLObjectFactory.makeString("~5D training rules~%");
    private static final SubLString $str88$_5D_training_predicates__ = SubLObjectFactory.makeString("~5D training predicates~%");
    private static final SubLString $str89$_5D_evidence_gafs__ = SubLObjectFactory.makeString("~5D evidence gafs~%");
    private static final SubLString $str90$_5D_evidence_terms__ = SubLObjectFactory.makeString("~5D evidence terms~%");
    private static final SubLString $str91$_5D_types__ = SubLObjectFactory.makeString("~5D types~%");
    private static final SubLSymbol $sym92$CONSP = SubLObjectFactory.makeSymbol("CONSP");
    private static final SubLSymbol $sym93$INTEGERP = SubLObjectFactory.makeSymbol("INTEGERP");
    private static final SubLString $str94$Finding_Alchemy_export_assertions = SubLObjectFactory.makeString("Finding Alchemy export assertions for training~%");
    private static final SubLString $str95$training_gafs = SubLObjectFactory.makeString("training gafs");
    private static final SubLString $str96$__Finding_Alchemy_export_assertio = SubLObjectFactory.makeString("~%Finding Alchemy export assertions for rules~%");
    private static final SubLString $str97$training_rules = SubLObjectFactory.makeString("training rules");
    private static final SubLSymbol $sym98$LISTP = SubLObjectFactory.makeSymbol("LISTP");
    private static final SubLString $str99$__Finding_Alchemy_export_assertio = SubLObjectFactory.makeString("~%Finding Alchemy export assertions for evidence~%");
    private static final SubLString $str100$evidence_gafs = SubLObjectFactory.makeString("evidence gafs");
    private static final SubLSymbol $sym101$DICTIONARY_P = SubLObjectFactory.makeSymbol("DICTIONARY-P");
    private static final SubLString $str102$allowed_types = SubLObjectFactory.makeString("allowed types");
    private static final SubLSymbol $sym103$SET_P = SubLObjectFactory.makeSymbol("SET-P");
    private static final SubLSymbol $sym104$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
    private static final SubLString $str105$____dropped_gaf_from_export_becau = SubLObjectFactory.makeString("    dropped gaf from export because ~A is not an allowed type:~%      ~A~%");
    private static final SubLString $str106$Exporting_Alchemy_gaf_file__A__ = SubLObjectFactory.makeString("Exporting Alchemy gaf file ~A~%");
    private static final SubLString $str107$__considering_____A__ = SubLObjectFactory.makeString("~%considering :  ~A~%");
    private static final SubLString $str108$_____A_is_not_an_allowed_type__ = SubLObjectFactory.makeString("    ~A is not an allowed type~%");
    private static final SubLString $str109$_____A_is_not_a_reified_predicate = SubLObjectFactory.makeString("    ~A is not a reified predicate~%");
    private static final SubLString $str110$____dropped_rule_from_export____A = SubLObjectFactory.makeString("    dropped rule from export:  ~A~%");
    private static final SubLList $list111 = ConsesLow.list(SubLObjectFactory.makeSymbol("TRAINING-FOL-PREDICATES"), SubLObjectFactory.makeSymbol("TRAINING-FOL-ARGUMENTS"));
    private static final SubLString $str112$Exporting_Alchemy_rules_file__A__ = SubLObjectFactory.makeString("Exporting Alchemy rules file ~A~%");
    private static final SubLList $list113 = ConsesLow.list(SubLObjectFactory.makeSymbol("ALL-FOL-PREDICATES"), SubLObjectFactory.makeSymbol("ALL-FOL-ARGUMENTS"));
    private static final SubLList $list114 = ConsesLow.list(SubLObjectFactory.makeSymbol("FOL-PREDICATE-FN"), SubLObjectFactory.makeSymbol("PREDICATE"), SubLObjectFactory.makeSymbol("ARITY"));
    private static final SubLString $str115$__dropping_predicate__A_having_ar = SubLObjectFactory.makeString("  dropping predicate ~A having arg constraint ~A which is not an allowed type~%");
    private static final SubLString $str116$_A_must_be_a_GAF = SubLObjectFactory.makeString("~A must be a GAF");
    private static final SubLObject $const117$Thing = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Thing"));
    private static final SubLObject $const118$Collection = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Collection"));
    private static final SubLString $str119$_A_is_not_a_valid_type__from_obj_ = SubLObjectFactory.makeString("~A is not a valid type, from obj: ~A");
    private static final SubLString $str120$__augmenting_type__A__ = SubLObjectFactory.makeString("  augmenting type ~A~%");
    private static final SubLString $str121$_A_is_not_a_valid_type = SubLObjectFactory.makeString("~A is not a valid type");
    private static final SubLString $str122$____with__A__ = SubLObjectFactory.makeString("    with ~A~%");
    private static final SubLString $str123$__Instantiated_types_in_the__A___ = SubLObjectFactory.makeString("~%Instantiated types in the ~A ~%");
    private static final SubLString $str124$___A___A__ = SubLObjectFactory.makeString("  ~A  ~A~%");
    private static final SubLObject $const125$FOL_UnhandledFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("FOL-UnhandledFn"));
    private static final SubLString $str126$_____A_cannot_be_folified__ = SubLObjectFactory.makeString("    ~A cannot be folified~%");
    private static final SubLString $str127$_____A_is_not_instantiated_in_ter = SubLObjectFactory.makeString("    ~A is not instantiated in term-set~%");
    private static final SubLString $str128$________adding_instance__A_of__A_ = SubLObjectFactory.makeString("        adding instance ~A of ~A~%");
    private static final SubLString $str129$____hl_variable__A_cannot_be_inst = SubLObjectFactory.makeString("    hl variable ~A cannot be instantiated with training terms~%");
    private static final SubLString $str130$____dropped_numeric_term_assertio = SubLObjectFactory.makeString("    dropped numeric-term assertion from export:  ~A~%");
    private static final SubLObject $const131$CollectionIntersectionFn = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("CollectionIntersectionFn"));
    private static final SubLList $list132;
    private static final SubLObject $const133$EverythingPSC = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("EverythingPSC"));
    private static final SubLList $list134;
    private static final SubLSymbol $kw135$FOL_SENTENCES_DATA = SubLObjectFactory.makeKeyword("FOL-SENTENCES-DATA");
    private static final SubLList $list136 = ConsesLow.list(SubLObjectFactory.makeSymbol("TERM"), SubLObjectFactory.makeSymbol("FOL-SENTENCE"), SubLObjectFactory.makeSymbol("&OPTIONAL"), SubLObjectFactory.makeSymbol("UNHANDLED-FOL-SENTENCES"));
    private static final SubLString $str137$____dropped_unhandled_fol_asserti = SubLObjectFactory.makeString("    dropped unhandled-fol assertion from export: ~A~%~%");
    private static final SubLList $list138 = ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("comment")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("cyclistNotes")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("cycSecureDocString")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("examples-Negative")));
    private static final SubLString $str139$__predicate__A__types__A__ = SubLObjectFactory.makeString("  predicate ~A  types ~A~%");
    private static final SubLString $str140$____adding_instance__A_of__A__ = SubLObjectFactory.makeString("    adding instance ~A of ~A~%");
    private static final SubLString $str141$_____A_is_not_instantiated__ = SubLObjectFactory.makeString("    ~A is not instantiated~%");
    private static final SubLString $str142$____dropped_gaf_from_export____A_ = SubLObjectFactory.makeString("    dropped gaf from export:  ~A~%");
    private static final SubLString $str143$_____A_is_not_a_training_type__ = SubLObjectFactory.makeString("    ~A is not a training type~%");
    private static final SubLString $str144$_____A_is_not_a_training_type____ = SubLObjectFactory.makeString("    ~A is not a training type~%    dropped gaf from export:  ~A~%");
    private static final SubLString $str145$____dropped_evidence_gaf_from_exp = SubLObjectFactory.makeString("    dropped evidence gaf from export because ~A is not an allowed predicate:~%      ~A~%");
    private static final SubLSymbol $kw146$RULES = SubLObjectFactory.makeKeyword("RULES");
    private static final SubLSymbol $kw147$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
    private static final SubLSymbol $sym148$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
    private static final SubLString $str149$invalid_instances_for_arg_constra = SubLObjectFactory.makeString("invalid instances for arg-constraint ~A");
    private static final SubLString $str150$___groundings___10D_fol_predicate = SubLObjectFactory.makeString("   groundings: ~10D fol-predicate: ~A ");
    private static final SubLString $str151$_arg_types___A = SubLObjectFactory.makeString(" arg-types: ~A");
    private static final SubLString $str152$___total_groundings___12D__ = SubLObjectFactory.makeString("   total groundings: ~12D~%");
    private static final SubLString $str153$_ = SubLObjectFactory.makeString("(");
    private static final SubLString $str154$_ = SubLObjectFactory.makeString(",");
    private static final SubLString $str155$_ = SubLObjectFactory.makeString(")");
    private static final SubLObject $const156$thereExistRange = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("thereExistRange"));
    private static final SubLString $str157$Can_t_convert_non_predicate_non_c = SubLObjectFactory.makeString("Can't convert non-predicate non-collection to FOL predicate: ~S");
    private static final SubLString $str158$_mln = SubLObjectFactory.makeString(".mln");
    private static final SubLString $str159$_db = SubLObjectFactory.makeString(".db");
    private static final SubLString $str160$__exporting_type___A___A__ = SubLObjectFactory.makeString("  exporting type: ~A  ~A~%");
    private static final SubLString $str161$____ = SubLObjectFactory.makeString(" = {");
    private static final SubLString $str162$__ = SubLObjectFactory.makeString(", ");
    private static final SubLString $str163$_ = SubLObjectFactory.makeString("}");
    private static final SubLSymbol $kw164$CAFS = SubLObjectFactory.makeKeyword("CAFS");
    private static final SubLList $list165 = ConsesLow.list(SubLObjectFactory.makeSymbol("PREDICATES"), SubLObjectFactory.makeSymbol("ARGUMENTS"));
    private static final SubLString $str166$_S_is_not_a_valid_value_for__alch = SubLObjectFactory.makeString("~S is not a valid value for *alchemy-export-cafs-or-rules?*");
    private static final SubLSymbol $kw167$MT_HANDLING = SubLObjectFactory.makeKeyword("MT-HANDLING");
    private static final SubLList $list168 = ConsesLow.list(SubLObjectFactory.makeKeyword("COLLAPSE"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("EverythingPSC")));
    private static final SubLSymbol $kw169$ALLOW_EQUIV_RELATION_ = SubLObjectFactory.makeKeyword("ALLOW-EQUIV-RELATION?");
    private static final SubLSymbol $kw170$RETURN_DATA_ = SubLObjectFactory.makeKeyword("RETURN-DATA?");
    private static final SubLSymbol $kw171$RULE_MACRO_PREDICATE_HANDLING = SubLObjectFactory.makeKeyword("RULE-MACRO-PREDICATE-HANDLING");
    private static final SubLSymbol $kw172$EXPANSION = SubLObjectFactory.makeKeyword("EXPANSION");
    private static final SubLSymbol $kw173$INCLUDE_COMMENTS_ = SubLObjectFactory.makeKeyword("INCLUDE-COMMENTS?");
    private static final SubLSymbol $sym174$SINGLETON_ = SubLObjectFactory.makeSymbol("SINGLETON?");
    private static final SubLObject $const175$implies = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("implies"));
    private static final SubLObject $const176$equiv = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("equiv"));
    private static final SubLList $list177 = ConsesLow.list(SubLObjectFactory.makeSymbol("LEFT-SIDE"), SubLObjectFactory.makeSymbol("RIGHT-SIDE"));
    private static final SubLObject $const178$forAll = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("forAll"));
    private static final SubLObject $const179$thereExists = constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("thereExists"));
    private static final SubLList $list180 = ConsesLow.list(SubLObjectFactory.makeSymbol("VAR"), SubLObjectFactory.makeSymbol("SENT"));
    private static final SubLString $str181$_ = SubLObjectFactory.makeString(" ");
    private static final SubLString $str182$_ = SubLObjectFactory.makeString(".");
    private static final SubLSymbol $sym183$ALCHEMY_EXPORT_SENTENTIAL_RELATION = SubLObjectFactory.makeSymbol("ALCHEMY-EXPORT-SENTENTIAL-RELATION");
    private static final SubLString $str184$_ = SubLObjectFactory.makeString("!");
    private static final SubLString $str185$___ = SubLObjectFactory.makeString(" ^ ");
    private static final SubLString $str186$_v_ = SubLObjectFactory.makeString(" v ");
    private static final SubLString $str187$____ = SubLObjectFactory.makeString(" => ");
    private static final SubLString $str188$_____ = SubLObjectFactory.makeString(" <=> ");
    private static final SubLString $str189$forall_ = SubLObjectFactory.makeString("forall ");
    private static final SubLString $str190$exist_ = SubLObjectFactory.makeString("exist ");
    private static final SubLString $str191$Don_t_know_how_to_export_the_sent = SubLObjectFactory.makeString("Don't know how to export the sentential relation ~S to alchemy.");
    private static final SubLSymbol $sym192$_ALCHEMY_EXPORT_SENTENTIAL_RELATION_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*ALCHEMY-EXPORT-SENTENTIAL-RELATION-CACHING-STATE*");
    private static final SubLString $str193$type = SubLObjectFactory.makeString("type");
    private static final SubLString $str194$pred = SubLObjectFactory.makeString("pred");
    private static final SubLString $str195$Don_t_know_how_to_export_the_type = SubLObjectFactory.makeString("Don't know how to export the type ~S to alchemy.");
    private static final SubLString $str196$Don_t_know_how_to_export_the_pred = SubLObjectFactory.makeString("Don't know how to export the predicate ~S to alchemy.");
    private static final SubLString $str197$Don_t_know_how_to_export_the_term = SubLObjectFactory.makeString("Don't know how to export the term ~S to alchemy.");
    private static final SubLString $str198$C_ = SubLObjectFactory.makeString("C_");
    private static final SubLString $str199$HLID_ = SubLObjectFactory.makeString("HLID_");
    private static final SubLList $list200 = ConsesLow.list(SubLObjectFactory.makeSymbol("FOL-ATOMIC-TERM-FN"), SubLObjectFactory.makeSymbol("CONSTANT"));
    private static final SubLString $str201$Tried_to_convert_the_EL_variable_ = SubLObjectFactory.makeString("Tried to convert the EL variable ~S to Alchemy text and got ~S");
    private static final SubLString $str202$_ = SubLObjectFactory.makeString("\"");
    private static final SubLList $list203 = ConsesLow.list(SubLObjectFactory.makeSymbol("FOL-STRING-FN"), SubLObjectFactory.makeSymbol("STRING"));
    private static final SubLList $list204 = ConsesLow.list(SubLObjectFactory.makeSymbol("FOL-NUMBER-FN"), SubLObjectFactory.makeSymbol("NUMBER"));
    private static final SubLString $str205$_F = SubLObjectFactory.makeString("~F");
    private static final SubLString $str206$_D = SubLObjectFactory.makeString("~D");
    private static final SubLSymbol $sym207$VALID_ALCHEMY_IDENTIFIER_CHAR_P = SubLObjectFactory.makeSymbol("VALID-ALCHEMY-IDENTIFIER-CHAR-P");
    private static final SubLString $str208$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/regression-tests/");
    private static final SubLString $str209$A = SubLObjectFactory.makeString("A");
    private static final SubLList $list210 = ConsesLow.list(SubLObjectFactory.makeSymbol("ALCHEMY-EXPORT"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AlchemyDemoRulesMt")))), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AlchemyDemoTrainingGAFsMt")))), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AlchemyDemoEvidenceGAFsMt"))))), SubLObjectFactory.makeString("A-rules.mln"), SubLObjectFactory.makeString("A-train.db"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeString("A-evid.db"))));
    private static final SubLString $str211$B = SubLObjectFactory.makeString("B");
    private static final SubLList $list212 = ConsesLow.list(SubLObjectFactory.makeSymbol("ALCHEMY-EXPORT"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AlchemyCyclistRulesMt")))), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AlchemyCyclistTrainingDataMt")))), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AlchemyCyclistTestingDataMt"))))), SubLObjectFactory.makeString("B-rules.mln"), SubLObjectFactory.makeString("B-train.db"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeString("B-evid.db"))));
    private static final SubLString $str213$C = SubLObjectFactory.makeString("C");
    private static final SubLList $list214 = ConsesLow.list(SubLObjectFactory.makeSymbol("ALCHEMY-EXPORT"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("TheSimpsonsMt")))), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("TheSimpsonsMt")))), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("TheSimpsonsMt"))))), SubLObjectFactory.makeString("C-rules.mln"), SubLObjectFactory.makeString("C-train.db"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeString("C-evid.db"))));
    private static final SubLString $str215$D = SubLObjectFactory.makeString("D");
    private static final SubLList $list216 = ConsesLow.list(SubLObjectFactory.makeSymbol("ALCHEMY-EXPORT"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AcademicOrganizationMt")))), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("UniversityDataMt")))), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("UniversityDataMt"))))), SubLObjectFactory.makeString("D-rules.mln"), SubLObjectFactory.makeString("D-train.db"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeString("D-evid.db"))));
    private static final SubLString $str217$E = SubLObjectFactory.makeString("E");
    private static final SubLList $list218 = ConsesLow.list(SubLObjectFactory.makeSymbol("ALCHEMY-EXPORT"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AlchemyDemoIIRulesMt")))), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AustinAreaMt")))), ConsesLow.list(SubLObjectFactory.makeSymbol("BQ-LIST"), ConsesLow.list(SubLObjectFactory.makeSymbol("BQ-LIST"), SubLObjectFactory.makeKeyword("IN-MT"), ConsesLow.list(SubLObjectFactory.makeSymbol("CANONICALIZE-TERM"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("ContentMtFn")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("WashingtonPostEntertainmentGuide-KS"))))))), SubLObjectFactory.makeString("E-rules.mln"), SubLObjectFactory.makeString("E-train.db"), ConsesLow.list(SubLObjectFactory.makeSymbol("QUOTE"), ConsesLow.list(SubLObjectFactory.makeString("E-evid.db"))));
    private static final SubLString $str219$_scratch_alchemytemp_cyc_projects = SubLObjectFactory.makeString("/scratch/alchemytemp/cyc/projects/transfer-learning/Software/Alchemy/mods/regression-tests/");
    private static final SubLString $str220$Got_invalid_regression_test_name_ = SubLObjectFactory.makeString("Got invalid regression test name: ~S.");
    private static final SubLSymbol $sym221$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
    private static final SubLString $str222$_S__ = SubLObjectFactory.makeString("~S~%");
    private static final SubLList $list223 = ConsesLow.list(SubLObjectFactory.makeKeyword("INTERSECTION"), SubLObjectFactory.makeKeyword("RULE"), ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AcademicOrganizationMt"))));
    private static final SubLList $list224 = ConsesLow.list(SubLObjectFactory.makeKeyword("INTERSECTION"), SubLObjectFactory.makeKeyword("GAF"), ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("UniversityDataMt"))));
    private static final SubLList $list225 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("INTERSECTION"), SubLObjectFactory.makeKeyword("GAF"), ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("UniversityDataMt")))));
    private static final SubLString $str226$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/cyc-univ-rules.mln");
    private static final SubLString $str227$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/cyc-univ-train.db");
    private static final SubLList $list228 = ConsesLow.list(SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/cyc-univ-evid.db"));
    private static final SubLList $list229 = ConsesLow.list(SubLObjectFactory.makeKeyword("INTERSECTION"), SubLObjectFactory.makeKeyword("RULE"), ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AlchemyCyclistRulesMt"))));
    private static final SubLList $list230 = ConsesLow.list(SubLObjectFactory.makeKeyword("INTERSECTION"), SubLObjectFactory.makeKeyword("GAF"), ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AlchemyCyclistTrainingDataMt"))));
    private static final SubLList $list231 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("INTERSECTION"), SubLObjectFactory.makeKeyword("GAF"), ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AlchemyCyclistTestingDataMt")))));
    private static final SubLString $str232$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/cyclist-rules.mln");
    private static final SubLString $str233$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/cyclist-train.db");
    private static final SubLList $list234 = ConsesLow.list(SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/cyclist-evid.db"));
    private static final SubLList $list235 = ConsesLow.list(SubLObjectFactory.makeKeyword("INTERSECTION"), SubLObjectFactory.makeKeyword("RULE"), ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("UnitedStatesGeographyMt"))));
    private static final SubLList $list236 = ConsesLow.list(SubLObjectFactory.makeKeyword("INTERSECTION"), SubLObjectFactory.makeKeyword("GAF"), ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AustinAreaMt"))));
    private static final SubLList $list237 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("INTERSECTION"), SubLObjectFactory.makeKeyword("GAF"), ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AustinAreaMt")))));
    private static final SubLString $str238$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/austin-rules.mln");
    private static final SubLString $str239$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/austin-train.db");
    private static final SubLList $list240 = ConsesLow.list(SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/austin-evid.db"));
    private static final SubLList $list241 = ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("UnitedStatesGeographyMt")));
    private static final SubLList $list242 = ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AustinAreaMt")));
    private static final SubLList $list243 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AustinAreaMt"))));
    private static final SubLString $str244$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/austin2-rules.mln");
    private static final SubLString $str245$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/austin2-train.db");
    private static final SubLList $list246 = ConsesLow.list(SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/austin2-evid.db"));
    private static final SubLList $list247 = ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("BuildingMt")));
    private static final SubLList $list248 = ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("UrbanCombatGame-UCTApartmentsMapMt")));
    private static final SubLList $list249 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("UrbanCombatGame-UCTApartmentsMapMt"))));
    private static final SubLString $str250$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-buildingmt-rules.mln");
    private static final SubLString $str251$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-buildingmt-train.db");
    private static final SubLList $list252 = ConsesLow.list(SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-buildingmt-evid.db"));
    private static final SubLList $list253 = ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("MassMediaMt")));
    private static final SubLList $list254 = ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("MassMediaDataMt")));
    private static final SubLList $list255 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Starseeker-ActorsKSMt"))));
    private static final SubLString $str256$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/movie-rules.mln");
    private static final SubLString $str257$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/movie-train.db");
    private static final SubLList $list258 = ConsesLow.list(SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/movie-evid.db"));
    private static final SubLList $list259;
    private static final SubLString $str260$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-vocab-rules.mln");
    private static final SubLString $str261$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-vocab-train.db");
    private static final SubLList $list262 = ConsesLow.list(SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-vocab-evid.db"));
    private static final SubLList $list263 = ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("NaiveSpatialMt")));
    private static final SubLString $str264$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-ns-rules.mln");
    private static final SubLString $str265$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-ns-train.db");
    private static final SubLList $list266 = ConsesLow.list(SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/uc-ns-evid.db"));
    private static final SubLList $list267 = ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("TheSimpsonsMt")));
    private static final SubLList $list268 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("TheSimpsonsMt"))));
    private static final SubLString $str269$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/simp-rules.mln");
    private static final SubLString $str270$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/simp-train.db");
    private static final SubLList $list271 = ConsesLow.list(SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/simp-evid.db"));
    private static final SubLString $str272$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/ucb-rules.mln");
    private static final SubLString $str273$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/ucb-train.db");
    private static final SubLList $list274 = ConsesLow.list(SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/ucb-evid.db"));
    private static final SubLList $list275 = ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AlchemyDemoRulesMt")));
    private static final SubLList $list276 = ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AlchemyDemoTrainingGAFsMt")));
    private static final SubLList $list277 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AlchemyDemoEvidenceGAFsMt"))));
    private static final SubLString $str278$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo-rules.mln");
    private static final SubLString $str279$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo-train.db");
    private static final SubLList $list280 = ConsesLow.list(SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo-evid.db"));
    private static final SubLList $list281 = ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AlchemyDemoIIRulesMt")));
    private static final SubLList $list282 = ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("ContentMtFn")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("WashingtonPostEntertainmentGuide-KS")));
    private static final SubLString $str283$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo2-rules.mln");
    private static final SubLString $str284$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo2-train.db");
    private static final SubLList $list285 = ConsesLow.list(SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo2-evid.db"));
    private static final SubLList $list286 = ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AmbientConditionsMt")));
    private static final SubLList $list287 = ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("AmbientConditionsDataMt")));
    private static final SubLList $list288 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("IN-MT"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("CIAWorldFactbook1997Mt"))));
    private static final SubLString $str289$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo4-rules.mln");
    private static final SubLString $str290$_cyc_projects_transfer_learning_S = SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo4-train.db");
    private static final SubLList $list291 = ConsesLow.list(SubLObjectFactory.makeString("/cyc/projects/transfer-learning/Software/Alchemy/mods/exdata/demo4-evid.db"));
    private static final SubLSymbol $sym292$CYCL_SENTENCE_TO_ALCHEMY_SENTENCES = SubLObjectFactory.makeSymbol("CYCL-SENTENCE-TO-ALCHEMY-SENTENCES");
    private static final SubLSymbol $kw293$TEST = SubLObjectFactory.makeKeyword("TEST");
    private static final SubLSymbol $kw294$OWNER = SubLObjectFactory.makeKeyword("OWNER");
    private static final SubLSymbol $kw295$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
    private static final SubLSymbol $kw296$KB = SubLObjectFactory.makeKeyword("KB");
    private static final SubLSymbol $kw297$FULL = SubLObjectFactory.makeKeyword("FULL");
    private static final SubLSymbol $kw298$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
    private static final SubLList $list299;
    private static final SubLSymbol $sym300$ALCHEMY_EXPORT_PREDICATE_WITH_ARITY = SubLObjectFactory.makeSymbol("ALCHEMY-EXPORT-PREDICATE-WITH-ARITY");
    private static final SubLList $list301;
    private static final SubLSymbol $sym302$ALCHEMY_EXPORT_FOL_TERM = SubLObjectFactory.makeSymbol("ALCHEMY-EXPORT-FOL-TERM");
    private static final SubLList $list303 = ConsesLow.list(ConsesLow.list(ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("FOL-AtomicTermFn")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Thing")))), SubLObjectFactory.makeString("C_Thing")), ConsesLow.list(ConsesLow.list(ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("FOL-FunctionFn")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("EnglishSuffixationFn"))), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("FOL-StringFn")), SubLObjectFactory.makeString("glory")), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("FOL-StringFn")), SubLObjectFactory.makeString("ous")))), SubLObjectFactory.makeString("HLID_330D831E190FA462663436343161662D396332392D313162312D396461642D6333373936333666373237300F85676C6F72790F836F7573")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("?WHAT")), SubLObjectFactory.makeString("what")), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("??WHAT")), SubLObjectFactory.makeString("what")), ConsesLow.list(ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("FOL-StringFn")), SubLObjectFactory.makeString("blork"))), SubLObjectFactory.makeString("\"blork\"")), ConsesLow.list(ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("FOL-NumberFn")), SubLObjectFactory.makeInteger(-4))), SubLObjectFactory.makeString("-4")));
    private static final SubLSymbol $sym304$ALCHEMY_CONSTANT_P = SubLObjectFactory.makeSymbol("ALCHEMY-CONSTANT-P");
    private static final SubLSymbol $kw305$TINY = SubLObjectFactory.makeKeyword("TINY");
    private static final SubLList $list306;
    private static final SubLSymbol $sym307$ALCHEMY_VARIABLE_P = SubLObjectFactory.makeSymbol("ALCHEMY-VARIABLE-P");
    private static final SubLList $list308;
    private static final SubLSymbol $sym309$ALCHEMY_IDENTIFIER_P = SubLObjectFactory.makeSymbol("ALCHEMY-IDENTIFIER-P");
    private static final SubLList $list310;

    static
    {
        $list132 = ConsesLow.list(NIL);
        $list134 = ConsesLow.list(new SubLObject[] {
            SubLObjectFactory.makeKeyword("ALLOW-INDETERMINATE-RESULTS?"), NIL, SubLObjectFactory.makeKeyword("DISJUNCTION-FREE-EL-VARS-POLICY"), SubLObjectFactory.makeKeyword("COMPUTE-INTERSECTION"), SubLObjectFactory.makeKeyword("MAX-TIME"), SubLObjectFactory.makeInteger(30), SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), ZERO_INTEGER, SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), SubLObjectFactory.makeDouble(1.0D),
            SubLObjectFactory.makeKeyword("ANSWER-LANGUAGE"), SubLObjectFactory.makeKeyword("HL"), SubLObjectFactory.makeKeyword("CONTINUABLE?"), T
        });
        $list259 = ConsesLow.list(SubLObjectFactory.makeKeyword("MENTIONS-INSTANTIATIONS-OF-AT-LEAST-N-TIMES"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("PredicateOrCollection-UsedInUCTRepresentation")), TWO_INTEGER);
        $list299 = ConsesLow.list(new SubLObject[] {
            ConsesLow.list(ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("likesAsFriend")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("RonaldReagan")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Madonna")))), SubLObjectFactory.makeString("\npred2C_likesAsFriend(C_RonaldReagan,C_Madonna)\n(pred2C_likesAsFriend(arg1,ins)) => (pred1C_PerceptualAgent-Embodied(ins))\n(pred2C_likesAsFriend(ins,arg2)) => (pred1C_PerceptualAgent-Embodied(ins))")), ConsesLow.list(ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Cyc")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Emu")))), SubLObjectFactory.makeString("\npred1C_Emu(C_Cyc)\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n((pred2C_isa(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_isa(arg1,new))\n(pred2C_isa(x,C_Emu)) <=> (pred1C_Emu(x)).")), ConsesLow.list(ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("eatsWillingly")), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("MotherFn")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Cyc"))), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Emu")))), SubLObjectFactory.makeString("\npred2C_eatsWillingly(HLID_330D821E2BBF65A0729C2911B19DADC379636F72701E2BBD5880659C2911B19DADC379636F7270,C_Emu)\n(pred2C_eatsWillingly(arg1,ins)) => (pred1C_TemporalStuffType(ins))\n(pred2C_eatsWillingly(ins,arg2)) => (pred1C_Animal(ins))\n((pred2C_eatsWillingly(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_eatsWillingly(arg1,new))\npred2C_natFunction(HLID_330D821E2BBF65A0729C2911B19DADC379636F72700B0F853F41524731,C_MotherFn)\npred3C_natArgument(HLID_330D821E2BBF65A0729C2911B19DADC379636F72700B0F853F41524731,1,arg1)\npred1C_FemaleAnimal(HLID_330D821E2BBF65A0729C2911B19DADC379636F72700B0F853F41524731)\n(pred2C_isa(x,C_Emu)) <=> (pred1C_Emu(x)).")), ConsesLow.list(ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("dayTimeDecayRate")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("12-dimethylhydrazine")), ZERO_INTEGER)), SubLObjectFactory.makeString("\npred2C_dayTimeDecayRate(C_12-dimethylhydrazine,0)\n(pred2C_dayTimeDecayRate(arg1,ins)) => (pred1C_Number-General(ins))\n(pred2C_dayTimeDecayRate(ins,arg2)) => (pred1C_TemporalStuffType(ins))\n(pred2C_isa(x,C_12-dimethylhydrazine)) <=> (pred1C_12-dimethylhydrazine(x)).")), ConsesLow.list(ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("not")), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Cyc")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Emu"))))), SubLObjectFactory.makeString("\n!(pred1C_Emu(C_Cyc))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n((pred2C_isa(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_isa(arg1,new))\n(pred2C_isa(x,C_Emu)) <=> (pred1C_Emu(x)).")), ConsesLow.list(ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("and")), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Cyc")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Emu"))), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("eatsWillingly")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Cyc")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Pizza"))))), SubLObjectFactory.makeString("\npred2C_eatsWillingly(C_Cyc,C_Pizza)\npred1C_Emu(C_Cyc)\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n((pred2C_isa(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_isa(arg1,new))\n(pred2C_isa(x,C_Emu)) <=> (pred1C_Emu(x)).\n(pred2C_eatsWillingly(arg1,ins)) => (pred1C_TemporalStuffType(ins))\n(pred2C_eatsWillingly(ins,arg2)) => (pred1C_Animal(ins))\n((pred2C_eatsWillingly(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_eatsWillingly(arg1,new))\n(pred2C_isa(x,C_Pizza)) <=> (pred1C_Pizza(x)).")), ConsesLow.list(ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("or")), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Cyc")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Emu"))), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("eatsWillingly")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Cyc")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Pizza"))))), SubLObjectFactory.makeString("\n(pred1C_Emu(C_Cyc)) v (pred2C_eatsWillingly(C_Cyc,C_Pizza))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n((pred2C_isa(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_isa(arg1,new))\n(pred2C_isa(x,C_Emu)) <=> (pred1C_Emu(x)).\n(pred2C_eatsWillingly(arg1,ins)) => (pred1C_TemporalStuffType(ins))\n(pred2C_eatsWillingly(ins,arg2)) => (pred1C_Animal(ins))\n((pred2C_eatsWillingly(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_eatsWillingly(arg1,new))\n(pred2C_isa(x,C_Pizza)) <=> (pred1C_Pizza(x)).")), ConsesLow.list(ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("implies")), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeSymbol("?X"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Emu"))), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("likesAsFriend")), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Madonna")), SubLObjectFactory.makeSymbol("?X")))), SubLObjectFactory.makeString("\n(pred1C_Emu(x)) => (pred2C_likesAsFriend(C_Madonna,x))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n((pred2C_isa(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_isa(arg1,new))\n(pred2C_isa(x,C_Emu)) <=> (pred1C_Emu(x)).\n(pred2C_likesAsFriend(arg1,ins)) => (pred1C_PerceptualAgent-Embodied(ins))\n(pred2C_likesAsFriend(ins,arg2)) => (pred1C_PerceptualAgent-Embodied(ins))")), ConsesLow.list(ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("forAll")), SubLObjectFactory.makeSymbol("?THING"), ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("isa")), SubLObjectFactory.makeSymbol("?THING"), constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("Thing"))))), SubLObjectFactory.makeString("\npred1C_Thing(thing)\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(arg1,ins)) => (pred1C_Collection(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n(pred2C_isa(ins,arg2)) => (pred1C_Thing(ins))\n((pred2C_isa(arg1,old)) ^ (pred2C_genls(old,new))) => (pred2C_isa(arg1,new))\n(pred2C_isa(x,C_Thing)) <=> (pred1C_Thing(x))."))
        });
        $list301 = ConsesLow.list(ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(SubLObjectFactory.makeString("likesAsFriend")), TWO_INTEGER), SubLObjectFactory.makeString("pred2C_likesAsFriend")));
        $list306 = ConsesLow.list(ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("This-is_100percent'valid")), T), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("must-begin-with-upper-case")), NIL), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("\"constants may be expressed as double-quoted strings\"")), T), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("\"\"")), NIL), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("17")), NIL));
        $list308 = ConsesLow.list(ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("this-is_100percent'valid")), T), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("Must-begin-with-lower-case")), NIL));
        $list310 = ConsesLow.list(ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("this-is_100percent'valid")), T), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("this is$not%valid")), NIL), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeString("'not-valid")), NIL), ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("NOT-A-STRING")), NIL));
    }


    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 2078L)
    public static SubLObject inference_output_answers_alchemy(final SubLObject inference, final SubLObject stream) {
        alchemy_export_inference_answers_header(inference, stream);
        SubLObject cdolist_list_var = inference_datastructures_inference.inference_free_el_vars(inference);
        SubLObject el_var = (SubLObject)alchemy_export.NIL;
        el_var = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            final SubLObject idx = inference_datastructures_inference.inference_answer_id_index(inference);
            if (alchemy_export.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)alchemy_export.$kw1$SKIP)) {
                final SubLObject idx_$1 = idx;
                if (alchemy_export.NIL == id_index.id_index_dense_objects_empty_p(idx_$1, (SubLObject)alchemy_export.$kw1$SKIP)) {
                    final SubLObject vector_var = id_index.id_index_dense_objects(idx_$1);
                    final SubLObject backwardP_var = (SubLObject)alchemy_export.NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject id;
                    SubLObject v_answer;
                    SubLObject el_bindings;
                    SubLObject variable_binding;
                    for (length = Sequences.length(vector_var), v_iteration = (SubLObject)alchemy_export.NIL, v_iteration = (SubLObject)alchemy_export.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)alchemy_export.ONE_INTEGER)) {
                        id = ((alchemy_export.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)alchemy_export.ONE_INTEGER) : v_iteration);
                        v_answer = Vectors.aref(vector_var, id);
                        if (alchemy_export.NIL == id_index.id_index_tombstone_p(v_answer) || alchemy_export.NIL == id_index.id_index_skip_tombstones_p((SubLObject)alchemy_export.$kw1$SKIP)) {
                            if (alchemy_export.NIL != id_index.id_index_tombstone_p(v_answer)) {
                                v_answer = (SubLObject)alchemy_export.$kw1$SKIP;
                            }
                            el_bindings = inference_kernel.inference_answer_el_bindings(v_answer);
                            variable_binding = bindings.variable_lookup(el_var, el_bindings);
                            alchemy_export_sentence_with_error_handling(variable_binding, stream);
                        }
                    }
                }
                final SubLObject idx_$2 = idx;
                if (alchemy_export.NIL == id_index.id_index_sparse_objects_empty_p(idx_$2)) {
                    final SubLObject cdohash_table = id_index.id_index_sparse_objects(idx_$2);
                    SubLObject id2 = (SubLObject)alchemy_export.NIL;
                    SubLObject v_answer2 = (SubLObject)alchemy_export.NIL;
                    final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                    try {
                        while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                            id2 = Hashtables.getEntryKey(cdohash_entry);
                            v_answer2 = Hashtables.getEntryValue(cdohash_entry);
                            final SubLObject el_bindings2 = inference_kernel.inference_answer_el_bindings(v_answer2);
                            final SubLObject variable_binding2 = bindings.variable_lookup(el_var, el_bindings2);
                            alchemy_export_sentence_with_error_handling(variable_binding2, stream);
                        }
                    }
                    finally {
                        Hashtables.releaseEntrySetIterator(cdohash_iterator);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            el_var = cdolist_list_var.first();
        }
        return (SubLObject)alchemy_export.T;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 3128L)
    public static SubLObject alchemy_export_inference_answers_header(final SubLObject inference, final SubLObject stream) {
        final SubLObject sentence = inference_datastructures_inference.inference_el_query(inference);
        final SubLObject mt = inference_datastructures_inference.inference_mt(inference);
        PrintLow.format(stream, (SubLObject)alchemy_export.$str2$____Inference_answers_in_Alchemy_, numeric_date_utilities.timestring((SubLObject)alchemy_export.UNPROVIDED));
        PrintLow.format(stream, (SubLObject)alchemy_export.$str3$Generated_from_KB__A_running_on_C, operation_communication.kb_version_string(), system_info.cyc_revision_string());
        PrintLow.format(stream, (SubLObject)alchemy_export.$str4$Query_sentence___S__Mt___S_______, sentence, mt);
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 3577L)
    public static SubLObject alchemy_export_query_variable_bindings_to_file(final SubLObject filename, final SubLObject variable_token, final SubLObject query_sentence, SubLObject mt, SubLObject query_properties) {
        if (mt == alchemy_export.UNPROVIDED) {
            mt = (SubLObject)alchemy_export.NIL;
        }
        if (query_properties == alchemy_export.UNPROVIDED) {
            query_properties = (SubLObject)alchemy_export.NIL;
        }
        final SubLObject v_bindings = ask_utilities.query_variable(variable_token, query_sentence, mt, query_properties);
        alchemy_export_sentences_to_file(v_bindings, filename);
        return filename;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 3968L)
    public static SubLObject alchemy_export_sentences_to_file(final SubLObject cycl_sentences, final SubLObject filename) {
        SubLObject stream = (SubLObject)alchemy_export.NIL;
        try {
            stream = compatibility.open_text(filename, (SubLObject)alchemy_export.$kw5$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)alchemy_export.$str6$Unable_to_open__S, filename);
            }
            final SubLObject stream_$3 = stream;
            alchemy_export_sentences(cycl_sentences, stream_$3);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)alchemy_export.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)alchemy_export.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return filename;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 4159L)
    public static SubLObject alchemy_export_sentences(final SubLObject cycl_sentences, SubLObject stream) {
        if (stream == alchemy_export.UNPROVIDED) {
            stream = (SubLObject)alchemy_export.T;
        }
        SubLObject cdolist_list_var = cycl_sentences;
        SubLObject cycl_sentence = (SubLObject)alchemy_export.NIL;
        cycl_sentence = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            alchemy_export_sentence_with_error_handling(cycl_sentence, stream);
            cdolist_list_var = cdolist_list_var.rest();
            cycl_sentence = cdolist_list_var.first();
        }
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 4366L)
    public static SubLObject alchemy_export_sentence_with_error_handling(final SubLObject cycl_sentence, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject alchemy_sentence = (SubLObject)alchemy_export.NIL;
        SubLObject error = (SubLObject)alchemy_export.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)alchemy_export.$sym7$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    alchemy_sentence = cycl_sentence_to_alchemy_sentences(cycl_sentence);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)alchemy_export.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (alchemy_export.NIL != error) {
            Errors.warn(error);
            PrintLow.format(stream, (SubLObject)alchemy_export.$str8$____Couldn_t_export_the_sentence_, cycl_sentence, error);
        }
        else {
            print_high.princ(alchemy_sentence, stream);
        }
        streams_high.terpri(stream);
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 5011L)
    public static SubLObject assertions_meeting_criterion_to_alchemy_file(final SubLObject criterion, final SubLObject filename, SubLObject cafs_or_rulesP, SubLObject max_number) {
        if (cafs_or_rulesP == alchemy_export.UNPROVIDED) {
            cafs_or_rulesP = (SubLObject)alchemy_export.$kw0$BOTH;
        }
        if (max_number == alchemy_export.UNPROVIDED) {
            max_number = (SubLObject)alchemy_export.NIL;
        }
        final SubLObject assertions = find_assertions_by_criterion(criterion, max_number);
        return assertions_to_alchemy_file(assertions, filename, cafs_or_rulesP);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 5705L)
    public static SubLObject assertions_to_alchemy_file(final SubLObject assertions, final SubLObject filename, final SubLObject cafs_or_rulesP) {
        SubLObject stream = (SubLObject)alchemy_export.NIL;
        try {
            stream = compatibility.open_text(filename, (SubLObject)alchemy_export.$kw5$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)alchemy_export.$str6$Unable_to_open__S, filename);
            }
            final SubLObject stream_$4 = stream;
            assertions_to_alchemy_stream(assertions, stream_$4, cafs_or_rulesP);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)alchemy_export.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)alchemy_export.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return filename;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 5917L)
    public static SubLObject assertions_to_alchemy_stream(final SubLObject assertions, final SubLObject stream, final SubLObject cafs_or_rulesP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject analysis = cycl_assertions_to_alchemy_style_fol(assertions);
        final SubLObject _prev_bind_0 = alchemy_export.$alchemy_export_cafs_or_rulesP$.currentBinding(thread);
        try {
            alchemy_export.$alchemy_export_cafs_or_rulesP$.bind(cafs_or_rulesP, thread);
            folification.fol_sentences_to_stream(analysis, (SubLObject)alchemy_export.$kw9$ALCHEMY, stream);
        }
        finally {
            alchemy_export.$alchemy_export_cafs_or_rulesP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 6202L)
    public static SubLObject check_assertion_selection_criterion(final SubLObject criterion) {
        if (criterion.isKeyword()) {
            assert alchemy_export.NIL != atomic_assertion_selection_criterion_p(criterion) : criterion;
        }
        else if (alchemy_export.NIL != list_utilities.proper_list_p(criterion)) {
            check_non_atomic_assertion_selection_criterion(criterion);
        }
        else {
            Errors.error((SubLObject)alchemy_export.$str11$Invalid_assertion_selection_crite, criterion);
        }
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 7008L)
    public static SubLObject atomic_assertion_selection_criterion_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, alchemy_export.$atomic_assertion_selection_criteria$.getGlobalValue(), Symbols.symbol_function((SubLObject)alchemy_export.EQ), (SubLObject)alchemy_export.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 7142L)
    public static SubLObject check_non_atomic_assertion_selection_criterion(final SubLObject criterion) {
        SubLObject operator = (SubLObject)alchemy_export.NIL;
        SubLObject args = (SubLObject)alchemy_export.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(criterion, criterion, (SubLObject)alchemy_export.$list14);
        operator = criterion.first();
        final SubLObject current = args = criterion.rest();
        final SubLObject arg_types = get_assertion_selection_operator_arg_types(operator, (SubLObject)alchemy_export.$kw15$NOT_FOUND);
        if (arg_types == alchemy_export.$kw15$NOT_FOUND) {
            Errors.error((SubLObject)alchemy_export.$str16$Invalid_assertion_selection_crite, criterion, operator);
        }
        else {
            check_non_atomic_assertion_selection_criterion_arg_types(args, arg_types, operator);
        }
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 7633L)
    public static SubLObject check_non_atomic_assertion_selection_criterion_arg_types(final SubLObject args, final SubLObject arg_types, final SubLObject operator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (arg_types.isList()) {
            final SubLObject number_of_arg_types = Sequences.length(arg_types);
            if (alchemy_export.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && alchemy_export.NIL == list_utilities.lengthE(args, number_of_arg_types, (SubLObject)alchemy_export.UNPROVIDED)) {
                Errors.error((SubLObject)alchemy_export.$str17$The_assertion_selection_operator_, new SubLObject[] { operator, number_of_arg_types, arg_types, Sequences.length(args), args });
            }
            SubLObject arg = (SubLObject)alchemy_export.NIL;
            SubLObject arg_$5 = (SubLObject)alchemy_export.NIL;
            SubLObject v_arg_type = (SubLObject)alchemy_export.NIL;
            SubLObject v_arg_type_$6 = (SubLObject)alchemy_export.NIL;
            arg = args;
            arg_$5 = arg.first();
            v_arg_type = arg_types;
            v_arg_type_$6 = v_arg_type.first();
            while (alchemy_export.NIL != v_arg_type || alchemy_export.NIL != arg) {
                check_non_atomic_assertion_selection_criterion_arg_type(arg_$5, v_arg_type_$6);
                arg = arg.rest();
                arg_$5 = arg.first();
                v_arg_type = v_arg_type.rest();
                v_arg_type_$6 = v_arg_type.first();
            }
        }
        else {
            SubLObject cdolist_list_var = args;
            SubLObject arg2 = (SubLObject)alchemy_export.NIL;
            arg2 = cdolist_list_var.first();
            while (alchemy_export.NIL != cdolist_list_var) {
                check_non_atomic_assertion_selection_criterion_arg_type(arg2, arg_types);
                cdolist_list_var = cdolist_list_var.rest();
                arg2 = cdolist_list_var.first();
            }
        }
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 8503L)
    public static SubLObject check_non_atomic_assertion_selection_criterion_arg_type(final SubLObject arg, final SubLObject v_arg_type) {
        if (v_arg_type == alchemy_export.$kw18$CRITERION) {
            check_assertion_selection_criterion(arg);
        }
        else if (alchemy_export.NIL == Functions.funcall(v_arg_type, arg)) {
            Errors.error((SubLObject)alchemy_export.$str19$_A_is_not_a__A, arg, v_arg_type);
        }
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 10822L)
    public static SubLObject get_assertion_selection_operator_arg_types(final SubLObject operator, SubLObject v_default) {
        if (v_default == alchemy_export.UNPROVIDED) {
            v_default = (SubLObject)alchemy_export.$kw15$NOT_FOUND;
        }
        return conses_high.getf(alchemy_export.$assertion_selection_arg_types_by_operator$.getGlobalValue(), operator, v_default);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 11001L)
    public static SubLObject find_assertions_by_criterion(final SubLObject criterion, SubLObject max_number) {
        if (max_number == alchemy_export.UNPROVIDED) {
            max_number = (SubLObject)alchemy_export.NIL;
        }
        check_assertion_selection_criterion(criterion);
        if (alchemy_export.NIL != max_number && !assertionsDisabledInClass && alchemy_export.NIL == subl_promotions.positive_integer_p(max_number)) {
            throw new AssertionError(max_number);
        }
        return find_assertions_by_criterion_no_checks(criterion, max_number);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 11658L)
    public static SubLObject find_assertions_by_criterion_no_checks(final SubLObject criterion, final SubLObject max_number) {
        SubLObject assertions = find_assertions_by_criterion_int(criterion);
        if (alchemy_export.NIL != max_number && alchemy_export.NIL != list_utilities.lengthG(assertions, max_number, (SubLObject)alchemy_export.UNPROVIDED)) {
            assertions = list_utilities.random_n(max_number, assertions);
        }
        return assertions;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 11951L)
    public static SubLObject find_assertions_by_criterion_int(final SubLObject criterion) {
        if (criterion.isKeyword()) {
            if (criterion.eql((SubLObject)alchemy_export.$kw12$RULE)) {
                return kb_utilities.all_rules();
            }
            if (criterion.eql((SubLObject)alchemy_export.$kw13$GAF)) {
                return kb_utilities.all_gafs();
            }
            Errors.error((SubLObject)alchemy_export.$str22$Unknown_atomic_assertion_selectio, criterion);
        }
        else if (criterion.isList()) {
            SubLObject operator = (SubLObject)alchemy_export.NIL;
            SubLObject args = (SubLObject)alchemy_export.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(criterion, criterion, (SubLObject)alchemy_export.$list14);
            operator = criterion.first();
            final SubLObject current = args = criterion.rest();
            final SubLObject pcase_var = operator;
            if (pcase_var.eql((SubLObject)alchemy_export.$kw23$UNION)) {
                return list_utilities.mapnunion(Symbols.symbol_function((SubLObject)alchemy_export.$sym24$FIND_ASSERTIONS_BY_CRITERION_INT), args, Symbols.symbol_function((SubLObject)alchemy_export.EQ));
            }
            if (pcase_var.eql((SubLObject)alchemy_export.$kw25$INTERSECTION)) {
                return all_assertions_meeting_all_criteria(args);
            }
            if (pcase_var.eql((SubLObject)alchemy_export.$kw26$EXCEPTION)) {
                SubLObject current_$8;
                final SubLObject datum_$7 = current_$8 = args;
                SubLObject positive_criterion = (SubLObject)alchemy_export.NIL;
                SubLObject negative_criterion = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$8, datum_$7, (SubLObject)alchemy_export.$list27);
                positive_criterion = current_$8.first();
                current_$8 = current_$8.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$8, datum_$7, (SubLObject)alchemy_export.$list27);
                negative_criterion = current_$8.first();
                current_$8 = current_$8.rest();
                if (alchemy_export.NIL == current_$8) {
                    final SubLObject candidate_assertions = find_assertions_by_criterion_int(positive_criterion);
                    return find_assertions_not_meeting_criterion_among(negative_criterion, candidate_assertions);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$7, (SubLObject)alchemy_export.$list27);
            }
            else if (pcase_var.eql((SubLObject)alchemy_export.$kw28$IN_MT)) {
                SubLObject current_$9;
                final SubLObject datum_$8 = current_$9 = args;
                SubLObject mt = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$9, datum_$8, (SubLObject)alchemy_export.$list29);
                mt = current_$9.first();
                current_$9 = current_$9.rest();
                if (alchemy_export.NIL == current_$9) {
                    return kb_mapping.gather_mt_index(mt);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$8, (SubLObject)alchemy_export.$list29);
            }
            else if (pcase_var.eql((SubLObject)alchemy_export.$kw30$VISIBLE_FROM_MT)) {
                SubLObject current_$10;
                final SubLObject datum_$9 = current_$10 = args;
                SubLObject mt = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$10, datum_$9, (SubLObject)alchemy_export.$list29);
                mt = current_$10.first();
                current_$10 = current_$10.rest();
                if (alchemy_export.NIL == current_$10) {
                    return all_assertions_visible_from_mt(mt);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$9, (SubLObject)alchemy_export.$list29);
            }
            else if (pcase_var.eql((SubLObject)alchemy_export.$kw31$COLLECTION_EXTENT)) {
                SubLObject current_$11;
                final SubLObject datum_$10 = current_$11 = args;
                SubLObject coll = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$11, datum_$10, (SubLObject)alchemy_export.$list32);
                coll = current_$11.first();
                current_$11 = current_$11.rest();
                if (alchemy_export.NIL == current_$11) {
                    return all_isa_assertions_of_collection(coll);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$10, (SubLObject)alchemy_export.$list32);
            }
            else if (pcase_var.eql((SubLObject)alchemy_export.$kw33$COLLECTION_EXTENTS)) {
                SubLObject current_$12;
                final SubLObject datum_$11 = current_$12 = args;
                SubLObject set_or_coll = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$12, datum_$11, (SubLObject)alchemy_export.$list34);
                set_or_coll = current_$12.first();
                current_$12 = current_$12.rest();
                if (alchemy_export.NIL == current_$12) {
                    return all_isa_assertions_of_all_collections_in_set_or_coll(set_or_coll);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$11, (SubLObject)alchemy_export.$list34);
            }
            else if (pcase_var.eql((SubLObject)alchemy_export.$kw35$COLLECTION_EXTENTS_QUOTED)) {
                SubLObject current_$13;
                final SubLObject datum_$12 = current_$13 = args;
                SubLObject coll = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$13, datum_$12, (SubLObject)alchemy_export.$list32);
                coll = current_$13.first();
                current_$13 = current_$13.rest();
                if (alchemy_export.NIL == current_$13) {
                    return all_isa_assertions_of_all_quoted_instances_of_coll(coll);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$12, (SubLObject)alchemy_export.$list32);
            }
            else if (pcase_var.eql((SubLObject)alchemy_export.$kw36$PREDICATE_EXTENT)) {
                SubLObject current_$14;
                final SubLObject datum_$13 = current_$14 = args;
                SubLObject pred = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$14, datum_$13, (SubLObject)alchemy_export.$list37);
                pred = current_$14.first();
                current_$14 = current_$14.rest();
                if (alchemy_export.NIL == current_$14) {
                    return predicate_extent(pred);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$13, (SubLObject)alchemy_export.$list37);
            }
            else if (pcase_var.eql((SubLObject)alchemy_export.$kw38$PREDICATE_EXTENTS)) {
                SubLObject current_$15;
                final SubLObject datum_$14 = current_$15 = args;
                SubLObject set_or_coll = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$15, datum_$14, (SubLObject)alchemy_export.$list34);
                set_or_coll = current_$15.first();
                current_$15 = current_$15.rest();
                if (alchemy_export.NIL == current_$15) {
                    return union_of_extents_of_predicate_set_or_coll(set_or_coll);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$14, (SubLObject)alchemy_export.$list34);
            }
            else if (pcase_var.eql((SubLObject)alchemy_export.$kw39$PREDICATE_EXTENTS_QUOTED)) {
                SubLObject current_$16;
                final SubLObject datum_$15 = current_$16 = args;
                SubLObject coll = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$16, datum_$15, (SubLObject)alchemy_export.$list32);
                coll = current_$16.first();
                current_$16 = current_$16.rest();
                if (alchemy_export.NIL == current_$16) {
                    return union_of_extents_of_all_quoted_instances_of_coll(coll);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$15, (SubLObject)alchemy_export.$list32);
            }
            else if (pcase_var.eql((SubLObject)alchemy_export.$kw40$ASSERTIONS_MEETING_CRITERION_PLUS_EXTENTS_OF_PREDICATES_MENTIONED)) {
                SubLObject current_$17;
                final SubLObject datum_$16 = current_$17 = args;
                SubLObject criterion_$27 = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$17, datum_$16, (SubLObject)alchemy_export.$list41);
                criterion_$27 = current_$17.first();
                current_$17 = current_$17.rest();
                if (alchemy_export.NIL == current_$17) {
                    return all_assertions_meeting_criterion_plus_extents_of_predicates_mentioned(criterion_$27);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$16, (SubLObject)alchemy_export.$list41);
            }
            else if (pcase_var.eql((SubLObject)alchemy_export.$kw42$ASSERTIONS_MEETING_CRITERION_PLUS_EXTENTS_OF_PREDICATES_AND_COLLE)) {
                SubLObject current_$18;
                final SubLObject datum_$17 = current_$18 = args;
                SubLObject criterion_$28 = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$18, datum_$17, (SubLObject)alchemy_export.$list41);
                criterion_$28 = current_$18.first();
                current_$18 = current_$18.rest();
                if (alchemy_export.NIL == current_$18) {
                    return all_assertions_meeting_criterion_plus_extents_of_predicates_and_collections_mentioned(criterion_$28);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$17, (SubLObject)alchemy_export.$list41);
            }
            else if (pcase_var.eql((SubLObject)alchemy_export.$kw43$MENTIONS_TERM)) {
                SubLObject current_$19;
                final SubLObject datum_$18 = current_$19 = args;
                SubLObject v_term = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$19, datum_$18, (SubLObject)alchemy_export.$list44);
                v_term = current_$19.first();
                current_$19 = current_$19.rest();
                if (alchemy_export.NIL == current_$19) {
                    return all_assertions_mentioning_indexed_term(v_term);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$18, (SubLObject)alchemy_export.$list44);
            }
            else if (pcase_var.eql((SubLObject)alchemy_export.$kw45$MENTIONS_TERM_AT_LEAST_N_TIMES)) {
                SubLObject current_$20;
                final SubLObject datum_$19 = current_$20 = args;
                SubLObject v_term = (SubLObject)alchemy_export.NIL;
                SubLObject n = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$20, datum_$19, (SubLObject)alchemy_export.$list46);
                v_term = current_$20.first();
                current_$20 = current_$20.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$20, datum_$19, (SubLObject)alchemy_export.$list46);
                n = current_$20.first();
                current_$20 = current_$20.rest();
                if (alchemy_export.NIL == current_$20) {
                    return all_assertions_mentioning_indexed_term_at_least_n_times(v_term, n);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$19, (SubLObject)alchemy_export.$list46);
            }
            else if (pcase_var.eql((SubLObject)alchemy_export.$kw47$MENTIONS_TERM_IN_ARGPOS)) {
                SubLObject current_$21;
                final SubLObject datum_$20 = current_$21 = args;
                SubLObject v_term = (SubLObject)alchemy_export.NIL;
                SubLObject argpos = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, (SubLObject)alchemy_export.$list48);
                v_term = current_$21.first();
                current_$21 = current_$21.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$21, datum_$20, (SubLObject)alchemy_export.$list48);
                argpos = current_$21.first();
                current_$21 = current_$21.rest();
                if (alchemy_export.NIL == current_$21) {
                    return all_assertions_mentioning_indexed_term_in_argpos(v_term, argpos, (SubLObject)alchemy_export.UNPROVIDED);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$20, (SubLObject)alchemy_export.$list48);
            }
            else if (pcase_var.eql((SubLObject)alchemy_export.$kw49$MENTIONS_ANY_INSTANTIATION_OF)) {
                SubLObject current_$22;
                final SubLObject datum_$21 = current_$22 = args;
                SubLObject set_or_coll = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$22, datum_$21, (SubLObject)alchemy_export.$list34);
                set_or_coll = current_$22.first();
                current_$22 = current_$22.rest();
                if (alchemy_export.NIL == current_$22) {
                    return all_assertions_mentioning_any_indexed_term_in_set_or_coll(set_or_coll);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$21, (SubLObject)alchemy_export.$list34);
            }
            else if (pcase_var.eql((SubLObject)alchemy_export.$kw50$MENTIONS_ANY_QUOTED_INSTANCE_OF)) {
                SubLObject current_$23;
                final SubLObject datum_$22 = current_$23 = args;
                SubLObject coll = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$23, datum_$22, (SubLObject)alchemy_export.$list32);
                coll = current_$23.first();
                current_$23 = current_$23.rest();
                if (alchemy_export.NIL == current_$23) {
                    return all_assertions_mentioning_any_quoted_instance_of(coll);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$22, (SubLObject)alchemy_export.$list32);
            }
            else if (pcase_var.eql((SubLObject)alchemy_export.$kw51$MENTIONS_INSTANTIATIONS_OF_AT_LEAST_N_TIMES)) {
                SubLObject current_$24;
                final SubLObject datum_$23 = current_$24 = args;
                SubLObject set_or_coll = (SubLObject)alchemy_export.NIL;
                SubLObject n = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$24, datum_$23, (SubLObject)alchemy_export.$list52);
                set_or_coll = current_$24.first();
                current_$24 = current_$24.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$24, datum_$23, (SubLObject)alchemy_export.$list52);
                n = current_$24.first();
                current_$24 = current_$24.rest();
                if (alchemy_export.NIL == current_$24) {
                    return all_assertions_mentioning_indexed_terms_in_set_or_coll_at_least_n_times(set_or_coll, n);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$23, (SubLObject)alchemy_export.$list52);
            }
            else if (pcase_var.eql((SubLObject)alchemy_export.$kw53$MENTIONS_QUOTED_INSTANCES_OF_AT_LEAST_N_TIMES)) {
                SubLObject current_$25;
                final SubLObject datum_$24 = current_$25 = args;
                SubLObject coll = (SubLObject)alchemy_export.NIL;
                SubLObject n = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$25, datum_$24, (SubLObject)alchemy_export.$list54);
                coll = current_$25.first();
                current_$25 = current_$25.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$25, datum_$24, (SubLObject)alchemy_export.$list54);
                n = current_$25.first();
                current_$25 = current_$25.rest();
                if (alchemy_export.NIL == current_$25) {
                    return all_assertions_mentioning_quoted_instances_of_at_least_n_times(coll, n);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$24, (SubLObject)alchemy_export.$list54);
            }
            else if (pcase_var.eql((SubLObject)alchemy_export.$kw55$MENTIONS_ANY_INSTANTIATION_OF_IN_ARGPOS)) {
                SubLObject current_$26;
                final SubLObject datum_$25 = current_$26 = args;
                SubLObject set_or_coll = (SubLObject)alchemy_export.NIL;
                SubLObject argpos = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$26, datum_$25, (SubLObject)alchemy_export.$list56);
                set_or_coll = current_$26.first();
                current_$26 = current_$26.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$26, datum_$25, (SubLObject)alchemy_export.$list56);
                argpos = current_$26.first();
                current_$26 = current_$26.rest();
                if (alchemy_export.NIL == current_$26) {
                    return all_assertions_mentioning_any_indexed_term_in_set_or_coll_in_argpos(set_or_coll, argpos, (SubLObject)alchemy_export.UNPROVIDED);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$25, (SubLObject)alchemy_export.$list56);
            }
            else if (pcase_var.eql((SubLObject)alchemy_export.$kw57$MENTIONS_ANY_QUOTED_INSTANCE_OF_IN_ARGPOS)) {
                SubLObject current_$27;
                final SubLObject datum_$26 = current_$27 = args;
                SubLObject coll = (SubLObject)alchemy_export.NIL;
                SubLObject argpos = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$27, datum_$26, (SubLObject)alchemy_export.$list58);
                coll = current_$27.first();
                current_$27 = current_$27.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$27, datum_$26, (SubLObject)alchemy_export.$list58);
                argpos = current_$27.first();
                current_$27 = current_$27.rest();
                if (alchemy_export.NIL == current_$27) {
                    return all_assertions_mentioning_any_quoted_instance_of_in_argpos(coll, argpos, (SubLObject)alchemy_export.UNPROVIDED);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$26, (SubLObject)alchemy_export.$list58);
            }
            else if (pcase_var.eql((SubLObject)alchemy_export.$kw59$MENTIONS_ALL_INSTANTIATIONS_OF)) {
                SubLObject current_$28;
                final SubLObject datum_$27 = current_$28 = args;
                SubLObject set_or_coll = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$28, datum_$27, (SubLObject)alchemy_export.$list34);
                set_or_coll = current_$28.first();
                current_$28 = current_$28.rest();
                if (alchemy_export.NIL == current_$28) {
                    return all_assertions_mentioning_all_indexed_terms_in_set_or_coll(set_or_coll);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$27, (SubLObject)alchemy_export.$list34);
            }
            else if (pcase_var.eql((SubLObject)alchemy_export.$kw60$MENTIONS_ALL_QUOTED_INSTANCES_OF)) {
                SubLObject current_$29;
                final SubLObject datum_$28 = current_$29 = args;
                SubLObject coll = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$29, datum_$28, (SubLObject)alchemy_export.$list32);
                coll = current_$29.first();
                current_$29 = current_$29.rest();
                if (alchemy_export.NIL == current_$29) {
                    return all_assertions_mentioning_all_quoted_instances_of(coll);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$28, (SubLObject)alchemy_export.$list32);
            }
            else if (pcase_var.eql((SubLObject)alchemy_export.$kw61$MENTIONS_ONLY_INSTANTIATIONS_OF)) {
                SubLObject current_$30;
                final SubLObject datum_$29 = current_$30 = args;
                SubLObject set_or_coll = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$30, datum_$29, (SubLObject)alchemy_export.$list34);
                set_or_coll = current_$30.first();
                current_$30 = current_$30.rest();
                if (alchemy_export.NIL == current_$30) {
                    return all_assertions_mentioning_only_indexed_terms_in_set_or_coll(set_or_coll);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$29, (SubLObject)alchemy_export.$list34);
            }
            else if (pcase_var.eql((SubLObject)alchemy_export.$kw62$MENTIONS_ONLY_QUOTED_INSTANCES_OF)) {
                SubLObject current_$31;
                final SubLObject datum_$30 = current_$31 = args;
                SubLObject coll = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$31, datum_$30, (SubLObject)alchemy_export.$list32);
                coll = current_$31.first();
                current_$31 = current_$31.rest();
                if (alchemy_export.NIL == current_$31) {
                    return all_assertions_mentioning_only_quoted_instances_of(coll);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$30, (SubLObject)alchemy_export.$list32);
            }
            else {
                Errors.error((SubLObject)alchemy_export.$str16$Invalid_assertion_selection_crite, criterion, operator);
            }
        }
        else {
            Errors.error((SubLObject)alchemy_export.$str63$Invalid_assertion_selection_crite, criterion);
        }
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 17133L)
    public static SubLObject delayed_atomic_assertion_selection_criterion_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, alchemy_export.$delayed_atomic_assertion_selection_criteria$.getGlobalValue(), Symbols.symbol_function((SubLObject)alchemy_export.EQ), (SubLObject)alchemy_export.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 17283L)
    public static SubLObject delayed_assertion_selection_criterion_operator_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, alchemy_export.$delayed_assertion_selection_criterion_operators$.getGlobalValue(), Symbols.symbol_function((SubLObject)alchemy_export.EQ), (SubLObject)alchemy_export.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 17439L)
    public static SubLObject delayed_assertion_selection_criterionP(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(alchemy_export.NIL != delayed_atomic_assertion_selection_criterion_p(v_object) || (alchemy_export.NIL != list_utilities.non_empty_list_p(v_object) && alchemy_export.NIL != delayed_assertion_selection_criterion_operator_p(v_object.first())));
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 17683L)
    public static SubLObject all_assertions_meeting_all_criteria(final SubLObject criteria) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject delayed_criteria = list_utilities.partition_list(criteria, Symbols.symbol_function((SubLObject)alchemy_export.$sym64$DELAYED_ASSERTION_SELECTION_CRITERION_));
        SubLObject general_criteria = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (alchemy_export.NIL != list_utilities.empty_list_p(general_criteria)) {
            thread.resetMultipleValues();
            final SubLObject general_criteria_$57 = list_utilities.split_list(delayed_criteria, (SubLObject)alchemy_export.ONE_INTEGER);
            final SubLObject delayed_criteria_$58 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            general_criteria = general_criteria_$57;
            delayed_criteria = delayed_criteria_$58;
        }
        SubLObject assertions = list_utilities.fast_intersect_all(Mapping.mapcar(Symbols.symbol_function((SubLObject)alchemy_export.$sym24$FIND_ASSERTIONS_BY_CRITERION_INT), general_criteria), Symbols.symbol_function((SubLObject)alchemy_export.EQ), (SubLObject)alchemy_export.UNPROVIDED);
        SubLObject cdolist_list_var = delayed_criteria;
        SubLObject delayed_criterion = (SubLObject)alchemy_export.NIL;
        delayed_criterion = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            assertions = find_assertions_meeting_criterion_among(delayed_criterion, assertions);
            cdolist_list_var = cdolist_list_var.rest();
            delayed_criterion = cdolist_list_var.first();
        }
        return assertions;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 18371L)
    public static SubLObject find_assertions_meeting_criterion_among(final SubLObject criterion, final SubLObject assertions) {
        if (criterion.isKeyword()) {
            if (criterion.eql((SubLObject)alchemy_export.$kw12$RULE)) {
                return all_rules_among(assertions);
            }
            if (criterion.eql((SubLObject)alchemy_export.$kw13$GAF)) {
                return all_gafs_among(assertions);
            }
            Errors.error((SubLObject)alchemy_export.$str65$Internal_error__Invalid_atomic_cr, criterion);
        }
        else if (criterion.isList()) {
            SubLObject operator = (SubLObject)alchemy_export.NIL;
            SubLObject args = (SubLObject)alchemy_export.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(criterion, criterion, (SubLObject)alchemy_export.$list14);
            operator = criterion.first();
            final SubLObject current = args = criterion.rest();
            final SubLObject pcase_var = operator;
            if (pcase_var.eql((SubLObject)alchemy_export.$kw30$VISIBLE_FROM_MT)) {
                SubLObject current_$60;
                final SubLObject datum_$59 = current_$60 = args;
                SubLObject mt = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$60, datum_$59, (SubLObject)alchemy_export.$list29);
                mt = current_$60.first();
                current_$60 = current_$60.rest();
                if (alchemy_export.NIL == current_$60) {
                    return all_assertions_visible_from_mt_among(mt, assertions);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$59, (SubLObject)alchemy_export.$list29);
            }
            else {
                Errors.error((SubLObject)alchemy_export.$str66$Internal_error__Invalid_criterion, operator);
            }
        }
        else {
            Errors.error((SubLObject)alchemy_export.$str63$Invalid_assertion_selection_crite, criterion);
        }
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 19198L)
    public static SubLObject find_assertions_not_meeting_criterion_among(final SubLObject criterion, final SubLObject assertions) {
        if (criterion.isKeyword()) {
            if (criterion.eql((SubLObject)alchemy_export.$kw12$RULE)) {
                return all_gafs_among(assertions);
            }
            if (criterion.eql((SubLObject)alchemy_export.$kw13$GAF)) {
                return all_rules_among(assertions);
            }
        }
        else if (criterion.isList()) {
            SubLObject operator = (SubLObject)alchemy_export.NIL;
            SubLObject args = (SubLObject)alchemy_export.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(criterion, criterion, (SubLObject)alchemy_export.$list14);
            operator = criterion.first();
            final SubLObject current = args = criterion.rest();
            final SubLObject pcase_var = operator;
            if (pcase_var.eql((SubLObject)alchemy_export.$kw30$VISIBLE_FROM_MT)) {
                SubLObject current_$62;
                final SubLObject datum_$61 = current_$62 = args;
                SubLObject mt = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$62, datum_$61, (SubLObject)alchemy_export.$list29);
                mt = current_$62.first();
                current_$62 = current_$62.rest();
                if (alchemy_export.NIL == current_$62) {
                    return all_assertions_not_visible_from_mt_among(mt, assertions);
                }
                cdestructuring_bind.cdestructuring_bind_error(datum_$61, (SubLObject)alchemy_export.$list29);
            }
        }
        else {
            Errors.error((SubLObject)alchemy_export.$str63$Invalid_assertion_selection_crite, criterion);
        }
        final SubLObject assertions_meeting_criterion = find_assertions_by_criterion_int(criterion);
        return conses_high.nset_difference(assertions, assertions_meeting_criterion, Symbols.symbol_function((SubLObject)alchemy_export.EQ), (SubLObject)alchemy_export.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 20131L)
    public static SubLObject all_rules_among(final SubLObject assertions) {
        SubLObject filtered_assertions = (SubLObject)alchemy_export.NIL;
        SubLObject el_formula = (SubLObject)alchemy_export.NIL;
        SubLObject verbosified_el_formula = (SubLObject)alchemy_export.NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = (SubLObject)alchemy_export.NIL;
        assertion = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            el_formula = uncanonicalizer.assertion_el_formula(assertion);
            verbosified_el_formula = verbosifier.verbosify_cycl(el_formula, alchemy_export.$const67$InferencePSC, (SubLObject)alchemy_export.UNPROVIDED);
            if (alchemy_export.NIL == el_utilities.groundP(verbosified_el_formula, (SubLObject)alchemy_export.UNPROVIDED) && alchemy_export.NIL != verbosified_el_ruleP(verbosified_el_formula)) {
                filtered_assertions = (SubLObject)ConsesLow.cons(assertion, filtered_assertions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return filtered_assertions;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 20606L)
    public static SubLObject verbosified_el_ruleP(final SubLObject el_formula) {
        if (!el_formula.isCons()) {
            return (SubLObject)alchemy_export.NIL;
        }
        if (!Sequences.length(el_formula).numG((SubLObject)alchemy_export.ONE_INTEGER)) {
            return (SubLObject)alchemy_export.NIL;
        }
        if (el_formula.first().eql(alchemy_export.$const68$not) && conses_high.second(el_formula).first().eql(alchemy_export.$const69$and)) {
            return (SubLObject)alchemy_export.T;
        }
        if (!el_formula.first().eql(alchemy_export.$const70$or)) {
            return (SubLObject)alchemy_export.NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = el_formula.rest();
        SubLObject arg = (SubLObject)alchemy_export.NIL;
        arg = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            if (arg.isCons() && arg.first().eql(alchemy_export.$const68$not)) {
                return (SubLObject)alchemy_export.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 21133L)
    public static SubLObject all_gafs_among(final SubLObject assertions) {
        SubLObject filtered_assertions = (SubLObject)alchemy_export.NIL;
        SubLObject el_formula = (SubLObject)alchemy_export.NIL;
        SubLObject verbosified_el_formula = (SubLObject)alchemy_export.NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = (SubLObject)alchemy_export.NIL;
        assertion = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            el_formula = uncanonicalizer.assertion_el_formula(assertion);
            verbosified_el_formula = verbosifier.verbosify_cycl(el_formula, alchemy_export.$const67$InferencePSC, (SubLObject)alchemy_export.UNPROVIDED);
            if (alchemy_export.NIL != el_utilities.gafP(verbosified_el_formula)) {
                filtered_assertions = (SubLObject)ConsesLow.cons(assertion, filtered_assertions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return filtered_assertions;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 21653L)
    public static SubLObject all_assertions_visible_from_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = (SubLObject)alchemy_export.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject idx = assertion_handles.do_assertions_table();
            final SubLObject mess = Sequences.cconcatenate((SubLObject)alchemy_export.$str71$Collecting_assertions_visible_fro, format_nil.format_nil_s_no_copy(mt));
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)alchemy_export.ZERO_INTEGER;
            assert alchemy_export.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_0_$63 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$64 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_2_$65 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)alchemy_export.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)alchemy_export.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)alchemy_export.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$66 = idx;
                    if (alchemy_export.NIL == id_index.id_index_objects_empty_p(idx_$66, (SubLObject)alchemy_export.$kw1$SKIP)) {
                        final SubLObject idx_$67 = idx_$66;
                        if (alchemy_export.NIL == id_index.id_index_dense_objects_empty_p(idx_$67, (SubLObject)alchemy_export.$kw1$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$67);
                            final SubLObject backwardP_var = (SubLObject)alchemy_export.NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject a_id;
                            SubLObject a_handle;
                            SubLObject assertion;
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)alchemy_export.NIL, v_iteration = (SubLObject)alchemy_export.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)alchemy_export.ONE_INTEGER)) {
                                a_id = ((alchemy_export.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)alchemy_export.ONE_INTEGER) : v_iteration);
                                a_handle = Vectors.aref(vector_var, a_id);
                                if (alchemy_export.NIL == id_index.id_index_tombstone_p(a_handle) || alchemy_export.NIL == id_index.id_index_skip_tombstones_p((SubLObject)alchemy_export.$kw1$SKIP)) {
                                    if (alchemy_export.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                        a_handle = (SubLObject)alchemy_export.$kw1$SKIP;
                                    }
                                    assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                    if (alchemy_export.NIL != mt_relevance_macros.relevant_assertionP(assertion)) {
                                        assertions = (SubLObject)ConsesLow.cons(assertion, assertions);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)alchemy_export.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$68 = idx_$66;
                        if (alchemy_export.NIL == id_index.id_index_sparse_objects_empty_p(idx_$68) || alchemy_export.NIL == id_index.id_index_skip_tombstones_p((SubLObject)alchemy_export.$kw1$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$68);
                            SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$68);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$68);
                            final SubLObject v_default = (SubLObject)((alchemy_export.NIL != id_index.id_index_skip_tombstones_p((SubLObject)alchemy_export.$kw1$SKIP)) ? alchemy_export.NIL : alchemy_export.$kw1$SKIP);
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                                if (alchemy_export.NIL == id_index.id_index_skip_tombstones_p((SubLObject)alchemy_export.$kw1$SKIP) || alchemy_export.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                    final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    if (alchemy_export.NIL != mt_relevance_macros.relevant_assertionP(assertion2)) {
                                        assertions = (SubLObject)ConsesLow.cons(assertion2, assertions);
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)alchemy_export.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                a_id2 = Numbers.add(a_id2, (SubLObject)alchemy_export.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$64 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)alchemy_export.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_2_$65, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$64, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$63, thread);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 21994L)
    public static SubLObject all_assertions_visible_from_mt_among(final SubLObject mt, final SubLObject assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)alchemy_export.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = list_utilities.find_all_if(Symbols.symbol_function((SubLObject)alchemy_export.$sym73$RELEVANT_ASSERTION_), assertions, (SubLObject)alchemy_export.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 22548L)
    public static SubLObject all_assertions_not_visible_from_mt_among(final SubLObject mt, final SubLObject assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)alchemy_export.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = list_utilities.find_all_if_not(Symbols.symbol_function((SubLObject)alchemy_export.$sym73$RELEVANT_ASSERTION_), assertions, (SubLObject)alchemy_export.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 22843L)
    public static SubLObject all_isa_assertions_of_collection(final SubLObject coll) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)alchemy_export.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)alchemy_export.$sym74$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(alchemy_export.$const67$InferencePSC, thread);
            result = kb_mapping.gather_gaf_arg_index(coll, (SubLObject)alchemy_export.TWO_INTEGER, alchemy_export.$const75$isa, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 23121L)
    public static SubLObject all_isa_assertions_of_all_collections_in_set_or_coll(final SubLObject set_or_coll) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)alchemy_export.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)alchemy_export.$sym74$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(alchemy_export.$const67$InferencePSC, thread);
            SubLObject cdolist_list_var = quantities.set_extent(set_or_coll, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
            SubLObject inst = (SubLObject)alchemy_export.NIL;
            inst = cdolist_list_var.first();
            while (alchemy_export.NIL != cdolist_list_var) {
                if (alchemy_export.NIL != fort_types_interface.collection_p(inst)) {
                    result = ConsesLow.append(all_isa_assertions_of_collection(inst), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                inst = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 23555L)
    public static SubLObject all_isa_assertions_of_all_quoted_instances_of_coll(final SubLObject coll) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)alchemy_export.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)alchemy_export.$sym74$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(alchemy_export.$const67$InferencePSC, thread);
            SubLObject cdolist_list_var = isa.all_quoted_instances(coll, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
            SubLObject inst = (SubLObject)alchemy_export.NIL;
            inst = cdolist_list_var.first();
            while (alchemy_export.NIL != cdolist_list_var) {
                if (alchemy_export.NIL != fort_types_interface.collection_p(inst)) {
                    result = ConsesLow.append(all_isa_assertions_of_collection(inst), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                inst = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 24133L)
    public static SubLObject predicate_extent(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject extent = (SubLObject)alchemy_export.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)alchemy_export.$sym74$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(alchemy_export.$const67$InferencePSC, thread);
            extent = kb_mapping.gather_predicate_extent_index(pred, (SubLObject)alchemy_export.NIL, (SubLObject)alchemy_export.NIL);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return extent;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 24384L)
    public static SubLObject union_of_extents_of_predicate_set_or_coll(final SubLObject set_or_coll) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)alchemy_export.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)alchemy_export.$sym74$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(alchemy_export.$const67$InferencePSC, thread);
            SubLObject cdolist_list_var = quantities.set_extent(set_or_coll, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
            SubLObject inst = (SubLObject)alchemy_export.NIL;
            inst = cdolist_list_var.first();
            while (alchemy_export.NIL != cdolist_list_var) {
                if (alchemy_export.NIL != fort_types_interface.predicate_p(inst)) {
                    result = ConsesLow.append(predicate_extent(inst), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                inst = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 24788L)
    public static SubLObject union_of_extents_of_all_quoted_instances_of_coll(final SubLObject coll) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)alchemy_export.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)alchemy_export.$sym74$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(alchemy_export.$const67$InferencePSC, thread);
            SubLObject cdolist_list_var = isa.all_quoted_instances(coll, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
            SubLObject inst = (SubLObject)alchemy_export.NIL;
            inst = cdolist_list_var.first();
            while (alchemy_export.NIL != cdolist_list_var) {
                if (alchemy_export.NIL != fort_types_interface.predicate_p(inst)) {
                    result = ConsesLow.append(predicate_extent(inst), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                inst = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 25315L)
    public static SubLObject all_assertions_meeting_criterion_plus_extents_of_predicates_mentioned(final SubLObject criterion) {
        SubLObject assertions = find_assertions_by_criterion_int(criterion);
        SubLObject cdolist_list_var;
        final SubLObject predicates = cdolist_list_var = list_utilities.mapnunion(Symbols.symbol_function((SubLObject)alchemy_export.$sym76$ASSERTION_PREDICATES), assertions, Symbols.symbol_function((SubLObject)alchemy_export.EQ));
        SubLObject predicate = (SubLObject)alchemy_export.NIL;
        predicate = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            assertions = ConsesLow.append(predicate_extent(predicate), assertions);
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(assertions, Symbols.symbol_function((SubLObject)alchemy_export.EQ), (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 25711L)
    public static SubLObject assertion_predicates(final SubLObject assertion) {
        return list_utilities.find_all_if(Symbols.symbol_function((SubLObject)alchemy_export.$sym77$PREDICATE_P), assertions_high.assertion_forts(assertion, (SubLObject)alchemy_export.T, (SubLObject)alchemy_export.T, (SubLObject)alchemy_export.NIL, (SubLObject)alchemy_export.T), (SubLObject)alchemy_export.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 25943L)
    public static SubLObject all_assertions_meeting_criterion_plus_extents_of_predicates_and_collections_mentioned(final SubLObject criterion) {
        SubLObject assertions = find_assertions_by_criterion_int(criterion);
        SubLObject cdolist_list_var;
        final SubLObject preds_and_colls = cdolist_list_var = list_utilities.mapnunion(Symbols.symbol_function((SubLObject)alchemy_export.$sym78$ASSERTION_PREDICATES_AND_COLLECTIONS), assertions, Symbols.symbol_function((SubLObject)alchemy_export.EQ));
        SubLObject pred_or_coll = (SubLObject)alchemy_export.NIL;
        pred_or_coll = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str79$__finding_pred_or_coll_extent_for, pred_or_coll);
            streams_high.force_output((SubLObject)alchemy_export.UNPROVIDED);
            assertions = ConsesLow.append(pred_or_coll_extent(pred_or_coll), assertions);
            cdolist_list_var = cdolist_list_var.rest();
            pred_or_coll = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(assertions, Symbols.symbol_function((SubLObject)alchemy_export.EQ), (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 26483L)
    public static SubLObject assertion_predicates_and_collections(final SubLObject assertion) {
        return list_utilities.find_all_if(Symbols.symbol_function((SubLObject)alchemy_export.$sym80$PREDICATE_OR_COLLECTION_P), assertions_high.assertion_forts(assertion, (SubLObject)alchemy_export.T, (SubLObject)alchemy_export.T, (SubLObject)alchemy_export.NIL, (SubLObject)alchemy_export.T), (SubLObject)alchemy_export.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 26719L)
    public static SubLObject predicate_or_collection_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(alchemy_export.NIL != fort_types_interface.predicate_p(v_object) || alchemy_export.NIL != fort_types_interface.collection_p(v_object));
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 26834L)
    public static SubLObject pred_or_coll_extent(final SubLObject pred_or_coll) {
        return (alchemy_export.NIL != fort_types_interface.predicate_p(pred_or_coll)) ? predicate_extent(pred_or_coll) : all_isa_assertions_of_collection(pred_or_coll);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 27018L)
    public static SubLObject all_assertions_mentioning_indexed_term(final SubLObject v_term) {
        return kb_mapping.gather_index_in_any_mt(v_term, (SubLObject)alchemy_export.T);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 27121L)
    public static SubLObject all_assertions_mentioning_indexed_term_at_least_n_times(final SubLObject v_term, final SubLObject n) {
        assert alchemy_export.NIL != subl_promotions.positive_integer_p(n) : n;
        final SubLObject candidate_assertions = all_assertions_mentioning_indexed_term(v_term);
        SubLObject assertions = (SubLObject)alchemy_export.NIL;
        if (alchemy_export.NIL != number_utilities.onep(n)) {
            assertions = candidate_assertions;
        }
        else {
            SubLObject cdolist_list_var = candidate_assertions;
            SubLObject assertion = (SubLObject)alchemy_export.NIL;
            assertion = cdolist_list_var.first();
            while (alchemy_export.NIL != cdolist_list_var) {
                final SubLObject assertion_forts = assertions_high.assertion_forts(assertion, (SubLObject)alchemy_export.T, (SubLObject)alchemy_export.T, (SubLObject)alchemy_export.NIL, (SubLObject)alchemy_export.NIL);
                final SubLObject term_mentions = Sequences.count(v_term, assertion_forts, Symbols.symbol_function((SubLObject)alchemy_export.EQ), (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
                if (term_mentions.numGE(n)) {
                    assertions = (SubLObject)ConsesLow.cons(assertion, assertions);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        return assertions;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 27677L)
    public static SubLObject all_assertions_mentioning_indexed_term_in_argpos(final SubLObject v_term, final SubLObject argpos, SubLObject include_negative_assertionsP) {
        if (include_negative_assertionsP == alchemy_export.UNPROVIDED) {
            include_negative_assertionsP = (SubLObject)alchemy_export.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)alchemy_export.NIL;
        final SubLObject truth = (SubLObject)((alchemy_export.NIL != include_negative_assertionsP) ? alchemy_export.NIL : alchemy_export.$kw81$TRUE);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)alchemy_export.$sym74$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(alchemy_export.$const67$InferencePSC, thread);
            result = kb_mapping.gather_gaf_arg_index(v_term, argpos, (SubLObject)alchemy_export.NIL, (SubLObject)alchemy_export.NIL, truth);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 27974L)
    public static SubLObject all_assertions_mentioning_any_indexed_term_in_set_or_coll(final SubLObject set_or_coll) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)alchemy_export.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)alchemy_export.$sym74$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(alchemy_export.$const67$InferencePSC, thread);
            SubLObject cdolist_list_var = quantities.set_extent(set_or_coll, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
            SubLObject inst = (SubLObject)alchemy_export.NIL;
            inst = cdolist_list_var.first();
            while (alchemy_export.NIL != cdolist_list_var) {
                if (alchemy_export.NIL != kb_indexing_datastructures.indexed_term_p(inst)) {
                    result = ConsesLow.append(kb_mapping.gather_index(inst, (SubLObject)alchemy_export.UNPROVIDED), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                inst = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.fast_delete_duplicates(result, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 28406L)
    public static SubLObject all_assertions_mentioning_any_quoted_instance_of(final SubLObject coll) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)alchemy_export.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)alchemy_export.$sym74$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(alchemy_export.$const67$InferencePSC, thread);
            SubLObject cdolist_list_var = isa.all_quoted_instances(coll, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
            SubLObject inst = (SubLObject)alchemy_export.NIL;
            inst = cdolist_list_var.first();
            while (alchemy_export.NIL != cdolist_list_var) {
                if (alchemy_export.NIL != kb_indexing_datastructures.indexed_term_p(inst)) {
                    result = ConsesLow.append(kb_mapping.gather_index(inst, (SubLObject)alchemy_export.UNPROVIDED), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                inst = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return list_utilities.fast_delete_duplicates(result, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 28818L)
    public static SubLObject all_assertions_mentioning_indexed_terms_in_set_or_coll_at_least_n_times(final SubLObject set_or_coll, final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert alchemy_export.NIL != subl_promotions.positive_integer_p(n) : n;
        final SubLObject candidate_assertions = all_assertions_mentioning_any_indexed_term_in_set_or_coll(set_or_coll);
        SubLObject assertions = (SubLObject)alchemy_export.NIL;
        if (alchemy_export.NIL != number_utilities.onep(n)) {
            assertions = candidate_assertions;
        }
        else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)alchemy_export.$sym74$RELEVANT_MT_IS_ANY_MT, thread);
                mt_relevance_macros.$mt$.bind(alchemy_export.$const67$InferencePSC, thread);
                SubLObject cdolist_list_var = candidate_assertions;
                SubLObject assertion = (SubLObject)alchemy_export.NIL;
                assertion = cdolist_list_var.first();
                while (alchemy_export.NIL != cdolist_list_var) {
                    final SubLObject assertion_forts = assertions_high.assertion_forts(assertion, (SubLObject)alchemy_export.T, (SubLObject)alchemy_export.T, (SubLObject)alchemy_export.NIL, (SubLObject)alchemy_export.NIL);
                    SubLObject inst_mentions;
                    SubLObject has_n_mentionsP;
                    SubLObject rest;
                    SubLObject assertion_fort;
                    for (inst_mentions = (SubLObject)alchemy_export.ZERO_INTEGER, has_n_mentionsP = (SubLObject)alchemy_export.NIL, rest = (SubLObject)alchemy_export.NIL, rest = assertion_forts; alchemy_export.NIL == has_n_mentionsP && alchemy_export.NIL != rest; has_n_mentionsP = Numbers.numGE(inst_mentions, n), rest = rest.rest()) {
                        assertion_fort = rest.first();
                        if (alchemy_export.NIL != isa.instantiationP(assertion_fort, set_or_coll, (SubLObject)alchemy_export.UNPROVIDED)) {
                            inst_mentions = Numbers.add(inst_mentions, (SubLObject)alchemy_export.ONE_INTEGER);
                        }
                    }
                    if (alchemy_export.NIL != has_n_mentionsP) {
                        assertions = (SubLObject)ConsesLow.cons(assertion, assertions);
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
        return assertions;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 29635L)
    public static SubLObject all_assertions_mentioning_quoted_instances_of_at_least_n_times(final SubLObject coll, final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert alchemy_export.NIL != subl_promotions.positive_integer_p(n) : n;
        final SubLObject candidate_assertions = all_assertions_mentioning_any_quoted_instance_of(coll);
        SubLObject assertions = (SubLObject)alchemy_export.NIL;
        if (alchemy_export.NIL != number_utilities.onep(n)) {
            assertions = candidate_assertions;
        }
        else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)alchemy_export.$sym74$RELEVANT_MT_IS_ANY_MT, thread);
                mt_relevance_macros.$mt$.bind(alchemy_export.$const67$InferencePSC, thread);
                SubLObject cdolist_list_var = candidate_assertions;
                SubLObject assertion = (SubLObject)alchemy_export.NIL;
                assertion = cdolist_list_var.first();
                while (alchemy_export.NIL != cdolist_list_var) {
                    final SubLObject assertion_forts = assertions_high.assertion_forts(assertion, (SubLObject)alchemy_export.T, (SubLObject)alchemy_export.T, (SubLObject)alchemy_export.NIL, (SubLObject)alchemy_export.NIL);
                    SubLObject inst_mentions;
                    SubLObject has_n_mentionsP;
                    SubLObject rest;
                    SubLObject assertion_fort;
                    for (inst_mentions = (SubLObject)alchemy_export.ZERO_INTEGER, has_n_mentionsP = (SubLObject)alchemy_export.NIL, rest = (SubLObject)alchemy_export.NIL, rest = assertion_forts; alchemy_export.NIL == has_n_mentionsP && alchemy_export.NIL != rest; has_n_mentionsP = Numbers.numGE(inst_mentions, n), rest = rest.rest()) {
                        assertion_fort = rest.first();
                        if (alchemy_export.NIL != isa.quoted_isaP(assertion_fort, coll, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED)) {
                            inst_mentions = Numbers.add(inst_mentions, (SubLObject)alchemy_export.ONE_INTEGER);
                        }
                    }
                    if (alchemy_export.NIL != has_n_mentionsP) {
                        assertions = (SubLObject)ConsesLow.cons(assertion, assertions);
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
        return assertions;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 30410L)
    public static SubLObject all_assertions_mentioning_any_indexed_term_in_set_or_coll_in_argpos(final SubLObject set_or_coll, final SubLObject argpos, SubLObject include_negative_assertionsP) {
        if (include_negative_assertionsP == alchemy_export.UNPROVIDED) {
            include_negative_assertionsP = (SubLObject)alchemy_export.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)alchemy_export.NIL;
        final SubLObject truth = (SubLObject)((alchemy_export.NIL != include_negative_assertionsP) ? alchemy_export.NIL : alchemy_export.$kw81$TRUE);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)alchemy_export.$sym74$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(alchemy_export.$const67$InferencePSC, thread);
            SubLObject cdolist_list_var = quantities.set_extent(set_or_coll, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
            SubLObject inst = (SubLObject)alchemy_export.NIL;
            inst = cdolist_list_var.first();
            while (alchemy_export.NIL != cdolist_list_var) {
                if (alchemy_export.NIL != kb_indexing_datastructures.indexed_term_p(inst)) {
                    result = ConsesLow.append(kb_mapping.gather_gaf_arg_index(inst, argpos, (SubLObject)alchemy_export.NIL, (SubLObject)alchemy_export.NIL, truth), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                inst = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 30981L)
    public static SubLObject all_assertions_mentioning_any_quoted_instance_of_in_argpos(final SubLObject coll, final SubLObject argpos, SubLObject include_negative_assertionsP) {
        if (include_negative_assertionsP == alchemy_export.UNPROVIDED) {
            include_negative_assertionsP = (SubLObject)alchemy_export.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)alchemy_export.NIL;
        final SubLObject truth = (SubLObject)((alchemy_export.NIL != include_negative_assertionsP) ? alchemy_export.NIL : alchemy_export.$kw81$TRUE);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)alchemy_export.$sym74$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(alchemy_export.$const67$InferencePSC, thread);
            SubLObject cdolist_list_var = isa.all_quoted_instances(coll, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
            SubLObject inst = (SubLObject)alchemy_export.NIL;
            inst = cdolist_list_var.first();
            while (alchemy_export.NIL != cdolist_list_var) {
                if (alchemy_export.NIL != kb_indexing_datastructures.indexed_term_p(inst)) {
                    result = ConsesLow.append(kb_mapping.gather_gaf_arg_index(inst, argpos, (SubLObject)alchemy_export.NIL, (SubLObject)alchemy_export.NIL, truth), result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                inst = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 31388L)
    public static SubLObject all_assertions_mentioning_all_indexed_terms_in_set_or_coll(final SubLObject set_or_coll) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)alchemy_export.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)alchemy_export.$sym74$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(alchemy_export.$const67$InferencePSC, thread);
            final SubLObject terms = quantities.set_extent(set_or_coll, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
            result = virtual_indexing.assertions_mentioning_terms(terms, (SubLObject)alchemy_export.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 31782L)
    public static SubLObject all_assertions_mentioning_all_quoted_instances_of(final SubLObject coll) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)alchemy_export.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)alchemy_export.$sym74$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(alchemy_export.$const67$InferencePSC, thread);
            final SubLObject terms = isa.all_quoted_instances(coll, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
            result = virtual_indexing.assertions_mentioning_terms(terms, (SubLObject)alchemy_export.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 32012L)
    public static SubLObject all_assertions_mentioning_only_indexed_terms_in_set_or_coll(final SubLObject set_or_coll) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject candidate_assertions = all_assertions_mentioning_any_indexed_term_in_set_or_coll(set_or_coll);
        SubLObject assertions = (SubLObject)alchemy_export.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)alchemy_export.$sym74$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(alchemy_export.$const67$InferencePSC, thread);
            SubLObject cdolist_list_var = candidate_assertions;
            SubLObject assertion = (SubLObject)alchemy_export.NIL;
            assertion = cdolist_list_var.first();
            while (alchemy_export.NIL != cdolist_list_var) {
                final SubLObject assertion_forts = assertions_high.assertion_forts(assertion, (SubLObject)alchemy_export.T, (SubLObject)alchemy_export.T, (SubLObject)alchemy_export.NIL, (SubLObject)alchemy_export.UNPROVIDED);
                SubLObject failP;
                SubLObject rest;
                SubLObject assertion_fort;
                for (failP = (SubLObject)alchemy_export.NIL, rest = (SubLObject)alchemy_export.NIL, rest = assertion_forts; alchemy_export.NIL == failP && alchemy_export.NIL != rest; rest = rest.rest()) {
                    assertion_fort = rest.first();
                    if (alchemy_export.NIL == isa.instantiationP(assertion_fort, set_or_coll, (SubLObject)alchemy_export.UNPROVIDED)) {
                        failP = (SubLObject)alchemy_export.T;
                    }
                }
                if (alchemy_export.NIL == failP) {
                    assertions = (SubLObject)ConsesLow.cons(assertion, assertions);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 32903L)
    public static SubLObject all_assertions_mentioning_only_quoted_instances_of(final SubLObject coll) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject candidate_assertions = all_assertions_mentioning_any_quoted_instance_of(coll);
        SubLObject assertions = (SubLObject)alchemy_export.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)alchemy_export.$sym74$RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind(alchemy_export.$const67$InferencePSC, thread);
            SubLObject cdolist_list_var = candidate_assertions;
            SubLObject assertion = (SubLObject)alchemy_export.NIL;
            assertion = cdolist_list_var.first();
            while (alchemy_export.NIL != cdolist_list_var) {
                final SubLObject assertion_forts = assertions_high.assertion_forts(assertion, (SubLObject)alchemy_export.T, (SubLObject)alchemy_export.T, (SubLObject)alchemy_export.NIL, (SubLObject)alchemy_export.UNPROVIDED);
                SubLObject failP;
                SubLObject rest;
                SubLObject assertion_fort;
                for (failP = (SubLObject)alchemy_export.NIL, rest = (SubLObject)alchemy_export.NIL, rest = assertion_forts; alchemy_export.NIL == failP && alchemy_export.NIL != rest; rest = rest.rest()) {
                    assertion_fort = rest.first();
                    if (alchemy_export.NIL == isa.quoted_isaP(assertion_fort, coll, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED)) {
                        failP = (SubLObject)alchemy_export.T;
                    }
                }
                if (alchemy_export.NIL == failP) {
                    assertions = (SubLObject)ConsesLow.cons(assertion, assertions);
                }
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return assertions;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 33441L)
    public static SubLObject alchemy_export(final SubLObject rules_criterion, final SubLObject training_criterion, final SubLObject evidence_criteria, final SubLObject rules_filename, final SubLObject training_filename, final SubLObject evidence_filenames, SubLObject rules_max_number, SubLObject training_max_number, SubLObject evidence_max_numbers) {
        if (rules_max_number == alchemy_export.UNPROVIDED) {
            rules_max_number = (SubLObject)alchemy_export.NIL;
        }
        if (training_max_number == alchemy_export.UNPROVIDED) {
            training_max_number = (SubLObject)alchemy_export.NIL;
        }
        if (evidence_max_numbers == alchemy_export.UNPROVIDED) {
            evidence_max_numbers = (SubLObject)alchemy_export.NIL;
        }
        check_assertion_selection_criterion(rules_criterion);
        check_assertion_selection_criterion(training_criterion);
        SubLObject cdolist_list_var = evidence_criteria;
        SubLObject evidence_criterion = (SubLObject)alchemy_export.NIL;
        evidence_criterion = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            check_assertion_selection_criterion(evidence_criterion);
            cdolist_list_var = cdolist_list_var.rest();
            evidence_criterion = cdolist_list_var.first();
        }
        final SubLObject augmented_rules_criterion = alchemy_export_augment_rule_criterion(rules_criterion);
        final SubLObject augmented_training_criterion = alchemy_export_augment_gaf_criterion(training_criterion);
        SubLObject augmented_evidence_criteria = (SubLObject)alchemy_export.NIL;
        SubLObject time = (SubLObject)alchemy_export.NIL;
        final SubLObject time_var = Time.get_internal_real_time();
        SubLObject cdolist_list_var2 = evidence_criteria;
        SubLObject evidence_criterion2 = (SubLObject)alchemy_export.NIL;
        evidence_criterion2 = cdolist_list_var2.first();
        while (alchemy_export.NIL != cdolist_list_var2) {
            augmented_evidence_criteria = (SubLObject)ConsesLow.cons(alchemy_export_augment_gaf_criterion(evidence_criterion2), augmented_evidence_criteria);
            cdolist_list_var2 = cdolist_list_var2.rest();
            evidence_criterion2 = cdolist_list_var2.first();
        }
        augmented_evidence_criteria = Sequences.nreverse(augmented_evidence_criteria);
        alchemy_export_int(augmented_rules_criterion, augmented_training_criterion, augmented_evidence_criteria, rules_filename, training_filename, evidence_filenames, rules_max_number, training_max_number, evidence_max_numbers);
        time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str82$_5D_seconds_duration__, Numbers.round(time, (SubLObject)alchemy_export.UNPROVIDED));
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 36433L)
    public static SubLObject alchemy_export_int(final SubLObject rules_criterion, final SubLObject training_criterion, final SubLObject evidence_criteria, final SubLObject rules_filename, final SubLObject training_filename, final SubLObject evidence_filenames, SubLObject rules_max_number, SubLObject training_max_number, SubLObject evidence_max_numbers) {
        if (rules_max_number == alchemy_export.UNPROVIDED) {
            rules_max_number = (SubLObject)alchemy_export.NIL;
        }
        if (training_max_number == alchemy_export.UNPROVIDED) {
            training_max_number = (SubLObject)alchemy_export.NIL;
        }
        if (evidence_max_numbers == alchemy_export.UNPROVIDED) {
            evidence_max_numbers = (SubLObject)alchemy_export.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert alchemy_export.NIL != Types.stringp(rules_filename) : rules_filename;
        assert alchemy_export.NIL != Types.stringp(training_filename) : training_filename;
        assert alchemy_export.NIL != list_utilities.non_dotted_list_p(evidence_filenames) : evidence_filenames;
        SubLObject cdolist_list_var = evidence_filenames;
        SubLObject elem = (SubLObject)alchemy_export.NIL;
        elem = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            assert alchemy_export.NIL != Types.stringp(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        if (alchemy_export.NIL != rules_max_number && !SubLTranslatedFile.assertionsDisabledInClass && alchemy_export.NIL == subl_promotions.positive_integer_p(rules_max_number)) {
            throw new AssertionError(rules_max_number);
        }
        if (alchemy_export.NIL != training_max_number && !SubLTrampolineFile.assertionsDisabledInClass && alchemy_export.NIL == subl_promotions.positive_integer_p(training_max_number)) {
            throw new AssertionError(training_max_number);
        }
        final SubLObject list_var = evidence_max_numbers;
        assert alchemy_export.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        cdolist_list_var = list_var;
        elem = (SubLObject)alchemy_export.NIL;
        elem = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            assert alchemy_export.NIL != subl_promotions.positive_integer_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        if (alchemy_export.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && alchemy_export.NIL == list_utilities.lengthE(evidence_filenames, Sequences.length(evidence_criteria), (SubLObject)alchemy_export.UNPROVIDED)) {
            Errors.error((SubLObject)alchemy_export.$str84$_S_and__S_are_not_lists_of_the_sa, evidence_criteria, evidence_filenames);
        }
        thread.resetMultipleValues();
        SubLObject training_gafs = alchemy_export_gather_training_rules_and_gafs(training_criterion, training_max_number, rules_criterion, rules_max_number);
        SubLObject training_rules = thread.secondMultipleValue();
        final SubLObject training_type_dictionary = thread.thirdMultipleValue();
        final SubLObject number_of_training_terms = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        thread.resetMultipleValues();
        SubLObject evidence_gaf_lists = alchemy_export_gather_evidence_gaf_lists(evidence_criteria, evidence_max_numbers);
        final SubLObject evidence_type_dictionaries = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject allowed_types = alchemy_export_allowed_types(training_type_dictionary, evidence_type_dictionaries);
        SubLObject training_gafs_analysis = (SubLObject)alchemy_export.NIL;
        SubLObject training_fol_predicates = (SubLObject)alchemy_export.NIL;
        SubLObject evidence_gafs_analyses = (SubLObject)alchemy_export.NIL;
        final SubLObject _prev_bind_0 = alchemy_export.$ae_number_of_sentences$.currentBinding(thread);
        try {
            alchemy_export.$ae_number_of_sentences$.bind((SubLObject)alchemy_export.ZERO_INTEGER, thread);
            SubLObject number_of_training_gafs = (SubLObject)alchemy_export.NIL;
            SubLObject number_of_training_rules = (SubLObject)alchemy_export.NIL;
            final SubLObject _prev_bind_0_$70 = alchemy_export.$ae_number_of_training_predicates$.currentBinding(thread);
            try {
                alchemy_export.$ae_number_of_training_predicates$.bind((SubLObject)alchemy_export.ZERO_INTEGER, thread);
                SubLObject number_of_evidence_gafs = (SubLObject)alchemy_export.NIL;
                final SubLObject _prev_bind_0_$71 = alchemy_export.$ae_number_of_evidence_terms$.currentBinding(thread);
                try {
                    alchemy_export.$ae_number_of_evidence_terms$.bind((SubLObject)alchemy_export.ZERO_INTEGER, thread);
                    alchemy_export_filter_dictionary(training_type_dictionary, allowed_types);
                    alchemy_export_types_file(training_type_dictionary, training_filename);
                    alchemy_export_filter_dictionaries(evidence_type_dictionaries, allowed_types);
                    alchemy_export_type_files(evidence_type_dictionaries, evidence_filenames);
                    training_gafs = alchemy_export_filter_gafs(training_gafs, allowed_types);
                    alchemy_export.$ae_number_of_sentences$.setDynamicValue((SubLObject)alchemy_export.ZERO_INTEGER, thread);
                    training_gafs_analysis = alchemy_export_gaf_file(training_gafs, training_filename);
                    number_of_training_gafs = alchemy_export.$ae_number_of_sentences$.getDynamicValue(thread);
                    training_rules = alchemy_export_filter_rules(training_rules, allowed_types);
                    training_fol_predicates = alchemy_export_training_fol_predicates(training_rules, training_gafs_analysis);
                    evidence_gaf_lists = alchemy_export_filter_gaf_lists(evidence_gaf_lists, allowed_types, training_fol_predicates);
                    alchemy_export.$ae_number_of_sentences$.setDynamicValue((SubLObject)alchemy_export.ZERO_INTEGER, thread);
                    evidence_gafs_analyses = alchemy_export_gaf_files(evidence_gaf_lists, evidence_filenames);
                    number_of_evidence_gafs = alchemy_export.$ae_number_of_sentences$.getDynamicValue(thread);
                    alchemy_export.$ae_number_of_sentences$.setDynamicValue((SubLObject)alchemy_export.ZERO_INTEGER, thread);
                    ae_filter_and_export_rule_file(training_rules, rules_filename, training_gafs_analysis, evidence_gafs_analyses, allowed_types, training_type_dictionary);
                    number_of_training_rules = alchemy_export.$ae_number_of_sentences$.getDynamicValue(thread);
                    PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str85$_____5D_training_gafs__, number_of_training_gafs);
                    PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str86$_5D_training_terms__, number_of_training_terms);
                    PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str87$_5D_training_rules__, number_of_training_rules);
                    PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str88$_5D_training_predicates__, alchemy_export.$ae_number_of_training_predicates$.getDynamicValue(thread));
                    PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str89$_5D_evidence_gafs__, number_of_evidence_gafs);
                    PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str90$_5D_evidence_terms__, alchemy_export.$ae_number_of_evidence_terms$.getDynamicValue(thread));
                    PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str91$_5D_types__, set.set_size(allowed_types));
                }
                finally {
                    alchemy_export.$ae_number_of_evidence_terms$.rebind(_prev_bind_0_$71, thread);
                }
            }
            finally {
                alchemy_export.$ae_number_of_training_predicates$.rebind(_prev_bind_0_$70, thread);
            }
        }
        finally {
            alchemy_export.$ae_number_of_sentences$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 41187L)
    public static SubLObject alchemy_export_gather_training_rules_and_gafs(final SubLObject training_criterion, final SubLObject training_max_number, final SubLObject rules_criterion, final SubLObject rules_max_number) {
        assert alchemy_export.NIL != Types.consp(training_criterion) : training_criterion;
        if (alchemy_export.NIL != training_max_number && !SubLTrampolineFile.assertionsDisabledInClass && alchemy_export.NIL == Types.integerp(training_max_number)) {
            throw new AssertionError(training_max_number);
        }
        assert alchemy_export.NIL != Types.consp(rules_criterion) : rules_criterion;
        if (alchemy_export.NIL != rules_max_number && !alchemy_export.assertionsDisabledInClass && alchemy_export.NIL == Types.integerp(rules_max_number)) {
            throw new AssertionError(rules_max_number);
        }
        SubLObject training_gafs = (SubLObject)alchemy_export.NIL;
        SubLObject training_rules = (SubLObject)alchemy_export.NIL;
        final SubLObject training_type_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)alchemy_export.EQUAL), (SubLObject)alchemy_export.UNPROVIDED);
        final SubLObject training_term_set = set.new_set(Symbols.symbol_function((SubLObject)alchemy_export.EQUAL), (SubLObject)alchemy_export.UNPROVIDED);
        PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str94$Finding_Alchemy_export_assertions);
        streams_high.force_output((SubLObject)alchemy_export.UNPROVIDED);
        SubLObject cdolist_list_var;
        training_gafs = (cdolist_list_var = alchemy_export_numeric_term_filter(alchemy_export_filter_assertions_acceptable_for_fol(find_assertions_by_criterion_no_checks(training_criterion, training_max_number))));
        SubLObject training_gaf = (SubLObject)alchemy_export.NIL;
        training_gaf = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            alchemy_export_add_types(training_gaf, training_type_dictionary, training_term_set);
            format_cycl_expression.format_cycl_expression(uncanonicalizer.assertion_el_formula(training_gaf), (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
            streams_high.terpri((SubLObject)alchemy_export.UNPROVIDED);
            streams_high.force_output((SubLObject)alchemy_export.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            training_gaf = cdolist_list_var.first();
        }
        alchemy_export_augment_instances_in_type_dictionary(training_type_dictionary, training_term_set);
        alchemy_export_display_types(training_type_dictionary, (SubLObject)alchemy_export.$str95$training_gafs);
        training_gafs = alchemy_export_filter_training_isa_gafs(training_gafs, training_type_dictionary, training_term_set);
        PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str96$__Finding_Alchemy_export_assertio);
        streams_high.force_output((SubLObject)alchemy_export.UNPROVIDED);
        training_rules = (cdolist_list_var = alchemy_export_numeric_term_filter(alchemy_export_filter_rules_by_allowed_types(alchemy_export_filter_assertions_acceptable_for_fol(find_assertions_by_criterion_no_checks(rules_criterion, rules_max_number)), training_type_dictionary, training_term_set)));
        SubLObject training_rule = (SubLObject)alchemy_export.NIL;
        training_rule = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            format_cycl_expression.format_cycl_expression(uncanonicalizer.assertion_el_formula(training_rule), (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
            streams_high.terpri((SubLObject)alchemy_export.UNPROVIDED);
            streams_high.force_output((SubLObject)alchemy_export.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            training_rule = cdolist_list_var.first();
        }
        alchemy_export_display_types(training_type_dictionary, (SubLObject)alchemy_export.$str97$training_rules);
        return Values.values(training_gafs, training_rules, training_type_dictionary, set.set_size(training_term_set));
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 43626L)
    public static SubLObject alchemy_export_gather_evidence_gaf_lists(final SubLObject evidence_criteria, final SubLObject evidence_max_numbers) {
        assert alchemy_export.NIL != Types.consp(evidence_criteria) : evidence_criteria;
        assert alchemy_export.NIL != Types.listp(evidence_max_numbers) : evidence_max_numbers;
        SubLObject evidence_gaf_lists = (SubLObject)alchemy_export.NIL;
        SubLObject evidence_type_dictionaries = (SubLObject)alchemy_export.NIL;
        PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str99$__Finding_Alchemy_export_assertio);
        streams_high.force_output((SubLObject)alchemy_export.UNPROVIDED);
        SubLObject evidence_criterion = (SubLObject)alchemy_export.NIL;
        SubLObject evidence_criterion_$72 = (SubLObject)alchemy_export.NIL;
        SubLObject evidence_max_number = (SubLObject)alchemy_export.NIL;
        SubLObject evidence_max_number_$73 = (SubLObject)alchemy_export.NIL;
        evidence_criterion = evidence_criteria;
        evidence_criterion_$72 = evidence_criterion.first();
        evidence_max_number = evidence_max_numbers;
        evidence_max_number_$73 = evidence_max_number.first();
        while (alchemy_export.NIL != evidence_max_number || alchemy_export.NIL != evidence_criterion) {
            SubLObject evidence_gafs = (SubLObject)alchemy_export.NIL;
            final SubLObject evidence_type_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)alchemy_export.EQUAL), (SubLObject)alchemy_export.UNPROVIDED);
            final SubLObject evidence_term_set = set.new_set(Symbols.symbol_function((SubLObject)alchemy_export.EQUAL), (SubLObject)alchemy_export.UNPROVIDED);
            SubLObject cdolist_list_var;
            evidence_gafs = (cdolist_list_var = alchemy_export_numeric_term_filter(alchemy_export_filter_assertions_acceptable_for_fol(find_assertions_by_criterion_no_checks(evidence_criterion_$72, evidence_max_number_$73))));
            SubLObject evidence_gaf = (SubLObject)alchemy_export.NIL;
            evidence_gaf = cdolist_list_var.first();
            while (alchemy_export.NIL != cdolist_list_var) {
                alchemy_export_add_types(evidence_gaf, evidence_type_dictionary, evidence_term_set);
                format_cycl_expression.format_cycl_expression(uncanonicalizer.assertion_el_formula(evidence_gaf), (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
                streams_high.terpri((SubLObject)alchemy_export.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                evidence_gaf = cdolist_list_var.first();
            }
            alchemy_export_augment_instances_in_type_dictionary(evidence_type_dictionary, evidence_term_set);
            alchemy_export_display_types(evidence_type_dictionary, (SubLObject)alchemy_export.$str100$evidence_gafs);
            evidence_gaf_lists = (SubLObject)ConsesLow.cons(evidence_gafs, evidence_gaf_lists);
            evidence_type_dictionaries = (SubLObject)ConsesLow.cons(evidence_type_dictionary, evidence_type_dictionaries);
            evidence_criterion = evidence_criterion.rest();
            evidence_criterion_$72 = evidence_criterion.first();
            evidence_max_number = evidence_max_number.rest();
            evidence_max_number_$73 = evidence_max_number.first();
        }
        evidence_gaf_lists = Sequences.nreverse(evidence_gaf_lists);
        evidence_type_dictionaries = Sequences.nreverse(evidence_type_dictionaries);
        return Values.values(evidence_gaf_lists, evidence_type_dictionaries);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 45320L)
    public static SubLObject alchemy_export_allowed_types(final SubLObject training_type_dictionary, final SubLObject evidence_type_dictionaries) {
        assert alchemy_export.NIL != dictionary.dictionary_p(training_type_dictionary) : training_type_dictionary;
        assert alchemy_export.NIL != list_utilities.non_dotted_list_p(evidence_type_dictionaries) : evidence_type_dictionaries;
        SubLObject cdolist_list_var = evidence_type_dictionaries;
        SubLObject elem = (SubLObject)alchemy_export.NIL;
        elem = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            assert alchemy_export.NIL != dictionary.dictionary_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        final SubLObject allowed_types = set.new_set(Symbols.symbol_function((SubLObject)alchemy_export.EQUAL), (SubLObject)alchemy_export.UNPROVIDED);
        SubLObject allowed_typeP = (SubLObject)alchemy_export.NIL;
        SubLObject cdolist_list_var2 = dictionary.dictionary_keys(training_type_dictionary);
        SubLObject training_type = (SubLObject)alchemy_export.NIL;
        training_type = cdolist_list_var2.first();
        while (alchemy_export.NIL != cdolist_list_var2) {
            allowed_typeP = (SubLObject)alchemy_export.T;
            SubLObject cdolist_list_var_$74 = evidence_type_dictionaries;
            SubLObject evidence_type_dictionary = (SubLObject)alchemy_export.NIL;
            evidence_type_dictionary = cdolist_list_var_$74.first();
            while (alchemy_export.NIL != cdolist_list_var_$74) {
                if (alchemy_export.NIL != allowed_typeP && alchemy_export.NIL == dictionary.dictionary_lookup(evidence_type_dictionary, training_type, (SubLObject)alchemy_export.UNPROVIDED)) {
                    allowed_typeP = (SubLObject)alchemy_export.NIL;
                }
                cdolist_list_var_$74 = cdolist_list_var_$74.rest();
                evidence_type_dictionary = cdolist_list_var_$74.first();
            }
            if (alchemy_export.NIL != allowed_typeP) {
                set.set_add(training_type, allowed_types);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            training_type = cdolist_list_var2.first();
        }
        alchemy_export_display_types(training_type_dictionary, (SubLObject)alchemy_export.$str102$allowed_types);
        return allowed_types;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 46230L)
    public static SubLObject alchemy_export_filter_dictionaries(final SubLObject type_dictionaries, final SubLObject allowed_types) {
        assert alchemy_export.NIL != list_utilities.non_dotted_list_p(type_dictionaries) : type_dictionaries;
        SubLObject cdolist_list_var = type_dictionaries;
        SubLObject elem = (SubLObject)alchemy_export.NIL;
        elem = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            assert alchemy_export.NIL != dictionary.dictionary_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert alchemy_export.NIL != set.set_p(allowed_types) : allowed_types;
        SubLObject cdolist_list_var2 = type_dictionaries;
        SubLObject type_dictionary = (SubLObject)alchemy_export.NIL;
        type_dictionary = cdolist_list_var2.first();
        while (alchemy_export.NIL != cdolist_list_var2) {
            alchemy_export_filter_dictionary(type_dictionary, allowed_types);
            cdolist_list_var2 = cdolist_list_var2.rest();
            type_dictionary = cdolist_list_var2.first();
        }
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 46633L)
    public static SubLObject alchemy_export_filter_dictionary(final SubLObject type_dictionary, final SubLObject allowed_types) {
        assert alchemy_export.NIL != dictionary.dictionary_p(type_dictionary) : type_dictionary;
        assert alchemy_export.NIL != set.set_p(allowed_types) : allowed_types;
        SubLObject cdolist_list_var = dictionary.dictionary_keys(type_dictionary);
        SubLObject type = (SubLObject)alchemy_export.NIL;
        type = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            if (alchemy_export.NIL == set.set_memberP(type, allowed_types)) {
                dictionary.dictionary_remove(type_dictionary, type);
            }
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        }
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 47057L)
    public static SubLObject alchemy_export_type_files(final SubLObject type_dictionaries, final SubLObject filenames) {
        assert alchemy_export.NIL != list_utilities.non_dotted_list_p(type_dictionaries) : type_dictionaries;
        SubLObject cdolist_list_var = type_dictionaries;
        SubLObject elem = (SubLObject)alchemy_export.NIL;
        elem = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            assert alchemy_export.NIL != dictionary.dictionary_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert alchemy_export.NIL != list_utilities.non_dotted_list_p(filenames) : filenames;
        cdolist_list_var = filenames;
        elem = (SubLObject)alchemy_export.NIL;
        elem = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            assert alchemy_export.NIL != Types.stringp(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject type_dictionary = (SubLObject)alchemy_export.NIL;
        SubLObject type_dictionary_$75 = (SubLObject)alchemy_export.NIL;
        SubLObject filename = (SubLObject)alchemy_export.NIL;
        SubLObject filename_$76 = (SubLObject)alchemy_export.NIL;
        type_dictionary = type_dictionaries;
        type_dictionary_$75 = type_dictionary.first();
        filename = filenames;
        filename_$76 = filename.first();
        while (alchemy_export.NIL != filename || alchemy_export.NIL != type_dictionary) {
            alchemy_export_types_file(type_dictionary_$75, filename_$76);
            type_dictionary = type_dictionary.rest();
            type_dictionary_$75 = type_dictionary.first();
            filename = filename.rest();
            filename_$76 = filename.first();
        }
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 47488L)
    public static SubLObject alchemy_export_filter_gaf_lists(final SubLObject evidence_gaf_lists, final SubLObject allowed_types, final SubLObject fol_predicates) {
        assert alchemy_export.NIL != list_utilities.non_dotted_list_p(evidence_gaf_lists) : evidence_gaf_lists;
        SubLObject cdolist_list_var = evidence_gaf_lists;
        SubLObject elem = (SubLObject)alchemy_export.NIL;
        elem = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            assert alchemy_export.NIL != Types.listp(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert alchemy_export.NIL != set.set_p(allowed_types) : allowed_types;
        SubLObject filtered_gaf_lists = (SubLObject)alchemy_export.NIL;
        cdolist_list_var = evidence_gaf_lists;
        SubLObject evidence_gafs = (SubLObject)alchemy_export.NIL;
        evidence_gafs = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            filtered_gaf_lists = (SubLObject)ConsesLow.cons(alchemy_export_filter_evidence_gafs(alchemy_export_filter_gafs(evidence_gafs, allowed_types), fol_predicates), filtered_gaf_lists);
            cdolist_list_var = cdolist_list_var.rest();
            evidence_gafs = cdolist_list_var.first();
        }
        filtered_gaf_lists = Sequences.nreverse(filtered_gaf_lists);
        return filtered_gaf_lists;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 48166L)
    public static SubLObject alchemy_export_filter_gafs(final SubLObject gafs, final SubLObject allowed_types) {
        assert alchemy_export.NIL != list_utilities.non_dotted_list_p(gafs) : gafs;
        SubLObject cdolist_list_var = gafs;
        SubLObject elem = (SubLObject)alchemy_export.NIL;
        elem = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            assert alchemy_export.NIL != assertion_handles.assertion_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert alchemy_export.NIL != set.set_p(allowed_types) : allowed_types;
        SubLObject filtered_gafs = (SubLObject)alchemy_export.NIL;
        final SubLObject evidence_term_set = set.new_set(Symbols.symbol_function((SubLObject)alchemy_export.EQUAL), (SubLObject)alchemy_export.UNPROVIDED);
        SubLObject cdolist_list_var2 = gafs;
        SubLObject gaf = (SubLObject)alchemy_export.NIL;
        gaf = cdolist_list_var2.first();
        while (alchemy_export.NIL != cdolist_list_var2) {
            final SubLObject expanded_el_formula = folification.fol_expand_sentence(uncanonicalizer.assertion_el_formula(gaf), alchemy_export.$const67$InferencePSC);
            final SubLObject predicate = cycl_utilities.formula_arg0(expanded_el_formula);
            final SubLObject args = cycl_utilities.formula_args(expanded_el_formula, (SubLObject)alchemy_export.UNPROVIDED);
            final SubLObject types = alchemy_predicate_arg_constraints(predicate, number_utilities.f_1_(Sequences.length(expanded_el_formula)));
            SubLObject types_acceptableP = (SubLObject)alchemy_export.T;
            SubLObject cdolist_list_var_$77 = args;
            SubLObject arg = (SubLObject)alchemy_export.NIL;
            arg = cdolist_list_var_$77.first();
            while (alchemy_export.NIL != cdolist_list_var_$77) {
                if (alchemy_export.NIL != forts.fort_p(arg)) {
                    set.set_add(arg, evidence_term_set);
                }
                cdolist_list_var_$77 = cdolist_list_var_$77.rest();
                arg = cdolist_list_var_$77.first();
            }
            alchemy_export.$ae_number_of_evidence_terms$.setDynamicValue(set.set_size(evidence_term_set));
            if (cycl_utilities.formula_arg0(expanded_el_formula).eql(alchemy_export.$const75$isa) && alchemy_export.NIL == set.set_memberP(cycl_utilities.formula_arg2(expanded_el_formula, (SubLObject)alchemy_export.UNPROVIDED), allowed_types)) {
                types_acceptableP = (SubLObject)alchemy_export.NIL;
                PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str105$____dropped_gaf_from_export_becau, cycl_utilities.formula_arg2(expanded_el_formula, (SubLObject)alchemy_export.UNPROVIDED), gaf);
            }
            SubLObject cdolist_list_var_$78 = types;
            SubLObject type = (SubLObject)alchemy_export.NIL;
            type = cdolist_list_var_$78.first();
            while (alchemy_export.NIL != cdolist_list_var_$78) {
                if (alchemy_export.NIL != types_acceptableP && alchemy_export.NIL == set.set_memberP(type, allowed_types)) {
                    types_acceptableP = (SubLObject)alchemy_export.NIL;
                    PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str105$____dropped_gaf_from_export_becau, type, gaf);
                }
                cdolist_list_var_$78 = cdolist_list_var_$78.rest();
                type = cdolist_list_var_$78.first();
            }
            if (alchemy_export.NIL != types_acceptableP) {
                filtered_gafs = (SubLObject)ConsesLow.cons(gaf, filtered_gafs);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            gaf = cdolist_list_var2.first();
        }
        return filtered_gafs;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 49642L)
    public static SubLObject alchemy_export_gaf_files(final SubLObject evidence_gaf_lists, final SubLObject evidence_filenames) {
        assert alchemy_export.NIL != list_utilities.non_dotted_list_p(evidence_gaf_lists) : evidence_gaf_lists;
        SubLObject cdolist_list_var = evidence_gaf_lists;
        SubLObject elem = (SubLObject)alchemy_export.NIL;
        elem = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            assert alchemy_export.NIL != Types.listp(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert alchemy_export.NIL != list_utilities.non_dotted_list_p(evidence_filenames) : evidence_filenames;
        cdolist_list_var = evidence_filenames;
        elem = (SubLObject)alchemy_export.NIL;
        elem = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            assert alchemy_export.NIL != Types.stringp(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject evidence_gafs_analyses = (SubLObject)alchemy_export.NIL;
        SubLObject evidence_gafs = (SubLObject)alchemy_export.NIL;
        SubLObject evidence_gafs_$79 = (SubLObject)alchemy_export.NIL;
        SubLObject evidence_filename = (SubLObject)alchemy_export.NIL;
        SubLObject evidence_filename_$80 = (SubLObject)alchemy_export.NIL;
        evidence_gafs = evidence_gaf_lists;
        evidence_gafs_$79 = evidence_gafs.first();
        evidence_filename = evidence_filenames;
        evidence_filename_$80 = evidence_filename.first();
        while (alchemy_export.NIL != evidence_filename || alchemy_export.NIL != evidence_gafs) {
            evidence_gafs_analyses = (SubLObject)ConsesLow.cons(alchemy_export_gaf_file(evidence_gafs_$79, evidence_filename_$80), evidence_gafs_analyses);
            evidence_gafs = evidence_gafs.rest();
            evidence_gafs_$79 = evidence_gafs.first();
            evidence_filename = evidence_filename.rest();
            evidence_filename_$80 = evidence_filename.first();
        }
        return Sequences.nreverse(evidence_gafs_analyses);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 50257L)
    public static SubLObject alchemy_export_gaf_file(final SubLObject gafs, final SubLObject filename) {
        assert alchemy_export.NIL != list_utilities.non_dotted_list_p(gafs) : gafs;
        SubLObject cdolist_list_var = gafs;
        SubLObject elem = (SubLObject)alchemy_export.NIL;
        elem = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            assert alchemy_export.NIL != assertion_handles.assertion_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert alchemy_export.NIL != Types.stringp(filename) : filename;
        SubLObject analysis = (SubLObject)alchemy_export.NIL;
        analysis = cycl_assertions_to_alchemy_style_fol(gafs);
        PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str106$Exporting_Alchemy_gaf_file__A__, filename);
        streams_high.force_output((SubLObject)alchemy_export.UNPROVIDED);
        alchemy_export_data_file(analysis, filename);
        return analysis;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 50720L)
    public static SubLObject alchemy_export_filter_rules(final SubLObject rules, final SubLObject allowed_types) {
        assert alchemy_export.NIL != list_utilities.non_dotted_list_p(rules) : rules;
        SubLObject cdolist_list_var = rules;
        SubLObject elem = (SubLObject)alchemy_export.NIL;
        elem = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            assert alchemy_export.NIL != assertion_handles.assertion_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert alchemy_export.NIL != set.set_p(allowed_types) : allowed_types;
        SubLObject filtered_rules = (SubLObject)alchemy_export.NIL;
        SubLObject expanded_el_formula = (SubLObject)alchemy_export.NIL;
        SubLObject cdolist_list_var2 = rules;
        SubLObject rule = (SubLObject)alchemy_export.NIL;
        rule = cdolist_list_var2.first();
        while (alchemy_export.NIL != cdolist_list_var2) {
            expanded_el_formula = folification.fol_expand_sentence(uncanonicalizer.assertion_el_formula(rule), alchemy_export.$const67$InferencePSC);
            PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str107$__considering_____A__, rule);
            final SubLObject lits = alchemy_export_get_lits(expanded_el_formula);
            SubLObject all_types_presentP = (SubLObject)alchemy_export.T;
            SubLObject cdolist_list_var_$81 = lits;
            SubLObject lit = (SubLObject)alchemy_export.NIL;
            lit = cdolist_list_var_$81.first();
            while (alchemy_export.NIL != cdolist_list_var_$81) {
                if (alchemy_export.NIL != all_types_presentP) {
                    final SubLObject predicate = cycl_utilities.formula_arg0(lit);
                    SubLObject types = (SubLObject)alchemy_export.NIL;
                    if (alchemy_export.NIL != forts.fort_p(predicate)) {
                        if (predicate.eql(alchemy_export.$const75$isa) && alchemy_export.NIL == set.set_memberP(cycl_utilities.formula_arg2(lit, (SubLObject)alchemy_export.UNPROVIDED), allowed_types)) {
                            all_types_presentP = (SubLObject)alchemy_export.NIL;
                            PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str108$_____A_is_not_an_allowed_type__, cycl_utilities.formula_arg2(lit, (SubLObject)alchemy_export.UNPROVIDED));
                        }
                        SubLObject cdolist_list_var_$82;
                        types = (cdolist_list_var_$82 = alchemy_predicate_arg_constraints(predicate, number_utilities.f_1_(Sequences.length(lit))));
                        SubLObject type = (SubLObject)alchemy_export.NIL;
                        type = cdolist_list_var_$82.first();
                        while (alchemy_export.NIL != cdolist_list_var_$82) {
                            if (alchemy_export.NIL != all_types_presentP && alchemy_export.NIL == set.set_memberP(type, allowed_types)) {
                                all_types_presentP = (SubLObject)alchemy_export.NIL;
                                PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str108$_____A_is_not_an_allowed_type__, type);
                            }
                            cdolist_list_var_$82 = cdolist_list_var_$82.rest();
                            type = cdolist_list_var_$82.first();
                        }
                    }
                    else {
                        PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str109$_____A_is_not_a_reified_predicate, predicate);
                        all_types_presentP = (SubLObject)alchemy_export.NIL;
                    }
                }
                cdolist_list_var_$81 = cdolist_list_var_$81.rest();
                lit = cdolist_list_var_$81.first();
            }
            if (alchemy_export.NIL != all_types_presentP) {
                filtered_rules = (SubLObject)ConsesLow.cons(rule, filtered_rules);
            }
            else {
                PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str110$____dropped_rule_from_export____A, rule);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            rule = cdolist_list_var2.first();
        }
        return filtered_rules;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 52230L)
    public static SubLObject alchemy_export_training_fol_predicates(final SubLObject rules, final SubLObject training_gafs_analysis) {
        assert alchemy_export.NIL != list_utilities.non_dotted_list_p(rules) : rules;
        SubLObject cdolist_list_var = rules;
        SubLObject elem = (SubLObject)alchemy_export.NIL;
        elem = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            assert alchemy_export.NIL != assertion_handles.assertion_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert alchemy_export.NIL != Types.consp(training_gafs_analysis) : training_gafs_analysis;
        SubLObject rules_analysis = (SubLObject)alchemy_export.NIL;
        rules_analysis = cycl_assertions_to_alchemy_style_fol(rules);
        SubLObject current;
        final SubLObject datum = current = all_fol_predicates_and_arguments_mentioned_in_analyses((SubLObject)ConsesLow.list(rules_analysis, training_gafs_analysis));
        SubLObject training_fol_predicates = (SubLObject)alchemy_export.NIL;
        SubLObject training_fol_arguments = (SubLObject)alchemy_export.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)alchemy_export.$list111);
        training_fol_predicates = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)alchemy_export.$list111);
        training_fol_arguments = current.first();
        current = current.rest();
        if (alchemy_export.NIL == current) {
            return training_fol_predicates;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)alchemy_export.$list111);
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 52846L)
    public static SubLObject ae_filter_and_export_rule_file(final SubLObject rules, final SubLObject filename, final SubLObject training_gafs_analysis, final SubLObject evidence_gafs_analyses, final SubLObject allowed_types, final SubLObject training_type_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert alchemy_export.NIL != list_utilities.non_dotted_list_p(rules) : rules;
        SubLObject cdolist_list_var = rules;
        SubLObject elem = (SubLObject)alchemy_export.NIL;
        elem = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            assert alchemy_export.NIL != assertion_handles.assertion_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert alchemy_export.NIL != Types.stringp(filename) : filename;
        assert alchemy_export.NIL != Types.consp(training_gafs_analysis) : training_gafs_analysis;
        assert alchemy_export.NIL != set.set_p(allowed_types) : allowed_types;
        assert alchemy_export.NIL != dictionary.dictionary_p(training_type_dictionary) : training_type_dictionary;
        final SubLObject rules_analysis = cycl_assertions_to_alchemy_style_fol(rules);
        SubLObject filtered_fol_predicates = (SubLObject)alchemy_export.NIL;
        SubLObject types_allowedP = (SubLObject)alchemy_export.NIL;
        PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str112$Exporting_Alchemy_rules_file__A__, filename);
        streams_high.force_output((SubLObject)alchemy_export.UNPROVIDED);
        SubLObject current;
        final SubLObject datum = current = all_fol_predicates_and_arguments_mentioned_in_analyses(ConsesLow.append((SubLObject)ConsesLow.list(rules_analysis, training_gafs_analysis), evidence_gafs_analyses));
        SubLObject all_fol_predicates = (SubLObject)alchemy_export.NIL;
        SubLObject all_fol_arguments = (SubLObject)alchemy_export.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)alchemy_export.$list113);
        all_fol_predicates = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)alchemy_export.$list113);
        all_fol_arguments = current.first();
        current = current.rest();
        if (alchemy_export.NIL == current) {
            SubLObject cdolist_list_var2 = all_fol_predicates;
            SubLObject fol_predicate = (SubLObject)alchemy_export.NIL;
            fol_predicate = cdolist_list_var2.first();
            while (alchemy_export.NIL != cdolist_list_var2) {
                types_allowedP = (SubLObject)alchemy_export.T;
                SubLObject current_$84;
                final SubLObject datum_$83 = current_$84 = fol_predicate;
                SubLObject fol_predicate_fn = (SubLObject)alchemy_export.NIL;
                SubLObject predicate = (SubLObject)alchemy_export.NIL;
                SubLObject v_arity = (SubLObject)alchemy_export.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current_$84, datum_$83, (SubLObject)alchemy_export.$list114);
                fol_predicate_fn = current_$84.first();
                current_$84 = current_$84.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$84, datum_$83, (SubLObject)alchemy_export.$list114);
                predicate = current_$84.first();
                current_$84 = current_$84.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current_$84, datum_$83, (SubLObject)alchemy_export.$list114);
                v_arity = current_$84.first();
                current_$84 = current_$84.rest();
                if (alchemy_export.NIL == current_$84) {
                    SubLObject cdolist_list_var_$85;
                    final SubLObject types = cdolist_list_var_$85 = alchemy_predicate_arg_constraints(predicate, v_arity);
                    SubLObject type = (SubLObject)alchemy_export.NIL;
                    type = cdolist_list_var_$85.first();
                    while (alchemy_export.NIL != cdolist_list_var_$85) {
                        if (alchemy_export.NIL != types_allowedP && alchemy_export.NIL == set.set_memberP(type, allowed_types)) {
                            PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str115$__dropping_predicate__A_having_ar, predicate, type);
                            types_allowedP = (SubLObject)alchemy_export.NIL;
                        }
                        cdolist_list_var_$85 = cdolist_list_var_$85.rest();
                        type = cdolist_list_var_$85.first();
                    }
                    if (alchemy_export.NIL != types_allowedP) {
                        filtered_fol_predicates = (SubLObject)ConsesLow.cons(fol_predicate, filtered_fol_predicates);
                    }
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum_$83, (SubLObject)alchemy_export.$list114);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                fol_predicate = cdolist_list_var2.first();
            }
            alchemy_export.$ae_number_of_training_predicates$.setDynamicValue(Sequences.length(filtered_fol_predicates), thread);
            final SubLObject _prev_bind_0 = folification.$alchemy_output_monotonic_rule_indicator$.currentBinding(thread);
            try {
                folification.$alchemy_output_monotonic_rule_indicator$.bind((SubLObject)alchemy_export.T, thread);
                ae_export_rules_file(rules_analysis, filtered_fol_predicates, training_type_dictionary, filename);
            }
            finally {
                folification.$alchemy_output_monotonic_rule_indicator$.rebind(_prev_bind_0, thread);
            }
            return (SubLObject)alchemy_export.NIL;
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)alchemy_export.$list113);
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 54689L)
    public static SubLObject alchemy_export_augment_rule_criterion(final SubLObject rule_criterion) {
        if (rule_criterion.isCons() && Sequences.length(rule_criterion).eql((SubLObject)alchemy_export.THREE_INTEGER) && rule_criterion.first() == alchemy_export.$kw25$INTERSECTION && (conses_high.second(rule_criterion) == alchemy_export.$kw12$RULE || conses_high.third(rule_criterion) == alchemy_export.$kw12$RULE)) {
            return rule_criterion;
        }
        return (SubLObject)ConsesLow.list((SubLObject)alchemy_export.$kw25$INTERSECTION, (SubLObject)alchemy_export.$kw12$RULE, rule_criterion);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 55139L)
    public static SubLObject alchemy_export_augment_gaf_criterion(final SubLObject gaf_criterion) {
        if (gaf_criterion.isCons() && Sequences.length(gaf_criterion).eql((SubLObject)alchemy_export.THREE_INTEGER) && gaf_criterion.first() == alchemy_export.$kw25$INTERSECTION && (conses_high.second(gaf_criterion) == alchemy_export.$kw13$GAF || conses_high.third(gaf_criterion) == alchemy_export.$kw13$GAF)) {
            return gaf_criterion;
        }
        return (SubLObject)ConsesLow.list((SubLObject)alchemy_export.$kw25$INTERSECTION, (SubLObject)alchemy_export.$kw13$GAF, gaf_criterion);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 55575L)
    public static SubLObject alchemy_export_add_types(final SubLObject assertion, final SubLObject type_dictionary, final SubLObject term_set) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert alchemy_export.NIL != assertion_handles.assertion_p(assertion) : assertion;
        assert alchemy_export.NIL != dictionary.dictionary_p(type_dictionary) : type_dictionary;
        assert alchemy_export.NIL != set.set_p(term_set) : term_set;
        if (alchemy_export.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && alchemy_export.NIL == assertions_high.gaf_assertionP(assertion)) {
            Errors.error((SubLObject)alchemy_export.$str116$_A_must_be_a_GAF, assertion);
        }
        if (cycl_utilities.formula_arg0(assertion).eql(alchemy_export.$const75$isa)) {
            final SubLObject v_term = cycl_utilities.formula_arg1(assertion, (SubLObject)alchemy_export.UNPROVIDED);
            final SubLObject type = cycl_utilities.formula_arg2(assertion, (SubLObject)alchemy_export.UNPROVIDED);
            set.set_add(v_term, term_set);
            alchemy_export_type_dictionary_pushnew(type_dictionary, type, v_term, assertion);
            set.set_add(type, term_set);
            alchemy_export_type_dictionary_pushnew(type_dictionary, alchemy_export.$const117$Thing, v_term, assertion);
            alchemy_export_type_dictionary_pushnew(type_dictionary, alchemy_export.$const118$Collection, type, assertion);
            return (SubLObject)alchemy_export.NIL;
        }
        final SubLObject expanded_el_formula = folification.fol_expand_sentence(uncanonicalizer.assertion_el_formula(assertion), alchemy_export.$const67$InferencePSC);
        SubLObject cdolist_list_var;
        final SubLObject lits = cdolist_list_var = alchemy_export_get_lits(expanded_el_formula);
        SubLObject lit = (SubLObject)alchemy_export.NIL;
        lit = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            final SubLObject predicate = cycl_utilities.formula_arg0(lit);
            final SubLObject terms = cycl_utilities.formula_args(lit, (SubLObject)alchemy_export.UNPROVIDED);
            final SubLObject v_arity = number_utilities.f_1_(Sequences.length(lit));
            final SubLObject types = alchemy_predicate_arg_constraints(predicate, v_arity);
            SubLObject type2 = (SubLObject)alchemy_export.NIL;
            SubLObject type_$86 = (SubLObject)alchemy_export.NIL;
            SubLObject v_term2 = (SubLObject)alchemy_export.NIL;
            SubLObject v_term_$87 = (SubLObject)alchemy_export.NIL;
            type2 = types;
            type_$86 = type2.first();
            v_term2 = terms;
            v_term_$87 = v_term2.first();
            while (alchemy_export.NIL != v_term2 || alchemy_export.NIL != type2) {
                set.set_add(v_term_$87, term_set);
                alchemy_export_type_dictionary_pushnew(type_dictionary, type_$86, v_term_$87, assertion);
                type2 = type2.rest();
                type_$86 = type2.first();
                v_term2 = v_term2.rest();
                v_term_$87 = v_term2.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        }
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 57093L)
    public static SubLObject alchemy_export_type_dictionary_enter(final SubLObject type_dictionary, final SubLObject type, final SubLObject v_term, final SubLObject obj) {
        assert alchemy_export.NIL != dictionary.dictionary_p(type_dictionary) : type_dictionary;
        if (alchemy_export.NIL == forts.fort_p(type) && !type.isCons()) {
            Errors.error((SubLObject)alchemy_export.$str119$_A_is_not_a_valid_type__from_obj_, type, obj);
        }
        dictionary.dictionary_enter(type_dictionary, type, v_term);
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 57513L)
    public static SubLObject alchemy_export_type_dictionary_pushnew(final SubLObject type_dictionary, final SubLObject type, final SubLObject v_term, final SubLObject obj) {
        assert alchemy_export.NIL != dictionary.dictionary_p(type_dictionary) : type_dictionary;
        if (alchemy_export.NIL == forts.fort_p(type) && !type.isCons()) {
            Errors.error((SubLObject)alchemy_export.$str119$_A_is_not_a_valid_type__from_obj_, type, obj);
        }
        dictionary_utilities.dictionary_pushnew(type_dictionary, type, v_term, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 57970L)
    public static SubLObject alchemy_export_augment_instances_in_type_dictionary(final SubLObject type_dictionary, final SubLObject term_set) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert alchemy_export.NIL != dictionary.dictionary_p(type_dictionary) : type_dictionary;
        assert alchemy_export.NIL != set.set_p(term_set) : term_set;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(type_dictionary)); alchemy_export.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject type = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject terms = thread.secondMultipleValue();
            thread.resetMultipleValues();
            PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str120$__augmenting_type__A__, type);
            if (alchemy_export.NIL == forts.fort_p(type) && !type.isCons()) {
                Errors.error((SubLObject)alchemy_export.$str121$_A_is_not_a_valid_type, type);
            }
            final SubLObject set_contents_var = set.do_set_internal(term_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject v_term;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)alchemy_export.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); alchemy_export.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                v_term = set_contents.do_set_contents_next(basis_object, state);
                if (alchemy_export.NIL != set_contents.do_set_contents_element_validP(state, v_term) && alchemy_export.NIL == subl_promotions.memberP(v_term, terms, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED) && alchemy_export.NIL != isa.isa_in_any_mtP(v_term, type)) {
                    PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str122$____with__A__, v_term);
                    alchemy_export_type_dictionary_pushnew(type_dictionary, type, v_term, (SubLObject)alchemy_export.NIL);
                }
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 58608L)
    public static SubLObject alchemy_export_display_types(final SubLObject type_dictionary, final SubLObject comment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert alchemy_export.NIL != dictionary.dictionary_p(type_dictionary) : type_dictionary;
        assert alchemy_export.NIL != Types.stringp(comment) : comment;
        PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str123$__Instantiated_types_in_the__A___, comment);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(type_dictionary)); alchemy_export.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject type = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject value_list = thread.secondMultipleValue();
            thread.resetMultipleValues();
            PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str124$___A___A__, type, value_list);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 59099L)
    public static SubLObject alchemy_export_filter_rules_by_allowed_types(final SubLObject training_rules, final SubLObject type_dictionary, final SubLObject term_set) {
        assert alchemy_export.NIL != list_utilities.non_dotted_list_p(training_rules) : training_rules;
        SubLObject cdolist_list_var = training_rules;
        SubLObject elem = (SubLObject)alchemy_export.NIL;
        elem = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            assert alchemy_export.NIL != assertion_handles.assertion_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert alchemy_export.NIL != dictionary.dictionary_p(type_dictionary) : type_dictionary;
        assert alchemy_export.NIL != set.set_p(term_set) : term_set;
        SubLObject filtered_training_rules = (SubLObject)alchemy_export.NIL;
        SubLObject expanded_el_formula = (SubLObject)alchemy_export.NIL;
        SubLObject cdolist_list_var2 = training_rules;
        SubLObject training_rule = (SubLObject)alchemy_export.NIL;
        training_rule = cdolist_list_var2.first();
        while (alchemy_export.NIL != cdolist_list_var2) {
            expanded_el_formula = folification.fol_expand_sentence(uncanonicalizer.assertion_el_formula(training_rule), alchemy_export.$const67$InferencePSC);
            PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str107$__considering_____A__, training_rule);
            final SubLObject lits = alchemy_export_get_lits(expanded_el_formula);
            SubLObject all_types_presentP = (SubLObject)alchemy_export.T;
            final SubLObject variable_type_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)alchemy_export.EQUAL), (SubLObject)alchemy_export.UNPROVIDED);
            final SubLObject rule_term_set = set.new_set(Symbols.symbol_function((SubLObject)alchemy_export.EQUAL), (SubLObject)alchemy_export.UNPROVIDED);
            final SubLObject rule_type_dictionary = dictionary.new_dictionary(Symbols.symbol_function((SubLObject)alchemy_export.EQUAL), (SubLObject)alchemy_export.UNPROVIDED);
            SubLObject cdolist_list_var_$88 = lits;
            SubLObject lit = (SubLObject)alchemy_export.NIL;
            lit = cdolist_list_var_$88.first();
            while (alchemy_export.NIL != cdolist_list_var_$88) {
                if (alchemy_export.NIL != all_types_presentP) {
                    final SubLObject predicate = cycl_utilities.formula_arg0(lit);
                    final SubLObject args = cycl_utilities.formula_args(lit, (SubLObject)alchemy_export.UNPROVIDED);
                    SubLObject types = (SubLObject)alchemy_export.NIL;
                    if (alchemy_export.NIL != forts.fort_p(predicate)) {
                        types = alchemy_predicate_arg_constraints(predicate, number_utilities.f_1_(Sequences.length(lit)));
                        SubLObject type = (SubLObject)alchemy_export.NIL;
                        SubLObject type_$89 = (SubLObject)alchemy_export.NIL;
                        SubLObject arg = (SubLObject)alchemy_export.NIL;
                        SubLObject arg_$90 = (SubLObject)alchemy_export.NIL;
                        type = types;
                        type_$89 = type.first();
                        arg = args;
                        arg_$90 = arg.first();
                        while (alchemy_export.NIL != arg || alchemy_export.NIL != type) {
                            if (alchemy_export.NIL != forts.fort_p(arg_$90) || alchemy_export.NIL != term.ground_nautP(arg_$90, (SubLObject)alchemy_export.UNPROVIDED)) {
                                set.set_add(arg_$90, rule_term_set);
                                alchemy_export_type_dictionary_pushnew(rule_type_dictionary, type_$89, arg_$90, training_rule);
                            }
                            if (alchemy_export.NIL != all_types_presentP) {
                                all_types_presentP = alchemy_export_check_type_dictionary_for_type(type_$89, type_dictionary, term_set, rule_type_dictionary, rule_term_set, training_rule);
                            }
                            if (alchemy_export.NIL != all_types_presentP && alchemy_export.NIL != cycl_variables.hl_varP(arg_$90)) {
                                dictionary_utilities.dictionary_pushnew(variable_type_dictionary, arg_$90, type_$89, Symbols.symbol_function((SubLObject)alchemy_export.EQUAL), (SubLObject)alchemy_export.UNPROVIDED);
                            }
                            type = type.rest();
                            type_$89 = type.first();
                            arg = arg.rest();
                            arg_$90 = arg.first();
                        }
                    }
                    else {
                        PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str109$_____A_is_not_a_reified_predicate, predicate);
                        all_types_presentP = (SubLObject)alchemy_export.NIL;
                    }
                }
                cdolist_list_var_$88 = cdolist_list_var_$88.rest();
                lit = cdolist_list_var_$88.first();
            }
            if (alchemy_export.NIL != all_types_presentP && alchemy_export.NIL != ae_all_variables_have_instances(variable_type_dictionary, term_set, rule_term_set)) {
                filtered_training_rules = (SubLObject)ConsesLow.cons(training_rule, filtered_training_rules);
                dictionary_utilities.dictionary_merge_list_values(type_dictionary, rule_type_dictionary, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
                set_utilities.set_nmerge(term_set, rule_term_set);
            }
            else {
                PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str110$____dropped_rule_from_export____A, training_rule);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            training_rule = cdolist_list_var2.first();
        }
        streams_high.force_output((SubLObject)alchemy_export.UNPROVIDED);
        return filtered_training_rules;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 61891L)
    public static SubLObject alchemy_export_check_type_dictionary_for_type(final SubLObject type, final SubLObject type_dictionary, final SubLObject term_set, final SubLObject rule_type_dictionary, final SubLObject rule_term_set, final SubLObject assertion) {
        assert alchemy_export.NIL != dictionary.dictionary_p(type_dictionary) : type_dictionary;
        assert alchemy_export.NIL != set.set_p(term_set) : term_set;
        assert alchemy_export.NIL != dictionary.dictionary_p(rule_type_dictionary) : rule_type_dictionary;
        assert alchemy_export.NIL != set.set_p(rule_term_set) : rule_term_set;
        assert alchemy_export.NIL != assertion_handles.assertion_p(assertion) : assertion;
        if (alchemy_export.NIL != dictionary.dictionary_lookup(type_dictionary, type, (SubLObject)alchemy_export.UNPROVIDED)) {
            return (SubLObject)alchemy_export.T;
        }
        if (alchemy_export.NIL != list_utilities.simple_tree_findP(alchemy_export.$const125$FOL_UnhandledFn, folification.fol_transform_arg(type))) {
            PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str126$_____A_cannot_be_folified__, type);
            return (SubLObject)alchemy_export.NIL;
        }
        SubLObject instantion_present_in_term_setP = (SubLObject)alchemy_export.NIL;
        SubLObject set_contents_var = set.do_set_internal(term_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject v_term;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)alchemy_export.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); alchemy_export.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            v_term = set_contents.do_set_contents_next(basis_object, state);
            if (alchemy_export.NIL != set_contents.do_set_contents_element_validP(state, v_term) && alchemy_export.NIL == instantion_present_in_term_setP && alchemy_export.NIL != alchemy_export_isa_term_type(v_term, type)) {
                instantion_present_in_term_setP = (SubLObject)alchemy_export.T;
            }
        }
        if (alchemy_export.NIL == instantion_present_in_term_setP) {
            set_contents_var = set.do_set_internal(rule_term_set);
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)alchemy_export.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); alchemy_export.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                v_term = set_contents.do_set_contents_next(basis_object, state);
                if (alchemy_export.NIL != set_contents.do_set_contents_element_validP(state, v_term) && alchemy_export.NIL == instantion_present_in_term_setP && alchemy_export.NIL != alchemy_export_isa_term_type(v_term, type)) {
                    instantion_present_in_term_setP = (SubLObject)alchemy_export.T;
                }
            }
        }
        if (alchemy_export.NIL == instantion_present_in_term_setP) {
            PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str127$_____A_is_not_instantiated_in_ter, type);
            return (SubLObject)alchemy_export.NIL;
        }
        final SubLObject set_contents_var2 = set.do_set_internal(term_set);
        SubLObject basis_object2;
        SubLObject state2;
        SubLObject v_term2;
        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)alchemy_export.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); alchemy_export.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
            v_term2 = set_contents.do_set_contents_next(basis_object2, state2);
            if (alchemy_export.NIL != set_contents.do_set_contents_element_validP(state2, v_term2) && alchemy_export.NIL != alchemy_export_isa_term_type(v_term2, type)) {
                PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str128$________adding_instance__A_of__A_, v_term2, type);
                alchemy_export_type_dictionary_pushnew(rule_type_dictionary, type, v_term2, assertion);
            }
        }
        return (SubLObject)alchemy_export.T;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 63558L)
    public static SubLObject ae_all_variables_have_instances(final SubLObject variable_type_dictionary, final SubLObject term_set, final SubLObject rule_term_set) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert alchemy_export.NIL != dictionary.dictionary_p(variable_type_dictionary) : variable_type_dictionary;
        assert alchemy_export.NIL != set.set_p(term_set) : term_set;
        assert alchemy_export.NIL != set.set_p(rule_term_set) : rule_term_set;
        final SubLObject terms = set.set_element_list(set_utilities.set_union((SubLObject)ConsesLow.list(term_set, rule_term_set), (SubLObject)alchemy_export.UNPROVIDED));
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(variable_type_dictionary)); alchemy_export.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject variable = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject types = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject instantiations = (SubLObject)alchemy_export.NIL;
            SubLObject current_instantiations = (SubLObject)alchemy_export.NIL;
            SubLObject cdolist_list_var = types;
            SubLObject type = (SubLObject)alchemy_export.NIL;
            type = cdolist_list_var.first();
            while (alchemy_export.NIL != cdolist_list_var) {
                current_instantiations = (SubLObject)alchemy_export.NIL;
                SubLObject cdolist_list_var_$91 = terms;
                SubLObject v_term = (SubLObject)alchemy_export.NIL;
                v_term = cdolist_list_var_$91.first();
                while (alchemy_export.NIL != cdolist_list_var_$91) {
                    if (alchemy_export.NIL != alchemy_export_isa_term_type(v_term, type)) {
                        current_instantiations = (SubLObject)ConsesLow.cons(v_term, current_instantiations);
                    }
                    cdolist_list_var_$91 = cdolist_list_var_$91.rest();
                    v_term = cdolist_list_var_$91.first();
                }
                if (alchemy_export.NIL == instantiations) {
                    instantiations = current_instantiations;
                }
                instantiations = conses_high.intersection(instantiations, current_instantiations, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
                if (alchemy_export.NIL == instantiations) {
                    PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str129$____hl_variable__A_cannot_be_inst, variable);
                    return (SubLObject)alchemy_export.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                type = cdolist_list_var.first();
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return (SubLObject)alchemy_export.T;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 64604L)
    public static SubLObject alchemy_export_numeric_term_filter(final SubLObject assertions) {
        assert alchemy_export.NIL != list_utilities.non_dotted_list_p(assertions) : assertions;
        SubLObject cdolist_list_var = assertions;
        SubLObject elem = (SubLObject)alchemy_export.NIL;
        elem = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            assert alchemy_export.NIL != assertion_handles.assertion_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject filtered_assertions = (SubLObject)alchemy_export.NIL;
        cdolist_list_var = assertions;
        SubLObject assertion = (SubLObject)alchemy_export.NIL;
        assertion = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            final SubLObject cnf = assertions_high.assertion_cnf(assertion);
            final SubLObject lits = ConsesLow.append(clauses.neg_lits(cnf), clauses.pos_lits(cnf));
            SubLObject numeric_term_presentP = (SubLObject)alchemy_export.NIL;
            SubLObject cdolist_list_var_$92 = lits;
            SubLObject lit = (SubLObject)alchemy_export.NIL;
            lit = cdolist_list_var_$92.first();
            while (alchemy_export.NIL != cdolist_list_var_$92) {
                if (alchemy_export.NIL == numeric_term_presentP) {
                    SubLObject cdolist_list_var_$93 = cycl_utilities.formula_args(lit, (SubLObject)alchemy_export.UNPROVIDED);
                    SubLObject arg = (SubLObject)alchemy_export.NIL;
                    arg = cdolist_list_var_$93.first();
                    while (alchemy_export.NIL != cdolist_list_var_$93) {
                        if (alchemy_export.NIL == numeric_term_presentP && arg.isNumber()) {
                            numeric_term_presentP = (SubLObject)alchemy_export.T;
                        }
                        cdolist_list_var_$93 = cdolist_list_var_$93.rest();
                        arg = cdolist_list_var_$93.first();
                    }
                }
                cdolist_list_var_$92 = cdolist_list_var_$92.rest();
                lit = cdolist_list_var_$92.first();
            }
            if (alchemy_export.NIL != numeric_term_presentP) {
                PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str130$____dropped_numeric_term_assertio, assertion);
            }
            else {
                filtered_assertions = (SubLObject)ConsesLow.cons(assertion, filtered_assertions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return filtered_assertions;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 65402L)
    public static SubLObject alchemy_export_isa_term_type(final SubLObject v_term, final SubLObject type) {
        SubLObject v_answer = (SubLObject)alchemy_export.NIL;
        if (alchemy_export.NIL != constant_handles.constant_p(type)) {
            v_answer = isa.isa_in_any_mtP(v_term, type);
        }
        else if (type.isCons() && cycl_utilities.formula_arg0(type).eql(alchemy_export.$const131$CollectionIntersectionFn)) {
            v_answer = alchemy_export_isa_term_coll_intersection_type(v_term, type);
        }
        else {
            v_answer = Equality.equal((SubLObject)alchemy_export.$list132, inference_kernel.new_cyc_query((SubLObject)ConsesLow.list(alchemy_export.$const75$isa, v_term, type), alchemy_export.$const133$EverythingPSC, (SubLObject)alchemy_export.$list134));
        }
        return v_answer;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 66180L)
    public static SubLObject alchemy_export_isa_term_coll_intersection_type(final SubLObject v_term, final SubLObject coll_intersection_type) {
        SubLObject cdolist_list_var = cycl_utilities.formula_args(cycl_utilities.formula_arg1(coll_intersection_type, (SubLObject)alchemy_export.UNPROVIDED), (SubLObject)alchemy_export.UNPROVIDED);
        SubLObject type = (SubLObject)alchemy_export.NIL;
        type = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            if (alchemy_export.NIL == alchemy_export_isa_term_type(v_term, type)) {
                return (SubLObject)alchemy_export.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        }
        return (SubLObject)alchemy_export.T;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 66528L)
    public static SubLObject alchemy_export_get_lits(final SubLObject el_formula) {
        assert alchemy_export.NIL != Types.consp(el_formula) : el_formula;
        final SubLObject hl_items = czer_main.el_to_hl(el_formula, alchemy_export.$const67$InferencePSC);
        SubLObject clause = (SubLObject)alchemy_export.NIL;
        SubLObject neg_lits = (SubLObject)alchemy_export.NIL;
        SubLObject pos_lits = (SubLObject)alchemy_export.NIL;
        SubLObject lits = (SubLObject)alchemy_export.NIL;
        SubLObject cdolist_list_var = hl_items;
        SubLObject hl_item = (SubLObject)alchemy_export.NIL;
        hl_item = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            clause = hl_item.first();
            pos_lits = clause.first();
            lits = ConsesLow.append(lits, pos_lits);
            neg_lits = conses_high.second(clause);
            lits = ConsesLow.append(lits, neg_lits);
            cdolist_list_var = cdolist_list_var.rest();
            hl_item = cdolist_list_var.first();
        }
        return lits;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 67026L)
    public static SubLObject alchemy_export_filter_assertions_acceptable_for_fol(final SubLObject assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject analysis = (SubLObject)alchemy_export.NIL;
        SubLObject fol_sentences_data = (SubLObject)alchemy_export.NIL;
        SubLObject results = (SubLObject)alchemy_export.NIL;
        final SubLObject _prev_bind_0 = Errors.$ignore_warnsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = Errors.$ignore_breaksP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$silent_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = Errors.$continue_cerrorP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = StreamsLow.$standard_output$.currentBinding(thread);
        final SubLObject _prev_bind_6 = StreamsLow.$error_output$.currentBinding(thread);
        try {
            Errors.$ignore_warnsP$.bind((SubLObject)alchemy_export.T, thread);
            Errors.$ignore_breaksP$.bind((SubLObject)alchemy_export.T, thread);
            utilities_macros.$silent_progressP$.bind((SubLObject)alchemy_export.T, thread);
            Errors.$continue_cerrorP$.bind((SubLObject)alchemy_export.T, thread);
            StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
            StreamsLow.$error_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
            analysis = folification.cycl_assertions_to_fol(assertions, alchemy_export.$alchemy_folification_properties$.getGlobalValue(), (SubLObject)alchemy_export.UNPROVIDED);
        }
        finally {
            StreamsLow.$error_output$.rebind(_prev_bind_6, thread);
            StreamsLow.$standard_output$.rebind(_prev_bind_5, thread);
            Errors.$continue_cerrorP$.rebind(_prev_bind_4, thread);
            utilities_macros.$silent_progressP$.rebind(_prev_bind_3, thread);
            Errors.$ignore_breaksP$.rebind(_prev_bind_2, thread);
            Errors.$ignore_warnsP$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var;
        fol_sentences_data = (cdolist_list_var = conses_high.getf(analysis, (SubLObject)alchemy_export.$kw135$FOL_SENTENCES_DATA, (SubLObject)alchemy_export.UNPROVIDED));
        SubLObject fol_sentences_datum = (SubLObject)alchemy_export.NIL;
        fol_sentences_datum = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = fol_sentences_datum;
            SubLObject v_term = (SubLObject)alchemy_export.NIL;
            SubLObject fol_sentence = (SubLObject)alchemy_export.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)alchemy_export.$list136);
            v_term = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)alchemy_export.$list136);
            fol_sentence = current.first();
            current = current.rest();
            final SubLObject unhandled_fol_sentences = (SubLObject)(current.isCons() ? current.first() : alchemy_export.NIL);
            cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)alchemy_export.$list136);
            current = current.rest();
            if (alchemy_export.NIL == current) {
                if (alchemy_export.NIL != assertion_handles.assertion_p(v_term)) {
                    if (alchemy_export.NIL != fol_sentence && alchemy_export.NIL == unhandled_fol_sentences) {
                        results = (SubLObject)ConsesLow.cons(v_term, results);
                    }
                    else {
                        PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str137$____dropped_unhandled_fol_asserti, v_term);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)alchemy_export.$list136);
            }
            cdolist_list_var = cdolist_list_var.rest();
            fol_sentences_datum = cdolist_list_var.first();
        }
        return results;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 68012L)
    public static SubLObject alchemy_export_filter_training_isa_gafs(final SubLObject assertions, final SubLObject type_dictionary, final SubLObject term_set) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert alchemy_export.NIL != list_utilities.non_dotted_list_p(assertions) : assertions;
        SubLObject cdolist_list_var = assertions;
        SubLObject elem = (SubLObject)alchemy_export.NIL;
        elem = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            assert alchemy_export.NIL != assertion_handles.assertion_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert alchemy_export.NIL != dictionary.dictionary_p(type_dictionary) : type_dictionary;
        assert alchemy_export.NIL != set.set_p(term_set) : term_set;
        SubLObject filtered_assertions = (SubLObject)alchemy_export.NIL;
        SubLObject v_term = (SubLObject)alchemy_export.NIL;
        SubLObject predicate = (SubLObject)alchemy_export.NIL;
        SubLObject cdolist_list_var2 = assertions;
        SubLObject assertion = (SubLObject)alchemy_export.NIL;
        assertion = cdolist_list_var2.first();
        while (alchemy_export.NIL != cdolist_list_var2) {
            if (cycl_utilities.formula_arg0(assertion).eql(alchemy_export.$const75$isa)) {
                v_term = cycl_utilities.formula_arg1(assertion, (SubLObject)alchemy_export.UNPROVIDED);
                if (alchemy_export.NIL != fort_types_interface.predicate_p(v_term)) {
                    SubLObject all_types_presentP = (SubLObject)alchemy_export.NIL;
                    predicate = v_term;
                    all_types_presentP = (SubLObject)alchemy_export.T;
                    if (alchemy_export.NIL != forts.fort_p(predicate)) {
                        SubLObject types = (SubLObject)alchemy_export.NIL;
                        types = alchemy_predicate_arg_constraints(predicate, arity.arity(predicate));
                        PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str139$__predicate__A__types__A__, predicate, types);
                        SubLObject cdolist_list_var_$94 = types;
                        SubLObject type = (SubLObject)alchemy_export.NIL;
                        type = cdolist_list_var_$94.first();
                        while (alchemy_export.NIL != cdolist_list_var_$94) {
                            if (alchemy_export.NIL == dictionary_utilities.dictionary_has_keyP(type_dictionary, type)) {
                                alchemy_export_type_dictionary_enter(type_dictionary, type, (SubLObject)alchemy_export.NIL, assertion);
                                if (alchemy_export.NIL != list_utilities.simple_tree_findP(alchemy_export.$const125$FOL_UnhandledFn, folification.fol_transform_arg(type))) {
                                    PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str126$_____A_cannot_be_folified__, type);
                                    all_types_presentP = (SubLObject)alchemy_export.NIL;
                                }
                                else {
                                    final SubLObject set_contents_var = set.do_set_internal(term_set);
                                    SubLObject basis_object;
                                    SubLObject state;
                                    SubLObject v_term_$95;
                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)alchemy_export.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); alchemy_export.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                        v_term_$95 = set_contents.do_set_contents_next(basis_object, state);
                                        if (alchemy_export.NIL != set_contents.do_set_contents_element_validP(state, v_term_$95) && alchemy_export.NIL != alchemy_export_isa_term_type(v_term_$95, type)) {
                                            PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str140$____adding_instance__A_of__A__, v_term_$95, type);
                                            alchemy_export_type_dictionary_pushnew(type_dictionary, type, v_term_$95, assertion);
                                        }
                                    }
                                }
                            }
                            if (alchemy_export.NIL == dictionary.dictionary_lookup(type_dictionary, type, (SubLObject)alchemy_export.UNPROVIDED)) {
                                PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str141$_____A_is_not_instantiated__, type);
                                all_types_presentP = (SubLObject)alchemy_export.NIL;
                            }
                            cdolist_list_var_$94 = cdolist_list_var_$94.rest();
                            type = cdolist_list_var_$94.first();
                        }
                    }
                    else {
                        PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str109$_____A_is_not_a_reified_predicate, predicate);
                        all_types_presentP = (SubLObject)alchemy_export.NIL;
                    }
                    if (alchemy_export.NIL != all_types_presentP) {
                        filtered_assertions = (SubLObject)ConsesLow.cons(assertion, filtered_assertions);
                    }
                    else {
                        PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str142$____dropped_gaf_from_export____A_, assertion);
                    }
                }
                else {
                    filtered_assertions = (SubLObject)ConsesLow.cons(assertion, filtered_assertions);
                }
            }
            else if (alchemy_export.NIL != subl_promotions.memberP(cycl_utilities.formula_arg0(assertion), alchemy_export.$alchemy_export_dropped_predicates$.getDynamicValue(thread), (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED)) {
                PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str142$____dropped_gaf_from_export____A_, assertion);
            }
            else {
                filtered_assertions = (SubLObject)ConsesLow.cons(assertion, filtered_assertions);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            assertion = cdolist_list_var2.first();
        }
        return filtered_assertions;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 70297L)
    public static SubLObject alchemy_export_filter_evidence_isa_gafs(final SubLObject assertions, final SubLObject type_dictionary, final SubLObject term_set, final SubLObject training_type_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert alchemy_export.NIL != list_utilities.non_dotted_list_p(assertions) : assertions;
        SubLObject cdolist_list_var = assertions;
        SubLObject elem = (SubLObject)alchemy_export.NIL;
        elem = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            assert alchemy_export.NIL != assertion_handles.assertion_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert alchemy_export.NIL != dictionary.dictionary_p(type_dictionary) : type_dictionary;
        assert alchemy_export.NIL != set.set_p(term_set) : term_set;
        SubLObject filtered_assertions = (SubLObject)alchemy_export.NIL;
        SubLObject v_term = (SubLObject)alchemy_export.NIL;
        SubLObject predicate = (SubLObject)alchemy_export.NIL;
        SubLObject cdolist_list_var2 = assertions;
        SubLObject assertion = (SubLObject)alchemy_export.NIL;
        assertion = cdolist_list_var2.first();
        while (alchemy_export.NIL != cdolist_list_var2) {
            if (cycl_utilities.formula_arg0(assertion).eql(alchemy_export.$const75$isa)) {
                v_term = cycl_utilities.formula_arg1(assertion, (SubLObject)alchemy_export.UNPROVIDED);
                if (alchemy_export.NIL != fort_types_interface.predicate_p(v_term)) {
                    SubLObject all_types_presentP = (SubLObject)alchemy_export.NIL;
                    predicate = v_term;
                    all_types_presentP = (SubLObject)alchemy_export.T;
                    if (alchemy_export.NIL != forts.fort_p(predicate)) {
                        SubLObject types = (SubLObject)alchemy_export.NIL;
                        types = alchemy_predicate_arg_constraints(predicate, arity.arity(predicate));
                        PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str139$__predicate__A__types__A__, predicate, types);
                        SubLObject cdolist_list_var_$96 = types;
                        SubLObject type = (SubLObject)alchemy_export.NIL;
                        type = cdolist_list_var_$96.first();
                        while (alchemy_export.NIL != cdolist_list_var_$96) {
                            if (alchemy_export.NIL != dictionary_utilities.dictionary_has_keyP(training_type_dictionary, type)) {
                                if (alchemy_export.NIL == dictionary_utilities.dictionary_has_keyP(type_dictionary, type)) {
                                    alchemy_export_type_dictionary_enter(type_dictionary, type, (SubLObject)alchemy_export.NIL, assertion);
                                    if (alchemy_export.NIL != list_utilities.simple_tree_findP(alchemy_export.$const125$FOL_UnhandledFn, folification.fol_transform_arg(type))) {
                                        PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str126$_____A_cannot_be_folified__, type);
                                        all_types_presentP = (SubLObject)alchemy_export.NIL;
                                    }
                                }
                                if (alchemy_export.NIL == dictionary.dictionary_lookup(type_dictionary, type, (SubLObject)alchemy_export.UNPROVIDED)) {
                                    PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str141$_____A_is_not_instantiated__, type);
                                    all_types_presentP = (SubLObject)alchemy_export.NIL;
                                }
                            }
                            else {
                                PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str143$_____A_is_not_a_training_type__, type);
                                all_types_presentP = (SubLObject)alchemy_export.NIL;
                            }
                            cdolist_list_var_$96 = cdolist_list_var_$96.rest();
                            type = cdolist_list_var_$96.first();
                        }
                    }
                    else {
                        PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str109$_____A_is_not_a_reified_predicate, predicate);
                        all_types_presentP = (SubLObject)alchemy_export.NIL;
                    }
                    if (alchemy_export.NIL != all_types_presentP) {
                        filtered_assertions = (SubLObject)ConsesLow.cons(assertion, filtered_assertions);
                    }
                    else {
                        PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str142$____dropped_gaf_from_export____A_, assertion);
                    }
                }
                else {
                    final SubLObject type2 = cycl_utilities.formula_arg2(assertion, (SubLObject)alchemy_export.UNPROVIDED);
                    if (alchemy_export.NIL != dictionary_utilities.dictionary_has_keyP(training_type_dictionary, type2)) {
                        filtered_assertions = (SubLObject)ConsesLow.cons(assertion, filtered_assertions);
                    }
                    else {
                        PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str144$_____A_is_not_a_training_type____, type2, assertion);
                    }
                }
            }
            else if (alchemy_export.NIL != subl_promotions.memberP(cycl_utilities.formula_arg0(assertion), alchemy_export.$alchemy_export_dropped_predicates$.getDynamicValue(thread), (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED)) {
                PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str142$____dropped_gaf_from_export____A_, assertion);
            }
            else {
                filtered_assertions = (SubLObject)ConsesLow.cons(assertion, filtered_assertions);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            assertion = cdolist_list_var2.first();
        }
        return filtered_assertions;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 72815L)
    public static SubLObject alchemy_export_filter_evidence_gafs(final SubLObject gafs, final SubLObject fol_predicates) {
        assert alchemy_export.NIL != list_utilities.non_dotted_list_p(gafs) : gafs;
        SubLObject cdolist_list_var = gafs;
        SubLObject elem = (SubLObject)alchemy_export.NIL;
        elem = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            assert alchemy_export.NIL != assertion_handles.assertion_p(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        assert alchemy_export.NIL != list_utilities.non_dotted_list_p(fol_predicates) : fol_predicates;
        cdolist_list_var = fol_predicates;
        elem = (SubLObject)alchemy_export.NIL;
        elem = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            assert alchemy_export.NIL != Types.consp(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        SubLObject filtered_gafs = (SubLObject)alchemy_export.NIL;
        final SubLObject allowed_predicates = set.new_set(Symbols.symbol_function((SubLObject)alchemy_export.EQUAL), (SubLObject)alchemy_export.UNPROVIDED);
        SubLObject cdolist_list_var2 = fol_predicates;
        SubLObject fol_predicate = (SubLObject)alchemy_export.NIL;
        fol_predicate = cdolist_list_var2.first();
        while (alchemy_export.NIL != cdolist_list_var2) {
            SubLObject current;
            final SubLObject datum = current = fol_predicate;
            SubLObject fol_predicate_fn = (SubLObject)alchemy_export.NIL;
            SubLObject predicate = (SubLObject)alchemy_export.NIL;
            SubLObject v_arity = (SubLObject)alchemy_export.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)alchemy_export.$list114);
            fol_predicate_fn = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)alchemy_export.$list114);
            predicate = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)alchemy_export.$list114);
            v_arity = current.first();
            current = current.rest();
            if (alchemy_export.NIL == current) {
                set.set_add(predicate, allowed_predicates);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)alchemy_export.$list114);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            fol_predicate = cdolist_list_var2.first();
        }
        cdolist_list_var2 = gafs;
        SubLObject gaf = (SubLObject)alchemy_export.NIL;
        gaf = cdolist_list_var2.first();
        while (alchemy_export.NIL != cdolist_list_var2) {
            final SubLObject expanded_el_formula = folification.fol_expand_sentence(uncanonicalizer.assertion_el_formula(gaf), alchemy_export.$const67$InferencePSC);
            if (alchemy_export.NIL != set.set_memberP(cycl_utilities.formula_arg0(expanded_el_formula), allowed_predicates)) {
                filtered_gafs = (SubLObject)ConsesLow.cons(gaf, filtered_gafs);
            }
            else {
                PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str145$____dropped_evidence_gaf_from_exp, cycl_utilities.formula_arg0(expanded_el_formula), gaf);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            gaf = cdolist_list_var2.first();
        }
        return filtered_gafs;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 73785L)
    public static SubLObject ae_export_rules_file(final SubLObject analysis, final SubLObject fol_predicates, final SubLObject training_type_dictionary, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject types = (SubLObject)alchemy_export.NIL;
        SubLObject stream = (SubLObject)alchemy_export.NIL;
        try {
            stream = compatibility.open_text(filename, (SubLObject)alchemy_export.$kw5$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)alchemy_export.$str6$Unable_to_open__S, filename);
            }
            final SubLObject stream_$97 = stream;
            types = ae_predicate_declarations_to_stream(fol_predicates, training_type_dictionary, stream_$97);
            final SubLObject _prev_bind_0 = alchemy_export.$alchemy_export_cafs_or_rulesP$.currentBinding(thread);
            try {
                alchemy_export.$alchemy_export_cafs_or_rulesP$.bind((SubLObject)alchemy_export.$kw146$RULES, thread);
                folification.fol_sentences_to_stream(analysis, (SubLObject)alchemy_export.$kw9$ALCHEMY, stream_$97);
            }
            finally {
                alchemy_export.$alchemy_export_cafs_or_rulesP$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)alchemy_export.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)alchemy_export.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return types;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 74347L)
    public static SubLObject ae_predicate_declarations_to_stream(final SubLObject fol_predicates, final SubLObject training_type_dictionary, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject types = (SubLObject)alchemy_export.NIL;
        SubLObject arg_constraints = (SubLObject)alchemy_export.NIL;
        SubLObject nbr_groundings = (SubLObject)alchemy_export.NIL;
        SubLObject total_groundings = (SubLObject)alchemy_export.ZERO_INTEGER;
        SubLObject v_instances = (SubLObject)alchemy_export.NIL;
        SubLObject cdolist_list_var = fol_predicates;
        SubLObject fol_predicate = (SubLObject)alchemy_export.NIL;
        fol_predicate = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            SubLObject ignore_errors_tag = (SubLObject)alchemy_export.NIL;
            try {
                thread.throwStack.push(alchemy_export.$kw147$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)alchemy_export.$sym148$IGNORE_ERRORS_HANDLER), thread);
                    try {
                        arg_constraints = alchemy_predicate_declaration_to_stream(fol_predicate, stream);
                        nbr_groundings = (SubLObject)alchemy_export.ONE_INTEGER;
                        SubLObject cdolist_list_var_$98 = arg_constraints;
                        SubLObject arg_constraint = (SubLObject)alchemy_export.NIL;
                        arg_constraint = cdolist_list_var_$98.first();
                        while (alchemy_export.NIL != cdolist_list_var_$98) {
                            v_instances = dictionary.dictionary_lookup(training_type_dictionary, arg_constraint, (SubLObject)alchemy_export.UNPROVIDED);
                            if (alchemy_export.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !v_instances.isCons()) {
                                Errors.error((SubLObject)alchemy_export.$str149$invalid_instances_for_arg_constra, arg_constraint);
                            }
                            nbr_groundings = Numbers.multiply(nbr_groundings, Sequences.length(v_instances));
                            cdolist_list_var_$98 = cdolist_list_var_$98.rest();
                            arg_constraint = cdolist_list_var_$98.first();
                        }
                        total_groundings = Numbers.add(total_groundings, nbr_groundings);
                        PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str150$___groundings___10D_fol_predicate, nbr_groundings, fol_predicate);
                        PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str151$_arg_types___A, arg_constraints);
                        types = ConsesLow.nconc(arg_constraints, types);
                    }
                    catch (Throwable catch_var) {
                        Errors.handleThrowable(catch_var, (SubLObject)alchemy_export.NIL);
                    }
                }
                finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            }
            catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)alchemy_export.$kw147$IGNORE_ERRORS_TARGET);
            }
            finally {
                thread.throwStack.pop();
            }
            streams_high.terpri((SubLObject)alchemy_export.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            fol_predicate = cdolist_list_var.first();
        }
        PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str152$___total_groundings___12D__, total_groundings);
        return list_utilities.fast_delete_duplicates(types, Symbols.symbol_function((SubLObject)alchemy_export.EQUAL), (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 75451L)
    public static SubLObject alchemy_predicate_declaration_to_stream(final SubLObject fol_predicate, final SubLObject stream) {
        SubLObject fol_predicate_fn = (SubLObject)alchemy_export.NIL;
        SubLObject predicate = (SubLObject)alchemy_export.NIL;
        SubLObject v_arity = (SubLObject)alchemy_export.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(fol_predicate, fol_predicate, (SubLObject)alchemy_export.$list114);
        fol_predicate_fn = fol_predicate.first();
        SubLObject current = fol_predicate.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, fol_predicate, (SubLObject)alchemy_export.$list114);
        predicate = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, fol_predicate, (SubLObject)alchemy_export.$list114);
        v_arity = current.first();
        current = current.rest();
        if (alchemy_export.NIL == current) {
            final SubLObject constraints_by_argpos = alchemy_predicate_arg_constraints(predicate, v_arity);
            streams_high.terpri(stream);
            if (alchemy_export.NIL == constant_handles.constant_p(predicate)) {
                streams_high.terpri(stream);
                folification.output_alchemy_term_comment(predicate, stream);
                streams_high.terpri(stream);
            }
            print_high.princ(alchemy_export_predicate_with_arity(predicate, v_arity), stream);
            print_high.princ((SubLObject)alchemy_export.$str153$_, stream);
            SubLObject first_constraintP = (SubLObject)alchemy_export.T;
            SubLObject cdolist_list_var = constraints_by_argpos;
            SubLObject constraint = (SubLObject)alchemy_export.NIL;
            constraint = cdolist_list_var.first();
            while (alchemy_export.NIL != cdolist_list_var) {
                if (alchemy_export.NIL == first_constraintP) {
                    print_high.princ((SubLObject)alchemy_export.$str154$_, stream);
                }
                print_high.princ(alchemy_export_type(constraint), stream);
                first_constraintP = (SubLObject)alchemy_export.NIL;
                cdolist_list_var = cdolist_list_var.rest();
                constraint = cdolist_list_var.first();
            }
            print_high.princ((SubLObject)alchemy_export.$str155$_, stream);
            return constraints_by_argpos;
        }
        cdestructuring_bind.cdestructuring_bind_error(fol_predicate, (SubLObject)alchemy_export.$list114);
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 76337L)
    public static SubLObject alchemy_predicate_arg_constraints(final SubLObject predicate, final SubLObject v_arity) {
        SubLObject constraints_by_argpos = (SubLObject)alchemy_export.NIL;
        SubLObject argpos;
        for (argpos = (SubLObject)alchemy_export.NIL, argpos = v_arity; !argpos.isZero(); argpos = number_utilities.f_1_(argpos)) {
            constraints_by_argpos = (SubLObject)ConsesLow.cons(alchemy_predicate_argpos_constraint(predicate, argpos), constraints_by_argpos);
        }
        return constraints_by_argpos;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 76749L)
    public static SubLObject alchemy_predicate_argpos_constraint(final SubLObject predicate, final SubLObject argpos) {
        SubLObject constraint = (SubLObject)alchemy_export.NIL;
        if (alchemy_export.NIL != fort_types_interface.predicate_p(predicate) || predicate.eql(alchemy_export.$const156$thereExistRange)) {
            final SubLObject constraints = (alchemy_export.NIL != arity.variable_arityP(predicate)) ? kb_accessors.args_isa(predicate, alchemy_export.$const67$InferencePSC) : kb_accessors.argn_isa(predicate, argpos, alchemy_export.$const67$InferencePSC);
            if (alchemy_export.NIL != list_utilities.empty_list_p(constraints)) {
                constraint = alchemy_export.$const117$Thing;
            }
            else {
                constraint = cycl_utilities.collection_intersection(constraints);
            }
        }
        else if (alchemy_export.NIL != fort_types_interface.collection_p(predicate)) {
            constraint = alchemy_export.$const117$Thing;
        }
        else {
            Errors.error((SubLObject)alchemy_export.$str157$Can_t_convert_non_predicate_non_c, predicate);
        }
        return constraint;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 77515L)
    public static SubLObject alchemy_export_types_file(final SubLObject type_dictionary, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert alchemy_export.NIL != dictionary.dictionary_p(type_dictionary) : type_dictionary;
        assert alchemy_export.NIL != Types.stringp(filename) : filename;
        SubLObject fol_term_instances = (SubLObject)alchemy_export.NIL;
        final SubLObject mln_filename = string_utilities.string_substitute((SubLObject)alchemy_export.$str158$_mln, (SubLObject)alchemy_export.$str159$_db, filename, (SubLObject)alchemy_export.UNPROVIDED);
        SubLObject stream = (SubLObject)alchemy_export.NIL;
        try {
            stream = compatibility.open_text(mln_filename, (SubLObject)alchemy_export.$kw5$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)alchemy_export.$str6$Unable_to_open__S, mln_filename);
            }
            final SubLObject stream_$99 = stream;
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(type_dictionary)); alchemy_export.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject type = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject terms = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (alchemy_export.NIL != terms) {
                    PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str160$__exporting_type___A___A__, type, terms);
                    streams_high.force_output((SubLObject)alchemy_export.UNPROVIDED);
                    fol_term_instances = (SubLObject)alchemy_export.NIL;
                    SubLObject cdolist_list_var = terms;
                    SubLObject v_term = (SubLObject)alchemy_export.NIL;
                    v_term = cdolist_list_var.first();
                    while (alchemy_export.NIL != cdolist_list_var) {
                        fol_term_instances = (SubLObject)ConsesLow.cons(folification.fol_transform_arg(v_term), fol_term_instances);
                        cdolist_list_var = cdolist_list_var.rest();
                        v_term = cdolist_list_var.first();
                    }
                    alchemy_type_declaration_to_stream(type, fol_term_instances, stream_$99);
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)alchemy_export.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)alchemy_export.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 78200L)
    public static SubLObject alchemy_fol_denotational_term_not_requiring_declaration_p(final SubLObject fol_denotational_term) {
        return cycl_variables.el_varP(fol_denotational_term);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 78462L)
    public static SubLObject alchemy_type_declaration_to_stream(final SubLObject type, final SubLObject v_instances, final SubLObject stream) {
        streams_high.terpri(stream);
        print_high.princ(alchemy_export_type(type), stream);
        print_high.princ((SubLObject)alchemy_export.$str161$____, stream);
        SubLObject first_instanceP = (SubLObject)alchemy_export.T;
        SubLObject cdolist_list_var = v_instances;
        SubLObject instance = (SubLObject)alchemy_export.NIL;
        instance = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            if (alchemy_export.NIL != first_instanceP) {
                first_instanceP = (SubLObject)alchemy_export.NIL;
            }
            else {
                print_high.princ((SubLObject)alchemy_export.$str162$__, stream);
            }
            print_high.princ(alchemy_export_fol_term(instance), stream);
            cdolist_list_var = cdolist_list_var.rest();
            instance = cdolist_list_var.first();
        }
        print_high.princ((SubLObject)alchemy_export.$str163$_, stream);
        streams_high.terpri(stream);
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 78997L)
    public static SubLObject alchemy_export_data_file(final SubLObject analysis, final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = (SubLObject)alchemy_export.NIL;
        try {
            stream = compatibility.open_text(filename, (SubLObject)alchemy_export.$kw5$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)alchemy_export.$str6$Unable_to_open__S, filename);
            }
            final SubLObject stream_$100 = stream;
            final SubLObject _prev_bind_0 = alchemy_export.$alchemy_export_cafs_or_rulesP$.currentBinding(thread);
            try {
                alchemy_export.$alchemy_export_cafs_or_rulesP$.bind((SubLObject)alchemy_export.$kw164$CAFS, thread);
                folification.fol_sentences_to_stream(analysis, (SubLObject)alchemy_export.$kw9$ALCHEMY, stream_$100);
            }
            finally {
                alchemy_export.$alchemy_export_cafs_or_rulesP$.rebind(_prev_bind_0, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)alchemy_export.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)alchemy_export.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 79270L)
    public static SubLObject all_fol_predicates_and_arguments_mentioned_in_analyses(final SubLObject analyses) {
        SubLObject all_predicates = (SubLObject)alchemy_export.NIL;
        SubLObject all_arguments = (SubLObject)alchemy_export.NIL;
        SubLObject cdolist_list_var = analyses;
        SubLObject analysis = (SubLObject)alchemy_export.NIL;
        analysis = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = folification.all_fol_predicates_and_arguments_mentioned_in_analysis(analysis);
            SubLObject predicates = (SubLObject)alchemy_export.NIL;
            SubLObject v_arguments = (SubLObject)alchemy_export.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)alchemy_export.$list165);
            predicates = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)alchemy_export.$list165);
            v_arguments = current.first();
            current = current.rest();
            if (alchemy_export.NIL == current) {
                all_predicates = ConsesLow.append(predicates, all_predicates);
                all_arguments = ConsesLow.append(v_arguments, all_arguments);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)alchemy_export.$list165);
            }
            cdolist_list_var = cdolist_list_var.rest();
            analysis = cdolist_list_var.first();
        }
        return (SubLObject)ConsesLow.list(list_utilities.fast_delete_duplicates(all_predicates, Symbols.symbol_function((SubLObject)alchemy_export.EQUAL), (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED), list_utilities.fast_delete_duplicates(all_arguments, Symbols.symbol_function((SubLObject)alchemy_export.EQUAL), (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED));
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 79795L)
    public static SubLObject alchemy_assertions_forts(final SubLObject assertions) {
        SubLObject v_forts = (SubLObject)alchemy_export.NIL;
        final SubLObject penetrate_hl_structuresP = (SubLObject)alchemy_export.NIL;
        final SubLObject include_mtsP = (SubLObject)alchemy_export.NIL;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = (SubLObject)alchemy_export.NIL;
        assertion = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            final SubLObject assertion_forts = assertions_high.assertion_forts(assertion, penetrate_hl_structuresP, (SubLObject)alchemy_export.NIL, include_mtsP, (SubLObject)alchemy_export.T);
            v_forts = ConsesLow.append(assertion_forts, v_forts);
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        }
        return list_utilities.fast_delete_duplicates(v_forts, Symbols.symbol_function((SubLObject)alchemy_export.EQ), (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 80256L)
    public static SubLObject alchemy_skip_fol_sentenceP(final SubLObject fol_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = alchemy_export.$alchemy_export_cafs_or_rulesP$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)alchemy_export.$kw164$CAFS)) {
            return (SubLObject)SubLObjectFactory.makeBoolean(alchemy_export.NIL == folification.fol_cafP(fol_sentence));
        }
        if (pcase_var.eql((SubLObject)alchemy_export.$kw146$RULES)) {
            return folification.fol_cafP(fol_sentence);
        }
        if (pcase_var.eql((SubLObject)alchemy_export.$kw0$BOTH)) {
            return (SubLObject)alchemy_export.NIL;
        }
        Errors.error((SubLObject)alchemy_export.$str166$_S_is_not_a_valid_value_for__alch, alchemy_export.$alchemy_export_cafs_or_rulesP$.getDynamicValue(thread));
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 81064L)
    public static SubLObject cycl_assertions_to_alchemy_style_fol(final SubLObject assertions) {
        return folification.cycl_assertions_to_fol(assertions, alchemy_export.$alchemy_folification_properties$.getGlobalValue(), (SubLObject)alchemy_export.NIL);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 81213L)
    public static SubLObject cycl_sentence_to_alchemy_sentences(final SubLObject cycl_sentence) {
        return cycl_sentence_to_external_fol(cycl_sentence, (SubLObject)alchemy_export.$kw9$ALCHEMY, alchemy_export.$alchemy_folification_properties$.getGlobalValue());
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 81378L)
    public static SubLObject cycl_sentence_to_external_fol(final SubLObject cycl_sentence, final SubLObject output_format, SubLObject v_properties) {
        v_properties = conses_high.putf(conses_high.copy_list(v_properties), (SubLObject)alchemy_export.$kw173$INCLUDE_COMMENTS_, (SubLObject)alchemy_export.NIL);
        final SubLObject analysis = folification.cycl_sentences_to_fol((SubLObject)ConsesLow.list(cycl_sentence), v_properties);
        SubLObject result = (SubLObject)alchemy_export.NIL;
        SubLObject stream = (SubLObject)alchemy_export.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            folification.fol_sentences_to_stream(analysis, output_format, stream);
            result = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)alchemy_export.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)alchemy_export.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 81848L)
    public static SubLObject alchemy_export_sentence(final SubLObject focycl_sentence, SubLObject stream, SubLObject top_levelP, SubLObject hardP) {
        if (stream == alchemy_export.UNPROVIDED) {
            stream = (SubLObject)alchemy_export.T;
        }
        if (top_levelP == alchemy_export.UNPROVIDED) {
            top_levelP = (SubLObject)alchemy_export.T;
        }
        if (hardP == alchemy_export.UNPROVIDED) {
            hardP = (SubLObject)alchemy_export.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (alchemy_export.NIL != top_levelP) {
            alchemy_export.$ae_number_of_sentences$.setDynamicValue(Numbers.add(alchemy_export.$ae_number_of_sentences$.getDynamicValue(thread), (SubLObject)alchemy_export.ONE_INTEGER), thread);
            streams_high.terpri(stream);
        }
        SubLObject operator = (SubLObject)alchemy_export.NIL;
        SubLObject args = (SubLObject)alchemy_export.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(focycl_sentence, focycl_sentence, (SubLObject)alchemy_export.$list14);
        operator = focycl_sentence.first();
        final SubLObject current = args = focycl_sentence.rest();
        final SubLObject pcase_var = operator;
        if (pcase_var.eql(alchemy_export.$const68$not)) {
            print_high.princ(alchemy_export_sentential_relation(alchemy_export.$const68$not), stream);
            assert alchemy_export.NIL != list_utilities.singletonP(args) : args;
            alchemy_export_sentence_parenthesized(args.first(), stream);
        }
        else if (pcase_var.eql(alchemy_export.$const69$and) || pcase_var.eql(alchemy_export.$const70$or)) {
            SubLObject list_var = (SubLObject)alchemy_export.NIL;
            SubLObject arg = (SubLObject)alchemy_export.NIL;
            SubLObject number = (SubLObject)alchemy_export.NIL;
            list_var = args;
            arg = list_var.first();
            for (number = (SubLObject)alchemy_export.ZERO_INTEGER; alchemy_export.NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), number = Numbers.add((SubLObject)alchemy_export.ONE_INTEGER, number)) {
                if (!number.isZero()) {
                    print_high.princ(alchemy_export_sentential_relation(operator), stream);
                }
                alchemy_export_sentence_parenthesized(arg, stream);
            }
        }
        else if (pcase_var.eql(alchemy_export.$const175$implies) || pcase_var.eql(alchemy_export.$const176$equiv)) {
            SubLObject current_$102;
            final SubLObject datum_$101 = current_$102 = args;
            SubLObject left_side = (SubLObject)alchemy_export.NIL;
            SubLObject right_side = (SubLObject)alchemy_export.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$102, datum_$101, (SubLObject)alchemy_export.$list177);
            left_side = current_$102.first();
            current_$102 = current_$102.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$102, datum_$101, (SubLObject)alchemy_export.$list177);
            right_side = current_$102.first();
            current_$102 = current_$102.rest();
            if (alchemy_export.NIL == current_$102) {
                alchemy_export_sentence_parenthesized(left_side, stream);
                print_high.princ(alchemy_export_sentential_relation(operator), stream);
                alchemy_export_sentence_parenthesized(right_side, stream);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$101, (SubLObject)alchemy_export.$list177);
            }
        }
        else if (pcase_var.eql(alchemy_export.$const178$forAll) || pcase_var.eql(alchemy_export.$const179$thereExists)) {
            SubLObject current_$103;
            final SubLObject datum_$102 = current_$103 = args;
            SubLObject var = (SubLObject)alchemy_export.NIL;
            SubLObject sent = (SubLObject)alchemy_export.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$103, datum_$102, (SubLObject)alchemy_export.$list180);
            var = current_$103.first();
            current_$103 = current_$103.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$103, datum_$102, (SubLObject)alchemy_export.$list180);
            sent = current_$103.first();
            current_$103 = current_$103.rest();
            if (alchemy_export.NIL == current_$103) {
                print_high.princ(alchemy_export_sentential_relation(operator), stream);
                print_high.princ(alchemy_export_variable(var), stream);
                print_high.princ((SubLObject)alchemy_export.$str181$_, stream);
                alchemy_export_sentence_parenthesized(sent, stream);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum_$102, (SubLObject)alchemy_export.$list180);
            }
        }
        else {
            print_high.princ(alchemy_export_fol_predicate(operator), stream);
            print_high.princ((SubLObject)alchemy_export.$str153$_, stream);
            SubLObject list_var = (SubLObject)alchemy_export.NIL;
            SubLObject arg = (SubLObject)alchemy_export.NIL;
            SubLObject number = (SubLObject)alchemy_export.NIL;
            list_var = args;
            arg = list_var.first();
            for (number = (SubLObject)alchemy_export.ZERO_INTEGER; alchemy_export.NIL != list_var; list_var = list_var.rest(), arg = list_var.first(), number = Numbers.add((SubLObject)alchemy_export.ONE_INTEGER, number)) {
                if (!number.isZero()) {
                    print_high.princ((SubLObject)alchemy_export.$str154$_, stream);
                }
                print_high.princ(alchemy_export_fol_term(arg), stream);
            }
            print_high.princ((SubLObject)alchemy_export.$str155$_, stream);
        }
        if (alchemy_export.NIL != top_levelP && alchemy_export.NIL != hardP) {
            print_high.princ((SubLObject)alchemy_export.$str182$_, stream);
        }
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 83423L)
    public static SubLObject alchemy_export_sentence_parenthesized(final SubLObject cycl_sentence, SubLObject stream) {
        if (stream == alchemy_export.UNPROVIDED) {
            stream = (SubLObject)alchemy_export.T;
        }
        print_high.princ((SubLObject)alchemy_export.$str153$_, stream);
        alchemy_export_sentence(cycl_sentence, stream, (SubLObject)alchemy_export.NIL, (SubLObject)alchemy_export.UNPROVIDED);
        print_high.princ((SubLObject)alchemy_export.$str155$_, stream);
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 83623L)
    public static SubLObject clear_alchemy_export_sentential_relation() {
        final SubLObject cs = alchemy_export.$alchemy_export_sentential_relation_caching_state$.getGlobalValue();
        if (alchemy_export.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 83623L)
    public static SubLObject remove_alchemy_export_sentential_relation(final SubLObject relation) {
        return memoization_state.caching_state_remove_function_results_with_args(alchemy_export.$alchemy_export_sentential_relation_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(relation), (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 83623L)
    public static SubLObject alchemy_export_sentential_relation_internal(final SubLObject relation) {
        if (relation.eql(alchemy_export.$const68$not)) {
            return (SubLObject)alchemy_export.$str184$_;
        }
        if (relation.eql(alchemy_export.$const69$and)) {
            return (SubLObject)alchemy_export.$str185$___;
        }
        if (relation.eql(alchemy_export.$const70$or)) {
            return (SubLObject)alchemy_export.$str186$_v_;
        }
        if (relation.eql(alchemy_export.$const175$implies)) {
            return (SubLObject)alchemy_export.$str187$____;
        }
        if (relation.eql(alchemy_export.$const176$equiv)) {
            return (SubLObject)alchemy_export.$str188$_____;
        }
        if (relation.eql(alchemy_export.$const178$forAll)) {
            return (SubLObject)alchemy_export.$str189$forall_;
        }
        if (relation.eql(alchemy_export.$const179$thereExists)) {
            return (SubLObject)alchemy_export.$str190$exist_;
        }
        Errors.error((SubLObject)alchemy_export.$str191$Don_t_know_how_to_export_the_sent, relation);
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 83623L)
    public static SubLObject alchemy_export_sentential_relation(final SubLObject relation) {
        SubLObject caching_state = alchemy_export.$alchemy_export_sentential_relation_caching_state$.getGlobalValue();
        if (alchemy_export.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)alchemy_export.$sym183$ALCHEMY_EXPORT_SENTENTIAL_RELATION, (SubLObject)alchemy_export.$sym192$_ALCHEMY_EXPORT_SENTENTIAL_RELATION_CACHING_STATE_, (SubLObject)alchemy_export.NIL, (SubLObject)alchemy_export.EQ, (SubLObject)alchemy_export.ONE_INTEGER, (SubLObject)alchemy_export.SIX_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, relation, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(alchemy_export_sentential_relation_internal(relation)));
            memoization_state.caching_state_put(caching_state, relation, results, (SubLObject)alchemy_export.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 84272L)
    public static SubLObject alchemy_export_type(final SubLObject collection) {
        if (alchemy_export.NIL != constant_handles.constant_p(collection)) {
            return alchemy_export_type_constant(collection);
        }
        if (alchemy_export.NIL != cycl_grammar.cycl_nat_p(collection)) {
            return alchemy_export_type_nat(collection);
        }
        Errors.error((SubLObject)alchemy_export.$str195$Don_t_know_how_to_export_the_type, collection);
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 84571L)
    public static SubLObject alchemy_export_type_constant(final SubLObject collection) {
        return Sequences.cconcatenate(alchemy_export.$alchemy_export_type_prefix$.getGlobalValue(), alchemy_export_constant(collection));
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 84722L)
    public static SubLObject alchemy_export_type_nat(final SubLObject collection) {
        return Sequences.cconcatenate(alchemy_export.$alchemy_export_type_prefix$.getGlobalValue(), alchemy_export_nat(collection));
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 84863L)
    public static SubLObject alchemy_export_fol_predicate(final SubLObject fol_predicate) {
        SubLObject fol_predicate_fn = (SubLObject)alchemy_export.NIL;
        SubLObject predicate = (SubLObject)alchemy_export.NIL;
        SubLObject v_arity = (SubLObject)alchemy_export.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(fol_predicate, fol_predicate, (SubLObject)alchemy_export.$list114);
        fol_predicate_fn = fol_predicate.first();
        SubLObject current = fol_predicate.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, fol_predicate, (SubLObject)alchemy_export.$list114);
        predicate = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, fol_predicate, (SubLObject)alchemy_export.$list114);
        v_arity = current.first();
        current = current.rest();
        if (alchemy_export.NIL == current) {
            final SubLObject hl_predicate = (alchemy_export.NIL != constant_handles.constant_p(predicate)) ? predicate : czer_main.canonicalize_term(predicate, alchemy_export.$const67$InferencePSC);
            return alchemy_export_predicate_with_arity(hl_predicate, v_arity);
        }
        cdestructuring_bind.cdestructuring_bind_error(fol_predicate, (SubLObject)alchemy_export.$list114);
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 85241L)
    public static SubLObject alchemy_export_predicate_with_arity(final SubLObject predicate, final SubLObject v_arity) {
        if (alchemy_export.NIL != constant_handles.constant_p(predicate)) {
            return alchemy_export_predicate_constant(predicate, v_arity);
        }
        if (alchemy_export.NIL != cycl_grammar.cycl_nat_p(predicate)) {
            return alchemy_export_predicate_nat(predicate, v_arity);
        }
        Errors.error((SubLObject)alchemy_export.$str196$Don_t_know_how_to_export_the_pred, predicate);
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 85583L)
    public static SubLObject alchemy_export_predicate_constant(final SubLObject predicate, final SubLObject v_arity) {
        return Sequences.cconcatenate(alchemy_export.$alchemy_export_predicate_prefix$.getGlobalValue(), new SubLObject[] { string_utilities.str(v_arity), alchemy_export_constant(predicate) });
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 85760L)
    public static SubLObject alchemy_export_predicate_nat(final SubLObject predicate, final SubLObject v_arity) {
        return Sequences.cconcatenate(alchemy_export.$alchemy_export_predicate_prefix$.getGlobalValue(), new SubLObject[] { string_utilities.str(v_arity), alchemy_export_nat(predicate) });
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 85927L)
    public static SubLObject alchemy_export_fol_term(final SubLObject focycl_term) {
        if (alchemy_export.NIL != folification.fol_atomic_term_p(focycl_term)) {
            return alchemy_export_fol_constant(focycl_term);
        }
        if (alchemy_export.NIL != cycl_variables.el_varP(focycl_term)) {
            return alchemy_export_variable(focycl_term);
        }
        if (alchemy_export.NIL != folification.fol_string_p(focycl_term)) {
            return alchemy_export_fol_string(focycl_term);
        }
        if (alchemy_export.NIL != folification.fol_number_p(focycl_term)) {
            return alchemy_export_fol_number(focycl_term);
        }
        if (alchemy_export.NIL != el_utilities.possibly_naut_p(focycl_term)) {
            return alchemy_export_fol_nat(focycl_term);
        }
        Errors.error((SubLObject)alchemy_export.$str197$Don_t_know_how_to_export_the_term, focycl_term);
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 86749L)
    public static SubLObject alchemy_export_fol_constant(final SubLObject fol_atomic_term) {
        SubLObject fol_atomic_term_fn = (SubLObject)alchemy_export.NIL;
        SubLObject constant = (SubLObject)alchemy_export.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(fol_atomic_term, fol_atomic_term, (SubLObject)alchemy_export.$list200);
        fol_atomic_term_fn = fol_atomic_term.first();
        SubLObject current = fol_atomic_term.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, fol_atomic_term, (SubLObject)alchemy_export.$list200);
        constant = current.first();
        current = current.rest();
        if (alchemy_export.NIL == current) {
            return alchemy_export_constant(constant);
        }
        cdestructuring_bind.cdestructuring_bind_error(fol_atomic_term, (SubLObject)alchemy_export.$list200);
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 86960L)
    public static SubLObject alchemy_export_constant(final SubLObject constant) {
        return Sequences.cconcatenate(alchemy_export.$alchemy_export_constant_prefix$.getGlobalValue(), alchemy_export_delete_forbidden_chars(string_utilities.copy_string(constants_high.constant_name(constant))));
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 87157L)
    public static SubLObject alchemy_export_variable(final SubLObject el_var) {
        SubLObject result;
        for (result = cycl_variables.el_var_name(el_var); alchemy_export.NIL != string_utilities.non_empty_string_p(result) && string_utilities.first_char(result).eql(cycl_variables.el_variable_prefix_char()); result = string_utilities.substring(result, (SubLObject)alchemy_export.ONE_INTEGER, (SubLObject)alchemy_export.UNPROVIDED)) {}
        if (alchemy_export.NIL == string_utilities.non_empty_string_p(result)) {
            Errors.error((SubLObject)alchemy_export.$str201$Tried_to_convert_the_EL_variable_, el_var, result);
        }
        return Strings.string_downcase(result, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 87612L)
    public static SubLObject alchemy_export_fol_string(final SubLObject fol_string) {
        SubLObject fol_string_fn = (SubLObject)alchemy_export.NIL;
        SubLObject string = (SubLObject)alchemy_export.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(fol_string, fol_string, (SubLObject)alchemy_export.$list203);
        fol_string_fn = fol_string.first();
        SubLObject current = fol_string.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, fol_string, (SubLObject)alchemy_export.$list203);
        string = current.first();
        current = current.rest();
        if (alchemy_export.NIL == current) {
            return alchemy_export_string(string);
        }
        cdestructuring_bind.cdestructuring_bind_error(fol_string, (SubLObject)alchemy_export.$list203);
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 87795L)
    public static SubLObject alchemy_export_string(final SubLObject string) {
        final SubLObject newline = Strings.make_string((SubLObject)alchemy_export.ONE_INTEGER, (SubLObject)Characters.CHAR_newline);
        final SubLObject linefeed = Strings.make_string((SubLObject)alchemy_export.ONE_INTEGER, (SubLObject)Characters.CHAR_newline);
        final SubLObject v_return = Strings.make_string((SubLObject)alchemy_export.ONE_INTEGER, (SubLObject)Characters.CHAR_return);
        SubLObject filtered_string = (SubLObject)alchemy_export.NIL;
        SubLObject delimited_string = (SubLObject)alchemy_export.NIL;
        filtered_string = string_utilities.string_substitute((SubLObject)alchemy_export.$str181$_, newline, string, (SubLObject)alchemy_export.UNPROVIDED);
        filtered_string = string_utilities.string_substitute((SubLObject)alchemy_export.$str181$_, linefeed, filtered_string, (SubLObject)alchemy_export.UNPROVIDED);
        filtered_string = string_utilities.string_substitute((SubLObject)alchemy_export.$str181$_, v_return, filtered_string, (SubLObject)alchemy_export.UNPROVIDED);
        filtered_string = string_utilities.string_substitute((SubLObject)alchemy_export.$str181$_, (SubLObject)alchemy_export.$str202$_, filtered_string, (SubLObject)alchemy_export.UNPROVIDED);
        delimited_string = Sequences.cconcatenate(alchemy_export.$double_quote_string$.getGlobalValue(), new SubLObject[] { filtered_string, alchemy_export.$double_quote_string$.getGlobalValue() });
        return delimited_string;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 88427L)
    public static SubLObject alchemy_export_fol_number(final SubLObject fol_number) {
        SubLObject fol_number_fn = (SubLObject)alchemy_export.NIL;
        SubLObject number = (SubLObject)alchemy_export.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(fol_number, fol_number, (SubLObject)alchemy_export.$list204);
        fol_number_fn = fol_number.first();
        SubLObject current = fol_number.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, fol_number, (SubLObject)alchemy_export.$list204);
        number = current.first();
        current = current.rest();
        if (alchemy_export.NIL == current) {
            return alchemy_export_number(number);
        }
        cdestructuring_bind.cdestructuring_bind_error(fol_number, (SubLObject)alchemy_export.$list204);
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 88610L)
    public static SubLObject alchemy_export_number(final SubLObject number) {
        return PrintLow.format((SubLObject)alchemy_export.NIL, (SubLObject)(number.isDouble() ? alchemy_export.$str205$_F : alchemy_export.$str206$_D), number);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 88719L)
    public static SubLObject alchemy_export_fol_nat(final SubLObject fol_nat) {
        final SubLObject nat = folification.focycl_to_cycl(fol_nat);
        return alchemy_export_nat(nat);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 88847L)
    public static SubLObject alchemy_export_nat(final SubLObject nat) {
        return Sequences.cconcatenate(alchemy_export.$alchemy_export_hl_id_prefix$.getGlobalValue(), kb_utilities.hl_external_id_string(nat));
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 88973L)
    public static SubLObject alchemy_export_delete_forbidden_chars(final SubLObject string) {
        return list_utilities.delete_if_not(Symbols.symbol_function((SubLObject)alchemy_export.$sym207$VALID_ALCHEMY_IDENTIFIER_CHAR_P), string, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 89103L)
    public static SubLObject alchemy_constant_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean((alchemy_export.NIL != alchemy_identifier_p(v_object) && alchemy_export.NIL != Characters.upper_case_p(string_utilities.first_char(v_object))) || (v_object.isString() && alchemy_export.NIL != list_utilities.lengthGE(v_object, (SubLObject)alchemy_export.THREE_INTEGER, (SubLObject)alchemy_export.UNPROVIDED) && string_utilities.first_char(v_object).eql((SubLObject)Characters.CHAR_quotation) && string_utilities.last_char(v_object).eql((SubLObject)Characters.CHAR_quotation)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 89828L)
    public static SubLObject alchemy_variable_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(alchemy_export.NIL != alchemy_identifier_p(v_object) && alchemy_export.NIL != Characters.lower_case_p(string_utilities.first_char(v_object)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 90025L)
    public static SubLObject alchemy_identifier_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(alchemy_export.NIL != string_utilities.non_empty_string_p(v_object) && !string_utilities.first_char(v_object).eql((SubLObject)Characters.CHAR_quote) && alchemy_export.NIL == list_utilities.find_if_not(Symbols.symbol_function((SubLObject)alchemy_export.$sym207$VALID_ALCHEMY_IDENTIFIER_CHAR_P), v_object, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED));
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 90294L)
    public static SubLObject valid_alchemy_identifier_char_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isChar() && (alchemy_export.NIL != Characters.alphanumericp(v_object) || v_object.eql((SubLObject)Characters.CHAR_hyphen) || v_object.eql((SubLObject)Characters.CHAR_underbar) || v_object.eql((SubLObject)Characters.CHAR_quote)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 92245L)
    public static SubLObject export_regressions(SubLObject to_dir) {
        if (to_dir == alchemy_export.UNPROVIDED) {
            to_dir = (SubLObject)alchemy_export.$str219$_scratch_alchemytemp_cyc_projects;
        }
        SubLObject cdolist_list_var = alchemy_export.$regression_calls$.getGlobalValue();
        SubLObject regression_call = (SubLObject)alchemy_export.NIL;
        regression_call = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            export_regression(regression_call.first(), to_dir);
            cdolist_list_var = cdolist_list_var.rest();
            regression_call = cdolist_list_var.first();
        }
        return (SubLObject)alchemy_export.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 92512L)
    public static SubLObject export_regression(final SubLObject regression_name, SubLObject to_dir) {
        if (to_dir == alchemy_export.UNPROVIDED) {
            to_dir = (SubLObject)alchemy_export.$str219$_scratch_alchemytemp_cyc_projects;
        }
        assert alchemy_export.NIL != Types.stringp(regression_name) : regression_name;
        assert alchemy_export.NIL != Types.stringp(to_dir) : to_dir;
        file_utilities.make_directory_recursive(to_dir, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
        final SubLObject test_form = conses_high.copy_list(list_utilities.alist_lookup(alchemy_export.$regression_calls$.getGlobalValue(), regression_name, Symbols.symbol_function((SubLObject)alchemy_export.EQUALP), (SubLObject)alchemy_export.UNPROVIDED));
        if (alchemy_export.NIL == test_form) {
            Errors.error((SubLObject)alchemy_export.$str220$Got_invalid_regression_test_name_, regression_name);
        }
        SubLObject mln_file = conses_high.fifth(test_form);
        SubLObject training_file = conses_high.sixth(test_form);
        SubLObject evidence_files = conses_high.second(conses_high.seventh(test_form));
        SubLObject new_evidence_files = (SubLObject)alchemy_export.NIL;
        mln_file = Sequences.cconcatenate(to_dir, mln_file);
        training_file = Sequences.cconcatenate(to_dir, training_file);
        SubLObject cdolist_list_var = evidence_files;
        SubLObject evidence_file = (SubLObject)alchemy_export.NIL;
        evidence_file = cdolist_list_var.first();
        while (alchemy_export.NIL != cdolist_list_var) {
            new_evidence_files = (SubLObject)ConsesLow.cons(Sequences.cconcatenate(to_dir, evidence_file), new_evidence_files);
            cdolist_list_var = cdolist_list_var.rest();
            evidence_file = cdolist_list_var.first();
        }
        evidence_files = Sequences.nreverse(evidence_files);
        ConsesLow.set_nth((SubLObject)alchemy_export.FOUR_INTEGER, test_form, mln_file);
        ConsesLow.set_nth((SubLObject)alchemy_export.FIVE_INTEGER, test_form, training_file);
        ConsesLow.set_nth((SubLObject)alchemy_export.SIX_INTEGER, test_form, (SubLObject)ConsesLow.list((SubLObject)alchemy_export.$sym221$QUOTE, new_evidence_files));
        PrintLow.format((SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$str222$_S__, test_form);
        return Eval.eval(test_form);
    }

    @SubLTranslatedFile.SubL(source = "cycl/butler/alchemy-export.lisp", position = 93646L)
    public static SubLObject test_alchemy_export() {
        alchemy_export((SubLObject)alchemy_export.$list223, (SubLObject)alchemy_export.$list224, (SubLObject)alchemy_export.$list225, (SubLObject)alchemy_export.$str226$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$str227$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$list228, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
        alchemy_export((SubLObject)alchemy_export.$list229, (SubLObject)alchemy_export.$list230, (SubLObject)alchemy_export.$list231, (SubLObject)alchemy_export.$str232$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$str233$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$list234, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
        alchemy_export((SubLObject)alchemy_export.$list235, (SubLObject)alchemy_export.$list236, (SubLObject)alchemy_export.$list237, (SubLObject)alchemy_export.$str238$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$str239$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$list240, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
        alchemy_export((SubLObject)alchemy_export.$list241, (SubLObject)alchemy_export.$list242, (SubLObject)alchemy_export.$list243, (SubLObject)alchemy_export.$str244$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$str245$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$list246, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
        alchemy_export((SubLObject)alchemy_export.$list247, (SubLObject)alchemy_export.$list248, (SubLObject)alchemy_export.$list249, (SubLObject)alchemy_export.$str250$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$str251$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$list252, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
        alchemy_export((SubLObject)alchemy_export.$list253, (SubLObject)alchemy_export.$list254, (SubLObject)alchemy_export.$list255, (SubLObject)alchemy_export.$str256$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$str257$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$list258, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
        alchemy_export((SubLObject)alchemy_export.$list259, (SubLObject)alchemy_export.$list248, (SubLObject)alchemy_export.$list249, (SubLObject)alchemy_export.$str260$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$str261$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$list262, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
        alchemy_export((SubLObject)alchemy_export.$list263, (SubLObject)alchemy_export.$list248, (SubLObject)alchemy_export.$list249, (SubLObject)alchemy_export.$str264$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$str265$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$list266, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
        alchemy_export((SubLObject)alchemy_export.$list267, (SubLObject)alchemy_export.$list267, (SubLObject)alchemy_export.$list268, (SubLObject)alchemy_export.$str269$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$str270$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$list271, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
        alchemy_export((SubLObject)alchemy_export.$list247, (SubLObject)alchemy_export.$list248, (SubLObject)alchemy_export.$list249, (SubLObject)alchemy_export.$str272$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$str273$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$list274, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
        alchemy_export((SubLObject)alchemy_export.$list275, (SubLObject)alchemy_export.$list276, (SubLObject)alchemy_export.$list277, (SubLObject)alchemy_export.$str278$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$str279$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$list280, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
        alchemy_export((SubLObject)alchemy_export.$list281, (SubLObject)alchemy_export.$list242, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)alchemy_export.$kw28$IN_MT, czer_main.canonicalize_term((SubLObject)alchemy_export.$list282, (SubLObject)alchemy_export.UNPROVIDED))), (SubLObject)alchemy_export.$str283$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$str284$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$list285, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
        alchemy_export((SubLObject)alchemy_export.$list286, (SubLObject)alchemy_export.$list287, (SubLObject)alchemy_export.$list288, (SubLObject)alchemy_export.$str289$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$str290$_cyc_projects_transfer_learning_S, (SubLObject)alchemy_export.$list291, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED, (SubLObject)alchemy_export.UNPROVIDED);
        return (SubLObject)alchemy_export.NIL;
    }

    public static SubLObject declare_alchemy_export_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "inference_output_answers_alchemy", "INFERENCE-OUTPUT-ANSWERS-ALCHEMY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_inference_answers_header", "ALCHEMY-EXPORT-INFERENCE-ANSWERS-HEADER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_query_variable_bindings_to_file", "ALCHEMY-EXPORT-QUERY-VARIABLE-BINDINGS-TO-FILE", 3, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_sentences_to_file", "ALCHEMY-EXPORT-SENTENCES-TO-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_sentences", "ALCHEMY-EXPORT-SENTENCES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_sentence_with_error_handling", "ALCHEMY-EXPORT-SENTENCE-WITH-ERROR-HANDLING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "assertions_meeting_criterion_to_alchemy_file", "ASSERTIONS-MEETING-CRITERION-TO-ALCHEMY-FILE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "assertions_to_alchemy_file", "ASSERTIONS-TO-ALCHEMY-FILE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "assertions_to_alchemy_stream", "ASSERTIONS-TO-ALCHEMY-STREAM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "check_assertion_selection_criterion", "CHECK-ASSERTION-SELECTION-CRITERION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "atomic_assertion_selection_criterion_p", "ATOMIC-ASSERTION-SELECTION-CRITERION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "check_non_atomic_assertion_selection_criterion", "CHECK-NON-ATOMIC-ASSERTION-SELECTION-CRITERION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "check_non_atomic_assertion_selection_criterion_arg_types", "CHECK-NON-ATOMIC-ASSERTION-SELECTION-CRITERION-ARG-TYPES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "check_non_atomic_assertion_selection_criterion_arg_type", "CHECK-NON-ATOMIC-ASSERTION-SELECTION-CRITERION-ARG-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "get_assertion_selection_operator_arg_types", "GET-ASSERTION-SELECTION-OPERATOR-ARG-TYPES", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "find_assertions_by_criterion", "FIND-ASSERTIONS-BY-CRITERION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "find_assertions_by_criterion_no_checks", "FIND-ASSERTIONS-BY-CRITERION-NO-CHECKS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "find_assertions_by_criterion_int", "FIND-ASSERTIONS-BY-CRITERION-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "delayed_atomic_assertion_selection_criterion_p", "DELAYED-ATOMIC-ASSERTION-SELECTION-CRITERION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "delayed_assertion_selection_criterion_operator_p", "DELAYED-ASSERTION-SELECTION-CRITERION-OPERATOR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "delayed_assertion_selection_criterionP", "DELAYED-ASSERTION-SELECTION-CRITERION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "all_assertions_meeting_all_criteria", "ALL-ASSERTIONS-MEETING-ALL-CRITERIA", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "find_assertions_meeting_criterion_among", "FIND-ASSERTIONS-MEETING-CRITERION-AMONG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "find_assertions_not_meeting_criterion_among", "FIND-ASSERTIONS-NOT-MEETING-CRITERION-AMONG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "all_rules_among", "ALL-RULES-AMONG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "verbosified_el_ruleP", "VERBOSIFIED-EL-RULE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "all_gafs_among", "ALL-GAFS-AMONG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "all_assertions_visible_from_mt", "ALL-ASSERTIONS-VISIBLE-FROM-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "all_assertions_visible_from_mt_among", "ALL-ASSERTIONS-VISIBLE-FROM-MT-AMONG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "all_assertions_not_visible_from_mt_among", "ALL-ASSERTIONS-NOT-VISIBLE-FROM-MT-AMONG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "all_isa_assertions_of_collection", "ALL-ISA-ASSERTIONS-OF-COLLECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "all_isa_assertions_of_all_collections_in_set_or_coll", "ALL-ISA-ASSERTIONS-OF-ALL-COLLECTIONS-IN-SET-OR-COLL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "all_isa_assertions_of_all_quoted_instances_of_coll", "ALL-ISA-ASSERTIONS-OF-ALL-QUOTED-INSTANCES-OF-COLL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "predicate_extent", "PREDICATE-EXTENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "union_of_extents_of_predicate_set_or_coll", "UNION-OF-EXTENTS-OF-PREDICATE-SET-OR-COLL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "union_of_extents_of_all_quoted_instances_of_coll", "UNION-OF-EXTENTS-OF-ALL-QUOTED-INSTANCES-OF-COLL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "all_assertions_meeting_criterion_plus_extents_of_predicates_mentioned", "ALL-ASSERTIONS-MEETING-CRITERION-PLUS-EXTENTS-OF-PREDICATES-MENTIONED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "assertion_predicates", "ASSERTION-PREDICATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "all_assertions_meeting_criterion_plus_extents_of_predicates_and_collections_mentioned", "ALL-ASSERTIONS-MEETING-CRITERION-PLUS-EXTENTS-OF-PREDICATES-AND-COLLECTIONS-MENTIONED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "assertion_predicates_and_collections", "ASSERTION-PREDICATES-AND-COLLECTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "predicate_or_collection_p", "PREDICATE-OR-COLLECTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "pred_or_coll_extent", "PRED-OR-COLL-EXTENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "all_assertions_mentioning_indexed_term", "ALL-ASSERTIONS-MENTIONING-INDEXED-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "all_assertions_mentioning_indexed_term_at_least_n_times", "ALL-ASSERTIONS-MENTIONING-INDEXED-TERM-AT-LEAST-N-TIMES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "all_assertions_mentioning_indexed_term_in_argpos", "ALL-ASSERTIONS-MENTIONING-INDEXED-TERM-IN-ARGPOS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "all_assertions_mentioning_any_indexed_term_in_set_or_coll", "ALL-ASSERTIONS-MENTIONING-ANY-INDEXED-TERM-IN-SET-OR-COLL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "all_assertions_mentioning_any_quoted_instance_of", "ALL-ASSERTIONS-MENTIONING-ANY-QUOTED-INSTANCE-OF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "all_assertions_mentioning_indexed_terms_in_set_or_coll_at_least_n_times", "ALL-ASSERTIONS-MENTIONING-INDEXED-TERMS-IN-SET-OR-COLL-AT-LEAST-N-TIMES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "all_assertions_mentioning_quoted_instances_of_at_least_n_times", "ALL-ASSERTIONS-MENTIONING-QUOTED-INSTANCES-OF-AT-LEAST-N-TIMES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "all_assertions_mentioning_any_indexed_term_in_set_or_coll_in_argpos", "ALL-ASSERTIONS-MENTIONING-ANY-INDEXED-TERM-IN-SET-OR-COLL-IN-ARGPOS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "all_assertions_mentioning_any_quoted_instance_of_in_argpos", "ALL-ASSERTIONS-MENTIONING-ANY-QUOTED-INSTANCE-OF-IN-ARGPOS", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "all_assertions_mentioning_all_indexed_terms_in_set_or_coll", "ALL-ASSERTIONS-MENTIONING-ALL-INDEXED-TERMS-IN-SET-OR-COLL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "all_assertions_mentioning_all_quoted_instances_of", "ALL-ASSERTIONS-MENTIONING-ALL-QUOTED-INSTANCES-OF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "all_assertions_mentioning_only_indexed_terms_in_set_or_coll", "ALL-ASSERTIONS-MENTIONING-ONLY-INDEXED-TERMS-IN-SET-OR-COLL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "all_assertions_mentioning_only_quoted_instances_of", "ALL-ASSERTIONS-MENTIONING-ONLY-QUOTED-INSTANCES-OF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export", "ALCHEMY-EXPORT", 6, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_int", "ALCHEMY-EXPORT-INT", 6, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_gather_training_rules_and_gafs", "ALCHEMY-EXPORT-GATHER-TRAINING-RULES-AND-GAFS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_gather_evidence_gaf_lists", "ALCHEMY-EXPORT-GATHER-EVIDENCE-GAF-LISTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_allowed_types", "ALCHEMY-EXPORT-ALLOWED-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_filter_dictionaries", "ALCHEMY-EXPORT-FILTER-DICTIONARIES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_filter_dictionary", "ALCHEMY-EXPORT-FILTER-DICTIONARY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_type_files", "ALCHEMY-EXPORT-TYPE-FILES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_filter_gaf_lists", "ALCHEMY-EXPORT-FILTER-GAF-LISTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_filter_gafs", "ALCHEMY-EXPORT-FILTER-GAFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_gaf_files", "ALCHEMY-EXPORT-GAF-FILES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_gaf_file", "ALCHEMY-EXPORT-GAF-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_filter_rules", "ALCHEMY-EXPORT-FILTER-RULES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_training_fol_predicates", "ALCHEMY-EXPORT-TRAINING-FOL-PREDICATES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "ae_filter_and_export_rule_file", "AE-FILTER-AND-EXPORT-RULE-FILE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_augment_rule_criterion", "ALCHEMY-EXPORT-AUGMENT-RULE-CRITERION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_augment_gaf_criterion", "ALCHEMY-EXPORT-AUGMENT-GAF-CRITERION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_add_types", "ALCHEMY-EXPORT-ADD-TYPES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_type_dictionary_enter", "ALCHEMY-EXPORT-TYPE-DICTIONARY-ENTER", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_type_dictionary_pushnew", "ALCHEMY-EXPORT-TYPE-DICTIONARY-PUSHNEW", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_augment_instances_in_type_dictionary", "ALCHEMY-EXPORT-AUGMENT-INSTANCES-IN-TYPE-DICTIONARY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_display_types", "ALCHEMY-EXPORT-DISPLAY-TYPES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_filter_rules_by_allowed_types", "ALCHEMY-EXPORT-FILTER-RULES-BY-ALLOWED-TYPES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_check_type_dictionary_for_type", "ALCHEMY-EXPORT-CHECK-TYPE-DICTIONARY-FOR-TYPE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "ae_all_variables_have_instances", "AE-ALL-VARIABLES-HAVE-INSTANCES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_numeric_term_filter", "ALCHEMY-EXPORT-NUMERIC-TERM-FILTER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_isa_term_type", "ALCHEMY-EXPORT-ISA-TERM-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_isa_term_coll_intersection_type", "ALCHEMY-EXPORT-ISA-TERM-COLL-INTERSECTION-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_get_lits", "ALCHEMY-EXPORT-GET-LITS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_filter_assertions_acceptable_for_fol", "ALCHEMY-EXPORT-FILTER-ASSERTIONS-ACCEPTABLE-FOR-FOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_filter_training_isa_gafs", "ALCHEMY-EXPORT-FILTER-TRAINING-ISA-GAFS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_filter_evidence_isa_gafs", "ALCHEMY-EXPORT-FILTER-EVIDENCE-ISA-GAFS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_filter_evidence_gafs", "ALCHEMY-EXPORT-FILTER-EVIDENCE-GAFS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "ae_export_rules_file", "AE-EXPORT-RULES-FILE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "ae_predicate_declarations_to_stream", "AE-PREDICATE-DECLARATIONS-TO-STREAM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_predicate_declaration_to_stream", "ALCHEMY-PREDICATE-DECLARATION-TO-STREAM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_predicate_arg_constraints", "ALCHEMY-PREDICATE-ARG-CONSTRAINTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_predicate_argpos_constraint", "ALCHEMY-PREDICATE-ARGPOS-CONSTRAINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_types_file", "ALCHEMY-EXPORT-TYPES-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_fol_denotational_term_not_requiring_declaration_p", "ALCHEMY-FOL-DENOTATIONAL-TERM-NOT-REQUIRING-DECLARATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_type_declaration_to_stream", "ALCHEMY-TYPE-DECLARATION-TO-STREAM", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_data_file", "ALCHEMY-EXPORT-DATA-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "all_fol_predicates_and_arguments_mentioned_in_analyses", "ALL-FOL-PREDICATES-AND-ARGUMENTS-MENTIONED-IN-ANALYSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_assertions_forts", "ALCHEMY-ASSERTIONS-FORTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_skip_fol_sentenceP", "ALCHEMY-SKIP-FOL-SENTENCE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "cycl_assertions_to_alchemy_style_fol", "CYCL-ASSERTIONS-TO-ALCHEMY-STYLE-FOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "cycl_sentence_to_alchemy_sentences", "CYCL-SENTENCE-TO-ALCHEMY-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "cycl_sentence_to_external_fol", "CYCL-SENTENCE-TO-EXTERNAL-FOL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_sentence", "ALCHEMY-EXPORT-SENTENCE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_sentence_parenthesized", "ALCHEMY-EXPORT-SENTENCE-PARENTHESIZED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "clear_alchemy_export_sentential_relation", "CLEAR-ALCHEMY-EXPORT-SENTENTIAL-RELATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "remove_alchemy_export_sentential_relation", "REMOVE-ALCHEMY-EXPORT-SENTENTIAL-RELATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_sentential_relation_internal", "ALCHEMY-EXPORT-SENTENTIAL-RELATION-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_sentential_relation", "ALCHEMY-EXPORT-SENTENTIAL-RELATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_type", "ALCHEMY-EXPORT-TYPE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_type_constant", "ALCHEMY-EXPORT-TYPE-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_type_nat", "ALCHEMY-EXPORT-TYPE-NAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_fol_predicate", "ALCHEMY-EXPORT-FOL-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_predicate_with_arity", "ALCHEMY-EXPORT-PREDICATE-WITH-ARITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_predicate_constant", "ALCHEMY-EXPORT-PREDICATE-CONSTANT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_predicate_nat", "ALCHEMY-EXPORT-PREDICATE-NAT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_fol_term", "ALCHEMY-EXPORT-FOL-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_fol_constant", "ALCHEMY-EXPORT-FOL-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_constant", "ALCHEMY-EXPORT-CONSTANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_variable", "ALCHEMY-EXPORT-VARIABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_fol_string", "ALCHEMY-EXPORT-FOL-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_string", "ALCHEMY-EXPORT-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_fol_number", "ALCHEMY-EXPORT-FOL-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_number", "ALCHEMY-EXPORT-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_fol_nat", "ALCHEMY-EXPORT-FOL-NAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_nat", "ALCHEMY-EXPORT-NAT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_export_delete_forbidden_chars", "ALCHEMY-EXPORT-DELETE-FORBIDDEN-CHARS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_constant_p", "ALCHEMY-CONSTANT-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_variable_p", "ALCHEMY-VARIABLE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "alchemy_identifier_p", "ALCHEMY-IDENTIFIER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "valid_alchemy_identifier_char_p", "VALID-ALCHEMY-IDENTIFIER-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "export_regressions", "EXPORT-REGRESSIONS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "export_regression", "EXPORT-REGRESSION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.butler.alchemy_export", "test_alchemy_export", "TEST-ALCHEMY-EXPORT", 0, 0, false);
        return (SubLObject)alchemy_export.NIL;
    }

    public static SubLObject init_alchemy_export_file() {
        alchemy_export.$alchemy_export_cafs_or_rulesP$ = SubLFiles.defparameter("*ALCHEMY-EXPORT-CAFS-OR-RULES?*", (SubLObject)alchemy_export.$kw0$BOTH);
        alchemy_export.$atomic_assertion_selection_criteria$ = SubLFiles.deflexical("*ATOMIC-ASSERTION-SELECTION-CRITERIA*", (SubLObject)ConsesLow.list((SubLObject)alchemy_export.$kw12$RULE, (SubLObject)alchemy_export.$kw13$GAF));
        alchemy_export.$assertion_selection_arg_types_by_operator$ = SubLFiles.deflexical("*ASSERTION-SELECTION-ARG-TYPES-BY-OPERATOR*", (SubLObject)alchemy_export.$list20);
        alchemy_export.$delayed_atomic_assertion_selection_criteria$ = SubLFiles.deflexical("*DELAYED-ATOMIC-ASSERTION-SELECTION-CRITERIA*", (SubLObject)ConsesLow.list((SubLObject)alchemy_export.$kw12$RULE, (SubLObject)alchemy_export.$kw13$GAF));
        alchemy_export.$delayed_assertion_selection_criterion_operators$ = SubLFiles.deflexical("*DELAYED-ASSERTION-SELECTION-CRITERION-OPERATORS*", (SubLObject)ConsesLow.list((SubLObject)alchemy_export.$kw30$VISIBLE_FROM_MT));
        alchemy_export.$ae_number_of_sentences$ = SubLFiles.defparameter("*AE-NUMBER-OF-SENTENCES*", (SubLObject)alchemy_export.ZERO_INTEGER);
        alchemy_export.$ae_number_of_training_predicates$ = SubLFiles.defparameter("*AE-NUMBER-OF-TRAINING-PREDICATES*", (SubLObject)alchemy_export.ZERO_INTEGER);
        alchemy_export.$ae_number_of_evidence_terms$ = SubLFiles.defparameter("*AE-NUMBER-OF-EVIDENCE-TERMS*", (SubLObject)alchemy_export.ZERO_INTEGER);
        alchemy_export.$alchemy_export_numeric_terms$ = SubLFiles.deflexical("*ALCHEMY-EXPORT-NUMERIC-TERMS*", (SubLObject)alchemy_export.NIL);
        alchemy_export.$alchemy_export_dropped_predicates$ = SubLFiles.defparameter("*ALCHEMY-EXPORT-DROPPED-PREDICATES*", (SubLObject)alchemy_export.$list138);
        alchemy_export.$alchemy_folification_properties$ = SubLFiles.deflexical("*ALCHEMY-FOLIFICATION-PROPERTIES*", (SubLObject)ConsesLow.list((SubLObject)alchemy_export.$kw167$MT_HANDLING, (SubLObject)alchemy_export.$list168, (SubLObject)alchemy_export.$kw169$ALLOW_EQUIV_RELATION_, (SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$kw170$RETURN_DATA_, (SubLObject)alchemy_export.T, (SubLObject)alchemy_export.$kw171$RULE_MACRO_PREDICATE_HANDLING, (SubLObject)alchemy_export.$kw172$EXPANSION));
        alchemy_export.$alchemy_export_sentential_relation_caching_state$ = SubLFiles.deflexical("*ALCHEMY-EXPORT-SENTENTIAL-RELATION-CACHING-STATE*", (SubLObject)alchemy_export.NIL);
        alchemy_export.$alchemy_export_type_prefix$ = SubLFiles.deflexical("*ALCHEMY-EXPORT-TYPE-PREFIX*", (SubLObject)alchemy_export.$str193$type);
        alchemy_export.$alchemy_export_predicate_prefix$ = SubLFiles.deflexical("*ALCHEMY-EXPORT-PREDICATE-PREFIX*", (SubLObject)alchemy_export.$str194$pred);
        alchemy_export.$alchemy_export_constant_prefix$ = SubLFiles.deflexical("*ALCHEMY-EXPORT-CONSTANT-PREFIX*", (SubLObject)alchemy_export.$str198$C_);
        alchemy_export.$alchemy_export_hl_id_prefix$ = SubLFiles.deflexical("*ALCHEMY-EXPORT-HL-ID-PREFIX*", (SubLObject)alchemy_export.$str199$HLID_);
        alchemy_export.$double_quote_string$ = SubLFiles.deflexical("*DOUBLE-QUOTE-STRING*", (SubLObject)alchemy_export.$str202$_);
        alchemy_export.$central_regression_dir$ = SubLFiles.deflexical("*CENTRAL-REGRESSION-DIR*", (SubLObject)alchemy_export.$str208$_cyc_projects_transfer_learning_S);
        alchemy_export.$regression_calls$ = SubLFiles.deflexical("*REGRESSION-CALLS*", (SubLObject)ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)alchemy_export.$str209$A, (SubLObject)alchemy_export.$list210), (SubLObject)ConsesLow.cons((SubLObject)alchemy_export.$str211$B, (SubLObject)alchemy_export.$list212), (SubLObject)ConsesLow.cons((SubLObject)alchemy_export.$str213$C, (SubLObject)alchemy_export.$list214), (SubLObject)ConsesLow.cons((SubLObject)alchemy_export.$str215$D, (SubLObject)alchemy_export.$list216), (SubLObject)ConsesLow.cons((SubLObject)alchemy_export.$str217$E, (SubLObject)alchemy_export.$list218)));
        return (SubLObject)alchemy_export.NIL;
    }

    public static SubLObject setup_alchemy_export_file() {
        memoization_state.note_globally_cached_function((SubLObject)alchemy_export.$sym183$ALCHEMY_EXPORT_SENTENTIAL_RELATION);
        generic_testing.define_test_case_table_int((SubLObject)alchemy_export.$sym292$CYCL_SENTENCE_TO_ALCHEMY_SENTENCES, (SubLObject)ConsesLow.list(new SubLObject[] { alchemy_export.$kw293$TEST, Symbols.symbol_function((SubLObject)alchemy_export.EQUAL), alchemy_export.$kw294$OWNER, alchemy_export.NIL, alchemy_export.$kw295$CLASSES, alchemy_export.NIL, alchemy_export.$kw296$KB, alchemy_export.$kw297$FULL, alchemy_export.$kw298$WORKING_, alchemy_export.NIL }), (SubLObject)alchemy_export.$list299);
        generic_testing.define_test_case_table_int((SubLObject)alchemy_export.$sym300$ALCHEMY_EXPORT_PREDICATE_WITH_ARITY, (SubLObject)ConsesLow.list(new SubLObject[] { alchemy_export.$kw293$TEST, Symbols.symbol_function((SubLObject)alchemy_export.EQUAL), alchemy_export.$kw294$OWNER, alchemy_export.NIL, alchemy_export.$kw295$CLASSES, alchemy_export.NIL, alchemy_export.$kw296$KB, alchemy_export.$kw297$FULL, alchemy_export.$kw298$WORKING_, alchemy_export.T }), (SubLObject)alchemy_export.$list301);
        generic_testing.define_test_case_table_int((SubLObject)alchemy_export.$sym302$ALCHEMY_EXPORT_FOL_TERM, (SubLObject)ConsesLow.list(new SubLObject[] { alchemy_export.$kw293$TEST, Symbols.symbol_function((SubLObject)alchemy_export.EQUAL), alchemy_export.$kw294$OWNER, alchemy_export.NIL, alchemy_export.$kw295$CLASSES, alchemy_export.NIL, alchemy_export.$kw296$KB, alchemy_export.$kw297$FULL, alchemy_export.$kw298$WORKING_, alchemy_export.T }), (SubLObject)alchemy_export.$list303);
        generic_testing.define_test_case_table_int((SubLObject)alchemy_export.$sym304$ALCHEMY_CONSTANT_P, (SubLObject)ConsesLow.list(new SubLObject[] { alchemy_export.$kw293$TEST, Symbols.symbol_function((SubLObject)alchemy_export.EQ), alchemy_export.$kw294$OWNER, alchemy_export.NIL, alchemy_export.$kw295$CLASSES, alchemy_export.NIL, alchemy_export.$kw296$KB, alchemy_export.$kw305$TINY, alchemy_export.$kw298$WORKING_, alchemy_export.T }), (SubLObject)alchemy_export.$list306);
        generic_testing.define_test_case_table_int((SubLObject)alchemy_export.$sym307$ALCHEMY_VARIABLE_P, (SubLObject)ConsesLow.list(new SubLObject[] { alchemy_export.$kw293$TEST, Symbols.symbol_function((SubLObject)alchemy_export.EQ), alchemy_export.$kw294$OWNER, alchemy_export.NIL, alchemy_export.$kw295$CLASSES, alchemy_export.NIL, alchemy_export.$kw296$KB, alchemy_export.$kw305$TINY, alchemy_export.$kw298$WORKING_, alchemy_export.T }), (SubLObject)alchemy_export.$list308);
        generic_testing.define_test_case_table_int((SubLObject)alchemy_export.$sym309$ALCHEMY_IDENTIFIER_P, (SubLObject)ConsesLow.list(new SubLObject[] { alchemy_export.$kw293$TEST, Symbols.symbol_function((SubLObject)alchemy_export.EQ), alchemy_export.$kw294$OWNER, alchemy_export.NIL, alchemy_export.$kw295$CLASSES, alchemy_export.NIL, alchemy_export.$kw296$KB, alchemy_export.$kw305$TINY, alchemy_export.$kw298$WORKING_, alchemy_export.T }), (SubLObject)alchemy_export.$list310);
        return (SubLObject)alchemy_export.NIL;
    }

    public void declareFunctions() {
        declare_alchemy_export_file();
    }

    public void initializeVariables() {
        init_alchemy_export_file();
    }

    public void runTopLevelForms() {
        setup_alchemy_export_file();
    }
}

/*

	Total time: 1458 ms
	 synthetic
	~%Inference answers in Alchemy format~%Created on ~A~%");
	$str3$Generated_from_KB__A_running_on_C = SubLObjectFactory.makeString("Generated from KB ~A running on CycL version ~A~%");
	$str4$Query_sentence___S__Mt___S_______ = SubLObjectFactory.makeString("Query sentence: ~S~%Mt: ~S~%
	~%Couldn't export the sentence ~S:~%~A~%
*/