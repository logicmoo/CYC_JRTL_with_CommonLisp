package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.nl_parsing_api;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.nl_parsing_api.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWENTY_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class nl_parsing_api extends SubLTranslatedFile {
    public static final SubLFile me = new nl_parsing_api();

    public static final String myName = "com.cyc.cycjava.cycl.nl_parsing_api";

    public static final String myFingerPrint = "ab447f5b890824145bb0a89307071b6e77df70c830d018bd38a2241a8a2ed456";

    // defconstant
    public static final SubLSymbol $dtp_tag_relations_iterator_state$ = makeSymbol("*DTP-TAG-RELATIONS-ITERATOR-STATE*");

    // defparameter
    private static final SubLSymbol $sentence_cyclifiers$ = makeSymbol("*SENTENCE-CYCLIFIERS*");

    // defconstant
    public static final SubLSymbol $dtp_sentence_cyclifier$ = makeSymbol("*DTP-SENTENCE-CYCLIFIER*");

    // Internal Constants
    public static final SubLSymbol TAG_RELATIONS = makeSymbol("TAG-RELATIONS");











    public static final SubLSymbol LINK_CYCLIFIER = makeSymbol("LINK-CYCLIFIER");



    public static final SubLSymbol TAG_RELATIONS_ITERATOR_STATE_DONE_P = makeSymbol("TAG-RELATIONS-ITERATOR-STATE-DONE-P");

    public static final SubLSymbol TAG_RELATIONS_ITERATOR_STATE_NEXT = makeSymbol("TAG-RELATIONS-ITERATOR-STATE-NEXT");

    public static final SubLSymbol TAG_RELATIONS_OPTIONAL_ARGS_P = makeSymbol("TAG-RELATIONS-OPTIONAL-ARGS-P");

    public static final SubLList $list11 = list(makeKeyword("LEXICON"), makeKeyword("SENTENCE-CYCLIFIER"), makeKeyword("DOMAIN-MT"), makeKeyword("OUTPUT-SPEC"), makeKeyword("FILTER"), makeKeyword("SENSE-TAGGER"), makeKeyword("TIMEOUT"));

    public static final SubLSymbol TAG_RELATIONS_ITERATOR_STATE = makeSymbol("TAG-RELATIONS-ITERATOR-STATE");

    public static final SubLSymbol TAG_RELATIONS_ITERATOR_STATE_P = makeSymbol("TAG-RELATIONS-ITERATOR-STATE-P");

    public static final SubLList $list14 = list(new SubLObject[]{ makeSymbol("SENTENCE-ITERATOR"), makeSymbol("SENTENCE-CYCLIFIER"), makeSymbol("DOCUMENT"), makeSymbol("LEXICON"), makeSymbol("SENSE-TAGGER"), makeSymbol("TIMEOUT"), makeSymbol("DOMAIN-MT"), makeSymbol("OUTPUT-SPEC"), makeSymbol("FILTER"), makeSymbol("PREPARED-SENTENCE-OUTPUT") });

    public static final SubLList $list15 = list(new SubLObject[]{ makeKeyword("SENTENCE-ITERATOR"), makeKeyword("SENTENCE-CYCLIFIER"), makeKeyword("DOCUMENT"), makeKeyword("LEXICON"), makeKeyword("SENSE-TAGGER"), makeKeyword("TIMEOUT"), makeKeyword("DOMAIN-MT"), makeKeyword("OUTPUT-SPEC"), makeKeyword("FILTER"), makeKeyword("PREPARED-SENTENCE-OUTPUT") });

    public static final SubLList $list16 = list(new SubLObject[]{ makeSymbol("TAG-RELATIONS-ITERATOR-STATE-SENTENCE-ITERATOR"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-SENTENCE-CYCLIFIER"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-DOCUMENT"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-LEXICON"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-SENSE-TAGGER"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-TIMEOUT"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-DOMAIN-MT"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-OUTPUT-SPEC"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-FILTER"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT") });

    public static final SubLList $list17 = list(new SubLObject[]{ makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENTENCE-ITERATOR"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENTENCE-CYCLIFIER"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-DOCUMENT"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-LEXICON"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENSE-TAGGER"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-TIMEOUT"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-DOMAIN-MT"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-OUTPUT-SPEC"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-FILTER"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT") });



    public static final SubLSymbol TAG_RELATIONS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TAG-RELATIONS-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list20 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-P"));

    private static final SubLSymbol TAG_RELATIONS_ITERATOR_STATE_SENTENCE_ITERATOR = makeSymbol("TAG-RELATIONS-ITERATOR-STATE-SENTENCE-ITERATOR");

    private static final SubLSymbol _CSETF_TAG_RELATIONS_ITERATOR_STATE_SENTENCE_ITERATOR = makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENTENCE-ITERATOR");

    private static final SubLSymbol TAG_RELATIONS_ITERATOR_STATE_SENTENCE_CYCLIFIER = makeSymbol("TAG-RELATIONS-ITERATOR-STATE-SENTENCE-CYCLIFIER");

    private static final SubLSymbol _CSETF_TAG_RELATIONS_ITERATOR_STATE_SENTENCE_CYCLIFIER = makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENTENCE-CYCLIFIER");

    private static final SubLSymbol TAG_RELATIONS_ITERATOR_STATE_DOCUMENT = makeSymbol("TAG-RELATIONS-ITERATOR-STATE-DOCUMENT");

    private static final SubLSymbol _CSETF_TAG_RELATIONS_ITERATOR_STATE_DOCUMENT = makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-DOCUMENT");

    private static final SubLSymbol TAG_RELATIONS_ITERATOR_STATE_LEXICON = makeSymbol("TAG-RELATIONS-ITERATOR-STATE-LEXICON");

    private static final SubLSymbol _CSETF_TAG_RELATIONS_ITERATOR_STATE_LEXICON = makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-LEXICON");

    private static final SubLSymbol TAG_RELATIONS_ITERATOR_STATE_SENSE_TAGGER = makeSymbol("TAG-RELATIONS-ITERATOR-STATE-SENSE-TAGGER");

    private static final SubLSymbol _CSETF_TAG_RELATIONS_ITERATOR_STATE_SENSE_TAGGER = makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENSE-TAGGER");

    private static final SubLSymbol TAG_RELATIONS_ITERATOR_STATE_TIMEOUT = makeSymbol("TAG-RELATIONS-ITERATOR-STATE-TIMEOUT");

    private static final SubLSymbol _CSETF_TAG_RELATIONS_ITERATOR_STATE_TIMEOUT = makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-TIMEOUT");

    private static final SubLSymbol TAG_RELATIONS_ITERATOR_STATE_DOMAIN_MT = makeSymbol("TAG-RELATIONS-ITERATOR-STATE-DOMAIN-MT");

    private static final SubLSymbol _CSETF_TAG_RELATIONS_ITERATOR_STATE_DOMAIN_MT = makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-DOMAIN-MT");

    private static final SubLSymbol TAG_RELATIONS_ITERATOR_STATE_OUTPUT_SPEC = makeSymbol("TAG-RELATIONS-ITERATOR-STATE-OUTPUT-SPEC");

    private static final SubLSymbol _CSETF_TAG_RELATIONS_ITERATOR_STATE_OUTPUT_SPEC = makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-OUTPUT-SPEC");

    private static final SubLSymbol TAG_RELATIONS_ITERATOR_STATE_FILTER = makeSymbol("TAG-RELATIONS-ITERATOR-STATE-FILTER");

    private static final SubLSymbol _CSETF_TAG_RELATIONS_ITERATOR_STATE_FILTER = makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-FILTER");

    private static final SubLSymbol TAG_RELATIONS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT = makeSymbol("TAG-RELATIONS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT");

    private static final SubLSymbol _CSETF_TAG_RELATIONS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT = makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT");









    private static final SubLSymbol $PREPARED_SENTENCE_OUTPUT = makeKeyword("PREPARED-SENTENCE-OUTPUT");

    private static final SubLString $str46$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_TAG_RELATIONS_ITERATOR_STATE = makeSymbol("MAKE-TAG-RELATIONS-ITERATOR-STATE");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TAG_RELATIONS_ITERATOR_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TAG-RELATIONS-ITERATOR-STATE-METHOD");



    private static final SubLSymbol SENTENCE_CYCLIFIER = makeSymbol("SENTENCE-CYCLIFIER");

    private static final SubLSymbol SENTENCE_CYCLIFIER_P = makeSymbol("SENTENCE-CYCLIFIER-P");

    private static final SubLList $list55 = list(makeSymbol("NAME"), makeSymbol("CYCLIFY-METHOD"), makeSymbol("LEXICON-METHOD"));

    private static final SubLList $list56 = list(makeKeyword("NAME"), makeKeyword("CYCLIFY-METHOD"), makeKeyword("LEXICON-METHOD"));

    private static final SubLList $list57 = list(makeSymbol("SENTENCE-CYCLIFIER-NAME"), makeSymbol("SENTENCE-CYCLIFIER-CYCLIFY-METHOD"), makeSymbol("SENTENCE-CYCLIFIER-LEXICON-METHOD"));

    private static final SubLList $list58 = list(makeSymbol("_CSETF-SENTENCE-CYCLIFIER-NAME"), makeSymbol("_CSETF-SENTENCE-CYCLIFIER-CYCLIFY-METHOD"), makeSymbol("_CSETF-SENTENCE-CYCLIFIER-LEXICON-METHOD"));

    private static final SubLSymbol PRINT_SENTENCE_CYCLIFIER = makeSymbol("PRINT-SENTENCE-CYCLIFIER");

    private static final SubLSymbol SENTENCE_CYCLIFIER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SENTENCE-CYCLIFIER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list61 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SENTENCE-CYCLIFIER-P"));

    private static final SubLSymbol SENTENCE_CYCLIFIER_NAME = makeSymbol("SENTENCE-CYCLIFIER-NAME");

    private static final SubLSymbol _CSETF_SENTENCE_CYCLIFIER_NAME = makeSymbol("_CSETF-SENTENCE-CYCLIFIER-NAME");

    private static final SubLSymbol SENTENCE_CYCLIFIER_CYCLIFY_METHOD = makeSymbol("SENTENCE-CYCLIFIER-CYCLIFY-METHOD");

    private static final SubLSymbol _CSETF_SENTENCE_CYCLIFIER_CYCLIFY_METHOD = makeSymbol("_CSETF-SENTENCE-CYCLIFIER-CYCLIFY-METHOD");

    private static final SubLSymbol SENTENCE_CYCLIFIER_LEXICON_METHOD = makeSymbol("SENTENCE-CYCLIFIER-LEXICON-METHOD");

    private static final SubLSymbol _CSETF_SENTENCE_CYCLIFIER_LEXICON_METHOD = makeSymbol("_CSETF-SENTENCE-CYCLIFIER-LEXICON-METHOD");







    private static final SubLSymbol MAKE_SENTENCE_CYCLIFIER = makeSymbol("MAKE-SENTENCE-CYCLIFIER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SENTENCE_CYCLIFIER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SENTENCE-CYCLIFIER-METHOD");

    private static final SubLString $str73$__Cyclifier___A_ = makeString("#<Cyclifier: ~A>");

    private static final SubLString $str74$_S_is_not_a_registered_cyclifier_ = makeString("~S is not a registered cyclifier.");

    private static final SubLString $str75$_ = makeString("$");







    private static final SubLSymbol EBMT_CYCLIFIER = makeSymbol("EBMT-CYCLIFIER");

    private static final SubLSymbol NEW_SEMTRANS_LEXICON = makeSymbol("NEW-SEMTRANS-LEXICON");



    private static final SubLSymbol STANFORD_CYCLIFIER = makeSymbol("STANFORD-CYCLIFIER");

    private static final SubLSymbol NEW_CYCLIFIER_LEXICON = makeSymbol("NEW-CYCLIFIER-LEXICON");

    private static final SubLSymbol $sym84$API_CYCLIFIER_DONE_ = makeSymbol("API-CYCLIFIER-DONE?");

    private static final SubLSymbol API_CYCLIFIER_GET_NEXT = makeSymbol("API-CYCLIFIER-GET-NEXT");



    private static final SubLSymbol $sym87$HAS_NEXT_ = makeSymbol("HAS-NEXT?");





    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLString $$$table = makeString("table");

    private static final SubLList $list92 = list(makeKeyword("SENTENCE-CYCLIFIER"), makeSymbol("EBMT-CYCLIFIER"));

    private static final SubLString $str93$CycL___S__ = makeString("CycL: ~S~%");

    private static final SubLSymbol STRING_PHRASAL_MEANINGS = makeSymbol("STRING-PHRASAL-MEANINGS");



    private static final SubLSymbol PHRASAL_MEANINGS_OPTIONAL_ARGS_P = makeSymbol("PHRASAL-MEANINGS-OPTIONAL-ARGS-P");

    private static final SubLSymbol STRING_PHRASAL_MEANINGS_ITERATOR = makeSymbol("STRING-PHRASAL-MEANINGS-ITERATOR");



    private static final SubLSymbol PHRASAL_MEANINGS = makeSymbol("PHRASAL-MEANINGS");

    private static final SubLSymbol PHRASE_P = makeSymbol("PHRASE-P");

    private static final SubLSymbol PHRASAL_MEANINGS_ITERATOR = makeSymbol("PHRASAL-MEANINGS-ITERATOR");





    private static final SubLList $list104 = list(makeSymbol("SIMPLE-DATE-FROM-STRING-LEARN"), makeSymbol("NUMBER-LEARN"));





    private static final SubLSymbol LEXICAL_PHRASE_CYCLIFIER = makeSymbol("LEXICAL-PHRASE-CYCLIFIER");

    private static final SubLList $list108 = list(makeKeyword("TIMEOUT"), NIL);



    private static final SubLSymbol NL_INTERP_TO_XML = makeSymbol("NL-INTERP-TO-XML");





    private static final SubLSymbol $sym113$SPEECH_PART_ = makeSymbol("SPEECH-PART?");







    private static final SubLSymbol GET_NL_INTERP_CYCL = makeSymbol("GET-NL-INTERP-CYCL");

    private static final SubLSymbol STRING_PHRASAL_MEANINGS_TEST = makeSymbol("STRING-PHRASAL-MEANINGS-TEST");



    private static final SubLSymbol $sym120$SETS_EQUAL_EQUAL_ = makeSymbol("SETS-EQUAL-EQUAL?");





    private static final SubLList $list123 = list(makeSymbol("NL-TEST-CASES"), makeSymbol("NL-PARSING-TEST-CASES"));







    private static final SubLList $list127 = list(list(list(makeString("dog")), list(reader_make_constant_shell(makeString("Dog")), reader_make_constant_shell(makeString("HotDog")))), list(list(makeString("January 20, 2000")), list(list(reader_make_constant_shell(makeString("DayFn")), TWENTY_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000)))))));

    private static final SubLSymbol STRING_PHRASAL_MEANINGS_WITH_ADHOC_GENLS_FILTER_TYPE = makeSymbol("STRING-PHRASAL-MEANINGS-WITH-ADHOC-GENLS-FILTER-TYPE");

    private static final SubLList $list129 = list(list(list(makeString("dog"), reader_make_constant_shell(makeString("Person"))), NIL), list(list(makeString("dog"), reader_make_constant_shell(makeString("Animal"))), list(reader_make_constant_shell(makeString("Dog")))), list(list(makeString("dog"), reader_make_constant_shell(makeString("Person"))), NIL));

    private static final SubLSymbol STRING_PHRASAL_MEANINGS_WITH_ADHOC_ISA_FILTER_TYPE = makeSymbol("STRING-PHRASAL-MEANINGS-WITH-ADHOC-ISA-FILTER-TYPE");

    private static final SubLList $list131 = list(list(list(makeString("January 20, 2000"), reader_make_constant_shell(makeString("Date"))), list(list(reader_make_constant_shell(makeString("DayFn")), TWENTY_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000)))))), list(list(makeString("January 20, 2000"), reader_make_constant_shell(makeString("TimeInterval"))), list(list(reader_make_constant_shell(makeString("DayFn")), TWENTY_INTEGER, list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000)))))), list(list(makeString("January 21, 2000"), reader_make_constant_shell(makeString("Date"))), list(list(reader_make_constant_shell(makeString("DayFn")), makeInteger(21), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000)))))), list(list(makeString("January 21, 2000"), reader_make_constant_shell(makeString("Thing"))), list(list(reader_make_constant_shell(makeString("DayFn")), makeInteger(21), list(reader_make_constant_shell(makeString("MonthFn")), reader_make_constant_shell(makeString("January")), list(reader_make_constant_shell(makeString("YearFn")), makeInteger(2000)))))));

    private static final SubLSymbol STRING_PHRASAL_MEANINGS_WITH_ARGS = makeSymbol("STRING-PHRASAL-MEANINGS-WITH-ARGS");

    private static final SubLList $list133 = list(list(list(makeString("bank"), list(makeSymbol("LIST"), makeKeyword("OUTPUT-SPEC"), list(makeSymbol("NEW-NL-OUTPUT-SPEC"), makeKeyword("SUBL"), list(makeSymbol("NEW-NL-INTERPRETATION-SPEC"), list(makeSymbol("QUOTE"), list(makeKeyword("CYCL"), T, makeKeyword("INFLECTIONS"), T, makeKeyword("PHRASE-TYPES"), T)))), makeKeyword("SYNTACTIC-RESTRICTION"), list(makeSymbol("LIST"), reader_make_constant_shell(makeString("Noun"))))), list(list(makeKeyword("CYCL"), reader_make_constant_shell(makeString("BankOrganization")), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell(makeString("CountNoun"))), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell(makeString("singular")))), list(makeKeyword("CYCL"), reader_make_constant_shell(makeString("BankingTurn")), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell(makeString("CountNoun"))), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell(makeString("singular")))), list(makeKeyword("CYCL"), reader_make_constant_shell(makeString("Bank-Topographical")), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell(makeString("CountNoun"))), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell(makeString("singular")))))), list(list(makeString("bank"), list(makeSymbol("LIST"), makeKeyword("OUTPUT-SPEC"), list(makeSymbol("NEW-NL-OUTPUT-SPEC"), makeKeyword("SUBL"), list(makeSymbol("NEW-NL-INTERPRETATION-SPEC"), list(makeSymbol("QUOTE"), list(makeKeyword("CYCL"), T, makeKeyword("INFLECTIONS"), T, makeKeyword("PHRASE-TYPES"), T)))))), list(list(makeKeyword("CYCL"), reader_make_constant_shell(makeString("MakingABankDeposit")), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell(makeString("Verb"))), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell(makeString("infinitive")), reader_make_constant_shell(makeString("pluralVerb-Present")), reader_make_constant_shell(makeString("firstPersonSg-Present")), reader_make_constant_shell(makeString("secondPersonSg-Present")))), list(makeKeyword("CYCL"), reader_make_constant_shell(makeString("BankingTurn")), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell(makeString("Verb"))), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell(makeString("infinitive")), reader_make_constant_shell(makeString("pluralVerb-Present")), reader_make_constant_shell(makeString("firstPersonSg-Present")), reader_make_constant_shell(makeString("secondPersonSg-Present")))), list(makeKeyword("CYCL"), reader_make_constant_shell(makeString("BankOrganization")), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell(makeString("CountNoun"))), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell(makeString("singular")))), list(makeKeyword("CYCL"), reader_make_constant_shell(makeString("BankingTurn")), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell(makeString("CountNoun"))), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell(makeString("singular")))), list(makeKeyword("CYCL"), reader_make_constant_shell(makeString("Bank-Topographical")), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell(makeString("CountNoun"))), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell(makeString("singular")))))));

    private static final SubLSymbol STRING_PHRASAL_MEANINGS_WITH_ARGS_NON_WORKING_CASES = makeSymbol("STRING-PHRASAL-MEANINGS-WITH-ARGS-NON-WORKING-CASES");

    private static final SubLList $list135 = list(list(list(makeString("bank"), list(makeSymbol("LIST"), makeKeyword("OUTPUT-SPEC"), list(makeSymbol("NEW-NL-OUTPUT-SPEC"), makeKeyword("SUBL"), list(makeSymbol("NEW-NL-INTERPRETATION-SPEC"), list(makeSymbol("QUOTE"), list(makeKeyword("CYCL"), T, makeKeyword("INFLECTIONS"), T, makeKeyword("PHRASE-TYPES"), T)))), makeKeyword("FILTER"), list(makeSymbol("NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC"), reader_make_constant_shell(makeString("Organization"))))), list(list(makeKeyword("CYCL"), reader_make_constant_shell(makeString("BankOrganization")), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell(makeString("CountNoun"))), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell(makeString("singular")))))), list(list(makeString("bank"), list(makeSymbol("LIST"), makeKeyword("OUTPUT-SPEC"), list(makeSymbol("NEW-NL-OUTPUT-SPEC"), makeKeyword("XML"), list(makeSymbol("NEW-NL-INTERPRETATION-SPEC"), list(makeSymbol("QUOTE"), list(makeKeyword("CYCL"), T, makeKeyword("INFLECTIONS"), T, makeKeyword("PHRASE-TYPES"), T)))), makeKeyword("FILTER"), list(makeSymbol("NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC"), reader_make_constant_shell(makeString("Organization"))))), list(makeString("\n<NLInterpretation>\n <Cycl>\n  <CycLConstant>\n    <name>BankOrganization</name>\n    <namespace>cyc</namespace>\n    <guid>bd58ab80-9c29-11b1-9dad-c379636f7270</guid>\n    <uri>urn:uuid:bd58ab80-9c29-11b1-9dad-c379636f7270</uri>\n  </CycLConstant>\n </Cycl>\n <PhraseType>\n  <CycLConstant>\n    <name>CountNoun</name>\n    <namespace>cyc</namespace>\n    <guid>bd588078-9c29-11b1-9dad-c379636f7270</guid>\n    <uri>urn:uuid:bd588078-9c29-11b1-9dad-c379636f7270</uri>\n  </CycLConstant>\n </PhraseType>\n <HeadInflections>\n  <CycLConstant>\n    <name>singular</name>\n    <namespace>cyc</namespace>\n    <guid>bd6757b8-9c29-11b1-9dad-c379636f7270</guid>\n    <uri>urn:uuid:bd6757b8-9c29-11b1-9dad-c379636f7270</uri>\n  </CycLConstant>\n </HeadInflections>\n</NLInterpretation>"))), list(list(makeString("bank"), list(makeSymbol("LIST"), makeKeyword("OUTPUT-SPEC"), list(makeSymbol("NEW-NL-OUTPUT-SPEC"), makeKeyword("XML"), list(makeSymbol("NEW-NL-INTERPRETATION-SPEC"), list(makeSymbol("QUOTE"), list(makeKeyword("CYCL"), T)))), makeKeyword("FILTER"), list(makeSymbol("NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC"), reader_make_constant_shell(makeString("Organization"))))), list(makeString("\n<NLInterpretation>\n <Cycl>\n  <CycLConstant>\n    <name>BankOrganization</name>\n    <namespace>cyc</namespace>\n    <guid>bd58ab80-9c29-11b1-9dad-c379636f7270</guid>\n    <uri>urn:uuid:bd58ab80-9c29-11b1-9dad-c379636f7270</uri>\n  </CycLConstant>\n </Cycl>\n</NLInterpretation>"))));

    public static SubLObject tag_relations(final SubLObject v_document, SubLObject optional_arg_plist) {
        if (optional_arg_plist == UNPROVIDED) {
            optional_arg_plist = NIL;
        }
        optional_arg_plist = list_utilities.augment_plist_with_defaults(optional_arg_plist, list(new SubLObject[]{ $OUTPUT_SPEC, nl_api_datastructures.new_nl_output_spec($SIMPLE, nl_api_datastructures.new_nl_interpretation_spec(UNPROVIDED)), $FILTER, NIL, $SENSE_TAGGER, NIL, $SENTENCE_CYCLIFIER, LINK_CYCLIFIER, $DOMAIN_MT, default_relation_tagging_domain_mt() }));
        final SubLObject result_iter = iteration.new_iterator(new_tag_relations_iterator_state(v_document, optional_arg_plist), TAG_RELATIONS_ITERATOR_STATE_DONE_P, TAG_RELATIONS_ITERATOR_STATE_NEXT, UNPROVIDED);
        return result_iter;
    }

    public static SubLObject tag_relations_optional_args_p(final SubLObject obj) {
        return list_utilities.plist_restricted_to_indicatorsP(obj, $list11);
    }

    public static SubLObject tag_relations_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject tag_relations_iterator_state_p(final SubLObject v_object) {
        return v_object.getClass() == nl_parsing_api.$tag_relations_iterator_state_native.class ? T : NIL;
    }

    public static SubLObject tag_relations_iterator_state_sentence_iterator(final SubLObject v_object) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.tag_relations_iterator_state_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject tag_relations_iterator_state_sentence_cyclifier(final SubLObject v_object) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.tag_relations_iterator_state_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject tag_relations_iterator_state_document(final SubLObject v_object) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.tag_relations_iterator_state_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject tag_relations_iterator_state_lexicon(final SubLObject v_object) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.tag_relations_iterator_state_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject tag_relations_iterator_state_sense_tagger(final SubLObject v_object) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.tag_relations_iterator_state_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject tag_relations_iterator_state_timeout(final SubLObject v_object) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.tag_relations_iterator_state_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject tag_relations_iterator_state_domain_mt(final SubLObject v_object) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.tag_relations_iterator_state_p(v_object) " + v_object;
        return v_object.getField8();
    }

    public static SubLObject tag_relations_iterator_state_output_spec(final SubLObject v_object) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.tag_relations_iterator_state_p(v_object) " + v_object;
        return v_object.getField9();
    }

    public static SubLObject tag_relations_iterator_state_filter(final SubLObject v_object) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.tag_relations_iterator_state_p(v_object) " + v_object;
        return v_object.getField10();
    }

    public static SubLObject tag_relations_iterator_state_prepared_sentence_output(final SubLObject v_object) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.tag_relations_iterator_state_p(v_object) " + v_object;
        return v_object.getField11();
    }

    public static SubLObject _csetf_tag_relations_iterator_state_sentence_iterator(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.tag_relations_iterator_state_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_tag_relations_iterator_state_sentence_cyclifier(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.tag_relations_iterator_state_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_tag_relations_iterator_state_document(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.tag_relations_iterator_state_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_tag_relations_iterator_state_lexicon(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.tag_relations_iterator_state_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_tag_relations_iterator_state_sense_tagger(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.tag_relations_iterator_state_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_tag_relations_iterator_state_timeout(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.tag_relations_iterator_state_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_tag_relations_iterator_state_domain_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.tag_relations_iterator_state_p(v_object) " + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_tag_relations_iterator_state_output_spec(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.tag_relations_iterator_state_p(v_object) " + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_tag_relations_iterator_state_filter(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.tag_relations_iterator_state_p(v_object) " + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_tag_relations_iterator_state_prepared_sentence_output(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.tag_relations_iterator_state_p(v_object) " + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject make_tag_relations_iterator_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new nl_parsing_api.$tag_relations_iterator_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SENTENCE_ITERATOR)) {
                _csetf_tag_relations_iterator_state_sentence_iterator(v_new, current_value);
            } else
                if (pcase_var.eql($SENTENCE_CYCLIFIER)) {
                    _csetf_tag_relations_iterator_state_sentence_cyclifier(v_new, current_value);
                } else
                    if (pcase_var.eql($DOCUMENT)) {
                        _csetf_tag_relations_iterator_state_document(v_new, current_value);
                    } else
                        if (pcase_var.eql($LEXICON)) {
                            _csetf_tag_relations_iterator_state_lexicon(v_new, current_value);
                        } else
                            if (pcase_var.eql($SENSE_TAGGER)) {
                                _csetf_tag_relations_iterator_state_sense_tagger(v_new, current_value);
                            } else
                                if (pcase_var.eql($TIMEOUT)) {
                                    _csetf_tag_relations_iterator_state_timeout(v_new, current_value);
                                } else
                                    if (pcase_var.eql($DOMAIN_MT)) {
                                        _csetf_tag_relations_iterator_state_domain_mt(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($OUTPUT_SPEC)) {
                                            _csetf_tag_relations_iterator_state_output_spec(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($FILTER)) {
                                                _csetf_tag_relations_iterator_state_filter(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($PREPARED_SENTENCE_OUTPUT)) {
                                                    _csetf_tag_relations_iterator_state_prepared_sentence_output(v_new, current_value);
                                                } else {
                                                    Errors.error($str46$Invalid_slot__S_for_construction_, current_arg);
                                                }









        }
        return v_new;
    }

    public static SubLObject visit_defstruct_tag_relations_iterator_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TAG_RELATIONS_ITERATOR_STATE, TEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SENTENCE_ITERATOR, tag_relations_iterator_state_sentence_iterator(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCE_CYCLIFIER, tag_relations_iterator_state_sentence_cyclifier(obj));
        funcall(visitor_fn, obj, $SLOT, $DOCUMENT, tag_relations_iterator_state_document(obj));
        funcall(visitor_fn, obj, $SLOT, $LEXICON, tag_relations_iterator_state_lexicon(obj));
        funcall(visitor_fn, obj, $SLOT, $SENSE_TAGGER, tag_relations_iterator_state_sense_tagger(obj));
        funcall(visitor_fn, obj, $SLOT, $TIMEOUT, tag_relations_iterator_state_timeout(obj));
        funcall(visitor_fn, obj, $SLOT, $DOMAIN_MT, tag_relations_iterator_state_domain_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $OUTPUT_SPEC, tag_relations_iterator_state_output_spec(obj));
        funcall(visitor_fn, obj, $SLOT, $FILTER, tag_relations_iterator_state_filter(obj));
        funcall(visitor_fn, obj, $SLOT, $PREPARED_SENTENCE_OUTPUT, tag_relations_iterator_state_prepared_sentence_output(obj));
        funcall(visitor_fn, obj, $END, MAKE_TAG_RELATIONS_ITERATOR_STATE, TEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_tag_relations_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_tag_relations_iterator_state(obj, visitor_fn);
    }

    public static SubLObject new_tag_relations_iterator_state(final SubLObject v_document, final SubLObject optional_arg_plist) {
        final SubLObject iter = make_tag_relations_iterator_state(UNPROVIDED);
        _csetf_tag_relations_iterator_state_sentence_iterator(iter, document.new_sentence_iterator(v_document));
        _csetf_tag_relations_iterator_state_document(iter, v_document);
        _csetf_tag_relations_iterator_state_sentence_cyclifier(iter, getf(optional_arg_plist, $SENTENCE_CYCLIFIER, UNPROVIDED));
        _csetf_tag_relations_iterator_state_lexicon(iter, getf(optional_arg_plist, $LEXICON, default_lexicon_for_sentence_cyclifier(getf(optional_arg_plist, $SENTENCE_CYCLIFIER, UNPROVIDED))));
        _csetf_tag_relations_iterator_state_sense_tagger(iter, getf(optional_arg_plist, $SENSE_TAGGER, UNPROVIDED));
        _csetf_tag_relations_iterator_state_timeout(iter, getf(optional_arg_plist, $TIMEOUT, UNPROVIDED));
        _csetf_tag_relations_iterator_state_domain_mt(iter, getf(optional_arg_plist, $DOMAIN_MT, UNPROVIDED));
        _csetf_tag_relations_iterator_state_output_spec(iter, getf(optional_arg_plist, $OUTPUT_SPEC, UNPROVIDED));
        _csetf_tag_relations_iterator_state_filter(iter, getf(optional_arg_plist, $FILTER, UNPROVIDED));
        return iter;
    }

    public static SubLObject tag_relations_iterator_state_done_p(final SubLObject state) {
        return makeBoolean((NIL != iteration.iteration_done(tag_relations_iterator_state_sentence_iterator(state))) && (NIL == tag_relations_iterator_state_prepared_sentence_output(state)));
    }

    public static SubLObject tag_relations_iterator_state_next(final SubLObject state) {
        SubLObject result = NIL;
        if (NIL != tag_relations_iterator_state_prepared_sentence_output(state)) {
            result = tag_relations_iterator_state_prepared_sentence_output(state).first();
            _csetf_tag_relations_iterator_state_prepared_sentence_output(state, tag_relations_iterator_state_prepared_sentence_output(state).rest());
            return values(result, state, NIL);
        }
        if (NIL != iteration.iteration_done(tag_relations_iterator_state_sentence_iterator(state))) {
            return values(NIL, state, T);
        }
        final SubLObject sentence = iteration.iteration_next(tag_relations_iterator_state_sentence_iterator(state));
        final SubLObject lexicon = tag_relations_iterator_state_lexicon(state);
        final SubLObject filter = tag_relations_iterator_state_filter(state);
        final SubLObject output_spec = tag_relations_iterator_state_output_spec(state);
        final SubLObject learned_entities = methods.funcall_instance_method_with_1_args(lexicon, LEARN, document.sentence_string(sentence));
        final SubLObject v_cyclifier = tag_relations_iterator_state_sentence_cyclifier(state);
        final SubLObject discourse = NIL;
        final SubLObject domain_mt = tag_relations_iterator_state_domain_mt(state);
        final SubLObject timeout = tag_relations_iterator_state_timeout(state);
        final SubLObject sentence_result = funcall(v_cyclifier, sentence, lexicon, output_spec, domain_mt, timeout, discourse);
        _csetf_tag_relations_iterator_state_prepared_sentence_output(state, cons(sentence_result, tag_relations_iterator_state_prepared_sentence_output(state)));
        result = tag_relations_iterator_state_prepared_sentence_output(state).first();
        _csetf_tag_relations_iterator_state_prepared_sentence_output(state, tag_relations_iterator_state_prepared_sentence_output(state).rest());
        return values(result, state, NIL);
    }

    public static SubLObject sentence_cyclifier_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sentence_cyclifier(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sentence_cyclifier_p(final SubLObject v_object) {
        return v_object.getClass() == nl_parsing_api.$sentence_cyclifier_native.class ? T : NIL;
    }

    public static SubLObject sentence_cyclifier_name(final SubLObject v_object) {
        assert NIL != sentence_cyclifier_p(v_object) : "nl_parsing_api.sentence_cyclifier_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.sentence_cyclifier_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject sentence_cyclifier_cyclify_method(final SubLObject v_object) {
        assert NIL != sentence_cyclifier_p(v_object) : "nl_parsing_api.sentence_cyclifier_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.sentence_cyclifier_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject sentence_cyclifier_lexicon_method(final SubLObject v_object) {
        assert NIL != sentence_cyclifier_p(v_object) : "nl_parsing_api.sentence_cyclifier_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.sentence_cyclifier_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_sentence_cyclifier_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != sentence_cyclifier_p(v_object) : "nl_parsing_api.sentence_cyclifier_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.sentence_cyclifier_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sentence_cyclifier_cyclify_method(final SubLObject v_object, final SubLObject value) {
        assert NIL != sentence_cyclifier_p(v_object) : "nl_parsing_api.sentence_cyclifier_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.sentence_cyclifier_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sentence_cyclifier_lexicon_method(final SubLObject v_object, final SubLObject value) {
        assert NIL != sentence_cyclifier_p(v_object) : "nl_parsing_api.sentence_cyclifier_p(v_object) " + "CommonSymbols.NIL != nl_parsing_api.sentence_cyclifier_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_sentence_cyclifier(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new nl_parsing_api.$sentence_cyclifier_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                _csetf_sentence_cyclifier_name(v_new, current_value);
            } else
                if (pcase_var.eql($CYCLIFY_METHOD)) {
                    _csetf_sentence_cyclifier_cyclify_method(v_new, current_value);
                } else
                    if (pcase_var.eql($LEXICON_METHOD)) {
                        _csetf_sentence_cyclifier_lexicon_method(v_new, current_value);
                    } else {
                        Errors.error($str46$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sentence_cyclifier(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SENTENCE_CYCLIFIER, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, sentence_cyclifier_name(obj));
        funcall(visitor_fn, obj, $SLOT, $CYCLIFY_METHOD, sentence_cyclifier_cyclify_method(obj));
        funcall(visitor_fn, obj, $SLOT, $LEXICON_METHOD, sentence_cyclifier_lexicon_method(obj));
        funcall(visitor_fn, obj, $END, MAKE_SENTENCE_CYCLIFIER, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sentence_cyclifier_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sentence_cyclifier(obj, visitor_fn);
    }

    public static SubLObject print_sentence_cyclifier(final SubLObject v_cyclifier, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str73$__Cyclifier___A_, sentence_cyclifier_name(v_cyclifier));
        return v_cyclifier;
    }

    public static SubLObject declare_sentence_cyclifier(final SubLObject cyclifier_name, final SubLObject cyclify_method, SubLObject lexicon_method) {
        if (lexicon_method == UNPROVIDED) {
            lexicon_method = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_cyclifier = make_sentence_cyclifier(UNPROVIDED);
        _csetf_sentence_cyclifier_name(v_cyclifier, cyclifier_name);
        _csetf_sentence_cyclifier_cyclify_method(v_cyclifier, cyclify_method);
        _csetf_sentence_cyclifier_lexicon_method(v_cyclifier, lexicon_method);
        dictionary.dictionary_enter($sentence_cyclifiers$.getDynamicValue(thread), cyclifier_name, v_cyclifier);
        return v_cyclifier;
    }

    public static SubLObject sentence_cyclifier_get_cyclify_method(final SubLObject cyclifier_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_cyclifier = dictionary.dictionary_lookup($sentence_cyclifiers$.getDynamicValue(thread), cyclifier_name, UNPROVIDED);
        if (NIL == v_cyclifier) {
            Errors.error($str74$_S_is_not_a_registered_cyclifier_, cyclifier_name);
        }
        return sentence_cyclifier_cyclify_method(v_cyclifier);
    }

    public static SubLObject sentence_cyclifier_get_lexicon_method(final SubLObject cyclifier_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_cyclifier = dictionary.dictionary_lookup($sentence_cyclifiers$.getDynamicValue(thread), cyclifier_name, UNPROVIDED);
        if (NIL == v_cyclifier) {
            Errors.error($str74$_S_is_not_a_registered_cyclifier_, cyclifier_name);
        }
        return sentence_cyclifier_lexicon_method(v_cyclifier);
    }

    public static SubLObject default_lexicon_for_sentence_cyclifier(final SubLObject cyclifier_name) {
        return funcall(sentence_cyclifier_get_lexicon_method(cyclifier_name));
    }

    public static SubLObject default_relation_tagging_domain_mt() {
        return NIL;
    }

    public static SubLObject ebmt_cyclifier(final SubLObject sentence, final SubLObject lexicon, final SubLObject output_spec, final SubLObject domain_mt, final SubLObject timeout, final SubLObject discourse) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject string = document.sentence_string(sentence);
        SubLObject nl_interps = NIL;
        if (NIL == string_utilities.substringP($str75$_, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return iteration.new_list_iterator(nl_interps);
        }
        thread.resetMultipleValues();
        final SubLObject cycls = ebmt_template_parser.ebmt_parse(string, lexicon, domain_mt);
        final SubLObject justs = thread.secondMultipleValue();
        final SubLObject weights = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject cycl = NIL;
        SubLObject cycl_$1 = NIL;
        SubLObject just = NIL;
        SubLObject just_$2 = NIL;
        SubLObject weight = NIL;
        SubLObject weight_$3 = NIL;
        cycl = cycls;
        cycl_$1 = cycl.first();
        just = justs;
        just_$2 = just.first();
        weight = weights;
        weight_$3 = weight.first();
        while (((NIL != weight) || (NIL != just)) || (NIL != cycl)) {
            final SubLObject interp = nl_api_datastructures.new_nl_interpretation(list($CYCL, cycl_$1, $WEIGHT, weight_$3, $JUSTIFICATION, just_$2));
            nl_interps = cons(interp, nl_interps);
            cycl = cycl.rest();
            cycl_$1 = cycl.first();
            just = just.rest();
            just_$2 = just.first();
            weight = weight.rest();
            weight_$3 = weight.first();
        } 
        return iteration.new_list_iterator(nl_interps);
    }

    public static SubLObject stanford_cyclifier(final SubLObject sentence, final SubLObject lexicon, final SubLObject output_spec, final SubLObject domain_mt, final SubLObject timeout, final SubLObject discourse) {
        final SubLObject string = document.sentence_string(sentence);
        final SubLObject v_parser = parser.new_stanford_parser(UNPROVIDED, UNPROVIDED);
        SubLObject v_properties = list($PARSER, v_parser);
        if (NIL != lexicon) {
            v_properties = putf(v_properties, $LEXICON, lexicon);
        }
        return new_api_cyclifier(string, output_spec, v_properties);
    }

    public static SubLObject link_cyclifier(final SubLObject sentence, final SubLObject lexicon, final SubLObject output_spec, final SubLObject domain_mt, final SubLObject timeout, final SubLObject discourse) {
        final SubLObject string = document.sentence_string(sentence);
        final SubLObject v_parser = parser.new_link_parser(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject v_properties = list($PARSER, v_parser);
        if (NIL != lexicon) {
            v_properties = putf(v_properties, $LEXICON, lexicon);
        }
        return new_api_cyclifier(string, output_spec, v_properties);
    }

    public static SubLObject new_api_cyclifier(final SubLObject english, final SubLObject output_spec, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject cyclifier_iter = cyclifier.new_cyclifier(english, v_properties);
        return iteration.new_iterator(api_cyclifier_iterator_state(cyclifier_iter, output_spec), $sym84$API_CYCLIFIER_DONE_, API_CYCLIFIER_GET_NEXT, UNPROVIDED);
    }

    public static SubLObject api_cyclifier_iterator_state(final SubLObject v_cyclifier, final SubLObject output_spec) {
        final SubLObject iter = list($CYCLIFIER, v_cyclifier, $OUTPUT_SPEC, output_spec);
        return iter;
    }

    public static SubLObject api_cyclifier_doneP(final SubLObject iterator_state) {
        final SubLObject v_cyclifier = getf(iterator_state, $CYCLIFIER, UNPROVIDED);
        return values(makeBoolean(NIL == methods.funcall_instance_method_with_0_args(v_cyclifier, $sym87$HAS_NEXT_)), iterator_state, NIL);
    }

    public static SubLObject api_cyclifier_get_next(final SubLObject iterator_state) {
        final SubLObject v_cyclifier = getf(iterator_state, $CYCLIFIER, UNPROVIDED);
        final SubLObject cycl = methods.funcall_instance_method_with_0_args(v_cyclifier, NEXT);
        final SubLObject output_spec = getf(iterator_state, $OUTPUT_SPEC, UNPROVIDED);
        return values(nl_api_datastructures.new_nl_interpretation(list($CYCL, cycl)), iterator_state, NIL);
    }

    public static SubLObject tag_directory_relations(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Filesys.directory_p(directory) : "Filesys.directory_p(directory) " + "CommonSymbols.NIL != Filesys.directory_p(directory) " + directory;
        SubLObject directory_contents_var = Filesys.directory(directory, T);
        final SubLObject progress_message_var = NIL;
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
            if (NIL.isFunctionSpec()) {
                directory_contents_var = Sort.sort(directory_contents_var, NIL, UNPROVIDED);
            }
            final SubLObject list_var = directory_contents_var;
            final SubLObject _prev_bind_0_$4 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind(NIL != progress_message_var ? progress_message_var : $$$cdolist, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject file = NIL;
                    file = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        if (NIL == Filesys.directory_p(file)) {
                            tag_relations_from_file(file);
                        }
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        file = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0_$4, thread);
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject tag_relations_from_files(final SubLObject file_list) {
        SubLObject cdolist_list_var = file_list;
        SubLObject file = NIL;
        file = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == Filesys.directory_p(file)) || (NIL == string_utilities.substringP($$$table, file, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                tag_relations_from_file(file);
            }
            cdolist_list_var = cdolist_list_var.rest();
            file = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject tag_relations_from_file(final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject doc = document.new_document_from_file(file, UNPROVIDED, UNPROVIDED);
        final SubLObject iter = tag_relations(doc, $list92);
        SubLObject sentence_count = ZERO_INTEGER;
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject sentence = iteration.iteration_next(iter);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                if (sentence_count.numG(TEN_INTEGER)) {
                    return file;
                }
                sentence_count = add(sentence_count, ONE_INTEGER);
                SubLObject valid_$7;
                for (SubLObject done_var_$6 = NIL; NIL == done_var_$6; done_var_$6 = makeBoolean(NIL == valid_$7)) {
                    thread.resetMultipleValues();
                    final SubLObject cycl = iteration.iteration_next(sentence);
                    valid_$7 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid_$7) {
                        format(T, $str93$CycL___S__, cycl);
                    }
                }
            }
        }
        return file;
    }

    public static SubLObject sentencifications_from_file(final SubLObject file, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject doc = document.new_document_from_file(file, UNPROVIDED, UNPROVIDED);
        final SubLObject sentences = document.new_sentence_iterator(doc);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject sentence = iteration.iteration_next(sentences);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                princ(document.sentence_string(sentence), stream);
                terpri(stream);
                terpri(stream);
            }
        }
        return NIL;
    }

    public static SubLObject string_phrasal_meanings(final SubLObject string, SubLObject optional_arg_plist) {
        if (optional_arg_plist == UNPROVIDED) {
            optional_arg_plist = NIL;
        }
        SubLTrampolineFile.enforceType(string, STRINGP);
        SubLTrampolineFile.enforceType(optional_arg_plist, PHRASAL_MEANINGS_OPTIONAL_ARGS_P);
        return iteration.iterator_value_list(string_phrasal_meanings_iterator(string, optional_arg_plist));
    }

    public static SubLObject string_phrasal_meanings_iterator(final SubLObject string, SubLObject optional_arg_plist) {
        if (optional_arg_plist == UNPROVIDED) {
            optional_arg_plist = NIL;
        }
        SubLTrampolineFile.enforceType(string, STRINGP);
        SubLTrampolineFile.enforceType(optional_arg_plist, PHRASAL_MEANINGS_OPTIONAL_ARGS_P);
        return phrasal_meanings_iterator(document.new_phrase(list($STRING, string)), optional_arg_plist);
    }

    public static SubLObject phrasal_meanings(final SubLObject phrase, SubLObject optional_arg_plist) {
        if (optional_arg_plist == UNPROVIDED) {
            optional_arg_plist = NIL;
        }
        SubLTrampolineFile.enforceType(phrase, PHRASE_P);
        SubLTrampolineFile.enforceType(optional_arg_plist, PHRASAL_MEANINGS_OPTIONAL_ARGS_P);
        return iteration.iterator_value_list(phrasal_meanings_iterator(phrase, optional_arg_plist));
    }

    public static SubLObject phrasal_meanings_iterator(final SubLObject phrase, SubLObject optional_arg_plist) {
        if (optional_arg_plist == UNPROVIDED) {
            optional_arg_plist = NIL;
        }
        SubLTrampolineFile.enforceType(phrase, PHRASE_P);
        SubLTrampolineFile.enforceType(optional_arg_plist, PHRASAL_MEANINGS_OPTIONAL_ARGS_P);
        optional_arg_plist = list_utilities.augment_plist_with_defaults(optional_arg_plist, listS($OUTPUT_SPEC, new SubLObject[]{ nl_api_datastructures.new_nl_output_spec($SUBL, nl_api_datastructures.new_nl_interpretation_spec(UNPROVIDED)), $LEARNERS, $list104, $FILTER, NIL, $SYNTACTIC_RESTRICTION, NIL, $PHRASE_CYCLIFIER, LEXICAL_PHRASE_CYCLIFIER, $LEXICON, term_lexicon.new_case_sensitivity_preferred_term_lexicon(), $DOMAIN_MT, default_relation_tagging_domain_mt(), $list108 }));
        return iteration.new_list_iterator(funcall(getf(optional_arg_plist, $PHRASE_CYCLIFIER, UNPROVIDED), phrase, optional_arg_plist));
    }

    public static SubLObject phrasal_meanings_optional_args_p(final SubLObject obj) {
        return list_utilities.property_list_p(obj);
    }

    public static SubLObject lexical_phrase_cyclifier(final SubLObject phrase, final SubLObject optional_arg_plist) {
        final SubLObject string = document.phrase_string(phrase);
        final SubLObject lex = getf(optional_arg_plist, $LEXICON, UNPROVIDED);
        final SubLObject domain_mt = getf(optional_arg_plist, $DOMAIN_MT, UNPROVIDED);
        final SubLObject output_spec = getf(optional_arg_plist, $OUTPUT_SPEC, UNPROVIDED);
        final SubLObject interp_spec = nl_api_datastructures.output_spec_interp_spec(output_spec);
        final SubLObject filter_spec = getf(optional_arg_plist, $FILTER, $DEFAULT);
        final SubLObject learners = getf(optional_arg_plist, $LEARNERS, UNPROVIDED);
        SubLObject result_interps = NIL;
        SubLObject final_result = NIL;
        if (NIL != learners) {
            methods.funcall_instance_method_with_2_args(lex, LEARN, document.phrase_string(phrase), learners);
        }
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(lex, GET, string);
        SubLObject lex_entry = NIL;
        lex_entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != lex_entry_passes_syntactic_restrictionP(lex_entry, getf(optional_arg_plist, $SYNTACTIC_RESTRICTION, UNPROVIDED))) {
                result_interps = cconcatenate(concept_tagger.concept_tagger_extract_interpretations_from_lex_entry(list(lex_entry), interp_spec, filter_spec), result_interps);
                if (NIL != nl_api_datastructures.xml_output_spec_p(output_spec)) {
                    final_result = Mapping.mapcar(NL_INTERP_TO_XML, result_interps);
                } else {
                    final_result = result_interps;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            lex_entry = cdolist_list_var.first();
        } 
        return final_result;
    }

    public static SubLObject lex_entry_passes_syntactic_restrictionP(final SubLObject lex_entry, final SubLObject restriction) {
        final SubLObject allowed_preds = list_utilities.remove_if_not(PREDICATE_P, restriction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject allowed_poses = list_utilities.remove_if_not($sym113$SPEECH_PART_, restriction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ((NIL == allowed_preds) && (NIL == allowed_poses)) {
            return T;
        }
        if (NIL != allowed_preds) {
            SubLObject cdolist_list_var = allowed_preds;
            SubLObject allowed_pred = NIL;
            allowed_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$8 = cons(methods.funcall_instance_method_with_1_args(lex_entry, GET, $PREDICATE), methods.funcall_instance_method_with_1_args(lex_entry, GET, $INFLECTIONS));
                SubLObject known_pred = NIL;
                known_pred = cdolist_list_var_$8.first();
                while (NIL != cdolist_list_var_$8) {
                    if (NIL != lexicon_accessors.genl_pos_predP(known_pred, allowed_pred, UNPROVIDED)) {
                        return T;
                    }
                    cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                    known_pred = cdolist_list_var_$8.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                allowed_pred = cdolist_list_var.first();
            } 
        }
        if (NIL != allowed_poses) {
            SubLObject cdolist_list_var = allowed_poses;
            SubLObject allowed_pos = NIL;
            allowed_pos = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != lexicon_accessors.genl_posP(methods.funcall_instance_method_with_1_args(lex_entry, GET, $CYC_POS), allowed_pos, UNPROVIDED)) {
                    return T;
                }
                cdolist_list_var = cdolist_list_var.rest();
                allowed_pos = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject string_phrasal_meanings_test(final SubLObject string, SubLObject optional_args) {
        if (optional_args == UNPROVIDED) {
            optional_args = NIL;
        }
        return Mapping.mapcar(GET_NL_INTERP_CYCL, string_phrasal_meanings(string, optional_args));
    }

    public static SubLObject string_phrasal_meanings_with_args(final SubLObject string, SubLObject optional_args) {
        if (optional_args == UNPROVIDED) {
            optional_args = NIL;
        }
        return string_phrasal_meanings(string, eval(optional_args));
    }

    public static SubLObject string_phrasal_meanings_with_args_non_working_cases(final SubLObject string, SubLObject optional_args) {
        if (optional_args == UNPROVIDED) {
            optional_args = NIL;
        }
        return string_phrasal_meanings_with_args(string, optional_args);
    }

    public static SubLObject string_phrasal_meanings_with_adhoc_filter_type(final SubLObject string, final SubLObject filter_type, SubLObject optional_args) {
        if (optional_args == UNPROVIDED) {
            optional_args = NIL;
        }
        optional_args = putf(optional_args, $FILTER, concept_filter.new_adhoc_concept_filter_spec(filter_type, UNPROVIDED));
        return string_phrasal_meanings_test(string, optional_args);
    }

    public static SubLObject string_phrasal_meanings_with_adhoc_genls_filter_type(final SubLObject string, final SubLObject filter_type, SubLObject optional_args) {
        if (optional_args == UNPROVIDED) {
            optional_args = NIL;
        }
        optional_args = putf(optional_args, $FILTER, concept_filter.new_adhoc_genls_concept_filter_spec(filter_type, UNPROVIDED));
        return string_phrasal_meanings_test(string, optional_args);
    }

    public static SubLObject string_phrasal_meanings_with_adhoc_isa_filter_type(final SubLObject string, final SubLObject filter_type, SubLObject optional_args) {
        if (optional_args == UNPROVIDED) {
            optional_args = NIL;
        }
        optional_args = putf(optional_args, $FILTER, concept_filter.new_adhoc_isa_concept_filter_spec(filter_type, UNPROVIDED));
        return string_phrasal_meanings_test(string, optional_args);
    }

    public static SubLObject declare_nl_parsing_api_file() {
        declareFunction(me, "tag_relations", "TAG-RELATIONS", 1, 1, false);
        declareFunction(me, "tag_relations_optional_args_p", "TAG-RELATIONS-OPTIONAL-ARGS-P", 1, 0, false);
        declareFunction(me, "tag_relations_iterator_state_print_function_trampoline", "TAG-RELATIONS-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "tag_relations_iterator_state_p", "TAG-RELATIONS-ITERATOR-STATE-P", 1, 0, false);
        new nl_parsing_api.$tag_relations_iterator_state_p$UnaryFunction();
        declareFunction(me, "tag_relations_iterator_state_sentence_iterator", "TAG-RELATIONS-ITERATOR-STATE-SENTENCE-ITERATOR", 1, 0, false);
        declareFunction(me, "tag_relations_iterator_state_sentence_cyclifier", "TAG-RELATIONS-ITERATOR-STATE-SENTENCE-CYCLIFIER", 1, 0, false);
        declareFunction(me, "tag_relations_iterator_state_document", "TAG-RELATIONS-ITERATOR-STATE-DOCUMENT", 1, 0, false);
        declareFunction(me, "tag_relations_iterator_state_lexicon", "TAG-RELATIONS-ITERATOR-STATE-LEXICON", 1, 0, false);
        declareFunction(me, "tag_relations_iterator_state_sense_tagger", "TAG-RELATIONS-ITERATOR-STATE-SENSE-TAGGER", 1, 0, false);
        declareFunction(me, "tag_relations_iterator_state_timeout", "TAG-RELATIONS-ITERATOR-STATE-TIMEOUT", 1, 0, false);
        declareFunction(me, "tag_relations_iterator_state_domain_mt", "TAG-RELATIONS-ITERATOR-STATE-DOMAIN-MT", 1, 0, false);
        declareFunction(me, "tag_relations_iterator_state_output_spec", "TAG-RELATIONS-ITERATOR-STATE-OUTPUT-SPEC", 1, 0, false);
        declareFunction(me, "tag_relations_iterator_state_filter", "TAG-RELATIONS-ITERATOR-STATE-FILTER", 1, 0, false);
        declareFunction(me, "tag_relations_iterator_state_prepared_sentence_output", "TAG-RELATIONS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT", 1, 0, false);
        declareFunction(me, "_csetf_tag_relations_iterator_state_sentence_iterator", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENTENCE-ITERATOR", 2, 0, false);
        declareFunction(me, "_csetf_tag_relations_iterator_state_sentence_cyclifier", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENTENCE-CYCLIFIER", 2, 0, false);
        declareFunction(me, "_csetf_tag_relations_iterator_state_document", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-DOCUMENT", 2, 0, false);
        declareFunction(me, "_csetf_tag_relations_iterator_state_lexicon", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-LEXICON", 2, 0, false);
        declareFunction(me, "_csetf_tag_relations_iterator_state_sense_tagger", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENSE-TAGGER", 2, 0, false);
        declareFunction(me, "_csetf_tag_relations_iterator_state_timeout", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-TIMEOUT", 2, 0, false);
        declareFunction(me, "_csetf_tag_relations_iterator_state_domain_mt", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-DOMAIN-MT", 2, 0, false);
        declareFunction(me, "_csetf_tag_relations_iterator_state_output_spec", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-OUTPUT-SPEC", 2, 0, false);
        declareFunction(me, "_csetf_tag_relations_iterator_state_filter", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-FILTER", 2, 0, false);
        declareFunction(me, "_csetf_tag_relations_iterator_state_prepared_sentence_output", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT", 2, 0, false);
        declareFunction(me, "make_tag_relations_iterator_state", "MAKE-TAG-RELATIONS-ITERATOR-STATE", 0, 1, false);
        declareFunction(me, "visit_defstruct_tag_relations_iterator_state", "VISIT-DEFSTRUCT-TAG-RELATIONS-ITERATOR-STATE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_tag_relations_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-TAG-RELATIONS-ITERATOR-STATE-METHOD", 2, 0, false);
        declareFunction(me, "new_tag_relations_iterator_state", "NEW-TAG-RELATIONS-ITERATOR-STATE", 2, 0, false);
        declareFunction(me, "tag_relations_iterator_state_done_p", "TAG-RELATIONS-ITERATOR-STATE-DONE-P", 1, 0, false);
        declareFunction(me, "tag_relations_iterator_state_next", "TAG-RELATIONS-ITERATOR-STATE-NEXT", 1, 0, false);
        declareFunction(me, "sentence_cyclifier_print_function_trampoline", "SENTENCE-CYCLIFIER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sentence_cyclifier_p", "SENTENCE-CYCLIFIER-P", 1, 0, false);
        new nl_parsing_api.$sentence_cyclifier_p$UnaryFunction();
        declareFunction(me, "sentence_cyclifier_name", "SENTENCE-CYCLIFIER-NAME", 1, 0, false);
        declareFunction(me, "sentence_cyclifier_cyclify_method", "SENTENCE-CYCLIFIER-CYCLIFY-METHOD", 1, 0, false);
        declareFunction(me, "sentence_cyclifier_lexicon_method", "SENTENCE-CYCLIFIER-LEXICON-METHOD", 1, 0, false);
        declareFunction(me, "_csetf_sentence_cyclifier_name", "_CSETF-SENTENCE-CYCLIFIER-NAME", 2, 0, false);
        declareFunction(me, "_csetf_sentence_cyclifier_cyclify_method", "_CSETF-SENTENCE-CYCLIFIER-CYCLIFY-METHOD", 2, 0, false);
        declareFunction(me, "_csetf_sentence_cyclifier_lexicon_method", "_CSETF-SENTENCE-CYCLIFIER-LEXICON-METHOD", 2, 0, false);
        declareFunction(me, "make_sentence_cyclifier", "MAKE-SENTENCE-CYCLIFIER", 0, 1, false);
        declareFunction(me, "visit_defstruct_sentence_cyclifier", "VISIT-DEFSTRUCT-SENTENCE-CYCLIFIER", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sentence_cyclifier_method", "VISIT-DEFSTRUCT-OBJECT-SENTENCE-CYCLIFIER-METHOD", 2, 0, false);
        declareFunction(me, "print_sentence_cyclifier", "PRINT-SENTENCE-CYCLIFIER", 1, 2, false);
        declareFunction(me, "declare_sentence_cyclifier", "DECLARE-SENTENCE-CYCLIFIER", 2, 1, false);
        declareFunction(me, "sentence_cyclifier_get_cyclify_method", "SENTENCE-CYCLIFIER-GET-CYCLIFY-METHOD", 1, 0, false);
        declareFunction(me, "sentence_cyclifier_get_lexicon_method", "SENTENCE-CYCLIFIER-GET-LEXICON-METHOD", 1, 0, false);
        declareFunction(me, "default_lexicon_for_sentence_cyclifier", "DEFAULT-LEXICON-FOR-SENTENCE-CYCLIFIER", 1, 0, false);
        declareFunction(me, "default_relation_tagging_domain_mt", "DEFAULT-RELATION-TAGGING-DOMAIN-MT", 0, 0, false);
        declareFunction(me, "ebmt_cyclifier", "EBMT-CYCLIFIER", 6, 0, false);
        declareFunction(me, "stanford_cyclifier", "STANFORD-CYCLIFIER", 6, 0, false);
        declareFunction(me, "link_cyclifier", "LINK-CYCLIFIER", 6, 0, false);
        declareFunction(me, "new_api_cyclifier", "NEW-API-CYCLIFIER", 2, 1, false);
        declareFunction(me, "api_cyclifier_iterator_state", "API-CYCLIFIER-ITERATOR-STATE", 2, 0, false);
        declareFunction(me, "api_cyclifier_doneP", "API-CYCLIFIER-DONE?", 1, 0, false);
        declareFunction(me, "api_cyclifier_get_next", "API-CYCLIFIER-GET-NEXT", 1, 0, false);
        declareFunction(me, "tag_directory_relations", "TAG-DIRECTORY-RELATIONS", 1, 0, false);
        declareFunction(me, "tag_relations_from_files", "TAG-RELATIONS-FROM-FILES", 1, 0, false);
        declareFunction(me, "tag_relations_from_file", "TAG-RELATIONS-FROM-FILE", 1, 0, false);
        declareFunction(me, "sentencifications_from_file", "SENTENCIFICATIONS-FROM-FILE", 1, 1, false);
        declareFunction(me, "string_phrasal_meanings", "STRING-PHRASAL-MEANINGS", 1, 1, false);
        declareFunction(me, "string_phrasal_meanings_iterator", "STRING-PHRASAL-MEANINGS-ITERATOR", 1, 1, false);
        declareFunction(me, "phrasal_meanings", "PHRASAL-MEANINGS", 1, 1, false);
        declareFunction(me, "phrasal_meanings_iterator", "PHRASAL-MEANINGS-ITERATOR", 1, 1, false);
        declareFunction(me, "phrasal_meanings_optional_args_p", "PHRASAL-MEANINGS-OPTIONAL-ARGS-P", 1, 0, false);
        declareFunction(me, "lexical_phrase_cyclifier", "LEXICAL-PHRASE-CYCLIFIER", 2, 0, false);
        declareFunction(me, "lex_entry_passes_syntactic_restrictionP", "LEX-ENTRY-PASSES-SYNTACTIC-RESTRICTION?", 2, 0, false);
        declareFunction(me, "string_phrasal_meanings_test", "STRING-PHRASAL-MEANINGS-TEST", 1, 1, false);
        declareFunction(me, "string_phrasal_meanings_with_args", "STRING-PHRASAL-MEANINGS-WITH-ARGS", 1, 1, false);
        declareFunction(me, "string_phrasal_meanings_with_args_non_working_cases", "STRING-PHRASAL-MEANINGS-WITH-ARGS-NON-WORKING-CASES", 1, 1, false);
        declareFunction(me, "string_phrasal_meanings_with_adhoc_filter_type", "STRING-PHRASAL-MEANINGS-WITH-ADHOC-FILTER-TYPE", 2, 1, false);
        declareFunction(me, "string_phrasal_meanings_with_adhoc_genls_filter_type", "STRING-PHRASAL-MEANINGS-WITH-ADHOC-GENLS-FILTER-TYPE", 2, 1, false);
        declareFunction(me, "string_phrasal_meanings_with_adhoc_isa_filter_type", "STRING-PHRASAL-MEANINGS-WITH-ADHOC-ISA-FILTER-TYPE", 2, 1, false);
        return NIL;
    }

    public static SubLObject init_nl_parsing_api_file() {
        defconstant("*DTP-TAG-RELATIONS-ITERATOR-STATE*", TAG_RELATIONS_ITERATOR_STATE);
        defparameter("*SENTENCE-CYCLIFIERS*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        defconstant("*DTP-SENTENCE-CYCLIFIER*", SENTENCE_CYCLIFIER);
        return NIL;
    }

    public static SubLObject setup_nl_parsing_api_file() {
        register_external_symbol(TAG_RELATIONS);
        register_external_symbol(TAG_RELATIONS_OPTIONAL_ARGS_P);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_tag_relations_iterator_state$.getGlobalValue(), symbol_function(TAG_RELATIONS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list20);
        def_csetf(TAG_RELATIONS_ITERATOR_STATE_SENTENCE_ITERATOR, _CSETF_TAG_RELATIONS_ITERATOR_STATE_SENTENCE_ITERATOR);
        def_csetf(TAG_RELATIONS_ITERATOR_STATE_SENTENCE_CYCLIFIER, _CSETF_TAG_RELATIONS_ITERATOR_STATE_SENTENCE_CYCLIFIER);
        def_csetf(TAG_RELATIONS_ITERATOR_STATE_DOCUMENT, _CSETF_TAG_RELATIONS_ITERATOR_STATE_DOCUMENT);
        def_csetf(TAG_RELATIONS_ITERATOR_STATE_LEXICON, _CSETF_TAG_RELATIONS_ITERATOR_STATE_LEXICON);
        def_csetf(TAG_RELATIONS_ITERATOR_STATE_SENSE_TAGGER, _CSETF_TAG_RELATIONS_ITERATOR_STATE_SENSE_TAGGER);
        def_csetf(TAG_RELATIONS_ITERATOR_STATE_TIMEOUT, _CSETF_TAG_RELATIONS_ITERATOR_STATE_TIMEOUT);
        def_csetf(TAG_RELATIONS_ITERATOR_STATE_DOMAIN_MT, _CSETF_TAG_RELATIONS_ITERATOR_STATE_DOMAIN_MT);
        def_csetf(TAG_RELATIONS_ITERATOR_STATE_OUTPUT_SPEC, _CSETF_TAG_RELATIONS_ITERATOR_STATE_OUTPUT_SPEC);
        def_csetf(TAG_RELATIONS_ITERATOR_STATE_FILTER, _CSETF_TAG_RELATIONS_ITERATOR_STATE_FILTER);
        def_csetf(TAG_RELATIONS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT, _CSETF_TAG_RELATIONS_ITERATOR_STATE_PREPARED_SENTENCE_OUTPUT);
        identity(TAG_RELATIONS_ITERATOR_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_tag_relations_iterator_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TAG_RELATIONS_ITERATOR_STATE_METHOD));
        note_funcall_helper_function(TAG_RELATIONS_ITERATOR_STATE_DONE_P);
        note_funcall_helper_function(TAG_RELATIONS_ITERATOR_STATE_NEXT);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sentence_cyclifier$.getGlobalValue(), symbol_function(SENTENCE_CYCLIFIER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list61);
        def_csetf(SENTENCE_CYCLIFIER_NAME, _CSETF_SENTENCE_CYCLIFIER_NAME);
        def_csetf(SENTENCE_CYCLIFIER_CYCLIFY_METHOD, _CSETF_SENTENCE_CYCLIFIER_CYCLIFY_METHOD);
        def_csetf(SENTENCE_CYCLIFIER_LEXICON_METHOD, _CSETF_SENTENCE_CYCLIFIER_LEXICON_METHOD);
        identity(SENTENCE_CYCLIFIER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sentence_cyclifier$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SENTENCE_CYCLIFIER_METHOD));
        declare_sentence_cyclifier(EBMT_CYCLIFIER, EBMT_CYCLIFIER, NEW_SEMTRANS_LEXICON);
        declare_sentence_cyclifier(STANFORD_CYCLIFIER, STANFORD_CYCLIFIER, NEW_CYCLIFIER_LEXICON);
        declare_sentence_cyclifier(LINK_CYCLIFIER, LINK_CYCLIFIER, NEW_CYCLIFIER_LEXICON);
        register_external_symbol(STRING_PHRASAL_MEANINGS);
        register_external_symbol(STRING_PHRASAL_MEANINGS_ITERATOR);
        register_external_symbol(PHRASAL_MEANINGS);
        register_external_symbol(PHRASAL_MEANINGS_ITERATOR);
        register_external_symbol(PHRASAL_MEANINGS_OPTIONAL_ARGS_P);
        define_test_case_table_int(STRING_PHRASAL_MEANINGS_TEST, list(new SubLObject[]{ $TEST, $sym120$SETS_EQUAL_EQUAL_, $OWNER, NIL, $CLASSES, $list123, $KB, $FULL, $WORKING_, T }), $list127);
        define_test_case_table_int(STRING_PHRASAL_MEANINGS_WITH_ADHOC_GENLS_FILTER_TYPE, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, $list123, $KB, $FULL, $WORKING_, NIL }), $list129);
        define_test_case_table_int(STRING_PHRASAL_MEANINGS_WITH_ADHOC_ISA_FILTER_TYPE, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, $list123, $KB, $FULL, $WORKING_, T }), $list131);
        define_test_case_table_int(STRING_PHRASAL_MEANINGS_WITH_ARGS, list(new SubLObject[]{ $TEST, $sym120$SETS_EQUAL_EQUAL_, $OWNER, NIL, $CLASSES, $list123, $KB, $FULL, $WORKING_, T }), $list133);
        define_test_case_table_int(STRING_PHRASAL_MEANINGS_WITH_ARGS_NON_WORKING_CASES, list(new SubLObject[]{ $TEST, $sym120$SETS_EQUAL_EQUAL_, $OWNER, NIL, $CLASSES, $list123, $KB, $FULL, $WORKING_, NIL }), $list135);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_nl_parsing_api_file();
    }

    @Override
    public void initializeVariables() {
        init_nl_parsing_api_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_nl_parsing_api_file();
    }

    static {












































































































































    }

    public static final class $tag_relations_iterator_state_native extends SubLStructNative {
        public SubLObject $sentence_iterator;

        public SubLObject $sentence_cyclifier;

        public SubLObject $document;

        public SubLObject $lexicon;

        public SubLObject $sense_tagger;

        public SubLObject $timeout;

        public SubLObject $domain_mt;

        public SubLObject $output_spec;

        public SubLObject $filter;

        public SubLObject $prepared_sentence_output;

        private static final SubLStructDeclNative structDecl;

        public $tag_relations_iterator_state_native() {
            this.$sentence_iterator = Lisp.NIL;
            this.$sentence_cyclifier = Lisp.NIL;
            this.$document = Lisp.NIL;
            this.$lexicon = Lisp.NIL;
            this.$sense_tagger = Lisp.NIL;
            this.$timeout = Lisp.NIL;
            this.$domain_mt = Lisp.NIL;
            this.$output_spec = Lisp.NIL;
            this.$filter = Lisp.NIL;
            this.$prepared_sentence_output = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$sentence_iterator;
        }

        @Override
        public SubLObject getField3() {
            return this.$sentence_cyclifier;
        }

        @Override
        public SubLObject getField4() {
            return this.$document;
        }

        @Override
        public SubLObject getField5() {
            return this.$lexicon;
        }

        @Override
        public SubLObject getField6() {
            return this.$sense_tagger;
        }

        @Override
        public SubLObject getField7() {
            return this.$timeout;
        }

        @Override
        public SubLObject getField8() {
            return this.$domain_mt;
        }

        @Override
        public SubLObject getField9() {
            return this.$output_spec;
        }

        @Override
        public SubLObject getField10() {
            return this.$filter;
        }

        @Override
        public SubLObject getField11() {
            return this.$prepared_sentence_output;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$sentence_iterator = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$sentence_cyclifier = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$document = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$lexicon = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$sense_tagger = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$timeout = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$domain_mt = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$output_spec = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$filter = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$prepared_sentence_output = value;
        }

        static {
            structDecl = makeStructDeclNative(nl_parsing_api.$tag_relations_iterator_state_native.class, TAG_RELATIONS_ITERATOR_STATE, TAG_RELATIONS_ITERATOR_STATE_P, $list14, $list15, new String[]{ "$sentence_iterator", "$sentence_cyclifier", "$document", "$lexicon", "$sense_tagger", "$timeout", "$domain_mt", "$output_spec", "$filter", "$prepared_sentence_output" }, $list16, $list17, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $tag_relations_iterator_state_p$UnaryFunction extends UnaryFunction {
        public $tag_relations_iterator_state_p$UnaryFunction() {
            super(extractFunctionNamed("TAG-RELATIONS-ITERATOR-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return tag_relations_iterator_state_p(arg1);
        }
    }

    public static final class $sentence_cyclifier_native extends SubLStructNative {
        public SubLObject $name;

        public SubLObject $cyclify_method;

        public SubLObject $lexicon_method;

        private static final SubLStructDeclNative structDecl;

        public $sentence_cyclifier_native() {
            this.$name = Lisp.NIL;
            this.$cyclify_method = Lisp.NIL;
            this.$lexicon_method = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$name;
        }

        @Override
        public SubLObject getField3() {
            return this.$cyclify_method;
        }

        @Override
        public SubLObject getField4() {
            return this.$lexicon_method;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$cyclify_method = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$lexicon_method = value;
        }

        static {
            structDecl = makeStructDeclNative(nl_parsing_api.$sentence_cyclifier_native.class, SENTENCE_CYCLIFIER, SENTENCE_CYCLIFIER_P, $list55, $list56, new String[]{ "$name", "$cyclify_method", "$lexicon_method" }, $list57, $list58, PRINT_SENTENCE_CYCLIFIER);
        }
    }

    public static final class $sentence_cyclifier_p$UnaryFunction extends UnaryFunction {
        public $sentence_cyclifier_p$UnaryFunction() {
            super(extractFunctionNamed("SENTENCE-CYCLIFIER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sentence_cyclifier_p(arg1);
        }
    }
}

/**
 * Total time: 349 ms
 */
