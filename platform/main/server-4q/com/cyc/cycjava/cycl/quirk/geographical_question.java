package com.cyc.cycjava.cycl.quirk;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.pph_main;
import com.cyc.cycjava.cycl.stacks;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class geographical_question extends SubLTranslatedFile {
    public static final SubLFile me = new geographical_question();

    public static final String myName = "com.cyc.cycjava.cycl.quirk.geographical_question";

    public static final String myFingerPrint = "ab5c5ccc730d12ae3ce821f4d4ce57f5ebcbd4ebd55bc2c85b53ed5128ab076b";

    // Internal Constants
    public static final SubLSymbol GEOGRAPHICAL_QUESTION = makeSymbol("GEOGRAPHICAL-QUESTION");



    public static final SubLList $list2 = list(list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("QUERIFY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-TYPES"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTRACT"), list(makeSymbol("INFO")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTRACT-FROM-PASSAGE"), list(makeSymbol("PASSAGE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTRACT-FROM-ASSIGNMENT"), list(makeSymbol("ASSIGNMENT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTRACT-PP"), list(makeSymbol("TERM"), makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTRACT-APPOSITIVE"), list(makeSymbol("TERM"), makeSymbol("TREE")), makeKeyword("PROTECTED")));





















    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GEOGRAPHICAL_QUESTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GEOGRAPHICAL-QUESTION-CLASS");



















    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_GEOGRAPHICAL_QUESTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-GEOGRAPHICAL-QUESTION-INSTANCE");

    public static final SubLSymbol $sym24$ISA_ = makeSymbol("ISA?");

    public static final SubLList $list25 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list26 = list(makeSymbol("TREE"));

    public static final SubLList $list27 = list(list(makeSymbol("RET"), list(makeSymbol("CAND"), list(makeSymbol("WH-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)), list(makeSymbol("STARTS-WITH-ONE-OF-BY-TEST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), list(makeSymbol("QUOTE"), list(makeString("where"), makeString("whence"), makeString("whither")))), list(makeSymbol("AUX-VERB-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-PREDICATE")))))));





    public static final SubLList $list30 = list(makeString("where"), makeString("whence"), makeString("whither"));



    public static final SubLSymbol $sym32$GEOGRAPHICAL_QUESTION_ISA__METHOD = makeSymbol("GEOGRAPHICAL-QUESTION-ISA?-METHOD");



    public static final SubLList $list34 = list(makeString("@return listp; a list of queries likely to extract passages relevant to answer\n   this question"), list(makeSymbol("CLET"), list(list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT")))), list(makeSymbol("FOCUS"), list(makeSymbol("FWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SUBJECT"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))))), list(makeSymbol("CYCL-QUERY"), list(makeSymbol("FWHEN"), makeSymbol("FOCUS"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("thereExists")), list(makeSymbol("QUOTE"), makeSymbol("?FOCUS")), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("and")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("geographicalSubRegions")), makeSymbol("?WHERE"), makeSymbol("?FOCUS"))), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("placeName-Standard")), list(makeSymbol("QUOTE"), makeSymbol("?FOCUS")), makeSymbol("FOCUS")))))), list(makeSymbol("QUERIES"), list(makeSymbol("FWHEN"), makeSymbol("CYCL-QUERY"), list(makeSymbol("LIST"), list(makeSymbol("NEW-CYCL-QUERY"), makeSymbol("CYCL-QUERY"), list(makeSymbol("LIST"), list(makeSymbol("FIND-NART"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("ContentMtFn")), reader_make_constant_shell(makeString("Nima-Gns-KS"))))))), list(makeSymbol("NEW-CYCL-QUERY"), makeSymbol("CYCL-QUERY"), list(makeSymbol("LIST"), list(makeSymbol("FIND-NART"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("ContentMtFn")), reader_make_constant_shell(makeString("Usgs-KS"))))))))))), list(makeSymbol("PWHEN"), makeSymbol("FOCUS"), list(makeSymbol("CDOLIST"), list(makeSymbol("CORPUS"), makeSymbol("CORPORA")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-GLIMPSE-QUERY"), list(makeSymbol("FORMAT"), NIL, makeString("~a\\, in"), makeSymbol("FOCUS")), makeSymbol("CORPUS")), makeSymbol("QUERIES")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-GLIMPSE-QUERY"), list(makeSymbol("FORMAT"), NIL, makeString("~a\\, near"), makeSymbol("FOCUS")), makeSymbol("CORPUS")), makeSymbol("QUERIES")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-GLIMPSE-QUERY"), list(makeSymbol("FORMAT"), NIL, makeString("~a\\, close to"), makeSymbol("FOCUS")), makeSymbol("CORPUS")), makeSymbol("QUERIES")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-GLIMPSE-QUERY"), list(makeSymbol("FORMAT"), NIL, makeString("~a in"), makeSymbol("FOCUS")), makeSymbol("CORPUS")), makeSymbol("QUERIES")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-GLIMPSE-QUERY"), list(makeSymbol("FORMAT"), NIL, makeString("~a near "), makeSymbol("FOCUS")), makeSymbol("CORPUS")), makeSymbol("QUERIES")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-GLIMPSE-QUERY"), list(makeSymbol("FORMAT"), NIL, makeString("~a\\, #\\, "), makeSymbol("FOCUS")), makeSymbol("CORPUS")), makeSymbol("QUERIES")))), list(makeSymbol("RET"), list(makeSymbol("NREVERSE"), makeSymbol("QUERIES")))));

    public static final SubLSymbol $sym35$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GEOGRAPHICAL-QUESTION-METHOD");



    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    public static final SubLSymbol $sym38$_FOCUS = makeSymbol("?FOCUS");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    public static final SubLList $list40 = list(reader_make_constant_shell(makeString("geographicalSubRegions")), makeSymbol("?WHERE"), makeSymbol("?FOCUS"));

    private static final SubLObject $$placeName_Standard = reader_make_constant_shell(makeString("placeName-Standard"));

    public static final SubLList $list42 = list(reader_make_constant_shell(makeString("ContentMtFn")), reader_make_constant_shell(makeString("Nima-Gns-KS")));

    public static final SubLList $list43 = list(reader_make_constant_shell(makeString("ContentMtFn")), reader_make_constant_shell(makeString("Usgs-KS")));

    public static final SubLString $str44$_a___in = makeString("~a\\, in");

    public static final SubLString $str45$_a___near = makeString("~a\\, near");

    public static final SubLString $str46$_a___close_to = makeString("~a\\, close to");

    public static final SubLString $str47$_a_in = makeString("~a in");

    public static final SubLString $str48$_a_near_ = makeString("~a near ");

    public static final SubLString $str49$_a_______ = makeString("~a\\, #\\, ");

    public static final SubLSymbol GEOGRAPHICAL_QUESTION_QUERIFY_METHOD = makeSymbol("GEOGRAPHICAL-QUESTION-QUERIFY-METHOD");

    public static final SubLList $list51 = list(makeString("@return list; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction"), list(makeSymbol("RET"), list(makeSymbol("LIST"), list(makeSymbol("LIST"), reader_make_constant_shell(makeString("Place"))))));

    private static final SubLObject $$Place = reader_make_constant_shell(makeString("Place"));

    public static final SubLSymbol GEOGRAPHICAL_QUESTION_ANSWER_TYPES_METHOD = makeSymbol("GEOGRAPHICAL-QUESTION-ANSWER-TYPES-METHOD");



    public static final SubLList $list55 = list(makeString("@return positive-integer-p; the number of answers expected for this question"), list(makeSymbol("RET"), makeInteger(1000)));



    public static final SubLSymbol GEOGRAPHICAL_QUESTION_ANSWER_CARDINALITY_METHOD = makeSymbol("GEOGRAPHICAL-QUESTION-ANSWER-CARDINALITY-METHOD");



    public static final SubLList $list59 = list(makeSymbol("INFO"));

    public static final SubLList $list60 = list(makeString("@return listp; a list of answers to this question from INFO\n   @note instead of an explicit fcond, dispatching using OO methods would be nice"), list(makeSymbol("CHECK-TYPE"), makeSymbol("INFO"), makeSymbol("INFORMATION-P")), list(makeSymbol("RET"), list(makeSymbol("FCOND"), list(list(makeSymbol("ABSTRACT-PASSAGE-P"), makeSymbol("INFO")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("EXTRACT-FROM-PASSAGE")), makeSymbol("INFO"))), list(list(makeSymbol("VAR-ASSIGNMENT-P"), makeSymbol("INFO")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("EXTRACT-FROM-ASSIGNMENT")), makeSymbol("INFO"))), list(T, NIL))));

    public static final SubLSymbol INFORMATION_P = makeSymbol("INFORMATION-P");

    public static final SubLSymbol EXTRACT_FROM_PASSAGE = makeSymbol("EXTRACT-FROM-PASSAGE");

    public static final SubLSymbol EXTRACT_FROM_ASSIGNMENT = makeSymbol("EXTRACT-FROM-ASSIGNMENT");

    public static final SubLSymbol GEOGRAPHICAL_QUESTION_EXTRACT_METHOD = makeSymbol("GEOGRAPHICAL-QUESTION-EXTRACT-METHOD");

    public static final SubLList $list65 = list(makeSymbol("ASSIGNMENT"));

    public static final SubLList $list66 = list(makeString("@return listp; a list of answers to this question from ASSIGNMENT"), list(makeSymbol("CLET"), list(list(makeSymbol("VAR.BINDING"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("ASSIGNMENT"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTENT")))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("VAR.BINDING"), list(makeSymbol("CNOT"), list(EQL, list(makeSymbol("CDR"), makeSymbol("VAR.BINDING")), reader_make_constant_shell(makeString("PlanetEarth"))))), list(makeSymbol("RET"), list(makeSymbol("LIST"), list(makeSymbol("NEW-TEXT-ANSWER"), makeSymbol("SELF"), list(makeSymbol("CCONCATENATE"), makeString("in "), list(makeSymbol("GENERATE-PHRASE"), list(makeSymbol("CDR"), makeSymbol("VAR.BINDING")))), makeSymbol("ASSIGNMENT"), makeSymbol("MAX-CONFIDENCE")))))));

    public static final SubLSymbol $sym67$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GEOGRAPHICAL-QUESTION-METHOD");



    private static final SubLObject $$PlanetEarth = reader_make_constant_shell(makeString("PlanetEarth"));

    public static final SubLString $$$in_ = makeString("in ");

    public static final SubLSymbol GEOGRAPHICAL_QUESTION_EXTRACT_FROM_ASSIGNMENT_METHOD = makeSymbol("GEOGRAPHICAL-QUESTION-EXTRACT-FROM-ASSIGNMENT-METHOD");

    public static final SubLList $list72 = list(makeSymbol("PASSAGE"));

    public static final SubLList $list73 = list(makeString("@return listp; a list of answers to this question from PASSAGE"), list(makeSymbol("CHECK-TYPE"), makeSymbol("PASSAGE"), makeSymbol("ABSTRACT-PASSAGE-P")), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(makeSymbol("QUOTE"), makeSymbol("LEARN")), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTENT")))), list(makeSymbol("CLET"), list(list(makeSymbol("TREE"), list(makeSymbol("FIM"), makeSymbol("PARSER"), list(makeSymbol("QUOTE"), makeSymbol("PARSE")), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTENT"))))), list(makeSymbol("LEXIFIED"), list(makeSymbol("FWHEN"), makeSymbol("TREE"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("LEXIFY")), makeSymbol("LEXICON")))), list(makeSymbol("FOCUS"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT"))), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING")))), list(makeSymbol("ANSWERS"), NIL), list(makeSymbol("EXTRACTORS"), list(makeSymbol("QUOTE"), list(makeSymbol("EXTRACT-COMMA-PP"), makeSymbol("EXTRACT-NONCOMMA-PP"), makeSymbol("EXTRACT-APPOSITIVE"))))), list(makeSymbol("PWHEN"), list(makeSymbol("PARSE-TREE-P"), makeSymbol("LEXIFIED")), list(makeSymbol("DO-PARSE-TREE-SUBTREES"), list(makeSymbol("SUB"), makeSymbol("LEXIFIED"), makeSymbol("ANSWERS")), list(makeSymbol("PWHEN"), list(makeSymbol("PHRASE-TREE-P"), makeSymbol("SUB")), list(makeSymbol("CSOME"), list(makeSymbol("EXTRACTOR"), makeSymbol("EXTRACTORS"), makeSymbol("ANSWERS")), list(makeSymbol("CLET"), list(list(makeSymbol("ANSWER"), list(makeSymbol("FIM"), makeSymbol("SELF"), makeSymbol("EXTRACTOR"), makeSymbol("FOCUS"), makeSymbol("SUB")))), list(makeSymbol("PWHEN"), makeSymbol("ANSWER"), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-TEXT-ANSWER"), makeSymbol("SELF"), list(makeSymbol("FIM"), makeSymbol("ANSWER"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), makeSymbol("PASSAGE"), makeSymbol("MAX-CONFIDENCE")), makeSymbol("ANSWERS")))))))), list(makeSymbol("RET"), makeSymbol("ANSWERS"))));

    public static final SubLSymbol $sym74$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-GEOGRAPHICAL-QUESTION-METHOD");







    public static final SubLList $list78 = list(makeSymbol("EXTRACT-COMMA-PP"), makeSymbol("EXTRACT-NONCOMMA-PP"), makeSymbol("EXTRACT-APPOSITIVE"));





    public static final SubLString $str81$_S_is_not_one_of__S = makeString("~S is not one of ~S");

    public static final SubLSymbol GEOGRAPHICAL_QUESTION_EXTRACT_FROM_PASSAGE_METHOD = makeSymbol("GEOGRAPHICAL-QUESTION-EXTRACT-FROM-PASSAGE-METHOD");

    public static final SubLSymbol EXTRACT_COMMA_PP = makeSymbol("EXTRACT-COMMA-PP");

    public static final SubLList $list84 = list(makeSymbol("TERM"), makeSymbol("TREE"));

    public static final SubLList $list85 = list(makeString("@return pp-tree-p or nil; the pp tree in phrases like 'Guam, in the Pacific, ...'"), list(makeSymbol("PWHEN"), list(new SubLObject[]{ makeSymbol("CAND"), list(makeSymbol("ENDS-WITH"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), makeSymbol("TERM")), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SISTER")), ONE_INTEGER), list(EQ, list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SISTER")), ONE_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword(",")), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SISTER")), TWO_INTEGER), list(makeSymbol("PP-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SISTER")), TWO_INTEGER)), list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SISTER")), TWO_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), list(makeSymbol("QUOTE"), list(makeString("in"), makeString("near"), makeString("on"), makeString("close to"))), list(makeSymbol("QUOTE"), EQUAL)), list(makeSymbol("FIM"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SISTER")), TWO_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-COMPLEMENTS")))), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("CANDIDATE-ANSWER-P")), list(makeSymbol("FIM"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SISTER")), TWO_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-COMPLEMENTS")))), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD")))) }), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SISTER")), TWO_INTEGER))));





    private static final SubLSymbol $kw88$_ = makeKeyword(",");



    public static final SubLList $list90 = list(makeString("in"), makeString("near"), makeString("on"), makeString("close to"));





    public static final SubLSymbol GEOGRAPHICAL_QUESTION_EXTRACT_COMMA_PP_METHOD = makeSymbol("GEOGRAPHICAL-QUESTION-EXTRACT-COMMA-PP-METHOD");

    public static final SubLSymbol EXTRACT_NONCOMMA_PP = makeSymbol("EXTRACT-NONCOMMA-PP");

    public static final SubLList $list95 = list(makeString("@return pp-tree-p or nil; the pp tree in phrases like 'Guam in the Pacific, ...'"), list(makeSymbol("PWHEN"), list(new SubLObject[]{ makeSymbol("CAND"), list(makeSymbol("ENDS-WITH"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), makeSymbol("TERM")), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SISTER")), ONE_INTEGER), list(makeSymbol("PP-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SISTER")), ONE_INTEGER)), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SISTER")), ONE_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))), list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SISTER")), ONE_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), list(makeSymbol("QUOTE"), list(makeString("in"), makeString("near"), makeString("close to"))), list(makeSymbol("QUOTE"), EQUAL)), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SISTER")), ONE_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-COMPLEMENTS")))), list(makeSymbol("FIM"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SISTER")), ONE_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-COMPLEMENTS")))), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("CANDIDATE-ANSWER-P")), list(makeSymbol("FIM"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SISTER")), ONE_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-COMPLEMENTS")))), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD")))) }), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SISTER")), ONE_INTEGER))));

    public static final SubLList $list96 = list(makeString("in"), makeString("near"), makeString("close to"));

    public static final SubLSymbol GEOGRAPHICAL_QUESTION_EXTRACT_NONCOMMA_PP_METHOD = makeSymbol("GEOGRAPHICAL-QUESTION-EXTRACT-NONCOMMA-PP-METHOD");

    public static final SubLSymbol EXTRACT_APPOSITIVE = makeSymbol("EXTRACT-APPOSITIVE");

    public static final SubLList $list99 = list(makeString("@return np-tree-p or nil; the np tree in phrases like 'Austin, Texas, ...'"), list(makeSymbol("PWHEN"), list(new SubLObject[]{ makeSymbol("CAND"), list(makeSymbol("NP-TREE-P"), makeSymbol("TREE")), list(makeSymbol(">"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("DAUGHTER-COUNT"))), TWO_INTEGER), list(makeSymbol("<"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("DAUGHTER-COUNT"))), FIVE_INTEGER), list(makeSymbol("NP-TERM-MATCH"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), makeSymbol("TERM")), list(EQ, list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ONE_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword(",")), list(makeSymbol("NOMINAL-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), TWO_INTEGER)), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), TWO_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("CANDIDATE-ANSWER-P")), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), TWO_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD")))) }), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), TWO_INTEGER))));



    public static final SubLSymbol GEOGRAPHICAL_QUESTION_EXTRACT_APPOSITIVE_METHOD = makeSymbol("GEOGRAPHICAL-QUESTION-EXTRACT-APPOSITIVE-METHOD");

    public static SubLObject subloop_reserved_initialize_geographical_question_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, QUESTION, LEXICON, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, PARSER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, TAGGER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, CHUNKER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, MAX_CANDIDATES, TWENTY_INTEGER);
        classes.subloop_initialize_slot(new_instance, QUESTION, MAX_CONFIDENCE, TEN_INTEGER);
        classes.subloop_initialize_slot(new_instance, QUESTION, LEARNABLE_TYPES, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_geographical_question_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, ERROR_HANDLING, NIL);
        classes.subloop_initialize_slot(new_instance, INFORMATION_REQUEST, TIMEOUT, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, STRING, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, PARSE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, ANSWER_TYPES, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, CORPORA, NIL);
        return NIL;
    }

    public static SubLObject geographical_question_p(final SubLObject v_geographical_question) {
        return classes.subloop_instanceof_class(v_geographical_question, GEOGRAPHICAL_QUESTION);
    }

    public static SubLObject geographical_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return makeBoolean(((NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER))) && (NIL != string_utilities.starts_with_one_of_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_STRING), $list30, UNPROVIDED))) && (NIL != word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_0_args(tree, GET_PREDICATE))));
    }

    public static SubLObject geographical_question_querify_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_geographical_question_method = NIL;
        final SubLObject corpora = question.get_question_corpora(self);
        final SubLObject parse = question.get_question_parse(self);
        try {
            thread.throwStack.push($sym35$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD);
            try {
                final SubLObject subject = methods.funcall_instance_method_with_0_args(parse, GET_SUBJECT);
                final SubLObject focus = (NIL != subject) ? methods.funcall_instance_method_with_0_args(subject, GET_STRING) : NIL;
                final SubLObject cycl_query = (NIL != focus) ? list($$thereExists, $sym38$_FOCUS, list($$and, $list40, list($$placeName_Standard, $sym38$_FOCUS, focus))) : NIL;
                SubLObject queries = (NIL != cycl_query) ? list(search_engine.new_cycl_query(cycl_query, list(narts_high.find_nart($list42)), UNPROVIDED), search_engine.new_cycl_query(cycl_query, list(narts_high.find_nart($list43)), UNPROVIDED)) : NIL;
                if (NIL != focus) {
                    SubLObject cdolist_list_var = corpora;
                    SubLObject corpus = NIL;
                    corpus = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        queries = cons(search_engine.new_glimpse_query(format(NIL, $str44$_a___in, focus), corpus), queries);
                        queries = cons(search_engine.new_glimpse_query(format(NIL, $str45$_a___near, focus), corpus), queries);
                        queries = cons(search_engine.new_glimpse_query(format(NIL, $str46$_a___close_to, focus), corpus), queries);
                        queries = cons(search_engine.new_glimpse_query(format(NIL, $str47$_a_in, focus), corpus), queries);
                        queries = cons(search_engine.new_glimpse_query(format(NIL, $str48$_a_near_, focus), corpus), queries);
                        queries = cons(search_engine.new_glimpse_query(format(NIL, $str49$_a_______, focus), corpus), queries);
                        cdolist_list_var = cdolist_list_var.rest();
                        corpus = cdolist_list_var.first();
                    } 
                }
                sublisp_throw($sym35$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD, nreverse(queries));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    question.set_question_corpora(self, corpora);
                    question.set_question_parse(self, parse);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_geographical_question_method = Errors.handleThrowable(ccatch_env_var, $sym35$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_geographical_question_method;
    }

    public static SubLObject geographical_question_answer_types_method(final SubLObject self) {
        return list(list($$Place));
    }

    public static SubLObject geographical_question_answer_cardinality_method(final SubLObject self) {
        return $int$1000;
    }

    public static SubLObject geographical_question_extract_method(final SubLObject self, final SubLObject info) {
        assert NIL != search_engine.information_p(info) : "search_engine.information_p(info) " + "CommonSymbols.NIL != search_engine.information_p(info) " + info;
        return NIL != search_engine.abstract_passage_p(info) ? methods.funcall_instance_method_with_1_args(self, EXTRACT_FROM_PASSAGE, info) : NIL != search_engine.var_assignment_p(info) ? methods.funcall_instance_method_with_1_args(self, EXTRACT_FROM_ASSIGNMENT, info) : NIL;
    }

    public static SubLObject geographical_question_extract_from_assignment_method(final SubLObject self, final SubLObject assignment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_geographical_question_method = NIL;
        final SubLObject max_confidence = question.get_question_max_confidence(self);
        try {
            thread.throwStack.push($sym67$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD);
            try {
                final SubLObject varXbinding = methods.funcall_instance_method_with_0_args(assignment, GET_CONTENT).first();
                if ((NIL != varXbinding) && (!varXbinding.rest().eql($$PlanetEarth))) {
                    sublisp_throw($sym67$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD, list(answer.new_text_answer(self, cconcatenate($$$in_, pph_main.generate_phrase(varXbinding.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), assignment, max_confidence, UNPROVIDED)));
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    question.set_question_max_confidence(self, max_confidence);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_geographical_question_method = Errors.handleThrowable(ccatch_env_var, $sym67$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_geographical_question_method;
    }

    public static SubLObject geographical_question_extract_from_passage_method(final SubLObject self, final SubLObject passage) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_geographical_question_method = NIL;
        final SubLObject max_confidence = question.get_question_max_confidence(self);
        final SubLObject v_parser = question.get_question_parser(self);
        final SubLObject lexicon = question.get_question_lexicon(self);
        final SubLObject parse = question.get_question_parse(self);
        try {
            thread.throwStack.push($sym74$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD);
            try {
                assert NIL != search_engine.abstract_passage_p(passage) : "search_engine.abstract_passage_p(passage) " + "CommonSymbols.NIL != search_engine.abstract_passage_p(passage) " + passage;
                methods.funcall_instance_method_with_1_args(lexicon, LEARN, methods.funcall_instance_method_with_0_args(passage, GET_CONTENT));
                final SubLObject tree = methods.funcall_instance_method_with_1_args(v_parser, PARSE, methods.funcall_instance_method_with_0_args(passage, GET_CONTENT));
                final SubLObject lexified = (NIL != tree) ? methods.funcall_instance_method_with_1_args(tree, LEXIFY, lexicon) : NIL;
                final SubLObject focus = methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(parse, GET_SUBJECT), GET_STRING);
                SubLObject answers = NIL;
                final SubLObject extractors = $list78;
                if (NIL != parse_tree.parse_tree_p(lexified)) {
                    final SubLObject stack = stacks.create_stack();
                    final SubLObject order_var = $DFR2L;
                    final SubLObject possible_orders = list($DFL2R, $DFR2L);
                    SubLObject sub = NIL;
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.memberP(order_var, possible_orders, symbol_function(EQ), UNPROVIDED))) {
                        Errors.error($str81$_S_is_not_one_of__S, order_var, possible_orders);
                    }
                    stacks.stack_push(lexified, stack);
                    while ((NIL == stacks.stack_empty_p(stack)) && (NIL == answers)) {
                        sub = stacks.stack_pop(stack);
                        if ((NIL != parse_tree.phrase_tree_p(sub)) && (NIL == answers)) {
                            SubLObject csome_list_var = extractors;
                            SubLObject extractor = NIL;
                            extractor = csome_list_var.first();
                            while ((NIL == answers) && (NIL != csome_list_var)) {
                                final SubLObject v_answer = methods.funcall_instance_method_with_2_args(self, extractor, focus, sub);
                                if (NIL != v_answer) {
                                    answers = cons(answer.new_text_answer(self, methods.funcall_instance_method_with_0_args(v_answer, GET_STRING), passage, max_confidence, UNPROVIDED), answers);
                                }
                                csome_list_var = csome_list_var.rest();
                                extractor = csome_list_var.first();
                            } 
                        }
                        if (NIL != parse_tree.phrase_tree_p(sub)) {
                            final SubLObject vector_var = parse_tree.get_phrase_tree_daughters(sub);
                            final SubLObject backwardP_var = eq(order_var, $DFL2R);
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject element_num;
                            SubLObject daughter;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                daughter = aref(vector_var, element_num);
                                stacks.stack_push(daughter, stack);
                            }
                        }
                    } 
                }
                sublisp_throw($sym74$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD, answers);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    question.set_question_max_confidence(self, max_confidence);
                    question.set_question_parser(self, v_parser);
                    question.set_question_lexicon(self, lexicon);
                    question.set_question_parse(self, parse);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_geographical_question_method = Errors.handleThrowable(ccatch_env_var, $sym74$OUTER_CATCH_FOR_GEOGRAPHICAL_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_geographical_question_method;
    }

    public static SubLObject geographical_question_extract_comma_pp_method(final SubLObject self, final SubLObject v_term, final SubLObject tree) {
        if ((((((((NIL != string_utilities.ends_with(methods.funcall_instance_method_with_0_args(tree, GET_STRING), v_term, UNPROVIDED)) && (NIL != methods.funcall_instance_method_with_1_args(tree, GET_SISTER, ONE_INTEGER))) && (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_SISTER, ONE_INTEGER), GET_CATEGORY) == $kw88$_)) && (NIL != methods.funcall_instance_method_with_1_args(tree, GET_SISTER, TWO_INTEGER))) && (NIL != parse_tree.pp_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_SISTER, TWO_INTEGER)))) && (NIL != member(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_SISTER, TWO_INTEGER), GET_HEAD), GET_STRING), $list90, EQUAL, UNPROVIDED))) && (NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_SISTER, TWO_INTEGER), GET_COMPLEMENTS).first(), GET_HEAD))) && (NIL != methods.funcall_instance_method_with_1_args(self, CANDIDATE_ANSWER_P, methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_SISTER, TWO_INTEGER), GET_COMPLEMENTS).first(), GET_HEAD)))) {
            return methods.funcall_instance_method_with_1_args(tree, GET_SISTER, TWO_INTEGER);
        }
        return NIL;
    }

    public static SubLObject geographical_question_extract_noncomma_pp_method(final SubLObject self, final SubLObject v_term, final SubLObject tree) {
        if ((((((((NIL != string_utilities.ends_with(methods.funcall_instance_method_with_0_args(tree, GET_STRING), v_term, UNPROVIDED)) && (NIL != methods.funcall_instance_method_with_1_args(tree, GET_SISTER, ONE_INTEGER))) && (NIL != parse_tree.pp_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_SISTER, ONE_INTEGER)))) && (NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_SISTER, ONE_INTEGER), GET_HEAD))) && (NIL != member(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_SISTER, ONE_INTEGER), GET_HEAD), GET_STRING), $list96, EQUAL, UNPROVIDED))) && (NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_SISTER, ONE_INTEGER), GET_COMPLEMENTS).first())) && (NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_SISTER, ONE_INTEGER), GET_COMPLEMENTS).first(), GET_HEAD))) && (NIL != methods.funcall_instance_method_with_1_args(self, CANDIDATE_ANSWER_P, methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_SISTER, ONE_INTEGER), GET_COMPLEMENTS).first(), GET_HEAD)))) {
            return methods.funcall_instance_method_with_1_args(tree, GET_SISTER, ONE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject geographical_question_extract_appositive_method(final SubLObject self, final SubLObject v_term, final SubLObject tree) {
        if ((((((((NIL != parse_tree.np_tree_p(tree)) && methods.funcall_instance_method_with_0_args(tree, DAUGHTER_COUNT).numG(TWO_INTEGER)) && methods.funcall_instance_method_with_0_args(tree, DAUGHTER_COUNT).numL(FIVE_INTEGER)) && (NIL != question.np_term_match(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), v_term, UNPROVIDED))) && (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ONE_INTEGER), GET_CATEGORY) == $kw88$_)) && (NIL != parse_tree.nominal_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, TWO_INTEGER)))) && (NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, TWO_INTEGER), GET_HEAD))) && (NIL != methods.funcall_instance_method_with_1_args(self, CANDIDATE_ANSWER_P, methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, TWO_INTEGER), GET_HEAD)))) {
            return methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, TWO_INTEGER);
        }
        return NIL;
    }

    public static SubLObject declare_geographical_question_file() {
        declareFunction(me, "subloop_reserved_initialize_geographical_question_class", "SUBLOOP-RESERVED-INITIALIZE-GEOGRAPHICAL-QUESTION-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_geographical_question_instance", "SUBLOOP-RESERVED-INITIALIZE-GEOGRAPHICAL-QUESTION-INSTANCE", 1, 0, false);
        declareFunction(me, "geographical_question_p", "GEOGRAPHICAL-QUESTION-P", 1, 0, false);
        declareFunction(me, "geographical_question_isaP_method", "GEOGRAPHICAL-QUESTION-ISA?-METHOD", 2, 0, false);
        declareFunction(me, "geographical_question_querify_method", "GEOGRAPHICAL-QUESTION-QUERIFY-METHOD", 1, 0, false);
        declareFunction(me, "geographical_question_answer_types_method", "GEOGRAPHICAL-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        declareFunction(me, "geographical_question_answer_cardinality_method", "GEOGRAPHICAL-QUESTION-ANSWER-CARDINALITY-METHOD", 1, 0, false);
        declareFunction(me, "geographical_question_extract_method", "GEOGRAPHICAL-QUESTION-EXTRACT-METHOD", 2, 0, false);
        declareFunction(me, "geographical_question_extract_from_assignment_method", "GEOGRAPHICAL-QUESTION-EXTRACT-FROM-ASSIGNMENT-METHOD", 2, 0, false);
        declareFunction(me, "geographical_question_extract_from_passage_method", "GEOGRAPHICAL-QUESTION-EXTRACT-FROM-PASSAGE-METHOD", 2, 0, false);
        declareFunction(me, "geographical_question_extract_comma_pp_method", "GEOGRAPHICAL-QUESTION-EXTRACT-COMMA-PP-METHOD", 3, 0, false);
        declareFunction(me, "geographical_question_extract_noncomma_pp_method", "GEOGRAPHICAL-QUESTION-EXTRACT-NONCOMMA-PP-METHOD", 3, 0, false);
        declareFunction(me, "geographical_question_extract_appositive_method", "GEOGRAPHICAL-QUESTION-EXTRACT-APPOSITIVE-METHOD", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_geographical_question_file() {
        return NIL;
    }

    public static SubLObject setup_geographical_question_file() {
        classes.subloop_new_class(GEOGRAPHICAL_QUESTION, WH_QUESTION, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(GEOGRAPHICAL_QUESTION, NIL);
        classes.subloop_note_class_initialization_function(GEOGRAPHICAL_QUESTION, SUBLOOP_RESERVED_INITIALIZE_GEOGRAPHICAL_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function(GEOGRAPHICAL_QUESTION, SUBLOOP_RESERVED_INITIALIZE_GEOGRAPHICAL_QUESTION_INSTANCE);
        subloop_reserved_initialize_geographical_question_class(GEOGRAPHICAL_QUESTION);
        methods.methods_incorporate_class_method($sym24$ISA_, GEOGRAPHICAL_QUESTION, $list25, $list26, $list27);
        methods.subloop_register_class_method(GEOGRAPHICAL_QUESTION, $sym24$ISA_, $sym32$GEOGRAPHICAL_QUESTION_ISA__METHOD);
        methods.methods_incorporate_instance_method(QUERIFY, GEOGRAPHICAL_QUESTION, $list25, NIL, $list34);
        methods.subloop_register_instance_method(GEOGRAPHICAL_QUESTION, QUERIFY, GEOGRAPHICAL_QUESTION_QUERIFY_METHOD);
        methods.methods_incorporate_instance_method(ANSWER_TYPES, GEOGRAPHICAL_QUESTION, $list25, NIL, $list51);
        methods.subloop_register_instance_method(GEOGRAPHICAL_QUESTION, ANSWER_TYPES, GEOGRAPHICAL_QUESTION_ANSWER_TYPES_METHOD);
        methods.methods_incorporate_instance_method(ANSWER_CARDINALITY, GEOGRAPHICAL_QUESTION, $list25, NIL, $list55);
        methods.subloop_register_instance_method(GEOGRAPHICAL_QUESTION, ANSWER_CARDINALITY, GEOGRAPHICAL_QUESTION_ANSWER_CARDINALITY_METHOD);
        methods.methods_incorporate_instance_method(EXTRACT, GEOGRAPHICAL_QUESTION, $list25, $list59, $list60);
        methods.subloop_register_instance_method(GEOGRAPHICAL_QUESTION, EXTRACT, GEOGRAPHICAL_QUESTION_EXTRACT_METHOD);
        methods.methods_incorporate_instance_method(EXTRACT_FROM_ASSIGNMENT, GEOGRAPHICAL_QUESTION, $list25, $list65, $list66);
        methods.subloop_register_instance_method(GEOGRAPHICAL_QUESTION, EXTRACT_FROM_ASSIGNMENT, GEOGRAPHICAL_QUESTION_EXTRACT_FROM_ASSIGNMENT_METHOD);
        methods.methods_incorporate_instance_method(EXTRACT_FROM_PASSAGE, GEOGRAPHICAL_QUESTION, $list25, $list72, $list73);
        methods.subloop_register_instance_method(GEOGRAPHICAL_QUESTION, EXTRACT_FROM_PASSAGE, GEOGRAPHICAL_QUESTION_EXTRACT_FROM_PASSAGE_METHOD);
        methods.methods_incorporate_instance_method(EXTRACT_COMMA_PP, GEOGRAPHICAL_QUESTION, $list25, $list84, $list85);
        methods.subloop_register_instance_method(GEOGRAPHICAL_QUESTION, EXTRACT_COMMA_PP, GEOGRAPHICAL_QUESTION_EXTRACT_COMMA_PP_METHOD);
        methods.methods_incorporate_instance_method(EXTRACT_NONCOMMA_PP, GEOGRAPHICAL_QUESTION, $list25, $list84, $list95);
        methods.subloop_register_instance_method(GEOGRAPHICAL_QUESTION, EXTRACT_NONCOMMA_PP, GEOGRAPHICAL_QUESTION_EXTRACT_NONCOMMA_PP_METHOD);
        methods.methods_incorporate_instance_method(EXTRACT_APPOSITIVE, GEOGRAPHICAL_QUESTION, $list25, $list84, $list99);
        methods.subloop_register_instance_method(GEOGRAPHICAL_QUESTION, EXTRACT_APPOSITIVE, GEOGRAPHICAL_QUESTION_EXTRACT_APPOSITIVE_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_geographical_question_file();
    }

    @Override
    public void initializeVariables() {
        init_geographical_question_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_geographical_question_file();
    }

    
}

/**
 * Total time: 322 ms
 */
