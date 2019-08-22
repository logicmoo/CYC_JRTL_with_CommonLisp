package com.cyc.cycjava.cycl.quirk;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.gensym;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.clustering;
import com.cyc.cycjava.cycl.document;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.instances;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.parser;
import com.cyc.cycjava.cycl.pos_tagger;
import com.cyc.cycjava.cycl.process_utilities;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.sparse_vector;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class scenario extends SubLTranslatedFile {
    public static final SubLFile me = new scenario();

    public static final String myName = "com.cyc.cycjava.cycl.quirk.scenario";

    public static final String myFingerPrint = "5bb46dfc06978e75616d9947c4331f47e82f9054df57a40f5de2ad5b02df23e2";





    public static final SubLList $list2 = list(new SubLObject[]{ list(makeSymbol("LEXICON"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("PARSER"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("TAGGER"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("STRING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CORPORA"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SENTENCES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("AUGMENTATION-TERMS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("VECTOR"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("QUESTIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ANSWERS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("VIABLE-QUESTION"), list(makeSymbol("QUESTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VECTOR"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER"), NIL, makeKeyword("PUBLIC")) });



    public static final SubLSymbol QUESTIONS = makeSymbol("QUESTIONS");





















    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SCENARIO_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SCENARIO-CLASS");









    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SCENARIO_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SCENARIO-INSTANCE");

    public static final SubLSymbol VIABLE_QUESTION = makeSymbol("VIABLE-QUESTION");

    public static final SubLList $list22 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list23 = list(makeSymbol("QUESTION"));

    public static final SubLList $list24 = list(makeString("@param QUESTION, question-p;\n   @return BOOLEAN, T if question is of the kind we can answer reliably, NIL otherwise\n   @owner bertolo"), list(makeSymbol("CLET"), list(makeSymbol("VIABLE")), list(makeSymbol("CSOME"), list(makeSymbol("PRED"), list(makeSymbol("QUOTE"), list(new SubLObject[]{ makeSymbol("DEFINITIONAL-QUESTION-P"), makeSymbol("INTELLIGENT-AGENT-QUESTION-P"), makeSymbol("GEOGRAPHICAL-QUESTION-P"), makeSymbol("EVENT-LOCATION-QUESTION-P"), makeSymbol("DISTANCE-QUESTION-P"), makeSymbol("PHYSICAL-QUANTITY-QUESTION-P"), makeSymbol("AGE-QUESTION-P"), makeSymbol("WHAT-QUESTION-P"), makeSymbol("DATE-QUESTION-P") })), makeSymbol("VIABLE")), list(makeSymbol("CSETQ"), makeSymbol("VIABLE"), list(makeSymbol("FUNCALL"), makeSymbol("PRED"), makeSymbol("QUESTION")))), list(makeSymbol("RET"), makeSymbol("VIABLE"))));

    public static final SubLList $list25 = list(new SubLObject[]{ makeSymbol("DEFINITIONAL-QUESTION-P"), makeSymbol("INTELLIGENT-AGENT-QUESTION-P"), makeSymbol("GEOGRAPHICAL-QUESTION-P"), makeSymbol("EVENT-LOCATION-QUESTION-P"), makeSymbol("DISTANCE-QUESTION-P"), makeSymbol("PHYSICAL-QUANTITY-QUESTION-P"), makeSymbol("AGE-QUESTION-P"), makeSymbol("WHAT-QUESTION-P"), makeSymbol("DATE-QUESTION-P") });

    public static final SubLSymbol SCENARIO_VIABLE_QUESTION_METHOD = makeSymbol("SCENARIO-VIABLE-QUESTION-METHOD");



    public static final SubLList $list28 = list(makeString("Initializes all class slots in question\n   @return scenario-p\n   @owner bertolo"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("PUNLESS"), makeSymbol("LEXICON"), list(makeSymbol("CSETQ"), makeSymbol("LEXICON"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("QUIRK-LEXICON"))))), list(makeSymbol("PUNLESS"), makeSymbol("PARSER"), list(makeSymbol("CSETQ"), makeSymbol("PARSER"), list(makeSymbol("NEW-CHARNIAK-PARSER"), makeKeyword("WARN"), makeInteger(30)))), list(makeSymbol("PUNLESS"), makeSymbol("TAGGER"), list(makeSymbol("CSETQ"), makeSymbol("TAGGER"), list(makeSymbol("GET-TAGGER")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym29$OUTER_CATCH_FOR_SCENARIO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SCENARIO-METHOD");

    public static final SubLSymbol QUIRK_LEXICON = makeSymbol("QUIRK-LEXICON");



    private static final SubLInteger $int$30 = makeInteger(30);

    public static final SubLSymbol SCENARIO_INITIALIZE_METHOD = makeSymbol("SCENARIO-INITIALIZE-METHOD");



    public static final SubLList $list35 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list36 = list(makeString("@return sparse-vector-p, a vector representation of this \n   @owner bertolo"), list(makeSymbol("PWHEN"), makeSymbol("VECTOR"), list(makeSymbol("RET"), makeSymbol("VECTOR"))), list(makeSymbol("CLET"), list(list(makeSymbol("AUGMENTED-STRING"), list(makeSymbol("CCONCATENATE"), makeSymbol("STRING"), list(makeSymbol("BUNGE"), makeSymbol("AUGMENTATION-TERMS")))), list(makeSymbol("NEW-VECTOR"), list(makeSymbol("NEW-STRING-VECTOR"), makeSymbol("AUGMENTED-STRING")))), list(makeSymbol("CSETQ"), makeSymbol("VECTOR"), makeSymbol("NEW-VECTOR")), list(makeSymbol("RET"), makeSymbol("NEW-VECTOR"))));

    public static final SubLSymbol $sym37$OUTER_CATCH_FOR_SCENARIO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SCENARIO-METHOD");

    public static final SubLSymbol SCENARIO_GET_VECTOR_METHOD = makeSymbol("SCENARIO-GET-VECTOR-METHOD");

    public static final SubLList $list39 = list(makeString("AQUAINT"));







    public static final SubLList $list43 = list(makeKeyword("PUBLIC"), makeKeyword("NO-MEMBER-VARIABLES"));

    public static final SubLList $list44 = list(makeString("@return essay-p, an essay to answer this \n   @owner bertolo"), list(makeSymbol("CLET"), list(list(makeSymbol("WORDS"), NIL), list(makeSymbol("PASSAGES"), NIL), makeSymbol("SCENARIO-QUERY")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ANSWERS")), NIL), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("AUGMENTATION-TERMS")), NIL), list(makeSymbol("CDOLIST"), list(makeSymbol("SENTENCE"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("SENTENCES")))), list(makeSymbol("SENTENCE-DO-WORDS"), list(makeSymbol("WORD"), makeSymbol("SENTENCE")), list(makeSymbol("CPUSH"), list(makeSymbol("WORD-STRING"), makeSymbol("WORD")), makeSymbol("WORDS")))), list(makeSymbol("CDOLIST"), list(makeSymbol("CORPUS"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("CORPORA")))), list(makeSymbol("CLET"), list(list(makeSymbol("AUGMENTED-TERMS"), list(makeSymbol("FCM"), list(makeSymbol("QUOTE"), makeSymbol("QUESTION")), list(makeSymbol("QUOTE"), makeSymbol("AUGMENT-TERMS")), makeSymbol("WORDS"), makeSymbol("CORPUS")))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("AUGMENTATION-TERMS")), list(makeSymbol("CONS"), list(makeSymbol("CONS"), makeSymbol("CORPUS"), makeSymbol("AUGMENTED-TERMS")), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("AUGMENTATION-TERMS"))))), list(makeSymbol("CSETQ"), makeSymbol("SCENARIO-QUERY"), list(makeSymbol("NEW-LEMUR-QUERY"), list(makeSymbol("BUNGE"), list(makeSymbol("APPEND"), makeSymbol("WORDS"), makeSymbol("AUGMENTED-TERMS"))), makeSymbol("CORPUS"), TEN_INTEGER, makeInteger(50))), list(makeSymbol("CDOLIST"), list(makeSymbol("PASSAGE"), list(makeSymbol("FIM"), makeSymbol("SCENARIO-QUERY"), list(makeSymbol("QUOTE"), makeSymbol("ANSWER")))), list(makeSymbol("CPUSH"), makeSymbol("PASSAGE"), makeSymbol("PASSAGES"))))), list(makeSymbol("RET"), list(makeSymbol("NEW-ESSAY"), makeSymbol("SELF"), list(makeSymbol("FCM"), list(makeSymbol("QUOTE"), makeSymbol("ESSAY")), list(makeSymbol("QUOTE"), makeSymbol("SELECT")), makeSymbol("PASSAGES"))))));





    private static final SubLInteger $int$50 = makeInteger(50);

    public static final SubLSymbol ESSAY = makeSymbol("ESSAY");



    public static final SubLSymbol SCENARIO_ANSWER_METHOD = makeSymbol("SCENARIO-ANSWER-METHOD");

    public static final SubLSymbol ANSWER_SUBQUESTIONS = makeSymbol("ANSWER-SUBQUESTIONS");

    public static final SubLList $list52 = list(makeSymbol("&OPTIONAL"), makeSymbol("VERBOSE"));

    public static final SubLList $list53 = list(makeString("@param VERBOSE, booleanp\n   @return scenario-p, this scenario\n   As a side effect it computes answers to all viable subquestions of this scenario and\n   stores them in the appropriate slot of this object.\n   @owner bertolo"), list(makeSymbol("CDOLIST"), list(makeSymbol("QUESTION"), makeSymbol("QUESTIONS")), list(makeSymbol("PWHEN"), list(makeSymbol("FCM"), list(makeSymbol("QUOTE"), makeSymbol("SCENARIO")), list(makeSymbol("QUOTE"), makeSymbol("VIABLE-QUESTION")), makeSymbol("QUESTION")), list(makeSymbol("CLET"), list(list(makeSymbol("Q-ANSWERS"), list(makeSymbol("FIM"), makeSymbol("QUESTION"), list(makeSymbol("QUOTE"), makeSymbol("ANSWER"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("Q-ANSWERS"), makeSymbol("VERBOSE")), list(makeSymbol("FORMAT"), T, makeString("~%~S has been answered: ~%"), makeSymbol("QUESTION")), list(makeSymbol("CDOLIST"), list(makeSymbol("ANSWER"), makeSymbol("Q-ANSWERS")), list(makeSymbol("FORMAT"), T, makeString("~%    ~S"), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTENT"))))), list(makeSymbol("FORMAT"), T, makeString("~%~%"), makeSymbol("QUESTION"))), list(makeSymbol("CSETQ"), makeSymbol("ANSWERS"), list(makeSymbol("APPEND"), makeSymbol("Q-ANSWERS"), makeSymbol("ANSWERS")))))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym54$OUTER_CATCH_FOR_SCENARIO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SCENARIO-METHOD");

    public static final SubLString $str55$___S_has_been_answered____ = makeString("~%~S has been answered: ~%");

    public static final SubLString $str56$_______S = makeString("~%    ~S");



    public static final SubLString $str58$____ = makeString("~%~%");

    public static final SubLSymbol SCENARIO_ANSWER_SUBQUESTIONS_METHOD = makeSymbol("SCENARIO-ANSWER-SUBQUESTIONS-METHOD");

    public static final SubLList $list60 = list(list(makeSymbol("SUBQUESTION-ANSWERS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("IDENTIFIED-ENTITIES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("SELECT"), list(makeSymbol("PASSAGES")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("TYPICAL-INSTANCE"), list(makeSymbol("PASSAGES")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("VIABLE-QUESTION"), list(makeSymbol("QUESTION")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RENDER"), list(makeSymbol("&OPTIONAL"), makeSymbol("RENDERING-P-LIST")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-SUBQUESTIONS"), NIL, makeKeyword("PROTECTED")));

    public static final SubLSymbol IDENTIFIED_ENTITIES = makeSymbol("IDENTIFIED-ENTITIES");

    public static final SubLSymbol SUBQUESTION_ANSWERS = makeSymbol("SUBQUESTION-ANSWERS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ESSAY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ESSAY-CLASS");







    public static final SubLSymbol RELEVANCE = makeSymbol("RELEVANCE");





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ESSAY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ESSAY-INSTANCE");

    public static final SubLList $list71 = list(makeSymbol("PASSAGES"));

    public static final SubLList $list72 = list(makeString("@param PASSAGES listp;\n     @return listp; the list of conses of the most salient passages among PASSAGES \n     and their confidences, ranked by their salientness.\n     @owner aldag"), list(makeSymbol("CHECK-TYPE"), makeSymbol("PASSAGES"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("SELECTED"), NIL), list(makeSymbol("REQUIRE-SIMILARITY"), makeDouble(0.3)), list(makeSymbol("CLUSTERS"), list(makeSymbol("CLUSTER"), makeSymbol("PASSAGES"), list(makeSymbol("QUOTE"), makeSymbol("PASSAGE-SIMILARITY")), ONE_INTEGER, makeSymbol("REQUIRE-SIMILARITY")))), list(makeSymbol("CDOLIST"), list(makeSymbol("CLUSTER"), makeSymbol("CLUSTERS")), list(makeSymbol("CLET"), list(list(makeSymbol("MAX-PASSAGES"), list(makeSymbol("FCM"), list(makeSymbol("QUOTE"), makeSymbol("CORPUS-PASSAGE")), list(makeSymbol("QUOTE"), makeSymbol("MAX-INSTANCES")), list(makeSymbol("CLUSTER-ELEMENTS"), makeSymbol("CLUSTER"))))), list(makeSymbol("CPUSH"), list(makeSymbol("FCM"), list(makeSymbol("QUOTE"), makeSymbol("ESSAY")), list(makeSymbol("QUOTE"), makeSymbol("TYPICAL-INSTANCE")), makeSymbol("MAX-PASSAGES")), makeSymbol("SELECTED")))), list(makeSymbol("RET"), makeSymbol("SELECTED"))));

    private static final SubLFloat $float$0_3 = makeDouble(0.3);

    public static final SubLSymbol PASSAGE_SIMILARITY = makeSymbol("PASSAGE-SIMILARITY");

    public static final SubLSymbol CORPUS_PASSAGE = makeSymbol("CORPUS-PASSAGE");

    public static final SubLSymbol MAX_INSTANCES = makeSymbol("MAX-INSTANCES");



    public static final SubLSymbol ESSAY_SELECT_METHOD = makeSymbol("ESSAY-SELECT-METHOD");

    public static final SubLList $list79 = list(makeString("@param ANSWERS listp\n    @return answer-p; the most typical answer among ANSWERS.\n    @owner aldag"), list(makeSymbol("CHECK-TYPE"), makeSymbol("PASSAGES"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("TYPICAL"), list(makeSymbol("FIRST"), makeSymbol("PASSAGES"))), list(makeSymbol("CENTROID"), list(makeSymbol("SVECTOR-CENTROID"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("GET-ABSTRACT-PASSAGE-VECTOR")), makeSymbol("PASSAGES")))), list(makeSymbol("CENTROID-LENGTH"), list(makeSymbol("SVECTOR-LENGTH"), makeSymbol("CENTROID")))), list(makeSymbol("PUNLESS"), list(makeSymbol("ZEROP"), makeSymbol("CENTROID-LENGTH")), list(makeSymbol("CLET"), list(list(makeSymbol("TYPICAL-VECTOR"), list(makeSymbol("GET-ABSTRACT-PASSAGE-VECTOR"), makeSymbol("TYPICAL"))), list(makeSymbol("MIN-DISTANCE"), list(makeSymbol("SAFE-SVECTOR-COSINE-ANGLE"), makeSymbol("TYPICAL-VECTOR"), makeSymbol("CENTROID"))), makeSymbol("DISTANCE")), list(makeSymbol("CDOLIST"), list(makeSymbol("PASSAGE"), makeSymbol("PASSAGES")), list(makeSymbol("CLET"), list(list(makeSymbol("PASSAGE-VECTOR"), list(makeSymbol("GET-ABSTRACT-PASSAGE-VECTOR"), makeSymbol("PASSAGE")))), list(makeSymbol("CSETQ"), makeSymbol("DISTANCE"), list(makeSymbol("SAFE-SVECTOR-COSINE-ANGLE"), makeSymbol("PASSAGE-VECTOR"), makeSymbol("CENTROID"))), list(makeSymbol("PWHEN"), list(makeSymbol(">"), makeSymbol("DISTANCE"), makeSymbol("MIN-DISTANCE")), list(makeSymbol("CSETQ"), makeSymbol("MIN-DISTANCE"), makeSymbol("DISTANCE")), list(makeSymbol("CSETQ"), makeSymbol("TYPICAL"), makeSymbol("PASSAGE"))))))), list(makeSymbol("RET"), makeSymbol("TYPICAL"))));

    public static final SubLSymbol GET_ABSTRACT_PASSAGE_VECTOR = makeSymbol("GET-ABSTRACT-PASSAGE-VECTOR");

    public static final SubLSymbol ESSAY_TYPICAL_INSTANCE_METHOD = makeSymbol("ESSAY-TYPICAL-INSTANCE-METHOD");

    public static final SubLSymbol KEY_POINTS = makeSymbol("KEY-POINTS");



    public static final SubLList $list84 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    public static final SubLList $list85 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<ESSAY sources:"), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), list(makeSymbol("LENGTH"), makeSymbol("CONTENT")), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(" entities:"), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), list(makeSymbol("LENGTH"), makeSymbol("IDENTIFIED-ENTITIES")), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")), list(makeSymbol("TERPRI"), makeSymbol("STREAM")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym86$OUTER_CATCH_FOR_ESSAY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ESSAY-METHOD");

    public static final SubLString $str87$__ESSAY_sources_ = makeString("#<ESSAY sources:");

    public static final SubLString $str88$_entities_ = makeString(" entities:");

    public static final SubLString $str89$_ = makeString(">");

    public static final SubLSymbol ESSAY_PRINT_METHOD = makeSymbol("ESSAY-PRINT-METHOD");

    public static final SubLSymbol CHRONOLOGY = makeSymbol("CHRONOLOGY");

    public static final SubLList $list92 = list(list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("RENDER")), list(makeSymbol("QUOTE"), list(makeKeyword("FORMAT"), makeKeyword("TEXT"), makeKeyword("ORDER"), makeKeyword("CHRONOLOGICAL"))))));

    public static final SubLSymbol RENDER = makeSymbol("RENDER");

    public static final SubLList $list94 = list(makeKeyword("FORMAT"), makeKeyword("TEXT"), makeKeyword("ORDER"), makeKeyword("CHRONOLOGICAL"));

    public static final SubLSymbol ESSAY_CHRONOLOGY_METHOD = makeSymbol("ESSAY-CHRONOLOGY-METHOD");

    public static final SubLList $list96 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("STRATEGY"), list(makeSymbol("QUOTE"), list(makeKeyword("FORMAT"), makeKeyword("TEXT"), makeKeyword("ORDER"), makeKeyword("SEQUENTIAL")))));

    public static final SubLList $list97 = list(list(makeSymbol("CLET"), list(list(makeSymbol("FORMAT"), list(makeSymbol("GETF"), makeSymbol("STRATEGY"), makeKeyword("FORMAT"))), list(makeSymbol("ORDER"), list(makeSymbol("GETF"), makeSymbol("STRATEGY"), makeKeyword("ORDER"))), makeSymbol("ACCUMULATOR")), list(makeSymbol("PCASE"), makeSymbol("FORMAT"), list(makeKeyword("TEXT"), list(makeSymbol("CSETQ"), makeSymbol("ACCUMULATOR"), makeString("")))), list(makeSymbol("PCASE"), makeSymbol("ORDER"), list(makeKeyword("SEQUENTIAL"), list(makeSymbol("CDOLIST"), list(makeSymbol("PASSAGE"), makeSymbol("CONTENT")), list(makeSymbol("CSETQ"), makeSymbol("ACCUMULATOR"), list(new SubLObject[]{ makeSymbol("CCONCATENATE"), makeSymbol("ACCUMULATOR"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTENT"))), makeSymbol("*NEW-LINE-STRING*"), makeString("("), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SOURCE"))), makeString(")"), makeSymbol("*NEW-LINE-STRING*"), makeSymbol("*NEW-LINE-STRING*") })))), list(makeKeyword("CHRONOLOGICAL"), list(makeSymbol("CLET"), list(list(makeSymbol("SORTED"), list(makeSymbol("SORT"), list(makeSymbol("COPY-LIST"), makeSymbol("CONTENT")), list(makeSymbol("QUOTE"), makeSymbol("ABSTRACT-PASSAGE-OLDER-METHOD"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("PASSAGE"), makeSymbol("SORTED")), list(makeSymbol("CSETQ"), makeSymbol("ACCUMULATOR"), list(new SubLObject[]{ makeSymbol("CCONCATENATE"), makeSymbol("ACCUMULATOR"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTENT"))), makeSymbol("*NEW-LINE-STRING*"), makeString("("), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SOURCE"))), makeString(")"), makeSymbol("*NEW-LINE-STRING*"), makeSymbol("*NEW-LINE-STRING*") })))))), list(makeSymbol("RET"), makeSymbol("ACCUMULATOR"))));

    public static final SubLList $list98 = list(makeKeyword("FORMAT"), makeKeyword("TEXT"), makeKeyword("ORDER"), makeKeyword("SEQUENTIAL"));

    public static final SubLSymbol $sym99$OUTER_CATCH_FOR_ESSAY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ESSAY-METHOD");







    public static final SubLString $str103$ = makeString("");



    public static final SubLString $str105$_ = makeString("(");



    public static final SubLString $str107$_ = makeString(")");



    public static final SubLSymbol ABSTRACT_PASSAGE_OLDER_METHOD = makeSymbol("ABSTRACT-PASSAGE-OLDER-METHOD");

    public static final SubLSymbol ESSAY_RENDER_METHOD = makeSymbol("ESSAY-RENDER-METHOD");

    public static final SubLList $list111 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("QUESTION"), list(makeSymbol("GET-SLOT"), makeSymbol("INFO-REQUEST"), list(makeSymbol("QUOTE"), makeSymbol("QUESTIONS")))), list(makeSymbol("PWHEN"), list(makeSymbol("FCM"), list(makeSymbol("QUOTE"), makeSymbol("ESSAY")), list(makeSymbol("QUOTE"), makeSymbol("VIABLE-QUESTION")), makeSymbol("QUESTION")), list(makeSymbol("CDOLIST"), list(makeSymbol("PASSAGE"), makeSymbol("CONTENT")), list(makeSymbol("CLET"), list(list(makeSymbol("ANSWERS"), list(makeSymbol("FIM"), makeSymbol("QUESTION"), list(makeSymbol("QUOTE"), makeSymbol("EXTRACT")), makeSymbol("PASSAGE")))), list(makeSymbol("PWHEN"), makeSymbol("ANSWERS"), list(makeSymbol("CSETQ"), makeSymbol("SUBQUESTION-ANSWERS"), list(makeSymbol("APPEND"), list(makeSymbol("FCM"), list(makeSymbol("CAR"), makeSymbol("ANSWERS")), list(makeSymbol("QUOTE"), makeSymbol("SELECT")), makeSymbol("ANSWERS")), makeSymbol("SUBQUESTION-ANSWERS")))))))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym112$OUTER_CATCH_FOR_ESSAY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ESSAY-METHOD");



    public static final SubLSymbol ESSAY_ANSWER_SUBQUESTIONS_METHOD = makeSymbol("ESSAY-ANSWER-SUBQUESTIONS-METHOD");

    public static final SubLSymbol BACKGROUND_IDENTIFY_ENTITIES = makeSymbol("BACKGROUND-IDENTIFY-ENTITIES");

    public static final SubLList $list116 = list(list(makeSymbol("NEW-TASK"), list(makeSymbol("FORMAT"), NIL, makeString("~S"), list(makeSymbol("GENSYM"))), list(makeSymbol("QUOTE"), makeSymbol("ESSAY-IDENTIFY-ENTITIES-METHOD")), list(makeSymbol("BQ-LIST"), makeSymbol("SELF"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLString $str117$_S = makeString("~S");

    public static final SubLSymbol ESSAY_IDENTIFY_ENTITIES_METHOD = makeSymbol("ESSAY-IDENTIFY-ENTITIES-METHOD");

    public static final SubLSymbol ESSAY_BACKGROUND_IDENTIFY_ENTITIES_METHOD = makeSymbol("ESSAY-BACKGROUND-IDENTIFY-ENTITIES-METHOD");

    public static final SubLSymbol GET_ENTITY_BY_NAME = makeSymbol("GET-ENTITY-BY-NAME");

    public static final SubLList $list121 = list(makeSymbol("NAME"));

    public static final SubLList $list122 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("NAME"), makeSymbol("STRINGP")), list(makeSymbol("CLET"), list(makeSymbol("NAMED-ENTITY")), list(makeSymbol("CSOME"), list(makeSymbol("ENTITY"), makeSymbol("IDENTIFIED-ENTITIES"), makeSymbol("NAMED-ENTITY")), list(makeSymbol("PWHEN"), list(EQUALP, makeSymbol("NAME"), list(makeSymbol("GET-SLOT"), makeSymbol("ENTITY"), list(makeSymbol("QUOTE"), makeSymbol("STRING")))), list(makeSymbol("CSETQ"), makeSymbol("NAMED-ENTITY"), makeSymbol("ENTITY")))), list(makeSymbol("RET"), makeSymbol("NAMED-ENTITY"))));

    public static final SubLSymbol $sym123$OUTER_CATCH_FOR_ESSAY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ESSAY-METHOD");

    public static final SubLSymbol ESSAY_GET_ENTITY_BY_NAME_METHOD = makeSymbol("ESSAY-GET-ENTITY-BY-NAME-METHOD");

    public static final SubLSymbol GET_ENTITIES_BY_TYPES = makeSymbol("GET-ENTITIES-BY-TYPES");

    public static final SubLList $list126 = list(makeSymbol("DESIRED-TYPES"));

    public static final SubLList $list127 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("DESIRED-TYPES"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("APPROPRIATE-ENTITIES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("ENTITY"), makeSymbol("IDENTIFIED-ENTITIES")), list(makeSymbol("WITH-ALL-MTS"), list(makeSymbol("PWHEN"), list(makeSymbol("ANY-GENL-ANY?"), list(makeSymbol("FIM"), makeSymbol("ENTITY"), list(makeSymbol("QUOTE"), makeSymbol("ALL-TYPES"))), makeSymbol("DESIRED-TYPES")), list(makeSymbol("CPUSH"), makeSymbol("ENTITY"), makeSymbol("APPROPRIATE-ENTITIES"))))), list(makeSymbol("RET"), makeSymbol("APPROPRIATE-ENTITIES"))));

    public static final SubLSymbol $sym128$OUTER_CATCH_FOR_ESSAY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ESSAY-METHOD");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    public static final SubLSymbol ESSAY_GET_ENTITIES_BY_TYPES_METHOD = makeSymbol("ESSAY-GET-ENTITIES-BY-TYPES-METHOD");

    public static final SubLSymbol IDENTIFY_ENTITIES = makeSymbol("IDENTIFY-ENTITIES");

    public static final SubLList $list134 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("TYPES-TO-IDENTIFY"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("Person")), reader_make_constant_shell(makeString("Place")), reader_make_constant_shell(makeString("Organization"))))));

    public static final SubLList $list135 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("TYPES-TO-IDENTIFY"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("LEXICON"), list(makeSymbol("GET-SLOT"), makeSymbol("INFO-REQUEST"), list(makeSymbol("QUOTE"), makeSymbol("LEXICON")))), list(makeSymbol("ENTITIES-HASH"), list(makeSymbol("MAKE-HASH-TABLE"), makeInteger(32), list(makeSymbol("FUNCTION"), EQUAL)))), list(makeSymbol("CDOLIST"), list(makeSymbol("PASSAGE"), makeSymbol("CONTENT")), list(makeSymbol("CLET"), list(list(makeSymbol("PASSAGE-ENTITIES"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(makeSymbol("QUOTE"), makeSymbol("IDENTIFY-ENTITIES")), makeSymbol("LEXICON"), makeSymbol("TYPES-TO-IDENTIFY")))), list(makeSymbol("CDOLIST"), list(makeSymbol("ENTITY"), makeSymbol("PASSAGE-ENTITIES")), list(makeSymbol("CLET"), list(list(makeSymbol("STRING"), list(makeSymbol("GET-SLOT"), makeSymbol("ENTITY"), list(makeSymbol("QUOTE"), makeSymbol("STRING")))), list(makeSymbol("VALUE"), list(makeSymbol("GETHASH"), makeSymbol("STRING"), makeSymbol("ENTITIES-HASH")))), list(makeSymbol("PIF"), makeSymbol("VALUE"), list(makeSymbol("FIM"), makeSymbol("VALUE"), list(makeSymbol("QUOTE"), makeSymbol("ADD-PASSAGE")), makeSymbol("PASSAGE")), list(makeSymbol("SETHASH"), makeSymbol("STRING"), makeSymbol("ENTITIES-HASH"), makeSymbol("ENTITY"))))))), list(makeSymbol("CDOHASH"), list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("ENTITIES-HASH")), list(makeSymbol("IGNORE"), makeSymbol("KEY")), list(makeSymbol("CPUSHNEW"), makeSymbol("VALUE"), makeSymbol("IDENTIFIED-ENTITIES"), list(makeSymbol("QUOTE"), makeSymbol("TEXTUAL-FOCUS-ENTITY-EQUAL")))), list(makeSymbol("RET"), makeSymbol("IDENTIFIED-ENTITIES"))));

    public static final SubLList $list136 = list(reader_make_constant_shell(makeString("Person")), reader_make_constant_shell(makeString("Place")), reader_make_constant_shell(makeString("Organization")));

    public static final SubLSymbol $sym137$OUTER_CATCH_FOR_ESSAY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ESSAY-METHOD");



    public static final SubLSymbol ADD_PASSAGE = makeSymbol("ADD-PASSAGE");

    public static final SubLSymbol TEXTUAL_FOCUS_ENTITY_EQUAL = makeSymbol("TEXTUAL-FOCUS-ENTITY-EQUAL");

    public static final SubLSymbol SPARSE_VECTOR_P = makeSymbol("SPARSE-VECTOR-P");

    public static SubLObject get_scenario_answers(final SubLObject v_scenario) {
        return classes.subloop_get_access_protected_instance_slot(v_scenario, NINE_INTEGER, ANSWERS);
    }

    public static SubLObject set_scenario_answers(final SubLObject v_scenario, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_scenario, value, NINE_INTEGER, ANSWERS);
    }

    public static SubLObject get_scenario_questions(final SubLObject v_scenario) {
        return classes.subloop_get_access_protected_instance_slot(v_scenario, EIGHT_INTEGER, QUESTIONS);
    }

    public static SubLObject set_scenario_questions(final SubLObject v_scenario, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_scenario, value, EIGHT_INTEGER, QUESTIONS);
    }

    public static SubLObject get_scenario_vector(final SubLObject v_scenario) {
        return classes.subloop_get_access_protected_instance_slot(v_scenario, SEVEN_INTEGER, VECTOR);
    }

    public static SubLObject set_scenario_vector(final SubLObject v_scenario, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_scenario, value, SEVEN_INTEGER, VECTOR);
    }

    public static SubLObject get_scenario_augmentation_terms(final SubLObject v_scenario) {
        return classes.subloop_get_access_protected_instance_slot(v_scenario, SIX_INTEGER, AUGMENTATION_TERMS);
    }

    public static SubLObject set_scenario_augmentation_terms(final SubLObject v_scenario, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_scenario, value, SIX_INTEGER, AUGMENTATION_TERMS);
    }

    public static SubLObject get_scenario_sentences(final SubLObject v_scenario) {
        return classes.subloop_get_access_protected_instance_slot(v_scenario, FIVE_INTEGER, SENTENCES);
    }

    public static SubLObject set_scenario_sentences(final SubLObject v_scenario, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_scenario, value, FIVE_INTEGER, SENTENCES);
    }

    public static SubLObject get_scenario_corpora(final SubLObject v_scenario) {
        return classes.subloop_get_access_protected_instance_slot(v_scenario, FOUR_INTEGER, CORPORA);
    }

    public static SubLObject set_scenario_corpora(final SubLObject v_scenario, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_scenario, value, FOUR_INTEGER, CORPORA);
    }

    public static SubLObject get_scenario_string(final SubLObject v_scenario) {
        return classes.subloop_get_access_protected_instance_slot(v_scenario, THREE_INTEGER, STRING);
    }

    public static SubLObject set_scenario_string(final SubLObject v_scenario, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_scenario, value, THREE_INTEGER, STRING);
    }

    public static SubLObject get_scenario_tagger(final SubLObject v_scenario) {
        final SubLObject v_class = (v_scenario.isSymbol()) ? classes.classes_retrieve_class(v_scenario) : NIL != subloop_structures.class_p(v_scenario) ? v_scenario : NIL != subloop_structures.instance_p(v_scenario) ? subloop_structures.instance_class(v_scenario) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(TAGGER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_scenario_tagger(final SubLObject v_scenario, final SubLObject value) {
        final SubLObject v_class = (v_scenario.isSymbol()) ? classes.classes_retrieve_class(v_scenario) : NIL != subloop_structures.class_p(v_scenario) ? v_scenario : NIL != subloop_structures.instance_p(v_scenario) ? subloop_structures.instance_class(v_scenario) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(TAGGER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_scenario_parser(final SubLObject v_scenario) {
        final SubLObject v_class = (v_scenario.isSymbol()) ? classes.classes_retrieve_class(v_scenario) : NIL != subloop_structures.class_p(v_scenario) ? v_scenario : NIL != subloop_structures.instance_p(v_scenario) ? subloop_structures.instance_class(v_scenario) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(PARSER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_scenario_parser(final SubLObject v_scenario, final SubLObject value) {
        final SubLObject v_class = (v_scenario.isSymbol()) ? classes.classes_retrieve_class(v_scenario) : NIL != subloop_structures.class_p(v_scenario) ? v_scenario : NIL != subloop_structures.instance_p(v_scenario) ? subloop_structures.instance_class(v_scenario) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(PARSER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_scenario_lexicon(final SubLObject v_scenario) {
        final SubLObject v_class = (v_scenario.isSymbol()) ? classes.classes_retrieve_class(v_scenario) : NIL != subloop_structures.class_p(v_scenario) ? v_scenario : NIL != subloop_structures.instance_p(v_scenario) ? subloop_structures.instance_class(v_scenario) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(LEXICON, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_scenario_lexicon(final SubLObject v_scenario, final SubLObject value) {
        final SubLObject v_class = (v_scenario.isSymbol()) ? classes.classes_retrieve_class(v_scenario) : NIL != subloop_structures.class_p(v_scenario) ? v_scenario : NIL != subloop_structures.instance_p(v_scenario) ? subloop_structures.instance_class(v_scenario) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(LEXICON, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_scenario_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, SCENARIO, LEXICON, NIL);
        classes.subloop_initialize_slot(new_instance, SCENARIO, PARSER, NIL);
        classes.subloop_initialize_slot(new_instance, SCENARIO, TAGGER, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_scenario_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, SCENARIO, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, SCENARIO, CORPORA, NIL);
        classes.subloop_initialize_slot(new_instance, SCENARIO, SENTENCES, NIL);
        classes.subloop_initialize_slot(new_instance, SCENARIO, AUGMENTATION_TERMS, NIL);
        classes.subloop_initialize_slot(new_instance, SCENARIO, VECTOR, NIL);
        classes.subloop_initialize_slot(new_instance, SCENARIO, QUESTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, SCENARIO, ANSWERS, NIL);
        return NIL;
    }

    public static SubLObject scenario_p(final SubLObject v_scenario) {
        return classes.subloop_instanceof_class(v_scenario, SCENARIO);
    }

    public static SubLObject scenario_viable_question_method(final SubLObject self, final SubLObject v_question) {
        SubLObject viable = NIL;
        if (NIL == viable) {
            SubLObject csome_list_var;
            SubLObject pred;
            for (csome_list_var = $list25, pred = NIL, pred = csome_list_var.first(); (NIL == viable) && (NIL != csome_list_var); viable = funcall(pred, v_question) , csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
            }
        }
        return viable;
    }

    public static SubLObject scenario_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scenario_method = NIL;
        SubLObject tagger = get_scenario_tagger(self);
        SubLObject v_parser = get_scenario_parser(self);
        SubLObject lexicon = get_scenario_lexicon(self);
        try {
            thread.throwStack.push($sym29$OUTER_CATCH_FOR_SCENARIO_METHOD);
            try {
                search_engine.information_request_initialize_method(self);
                if (NIL == lexicon) {
                    lexicon = object.new_class_instance(QUIRK_LEXICON);
                }
                if (NIL == v_parser) {
                    v_parser = parser.new_charniak_parser($WARN, $int$30);
                }
                if (NIL == tagger) {
                    tagger = pos_tagger.get_tagger();
                }
                sublisp_throw($sym29$OUTER_CATCH_FOR_SCENARIO_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_scenario_tagger(self, tagger);
                    set_scenario_parser(self, v_parser);
                    set_scenario_lexicon(self, lexicon);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_scenario_method = Errors.handleThrowable(ccatch_env_var, $sym29$OUTER_CATCH_FOR_SCENARIO_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scenario_method;
    }

    public static SubLObject scenario_get_vector_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scenario_method = NIL;
        SubLObject vector = get_scenario_vector(self);
        final SubLObject augmentation_terms = get_scenario_augmentation_terms(self);
        final SubLObject string = get_scenario_string(self);
        try {
            thread.throwStack.push($sym37$OUTER_CATCH_FOR_SCENARIO_METHOD);
            try {
                if (NIL != vector) {
                    sublisp_throw($sym37$OUTER_CATCH_FOR_SCENARIO_METHOD, vector);
                }
                final SubLObject augmented_string = cconcatenate(string, string_utilities.bunge(augmentation_terms, UNPROVIDED));
                final SubLObject new_vector = vector = question.new_string_vector(augmented_string);
                sublisp_throw($sym37$OUTER_CATCH_FOR_SCENARIO_METHOD, new_vector);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_scenario_vector(self, vector);
                    set_scenario_augmentation_terms(self, augmentation_terms);
                    set_scenario_string(self, string);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_scenario_method = Errors.handleThrowable(ccatch_env_var, $sym37$OUTER_CATCH_FOR_SCENARIO_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scenario_method;
    }

    public static SubLObject new_scenario(final SubLObject scenario_string, SubLObject corpora) {
        if (corpora == UNPROVIDED) {
            corpora = $list39;
        }
        assert NIL != stringp(scenario_string) : "Types.stringp(scenario_string) " + "CommonSymbols.NIL != Types.stringp(scenario_string) " + scenario_string;
        assert NIL != listp(corpora) : "Types.listp(corpora) " + "CommonSymbols.NIL != Types.listp(corpora) " + corpora;
        question.initialize_question();
        final SubLObject v_scenario = object.new_class_instance(SCENARIO);
        SubLObject sentences = NIL;
        SubLObject questions = NIL;
        instances.set_slot(v_scenario, STRING, scenario_string);
        instances.set_slot(v_scenario, CORPORA, corpora);
        final SubLObject vector_var = document.paragraph_sentences(document.new_paragraph(scenario_string));
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sentence;
        SubLObject q;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            sentence = aref(vector_var, element_num);
            q = question.new_question(string_utilities.bunge(document.sentence_stringify(sentence), UNPROVIDED), UNPROVIDED, UNPROVIDED);
            sentences = cons(sentence, sentences);
            if (NIL != question.question_p(q)) {
                questions = cons(q, questions);
            }
        }
        instances.set_slot(v_scenario, SENTENCES, nreverse(sentences));
        instances.set_slot(v_scenario, QUESTIONS, nreverse(questions));
        return v_scenario;
    }

    public static SubLObject scenario_answer_method(final SubLObject self) {
        SubLObject words = NIL;
        SubLObject passages = NIL;
        SubLObject scenario_query = NIL;
        instances.set_slot(self, ANSWERS, NIL);
        instances.set_slot(self, AUGMENTATION_TERMS, NIL);
        SubLObject cdolist_list_var = instances.get_slot(self, SENTENCES);
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = document.sentence_yield_exhaustive(sentence);
            SubLObject word = NIL;
            word = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                words = cons(document.word_string(word), words);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                word = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        cdolist_list_var = instances.get_slot(self, CORPORA);
        SubLObject corpus = NIL;
        corpus = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject augmented_terms = methods.funcall_class_method_with_2_args(QUESTION, AUGMENT_TERMS, words, corpus);
            instances.set_slot(self, AUGMENTATION_TERMS, cons(cons(corpus, augmented_terms), instances.get_slot(self, AUGMENTATION_TERMS)));
            scenario_query = search_engine.new_lemur_query(string_utilities.bunge(append(words, augmented_terms), UNPROVIDED), corpus, TEN_INTEGER, $int$50);
            SubLObject cdolist_list_var_$2 = methods.funcall_instance_method_with_0_args(scenario_query, ANSWER);
            SubLObject passage = NIL;
            passage = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                passages = cons(passage, passages);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                passage = cdolist_list_var_$2.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            corpus = cdolist_list_var.first();
        } 
        return new_essay(self, methods.funcall_class_method_with_1_args(ESSAY, SELECT, passages), UNPROVIDED);
    }

    public static SubLObject scenario_answer_subquestions_method(final SubLObject self, SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scenario_method = NIL;
        SubLObject answers = get_scenario_answers(self);
        final SubLObject questions = get_scenario_questions(self);
        try {
            thread.throwStack.push($sym54$OUTER_CATCH_FOR_SCENARIO_METHOD);
            try {
                SubLObject cdolist_list_var = questions;
                SubLObject v_question = NIL;
                v_question = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != methods.funcall_class_method_with_1_args(SCENARIO, VIABLE_QUESTION, v_question)) {
                        final SubLObject q_answers = methods.funcall_instance_method_with_0_args(v_question, ANSWER);
                        if ((NIL != q_answers) && (NIL != verbose)) {
                            format(T, $str55$___S_has_been_answered____, v_question);
                            SubLObject cdolist_list_var_$3 = q_answers;
                            SubLObject v_answer = NIL;
                            v_answer = cdolist_list_var_$3.first();
                            while (NIL != cdolist_list_var_$3) {
                                format(T, $str56$_______S, methods.funcall_instance_method_with_0_args(v_answer, GET_CONTENT));
                                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                                v_answer = cdolist_list_var_$3.first();
                            } 
                            format(T, $str58$____, v_question);
                        }
                        answers = append(q_answers, answers);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_question = cdolist_list_var.first();
                } 
                sublisp_throw($sym54$OUTER_CATCH_FOR_SCENARIO_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_scenario_answers(self, answers);
                    set_scenario_questions(self, questions);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_scenario_method = Errors.handleThrowable(ccatch_env_var, $sym54$OUTER_CATCH_FOR_SCENARIO_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scenario_method;
    }

    public static SubLObject get_essay_identified_entities(final SubLObject essay) {
        return classes.subloop_get_access_protected_instance_slot(essay, EIGHT_INTEGER, IDENTIFIED_ENTITIES);
    }

    public static SubLObject set_essay_identified_entities(final SubLObject essay, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(essay, value, EIGHT_INTEGER, IDENTIFIED_ENTITIES);
    }

    public static SubLObject get_essay_subquestion_answers(final SubLObject essay) {
        return classes.subloop_get_access_protected_instance_slot(essay, SEVEN_INTEGER, SUBQUESTION_ANSWERS);
    }

    public static SubLObject set_essay_subquestion_answers(final SubLObject essay, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(essay, value, SEVEN_INTEGER, SUBQUESTION_ANSWERS);
    }

    public static SubLObject subloop_reserved_initialize_essay_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_essay_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, INFO_REQUEST, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, CONTENT, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, CONFIDENCE, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, RELEVANCE, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, JUSTIFICATION, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, INFO, NIL);
        classes.subloop_initialize_slot(new_instance, ESSAY, SUBQUESTION_ANSWERS, NIL);
        classes.subloop_initialize_slot(new_instance, ESSAY, IDENTIFIED_ENTITIES, NIL);
        return NIL;
    }

    public static SubLObject essay_p(final SubLObject essay) {
        return classes.subloop_instanceof_class(essay, ESSAY);
    }

    public static SubLObject essay_select_method(final SubLObject self, final SubLObject passages) {
        assert NIL != listp(passages) : "Types.listp(passages) " + "CommonSymbols.NIL != Types.listp(passages) " + passages;
        SubLObject selected = NIL;
        final SubLObject require_similarity = $float$0_3;
        SubLObject cdolist_list_var;
        final SubLObject clusters = cdolist_list_var = clustering.cluster(passages, PASSAGE_SIMILARITY, ONE_INTEGER, require_similarity);
        SubLObject cluster = NIL;
        cluster = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject max_passages = methods.funcall_class_method_with_1_args(CORPUS_PASSAGE, MAX_INSTANCES, clustering.cluster_elements(cluster));
            selected = cons(methods.funcall_class_method_with_1_args(ESSAY, TYPICAL_INSTANCE, max_passages), selected);
            cdolist_list_var = cdolist_list_var.rest();
            cluster = cdolist_list_var.first();
        } 
        return selected;
    }

    public static SubLObject essay_typical_instance_method(final SubLObject self, final SubLObject passages) {
        assert NIL != listp(passages) : "Types.listp(passages) " + "CommonSymbols.NIL != Types.listp(passages) " + passages;
        SubLObject typical = passages.first();
        final SubLObject centroid = sparse_vector.svector_centroid(Mapping.mapcar(GET_ABSTRACT_PASSAGE_VECTOR, passages));
        final SubLObject centroid_length = sparse_vector.svector_length(centroid);
        if (!centroid_length.isZero()) {
            final SubLObject typical_vector = search_engine.get_abstract_passage_vector(typical);
            SubLObject min_distance = safe_svector_cosine_angle(typical_vector, centroid, UNPROVIDED);
            SubLObject distance = NIL;
            SubLObject cdolist_list_var = passages;
            SubLObject passage = NIL;
            passage = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject passage_vector = search_engine.get_abstract_passage_vector(passage);
                distance = safe_svector_cosine_angle(passage_vector, centroid, UNPROVIDED);
                if (distance.numG(min_distance)) {
                    min_distance = distance;
                    typical = passage;
                }
                cdolist_list_var = cdolist_list_var.rest();
                passage = cdolist_list_var.first();
            } 
        }
        return typical;
    }

    public static SubLObject new_essay(final SubLObject info_request, final SubLObject passages, SubLObject key_points) {
        if (key_points == UNPROVIDED) {
            key_points = NIL;
        }
        final SubLObject essay = object.new_class_instance(ESSAY);
        answer.set_answer_info_request(essay, info_request);
        answer.set_answer_content(essay, passages);
        instances.set_slot(essay, KEY_POINTS, key_points);
        return essay;
    }

    public static SubLObject essay_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_essay_method = NIL;
        final SubLObject identified_entities = get_essay_identified_entities(self);
        final SubLObject content = answer.get_answer_content(self);
        try {
            thread.throwStack.push($sym86$OUTER_CATCH_FOR_ESSAY_METHOD);
            try {
                write_string($str87$__ESSAY_sources_, stream, UNPROVIDED, UNPROVIDED);
                prin1(length(content), stream);
                write_string($str88$_entities_, stream, UNPROVIDED, UNPROVIDED);
                prin1(length(identified_entities), stream);
                write_string($str89$_, stream, UNPROVIDED, UNPROVIDED);
                terpri(stream);
                sublisp_throw($sym86$OUTER_CATCH_FOR_ESSAY_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_essay_identified_entities(self, identified_entities);
                    answer.set_answer_content(self, content);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_essay_method = Errors.handleThrowable(ccatch_env_var, $sym86$OUTER_CATCH_FOR_ESSAY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_essay_method;
    }

    public static SubLObject essay_chronology_method(final SubLObject self) {
        return methods.funcall_instance_method_with_1_args(self, RENDER, $list94);
    }

    public static SubLObject essay_render_method(final SubLObject self, SubLObject strategy) {
        if (strategy == UNPROVIDED) {
            strategy = $list98;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_essay_method = NIL;
        final SubLObject content = answer.get_answer_content(self);
        try {
            thread.throwStack.push($sym99$OUTER_CATCH_FOR_ESSAY_METHOD);
            try {
                final SubLObject format = getf(strategy, $FORMAT, UNPROVIDED);
                final SubLObject order = getf(strategy, $ORDER, UNPROVIDED);
                SubLObject accumulator = NIL;
                SubLObject pcase_var = format;
                if (pcase_var.eql($TEXT)) {
                    accumulator = $str103$;
                }
                pcase_var = order;
                if (pcase_var.eql($SEQUENTIAL)) {
                    SubLObject cdolist_list_var = content;
                    SubLObject passage = NIL;
                    passage = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        accumulator = cconcatenate(accumulator, new SubLObject[]{ methods.funcall_instance_method_with_0_args(passage, GET_CONTENT), string_utilities.$new_line_string$.getGlobalValue(), $str105$_, methods.funcall_instance_method_with_0_args(passage, GET_SOURCE), $str107$_, string_utilities.$new_line_string$.getGlobalValue(), string_utilities.$new_line_string$.getGlobalValue() });
                        cdolist_list_var = cdolist_list_var.rest();
                        passage = cdolist_list_var.first();
                    } 
                } else
                    if (pcase_var.eql($CHRONOLOGICAL)) {
                        SubLObject cdolist_list_var2;
                        final SubLObject sorted = cdolist_list_var2 = Sort.sort(copy_list(content), ABSTRACT_PASSAGE_OLDER_METHOD, UNPROVIDED);
                        SubLObject passage2 = NIL;
                        passage2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            accumulator = cconcatenate(accumulator, new SubLObject[]{ methods.funcall_instance_method_with_0_args(passage2, GET_CONTENT), string_utilities.$new_line_string$.getGlobalValue(), $str105$_, methods.funcall_instance_method_with_0_args(passage2, GET_SOURCE), $str107$_, string_utilities.$new_line_string$.getGlobalValue(), string_utilities.$new_line_string$.getGlobalValue() });
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            passage2 = cdolist_list_var2.first();
                        } 
                    }

                sublisp_throw($sym99$OUTER_CATCH_FOR_ESSAY_METHOD, accumulator);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    answer.set_answer_content(self, content);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_essay_method = Errors.handleThrowable(ccatch_env_var, $sym99$OUTER_CATCH_FOR_ESSAY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_essay_method;
    }

    public static SubLObject essay_answer_subquestions_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_essay_method = NIL;
        SubLObject subquestion_answers = get_essay_subquestion_answers(self);
        final SubLObject content = answer.get_answer_content(self);
        final SubLObject info_request = answer.get_answer_info_request(self);
        try {
            thread.throwStack.push($sym112$OUTER_CATCH_FOR_ESSAY_METHOD);
            try {
                SubLObject cdolist_list_var = instances.get_slot(info_request, QUESTIONS);
                SubLObject v_question = NIL;
                v_question = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != methods.funcall_class_method_with_1_args(ESSAY, VIABLE_QUESTION, v_question)) {
                        SubLObject cdolist_list_var_$4 = content;
                        SubLObject passage = NIL;
                        passage = cdolist_list_var_$4.first();
                        while (NIL != cdolist_list_var_$4) {
                            final SubLObject answers = methods.funcall_instance_method_with_1_args(v_question, EXTRACT, passage);
                            if (NIL != answers) {
                                subquestion_answers = append(methods.funcall_class_method_with_1_args(answers.first(), SELECT, answers), subquestion_answers);
                            }
                            cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                            passage = cdolist_list_var_$4.first();
                        } 
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_question = cdolist_list_var.first();
                } 
                sublisp_throw($sym112$OUTER_CATCH_FOR_ESSAY_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_essay_subquestion_answers(self, subquestion_answers);
                    answer.set_answer_content(self, content);
                    answer.set_answer_info_request(self, info_request);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_essay_method = Errors.handleThrowable(ccatch_env_var, $sym112$OUTER_CATCH_FOR_ESSAY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_essay_method;
    }

    public static SubLObject essay_background_identify_entities_method(final SubLObject self) {
        process_utilities.new_task(format(NIL, $str117$_S, gensym(UNPROVIDED)), ESSAY_IDENTIFY_ENTITIES_METHOD, list(self), UNPROVIDED);
        return self;
    }

    public static SubLObject essay_get_entity_by_name_method(final SubLObject self, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_essay_method = NIL;
        final SubLObject identified_entities = get_essay_identified_entities(self);
        try {
            thread.throwStack.push($sym123$OUTER_CATCH_FOR_ESSAY_METHOD);
            try {
                assert NIL != stringp(name) : "Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) " + name;
                SubLObject named_entity = NIL;
                if (NIL == named_entity) {
                    SubLObject csome_list_var = identified_entities;
                    SubLObject entity = NIL;
                    entity = csome_list_var.first();
                    while ((NIL == named_entity) && (NIL != csome_list_var)) {
                        if (name.equalp(instances.get_slot(entity, STRING))) {
                            named_entity = entity;
                        }
                        csome_list_var = csome_list_var.rest();
                        entity = csome_list_var.first();
                    } 
                }
                sublisp_throw($sym123$OUTER_CATCH_FOR_ESSAY_METHOD, named_entity);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_essay_identified_entities(self, identified_entities);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_essay_method = Errors.handleThrowable(ccatch_env_var, $sym123$OUTER_CATCH_FOR_ESSAY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_essay_method;
    }

    public static SubLObject essay_get_entities_by_types_method(final SubLObject self, final SubLObject desired_types) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_essay_method = NIL;
        final SubLObject identified_entities = get_essay_identified_entities(self);
        try {
            thread.throwStack.push($sym128$OUTER_CATCH_FOR_ESSAY_METHOD);
            try {
                assert NIL != listp(desired_types) : "Types.listp(desired_types) " + "CommonSymbols.NIL != Types.listp(desired_types) " + desired_types;
                SubLObject appropriate_entities = NIL;
                SubLObject cdolist_list_var = identified_entities;
                SubLObject entity = NIL;
                entity = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        if (NIL != genls.any_genl_anyP(methods.funcall_instance_method_with_0_args(entity, ALL_TYPES), desired_types, UNPROVIDED, UNPROVIDED)) {
                            appropriate_entities = cons(entity, appropriate_entities);
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    entity = cdolist_list_var.first();
                } 
                sublisp_throw($sym128$OUTER_CATCH_FOR_ESSAY_METHOD, appropriate_entities);
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_essay_identified_entities(self, identified_entities);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_essay_method = Errors.handleThrowable(ccatch_env_var, $sym128$OUTER_CATCH_FOR_ESSAY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_essay_method;
    }

    public static SubLObject essay_identify_entities_method(final SubLObject self, SubLObject types_to_identify) {
        if (types_to_identify == UNPROVIDED) {
            types_to_identify = $list136;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_essay_method = NIL;
        SubLObject identified_entities = get_essay_identified_entities(self);
        final SubLObject content = answer.get_answer_content(self);
        final SubLObject info_request = answer.get_answer_info_request(self);
        try {
            thread.throwStack.push($sym137$OUTER_CATCH_FOR_ESSAY_METHOD);
            try {
                assert NIL != listp(types_to_identify) : "Types.listp(types_to_identify) " + "CommonSymbols.NIL != Types.listp(types_to_identify) " + types_to_identify;
                final SubLObject lexicon = instances.get_slot(info_request, LEXICON);
                final SubLObject entities_hash = make_hash_table($int$32, symbol_function(EQUAL), UNPROVIDED);
                SubLObject cdolist_list_var = content;
                SubLObject passage = NIL;
                passage = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$5;
                    final SubLObject passage_entities = cdolist_list_var_$5 = methods.funcall_instance_method_with_2_args(passage, IDENTIFY_ENTITIES, lexicon, types_to_identify);
                    SubLObject entity = NIL;
                    entity = cdolist_list_var_$5.first();
                    while (NIL != cdolist_list_var_$5) {
                        final SubLObject string = instances.get_slot(entity, STRING);
                        final SubLObject value = gethash(string, entities_hash, UNPROVIDED);
                        if (NIL != value) {
                            methods.funcall_instance_method_with_1_args(value, ADD_PASSAGE, passage);
                        } else {
                            sethash(string, entities_hash, entity);
                        }
                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                        entity = cdolist_list_var_$5.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    passage = cdolist_list_var.first();
                } 
                SubLObject key = NIL;
                SubLObject value2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(entities_hash);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        key = getEntryKey(cdohash_entry);
                        final SubLObject item_var;
                        value2 = item_var = getEntryValue(cdohash_entry);
                        if (NIL == member(item_var, identified_entities, TEXTUAL_FOCUS_ENTITY_EQUAL, symbol_function(IDENTITY))) {
                            identified_entities = cons(item_var, identified_entities);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
                sublisp_throw($sym137$OUTER_CATCH_FOR_ESSAY_METHOD, identified_entities);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_essay_identified_entities(self, identified_entities);
                    answer.set_answer_content(self, content);
                    answer.set_answer_info_request(self, info_request);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_essay_method = Errors.handleThrowable(ccatch_env_var, $sym137$OUTER_CATCH_FOR_ESSAY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_essay_method;
    }

    public static SubLObject safe_svector_cosine_angle(final SubLObject svector1, final SubLObject svector2, SubLObject fall_back) {
        if (fall_back == UNPROVIDED) {
            fall_back = ZERO_INTEGER;
        }
        assert NIL != sparse_vector.sparse_vector_p(svector1) : "sparse_vector.sparse_vector_p(svector1) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(svector1) " + svector1;
        assert NIL != sparse_vector.sparse_vector_p(svector2) : "sparse_vector.sparse_vector_p(svector2) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(svector2) " + svector2;
        if (sparse_vector.svector_length(svector1).isZero()) {
            return fall_back;
        }
        if (sparse_vector.svector_length(svector2).isZero()) {
            return fall_back;
        }
        return sparse_vector.svector_cosine_angle(svector1, svector2);
    }

    public static SubLObject declare_scenario_file() {
        declareFunction(me, "get_scenario_answers", "GET-SCENARIO-ANSWERS", 1, 0, false);
        declareFunction(me, "set_scenario_answers", "SET-SCENARIO-ANSWERS", 2, 0, false);
        declareFunction(me, "get_scenario_questions", "GET-SCENARIO-QUESTIONS", 1, 0, false);
        declareFunction(me, "set_scenario_questions", "SET-SCENARIO-QUESTIONS", 2, 0, false);
        declareFunction(me, "get_scenario_vector", "GET-SCENARIO-VECTOR", 1, 0, false);
        declareFunction(me, "set_scenario_vector", "SET-SCENARIO-VECTOR", 2, 0, false);
        declareFunction(me, "get_scenario_augmentation_terms", "GET-SCENARIO-AUGMENTATION-TERMS", 1, 0, false);
        declareFunction(me, "set_scenario_augmentation_terms", "SET-SCENARIO-AUGMENTATION-TERMS", 2, 0, false);
        declareFunction(me, "get_scenario_sentences", "GET-SCENARIO-SENTENCES", 1, 0, false);
        declareFunction(me, "set_scenario_sentences", "SET-SCENARIO-SENTENCES", 2, 0, false);
        declareFunction(me, "get_scenario_corpora", "GET-SCENARIO-CORPORA", 1, 0, false);
        declareFunction(me, "set_scenario_corpora", "SET-SCENARIO-CORPORA", 2, 0, false);
        declareFunction(me, "get_scenario_string", "GET-SCENARIO-STRING", 1, 0, false);
        declareFunction(me, "set_scenario_string", "SET-SCENARIO-STRING", 2, 0, false);
        declareFunction(me, "get_scenario_tagger", "GET-SCENARIO-TAGGER", 1, 0, false);
        declareFunction(me, "set_scenario_tagger", "SET-SCENARIO-TAGGER", 2, 0, false);
        declareFunction(me, "get_scenario_parser", "GET-SCENARIO-PARSER", 1, 0, false);
        declareFunction(me, "set_scenario_parser", "SET-SCENARIO-PARSER", 2, 0, false);
        declareFunction(me, "get_scenario_lexicon", "GET-SCENARIO-LEXICON", 1, 0, false);
        declareFunction(me, "set_scenario_lexicon", "SET-SCENARIO-LEXICON", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_scenario_class", "SUBLOOP-RESERVED-INITIALIZE-SCENARIO-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_scenario_instance", "SUBLOOP-RESERVED-INITIALIZE-SCENARIO-INSTANCE", 1, 0, false);
        declareFunction(me, "scenario_p", "SCENARIO-P", 1, 0, false);
        declareFunction(me, "scenario_viable_question_method", "SCENARIO-VIABLE-QUESTION-METHOD", 2, 0, false);
        declareFunction(me, "scenario_initialize_method", "SCENARIO-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "scenario_get_vector_method", "SCENARIO-GET-VECTOR-METHOD", 1, 0, false);
        declareFunction(me, "new_scenario", "NEW-SCENARIO", 1, 1, false);
        declareFunction(me, "scenario_answer_method", "SCENARIO-ANSWER-METHOD", 1, 0, false);
        declareFunction(me, "scenario_answer_subquestions_method", "SCENARIO-ANSWER-SUBQUESTIONS-METHOD", 1, 1, false);
        declareFunction(me, "get_essay_identified_entities", "GET-ESSAY-IDENTIFIED-ENTITIES", 1, 0, false);
        declareFunction(me, "set_essay_identified_entities", "SET-ESSAY-IDENTIFIED-ENTITIES", 2, 0, false);
        declareFunction(me, "get_essay_subquestion_answers", "GET-ESSAY-SUBQUESTION-ANSWERS", 1, 0, false);
        declareFunction(me, "set_essay_subquestion_answers", "SET-ESSAY-SUBQUESTION-ANSWERS", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_essay_class", "SUBLOOP-RESERVED-INITIALIZE-ESSAY-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_essay_instance", "SUBLOOP-RESERVED-INITIALIZE-ESSAY-INSTANCE", 1, 0, false);
        declareFunction(me, "essay_p", "ESSAY-P", 1, 0, false);
        declareFunction(me, "essay_select_method", "ESSAY-SELECT-METHOD", 2, 0, false);
        declareFunction(me, "essay_typical_instance_method", "ESSAY-TYPICAL-INSTANCE-METHOD", 2, 0, false);
        declareFunction(me, "new_essay", "NEW-ESSAY", 2, 1, false);
        declareFunction(me, "essay_print_method", "ESSAY-PRINT-METHOD", 3, 0, false);
        declareFunction(me, "essay_chronology_method", "ESSAY-CHRONOLOGY-METHOD", 1, 0, false);
        declareFunction(me, "essay_render_method", "ESSAY-RENDER-METHOD", 1, 1, false);
        declareFunction(me, "essay_answer_subquestions_method", "ESSAY-ANSWER-SUBQUESTIONS-METHOD", 1, 0, false);
        declareFunction(me, "essay_background_identify_entities_method", "ESSAY-BACKGROUND-IDENTIFY-ENTITIES-METHOD", 1, 0, false);
        declareFunction(me, "essay_get_entity_by_name_method", "ESSAY-GET-ENTITY-BY-NAME-METHOD", 2, 0, false);
        declareFunction(me, "essay_get_entities_by_types_method", "ESSAY-GET-ENTITIES-BY-TYPES-METHOD", 2, 0, false);
        declareFunction(me, "essay_identify_entities_method", "ESSAY-IDENTIFY-ENTITIES-METHOD", 1, 1, false);
        declareFunction(me, "safe_svector_cosine_angle", "SAFE-SVECTOR-COSINE-ANGLE", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_scenario_file() {
        return NIL;
    }

    public static SubLObject setup_scenario_file() {
        classes.subloop_new_class(SCENARIO, INFORMATION_REQUEST, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(SCENARIO, NIL);
        classes.subloop_note_class_initialization_function(SCENARIO, SUBLOOP_RESERVED_INITIALIZE_SCENARIO_CLASS);
        classes.subloop_note_instance_initialization_function(SCENARIO, SUBLOOP_RESERVED_INITIALIZE_SCENARIO_INSTANCE);
        subloop_reserved_initialize_scenario_class(SCENARIO);
        methods.methods_incorporate_class_method(VIABLE_QUESTION, SCENARIO, $list22, $list23, $list24);
        methods.subloop_register_class_method(SCENARIO, VIABLE_QUESTION, SCENARIO_VIABLE_QUESTION_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, SCENARIO, $list22, NIL, $list28);
        methods.subloop_register_instance_method(SCENARIO, INITIALIZE, SCENARIO_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_VECTOR, SCENARIO, $list35, NIL, $list36);
        methods.subloop_register_instance_method(SCENARIO, GET_VECTOR, SCENARIO_GET_VECTOR_METHOD);
        methods.methods_incorporate_instance_method(ANSWER, SCENARIO, $list43, NIL, $list44);
        methods.subloop_register_instance_method(SCENARIO, ANSWER, SCENARIO_ANSWER_METHOD);
        methods.methods_incorporate_instance_method(ANSWER_SUBQUESTIONS, SCENARIO, $list35, $list52, $list53);
        methods.subloop_register_instance_method(SCENARIO, ANSWER_SUBQUESTIONS, SCENARIO_ANSWER_SUBQUESTIONS_METHOD);
        classes.subloop_new_class(ESSAY, ANSWER, NIL, NIL, $list60);
        classes.class_set_implements_slot_listeners(ESSAY, NIL);
        classes.subloop_note_class_initialization_function(ESSAY, SUBLOOP_RESERVED_INITIALIZE_ESSAY_CLASS);
        classes.subloop_note_instance_initialization_function(ESSAY, SUBLOOP_RESERVED_INITIALIZE_ESSAY_INSTANCE);
        subloop_reserved_initialize_essay_class(ESSAY);
        methods.methods_incorporate_class_method(SELECT, ESSAY, $list35, $list71, $list72);
        methods.subloop_register_class_method(ESSAY, SELECT, ESSAY_SELECT_METHOD);
        methods.methods_incorporate_class_method(TYPICAL_INSTANCE, ESSAY, $list35, $list71, $list79);
        methods.subloop_register_class_method(ESSAY, TYPICAL_INSTANCE, ESSAY_TYPICAL_INSTANCE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, ESSAY, $list22, $list84, $list85);
        methods.subloop_register_instance_method(ESSAY, PRINT, ESSAY_PRINT_METHOD);
        methods.methods_incorporate_instance_method(CHRONOLOGY, ESSAY, $list35, NIL, $list92);
        methods.subloop_register_instance_method(ESSAY, CHRONOLOGY, ESSAY_CHRONOLOGY_METHOD);
        methods.methods_incorporate_instance_method(RENDER, ESSAY, $list35, $list96, $list97);
        methods.subloop_register_instance_method(ESSAY, RENDER, ESSAY_RENDER_METHOD);
        methods.methods_incorporate_instance_method(ANSWER_SUBQUESTIONS, ESSAY, $list22, NIL, $list111);
        methods.subloop_register_instance_method(ESSAY, ANSWER_SUBQUESTIONS, ESSAY_ANSWER_SUBQUESTIONS_METHOD);
        methods.methods_incorporate_instance_method(BACKGROUND_IDENTIFY_ENTITIES, ESSAY, $list35, NIL, $list116);
        methods.subloop_register_instance_method(ESSAY, BACKGROUND_IDENTIFY_ENTITIES, ESSAY_BACKGROUND_IDENTIFY_ENTITIES_METHOD);
        methods.methods_incorporate_instance_method(GET_ENTITY_BY_NAME, ESSAY, $list35, $list121, $list122);
        methods.subloop_register_instance_method(ESSAY, GET_ENTITY_BY_NAME, ESSAY_GET_ENTITY_BY_NAME_METHOD);
        methods.methods_incorporate_instance_method(GET_ENTITIES_BY_TYPES, ESSAY, $list35, $list126, $list127);
        methods.subloop_register_instance_method(ESSAY, GET_ENTITIES_BY_TYPES, ESSAY_GET_ENTITIES_BY_TYPES_METHOD);
        methods.methods_incorporate_instance_method(IDENTIFY_ENTITIES, ESSAY, $list35, $list134, $list135);
        methods.subloop_register_instance_method(ESSAY, IDENTIFY_ENTITIES, ESSAY_IDENTIFY_ENTITIES_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_scenario_file();
    }

    @Override
    public void initializeVariables() {
        init_scenario_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_scenario_file();
    }

    
}

/**
 * Total time: 764 ms
 */
