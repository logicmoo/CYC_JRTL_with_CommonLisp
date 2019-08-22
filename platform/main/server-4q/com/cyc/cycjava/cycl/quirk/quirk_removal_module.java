package com.cyc.cycjava.cycl.quirk;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$ask_quirkP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.ceiling;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.consp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.numberp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.cyclifier;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.pph_question;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.term;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class quirk_removal_module extends SubLTranslatedFile {
    public static final SubLFile me = new quirk_removal_module();

    public static final String myName = "com.cyc.cycjava.cycl.quirk.quirk_removal_module";

    public static final String myFingerPrint = "25ddb3acd0c4f176e2d64f9d2dd2dde19ff2124c4f02c6a35ad2294aa161fa38";

    // defparameter
    // Definitions
    public static final SubLSymbol $tmp_results$ = makeSymbol("*TMP-RESULTS*");

    // defparameter
    public static final SubLSymbol $quirk_passages_num$ = makeSymbol("*QUIRK-PASSAGES-NUM*");

    // defparameter
    private static final SubLSymbol $secretary_class$ = makeSymbol("*SECRETARY-CLASS*");

    // defparameter
    private static final SubLSymbol $secretary$ = makeSymbol("*SECRETARY*");

    // defparameter
    private static final SubLSymbol $quirk_guruqa_cost$ = makeSymbol("*QUIRK-GURUQA-COST*");

    // defparameter
    private static final SubLSymbol $quirk_topic_mt$ = makeSymbol("*QUIRK-TOPIC-MT*");

    // defvar
    private static final SubLSymbol $quirk_irrelevant_terms$ = makeSymbol("*QUIRK-IRRELEVANT-TERMS*");

    // defconstant
    private static final SubLSymbol $quirk_irrelevant_collections$ = makeSymbol("*QUIRK-IRRELEVANT-COLLECTIONS*");

    // defvar
    private static final SubLSymbol $sksi_enabled_predicates$ = makeSymbol("*SKSI-ENABLED-PREDICATES*");

    // defparameter
    private static final SubLSymbol $connecting_terms_cost$ = makeSymbol("*CONNECTING-TERMS-COST*");













    private static final SubLInteger $int$50 = makeInteger(50);

    public static final SubLSymbol SECRETARY = makeSymbol("SECRETARY");

    private static final SubLObject $const2$UIA_OpenEndedConversation_DemoEnv = reader_make_constant_shell(makeString("UIA-OpenEndedConversation-DemoEnvironmentMt"));



    public static final SubLList $list4 = list(new SubLObject[]{ reader_make_constant_shell(makeString("QuirkIrrelevantTerm")), reader_make_constant_shell(makeString("ImplementationConstant")), reader_make_constant_shell(makeString("CoreConstant")), reader_make_constant_shell(makeString("NLTerm")), reader_make_constant_shell(makeString("MicrotheoryPredicate")), reader_make_constant_shell(makeString("Microtheory")), reader_make_constant_shell(makeString("CycLExpressionType")), reader_make_constant_shell(makeString("MicrotheoryType")), reader_make_constant_shell(makeString("RelationshipType")), reader_make_constant_shell(makeString("CollectionType")), reader_make_constant_shell(makeString("MetaRelation")), reader_make_constant_shell(makeString("VocabularyDefiningPredicate")), reader_make_constant_shell(makeString("KFDInternalKRTerm")), reader_make_constant_shell(makeString("SubcategorizationFrame")), reader_make_constant_shell(makeString("LinguisticObjectType")), reader_make_constant_shell(makeString("SKSIConstant")), reader_make_constant_shell(makeString("ExperimentalConstant")), reader_make_constant_shell(makeString("ActorSlot")) });



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$meaningSentenceOfSchema = reader_make_constant_shell(makeString("meaningSentenceOfSchema"));

    public static final SubLString $str8$_______A = makeString("~&??? ~A");



    public static final SubLSymbol GURUQA_RETRIEVE_PASSAGE = makeSymbol("GURUQA-RETRIEVE-PASSAGE");

    public static final SubLString $str11$Not_well_formed___S_because__S = makeString("Not well formed: ~S because ~S");



    public static final SubLSymbol RANKED_WEIGHT_LIST = makeSymbol("RANKED-WEIGHT-LIST");





    public static final SubLString $str16$______Index___S = makeString("~%~%~%Index: ~S");

    public static final SubLString $str17$_________________________________ = makeString("~%----------------------------------------------------------------------");

    public static final SubLString $str18$___S = makeString("~%~S");

    public static final SubLString $str19$___secretary__S_found_bindings__S = makeString("~% secretary ~S found bindings ~S in ~S");



    public static final SubLString $str21$__rejecting___A = makeString("~&rejecting: ~A");



    private static final SubLSymbol $REMOVAL_QUIRK_GURUQA = makeKeyword("REMOVAL-QUIRK-GURUQA");

    public static final SubLList $list24 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-QUIRK-GURUQA-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-QUIRK-GURUQA-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUIRK-GURUQA-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("ask guruqa"), makeKeyword("EXAMPLE"), makeString("<any-literal>") });

    public static final SubLList $list25 = list(makeSymbol("HL-MODULE"), makeSymbol("LITERAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLObject $$containsInfoStructure_CW = reader_make_constant_shell(makeString("containsInfoStructure-CW"));

    private static final SubLObject $$TREC_Mt = reader_make_constant_shell(makeString("TREC-Mt"));



    private static final SubLSymbol $sym29$_VAR1 = makeSymbol("?VAR1");

    private static final SubLSymbol $sym30$_VAR2 = makeSymbol("?VAR2");

    private static final SubLObject $const31$TextStringPropositionalExtraction = reader_make_constant_shell(makeString("TextStringPropositionalExtractionMtFn"));

    private static final SubLObject $$DependencyParser = reader_make_constant_shell(makeString("DependencyParser"));

    private static final SubLObject $$DependencyParserDefaultSetting = reader_make_constant_shell(makeString("DependencyParserDefaultSetting"));

    private static final SubLObject $$DocumentSentenceFn = reader_make_constant_shell(makeString("DocumentSentenceFn"));

    private static final SubLObject $$CorpusDocumentFn = reader_make_constant_shell(makeString("CorpusDocumentFn"));

    private static final SubLObject $$CNS_Corpus = reader_make_constant_shell(makeString("CNS-Corpus"));

    private static final SubLObject $$DocumentNumberFn = reader_make_constant_shell(makeString("DocumentNumberFn"));

    private static final SubLObject $$SentenceNumberFn = reader_make_constant_shell(makeString("SentenceNumberFn"));





    private static final SubLList $list41 = list(makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-QUIRK-GURUQA"));

    private static final SubLSymbol $MT_ASSERTS_SENTENCE = makeKeyword("MT-ASSERTS-SENTENCE");

    private static final SubLString $str43$_S_is_not_a_support_p = makeString("~S is not a support-p");

    private static final SubLObject $$NGA_Gns_KS = reader_make_constant_shell(makeString("NGA-Gns-KS"));

    private static final SubLList $list45 = list(reader_make_constant_shell(makeString("MappingMtFn")), reader_make_constant_shell(makeString("NGA-KS")));

    private static final SubLObject $$Usgs_Gnis_KS = reader_make_constant_shell(makeString("Usgs-Gnis-KS"));

    private static final SubLList $list47 = list(reader_make_constant_shell(makeString("MappingMtFn")), reader_make_constant_shell(makeString("Usgs-KS")));

    private static final SubLSymbol $REMOVAL_QUIRK_GURUQA_CONJUCTIVE = makeKeyword("REMOVAL-QUIRK-GURUQA-CONJUCTIVE");

    private static final SubLSymbol $REMOVAL_QUIRK_GURUQA_CONJUNCTIVE = makeKeyword("REMOVAL-QUIRK-GURUQA-CONJUNCTIVE");

    private static final SubLString $str50$QUIRK_enabled_ = makeString("QUIRK enabled!");

    private static final SubLString $str51$QUIRK_disabled_ = makeString("QUIRK disabled!");

    private static final SubLList $list52 = list(new SubLObject[]{ makeKeyword("EVERY-PREDICATES"), NIL, makeKeyword("APPLICABILITY"), makeSymbol("REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-APPLICABILITY"), makeKeyword("COST"), makeSymbol("REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("submit an entire event structure to the QUIRK system\n    for simultaneous satisfaction"), makeKeyword("EXAMPLE"), makeString("(#$and (#$isa <event1> <EventType>)\n\t     (#$<actorSlot1> <event1> <actor1>)\n\t     (#$<actorSlot2> <event1> <actor2>)\n\t     ...)") });

    private static final SubLObject $$ActorSlot = reader_make_constant_shell(makeString("ActorSlot"));

    private static final SubLObject $$TaxonomicSlot = reader_make_constant_shell(makeString("TaxonomicSlot"));

    private static final SubLList $list55 = list(makeSymbol("MT"), makeSymbol("LITERAL"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$Event = reader_make_constant_shell(makeString("Event"));



    private static final SubLSymbol $sym59$SINGLETON_ = makeSymbol("SINGLETON?");

    private static final SubLFloat $float$0_9 = makeDouble(0.9);

    public static final SubLString $str61$_______A = makeString("~%$$$ ~A");

    private static final SubLString $str62$_______A = makeString("~%### ~A");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));





    private static final SubLSymbol $sym66$_ = makeSymbol("+");

    private static final SubLSymbol ASK_QAGA_CACHED = makeSymbol("ASK-QAGA-CACHED");

    private static final SubLSymbol $ask_qaga_cached_caching_state$ = makeSymbol("*ASK-QAGA-CACHED-CACHING-STATE*");



    private static final SubLSymbol $REMOVAL_CONNECTING_TERMS = makeKeyword("REMOVAL-CONNECTING-TERMS");

    public static final SubLList $list71 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("COST"), makeSymbol("REMOVAL-CONNECTING-TERMS-COST"), makeKeyword("SUPPORT-MODULE"), makeKeyword("QAGA"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("connectingTerms")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("connectingTerms")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("connectingTerms")), list(makeKeyword("BIND"), makeSymbol("TERM1")), list(makeKeyword("BIND"), makeSymbol("TERM2")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("TERM1")), list(makeKeyword("VALUE"), makeSymbol("TERM2")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("MAPCAR"), makeSymbol("GENERATE-PHRASE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("STR1"), makeSymbol("STR2")), list(makeKeyword("CALL"), makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list(makeKeyword("CALL"), makeSymbol("CONNECTING-TERMS"), list(list(makeKeyword("VALUE"), makeSymbol("STR1")), list(makeKeyword("VALUE"), makeSymbol("STR2")))))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("connectingTerms")), list(makeKeyword("VALUE"), makeSymbol("TERM1")), list(makeKeyword("VALUE"), makeSymbol("TERM2")), cons(reader_make_constant_shell(makeString("TheSet")), makeKeyword("INPUT"))), makeKeyword("DOCUMENTATION"), makeString("interface to the QAGA connecting terms functionality"), makeKeyword("EXAMPLE"), makeString("(#$connectingTerms \"valentina tereshkova\" \"astronaut sally ride\" (#$TheSet . ?X))") });

    private static final SubLObject $$InstanceNamedFn = reader_make_constant_shell(makeString("InstanceNamedFn"));



    public static final SubLList $list74 = list(reader_make_constant_shell(makeString("GraphicalStructure")));





    public static final SubLList $list77 = list(makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-QAGA"));

    public static final SubLSymbol ANSWER_QUESTION = makeSymbol("ANSWER-QUESTION");



    public static final SubLSymbol $answer_question_caching_state$ = makeSymbol("*ANSWER-QUESTION-CACHING-STATE*");



    public static final SubLSymbol JUSTIFY = makeSymbol("JUSTIFY");

    private static final SubLSymbol $REMOVAL_TEXT_ANSWER = makeKeyword("REMOVAL-TEXT-ANSWER");

    public static final SubLList $list84 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("SUPPORT-MODULE"), makeKeyword("TEXT"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("textAnswer")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("textAnswer")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("textAnswer")), list(makeKeyword("BIND"), makeSymbol("QUESTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("QUESTION"))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GENERATE-QUESTION"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("ANSWER-QUESTION"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("ANSWER-TEXT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell(makeString("textAnswer")), list(makeKeyword("VALUE"), makeSymbol("QUESTION")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("run a query against the quirk-lite system"), makeKeyword("EXAMPLE"), makeString("(#$textAnswer \"Who is Havel\"  ?X)") });

    public static final SubLList $list85 = list(makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-TEXT"));

    private static final SubLSymbol $REMOVAL_QUIRK_CYCLIFY = makeKeyword("REMOVAL-QUIRK-CYCLIFY");

    public static final SubLList $list87 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-QUIRK-GURUQA-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-QUIRK-GURUQA-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUIRK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("run a CycL  query against the quirk-lite system"), makeKeyword("EXAMPLE"), makeString(" <Anything> ") });

    public static final SubLSymbol XXXXXXXXXXXXXXXXXXXXXX = makeSymbol("XXXXXXXXXXXXXXXXXXXXXX");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    public static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLObject $$implies = reader_make_constant_shell(makeString("implies"));

    public static final SubLList $list92 = list(makeKeyword("CONDITIONAL-SENTENCE?"), T);



    public static final SubLList $list94 = list(makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-QUIRK"));

    private static final SubLSymbol $REMOVAL_QUIRK_CYCLIFY_CONJUNCTIVE = makeKeyword("REMOVAL-QUIRK-CYCLIFY-CONJUNCTIVE");

    public static final SubLList $list96 = list(new SubLObject[]{ makeKeyword("EVERY-PREDICATES"), NIL, makeKeyword("APPLICABILITY"), makeSymbol("REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-APPLICABILITY"), makeKeyword("COST"), makeSymbol("REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUIRK-CONJUNCTIVE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("submit an entire event structure to the QUIRK system\n    for simultaneous satisfaction"), makeKeyword("EXAMPLE"), makeString("(#$and (#$isa <event1> <EventType>)\n           (#$<actorSlot1> <event1> <actor1>)\n           (#$<actorSlot2> <event1> <actor2>)\n           ...)") });



    public static final SubLList $list98 = list(makeSymbol("MT"), makeSymbol("ASENT"));



    public static final SubLString $str100$removal_quirk_conjunctive_expand_ = makeString("removal-quirk-conjunctive-expand can't yet handle multiple mts in the conjunction");

    public static final SubLSymbol GET_WORD_GRAPH_CACHED = makeSymbol("GET-WORD-GRAPH-CACHED");

    public static final SubLSymbol $get_word_graph_cached_caching_state$ = makeSymbol("*GET-WORD-GRAPH-CACHED-CACHING-STATE*");

    private static final SubLObject $$conceptuallyRelated = reader_make_constant_shell(makeString("conceptuallyRelated"));

    private static final SubLObject $$WordFn = reader_make_constant_shell(makeString("WordFn"));

    public static final SubLSymbol FULLY_CONNECTED_GRAPH_LINKS = makeSymbol("FULLY-CONNECTED-GRAPH-LINKS");

    public static final SubLSymbol GET_PATH_LABELS = makeSymbol("GET-PATH-LABELS");

    public static final SubLSymbol $fully_connected_graph_links_caching_state$ = makeSymbol("*FULLY-CONNECTED-GRAPH-LINKS-CACHING-STATE*");

    public static final SubLSymbol WORD_GRAPH_LINKS = makeSymbol("WORD-GRAPH-LINKS");

    public static final SubLSymbol $word_graph_links_caching_state$ = makeSymbol("*WORD-GRAPH-LINKS-CACHING-STATE*");

    private static final SubLSymbol $REMOVAL_QAGA_LINK_FOR = makeKeyword("REMOVAL-QAGA-LINK-FOR");

    public static final SubLList $list111 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("COST"), makeSymbol("REMOVAL-CONNECTING-TERMS-COST"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("QAGALinkFor")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("QAGALinkFor")), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell(makeString("QAGALinkFor")), list(makeKeyword("BIND"), makeSymbol("QUERY")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("CALL"), makeSymbol("CDR"), list(makeKeyword("VALUE"), makeSymbol("QUERY")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("MAPCAR"), makeSymbol("GENERATE-PHRASE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("FULLY-CONNECTED-GRAPH-LINKS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("WORD1"), makeSymbol("WORD2")), list(reader_make_constant_shell(makeString("QAGALinkFor")), list(makeKeyword("VALUE"), makeSymbol("QUERY")), list(reader_make_constant_shell(makeString("WordFn")), list(makeKeyword("VALUE"), makeSymbol("WORD1"))), list(reader_make_constant_shell(makeString("WordFn")), list(makeKeyword("VALUE"), makeSymbol("WORD2"))))) });

    public static final SubLSymbol QAGA_LINK_RESULT = makeSymbol("QAGA-LINK-RESULT");

    public static final SubLSymbol $qaga_link_result_caching_state$ = makeSymbol("*QAGA-LINK-RESULT-CACHING-STATE*");

    private static final SubLSymbol $REMOVAL_QAGA_LINK_FOR_CURRIED = makeKeyword("REMOVAL-QAGA-LINK-FOR-CURRIED");

    public static final SubLList $list115 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("COST"), makeSymbol("REMOVAL-CONNECTING-TERMS-COST"), makeKeyword("REQUIRED-PATTERN"), list(list(reader_make_constant_shell(makeString("QAGALinkForCurried")), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(reader_make_constant_shell(makeString("QAGALinkForCurried")), list(makeKeyword("BIND"), makeSymbol("QUERY"))), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list(makeKeyword("CALL"), makeSymbol("CDR"), list(makeKeyword("VALUE"), makeSymbol("QUERY")))), makeKeyword("INPUT-ENCODE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("MAPCAR"), makeSymbol("GENERATE-PHRASE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("FULLY-CONNECTED-GRAPH-LINKS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("WORD1"), makeSymbol("WORD2")), list(makeKeyword("CALL"), makeSymbol("QAGA-LINK-RESULT"), list(list(reader_make_constant_shell(makeString("QAGALinkForCurried")), list(makeKeyword("VALUE"), makeSymbol("QUERY"))), list(reader_make_constant_shell(makeString("WordFn")), list(makeKeyword("VALUE"), makeSymbol("WORD1"))), list(reader_make_constant_shell(makeString("WordFn")), list(makeKeyword("VALUE"), makeSymbol("WORD2")))))) });

    public static SubLObject get_secretary() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $secretary$.getDynamicValue(thread)) {
            $secretary$.setDynamicValue(object.new_class_instance($secretary_class$.getDynamicValue(thread)), thread);
        }
        return $secretary$.getDynamicValue(thread);
    }

    public static SubLObject secretary_class(final SubLObject v_class) {
        $secretary_class$.setDynamicValue(v_class);
        $secretary$.setDynamicValue(NIL);
        return get_secretary();
    }

    public static SubLObject get_sksi_enabled_predicates() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $sksi_enabled_predicates$.getDynamicValue(thread)) {
            SubLObject assertions = NIL;
            SubLObject predicates = NIL;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                assertions = kb_mapping.gather_predicate_extent_index($$meaningSentenceOfSchema, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            SubLObject cdolist_list_var = assertions;
            SubLObject ass = NIL;
            ass = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject formula = cycl_utilities.formula_arg2(assertions_high.assertion_formula(ass), UNPROVIDED);
                final SubLObject item_var;
                final SubLObject pred = item_var = cycl_utilities.formula_arg0(formula);
                if (NIL == member(item_var, predicates, symbol_function(EQL), symbol_function(IDENTITY))) {
                    predicates = cons(item_var, predicates);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ass = cdolist_list_var.first();
            } 
            $sksi_enabled_predicates$.setDynamicValue(predicates, thread);
        }
        return $sksi_enabled_predicates$.getDynamicValue(thread);
    }

    public static SubLObject sksi_enabled_predicate_p(final SubLObject pred) {
        return member(pred, get_sksi_enabled_predicates(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject quirk_irrelevant_add(final SubLObject cyc_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash(cyc_term, $quirk_irrelevant_terms$.getDynamicValue(thread), T);
        return T;
    }

    public static SubLObject quirk_irrelevant_remove(final SubLObject cyc_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        remhash(cyc_term, $quirk_irrelevant_terms$.getDynamicValue(thread));
        return T;
    }

    public static SubLObject quirk_irrelevant_term(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != gethash(v_term, $quirk_irrelevant_terms$.getDynamicValue(thread), UNPROVIDED)) {
            return T;
        }
        SubLObject irrelevant = NIL;
        if (NIL == irrelevant) {
            SubLObject csome_list_var = $quirk_irrelevant_collections$.getGlobalValue();
            SubLObject coll = NIL;
            coll = csome_list_var.first();
            while ((NIL == irrelevant) && (NIL != csome_list_var)) {
                if (NIL != isa.isa_in_any_mtP(v_term, coll)) {
                    quirk_irrelevant_add(v_term);
                    irrelevant = T;
                }
                csome_list_var = csome_list_var.rest();
                coll = csome_list_var.first();
            } 
        }
        return irrelevant;
    }

    public static SubLObject quirk_relevant_literal(final SubLObject literal) {
        SubLObject fail = NIL;
        if (NIL == fail) {
            SubLObject csome_list_var = literal;
            SubLObject v_term = NIL;
            v_term = csome_list_var.first();
            while ((NIL == fail) && (NIL != csome_list_var)) {
                if (NIL != quirk_irrelevant_term(v_term)) {
                    fail = v_term;
                }
                csome_list_var = csome_list_var.rest();
                v_term = csome_list_var.first();
            } 
        }
        if (NIL == fail) {
            format(T, $str8$_______A, literal);
        }
        return makeBoolean(NIL == fail);
    }

    public static SubLObject removal_quirk_guruqa_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $ask_quirkP$.getDynamicValue(thread)) && (NIL != quirk_relevant_literal(asent)));
    }

    public static SubLObject removal_quirk_guruqa_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.formula_arg0(asent);
        if (NIL != sksi_enabled_predicate_p(pred)) {
            return multiply($int$100, $quirk_guruqa_cost$.getDynamicValue(thread));
        }
        return $quirk_guruqa_cost$.getDynamicValue(thread);
    }

    public static SubLObject index_retrieve_passage(final SubLObject index) {
        return apply(symbol_function(GURUQA_RETRIEVE_PASSAGE), external_interfaces.guruqa_answer_coordinates(index));
    }

    public static SubLObject removal_quirk_guruqa_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject well_formed_query = NIL;
        well_formed_query = wff.query_okP(cycl_utilities.hl_to_el(asent), UNPROVIDED);
        if (NIL == well_formed_query) {
            Errors.warn($str11$Not_well_formed___S_because__S, asent, wff.why_not_wff_ask(cycl_utilities.hl_to_el(asent), UNPROVIDED, UNPROVIDED));
        }
        final SubLObject _prev_bind_0 = $ask_quirkP$.currentBinding(thread);
        try {
            $ask_quirkP$.bind(NIL, thread);
            final SubLObject guruqa_query = external_interfaces.compute_guruqa_query(asent);
            final SubLObject guruqa_string = methods.funcall_instance_method_with_0_args(guruqa_query, TO_STRING);
            final SubLObject guruqa_ranked_weights = methods.funcall_instance_method_with_0_args(guruqa_query, RANKED_WEIGHT_LIST);
            final SubLObject indexes = external_interfaces.guruqa_answer_indexes(guruqa_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject top_indices = subseq(indexes, ZERO_INTEGER, $quirk_passages_num$.getDynamicValue(thread));
            final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
            SubLObject cdolist_list_var = top_indices;
            SubLObject ind = NIL;
            ind = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject current;
                final SubLObject datum = current = ind;
                final SubLObject score_tail = property_list_member($SCORE, current);
                final SubLObject score = (NIL != score_tail) ? cadr(score_tail) : NIL;
                if (NIL != acceptable_score_for_guruqa_weights(score, guruqa_ranked_weights)) {
                    final SubLObject passage = index_retrieve_passage(ind);
                    final SubLObject passage_assignments = methods.funcall_instance_method_with_3_args(get_secretary(), ASK, asent, passage, mt);
                    format(T, $str16$______Index___S, ind);
                    format(T, $str17$_________________________________);
                    format(T, $str18$___S, passage);
                    format(T, $str17$_________________________________);
                    format(T, $str19$___secretary__S_found_bindings__S, new SubLObject[]{ get_secretary(), passage_assignments, mt });
                    SubLObject cdolist_list_var_$1 = passage_assignments;
                    SubLObject assignment = NIL;
                    assignment = cdolist_list_var_$1.first();
                    while (NIL != cdolist_list_var_$1) {
                        final SubLObject binding = instances.get_slot(assignment, BINDINGS);
                        final SubLObject v_answer = sublis(binding, asent, UNPROVIDED, UNPROVIDED);
                        if (NIL != quirk_relevant_literal(v_answer)) {
                            backward.removal_add_node(make_quirk_guruqa_support(v_answer, ind), binding, UNPROVIDED);
                        } else {
                            format(T, $str21$__rejecting___A, v_answer);
                        }
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        assignment = cdolist_list_var_$1.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                ind = cdolist_list_var.first();
            } 
        } finally {
            $ask_quirkP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject make_quirk_guruqa_support(final SubLObject support_formula, final SubLObject ind) {
        return arguments.make_hl_support($QUIRK_GURUQA, support_formula, document_index_mt(ind), UNPROVIDED);
    }

    public static SubLObject hl_justify_quirk_guruqa(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list25);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list25);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list25);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list25);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject mt2 = narts_high.nart_el_formula(mt);
            final SubLObject passage = apply(symbol_function(GURUQA_RETRIEVE_PASSAGE), document_mt_coordinates(mt2));
            return list(assertions_high.create_gaf(list($$containsInfoStructure_CW, list_utilities.cadddr(mt2), passage), $$TREC_Mt, $FORWARD, enumeration_types.tv_truth(tv), enumeration_types.tv_strength(tv), NIL));
        }
        cdestructuring_bind_error(support, $list25);
        return NIL;
    }

    public static SubLObject document_mt_coordinates(final SubLObject mt) {
        final SubLObject doc_var = variables.hl_var_for_default_el_var($sym29$_VAR1);
        final SubLObject sent_var = variables.hl_var_for_default_el_var($sym30$_VAR2);
        final SubLObject binding = unification.unify(mt, list($const31$TextStringPropositionalExtraction, $$DependencyParser, $$DependencyParserDefaultSetting, list($$DocumentSentenceFn, list($$CorpusDocumentFn, $$CNS_Corpus, list($$DocumentNumberFn, doc_var)), list($$SentenceNumberFn, sent_var))), UNPROVIDED, UNPROVIDED);
        final SubLObject doc = assoc(doc_var, binding, symbol_function(EQUALP), UNPROVIDED).rest();
        final SubLObject sent = assoc(sent_var, binding, symbol_function(EQUALP), UNPROVIDED).rest();
        return list(doc, sent);
    }

    public static SubLObject document_index_mt(final SubLObject index) {
        final SubLObject doc_tail = property_list_member($DOC, index);
        final SubLObject doc = (NIL != doc_tail) ? cadr(doc_tail) : NIL;
        final SubLObject sent_tail = property_list_member($SENT, index);
        final SubLObject sent = (NIL != sent_tail) ? cadr(sent_tail) : NIL;
        return czer_main.cyc_find_or_create_nart(list($const31$TextStringPropositionalExtraction, $$DependencyParser, $$DependencyParserDefaultSetting, list($$DocumentSentenceFn, list($$CorpusDocumentFn, $$CNS_Corpus, list($$DocumentNumberFn, doc)), list($$SentenceNumberFn, sent))), UNPROVIDED);
    }

    public static SubLObject ask_textually_justified(final SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (backchain == UNPROVIDED) {
            backchain = NIL;
        }
        if (number == UNPROVIDED) {
            number = NIL;
        }
        if (time == UNPROVIDED) {
            time = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        final SubLObject answers = ask_utilities.ask_justified(formula, mt, backchain, number, time, depth);
        SubLObject res = NIL;
        SubLObject cdolist_list_var = answers;
        SubLObject ans = NIL;
        ans = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject resn = NIL;
            SubLObject cdolist_list_var_$2 = ans.rest();
            SubLObject just = NIL;
            just = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                SubLObject resjust = NIL;
                SubLObject cdolist_list_var_$3 = just;
                SubLObject supp = NIL;
                supp = cdolist_list_var_$3.first();
                while (NIL != cdolist_list_var_$3) {
                    if (NIL != arguments.hl_support_p(supp)) {
                        if (supp.first() == $QUIRK_GURUQA) {
                            resjust = cons(assertions_high.assertion_formula(hl_supports.hl_justify(supp).first()), resjust);
                        } else {
                            resjust = cons(list($MT_ASSERTS_SENTENCE, list_utilities.caddr(supp), pph_main.generate_phrase(cadr(supp), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), list_utilities.cadddr(supp)), resjust);
                        }
                    } else
                        if (NIL != assertion_handles.assertion_p(supp)) {
                            resjust = cons(list($MT_ASSERTS_SENTENCE, assertions_high.assertion_mt(supp), pph_main.generate_phrase(supp, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), assertions_high.cyc_assertion_tv(supp)), resjust);
                        } else {
                            Errors.error($str43$_S_is_not_a_support_p, supp);
                        }

                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    supp = cdolist_list_var_$3.first();
                } 
                resjust = cons(ans.first(), resjust);
                resn = cons(resjust, resn);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                just = cdolist_list_var_$2.first();
            } 
            res = cons(resn, res);
            cdolist_list_var = cdolist_list_var.rest();
            ans = cdolist_list_var.first();
        } 
        return res;
    }

    public static SubLObject register_nima_sks() {
        sksi_removal_module_generation.register_sksi_removal_modules_for_sks($$NGA_Gns_KS, narts_high.find_nart($list45), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject register_usgs_sks() {
        sksi_removal_module_generation.register_sksi_removal_modules_for_sks($$Usgs_Gnis_KS, narts_high.find_nart($list47), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject enable_quirk() {
        $ask_quirkP$.setDynamicValue(T);
        inference_modules.undeclare_inference_conjunctive_removal_module($REMOVAL_QUIRK_GURUQA);
        inference_modules.undeclare_inference_conjunctive_removal_module($REMOVAL_QUIRK_GURUQA_CONJUCTIVE);
        inference_modules.undeclare_inference_conjunctive_removal_module($REMOVAL_QUIRK_GURUQA_CONJUNCTIVE);
        format(T, $str50$QUIRK_enabled_);
        return NIL;
    }

    public static SubLObject disable_quirk() {
        sksi_removal_module_generation.deregister_all_sksi_removal_modules();
        $ask_quirkP$.setDynamicValue(NIL);
        format(T, $str51$QUIRK_disabled_);
        return NIL;
    }

    public static SubLObject isa_actor_slotP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return isa.isaP(v_term, $$ActorSlot, mt, UNPROVIDED);
    }

    public static SubLObject isa_taxonomic_slotP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return isa.isaP(v_term, $$TaxonomicSlot, mt, UNPROVIDED);
    }

    public static SubLObject reconstruct_quirk_state_from_predicate_literal(final SubLObject predicate_literal, final SubLObject var_lit_hash) {
        SubLObject state_literals = list(predicate_literal);
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = predicate_literal.rest();
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$4;
            final SubLObject arg_literals = cdolist_list_var_$4 = gethash(arg, var_lit_hash, UNPROVIDED);
            SubLObject arg_literal = NIL;
            arg_literal = cdolist_list_var_$4.first();
            while (NIL != cdolist_list_var_$4) {
                if ((NIL != isa_taxonomic_slotP(arg_literal.first(), UNPROVIDED)) && (NIL != forts.fort_p(third(arg_literal)))) {
                    state_literals = cons(arg_literal, state_literals);
                }
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                arg_literal = cdolist_list_var_$4.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return state_literals;
    }

    public static SubLObject compute_quirk_state_groups(final SubLObject contextualized_literals) {
        SubLObject state_literals = NIL;
        final SubLObject variable_hash = make_hash_table(FOUR_INTEGER, UNPROVIDED, UNPROVIDED);
        SubLObject state_groups = NIL;
        SubLObject cdolist_list_var = contextualized_literals;
        SubLObject ctx_literal = NIL;
        ctx_literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = ctx_literal;
            SubLObject mt = NIL;
            SubLObject literal = NIL;
            destructuring_bind_must_consp(current, datum, $list55);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list55);
            literal = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pred = literal.first();
                final SubLObject args = literal.rest();
                if ((((NIL == isa_taxonomic_slotP(pred, mt)) && (NIL == isa_actor_slotP(pred, mt))) && (NIL == cycl_variables.hl_varP(pred))) && (NIL == cycl_variables.el_varP(pred))) {
                    state_literals = cons(literal, state_literals);
                }
                SubLObject cdolist_list_var_$5 = args;
                SubLObject arg = NIL;
                arg = cdolist_list_var_$5.first();
                while (NIL != cdolist_list_var_$5) {
                    if ((NIL != cycl_variables.hl_varP(arg)) || (NIL != cycl_variables.el_varP(arg))) {
                        sethash(arg, variable_hash, cons(literal, gethash(arg, variable_hash, UNPROVIDED)));
                    }
                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                    arg = cdolist_list_var_$5.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list55);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ctx_literal = cdolist_list_var.first();
        } 
        cdolist_list_var = state_literals;
        SubLObject state_literal = NIL;
        state_literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject group = reconstruct_quirk_state_from_predicate_literal(state_literal, variable_hash);
            if (NIL != group) {
                state_groups = cons(group, state_groups);
            }
            cdolist_list_var = cdolist_list_var.rest();
            state_literal = cdolist_list_var.first();
        } 
        return state_groups;
    }

    public static SubLObject reconstruct_quirk_event_from_variable(final SubLObject variable, final SubLObject var_lit_hash) {
        final SubLObject variable_literals = gethash(variable, var_lit_hash, UNPROVIDED);
        SubLObject actor_variables = NIL;
        SubLObject event_literals = NIL;
        SubLObject cdolist_list_var = variable_literals;
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (literal.first().eql($$isa) && (NIL != genls.genl_in_any_mtP(third(literal), $$Event))) {
                event_literals = cons(literal, event_literals);
            } else
                if ((NIL != isa_actor_slotP(literal.first(), UNPROVIDED)) && variable.eql(second(literal))) {
                    final SubLObject actor = second(literal);
                    if ((NIL != cycl_variables.hl_varP(actor)) || (NIL != cycl_variables.el_varP(actor))) {
                        actor_variables = cons(actor, actor_variables);
                    }
                    final SubLObject item_var = literal;
                    if (NIL == member(item_var, event_literals, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                        event_literals = cons(item_var, event_literals);
                    }
                }

            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        cdolist_list_var = actor_variables;
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$6;
            final SubLObject actor_variable_literals = cdolist_list_var_$6 = gethash(var, var_lit_hash, UNPROVIDED);
            SubLObject literal2 = NIL;
            literal2 = cdolist_list_var_$6.first();
            while (NIL != cdolist_list_var_$6) {
                if (literal2.first().eql($$isa) && (NIL != forts.fort_p(third(literal2)))) {
                    final SubLObject item_var2 = literal2;
                    if (NIL == member(item_var2, event_literals, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                        event_literals = cons(item_var2, event_literals);
                    }
                }
                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                literal2 = cdolist_list_var_$6.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return event_literals;
    }

    public static SubLObject compute_quirk_event_groups(final SubLObject contextualized_literals) {
        SubLObject event_variables = NIL;
        SubLObject event_groups = NIL;
        SubLObject decontextualized_literals = NIL;
        final SubLObject variable_hash = make_hash_table(FOUR_INTEGER, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = contextualized_literals;
        SubLObject ctx_literal = NIL;
        ctx_literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = ctx_literal;
            SubLObject mt = NIL;
            SubLObject literal = NIL;
            destructuring_bind_must_consp(current, datum, $list55);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list55);
            literal = current.first();
            current = current.rest();
            if (NIL == current) {
                decontextualized_literals = cons(literal, decontextualized_literals);
                SubLObject cdolist_list_var_$7 = literal;
                SubLObject arg = NIL;
                arg = cdolist_list_var_$7.first();
                while (NIL != cdolist_list_var_$7) {
                    if ((NIL != cycl_variables.hl_varP(arg)) || (NIL != cycl_variables.el_varP(arg))) {
                        final SubLObject item_var = literal;
                        if (NIL == member(item_var, gethash(arg, variable_hash, UNPROVIDED), symbol_function(EQUALP), symbol_function(IDENTITY))) {
                            sethash(arg, variable_hash, cons(item_var, gethash(arg, variable_hash, UNPROVIDED)));
                        }
                    }
                    cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                    arg = cdolist_list_var_$7.first();
                } 
                if ((literal.first().eql($$isa) && (NIL != term.el_fort_p(third(literal)))) && (NIL != genls.genl_in_any_mtP(third(literal), $$Event))) {
                    final SubLObject item_var2 = second(literal);
                    if (NIL == member(item_var2, event_variables, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                        event_variables = cons(item_var2, event_variables);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list55);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ctx_literal = cdolist_list_var.first();
        } 
        cdolist_list_var = event_variables;
        SubLObject variable = NIL;
        variable = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject group = reconstruct_quirk_event_from_variable(variable, variable_hash);
            if (NIL != group) {
                event_groups = cons(group, event_groups);
            }
            cdolist_list_var = cdolist_list_var.rest();
            variable = cdolist_list_var.first();
        } 
        return event_groups;
    }

    public static SubLObject compute_quirk_groups(final SubLObject contextualized_literals) {
        final SubLObject state_groups = compute_quirk_state_groups(contextualized_literals);
        final SubLObject event_groups = compute_quirk_event_groups(contextualized_literals);
        return append(state_groups, event_groups);
    }

    public static SubLObject build_subclause_specs_from_groups(final SubLObject groups, final SubLObject literals) {
        SubLObject subclause_specs = NIL;
        SubLObject cdolist_list_var = groups;
        SubLObject group = NIL;
        group = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject neglit_indices = NIL;
            SubLObject poslit_indices = NIL;
            SubLObject subclause_spec = NIL;
            SubLObject cdolist_list_var_$8 = group;
            SubLObject literal = NIL;
            literal = cdolist_list_var_$8.first();
            while (NIL != cdolist_list_var_$8) {
                final SubLObject literal_index = position(literal, literals, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                poslit_indices = cons(literal_index, poslit_indices);
                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                literal = cdolist_list_var_$8.first();
            } 
            subclause_spec = list(neglit_indices, poslit_indices);
            subclause_specs = cons(subclause_spec, subclause_specs);
            cdolist_list_var = cdolist_list_var.rest();
            group = cdolist_list_var.first();
        } 
        return subclause_specs;
    }

    public static SubLObject removal_quirk_guruqa_conjunctive_applicability(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $ask_quirkP$.getDynamicValue(thread)) {
            final SubLObject contextualized_literals = cadr(contextualized_dnf_clause);
            final SubLObject literals = Mapping.mapcar(symbol_function(CADR), contextualized_literals);
            final SubLObject groups = remove_if(symbol_function($sym59$SINGLETON_), compute_quirk_groups(contextualized_literals), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return build_subclause_specs_from_groups(groups, literals);
        }
        return NIL;
    }

    public static SubLObject removal_quirk_guruqa_conjunctive_cost(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return multiply($quirk_guruqa_cost$.getDynamicValue(thread), $float$0_9);
    }

    public static SubLObject map_make_quirk_guruqa_support(final SubLObject clause, final SubLObject ind) {
        SubLObject res = NIL;
        SubLObject cdolist_list_var = clause;
        SubLObject lit = NIL;
        lit = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            res = cons(list(make_quirk_guruqa_support(lit, ind)), res);
            cdolist_list_var = cdolist_list_var.rest();
            lit = cdolist_list_var.first();
        } 
        return nreverse(res);
    }

    public static SubLObject removal_quirk_guruqa_conjunctive_expand(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $ask_quirkP$.currentBinding(thread);
        try {
            $ask_quirkP$.bind(NIL, thread);
            final SubLObject asent = Mapping.mapcar(symbol_function(CADR), cadr(contextualized_dnf_clause));
            final SubLObject guruqa_query = external_interfaces.compute_guruqa_query(asent);
            final SubLObject guruqa_string = methods.funcall_instance_method_with_0_args(guruqa_query, TO_STRING);
            final SubLObject guruqa_ranked_weights = methods.funcall_instance_method_with_0_args(guruqa_query, RANKED_WEIGHT_LIST);
            final SubLObject indexes = external_interfaces.guruqa_answer_indexes(guruqa_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject top_indices = subseq(indexes, ZERO_INTEGER, $quirk_passages_num$.getDynamicValue(thread));
            final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
            SubLObject well_formed_query = NIL;
            format(T, $str61$_______A, asent);
            format(T, $str62$_______A, pph_question.generate_question(asent, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            final SubLObject _prev_bind_0_$9 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                well_formed_query = wff.query_okP(cycl_utilities.hl_to_el(cons($$and, asent)), UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$9, thread);
            }
            if (NIL != well_formed_query) {
                SubLObject cdolist_list_var = top_indices;
                SubLObject ind = NIL;
                ind = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject current;
                    final SubLObject datum = current = ind;
                    final SubLObject score_tail = property_list_member($SCORE, current);
                    final SubLObject score = (NIL != score_tail) ? cadr(score_tail) : NIL;
                    if (NIL != acceptable_score_for_guruqa_weights(score, guruqa_ranked_weights)) {
                        final SubLObject passage = index_retrieve_passage(ind);
                        final SubLObject passage_assignments = methods.funcall_instance_method_with_3_args(get_secretary(), ASK, cons($$and, asent), passage, mt);
                        format(T, $str16$______Index___S, ind);
                        format(T, $str17$_________________________________);
                        format(T, $str18$___S, passage);
                        format(T, $str17$_________________________________);
                        format(T, $str19$___secretary__S_found_bindings__S, new SubLObject[]{ get_secretary(), passage_assignments, mt });
                        SubLObject cdolist_list_var_$10 = passage_assignments;
                        SubLObject assignment = NIL;
                        assignment = cdolist_list_var_$10.first();
                        while (NIL != cdolist_list_var_$10) {
                            final SubLObject binding = instances.get_slot(assignment, BINDINGS);
                            final SubLObject v_answer = sublis(binding, asent, UNPROVIDED, UNPROVIDED);
                            inference_worker_removal.conjunctive_removal_callback(binding, map_make_quirk_guruqa_support(v_answer, ind));
                            cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                            assignment = cdolist_list_var_$10.first();
                        } 
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    ind = cdolist_list_var.first();
                } 
            } else {
                Errors.warn($str11$Not_well_formed___S_because__S, cons($$and, asent), wff.why_not_wff_ask(cycl_utilities.hl_to_el(cons($$and, asent)), UNPROVIDED, UNPROVIDED));
            }
        } finally {
            $ask_quirkP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject acceptable_score_for_guruqa_weights(final SubLObject score, final SubLObject guruqa_ranked_weights) {
        assert NIL != numberp(score) : "Types.numberp(score) " + "CommonSymbols.NIL != Types.numberp(score) " + score;
        assert NIL != consp(guruqa_ranked_weights) : "Types.consp(guruqa_ranked_weights) " + "CommonSymbols.NIL != Types.consp(guruqa_ranked_weights) " + guruqa_ranked_weights;
        final SubLObject len = length(guruqa_ranked_weights);
        final SubLObject significant_weights = list_utilities.first_n(ceiling(divide(len, TWO_INTEGER), UNPROVIDED), guruqa_ranked_weights);
        final SubLObject grace_score = apply(symbol_function($sym66$_), significant_weights);
        return numGE(score, grace_score);
    }

    public static SubLObject clear_ask_qaga_cached() {
        final SubLObject cs = $ask_qaga_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_ask_qaga_cached(final SubLObject query) {
        return memoization_state.caching_state_remove_function_results_with_args($ask_qaga_cached_caching_state$.getGlobalValue(), list(query), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ask_qaga_cached_internal(final SubLObject query) {
        return external_interfaces.ask_qaga(query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ask_qaga_cached(final SubLObject query) {
        SubLObject caching_state = $ask_qaga_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ASK_QAGA_CACHED, $ask_qaga_cached_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, query, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(ask_qaga_cached_internal(query)));
            memoization_state.caching_state_put(caching_state, query, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject removal_connecting_terms_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $connecting_terms_cost$.getDynamicValue(thread);
    }

    public static SubLObject connecting_terms(final SubLObject args) {
        return getf(ask_qaga_cached(args).first(), $AUGMENT, UNPROVIDED);
    }

    public static SubLObject hl_justify_qaga(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list25);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list25);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list25);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list25);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject answers = ask_qaga_cached(list(pph_main.generate_phrase(cycl_utilities.formula_arg1(literal, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), pph_main.generate_phrase(cycl_utilities.formula_arg2(literal, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
            SubLObject res = NIL;
            SubLObject cdolist_list_var = answers;
            SubLObject ans = NIL;
            ans = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                res = cons(assertions_high.create_gaf(list($$containsInfoStructure_CW, listS($$InstanceNamedFn, getf(ans, $DOCID, UNPROVIDED), $list74), getf(ans, $TEXT, UNPROVIDED)), mt, $FORWARD, enumeration_types.tv_truth(tv), enumeration_types.tv_strength(tv), NIL), res);
                cdolist_list_var = cdolist_list_var.rest();
                ans = cdolist_list_var.first();
            } 
            return reverse(res);
        }
        cdestructuring_bind_error(support, $list25);
        return NIL;
    }

    public static SubLObject clear_answer_question() {
        final SubLObject cs = $answer_question_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_answer_question(final SubLObject line) {
        return memoization_state.caching_state_remove_function_results_with_args($answer_question_caching_state$.getGlobalValue(), list(line), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject answer_question_internal(final SubLObject line) {
        final SubLObject q = question.new_question(line, UNPROVIDED, UNPROVIDED);
        return methods.funcall_instance_method_with_0_args(q, ANSWER);
    }

    public static SubLObject answer_question(final SubLObject line) {
        SubLObject caching_state = $answer_question_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ANSWER_QUESTION, $answer_question_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, line, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(answer_question_internal(line)));
            memoization_state.caching_state_put(caching_state, line, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject answer_text(final SubLObject v_answer) {
        return methods.funcall_instance_method_with_0_args(v_answer, GET_CONTENT);
    }

    public static SubLObject answer_justification_text(final SubLObject v_answer) {
        final SubLObject j = methods.funcall_instance_method_with_0_args(v_answer, JUSTIFY);
        return methods.funcall_instance_method_with_0_args(j, GET_CONTENT);
    }

    public static SubLObject hl_justify_text(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list25);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list25);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list25);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list25);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject answers = answer_question(pph_question.generate_question(cycl_utilities.formula_arg1(literal, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLObject res = NIL;
            SubLObject cdolist_list_var = answers;
            SubLObject ans = NIL;
            ans = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (answer_text(ans).equal(cycl_utilities.formula_arg2(literal, UNPROVIDED))) {
                    res = cons(assertions_high.create_gaf(list($$containsInfoStructure_CW, listS($$InstanceNamedFn, methods.funcall_instance_method_with_0_args(ans, JUSTIFY), $list74), answer_text(ans)), mt, $FORWARD, enumeration_types.tv_truth(tv), enumeration_types.tv_strength(tv), NIL), res);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ans = cdolist_list_var.first();
            } 
            return reverse(res);
        }
        cdestructuring_bind_error(support, $list25);
        return NIL;
    }

    public static SubLObject removal_quirk_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $ask_quirkP$.currentBinding(thread);
        try {
            $ask_quirkP$.bind(NIL, thread);
            final SubLObject closed_asent = parse_tree.quantify_existentially(asent, UNPROVIDED);
            final SubLObject question_string = pph_question.generate_question(closed_asent, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject answers = answer_question(question_string);
            final SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
            SubLObject cdolist_list_var = answers;
            SubLObject v_answer = NIL;
            v_answer = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                print(XXXXXXXXXXXXXXXXXXXXXX, UNPROVIDED);
                SubLObject ignore_errors_tag = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0_$11 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                        try {
                            SubLObject cdolist_list_var_$12;
                            final SubLObject parses = cdolist_list_var_$12 = cyclifier.cyclify(answer_justification_text(v_answer), UNPROVIDED);
                            SubLObject parse = NIL;
                            parse = cdolist_list_var_$12.first();
                            while (NIL != cdolist_list_var_$12) {
                                SubLObject cdolist_list_var_$13;
                                final SubLObject v_bindings = cdolist_list_var_$13 = inference_kernel.new_cyc_query(list($$implies, parse, asent), mt, $list92);
                                SubLObject binding = NIL;
                                binding = cdolist_list_var_$13.first();
                                while (NIL != cdolist_list_var_$13) {
                                    final SubLObject ans = sublis(binding, asent, UNPROVIDED, UNPROVIDED);
                                    if (NIL != quirk_relevant_literal(ans)) {
                                        backward.removal_add_node(make_quirk_support(ans), binding, UNPROVIDED);
                                    } else {
                                        format(T, $str21$__rejecting___A, v_answer);
                                    }
                                    cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                                    binding = cdolist_list_var_$13.first();
                                } 
                                cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                                parse = cdolist_list_var_$12.first();
                            } 
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$11, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                } finally {
                    thread.throwStack.pop();
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_answer = cdolist_list_var.first();
            } 
        } finally {
            $ask_quirkP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject make_quirk_support(final SubLObject ans) {
        return arguments.make_hl_support($QUIRK, ans, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject hl_justify_quirk(final SubLObject support) {
        SubLObject hl_module = NIL;
        SubLObject literal = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list25);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list25);
        literal = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list25);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list25);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject answers = answer_question(pph_question.generate_question(parse_tree.quantify_existentially(literal, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLObject res = NIL;
            SubLObject cdolist_list_var = answers;
            SubLObject ans = NIL;
            ans = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (answer_text(ans).equal(cycl_utilities.formula_arg2(literal, UNPROVIDED))) {
                    res = cons(assertions_high.create_gaf(list($$containsInfoStructure_CW, listS($$InstanceNamedFn, methods.funcall_instance_method_with_0_args(ans, JUSTIFY), $list74), answer_text(ans)), mt, $FORWARD, enumeration_types.tv_truth(tv), enumeration_types.tv_strength(tv), NIL), res);
                }
                cdolist_list_var = cdolist_list_var.rest();
                ans = cdolist_list_var.first();
            } 
            return reverse(res);
        }
        cdestructuring_bind_error(support, $list25);
        return NIL;
    }

    public static SubLObject removal_quirk_conjunctive_expand(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject conjunction_mt = NIL;
        SubLObject asents = NIL;
        SubLObject sense = $NEG;
        SubLObject index_var = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(contextualized_dnf_clause);
        SubLObject contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            destructuring_bind_must_consp(current, datum, $list98);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list98);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if ($POS == sense) {
                    asents = cons(asent, asents);
                    if (NIL == conjunction_mt) {
                        conjunction_mt = mt;
                    } else
                        if (NIL == hlmt.hlmt_equalP(mt, conjunction_mt)) {
                            Errors.error($str100$removal_quirk_conjunctive_expand_);
                        }

                }
            } else {
                cdestructuring_bind_error(datum, $list98);
            }
            index_var = add(index_var, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        sense = $POS;
        index_var = ZERO_INTEGER;
        cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
        contextualized_asent = NIL;
        contextualized_asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = contextualized_asent;
            SubLObject mt = NIL;
            SubLObject asent = NIL;
            destructuring_bind_must_consp(current, datum, $list98);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list98);
            asent = current.first();
            current = current.rest();
            if (NIL == current) {
                if ($POS == sense) {
                    asents = cons(asent, asents);
                    if (NIL == conjunction_mt) {
                        conjunction_mt = mt;
                    } else
                        if (NIL == hlmt.hlmt_equalP(mt, conjunction_mt)) {
                            Errors.error($str100$removal_quirk_conjunctive_expand_);
                        }

                }
            } else {
                cdestructuring_bind_error(datum, $list98);
            }
            index_var = add(index_var, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            contextualized_asent = cdolist_list_var.first();
        } 
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(conjunction_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject sentence = simplifier.conjoin(asents, UNPROVIDED);
            removal_quirk_expand(sentence, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject clear_get_word_graph_cached() {
        final SubLObject cs = $get_word_graph_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_word_graph_cached(final SubLObject query) {
        return memoization_state.caching_state_remove_function_results_with_args($get_word_graph_cached_caching_state$.getGlobalValue(), list(query), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_word_graph_cached_internal(final SubLObject query) {
        return external_interfaces.get_word_graph(query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_word_graph_cached(final SubLObject query) {
        SubLObject caching_state = $get_word_graph_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_WORD_GRAPH_CACHED, $get_word_graph_cached_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, query, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(get_word_graph_cached_internal(query)));
            memoization_state.caching_state_put(caching_state, query, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject assert_word_graph(final SubLObject query, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$TREC_Mt;
        }
        SubLObject cdolist_list_var;
        final SubLObject v_graph = cdolist_list_var = get_word_graph_cached(query);
        SubLObject nodes = NIL;
        nodes = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject node1 = nodes.first();
            SubLObject cdolist_list_var_$14 = nodes.rest();
            SubLObject node2 = NIL;
            node2 = cdolist_list_var_$14.first();
            while (NIL != cdolist_list_var_$14) {
                fi.fi_assert(list($$conceptuallyRelated, list($$WordFn, node1), list($$WordFn, node2)), mt, UNPROVIDED, UNPROVIDED);
                cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                node2 = cdolist_list_var_$14.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            nodes = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject clear_fully_connected_graph_links() {
        final SubLObject cs = $fully_connected_graph_links_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_fully_connected_graph_links(final SubLObject query_terms) {
        return memoization_state.caching_state_remove_function_results_with_args($fully_connected_graph_links_caching_state$.getGlobalValue(), list(query_terms), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject fully_connected_graph_links_internal(final SubLObject query_terms) {
        final SubLObject string_lists = external_interfaces.get_word_graph(query_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject graph_object = graph.make_graph_from_string_lists(string_lists);
        final SubLObject connecting_terms = methods.funcall_instance_method_with_1_args(graph_object, GET_PATH_LABELS, query_terms);
        final SubLObject filter = union(connecting_terms, query_terms, UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = string_lists;
        SubLObject nodes = NIL;
        nodes = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject out_node = nodes.first();
            if (NIL != subl_promotions.memberP(out_node, filter, UNPROVIDED, UNPROVIDED)) {
                SubLObject cdolist_list_var_$15 = nodes.rest();
                SubLObject in_node = NIL;
                in_node = cdolist_list_var_$15.first();
                while (NIL != cdolist_list_var_$15) {
                    if (NIL != subl_promotions.memberP(in_node, filter, UNPROVIDED, UNPROVIDED)) {
                        result = cons(list(out_node, in_node), result);
                    }
                    cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                    in_node = cdolist_list_var_$15.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            nodes = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject fully_connected_graph_links(final SubLObject query_terms) {
        SubLObject caching_state = $fully_connected_graph_links_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(FULLY_CONNECTED_GRAPH_LINKS, $fully_connected_graph_links_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, query_terms, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(fully_connected_graph_links_internal(query_terms)));
            memoization_state.caching_state_put(caching_state, query_terms, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_word_graph_links() {
        final SubLObject cs = $word_graph_links_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_word_graph_links(final SubLObject query) {
        return memoization_state.caching_state_remove_function_results_with_args($word_graph_links_caching_state$.getGlobalValue(), list(query), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject word_graph_links_internal(final SubLObject query) {
        final SubLObject v_graph = external_interfaces.get_word_graph(query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject res = NIL;
        SubLObject cdolist_list_var = v_graph;
        SubLObject nodes = NIL;
        nodes = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject node1 = nodes.first();
            SubLObject cdolist_list_var_$16 = nodes.rest();
            SubLObject node2 = NIL;
            node2 = cdolist_list_var_$16.first();
            while (NIL != cdolist_list_var_$16) {
                res = cons(list(node1, node2), res);
                cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                node2 = cdolist_list_var_$16.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            nodes = cdolist_list_var.first();
        } 
        return res;
    }

    public static SubLObject word_graph_links(final SubLObject query) {
        SubLObject caching_state = $word_graph_links_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(WORD_GRAPH_LINKS, $word_graph_links_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, query, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(word_graph_links_internal(query)));
            memoization_state.caching_state_put(caching_state, query, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_qaga_link_result() {
        final SubLObject cs = $qaga_link_result_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_qaga_link_result(final SubLObject result) {
        return memoization_state.caching_state_remove_function_results_with_args($qaga_link_result_caching_state$.getGlobalValue(), list(result), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject qaga_link_result_internal(final SubLObject result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        fi.fi_assert(result, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        return result;
    }

    public static SubLObject qaga_link_result(final SubLObject result) {
        SubLObject caching_state = $qaga_link_result_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(QAGA_LINK_RESULT, $qaga_link_result_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, result, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(qaga_link_result_internal(result)));
            memoization_state.caching_state_put(caching_state, result, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject declare_quirk_removal_module_file() {
        declareFunction(me, "get_secretary", "GET-SECRETARY", 0, 0, false);
        declareFunction(me, "secretary_class", "SECRETARY-CLASS", 1, 0, false);
        declareFunction(me, "get_sksi_enabled_predicates", "GET-SKSI-ENABLED-PREDICATES", 0, 0, false);
        declareFunction(me, "sksi_enabled_predicate_p", "SKSI-ENABLED-PREDICATE-P", 1, 0, false);
        declareFunction(me, "quirk_irrelevant_add", "QUIRK-IRRELEVANT-ADD", 1, 0, false);
        declareFunction(me, "quirk_irrelevant_remove", "QUIRK-IRRELEVANT-REMOVE", 1, 0, false);
        declareFunction(me, "quirk_irrelevant_term", "QUIRK-IRRELEVANT-TERM", 1, 0, false);
        declareFunction(me, "quirk_relevant_literal", "QUIRK-RELEVANT-LITERAL", 1, 0, false);
        declareFunction(me, "removal_quirk_guruqa_required", "REMOVAL-QUIRK-GURUQA-REQUIRED", 1, 1, false);
        new quirk_removal_module.$removal_quirk_guruqa_required$UnaryFunction();
        new quirk_removal_module.$removal_quirk_guruqa_required$BinaryFunction();
        declareFunction(me, "removal_quirk_guruqa_cost", "REMOVAL-QUIRK-GURUQA-COST", 1, 1, false);
        declareFunction(me, "index_retrieve_passage", "INDEX-RETRIEVE-PASSAGE", 1, 0, false);
        declareFunction(me, "removal_quirk_guruqa_expand", "REMOVAL-QUIRK-GURUQA-EXPAND", 1, 1, false);
        declareFunction(me, "make_quirk_guruqa_support", "MAKE-QUIRK-GURUQA-SUPPORT", 2, 0, false);
        declareFunction(me, "hl_justify_quirk_guruqa", "HL-JUSTIFY-QUIRK-GURUQA", 1, 0, false);
        declareFunction(me, "document_mt_coordinates", "DOCUMENT-MT-COORDINATES", 1, 0, false);
        declareFunction(me, "document_index_mt", "DOCUMENT-INDEX-MT", 1, 0, false);
        declareFunction(me, "ask_textually_justified", "ASK-TEXTUALLY-JUSTIFIED", 1, 5, false);
        declareFunction(me, "register_nima_sks", "REGISTER-NIMA-SKS", 0, 0, false);
        declareFunction(me, "register_usgs_sks", "REGISTER-USGS-SKS", 0, 0, false);
        declareFunction(me, "enable_quirk", "ENABLE-QUIRK", 0, 0, false);
        declareFunction(me, "disable_quirk", "DISABLE-QUIRK", 0, 0, false);
        declareFunction(me, "isa_actor_slotP", "ISA-ACTOR-SLOT?", 1, 1, false);
        declareFunction(me, "isa_taxonomic_slotP", "ISA-TAXONOMIC-SLOT?", 1, 1, false);
        declareFunction(me, "reconstruct_quirk_state_from_predicate_literal", "RECONSTRUCT-QUIRK-STATE-FROM-PREDICATE-LITERAL", 2, 0, false);
        declareFunction(me, "compute_quirk_state_groups", "COMPUTE-QUIRK-STATE-GROUPS", 1, 0, false);
        declareFunction(me, "reconstruct_quirk_event_from_variable", "RECONSTRUCT-QUIRK-EVENT-FROM-VARIABLE", 2, 0, false);
        declareFunction(me, "compute_quirk_event_groups", "COMPUTE-QUIRK-EVENT-GROUPS", 1, 0, false);
        declareFunction(me, "compute_quirk_groups", "COMPUTE-QUIRK-GROUPS", 1, 0, false);
        declareFunction(me, "build_subclause_specs_from_groups", "BUILD-SUBCLAUSE-SPECS-FROM-GROUPS", 2, 0, false);
        declareFunction(me, "removal_quirk_guruqa_conjunctive_applicability", "REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-APPLICABILITY", 1, 0, false);
        new quirk_removal_module.$removal_quirk_guruqa_conjunctive_applicability$UnaryFunction();
        declareFunction(me, "removal_quirk_guruqa_conjunctive_cost", "REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-COST", 1, 0, false);
        declareFunction(me, "map_make_quirk_guruqa_support", "MAP-MAKE-QUIRK-GURUQA-SUPPORT", 2, 0, false);
        declareFunction(me, "removal_quirk_guruqa_conjunctive_expand", "REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-EXPAND", 1, 0, false);
        declareFunction(me, "acceptable_score_for_guruqa_weights", "ACCEPTABLE-SCORE-FOR-GURUQA-WEIGHTS", 2, 0, false);
        declareFunction(me, "clear_ask_qaga_cached", "CLEAR-ASK-QAGA-CACHED", 0, 0, false);
        declareFunction(me, "remove_ask_qaga_cached", "REMOVE-ASK-QAGA-CACHED", 1, 0, false);
        declareFunction(me, "ask_qaga_cached_internal", "ASK-QAGA-CACHED-INTERNAL", 1, 0, false);
        declareFunction(me, "ask_qaga_cached", "ASK-QAGA-CACHED", 1, 0, false);
        declareFunction(me, "removal_connecting_terms_cost", "REMOVAL-CONNECTING-TERMS-COST", 1, 1, false);
        declareFunction(me, "connecting_terms", "CONNECTING-TERMS", 1, 0, false);
        declareFunction(me, "hl_justify_qaga", "HL-JUSTIFY-QAGA", 1, 0, false);
        declareFunction(me, "clear_answer_question", "CLEAR-ANSWER-QUESTION", 0, 0, false);
        declareFunction(me, "remove_answer_question", "REMOVE-ANSWER-QUESTION", 1, 0, false);
        declareFunction(me, "answer_question_internal", "ANSWER-QUESTION-INTERNAL", 1, 0, false);
        declareFunction(me, "answer_question", "ANSWER-QUESTION", 1, 0, false);
        declareFunction(me, "answer_text", "ANSWER-TEXT", 1, 0, false);
        declareFunction(me, "answer_justification_text", "ANSWER-JUSTIFICATION-TEXT", 1, 0, false);
        declareFunction(me, "hl_justify_text", "HL-JUSTIFY-TEXT", 1, 0, false);
        declareFunction(me, "removal_quirk_expand", "REMOVAL-QUIRK-EXPAND", 1, 1, false);
        declareFunction(me, "make_quirk_support", "MAKE-QUIRK-SUPPORT", 1, 0, false);
        declareFunction(me, "hl_justify_quirk", "HL-JUSTIFY-QUIRK", 1, 0, false);
        declareFunction(me, "removal_quirk_conjunctive_expand", "REMOVAL-QUIRK-CONJUNCTIVE-EXPAND", 1, 0, false);
        declareFunction(me, "clear_get_word_graph_cached", "CLEAR-GET-WORD-GRAPH-CACHED", 0, 0, false);
        declareFunction(me, "remove_get_word_graph_cached", "REMOVE-GET-WORD-GRAPH-CACHED", 1, 0, false);
        declareFunction(me, "get_word_graph_cached_internal", "GET-WORD-GRAPH-CACHED-INTERNAL", 1, 0, false);
        declareFunction(me, "get_word_graph_cached", "GET-WORD-GRAPH-CACHED", 1, 0, false);
        declareFunction(me, "assert_word_graph", "ASSERT-WORD-GRAPH", 1, 1, false);
        declareFunction(me, "clear_fully_connected_graph_links", "CLEAR-FULLY-CONNECTED-GRAPH-LINKS", 0, 0, false);
        declareFunction(me, "remove_fully_connected_graph_links", "REMOVE-FULLY-CONNECTED-GRAPH-LINKS", 1, 0, false);
        declareFunction(me, "fully_connected_graph_links_internal", "FULLY-CONNECTED-GRAPH-LINKS-INTERNAL", 1, 0, false);
        declareFunction(me, "fully_connected_graph_links", "FULLY-CONNECTED-GRAPH-LINKS", 1, 0, false);
        declareFunction(me, "clear_word_graph_links", "CLEAR-WORD-GRAPH-LINKS", 0, 0, false);
        declareFunction(me, "remove_word_graph_links", "REMOVE-WORD-GRAPH-LINKS", 1, 0, false);
        declareFunction(me, "word_graph_links_internal", "WORD-GRAPH-LINKS-INTERNAL", 1, 0, false);
        declareFunction(me, "word_graph_links", "WORD-GRAPH-LINKS", 1, 0, false);
        declareFunction(me, "clear_qaga_link_result", "CLEAR-QAGA-LINK-RESULT", 0, 0, false);
        declareFunction(me, "remove_qaga_link_result", "REMOVE-QAGA-LINK-RESULT", 1, 0, false);
        declareFunction(me, "qaga_link_result_internal", "QAGA-LINK-RESULT-INTERNAL", 1, 0, false);
        declareFunction(me, "qaga_link_result", "QAGA-LINK-RESULT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_quirk_removal_module_file() {
        defparameter("*TMP-RESULTS*", NIL);
        defparameter("*QUIRK-PASSAGES-NUM*", $int$50);
        defparameter("*SECRETARY-CLASS*", SECRETARY);
        defparameter("*SECRETARY*", NIL);
        defparameter("*QUIRK-GURUQA-COST*", TEN_INTEGER);
        defparameter("*QUIRK-TOPIC-MT*", $const2$UIA_OpenEndedConversation_DemoEnv);
        defvar("*QUIRK-IRRELEVANT-TERMS*", make_hash_table($int$64, symbol_function(EQUAL), UNPROVIDED));
        defconstant("*QUIRK-IRRELEVANT-COLLECTIONS*", $list4);
        defvar("*SKSI-ENABLED-PREDICATES*", NIL);
        defparameter("*CONNECTING-TERMS-COST*", TEN_INTEGER);
        deflexical("*ASK-QAGA-CACHED-CACHING-STATE*", NIL);
        deflexical("*ANSWER-QUESTION-CACHING-STATE*", NIL);
        deflexical("*GET-WORD-GRAPH-CACHED-CACHING-STATE*", NIL);
        deflexical("*FULLY-CONNECTED-GRAPH-LINKS-CACHING-STATE*", NIL);
        deflexical("*WORD-GRAPH-LINKS-CACHING-STATE*", NIL);
        deflexical("*QAGA-LINK-RESULT-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_quirk_removal_module_file() {
        inference_modules.inference_removal_module($REMOVAL_QUIRK_GURUQA, $list24);
        hl_supports.setup_hl_support_module($QUIRK_GURUQA, $list41);
        inference_modules.inference_conjunctive_removal_module($REMOVAL_QUIRK_GURUQA_CONJUNCTIVE, $list52);
        memoization_state.note_globally_cached_function(ASK_QAGA_CACHED);
        inference_modules.inference_removal_module($REMOVAL_CONNECTING_TERMS, $list71);
        hl_supports.setup_hl_support_module($QAGA, $list77);
        memoization_state.note_globally_cached_function(ANSWER_QUESTION);
        inference_modules.inference_removal_module($REMOVAL_TEXT_ANSWER, $list84);
        hl_supports.setup_hl_support_module($TEXT, $list85);
        inference_modules.inference_removal_module($REMOVAL_QUIRK_CYCLIFY, $list87);
        hl_supports.setup_hl_support_module($QUIRK, $list94);
        inference_modules.inference_conjunctive_removal_module($REMOVAL_QUIRK_CYCLIFY_CONJUNCTIVE, $list96);
        memoization_state.note_globally_cached_function(GET_WORD_GRAPH_CACHED);
        memoization_state.note_globally_cached_function(FULLY_CONNECTED_GRAPH_LINKS);
        memoization_state.note_globally_cached_function(WORD_GRAPH_LINKS);
        inference_modules.inference_removal_module($REMOVAL_QAGA_LINK_FOR, $list111);
        memoization_state.note_globally_cached_function(QAGA_LINK_RESULT);
        inference_modules.inference_removal_module($REMOVAL_QAGA_LINK_FOR_CURRIED, $list115);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_quirk_removal_module_file();
    }

    @Override
    public void initializeVariables() {
        init_quirk_removal_module_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_quirk_removal_module_file();
    }

    

    public static final class $removal_quirk_guruqa_required$UnaryFunction extends UnaryFunction {
        public $removal_quirk_guruqa_required$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-QUIRK-GURUQA-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_quirk_guruqa_required(arg1, quirk_removal_module.$removal_quirk_guruqa_required$UnaryFunction.UNPROVIDED);
        }
    }

    public static final class $removal_quirk_guruqa_required$BinaryFunction extends BinaryFunction {
        public $removal_quirk_guruqa_required$BinaryFunction() {
            super(extractFunctionNamed("REMOVAL-QUIRK-GURUQA-REQUIRED"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1, final SubLObject arg2) {
            return removal_quirk_guruqa_required(arg1, arg2);
        }
    }

    public static final class $removal_quirk_guruqa_conjunctive_applicability$UnaryFunction extends UnaryFunction {
        public $removal_quirk_guruqa_conjunctive_applicability$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-APPLICABILITY"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_quirk_guruqa_conjunctive_applicability(arg1);
        }
    }
}

/**
 * Total time: 436 ms
 */
