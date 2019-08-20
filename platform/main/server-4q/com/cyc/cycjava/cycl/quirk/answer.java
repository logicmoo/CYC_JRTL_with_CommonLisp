/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.quirk;


import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.invert;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.numberp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.clustering;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.quantities;
import com.cyc.cycjava.cycl.sparse_vector;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      ANSWER
 * source file: /cyc/top/cycl/quirk/answer.lisp
 * created:     2019/07/03 17:39:01
 */
public final class answer extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new answer();



    static private final SubLList $list2 = list(new SubLObject[]{ list(makeSymbol("INFO-REQUEST"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CONTENT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CONFIDENCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("RELEVANCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("JUSTIFICATION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INFO"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("SELECT"), list(makeSymbol("CANDIDATES")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INFO-REQUEST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONFIDENCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-RELEVANCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("JUSTIFY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NATURAL-LANGUAGE-FACTOID"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OLDER"), list(makeSymbol("OTHER-ANSWER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DATE"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLSymbol RELEVANCE = makeSymbol("RELEVANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ANSWER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ANSWER-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ANSWER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ANSWER-INSTANCE");

    private static final SubLSymbol MAX_INSTANCES = makeSymbol("MAX-INSTANCES");

    static private final SubLList $list15 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list16 = list(makeSymbol("ANSWERS"));

    static private final SubLList $list17 = list(makeString("@param ANSWERS listp\n    @return answer-p; the highest scoring answer among ANSWERS"), list(makeSymbol("CHECK-TYPE"), makeSymbol("ANSWERS"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("MAX-SCORE"), ZERO_INTEGER), list(makeSymbol("MAX-ANSWERS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("ANSWER"), makeSymbol("ANSWERS")), list(makeSymbol("PWHEN"), list(makeSymbol(">"), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(QUOTE, makeSymbol("GET-CONFIDENCE"))), makeSymbol("MAX-SCORE")), list(makeSymbol("CSETQ"), makeSymbol("MAX-SCORE"), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(QUOTE, makeSymbol("GET-CONFIDENCE")))))), list(makeSymbol("CDOLIST"), list(makeSymbol("ANSWER"), makeSymbol("ANSWERS")), list(makeSymbol("PWHEN"), list(makeSymbol("="), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(QUOTE, makeSymbol("GET-CONFIDENCE"))), makeSymbol("MAX-SCORE")), list(makeSymbol("CPUSH"), makeSymbol("ANSWER"), makeSymbol("MAX-ANSWERS")))), list(RET, makeSymbol("MAX-ANSWERS"))));

    private static final SubLSymbol ANSWER_MAX_INSTANCES_METHOD = makeSymbol("ANSWER-MAX-INSTANCES-METHOD");

    static private final SubLList $list22 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list23 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list24 = list(makeString("Prints this answer to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<ANSWER for "), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), makeSymbol("INFO-REQUEST"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(": "), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), makeSymbol("CONTENT"), makeSymbol("STREAM")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" (~,2F/~,2F)"), makeSymbol("CONFIDENCE"), makeSymbol("RELEVANCE")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym25$OUTER_CATCH_FOR_ANSWER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ANSWER-METHOD");

    static private final SubLString $str26$__ANSWER_for_ = makeString("#<ANSWER for ");

    static private final SubLString $str27$__ = makeString(": ");

    static private final SubLString $str28$____2F___2F_ = makeString(" (~,2F/~,2F)");

    private static final SubLSymbol ANSWER_PRINT_METHOD = makeSymbol("ANSWER-PRINT-METHOD");

    private static final SubLSymbol GET_INFO_REQUEST = makeSymbol("GET-INFO-REQUEST");

    static private final SubLList $list31 = list(makeString("@return object; the info-request of this answer"), list(RET, makeSymbol("INFO-REQUEST")));

    static private final SubLSymbol $sym32$OUTER_CATCH_FOR_ANSWER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ANSWER-METHOD");

    private static final SubLSymbol ANSWER_GET_INFO_REQUEST_METHOD = makeSymbol("ANSWER-GET-INFO-REQUEST-METHOD");

    static private final SubLList $list35 = list(makeString("@return object; the string of this answer"), list(RET, makeSymbol("CONTENT")));

    static private final SubLSymbol $sym36$OUTER_CATCH_FOR_ANSWER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ANSWER-METHOD");

    private static final SubLSymbol ANSWER_GET_CONTENT_METHOD = makeSymbol("ANSWER-GET-CONTENT-METHOD");

    static private final SubLList $list38 = list(makeString("@return non-negative-integer-p; the confidence of this answer"), list(RET, makeSymbol("CONFIDENCE")));

    static private final SubLSymbol $sym39$OUTER_CATCH_FOR_ANSWER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ANSWER-METHOD");

    private static final SubLSymbol ANSWER_GET_CONFIDENCE_METHOD = makeSymbol("ANSWER-GET-CONFIDENCE-METHOD");

    private static final SubLSymbol GET_RELEVANCE = makeSymbol("GET-RELEVANCE");

    static private final SubLList $list42 = list(makeString("@return non-negative-integer-p; the relevance of this answer"), list(RET, makeSymbol("RELEVANCE")));

    static private final SubLSymbol $sym43$OUTER_CATCH_FOR_ANSWER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ANSWER-METHOD");

    private static final SubLSymbol ANSWER_GET_RELEVANCE_METHOD = makeSymbol("ANSWER-GET-RELEVANCE-METHOD");

    private static final SubLSymbol JUSTIFY = makeSymbol("JUSTIFY");

    static private final SubLList $list46 = list(makeString("@return passage; the justification of this answer"), list(RET, makeSymbol("JUSTIFICATION")));

    static private final SubLSymbol $sym47$OUTER_CATCH_FOR_ANSWER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ANSWER-METHOD");

    private static final SubLSymbol ANSWER_JUSTIFY_METHOD = makeSymbol("ANSWER-JUSTIFY-METHOD");

    static private final SubLList $list50 = list(makeString("@return passage; the info slot of this answer"), list(RET, makeSymbol("INFO")));

    static private final SubLSymbol $sym51$OUTER_CATCH_FOR_ANSWER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ANSWER-METHOD");

    private static final SubLSymbol ANSWER_GET_INFO_METHOD = makeSymbol("ANSWER-GET-INFO-METHOD");

    private static final SubLSymbol GET_PARSE_TREE = makeSymbol("GET-PARSE-TREE");

    static private final SubLList $list54 = list(makeString("@return passage; the parse-tree of this answer, if there is one"), list(RET, list(makeSymbol("GETF"), makeSymbol("INFO"), makeKeyword("PARSE-TREE"))));

    static private final SubLSymbol $sym55$OUTER_CATCH_FOR_ANSWER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ANSWER-METHOD");

    private static final SubLSymbol ANSWER_GET_PARSE_TREE_METHOD = makeSymbol("ANSWER-GET-PARSE-TREE-METHOD");

    private static final SubLSymbol NATURAL_LANGUAGE_FACTOID = makeSymbol("NATURAL-LANGUAGE-FACTOID");

    static private final SubLList $list59 = list(makeString("@return stringp; a simple string stating the answer, whenever possible, in the form\n  of a truth-bearing sentence. For example, the sentence \'Kofi Annan is\n  the UN Secretary General\' in response to the question \'who is Kofi Annan?\'\n  @owner bertolo."), list(makeSymbol("CLET"), list(makeSymbol("FOCUS"), makeSymbol("COPULA"), makeSymbol("FACTOID")), list(makeSymbol("PCOND"), list(list(makeSymbol("DEFINITIONAL-QUESTION-P"), makeSymbol("INFO-REQUEST")), list(makeSymbol("CSETQ"), makeSymbol("FOCUS"), list(makeSymbol("CAR"), list(makeSymbol("FIM"), makeSymbol("INFO-REQUEST"), list(QUOTE, makeSymbol("GET-KEYSTRINGS"))))), list(makeSymbol("CSETQ"), makeSymbol("COPULA"), list(makeSymbol("FIND-SUBJECT-AGREEMENT"), makeSymbol("CONTENT"))), list(makeSymbol("PUNLESS"), list(EQUAL, makeSymbol("COPULA"), makeSymbol("*EMPTY-STRING*")), list(makeSymbol("CSETQ"), makeSymbol("COPULA"), list(makeSymbol("CCONCATENATE"), makeString(" "), makeSymbol("COPULA"), makeString(" ")))), list(makeSymbol("CSETQ"), makeSymbol("FACTOID"), list(makeSymbol("CCONCATENATE"), makeSymbol("FOCUS"), makeSymbol("COPULA"), makeSymbol("CONTENT")))), list(T, list(makeSymbol("CSETQ"), makeSymbol("FACTOID"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("JUSTIFICATION"), list(QUOTE, makeSymbol("GET-CONTENT")))))), list(makeSymbol("PIF"), list(makeSymbol("STRINGP"), makeSymbol("FACTOID")), list(RET, makeSymbol("FACTOID")), list(RET, makeSymbol("*EMPTY-STRING*")))));

    static private final SubLSymbol $sym60$OUTER_CATCH_FOR_ANSWER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ANSWER-METHOD");

    static private final SubLString $$$_ = makeString(" ");

    private static final SubLSymbol ANSWER_NATURAL_LANGUAGE_FACTOID_METHOD = makeSymbol("ANSWER-NATURAL-LANGUAGE-FACTOID-METHOD");

    private static final SubLSymbol OLDER = makeSymbol("OLDER");

    static private final SubLList $list65 = list(makeSymbol("OTHER-ANSWER"));

    static private final SubLList $list66 = list(makeString("@param OTHER-ANSWER, answer-p\n   @return BOOLEAN T if this answer is older than OTHER-ANSWER, NIL otherwise.\n   @owner bertolo."), list(makeSymbol("CHECK-TYPE"), makeSymbol("OTHER-ANSWER"), makeSymbol("ANSWER-P")), list(makeSymbol("CLET"), list(list(makeSymbol("THIS-DATE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-DATE")))), list(makeSymbol("OTHER-DATE"), list(makeSymbol("FIM"), makeSymbol("OTHER-ANSWER"), list(QUOTE, makeSymbol("GET-DATE"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("DATE-P"), makeSymbol("THIS-DATE")), list(makeSymbol("DATE-P"), makeSymbol("OTHER-DATE"))), list(RET, list(makeSymbol("DATE<"), makeSymbol("THIS-DATE"), makeSymbol("OTHER-DATE"))))));

    private static final SubLSymbol ANSWER_P = makeSymbol("ANSWER-P");

    private static final SubLSymbol GET_DATE = makeSymbol("GET-DATE");

    private static final SubLSymbol ANSWER_OLDER_METHOD = makeSymbol("ANSWER-OLDER-METHOD");

    static private final SubLList $list70 = list(makeString("@return date-p, the publication date of the source on which this answer depends.\n   @owner bertolo"), list(makeSymbol("PWHEN"), list(makeSymbol("ABSTRACT-PASSAGE-P"), makeSymbol("JUSTIFICATION")), list(RET, list(makeSymbol("FIM"), makeSymbol("JUSTIFICATION"), list(QUOTE, makeSymbol("GET-PUBLICATION-DATE"))))));

    static private final SubLSymbol $sym71$OUTER_CATCH_FOR_ANSWER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ANSWER-METHOD");

    private static final SubLSymbol ANSWER_GET_DATE_METHOD = makeSymbol("ANSWER-GET-DATE-METHOD");

    private static final SubLSymbol TEXT_ANSWER = makeSymbol("TEXT-ANSWER");

    static private final SubLList $list75 = list(new SubLObject[]{ list(makeSymbol("VECTOR"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PARSE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("AUGMENTATION-TERMS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("REQUIRE-SIMILARITY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("SIMILARITY"), list(makeSymbol("ANS1"), makeSymbol("ANS2")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("TYPICAL-INSTANCE"), list(makeSymbol("ANSWERS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("SELECT"), list(makeSymbol("ANSWERS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("SIMILARITY-FUNCTION"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VECTOR"), NIL, makeKeyword("PROTECTED")) });

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEXT_ANSWER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEXT-ANSWER-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEXT_ANSWER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEXT-ANSWER-INSTANCE");

    private static final SubLSymbol INFORMATION_REQUEST_P = makeSymbol("INFORMATION-REQUEST-P");

    private static final SubLSymbol INFORMATION_P = makeSymbol("INFORMATION-P");

    private static final SubLSymbol SIMILARITY_FUNCTION = makeSymbol("SIMILARITY-FUNCTION");

    static private final SubLList $list85 = list(list(RET, list(QUOTE, makeSymbol("TEXT-ANSWER-SIMILARITY"))));

    private static final SubLSymbol TEXT_ANSWER_SIMILARITY = makeSymbol("TEXT-ANSWER-SIMILARITY");

    private static final SubLSymbol TEXT_ANSWER_SIMILARITY_FUNCTION_METHOD = makeSymbol("TEXT-ANSWER-SIMILARITY-FUNCTION-METHOD");

    static private final SubLList $list89 = list(makeString("@return positive-number-p; a value between 0 and 1 that specifies a minimal \n   similarity that is required for two answers to end up in the same cluster\n   during answer clustering. A low number implies few clusters, a high number\n   many clusters"), list(RET, makeDouble(0.3)));

    private static final SubLFloat $float$0_3 = makeDouble(0.3);

    private static final SubLSymbol TEXT_ANSWER_REQUIRE_SIMILARITY_METHOD = makeSymbol("TEXT-ANSWER-REQUIRE-SIMILARITY-METHOD");

    static private final SubLList $list93 = list(makeString("@param ANSWERS listp\n    @return answer-p; the most typical answer among ANSWERS"), list(makeSymbol("CHECK-TYPE"), makeSymbol("ANSWERS"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("TYPICAL"), list(makeSymbol("FIRST"), makeSymbol("ANSWERS"))), list(makeSymbol("CENTROID"), list(makeSymbol("SVECTOR-CENTROID"), list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("GET-TEXT-ANSWER-VECTOR")), makeSymbol("ANSWERS")))), list(makeSymbol("CENTROID-LENGTH"), list(makeSymbol("SVECTOR-LENGTH"), makeSymbol("CENTROID")))), list(makeSymbol("PUNLESS"), list(makeSymbol("ZEROP"), makeSymbol("CENTROID-LENGTH")), list(makeSymbol("CLET"), list(list(makeSymbol("TYPICAL-VECTOR"), list(makeSymbol("GET-TEXT-ANSWER-VECTOR"), makeSymbol("TYPICAL"))), list(makeSymbol("MIN-DISTANCE"), list(makeSymbol("SAFE-SVECTOR-COSINE-ANGLE"), makeSymbol("TYPICAL-VECTOR"), makeSymbol("CENTROID"))), makeSymbol("DISTANCE")), list(makeSymbol("CDOLIST"), list(makeSymbol("ANSWER"), makeSymbol("ANSWERS")), list(makeSymbol("CLET"), list(list(makeSymbol("ANSWER-VECTOR"), list(makeSymbol("GET-TEXT-ANSWER-VECTOR"), makeSymbol("ANSWER")))), list(makeSymbol("CSETQ"), makeSymbol("DISTANCE"), list(makeSymbol("SAFE-SVECTOR-COSINE-ANGLE"), makeSymbol("ANSWER-VECTOR"), makeSymbol("CENTROID"))), list(makeSymbol("PWHEN"), list(makeSymbol(">"), makeSymbol("DISTANCE"), makeSymbol("MIN-DISTANCE")), list(makeSymbol("CSETQ"), makeSymbol("MIN-DISTANCE"), makeSymbol("DISTANCE")), list(makeSymbol("CSETQ"), makeSymbol("TYPICAL"), makeSymbol("ANSWER"))))))), list(RET, makeSymbol("TYPICAL"))));

    private static final SubLSymbol GET_TEXT_ANSWER_VECTOR = makeSymbol("GET-TEXT-ANSWER-VECTOR");

    private static final SubLSymbol TEXT_ANSWER_TYPICAL_INSTANCE_METHOD = makeSymbol("TEXT-ANSWER-TYPICAL-INSTANCE-METHOD");

    static private final SubLList $list97 = list(makeString("@param ANSWERS listp;\n     @return listp; the list of conses of the most salient answers among ANSWERS \n     and their confidences, ranked by their salientness"), list(makeSymbol("CHECK-TYPE"), makeSymbol("ANSWERS"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("REQUIRE-PERCENTAGE"), list(makeSymbol("FCM"), list(makeSymbol("FIM"), list(makeSymbol("FIRST"), makeSymbol("ANSWERS")), list(QUOTE, makeSymbol("GET-INFO-REQUEST"))), list(QUOTE, makeSymbol("REQUIRE-PERCENTAGE")))), list(makeSymbol("REQUIRE-SIMILARITY"), list(makeSymbol("FCM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("REQUIRE-SIMILARITY")))), list(makeSymbol("TYPICALS"), NIL), list(makeSymbol("TOTAL-CONFIDENCE"), ZERO_INTEGER), list(makeSymbol("SELECTED"), NIL), list(makeSymbol("SIMILARITY-FUNCTION"), list(makeSymbol("FWHEN"), makeSymbol("ANSWERS"), list(makeSymbol("FCM"), list(makeSymbol("FIRST"), makeSymbol("ANSWERS")), list(QUOTE, makeSymbol("SIMILARITY-FUNCTION")))))), list(makeSymbol("CDOLIST"), list(makeSymbol("CLUSTER"), list(makeSymbol("CLUSTER"), makeSymbol("ANSWERS"), makeSymbol("SIMILARITY-FUNCTION"), ONE_INTEGER, makeSymbol("REQUIRE-SIMILARITY"))), list(makeSymbol("CLET"), list(list(makeSymbol("ANSWER"), list(makeSymbol("FCM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("TYPICAL-INSTANCE")), list(makeSymbol("FCM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("MAX-INSTANCES")), list(makeSymbol("CLUSTER-ELEMENTS"), makeSymbol("CLUSTER")))))), list(makeSymbol("SET-ANSWER-RELEVANCE"), makeSymbol("ANSWER"), list(makeSymbol("CLUSTER-CARDINALITY"), makeSymbol("CLUSTER"))), list(makeSymbol("CPUSH"), makeSymbol("ANSWER"), makeSymbol("TYPICALS")), list(makeSymbol("CINC"), makeSymbol("TOTAL-CONFIDENCE"), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(QUOTE, makeSymbol("GET-CONFIDENCE")))))), list(makeSymbol("CLET"), list(list(makeSymbol("STOP-AFTER-CONFIDENCE"), list(makeSymbol("*"), list(makeSymbol("/"), makeSymbol("TOTAL-CONFIDENCE"), makeInteger(100)), makeSymbol("REQUIRE-PERCENTAGE"))), list(makeSymbol("SOFAR-CONFIDENCE"), ZERO_INTEGER), list(makeSymbol("STOP?"), list(makeSymbol(">="), makeSymbol("SOFAR-CONFIDENCE"), makeSymbol("STOP-AFTER-CONFIDENCE")))), list(makeSymbol("CSOME"), list(makeSymbol("ANSWER"), list(makeSymbol("SORT"), makeSymbol("TYPICALS"), list(QUOTE, makeSymbol("TEXT-ANSWER-BETTER"))), makeSymbol("STOP?")), list(makeSymbol("CPUSH"), makeSymbol("ANSWER"), makeSymbol("SELECTED")), list(makeSymbol("CINC"), makeSymbol("SOFAR-CONFIDENCE"), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(QUOTE, makeSymbol("GET-CONFIDENCE")))), list(makeSymbol("CSETQ"), makeSymbol("STOP?"), list(makeSymbol(">="), makeSymbol("SOFAR-CONFIDENCE"), makeSymbol("STOP-AFTER-CONFIDENCE"))))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("SELECTED")))));

    private static final SubLSymbol TEXT_ANSWER_BETTER = makeSymbol("TEXT-ANSWER-BETTER");

    private static final SubLSymbol TEXT_ANSWER_SELECT_METHOD = makeSymbol("TEXT-ANSWER-SELECT-METHOD");

    private static final SubLSymbol CLUSTER_P = makeSymbol("CLUSTER-P");

    static private final SubLList $list104 = list(makeString("@return svector-p; the word vector of this answer"), list(RET, makeSymbol("VECTOR")));

    static private final SubLSymbol $sym105$OUTER_CATCH_FOR_TEXT_ANSWER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEXT-ANSWER-METHOD");

    private static final SubLSymbol TEXT_ANSWER_GET_VECTOR_METHOD = makeSymbol("TEXT-ANSWER-GET-VECTOR-METHOD");

    private static final SubLSymbol SIMILARITY = makeSymbol("SIMILARITY");

    static private final SubLList $list108 = list(makeSymbol("ANS1"), makeSymbol("ANS2"));

    static private final SubLList $list109 = list(makeString("@param ANS1 answer-p\n   @param ANS2 answer-p\n   @return non-negative-integerp; the similarity between ANS1 and ANS2 with\n   0 indicating no similarity and 1 indicating identity"), list(makeSymbol("CHECK-TYPE"), makeSymbol("ANS1"), makeSymbol("TEXT-ANSWER-P")), list(makeSymbol("CHECK-TYPE"), makeSymbol("ANS2"), makeSymbol("TEXT-ANSWER-P")), list(makeSymbol("PWHEN"), list(makeSymbol("STRING="), list(makeSymbol("FIM"), makeSymbol("ANS1"), list(QUOTE, makeSymbol("GET-CONTENT"))), list(makeSymbol("FIM"), makeSymbol("ANS2"), list(QUOTE, makeSymbol("GET-CONTENT")))), list(RET, ONE_INTEGER)), list(RET, list(makeSymbol("SAFE-SVECTOR-COSINE-ANGLE"), list(makeSymbol("FIM"), makeSymbol("ANS1"), list(QUOTE, makeSymbol("GET-VECTOR"))), list(makeSymbol("FIM"), makeSymbol("ANS2"), list(QUOTE, makeSymbol("GET-VECTOR"))))));

    private static final SubLSymbol TEXT_ANSWER_P = makeSymbol("TEXT-ANSWER-P");

    private static final SubLSymbol TEXT_ANSWER_SIMILARITY_METHOD = makeSymbol("TEXT-ANSWER-SIMILARITY-METHOD");

    private static final SubLSymbol VALUE_ANSWER = makeSymbol("VALUE-ANSWER");

    static private final SubLList $list113 = list(list(makeSymbol("PARSE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("INTERPRETED-VALUES"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("SIMILARITY"), list(makeSymbol("ANS1"), makeSymbol("ANS2")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("TYPICAL-INSTANCE"), list(makeSymbol("ANSWERS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("SIMILARITY-FUNCTION"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INTERPRETED-VALUES"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol INTERPRETED_VALUES = makeSymbol("INTERPRETED-VALUES");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VALUE_ANSWER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VALUE-ANSWER-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VALUE_ANSWER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VALUE-ANSWER-INSTANCE");

    static private final SubLString $str118$_ = makeString(")");

    static private final SubLString $str119$__RRB_ = makeString(" -RRB-");

    static private final SubLString $str120$_ = makeString("(");

    static private final SubLString $str121$_LRB__ = makeString("-LRB- ");

    static private final SubLList $list123 = list(makeString("@return symbolp; the similarity function used to compare value-answers"), list(RET, list(QUOTE, makeSymbol("VALUE-ANSWER-SIMILARITY"))));

    private static final SubLSymbol VALUE_ANSWER_SIMILARITY = makeSymbol("VALUE-ANSWER-SIMILARITY");

    private static final SubLSymbol VALUE_ANSWER_SIMILARITY_FUNCTION_METHOD = makeSymbol("VALUE-ANSWER-SIMILARITY-FUNCTION-METHOD");

    private static final SubLSymbol GET_INTERPRETED_VALUES = makeSymbol("GET-INTERPRETED-VALUES");

    static private final SubLList $list127 = list(list(RET, makeSymbol("INTERPRETED-VALUES")));

    static private final SubLSymbol $sym128$OUTER_CATCH_FOR_VALUE_ANSWER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VALUE-ANSWER-METHOD");

    private static final SubLSymbol VALUE_ANSWER_GET_INTERPRETED_VALUES_METHOD = makeSymbol("VALUE-ANSWER-GET-INTERPRETED-VALUES-METHOD");

    static private final SubLList $list130 = list(makeString("@param ANS1 answer-p\n   @param ANS2 answer-p\n   @return non-negative-integerp; the similarity between ANS1 and ANS2 with\n   0 indicating no similarity and 1 indicating identity"), list(makeSymbol("CHECK-TYPE"), makeSymbol("ANS1"), makeSymbol("VALUE-ANSWER-P")), list(makeSymbol("CHECK-TYPE"), makeSymbol("ANS2"), makeSymbol("VALUE-ANSWER-P")), list(makeSymbol("CLET"), list(list(makeSymbol("MAX"), ZERO_INTEGER)), list(makeSymbol("CDOLIST"), list(makeSymbol("IV1"), list(makeSymbol("FIM"), makeSymbol("ANS1"), list(QUOTE, makeSymbol("GET-INTERPRETED-VALUES")))), list(makeSymbol("CDOLIST"), list(makeSymbol("IV2"), list(makeSymbol("FIM"), makeSymbol("ANS2"), list(QUOTE, makeSymbol("GET-INTERPRETED-VALUES")))), list(makeSymbol("CLET"), list(list(makeSymbol("VALUE"), list(makeSymbol("AMOUNT-SIMILARITY"), makeSymbol("IV1"), makeSymbol("IV2")))), list(makeSymbol("PWHEN"), list(makeSymbol(">"), makeSymbol("VALUE"), makeSymbol("MAX")), list(makeSymbol("CSETQ"), makeSymbol("MAX"), makeSymbol("VALUE")))))), list(RET, makeSymbol("MAX"))));

    private static final SubLSymbol VALUE_ANSWER_P = makeSymbol("VALUE-ANSWER-P");

    private static final SubLSymbol VALUE_ANSWER_SIMILARITY_METHOD = makeSymbol("VALUE-ANSWER-SIMILARITY-METHOD");

    static private final SubLList $list133 = list(list(RET, list(makeSymbol("RANDOM-ELEMENT"), makeSymbol("ANSWERS"))));

    private static final SubLSymbol VALUE_ANSWER_TYPICAL_INSTANCE_METHOD = makeSymbol("VALUE-ANSWER-TYPICAL-INSTANCE-METHOD");

    private static final SubLSymbol SENTENCE_ANSWER = makeSymbol("SENTENCE-ANSWER");

    static private final SubLList $list137 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("REQUIRE-SIMILARITY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("TYPICAL-INSTANCE"), list(makeSymbol("ANSWERS")), makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SENTENCE_ANSWER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SENTENCE-ANSWER-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SENTENCE_ANSWER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SENTENCE-ANSWER-INSTANCE");

    private static final SubLSymbol SENTENCE_ANSWER_REQUIRE_SIMILARITY_METHOD = makeSymbol("SENTENCE-ANSWER-REQUIRE-SIMILARITY-METHOD");

    static private final SubLList $list141 = list(makeString("@param ANSWERS listp\n   @return answer-p; the most typical answer among ANSWERS"), list(RET, list(makeSymbol("FIRST"), list(makeSymbol("FCM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("MAX-INSTANCES")), makeSymbol("ANSWERS")))));

    private static final SubLSymbol SENTENCE_ANSWER_TYPICAL_INSTANCE_METHOD = makeSymbol("SENTENCE-ANSWER-TYPICAL-INSTANCE-METHOD");

    static private final SubLList $list143 = list(makeString("Prints this answer to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<SENTENCE-ANSWER for "), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), makeSymbol("INFO-REQUEST"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(": "), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), makeSymbol("CONTENT"), makeSymbol("STREAM")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" (~,2F/~,2F)"), makeSymbol("CONFIDENCE"), makeSymbol("RELEVANCE")), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym144$OUTER_CATCH_FOR_SENTENCE_ANSWER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SENTENCE-ANSWER-METHOD");

    static private final SubLString $str145$__SENTENCE_ANSWER_for_ = makeString("#<SENTENCE-ANSWER for ");

    private static final SubLSymbol SENTENCE_ANSWER_PRINT_METHOD = makeSymbol("SENTENCE-ANSWER-PRINT-METHOD");

    private static final SubLSymbol STANFORD_PARSER = makeSymbol("STANFORD-PARSER");

    static private final SubLString $$$are = makeString("are");

    static private final SubLString $$$is = makeString("is");

    // Definitions
    public static final SubLObject get_answer_info_alt(SubLObject v_answer) {
        return classes.subloop_get_access_protected_instance_slot(v_answer, SIX_INTEGER, INFO);
    }

    // Definitions
    public static SubLObject get_answer_info(final SubLObject v_answer) {
        return classes.subloop_get_access_protected_instance_slot(v_answer, SIX_INTEGER, INFO);
    }

    public static final SubLObject set_answer_info_alt(SubLObject v_answer, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_answer, value, SIX_INTEGER, INFO);
    }

    public static SubLObject set_answer_info(final SubLObject v_answer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_answer, value, SIX_INTEGER, INFO);
    }

    public static final SubLObject get_answer_justification_alt(SubLObject v_answer) {
        return classes.subloop_get_access_protected_instance_slot(v_answer, FIVE_INTEGER, JUSTIFICATION);
    }

    public static SubLObject get_answer_justification(final SubLObject v_answer) {
        return classes.subloop_get_access_protected_instance_slot(v_answer, FIVE_INTEGER, JUSTIFICATION);
    }

    public static final SubLObject set_answer_justification_alt(SubLObject v_answer, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_answer, value, FIVE_INTEGER, JUSTIFICATION);
    }

    public static SubLObject set_answer_justification(final SubLObject v_answer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_answer, value, FIVE_INTEGER, JUSTIFICATION);
    }

    public static final SubLObject get_answer_relevance_alt(SubLObject v_answer) {
        return classes.subloop_get_access_protected_instance_slot(v_answer, FOUR_INTEGER, RELEVANCE);
    }

    public static SubLObject get_answer_relevance(final SubLObject v_answer) {
        return classes.subloop_get_access_protected_instance_slot(v_answer, FOUR_INTEGER, RELEVANCE);
    }

    public static final SubLObject set_answer_relevance_alt(SubLObject v_answer, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_answer, value, FOUR_INTEGER, RELEVANCE);
    }

    public static SubLObject set_answer_relevance(final SubLObject v_answer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_answer, value, FOUR_INTEGER, RELEVANCE);
    }

    public static final SubLObject get_answer_confidence_alt(SubLObject v_answer) {
        return classes.subloop_get_access_protected_instance_slot(v_answer, THREE_INTEGER, CONFIDENCE);
    }

    public static SubLObject get_answer_confidence(final SubLObject v_answer) {
        return classes.subloop_get_access_protected_instance_slot(v_answer, THREE_INTEGER, CONFIDENCE);
    }

    public static final SubLObject set_answer_confidence_alt(SubLObject v_answer, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_answer, value, THREE_INTEGER, CONFIDENCE);
    }

    public static SubLObject set_answer_confidence(final SubLObject v_answer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_answer, value, THREE_INTEGER, CONFIDENCE);
    }

    public static final SubLObject get_answer_content_alt(SubLObject v_answer) {
        return classes.subloop_get_access_protected_instance_slot(v_answer, TWO_INTEGER, CONTENT);
    }

    public static SubLObject get_answer_content(final SubLObject v_answer) {
        return classes.subloop_get_access_protected_instance_slot(v_answer, TWO_INTEGER, CONTENT);
    }

    public static final SubLObject set_answer_content_alt(SubLObject v_answer, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_answer, value, TWO_INTEGER, CONTENT);
    }

    public static SubLObject set_answer_content(final SubLObject v_answer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_answer, value, TWO_INTEGER, CONTENT);
    }

    public static final SubLObject get_answer_info_request_alt(SubLObject v_answer) {
        return classes.subloop_get_access_protected_instance_slot(v_answer, ONE_INTEGER, INFO_REQUEST);
    }

    public static SubLObject get_answer_info_request(final SubLObject v_answer) {
        return classes.subloop_get_access_protected_instance_slot(v_answer, ONE_INTEGER, INFO_REQUEST);
    }

    public static final SubLObject set_answer_info_request_alt(SubLObject v_answer, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_answer, value, ONE_INTEGER, INFO_REQUEST);
    }

    public static SubLObject set_answer_info_request(final SubLObject v_answer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_answer, value, ONE_INTEGER, INFO_REQUEST);
    }

    public static final SubLObject subloop_reserved_initialize_answer_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_answer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_answer_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, INFO_REQUEST, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, CONTENT, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, CONFIDENCE, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, RELEVANCE, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, JUSTIFICATION, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, INFO, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_answer_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, INFO_REQUEST, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, CONTENT, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, CONFIDENCE, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, RELEVANCE, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, JUSTIFICATION, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, INFO, NIL);
        return NIL;
    }

    public static final SubLObject answer_p_alt(SubLObject v_answer) {
        return classes.subloop_instanceof_class(v_answer, ANSWER);
    }

    public static SubLObject answer_p(final SubLObject v_answer) {
        return classes.subloop_instanceof_class(v_answer, ANSWER);
    }

    /**
     *
     *
     * @param ANSWERS
    listp
     * 		
     * @return answer-p; the highest scoring answer among ANSWERS
     */
    @LispMethod(comment = "@param ANSWERS\nlistp\r\n\t\t\r\n@return answer-p; the highest scoring answer among ANSWERS")
    public static final SubLObject answer_max_instances_method_alt(SubLObject self, SubLObject answers) {
        SubLTrampolineFile.checkType(answers, LISTP);
        {
            SubLObject max_score = ZERO_INTEGER;
            SubLObject max_answers = NIL;
            {
                SubLObject cdolist_list_var = answers;
                SubLObject v_answer = NIL;
                for (v_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_answer = cdolist_list_var.first()) {
                    if (methods.funcall_instance_method_with_0_args(v_answer, GET_CONFIDENCE).numG(max_score)) {
                        max_score = methods.funcall_instance_method_with_0_args(v_answer, GET_CONFIDENCE);
                    }
                }
            }
            {
                SubLObject cdolist_list_var = answers;
                SubLObject v_answer = NIL;
                for (v_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_answer = cdolist_list_var.first()) {
                    if (methods.funcall_instance_method_with_0_args(v_answer, GET_CONFIDENCE).numE(max_score)) {
                        max_answers = cons(v_answer, max_answers);
                    }
                }
            }
            return max_answers;
        }
    }

    /**
     *
     *
     * @param ANSWERS
    listp
     * 		
     * @return answer-p; the highest scoring answer among ANSWERS
     */
    @LispMethod(comment = "@param ANSWERS\nlistp\r\n\t\t\r\n@return answer-p; the highest scoring answer among ANSWERS")
    public static SubLObject answer_max_instances_method(final SubLObject self, final SubLObject answers) {
        assert NIL != listp(answers) : "! listp(answers) " + ("Types.listp(answers) " + "CommonSymbols.NIL != Types.listp(answers) ") + answers;
        SubLObject max_score = ZERO_INTEGER;
        SubLObject max_answers = NIL;
        SubLObject cdolist_list_var = answers;
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (methods.funcall_instance_method_with_0_args(v_answer, GET_CONFIDENCE).numG(max_score)) {
                max_score = methods.funcall_instance_method_with_0_args(v_answer, GET_CONFIDENCE);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        } 
        cdolist_list_var = answers;
        v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (methods.funcall_instance_method_with_0_args(v_answer, GET_CONFIDENCE).numE(max_score)) {
                max_answers = cons(v_answer, max_answers);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        } 
        return max_answers;
    }

    /**
     * Prints this answer to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "Prints this answer to STREAM, ignoring DEPTH")
    public static final SubLObject answer_print_method_alt(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_answer_method = NIL;
            SubLObject relevance = com.cyc.cycjava.cycl.quirk.answer.get_answer_relevance(self);
            SubLObject confidence = com.cyc.cycjava.cycl.quirk.answer.get_answer_confidence(self);
            SubLObject content = com.cyc.cycjava.cycl.quirk.answer.get_answer_content(self);
            SubLObject info_request = com.cyc.cycjava.cycl.quirk.answer.get_answer_info_request(self);
            try {
                try {
                    write_string($str_alt26$__ANSWER_for_, stream, UNPROVIDED, UNPROVIDED);
                    prin1(info_request, stream);
                    write_string($str_alt27$__, stream, UNPROVIDED, UNPROVIDED);
                    prin1(content, stream);
                    format(stream, $str_alt28$____2F___2F_, confidence, relevance);
                    sublisp_throw($sym25$OUTER_CATCH_FOR_ANSWER_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.answer.set_answer_relevance(self, relevance);
                            com.cyc.cycjava.cycl.quirk.answer.set_answer_confidence(self, confidence);
                            com.cyc.cycjava.cycl.quirk.answer.set_answer_content(self, content);
                            com.cyc.cycjava.cycl.quirk.answer.set_answer_info_request(self, info_request);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, $sym25$OUTER_CATCH_FOR_ANSWER_METHOD);
            }
            return catch_var_for_answer_method;
        }
    }

    /**
     * Prints this answer to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "Prints this answer to STREAM, ignoring DEPTH")
    public static SubLObject answer_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_answer_method = NIL;
        final SubLObject relevance = get_answer_relevance(self);
        final SubLObject confidence = get_answer_confidence(self);
        final SubLObject content = get_answer_content(self);
        final SubLObject info_request = get_answer_info_request(self);
        try {
            thread.throwStack.push($sym25$OUTER_CATCH_FOR_ANSWER_METHOD);
            try {
                write_string($str26$__ANSWER_for_, stream, UNPROVIDED, UNPROVIDED);
                prin1(info_request, stream);
                write_string($str27$__, stream, UNPROVIDED, UNPROVIDED);
                prin1(content, stream);
                format(stream, $str28$____2F___2F_, confidence, relevance);
                sublisp_throw($sym25$OUTER_CATCH_FOR_ANSWER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_answer_relevance(self, relevance);
                    set_answer_confidence(self, confidence);
                    set_answer_content(self, content);
                    set_answer_info_request(self, info_request);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, $sym25$OUTER_CATCH_FOR_ANSWER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_answer_method;
    }

    /**
     *
     *
     * @return object; the info-request of this answer
     */
    @LispMethod(comment = "@return object; the info-request of this answer")
    public static final SubLObject answer_get_info_request_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_answer_method = NIL;
            SubLObject info_request = com.cyc.cycjava.cycl.quirk.answer.get_answer_info_request(self);
            try {
                try {
                    sublisp_throw($sym32$OUTER_CATCH_FOR_ANSWER_METHOD, info_request);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.answer.set_answer_info_request(self, info_request);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, $sym32$OUTER_CATCH_FOR_ANSWER_METHOD);
            }
            return catch_var_for_answer_method;
        }
    }

    /**
     *
     *
     * @return object; the info-request of this answer
     */
    @LispMethod(comment = "@return object; the info-request of this answer")
    public static SubLObject answer_get_info_request_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_answer_method = NIL;
        final SubLObject info_request = get_answer_info_request(self);
        try {
            thread.throwStack.push($sym32$OUTER_CATCH_FOR_ANSWER_METHOD);
            try {
                sublisp_throw($sym32$OUTER_CATCH_FOR_ANSWER_METHOD, info_request);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_answer_info_request(self, info_request);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, $sym32$OUTER_CATCH_FOR_ANSWER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_answer_method;
    }

    /**
     *
     *
     * @return object; the string of this answer
     */
    @LispMethod(comment = "@return object; the string of this answer")
    public static final SubLObject answer_get_content_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_answer_method = NIL;
            SubLObject content = com.cyc.cycjava.cycl.quirk.answer.get_answer_content(self);
            try {
                try {
                    sublisp_throw($sym36$OUTER_CATCH_FOR_ANSWER_METHOD, content);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.answer.set_answer_content(self, content);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, $sym36$OUTER_CATCH_FOR_ANSWER_METHOD);
            }
            return catch_var_for_answer_method;
        }
    }

    /**
     *
     *
     * @return object; the string of this answer
     */
    @LispMethod(comment = "@return object; the string of this answer")
    public static SubLObject answer_get_content_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_answer_method = NIL;
        final SubLObject content = get_answer_content(self);
        try {
            thread.throwStack.push($sym36$OUTER_CATCH_FOR_ANSWER_METHOD);
            try {
                sublisp_throw($sym36$OUTER_CATCH_FOR_ANSWER_METHOD, content);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_answer_content(self, content);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, $sym36$OUTER_CATCH_FOR_ANSWER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_answer_method;
    }

    /**
     *
     *
     * @return non-negative-integer-p; the confidence of this answer
     */
    @LispMethod(comment = "@return non-negative-integer-p; the confidence of this answer")
    public static final SubLObject answer_get_confidence_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_answer_method = NIL;
            SubLObject confidence = com.cyc.cycjava.cycl.quirk.answer.get_answer_confidence(self);
            try {
                try {
                    sublisp_throw($sym39$OUTER_CATCH_FOR_ANSWER_METHOD, confidence);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.answer.set_answer_confidence(self, confidence);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, $sym39$OUTER_CATCH_FOR_ANSWER_METHOD);
            }
            return catch_var_for_answer_method;
        }
    }

    /**
     *
     *
     * @return non-negative-integer-p; the confidence of this answer
     */
    @LispMethod(comment = "@return non-negative-integer-p; the confidence of this answer")
    public static SubLObject answer_get_confidence_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_answer_method = NIL;
        final SubLObject confidence = get_answer_confidence(self);
        try {
            thread.throwStack.push($sym39$OUTER_CATCH_FOR_ANSWER_METHOD);
            try {
                sublisp_throw($sym39$OUTER_CATCH_FOR_ANSWER_METHOD, confidence);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_answer_confidence(self, confidence);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, $sym39$OUTER_CATCH_FOR_ANSWER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_answer_method;
    }

    /**
     *
     *
     * @return non-negative-integer-p; the relevance of this answer
     */
    @LispMethod(comment = "@return non-negative-integer-p; the relevance of this answer")
    public static final SubLObject answer_get_relevance_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_answer_method = NIL;
            SubLObject relevance = com.cyc.cycjava.cycl.quirk.answer.get_answer_relevance(self);
            try {
                try {
                    sublisp_throw($sym43$OUTER_CATCH_FOR_ANSWER_METHOD, relevance);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.answer.set_answer_relevance(self, relevance);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, $sym43$OUTER_CATCH_FOR_ANSWER_METHOD);
            }
            return catch_var_for_answer_method;
        }
    }

    /**
     *
     *
     * @return non-negative-integer-p; the relevance of this answer
     */
    @LispMethod(comment = "@return non-negative-integer-p; the relevance of this answer")
    public static SubLObject answer_get_relevance_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_answer_method = NIL;
        final SubLObject relevance = get_answer_relevance(self);
        try {
            thread.throwStack.push($sym43$OUTER_CATCH_FOR_ANSWER_METHOD);
            try {
                sublisp_throw($sym43$OUTER_CATCH_FOR_ANSWER_METHOD, relevance);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_answer_relevance(self, relevance);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, $sym43$OUTER_CATCH_FOR_ANSWER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_answer_method;
    }

    /**
     *
     *
     * @return passage; the justification of this answer
     */
    @LispMethod(comment = "@return passage; the justification of this answer")
    public static final SubLObject answer_justify_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_answer_method = NIL;
            SubLObject justification = com.cyc.cycjava.cycl.quirk.answer.get_answer_justification(self);
            try {
                try {
                    sublisp_throw($sym47$OUTER_CATCH_FOR_ANSWER_METHOD, justification);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.answer.set_answer_justification(self, justification);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, $sym47$OUTER_CATCH_FOR_ANSWER_METHOD);
            }
            return catch_var_for_answer_method;
        }
    }

    /**
     *
     *
     * @return passage; the justification of this answer
     */
    @LispMethod(comment = "@return passage; the justification of this answer")
    public static SubLObject answer_justify_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_answer_method = NIL;
        final SubLObject justification = get_answer_justification(self);
        try {
            thread.throwStack.push($sym47$OUTER_CATCH_FOR_ANSWER_METHOD);
            try {
                sublisp_throw($sym47$OUTER_CATCH_FOR_ANSWER_METHOD, justification);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_answer_justification(self, justification);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, $sym47$OUTER_CATCH_FOR_ANSWER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_answer_method;
    }

    /**
     *
     *
     * @return passage; the info slot of this answer
     */
    @LispMethod(comment = "@return passage; the info slot of this answer")
    public static final SubLObject answer_get_info_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_answer_method = NIL;
            SubLObject info = com.cyc.cycjava.cycl.quirk.answer.get_answer_info(self);
            try {
                try {
                    sublisp_throw($sym51$OUTER_CATCH_FOR_ANSWER_METHOD, info);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.answer.set_answer_info(self, info);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, $sym51$OUTER_CATCH_FOR_ANSWER_METHOD);
            }
            return catch_var_for_answer_method;
        }
    }

    /**
     *
     *
     * @return passage; the info slot of this answer
     */
    @LispMethod(comment = "@return passage; the info slot of this answer")
    public static SubLObject answer_get_info_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_answer_method = NIL;
        final SubLObject info = get_answer_info(self);
        try {
            thread.throwStack.push($sym51$OUTER_CATCH_FOR_ANSWER_METHOD);
            try {
                sublisp_throw($sym51$OUTER_CATCH_FOR_ANSWER_METHOD, info);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_answer_info(self, info);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, $sym51$OUTER_CATCH_FOR_ANSWER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_answer_method;
    }

    /**
     *
     *
     * @return passage; the parse-tree of this answer, if there is one
     */
    @LispMethod(comment = "@return passage; the parse-tree of this answer, if there is one")
    public static final SubLObject answer_get_parse_tree_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_answer_method = NIL;
            SubLObject info = com.cyc.cycjava.cycl.quirk.answer.get_answer_info(self);
            try {
                try {
                    sublisp_throw($sym55$OUTER_CATCH_FOR_ANSWER_METHOD, getf(info, $PARSE_TREE, UNPROVIDED));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.answer.set_answer_info(self, info);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, $sym55$OUTER_CATCH_FOR_ANSWER_METHOD);
            }
            return catch_var_for_answer_method;
        }
    }

    /**
     *
     *
     * @return passage; the parse-tree of this answer, if there is one
     */
    @LispMethod(comment = "@return passage; the parse-tree of this answer, if there is one")
    public static SubLObject answer_get_parse_tree_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_answer_method = NIL;
        final SubLObject info = get_answer_info(self);
        try {
            thread.throwStack.push($sym55$OUTER_CATCH_FOR_ANSWER_METHOD);
            try {
                sublisp_throw($sym55$OUTER_CATCH_FOR_ANSWER_METHOD, getf(info, $PARSE_TREE, UNPROVIDED));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_answer_info(self, info);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, $sym55$OUTER_CATCH_FOR_ANSWER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_answer_method;
    }

    /**
     *
     *
     * @return stringp; a simple string stating the answer, whenever possible, in the form
    of a truth-bearing sentence. For example, the sentence 'Kofi Annan is
    the UN Secretary General' in response to the question 'who is Kofi Annan?'
     * @unknown bertolo.
     */
    @LispMethod(comment = "@return stringp; a simple string stating the answer, whenever possible, in the form\r\nof a truth-bearing sentence. For example, the sentence \'Kofi Annan is\r\nthe UN Secretary General\' in response to the question \'who is Kofi Annan?\'\r\n@unknown bertolo.")
    public static final SubLObject answer_natural_language_factoid_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_answer_method = NIL;
            SubLObject justification = com.cyc.cycjava.cycl.quirk.answer.get_answer_justification(self);
            SubLObject content = com.cyc.cycjava.cycl.quirk.answer.get_answer_content(self);
            SubLObject info_request = com.cyc.cycjava.cycl.quirk.answer.get_answer_info_request(self);
            try {
                try {
                    {
                        SubLObject focus = NIL;
                        SubLObject copula = NIL;
                        SubLObject factoid = NIL;
                        if (NIL != definitional_question.definitional_question_p(info_request)) {
                            focus = methods.funcall_instance_method_with_0_args(info_request, GET_KEYSTRINGS).first();
                            copula = com.cyc.cycjava.cycl.quirk.answer.find_subject_agreement(content);
                            if (!copula.equal(string_utilities.$empty_string$.getGlobalValue())) {
                                copula = cconcatenate($str_alt62$_, new SubLObject[]{ copula, $str_alt62$_ });
                            }
                            factoid = cconcatenate(focus, new SubLObject[]{ copula, content });
                        } else {
                            factoid = methods.funcall_instance_method_with_0_args(justification, GET_CONTENT);
                        }
                        if (factoid.isString()) {
                            sublisp_throw($sym60$OUTER_CATCH_FOR_ANSWER_METHOD, factoid);
                        } else {
                            sublisp_throw($sym60$OUTER_CATCH_FOR_ANSWER_METHOD, string_utilities.$empty_string$.getGlobalValue());
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.answer.set_answer_justification(self, justification);
                            com.cyc.cycjava.cycl.quirk.answer.set_answer_content(self, content);
                            com.cyc.cycjava.cycl.quirk.answer.set_answer_info_request(self, info_request);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, $sym60$OUTER_CATCH_FOR_ANSWER_METHOD);
            }
            return catch_var_for_answer_method;
        }
    }

    /**
     *
     *
     * @return stringp; a simple string stating the answer, whenever possible, in the form
    of a truth-bearing sentence. For example, the sentence 'Kofi Annan is
    the UN Secretary General' in response to the question 'who is Kofi Annan?'
     * @unknown bertolo.
     */
    @LispMethod(comment = "@return stringp; a simple string stating the answer, whenever possible, in the form\r\nof a truth-bearing sentence. For example, the sentence \'Kofi Annan is\r\nthe UN Secretary General\' in response to the question \'who is Kofi Annan?\'\r\n@unknown bertolo.")
    public static SubLObject answer_natural_language_factoid_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_answer_method = NIL;
        final SubLObject justification = get_answer_justification(self);
        final SubLObject content = get_answer_content(self);
        final SubLObject info_request = get_answer_info_request(self);
        try {
            thread.throwStack.push($sym60$OUTER_CATCH_FOR_ANSWER_METHOD);
            try {
                SubLObject focus = NIL;
                SubLObject copula = NIL;
                SubLObject factoid = NIL;
                if (NIL != definitional_question.definitional_question_p(info_request)) {
                    focus = methods.funcall_instance_method_with_0_args(info_request, GET_KEYSTRINGS).first();
                    copula = find_subject_agreement(content);
                    if (!copula.equal(string_utilities.$empty_string$.getGlobalValue())) {
                        copula = cconcatenate($$$_, new SubLObject[]{ copula, $$$_ });
                    }
                    factoid = cconcatenate(focus, new SubLObject[]{ copula, content });
                } else {
                    factoid = methods.funcall_instance_method_with_0_args(justification, GET_CONTENT);
                }
                if (factoid.isString()) {
                    sublisp_throw($sym60$OUTER_CATCH_FOR_ANSWER_METHOD, factoid);
                } else {
                    sublisp_throw($sym60$OUTER_CATCH_FOR_ANSWER_METHOD, string_utilities.$empty_string$.getGlobalValue());
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_answer_justification(self, justification);
                    set_answer_content(self, content);
                    set_answer_info_request(self, info_request);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, $sym60$OUTER_CATCH_FOR_ANSWER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_answer_method;
    }

    /**
     *
     *
     * @param OTHER-ANSWER,
    answer-p
     * 		
     * @return BOOLEAN T if this answer is older than OTHER-ANSWER, NIL otherwise.
     * @unknown bertolo.
     */
    @LispMethod(comment = "@param OTHER-ANSWER,\nanswer-p\r\n\t\t\r\n@return BOOLEAN T if this answer is older than OTHER-ANSWER, NIL otherwise.\r\n@unknown bertolo.")
    public static final SubLObject answer_older_method_alt(SubLObject self, SubLObject other_answer) {
        SubLTrampolineFile.checkType(other_answer, ANSWER_P);
        {
            SubLObject this_date = methods.funcall_instance_method_with_0_args(self, GET_DATE);
            SubLObject other_date = methods.funcall_instance_method_with_0_args(other_answer, GET_DATE);
            if ((NIL != date_utilities.date_p(this_date)) && (NIL != date_utilities.date_p(other_date))) {
                return date_utilities.dateL(this_date, other_date);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param OTHER-ANSWER,
    answer-p
     * 		
     * @return BOOLEAN T if this answer is older than OTHER-ANSWER, NIL otherwise.
     * @unknown bertolo.
     */
    @LispMethod(comment = "@param OTHER-ANSWER,\nanswer-p\r\n\t\t\r\n@return BOOLEAN T if this answer is older than OTHER-ANSWER, NIL otherwise.\r\n@unknown bertolo.")
    public static SubLObject answer_older_method(final SubLObject self, final SubLObject other_answer) {
        assert NIL != answer_p(other_answer) : "! answer.answer_p(other_answer) " + ("answer.answer_p(other_answer) " + "CommonSymbols.NIL != answer.answer_p(other_answer) ") + other_answer;
        final SubLObject this_date = methods.funcall_instance_method_with_0_args(self, GET_DATE);
        final SubLObject other_date = methods.funcall_instance_method_with_0_args(other_answer, GET_DATE);
        if ((NIL != date_utilities.date_p(this_date)) && (NIL != date_utilities.date_p(other_date))) {
            return date_utilities.dateL(this_date, other_date);
        }
        return NIL;
    }

    /**
     *
     *
     * @return date-p, the publication date of the source on which this answer depends.
     * @unknown bertolo
     */
    @LispMethod(comment = "@return date-p, the publication date of the source on which this answer depends.\r\n@unknown bertolo")
    public static final SubLObject answer_get_date_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_answer_method = NIL;
            SubLObject justification = com.cyc.cycjava.cycl.quirk.answer.get_answer_justification(self);
            try {
                try {
                    if (NIL != search_engine.abstract_passage_p(justification)) {
                        sublisp_throw($sym71$OUTER_CATCH_FOR_ANSWER_METHOD, methods.funcall_instance_method_with_0_args(justification, GET_PUBLICATION_DATE));
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.answer.set_answer_justification(self, justification);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, $sym71$OUTER_CATCH_FOR_ANSWER_METHOD);
            }
            return catch_var_for_answer_method;
        }
    }

    /**
     *
     *
     * @return date-p, the publication date of the source on which this answer depends.
     * @unknown bertolo
     */
    @LispMethod(comment = "@return date-p, the publication date of the source on which this answer depends.\r\n@unknown bertolo")
    public static SubLObject answer_get_date_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_answer_method = NIL;
        final SubLObject justification = get_answer_justification(self);
        try {
            thread.throwStack.push($sym71$OUTER_CATCH_FOR_ANSWER_METHOD);
            try {
                if (NIL != search_engine.abstract_passage_p(justification)) {
                    sublisp_throw($sym71$OUTER_CATCH_FOR_ANSWER_METHOD, methods.funcall_instance_method_with_0_args(justification, GET_PUBLICATION_DATE));
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_answer_justification(self, justification);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_answer_method = Errors.handleThrowable(ccatch_env_var, $sym71$OUTER_CATCH_FOR_ANSWER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_answer_method;
    }

    public static final SubLObject get_text_answer_augmentation_terms_alt(SubLObject text_answer) {
        return classes.subloop_get_access_protected_instance_slot(text_answer, NINE_INTEGER, AUGMENTATION_TERMS);
    }

    public static SubLObject get_text_answer_augmentation_terms(final SubLObject text_answer) {
        return classes.subloop_get_access_protected_instance_slot(text_answer, NINE_INTEGER, AUGMENTATION_TERMS);
    }

    public static final SubLObject set_text_answer_augmentation_terms_alt(SubLObject text_answer, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(text_answer, value, NINE_INTEGER, AUGMENTATION_TERMS);
    }

    public static SubLObject set_text_answer_augmentation_terms(final SubLObject text_answer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(text_answer, value, NINE_INTEGER, AUGMENTATION_TERMS);
    }

    public static final SubLObject get_text_answer_parse_alt(SubLObject text_answer) {
        return classes.subloop_get_access_protected_instance_slot(text_answer, EIGHT_INTEGER, PARSE);
    }

    public static SubLObject get_text_answer_parse(final SubLObject text_answer) {
        return classes.subloop_get_access_protected_instance_slot(text_answer, EIGHT_INTEGER, PARSE);
    }

    public static final SubLObject set_text_answer_parse_alt(SubLObject text_answer, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(text_answer, value, EIGHT_INTEGER, PARSE);
    }

    public static SubLObject set_text_answer_parse(final SubLObject text_answer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(text_answer, value, EIGHT_INTEGER, PARSE);
    }

    public static final SubLObject get_text_answer_vector_alt(SubLObject text_answer) {
        return classes.subloop_get_access_protected_instance_slot(text_answer, SEVEN_INTEGER, VECTOR);
    }

    public static SubLObject get_text_answer_vector(final SubLObject text_answer) {
        return classes.subloop_get_access_protected_instance_slot(text_answer, SEVEN_INTEGER, VECTOR);
    }

    public static final SubLObject set_text_answer_vector_alt(SubLObject text_answer, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(text_answer, value, SEVEN_INTEGER, VECTOR);
    }

    public static SubLObject set_text_answer_vector(final SubLObject text_answer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(text_answer, value, SEVEN_INTEGER, VECTOR);
    }

    public static final SubLObject subloop_reserved_initialize_text_answer_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_text_answer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_text_answer_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, INFO_REQUEST, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, CONTENT, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, CONFIDENCE, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, RELEVANCE, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, JUSTIFICATION, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, INFO, NIL);
        classes.subloop_initialize_slot(new_instance, TEXT_ANSWER, VECTOR, NIL);
        classes.subloop_initialize_slot(new_instance, TEXT_ANSWER, PARSE, NIL);
        classes.subloop_initialize_slot(new_instance, TEXT_ANSWER, AUGMENTATION_TERMS, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_text_answer_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, INFO_REQUEST, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, CONTENT, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, CONFIDENCE, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, RELEVANCE, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, JUSTIFICATION, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, INFO, NIL);
        classes.subloop_initialize_slot(new_instance, TEXT_ANSWER, VECTOR, NIL);
        classes.subloop_initialize_slot(new_instance, TEXT_ANSWER, PARSE, NIL);
        classes.subloop_initialize_slot(new_instance, TEXT_ANSWER, AUGMENTATION_TERMS, NIL);
        return NIL;
    }

    public static final SubLObject text_answer_p_alt(SubLObject text_answer) {
        return classes.subloop_instanceof_class(text_answer, TEXT_ANSWER);
    }

    public static SubLObject text_answer_p(final SubLObject text_answer) {
        return classes.subloop_instanceof_class(text_answer, TEXT_ANSWER);
    }

    /**
     *
     *
     * @return answer; an answer to QUESTION found in PASSAGE
     */
    @LispMethod(comment = "@return answer; an answer to QUESTION found in PASSAGE")
    public static final SubLObject new_text_answer_alt(SubLObject info_request, SubLObject string, SubLObject justification, SubLObject confidence, SubLObject v_parse_tree) {
        if (v_parse_tree == UNPROVIDED) {
            v_parse_tree = NIL;
        }
        SubLTrampolineFile.checkType(info_request, INFORMATION_REQUEST_P);
        SubLTrampolineFile.checkType(justification, INFORMATION_P);
        SubLTrampolineFile.checkType(confidence, NUMBERP);
        {
            SubLObject v_answer = object.new_class_instance(TEXT_ANSWER);
            com.cyc.cycjava.cycl.quirk.answer.set_answer_info_request(v_answer, info_request);
            com.cyc.cycjava.cycl.quirk.answer.set_answer_content(v_answer, string);
            com.cyc.cycjava.cycl.quirk.answer.set_answer_justification(v_answer, justification);
            com.cyc.cycjava.cycl.quirk.answer.set_answer_confidence(v_answer, confidence);
            com.cyc.cycjava.cycl.quirk.answer.set_answer_info(v_answer, list($PARSE_TREE, v_parse_tree));
            com.cyc.cycjava.cycl.quirk.answer.set_text_answer_vector(v_answer, question.new_string_vector(string));
            return v_answer;
        }
    }

    /**
     *
     *
     * @return answer; an answer to QUESTION found in PASSAGE
     */
    @LispMethod(comment = "@return answer; an answer to QUESTION found in PASSAGE")
    public static SubLObject new_text_answer(final SubLObject info_request, final SubLObject string, final SubLObject justification, final SubLObject confidence, SubLObject v_parse_tree) {
        if (v_parse_tree == UNPROVIDED) {
            v_parse_tree = NIL;
        }
        assert NIL != search_engine.information_request_p(info_request) : "! search_engine.information_request_p(info_request) " + ("search_engine.information_request_p(info_request) " + "CommonSymbols.NIL != search_engine.information_request_p(info_request) ") + info_request;
        assert NIL != search_engine.information_p(justification) : "! search_engine.information_p(justification) " + ("search_engine.information_p(justification) " + "CommonSymbols.NIL != search_engine.information_p(justification) ") + justification;
        assert NIL != numberp(confidence) : "! numberp(confidence) " + ("Types.numberp(confidence) " + "CommonSymbols.NIL != Types.numberp(confidence) ") + confidence;
        final SubLObject v_answer = object.new_class_instance(TEXT_ANSWER);
        set_answer_info_request(v_answer, info_request);
        set_answer_content(v_answer, string);
        set_answer_justification(v_answer, justification);
        set_answer_confidence(v_answer, confidence);
        set_answer_info(v_answer, list($PARSE_TREE, v_parse_tree));
        set_text_answer_vector(v_answer, question.new_string_vector(string));
        return v_answer;
    }

    public static final SubLObject text_answer_similarity_function_method_alt(SubLObject self) {
        return TEXT_ANSWER_SIMILARITY;
    }

    public static SubLObject text_answer_similarity_function_method(final SubLObject self) {
        return TEXT_ANSWER_SIMILARITY;
    }

    /**
     *
     *
     * @return positive-number-p; a value between 0 and 1 that specifies a minimal
    similarity that is required for two answers to end up in the same cluster
    during answer clustering. A low number implies few clusters, a high number
    many clusters
     */
    @LispMethod(comment = "@return positive-number-p; a value between 0 and 1 that specifies a minimal\r\nsimilarity that is required for two answers to end up in the same cluster\r\nduring answer clustering. A low number implies few clusters, a high number\r\nmany clusters")
    public static final SubLObject text_answer_require_similarity_method_alt(SubLObject self) {
        return $float$0_3;
    }

    /**
     *
     *
     * @return positive-number-p; a value between 0 and 1 that specifies a minimal
    similarity that is required for two answers to end up in the same cluster
    during answer clustering. A low number implies few clusters, a high number
    many clusters
     */
    @LispMethod(comment = "@return positive-number-p; a value between 0 and 1 that specifies a minimal\r\nsimilarity that is required for two answers to end up in the same cluster\r\nduring answer clustering. A low number implies few clusters, a high number\r\nmany clusters")
    public static SubLObject text_answer_require_similarity_method(final SubLObject self) {
        return $float$0_3;
    }

    /**
     *
     *
     * @param ANSWERS
    listp
     * 		
     * @return answer-p; the most typical answer among ANSWERS
     */
    @LispMethod(comment = "@param ANSWERS\nlistp\r\n\t\t\r\n@return answer-p; the most typical answer among ANSWERS")
    public static final SubLObject text_answer_typical_instance_method_alt(SubLObject self, SubLObject answers) {
        SubLTrampolineFile.checkType(answers, LISTP);
        {
            SubLObject typical = answers.first();
            SubLObject centroid = sparse_vector.svector_centroid(Mapping.mapcar(GET_TEXT_ANSWER_VECTOR, answers));
            SubLObject centroid_length = sparse_vector.svector_length(centroid);
            if (!centroid_length.isZero()) {
                {
                    SubLObject typical_vector = com.cyc.cycjava.cycl.quirk.answer.get_text_answer_vector(typical);
                    SubLObject min_distance = scenario.safe_svector_cosine_angle(typical_vector, centroid, UNPROVIDED);
                    SubLObject distance = NIL;
                    SubLObject cdolist_list_var = answers;
                    SubLObject v_answer = NIL;
                    for (v_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_answer = cdolist_list_var.first()) {
                        {
                            SubLObject answer_vector = com.cyc.cycjava.cycl.quirk.answer.get_text_answer_vector(v_answer);
                            distance = scenario.safe_svector_cosine_angle(answer_vector, centroid, UNPROVIDED);
                            if (distance.numG(min_distance)) {
                                min_distance = distance;
                                typical = v_answer;
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
     * @return answer-p; the most typical answer among ANSWERS
     */
    @LispMethod(comment = "@param ANSWERS\nlistp\r\n\t\t\r\n@return answer-p; the most typical answer among ANSWERS")
    public static SubLObject text_answer_typical_instance_method(final SubLObject self, final SubLObject answers) {
        assert NIL != listp(answers) : "! listp(answers) " + ("Types.listp(answers) " + "CommonSymbols.NIL != Types.listp(answers) ") + answers;
        SubLObject typical = answers.first();
        final SubLObject centroid = sparse_vector.svector_centroid(Mapping.mapcar(GET_TEXT_ANSWER_VECTOR, answers));
        final SubLObject centroid_length = sparse_vector.svector_length(centroid);
        if (!centroid_length.isZero()) {
            final SubLObject typical_vector = get_text_answer_vector(typical);
            SubLObject min_distance = scenario.safe_svector_cosine_angle(typical_vector, centroid, UNPROVIDED);
            SubLObject distance = NIL;
            SubLObject cdolist_list_var = answers;
            SubLObject v_answer = NIL;
            v_answer = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject answer_vector = get_text_answer_vector(v_answer);
                distance = scenario.safe_svector_cosine_angle(answer_vector, centroid, UNPROVIDED);
                if (distance.numG(min_distance)) {
                    min_distance = distance;
                    typical = v_answer;
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_answer = cdolist_list_var.first();
            } 
        }
        return typical;
    }

    /**
     *
     *
     * @param ANSWERS
    listp;
     * 		
     * @return listp; the list of conses of the most salient answers among ANSWERS
    and their confidences, ranked by their salientness
     */
    @LispMethod(comment = "@param ANSWERS\nlistp;\r\n\t\t\r\n@return listp; the list of conses of the most salient answers among ANSWERS\r\nand their confidences, ranked by their salientness")
    public static final SubLObject text_answer_select_method_alt(SubLObject self, SubLObject answers) {
        SubLTrampolineFile.checkType(answers, LISTP);
        {
            SubLObject require_percentage = methods.funcall_class_method_with_0_args(methods.funcall_instance_method_with_0_args(answers.first(), GET_INFO_REQUEST), REQUIRE_PERCENTAGE);
            SubLObject require_similarity = methods.funcall_class_method_with_0_args(self, REQUIRE_SIMILARITY);
            SubLObject typicals = NIL;
            SubLObject total_confidence = ZERO_INTEGER;
            SubLObject selected = NIL;
            SubLObject similarity_function = (NIL != answers) ? ((SubLObject) (methods.funcall_class_method_with_0_args(answers.first(), SIMILARITY_FUNCTION))) : NIL;
            SubLObject cdolist_list_var = clustering.cluster(answers, similarity_function, ONE_INTEGER, require_similarity);
            SubLObject cluster = NIL;
            for (cluster = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cluster = cdolist_list_var.first()) {
                {
                    SubLObject v_answer = methods.funcall_class_method_with_1_args(self, TYPICAL_INSTANCE, methods.funcall_class_method_with_1_args(self, MAX_INSTANCES, clustering.cluster_elements(cluster)));
                    com.cyc.cycjava.cycl.quirk.answer.set_answer_relevance(v_answer, clustering.cluster_cardinality(cluster));
                    typicals = cons(v_answer, typicals);
                    total_confidence = add(total_confidence, methods.funcall_instance_method_with_0_args(v_answer, GET_CONFIDENCE));
                }
            }
            {
                SubLObject stop_after_confidence = multiply(divide(total_confidence, $int$100), require_percentage);
                SubLObject sofar_confidence = ZERO_INTEGER;
                SubLObject stopP = numGE(sofar_confidence, stop_after_confidence);
                if (NIL == stopP) {
                    {
                        SubLObject csome_list_var = Sort.sort(typicals, TEXT_ANSWER_BETTER, UNPROVIDED);
                        SubLObject v_answer = NIL;
                        for (v_answer = csome_list_var.first(); !((NIL != stopP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_answer = csome_list_var.first()) {
                            selected = cons(v_answer, selected);
                            sofar_confidence = add(sofar_confidence, methods.funcall_instance_method_with_0_args(v_answer, GET_CONFIDENCE));
                            stopP = numGE(sofar_confidence, stop_after_confidence);
                        }
                    }
                }
            }
            return nreverse(selected);
        }
    }

    /**
     *
     *
     * @param ANSWERS
    listp;
     * 		
     * @return listp; the list of conses of the most salient answers among ANSWERS
    and their confidences, ranked by their salientness
     */
    @LispMethod(comment = "@param ANSWERS\nlistp;\r\n\t\t\r\n@return listp; the list of conses of the most salient answers among ANSWERS\r\nand their confidences, ranked by their salientness")
    public static SubLObject text_answer_select_method(final SubLObject self, final SubLObject answers) {
        assert NIL != listp(answers) : "! listp(answers) " + ("Types.listp(answers) " + "CommonSymbols.NIL != Types.listp(answers) ") + answers;
        final SubLObject require_percentage = methods.funcall_class_method_with_0_args(methods.funcall_instance_method_with_0_args(answers.first(), GET_INFO_REQUEST), REQUIRE_PERCENTAGE);
        final SubLObject require_similarity = methods.funcall_class_method_with_0_args(self, REQUIRE_SIMILARITY);
        SubLObject typicals = NIL;
        SubLObject total_confidence = ZERO_INTEGER;
        SubLObject selected = NIL;
        final SubLObject similarity_function = (NIL != answers) ? methods.funcall_class_method_with_0_args(answers.first(), SIMILARITY_FUNCTION) : NIL;
        SubLObject cdolist_list_var = clustering.cluster(answers, similarity_function, ONE_INTEGER, require_similarity);
        SubLObject cluster = NIL;
        cluster = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_answer = methods.funcall_class_method_with_1_args(self, TYPICAL_INSTANCE, methods.funcall_class_method_with_1_args(self, MAX_INSTANCES, clustering.cluster_elements(cluster)));
            set_answer_relevance(v_answer, clustering.cluster_cardinality(cluster));
            typicals = cons(v_answer, typicals);
            total_confidence = add(total_confidence, methods.funcall_instance_method_with_0_args(v_answer, GET_CONFIDENCE));
            cdolist_list_var = cdolist_list_var.rest();
            cluster = cdolist_list_var.first();
        } 
        final SubLObject stop_after_confidence = multiply(divide(total_confidence, $int$100), require_percentage);
        SubLObject sofar_confidence = ZERO_INTEGER;
        SubLObject stopP = numGE(sofar_confidence, stop_after_confidence);
        if (NIL == stopP) {
            SubLObject csome_list_var = Sort.sort(typicals, TEXT_ANSWER_BETTER, UNPROVIDED);
            SubLObject v_answer2 = NIL;
            v_answer2 = csome_list_var.first();
            while ((NIL == stopP) && (NIL != csome_list_var)) {
                selected = cons(v_answer2, selected);
                sofar_confidence = add(sofar_confidence, methods.funcall_instance_method_with_0_args(v_answer2, GET_CONFIDENCE));
                stopP = numGE(sofar_confidence, stop_after_confidence);
                csome_list_var = csome_list_var.rest();
                v_answer2 = csome_list_var.first();
            } 
        }
        return nreverse(selected);
    }

    /**
     *
     *
     * @return boolean; t if ANSWER1 is better than ANSWER2, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if ANSWER1 is better than ANSWER2, nil otherwise")
    public static final SubLObject text_answer_better_alt(SubLObject answer1, SubLObject answer2) {
        return methods.funcall_instance_method_with_0_args(answer1, GET_CONFIDENCE).numE(methods.funcall_instance_method_with_0_args(answer2, GET_CONFIDENCE)) ? ((SubLObject) (numG(methods.funcall_instance_method_with_0_args(answer1, GET_RELEVANCE), methods.funcall_instance_method_with_0_args(answer2, GET_RELEVANCE)))) : numG(methods.funcall_instance_method_with_0_args(answer1, GET_CONFIDENCE), methods.funcall_instance_method_with_0_args(answer2, GET_CONFIDENCE));
    }

    /**
     *
     *
     * @return boolean; t if ANSWER1 is better than ANSWER2, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if ANSWER1 is better than ANSWER2, nil otherwise")
    public static SubLObject text_answer_better(final SubLObject answer1, final SubLObject answer2) {
        return methods.funcall_instance_method_with_0_args(answer1, GET_CONFIDENCE).numE(methods.funcall_instance_method_with_0_args(answer2, GET_CONFIDENCE)) ? numG(methods.funcall_instance_method_with_0_args(answer1, GET_RELEVANCE), methods.funcall_instance_method_with_0_args(answer2, GET_RELEVANCE)) : numG(methods.funcall_instance_method_with_0_args(answer1, GET_CONFIDENCE), methods.funcall_instance_method_with_0_args(answer2, GET_CONFIDENCE));
    }

    /**
     *
     *
     * @return non-negative-integer-p; the confidence of the set of ANSWERS
     */
    @LispMethod(comment = "@return non-negative-integer-p; the confidence of the set of ANSWERS")
    public static final SubLObject text_answer_set_confidence_alt(SubLObject answers) {
        SubLTrampolineFile.checkType(answers, CLUSTER_P);
        {
            SubLObject confidence = ZERO_INTEGER;
            SubLObject cdolist_list_var = clustering.cluster_elements(answers);
            SubLObject v_answer = NIL;
            for (v_answer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_answer = cdolist_list_var.first()) {
                confidence = add(confidence, methods.funcall_instance_method_with_0_args(v_answer, GET_CONFIDENCE));
            }
            return confidence;
        }
    }

    /**
     *
     *
     * @return non-negative-integer-p; the confidence of the set of ANSWERS
     */
    @LispMethod(comment = "@return non-negative-integer-p; the confidence of the set of ANSWERS")
    public static SubLObject text_answer_set_confidence(final SubLObject answers) {
        assert NIL != clustering.cluster_p(answers) : "! clustering.cluster_p(answers) " + ("clustering.cluster_p(answers) " + "CommonSymbols.NIL != clustering.cluster_p(answers) ") + answers;
        SubLObject confidence = ZERO_INTEGER;
        SubLObject cdolist_list_var = clustering.cluster_elements(answers);
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            confidence = add(confidence, methods.funcall_instance_method_with_0_args(v_answer, GET_CONFIDENCE));
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        } 
        return confidence;
    }

    /**
     *
     *
     * @return svector-p; the word vector of this answer
     */
    @LispMethod(comment = "@return svector-p; the word vector of this answer")
    public static final SubLObject text_answer_get_vector_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_text_answer_method = NIL;
            SubLObject vector = com.cyc.cycjava.cycl.quirk.answer.get_text_answer_vector(self);
            try {
                try {
                    sublisp_throw($sym105$OUTER_CATCH_FOR_TEXT_ANSWER_METHOD, vector);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.answer.set_text_answer_vector(self, vector);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_text_answer_method = Errors.handleThrowable(ccatch_env_var, $sym105$OUTER_CATCH_FOR_TEXT_ANSWER_METHOD);
            }
            return catch_var_for_text_answer_method;
        }
    }

    /**
     *
     *
     * @return svector-p; the word vector of this answer
     */
    @LispMethod(comment = "@return svector-p; the word vector of this answer")
    public static SubLObject text_answer_get_vector_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_text_answer_method = NIL;
        final SubLObject vector = get_text_answer_vector(self);
        try {
            thread.throwStack.push($sym105$OUTER_CATCH_FOR_TEXT_ANSWER_METHOD);
            try {
                sublisp_throw($sym105$OUTER_CATCH_FOR_TEXT_ANSWER_METHOD, vector);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_text_answer_vector(self, vector);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_text_answer_method = Errors.handleThrowable(ccatch_env_var, $sym105$OUTER_CATCH_FOR_TEXT_ANSWER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_text_answer_method;
    }

    /**
     *
     *
     * @param ANS1
    answer-p
     * 		
     * @param ANS2
    answer-p
     * 		
     * @return non-negative-integerp; the similarity between ANS1 and ANS2 with
    0 indicating no similarity and 1 indicating identity
     */
    @LispMethod(comment = "@param ANS1\nanswer-p\r\n\t\t\r\n@param ANS2\nanswer-p\r\n\t\t\r\n@return non-negative-integerp; the similarity between ANS1 and ANS2 with\r\n0 indicating no similarity and 1 indicating identity")
    public static final SubLObject text_answer_similarity_method_alt(SubLObject self, SubLObject ans1, SubLObject ans2) {
        SubLTrampolineFile.checkType(ans1, TEXT_ANSWER_P);
        SubLTrampolineFile.checkType(ans2, TEXT_ANSWER_P);
        if (NIL != Strings.stringE(methods.funcall_instance_method_with_0_args(ans1, GET_CONTENT), methods.funcall_instance_method_with_0_args(ans2, GET_CONTENT), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return ONE_INTEGER;
        }
        return scenario.safe_svector_cosine_angle(methods.funcall_instance_method_with_0_args(ans1, GET_VECTOR), methods.funcall_instance_method_with_0_args(ans2, GET_VECTOR), UNPROVIDED);
    }

    /**
     *
     *
     * @param ANS1
    answer-p
     * 		
     * @param ANS2
    answer-p
     * 		
     * @return non-negative-integerp; the similarity between ANS1 and ANS2 with
    0 indicating no similarity and 1 indicating identity
     */
    @LispMethod(comment = "@param ANS1\nanswer-p\r\n\t\t\r\n@param ANS2\nanswer-p\r\n\t\t\r\n@return non-negative-integerp; the similarity between ANS1 and ANS2 with\r\n0 indicating no similarity and 1 indicating identity")
    public static SubLObject text_answer_similarity_method(final SubLObject self, final SubLObject ans1, final SubLObject ans2) {
        assert NIL != text_answer_p(ans1) : "! answer.text_answer_p(ans1) " + ("answer.text_answer_p(ans1) " + "CommonSymbols.NIL != answer.text_answer_p(ans1) ") + ans1;
        assert NIL != text_answer_p(ans2) : "! answer.text_answer_p(ans2) " + ("answer.text_answer_p(ans2) " + "CommonSymbols.NIL != answer.text_answer_p(ans2) ") + ans2;
        if (NIL != Strings.stringE(methods.funcall_instance_method_with_0_args(ans1, GET_CONTENT), methods.funcall_instance_method_with_0_args(ans2, GET_CONTENT), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return ONE_INTEGER;
        }
        return scenario.safe_svector_cosine_angle(methods.funcall_instance_method_with_0_args(ans1, GET_VECTOR), methods.funcall_instance_method_with_0_args(ans2, GET_VECTOR), UNPROVIDED);
    }

    public static final SubLObject get_value_answer_interpreted_values_alt(SubLObject value_answer) {
        return classes.subloop_get_access_protected_instance_slot(value_answer, TEN_INTEGER, INTERPRETED_VALUES);
    }

    public static SubLObject get_value_answer_interpreted_values(final SubLObject value_answer) {
        return classes.subloop_get_access_protected_instance_slot(value_answer, TEN_INTEGER, INTERPRETED_VALUES);
    }

    public static final SubLObject set_value_answer_interpreted_values_alt(SubLObject value_answer, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(value_answer, value, TEN_INTEGER, INTERPRETED_VALUES);
    }

    public static SubLObject set_value_answer_interpreted_values(final SubLObject value_answer, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(value_answer, value, TEN_INTEGER, INTERPRETED_VALUES);
    }

    public static final SubLObject subloop_reserved_initialize_value_answer_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_value_answer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_value_answer_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, INFO_REQUEST, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, CONTENT, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, CONFIDENCE, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, RELEVANCE, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, JUSTIFICATION, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, INFO, NIL);
        classes.subloop_initialize_slot(new_instance, TEXT_ANSWER, VECTOR, NIL);
        classes.subloop_initialize_slot(new_instance, TEXT_ANSWER, PARSE, NIL);
        classes.subloop_initialize_slot(new_instance, TEXT_ANSWER, AUGMENTATION_TERMS, NIL);
        classes.subloop_initialize_slot(new_instance, VALUE_ANSWER, INTERPRETED_VALUES, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_value_answer_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, INFO_REQUEST, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, CONTENT, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, CONFIDENCE, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, RELEVANCE, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, JUSTIFICATION, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, INFO, NIL);
        classes.subloop_initialize_slot(new_instance, TEXT_ANSWER, VECTOR, NIL);
        classes.subloop_initialize_slot(new_instance, TEXT_ANSWER, PARSE, NIL);
        classes.subloop_initialize_slot(new_instance, TEXT_ANSWER, AUGMENTATION_TERMS, NIL);
        classes.subloop_initialize_slot(new_instance, VALUE_ANSWER, INTERPRETED_VALUES, NIL);
        return NIL;
    }

    public static final SubLObject value_answer_p_alt(SubLObject value_answer) {
        return classes.subloop_instanceof_class(value_answer, VALUE_ANSWER);
    }

    public static SubLObject value_answer_p(final SubLObject value_answer) {
        return classes.subloop_instanceof_class(value_answer, VALUE_ANSWER);
    }

    /**
     *
     *
     * @return answer; an answer to QUESTION found in PASSAGE
     */
    @LispMethod(comment = "@return answer; an answer to QUESTION found in PASSAGE")
    public static final SubLObject new_value_answer_alt(SubLObject info_request, SubLObject parse, SubLObject justification, SubLObject confidence, SubLObject cyc_interpretations) {
        if (cyc_interpretations == UNPROVIDED) {
            cyc_interpretations = NIL;
        }
        SubLTrampolineFile.checkType(info_request, INFORMATION_REQUEST_P);
        SubLTrampolineFile.checkType(parse, PARSE_TREE_P);
        SubLTrampolineFile.checkType(justification, INFORMATION_P);
        SubLTrampolineFile.checkType(confidence, NUMBERP);
        SubLTrampolineFile.checkType(cyc_interpretations, LISTP);
        {
            SubLObject v_answer = object.new_class_instance(VALUE_ANSWER);
            com.cyc.cycjava.cycl.quirk.answer.set_answer_info_request(v_answer, info_request);
            com.cyc.cycjava.cycl.quirk.answer.set_answer_content(v_answer, string_utilities.string_substitute($str_alt118$_, $str_alt119$__RRB_, string_utilities.string_substitute($str_alt120$_, $str_alt121$_LRB__, methods.funcall_instance_method_with_0_args(parse, GET_STRING), UNPROVIDED), UNPROVIDED));
            com.cyc.cycjava.cycl.quirk.answer.set_answer_justification(v_answer, justification);
            com.cyc.cycjava.cycl.quirk.answer.set_answer_confidence(v_answer, confidence);
            com.cyc.cycjava.cycl.quirk.answer.set_text_answer_parse(v_answer, parse);
            com.cyc.cycjava.cycl.quirk.answer.set_value_answer_interpreted_values(v_answer, cyc_interpretations);
            return v_answer;
        }
    }

    /**
     *
     *
     * @return answer; an answer to QUESTION found in PASSAGE
     */
    @LispMethod(comment = "@return answer; an answer to QUESTION found in PASSAGE")
    public static SubLObject new_value_answer(final SubLObject info_request, final SubLObject parse, final SubLObject justification, final SubLObject confidence, SubLObject cyc_interpretations) {
        if (cyc_interpretations == UNPROVIDED) {
            cyc_interpretations = NIL;
        }
        assert NIL != search_engine.information_request_p(info_request) : "! search_engine.information_request_p(info_request) " + ("search_engine.information_request_p(info_request) " + "CommonSymbols.NIL != search_engine.information_request_p(info_request) ") + info_request;
        assert NIL != parse_tree.parse_tree_p(parse) : "! parse_tree.parse_tree_p(parse) " + ("parse_tree.parse_tree_p(parse) " + "CommonSymbols.NIL != parse_tree.parse_tree_p(parse) ") + parse;
        assert NIL != search_engine.information_p(justification) : "! search_engine.information_p(justification) " + ("search_engine.information_p(justification) " + "CommonSymbols.NIL != search_engine.information_p(justification) ") + justification;
        assert NIL != numberp(confidence) : "! numberp(confidence) " + ("Types.numberp(confidence) " + "CommonSymbols.NIL != Types.numberp(confidence) ") + confidence;
        assert NIL != listp(cyc_interpretations) : "! listp(cyc_interpretations) " + ("Types.listp(cyc_interpretations) " + "CommonSymbols.NIL != Types.listp(cyc_interpretations) ") + cyc_interpretations;
        final SubLObject v_answer = object.new_class_instance(VALUE_ANSWER);
        set_answer_info_request(v_answer, info_request);
        set_answer_content(v_answer, string_utilities.string_substitute($str118$_, $str119$__RRB_, string_utilities.string_substitute($str120$_, $str121$_LRB__, methods.funcall_instance_method_with_0_args(parse, GET_STRING), UNPROVIDED), UNPROVIDED));
        set_answer_justification(v_answer, justification);
        set_answer_confidence(v_answer, confidence);
        set_text_answer_parse(v_answer, parse);
        set_value_answer_interpreted_values(v_answer, cyc_interpretations);
        return v_answer;
    }

    static private final SubLList $list_alt2 = list(new SubLObject[]{ list(makeSymbol("INFO-REQUEST"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CONTENT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CONFIDENCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("RELEVANCE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("JUSTIFICATION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INFO"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("SELECT"), list(makeSymbol("CANDIDATES")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INFO-REQUEST"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONFIDENCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-RELEVANCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("JUSTIFY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NATURAL-LANGUAGE-FACTOID"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OLDER"), list(makeSymbol("OTHER-ANSWER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DATE"), NIL, makeKeyword("PUBLIC")) });

    /**
     *
     *
     * @return symbolp; the similarity function used to compare value-answers
     */
    @LispMethod(comment = "@return symbolp; the similarity function used to compare value-answers")
    public static final SubLObject value_answer_similarity_function_method_alt(SubLObject self) {
        return VALUE_ANSWER_SIMILARITY;
    }

    /**
     *
     *
     * @return symbolp; the similarity function used to compare value-answers
     */
    @LispMethod(comment = "@return symbolp; the similarity function used to compare value-answers")
    public static SubLObject value_answer_similarity_function_method(final SubLObject self) {
        return VALUE_ANSWER_SIMILARITY;
    }

    public static final SubLObject value_answer_get_interpreted_values_method_alt(SubLObject self) {
        {
            SubLObject catch_var_for_value_answer_method = NIL;
            SubLObject interpreted_values = com.cyc.cycjava.cycl.quirk.answer.get_value_answer_interpreted_values(self);
            try {
                try {
                    sublisp_throw($sym128$OUTER_CATCH_FOR_VALUE_ANSWER_METHOD, interpreted_values);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.answer.set_value_answer_interpreted_values(self, interpreted_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_value_answer_method = Errors.handleThrowable(ccatch_env_var, $sym128$OUTER_CATCH_FOR_VALUE_ANSWER_METHOD);
            }
            return catch_var_for_value_answer_method;
        }
    }

    public static SubLObject value_answer_get_interpreted_values_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_value_answer_method = NIL;
        final SubLObject interpreted_values = get_value_answer_interpreted_values(self);
        try {
            thread.throwStack.push($sym128$OUTER_CATCH_FOR_VALUE_ANSWER_METHOD);
            try {
                sublisp_throw($sym128$OUTER_CATCH_FOR_VALUE_ANSWER_METHOD, interpreted_values);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_value_answer_interpreted_values(self, interpreted_values);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_value_answer_method = Errors.handleThrowable(ccatch_env_var, $sym128$OUTER_CATCH_FOR_VALUE_ANSWER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_value_answer_method;
    }

    static private final SubLList $list_alt15 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt16 = list(makeSymbol("ANSWERS"));

    static private final SubLList $list_alt17 = list(makeString("@param ANSWERS listp\n    @return answer-p; the highest scoring answer among ANSWERS"), list(makeSymbol("CHECK-TYPE"), makeSymbol("ANSWERS"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("MAX-SCORE"), ZERO_INTEGER), list(makeSymbol("MAX-ANSWERS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("ANSWER"), makeSymbol("ANSWERS")), list(makeSymbol("PWHEN"), list(makeSymbol(">"), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(QUOTE, makeSymbol("GET-CONFIDENCE"))), makeSymbol("MAX-SCORE")), list(makeSymbol("CSETQ"), makeSymbol("MAX-SCORE"), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(QUOTE, makeSymbol("GET-CONFIDENCE")))))), list(makeSymbol("CDOLIST"), list(makeSymbol("ANSWER"), makeSymbol("ANSWERS")), list(makeSymbol("PWHEN"), list(makeSymbol("="), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(QUOTE, makeSymbol("GET-CONFIDENCE"))), makeSymbol("MAX-SCORE")), list(makeSymbol("CPUSH"), makeSymbol("ANSWER"), makeSymbol("MAX-ANSWERS")))), list(RET, makeSymbol("MAX-ANSWERS"))));

    /**
     *
     *
     * @param ANS1
    answer-p
     * 		
     * @param ANS2
    answer-p
     * 		
     * @return non-negative-integerp; the similarity between ANS1 and ANS2 with
    0 indicating no similarity and 1 indicating identity
     */
    @LispMethod(comment = "@param ANS1\nanswer-p\r\n\t\t\r\n@param ANS2\nanswer-p\r\n\t\t\r\n@return non-negative-integerp; the similarity between ANS1 and ANS2 with\r\n0 indicating no similarity and 1 indicating identity")
    public static final SubLObject value_answer_similarity_method_alt(SubLObject self, SubLObject ans1, SubLObject ans2) {
        SubLTrampolineFile.checkType(ans1, VALUE_ANSWER_P);
        SubLTrampolineFile.checkType(ans2, VALUE_ANSWER_P);
        {
            SubLObject max = ZERO_INTEGER;
            SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(ans1, GET_INTERPRETED_VALUES);
            SubLObject iv1 = NIL;
            for (iv1 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , iv1 = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_1 = methods.funcall_instance_method_with_0_args(ans2, GET_INTERPRETED_VALUES);
                    SubLObject iv2 = NIL;
                    for (iv2 = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , iv2 = cdolist_list_var_1.first()) {
                        {
                            SubLObject value = com.cyc.cycjava.cycl.quirk.answer.amount_similarity(iv1, iv2);
                            if (value.numG(max)) {
                                max = value;
                            }
                        }
                    }
                }
            }
            return max;
        }
    }

    /**
     *
     *
     * @param ANS1
    answer-p
     * 		
     * @param ANS2
    answer-p
     * 		
     * @return non-negative-integerp; the similarity between ANS1 and ANS2 with
    0 indicating no similarity and 1 indicating identity
     */
    @LispMethod(comment = "@param ANS1\nanswer-p\r\n\t\t\r\n@param ANS2\nanswer-p\r\n\t\t\r\n@return non-negative-integerp; the similarity between ANS1 and ANS2 with\r\n0 indicating no similarity and 1 indicating identity")
    public static SubLObject value_answer_similarity_method(final SubLObject self, final SubLObject ans1, final SubLObject ans2) {
        assert NIL != value_answer_p(ans1) : "! answer.value_answer_p(ans1) " + ("answer.value_answer_p(ans1) " + "CommonSymbols.NIL != answer.value_answer_p(ans1) ") + ans1;
        assert NIL != value_answer_p(ans2) : "! answer.value_answer_p(ans2) " + ("answer.value_answer_p(ans2) " + "CommonSymbols.NIL != answer.value_answer_p(ans2) ") + ans2;
        SubLObject max = ZERO_INTEGER;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(ans1, GET_INTERPRETED_VALUES);
        SubLObject iv1 = NIL;
        iv1 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = methods.funcall_instance_method_with_0_args(ans2, GET_INTERPRETED_VALUES);
            SubLObject iv2 = NIL;
            iv2 = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                final SubLObject value = amount_similarity(iv1, iv2);
                if (value.numG(max)) {
                    max = value;
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                iv2 = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            iv1 = cdolist_list_var.first();
        } 
        return max;
    }

    static private final SubLList $list_alt22 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt23 = list(makeSymbol("STREAM"), makeSymbol("DEPTH"));

    static private final SubLList $list_alt24 = list(makeString("Prints this answer to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<ANSWER for "), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), makeSymbol("INFO-REQUEST"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(": "), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), makeSymbol("CONTENT"), makeSymbol("STREAM")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" (~,2F/~,2F)"), makeSymbol("CONFIDENCE"), makeSymbol("RELEVANCE")), list(RET, makeSymbol("SELF")));

    public static final SubLObject value_answer_typical_instance_method_alt(SubLObject self, SubLObject answers) {
        return list_utilities.random_element(answers);
    }

    public static SubLObject value_answer_typical_instance_method(final SubLObject self, final SubLObject answers) {
        return list_utilities.random_element(answers);
    }

    public static final SubLObject amount_similarity_alt(SubLObject amount1, SubLObject amount2) {
        {
            SubLObject result = NIL;
            SubLObject error_message = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            {
                                SubLObject quotient = quantities.cyc_quotient(amount1, amount2);
                                if (quotient.isNumber() && quotient.numG(ONE_INTEGER)) {
                                    result = invert(quotient);
                                } else {
                                    if (quotient.isNumber()) {
                                        result = quotient;
                                    } else {
                                        result = ZERO_INTEGER;
                                    }
                                }
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (NIL != error_message) {
                result = ZERO_INTEGER;
            }
            return result;
        }
    }

    public static SubLObject amount_similarity(final SubLObject amount1, final SubLObject amount2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject quotient = quantities.cyc_quotient(amount1, amount2);
                    if (quotient.isNumber() && quotient.numG(ONE_INTEGER)) {
                        result = invert(quotient);
                    } else
                        if (quotient.isNumber()) {
                            result = quotient;
                        } else {
                            result = ZERO_INTEGER;
                        }

                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            result = ZERO_INTEGER;
        }
        return result;
    }

    static private final SubLString $str_alt26$__ANSWER_for_ = makeString("#<ANSWER for ");

    static private final SubLString $str_alt27$__ = makeString(": ");

    static private final SubLString $str_alt28$____2F___2F_ = makeString(" (~,2F/~,2F)");

    static private final SubLList $list_alt31 = list(makeString("@return object; the info-request of this answer"), list(RET, makeSymbol("INFO-REQUEST")));

    static private final SubLList $list_alt35 = list(makeString("@return object; the string of this answer"), list(RET, makeSymbol("CONTENT")));

    static private final SubLList $list_alt38 = list(makeString("@return non-negative-integer-p; the confidence of this answer"), list(RET, makeSymbol("CONFIDENCE")));

    public static final SubLObject subloop_reserved_initialize_sentence_answer_class_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_sentence_answer_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_sentence_answer_instance_alt(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, INFO_REQUEST, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, CONTENT, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, CONFIDENCE, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, RELEVANCE, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, JUSTIFICATION, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, INFO, NIL);
        classes.subloop_initialize_slot(new_instance, TEXT_ANSWER, VECTOR, NIL);
        classes.subloop_initialize_slot(new_instance, TEXT_ANSWER, PARSE, NIL);
        classes.subloop_initialize_slot(new_instance, TEXT_ANSWER, AUGMENTATION_TERMS, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_sentence_answer_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, INFO_REQUEST, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, CONTENT, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, CONFIDENCE, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, RELEVANCE, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, JUSTIFICATION, NIL);
        classes.subloop_initialize_slot(new_instance, ANSWER, INFO, NIL);
        classes.subloop_initialize_slot(new_instance, TEXT_ANSWER, VECTOR, NIL);
        classes.subloop_initialize_slot(new_instance, TEXT_ANSWER, PARSE, NIL);
        classes.subloop_initialize_slot(new_instance, TEXT_ANSWER, AUGMENTATION_TERMS, NIL);
        return NIL;
    }

    static private final SubLList $list_alt42 = list(makeString("@return non-negative-integer-p; the relevance of this answer"), list(RET, makeSymbol("RELEVANCE")));

    static private final SubLList $list_alt46 = list(makeString("@return passage; the justification of this answer"), list(RET, makeSymbol("JUSTIFICATION")));

    static private final SubLList $list_alt50 = list(makeString("@return passage; the info slot of this answer"), list(RET, makeSymbol("INFO")));

    public static final SubLObject sentence_answer_p_alt(SubLObject sentence_answer) {
        return classes.subloop_instanceof_class(sentence_answer, SENTENCE_ANSWER);
    }

    public static SubLObject sentence_answer_p(final SubLObject sentence_answer) {
        return classes.subloop_instanceof_class(sentence_answer, SENTENCE_ANSWER);
    }

    public static final SubLObject new_sentence_answer_alt(SubLObject info_request, SubLObject passage, SubLObject confidence) {
        {
            SubLObject v_answer = object.new_class_instance(SENTENCE_ANSWER);
            com.cyc.cycjava.cycl.quirk.answer.set_answer_info_request(v_answer, info_request);
            com.cyc.cycjava.cycl.quirk.answer.set_answer_content(v_answer, methods.funcall_instance_method_with_0_args(passage, GET_CONTENT));
            com.cyc.cycjava.cycl.quirk.answer.set_answer_justification(v_answer, passage);
            com.cyc.cycjava.cycl.quirk.answer.set_answer_confidence(v_answer, confidence);
            com.cyc.cycjava.cycl.quirk.answer.set_answer_relevance(v_answer, ONE_INTEGER);
            com.cyc.cycjava.cycl.quirk.answer.set_text_answer_vector(v_answer, question.new_string_vector(methods.funcall_instance_method_with_0_args(passage, GET_CONTENT)));
            return v_answer;
        }
    }

    public static SubLObject new_sentence_answer(final SubLObject info_request, final SubLObject passage, final SubLObject confidence) {
        final SubLObject v_answer = object.new_class_instance(SENTENCE_ANSWER);
        set_answer_info_request(v_answer, info_request);
        set_answer_content(v_answer, methods.funcall_instance_method_with_0_args(passage, GET_CONTENT));
        set_answer_justification(v_answer, passage);
        set_answer_confidence(v_answer, confidence);
        set_answer_relevance(v_answer, ONE_INTEGER);
        set_text_answer_vector(v_answer, question.new_string_vector(methods.funcall_instance_method_with_0_args(passage, GET_CONTENT)));
        return v_answer;
    }

    static private final SubLList $list_alt54 = list(makeString("@return passage; the parse-tree of this answer, if there is one"), list(RET, list(makeSymbol("GETF"), makeSymbol("INFO"), makeKeyword("PARSE-TREE"))));

    /**
     *
     *
     * @return positive-number-p; a value between 0 and 1 that specifies a minimal
    similarity that is required for two answers to end up in the same cluster
    during answer clustering. A low number implies few clusters, a high number
    many clusters
     */
    @LispMethod(comment = "@return positive-number-p; a value between 0 and 1 that specifies a minimal\r\nsimilarity that is required for two answers to end up in the same cluster\r\nduring answer clustering. A low number implies few clusters, a high number\r\nmany clusters")
    public static final SubLObject sentence_answer_require_similarity_method_alt(SubLObject self) {
        return $float$0_3;
    }

    /**
     *
     *
     * @return positive-number-p; a value between 0 and 1 that specifies a minimal
    similarity that is required for two answers to end up in the same cluster
    during answer clustering. A low number implies few clusters, a high number
    many clusters
     */
    @LispMethod(comment = "@return positive-number-p; a value between 0 and 1 that specifies a minimal\r\nsimilarity that is required for two answers to end up in the same cluster\r\nduring answer clustering. A low number implies few clusters, a high number\r\nmany clusters")
    public static SubLObject sentence_answer_require_similarity_method(final SubLObject self) {
        return $float$0_3;
    }

    static private final SubLList $list_alt59 = list(makeString("@return stringp; a simple string stating the answer, whenever possible, in the form\n  of a truth-bearing sentence. For example, the sentence \'Kofi Annan is\n  the UN Secretary General\' in response to the question \'who is Kofi Annan?\'\n  @owner bertolo."), list(makeSymbol("CLET"), list(makeSymbol("FOCUS"), makeSymbol("COPULA"), makeSymbol("FACTOID")), list(makeSymbol("PCOND"), list(list(makeSymbol("DEFINITIONAL-QUESTION-P"), makeSymbol("INFO-REQUEST")), list(makeSymbol("CSETQ"), makeSymbol("FOCUS"), list(makeSymbol("CAR"), list(makeSymbol("FIM"), makeSymbol("INFO-REQUEST"), list(QUOTE, makeSymbol("GET-KEYSTRINGS"))))), list(makeSymbol("CSETQ"), makeSymbol("COPULA"), list(makeSymbol("FIND-SUBJECT-AGREEMENT"), makeSymbol("CONTENT"))), list(makeSymbol("PUNLESS"), list(EQUAL, makeSymbol("COPULA"), makeSymbol("*EMPTY-STRING*")), list(makeSymbol("CSETQ"), makeSymbol("COPULA"), list(makeSymbol("CCONCATENATE"), makeString(" "), makeSymbol("COPULA"), makeString(" ")))), list(makeSymbol("CSETQ"), makeSymbol("FACTOID"), list(makeSymbol("CCONCATENATE"), makeSymbol("FOCUS"), makeSymbol("COPULA"), makeSymbol("CONTENT")))), list(T, list(makeSymbol("CSETQ"), makeSymbol("FACTOID"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("JUSTIFICATION"), list(QUOTE, makeSymbol("GET-CONTENT")))))), list(makeSymbol("PIF"), list(makeSymbol("STRINGP"), makeSymbol("FACTOID")), list(RET, makeSymbol("FACTOID")), list(RET, makeSymbol("*EMPTY-STRING*")))));

    /**
     *
     *
     * @param ANSWERS
    listp
     * 		
     * @return answer-p; the most typical answer among ANSWERS
     */
    @LispMethod(comment = "@param ANSWERS\nlistp\r\n\t\t\r\n@return answer-p; the most typical answer among ANSWERS")
    public static final SubLObject sentence_answer_typical_instance_method_alt(SubLObject self, SubLObject answers) {
        return methods.funcall_class_method_with_1_args(self, MAX_INSTANCES, answers).first();
    }

    /**
     *
     *
     * @param ANSWERS
    listp
     * 		
     * @return answer-p; the most typical answer among ANSWERS
     */
    @LispMethod(comment = "@param ANSWERS\nlistp\r\n\t\t\r\n@return answer-p; the most typical answer among ANSWERS")
    public static SubLObject sentence_answer_typical_instance_method(final SubLObject self, final SubLObject answers) {
        return methods.funcall_class_method_with_1_args(self, MAX_INSTANCES, answers).first();
    }

    /**
     * Prints this answer to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "Prints this answer to STREAM, ignoring DEPTH")
    public static final SubLObject sentence_answer_print_method_alt(SubLObject self, SubLObject stream, SubLObject depth) {
        {
            SubLObject catch_var_for_sentence_answer_method = NIL;
            SubLObject relevance = com.cyc.cycjava.cycl.quirk.answer.get_answer_relevance(self);
            SubLObject confidence = com.cyc.cycjava.cycl.quirk.answer.get_answer_confidence(self);
            SubLObject content = com.cyc.cycjava.cycl.quirk.answer.get_answer_content(self);
            SubLObject info_request = com.cyc.cycjava.cycl.quirk.answer.get_answer_info_request(self);
            try {
                try {
                    write_string($str_alt145$__SENTENCE_ANSWER_for_, stream, UNPROVIDED, UNPROVIDED);
                    prin1(info_request, stream);
                    write_string($str_alt27$__, stream, UNPROVIDED, UNPROVIDED);
                    prin1(content, stream);
                    format(stream, $str_alt28$____2F___2F_, confidence, relevance);
                    sublisp_throw($sym144$OUTER_CATCH_FOR_SENTENCE_ANSWER_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            com.cyc.cycjava.cycl.quirk.answer.set_answer_relevance(self, relevance);
                            com.cyc.cycjava.cycl.quirk.answer.set_answer_confidence(self, confidence);
                            com.cyc.cycjava.cycl.quirk.answer.set_answer_content(self, content);
                            com.cyc.cycjava.cycl.quirk.answer.set_answer_info_request(self, info_request);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_sentence_answer_method = Errors.handleThrowable(ccatch_env_var, $sym144$OUTER_CATCH_FOR_SENTENCE_ANSWER_METHOD);
            }
            return catch_var_for_sentence_answer_method;
        }
    }

    /**
     * Prints this answer to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "Prints this answer to STREAM, ignoring DEPTH")
    public static SubLObject sentence_answer_print_method(final SubLObject self, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sentence_answer_method = NIL;
        final SubLObject relevance = get_answer_relevance(self);
        final SubLObject confidence = get_answer_confidence(self);
        final SubLObject content = get_answer_content(self);
        final SubLObject info_request = get_answer_info_request(self);
        try {
            thread.throwStack.push($sym144$OUTER_CATCH_FOR_SENTENCE_ANSWER_METHOD);
            try {
                write_string($str145$__SENTENCE_ANSWER_for_, stream, UNPROVIDED, UNPROVIDED);
                prin1(info_request, stream);
                write_string($str27$__, stream, UNPROVIDED, UNPROVIDED);
                prin1(content, stream);
                format(stream, $str28$____2F___2F_, confidence, relevance);
                sublisp_throw($sym144$OUTER_CATCH_FOR_SENTENCE_ANSWER_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_answer_relevance(self, relevance);
                    set_answer_confidence(self, confidence);
                    set_answer_content(self, content);
                    set_answer_info_request(self, info_request);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sentence_answer_method = Errors.handleThrowable(ccatch_env_var, $sym144$OUTER_CATCH_FOR_SENTENCE_ANSWER_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sentence_answer_method;
    }

    static private final SubLString $str_alt62$_ = makeString(" ");

    static private final SubLList $list_alt65 = list(makeSymbol("OTHER-ANSWER"));

    static private final SubLList $list_alt66 = list(makeString("@param OTHER-ANSWER, answer-p\n   @return BOOLEAN T if this answer is older than OTHER-ANSWER, NIL otherwise.\n   @owner bertolo."), list(makeSymbol("CHECK-TYPE"), makeSymbol("OTHER-ANSWER"), makeSymbol("ANSWER-P")), list(makeSymbol("CLET"), list(list(makeSymbol("THIS-DATE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-DATE")))), list(makeSymbol("OTHER-DATE"), list(makeSymbol("FIM"), makeSymbol("OTHER-ANSWER"), list(QUOTE, makeSymbol("GET-DATE"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("DATE-P"), makeSymbol("THIS-DATE")), list(makeSymbol("DATE-P"), makeSymbol("OTHER-DATE"))), list(RET, list(makeSymbol("DATE<"), makeSymbol("THIS-DATE"), makeSymbol("OTHER-DATE"))))));

    /**
     *
     *
     * @param ANS1
    text-answer-p
     * 		
     * @param ANS2
    text-answer-p
     * 		
     * @return non-negative-integerp; the similarity between ANS1 and ANS2 with
    0 indicating no similarity and 1 indicating identity
     */
    @LispMethod(comment = "@param ANS1\ntext-answer-p\r\n\t\t\r\n@param ANS2\ntext-answer-p\r\n\t\t\r\n@return non-negative-integerp; the similarity between ANS1 and ANS2 with\r\n0 indicating no similarity and 1 indicating identity")
    public static final SubLObject text_answer_similarity_alt(SubLObject ans1, SubLObject ans2) {
        SubLTrampolineFile.checkType(ans1, TEXT_ANSWER_P);
        SubLTrampolineFile.checkType(ans2, TEXT_ANSWER_P);
        return methods.funcall_class_method_with_2_args(TEXT_ANSWER, SIMILARITY, ans1, ans2);
    }

    /**
     *
     *
     * @param ANS1
    text-answer-p
     * 		
     * @param ANS2
    text-answer-p
     * 		
     * @return non-negative-integerp; the similarity between ANS1 and ANS2 with
    0 indicating no similarity and 1 indicating identity
     */
    @LispMethod(comment = "@param ANS1\ntext-answer-p\r\n\t\t\r\n@param ANS2\ntext-answer-p\r\n\t\t\r\n@return non-negative-integerp; the similarity between ANS1 and ANS2 with\r\n0 indicating no similarity and 1 indicating identity")
    public static SubLObject text_answer_similarity(final SubLObject ans1, final SubLObject ans2) {
        assert NIL != text_answer_p(ans1) : "! answer.text_answer_p(ans1) " + ("answer.text_answer_p(ans1) " + "CommonSymbols.NIL != answer.text_answer_p(ans1) ") + ans1;
        assert NIL != text_answer_p(ans2) : "! answer.text_answer_p(ans2) " + ("answer.text_answer_p(ans2) " + "CommonSymbols.NIL != answer.text_answer_p(ans2) ") + ans2;
        return methods.funcall_class_method_with_2_args(TEXT_ANSWER, SIMILARITY, ans1, ans2);
    }

    /**
     *
     *
     * @param ANS1
    value-answer-p
     * 		
     * @param ANS2
    value-answer-p
     * 		
     * @return non-negative-integerp; the similarity between ANS1 and ANS2 with
    0 indicating no similarity and 1 indicating identity
     */
    @LispMethod(comment = "@param ANS1\nvalue-answer-p\r\n\t\t\r\n@param ANS2\nvalue-answer-p\r\n\t\t\r\n@return non-negative-integerp; the similarity between ANS1 and ANS2 with\r\n0 indicating no similarity and 1 indicating identity")
    public static final SubLObject value_answer_similarity_alt(SubLObject ans1, SubLObject ans2) {
        SubLTrampolineFile.checkType(ans1, VALUE_ANSWER_P);
        SubLTrampolineFile.checkType(ans2, VALUE_ANSWER_P);
        return methods.funcall_class_method_with_2_args(VALUE_ANSWER, SIMILARITY, ans1, ans2);
    }

    /**
     *
     *
     * @param ANS1
    value-answer-p
     * 		
     * @param ANS2
    value-answer-p
     * 		
     * @return non-negative-integerp; the similarity between ANS1 and ANS2 with
    0 indicating no similarity and 1 indicating identity
     */
    @LispMethod(comment = "@param ANS1\nvalue-answer-p\r\n\t\t\r\n@param ANS2\nvalue-answer-p\r\n\t\t\r\n@return non-negative-integerp; the similarity between ANS1 and ANS2 with\r\n0 indicating no similarity and 1 indicating identity")
    public static SubLObject value_answer_similarity(final SubLObject ans1, final SubLObject ans2) {
        assert NIL != value_answer_p(ans1) : "! answer.value_answer_p(ans1) " + ("answer.value_answer_p(ans1) " + "CommonSymbols.NIL != answer.value_answer_p(ans1) ") + ans1;
        assert NIL != value_answer_p(ans2) : "! answer.value_answer_p(ans2) " + ("answer.value_answer_p(ans2) " + "CommonSymbols.NIL != answer.value_answer_p(ans2) ") + ans2;
        return methods.funcall_class_method_with_2_args(VALUE_ANSWER, SIMILARITY, ans1, ans2);
    }

    static private final SubLList $list_alt70 = list(makeString("@return date-p, the publication date of the source on which this answer depends.\n   @owner bertolo"), list(makeSymbol("PWHEN"), list(makeSymbol("ABSTRACT-PASSAGE-P"), makeSymbol("JUSTIFICATION")), list(RET, list(makeSymbol("FIM"), makeSymbol("JUSTIFICATION"), list(QUOTE, makeSymbol("GET-PUBLICATION-DATE"))))));

    /**
     *
     *
     * @param STRING;
    stringp
     * 		
     * @return stringp
    Heuristically computes an appropriate string that would make a complete sentence when
    joining something intended to be a grammatical subject with STRING.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param STRING;\nstringp\r\n\t\t\r\n@return stringp\r\nHeuristically computes an appropriate string that would make a complete sentence when\r\njoining something intended to be a grammatical subject with STRING.\r\n@unknown bertolo")
    public static final SubLObject find_subject_agreement_alt(SubLObject string) {
        SubLTrampolineFile.checkType(string, STRINGP);
        {
            SubLObject v_parser = methods.funcall_class_method_with_0_args(STANFORD_PARSER, GET_PARSER);
            SubLObject parse = methods.funcall_instance_method_with_1_args(v_parser, PARSE, string);
            if (!$NP.eql(methods.funcall_instance_method_with_0_args(parse, GET_CATEGORY))) {
                return string_utilities.$empty_string$.getGlobalValue();
            }
            {
                SubLObject head = methods.funcall_instance_method_with_0_args(parse, GET_HEAD);
                SubLObject category = methods.funcall_instance_method_with_0_args(head, GET_CATEGORY);
                if (category.eql($NNS)) {
                    return $$$are;
                }
                return $$$is;
            }
        }
    }

    /**
     *
     *
     * @param STRING;
    stringp
     * 		
     * @return stringp
    Heuristically computes an appropriate string that would make a complete sentence when
    joining something intended to be a grammatical subject with STRING.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param STRING;\nstringp\r\n\t\t\r\n@return stringp\r\nHeuristically computes an appropriate string that would make a complete sentence when\r\njoining something intended to be a grammatical subject with STRING.\r\n@unknown bertolo")
    public static SubLObject find_subject_agreement(final SubLObject string) {
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        final SubLObject v_parser = methods.funcall_class_method_with_0_args(STANFORD_PARSER, GET_PARSER);
        final SubLObject parse = methods.funcall_instance_method_with_1_args(v_parser, PARSE, string);
        if (!$NP.eql(methods.funcall_instance_method_with_0_args(parse, GET_CATEGORY))) {
            return string_utilities.$empty_string$.getGlobalValue();
        }
        final SubLObject head = methods.funcall_instance_method_with_0_args(parse, GET_HEAD);
        final SubLObject category = methods.funcall_instance_method_with_0_args(head, GET_CATEGORY);
        if (category.eql($NNS)) {
            return $$$are;
        }
        return $$$is;
    }

    static private final SubLList $list_alt75 = list(new SubLObject[]{ list(makeSymbol("VECTOR"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PARSE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("AUGMENTATION-TERMS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("REQUIRE-SIMILARITY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("SIMILARITY"), list(makeSymbol("ANS1"), makeSymbol("ANS2")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("TYPICAL-INSTANCE"), list(makeSymbol("ANSWERS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("SELECT"), list(makeSymbol("ANSWERS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("SIMILARITY-FUNCTION"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VECTOR"), NIL, makeKeyword("PROTECTED")) });

    public static SubLObject declare_answer_file() {
        declareFunction("get_answer_info", "GET-ANSWER-INFO", 1, 0, false);
        declareFunction("set_answer_info", "SET-ANSWER-INFO", 2, 0, false);
        declareFunction("get_answer_justification", "GET-ANSWER-JUSTIFICATION", 1, 0, false);
        declareFunction("set_answer_justification", "SET-ANSWER-JUSTIFICATION", 2, 0, false);
        declareFunction("get_answer_relevance", "GET-ANSWER-RELEVANCE", 1, 0, false);
        declareFunction("set_answer_relevance", "SET-ANSWER-RELEVANCE", 2, 0, false);
        declareFunction("get_answer_confidence", "GET-ANSWER-CONFIDENCE", 1, 0, false);
        declareFunction("set_answer_confidence", "SET-ANSWER-CONFIDENCE", 2, 0, false);
        declareFunction("get_answer_content", "GET-ANSWER-CONTENT", 1, 0, false);
        declareFunction("set_answer_content", "SET-ANSWER-CONTENT", 2, 0, false);
        declareFunction("get_answer_info_request", "GET-ANSWER-INFO-REQUEST", 1, 0, false);
        declareFunction("set_answer_info_request", "SET-ANSWER-INFO-REQUEST", 2, 0, false);
        declareFunction("subloop_reserved_initialize_answer_class", "SUBLOOP-RESERVED-INITIALIZE-ANSWER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_answer_instance", "SUBLOOP-RESERVED-INITIALIZE-ANSWER-INSTANCE", 1, 0, false);
        declareFunction("answer_p", "ANSWER-P", 1, 0, false);
        declareFunction("answer_max_instances_method", "ANSWER-MAX-INSTANCES-METHOD", 2, 0, false);
        declareFunction("answer_print_method", "ANSWER-PRINT-METHOD", 3, 0, false);
        declareFunction("answer_get_info_request_method", "ANSWER-GET-INFO-REQUEST-METHOD", 1, 0, false);
        declareFunction("answer_get_content_method", "ANSWER-GET-CONTENT-METHOD", 1, 0, false);
        declareFunction("answer_get_confidence_method", "ANSWER-GET-CONFIDENCE-METHOD", 1, 0, false);
        declareFunction("answer_get_relevance_method", "ANSWER-GET-RELEVANCE-METHOD", 1, 0, false);
        declareFunction("answer_justify_method", "ANSWER-JUSTIFY-METHOD", 1, 0, false);
        declareFunction("answer_get_info_method", "ANSWER-GET-INFO-METHOD", 1, 0, false);
        declareFunction("answer_get_parse_tree_method", "ANSWER-GET-PARSE-TREE-METHOD", 1, 0, false);
        declareFunction("answer_natural_language_factoid_method", "ANSWER-NATURAL-LANGUAGE-FACTOID-METHOD", 1, 0, false);
        declareFunction("answer_older_method", "ANSWER-OLDER-METHOD", 2, 0, false);
        declareFunction("answer_get_date_method", "ANSWER-GET-DATE-METHOD", 1, 0, false);
        declareFunction("get_text_answer_augmentation_terms", "GET-TEXT-ANSWER-AUGMENTATION-TERMS", 1, 0, false);
        declareFunction("set_text_answer_augmentation_terms", "SET-TEXT-ANSWER-AUGMENTATION-TERMS", 2, 0, false);
        declareFunction("get_text_answer_parse", "GET-TEXT-ANSWER-PARSE", 1, 0, false);
        declareFunction("set_text_answer_parse", "SET-TEXT-ANSWER-PARSE", 2, 0, false);
        declareFunction("get_text_answer_vector", "GET-TEXT-ANSWER-VECTOR", 1, 0, false);
        declareFunction("set_text_answer_vector", "SET-TEXT-ANSWER-VECTOR", 2, 0, false);
        declareFunction("subloop_reserved_initialize_text_answer_class", "SUBLOOP-RESERVED-INITIALIZE-TEXT-ANSWER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_text_answer_instance", "SUBLOOP-RESERVED-INITIALIZE-TEXT-ANSWER-INSTANCE", 1, 0, false);
        declareFunction("text_answer_p", "TEXT-ANSWER-P", 1, 0, false);
        declareFunction("new_text_answer", "NEW-TEXT-ANSWER", 4, 1, false);
        declareFunction("text_answer_similarity_function_method", "TEXT-ANSWER-SIMILARITY-FUNCTION-METHOD", 1, 0, false);
        declareFunction("text_answer_require_similarity_method", "TEXT-ANSWER-REQUIRE-SIMILARITY-METHOD", 1, 0, false);
        declareFunction("text_answer_typical_instance_method", "TEXT-ANSWER-TYPICAL-INSTANCE-METHOD", 2, 0, false);
        declareFunction("text_answer_select_method", "TEXT-ANSWER-SELECT-METHOD", 2, 0, false);
        declareFunction("text_answer_better", "TEXT-ANSWER-BETTER", 2, 0, false);
        declareFunction("text_answer_set_confidence", "TEXT-ANSWER-SET-CONFIDENCE", 1, 0, false);
        declareFunction("text_answer_get_vector_method", "TEXT-ANSWER-GET-VECTOR-METHOD", 1, 0, false);
        declareFunction("text_answer_similarity_method", "TEXT-ANSWER-SIMILARITY-METHOD", 3, 0, false);
        declareFunction("get_value_answer_interpreted_values", "GET-VALUE-ANSWER-INTERPRETED-VALUES", 1, 0, false);
        declareFunction("set_value_answer_interpreted_values", "SET-VALUE-ANSWER-INTERPRETED-VALUES", 2, 0, false);
        declareFunction("subloop_reserved_initialize_value_answer_class", "SUBLOOP-RESERVED-INITIALIZE-VALUE-ANSWER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_value_answer_instance", "SUBLOOP-RESERVED-INITIALIZE-VALUE-ANSWER-INSTANCE", 1, 0, false);
        declareFunction("value_answer_p", "VALUE-ANSWER-P", 1, 0, false);
        declareFunction("new_value_answer", "NEW-VALUE-ANSWER", 4, 1, false);
        declareFunction("value_answer_similarity_function_method", "VALUE-ANSWER-SIMILARITY-FUNCTION-METHOD", 1, 0, false);
        declareFunction("value_answer_get_interpreted_values_method", "VALUE-ANSWER-GET-INTERPRETED-VALUES-METHOD", 1, 0, false);
        declareFunction("value_answer_similarity_method", "VALUE-ANSWER-SIMILARITY-METHOD", 3, 0, false);
        declareFunction("value_answer_typical_instance_method", "VALUE-ANSWER-TYPICAL-INSTANCE-METHOD", 2, 0, false);
        declareFunction("amount_similarity", "AMOUNT-SIMILARITY", 2, 0, false);
        declareFunction("subloop_reserved_initialize_sentence_answer_class", "SUBLOOP-RESERVED-INITIALIZE-SENTENCE-ANSWER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_sentence_answer_instance", "SUBLOOP-RESERVED-INITIALIZE-SENTENCE-ANSWER-INSTANCE", 1, 0, false);
        declareFunction("sentence_answer_p", "SENTENCE-ANSWER-P", 1, 0, false);
        declareFunction("new_sentence_answer", "NEW-SENTENCE-ANSWER", 3, 0, false);
        declareFunction("sentence_answer_require_similarity_method", "SENTENCE-ANSWER-REQUIRE-SIMILARITY-METHOD", 1, 0, false);
        declareFunction("sentence_answer_typical_instance_method", "SENTENCE-ANSWER-TYPICAL-INSTANCE-METHOD", 2, 0, false);
        declareFunction("sentence_answer_print_method", "SENTENCE-ANSWER-PRINT-METHOD", 3, 0, false);
        declareFunction("text_answer_similarity", "TEXT-ANSWER-SIMILARITY", 2, 0, false);
        declareFunction("value_answer_similarity", "VALUE-ANSWER-SIMILARITY", 2, 0, false);
        declareFunction("find_subject_agreement", "FIND-SUBJECT-AGREEMENT", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt85 = list(list(RET, list(QUOTE, makeSymbol("TEXT-ANSWER-SIMILARITY"))));

    static private final SubLList $list_alt89 = list(makeString("@return positive-number-p; a value between 0 and 1 that specifies a minimal \n   similarity that is required for two answers to end up in the same cluster\n   during answer clustering. A low number implies few clusters, a high number\n   many clusters"), list(RET, makeDouble(0.3)));

    static private final SubLList $list_alt93 = list(makeString("@param ANSWERS listp\n    @return answer-p; the most typical answer among ANSWERS"), list(makeSymbol("CHECK-TYPE"), makeSymbol("ANSWERS"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("TYPICAL"), list(makeSymbol("FIRST"), makeSymbol("ANSWERS"))), list(makeSymbol("CENTROID"), list(makeSymbol("SVECTOR-CENTROID"), list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("GET-TEXT-ANSWER-VECTOR")), makeSymbol("ANSWERS")))), list(makeSymbol("CENTROID-LENGTH"), list(makeSymbol("SVECTOR-LENGTH"), makeSymbol("CENTROID")))), list(makeSymbol("PUNLESS"), list(makeSymbol("ZEROP"), makeSymbol("CENTROID-LENGTH")), list(makeSymbol("CLET"), list(list(makeSymbol("TYPICAL-VECTOR"), list(makeSymbol("GET-TEXT-ANSWER-VECTOR"), makeSymbol("TYPICAL"))), list(makeSymbol("MIN-DISTANCE"), list(makeSymbol("SAFE-SVECTOR-COSINE-ANGLE"), makeSymbol("TYPICAL-VECTOR"), makeSymbol("CENTROID"))), makeSymbol("DISTANCE")), list(makeSymbol("CDOLIST"), list(makeSymbol("ANSWER"), makeSymbol("ANSWERS")), list(makeSymbol("CLET"), list(list(makeSymbol("ANSWER-VECTOR"), list(makeSymbol("GET-TEXT-ANSWER-VECTOR"), makeSymbol("ANSWER")))), list(makeSymbol("CSETQ"), makeSymbol("DISTANCE"), list(makeSymbol("SAFE-SVECTOR-COSINE-ANGLE"), makeSymbol("ANSWER-VECTOR"), makeSymbol("CENTROID"))), list(makeSymbol("PWHEN"), list(makeSymbol(">"), makeSymbol("DISTANCE"), makeSymbol("MIN-DISTANCE")), list(makeSymbol("CSETQ"), makeSymbol("MIN-DISTANCE"), makeSymbol("DISTANCE")), list(makeSymbol("CSETQ"), makeSymbol("TYPICAL"), makeSymbol("ANSWER"))))))), list(RET, makeSymbol("TYPICAL"))));

    static private final SubLList $list_alt97 = list(makeString("@param ANSWERS listp;\n     @return listp; the list of conses of the most salient answers among ANSWERS \n     and their confidences, ranked by their salientness"), list(makeSymbol("CHECK-TYPE"), makeSymbol("ANSWERS"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("REQUIRE-PERCENTAGE"), list(makeSymbol("FCM"), list(makeSymbol("FIM"), list(makeSymbol("FIRST"), makeSymbol("ANSWERS")), list(QUOTE, makeSymbol("GET-INFO-REQUEST"))), list(QUOTE, makeSymbol("REQUIRE-PERCENTAGE")))), list(makeSymbol("REQUIRE-SIMILARITY"), list(makeSymbol("FCM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("REQUIRE-SIMILARITY")))), list(makeSymbol("TYPICALS"), NIL), list(makeSymbol("TOTAL-CONFIDENCE"), ZERO_INTEGER), list(makeSymbol("SELECTED"), NIL), list(makeSymbol("SIMILARITY-FUNCTION"), list(makeSymbol("FWHEN"), makeSymbol("ANSWERS"), list(makeSymbol("FCM"), list(makeSymbol("FIRST"), makeSymbol("ANSWERS")), list(QUOTE, makeSymbol("SIMILARITY-FUNCTION")))))), list(makeSymbol("CDOLIST"), list(makeSymbol("CLUSTER"), list(makeSymbol("CLUSTER"), makeSymbol("ANSWERS"), makeSymbol("SIMILARITY-FUNCTION"), ONE_INTEGER, makeSymbol("REQUIRE-SIMILARITY"))), list(makeSymbol("CLET"), list(list(makeSymbol("ANSWER"), list(makeSymbol("FCM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("TYPICAL-INSTANCE")), list(makeSymbol("FCM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("MAX-INSTANCES")), list(makeSymbol("CLUSTER-ELEMENTS"), makeSymbol("CLUSTER")))))), list(makeSymbol("SET-ANSWER-RELEVANCE"), makeSymbol("ANSWER"), list(makeSymbol("CLUSTER-CARDINALITY"), makeSymbol("CLUSTER"))), list(makeSymbol("CPUSH"), makeSymbol("ANSWER"), makeSymbol("TYPICALS")), list(makeSymbol("CINC"), makeSymbol("TOTAL-CONFIDENCE"), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(QUOTE, makeSymbol("GET-CONFIDENCE")))))), list(makeSymbol("CLET"), list(list(makeSymbol("STOP-AFTER-CONFIDENCE"), list(makeSymbol("*"), list(makeSymbol("/"), makeSymbol("TOTAL-CONFIDENCE"), makeInteger(100)), makeSymbol("REQUIRE-PERCENTAGE"))), list(makeSymbol("SOFAR-CONFIDENCE"), ZERO_INTEGER), list(makeSymbol("STOP?"), list(makeSymbol(">="), makeSymbol("SOFAR-CONFIDENCE"), makeSymbol("STOP-AFTER-CONFIDENCE")))), list(makeSymbol("CSOME"), list(makeSymbol("ANSWER"), list(makeSymbol("SORT"), makeSymbol("TYPICALS"), list(QUOTE, makeSymbol("TEXT-ANSWER-BETTER"))), makeSymbol("STOP?")), list(makeSymbol("CPUSH"), makeSymbol("ANSWER"), makeSymbol("SELECTED")), list(makeSymbol("CINC"), makeSymbol("SOFAR-CONFIDENCE"), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(QUOTE, makeSymbol("GET-CONFIDENCE")))), list(makeSymbol("CSETQ"), makeSymbol("STOP?"), list(makeSymbol(">="), makeSymbol("SOFAR-CONFIDENCE"), makeSymbol("STOP-AFTER-CONFIDENCE"))))), list(RET, list(makeSymbol("NREVERSE"), makeSymbol("SELECTED")))));

    public static SubLObject init_answer_file() {
        return NIL;
    }

    public static SubLObject setup_answer_file() {
        classes.subloop_new_class(ANSWER, OBJECT, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(ANSWER, NIL);
        classes.subloop_note_class_initialization_function(ANSWER, SUBLOOP_RESERVED_INITIALIZE_ANSWER_CLASS);
        classes.subloop_note_instance_initialization_function(ANSWER, SUBLOOP_RESERVED_INITIALIZE_ANSWER_INSTANCE);
        subloop_reserved_initialize_answer_class(ANSWER);
        methods.methods_incorporate_class_method(MAX_INSTANCES, ANSWER, $list15, $list16, $list17);
        methods.subloop_register_class_method(ANSWER, MAX_INSTANCES, ANSWER_MAX_INSTANCES_METHOD);
        methods.methods_incorporate_instance_method(PRINT, ANSWER, $list22, $list23, $list24);
        methods.subloop_register_instance_method(ANSWER, PRINT, ANSWER_PRINT_METHOD);
        methods.methods_incorporate_instance_method(GET_INFO_REQUEST, ANSWER, $list15, NIL, $list31);
        methods.subloop_register_instance_method(ANSWER, GET_INFO_REQUEST, ANSWER_GET_INFO_REQUEST_METHOD);
        methods.methods_incorporate_instance_method(GET_CONTENT, ANSWER, $list15, NIL, $list35);
        methods.subloop_register_instance_method(ANSWER, GET_CONTENT, ANSWER_GET_CONTENT_METHOD);
        methods.methods_incorporate_instance_method(GET_CONFIDENCE, ANSWER, $list15, NIL, $list38);
        methods.subloop_register_instance_method(ANSWER, GET_CONFIDENCE, ANSWER_GET_CONFIDENCE_METHOD);
        methods.methods_incorporate_instance_method(GET_RELEVANCE, ANSWER, $list15, NIL, $list42);
        methods.subloop_register_instance_method(ANSWER, GET_RELEVANCE, ANSWER_GET_RELEVANCE_METHOD);
        methods.methods_incorporate_instance_method(JUSTIFY, ANSWER, $list15, NIL, $list46);
        methods.subloop_register_instance_method(ANSWER, JUSTIFY, ANSWER_JUSTIFY_METHOD);
        methods.methods_incorporate_instance_method(GET_INFO, ANSWER, $list15, NIL, $list50);
        methods.subloop_register_instance_method(ANSWER, GET_INFO, ANSWER_GET_INFO_METHOD);
        methods.methods_incorporate_instance_method(GET_PARSE_TREE, ANSWER, $list15, NIL, $list54);
        methods.subloop_register_instance_method(ANSWER, GET_PARSE_TREE, ANSWER_GET_PARSE_TREE_METHOD);
        methods.methods_incorporate_instance_method(NATURAL_LANGUAGE_FACTOID, ANSWER, $list15, NIL, $list59);
        methods.subloop_register_instance_method(ANSWER, NATURAL_LANGUAGE_FACTOID, ANSWER_NATURAL_LANGUAGE_FACTOID_METHOD);
        methods.methods_incorporate_instance_method(OLDER, ANSWER, $list15, $list65, $list66);
        methods.subloop_register_instance_method(ANSWER, OLDER, ANSWER_OLDER_METHOD);
        methods.methods_incorporate_instance_method(GET_DATE, ANSWER, $list15, NIL, $list70);
        methods.subloop_register_instance_method(ANSWER, GET_DATE, ANSWER_GET_DATE_METHOD);
        classes.subloop_new_class(TEXT_ANSWER, ANSWER, NIL, NIL, $list75);
        classes.class_set_implements_slot_listeners(TEXT_ANSWER, NIL);
        classes.subloop_note_class_initialization_function(TEXT_ANSWER, SUBLOOP_RESERVED_INITIALIZE_TEXT_ANSWER_CLASS);
        classes.subloop_note_instance_initialization_function(TEXT_ANSWER, SUBLOOP_RESERVED_INITIALIZE_TEXT_ANSWER_INSTANCE);
        subloop_reserved_initialize_text_answer_class(TEXT_ANSWER);
        methods.methods_incorporate_class_method(SIMILARITY_FUNCTION, TEXT_ANSWER, $list22, NIL, $list85);
        methods.subloop_register_class_method(TEXT_ANSWER, SIMILARITY_FUNCTION, TEXT_ANSWER_SIMILARITY_FUNCTION_METHOD);
        methods.methods_incorporate_class_method(REQUIRE_SIMILARITY, TEXT_ANSWER, $list22, NIL, $list89);
        methods.subloop_register_class_method(TEXT_ANSWER, REQUIRE_SIMILARITY, TEXT_ANSWER_REQUIRE_SIMILARITY_METHOD);
        methods.methods_incorporate_class_method(TYPICAL_INSTANCE, TEXT_ANSWER, $list15, $list16, $list93);
        methods.subloop_register_class_method(TEXT_ANSWER, TYPICAL_INSTANCE, TEXT_ANSWER_TYPICAL_INSTANCE_METHOD);
        methods.methods_incorporate_class_method(SELECT, TEXT_ANSWER, $list15, $list16, $list97);
        methods.subloop_register_class_method(TEXT_ANSWER, SELECT, TEXT_ANSWER_SELECT_METHOD);
        methods.methods_incorporate_instance_method(GET_VECTOR, TEXT_ANSWER, $list22, NIL, $list104);
        methods.subloop_register_instance_method(TEXT_ANSWER, GET_VECTOR, TEXT_ANSWER_GET_VECTOR_METHOD);
        methods.methods_incorporate_class_method(SIMILARITY, TEXT_ANSWER, $list15, $list108, $list109);
        methods.subloop_register_class_method(TEXT_ANSWER, SIMILARITY, TEXT_ANSWER_SIMILARITY_METHOD);
        classes.subloop_new_class(VALUE_ANSWER, TEXT_ANSWER, NIL, NIL, $list113);
        classes.class_set_implements_slot_listeners(VALUE_ANSWER, NIL);
        classes.subloop_note_class_initialization_function(VALUE_ANSWER, SUBLOOP_RESERVED_INITIALIZE_VALUE_ANSWER_CLASS);
        classes.subloop_note_instance_initialization_function(VALUE_ANSWER, SUBLOOP_RESERVED_INITIALIZE_VALUE_ANSWER_INSTANCE);
        subloop_reserved_initialize_value_answer_class(VALUE_ANSWER);
        methods.methods_incorporate_class_method(SIMILARITY_FUNCTION, VALUE_ANSWER, $list22, NIL, $list123);
        methods.subloop_register_class_method(VALUE_ANSWER, SIMILARITY_FUNCTION, VALUE_ANSWER_SIMILARITY_FUNCTION_METHOD);
        methods.methods_incorporate_instance_method(GET_INTERPRETED_VALUES, VALUE_ANSWER, $list15, NIL, $list127);
        methods.subloop_register_instance_method(VALUE_ANSWER, GET_INTERPRETED_VALUES, VALUE_ANSWER_GET_INTERPRETED_VALUES_METHOD);
        methods.methods_incorporate_class_method(SIMILARITY, VALUE_ANSWER, $list15, $list108, $list130);
        methods.subloop_register_class_method(VALUE_ANSWER, SIMILARITY, VALUE_ANSWER_SIMILARITY_METHOD);
        methods.methods_incorporate_class_method(TYPICAL_INSTANCE, VALUE_ANSWER, $list15, $list16, $list133);
        methods.subloop_register_class_method(VALUE_ANSWER, TYPICAL_INSTANCE, VALUE_ANSWER_TYPICAL_INSTANCE_METHOD);
        classes.subloop_new_class(SENTENCE_ANSWER, TEXT_ANSWER, NIL, NIL, $list137);
        classes.class_set_implements_slot_listeners(SENTENCE_ANSWER, NIL);
        classes.subloop_note_class_initialization_function(SENTENCE_ANSWER, SUBLOOP_RESERVED_INITIALIZE_SENTENCE_ANSWER_CLASS);
        classes.subloop_note_instance_initialization_function(SENTENCE_ANSWER, SUBLOOP_RESERVED_INITIALIZE_SENTENCE_ANSWER_INSTANCE);
        subloop_reserved_initialize_sentence_answer_class(SENTENCE_ANSWER);
        methods.methods_incorporate_class_method(REQUIRE_SIMILARITY, SENTENCE_ANSWER, $list22, NIL, $list89);
        methods.subloop_register_class_method(SENTENCE_ANSWER, REQUIRE_SIMILARITY, SENTENCE_ANSWER_REQUIRE_SIMILARITY_METHOD);
        methods.methods_incorporate_class_method(TYPICAL_INSTANCE, SENTENCE_ANSWER, $list15, $list16, $list141);
        methods.subloop_register_class_method(SENTENCE_ANSWER, TYPICAL_INSTANCE, SENTENCE_ANSWER_TYPICAL_INSTANCE_METHOD);
        methods.methods_incorporate_instance_method(PRINT, SENTENCE_ANSWER, $list22, $list23, $list143);
        methods.subloop_register_instance_method(SENTENCE_ANSWER, PRINT, SENTENCE_ANSWER_PRINT_METHOD);
        return NIL;
    }

    static private final SubLList $list_alt104 = list(makeString("@return svector-p; the word vector of this answer"), list(RET, makeSymbol("VECTOR")));

    static private final SubLList $list_alt108 = list(makeSymbol("ANS1"), makeSymbol("ANS2"));

    static private final SubLList $list_alt109 = list(makeString("@param ANS1 answer-p\n   @param ANS2 answer-p\n   @return non-negative-integerp; the similarity between ANS1 and ANS2 with\n   0 indicating no similarity and 1 indicating identity"), list(makeSymbol("CHECK-TYPE"), makeSymbol("ANS1"), makeSymbol("TEXT-ANSWER-P")), list(makeSymbol("CHECK-TYPE"), makeSymbol("ANS2"), makeSymbol("TEXT-ANSWER-P")), list(makeSymbol("PWHEN"), list(makeSymbol("STRING="), list(makeSymbol("FIM"), makeSymbol("ANS1"), list(QUOTE, makeSymbol("GET-CONTENT"))), list(makeSymbol("FIM"), makeSymbol("ANS2"), list(QUOTE, makeSymbol("GET-CONTENT")))), list(RET, ONE_INTEGER)), list(RET, list(makeSymbol("SAFE-SVECTOR-COSINE-ANGLE"), list(makeSymbol("FIM"), makeSymbol("ANS1"), list(QUOTE, makeSymbol("GET-VECTOR"))), list(makeSymbol("FIM"), makeSymbol("ANS2"), list(QUOTE, makeSymbol("GET-VECTOR"))))));

    static private final SubLList $list_alt113 = list(list(makeSymbol("PARSE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("INTERPRETED-VALUES"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("SIMILARITY"), list(makeSymbol("ANS1"), makeSymbol("ANS2")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("TYPICAL-INSTANCE"), list(makeSymbol("ANSWERS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("SIMILARITY-FUNCTION"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INTERPRETED-VALUES"), NIL, makeKeyword("PUBLIC")));

    static private final SubLString $str_alt118$_ = makeString(")");

    static private final SubLString $str_alt119$__RRB_ = makeString(" -RRB-");

    static private final SubLString $str_alt120$_ = makeString("(");

    static private final SubLString $str_alt121$_LRB__ = makeString("-LRB- ");

    static private final SubLList $list_alt123 = list(makeString("@return symbolp; the similarity function used to compare value-answers"), list(RET, list(QUOTE, makeSymbol("VALUE-ANSWER-SIMILARITY"))));

    static private final SubLList $list_alt127 = list(list(RET, makeSymbol("INTERPRETED-VALUES")));

    static private final SubLList $list_alt130 = list(makeString("@param ANS1 answer-p\n   @param ANS2 answer-p\n   @return non-negative-integerp; the similarity between ANS1 and ANS2 with\n   0 indicating no similarity and 1 indicating identity"), list(makeSymbol("CHECK-TYPE"), makeSymbol("ANS1"), makeSymbol("VALUE-ANSWER-P")), list(makeSymbol("CHECK-TYPE"), makeSymbol("ANS2"), makeSymbol("VALUE-ANSWER-P")), list(makeSymbol("CLET"), list(list(makeSymbol("MAX"), ZERO_INTEGER)), list(makeSymbol("CDOLIST"), list(makeSymbol("IV1"), list(makeSymbol("FIM"), makeSymbol("ANS1"), list(QUOTE, makeSymbol("GET-INTERPRETED-VALUES")))), list(makeSymbol("CDOLIST"), list(makeSymbol("IV2"), list(makeSymbol("FIM"), makeSymbol("ANS2"), list(QUOTE, makeSymbol("GET-INTERPRETED-VALUES")))), list(makeSymbol("CLET"), list(list(makeSymbol("VALUE"), list(makeSymbol("AMOUNT-SIMILARITY"), makeSymbol("IV1"), makeSymbol("IV2")))), list(makeSymbol("PWHEN"), list(makeSymbol(">"), makeSymbol("VALUE"), makeSymbol("MAX")), list(makeSymbol("CSETQ"), makeSymbol("MAX"), makeSymbol("VALUE")))))), list(RET, makeSymbol("MAX"))));

    static private final SubLList $list_alt133 = list(list(RET, list(makeSymbol("RANDOM-ELEMENT"), makeSymbol("ANSWERS"))));

    static private final SubLList $list_alt137 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("REQUIRE-SIMILARITY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("TYPICAL-INSTANCE"), list(makeSymbol("ANSWERS")), makeKeyword("PUBLIC")));

    static private final SubLList $list_alt141 = list(makeString("@param ANSWERS listp\n   @return answer-p; the most typical answer among ANSWERS"), list(RET, list(makeSymbol("FIRST"), list(makeSymbol("FCM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("MAX-INSTANCES")), makeSymbol("ANSWERS")))));

    @Override
    public void declareFunctions() {
        declare_answer_file();
    }

    @Override
    public void initializeVariables() {
        init_answer_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_answer_file();
    }

    static {
    }

    static private final SubLList $list_alt143 = list(makeString("Prints this answer to STREAM, ignoring DEPTH"), list(makeSymbol("IGNORE"), makeSymbol("DEPTH")), list(makeSymbol("WRITE-STRING"), makeString("#<SENTENCE-ANSWER for "), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), makeSymbol("INFO-REQUEST"), makeSymbol("STREAM")), list(makeSymbol("WRITE-STRING"), makeString(": "), makeSymbol("STREAM")), list(makeSymbol("PRIN1"), makeSymbol("CONTENT"), makeSymbol("STREAM")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString(" (~,2F/~,2F)"), makeSymbol("CONFIDENCE"), makeSymbol("RELEVANCE")), list(RET, makeSymbol("SELF")));

    static private final SubLString $str_alt145$__SENTENCE_ANSWER_for_ = makeString("#<SENTENCE-ANSWER for ");
}

/**
 * Total time: 414 ms
 */
