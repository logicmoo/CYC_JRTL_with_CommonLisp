/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      NL-PARSING-API
 * source file: /cyc/top/cycl/nl-parsing-api.lisp
 * created:     2019/07/03 17:38:52
 */
public final class nl_parsing_api extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new nl_parsing_api();



    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_tag_relations_iterator_state$ = makeSymbol("*DTP-TAG-RELATIONS-ITERATOR-STATE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $sentence_cyclifiers$ = makeSymbol("*SENTENCE-CYCLIFIERS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_sentence_cyclifier$ = makeSymbol("*DTP-SENTENCE-CYCLIFIER*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol TAG_RELATIONS = makeSymbol("TAG-RELATIONS");

    private static final SubLSymbol LINK_CYCLIFIER = makeSymbol("LINK-CYCLIFIER");

    private static final SubLSymbol TAG_RELATIONS_ITERATOR_STATE_DONE_P = makeSymbol("TAG-RELATIONS-ITERATOR-STATE-DONE-P");

    private static final SubLSymbol TAG_RELATIONS_ITERATOR_STATE_NEXT = makeSymbol("TAG-RELATIONS-ITERATOR-STATE-NEXT");

    private static final SubLSymbol TAG_RELATIONS_OPTIONAL_ARGS_P = makeSymbol("TAG-RELATIONS-OPTIONAL-ARGS-P");

    static private final SubLList $list11 = list(makeKeyword("LEXICON"), makeKeyword("SENTENCE-CYCLIFIER"), makeKeyword("DOMAIN-MT"), makeKeyword("OUTPUT-SPEC"), makeKeyword("FILTER"), makeKeyword("SENSE-TAGGER"), makeKeyword("TIMEOUT"));

    private static final SubLSymbol TAG_RELATIONS_ITERATOR_STATE = makeSymbol("TAG-RELATIONS-ITERATOR-STATE");

    private static final SubLSymbol TAG_RELATIONS_ITERATOR_STATE_P = makeSymbol("TAG-RELATIONS-ITERATOR-STATE-P");

    static private final SubLList $list14 = list(new SubLObject[]{ makeSymbol("SENTENCE-ITERATOR"), makeSymbol("SENTENCE-CYCLIFIER"), makeSymbol("DOCUMENT"), makeSymbol("LEXICON"), makeSymbol("SENSE-TAGGER"), makeSymbol("TIMEOUT"), makeSymbol("DOMAIN-MT"), makeSymbol("OUTPUT-SPEC"), makeSymbol("FILTER"), makeSymbol("PREPARED-SENTENCE-OUTPUT") });

    static private final SubLList $list15 = list(new SubLObject[]{ makeKeyword("SENTENCE-ITERATOR"), makeKeyword("SENTENCE-CYCLIFIER"), makeKeyword("DOCUMENT"), makeKeyword("LEXICON"), makeKeyword("SENSE-TAGGER"), makeKeyword("TIMEOUT"), makeKeyword("DOMAIN-MT"), makeKeyword("OUTPUT-SPEC"), makeKeyword("FILTER"), makeKeyword("PREPARED-SENTENCE-OUTPUT") });

    static private final SubLList $list16 = list(new SubLObject[]{ makeSymbol("TAG-RELATIONS-ITERATOR-STATE-SENTENCE-ITERATOR"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-SENTENCE-CYCLIFIER"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-DOCUMENT"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-LEXICON"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-SENSE-TAGGER"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-TIMEOUT"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-DOMAIN-MT"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-OUTPUT-SPEC"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-FILTER"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT") });

    static private final SubLList $list17 = list(new SubLObject[]{ makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENTENCE-ITERATOR"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENTENCE-CYCLIFIER"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-DOCUMENT"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-LEXICON"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENSE-TAGGER"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-TIMEOUT"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-DOMAIN-MT"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-OUTPUT-SPEC"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-FILTER"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT") });

    private static final SubLSymbol TAG_RELATIONS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TAG-RELATIONS-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");

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

    private static final SubLList $list56 = list($NAME, makeKeyword("CYCLIFY-METHOD"), makeKeyword("LEXICON-METHOD"));

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

    private static final SubLList $list127 = list(list(list(makeString("dog")), list(reader_make_constant_shell("Dog"), reader_make_constant_shell("HotDog"))), list(list(makeString("January 20, 2000")), list(list(reader_make_constant_shell("DayFn"), TWENTY_INTEGER, list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("January"), list(reader_make_constant_shell("YearFn"), makeInteger(2000)))))));

    private static final SubLSymbol STRING_PHRASAL_MEANINGS_WITH_ADHOC_GENLS_FILTER_TYPE = makeSymbol("STRING-PHRASAL-MEANINGS-WITH-ADHOC-GENLS-FILTER-TYPE");

    private static final SubLList $list129 = list(list(list(makeString("dog"), reader_make_constant_shell("Person")), NIL), list(list(makeString("dog"), reader_make_constant_shell("Animal")), list(reader_make_constant_shell("Dog"))), list(list(makeString("dog"), reader_make_constant_shell("Person")), NIL));

    private static final SubLSymbol STRING_PHRASAL_MEANINGS_WITH_ADHOC_ISA_FILTER_TYPE = makeSymbol("STRING-PHRASAL-MEANINGS-WITH-ADHOC-ISA-FILTER-TYPE");

    private static final SubLList $list131 = list(list(list(makeString("January 20, 2000"), reader_make_constant_shell("Date")), list(list(reader_make_constant_shell("DayFn"), TWENTY_INTEGER, list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("January"), list(reader_make_constant_shell("YearFn"), makeInteger(2000)))))), list(list(makeString("January 20, 2000"), reader_make_constant_shell("TimeInterval")), list(list(reader_make_constant_shell("DayFn"), TWENTY_INTEGER, list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("January"), list(reader_make_constant_shell("YearFn"), makeInteger(2000)))))), list(list(makeString("January 21, 2000"), reader_make_constant_shell("Date")), list(list(reader_make_constant_shell("DayFn"), makeInteger(21), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("January"), list(reader_make_constant_shell("YearFn"), makeInteger(2000)))))), list(list(makeString("January 21, 2000"), reader_make_constant_shell("Thing")), list(list(reader_make_constant_shell("DayFn"), makeInteger(21), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("January"), list(reader_make_constant_shell("YearFn"), makeInteger(2000)))))));

    private static final SubLSymbol STRING_PHRASAL_MEANINGS_WITH_ARGS = makeSymbol("STRING-PHRASAL-MEANINGS-WITH-ARGS");

    private static final SubLList $list133 = list(list(list(makeString("bank"), list(makeSymbol("LIST"), makeKeyword("OUTPUT-SPEC"), list(makeSymbol("NEW-NL-OUTPUT-SPEC"), $SUBL, list(makeSymbol("NEW-NL-INTERPRETATION-SPEC"), list(QUOTE, list($CYCL, T, makeKeyword("INFLECTIONS"), T, makeKeyword("PHRASE-TYPES"), T)))), makeKeyword("SYNTACTIC-RESTRICTION"), list(makeSymbol("LIST"), reader_make_constant_shell("Noun")))), list(list($CYCL, reader_make_constant_shell("BankOrganization"), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell("CountNoun")), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell("singular"))), list($CYCL, reader_make_constant_shell("BankingTurn"), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell("CountNoun")), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell("singular"))), list($CYCL, reader_make_constant_shell("Bank-Topographical"), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell("CountNoun")), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell("singular"))))), list(list(makeString("bank"), list(makeSymbol("LIST"), makeKeyword("OUTPUT-SPEC"), list(makeSymbol("NEW-NL-OUTPUT-SPEC"), $SUBL, list(makeSymbol("NEW-NL-INTERPRETATION-SPEC"), list(QUOTE, list($CYCL, T, makeKeyword("INFLECTIONS"), T, makeKeyword("PHRASE-TYPES"), T)))))), list(list($CYCL, reader_make_constant_shell("MakingABankDeposit"), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell("Verb")), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell("infinitive"), reader_make_constant_shell("pluralVerb-Present"), reader_make_constant_shell("firstPersonSg-Present"), reader_make_constant_shell("secondPersonSg-Present"))), list($CYCL, reader_make_constant_shell("BankingTurn"), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell("Verb")), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell("infinitive"), reader_make_constant_shell("pluralVerb-Present"), reader_make_constant_shell("firstPersonSg-Present"), reader_make_constant_shell("secondPersonSg-Present"))), list($CYCL, reader_make_constant_shell("BankOrganization"), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell("CountNoun")), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell("singular"))), list($CYCL, reader_make_constant_shell("BankingTurn"), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell("CountNoun")), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell("singular"))), list($CYCL, reader_make_constant_shell("Bank-Topographical"), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell("CountNoun")), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell("singular"))))));

    private static final SubLSymbol STRING_PHRASAL_MEANINGS_WITH_ARGS_NON_WORKING_CASES = makeSymbol("STRING-PHRASAL-MEANINGS-WITH-ARGS-NON-WORKING-CASES");

    private static final SubLList $list135 = list(list(list(makeString("bank"), list(makeSymbol("LIST"), makeKeyword("OUTPUT-SPEC"), list(makeSymbol("NEW-NL-OUTPUT-SPEC"), $SUBL, list(makeSymbol("NEW-NL-INTERPRETATION-SPEC"), list(QUOTE, list($CYCL, T, makeKeyword("INFLECTIONS"), T, makeKeyword("PHRASE-TYPES"), T)))), makeKeyword("FILTER"), list(makeSymbol("NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC"), reader_make_constant_shell("Organization")))), list(list($CYCL, reader_make_constant_shell("BankOrganization"), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell("CountNoun")), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell("singular"))))), list(list(makeString("bank"), list(makeSymbol("LIST"), makeKeyword("OUTPUT-SPEC"), list(makeSymbol("NEW-NL-OUTPUT-SPEC"), makeKeyword("XML"), list(makeSymbol("NEW-NL-INTERPRETATION-SPEC"), list(QUOTE, list($CYCL, T, makeKeyword("INFLECTIONS"), T, makeKeyword("PHRASE-TYPES"), T)))), makeKeyword("FILTER"), list(makeSymbol("NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC"), reader_make_constant_shell("Organization")))), list(makeString("\n<NLInterpretation>\n <Cycl>\n  <CycLConstant>\n    <name>BankOrganization</name>\n    <namespace>cyc</namespace>\n    <guid>bd58ab80-9c29-11b1-9dad-c379636f7270</guid>\n    <uri>urn:uuid:bd58ab80-9c29-11b1-9dad-c379636f7270</uri>\n  </CycLConstant>\n </Cycl>\n <PhraseType>\n  <CycLConstant>\n    <name>CountNoun</name>\n    <namespace>cyc</namespace>\n    <guid>bd588078-9c29-11b1-9dad-c379636f7270</guid>\n    <uri>urn:uuid:bd588078-9c29-11b1-9dad-c379636f7270</uri>\n  </CycLConstant>\n </PhraseType>\n <HeadInflections>\n  <CycLConstant>\n    <name>singular</name>\n    <namespace>cyc</namespace>\n    <guid>bd6757b8-9c29-11b1-9dad-c379636f7270</guid>\n    <uri>urn:uuid:bd6757b8-9c29-11b1-9dad-c379636f7270</uri>\n  </CycLConstant>\n </HeadInflections>\n</NLInterpretation>"))), list(list(makeString("bank"), list(makeSymbol("LIST"), makeKeyword("OUTPUT-SPEC"), list(makeSymbol("NEW-NL-OUTPUT-SPEC"), makeKeyword("XML"), list(makeSymbol("NEW-NL-INTERPRETATION-SPEC"), list(QUOTE, list($CYCL, T)))), makeKeyword("FILTER"), list(makeSymbol("NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC"), reader_make_constant_shell("Organization")))), list(makeString("\n<NLInterpretation>\n <Cycl>\n  <CycLConstant>\n    <name>BankOrganization</name>\n    <namespace>cyc</namespace>\n    <guid>bd58ab80-9c29-11b1-9dad-c379636f7270</guid>\n    <uri>urn:uuid:bd58ab80-9c29-11b1-9dad-c379636f7270</uri>\n  </CycLConstant>\n </Cycl>\n</NLInterpretation>"))));

    // Definitions
    /**
     *
     */
    public static final SubLObject tag_relations_alt(SubLObject v_document, SubLObject optional_arg_plist) {
        if (optional_arg_plist == UNPROVIDED) {
            optional_arg_plist = NIL;
        }
        optional_arg_plist = list_utilities.augment_plist_with_defaults(optional_arg_plist, list(new SubLObject[]{ $OUTPUT_SPEC, nl_api_datastructures.new_nl_output_spec($SIMPLE, nl_api_datastructures.new_nl_interpretation_spec(UNPROVIDED)), $FILTER, NIL, $SENSE_TAGGER, NIL, $SENTENCE_CYCLIFIER, LINK_CYCLIFIER, $DOMAIN_MT, default_relation_tagging_domain_mt() }));
        {
            SubLObject result_iter = iteration.new_iterator(new_tag_relations_iterator_state(v_document, optional_arg_plist), TAG_RELATIONS_ITERATOR_STATE_DONE_P, TAG_RELATIONS_ITERATOR_STATE_NEXT, UNPROVIDED);
            return result_iter;
        }
    }

    // Definitions
    public static SubLObject tag_relations(final SubLObject v_document, SubLObject optional_arg_plist) {
        if (optional_arg_plist == UNPROVIDED) {
            optional_arg_plist = NIL;
        }
        optional_arg_plist = list_utilities.augment_plist_with_defaults(optional_arg_plist, list(new SubLObject[]{ $OUTPUT_SPEC, nl_api_datastructures.new_nl_output_spec($SIMPLE, nl_api_datastructures.new_nl_interpretation_spec(UNPROVIDED)), $FILTER, NIL, $SENSE_TAGGER, NIL, $SENTENCE_CYCLIFIER, LINK_CYCLIFIER, $DOMAIN_MT, default_relation_tagging_domain_mt() }));
        final SubLObject result_iter = iteration.new_iterator(new_tag_relations_iterator_state(v_document, optional_arg_plist), TAG_RELATIONS_ITERATOR_STATE_DONE_P, TAG_RELATIONS_ITERATOR_STATE_NEXT, UNPROVIDED);
        return result_iter;
    }

    /**
     * Is OBJ an acceptable optionaL-arg-list for TAG-RELATIONS.  To be acceptable, OBJ must be a property-list,
     * and all keys must be elements of the list (:lexicon :sentence-cyclifier :domain-mt :output-spec :filter :sense-tagger :timeout)
     */
    @LispMethod(comment = "Is OBJ an acceptable optionaL-arg-list for TAG-RELATIONS.  To be acceptable, OBJ must be a property-list,\r\nand all keys must be elements of the list (:lexicon :sentence-cyclifier :domain-mt :output-spec :filter :sense-tagger :timeout)\nIs OBJ an acceptable optionaL-arg-list for TAG-RELATIONS.  To be acceptable, OBJ must be a property-list,\nand all keys must be elements of the list (:lexicon :sentence-cyclifier :domain-mt :output-spec :filter :sense-tagger :timeout)")
    public static final SubLObject tag_relations_optional_args_p_alt(SubLObject obj) {
        return list_utilities.plist_restricted_to_indicatorsP(obj, $list_alt11);
    }

    /**
     * Is OBJ an acceptable optionaL-arg-list for TAG-RELATIONS.  To be acceptable, OBJ must be a property-list,
     * and all keys must be elements of the list (:lexicon :sentence-cyclifier :domain-mt :output-spec :filter :sense-tagger :timeout)
     */
    @LispMethod(comment = "Is OBJ an acceptable optionaL-arg-list for TAG-RELATIONS.  To be acceptable, OBJ must be a property-list,\r\nand all keys must be elements of the list (:lexicon :sentence-cyclifier :domain-mt :output-spec :filter :sense-tagger :timeout)\nIs OBJ an acceptable optionaL-arg-list for TAG-RELATIONS.  To be acceptable, OBJ must be a property-list,\nand all keys must be elements of the list (:lexicon :sentence-cyclifier :domain-mt :output-spec :filter :sense-tagger :timeout)")
    public static SubLObject tag_relations_optional_args_p(final SubLObject obj) {
        return list_utilities.plist_restricted_to_indicatorsP(obj, $list11);
    }

    public static final SubLObject tag_relations_iterator_state_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject tag_relations_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject tag_relations_iterator_state_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.nl_parsing_api.$tag_relations_iterator_state_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject tag_relations_iterator_state_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.nl_parsing_api.$tag_relations_iterator_state_native.class ? T : NIL;
    }

    public static final SubLObject tag_relations_iterator_state_sentence_iterator_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TAG_RELATIONS_ITERATOR_STATE_P);
        return v_object.getField2();
    }

    public static SubLObject tag_relations_iterator_state_sentence_iterator(final SubLObject v_object) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "! nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "nl_parsing_api.tag_relations_iterator_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject tag_relations_iterator_state_sentence_cyclifier_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TAG_RELATIONS_ITERATOR_STATE_P);
        return v_object.getField3();
    }

    public static SubLObject tag_relations_iterator_state_sentence_cyclifier(final SubLObject v_object) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "! nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "nl_parsing_api.tag_relations_iterator_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject tag_relations_iterator_state_document_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TAG_RELATIONS_ITERATOR_STATE_P);
        return v_object.getField4();
    }

    public static SubLObject tag_relations_iterator_state_document(final SubLObject v_object) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "! nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "nl_parsing_api.tag_relations_iterator_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject tag_relations_iterator_state_lexicon_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TAG_RELATIONS_ITERATOR_STATE_P);
        return v_object.getField5();
    }

    public static SubLObject tag_relations_iterator_state_lexicon(final SubLObject v_object) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "! nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "nl_parsing_api.tag_relations_iterator_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject tag_relations_iterator_state_sense_tagger_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TAG_RELATIONS_ITERATOR_STATE_P);
        return v_object.getField6();
    }

    public static SubLObject tag_relations_iterator_state_sense_tagger(final SubLObject v_object) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "! nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "nl_parsing_api.tag_relations_iterator_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject tag_relations_iterator_state_timeout_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TAG_RELATIONS_ITERATOR_STATE_P);
        return v_object.getField7();
    }

    public static SubLObject tag_relations_iterator_state_timeout(final SubLObject v_object) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "! nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "nl_parsing_api.tag_relations_iterator_state_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject tag_relations_iterator_state_domain_mt_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TAG_RELATIONS_ITERATOR_STATE_P);
        return v_object.getField8();
    }

    public static SubLObject tag_relations_iterator_state_domain_mt(final SubLObject v_object) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "! nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "nl_parsing_api.tag_relations_iterator_state_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject tag_relations_iterator_state_output_spec_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TAG_RELATIONS_ITERATOR_STATE_P);
        return v_object.getField9();
    }

    public static SubLObject tag_relations_iterator_state_output_spec(final SubLObject v_object) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "! nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "nl_parsing_api.tag_relations_iterator_state_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject tag_relations_iterator_state_filter_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TAG_RELATIONS_ITERATOR_STATE_P);
        return v_object.getField10();
    }

    public static SubLObject tag_relations_iterator_state_filter(final SubLObject v_object) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "! nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "nl_parsing_api.tag_relations_iterator_state_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject tag_relations_iterator_state_prepared_sentence_output_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TAG_RELATIONS_ITERATOR_STATE_P);
        return v_object.getField11();
    }

    public static SubLObject tag_relations_iterator_state_prepared_sentence_output(final SubLObject v_object) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "! nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "nl_parsing_api.tag_relations_iterator_state_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject _csetf_tag_relations_iterator_state_sentence_iterator_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TAG_RELATIONS_ITERATOR_STATE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_tag_relations_iterator_state_sentence_iterator(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "! nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "nl_parsing_api.tag_relations_iterator_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_tag_relations_iterator_state_sentence_cyclifier_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TAG_RELATIONS_ITERATOR_STATE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_tag_relations_iterator_state_sentence_cyclifier(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "! nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "nl_parsing_api.tag_relations_iterator_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_tag_relations_iterator_state_document_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TAG_RELATIONS_ITERATOR_STATE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_tag_relations_iterator_state_document(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "! nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "nl_parsing_api.tag_relations_iterator_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_tag_relations_iterator_state_lexicon_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TAG_RELATIONS_ITERATOR_STATE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_tag_relations_iterator_state_lexicon(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "! nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "nl_parsing_api.tag_relations_iterator_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_tag_relations_iterator_state_sense_tagger_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TAG_RELATIONS_ITERATOR_STATE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_tag_relations_iterator_state_sense_tagger(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "! nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "nl_parsing_api.tag_relations_iterator_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_tag_relations_iterator_state_timeout_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TAG_RELATIONS_ITERATOR_STATE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_tag_relations_iterator_state_timeout(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "! nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "nl_parsing_api.tag_relations_iterator_state_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_tag_relations_iterator_state_domain_mt_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TAG_RELATIONS_ITERATOR_STATE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_tag_relations_iterator_state_domain_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "! nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "nl_parsing_api.tag_relations_iterator_state_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_tag_relations_iterator_state_output_spec_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TAG_RELATIONS_ITERATOR_STATE_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_tag_relations_iterator_state_output_spec(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "! nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "nl_parsing_api.tag_relations_iterator_state_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_tag_relations_iterator_state_filter_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TAG_RELATIONS_ITERATOR_STATE_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_tag_relations_iterator_state_filter(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "! nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "nl_parsing_api.tag_relations_iterator_state_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_tag_relations_iterator_state_prepared_sentence_output_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TAG_RELATIONS_ITERATOR_STATE_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_tag_relations_iterator_state_prepared_sentence_output(final SubLObject v_object, final SubLObject value) {
        assert NIL != tag_relations_iterator_state_p(v_object) : "! nl_parsing_api.tag_relations_iterator_state_p(v_object) " + "nl_parsing_api.tag_relations_iterator_state_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject make_tag_relations_iterator_state_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.nl_parsing_api.$tag_relations_iterator_state_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($SENTENCE_ITERATOR)) {
                        _csetf_tag_relations_iterator_state_sentence_iterator(v_new, current_value);
                    } else {
                        if (pcase_var.eql($SENTENCE_CYCLIFIER)) {
                            _csetf_tag_relations_iterator_state_sentence_cyclifier(v_new, current_value);
                        } else {
                            if (pcase_var.eql($DOCUMENT)) {
                                _csetf_tag_relations_iterator_state_document(v_new, current_value);
                            } else {
                                if (pcase_var.eql($LEXICON)) {
                                    _csetf_tag_relations_iterator_state_lexicon(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($SENSE_TAGGER)) {
                                        _csetf_tag_relations_iterator_state_sense_tagger(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($TIMEOUT)) {
                                            _csetf_tag_relations_iterator_state_timeout(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($DOMAIN_MT)) {
                                                _csetf_tag_relations_iterator_state_domain_mt(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($OUTPUT_SPEC)) {
                                                    _csetf_tag_relations_iterator_state_output_spec(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($FILTER)) {
                                                        _csetf_tag_relations_iterator_state_filter(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($PREPARED_SENTENCE_OUTPUT)) {
                                                            _csetf_tag_relations_iterator_state_prepared_sentence_output(v_new, current_value);
                                                        } else {
                                                            Errors.error($str_alt45$Invalid_slot__S_for_construction_, current_arg);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_tag_relations_iterator_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.nl_parsing_api.$tag_relations_iterator_state_native();
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

    public static final SubLObject new_tag_relations_iterator_state_alt(SubLObject v_document, SubLObject optional_arg_plist) {
        {
            SubLObject iter = make_tag_relations_iterator_state(UNPROVIDED);
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

    public static final SubLObject tag_relations_iterator_state_done_p_alt(SubLObject state) {
        return makeBoolean((NIL != iteration.iteration_done(tag_relations_iterator_state_sentence_iterator(state))) && (NIL == tag_relations_iterator_state_prepared_sentence_output(state)));
    }

    public static SubLObject tag_relations_iterator_state_done_p(final SubLObject state) {
        return makeBoolean((NIL != iteration.iteration_done(tag_relations_iterator_state_sentence_iterator(state))) && (NIL == tag_relations_iterator_state_prepared_sentence_output(state)));
    }

    /**
     *
     *
     * @unknown iterator-p; an iterator for the interpretations of the next sentence
     * @unknown iterator-state
     */
    @LispMethod(comment = "@unknown iterator-p; an iterator for the interpretations of the next sentence\r\n@unknown iterator-state")
    public static final SubLObject tag_relations_iterator_state_next_alt(SubLObject state) {
        {
            SubLObject result = NIL;
            if (NIL != tag_relations_iterator_state_prepared_sentence_output(state)) {
                result = tag_relations_iterator_state_prepared_sentence_output(state).first();
                _csetf_tag_relations_iterator_state_prepared_sentence_output(state, tag_relations_iterator_state_prepared_sentence_output(state).rest());
                return values(result, state, NIL);
            }
            if (NIL != iteration.iteration_done(tag_relations_iterator_state_sentence_iterator(state))) {
                return values(NIL, state, T);
            }
            {
                SubLObject sentence = iteration.iteration_next(tag_relations_iterator_state_sentence_iterator(state));
                SubLObject lexicon = tag_relations_iterator_state_lexicon(state);
                SubLObject filter = tag_relations_iterator_state_filter(state);
                SubLObject output_spec = tag_relations_iterator_state_output_spec(state);
                SubLObject learned_entities = methods.funcall_instance_method_with_1_args(lexicon, LEARN, document.sentence_string(sentence));
                SubLObject v_cyclifier = tag_relations_iterator_state_sentence_cyclifier(state);
                SubLObject discourse = NIL;
                SubLObject domain_mt = tag_relations_iterator_state_domain_mt(state);
                SubLObject timeout = tag_relations_iterator_state_timeout(state);
                SubLObject sentence_result = funcall(v_cyclifier, sentence, lexicon, output_spec, domain_mt, timeout, discourse);
                _csetf_tag_relations_iterator_state_prepared_sentence_output(state, cons(sentence_result, tag_relations_iterator_state_prepared_sentence_output(state)));
                result = tag_relations_iterator_state_prepared_sentence_output(state).first();
                _csetf_tag_relations_iterator_state_prepared_sentence_output(state, tag_relations_iterator_state_prepared_sentence_output(state).rest());
            }
            return values(result, state, NIL);
        }
    }

    /**
     *
     *
     * @unknown iterator-p; an iterator for the interpretations of the next sentence
     * @unknown iterator-state
     */
    @LispMethod(comment = "@unknown iterator-p; an iterator for the interpretations of the next sentence\r\n@unknown iterator-state")
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

    public static final SubLObject sentence_cyclifier_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_sentence_cyclifier(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sentence_cyclifier_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_sentence_cyclifier(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject sentence_cyclifier_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.nl_parsing_api.$sentence_cyclifier_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject sentence_cyclifier_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.nl_parsing_api.$sentence_cyclifier_native.class ? T : NIL;
    }

    public static final SubLObject sentence_cyclifier_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SENTENCE_CYCLIFIER_P);
        return v_object.getField2();
    }

    public static SubLObject sentence_cyclifier_name(final SubLObject v_object) {
        assert NIL != sentence_cyclifier_p(v_object) : "! nl_parsing_api.sentence_cyclifier_p(v_object) " + "nl_parsing_api.sentence_cyclifier_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject sentence_cyclifier_cyclify_method_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SENTENCE_CYCLIFIER_P);
        return v_object.getField3();
    }

    public static SubLObject sentence_cyclifier_cyclify_method(final SubLObject v_object) {
        assert NIL != sentence_cyclifier_p(v_object) : "! nl_parsing_api.sentence_cyclifier_p(v_object) " + "nl_parsing_api.sentence_cyclifier_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject sentence_cyclifier_lexicon_method_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SENTENCE_CYCLIFIER_P);
        return v_object.getField4();
    }

    public static SubLObject sentence_cyclifier_lexicon_method(final SubLObject v_object) {
        assert NIL != sentence_cyclifier_p(v_object) : "! nl_parsing_api.sentence_cyclifier_p(v_object) " + "nl_parsing_api.sentence_cyclifier_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_sentence_cyclifier_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SENTENCE_CYCLIFIER_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sentence_cyclifier_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != sentence_cyclifier_p(v_object) : "! nl_parsing_api.sentence_cyclifier_p(v_object) " + "nl_parsing_api.sentence_cyclifier_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_sentence_cyclifier_cyclify_method_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SENTENCE_CYCLIFIER_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sentence_cyclifier_cyclify_method(final SubLObject v_object, final SubLObject value) {
        assert NIL != sentence_cyclifier_p(v_object) : "! nl_parsing_api.sentence_cyclifier_p(v_object) " + "nl_parsing_api.sentence_cyclifier_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_sentence_cyclifier_lexicon_method_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SENTENCE_CYCLIFIER_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sentence_cyclifier_lexicon_method(final SubLObject v_object, final SubLObject value) {
        assert NIL != sentence_cyclifier_p(v_object) : "! nl_parsing_api.sentence_cyclifier_p(v_object) " + "nl_parsing_api.sentence_cyclifier_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_sentence_cyclifier_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.nl_parsing_api.$sentence_cyclifier_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NAME)) {
                        _csetf_sentence_cyclifier_name(v_new, current_value);
                    } else {
                        if (pcase_var.eql($CYCLIFY_METHOD)) {
                            _csetf_sentence_cyclifier_cyclify_method(v_new, current_value);
                        } else {
                            if (pcase_var.eql($LEXICON_METHOD)) {
                                _csetf_sentence_cyclifier_lexicon_method(v_new, current_value);
                            } else {
                                Errors.error($str_alt45$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_sentence_cyclifier(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.nl_parsing_api.$sentence_cyclifier_native();
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

    public static final SubLObject print_sentence_cyclifier_alt(SubLObject v_cyclifier, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str_alt64$__Cyclifier___A_, sentence_cyclifier_name(v_cyclifier));
        return v_cyclifier;
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

    public static final SubLObject declare_sentence_cyclifier_alt(SubLObject cyclifier_name, SubLObject cyclify_method, SubLObject lexicon_method) {
        if (lexicon_method == UNPROVIDED) {
            lexicon_method = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_cyclifier = make_sentence_cyclifier(UNPROVIDED);
                _csetf_sentence_cyclifier_name(v_cyclifier, cyclifier_name);
                _csetf_sentence_cyclifier_cyclify_method(v_cyclifier, cyclify_method);
                _csetf_sentence_cyclifier_lexicon_method(v_cyclifier, lexicon_method);
                dictionary.dictionary_enter($sentence_cyclifiers$.getDynamicValue(thread), cyclifier_name, v_cyclifier);
                return v_cyclifier;
            }
        }
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

    public static final SubLObject sentence_cyclifier_get_cyclify_method_alt(SubLObject cyclifier_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_cyclifier = dictionary.dictionary_lookup($sentence_cyclifiers$.getDynamicValue(thread), cyclifier_name, UNPROVIDED);
                if (NIL == v_cyclifier) {
                    Errors.error($str_alt65$_S_is_not_a_registered_cyclifier_, cyclifier_name);
                }
                return sentence_cyclifier_cyclify_method(v_cyclifier);
            }
        }
    }

    public static SubLObject sentence_cyclifier_get_cyclify_method(final SubLObject cyclifier_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_cyclifier = dictionary.dictionary_lookup($sentence_cyclifiers$.getDynamicValue(thread), cyclifier_name, UNPROVIDED);
        if (NIL == v_cyclifier) {
            Errors.error($str74$_S_is_not_a_registered_cyclifier_, cyclifier_name);
        }
        return sentence_cyclifier_cyclify_method(v_cyclifier);
    }

    public static final SubLObject sentence_cyclifier_get_lexicon_method_alt(SubLObject cyclifier_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_cyclifier = dictionary.dictionary_lookup($sentence_cyclifiers$.getDynamicValue(thread), cyclifier_name, UNPROVIDED);
                if (NIL == v_cyclifier) {
                    Errors.error($str_alt65$_S_is_not_a_registered_cyclifier_, cyclifier_name);
                }
                return sentence_cyclifier_lexicon_method(v_cyclifier);
            }
        }
    }

    public static SubLObject sentence_cyclifier_get_lexicon_method(final SubLObject cyclifier_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_cyclifier = dictionary.dictionary_lookup($sentence_cyclifiers$.getDynamicValue(thread), cyclifier_name, UNPROVIDED);
        if (NIL == v_cyclifier) {
            Errors.error($str74$_S_is_not_a_registered_cyclifier_, cyclifier_name);
        }
        return sentence_cyclifier_lexicon_method(v_cyclifier);
    }

    public static final SubLObject default_lexicon_for_sentence_cyclifier_alt(SubLObject cyclifier_name) {
        return funcall(sentence_cyclifier_get_lexicon_method(cyclifier_name));
    }

    public static SubLObject default_lexicon_for_sentence_cyclifier(final SubLObject cyclifier_name) {
        return funcall(sentence_cyclifier_get_lexicon_method(cyclifier_name));
    }

    public static final SubLObject default_relation_tagging_domain_mt_alt() {
        return NIL;
    }

    public static SubLObject default_relation_tagging_domain_mt() {
        return NIL;
    }

    public static final SubLObject ebmt_cyclifier_alt(SubLObject sentence, SubLObject lexicon, SubLObject output_spec, SubLObject domain_mt, SubLObject timeout, SubLObject discourse) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject string = document.sentence_string(sentence);
                SubLObject nl_interps = NIL;
                if (NIL == string_utilities.substringP($str_alt66$_, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return iteration.new_list_iterator(nl_interps);
                }
                thread.resetMultipleValues();
                {
                    SubLObject cycls = ebmt_template_parser.ebmt_parse(string, lexicon, domain_mt);
                    SubLObject justs = thread.secondMultipleValue();
                    SubLObject weights = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject cycl = NIL;
                        SubLObject cycl_1 = NIL;
                        SubLObject just = NIL;
                        SubLObject just_2 = NIL;
                        SubLObject weight = NIL;
                        SubLObject weight_3 = NIL;
                        for (cycl = cycls, cycl_1 = cycl.first(), just = justs, just_2 = just.first(), weight = weights, weight_3 = weight.first(); !(((NIL == weight) && (NIL == just)) && (NIL == cycl)); cycl = cycl.rest() , cycl_1 = cycl.first() , just = just.rest() , just_2 = just.first() , weight = weight.rest() , weight_3 = weight.first()) {
                            {
                                SubLObject interp = nl_api_datastructures.new_nl_interpretation(list($CYCL, cycl_1, $WEIGHT, weight_3, $JUSTIFICATION, just_2));
                                nl_interps = cons(interp, nl_interps);
                            }
                        }
                    }
                }
                return iteration.new_list_iterator(nl_interps);
            }
        }
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

    public static final SubLObject stanford_cyclifier_alt(SubLObject sentence, SubLObject lexicon, SubLObject output_spec, SubLObject domain_mt, SubLObject timeout, SubLObject discourse) {
        {
            SubLObject string = document.sentence_string(sentence);
            SubLObject v_parser = parser.new_stanford_parser(UNPROVIDED, UNPROVIDED);
            SubLObject v_properties = list($PARSER, v_parser);
            if (NIL != lexicon) {
                v_properties = putf(v_properties, $LEXICON, lexicon);
            }
            return new_api_cyclifier(string, output_spec, v_properties);
        }
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

    public static final SubLObject link_cyclifier_alt(SubLObject sentence, SubLObject lexicon, SubLObject output_spec, SubLObject domain_mt, SubLObject timeout, SubLObject discourse) {
        {
            SubLObject string = document.sentence_string(sentence);
            SubLObject v_parser = parser.new_link_parser(UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject v_properties = list($PARSER, v_parser);
            if (NIL != lexicon) {
                v_properties = putf(v_properties, $LEXICON, lexicon);
            }
            return new_api_cyclifier(string, output_spec, v_properties);
        }
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

    public static final SubLObject new_api_cyclifier_alt(SubLObject english, SubLObject output_spec, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        {
            SubLObject cyclifier_iter = cyclifier.new_cyclifier(english, v_properties);
            return iteration.new_iterator(api_cyclifier_iterator_state(cyclifier_iter, output_spec), $sym75$API_CYCLIFIER_DONE_, API_CYCLIFIER_GET_NEXT, UNPROVIDED);
        }
    }

    public static SubLObject new_api_cyclifier(final SubLObject english, final SubLObject output_spec, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        final SubLObject cyclifier_iter = cyclifier.new_cyclifier(english, v_properties);
        return iteration.new_iterator(api_cyclifier_iterator_state(cyclifier_iter, output_spec), $sym84$API_CYCLIFIER_DONE_, API_CYCLIFIER_GET_NEXT, UNPROVIDED);
    }

    public static final SubLObject api_cyclifier_iterator_state_alt(SubLObject v_cyclifier, SubLObject output_spec) {
        {
            SubLObject iter = list($CYCLIFIER, v_cyclifier, $OUTPUT_SPEC, output_spec);
            return iter;
        }
    }

    public static SubLObject api_cyclifier_iterator_state(final SubLObject v_cyclifier, final SubLObject output_spec) {
        final SubLObject iter = list($CYCLIFIER, v_cyclifier, $OUTPUT_SPEC, output_spec);
        return iter;
    }

    public static final SubLObject api_cyclifier_doneP_alt(SubLObject iterator_state) {
        {
            SubLObject v_cyclifier = getf(iterator_state, $CYCLIFIER, UNPROVIDED);
            return values(makeBoolean(NIL == methods.funcall_instance_method_with_0_args(v_cyclifier, $sym78$HAS_NEXT_)), iterator_state, NIL);
        }
    }

    public static SubLObject api_cyclifier_doneP(final SubLObject iterator_state) {
        final SubLObject v_cyclifier = getf(iterator_state, $CYCLIFIER, UNPROVIDED);
        return values(makeBoolean(NIL == methods.funcall_instance_method_with_0_args(v_cyclifier, $sym87$HAS_NEXT_)), iterator_state, NIL);
    }

    public static final SubLObject api_cyclifier_get_next_alt(SubLObject iterator_state) {
        {
            SubLObject v_cyclifier = getf(iterator_state, $CYCLIFIER, UNPROVIDED);
            SubLObject cycl = methods.funcall_instance_method_with_0_args(v_cyclifier, NEXT);
            SubLObject output_spec = getf(iterator_state, $OUTPUT_SPEC, UNPROVIDED);
            return values(nl_api_datastructures.new_nl_interpretation(list($CYCL, cycl)), iterator_state, NIL);
        }
    }

    public static SubLObject api_cyclifier_get_next(final SubLObject iterator_state) {
        final SubLObject v_cyclifier = getf(iterator_state, $CYCLIFIER, UNPROVIDED);
        final SubLObject cycl = methods.funcall_instance_method_with_0_args(v_cyclifier, NEXT);
        final SubLObject output_spec = getf(iterator_state, $OUTPUT_SPEC, UNPROVIDED);
        return values(nl_api_datastructures.new_nl_interpretation(list($CYCL, cycl)), iterator_state, NIL);
    }

    public static final SubLObject tag_directory_relations_alt(SubLObject directory) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(directory, DIRECTORY_P);
            {
                SubLObject directory_contents_var = Filesys.directory(directory, T);
                SubLObject progress_message_var = NIL;
                {
                    SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
                    try {
                        $silent_progressP$.bind(makeBoolean(!progress_message_var.isString()), thread);
                        {
                            SubLObject list_var = directory_contents_var;
                            $progress_note$.setDynamicValue(progress_message_var, thread);
                            $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                            $progress_total$.setDynamicValue(length(list_var), thread);
                            $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                            {
                                SubLObject _prev_bind_0_4 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                    {
                                        SubLObject csome_list_var = list_var;
                                        SubLObject file = NIL;
                                        for (file = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , file = csome_list_var.first()) {
                                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                            if (NIL == Filesys.directory_p(file)) {
                                                tag_relations_from_file(file);
                                            }
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0_4, thread);
                                }
                            }
                        }
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject tag_directory_relations(final SubLObject directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Filesys.directory_p(directory) : "! Filesys.directory_p(directory) " + ("Filesys.directory_p(directory) " + "CommonSymbols.NIL != Filesys.directory_p(directory) ") + directory;
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

    public static final SubLObject tag_relations_from_files_alt(SubLObject file_list) {
        {
            SubLObject cdolist_list_var = file_list;
            SubLObject file = NIL;
            for (file = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , file = cdolist_list_var.first()) {
                if (!((NIL != Filesys.directory_p(file)) && (NIL != string_utilities.substringP($$$table, file, UNPROVIDED, UNPROVIDED, UNPROVIDED)))) {
                    tag_relations_from_file(file);
                }
            }
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

    public static final SubLObject tag_relations_from_file_alt(SubLObject file) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doc = document.new_document_from_file(file, UNPROVIDED);
                SubLObject iter = tag_relations(doc, $list_alt82);
                SubLObject sentence_count = ZERO_INTEGER;
                SubLObject done_var = NIL;
                while (NIL == done_var) {
                    thread.resetMultipleValues();
                    {
                        SubLObject sentence = iteration.iteration_next(iter);
                        SubLObject valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            if (sentence_count.numG(TEN_INTEGER)) {
                                return file;
                            }
                            sentence_count = add(sentence_count, ONE_INTEGER);
                            {
                                SubLObject done_var_5 = NIL;
                                while (NIL == done_var_5) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject cycl = iteration.iteration_next(sentence);
                                        SubLObject valid_6 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        if (NIL != valid_6) {
                                            format(T, $str_alt83$CycL___S__, cycl);
                                        }
                                        done_var_5 = makeBoolean(NIL == valid_6);
                                    }
                                } 
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                } 
            }
            return file;
        }
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

    public static final SubLObject sentencifications_from_file_alt(SubLObject file, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject doc = document.new_document_from_file(file, UNPROVIDED);
                SubLObject sentences = document.new_sentence_iterator(doc);
                SubLObject done_var = NIL;
                while (NIL == done_var) {
                    thread.resetMultipleValues();
                    {
                        SubLObject sentence = iteration.iteration_next(sentences);
                        SubLObject valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            princ(document.sentence_string(sentence), stream);
                            terpri(stream);
                            terpri(stream);
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                } 
                return NIL;
            }
        }
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

    /**
     *
     *
     * @param STRING
     * 		stringp; a string for which interpretations are desired
     * @param OPTIONAL-ARG-PLIST
    phrasal-meanings-optional-args-p
     * 		
     * @return LISTP of nl-interpretation-p's for STRING
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstringp; a string for which interpretations are desired\r\n@param OPTIONAL-ARG-PLIST\nphrasal-meanings-optional-args-p\r\n\t\t\r\n@return LISTP of nl-interpretation-p\'s for STRING")
    public static final SubLObject string_phrasal_meanings_alt(SubLObject string, SubLObject optional_arg_plist) {
        if (optional_arg_plist == UNPROVIDED) {
            optional_arg_plist = NIL;
        }
        SubLTrampolineFile.checkType(string, STRINGP);
        SubLTrampolineFile.checkType(optional_arg_plist, PHRASAL_MEANINGS_OPTIONAL_ARGS_P);
        return iteration.iterator_value_list(string_phrasal_meanings_iterator(string, optional_arg_plist));
    }

    /**
     *
     *
     * @param STRING
     * 		stringp; a string for which interpretations are desired
     * @param OPTIONAL-ARG-PLIST
    phrasal-meanings-optional-args-p
     * 		
     * @return LISTP of nl-interpretation-p's for STRING
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstringp; a string for which interpretations are desired\r\n@param OPTIONAL-ARG-PLIST\nphrasal-meanings-optional-args-p\r\n\t\t\r\n@return LISTP of nl-interpretation-p\'s for STRING")
    public static SubLObject string_phrasal_meanings(final SubLObject string, SubLObject optional_arg_plist) {
        if (optional_arg_plist == UNPROVIDED) {
            optional_arg_plist = NIL;
        }
        SubLTrampolineFile.enforceType(string, STRINGP);
        SubLTrampolineFile.enforceType(optional_arg_plist, PHRASAL_MEANINGS_OPTIONAL_ARGS_P);
        return iteration.iterator_value_list(string_phrasal_meanings_iterator(string, optional_arg_plist));
    }

    /**
     *
     *
     * @param STRING
     * 		stringp; a string for which interpretations are desired
     * @param OPTIONAL-ARG-PLIST
    phrasal-meanings-optional-args-p
     * 		
     * @return ITERATOR-P of nl-interpretation-p's for PHRASE
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstringp; a string for which interpretations are desired\r\n@param OPTIONAL-ARG-PLIST\nphrasal-meanings-optional-args-p\r\n\t\t\r\n@return ITERATOR-P of nl-interpretation-p\'s for PHRASE")
    public static final SubLObject string_phrasal_meanings_iterator_alt(SubLObject string, SubLObject optional_arg_plist) {
        if (optional_arg_plist == UNPROVIDED) {
            optional_arg_plist = NIL;
        }
        SubLTrampolineFile.checkType(string, STRINGP);
        SubLTrampolineFile.checkType(optional_arg_plist, PHRASAL_MEANINGS_OPTIONAL_ARGS_P);
        return phrasal_meanings_iterator(document.new_phrase(list($STRING, string)), optional_arg_plist);
    }

    /**
     *
     *
     * @param STRING
     * 		stringp; a string for which interpretations are desired
     * @param OPTIONAL-ARG-PLIST
    phrasal-meanings-optional-args-p
     * 		
     * @return ITERATOR-P of nl-interpretation-p's for PHRASE
     */
    @LispMethod(comment = "@param STRING\r\n\t\tstringp; a string for which interpretations are desired\r\n@param OPTIONAL-ARG-PLIST\nphrasal-meanings-optional-args-p\r\n\t\t\r\n@return ITERATOR-P of nl-interpretation-p\'s for PHRASE")
    public static SubLObject string_phrasal_meanings_iterator(final SubLObject string, SubLObject optional_arg_plist) {
        if (optional_arg_plist == UNPROVIDED) {
            optional_arg_plist = NIL;
        }
        SubLTrampolineFile.enforceType(string, STRINGP);
        SubLTrampolineFile.enforceType(optional_arg_plist, PHRASAL_MEANINGS_OPTIONAL_ARGS_P);
        return phrasal_meanings_iterator(document.new_phrase(list($STRING, string)), optional_arg_plist);
    }

    /**
     *
     *
     * @param PHRASE
     * 		phrase-p; a phrase for which interpretations are desired
     * @param OPTIONAL-ARG-PLIST
    phrasal-meanings-optional-args-p
     * 		
     * @return LISTP of nl-interpretation-p's for PHRASE
     */
    @LispMethod(comment = "@param PHRASE\r\n\t\tphrase-p; a phrase for which interpretations are desired\r\n@param OPTIONAL-ARG-PLIST\nphrasal-meanings-optional-args-p\r\n\t\t\r\n@return LISTP of nl-interpretation-p\'s for PHRASE")
    public static final SubLObject phrasal_meanings_alt(SubLObject phrase, SubLObject optional_arg_plist) {
        if (optional_arg_plist == UNPROVIDED) {
            optional_arg_plist = NIL;
        }
        SubLTrampolineFile.checkType(phrase, PHRASE_P);
        SubLTrampolineFile.checkType(optional_arg_plist, PHRASAL_MEANINGS_OPTIONAL_ARGS_P);
        return iteration.iterator_value_list(phrasal_meanings_iterator(phrase, optional_arg_plist));
    }

    /**
     *
     *
     * @param PHRASE
     * 		phrase-p; a phrase for which interpretations are desired
     * @param OPTIONAL-ARG-PLIST
    phrasal-meanings-optional-args-p
     * 		
     * @return LISTP of nl-interpretation-p's for PHRASE
     */
    @LispMethod(comment = "@param PHRASE\r\n\t\tphrase-p; a phrase for which interpretations are desired\r\n@param OPTIONAL-ARG-PLIST\nphrasal-meanings-optional-args-p\r\n\t\t\r\n@return LISTP of nl-interpretation-p\'s for PHRASE")
    public static SubLObject phrasal_meanings(final SubLObject phrase, SubLObject optional_arg_plist) {
        if (optional_arg_plist == UNPROVIDED) {
            optional_arg_plist = NIL;
        }
        SubLTrampolineFile.enforceType(phrase, PHRASE_P);
        SubLTrampolineFile.enforceType(optional_arg_plist, PHRASAL_MEANINGS_OPTIONAL_ARGS_P);
        return iteration.iterator_value_list(phrasal_meanings_iterator(phrase, optional_arg_plist));
    }

    /**
     *
     *
     * @param PHRASE
     * 		phrase-p; a phrase-p for which interpretations are desired
     * @param OPTIONAL-ARG-PLIST
    phrasal-meanings-optional-args-p
     * 		
     * @return ITERATOR-P of nl-interpretation-p's for PHRASE
     */
    @LispMethod(comment = "@param PHRASE\r\n\t\tphrase-p; a phrase-p for which interpretations are desired\r\n@param OPTIONAL-ARG-PLIST\nphrasal-meanings-optional-args-p\r\n\t\t\r\n@return ITERATOR-P of nl-interpretation-p\'s for PHRASE")
    public static final SubLObject phrasal_meanings_iterator_alt(SubLObject phrase, SubLObject optional_arg_plist) {
        if (optional_arg_plist == UNPROVIDED) {
            optional_arg_plist = NIL;
        }
        SubLTrampolineFile.checkType(phrase, PHRASE_P);
        SubLTrampolineFile.checkType(optional_arg_plist, PHRASAL_MEANINGS_OPTIONAL_ARGS_P);
        optional_arg_plist = list_utilities.augment_plist_with_defaults(optional_arg_plist, listS($OUTPUT_SPEC, new SubLObject[]{ nl_api_datastructures.new_nl_output_spec($SUBL, nl_api_datastructures.new_nl_interpretation_spec(UNPROVIDED)), $LEARNERS, $list_alt94, $FILTER, NIL, $SYNTACTIC_RESTRICTION, NIL, $PHRASE_CYCLIFIER, LEXICAL_PHRASE_CYCLIFIER, $LEXICON, term_lexicon.new_case_sensitivity_preferred_term_lexicon(), $DOMAIN_MT, default_relation_tagging_domain_mt(), $list_alt98 }));
        return iteration.new_list_iterator(funcall(getf(optional_arg_plist, $PHRASE_CYCLIFIER, UNPROVIDED), phrase, optional_arg_plist));
    }

    /**
     *
     *
     * @param PHRASE
     * 		phrase-p; a phrase-p for which interpretations are desired
     * @param OPTIONAL-ARG-PLIST
    phrasal-meanings-optional-args-p
     * 		
     * @return ITERATOR-P of nl-interpretation-p's for PHRASE
     */
    @LispMethod(comment = "@param PHRASE\r\n\t\tphrase-p; a phrase-p for which interpretations are desired\r\n@param OPTIONAL-ARG-PLIST\nphrasal-meanings-optional-args-p\r\n\t\t\r\n@return ITERATOR-P of nl-interpretation-p\'s for PHRASE")
    public static SubLObject phrasal_meanings_iterator(final SubLObject phrase, SubLObject optional_arg_plist) {
        if (optional_arg_plist == UNPROVIDED) {
            optional_arg_plist = NIL;
        }
        SubLTrampolineFile.enforceType(phrase, PHRASE_P);
        SubLTrampolineFile.enforceType(optional_arg_plist, PHRASAL_MEANINGS_OPTIONAL_ARGS_P);
        optional_arg_plist = list_utilities.augment_plist_with_defaults(optional_arg_plist, listS($OUTPUT_SPEC, new SubLObject[]{ nl_api_datastructures.new_nl_output_spec($SUBL, nl_api_datastructures.new_nl_interpretation_spec(UNPROVIDED)), $LEARNERS, $list104, $FILTER, NIL, $SYNTACTIC_RESTRICTION, NIL, $PHRASE_CYCLIFIER, LEXICAL_PHRASE_CYCLIFIER, $LEXICON, term_lexicon.new_case_sensitivity_preferred_term_lexicon(), $DOMAIN_MT, default_relation_tagging_domain_mt(), $list108 }));
        return iteration.new_list_iterator(funcall(getf(optional_arg_plist, $PHRASE_CYCLIFIER, UNPROVIDED), phrase, optional_arg_plist));
    }

    /**
     * Acceptable arguments are:
     * :output-spec; an instance of NL-OUTPUT-SPEC
     * :learners; a list of SubL symbols that denote lexicon learners (which needs to be fully defined somewhere)
     * :filter; a concept-filter-p
     * :syntactic-restriction; a listp of #$SpeechParts and #$SpeechPartPredicates
     * :phrase-cyclifier; a SubL symbol that corresponds to a phrase cyclifier.  Currently, LEXICAL-PHRASE-CYCLIFIER is used as the default if none is specified
     * :lexicon; the lexicon object to be used by the phrase-cyclifier.  Default to a new instance of TERM-LEXICON
     * :domain-mt; the microtheory used to determine if a concept passes the filter
     * :timeout; an integerp specifying the number of seconds that should be allotted for this parsing call.
     *
     * @param OBJ
     * 		
     * @return booleanp; is OBJ an acceptable optional argument list for PHRASAL-MEANINGS.  In practice, it only
    needs to be PROPERTY-LIST-P, any args that PHRASAL-MEANINGS doesn't know how to use will
    be ignored.
     */
    @LispMethod(comment = "Acceptable arguments are:\r\n:output-spec; an instance of NL-OUTPUT-SPEC\r\n:learners; a list of SubL symbols that denote lexicon learners (which needs to be fully defined somewhere)\r\n:filter; a concept-filter-p\r\n:syntactic-restriction; a listp of #$SpeechParts and #$SpeechPartPredicates\r\n:phrase-cyclifier; a SubL symbol that corresponds to a phrase cyclifier.  Currently, LEXICAL-PHRASE-CYCLIFIER is used as the default if none is specified\r\n:lexicon; the lexicon object to be used by the phrase-cyclifier.  Default to a new instance of TERM-LEXICON\r\n:domain-mt; the microtheory used to determine if a concept passes the filter\r\n:timeout; an integerp specifying the number of seconds that should be allotted for this parsing call.\r\n\r\n@param OBJ\r\n\t\t\r\n@return booleanp; is OBJ an acceptable optional argument list for PHRASAL-MEANINGS.  In practice, it only\r\nneeds to be PROPERTY-LIST-P, any args that PHRASAL-MEANINGS doesn\'t know how to use will\r\nbe ignored.\nAcceptable arguments are:\n:output-spec; an instance of NL-OUTPUT-SPEC\n:learners; a list of SubL symbols that denote lexicon learners (which needs to be fully defined somewhere)\n:filter; a concept-filter-p\n:syntactic-restriction; a listp of #$SpeechParts and #$SpeechPartPredicates\n:phrase-cyclifier; a SubL symbol that corresponds to a phrase cyclifier.  Currently, LEXICAL-PHRASE-CYCLIFIER is used as the default if none is specified\n:lexicon; the lexicon object to be used by the phrase-cyclifier.  Default to a new instance of TERM-LEXICON\n:domain-mt; the microtheory used to determine if a concept passes the filter\n:timeout; an integerp specifying the number of seconds that should be allotted for this parsing call.")
    public static final SubLObject phrasal_meanings_optional_args_p_alt(SubLObject obj) {
        return list_utilities.property_list_p(obj);
    }

    /**
     * Acceptable arguments are:
     * :output-spec; an instance of NL-OUTPUT-SPEC
     * :learners; a list of SubL symbols that denote lexicon learners (which needs to be fully defined somewhere)
     * :filter; a concept-filter-p
     * :syntactic-restriction; a listp of #$SpeechParts and #$SpeechPartPredicates
     * :phrase-cyclifier; a SubL symbol that corresponds to a phrase cyclifier.  Currently, LEXICAL-PHRASE-CYCLIFIER is used as the default if none is specified
     * :lexicon; the lexicon object to be used by the phrase-cyclifier.  Default to a new instance of TERM-LEXICON
     * :domain-mt; the microtheory used to determine if a concept passes the filter
     * :timeout; an integerp specifying the number of seconds that should be allotted for this parsing call.
     *
     * @param OBJ
     * 		
     * @return booleanp; is OBJ an acceptable optional argument list for PHRASAL-MEANINGS.  In practice, it only
    needs to be PROPERTY-LIST-P, any args that PHRASAL-MEANINGS doesn't know how to use will
    be ignored.
     */
    @LispMethod(comment = "Acceptable arguments are:\r\n:output-spec; an instance of NL-OUTPUT-SPEC\r\n:learners; a list of SubL symbols that denote lexicon learners (which needs to be fully defined somewhere)\r\n:filter; a concept-filter-p\r\n:syntactic-restriction; a listp of #$SpeechParts and #$SpeechPartPredicates\r\n:phrase-cyclifier; a SubL symbol that corresponds to a phrase cyclifier.  Currently, LEXICAL-PHRASE-CYCLIFIER is used as the default if none is specified\r\n:lexicon; the lexicon object to be used by the phrase-cyclifier.  Default to a new instance of TERM-LEXICON\r\n:domain-mt; the microtheory used to determine if a concept passes the filter\r\n:timeout; an integerp specifying the number of seconds that should be allotted for this parsing call.\r\n\r\n@param OBJ\r\n\t\t\r\n@return booleanp; is OBJ an acceptable optional argument list for PHRASAL-MEANINGS.  In practice, it only\r\nneeds to be PROPERTY-LIST-P, any args that PHRASAL-MEANINGS doesn\'t know how to use will\r\nbe ignored.\nAcceptable arguments are:\n:output-spec; an instance of NL-OUTPUT-SPEC\n:learners; a list of SubL symbols that denote lexicon learners (which needs to be fully defined somewhere)\n:filter; a concept-filter-p\n:syntactic-restriction; a listp of #$SpeechParts and #$SpeechPartPredicates\n:phrase-cyclifier; a SubL symbol that corresponds to a phrase cyclifier.  Currently, LEXICAL-PHRASE-CYCLIFIER is used as the default if none is specified\n:lexicon; the lexicon object to be used by the phrase-cyclifier.  Default to a new instance of TERM-LEXICON\n:domain-mt; the microtheory used to determine if a concept passes the filter\n:timeout; an integerp specifying the number of seconds that should be allotted for this parsing call.")
    public static SubLObject phrasal_meanings_optional_args_p(final SubLObject obj) {
        return list_utilities.property_list_p(obj);
    }

    public static final SubLObject lexical_phrase_cyclifier_alt(SubLObject phrase, SubLObject optional_arg_plist) {
        {
            SubLObject string = document.phrase_string(phrase);
            SubLObject lex = getf(optional_arg_plist, $LEXICON, UNPROVIDED);
            SubLObject domain_mt = getf(optional_arg_plist, $DOMAIN_MT, UNPROVIDED);
            SubLObject output_spec = getf(optional_arg_plist, $OUTPUT_SPEC, UNPROVIDED);
            SubLObject interp_spec = nl_api_datastructures.output_spec_interp_spec(output_spec);
            SubLObject filter_spec = getf(optional_arg_plist, $FILTER, $DEFAULT);
            SubLObject learners = getf(optional_arg_plist, $LEARNERS, UNPROVIDED);
            SubLObject result_interps = NIL;
            SubLObject final_result = NIL;
            if (NIL != learners) {
                methods.funcall_instance_method_with_2_args(lex, LEARN, document.phrase_string(phrase), learners);
            }
            {
                SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(lex, GET, string);
                SubLObject lex_entry = NIL;
                for (lex_entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lex_entry = cdolist_list_var.first()) {
                    if (NIL != lex_entry_passes_syntactic_restrictionP(lex_entry, getf(optional_arg_plist, $SYNTACTIC_RESTRICTION, UNPROVIDED))) {
                        result_interps = cconcatenate(concept_tagger.concept_tagger_extract_interpretations_from_lex_entry(list(lex_entry), interp_spec, filter_spec), result_interps);
                        if (NIL != nl_api_datastructures.xml_output_spec_p(output_spec)) {
                            final_result = Mapping.mapcar(NL_INTERP_TO_XML, result_interps);
                        } else {
                            final_result = result_interps;
                        }
                    }
                }
            }
            return final_result;
        }
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

    public static final SubLObject lex_entry_passes_syntactic_restrictionP_alt(SubLObject lex_entry, SubLObject restriction) {
        {
            SubLObject allowed_preds = list_utilities.remove_if_not(PREDICATE_P, restriction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject allowed_poses = list_utilities.remove_if_not($sym103$SPEECH_PART_, restriction, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (!((NIL != allowed_preds) || (NIL != allowed_poses))) {
                return T;
            }
            if (NIL != allowed_preds) {
                {
                    SubLObject cdolist_list_var = allowed_preds;
                    SubLObject allowed_pred = NIL;
                    for (allowed_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , allowed_pred = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_7 = cons(methods.funcall_instance_method_with_1_args(lex_entry, GET, $PREDICATE), methods.funcall_instance_method_with_1_args(lex_entry, GET, $INFLECTIONS));
                            SubLObject known_pred = NIL;
                            for (known_pred = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , known_pred = cdolist_list_var_7.first()) {
                                if (NIL != lexicon_accessors.genl_pos_predP(known_pred, allowed_pred, UNPROVIDED)) {
                                    return T;
                                }
                            }
                        }
                    }
                }
            }
            if (NIL != allowed_poses) {
                {
                    SubLObject cdolist_list_var = allowed_poses;
                    SubLObject allowed_pos = NIL;
                    for (allowed_pos = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , allowed_pos = cdolist_list_var.first()) {
                        if (NIL != lexicon_accessors.genl_posP(methods.funcall_instance_method_with_1_args(lex_entry, GET, $CYC_POS), allowed_pos, UNPROVIDED)) {
                            return T;
                        }
                    }
                }
            }
        }
        return NIL;
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

    public static final SubLObject string_phrasal_meanings_test_alt(SubLObject string, SubLObject optional_args) {
        if (optional_args == UNPROVIDED) {
            optional_args = NIL;
        }
        return Mapping.mapcar(GET_NL_INTERP_CYCL, string_phrasal_meanings(string, optional_args));
    }

    public static SubLObject string_phrasal_meanings_test(final SubLObject string, SubLObject optional_args) {
        if (optional_args == UNPROVIDED) {
            optional_args = NIL;
        }
        return Mapping.mapcar(GET_NL_INTERP_CYCL, string_phrasal_meanings(string, optional_args));
    }

    public static final SubLObject string_phrasal_meanings_with_args_alt(SubLObject string, SubLObject optional_args) {
        if (optional_args == UNPROVIDED) {
            optional_args = NIL;
        }
        return string_phrasal_meanings(string, eval(optional_args));
    }

    public static SubLObject string_phrasal_meanings_with_args(final SubLObject string, SubLObject optional_args) {
        if (optional_args == UNPROVIDED) {
            optional_args = NIL;
        }
        return string_phrasal_meanings(string, eval(optional_args));
    }

    public static final SubLObject string_phrasal_meanings_with_args_non_working_cases_alt(SubLObject string, SubLObject optional_args) {
        if (optional_args == UNPROVIDED) {
            optional_args = NIL;
        }
        return string_phrasal_meanings_with_args(string, optional_args);
    }

    public static SubLObject string_phrasal_meanings_with_args_non_working_cases(final SubLObject string, SubLObject optional_args) {
        if (optional_args == UNPROVIDED) {
            optional_args = NIL;
        }
        return string_phrasal_meanings_with_args(string, optional_args);
    }

    public static final SubLObject string_phrasal_meanings_with_adhoc_filter_type_alt(SubLObject string, SubLObject filter_type, SubLObject optional_args) {
        if (optional_args == UNPROVIDED) {
            optional_args = NIL;
        }
        optional_args = putf(optional_args, $FILTER, concept_filter.new_adhoc_concept_filter_spec(filter_type, UNPROVIDED));
        return string_phrasal_meanings_test(string, optional_args);
    }

    public static SubLObject string_phrasal_meanings_with_adhoc_filter_type(final SubLObject string, final SubLObject filter_type, SubLObject optional_args) {
        if (optional_args == UNPROVIDED) {
            optional_args = NIL;
        }
        optional_args = putf(optional_args, $FILTER, concept_filter.new_adhoc_concept_filter_spec(filter_type, UNPROVIDED));
        return string_phrasal_meanings_test(string, optional_args);
    }

    static private final SubLList $list_alt11 = list(makeKeyword("LEXICON"), makeKeyword("SENTENCE-CYCLIFIER"), makeKeyword("DOMAIN-MT"), makeKeyword("OUTPUT-SPEC"), makeKeyword("FILTER"), makeKeyword("SENSE-TAGGER"), makeKeyword("TIMEOUT"));

    public static final SubLObject string_phrasal_meanings_with_adhoc_genls_filter_type_alt(SubLObject string, SubLObject filter_type, SubLObject optional_args) {
        if (optional_args == UNPROVIDED) {
            optional_args = NIL;
        }
        optional_args = putf(optional_args, $FILTER, concept_filter.new_adhoc_genls_concept_filter_spec(filter_type, UNPROVIDED));
        return string_phrasal_meanings_test(string, optional_args);
    }

    public static SubLObject string_phrasal_meanings_with_adhoc_genls_filter_type(final SubLObject string, final SubLObject filter_type, SubLObject optional_args) {
        if (optional_args == UNPROVIDED) {
            optional_args = NIL;
        }
        optional_args = putf(optional_args, $FILTER, concept_filter.new_adhoc_genls_concept_filter_spec(filter_type, UNPROVIDED));
        return string_phrasal_meanings_test(string, optional_args);
    }

    static private final SubLList $list_alt14 = list(new SubLObject[]{ makeSymbol("SENTENCE-ITERATOR"), makeSymbol("SENTENCE-CYCLIFIER"), makeSymbol("DOCUMENT"), makeSymbol("LEXICON"), makeSymbol("SENSE-TAGGER"), makeSymbol("TIMEOUT"), makeSymbol("DOMAIN-MT"), makeSymbol("OUTPUT-SPEC"), makeSymbol("FILTER"), makeSymbol("PREPARED-SENTENCE-OUTPUT") });

    public static final SubLObject string_phrasal_meanings_with_adhoc_isa_filter_type_alt(SubLObject string, SubLObject filter_type, SubLObject optional_args) {
        if (optional_args == UNPROVIDED) {
            optional_args = NIL;
        }
        optional_args = putf(optional_args, $FILTER, concept_filter.new_adhoc_isa_concept_filter_spec(filter_type, UNPROVIDED));
        return string_phrasal_meanings_test(string, optional_args);
    }

    public static SubLObject string_phrasal_meanings_with_adhoc_isa_filter_type(final SubLObject string, final SubLObject filter_type, SubLObject optional_args) {
        if (optional_args == UNPROVIDED) {
            optional_args = NIL;
        }
        optional_args = putf(optional_args, $FILTER, concept_filter.new_adhoc_isa_concept_filter_spec(filter_type, UNPROVIDED));
        return string_phrasal_meanings_test(string, optional_args);
    }

    static private final SubLList $list_alt15 = list(new SubLObject[]{ makeKeyword("SENTENCE-ITERATOR"), makeKeyword("SENTENCE-CYCLIFIER"), makeKeyword("DOCUMENT"), makeKeyword("LEXICON"), makeKeyword("SENSE-TAGGER"), makeKeyword("TIMEOUT"), makeKeyword("DOMAIN-MT"), makeKeyword("OUTPUT-SPEC"), makeKeyword("FILTER"), makeKeyword("PREPARED-SENTENCE-OUTPUT") });

    static private final SubLList $list_alt16 = list(new SubLObject[]{ makeSymbol("TAG-RELATIONS-ITERATOR-STATE-SENTENCE-ITERATOR"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-SENTENCE-CYCLIFIER"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-DOCUMENT"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-LEXICON"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-SENSE-TAGGER"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-TIMEOUT"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-DOMAIN-MT"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-OUTPUT-SPEC"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-FILTER"), makeSymbol("TAG-RELATIONS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT") });

    public static SubLObject declare_nl_parsing_api_file() {
        declareFunction("tag_relations", "TAG-RELATIONS", 1, 1, false);
        declareFunction("tag_relations_optional_args_p", "TAG-RELATIONS-OPTIONAL-ARGS-P", 1, 0, false);
        declareFunction("tag_relations_iterator_state_print_function_trampoline", "TAG-RELATIONS-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("tag_relations_iterator_state_p", "TAG-RELATIONS-ITERATOR-STATE-P", 1, 0, false);
        new nl_parsing_api.$tag_relations_iterator_state_p$UnaryFunction();
        declareFunction("tag_relations_iterator_state_sentence_iterator", "TAG-RELATIONS-ITERATOR-STATE-SENTENCE-ITERATOR", 1, 0, false);
        declareFunction("tag_relations_iterator_state_sentence_cyclifier", "TAG-RELATIONS-ITERATOR-STATE-SENTENCE-CYCLIFIER", 1, 0, false);
        declareFunction("tag_relations_iterator_state_document", "TAG-RELATIONS-ITERATOR-STATE-DOCUMENT", 1, 0, false);
        declareFunction("tag_relations_iterator_state_lexicon", "TAG-RELATIONS-ITERATOR-STATE-LEXICON", 1, 0, false);
        declareFunction("tag_relations_iterator_state_sense_tagger", "TAG-RELATIONS-ITERATOR-STATE-SENSE-TAGGER", 1, 0, false);
        declareFunction("tag_relations_iterator_state_timeout", "TAG-RELATIONS-ITERATOR-STATE-TIMEOUT", 1, 0, false);
        declareFunction("tag_relations_iterator_state_domain_mt", "TAG-RELATIONS-ITERATOR-STATE-DOMAIN-MT", 1, 0, false);
        declareFunction("tag_relations_iterator_state_output_spec", "TAG-RELATIONS-ITERATOR-STATE-OUTPUT-SPEC", 1, 0, false);
        declareFunction("tag_relations_iterator_state_filter", "TAG-RELATIONS-ITERATOR-STATE-FILTER", 1, 0, false);
        declareFunction("tag_relations_iterator_state_prepared_sentence_output", "TAG-RELATIONS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT", 1, 0, false);
        declareFunction("_csetf_tag_relations_iterator_state_sentence_iterator", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENTENCE-ITERATOR", 2, 0, false);
        declareFunction("_csetf_tag_relations_iterator_state_sentence_cyclifier", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENTENCE-CYCLIFIER", 2, 0, false);
        declareFunction("_csetf_tag_relations_iterator_state_document", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-DOCUMENT", 2, 0, false);
        declareFunction("_csetf_tag_relations_iterator_state_lexicon", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-LEXICON", 2, 0, false);
        declareFunction("_csetf_tag_relations_iterator_state_sense_tagger", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENSE-TAGGER", 2, 0, false);
        declareFunction("_csetf_tag_relations_iterator_state_timeout", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-TIMEOUT", 2, 0, false);
        declareFunction("_csetf_tag_relations_iterator_state_domain_mt", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-DOMAIN-MT", 2, 0, false);
        declareFunction("_csetf_tag_relations_iterator_state_output_spec", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-OUTPUT-SPEC", 2, 0, false);
        declareFunction("_csetf_tag_relations_iterator_state_filter", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-FILTER", 2, 0, false);
        declareFunction("_csetf_tag_relations_iterator_state_prepared_sentence_output", "_CSETF-TAG-RELATIONS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT", 2, 0, false);
        declareFunction("make_tag_relations_iterator_state", "MAKE-TAG-RELATIONS-ITERATOR-STATE", 0, 1, false);
        declareFunction("visit_defstruct_tag_relations_iterator_state", "VISIT-DEFSTRUCT-TAG-RELATIONS-ITERATOR-STATE", 2, 0, false);
        declareFunction("visit_defstruct_object_tag_relations_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-TAG-RELATIONS-ITERATOR-STATE-METHOD", 2, 0, false);
        declareFunction("new_tag_relations_iterator_state", "NEW-TAG-RELATIONS-ITERATOR-STATE", 2, 0, false);
        declareFunction("tag_relations_iterator_state_done_p", "TAG-RELATIONS-ITERATOR-STATE-DONE-P", 1, 0, false);
        declareFunction("tag_relations_iterator_state_next", "TAG-RELATIONS-ITERATOR-STATE-NEXT", 1, 0, false);
        declareFunction("sentence_cyclifier_print_function_trampoline", "SENTENCE-CYCLIFIER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("sentence_cyclifier_p", "SENTENCE-CYCLIFIER-P", 1, 0, false);
        new nl_parsing_api.$sentence_cyclifier_p$UnaryFunction();
        declareFunction("sentence_cyclifier_name", "SENTENCE-CYCLIFIER-NAME", 1, 0, false);
        declareFunction("sentence_cyclifier_cyclify_method", "SENTENCE-CYCLIFIER-CYCLIFY-METHOD", 1, 0, false);
        declareFunction("sentence_cyclifier_lexicon_method", "SENTENCE-CYCLIFIER-LEXICON-METHOD", 1, 0, false);
        declareFunction("_csetf_sentence_cyclifier_name", "_CSETF-SENTENCE-CYCLIFIER-NAME", 2, 0, false);
        declareFunction("_csetf_sentence_cyclifier_cyclify_method", "_CSETF-SENTENCE-CYCLIFIER-CYCLIFY-METHOD", 2, 0, false);
        declareFunction("_csetf_sentence_cyclifier_lexicon_method", "_CSETF-SENTENCE-CYCLIFIER-LEXICON-METHOD", 2, 0, false);
        declareFunction("make_sentence_cyclifier", "MAKE-SENTENCE-CYCLIFIER", 0, 1, false);
        declareFunction("visit_defstruct_sentence_cyclifier", "VISIT-DEFSTRUCT-SENTENCE-CYCLIFIER", 2, 0, false);
        declareFunction("visit_defstruct_object_sentence_cyclifier_method", "VISIT-DEFSTRUCT-OBJECT-SENTENCE-CYCLIFIER-METHOD", 2, 0, false);
        declareFunction("print_sentence_cyclifier", "PRINT-SENTENCE-CYCLIFIER", 1, 2, false);
        declareFunction("declare_sentence_cyclifier", "DECLARE-SENTENCE-CYCLIFIER", 2, 1, false);
        declareFunction("sentence_cyclifier_get_cyclify_method", "SENTENCE-CYCLIFIER-GET-CYCLIFY-METHOD", 1, 0, false);
        declareFunction("sentence_cyclifier_get_lexicon_method", "SENTENCE-CYCLIFIER-GET-LEXICON-METHOD", 1, 0, false);
        declareFunction("default_lexicon_for_sentence_cyclifier", "DEFAULT-LEXICON-FOR-SENTENCE-CYCLIFIER", 1, 0, false);
        declareFunction("default_relation_tagging_domain_mt", "DEFAULT-RELATION-TAGGING-DOMAIN-MT", 0, 0, false);
        declareFunction("ebmt_cyclifier", "EBMT-CYCLIFIER", 6, 0, false);
        declareFunction("stanford_cyclifier", "STANFORD-CYCLIFIER", 6, 0, false);
        declareFunction("link_cyclifier", "LINK-CYCLIFIER", 6, 0, false);
        declareFunction("new_api_cyclifier", "NEW-API-CYCLIFIER", 2, 1, false);
        declareFunction("api_cyclifier_iterator_state", "API-CYCLIFIER-ITERATOR-STATE", 2, 0, false);
        declareFunction("api_cyclifier_doneP", "API-CYCLIFIER-DONE?", 1, 0, false);
        declareFunction("api_cyclifier_get_next", "API-CYCLIFIER-GET-NEXT", 1, 0, false);
        declareFunction("tag_directory_relations", "TAG-DIRECTORY-RELATIONS", 1, 0, false);
        declareFunction("tag_relations_from_files", "TAG-RELATIONS-FROM-FILES", 1, 0, false);
        declareFunction("tag_relations_from_file", "TAG-RELATIONS-FROM-FILE", 1, 0, false);
        declareFunction("sentencifications_from_file", "SENTENCIFICATIONS-FROM-FILE", 1, 1, false);
        declareFunction("string_phrasal_meanings", "STRING-PHRASAL-MEANINGS", 1, 1, false);
        declareFunction("string_phrasal_meanings_iterator", "STRING-PHRASAL-MEANINGS-ITERATOR", 1, 1, false);
        declareFunction("phrasal_meanings", "PHRASAL-MEANINGS", 1, 1, false);
        declareFunction("phrasal_meanings_iterator", "PHRASAL-MEANINGS-ITERATOR", 1, 1, false);
        declareFunction("phrasal_meanings_optional_args_p", "PHRASAL-MEANINGS-OPTIONAL-ARGS-P", 1, 0, false);
        declareFunction("lexical_phrase_cyclifier", "LEXICAL-PHRASE-CYCLIFIER", 2, 0, false);
        declareFunction("lex_entry_passes_syntactic_restrictionP", "LEX-ENTRY-PASSES-SYNTACTIC-RESTRICTION?", 2, 0, false);
        declareFunction("string_phrasal_meanings_test", "STRING-PHRASAL-MEANINGS-TEST", 1, 1, false);
        declareFunction("string_phrasal_meanings_with_args", "STRING-PHRASAL-MEANINGS-WITH-ARGS", 1, 1, false);
        declareFunction("string_phrasal_meanings_with_args_non_working_cases", "STRING-PHRASAL-MEANINGS-WITH-ARGS-NON-WORKING-CASES", 1, 1, false);
        declareFunction("string_phrasal_meanings_with_adhoc_filter_type", "STRING-PHRASAL-MEANINGS-WITH-ADHOC-FILTER-TYPE", 2, 1, false);
        declareFunction("string_phrasal_meanings_with_adhoc_genls_filter_type", "STRING-PHRASAL-MEANINGS-WITH-ADHOC-GENLS-FILTER-TYPE", 2, 1, false);
        declareFunction("string_phrasal_meanings_with_adhoc_isa_filter_type", "STRING-PHRASAL-MEANINGS-WITH-ADHOC-ISA-FILTER-TYPE", 2, 1, false);
        return NIL;
    }

    static private final SubLList $list_alt17 = list(new SubLObject[]{ makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENTENCE-ITERATOR"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENTENCE-CYCLIFIER"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-DOCUMENT"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-LEXICON"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-SENSE-TAGGER"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-TIMEOUT"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-DOMAIN-MT"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-OUTPUT-SPEC"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-FILTER"), makeSymbol("_CSETF-TAG-RELATIONS-ITERATOR-STATE-PREPARED-SENTENCE-OUTPUT") });

    static private final SubLString $str_alt45$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt49 = list(makeSymbol("NAME"), makeSymbol("CYCLIFY-METHOD"), makeSymbol("LEXICON-METHOD"));

    static private final SubLList $list_alt50 = list($NAME, makeKeyword("CYCLIFY-METHOD"), makeKeyword("LEXICON-METHOD"));

    static private final SubLList $list_alt51 = list(makeSymbol("SENTENCE-CYCLIFIER-NAME"), makeSymbol("SENTENCE-CYCLIFIER-CYCLIFY-METHOD"), makeSymbol("SENTENCE-CYCLIFIER-LEXICON-METHOD"));

    static private final SubLList $list_alt52 = list(makeSymbol("_CSETF-SENTENCE-CYCLIFIER-NAME"), makeSymbol("_CSETF-SENTENCE-CYCLIFIER-CYCLIFY-METHOD"), makeSymbol("_CSETF-SENTENCE-CYCLIFIER-LEXICON-METHOD"));

    static private final SubLString $str_alt64$__Cyclifier___A_ = makeString("#<Cyclifier: ~A>");

    static private final SubLString $str_alt65$_S_is_not_a_registered_cyclifier_ = makeString("~S is not a registered cyclifier.");

    static private final SubLString $str_alt66$_ = makeString("$");

    static private final SubLSymbol $sym75$API_CYCLIFIER_DONE_ = makeSymbol("API-CYCLIFIER-DONE?");

    static private final SubLSymbol $sym78$HAS_NEXT_ = makeSymbol("HAS-NEXT?");

    static private final SubLList $list_alt82 = list(makeKeyword("SENTENCE-CYCLIFIER"), makeSymbol("EBMT-CYCLIFIER"));

    static private final SubLString $str_alt83$CycL___S__ = makeString("CycL: ~S~%");

    static private final SubLList $list_alt94 = list(makeSymbol("SIMPLE-DATE-FROM-STRING-LEARN"), makeSymbol("NUMBER-LEARN"));

    public static SubLObject init_nl_parsing_api_file() {
        defconstant("*DTP-TAG-RELATIONS-ITERATOR-STATE*", TAG_RELATIONS_ITERATOR_STATE);
        defparameter("*SENTENCE-CYCLIFIERS*", dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        defconstant("*DTP-SENTENCE-CYCLIFIER*", SENTENCE_CYCLIFIER);
        return NIL;
    }

    static private final SubLList $list_alt98 = list(makeKeyword("TIMEOUT"), NIL);

    static private final SubLSymbol $sym103$SPEECH_PART_ = makeSymbol("SPEECH-PART?");

    public static final SubLObject setup_nl_parsing_api_file_alt() {
        register_external_symbol(TAG_RELATIONS);
        register_external_symbol(TAG_RELATIONS_OPTIONAL_ARGS_P);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_tag_relations_iterator_state$.getGlobalValue(), symbol_function(TAG_RELATIONS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
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
        note_funcall_helper_function(TAG_RELATIONS_ITERATOR_STATE_DONE_P);
        note_funcall_helper_function(TAG_RELATIONS_ITERATOR_STATE_NEXT);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sentence_cyclifier$.getGlobalValue(), symbol_function(SENTENCE_CYCLIFIER_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(SENTENCE_CYCLIFIER_NAME, _CSETF_SENTENCE_CYCLIFIER_NAME);
        def_csetf(SENTENCE_CYCLIFIER_CYCLIFY_METHOD, _CSETF_SENTENCE_CYCLIFIER_CYCLIFY_METHOD);
        def_csetf(SENTENCE_CYCLIFIER_LEXICON_METHOD, _CSETF_SENTENCE_CYCLIFIER_LEXICON_METHOD);
        identity(SENTENCE_CYCLIFIER);
        declare_sentence_cyclifier(EBMT_CYCLIFIER, EBMT_CYCLIFIER, NEW_SEMTRANS_LEXICON);
        declare_sentence_cyclifier(STANFORD_CYCLIFIER, STANFORD_CYCLIFIER, NEW_CYCLIFIER_LEXICON);
        declare_sentence_cyclifier(LINK_CYCLIFIER, LINK_CYCLIFIER, NEW_CYCLIFIER_LEXICON);
        register_external_symbol(STRING_PHRASAL_MEANINGS);
        register_external_symbol(STRING_PHRASAL_MEANINGS_ITERATOR);
        register_external_symbol(PHRASAL_MEANINGS);
        register_external_symbol(PHRASAL_MEANINGS_ITERATOR);
        register_external_symbol(PHRASAL_MEANINGS_OPTIONAL_ARGS_P);
        define_test_case_table_int(STRING_PHRASAL_MEANINGS_TEST, list(new SubLObject[]{ $TEST, $sym110$SETS_EQUAL_EQUAL_, $OWNER, $$$daves, $CLASSES, $list_alt114, $KB, $FULL, $WORKING_, T }), $list_alt118);
        define_test_case_table_int(STRING_PHRASAL_MEANINGS_WITH_ADHOC_GENLS_FILTER_TYPE, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, $list_alt114, $KB, $FULL, $WORKING_, NIL }), $list_alt120);
        define_test_case_table_int(STRING_PHRASAL_MEANINGS_WITH_ADHOC_ISA_FILTER_TYPE, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, $$$daves, $CLASSES, $list_alt114, $KB, $FULL, $WORKING_, T }), $list_alt122);
        define_test_case_table_int(STRING_PHRASAL_MEANINGS_WITH_ARGS, list(new SubLObject[]{ $TEST, $sym110$SETS_EQUAL_EQUAL_, $OWNER, $$$daves, $CLASSES, $list_alt114, $KB, $FULL, $WORKING_, T }), $list_alt124);
        define_test_case_table_int(STRING_PHRASAL_MEANINGS_WITH_ARGS_NON_WORKING_CASES, list(new SubLObject[]{ $TEST, $sym110$SETS_EQUAL_EQUAL_, $OWNER, $$$daves, $CLASSES, $list_alt114, $KB, $FULL, $WORKING_, NIL }), $list_alt126);
        return NIL;
    }

    public static SubLObject setup_nl_parsing_api_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(STRING_PHRASAL_MEANINGS_TEST, list(new SubLObject[]{ $TEST, $sym110$SETS_EQUAL_EQUAL_, $OWNER, $$$daves, $CLASSES, $list_alt114, $KB, $FULL, $WORKING_, T }), $list_alt118);
            define_test_case_table_int(STRING_PHRASAL_MEANINGS_WITH_ADHOC_GENLS_FILTER_TYPE, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, NIL, $CLASSES, $list_alt114, $KB, $FULL, $WORKING_, NIL }), $list_alt120);
            define_test_case_table_int(STRING_PHRASAL_MEANINGS_WITH_ADHOC_ISA_FILTER_TYPE, list(new SubLObject[]{ $TEST, EQUAL, $OWNER, $$$daves, $CLASSES, $list_alt114, $KB, $FULL, $WORKING_, T }), $list_alt122);
            define_test_case_table_int(STRING_PHRASAL_MEANINGS_WITH_ARGS, list(new SubLObject[]{ $TEST, $sym110$SETS_EQUAL_EQUAL_, $OWNER, $$$daves, $CLASSES, $list_alt114, $KB, $FULL, $WORKING_, T }), $list_alt124);
            define_test_case_table_int(STRING_PHRASAL_MEANINGS_WITH_ARGS_NON_WORKING_CASES, list(new SubLObject[]{ $TEST, $sym110$SETS_EQUAL_EQUAL_, $OWNER, $$$daves, $CLASSES, $list_alt114, $KB, $FULL, $WORKING_, NIL }), $list_alt126);
        }
        return NIL;
    }

    public static SubLObject setup_nl_parsing_api_file_Previous() {
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

    static private final SubLSymbol $sym110$SETS_EQUAL_EQUAL_ = makeSymbol("SETS-EQUAL-EQUAL?");

    static private final SubLString $$$daves = makeString("daves");

    static private final SubLList $list_alt114 = list(makeSymbol("NL-TEST-CASES"), makeSymbol("NL-PARSING-TEST-CASES"));

    static private final SubLList $list_alt118 = list(list(list(makeString("dog")), list(reader_make_constant_shell("Dog"), reader_make_constant_shell("HotDog"))), list(list(makeString("January 20, 2000")), list(list(reader_make_constant_shell("DayFn"), TWENTY_INTEGER, list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("January"), list(reader_make_constant_shell("YearFn"), makeInteger(2000)))))));

    static private final SubLList $list_alt120 = list(list(list(makeString("dog"), reader_make_constant_shell("Person")), NIL), list(list(makeString("dog"), reader_make_constant_shell("Animal")), list(reader_make_constant_shell("Dog"))), list(list(makeString("dog"), reader_make_constant_shell("Person")), NIL));

    static private final SubLList $list_alt122 = list(list(list(makeString("January 20, 2000"), reader_make_constant_shell("Date")), list(list(reader_make_constant_shell("DayFn"), TWENTY_INTEGER, list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("January"), list(reader_make_constant_shell("YearFn"), makeInteger(2000)))))), list(list(makeString("January 20, 2000"), reader_make_constant_shell("TimeInterval")), list(list(reader_make_constant_shell("DayFn"), TWENTY_INTEGER, list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("January"), list(reader_make_constant_shell("YearFn"), makeInteger(2000)))))), list(list(makeString("January 21, 2000"), reader_make_constant_shell("Date")), list(list(reader_make_constant_shell("DayFn"), makeInteger(21), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("January"), list(reader_make_constant_shell("YearFn"), makeInteger(2000)))))), list(list(makeString("January 21, 2000"), reader_make_constant_shell("Thing")), list(list(reader_make_constant_shell("DayFn"), makeInteger(21), list(reader_make_constant_shell("MonthFn"), reader_make_constant_shell("January"), list(reader_make_constant_shell("YearFn"), makeInteger(2000)))))));

    static private final SubLList $list_alt124 = list(list(list(makeString("bank"), list(makeSymbol("LIST"), makeKeyword("OUTPUT-SPEC"), list(makeSymbol("NEW-NL-OUTPUT-SPEC"), $SUBL, list(makeSymbol("NEW-NL-INTERPRETATION-SPEC"), list(QUOTE, list($CYCL, T, makeKeyword("INFLECTIONS"), T, makeKeyword("PHRASE-TYPES"), T)))), makeKeyword("SYNTACTIC-RESTRICTION"), list(makeSymbol("LIST"), reader_make_constant_shell("Noun")))), list(list($CYCL, reader_make_constant_shell("BankOrganization"), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell("CountNoun")), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell("singular"))), list($CYCL, reader_make_constant_shell("BankingTurn"), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell("CountNoun")), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell("singular"))), list($CYCL, reader_make_constant_shell("Bank-Topographical"), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell("CountNoun")), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell("singular"))))), list(list(makeString("bank"), list(makeSymbol("LIST"), makeKeyword("OUTPUT-SPEC"), list(makeSymbol("NEW-NL-OUTPUT-SPEC"), $SUBL, list(makeSymbol("NEW-NL-INTERPRETATION-SPEC"), list(QUOTE, list($CYCL, T, makeKeyword("INFLECTIONS"), T, makeKeyword("PHRASE-TYPES"), T)))))), list(list($CYCL, reader_make_constant_shell("MakingABankDeposit"), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell("Verb")), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell("infinitive"), reader_make_constant_shell("pluralVerb-Present"), reader_make_constant_shell("firstPersonSg-Present"), reader_make_constant_shell("secondPersonSg-Present"))), list($CYCL, reader_make_constant_shell("BankingTurn"), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell("Verb")), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell("infinitive"), reader_make_constant_shell("pluralVerb-Present"), reader_make_constant_shell("firstPersonSg-Present"), reader_make_constant_shell("secondPersonSg-Present"))), list($CYCL, reader_make_constant_shell("BankOrganization"), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell("CountNoun")), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell("singular"))), list($CYCL, reader_make_constant_shell("BankingTurn"), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell("CountNoun")), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell("singular"))), list($CYCL, reader_make_constant_shell("Bank-Topographical"), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell("CountNoun")), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell("singular"))))));

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
            nl_parsing_api.$tag_relations_iterator_state_native.this.$sentence_iterator = Lisp.NIL;
            nl_parsing_api.$tag_relations_iterator_state_native.this.$sentence_cyclifier = Lisp.NIL;
            nl_parsing_api.$tag_relations_iterator_state_native.this.$document = Lisp.NIL;
            nl_parsing_api.$tag_relations_iterator_state_native.this.$lexicon = Lisp.NIL;
            nl_parsing_api.$tag_relations_iterator_state_native.this.$sense_tagger = Lisp.NIL;
            nl_parsing_api.$tag_relations_iterator_state_native.this.$timeout = Lisp.NIL;
            nl_parsing_api.$tag_relations_iterator_state_native.this.$domain_mt = Lisp.NIL;
            nl_parsing_api.$tag_relations_iterator_state_native.this.$output_spec = Lisp.NIL;
            nl_parsing_api.$tag_relations_iterator_state_native.this.$filter = Lisp.NIL;
            nl_parsing_api.$tag_relations_iterator_state_native.this.$prepared_sentence_output = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return nl_parsing_api.$tag_relations_iterator_state_native.this.$sentence_iterator;
        }

        @Override
        public SubLObject getField3() {
            return nl_parsing_api.$tag_relations_iterator_state_native.this.$sentence_cyclifier;
        }

        @Override
        public SubLObject getField4() {
            return nl_parsing_api.$tag_relations_iterator_state_native.this.$document;
        }

        @Override
        public SubLObject getField5() {
            return nl_parsing_api.$tag_relations_iterator_state_native.this.$lexicon;
        }

        @Override
        public SubLObject getField6() {
            return nl_parsing_api.$tag_relations_iterator_state_native.this.$sense_tagger;
        }

        @Override
        public SubLObject getField7() {
            return nl_parsing_api.$tag_relations_iterator_state_native.this.$timeout;
        }

        @Override
        public SubLObject getField8() {
            return nl_parsing_api.$tag_relations_iterator_state_native.this.$domain_mt;
        }

        @Override
        public SubLObject getField9() {
            return nl_parsing_api.$tag_relations_iterator_state_native.this.$output_spec;
        }

        @Override
        public SubLObject getField10() {
            return nl_parsing_api.$tag_relations_iterator_state_native.this.$filter;
        }

        @Override
        public SubLObject getField11() {
            return nl_parsing_api.$tag_relations_iterator_state_native.this.$prepared_sentence_output;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return nl_parsing_api.$tag_relations_iterator_state_native.this.$sentence_iterator = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return nl_parsing_api.$tag_relations_iterator_state_native.this.$sentence_cyclifier = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return nl_parsing_api.$tag_relations_iterator_state_native.this.$document = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return nl_parsing_api.$tag_relations_iterator_state_native.this.$lexicon = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return nl_parsing_api.$tag_relations_iterator_state_native.this.$sense_tagger = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return nl_parsing_api.$tag_relations_iterator_state_native.this.$timeout = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return nl_parsing_api.$tag_relations_iterator_state_native.this.$domain_mt = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return nl_parsing_api.$tag_relations_iterator_state_native.this.$output_spec = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return nl_parsing_api.$tag_relations_iterator_state_native.this.$filter = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return nl_parsing_api.$tag_relations_iterator_state_native.this.$prepared_sentence_output = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.nl_parsing_api.$tag_relations_iterator_state_native.class, TAG_RELATIONS_ITERATOR_STATE, TAG_RELATIONS_ITERATOR_STATE_P, $list14, $list15, new String[]{ "$sentence_iterator", "$sentence_cyclifier", "$document", "$lexicon", "$sense_tagger", "$timeout", "$domain_mt", "$output_spec", "$filter", "$prepared_sentence_output" }, $list16, $list17, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    static private final SubLList $list_alt126 = list(list(list(makeString("bank"), list(makeSymbol("LIST"), makeKeyword("OUTPUT-SPEC"), list(makeSymbol("NEW-NL-OUTPUT-SPEC"), $SUBL, list(makeSymbol("NEW-NL-INTERPRETATION-SPEC"), list(QUOTE, list($CYCL, T, makeKeyword("INFLECTIONS"), T, makeKeyword("PHRASE-TYPES"), T)))), makeKeyword("FILTER"), list(makeSymbol("NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC"), reader_make_constant_shell("Organization")))), list(list($CYCL, reader_make_constant_shell("BankOrganization"), makeKeyword("PHRASE-TYPES"), list(reader_make_constant_shell("CountNoun")), makeKeyword("INFLECTIONS"), list(reader_make_constant_shell("singular"))))), list(list(makeString("bank"), list(makeSymbol("LIST"), makeKeyword("OUTPUT-SPEC"), list(makeSymbol("NEW-NL-OUTPUT-SPEC"), makeKeyword("XML"), list(makeSymbol("NEW-NL-INTERPRETATION-SPEC"), list(QUOTE, list($CYCL, T, makeKeyword("INFLECTIONS"), T, makeKeyword("PHRASE-TYPES"), T)))), makeKeyword("FILTER"), list(makeSymbol("NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC"), reader_make_constant_shell("Organization")))), list(makeString("\n<NLInterpretation>\n <Cycl>\n  <CycLConstant>\n    <name>BankOrganization</name>\n    <namespace>cyc</namespace>\n    <guid>bd58ab80-9c29-11b1-9dad-c379636f7270</guid>\n    <uri>urn:uuid:bd58ab80-9c29-11b1-9dad-c379636f7270</uri>\n  </CycLConstant>\n </Cycl>\n <PhraseType>\n  <CycLConstant>\n    <name>CountNoun</name>\n    <namespace>cyc</namespace>\n    <guid>bd588078-9c29-11b1-9dad-c379636f7270</guid>\n    <uri>urn:uuid:bd588078-9c29-11b1-9dad-c379636f7270</uri>\n  </CycLConstant>\n </PhraseType>\n <HeadInflections>\n  <CycLConstant>\n    <name>singular</name>\n    <namespace>cyc</namespace>\n    <guid>bd6757b8-9c29-11b1-9dad-c379636f7270</guid>\n    <uri>urn:uuid:bd6757b8-9c29-11b1-9dad-c379636f7270</uri>\n  </CycLConstant>\n </HeadInflections>\n</NLInterpretation>"))), list(list(makeString("bank"), list(makeSymbol("LIST"), makeKeyword("OUTPUT-SPEC"), list(makeSymbol("NEW-NL-OUTPUT-SPEC"), makeKeyword("XML"), list(makeSymbol("NEW-NL-INTERPRETATION-SPEC"), list(QUOTE, list($CYCL, T)))), makeKeyword("FILTER"), list(makeSymbol("NEW-ADHOC-GENLS-CONCEPT-FILTER-SPEC"), reader_make_constant_shell("Organization")))), list(makeString("\n<NLInterpretation>\n <Cycl>\n  <CycLConstant>\n    <name>BankOrganization</name>\n    <namespace>cyc</namespace>\n    <guid>bd58ab80-9c29-11b1-9dad-c379636f7270</guid>\n    <uri>urn:uuid:bd58ab80-9c29-11b1-9dad-c379636f7270</uri>\n  </CycLConstant>\n </Cycl>\n</NLInterpretation>"))));

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
            nl_parsing_api.$sentence_cyclifier_native.this.$name = Lisp.NIL;
            nl_parsing_api.$sentence_cyclifier_native.this.$cyclify_method = Lisp.NIL;
            nl_parsing_api.$sentence_cyclifier_native.this.$lexicon_method = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return nl_parsing_api.$sentence_cyclifier_native.this.$name;
        }

        @Override
        public SubLObject getField3() {
            return nl_parsing_api.$sentence_cyclifier_native.this.$cyclify_method;
        }

        @Override
        public SubLObject getField4() {
            return nl_parsing_api.$sentence_cyclifier_native.this.$lexicon_method;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return nl_parsing_api.$sentence_cyclifier_native.this.$name = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return nl_parsing_api.$sentence_cyclifier_native.this.$cyclify_method = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return nl_parsing_api.$sentence_cyclifier_native.this.$lexicon_method = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.nl_parsing_api.$sentence_cyclifier_native.class, SENTENCE_CYCLIFIER, SENTENCE_CYCLIFIER_P, $list55, $list56, new String[]{ "$name", "$cyclify_method", "$lexicon_method" }, $list57, $list58, PRINT_SENTENCE_CYCLIFIER);
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
