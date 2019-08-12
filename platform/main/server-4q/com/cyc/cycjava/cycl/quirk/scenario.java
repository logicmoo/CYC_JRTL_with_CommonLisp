/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.quirk;


import static com.cyc.cycjava.cycl.classes.*;
import static com.cyc.cycjava.cycl.clustering.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.document.*;
import static com.cyc.cycjava.cycl.genls.*;
import static com.cyc.cycjava.cycl.instances.*;
import static com.cyc.cycjava.cycl.methods.*;
import static com.cyc.cycjava.cycl.mt_relevance_macros.*;
import static com.cyc.cycjava.cycl.object.*;
import static com.cyc.cycjava.cycl.parser.*;
import static com.cyc.cycjava.cycl.pos_tagger.*;
import static com.cyc.cycjava.cycl.slots.*;
import static com.cyc.cycjava.cycl.sparse_vector.*;
import static com.cyc.cycjava.cycl.string_utilities.*;
import static com.cyc.cycjava.cycl.subloop_structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
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
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SCENARIO
 * source file: /cyc/top/cycl/quirk/scenario.lisp
 * created:     2019/07/03 17:39:03
 */
public final class scenario extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt103$ = makeString("");

    public static final SubLFile me = new scenario();

 public static final String myName = "com.cyc.cycjava.cycl.quirk.scenario";


    static private final SubLList $list2 = list(new SubLObject[]{ list(makeSymbol("LEXICON"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("PARSER"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("TAGGER"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("STRING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CORPORA"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SENTENCES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("AUGMENTATION-TERMS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("VECTOR"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("QUESTIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ANSWERS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("VIABLE-QUESTION"), list(makeSymbol("QUESTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VECTOR"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLSymbol QUESTIONS = makeSymbol("QUESTIONS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SCENARIO_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SCENARIO-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SCENARIO_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SCENARIO-INSTANCE");

    private static final SubLSymbol VIABLE_QUESTION = makeSymbol("VIABLE-QUESTION");

    static private final SubLList $list22 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list23 = list(makeSymbol("QUESTION"));

    static private final SubLList $list24 = list(makeString("@param QUESTION, question-p;\n   @return BOOLEAN, T if question is of the kind we can answer reliably, NIL otherwise\n   @owner bertolo"), list(makeSymbol("CLET"), list(makeSymbol("VIABLE")), list(makeSymbol("CSOME"), list(makeSymbol("PRED"), list(QUOTE, list(new SubLObject[]{ makeSymbol("DEFINITIONAL-QUESTION-P"), makeSymbol("INTELLIGENT-AGENT-QUESTION-P"), makeSymbol("GEOGRAPHICAL-QUESTION-P"), makeSymbol("EVENT-LOCATION-QUESTION-P"), makeSymbol("DISTANCE-QUESTION-P"), makeSymbol("PHYSICAL-QUANTITY-QUESTION-P"), makeSymbol("AGE-QUESTION-P"), makeSymbol("WHAT-QUESTION-P"), makeSymbol("DATE-QUESTION-P") })), makeSymbol("VIABLE")), list(makeSymbol("CSETQ"), makeSymbol("VIABLE"), list(makeSymbol("FUNCALL"), makeSymbol("PRED"), makeSymbol("QUESTION")))), list(RET, makeSymbol("VIABLE"))));

    static private final SubLList $list25 = list(new SubLObject[]{ makeSymbol("DEFINITIONAL-QUESTION-P"), makeSymbol("INTELLIGENT-AGENT-QUESTION-P"), makeSymbol("GEOGRAPHICAL-QUESTION-P"), makeSymbol("EVENT-LOCATION-QUESTION-P"), makeSymbol("DISTANCE-QUESTION-P"), makeSymbol("PHYSICAL-QUANTITY-QUESTION-P"), makeSymbol("AGE-QUESTION-P"), makeSymbol("WHAT-QUESTION-P"), makeSymbol("DATE-QUESTION-P") });

    private static final SubLSymbol SCENARIO_VIABLE_QUESTION_METHOD = makeSymbol("SCENARIO-VIABLE-QUESTION-METHOD");

    static private final SubLList $list28 = list(makeString("Initializes all class slots in question\n   @return scenario-p\n   @owner bertolo"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("PUNLESS"), makeSymbol("LEXICON"), list(makeSymbol("CSETQ"), makeSymbol("LEXICON"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("QUIRK-LEXICON"))))), list(makeSymbol("PUNLESS"), makeSymbol("PARSER"), list(makeSymbol("CSETQ"), makeSymbol("PARSER"), list(makeSymbol("NEW-CHARNIAK-PARSER"), $WARN, makeInteger(30)))), list(makeSymbol("PUNLESS"), makeSymbol("TAGGER"), list(makeSymbol("CSETQ"), makeSymbol("TAGGER"), list(makeSymbol("GET-TAGGER")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym29$OUTER_CATCH_FOR_SCENARIO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SCENARIO-METHOD");

    private static final SubLSymbol QUIRK_LEXICON = makeSymbol("QUIRK-LEXICON");



    private static final SubLSymbol SCENARIO_INITIALIZE_METHOD = makeSymbol("SCENARIO-INITIALIZE-METHOD");

    static private final SubLList $list35 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list36 = list(makeString("@return sparse-vector-p, a vector representation of this \n   @owner bertolo"), list(makeSymbol("PWHEN"), makeSymbol("VECTOR"), list(RET, makeSymbol("VECTOR"))), list(makeSymbol("CLET"), list(list(makeSymbol("AUGMENTED-STRING"), list(makeSymbol("CCONCATENATE"), makeSymbol("STRING"), list(makeSymbol("BUNGE"), makeSymbol("AUGMENTATION-TERMS")))), list(makeSymbol("NEW-VECTOR"), list(makeSymbol("NEW-STRING-VECTOR"), makeSymbol("AUGMENTED-STRING")))), list(makeSymbol("CSETQ"), makeSymbol("VECTOR"), makeSymbol("NEW-VECTOR")), list(RET, makeSymbol("NEW-VECTOR"))));

    static private final SubLSymbol $sym37$OUTER_CATCH_FOR_SCENARIO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SCENARIO-METHOD");

    private static final SubLSymbol SCENARIO_GET_VECTOR_METHOD = makeSymbol("SCENARIO-GET-VECTOR-METHOD");

    static private final SubLList $list39 = list(makeString("AQUAINT"));

    static private final SubLList $list43 = list(makeKeyword("PUBLIC"), makeKeyword("NO-MEMBER-VARIABLES"));

    static private final SubLList $list44 = list(makeString("@return essay-p, an essay to answer this \n   @owner bertolo"), list(makeSymbol("CLET"), list(list(makeSymbol("WORDS"), NIL), list(makeSymbol("PASSAGES"), NIL), makeSymbol("SCENARIO-QUERY")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ANSWERS")), NIL), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("AUGMENTATION-TERMS")), NIL), list(makeSymbol("CDOLIST"), list(makeSymbol("SENTENCE"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("SENTENCES")))), list(makeSymbol("SENTENCE-DO-WORDS"), list(makeSymbol("WORD"), makeSymbol("SENTENCE")), list(makeSymbol("CPUSH"), list(makeSymbol("WORD-STRING"), makeSymbol("WORD")), makeSymbol("WORDS")))), list(makeSymbol("CDOLIST"), list(makeSymbol("CORPUS"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CORPORA")))), list(makeSymbol("CLET"), list(list(makeSymbol("AUGMENTED-TERMS"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("QUESTION")), list(QUOTE, makeSymbol("AUGMENT-TERMS")), makeSymbol("WORDS"), makeSymbol("CORPUS")))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("AUGMENTATION-TERMS")), list(makeSymbol("CONS"), list(makeSymbol("CONS"), makeSymbol("CORPUS"), makeSymbol("AUGMENTED-TERMS")), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("AUGMENTATION-TERMS"))))), list(makeSymbol("CSETQ"), makeSymbol("SCENARIO-QUERY"), list(makeSymbol("NEW-LEMUR-QUERY"), list(makeSymbol("BUNGE"), list(makeSymbol("APPEND"), makeSymbol("WORDS"), makeSymbol("AUGMENTED-TERMS"))), makeSymbol("CORPUS"), TEN_INTEGER, makeInteger(50))), list(makeSymbol("CDOLIST"), list(makeSymbol("PASSAGE"), list(makeSymbol("FIM"), makeSymbol("SCENARIO-QUERY"), list(QUOTE, makeSymbol("ANSWER")))), list(makeSymbol("CPUSH"), makeSymbol("PASSAGE"), makeSymbol("PASSAGES"))))), list(RET, list(makeSymbol("NEW-ESSAY"), makeSymbol("SELF"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("ESSAY")), list(QUOTE, makeSymbol("SELECT")), makeSymbol("PASSAGES"))))));

    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLSymbol ESSAY = makeSymbol("ESSAY");

    private static final SubLSymbol SCENARIO_ANSWER_METHOD = makeSymbol("SCENARIO-ANSWER-METHOD");

    private static final SubLSymbol ANSWER_SUBQUESTIONS = makeSymbol("ANSWER-SUBQUESTIONS");

    static private final SubLList $list52 = list(makeSymbol("&OPTIONAL"), makeSymbol("VERBOSE"));

    static private final SubLList $list53 = list(makeString("@param VERBOSE, booleanp\n   @return scenario-p, this scenario\n   As a side effect it computes answers to all viable subquestions of this scenario and\n   stores them in the appropriate slot of this object.\n   @owner bertolo"), list(makeSymbol("CDOLIST"), list(makeSymbol("QUESTION"), makeSymbol("QUESTIONS")), list(makeSymbol("PWHEN"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("SCENARIO")), list(QUOTE, makeSymbol("VIABLE-QUESTION")), makeSymbol("QUESTION")), list(makeSymbol("CLET"), list(list(makeSymbol("Q-ANSWERS"), list(makeSymbol("FIM"), makeSymbol("QUESTION"), list(QUOTE, makeSymbol("ANSWER"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("Q-ANSWERS"), makeSymbol("VERBOSE")), list(makeSymbol("FORMAT"), T, makeString("~%~S has been answered: ~%"), makeSymbol("QUESTION")), list(makeSymbol("CDOLIST"), list(makeSymbol("ANSWER"), makeSymbol("Q-ANSWERS")), list(makeSymbol("FORMAT"), T, makeString("~%    ~S"), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(QUOTE, makeSymbol("GET-CONTENT"))))), list(makeSymbol("FORMAT"), T, makeString("~%~%"), makeSymbol("QUESTION"))), list(makeSymbol("CSETQ"), makeSymbol("ANSWERS"), list(makeSymbol("APPEND"), makeSymbol("Q-ANSWERS"), makeSymbol("ANSWERS")))))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym54$OUTER_CATCH_FOR_SCENARIO_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SCENARIO-METHOD");

    static private final SubLString $str55$___S_has_been_answered____ = makeString("~%~S has been answered: ~%");

    static private final SubLString $str56$_______S = makeString("~%    ~S");

    static private final SubLString $str58$____ = makeString("~%~%");

    private static final SubLSymbol SCENARIO_ANSWER_SUBQUESTIONS_METHOD = makeSymbol("SCENARIO-ANSWER-SUBQUESTIONS-METHOD");

    static private final SubLList $list60 = list(list(makeSymbol("SUBQUESTION-ANSWERS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("IDENTIFIED-ENTITIES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("SELECT"), list(makeSymbol("PASSAGES")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("TYPICAL-INSTANCE"), list(makeSymbol("PASSAGES")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("VIABLE-QUESTION"), list(makeSymbol("QUESTION")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RENDER"), list(makeSymbol("&OPTIONAL"), makeSymbol("RENDERING-P-LIST")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-SUBQUESTIONS"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol IDENTIFIED_ENTITIES = makeSymbol("IDENTIFIED-ENTITIES");

    private static final SubLSymbol SUBQUESTION_ANSWERS = makeSymbol("SUBQUESTION-ANSWERS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ESSAY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ESSAY-CLASS");

    private static final SubLSymbol RELEVANCE = makeSymbol("RELEVANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ESSAY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ESSAY-INSTANCE");

    static private final SubLList $list71 = list(makeSymbol("PASSAGES"));

    static private final SubLList $list72 = list(makeString("@param PASSAGES listp;\n     @return listp; the list of conses of the most salient passages among PASSAGES \n     and their confidences, ranked by their salientness.\n     @owner aldag"), list(makeSymbol("CHECK-TYPE"), makeSymbol("PASSAGES"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("SELECTED"), NIL), list(makeSymbol("REQUIRE-SIMILARITY"), makeDouble(0.3)), list(makeSymbol("CLUSTERS"), list(makeSymbol("CLUSTER"), makeSymbol("PASSAGES"), list(QUOTE, makeSymbol("PASSAGE-SIMILARITY")), ONE_INTEGER, makeSymbol("REQUIRE-SIMILARITY")))), list(makeSymbol("CDOLIST"), list(makeSymbol("CLUSTER"), makeSymbol("CLUSTERS")), list(makeSymbol("CLET"), list(list(makeSymbol("MAX-PASSAGES"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("CORPUS-PASSAGE")), list(QUOTE, makeSymbol("MAX-INSTANCES")), list(makeSymbol("CLUSTER-ELEMENTS"), makeSymbol("CLUSTER"))))), list(makeSymbol("CPUSH"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("ESSAY")), list(QUOTE, makeSymbol("TYPICAL-INSTANCE")), makeSymbol("MAX-PASSAGES")), makeSymbol("SELECTED")))), list(RET, makeSymbol("SELECTED"))));

    private static final SubLFloat $float$0_3 = makeDouble(0.3);

    private static final SubLSymbol PASSAGE_SIMILARITY = makeSymbol("PASSAGE-SIMILARITY");

    private static final SubLSymbol CORPUS_PASSAGE = makeSymbol("CORPUS-PASSAGE");

    private static final SubLSymbol MAX_INSTANCES = makeSymbol("MAX-INSTANCES");

    private static final SubLSymbol ESSAY_SELECT_METHOD = makeSymbol("ESSAY-SELECT-METHOD");

    static private final SubLList $list79 = list(makeString("@param ANSWERS listp\n    @return answer-p; the most typical answer among ANSWERS.\n    @owner aldag"), list(makeSymbol("CHECK-TYPE"), makeSymbol("PASSAGES"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("TYPICAL"), list(makeSymbol("FIRST"), makeSymbol("PASSAGES"))), list(makeSymbol("CENTROID"), list(makeSymbol("SVECTOR-CENTROID"), list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("GET-ABSTRACT-PASSAGE-VECTOR")), makeSymbol("PASSAGES")))), list(makeSymbol("CENTROID-LENGTH"), list(makeSymbol("SVECTOR-LENGTH"), makeSymbol("CENTROID")))), list(makeSymbol("PUNLESS"), list(makeSymbol("ZEROP"), makeSymbol("CENTROID-LENGTH")), list(makeSymbol("CLET"), list(list(makeSymbol("TYPICAL-VECTOR"), list(makeSymbol("GET-ABSTRACT-PASSAGE-VECTOR"), makeSymbol("TYPICAL"))), list(makeSymbol("MIN-DISTANCE"), list(makeSymbol("SAFE-SVECTOR-COSINE-ANGLE"), makeSymbol("TYPICAL-VECTOR"), makeSymbol("CENTROID"))), makeSymbol("DISTANCE")), list(makeSymbol("CDOLIST"), list(makeSymbol("PASSAGE"), makeSymbol("PASSAGES")), list(makeSymbol("CLET"), list(list(makeSymbol("PASSAGE-VECTOR"), list(makeSymbol("GET-ABSTRACT-PASSAGE-VECTOR"), makeSymbol("PASSAGE")))), list(makeSymbol("CSETQ"), makeSymbol("DISTANCE"), list(makeSymbol("SAFE-SVECTOR-COSINE-ANGLE"), makeSymbol("PASSAGE-VECTOR"), makeSymbol("CENTROID"))), list(makeSymbol("PWHEN"), list(makeSymbol(">"), makeSymbol("DISTANCE"), makeSymbol("MIN-DISTANCE")), list(makeSymbol("CSETQ"), makeSymbol("MIN-DISTANCE"), makeSymbol("DISTANCE")), list(makeSymbol("CSETQ"), makeSymbol("TYPICAL"), makeSymbol("PASSAGE"))))))), list(RET, makeSymbol("TYPICAL"))));

    private static final SubLSymbol GET_ABSTRACT_PASSAGE_VECTOR = makeSymbol("GET-ABSTRACT-PASSAGE-VECTOR");

    private static final SubLSymbol ESSAY_TYPICAL_INSTANCE_METHOD = makeSymbol("ESSAY-TYPICAL-INSTANCE-METHOD");

    private static final SubLSymbol KEY_POINTS = makeSymbol("KEY-POINTS");

    static private final SubLList $list84 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list85 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<ESSAY sources:"), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), list(makeSymbol("LENGTH"), makeSymbol("CONTENT")), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(" entities:"), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), list(makeSymbol("LENGTH"), makeSymbol("IDENTIFIED-ENTITIES")), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")), list(makeSymbol("TERPRI"), makeSymbol("STREAM")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym86$OUTER_CATCH_FOR_ESSAY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ESSAY-METHOD");

    static private final SubLString $str87$__ESSAY_sources_ = makeString("#<ESSAY sources:");

    static private final SubLString $str88$_entities_ = makeString(" entities:");

    static private final SubLString $str89$_ = makeString(">");

    private static final SubLSymbol ESSAY_PRINT_METHOD = makeSymbol("ESSAY-PRINT-METHOD");

    private static final SubLSymbol CHRONOLOGY = makeSymbol("CHRONOLOGY");

    static private final SubLList $list92 = list(list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("RENDER")), list(QUOTE, list(makeKeyword("FORMAT"), $TEXT, makeKeyword("ORDER"), makeKeyword("CHRONOLOGICAL"))))));

    private static final SubLSymbol RENDER = makeSymbol("RENDER");

    static private final SubLList $list94 = list(makeKeyword("FORMAT"), $TEXT, makeKeyword("ORDER"), makeKeyword("CHRONOLOGICAL"));

    private static final SubLSymbol ESSAY_CHRONOLOGY_METHOD = makeSymbol("ESSAY-CHRONOLOGY-METHOD");

    static private final SubLList $list96 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("STRATEGY"), list(QUOTE, list(makeKeyword("FORMAT"), $TEXT, makeKeyword("ORDER"), makeKeyword("SEQUENTIAL")))));

    static private final SubLList $list97 = list(list(makeSymbol("CLET"), list(list(makeSymbol("FORMAT"), list(makeSymbol("GETF"), makeSymbol("STRATEGY"), makeKeyword("FORMAT"))), list(makeSymbol("ORDER"), list(makeSymbol("GETF"), makeSymbol("STRATEGY"), makeKeyword("ORDER"))), makeSymbol("ACCUMULATOR")), list(makeSymbol("PCASE"), makeSymbol("FORMAT"), list($TEXT, list(makeSymbol("CSETQ"), makeSymbol("ACCUMULATOR"), makeString("")))), list(makeSymbol("PCASE"), makeSymbol("ORDER"), list(makeKeyword("SEQUENTIAL"), list(makeSymbol("CDOLIST"), list(makeSymbol("PASSAGE"), makeSymbol("CONTENT")), list(makeSymbol("CSETQ"), makeSymbol("ACCUMULATOR"), list(new SubLObject[]{ makeSymbol("CCONCATENATE"), makeSymbol("ACCUMULATOR"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-CONTENT"))), makeSymbol("*NEW-LINE-STRING*"), makeString("("), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-SOURCE"))), makeString(")"), makeSymbol("*NEW-LINE-STRING*"), makeSymbol("*NEW-LINE-STRING*") })))), list(makeKeyword("CHRONOLOGICAL"), list(makeSymbol("CLET"), list(list(makeSymbol("SORTED"), list(makeSymbol("SORT"), list(makeSymbol("COPY-LIST"), makeSymbol("CONTENT")), list(QUOTE, makeSymbol("ABSTRACT-PASSAGE-OLDER-METHOD"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("PASSAGE"), makeSymbol("SORTED")), list(makeSymbol("CSETQ"), makeSymbol("ACCUMULATOR"), list(new SubLObject[]{ makeSymbol("CCONCATENATE"), makeSymbol("ACCUMULATOR"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-CONTENT"))), makeSymbol("*NEW-LINE-STRING*"), makeString("("), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-SOURCE"))), makeString(")"), makeSymbol("*NEW-LINE-STRING*"), makeSymbol("*NEW-LINE-STRING*") })))))), list(RET, makeSymbol("ACCUMULATOR"))));

    static private final SubLList $list98 = list(makeKeyword("FORMAT"), $TEXT, makeKeyword("ORDER"), makeKeyword("SEQUENTIAL"));

    static private final SubLSymbol $sym99$OUTER_CATCH_FOR_ESSAY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ESSAY-METHOD");

    static private final SubLString $str103$ = makeString("");

    static private final SubLString $str105$_ = makeString("(");

    static private final SubLString $str107$_ = makeString(")");

    private static final SubLSymbol ABSTRACT_PASSAGE_OLDER_METHOD = makeSymbol("ABSTRACT-PASSAGE-OLDER-METHOD");

    private static final SubLSymbol ESSAY_RENDER_METHOD = makeSymbol("ESSAY-RENDER-METHOD");

    static private final SubLList $list111 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("QUESTION"), list(makeSymbol("GET-SLOT"), makeSymbol("INFO-REQUEST"), list(QUOTE, makeSymbol("QUESTIONS")))), list(makeSymbol("PWHEN"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("ESSAY")), list(QUOTE, makeSymbol("VIABLE-QUESTION")), makeSymbol("QUESTION")), list(makeSymbol("CDOLIST"), list(makeSymbol("PASSAGE"), makeSymbol("CONTENT")), list(makeSymbol("CLET"), list(list(makeSymbol("ANSWERS"), list(makeSymbol("FIM"), makeSymbol("QUESTION"), list(QUOTE, makeSymbol("EXTRACT")), makeSymbol("PASSAGE")))), list(makeSymbol("PWHEN"), makeSymbol("ANSWERS"), list(makeSymbol("CSETQ"), makeSymbol("SUBQUESTION-ANSWERS"), list(makeSymbol("APPEND"), list(makeSymbol("FCM"), list(makeSymbol("CAR"), makeSymbol("ANSWERS")), list(QUOTE, makeSymbol("SELECT")), makeSymbol("ANSWERS")), makeSymbol("SUBQUESTION-ANSWERS")))))))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym112$OUTER_CATCH_FOR_ESSAY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ESSAY-METHOD");

    private static final SubLSymbol ESSAY_ANSWER_SUBQUESTIONS_METHOD = makeSymbol("ESSAY-ANSWER-SUBQUESTIONS-METHOD");

    private static final SubLSymbol BACKGROUND_IDENTIFY_ENTITIES = makeSymbol("BACKGROUND-IDENTIFY-ENTITIES");

    static private final SubLList $list116 = list(list(makeSymbol("NEW-TASK"), list(makeSymbol("FORMAT"), NIL, makeString("~S"), list(makeSymbol("GENSYM"))), list(QUOTE, makeSymbol("ESSAY-IDENTIFY-ENTITIES-METHOD")), list(makeSymbol("BQ-LIST"), makeSymbol("SELF"))), list(RET, makeSymbol("SELF")));

    static private final SubLString $str117$_S = makeString("~S");

    private static final SubLSymbol ESSAY_IDENTIFY_ENTITIES_METHOD = makeSymbol("ESSAY-IDENTIFY-ENTITIES-METHOD");

    private static final SubLSymbol ESSAY_BACKGROUND_IDENTIFY_ENTITIES_METHOD = makeSymbol("ESSAY-BACKGROUND-IDENTIFY-ENTITIES-METHOD");

    private static final SubLSymbol GET_ENTITY_BY_NAME = makeSymbol("GET-ENTITY-BY-NAME");

    static private final SubLList $list121 = list(makeSymbol("NAME"));

    static private final SubLList $list122 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("NAME"), makeSymbol("STRINGP")), list(makeSymbol("CLET"), list(makeSymbol("NAMED-ENTITY")), list(makeSymbol("CSOME"), list(makeSymbol("ENTITY"), makeSymbol("IDENTIFIED-ENTITIES"), makeSymbol("NAMED-ENTITY")), list(makeSymbol("PWHEN"), list(EQUALP, makeSymbol("NAME"), list(makeSymbol("GET-SLOT"), makeSymbol("ENTITY"), list(QUOTE, makeSymbol("STRING")))), list(makeSymbol("CSETQ"), makeSymbol("NAMED-ENTITY"), makeSymbol("ENTITY")))), list(RET, makeSymbol("NAMED-ENTITY"))));

    static private final SubLSymbol $sym123$OUTER_CATCH_FOR_ESSAY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ESSAY-METHOD");

    private static final SubLSymbol ESSAY_GET_ENTITY_BY_NAME_METHOD = makeSymbol("ESSAY-GET-ENTITY-BY-NAME-METHOD");

    private static final SubLSymbol GET_ENTITIES_BY_TYPES = makeSymbol("GET-ENTITIES-BY-TYPES");

    static private final SubLList $list126 = list(makeSymbol("DESIRED-TYPES"));

    static private final SubLList $list127 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("DESIRED-TYPES"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("APPROPRIATE-ENTITIES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("ENTITY"), makeSymbol("IDENTIFIED-ENTITIES")), list(makeSymbol("WITH-ALL-MTS"), list(makeSymbol("PWHEN"), list(makeSymbol("ANY-GENL-ANY?"), list(makeSymbol("FIM"), makeSymbol("ENTITY"), list(QUOTE, makeSymbol("ALL-TYPES"))), makeSymbol("DESIRED-TYPES")), list(makeSymbol("CPUSH"), makeSymbol("ENTITY"), makeSymbol("APPROPRIATE-ENTITIES"))))), list(RET, makeSymbol("APPROPRIATE-ENTITIES"))));

    static private final SubLSymbol $sym128$OUTER_CATCH_FOR_ESSAY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ESSAY-METHOD");



    private static final SubLSymbol ESSAY_GET_ENTITIES_BY_TYPES_METHOD = makeSymbol("ESSAY-GET-ENTITIES-BY-TYPES-METHOD");

    private static final SubLSymbol IDENTIFY_ENTITIES = makeSymbol("IDENTIFY-ENTITIES");

    static private final SubLList $list134 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("TYPES-TO-IDENTIFY"), list(QUOTE, list(reader_make_constant_shell("Person"), reader_make_constant_shell("Place"), reader_make_constant_shell("Organization")))));

    static private final SubLList $list135 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("TYPES-TO-IDENTIFY"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("LEXICON"), list(makeSymbol("GET-SLOT"), makeSymbol("INFO-REQUEST"), list(QUOTE, makeSymbol("LEXICON")))), list(makeSymbol("ENTITIES-HASH"), list(makeSymbol("MAKE-HASH-TABLE"), makeInteger(32), list(makeSymbol("FUNCTION"), EQUAL)))), list(makeSymbol("CDOLIST"), list(makeSymbol("PASSAGE"), makeSymbol("CONTENT")), list(makeSymbol("CLET"), list(list(makeSymbol("PASSAGE-ENTITIES"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("IDENTIFY-ENTITIES")), makeSymbol("LEXICON"), makeSymbol("TYPES-TO-IDENTIFY")))), list(makeSymbol("CDOLIST"), list(makeSymbol("ENTITY"), makeSymbol("PASSAGE-ENTITIES")), list(makeSymbol("CLET"), list(list(makeSymbol("STRING"), list(makeSymbol("GET-SLOT"), makeSymbol("ENTITY"), list(QUOTE, makeSymbol("STRING")))), list(makeSymbol("VALUE"), list(makeSymbol("GETHASH"), makeSymbol("STRING"), makeSymbol("ENTITIES-HASH")))), list(makeSymbol("PIF"), makeSymbol("VALUE"), list(makeSymbol("FIM"), makeSymbol("VALUE"), list(QUOTE, makeSymbol("ADD-PASSAGE")), makeSymbol("PASSAGE")), list(makeSymbol("SETHASH"), makeSymbol("STRING"), makeSymbol("ENTITIES-HASH"), makeSymbol("ENTITY"))))))), list(makeSymbol("CDOHASH"), list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("ENTITIES-HASH")), list(makeSymbol("IGNORE"), makeSymbol("KEY")), list(makeSymbol("CPUSHNEW"), makeSymbol("VALUE"), makeSymbol("IDENTIFIED-ENTITIES"), list(QUOTE, makeSymbol("TEXTUAL-FOCUS-ENTITY-EQUAL")))), list(RET, makeSymbol("IDENTIFIED-ENTITIES"))));

    static private final SubLList $list136 = list(reader_make_constant_shell("Person"), reader_make_constant_shell("Place"), reader_make_constant_shell("Organization"));

    static private final SubLSymbol $sym137$OUTER_CATCH_FOR_ESSAY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ESSAY-METHOD");

    private static final SubLSymbol ADD_PASSAGE = makeSymbol("ADD-PASSAGE");

    private static final SubLSymbol TEXTUAL_FOCUS_ENTITY_EQUAL = makeSymbol("TEXTUAL-FOCUS-ENTITY-EQUAL");

    private static final SubLSymbol SPARSE_VECTOR_P = makeSymbol("SPARSE-VECTOR-P");

    // Definitions
    public static final SubLObject get_scenario_answers_alt(SubLObject v_scenario) {
        return classes.subloop_get_access_protected_instance_slot(v_scenario, NINE_INTEGER, ANSWERS);
    }

    // Definitions
    public static SubLObject get_scenario_answers(final SubLObject v_scenario) {
        return subloop_get_access_protected_instance_slot(v_scenario, NINE_INTEGER, ANSWERS);
    }

    public static final SubLObject set_scenario_answers_alt(SubLObject v_scenario, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_scenario, value, NINE_INTEGER, ANSWERS);
    }

    public static SubLObject set_scenario_answers(final SubLObject v_scenario, final SubLObject value) {
        return subloop_set_access_protected_instance_slot(v_scenario, value, NINE_INTEGER, ANSWERS);
    }

    public static final SubLObject get_scenario_questions_alt(SubLObject v_scenario) {
        return classes.subloop_get_access_protected_instance_slot(v_scenario, EIGHT_INTEGER, QUESTIONS);
    }

    public static SubLObject get_scenario_questions(final SubLObject v_scenario) {
        return subloop_get_access_protected_instance_slot(v_scenario, EIGHT_INTEGER, scenario.QUESTIONS);
    }

    public static final SubLObject set_scenario_questions_alt(SubLObject v_scenario, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_scenario, value, EIGHT_INTEGER, QUESTIONS);
    }

    public static SubLObject set_scenario_questions(final SubLObject v_scenario, final SubLObject value) {
        return subloop_set_access_protected_instance_slot(v_scenario, value, EIGHT_INTEGER, scenario.QUESTIONS);
    }

    public static final SubLObject get_scenario_vector_alt(SubLObject v_scenario) {
        return classes.subloop_get_access_protected_instance_slot(v_scenario, SEVEN_INTEGER, VECTOR);
    }

    public static SubLObject get_scenario_vector(final SubLObject v_scenario) {
        return subloop_get_access_protected_instance_slot(v_scenario, SEVEN_INTEGER, VECTOR);
    }

    public static final SubLObject set_scenario_vector_alt(SubLObject v_scenario, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_scenario, value, SEVEN_INTEGER, VECTOR);
    }

    public static SubLObject set_scenario_vector(final SubLObject v_scenario, final SubLObject value) {
        return subloop_set_access_protected_instance_slot(v_scenario, value, SEVEN_INTEGER, VECTOR);
    }

    public static final SubLObject get_scenario_augmentation_terms_alt(SubLObject v_scenario) {
        return classes.subloop_get_access_protected_instance_slot(v_scenario, SIX_INTEGER, AUGMENTATION_TERMS);
    }

    public static SubLObject get_scenario_augmentation_terms(final SubLObject v_scenario) {
        return subloop_get_access_protected_instance_slot(v_scenario, SIX_INTEGER, AUGMENTATION_TERMS);
    }

    public static final SubLObject set_scenario_augmentation_terms_alt(SubLObject v_scenario, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_scenario, value, SIX_INTEGER, AUGMENTATION_TERMS);
    }

    public static SubLObject set_scenario_augmentation_terms(final SubLObject v_scenario, final SubLObject value) {
        return subloop_set_access_protected_instance_slot(v_scenario, value, SIX_INTEGER, AUGMENTATION_TERMS);
    }

    public static final SubLObject get_scenario_sentences_alt(SubLObject v_scenario) {
        return classes.subloop_get_access_protected_instance_slot(v_scenario, FIVE_INTEGER, SENTENCES);
    }

    public static SubLObject get_scenario_sentences(final SubLObject v_scenario) {
        return subloop_get_access_protected_instance_slot(v_scenario, FIVE_INTEGER, SENTENCES);
    }

    public static final SubLObject set_scenario_sentences_alt(SubLObject v_scenario, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_scenario, value, FIVE_INTEGER, SENTENCES);
    }

    public static SubLObject set_scenario_sentences(final SubLObject v_scenario, final SubLObject value) {
        return subloop_set_access_protected_instance_slot(v_scenario, value, FIVE_INTEGER, SENTENCES);
    }

    public static final SubLObject get_scenario_corpora_alt(SubLObject v_scenario) {
        return classes.subloop_get_access_protected_instance_slot(v_scenario, FOUR_INTEGER, CORPORA);
    }

    public static SubLObject get_scenario_corpora(final SubLObject v_scenario) {
        return subloop_get_access_protected_instance_slot(v_scenario, FOUR_INTEGER, CORPORA);
    }

    public static final SubLObject set_scenario_corpora_alt(SubLObject v_scenario, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_scenario, value, FOUR_INTEGER, CORPORA);
    }

    public static SubLObject set_scenario_corpora(final SubLObject v_scenario, final SubLObject value) {
        return subloop_set_access_protected_instance_slot(v_scenario, value, FOUR_INTEGER, CORPORA);
    }

    public static final SubLObject get_scenario_string_alt(SubLObject v_scenario) {
        return classes.subloop_get_access_protected_instance_slot(v_scenario, THREE_INTEGER, STRING);
    }

    public static SubLObject get_scenario_string(final SubLObject v_scenario) {
        return subloop_get_access_protected_instance_slot(v_scenario, THREE_INTEGER, STRING);
    }

    public static final SubLObject set_scenario_string_alt(SubLObject v_scenario, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_scenario, value, THREE_INTEGER, STRING);
    }

    public static SubLObject set_scenario_string(final SubLObject v_scenario, final SubLObject value) {
        return subloop_set_access_protected_instance_slot(v_scenario, value, THREE_INTEGER, STRING);
    }

    public static final SubLObject get_scenario_tagger_alt(SubLObject v_scenario) {
        {
            SubLObject v_class = (v_scenario.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_scenario))) : NIL != subloop_structures.class_p(v_scenario) ? ((SubLObject) (v_scenario)) : NIL != subloop_structures.instance_p(v_scenario) ? ((SubLObject) (subloop_structures.instance_class(v_scenario))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(TAGGER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER);
            }
            return NIL;
        }
    }

    public static SubLObject get_scenario_tagger(final SubLObject v_scenario) {
        final SubLObject v_class = (v_scenario.isSymbol()) ? classes_retrieve_class(v_scenario) : NIL != class_p(v_scenario) ? v_scenario : NIL != instance_p(v_scenario) ? instance_class(v_scenario) : NIL;
        if (NIL != v_class) {
            classes_access_check_class_slot(v_class, slot_assoc(TAGGER, class_compiled_class_slot_access_alist(v_class)));
            return aref(class_any_slots(v_class), THREE_INTEGER);
        }
        return NIL;
    }

    public static final SubLObject set_scenario_tagger_alt(SubLObject v_scenario, SubLObject value) {
        {
            SubLObject v_class = (v_scenario.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_scenario))) : NIL != subloop_structures.class_p(v_scenario) ? ((SubLObject) (v_scenario)) : NIL != subloop_structures.instance_p(v_scenario) ? ((SubLObject) (subloop_structures.instance_class(v_scenario))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(TAGGER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static SubLObject set_scenario_tagger(final SubLObject v_scenario, final SubLObject value) {
        final SubLObject v_class = (v_scenario.isSymbol()) ? classes_retrieve_class(v_scenario) : NIL != class_p(v_scenario) ? v_scenario : NIL != instance_p(v_scenario) ? instance_class(v_scenario) : NIL;
        if (NIL != v_class) {
            classes_access_check_class_slot(v_class, slot_assoc(TAGGER, class_compiled_class_slot_access_alist(v_class)));
            return set_aref(class_any_slots(v_class), THREE_INTEGER, value);
        }
        return NIL;
    }

    public static final SubLObject get_scenario_parser_alt(SubLObject v_scenario) {
        {
            SubLObject v_class = (v_scenario.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_scenario))) : NIL != subloop_structures.class_p(v_scenario) ? ((SubLObject) (v_scenario)) : NIL != subloop_structures.instance_p(v_scenario) ? ((SubLObject) (subloop_structures.instance_class(v_scenario))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(PARSER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
            }
            return NIL;
        }
    }

    public static SubLObject get_scenario_parser(final SubLObject v_scenario) {
        final SubLObject v_class = (v_scenario.isSymbol()) ? classes_retrieve_class(v_scenario) : NIL != class_p(v_scenario) ? v_scenario : NIL != instance_p(v_scenario) ? instance_class(v_scenario) : NIL;
        if (NIL != v_class) {
            classes_access_check_class_slot(v_class, slot_assoc(PARSER, class_compiled_class_slot_access_alist(v_class)));
            return aref(class_any_slots(v_class), TWO_INTEGER);
        }
        return NIL;
    }

    public static final SubLObject set_scenario_parser_alt(SubLObject v_scenario, SubLObject value) {
        {
            SubLObject v_class = (v_scenario.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_scenario))) : NIL != subloop_structures.class_p(v_scenario) ? ((SubLObject) (v_scenario)) : NIL != subloop_structures.instance_p(v_scenario) ? ((SubLObject) (subloop_structures.instance_class(v_scenario))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(PARSER, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
            }
            return NIL;
        }
    }

    public static SubLObject set_scenario_parser(final SubLObject v_scenario, final SubLObject value) {
        final SubLObject v_class = (v_scenario.isSymbol()) ? classes_retrieve_class(v_scenario) : NIL != class_p(v_scenario) ? v_scenario : NIL != instance_p(v_scenario) ? instance_class(v_scenario) : NIL;
        if (NIL != v_class) {
            classes_access_check_class_slot(v_class, slot_assoc(PARSER, class_compiled_class_slot_access_alist(v_class)));
            return set_aref(class_any_slots(v_class), TWO_INTEGER, value);
        }
        return NIL;
    }

    public static final SubLObject get_scenario_lexicon_alt(SubLObject v_scenario) {
        {
            SubLObject v_class = (v_scenario.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_scenario))) : NIL != subloop_structures.class_p(v_scenario) ? ((SubLObject) (v_scenario)) : NIL != subloop_structures.instance_p(v_scenario) ? ((SubLObject) (subloop_structures.instance_class(v_scenario))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(LEXICON, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
            }
            return NIL;
        }
    }

    public static SubLObject get_scenario_lexicon(final SubLObject v_scenario) {
        final SubLObject v_class = (v_scenario.isSymbol()) ? classes_retrieve_class(v_scenario) : NIL != class_p(v_scenario) ? v_scenario : NIL != instance_p(v_scenario) ? instance_class(v_scenario) : NIL;
        if (NIL != v_class) {
            classes_access_check_class_slot(v_class, slot_assoc(LEXICON, class_compiled_class_slot_access_alist(v_class)));
            return aref(class_any_slots(v_class), ONE_INTEGER);
        }
        return NIL;
    }

    public static final SubLObject set_scenario_lexicon_alt(SubLObject v_scenario, SubLObject value) {
        {
            SubLObject v_class = (v_scenario.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(v_scenario))) : NIL != subloop_structures.class_p(v_scenario) ? ((SubLObject) (v_scenario)) : NIL != subloop_structures.instance_p(v_scenario) ? ((SubLObject) (subloop_structures.instance_class(v_scenario))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(LEXICON, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static SubLObject set_scenario_lexicon(final SubLObject v_scenario, final SubLObject value) {
        final SubLObject v_class = (v_scenario.isSymbol()) ? classes_retrieve_class(v_scenario) : NIL != class_p(v_scenario) ? v_scenario : NIL != instance_p(v_scenario) ? instance_class(v_scenario) : NIL;
        if (NIL != v_class) {
            classes_access_check_class_slot(v_class, slot_assoc(LEXICON, class_compiled_class_slot_access_alist(v_class)));
            return set_aref(class_any_slots(v_class), ONE_INTEGER, value);
        }
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_scenario_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, SCENARIO, LEXICON, NIL);
        classes.subloop_initialize_slot(new_instance, SCENARIO, PARSER, NIL);
        classes.subloop_initialize_slot(new_instance, SCENARIO, TAGGER, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_scenario_class(final SubLObject new_instance) {
        subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        subloop_initialize_slot(new_instance, SCENARIO, LEXICON, NIL);
        subloop_initialize_slot(new_instance, SCENARIO, PARSER, NIL);
        subloop_initialize_slot(new_instance, SCENARIO, TAGGER, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_scenario_instance_alt(SubLObject new_instance) {
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

    public static SubLObject subloop_reserved_initialize_scenario_instance(final SubLObject new_instance) {
        subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        subloop_initialize_slot(new_instance, INFORMATION_REQUEST, ERROR_HANDLING, NIL);
        subloop_initialize_slot(new_instance, INFORMATION_REQUEST, TIMEOUT, NIL);
        subloop_initialize_slot(new_instance, SCENARIO, STRING, NIL);
        subloop_initialize_slot(new_instance, SCENARIO, CORPORA, NIL);
        subloop_initialize_slot(new_instance, SCENARIO, SENTENCES, NIL);
        subloop_initialize_slot(new_instance, SCENARIO, AUGMENTATION_TERMS, NIL);
        subloop_initialize_slot(new_instance, SCENARIO, VECTOR, NIL);
        subloop_initialize_slot(new_instance, SCENARIO, scenario.QUESTIONS, NIL);
        subloop_initialize_slot(new_instance, SCENARIO, ANSWERS, NIL);
        return NIL;
    }

    public static final SubLObject scenario_p_alt(SubLObject v_scenario) {
        return classes.subloop_instanceof_class(v_scenario, SCENARIO);
    }

    public static SubLObject scenario_p(final SubLObject v_scenario) {
        return subloop_instanceof_class(v_scenario, SCENARIO);
    }

    /**
     *
     *
     * @param QUESTION,
    question-p;
     * 		
     * @return BOOLEAN, T if question is of the kind we can answer reliably, NIL otherwise
     * @unknown bertolo
     */
    @LispMethod(comment = "@param QUESTION,\nquestion-p;\r\n\t\t\r\n@return BOOLEAN, T if question is of the kind we can answer reliably, NIL otherwise\r\n@unknown bertolo")
    public static final SubLObject scenario_viable_question_method_alt(SubLObject self, SubLObject v_question) {
        {
            SubLObject viable = NIL;
            if (NIL == viable) {
                {
                    SubLObject csome_list_var = $list_alt25;
                    SubLObject pred = NIL;
                    for (pred = csome_list_var.first(); !((NIL != viable) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
                        viable = funcall(pred, v_question);
                    }
                }
            }
            return viable;
        }
    }

    /**
     *
     *
     * @param QUESTION,
    question-p;
     * 		
     * @return BOOLEAN, T if question is of the kind we can answer reliably, NIL otherwise
     * @unknown bertolo
     */
    @LispMethod(comment = "@param QUESTION,\nquestion-p;\r\n\t\t\r\n@return BOOLEAN, T if question is of the kind we can answer reliably, NIL otherwise\r\n@unknown bertolo")
    public static SubLObject scenario_viable_question_method(final SubLObject self, final SubLObject v_question) {
        SubLObject viable = NIL;
        if (NIL == viable) {
            SubLObject csome_list_var;
            SubLObject pred;
            for (csome_list_var = scenario.$list25, pred = NIL, pred = csome_list_var.first(); (NIL == viable) && (NIL != csome_list_var); viable = funcall(pred, v_question) , csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
            }
        }
        return viable;
    }

    /**
     * Initializes all class slots in question
     *
     * @return scenario-p
     * @unknown bertolo
     */
    @LispMethod(comment = "Initializes all class slots in question\r\n\r\n@return scenario-p\r\n@unknown bertolo")
    public static final SubLObject scenario_initialize_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_scenario_method = NIL;
            SubLObject tagger = com.cyc.cycjava.cycl.quirk.scenario.get_scenario_tagger(self);
            SubLObject v_parser = com.cyc.cycjava.cycl.quirk.scenario.get_scenario_parser(self);
            SubLObject lexicon = com.cyc.cycjava.cycl.quirk.scenario.get_scenario_lexicon(self);
            try {
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
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.scenario.set_scenario_tagger(self, tagger);
                            com.cyc.cycjava.cycl.quirk.scenario.set_scenario_parser(self, v_parser);
                            com.cyc.cycjava.cycl.quirk.scenario.set_scenario_lexicon(self, lexicon);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_scenario_method = Errors.handleThrowable(ccatch_env_var, $sym29$OUTER_CATCH_FOR_SCENARIO_METHOD);
            }
            return catch_var_for_scenario_method;
        }
    }

    /**
     * Initializes all class slots in question
     *
     * @return scenario-p
     * @unknown bertolo
     */
    @LispMethod(comment = "Initializes all class slots in question\r\n\r\n@return scenario-p\r\n@unknown bertolo")
    public static SubLObject scenario_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scenario_method = NIL;
        SubLObject tagger = scenario.get_scenario_tagger(self);
        SubLObject v_parser = scenario.get_scenario_parser(self);
        SubLObject lexicon = scenario.get_scenario_lexicon(self);
        try {
            thread.throwStack.push(scenario.$sym29$OUTER_CATCH_FOR_SCENARIO_METHOD);
            try {
                search_engine.information_request_initialize_method(self);
                if (NIL == lexicon) {
                    lexicon = new_class_instance(scenario.QUIRK_LEXICON);
                }
                if (NIL == v_parser) {
                    v_parser = new_charniak_parser($WARN, scenario.$int$30);
                }
                if (NIL == tagger) {
                    tagger = get_tagger();
                }
                sublisp_throw(scenario.$sym29$OUTER_CATCH_FOR_SCENARIO_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    scenario.set_scenario_tagger(self, tagger);
                    scenario.set_scenario_parser(self, v_parser);
                    scenario.set_scenario_lexicon(self, lexicon);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_scenario_method = Errors.handleThrowable(ccatch_env_var, scenario.$sym29$OUTER_CATCH_FOR_SCENARIO_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scenario_method;
    }

    /**
     *
     *
     * @return sparse-vector-p, a vector representation of this scenario.
     * @unknown bertolo
     */
    @LispMethod(comment = "@return sparse-vector-p, a vector representation of this scenario.\r\n@unknown bertolo")
    public static final SubLObject scenario_get_vector_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_scenario_method = NIL;
            SubLObject vector = com.cyc.cycjava.cycl.quirk.scenario.get_scenario_vector(self);
            SubLObject augmentation_terms = com.cyc.cycjava.cycl.quirk.scenario.get_scenario_augmentation_terms(self);
            SubLObject string = com.cyc.cycjava.cycl.quirk.scenario.get_scenario_string(self);
            try {
                try {
                    if (NIL != vector) {
                        sublisp_throw($sym37$OUTER_CATCH_FOR_SCENARIO_METHOD, vector);
                    }
                    {
                        SubLObject augmented_string = cconcatenate(string, string_utilities.bunge(augmentation_terms, UNPROVIDED));
                        SubLObject new_vector = question.new_string_vector(augmented_string);
                        vector = new_vector;
                        sublisp_throw($sym37$OUTER_CATCH_FOR_SCENARIO_METHOD, new_vector);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.scenario.set_scenario_vector(self, vector);
                            com.cyc.cycjava.cycl.quirk.scenario.set_scenario_augmentation_terms(self, augmentation_terms);
                            com.cyc.cycjava.cycl.quirk.scenario.set_scenario_string(self, string);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_scenario_method = Errors.handleThrowable(ccatch_env_var, $sym37$OUTER_CATCH_FOR_SCENARIO_METHOD);
            }
            return catch_var_for_scenario_method;
        }
    }

    /**
     *
     *
     * @return sparse-vector-p, a vector representation of this scenario.
     * @unknown bertolo
     */
    @LispMethod(comment = "@return sparse-vector-p, a vector representation of this scenario.\r\n@unknown bertolo")
    public static SubLObject scenario_get_vector_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scenario_method = NIL;
        SubLObject vector = scenario.get_scenario_vector(self);
        final SubLObject augmentation_terms = scenario.get_scenario_augmentation_terms(self);
        final SubLObject string = scenario.get_scenario_string(self);
        try {
            thread.throwStack.push(scenario.$sym37$OUTER_CATCH_FOR_SCENARIO_METHOD);
            try {
                if (NIL != vector) {
                    sublisp_throw(scenario.$sym37$OUTER_CATCH_FOR_SCENARIO_METHOD, vector);
                }
                final SubLObject augmented_string = cconcatenate(string, bunge(augmentation_terms, UNPROVIDED));
                final SubLObject new_vector = vector = question.new_string_vector(augmented_string);
                sublisp_throw(scenario.$sym37$OUTER_CATCH_FOR_SCENARIO_METHOD, new_vector);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    scenario.set_scenario_vector(self, vector);
                    scenario.set_scenario_augmentation_terms(self, augmentation_terms);
                    scenario.set_scenario_string(self, string);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_scenario_method = Errors.handleThrowable(ccatch_env_var, scenario.$sym37$OUTER_CATCH_FOR_SCENARIO_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scenario_method;
    }

    /**
     *
     *
     * @param SCENARIO-STRING,
     * 		stringp, a string containing a scenario to be analyzed
     * @param CORPORA,
     * 		listp a list of strings denoting textual corpora available for the
     * 		analysis of the scenario
     * @return scenario-p, a new scenario object
     * @unknown bertolo
     */
    @LispMethod(comment = "@param SCENARIO-STRING,\r\n\t\tstringp, a string containing a scenario to be analyzed\r\n@param CORPORA,\r\n\t\tlistp a list of strings denoting textual corpora available for the\r\n\t\tanalysis of the scenario\r\n@return scenario-p, a new scenario object\r\n@unknown bertolo")
    public static final SubLObject new_scenario_alt(SubLObject scenario_string, SubLObject corpora) {
        if (corpora == UNPROVIDED) {
            corpora = $list_alt39;
        }
        SubLTrampolineFile.checkType(scenario_string, STRINGP);
        SubLTrampolineFile.checkType(corpora, LISTP);
        question.initialize_question();
        {
            SubLObject v_scenario = object.new_class_instance(SCENARIO);
            SubLObject sentences = NIL;
            SubLObject questions = NIL;
            instances.set_slot(v_scenario, STRING, scenario_string);
            instances.set_slot(v_scenario, CORPORA, corpora);
            {
                SubLObject vector_var = document.paragraph_sentences(document.new_paragraph(scenario_string));
                SubLObject backwardP_var = NIL;
                SubLObject length = length(vector_var);
                SubLObject v_iteration = NIL;
                for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    {
                        SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                        SubLObject sentence = aref(vector_var, element_num);
                        SubLObject q = question.new_question(string_utilities.bunge(document.sentence_stringify(sentence), UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        sentences = cons(sentence, sentences);
                        if (NIL != question.question_p(q)) {
                            questions = cons(q, questions);
                        }
                    }
                }
            }
            instances.set_slot(v_scenario, SENTENCES, nreverse(sentences));
            instances.set_slot(v_scenario, QUESTIONS, nreverse(questions));
            return v_scenario;
        }
    }

    /**
     *
     *
     * @param SCENARIO-STRING,
     * 		stringp, a string containing a scenario to be analyzed
     * @param CORPORA,
     * 		listp a list of strings denoting textual corpora available for the
     * 		analysis of the scenario
     * @return scenario-p, a new scenario object
     * @unknown bertolo
     */
    @LispMethod(comment = "@param SCENARIO-STRING,\r\n\t\tstringp, a string containing a scenario to be analyzed\r\n@param CORPORA,\r\n\t\tlistp a list of strings denoting textual corpora available for the\r\n\t\tanalysis of the scenario\r\n@return scenario-p, a new scenario object\r\n@unknown bertolo")
    public static SubLObject new_scenario(final SubLObject scenario_string, SubLObject corpora) {
        if (corpora == UNPROVIDED) {
            corpora = scenario.$list39;
        }
        assert NIL != stringp(scenario_string) : "! stringp(scenario_string) " + ("Types.stringp(scenario_string) " + "CommonSymbols.NIL != Types.stringp(scenario_string) ") + scenario_string;
        assert NIL != listp(corpora) : "! listp(corpora) " + ("Types.listp(corpora) " + "CommonSymbols.NIL != Types.listp(corpora) ") + corpora;
        question.initialize_question();
        final SubLObject v_scenario = new_class_instance(SCENARIO);
        SubLObject sentences = NIL;
        SubLObject questions = NIL;
        set_slot(v_scenario, STRING, scenario_string);
        set_slot(v_scenario, CORPORA, corpora);
        final SubLObject vector_var = paragraph_sentences(new_paragraph(scenario_string));
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject sentence;
        SubLObject q;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            sentence = aref(vector_var, element_num);
            q = question.new_question(bunge(sentence_stringify(sentence), UNPROVIDED), UNPROVIDED, UNPROVIDED);
            sentences = cons(sentence, sentences);
            if (NIL != question.question_p(q)) {
                questions = cons(q, questions);
            }
        }
        set_slot(v_scenario, SENTENCES, nreverse(sentences));
        set_slot(v_scenario, scenario.QUESTIONS, nreverse(questions));
        return v_scenario;
    }

    /**
     *
     *
     * @return essay-p, an essay to answer this scenario.
     * @unknown bertolo
     */
    @LispMethod(comment = "@return essay-p, an essay to answer this scenario.\r\n@unknown bertolo")
    public static final SubLObject scenario_answer_method_alt(SubLObject self) {
        {
            SubLObject words = NIL;
            SubLObject passages = NIL;
            SubLObject scenario_query = NIL;
            instances.set_slot(self, ANSWERS, NIL);
            instances.set_slot(self, AUGMENTATION_TERMS, NIL);
            {
                SubLObject cdolist_list_var = instances.get_slot(self, SENTENCES);
                SubLObject sentence = NIL;
                for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                    {
                        SubLObject vector_var = document.sentence_yield(sentence);
                        SubLObject backwardP_var = NIL;
                        SubLObject length = length(vector_var);
                        SubLObject v_iteration = NIL;
                        for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            {
                                SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                                SubLObject word = aref(vector_var, element_num);
                                words = cons(document.word_string(word), words);
                            }
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = instances.get_slot(self, CORPORA);
                SubLObject corpus = NIL;
                for (corpus = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , corpus = cdolist_list_var.first()) {
                    {
                        SubLObject augmented_terms = methods.funcall_class_method_with_2_args(QUESTION, AUGMENT_TERMS, words, corpus);
                        instances.set_slot(self, AUGMENTATION_TERMS, cons(cons(corpus, augmented_terms), instances.get_slot(self, AUGMENTATION_TERMS)));
                        scenario_query = search_engine.new_lemur_query(string_utilities.bunge(append(words, augmented_terms), UNPROVIDED), corpus, TEN_INTEGER, $int$50);
                        {
                            SubLObject cdolist_list_var_1 = methods.funcall_instance_method_with_0_args(scenario_query, ANSWER);
                            SubLObject passage = NIL;
                            for (passage = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , passage = cdolist_list_var_1.first()) {
                                passages = cons(passage, passages);
                            }
                        }
                    }
                }
            }
            return com.cyc.cycjava.cycl.quirk.scenario.new_essay(self, methods.funcall_class_method_with_1_args(ESSAY, SELECT, passages), UNPROVIDED);
        }
    }

    /**
     *
     *
     * @return essay-p, an essay to answer this scenario.
     * @unknown bertolo
     */
    @LispMethod(comment = "@return essay-p, an essay to answer this scenario.\r\n@unknown bertolo")
    public static SubLObject scenario_answer_method(final SubLObject self) {
        SubLObject words = NIL;
        SubLObject passages = NIL;
        SubLObject scenario_query = NIL;
        set_slot(self, ANSWERS, NIL);
        set_slot(self, AUGMENTATION_TERMS, NIL);
        SubLObject cdolist_list_var = get_slot(self, SENTENCES);
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = sentence_yield_exhaustive(sentence);
            SubLObject word = NIL;
            word = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                words = cons(word_string(word), words);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                word = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        cdolist_list_var = get_slot(self, CORPORA);
        SubLObject corpus = NIL;
        corpus = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject augmented_terms = funcall_class_method_with_2_args(QUESTION, AUGMENT_TERMS, words, corpus);
            set_slot(self, AUGMENTATION_TERMS, cons(cons(corpus, augmented_terms), get_slot(self, AUGMENTATION_TERMS)));
            scenario_query = search_engine.new_lemur_query(bunge(append(words, augmented_terms), UNPROVIDED), corpus, TEN_INTEGER, scenario.$int$50);
            SubLObject cdolist_list_var_$2 = funcall_instance_method_with_0_args(scenario_query, ANSWER);
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
        return scenario.new_essay(self, funcall_class_method_with_1_args(scenario.ESSAY, SELECT, passages), UNPROVIDED);
    }

    /**
     *
     *
     * @param VERBOSE,
    booleanp
     * 		
     * @return scenario-p, this scenario
    As a side effect it computes answers to all viable subquestions of this scenario and
    stores them in the appropriate slot of this object.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param VERBOSE,\nbooleanp\r\n\t\t\r\n@return scenario-p, this scenario\r\nAs a side effect it computes answers to all viable subquestions of this scenario and\r\nstores them in the appropriate slot of this object.\r\n@unknown bertolo")
    public static final SubLObject scenario_answer_subquestions_method_alt(SubLObject self, SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        {
            SubLObject catch_var_for_scenario_method = NIL;
            SubLObject answers = com.cyc.cycjava.cycl.quirk.scenario.get_scenario_answers(self);
            SubLObject questions = com.cyc.cycjava.cycl.quirk.scenario.get_scenario_questions(self);
            try {
                try {
                    {
                        SubLObject cdolist_list_var = questions;
                        SubLObject v_question = NIL;
                        for (v_question = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_question = cdolist_list_var.first()) {
                            if (NIL != methods.funcall_class_method_with_1_args(SCENARIO, VIABLE_QUESTION, v_question)) {
                                {
                                    SubLObject q_answers = methods.funcall_instance_method_with_0_args(v_question, ANSWER);
                                    if ((NIL != q_answers) && (NIL != verbose)) {
                                        format(T, $str_alt55$___S_has_been_answered____, v_question);
                                        {
                                            SubLObject cdolist_list_var_2 = q_answers;
                                            SubLObject v_answer = NIL;
                                            for (v_answer = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , v_answer = cdolist_list_var_2.first()) {
                                                format(T, $str_alt56$_______S, methods.funcall_instance_method_with_0_args(v_answer, GET_CONTENT));
                                            }
                                        }
                                        format(T, $str_alt58$____, v_question);
                                    }
                                    answers = append(q_answers, answers);
                                }
                            }
                        }
                        sublisp_throw($sym54$OUTER_CATCH_FOR_SCENARIO_METHOD, self);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.scenario.set_scenario_answers(self, answers);
                            com.cyc.cycjava.cycl.quirk.scenario.set_scenario_questions(self, questions);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_scenario_method = Errors.handleThrowable(ccatch_env_var, $sym54$OUTER_CATCH_FOR_SCENARIO_METHOD);
            }
            return catch_var_for_scenario_method;
        }
    }

    /**
     *
     *
     * @param VERBOSE,
    booleanp
     * 		
     * @return scenario-p, this scenario
    As a side effect it computes answers to all viable subquestions of this scenario and
    stores them in the appropriate slot of this object.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param VERBOSE,\nbooleanp\r\n\t\t\r\n@return scenario-p, this scenario\r\nAs a side effect it computes answers to all viable subquestions of this scenario and\r\nstores them in the appropriate slot of this object.\r\n@unknown bertolo")
    public static SubLObject scenario_answer_subquestions_method(final SubLObject self, SubLObject verbose) {
        if (verbose == UNPROVIDED) {
            verbose = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_scenario_method = NIL;
        SubLObject answers = scenario.get_scenario_answers(self);
        final SubLObject questions = scenario.get_scenario_questions(self);
        try {
            thread.throwStack.push(scenario.$sym54$OUTER_CATCH_FOR_SCENARIO_METHOD);
            try {
                SubLObject cdolist_list_var = questions;
                SubLObject v_question = NIL;
                v_question = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != funcall_class_method_with_1_args(SCENARIO, scenario.VIABLE_QUESTION, v_question)) {
                        final SubLObject q_answers = funcall_instance_method_with_0_args(v_question, ANSWER);
                        if ((NIL != q_answers) && (NIL != verbose)) {
                            format(T, scenario.$str55$___S_has_been_answered____, v_question);
                            SubLObject cdolist_list_var_$3 = q_answers;
                            SubLObject v_answer = NIL;
                            v_answer = cdolist_list_var_$3.first();
                            while (NIL != cdolist_list_var_$3) {
                                format(T, scenario.$str56$_______S, funcall_instance_method_with_0_args(v_answer, GET_CONTENT));
                                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                                v_answer = cdolist_list_var_$3.first();
                            } 
                            format(T, scenario.$str58$____, v_question);
                        }
                        answers = append(q_answers, answers);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_question = cdolist_list_var.first();
                } 
                sublisp_throw(scenario.$sym54$OUTER_CATCH_FOR_SCENARIO_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    scenario.set_scenario_answers(self, answers);
                    scenario.set_scenario_questions(self, questions);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_scenario_method = Errors.handleThrowable(ccatch_env_var, scenario.$sym54$OUTER_CATCH_FOR_SCENARIO_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_scenario_method;
    }

    public static final SubLObject get_essay_identified_entities_alt(SubLObject essay) {
        return classes.subloop_get_access_protected_instance_slot(essay, EIGHT_INTEGER, IDENTIFIED_ENTITIES);
    }

    public static SubLObject get_essay_identified_entities(final SubLObject essay) {
        return subloop_get_access_protected_instance_slot(essay, EIGHT_INTEGER, scenario.IDENTIFIED_ENTITIES);
    }

    public static final SubLObject set_essay_identified_entities_alt(SubLObject essay, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(essay, value, EIGHT_INTEGER, IDENTIFIED_ENTITIES);
    }

    public static SubLObject set_essay_identified_entities(final SubLObject essay, final SubLObject value) {
        return subloop_set_access_protected_instance_slot(essay, value, EIGHT_INTEGER, scenario.IDENTIFIED_ENTITIES);
    }

    public static final SubLObject get_essay_subquestion_answers_alt(SubLObject essay) {
        return classes.subloop_get_access_protected_instance_slot(essay, SEVEN_INTEGER, SUBQUESTION_ANSWERS);
    }

    public static SubLObject get_essay_subquestion_answers(final SubLObject essay) {
        return subloop_get_access_protected_instance_slot(essay, SEVEN_INTEGER, scenario.SUBQUESTION_ANSWERS);
    }

    public static final SubLObject set_essay_subquestion_answers_alt(SubLObject essay, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(essay, value, SEVEN_INTEGER, SUBQUESTION_ANSWERS);
    }

    public static SubLObject set_essay_subquestion_answers(final SubLObject essay, final SubLObject value) {
        return subloop_set_access_protected_instance_slot(essay, value, SEVEN_INTEGER, scenario.SUBQUESTION_ANSWERS);
    }

    public static final SubLObject subloop_reserved_initialize_essay_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_essay_class(final SubLObject new_instance) {
        subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_essay_instance_alt(SubLObject new_instance) {
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

    public static SubLObject subloop_reserved_initialize_essay_instance(final SubLObject new_instance) {
        subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        subloop_initialize_slot(new_instance, ANSWER, INFO_REQUEST, NIL);
        subloop_initialize_slot(new_instance, ANSWER, CONTENT, NIL);
        subloop_initialize_slot(new_instance, ANSWER, CONFIDENCE, NIL);
        subloop_initialize_slot(new_instance, ANSWER, scenario.RELEVANCE, NIL);
        subloop_initialize_slot(new_instance, ANSWER, JUSTIFICATION, NIL);
        subloop_initialize_slot(new_instance, ANSWER, INFO, NIL);
        subloop_initialize_slot(new_instance, scenario.ESSAY, scenario.SUBQUESTION_ANSWERS, NIL);
        subloop_initialize_slot(new_instance, scenario.ESSAY, scenario.IDENTIFIED_ENTITIES, NIL);
        return NIL;
    }

    public static final SubLObject essay_p_alt(SubLObject essay) {
        return classes.subloop_instanceof_class(essay, ESSAY);
    }

    public static SubLObject essay_p(final SubLObject essay) {
        return subloop_instanceof_class(essay, scenario.ESSAY);
    }

    /**
     *
     *
     * @param PASSAGES
    listp;
     * 		
     * @return listp; the list of conses of the most salient passages among PASSAGES
    and their confidences, ranked by their salientness.
     * @unknown aldag
     */
    @LispMethod(comment = "@param PASSAGES\nlistp;\r\n\t\t\r\n@return listp; the list of conses of the most salient passages among PASSAGES\r\nand their confidences, ranked by their salientness.\r\n@unknown aldag")
    public static final SubLObject essay_select_method_alt(SubLObject self, SubLObject passages) {
        SubLTrampolineFile.checkType(passages, LISTP);
        {
            SubLObject selected = NIL;
            SubLObject require_similarity = $float$0_3;
            SubLObject clusters = clustering.cluster(passages, PASSAGE_SIMILARITY, ONE_INTEGER, require_similarity);
            SubLObject cdolist_list_var = clusters;
            SubLObject cluster = NIL;
            for (cluster = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cluster = cdolist_list_var.first()) {
                {
                    SubLObject max_passages = methods.funcall_class_method_with_1_args(CORPUS_PASSAGE, MAX_INSTANCES, clustering.cluster_elements(cluster));
                    selected = cons(methods.funcall_class_method_with_1_args(ESSAY, TYPICAL_INSTANCE, max_passages), selected);
                }
            }
            return selected;
        }
    }

    /**
     *
     *
     * @param PASSAGES
    listp;
     * 		
     * @return listp; the list of conses of the most salient passages among PASSAGES
    and their confidences, ranked by their salientness.
     * @unknown aldag
     */
    @LispMethod(comment = "@param PASSAGES\nlistp;\r\n\t\t\r\n@return listp; the list of conses of the most salient passages among PASSAGES\r\nand their confidences, ranked by their salientness.\r\n@unknown aldag")
    public static SubLObject essay_select_method(final SubLObject self, final SubLObject passages) {
        assert NIL != listp(passages) : "! listp(passages) " + ("Types.listp(passages) " + "CommonSymbols.NIL != Types.listp(passages) ") + passages;
        SubLObject selected = NIL;
        final SubLObject require_similarity = scenario.$float$0_3;
        SubLObject cdolist_list_var;
        final SubLObject clusters = cdolist_list_var = cluster(passages, scenario.PASSAGE_SIMILARITY, ONE_INTEGER, require_similarity);
        SubLObject cluster = NIL;
        cluster = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject max_passages = funcall_class_method_with_1_args(scenario.CORPUS_PASSAGE, scenario.MAX_INSTANCES, cluster_elements(cluster));
            selected = cons(funcall_class_method_with_1_args(scenario.ESSAY, TYPICAL_INSTANCE, max_passages), selected);
            cdolist_list_var = cdolist_list_var.rest();
            cluster = cdolist_list_var.first();
        } 
        return selected;
    }

    /**
     *
     *
     * @param ANSWERS
    listp
     * 		
     * @return answer-p; the most typical answer among ANSWERS.
     * @unknown aldag
     */
    @LispMethod(comment = "@param ANSWERS\nlistp\r\n\t\t\r\n@return answer-p; the most typical answer among ANSWERS.\r\n@unknown aldag")
    public static final SubLObject essay_typical_instance_method_alt(SubLObject self, SubLObject passages) {
        SubLTrampolineFile.checkType(passages, LISTP);
        {
            SubLObject typical = passages.first();
            SubLObject centroid = sparse_vector.svector_centroid(Mapping.mapcar(GET_ABSTRACT_PASSAGE_VECTOR, passages));
            SubLObject centroid_length = sparse_vector.svector_length(centroid);
            if (!centroid_length.isZero()) {
                {
                    SubLObject typical_vector = search_engine.get_abstract_passage_vector(typical);
                    SubLObject min_distance = com.cyc.cycjava.cycl.quirk.scenario.safe_svector_cosine_angle(typical_vector, centroid, UNPROVIDED);
                    SubLObject distance = NIL;
                    SubLObject cdolist_list_var = passages;
                    SubLObject passage = NIL;
                    for (passage = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , passage = cdolist_list_var.first()) {
                        {
                            SubLObject passage_vector = search_engine.get_abstract_passage_vector(passage);
                            distance = com.cyc.cycjava.cycl.quirk.scenario.safe_svector_cosine_angle(passage_vector, centroid, UNPROVIDED);
                            if (distance.numG(min_distance)) {
                                min_distance = distance;
                                typical = passage;
                            }
                        }
                    }
                }
            }
            return typical;
        }
    }

    /**
     *
     *
     * @param ANSWERS
    listp
     * 		
     * @return answer-p; the most typical answer among ANSWERS.
     * @unknown aldag
     */
    @LispMethod(comment = "@param ANSWERS\nlistp\r\n\t\t\r\n@return answer-p; the most typical answer among ANSWERS.\r\n@unknown aldag")
    public static SubLObject essay_typical_instance_method(final SubLObject self, final SubLObject passages) {
        assert NIL != listp(passages) : "! listp(passages) " + ("Types.listp(passages) " + "CommonSymbols.NIL != Types.listp(passages) ") + passages;
        SubLObject typical = passages.first();
        final SubLObject centroid = svector_centroid(Mapping.mapcar(scenario.GET_ABSTRACT_PASSAGE_VECTOR, passages));
        final SubLObject centroid_length = svector_length(centroid);
        if (!centroid_length.isZero()) {
            final SubLObject typical_vector = search_engine.get_abstract_passage_vector(typical);
            SubLObject min_distance = scenario.safe_svector_cosine_angle(typical_vector, centroid, UNPROVIDED);
            SubLObject distance = NIL;
            SubLObject cdolist_list_var = passages;
            SubLObject passage = NIL;
            passage = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject passage_vector = search_engine.get_abstract_passage_vector(passage);
                distance = scenario.safe_svector_cosine_angle(passage_vector, centroid, UNPROVIDED);
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

    /**
     *
     *
     * @param INFO-REQUEST,
    scenario-p.
     * 		
     * @param PASSAGES,
     * 		a listp of abstract-passage-p
     * @param KEY-POINTS,
     * 		a listp of strings
     * @unknown essay-p a new essay.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param INFO-REQUEST,\nscenario-p.\r\n\t\t\r\n@param PASSAGES,\r\n\t\ta listp of abstract-passage-p\r\n@param KEY-POINTS,\r\n\t\ta listp of strings\r\n@unknown essay-p a new essay.\r\n@unknown bertolo")
    public static final SubLObject new_essay_alt(SubLObject info_request, SubLObject passages, SubLObject key_points) {
        if (key_points == UNPROVIDED) {
            key_points = NIL;
        }
        {
            SubLObject essay = object.new_class_instance(ESSAY);
            answer.set_answer_info_request(essay, info_request);
            answer.set_answer_content(essay, passages);
            instances.set_slot(essay, KEY_POINTS, key_points);
            return essay;
        }
    }

    /**
     *
     *
     * @param INFO-REQUEST,
    scenario-p.
     * 		
     * @param PASSAGES,
     * 		a listp of abstract-passage-p
     * @param KEY-POINTS,
     * 		a listp of strings
     * @unknown essay-p a new essay.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param INFO-REQUEST,\nscenario-p.\r\n\t\t\r\n@param PASSAGES,\r\n\t\ta listp of abstract-passage-p\r\n@param KEY-POINTS,\r\n\t\ta listp of strings\r\n@unknown essay-p a new essay.\r\n@unknown bertolo")
    public static SubLObject new_essay(final SubLObject info_request, final SubLObject passages, SubLObject key_points) {
        if (key_points == UNPROVIDED) {
            key_points = NIL;
        }
        final SubLObject essay = new_class_instance(scenario.ESSAY);
        answer.set_answer_info_request(essay, info_request);
        answer.set_answer_content(essay, passages);
        set_slot(essay, scenario.KEY_POINTS, key_points);
        return essay;
    }

    public static final SubLObject essay_print_method_alt(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_essay_method = NIL;
            SubLObject identified_entities = com.cyc.cycjava.cycl.quirk.scenario.get_essay_identified_entities(self);
            SubLObject content = answer.get_answer_content(self);
            try {
                try {
                    write_string($str_alt87$__ESSAY_sources_, stream, UNPROVIDED, UNPROVIDED);
                    prin1(length(content), stream);
                    write_string($str_alt88$_entities_, stream, UNPROVIDED, UNPROVIDED);
                    prin1(length(identified_entities), stream);
                    write_string($str_alt89$_, stream, UNPROVIDED, UNPROVIDED);
                    terpri(stream);
                    sublisp_throw($sym86$OUTER_CATCH_FOR_ESSAY_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.scenario.set_essay_identified_entities(self, identified_entities);
                            answer.set_answer_content(self, content);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_essay_method = Errors.handleThrowable(ccatch_env_var, $sym86$OUTER_CATCH_FOR_ESSAY_METHOD);
            }
            return catch_var_for_essay_method;
        }
    }

    public static SubLObject essay_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_essay_method = NIL;
        final SubLObject identified_entities = scenario.get_essay_identified_entities(self);
        final SubLObject content = answer.get_answer_content(self);
        try {
            thread.throwStack.push(scenario.$sym86$OUTER_CATCH_FOR_ESSAY_METHOD);
            try {
                write_string(scenario.$str87$__ESSAY_sources_, stream, UNPROVIDED, UNPROVIDED);
                prin1(length(content), stream);
                write_string(scenario.$str88$_entities_, stream, UNPROVIDED, UNPROVIDED);
                prin1(length(identified_entities), stream);
                write_string(scenario.$str89$_, stream, UNPROVIDED, UNPROVIDED);
                terpri(stream);
                sublisp_throw(scenario.$sym86$OUTER_CATCH_FOR_ESSAY_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    scenario.set_essay_identified_entities(self, identified_entities);
                    answer.set_answer_content(self, content);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_essay_method = Errors.handleThrowable(ccatch_env_var, scenario.$sym86$OUTER_CATCH_FOR_ESSAY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_essay_method;
    }

    public static final SubLObject essay_chronology_method_alt(SubLObject self) {
        return methods.funcall_instance_method_with_1_args(self, RENDER, $list_alt94);
    }

    public static SubLObject essay_chronology_method(final SubLObject self) {
        return funcall_instance_method_with_1_args(self, scenario.RENDER, scenario.$list94);
    }

    public static final SubLObject essay_render_method_alt(SubLObject self, SubLObject strategy) {
        if (strategy == UNPROVIDED) {
            strategy = $list_alt98;
        }
        {
            SubLObject catch_var_for_essay_method = NIL;
            SubLObject content = answer.get_answer_content(self);
            try {
                try {
                    {
                        SubLObject format = getf(strategy, $FORMAT, UNPROVIDED);
                        SubLObject order = getf(strategy, $ORDER, UNPROVIDED);
                        SubLObject accumulator = NIL;
                        {
                            SubLObject pcase_var = format;
                            if (pcase_var.eql($TEXT)) {
                                accumulator = $str_alt103$;
                            }
                        }
                        {
                            SubLObject pcase_var = order;
                            if (pcase_var.eql($SEQUENTIAL)) {
                                {
                                    SubLObject cdolist_list_var = content;
                                    SubLObject passage = NIL;
                                    for (passage = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , passage = cdolist_list_var.first()) {
                                        accumulator = cconcatenate(accumulator, new SubLObject[]{ methods.funcall_instance_method_with_0_args(passage, GET_CONTENT), string_utilities.$new_line_string$.getGlobalValue(), $str_alt105$_, methods.funcall_instance_method_with_0_args(passage, GET_SOURCE), $str_alt107$_, string_utilities.$new_line_string$.getGlobalValue(), string_utilities.$new_line_string$.getGlobalValue() });
                                    }
                                }
                            } else {
                                if (pcase_var.eql($CHRONOLOGICAL)) {
                                    {
                                        SubLObject sorted = Sort.sort(copy_list(content), ABSTRACT_PASSAGE_OLDER_METHOD, UNPROVIDED);
                                        SubLObject cdolist_list_var = sorted;
                                        SubLObject passage = NIL;
                                        for (passage = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , passage = cdolist_list_var.first()) {
                                            accumulator = cconcatenate(accumulator, new SubLObject[]{ methods.funcall_instance_method_with_0_args(passage, GET_CONTENT), string_utilities.$new_line_string$.getGlobalValue(), $str_alt105$_, methods.funcall_instance_method_with_0_args(passage, GET_SOURCE), $str_alt107$_, string_utilities.$new_line_string$.getGlobalValue(), string_utilities.$new_line_string$.getGlobalValue() });
                                        }
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym99$OUTER_CATCH_FOR_ESSAY_METHOD, accumulator);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            answer.set_answer_content(self, content);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_essay_method = Errors.handleThrowable(ccatch_env_var, $sym99$OUTER_CATCH_FOR_ESSAY_METHOD);
            }
            return catch_var_for_essay_method;
        }
    }

    public static SubLObject essay_render_method(final SubLObject self, SubLObject strategy) {
        if (strategy == UNPROVIDED) {
            strategy = scenario.$list98;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_essay_method = NIL;
        final SubLObject content = answer.get_answer_content(self);
        try {
            thread.throwStack.push(scenario.$sym99$OUTER_CATCH_FOR_ESSAY_METHOD);
            try {
                final SubLObject format = getf(strategy, $FORMAT, UNPROVIDED);
                final SubLObject order = getf(strategy, $ORDER, UNPROVIDED);
                SubLObject accumulator = NIL;
                SubLObject pcase_var = format;
                if (pcase_var.eql($TEXT)) {
                    accumulator = scenario.$str103$;
                }
                pcase_var = order;
                if (pcase_var.eql($SEQUENTIAL)) {
                    SubLObject cdolist_list_var = content;
                    SubLObject passage = NIL;
                    passage = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        accumulator = cconcatenate(accumulator, new SubLObject[]{ funcall_instance_method_with_0_args(passage, GET_CONTENT), $new_line_string$.getGlobalValue(), scenario.$str105$_, funcall_instance_method_with_0_args(passage, GET_SOURCE), scenario.$str107$_, $new_line_string$.getGlobalValue(), $new_line_string$.getGlobalValue() });
                        cdolist_list_var = cdolist_list_var.rest();
                        passage = cdolist_list_var.first();
                    } 
                } else
                    if (pcase_var.eql($CHRONOLOGICAL)) {
                        SubLObject cdolist_list_var2;
                        final SubLObject sorted = cdolist_list_var2 = Sort.sort(copy_list(content), scenario.ABSTRACT_PASSAGE_OLDER_METHOD, UNPROVIDED);
                        SubLObject passage2 = NIL;
                        passage2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            accumulator = cconcatenate(accumulator, new SubLObject[]{ funcall_instance_method_with_0_args(passage2, GET_CONTENT), $new_line_string$.getGlobalValue(), scenario.$str105$_, funcall_instance_method_with_0_args(passage2, GET_SOURCE), scenario.$str107$_, $new_line_string$.getGlobalValue(), $new_line_string$.getGlobalValue() });
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            passage2 = cdolist_list_var2.first();
                        } 
                    }

                sublisp_throw(scenario.$sym99$OUTER_CATCH_FOR_ESSAY_METHOD, accumulator);
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
            catch_var_for_essay_method = Errors.handleThrowable(ccatch_env_var, scenario.$sym99$OUTER_CATCH_FOR_ESSAY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_essay_method;
    }

    public static final SubLObject essay_answer_subquestions_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_essay_method = NIL;
            SubLObject subquestion_answers = com.cyc.cycjava.cycl.quirk.scenario.get_essay_subquestion_answers(self);
            SubLObject content = answer.get_answer_content(self);
            SubLObject info_request = answer.get_answer_info_request(self);
            try {
                try {
                    {
                        SubLObject cdolist_list_var = instances.get_slot(info_request, QUESTIONS);
                        SubLObject v_question = NIL;
                        for (v_question = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_question = cdolist_list_var.first()) {
                            if (NIL != methods.funcall_class_method_with_1_args(ESSAY, VIABLE_QUESTION, v_question)) {
                                {
                                    SubLObject cdolist_list_var_3 = content;
                                    SubLObject passage = NIL;
                                    for (passage = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , passage = cdolist_list_var_3.first()) {
                                        {
                                            SubLObject answers = methods.funcall_instance_method_with_1_args(v_question, EXTRACT, passage);
                                            if (NIL != answers) {
                                                subquestion_answers = append(methods.funcall_class_method_with_1_args(answers.first(), SELECT, answers), subquestion_answers);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym112$OUTER_CATCH_FOR_ESSAY_METHOD, self);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.scenario.set_essay_subquestion_answers(self, subquestion_answers);
                            answer.set_answer_content(self, content);
                            answer.set_answer_info_request(self, info_request);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_essay_method = Errors.handleThrowable(ccatch_env_var, $sym112$OUTER_CATCH_FOR_ESSAY_METHOD);
            }
            return catch_var_for_essay_method;
        }
    }

    public static SubLObject essay_answer_subquestions_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_essay_method = NIL;
        SubLObject subquestion_answers = scenario.get_essay_subquestion_answers(self);
        final SubLObject content = answer.get_answer_content(self);
        final SubLObject info_request = answer.get_answer_info_request(self);
        try {
            thread.throwStack.push(scenario.$sym112$OUTER_CATCH_FOR_ESSAY_METHOD);
            try {
                SubLObject cdolist_list_var = get_slot(info_request, scenario.QUESTIONS);
                SubLObject v_question = NIL;
                v_question = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != funcall_class_method_with_1_args(scenario.ESSAY, scenario.VIABLE_QUESTION, v_question)) {
                        SubLObject cdolist_list_var_$4 = content;
                        SubLObject passage = NIL;
                        passage = cdolist_list_var_$4.first();
                        while (NIL != cdolist_list_var_$4) {
                            final SubLObject answers = funcall_instance_method_with_1_args(v_question, EXTRACT, passage);
                            if (NIL != answers) {
                                subquestion_answers = append(funcall_class_method_with_1_args(answers.first(), SELECT, answers), subquestion_answers);
                            }
                            cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                            passage = cdolist_list_var_$4.first();
                        } 
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_question = cdolist_list_var.first();
                } 
                sublisp_throw(scenario.$sym112$OUTER_CATCH_FOR_ESSAY_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    scenario.set_essay_subquestion_answers(self, subquestion_answers);
                    answer.set_answer_content(self, content);
                    answer.set_answer_info_request(self, info_request);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_essay_method = Errors.handleThrowable(ccatch_env_var, scenario.$sym112$OUTER_CATCH_FOR_ESSAY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_essay_method;
    }

    static private final SubLList $list_alt2 = list(new SubLObject[]{ list(makeSymbol("LEXICON"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("PARSER"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("TAGGER"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("STRING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CORPORA"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SENTENCES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("AUGMENTATION-TERMS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("VECTOR"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("QUESTIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ANSWERS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("VIABLE-QUESTION"), list(makeSymbol("QUESTION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VECTOR"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER"), NIL, makeKeyword("PUBLIC")) });

    public static final SubLObject essay_background_identify_entities_method_alt(SubLObject self) {
        process_utilities.new_task(format(NIL, $str_alt117$_S, gensym(UNPROVIDED)), ESSAY_IDENTIFY_ENTITIES_METHOD, list(self), UNPROVIDED);
        return self;
    }

    public static SubLObject essay_background_identify_entities_method(final SubLObject self) {
        process_utilities.new_task(format(NIL, scenario.$str117$_S, gensym(UNPROVIDED)), scenario.ESSAY_IDENTIFY_ENTITIES_METHOD, list(self), UNPROVIDED);
        return self;
    }

    public static final SubLObject essay_get_entity_by_name_method_alt(SubLObject self, SubLObject name) {
        {
            SubLObject catch_var_for_essay_method = NIL;
            SubLObject identified_entities = com.cyc.cycjava.cycl.quirk.scenario.get_essay_identified_entities(self);
            try {
                try {
                    SubLTrampolineFile.checkType(name, STRINGP);
                    {
                        SubLObject named_entity = NIL;
                        if (NIL == named_entity) {
                            {
                                SubLObject csome_list_var = identified_entities;
                                SubLObject entity = NIL;
                                for (entity = csome_list_var.first(); !((NIL != named_entity) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , entity = csome_list_var.first()) {
                                    if (name.equalp(instances.get_slot(entity, STRING))) {
                                        named_entity = entity;
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym123$OUTER_CATCH_FOR_ESSAY_METHOD, named_entity);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.scenario.set_essay_identified_entities(self, identified_entities);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_essay_method = Errors.handleThrowable(ccatch_env_var, $sym123$OUTER_CATCH_FOR_ESSAY_METHOD);
            }
            return catch_var_for_essay_method;
        }
    }

    public static SubLObject essay_get_entity_by_name_method(final SubLObject self, final SubLObject name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_essay_method = NIL;
        final SubLObject identified_entities = scenario.get_essay_identified_entities(self);
        try {
            thread.throwStack.push(scenario.$sym123$OUTER_CATCH_FOR_ESSAY_METHOD);
            try {
                assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
                SubLObject named_entity = NIL;
                if (NIL == named_entity) {
                    SubLObject csome_list_var = identified_entities;
                    SubLObject entity = NIL;
                    entity = csome_list_var.first();
                    while ((NIL == named_entity) && (NIL != csome_list_var)) {
                        if (name.equalp(get_slot(entity, STRING))) {
                            named_entity = entity;
                        }
                        csome_list_var = csome_list_var.rest();
                        entity = csome_list_var.first();
                    } 
                }
                sublisp_throw(scenario.$sym123$OUTER_CATCH_FOR_ESSAY_METHOD, named_entity);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    scenario.set_essay_identified_entities(self, identified_entities);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_essay_method = Errors.handleThrowable(ccatch_env_var, scenario.$sym123$OUTER_CATCH_FOR_ESSAY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_essay_method;
    }

    static private final SubLList $list_alt22 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt23 = list(makeSymbol("QUESTION"));

    static private final SubLList $list_alt24 = list(makeString("@param QUESTION, question-p;\n   @return BOOLEAN, T if question is of the kind we can answer reliably, NIL otherwise\n   @owner bertolo"), list(makeSymbol("CLET"), list(makeSymbol("VIABLE")), list(makeSymbol("CSOME"), list(makeSymbol("PRED"), list(QUOTE, list(new SubLObject[]{ makeSymbol("DEFINITIONAL-QUESTION-P"), makeSymbol("INTELLIGENT-AGENT-QUESTION-P"), makeSymbol("GEOGRAPHICAL-QUESTION-P"), makeSymbol("EVENT-LOCATION-QUESTION-P"), makeSymbol("DISTANCE-QUESTION-P"), makeSymbol("PHYSICAL-QUANTITY-QUESTION-P"), makeSymbol("AGE-QUESTION-P"), makeSymbol("WHAT-QUESTION-P"), makeSymbol("DATE-QUESTION-P") })), makeSymbol("VIABLE")), list(makeSymbol("CSETQ"), makeSymbol("VIABLE"), list(makeSymbol("FUNCALL"), makeSymbol("PRED"), makeSymbol("QUESTION")))), list(RET, makeSymbol("VIABLE"))));

    static private final SubLList $list_alt25 = list(new SubLObject[]{ makeSymbol("DEFINITIONAL-QUESTION-P"), makeSymbol("INTELLIGENT-AGENT-QUESTION-P"), makeSymbol("GEOGRAPHICAL-QUESTION-P"), makeSymbol("EVENT-LOCATION-QUESTION-P"), makeSymbol("DISTANCE-QUESTION-P"), makeSymbol("PHYSICAL-QUANTITY-QUESTION-P"), makeSymbol("AGE-QUESTION-P"), makeSymbol("WHAT-QUESTION-P"), makeSymbol("DATE-QUESTION-P") });

    static private final SubLList $list_alt28 = list(makeString("Initializes all class slots in question\n   @return scenario-p\n   @owner bertolo"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("PUNLESS"), makeSymbol("LEXICON"), list(makeSymbol("CSETQ"), makeSymbol("LEXICON"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("QUIRK-LEXICON"))))), list(makeSymbol("PUNLESS"), makeSymbol("PARSER"), list(makeSymbol("CSETQ"), makeSymbol("PARSER"), list(makeSymbol("NEW-CHARNIAK-PARSER"), $WARN, makeInteger(30)))), list(makeSymbol("PUNLESS"), makeSymbol("TAGGER"), list(makeSymbol("CSETQ"), makeSymbol("TAGGER"), list(makeSymbol("GET-TAGGER")))), list(RET, makeSymbol("SELF")));

    public static final SubLObject essay_get_entities_by_types_method_alt(SubLObject self, SubLObject desired_types) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_essay_method = NIL;
                SubLObject identified_entities = com.cyc.cycjava.cycl.quirk.scenario.get_essay_identified_entities(self);
                try {
                    try {
                        SubLTrampolineFile.checkType(desired_types, LISTP);
                        {
                            SubLObject appropriate_entities = NIL;
                            SubLObject cdolist_list_var = identified_entities;
                            SubLObject entity = NIL;
                            for (entity = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entity = cdolist_list_var.first()) {
                                {
                                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                        if (NIL != genls.any_genl_anyP(methods.funcall_instance_method_with_0_args(entity, ALL_TYPES), desired_types, UNPROVIDED, UNPROVIDED)) {
                                            appropriate_entities = cons(entity, appropriate_entities);
                                        }
                                    } finally {
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                            sublisp_throw($sym128$OUTER_CATCH_FOR_ESSAY_METHOD, appropriate_entities);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                com.cyc.cycjava.cycl.quirk.scenario.set_essay_identified_entities(self, identified_entities);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_essay_method = Errors.handleThrowable(ccatch_env_var, $sym128$OUTER_CATCH_FOR_ESSAY_METHOD);
                }
                return catch_var_for_essay_method;
            }
        }
    }

    public static SubLObject essay_get_entities_by_types_method(final SubLObject self, final SubLObject desired_types) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_essay_method = NIL;
        final SubLObject identified_entities = scenario.get_essay_identified_entities(self);
        try {
            thread.throwStack.push(scenario.$sym128$OUTER_CATCH_FOR_ESSAY_METHOD);
            try {
                assert NIL != listp(desired_types) : "! listp(desired_types) " + ("Types.listp(desired_types) " + "CommonSymbols.NIL != Types.listp(desired_types) ") + desired_types;
                SubLObject appropriate_entities = NIL;
                SubLObject cdolist_list_var = identified_entities;
                SubLObject entity = NIL;
                entity = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
                    try {
                        $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        $mt$.bind(scenario.$$EverythingPSC, thread);
                        if (NIL != any_genl_anyP(funcall_instance_method_with_0_args(entity, ALL_TYPES), desired_types, UNPROVIDED, UNPROVIDED)) {
                            appropriate_entities = cons(entity, appropriate_entities);
                        }
                    } finally {
                        $mt$.rebind(_prev_bind_2, thread);
                        $relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    entity = cdolist_list_var.first();
                } 
                sublisp_throw(scenario.$sym128$OUTER_CATCH_FOR_ESSAY_METHOD, appropriate_entities);
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    scenario.set_essay_identified_entities(self, identified_entities);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_essay_method = Errors.handleThrowable(ccatch_env_var, scenario.$sym128$OUTER_CATCH_FOR_ESSAY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_essay_method;
    }

    static private final SubLList $list_alt35 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt36 = list(makeString("@return sparse-vector-p, a vector representation of this scenario.\n   @owner bertolo"), list(makeSymbol("PWHEN"), makeSymbol("VECTOR"), list(RET, makeSymbol("VECTOR"))), list(makeSymbol("CLET"), list(list(makeSymbol("AUGMENTED-STRING"), list(makeSymbol("CCONCATENATE"), makeSymbol("STRING"), list(makeSymbol("BUNGE"), makeSymbol("AUGMENTATION-TERMS")))), list(makeSymbol("NEW-VECTOR"), list(makeSymbol("NEW-STRING-VECTOR"), makeSymbol("AUGMENTED-STRING")))), list(makeSymbol("CSETQ"), makeSymbol("VECTOR"), makeSymbol("NEW-VECTOR")), list(RET, makeSymbol("NEW-VECTOR"))));

    static private final SubLList $list_alt39 = list(makeString("AQUAINT"));

    static private final SubLList $list_alt43 = list(makeKeyword("PUBLIC"), makeKeyword("NO-MEMBER-VARIABLES"));

    static private final SubLList $list_alt44 = list(makeString("@return essay-p, an essay to answer this scenario.\n   @owner bertolo"), list(makeSymbol("CLET"), list(list(makeSymbol("WORDS"), NIL), list(makeSymbol("PASSAGES"), NIL), makeSymbol("SCENARIO-QUERY")), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("ANSWERS")), NIL), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("AUGMENTATION-TERMS")), NIL), list(makeSymbol("CDOLIST"), list(makeSymbol("SENTENCE"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("SENTENCES")))), list(makeSymbol("SENTENCE-DO-WORDS"), list(makeSymbol("WORD"), makeSymbol("SENTENCE")), list(makeSymbol("CPUSH"), list(makeSymbol("WORD-STRING"), makeSymbol("WORD")), makeSymbol("WORDS")))), list(makeSymbol("CDOLIST"), list(makeSymbol("CORPUS"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CORPORA")))), list(makeSymbol("CLET"), list(list(makeSymbol("AUGMENTED-TERMS"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("QUESTION")), list(QUOTE, makeSymbol("AUGMENT-TERMS")), makeSymbol("WORDS"), makeSymbol("CORPUS")))), list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("AUGMENTATION-TERMS")), list(makeSymbol("CONS"), list(makeSymbol("CONS"), makeSymbol("CORPUS"), makeSymbol("AUGMENTED-TERMS")), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("AUGMENTATION-TERMS"))))), list(makeSymbol("CSETQ"), makeSymbol("SCENARIO-QUERY"), list(makeSymbol("NEW-LEMUR-QUERY"), list(makeSymbol("BUNGE"), list(makeSymbol("APPEND"), makeSymbol("WORDS"), makeSymbol("AUGMENTED-TERMS"))), makeSymbol("CORPUS"), TEN_INTEGER, makeInteger(50))), list(makeSymbol("CDOLIST"), list(makeSymbol("PASSAGE"), list(makeSymbol("FIM"), makeSymbol("SCENARIO-QUERY"), list(QUOTE, makeSymbol("ANSWER")))), list(makeSymbol("CPUSH"), makeSymbol("PASSAGE"), makeSymbol("PASSAGES"))))), list(RET, list(makeSymbol("NEW-ESSAY"), makeSymbol("SELF"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("ESSAY")), list(QUOTE, makeSymbol("SELECT")), makeSymbol("PASSAGES"))))));

    public static final SubLObject essay_identify_entities_method_alt(SubLObject self, SubLObject types_to_identify) {
        if (types_to_identify == UNPROVIDED) {
            types_to_identify = $list_alt136;
        }
        {
            SubLObject catch_var_for_essay_method = NIL;
            SubLObject identified_entities = com.cyc.cycjava.cycl.quirk.scenario.get_essay_identified_entities(self);
            SubLObject content = answer.get_answer_content(self);
            SubLObject info_request = answer.get_answer_info_request(self);
            try {
                try {
                    SubLTrampolineFile.checkType(types_to_identify, LISTP);
                    {
                        SubLObject lexicon = instances.get_slot(info_request, LEXICON);
                        SubLObject entities_hash = make_hash_table($int$32, symbol_function(EQUAL), UNPROVIDED);
                        SubLObject cdolist_list_var = content;
                        SubLObject passage = NIL;
                        for (passage = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , passage = cdolist_list_var.first()) {
                            {
                                SubLObject passage_entities = methods.funcall_instance_method_with_2_args(passage, IDENTIFY_ENTITIES, lexicon, types_to_identify);
                                SubLObject cdolist_list_var_4 = passage_entities;
                                SubLObject entity = NIL;
                                for (entity = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , entity = cdolist_list_var_4.first()) {
                                    {
                                        SubLObject string = instances.get_slot(entity, STRING);
                                        SubLObject value = gethash(string, entities_hash, UNPROVIDED);
                                        if (NIL != value) {
                                            methods.funcall_instance_method_with_1_args(value, ADD_PASSAGE, passage);
                                        } else {
                                            sethash(string, entities_hash, entity);
                                        }
                                    }
                                }
                            }
                        }
                        {
                            SubLObject key = NIL;
                            SubLObject value = NIL;
                            {
                                final Iterator cdohash_iterator = getEntrySetIterator(entities_hash);
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        key = getEntryKey(cdohash_entry);
                                        value = getEntryValue(cdohash_entry);
                                        {
                                            SubLObject item_var = value;
                                            if (NIL == member(item_var, identified_entities, TEXTUAL_FOCUS_ENTITY_EQUAL, symbol_function(IDENTITY))) {
                                                identified_entities = cons(item_var, identified_entities);
                                            }
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                            }
                        }
                        sublisp_throw($sym137$OUTER_CATCH_FOR_ESSAY_METHOD, identified_entities);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.scenario.set_essay_identified_entities(self, identified_entities);
                            answer.set_answer_content(self, content);
                            answer.set_answer_info_request(self, info_request);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_essay_method = Errors.handleThrowable(ccatch_env_var, $sym137$OUTER_CATCH_FOR_ESSAY_METHOD);
            }
            return catch_var_for_essay_method;
        }
    }

    public static SubLObject essay_identify_entities_method(final SubLObject self, SubLObject types_to_identify) {
        if (types_to_identify == UNPROVIDED) {
            types_to_identify = scenario.$list136;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_essay_method = NIL;
        SubLObject identified_entities = scenario.get_essay_identified_entities(self);
        final SubLObject content = answer.get_answer_content(self);
        final SubLObject info_request = answer.get_answer_info_request(self);
        try {
            thread.throwStack.push(scenario.$sym137$OUTER_CATCH_FOR_ESSAY_METHOD);
            try {
                assert NIL != listp(types_to_identify) : "! listp(types_to_identify) " + ("Types.listp(types_to_identify) " + "CommonSymbols.NIL != Types.listp(types_to_identify) ") + types_to_identify;
                final SubLObject lexicon = get_slot(info_request, LEXICON);
                final SubLObject entities_hash = make_hash_table($int$32, symbol_function(EQUAL), UNPROVIDED);
                SubLObject cdolist_list_var = content;
                SubLObject passage = NIL;
                passage = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$5;
                    final SubLObject passage_entities = cdolist_list_var_$5 = funcall_instance_method_with_2_args(passage, scenario.IDENTIFY_ENTITIES, lexicon, types_to_identify);
                    SubLObject entity = NIL;
                    entity = cdolist_list_var_$5.first();
                    while (NIL != cdolist_list_var_$5) {
                        final SubLObject string = get_slot(entity, STRING);
                        final SubLObject value = gethash(string, entities_hash, UNPROVIDED);
                        if (NIL != value) {
                            funcall_instance_method_with_1_args(value, scenario.ADD_PASSAGE, passage);
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
                        if (NIL == member(item_var, identified_entities, scenario.TEXTUAL_FOCUS_ENTITY_EQUAL, symbol_function(IDENTITY))) {
                            identified_entities = cons(item_var, identified_entities);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
                sublisp_throw(scenario.$sym137$OUTER_CATCH_FOR_ESSAY_METHOD, identified_entities);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    scenario.set_essay_identified_entities(self, identified_entities);
                    answer.set_answer_content(self, content);
                    answer.set_answer_info_request(self, info_request);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_essay_method = Errors.handleThrowable(ccatch_env_var, scenario.$sym137$OUTER_CATCH_FOR_ESSAY_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_essay_method;
    }

    static private final SubLList $list_alt52 = list(makeSymbol("&OPTIONAL"), makeSymbol("VERBOSE"));

    static private final SubLList $list_alt53 = list(makeString("@param VERBOSE, booleanp\n   @return scenario-p, this scenario\n   As a side effect it computes answers to all viable subquestions of this scenario and\n   stores them in the appropriate slot of this object.\n   @owner bertolo"), list(makeSymbol("CDOLIST"), list(makeSymbol("QUESTION"), makeSymbol("QUESTIONS")), list(makeSymbol("PWHEN"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("SCENARIO")), list(QUOTE, makeSymbol("VIABLE-QUESTION")), makeSymbol("QUESTION")), list(makeSymbol("CLET"), list(list(makeSymbol("Q-ANSWERS"), list(makeSymbol("FIM"), makeSymbol("QUESTION"), list(QUOTE, makeSymbol("ANSWER"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("Q-ANSWERS"), makeSymbol("VERBOSE")), list(makeSymbol("FORMAT"), T, makeString("~%~S has been answered: ~%"), makeSymbol("QUESTION")), list(makeSymbol("CDOLIST"), list(makeSymbol("ANSWER"), makeSymbol("Q-ANSWERS")), list(makeSymbol("FORMAT"), T, makeString("~%    ~S"), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(QUOTE, makeSymbol("GET-CONTENT"))))), list(makeSymbol("FORMAT"), T, makeString("~%~%"), makeSymbol("QUESTION"))), list(makeSymbol("CSETQ"), makeSymbol("ANSWERS"), list(makeSymbol("APPEND"), makeSymbol("Q-ANSWERS"), makeSymbol("ANSWERS")))))), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt55$___S_has_been_answered____ = makeString("~%~S has been answered: ~%");

    static private final SubLString $str_alt56$_______S = makeString("~%    ~S");

    static private final SubLString $str_alt58$____ = makeString("~%~%");

    static private final SubLList $list_alt60 = list(list(makeSymbol("SUBQUESTION-ANSWERS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("IDENTIFIED-ENTITIES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("SELECT"), list(makeSymbol("PASSAGES")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("TYPICAL-INSTANCE"), list(makeSymbol("PASSAGES")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("VIABLE-QUESTION"), list(makeSymbol("QUESTION")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PRINT"), list(makeSymbol("STREAM"), makeSymbol("DEPTH")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RENDER"), list(makeSymbol("&OPTIONAL"), makeSymbol("RENDERING-P-LIST")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-SUBQUESTIONS"), NIL, makeKeyword("PROTECTED")));

    /**
     *
     *
     * @param SVECTOR1
    sparse-vector-p
     * 		
     * @param SVECTOR1
    sparse-vector-p
     * 		
     * @return non-negative-integerp; the cosine of the angle between VECTOR1 and VECTOR2 if both
    vectors have non-zero length, an application dependent fall-back value otherwise (default 0).
     * @unknown bertolo
     */
    @LispMethod(comment = "@param SVECTOR1\nsparse-vector-p\r\n\t\t\r\n@param SVECTOR1\nsparse-vector-p\r\n\t\t\r\n@return non-negative-integerp; the cosine of the angle between VECTOR1 and VECTOR2 if both\r\nvectors have non-zero length, an application dependent fall-back value otherwise (default 0).\r\n@unknown bertolo")
    public static final SubLObject safe_svector_cosine_angle_alt(SubLObject svector1, SubLObject svector2, SubLObject fall_back) {
        if (fall_back == UNPROVIDED) {
            fall_back = ZERO_INTEGER;
        }
        SubLTrampolineFile.checkType(svector1, SPARSE_VECTOR_P);
        SubLTrampolineFile.checkType(svector2, SPARSE_VECTOR_P);
        if (sparse_vector.svector_length(svector1).isZero()) {
            return fall_back;
        } else {
            if (sparse_vector.svector_length(svector2).isZero()) {
                return fall_back;
            } else {
                return sparse_vector.svector_cosine_angle(svector1, svector2);
            }
        }
    }

    /**
     *
     *
     * @param SVECTOR1
    sparse-vector-p
     * 		
     * @param SVECTOR1
    sparse-vector-p
     * 		
     * @return non-negative-integerp; the cosine of the angle between VECTOR1 and VECTOR2 if both
    vectors have non-zero length, an application dependent fall-back value otherwise (default 0).
     * @unknown bertolo
     */
    @LispMethod(comment = "@param SVECTOR1\nsparse-vector-p\r\n\t\t\r\n@param SVECTOR1\nsparse-vector-p\r\n\t\t\r\n@return non-negative-integerp; the cosine of the angle between VECTOR1 and VECTOR2 if both\r\nvectors have non-zero length, an application dependent fall-back value otherwise (default 0).\r\n@unknown bertolo")
    public static SubLObject safe_svector_cosine_angle(final SubLObject svector1, final SubLObject svector2, SubLObject fall_back) {
        if (fall_back == UNPROVIDED) {
            fall_back = ZERO_INTEGER;
        }
        assert NIL != sparse_vector_p(svector1) : "! sparse_vector.sparse_vector_p(svector1) " + ("sparse_vector.sparse_vector_p(svector1) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(svector1) ") + svector1;
        assert NIL != sparse_vector_p(svector2) : "! sparse_vector.sparse_vector_p(svector2) " + ("sparse_vector.sparse_vector_p(svector2) " + "CommonSymbols.NIL != sparse_vector.sparse_vector_p(svector2) ") + svector2;
        if (svector_length(svector1).isZero()) {
            return fall_back;
        }
        if (svector_length(svector2).isZero()) {
            return fall_back;
        }
        return svector_cosine_angle(svector1, svector2);
    }

    public static SubLObject declare_scenario_file() {
        declareFunction("get_scenario_answers", "GET-SCENARIO-ANSWERS", 1, 0, false);
        declareFunction("set_scenario_answers", "SET-SCENARIO-ANSWERS", 2, 0, false);
        declareFunction("get_scenario_questions", "GET-SCENARIO-QUESTIONS", 1, 0, false);
        declareFunction("set_scenario_questions", "SET-SCENARIO-QUESTIONS", 2, 0, false);
        declareFunction("get_scenario_vector", "GET-SCENARIO-VECTOR", 1, 0, false);
        declareFunction("set_scenario_vector", "SET-SCENARIO-VECTOR", 2, 0, false);
        declareFunction("get_scenario_augmentation_terms", "GET-SCENARIO-AUGMENTATION-TERMS", 1, 0, false);
        declareFunction("set_scenario_augmentation_terms", "SET-SCENARIO-AUGMENTATION-TERMS", 2, 0, false);
        declareFunction("get_scenario_sentences", "GET-SCENARIO-SENTENCES", 1, 0, false);
        declareFunction("set_scenario_sentences", "SET-SCENARIO-SENTENCES", 2, 0, false);
        declareFunction("get_scenario_corpora", "GET-SCENARIO-CORPORA", 1, 0, false);
        declareFunction("set_scenario_corpora", "SET-SCENARIO-CORPORA", 2, 0, false);
        declareFunction("get_scenario_string", "GET-SCENARIO-STRING", 1, 0, false);
        declareFunction("set_scenario_string", "SET-SCENARIO-STRING", 2, 0, false);
        declareFunction("get_scenario_tagger", "GET-SCENARIO-TAGGER", 1, 0, false);
        declareFunction("set_scenario_tagger", "SET-SCENARIO-TAGGER", 2, 0, false);
        declareFunction("get_scenario_parser", "GET-SCENARIO-PARSER", 1, 0, false);
        declareFunction("set_scenario_parser", "SET-SCENARIO-PARSER", 2, 0, false);
        declareFunction("get_scenario_lexicon", "GET-SCENARIO-LEXICON", 1, 0, false);
        declareFunction("set_scenario_lexicon", "SET-SCENARIO-LEXICON", 2, 0, false);
        declareFunction("subloop_reserved_initialize_scenario_class", "SUBLOOP-RESERVED-INITIALIZE-SCENARIO-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_scenario_instance", "SUBLOOP-RESERVED-INITIALIZE-SCENARIO-INSTANCE", 1, 0, false);
        declareFunction("scenario_p", "SCENARIO-P", 1, 0, false);
        declareFunction("scenario_viable_question_method", "SCENARIO-VIABLE-QUESTION-METHOD", 2, 0, false);
        declareFunction("scenario_initialize_method", "SCENARIO-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("scenario_get_vector_method", "SCENARIO-GET-VECTOR-METHOD", 1, 0, false);
        declareFunction("new_scenario", "NEW-SCENARIO", 1, 1, false);
        declareFunction("scenario_answer_method", "SCENARIO-ANSWER-METHOD", 1, 0, false);
        declareFunction("scenario_answer_subquestions_method", "SCENARIO-ANSWER-SUBQUESTIONS-METHOD", 1, 1, false);
        declareFunction("get_essay_identified_entities", "GET-ESSAY-IDENTIFIED-ENTITIES", 1, 0, false);
        declareFunction("set_essay_identified_entities", "SET-ESSAY-IDENTIFIED-ENTITIES", 2, 0, false);
        declareFunction("get_essay_subquestion_answers", "GET-ESSAY-SUBQUESTION-ANSWERS", 1, 0, false);
        declareFunction("set_essay_subquestion_answers", "SET-ESSAY-SUBQUESTION-ANSWERS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_essay_class", "SUBLOOP-RESERVED-INITIALIZE-ESSAY-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_essay_instance", "SUBLOOP-RESERVED-INITIALIZE-ESSAY-INSTANCE", 1, 0, false);
        declareFunction("essay_p", "ESSAY-P", 1, 0, false);
        declareFunction("essay_select_method", "ESSAY-SELECT-METHOD", 2, 0, false);
        declareFunction("essay_typical_instance_method", "ESSAY-TYPICAL-INSTANCE-METHOD", 2, 0, false);
        declareFunction("new_essay", "NEW-ESSAY", 2, 1, false);
        declareFunction("essay_print_method", "ESSAY-PRINT-METHOD", 3, 0, false);
        declareFunction("essay_chronology_method", "ESSAY-CHRONOLOGY-METHOD", 1, 0, false);
        declareFunction("essay_render_method", "ESSAY-RENDER-METHOD", 1, 1, false);
        declareFunction("essay_answer_subquestions_method", "ESSAY-ANSWER-SUBQUESTIONS-METHOD", 1, 0, false);
        declareFunction("essay_background_identify_entities_method", "ESSAY-BACKGROUND-IDENTIFY-ENTITIES-METHOD", 1, 0, false);
        declareFunction("essay_get_entity_by_name_method", "ESSAY-GET-ENTITY-BY-NAME-METHOD", 2, 0, false);
        declareFunction("essay_get_entities_by_types_method", "ESSAY-GET-ENTITIES-BY-TYPES-METHOD", 2, 0, false);
        declareFunction("essay_identify_entities_method", "ESSAY-IDENTIFY-ENTITIES-METHOD", 1, 1, false);
        declareFunction("safe_svector_cosine_angle", "SAFE-SVECTOR-COSINE-ANGLE", 2, 1, false);
        return NIL;
    }

    static private final SubLList $list_alt71 = list(makeSymbol("PASSAGES"));

    static private final SubLList $list_alt72 = list(makeString("@param PASSAGES listp;\n     @return listp; the list of conses of the most salient passages among PASSAGES \n     and their confidences, ranked by their salientness.\n     @owner aldag"), list(makeSymbol("CHECK-TYPE"), makeSymbol("PASSAGES"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("SELECTED"), NIL), list(makeSymbol("REQUIRE-SIMILARITY"), makeDouble(0.3)), list(makeSymbol("CLUSTERS"), list(makeSymbol("CLUSTER"), makeSymbol("PASSAGES"), list(QUOTE, makeSymbol("PASSAGE-SIMILARITY")), ONE_INTEGER, makeSymbol("REQUIRE-SIMILARITY")))), list(makeSymbol("CDOLIST"), list(makeSymbol("CLUSTER"), makeSymbol("CLUSTERS")), list(makeSymbol("CLET"), list(list(makeSymbol("MAX-PASSAGES"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("CORPUS-PASSAGE")), list(QUOTE, makeSymbol("MAX-INSTANCES")), list(makeSymbol("CLUSTER-ELEMENTS"), makeSymbol("CLUSTER"))))), list(makeSymbol("CPUSH"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("ESSAY")), list(QUOTE, makeSymbol("TYPICAL-INSTANCE")), makeSymbol("MAX-PASSAGES")), makeSymbol("SELECTED")))), list(RET, makeSymbol("SELECTED"))));

    static private final SubLList $list_alt79 = list(makeString("@param ANSWERS listp\n    @return answer-p; the most typical answer among ANSWERS.\n    @owner aldag"), list(makeSymbol("CHECK-TYPE"), makeSymbol("PASSAGES"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("TYPICAL"), list(makeSymbol("FIRST"), makeSymbol("PASSAGES"))), list(makeSymbol("CENTROID"), list(makeSymbol("SVECTOR-CENTROID"), list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("GET-ABSTRACT-PASSAGE-VECTOR")), makeSymbol("PASSAGES")))), list(makeSymbol("CENTROID-LENGTH"), list(makeSymbol("SVECTOR-LENGTH"), makeSymbol("CENTROID")))), list(makeSymbol("PUNLESS"), list(makeSymbol("ZEROP"), makeSymbol("CENTROID-LENGTH")), list(makeSymbol("CLET"), list(list(makeSymbol("TYPICAL-VECTOR"), list(makeSymbol("GET-ABSTRACT-PASSAGE-VECTOR"), makeSymbol("TYPICAL"))), list(makeSymbol("MIN-DISTANCE"), list(makeSymbol("SAFE-SVECTOR-COSINE-ANGLE"), makeSymbol("TYPICAL-VECTOR"), makeSymbol("CENTROID"))), makeSymbol("DISTANCE")), list(makeSymbol("CDOLIST"), list(makeSymbol("PASSAGE"), makeSymbol("PASSAGES")), list(makeSymbol("CLET"), list(list(makeSymbol("PASSAGE-VECTOR"), list(makeSymbol("GET-ABSTRACT-PASSAGE-VECTOR"), makeSymbol("PASSAGE")))), list(makeSymbol("CSETQ"), makeSymbol("DISTANCE"), list(makeSymbol("SAFE-SVECTOR-COSINE-ANGLE"), makeSymbol("PASSAGE-VECTOR"), makeSymbol("CENTROID"))), list(makeSymbol("PWHEN"), list(makeSymbol(">"), makeSymbol("DISTANCE"), makeSymbol("MIN-DISTANCE")), list(makeSymbol("CSETQ"), makeSymbol("MIN-DISTANCE"), makeSymbol("DISTANCE")), list(makeSymbol("CSETQ"), makeSymbol("TYPICAL"), makeSymbol("PASSAGE"))))))), list(RET, makeSymbol("TYPICAL"))));

    static private final SubLList $list_alt84 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt85 = list(list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<ESSAY sources:"), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), list(makeSymbol("LENGTH"), makeSymbol("CONTENT")), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(" entities:"), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), list(makeSymbol("LENGTH"), makeSymbol("IDENTIFIED-ENTITIES")), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(">"), makeSymbol("STREAM")), list(makeSymbol("TERPRI"), makeSymbol("STREAM")), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt87$__ESSAY_sources_ = makeString("#<ESSAY sources:");

    public static SubLObject init_scenario_file() {
        return NIL;
    }

    static private final SubLString $str_alt88$_entities_ = makeString(" entities:");

    public static SubLObject setup_scenario_file() {
        subloop_new_class(SCENARIO, INFORMATION_REQUEST, NIL, NIL, scenario.$list2);
        class_set_implements_slot_listeners(SCENARIO, NIL);
        subloop_note_class_initialization_function(SCENARIO, scenario.SUBLOOP_RESERVED_INITIALIZE_SCENARIO_CLASS);
        subloop_note_instance_initialization_function(SCENARIO, scenario.SUBLOOP_RESERVED_INITIALIZE_SCENARIO_INSTANCE);
        scenario.subloop_reserved_initialize_scenario_class(SCENARIO);
        methods_incorporate_class_method(scenario.VIABLE_QUESTION, SCENARIO, scenario.$list22, scenario.$list23, scenario.$list24);
        subloop_register_class_method(SCENARIO, scenario.VIABLE_QUESTION, scenario.SCENARIO_VIABLE_QUESTION_METHOD);
        methods_incorporate_instance_method(INITIALIZE, SCENARIO, scenario.$list22, NIL, scenario.$list28);
        subloop_register_instance_method(SCENARIO, INITIALIZE, scenario.SCENARIO_INITIALIZE_METHOD);
        methods_incorporate_instance_method(GET_VECTOR, SCENARIO, scenario.$list35, NIL, scenario.$list36);
        subloop_register_instance_method(SCENARIO, GET_VECTOR, scenario.SCENARIO_GET_VECTOR_METHOD);
        methods_incorporate_instance_method(ANSWER, SCENARIO, scenario.$list43, NIL, scenario.$list44);
        subloop_register_instance_method(SCENARIO, ANSWER, scenario.SCENARIO_ANSWER_METHOD);
        methods_incorporate_instance_method(scenario.ANSWER_SUBQUESTIONS, SCENARIO, scenario.$list35, scenario.$list52, scenario.$list53);
        subloop_register_instance_method(SCENARIO, scenario.ANSWER_SUBQUESTIONS, scenario.SCENARIO_ANSWER_SUBQUESTIONS_METHOD);
        subloop_new_class(scenario.ESSAY, ANSWER, NIL, NIL, scenario.$list60);
        class_set_implements_slot_listeners(scenario.ESSAY, NIL);
        subloop_note_class_initialization_function(scenario.ESSAY, scenario.SUBLOOP_RESERVED_INITIALIZE_ESSAY_CLASS);
        subloop_note_instance_initialization_function(scenario.ESSAY, scenario.SUBLOOP_RESERVED_INITIALIZE_ESSAY_INSTANCE);
        scenario.subloop_reserved_initialize_essay_class(scenario.ESSAY);
        methods_incorporate_class_method(SELECT, scenario.ESSAY, scenario.$list35, scenario.$list71, scenario.$list72);
        subloop_register_class_method(scenario.ESSAY, SELECT, scenario.ESSAY_SELECT_METHOD);
        methods_incorporate_class_method(TYPICAL_INSTANCE, scenario.ESSAY, scenario.$list35, scenario.$list71, scenario.$list79);
        subloop_register_class_method(scenario.ESSAY, TYPICAL_INSTANCE, scenario.ESSAY_TYPICAL_INSTANCE_METHOD);
        methods_incorporate_instance_method(PRINT, scenario.ESSAY, scenario.$list22, scenario.$list84, scenario.$list85);
        subloop_register_instance_method(scenario.ESSAY, PRINT, scenario.ESSAY_PRINT_METHOD);
        methods_incorporate_instance_method(scenario.CHRONOLOGY, scenario.ESSAY, scenario.$list35, NIL, scenario.$list92);
        subloop_register_instance_method(scenario.ESSAY, scenario.CHRONOLOGY, scenario.ESSAY_CHRONOLOGY_METHOD);
        methods_incorporate_instance_method(scenario.RENDER, scenario.ESSAY, scenario.$list35, scenario.$list96, scenario.$list97);
        subloop_register_instance_method(scenario.ESSAY, scenario.RENDER, scenario.ESSAY_RENDER_METHOD);
        methods_incorporate_instance_method(scenario.ANSWER_SUBQUESTIONS, scenario.ESSAY, scenario.$list22, NIL, scenario.$list111);
        subloop_register_instance_method(scenario.ESSAY, scenario.ANSWER_SUBQUESTIONS, scenario.ESSAY_ANSWER_SUBQUESTIONS_METHOD);
        methods_incorporate_instance_method(scenario.BACKGROUND_IDENTIFY_ENTITIES, scenario.ESSAY, scenario.$list35, NIL, scenario.$list116);
        subloop_register_instance_method(scenario.ESSAY, scenario.BACKGROUND_IDENTIFY_ENTITIES, scenario.ESSAY_BACKGROUND_IDENTIFY_ENTITIES_METHOD);
        methods_incorporate_instance_method(scenario.GET_ENTITY_BY_NAME, scenario.ESSAY, scenario.$list35, scenario.$list121, scenario.$list122);
        subloop_register_instance_method(scenario.ESSAY, scenario.GET_ENTITY_BY_NAME, scenario.ESSAY_GET_ENTITY_BY_NAME_METHOD);
        methods_incorporate_instance_method(scenario.GET_ENTITIES_BY_TYPES, scenario.ESSAY, scenario.$list35, scenario.$list126, scenario.$list127);
        subloop_register_instance_method(scenario.ESSAY, scenario.GET_ENTITIES_BY_TYPES, scenario.ESSAY_GET_ENTITIES_BY_TYPES_METHOD);
        methods_incorporate_instance_method(scenario.IDENTIFY_ENTITIES, scenario.ESSAY, scenario.$list35, scenario.$list134, scenario.$list135);
        subloop_register_instance_method(scenario.ESSAY, scenario.IDENTIFY_ENTITIES, scenario.ESSAY_IDENTIFY_ENTITIES_METHOD);
        return NIL;
    }

    static private final SubLString $str_alt89$_ = makeString(">");

    static private final SubLList $list_alt92 = list(list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("RENDER")), list(QUOTE, list(makeKeyword("FORMAT"), $TEXT, makeKeyword("ORDER"), makeKeyword("CHRONOLOGICAL"))))));

    static private final SubLList $list_alt94 = list(makeKeyword("FORMAT"), $TEXT, makeKeyword("ORDER"), makeKeyword("CHRONOLOGICAL"));

    static private final SubLList $list_alt96 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("STRATEGY"), list(QUOTE, list(makeKeyword("FORMAT"), $TEXT, makeKeyword("ORDER"), makeKeyword("SEQUENTIAL")))));

    static private final SubLList $list_alt97 = list(list(makeSymbol("CLET"), list(list(makeSymbol("FORMAT"), list(makeSymbol("GETF"), makeSymbol("STRATEGY"), makeKeyword("FORMAT"))), list(makeSymbol("ORDER"), list(makeSymbol("GETF"), makeSymbol("STRATEGY"), makeKeyword("ORDER"))), makeSymbol("ACCUMULATOR")), list(makeSymbol("PCASE"), makeSymbol("FORMAT"), list($TEXT, list(makeSymbol("CSETQ"), makeSymbol("ACCUMULATOR"), makeString("")))), list(makeSymbol("PCASE"), makeSymbol("ORDER"), list(makeKeyword("SEQUENTIAL"), list(makeSymbol("CDOLIST"), list(makeSymbol("PASSAGE"), makeSymbol("CONTENT")), list(makeSymbol("CSETQ"), makeSymbol("ACCUMULATOR"), list(new SubLObject[]{ makeSymbol("CCONCATENATE"), makeSymbol("ACCUMULATOR"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-CONTENT"))), makeSymbol("*NEW-LINE-STRING*"), makeString("("), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-SOURCE"))), makeString(")"), makeSymbol("*NEW-LINE-STRING*"), makeSymbol("*NEW-LINE-STRING*") })))), list(makeKeyword("CHRONOLOGICAL"), list(makeSymbol("CLET"), list(list(makeSymbol("SORTED"), list(makeSymbol("SORT"), list(makeSymbol("COPY-LIST"), makeSymbol("CONTENT")), list(QUOTE, makeSymbol("ABSTRACT-PASSAGE-OLDER-METHOD"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("PASSAGE"), makeSymbol("SORTED")), list(makeSymbol("CSETQ"), makeSymbol("ACCUMULATOR"), list(new SubLObject[]{ makeSymbol("CCONCATENATE"), makeSymbol("ACCUMULATOR"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-CONTENT"))), makeSymbol("*NEW-LINE-STRING*"), makeString("("), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("GET-SOURCE"))), makeString(")"), makeSymbol("*NEW-LINE-STRING*"), makeSymbol("*NEW-LINE-STRING*") })))))), list(RET, makeSymbol("ACCUMULATOR"))));

    static private final SubLList $list_alt98 = list(makeKeyword("FORMAT"), $TEXT, makeKeyword("ORDER"), makeKeyword("SEQUENTIAL"));

    static private final SubLString $str_alt105$_ = makeString("(");

    static private final SubLString $str_alt107$_ = makeString(")");

    static private final SubLList $list_alt111 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("QUESTION"), list(makeSymbol("GET-SLOT"), makeSymbol("INFO-REQUEST"), list(QUOTE, makeSymbol("QUESTIONS")))), list(makeSymbol("PWHEN"), list(makeSymbol("FCM"), list(QUOTE, makeSymbol("ESSAY")), list(QUOTE, makeSymbol("VIABLE-QUESTION")), makeSymbol("QUESTION")), list(makeSymbol("CDOLIST"), list(makeSymbol("PASSAGE"), makeSymbol("CONTENT")), list(makeSymbol("CLET"), list(list(makeSymbol("ANSWERS"), list(makeSymbol("FIM"), makeSymbol("QUESTION"), list(QUOTE, makeSymbol("EXTRACT")), makeSymbol("PASSAGE")))), list(makeSymbol("PWHEN"), makeSymbol("ANSWERS"), list(makeSymbol("CSETQ"), makeSymbol("SUBQUESTION-ANSWERS"), list(makeSymbol("APPEND"), list(makeSymbol("FCM"), list(makeSymbol("CAR"), makeSymbol("ANSWERS")), list(QUOTE, makeSymbol("SELECT")), makeSymbol("ANSWERS")), makeSymbol("SUBQUESTION-ANSWERS")))))))), list(RET, makeSymbol("SELF")));

    @Override
    public void declareFunctions() {
        scenario.declare_scenario_file();
    }

    @Override
    public void initializeVariables() {
        scenario.init_scenario_file();
    }

    @Override
    public void runTopLevelForms() {
        scenario.setup_scenario_file();
    }

    static {
    }

    static private final SubLList $list_alt116 = list(list(makeSymbol("NEW-TASK"), list(makeSymbol("FORMAT"), NIL, makeString("~S"), list(makeSymbol("GENSYM"))), list(QUOTE, makeSymbol("ESSAY-IDENTIFY-ENTITIES-METHOD")), list(makeSymbol("BQ-LIST"), makeSymbol("SELF"))), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt117$_S = makeString("~S");

    static private final SubLList $list_alt121 = list(makeSymbol("NAME"));

    static private final SubLList $list_alt122 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("NAME"), makeSymbol("STRINGP")), list(makeSymbol("CLET"), list(makeSymbol("NAMED-ENTITY")), list(makeSymbol("CSOME"), list(makeSymbol("ENTITY"), makeSymbol("IDENTIFIED-ENTITIES"), makeSymbol("NAMED-ENTITY")), list(makeSymbol("PWHEN"), list(EQUALP, makeSymbol("NAME"), list(makeSymbol("GET-SLOT"), makeSymbol("ENTITY"), list(QUOTE, makeSymbol("STRING")))), list(makeSymbol("CSETQ"), makeSymbol("NAMED-ENTITY"), makeSymbol("ENTITY")))), list(RET, makeSymbol("NAMED-ENTITY"))));

    static private final SubLList $list_alt126 = list(makeSymbol("DESIRED-TYPES"));

    static private final SubLList $list_alt127 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("DESIRED-TYPES"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("APPROPRIATE-ENTITIES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("ENTITY"), makeSymbol("IDENTIFIED-ENTITIES")), list(makeSymbol("WITH-ALL-MTS"), list(makeSymbol("PWHEN"), list(makeSymbol("ANY-GENL-ANY?"), list(makeSymbol("FIM"), makeSymbol("ENTITY"), list(QUOTE, makeSymbol("ALL-TYPES"))), makeSymbol("DESIRED-TYPES")), list(makeSymbol("CPUSH"), makeSymbol("ENTITY"), makeSymbol("APPROPRIATE-ENTITIES"))))), list(RET, makeSymbol("APPROPRIATE-ENTITIES"))));

    static private final SubLList $list_alt134 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("TYPES-TO-IDENTIFY"), list(QUOTE, list(reader_make_constant_shell("Person"), reader_make_constant_shell("Place"), reader_make_constant_shell("Organization")))));

    static private final SubLList $list_alt135 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("TYPES-TO-IDENTIFY"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("LEXICON"), list(makeSymbol("GET-SLOT"), makeSymbol("INFO-REQUEST"), list(QUOTE, makeSymbol("LEXICON")))), list(makeSymbol("ENTITIES-HASH"), list(makeSymbol("MAKE-HASH-TABLE"), makeInteger(32), list(makeSymbol("FUNCTION"), EQUAL)))), list(makeSymbol("CDOLIST"), list(makeSymbol("PASSAGE"), makeSymbol("CONTENT")), list(makeSymbol("CLET"), list(list(makeSymbol("PASSAGE-ENTITIES"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(QUOTE, makeSymbol("IDENTIFY-ENTITIES")), makeSymbol("LEXICON"), makeSymbol("TYPES-TO-IDENTIFY")))), list(makeSymbol("CDOLIST"), list(makeSymbol("ENTITY"), makeSymbol("PASSAGE-ENTITIES")), list(makeSymbol("CLET"), list(list(makeSymbol("STRING"), list(makeSymbol("GET-SLOT"), makeSymbol("ENTITY"), list(QUOTE, makeSymbol("STRING")))), list(makeSymbol("VALUE"), list(makeSymbol("GETHASH"), makeSymbol("STRING"), makeSymbol("ENTITIES-HASH")))), list(makeSymbol("PIF"), makeSymbol("VALUE"), list(makeSymbol("FIM"), makeSymbol("VALUE"), list(QUOTE, makeSymbol("ADD-PASSAGE")), makeSymbol("PASSAGE")), list(makeSymbol("SETHASH"), makeSymbol("STRING"), makeSymbol("ENTITIES-HASH"), makeSymbol("ENTITY"))))))), list(makeSymbol("CDOHASH"), list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("ENTITIES-HASH")), list(makeSymbol("IGNORE"), makeSymbol("KEY")), list(makeSymbol("CPUSHNEW"), makeSymbol("VALUE"), makeSymbol("IDENTIFIED-ENTITIES"), list(QUOTE, makeSymbol("TEXTUAL-FOCUS-ENTITY-EQUAL")))), list(RET, makeSymbol("IDENTIFIED-ENTITIES"))));

    static private final SubLList $list_alt136 = list(reader_make_constant_shell("Person"), reader_make_constant_shell("Place"), reader_make_constant_shell("Organization"));
}

/**
 * Total time: 764 ms
 */
