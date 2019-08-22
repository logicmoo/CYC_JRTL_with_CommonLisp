package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.quirk.external_interfaces;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class semtrans_lexicon extends SubLTranslatedFile {
    public static final SubLFile me = new semtrans_lexicon();

    public static final String myName = "com.cyc.cycjava.cycl.semtrans_lexicon";

    public static final String myFingerPrint = "aeced5f5007023c463cc25fe7ceaffef698bf74eea4f337b84f8830544c4e096";

    // defparameter
    public static final SubLSymbol $manufacture_semtrans_assertionsP$ = makeSymbol("*MANUFACTURE-SEMTRANS-ASSERTIONS?*");

    // defparameter
    private static final SubLSymbol $semtrans_lexicon$ = makeSymbol("*SEMTRANS-LEXICON*");

    // defvar
    private static final SubLSymbol $default_verbal_lex_entry_literals$ = makeSymbol("*DEFAULT-VERBAL-LEX-ENTRY-LITERALS*");

    // defparameter
    // What learners should be available by default to semtrans-lexica?
    public static final SubLSymbol $semtrans_lexicon_learners$ = makeSymbol("*SEMTRANS-LEXICON-LEARNERS*");



    public static final SubLSymbol ABSTRACT_LEXICON = makeSymbol("ABSTRACT-LEXICON");

    public static final SubLList $list2 = list(new SubLObject[]{ list(makeSymbol("DEFAULT-KB-SPEC"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), reader_make_constant_shell(makeString("SemTransLexiconSpecification"))), list(makeSymbol("MY-TERM-LEXICON"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), NIL), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATE"), list(makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATE-VERBAL"), list(makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATE-NOMINAL"), list(makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATE-ADJECTIVAL"), list(makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATE-ADVERBIAL"), list(makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATE-VERBAL-SEMTRANS"), list(makeSymbol("STRING"), makeSymbol("KEYWORDS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FABRICATE-NOMINAL-SEMTRANS"), list(makeSymbol("STRING"), makeSymbol("KEYWORDS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NL-TRIE-ENTRY-TO-VERBAL-SEMTRANSES"), list(makeSymbol("ENTRY"), makeSymbol("KEYWORDS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-LEX-ENTRIES"), list(makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-WORD"), list(makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-NAME"), list(makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-TERM-PHRASES-ENTRY"), list(makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RESPORATOR-TO-LEX-ENTRIES"), list(makeSymbol("TYPE.STRING")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TERM-LEXICON"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TERM-LEXICON"), list(makeSymbol("TERM-LEXICON")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("TEXTRACT-LEMMA-TO-LEX-ENTRY"), list(makeSymbol("LEMMA")), makeKeyword("PROTECTED")) });









    public static final SubLList $list7 = list(new SubLObject[]{ reader_make_constant_shell(makeString("WebSearchDataMt")), reader_make_constant_shell(makeString("CyclistsMt")), reader_make_constant_shell(makeString("RelationParaphraseMt")), reader_make_constant_shell(makeString("WordNetMappingMt")), reader_make_constant_shell(makeString("PornographyJargonMt")), reader_make_constant_shell(makeString("CommonEnglishMisspellingsMt")), reader_make_constant_shell(makeString("ComputereseLexicalMt")), reader_make_constant_shell(makeString("CyclishMt")), reader_make_constant_shell(makeString("TemporaryLexicalAssertionsMt")), reader_make_constant_shell(makeString("EnglishWordSenseAssertions-HoldingMt")), reader_make_constant_shell(makeString("TemporaryLexicalAssertions-WordNetImportMt")), reader_make_constant_shell(makeString("RedundantLexicalMt")), reader_make_constant_shell(makeString("PDATemplateTestMt")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("SupplementalDeterminerSemTransLexicalMt")) });





    private static final SubLObject $const10$AllGeneralEnglishValidatedLexical = reader_make_constant_shell(makeString("AllGeneralEnglishValidatedLexicalMicrotheoryPSC"));



    private static final SubLObject $$AbstractLexiconSpecification = reader_make_constant_shell(makeString("AbstractLexiconSpecification"));

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SEMTRANS_LEXICON_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SEMTRANS-LEXICON-CLASS");























    public static final SubLSymbol $sym25$IGNORE_CACHE_ = makeSymbol("IGNORE-CACHE?");



    public static final SubLSymbol $sym27$ALLOW_FABRICATION_ = makeSymbol("ALLOW-FABRICATION?");









    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SEMTRANS_LEXICON_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SEMTRANS-LEXICON-INSTANCE");



    public static final SubLList $list34 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list35 = list(makeString("Initializes this semtrans lexicon"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("EXCLUDE-PREDICATE")), reader_make_constant_shell(makeString("preferredNameString"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("EXCLUDE-PREDICATE")), reader_make_constant_shell(makeString("denotationPlaceholder"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("EXCLUDE-PREDICATE")), reader_make_constant_shell(makeString("denotationRelatedTo"))), list(makeSymbol("RET"), makeSymbol("SELF")));



    private static final SubLObject $$preferredNameString = reader_make_constant_shell(makeString("preferredNameString"));

    private static final SubLObject $$denotationPlaceholder = reader_make_constant_shell(makeString("denotationPlaceholder"));

    private static final SubLObject $$denotationRelatedTo = reader_make_constant_shell(makeString("denotationRelatedTo"));

    public static final SubLSymbol SEMTRANS_LEXICON_INITIALIZE_METHOD = makeSymbol("SEMTRANS-LEXICON-INITIALIZE-METHOD");

    public static final SubLSymbol GET_TERM_LEXICON = makeSymbol("GET-TERM-LEXICON");

    public static final SubLList $list42 = list(makeString("Returns a term-lexicon that should have the same basic parameters as this semtrans-lexicon"), list(makeSymbol("PUNLESS"), makeSymbol("MY-TERM-LEXICON"), list(makeSymbol("CSETQ"), makeSymbol("MY-TERM-LEXICON"), list(makeSymbol("NEW-TERM-LEXICON-FROM-SEMTRANS-LEXICON"), makeSymbol("SELF")))), list(makeSymbol("RET"), makeSymbol("MY-TERM-LEXICON")));

    public static final SubLSymbol $sym43$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SEMTRANS-LEXICON-METHOD");

    public static final SubLSymbol SEMTRANS_LEXICON_GET_TERM_LEXICON_METHOD = makeSymbol("SEMTRANS-LEXICON-GET-TERM-LEXICON-METHOD");

    public static final SubLSymbol SEMTRANS_LEXICON_P = makeSymbol("SEMTRANS-LEXICON-P");



    public static final SubLSymbol SET_TERM_LEXICON = makeSymbol("SET-TERM-LEXICON");

    public static final SubLList $list48 = list(makeSymbol("LEXICON"));

    public static final SubLList $list49 = list(list(makeSymbol("CSETQ"), makeSymbol("MY-TERM-LEXICON"), makeSymbol("LEXICON")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym50$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SEMTRANS-LEXICON-METHOD");

    public static final SubLSymbol SEMTRANS_LEXICON_SET_TERM_LEXICON_METHOD = makeSymbol("SEMTRANS-LEXICON-SET-TERM-LEXICON-METHOD");



    public static final SubLList $list53 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list54 = list(makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN"));

    public static final SubLList $list55 = list(makeString("@param STRING stringp; the string for which to fabricate some lex entries\n   @param KEYWORDS listp; the syntactic dependents of STRING\n   @param PENN keywordp; the part-of-speech tag of STRING\n   @return listp; a list of lexical entries for word STRING with dependents KEYWORDS \n   and part-of-speech tag PENN"), list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("KEYWORDS"), makeSymbol("LISTP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("PENN"), makeSymbol("KEYWORDP")), list(makeSymbol("RET"), list(makeSymbol("FCOND"), list(list(makeSymbol("CNOT"), makeSymbol("ALLOW-FABRICATION?")), NIL), list(list(makeSymbol("NOMINAL-PENN-TAG"), makeSymbol("PENN")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("FABRICATE-NOMINAL")), makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN"))), list(list(makeSymbol("VERBAL-PENN-TAG"), makeSymbol("PENN")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("FABRICATE-VERBAL")), makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN"))), list(list(makeSymbol("ADJECTIVAL-PENN-TAG"), makeSymbol("PENN")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("FABRICATE-ADJECTIVAL")), makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN"))), list(list(makeSymbol("ADVERBIAL-PENN-TAG"), makeSymbol("PENN")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("FABRICATE-ADVERBIAL")), makeSymbol("STRING"), makeSymbol("KEYWORDS"), makeSymbol("PENN"))), list(T, NIL))));

    public static final SubLSymbol $sym56$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SEMTRANS-LEXICON-METHOD");







    public static final SubLSymbol FABRICATE_NOMINAL = makeSymbol("FABRICATE-NOMINAL");

    public static final SubLSymbol FABRICATE_VERBAL = makeSymbol("FABRICATE-VERBAL");

    public static final SubLSymbol FABRICATE_ADJECTIVAL = makeSymbol("FABRICATE-ADJECTIVAL");

    public static final SubLSymbol FABRICATE_ADVERBIAL = makeSymbol("FABRICATE-ADVERBIAL");

    public static final SubLSymbol SEMTRANS_LEXICON_FABRICATE_METHOD = makeSymbol("SEMTRANS-LEXICON-FABRICATE-METHOD");

    public static final SubLList $list65 = list(makeString("@param STRING string; the surface string of the lex entry\n   @param KEYWORDS listp; a list of keywords, indicating the noun frame required\n   @return lex-entry-p; a lex entry made up for STRING with frame KEYWORDS"), list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("KEYWORDS"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("LEX"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("PENN-TAGS"), list(makeSymbol("LIST"), makeSymbol("PENN"))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("FABRICATE-NOMINAL-SEMTRANS")), makeSymbol("STRING"), makeSymbol("KEYWORDS"))), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("LEX")))));











    public static final SubLSymbol FABRICATE_NOMINAL_SEMTRANS = makeSymbol("FABRICATE-NOMINAL-SEMTRANS");

    public static final SubLSymbol SEMTRANS_LEXICON_FABRICATE_NOMINAL_METHOD = makeSymbol("SEMTRANS-LEXICON-FABRICATE-NOMINAL-METHOD");

    public static final SubLList $list73 = list(makeSymbol("STRING"), makeSymbol("KEYWORDS"));

    public static final SubLList $list74 = list(list(makeSymbol("CLET"), list(makeSymbol("LITERALS")), list(makeSymbol("CDOLIST"), list(makeSymbol("KEYWORD"), makeSymbol("KEYWORDS")), list(makeSymbol("PCASE"), makeSymbol("KEYWORD"), list(makeKeyword("NOUN"), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("isa")), makeKeyword("NOUN"), list(makeSymbol("BQ-LIST*"), reader_make_constant_shell(makeString("ThingDescribableAsFn")), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("WordFn")), makeSymbol("STRING")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("Noun")))))), makeSymbol("LITERALS"))), list(makeKeyword("POSSESSOR"), list(makeSymbol("CPUSH"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("possessiveRelation")), makeKeyword("POSSESSOR"), makeKeyword("NOUN"))), makeSymbol("LITERALS"))))), list(makeSymbol("RET"), list(makeSymbol("CONJOIN"), makeSymbol("LITERALS")))));



    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$ThingDescribableAsFn = reader_make_constant_shell(makeString("ThingDescribableAsFn"));

    private static final SubLObject $$WordFn = reader_make_constant_shell(makeString("WordFn"));

    public static final SubLList $list79 = list(reader_make_constant_shell(makeString("Noun")));



    public static final SubLList $list81 = list(reader_make_constant_shell(makeString("possessiveRelation")), makeKeyword("POSSESSOR"), makeKeyword("NOUN"));

    public static final SubLSymbol SEMTRANS_LEXICON_FABRICATE_NOMINAL_SEMTRANS_METHOD = makeSymbol("SEMTRANS-LEXICON-FABRICATE-NOMINAL-SEMTRANS-METHOD");

    public static final SubLList $list83 = list(makeString("@param STRING string; the surface string of the lex entry\n   @param KEYWORDS listp; a list of keywords, indicating the verb frame required\n   @return lex-entry-p; a lex entry made up for STRING with frame KEYWORDS"), list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("KEYWORDS"), makeSymbol("LISTP")), list(makeSymbol("CLET"), list(list(makeSymbol("LEXES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("SEMTRANS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("FABRICATE-VERBAL-SEMTRANS")), makeSymbol("STRING"), makeSymbol("KEYWORDS"))), list(makeSymbol("CLET"), list(list(makeSymbol("LEX"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("PENN-TAGS"), list(makeSymbol("LIST"), makeSymbol("PENN"))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("SEMTRANS"), makeSymbol("SEMTRANS")), list(makeSymbol("CPUSH"), makeSymbol("LEX"), makeSymbol("LEXES")))), list(makeSymbol("RET"), makeSymbol("LEXES"))));

    public static final SubLSymbol FABRICATE_VERBAL_SEMTRANS = makeSymbol("FABRICATE-VERBAL-SEMTRANS");

    public static final SubLSymbol SEMTRANS_LEXICON_FABRICATE_VERBAL_METHOD = makeSymbol("SEMTRANS-LEXICON-FABRICATE-VERBAL-METHOD");

    public static final SubLList $list86 = list(makeString("@return listp; a list of cycl semtrans templates made up from STRING and KEYWORDS"), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("ACTION"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQ)), list(makeSymbol("CLET"), list(list(makeSymbol("SEMTRANSES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("ENTRY"), list(makeSymbol("NL-TRIE-SEARCH"), makeSymbol("STRING"), makeSymbol("TRIE"), makeSymbol("CASE-SENSITIVITY"))), list(makeSymbol("CDOLIST"), list(makeSymbol("SEMTRANS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("NL-TRIE-ENTRY-TO-VERBAL-SEMTRANSES")), makeSymbol("ENTRY"), makeSymbol("KEYWORDS"))), list(makeSymbol("CPUSH"), makeSymbol("SEMTRANS"), makeSymbol("SEMTRANSES")))), list(makeSymbol("PUNLESS"), makeSymbol("SEMTRANSES"), list(makeSymbol("CLET"), list(makeSymbol("KEYWORD-LITERAL"), list(makeSymbol("LITERALS"), list(makeSymbol("BQ-LIST"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("isa")), makeKeyword("ACTION"), list(makeSymbol("BQ-LIST*"), reader_make_constant_shell(makeString("ThingDescribableAsFn")), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("WordFn")), makeSymbol("STRING")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("Verb"))))))))), list(makeSymbol("CDOLIST"), list(makeSymbol("KEYWORD"), makeSymbol("KEYWORDS")), list(makeSymbol("CSETQ"), makeSymbol("KEYWORD-LITERAL"), list(makeSymbol("KEYWORD-TO-SEMTRANS-LITERAL"), makeSymbol("KEYWORD"))), list(makeSymbol("PWHEN"), makeSymbol("KEYWORD-LITERAL"), list(makeSymbol("CPUSH"), makeSymbol("KEYWORD-LITERAL"), makeSymbol("LITERALS")))), list(makeSymbol("PWHEN"), makeSymbol("LITERALS"), list(makeSymbol("CPUSH"), list(makeSymbol("CONJOIN"), makeSymbol("LITERALS")), makeSymbol("SEMTRANSES"))))), list(makeSymbol("RET"), makeSymbol("SEMTRANSES")))));

    public static final SubLSymbol $sym87$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SEMTRANS-LEXICON-METHOD");



    public static final SubLSymbol NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES = makeSymbol("NL-TRIE-ENTRY-TO-VERBAL-SEMTRANSES");

    public static final SubLList $list90 = list(reader_make_constant_shell(makeString("Verb")));

    public static final SubLSymbol SEMTRANS_LEXICON_FABRICATE_VERBAL_SEMTRANS_METHOD = makeSymbol("SEMTRANS-LEXICON-FABRICATE-VERBAL-SEMTRANS-METHOD");

    public static final SubLList $list92 = list(makeSymbol("ENTRY"), makeSymbol("KEYWORDS"));

    public static final SubLList $list93 = list(makeString("@return listp; a list of semtrans templates for nl-trie-entry ENTRY with actor slots \n   for each syntactic relation keyword in KEYWORDS"), list(makeSymbol("CLET"), list(list(makeSymbol("SEMTRANSES"), NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("NL-TRIE-WORD-P"), makeSymbol("ENTRY")), list(makeSymbol("MEMBER"), makeKeyword("ACTION"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQ))), list(makeSymbol("CDOLIST"), list(makeSymbol("DENOT"), list(makeSymbol("NL-TRIE-ENTRY-DENOTS"), makeSymbol("ENTRY"))), list(makeSymbol("CPUSH"), list(makeSymbol("DENOT-TO-VERBAL-SEMTRANS"), makeSymbol("DENOT"), makeSymbol("KEYWORDS")), makeSymbol("SEMTRANSES")))), list(makeSymbol("RET"), makeSymbol("SEMTRANSES"))));

    public static final SubLSymbol SEMTRANS_LEXICON_NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES_METHOD = makeSymbol("SEMTRANS-LEXICON-NL-TRIE-ENTRY-TO-VERBAL-SEMTRANSES-METHOD");

    public static final SubLList $list95 = list(reader_make_constant_shell(makeString("MtSpace")), reader_make_constant_shell(makeString("AllEnglishValidatedLexicalMicrotheoryPSC")), reader_make_constant_shell(makeString("AnytimePSC")));

    private static final SubLObject $$equals = reader_make_constant_shell(makeString("equals"));







    public static final SubLList $list100 = list(list(makeKeyword("ACTION"), reader_make_constant_shell(makeString("isa")), makeKeyword("ACTION"), reader_make_constant_shell(makeString("Situation"))), list(makeKeyword("SUBJECT"), reader_make_constant_shell(makeString("doneBy")), makeKeyword("ACTION"), makeKeyword("SUBJECT")), list(makeKeyword("OBJECT"), reader_make_constant_shell(makeString("patient-Generic")), makeKeyword("ACTION"), makeKeyword("OBJECT")), list(makeKeyword("OBLIQUE-OBJECT"), reader_make_constant_shell(makeString("to-UnderspecifiedLocation")), makeKeyword("ACTION"), makeKeyword("OBLIQUE-OBJECT")), list(makeKeyword("CLAUSE"), reader_make_constant_shell(makeString("awareOfProp")), makeKeyword("SUBJECT"), makeKeyword("CLAUSE")));

    public static final SubLList $list101 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("KEYWORDS"), makeSymbol("LISTP")), list(makeSymbol("IGNORE"), makeSymbol("KEYWORDS")), list(makeSymbol("CLET"), list(list(makeSymbol("LEX"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("PENN-TAGS"), list(makeSymbol("LIST"), makeSymbol("PENN"))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("isa")), makeKeyword("NOUN"), list(makeSymbol("BQ-LIST*"), reader_make_constant_shell(makeString("ThingDescribableAsFn")), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("WordFn")), makeSymbol("STRING")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("Adjective"))))))), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("LEX")))));

    public static final SubLList $list102 = list(reader_make_constant_shell(makeString("Adjective")));

    public static final SubLSymbol SEMTRANS_LEXICON_FABRICATE_ADJECTIVAL_METHOD = makeSymbol("SEMTRANS-LEXICON-FABRICATE-ADJECTIVAL-METHOD");

    public static final SubLList $list104 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("KEYWORDS"), makeSymbol("LISTP")), list(makeSymbol("IGNORE"), makeSymbol("KEYWORDS")), list(makeSymbol("CLET"), list(list(makeSymbol("LEX"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("PENN-TAGS"), list(makeSymbol("LIST"), makeSymbol("PENN"))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("isa")), makeKeyword("ACTION"), list(makeSymbol("BQ-LIST*"), reader_make_constant_shell(makeString("ThingDescribableAsFn")), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("WordFn")), makeSymbol("STRING")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("Adverb"))))))), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("LEX")))));

    public static final SubLList $list105 = list(reader_make_constant_shell(makeString("Adverb")));

    public static final SubLSymbol SEMTRANS_LEXICON_FABRICATE_ADVERBIAL_METHOD = makeSymbol("SEMTRANS-LEXICON-FABRICATE-ADVERBIAL-METHOD");



    public static final SubLList $list108 = list(makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY"));

    public static final SubLList $list109 = list(makeString("@param STRING stringp; a string for which to create a list of lex-entries\n   @param NL-TRIE-ENTRY nl-trie-word-p or nl-trie-name-p; an nl-trie entry out of which\n   to construct a lexical entry\n   @return listp; a list of lex-entries containing the information in STRING and NL-TRIE-ENTRY"), list(makeSymbol("PCOND"), list(list(makeSymbol("NL-TRIE-WORD-P"), makeSymbol("NL-TRIE-ENTRY")), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-WORD")), makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")))), list(list(makeSymbol("NL-TRIE-NAME-P"), makeSymbol("NL-TRIE-ENTRY")), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-NAME")), makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")))), list(list(makeSymbol("NL-TRIE-TERM-PHRASES-ENTRY-P"), makeSymbol("NL-TRIE-ENTRY")), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-TERM-PHRASES-ENTRY")), makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")))), list(list(makeSymbol("LEX-ENTRY-P"), makeSymbol("NL-TRIE-ENTRY")), list(makeSymbol("RET"), list(makeSymbol("LIST"), list(makeSymbol("FIM"), makeSymbol("NL-TRIE-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("COPY"))))))));

    public static final SubLSymbol CREATE_LEX_ENTRIES_NL_TRIE_WORD = makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-WORD");

    public static final SubLSymbol CREATE_LEX_ENTRIES_NL_TRIE_NAME = makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-NAME");

    public static final SubLSymbol CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY = makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-TERM-PHRASES-ENTRY");

    public static final SubLSymbol SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_METHOD = makeSymbol("SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-METHOD");

    public static final SubLSymbol TEXTRACT_LEMMA_TO_LEX_ENTRY = makeSymbol("TEXTRACT-LEMMA-TO-LEX-ENTRY");

    public static final SubLList $list115 = list(makeSymbol("LEMMA"));

    public static final SubLList $list116 = list(makeString("@param LEMMA textract-lemma-p\n   @return lex-entry-p or nil; the lex entry equivalent of LEMMA,\n   or nil if one can\'t be obtained"), list(makeSymbol("CLET"), list(makeSymbol("CYCL"), makeSymbol("LEX-ENTRY")), list(new SubLObject[]{ makeSymbol("PCASE"), list(makeSymbol("TEXTRACT-LEMMA-TYPE"), makeSymbol("LEMMA")), list(makeKeyword("PERSON"), list(makeSymbol("CSETQ"), makeSymbol("CYCL"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("and")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("isa")), makeKeyword("NOUN"), reader_make_constant_shell(makeString("Person")))), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("nameString")), makeKeyword("NOUN"), list(makeSymbol("TEXTRACT-LEMMA-STRING"), makeSymbol("LEMMA")))))), list(makeKeyword("PERSON?"), list(makeSymbol("CSETQ"), makeSymbol("CYCL"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("and")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("isa")), makeKeyword("NOUN"), reader_make_constant_shell(makeString("Person")))), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("nameString")), makeKeyword("NOUN"), list(makeSymbol("TEXTRACT-LEMMA-STRING"), makeSymbol("LEMMA")))))), list(makeKeyword("PLACE"), list(makeSymbol("CSETQ"), makeSymbol("CYCL"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("and")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("isa")), makeKeyword("NOUN"), reader_make_constant_shell(makeString("Place")))), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("nameString")), makeKeyword("NOUN"), list(makeSymbol("TEXTRACT-LEMMA-STRING"), makeSymbol("LEMMA")))))), list(makeKeyword("PLACE?"), list(makeSymbol("CSETQ"), makeSymbol("CYCL"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("and")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("isa")), makeKeyword("NOUN"), reader_make_constant_shell(makeString("Place")))), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("nameString")), makeKeyword("NOUN"), list(makeSymbol("TEXTRACT-LEMMA-STRING"), makeSymbol("LEMMA")))))), list(makeKeyword("ORG"), list(makeSymbol("CSETQ"), makeSymbol("CYCL"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("and")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("isa")), makeKeyword("NOUN"), reader_make_constant_shell(makeString("Organization")))), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("nameString")), makeKeyword("NOUN"), list(makeSymbol("TEXTRACT-LEMMA-STRING"), makeSymbol("LEMMA")))))), list(makeKeyword("UNAME"), list(makeSymbol("CSETQ"), makeSymbol("CYCL"), list(makeSymbol("LIST"), reader_make_constant_shell(makeString("nameString")), makeKeyword("NOUN"), list(makeSymbol("TEXTRACT-LEMMA-STRING"), makeSymbol("LEMMA"))))), list(makeSymbol("OTHERWISE"), list(makeSymbol("CSETQ"), makeSymbol("CYCL"), NIL)) }), list(makeSymbol("PWHEN"), makeSymbol("CYCL"), list(makeSymbol("CSETQ"), makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("CYC-POS"), reader_make_constant_shell(makeString("ProperNoun"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("LIST"), makeSymbol("CYCL"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell(makeString("RegularNounFrame"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("STRING"), list(makeSymbol("TEXTRACT-LEMMA-STRING"), makeSymbol("LEMMA")))), list(makeSymbol("RET"), makeSymbol("LEX-ENTRY"))));



    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    public static final SubLList $list119 = list(reader_make_constant_shell(makeString("isa")), makeKeyword("NOUN"), reader_make_constant_shell(makeString("Person")));

    private static final SubLObject $$nameString = reader_make_constant_shell(makeString("nameString"));





    public static final SubLList $list123 = list(reader_make_constant_shell(makeString("isa")), makeKeyword("NOUN"), reader_make_constant_shell(makeString("Place")));





    public static final SubLList $list126 = list(reader_make_constant_shell(makeString("isa")), makeKeyword("NOUN"), reader_make_constant_shell(makeString("Organization")));





    private static final SubLObject $$ProperNoun = reader_make_constant_shell(makeString("ProperNoun"));



    private static final SubLObject $$RegularNounFrame = reader_make_constant_shell(makeString("RegularNounFrame"));

    public static final SubLSymbol SEMTRANS_LEXICON_TEXTRACT_LEMMA_TO_LEX_ENTRY_METHOD = makeSymbol("SEMTRANS-LEXICON-TEXTRACT-LEMMA-TO-LEX-ENTRY-METHOD");

    public static final SubLSymbol RESPORATOR_TO_LEX_ENTRIES = makeSymbol("RESPORATOR-TO-LEX-ENTRIES");

    public static final SubLList $list134 = list(makeSymbol("TYPE.STRING"));

    public static final SubLList $list135 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRIES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("PARSE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("RESPORATOR-TO-CYCL")), makeSymbol("TYPE.STRING"))), list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("STRING"), list(makeSymbol("CDR"), makeSymbol("TYPE.STRING"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("CYC-POS"), reader_make_constant_shell(makeString("ProperNoun"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("and")), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("isa")), makeKeyword("NOUN"), makeSymbol("PARSE")), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("nameString")), makeKeyword("NOUN"), list(makeSymbol("CDR"), makeSymbol("TYPE.STRING"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell(makeString("RegularNounFrame"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(makeSymbol("FCM"), list(makeSymbol("QUOTE"), makeSymbol("ABSTRACT-LEXICON")), list(makeSymbol("QUOTE"), makeSymbol("RESPORATOR-TO-INFLECTIONS")), makeSymbol("TYPE.STRING"))), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES")))), list(makeSymbol("RET"), makeSymbol("LEX-ENTRIES"))));



    public static final SubLSymbol RESPORATOR_TO_INFLECTIONS = makeSymbol("RESPORATOR-TO-INFLECTIONS");

    public static final SubLSymbol RESPORATOR_TO_CYCL = makeSymbol("RESPORATOR-TO-CYCL");

    public static final SubLSymbol SEMTRANS_LEXICON_RESPORATOR_TO_LEX_ENTRIES_METHOD = makeSymbol("SEMTRANS-LEXICON-RESPORATOR-TO-LEX-ENTRIES-METHOD");

    public static final SubLSymbol RESPORATOR_LEARN = makeSymbol("RESPORATOR-LEARN");

    public static final SubLList $list141 = list(makeSymbol("TEXT"));

    public static final SubLList $list142 = list(makeString("@param TEXT stringp; the text from which to learn lexical entries\n   @return listp; a list of lexical entries learned from TEXT"), list(makeSymbol("CHECK-TYPE"), makeSymbol("TEXT"), makeSymbol("STRINGP")), list(makeSymbol("CLET"), list(list(makeSymbol("LEXES"), NIL)), list(makeSymbol("PWHEN-FEATURE"), makeKeyword("CYC-QUIRK"), list(makeSymbol("CLET"), list(makeSymbol("TYPINGS"), makeSymbol("ERROR?")), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR?")), list(makeSymbol("CSETQ"), makeSymbol("TYPINGS"), list(makeSymbol("RESPORATOR"), makeSymbol("TEXT")))), list(makeSymbol("PWHEN"), makeSymbol("ERROR?"), list(makeSymbol("WARN"), makeSymbol("ERROR?")), list(makeSymbol("RET"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("TYPE.STRING"), makeSymbol("TYPINGS")), list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("RESPORATOR-TO-LEX-ENTRIES")), makeSymbol("TYPE.STRING"))), list(makeSymbol("CPUSH"), makeSymbol("LEX"), makeSymbol("LEXES")))))), list(makeSymbol("RET"), makeSymbol("LEXES"))));



    public static final SubLSymbol SEMTRANS_LEXICON_RESPORATOR_LEARN_METHOD = makeSymbol("SEMTRANS-LEXICON-RESPORATOR-LEARN-METHOD");

    public static final SubLSymbol $sym145$RESPORATOR___LEARN = makeSymbol("RESPORATOR++-LEARN");

    public static final SubLList $list146 = list(makeString("@param TEXT stringp; the text from which to learn lexical entries\n   @return listp; a list of lexical entries learned from TEXT\n   @note this is a \'lazy\' variation of resporator that attempts to discover\n   shorter strings of type PERSON that exclude additional information like \n   \'French Prime Minister\' from the string \'French Prime Minister Jacques Chirac\'\n   and just returns \'Jacques Chirac\'."), list(makeSymbol("CHECK-TYPE"), makeSymbol("TEXT"), makeSymbol("STRINGP")), list(makeSymbol("CLET"), list(list(makeSymbol("LEXES"), NIL)), list(makeSymbol("PWHEN-FEATURE"), makeKeyword("CYC-QUIRK"), list(makeSymbol("CLET"), list(makeSymbol("TYPINGS"), makeSymbol("ERROR?")), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR?")), list(makeSymbol("CSETQ"), makeSymbol("TYPINGS"), list(makeSymbol("RESPORATOR++"), makeSymbol("TEXT")))), list(makeSymbol("PWHEN"), makeSymbol("ERROR?"), list(makeSymbol("WARN"), makeSymbol("ERROR?")), list(makeSymbol("RET"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("TYPE.STRING"), makeSymbol("TYPINGS")), list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("RESPORATOR-TO-LEX-ENTRIES")), makeSymbol("TYPE.STRING"))), list(makeSymbol("CPUSH"), makeSymbol("LEX"), makeSymbol("LEXES")))))), list(makeSymbol("RET"), makeSymbol("LEXES"))));

    public static final SubLSymbol $sym147$SEMTRANS_LEXICON_RESPORATOR___LEARN_METHOD = makeSymbol("SEMTRANS-LEXICON-RESPORATOR++-LEARN-METHOD");



    public static final SubLList $list149 = list(list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("STANFORD-NER-LEARN-INT")), makeSymbol("TEXT"), NIL)));

    public static final SubLSymbol STANFORD_NER_LEARN_INT = makeSymbol("STANFORD-NER-LEARN-INT");

    public static final SubLSymbol SEMTRANS_LEXICON_STANFORD_NER_LEARN_METHOD = makeSymbol("SEMTRANS-LEXICON-STANFORD-NER-LEARN-METHOD");

    public static final SubLSymbol STANFORD_NER_LEARN_TIGHTENED_TYPES = makeSymbol("STANFORD-NER-LEARN-TIGHTENED-TYPES");

    public static final SubLList $list153 = list(list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("STANFORD-NER-LEARN-INT")), makeSymbol("TEXT"), T)));

    public static final SubLSymbol SEMTRANS_LEXICON_STANFORD_NER_LEARN_TIGHTENED_TYPES_METHOD = makeSymbol("SEMTRANS-LEXICON-STANFORD-NER-LEARN-TIGHTENED-TYPES-METHOD");

    public static final SubLList $list155 = list(makeSymbol("TEXT"), makeSymbol("TIGHTEN-TYPES?"));

    public static final SubLObject $list156 = _constant_156_initializer();













    public static final SubLSymbol TIGHTEN_TYPE = makeSymbol("TIGHTEN-TYPE");





    public static final SubLList $list166 = list(reader_make_constant_shell(makeString("pnNonPlural-Generic")));



    public static final SubLString $str168$___S = makeString("~%~S");

    public static final SubLSymbol SEMTRANS_LEXICON_STANFORD_NER_LEARN_INT_METHOD = makeSymbol("SEMTRANS-LEXICON-STANFORD-NER-LEARN-INT-METHOD");



    public static final SubLList $list171 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NUMBERS"), list(makeSymbol("NUMBER-MEANINGS"), makeSymbol("TEXT"))), list(makeSymbol("RESULT"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("NUMBER"), makeSymbol("NUMBERS")), list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("NUMBER-STRING"), makeSymbol("MEANING")), makeSymbol("NUMBER"), list(makeSymbol("CLET"), list(list(makeSymbol("KNOWN-ENTRIES"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeSymbol("NUMBER-STRING"))), list(makeSymbol("ALREADY-KNOWN"), list(makeSymbol("MEMBER?"), makeSymbol("MEANING"), makeSymbol("KNOWN-ENTRIES"), list(makeSymbol("QUOTE"), EQUAL), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY-SEMTRANS"))))), list(makeSymbol("PUNLESS"), makeSymbol("ALREADY-KNOWN"), list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NUMBER-SEMTRANS-LEX-ENTRY"), makeSymbol("NUMBER-STRING"), makeSymbol("MEANING")))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ADD")), makeSymbol("LEX-ENTRY")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("RESULT"))))))), list(makeSymbol("RET"), makeSymbol("RESULT"))));

    public static final SubLList $list172 = list(makeSymbol("NUMBER-STRING"), makeSymbol("MEANING"));

    public static final SubLSymbol LEX_ENTRY_SEMTRANS = makeSymbol("LEX-ENTRY-SEMTRANS");

    public static final SubLSymbol SEMTRANS_LEXICON_NUMBER_LEARN_METHOD = makeSymbol("SEMTRANS-LEXICON-NUMBER-LEARN-METHOD");

    public static final SubLList $list175 = list(makeKeyword("CD"));

    private static final SubLObject $$Number_SP = reader_make_constant_shell(makeString("Number-SP"));

    public static final SubLList $list177 = list(makeSymbol("STANFORD-NER-LEARN"), makeSymbol("RESPORATOR++-LEARN"), makeSymbol("NUMBER-LEARN"));

    public static final SubLList $list178 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRIES"), NIL), list(makeSymbol("PRED"), list(makeSymbol("NL-TRIE-ENTRY-SEMANTIC-PRED"), makeSymbol("NL-TRIE-ENTRY"), NIL))), list(makeSymbol("PCOND"), list(list(makeSymbol("SEMTRANS-PRED?"), makeSymbol("PRED")), list(makeSymbol("CDOLIST"), list(makeSymbol("SEMTRANS"), list(makeSymbol("HL-TO-EL"), list(makeSymbol("NL-TRIE-WORD-SEMTRANS-TEMPLATES"), makeSymbol("NL-TRIE-ENTRY")))), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("WU"), list(makeSymbol("NL-TRIE-WORD-WORD-UNIT"), makeSymbol("NL-TRIE-ENTRY"))), list(makeSymbol("POS"), list(makeSymbol("NL-TRIE-ENTRY-POS"), makeSymbol("NL-TRIE-ENTRY"))), list(makeSymbol("FRAME"), list(makeSymbol("NL-TRIE-WORD-FRAME"), makeSymbol("NL-TRIE-ENTRY"))), list(makeSymbol("INFLECTIONS"), list(makeSymbol("FIF"), makeSymbol("WU"), list(makeSymbol("PPH-FILTER-PREDS"), list(makeSymbol("PREDS-OF-STRING&WORD"), makeSymbol("STRING"), makeSymbol("WU")), list(makeSymbol("PREDS-OF-POS"), makeSymbol("POS"))), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("singular")), reader_make_constant_shell(makeString("plural")))))), list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("CYC-POS"), makeSymbol("POS")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("SEMTRANS"), makeSymbol("SEMTRANS")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("FRAME"), makeSymbol("FRAME")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("WORD-UNIT"), makeSymbol("WU")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("INFLECTIONS"), makeSymbol("INFLECTIONS")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("TRIE-ENTRY"), makeSymbol("NL-TRIE-ENTRY")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES")) }))), list(list(makeSymbol("CAND"), makeSymbol("*MANUFACTURE-SEMTRANS-ASSERTIONS?*"), list(makeSymbol("MEMBER?"), makeSymbol("PRED"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("denotation")), reader_make_constant_shell(makeString("multiWordString"))))), list(makeSymbol("GENL-POS?"), list(makeSymbol("NL-TRIE-WORD-POS"), makeSymbol("NL-TRIE-ENTRY")), reader_make_constant_shell(makeString("Noun")))), list(makeSymbol("WITH-ALL-MTS"), list(makeSymbol("CDOLIST"), list(makeSymbol("DENOT"), list(makeSymbol("NL-TRIE-ENTRY-DENOTS"), makeSymbol("NL-TRIE-ENTRY"))), list(makeSymbol("PUNLESS"), list(makeSymbol("PREDICATE-P"), makeSymbol("DENOT")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(makeSymbol("NL-TRIE-WORD-POS-PREDS"), makeSymbol("NL-TRIE-ENTRY"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("CYC-POS"), list(makeSymbol("NL-TRIE-WORD-POS"), makeSymbol("NL-TRIE-ENTRY"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("LIST"), list(makeSymbol("FIF"), list(makeSymbol("ISA-IN-ANY-MT?"), makeSymbol("DENOT"), reader_make_constant_shell(makeString("Collection"))), reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("equals"))), makeKeyword("NOUN"), list(makeSymbol("HL-TO-EL"), makeSymbol("DENOT")))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell(makeString("RegularNounFrame"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("WORD-UNIT"), list(makeSymbol("NL-TRIE-WORD-WORD-UNIT"), makeSymbol("NL-TRIE-ENTRY"), NIL)), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("TRIE-ENTRY"), makeSymbol("NL-TRIE-ENTRY")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES")) })))))), list(makeSymbol("RET"), makeSymbol("LEX-ENTRIES"))));

    public static final SubLList $list179 = list(reader_make_constant_shell(makeString("singular")), reader_make_constant_shell(makeString("plural")));





    public static final SubLList $list182 = list(reader_make_constant_shell(makeString("denotation")), reader_make_constant_shell(makeString("multiWordString")));

    private static final SubLObject $$Noun = reader_make_constant_shell(makeString("Noun"));



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    public static final SubLSymbol SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_WORD_METHOD = makeSymbol("SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-WORD-METHOD");

    public static final SubLList $list188 = list(makeString("@param STRING stringp; the string of the lex entries to be constructed\n   @param NL-TRIE-ENTRY; the nl trie entry out of which to construct a list of lex entries\n   @return listp; a list of semtrans lex entries for STRING and NL-TRIE-ENTRY"), list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRIES"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("DENOT"), list(makeSymbol("NL-TRIE-ENTRY-DENOTS"), makeSymbol("NL-TRIE-ENTRY"))), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY")))), list(makeSymbol("COLLECTION?"), list(makeSymbol("COLLECTION-P"), makeSymbol("DENOT")))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("LIST"), list(makeSymbol("FIF"), makeSymbol("COLLECTION?"), reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("equals"))), makeKeyword("NOUN"), list(makeSymbol("HL-TO-EL"), makeSymbol("DENOT")))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("CYC-POS"), reader_make_constant_shell(makeString("ProperNoun"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell(makeString("RegularNounFrame"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("pnNonPlural-Generic"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("TRIE-ENTRY"), makeSymbol("NL-TRIE-ENTRY")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES")) })), list(makeSymbol("RET"), makeSymbol("LEX-ENTRIES"))));

    public static final SubLSymbol SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_NAME_METHOD = makeSymbol("SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-NAME-METHOD");

    public static final SubLList $list190 = list(makeSymbol("STRING"), makeSymbol("TP-ENTRY"));

    public static final SubLList $list191 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRIES"), NIL), list(makeSymbol("POS"), list(makeSymbol("NL-TRIE-ENTRY-POS"), makeSymbol("TP-ENTRY"))), list(makeSymbol("INFLECTIONS"), list(makeSymbol("NL-TRIE-ENTRY-POS-PREDS"), makeSymbol("TP-ENTRY"))), list(makeSymbol("PREDICATE"), list(makeSymbol("NL-TRIE-ENTRY-SEMANTIC-PRED"), makeSymbol("TP-ENTRY"), NIL)), list(makeSymbol("PRAGMATICS"), list(makeSymbol("NL-TRIE-ENTRY-PRAGMATICS"), makeSymbol("TP-ENTRY")))), list(makeSymbol("CDOLIST"), list(makeSymbol("DENOT"), list(makeSymbol("NL-TRIE-ENTRY-DENOTS"), makeSymbol("TP-ENTRY"))), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY")))), list(makeSymbol("COLLECTION?"), list(makeSymbol("COLLECTION-P"), makeSymbol("DENOT")))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("PRAGMATICS"), makeSymbol("PRAGMATICS")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("LIST"), list(makeSymbol("FIF"), makeSymbol("COLLECTION?"), reader_make_constant_shell(makeString("isa")), reader_make_constant_shell(makeString("equals"))), makeKeyword("NOUN"), list(makeSymbol("HL-TO-EL"), makeSymbol("DENOT")))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("PREDICATE"), makeSymbol("PREDICATE")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("CYC-POS"), makeSymbol("POS")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("INFLECTIONS"), makeSymbol("INFLECTIONS")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("TRIE-ENTRY"), makeSymbol("TP-ENTRY")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES")) })), list(makeSymbol("RET"), makeSymbol("LEX-ENTRIES"))));





    public static final SubLSymbol $sym194$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY_ME = makeSymbol("SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-TERM-PHRASES-ENTRY-METHOD");

    public static final SubLSymbol CREATE_LEX_ENTRIES_NUMBER = makeSymbol("CREATE-LEX-ENTRIES-NUMBER");

    public static final SubLList $list196 = list(makeSymbol("NUMBER-STRING"));

    public static final SubLList $list197 = list(list(makeSymbol("IGNORE"), makeSymbol("NUMBER-STRING")), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NUMBER_METHOD = makeSymbol("SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NUMBER-METHOD");

    public static final SubLSymbol NOUN_COMPOUND_LEARN = makeSymbol("NOUN-COMPOUND-LEARN");

    public static final SubLList $list200 = list(list(makeSymbol("RET"), list(makeSymbol("TEXT-NOUN-COMPOUND-SEMTRANS-LEX-ENTRIES"), makeSymbol("TEXT"))));

    public static final SubLSymbol SEMTRANS_LEXICON_NOUN_COMPOUND_LEARN_METHOD = makeSymbol("SEMTRANS-LEXICON-NOUN-COMPOUND-LEARN-METHOD");

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    public static final SubLList $list203 = list(reader_make_constant_shell(makeString("plural-Generic")));

    public static final SubLList $list204 = list(makeKeyword("NNS"));

    public static final SubLList $list205 = list(makeKeyword("NN"));

    public static final SubLSymbol COOCCURRENCE_STATISTICS_LEARN = makeSymbol("COOCCURRENCE-STATISTICS-LEARN");

    public static final SubLList $list207 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PARSE"), list(makeSymbol("FIM"), list(makeSymbol("NEW-STANFORD-PARSER")), list(makeSymbol("QUOTE"), makeSymbol("PARSE")), makeSymbol("TEXT"))), list(makeSymbol("WORDS"), list(makeSymbol("FWHEN"), makeSymbol("PARSE"), list(makeSymbol("FIM"), makeSymbol("PARSE"), list(makeSymbol("QUOTE"), makeSymbol("YIELD"))))), list(makeSymbol("LEXES"), NIL), list(makeSymbol("LEARNED-NOUNS"), NIL)), list(makeSymbol("PWHEN-FEATURE"), makeKeyword("CYC-NOUNLEARNER"), list(makeSymbol("CSETQ"), makeSymbol("LEARNED-NOUNS"), list(makeSymbol("LEARN-UNKNOWN-NOUNS-FROM-PARSE-TREE"), makeSymbol("PARSE")))), list(makeSymbol("CDOLIST"), list(makeSymbol("LEARNED-NOUN"), makeSymbol("LEARNED-NOUNS")), list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("LEARNED-STRING"), makeSymbol("TYPE"), makeSymbol("RELATIONSHIP"), makeSymbol("CONFIDENCE")), makeSymbol("LEARNED-NOUN"), list(makeSymbol("IGNORE"), makeSymbol("CONFIDENCE")), list(makeSymbol("CLET"), list(list(makeSymbol("PENN-TAGS"), NIL), makeSymbol("PARSED-STRING"), makeSymbol("SINGULARIZED-STRING"), makeSymbol("SEMTRANS")), list(makeSymbol("CSOME"), list(makeSymbol("WORD"), makeSymbol("WORDS"), makeSymbol("PENN-TAGS")), list(makeSymbol("CSETQ"), makeSymbol("PARSED-STRING"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING")))), list(makeSymbol("PWHEN"), makeSymbol("PARSED-STRING"), list(makeSymbol("CSETQ"), makeSymbol("SINGULARIZED-STRING"), list(makeSymbol("SINGULARIZE-WORD"), makeSymbol("PARSED-STRING")))), list(makeSymbol("PWHEN"), list(EQUALP, makeSymbol("SINGULARIZED-STRING"), makeSymbol("LEARNED-STRING")), list(makeSymbol("CPUSH"), list(makeSymbol("FIM"), makeSymbol("WORD"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeSymbol("PENN-TAGS")))), list(makeSymbol("PCASE"), makeSymbol("RELATIONSHIP"), list(makeKeyword("ISA"), list(makeSymbol("CSETQ"), makeSymbol("SEMTRANS"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("equals")), makeKeyword("NOUN"), makeSymbol("TYPE")))), list(makeKeyword("GENLS"), list(makeSymbol("CSETQ"), makeSymbol("SEMTRANS"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("isa")), makeKeyword("NOUN"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("SubCollectionNamedFn")), makeSymbol("SINGULARIZED-STRING"), makeSymbol("TYPE")))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("PENN-TAGS"), makeSymbol("SEMTRANS")), list(makeSymbol("CLET"), list(list(makeSymbol("LEX"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("PARSED-STRING")), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("PENN-TAGS"), makeSymbol("PENN-TAGS")), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell(makeString("RegularNounFrame"))), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("SEMTRANS"), makeSymbol("SEMTRANS")), list(makeSymbol("CPUSH"), makeSymbol("LEX"), makeSymbol("LEXES"))))))), list(makeSymbol("RET"), makeSymbol("LEXES"))));





    public static final SubLList $list210 = list(makeSymbol("LEARNED-STRING"), makeSymbol("TYPE"), makeSymbol("RELATIONSHIP"), makeSymbol("CONFIDENCE"));







    private static final SubLObject $$SubCollectionNamedFn = reader_make_constant_shell(makeString("SubCollectionNamedFn"));

    public static final SubLSymbol SEMTRANS_LEXICON_COOCCURRENCE_STATISTICS_LEARN_METHOD = makeSymbol("SEMTRANS-LEXICON-COOCCURRENCE-STATISTICS-LEARN-METHOD");





    private static final SubLObject $$InstanceFn = reader_make_constant_shell(makeString("InstanceFn"));

    public static final SubLSymbol INSTANCEFN_CLAUSE = makeSymbol("INSTANCEFN-CLAUSE");

    public static final SubLList $list220 = list(TWO_INTEGER, ZERO_INTEGER);





    private static final SubLObject $$InstanceNamedFn_Ternary = reader_make_constant_shell(makeString("InstanceNamedFn-Ternary"));

    private static final SubLObject $$CollectionIntersection2Fn = reader_make_constant_shell(makeString("CollectionIntersection2Fn"));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));



    private static final SubLObject $$termOfUnit = reader_make_constant_shell(makeString("termOfUnit"));

    public static SubLObject new_semtrans_lexicon() {
        return object.new_class_instance(SEMTRANS_LEXICON);
    }

    public static SubLObject get_semtrans_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == semtrans_lexicon_p($semtrans_lexicon$.getDynamicValue(thread))) {
            $semtrans_lexicon$.setDynamicValue(new_semtrans_lexicon(), thread);
        }
        return $semtrans_lexicon$.getDynamicValue(thread);
    }

    public static SubLObject get_semtrans_lexicon_my_term_lexicon(final SubLObject v_semtrans_lexicon) {
        return classes.subloop_get_access_protected_instance_slot(v_semtrans_lexicon, SIXTEEN_INTEGER, MY_TERM_LEXICON);
    }

    public static SubLObject set_semtrans_lexicon_my_term_lexicon(final SubLObject v_semtrans_lexicon, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_semtrans_lexicon, value, SIXTEEN_INTEGER, MY_TERM_LEXICON);
    }

    public static SubLObject subloop_reserved_initialize_semtrans_lexicon_class(final SubLObject new_instance) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_EXCLUDE_MTS, $list7);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_EXCLUDE_PREDICATES, set.set_element_list(lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(thread)));
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_BASE_MT, $const10$AllGeneralEnglishValidatedLexical);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_KB_SPEC, $$AbstractLexiconSpecification);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_semtrans_lexicon_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ALLOWED_MTS, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_MTS, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, BASE_MT, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ROOT_MT, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_PREDS, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_POS_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, TRIE, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, CACHE, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, $sym25$IGNORE_CACHE_, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, CASE_SENSITIVITY, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, $sym27$ALLOW_FABRICATION_, T);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, LEARNED, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ACTIVE_LEARNERS, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ALLOW_STEMMING, T);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, STOP_WORDS, NIL);
        classes.subloop_initialize_slot(new_instance, SEMTRANS_LEXICON, MY_TERM_LEXICON, NIL);
        return NIL;
    }

    public static SubLObject semtrans_lexicon_p(final SubLObject v_semtrans_lexicon) {
        return classes.subloop_instanceof_class(v_semtrans_lexicon, SEMTRANS_LEXICON);
    }

    public static SubLObject semtrans_lexicon_initialize_method(final SubLObject self) {
        abstract_lexicon.abstract_lexicon_initialize_method(self);
        methods.funcall_instance_method_with_1_args(self, EXCLUDE_PREDICATE, $$preferredNameString);
        methods.funcall_instance_method_with_1_args(self, EXCLUDE_PREDICATE, $$denotationPlaceholder);
        methods.funcall_instance_method_with_1_args(self, EXCLUDE_PREDICATE, $$denotationRelatedTo);
        return self;
    }

    public static SubLObject semtrans_lexicon_get_term_lexicon_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_semtrans_lexicon_method = NIL;
        SubLObject my_term_lexicon = get_semtrans_lexicon_my_term_lexicon(self);
        try {
            thread.throwStack.push($sym43$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
            try {
                if (NIL == my_term_lexicon) {
                    my_term_lexicon = new_term_lexicon_from_semtrans_lexicon(self);
                }
                sublisp_throw($sym43$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD, my_term_lexicon);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_semtrans_lexicon_my_term_lexicon(self, my_term_lexicon);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_semtrans_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym43$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_semtrans_lexicon_method;
    }

    public static SubLObject new_term_lexicon_from_semtrans_lexicon(final SubLObject lexicon) {
        assert NIL != semtrans_lexicon_p(lexicon) : "semtrans_lexicon.semtrans_lexicon_p(lexicon) " + "CommonSymbols.NIL != semtrans_lexicon.semtrans_lexicon_p(lexicon) " + lexicon;
        final SubLObject v_term_lexicon = methods.funcall_instance_method_with_1_args(lexicon, COPY, term_lexicon.new_term_lexicon());
        return v_term_lexicon;
    }

    public static SubLObject semtrans_lexicon_set_term_lexicon_method(final SubLObject self, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_semtrans_lexicon_method = NIL;
        SubLObject my_term_lexicon = get_semtrans_lexicon_my_term_lexicon(self);
        try {
            thread.throwStack.push($sym50$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
            try {
                my_term_lexicon = lexicon;
                sublisp_throw($sym50$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_semtrans_lexicon_my_term_lexicon(self, my_term_lexicon);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_semtrans_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym50$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_semtrans_lexicon_method;
    }

    public static SubLObject semtrans_lexicon_fabricate_method(final SubLObject self, final SubLObject string, final SubLObject keywords, final SubLObject penn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_semtrans_lexicon_method = NIL;
        final SubLObject allow_fabricationP = abstract_lexicon.get_abstract_lexicon_allow_fabricationP(self);
        try {
            thread.throwStack.push($sym56$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
            try {
                assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
                assert NIL != listp(keywords) : "Types.listp(keywords) " + "CommonSymbols.NIL != Types.listp(keywords) " + keywords;
                assert NIL != keywordp(penn) : "Types.keywordp(penn) " + "CommonSymbols.NIL != Types.keywordp(penn) " + penn;
                sublisp_throw($sym56$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD, NIL == allow_fabricationP ? NIL : NIL != nominal_penn_tag(penn) ? methods.funcall_instance_method_with_3_args(self, FABRICATE_NOMINAL, string, keywords, penn) : NIL != verbal_penn_tag(penn) ? methods.funcall_instance_method_with_3_args(self, FABRICATE_VERBAL, string, keywords, penn) : NIL != adjectival_penn_tag(penn) ? methods.funcall_instance_method_with_3_args(self, FABRICATE_ADJECTIVAL, string, keywords, penn) : NIL != adverbial_penn_tag(penn) ? methods.funcall_instance_method_with_3_args(self, FABRICATE_ADVERBIAL, string, keywords, penn) : NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    abstract_lexicon.set_abstract_lexicon_allow_fabricationP(self, allow_fabricationP);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_semtrans_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym56$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_semtrans_lexicon_method;
    }

    public static SubLObject nominal_penn_tag(final SubLObject tag) {
        return member(tag, abstract_lexicon.$nominal_tags$.getGlobalValue(), EQ, UNPROVIDED);
    }

    public static SubLObject verbal_penn_tag(final SubLObject tag) {
        return member(tag, abstract_lexicon.$verbal_tags$.getGlobalValue(), EQ, UNPROVIDED);
    }

    public static SubLObject adjectival_penn_tag(final SubLObject tag) {
        return member(tag, abstract_lexicon.$adjectival_tags$.getGlobalValue(), EQ, UNPROVIDED);
    }

    public static SubLObject adverbial_penn_tag(final SubLObject tag) {
        return member(tag, abstract_lexicon.$adverbial_tags$.getGlobalValue(), EQ, UNPROVIDED);
    }

    public static SubLObject semtrans_lexicon_fabricate_nominal_method(final SubLObject self, final SubLObject string, final SubLObject keywords, final SubLObject penn) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != listp(keywords) : "Types.listp(keywords) " + "CommonSymbols.NIL != Types.listp(keywords) " + keywords;
        final SubLObject lex = object.new_class_instance(LEX_ENTRY);
        methods.funcall_instance_method_with_2_args(lex, SET, $STRING, string);
        methods.funcall_instance_method_with_2_args(lex, SET, $PENN_TAGS, list(penn));
        methods.funcall_instance_method_with_2_args(lex, SET, $SEMTRANS, methods.funcall_instance_method_with_2_args(self, FABRICATE_NOMINAL_SEMTRANS, string, keywords));
        return list(lex);
    }

    public static SubLObject semtrans_lexicon_fabricate_nominal_semtrans_method(final SubLObject self, final SubLObject string, final SubLObject keywords) {
        SubLObject literals = NIL;
        SubLObject cdolist_list_var = keywords;
        SubLObject keyword = NIL;
        keyword = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pcase_var = keyword;
            if (pcase_var.eql($NOUN)) {
                literals = cons(list($$isa, $NOUN, listS($$ThingDescribableAsFn, list($$WordFn, string), $list79)), literals);
            } else
                if (pcase_var.eql($POSSESSOR)) {
                    literals = cons($list81, literals);
                }

            cdolist_list_var = cdolist_list_var.rest();
            keyword = cdolist_list_var.first();
        } 
        return simplifier.conjoin(literals, UNPROVIDED);
    }

    public static SubLObject semtrans_lexicon_fabricate_verbal_method(final SubLObject self, final SubLObject string, final SubLObject keywords, final SubLObject penn) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != listp(keywords) : "Types.listp(keywords) " + "CommonSymbols.NIL != Types.listp(keywords) " + keywords;
        SubLObject lexes = NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_2_args(self, FABRICATE_VERBAL_SEMTRANS, string, keywords);
        SubLObject semtrans = NIL;
        semtrans = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject lex = object.new_class_instance(LEX_ENTRY);
            methods.funcall_instance_method_with_2_args(lex, SET, $STRING, string);
            methods.funcall_instance_method_with_2_args(lex, SET, $PENN_TAGS, list(penn));
            methods.funcall_instance_method_with_2_args(lex, SET, $SEMTRANS, semtrans);
            lexes = cons(lex, lexes);
            cdolist_list_var = cdolist_list_var.rest();
            semtrans = cdolist_list_var.first();
        } 
        return lexes;
    }

    public static SubLObject semtrans_lexicon_fabricate_verbal_semtrans_method(final SubLObject self, final SubLObject string, final SubLObject keywords) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_semtrans_lexicon_method = NIL;
        final SubLObject case_sensitivity = abstract_lexicon.get_abstract_lexicon_case_sensitivity(self);
        final SubLObject trie = abstract_lexicon.get_abstract_lexicon_trie(self);
        try {
            thread.throwStack.push($sym87$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
            try {
                if (NIL != subl_promotions.memberP($ACTION, keywords, EQ, UNPROVIDED)) {
                    SubLObject semtranses = NIL;
                    SubLObject cdolist_list_var = nl_trie.nl_trie_search(string, trie, case_sensitivity);
                    SubLObject entry = NIL;
                    entry = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$1 = methods.funcall_instance_method_with_2_args(self, NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES, entry, keywords);
                        SubLObject semtrans = NIL;
                        semtrans = cdolist_list_var_$1.first();
                        while (NIL != cdolist_list_var_$1) {
                            semtranses = cons(semtrans, semtranses);
                            cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                            semtrans = cdolist_list_var_$1.first();
                        } 
                        cdolist_list_var = cdolist_list_var.rest();
                        entry = cdolist_list_var.first();
                    } 
                    if (NIL == semtranses) {
                        SubLObject keyword_literal = NIL;
                        SubLObject literals = list(list($$isa, $ACTION, listS($$ThingDescribableAsFn, list($$WordFn, string), $list90)));
                        SubLObject cdolist_list_var2 = keywords;
                        SubLObject keyword = NIL;
                        keyword = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            keyword_literal = keyword_to_semtrans_literal(keyword, UNPROVIDED);
                            if (NIL != keyword_literal) {
                                literals = cons(keyword_literal, literals);
                            }
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            keyword = cdolist_list_var2.first();
                        } 
                        if (NIL != literals) {
                            semtranses = cons(simplifier.conjoin(literals, UNPROVIDED), semtranses);
                        }
                    }
                    sublisp_throw($sym87$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD, semtranses);
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    abstract_lexicon.set_abstract_lexicon_case_sensitivity(self, case_sensitivity);
                    abstract_lexicon.set_abstract_lexicon_trie(self, trie);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_semtrans_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym87$OUTER_CATCH_FOR_SEMTRANS_LEXICON_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_semtrans_lexicon_method;
    }

    public static SubLObject semtrans_lexicon_nl_trie_entry_to_verbal_semtranses_method(final SubLObject self, final SubLObject entry, final SubLObject keywords) {
        SubLObject semtranses = NIL;
        if ((NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) && (NIL != member($ACTION, keywords, EQ, UNPROVIDED))) {
            SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots(entry);
            SubLObject denot = NIL;
            denot = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                semtranses = cons(denot_to_verbal_semtrans(denot, keywords), semtranses);
                cdolist_list_var = cdolist_list_var.rest();
                denot = cdolist_list_var.first();
            } 
        }
        return semtranses;
    }

    public static SubLObject denot_to_verbal_semtrans(final SubLObject denot, final SubLObject keywords) {
        SubLObject literals = NIL;
        SubLObject literal = NIL;
        SubLObject cdolist_list_var = keywords;
        SubLObject keyword = NIL;
        keyword = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            literal = keyword_to_semtrans_literal(keyword, denot);
            if (NIL != literal) {
                literals = cons(literal, literals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            keyword = cdolist_list_var.first();
        } 
        return simplifier.conjoin(literals, UNPROVIDED);
    }

    public static SubLObject keyword_to_semtrans_literal(final SubLObject keyword, SubLObject denot) {
        if (denot == UNPROVIDED) {
            denot = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == denot) {
            return assoc(keyword, $default_verbal_lex_entry_literals$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
        }
        final SubLObject mt = $list95;
        if (keyword.eql($ACTION)) {
            if (NIL != fort_types_interface.collectionP(denot)) {
                return list($$isa, $ACTION, denot);
            }
            return list($$equals, $ACTION, denot);
        } else {
            if (keyword.eql($SUBJECT)) {
                return list(parsing_utilities.known_subject_roles_for_denot(denot, mt, T), $ACTION, $SUBJECT);
            }
            if (keyword.eql($OBJECT)) {
                return list(parsing_utilities.known_direct_object_roles_for_denot(denot, mt, T), $ACTION, $OBJECT);
            }
            if (keyword.eql($OBLIQUE_OBJECT)) {
                return list(parsing_utilities.known_indirect_object_roles_for_denot(denot, mt, T), $ACTION, $OBLIQUE_OBJECT);
            }
            return NIL;
        }
    }

    public static SubLObject semtrans_lexicon_fabricate_adjectival_method(final SubLObject self, final SubLObject string, final SubLObject keywords, final SubLObject penn) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != listp(keywords) : "Types.listp(keywords) " + "CommonSymbols.NIL != Types.listp(keywords) " + keywords;
        final SubLObject lex = object.new_class_instance(LEX_ENTRY);
        methods.funcall_instance_method_with_2_args(lex, SET, $STRING, string);
        methods.funcall_instance_method_with_2_args(lex, SET, $PENN_TAGS, list(penn));
        methods.funcall_instance_method_with_2_args(lex, SET, $SEMTRANS, list($$isa, $NOUN, listS($$ThingDescribableAsFn, list($$WordFn, string), $list102)));
        return list(lex);
    }

    public static SubLObject semtrans_lexicon_fabricate_adverbial_method(final SubLObject self, final SubLObject string, final SubLObject keywords, final SubLObject penn) {
        assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
        assert NIL != listp(keywords) : "Types.listp(keywords) " + "CommonSymbols.NIL != Types.listp(keywords) " + keywords;
        final SubLObject lex = object.new_class_instance(LEX_ENTRY);
        methods.funcall_instance_method_with_2_args(lex, SET, $STRING, string);
        methods.funcall_instance_method_with_2_args(lex, SET, $PENN_TAGS, list(penn));
        methods.funcall_instance_method_with_2_args(lex, SET, $SEMTRANS, list($$isa, $ACTION, listS($$ThingDescribableAsFn, list($$WordFn, string), $list105)));
        return list(lex);
    }

    public static SubLObject semtrans_lexicon_create_lex_entries_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_entry) {
        if (NIL != nl_trie.nl_trie_word_p(nl_trie_entry, UNPROVIDED)) {
            return methods.funcall_instance_method_with_2_args(self, CREATE_LEX_ENTRIES_NL_TRIE_WORD, string, nl_trie_entry);
        }
        if (NIL != nl_trie.nl_trie_name_p(nl_trie_entry, UNPROVIDED)) {
            return methods.funcall_instance_method_with_2_args(self, CREATE_LEX_ENTRIES_NL_TRIE_NAME, string, nl_trie_entry);
        }
        if (NIL != nl_trie.nl_trie_term_phrases_entry_p(nl_trie_entry, UNPROVIDED)) {
            return methods.funcall_instance_method_with_2_args(self, CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY, string, nl_trie_entry);
        }
        if (NIL != abstract_lexicon.lex_entry_p(nl_trie_entry)) {
            return list(methods.funcall_instance_method_with_0_args(nl_trie_entry, COPY));
        }
        return NIL;
    }

    public static SubLObject semtrans_lexicon_textract_lemma_to_lex_entry_method(final SubLObject self, final SubLObject lemma) {
        SubLObject cycl = NIL;
        SubLObject lex_entry = NIL;
        final SubLObject pcase_var = abstract_lexicon.textract_lemma_type(lemma);
        if (pcase_var.eql($PERSON)) {
            cycl = list($$and, $list119, list($$nameString, $NOUN, abstract_lexicon.textract_lemma_string(lemma)));
        } else
            if (pcase_var.eql($PERSON_)) {
                cycl = list($$and, $list119, list($$nameString, $NOUN, abstract_lexicon.textract_lemma_string(lemma)));
            } else
                if (pcase_var.eql($PLACE)) {
                    cycl = list($$and, $list123, list($$nameString, $NOUN, abstract_lexicon.textract_lemma_string(lemma)));
                } else
                    if (pcase_var.eql($PLACE_)) {
                        cycl = list($$and, $list123, list($$nameString, $NOUN, abstract_lexicon.textract_lemma_string(lemma)));
                    } else
                        if (pcase_var.eql($ORG)) {
                            cycl = list($$and, $list126, list($$nameString, $NOUN, abstract_lexicon.textract_lemma_string(lemma)));
                        } else
                            if (pcase_var.eql($UNAME)) {
                                cycl = list($$nameString, $NOUN, abstract_lexicon.textract_lemma_string(lemma));
                            } else {
                                cycl = NIL;
                            }





        if (NIL != cycl) {
            lex_entry = object.new_class_instance(LEX_ENTRY);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, $$ProperNoun);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, list(cycl));
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, $$RegularNounFrame);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, abstract_lexicon.textract_lemma_string(lemma));
        }
        return lex_entry;
    }

    public static SubLObject semtrans_lexicon_resporator_to_lex_entries_method(final SubLObject self, final SubLObject typeXstring) {
        SubLObject lex_entries = NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(self, RESPORATOR_TO_CYCL, typeXstring);
        SubLObject parse = NIL;
        parse = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, typeXstring.rest());
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, $$ProperNoun);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, list($$and, list($$isa, $NOUN, parse), list($$nameString, $NOUN, typeXstring.rest())));
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, $$RegularNounFrame);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, methods.funcall_class_method_with_1_args(ABSTRACT_LEXICON, RESPORATOR_TO_INFLECTIONS, typeXstring));
            lex_entries = cons(lex_entry, lex_entries);
            cdolist_list_var = cdolist_list_var.rest();
            parse = cdolist_list_var.first();
        } 
        return lex_entries;
    }

    public static SubLObject semtrans_lexicon_resporator_learn_method(final SubLObject self, final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(text) : "Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) " + text;
        SubLObject lexes = NIL;
        SubLObject typings = NIL;
        SubLObject errorP = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    typings = external_interfaces.resporator(text, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            errorP = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != errorP) {
            Errors.warn(errorP);
            return NIL;
        }
        SubLObject cdolist_list_var = typings;
        SubLObject typeXstring = NIL;
        typeXstring = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2 = methods.funcall_instance_method_with_1_args(self, RESPORATOR_TO_LEX_ENTRIES, typeXstring);
            SubLObject lex = NIL;
            lex = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                lexes = cons(lex, lexes);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                lex = cdolist_list_var_$2.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            typeXstring = cdolist_list_var.first();
        } 
        return lexes;
    }

    public static SubLObject semtrans_lexicon_resporatorXX_learn_method(final SubLObject self, final SubLObject text) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(text) : "Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) " + text;
        SubLObject lexes = NIL;
        SubLObject typings = NIL;
        SubLObject errorP = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    typings = external_interfaces.resporatorXX(text);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            errorP = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != errorP) {
            Errors.warn(errorP);
            return NIL;
        }
        SubLObject cdolist_list_var = typings;
        SubLObject typeXstring = NIL;
        typeXstring = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$3 = methods.funcall_instance_method_with_1_args(self, RESPORATOR_TO_LEX_ENTRIES, typeXstring);
            SubLObject lex = NIL;
            lex = cdolist_list_var_$3.first();
            while (NIL != cdolist_list_var_$3) {
                lexes = cons(lex, lexes);
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                lex = cdolist_list_var_$3.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            typeXstring = cdolist_list_var.first();
        } 
        return lexes;
    }

    public static SubLObject semtrans_lexicon_stanford_ner_learn_method(final SubLObject self, final SubLObject text) {
        return methods.funcall_instance_method_with_2_args(self, STANFORD_NER_LEARN_INT, text, NIL);
    }

    public static SubLObject semtrans_lexicon_stanford_ner_learn_tightened_types_method(final SubLObject self, final SubLObject text) {
        return methods.funcall_instance_method_with_2_args(self, STANFORD_NER_LEARN_INT, text, T);
    }

    public static SubLObject semtrans_lexicon_stanford_ner_learn_int_method(final SubLObject self, final SubLObject text, final SubLObject tighten_typesP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(text) : "Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) " + text;
        SubLObject new_lexes = NIL;
        final SubLObject sner = object.new_class_instance(STANFORD_NER);
        final SubLObject entity_clusters = methods.funcall_instance_method_with_1_args(sner, RUN, text);
        final SubLObject v_term_lexicon = methods.funcall_instance_method_with_0_args(self, GET_TERM_LEXICON);
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    SubLObject cdolist_list_var = entity_clusters;
                    SubLObject ec = NIL;
                    ec = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$4 = ec;
                        SubLObject nament = NIL;
                        nament = cdolist_list_var_$4.first();
                        while (NIL != cdolist_list_var_$4) {
                            methods.funcall_instance_method_with_1_args(nament, SET_LEXICON, v_term_lexicon);
                            if (!O.eql(methods.funcall_instance_method_with_0_args(nament, GET_TYPE))) {
                                final SubLObject type = methods.funcall_instance_method_with_0_args(nament, GET_CYC);
                                final SubLObject subtypes = ((NIL != tighten_typesP) && (NIL != type)) ? methods.funcall_instance_method_with_0_args(nament, TIGHTEN_TYPE).first() : NIL;
                                final SubLObject instance_meanings = named_entity_recognizer.get_nament_instance_meaning(nament);
                                final SubLObject string = methods.funcall_instance_method_with_0_args(nament, GET_STRING);
                                final SubLObject existing_entries = methods.funcall_instance_method_with_1_args(v_term_lexicon, GET, string);
                                SubLObject entity_lexes = NIL;
                                if (NIL != instance_meanings) {
                                    SubLObject cdolist_list_var_$5 = instance_meanings;
                                    SubLObject instance_meaning = NIL;
                                    instance_meaning = cdolist_list_var_$5.first();
                                    while (NIL != cdolist_list_var_$5) {
                                        final SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
                                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, string);
                                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, list($$equals, $NOUN, instance_meaning));
                                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, $$RegularNounFrame);
                                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, $list166);
                                        if (NIL == contains_semtrans_lexicon_usable_entryP(existing_entries)) {
                                            methods.funcall_instance_method_with_1_args(self, ADD, lex_entry);
                                            entity_lexes = cons(lex_entry, entity_lexes);
                                        }
                                        cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                                        instance_meaning = cdolist_list_var_$5.first();
                                    } 
                                } else {
                                    SubLObject cdolist_list_var_$6 = subtypes;
                                    SubLObject subtype = NIL;
                                    subtype = cdolist_list_var_$6.first();
                                    while (NIL != cdolist_list_var_$6) {
                                        final SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
                                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, string);
                                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, list($$and, list($$isa, $NOUN, subtype), list($$nameString, $NOUN, string)));
                                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, $$RegularNounFrame);
                                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, $list166);
                                        if (NIL == contains_semtrans_lexicon_usable_entryP(existing_entries)) {
                                            methods.funcall_instance_method_with_1_args(self, ADD, lex_entry);
                                            entity_lexes = cons(lex_entry, entity_lexes);
                                        }
                                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                                        subtype = cdolist_list_var_$6.first();
                                    } 
                                }
                                if ((NIL == entity_lexes) && (NIL != type)) {
                                    final SubLObject lex_entry2 = object.new_class_instance(LEX_ENTRY);
                                    final SubLObject existing_entries_$7 = methods.funcall_instance_method_with_1_args(v_term_lexicon, GET, string);
                                    methods.funcall_instance_method_with_2_args(lex_entry2, SET, $STRING, string);
                                    methods.funcall_instance_method_with_2_args(lex_entry2, SET, $SEMTRANS, list($$and, list($$isa, $NOUN, type), list($$nameString, $NOUN, string)));
                                    methods.funcall_instance_method_with_2_args(lex_entry2, SET, $FRAME, $$RegularNounFrame);
                                    methods.funcall_instance_method_with_2_args(lex_entry2, SET, $INFLECTIONS, $list166);
                                    if (NIL == contains_semtrans_lexicon_usable_entryP(existing_entries_$7)) {
                                        methods.funcall_instance_method_with_1_args(self, ADD, lex_entry2);
                                        entity_lexes = cons(lex_entry2, entity_lexes);
                                    }
                                }
                                final SubLObject items_var = entity_lexes;
                                if (items_var.isVector()) {
                                    final SubLObject vector_var = items_var;
                                    final SubLObject backwardP_var = NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject element_num;
                                    SubLObject item;
                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                        item = aref(vector_var, element_num);
                                        new_lexes = cons(item, new_lexes);
                                    }
                                } else {
                                    SubLObject cdolist_list_var_$7 = items_var;
                                    SubLObject item2 = NIL;
                                    item2 = cdolist_list_var_$7.first();
                                    while (NIL != cdolist_list_var_$7) {
                                        new_lexes = cons(item2, new_lexes);
                                        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                                        item2 = cdolist_list_var_$7.first();
                                    } 
                                }
                            }
                            cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                            nament = cdolist_list_var_$4.first();
                        } 
                        cdolist_list_var = cdolist_list_var.rest();
                        ec = cdolist_list_var.first();
                    } 
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error) {
            Errors.warn($str168$___S, error);
        }
        return new_lexes;
    }

    public static SubLObject contains_semtrans_lexicon_usable_entryP(final SubLObject lex_entries) {
        SubLObject usableP = NIL;
        if (NIL == usableP) {
            SubLObject csome_list_var = lex_entries;
            SubLObject entry = NIL;
            entry = csome_list_var.first();
            while ((NIL == usableP) && (NIL != csome_list_var)) {
                if (NIL == abstract_lexicon.lex_entry_p(abstract_lexicon.lex_entry_trie_entry(entry))) {
                    usableP = T;
                } else
                    if ((NIL != abstract_lexicon.lex_entry_p(entry)) && (NIL != abstract_lexicon.lex_entry_semtrans(entry))) {
                        usableP = T;
                    } else {
                        usableP = NIL;
                    }

                csome_list_var = csome_list_var.rest();
                entry = csome_list_var.first();
            } 
        }
        return usableP;
    }

    public static SubLObject semtrans_lexicon_number_learn_method(final SubLObject self, final SubLObject text) {
        final SubLObject numbers = abstract_lexicon.number_meanings(text);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = numbers;
        SubLObject number = NIL;
        number = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = number;
            SubLObject number_string = NIL;
            SubLObject meaning = NIL;
            destructuring_bind_must_consp(current, datum, $list172);
            number_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list172);
            meaning = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject known_entries = methods.funcall_instance_method_with_1_args(self, GET, number_string);
                final SubLObject already_known = subl_promotions.memberP(meaning, known_entries, EQUAL, LEX_ENTRY_SEMTRANS);
                if (NIL == already_known) {
                    final SubLObject lex_entry = number_semtrans_lex_entry(number_string, meaning);
                    methods.funcall_instance_method_with_1_args(self, ADD, lex_entry);
                    result = cons(lex_entry, result);
                }
            } else {
                cdestructuring_bind_error(datum, $list172);
            }
            cdolist_list_var = cdolist_list_var.rest();
            number = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject number_semtrans_lex_entry(final SubLObject string, final SubLObject number) {
        final SubLObject lex = object.new_class_instance(LEX_ENTRY);
        methods.funcall_instance_method_with_2_args(lex, SET, $STRING, string);
        methods.funcall_instance_method_with_2_args(lex, SET, $PENN_TAGS, $list175);
        methods.funcall_instance_method_with_2_args(lex, SET, $CYC_POS, $$Number_SP);
        methods.funcall_instance_method_with_2_args(lex, SET, $SEMTRANS, list($$equals, $NOUN, number));
        return lex;
    }

    public static SubLObject semtrans_lexicon_create_lex_entries_nl_trie_word_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject lex_entries = NIL;
        final SubLObject pred = nl_trie.nl_trie_entry_semantic_pred(nl_trie_entry, NIL);
        if (NIL != lexicon_vars.semtrans_predP(pred)) {
            SubLObject cdolist_list_var = cycl_utilities.hl_to_el(nl_trie.nl_trie_word_semtrans_templates(nl_trie_entry));
            SubLObject semtrans = NIL;
            semtrans = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject wu = nl_trie.nl_trie_word_word_unit(nl_trie_entry, UNPROVIDED);
                final SubLObject pos = nl_trie.nl_trie_entry_pos(nl_trie_entry);
                final SubLObject frame = nl_trie.nl_trie_word_frame(nl_trie_entry);
                final SubLObject inflections = (NIL != wu) ? pph_utilities.pph_filter_preds(lexicon_accessors.preds_of_stringXword(string, wu, UNPROVIDED, UNPROVIDED, UNPROVIDED), lexicon_utilities.preds_of_pos(pos, UNPROVIDED), UNPROVIDED) : $list179;
                final SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
                methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, pos);
                methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, semtrans);
                methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, frame);
                methods.funcall_instance_method_with_2_args(lex_entry, SET, $WORD_UNIT, wu);
                methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, string);
                methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, inflections);
                methods.funcall_instance_method_with_2_args(lex_entry, SET, $TRIE_ENTRY, nl_trie_entry);
                lex_entries = cons(lex_entry, lex_entries);
                cdolist_list_var = cdolist_list_var.rest();
                semtrans = cdolist_list_var.first();
            } 
        } else
            if (((NIL != $manufacture_semtrans_assertionsP$.getDynamicValue(thread)) && (NIL != subl_promotions.memberP(pred, $list182, UNPROVIDED, UNPROVIDED))) && (NIL != lexicon_accessors.genl_posP(nl_trie.nl_trie_word_pos(nl_trie_entry), $$Noun, UNPROVIDED))) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    SubLObject cdolist_list_var2 = nl_trie.nl_trie_entry_denots(nl_trie_entry);
                    SubLObject denot = NIL;
                    denot = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        if (NIL == fort_types_interface.predicate_p(denot)) {
                            final SubLObject lex_entry2 = object.new_class_instance(LEX_ENTRY);
                            methods.funcall_instance_method_with_2_args(lex_entry2, SET, $INFLECTIONS, nl_trie.nl_trie_word_pos_preds(nl_trie_entry));
                            methods.funcall_instance_method_with_2_args(lex_entry2, SET, $CYC_POS, nl_trie.nl_trie_word_pos(nl_trie_entry));
                            methods.funcall_instance_method_with_2_args(lex_entry2, SET, $SEMTRANS, list(NIL != isa.isa_in_any_mtP(denot, $$Collection) ? $$isa : $$equals, $NOUN, cycl_utilities.hl_to_el(denot)));
                            methods.funcall_instance_method_with_2_args(lex_entry2, SET, $FRAME, $$RegularNounFrame);
                            methods.funcall_instance_method_with_2_args(lex_entry2, SET, $WORD_UNIT, nl_trie.nl_trie_word_word_unit(nl_trie_entry, NIL));
                            methods.funcall_instance_method_with_2_args(lex_entry2, SET, $STRING, string);
                            methods.funcall_instance_method_with_2_args(lex_entry2, SET, $TRIE_ENTRY, nl_trie_entry);
                            lex_entries = cons(lex_entry2, lex_entries);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        denot = cdolist_list_var2.first();
                    } 
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }

        return lex_entries;
    }

    public static SubLObject semtrans_lexicon_create_lex_entries_nl_trie_name_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_entry) {
        SubLObject lex_entries = NIL;
        SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots(nl_trie_entry);
        SubLObject denot = NIL;
        denot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
            final SubLObject collectionP = fort_types_interface.collection_p(denot);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, list(NIL != collectionP ? $$isa : $$equals, $NOUN, cycl_utilities.hl_to_el(denot)));
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, $$ProperNoun);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, $$RegularNounFrame);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, $list166);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, string);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $TRIE_ENTRY, nl_trie_entry);
            lex_entries = cons(lex_entry, lex_entries);
            cdolist_list_var = cdolist_list_var.rest();
            denot = cdolist_list_var.first();
        } 
        return lex_entries;
    }

    public static SubLObject semtrans_lexicon_create_lex_entries_nl_trie_term_phrases_entry_method(final SubLObject self, final SubLObject string, final SubLObject tp_entry) {
        SubLObject lex_entries = NIL;
        final SubLObject pos = nl_trie.nl_trie_entry_pos(tp_entry);
        final SubLObject inflections = nl_trie.nl_trie_entry_pos_preds(tp_entry);
        final SubLObject predicate = nl_trie.nl_trie_entry_semantic_pred(tp_entry, NIL);
        final SubLObject pragmatics = nl_trie.nl_trie_entry_pragmatics(tp_entry);
        SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots(tp_entry);
        SubLObject denot = NIL;
        denot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
            final SubLObject collectionP = fort_types_interface.collection_p(denot);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $PRAGMATICS, pragmatics);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $SEMTRANS, list(NIL != collectionP ? $$isa : $$equals, $NOUN, cycl_utilities.hl_to_el(denot)));
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $PREDICATE, predicate);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, pos);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, string);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, inflections);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $TRIE_ENTRY, tp_entry);
            lex_entries = cons(lex_entry, lex_entries);
            cdolist_list_var = cdolist_list_var.rest();
            denot = cdolist_list_var.first();
        } 
        return lex_entries;
    }

    public static SubLObject semtrans_lexicon_create_lex_entries_number_method(final SubLObject self, final SubLObject number_string) {
        return NIL;
    }

    public static SubLObject semtrans_lexicon_noun_compound_learn_method(final SubLObject self, final SubLObject text) {
        return text_noun_compound_semtrans_lex_entries(text);
    }

    public static SubLObject noun_compound_semtrans_lex_entry(final SubLObject string, final SubLObject denotation, final SubLObject number) {
        final SubLObject lex = object.new_class_instance(LEX_ENTRY);
        final SubLObject penn_tags = (NIL != backward.removal_ask(listS($$genlPreds, number, $list203), UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? $list204 : $list205;
        final SubLObject base_sem_trans = list($$isa, $NOUN, denotation);
        final SubLObject reformulated_sem_trans = reformulator_hub.reformulate_cycl(base_sem_trans, $$EverythingPSC, UNPROVIDED);
        final SubLObject final_sem_trans = (NIL != reformulated_sem_trans) ? reformulated_sem_trans : base_sem_trans;
        methods.funcall_instance_method_with_2_args(lex, SET, $STRING, string);
        methods.funcall_instance_method_with_2_args(lex, SET, $PENN_TAGS, penn_tags);
        methods.funcall_instance_method_with_2_args(lex, SET, $CYC_POS, $$Noun);
        methods.funcall_instance_method_with_2_args(lex, SET, $FRAME, $$RegularNounFrame);
        methods.funcall_instance_method_with_2_args(lex, SET, $SEMTRANS, final_sem_trans);
        methods.funcall_instance_method_with_2_args(lex, SET, $INFLECTIONS, list(number));
        return lex;
    }

    public static SubLObject text_noun_compound_semtrans_lex_entries(final SubLObject str) {
        final SubLObject compounds = abstract_lexicon.noun_compound_meanings(str);
        SubLObject res = NIL;
        SubLObject cdolist_list_var = compounds;
        SubLObject compound = NIL;
        compound = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$9 = compound.rest();
            SubLObject meaning = NIL;
            meaning = cdolist_list_var_$9.first();
            while (NIL != cdolist_list_var_$9) {
                res = cons(noun_compound_semtrans_lex_entry(compound.first(), meaning.first(), second(meaning)), res);
                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                meaning = cdolist_list_var_$9.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            compound = cdolist_list_var.first();
        } 
        return res;
    }

    public static SubLObject semtrans_lexicon_cooccurrence_statistics_learn_method(final SubLObject self, final SubLObject text) {
        final SubLObject parse = methods.funcall_instance_method_with_1_args(parser.new_stanford_parser(UNPROVIDED, UNPROVIDED), PARSE, text);
        final SubLObject words = (NIL != parse) ? methods.funcall_instance_method_with_0_args(parse, YIELD) : NIL;
        SubLObject lexes = NIL;
        SubLObject cdolist_list_var;
        final SubLObject learned_nouns = cdolist_list_var = NIL;
        SubLObject learned_noun = NIL;
        learned_noun = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = learned_noun;
            SubLObject learned_string = NIL;
            SubLObject type = NIL;
            SubLObject relationship = NIL;
            SubLObject confidence = NIL;
            destructuring_bind_must_consp(current, datum, $list210);
            learned_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list210);
            type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list210);
            relationship = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list210);
            confidence = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject penn_tags = NIL;
                SubLObject parsed_string = NIL;
                SubLObject singularized_string = NIL;
                SubLObject semtrans = NIL;
                if (NIL == penn_tags) {
                    SubLObject csome_list_var = words;
                    SubLObject word = NIL;
                    word = csome_list_var.first();
                    while ((NIL == penn_tags) && (NIL != csome_list_var)) {
                        parsed_string = methods.funcall_instance_method_with_0_args(word, GET_STRING);
                        if (NIL != parsed_string) {
                            singularized_string = lexification_utilities.singularize_word(parsed_string, UNPROVIDED);
                        }
                        if (singularized_string.equalp(learned_string)) {
                            penn_tags = cons(methods.funcall_instance_method_with_0_args(word, GET_CATEGORY), penn_tags);
                        }
                        csome_list_var = csome_list_var.rest();
                        word = csome_list_var.first();
                    } 
                }
                final SubLObject pcase_var = relationship;
                if (pcase_var.eql($ISA)) {
                    semtrans = list($$equals, $NOUN, type);
                } else
                    if (pcase_var.eql($GENLS)) {
                        semtrans = list($$isa, $NOUN, list($$SubCollectionNamedFn, singularized_string, type));
                    }

                if ((NIL != penn_tags) && (NIL != semtrans)) {
                    final SubLObject lex = object.new_class_instance(LEX_ENTRY);
                    methods.funcall_instance_method_with_2_args(lex, SET, $STRING, parsed_string);
                    methods.funcall_instance_method_with_2_args(lex, SET, $PENN_TAGS, penn_tags);
                    methods.funcall_instance_method_with_2_args(lex, SET, $FRAME, $$RegularNounFrame);
                    methods.funcall_instance_method_with_2_args(lex, SET, $SEMTRANS, semtrans);
                    lexes = cons(lex, lexes);
                }
            } else {
                cdestructuring_bind_error(datum, $list210);
            }
            cdolist_list_var = cdolist_list_var.rest();
            learned_noun = cdolist_list_var.first();
        } 
        return lexes;
    }

    public static SubLObject semtrans_lexicon_from_term_lexicon(final SubLObject v_term_lexicon) {
        final SubLObject v_semtrans_lexicon = new_semtrans_lexicon();
        instances.set_slot(v_semtrans_lexicon, DEFAULT_KB_SPEC, instances.get_slot(v_term_lexicon, DEFAULT_KB_SPEC));
        methods.funcall_instance_method_with_1_args(v_semtrans_lexicon, SET_CASE_SENSITIVITY, instances.get_slot(v_term_lexicon, CASE_SENSITIVITY));
        return v_semtrans_lexicon;
    }

    public static SubLObject extract_cycl_from_semtrans_lex_entry(final SubLObject lex_entry, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        assert NIL != abstract_lexicon.lex_entry_p(lex_entry) : "abstract_lexicon.lex_entry_p(lex_entry) " + "CommonSymbols.NIL != abstract_lexicon.lex_entry_p(lex_entry) " + lex_entry;
        final SubLObject semtrans = methods.funcall_instance_method_with_1_args(lex_entry, GET, $SEMTRANS);
        return extract_cycl_from_semtrans_sentence(semtrans, lexicon);
    }

    public static SubLObject extract_cycl_from_semtrans_sentence(SubLObject semtrans, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        SubLObject concise_cycl = NIL;
        if (NIL != likely_ner_result_semtransP(semtrans, lexicon)) {
            concise_cycl = extract_concise_cycl_from_ner_semtrans(semtrans, lexicon);
        } else
            if (cycl_utilities.formula_arg0(semtrans).eql($$isa)) {
                concise_cycl = cycl_utilities.formula_arg2(semtrans, UNPROVIDED);
            } else
                if (cycl_utilities.formula_arg0(semtrans).eql($$equals)) {
                    concise_cycl = cycl_utilities.formula_arg2(semtrans, UNPROVIDED);
                } else
                    if (NIL != cycl_grammar.cycl_formula_p(cycl_utilities.formula_arg1(semtrans, UNPROVIDED))) {
                        if (NIL != cycl_utilities.expression_find($$InstanceFn, semtrans, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            semtrans = simplifier.simplify_cycl_sentence_syntax(semtrans, UNPROVIDED);
                            semtrans = remove_if(INSTANCEFN_CLAUSE, semtrans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                        if (NIL == concise_cycl) {
                            SubLObject csome_list_var = semtrans;
                            SubLObject clause = NIL;
                            clause = csome_list_var.first();
                            while ((NIL == concise_cycl) && (NIL != csome_list_var)) {
                                final SubLObject pred = cycl_utilities.formula_arg0(clause);
                                if (pred.eql($$isa)) {
                                    concise_cycl = cycl_utilities.formula_arg2(clause, UNPROVIDED);
                                } else
                                    if (pred.eql($$equals) && ((NIL == narts_high.naut_p(cycl_utilities.formula_arg2(clause, UNPROVIDED))) || (!cycl_utilities.formula_arg0(cycl_utilities.formula_arg2(clause, UNPROVIDED)).eql($$InstanceFn)))) {
                                        concise_cycl = cycl_utilities.formula_arg2(clause, UNPROVIDED);
                                    }

                                csome_list_var = csome_list_var.rest();
                                clause = csome_list_var.first();
                            } 
                        }
                    }



        if (concise_cycl.isKeyword() || (NIL == concise_cycl)) {
            concise_cycl = semtrans;
        }
        if (concise_cycl.isKeyword()) {
            concise_cycl = NIL;
        }
        return narts_high.nart_substitute(concise_cycl);
    }

    public static SubLObject instancefn_clause(final SubLObject clause) {
        return makeBoolean(cycl_utilities.formula_arg0(clause).eql($$equals) && cycl_utilities.formula_arg_position(clause, $list220, UNPROVIDED).eql($$InstanceFn));
    }

    public static SubLObject likely_ner_result_semtransP(final SubLObject semtrans, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        SubLObject isa_restriction = NIL;
        SubLObject name = NIL;
        final SubLObject instancefnP = NIL;
        SubLObject other_stuffP = NIL;
        if (semtrans.isList()) {
            SubLObject cdolist_list_var;
            final SubLObject terms = cdolist_list_var = cycl_utilities.formula_terms(simplifier.simplify_cycl_sentence_syntax(semtrans, UNPROVIDED), $IGNORE);
            SubLObject clause = NIL;
            clause = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != el_formula_p(clause)) {
                    if (cycl_utilities.formula_arg0(clause).eql($$isa) && (NIL == isa_restriction)) {
                        isa_restriction = cycl_utilities.formula_arg2(clause, UNPROVIDED);
                    } else
                        if (cycl_utilities.formula_arg0(clause).eql($$nameString)) {
                            name = cycl_utilities.formula_arg2(clause, UNPROVIDED);
                        } else {
                            other_stuffP = T;
                        }

                }
                cdolist_list_var = cdolist_list_var.rest();
                clause = cdolist_list_var.first();
            } 
            if ((NIL != isa_restriction) && (NIL != name)) {
                return get_infnt_nart_with_specification(name, isa_restriction, lexicon);
            }
        }
        return NIL;
    }

    public static SubLObject extract_concise_cycl_from_ner_semtrans(final SubLObject semtrans, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        return likely_ner_result_semtransP(semtrans, lexicon);
    }

    public static SubLObject get_infnt_nart_with_specification(final SubLObject name, final SubLObject isa_restriction, SubLObject lexicon) {
        if (lexicon == UNPROVIDED) {
            lexicon = NIL;
        }
        SubLObject result = NIL;
        result = find_infnt_nart_with_specification(name, isa_restriction);
        if (NIL == result) {
            if (NIL != lexicon) {
                methods.funcall_instance_method_with_1_args(lexicon, DELETE, name);
            }
            result = czer_main.cyc_find_or_create_nart(list($$InstanceNamedFn_Ternary, name, isa_restriction, Guids.guid_to_string(Guids.new_guid())), UNPROVIDED);
            if (cycl_utilities.formula_arg0(isa_restriction).equal($$CollectionIntersection2Fn)) {
                SubLObject cdolist_list_var = cycl_utilities.formula_args(isa_restriction, UNPROVIDED);
                SubLObject v_isa = NIL;
                v_isa = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    ke.ke_assert_now(list($$isa, result, v_isa), $$BaseKB, UNPROVIDED, UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    v_isa = cdolist_list_var.first();
                } 
            }
        }
        return result;
    }

    public static SubLObject find_infnt_nart_with_specification(final SubLObject name, final SubLObject isa_restriction) {
        final SubLObject isa_forts = cycl_utilities.expression_gather(isa_restriction, FORT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject tou_asserts = virtual_indexing.assertions_mentioning_terms(cons($$termOfUnit, isa_forts), UNPROVIDED);
        SubLObject result = NIL;
        if (NIL == result) {
            SubLObject csome_list_var = tou_asserts;
            SubLObject v_assert = NIL;
            v_assert = csome_list_var.first();
            while ((NIL == result) && (NIL != csome_list_var)) {
                final SubLObject nart = (cycl_utilities.formula_arg0(v_assert).eql($$termOfUnit)) ? cycl_utilities.formula_arg1(v_assert, UNPROVIDED) : NIL;
                if ((cycl_utilities.formula_arg0(nart).eql($$InstanceNamedFn_Ternary) && cycl_utilities.formula_arg1(nart, UNPROVIDED).equal(name)) && cycl_utilities.formula_arg2(nart, UNPROVIDED).equal(isa_restriction)) {
                    result = nart;
                }
                csome_list_var = csome_list_var.rest();
                v_assert = csome_list_var.first();
            } 
        }
        return result;
    }

    public static SubLObject declare_semtrans_lexicon_file() {
        declareFunction(me, "new_semtrans_lexicon", "NEW-SEMTRANS-LEXICON", 0, 0, false);
        declareFunction(me, "get_semtrans_lexicon", "GET-SEMTRANS-LEXICON", 0, 0, false);
        declareFunction(me, "get_semtrans_lexicon_my_term_lexicon", "GET-SEMTRANS-LEXICON-MY-TERM-LEXICON", 1, 0, false);
        declareFunction(me, "set_semtrans_lexicon_my_term_lexicon", "SET-SEMTRANS-LEXICON-MY-TERM-LEXICON", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_semtrans_lexicon_class", "SUBLOOP-RESERVED-INITIALIZE-SEMTRANS-LEXICON-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_semtrans_lexicon_instance", "SUBLOOP-RESERVED-INITIALIZE-SEMTRANS-LEXICON-INSTANCE", 1, 0, false);
        declareFunction(me, "semtrans_lexicon_p", "SEMTRANS-LEXICON-P", 1, 0, false);
        declareFunction(me, "semtrans_lexicon_initialize_method", "SEMTRANS-LEXICON-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "semtrans_lexicon_get_term_lexicon_method", "SEMTRANS-LEXICON-GET-TERM-LEXICON-METHOD", 1, 0, false);
        declareFunction(me, "new_term_lexicon_from_semtrans_lexicon", "NEW-TERM-LEXICON-FROM-SEMTRANS-LEXICON", 1, 0, false);
        declareFunction(me, "semtrans_lexicon_set_term_lexicon_method", "SEMTRANS-LEXICON-SET-TERM-LEXICON-METHOD", 2, 0, false);
        declareFunction(me, "semtrans_lexicon_fabricate_method", "SEMTRANS-LEXICON-FABRICATE-METHOD", 4, 0, false);
        declareFunction(me, "nominal_penn_tag", "NOMINAL-PENN-TAG", 1, 0, false);
        declareFunction(me, "verbal_penn_tag", "VERBAL-PENN-TAG", 1, 0, false);
        declareFunction(me, "adjectival_penn_tag", "ADJECTIVAL-PENN-TAG", 1, 0, false);
        declareFunction(me, "adverbial_penn_tag", "ADVERBIAL-PENN-TAG", 1, 0, false);
        declareFunction(me, "semtrans_lexicon_fabricate_nominal_method", "SEMTRANS-LEXICON-FABRICATE-NOMINAL-METHOD", 4, 0, false);
        declareFunction(me, "semtrans_lexicon_fabricate_nominal_semtrans_method", "SEMTRANS-LEXICON-FABRICATE-NOMINAL-SEMTRANS-METHOD", 3, 0, false);
        declareFunction(me, "semtrans_lexicon_fabricate_verbal_method", "SEMTRANS-LEXICON-FABRICATE-VERBAL-METHOD", 4, 0, false);
        declareFunction(me, "semtrans_lexicon_fabricate_verbal_semtrans_method", "SEMTRANS-LEXICON-FABRICATE-VERBAL-SEMTRANS-METHOD", 3, 0, false);
        declareFunction(me, "semtrans_lexicon_nl_trie_entry_to_verbal_semtranses_method", "SEMTRANS-LEXICON-NL-TRIE-ENTRY-TO-VERBAL-SEMTRANSES-METHOD", 3, 0, false);
        declareFunction(me, "denot_to_verbal_semtrans", "DENOT-TO-VERBAL-SEMTRANS", 2, 0, false);
        declareFunction(me, "keyword_to_semtrans_literal", "KEYWORD-TO-SEMTRANS-LITERAL", 1, 1, false);
        declareFunction(me, "semtrans_lexicon_fabricate_adjectival_method", "SEMTRANS-LEXICON-FABRICATE-ADJECTIVAL-METHOD", 4, 0, false);
        declareFunction(me, "semtrans_lexicon_fabricate_adverbial_method", "SEMTRANS-LEXICON-FABRICATE-ADVERBIAL-METHOD", 4, 0, false);
        declareFunction(me, "semtrans_lexicon_create_lex_entries_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-METHOD", 3, 0, false);
        declareFunction(me, "semtrans_lexicon_textract_lemma_to_lex_entry_method", "SEMTRANS-LEXICON-TEXTRACT-LEMMA-TO-LEX-ENTRY-METHOD", 2, 0, false);
        declareFunction(me, "semtrans_lexicon_resporator_to_lex_entries_method", "SEMTRANS-LEXICON-RESPORATOR-TO-LEX-ENTRIES-METHOD", 2, 0, false);
        declareFunction(me, "semtrans_lexicon_resporator_learn_method", "SEMTRANS-LEXICON-RESPORATOR-LEARN-METHOD", 2, 0, false);
        declareFunction(me, "semtrans_lexicon_resporatorXX_learn_method", "SEMTRANS-LEXICON-RESPORATOR++-LEARN-METHOD", 2, 0, false);
        declareFunction(me, "semtrans_lexicon_stanford_ner_learn_method", "SEMTRANS-LEXICON-STANFORD-NER-LEARN-METHOD", 2, 0, false);
        declareFunction(me, "semtrans_lexicon_stanford_ner_learn_tightened_types_method", "SEMTRANS-LEXICON-STANFORD-NER-LEARN-TIGHTENED-TYPES-METHOD", 2, 0, false);
        declareFunction(me, "semtrans_lexicon_stanford_ner_learn_int_method", "SEMTRANS-LEXICON-STANFORD-NER-LEARN-INT-METHOD", 3, 0, false);
        declareFunction(me, "contains_semtrans_lexicon_usable_entryP", "CONTAINS-SEMTRANS-LEXICON-USABLE-ENTRY?", 1, 0, false);
        declareFunction(me, "semtrans_lexicon_number_learn_method", "SEMTRANS-LEXICON-NUMBER-LEARN-METHOD", 2, 0, false);
        declareFunction(me, "number_semtrans_lex_entry", "NUMBER-SEMTRANS-LEX-ENTRY", 2, 0, false);
        declareFunction(me, "semtrans_lexicon_create_lex_entries_nl_trie_word_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-WORD-METHOD", 3, 0, false);
        declareFunction(me, "semtrans_lexicon_create_lex_entries_nl_trie_name_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-NAME-METHOD", 3, 0, false);
        declareFunction(me, "semtrans_lexicon_create_lex_entries_nl_trie_term_phrases_entry_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-TERM-PHRASES-ENTRY-METHOD", 3, 0, false);
        declareFunction(me, "semtrans_lexicon_create_lex_entries_number_method", "SEMTRANS-LEXICON-CREATE-LEX-ENTRIES-NUMBER-METHOD", 2, 0, false);
        declareFunction(me, "semtrans_lexicon_noun_compound_learn_method", "SEMTRANS-LEXICON-NOUN-COMPOUND-LEARN-METHOD", 2, 0, false);
        declareFunction(me, "noun_compound_semtrans_lex_entry", "NOUN-COMPOUND-SEMTRANS-LEX-ENTRY", 3, 0, false);
        declareFunction(me, "text_noun_compound_semtrans_lex_entries", "TEXT-NOUN-COMPOUND-SEMTRANS-LEX-ENTRIES", 1, 0, false);
        declareFunction(me, "semtrans_lexicon_cooccurrence_statistics_learn_method", "SEMTRANS-LEXICON-COOCCURRENCE-STATISTICS-LEARN-METHOD", 2, 0, false);
        declareFunction(me, "semtrans_lexicon_from_term_lexicon", "SEMTRANS-LEXICON-FROM-TERM-LEXICON", 1, 0, false);
        declareFunction(me, "extract_cycl_from_semtrans_lex_entry", "EXTRACT-CYCL-FROM-SEMTRANS-LEX-ENTRY", 1, 1, false);
        declareFunction(me, "extract_cycl_from_semtrans_sentence", "EXTRACT-CYCL-FROM-SEMTRANS-SENTENCE", 1, 1, false);
        declareFunction(me, "instancefn_clause", "INSTANCEFN-CLAUSE", 1, 0, false);
        declareFunction(me, "likely_ner_result_semtransP", "LIKELY-NER-RESULT-SEMTRANS?", 1, 1, false);
        declareFunction(me, "extract_concise_cycl_from_ner_semtrans", "EXTRACT-CONCISE-CYCL-FROM-NER-SEMTRANS", 1, 1, false);
        declareFunction(me, "get_infnt_nart_with_specification", "GET-INFNT-NART-WITH-SPECIFICATION", 2, 1, false);
        declareFunction(me, "find_infnt_nart_with_specification", "FIND-INFNT-NART-WITH-SPECIFICATION", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_semtrans_lexicon_file() {
        defparameter("*MANUFACTURE-SEMTRANS-ASSERTIONS?*", T);
        defparameter("*SEMTRANS-LEXICON*", NIL);
        defvar("*DEFAULT-VERBAL-LEX-ENTRY-LITERALS*", $list100);
        defparameter("*SEMTRANS-LEXICON-LEARNERS*", $list177);
        return NIL;
    }

    public static SubLObject setup_semtrans_lexicon_file() {
        classes.subloop_new_class(SEMTRANS_LEXICON, ABSTRACT_LEXICON, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(SEMTRANS_LEXICON, NIL);
        classes.subloop_note_class_initialization_function(SEMTRANS_LEXICON, SUBLOOP_RESERVED_INITIALIZE_SEMTRANS_LEXICON_CLASS);
        classes.subloop_note_instance_initialization_function(SEMTRANS_LEXICON, SUBLOOP_RESERVED_INITIALIZE_SEMTRANS_LEXICON_INSTANCE);
        subloop_reserved_initialize_semtrans_lexicon_class(SEMTRANS_LEXICON);
        methods.methods_incorporate_instance_method(INITIALIZE, SEMTRANS_LEXICON, $list34, NIL, $list35);
        methods.subloop_register_instance_method(SEMTRANS_LEXICON, INITIALIZE, SEMTRANS_LEXICON_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_TERM_LEXICON, SEMTRANS_LEXICON, $list34, NIL, $list42);
        methods.subloop_register_instance_method(SEMTRANS_LEXICON, GET_TERM_LEXICON, SEMTRANS_LEXICON_GET_TERM_LEXICON_METHOD);
        methods.methods_incorporate_instance_method(SET_TERM_LEXICON, SEMTRANS_LEXICON, $list34, $list48, $list49);
        methods.subloop_register_instance_method(SEMTRANS_LEXICON, SET_TERM_LEXICON, SEMTRANS_LEXICON_SET_TERM_LEXICON_METHOD);
        methods.methods_incorporate_instance_method(FABRICATE, SEMTRANS_LEXICON, $list53, $list54, $list55);
        methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE, SEMTRANS_LEXICON_FABRICATE_METHOD);
        methods.methods_incorporate_instance_method(FABRICATE_NOMINAL, SEMTRANS_LEXICON, $list53, $list54, $list65);
        methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE_NOMINAL, SEMTRANS_LEXICON_FABRICATE_NOMINAL_METHOD);
        methods.methods_incorporate_instance_method(FABRICATE_NOMINAL_SEMTRANS, SEMTRANS_LEXICON, $list34, $list73, $list74);
        methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE_NOMINAL_SEMTRANS, SEMTRANS_LEXICON_FABRICATE_NOMINAL_SEMTRANS_METHOD);
        methods.methods_incorporate_instance_method(FABRICATE_VERBAL, SEMTRANS_LEXICON, $list53, $list54, $list83);
        methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE_VERBAL, SEMTRANS_LEXICON_FABRICATE_VERBAL_METHOD);
        methods.methods_incorporate_instance_method(FABRICATE_VERBAL_SEMTRANS, SEMTRANS_LEXICON, $list34, $list73, $list86);
        methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE_VERBAL_SEMTRANS, SEMTRANS_LEXICON_FABRICATE_VERBAL_SEMTRANS_METHOD);
        methods.methods_incorporate_instance_method(NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES, SEMTRANS_LEXICON, $list34, $list92, $list93);
        methods.subloop_register_instance_method(SEMTRANS_LEXICON, NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES, SEMTRANS_LEXICON_NL_TRIE_ENTRY_TO_VERBAL_SEMTRANSES_METHOD);
        methods.methods_incorporate_instance_method(FABRICATE_ADJECTIVAL, SEMTRANS_LEXICON, $list53, $list54, $list101);
        methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE_ADJECTIVAL, SEMTRANS_LEXICON_FABRICATE_ADJECTIVAL_METHOD);
        methods.methods_incorporate_instance_method(FABRICATE_ADVERBIAL, SEMTRANS_LEXICON, $list53, $list54, $list104);
        methods.subloop_register_instance_method(SEMTRANS_LEXICON, FABRICATE_ADVERBIAL, SEMTRANS_LEXICON_FABRICATE_ADVERBIAL_METHOD);
        methods.methods_incorporate_instance_method(CREATE_LEX_ENTRIES, SEMTRANS_LEXICON, $list34, $list108, $list109);
        methods.subloop_register_instance_method(SEMTRANS_LEXICON, CREATE_LEX_ENTRIES, SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_METHOD);
        methods.methods_incorporate_class_method(TEXTRACT_LEMMA_TO_LEX_ENTRY, SEMTRANS_LEXICON, $list34, $list115, $list116);
        methods.subloop_register_class_method(SEMTRANS_LEXICON, TEXTRACT_LEMMA_TO_LEX_ENTRY, SEMTRANS_LEXICON_TEXTRACT_LEMMA_TO_LEX_ENTRY_METHOD);
        methods.methods_incorporate_instance_method(RESPORATOR_TO_LEX_ENTRIES, SEMTRANS_LEXICON, $list34, $list134, $list135);
        methods.subloop_register_instance_method(SEMTRANS_LEXICON, RESPORATOR_TO_LEX_ENTRIES, SEMTRANS_LEXICON_RESPORATOR_TO_LEX_ENTRIES_METHOD);
        methods.methods_incorporate_instance_method(RESPORATOR_LEARN, SEMTRANS_LEXICON, $list34, $list141, $list142);
        methods.subloop_register_instance_method(SEMTRANS_LEXICON, RESPORATOR_LEARN, SEMTRANS_LEXICON_RESPORATOR_LEARN_METHOD);
        methods.methods_incorporate_instance_method($sym145$RESPORATOR___LEARN, SEMTRANS_LEXICON, $list34, $list141, $list146);
        methods.subloop_register_instance_method(SEMTRANS_LEXICON, $sym145$RESPORATOR___LEARN, $sym147$SEMTRANS_LEXICON_RESPORATOR___LEARN_METHOD);
        methods.methods_incorporate_instance_method(STANFORD_NER_LEARN, SEMTRANS_LEXICON, $list34, $list141, $list149);
        methods.subloop_register_instance_method(SEMTRANS_LEXICON, STANFORD_NER_LEARN, SEMTRANS_LEXICON_STANFORD_NER_LEARN_METHOD);
        methods.methods_incorporate_instance_method(STANFORD_NER_LEARN_TIGHTENED_TYPES, SEMTRANS_LEXICON, $list34, $list141, $list153);
        methods.subloop_register_instance_method(SEMTRANS_LEXICON, STANFORD_NER_LEARN_TIGHTENED_TYPES, SEMTRANS_LEXICON_STANFORD_NER_LEARN_TIGHTENED_TYPES_METHOD);
        methods.methods_incorporate_instance_method(STANFORD_NER_LEARN_INT, SEMTRANS_LEXICON, $list34, $list155, $list156);
        methods.subloop_register_instance_method(SEMTRANS_LEXICON, STANFORD_NER_LEARN_INT, SEMTRANS_LEXICON_STANFORD_NER_LEARN_INT_METHOD);
        methods.methods_incorporate_instance_method(NUMBER_LEARN, SEMTRANS_LEXICON, $list34, $list141, $list171);
        methods.subloop_register_instance_method(SEMTRANS_LEXICON, NUMBER_LEARN, SEMTRANS_LEXICON_NUMBER_LEARN_METHOD);
        methods.methods_incorporate_instance_method(CREATE_LEX_ENTRIES_NL_TRIE_WORD, SEMTRANS_LEXICON, $list34, $list108, $list178);
        methods.subloop_register_instance_method(SEMTRANS_LEXICON, CREATE_LEX_ENTRIES_NL_TRIE_WORD, SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_WORD_METHOD);
        methods.methods_incorporate_instance_method(CREATE_LEX_ENTRIES_NL_TRIE_NAME, SEMTRANS_LEXICON, $list34, $list108, $list188);
        methods.subloop_register_instance_method(SEMTRANS_LEXICON, CREATE_LEX_ENTRIES_NL_TRIE_NAME, SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_NAME_METHOD);
        methods.methods_incorporate_instance_method(CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY, SEMTRANS_LEXICON, $list34, $list190, $list191);
        methods.subloop_register_instance_method(SEMTRANS_LEXICON, CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY, $sym194$SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_TERM_PHRASES_ENTRY_ME);
        methods.methods_incorporate_instance_method(CREATE_LEX_ENTRIES_NUMBER, SEMTRANS_LEXICON, $list34, $list196, $list197);
        methods.subloop_register_instance_method(SEMTRANS_LEXICON, CREATE_LEX_ENTRIES_NUMBER, SEMTRANS_LEXICON_CREATE_LEX_ENTRIES_NUMBER_METHOD);
        methods.methods_incorporate_instance_method(NOUN_COMPOUND_LEARN, SEMTRANS_LEXICON, $list34, $list141, $list200);
        methods.subloop_register_instance_method(SEMTRANS_LEXICON, NOUN_COMPOUND_LEARN, SEMTRANS_LEXICON_NOUN_COMPOUND_LEARN_METHOD);
        methods.methods_incorporate_instance_method(COOCCURRENCE_STATISTICS_LEARN, SEMTRANS_LEXICON, $list34, $list141, $list207);
        methods.subloop_register_instance_method(SEMTRANS_LEXICON, COOCCURRENCE_STATISTICS_LEARN, SEMTRANS_LEXICON_COOCCURRENCE_STATISTICS_LEARN_METHOD);
        return NIL;
    }

    private static SubLObject _constant_156_initializer() {
        return list(makeString("@param TEXT stringp; the text from which to learn lexical entries\n   @return listp; a list of semtrans lexical entries learned from TEXT"), list(makeSymbol("CHECK-TYPE"), makeSymbol("TEXT"), makeSymbol("STRINGP")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-LEXES"), NIL), list(makeSymbol("SNER"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("STANFORD-NER")))), list(makeSymbol("ENTITY-CLUSTERS"), list(makeSymbol("FIM"), makeSymbol("SNER"), list(makeSymbol("QUOTE"), makeSymbol("RUN")), makeSymbol("TEXT"))), list(makeSymbol("TERM-LEXICON"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-TERM-LEXICON")))), makeSymbol("ERROR")), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR")), list(makeSymbol("CDOLIST"), list(makeSymbol("EC"), makeSymbol("ENTITY-CLUSTERS")), list(makeSymbol("CDOLIST"), list(makeSymbol("NAMENT"), makeSymbol("EC")), list(makeSymbol("FIM"), makeSymbol("NAMENT"), list(makeSymbol("QUOTE"), makeSymbol("SET-LEXICON")), makeSymbol("TERM-LEXICON")), list(makeSymbol("PUNLESS"), list(EQL, list(makeSymbol("QUOTE"), makeSymbol("O")), list(makeSymbol("FIM"), makeSymbol("NAMENT"), list(makeSymbol("QUOTE"), makeSymbol("GET-TYPE")))), list(makeSymbol("CLET"), list(list(makeSymbol("TYPE"), list(makeSymbol("FIM"), makeSymbol("NAMENT"), list(makeSymbol("QUOTE"), makeSymbol("GET-CYC")))), list(makeSymbol("SUBTYPES"), list(makeSymbol("FWHEN"), list(makeSymbol("CAND"), makeSymbol("TIGHTEN-TYPES?"), makeSymbol("TYPE")), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("NAMENT"), list(makeSymbol("QUOTE"), makeSymbol("TIGHTEN-TYPE")))))), list(makeSymbol("INSTANCE-MEANINGS"), list(makeSymbol("GET-NAMENT-INSTANCE-MEANING"), makeSymbol("NAMENT"))), list(makeSymbol("STRING"), list(makeSymbol("FIM"), makeSymbol("NAMENT"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING")))), list(makeSymbol("EXISTING-ENTRIES"), list(makeSymbol("FIM"), makeSymbol("TERM-LEXICON"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeSymbol("STRING"))), list(makeSymbol("ENTITY-LEXES"))), list(makeSymbol("PIF"), makeSymbol("INSTANCE-MEANINGS"), list(makeSymbol("CDOLIST"), list(makeSymbol("INSTANCE-MEANING"), makeSymbol("INSTANCE-MEANINGS")), list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("equals")), makeKeyword("NOUN"), makeSymbol("INSTANCE-MEANING"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell(makeString("RegularNounFrame"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("pnNonPlural-Generic"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("CONTAINS-SEMTRANS-LEXICON-USABLE-ENTRY?"), makeSymbol("EXISTING-ENTRIES")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ADD")), makeSymbol("LEX-ENTRY")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("ENTITY-LEXES"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("SUBTYPE"), makeSymbol("SUBTYPES")), list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("and")), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("isa")), makeKeyword("NOUN"), makeSymbol("SUBTYPE")), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("nameString")), makeKeyword("NOUN"), makeSymbol("STRING")))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell(makeString("RegularNounFrame"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("pnNonPlural-Generic"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("CONTAINS-SEMTRANS-LEXICON-USABLE-ENTRY?"), makeSymbol("EXISTING-ENTRIES")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ADD")), makeSymbol("LEX-ENTRY")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("ENTITY-LEXES")))))), list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), makeSymbol("ENTITY-LEXES"), list(makeSymbol("NULL"), makeSymbol("TYPE"))), list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY")))), list(makeSymbol("EXISTING-ENTRIES"), list(makeSymbol("FIM"), makeSymbol("TERM-LEXICON"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeSymbol("STRING")))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("SEMTRANS"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("and")), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("isa")), makeKeyword("NOUN"), makeSymbol("TYPE")), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("nameString")), makeKeyword("NOUN"), makeSymbol("STRING")))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell(makeString("RegularNounFrame"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("pnNonPlural-Generic"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("CONTAINS-SEMTRANS-LEXICON-USABLE-ENTRY?"), makeSymbol("EXISTING-ENTRIES")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ADD")), makeSymbol("LEX-ENTRY")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("ENTITY-LEXES"))))), list(makeSymbol("CPUSH-ALL"), makeSymbol("ENTITY-LEXES"), makeSymbol("NEW-LEXES"))))))), list(makeSymbol("PWHEN"), makeSymbol("ERROR"), list(makeSymbol("WARN"), makeString("~%~S"), makeSymbol("ERROR"))), list(makeSymbol("RET"), makeSymbol("NEW-LEXES"))));
    }

    @Override
    public void declareFunctions() {
        declare_semtrans_lexicon_file();
    }

    @Override
    public void initializeVariables() {
        init_semtrans_lexicon_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_semtrans_lexicon_file();
    }

    
}

/**
 * Total time: 1195 ms
 */
