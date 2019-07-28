package com.cyc.cycjava.cycl.quirk;


import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.cyclifier_lexicon;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.lexicon_utilities;
import com.cyc.cycjava.cycl.linkage;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.morphology;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.parse_tree;
import com.cyc.cycjava.cycl.parser;
import com.cyc.cycjava.cycl.quirk.definitional_question;
import com.cyc.cycjava.cycl.slots;
import com.cyc.cycjava.cycl.stacks;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.subloop_structures;
import com.cyc.cycjava.cycl.word_tree;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.Iterator;
import java.util.Map;

import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.quirk.definitional_question.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ELEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOURTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NINE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THIRTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWELVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWENTY_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class definitional_question extends SubLTranslatedFile {
    public static final SubLFile me = new definitional_question();

    public static final String myName = "com.cyc.cycjava.cycl.quirk.definitional_question";

    public static final String myFingerPrint = "1146b563676e0e2a772ad3674edf63ad2f8eef0db2581f063486cdcda0960639";

    // Internal Constants
    public static final SubLSymbol DEFINITIONAL_QUESTION = makeSymbol("DEFINITIONAL-QUESTION");



    public static final SubLList $list2 = list(new SubLObject[]{ list(makeSymbol("GLIMPSE-GENERAL-TEMPLATES"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), list(makeSymbol("QUOTE"), list(new SubLObject[]{ makeString("<FOCUS><COMMA> <DET>"), makeString("such as <FOCUS>"), makeString("<FOCUS><COMMA> such as"), makeString("<FOCUS><COMMA> as <DET>"), makeString("<FOCUS><COMMA> <RELPN> <VERB> <DET>"), makeString("<FOCUS> <VERB> <DET>"), makeString("<VERB> <FOCUS>"), makeString("<FOCUS><COMMA> called <DET>"), makeString("<FOCUS><COMMA> <TYPE> of"), makeString("<FOCUS><COMMA> being <DET>"), makeString("<FOCUS>") }))), list(makeSymbol("GLIMPSE-THING-TEMPLATES"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), list(makeSymbol("QUOTE"), list(makeString("called <FOCUS>"), makeString("<FOCUS><COMMA> defined"), makeString("<FOCUS><COMMA> or")))), list(makeSymbol("GENERAL-TEMPLATE-PARAMETERS"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), list(makeSymbol("QUOTE"), list(list(makeString("<COMMA>"), makeString("\\,")), list(makeString("<DET>"), makeString("the"), makeString("a"), makeString("an")), list(makeString("<TYPE>"), makeString("kind"), makeString("type"), makeString("sort"), makeString("one")), list(makeString("<VERB>"), makeString("is"), makeString("was"), makeString("are"), makeString("were"))))), list(makeSymbol("PERSON-TEMPLATE-PARAMETERS"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), list(makeSymbol("QUOTE"), list(list(makeString("<RELPN>"), makeString("who"))))), list(makeSymbol("ORGANIZATION-TEMPLATE-PARAMETERS"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), list(makeSymbol("QUOTE"), list(list(makeString("<RELPN>"), makeString("that"), makeString("which"))))), list(makeSymbol("THING-TEMPLATE-PARAMETERS"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), list(makeSymbol("QUOTE"), list(list(makeString("<RELPN>"), makeString("that"), makeString("which"), makeString("who"))))), list(makeSymbol("LEADING-APPOSITIVE-BLACKLIST"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), list(makeSymbol("QUOTE"), list(new SubLObject[]{ makeString("Central"), makeString("East"), makeString("West"), makeString("North"), makeString("South"), makeString("Mr"), makeString("Mr."), makeString("Mrs"), makeString("Mrs."), makeString("Ms") }))), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ISA?"), list(makeSymbol("TREE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("QUERIFY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EXTRACT"), list(makeSymbol("PASSAGE")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FOCUS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-FOCUS-VARIANTS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-TYPES"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-CARDINALITY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ANSWER-WORDNET"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NRESTR-APPOSITIVE-DESCRIPTION"), list(makeSymbol("TERM"), makeSymbol("TREE")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RESTR-APPOSITIVE-DESCRIPTION"), list(makeSymbol("TERM"), makeSymbol("TREE")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RESTR-RELATIVE-CLAUSE-DESCRIPTION"), list(makeSymbol("TERM"), makeSymbol("TREE")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("EQUALITY-DESCRIPTION"), list(makeSymbol("TERM"), makeSymbol("TREE")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CALLED-X-DESCRIPTION"), list(makeSymbol("TERM"), makeSymbol("TREE")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEMPLATE-PARAM-TABLE"), list(makeSymbol("WH-WORD")), makeKeyword("PRIVATE")) });

    public static final SubLSymbol LEADING_APPOSITIVE_BLACKLIST = makeSymbol("LEADING-APPOSITIVE-BLACKLIST");

    public static final SubLSymbol THING_TEMPLATE_PARAMETERS = makeSymbol("THING-TEMPLATE-PARAMETERS");

    public static final SubLSymbol ORGANIZATION_TEMPLATE_PARAMETERS = makeSymbol("ORGANIZATION-TEMPLATE-PARAMETERS");

    public static final SubLSymbol PERSON_TEMPLATE_PARAMETERS = makeSymbol("PERSON-TEMPLATE-PARAMETERS");

    public static final SubLSymbol GENERAL_TEMPLATE_PARAMETERS = makeSymbol("GENERAL-TEMPLATE-PARAMETERS");

    public static final SubLSymbol GLIMPSE_THING_TEMPLATES = makeSymbol("GLIMPSE-THING-TEMPLATES");

    public static final SubLSymbol GLIMPSE_GENERAL_TEMPLATES = makeSymbol("GLIMPSE-GENERAL-TEMPLATES");





















    public static final SubLList $list20 = list(new SubLObject[]{ makeString("<FOCUS><COMMA> <DET>"), makeString("such as <FOCUS>"), makeString("<FOCUS><COMMA> such as"), makeString("<FOCUS><COMMA> as <DET>"), makeString("<FOCUS><COMMA> <RELPN> <VERB> <DET>"), makeString("<FOCUS> <VERB> <DET>"), makeString("<VERB> <FOCUS>"), makeString("<FOCUS><COMMA> called <DET>"), makeString("<FOCUS><COMMA> <TYPE> of"), makeString("<FOCUS><COMMA> being <DET>"), makeString("<FOCUS>") });

    public static final SubLList $list21 = list(makeString("called <FOCUS>"), makeString("<FOCUS><COMMA> defined"), makeString("<FOCUS><COMMA> or"));

    public static final SubLList $list22 = list(list(makeString("<COMMA>"), makeString("\\,")), list(makeString("<DET>"), makeString("the"), makeString("a"), makeString("an")), list(makeString("<TYPE>"), makeString("kind"), makeString("type"), makeString("sort"), makeString("one")), list(makeString("<VERB>"), makeString("is"), makeString("was"), makeString("are"), makeString("were")));

    public static final SubLList $list23 = list(list(makeString("<RELPN>"), makeString("who")));

    public static final SubLList $list24 = list(list(makeString("<RELPN>"), makeString("that"), makeString("which")));

    public static final SubLList $list25 = list(list(makeString("<RELPN>"), makeString("that"), makeString("which"), makeString("who")));

    public static final SubLList $list26 = list(new SubLObject[]{ makeString("Central"), makeString("East"), makeString("West"), makeString("North"), makeString("South"), makeString("Mr"), makeString("Mr."), makeString("Mrs"), makeString("Mrs."), makeString("Ms") });

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_DEFINITIONAL_QUESTION_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DEFINITIONAL-QUESTION-CLASS");



















    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_DEFINITIONAL_QUESTION_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DEFINITIONAL-QUESTION-INSTANCE");

    public static final SubLSymbol $sym38$ISA_ = makeSymbol("ISA?");

    public static final SubLList $list39 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list40 = list(makeSymbol("TREE"));

    public static final SubLList $list41 = list(makeString("@param TREE question-tree-p\n   @return boolean; t if PARSE-TREE is a definitional question parse tree,\n   nil otherwise"), list(makeSymbol("RET"), list(makeSymbol("CAND"), list(makeSymbol("WH-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT"))), list(makeSymbol("AUX-VERB-TREE-P"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-HEAD")))), list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ONE_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("YIELD")))), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), list(makeSymbol("QUOTE"), list(makeString("is"), makeString("are"), makeString("was"), makeString("were"))), list(makeSymbol("QUOTE"), EQUAL)), list(makeSymbol("CNOT"), list(makeSymbol("STARTS-WITH-BY-TEST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT"))), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), makeString("the name"), list(makeSymbol("QUOTE"), EQUALP))), list(makeSymbol("COR"), list(makeSymbol("CAND"), list(EQUALP, list(makeSymbol("FIM"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), makeString("what")), list(makeSymbol("CNOT"), list(makeSymbol("NOMINAL-TREE-P"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ONE_INTEGER)))), list(makeSymbol("CAND"), list(EQUALP, list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), makeString("who")), list(makeSymbol("CNOT"), list(makeSymbol("DETERMINER-WORD-TREE-P"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT"))), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER))), list(makeSymbol("COR"), list(EQ, list(makeSymbol("FIM"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT"))), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword("NNP")), list(EQ, list(makeSymbol("FIM"), list(makeSymbol("FIM"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-OBJECTS")))), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword("NNP"))))))));











    public static final SubLList $list47 = list(makeString("is"), makeString("are"), makeString("was"), makeString("were"));

    public static final SubLString $$$the_name = makeString("the name");

    public static final SubLString $$$what = makeString("what");

    public static final SubLString $$$who = makeString("who");









    public static final SubLSymbol $sym55$DEFINITIONAL_QUESTION_ISA__METHOD = makeSymbol("DEFINITIONAL-QUESTION-ISA?-METHOD");



    public static final SubLList $list57 = list(makeString("@return listp; a list of queries likely to extract passages relevant to answer\n   this question"), list(makeSymbol("CLET"), list(list(makeSymbol("WH-WORD"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-WH-PHRASE"))), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING")))), list(makeSymbol("TEMPLATES"), list(makeSymbol("FIF"), list(EQUALP, makeSymbol("WH-WORD"), makeString("what")), list(makeSymbol("APPEND"), makeSymbol("GLIMPSE-GENERAL-TEMPLATES"), makeSymbol("GLIMPSE-THING-TEMPLATES")), makeSymbol("GLIMPSE-GENERAL-TEMPLATES"))), list(makeSymbol("PARAM-TABLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("TEMPLATE-PARAM-TABLE")), makeSymbol("WH-WORD"))), list(makeSymbol("QUERIES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("TEMPLATE"), list(makeSymbol("INSTANTIATE-TEMPLATES"), makeSymbol("TEMPLATES"), makeSymbol("PARAM-TABLE"))), list(makeSymbol("CDOLIST"), list(makeSymbol("CORPUS"), makeSymbol("CORPORA")), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-GLIMPSE-QUERY"), makeSymbol("TEMPLATE"), makeSymbol("CORPUS")), makeSymbol("QUERIES")))), list(makeSymbol("RET"), list(makeSymbol("NREVERSE"), makeSymbol("QUERIES")))));

    public static final SubLSymbol $sym58$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-DEFINITIONAL-QUESTION-METHOD");

    public static final SubLSymbol GET_WH_PHRASE = makeSymbol("GET-WH-PHRASE");

    public static final SubLSymbol TEMPLATE_PARAM_TABLE = makeSymbol("TEMPLATE-PARAM-TABLE");

    public static final SubLSymbol DEFINITIONAL_QUESTION_QUERIFY_METHOD = makeSymbol("DEFINITIONAL-QUESTION-QUERIFY-METHOD");

    public static final SubLSymbol ANSWER_WORDNET = makeSymbol("ANSWER-WORDNET");

    public static final SubLList $list63 = list(list(makeSymbol("RET"), NIL));

    public static final SubLSymbol DEFINITIONAL_QUESTION_ANSWER_WORDNET_METHOD = makeSymbol("DEFINITIONAL-QUESTION-ANSWER-WORDNET-METHOD");





    public static final SubLSymbol GET_ROOTS = makeSymbol("GET-ROOTS");



    public static final SubLList $list69 = list(makeSymbol("PASSAGE"));

    public static final SubLList $list70 = list(makeString("@return listp; a list of answers to this question from PASSAGE"), list(makeSymbol("CHECK-TYPE"), makeSymbol("PASSAGE"), makeSymbol("ABSTRACT-PASSAGE-P")), list(makeSymbol("CLET"), list(list(makeSymbol("TERMS"), list(makeSymbol("CONS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-FOCUS"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-FOCUS-VARIANTS"))))), list(makeSymbol("PASSAGE-STRING"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTENT")))), list(makeSymbol("SHALLOW-PARSES"), NIL), list(makeSymbol("DEEP-PARSE"), list(makeSymbol("FIM"), makeSymbol("PARSER"), list(makeSymbol("QUOTE"), makeSymbol("PARSE")), makeSymbol("PASSAGE-STRING"))), makeSymbol("ANSWERS0"), makeSymbol("ANSWERS")), list(makeSymbol("CSOME"), list(makeSymbol("STRING-CMP"), list(makeSymbol("QUOTE"), list(EQUAL, EQUALP)), makeSymbol("ANSWERS")), list(makeSymbol("CSETQ"), makeSymbol("ANSWERS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("EXTRACT-VIA-DEEP-PARSE")), makeSymbol("DEEP-PARSE"), makeSymbol("PASSAGE"), makeSymbol("STRING-CMP")))), list(makeSymbol("CSETQ"), makeSymbol("ANSWERS"), list(makeSymbol("APPEND"), makeSymbol("ANSWERS0"), makeSymbol("ANSWERS"))), list(makeSymbol("CSETQ"), makeSymbol("ANSWERS"), list(makeSymbol("UNION"), makeSymbol("ANSWERS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-PRE-NOMINAL-DESCRIPTION-VIA-LINK")), makeSymbol("PASSAGE")), list(makeSymbol("FUNCTION"), EQUAL))), list(makeSymbol("RET"), makeSymbol("ANSWERS"))));

    public static final SubLSymbol $sym71$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-DEFINITIONAL-QUESTION-METHOD");





    public static final SubLSymbol GET_FOCUS_VARIANTS = makeSymbol("GET-FOCUS-VARIANTS");



    public static final SubLSymbol EXTRACT_VIA_DEEP_PARSE = makeSymbol("EXTRACT-VIA-DEEP-PARSE");

    public static final SubLList $list77 = list(EQUAL, EQUALP);

    public static final SubLSymbol GET_PRE_NOMINAL_DESCRIPTION_VIA_LINK = makeSymbol("GET-PRE-NOMINAL-DESCRIPTION-VIA-LINK");

    public static final SubLSymbol DEFINITIONAL_QUESTION_EXTRACT_METHOD = makeSymbol("DEFINITIONAL-QUESTION-EXTRACT-METHOD");

    public static final SubLList $list80 = list(makeSymbol("PASSAGE-PARSE"), makeSymbol("PASSAGE"), makeSymbol("STRING-CMP"));

    public static final SubLList $list81 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TERMS"), list(makeSymbol("CONS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-FOCUS"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-FOCUS-VARIANTS"))))), list(makeSymbol("EXTRACTORS"), list(makeSymbol("QUOTE"), list(makeSymbol("NRESTR-APPOSITIVE-DESCRIPTION"), makeSymbol("RESTR-APPOSITIVE-DESCRIPTION"), makeSymbol("EQUALITY-DESCRIPTION"), makeSymbol("RESTR-RELATIVE-CLAUSE-DESCRIPTION"), makeSymbol("CALLED-X-DESCRIPTION")))), makeSymbol("FOUND?"), makeSymbol("ANSWERS")), list(makeSymbol("PWHEN"), list(makeSymbol("PARSE-TREE-P"), makeSymbol("PASSAGE-PARSE")), list(makeSymbol("DO-PARSE-TREE-SUBTREES"), list(makeSymbol("SUBTREE"), makeSymbol("PASSAGE-PARSE"), makeSymbol("ANSWERS")), list(makeSymbol("PWHEN"), list(makeSymbol("PHRASE-TREE-P"), makeSymbol("SUBTREE")), list(makeSymbol("CSETQ"), makeSymbol("FOUND?"), NIL), list(makeSymbol("CSOME"), list(makeSymbol("EXTRACTOR"), makeSymbol("EXTRACTORS"), makeSymbol("FOUND?")), list(makeSymbol("CSOME"), list(makeSymbol("TERM"), makeSymbol("TERMS"), makeSymbol("FOUND?")), list(makeSymbol("PWHEN"), makeSymbol("TERM"), list(makeSymbol("CDOLIST"), list(makeSymbol("DESCRIPTION"), list(makeSymbol("FIM"), makeSymbol("SELF"), makeSymbol("EXTRACTOR"), makeSymbol("TERM"), makeSymbol("SUBTREE"), makeSymbol("STRING-CMP"))), list(makeSymbol("CPUSH"), list(makeSymbol("NEW-TEXT-ANSWER"), makeSymbol("SELF"), list(makeSymbol("FIM"), makeSymbol("DESCRIPTION"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), makeSymbol("PASSAGE"), makeSymbol("MAX-CONFIDENCE"), makeSymbol("DESCRIPTION")), makeSymbol("ANSWERS")), list(makeSymbol("CSETQ"), makeSymbol("FOUND?"), T)))))))), list(makeSymbol("RET"), makeSymbol("ANSWERS"))));

    public static final SubLSymbol $sym82$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-DEFINITIONAL-QUESTION-METHOD");

    public static final SubLList $list83 = list(makeSymbol("NRESTR-APPOSITIVE-DESCRIPTION"), makeSymbol("RESTR-APPOSITIVE-DESCRIPTION"), makeSymbol("EQUALITY-DESCRIPTION"), makeSymbol("RESTR-RELATIVE-CLAUSE-DESCRIPTION"), makeSymbol("CALLED-X-DESCRIPTION"));





    public static final SubLString $str86$_S_is_not_one_of__S = makeString("~S is not one of ~S");

    public static final SubLSymbol DEFINITIONAL_QUESTION_EXTRACT_VIA_DEEP_PARSE_METHOD = makeSymbol("DEFINITIONAL-QUESTION-EXTRACT-VIA-DEEP-PARSE-METHOD");

    public static final SubLList $list88 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list89 = list(makeString("@return stringp; the focus string of QUESTION"), list(makeSymbol("CLET"), list(list(makeSymbol("FOCUS-TREE"), list(makeSymbol("FUNLESS"), list(makeSymbol("FRAG-TREE-P"), makeSymbol("PARSE")), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT")))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("WHNP-TREE-P"), makeSymbol("FOCUS-TREE")), list(makeSymbol("="), list(makeSymbol("FIM"), makeSymbol("FOCUS-TREE"), list(makeSymbol("QUOTE"), makeSymbol("DAUGHTER-COUNT"))), ONE_INTEGER), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(makeSymbol("QUOTE"), makeSymbol("GET-OBJECTS")))), list(makeSymbol("CSETQ"), makeSymbol("FOCUS-TREE"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(makeSymbol("QUOTE"), makeSymbol("GET-OBJECTS")))))), list(makeSymbol("PIF"), makeSymbol("FOCUS-TREE"), list(makeSymbol("PIF"), list(makeSymbol("DETERMINER-WORD-TREE-P"), list(makeSymbol("FIM"), makeSymbol("FOCUS-TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)), list(makeSymbol("RET"), list(makeSymbol("BUNGE"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("GET-PARSE-TREE-STRING")), list(makeSymbol("CDR"), list(makeSymbol("FIM"), makeSymbol("FOCUS-TREE"), list(makeSymbol("QUOTE"), makeSymbol("YIELD"))))))), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("FOCUS-TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))))), list(makeSymbol("RET"), NIL))));

    public static final SubLSymbol $sym90$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-DEFINITIONAL-QUESTION-METHOD");



    public static final SubLSymbol GET_PARSE_TREE_STRING = makeSymbol("GET-PARSE-TREE-STRING");

    public static final SubLSymbol DEFINITIONAL_QUESTION_GET_FOCUS_METHOD = makeSymbol("DEFINITIONAL-QUESTION-GET-FOCUS-METHOD");

    public static final SubLList $list94 = list(makeString("@return listp; a list of string of variants of this question's focus"), list(makeSymbol("CLET"), list(list(makeSymbol("FOCUS-TREE"), list(makeSymbol("FUNLESS"), list(makeSymbol("FRAG-TREE-P"), makeSymbol("PARSE")), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT"))))), list(makeSymbol("FOCUS-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("FOCUS-TREE"), list(makeSymbol("FIM"), makeSymbol("FOCUS-TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))))), list(makeSymbol("FOCUS-POS"), list(makeSymbol("FWHEN"), makeSymbol("FOCUS-HEAD"), list(makeSymbol("FIM"), makeSymbol("FOCUS-HEAD"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))))), makeSymbol("VARIANTS")), list(makeSymbol("PCASE"), makeSymbol("FOCUS-POS"), list(makeKeyword("NN"), list(makeSymbol("CPUSH"), list(makeSymbol("PLURALIZE-STRING"), list(makeSymbol("GET-FOCUS"), makeSymbol("SELF"))), makeSymbol("VARIANTS"))), list(makeKeyword("NNS"), list(makeSymbol("CPUSH"), list(makeSymbol("PLURAL-NOUN-TO-SG"), list(makeSymbol("GET-FOCUS"), makeSymbol("SELF"))), makeSymbol("VARIANTS")))), list(makeSymbol("RET"), makeSymbol("VARIANTS"))));

    public static final SubLSymbol $sym95$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-DEFINITIONAL-QUESTION-METHOD");





    public static final SubLSymbol DEFINITIONAL_QUESTION_GET_FOCUS_VARIANTS_METHOD = makeSymbol("DEFINITIONAL-QUESTION-GET-FOCUS-VARIANTS-METHOD");

    public static final SubLList $list99 = list(makeString("@return list; an enumeration of CycL collections any answer to this question\n  must belong to. If nil, there is no such semantic type restriction"), list(makeSymbol("RET"), list(makeSymbol("LIST"), NIL)));

    public static final SubLSymbol DEFINITIONAL_QUESTION_ANSWER_TYPES_METHOD = makeSymbol("DEFINITIONAL-QUESTION-ANSWER-TYPES-METHOD");



    public static final SubLList $list102 = list(makeString("@return positive-integer-p; the number of answers expected for this question"), list(makeSymbol("RET"), TEN_INTEGER));

    public static final SubLSymbol DEFINITIONAL_QUESTION_ANSWER_CARDINALITY_METHOD = makeSymbol("DEFINITIONAL-QUESTION-ANSWER-CARDINALITY-METHOD");

    public static final SubLList $list104 = list(makeSymbol("WH-WORD"));

    public static final SubLList $list105 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RES"), NIL)), list(makeSymbol("PCOND"), list(list(EQUALP, makeSymbol("WH-WORD"), makeString("who")), list(makeSymbol("CSETF"), makeSymbol("RES"), list(makeSymbol("APPEND"), makeSymbol("GENERAL-TEMPLATE-PARAMETERS"), makeSymbol("PERSON-TEMPLATE-PARAMETERS")))), list(list(EQUALP, makeSymbol("WH-WORD"), makeString("what")), list(makeSymbol("CSETF"), makeSymbol("RES"), list(makeSymbol("APPEND"), makeSymbol("GENERAL-TEMPLATE-PARAMETERS"), makeSymbol("THING-TEMPLATE-PARAMETERS"))))), list(makeSymbol("RET"), list(makeSymbol("ACONS"), makeString("<FOCUS>"), list(makeSymbol("CONS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-FOCUS"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-FOCUS-VARIANTS")))), makeSymbol("RES")))));

    public static final SubLSymbol $sym106$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-DEFINITIONAL-QUESTION-METHOD");

    public static final SubLString $str107$_FOCUS_ = makeString("<FOCUS>");

    public static final SubLSymbol DEFINITIONAL_QUESTION_TEMPLATE_PARAM_TABLE_METHOD = makeSymbol("DEFINITIONAL-QUESTION-TEMPLATE-PARAM-TABLE-METHOD");

    public static final SubLSymbol NRESTR_APPOSITIVE_DESCRIPTION = makeSymbol("NRESTR-APPOSITIVE-DESCRIPTION");

    public static final SubLList $list110 = list(makeKeyword("PRIVATE"));

    public static final SubLList $list111 = list(makeSymbol("TERM"), makeSymbol("TREE"), makeSymbol("&OPTIONAL"), list(makeSymbol("STRING-COMPARE"), list(makeSymbol("QUOTE"), EQUAL)));

    public static final SubLList $list112 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NUM-DAUGHTERS"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("DAUGHTER-COUNT"))))), list(makeSymbol("PUNLESS"), list(makeSymbol(">="), makeSymbol("NUM-DAUGHTERS"), TWO_INTEGER), list(makeSymbol("RET"), NIL)), list(makeSymbol("CLET"), list(list(makeSymbol("FIRST-DAUGHTER"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)), list(makeSymbol("SECOND-DAUGHTER"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ONE_INTEGER))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(EQ, list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword("NP")), list(EQ, list(makeSymbol("FIM"), makeSymbol("FIRST-DAUGHTER"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword("NP"))), list(makeSymbol("PWHEN"), list(makeSymbol("NP-TERM-MATCH"), makeSymbol("FIRST-DAUGHTER"), makeSymbol("TERM"), makeSymbol("STRING-COMPARE")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol(">="), makeSymbol("NUM-DAUGHTERS"), THREE_INTEGER), list(makeSymbol("<="), makeSymbol("NUM-DAUGHTERS"), FOUR_INTEGER), list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), makeSymbol("SECOND-DAUGHTER"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), list(makeSymbol("QUOTE"), list(makeKeyword(","), makeKeyword(":"))), list(makeSymbol("QUOTE"), EQ))), list(makeSymbol("CLET"), list(list(makeSymbol("POTENTIAL-NRESTR-APPOSITIVE"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), TWO_INTEGER))), list(makeSymbol("PWHEN"), list(EQ, list(makeSymbol("FIM"), makeSymbol("POTENTIAL-NRESTR-APPOSITIVE"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword("NP")), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("POTENTIAL-NRESTR-APPOSITIVE")))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("="), makeSymbol("NUM-DAUGHTERS"), TWO_INTEGER), list(EQ, list(makeSymbol("FIM"), makeSymbol("SECOND-DAUGHTER"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword("PRN")), list(makeSymbol("="), list(makeSymbol("FIM"), makeSymbol("SECOND-DAUGHTER"), list(makeSymbol("QUOTE"), makeSymbol("DAUGHTER-COUNT"))), THREE_INTEGER), list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("SECOND-DAUGHTER"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), list(makeSymbol("QUOTE"), list(makeKeyword(":"), makeKeyword("("), makeKeyword("-LRB-"))), list(makeSymbol("QUOTE"), EQ))), list(makeSymbol("CLET"), list(list(makeSymbol("POTENTIAL-NRESTR-APPOSITIVE"), list(makeSymbol("FIM"), makeSymbol("SECOND-DAUGHTER"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ONE_INTEGER))), list(makeSymbol("PWHEN"), list(EQ, list(makeSymbol("FIM"), makeSymbol("POTENTIAL-NRESTR-APPOSITIVE"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword("NP")), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("POTENTIAL-NRESTR-APPOSITIVE"))))))), list(makeSymbol("PWHEN"), list(makeSymbol("="), makeSymbol("NUM-DAUGHTERS"), FOUR_INTEGER), list(makeSymbol("CLET"), list(list(makeSymbol("THIRD-DAUGHTER"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), TWO_INTEGER)), list(makeSymbol("FOURTH-DAUGHTER"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), THREE_INTEGER))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(EQ, list(makeSymbol("FIM"), makeSymbol("THIRD-DAUGHTER"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword("NP")), list(makeSymbol("NP-TERM-MATCH"), makeSymbol("THIRD-DAUGHTER"), makeSymbol("TERM"), makeSymbol("STRING-COMPARE")), list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), makeSymbol("FOURTH-DAUGHTER"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), list(makeSymbol("QUOTE"), list(makeKeyword(","), makeKeyword(":"))), list(makeSymbol("QUOTE"), EQ))), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("FIRST-DAUGHTER"))))))))), list(makeSymbol("RET"), NIL));



    public static final SubLList $list114 = list(makeKeyword(","), makeKeyword(":"));



    public static final SubLList $list116 = list(makeKeyword(":"), makeKeyword("("), makeKeyword("-LRB-"));

    public static final SubLSymbol DEFINITIONAL_QUESTION_NRESTR_APPOSITIVE_DESCRIPTION_METHOD = makeSymbol("DEFINITIONAL-QUESTION-NRESTR-APPOSITIVE-DESCRIPTION-METHOD");

    public static final SubLSymbol EQUALITY_DESCRIPTION = makeSymbol("EQUALITY-DESCRIPTION");

    public static final SubLList $list119 = list(list(makeSymbol("PWHEN"), list(new SubLObject[]{ makeSymbol("CAND"), list(EQ, list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword("S")), list(makeSymbol(">="), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("DAUGHTER-COUNT"))), TWO_INTEGER), list(makeSymbol("<="), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("DAUGHTER-COUNT"))), THREE_INTEGER), list(EQ, list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword("NP")), list(makeSymbol("NP-TERM-MATCH"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), makeSymbol("TERM"), makeSymbol("STRING-COMPARE")), list(EQ, list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ONE_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword("VP")), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DESCENDANT")), list(makeSymbol("QUOTE"), list(ONE_INTEGER, ZERO_INTEGER))), list(EQ, list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DESCENDANT")), list(makeSymbol("QUOTE"), list(ONE_INTEGER, ZERO_INTEGER))), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword("AUX")), list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DESCENDANT")), list(makeSymbol("QUOTE"), list(ONE_INTEGER, ZERO_INTEGER))), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), list(makeSymbol("QUOTE"), list(makeString("is"), makeString("are"), makeString("was"), makeString("were"))), list(makeSymbol("QUOTE"), EQUALP)), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DESCENDANT")), list(makeSymbol("QUOTE"), list(ONE_INTEGER, ONE_INTEGER))), list(EQ, list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DESCENDANT")), list(makeSymbol("QUOTE"), list(ONE_INTEGER, ONE_INTEGER))), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword("NP")) }), list(makeSymbol("RET"), list(makeSymbol("LIST"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DESCENDANT")), list(makeSymbol("QUOTE"), list(ONE_INTEGER, ONE_INTEGER)))))));







    public static final SubLList $list123 = list(ONE_INTEGER, ZERO_INTEGER);



    public static final SubLList $list125 = list(ONE_INTEGER, ONE_INTEGER);

    public static final SubLSymbol DEFINITIONAL_QUESTION_EQUALITY_DESCRIPTION_METHOD = makeSymbol("DEFINITIONAL-QUESTION-EQUALITY-DESCRIPTION-METHOD");

    public static final SubLSymbol CALLED_X_DESCRIPTION = makeSymbol("CALLED-X-DESCRIPTION");

    public static final SubLList $list128 = list(list(makeSymbol("PWHEN"), list(new SubLObject[]{ makeSymbol("CAND"), list(EQ, list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword("NP")), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ONE_INTEGER), list(EQ, list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword("NP")), list(EQ, list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ONE_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword("VP")), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ONE_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))), list(makeSymbol("FUNCALL"), makeSymbol("STRING-COMPARE"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ONE_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), makeString("called")), list(makeSymbol("FIM"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ONE_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))), list(makeSymbol("QUOTE"), makeSymbol("GET-OBJECTS"))), list(makeSymbol("FUNCALL"), makeSymbol("STRING-COMPARE"), list(makeSymbol("FIM"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ONE_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))), list(makeSymbol("QUOTE"), makeSymbol("GET-OBJECTS")))), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), makeSymbol("TERM")) }), list(makeSymbol("RET"), list(makeSymbol("LIST"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)))));

    public static final SubLString $$$called = makeString("called");

    public static final SubLSymbol DEFINITIONAL_QUESTION_CALLED_X_DESCRIPTION_METHOD = makeSymbol("DEFINITIONAL-QUESTION-CALLED-X-DESCRIPTION-METHOD");

    public static final SubLSymbol RESTR_RELATIVE_CLAUSE_DESCRIPTION = makeSymbol("RESTR-RELATIVE-CLAUSE-DESCRIPTION");

    public static final SubLList $list132 = list(makeSymbol("TERM"), makeSymbol("PASSAGE-TREE"), makeSymbol("&OPTIONAL"), list(makeSymbol("STRING-COMPARE"), list(makeSymbol("QUOTE"), EQUAL)));

    public static final SubLList $list133 = list(list(makeSymbol("PWHEN"), list(new SubLObject[]{ makeSymbol("CAND"), list(EQ, list(makeSymbol("FIM"), makeSymbol("PASSAGE-TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword("NP")), list(makeSymbol(">="), list(makeSymbol("FIM"), makeSymbol("PASSAGE-TREE"), list(makeSymbol("QUOTE"), makeSymbol("DAUGHTER-COUNT"))), THREE_INTEGER), list(makeSymbol("<="), list(makeSymbol("FIM"), makeSymbol("PASSAGE-TREE"), list(makeSymbol("QUOTE"), makeSymbol("DAUGHTER-COUNT"))), FOUR_INTEGER), list(EQ, list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("PASSAGE-TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword("NP")), list(makeSymbol("NP-TERM-MATCH"), list(makeSymbol("FIM"), makeSymbol("PASSAGE-TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), makeSymbol("TERM"), makeSymbol("STRING-COMPARE")), list(EQ, list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("PASSAGE-TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ONE_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword(",")), list(EQ, list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("PASSAGE-TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), TWO_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword("SBAR")), list(makeSymbol(">="), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("PASSAGE-TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), TWO_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("DAUGHTER-COUNT"))), TWO_INTEGER), list(makeSymbol("FIM"), makeSymbol("PASSAGE-TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DESCENDANT")), list(makeSymbol("QUOTE"), list(TWO_INTEGER, ZERO_INTEGER))), list(EQ, list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("PASSAGE-TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DESCENDANT")), list(makeSymbol("QUOTE"), list(TWO_INTEGER, ZERO_INTEGER))), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword("WHNP")), list(makeSymbol("FIM"), makeSymbol("PASSAGE-TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DESCENDANT")), list(makeSymbol("QUOTE"), list(TWO_INTEGER, ONE_INTEGER))) }), list(makeSymbol("RET"), list(makeSymbol("LIST"), list(makeSymbol("FIM"), makeSymbol("PASSAGE-TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DESCENDANT")), list(makeSymbol("QUOTE"), list(TWO_INTEGER, ONE_INTEGER)))))));

    private static final SubLSymbol $kw134$_ = makeKeyword(",");



    public static final SubLList $list136 = list(TWO_INTEGER, ZERO_INTEGER);



    public static final SubLList $list138 = list(TWO_INTEGER, ONE_INTEGER);

    public static final SubLSymbol DEFINITIONAL_QUESTION_RESTR_RELATIVE_CLAUSE_DESCRIPTION_METHOD = makeSymbol("DEFINITIONAL-QUESTION-RESTR-RELATIVE-CLAUSE-DESCRIPTION-METHOD");

    public static final SubLSymbol RESTR_APPOSITIVE_DESCRIPTION = makeSymbol("RESTR-APPOSITIVE-DESCRIPTION");

    public static final SubLList $list141 = list(list(makeSymbol("CLET"), list(list(makeSymbol("STRING"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING")))), list(makeSymbol("STRING-LENGTH"), list(makeSymbol("LENGTH"), makeSymbol("STRING"))), list(makeSymbol("TERM-LENGTH"), list(makeSymbol("LENGTH"), makeSymbol("TERM"))), list(makeSymbol("CATEGORY"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY")))), makeSymbol("DESCRIPTION"), makeSymbol("PARSE")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("MEMBER?"), makeSymbol("CATEGORY"), list(makeSymbol("QUOTE"), list(makeKeyword("NP"), makeKeyword("NPP"), makeKeyword("PNP"))), list(makeSymbol("QUOTE"), EQ)), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(makeSymbol("CNOT"), list(EQ, list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(makeSymbol("QUOTE"), makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword("DT"))), list(makeSymbol("NP-TERM-MATCH"), makeSymbol("TREE"), makeSymbol("TERM"), makeSymbol("STRING-COMPARE")), list(makeSymbol(">"), list(makeSymbol("LENGTH"), makeSymbol("STRING")), list(makeSymbol("LENGTH"), makeSymbol("TERM")))), list(makeSymbol("CSETQ"), makeSymbol("DESCRIPTION"), list(makeSymbol("SUBSTRING"), makeSymbol("STRING"), ZERO_INTEGER, list(makeSymbol("-"), makeSymbol("STRING-LENGTH"), list(makeSymbol("1+"), makeSymbol("TERM-LENGTH"))))), list(makeSymbol("CSETQ"), makeSymbol("PARSE"), list(makeSymbol("FIM"), makeSymbol("PARSER"), list(makeSymbol("QUOTE"), makeSymbol("PARSE")), makeSymbol("DESCRIPTION"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("PHRASE-TREE-P"), makeSymbol("PARSE")), list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), list(makeSymbol("QUOTE"), list(makeKeyword("NP"), makeKeyword("NPP"), makeKeyword("PNP")))), list(makeSymbol("CNOT"), list(makeSymbol("MEMBER?"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), makeSymbol("LEADING-APPOSITIVE-BLACKLIST"), list(makeSymbol("QUOTE"), EQUALP))), list(makeSymbol("CNOT"), list(makeSymbol("FIRST-NAME-P"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING")))))), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("PARSE")))))));

    public static final SubLSymbol $sym142$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-DEFINITIONAL-QUESTION-METHOD");

    public static final SubLList $list143 = list(makeKeyword("NP"), makeKeyword("NPP"), makeKeyword("PNP"));



    public static final SubLSymbol DEFINITIONAL_QUESTION_RESTR_APPOSITIVE_DESCRIPTION_METHOD = makeSymbol("DEFINITIONAL-QUESTION-RESTR-APPOSITIVE-DESCRIPTION-METHOD");

    public static final SubLSymbol LINK_WORD_P = makeSymbol("LINK-WORD-P");







    private static final SubLSymbol $X_I_PATTERN = makeKeyword("X-I-PATTERN");





    private static final SubLSymbol $X_D_PATTERN = makeKeyword("X-D-PATTERN");

    private static final SubLSymbol $X_C_PATTERN = makeKeyword("X-C-PATTERN");









    public static final SubLString $str159$Error_caught_in_GET_PRE_NOMINAL_D = makeString("Error caught in GET-PRE-NOMINAL-DESCRIPTION ~s");





    public static final SubLSymbol LINK_WORD_AFTER = makeSymbol("LINK-WORD-AFTER");

    public static final SubLList $list163 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TERMS"), list(makeSymbol("CONS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-FOCUS"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-FOCUS-VARIANTS"))))), list(makeSymbol("PASSAGE-STRING"), list(makeSymbol("FIM"), makeSymbol("PASSAGE"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTENT")))), makeSymbol("RESULT-STRINGS"), makeSymbol("RESULTS")), list(makeSymbol("CSOME"), list(makeSymbol("TERM"), makeSymbol("TERMS"), makeSymbol("RESULT-STRINGS")), list(makeSymbol("PWHEN"), makeSymbol("TERM"), list(makeSymbol("CSETQ"), makeSymbol("RESULT-STRINGS"), list(makeSymbol("GET-PRE-NOMINAL-DESCRIPTION"), makeSymbol("PASSAGE-STRING"), makeSymbol("TERM"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("RESULT-STRING"), makeSymbol("RESULT-STRINGS")), list(makeSymbol("CPUSHNEW"), list(makeSymbol("NEW-TEXT-ANSWER"), makeSymbol("SELF"), makeSymbol("RESULT-STRING"), makeSymbol("PASSAGE"), makeSymbol("MAX-CONFIDENCE")), makeSymbol("RESULTS"))), list(makeSymbol("RET"), makeSymbol("RESULTS"))));

    public static final SubLSymbol $sym164$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-DEFINITIONAL-QUESTION-METHOD");

    public static final SubLSymbol DEFINITIONAL_QUESTION_GET_PRE_NOMINAL_DESCRIPTION_VIA_LINK_METHOD = makeSymbol("DEFINITIONAL-QUESTION-GET-PRE-NOMINAL-DESCRIPTION-VIA-LINK-METHOD");



    public static final SubLString $str167$_cyc_projects_aquaint_lemur_indic = makeString("/cyc/projects/aquaint/lemur-indices/CNSjan2004/simple_kl_dir_param");

    public static final SubLString $str168$___S__ = makeString("~%~S~%");

    public static final SubLList $list169 = list(makeSymbol("PERSON"), makeSymbol("ORG"));

    public static final SubLSymbol $sym170$_ = makeSymbol(">");



    public static final SubLString $str172$_a_is__a_ = makeString("~a is ~a?");



    public static final SubLString $$$Who = makeString("Who");

    public static final SubLString $$$What = makeString("What");

    public static final SubLString $$$CNSjan2004 = makeString("CNSjan2004");

    public static final SubLString $str177$_________________________________ = makeString("----------------------------------------------------");



    public static final SubLString $$$Who_is_ = makeString("Who is ");

    public static final SubLString $str180$_ = makeString("?");

    public static final SubLSymbol GET_PRE_NOMINAL_DESCRIPTION = makeSymbol("GET-PRE-NOMINAL-DESCRIPTION");



    public static final SubLSymbol PRE_NOMINAL_TEST_FUNC = makeSymbol("PRE-NOMINAL-TEST-FUNC");











    private static final SubLList $list189 = list(list(list(makeString("Canadian singer David Baxter lives in the woods"), makeString("David Baxter")), list(makeString("Canadian singer"))));

    private static final SubLSymbol DEFINITIONAL_QUESTION_TEST_HELPER = makeSymbol("DEFINITIONAL-QUESTION-TEST-HELPER");

    private static final SubLSymbol THIS_EQUAL = makeSymbol("THIS-EQUAL");

    private static final SubLList $list192 = list(list(list(makeString("Vaclav Havel, who is the president of the Chech Republic, sleeps with monkeys"), makeString("Vaclav Havel")), list(makeString("is the president of the Chech Republic"))), list(list(makeString("terrorism is a heinous crime against humanity"), makeString("terrorism")), list(makeString("a heinous crime against humanity"))));

    public static SubLObject get_definitional_question_leading_appositive_blacklist(final SubLObject v_definitional_question) {
        final SubLObject v_class = (v_definitional_question.isSymbol()) ? classes.classes_retrieve_class(v_definitional_question) : NIL != subloop_structures.class_p(v_definitional_question) ? v_definitional_question : NIL != subloop_structures.instance_p(v_definitional_question) ? subloop_structures.instance_class(v_definitional_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(LEADING_APPOSITIVE_BLACKLIST, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), FOURTEEN_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_definitional_question_leading_appositive_blacklist(final SubLObject v_definitional_question, final SubLObject value) {
        final SubLObject v_class = (v_definitional_question.isSymbol()) ? classes.classes_retrieve_class(v_definitional_question) : NIL != subloop_structures.class_p(v_definitional_question) ? v_definitional_question : NIL != subloop_structures.instance_p(v_definitional_question) ? subloop_structures.instance_class(v_definitional_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(LEADING_APPOSITIVE_BLACKLIST, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), FOURTEEN_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_definitional_question_thing_template_parameters(final SubLObject v_definitional_question) {
        final SubLObject v_class = (v_definitional_question.isSymbol()) ? classes.classes_retrieve_class(v_definitional_question) : NIL != subloop_structures.class_p(v_definitional_question) ? v_definitional_question : NIL != subloop_structures.instance_p(v_definitional_question) ? subloop_structures.instance_class(v_definitional_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(THING_TEMPLATE_PARAMETERS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), THIRTEEN_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_definitional_question_thing_template_parameters(final SubLObject v_definitional_question, final SubLObject value) {
        final SubLObject v_class = (v_definitional_question.isSymbol()) ? classes.classes_retrieve_class(v_definitional_question) : NIL != subloop_structures.class_p(v_definitional_question) ? v_definitional_question : NIL != subloop_structures.instance_p(v_definitional_question) ? subloop_structures.instance_class(v_definitional_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(THING_TEMPLATE_PARAMETERS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), THIRTEEN_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_definitional_question_organization_template_parameters(final SubLObject v_definitional_question) {
        final SubLObject v_class = (v_definitional_question.isSymbol()) ? classes.classes_retrieve_class(v_definitional_question) : NIL != subloop_structures.class_p(v_definitional_question) ? v_definitional_question : NIL != subloop_structures.instance_p(v_definitional_question) ? subloop_structures.instance_class(v_definitional_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(ORGANIZATION_TEMPLATE_PARAMETERS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), TWELVE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_definitional_question_organization_template_parameters(final SubLObject v_definitional_question, final SubLObject value) {
        final SubLObject v_class = (v_definitional_question.isSymbol()) ? classes.classes_retrieve_class(v_definitional_question) : NIL != subloop_structures.class_p(v_definitional_question) ? v_definitional_question : NIL != subloop_structures.instance_p(v_definitional_question) ? subloop_structures.instance_class(v_definitional_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(ORGANIZATION_TEMPLATE_PARAMETERS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), TWELVE_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_definitional_question_person_template_parameters(final SubLObject v_definitional_question) {
        final SubLObject v_class = (v_definitional_question.isSymbol()) ? classes.classes_retrieve_class(v_definitional_question) : NIL != subloop_structures.class_p(v_definitional_question) ? v_definitional_question : NIL != subloop_structures.instance_p(v_definitional_question) ? subloop_structures.instance_class(v_definitional_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(PERSON_TEMPLATE_PARAMETERS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), ELEVEN_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_definitional_question_person_template_parameters(final SubLObject v_definitional_question, final SubLObject value) {
        final SubLObject v_class = (v_definitional_question.isSymbol()) ? classes.classes_retrieve_class(v_definitional_question) : NIL != subloop_structures.class_p(v_definitional_question) ? v_definitional_question : NIL != subloop_structures.instance_p(v_definitional_question) ? subloop_structures.instance_class(v_definitional_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(PERSON_TEMPLATE_PARAMETERS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), ELEVEN_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_definitional_question_general_template_parameters(final SubLObject v_definitional_question) {
        final SubLObject v_class = (v_definitional_question.isSymbol()) ? classes.classes_retrieve_class(v_definitional_question) : NIL != subloop_structures.class_p(v_definitional_question) ? v_definitional_question : NIL != subloop_structures.instance_p(v_definitional_question) ? subloop_structures.instance_class(v_definitional_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(GENERAL_TEMPLATE_PARAMETERS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), TEN_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_definitional_question_general_template_parameters(final SubLObject v_definitional_question, final SubLObject value) {
        final SubLObject v_class = (v_definitional_question.isSymbol()) ? classes.classes_retrieve_class(v_definitional_question) : NIL != subloop_structures.class_p(v_definitional_question) ? v_definitional_question : NIL != subloop_structures.instance_p(v_definitional_question) ? subloop_structures.instance_class(v_definitional_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(GENERAL_TEMPLATE_PARAMETERS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), TEN_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_definitional_question_glimpse_thing_templates(final SubLObject v_definitional_question) {
        final SubLObject v_class = (v_definitional_question.isSymbol()) ? classes.classes_retrieve_class(v_definitional_question) : NIL != subloop_structures.class_p(v_definitional_question) ? v_definitional_question : NIL != subloop_structures.instance_p(v_definitional_question) ? subloop_structures.instance_class(v_definitional_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(GLIMPSE_THING_TEMPLATES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), NINE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_definitional_question_glimpse_thing_templates(final SubLObject v_definitional_question, final SubLObject value) {
        final SubLObject v_class = (v_definitional_question.isSymbol()) ? classes.classes_retrieve_class(v_definitional_question) : NIL != subloop_structures.class_p(v_definitional_question) ? v_definitional_question : NIL != subloop_structures.instance_p(v_definitional_question) ? subloop_structures.instance_class(v_definitional_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(GLIMPSE_THING_TEMPLATES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), NINE_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject get_definitional_question_glimpse_general_templates(final SubLObject v_definitional_question) {
        final SubLObject v_class = (v_definitional_question.isSymbol()) ? classes.classes_retrieve_class(v_definitional_question) : NIL != subloop_structures.class_p(v_definitional_question) ? v_definitional_question : NIL != subloop_structures.instance_p(v_definitional_question) ? subloop_structures.instance_class(v_definitional_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(GLIMPSE_GENERAL_TEMPLATES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), EIGHT_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_definitional_question_glimpse_general_templates(final SubLObject v_definitional_question, final SubLObject value) {
        final SubLObject v_class = (v_definitional_question.isSymbol()) ? classes.classes_retrieve_class(v_definitional_question) : NIL != subloop_structures.class_p(v_definitional_question) ? v_definitional_question : NIL != subloop_structures.instance_p(v_definitional_question) ? subloop_structures.instance_class(v_definitional_question) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(GLIMPSE_GENERAL_TEMPLATES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), EIGHT_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_definitional_question_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, QUESTION, LEXICON, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, PARSER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, TAGGER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, CHUNKER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION, MAX_CANDIDATES, TWENTY_INTEGER);
        classes.subloop_initialize_slot(new_instance, QUESTION, MAX_CONFIDENCE, TEN_INTEGER);
        classes.subloop_initialize_slot(new_instance, QUESTION, LEARNABLE_TYPES, NIL);
        classes.subloop_initialize_slot(new_instance, DEFINITIONAL_QUESTION, GLIMPSE_GENERAL_TEMPLATES, $list20);
        classes.subloop_initialize_slot(new_instance, DEFINITIONAL_QUESTION, GLIMPSE_THING_TEMPLATES, $list21);
        classes.subloop_initialize_slot(new_instance, DEFINITIONAL_QUESTION, GENERAL_TEMPLATE_PARAMETERS, $list22);
        classes.subloop_initialize_slot(new_instance, DEFINITIONAL_QUESTION, PERSON_TEMPLATE_PARAMETERS, $list23);
        classes.subloop_initialize_slot(new_instance, DEFINITIONAL_QUESTION, ORGANIZATION_TEMPLATE_PARAMETERS, $list24);
        classes.subloop_initialize_slot(new_instance, DEFINITIONAL_QUESTION, THING_TEMPLATE_PARAMETERS, $list25);
        classes.subloop_initialize_slot(new_instance, DEFINITIONAL_QUESTION, LEADING_APPOSITIVE_BLACKLIST, $list26);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_definitional_question_instance(final SubLObject new_instance) {
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

    public static SubLObject definitional_question_p(final SubLObject v_definitional_question) {
        return classes.subloop_instanceof_class(v_definitional_question, DEFINITIONAL_QUESTION);
    }

    public static SubLObject definitional_question_isaP_method(final SubLObject self, final SubLObject tree) {
        return makeBoolean((((((NIL != parse_tree.wh_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER))) && (NIL != methods.funcall_instance_method_with_0_args(tree, GET_SUBJECT))) && (NIL != word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_0_args(tree, GET_SEMANTIC_HEAD)))) && (NIL != member(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ONE_INTEGER), YIELD).first(), GET_STRING), $list47, EQUAL, UNPROVIDED))) && (NIL == string_utilities.starts_with_by_test(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(tree, GET_SUBJECT), GET_STRING), $$$the_name, EQUALP))) && ((methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_DAUGHTER, ZERO_INTEGER), GET_STRING).equalp($$$what) && (NIL == parse_tree.nominal_tree_p(methods.funcall_instance_method_with_1_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_DAUGHTER, ONE_INTEGER)))) || ((methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_STRING).equalp($$$who) && (NIL == word_tree.determiner_word_tree_p(methods.funcall_instance_method_with_1_args(methods.funcall_instance_method_with_0_args(tree, GET_SUBJECT), GET_DAUGHTER, ZERO_INTEGER)))) && ((methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(tree, GET_SUBJECT), GET_HEAD), GET_CATEGORY) == $NNP) || (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(tree, GET_OBJECTS).first(), GET_HEAD), GET_CATEGORY) == $NNP)))));
    }

    public static SubLObject definitional_question_querify_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_definitional_question_method = NIL;
        final SubLObject glimpse_thing_templates = get_definitional_question_glimpse_thing_templates(self);
        final SubLObject glimpse_general_templates = get_definitional_question_glimpse_general_templates(self);
        final SubLObject corpora = question.get_question_corpora(self);
        try {
            thread.throwStack.push($sym58$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
            try {
                final SubLObject wh_word = methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(methods.funcall_instance_method_with_0_args(self, GET_WH_PHRASE), GET_DAUGHTER, ZERO_INTEGER), GET_STRING);
                final SubLObject templates = (wh_word.equalp($$$what)) ? append(glimpse_general_templates, glimpse_thing_templates) : glimpse_general_templates;
                final SubLObject param_table = methods.funcall_instance_method_with_1_args(self, TEMPLATE_PARAM_TABLE, wh_word);
                SubLObject queries = NIL;
                SubLObject cdolist_list_var = instantiate_templates(templates, param_table);
                SubLObject template = NIL;
                template = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$1 = corpora;
                    SubLObject corpus = NIL;
                    corpus = cdolist_list_var_$1.first();
                    while (NIL != cdolist_list_var_$1) {
                        queries = cons(search_engine.new_glimpse_query(template, corpus), queries);
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        corpus = cdolist_list_var_$1.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    template = cdolist_list_var.first();
                } 
                sublisp_throw($sym58$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, nreverse(queries));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_definitional_question_glimpse_thing_templates(self, glimpse_thing_templates);
                    set_definitional_question_glimpse_general_templates(self, glimpse_general_templates);
                    question.set_question_corpora(self, corpora);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_definitional_question_method = Errors.handleThrowable(ccatch_env_var, $sym58$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_definitional_question_method;
    }

    public static SubLObject definitional_question_answer_wordnet_method(final SubLObject self) {
        return NIL;
    }

    public static SubLObject get_roots(final SubLObject parse) {
        SubLObject lemmatized = NIL;
        if (parse.first() == $ROOT) {
            lemmatized = cons(cons(second(parse), third(parse)), lemmatized);
        } else
            if (second(parse).isList()) {
                lemmatized = apply(APPEND, Mapping.mapcar(GET_ROOTS, parse.rest()));
            }

        SubLObject cdolist_list_var = lemmatized;
        SubLObject mapping = NIL;
        mapping = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != Strings.stringE(mapping.first(), mapping.rest(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                rplacd(mapping, morphology.plural_noun_to_sg(mapping.rest(), UNPROVIDED));
            }
            cdolist_list_var = cdolist_list_var.rest();
            mapping = cdolist_list_var.first();
        } 
        return lemmatized;
    }

    public static SubLObject definitional_question_extract_method(final SubLObject self, final SubLObject passage) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_definitional_question_method = NIL;
        final SubLObject v_parser = question.get_question_parser(self);
        final SubLObject parse = question.get_question_parse(self);
        try {
            thread.throwStack.push($sym71$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
            try {
                assert NIL != search_engine.abstract_passage_p(passage) : "search_engine.abstract_passage_p(passage) " + "CommonSymbols.NIL != search_engine.abstract_passage_p(passage) " + passage;
                final SubLObject terms = cons(methods.funcall_instance_method_with_0_args(self, GET_FOCUS), methods.funcall_instance_method_with_0_args(self, GET_FOCUS_VARIANTS));
                final SubLObject passage_string = methods.funcall_instance_method_with_0_args(passage, GET_CONTENT);
                final SubLObject shallow_parses = NIL;
                final SubLObject deep_parse = methods.funcall_instance_method_with_1_args(v_parser, PARSE, passage_string);
                final SubLObject answers0 = NIL;
                SubLObject answers2 = NIL;
                if (NIL == answers2) {
                    SubLObject csome_list_var;
                    SubLObject string_cmp;
                    for (csome_list_var = $list77, string_cmp = NIL, string_cmp = csome_list_var.first(); (NIL == answers2) && (NIL != csome_list_var); answers2 = methods.funcall_instance_method_with_3_args(self, EXTRACT_VIA_DEEP_PARSE, deep_parse, passage, string_cmp) , csome_list_var = csome_list_var.rest() , string_cmp = csome_list_var.first()) {
                    }
                }
                answers2 = append(answers0, answers2);
                answers2 = union(answers2, methods.funcall_instance_method_with_1_args(self, GET_PRE_NOMINAL_DESCRIPTION_VIA_LINK, passage), symbol_function(EQUAL), UNPROVIDED);
                sublisp_throw($sym71$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, answers2);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    question.set_question_parser(self, v_parser);
                    question.set_question_parse(self, parse);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_definitional_question_method = Errors.handleThrowable(ccatch_env_var, $sym71$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_definitional_question_method;
    }

    public static SubLObject definitional_question_extract_via_deep_parse_method(final SubLObject self, final SubLObject passage_parse, final SubLObject passage, final SubLObject string_cmp) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_definitional_question_method = NIL;
        final SubLObject max_confidence = question.get_question_max_confidence(self);
        try {
            thread.throwStack.push($sym82$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
            try {
                final SubLObject terms = cons(methods.funcall_instance_method_with_0_args(self, GET_FOCUS), methods.funcall_instance_method_with_0_args(self, GET_FOCUS_VARIANTS));
                final SubLObject extractors = $list83;
                SubLObject foundP = NIL;
                SubLObject answers = NIL;
                if (NIL != parse_tree.parse_tree_p(passage_parse)) {
                    final SubLObject stack = stacks.create_stack();
                    final SubLObject order_var = $DFR2L;
                    final SubLObject possible_orders = list($DFL2R, $DFR2L);
                    SubLObject subtree = NIL;
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.memberP(order_var, possible_orders, symbol_function(EQ), UNPROVIDED))) {
                        Errors.error($str86$_S_is_not_one_of__S, order_var, possible_orders);
                    }
                    stacks.stack_push(passage_parse, stack);
                    while ((NIL == stacks.stack_empty_p(stack)) && (NIL == answers)) {
                        subtree = stacks.stack_pop(stack);
                        if (NIL != parse_tree.phrase_tree_p(subtree)) {
                            foundP = NIL;
                            if (NIL == foundP) {
                                SubLObject csome_list_var = extractors;
                                SubLObject extractor = NIL;
                                extractor = csome_list_var.first();
                                while ((NIL == foundP) && (NIL != csome_list_var)) {
                                    if (NIL == foundP) {
                                        SubLObject csome_list_var_$2 = terms;
                                        SubLObject v_term = NIL;
                                        v_term = csome_list_var_$2.first();
                                        while ((NIL == foundP) && (NIL != csome_list_var_$2)) {
                                            if (NIL != v_term) {
                                                SubLObject cdolist_list_var = methods.funcall_instance_method_with_3_args(self, extractor, v_term, subtree, string_cmp);
                                                SubLObject description = NIL;
                                                description = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    answers = cons(answer.new_text_answer(self, methods.funcall_instance_method_with_0_args(description, GET_STRING), passage, max_confidence, description), answers);
                                                    foundP = T;
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    description = cdolist_list_var.first();
                                                } 
                                            }
                                            csome_list_var_$2 = csome_list_var_$2.rest();
                                            v_term = csome_list_var_$2.first();
                                        } 
                                    }
                                    csome_list_var = csome_list_var.rest();
                                    extractor = csome_list_var.first();
                                } 
                            }
                        }
                        if (NIL != parse_tree.phrase_tree_p(subtree)) {
                            final SubLObject vector_var = parse_tree.get_phrase_tree_daughters(subtree);
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
                sublisp_throw($sym82$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, answers);
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
            catch_var_for_definitional_question_method = Errors.handleThrowable(ccatch_env_var, $sym82$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_definitional_question_method;
    }

    public static SubLObject definitional_question_get_focus_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_definitional_question_method = NIL;
        final SubLObject parse = question.get_question_parse(self);
        try {
            thread.throwStack.push($sym90$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
            try {
                SubLObject focus_tree = (NIL != parse_tree.frag_tree_p(parse)) ? NIL : methods.funcall_instance_method_with_0_args(parse, GET_SUBJECT);
                if (((NIL != parse_tree.whnp_tree_p(focus_tree)) && methods.funcall_instance_method_with_0_args(focus_tree, DAUGHTER_COUNT).numE(ONE_INTEGER)) && (NIL != methods.funcall_instance_method_with_0_args(parse, GET_OBJECTS))) {
                    focus_tree = methods.funcall_instance_method_with_0_args(parse, GET_OBJECTS).first();
                }
                if (NIL != focus_tree) {
                    if (NIL != word_tree.determiner_word_tree_p(methods.funcall_instance_method_with_1_args(focus_tree, GET_DAUGHTER, ZERO_INTEGER))) {
                        sublisp_throw($sym90$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, string_utilities.bunge(Mapping.mapcar(GET_PARSE_TREE_STRING, methods.funcall_instance_method_with_0_args(focus_tree, YIELD).rest()), UNPROVIDED));
                    } else {
                        sublisp_throw($sym90$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, methods.funcall_instance_method_with_0_args(focus_tree, GET_STRING));
                    }
                } else {
                    sublisp_throw($sym90$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, NIL);
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    question.set_question_parse(self, parse);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_definitional_question_method = Errors.handleThrowable(ccatch_env_var, $sym90$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_definitional_question_method;
    }

    public static SubLObject definitional_question_get_focus_variants_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_definitional_question_method = NIL;
        final SubLObject parse = question.get_question_parse(self);
        try {
            thread.throwStack.push($sym95$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
            try {
                final SubLObject focus_tree = (NIL != parse_tree.frag_tree_p(parse)) ? NIL : methods.funcall_instance_method_with_0_args(parse, GET_SUBJECT);
                final SubLObject focus_head = (NIL != focus_tree) ? methods.funcall_instance_method_with_0_args(focus_tree, GET_HEAD) : NIL;
                final SubLObject focus_pos = (NIL != focus_head) ? methods.funcall_instance_method_with_0_args(focus_head, GET_CATEGORY) : NIL;
                SubLObject variants = NIL;
                final SubLObject pcase_var = focus_pos;
                if (pcase_var.eql($NN)) {
                    variants = cons(morphology.pluralize_string(definitional_question_get_focus_method(self), UNPROVIDED), variants);
                } else
                    if (pcase_var.eql($NNS)) {
                        variants = cons(morphology.plural_noun_to_sg(definitional_question_get_focus_method(self), UNPROVIDED), variants);
                    }

                sublisp_throw($sym95$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, variants);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    question.set_question_parse(self, parse);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_definitional_question_method = Errors.handleThrowable(ccatch_env_var, $sym95$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_definitional_question_method;
    }

    public static SubLObject definitional_question_answer_types_method(final SubLObject self) {
        return list(NIL);
    }

    public static SubLObject definitional_question_answer_cardinality_method(final SubLObject self) {
        return TEN_INTEGER;
    }

    public static SubLObject definitional_question_template_param_table_method(final SubLObject self, final SubLObject wh_word) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_definitional_question_method = NIL;
        final SubLObject thing_template_parameters = get_definitional_question_thing_template_parameters(self);
        final SubLObject person_template_parameters = get_definitional_question_person_template_parameters(self);
        final SubLObject general_template_parameters = get_definitional_question_general_template_parameters(self);
        try {
            thread.throwStack.push($sym106$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
            try {
                SubLObject res = NIL;
                if (wh_word.equalp($$$who)) {
                    res = append(general_template_parameters, person_template_parameters);
                } else
                    if (wh_word.equalp($$$what)) {
                        res = append(general_template_parameters, thing_template_parameters);
                    }

                sublisp_throw($sym106$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, acons($str107$_FOCUS_, cons(methods.funcall_instance_method_with_0_args(self, GET_FOCUS), methods.funcall_instance_method_with_0_args(self, GET_FOCUS_VARIANTS)), res));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_definitional_question_thing_template_parameters(self, thing_template_parameters);
                    set_definitional_question_person_template_parameters(self, person_template_parameters);
                    set_definitional_question_general_template_parameters(self, general_template_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_definitional_question_method = Errors.handleThrowable(ccatch_env_var, $sym106$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_definitional_question_method;
    }

    public static SubLObject instantiate_templates(final SubLObject templates, final SubLObject param_table) {
        SubLObject res = NIL;
        SubLObject cdolist_list_var = templates;
        SubLObject template = NIL;
        template = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            res = append(res, template_instances_for_param_table(template, param_table));
            cdolist_list_var = cdolist_list_var.rest();
            template = cdolist_list_var.first();
        } 
        return res;
    }

    public static SubLObject template_instances_for_param_table(final SubLObject template, final SubLObject param_table) {
        if (NIL == param_table) {
            return list(template);
        }
        final SubLObject v_bindings = param_table.first();
        final SubLObject param = v_bindings.first();
        final SubLObject args = v_bindings.rest();
        return instantiate_templates(template_instances_for_param(template, param, args), param_table.rest());
    }

    public static SubLObject template_instances_for_param(final SubLObject template, final SubLObject param, final SubLObject args) {
        SubLObject res = NIL;
        SubLObject cdolist_list_var = args;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            res = cons(string_utilities.string_substitute(arg, param, template, UNPROVIDED), res);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return reverse(remove_duplicates(res, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject definitional_question_nrestr_appositive_description_method(final SubLObject self, final SubLObject v_term, final SubLObject tree, SubLObject string_compare) {
        if (string_compare == UNPROVIDED) {
            string_compare = EQUAL;
        }
        final SubLObject num_daughters = methods.funcall_instance_method_with_0_args(tree, DAUGHTER_COUNT);
        if (!num_daughters.numGE(TWO_INTEGER)) {
            return NIL;
        }
        final SubLObject first_daughter = methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER);
        final SubLObject second_daughter = methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ONE_INTEGER);
        if ((methods.funcall_instance_method_with_0_args(tree, GET_CATEGORY) == $NP) && (methods.funcall_instance_method_with_0_args(first_daughter, GET_CATEGORY) == $NP)) {
            if (NIL != question.np_term_match(first_daughter, v_term, string_compare)) {
                if ((num_daughters.numGE(THREE_INTEGER) && num_daughters.numLE(FOUR_INTEGER)) && (NIL != member(methods.funcall_instance_method_with_0_args(second_daughter, GET_CATEGORY), $list114, EQ, UNPROVIDED))) {
                    final SubLObject potential_nrestr_appositive = methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, TWO_INTEGER);
                    if (methods.funcall_instance_method_with_0_args(potential_nrestr_appositive, GET_CATEGORY) == $NP) {
                        return list(potential_nrestr_appositive);
                    }
                }
                if (((num_daughters.numE(TWO_INTEGER) && (methods.funcall_instance_method_with_0_args(second_daughter, GET_CATEGORY) == $PRN)) && methods.funcall_instance_method_with_0_args(second_daughter, DAUGHTER_COUNT).numE(THREE_INTEGER)) && (NIL != member(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(second_daughter, GET_DAUGHTER, ZERO_INTEGER), GET_CATEGORY), $list116, EQ, UNPROVIDED))) {
                    final SubLObject potential_nrestr_appositive = methods.funcall_instance_method_with_1_args(second_daughter, GET_DAUGHTER, ONE_INTEGER);
                    if (methods.funcall_instance_method_with_0_args(potential_nrestr_appositive, GET_CATEGORY) == $NP) {
                        return list(potential_nrestr_appositive);
                    }
                }
            }
            if (num_daughters.numE(FOUR_INTEGER)) {
                final SubLObject third_daughter = methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, TWO_INTEGER);
                final SubLObject fourth_daughter = methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, THREE_INTEGER);
                if (((methods.funcall_instance_method_with_0_args(third_daughter, GET_CATEGORY) == $NP) && (NIL != question.np_term_match(third_daughter, v_term, string_compare))) && (NIL != member(methods.funcall_instance_method_with_0_args(fourth_daughter, GET_CATEGORY), $list114, EQ, UNPROVIDED))) {
                    return list(first_daughter);
                }
            }
        }
        return NIL;
    }

    public static SubLObject definitional_question_equality_description_method(final SubLObject self, final SubLObject v_term, final SubLObject tree, SubLObject string_compare) {
        if (string_compare == UNPROVIDED) {
            string_compare = EQUAL;
        }
        if (((((((((((methods.funcall_instance_method_with_0_args(tree, GET_CATEGORY) == $S) && methods.funcall_instance_method_with_0_args(tree, DAUGHTER_COUNT).numGE(TWO_INTEGER)) && methods.funcall_instance_method_with_0_args(tree, DAUGHTER_COUNT).numLE(THREE_INTEGER)) && (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_CATEGORY) == $NP)) && (NIL != question.np_term_match(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), v_term, string_compare))) && (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ONE_INTEGER), GET_CATEGORY) == $VP)) && (NIL != methods.funcall_instance_method_with_1_args(tree, GET_DESCENDANT, $list123))) && (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DESCENDANT, $list123), GET_CATEGORY) == $AUX)) && (NIL != member(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DESCENDANT, $list123), GET_STRING), $list47, EQUALP, UNPROVIDED))) && (NIL != methods.funcall_instance_method_with_1_args(tree, GET_DESCENDANT, $list125))) && (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DESCENDANT, $list125), GET_CATEGORY) == $NP)) {
            return list(methods.funcall_instance_method_with_1_args(tree, GET_DESCENDANT, $list125));
        }
        return NIL;
    }

    public static SubLObject definitional_question_called_x_description_method(final SubLObject self, final SubLObject v_term, final SubLObject tree, SubLObject string_compare) {
        if (string_compare == UNPROVIDED) {
            string_compare = EQUAL;
        }
        if (((((((((methods.funcall_instance_method_with_0_args(tree, GET_CATEGORY) == $NP) && (NIL != methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER))) && (NIL != methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ONE_INTEGER))) && (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_CATEGORY) == $NP)) && (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ONE_INTEGER), GET_CATEGORY) == $VP)) && (NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ONE_INTEGER), GET_HEAD))) && (NIL != funcall(string_compare, methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ONE_INTEGER), GET_HEAD), GET_STRING), $$$called))) && (NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ONE_INTEGER), GET_HEAD), GET_OBJECTS))) && (NIL != funcall(string_compare, methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ONE_INTEGER), GET_HEAD), GET_OBJECTS).first(), GET_STRING), v_term))) {
            return list(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER));
        }
        return NIL;
    }

    public static SubLObject definitional_question_restr_relative_clause_description_method(final SubLObject self, final SubLObject v_term, final SubLObject passage_tree, SubLObject string_compare) {
        if (string_compare == UNPROVIDED) {
            string_compare = EQUAL;
        }
        if (((((((((((methods.funcall_instance_method_with_0_args(passage_tree, GET_CATEGORY) == $NP) && methods.funcall_instance_method_with_0_args(passage_tree, DAUGHTER_COUNT).numGE(THREE_INTEGER)) && methods.funcall_instance_method_with_0_args(passage_tree, DAUGHTER_COUNT).numLE(FOUR_INTEGER)) && (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(passage_tree, GET_DAUGHTER, ZERO_INTEGER), GET_CATEGORY) == $NP)) && (NIL != question.np_term_match(methods.funcall_instance_method_with_1_args(passage_tree, GET_DAUGHTER, ZERO_INTEGER), v_term, string_compare))) && (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(passage_tree, GET_DAUGHTER, ONE_INTEGER), GET_CATEGORY) == $kw134$_)) && (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(passage_tree, GET_DAUGHTER, TWO_INTEGER), GET_CATEGORY) == $SBAR)) && methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(passage_tree, GET_DAUGHTER, TWO_INTEGER), DAUGHTER_COUNT).numGE(TWO_INTEGER)) && (NIL != methods.funcall_instance_method_with_1_args(passage_tree, GET_DESCENDANT, $list136))) && (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(passage_tree, GET_DESCENDANT, $list136), GET_CATEGORY) == $WHNP)) && (NIL != methods.funcall_instance_method_with_1_args(passage_tree, GET_DESCENDANT, $list138))) {
            return list(methods.funcall_instance_method_with_1_args(passage_tree, GET_DESCENDANT, $list138));
        }
        return NIL;
    }

    public static SubLObject definitional_question_restr_appositive_description_method(final SubLObject self, final SubLObject v_term, final SubLObject tree, SubLObject string_compare) {
        if (string_compare == UNPROVIDED) {
            string_compare = EQUAL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_definitional_question_method = NIL;
        final SubLObject leading_appositive_blacklist = get_definitional_question_leading_appositive_blacklist(self);
        final SubLObject v_parser = question.get_question_parser(self);
        final SubLObject parse = question.get_question_parse(self);
        final SubLObject string = question.get_question_string(self);
        try {
            thread.throwStack.push($sym142$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
            try {
                final SubLObject string_$3 = methods.funcall_instance_method_with_0_args(tree, GET_STRING);
                final SubLObject string_length = length(string_$3);
                final SubLObject term_length = length(v_term);
                final SubLObject category = methods.funcall_instance_method_with_0_args(tree, GET_CATEGORY);
                SubLObject description = NIL;
                SubLObject parse_$4 = NIL;
                if (((((NIL != subl_promotions.memberP(category, $list143, EQ, UNPROVIDED)) && (NIL != methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER))) && (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_CATEGORY) != $DT)) && (NIL != question.np_term_match(tree, v_term, string_compare))) && length(string_$3).numG(length(v_term))) {
                    description = string_utilities.substring(string_$3, ZERO_INTEGER, subtract(string_length, number_utilities.f_1X(term_length)));
                    parse_$4 = methods.funcall_instance_method_with_1_args(v_parser, PARSE, description);
                    if ((((NIL != parse_tree.phrase_tree_p(parse_$4)) && (NIL != member(methods.funcall_instance_method_with_0_args(parse_$4, GET_CATEGORY), $list143, UNPROVIDED, UNPROVIDED))) && (NIL == subl_promotions.memberP(methods.funcall_instance_method_with_0_args(parse_$4, GET_STRING), leading_appositive_blacklist, EQUALP, UNPROVIDED))) && (NIL == lexicon_utilities.first_name_p(methods.funcall_instance_method_with_0_args(parse_$4, GET_STRING)))) {
                        sublisp_throw($sym142$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, list(parse_$4));
                    }
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_definitional_question_leading_appositive_blacklist(self, leading_appositive_blacklist);
                    question.set_question_parser(self, v_parser);
                    question.set_question_parse(self, parse);
                    question.set_question_string(self, string);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_definitional_question_method = Errors.handleThrowable(ccatch_env_var, $sym142$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_definitional_question_method;
    }

    public static SubLObject pre_nominal_title_via_link(final SubLObject link_word) {
        assert NIL != linkage.link_word_p(link_word) : "linkage.link_word_p(link_word) " + "CommonSymbols.NIL != linkage.link_word_p(link_word) " + link_word;
        SubLObject cdolist_list_var;
        final SubLObject title_link_words = cdolist_list_var = methods.funcall_instance_method_with_2_args(link_word, GET_DIRECTLY_RELATED, $G_PATTERN, $LEFT);
        SubLObject title_link_word = NIL;
        title_link_word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != methods.funcall_instance_method_with_2_args(title_link_word, GET_DIRECTLY_RELATED, $X_I_PATTERN, $RIGHT)) {
                return methods.funcall_instance_method_with_0_args(title_link_word, GET_STRING);
            }
            cdolist_list_var = cdolist_list_var.rest();
            title_link_word = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject np_head_modified_by_appositive(final SubLObject link_word, final SubLObject v_term) {
        assert NIL != linkage.link_word_p(link_word) : "linkage.link_word_p(link_word) " + "CommonSymbols.NIL != linkage.link_word_p(link_word) " + link_word;
        assert NIL != stringp(v_term) : "Types.stringp(v_term) " + "CommonSymbols.NIL != Types.stringp(v_term) " + v_term;
        if ((NIL == methods.funcall_instance_method_with_2_args(link_word, GET_DIRECTLY_RELATED, $X_D_PATTERN, $LEFT)) || (NIL == methods.funcall_instance_method_with_2_args(link_word, GET_DIRECTLY_RELATED, $X_C_PATTERN, $RIGHT))) {
            return NIL;
        }
        final SubLObject head = methods.funcall_instance_method_with_2_args(link_word, GET_DIRECTLY_RELATED, $MX_PATTERN, $LEFT).first();
        if (NIL != head) {
            final SubLObject modifiers = methods.funcall_instance_method_with_0_args(head, GET_MODIFIERS);
            SubLObject result_words = list(head);
            SubLObject cdolist_list_var = modifiers;
            SubLObject modifier = NIL;
            modifier = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == string_utilities.substringP(methods.funcall_instance_method_with_0_args(modifier, GET_STRING), v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    final SubLObject item_var = modifier;
                    if (NIL == member(item_var, result_words, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        result_words = cons(item_var, result_words);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                modifier = cdolist_list_var.first();
            } 
            return list(head, result_words);
        }
        return NIL;
    }

    public static SubLObject get_pre_nominal_description(final SubLObject passage_string, final SubLObject head_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject head_tokens = string_utilities.split_string(head_string, UNPROVIDED);
        SubLObject v_linkage = NIL;
        SubLObject result_words = NIL;
        SubLObject result_strings = NIL;
        SubLObject results = NIL;
        SubLObject error_msg = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject lexicon = cyclifier_lexicon.new_cyclifier_lexicon();
                    SubLObject error = NIL;
                    try {
                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$5 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                v_linkage = linkage.new_linkage(passage_string, list($LEXICON, lexicon));
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$5, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    } finally {
                        thread.throwStack.pop();
                    }
                    if (NIL != error) {
                        parser.ensure_link_server_running();
                        v_linkage = linkage.new_linkage(passage_string, list($LEXICON, lexicon));
                    }
                } catch (final Throwable catch_var2) {
                    Errors.handleThrowable(catch_var2, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var2) {
            error_msg = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_msg) {
            Errors.warn($str159$Error_caught_in_GET_PRE_NOMINAL_D, error_msg);
        }
        if (NIL != v_linkage) {
            SubLObject cdolist_list_var = cons(head_string, head_tokens);
            SubLObject word = NIL;
            word = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$6;
                final SubLObject link_words = cdolist_list_var_$6 = linkage.search_atmost_n_link_words(v_linkage, word, THREE_INTEGER);
                SubLObject link_word = NIL;
                link_word = cdolist_list_var_$6.first();
                while (NIL != cdolist_list_var_$6) {
                    final SubLObject title = pre_nominal_title_via_link(link_word);
                    final SubLObject head = np_head_modified_by_appositive(link_word, head_string);
                    if (NIL != title) {
                        final SubLObject item_var = title;
                        if (NIL == member(item_var, results, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            results = cons(item_var, results);
                        }
                    }
                    if (NIL != head) {
                        final SubLObject item_var = methods.funcall_instance_method_with_0_args(head.first(), GET_STRING);
                        if (NIL == member(item_var, results, symbol_function(EQL), symbol_function(IDENTITY))) {
                            results = cons(item_var, results);
                        }
                        result_words = second(head);
                    }
                    SubLObject cdolist_list_var_$7;
                    final SubLObject related_lws = cdolist_list_var_$7 = cconcatenate(methods.funcall_instance_method_with_2_args(link_word, GET_DIRECTLY_RELATED, $GN_PATTERN, $LEFT), new SubLObject[]{ methods.funcall_instance_method_with_2_args(link_word, GET_DIRECTLY_RELATED, $G_PATTERN, $LEFT), methods.funcall_instance_method_with_2_args(link_word, GET_DIRECTLY_RELATED, $AN_PATTERN, $LEFT) });
                    SubLObject related_lw = NIL;
                    related_lw = cdolist_list_var_$7.first();
                    while (NIL != cdolist_list_var_$7) {
                        final SubLObject item_var2 = methods.funcall_instance_method_with_0_args(related_lw, GET_STRING);
                        if (NIL == member(item_var2, results, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            results = cons(item_var2, results);
                        }
                        result_words = cons(related_lw, result_words);
                        result_words = cconcatenate(result_words, methods.funcall_instance_method_with_0_args(related_lw, GET_MODIFIERS));
                        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                        related_lw = cdolist_list_var_$7.first();
                    } 
                    cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                    link_word = cdolist_list_var_$6.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                word = cdolist_list_var.first();
            } 
        }
        SubLObject cdolist_list_var = Sort.sort(remove_duplicates(result_words, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), LINK_WORD_AFTER, UNPROVIDED);
        SubLObject result_word = NIL;
        result_word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result_strings = cons(methods.funcall_instance_method_with_0_args(result_word, GET_STRING), result_strings);
            cdolist_list_var = cdolist_list_var.rest();
            result_word = cdolist_list_var.first();
        } 
        if (NIL != result_strings) {
            final SubLObject bunged_result = string_utilities.bunge(result_strings, UNPROVIDED);
            if (NIL != string_utilities.substringP(bunged_result, passage_string, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED)) {
                final SubLObject item_var3 = bunged_result;
                if (NIL == member(item_var3, results, symbol_function(EQL), symbol_function(IDENTITY))) {
                    results = cons(item_var3, results);
                }
            }
        }
        return results;
    }

    public static SubLObject definitional_question_get_pre_nominal_description_via_link_method(final SubLObject self, final SubLObject passage) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_definitional_question_method = NIL;
        final SubLObject max_confidence = question.get_question_max_confidence(self);
        try {
            thread.throwStack.push($sym164$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
            try {
                final SubLObject terms = cons(methods.funcall_instance_method_with_0_args(self, GET_FOCUS), methods.funcall_instance_method_with_0_args(self, GET_FOCUS_VARIANTS));
                final SubLObject passage_string = methods.funcall_instance_method_with_0_args(passage, GET_CONTENT);
                SubLObject result_strings = NIL;
                SubLObject results = NIL;
                if (NIL == result_strings) {
                    SubLObject csome_list_var = terms;
                    SubLObject v_term = NIL;
                    v_term = csome_list_var.first();
                    while ((NIL == result_strings) && (NIL != csome_list_var)) {
                        if (NIL != v_term) {
                            result_strings = get_pre_nominal_description(passage_string, v_term);
                        }
                        csome_list_var = csome_list_var.rest();
                        v_term = csome_list_var.first();
                    } 
                }
                SubLObject cdolist_list_var = result_strings;
                SubLObject result_string = NIL;
                result_string = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject item_var = answer.new_text_answer(self, result_string, passage, max_confidence, UNPROVIDED);
                    if (NIL == member(item_var, results, symbol_function(EQL), symbol_function(IDENTITY))) {
                        results = cons(item_var, results);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    result_string = cdolist_list_var.first();
                } 
                sublisp_throw($sym164$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD, results);
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
            catch_var_for_definitional_question_method = Errors.handleThrowable(ccatch_env_var, $sym164$OUTER_CATCH_FOR_DEFINITIONAL_QUESTION_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_definitional_question_method;
    }

    public static SubLObject entities_for_cns_topic(final SubLObject query_string) {
        assert NIL != stringp(query_string) : "Types.stringp(query_string) " + "CommonSymbols.NIL != Types.stringp(query_string) " + query_string;
        final SubLObject entities_hash = make_hash_table($int$32, symbol_function(EQUALP), UNPROVIDED);
        SubLObject entities_list = NIL;
        SubLObject cdolist_list_var;
        final SubLObject passages = cdolist_list_var = search_engine.ask_lemur(query_string, TEN_INTEGER, TEN_INTEGER, ONE_INTEGER, $str167$_cyc_projects_aquaint_lemur_indic, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject pass = NIL;
        pass = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject text = third(pass);
            final SubLObject entities = external_interfaces.resporatorXX(text);
            format(T, $str168$___S__, text);
            SubLObject cdolist_list_var_$8 = entities;
            SubLObject ent = NIL;
            ent = cdolist_list_var_$8.first();
            while (NIL != cdolist_list_var_$8) {
                hash_table_utilities.cinc_hash(ent, entities_hash, UNPROVIDED, UNPROVIDED);
                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                ent = cdolist_list_var_$8.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            pass = cdolist_list_var.first();
        } 
        SubLObject k = NIL;
        SubLObject v = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(entities_hash);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                k = getEntryKey(cdohash_entry);
                v = getEntryValue(cdohash_entry);
                if (NIL != subl_promotions.memberP(k.first(), $list169, UNPROVIDED, UNPROVIDED)) {
                    entities_list = cons(list(k, v), entities_list);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return Sort.sort(entities_list, $sym170$_, SECOND);
    }

    public static SubLObject research(final SubLObject query_string) {
        SubLObject answers = NIL;
        SubLObject cdolist_list_var = entities_for_cns_topic(query_string);
        SubLObject ent = NIL;
        ent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject type = caar(ent);
            final SubLObject string = ent.first().rest();
            SubLObject v_question = NIL;
            if (NIL != subl_promotions.memberP(type, $list169, EQUAL, UNPROVIDED)) {
                v_question = question.new_question(format(NIL, $str172$_a_is__a_, type.equal(PERSON) ? $$$Who : $$$What, string), list($$$CNSjan2004), DEFINITIONAL_QUESTION);
                princ($str177$_________________________________, UNPROVIDED);
                terpri(UNPROVIDED);
                princ(v_question, UNPROVIDED);
                terpri(UNPROVIDED);
                terpri(UNPROVIDED);
                SubLObject cdolist_list_var_$9 = methods.funcall_instance_method_with_0_args(v_question, ANSWER);
                SubLObject v_answer = NIL;
                v_answer = cdolist_list_var_$9.first();
                while (NIL != cdolist_list_var_$9) {
                    princ(v_answer, UNPROVIDED);
                    terpri(UNPROVIDED);
                    answers = cons(v_answer, answers);
                    cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                    v_answer = cdolist_list_var_$9.first();
                } 
                terpri(UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            ent = cdolist_list_var.first();
        } 
        return answers;
    }

    public static SubLObject definitional_question_test_helper(final SubLObject passage_string, final SubLObject focus_string) {
        final SubLObject passage = search_engine.new_simple_passage(passage_string);
        final SubLObject v_parser = parser.new_stanford_parser(UNPROVIDED, UNPROVIDED);
        final SubLObject question_string = cconcatenate($$$Who_is_, new SubLObject[]{ focus_string, $str180$_ });
        final SubLObject question_parse = methods.funcall_instance_method_with_1_args(v_parser, PARSE, question_string);
        final SubLObject v_question = object.new_class_instance(DEFINITIONAL_QUESTION);
        SubLObject answers = NIL;
        SubLObject definitions = NIL;
        question.set_question_parser(v_question, v_parser);
        question.set_question_string(v_question, question_string);
        question.set_question_parse(v_question, question_parse);
        SubLObject cdolist_list_var;
        answers = cdolist_list_var = methods.funcall_instance_method_with_1_args(v_question, EXTRACT, passage);
        SubLObject v_answer = NIL;
        v_answer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject string_answer = methods.funcall_instance_method_with_0_args(v_answer, GET_CONTENT);
            if (NIL != string_utilities.non_empty_stringP(string_answer)) {
                definitions = cons(string_answer, definitions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_answer = cdolist_list_var.first();
        } 
        return definitions;
    }

    public static SubLObject this_equal(final SubLObject thing1, final SubLObject thing2) {
        return equalp(thing1, thing2);
    }

    public static SubLObject pre_nominal_test_func(final SubLObject thing1, final SubLObject thing2) {
        return intersection(thing1, thing2, symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject declare_definitional_question_file() {
        declareFunction(me, "get_definitional_question_leading_appositive_blacklist", "GET-DEFINITIONAL-QUESTION-LEADING-APPOSITIVE-BLACKLIST", 1, 0, false);
        declareFunction(me, "set_definitional_question_leading_appositive_blacklist", "SET-DEFINITIONAL-QUESTION-LEADING-APPOSITIVE-BLACKLIST", 2, 0, false);
        declareFunction(me, "get_definitional_question_thing_template_parameters", "GET-DEFINITIONAL-QUESTION-THING-TEMPLATE-PARAMETERS", 1, 0, false);
        declareFunction(me, "set_definitional_question_thing_template_parameters", "SET-DEFINITIONAL-QUESTION-THING-TEMPLATE-PARAMETERS", 2, 0, false);
        declareFunction(me, "get_definitional_question_organization_template_parameters", "GET-DEFINITIONAL-QUESTION-ORGANIZATION-TEMPLATE-PARAMETERS", 1, 0, false);
        declareFunction(me, "set_definitional_question_organization_template_parameters", "SET-DEFINITIONAL-QUESTION-ORGANIZATION-TEMPLATE-PARAMETERS", 2, 0, false);
        declareFunction(me, "get_definitional_question_person_template_parameters", "GET-DEFINITIONAL-QUESTION-PERSON-TEMPLATE-PARAMETERS", 1, 0, false);
        declareFunction(me, "set_definitional_question_person_template_parameters", "SET-DEFINITIONAL-QUESTION-PERSON-TEMPLATE-PARAMETERS", 2, 0, false);
        declareFunction(me, "get_definitional_question_general_template_parameters", "GET-DEFINITIONAL-QUESTION-GENERAL-TEMPLATE-PARAMETERS", 1, 0, false);
        declareFunction(me, "set_definitional_question_general_template_parameters", "SET-DEFINITIONAL-QUESTION-GENERAL-TEMPLATE-PARAMETERS", 2, 0, false);
        declareFunction(me, "get_definitional_question_glimpse_thing_templates", "GET-DEFINITIONAL-QUESTION-GLIMPSE-THING-TEMPLATES", 1, 0, false);
        declareFunction(me, "set_definitional_question_glimpse_thing_templates", "SET-DEFINITIONAL-QUESTION-GLIMPSE-THING-TEMPLATES", 2, 0, false);
        declareFunction(me, "get_definitional_question_glimpse_general_templates", "GET-DEFINITIONAL-QUESTION-GLIMPSE-GENERAL-TEMPLATES", 1, 0, false);
        declareFunction(me, "set_definitional_question_glimpse_general_templates", "SET-DEFINITIONAL-QUESTION-GLIMPSE-GENERAL-TEMPLATES", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_definitional_question_class", "SUBLOOP-RESERVED-INITIALIZE-DEFINITIONAL-QUESTION-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_definitional_question_instance", "SUBLOOP-RESERVED-INITIALIZE-DEFINITIONAL-QUESTION-INSTANCE", 1, 0, false);
        declareFunction(me, "definitional_question_p", "DEFINITIONAL-QUESTION-P", 1, 0, false);
        declareFunction(me, "definitional_question_isaP_method", "DEFINITIONAL-QUESTION-ISA?-METHOD", 2, 0, false);
        declareFunction(me, "definitional_question_querify_method", "DEFINITIONAL-QUESTION-QUERIFY-METHOD", 1, 0, false);
        declareFunction(me, "definitional_question_answer_wordnet_method", "DEFINITIONAL-QUESTION-ANSWER-WORDNET-METHOD", 1, 0, false);
        declareFunction(me, "get_roots", "GET-ROOTS", 1, 0, false);
        declareFunction(me, "definitional_question_extract_method", "DEFINITIONAL-QUESTION-EXTRACT-METHOD", 2, 0, false);
        declareFunction(me, "definitional_question_extract_via_deep_parse_method", "DEFINITIONAL-QUESTION-EXTRACT-VIA-DEEP-PARSE-METHOD", 4, 0, false);
        declareFunction(me, "definitional_question_get_focus_method", "DEFINITIONAL-QUESTION-GET-FOCUS-METHOD", 1, 0, false);
        declareFunction(me, "definitional_question_get_focus_variants_method", "DEFINITIONAL-QUESTION-GET-FOCUS-VARIANTS-METHOD", 1, 0, false);
        declareFunction(me, "definitional_question_answer_types_method", "DEFINITIONAL-QUESTION-ANSWER-TYPES-METHOD", 1, 0, false);
        declareFunction(me, "definitional_question_answer_cardinality_method", "DEFINITIONAL-QUESTION-ANSWER-CARDINALITY-METHOD", 1, 0, false);
        declareFunction(me, "definitional_question_template_param_table_method", "DEFINITIONAL-QUESTION-TEMPLATE-PARAM-TABLE-METHOD", 2, 0, false);
        declareFunction(me, "instantiate_templates", "INSTANTIATE-TEMPLATES", 2, 0, false);
        declareFunction(me, "template_instances_for_param_table", "TEMPLATE-INSTANCES-FOR-PARAM-TABLE", 2, 0, false);
        declareFunction(me, "template_instances_for_param", "TEMPLATE-INSTANCES-FOR-PARAM", 3, 0, false);
        declareFunction(me, "definitional_question_nrestr_appositive_description_method", "DEFINITIONAL-QUESTION-NRESTR-APPOSITIVE-DESCRIPTION-METHOD", 3, 1, false);
        declareFunction(me, "definitional_question_equality_description_method", "DEFINITIONAL-QUESTION-EQUALITY-DESCRIPTION-METHOD", 3, 1, false);
        declareFunction(me, "definitional_question_called_x_description_method", "DEFINITIONAL-QUESTION-CALLED-X-DESCRIPTION-METHOD", 3, 1, false);
        declareFunction(me, "definitional_question_restr_relative_clause_description_method", "DEFINITIONAL-QUESTION-RESTR-RELATIVE-CLAUSE-DESCRIPTION-METHOD", 3, 1, false);
        declareFunction(me, "definitional_question_restr_appositive_description_method", "DEFINITIONAL-QUESTION-RESTR-APPOSITIVE-DESCRIPTION-METHOD", 3, 1, false);
        declareFunction(me, "pre_nominal_title_via_link", "PRE-NOMINAL-TITLE-VIA-LINK", 1, 0, false);
        declareFunction(me, "np_head_modified_by_appositive", "NP-HEAD-MODIFIED-BY-APPOSITIVE", 2, 0, false);
        declareFunction(me, "get_pre_nominal_description", "GET-PRE-NOMINAL-DESCRIPTION", 2, 0, false);
        declareFunction(me, "definitional_question_get_pre_nominal_description_via_link_method", "DEFINITIONAL-QUESTION-GET-PRE-NOMINAL-DESCRIPTION-VIA-LINK-METHOD", 2, 0, false);
        declareFunction(me, "entities_for_cns_topic", "ENTITIES-FOR-CNS-TOPIC", 1, 0, false);
        declareFunction(me, "research", "RESEARCH", 1, 0, false);
        declareFunction(me, "definitional_question_test_helper", "DEFINITIONAL-QUESTION-TEST-HELPER", 2, 0, false);
        declareFunction(me, "this_equal", "THIS-EQUAL", 2, 0, false);
        declareFunction(me, "pre_nominal_test_func", "PRE-NOMINAL-TEST-FUNC", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_definitional_question_file() {
        return NIL;
    }

    public static SubLObject setup_definitional_question_file() {
        classes.subloop_new_class(DEFINITIONAL_QUESTION, WH_QUESTION, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(DEFINITIONAL_QUESTION, NIL);
        classes.subloop_note_class_initialization_function(DEFINITIONAL_QUESTION, SUBLOOP_RESERVED_INITIALIZE_DEFINITIONAL_QUESTION_CLASS);
        classes.subloop_note_instance_initialization_function(DEFINITIONAL_QUESTION, SUBLOOP_RESERVED_INITIALIZE_DEFINITIONAL_QUESTION_INSTANCE);
        subloop_reserved_initialize_definitional_question_class(DEFINITIONAL_QUESTION);
        methods.methods_incorporate_class_method($sym38$ISA_, DEFINITIONAL_QUESTION, $list39, $list40, $list41);
        methods.subloop_register_class_method(DEFINITIONAL_QUESTION, $sym38$ISA_, $sym55$DEFINITIONAL_QUESTION_ISA__METHOD);
        methods.methods_incorporate_instance_method(QUERIFY, DEFINITIONAL_QUESTION, $list39, NIL, $list57);
        methods.subloop_register_instance_method(DEFINITIONAL_QUESTION, QUERIFY, DEFINITIONAL_QUESTION_QUERIFY_METHOD);
        methods.methods_incorporate_instance_method(ANSWER_WORDNET, DEFINITIONAL_QUESTION, $list39, NIL, $list63);
        methods.subloop_register_instance_method(DEFINITIONAL_QUESTION, ANSWER_WORDNET, DEFINITIONAL_QUESTION_ANSWER_WORDNET_METHOD);
        methods.methods_incorporate_instance_method(EXTRACT, DEFINITIONAL_QUESTION, $list39, $list69, $list70);
        methods.subloop_register_instance_method(DEFINITIONAL_QUESTION, EXTRACT, DEFINITIONAL_QUESTION_EXTRACT_METHOD);
        methods.methods_incorporate_instance_method(EXTRACT_VIA_DEEP_PARSE, DEFINITIONAL_QUESTION, $list39, $list80, $list81);
        methods.subloop_register_instance_method(DEFINITIONAL_QUESTION, EXTRACT_VIA_DEEP_PARSE, DEFINITIONAL_QUESTION_EXTRACT_VIA_DEEP_PARSE_METHOD);
        methods.methods_incorporate_instance_method(GET_FOCUS, DEFINITIONAL_QUESTION, $list88, NIL, $list89);
        methods.subloop_register_instance_method(DEFINITIONAL_QUESTION, GET_FOCUS, DEFINITIONAL_QUESTION_GET_FOCUS_METHOD);
        methods.methods_incorporate_instance_method(GET_FOCUS_VARIANTS, DEFINITIONAL_QUESTION, $list88, NIL, $list94);
        methods.subloop_register_instance_method(DEFINITIONAL_QUESTION, GET_FOCUS_VARIANTS, DEFINITIONAL_QUESTION_GET_FOCUS_VARIANTS_METHOD);
        methods.methods_incorporate_instance_method(ANSWER_TYPES, DEFINITIONAL_QUESTION, $list39, NIL, $list99);
        methods.subloop_register_instance_method(DEFINITIONAL_QUESTION, ANSWER_TYPES, DEFINITIONAL_QUESTION_ANSWER_TYPES_METHOD);
        methods.methods_incorporate_instance_method(ANSWER_CARDINALITY, DEFINITIONAL_QUESTION, $list39, NIL, $list102);
        methods.subloop_register_instance_method(DEFINITIONAL_QUESTION, ANSWER_CARDINALITY, DEFINITIONAL_QUESTION_ANSWER_CARDINALITY_METHOD);
        methods.methods_incorporate_instance_method(TEMPLATE_PARAM_TABLE, DEFINITIONAL_QUESTION, $list39, $list104, $list105);
        methods.subloop_register_instance_method(DEFINITIONAL_QUESTION, TEMPLATE_PARAM_TABLE, DEFINITIONAL_QUESTION_TEMPLATE_PARAM_TABLE_METHOD);
        methods.methods_incorporate_instance_method(NRESTR_APPOSITIVE_DESCRIPTION, DEFINITIONAL_QUESTION, $list110, $list111, $list112);
        methods.subloop_register_instance_method(DEFINITIONAL_QUESTION, NRESTR_APPOSITIVE_DESCRIPTION, DEFINITIONAL_QUESTION_NRESTR_APPOSITIVE_DESCRIPTION_METHOD);
        methods.methods_incorporate_instance_method(EQUALITY_DESCRIPTION, DEFINITIONAL_QUESTION, $list110, $list111, $list119);
        methods.subloop_register_instance_method(DEFINITIONAL_QUESTION, EQUALITY_DESCRIPTION, DEFINITIONAL_QUESTION_EQUALITY_DESCRIPTION_METHOD);
        methods.methods_incorporate_instance_method(CALLED_X_DESCRIPTION, DEFINITIONAL_QUESTION, $list110, $list111, $list128);
        methods.subloop_register_instance_method(DEFINITIONAL_QUESTION, CALLED_X_DESCRIPTION, DEFINITIONAL_QUESTION_CALLED_X_DESCRIPTION_METHOD);
        methods.methods_incorporate_instance_method(RESTR_RELATIVE_CLAUSE_DESCRIPTION, DEFINITIONAL_QUESTION, $list110, $list132, $list133);
        methods.subloop_register_instance_method(DEFINITIONAL_QUESTION, RESTR_RELATIVE_CLAUSE_DESCRIPTION, DEFINITIONAL_QUESTION_RESTR_RELATIVE_CLAUSE_DESCRIPTION_METHOD);
        methods.methods_incorporate_instance_method(RESTR_APPOSITIVE_DESCRIPTION, DEFINITIONAL_QUESTION, $list110, $list111, $list141);
        methods.subloop_register_instance_method(DEFINITIONAL_QUESTION, RESTR_APPOSITIVE_DESCRIPTION, DEFINITIONAL_QUESTION_RESTR_APPOSITIVE_DESCRIPTION_METHOD);
        methods.methods_incorporate_instance_method(GET_PRE_NOMINAL_DESCRIPTION_VIA_LINK, DEFINITIONAL_QUESTION, $list39, $list69, $list163);
        methods.subloop_register_instance_method(DEFINITIONAL_QUESTION, GET_PRE_NOMINAL_DESCRIPTION_VIA_LINK, DEFINITIONAL_QUESTION_GET_PRE_NOMINAL_DESCRIPTION_VIA_LINK_METHOD);
        define_test_case_table_int(GET_PRE_NOMINAL_DESCRIPTION, list(new SubLObject[]{ $TEST, symbol_function(PRE_NOMINAL_TEST_FUNC), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list189);
        define_test_case_table_int(DEFINITIONAL_QUESTION_TEST_HELPER, list(new SubLObject[]{ $TEST, THIS_EQUAL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, NIL }), $list192);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_definitional_question_file();
    }

    @Override
    public void initializeVariables() {
        init_definitional_question_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_definitional_question_file();
    }

    static {


































































































































































































    }
}

/**
 * Total time: 809 ms
 */
