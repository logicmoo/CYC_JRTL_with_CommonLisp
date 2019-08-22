/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
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

import com.cyc.cycjava.cycl.V12;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      QUIRK-REMOVAL-MODULE
 * source file: /cyc/top/cycl/quirk/quirk-removal-module.lisp
 * created:     2019/07/03 17:39:00
 */
public final class quirk_removal_module extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new quirk_removal_module();

 public static final String myName = "com.cyc.cycjava.cycl.quirk.quirk_removal_module";


    // defparameter
    // Definitions
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $tmp_results$ = makeSymbol("*TMP-RESULTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $quirk_passages_num$ = makeSymbol("*QUIRK-PASSAGES-NUM*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $secretary_class$ = makeSymbol("*SECRETARY-CLASS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $secretary$ = makeSymbol("*SECRETARY*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $quirk_guruqa_cost$ = makeSymbol("*QUIRK-GURUQA-COST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $quirk_topic_mt$ = makeSymbol("*QUIRK-TOPIC-MT*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $quirk_irrelevant_terms$ = makeSymbol("*QUIRK-IRRELEVANT-TERMS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $quirk_irrelevant_collections$ = makeSymbol("*QUIRK-IRRELEVANT-COLLECTIONS*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $sksi_enabled_predicates$ = makeSymbol("*SKSI-ENABLED-PREDICATES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $connecting_terms_cost$ = makeSymbol("*CONNECTING-TERMS-COST*");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLSymbol SECRETARY = makeSymbol("SECRETARY");

    private static final SubLObject $const2$UIA_OpenEndedConversation_DemoEnv = reader_make_constant_shell("UIA-OpenEndedConversation-DemoEnvironmentMt");

    static private final SubLList $list4 = list(new SubLObject[]{ reader_make_constant_shell("QuirkIrrelevantTerm"), reader_make_constant_shell("ImplementationConstant"), reader_make_constant_shell("CoreConstant"), reader_make_constant_shell("NLTerm"), reader_make_constant_shell("MicrotheoryPredicate"), reader_make_constant_shell("Microtheory"), reader_make_constant_shell("CycLExpressionType"), reader_make_constant_shell("MicrotheoryType"), reader_make_constant_shell("RelationshipType"), reader_make_constant_shell("CollectionType"), reader_make_constant_shell("MetaRelation"), reader_make_constant_shell("VocabularyDefiningPredicate"), reader_make_constant_shell("KFDInternalKRTerm"), reader_make_constant_shell("SubcategorizationFrame"), reader_make_constant_shell("LinguisticObjectType"), reader_make_constant_shell("SKSIConstant"), reader_make_constant_shell("ExperimentalConstant"), reader_make_constant_shell("ActorSlot") });





    static private final SubLString $str8$_______A = makeString("~&??? ~A");

    private static final SubLSymbol GURUQA_RETRIEVE_PASSAGE = makeSymbol("GURUQA-RETRIEVE-PASSAGE");

    static private final SubLString $str11$Not_well_formed___S_because__S = makeString("Not well formed: ~S because ~S");

    private static final SubLSymbol RANKED_WEIGHT_LIST = makeSymbol("RANKED-WEIGHT-LIST");

    static private final SubLString $str16$______Index___S = makeString("~%~%~%Index: ~S");

    static private final SubLString $str17$_________________________________ = makeString("~%----------------------------------------------------------------------");

    static private final SubLString $str18$___S = makeString("~%~S");

    static private final SubLString $str19$___secretary__S_found_bindings__S = makeString("~% secretary ~S found bindings ~S in ~S");

    static private final SubLString $str21$__rejecting___A = makeString("~&rejecting: ~A");

    private static final SubLSymbol $REMOVAL_QUIRK_GURUQA = makeKeyword("REMOVAL-QUIRK-GURUQA");

    static private final SubLList $list24 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-QUIRK-GURUQA-REQUIRED"), $COST, makeSymbol("REMOVAL-QUIRK-GURUQA-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUIRK-GURUQA-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("ask guruqa"), makeKeyword("EXAMPLE"), makeString("<any-literal>") });

    static private final SubLList $list25 = list(makeSymbol("HL-MODULE"), makeSymbol("LITERAL"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLObject $$containsInfoStructure_CW = reader_make_constant_shell("containsInfoStructure-CW");

    private static final SubLObject $$TREC_Mt = reader_make_constant_shell("TREC-Mt");

    private static final SubLSymbol $sym29$_VAR1 = makeSymbol("?VAR1");

    private static final SubLSymbol $sym30$_VAR2 = makeSymbol("?VAR2");

    private static final SubLObject $const31$TextStringPropositionalExtraction = reader_make_constant_shell("TextStringPropositionalExtractionMtFn");









    private static final SubLObject $$CNS_Corpus = reader_make_constant_shell("CNS-Corpus");





    private static final SubLList $list41 = list(makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-QUIRK-GURUQA"));

    private static final SubLSymbol $MT_ASSERTS_SENTENCE = makeKeyword("MT-ASSERTS-SENTENCE");

    private static final SubLString $str43$_S_is_not_a_support_p = makeString("~S is not a support-p");

    private static final SubLObject $$NGA_Gns_KS = reader_make_constant_shell("NGA-Gns-KS");

    private static final SubLList $list45 = list(reader_make_constant_shell("MappingMtFn"), reader_make_constant_shell("NGA-KS"));

    private static final SubLObject $$Usgs_Gnis_KS = reader_make_constant_shell("Usgs-Gnis-KS");

    private static final SubLList $list47 = list(reader_make_constant_shell("MappingMtFn"), reader_make_constant_shell("Usgs-KS"));

    private static final SubLSymbol $REMOVAL_QUIRK_GURUQA_CONJUCTIVE = makeKeyword("REMOVAL-QUIRK-GURUQA-CONJUCTIVE");

    private static final SubLSymbol $REMOVAL_QUIRK_GURUQA_CONJUNCTIVE = makeKeyword("REMOVAL-QUIRK-GURUQA-CONJUNCTIVE");

    private static final SubLString $str50$QUIRK_enabled_ = makeString("QUIRK enabled!");

    private static final SubLString $str51$QUIRK_disabled_ = makeString("QUIRK disabled!");

    private static final SubLList $list52 = list(new SubLObject[]{ makeKeyword("EVERY-PREDICATES"), NIL, makeKeyword("APPLICABILITY"), makeSymbol("REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-APPLICABILITY"), $COST, makeSymbol("REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("submit an entire event structure to the QUIRK system\n    for simultaneous satisfaction"), makeKeyword("EXAMPLE"), makeString("(#$and (#$isa <event1> <EventType>)\n\t     (#$<actorSlot1> <event1> <actor1>)\n\t     (#$<actorSlot2> <event1> <actor2>)\n\t     ...)") });





    private static final SubLList $list55 = list(makeSymbol("MT"), makeSymbol("LITERAL"));





    private static final SubLSymbol $sym59$SINGLETON_ = makeSymbol("SINGLETON?");

    private static final SubLFloat $float$0_9 = makeDouble(0.9);

    static private final SubLString $str61$_______A = makeString("~%$$$ ~A");

    private static final SubLString $str62$_______A = makeString("~%### ~A");



    private static final SubLSymbol $sym66$_ = makeSymbol("+");

    private static final SubLSymbol ASK_QAGA_CACHED = makeSymbol("ASK-QAGA-CACHED");

    private static final SubLSymbol $ask_qaga_cached_caching_state$ = makeSymbol("*ASK-QAGA-CACHED-CACHING-STATE*");

    private static final SubLSymbol $REMOVAL_CONNECTING_TERMS = makeKeyword("REMOVAL-CONNECTING-TERMS");

    static private final SubLList $list71 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), $COST, makeSymbol("REMOVAL-CONNECTING-TERMS-COST"), makeKeyword("SUPPORT-MODULE"), $QAGA, makeKeyword("PREDICATE"), reader_make_constant_shell("connectingTerms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("connectingTerms"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("connectingTerms"), list($BIND, makeSymbol("TERM1")), list($BIND, makeSymbol("TERM2")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("TERM1")), list(makeKeyword("VALUE"), makeSymbol("TERM2")))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("MAPCAR"), makeSymbol("GENERATE-PHRASE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("STR1"), makeSymbol("STR2")), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("CONNECTING-TERMS"), list(list(makeKeyword("VALUE"), makeSymbol("STR1")), list(makeKeyword("VALUE"), makeSymbol("STR2")))))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("connectingTerms"), list(makeKeyword("VALUE"), makeSymbol("TERM1")), list(makeKeyword("VALUE"), makeSymbol("TERM2")), cons(reader_make_constant_shell("TheSet"), makeKeyword("INPUT"))), makeKeyword("DOCUMENTATION"), makeString("interface to the QAGA connecting terms functionality"), makeKeyword("EXAMPLE"), makeString("(#$connectingTerms \"valentina tereshkova\" \"astronaut sally ride\" (#$TheSet . ?X))") });



    static private final SubLList $list74 = list(reader_make_constant_shell("GraphicalStructure"));

    static private final SubLList $list77 = list(makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-QAGA"));

    private static final SubLSymbol ANSWER_QUESTION = makeSymbol("ANSWER-QUESTION");

    public static final SubLSymbol $answer_question_caching_state$ = makeSymbol("*ANSWER-QUESTION-CACHING-STATE*");

    private static final SubLSymbol JUSTIFY = makeSymbol("JUSTIFY");

    private static final SubLSymbol $REMOVAL_TEXT_ANSWER = makeKeyword("REMOVAL-TEXT-ANSWER");

    static private final SubLList $list84 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("SUPPORT-MODULE"), $TEXT, makeKeyword("PREDICATE"), reader_make_constant_shell("textAnswer"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("textAnswer"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("textAnswer"), list($BIND, makeSymbol("QUESTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("QUESTION"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("GENERATE-QUESTION"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("ANSWER-QUESTION"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list($CALL, makeSymbol("ANSWER-TEXT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("textAnswer"), list(makeKeyword("VALUE"), makeSymbol("QUESTION")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("run a query against the quirk-lite system"), makeKeyword("EXAMPLE"), makeString("(#$textAnswer \"Who is Havel\"  ?X)") });

    static private final SubLList $list85 = list(makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-TEXT"));

    private static final SubLSymbol $REMOVAL_QUIRK_CYCLIFY = makeKeyword("REMOVAL-QUIRK-CYCLIFY");

    static private final SubLList $list87 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-QUIRK-GURUQA-REQUIRED"), $COST, makeSymbol("REMOVAL-QUIRK-GURUQA-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUIRK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("run a CycL  query against the quirk-lite system"), makeKeyword("EXAMPLE"), makeString(" <Anything> ") });

    private static final SubLSymbol XXXXXXXXXXXXXXXXXXXXXX = makeSymbol("XXXXXXXXXXXXXXXXXXXXXX");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");



    static private final SubLList $list92 = list(makeKeyword("CONDITIONAL-SENTENCE?"), T);

    static private final SubLList $list94 = list(makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-QUIRK"));

    private static final SubLSymbol $REMOVAL_QUIRK_CYCLIFY_CONJUNCTIVE = makeKeyword("REMOVAL-QUIRK-CYCLIFY-CONJUNCTIVE");

    static private final SubLList $list96 = list(new SubLObject[]{ makeKeyword("EVERY-PREDICATES"), NIL, makeKeyword("APPLICABILITY"), makeSymbol("REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-APPLICABILITY"), $COST, makeSymbol("REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUIRK-CONJUNCTIVE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("submit an entire event structure to the QUIRK system\n    for simultaneous satisfaction"), makeKeyword("EXAMPLE"), makeString("(#$and (#$isa <event1> <EventType>)\n           (#$<actorSlot1> <event1> <actor1>)\n           (#$<actorSlot2> <event1> <actor2>)\n           ...)") });

    static private final SubLList $list98 = list(makeSymbol("MT"), makeSymbol("ASENT"));

    static private final SubLString $str100$removal_quirk_conjunctive_expand_ = makeString("removal-quirk-conjunctive-expand can't yet handle multiple mts in the conjunction");

    private static final SubLSymbol GET_WORD_GRAPH_CACHED = makeSymbol("GET-WORD-GRAPH-CACHED");

    public static final SubLSymbol $get_word_graph_cached_caching_state$ = makeSymbol("*GET-WORD-GRAPH-CACHED-CACHING-STATE*");





    private static final SubLSymbol FULLY_CONNECTED_GRAPH_LINKS = makeSymbol("FULLY-CONNECTED-GRAPH-LINKS");

    private static final SubLSymbol GET_PATH_LABELS = makeSymbol("GET-PATH-LABELS");

    public static final SubLSymbol $fully_connected_graph_links_caching_state$ = makeSymbol("*FULLY-CONNECTED-GRAPH-LINKS-CACHING-STATE*");

    private static final SubLSymbol WORD_GRAPH_LINKS = makeSymbol("WORD-GRAPH-LINKS");

    public static final SubLSymbol $word_graph_links_caching_state$ = makeSymbol("*WORD-GRAPH-LINKS-CACHING-STATE*");

    private static final SubLSymbol $REMOVAL_QAGA_LINK_FOR = makeKeyword("REMOVAL-QAGA-LINK-FOR");

    static private final SubLList $list111 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), $COST, makeSymbol("REMOVAL-CONNECTING-TERMS-COST"), makeKeyword("PREDICATE"), reader_make_constant_shell("QAGALinkFor"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("QAGALinkFor"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("QAGALinkFor"), list($BIND, makeSymbol("QUERY")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list($CALL, makeSymbol("CDR"), list(makeKeyword("VALUE"), makeSymbol("QUERY")))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("MAPCAR"), makeSymbol("GENERATE-PHRASE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("FULLY-CONNECTED-GRAPH-LINKS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("WORD1"), makeSymbol("WORD2")), list(reader_make_constant_shell("QAGALinkFor"), list(makeKeyword("VALUE"), makeSymbol("QUERY")), list(reader_make_constant_shell("WordFn"), list(makeKeyword("VALUE"), makeSymbol("WORD1"))), list(reader_make_constant_shell("WordFn"), list(makeKeyword("VALUE"), makeSymbol("WORD2"))))) });

    private static final SubLSymbol QAGA_LINK_RESULT = makeSymbol("QAGA-LINK-RESULT");

    public static final SubLSymbol $qaga_link_result_caching_state$ = makeSymbol("*QAGA-LINK-RESULT-CACHING-STATE*");

    private static final SubLSymbol $REMOVAL_QAGA_LINK_FOR_CURRIED = makeKeyword("REMOVAL-QAGA-LINK-FOR-CURRIED");

    static private final SubLList $list115 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), $COST, makeSymbol("REMOVAL-CONNECTING-TERMS-COST"), makeKeyword("REQUIRED-PATTERN"), list(list(reader_make_constant_shell("QAGALinkForCurried"), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(reader_make_constant_shell("QAGALinkForCurried"), list($BIND, makeSymbol("QUERY"))), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list($CALL, makeSymbol("CDR"), list(makeKeyword("VALUE"), makeSymbol("QUERY")))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("MAPCAR"), makeSymbol("GENERATE-PHRASE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("FULLY-CONNECTED-GRAPH-LINKS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("WORD1"), makeSymbol("WORD2")), list($CALL, makeSymbol("QAGA-LINK-RESULT"), list(list(reader_make_constant_shell("QAGALinkForCurried"), list(makeKeyword("VALUE"), makeSymbol("QUERY"))), list(reader_make_constant_shell("WordFn"), list(makeKeyword("VALUE"), makeSymbol("WORD1"))), list(reader_make_constant_shell("WordFn"), list(makeKeyword("VALUE"), makeSymbol("WORD2")))))) });

    public static final SubLObject get_secretary_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $secretary$.getDynamicValue(thread)) {
                $secretary$.setDynamicValue(object.new_class_instance($secretary_class$.getDynamicValue(thread)), thread);
            }
            return $secretary$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_secretary() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $secretary$.getDynamicValue(thread)) {
            $secretary$.setDynamicValue(object.new_class_instance($secretary_class$.getDynamicValue(thread)), thread);
        }
        return $secretary$.getDynamicValue(thread);
    }

    public static final SubLObject secretary_class_alt(SubLObject v_class) {
        $secretary_class$.setDynamicValue(v_class);
        $secretary$.setDynamicValue(NIL);
        return com.cyc.cycjava.cycl.quirk.quirk_removal_module.get_secretary();
    }

    public static SubLObject secretary_class(final SubLObject v_class) {
        $secretary_class$.setDynamicValue(v_class);
        $secretary$.setDynamicValue(NIL);
        return get_secretary();
    }

    public static final SubLObject get_sksi_enabled_predicates_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $sksi_enabled_predicates$.getDynamicValue(thread)) {
                {
                    SubLObject assertions = NIL;
                    SubLObject predicates = NIL;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            assertions = kb_mapping.gather_predicate_extent_index($$meaningSentenceOfSchema, UNPROVIDED, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = assertions;
                        SubLObject ass = NIL;
                        for (ass = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ass = cdolist_list_var.first()) {
                            {
                                SubLObject formula = cycl_utilities.formula_arg2(assertions_high.assertion_formula(ass), UNPROVIDED);
                                SubLObject pred = cycl_utilities.formula_arg0(formula);
                                SubLObject item_var = pred;
                                if (NIL == member(item_var, predicates, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    predicates = cons(item_var, predicates);
                                }
                            }
                        }
                    }
                    $sksi_enabled_predicates$.setDynamicValue(predicates, thread);
                }
            }
            return $sksi_enabled_predicates$.getDynamicValue(thread);
        }
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

    public static final SubLObject sksi_enabled_predicate_p_alt(SubLObject pred) {
        return member(pred, com.cyc.cycjava.cycl.quirk.quirk_removal_module.get_sksi_enabled_predicates(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sksi_enabled_predicate_p(final SubLObject pred) {
        return member(pred, get_sksi_enabled_predicates(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject quirk_irrelevant_add_alt(SubLObject cyc_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sethash(cyc_term, $quirk_irrelevant_terms$.getDynamicValue(thread), T);
            return T;
        }
    }

    public static SubLObject quirk_irrelevant_add(final SubLObject cyc_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash(cyc_term, $quirk_irrelevant_terms$.getDynamicValue(thread), T);
        return T;
    }

    public static final SubLObject quirk_irrelevant_remove_alt(SubLObject cyc_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            remhash(cyc_term, $quirk_irrelevant_terms$.getDynamicValue(thread));
            return T;
        }
    }

    public static SubLObject quirk_irrelevant_remove(final SubLObject cyc_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        remhash(cyc_term, $quirk_irrelevant_terms$.getDynamicValue(thread));
        return T;
    }

    public static final SubLObject quirk_irrelevant_term_alt(SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != gethash(v_term, $quirk_irrelevant_terms$.getDynamicValue(thread), UNPROVIDED)) {
                return T;
            } else {
                {
                    SubLObject irrelevant = NIL;
                    if (NIL == irrelevant) {
                        {
                            SubLObject csome_list_var = $quirk_irrelevant_collections$.getGlobalValue();
                            SubLObject coll = NIL;
                            for (coll = csome_list_var.first(); !((NIL != irrelevant) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , coll = csome_list_var.first()) {
                                if (NIL != isa.isa_in_any_mtP(v_term, coll)) {
                                    com.cyc.cycjava.cycl.quirk.quirk_removal_module.quirk_irrelevant_add(v_term);
                                    irrelevant = T;
                                }
                            }
                        }
                    }
                    return irrelevant;
                }
            }
        }
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

    /**
     *
     *
     * @param literal;
     * 		a LITERAL
     * @return boolean; T if literal is of interest to QUIRK, NIL otherwise.
     */
    @LispMethod(comment = "@param literal;\r\n\t\ta LITERAL\r\n@return boolean; T if literal is of interest to QUIRK, NIL otherwise.")
    public static final SubLObject quirk_relevant_literal_alt(SubLObject literal) {
        {
            SubLObject fail = NIL;
            if (NIL == fail) {
                {
                    SubLObject csome_list_var = literal;
                    SubLObject v_term = NIL;
                    for (v_term = csome_list_var.first(); !((NIL != fail) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_term = csome_list_var.first()) {
                        if (NIL != com.cyc.cycjava.cycl.quirk.quirk_removal_module.quirk_irrelevant_term(v_term)) {
                            fail = v_term;
                        }
                    }
                }
            }
            if (NIL == fail) {
                format(T, $str_alt8$_______A, literal);
            }
            return makeBoolean(NIL == fail);
        }
    }

    /**
     *
     *
     * @param literal;
     * 		a LITERAL
     * @return boolean; T if literal is of interest to QUIRK, NIL otherwise.
     */
    @LispMethod(comment = "@param literal;\r\n\t\ta LITERAL\r\n@return boolean; T if literal is of interest to QUIRK, NIL otherwise.")
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

    public static final SubLObject removal_quirk_guruqa_required_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean((NIL != $ask_quirkP$.getDynamicValue(thread)) && (NIL != com.cyc.cycjava.cycl.quirk.quirk_removal_module.quirk_relevant_literal(asent)));
        }
    }

    public static SubLObject removal_quirk_guruqa_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != $ask_quirkP$.getDynamicValue(thread)) && (NIL != quirk_relevant_literal(asent)));
    }

    public static final SubLObject removal_quirk_guruqa_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject pred = cycl_utilities.formula_arg0(asent);
                if (NIL != com.cyc.cycjava.cycl.quirk.quirk_removal_module.sksi_enabled_predicate_p(pred)) {
                    return multiply($int$100, $quirk_guruqa_cost$.getDynamicValue(thread));
                } else {
                    return $quirk_guruqa_cost$.getDynamicValue(thread);
                }
            }
        }
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

    public static final SubLObject index_retrieve_passage_alt(SubLObject index) {
        return apply(symbol_function(GURUQA_RETRIEVE_PASSAGE), external_interfaces.guruqa_answer_coordinates(index));
    }

    public static SubLObject index_retrieve_passage(final SubLObject index) {
        return apply(symbol_function(GURUQA_RETRIEVE_PASSAGE), external_interfaces.guruqa_answer_coordinates(index));
    }

    public static final SubLObject removal_quirk_guruqa_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject well_formed_query = NIL;
                well_formed_query = wff.query_okP(cycl_utilities.hl_to_el(asent), UNPROVIDED);
                if (NIL == well_formed_query) {
                    Errors.warn($str_alt11$Not_well_formed___S_because__S, asent, wff.why_not_wff_ask(cycl_utilities.hl_to_el(asent), UNPROVIDED, UNPROVIDED));
                }
            }
            {
                SubLObject _prev_bind_0 = $ask_quirkP$.currentBinding(thread);
                try {
                    $ask_quirkP$.bind(NIL, thread);
                    {
                        SubLObject guruqa_query = external_interfaces.compute_guruqa_query(asent);
                        SubLObject guruqa_string = methods.funcall_instance_method_with_0_args(guruqa_query, TO_STRING);
                        SubLObject guruqa_ranked_weights = methods.funcall_instance_method_with_0_args(guruqa_query, RANKED_WEIGHT_LIST);
                        SubLObject indexes = external_interfaces.guruqa_answer_indexes(guruqa_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject top_indices = subseq(indexes, ZERO_INTEGER, $quirk_passages_num$.getDynamicValue(thread));
                        SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                        SubLObject cdolist_list_var = top_indices;
                        SubLObject ind = NIL;
                        for (ind = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ind = cdolist_list_var.first()) {
                            {
                                SubLObject datum = ind;
                                SubLObject current = datum;
                                SubLObject score_tail = property_list_member($SCORE, current);
                                SubLObject score = (NIL != score_tail) ? ((SubLObject) (cadr(score_tail))) : NIL;
                                if (NIL != com.cyc.cycjava.cycl.quirk.quirk_removal_module.acceptable_score_for_guruqa_weights(score, guruqa_ranked_weights)) {
                                    {
                                        SubLObject passage = com.cyc.cycjava.cycl.quirk.quirk_removal_module.index_retrieve_passage(ind);
                                        SubLObject passage_assignments = methods.funcall_instance_method_with_3_args(com.cyc.cycjava.cycl.quirk.quirk_removal_module.get_secretary(), ASK, asent, passage, mt);
                                        format(T, $str_alt16$______Index___S, ind);
                                        format(T, $str_alt17$_________________________________);
                                        format(T, $str_alt18$___S, passage);
                                        format(T, $str_alt17$_________________________________);
                                        format(T, $str_alt19$___secretary__S_found_bindings__S, new SubLObject[]{ com.cyc.cycjava.cycl.quirk.quirk_removal_module.get_secretary(), passage_assignments, mt });
                                        {
                                            SubLObject cdolist_list_var_1 = passage_assignments;
                                            SubLObject assignment = NIL;
                                            for (assignment = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , assignment = cdolist_list_var_1.first()) {
                                                {
                                                    SubLObject binding = instances.get_slot(assignment, BINDINGS);
                                                    SubLObject v_answer = sublis(binding, asent, UNPROVIDED, UNPROVIDED);
                                                    if (NIL != com.cyc.cycjava.cycl.quirk.quirk_removal_module.quirk_relevant_literal(v_answer)) {
                                                        backward.removal_add_node(com.cyc.cycjava.cycl.quirk.quirk_removal_module.make_quirk_guruqa_support(v_answer, ind), binding, UNPROVIDED);
                                                    } else {
                                                        format(T, $str_alt21$__rejecting___A, v_answer);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } finally {
                    $ask_quirkP$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
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

    public static final SubLObject make_quirk_guruqa_support_alt(SubLObject support_formula, SubLObject ind) {
        return arguments.make_hl_support($QUIRK_GURUQA, support_formula, com.cyc.cycjava.cycl.quirk.quirk_removal_module.document_index_mt(ind), UNPROVIDED);
    }

    public static SubLObject make_quirk_guruqa_support(final SubLObject support_formula, final SubLObject ind) {
        return arguments.make_hl_support($QUIRK_GURUQA, support_formula, document_index_mt(ind), UNPROVIDED);
    }

    public static final SubLObject hl_justify_quirk_guruqa_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt25);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt25);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt25);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt25);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject mt2 = narts_high.nart_el_formula(mt);
                    SubLObject passage = apply(symbol_function(GURUQA_RETRIEVE_PASSAGE), com.cyc.cycjava.cycl.quirk.quirk_removal_module.document_mt_coordinates(mt2));
                    return list(assertions_high.create_gaf(list($$containsInfoStructure_CW, list_utilities.cadddr(mt2), passage), $$TREC_Mt, UNPROVIDED));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt25);
            }
        }
        return NIL;
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

    public static final SubLObject document_mt_coordinates_alt(SubLObject mt) {
        {
            SubLObject doc_var = variables.hl_var_for_default_el_var($sym28$_VAR1);
            SubLObject sent_var = variables.hl_var_for_default_el_var($sym29$_VAR2);
            SubLObject binding = unification.unify(mt, list($const30$TextStringPropositionalExtraction, $$DependencyParser, $$DependencyParserDefaultSetting, list($$DocumentSentenceFn, list($$CorpusDocumentFn, $$CNS_Corpus, list($$DocumentNumberFn, doc_var)), list($$SentenceNumberFn, sent_var))), UNPROVIDED, UNPROVIDED);
            SubLObject doc = assoc(doc_var, binding, symbol_function(EQUALP), UNPROVIDED).rest();
            SubLObject sent = assoc(sent_var, binding, symbol_function(EQUALP), UNPROVIDED).rest();
            return list(doc, sent);
        }
    }

    public static SubLObject document_mt_coordinates(final SubLObject mt) {
        final SubLObject doc_var = variables.hl_var_for_default_el_var($sym29$_VAR1);
        final SubLObject sent_var = variables.hl_var_for_default_el_var($sym30$_VAR2);
        final SubLObject binding = unification.unify(mt, list($const31$TextStringPropositionalExtraction, $$DependencyParser, $$DependencyParserDefaultSetting, list($$DocumentSentenceFn, list($$CorpusDocumentFn, $$CNS_Corpus, list($$DocumentNumberFn, doc_var)), list($$SentenceNumberFn, sent_var))), UNPROVIDED, UNPROVIDED);
        final SubLObject doc = assoc(doc_var, binding, symbol_function(EQUALP), UNPROVIDED).rest();
        final SubLObject sent = assoc(sent_var, binding, symbol_function(EQUALP), UNPROVIDED).rest();
        return list(doc, sent);
    }

    public static final SubLObject document_index_mt_alt(SubLObject index) {
        {
            SubLObject datum = index;
            SubLObject current = datum;
            SubLObject doc_tail = property_list_member($DOC, current);
            SubLObject doc = (NIL != doc_tail) ? ((SubLObject) (cadr(doc_tail))) : NIL;
            SubLObject sent_tail = property_list_member($SENT, current);
            SubLObject sent = (NIL != sent_tail) ? ((SubLObject) (cadr(sent_tail))) : NIL;
            return czer_main.cyc_find_or_create_nart(list($const30$TextStringPropositionalExtraction, $$DependencyParser, $$DependencyParserDefaultSetting, list($$DocumentSentenceFn, list($$CorpusDocumentFn, $$CNS_Corpus, list($$DocumentNumberFn, doc)), list($$SentenceNumberFn, sent))), UNPROVIDED);
        }
    }

    public static SubLObject document_index_mt(final SubLObject index) {
        final SubLObject doc_tail = property_list_member($DOC, index);
        final SubLObject doc = (NIL != doc_tail) ? cadr(doc_tail) : NIL;
        final SubLObject sent_tail = property_list_member($SENT, index);
        final SubLObject sent = (NIL != sent_tail) ? cadr(sent_tail) : NIL;
        return czer_main.cyc_find_or_create_nart(list($const31$TextStringPropositionalExtraction, $$DependencyParser, $$DependencyParserDefaultSetting, list($$DocumentSentenceFn, list($$CorpusDocumentFn, $$CNS_Corpus, list($$DocumentNumberFn, doc)), list($$SentenceNumberFn, sent))), UNPROVIDED);
    }

    public static final SubLObject ask_textually_justified_alt(SubLObject formula, SubLObject mt, SubLObject backchain, SubLObject number, SubLObject time, SubLObject depth) {
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
        {
            SubLObject answers = ask_utilities.ask_justified(formula, mt, backchain, number, time, depth);
            SubLObject res = NIL;
            SubLObject cdolist_list_var = answers;
            SubLObject ans = NIL;
            for (ans = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ans = cdolist_list_var.first()) {
                {
                    SubLObject resn = NIL;
                    SubLObject cdolist_list_var_2 = ans.rest();
                    SubLObject just = NIL;
                    for (just = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , just = cdolist_list_var_2.first()) {
                        {
                            SubLObject resjust = NIL;
                            SubLObject cdolist_list_var_3 = just;
                            SubLObject supp = NIL;
                            for (supp = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , supp = cdolist_list_var_3.first()) {
                                if (NIL != arguments.hl_support_p(supp)) {
                                    if (supp.first() == $QUIRK_GURUQA) {
                                        resjust = cons(assertions_high.assertion_formula(hl_supports.hl_justify(supp).first()), resjust);
                                    } else {
                                        resjust = cons(list($MT_ASSERTS_SENTENCE, list_utilities.caddr(supp), pph_main.generate_phrase(cadr(supp), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), list_utilities.cadddr(supp)), resjust);
                                    }
                                } else {
                                    if (NIL != assertion_handles.assertion_p(supp)) {
                                        resjust = cons(list($MT_ASSERTS_SENTENCE, assertions_high.assertion_mt(supp), pph_main.generate_phrase(supp, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), assertions_high.cyc_assertion_tv(supp)), resjust);
                                    } else {
                                        Errors.error($str_alt42$_S_is_not_a_support_p, supp);
                                    }
                                }
                            }
                            resjust = cons(ans.first(), resjust);
                            resn = cons(resjust, resn);
                        }
                    }
                    res = cons(resn, res);
                }
            }
            return res;
        }
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

    public static final SubLObject register_nima_sks_alt() {
        sksi_removal_module_generation.register_sksi_removal_modules_for_sks($$NGA_Gns_KS, narts_high.find_nart($list_alt44), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject register_nima_sks() {
        sksi_removal_module_generation.register_sksi_removal_modules_for_sks($$NGA_Gns_KS, narts_high.find_nart($list45), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject register_usgs_sks_alt() {
        sksi_removal_module_generation.register_sksi_removal_modules_for_sks($$Usgs_Gnis_KS, narts_high.find_nart($list_alt46), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject register_usgs_sks() {
        sksi_removal_module_generation.register_sksi_removal_modules_for_sks($$Usgs_Gnis_KS, narts_high.find_nart($list47), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static final SubLObject enable_quirk_alt() {
        $ask_quirkP$.setDynamicValue(T);
        inference_modules.undeclare_inference_conjunctive_removal_module($REMOVAL_QUIRK_GURUQA);
        inference_modules.undeclare_inference_conjunctive_removal_module($REMOVAL_QUIRK_GURUQA_CONJUCTIVE);
        inference_modules.undeclare_inference_conjunctive_removal_module($REMOVAL_QUIRK_GURUQA_CONJUNCTIVE);
        format(T, $str_alt49$QUIRK_enabled_);
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

    public static final SubLObject disable_quirk_alt() {
        sksi_removal_module_generation.deregister_all_sksi_removal_modules();
        $ask_quirkP$.setDynamicValue(NIL);
        format(T, $str_alt50$QUIRK_disabled_);
        return NIL;
    }

    public static SubLObject disable_quirk() {
        sksi_removal_module_generation.deregister_all_sksi_removal_modules();
        $ask_quirkP$.setDynamicValue(NIL);
        format(T, $str51$QUIRK_disabled_);
        return NIL;
    }

    public static final SubLObject isa_actor_slotP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return isa.isaP(v_term, $$ActorSlot, mt, UNPROVIDED);
    }

    public static SubLObject isa_actor_slotP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return isa.isaP(v_term, $$ActorSlot, mt, UNPROVIDED);
    }

    public static final SubLObject isa_taxonomic_slotP_alt(SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return isa.isaP(v_term, $$TaxonomicSlot, mt, UNPROVIDED);
    }

    public static SubLObject isa_taxonomic_slotP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        return isa.isaP(v_term, $$TaxonomicSlot, mt, UNPROVIDED);
    }

    public static final SubLObject reconstruct_quirk_state_from_predicate_literal_alt(SubLObject predicate_literal, SubLObject var_lit_hash) {
        {
            SubLObject state_literals = list(predicate_literal);
            SubLObject args = predicate_literal.rest();
            SubLObject cdolist_list_var = args;
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                {
                    SubLObject arg_literals = gethash(arg, var_lit_hash, UNPROVIDED);
                    SubLObject cdolist_list_var_4 = arg_literals;
                    SubLObject arg_literal = NIL;
                    for (arg_literal = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , arg_literal = cdolist_list_var_4.first()) {
                        if ((NIL != com.cyc.cycjava.cycl.quirk.quirk_removal_module.isa_taxonomic_slotP(arg_literal.first(), UNPROVIDED)) && (NIL != forts.fort_p(third(arg_literal)))) {
                            state_literals = cons(arg_literal, state_literals);
                        }
                    }
                }
            }
            return state_literals;
        }
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

    /**
     *
     *
     * @param CONTEXTUALIZED-LITERALS,
     * 		listp, a list of (mt literal) pairs
     * @return listp; a list of lists of literals. Each element of the list
    represents a group of literals that ought to be dealt together by the
    QUIRK module because they collectively refer to a relationship between/among
    some entities plus all the type constraints that apply to those entities.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param CONTEXTUALIZED-LITERALS,\r\n\t\tlistp, a list of (mt literal) pairs\r\n@return listp; a list of lists of literals. Each element of the list\r\nrepresents a group of literals that ought to be dealt together by the\r\nQUIRK module because they collectively refer to a relationship between/among\r\nsome entities plus all the type constraints that apply to those entities.\r\n@unknown bertolo")
    public static final SubLObject compute_quirk_state_groups_alt(SubLObject contextualized_literals) {
        {
            SubLObject state_literals = NIL;
            SubLObject variable_hash = make_hash_table(FOUR_INTEGER, UNPROVIDED, UNPROVIDED);
            SubLObject state_groups = NIL;
            {
                SubLObject cdolist_list_var = contextualized_literals;
                SubLObject ctx_literal = NIL;
                for (ctx_literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ctx_literal = cdolist_list_var.first()) {
                    {
                        SubLObject datum = ctx_literal;
                        SubLObject current = datum;
                        SubLObject mt = NIL;
                        SubLObject literal = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt54);
                        mt = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt54);
                        literal = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject pred = literal.first();
                                SubLObject args = literal.rest();
                                if (!((((NIL != com.cyc.cycjava.cycl.quirk.quirk_removal_module.isa_taxonomic_slotP(pred, mt)) || (NIL != com.cyc.cycjava.cycl.quirk.quirk_removal_module.isa_actor_slotP(pred, mt))) || (NIL != cycl_variables.hl_varP(pred))) || (NIL != cycl_variables.el_varP(pred)))) {
                                    state_literals = cons(literal, state_literals);
                                }
                                {
                                    SubLObject cdolist_list_var_5 = args;
                                    SubLObject arg = NIL;
                                    for (arg = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , arg = cdolist_list_var_5.first()) {
                                        if ((NIL != cycl_variables.hl_varP(arg)) || (NIL != cycl_variables.el_varP(arg))) {
                                            sethash(arg, variable_hash, cons(literal, gethash(arg, variable_hash, UNPROVIDED)));
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt54);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = state_literals;
                SubLObject state_literal = NIL;
                for (state_literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , state_literal = cdolist_list_var.first()) {
                    {
                        SubLObject group = com.cyc.cycjava.cycl.quirk.quirk_removal_module.reconstruct_quirk_state_from_predicate_literal(state_literal, variable_hash);
                        if (NIL != group) {
                            state_groups = cons(group, state_groups);
                        }
                    }
                }
            }
            return state_groups;
        }
    }

    /**
     *
     *
     * @param CONTEXTUALIZED-LITERALS,
     * 		listp, a list of (mt literal) pairs
     * @return listp; a list of lists of literals. Each element of the list
    represents a group of literals that ought to be dealt together by the
    QUIRK module because they collectively refer to a relationship between/among
    some entities plus all the type constraints that apply to those entities.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param CONTEXTUALIZED-LITERALS,\r\n\t\tlistp, a list of (mt literal) pairs\r\n@return listp; a list of lists of literals. Each element of the list\r\nrepresents a group of literals that ought to be dealt together by the\r\nQUIRK module because they collectively refer to a relationship between/among\r\nsome entities plus all the type constraints that apply to those entities.\r\n@unknown bertolo")
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

    public static final SubLObject reconstruct_quirk_event_from_variable_alt(SubLObject variable, SubLObject var_lit_hash) {
        {
            SubLObject variable_literals = gethash(variable, var_lit_hash, UNPROVIDED);
            SubLObject actor_variables = NIL;
            SubLObject event_literals = NIL;
            {
                SubLObject cdolist_list_var = variable_literals;
                SubLObject literal = NIL;
                for (literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , literal = cdolist_list_var.first()) {
                    if (literal.first().eql($$isa) && (NIL != genls.genl_in_any_mtP(third(literal), $$Event))) {
                        event_literals = cons(literal, event_literals);
                    } else {
                        if ((NIL != com.cyc.cycjava.cycl.quirk.quirk_removal_module.isa_actor_slotP(literal.first(), UNPROVIDED)) && variable.eql(second(literal))) {
                            {
                                SubLObject actor = second(literal);
                                if ((NIL != cycl_variables.hl_varP(actor)) || (NIL != cycl_variables.el_varP(actor))) {
                                    actor_variables = cons(actor, actor_variables);
                                }
                            }
                            {
                                SubLObject item_var = literal;
                                if (NIL == member(item_var, event_literals, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                                    event_literals = cons(item_var, event_literals);
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = actor_variables;
                SubLObject var = NIL;
                for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                    {
                        SubLObject actor_variable_literals = gethash(var, var_lit_hash, UNPROVIDED);
                        SubLObject cdolist_list_var_6 = actor_variable_literals;
                        SubLObject literal = NIL;
                        for (literal = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , literal = cdolist_list_var_6.first()) {
                            if (literal.first().eql($$isa) && (NIL != forts.fort_p(third(literal)))) {
                                {
                                    SubLObject item_var = literal;
                                    if (NIL == member(item_var, event_literals, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                                        event_literals = cons(item_var, event_literals);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return event_literals;
        }
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

    /**
     *
     *
     * @param CONTEXTUALIZED-LITERALS,
     * 		listp, a list of (mt literal) pairs
     * @return listp; a list of lists of literals. Each element of the list
    represents a group of literals that ought to be dealt together by the
    QUIRK module because they collectively describe the same event.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param CONTEXTUALIZED-LITERALS,\r\n\t\tlistp, a list of (mt literal) pairs\r\n@return listp; a list of lists of literals. Each element of the list\r\nrepresents a group of literals that ought to be dealt together by the\r\nQUIRK module because they collectively describe the same event.\r\n@unknown bertolo")
    public static final SubLObject compute_quirk_event_groups_alt(SubLObject contextualized_literals) {
        {
            SubLObject event_variables = NIL;
            SubLObject event_groups = NIL;
            SubLObject decontextualized_literals = NIL;
            SubLObject variable_hash = make_hash_table(FOUR_INTEGER, UNPROVIDED, UNPROVIDED);
            {
                SubLObject cdolist_list_var = contextualized_literals;
                SubLObject ctx_literal = NIL;
                for (ctx_literal = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ctx_literal = cdolist_list_var.first()) {
                    {
                        SubLObject datum = ctx_literal;
                        SubLObject current = datum;
                        SubLObject mt = NIL;
                        SubLObject literal = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt54);
                        mt = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt54);
                        literal = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            decontextualized_literals = cons(literal, decontextualized_literals);
                            {
                                SubLObject cdolist_list_var_7 = literal;
                                SubLObject arg = NIL;
                                for (arg = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , arg = cdolist_list_var_7.first()) {
                                    if ((NIL != cycl_variables.hl_varP(arg)) || (NIL != cycl_variables.el_varP(arg))) {
                                        {
                                            SubLObject item_var = literal;
                                            if (NIL == member(item_var, gethash(arg, variable_hash, UNPROVIDED), symbol_function(EQUALP), symbol_function(IDENTITY))) {
                                                sethash(arg, variable_hash, cons(item_var, gethash(arg, variable_hash, UNPROVIDED)));
                                            }
                                        }
                                    }
                                }
                            }
                            if ((literal.first().eql($$isa) && (NIL != term.el_fort_p(third(literal)))) && (NIL != genls.genl_in_any_mtP(third(literal), $$Event))) {
                                {
                                    SubLObject item_var = second(literal);
                                    if (NIL == member(item_var, event_variables, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                                        event_variables = cons(item_var, event_variables);
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt54);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = event_variables;
                SubLObject variable = NIL;
                for (variable = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , variable = cdolist_list_var.first()) {
                    {
                        SubLObject group = com.cyc.cycjava.cycl.quirk.quirk_removal_module.reconstruct_quirk_event_from_variable(variable, variable_hash);
                        if (NIL != group) {
                            event_groups = cons(group, event_groups);
                        }
                    }
                }
            }
            return event_groups;
        }
    }

    /**
     *
     *
     * @param CONTEXTUALIZED-LITERALS,
     * 		listp, a list of (mt literal) pairs
     * @return listp; a list of lists of literals. Each element of the list
    represents a group of literals that ought to be dealt together by the
    QUIRK module because they collectively describe the same event.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param CONTEXTUALIZED-LITERALS,\r\n\t\tlistp, a list of (mt literal) pairs\r\n@return listp; a list of lists of literals. Each element of the list\r\nrepresents a group of literals that ought to be dealt together by the\r\nQUIRK module because they collectively describe the same event.\r\n@unknown bertolo")
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

    /**
     *
     *
     * @param CONTEXTUALIZED-LITERALS,
     * 		listp, a list of (mt literal) pairs
     * @return listp; a list of lists of literals. Each element of the list
    represents a group of literals that ought to be dealt together by the
    QUIRK module
     * @unknown bertolo
     */
    @LispMethod(comment = "@param CONTEXTUALIZED-LITERALS,\r\n\t\tlistp, a list of (mt literal) pairs\r\n@return listp; a list of lists of literals. Each element of the list\r\nrepresents a group of literals that ought to be dealt together by the\r\nQUIRK module\r\n@unknown bertolo")
    public static final SubLObject compute_quirk_groups_alt(SubLObject contextualized_literals) {
        {
            SubLObject state_groups = com.cyc.cycjava.cycl.quirk.quirk_removal_module.compute_quirk_state_groups(contextualized_literals);
            SubLObject event_groups = com.cyc.cycjava.cycl.quirk.quirk_removal_module.compute_quirk_event_groups(contextualized_literals);
            return append(state_groups, event_groups);
        }
    }

    /**
     *
     *
     * @param CONTEXTUALIZED-LITERALS,
     * 		listp, a list of (mt literal) pairs
     * @return listp; a list of lists of literals. Each element of the list
    represents a group of literals that ought to be dealt together by the
    QUIRK module
     * @unknown bertolo
     */
    @LispMethod(comment = "@param CONTEXTUALIZED-LITERALS,\r\n\t\tlistp, a list of (mt literal) pairs\r\n@return listp; a list of lists of literals. Each element of the list\r\nrepresents a group of literals that ought to be dealt together by the\r\nQUIRK module\r\n@unknown bertolo")
    public static SubLObject compute_quirk_groups(final SubLObject contextualized_literals) {
        final SubLObject state_groups = compute_quirk_state_groups(contextualized_literals);
        final SubLObject event_groups = compute_quirk_event_groups(contextualized_literals);
        return append(state_groups, event_groups);
    }

    /**
     *
     *
     * @param GROUPS,
     * 		listp a list of non-empty lists of literals
     * @param LITERALS,
     * 		consp a non-empty list of literals
     * @return listp; a list of subclause-spec-p
    The purpose of this function is to encode the groups of literals that have been identified as QUIRK
    units into the subclause-spec-p format expected by the conjunctive removal harness.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param GROUPS,\r\n\t\tlistp a list of non-empty lists of literals\r\n@param LITERALS,\r\n\t\tconsp a non-empty list of literals\r\n@return listp; a list of subclause-spec-p\r\nThe purpose of this function is to encode the groups of literals that have been identified as QUIRK\r\nunits into the subclause-spec-p format expected by the conjunctive removal harness.\r\n@unknown bertolo")
    public static final SubLObject build_subclause_specs_from_groups_alt(SubLObject groups, SubLObject literals) {
        {
            SubLObject subclause_specs = NIL;
            SubLObject cdolist_list_var = groups;
            SubLObject group = NIL;
            for (group = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , group = cdolist_list_var.first()) {
                {
                    SubLObject neglit_indices = NIL;
                    SubLObject poslit_indices = NIL;
                    SubLObject subclause_spec = NIL;
                    SubLObject cdolist_list_var_8 = group;
                    SubLObject literal = NIL;
                    for (literal = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , literal = cdolist_list_var_8.first()) {
                        {
                            SubLObject literal_index = position(literal, literals, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            poslit_indices = cons(literal_index, poslit_indices);
                        }
                    }
                    subclause_spec = list(neglit_indices, poslit_indices);
                    subclause_specs = cons(subclause_spec, subclause_specs);
                }
            }
            return subclause_specs;
        }
    }

    /**
     *
     *
     * @param GROUPS,
     * 		listp a list of non-empty lists of literals
     * @param LITERALS,
     * 		consp a non-empty list of literals
     * @return listp; a list of subclause-spec-p
    The purpose of this function is to encode the groups of literals that have been identified as QUIRK
    units into the subclause-spec-p format expected by the conjunctive removal harness.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param GROUPS,\r\n\t\tlistp a list of non-empty lists of literals\r\n@param LITERALS,\r\n\t\tconsp a non-empty list of literals\r\n@return listp; a list of subclause-spec-p\r\nThe purpose of this function is to encode the groups of literals that have been identified as QUIRK\r\nunits into the subclause-spec-p format expected by the conjunctive removal harness.\r\n@unknown bertolo")
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

    public static final SubLObject removal_quirk_guruqa_conjunctive_applicability_alt(SubLObject contextualized_dnf_clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $ask_quirkP$.getDynamicValue(thread)) {
                {
                    SubLObject contextualized_literals = cadr(contextualized_dnf_clause);
                    SubLObject literals = Mapping.mapcar(symbol_function(CADR), contextualized_literals);
                    SubLObject groups = remove_if(symbol_function($sym58$SINGLETON_), com.cyc.cycjava.cycl.quirk.quirk_removal_module.compute_quirk_groups(contextualized_literals), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return com.cyc.cycjava.cycl.quirk.quirk_removal_module.build_subclause_specs_from_groups(groups, literals);
                }
            } else {
                return NIL;
            }
        }
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

    public static final SubLObject removal_quirk_guruqa_conjunctive_cost_alt(SubLObject contextualized_dnf_clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return multiply($quirk_guruqa_cost$.getDynamicValue(thread), $float$0_9);
        }
    }

    public static SubLObject removal_quirk_guruqa_conjunctive_cost(final SubLObject contextualized_dnf_clause) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return multiply($quirk_guruqa_cost$.getDynamicValue(thread), $float$0_9);
    }

    public static final SubLObject map_make_quirk_guruqa_support_alt(SubLObject clause, SubLObject ind) {
        {
            SubLObject res = NIL;
            SubLObject cdolist_list_var = clause;
            SubLObject lit = NIL;
            for (lit = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lit = cdolist_list_var.first()) {
                res = cons(list(com.cyc.cycjava.cycl.quirk.quirk_removal_module.make_quirk_guruqa_support(lit, ind)), res);
            }
            return nreverse(res);
        }
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

    public static final SubLObject removal_quirk_guruqa_conjunctive_expand_alt(SubLObject contextualized_dnf_clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $ask_quirkP$.currentBinding(thread);
                try {
                    $ask_quirkP$.bind(NIL, thread);
                    {
                        SubLObject asent = Mapping.mapcar(symbol_function(CADR), cadr(contextualized_dnf_clause));
                        SubLObject guruqa_query = external_interfaces.compute_guruqa_query(asent);
                        SubLObject guruqa_string = methods.funcall_instance_method_with_0_args(guruqa_query, TO_STRING);
                        SubLObject guruqa_ranked_weights = methods.funcall_instance_method_with_0_args(guruqa_query, RANKED_WEIGHT_LIST);
                        SubLObject indexes = external_interfaces.guruqa_answer_indexes(guruqa_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject top_indices = subseq(indexes, ZERO_INTEGER, $quirk_passages_num$.getDynamicValue(thread));
                        SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                        SubLObject well_formed_query = NIL;
                        format(T, $str_alt60$_______A, asent);
                        format(T, $str_alt61$_______A, pph_question.generate_question(asent, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                        {
                            SubLObject _prev_bind_0_9 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                well_formed_query = wff.query_okP(cycl_utilities.hl_to_el(cons($$and, asent)), UNPROVIDED);
                            } finally {
                                mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_9, thread);
                            }
                        }
                        if (NIL != well_formed_query) {
                            {
                                SubLObject cdolist_list_var = top_indices;
                                SubLObject ind = NIL;
                                for (ind = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ind = cdolist_list_var.first()) {
                                    {
                                        SubLObject datum = ind;
                                        SubLObject current = datum;
                                        SubLObject score_tail = property_list_member($SCORE, current);
                                        SubLObject score = (NIL != score_tail) ? ((SubLObject) (cadr(score_tail))) : NIL;
                                        if (NIL != com.cyc.cycjava.cycl.quirk.quirk_removal_module.acceptable_score_for_guruqa_weights(score, guruqa_ranked_weights)) {
                                            {
                                                SubLObject passage = com.cyc.cycjava.cycl.quirk.quirk_removal_module.index_retrieve_passage(ind);
                                                SubLObject passage_assignments = methods.funcall_instance_method_with_3_args(com.cyc.cycjava.cycl.quirk.quirk_removal_module.get_secretary(), ASK, cons($$and, asent), passage, mt);
                                                format(T, $str_alt16$______Index___S, ind);
                                                format(T, $str_alt17$_________________________________);
                                                format(T, $str_alt18$___S, passage);
                                                format(T, $str_alt17$_________________________________);
                                                format(T, $str_alt19$___secretary__S_found_bindings__S, new SubLObject[]{ com.cyc.cycjava.cycl.quirk.quirk_removal_module.get_secretary(), passage_assignments, mt });
                                                {
                                                    SubLObject cdolist_list_var_10 = passage_assignments;
                                                    SubLObject assignment = NIL;
                                                    for (assignment = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest() , assignment = cdolist_list_var_10.first()) {
                                                        {
                                                            SubLObject binding = instances.get_slot(assignment, BINDINGS);
                                                            SubLObject v_answer = sublis(binding, asent, UNPROVIDED, UNPROVIDED);
                                                            inference_worker_removal.conjunctive_removal_callback(binding, com.cyc.cycjava.cycl.quirk.quirk_removal_module.map_make_quirk_guruqa_support(v_answer, ind));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            Errors.warn($str_alt11$Not_well_formed___S_because__S, cons($$and, asent), wff.why_not_wff_ask(cycl_utilities.hl_to_el(cons($$and, asent)), UNPROVIDED, UNPROVIDED));
                        }
                    }
                } finally {
                    $ask_quirkP$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
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

    /**
     *
     *
     * @param score;
     * 		a NUMBERP
     * @param guruqa-ranked-weights;
     * 		a LIST of INTEGERS sorted in descending order
     * @return BOOLEAN
    A fairly arbitrary heuristic for accepting paragraphs that don't contain all of the terms
    contained in a GuruQA query, as reflected from the passage score SCORE and the ranked
    term-weights GURUQA-RANKED-WEIGHTS. Revise at will when better ideas become available.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param score;\r\n\t\ta NUMBERP\r\n@param guruqa-ranked-weights;\r\n\t\ta LIST of INTEGERS sorted in descending order\r\n@return BOOLEAN\r\nA fairly arbitrary heuristic for accepting paragraphs that don\'t contain all of the terms\r\ncontained in a GuruQA query, as reflected from the passage score SCORE and the ranked\r\nterm-weights GURUQA-RANKED-WEIGHTS. Revise at will when better ideas become available.\r\n@unknown bertolo")
    public static final SubLObject acceptable_score_for_guruqa_weights_alt(SubLObject score, SubLObject guruqa_ranked_weights) {
        SubLTrampolineFile.checkType(score, NUMBERP);
        SubLTrampolineFile.checkType(guruqa_ranked_weights, CONSP);
        {
            SubLObject len = length(guruqa_ranked_weights);
            SubLObject significant_weights = list_utilities.first_n(ceiling(divide(len, TWO_INTEGER), UNPROVIDED), guruqa_ranked_weights);
            SubLObject grace_score = apply(symbol_function($sym65$_), significant_weights);
            return numGE(score, grace_score);
        }
    }

    /**
     *
     *
     * @param score;
     * 		a NUMBERP
     * @param guruqa-ranked-weights;
     * 		a LIST of INTEGERS sorted in descending order
     * @return BOOLEAN
    A fairly arbitrary heuristic for accepting paragraphs that don't contain all of the terms
    contained in a GuruQA query, as reflected from the passage score SCORE and the ranked
    term-weights GURUQA-RANKED-WEIGHTS. Revise at will when better ideas become available.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param score;\r\n\t\ta NUMBERP\r\n@param guruqa-ranked-weights;\r\n\t\ta LIST of INTEGERS sorted in descending order\r\n@return BOOLEAN\r\nA fairly arbitrary heuristic for accepting paragraphs that don\'t contain all of the terms\r\ncontained in a GuruQA query, as reflected from the passage score SCORE and the ranked\r\nterm-weights GURUQA-RANKED-WEIGHTS. Revise at will when better ideas become available.\r\n@unknown bertolo")
    public static SubLObject acceptable_score_for_guruqa_weights(final SubLObject score, final SubLObject guruqa_ranked_weights) {
        assert NIL != numberp(score) : "! numberp(score) " + ("Types.numberp(score) " + "CommonSymbols.NIL != Types.numberp(score) ") + score;
        assert NIL != consp(guruqa_ranked_weights) : "! consp(guruqa_ranked_weights) " + ("Types.consp(guruqa_ranked_weights) " + "CommonSymbols.NIL != Types.consp(guruqa_ranked_weights) ") + guruqa_ranked_weights;
        final SubLObject len = length(guruqa_ranked_weights);
        final SubLObject significant_weights = list_utilities.first_n(ceiling(divide(len, TWO_INTEGER), UNPROVIDED), guruqa_ranked_weights);
        final SubLObject grace_score = apply(symbol_function($sym66$_), significant_weights);
        return numGE(score, grace_score);
    }

    public static final SubLObject clear_ask_qaga_cached_alt() {
        {
            SubLObject cs = $ask_qaga_cached_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_ask_qaga_cached() {
        final SubLObject cs = $ask_qaga_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_ask_qaga_cached_alt(SubLObject query) {
        return memoization_state.caching_state_remove_function_results_with_args($ask_qaga_cached_caching_state$.getGlobalValue(), list(query), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_ask_qaga_cached(final SubLObject query) {
        return memoization_state.caching_state_remove_function_results_with_args($ask_qaga_cached_caching_state$.getGlobalValue(), list(query), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject ask_qaga_cached_internal_alt(SubLObject query) {
        return external_interfaces.ask_qaga(query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ask_qaga_cached_internal(final SubLObject query) {
        return external_interfaces.ask_qaga(query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject ask_qaga_cached_alt(SubLObject query) {
        {
            SubLObject caching_state = $ask_qaga_cached_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(ASK_QAGA_CACHED, $ask_qaga_cached_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, query, $kw68$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw68$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.quirk.quirk_removal_module.ask_qaga_cached_internal(query)));
                    memoization_state.caching_state_put(caching_state, query, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
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

    public static final SubLObject removal_connecting_terms_cost_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $connecting_terms_cost$.getDynamicValue(thread);
        }
    }

    public static SubLObject removal_connecting_terms_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $connecting_terms_cost$.getDynamicValue(thread);
    }

    public static final SubLObject connecting_terms_alt(SubLObject args) {
        return getf(com.cyc.cycjava.cycl.quirk.quirk_removal_module.ask_qaga_cached(args).first(), $AUGMENT, UNPROVIDED);
    }

    public static SubLObject connecting_terms(final SubLObject args) {
        return getf(ask_qaga_cached(args).first(), $AUGMENT, UNPROVIDED);
    }

    public static final SubLObject hl_justify_qaga_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt25);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt25);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt25);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt25);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject answers = com.cyc.cycjava.cycl.quirk.quirk_removal_module.ask_qaga_cached(list(pph_main.generate_phrase(cycl_utilities.formula_arg1(literal, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), pph_main.generate_phrase(cycl_utilities.formula_arg2(literal, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
                    SubLObject res = NIL;
                    SubLObject cdolist_list_var = answers;
                    SubLObject ans = NIL;
                    for (ans = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ans = cdolist_list_var.first()) {
                        res = cons(assertions_high.create_gaf(list($$containsInfoStructure_CW, listS($$InstanceNamedFn, getf(ans, $DOCID, UNPROVIDED), $list_alt74), getf(ans, $TEXT, UNPROVIDED)), mt, UNPROVIDED), res);
                    }
                    return reverse(res);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt25);
            }
        }
        return NIL;
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

    public static final SubLObject clear_answer_question_alt() {
        {
            SubLObject cs = $answer_question_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_answer_question() {
        final SubLObject cs = $answer_question_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_answer_question_alt(SubLObject line) {
        return memoization_state.caching_state_remove_function_results_with_args($answer_question_caching_state$.getGlobalValue(), list(line), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_answer_question(final SubLObject line) {
        return memoization_state.caching_state_remove_function_results_with_args($answer_question_caching_state$.getGlobalValue(), list(line), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject answer_question_internal_alt(SubLObject line) {
        {
            SubLObject q = question.new_question(line, UNPROVIDED, UNPROVIDED);
            return methods.funcall_instance_method_with_0_args(q, ANSWER);
        }
    }

    public static SubLObject answer_question_internal(final SubLObject line) {
        final SubLObject q = question.new_question(line, UNPROVIDED, UNPROVIDED);
        return methods.funcall_instance_method_with_0_args(q, ANSWER);
    }

    public static final SubLObject answer_question_alt(SubLObject line) {
        {
            SubLObject caching_state = $answer_question_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(ANSWER_QUESTION, $answer_question_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, line, $kw68$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw68$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.quirk.quirk_removal_module.answer_question_internal(line)));
                    memoization_state.caching_state_put(caching_state, line, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
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

    public static final SubLObject answer_text_alt(SubLObject v_answer) {
        return methods.funcall_instance_method_with_0_args(v_answer, GET_CONTENT);
    }

    public static SubLObject answer_text(final SubLObject v_answer) {
        return methods.funcall_instance_method_with_0_args(v_answer, GET_CONTENT);
    }

    public static final SubLObject answer_justification_text_alt(SubLObject v_answer) {
        {
            SubLObject j = methods.funcall_instance_method_with_0_args(v_answer, JUSTIFY);
            return methods.funcall_instance_method_with_0_args(j, GET_CONTENT);
        }
    }

    public static SubLObject answer_justification_text(final SubLObject v_answer) {
        final SubLObject j = methods.funcall_instance_method_with_0_args(v_answer, JUSTIFY);
        return methods.funcall_instance_method_with_0_args(j, GET_CONTENT);
    }

    public static final SubLObject hl_justify_text_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt25);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt25);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt25);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt25);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject answers = com.cyc.cycjava.cycl.quirk.quirk_removal_module.answer_question(pph_question.generate_question(cycl_utilities.formula_arg1(literal, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    SubLObject res = NIL;
                    SubLObject cdolist_list_var = answers;
                    SubLObject ans = NIL;
                    for (ans = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ans = cdolist_list_var.first()) {
                        if (com.cyc.cycjava.cycl.quirk.quirk_removal_module.answer_text(ans).equal(cycl_utilities.formula_arg2(literal, UNPROVIDED))) {
                            res = cons(assertions_high.create_gaf(list($$containsInfoStructure_CW, listS($$InstanceNamedFn, methods.funcall_instance_method_with_0_args(ans, JUSTIFY), $list_alt74), com.cyc.cycjava.cycl.quirk.quirk_removal_module.answer_text(ans)), mt, UNPROVIDED), res);
                        }
                    }
                    return reverse(res);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt25);
            }
        }
        return NIL;
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

    public static final SubLObject removal_quirk_expand_alt(SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $ask_quirkP$.currentBinding(thread);
                try {
                    $ask_quirkP$.bind(NIL, thread);
                    {
                        SubLObject closed_asent = parse_tree.quantify_existentially(asent, UNPROVIDED);
                        SubLObject question_string = pph_question.generate_question(closed_asent, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject answers = com.cyc.cycjava.cycl.quirk.quirk_removal_module.answer_question(question_string);
                        SubLObject mt = mt_relevance_macros.$mt$.getDynamicValue(thread);
                        SubLObject cdolist_list_var = answers;
                        SubLObject v_answer = NIL;
                        for (v_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_answer = cdolist_list_var.first()) {
                            print(XXXXXXXXXXXXXXXXXXXXXX, UNPROVIDED);
                            {
                                SubLObject ignore_errors_tag = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_11 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                            try {
                                                {
                                                    SubLObject parses = cyclifier.cyclify(com.cyc.cycjava.cycl.quirk.quirk_removal_module.answer_justification_text(v_answer), UNPROVIDED);
                                                    SubLObject cdolist_list_var_12 = parses;
                                                    SubLObject parse = NIL;
                                                    for (parse = cdolist_list_var_12.first(); NIL != cdolist_list_var_12; cdolist_list_var_12 = cdolist_list_var_12.rest() , parse = cdolist_list_var_12.first()) {
                                                        {
                                                            SubLObject v_bindings = inference_kernel.new_cyc_query(list($$implies, parse, asent), mt, $list_alt92);
                                                            SubLObject cdolist_list_var_13 = v_bindings;
                                                            SubLObject binding = NIL;
                                                            for (binding = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , binding = cdolist_list_var_13.first()) {
                                                                {
                                                                    SubLObject ans = sublis(binding, asent, UNPROVIDED, UNPROVIDED);
                                                                    if (NIL != com.cyc.cycjava.cycl.quirk.quirk_removal_module.quirk_relevant_literal(ans)) {
                                                                        backward.removal_add_node(com.cyc.cycjava.cycl.quirk.quirk_removal_module.make_quirk_support(ans), binding, UNPROVIDED);
                                                                    } else {
                                                                        format(T, $str_alt21$__rejecting___A, v_answer);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_11, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                }
                            }
                        }
                    }
                } finally {
                    $ask_quirkP$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
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

    public static final SubLObject make_quirk_support_alt(SubLObject ans) {
        return arguments.make_hl_support($QUIRK, ans, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject make_quirk_support(final SubLObject ans) {
        return arguments.make_hl_support($QUIRK, ans, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject hl_justify_quirk_alt(SubLObject support) {
        {
            SubLObject datum = support;
            SubLObject current = datum;
            SubLObject hl_module = NIL;
            SubLObject literal = NIL;
            SubLObject mt = NIL;
            SubLObject tv = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt25);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt25);
            literal = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt25);
            mt = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt25);
            tv = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject answers = com.cyc.cycjava.cycl.quirk.quirk_removal_module.answer_question(pph_question.generate_question(parse_tree.quantify_existentially(literal, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    SubLObject res = NIL;
                    SubLObject cdolist_list_var = answers;
                    SubLObject ans = NIL;
                    for (ans = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , ans = cdolist_list_var.first()) {
                        if (com.cyc.cycjava.cycl.quirk.quirk_removal_module.answer_text(ans).equal(cycl_utilities.formula_arg2(literal, UNPROVIDED))) {
                            res = cons(assertions_high.create_gaf(list($$containsInfoStructure_CW, listS($$InstanceNamedFn, methods.funcall_instance_method_with_0_args(ans, JUSTIFY), $list_alt74), com.cyc.cycjava.cycl.quirk.quirk_removal_module.answer_text(ans)), mt, UNPROVIDED), res);
                        }
                    }
                    return reverse(res);
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt25);
            }
        }
        return NIL;
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

    public static final SubLObject removal_quirk_conjunctive_expand_alt(SubLObject contextualized_dnf_clause) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject conjunction_mt = NIL;
                SubLObject asents = NIL;
                {
                    SubLObject sense = $NEG;
                    SubLObject index_var = ZERO_INTEGER;
                    SubLObject cdolist_list_var = clauses.neg_lits(contextualized_dnf_clause);
                    SubLObject contextualized_asent = NIL;
                    for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                        {
                            SubLObject datum = contextualized_asent;
                            SubLObject current = datum;
                            SubLObject mt = NIL;
                            SubLObject asent = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt98);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt98);
                            asent = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if ($POS == sense) {
                                    asents = cons(asent, asents);
                                    if (NIL == conjunction_mt) {
                                        conjunction_mt = mt;
                                    } else {
                                        if (NIL == hlmt.hlmt_equalP(mt, conjunction_mt)) {
                                            Errors.error($str_alt100$removal_quirk_conjunctive_expand_);
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt98);
                            }
                        }
                        index_var = add(index_var, ONE_INTEGER);
                    }
                }
                {
                    SubLObject sense = $POS;
                    SubLObject index_var = ZERO_INTEGER;
                    SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
                    SubLObject contextualized_asent = NIL;
                    for (contextualized_asent = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , contextualized_asent = cdolist_list_var.first()) {
                        {
                            SubLObject datum = contextualized_asent;
                            SubLObject current = datum;
                            SubLObject mt = NIL;
                            SubLObject asent = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt98);
                            mt = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list_alt98);
                            asent = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if ($POS == sense) {
                                    asents = cons(asent, asents);
                                    if (NIL == conjunction_mt) {
                                        conjunction_mt = mt;
                                    } else {
                                        if (NIL == hlmt.hlmt_equalP(mt, conjunction_mt)) {
                                            Errors.error($str_alt100$removal_quirk_conjunctive_expand_);
                                        }
                                    }
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt98);
                            }
                        }
                        index_var = add(index_var, ONE_INTEGER);
                    }
                }
                {
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(conjunction_mt);
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            {
                                SubLObject sentence = simplifier.conjoin(asents, UNPROVIDED);
                                com.cyc.cycjava.cycl.quirk.quirk_removal_module.removal_quirk_expand(sentence, UNPROVIDED);
                            }
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
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

    public static final SubLObject clear_get_word_graph_cached_alt() {
        {
            SubLObject cs = $get_word_graph_cached_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
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

    public static final SubLObject remove_get_word_graph_cached_alt(SubLObject query) {
        return memoization_state.caching_state_remove_function_results_with_args($get_word_graph_cached_caching_state$.getGlobalValue(), list(query), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_get_word_graph_cached(final SubLObject query) {
        return memoization_state.caching_state_remove_function_results_with_args($get_word_graph_cached_caching_state$.getGlobalValue(), list(query), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_word_graph_cached_internal_alt(SubLObject query) {
        return external_interfaces.get_word_graph(query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_word_graph_cached_internal(final SubLObject query) {
        return external_interfaces.get_word_graph(query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_word_graph_cached_alt(SubLObject query) {
        {
            SubLObject caching_state = $get_word_graph_cached_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(GET_WORD_GRAPH_CACHED, $get_word_graph_cached_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, query, $kw68$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw68$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.quirk.quirk_removal_module.get_word_graph_cached_internal(query)));
                    memoization_state.caching_state_put(caching_state, query, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
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

    public static final SubLObject assert_word_graph_alt(SubLObject query, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$TREC_Mt;
        }
        {
            SubLObject v_graph = com.cyc.cycjava.cycl.quirk.quirk_removal_module.get_word_graph_cached(query);
            SubLObject cdolist_list_var = v_graph;
            SubLObject nodes = NIL;
            for (nodes = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , nodes = cdolist_list_var.first()) {
                {
                    SubLObject node1 = nodes.first();
                    SubLObject cdolist_list_var_14 = nodes.rest();
                    SubLObject node2 = NIL;
                    for (node2 = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , node2 = cdolist_list_var_14.first()) {
                        fi.fi_assert(list($$conceptuallyRelated, list($$WordFn, node1), list($$WordFn, node2)), mt, UNPROVIDED, UNPROVIDED);
                    }
                }
            }
        }
        return NIL;
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

    public static final SubLObject clear_fully_connected_graph_links_alt() {
        {
            SubLObject cs = $fully_connected_graph_links_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
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

    public static final SubLObject remove_fully_connected_graph_links_alt(SubLObject query_terms) {
        return memoization_state.caching_state_remove_function_results_with_args($fully_connected_graph_links_caching_state$.getGlobalValue(), list(query_terms), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_fully_connected_graph_links(final SubLObject query_terms) {
        return memoization_state.caching_state_remove_function_results_with_args($fully_connected_graph_links_caching_state$.getGlobalValue(), list(query_terms), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject fully_connected_graph_links_internal_alt(SubLObject query_terms) {
        {
            SubLObject string_lists = external_interfaces.get_word_graph(query_terms, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject graph_object = graph.make_graph_from_string_lists(string_lists);
            SubLObject connecting_terms = methods.funcall_instance_method_with_1_args(graph_object, GET_PATH_LABELS, query_terms);
            SubLObject filter = union(connecting_terms, query_terms, UNPROVIDED, UNPROVIDED);
            SubLObject result = NIL;
            SubLObject cdolist_list_var = string_lists;
            SubLObject nodes = NIL;
            for (nodes = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , nodes = cdolist_list_var.first()) {
                {
                    SubLObject out_node = nodes.first();
                    if (NIL != subl_promotions.memberP(out_node, filter, UNPROVIDED, UNPROVIDED)) {
                        {
                            SubLObject cdolist_list_var_15 = nodes.rest();
                            SubLObject in_node = NIL;
                            for (in_node = cdolist_list_var_15.first(); NIL != cdolist_list_var_15; cdolist_list_var_15 = cdolist_list_var_15.rest() , in_node = cdolist_list_var_15.first()) {
                                if (NIL != subl_promotions.memberP(in_node, filter, UNPROVIDED, UNPROVIDED)) {
                                    result = cons(list(out_node, in_node), result);
                                }
                            }
                        }
                    }
                }
            }
            return result;
        }
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

    public static final SubLObject fully_connected_graph_links_alt(SubLObject query_terms) {
        {
            SubLObject caching_state = $fully_connected_graph_links_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(FULLY_CONNECTED_GRAPH_LINKS, $fully_connected_graph_links_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, query_terms, $kw68$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw68$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.quirk.quirk_removal_module.fully_connected_graph_links_internal(query_terms)));
                    memoization_state.caching_state_put(caching_state, query_terms, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
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

    public static final SubLObject clear_word_graph_links_alt() {
        {
            SubLObject cs = $word_graph_links_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_word_graph_links() {
        final SubLObject cs = $word_graph_links_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_word_graph_links_alt(SubLObject query) {
        return memoization_state.caching_state_remove_function_results_with_args($word_graph_links_caching_state$.getGlobalValue(), list(query), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_word_graph_links(final SubLObject query) {
        return memoization_state.caching_state_remove_function_results_with_args($word_graph_links_caching_state$.getGlobalValue(), list(query), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject word_graph_links_internal_alt(SubLObject query) {
        {
            SubLObject v_graph = external_interfaces.get_word_graph(query, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject res = NIL;
            SubLObject cdolist_list_var = v_graph;
            SubLObject nodes = NIL;
            for (nodes = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , nodes = cdolist_list_var.first()) {
                {
                    SubLObject node1 = nodes.first();
                    SubLObject cdolist_list_var_16 = nodes.rest();
                    SubLObject node2 = NIL;
                    for (node2 = cdolist_list_var_16.first(); NIL != cdolist_list_var_16; cdolist_list_var_16 = cdolist_list_var_16.rest() , node2 = cdolist_list_var_16.first()) {
                        res = cons(list(node1, node2), res);
                    }
                }
            }
            return res;
        }
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

    public static final SubLObject word_graph_links_alt(SubLObject query) {
        {
            SubLObject caching_state = $word_graph_links_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(WORD_GRAPH_LINKS, $word_graph_links_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, query, $kw68$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw68$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.quirk.quirk_removal_module.word_graph_links_internal(query)));
                    memoization_state.caching_state_put(caching_state, query, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
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

    public static final SubLObject clear_qaga_link_result_alt() {
        {
            SubLObject cs = $qaga_link_result_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_qaga_link_result() {
        final SubLObject cs = $qaga_link_result_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_qaga_link_result_alt(SubLObject result) {
        return memoization_state.caching_state_remove_function_results_with_args($qaga_link_result_caching_state$.getGlobalValue(), list(result), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_qaga_link_result(final SubLObject result) {
        return memoization_state.caching_state_remove_function_results_with_args($qaga_link_result_caching_state$.getGlobalValue(), list(result), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject qaga_link_result_internal_alt(SubLObject result) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            fi.fi_assert(result, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
            return result;
        }
    }

    public static SubLObject qaga_link_result_internal(final SubLObject result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        fi.fi_assert(result, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        return result;
    }

    public static final SubLObject qaga_link_result_alt(SubLObject result) {
        {
            SubLObject caching_state = $qaga_link_result_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(QAGA_LINK_RESULT, $qaga_link_result_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, result, $kw68$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw68$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.quirk.quirk_removal_module.qaga_link_result_internal(result)));
                    memoization_state.caching_state_put(caching_state, result, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
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
        declareFunction("get_secretary", "GET-SECRETARY", 0, 0, false);
        declareFunction("secretary_class", "SECRETARY-CLASS", 1, 0, false);
        declareFunction("get_sksi_enabled_predicates", "GET-SKSI-ENABLED-PREDICATES", 0, 0, false);
        declareFunction("sksi_enabled_predicate_p", "SKSI-ENABLED-PREDICATE-P", 1, 0, false);
        declareFunction("quirk_irrelevant_add", "QUIRK-IRRELEVANT-ADD", 1, 0, false);
        declareFunction("quirk_irrelevant_remove", "QUIRK-IRRELEVANT-REMOVE", 1, 0, false);
        declareFunction("quirk_irrelevant_term", "QUIRK-IRRELEVANT-TERM", 1, 0, false);
        declareFunction("quirk_relevant_literal", "QUIRK-RELEVANT-LITERAL", 1, 0, false);
        declareFunction("removal_quirk_guruqa_required", "REMOVAL-QUIRK-GURUQA-REQUIRED", 1, 1, false);
        new quirk_removal_module.$removal_quirk_guruqa_required$UnaryFunction();
        new quirk_removal_module.$removal_quirk_guruqa_required$BinaryFunction();
        declareFunction("removal_quirk_guruqa_cost", "REMOVAL-QUIRK-GURUQA-COST", 1, 1, false);
        declareFunction("index_retrieve_passage", "INDEX-RETRIEVE-PASSAGE", 1, 0, false);
        declareFunction("removal_quirk_guruqa_expand", "REMOVAL-QUIRK-GURUQA-EXPAND", 1, 1, false);
        declareFunction("make_quirk_guruqa_support", "MAKE-QUIRK-GURUQA-SUPPORT", 2, 0, false);
        declareFunction("hl_justify_quirk_guruqa", "HL-JUSTIFY-QUIRK-GURUQA", 1, 0, false);
        declareFunction("document_mt_coordinates", "DOCUMENT-MT-COORDINATES", 1, 0, false);
        declareFunction("document_index_mt", "DOCUMENT-INDEX-MT", 1, 0, false);
        declareFunction("ask_textually_justified", "ASK-TEXTUALLY-JUSTIFIED", 1, 5, false);
        declareFunction("register_nima_sks", "REGISTER-NIMA-SKS", 0, 0, false);
        declareFunction("register_usgs_sks", "REGISTER-USGS-SKS", 0, 0, false);
        declareFunction("enable_quirk", "ENABLE-QUIRK", 0, 0, false);
        declareFunction("disable_quirk", "DISABLE-QUIRK", 0, 0, false);
        declareFunction("isa_actor_slotP", "ISA-ACTOR-SLOT?", 1, 1, false);
        declareFunction("isa_taxonomic_slotP", "ISA-TAXONOMIC-SLOT?", 1, 1, false);
        declareFunction("reconstruct_quirk_state_from_predicate_literal", "RECONSTRUCT-QUIRK-STATE-FROM-PREDICATE-LITERAL", 2, 0, false);
        declareFunction("compute_quirk_state_groups", "COMPUTE-QUIRK-STATE-GROUPS", 1, 0, false);
        declareFunction("reconstruct_quirk_event_from_variable", "RECONSTRUCT-QUIRK-EVENT-FROM-VARIABLE", 2, 0, false);
        declareFunction("compute_quirk_event_groups", "COMPUTE-QUIRK-EVENT-GROUPS", 1, 0, false);
        declareFunction("compute_quirk_groups", "COMPUTE-QUIRK-GROUPS", 1, 0, false);
        declareFunction("build_subclause_specs_from_groups", "BUILD-SUBCLAUSE-SPECS-FROM-GROUPS", 2, 0, false);
        declareFunction("removal_quirk_guruqa_conjunctive_applicability", "REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-APPLICABILITY", 1, 0, false);
        new quirk_removal_module.$removal_quirk_guruqa_conjunctive_applicability$UnaryFunction();
        declareFunction("removal_quirk_guruqa_conjunctive_cost", "REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-COST", 1, 0, false);
        declareFunction("map_make_quirk_guruqa_support", "MAP-MAKE-QUIRK-GURUQA-SUPPORT", 2, 0, false);
        declareFunction("removal_quirk_guruqa_conjunctive_expand", "REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-EXPAND", 1, 0, false);
        declareFunction("acceptable_score_for_guruqa_weights", "ACCEPTABLE-SCORE-FOR-GURUQA-WEIGHTS", 2, 0, false);
        declareFunction("clear_ask_qaga_cached", "CLEAR-ASK-QAGA-CACHED", 0, 0, false);
        declareFunction("remove_ask_qaga_cached", "REMOVE-ASK-QAGA-CACHED", 1, 0, false);
        declareFunction("ask_qaga_cached_internal", "ASK-QAGA-CACHED-INTERNAL", 1, 0, false);
        declareFunction("ask_qaga_cached", "ASK-QAGA-CACHED", 1, 0, false);
        declareFunction("removal_connecting_terms_cost", "REMOVAL-CONNECTING-TERMS-COST", 1, 1, false);
        declareFunction("connecting_terms", "CONNECTING-TERMS", 1, 0, false);
        declareFunction("hl_justify_qaga", "HL-JUSTIFY-QAGA", 1, 0, false);
        declareFunction("clear_answer_question", "CLEAR-ANSWER-QUESTION", 0, 0, false);
        declareFunction("remove_answer_question", "REMOVE-ANSWER-QUESTION", 1, 0, false);
        declareFunction("answer_question_internal", "ANSWER-QUESTION-INTERNAL", 1, 0, false);
        declareFunction("answer_question", "ANSWER-QUESTION", 1, 0, false);
        declareFunction("answer_text", "ANSWER-TEXT", 1, 0, false);
        declareFunction("answer_justification_text", "ANSWER-JUSTIFICATION-TEXT", 1, 0, false);
        declareFunction("hl_justify_text", "HL-JUSTIFY-TEXT", 1, 0, false);
        declareFunction("removal_quirk_expand", "REMOVAL-QUIRK-EXPAND", 1, 1, false);
        declareFunction("make_quirk_support", "MAKE-QUIRK-SUPPORT", 1, 0, false);
        declareFunction("hl_justify_quirk", "HL-JUSTIFY-QUIRK", 1, 0, false);
        declareFunction("removal_quirk_conjunctive_expand", "REMOVAL-QUIRK-CONJUNCTIVE-EXPAND", 1, 0, false);
        declareFunction("clear_get_word_graph_cached", "CLEAR-GET-WORD-GRAPH-CACHED", 0, 0, false);
        declareFunction("remove_get_word_graph_cached", "REMOVE-GET-WORD-GRAPH-CACHED", 1, 0, false);
        declareFunction("get_word_graph_cached_internal", "GET-WORD-GRAPH-CACHED-INTERNAL", 1, 0, false);
        declareFunction("get_word_graph_cached", "GET-WORD-GRAPH-CACHED", 1, 0, false);
        declareFunction("assert_word_graph", "ASSERT-WORD-GRAPH", 1, 1, false);
        declareFunction("clear_fully_connected_graph_links", "CLEAR-FULLY-CONNECTED-GRAPH-LINKS", 0, 0, false);
        declareFunction("remove_fully_connected_graph_links", "REMOVE-FULLY-CONNECTED-GRAPH-LINKS", 1, 0, false);
        declareFunction("fully_connected_graph_links_internal", "FULLY-CONNECTED-GRAPH-LINKS-INTERNAL", 1, 0, false);
        declareFunction("fully_connected_graph_links", "FULLY-CONNECTED-GRAPH-LINKS", 1, 0, false);
        declareFunction("clear_word_graph_links", "CLEAR-WORD-GRAPH-LINKS", 0, 0, false);
        declareFunction("remove_word_graph_links", "REMOVE-WORD-GRAPH-LINKS", 1, 0, false);
        declareFunction("word_graph_links_internal", "WORD-GRAPH-LINKS-INTERNAL", 1, 0, false);
        declareFunction("word_graph_links", "WORD-GRAPH-LINKS", 1, 0, false);
        declareFunction("clear_qaga_link_result", "CLEAR-QAGA-LINK-RESULT", 0, 0, false);
        declareFunction("remove_qaga_link_result", "REMOVE-QAGA-LINK-RESULT", 1, 0, false);
        declareFunction("qaga_link_result_internal", "QAGA-LINK-RESULT-INTERNAL", 1, 0, false);
        declareFunction("qaga_link_result", "QAGA-LINK-RESULT", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt4 = list(new SubLObject[]{ reader_make_constant_shell("QuirkIrrelevantTerm"), reader_make_constant_shell("ImplementationConstant"), reader_make_constant_shell("CoreConstant"), reader_make_constant_shell("NLTerm"), reader_make_constant_shell("MicrotheoryPredicate"), reader_make_constant_shell("Microtheory"), reader_make_constant_shell("CycLExpressionType"), reader_make_constant_shell("MicrotheoryType"), reader_make_constant_shell("RelationshipType"), reader_make_constant_shell("CollectionType"), reader_make_constant_shell("MetaRelation"), reader_make_constant_shell("VocabularyDefiningPredicate"), reader_make_constant_shell("KFDInternalKRTerm"), reader_make_constant_shell("SubcategorizationFrame"), reader_make_constant_shell("LinguisticObjectType"), reader_make_constant_shell("SKSIConstant"), reader_make_constant_shell("ExperimentalConstant"), reader_make_constant_shell("ActorSlot") });

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

    static private final SubLString $str_alt8$_______A = makeString("~&??? ~A");

    static private final SubLString $str_alt11$Not_well_formed___S_because__S = makeString("Not well formed: ~S because ~S");

    public static final SubLObject setup_quirk_removal_module_file_alt() {
        inference_modules.inference_removal_module($REMOVAL_QUIRK_GURUQA, $list_alt24);
        hl_supports.setup_hl_support_module($QUIRK_GURUQA, $list_alt40);
        inference_modules.inference_conjunctive_removal_module($REMOVAL_QUIRK_GURUQA_CONJUNCTIVE, $list_alt51);
        memoization_state.note_globally_cached_function(ASK_QAGA_CACHED);
        inference_modules.inference_removal_module($REMOVAL_CONNECTING_TERMS, $list_alt71);
        hl_supports.setup_hl_support_module($QAGA, $list_alt77);
        memoization_state.note_globally_cached_function(ANSWER_QUESTION);
        inference_modules.inference_removal_module($REMOVAL_TEXT_ANSWER, $list_alt84);
        hl_supports.setup_hl_support_module($TEXT, $list_alt85);
        inference_modules.inference_removal_module($REMOVAL_QUIRK_CYCLIFY, $list_alt87);
        hl_supports.setup_hl_support_module($QUIRK, $list_alt94);
        inference_modules.inference_conjunctive_removal_module($REMOVAL_QUIRK_CYCLIFY_CONJUNCTIVE, $list_alt96);
        memoization_state.note_globally_cached_function(GET_WORD_GRAPH_CACHED);
        memoization_state.note_globally_cached_function(FULLY_CONNECTED_GRAPH_LINKS);
        memoization_state.note_globally_cached_function(WORD_GRAPH_LINKS);
        inference_modules.inference_removal_module($REMOVAL_QAGA_LINK_FOR, $list_alt111);
        memoization_state.note_globally_cached_function(QAGA_LINK_RESULT);
        inference_modules.inference_removal_module($REMOVAL_QAGA_LINK_FOR_CURRIED, $list_alt115);
        return NIL;
    }

    public static SubLObject setup_quirk_removal_module_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            hl_supports.setup_hl_support_module($QUIRK_GURUQA, $list_alt40);
            inference_modules.inference_conjunctive_removal_module($REMOVAL_QUIRK_GURUQA_CONJUNCTIVE, $list_alt51);
        }
        return NIL;
    }

    public static SubLObject setup_quirk_removal_module_file_Previous() {
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

    static private final SubLString $str_alt16$______Index___S = makeString("~%~%~%Index: ~S");

    static private final SubLString $str_alt17$_________________________________ = makeString("~%----------------------------------------------------------------------");

    static private final SubLString $str_alt18$___S = makeString("~%~S");

    static private final SubLString $str_alt19$___secretary__S_found_bindings__S = makeString("~% secretary ~S found bindings ~S in ~S");

    static private final SubLString $str_alt21$__rejecting___A = makeString("~&rejecting: ~A");

    static private final SubLList $list_alt24 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-QUIRK-GURUQA-REQUIRED"), $COST, makeSymbol("REMOVAL-QUIRK-GURUQA-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUIRK-GURUQA-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("ask guruqa"), makeKeyword("EXAMPLE"), makeString("<any-literal>") });

    static private final SubLList $list_alt25 = list(makeSymbol("HL-MODULE"), makeSymbol("LITERAL"), makeSymbol("MT"), makeSymbol("TV"));

    @Override
    public void declareFunctions() {
        declare_quirk_removal_module_file();
    }

    static private final SubLSymbol $sym28$_VAR1 = makeSymbol("?VAR1");

    @Override
    public void initializeVariables() {
        init_quirk_removal_module_file();
    }

    static private final SubLSymbol $sym29$_VAR2 = makeSymbol("?VAR2");

    public static final SubLObject $const30$TextStringPropositionalExtraction = reader_make_constant_shell("TextStringPropositionalExtractionMtFn");

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

    static private final SubLList $list_alt40 = list(makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-QUIRK-GURUQA"));

    static private final SubLString $str_alt42$_S_is_not_a_support_p = makeString("~S is not a support-p");

    public static final class $removal_quirk_guruqa_conjunctive_applicability$UnaryFunction extends UnaryFunction {
        public $removal_quirk_guruqa_conjunctive_applicability$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-APPLICABILITY"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_quirk_guruqa_conjunctive_applicability(arg1);
        }
    }

    static private final SubLList $list_alt44 = list(reader_make_constant_shell("MappingMtFn"), reader_make_constant_shell("NGA-KS"));

    static private final SubLList $list_alt46 = list(reader_make_constant_shell("MappingMtFn"), reader_make_constant_shell("Usgs-KS"));

    static private final SubLString $str_alt49$QUIRK_enabled_ = makeString("QUIRK enabled!");

    static private final SubLString $str_alt50$QUIRK_disabled_ = makeString("QUIRK disabled!");

    static private final SubLList $list_alt51 = list(new SubLObject[]{ makeKeyword("EVERY-PREDICATES"), NIL, makeKeyword("APPLICABILITY"), makeSymbol("REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-APPLICABILITY"), $COST, makeSymbol("REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("submit an entire event structure to the QUIRK system\n    for simultaneous satisfaction"), makeKeyword("EXAMPLE"), makeString("(#$and (#$isa <event1> <EventType>)\n\t     (#$<actorSlot1> <event1> <actor1>)\n\t     (#$<actorSlot2> <event1> <actor2>)\n\t     ...)") });

    static private final SubLList $list_alt54 = list(makeSymbol("MT"), makeSymbol("LITERAL"));

    static private final SubLSymbol $sym58$SINGLETON_ = makeSymbol("SINGLETON?");

    static private final SubLString $str_alt60$_______A = makeString("~%$$$ ~A");

    static private final SubLString $str_alt61$_______A = makeString("~%### ~A");

    static private final SubLSymbol $sym65$_ = makeSymbol("+");

    public static final SubLSymbol $kw68$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt71 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), $COST, makeSymbol("REMOVAL-CONNECTING-TERMS-COST"), makeKeyword("SUPPORT-MODULE"), $QAGA, makeKeyword("PREDICATE"), reader_make_constant_shell("connectingTerms"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("connectingTerms"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("connectingTerms"), list($BIND, makeSymbol("TERM1")), list($BIND, makeSymbol("TERM2")), makeKeyword("ANYTHING")), list(list(makeKeyword("VALUE"), makeSymbol("TERM1")), list(makeKeyword("VALUE"), makeSymbol("TERM2")))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("MAPCAR"), makeSymbol("GENERATE-PHRASE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("STR1"), makeSymbol("STR2")), list($CALL, makeSymbol("NON-NULL-ANSWER-TO-SINGLETON"), list($CALL, makeSymbol("CONNECTING-TERMS"), list(list(makeKeyword("VALUE"), makeSymbol("STR1")), list(makeKeyword("VALUE"), makeSymbol("STR2")))))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("connectingTerms"), list(makeKeyword("VALUE"), makeSymbol("TERM1")), list(makeKeyword("VALUE"), makeSymbol("TERM2")), cons(reader_make_constant_shell("TheSet"), makeKeyword("INPUT"))), makeKeyword("DOCUMENTATION"), makeString("interface to the QAGA connecting terms functionality"), makeKeyword("EXAMPLE"), makeString("(#$connectingTerms \"valentina tereshkova\" \"astronaut sally ride\" (#$TheSet . ?X))") });

    static private final SubLList $list_alt74 = list(reader_make_constant_shell("GraphicalStructure"));

    static private final SubLList $list_alt77 = list(makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-QAGA"));

    static private final SubLList $list_alt84 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("SUPPORT-MODULE"), $TEXT, makeKeyword("PREDICATE"), reader_make_constant_shell("textAnswer"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("textAnswer"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("textAnswer"), list($BIND, makeSymbol("QUESTION")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("QUESTION"))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("GENERATE-QUESTION"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("ANSWER-QUESTION"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list($CALL, makeSymbol("ANSWER-TEXT"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(reader_make_constant_shell("textAnswer"), list(makeKeyword("VALUE"), makeSymbol("QUESTION")), makeKeyword("INPUT")), makeKeyword("DOCUMENTATION"), makeString("run a query against the quirk-lite system"), makeKeyword("EXAMPLE"), makeString("(#$textAnswer \"Who is Havel\"  ?X)") });

    static private final SubLList $list_alt85 = list(makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-TEXT"));

    static private final SubLList $list_alt87 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-QUIRK-GURUQA-REQUIRED"), $COST, makeSymbol("REMOVAL-QUIRK-GURUQA-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUIRK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("run a CycL  query against the quirk-lite system"), makeKeyword("EXAMPLE"), makeString(" <Anything> ") });

    static private final SubLList $list_alt92 = list(makeKeyword("CONDITIONAL-SENTENCE?"), T);

    static private final SubLList $list_alt94 = list(makeKeyword("JUSTIFY"), makeSymbol("HL-JUSTIFY-QUIRK"));

    static private final SubLList $list_alt96 = list(new SubLObject[]{ makeKeyword("EVERY-PREDICATES"), NIL, makeKeyword("APPLICABILITY"), makeSymbol("REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-APPLICABILITY"), $COST, makeSymbol("REMOVAL-QUIRK-GURUQA-CONJUNCTIVE-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUIRK-CONJUNCTIVE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("submit an entire event structure to the QUIRK system\n    for simultaneous satisfaction"), makeKeyword("EXAMPLE"), makeString("(#$and (#$isa <event1> <EventType>)\n           (#$<actorSlot1> <event1> <actor1>)\n           (#$<actorSlot2> <event1> <actor2>)\n           ...)") });

    static private final SubLList $list_alt98 = list(makeSymbol("MT"), makeSymbol("ASENT"));

    static private final SubLString $str_alt100$removal_quirk_conjunctive_expand_ = makeString("removal-quirk-conjunctive-expand can't yet handle multiple mts in the conjunction");

    static private final SubLList $list_alt111 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), $COST, makeSymbol("REMOVAL-CONNECTING-TERMS-COST"), makeKeyword("PREDICATE"), reader_make_constant_shell("QAGALinkFor"), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell("QAGALinkFor"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(reader_make_constant_shell("QAGALinkFor"), list($BIND, makeSymbol("QUERY")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list($CALL, makeSymbol("CDR"), list(makeKeyword("VALUE"), makeSymbol("QUERY")))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("MAPCAR"), makeSymbol("GENERATE-PHRASE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("FULLY-CONNECTED-GRAPH-LINKS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("WORD1"), makeSymbol("WORD2")), list(reader_make_constant_shell("QAGALinkFor"), list(makeKeyword("VALUE"), makeSymbol("QUERY")), list(reader_make_constant_shell("WordFn"), list(makeKeyword("VALUE"), makeSymbol("WORD1"))), list(reader_make_constant_shell("WordFn"), list(makeKeyword("VALUE"), makeSymbol("WORD2"))))) });

    static private final SubLList $list_alt115 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), $COST, makeSymbol("REMOVAL-CONNECTING-TERMS-COST"), makeKeyword("REQUIRED-PATTERN"), list(list(reader_make_constant_shell("QAGALinkForCurried"), makeKeyword("FULLY-BOUND")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(reader_make_constant_shell("QAGALinkForCurried"), list($BIND, makeSymbol("QUERY"))), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), list($CALL, makeSymbol("CDR"), list(makeKeyword("VALUE"), makeSymbol("QUERY")))), makeKeyword("INPUT-ENCODE-PATTERN"), list($CALL, makeSymbol("MAPCAR"), makeSymbol("GENERATE-PHRASE"), makeKeyword("INPUT")), makeKeyword("OUTPUT-GENERATE-PATTERN"), list($CALL, makeSymbol("FULLY-CONNECTED-GRAPH-LINKS"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("WORD1"), makeSymbol("WORD2")), list($CALL, makeSymbol("QAGA-LINK-RESULT"), list(list(reader_make_constant_shell("QAGALinkForCurried"), list(makeKeyword("VALUE"), makeSymbol("QUERY"))), list(reader_make_constant_shell("WordFn"), list(makeKeyword("VALUE"), makeSymbol("WORD1"))), list(reader_make_constant_shell("WordFn"), list(makeKeyword("VALUE"), makeSymbol("WORD2")))))) });
}

/**
 * Total time: 436 ms
 */
