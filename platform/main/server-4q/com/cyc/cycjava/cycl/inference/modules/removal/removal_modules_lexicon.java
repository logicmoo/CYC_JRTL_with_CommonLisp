package com.cyc.cycjava.cycl.inference.modules.removal;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_macros;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.modules.preference_modules;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon.$removal_word_strings_iterator_state_native;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class removal_modules_lexicon extends SubLTranslatedFile {
    public static final SubLFile me = new removal_modules_lexicon();

    public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_lexicon";

    public static final String myFingerPrint = "462114e8bf8d13cb2b8bd26e66303893963d7b833ddad5222e7f70de8572cffd";

    // defparameter
    private static final SubLSymbol $default_word_string_check_cost$ = makeSymbol("*DEFAULT-WORD-STRING-CHECK-COST*");

    // defparameter
    private static final SubLSymbol $default_word_strings_unify_cost$ = makeSymbol("*DEFAULT-WORD-STRINGS-UNIFY-COST*");

    // defconstant
    public static final SubLSymbol $dtp_removal_word_strings_iterator_state$ = makeSymbol("*DTP-REMOVAL-WORD-STRINGS-ITERATOR-STATE*");

    // defconstant
    private static final SubLSymbol $avg_suffix_expansion_cost$ = makeSymbol("*AVG-SUFFIX-EXPANSION-COST*");

    // defparameter
    private static final SubLSymbol $default_term_phrases_cost$ = makeSymbol("*DEFAULT-TERM-PHRASES-COST*");

    // defparameter
    private static final SubLSymbol $default_lexicon_namestring_check_cost$ = makeSymbol("*DEFAULT-LEXICON-NAMESTRING-CHECK-COST*");

    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("HL-MODULE"), makeSymbol("ASENT"), makeSymbol("MT"), makeSymbol("TV"));

    public static final SubLSymbol HL_VERIFY_WORD_STRINGS = makeSymbol("HL-VERIFY-WORD-STRINGS");

    public static final SubLSymbol HL_JUSTIFY_WORD_STRINGS = makeSymbol("HL-JUSTIFY-WORD-STRINGS");

    public static final SubLSymbol HL_FORWARD_MT_COMBOS_WORD_STRINGS = makeSymbol("HL-FORWARD-MT-COMBOS-WORD-STRINGS");

    public static final SubLList $list4 = list(makeSymbol("POS-PRED"), makeSymbol("WORD"), makeSymbol("STRING"));

    private static final SubLObject $$CommonEnglishMisspellingsMt = reader_make_constant_shell(makeString("CommonEnglishMisspellingsMt"));

    private static final SubLSymbol $REMOVAL_WORD_STRINGS_CHECK = makeKeyword("REMOVAL-WORD-STRINGS-CHECK");

    public static final SubLList $list7 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list(makeKeyword("TEST"), makeSymbol("SPEECH-PART-PRED?")), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-STRINGS-CHECK-REQUIRED"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-WORD-STRING-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-WORD-STRINGS-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<speech-part-pred> <fully bound> <string>) using the lexicon cache"), makeKeyword("EXAMPLE"), makeString("(#$nounStrings #$Dog-TheWord \"dog\")") });



    public static final SubLSymbol REMOVAL_WORD_STRINGS_UNIFY_ARG1_OUTPUT_GENERATE = makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG1-OUTPUT-GENERATE");

    private static final SubLSymbol $REMOVAL_WORD_STRINGS_UNIFY_ARG1 = makeKeyword("REMOVAL-WORD-STRINGS-UNIFY-ARG1");

    public static final SubLList $list11 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list(makeKeyword("TEST"), makeSymbol("SPEECH-PART-PRED?")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG1-REQUIRED"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-WORD-STRINGS-UNIFY-COST*"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(list(makeKeyword("BIND"), makeSymbol("POS-PRED")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("STRING"))), list(list(makeKeyword("VALUE"), makeSymbol("POS-PRED")), list(makeKeyword("VALUE"), makeSymbol("STRING")))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("TUPLE"), list(makeSymbol("POS-PRED"), makeSymbol("STRING")), list(makeKeyword("CALL"), makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG1-OUTPUT-GENERATE"), list(makeKeyword("VALUE"), makeSymbol("POS-PRED")), list(makeKeyword("VALUE"), makeSymbol("STRING")))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("POS-PRED")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("STRING"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("WORD-STRINGS"), makeKeyword("DOCUMENTATION"), makeString("(<speech-part-predicate> <not fully-bound> <string>)\nusing the lexicon cache"), makeKeyword("EXAMPLE"), makeString("(#$wordStrings ?WHAT \"dog\")") });

    public static final SubLList $list12 = list(makeSymbol("POS-PRED"), makeSymbol("WORD"), makeSymbol("ARG2"));

    private static final SubLSymbol $REMOVAL_WORD_STRINGS_UNIFY_ARG2 = makeKeyword("REMOVAL-WORD-STRINGS-UNIFY-ARG2");

    public static final SubLList $list14 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list(makeKeyword("TEST"), makeSymbol("SPEECH-PART-PRED?")), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG2-REQUIRED"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("COST"), makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG2-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<speech-part-predicate> <fully bound> <not fully bound>) using the lexicon cache"), makeKeyword("EXAMPLE"), makeString("(#$nounStrings #$Dog-TheWord ?STRING)") });







    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell(makeString("True-JustificationTruth"));





    public static final SubLString $str21$_A_is_not_a__A = makeString("~A is not a ~A");





    public static final SubLString $$$continue_anyway = makeString("continue anyway");



    public static final SubLString $str26$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    private static final SubLString $str28$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str29$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str30$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLSymbol REMOVAL_WORD_STRINGS_ITERATOR_STATE = makeSymbol("REMOVAL-WORD-STRINGS-ITERATOR-STATE");

    private static final SubLSymbol REMOVAL_WORD_STRINGS_ITERATOR_STATE_P = makeSymbol("REMOVAL-WORD-STRINGS-ITERATOR-STATE-P");

    public static final SubLList $list33 = list(makeSymbol("SPEECH-PART-PREDICATE"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("TRIE-ITERATOR"), makeSymbol("ENTRY-ITERATOR"));

    public static final SubLList $list34 = list(makeKeyword("SPEECH-PART-PREDICATE"), makeKeyword("ARG1"), makeKeyword("ARG2"), makeKeyword("TRIE-ITERATOR"), makeKeyword("ENTRY-ITERATOR"));

    public static final SubLList $list35 = list(makeSymbol("REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE"), makeSymbol("REMOVAL-WSI-STATE-ARG1"), makeSymbol("REMOVAL-WSI-STATE-ARG2"), makeSymbol("REMOVAL-WSI-STATE-TRIE-ITERATOR"), makeSymbol("REMOVAL-WSI-STATE-ENTRY-ITERATOR"));

    private static final SubLList $list36 = list(makeSymbol("_CSETF-REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE"), makeSymbol("_CSETF-REMOVAL-WSI-STATE-ARG1"), makeSymbol("_CSETF-REMOVAL-WSI-STATE-ARG2"), makeSymbol("_CSETF-REMOVAL-WSI-STATE-TRIE-ITERATOR"), makeSymbol("_CSETF-REMOVAL-WSI-STATE-ENTRY-ITERATOR"));



    private static final SubLSymbol REMOVAL_WORD_STRINGS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REMOVAL-WORD-STRINGS-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list39 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("REMOVAL-WORD-STRINGS-ITERATOR-STATE-P"));

    private static final SubLSymbol REMOVAL_WSI_STATE_SPEECH_PART_PREDICATE = makeSymbol("REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE");

    private static final SubLSymbol _CSETF_REMOVAL_WSI_STATE_SPEECH_PART_PREDICATE = makeSymbol("_CSETF-REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE");

    private static final SubLSymbol REMOVAL_WSI_STATE_ARG1 = makeSymbol("REMOVAL-WSI-STATE-ARG1");

    private static final SubLSymbol _CSETF_REMOVAL_WSI_STATE_ARG1 = makeSymbol("_CSETF-REMOVAL-WSI-STATE-ARG1");

    private static final SubLSymbol REMOVAL_WSI_STATE_ARG2 = makeSymbol("REMOVAL-WSI-STATE-ARG2");

    private static final SubLSymbol _CSETF_REMOVAL_WSI_STATE_ARG2 = makeSymbol("_CSETF-REMOVAL-WSI-STATE-ARG2");

    private static final SubLSymbol REMOVAL_WSI_STATE_TRIE_ITERATOR = makeSymbol("REMOVAL-WSI-STATE-TRIE-ITERATOR");

    private static final SubLSymbol _CSETF_REMOVAL_WSI_STATE_TRIE_ITERATOR = makeSymbol("_CSETF-REMOVAL-WSI-STATE-TRIE-ITERATOR");

    private static final SubLSymbol REMOVAL_WSI_STATE_ENTRY_ITERATOR = makeSymbol("REMOVAL-WSI-STATE-ENTRY-ITERATOR");

    private static final SubLSymbol _CSETF_REMOVAL_WSI_STATE_ENTRY_ITERATOR = makeSymbol("_CSETF-REMOVAL-WSI-STATE-ENTRY-ITERATOR");

    private static final SubLSymbol $SPEECH_PART_PREDICATE = makeKeyword("SPEECH-PART-PREDICATE");









    private static final SubLString $str55$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_REMOVAL_WORD_STRINGS_ITERATOR_STATE = makeSymbol("MAKE-REMOVAL-WORD-STRINGS-ITERATOR-STATE");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_REMOVAL_WORD_STRINGS_ITERATOR_STATE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-REMOVAL-WORD-STRINGS-ITERATOR-STATE-METHOD");

    private static final SubLSymbol ITERATOR_WORD_STRINGS_DONE = makeSymbol("ITERATOR-WORD-STRINGS-DONE");

    private static final SubLSymbol ITERATOR_WORD_STRINGS_NEXT = makeSymbol("ITERATOR-WORD-STRINGS-NEXT");

    private static final SubLList $list63 = list(makeSymbol("SPEECH-PART-PREDICATE"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    private static final SubLSymbol REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_ITERATOR = makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-ITERATOR");

    private static final SubLSymbol REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_SUPPORTS = makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-SUPPORTS");

    public static final SubLList $list66 = cons(makeSymbol("STRING"), makeSymbol("SUPPORTS"));

    private static final SubLSymbol REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_OUTPUT_ASENT = makeSymbol("REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-OUTPUT-ASENT");

    private static final SubLList $list68 = list(makeKeyword("REMOVAL-WORD-STRINGS-UNIFY-ARG2"), makeKeyword("REMOVAL-WORD-STRINGS-UNIFY-ARG1"), makeKeyword("REMOVAL-WORD-STRINGS-CHECK"));

    private static final SubLObject $$regularSuffix = reader_make_constant_shell(makeString("regularSuffix"));

    private static final SubLSymbol $REMOVAL_WORD_FORMS_CHECK = makeKeyword("REMOVAL-WORD-FORMS-CHECK");

    public static final SubLList $list71 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("wordForms")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("wordForms")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-FORMS-CHECK-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-WORD-FORMS-CHECK-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-WORD-FORMS-CHECK-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$wordForms <fully bound> <fully bound> <string>) using morphology functions"), makeKeyword("EXAMPLE"), makeString("(#$wordForms #$Ox-TheWord #$plural \"oxen\")") });

    private static final SubLSymbol $REMOVAL_WORD_FORMS_UNIFY_ARG1 = makeKeyword("REMOVAL-WORD-FORMS-UNIFY-ARG1");

    public static final SubLList $list73 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("wordForms")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("wordForms")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG1-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG1-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG1-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$wordForms <not-fully-bound> <fully-bound> <string>) using morphology functions"), makeKeyword("EXAMPLE"), makeString("(#$wordForms ?WORD #$plural \"dogs\")") });

    private static final SubLObject $$speechPartPreds = reader_make_constant_shell(makeString("speechPartPreds"));

    private static final SubLSymbol $REMOVAL_WORD_FORMS_UNIFY_ARG2 = makeKeyword("REMOVAL-WORD-FORMS-UNIFY-ARG2");

    private static final SubLList $list76 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("wordForms")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("wordForms")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG2-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG2-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG2-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$wordForms <fully-bound> <not-fully-bound> <string>) using morphology functions"), makeKeyword("EXAMPLE"), makeString("(#$wordForms #$Dog-TheWord ?PRED \"dogs\")") });

    private static final SubLSymbol $REMOVAL_WORD_FORMS_UNIFY_ARG3 = makeKeyword("REMOVAL-WORD-FORMS-UNIFY-ARG3");

    private static final SubLList $list78 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("wordForms")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("wordForms")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG3-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG3-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARG3-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$wordForms <fully-bound> <fully-bound> <not-fully-bound>) using morphology functions"), makeKeyword("EXAMPLE"), makeString("(#$wordForms #$Dog-TheWord #$plural ?STRING)") });

    private static final SubLSymbol $REMOVAL_WORD_FORMS_UNIFY_ARGS_1_AND_2 = makeKeyword("REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2");

    private static final SubLList $list80 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("wordForms")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("wordForms")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$wordForms <not-fully-bound> <not-fully-bound> <string>) using morphology functions"), makeKeyword("EXAMPLE"), makeString("(#$wordForms ?WORD ?PRED \"dogs\")") });

    private static final SubLSymbol $REMOVAL_WORD_FORMS_UNIFY_ARGS_2_AND_3 = makeKeyword("REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3");

    private static final SubLList $list82 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("wordForms")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("wordForms")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$wordForms <fully-bound> <not-fully-bound> <not-fully-bound>) using morphology functions"), makeKeyword("EXAMPLE"), makeString("(#$wordForms #$Dog-TheWord ?PRED ?STRING)") });

    private static final SubLObject $$termStrings = reader_make_constant_shell(makeString("termStrings"));



    private static final SubLSymbol HL_VERIFY_TERM_PHRASES = makeSymbol("HL-VERIFY-TERM-PHRASES");

    private static final SubLSymbol HL_JUSTIFY_TERM_PHRASES = makeSymbol("HL-JUSTIFY-TERM-PHRASES");

    private static final SubLObject $$termPhrases = reader_make_constant_shell(makeString("termPhrases"));

    private static final SubLObject $$termPhrases_Lexical = reader_make_constant_shell(makeString("termPhrases-Lexical"));

    private static final SubLObject $$termPhrases_CaseInsensitive = reader_make_constant_shell(makeString("termPhrases-CaseInsensitive"));

    private static final SubLObject $const90$termPhrases_CaseInsensitive_Lexic = reader_make_constant_shell(makeString("termPhrases-CaseInsensitive-Lexical"));

    private static final SubLObject $$CharacterString = reader_make_constant_shell(makeString("CharacterString"));

    private static final SubLList $list92 = list(makeSymbol("HL-MODULE"), makeSymbol("EL-SENTENCE"), makeSymbol("MT"), makeSymbol("TV"));

    private static final SubLSymbol HL_FORWARD_MT_COMBOS_TERM_PHRASES = makeSymbol("HL-FORWARD-MT-COMBOS-TERM-PHRASES");

    private static final SubLSymbol SUPPORT_SENTENCE_OPERATOR = makeSymbol("SUPPORT-SENTENCE-OPERATOR");

    private static final SubLSymbol HL_VERIFY_AND_JUSTIFY_TERM_PHRASES = makeSymbol("HL-VERIFY-AND-JUSTIFY-TERM-PHRASES");



    private static final SubLSymbol $sym97$SUPPORTS_HAVE_PREDS_ = makeSymbol("SUPPORTS-HAVE-PREDS?");











    public static final SubLObject $list103 = _constant_103_initializer();



    private static final SubLSymbol $sym105$SPEECH_PART_PRED_ = makeSymbol("SPEECH-PART-PRED?");

    private static final SubLObject $$abbreviationForLexicalWord = reader_make_constant_shell(makeString("abbreviationForLexicalWord"));



    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLList $list109 = list(makeKeyword("MAX-NUMBER"), ONE_INTEGER);

    public static final SubLList $list110 = list(makeKeyword("OR"), reader_make_constant_shell(makeString("termPhrases")), reader_make_constant_shell(makeString("termPhrases-CaseInsensitive")));

    private static final SubLList $list111 = list(list(makeSymbol("GAF"), makeSymbol("TERM"), makeSymbol("PREDICATE"), makeSymbol("INDEX-ARG")), makeSymbol("&BODY"), makeSymbol("BODY"));











    private static final SubLList $list117 = list(makeKeyword("TRUTH"), makeKeyword("TRUE"));

    private static final SubLSymbol DO_GAF_ARG_INDEX_NAUT = makeSymbol("DO-GAF-ARG-INDEX-NAUT");

    private static final SubLList $list119 = list(makeSymbol("TERM"), makeSymbol("CONSTRAINT"), makeSymbol("ARG3"));



    private static final SubLSymbol $sym121$GENERIC_PRED_ = makeSymbol("GENERIC-PRED?");

    private static final SubLObject $$StringIndexingSlot = reader_make_constant_shell(makeString("StringIndexingSlot"));

    private static final SubLSymbol $sym123$NAME_STRING_PRED_ = makeSymbol("NAME-STRING-PRED?");

    private static final SubLObject $$ProperNameString = reader_make_constant_shell(makeString("ProperNameString"));

    private static final SubLObject $$arg2Isa = reader_make_constant_shell(makeString("arg2Isa"));



    private static final SubLObject $$NLWordForm = reader_make_constant_shell(makeString("NLWordForm"));

    private static final SubLObject $$NounPhrase = reader_make_constant_shell(makeString("NounPhrase"));

    private static final SubLObject $$nonSingular_Generic = reader_make_constant_shell(makeString("nonSingular-Generic"));

    private static final SubLObject $$GenericSpeechPartPredicate = reader_make_constant_shell(makeString("GenericSpeechPartPredicate"));

    private static final SubLSymbol $REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_LEXICAL_UNIFY_ARG3 = makeKeyword("REMOVAL-TERM-PHRASES-CASE-INSENSITIVE-LEXICAL-UNIFY-ARG3");

    private static final SubLList $list132 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termPhrases-CaseInsensitive-Lexical")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termPhrases-CaseInsensitive-Lexical")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG3-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-CaseInsensitive-Lexical <fully bound> <fully bound> <whatever>) using lexicon functions and generation"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases-CaseInsensitive-Lexical #$Egypt #$ProperNameString \"EGYPT\")\n    (#$termPhrases-CaseInsensitive-Lexical #$FamousHuman #$singular ?STRING)") });

    private static final SubLSymbol $REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG3 = makeKeyword("REMOVAL-TERM-PHRASES-CASE-INSENSITIVE-UNIFY-ARG3");

    private static final SubLList $list134 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termPhrases-CaseInsensitive")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termPhrases-CaseInsensitive")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG3-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-CaseInsensitive <fully bound> <fully bound> <whatever>) using lexicon functions and generation"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases-CaseInsensitive #$Egypt #$ProperNameString \"EGYPT\")\n    (#$termPhrases-CaseInsensitive #$FamousHuman #$singular ?STRING)") });

    private static final SubLSymbol $REMOVAL_TERM_PHRASES_UNIFY_ARG3 = makeKeyword("REMOVAL-TERM-PHRASES-UNIFY-ARG3");

    private static final SubLList $list136 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termPhrases")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termPhrases")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG3-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases <fully bound> <fully bound> <whatever>) using lexicon functions and generation"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases #$Egypt #$ProperNameString \"Egypt\")\n    (#$termPhrases #$FamousHuman #$singular ?STRING)") });

    private static final SubLSymbol $REMOVAL_TERM_PHRASES_LEXICAL_UNIFY_ARG3 = makeKeyword("REMOVAL-TERM-PHRASES-LEXICAL-UNIFY-ARG3");

    private static final SubLList $list138 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termPhrases-Lexical")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG3-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-Lexical <fully bound> <fully bound> <whatever>) using lexicon functions"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases #$Egypt #$ProperNameString \"Egypt\")\n    (#$termPhrases #$FamousHuman #$singular ?STRING)") });

    private static final SubLSymbol $REMOVAL_TERM_PHRASES_UNIFY_ARG1 = makeKeyword("REMOVAL-TERM-PHRASES-UNIFY-ARG1");

    public static final SubLList $list140 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termPhrases")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termPhrases")), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG1-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases <whatever> <fully bound> <string>) using lexicon functions and parsing"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases ?WHAT #$singular \"emu\")") });

    private static final SubLSymbol $REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG1 = makeKeyword("REMOVAL-TERM-PHRASES-CASE-INSENSITIVE-UNIFY-ARG1");

    private static final SubLList $list142 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termPhrases-CaseInsensitive")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termPhrases-CaseInsensitive")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG1-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-CaseInsensitive <not fully bound> <fully bound> <string>) using lexicon functions and parsing"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases-CaseInsensitive ?WHAT #$singular \"emu\")") });

    private static final SubLSymbol $REMOVAL_TERM_PHRASES_LEXICAL_UNIFY_ARG1 = makeKeyword("REMOVAL-TERM-PHRASES-LEXICAL-UNIFY-ARG1");

    private static final SubLList $list144 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termPhrases-Lexical")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG1-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-Lexical <not fully bound> <fully bound> <string>) using lexicon functions"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases-Lexical ?WHAT #$singular \"emu\")") });

    private static final SubLSymbol $REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_LEXICAL_UNIFY_ARG1 = makeKeyword("REMOVAL-TERM-PHRASES-CASE-INSENSITIVE-LEXICAL-UNIFY-ARG1");

    public static final SubLList $list146 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termPhrases-CaseInsensitive-Lexical")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termPhrases-CaseInsensitive-Lexical")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG1-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-CaseInsensitive-Lexical <not fully bound> <fully bound> <string>) using lexicon functions"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases-CaseInsensitive-Lexical ?WHAT #$singular \"emu\")") });

    private static final SubLList $list147 = list(makeSymbol("ARG1"), makeSymbol("CONSTRAINT"), makeSymbol("STRING"));









    public static final SubLList $list152 = list(reader_make_constant_shell(makeString("termPhrases-CaseInsensitive")), reader_make_constant_shell(makeString("termPhrases-CaseInsensitive-Lexical")));

    private static final SubLList $list153 = list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("termPhrases-CaseInsensitive-Lexical")));

    private static final SubLSymbol $REMOVAL_TERM_PHRASES_UNIFY_ARG1_AND_ARG2 = makeKeyword("REMOVAL-TERM-PHRASES-UNIFY-ARG1-AND-ARG2");

    private static final SubLList $list155 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termPhrases")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termPhrases")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG1-AND-ARG2-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases <not fully bound> <not fully bound> <string>) using lexicon functions"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases ?DENOT ?CONSTRAINT \"emu\")") });

    private static final SubLSymbol $REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG1_AND_ARG2 = makeKeyword("REMOVAL-TERM-PHRASES-CASE-INSENSITIVE-UNIFY-ARG1-AND-ARG2");

    public static final SubLList $list157 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("termPhrases-CaseInsensitive")), makeKeyword("REQUIRED-PATTERN"), list(reader_make_constant_shell(makeString("termPhrases-CaseInsensitive")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("STRING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-TERM-PHRASES-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-TERM-PHRASES-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-TERM-PHRASES-UNIFY-ARG1-AND-ARG2-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$termPhrases-CaseInsensitive <not fully bound> <not fully bound> <string>) using lexicon functions"), makeKeyword("EXAMPLE"), makeString("(#$termPhrases-CaseInsensitive ?DENOT ?CONSTRAINT \"emu\")") });

    public static final SubLList $list158 = list(makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("STRING"));

    public static final SubLList $list159 = list(makeSymbol("DENOT"), makeSymbol("PRED"));

    private static final SubLObject $$TermPhrasesConstraint = reader_make_constant_shell(makeString("TermPhrasesConstraint"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));



    private static final SubLObject $$wordForms = reader_make_constant_shell(makeString("wordForms"));

    private static final SubLList $list164 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("STRING"));

    private static final SubLList $list165 = list(makeKeyword("BIND"), makeSymbol("NAME-PRED"));

    public static final SubLList $list166 = list(makeKeyword("BIND"), makeSymbol("DENOT"));

    private static final SubLSymbol NAME_PRED = makeSymbol("NAME-PRED");





    private static final SubLSymbol REMOVAL_LEXICON_NAMESTRING_EXPAND = makeSymbol("REMOVAL-LEXICON-NAMESTRING-EXPAND");

    private static final SubLSymbol $sym171$REMOVAL_LEXICON_NAMESTRING_COMPLETE_ = makeSymbol("REMOVAL-LEXICON-NAMESTRING-COMPLETE?");

    private static final SubLSymbol $TERM_STRINGS_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG = makeKeyword("TERM-STRINGS-STRONGLY-PREFER-AT-LEAST-ONE-FULLY-BOUND-ARG");

    private static final SubLList $list173 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list(makeKeyword("GENL-PRED"), reader_make_constant_shell(makeString("termStrings"))), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $TERM_PHRASES_STRONGLY_PREFER_AT_LEAST_TERM_OR_STRING_FULLY_BOUND = makeKeyword("TERM-PHRASES-STRONGLY-PREFER-AT-LEAST-TERM-OR-STRING-FULLY-BOUND");

    private static final SubLList $list175 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list(makeKeyword("GENL-PRED"), reader_make_constant_shell(makeString("termPhrases"))), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));

    private static final SubLSymbol $REMOVAL_LEXICON_NAMESTRING = makeKeyword("REMOVAL-LEXICON-NAMESTRING");

    private static final SubLList $list177 = list(new SubLObject[]{ makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(list(makeKeyword("TEST"), makeSymbol("NL-TRIE-NAME-STRING-PRED?")), makeKeyword("ANYTHING"), list(makeKeyword("TEST"), makeSymbol("STRINGP"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-LEXICON-NAMESTRING-CHECK-COST*"), makeKeyword("COMPLETE-PATTERN"), list(makeKeyword("TEST"), makeSymbol("REMOVAL-LEXICON-NAMESTRING-COMPLETE?")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-LEXICON-NAMESTRING-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<name-string-pred> <anything> <string>)\nusing the Cyc lexicon."), makeKeyword("EXAMPLE"), makeString("(#$nameString ?WHO \"Cher\")") });

    public static SubLObject removal_word_strings_check_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static SubLObject hl_verify_word_strings(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject hl_module = NIL;
        SubLObject asent = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list0);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list0);
        asent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list0);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list0);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                ans = removal_word_strings_check_succeedsP(asent);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        } else {
            cdestructuring_bind_error(support, $list0);
        }
        return ans;
    }

    public static SubLObject hl_justify_word_strings(final SubLObject support) {
        return nl_trie_accessors.nl_trie_hl_justify_word_strings(support);
    }

    public static SubLObject hl_forward_mt_combos_word_strings(final SubLObject support) {
        return nl_trie_accessors.nl_trie_hl_forward_mt_combos_word_strings(support);
    }

    public static SubLObject removal_word_strings_check_succeedsP(final SubLObject asent) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(asent, UNPROVIDED);
        SubLObject pos_pred = NIL;
        SubLObject word = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, $list4);
        pos_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        word = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list4);
        string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject misspellingsP = mt_relevance_macros.relevant_mtP($$CommonEnglishMisspellingsMt);
            final SubLObject mt = mt_relevance_macros.inference_relevant_mt();
            final SubLObject words = lexicon_accessors.words_of_stringXpred(string, pos_pred, misspellingsP, mt, UNPROVIDED);
            return subl_promotions.memberP(word, words, symbol_function(EQUAL), UNPROVIDED);
        }
        cdestructuring_bind_error(datum, $list4);
        return NIL;
    }

    public static SubLObject removal_word_strings_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        if (NIL != removal_word_strings_check_succeedsP(asent)) {
            final SubLObject hl_support = make_word_strings_support(asent);
            backward.removal_add_node(hl_support, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject make_word_strings_support(final SubLObject formula) {
        return arguments.make_hl_support($WORD_STRINGS, formula, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject removal_word_strings_unify_arg1_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static SubLObject removal_word_strings_unify_arg1_output_generate(final SubLObject pos_pred, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return iteration.new_list_iterator(lexicon_accessors.words_of_stringXpred(string, pos_pred, T, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED));
    }

    public static SubLObject removal_word_strings_unify_arg2_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static SubLObject removal_word_strings_unify_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject word = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return kb_indexing.num_gaf_arg_index(word, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject removal_word_strings_unify_arg2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(asent, UNPROVIDED);
        SubLObject pos_pred = NIL;
        SubLObject word = NIL;
        SubLObject arg2 = NIL;
        destructuring_bind_must_consp(current, datum, $list12);
        pos_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list12);
        word = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list12);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject _prev_bind_0 = lexicon_vars.$misspellingsP$.currentBinding(thread);
            try {
                lexicon_vars.$misspellingsP$.bind(mt_relevance_macros.relevant_mtP($$CommonEnglishMisspellingsMt), thread);
                SubLObject cdolist_list_var;
                final SubLObject strings = cdolist_list_var = lexicon_cache.strings_of_wordXpred(word, pos_pred, mt_relevance_macros.mt_info(UNPROVIDED));
                SubLObject string = NIL;
                string = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    thread.resetMultipleValues();
                    final SubLObject v_bindings = unification_utilities.term_unify(string, arg2, T, T);
                    final SubLObject unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != v_bindings) {
                        final SubLObject formula = bindings.subst_bindings(v_bindings, asent);
                        final SubLObject hl_support = make_word_strings_support(formula);
                        backward.removal_add_node(hl_support, v_bindings, unify_justification);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    string = cdolist_list_var.first();
                } 
            } finally {
                lexicon_vars.$misspellingsP$.rebind(_prev_bind_0, thread);
            }
        } else {
            cdestructuring_bind_error(datum, $list12);
        }
        return NIL;
    }

    public static SubLObject removal_word_strings_unify_arg1_and_arg2_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static SubLObject removal_word_strings_unify_arg1_and_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        final SubLObject node_var = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject deck_type = $QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = $$True_JustificationTruth;
                final SubLObject _prev_bind_0_$1 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str26$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(cycl_utilities.atomic_sentence_predicate(asent), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                            final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$4 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                for (node_and_predicate_mode = list(cycl_utilities.atomic_sentence_predicate(asent), sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    final SubLObject node_var_$7 = node_and_predicate_mode.first();
                                    final SubLObject predicate_mode = second(node_and_predicate_mode);
                                    final SubLObject spec_pred = node_var_$7;
                                    final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$7)) {
                                            count = add(count, kb_indexing.relevant_num_predicate_extent_index(spec_pred));
                                        }
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var_$7);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$6 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$12;
                                                                        for (iteration_state_$12 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$12); iteration_state_$12 = dictionary_contents.do_dictionary_contents_next(iteration_state_$12)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$12);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (NIL != csome_list_var) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str28$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$7, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$12);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$6, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str29$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$14;
                                                        final SubLObject new_list = cdolist_list_var_$14 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$14.first();
                                                        while (NIL != cdolist_list_var_$14) {
                                                            final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                            deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (NIL != csome_list_var2) {
                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error($str28$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$8, thread);
                                                            }
                                                            cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                                                            generating_fn = cdolist_list_var_$14.first();
                                                        } 
                                                    }

                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$5, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$5, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$4, thread);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$6, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$4, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$3, thread);
                            }
                        } else {
                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str30$Node__a_does_not_pass_sbhl_type_t, cycl_utilities.atomic_sentence_predicate(asent), sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$3, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        final SubLObject current_controlling_inference = inference_macros.current_controlling_inference();
        if (NIL != current_controlling_inference) {
            final SubLObject number_cutoff = inference_datastructures_inference.inference_max_number(current_controlling_inference);
            if ((NIL != number_cutoff) && number_cutoff.numL(count)) {
                count = number_cutoff;
            }
        }
        return count;
    }

    public static SubLObject removal_word_strings_iterator_state_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject removal_word_strings_iterator_state_p(final SubLObject v_object) {
        return v_object.getClass() == $removal_word_strings_iterator_state_native.class ? T : NIL;
    }

    public static SubLObject removal_wsi_state_speech_part_predicate(final SubLObject v_object) {
        assert NIL != removal_word_strings_iterator_state_p(v_object) : "removal_modules_lexicon.removal_word_strings_iterator_state_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject removal_wsi_state_arg1(final SubLObject v_object) {
        assert NIL != removal_word_strings_iterator_state_p(v_object) : "removal_modules_lexicon.removal_word_strings_iterator_state_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject removal_wsi_state_arg2(final SubLObject v_object) {
        assert NIL != removal_word_strings_iterator_state_p(v_object) : "removal_modules_lexicon.removal_word_strings_iterator_state_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject removal_wsi_state_trie_iterator(final SubLObject v_object) {
        assert NIL != removal_word_strings_iterator_state_p(v_object) : "removal_modules_lexicon.removal_word_strings_iterator_state_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject removal_wsi_state_entry_iterator(final SubLObject v_object) {
        assert NIL != removal_word_strings_iterator_state_p(v_object) : "removal_modules_lexicon.removal_word_strings_iterator_state_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_removal_wsi_state_speech_part_predicate(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_word_strings_iterator_state_p(v_object) : "removal_modules_lexicon.removal_word_strings_iterator_state_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_removal_wsi_state_arg1(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_word_strings_iterator_state_p(v_object) : "removal_modules_lexicon.removal_word_strings_iterator_state_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_removal_wsi_state_arg2(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_word_strings_iterator_state_p(v_object) : "removal_modules_lexicon.removal_word_strings_iterator_state_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_removal_wsi_state_trie_iterator(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_word_strings_iterator_state_p(v_object) : "removal_modules_lexicon.removal_word_strings_iterator_state_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_removal_wsi_state_entry_iterator(final SubLObject v_object, final SubLObject value) {
        assert NIL != removal_word_strings_iterator_state_p(v_object) : "removal_modules_lexicon.removal_word_strings_iterator_state_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_removal_word_strings_iterator_state(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $removal_word_strings_iterator_state_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SPEECH_PART_PREDICATE)) {
                _csetf_removal_wsi_state_speech_part_predicate(v_new, current_value);
            } else
                if (pcase_var.eql($ARG1)) {
                    _csetf_removal_wsi_state_arg1(v_new, current_value);
                } else
                    if (pcase_var.eql($ARG2)) {
                        _csetf_removal_wsi_state_arg2(v_new, current_value);
                    } else
                        if (pcase_var.eql($TRIE_ITERATOR)) {
                            _csetf_removal_wsi_state_trie_iterator(v_new, current_value);
                        } else
                            if (pcase_var.eql($ENTRY_ITERATOR)) {
                                _csetf_removal_wsi_state_entry_iterator(v_new, current_value);
                            } else {
                                Errors.error($str55$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_removal_word_strings_iterator_state(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_REMOVAL_WORD_STRINGS_ITERATOR_STATE, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SPEECH_PART_PREDICATE, removal_wsi_state_speech_part_predicate(obj));
        funcall(visitor_fn, obj, $SLOT, $ARG1, removal_wsi_state_arg1(obj));
        funcall(visitor_fn, obj, $SLOT, $ARG2, removal_wsi_state_arg2(obj));
        funcall(visitor_fn, obj, $SLOT, $TRIE_ITERATOR, removal_wsi_state_trie_iterator(obj));
        funcall(visitor_fn, obj, $SLOT, $ENTRY_ITERATOR, removal_wsi_state_entry_iterator(obj));
        funcall(visitor_fn, obj, $END, MAKE_REMOVAL_WORD_STRINGS_ITERATOR_STATE, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_removal_word_strings_iterator_state_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_removal_word_strings_iterator_state(obj, visitor_fn);
    }

    public static SubLObject iterator_word_strings_done(final SubLObject state) {
        return makeBoolean((NIL != iteration.iteration_done(removal_wsi_state_trie_iterator(state))) && ((NIL == removal_wsi_state_entry_iterator(state)) || (NIL != iteration.iteration_done(removal_wsi_state_entry_iterator(state)))));
    }

    public static SubLObject wsi_entry_iterator_prepared_p(final SubLObject state) {
        return makeBoolean((NIL != removal_wsi_state_entry_iterator(state)) && (NIL == iteration.iteration_done(removal_wsi_state_entry_iterator(state))));
    }

    public static SubLObject wsi_advance_to_next_entry_iterator(final SubLObject state) {
        while ((NIL == iteration.iteration_done(removal_wsi_state_trie_iterator(state))) && (NIL == wsi_entry_iterator_prepared_p(state))) {
            final SubLObject this_pair = iteration.iteration_next(removal_wsi_state_trie_iterator(state));
            final SubLObject entries = second(this_pair);
            if (NIL != entries) {
                _csetf_removal_wsi_state_entry_iterator(state, iteration.new_list_iterator(entries));
            }
        } 
        return state;
    }

    public static SubLObject wsi_current_word_and_string_unifyP(final SubLObject state, final SubLObject current_word, final SubLObject string) {
        return makeBoolean((NIL != unification_utilities.term_unify(removal_wsi_state_arg1(state), current_word, UNPROVIDED, UNPROVIDED)) && (NIL != unification_utilities.term_unify(removal_wsi_state_arg2(state), string, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject iterator_word_strings_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject word = NIL;
        SubLObject supported_string = NIL;
        while (((NIL == word) || (NIL == supported_string)) && (NIL == iterator_word_strings_done(state))) {
            if (NIL == wsi_entry_iterator_prepared_p(state)) {
                wsi_advance_to_next_entry_iterator(state);
            }
            while ((NIL == word) && (NIL != wsi_entry_iterator_prepared_p(state))) {
                final SubLObject current_entry = iteration.iteration_next(removal_wsi_state_entry_iterator(state));
                final SubLObject speech_part_predicate = removal_wsi_state_speech_part_predicate(state);
                if ((NIL != nl_trie.nl_trie_word_p(current_entry, UNPROVIDED)) && (NIL != nl_trie.nl_trie_word_head_onlyP(current_entry))) {
                    thread.resetMultipleValues();
                    final SubLObject entry_pred = nl_trie_accessors.nl_trie_word_pred_and_supports_for_pred(current_entry, speech_part_predicate, UNPROVIDED);
                    final SubLObject supports = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == entry_pred) {
                        continue;
                    }
                    final SubLObject current_word = nl_trie.nl_trie_word_word_unit(current_entry, NIL);
                    final SubLObject string = nl_trie.nl_trie_entry_string(current_entry);
                    if (NIL == wsi_current_word_and_string_unifyP(state, current_word, string)) {
                        continue;
                    }
                    word = current_word;
                    supported_string = cons(string, supports);
                }
            } 
        } 
        return values(NIL != word ? list(removal_wsi_state_speech_part_predicate(state), word, supported_string) : NIL, state, sublisp_null(word));
    }

    public static SubLObject removal_word_strings_unify_arg1_and_arg2_iterator(final SubLObject asent) {
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(asent, UNPROVIDED);
        SubLObject speech_part_predicate = NIL;
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        destructuring_bind_must_consp(current, datum, $list63);
        speech_part_predicate = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list63);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list63);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject trie_iterator = nl_trie.new_nl_trie_iterator(UNPROVIDED);
            final SubLObject state = make_removal_word_strings_iterator_state(list($TRIE_ITERATOR, trie_iterator, $SPEECH_PART_PREDICATE, speech_part_predicate, $ARG1, arg1, $ARG2, arg2));
            return iteration.new_iterator(state, symbol_function(ITERATOR_WORD_STRINGS_DONE), symbol_function(ITERATOR_WORD_STRINGS_NEXT), UNPROVIDED);
        }
        cdestructuring_bind_error(datum, $list63);
        return NIL;
    }

    public static SubLObject removal_word_strings_unify_arg1_and_arg2_supports(final SubLObject input) {
        return second(input).rest();
    }

    public static SubLObject removal_word_strings_unify_arg1_and_arg2_output_asent(final SubLObject predicate, final SubLObject word, final SubLObject supported_string) {
        SubLObject string = NIL;
        SubLObject supports = NIL;
        destructuring_bind_must_consp(supported_string, supported_string, $list66);
        string = supported_string.first();
        final SubLObject current = supports = supported_string.rest();
        return make_binary_formula(predicate, word, string);
    }

    public static SubLObject set_up_removal_support_for_speech_part_predicate(final SubLObject spp) {
        inference_modules.register_solely_specific_removal_module_predicate(spp);
        SubLObject cdolist_list_var = $list68;
        SubLObject module = NIL;
        module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            inference_modules.inference_removal_module_use_generic(spp, module);
            cdolist_list_var = cdolist_list_var.rest();
            module = cdolist_list_var.first();
        } 
        return spp;
    }

    public static SubLObject removal_word_forms_check_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static SubLObject removal_word_forms_check_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject word = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject num_asserted = kb_indexing.relevant_num_gaf_arg_index(word, ONE_INTEGER, pred);
        final SubLObject num_rules = kb_indexing.relevant_num_gaf_arg_index(pred, ONE_INTEGER, $$regularSuffix);
        return add(num_asserted, multiply(num_rules, $avg_suffix_expansion_cost$.getGlobalValue()));
    }

    public static SubLObject removal_word_forms_check_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject word = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject string = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        final SubLObject gafs = kb_mapping.gather_gaf_arg_index(word, ONE_INTEGER, pred, NIL, UNPROVIDED);
        SubLObject foundP = NIL;
        if (NIL == gafs) {
            final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
            try {
                lexicon_vars.$lexicon_lookup_mt$.bind(mt_relevance_macros.inference_relevant_mt(), thread);
                final SubLObject words = lexicon_accessors.words_of_stringXpred(string, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != subl_promotions.memberP(word, words, symbol_function(EQUAL), UNPROVIDED)) {
                    backward.removal_add_node(make_word_strings_support(make_binary_formula(pred, word, string)), UNPROVIDED, UNPROVIDED);
                    foundP = T;
                }
            } finally {
                lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL == foundP) {
            SubLObject csome_list_var = gafs;
            SubLObject gaf = NIL;
            gaf = csome_list_var.first();
            while ((NIL == foundP) && (NIL != csome_list_var)) {
                if (NIL != cycl_string.cycl_stringE(string, assertions_high.gaf_arg2(gaf))) {
                    foundP = T;
                    backward.removal_add_node(gaf, UNPROVIDED, UNPROVIDED);
                }
                csome_list_var = csome_list_var.rest();
                gaf = csome_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject removal_word_forms_unify_arg1_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static SubLObject removal_word_forms_unify_arg1_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject string = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        return multiply(TWO_INTEGER, length(lexicon_cache.words_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject removal_word_forms_unify_arg1_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject string = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject cdolist_list_var = lexicon_cache.words_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$17;
            final SubLObject results = cdolist_list_var_$17 = lexicon_cache.strings_of_word_unit_with_supports(word, list(pred));
            SubLObject result = NIL;
            result = cdolist_list_var_$17.first();
            while (NIL != cdolist_list_var_$17) {
                final SubLObject lexicon_string = result.first();
                if (NIL != Strings.stringE(string, lexicon_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    thread.resetMultipleValues();
                    final SubLObject word_binding = unification_utilities.term_unify(arg1, word, T, T);
                    final SubLObject unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != word_binding) {
                        backward.removal_add_node(cadr(result), word_binding, append(cddr(result), unify_justification));
                    }
                }
                cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                result = cdolist_list_var_$17.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject removal_word_forms_unify_arg2_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static SubLObject removal_word_forms_unify_arg2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject word = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject pos_list = lexicon_accessors.pos_of_word(word, UNPROVIDED);
        SubLObject ans = ZERO_INTEGER;
        SubLObject cdolist_list_var = pos_list;
        SubLObject pos = NIL;
        pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ans = add(ans, kb_indexing.num_gaf_arg_index(pos, ONE_INTEGER, $$speechPartPreds, UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        } 
        return multiply(TWO_INTEGER, ans);
    }

    public static SubLObject removal_word_forms_unify_arg2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject word = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject pos_list = lexicon_accessors.pos_of_word(word, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject string = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject cdolist_list_var = pos_list;
        SubLObject pos = NIL;
        pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$18 = lexicon_utilities.preds_of_pos(pos, UNPROVIDED);
            SubLObject pred = NIL;
            pred = cdolist_list_var_$18.first();
            while (NIL != cdolist_list_var_$18) {
                SubLObject cdolist_list_var_$19;
                final SubLObject results = cdolist_list_var_$19 = lexicon_cache.strings_of_word_unit_with_supports(word, list(pred));
                SubLObject result = NIL;
                result = cdolist_list_var_$19.first();
                while (NIL != cdolist_list_var_$19) {
                    final SubLObject lexicon_string = result.first();
                    if (NIL != Strings.stringE(string, lexicon_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        thread.resetMultipleValues();
                        final SubLObject v_bindings = unification_utilities.term_unify(pred, arg2, T, T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != v_bindings) {
                            backward.removal_add_node(cadr(result), v_bindings, append(cddr(result), unify_justification));
                        }
                    }
                    cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                    result = cdolist_list_var_$19.first();
                } 
                cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                pred = cdolist_list_var_$18.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject removal_word_forms_unify_arg3_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static SubLObject removal_word_forms_unify_arg3_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return multiply(TWO_INTEGER, removal_word_forms_check_cost(asent, UNPROVIDED));
    }

    public static SubLObject removal_word_forms_unify_arg3_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject word = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject pred = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject results = cdolist_list_var = lexicon_cache.strings_of_word_unit_with_supports(word, list(pred));
        SubLObject result = NIL;
        result = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject string = result.first();
            thread.resetMultipleValues();
            final SubLObject v_bindings = unification_utilities.term_unify(string, arg3, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                backward.removal_add_node(cadr(result), v_bindings, append(cddr(result), unify_justification));
            }
            cdolist_list_var = cdolist_list_var.rest();
            result = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject removal_word_forms_unify_args_1_and_2_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static SubLObject removal_word_forms_unify_args_1_and_2_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject string = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject ans = ZERO_INTEGER;
        SubLObject cdolist_list_var = lexicon_cache.words_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$20;
            final SubLObject pos_list = cdolist_list_var_$20 = lexicon_accessors.pos_of_word(word, UNPROVIDED);
            SubLObject pos = NIL;
            pos = cdolist_list_var_$20.first();
            while (NIL != cdolist_list_var_$20) {
                ans = add(ans, multiply(TWO_INTEGER, kb_indexing.num_gaf_arg_index(pos, ONE_INTEGER, $$speechPartPreds, UNPROVIDED)));
                cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                pos = cdolist_list_var_$20.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject removal_word_forms_unify_args_1_and_2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject string = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject cdolist_list_var = lexicon_cache.words_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject word_binding = unification_utilities.term_unify(word, arg1, T, T);
            final SubLObject word_unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != word_binding) {
                SubLObject cdolist_list_var_$21;
                final SubLObject pos_list = cdolist_list_var_$21 = lexicon_accessors.pos_of_word(word, UNPROVIDED);
                SubLObject pos = NIL;
                pos = cdolist_list_var_$21.first();
                while (NIL != cdolist_list_var_$21) {
                    SubLObject cdolist_list_var_$22 = lexicon_utilities.preds_of_pos(pos, UNPROVIDED);
                    SubLObject pred = NIL;
                    pred = cdolist_list_var_$22.first();
                    while (NIL != cdolist_list_var_$22) {
                        SubLObject cdolist_list_var_$23;
                        final SubLObject results = cdolist_list_var_$23 = lexicon_cache.strings_of_word_unit_with_supports(word, list(pred));
                        SubLObject result = NIL;
                        result = cdolist_list_var_$23.first();
                        while (NIL != cdolist_list_var_$23) {
                            final SubLObject lexicon_string = result.first();
                            if (NIL != Strings.stringE(string, lexicon_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                thread.resetMultipleValues();
                                final SubLObject pred_binding = unification_utilities.term_unify(pred, arg2, T, T);
                                final SubLObject pred_unify_justification = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != pred_binding) {
                                    backward.removal_add_node(cadr(result), append(word_binding, pred_binding), append(cddr(result), word_unify_justification, pred_unify_justification));
                                }
                            }
                            cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                            result = cdolist_list_var_$23.first();
                        } 
                        cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                        pred = cdolist_list_var_$22.first();
                    } 
                    cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                    pos = cdolist_list_var_$21.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject removal_word_forms_unify_args_2_and_3_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static SubLObject removal_word_forms_unify_args_2_and_3_cost(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLObject word = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject pos_list = lexicon_accessors.pos_of_word(word, UNPROVIDED);
        SubLObject ans = ZERO_INTEGER;
        SubLObject cdolist_list_var = pos_list;
        SubLObject pos = NIL;
        pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ans = add(ans, multiply(TWO_INTEGER, kb_indexing.num_gaf_arg_index(pos, ONE_INTEGER, $$speechPartPreds, UNPROVIDED)));
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject removal_word_forms_unify_args_2_and_3_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject word = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        final SubLObject pos_list = lexicon_accessors.pos_of_word(word, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(asent, UNPROVIDED);
        SubLObject cdolist_list_var = pos_list;
        SubLObject pos = NIL;
        pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$24 = lexicon_utilities.preds_of_pos(pos, UNPROVIDED);
            SubLObject pred = NIL;
            pred = cdolist_list_var_$24.first();
            while (NIL != cdolist_list_var_$24) {
                SubLObject cdolist_list_var_$25;
                final SubLObject results = cdolist_list_var_$25 = lexicon_cache.strings_of_word_unit_with_supports(word, list(pred));
                SubLObject result = NIL;
                result = cdolist_list_var_$25.first();
                while (NIL != cdolist_list_var_$25) {
                    final SubLObject lexicon_string = result.first();
                    thread.resetMultipleValues();
                    final SubLObject pred_binding = unification_utilities.term_unify(pred, arg2, T, T);
                    final SubLObject pred_unify_justification = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != pred_binding) {
                        thread.resetMultipleValues();
                        final SubLObject string_binding = unification_utilities.term_unify(lexicon_string, arg3, T, T);
                        final SubLObject string_unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != string_binding) {
                            backward.removal_add_node(cadr(result), append(pred_binding, string_binding), append(cddr(result), pred_unify_justification, string_unify_justification));
                        }
                    }
                    cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                    result = cdolist_list_var_$25.first();
                } 
                cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                pred = cdolist_list_var_$24.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject hl_verify_term_phrases(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.non_empty_list_p(hl_justify_term_phrases(support))) {
            return T;
        }
        if ($$termStrings.eql(arguments.support_sentence_operator(support))) {
            thread.resetMultipleValues();
            final SubLObject v_term = destructure_term_phrases_support(support);
            final SubLObject string = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject ans = NIL;
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(arguments.support_mt(support));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                ans = makeBoolean((NIL == forts.fort_p(v_term)) && (NIL != ($TRUE == arguments.support_truth(support) ? removal_modules_term_strings.removal_term_strings_check_pos_output_check(v_term, string) : removal_modules_term_strings.removal_term_strings_check_neg_output_check(v_term, string))));
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            return ans;
        }
        if (NIL == lexical_only_term_phrases_asent_p(arguments.support_sentence(support))) {
            SubLObject ans2 = NIL;
            thread.resetMultipleValues();
            final SubLObject v_term2 = destructure_term_phrases_support(support);
            final SubLObject string2 = thread.secondMultipleValue();
            final SubLObject constraint = thread.thirdMultipleValue();
            final SubLObject case_insensitiveP = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            final SubLObject mt_var2 = mt_relevance_macros.with_inference_mt_relevance_validate(arguments.support_mt(support));
            final SubLObject _prev_bind_4 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_5 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_6 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var2), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var2), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var2), thread);
                final SubLObject parsed_terms = psp_main.inference_ps_get_cycls_for_phrase(string2, constraint, case_insensitiveP);
                ans2 = ($TRUE == arguments.support_truth(support)) ? list_utilities.member_equalP(v_term2, parsed_terms) : makeBoolean(NIL == list_utilities.member_equalP(v_term2, parsed_terms));
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_6, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_5, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_4, thread);
            }
            return ans2;
        }
        return NIL;
    }

    public static SubLObject hl_justify_term_phrases(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt = arguments.support_mt(support);
        SubLObject supports = NIL;
        if ($TRUE == arguments.support_truth(support)) {
            thread.resetMultipleValues();
            final SubLObject v_term = destructure_term_phrases_support(support);
            final SubLObject string = thread.secondMultipleValue();
            final SubLObject constraint = thread.thirdMultipleValue();
            final SubLObject case_insensitiveP = thread.fourthMultipleValue();
            final SubLObject lexical_onlyP = thread.fifthMultipleValue();
            thread.resetMultipleValues();
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                supports = get_term_phrases_supports(v_term, string, constraint, case_insensitiveP, lexical_onlyP);
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return supports;
    }

    public static SubLObject destructure_term_phrases_support(final SubLObject support) {
        final SubLObject asent = arguments.support_sentence(support);
        final SubLObject case_insensitiveP = case_insensitive_term_phrases_asent_p(asent);
        final SubLObject lexical_onlyP = lexical_only_term_phrases_asent_p(asent);
        SubLObject v_term = NIL;
        SubLObject string = NIL;
        SubLObject constraint = NIL;
        final SubLObject pcase_var = cycl_utilities.atomic_sentence_predicate(asent);
        if (((pcase_var.eql($$termPhrases) || pcase_var.eql($$termPhrases_Lexical)) || pcase_var.eql($$termPhrases_CaseInsensitive)) || pcase_var.eql($const90$termPhrases_CaseInsensitive_Lexic)) {
            final SubLObject datum_evaluated_var = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
            v_term = datum_evaluated_var.first();
            constraint = cadr(datum_evaluated_var);
            string = cddr(datum_evaluated_var).first();
        } else
            if (pcase_var.eql($$termStrings)) {
                final SubLObject datum_evaluated_var = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
                v_term = datum_evaluated_var.first();
                string = cadr(datum_evaluated_var);
                constraint = $$CharacterString;
            }

        return values(v_term, string, constraint, case_insensitiveP, lexical_onlyP);
    }

    public static SubLObject hl_forward_mt_combos_term_phrases(final SubLObject support) {
        final SubLObject meta_supports = hl_justify_term_phrases(support);
        SubLObject mts = NIL;
        SubLObject supports = NIL;
        SubLObject cdolist_list_var = meta_supports;
        SubLObject meta_support = NIL;
        meta_support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != assertion_handles.assertion_p(meta_support)) {
                final SubLObject item_var = assertions_high.assertion_mt(meta_support);
                if (NIL == member(item_var, mts, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    mts = cons(item_var, mts);
                }
            } else
                if (NIL != arguments.hl_support_p(meta_support)) {
                    SubLObject cdolist_list_var_$26 = hl_supports.hl_forward_mt_combos(meta_support);
                    SubLObject meta_meta_support = NIL;
                    meta_meta_support = cdolist_list_var_$26.first();
                    while (NIL != cdolist_list_var_$26) {
                        final SubLObject item_var2 = arguments.support_mt(meta_meta_support);
                        if (NIL == member(item_var2, mts, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                            mts = cons(item_var2, mts);
                        }
                        cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                        meta_meta_support = cdolist_list_var_$26.first();
                    } 
                }

            cdolist_list_var = cdolist_list_var.rest();
            meta_support = cdolist_list_var.first();
        } 
        SubLObject hl_module = NIL;
        SubLObject el_sentence = NIL;
        SubLObject mt = NIL;
        SubLObject tv = NIL;
        destructuring_bind_must_consp(support, support, $list92);
        hl_module = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list92);
        el_sentence = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list92);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, support, $list92);
        tv = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject cdolist_list_var2 = genl_mts.max_floor_mts(mts, UNPROVIDED, UNPROVIDED);
            SubLObject mt_$27 = NIL;
            mt_$27 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                supports = cons(arguments.make_hl_support(hl_module, el_sentence, mt_$27, tv), supports);
                cdolist_list_var2 = cdolist_list_var2.rest();
                mt_$27 = cdolist_list_var2.first();
            } 
        } else {
            cdestructuring_bind_error(support, $list92);
        }
        return supports;
    }

    public static SubLObject supports_have_predsP(final SubLObject supports, final SubLObject preds) {
        return list_utilities.sets_equalP(preds, get_supports_preds(supports), UNPROVIDED);
    }

    public static SubLObject get_supports_preds(final SubLObject supports) {
        return Mapping.mapcar(SUPPORT_SENTENCE_OPERATOR, supports);
    }

    public static SubLObject hl_verify_and_justify_term_phrases(final SubLObject support) {
        final SubLObject narty_support = narts_high.nart_substitute(support);
        return NIL != hl_verify_term_phrases(narty_support) ? hl_justify_term_phrases(narty_support) : NIL;
    }

    public static SubLObject removal_term_phrases_required(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        return lexicon_initialized_p();
    }

    public static SubLObject get_term_phrases_supports(final SubLObject denot, final SubLObject string, final SubLObject constraint, SubLObject case_insensitiveP, SubLObject lexical_onlyP) {
        if (case_insensitiveP == UNPROVIDED) {
            case_insensitiveP = NIL;
        }
        if (lexical_onlyP == UNPROVIDED) {
            lexical_onlyP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = list_utilities.remove_if_not(SUPPORT_P, nl_trie_accessors.nl_trie_get_term_phrases_supports(denot, string, constraint, case_insensitiveP, mt_relevance_macros.$mt$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject pos = NIL;
        SubLObject pos_pred = NIL;
        if ((NIL == supports) && (NIL == lexical_onlyP)) {
            supports = get_non_lexical_term_phrases_supports(denot, string, constraint, case_insensitiveP);
        }
        if (NIL != supports) {
            SubLObject pos_pred_support = find_if($sym105$SPEECH_PART_PRED_, supports, SUPPORT_SENTENCE_OPERATOR, UNPROVIDED, UNPROVIDED);
            if (NIL != pos_pred_support) {
                pos_pred = arguments.support_sentence_operator(pos_pred_support);
            }
            if (NIL == pos_pred) {
                pos_pred_support = find($$abbreviationForLexicalWord, supports, symbol_function(EQL), SUPPORT_SENTENCE_OPERATOR, UNPROVIDED, UNPROVIDED);
                if (NIL != pos_pred_support) {
                    pos_pred = cycl_utilities.atomic_sentence_arg2(arguments.support_sentence(pos_pred_support), UNPROVIDED);
                }
            }
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(lexicon_utilities.preds_to_pos_args())); (NIL == pos) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject pos_arg = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject pos_support = find(pred, supports, symbol_function(EQUAL), SUPPORT_SENTENCE_OPERATOR, UNPROVIDED, UNPROVIDED);
                if (NIL != pos_support) {
                    pos = cycl_utilities.atomic_sentence_arg(arguments.support_sentence(pos_support), pos_arg, UNPROVIDED);
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            if ((NIL != lexicon_accessors.speech_partP(constraint, UNPROVIDED)) && (!pos.equal(constraint))) {
                SubLObject cdolist_list_var = backward.removal_ask_justifications(list($$genls, pos, constraint), mt_relevance_macros.$mt$.getDynamicValue(thread), $TRUE, $list109).first();
                SubLObject support = NIL;
                support = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject item_var = support;
                    if (NIL == member(item_var, supports, symbol_function(EQUAL), symbol_function(SUPPORT_SENTENCE))) {
                        supports = cons(item_var, supports);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    support = cdolist_list_var.first();
                } 
            }
        }
        if (((NIL != pos) && (NIL != pos_pred)) && (NIL == member($$speechPartPreds, supports, symbol_function(EQL), SUPPORT_SENTENCE_OPERATOR))) {
            SubLObject cdolist_list_var = backward.removal_ask_justifications(list($$speechPartPreds, pos, pos_pred), mt_relevance_macros.$mt$.getDynamicValue(thread), $TRUE, $list109).first();
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject item_var = support;
                if (NIL == member(item_var, supports, symbol_function(EQUAL), symbol_function(SUPPORT_SENTENCE))) {
                    supports = cons(item_var, supports);
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            } 
        }
        return supports;
    }

    public static SubLObject get_non_lexical_term_phrases_supports(final SubLObject denot, final SubLObject string, final SubLObject constraint, final SubLObject case_insensitiveP) {
        SubLObject supports = NIL;
        if (string.isString()) {
            supports = psp_main.psp_hl_justify_parse(string, constraint, denot, case_insensitiveP);
        }
        if (NIL != list_utilities.empty_list_p(supports)) {
            SubLObject cdolist_list_var = pph_methods_lexicon.hl_justify_string_for_term(denot, string, preds_from_term_phrases_constraint(constraint), case_insensitiveP);
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == formula_pattern_match.formula_matches_pattern(arguments.support_sentence(support), list($list110, denot, constraint, string))) {
                    supports = cons(support, supports);
                }
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            } 
        }
        return supports;
    }

    public static SubLObject do_lexical_gafs(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list111);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject gaf = NIL;
        SubLObject v_term = NIL;
        SubLObject predicate = NIL;
        SubLObject index_arg = NIL;
        destructuring_bind_must_consp(current, datum, $list111);
        gaf = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list111);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list111);
        predicate = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list111);
        index_arg = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(PIF, list(INDEXED_TERM_P, v_term), listS(DO_GAF_ARG_INDEX, listS(gaf, new SubLObject[]{ v_term, $PREDICATE, predicate, $INDEX, index_arg, $list117 }), append(body, NIL)), listS(DO_GAF_ARG_INDEX_NAUT, listS(gaf, new SubLObject[]{ v_term, $PREDICATE, predicate, $INDEX, index_arg, $list117 }), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list111);
        return NIL;
    }

    public static SubLObject removal_term_phrases_unify_arg3_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject v_term = NIL;
        SubLObject constraint = NIL;
        SubLObject arg3 = NIL;
        destructuring_bind_must_consp(current, datum, $list119);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list119);
        constraint = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list119);
        arg3 = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject preds = preds_from_term_phrases_constraint(constraint);
            final SubLObject lexical_onlyP = lexical_only_term_phrases_asent_p(asent);
            if (NIL != preds) {
                final SubLObject strings = removal_modules_term_strings.inference_strings_for_term(v_term, preds, lexical_onlyP);
                add_term_phrases_removal_nodes(strings, asent, arg3);
            }
        } else {
            cdestructuring_bind_error(datum, $list119);
        }
        return NIL;
    }

    public static SubLObject add_term_phrases_removal_nodes(final SubLObject values, final SubLObject asent, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = values;
        SubLObject value = NIL;
        value = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject v_bindings = (NIL != case_insensitive_term_phrases_asent_p(asent)) ? term_unify_case_insensitive(value, target, T, T) : unification_utilities.term_unify(value, target, T, T);
            final SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != v_bindings) {
                final SubLObject formula = bindings.subst_bindings(v_bindings, asent);
                final SubLObject hl_support = make_term_phrases_support(formula);
                backward.removal_add_node(hl_support, v_bindings, unify_justification);
            }
            cdolist_list_var = cdolist_list_var.rest();
            value = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject make_term_phrases_support(final SubLObject formula) {
        return arguments.make_hl_support($TERM_PHRASES, formula, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject term_unify_case_insensitive(final SubLObject value, final SubLObject target, SubLObject share_vars, SubLObject justifyP) {
        if (share_vars == UNPROVIDED) {
            share_vars = T;
        }
        if (justifyP == UNPROVIDED) {
            justifyP = NIL;
        }
        return unification_utilities.term_unify(value.isString() ? Strings.string_downcase(value, UNPROVIDED, UNPROVIDED) : value, target.isString() ? Strings.string_downcase(target, UNPROVIDED, UNPROVIDED) : target, share_vars, justifyP);
    }

    public static SubLObject preds_from_term_phrases_constraint(final SubLObject constraint) {
        SubLObject preds = NIL;
        if (NIL != lexicon_accessors.speech_partP(constraint, UNPROVIDED)) {
            preds = lexicon_accessors.all_preds_of_pos(constraint);
        } else
            if (NIL != lexicon_accessors.speech_part_predP(constraint, UNPROVIDED)) {
                preds = remove_if(symbol_function($sym121$GENERIC_PRED_), genl_predicates.all_spec_preds(constraint, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else
                if (NIL != isa.isaP(constraint, $$StringIndexingSlot, UNPROVIDED, UNPROVIDED)) {
                    preds = list_utilities.remove_if_not($sym123$NAME_STRING_PRED_, genl_predicates.all_spec_preds(constraint, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else
                    if (constraint.eql($$ProperNameString)) {
                        preds = list_utilities.remove_if_not($sym123$NAME_STRING_PRED_, kb_mapping_utilities.pred_values($$ProperNameString, $$arg2Isa, TWO_INTEGER, ONE_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if (constraint.eql($$CharacterString)) {
                            preds = $ALL;
                        }




        if (NIL == lexicon_accessors.speech_partP(constraint, UNPROVIDED)) {
            final SubLObject pos_of_cat = lexicon_utilities.pos_of_cat(constraint, UNPROVIDED);
            if (NIL != pos_of_cat) {
                final SubLObject items_var = preds_from_term_phrases_constraint(pos_of_cat);
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
                        preds = cons(item, preds);
                    }
                } else {
                    SubLObject cdolist_list_var = items_var;
                    SubLObject item2 = NIL;
                    item2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        preds = cons(item2, preds);
                        cdolist_list_var = cdolist_list_var.rest();
                        item2 = cdolist_list_var.first();
                    } 
                }
                preds = delete_duplicates(preds, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
        if ((preds != $ALL) && (NIL != genls.genlP($$NLWordForm, constraint, UNPROVIDED, UNPROVIDED))) {
            preds = $ALL;
        }
        if ((NIL != genls.genlP($$NounPhrase, constraint, UNPROVIDED, UNPROVIDED)) && preds.isList()) {
            preds = append(preds, list_utilities.remove_if_not($sym123$NAME_STRING_PRED_, kb_mapping_utilities.pred_values($$ProperNameString, $$arg2Isa, TWO_INTEGER, ONE_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            preds = append(preds, genl_predicates.all_spec_preds($$nonSingular_Generic, UNPROVIDED, UNPROVIDED));
        }
        return preds;
    }

    public static SubLObject generic_predP(final SubLObject pred) {
        return isa.isaP(pred, $$GenericSpeechPartPredicate, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject removal_term_phrases_unify_arg1_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject arg1 = NIL;
        SubLObject constraint = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, $list147);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list147);
        constraint = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list147);
        string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject preds = preds_from_term_phrases_constraint(constraint);
            final SubLObject case_insensitiveP = case_insensitive_term_phrases_asent_p(asent);
            final SubLObject lexical_onlyP = lexical_only_term_phrases_asent_p(asent);
            final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
            try {
                lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind(NIL == case_insensitiveP ? $ON : $OFF, thread);
                if (preds.isList()) {
                    SubLObject found_oneP = NIL;
                    SubLObject support_sentence = copy_expression(asent);
                    SubLObject no_lexical_denotsP = NIL;
                    final SubLObject _prev_bind_0_$28 = lexicon_vars.$parse_morphologically$.currentBinding(thread);
                    try {
                        lexicon_vars.$parse_morphologically$.bind($NEVER, thread);
                        SubLObject cdolist_list_var = preds;
                        SubLObject pred = NIL;
                        pred = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject denots = inference_denots_of_stringXpred(string, pred);
                            if (NIL != denots) {
                                found_oneP = T;
                                support_sentence = nreplace_formula_arg(TWO_INTEGER, pred, support_sentence);
                                add_term_phrases_removal_nodes(denots, support_sentence, arg1);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            pred = cdolist_list_var.first();
                        } 
                        no_lexical_denotsP = makeBoolean(NIL == found_oneP);
                    } finally {
                        lexicon_vars.$parse_morphologically$.rebind(_prev_bind_0_$28, thread);
                    }
                    if (NIL != no_lexical_denotsP) {
                        final SubLObject _prev_bind_0_$29 = lexicon_vars.$parse_morphologically$.currentBinding(thread);
                        try {
                            lexicon_vars.$parse_morphologically$.bind($ONLY, thread);
                            SubLObject cdolist_list_var = preds;
                            SubLObject pred = NIL;
                            pred = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                final SubLObject denots = inference_denots_of_stringXpred(string, pred);
                                if (NIL != denots) {
                                    found_oneP = T;
                                    support_sentence = nreplace_formula_arg(TWO_INTEGER, pred, support_sentence);
                                    add_term_phrases_removal_nodes(denots, support_sentence, arg1);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                pred = cdolist_list_var.first();
                            } 
                            no_lexical_denotsP = makeBoolean(NIL == found_oneP);
                        } finally {
                            lexicon_vars.$parse_morphologically$.rebind(_prev_bind_0_$29, thread);
                        }
                    }
                } else {
                    add_term_phrases_removal_nodes(inference_denots_of_string(string), asent, arg1);
                }
            } finally {
                lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_0, thread);
            }
            if (NIL == lexical_onlyP) {
                SubLObject timed_outP = NIL;
                if (NIL != inference_strategist.current_controlling_inference_time_remaining()) {
                    final SubLObject _prev_bind_2 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                    try {
                        parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                        parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(inference_strategist.current_controlling_inference_time_remaining()), thread);
                        parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                        parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                        if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                            add_term_phrases_removal_nodes(psp_main.inference_ps_get_cycls_for_phrase(string, constraint, case_insensitiveP), asent, arg1);
                        }
                        timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                    } finally {
                        parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_4, thread);
                        parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_3, thread);
                        parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_2, thread);
                    }
                } else {
                    add_term_phrases_removal_nodes(psp_main.inference_ps_get_cycls_for_phrase(string, constraint, case_insensitiveP), asent, arg1);
                    timed_outP = NIL;
                }
            }
        } else {
            cdestructuring_bind_error(datum, $list147);
        }
        return NIL;
    }

    public static SubLObject case_insensitive_term_phrases_asent_p(final SubLObject asent) {
        return subl_promotions.memberP(cycl_utilities.atomic_sentence_predicate(asent), $list152, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject lexical_only_term_phrases_asent_p(final SubLObject asent) {
        return subl_promotions.memberP(cycl_utilities.atomic_sentence_predicate(asent), $list153, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject inference_denots_of_string(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denots = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
            denots = lexicon_accessors.denots_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return denots;
    }

    public static SubLObject inference_denots_of_stringXpred(final SubLObject string, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject denots = NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
        try {
            lexicon_vars.$lexicon_lookup_mt$.bind(mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
            denots = lexicon_accessors.denots_of_stringXpred(string, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } finally {
            lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
        }
        return denots;
    }

    public static SubLObject removal_term_phrases_unify_arg1_and_arg2_expand(final SubLObject asent, SubLObject sense) {
        if (sense == UNPROVIDED) {
            sense = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, $list158);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list158);
        arg2 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list158);
        string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject _prev_bind_0 = lexicon_vars.$lexicon_lookup_mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
            try {
                lexicon_vars.$lexicon_lookup_mt$.bind(mt_relevance_macros.$mt$.getDynamicValue(thread), thread);
                lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind(NIL == case_insensitive_term_phrases_asent_p(asent) ? $ON : $OFF, thread);
                thread.resetMultipleValues();
                final SubLObject denots = lexicon_accessors.denots_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject pred_lists = thread.secondMultipleValue();
                thread.resetMultipleValues();
                add_term_phrases_arg1_and_arg2_removal_nodes(asent, denots, pred_lists);
            } finally {
                lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_2, thread);
                lexicon_vars.$lexicon_lookup_mt$.rebind(_prev_bind_0, thread);
            }
            if (NIL == lexical_only_term_phrases_asent_p(asent)) {
                SubLObject timed_outP = NIL;
                if (NIL != inference_strategist.current_controlling_inference_time_remaining()) {
                    final SubLObject _prev_bind_3 = parsing_macros.$parsing_timeout_time_check_count$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = parsing_macros.$parsing_timeout_time$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = parsing_macros.$parsing_timeout_reachedP$.currentBinding(thread);
                    try {
                        parsing_macros.$parsing_timeout_time_check_count$.bind(ZERO_INTEGER, thread);
                        parsing_macros.$parsing_timeout_time$.bind(parsing_macros.parsing_compute_timeout_time(inference_strategist.current_controlling_inference_time_remaining()), thread);
                        parsing_macros.$parsing_timeout_reachedP$.bind(parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread), thread);
                        parsing_macros.$parsing_timeout_reachedP$.setDynamicValue(parsing_macros.parsing_timeout_time_reachedP(), thread);
                        if (NIL == parsing_macros.$parsing_timeout_reachedP$.getDynamicValue(thread)) {
                            SubLObject cdolist_list_var = psp_main.inference_ps_get_cycls_and_constraints_for_phrase(string, case_insensitive_term_phrases_asent_p(asent));
                            SubLObject pair = NIL;
                            pair = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                SubLObject current_$31;
                                final SubLObject datum_$30 = current_$31 = pair;
                                SubLObject denot = NIL;
                                SubLObject pred = NIL;
                                destructuring_bind_must_consp(current_$31, datum_$30, $list159);
                                denot = current_$31.first();
                                current_$31 = current_$31.rest();
                                destructuring_bind_must_consp(current_$31, datum_$30, $list159);
                                pred = current_$31.first();
                                current_$31 = current_$31.rest();
                                if (NIL == current_$31) {
                                    add_term_phrases_arg1_and_arg2_removal_node(asent, denot, pred);
                                } else {
                                    cdestructuring_bind_error(datum_$30, $list159);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                pair = cdolist_list_var.first();
                            } 
                        }
                        timed_outP = parsing_macros.parsing_timeout_time_reachedP();
                    } finally {
                        parsing_macros.$parsing_timeout_reachedP$.rebind(_prev_bind_5, thread);
                        parsing_macros.$parsing_timeout_time$.rebind(_prev_bind_4, thread);
                        parsing_macros.$parsing_timeout_time_check_count$.rebind(_prev_bind_3, thread);
                    }
                } else {
                    SubLObject cdolist_list_var2 = psp_main.inference_ps_get_cycls_and_constraints_for_phrase(string, case_insensitive_term_phrases_asent_p(asent));
                    SubLObject pair2 = NIL;
                    pair2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        SubLObject current_$32;
                        final SubLObject datum_$31 = current_$32 = pair2;
                        SubLObject denot2 = NIL;
                        SubLObject pred2 = NIL;
                        destructuring_bind_must_consp(current_$32, datum_$31, $list159);
                        denot2 = current_$32.first();
                        current_$32 = current_$32.rest();
                        destructuring_bind_must_consp(current_$32, datum_$31, $list159);
                        pred2 = current_$32.first();
                        current_$32 = current_$32.rest();
                        if (NIL == current_$32) {
                            add_term_phrases_arg1_and_arg2_removal_node(asent, denot2, pred2);
                        } else {
                            cdestructuring_bind_error(datum_$31, $list159);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        pair2 = cdolist_list_var2.first();
                    } 
                    timed_outP = NIL;
                }
            }
        } else {
            cdestructuring_bind_error(datum, $list158);
        }
        return NIL;
    }

    public static SubLObject add_term_phrases_arg1_and_arg2_removal_nodes(final SubLObject asent, final SubLObject denots, final SubLObject pred_lists) {
        SubLObject denot = NIL;
        SubLObject denot_$34 = NIL;
        SubLObject pred_list = NIL;
        SubLObject pred_list_$35 = NIL;
        denot = denots;
        denot_$34 = denot.first();
        pred_list = pred_lists;
        pred_list_$35 = pred_list.first();
        while ((NIL != pred_list) || (NIL != denot)) {
            SubLObject cdolist_list_var = pred_list_$35;
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                add_term_phrases_arg1_and_arg2_removal_node(asent, denot_$34, pred);
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
            denot = denot.rest();
            denot_$34 = denot.first();
            pred_list = pred_list.rest();
            pred_list_$35 = pred_list.first();
        } 
        return NIL;
    }

    public static SubLObject add_term_phrases_arg1_and_arg2_removal_node(final SubLObject asent, final SubLObject denot, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, $list158);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list158);
        arg2 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list158);
        string = current.first();
        current = current.rest();
        if (NIL == current) {
            thread.resetMultipleValues();
            final SubLObject denot_bindings = unification_utilities.term_unify(denot, arg1, T, T);
            final SubLObject denot_unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = term_phrases_constraints_from_pred(pred);
            SubLObject constraint = NIL;
            constraint = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject constraint_bindings = unification_utilities.term_unify(constraint, arg2, T, T);
                final SubLObject constraint_unify_justification = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL == bindings.some_variable_with_conflicting_bindings(denot_bindings, constraint_bindings)) {
                    final SubLObject all_bindings = append(denot_bindings, constraint_bindings);
                    final SubLObject formula = bindings.subst_bindings(all_bindings, asent);
                    final SubLObject hl_support = make_term_phrases_support(formula);
                    backward.removal_add_node(hl_support, all_bindings, append(denot_unify_justification, constraint_unify_justification));
                }
                cdolist_list_var = cdolist_list_var.rest();
                constraint = cdolist_list_var.first();
            } 
        } else {
            cdestructuring_bind_error(datum, $list158);
        }
        return NIL;
    }

    public static SubLObject term_phrases_constraints_from_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject constraints = list($$CharacterString);
        final SubLObject name_string_predP = lexicon_vars.name_string_predP(pred);
        final SubLObject pos = ((NIL != name_string_predP) || (NIL == lexicon_accessors.speech_part_predP(pred, UNPROVIDED))) ? NIL : lexicon_accessors.pos_of_pred(pred);
        final SubLObject deck_type = $QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = NIL;
                final SubLObject _prev_bind_0_$36 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str26$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$37 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$38 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                            final SubLObject _prev_bind_0_$38 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$39 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$41 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    final SubLObject node_var_$42 = node_and_predicate_mode.first();
                                    final SubLObject predicate_mode = second(node_and_predicate_mode);
                                    final SubLObject genl_predicate = node_var_$42;
                                    final SubLObject _prev_bind_0_$39 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        if ((NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$42)) && (NIL != isa.isaP(genl_predicate, $$TermPhrasesConstraint, UNPROVIDED, UNPROVIDED))) {
                                            constraints = cons(genl_predicate, constraints);
                                        }
                                        SubLObject cdolist_list_var;
                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject _prev_bind_0_$40 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$40 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var_$42);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$41 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$47;
                                                                        for (iteration_state_$47 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$47); iteration_state_$47 = dictionary_contents.do_dictionary_contents_next(iteration_state_$47)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$47);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$42 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (NIL != csome_list_var) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str28$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$42, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$47);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$41, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str29$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$49;
                                                        final SubLObject new_list = cdolist_list_var_$49 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$49.first();
                                                        while (NIL != cdolist_list_var_$49) {
                                                            final SubLObject _prev_bind_0_$43 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                            deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (NIL != csome_list_var2) {
                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error($str28$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$43, thread);
                                                            }
                                                            cdolist_list_var_$49 = cdolist_list_var_$49.rest();
                                                            generating_fn = cdolist_list_var_$49.first();
                                                        } 
                                                    }

                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$40, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$40, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            module_var = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$39, thread);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$41, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$39, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$38, thread);
                            }
                        } else {
                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str30$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$38, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$37, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$36, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$44 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        if (NIL != name_string_predP) {
            constraints = cons($$ProperNameString, constraints);
            constraints = cons($$NounPhrase, constraints);
            final SubLObject deck_type_$53 = $QUEUE;
            final SubLObject recur_deck_$54 = deck.create_deck(deck_type_$53);
            final SubLObject _prev_bind_6 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var2 = NIL;
                    final SubLObject _prev_bind_0_$45 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var2 ? tv_var2 : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var2 ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (((NIL != tv_var2) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var2))) {
                            final SubLObject pcase_var2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var2.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str21$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var2.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str21$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var2.eql($WARN)) {
                                        Errors.warn($str21$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str26$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str21$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P);
                                    }


                        }
                        final SubLObject _prev_bind_0_$46 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$41 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_10 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$47 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$42 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$42 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    SubLObject cdolist_list_var2;
                                    final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                    SubLObject module_var2 = NIL;
                                    module_var2 = cdolist_list_var2.first();
                                    while (NIL != cdolist_list_var2) {
                                        final SubLObject _prev_bind_0_$48 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$43 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                            final SubLObject node2 = function_terms.naut_to_nart(pred);
                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                if (NIL != d_link2) {
                                                    final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != mt_links2) {
                                                        SubLObject iteration_state2;
                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                            final SubLObject tv_links2 = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                final SubLObject _prev_bind_0_$49 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                    SubLObject iteration_state_$48;
                                                                    for (iteration_state_$48 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$48); iteration_state_$48 = dictionary_contents.do_dictionary_contents_next(iteration_state_$48)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$48);
                                                                        final SubLObject link_nodes3 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                            final SubLObject _prev_bind_0_$50 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                final SubLObject sol3 = link_nodes3;
                                                                                if (NIL != set.set_p(sol3)) {
                                                                                    final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                    SubLObject basis_object3;
                                                                                    SubLObject state3;
                                                                                    SubLObject node_vars_link_node5;
                                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                        node_vars_link_node5 = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node5)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node5, UNPROVIDED))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node5, UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node5, recur_deck_$54);
                                                                                        }
                                                                                    }
                                                                                } else
                                                                                    if (sol3.isList()) {
                                                                                        SubLObject csome_list_var3 = sol3;
                                                                                        SubLObject node_vars_link_node6 = NIL;
                                                                                        node_vars_link_node6 = csome_list_var3.first();
                                                                                        while (NIL != csome_list_var3) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node6, UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node6, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node6, recur_deck_$54);
                                                                                            }
                                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                                            node_vars_link_node6 = csome_list_var3.first();
                                                                                        } 
                                                                                    } else {
                                                                                        Errors.error($str28$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                    }

                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$50, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$48);
                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$49, thread);
                                                                }
                                                            }
                                                        }
                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                    }
                                                } else {
                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str29$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                            } else
                                                if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                    SubLObject cdolist_list_var_$50;
                                                    final SubLObject new_list2 = cdolist_list_var_$50 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    SubLObject generating_fn2 = NIL;
                                                    generating_fn2 = cdolist_list_var_$50.first();
                                                    while (NIL != cdolist_list_var_$50) {
                                                        final SubLObject _prev_bind_0_$51 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                        try {
                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                            final SubLObject sol4;
                                                            final SubLObject link_nodes4 = sol4 = funcall(generating_fn2, node2);
                                                            if (NIL != set.set_p(sol4)) {
                                                                final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                SubLObject basis_object4;
                                                                SubLObject state4;
                                                                SubLObject node_vars_link_node7;
                                                                for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                    node_vars_link_node7 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node7)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node7, UNPROVIDED))) {
                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node7, UNPROVIDED);
                                                                        deck.deck_push(node_vars_link_node7, recur_deck_$54);
                                                                    }
                                                                }
                                                            } else
                                                                if (sol4.isList()) {
                                                                    SubLObject csome_list_var4 = sol4;
                                                                    SubLObject node_vars_link_node8 = NIL;
                                                                    node_vars_link_node8 = csome_list_var4.first();
                                                                    while (NIL != csome_list_var4) {
                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node8, UNPROVIDED)) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node8, UNPROVIDED);
                                                                            deck.deck_push(node_vars_link_node8, recur_deck_$54);
                                                                        }
                                                                        csome_list_var4 = csome_list_var4.rest();
                                                                        node_vars_link_node8 = csome_list_var4.first();
                                                                    } 
                                                                } else {
                                                                    Errors.error($str28$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                }

                                                        } finally {
                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$51, thread);
                                                        }
                                                        cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                                                        generating_fn2 = cdolist_list_var_$50.first();
                                                    } 
                                                }

                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$43, thread);
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$48, thread);
                                        }
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        module_var2 = cdolist_list_var2.first();
                                    } 
                                    SubLObject node_var_$43 = deck.deck_pop(recur_deck_$54);
                                    final SubLObject _prev_bind_0_$52 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$44 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$43 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    try {
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_search_vars.get_sbhl_search_module()), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), thread);
                                        while (NIL != node_var_$43) {
                                            final SubLObject v_isa = node_var_$43;
                                            if (NIL != isa.isaP(v_isa, $$TermPhrasesConstraint, UNPROVIDED, UNPROVIDED)) {
                                                constraints = cons(v_isa, constraints);
                                            }
                                            SubLObject cdolist_list_var3;
                                            final SubLObject accessible_modules3 = cdolist_list_var3 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                            SubLObject module_var3 = NIL;
                                            module_var3 = cdolist_list_var3.first();
                                            while (NIL != cdolist_list_var3) {
                                                final SubLObject _prev_bind_0_$53 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$45 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var3, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node3 = function_terms.naut_to_nart(node_var_$43);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node3)) {
                                                        final SubLObject d_link3 = sbhl_graphs.get_sbhl_graph_link(node3, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link3) {
                                                            final SubLObject mt_links3 = sbhl_links.get_sbhl_mt_links(d_link3, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links3) {
                                                                SubLObject iteration_state3;
                                                                for (iteration_state3 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links3)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state3); iteration_state3 = dictionary_contents.do_dictionary_contents_next(iteration_state3)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state3);
                                                                    final SubLObject tv_links3 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                        final SubLObject _prev_bind_0_$54 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                            SubLObject iteration_state_$49;
                                                                            for (iteration_state_$49 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links3)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$49); iteration_state_$49 = dictionary_contents.do_dictionary_contents_next(iteration_state_$49)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$49);
                                                                                final SubLObject link_nodes5 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv3)) {
                                                                                    final SubLObject _prev_bind_0_$55 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv3, thread);
                                                                                        final SubLObject sol5 = link_nodes5;
                                                                                        if (NIL != set.set_p(sol5)) {
                                                                                            final SubLObject set_contents_var5 = set.do_set_internal(sol5);
                                                                                            SubLObject basis_object5;
                                                                                            SubLObject state5;
                                                                                            SubLObject node_vars_link_node9;
                                                                                            for (basis_object5 = set_contents.do_set_contents_basis_object(set_contents_var5), state5 = NIL, state5 = set_contents.do_set_contents_initial_state(basis_object5, set_contents_var5); NIL == set_contents.do_set_contents_doneP(basis_object5, state5); state5 = set_contents.do_set_contents_update_state(state5)) {
                                                                                                node_vars_link_node9 = set_contents.do_set_contents_next(basis_object5, state5);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state5, node_vars_link_node9)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node9, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node9, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node9, recur_deck_$54);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol5.isList()) {
                                                                                                SubLObject csome_list_var5 = sol5;
                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                node_vars_link_node = csome_list_var5.first();
                                                                                                while (NIL != csome_list_var5) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck_$54);
                                                                                                    }
                                                                                                    csome_list_var5 = csome_list_var5.rest();
                                                                                                    node_vars_link_node = csome_list_var5.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str28$_A_is_neither_SET_P_nor_LISTP_, sol5);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$55, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$49);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$54, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state3);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str29$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node3, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$51;
                                                            final SubLObject new_list3 = cdolist_list_var_$51 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn3 = NIL;
                                                            generating_fn3 = cdolist_list_var_$51.first();
                                                            while (NIL != cdolist_list_var_$51) {
                                                                final SubLObject _prev_bind_0_$56 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn3, thread);
                                                                    final SubLObject sol6;
                                                                    final SubLObject link_nodes6 = sol6 = funcall(generating_fn3, node3);
                                                                    if (NIL != set.set_p(sol6)) {
                                                                        final SubLObject set_contents_var6 = set.do_set_internal(sol6);
                                                                        SubLObject node_vars_link_node6;
                                                                        SubLObject basis_object6;
                                                                        SubLObject state6;
                                                                        for (basis_object6 = set_contents.do_set_contents_basis_object(set_contents_var6), state6 = NIL, state6 = set_contents.do_set_contents_initial_state(basis_object6, set_contents_var6); NIL == set_contents.do_set_contents_doneP(basis_object6, state6); state6 = set_contents.do_set_contents_update_state(state6)) {
                                                                            node_vars_link_node6 = set_contents.do_set_contents_next(basis_object6, state6);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state6, node_vars_link_node6)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node6, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node6, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node6, recur_deck_$54);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol6.isList()) {
                                                                            SubLObject csome_list_var6 = sol6;
                                                                            SubLObject node_vars_link_node3 = NIL;
                                                                            node_vars_link_node3 = csome_list_var6.first();
                                                                            while (NIL != csome_list_var6) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck_$54);
                                                                                }
                                                                                csome_list_var6 = csome_list_var6.rest();
                                                                                node_vars_link_node3 = csome_list_var6.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str28$_A_is_neither_SET_P_nor_LISTP_, sol6);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$56, thread);
                                                                }
                                                                cdolist_list_var_$51 = cdolist_list_var_$51.rest();
                                                                generating_fn3 = cdolist_list_var_$51.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$45, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$53, thread);
                                                }
                                                cdolist_list_var3 = cdolist_list_var3.rest();
                                                module_var3 = cdolist_list_var3.first();
                                            } 
                                            node_var_$43 = deck.deck_pop(recur_deck_$54);
                                        } 
                                    } finally {
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_2_$43, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$44, thread);
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$52, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$42, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$42, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$47, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str30$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_10, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_9, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_8, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$41, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$46, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_7, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$45, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$57 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$57, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_6, thread);
            }
        } else
            if (NIL != pos) {
                if (NIL != lexicon_accessors.genl_pos_predP(pred, $$nonSingular_Generic, UNPROVIDED)) {
                    constraints = cons($$NounPhrase, constraints);
                }
                SubLObject node_var_$44 = pos;
                final SubLObject deck_type_$54 = $STACK;
                final SubLObject recur_deck_$55 = deck.create_deck(deck_type_$54);
                final SubLObject _prev_bind_6 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var2 = NIL;
                        final SubLObject _prev_bind_0_$58 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var2 ? tv_var2 : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var2 ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var2) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var2))) {
                                final SubLObject pcase_var2 = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var2.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str21$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var2.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str21$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var2.eql($WARN)) {
                                            Errors.warn($str21$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str26$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str21$_A_is_not_a__A, tv_var2, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$59 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$46 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_8 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_9 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_10 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pos, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$60 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$47 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$44 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$44, UNPROVIDED);
                                        while (NIL != node_var_$44) {
                                            final SubLObject genl = node_var_$44;
                                            if (NIL != isa.isaP(genl, $$TermPhrasesConstraint, UNPROVIDED, UNPROVIDED)) {
                                                constraints = cons(genl, constraints);
                                            }
                                            SubLObject cdolist_list_var2;
                                            final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                            SubLObject module_var2 = NIL;
                                            module_var2 = cdolist_list_var2.first();
                                            while (NIL != cdolist_list_var2) {
                                                final SubLObject _prev_bind_0_$61 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$48 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node2 = function_terms.naut_to_nart(node_var_$44);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                        final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link2) {
                                                            final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links2) {
                                                                SubLObject iteration_state2;
                                                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                    final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                        final SubLObject _prev_bind_0_$62 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                            SubLObject iteration_state_$50;
                                                                            for (iteration_state_$50 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$50); iteration_state_$50 = dictionary_contents.do_dictionary_contents_next(iteration_state_$50)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$50);
                                                                                final SubLObject link_nodes3 = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$63 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol3 = link_nodes3;
                                                                                        if (NIL != set.set_p(sol3)) {
                                                                                            final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                            SubLObject basis_object3;
                                                                                            SubLObject state3;
                                                                                            SubLObject node_vars_link_node5;
                                                                                            for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                node_vars_link_node5 = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node5)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node5, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node5, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node5, recur_deck_$55);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol3.isList()) {
                                                                                                SubLObject csome_list_var3 = sol3;
                                                                                                SubLObject node_vars_link_node6 = NIL;
                                                                                                node_vars_link_node6 = csome_list_var3.first();
                                                                                                while (NIL != csome_list_var3) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node6, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node6, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node6, recur_deck_$55);
                                                                                                    }
                                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                                    node_vars_link_node6 = csome_list_var3.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str28$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$63, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$50);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$62, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str29$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$52;
                                                            final SubLObject new_list2 = cdolist_list_var_$52 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn2 = NIL;
                                                            generating_fn2 = cdolist_list_var_$52.first();
                                                            while (NIL != cdolist_list_var_$52) {
                                                                final SubLObject _prev_bind_0_$64 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes4 = sol4 = funcall(generating_fn2, node2);
                                                                    if (NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node7;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node7 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node7)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node7, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node7, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node7, recur_deck_$55);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol4.isList()) {
                                                                            SubLObject csome_list_var4 = sol4;
                                                                            SubLObject node_vars_link_node8 = NIL;
                                                                            node_vars_link_node8 = csome_list_var4.first();
                                                                            while (NIL != csome_list_var4) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node8, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node8, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node8, recur_deck_$55);
                                                                                }
                                                                                csome_list_var4 = csome_list_var4.rest();
                                                                                node_vars_link_node8 = csome_list_var4.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str28$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$64, thread);
                                                                }
                                                                cdolist_list_var_$52 = cdolist_list_var_$52.rest();
                                                                generating_fn2 = cdolist_list_var_$52.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$48, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$61, thread);
                                                }
                                                cdolist_list_var2 = cdolist_list_var2.rest();
                                                module_var2 = cdolist_list_var2.first();
                                            } 
                                            node_var_$44 = deck.deck_pop(recur_deck_$55);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$44, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$47, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$60, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str30$Node__a_does_not_pass_sbhl_type_t, pos, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_10, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_9, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_8, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$46, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$59, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_7, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$58, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$65 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$65, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_6, thread);
                }
            }

        return constraints;
    }

    public static SubLObject removal_lexicon_namestring_expand(final SubLObject asent, final SubLObject sense) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(asent, UNPROVIDED);
        SubLObject pred = NIL;
        SubLObject arg1 = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, datum, $list164);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list164);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list164);
        string = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject cdolist_list_var = nl_trie_accessors.nl_trie_assertions_with_string_and_namestring_pred(string, pred, T, mt_relevance_macros.$mt$.getDynamicValue(thread), UNPROVIDED);
            SubLObject as = NIL;
            as = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject success = formula_pattern_match.formula_matches_pattern(assertions_high.gaf_formula(as), list($list165, $list166, string));
                final SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != success) {
                    final SubLObject name_pred = list_utilities.alist_lookup_without_values(v_bindings, NAME_PRED, UNPROVIDED, UNPROVIDED);
                    final SubLObject denot = list_utilities.alist_lookup_without_values(v_bindings, DENOT, UNPROVIDED, UNPROVIDED);
                    if (NIL != lexicon_accessors.genl_pos_predP(name_pred, pred, UNPROVIDED)) {
                        thread.resetMultipleValues();
                        final SubLObject v_bindings_$96 = unification_utilities.term_unify(denot, arg1, T, T);
                        final SubLObject unify_justification = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject more_supports = (name_pred.eql(pred)) ? NIL : list(arguments.make_hl_support($GENLPREDS, make_binary_formula($$genlPreds, name_pred, pred), UNPROVIDED, UNPROVIDED));
                        if (NIL != v_bindings_$96) {
                            backward.removal_add_node(as, v_bindings_$96, append(more_supports, unify_justification));
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                as = cdolist_list_var.first();
            } 
        } else {
            cdestructuring_bind_error(datum, $list164);
        }
        return NIL;
    }

    public static SubLObject removal_lexicon_namestring_completeP(final SubLObject asent) {
        return makeBoolean(NIL == el_formula_with_operator_p(asent, $$termStrings));
    }

    public static SubLObject declare_removal_modules_lexicon_file() {
        declareFunction(me, "removal_word_strings_check_required", "REMOVAL-WORD-STRINGS-CHECK-REQUIRED", 1, 1, false);
        declareFunction(me, "hl_verify_word_strings", "HL-VERIFY-WORD-STRINGS", 1, 0, false);
        declareFunction(me, "hl_justify_word_strings", "HL-JUSTIFY-WORD-STRINGS", 1, 0, false);
        declareFunction(me, "hl_forward_mt_combos_word_strings", "HL-FORWARD-MT-COMBOS-WORD-STRINGS", 1, 0, false);
        declareFunction(me, "removal_word_strings_check_succeedsP", "REMOVAL-WORD-STRINGS-CHECK-SUCCEEDS?", 1, 0, false);
        declareFunction(me, "removal_word_strings_check_expand", "REMOVAL-WORD-STRINGS-CHECK-EXPAND", 1, 1, false);
        declareFunction(me, "make_word_strings_support", "MAKE-WORD-STRINGS-SUPPORT", 1, 0, false);
        declareFunction(me, "removal_word_strings_unify_arg1_required", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-REQUIRED", 1, 1, false);
        declareFunction(me, "removal_word_strings_unify_arg1_output_generate", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-OUTPUT-GENERATE", 2, 0, false);
        declareFunction(me, "removal_word_strings_unify_arg2_required", "REMOVAL-WORD-STRINGS-UNIFY-ARG2-REQUIRED", 1, 1, false);
        declareFunction(me, "removal_word_strings_unify_arg2_cost", "REMOVAL-WORD-STRINGS-UNIFY-ARG2-COST", 1, 1, false);
        declareFunction(me, "removal_word_strings_unify_arg2_expand", "REMOVAL-WORD-STRINGS-UNIFY-ARG2-EXPAND", 1, 1, false);
        declareFunction(me, "removal_word_strings_unify_arg1_and_arg2_required", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-REQUIRED", 1, 1, false);
        declareFunction(me, "removal_word_strings_unify_arg1_and_arg2_cost", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-COST", 1, 1, false);
        declareFunction(me, "removal_word_strings_iterator_state_print_function_trampoline", "REMOVAL-WORD-STRINGS-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "removal_word_strings_iterator_state_p", "REMOVAL-WORD-STRINGS-ITERATOR-STATE-P", 1, 0, false);
        new removal_modules_lexicon.$removal_word_strings_iterator_state_p$UnaryFunction();
        declareFunction(me, "removal_wsi_state_speech_part_predicate", "REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE", 1, 0, false);
        declareFunction(me, "removal_wsi_state_arg1", "REMOVAL-WSI-STATE-ARG1", 1, 0, false);
        declareFunction(me, "removal_wsi_state_arg2", "REMOVAL-WSI-STATE-ARG2", 1, 0, false);
        declareFunction(me, "removal_wsi_state_trie_iterator", "REMOVAL-WSI-STATE-TRIE-ITERATOR", 1, 0, false);
        declareFunction(me, "removal_wsi_state_entry_iterator", "REMOVAL-WSI-STATE-ENTRY-ITERATOR", 1, 0, false);
        declareFunction(me, "_csetf_removal_wsi_state_speech_part_predicate", "_CSETF-REMOVAL-WSI-STATE-SPEECH-PART-PREDICATE", 2, 0, false);
        declareFunction(me, "_csetf_removal_wsi_state_arg1", "_CSETF-REMOVAL-WSI-STATE-ARG1", 2, 0, false);
        declareFunction(me, "_csetf_removal_wsi_state_arg2", "_CSETF-REMOVAL-WSI-STATE-ARG2", 2, 0, false);
        declareFunction(me, "_csetf_removal_wsi_state_trie_iterator", "_CSETF-REMOVAL-WSI-STATE-TRIE-ITERATOR", 2, 0, false);
        declareFunction(me, "_csetf_removal_wsi_state_entry_iterator", "_CSETF-REMOVAL-WSI-STATE-ENTRY-ITERATOR", 2, 0, false);
        declareFunction(me, "make_removal_word_strings_iterator_state", "MAKE-REMOVAL-WORD-STRINGS-ITERATOR-STATE", 0, 1, false);
        declareFunction(me, "visit_defstruct_removal_word_strings_iterator_state", "VISIT-DEFSTRUCT-REMOVAL-WORD-STRINGS-ITERATOR-STATE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_removal_word_strings_iterator_state_method", "VISIT-DEFSTRUCT-OBJECT-REMOVAL-WORD-STRINGS-ITERATOR-STATE-METHOD", 2, 0, false);
        declareFunction(me, "iterator_word_strings_done", "ITERATOR-WORD-STRINGS-DONE", 1, 0, false);
        declareFunction(me, "wsi_entry_iterator_prepared_p", "WSI-ENTRY-ITERATOR-PREPARED-P", 1, 0, false);
        declareFunction(me, "wsi_advance_to_next_entry_iterator", "WSI-ADVANCE-TO-NEXT-ENTRY-ITERATOR", 1, 0, false);
        declareFunction(me, "wsi_current_word_and_string_unifyP", "WSI-CURRENT-WORD-AND-STRING-UNIFY?", 3, 0, false);
        declareFunction(me, "iterator_word_strings_next", "ITERATOR-WORD-STRINGS-NEXT", 1, 0, false);
        declareFunction(me, "removal_word_strings_unify_arg1_and_arg2_iterator", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-ITERATOR", 1, 0, false);
        declareFunction(me, "removal_word_strings_unify_arg1_and_arg2_supports", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-SUPPORTS", 1, 0, false);
        declareFunction(me, "removal_word_strings_unify_arg1_and_arg2_output_asent", "REMOVAL-WORD-STRINGS-UNIFY-ARG1-AND-ARG2-OUTPUT-ASENT", 3, 0, false);
        declareFunction(me, "set_up_removal_support_for_speech_part_predicate", "SET-UP-REMOVAL-SUPPORT-FOR-SPEECH-PART-PREDICATE", 1, 0, false);
        declareFunction(me, "removal_word_forms_check_required", "REMOVAL-WORD-FORMS-CHECK-REQUIRED", 1, 1, false);
        declareFunction(me, "removal_word_forms_check_cost", "REMOVAL-WORD-FORMS-CHECK-COST", 1, 1, false);
        declareFunction(me, "removal_word_forms_check_expand", "REMOVAL-WORD-FORMS-CHECK-EXPAND", 1, 1, false);
        declareFunction(me, "removal_word_forms_unify_arg1_required", "REMOVAL-WORD-FORMS-UNIFY-ARG1-REQUIRED", 1, 1, false);
        declareFunction(me, "removal_word_forms_unify_arg1_cost", "REMOVAL-WORD-FORMS-UNIFY-ARG1-COST", 1, 1, false);
        declareFunction(me, "removal_word_forms_unify_arg1_expand", "REMOVAL-WORD-FORMS-UNIFY-ARG1-EXPAND", 1, 1, false);
        declareFunction(me, "removal_word_forms_unify_arg2_required", "REMOVAL-WORD-FORMS-UNIFY-ARG2-REQUIRED", 1, 1, false);
        declareFunction(me, "removal_word_forms_unify_arg2_cost", "REMOVAL-WORD-FORMS-UNIFY-ARG2-COST", 1, 1, false);
        declareFunction(me, "removal_word_forms_unify_arg2_expand", "REMOVAL-WORD-FORMS-UNIFY-ARG2-EXPAND", 1, 1, false);
        declareFunction(me, "removal_word_forms_unify_arg3_required", "REMOVAL-WORD-FORMS-UNIFY-ARG3-REQUIRED", 1, 1, false);
        declareFunction(me, "removal_word_forms_unify_arg3_cost", "REMOVAL-WORD-FORMS-UNIFY-ARG3-COST", 1, 1, false);
        declareFunction(me, "removal_word_forms_unify_arg3_expand", "REMOVAL-WORD-FORMS-UNIFY-ARG3-EXPAND", 1, 1, false);
        declareFunction(me, "removal_word_forms_unify_args_1_and_2_required", "REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-REQUIRED", 1, 1, false);
        declareFunction(me, "removal_word_forms_unify_args_1_and_2_cost", "REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-COST", 1, 1, false);
        declareFunction(me, "removal_word_forms_unify_args_1_and_2_expand", "REMOVAL-WORD-FORMS-UNIFY-ARGS-1-AND-2-EXPAND", 1, 1, false);
        declareFunction(me, "removal_word_forms_unify_args_2_and_3_required", "REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-REQUIRED", 1, 1, false);
        declareFunction(me, "removal_word_forms_unify_args_2_and_3_cost", "REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-COST", 1, 1, false);
        declareFunction(me, "removal_word_forms_unify_args_2_and_3_expand", "REMOVAL-WORD-FORMS-UNIFY-ARGS-2-AND-3-EXPAND", 1, 1, false);
        declareFunction(me, "hl_verify_term_phrases", "HL-VERIFY-TERM-PHRASES", 1, 0, false);
        declareFunction(me, "hl_justify_term_phrases", "HL-JUSTIFY-TERM-PHRASES", 1, 0, false);
        declareFunction(me, "destructure_term_phrases_support", "DESTRUCTURE-TERM-PHRASES-SUPPORT", 1, 0, false);
        declareFunction(me, "hl_forward_mt_combos_term_phrases", "HL-FORWARD-MT-COMBOS-TERM-PHRASES", 1, 0, false);
        declareFunction(me, "supports_have_predsP", "SUPPORTS-HAVE-PREDS?", 2, 0, false);
        declareFunction(me, "get_supports_preds", "GET-SUPPORTS-PREDS", 1, 0, false);
        declareFunction(me, "hl_verify_and_justify_term_phrases", "HL-VERIFY-AND-JUSTIFY-TERM-PHRASES", 1, 0, false);
        declareFunction(me, "removal_term_phrases_required", "REMOVAL-TERM-PHRASES-REQUIRED", 1, 1, false);
        declareFunction(me, "get_term_phrases_supports", "GET-TERM-PHRASES-SUPPORTS", 3, 2, false);
        declareFunction(me, "get_non_lexical_term_phrases_supports", "GET-NON-LEXICAL-TERM-PHRASES-SUPPORTS", 4, 0, false);
        declareMacro(me, "do_lexical_gafs", "DO-LEXICAL-GAFS");
        declareFunction(me, "removal_term_phrases_unify_arg3_expand", "REMOVAL-TERM-PHRASES-UNIFY-ARG3-EXPAND", 1, 1, false);
        declareFunction(me, "add_term_phrases_removal_nodes", "ADD-TERM-PHRASES-REMOVAL-NODES", 3, 0, false);
        declareFunction(me, "make_term_phrases_support", "MAKE-TERM-PHRASES-SUPPORT", 1, 0, false);
        declareFunction(me, "term_unify_case_insensitive", "TERM-UNIFY-CASE-INSENSITIVE", 2, 2, false);
        declareFunction(me, "preds_from_term_phrases_constraint", "PREDS-FROM-TERM-PHRASES-CONSTRAINT", 1, 0, false);
        declareFunction(me, "generic_predP", "GENERIC-PRED?", 1, 0, false);
        declareFunction(me, "removal_term_phrases_unify_arg1_expand", "REMOVAL-TERM-PHRASES-UNIFY-ARG1-EXPAND", 1, 1, false);
        declareFunction(me, "case_insensitive_term_phrases_asent_p", "CASE-INSENSITIVE-TERM-PHRASES-ASENT-P", 1, 0, false);
        declareFunction(me, "lexical_only_term_phrases_asent_p", "LEXICAL-ONLY-TERM-PHRASES-ASENT-P", 1, 0, false);
        declareFunction(me, "inference_denots_of_string", "INFERENCE-DENOTS-OF-STRING", 1, 0, false);
        declareFunction(me, "inference_denots_of_stringXpred", "INFERENCE-DENOTS-OF-STRING&PRED", 2, 0, false);
        declareFunction(me, "removal_term_phrases_unify_arg1_and_arg2_expand", "REMOVAL-TERM-PHRASES-UNIFY-ARG1-AND-ARG2-EXPAND", 1, 1, false);
        declareFunction(me, "add_term_phrases_arg1_and_arg2_removal_nodes", "ADD-TERM-PHRASES-ARG1-AND-ARG2-REMOVAL-NODES", 3, 0, false);
        declareFunction(me, "add_term_phrases_arg1_and_arg2_removal_node", "ADD-TERM-PHRASES-ARG1-AND-ARG2-REMOVAL-NODE", 3, 0, false);
        declareFunction(me, "term_phrases_constraints_from_pred", "TERM-PHRASES-CONSTRAINTS-FROM-PRED", 1, 0, false);
        declareFunction(me, "removal_lexicon_namestring_expand", "REMOVAL-LEXICON-NAMESTRING-EXPAND", 2, 0, false);
        declareFunction(me, "removal_lexicon_namestring_completeP", "REMOVAL-LEXICON-NAMESTRING-COMPLETE?", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_removal_modules_lexicon_file() {
        defparameter("*DEFAULT-WORD-STRING-CHECK-COST*", ONE_INTEGER);
        defparameter("*DEFAULT-WORD-STRINGS-UNIFY-COST*", TWO_INTEGER);
        defconstant("*DTP-REMOVAL-WORD-STRINGS-ITERATOR-STATE*", REMOVAL_WORD_STRINGS_ITERATOR_STATE);
        defconstant("*AVG-SUFFIX-EXPANSION-COST*", THREE_INTEGER);
        defparameter("*DEFAULT-TERM-PHRASES-COST*", TWO_INTEGER);
        defparameter("*DEFAULT-LEXICON-NAMESTRING-CHECK-COST*", TWO_INTEGER);
        return NIL;
    }

    public static SubLObject setup_removal_modules_lexicon_file() {
        note_funcall_helper_function(HL_VERIFY_WORD_STRINGS);
        note_funcall_helper_function(HL_JUSTIFY_WORD_STRINGS);
        note_funcall_helper_function(HL_FORWARD_MT_COMBOS_WORD_STRINGS);
        inference_modules.inference_removal_module($REMOVAL_WORD_STRINGS_CHECK, $list7);
        note_funcall_helper_function(REMOVAL_WORD_STRINGS_UNIFY_ARG1_OUTPUT_GENERATE);
        inference_modules.inference_removal_module($REMOVAL_WORD_STRINGS_UNIFY_ARG1, $list11);
        inference_modules.inference_removal_module($REMOVAL_WORD_STRINGS_UNIFY_ARG2, $list14);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_removal_word_strings_iterator_state$.getGlobalValue(), symbol_function(REMOVAL_WORD_STRINGS_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list39);
        def_csetf(REMOVAL_WSI_STATE_SPEECH_PART_PREDICATE, _CSETF_REMOVAL_WSI_STATE_SPEECH_PART_PREDICATE);
        def_csetf(REMOVAL_WSI_STATE_ARG1, _CSETF_REMOVAL_WSI_STATE_ARG1);
        def_csetf(REMOVAL_WSI_STATE_ARG2, _CSETF_REMOVAL_WSI_STATE_ARG2);
        def_csetf(REMOVAL_WSI_STATE_TRIE_ITERATOR, _CSETF_REMOVAL_WSI_STATE_TRIE_ITERATOR);
        def_csetf(REMOVAL_WSI_STATE_ENTRY_ITERATOR, _CSETF_REMOVAL_WSI_STATE_ENTRY_ITERATOR);
        identity(REMOVAL_WORD_STRINGS_ITERATOR_STATE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_removal_word_strings_iterator_state$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_REMOVAL_WORD_STRINGS_ITERATOR_STATE_METHOD));
        note_funcall_helper_function(ITERATOR_WORD_STRINGS_DONE);
        note_funcall_helper_function(ITERATOR_WORD_STRINGS_NEXT);
        note_funcall_helper_function(REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_ITERATOR);
        note_funcall_helper_function(REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_SUPPORTS);
        note_funcall_helper_function(REMOVAL_WORD_STRINGS_UNIFY_ARG1_AND_ARG2_OUTPUT_ASENT);
        inference_modules.inference_removal_module($REMOVAL_WORD_FORMS_CHECK, $list71);
        inference_modules.inference_removal_module($REMOVAL_WORD_FORMS_UNIFY_ARG1, $list73);
        inference_modules.inference_removal_module($REMOVAL_WORD_FORMS_UNIFY_ARG2, $list76);
        inference_modules.inference_removal_module($REMOVAL_WORD_FORMS_UNIFY_ARG3, $list78);
        inference_modules.inference_removal_module($REMOVAL_WORD_FORMS_UNIFY_ARGS_1_AND_2, $list80);
        inference_modules.inference_removal_module($REMOVAL_WORD_FORMS_UNIFY_ARGS_2_AND_3, $list82);
        note_funcall_helper_function(HL_VERIFY_TERM_PHRASES);
        note_funcall_helper_function(HL_JUSTIFY_TERM_PHRASES);
        note_funcall_helper_function(HL_FORWARD_MT_COMBOS_TERM_PHRASES);
        define_test_case_table_int(HL_VERIFY_AND_JUSTIFY_TERM_PHRASES, list(new SubLObject[]{ $TEST, $sym97$SUPPORTS_HAVE_PREDS_, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list103);
        inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_LEXICAL_UNIFY_ARG3, $list132);
        inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG3, $list134);
        inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_UNIFY_ARG3, $list136);
        inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_LEXICAL_UNIFY_ARG3, $list138);
        inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_UNIFY_ARG1, $list140);
        inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG1, $list142);
        inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_LEXICAL_UNIFY_ARG1, $list144);
        inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_LEXICAL_UNIFY_ARG1, $list146);
        inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_UNIFY_ARG1_AND_ARG2, $list155);
        inference_modules.inference_removal_module($REMOVAL_TERM_PHRASES_CASE_INSENSITIVE_UNIFY_ARG1_AND_ARG2, $list157);
        inference_modules.register_solely_specific_removal_module_predicate($$termPhrases);
        inference_modules.register_solely_specific_removal_module_predicate($$termPhrases_CaseInsensitive);
        inference_modules.register_solely_specific_removal_module_predicate($$wordForms);
        note_funcall_helper_function(REMOVAL_LEXICON_NAMESTRING_EXPAND);
        note_funcall_helper_function($sym171$REMOVAL_LEXICON_NAMESTRING_COMPLETE_);
        preference_modules.inference_preference_module($TERM_STRINGS_STRONGLY_PREFER_AT_LEAST_ONE_FULLY_BOUND_ARG, $list173);
        preference_modules.inference_preference_module($TERM_PHRASES_STRONGLY_PREFER_AT_LEAST_TERM_OR_STRING_FULLY_BOUND, $list175);
        inference_modules.inference_removal_module($REMOVAL_LEXICON_NAMESTRING, $list177);
        return NIL;
    }

    private static SubLObject _constant_103_initializer() {
        return list(new SubLObject[]{ list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("ChronicObstructivePulmonaryDisease-PulmonaryFunctionTest")), reader_make_constant_shell(makeString("nameString")), makeString("COPD-PFT")), reader_make_constant_shell(makeString("MedicalLexicalMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("acronymString")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("Atherosclerosis")), reader_make_constant_shell(makeString("nonPlural-Generic")), makeString("hardening of the arteries")), reader_make_constant_shell(makeString("EnglishCompositionalPhrasesLexicalMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("compoundString")), reader_make_constant_shell(makeString("regularSuffix")), reader_make_constant_shell(makeString("presentParticiple")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("OpenEndedInvestmentCompany")), reader_make_constant_shell(makeString("nameString")), makeString("OEIC")), reader_make_constant_shell(makeString("EnglishMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("initialismString")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("ScubaDiving")), reader_make_constant_shell(makeString("nonPlural-Generic")), makeString("scuba diving")), reader_make_constant_shell(makeString("EnglishMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("multiWordString")), reader_make_constant_shell(makeString("regularSuffix")), reader_make_constant_shell(makeString("regularSuffix")), reader_make_constant_shell(makeString("infinitive")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("SupraventricularTachycardia")), reader_make_constant_shell(makeString("MassNoun")), makeString("supraventricular tach")), reader_make_constant_shell(makeString("EnglishMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("speechPartPreds")), reader_make_constant_shell(makeString("abbreviationForLexicalWord")), reader_make_constant_shell(makeString("multiWordString")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("Hepatitis")), reader_make_constant_shell(makeString("massNumber")), makeString("hepatitis")), reader_make_constant_shell(makeString("EnglishMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("massNumber")), reader_make_constant_shell(makeString("speechPartPreds")), reader_make_constant_shell(makeString("denotation")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("GolfCourse")), reader_make_constant_shell(makeString("plural")), makeString("links")), reader_make_constant_shell(makeString("GeneralEnglishMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("speechPartPreds")), reader_make_constant_shell(makeString("denotation")), reader_make_constant_shell(makeString("plural")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("ChronicObstructivePulmonaryDisease-PulmonaryFunctionTest")), reader_make_constant_shell(makeString("nonPlural-Generic")), makeString("COPD confirmed by a pulmonary function test")), reader_make_constant_shell(makeString("MedicalLexicalMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("speechPartPreds")), reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("compoundString")), reader_make_constant_shell(makeString("massNumber")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("TetralogyOfFallotWithAbsentPulmonaryValve")), reader_make_constant_shell(makeString("nonPlural-Generic")), makeString("Tetralogy of Fallot with absent pulmonary valve")), reader_make_constant_shell(makeString("MedicalLexicalMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("speechPartPreds")), reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("compoundString")), reader_make_constant_shell(makeString("pnMassNumber")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("DiseaseOfTheAorta")), reader_make_constant_shell(makeString("CountNoun")), makeString("disease of the aorta")), reader_make_constant_shell(makeString("MedicalLexicalMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("speechPartPreds")), reader_make_constant_shell(makeString("compoundString")), reader_make_constant_shell(makeString("singular")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("Tennis-TheGame")), reader_make_constant_shell(makeString("nonPlural-Generic")), makeString("tennis")), reader_make_constant_shell(makeString("GeneralEnglishMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("speechPartPreds")), reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("denotation")), reader_make_constant_shell(makeString("massNumber")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("PorscheCar")), reader_make_constant_shell(makeString("nonPlural-Generic")), makeString("Porsche")), reader_make_constant_shell(makeString("GeneralEnglishMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("speechPartPreds")), reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("denotation")), reader_make_constant_shell(makeString("pnSingular")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("InLineSkating")), reader_make_constant_shell(makeString("nonPlural-Generic")), makeString("roller-blading")), reader_make_constant_shell(makeString("GeneralEnglishMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("speechPartPreds")), reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("denotation")), reader_make_constant_shell(makeString("regularSuffix")), reader_make_constant_shell(makeString("regularSuffix")), reader_make_constant_shell(makeString("infinitive")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("EnemaAdministeringEvent")), reader_make_constant_shell(makeString("nonPlural-Generic")), makeString("enema")), reader_make_constant_shell(makeString("GeneralEnglishMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("speechPartPreds")), reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("denotation")), reader_make_constant_shell(makeString("singular")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("Exercising")), reader_make_constant_shell(makeString("nonPlural-Generic")), makeString("Bewegung")), reader_make_constant_shell(makeString("GermanLexicalMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("speechPartPreds")), reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("denotation")), reader_make_constant_shell(makeString("singular-Feminine")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("Baseball-TheGame")), reader_make_constant_shell(makeString("nonPlural-Generic")), makeString("the game of baseball")), reader_make_constant_shell(makeString("GeneralEnglishMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("speechPartPreds")), reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("headMedialString")), reader_make_constant_shell(makeString("massNumber")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("AtrialFibrillationOrFlutter")), reader_make_constant_shell(makeString("nonPlural-Generic")), makeString("atrial fibrillation or flutter")), reader_make_constant_shell(makeString("GeneralEnglishMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("speechPartPreds")), reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("headMedialString")), reader_make_constant_shell(makeString("singular")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("SinglesTableTennis")), reader_make_constant_shell(makeString("nonPlural-Generic")), makeString("singles table tennis")), reader_make_constant_shell(makeString("EnglishMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("speechPartPreds")), reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("multiWordString")), reader_make_constant_shell(makeString("massNumber")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("VentricularSeptalDefect-Atrial-ventricularCanalType")), reader_make_constant_shell(makeString("nonPlural-Generic")), makeString("A-V canal type VSD")), reader_make_constant_shell(makeString("MedicalLexicalMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("speechPartPreds")), reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("multiWordString")), reader_make_constant_shell(makeString("pnSingular")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("Poker-CardGame")), reader_make_constant_shell(makeString("nonPlural-Generic")), makeString("poker game")), reader_make_constant_shell(makeString("EnglishMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("speechPartPreds")), reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("multiWordString")), reader_make_constant_shell(makeString("singular")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("DiseaseOfTheDescendingAorta")), reader_make_constant_shell(makeString("MassNoun")), makeString("disease of the descending aorta")), reader_make_constant_shell(makeString("EnglishCompositionalPhrasesLexicalMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("speechPartPreds")), reader_make_constant_shell(makeString("compoundString")), reader_make_constant_shell(makeString("massNumber")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("Franchise")), reader_make_constant_shell(makeString("Noun")), makeString("franchises")), reader_make_constant_shell(makeString("GeneralEnglishMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("speechPartPreds")), reader_make_constant_shell(makeString("genls")), reader_make_constant_shell(makeString("denotation")), reader_make_constant_shell(makeString("regularSuffix")), reader_make_constant_shell(makeString("singular")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("Ox")), reader_make_constant_shell(makeString("CountNoun")), makeString("oxen")), reader_make_constant_shell(makeString("GeneralEnglishMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("speechPartPreds")), reader_make_constant_shell(makeString("denotation")), reader_make_constant_shell(makeString("plural")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("Calcification")), reader_make_constant_shell(makeString("MassNoun")), makeString("calcification")), reader_make_constant_shell(makeString("EnglishJargonMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("speechPartPreds")), reader_make_constant_shell(makeString("denotation")), reader_make_constant_shell(makeString("massNumber")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("AtresiaWithVentricularSeptalDefect-PulmonaryValve")), reader_make_constant_shell(makeString("MassNoun")), makeString("pulmonary valve atresia with ventricular septal defect")), reader_make_constant_shell(makeString("MedicalLexicalMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("speechPartPreds")), reader_make_constant_shell(makeString("headMedialString")), reader_make_constant_shell(makeString("massNumber")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("RenalFailure")), reader_make_constant_shell(makeString("MassNoun")), makeString("renal failure")), reader_make_constant_shell(makeString("GeneralEnglishMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("speechPartPreds")), reader_make_constant_shell(makeString("multiWordString")), reader_make_constant_shell(makeString("massNumber")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-Lexical")), reader_make_constant_shell(makeString("AbnormalNumberOfCusps")), reader_make_constant_shell(makeString("nonPlural-Generic")), makeString("abnormal num of cusps")), reader_make_constant_shell(makeString("CCFLexicalMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("speechPartPreds")), reader_make_constant_shell(makeString("abbreviationForLexicalWord")), reader_make_constant_shell(makeString("genlPreds")), reader_make_constant_shell(makeString("headMedialString")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases-CaseInsensitive-Lexical")), reader_make_constant_shell(makeString("Ox")), reader_make_constant_shell(makeString("CountNoun")), makeString("oXen")), reader_make_constant_shell(makeString("GeneralEnglishMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("speechPartPreds")), reader_make_constant_shell(makeString("denotation")), reader_make_constant_shell(makeString("plural")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("Submarine")), reader_make_constant_shell(makeString("mainColorOfObject")), reader_make_constant_shell(makeString("YellowColor"))), reader_make_constant_shell(makeString("CharacterString")), makeString("the yellow submarine")), reader_make_constant_shell(makeString("EnglishMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("termPhrases-Lexical")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("Submarine")), reader_make_constant_shell(makeString("mainColorOfObject")), reader_make_constant_shell(makeString("YellowColor"))), reader_make_constant_shell(makeString("NounPhrase")), makeString("a yellow submarine")), reader_make_constant_shell(makeString("EnglishMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("termPhrases-Lexical")))), list(list(list(makeKeyword("TERM-PHRASES"), list(reader_make_constant_shell(makeString("termPhrases")), list(reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), reader_make_constant_shell(makeString("Submarine")), reader_make_constant_shell(makeString("mainColorOfObject")), reader_make_constant_shell(makeString("YellowColor"))), reader_make_constant_shell(makeString("singular-Generic")), makeString("yellow submarine")), reader_make_constant_shell(makeString("EnglishMt")), makeKeyword("TRUE-DEF"))), list(reader_make_constant_shell(makeString("termPhrases-Lexical")))) });
    }

    @Override
    public void declareFunctions() {
        declare_removal_modules_lexicon_file();
    }

    @Override
    public void initializeVariables() {
        init_removal_modules_lexicon_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_removal_modules_lexicon_file();
    }

    static {

























































































































































































    }

    public static final class $removal_word_strings_iterator_state_native extends SubLStructNative {
        public SubLObject $speech_part_predicate;

        public SubLObject $arg1;

        public SubLObject $arg2;

        public SubLObject $trie_iterator;

        public SubLObject $entry_iterator;

        private static final SubLStructDeclNative structDecl;

        private $removal_word_strings_iterator_state_native() {
            this.$speech_part_predicate = Lisp.NIL;
            this.$arg1 = Lisp.NIL;
            this.$arg2 = Lisp.NIL;
            this.$trie_iterator = Lisp.NIL;
            this.$entry_iterator = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$speech_part_predicate;
        }

        @Override
        public SubLObject getField3() {
            return this.$arg1;
        }

        @Override
        public SubLObject getField4() {
            return this.$arg2;
        }

        @Override
        public SubLObject getField5() {
            return this.$trie_iterator;
        }

        @Override
        public SubLObject getField6() {
            return this.$entry_iterator;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$speech_part_predicate = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$arg1 = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$arg2 = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$trie_iterator = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$entry_iterator = value;
        }

        static {
            structDecl = makeStructDeclNative($removal_word_strings_iterator_state_native.class, REMOVAL_WORD_STRINGS_ITERATOR_STATE, REMOVAL_WORD_STRINGS_ITERATOR_STATE_P, $list33, $list34, new String[]{ "$speech_part_predicate", "$arg1", "$arg2", "$trie_iterator", "$entry_iterator" }, $list35, $list36, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $removal_word_strings_iterator_state_p$UnaryFunction extends UnaryFunction {
        public $removal_word_strings_iterator_state_p$UnaryFunction() {
            super(extractFunctionNamed("REMOVAL-WORD-STRINGS-ITERATOR-STATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return removal_word_strings_iterator_state_p(arg1);
        }
    }
}

/**
 * Total time: 3448 ms
 */
