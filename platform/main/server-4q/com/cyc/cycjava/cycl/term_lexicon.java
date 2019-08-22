package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class term_lexicon extends SubLTranslatedFile {
    public static final SubLFile me = new term_lexicon();

    public static final String myName = "com.cyc.cycjava.cycl.term_lexicon";

    public static final String myFingerPrint = "b6a439a9ca434fef846926e578751284fff4ef5922fcf49e5ba2839a9cc0bba1";

    // defparameter
    private static final SubLSymbol $term_lexicon$ = makeSymbol("*TERM-LEXICON*");

    // defparameter
    /**
     * a list of regular expression to find dates in strings. Should be kept in
     * order from most complex to least complex.
     */
    private static final SubLSymbol $numeric_date_patterns$ = makeSymbol("*NUMERIC-DATE-PATTERNS*");

    // deflexical
    // The cached form of the compiled patterns.
    private static final SubLSymbol $compiled_numeric_date_patterns$ = makeSymbol("*COMPILED-NUMERIC-DATE-PATTERNS*");



    // defparameter
    // What learners should be available by default to term-lexica?
    public static final SubLSymbol $term_lexicon_learners$ = makeSymbol("*TERM-LEXICON-LEARNERS*");







    public static final SubLSymbol ABSTRACT_LEXICON = makeSymbol("ABSTRACT-LEXICON");

    public static final SubLList $list4 = list(new SubLObject[]{ list(makeSymbol("DEFAULT-KB-SPEC"), makeKeyword("CLASS"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), reader_make_constant_shell(makeString("TermLexiconSpecification"))), list(makeSymbol("CONVERT-TO-EL?"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED"), makeKeyword("VALUE"), T), list(makeSymbol("CONCEPT-FILTER-SPECS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEPENDENT-LEXICONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-LEX-ENTRIES"), list(makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NL-TRIE-WORD2LEX-ENTRY"), list(makeSymbol("STRING"), makeSymbol("NL-TRIE-NAME")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NL-TRIE-TP2LEX-ENTRIES"), list(makeSymbol("STRING"), makeSymbol("NL-TRIE-NAME")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NL-TRIE-NAME2LEX-ENTRIES"), list(makeSymbol("STRING"), makeSymbol("NL-TRIE-NAME")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STANFORD-NER-DATE-LEARN"), list(makeSymbol("TEXT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STANFORD-NER-LEARN"), list(makeSymbol("TEXT"), makeSymbol("&OPTIONAL"), makeSymbol("ALLOWED-TYPES")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NOTE-DEPENDENT-LEXICON"), list(makeSymbol("LEXICON")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-DEPENDENT-LEXICON"), list(makeSymbol("LEXICON")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CONVERT-TO-EL"), list(makeSymbol("BOOLEAN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONVERT-TO-EL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-CONCEPT-FILTER-SPEC"), list(makeSymbol("SPEC")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONCEPT-FILTER-SPECS"), NIL, makeKeyword("PUBLIC")) });

    public static final SubLSymbol DEPENDENT_LEXICONS = makeSymbol("DEPENDENT-LEXICONS");



    public static final SubLSymbol $sym7$CONVERT_TO_EL_ = makeSymbol("CONVERT-TO-EL?");







    public static final SubLList $list11 = list(new SubLObject[]{ reader_make_constant_shell(makeString("WebSearchDataMt")), reader_make_constant_shell(makeString("CyclistsMt")), reader_make_constant_shell(makeString("RelationParaphraseMt")), reader_make_constant_shell(makeString("WordNetMappingMt")), reader_make_constant_shell(makeString("PornographyJargonMt")), reader_make_constant_shell(makeString("CommonEnglishMisspellingsMt")), reader_make_constant_shell(makeString("ComputereseLexicalMt")), reader_make_constant_shell(makeString("CyclishMt")), reader_make_constant_shell(makeString("TemporaryLexicalAssertionsMt")), reader_make_constant_shell(makeString("EnglishWordSenseAssertions-HoldingMt")), reader_make_constant_shell(makeString("TemporaryLexicalAssertions-WordNetImportMt")), reader_make_constant_shell(makeString("RedundantLexicalMt")), reader_make_constant_shell(makeString("PDATemplateTestMt")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("SupplementalDeterminerSemTransLexicalMt")) });





    private static final SubLObject $const14$AllGeneralEnglishValidatedLexical = reader_make_constant_shell(makeString("AllGeneralEnglishValidatedLexicalMicrotheoryPSC"));



    private static final SubLObject $$AbstractLexiconSpecification = reader_make_constant_shell(makeString("AbstractLexiconSpecification"));

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TERM_LEXICON_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TERM-LEXICON-CLASS");























    public static final SubLSymbol $sym29$IGNORE_CACHE_ = makeSymbol("IGNORE-CACHE?");



    public static final SubLSymbol $sym31$ALLOW_FABRICATION_ = makeSymbol("ALLOW-FABRICATION?");









    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TERM_LEXICON_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TERM-LEXICON-INSTANCE");



    public static final SubLList $list38 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list39 = list(makeString("Initializes this term lexicon"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("ALLOW-FABRICATION?"), NIL), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym40$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");

    public static final SubLSymbol TERM_LEXICON_INITIALIZE_METHOD = makeSymbol("TERM-LEXICON-INITIALIZE-METHOD");

    public static final SubLSymbol NOTE_DEPENDENT_LEXICON = makeSymbol("NOTE-DEPENDENT-LEXICON");

    public static final SubLList $list43 = list(makeSymbol("LEXICON"));

    public static final SubLList $list44 = list(list(makeSymbol("CPUSH"), makeSymbol("LEXICON"), makeSymbol("DEPENDENT-LEXICONS")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym45$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");

    public static final SubLSymbol TERM_LEXICON_NOTE_DEPENDENT_LEXICON_METHOD = makeSymbol("TERM-LEXICON-NOTE-DEPENDENT-LEXICON-METHOD");

    public static final SubLSymbol REMOVE_DEPENDENT_LEXICON = makeSymbol("REMOVE-DEPENDENT-LEXICON");

    public static final SubLList $list48 = list(list(makeSymbol("CSETQ"), makeSymbol("DEPENDENT-LEXICONS"), list(makeSymbol("DELETE"), makeSymbol("LEXICON"), makeSymbol("DEPENDENT-LEXICONS"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym49$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");

    public static final SubLSymbol TERM_LEXICON_REMOVE_DEPENDENT_LEXICON_METHOD = makeSymbol("TERM-LEXICON-REMOVE-DEPENDENT-LEXICON-METHOD");

    public static final SubLSymbol SET_CONVERT_TO_EL = makeSymbol("SET-CONVERT-TO-EL");

    public static final SubLList $list52 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list53 = list(makeSymbol("BOOLEAN"));

    public static final SubLList $list54 = list(makeString("Set lexicon's convert-to-el? value to BOOLEAN."), list(makeSymbol("CSETQ"), makeSymbol("CONVERT-TO-EL?"), list(makeSymbol("BOOLEAN"), makeSymbol("BOOLEAN"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym55$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");

    public static final SubLSymbol TERM_LEXICON_SET_CONVERT_TO_EL_METHOD = makeSymbol("TERM-LEXICON-SET-CONVERT-TO-EL-METHOD");

    public static final SubLSymbol GET_CONVERT_TO_EL = makeSymbol("GET-CONVERT-TO-EL");

    public static final SubLList $list58 = list(makeString("Return lexicon's convert-to-el? value"), list(makeSymbol("RET"), makeSymbol("CONVERT-TO-EL?")));

    public static final SubLSymbol $sym59$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");

    public static final SubLSymbol TERM_LEXICON_GET_CONVERT_TO_EL_METHOD = makeSymbol("TERM-LEXICON-GET-CONVERT-TO-EL-METHOD");

    public static final SubLSymbol REMOVE_ALL_CONCEPT_FILTER_SPECS = makeSymbol("REMOVE-ALL-CONCEPT-FILTER-SPECS");

    public static final SubLList $list62 = list(list(makeSymbol("CSETQ"), makeSymbol("CONCEPT-FILTER-SPECS"), NIL), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym63$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");

    public static final SubLSymbol TERM_LEXICON_REMOVE_ALL_CONCEPT_FILTER_SPECS_METHOD = makeSymbol("TERM-LEXICON-REMOVE-ALL-CONCEPT-FILTER-SPECS-METHOD");

    public static final SubLSymbol ADD_CONCEPT_FILTER_SPEC = makeSymbol("ADD-CONCEPT-FILTER-SPEC");

    public static final SubLList $list66 = list(makeSymbol("SPEC"));

    public static final SubLList $list67 = list(makeString("Set lexicon's concept filter spec to SPEC"), list(makeSymbol("CHECK-TYPE"), makeSymbol("SPEC"), makeSymbol("CONCEPT-FILTER-SPECIFICATION-P")), list(makeSymbol("CPUSHNEW"), makeSymbol("SPEC"), makeSymbol("CONCEPT-FILTER-SPECS"), list(makeSymbol("QUOTE"), EQUAL)), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym68$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");

    public static final SubLSymbol CONCEPT_FILTER_SPECIFICATION_P = makeSymbol("CONCEPT-FILTER-SPECIFICATION-P");

    public static final SubLSymbol TERM_LEXICON_ADD_CONCEPT_FILTER_SPEC_METHOD = makeSymbol("TERM-LEXICON-ADD-CONCEPT-FILTER-SPEC-METHOD");

    public static final SubLSymbol GET_CONCEPT_FILTER_SPECS = makeSymbol("GET-CONCEPT-FILTER-SPECS");

    public static final SubLList $list72 = list(makeString("Return lexicon's concept filter specs"), list(makeSymbol("RET"), makeSymbol("CONCEPT-FILTER-SPECS")));

    public static final SubLSymbol $sym73$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");

    public static final SubLSymbol TERM_LEXICON_GET_CONCEPT_FILTER_SPECS_METHOD = makeSymbol("TERM-LEXICON-GET-CONCEPT-FILTER-SPECS-METHOD");



    public static final SubLList $list76 = list(makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY"));

    public static final SubLList $list77 = list(makeString("@param STRING stringp; a string for which to create a list of lex-entries\n   @param NL-TRIE-ENTRY nl-trie-word-p or nl-trie-name-p; an nl-trie entry out of which\n   to construct a lexical entry\n   @return listp; a list of lex-entries containing the information in STRING and NL-TRIE-ENTRY"), list(makeSymbol("PCOND"), list(list(makeSymbol("CAND"), list(makeSymbol("LEX-ENTRY-P"), makeSymbol("NL-TRIE-ENTRY")), list(makeSymbol("FIM"), makeSymbol("NL-TRIE-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("DENOT"))), list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("NL-TRIE-ENTRY")))), list(list(makeSymbol("NL-TRIE-WORD-P"), makeSymbol("NL-TRIE-ENTRY")), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("NL-TRIE-WORD2LEX-ENTRIES")), makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")))), list(list(makeSymbol("NL-TRIE-TERM-PHRASES-ENTRY-P"), makeSymbol("NL-TRIE-ENTRY")), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("NL-TRIE-TP2LEX-ENTRIES")), makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")))), list(T, list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("NL-TRIE-NAME2LEX-ENTRIES")), makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY"))))));





    public static final SubLSymbol NL_TRIE_WORD2LEX_ENTRIES = makeSymbol("NL-TRIE-WORD2LEX-ENTRIES");

    public static final SubLSymbol NL_TRIE_TP2LEX_ENTRIES = makeSymbol("NL-TRIE-TP2LEX-ENTRIES");

    public static final SubLSymbol NL_TRIE_NAME2LEX_ENTRIES = makeSymbol("NL-TRIE-NAME2LEX-ENTRIES");

    public static final SubLSymbol TERM_LEXICON_CREATE_LEX_ENTRIES_METHOD = makeSymbol("TERM-LEXICON-CREATE-LEX-ENTRIES-METHOD");

    public static final SubLSymbol RESPORATOR_TO_LEX_ENTRY = makeSymbol("RESPORATOR-TO-LEX-ENTRY");

    public static final SubLList $list85 = list(makeSymbol("TYPE.STRING"));

    public static final SubLList $list86 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("STRING"), list(makeSymbol("CDR"), makeSymbol("TYPE.STRING"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("CYC-POS"), reader_make_constant_shell(makeString("ProperNoun"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("singular"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("denotation"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("DENOT"), list(makeSymbol("FCM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("RESPORATOR-TO-CYCL")), list(makeSymbol("CAR"), makeSymbol("TYPE.STRING")))), list(makeSymbol("RET"), makeSymbol("LEX-ENTRY"))));









    private static final SubLObject $$ProperNoun = reader_make_constant_shell(makeString("ProperNoun"));



    public static final SubLList $list93 = list(reader_make_constant_shell(makeString("singular")));



    private static final SubLObject $$denotation = reader_make_constant_shell(makeString("denotation"));

    public static final SubLSymbol RESPORATOR_TO_CYCL = makeSymbol("RESPORATOR-TO-CYCL");

    public static final SubLSymbol TERM_LEXICON_RESPORATOR_TO_LEX_ENTRY_METHOD = makeSymbol("TERM-LEXICON-RESPORATOR-TO-LEX-ENTRY-METHOD");



    public static final SubLList $list99 = list(makeSymbol("&OPTIONAL"), makeSymbol("TARGET"));

    public static final SubLList $list100 = list(makeString("@return TERM-LEXICON-P; a copy of this lexicon.\n@note -- list values are copied with copy-list.\n@note -- cache and trie are set to their defaults."), list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("TARGET"), makeSymbol("TERM-LEXICON-P")), list(makeSymbol("CSETQ"), makeSymbol("TARGET"), list(makeSymbol("COPY"), makeSymbol("SUPER"), makeSymbol("TARGET"))), list(makeSymbol("CDOLIST"), list(makeSymbol("SLOT"), list(makeSymbol("QUOTE"), list(makeSymbol("DEFAULT-KB-SPEC"), makeSymbol("CONVERT-TO-EL?"), makeSymbol("CONCEPT-FILTER-SPECS")))), list(makeSymbol("CLET"), list(list(makeSymbol("VALUE"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), makeSymbol("SLOT")))), list(makeSymbol("PCOND"), list(list(makeSymbol("LISTP"), makeSymbol("VALUE")), list(makeSymbol("SET-SLOT"), makeSymbol("TARGET"), makeSymbol("SLOT"), list(makeSymbol("COPY-LIST"), makeSymbol("VALUE")))), list(T, list(makeSymbol("SET-SLOT"), makeSymbol("TARGET"), makeSymbol("SLOT"), makeSymbol("VALUE")))))), list(makeSymbol("RET"), makeSymbol("TARGET")));

    public static final SubLSymbol $sym101$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");

    public static final SubLSymbol TERM_LEXICON_P = makeSymbol("TERM-LEXICON-P");

    public static final SubLList $list103 = list(makeSymbol("DEFAULT-KB-SPEC"), makeSymbol("CONVERT-TO-EL?"), makeSymbol("CONCEPT-FILTER-SPECS"));

    public static final SubLSymbol TERM_LEXICON_COPY_METHOD = makeSymbol("TERM-LEXICON-COPY-METHOD");



    public static final SubLList $list106 = list(makeString("Finalizes this lexicon"), list(makeSymbol("CDOLIST"), list(makeSymbol("LEXICON"), makeSymbol("DEPENDENT-LEXICONS")), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(makeSymbol("QUOTE"), makeSymbol("ISOLATE")))), list(makeSymbol("ISOLATE"), makeSymbol("SUPER")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym107$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");

    public static final SubLSymbol TERM_LEXICON_ISOLATE_METHOD = makeSymbol("TERM-LEXICON-ISOLATE-METHOD");

    public static final SubLSymbol DELETE_STRING_WITH_TERM = makeSymbol("DELETE-STRING-WITH-TERM");

    public static final SubLList $list110 = list(makeSymbol("STRING"), makeSymbol("CYCL"));

    public static final SubLList $list111 = list(makeString("Deletes the entry associating STRING with CYCL from this lexicon"), list(makeSymbol("CHECK-TYPE"), makeSymbol("STRING"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("CYCL"), makeSymbol("CYCL-DENOTATIONAL-TERM-P")), list(makeSymbol("CLET"), list(list(makeSymbol("TRIE-KEY"), list(makeSymbol("NL-TRIE-STRING-TOKENIZE"), makeSymbol("STRING"))), list(makeSymbol("TRIE-ENTRIES"), list(makeSymbol("NL-TRIE-LOOKUP"), makeSymbol("TRIE"), makeSymbol("TRIE-KEY"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CASE-SENSITIVITY")))))), list(makeSymbol("CDOLIST"), list(makeSymbol("TRIE-ENTRY"), makeSymbol("TRIE-ENTRIES")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("LEX-ENTRY-P"), makeSymbol("TRIE-ENTRY")), list(EQUAL, makeSymbol("CYCL"), list(makeSymbol("FIM"), makeSymbol("TRIE-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("DENOT")))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("DELETE-ENTRY-FROM-STRING")), makeSymbol("TRIE-ENTRY"), makeSymbol("STRING"))))), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym112$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");





    private static final SubLSymbol GET_CASE_SENSITIVITY = makeSymbol("GET-CASE-SENSITIVITY");

    private static final SubLSymbol DELETE_ENTRY_FROM_STRING = makeSymbol("DELETE-ENTRY-FROM-STRING");

    private static final SubLSymbol TERM_LEXICON_DELETE_STRING_WITH_TERM_METHOD = makeSymbol("TERM-LEXICON-DELETE-STRING-WITH-TERM-METHOD");

    private static final SubLString $str118$_0_9__1_2______0_9__1_2______0_9_ = makeString("[0-9]{1,2}[/-][0-9]{1,2}[/-][0-9]{2,4}");

    private static final SubLString $str119$_0_9__4_4_______0_9__1_2_______0_ = makeString("[0-9]{4,4}[./-][0-9]{1,2}[./-][0-9]{1,2}");

    private static final SubLString $str120$_0_9__1_2______0_9__2_4_ = makeString("[0-9]{1,2}[/-][0-9]{2,4}");

    private static final SubLString $str121$_0_9__4_ = makeString("[0-9]{4}");

    private static final SubLSymbol SIMPLE_DATE_LEARN = makeSymbol("SIMPLE-DATE-LEARN");

    public static final SubLList $list123 = list(makeSymbol("TEXT"));

    private static final SubLList $list124 = list(list(makeSymbol("CLET"), list(makeSymbol("NEW-LEXES")), list(makeSymbol("CSOME"), list(makeSymbol("PATTERN"), list(makeSymbol("GET-NUMERIC-DATE-PATTERNS")), makeSymbol("NEW-LEXES")), list(makeSymbol("CDOLIST"), list(makeSymbol("POSSIBLE-DATE-STRING"), list(makeSymbol("FIND-ALL-MATCHES-FOR-PATTERN"), makeSymbol("PATTERN"), makeSymbol("TEXT"))), list(makeSymbol("CDOLIST"), list(makeSymbol("DATE-CYCL"), list(makeSymbol("PARSE-DATE-FROM-STRING-FAST"), makeSymbol("POSSIBLE-DATE-STRING"))), list(makeSymbol("CLET"), list(list(makeSymbol("EXISTING-ENTRIES"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeSymbol("POSSIBLE-DATE-STRING"))), list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("POSSIBLE-DATE-STRING")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("CYC-POS"), reader_make_constant_shell(makeString("ProperNoun"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("DENOT"), makeSymbol("DATE-CYCL")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell(makeString("RegularNounFrame"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("singular"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("LEX-ENTRY"), makeSymbol("EXISTING-ENTRIES"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY-EQUAL-P"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ADD")), makeSymbol("LEX-ENTRY")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("NEW-LEXES"))))))), list(makeSymbol("RET"), makeSymbol("NEW-LEXES"))));



    private static final SubLObject $$RegularNounFrame = reader_make_constant_shell(makeString("RegularNounFrame"));

    private static final SubLSymbol LEX_ENTRY_EQUAL_P = makeSymbol("LEX-ENTRY-EQUAL-P");



    private static final SubLSymbol TERM_LEXICON_SIMPLE_DATE_LEARN_METHOD = makeSymbol("TERM-LEXICON-SIMPLE-DATE-LEARN-METHOD");

    private static final SubLSymbol DATE_LEARN = makeSymbol("DATE-LEARN");

    private static final SubLList $list131 = list(list(makeSymbol("CLET"), list(makeSymbol("NEW-LEXES")), list(makeSymbol("CDOLIST"), list(makeSymbol("DATE-CYCL"), list(makeSymbol("PARSE-DATE-FROM-STRING-FAST"), makeSymbol("TEXT"))), list(makeSymbol("CLET"), list(list(makeSymbol("EXISTING-ENTRIES"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeSymbol("TEXT"))), list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("TEXT")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("CYC-POS"), reader_make_constant_shell(makeString("ProperNoun"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("DENOT"), makeSymbol("DATE-CYCL")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell(makeString("RegularNounFrame"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("singular"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("MEMBER?"), makeSymbol("LEX-ENTRY"), makeSymbol("EXISTING-ENTRIES"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY-EQUAL-P"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ADD")), makeSymbol("LEX-ENTRY")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("NEW-LEXES"))))), list(makeSymbol("RET"), makeSymbol("NEW-LEXES"))));

    private static final SubLSymbol TERM_LEXICON_DATE_LEARN_METHOD = makeSymbol("TERM-LEXICON-DATE-LEARN-METHOD");

    private static final SubLSymbol STANFORD_NER_DATE_LEARN = makeSymbol("STANFORD-NER-DATE-LEARN");

    private static final SubLList $list134 = list(makeString("@param TEXT stringp; the text from which to learn lexical entries for dates\n   @return listp; a list of term-lexicon lexical entries learned from TEXT.\n   This is intended to work over large strings, finding the dates embedded within them, using the \n   Stanford Named Entity Recognizer as a test to see what might be a date."), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("STANFORD-NER-LEARN")), makeSymbol("TEXT"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("Date")))), NIL)));



    private static final SubLList $list136 = list(reader_make_constant_shell(makeString("Date")));

    private static final SubLSymbol TERM_LEXICON_STANFORD_NER_DATE_LEARN_METHOD = makeSymbol("TERM-LEXICON-STANFORD-NER-DATE-LEARN-METHOD");

    public static final SubLList $list138 = list(makeSymbol("TEXT"), makeSymbol("&OPTIONAL"), list(makeSymbol("ALLOWED-TYPES"), makeKeyword("ANY")), list(makeSymbol("FABRICATE-MEANING?"), T));

    private static final SubLObject $list139 = _constant_139_initializer();





    private static final SubLSymbol KNOWN_CYC_TYPES = makeSymbol("KNOWN-CYC-TYPES");



    private static final SubLSymbol MERGE_CLUSTERS = makeSymbol("MERGE-CLUSTERS");





    private static final SubLObject $$InstanceNamedFn_Ternary = reader_make_constant_shell(makeString("InstanceNamedFn-Ternary"));

    private static final SubLString $str148$___S = makeString("~%~S");

    private static final SubLSymbol TERM_LEXICON_STANFORD_NER_LEARN_METHOD = makeSymbol("TERM-LEXICON-STANFORD-NER-LEARN-METHOD");

    private static final SubLSymbol NER_CLUSTERS = makeSymbol("NER-CLUSTERS");



    private static final SubLSymbol $ner_clusters_caching_state$ = makeSymbol("*NER-CLUSTERS-CACHING-STATE*");



    public static final SubLList $list154 = list(makeSymbol("STANFORD-NER-LEARN"), makeSymbol("NOUN-COMPOUND-LEARN"), makeSymbol("NUMBER-LEARN"), makeSymbol("SCALAR-INTERVAL-LEARN"), makeSymbol("SIMPLE-DATE-LEARN"));

    public static final SubLSymbol SCALAR_INTERVAL_LEARN = makeSymbol("SCALAR-INTERVAL-LEARN");

    public static final SubLList $list156 = list(list(makeSymbol("CLET"), list(list(makeSymbol("SCALAR-ENTRIES"))), list(makeSymbol("CDOLIST"), list(makeSymbol("SCALAR-STRING-CYCL"), list(makeSymbol("SCALAR-INTERVAL-MEANINGS"), makeSymbol("TEXT"))), list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("SCALAR-STRING"), makeSymbol("SCALAR-CYCL")), makeSymbol("SCALAR-STRING-CYCL"), list(makeSymbol("CLET"), list(list(makeSymbol("KNOWN-ENTRIES"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeSymbol("SCALAR-STRING"))), list(makeSymbol("ALREADY-KNOWN"), list(makeSymbol("MEMBER?"), makeSymbol("SCALAR-CYCL"), makeSymbol("KNOWN-ENTRIES"), list(makeSymbol("QUOTE"), EQUAL), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY-DENOT"))))), list(makeSymbol("PUNLESS"), makeSymbol("ALREADY-KNOWN"), list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NUMBER-TERM-LEX-ENTRY"), makeSymbol("SCALAR-STRING"), makeSymbol("SCALAR-CYCL")))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ADD")), makeSymbol("LEX-ENTRY")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("SCALAR-ENTRIES"))))))), list(makeSymbol("RET"), makeSymbol("SCALAR-ENTRIES"))));

    public static final SubLList $list157 = list(makeSymbol("SCALAR-STRING"), makeSymbol("SCALAR-CYCL"));

    public static final SubLSymbol LEX_ENTRY_DENOT = makeSymbol("LEX-ENTRY-DENOT");

    public static final SubLSymbol TERM_LEXICON_SCALAR_INTERVAL_LEARN_METHOD = makeSymbol("TERM-LEXICON-SCALAR-INTERVAL-LEARN-METHOD");



    public static final SubLList $list161 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NUMBERS"), list(makeSymbol("NUMBER-MEANINGS"), makeSymbol("TEXT"))), list(makeSymbol("RESULT"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("NUMBER"), makeSymbol("NUMBERS")), list(makeSymbol("CDESTRUCTURING-BIND"), list(makeSymbol("NUMBER-STRING"), makeSymbol("MEANING")), makeSymbol("NUMBER"), list(makeSymbol("CLET"), list(list(makeSymbol("KNOWN-ENTRIES"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeSymbol("NUMBER-STRING"))), list(makeSymbol("ALREADY-KNOWN"), list(makeSymbol("MEMBER?"), makeSymbol("MEANING"), makeSymbol("KNOWN-ENTRIES"), list(makeSymbol("QUOTE"), EQUAL), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY-DENOT"))))), list(makeSymbol("PUNLESS"), makeSymbol("ALREADY-KNOWN"), list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NUMBER-TERM-LEX-ENTRY"), makeSymbol("NUMBER-STRING"), makeSymbol("MEANING")))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ADD")), makeSymbol("LEX-ENTRY")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("RESULT"))))))), list(makeSymbol("RET"), makeSymbol("RESULT"))));

    public static final SubLList $list162 = list(makeSymbol("NUMBER-STRING"), makeSymbol("MEANING"));

    public static final SubLSymbol TERM_LEXICON_NUMBER_LEARN_METHOD = makeSymbol("TERM-LEXICON-NUMBER-LEARN-METHOD");



    public static final SubLList $list165 = list(makeKeyword("CD"));

    private static final SubLObject $$Number_SP = reader_make_constant_shell(makeString("Number-SP"));

    public static final SubLSymbol SIMPLE_DATE_FROM_STRING_LEARN = makeSymbol("SIMPLE-DATE-FROM-STRING-LEARN");

    public static final SubLList $list168 = list(makeString("learn a date using the entire string in TEXT"), list(makeSymbol("CLET"), list(list(makeSymbol("DATES"), list(makeSymbol("PARSE-DATE-FROM-STRING-FAST"), makeSymbol("TEXT"))), list(makeSymbol("RESULT"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("DATE"), makeSymbol("DATES")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("TEXT")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("CYC-POS"), reader_make_constant_shell(makeString("ProperNoun"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("DENOT"), makeSymbol("DATE")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell(makeString("RegularNounFrame"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("singular"))))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ADD")), makeSymbol("LEX-ENTRY")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("RESULT")) })), list(makeSymbol("RET"), makeSymbol("RESULT"))));

    public static final SubLSymbol TERM_LEXICON_SIMPLE_DATE_FROM_STRING_LEARN_METHOD = makeSymbol("TERM-LEXICON-SIMPLE-DATE-FROM-STRING-LEARN-METHOD");

    public static final SubLList $list170 = list(makeKeyword("NNP"));

    private static final SubLObject $$YearFn = reader_make_constant_shell(makeString("YearFn"));

    public static final SubLSymbol NOUN_COMPOUND_LEARN = makeSymbol("NOUN-COMPOUND-LEARN");

    public static final SubLList $list173 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ENTRIES"), list(makeSymbol("TEXT-NOUN-COMPOUND-TERM-LEX-ENTRIES"), makeSymbol("TEXT")))), list(makeSymbol("CDOLIST"), list(makeSymbol("ENTRY"), makeSymbol("ENTRIES")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ADD")), makeSymbol("ENTRY"))), list(makeSymbol("RET"), makeSymbol("ENTRIES"))));

    public static final SubLSymbol TERM_LEXICON_NOUN_COMPOUND_LEARN_METHOD = makeSymbol("TERM-LEXICON-NOUN-COMPOUND-LEARN-METHOD");

    public static final SubLList $list175 = cons(makeSymbol("STRING"), makeSymbol("MEANINGS"));

    public static final SubLList $list176 = list(makeSymbol("CYCL"), makeSymbol("AGR-PRED"));

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    public static final SubLList $list178 = list(reader_make_constant_shell(makeString("plural-Generic")));

    public static final SubLList $list179 = list(makeKeyword("NNS"));

    public static final SubLList $list180 = list(makeKeyword("NN"));

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$Noun = reader_make_constant_shell(makeString("Noun"));

    public static final SubLList $list183 = list(makeSymbol("STRING"), makeSymbol("NL-TRIE-WORD"));

    public static final SubLList $list184 = list(makeString("@param STRING stringp; a lexical string\n   @param NL-TRIE-WORD nl-trie-word-p; an nl-trie-word associated with STRING\n   @return lex-entry-p; a lexical entry with properties STRING and NL-TRIE-WORD"), list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRIES"), NIL), list(makeSymbol("WORD-UNIT"), list(makeSymbol("NL-TRIE-WORD-WORD-UNIT"), makeSymbol("NL-TRIE-WORD"))), list(makeSymbol("POS-PREDS"), list(makeSymbol("NL-TRIE-WORD-POS-PREDS"), makeSymbol("NL-TRIE-WORD"))), list(makeSymbol("LEX-PRED"), list(makeSymbol("NL-TRIE-ENTRY-SEMANTIC-PRED"), makeSymbol("NL-TRIE-WORD"))), list(makeSymbol("PRAGMATICS"), list(makeSymbol("NL-TRIE-ENTRY-PRAGMATICS"), makeSymbol("NL-TRIE-WORD")))), list(makeSymbol("CDOLIST"), list(makeSymbol("DENOT"), list(makeSymbol("NL-TRIE-ENTRY-DENOTS"), makeSymbol("NL-TRIE-WORD"))), list(makeSymbol("PWHEN"), list(makeSymbol("FIMPLIES"), makeSymbol("CONCEPT-FILTER-SPECS"), list(makeSymbol("DENOT-PASSES-FILTER-SPECS?"), makeSymbol("DENOT"), makeSymbol("CONCEPT-FILTER-SPECS"))), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("PRAGMATICS"), makeSymbol("PRAGMATICS")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("DENOT"), list(makeSymbol("FIF"), makeSymbol("CONVERT-TO-EL?"), list(makeSymbol("HL-TO-EL"), makeSymbol("DENOT")), makeSymbol("DENOT"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("PREDICATE"), makeSymbol("LEX-PRED")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("INFLECTIONS"), makeSymbol("POS-PREDS")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("WORD-UNIT"), makeSymbol("WORD-UNIT")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("TRIE-ENTRY"), makeSymbol("NL-TRIE-WORD")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES")) }))), list(makeSymbol("RET"), makeSymbol("LEX-ENTRIES"))));

    public static final SubLSymbol $sym185$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");







    public static final SubLSymbol TERM_LEXICON_NL_TRIE_WORD2LEX_ENTRIES_METHOD = makeSymbol("TERM-LEXICON-NL-TRIE-WORD2LEX-ENTRIES-METHOD");

    public static final SubLList $list190 = list(makeSymbol("STRING"), makeSymbol("NL-TRIE-NAME"));

    public static final SubLList $list191 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRIES"), NIL), list(makeSymbol("POS"), reader_make_constant_shell(makeString("ProperNoun"))), list(makeSymbol("PREDICATE"), list(makeSymbol("NL-TRIE-ENTRY-SEMANTIC-PRED"), makeSymbol("NL-TRIE-NAME"))), list(makeSymbol("PRAGMATICS"), list(makeSymbol("NL-TRIE-ENTRY-PRAGMATICS"), makeSymbol("NL-TRIE-NAME")))), list(makeSymbol("CDOLIST"), list(makeSymbol("DENOT"), list(makeSymbol("NL-TRIE-ENTRY-DENOTS"), makeSymbol("NL-TRIE-NAME"))), list(makeSymbol("PWHEN"), list(makeSymbol("FIMPLIES"), makeSymbol("CONCEPT-FILTER-SPECS"), list(makeSymbol("DENOT-PASSES-FILTER-SPECS?"), makeSymbol("DENOT"), makeSymbol("CONCEPT-FILTER-SPECS"))), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("PRAGMATICS"), makeSymbol("PRAGMATICS")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("DENOT"), list(makeSymbol("FIF"), makeSymbol("CONVERT-TO-EL?"), list(makeSymbol("HL-TO-EL"), makeSymbol("DENOT")), makeSymbol("DENOT"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("PREDICATE"), makeSymbol("PREDICATE")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("CYC-POS"), makeSymbol("POS")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("pnNonPlural-Generic"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("TRIE-ENTRY"), makeSymbol("NL-TRIE-NAME")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES")) }))), list(makeSymbol("RET"), makeSymbol("LEX-ENTRIES"))));

    public static final SubLSymbol $sym192$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");

    public static final SubLList $list193 = list(reader_make_constant_shell(makeString("pnNonPlural-Generic")));

    public static final SubLSymbol TERM_LEXICON_NL_TRIE_NAME2LEX_ENTRIES_METHOD = makeSymbol("TERM-LEXICON-NL-TRIE-NAME2LEX-ENTRIES-METHOD");

    public static final SubLList $list195 = list(makeSymbol("STRING"), makeSymbol("TP-ENTRY"));

    public static final SubLList $list196 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRIES"), NIL), list(makeSymbol("POS"), list(makeSymbol("NL-TRIE-ENTRY-POS"), makeSymbol("TP-ENTRY"))), list(makeSymbol("INFLECTIONS"), list(makeSymbol("NL-TRIE-ENTRY-POS-PREDS"), makeSymbol("TP-ENTRY"))), list(makeSymbol("PREDICATE"), list(makeSymbol("NL-TRIE-ENTRY-SEMANTIC-PRED"), makeSymbol("TP-ENTRY"))), list(makeSymbol("PRAGMATICS"), list(makeSymbol("NL-TRIE-ENTRY-PRAGMATICS"), makeSymbol("TP-ENTRY")))), list(makeSymbol("CDOLIST"), list(makeSymbol("DENOT"), list(makeSymbol("NL-TRIE-ENTRY-DENOTS"), makeSymbol("TP-ENTRY"))), list(makeSymbol("PWHEN"), list(makeSymbol("FIMPLIES"), makeSymbol("CONCEPT-FILTER-SPECS"), list(makeSymbol("DENOT-PASSES-FILTER-SPECS?"), makeSymbol("DENOT"), makeSymbol("CONCEPT-FILTER-SPECS"))), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("PRAGMATICS"), makeSymbol("PRAGMATICS")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("DENOT"), list(makeSymbol("FIF"), makeSymbol("CONVERT-TO-EL?"), list(makeSymbol("HL-TO-EL"), makeSymbol("DENOT")), makeSymbol("DENOT"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("PREDICATE"), makeSymbol("PREDICATE")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("CYC-POS"), makeSymbol("POS")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("INFLECTIONS"), makeSymbol("INFLECTIONS")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("TRIE-ENTRY"), makeSymbol("TP-ENTRY")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("LEX-ENTRIES")) }))), list(makeSymbol("RET"), makeSymbol("LEX-ENTRIES"))));

    public static final SubLSymbol $sym197$OUTER_CATCH_FOR_TERM_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TERM-LEXICON-METHOD");

    public static final SubLSymbol TERM_LEXICON_NL_TRIE_TP2LEX_ENTRIES_METHOD = makeSymbol("TERM-LEXICON-NL-TRIE-TP2LEX-ENTRIES-METHOD");

    public static final SubLSymbol DENOTS_FOR_TERM_LEXICON_ENTRIES = makeSymbol("DENOTS-FOR-TERM-LEXICON-ENTRIES");





    public static final SubLSymbol TEST_SIMPLE_DATE_LEARN = makeSymbol("TEST-SIMPLE-DATE-LEARN");



    public static final SubLSymbol $sym204$HAS_MEMBER_EQUAL_ = makeSymbol("HAS-MEMBER-EQUAL?");











    private static final SubLList $list210 = list(list(list(makeString("12/31/2006")), list(reader_make_constant_shell(makeString("DayFn")), makeInteger(31), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2006))))), list(list(makeString("31/12/2006")), list(reader_make_constant_shell(makeString("DayFn")), makeInteger(31), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2006))))), list(list(makeString("2/12/2006")), list(reader_make_constant_shell(makeString("DayFn")), TWO_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2006))))), list(list(makeString("2/12/2006")), list(reader_make_constant_shell(makeString("DayFn")), TWELVE_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("February")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2006))))), list(list(makeString("12-31-2006")), list(reader_make_constant_shell(makeString("DayFn")), makeInteger(31), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2006))))), list(list(makeString("2006.12.31")), list(reader_make_constant_shell(makeString("DayFn")), makeInteger(31), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2006))))), list(list(makeString("12/2006")), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("December")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2006)))));

    public static SubLObject new_term_lexicon() {
        return object.new_class_instance(TERM_LEXICON);
    }

    public static SubLObject get_term_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == term_lexicon_p($term_lexicon$.getDynamicValue(thread))) {
            $term_lexicon$.setDynamicValue(new_term_lexicon(), thread);
        }
        return $term_lexicon$.getDynamicValue(thread);
    }

    public static SubLObject new_case_sensitivity_preferred_term_lexicon() {
        final SubLObject lex = object.new_class_instance(TERM_LEXICON);
        methods.funcall_instance_method_with_1_args(lex, SET_CASE_SENSITIVITY, $PREFERRED);
        return lex;
    }

    public static SubLObject get_term_lexicon_dependent_lexicons(final SubLObject v_term_lexicon) {
        return classes.subloop_get_access_protected_instance_slot(v_term_lexicon, EIGHTEEN_INTEGER, DEPENDENT_LEXICONS);
    }

    public static SubLObject set_term_lexicon_dependent_lexicons(final SubLObject v_term_lexicon, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_term_lexicon, value, EIGHTEEN_INTEGER, DEPENDENT_LEXICONS);
    }

    public static SubLObject get_term_lexicon_concept_filter_specs(final SubLObject v_term_lexicon) {
        return classes.subloop_get_access_protected_instance_slot(v_term_lexicon, SEVENTEEN_INTEGER, CONCEPT_FILTER_SPECS);
    }

    public static SubLObject set_term_lexicon_concept_filter_specs(final SubLObject v_term_lexicon, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_term_lexicon, value, SEVENTEEN_INTEGER, CONCEPT_FILTER_SPECS);
    }

    public static SubLObject get_term_lexicon_convert_to_elP(final SubLObject v_term_lexicon) {
        return classes.subloop_get_access_protected_instance_slot(v_term_lexicon, SIXTEEN_INTEGER, $sym7$CONVERT_TO_EL_);
    }

    public static SubLObject set_term_lexicon_convert_to_elP(final SubLObject v_term_lexicon, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_term_lexicon, value, SIXTEEN_INTEGER, $sym7$CONVERT_TO_EL_);
    }

    public static SubLObject subloop_reserved_initialize_term_lexicon_class(final SubLObject new_instance) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_EXCLUDE_MTS, $list11);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_EXCLUDE_PREDICATES, set.set_element_list(lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(thread)));
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_BASE_MT, $const14$AllGeneralEnglishValidatedLexical);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_KB_SPEC, $$AbstractLexiconSpecification);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_term_lexicon_instance(final SubLObject new_instance) {
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
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, $sym29$IGNORE_CACHE_, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, CASE_SENSITIVITY, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, $sym31$ALLOW_FABRICATION_, T);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, LEARNED, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ACTIVE_LEARNERS, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ALLOW_STEMMING, T);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, STOP_WORDS, NIL);
        classes.subloop_initialize_slot(new_instance, TERM_LEXICON, $sym7$CONVERT_TO_EL_, T);
        classes.subloop_initialize_slot(new_instance, TERM_LEXICON, CONCEPT_FILTER_SPECS, NIL);
        classes.subloop_initialize_slot(new_instance, TERM_LEXICON, DEPENDENT_LEXICONS, NIL);
        return NIL;
    }

    public static SubLObject term_lexicon_p(final SubLObject v_term_lexicon) {
        return classes.subloop_instanceof_class(v_term_lexicon, TERM_LEXICON);
    }

    public static SubLObject term_lexicon_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = NIL;
        SubLObject allow_fabricationP = abstract_lexicon.get_abstract_lexicon_allow_fabricationP(self);
        try {
            thread.throwStack.push($sym40$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                abstract_lexicon.abstract_lexicon_initialize_method(self);
                allow_fabricationP = NIL;
                sublisp_throw($sym40$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, self);
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
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym40$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }

    public static SubLObject term_lexicon_note_dependent_lexicon_method(final SubLObject self, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = NIL;
        SubLObject dependent_lexicons = get_term_lexicon_dependent_lexicons(self);
        try {
            thread.throwStack.push($sym45$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                dependent_lexicons = cons(lexicon, dependent_lexicons);
                sublisp_throw($sym45$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_term_lexicon_dependent_lexicons(self, dependent_lexicons);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym45$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }

    public static SubLObject term_lexicon_remove_dependent_lexicon_method(final SubLObject self, final SubLObject lexicon) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = NIL;
        SubLObject dependent_lexicons = get_term_lexicon_dependent_lexicons(self);
        try {
            thread.throwStack.push($sym49$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                dependent_lexicons = delete(lexicon, dependent_lexicons, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                sublisp_throw($sym49$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_term_lexicon_dependent_lexicons(self, dependent_lexicons);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym49$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }

    public static SubLObject term_lexicon_set_convert_to_el_method(final SubLObject self, final SubLObject v_boolean) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = NIL;
        SubLObject convert_to_elP = get_term_lexicon_convert_to_elP(self);
        try {
            thread.throwStack.push($sym55$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                convert_to_elP = list_utilities.sublisp_boolean(v_boolean);
                sublisp_throw($sym55$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_term_lexicon_convert_to_elP(self, convert_to_elP);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym55$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }

    public static SubLObject term_lexicon_get_convert_to_el_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = NIL;
        final SubLObject convert_to_elP = get_term_lexicon_convert_to_elP(self);
        try {
            thread.throwStack.push($sym59$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                sublisp_throw($sym59$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, convert_to_elP);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_term_lexicon_convert_to_elP(self, convert_to_elP);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym59$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }

    public static SubLObject term_lexicon_remove_all_concept_filter_specs_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = NIL;
        SubLObject concept_filter_specs = get_term_lexicon_concept_filter_specs(self);
        try {
            thread.throwStack.push($sym63$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                concept_filter_specs = NIL;
                sublisp_throw($sym63$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_term_lexicon_concept_filter_specs(self, concept_filter_specs);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym63$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }

    public static SubLObject term_lexicon_add_concept_filter_spec_method(final SubLObject self, final SubLObject spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = NIL;
        SubLObject concept_filter_specs = get_term_lexicon_concept_filter_specs(self);
        try {
            thread.throwStack.push($sym68$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                assert NIL != concept_filter.concept_filter_specification_p(spec) : "concept_filter.concept_filter_specification_p(spec) " + "CommonSymbols.NIL != concept_filter.concept_filter_specification_p(spec) " + spec;
                if (NIL == member(spec, concept_filter_specs, EQUAL, symbol_function(IDENTITY))) {
                    concept_filter_specs = cons(spec, concept_filter_specs);
                }
                sublisp_throw($sym68$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_term_lexicon_concept_filter_specs(self, concept_filter_specs);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym68$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }

    public static SubLObject term_lexicon_get_concept_filter_specs_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = NIL;
        final SubLObject concept_filter_specs = get_term_lexicon_concept_filter_specs(self);
        try {
            thread.throwStack.push($sym73$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                sublisp_throw($sym73$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, concept_filter_specs);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_term_lexicon_concept_filter_specs(self, concept_filter_specs);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym73$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }

    public static SubLObject term_lexicon_create_lex_entries_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_entry) {
        if ((NIL != abstract_lexicon.lex_entry_p(nl_trie_entry)) && (NIL != methods.funcall_instance_method_with_1_args(nl_trie_entry, GET, $DENOT))) {
            return list(nl_trie_entry);
        }
        if (NIL != nl_trie.nl_trie_word_p(nl_trie_entry, UNPROVIDED)) {
            return methods.funcall_instance_method_with_2_args(self, NL_TRIE_WORD2LEX_ENTRIES, string, nl_trie_entry);
        }
        if (NIL != nl_trie.nl_trie_term_phrases_entry_p(nl_trie_entry, UNPROVIDED)) {
            return methods.funcall_instance_method_with_2_args(self, NL_TRIE_TP2LEX_ENTRIES, string, nl_trie_entry);
        }
        return methods.funcall_instance_method_with_2_args(self, NL_TRIE_NAME2LEX_ENTRIES, string, nl_trie_entry);
    }

    public static SubLObject term_lexicon_resporator_to_lex_entry_method(final SubLObject self, final SubLObject typeXstring) {
        final SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
        methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, typeXstring.rest());
        methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, $$ProperNoun);
        methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, $list93);
        methods.funcall_instance_method_with_2_args(lex_entry, SET, $PREDICATE, $$denotation);
        methods.funcall_instance_method_with_2_args(lex_entry, SET, $DENOT, methods.funcall_class_method_with_1_args(self, RESPORATOR_TO_CYCL, typeXstring.first()));
        return lex_entry;
    }

    public static SubLObject term_lexicon_copy_method(final SubLObject self, SubLObject target) {
        if (target == UNPROVIDED) {
            target = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = NIL;
        final SubLObject default_kb_spec = abstract_lexicon.get_abstract_lexicon_default_kb_spec(self);
        final SubLObject concept_filter_specs = get_term_lexicon_concept_filter_specs(self);
        final SubLObject convert_to_elP = get_term_lexicon_convert_to_elP(self);
        try {
            thread.throwStack.push($sym101$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                if (((NIL != target) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == term_lexicon_p(target))) {
                    throw new AssertionError(target);
                }
                target = abstract_lexicon.abstract_lexicon_copy_method(self, target);
                SubLObject cdolist_list_var = $list103;
                SubLObject slot = NIL;
                slot = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject value = instances.get_slot(self, slot);
                    if (value.isList()) {
                        instances.set_slot(target, slot, copy_list(value));
                    } else {
                        instances.set_slot(target, slot, value);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    slot = cdolist_list_var.first();
                } 
                sublisp_throw($sym101$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, target);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    abstract_lexicon.set_abstract_lexicon_default_kb_spec(self, default_kb_spec);
                    set_term_lexicon_concept_filter_specs(self, concept_filter_specs);
                    set_term_lexicon_convert_to_elP(self, convert_to_elP);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym101$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }

    public static SubLObject term_lexicon_isolate_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = NIL;
        final SubLObject dependent_lexicons = get_term_lexicon_dependent_lexicons(self);
        try {
            thread.throwStack.push($sym107$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                SubLObject cdolist_list_var = dependent_lexicons;
                SubLObject lexicon = NIL;
                lexicon = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    methods.funcall_instance_method_with_0_args(lexicon, ISOLATE);
                    cdolist_list_var = cdolist_list_var.rest();
                    lexicon = cdolist_list_var.first();
                } 
                abstract_lexicon.abstract_lexicon_isolate_method(self);
                sublisp_throw($sym107$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_term_lexicon_dependent_lexicons(self, dependent_lexicons);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym107$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }

    public static SubLObject term_lexicon_delete_string_with_term_method(final SubLObject self, final SubLObject string, final SubLObject cycl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = NIL;
        final SubLObject trie = abstract_lexicon.get_abstract_lexicon_trie(self);
        try {
            thread.throwStack.push($sym112$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                assert NIL != stringp(string) : "Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) " + string;
                assert NIL != cycl_grammar.cycl_denotational_term_p(cycl) : "cycl_grammar.cycl_denotational_term_p(cycl) " + "CommonSymbols.NIL != cycl_grammar.cycl_denotational_term_p(cycl) " + cycl;
                final SubLObject trie_key = nl_trie.nl_trie_string_tokenize(string);
                SubLObject cdolist_list_var;
                final SubLObject trie_entries = cdolist_list_var = nl_trie.nl_trie_lookup(trie, trie_key, methods.funcall_instance_method_with_0_args(self, GET_CASE_SENSITIVITY));
                SubLObject trie_entry = NIL;
                trie_entry = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((NIL != abstract_lexicon.lex_entry_p(trie_entry)) && cycl.equal(methods.funcall_instance_method_with_1_args(trie_entry, GET, $DENOT))) {
                        methods.funcall_instance_method_with_2_args(self, DELETE_ENTRY_FROM_STRING, trie_entry, string);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    trie_entry = cdolist_list_var.first();
                } 
                sublisp_throw($sym112$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    abstract_lexicon.set_abstract_lexicon_trie(self, trie);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym112$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }

    public static SubLObject get_numeric_date_patterns() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != regular_expressions.is_regular_expressions_support_availableP()) {
            if (NIL == $compiled_numeric_date_patterns$.getGlobalValue()) {
                SubLObject compiled_patterns = NIL;
                SubLObject cdolist_list_var = $numeric_date_patterns$.getDynamicValue(thread);
                SubLObject pattern_string = NIL;
                pattern_string = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    compiled_patterns = cons(regular_expressions.compile_regular_expression(pattern_string, UNPROVIDED), compiled_patterns);
                    cdolist_list_var = cdolist_list_var.rest();
                    pattern_string = cdolist_list_var.first();
                } 
                $compiled_numeric_date_patterns$.setGlobalValue(nreverse(compiled_patterns));
            }
            return $compiled_numeric_date_patterns$.getGlobalValue();
        }
        return NIL;
    }

    public static SubLObject term_lexicon_simple_date_learn_method(final SubLObject self, final SubLObject text) {
        SubLObject new_lexes = NIL;
        if (NIL == new_lexes) {
            SubLObject csome_list_var = get_numeric_date_patterns();
            SubLObject pattern = NIL;
            pattern = csome_list_var.first();
            while ((NIL == new_lexes) && (NIL != csome_list_var)) {
                SubLObject cdolist_list_var = regular_expression_utilities.find_all_matches_for_pattern(pattern, text, UNPROVIDED);
                SubLObject possible_date_string = NIL;
                possible_date_string = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$1 = date_utilities.parse_date_from_string_fast(possible_date_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    SubLObject date_cycl = NIL;
                    date_cycl = cdolist_list_var_$1.first();
                    while (NIL != cdolist_list_var_$1) {
                        final SubLObject existing_entries = methods.funcall_instance_method_with_1_args(self, GET, possible_date_string);
                        final SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, possible_date_string);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, $$ProperNoun);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $DENOT, date_cycl);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, $$RegularNounFrame);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, $list93);
                        if (NIL == subl_promotions.memberP(lex_entry, existing_entries, LEX_ENTRY_EQUAL_P, UNPROVIDED)) {
                            methods.funcall_instance_method_with_1_args(self, ADD, lex_entry);
                            new_lexes = cons(lex_entry, new_lexes);
                        }
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        date_cycl = cdolist_list_var_$1.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    possible_date_string = cdolist_list_var.first();
                } 
                csome_list_var = csome_list_var.rest();
                pattern = csome_list_var.first();
            } 
        }
        return new_lexes;
    }

    public static SubLObject term_lexicon_date_learn_method(final SubLObject self, final SubLObject text) {
        SubLObject new_lexes = NIL;
        SubLObject cdolist_list_var = date_utilities.parse_date_from_string_fast(text, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject date_cycl = NIL;
        date_cycl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject existing_entries = methods.funcall_instance_method_with_1_args(self, GET, text);
            final SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, text);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, $$ProperNoun);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $DENOT, date_cycl);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, $$RegularNounFrame);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, $list93);
            if (NIL == subl_promotions.memberP(lex_entry, existing_entries, LEX_ENTRY_EQUAL_P, UNPROVIDED)) {
                methods.funcall_instance_method_with_1_args(self, ADD, lex_entry);
                new_lexes = cons(lex_entry, new_lexes);
            }
            cdolist_list_var = cdolist_list_var.rest();
            date_cycl = cdolist_list_var.first();
        } 
        return new_lexes;
    }

    public static SubLObject term_lexicon_stanford_ner_date_learn_method(final SubLObject self, final SubLObject text) {
        return methods.funcall_instance_method_with_3_args(self, STANFORD_NER_LEARN, text, $list136, NIL);
    }

    public static SubLObject term_lexicon_stanford_ner_learn_method(final SubLObject self, final SubLObject text, SubLObject allowed_types, SubLObject fabricate_meaningP) {
        if (allowed_types == UNPROVIDED) {
            allowed_types = $ANY;
        }
        if (fabricate_meaningP == UNPROVIDED) {
            fabricate_meaningP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(text) : "Types.stringp(text) " + "CommonSymbols.NIL != Types.stringp(text) " + text;
        SubLObject new_lexes = NIL;
        SubLObject error = NIL;
        if (allowed_types == $ANY) {
            allowed_types = instances.get_slot(STANFORD_NER, KNOWN_CYC_TYPES);
        }
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject sner = object.new_class_instance(STANFORD_NER);
                    final SubLObject entity_clusters = ner_clusters(sner, text);
                    SubLObject cdolist_list_var;
                    final SubLObject merged_clusters = cdolist_list_var = methods.funcall_instance_method_with_2_args(sner, MERGE_CLUSTERS, entity_clusters, self);
                    SubLObject ec = NIL;
                    ec = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$2 = ec;
                        SubLObject nament = NIL;
                        nament = cdolist_list_var_$2.first();
                        while (NIL != cdolist_list_var_$2) {
                            if ((NIL == methods.funcall_instance_method_with_1_args(self, GET, methods.funcall_instance_method_with_0_args(nament, GET_STRING))) && (NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(nament, GET_CYC), allowed_types, UNPROVIDED, UNPROVIDED))) {
                                final SubLObject type = methods.funcall_instance_method_with_0_args(nament, GET_CYC);
                                final SubLObject subtypes = NIL;
                                final SubLObject instance_meanings = named_entity_recognizer.get_nament_instance_meaning(nament);
                                final SubLObject string = methods.funcall_instance_method_with_0_args(nament, GET_STRING);
                                final SubLObject current_entries = methods.funcall_instance_method_with_1_args(self, GET, string);
                                SubLObject cdolist_list_var_$3 = instance_meanings;
                                SubLObject instance = NIL;
                                instance = cdolist_list_var_$3.first();
                                while (NIL != cdolist_list_var_$3) {
                                    final SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
                                    methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, string);
                                    methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, $$ProperNoun);
                                    methods.funcall_instance_method_with_2_args(lex_entry, SET, $DENOT, instance);
                                    methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, $$RegularNounFrame);
                                    methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, $list93);
                                    methods.funcall_instance_method_with_1_args(self, ADD, lex_entry);
                                    new_lexes = cons(lex_entry, new_lexes);
                                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                                    instance = cdolist_list_var_$3.first();
                                } 
                                if (NIL != fabricate_meaningP) {
                                    SubLObject cdolist_list_var_$4 = subtypes;
                                    SubLObject subtype = NIL;
                                    subtype = cdolist_list_var_$4.first();
                                    while (NIL != cdolist_list_var_$4) {
                                        if (NIL == lexes_contain_entry_of_type(current_entries, subtype)) {
                                            final SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
                                            methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, string);
                                            methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, $$ProperNoun);
                                            methods.funcall_instance_method_with_2_args(lex_entry, SET, $DENOT, list($$InstanceNamedFn_Ternary, string, subtype, Guids.guid_to_string(Guids.new_guid())));
                                            methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, $$RegularNounFrame);
                                            methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, $list93);
                                            methods.funcall_instance_method_with_1_args(self, ADD, lex_entry);
                                            new_lexes = cons(lex_entry, new_lexes);
                                        }
                                        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                                        subtype = cdolist_list_var_$4.first();
                                    } 
                                    if (((NIL == new_lexes) && (NIL != type)) && (NIL == lexes_contain_entry_of_type(current_entries, type))) {
                                        final SubLObject lex_entry2 = object.new_class_instance(LEX_ENTRY);
                                        methods.funcall_instance_method_with_2_args(lex_entry2, SET, $STRING, string);
                                        methods.funcall_instance_method_with_2_args(lex_entry2, SET, $CYC_POS, $$ProperNoun);
                                        methods.funcall_instance_method_with_2_args(lex_entry2, SET, $DENOT, list($$InstanceNamedFn_Ternary, string, type, Guids.guid_to_string(Guids.new_guid())));
                                        methods.funcall_instance_method_with_2_args(lex_entry2, SET, $FRAME, $$RegularNounFrame);
                                        methods.funcall_instance_method_with_2_args(lex_entry2, SET, $INFLECTIONS, $list93);
                                        methods.funcall_instance_method_with_1_args(self, ADD, lex_entry2);
                                        new_lexes = cons(lex_entry2, new_lexes);
                                    }
                                }
                            }
                            cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                            nament = cdolist_list_var_$2.first();
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
            Errors.warn($str148$___S, error);
        }
        return new_lexes;
    }

    public static SubLObject clear_ner_clusters() {
        final SubLObject cs = $ner_clusters_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_ner_clusters(final SubLObject ner, final SubLObject text) {
        return memoization_state.caching_state_remove_function_results_with_args($ner_clusters_caching_state$.getGlobalValue(), list(ner, text), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ner_clusters_internal(final SubLObject ner, final SubLObject text) {
        return methods.funcall_instance_method_with_1_args(ner, RUN, text);
    }

    public static SubLObject ner_clusters(final SubLObject ner, final SubLObject text) {
        SubLObject caching_state = $ner_clusters_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(NER_CLUSTERS, $ner_clusters_caching_state$, $int$4096, EQUAL, TWO_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(ner, text);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (ner.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && text.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(ner_clusters_internal(ner, text)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(ner, text));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject lexes_contain_entry_of_type(final SubLObject entries, final SubLObject type) {
        SubLObject cdolist_list_var = entries;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject denot = methods.funcall_instance_method_with_1_args(entry, GET, $DENOT);
            if ((cycl_utilities.nat_functor(denot).eql($$InstanceNamedFn_Ternary) && cycl_utilities.nat_arg2(denot, UNPROVIDED).equal(type)) || (NIL != isa.isa_in_any_mtP(denot, type))) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject term_lexicon_scalar_interval_learn_method(final SubLObject self, final SubLObject text) {
        SubLObject scalar_entries = NIL;
        SubLObject cdolist_list_var = abstract_lexicon.scalar_interval_meanings(text);
        SubLObject scalar_string_cycl = NIL;
        scalar_string_cycl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = scalar_string_cycl;
            SubLObject scalar_string = NIL;
            SubLObject scalar_cycl = NIL;
            destructuring_bind_must_consp(current, datum, $list157);
            scalar_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list157);
            scalar_cycl = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject known_entries = methods.funcall_instance_method_with_1_args(self, GET, scalar_string);
                final SubLObject already_known = subl_promotions.memberP(scalar_cycl, known_entries, EQUAL, LEX_ENTRY_DENOT);
                if (NIL == already_known) {
                    final SubLObject lex_entry = number_term_lex_entry(scalar_string, scalar_cycl);
                    methods.funcall_instance_method_with_1_args(self, ADD, lex_entry);
                    scalar_entries = cons(lex_entry, scalar_entries);
                }
            } else {
                cdestructuring_bind_error(datum, $list157);
            }
            cdolist_list_var = cdolist_list_var.rest();
            scalar_string_cycl = cdolist_list_var.first();
        } 
        return scalar_entries;
    }

    public static SubLObject term_lexicon_number_learn_method(final SubLObject self, final SubLObject text) {
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
            destructuring_bind_must_consp(current, datum, $list162);
            number_string = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list162);
            meaning = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject known_entries = methods.funcall_instance_method_with_1_args(self, GET, number_string);
                final SubLObject already_known = subl_promotions.memberP(meaning, known_entries, EQUAL, LEX_ENTRY_DENOT);
                if (NIL == already_known) {
                    final SubLObject lex_entry = number_term_lex_entry(number_string, meaning);
                    methods.funcall_instance_method_with_1_args(self, ADD, lex_entry);
                    result = cons(lex_entry, result);
                }
            } else {
                cdestructuring_bind_error(datum, $list162);
            }
            cdolist_list_var = cdolist_list_var.rest();
            number = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject number_term_lex_entry(final SubLObject string, final SubLObject number) {
        final SubLObject lex = object.new_class_instance(LEX_ENTRY);
        methods.funcall_instance_method_with_2_args(lex, SET, $STRING, string);
        methods.funcall_instance_method_with_2_args(lex, SET, $PENN_TAGS, $list165);
        methods.funcall_instance_method_with_2_args(lex, SET, $CYC_POS, $$Number_SP);
        methods.funcall_instance_method_with_2_args(lex, SET, $DENOT, number);
        return lex;
    }

    public static SubLObject term_lexicon_simple_date_from_string_learn_method(final SubLObject self, final SubLObject text) {
        final SubLObject dates = date_utilities.parse_date_from_string_fast(text, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = dates;
        SubLObject date = NIL;
        date = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, text);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, $$ProperNoun);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $DENOT, date);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $FRAME, $$RegularNounFrame);
            methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, $list93);
            methods.funcall_instance_method_with_1_args(self, ADD, lex_entry);
            result = cons(lex_entry, result);
            cdolist_list_var = cdolist_list_var.rest();
            date = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject date_term_from_number_lex_entry(final SubLObject string, final SubLObject number) {
        final SubLObject lex = object.new_class_instance(LEX_ENTRY);
        methods.funcall_instance_method_with_2_args(lex, SET, $STRING, string);
        methods.funcall_instance_method_with_2_args(lex, SET, $PENN_TAGS, $list170);
        methods.funcall_instance_method_with_2_args(lex, SET, $CYC_POS, $$ProperNoun);
        methods.funcall_instance_method_with_2_args(lex, SET, $DENOT, list($$YearFn, number));
        return lex;
    }

    public static SubLObject term_lexicon_noun_compound_learn_method(final SubLObject self, final SubLObject text) {
        SubLObject cdolist_list_var;
        final SubLObject entries = cdolist_list_var = text_noun_compound_term_lex_entries(text);
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            methods.funcall_instance_method_with_1_args(self, ADD, entry);
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return entries;
    }

    public static SubLObject text_noun_compound_term_lex_entries(final SubLObject str) {
        final SubLObject compounds = abstract_lexicon.noun_compound_meanings(str);
        SubLObject res = NIL;
        SubLObject cdolist_list_var = compounds;
        SubLObject compound = NIL;
        compound = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = compound;
            SubLObject string = NIL;
            SubLObject meanings = NIL;
            destructuring_bind_must_consp(current, datum, $list175);
            string = current.first();
            current = current.rest();
            SubLObject cdolist_list_var_$5;
            meanings = cdolist_list_var_$5 = current;
            SubLObject meaning = NIL;
            meaning = cdolist_list_var_$5.first();
            while (NIL != cdolist_list_var_$5) {
                SubLObject current_$7;
                final SubLObject datum_$6 = current_$7 = meaning;
                SubLObject cycl = NIL;
                SubLObject agr_pred = NIL;
                destructuring_bind_must_consp(current_$7, datum_$6, $list176);
                cycl = current_$7.first();
                current_$7 = current_$7.rest();
                destructuring_bind_must_consp(current_$7, datum_$6, $list176);
                agr_pred = current_$7.first();
                current_$7 = current_$7.rest();
                if (NIL == current_$7) {
                    res = cons(noun_compound_term_lex_entry(string, cycl, agr_pred), res);
                } else {
                    cdestructuring_bind_error(datum_$6, $list176);
                }
                cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                meaning = cdolist_list_var_$5.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            compound = cdolist_list_var.first();
        } 
        return res;
    }

    public static SubLObject noun_compound_term_lex_entry(final SubLObject string, final SubLObject denotation, final SubLObject number) {
        final SubLObject lex = object.new_class_instance(LEX_ENTRY);
        final SubLObject penn_tags = (NIL != backward.removal_ask(listS($$genlPreds, number, $list178), UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? $list179 : $list180;
        final SubLObject reformulated_denotation = reformulator_hub.reformulate_cycl(denotation, $$EverythingPSC, UNPROVIDED);
        final SubLObject final_denotation = (NIL != reformulated_denotation) ? reformulated_denotation : denotation;
        methods.funcall_instance_method_with_2_args(lex, SET, $STRING, string);
        methods.funcall_instance_method_with_2_args(lex, SET, $PENN_TAGS, penn_tags);
        methods.funcall_instance_method_with_2_args(lex, SET, $CYC_POS, $$Noun);
        methods.funcall_instance_method_with_2_args(lex, SET, $FRAME, $$RegularNounFrame);
        methods.funcall_instance_method_with_2_args(lex, SET, $DENOT, final_denotation);
        methods.funcall_instance_method_with_2_args(lex, SET, $INFLECTIONS, list(number));
        return lex;
    }

    public static SubLObject term_lexicon_nl_trie_word2lex_entries_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_word) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = NIL;
        final SubLObject concept_filter_specs = get_term_lexicon_concept_filter_specs(self);
        final SubLObject convert_to_elP = get_term_lexicon_convert_to_elP(self);
        try {
            thread.throwStack.push($sym185$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                SubLObject lex_entries = NIL;
                final SubLObject word_unit = nl_trie.nl_trie_word_word_unit(nl_trie_word, UNPROVIDED);
                final SubLObject pos_preds = nl_trie.nl_trie_word_pos_preds(nl_trie_word);
                final SubLObject lex_pred = nl_trie.nl_trie_entry_semantic_pred(nl_trie_word, UNPROVIDED);
                final SubLObject pragmatics = nl_trie.nl_trie_entry_pragmatics(nl_trie_word);
                SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots(nl_trie_word);
                SubLObject denot = NIL;
                denot = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((NIL == concept_filter_specs) || (NIL != denot_passes_filter_specsP(denot, concept_filter_specs))) {
                        final SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $PRAGMATICS, pragmatics);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $DENOT, NIL != convert_to_elP ? cycl_utilities.hl_to_el(denot) : denot);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $PREDICATE, lex_pred);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, pos_preds);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $WORD_UNIT, word_unit);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $TRIE_ENTRY, nl_trie_word);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, string);
                        lex_entries = cons(lex_entry, lex_entries);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    denot = cdolist_list_var.first();
                } 
                sublisp_throw($sym185$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, lex_entries);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_term_lexicon_concept_filter_specs(self, concept_filter_specs);
                    set_term_lexicon_convert_to_elP(self, convert_to_elP);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym185$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }

    public static SubLObject term_lexicon_nl_trie_name2lex_entries_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = NIL;
        final SubLObject concept_filter_specs = get_term_lexicon_concept_filter_specs(self);
        final SubLObject convert_to_elP = get_term_lexicon_convert_to_elP(self);
        try {
            thread.throwStack.push($sym192$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                SubLObject lex_entries = NIL;
                final SubLObject pos = $$ProperNoun;
                final SubLObject predicate = nl_trie.nl_trie_entry_semantic_pred(nl_trie_name, UNPROVIDED);
                final SubLObject pragmatics = nl_trie.nl_trie_entry_pragmatics(nl_trie_name);
                SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots(nl_trie_name);
                SubLObject denot = NIL;
                denot = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((NIL == concept_filter_specs) || (NIL != denot_passes_filter_specsP(denot, concept_filter_specs))) {
                        final SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $PRAGMATICS, pragmatics);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $DENOT, NIL != convert_to_elP ? cycl_utilities.hl_to_el(denot) : denot);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $PREDICATE, predicate);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, pos);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, string);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, $list193);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $TRIE_ENTRY, nl_trie_name);
                        lex_entries = cons(lex_entry, lex_entries);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    denot = cdolist_list_var.first();
                } 
                sublisp_throw($sym192$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, lex_entries);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_term_lexicon_concept_filter_specs(self, concept_filter_specs);
                    set_term_lexicon_convert_to_elP(self, convert_to_elP);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym192$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }

    public static SubLObject term_lexicon_nl_trie_tp2lex_entries_method(final SubLObject self, final SubLObject string, final SubLObject tp_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_term_lexicon_method = NIL;
        final SubLObject concept_filter_specs = get_term_lexicon_concept_filter_specs(self);
        final SubLObject convert_to_elP = get_term_lexicon_convert_to_elP(self);
        try {
            thread.throwStack.push($sym197$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
            try {
                SubLObject lex_entries = NIL;
                final SubLObject pos = nl_trie.nl_trie_entry_pos(tp_entry);
                final SubLObject inflections = nl_trie.nl_trie_entry_pos_preds(tp_entry);
                final SubLObject predicate = nl_trie.nl_trie_entry_semantic_pred(tp_entry, UNPROVIDED);
                final SubLObject pragmatics = nl_trie.nl_trie_entry_pragmatics(tp_entry);
                SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots(tp_entry);
                SubLObject denot = NIL;
                denot = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((NIL == concept_filter_specs) || (NIL != denot_passes_filter_specsP(denot, concept_filter_specs))) {
                        final SubLObject lex_entry = object.new_class_instance(LEX_ENTRY);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $PRAGMATICS, pragmatics);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $DENOT, NIL != convert_to_elP ? cycl_utilities.hl_to_el(denot) : denot);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $PREDICATE, predicate);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $CYC_POS, pos);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $STRING, string);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $INFLECTIONS, inflections);
                        methods.funcall_instance_method_with_2_args(lex_entry, SET, $TRIE_ENTRY, tp_entry);
                        lex_entries = cons(lex_entry, lex_entries);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    denot = cdolist_list_var.first();
                } 
                sublisp_throw($sym197$OUTER_CATCH_FOR_TERM_LEXICON_METHOD, lex_entries);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_term_lexicon_concept_filter_specs(self, concept_filter_specs);
                    set_term_lexicon_convert_to_elP(self, convert_to_elP);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_term_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym197$OUTER_CATCH_FOR_TERM_LEXICON_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_term_lexicon_method;
    }

    public static SubLObject denot_passes_filter_specsP(final SubLObject denot, final SubLObject filter_specs) {
        SubLObject cdolist_list_var = filter_specs;
        SubLObject filter_spec = NIL;
        filter_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == denot_passes_filter_specP(denot, filter_spec)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            filter_spec = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject denot_passes_filter_specP(final SubLObject denot, final SubLObject filter_spec) {
        return list_utilities.non_empty_list_p(concept_filter.valid_concept_filter_nodes(denot, filter_spec));
    }

    public static SubLObject denots_for_term_lexicon_entries(final SubLObject entries) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = entries;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = narts_high.nart_substitute(methods.funcall_instance_method_with_1_args(entry, GET, $DENOT));
            if (NIL == member(item_var, result, EQUAL, symbol_function(IDENTITY))) {
                result = cons(item_var, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject test_simple_date_learn(final SubLObject sentence) {
        final SubLObject lex = new_term_lexicon();
        SubLObject dates = NIL;
        methods.funcall_instance_method_with_1_args(lex, ADD_LEARNER, SIMPLE_DATE_LEARN);
        methods.funcall_instance_method_with_1_args(lex, LEARN, sentence);
        SubLObject cdolist_list_var;
        final SubLObject lexes = cdolist_list_var = methods.funcall_instance_method_with_1_args(lex, GET, sentence);
        SubLObject lex_item = NIL;
        lex_item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dates = cons(methods.funcall_instance_method_with_1_args(lex_item, GET, $DENOT), dates);
            cdolist_list_var = cdolist_list_var.rest();
            lex_item = cdolist_list_var.first();
        } 
        return dates;
    }

    public static SubLObject declare_term_lexicon_file() {
        declareFunction(me, "new_term_lexicon", "NEW-TERM-LEXICON", 0, 0, false);
        declareFunction(me, "get_term_lexicon", "GET-TERM-LEXICON", 0, 0, false);
        declareFunction(me, "new_case_sensitivity_preferred_term_lexicon", "NEW-CASE-SENSITIVITY-PREFERRED-TERM-LEXICON", 0, 0, false);
        declareFunction(me, "get_term_lexicon_dependent_lexicons", "GET-TERM-LEXICON-DEPENDENT-LEXICONS", 1, 0, false);
        declareFunction(me, "set_term_lexicon_dependent_lexicons", "SET-TERM-LEXICON-DEPENDENT-LEXICONS", 2, 0, false);
        declareFunction(me, "get_term_lexicon_concept_filter_specs", "GET-TERM-LEXICON-CONCEPT-FILTER-SPECS", 1, 0, false);
        declareFunction(me, "set_term_lexicon_concept_filter_specs", "SET-TERM-LEXICON-CONCEPT-FILTER-SPECS", 2, 0, false);
        declareFunction(me, "get_term_lexicon_convert_to_elP", "GET-TERM-LEXICON-CONVERT-TO-EL?", 1, 0, false);
        declareFunction(me, "set_term_lexicon_convert_to_elP", "SET-TERM-LEXICON-CONVERT-TO-EL?", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_term_lexicon_class", "SUBLOOP-RESERVED-INITIALIZE-TERM-LEXICON-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_term_lexicon_instance", "SUBLOOP-RESERVED-INITIALIZE-TERM-LEXICON-INSTANCE", 1, 0, false);
        declareFunction(me, "term_lexicon_p", "TERM-LEXICON-P", 1, 0, false);
        declareFunction(me, "term_lexicon_initialize_method", "TERM-LEXICON-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "term_lexicon_note_dependent_lexicon_method", "TERM-LEXICON-NOTE-DEPENDENT-LEXICON-METHOD", 2, 0, false);
        declareFunction(me, "term_lexicon_remove_dependent_lexicon_method", "TERM-LEXICON-REMOVE-DEPENDENT-LEXICON-METHOD", 2, 0, false);
        declareFunction(me, "term_lexicon_set_convert_to_el_method", "TERM-LEXICON-SET-CONVERT-TO-EL-METHOD", 2, 0, false);
        declareFunction(me, "term_lexicon_get_convert_to_el_method", "TERM-LEXICON-GET-CONVERT-TO-EL-METHOD", 1, 0, false);
        declareFunction(me, "term_lexicon_remove_all_concept_filter_specs_method", "TERM-LEXICON-REMOVE-ALL-CONCEPT-FILTER-SPECS-METHOD", 1, 0, false);
        declareFunction(me, "term_lexicon_add_concept_filter_spec_method", "TERM-LEXICON-ADD-CONCEPT-FILTER-SPEC-METHOD", 2, 0, false);
        declareFunction(me, "term_lexicon_get_concept_filter_specs_method", "TERM-LEXICON-GET-CONCEPT-FILTER-SPECS-METHOD", 1, 0, false);
        declareFunction(me, "term_lexicon_create_lex_entries_method", "TERM-LEXICON-CREATE-LEX-ENTRIES-METHOD", 3, 0, false);
        declareFunction(me, "term_lexicon_resporator_to_lex_entry_method", "TERM-LEXICON-RESPORATOR-TO-LEX-ENTRY-METHOD", 2, 0, false);
        declareFunction(me, "term_lexicon_copy_method", "TERM-LEXICON-COPY-METHOD", 1, 1, false);
        declareFunction(me, "term_lexicon_isolate_method", "TERM-LEXICON-ISOLATE-METHOD", 1, 0, false);
        declareFunction(me, "term_lexicon_delete_string_with_term_method", "TERM-LEXICON-DELETE-STRING-WITH-TERM-METHOD", 3, 0, false);
        declareFunction(me, "get_numeric_date_patterns", "GET-NUMERIC-DATE-PATTERNS", 0, 0, false);
        declareFunction(me, "term_lexicon_simple_date_learn_method", "TERM-LEXICON-SIMPLE-DATE-LEARN-METHOD", 2, 0, false);
        declareFunction(me, "term_lexicon_date_learn_method", "TERM-LEXICON-DATE-LEARN-METHOD", 2, 0, false);
        declareFunction(me, "term_lexicon_stanford_ner_date_learn_method", "TERM-LEXICON-STANFORD-NER-DATE-LEARN-METHOD", 2, 0, false);
        declareFunction(me, "term_lexicon_stanford_ner_learn_method", "TERM-LEXICON-STANFORD-NER-LEARN-METHOD", 2, 2, false);
        declareFunction(me, "clear_ner_clusters", "CLEAR-NER-CLUSTERS", 0, 0, false);
        declareFunction(me, "remove_ner_clusters", "REMOVE-NER-CLUSTERS", 2, 0, false);
        declareFunction(me, "ner_clusters_internal", "NER-CLUSTERS-INTERNAL", 2, 0, false);
        declareFunction(me, "ner_clusters", "NER-CLUSTERS", 2, 0, false);
        declareFunction(me, "lexes_contain_entry_of_type", "LEXES-CONTAIN-ENTRY-OF-TYPE", 2, 0, false);
        declareFunction(me, "term_lexicon_scalar_interval_learn_method", "TERM-LEXICON-SCALAR-INTERVAL-LEARN-METHOD", 2, 0, false);
        declareFunction(me, "term_lexicon_number_learn_method", "TERM-LEXICON-NUMBER-LEARN-METHOD", 2, 0, false);
        declareFunction(me, "number_term_lex_entry", "NUMBER-TERM-LEX-ENTRY", 2, 0, false);
        declareFunction(me, "term_lexicon_simple_date_from_string_learn_method", "TERM-LEXICON-SIMPLE-DATE-FROM-STRING-LEARN-METHOD", 2, 0, false);
        declareFunction(me, "date_term_from_number_lex_entry", "DATE-TERM-FROM-NUMBER-LEX-ENTRY", 2, 0, false);
        declareFunction(me, "term_lexicon_noun_compound_learn_method", "TERM-LEXICON-NOUN-COMPOUND-LEARN-METHOD", 2, 0, false);
        declareFunction(me, "text_noun_compound_term_lex_entries", "TEXT-NOUN-COMPOUND-TERM-LEX-ENTRIES", 1, 0, false);
        declareFunction(me, "noun_compound_term_lex_entry", "NOUN-COMPOUND-TERM-LEX-ENTRY", 3, 0, false);
        declareFunction(me, "term_lexicon_nl_trie_word2lex_entries_method", "TERM-LEXICON-NL-TRIE-WORD2LEX-ENTRIES-METHOD", 3, 0, false);
        declareFunction(me, "term_lexicon_nl_trie_name2lex_entries_method", "TERM-LEXICON-NL-TRIE-NAME2LEX-ENTRIES-METHOD", 3, 0, false);
        declareFunction(me, "term_lexicon_nl_trie_tp2lex_entries_method", "TERM-LEXICON-NL-TRIE-TP2LEX-ENTRIES-METHOD", 3, 0, false);
        declareFunction(me, "denot_passes_filter_specsP", "DENOT-PASSES-FILTER-SPECS?", 2, 0, false);
        declareFunction(me, "denot_passes_filter_specP", "DENOT-PASSES-FILTER-SPEC?", 2, 0, false);
        declareFunction(me, "denots_for_term_lexicon_entries", "DENOTS-FOR-TERM-LEXICON-ENTRIES", 1, 0, false);
        declareFunction(me, "test_simple_date_learn", "TEST-SIMPLE-DATE-LEARN", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_term_lexicon_file() {
        defparameter("*TERM-LEXICON*", NIL);
        defparameter("*NUMERIC-DATE-PATTERNS*", list($str118$_0_9__1_2______0_9__1_2______0_9_, $str119$_0_9__4_4_______0_9__1_2_______0_, $str120$_0_9__1_2______0_9__2_4_, $str121$_0_9__4_));
        deflexical("*COMPILED-NUMERIC-DATE-PATTERNS*", NIL);
        deflexical("*NER-CLUSTERS-CACHING-STATE*", NIL);
        defparameter("*TERM-LEXICON-LEARNERS*", $list154);
        return NIL;
    }

    public static SubLObject setup_term_lexicon_file() {
        classes.subloop_new_class(TERM_LEXICON, ABSTRACT_LEXICON, NIL, NIL, $list4);
        classes.class_set_implements_slot_listeners(TERM_LEXICON, NIL);
        classes.subloop_note_class_initialization_function(TERM_LEXICON, SUBLOOP_RESERVED_INITIALIZE_TERM_LEXICON_CLASS);
        classes.subloop_note_instance_initialization_function(TERM_LEXICON, SUBLOOP_RESERVED_INITIALIZE_TERM_LEXICON_INSTANCE);
        subloop_reserved_initialize_term_lexicon_class(TERM_LEXICON);
        methods.methods_incorporate_instance_method(INITIALIZE, TERM_LEXICON, $list38, NIL, $list39);
        methods.subloop_register_instance_method(TERM_LEXICON, INITIALIZE, TERM_LEXICON_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(NOTE_DEPENDENT_LEXICON, TERM_LEXICON, $list38, $list43, $list44);
        methods.subloop_register_instance_method(TERM_LEXICON, NOTE_DEPENDENT_LEXICON, TERM_LEXICON_NOTE_DEPENDENT_LEXICON_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_DEPENDENT_LEXICON, TERM_LEXICON, $list38, $list43, $list48);
        methods.subloop_register_instance_method(TERM_LEXICON, REMOVE_DEPENDENT_LEXICON, TERM_LEXICON_REMOVE_DEPENDENT_LEXICON_METHOD);
        methods.methods_incorporate_instance_method(SET_CONVERT_TO_EL, TERM_LEXICON, $list52, $list53, $list54);
        methods.subloop_register_instance_method(TERM_LEXICON, SET_CONVERT_TO_EL, TERM_LEXICON_SET_CONVERT_TO_EL_METHOD);
        methods.methods_incorporate_instance_method(GET_CONVERT_TO_EL, TERM_LEXICON, $list52, NIL, $list58);
        methods.subloop_register_instance_method(TERM_LEXICON, GET_CONVERT_TO_EL, TERM_LEXICON_GET_CONVERT_TO_EL_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_ALL_CONCEPT_FILTER_SPECS, TERM_LEXICON, $list52, NIL, $list62);
        methods.subloop_register_instance_method(TERM_LEXICON, REMOVE_ALL_CONCEPT_FILTER_SPECS, TERM_LEXICON_REMOVE_ALL_CONCEPT_FILTER_SPECS_METHOD);
        methods.methods_incorporate_instance_method(ADD_CONCEPT_FILTER_SPEC, TERM_LEXICON, $list52, $list66, $list67);
        methods.subloop_register_instance_method(TERM_LEXICON, ADD_CONCEPT_FILTER_SPEC, TERM_LEXICON_ADD_CONCEPT_FILTER_SPEC_METHOD);
        methods.methods_incorporate_instance_method(GET_CONCEPT_FILTER_SPECS, TERM_LEXICON, $list52, NIL, $list72);
        methods.subloop_register_instance_method(TERM_LEXICON, GET_CONCEPT_FILTER_SPECS, TERM_LEXICON_GET_CONCEPT_FILTER_SPECS_METHOD);
        methods.methods_incorporate_instance_method(CREATE_LEX_ENTRIES, TERM_LEXICON, $list38, $list76, $list77);
        methods.subloop_register_instance_method(TERM_LEXICON, CREATE_LEX_ENTRIES, TERM_LEXICON_CREATE_LEX_ENTRIES_METHOD);
        methods.methods_incorporate_class_method(RESPORATOR_TO_LEX_ENTRY, TERM_LEXICON, $list38, $list85, $list86);
        methods.subloop_register_class_method(TERM_LEXICON, RESPORATOR_TO_LEX_ENTRY, TERM_LEXICON_RESPORATOR_TO_LEX_ENTRY_METHOD);
        methods.methods_incorporate_instance_method(COPY, TERM_LEXICON, $list52, $list99, $list100);
        methods.subloop_register_instance_method(TERM_LEXICON, COPY, TERM_LEXICON_COPY_METHOD);
        methods.methods_incorporate_instance_method(ISOLATE, TERM_LEXICON, $list38, NIL, $list106);
        methods.subloop_register_instance_method(TERM_LEXICON, ISOLATE, TERM_LEXICON_ISOLATE_METHOD);
        methods.methods_incorporate_instance_method(DELETE_STRING_WITH_TERM, TERM_LEXICON, $list52, $list110, $list111);
        methods.subloop_register_instance_method(TERM_LEXICON, DELETE_STRING_WITH_TERM, TERM_LEXICON_DELETE_STRING_WITH_TERM_METHOD);
        methods.methods_incorporate_instance_method(SIMPLE_DATE_LEARN, TERM_LEXICON, $list38, $list123, $list124);
        methods.subloop_register_instance_method(TERM_LEXICON, SIMPLE_DATE_LEARN, TERM_LEXICON_SIMPLE_DATE_LEARN_METHOD);
        methods.methods_incorporate_instance_method(DATE_LEARN, TERM_LEXICON, $list38, $list123, $list131);
        methods.subloop_register_instance_method(TERM_LEXICON, DATE_LEARN, TERM_LEXICON_DATE_LEARN_METHOD);
        methods.methods_incorporate_instance_method(STANFORD_NER_DATE_LEARN, TERM_LEXICON, $list38, $list123, $list134);
        methods.subloop_register_instance_method(TERM_LEXICON, STANFORD_NER_DATE_LEARN, TERM_LEXICON_STANFORD_NER_DATE_LEARN_METHOD);
        methods.methods_incorporate_instance_method(STANFORD_NER_LEARN, TERM_LEXICON, $list38, $list138, $list139);
        methods.subloop_register_instance_method(TERM_LEXICON, STANFORD_NER_LEARN, TERM_LEXICON_STANFORD_NER_LEARN_METHOD);
        memoization_state.note_globally_cached_function(NER_CLUSTERS);
        methods.methods_incorporate_instance_method(SCALAR_INTERVAL_LEARN, TERM_LEXICON, $list38, $list123, $list156);
        methods.subloop_register_instance_method(TERM_LEXICON, SCALAR_INTERVAL_LEARN, TERM_LEXICON_SCALAR_INTERVAL_LEARN_METHOD);
        methods.methods_incorporate_instance_method(NUMBER_LEARN, TERM_LEXICON, $list38, $list123, $list161);
        methods.subloop_register_instance_method(TERM_LEXICON, NUMBER_LEARN, TERM_LEXICON_NUMBER_LEARN_METHOD);
        methods.methods_incorporate_instance_method(SIMPLE_DATE_FROM_STRING_LEARN, TERM_LEXICON, $list38, $list123, $list168);
        methods.subloop_register_instance_method(TERM_LEXICON, SIMPLE_DATE_FROM_STRING_LEARN, TERM_LEXICON_SIMPLE_DATE_FROM_STRING_LEARN_METHOD);
        methods.methods_incorporate_instance_method(NOUN_COMPOUND_LEARN, TERM_LEXICON, $list38, $list123, $list173);
        methods.subloop_register_instance_method(TERM_LEXICON, NOUN_COMPOUND_LEARN, TERM_LEXICON_NOUN_COMPOUND_LEARN_METHOD);
        methods.methods_incorporate_instance_method(NL_TRIE_WORD2LEX_ENTRIES, TERM_LEXICON, $list38, $list183, $list184);
        methods.subloop_register_instance_method(TERM_LEXICON, NL_TRIE_WORD2LEX_ENTRIES, TERM_LEXICON_NL_TRIE_WORD2LEX_ENTRIES_METHOD);
        methods.methods_incorporate_instance_method(NL_TRIE_NAME2LEX_ENTRIES, TERM_LEXICON, $list38, $list190, $list191);
        methods.subloop_register_instance_method(TERM_LEXICON, NL_TRIE_NAME2LEX_ENTRIES, TERM_LEXICON_NL_TRIE_NAME2LEX_ENTRIES_METHOD);
        methods.methods_incorporate_instance_method(NL_TRIE_TP2LEX_ENTRIES, TERM_LEXICON, $list38, $list195, $list196);
        methods.subloop_register_instance_method(TERM_LEXICON, NL_TRIE_TP2LEX_ENTRIES, TERM_LEXICON_NL_TRIE_TP2LEX_ENTRIES_METHOD);
        register_external_symbol(DENOTS_FOR_TERM_LEXICON_ENTRIES);
        define_test_case_table_int(TEST_SIMPLE_DATE_LEARN, list(new SubLObject[]{ $TEST, $sym204$HAS_MEMBER_EQUAL_, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list210);
        return NIL;
    }

    private static SubLObject _constant_139_initializer() {
        return list(makeString("@param TEXT stringp; the text from which to learn lexical entries\n   @param FABRICATE-MEANINGS boolean; if true, some meaning will be returned even if the found date is not understood\n   @return listp; a list of term-lexicon lexical entries learned from TEXT"), list(makeSymbol("CHECK-TYPE"), makeSymbol("TEXT"), makeSymbol("STRINGP")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-LEXES"), NIL), makeSymbol("ERROR")), list(makeSymbol("PWHEN"), list(EQ, makeSymbol("ALLOWED-TYPES"), makeKeyword("ANY")), list(makeSymbol("CSETQ"), makeSymbol("ALLOWED-TYPES"), list(makeSymbol("GET-SLOT"), list(makeSymbol("QUOTE"), makeSymbol("STANFORD-NER")), list(makeSymbol("QUOTE"), makeSymbol("KNOWN-CYC-TYPES"))))), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("ERROR")), list(makeSymbol("CLET"), list(list(makeSymbol("SNER"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("STANFORD-NER")))), list(makeSymbol("ENTITY-CLUSTERS"), list(makeSymbol("NER-CLUSTERS"), makeSymbol("SNER"), makeSymbol("TEXT"))), list(makeSymbol("MERGED-CLUSTERS"), list(makeSymbol("FIM"), makeSymbol("SNER"), list(makeSymbol("QUOTE"), makeSymbol("MERGE-CLUSTERS")), makeSymbol("ENTITY-CLUSTERS"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("EC"), makeSymbol("MERGED-CLUSTERS")), list(makeSymbol("CDOLIST"), list(makeSymbol("NAMENT"), makeSymbol("EC")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET")), list(makeSymbol("FIM"), makeSymbol("NAMENT"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))))), list(makeSymbol("MEMBER?"), list(makeSymbol("FIM"), makeSymbol("NAMENT"), list(makeSymbol("QUOTE"), makeSymbol("GET-CYC"))), makeSymbol("ALLOWED-TYPES"))), list(makeSymbol("CLET"), list(list(makeSymbol("TYPE"), list(makeSymbol("FIM"), makeSymbol("NAMENT"), list(makeSymbol("QUOTE"), makeSymbol("GET-CYC")))), list(makeSymbol("SUBTYPES"), NIL), list(makeSymbol("INSTANCE-MEANINGS"), list(makeSymbol("GET-NAMENT-INSTANCE-MEANING"), makeSymbol("NAMENT"))), list(makeSymbol("STRING"), list(makeSymbol("FIM"), makeSymbol("NAMENT"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING")))), list(makeSymbol("CURRENT-ENTRIES"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeSymbol("STRING")))), list(makeSymbol("CDOLIST"), list(makeSymbol("INSTANCE"), makeSymbol("INSTANCE-MEANINGS")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("CYC-POS"), reader_make_constant_shell(makeString("ProperNoun"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("DENOT"), makeSymbol("INSTANCE")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell(makeString("RegularNounFrame"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("singular"))))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ADD")), makeSymbol("LEX-ENTRY")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("NEW-LEXES")) })), list(makeSymbol("PWHEN"), makeSymbol("FABRICATE-MEANING?"), list(makeSymbol("CDOLIST"), list(makeSymbol("SUBTYPE"), makeSymbol("SUBTYPES")), list(makeSymbol("PUNLESS"), list(makeSymbol("LEXES-CONTAIN-ENTRY-OF-TYPE"), makeSymbol("CURRENT-ENTRIES"), makeSymbol("SUBTYPE")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("CYC-POS"), reader_make_constant_shell(makeString("ProperNoun"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("DENOT"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("InstanceNamedFn-Ternary")), makeSymbol("STRING"), makeSymbol("SUBTYPE"), list(makeSymbol("GUID-TO-STRING"), list(makeSymbol("NEW-GUID"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell(makeString("RegularNounFrame"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("singular"))))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ADD")), makeSymbol("LEX-ENTRY")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("NEW-LEXES")) }))), list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), makeSymbol("NEW-LEXES"), list(makeSymbol("NULL"), makeSymbol("TYPE")), list(makeSymbol("LEXES-CONTAIN-ENTRY-OF-TYPE"), makeSymbol("CURRENT-ENTRIES"), makeSymbol("TYPE"))), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRY"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("LEX-ENTRY"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("STRING"), makeSymbol("STRING")), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("CYC-POS"), reader_make_constant_shell(makeString("ProperNoun"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("DENOT"), list(makeSymbol("BQ-LIST"), reader_make_constant_shell(makeString("InstanceNamedFn-Ternary")), makeSymbol("STRING"), makeSymbol("TYPE"), list(makeSymbol("GUID-TO-STRING"), list(makeSymbol("NEW-GUID"))))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("FRAME"), reader_make_constant_shell(makeString("RegularNounFrame"))), list(makeSymbol("FIM"), makeSymbol("LEX-ENTRY"), list(makeSymbol("QUOTE"), makeSymbol("SET")), makeKeyword("INFLECTIONS"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("singular"))))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("ADD")), makeSymbol("LEX-ENTRY")), list(makeSymbol("CPUSH"), makeSymbol("LEX-ENTRY"), makeSymbol("NEW-LEXES")) }))))))))), list(makeSymbol("PWHEN"), makeSymbol("ERROR"), list(makeSymbol("WARN"), makeString("~%~S"), makeSymbol("ERROR"))), list(makeSymbol("RET"), makeSymbol("NEW-LEXES"))));
    }

    @Override
    public void declareFunctions() {
        declare_term_lexicon_file();
    }

    @Override
    public void initializeVariables() {
        init_term_lexicon_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_term_lexicon_file();
    }

    
}

/**
 * Total time: 747 ms synthetic
 */
