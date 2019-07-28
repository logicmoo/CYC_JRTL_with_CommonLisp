package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.sme_lexification_wizard;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.function.Supplier;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.sme_lexification_wizard.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EIGHT_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ELEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIFTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOURTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.MINUS_ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NINE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVENTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIXTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THIRTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWELVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class sme_lexification_wizard extends SubLTranslatedFile {
    public static final SubLFile me = new sme_lexification_wizard();

    public static final String myName = "com.cyc.cycjava.cycl.sme_lexification_wizard";

    public static final String myFingerPrint = "b4bc8929b1ccb81e4bf9c5ac2368e29cff8ab167f45685dd8848abbdbeb4c3b9";



    // deflexical
    // Flag indicating whether the SME lexification wizard has been initialized
    private static final SubLSymbol $sme_lexwiz_initializedP$ = makeSymbol("*SME-LEXWIZ-INITIALIZED?*");

    // deflexical
    // Whether the SME wizards should bypass simple, predicatable interactions
    public static final SubLSymbol $sme_forge_aheadP$ = makeSymbol("*SME-FORGE-AHEAD?*");

    // deflexical
    /**
     * Whether the in-house front-end for the lexification wizard before
     * verification
     */
    public static final SubLSymbol $verify_beforehandP$ = makeSymbol("*VERIFY-BEFOREHAND?*");

    // deflexical
    /**
     * Whether the SME lexification wizard should use phrases inferred from
     * termStrings
     */
    public static final SubLSymbol $use_inferred_phrasesP$ = makeSymbol("*USE-INFERRED-PHRASES?*");

    // deflexical
    // Whether the Cyc blackboard should be used for the interaction
    private static final SubLSymbol $use_blackboardP$ = makeSymbol("*USE-BLACKBOARD?*");

    // defconstant
    // A string consisting of the newline and tab characaters
    public static final SubLSymbol $newline_tab$ = makeSymbol("*NEWLINE-TAB*");

    // deflexical
    // List of SpeechParts to be used for SME lexification
    private static final SubLSymbol $sme_parts_of_speech$ = makeSymbol("*SME-PARTS-OF-SPEECH*");



    // deflexical
    /**
     * Whether the old-style genFormat template should be used (instead of
     * genTemplate)
     */
    private static final SubLSymbol $use_genformat_template$ = makeSymbol("*USE-GENFORMAT-TEMPLATE*");

    // deflexical
    // List of predicates to be used in refined predication for person names
    private static final SubLSymbol $lexwiz_person_sub_predicates$ = makeSymbol("*LEXWIZ-PERSON-SUB-PREDICATES*");



    // deflexical
    /**
     * List of person types (instances of PersonTypeByCulture) that write the family
     * name first
     *
     * @unknown create a new predicate for encoding this in the KB
     */
    private static final SubLSymbol $family_name_first_groups$ = makeSymbol("*FAMILY-NAME-FIRST-GROUPS*");

    // deflexical
    /**
     * Minimum number of words before optional abbreviation form shows for proper
     * name sub-predication (see @xref ask-refined-predication)
     */
    private static final SubLSymbol $lexwiz_abbreviation_check_min_words$ = makeSymbol("*LEXWIZ-ABBREVIATION-CHECK-MIN-WORDS*");

    // deflexical
    private static final SubLSymbol $sme_lexwiz_title$ = makeSymbol("*SME-LEXWIZ-TITLE*");

    // deflexical
    // Message shown to the SME during the lexification wizard initialization
    private static final SubLSymbol $lexwiz_welcome_message$ = makeSymbol("*LEXWIZ-WELCOME-MESSAGE*");

    // deflexical
    // Tip displayed before the lexification wizard is initialized
    private static final SubLSymbol $lexwiz_initialization_tip$ = makeSymbol("*LEXWIZ-INITIALIZATION-TIP*");

    // deflexical
    /**
     * Tip for when the user is selecting a phrase for the Cyc term to be lexified
     */
    private static final SubLSymbol $phrase_specification_tip$ = makeSymbol("*PHRASE-SPECIFICATION-TIP*");

    // deflexical
    // Tip for use in determining proper name status
    private static final SubLSymbol $proper_name_status_tip$ = makeSymbol("*PROPER-NAME-STATUS-TIP*");

    // deflexical
    /**
     * Additional information on how to select the headword of a phrase
     *
     * @unknown Work out a better way to initialize this text
     */
    private static final SubLSymbol $headword_selection_tip$ = makeSymbol("*HEADWORD-SELECTION-TIP*");

    // deflexical
    // Tip for the headword-guess page
    private static final SubLSymbol $headword_guessing_tip$ = makeSymbol("*HEADWORD-GUESSING-TIP*");

    // deflexical
    /**
     * Tip for when user is entering sentence illustrating a relation
     *
     * @unknown choose a tip example that is currently handled by the relation lexifier
     */
    private static final SubLSymbol $sample_sentence_tip$ = makeSymbol("*SAMPLE-SENTENCE-TIP*");

    // deflexical
    /**
     * Instructions for selecting the part of speech for the argument subphrase in
     * relational lexification
     */
    private static final SubLSymbol $argument_part_of_speech_tip$ = makeSymbol("*ARGUMENT-PART-OF-SPEECH-TIP*");

    // defconstant
    public static final SubLSymbol $dtp_sme_lexification_settings$ = makeSymbol("*DTP-SME-LEXIFICATION-SETTINGS*");

    // Internal Constants
    public static final SubLSymbol $sme_lexification_object_id_hash$ = makeSymbol("*SME-LEXIFICATION-OBJECT-ID-HASH*");

    private static final SubLInteger $int$25 = makeInteger(25);

    public static final SubLSymbol $sym2$_SME_LEXWIZ_INITIALIZED__ = makeSymbol("*SME-LEXWIZ-INITIALIZED?*");

    private static final SubLString $str3$_a_a = makeString("~a~a");

    private static final SubLList $list4 = list(new SubLObject[]{ reader_make_constant_shell(makeString("CountNoun")), reader_make_constant_shell(makeString("MassNoun")), reader_make_constant_shell(makeString("AgentiveNoun")), reader_make_constant_shell(makeString("GerundiveNoun")), reader_make_constant_shell(makeString("Verb")), reader_make_constant_shell(makeString("Adjective")), reader_make_constant_shell(makeString("Adverb")), reader_make_constant_shell(makeString("ProperCountNoun")), reader_make_constant_shell(makeString("ProperMassNoun")) });

    private static final SubLSymbol $next_sme_lexification_id$ = makeSymbol("*NEXT-SME-LEXIFICATION-ID*");

    private static final SubLList $list6 = list(reader_make_constant_shell(makeString("titleOfPerson-String")), reader_make_constant_shell(makeString("givenNames")), reader_make_constant_shell(makeString("middleName")), reader_make_constant_shell(makeString("familyName")), reader_make_constant_shell(makeString("nameSuffix")), reader_make_constant_shell(makeString("initialsString")));

    private static final SubLSymbol $known_name_titles$ = makeSymbol("*KNOWN-NAME-TITLES*");

    private static final SubLList $list8 = list(reader_make_constant_shell(makeString("ChinesePerson")), reader_make_constant_shell(makeString("KoreanPerson")), reader_make_constant_shell(makeString("JapanesePerson")), reader_make_constant_shell(makeString("VietnamesePerson")));

    private static final SubLString $$$Dictionary_Assistant = makeString("Dictionary Assistant");

    private static final SubLString $str10$Welcome_to_the_Subject_Matter_Exp = makeString("Welcome to the Subject Matter Expert Lexification Wizard (SME LexWiz for short). The wizard will ask you a series of questions so that it can determine how to best represent a phrase use to refer to a given concept. This process is called lexification since lexical properties of the phrase are ascertained, such as its grammatical category.\n\nBefore proceeding, the utility must first be initialized. For instance, example lexifications will be retrieved from the knolwledge base for illustrative purposes.");

    private static final SubLString $str11$The_initialization_may_take_sever = makeString("The initialization may take several minutes, depending upon your system, but it needs to be performed only once, at startup.");

    private static final SubLString $str12$Choose_a_phrase_that_clearly_dist = makeString("Choose a phrase that clearly distinguishes the Cyc term in question, yet reflects common ways of referring to the term. However, it is important to avoid being overly specific as well as being overly general.\n\nFor example, for the term \'MakingCoffee-TheBeverage\', the phrase \"making a coffee beverage\" is overly precise. Instead, \"making coffee\" is preferred since \"coffee\" in this phrase only refers to the beverage, and not for instance to the beans or to grounds. In contrast, for the term \'Paint-Dry\', \"paint\" would be overly general, since this can also refer to liquid paint as well. Instead \"dry paint\" would be preferable.\n\nIf you want to use more than one word or phrase to refer to the term, complete the wizard for the current term and then begin again with the same term, but with a different word or phrase.");

    private static final SubLString $str13$Normally__capitalized_phrases_are = makeString("Normally, capitalized phrases are proper names. Some lowercase phrases may be proper names as well; those which refer to specific people (e.g., \"e. e. cummings\") or entities (e.g., \"priceline.com\"), or those which are scientific names for specific organisms, compounds, etc. (e.g., \"plexus brachialis\"). But in most cases, lowercase phrases refer to classes of individuals and to concepts rather than to specific individuals.\n\nExample proper names (particular individuals):\n\tMother Teresa\n\tIBM\n\tAcquired Immune Deficiency Syndrome\n\nExample common nouns or phrases (categories):\n\tcat\n\tthing\n\tNissan car");

    private static final SubLString $str14$examples____video_sports_game____ = makeString("examples:\n\t\"video sports game\" => \"game\"\n\t\"load a weapon\" => \"load\"\n\t\"soccer arena in the Netherlands\" => \"arena\"\n\nNote: The headword will undergo inflectional changes, such as for pluralization. For example, pluralizing the above phrases only affects the headword: \"video sports games\", \"loads a weapon\", and \"soccer arenas in the Netherlands\".");

    private static final SubLString $str15$The_headword_is_the_word_that_is_ = makeString("The headword is the word that is being qualified by the other words in the phrase. It often indicates the general class of the concept described by the phrase. And, it determines the grammatic function of the phrase.\n\nFor example, in the noun phrase \"metal desk\", the noun \"desk\" is the headword qualified by \"metal\". Similarly, the verb \"sleeping\" is the headword of the verb phrases \"sleeping on the job\" and \"quietly sleeping\".");

    private static final SubLString $str16$The_sentence_should_be_general_en = makeString("The sentence should be general enough to reflect common ways of referring to the relation, but it should be specific enough to avoid confusion with similar relations. A case of being too general would be the following as a sample for the \'hasPets\' relation:\n\tJohn has a doberman.\nThis would not distinguish the relation from other has-type relations, such as \'hasStyle\' (consider \"John has a crew cut\"). On the otherhand, the following would be too specific:\n\tJohn cares for, feeds, and provides shelter for a doberman.\nInstead, the following would be better than either:\n\tJohn\'s pet is a doberman.\n\nAnother example of the right level of generality would be the following sample sentence for the relation \'infectionTypeTransmittedDuring\':\n\tThe infection anthrax is transmitted during contact with infected animals.\nNote that although \'infection anthrax\' might seem redundant, this helps distinguish this from other forms of transmission, such as electronic communications (consider \"The e-mail is transmitted during the evening\").");

    private static final SubLString $str17$The_choices_for_the_phrasal_part_ = makeString("The choices for the phrasal part of speech correspond to the traditional grammatic categories\n\tNoun: refers to a person, place, thing, etc. (e.g., open \'[the door]\')\n\tVerbal: refers to an action, process, state of being, etc. (e.g., [close] the window)\n\tAdjectival: generally used to modify noun phrases (e.g., \'[fast] cars\')\n\tAdverbial: generally used to modify verb phrases (e.g., \'sleep [deeply]\')\n\tPrepositional: relational phrase starting with preposition (e.g., \'sleeping [in the park])");

    private static final SubLSymbol SME_LEXIFICATION_SETTINGS = makeSymbol("SME-LEXIFICATION-SETTINGS");

    private static final SubLSymbol SME_LEXIFICATION_SETTINGS_P = makeSymbol("SME-LEXIFICATION-SETTINGS-P");

    private static final SubLList $list20 = list(new SubLObject[]{ makeSymbol("IS-ABBREVIATION?"), makeSymbol("NEW-MAPPING?"), makeSymbol("OK?"), makeSymbol("SAMPLE-SENTENCE"), makeSymbol("SENTENCE-WORDS"), makeSymbol("SENTENCE-ARGS"), makeSymbol("ARG-OFFSETS"), makeSymbol("CURRENT-ARG"), makeSymbol("ARG-SPEECH-PARTS"), makeSymbol("PROPER-SUB-PREDICATES") });

    private static final SubLList $list21 = list(new SubLObject[]{ makeKeyword("IS-ABBREVIATION?"), makeKeyword("NEW-MAPPING?"), makeKeyword("OK?"), makeKeyword("SAMPLE-SENTENCE"), makeKeyword("SENTENCE-WORDS"), makeKeyword("SENTENCE-ARGS"), makeKeyword("ARG-OFFSETS"), makeKeyword("CURRENT-ARG"), makeKeyword("ARG-SPEECH-PARTS"), makeKeyword("PROPER-SUB-PREDICATES") });

    private static final SubLList $list22 = list(new SubLObject[]{ makeSymbol("SME-LEXWIZ-IS-ABBREVIATION?"), makeSymbol("SME-LEXWIZ-NEW-MAPPING?"), makeSymbol("SME-LEXWIZ-OK?"), makeSymbol("SME-LEXWIZ-SAMPLE-SENTENCE"), makeSymbol("SME-LEXWIZ-SENTENCE-WORDS"), makeSymbol("SME-LEXWIZ-SENTENCE-ARGS"), makeSymbol("SME-LEXWIZ-ARG-OFFSETS"), makeSymbol("SME-LEXWIZ-CURRENT-ARG"), makeSymbol("SME-LEXWIZ-ARG-SPEECH-PARTS"), makeSymbol("SME-LEXWIZ-PROPER-SUB-PREDICATES") });

    private static final SubLList $list23 = list(new SubLObject[]{ makeSymbol("_CSETF-SME-LEXWIZ-IS-ABBREVIATION?"), makeSymbol("_CSETF-SME-LEXWIZ-NEW-MAPPING?"), makeSymbol("_CSETF-SME-LEXWIZ-OK?"), makeSymbol("_CSETF-SME-LEXWIZ-SAMPLE-SENTENCE"), makeSymbol("_CSETF-SME-LEXWIZ-SENTENCE-WORDS"), makeSymbol("_CSETF-SME-LEXWIZ-SENTENCE-ARGS"), makeSymbol("_CSETF-SME-LEXWIZ-ARG-OFFSETS"), makeSymbol("_CSETF-SME-LEXWIZ-CURRENT-ARG"), makeSymbol("_CSETF-SME-LEXWIZ-ARG-SPEECH-PARTS"), makeSymbol("_CSETF-SME-LEXWIZ-PROPER-SUB-PREDICATES") });



    private static final SubLSymbol SME_LEXIFICATION_SETTINGS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SME-LEXIFICATION-SETTINGS-PRINT-FUNCTION-TRAMPOLINE");

    public static final SubLList $list26 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SME-LEXIFICATION-SETTINGS-P"));

    private static final SubLSymbol $sym27$SME_LEXWIZ_IS_ABBREVIATION_ = makeSymbol("SME-LEXWIZ-IS-ABBREVIATION?");

    private static final SubLSymbol $sym28$_CSETF_SME_LEXWIZ_IS_ABBREVIATION_ = makeSymbol("_CSETF-SME-LEXWIZ-IS-ABBREVIATION?");

    private static final SubLSymbol $sym29$SME_LEXWIZ_NEW_MAPPING_ = makeSymbol("SME-LEXWIZ-NEW-MAPPING?");

    private static final SubLSymbol $sym30$_CSETF_SME_LEXWIZ_NEW_MAPPING_ = makeSymbol("_CSETF-SME-LEXWIZ-NEW-MAPPING?");

    private static final SubLSymbol $sym31$SME_LEXWIZ_OK_ = makeSymbol("SME-LEXWIZ-OK?");

    private static final SubLSymbol $sym32$_CSETF_SME_LEXWIZ_OK_ = makeSymbol("_CSETF-SME-LEXWIZ-OK?");

    private static final SubLSymbol SME_LEXWIZ_SAMPLE_SENTENCE = makeSymbol("SME-LEXWIZ-SAMPLE-SENTENCE");

    private static final SubLSymbol _CSETF_SME_LEXWIZ_SAMPLE_SENTENCE = makeSymbol("_CSETF-SME-LEXWIZ-SAMPLE-SENTENCE");

    private static final SubLSymbol SME_LEXWIZ_SENTENCE_WORDS = makeSymbol("SME-LEXWIZ-SENTENCE-WORDS");

    private static final SubLSymbol _CSETF_SME_LEXWIZ_SENTENCE_WORDS = makeSymbol("_CSETF-SME-LEXWIZ-SENTENCE-WORDS");

    private static final SubLSymbol SME_LEXWIZ_SENTENCE_ARGS = makeSymbol("SME-LEXWIZ-SENTENCE-ARGS");

    private static final SubLSymbol _CSETF_SME_LEXWIZ_SENTENCE_ARGS = makeSymbol("_CSETF-SME-LEXWIZ-SENTENCE-ARGS");

    private static final SubLSymbol SME_LEXWIZ_ARG_OFFSETS = makeSymbol("SME-LEXWIZ-ARG-OFFSETS");

    private static final SubLSymbol _CSETF_SME_LEXWIZ_ARG_OFFSETS = makeSymbol("_CSETF-SME-LEXWIZ-ARG-OFFSETS");

    private static final SubLSymbol SME_LEXWIZ_CURRENT_ARG = makeSymbol("SME-LEXWIZ-CURRENT-ARG");

    private static final SubLSymbol _CSETF_SME_LEXWIZ_CURRENT_ARG = makeSymbol("_CSETF-SME-LEXWIZ-CURRENT-ARG");

    private static final SubLSymbol SME_LEXWIZ_ARG_SPEECH_PARTS = makeSymbol("SME-LEXWIZ-ARG-SPEECH-PARTS");

    private static final SubLSymbol _CSETF_SME_LEXWIZ_ARG_SPEECH_PARTS = makeSymbol("_CSETF-SME-LEXWIZ-ARG-SPEECH-PARTS");

    private static final SubLSymbol SME_LEXWIZ_PROPER_SUB_PREDICATES = makeSymbol("SME-LEXWIZ-PROPER-SUB-PREDICATES");

    private static final SubLSymbol _CSETF_SME_LEXWIZ_PROPER_SUB_PREDICATES = makeSymbol("_CSETF-SME-LEXWIZ-PROPER-SUB-PREDICATES");

    private static final SubLSymbol $kw47$IS_ABBREVIATION_ = makeKeyword("IS-ABBREVIATION?");

    private static final SubLSymbol $kw48$NEW_MAPPING_ = makeKeyword("NEW-MAPPING?");













    private static final SubLSymbol $ARG_SPEECH_PARTS = makeKeyword("ARG-SPEECH-PARTS");

    private static final SubLSymbol $PROPER_SUB_PREDICATES = makeKeyword("PROPER-SUB-PREDICATES");

    private static final SubLString $str57$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_SME_LEXIFICATION_SETTINGS = makeSymbol("MAKE-SME-LEXIFICATION-SETTINGS");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SME_LEXIFICATION_SETTINGS_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SME-LEXIFICATION-SETTINGS-METHOD");

    public static final SubLSymbol INTERFACE_PROXY = makeSymbol("INTERFACE-PROXY");



    public static final SubLList $list65 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INIT-SESSION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("END-SESSION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-CONSTANT"), list(makeSymbol("CONSTANT-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DESCRIBE-TERM"), list(makeSymbol("TERM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RESOLVE-TERM"), list(makeSymbol("LABEL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MUMBLE"), list(makeSymbol("MESSAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FORGE-AHEAD?"), NIL, makeKeyword("PUBLIC")));



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INTERFACE_PROXY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INTERFACE-PROXY-CLASS");





    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_INTERFACE_PROXY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-INTERFACE-PROXY-INSTANCE");

    private static final SubLSymbol QUESTION_ANSWERING_AGENT = makeSymbol("QUESTION-ANSWERING-AGENT");

    public static final SubLList $list72 = list(new SubLObject[]{ list(makeSymbol("ID"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TITLE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("QUESTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TIP"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("QUESTION-TYPE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ERROR-MESSAGE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CHOICES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DESCRIPTIONS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("VALUES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEFAULT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ANSWER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("FIELD-WIDTH"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("FIELD-LABELS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PROXY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CALLBACK-FUNCTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CLIENT-DATA"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("USER-DATA"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-QUESTION"), list(makeSymbol("NEW-QUESTION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-TITLE"), makeSymbol("*SME-LEXWIZ-TITLE*")), list(makeSymbol("NEW-TYPE"), makeKeyword("BOOLEAN")), list(makeSymbol("NEW-CHOICES"), list(makeSymbol("QUOTE"), list(makeString("Yes"), makeString("No"))))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-QUESTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-RESPONSE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VALIDATE-RESPONSE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CALLBACK-FUNCTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CLIENT-DATA"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-USER-DATA"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PROXY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NOTIFY-CLIENT"), list(makeSymbol("STATUS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POSITIVE-CHOICE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEGATIVE-CHOICE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COPY"), list(makeSymbol("OTHER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("NEW-COPY"), list(makeSymbol("OTHER")), makeKeyword("PUBLIC")) });

    private static final SubLSymbol USER_DATA = makeSymbol("USER-DATA");

































    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_QUESTION_ANSWERING_AGENT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUESTION-ANSWERING-AGENT-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_QUESTION_ANSWERING_AGENT_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUESTION-ANSWERING-AGENT-INSTANCE");

    private static final SubLSymbol SME_LEXIFICATION_STATE = makeSymbol("SME-LEXIFICATION-STATE");

    private static final SubLList $list93 = list(new SubLObject[]{ list(makeSymbol("ID"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("STATE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("NEXT-STATES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LEXWIZ-PARAMETERS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LEXWIZ-SETTINGS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("INTERLOCUTOR-AGENT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ID"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-STATES"), list(makeSymbol("STATE-LIST")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STATES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CURRENT-STATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CURRENT-SETTINGS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADVANCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COPY"), list(makeSymbol("OTHER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("NEW-COPY"), list(makeSymbol("OTHER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LIST-VALUES"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TRACE-VALUES"), list(makeSymbol("&OPTIONAL"), makeSymbol("LABEL"), list(makeSymbol("DEBUG-LEVEL"), makeSymbol("*LEX-VERBOSE*"))), makeKeyword("PROTECTED")) });











    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_STATE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SME-LEXIFICATION-STATE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_STATE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SME-LEXIFICATION-STATE-INSTANCE");

    private static final SubLSymbol SME_LEXIFICATION_INTERLOCUTOR = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR");

    private static final SubLList $list102 = list(new SubLObject[]{ list(makeSymbol("PREVIOUS-ID"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LEXWIZ-PARAMETERS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LEXWIZ-SETTINGS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SME-STATE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PROXY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CALLBACK-FUNCTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CLIENT-DATA"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("USER-DATA"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DONE?"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIATE-INTERACTION"), list(makeSymbol("SESSION-PARAMETERS"), makeSymbol("CALLBACK-FN"), makeSymbol("CALLBACK-DATA"), makeSymbol("PROXY"), makeSymbol("QUESTION-ANSWERING-AGENT-CLASS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UPDATE-NOTIFICATION-INFO"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEXT-INTERACTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("END-INTERACTION"), list(makeSymbol("SESSION-PARAMETERS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RESET-STATE"), list(makeSymbol("STATE-ID")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PROCESS-STATUS-UPDATE"), list(makeSymbol("STATUS"), makeSymbol("&OPTIONAL"), makeSymbol("SERVER"), makeSymbol("USER-DATA")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASK-GENERIC-BOOLEAN"), list(makeSymbol("TITLE"), makeSymbol("QUESTION"), makeSymbol("&OPTIONAL"), makeSymbol("TIP"), makeSymbol("DEFAULT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASK-GENERIC-ENUMERATED"), list(makeSymbol("TITLE"), makeSymbol("QUESTION"), makeSymbol("CHOICES"), makeSymbol("&OPTIONAL"), makeSymbol("TIP"), makeSymbol("VALUES"), makeSymbol("DEFAULT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASK-GENERIC-MULTIPLE-SELECTION"), list(makeSymbol("TITLE"), makeSymbol("QUESTION"), makeSymbol("&OPTIONAL"), makeSymbol("TIP"), makeSymbol("VALUES"), makeSymbol("DEFAULT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASK-GENERIC-MULTIPLE-FREE-FORM"), list(makeSymbol("TITLE"), makeSymbol("QUESTION"), makeSymbol("&OPTIONAL"), makeSymbol("TIP"), makeSymbol("LABELS"), makeSymbol("SIZE"), makeSymbol("DEFAULTS"), makeSymbol("DESCRIPTIONS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISPLAY-QUESTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ANSWER"), list(makeSymbol("ANSWER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ANSWER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-INTERLOCUTOR-AGENT"), list(makeSymbol("AGENT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INTERLOCUTOR-AGENT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-DEFAULT"), list(makeSymbol("DEFAULT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CHECK-GENERIC"), list(makeSymbol("FIELD")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-CALLBACK-FUNCTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PROXY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NOTIFY-CLIENT"), list(makeSymbol("STATUS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MUMBLE"), list(makeSymbol("MESSAGE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FORGE-AHEAD?"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PHRASE-DENOTATIONS"), list(makeSymbol("STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DESCRIBE-TERM"), list(makeSymbol("TERM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UPDATE-LEXIFICATION-PARAMETERS"), NIL, makeKeyword("PROTECTED")) });



    private static final SubLSymbol PREVIOUS_ID = makeSymbol("PREVIOUS-ID");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_INTERLOCUTOR_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SME-LEXIFICATION-INTERLOCUTOR-CLASS");

    private static final SubLSymbol $sym106$SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_INTERLOCUTOR_INSTANC = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SME-LEXIFICATION-INTERLOCUTOR-INSTANCE");

    private static final SubLSymbol SME_LI_PRE_GENERAL = makeSymbol("SME-LI-PRE-GENERAL");

    private static final SubLList $list108 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DO-INITIALIZATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CHECK-INITIALIZATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASK-TERM"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CHECK-TERM"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RESOLVE-TERM"), list(makeSymbol("LABEL")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASK-TERM-SELECTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CHECK-TERM-SELECTION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASK-PHRASE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CHECK-PHRASE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASK-AMBIGUITY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CHECK-AMBIGUITY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASK-PROPER-NAME-STATUS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CHECK-PROPER-NAME-STATUS"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SME_LI_PRE_GENERAL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SME-LI-PRE-GENERAL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SME_LI_PRE_GENERAL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SME-LI-PRE-GENERAL-INSTANCE");

    private static final SubLSymbol SME_LI_PROPER_NAME = makeSymbol("SME-LI-PROPER-NAME");

    private static final SubLList $list112 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASK-ABBREVIATION-STATUS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CHECK-ABBREVIATION-STATUS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASK-PREDICATE-TYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CHECK-PREDICATE-TYPE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASK-REFINED-PREDICATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CHECK-REFINED-PREDICATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INFER-PROPER-NAME-SUB-PREDICATIONS"), list(makeSymbol("TERM"), makeSymbol("PHRASE"), makeSymbol("PROPER-NAME-PREDICATES")), makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SME_LI_PROPER_NAME_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SME-LI-PROPER-NAME-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SME_LI_PROPER_NAME_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SME-LI-PROPER-NAME-INSTANCE");

    private static final SubLSymbol SME_LI_DENOTATIONAL = makeSymbol("SME-LI-DENOTATIONAL");

    private static final SubLList $list116 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GUESS-HEADWORD-POSITION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CHECK-GUESSED-HEADWORD-POSITION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASK-HEADWORD-POSITION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CHECK-HEADWORD-POSITION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASK-PART-OF-SPEECH"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CHECK-PART-OF-SPEECH"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SHOW-HEADWORD-VARIATIONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CHECK-HEADWORD-VARIATIONS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-LEXICAL-MAPPING"), list(makeSymbol("WORDFORM"), makeSymbol("PART-OF-SPEECH"), makeSymbol("&OPTIONAL"), list(makeSymbol("MT"), reader_make_constant_shell(makeString("EnglishMt"))), list(makeSymbol("WORD-TYPE"), reader_make_constant_shell(makeString("EnglishWord")))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("REMOVE-LEXICAL-MAPPING"), list(makeSymbol("WORDFORM"), makeSymbol("PART-OF-SPEECH"), makeSymbol("&OPTIONAL"), list(makeSymbol("MT"), reader_make_constant_shell(makeString("EnglishMt"))), list(makeSymbol("WORD-TYPE"), reader_make_constant_shell(makeString("EnglishWord")))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DO-LEXICAL-MAPPING"), list(makeSymbol("WORDFORM"), makeSymbol("PART-OF-SPEECH"), makeSymbol("MT"), makeSymbol("WORD-TYPE"), makeSymbol("ADD?")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DERIVE-PART-OF-SPEECH-EXAMPLES"), list(makeSymbol("WORD"), makeSymbol("TERM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DERIVE-PART-OF-SPEECH-EXAMPLE"), list(makeSymbol("WORD"), makeSymbol("PART-OF-SPEECH"), makeSymbol("&OPTIONAL"), list(makeSymbol("TERM"), reader_make_constant_shell(makeString("Thing")))), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DISABLE-SPEECH-PART-SELECTION"), list(makeSymbol("WORD"), makeSymbol("PART-OF-SPEECH"), makeSymbol("&OPTIONAL"), list(makeSymbol("TERM"), reader_make_constant_shell(makeString("Thing")))), makeKeyword("PUBLIC")) });

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SME_LI_DENOTATIONAL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SME-LI-DENOTATIONAL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SME_LI_DENOTATIONAL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SME-LI-DENOTATIONAL-INSTANCE");

    private static final SubLSymbol SME_LI_RELATIONAL = makeSymbol("SME-LI-RELATIONAL");

    private static final SubLList $list120 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASK-SAMPLE-SENTENCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CHECK-SAMPLE-SENTENCE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASK-ARGUMENT-VALUES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CHECK-ARGUMENT-VALUES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASK-ARGUMENT-PART-OF-SPEECH"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CHECK-ARGUMENT-PART-OF-SPEECH"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DERIVE-RELATIONAL-TEMPLATES"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SME_LI_RELATIONAL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SME-LI-RELATIONAL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SME_LI_RELATIONAL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SME-LI-RELATIONAL-INSTANCE");

    private static final SubLSymbol SME_LI_POST_GENERAL = makeSymbol("SME-LI-POST-GENERAL");

    public static final SubLList $list124 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ASK-PREFERRED-LEXIFICATION-STATUS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CHECK-PREFERRED-LEXIFICATION-STATUS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DO-LEXIFICATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CHECK-LEXIFICATION"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SME_LI_POST_GENERAL_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SME-LI-POST-GENERAL-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SME_LI_POST_GENERAL_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SME-LI-POST-GENERAL-INSTANCE");



    public static final SubLList $list128 = list(new SubLObject[]{ list(makeSymbol("STATE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("NEXT-STATES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LEXWIZ-PARAMETERS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("CURRENT-INTERACTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("NEW-CURRENT-INTERACTION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("PROXY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("QUESTION-ANSWERING-AGENT-CLASS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TERM"), list(makeSymbol("TERM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TERM"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PHRASE"), list(makeSymbol("PHRASE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PHRASE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-MT"), list(makeSymbol("MT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-LEXICAL-MT"), list(makeSymbol("MT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-PARSING-MT"), list(makeSymbol("MT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-GENERATION-MT"), list(makeSymbol("MT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LEXIFY"), list(makeSymbol("&OPTIONAL"), makeSymbol("TERM"), makeSymbol("PHRASE"), makeSymbol("MT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LEXIFY-FIRST-TERMSTRING"), list(makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CONTINUE-LEXIFY"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PROCESS-STATUS-UPDATE"), list(makeSymbol("STATUS"), makeSymbol("&OPTIONAL"), makeSymbol("SERVER"), makeSymbol("USER-DATA")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COPY"), list(makeSymbol("OTHER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("NEW-COPY"), list(makeSymbol("OTHER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UPDATE-LEXIFICATION-PARAMETERS"), NIL, makeKeyword("PROTECTED")) });







    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_WIZARD_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SME-LEXIFICATION-WIZARD-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_WIZARD_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SME-LEXIFICATION-WIZARD-INSTANCE");



    private static final SubLList $list135 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list136 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(new SubLObject[]{ makeSymbol("CSETQ"), makeSymbol("TITLE"), NIL, makeSymbol("QUESTION"), NIL, makeSymbol("TIP"), NIL, makeSymbol("QUESTION-TYPE"), NIL, makeSymbol("ERROR-MESSAGE"), NIL, makeSymbol("CHOICES"), NIL, makeSymbol("DESCRIPTIONS"), NIL, makeSymbol("VALUES"), NIL, makeSymbol("ANSWER"), NIL, makeSymbol("FIELD-WIDTH"), NIL, makeSymbol("FIELD-LABELS"), NIL, makeSymbol("CALLBACK-FUNCTION"), NIL, makeSymbol("USER-DATA"), NIL, makeSymbol("CLIENT-DATA"), NIL }), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol $sym137$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-ANSWERING-AGENT-METHOD");

    private static final SubLSymbol QUESTION_ANSWERING_AGENT_INITIALIZE_METHOD = makeSymbol("QUESTION-ANSWERING-AGENT-INITIALIZE-METHOD");

    private static final SubLSymbol SET_QUESTION = makeSymbol("SET-QUESTION");

    public static final SubLList $list140 = list(makeKeyword("PUBLIC"));

    private static final SubLList $list141 = list(makeSymbol("NEW-QUESTION"), makeSymbol("&OPTIONAL"), list(makeSymbol("NEW-TITLE"), makeSymbol("*SME-LEXWIZ-TITLE*")), list(makeSymbol("NEW-TYPE"), makeKeyword("BOOLEAN")), list(makeSymbol("NEW-CHOICES"), list(makeSymbol("QUOTE"), list(makeString("Yes"), makeString("No")))));

    private static final SubLList $list142 = list(list(makeSymbol("CSETQ"), makeSymbol("QUESTION"), makeSymbol("NEW-QUESTION")), list(makeSymbol("CSETQ"), makeSymbol("TITLE"), makeSymbol("NEW-TITLE")), list(makeSymbol("CSETQ"), makeSymbol("QUESTION-TYPE"), makeSymbol("NEW-TYPE")), list(makeSymbol("CSETQ"), makeSymbol("CHOICES"), makeSymbol("NEW-CHOICES")), list(makeSymbol("CSETQ"), makeSymbol("ANSWER"), NIL), list(makeSymbol("CSETQ"), makeSymbol("ERROR-MESSAGE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("DEFAULT"), NIL), list(makeSymbol("RET"), NIL));



    public static final SubLList $list144 = list(makeString("Yes"), makeString("No"));

    private static final SubLSymbol $sym145$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-ANSWERING-AGENT-METHOD");

    private static final SubLSymbol QUESTION_ANSWERING_AGENT_SET_QUESTION_METHOD = makeSymbol("QUESTION-ANSWERING-AGENT-SET-QUESTION-METHOD");



    private static final SubLList $list148 = list(list(makeSymbol("LEX-WARN"), makeString("question-answering-agent::display-question shouldn't be invoked (object=~a)~%"), makeSymbol("SELF")), list(makeSymbol("RET"), NIL));

    private static final SubLString $str149$Warning__ = makeString("Warning: ");

    private static final SubLString $str150$question_answering_agent__display = makeString("question-answering-agent::display-question shouldn't be invoked (object=~a)~%");

    private static final SubLSymbol QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD = makeSymbol("QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD");

    private static final SubLSymbol GET_RESPONSE = makeSymbol("GET-RESPONSE");

    private static final SubLList $list153 = list(list(makeSymbol("RET"), makeSymbol("ANSWER")));

    private static final SubLSymbol $sym154$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-ANSWERING-AGENT-METHOD");

    private static final SubLSymbol QUESTION_ANSWERING_AGENT_GET_RESPONSE_METHOD = makeSymbol("QUESTION-ANSWERING-AGENT-GET-RESPONSE-METHOD");

    private static final SubLSymbol VALIDATE_RESPONSE = makeSymbol("VALIDATE-RESPONSE");

    private static final SubLList $list157 = list(makeKeyword("AUTO-UPDATE"), makeKeyword("PUBLIC"));

    private static final SubLList $list158 = list(list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("POSSIBLE-ANSWERS"), list(makeSymbol("FIF"), makeSymbol("VALUES"), makeSymbol("VALUES"), makeSymbol("CHOICES"))), makeSymbol("VALID")), list(makeSymbol("LEX-DESCRIBE-INSTANCE"), makeSymbol("*LEX-VERY-VERBOSE*"), makeSymbol("SELF")), list(makeSymbol("LEX-DEBUG-OUT"), makeString("answer=~s~%"), makeSymbol("ANSWER")), list(makeSymbol("LEX-TRACE"), makeSymbol("*LEX-VERY-DETAILED*"), makeString("choices=~s~%"), makeSymbol("CHOICES")), list(makeSymbol("LEX-TRACE"), makeSymbol("*LEX-VERY-DETAILED*"), makeString("values=~s~%"), makeSymbol("VALUES")), list(makeSymbol("PCASE"), makeSymbol("QUESTION-TYPE"), list(makeKeyword("BOOLEAN"), list(makeSymbol("LEX-TRACE"), makeSymbol("*LEX-VERY-DETAILED*"), makeString("pos=~a; neg=~a~%"), list(makeSymbol("POSITIVE-CHOICE"), makeSymbol("SELF")), list(makeSymbol("NEGATIVE-CHOICE"), makeSymbol("SELF"))), list(makeSymbol("PWHEN"), list(makeSymbol("COR"), list(EQUALP, makeSymbol("ANSWER"), list(makeSymbol("POSITIVE-CHOICE"), makeSymbol("SELF"))), list(EQUALP, makeSymbol("ANSWER"), list(makeSymbol("NEGATIVE-CHOICE"), makeSymbol("SELF")))), list(makeSymbol("CSETQ"), makeSymbol("VALID"), T), list(makeSymbol("CSETQ"), makeSymbol("ANSWER"), list(EQUALP, makeSymbol("ANSWER"), list(makeSymbol("POSITIVE-CHOICE"), makeSymbol("SELF")))))), list(makeKeyword("ENUMERATED"), list(makeSymbol("PWHEN"), list(makeSymbol("LISTP"), makeSymbol("ANSWER")), list(makeSymbol("CSETQ"), makeSymbol("ANSWER"), list(makeSymbol("FIRST"), makeSymbol("ANSWER")))), list(makeSymbol("CSETQ"), makeSymbol("VALID"), list(makeSymbol("MEMBER"), makeSymbol("ANSWER"), makeSymbol("POSSIBLE-ANSWERS"), list(makeSymbol("FUNCTION"), EQUALP))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), makeSymbol("VALID")), list(makeSymbol("STRINGP"), makeSymbol("ANSWER")), list(makeSymbol("IS-NUMERIC?"), makeSymbol("ANSWER"))), list(makeSymbol("CLET"), list(list(makeSymbol("POSITION"), list(makeSymbol("PARSE-INTEGER"), makeSymbol("ANSWER")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol(">="), makeSymbol("POSITION"), ZERO_INTEGER), list(makeSymbol("<"), makeSymbol("POSITION"), list(makeSymbol("LENGTH"), makeSymbol("POSSIBLE-ANSWERS")))), list(makeSymbol("CSETQ"), makeSymbol("ANSWER"), list(makeSymbol("ELT"), makeSymbol("POSSIBLE-ANSWERS"), makeSymbol("POSITION"))), list(makeSymbol("CSETQ"), makeSymbol("VALID"), T))))), list(makeKeyword("MULTIPLE-SELECTION"), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("STRINGP"), makeSymbol("ANSWER")), list(makeSymbol("CNOT"), list(makeSymbol("IS-NUMERIC?"), makeSymbol("ANSWER")))), list(makeSymbol("CSETQ"), makeSymbol("ANSWER"), list(makeSymbol("LEX-STRING-TOKENIZE"), makeSymbol("ANSWER"), T))), list(makeSymbol("PWHEN"), list(makeSymbol("LISTP"), makeSymbol("ANSWER")), list(makeSymbol("CSETQ"), makeSymbol("VALID"), list(makeSymbol("SEARCH"), makeSymbol("ANSWER"), makeSymbol("POSSIBLE-ANSWERS"), list(makeSymbol("FUNCTION"), EQUALP)))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), makeSymbol("VALID")), list(makeSymbol("STRINGP"), makeSymbol("ANSWER"))), list(makeSymbol("CLET"), list(makeSymbol("NEW-ANSWER"), makeSymbol("INVALID")), list(makeSymbol("CDOLIST"), list(makeSymbol("POSITION"), list(makeSymbol("PARSE-NUMERIC-RANGE"), makeSymbol("ANSWER"))), list(makeSymbol("PIF"), list(makeSymbol("CAND"), list(makeSymbol(">="), makeSymbol("POSITION"), ZERO_INTEGER), list(makeSymbol("<"), makeSymbol("POSITION"), list(makeSymbol("LENGTH"), makeSymbol("POSSIBLE-ANSWERS")))), list(makeSymbol("CPUSH"), list(makeSymbol("ELT"), makeSymbol("POSSIBLE-ANSWERS"), makeSymbol("POSITION")), makeSymbol("NEW-ANSWER")), list(makeSymbol("CSETQ"), makeSymbol("INVALID"), T))), list(makeSymbol("CSETQ"), makeSymbol("VALID"), list(makeSymbol("CAND"), makeSymbol("NEW-ANSWER"), list(makeSymbol("CNOT"), makeSymbol("INVALID")))), list(makeSymbol("CSETQ"), makeSymbol("ANSWER"), makeSymbol("NEW-ANSWER"))))), list(makeKeyword("FREE-FORM"), list(makeSymbol("CSETQ"), makeSymbol("VALID"), list(makeSymbol("NON-EMPTY-STRING?"), list(makeSymbol("TRIM-WHITESPACE"), makeSymbol("ANSWER"))))), list(makeKeyword("MULTIPLE-FREE-FORM"), list(makeSymbol("CSETQ"), makeSymbol("VALID"), T), list(makeSymbol("CSOME"), list(makeSymbol("SUB-ANSWER"), makeSymbol("ANSWER"), makeSymbol("VALID")), list(makeSymbol("CSETQ"), makeSymbol("VALID"), list(makeSymbol("NON-EMPTY-STRING?"), list(makeSymbol("TRIM-WHITESPACE"), makeSymbol("SUB-ANSWER")))))), list(makeSymbol("OTHERWISE"), list(makeSymbol("LEX-WARN"), makeString("Unknown question type: ~a~%"), makeSymbol("QUESTION-TYPE")))), list(makeSymbol("LEX-DEBUG-OUT"), makeString("validated answer=~s~%"), makeSymbol("ANSWER")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("NOTIFY-CLIENT")), makeKeyword("INPUT-VALIDATED")), list(makeSymbol("RET"), makeSymbol("VALID")) }));

    private static final SubLString $str159$answer__s__ = makeString("answer=~s~%");

    private static final SubLString $str160$choices__s__ = makeString("choices=~s~%");

    private static final SubLString $str161$values__s__ = makeString("values=~s~%");

    private static final SubLString $str162$pos__a__neg__a__ = makeString("pos=~a; neg=~a~%");







    private static final SubLSymbol $MULTIPLE_FREE_FORM = makeKeyword("MULTIPLE-FREE-FORM");

    private static final SubLString $str167$Unknown_question_type___a__ = makeString("Unknown question type: ~a~%");

    private static final SubLString $str168$validated_answer__s__ = makeString("validated answer=~s~%");





    private static final SubLSymbol QUESTION_ANSWERING_AGENT_VALIDATE_RESPONSE_METHOD = makeSymbol("QUESTION-ANSWERING-AGENT-VALIDATE-RESPONSE-METHOD");

    private static final SubLSymbol SET_CALLBACK_FUNCTION = makeSymbol("SET-CALLBACK-FUNCTION");

    private static final SubLList $list173 = list(makeSymbol("NEW-FUNCTION"));

    private static final SubLList $list174 = list(list(makeSymbol("CSETQ"), makeSymbol("CALLBACK-FUNCTION"), makeSymbol("NEW-FUNCTION")), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol $sym175$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-ANSWERING-AGENT-METHOD");

    private static final SubLSymbol QUESTION_ANSWERING_AGENT_SET_CALLBACK_FUNCTION_METHOD = makeSymbol("QUESTION-ANSWERING-AGENT-SET-CALLBACK-FUNCTION-METHOD");

    private static final SubLSymbol SET_CLIENT_DATA = makeSymbol("SET-CLIENT-DATA");

    private static final SubLList $list178 = list(makeSymbol("CALLBACK-DATA"));

    private static final SubLList $list179 = list(list(makeSymbol("CSETQ"), makeSymbol("CLIENT-DATA"), makeSymbol("CALLBACK-DATA")), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol $sym180$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-ANSWERING-AGENT-METHOD");

    private static final SubLSymbol QUESTION_ANSWERING_AGENT_SET_CLIENT_DATA_METHOD = makeSymbol("QUESTION-ANSWERING-AGENT-SET-CLIENT-DATA-METHOD");

    private static final SubLSymbol SET_USER_DATA = makeSymbol("SET-USER-DATA");

    private static final SubLList $list183 = list(makeSymbol("NEW-USER-DATA"));

    private static final SubLList $list184 = list(list(makeSymbol("CSETQ"), makeSymbol("USER-DATA"), makeSymbol("NEW-USER-DATA")), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol $sym185$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-ANSWERING-AGENT-METHOD");

    private static final SubLSymbol QUESTION_ANSWERING_AGENT_SET_USER_DATA_METHOD = makeSymbol("QUESTION-ANSWERING-AGENT-SET-USER-DATA-METHOD");

    private static final SubLSymbol SET_PROXY = makeSymbol("SET-PROXY");

    private static final SubLList $list188 = list(makeSymbol("NEW-PROXY"));

    private static final SubLList $list189 = list(list(makeSymbol("CSETQ"), makeSymbol("PROXY"), makeSymbol("NEW-PROXY")), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol $sym190$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-ANSWERING-AGENT-METHOD");

    private static final SubLSymbol QUESTION_ANSWERING_AGENT_SET_PROXY_METHOD = makeSymbol("QUESTION-ANSWERING-AGENT-SET-PROXY-METHOD");

    private static final SubLList $list192 = list(makeSymbol("STATUS"));

    private static final SubLList $list193 = list(list(makeSymbol("LEX-TRACE"), makeSymbol("*LEX-VERY-DETAILED*"), makeString("callback-function=~a; client-data=~a~% user-data=~a"), makeSymbol("CALLBACK-FUNCTION"), makeSymbol("CLIENT-DATA"), makeSymbol("USER-DATA")), list(makeSymbol("PWHEN"), makeSymbol("CALLBACK-FUNCTION"), list(makeSymbol("FUNCALL"), makeSymbol("CALLBACK-FUNCTION"), makeSymbol("CLIENT-DATA"), makeSymbol("STATUS"), makeSymbol("SELF"), makeSymbol("USER-DATA"))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol $sym194$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-ANSWERING-AGENT-METHOD");

    private static final SubLString $str195$callback_function__a__client_data = makeString("callback-function=~a; client-data=~a~% user-data=~a");

    private static final SubLSymbol QUESTION_ANSWERING_AGENT_NOTIFY_CLIENT_METHOD = makeSymbol("QUESTION-ANSWERING-AGENT-NOTIFY-CLIENT-METHOD");



    public static final SubLList $list198 = list(list(makeSymbol("RET"), list(makeSymbol("FIRST"), makeSymbol("CHOICES"))));

    public static final SubLSymbol $sym199$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-ANSWERING-AGENT-METHOD");

    private static final SubLSymbol QUESTION_ANSWERING_AGENT_POSITIVE_CHOICE_METHOD = makeSymbol("QUESTION-ANSWERING-AGENT-POSITIVE-CHOICE-METHOD");



    public static final SubLList $list202 = list(list(makeSymbol("RET"), list(makeSymbol("SECOND"), makeSymbol("CHOICES"))));

    private static final SubLSymbol $sym203$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-ANSWERING-AGENT-METHOD");

    private static final SubLSymbol QUESTION_ANSWERING_AGENT_NEGATIVE_CHOICE_METHOD = makeSymbol("QUESTION-ANSWERING-AGENT-NEGATIVE-CHOICE-METHOD");



    private static final SubLList $list206 = list(makeSymbol("OTHER"));

    public static final SubLList $list207 = list(new SubLObject[]{ list(makeSymbol("CSETQ"), makeSymbol("ID"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("ID")))), list(makeSymbol("CSETQ"), makeSymbol("TITLE"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("TITLE")))), list(makeSymbol("CSETQ"), makeSymbol("QUESTION"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("QUESTION")))), list(makeSymbol("CSETQ"), makeSymbol("TIP"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("TIP")))), list(makeSymbol("CSETQ"), makeSymbol("QUESTION-TYPE"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("QUESTION-TYPE")))), list(makeSymbol("CSETQ"), makeSymbol("ERROR-MESSAGE"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("ERROR-MESSAGE")))), list(makeSymbol("CSETQ"), makeSymbol("CHOICES"), list(makeSymbol("COPY-LIST"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("CHOICES"))))), list(makeSymbol("CSETQ"), makeSymbol("DESCRIPTIONS"), list(makeSymbol("COPY-LIST"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("DESCRIPTIONS"))))), list(makeSymbol("CSETQ"), makeSymbol("VALUES"), list(makeSymbol("COPY-LIST"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("VALUES"))))), list(makeSymbol("CSETQ"), makeSymbol("DEFAULT"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("DEFAULT")))), list(makeSymbol("CSETQ"), makeSymbol("ANSWER"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("ANSWER")))), list(makeSymbol("CSETQ"), makeSymbol("FIELD-WIDTH"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("FIELD-WIDTH")))), list(makeSymbol("CSETQ"), makeSymbol("FIELD-LABELS"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("FIELD-LABELS")))), list(makeSymbol("CSETQ"), makeSymbol("PROXY"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("PROXY")))), list(makeSymbol("CSETQ"), makeSymbol("CALLBACK-FUNCTION"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("CALLBACK-FUNCTION")))), list(makeSymbol("CSETQ"), makeSymbol("CLIENT-DATA"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("CLIENT-DATA")))), list(makeSymbol("CSETQ"), makeSymbol("USER-DATA"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("USER-DATA")))), list(makeSymbol("RET"), makeSymbol("SELF")) });

    private static final SubLSymbol $sym208$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUESTION-ANSWERING-AGENT-METHOD");

    private static final SubLSymbol QUESTION_ANSWERING_AGENT_COPY_METHOD = makeSymbol("QUESTION-ANSWERING-AGENT-COPY-METHOD");



    public static final SubLList $list211 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-OBJECT"), list(makeSymbol("FUNCALL-CLASS-METHOD"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("NEW"))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-OBJECT"), list(makeSymbol("QUOTE"), makeSymbol("COPY")), makeSymbol("OTHER")), list(makeSymbol("RET"), makeSymbol("NEW-OBJECT"))));



    private static final SubLSymbol QUESTION_ANSWERING_AGENT_NEW_COPY_METHOD = makeSymbol("QUESTION-ANSWERING-AGENT-NEW-COPY-METHOD");

    private static final SubLList $list214 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol INTERFACE_PROXY_INITIALIZE_METHOD = makeSymbol("INTERFACE-PROXY-INITIALIZE-METHOD");

    private static final SubLSymbol INIT_SESSION = makeSymbol("INIT-SESSION");

    public static final SubLList $list217 = list(list(makeSymbol("RET"), NIL));

    private static final SubLSymbol INTERFACE_PROXY_INIT_SESSION_METHOD = makeSymbol("INTERFACE-PROXY-INIT-SESSION-METHOD");

    private static final SubLSymbol END_SESSION = makeSymbol("END-SESSION");

    private static final SubLList $list220 = list(list(makeSymbol("CB-INVOKE-SME-LEXIFICATION-WIZARD")), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol INTERFACE_PROXY_END_SESSION_METHOD = makeSymbol("INTERFACE-PROXY-END-SESSION-METHOD");

    private static final SubLSymbol CREATE_CONSTANT = makeSymbol("CREATE-CONSTANT");

    private static final SubLList $list223 = list(makeSymbol("CONSTANT-NAME"));

    private static final SubLList $list224 = list(list(makeSymbol("RET"), list(makeSymbol("KE-CREATE-NOW"), makeSymbol("CONSTANT-NAME"))));

    private static final SubLSymbol INTERFACE_PROXY_CREATE_CONSTANT_METHOD = makeSymbol("INTERFACE-PROXY-CREATE-CONSTANT-METHOD");



    private static final SubLList $list227 = list(makeSymbol("TERM"));

    private static final SubLList $list228 = list(list(makeSymbol("RET"), list(makeSymbol("GENERATE-PHRASE"), makeSymbol("TERM"))));

    private static final SubLSymbol INTERFACE_PROXY_DESCRIBE_TERM_METHOD = makeSymbol("INTERFACE-PROXY-DESCRIBE-TERM-METHOD");



    private static final SubLList $list231 = list(makeSymbol("TERM-LABEL"));

    private static final SubLList $list232 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TERM-DENOTS"), list(makeSymbol("ALL-DENOTS-OF-STRING"), makeSymbol("TERM-LABEL"))), list(makeSymbol("TERM-DESCRIPTIONS"), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("LEX-DESCRIBE-TERM")), makeSymbol("TERM-DENOTS")))), list(makeSymbol("RET"), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("LIST")), makeSymbol("TERM-DENOTS"), makeSymbol("TERM-DESCRIPTIONS")))));





    private static final SubLSymbol INTERFACE_PROXY_RESOLVE_TERM_METHOD = makeSymbol("INTERFACE-PROXY-RESOLVE-TERM-METHOD");



    private static final SubLList $list237 = list(makeSymbol("MESSAGE"));

    private static final SubLList $list238 = list(list(makeSymbol("FORMAT"), makeSymbol("*TRACE-OUTPUT*"), makeString("~&mumbling: ~a~%"), makeSymbol("MESSAGE")), list(makeSymbol("RET"), T));

    private static final SubLString $str239$__mumbling___a__ = makeString("~&mumbling: ~a~%");

    private static final SubLSymbol INTERFACE_PROXY_MUMBLE_METHOD = makeSymbol("INTERFACE-PROXY-MUMBLE-METHOD");

    private static final SubLSymbol $sym241$FORGE_AHEAD_ = makeSymbol("FORGE-AHEAD?");

    private static final SubLList $list242 = list(list(makeSymbol("RET"), makeSymbol("*SME-FORGE-AHEAD?*")));

    private static final SubLSymbol $sym243$INTERFACE_PROXY_FORGE_AHEAD__METHOD = makeSymbol("INTERFACE-PROXY-FORGE-AHEAD?-METHOD");

    private static final SubLList $list244 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("ID"), list(makeSymbol("NEW-SME-LEXIFICATION-ID"))), list(makeSymbol("CSETQ"), makeSymbol("STATE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("NEXT-STATES"), NIL), list(makeSymbol("CSETQ"), makeSymbol("LEXWIZ-PARAMETERS"), list(makeSymbol("MAKE-LEXIFICATION-PARAMETERS"))), list(makeSymbol("CSETQ"), makeSymbol("LEXWIZ-SETTINGS"), list(makeSymbol("MAKE-SME-LEXIFICATION-SETTINGS"))), list(makeSymbol("CSETQ"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("FUNCALL-CLASS-METHOD"), list(makeSymbol("QUOTE"), makeSymbol("QUESTION-ANSWERING-AGENT")), list(makeSymbol("QUOTE"), makeSymbol("NEW")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol $sym245$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-STATE-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_STATE_INITIALIZE_METHOD = makeSymbol("SME-LEXIFICATION-STATE-INITIALIZE-METHOD");

    private static final SubLList $list247 = list(list(makeSymbol("CSETQ"), makeSymbol("STATE"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("STATE")))), list(makeSymbol("CSETQ"), makeSymbol("NEXT-STATES"), list(makeSymbol("COPY-LIST"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("NEXT-STATES"))))), list(makeSymbol("CSETQ"), makeSymbol("LEXWIZ-PARAMETERS"), list(makeSymbol("COPY-LEXIFICATION-PARAMETERS"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("LEXWIZ-PARAMETERS"))))), list(makeSymbol("CSETQ"), makeSymbol("LEXWIZ-SETTINGS"), list(makeSymbol("COPY-SME-LEXIFICATION-SETTINGS"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("LEXWIZ-SETTINGS"))))), list(makeSymbol("CSETQ"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("NEW-COPY")), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("INTERLOCUTOR-AGENT"))))), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol $sym248$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-STATE-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_STATE_COPY_METHOD = makeSymbol("SME-LEXIFICATION-STATE-COPY-METHOD");



    private static final SubLList $list251 = list(list(makeSymbol("RET"), makeSymbol("ID")));

    private static final SubLSymbol $sym252$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-STATE-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_STATE_GET_ID_METHOD = makeSymbol("SME-LEXIFICATION-STATE-GET-ID-METHOD");



    private static final SubLList $list255 = list(makeSymbol("STATE-LIST"));

    private static final SubLList $list256 = list(list(makeSymbol("CSETQ"), makeSymbol("NEXT-STATES"), makeSymbol("STATE-LIST")), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol $sym257$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-STATE-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_STATE_SET_STATES_METHOD = makeSymbol("SME-LEXIFICATION-STATE-SET-STATES-METHOD");



    private static final SubLList $list260 = list(list(makeSymbol("RET"), makeSymbol("NEXT-STATES")));

    private static final SubLSymbol $sym261$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-STATE-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_STATE_GET_STATES_METHOD = makeSymbol("SME-LEXIFICATION-STATE-GET-STATES-METHOD");

    private static final SubLSymbol CURRENT_STATE = makeSymbol("CURRENT-STATE");

    private static final SubLList $list264 = list(list(makeSymbol("RET"), makeSymbol("STATE")));

    private static final SubLSymbol $sym265$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-STATE-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_STATE_CURRENT_STATE_METHOD = makeSymbol("SME-LEXIFICATION-STATE-CURRENT-STATE-METHOD");

    private static final SubLSymbol CURRENT_SETTINGS = makeSymbol("CURRENT-SETTINGS");

    public static final SubLList $list268 = list(list(makeSymbol("RET"), makeSymbol("LEXWIZ-PARAMETERS")));

    private static final SubLSymbol $sym269$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-STATE-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_STATE_CURRENT_SETTINGS_METHOD = makeSymbol("SME-LEXIFICATION-STATE-CURRENT-SETTINGS-METHOD");

    private static final SubLSymbol ADVANCE = makeSymbol("ADVANCE");

    private static final SubLList $list272 = list(list(makeSymbol("CSETQ"), makeSymbol("STATE"), list(makeSymbol("FIRST"), makeSymbol("NEXT-STATES"))), list(makeSymbol("CSETQ"), makeSymbol("NEXT-STATES"), list(makeSymbol("REST"), makeSymbol("NEXT-STATES"))), list(makeSymbol("RET"), makeSymbol("STATE")));

    private static final SubLSymbol $sym273$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-STATE-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_STATE_ADVANCE_METHOD = makeSymbol("SME-LEXIFICATION-STATE-ADVANCE-METHOD");

    public static final SubLList $list275 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-STATE"), list(makeSymbol("FUNCALL-CLASS-METHOD"), list(makeSymbol("QUOTE"), makeSymbol("SME-LEXIFICATION-STATE")), list(makeSymbol("QUOTE"), makeSymbol("NEW"))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-STATE"), list(makeSymbol("QUOTE"), makeSymbol("COPY")), makeSymbol("OTHER")), list(makeSymbol("RET"), makeSymbol("NEW-STATE"))));

    private static final SubLSymbol SME_LEXIFICATION_STATE_NEW_COPY_METHOD = makeSymbol("SME-LEXIFICATION-STATE-NEW-COPY-METHOD");

    private static final SubLSymbol LIST_VALUES = makeSymbol("LIST-VALUES");

    public static final SubLList $list278 = list(list(makeSymbol("RET"), list(makeSymbol("LIST"), makeSymbol("ID"), makeSymbol("STATE"), makeSymbol("NEXT-STATES"), list(makeSymbol("LIST-LEXIFICATION-PARAMETERS"), makeSymbol("LEXWIZ-PARAMETERS"), T), list(makeSymbol("LIST-SME-LEXIFICATION-SETTINGS"), makeSymbol("LEXWIZ-SETTINGS"), T))));

    private static final SubLSymbol $sym279$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-STATE-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_STATE_LIST_VALUES_METHOD = makeSymbol("SME-LEXIFICATION-STATE-LIST-VALUES-METHOD");

    private static final SubLSymbol TRACE_VALUES = makeSymbol("TRACE-VALUES");

    public static final SubLList $list282 = list(makeSymbol("&OPTIONAL"), makeSymbol("LABEL"), list(makeSymbol("DEBUG-LEVEL"), makeSymbol("*LEX-VERBOSE*")));

    public static final SubLList $list283 = list(list(makeSymbol("LEX-TRACE"), makeSymbol("DEBUG-LEVEL"), makeString("~a~s~%"), list(makeSymbol("FIF"), makeSymbol("LABEL"), makeSymbol("LABEL"), makeString("SME lexification state: ")), list(makeSymbol("LIST-VALUES"), makeSymbol("SELF"))), list(makeSymbol("LEX-DESCRIBE-INSTANCE"), makeSymbol("*LEX-VERY-VERBOSE*"), makeSymbol("SELF")), list(makeSymbol("TRACE-LEXIFICATION-PARAMETERS"), makeSymbol("LEXWIZ-PARAMETERS"), makeSymbol("*LEX-MOST-VERBOSE*")), list(makeSymbol("TRACE-SME-LEXIFICATION-SETTINGS"), makeSymbol("LEXWIZ-SETTINGS"), makeSymbol("*LEX-MOST-VERBOSE*")), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol $sym284$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-STATE-METHOD");

    private static final SubLString $str285$_a_s__ = makeString("~a~s~%");

    private static final SubLString $str286$SME_lexification_state__ = makeString("SME lexification state: ");

    private static final SubLSymbol SME_LEXIFICATION_STATE_TRACE_VALUES_METHOD = makeSymbol("SME-LEXIFICATION-STATE-TRACE-VALUES-METHOD");

    public static final SubLList $list288 = list(makeKeyword("AUTO-UPDATE"), makeKeyword("PROTECTED"));

    public static final SubLList $list289 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("CALLBACK-FUNCTION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("SME-STATE"), list(makeSymbol("FUNCALL-CLASS-METHOD"), list(makeSymbol("QUOTE"), makeSymbol("SME-LEXIFICATION-STATE")), list(makeSymbol("QUOTE"), makeSymbol("NEW")))), list(makeSymbol("CSETQ"), makeSymbol("PROXY"), list(makeSymbol("FUNCALL-CLASS-METHOD"), list(makeSymbol("QUOTE"), makeSymbol("INTERFACE-PROXY")), list(makeSymbol("QUOTE"), makeSymbol("NEW")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol SME_LEXIFICATION_INTERLOCUTOR_INITIALIZE_METHOD = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-INITIALIZE-METHOD");

    private static final SubLSymbol $sym291$DONE_ = makeSymbol("DONE?");

    private static final SubLList $list292 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEXT-STATES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("GET-STATES"))))), list(makeSymbol("RET"), list(makeSymbol("NULL"), makeSymbol("NEXT-STATES")))));

    private static final SubLSymbol $sym293$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-INTERLOCUTOR-METHOD");

    private static final SubLSymbol $sym294$SME_LEXIFICATION_INTERLOCUTOR_DONE__METHOD = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-DONE?-METHOD");

    private static final SubLSymbol INITIATE_INTERACTION = makeSymbol("INITIATE-INTERACTION");

    private static final SubLList $list296 = list(makeSymbol("SESSION-PARAMETERS"), makeSymbol("CALLBACK-FN"), makeSymbol("INSTANCE-DATA"), makeSymbol("NEW-PROXY"), makeSymbol("QUESTION-ANSWERING-AGENT-CLASS"));

    private static final SubLList $list297 = list(new SubLObject[]{ list(makeSymbol("LEX-DEBUG-OUT"), makeString("callback-fn (of type ~a): ~a~%"), list(makeSymbol("TYPE-OF"), makeSymbol("CALLBACK-FN")), makeSymbol("CALLBACK-FN")), list(makeSymbol("LEX-DEBUG-OUT"), makeString("question-answering-agent-class (of type ~a): ~a~%"), list(makeSymbol("TYPE-OF"), makeSymbol("QUESTION-ANSWERING-AGENT-CLASS")), makeSymbol("QUESTION-ANSWERING-AGENT-CLASS")), list(makeSymbol("CSETQ"), makeSymbol("LEXWIZ-PARAMETERS"), makeSymbol("SESSION-PARAMETERS")), list(makeSymbol("CSETQ"), makeSymbol("LEXWIZ-SETTINGS"), list(makeSymbol("MAKE-SME-LEXIFICATION-SETTINGS"))), list(makeSymbol("SET-SLOT"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("LEXWIZ-PARAMETERS")), makeSymbol("LEXWIZ-PARAMETERS")), list(makeSymbol("SET-SLOT"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("LEXWIZ-SETTINGS")), makeSymbol("LEXWIZ-SETTINGS")), list(makeSymbol("CSETQ"), makeSymbol("CALLBACK-FUNCTION"), makeSymbol("CALLBACK-FN")), list(makeSymbol("CSETQ"), makeSymbol("CLIENT-DATA"), makeSymbol("INSTANCE-DATA")), list(makeSymbol("CSETQ"), makeSymbol("USER-DATA"), makeSymbol("LEXWIZ-PARAMETERS")), list(makeSymbol("CSETQ"), makeSymbol("PROXY"), makeSymbol("NEW-PROXY")), list(makeSymbol("SET-INTERLOCUTOR-AGENT"), makeSymbol("SELF"), list(makeSymbol("FUNCALL-CLASS-METHOD"), makeSymbol("QUESTION-ANSWERING-AGENT-CLASS"), list(makeSymbol("QUOTE"), makeSymbol("NEW")))), list(makeSymbol("UPDATE-NOTIFICATION-INFO"), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("NEXT-INTERACTION"))), list(makeSymbol("RET"), NIL) });

    private static final SubLString $str298$callback_fn__of_type__a____a__ = makeString("callback-fn (of type ~a): ~a~%");

    private static final SubLString $str299$question_answering_agent_class__o = makeString("question-answering-agent-class (of type ~a): ~a~%");



    private static final SubLSymbol SME_LEXIFICATION_INTERLOCUTOR_INITIATE_INTERACTION_METHOD = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-INITIATE-INTERACTION-METHOD");

    private static final SubLSymbol UPDATE_NOTIFICATION_INFO = makeSymbol("UPDATE-NOTIFICATION-INFO");

    public static final SubLList $list303 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("GET-INTERLOCUTOR-AGENT"), makeSymbol("SELF"))), list(makeSymbol("MY-NOTIFICATION-FN"), list(makeSymbol("RESOLVE-METHOD"), list(makeSymbol("QUOTE"), makeSymbol("PROCESS-STATUS-UPDATE")), list(makeSymbol("QUOTE"), makeSymbol("SME-LEXIFICATION-INTERLOCUTOR"))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("SET-CALLBACK-FUNCTION")), makeSymbol("MY-NOTIFICATION-FN")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("SET-CLIENT-DATA")), makeSymbol("SELF")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("SET-USER-DATA")), makeSymbol("LEXWIZ-PARAMETERS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("SET-PROXY")), makeSymbol("PROXY")), list(makeSymbol("RET"), T)));



    private static final SubLSymbol SME_LEXIFICATION_INTERLOCUTOR_UPDATE_NOTIFICATION_INFO_METHOD = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-UPDATE-NOTIFICATION-INFO-METHOD");

    private static final SubLList $list306 = list(list(makeSymbol("CSETQ"), makeSymbol("PREVIOUS-ID"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("GET-ID")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("TRACE-VALUES")), makeString("sme state: ")), list(makeSymbol("LEX-DESCRIBE-INSTANCE"), makeSymbol("*LEX-VERY-VERBOSE*"), makeSymbol("SME-STATE")), list(makeSymbol("UPDATE-LEXIFICATION-PARAMETERS"), makeSymbol("SELF")), list(makeSymbol("SET-SLOT"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("LEXWIZ-SETTINGS")), list(makeSymbol("COPY-SME-LEXIFICATION-SETTINGS"), makeSymbol("LEXWIZ-SETTINGS"))), list(makeSymbol("PUNLESS"), makeSymbol("*USE-BLACKBOARD?*"), list(makeSymbol("CSETQ"), makeSymbol("SME-STATE"), list(makeSymbol("FUNCALL-CLASS-METHOD"), list(makeSymbol("QUOTE"), makeSymbol("SME-LEXIFICATION-STATE")), list(makeSymbol("QUOTE"), makeSymbol("NEW-COPY")), makeSymbol("SME-STATE"))), list(makeSymbol("UPDATE-NOTIFICATION-INFO"), makeSymbol("SELF"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("ADVANCE"))), list(makeSymbol("CLET"), list(list(makeSymbol("ID"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("GET-ID"))))), list(makeSymbol("SET-LEXIFICATION-OBJECT"), makeSymbol("ID"), makeSymbol("SME-STATE")), list(makeSymbol("LEX-DEBUG-OUT"), makeString("current state: ~a~%"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("CURRENT-STATE")))), list(makeSymbol("LEX-TRACE"), makeSymbol("*LEX-VERY-DETAILED*"), makeString("next states: ~a~%"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("GET-STATES")))), list(makeSymbol("CLET"), list(list(makeSymbol("STATE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("CURRENT-STATE"))))), list(makeSymbol("PIF"), list(makeSymbol("IMPLEMENTS-METHOD-P"), makeSymbol("SELF"), makeSymbol("STATE")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), makeSymbol("STATE")), list(makeSymbol("LEX-WARN"), makeString("Unexpected state: ~a~%"), makeSymbol("STATE")))), list(makeSymbol("RET"), NIL)));

    private static final SubLString $str307$sme_state__ = makeString("sme state: ");

    private static final SubLString $str308$current_state___a__ = makeString("current state: ~a~%");

    private static final SubLString $str309$next_states___a__ = makeString("next states: ~a~%");

    private static final SubLString $str310$Unexpected_state___a__ = makeString("Unexpected state: ~a~%");

    private static final SubLSymbol SME_LEXIFICATION_INTERLOCUTOR_NEXT_INTERACTION_METHOD = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-NEXT-INTERACTION-METHOD");



    private static final SubLList $list313 = list(list(makeSymbol("NOTIFY-CLIENT"), makeSymbol("SELF"), makeKeyword("DONE")), list(makeSymbol("RET"), NIL));



    private static final SubLSymbol SME_LEXIFICATION_INTERLOCUTOR_END_INTERACTION_METHOD = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-END-INTERACTION-METHOD");

    private static final SubLSymbol RESET_STATE = makeSymbol("RESET-STATE");

    private static final SubLList $list317 = list(makeSymbol("STATE-ID"));

    public static final SubLList $list318 = list(list(makeSymbol("CLET"), list(list(makeSymbol("OLD-SME-STATE"), list(makeSymbol("GET-LEXIFICATION-OBJECT"), makeSymbol("STATE-ID")))), list(makeSymbol("PIF"), makeSymbol("OLD-SME-STATE"), list(new SubLObject[]{ makeSymbol("PROGN"), list(makeSymbol("LEX-DEBUG-OUT"), makeString("Resetting SME lexwiz to older state ~a~%"), makeSymbol("STATE-ID")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("TRACE-VALUES")), makeString("old-sme-state: ")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("TRACE-VALUES")), makeString("sme-state (before): ")), list(makeSymbol("CSETQ"), makeSymbol("SME-STATE"), list(makeSymbol("FUNCALL-CLASS-METHOD"), list(makeSymbol("QUOTE"), makeSymbol("SME-LEXIFICATION-STATE")), list(makeSymbol("QUOTE"), makeSymbol("NEW-COPY")), makeSymbol("OLD-SME-STATE"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("TRACE-VALUES")), makeString("sme-state (after): ")), list(makeSymbol("CSETQ"), makeSymbol("PREVIOUS-ID"), makeSymbol("STATE-ID")), list(makeSymbol("UPDATE-LEXIFICATION-PARAMETERS"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("LEXWIZ-SETTINGS"), list(makeSymbol("COPY-SME-LEXIFICATION-SETTINGS"), list(makeSymbol("GET-SLOT"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("LEXWIZ-SETTINGS"))))), list(makeSymbol("LEX-DEBUG"), list(makeSymbol("LEX-DEBUG-OUT"), makeString("done with state reset~%"))) }), list(makeSymbol("LEX-WARN"), makeString("Unable to resolve SME lexification state for ~a~%"), makeSymbol("STATE-ID"))), list(makeSymbol("RET"), makeSymbol("SME-STATE"))));

    private static final SubLString $str319$Resetting_SME_lexwiz_to_older_sta = makeString("Resetting SME lexwiz to older state ~a~%");

    private static final SubLString $str320$old_sme_state__ = makeString("old-sme-state: ");

    private static final SubLString $str321$sme_state__before___ = makeString("sme-state (before): ");

    private static final SubLString $str322$sme_state__after___ = makeString("sme-state (after): ");

    private static final SubLString $str323$done_with_state_reset__ = makeString("done with state reset~%");

    private static final SubLString $str324$Unable_to_resolve_SME_lexificatio = makeString("Unable to resolve SME lexification state for ~a~%");

    private static final SubLSymbol SME_LEXIFICATION_INTERLOCUTOR_RESET_STATE_METHOD = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-RESET-STATE-METHOD");

    private static final SubLList $list326 = list(makeSymbol("STATUS"), makeSymbol("&OPTIONAL"), makeSymbol("SERVER"), makeSymbol("CURRENT-USER-DATA"));

    public static final SubLList $list327 = list(list(makeSymbol("IGNORE"), makeSymbol("CURRENT-USER-DATA")), list(makeSymbol("LEX-DEBUG-OUT"), makeString("sme-li process-status-update status=~a server=~a user-data=~a~%"), makeSymbol("STATUS"), makeSymbol("SERVER"), makeSymbol("CURRENT-USER-DATA")), list(makeSymbol("CLET"), list(list(makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("GET-INTERLOCUTOR-AGENT"), makeSymbol("SELF")))), list(makeSymbol("CSETQ"), makeSymbol("INTERLOCUTOR-AGENT"), makeSymbol("SERVER")), list(makeSymbol("PCASE"), makeSymbol("STATUS"), list(makeKeyword("OUTPUT-DONE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("GET-RESPONSE")))), list(makeKeyword("INPUT-READY"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("VALIDATE-RESPONSE")))), list(makeKeyword("INPUT-VALIDATED"), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-ERROR-MESSAGE"), makeSymbol("LEXWIZ-PARAMETERS")), NIL), list(makeSymbol("CLET"), list(list(makeSymbol("ID"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("GET-ID")))), list(makeSymbol("AGENT-ID"), list(makeSymbol("GET-SLOT"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("ID"))))), list(makeSymbol("LEX-DEBUG-OUT"), makeString("id=~a previous-id=~a agent-id=~a~%"), makeSymbol("ID"), makeSymbol("PREVIOUS-ID"), makeSymbol("AGENT-ID")), list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), list(EQUAL, makeSymbol("AGENT-ID"), makeSymbol("PREVIOUS-ID")), list(EQUAL, makeSymbol("AGENT-ID"), makeSymbol("ID")), makeSymbol("*USE-BLACKBOARD?*")), list(makeSymbol("RESET-STATE"), makeSymbol("SELF"), makeSymbol("AGENT-ID"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("NEXT-INTERACTION"))))), list(makeSymbol("OTHERWISE"), list(makeSymbol("LEX-WARN"), makeString("Unexpected status: ~a~%"), makeSymbol("STATUS"))))), list(makeSymbol("RET"), NIL));

    private static final SubLString $str328$sme_li_process_status_update_stat = makeString("sme-li process-status-update status=~a server=~a user-data=~a~%");





    private static final SubLString $str331$id__a_previous_id__a_agent_id__a_ = makeString("id=~a previous-id=~a agent-id=~a~%");

    private static final SubLString $str332$Unexpected_status___a__ = makeString("Unexpected status: ~a~%");

    private static final SubLSymbol SME_LEXIFICATION_INTERLOCUTOR_PROCESS_STATUS_UPDATE_METHOD = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-PROCESS-STATUS-UPDATE-METHOD");



    private static final SubLList $list335 = list(makeSymbol("TITLE"), makeSymbol("QUESTION"), makeSymbol("&OPTIONAL"), makeSymbol("TIP"), makeSymbol("DEFAULT"));

    public static final SubLList $list336 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("GET-INTERLOCUTOR-AGENT"), makeSymbol("SELF")))), list(makeSymbol("SET-SLOT"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("TIP")), makeSymbol("TIP")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("SET-QUESTION")), makeSymbol("QUESTION"), makeSymbol("TITLE"), makeKeyword("BOOLEAN")), list(makeSymbol("SET-SLOT"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("DEFAULT")), makeSymbol("DEFAULT")), list(makeSymbol("DISPLAY-QUESTION"), makeSymbol("SELF"))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol SME_LEXIFICATION_INTERLOCUTOR_ASK_GENERIC_BOOLEAN_METHOD = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-ASK-GENERIC-BOOLEAN-METHOD");



    public static final SubLList $list339 = list(makeSymbol("TITLE"), makeSymbol("QUESTION"), makeSymbol("CHOICES"), makeSymbol("&OPTIONAL"), makeSymbol("TIP"), makeSymbol("VALUES"), makeSymbol("DEFAULT-OFFSET"));

    private static final SubLList $list340 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("GET-INTERLOCUTOR-AGENT"), makeSymbol("SELF")))), list(makeSymbol("SET-SLOT"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("TIP")), makeSymbol("TIP")), list(makeSymbol("SET-SLOT"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("VALUES")), makeSymbol("VALUES")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("SET-QUESTION")), makeSymbol("QUESTION"), makeSymbol("TITLE"), makeKeyword("ENUMERATED"), makeSymbol("CHOICES")), list(makeSymbol("SET-SLOT"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("DEFAULT")), makeSymbol("DEFAULT-OFFSET")), list(makeSymbol("DISPLAY-QUESTION"), makeSymbol("SELF"))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol SME_LEXIFICATION_INTERLOCUTOR_ASK_GENERIC_ENUMERATED_METHOD = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-ASK-GENERIC-ENUMERATED-METHOD");

    private static final SubLSymbol ASK_GENERIC_MULTIPLE_SELECTION = makeSymbol("ASK-GENERIC-MULTIPLE-SELECTION");

    private static final SubLList $list343 = list(makeSymbol("TITLE"), makeSymbol("QUESTION"), makeSymbol("CHOICES"), makeSymbol("&OPTIONAL"), makeSymbol("TIP"), makeSymbol("VALUES"), makeSymbol("DEFAULT-OFFSETS"));

    private static final SubLList $list344 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("GET-INTERLOCUTOR-AGENT"), makeSymbol("SELF")))), list(makeSymbol("SET-SLOT"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("TIP")), makeSymbol("TIP")), list(makeSymbol("SET-SLOT"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("VALUES")), makeSymbol("VALUES")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("SET-QUESTION")), makeSymbol("QUESTION"), makeSymbol("TITLE"), makeKeyword("MULTIPLE-SELECTION"), makeSymbol("CHOICES")), list(makeSymbol("SET-SLOT"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("DEFAULT")), makeSymbol("DEFAULT-OFFSETS")), list(makeSymbol("DISPLAY-QUESTION"), makeSymbol("SELF"))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol $sym345$SME_LEXIFICATION_INTERLOCUTOR_ASK_GENERIC_MULTIPLE_SELECTION_METH = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-ASK-GENERIC-MULTIPLE-SELECTION-METHOD");

    private static final SubLSymbol ASK_GENERIC_FREE_FORM = makeSymbol("ASK-GENERIC-FREE-FORM");

    public static final SubLList $list347 = list(makeSymbol("TITLE"), makeSymbol("QUESTION"), makeSymbol("&OPTIONAL"), makeSymbol("TIP"), list(makeSymbol("SIZE"), TEN_INTEGER), makeSymbol("DEFAULT"));

    private static final SubLList $list348 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("GET-INTERLOCUTOR-AGENT"), makeSymbol("SELF")))), list(makeSymbol("SET-SLOT"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("TIP")), makeSymbol("TIP")), list(makeSymbol("SET-SLOT"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("FIELD-WIDTH")), makeSymbol("SIZE")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("SET-QUESTION")), makeSymbol("QUESTION"), makeSymbol("TITLE"), makeKeyword("FREE-FORM")), list(makeSymbol("SET-SLOT"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("DEFAULT")), makeSymbol("DEFAULT")), list(makeSymbol("DISPLAY-QUESTION"), makeSymbol("SELF"))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol SME_LEXIFICATION_INTERLOCUTOR_ASK_GENERIC_FREE_FORM_METHOD = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-ASK-GENERIC-FREE-FORM-METHOD");

    private static final SubLSymbol ASK_GENERIC_MULTIPLE_FREE_FORM = makeSymbol("ASK-GENERIC-MULTIPLE-FREE-FORM");

    public static final SubLList $list351 = list(makeSymbol("TITLE"), makeSymbol("QUESTION"), makeSymbol("&OPTIONAL"), makeSymbol("TIP"), makeSymbol("LABELS"), makeSymbol("SIZE"), makeSymbol("DEFAULTS"), makeSymbol("DESCRIPTIONS"));

    private static final SubLList $list352 = list(list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("GET-INTERLOCUTOR-AGENT"), makeSymbol("SELF")))), list(makeSymbol("SET-SLOT"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("TIP")), makeSymbol("TIP")), list(makeSymbol("SET-SLOT"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("FIELD-WIDTH")), makeSymbol("SIZE")), list(makeSymbol("SET-SLOT"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("FIELD-LABELS")), makeSymbol("LABELS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("SET-QUESTION")), makeSymbol("QUESTION"), makeSymbol("TITLE"), makeKeyword("MULTIPLE-FREE-FORM")), list(makeSymbol("SET-SLOT"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("DEFAULT")), makeSymbol("DEFAULTS")), list(makeSymbol("SET-SLOT"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("DESCRIPTIONS")), makeSymbol("DESCRIPTIONS")), list(makeSymbol("DISPLAY-QUESTION"), makeSymbol("SELF")) }), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol $sym353$SME_LEXIFICATION_INTERLOCUTOR_ASK_GENERIC_MULTIPLE_FREE_FORM_METH = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-ASK-GENERIC-MULTIPLE-FREE-FORM-METHOD");

    public static final SubLList $list354 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("GET-INTERLOCUTOR-AGENT"), makeSymbol("SELF")))), list(makeSymbol("SET-SLOT"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("ERROR-MESSAGE")), list(makeSymbol("LEXWIZ-ERROR-MESSAGE"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-ERROR-MESSAGE"), makeSymbol("LEXWIZ-PARAMETERS")), NIL), list(makeSymbol("SET-SLOT"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("ID")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("GET-ID")))), list(makeSymbol("UPDATE-LEXIFICATION-PARAMETERS"), makeSymbol("SELF")), list(makeSymbol("SET-SLOT"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("LEXWIZ-SETTINGS")), list(makeSymbol("COPY-SME-LEXIFICATION-SETTINGS"), makeSymbol("LEXWIZ-SETTINGS"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("DISPLAY-QUESTION")))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol $sym355$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-INTERLOCUTOR-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_INTERLOCUTOR_DISPLAY_QUESTION_METHOD = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-DISPLAY-QUESTION-METHOD");



    private static final SubLList $list358 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("GET-INTERLOCUTOR-AGENT"), makeSymbol("SELF")))), list(makeSymbol("RET"), list(makeSymbol("GET-SLOT"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("ANSWER"))))));

    private static final SubLSymbol SME_LEXIFICATION_INTERLOCUTOR_GET_ANSWER_METHOD = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-GET-ANSWER-METHOD");



    public static final SubLList $list361 = list(makeSymbol("NEW-ANSWER"));

    private static final SubLList $list362 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("GET-INTERLOCUTOR-AGENT"), makeSymbol("SELF")))), list(makeSymbol("SET-SLOT"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("ANSWER")), makeSymbol("NEW-ANSWER")), list(makeSymbol("RET"), NIL)));

    private static final SubLSymbol SME_LEXIFICATION_INTERLOCUTOR_SET_ANSWER_METHOD = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-SET-ANSWER-METHOD");



    public static final SubLList $list365 = list(list(makeSymbol("LEX-ASSERTION"), makeSymbol("SME-STATE")), list(makeSymbol("PWHEN"), makeSymbol("SME-STATE"), list(makeSymbol("RET"), list(makeSymbol("GET-SLOT"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("INTERLOCUTOR-AGENT"))))));

    private static final SubLSymbol $sym366$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-INTERLOCUTOR-METHOD");

    private static final SubLString $str367$____assertion_failed___a______ = makeString("*** assertion failed: ~a ***~%");

    private static final SubLSymbol SME_LEXIFICATION_INTERLOCUTOR_GET_INTERLOCUTOR_AGENT_METHOD = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-GET-INTERLOCUTOR-AGENT-METHOD");

    private static final SubLSymbol SET_INTERLOCUTOR_AGENT = makeSymbol("SET-INTERLOCUTOR-AGENT");

    public static final SubLList $list370 = list(makeSymbol("NEW-AGENT"));

    private static final SubLList $list371 = list(list(makeSymbol("LEX-ASSERTION"), makeSymbol("SME-STATE")), list(makeSymbol("PWHEN"), makeSymbol("SME-STATE"), list(makeSymbol("SET-SLOT"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("INTERLOCUTOR-AGENT")), makeSymbol("NEW-AGENT"))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol $sym372$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-INTERLOCUTOR-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_INTERLOCUTOR_SET_INTERLOCUTOR_AGENT_METHOD = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-SET-INTERLOCUTOR-AGENT-METHOD");

    private static final SubLSymbol SET_DEFAULT = makeSymbol("SET-DEFAULT");

    private static final SubLList $list375 = list(makeSymbol("NEW-DEFAULT"));

    private static final SubLList $list376 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("GET-INTERLOCUTOR-AGENT"), makeSymbol("SELF")))), list(makeSymbol("SET-SLOT"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("DEFAULT")), makeSymbol("NEW-DEFAULT"))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol SME_LEXIFICATION_INTERLOCUTOR_SET_DEFAULT_METHOD = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-SET-DEFAULT-METHOD");

    private static final SubLSymbol CHECK_GENERIC = makeSymbol("CHECK-GENERIC");

    private static final SubLList $list379 = list(makeSymbol("FIELD"));

    private static final SubLList $list380 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("GET-INTERLOCUTOR-AGENT"), makeSymbol("SELF"))), list(makeSymbol("RESPONSE"), list(makeSymbol("GET-SLOT"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("ANSWER")))), list(makeSymbol("FIELD-ACCESSOR"), list(makeSymbol("INTERN"), list(makeSymbol("FORMAT"), NIL, makeString("LEXWIZ-~S"), makeSymbol("FIELD"))))), list(makeSymbol("EVAL"), list(makeSymbol("BQ-LIST"), list(makeSymbol("QUOTE"), makeSymbol("CSETF")), list(makeSymbol("BQ-LIST"), makeSymbol("FIELD-ACCESSOR"), makeSymbol("LEXWIZ-PARAMETERS")), makeSymbol("RESPONSE"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("NEXT-INTERACTION")))), list(makeSymbol("RET"), NIL));

    private static final SubLString $str381$LEXWIZ__S = makeString("LEXWIZ-~S");



    private static final SubLSymbol SME_LEXIFICATION_INTERLOCUTOR_CHECK_GENERIC_METHOD = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-CHECK-GENERIC-METHOD");

    private static final SubLSymbol $sym384$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-INTERLOCUTOR-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_INTERLOCUTOR_SET_CALLBACK_FUNCTION_METHOD = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-SET-CALLBACK-FUNCTION-METHOD");

    private static final SubLSymbol $sym386$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-INTERLOCUTOR-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_INTERLOCUTOR_SET_PROXY_METHOD = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-SET-PROXY-METHOD");

    public static final SubLList $list388 = list(list(makeSymbol("PWHEN"), makeSymbol("CALLBACK-FUNCTION"), list(makeSymbol("FUNCALL"), makeSymbol("CALLBACK-FUNCTION"), makeSymbol("CLIENT-DATA"), makeSymbol("STATUS"), makeSymbol("SELF"), makeSymbol("USER-DATA"))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol $sym389$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-INTERLOCUTOR-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_INTERLOCUTOR_NOTIFY_CLIENT_METHOD = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-NOTIFY-CLIENT-METHOD");

    private static final SubLList $list391 = list(list(makeSymbol("PWHEN"), makeSymbol("PROXY"), list(makeSymbol("RET"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROXY"), list(makeSymbol("QUOTE"), makeSymbol("MUMBLE")), makeSymbol("MESSAGE")))));

    private static final SubLSymbol $sym392$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-INTERLOCUTOR-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_INTERLOCUTOR_MUMBLE_METHOD = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-MUMBLE-METHOD");

    private static final SubLList $list394 = list(list(makeSymbol("PWHEN"), makeSymbol("PROXY"), list(makeSymbol("RET"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROXY"), list(makeSymbol("QUOTE"), makeSymbol("FORGE-AHEAD?"))))));

    private static final SubLSymbol $sym395$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-INTERLOCUTOR-METHOD");

    private static final SubLSymbol $sym396$SME_LEXIFICATION_INTERLOCUTOR_FORGE_AHEAD__METHOD = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-FORGE-AHEAD?-METHOD");

    private static final SubLSymbol PHRASE_DENOTATIONS = makeSymbol("PHRASE-DENOTATIONS");

    public static final SubLList $list398 = list(makeSymbol("PHRASE"));

    public static final SubLList $list399 = list(list(makeSymbol("RET"), list(makeSymbol("ALL-DENOTS-OF-STRING"), makeSymbol("PHRASE"), NIL, list(makeSymbol("LEXWIZ-LEXICAL-MT"), makeSymbol("LEXWIZ-PARAMETERS")))));

    private static final SubLSymbol $sym400$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-INTERLOCUTOR-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_INTERLOCUTOR_PHRASE_DENOTATIONS_METHOD = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-PHRASE-DENOTATIONS-METHOD");

    public static final SubLList $list402 = list(list(makeSymbol("RET"), list(makeSymbol("FIF"), makeSymbol("PROXY"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROXY"), list(makeSymbol("QUOTE"), makeSymbol("DESCRIBE-TERM")), makeSymbol("TERM")), list(makeSymbol("LEX-DESCRIBE-TERM"), makeSymbol("TERM"), list(makeSymbol("LEXWIZ-LEXICAL-MT"), makeSymbol("LEXWIZ-PARAMETERS"))))));

    public static final SubLSymbol $sym403$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-INTERLOCUTOR-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_INTERLOCUTOR_DESCRIBE_TERM_METHOD = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-DESCRIBE-TERM-METHOD");

    private static final SubLSymbol UPDATE_LEXIFICATION_PARAMETERS = makeSymbol("UPDATE-LEXIFICATION-PARAMETERS");

    public static final SubLList $list406 = list(list(makeSymbol("CLET"), list(list(makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("GET-INTERLOCUTOR-AGENT"), makeSymbol("SELF"))), list(makeSymbol("NEW-LEXIFICATION-PARAMETERS"), list(makeSymbol("COPY-LEXIFICATION-PARAMETERS"), makeSymbol("LEXWIZ-PARAMETERS")))), list(makeSymbol("SET-SLOT"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("LEXWIZ-PARAMETERS")), makeSymbol("NEW-LEXIFICATION-PARAMETERS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("INTERLOCUTOR-AGENT"), list(makeSymbol("QUOTE"), makeSymbol("SET-USER-DATA")), makeSymbol("NEW-LEXIFICATION-PARAMETERS")), list(makeSymbol("RET"), NIL)));

    private static final SubLSymbol $sym407$SME_LEXIFICATION_INTERLOCUTOR_UPDATE_LEXIFICATION_PARAMETERS_METH = makeSymbol("SME-LEXIFICATION-INTERLOCUTOR-UPDATE-LEXIFICATION-PARAMETERS-METHOD");

    private static final SubLList $list408 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SME-STATE"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("SME-STATE")))), list(makeSymbol("CLET"), list(list(makeSymbol("STATE-SEQUENCE"), list(makeSymbol("QUOTE"), list(new SubLObject[]{ makeSymbol("DO-INITIALIZATION"), makeSymbol("CHECK-INITIALIZATION"), makeSymbol("ASK-TERM"), makeSymbol("CHECK-TERM"), makeSymbol("ASK-TERM-SELECTION"), makeSymbol("CHECK-TERM-SELECTION"), makeSymbol("ASK-PHRASE"), makeSymbol("CHECK-PHRASE"), makeSymbol("ASK-AMBIGUITY"), makeSymbol("CHECK-AMBIGUITY"), makeSymbol("ASK-PROPER-NAME-STATUS"), makeSymbol("CHECK-PROPER-NAME-STATUS"), makeSymbol("END-INTERACTION") })))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("SET-STATES")), makeSymbol("STATE-SEQUENCE"))), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLList $list409 = list(new SubLObject[]{ makeSymbol("DO-INITIALIZATION"), makeSymbol("CHECK-INITIALIZATION"), makeSymbol("ASK-TERM"), makeSymbol("CHECK-TERM"), makeSymbol("ASK-TERM-SELECTION"), makeSymbol("CHECK-TERM-SELECTION"), makeSymbol("ASK-PHRASE"), makeSymbol("CHECK-PHRASE"), makeSymbol("ASK-AMBIGUITY"), makeSymbol("CHECK-AMBIGUITY"), makeSymbol("ASK-PROPER-NAME-STATUS"), makeSymbol("CHECK-PROPER-NAME-STATUS"), makeSymbol("END-INTERACTION") });

    private static final SubLSymbol SME_LI_PRE_GENERAL_INITIALIZE_METHOD = makeSymbol("SME-LI-PRE-GENERAL-INITIALIZE-METHOD");

    private static final SubLSymbol DO_INITIALIZATION = makeSymbol("DO-INITIALIZATION");

    private static final SubLList $list412 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TITLE"), makeString("Performing dictionary assistant initialization")), list(makeSymbol("QUESTION"), list(makeSymbol("FORMAT"), NIL, makeString("~a~%~%~a"), makeSymbol("*LEXWIZ-WELCOME-MESSAGE*"), makeString("Press OK to proceed."))), list(makeSymbol("CHOICES"), NIL), list(makeSymbol("TIP"), makeSymbol("*LEXWIZ-INITIALIZATION-TIP*"))), list(makeSymbol("PIF"), makeSymbol("*SME-LEXWIZ-INITIALIZED?*"), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")), list(makeSymbol("ASK-GENERIC-ENUMERATED"), makeSymbol("SELF"), makeSymbol("TITLE"), makeSymbol("QUESTION"), makeSymbol("CHOICES"), makeSymbol("TIP"))), list(makeSymbol("RET"), T)));

    private static final SubLString $str413$Performing_dictionary_assistant_i = makeString("Performing dictionary assistant initialization");

    private static final SubLString $str414$_a_____a = makeString("~a~%~%~a");

    private static final SubLString $str415$Press_OK_to_proceed_ = makeString("Press OK to proceed.");

    private static final SubLSymbol SME_LI_PRE_GENERAL_DO_INITIALIZATION_METHOD = makeSymbol("SME-LI-PRE-GENERAL-DO-INITIALIZATION-METHOD");

    private static final SubLSymbol CHECK_INITIALIZATION = makeSymbol("CHECK-INITIALIZATION");

    private static final SubLList $list418 = list(list(makeSymbol("PUNLESS"), makeSymbol("*SME-LEXWIZ-INITIALIZED?*"), list(makeSymbol("INIT-SME-LEXIFICATION-WIZARD"))), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")), list(makeSymbol("RET"), T));

    private static final SubLSymbol SME_LI_PRE_GENERAL_CHECK_INITIALIZATION_METHOD = makeSymbol("SME-LI-PRE-GENERAL-CHECK-INITIALIZATION-METHOD");



    private static final SubLList $list421 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TERM-LABEL"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("TITLE"), list(makeSymbol("FORMAT"), NIL, makeString("Determining concept to be lexified"))), list(makeSymbol("QUESTION"), list(makeSymbol("FORMAT"), NIL, makeString("Which concept's lexical information would you like to refine?"))), list(makeSymbol("TIP"), makeString("This is usually the name of the term you created using the Concept Creator Tool")), list(makeSymbol("SIZE"), makeInteger(60))), list(makeSymbol("PIF"), list(makeSymbol("COR"), list(makeSymbol("FORT-P"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("CAND"), list(makeSymbol("NON-EMPTY-STRING?"), makeSymbol("TERM-LABEL")), list(makeSymbol("LEX-EMPTY-STRING?"), list(makeSymbol("LEXWIZ-ERROR-MESSAGE"), makeSymbol("LEXWIZ-PARAMETERS"))))), list(makeSymbol("PROGN"), list(makeSymbol("SET-ANSWER"), makeSymbol("SELF"), makeSymbol("TERM-LABEL")), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF"))), list(makeSymbol("ASK-GENERIC-FREE-FORM"), makeSymbol("SELF"), makeSymbol("TITLE"), makeSymbol("QUESTION"), makeSymbol("TIP"), makeSymbol("SIZE"), makeSymbol("TERM-LABEL"))), list(makeSymbol("RET"), T)));

    private static final SubLSymbol $sym422$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-PRE-GENERAL-METHOD");

    private static final SubLString $str423$Determining_concept_to_be_lexifie = makeString("Determining concept to be lexified");

    private static final SubLString $str424$Which_concept_s_lexical_informati = makeString("Which concept's lexical information would you like to refine?");

    private static final SubLString $str425$This_is_usually_the_name_of_the_t = makeString("This is usually the name of the term you created using the Concept Creator Tool");

    private static final SubLInteger $int$60 = makeInteger(60);

    private static final SubLSymbol SME_LI_PRE_GENERAL_ASK_TERM_METHOD = makeSymbol("SME-LI-PRE-GENERAL-ASK-TERM-METHOD");



    private static final SubLList $list429 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("FORT-P"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("CLET"), list(list(makeSymbol("TERM-LABEL"), list(makeSymbol("GET-ANSWER"), makeSymbol("SELF")))), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS")), list(makeSymbol("RESOLVE-TERM"), makeSymbol("SELF"), makeSymbol("TERM-LABEL"))), list(makeSymbol("PUNLESS"), list(makeSymbol(">"), list(makeSymbol("LENGTH"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), ZERO_INTEGER), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS")), makeSymbol("TERM-LABEL")), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-ERROR-MESSAGE"), makeSymbol("LEXWIZ-PARAMETERS")), makeString("A valid concept must be specified")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-STATES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("GET-STATES"))))), list(makeSymbol("CSETQ"), makeSymbol("NEW-STATES"), list(makeSymbol("APPEND"), list(makeSymbol("QUOTE"), list(makeSymbol("ASK-TERM"), makeSymbol("CHECK-TERM"))), makeSymbol("NEW-STATES"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("SET-STATES")), makeSymbol("NEW-STATES")))))), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")), list(makeSymbol("RET"), T));

    private static final SubLSymbol $sym430$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-PRE-GENERAL-METHOD");

    private static final SubLString $$$A_valid_concept_must_be_specified = makeString("A valid concept must be specified");

    private static final SubLList $list432 = list(makeSymbol("ASK-TERM"), makeSymbol("CHECK-TERM"));

    private static final SubLSymbol SME_LI_PRE_GENERAL_CHECK_TERM_METHOD = makeSymbol("SME-LI-PRE-GENERAL-CHECK-TERM-METHOD");

    public static final SubLList $list434 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TERM-CLARIFICATIONS"), list(makeSymbol("LIST"), list(makeSymbol("LIST"), list(makeSymbol("LEX-FORT-FOR-STRING"), makeSymbol("TERM-LABEL")), makeSymbol("TERM-LABEL"))))), list(makeSymbol("PWHEN"), makeSymbol("PROXY"), list(makeSymbol("CSETQ"), makeSymbol("TERM-CLARIFICATIONS"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROXY"), list(makeSymbol("QUOTE"), makeSymbol("RESOLVE-TERM")), makeSymbol("TERM-LABEL")))), list(makeSymbol("RET"), makeSymbol("TERM-CLARIFICATIONS"))));

    private static final SubLSymbol $sym435$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-PRE-GENERAL-METHOD");

    private static final SubLSymbol SME_LI_PRE_GENERAL_RESOLVE_TERM_METHOD = makeSymbol("SME-LI-PRE-GENERAL-RESOLVE-TERM-METHOD");

    private static final SubLSymbol ASK_TERM_SELECTION = makeSymbol("ASK-TERM-SELECTION");

    private static final SubLList $list438 = list(list(makeSymbol("TRACE-LEXIFICATION-PARAMETERS"), makeSymbol("LEXWIZ-PARAMETERS")), list(makeSymbol("PWHEN"), list(makeSymbol("FORT-P"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")), list(makeSymbol("RET"), T)), list(makeSymbol("PUNLESS"), list(makeSymbol("LISTP"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("LEX-WARN"), makeString("Unexpected term parameter: ~s~%"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("RET"), T)), list(makeSymbol("CLET"), list(list(makeSymbol("TERM-CLARIFICATIONS"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("TITLE"), list(makeSymbol("FORMAT"), NIL, makeString("Clarifying term to be lexified"))), list(makeSymbol("QUESTION"), list(makeSymbol("FORMAT"), NIL, makeString("Which of the following terms do you mean?"))), list(makeSymbol("CHOICES"), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("SECOND")), makeSymbol("TERM-CLARIFICATIONS"))), list(makeSymbol("VALUES"), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("FIRST")), makeSymbol("TERM-CLARIFICATIONS"))), makeSymbol("DEFAULT-OFFSET"), makeSymbol("TIP")), list(makeSymbol("PWHEN"), list(makeSymbol("="), list(makeSymbol("LENGTH"), makeSymbol("CHOICES")), ONE_INTEGER), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS")), list(makeSymbol("FIRST"), list(makeSymbol("FIRST"), makeSymbol("TERM-CLARIFICATIONS"))))), list(makeSymbol("PIF"), list(makeSymbol("FORT-P"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")), list(makeSymbol("ASK-GENERIC-ENUMERATED"), makeSymbol("SELF"), makeSymbol("TITLE"), makeSymbol("QUESTION"), makeSymbol("CHOICES"), makeSymbol("TIP"), makeSymbol("VALUES"), makeSymbol("DEFAULT-OFFSET"))), list(makeSymbol("RET"), T)));

    private static final SubLSymbol $sym439$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-PRE-GENERAL-METHOD");

    private static final SubLString $str440$Unexpected_term_parameter___s__ = makeString("Unexpected term parameter: ~s~%");

    private static final SubLString $$$Clarifying_term_to_be_lexified = makeString("Clarifying term to be lexified");

    private static final SubLString $str442$Which_of_the_following_terms_do_y = makeString("Which of the following terms do you mean?");





    private static final SubLSymbol SME_LI_PRE_GENERAL_ASK_TERM_SELECTION_METHOD = makeSymbol("SME-LI-PRE-GENERAL-ASK-TERM-SELECTION-METHOD");

    private static final SubLSymbol CHECK_TERM_SELECTION = makeSymbol("CHECK-TERM-SELECTION");

    private static final SubLList $list447 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("FORT-P"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS")), list(makeSymbol("LEX-FORT-FOR-STRING"), list(makeSymbol("GET-ANSWER"), makeSymbol("SELF"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("FORT-P"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-ERROR-MESSAGE"), makeSymbol("LEXWIZ-PARAMETERS")), makeString("A valid concept must be specified")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-STATES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("GET-STATES"))))), list(makeSymbol("CSETQ"), makeSymbol("NEW-STATES"), list(makeSymbol("APPEND"), list(makeSymbol("QUOTE"), list(makeSymbol("ASK-TERM"), makeSymbol("CHECK-TERM"), makeSymbol("ASK-TERM-SELECTION"), makeSymbol("CHECK-TERM-SELECTION"))), makeSymbol("NEW-STATES"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("SET-STATES")), makeSymbol("NEW-STATES")))), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")), list(makeSymbol("RET"), T));

    private static final SubLSymbol $sym448$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-PRE-GENERAL-METHOD");

    public static final SubLList $list449 = list(makeSymbol("ASK-TERM"), makeSymbol("CHECK-TERM"), makeSymbol("ASK-TERM-SELECTION"), makeSymbol("CHECK-TERM-SELECTION"));

    private static final SubLSymbol SME_LI_PRE_GENERAL_CHECK_TERM_SELECTION_METHOD = makeSymbol("SME-LI-PRE-GENERAL-CHECK-TERM-SELECTION-METHOD");



    private static final SubLList $list452 = list(list(makeSymbol("CLET"), list(new SubLObject[]{ list(makeSymbol("PHRASE"), list(makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("TERM"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("TERM-DESC"), list(makeSymbol("DESCRIBE-TERM"), makeSymbol("SELF"), makeSymbol("TERM"))), list(makeSymbol("TITLE"), list(makeSymbol("FORMAT"), NIL, makeString("Checking phrase for the lexification"))), list(makeSymbol("QUESTION"), list(makeSymbol("FORMAT"), NIL, makeString("How would you like to refer to the concept '~a'?"), makeSymbol("TERM-DESC"))), list(makeSymbol("TIP"), makeSymbol("*PHRASE-SPECIFICATION-TIP*")), list(makeSymbol("SIZE"), makeInteger(60)), list(makeSymbol("SKIP?"), list(makeSymbol("NON-EMPTY-STRING?"), makeSymbol("PHRASE"))), makeSymbol("DEFAULT") }), list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), makeSymbol("SKIP?"), list(makeSymbol("SME-LEXWIZ-OK?"), makeSymbol("LEXWIZ-SETTINGS"))), list(makeSymbol("CSETQ"), makeSymbol("PHRASE"), list(makeSymbol("PREFERRED-LOOSE-LEXIFICATION-PHRASE-FOR-TERM"), makeSymbol("TERM"))), list(makeSymbol("CSETQ"), makeSymbol("DEFAULT"), makeSymbol("PHRASE")), list(makeSymbol("SET-ANSWER"), makeSymbol("SELF"), makeSymbol("PHRASE")), list(makeSymbol("PWHEN"), makeSymbol("*USE-INFERRED-PHRASES?*"), list(makeSymbol("CSETQ"), makeSymbol("SKIP?"), list(makeSymbol("NON-EMPTY-STRING?"), makeSymbol("DEFAULT"))))), list(makeSymbol("CLET"), list(list(makeSymbol("PHRASE-WORDS"), list(makeSymbol("LEX-STRING-TOKENIZE"), makeSymbol("PHRASE"), NIL))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("SKIP?"), list(makeSymbol("IS-DETERMINER?"), list(makeSymbol("FIRST"), makeSymbol("PHRASE-WORDS"))), list(makeSymbol("COLLECTION-IN-ANY-MT?"), makeSymbol("TERM"))), list(makeSymbol("CLET"), list(list(makeSymbol("MESSAGE"), list(makeSymbol("FORMAT"), NIL, makeString("Assuming you don't want to use the determiner ~s in the phrase ~s"), list(makeSymbol("FIRST"), makeSymbol("PHRASE-WORDS")), makeSymbol("PHRASE")))), list(makeSymbol("CSETQ"), makeSymbol("DEFAULT"), list(makeSymbol("JOIN-WORDS"), list(makeSymbol("REST"), makeSymbol("PHRASE-WORDS")))), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-PARAMETERS")), makeString("")), list(makeSymbol("CSETQ"), makeSymbol("SKIP?"), NIL), list(makeSymbol("MUMBLE"), makeSymbol("SELF"), makeSymbol("MESSAGE"))))), list(makeSymbol("PIF"), makeSymbol("SKIP?"), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")), list(makeSymbol("ASK-GENERIC-FREE-FORM"), makeSymbol("SELF"), makeSymbol("TITLE"), makeSymbol("QUESTION"), makeSymbol("TIP"), makeSymbol("SIZE"), makeSymbol("DEFAULT"))), list(makeSymbol("RET"), T)));

    private static final SubLSymbol $sym453$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-PRE-GENERAL-METHOD");

    private static final SubLString $str454$Checking_phrase_for_the_lexificat = makeString("Checking phrase for the lexification");

    private static final SubLString $str455$How_would_you_like_to_refer_to_th = makeString("How would you like to refer to the concept '~a'?");

    private static final SubLString $str456$Assuming_you_don_t_want_to_use_th = makeString("Assuming you don't want to use the determiner ~s in the phrase ~s");

    private static final SubLString $str457$ = makeString("");

    private static final SubLSymbol SME_LI_PRE_GENERAL_ASK_PHRASE_METHOD = makeSymbol("SME-LI-PRE-GENERAL-ASK-PHRASE-METHOD");



    public static final SubLList $list460 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PHRASE"), list(makeSymbol("LEX-NORMALIZE-STRING"), list(makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-PARAMETERS"))))), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-PARAMETERS")), makeSymbol("PHRASE")), list(makeSymbol("PWHEN"), list(makeSymbol("LEX-EMPTY-STRING?"), makeSymbol("PHRASE")), list(makeSymbol("CSETQ"), makeSymbol("PHRASE"), list(makeSymbol("LEX-NORMALIZE-STRING"), list(makeSymbol("GET-ANSWER"), makeSymbol("SELF")))), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-PARAMETERS")), makeSymbol("PHRASE")), list(makeSymbol("PWHEN"), list(makeSymbol("LEX-EMPTY-STRING?"), makeSymbol("PHRASE")), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-ERROR-MESSAGE"), makeSymbol("LEXWIZ-PARAMETERS")), makeString("A valid phrase must be specified")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-STATES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("GET-STATES"))))), list(makeSymbol("CSETQ"), makeSymbol("NEW-STATES"), list(makeSymbol("APPEND"), list(makeSymbol("QUOTE"), list(makeSymbol("ASK-PHRASE"), makeSymbol("CHECK-PHRASE"))), makeSymbol("NEW-STATES"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("SET-STATES")), makeSymbol("NEW-STATES")))))), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")), list(makeSymbol("RET"), T));

    private static final SubLSymbol $sym461$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-PRE-GENERAL-METHOD");

    private static final SubLString $$$A_valid_phrase_must_be_specified = makeString("A valid phrase must be specified");

    private static final SubLList $list463 = list(makeSymbol("ASK-PHRASE"), makeSymbol("CHECK-PHRASE"));

    private static final SubLSymbol SME_LI_PRE_GENERAL_CHECK_PHRASE_METHOD = makeSymbol("SME-LI-PRE-GENERAL-CHECK-PHRASE-METHOD");

    private static final SubLSymbol ASK_AMBIGUITY = makeSymbol("ASK-AMBIGUITY");

    private static final SubLList $list466 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PHRASE"), list(makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("TERM"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("TERM-DESC"), list(makeSymbol("DESCRIBE-TERM"), makeSymbol("SELF"), makeSymbol("TERM"))), list(makeSymbol("TITLE"), list(makeSymbol("FORMAT"), NIL, makeString("Checking phrase ambiguity"))), list(makeSymbol("OTHER-TERMS"), list(makeSymbol("REMOVE"), makeSymbol("TERM"), list(makeSymbol("PHRASE-DENOTATIONS"), makeSymbol("SELF"), makeSymbol("PHRASE")))), list(makeSymbol("OTHER-TERM-DESCS"), list(makeSymbol("MAP-METHOD"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("DESCRIBE-TERM")), makeSymbol("OTHER-TERMS"))), list(makeSymbol("QUESTION"), list(makeSymbol("FORMAT"), NIL, makeString("In addition to '~a', phrase ~s also refers to the following:~a~a~%~%Is that OK?"), makeSymbol("TERM-DESC"), makeSymbol("PHRASE"), makeSymbol("*NEWLINE-TAB*"), list(makeSymbol("JOIN-STRINGS"), makeSymbol("OTHER-TERM-DESCS"), makeSymbol("*NEWLINE-TAB*")))), list(makeSymbol("SKIP?"), list(makeSymbol("NULL"), makeSymbol("OTHER-TERMS")))), list(makeSymbol("SET-ANSWER"), makeSymbol("SELF"), makeSymbol("SKIP?")), list(makeSymbol("PIF"), makeSymbol("SKIP?"), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")), list(makeSymbol("ASK-GENERIC-BOOLEAN"), makeSymbol("SELF"), makeSymbol("TITLE"), makeSymbol("QUESTION"))), list(makeSymbol("RET"), T)));

    private static final SubLSymbol $sym467$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-PRE-GENERAL-METHOD");

    private static final SubLString $$$Checking_phrase_ambiguity = makeString("Checking phrase ambiguity");

    private static final SubLString $str469$In_addition_to___a___phrase__s_al = makeString("In addition to '~a', phrase ~s also refers to the following:~a~a~%~%Is that OK?");

    private static final SubLSymbol SME_LI_PRE_GENERAL_ASK_AMBIGUITY_METHOD = makeSymbol("SME-LI-PRE-GENERAL-ASK-AMBIGUITY-METHOD");

    private static final SubLSymbol CHECK_AMBIGUITY = makeSymbol("CHECK-AMBIGUITY");

    private static final SubLList $list472 = list(list(makeSymbol("CLET"), list(list(makeSymbol("OK?"), list(makeSymbol("GET-ANSWER"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("OK?"), list(makeSymbol("CSETF"), list(makeSymbol("SME-LEXWIZ-OK?"), makeSymbol("LEXWIZ-SETTINGS")), T), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-PARAMETERS")), makeString("")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-STATES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("GET-STATES"))))), list(makeSymbol("CSETQ"), makeSymbol("NEW-STATES"), list(makeSymbol("APPEND"), list(makeSymbol("QUOTE"), list(makeSymbol("ASK-PHRASE"), makeSymbol("CHECK-PHRASE"), makeSymbol("ASK-AMBIGUITY"), makeSymbol("CHECK-AMBIGUITY"))), makeSymbol("NEW-STATES"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("SET-STATES")), makeSymbol("NEW-STATES"))))), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")), list(makeSymbol("RET"), T));

    private static final SubLSymbol $sym473$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-PRE-GENERAL-METHOD");

    private static final SubLList $list474 = list(makeSymbol("ASK-PHRASE"), makeSymbol("CHECK-PHRASE"), makeSymbol("ASK-AMBIGUITY"), makeSymbol("CHECK-AMBIGUITY"));

    private static final SubLSymbol SME_LI_PRE_GENERAL_CHECK_AMBIGUITY_METHOD = makeSymbol("SME-LI-PRE-GENERAL-CHECK-AMBIGUITY-METHOD");

    private static final SubLSymbol ASK_PROPER_NAME_STATUS = makeSymbol("ASK-PROPER-NAME-STATUS");

    private static final SubLList $list477 = list(list(makeSymbol("CLET"), list(new SubLObject[]{ list(makeSymbol("PHRASE"), list(makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("TERM"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("TERM-DESC"), list(makeSymbol("DESCRIBE-TERM"), makeSymbol("SELF"), makeSymbol("TERM"))), list(makeSymbol("TITLE"), makeString("Checking whether the phrase is a proper name")), list(makeSymbol("QUESTION"), list(makeSymbol("FORMAT"), NIL, makeString("Is the phrase \"~a\" a name?"), makeSymbol("PHRASE"))), list(makeSymbol("TIP"), makeSymbol("*PROPER-NAME-STATUS-TIP*")), list(makeSymbol("NAMEABLE?"), list(makeSymbol("IS-NAMEABLE-ENTITY?"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS")))), list(makeSymbol("HAS-UPPERCASE-LETTER?"), list(makeSymbol(">"), list(makeSymbol("COUNT-IF"), list(makeSymbol("FUNCTION"), makeSymbol("UPPER-CASE-P")), makeSymbol("PHRASE")), ZERO_INTEGER)), list(makeSymbol("USE-INFERRED-TYPE?"), list(makeSymbol("CAND"), list(makeSymbol("FORGE-AHEAD?"), makeSymbol("SELF")), list(makeSymbol("COR"), makeSymbol("NAMEABLE?"), list(makeSymbol("CNOT"), makeSymbol("HAS-UPPERCASE-LETTER?"))))), list(makeSymbol("SKIP?"), list(makeSymbol("COR"), list(makeSymbol("IS-RELATIONAL?"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), makeSymbol("USE-INFERRED-TYPE?"))) }), list(makeSymbol("PIF"), makeSymbol("SKIP?"), list(makeSymbol("CLET"), list(list(makeSymbol("QUALIFIER"), list(makeSymbol("FIF"), makeSymbol("NAMEABLE?"), makeString("is"), makeString("isn't"))), list(makeSymbol("REASON"), list(makeSymbol("FORMAT"), NIL, makeString("Assuming phrase ~s ~a a proper name since concept '~a' ~a a nameable entity"), makeSymbol("PHRASE"), makeSymbol("QUALIFIER"), makeSymbol("TERM-DESC"), makeSymbol("QUALIFIER")))), list(makeSymbol("PWHEN"), makeSymbol("USE-INFERRED-TYPE?"), list(makeSymbol("MUMBLE"), makeSymbol("SELF"), makeSymbol("REASON"))), list(makeSymbol("SET-ANSWER"), makeSymbol("SELF"), makeSymbol("NAMEABLE?")), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF"))), list(makeSymbol("ASK-GENERIC-BOOLEAN"), makeSymbol("SELF"), makeSymbol("TITLE"), makeSymbol("QUESTION"), makeSymbol("TIP"))), list(makeSymbol("RET"), T)));

    private static final SubLSymbol $sym478$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-PRE-GENERAL-METHOD");

    private static final SubLString $str479$Checking_whether_the_phrase_is_a_ = makeString("Checking whether the phrase is a proper name");

    private static final SubLString $str480$Is_the_phrase___a__a_name_ = makeString("Is the phrase \"~a\" a name?");



    private static final SubLString $$$is = makeString("is");

    private static final SubLString $str483$isn_t = makeString("isn't");

    private static final SubLString $str484$Assuming_phrase__s__a_a_proper_na = makeString("Assuming phrase ~s ~a a proper name since concept '~a' ~a a nameable entity");

    private static final SubLSymbol SME_LI_PRE_GENERAL_ASK_PROPER_NAME_STATUS_METHOD = makeSymbol("SME-LI-PRE-GENERAL-ASK-PROPER-NAME-STATUS-METHOD");

    private static final SubLSymbol CHECK_PROPER_NAME_STATUS = makeSymbol("CHECK-PROPER-NAME-STATUS");

    private static final SubLList $list487 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("IS-RELATIONAL?"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-IS-PROPER?"), makeSymbol("LEXWIZ-PARAMETERS")), list(makeSymbol("GET-ANSWER"), makeSymbol("SELF")))), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")), list(makeSymbol("RET"), T));

    private static final SubLSymbol SME_LI_PRE_GENERAL_CHECK_PROPER_NAME_STATUS_METHOD = makeSymbol("SME-LI-PRE-GENERAL-CHECK-PROPER-NAME-STATUS-METHOD");

    private static final SubLList $list489 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SME-STATE"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("SME-STATE")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("SET-STATES")), list(makeSymbol("QUOTE"), list(makeSymbol("ASK-ABBREVIATION-STATUS"), makeSymbol("CHECK-ABBREVIATION-STATUS"), makeSymbol("ASK-PREDICATE-TYPE"), makeSymbol("CHECK-PREDICATE-TYPE"), makeSymbol("ASK-REFINED-PREDICATION"), makeSymbol("CHECK-REFINED-PREDICATION"), makeSymbol("END-INTERACTION")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLList $list490 = list(makeSymbol("ASK-ABBREVIATION-STATUS"), makeSymbol("CHECK-ABBREVIATION-STATUS"), makeSymbol("ASK-PREDICATE-TYPE"), makeSymbol("CHECK-PREDICATE-TYPE"), makeSymbol("ASK-REFINED-PREDICATION"), makeSymbol("CHECK-REFINED-PREDICATION"), makeSymbol("END-INTERACTION"));

    private static final SubLSymbol SME_LI_PROPER_NAME_INITIALIZE_METHOD = makeSymbol("SME-LI-PROPER-NAME-INITIALIZE-METHOD");

    private static final SubLSymbol ASK_ABBREVIATION_STATUS = makeSymbol("ASK-ABBREVIATION-STATUS");

    private static final SubLList $list493 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PHRASE"), list(makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("TITLE"), makeString("Checking abbreviation predication")), list(makeSymbol("QUESTION"), list(makeSymbol("FORMAT"), NIL, makeString("Is ~s an abbreviation?"), makeSymbol("PHRASE"))), list(makeSymbol("NO-SPACE?"), list(makeSymbol("CNOT"), list(makeSymbol("CHAR-POSITION"), CHAR_space, makeSymbol("PHRASE")))), makeSymbol("REASON")), list(makeSymbol("PWHEN"), makeSymbol("NO-SPACE?"), list(makeSymbol("PWHEN"), list(makeSymbol("UPPER-CASE-STRING-P"), makeSymbol("PHRASE")), list(makeSymbol("CSETQ"), makeSymbol("REASON"), makeString("uppercase"))), list(makeSymbol("PWHEN"), list(makeSymbol("ENDS-WITH"), makeSymbol("PHRASE"), makeString(".")), list(makeSymbol("CSETQ"), makeSymbol("REASON"), makeString("ends with period")))), list(makeSymbol("PIF"), makeSymbol("REASON"), list(makeSymbol("CLET"), list(list(makeSymbol("MESSAGE"), list(makeSymbol("FORMAT"), NIL, makeString("Checking whether ~s is an abbreviation since ~a"), makeSymbol("PHRASE"), makeSymbol("REASON")))), list(makeSymbol("MUMBLE"), makeSymbol("SELF"), makeSymbol("MESSAGE")), list(makeSymbol("ASK-GENERIC-BOOLEAN"), makeSymbol("SELF"), makeSymbol("TITLE"), makeSymbol("QUESTION"))), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF"))), list(makeSymbol("RET"), T)));

    private static final SubLSymbol $sym494$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-PROPER-NAME-METHOD");

    private static final SubLString $$$Checking_abbreviation_predication = makeString("Checking abbreviation predication");

    private static final SubLString $str496$Is__s_an_abbreviation_ = makeString("Is ~s an abbreviation?");

    private static final SubLString $$$uppercase = makeString("uppercase");

    private static final SubLString $str498$_ = makeString(".");

    private static final SubLString $$$ends_with_period = makeString("ends with period");

    private static final SubLString $str500$Checking_whether__s_is_an_abbrevi = makeString("Checking whether ~s is an abbreviation since ~a");

    private static final SubLSymbol SME_LI_PROPER_NAME_ASK_ABBREVIATION_STATUS_METHOD = makeSymbol("SME-LI-PROPER-NAME-ASK-ABBREVIATION-STATUS-METHOD");

    private static final SubLSymbol CHECK_ABBREVIATION_STATUS = makeSymbol("CHECK-ABBREVIATION-STATUS");

    private static final SubLList $list503 = list(list(makeSymbol("CSETF"), list(makeSymbol("SME-LEXWIZ-IS-ABBREVIATION?"), makeSymbol("LEXWIZ-SETTINGS")), list(makeSymbol("GET-ANSWER"), makeSymbol("SELF"))), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")), list(makeSymbol("RET"), T));

    private static final SubLSymbol $sym504$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-PROPER-NAME-METHOD");

    private static final SubLSymbol SME_LI_PROPER_NAME_CHECK_ABBREVIATION_STATUS_METHOD = makeSymbol("SME-LI-PROPER-NAME-CHECK-ABBREVIATION-STATUS-METHOD");

    private static final SubLSymbol ASK_PREDICATE_TYPE = makeSymbol("ASK-PREDICATE-TYPE");

    private static final SubLList $list507 = list(list(makeSymbol("CLET"), list(list(makeSymbol("IS-ABBREVIATION?"), list(makeSymbol("SME-LEXWIZ-IS-ABBREVIATION?"), makeSymbol("LEXWIZ-SETTINGS"))), list(makeSymbol("PRED-TYPE"), list(makeSymbol("FIF"), makeSymbol("IS-ABBREVIATION?"), makeString("abbreviation types"), makeString("specialized kinds of names"))), list(makeSymbol("TERM"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("TERM-DESC"), list(makeSymbol("DESCRIBE-TERM"), makeSymbol("SELF"), makeSymbol("TERM"))), list(makeSymbol("PHRASE"), list(makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("TITLE"), makeString("Determining proper name type")), list(makeSymbol("QUESTION"), list(makeSymbol("FORMAT"), NIL, makeString("If ~s is one of the ~a of names listed below, specify the correct type. Otherwise, just press OK."), makeSymbol("PHRASE"), makeSymbol("PRED-TYPE"))), list(makeSymbol("TIP"), makeString("When in doubt, select the default. For example, currently there are no specializations for people\'s name including title (e.g., \"General Francisco Franco\")."))), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("CHOICES"), makeSymbol("PREDICATES"), makeSymbol("DEFAULT-OFFSET")), list(makeSymbol("DETERMINE-PROPER-NAME-PRED-CHOICES"), makeSymbol("TERM"), makeSymbol("IS-ABBREVIATION?")), list(makeSymbol("PIF"), list(makeSymbol("NULL"), makeSymbol("CHOICES")), list(makeSymbol("CLET"), list(list(makeSymbol("MESSAGE"), list(makeSymbol("FORMAT"), NIL, makeString("No specialized proper name types apply to '~a'"), makeSymbol("TERM-DESC")))), list(makeSymbol("MUMBLE"), makeSymbol("SELF"), makeSymbol("MESSAGE")), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF"))), list(makeSymbol("ASK-GENERIC-ENUMERATED"), makeSymbol("SELF"), makeSymbol("TITLE"), makeSymbol("QUESTION"), makeSymbol("CHOICES"), makeSymbol("TIP"), makeSymbol("PREDICATES"), makeSymbol("DEFAULT-OFFSET")))), list(makeSymbol("RET"), T)));

    private static final SubLSymbol $sym508$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-PROPER-NAME-METHOD");

    private static final SubLString $$$abbreviation_types = makeString("abbreviation types");

    private static final SubLString $$$specialized_kinds_of_names = makeString("specialized kinds of names");

    private static final SubLString $$$Determining_proper_name_type = makeString("Determining proper name type");

    private static final SubLString $str512$If__s_is_one_of_the__a_of_names_l = makeString("If ~s is one of the ~a of names listed below, specify the correct type. Otherwise, just press OK.");

    private static final SubLString $str513$When_in_doubt__select_the_default = makeString("When in doubt, select the default. For example, currently there are no specializations for people\'s name including title (e.g., \"General Francisco Franco\").");

    private static final SubLString $str514$No_specialized_proper_name_types_ = makeString("No specialized proper name types apply to '~a'");

    private static final SubLSymbol SME_LI_PROPER_NAME_ASK_PREDICATE_TYPE_METHOD = makeSymbol("SME-LI-PROPER-NAME-ASK-PREDICATE-TYPE-METHOD");

    private static final SubLSymbol CHECK_PREDICATE_TYPE = makeSymbol("CHECK-PREDICATE-TYPE");

    private static final SubLList $list517 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PROPER-NAME-PRED"), list(makeSymbol("GET-ANSWER"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), list(EQUAL, makeSymbol("PROPER-NAME-PRED"), makeString("n/a")), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-PROPER-NAME-PRED"), makeSymbol("LEXWIZ-PARAMETERS")), makeSymbol("PROPER-NAME-PRED"))), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")), list(makeSymbol("RET"), T)));

    private static final SubLSymbol $sym518$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-PROPER-NAME-METHOD");

    private static final SubLString $str519$n_a = makeString("n/a");

    private static final SubLSymbol SME_LI_PROPER_NAME_CHECK_PREDICATE_TYPE_METHOD = makeSymbol("SME-LI-PROPER-NAME-CHECK-PREDICATE-TYPE-METHOD");

    private static final SubLSymbol ASK_REFINED_PREDICATION = makeSymbol("ASK-REFINED-PREDICATION");

    public static final SubLList $list522 = list(list(makeSymbol("CLET"), list(new SubLObject[]{ list(makeSymbol("PRED"), list(makeSymbol("LEXWIZ-PROPER-NAME-PRED"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("TERM"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("CYC-TERM"), list(makeSymbol("LEX-FORT-FOR-STRING"), makeSymbol("TERM"))), list(makeSymbol("IS-PERSON?"), list(makeSymbol("ISA-IN-ANY-MT?"), makeSymbol("CYC-TERM"), reader_make_constant_shell(makeString("Person")))), list(makeSymbol("PHRASE"), list(makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("TITLE"), list(makeSymbol("FIF"), makeSymbol("IS-PERSON?"), makeString("Checking constituents of the human name"), makeString("Checking for possible abbreviations"))), list(makeSymbol("QUESTION"), list(makeSymbol("FORMAT"), NIL, makeString("For the name ~s, please complete the following:"), makeSymbol("PHRASE"))), list(makeSymbol("PREDS"), list(makeSymbol("FIF"), makeSymbol("IS-PERSON?"), makeSymbol("*LEXWIZ-PERSON-SUB-PREDICATES*"), list(makeSymbol("FILTER-ABBREVIATION-PREDICATES"), makeSymbol("CYC-TERM")))), list(makeSymbol("LABELS"), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("LEX-DESCRIBE-TERM")), makeSymbol("PREDS"))), makeSymbol("DEFAULTS"), makeSymbol("DESCRIPTIONS"), makeSymbol("TIP"), makeSymbol("SIZES") }), list(makeSymbol("CMULTIPLE-VALUE-SETQ"), list(makeSymbol("DEFAULTS"), makeSymbol("DESCRIPTIONS")), list(makeSymbol("INFER-PROPER-NAME-SUB-PREDICATIONS"), makeSymbol("SELF"), makeSymbol("CYC-TERM"), makeSymbol("PHRASE"), makeSymbol("PREDS"))), list(makeSymbol("CSETF"), list(makeSymbol("SME-LEXWIZ-PROPER-SUB-PREDICATES"), makeSymbol("LEXWIZ-SETTINGS")), makeSymbol("PREDS")), list(makeSymbol("SET-ANSWER"), makeSymbol("SELF"), NIL), list(makeSymbol("PIF"), list(makeSymbol("CAND"), list(makeSymbol("COR"), list(makeSymbol("CAND"), makeSymbol("IS-PERSON?"), list(EQUAL, makeSymbol("PRED"), makeString("nameString")), list(makeSymbol(">"), list(makeSymbol("LENGTH"), list(makeSymbol("NAME-TOKENIZE"), makeSymbol("PHRASE"))), ONE_INTEGER)), list(makeSymbol(">="), list(makeSymbol("LENGTH"), list(makeSymbol("NAME-TOKENIZE"), makeSymbol("PHRASE"))), makeSymbol("*LEXWIZ-ABBREVIATION-CHECK-MIN-WORDS*")))), list(makeSymbol("CLET"), list(list(makeSymbol("REASON"), list(makeSymbol("FIF"), makeSymbol("IS-PERSON?"), makeString("for a person"), makeString("quite long"))), list(makeSymbol("MESSAGE"), list(makeSymbol("FORMAT"), NIL, makeString("Since ~s is ~a, checking additional name types"), makeSymbol("PHRASE"), makeSymbol("REASON")))), list(makeSymbol("MUMBLE"), makeSymbol("SELF"), makeSymbol("MESSAGE")), list(new SubLObject[]{ makeSymbol("ASK-GENERIC-MULTIPLE-FREE-FORM"), makeSymbol("SELF"), makeSymbol("TITLE"), makeSymbol("QUESTION"), makeSymbol("TIP"), makeSymbol("LABELS"), makeSymbol("SIZES"), makeSymbol("DEFAULTS"), makeSymbol("DESCRIPTIONS") })), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF"))), list(makeSymbol("RET"), T)));

    private static final SubLSymbol $sym523$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-PROPER-NAME-METHOD");

    private static final SubLObject $$Person = reader_make_constant_shell(makeString("Person"));

    private static final SubLString $str525$Checking_constituents_of_the_huma = makeString("Checking constituents of the human name");

    private static final SubLString $str526$Checking_for_possible_abbreviatio = makeString("Checking for possible abbreviations");

    private static final SubLString $str527$For_the_name__s__please_complete_ = makeString("For the name ~s, please complete the following:");

    private static final SubLString $$$nameString = makeString("nameString");

    private static final SubLString $$$for_a_person = makeString("for a person");

    private static final SubLString $$$quite_long = makeString("quite long");

    private static final SubLString $str531$Since__s_is__a__checking_addition = makeString("Since ~s is ~a, checking additional name types");

    private static final SubLSymbol SME_LI_PROPER_NAME_ASK_REFINED_PREDICATION_METHOD = makeSymbol("SME-LI-PROPER-NAME-ASK-REFINED-PREDICATION-METHOD");

    private static final SubLSymbol CHECK_REFINED_PREDICATION = makeSymbol("CHECK-REFINED-PREDICATION");

    private static final SubLList $list534 = list(list(makeSymbol("CLET"), list(list(makeSymbol("REFINED-PREDICATIONS"), list(makeSymbol("GET-ANSWER"), makeSymbol("SELF"))), list(makeSymbol("PREDICATES"), list(makeSymbol("SME-LEXWIZ-PROPER-SUB-PREDICATES"), makeSymbol("LEXWIZ-SETTINGS"))), list(makeSymbol("TERM"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS")))), list(makeSymbol("CDOLIST-NUMBERED"), list(makeSymbol("PREDICATION"), makeSymbol("I"), makeSymbol("REFINED-PREDICATIONS")), list(makeSymbol("PWHEN"), list(makeSymbol("NON-EMPTY-STRING?"), makeSymbol("PREDICATION")), list(makeSymbol("CLET"), list(list(makeSymbol("PREDICATE"), list(makeSymbol("ELT"), makeSymbol("PREDICATES"), makeSymbol("I")))), list(makeSymbol("CPUSH"), list(makeSymbol("BQ-LIST"), makeSymbol("PREDICATE"), makeSymbol("TERM"), makeSymbol("PREDICATION")), list(makeSymbol("LEXWIZ-OTHER-FORMULAS"), makeSymbol("LEXWIZ-PARAMETERS")))))), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")), list(makeSymbol("RET"), T)));

    private static final SubLSymbol $sym535$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-PROPER-NAME-METHOD");

    private static final SubLSymbol SME_LI_PROPER_NAME_CHECK_REFINED_PREDICATION_METHOD = makeSymbol("SME-LI-PROPER-NAME-CHECK-REFINED-PREDICATION-METHOD");

    private static final SubLSymbol INFER_PROPER_NAME_SUB_PREDICATIONS = makeSymbol("INFER-PROPER-NAME-SUB-PREDICATIONS");

    public static final SubLList $list538 = list(makeSymbol("TERM"), makeSymbol("PHRASE"), makeSymbol("PROPER-NAME-PREDICATES"));

    private static final SubLList $list539 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TITLE"), makeString("")), list(makeSymbol("SUFFIX"), makeString("")), list(makeSymbol("IS-PERSON?"), list(EQUAL, makeSymbol("*LEXWIZ-PERSON-SUB-PREDICATES*"), makeSymbol("PROPER-NAME-PREDICATES"))), makeSymbol("SUB-PREDICATIONS"), makeSymbol("DESCRIPTIONS")), list(makeSymbol("CLET"), list(list(makeSymbol("NAME-TOKENS"), list(makeSymbol("NAME-TOKENIZE"), makeSymbol("PHRASE")))), list(makeSymbol("PWHEN"), list(makeSymbol("COR"), list(makeSymbol("IS-NAME-TITLE?"), list(makeSymbol("FIRST"), makeSymbol("NAME-TOKENS"))), list(makeSymbol("CAND"), list(makeSymbol(">"), list(makeSymbol("LENGTH"), list(makeSymbol("FIRST"), makeSymbol("NAME-TOKENS"))), TWO_INTEGER), list(makeSymbol("ENDS-WITH"), list(makeSymbol("FIRST"), makeSymbol("NAME-TOKENS")), makeString(".")))), list(makeSymbol("CSETQ"), makeSymbol("TITLE"), list(makeSymbol("FIRST"), makeSymbol("NAME-TOKENS"))), list(makeSymbol("CSETQ"), makeSymbol("PHRASE"), list(makeSymbol("JOIN-WORDS"), list(makeSymbol("REST"), makeSymbol("NAME-TOKENS")))))), list(makeSymbol("CLET"), list(list(makeSymbol("NAME-TOKENS"), list(makeSymbol("NAME-TOKENIZE"), makeSymbol("PHRASE")))), list(makeSymbol("PWHEN"), list(makeSymbol("ENDS-WITH"), list(makeSymbol("PENULTIMATE-ONE"), makeSymbol("NAME-TOKENS")), makeString(",")), list(makeSymbol("CSETQ"), makeSymbol("SUFFIX"), list(makeSymbol("LAST-ONE"), makeSymbol("NAME-TOKENS"))), list(makeSymbol("CSETQ"), makeSymbol("PHRASE"), list(makeSymbol("JOIN-WORDS"), list(makeSymbol("REMOVE-LAST"), makeSymbol("NAME-TOKENS")))), list(makeSymbol("CSETQ"), makeSymbol("PHRASE"), list(makeSymbol("TRIM-SIDES"), makeSymbol("PHRASE"), CHAR_comma)))), list(makeSymbol("CLET"), list(list(makeSymbol("NAME-TOKENS"), list(makeSymbol("NAME-TOKENIZE"), makeSymbol("PHRASE"))), list(makeSymbol("FAMILY-NAME-FIRST?"), list(makeSymbol("HAS-FAMILY-NAME-FIRST?"), makeSymbol("TERM"))), list(makeSymbol("FAMILY-NAME-POSITION"), list(makeSymbol("FIF"), makeSymbol("FAMILY-NAME-FIRST?"), ZERO_INTEGER, list(makeSymbol("1-"), list(makeSymbol("LENGTH"), makeSymbol("NAME-TOKENS"))))), list(makeSymbol("GIVEN-NAME-POSITION"), list(makeSymbol("FIF"), makeSymbol("FAMILY-NAME-FIRST?"), list(makeSymbol("1-"), list(makeSymbol("LENGTH"), makeSymbol("NAME-TOKENS"))), ZERO_INTEGER)), list(makeSymbol("MIDDLE-NAME-POSITION"), list(makeSymbol("FIF"), makeSymbol("FAMILY-NAME-FIRST?"), list(makeSymbol("1-"), makeSymbol("GIVEN-NAME-POSITION")), ONE_INTEGER))), list(makeSymbol("PWHEN"), makeSymbol("FAMILY-NAME-FIRST?"), list(makeSymbol("MUMBLE"), makeSymbol("SELF"), list(makeSymbol("FORMAT"), NIL, makeString("Assuming family name given first in ~s based on ethnicity"), makeSymbol("PHRASE")))), list(makeSymbol("CDOLIST"), list(makeSymbol("PREDICATE"), makeSymbol("PROPER-NAME-PREDICATES")), list(makeSymbol("CLET"), list(list(makeSymbol("SUB-NAME"), makeString("")), list(makeSymbol("DESCRIPTION"), makeString(""))), list(new SubLObject[]{ makeSymbol("PCASE"), makeSymbol("PREDICATE"), list(reader_make_constant_shell(makeString("familyName")), list(makeSymbol("CSETQ"), makeSymbol("SUB-NAME"), list(makeSymbol("ELT"), makeSymbol("NAME-TOKENS"), makeSymbol("FAMILY-NAME-POSITION")))), list(reader_make_constant_shell(makeString("givenNames")), list(makeSymbol("PUNLESS"), list(makeSymbol("="), makeSymbol("FAMILY-NAME-POSITION"), makeSymbol("GIVEN-NAME-POSITION")), list(makeSymbol("CLET"), list(list(makeSymbol("GIVEN-NAME"), list(makeSymbol("ELT"), makeSymbol("NAME-TOKENS"), makeSymbol("GIVEN-NAME-POSITION")))), list(makeSymbol("PUNLESS"), list(makeSymbol("NAME-ABBREVIATION?"), makeSymbol("GIVEN-NAME")), list(makeSymbol("CSETQ"), makeSymbol("SUB-NAME"), makeSymbol("GIVEN-NAME")))))), list(reader_make_constant_shell(makeString("middleName")), list(makeSymbol("PWHEN"), list(makeSymbol(">"), list(makeSymbol("LENGTH"), makeSymbol("NAME-TOKENS")), TWO_INTEGER), list(makeSymbol("CLET"), list(list(makeSymbol("MIDDLE-NAME"), list(makeSymbol("ELT"), makeSymbol("NAME-TOKENS"), makeSymbol("MIDDLE-NAME-POSITION")))), list(makeSymbol("PUNLESS"), list(makeSymbol("NAME-ABBREVIATION?"), makeSymbol("MIDDLE-NAME")), list(makeSymbol("CSETQ"), makeSymbol("SUB-NAME"), makeSymbol("MIDDLE-NAME")))))), list(reader_make_constant_shell(makeString("titleOfPerson-String")), list(makeSymbol("CSETQ"), makeSymbol("SUB-NAME"), makeSymbol("TITLE"))), list(reader_make_constant_shell(makeString("nameSuffix")), list(makeSymbol("CSETQ"), makeSymbol("SUB-NAME"), makeSymbol("SUFFIX"))), list(reader_make_constant_shell(makeString("initialsString")), list(makeSymbol("PUNLESS"), makeSymbol("IS-PERSON?"), list(makeSymbol("CSETQ"), makeSymbol("DESCRIPTION"), makeString("(first letters of names; ex: FDR, JFK)")))), list(reader_make_constant_shell(makeString("initialismString")), list(makeSymbol("CSETQ"), makeSymbol("DESCRIPTION"), makeString("(first letters; ex: UNHCR, NATO, scuba)"))), list(reader_make_constant_shell(makeString("acronymString")), list(makeSymbol("CSETQ"), makeSymbol("DESCRIPTION"), makeString("(prefixes; ex: RADAR = RAdio Detection)"))), list(reader_make_constant_shell(makeString("abbreviationString-PN")), list(makeSymbol("CSETQ"), makeSymbol("DESCRIPTION"), makeString("(short form; ex: dict., parens)"))), list(makeSymbol("OTHERWISE"), list(makeSymbol("LEX-WARN"), makeString("Unexpected pred ~s in infer-proper-name-sub-predications~%"), makeSymbol("PREDICATE"))) }), list(makeSymbol("CPUSH"), makeSymbol("SUB-NAME"), makeSymbol("SUB-PREDICATIONS")), list(makeSymbol("CPUSH"), makeSymbol("DESCRIPTION"), makeSymbol("DESCRIPTIONS"))))), list(makeSymbol("RET"), list(makeSymbol("VALUES"), list(makeSymbol("NREVERSE"), makeSymbol("SUB-PREDICATIONS")), list(makeSymbol("NREVERSE"), makeSymbol("DESCRIPTIONS"))))));

    private static final SubLString $str540$_ = makeString(",");

    private static final SubLString $str541$Assuming_family_name_given_first_ = makeString("Assuming family name given first in ~s based on ethnicity");

    private static final SubLObject $$familyName = reader_make_constant_shell(makeString("familyName"));

    private static final SubLObject $$givenNames = reader_make_constant_shell(makeString("givenNames"));

    private static final SubLObject $$middleName = reader_make_constant_shell(makeString("middleName"));

    private static final SubLObject $$titleOfPerson_String = reader_make_constant_shell(makeString("titleOfPerson-String"));

    private static final SubLObject $$nameSuffix = reader_make_constant_shell(makeString("nameSuffix"));

    private static final SubLObject $$initialsString = reader_make_constant_shell(makeString("initialsString"));

    private static final SubLString $str548$_first_letters_of_names__ex__FDR_ = makeString("(first letters of names; ex: FDR, JFK)");

    private static final SubLObject $$initialismString = reader_make_constant_shell(makeString("initialismString"));

    private static final SubLString $str550$_first_letters__ex__UNHCR__NATO__ = makeString("(first letters; ex: UNHCR, NATO, scuba)");

    private static final SubLObject $$acronymString = reader_make_constant_shell(makeString("acronymString"));

    private static final SubLString $str552$_prefixes__ex__RADAR___RAdio_Dete = makeString("(prefixes; ex: RADAR = RAdio Detection)");

    private static final SubLObject $$abbreviationString_PN = reader_make_constant_shell(makeString("abbreviationString-PN"));

    private static final SubLString $str554$_short_form__ex__dict___parens_ = makeString("(short form; ex: dict., parens)");

    private static final SubLString $str555$Unexpected_pred__s_in_infer_prope = makeString("Unexpected pred ~s in infer-proper-name-sub-predications~%");

    private static final SubLSymbol SME_LI_PROPER_NAME_INFER_PROPER_NAME_SUB_PREDICATIONS_METHOD = makeSymbol("SME-LI-PROPER-NAME-INFER-PROPER-NAME-SUB-PREDICATIONS-METHOD");

    private static final SubLList $list557 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SME-STATE"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("SME-STATE")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("SET-STATES")), list(makeSymbol("QUOTE"), list(new SubLObject[]{ makeSymbol("GUESS-HEADWORD-POSITION"), makeSymbol("CHECK-GUESSED-HEADWORD-POSITION"), makeSymbol("ASK-HEADWORD-POSITION"), makeSymbol("CHECK-HEADWORD-POSITION"), makeSymbol("ASK-PART-OF-SPEECH"), makeSymbol("CHECK-PART-OF-SPEECH"), makeSymbol("SHOW-HEADWORD-VARIATIONS"), makeSymbol("CHECK-HEADWORD-VARIATIONS"), makeSymbol("END-INTERACTION") }))), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLList $list558 = list(new SubLObject[]{ makeSymbol("GUESS-HEADWORD-POSITION"), makeSymbol("CHECK-GUESSED-HEADWORD-POSITION"), makeSymbol("ASK-HEADWORD-POSITION"), makeSymbol("CHECK-HEADWORD-POSITION"), makeSymbol("ASK-PART-OF-SPEECH"), makeSymbol("CHECK-PART-OF-SPEECH"), makeSymbol("SHOW-HEADWORD-VARIATIONS"), makeSymbol("CHECK-HEADWORD-VARIATIONS"), makeSymbol("END-INTERACTION") });

    private static final SubLSymbol SME_LI_DENOTATIONAL_INITIALIZE_METHOD = makeSymbol("SME-LI-DENOTATIONAL-INITIALIZE-METHOD");

    private static final SubLSymbol GUESS_HEADWORD_POSITION = makeSymbol("GUESS-HEADWORD-POSITION");

    private static final SubLList $list561 = list(list(makeSymbol("CLET"), list(new SubLObject[]{ list(makeSymbol("TERM"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("PHRASE"), list(makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("PHRASE-WORDS"), list(makeSymbol("LEX-STRING-TOKENIZE"), makeSymbol("PHRASE"), NIL)), list(makeSymbol("TITLE"), makeString("Guessing the headword of the phrase")), list(makeSymbol("GUESSED-OFFSET"), list(makeSymbol("MOST-LIKELY-HEADWORD"), makeSymbol("PHRASE-WORDS"))), list(makeSymbol("GUESSED-HEADWORD"), list(makeSymbol("ELT"), makeSymbol("PHRASE-WORDS"), makeSymbol("GUESSED-OFFSET"))), list(makeSymbol("QUESTION"), list(makeSymbol("FORMAT"), NIL, makeString("Is ~s a type of ~s?"), makeSymbol("PHRASE"), makeSymbol("GUESSED-HEADWORD"))), list(makeSymbol("TIP"), makeSymbol("*HEADWORD-GUESSING-TIP*")), list(makeSymbol("SKIP?"), list(makeSymbol("="), list(makeSymbol("LENGTH"), makeSymbol("PHRASE-WORDS")), ONE_INTEGER)) }), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-HEADWORD-POSITION"), makeSymbol("LEXWIZ-PARAMETERS")), list(makeSymbol("1+"), makeSymbol("GUESSED-OFFSET"))), list(makeSymbol("CLET"), list(list(makeSymbol("HEADWORD-DENOTS"), list(makeSymbol("PHRASE-DENOTATIONS"), makeSymbol("SELF"), makeSymbol("GUESSED-HEADWORD")))), list(makeSymbol("WITH-ALL-MTS"), list(makeSymbol("PWHEN"), list(makeSymbol("INTERSECTION"), makeSymbol("HEADWORD-DENOTS"), list(makeSymbol("CONS"), makeSymbol("TERM"), list(makeSymbol("MIN-GENLS"), makeSymbol("TERM")))), list(makeSymbol("MUMBLE"), makeSymbol("SELF"), list(makeSymbol("FORMAT"), NIL, makeString("Since ~s is a type of ~s, assuming headword is latter"), makeSymbol("PHRASE"), makeSymbol("GUESSED-HEADWORD"))), list(makeSymbol("SET-ANSWER"), makeSymbol("SELF"), T), list(makeSymbol("CSETQ"), makeSymbol("SKIP?"), T)))), list(makeSymbol("PIF"), list(makeSymbol("CNOT"), makeSymbol("SKIP?")), list(makeSymbol("ASK-GENERIC-BOOLEAN"), makeSymbol("SELF"), makeSymbol("TITLE"), makeSymbol("QUESTION"), makeSymbol("TIP")), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF"))), list(makeSymbol("RET"), T)));

    private static final SubLSymbol $sym562$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-DENOTATIONAL-METHOD");

    private static final SubLString $str563$Guessing_the_headword_of_the_phra = makeString("Guessing the headword of the phrase");

    private static final SubLString $str564$Is__s_a_type_of__s_ = makeString("Is ~s a type of ~s?");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLString $str567$Since__s_is_a_type_of__s__assumin = makeString("Since ~s is a type of ~s, assuming headword is latter");

    private static final SubLSymbol SME_LI_DENOTATIONAL_GUESS_HEADWORD_POSITION_METHOD = makeSymbol("SME-LI-DENOTATIONAL-GUESS-HEADWORD-POSITION-METHOD");

    private static final SubLSymbol CHECK_GUESSED_HEADWORD_POSITION = makeSymbol("CHECK-GUESSED-HEADWORD-POSITION");

    private static final SubLList $list570 = list(list(makeSymbol("CLET"), list(list(makeSymbol("HEADWORD-OK?"), list(makeSymbol("GET-ANSWER"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("HEADWORD-OK?"), list(makeSymbol("CLET"), list(list(makeSymbol("PHRASE"), list(makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("PHRASE-WORDS"), list(makeSymbol("LEX-STRING-TOKENIZE"), makeSymbol("PHRASE"), NIL)), list(makeSymbol("REJECTED-POSITION"), list(makeSymbol("LEXWIZ-HEADWORD-POSITION"), makeSymbol("LEXWIZ-PARAMETERS")))), list(makeSymbol("PCOND"), list(list(makeSymbol("LENGTH>"), makeSymbol("PHRASE-WORDS"), TWO_INTEGER), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-HEADWORD-POSITION"), makeSymbol("LEXWIZ-PARAMETERS")), MINUS_ONE_INTEGER)), list(list(makeSymbol("LENGTH="), makeSymbol("PHRASE-WORDS"), TWO_INTEGER), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-HEADWORD-POSITION"), makeSymbol("LEXWIZ-PARAMETERS")), list(makeSymbol("-"), THREE_INTEGER, makeSymbol("REJECTED-POSITION"))))))), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")), list(makeSymbol("RET"), T)));

    private static final SubLSymbol SME_LI_DENOTATIONAL_CHECK_GUESSED_HEADWORD_POSITION_METHOD = makeSymbol("SME-LI-DENOTATIONAL-CHECK-GUESSED-HEADWORD-POSITION-METHOD");

    private static final SubLSymbol ASK_HEADWORD_POSITION = makeSymbol("ASK-HEADWORD-POSITION");

    private static final SubLList $list573 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PHRASE"), list(makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("TITLE"), makeString("Checking the qualified word of the phrase")), list(makeSymbol("QUESTION"), list(makeSymbol("FORMAT"), NIL, makeString("In ~s, which word is being qualified by the others?"), makeSymbol("PHRASE"))), list(makeSymbol("TIP"), makeSymbol("*HEADWORD-SELECTION-TIP*")), list(makeSymbol("PHRASE-WORDS"), list(makeSymbol("LEX-STRING-TOKENIZE"), makeSymbol("PHRASE"), NIL)), list(makeSymbol("OFFSETS"), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("TO-STRING")), list(makeSymbol("NUM-LIST"), list(makeSymbol("LENGTH"), makeSymbol("PHRASE-WORDS"))))), list(makeSymbol("DEFAULT-POSITION"), list(makeSymbol("LEXWIZ-HEADWORD-POSITION"), makeSymbol("LEXWIZ-PARAMETERS")))), list(makeSymbol("PIF"), list(makeSymbol("CAND"), list(makeSymbol(">"), list(makeSymbol("LENGTH"), makeSymbol("PHRASE-WORDS")), ONE_INTEGER), list(makeSymbol("<="), makeSymbol("DEFAULT-POSITION"), ZERO_INTEGER)), list(makeSymbol("ASK-GENERIC-ENUMERATED"), makeSymbol("SELF"), makeSymbol("TITLE"), makeSymbol("QUESTION"), makeSymbol("PHRASE-WORDS"), makeSymbol("TIP"), makeSymbol("OFFSETS")), list(makeSymbol("PROGN"), list(makeSymbol("SET-ANSWER"), makeSymbol("SELF"), list(makeSymbol("FIRST"), makeSymbol("OFFSETS"))), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")))), list(makeSymbol("RET"), T)));

    private static final SubLSymbol $sym574$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-DENOTATIONAL-METHOD");

    private static final SubLString $str575$Checking_the_qualified_word_of_th = makeString("Checking the qualified word of the phrase");

    private static final SubLString $str576$In__s__which_word_is_being_qualif = makeString("In ~s, which word is being qualified by the others?");



    private static final SubLSymbol SME_LI_DENOTATIONAL_ASK_HEADWORD_POSITION_METHOD = makeSymbol("SME-LI-DENOTATIONAL-ASK-HEADWORD-POSITION-METHOD");

    private static final SubLSymbol CHECK_HEADWORD_POSITION = makeSymbol("CHECK-HEADWORD-POSITION");

    public static final SubLList $list580 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PHRASE-WORDS"), list(makeSymbol("LEX-STRING-TOKENIZE"), list(makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-PARAMETERS")), NIL)), list(makeSymbol("ANSWER"), list(makeSymbol("GET-ANSWER"), makeSymbol("SELF"))), list(makeSymbol("HEADWORD-OFFSET"), list(makeSymbol("FIF"), list(makeSymbol("NON-EMPTY-STRING?"), makeSymbol("ANSWER")), list(makeSymbol("EXTRACT-INTEGER"), makeSymbol("ANSWER")), MINUS_ONE_INTEGER))), list(makeSymbol("PWHEN"), list(makeSymbol("<="), list(makeSymbol("LEXWIZ-HEADWORD-POSITION"), makeSymbol("LEXWIZ-PARAMETERS")), ZERO_INTEGER), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-HEADWORD-POSITION"), makeSymbol("LEXWIZ-PARAMETERS")), list(makeSymbol("1+"), makeSymbol("HEADWORD-OFFSET"))), list(makeSymbol("PUNLESS"), list(makeSymbol("CAND"), list(makeSymbol(">="), makeSymbol("HEADWORD-OFFSET"), ZERO_INTEGER), list(makeSymbol("<"), makeSymbol("HEADWORD-OFFSET"), list(makeSymbol("LENGTH"), makeSymbol("PHRASE-WORDS")))), list(makeSymbol("LEX-DEBUG-OUT"), makeString("invalid headword offset: ~a~%"), makeSymbol("HEADWORD-OFFSET")), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-ERROR-MESSAGE"), makeSymbol("LEXWIZ-PARAMETERS")), makeString("The headword position must be specified")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-STATES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("GET-STATES"))))), list(makeSymbol("CSETQ"), makeSymbol("NEW-STATES"), list(makeSymbol("APPEND"), list(makeSymbol("QUOTE"), list(makeSymbol("ASK-HEADWORD-POSITION"), makeSymbol("CHECK-HEADWORD-POSITION"))), makeSymbol("NEW-STATES"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("SET-STATES")), makeSymbol("NEW-STATES"))))), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")), list(makeSymbol("RET"), T)));

    private static final SubLString $str581$invalid_headword_offset___a__ = makeString("invalid headword offset: ~a~%");

    private static final SubLString $str582$The_headword_position_must_be_spe = makeString("The headword position must be specified");

    private static final SubLList $list583 = list(makeSymbol("ASK-HEADWORD-POSITION"), makeSymbol("CHECK-HEADWORD-POSITION"));

    private static final SubLSymbol SME_LI_DENOTATIONAL_CHECK_HEADWORD_POSITION_METHOD = makeSymbol("SME-LI-DENOTATIONAL-CHECK-HEADWORD-POSITION-METHOD");



    private static final SubLList $list586 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TERM"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("PHRASE-WORDS"), list(makeSymbol("LEX-STRING-TOKENIZE"), list(makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-PARAMETERS")), NIL)), list(makeSymbol("HEADWORD-POSITION"), list(makeSymbol("LEXWIZ-HEADWORD-POSITION"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("HEADWORD"), list(makeSymbol("ELT"), makeSymbol("PHRASE-WORDS"), list(makeSymbol("1-"), makeSymbol("HEADWORD-POSITION")))), list(makeSymbol("TITLE"), list(makeSymbol("FORMAT"), NIL, makeString("Determining how the word '~a' is used in ~s"), makeSymbol("HEADWORD"), list(makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-PARAMETERS")))), list(makeSymbol("TIP"), NIL), makeSymbol("DEFAULT")), list(makeSymbol("PWHEN"), list(makeSymbol("="), list(makeSymbol("LENGTH"), makeSymbol("PHRASE-WORDS")), ONE_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("TITLE"), list(makeSymbol("FORMAT"), NIL, makeString("Checking usage of '~a'"), makeSymbol("HEADWORD")))), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("CHOICES"), makeSymbol("PART-OF-SPEECH-VALUES")), list(makeSymbol("DERIVE-PART-OF-SPEECH-EXAMPLES"), makeSymbol("SELF"), makeSymbol("HEADWORD"), makeSymbol("PHRASE-WORDS"), makeSymbol("HEADWORD-POSITION"), makeSymbol("TERM")), list(makeSymbol("CLET"), list(list(makeSymbol("DEFAULT-POS"), list(makeSymbol("MOST-LIKELY-HEADWORD-PART-OF-SPEECH"), makeSymbol("HEADWORD"), makeSymbol("PART-OF-SPEECH-VALUES")))), list(makeSymbol("PWHEN"), makeSymbol("DEFAULT-POS"), list(makeSymbol("MUMBLE"), makeSymbol("SELF"), list(makeSymbol("FORMAT"), NIL, makeString("Pre-selecting ~a as part-of-speech for ~s since most common usage in lexicon"), list(makeSymbol("LEX-DESCRIBE-TERM"), makeSymbol("DEFAULT-POS")), makeSymbol("HEADWORD"))), list(makeSymbol("CSETQ"), makeSymbol("DEFAULT"), list(makeSymbol("POSITION"), makeSymbol("DEFAULT-POS"), makeSymbol("PART-OF-SPEECH-VALUES"))))), list(makeSymbol("ASK-GENERIC-ENUMERATED"), makeSymbol("SELF"), makeSymbol("TITLE"), makeString("Which of the following sounds best?"), makeSymbol("CHOICES"), makeSymbol("TIP"), makeSymbol("PART-OF-SPEECH-VALUES"), makeSymbol("DEFAULT"))), list(makeSymbol("RET"), T)));

    private static final SubLSymbol $sym587$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-DENOTATIONAL-METHOD");

    private static final SubLString $str588$Determining_how_the_word___a__is_ = makeString("Determining how the word '~a' is used in ~s");

    private static final SubLString $str589$Checking_usage_of___a_ = makeString("Checking usage of '~a'");

    private static final SubLString $str590$Pre_selecting__a_as_part_of_speec = makeString("Pre-selecting ~a as part-of-speech for ~s since most common usage in lexicon");

    private static final SubLString $str591$Which_of_the_following_sounds_bes = makeString("Which of the following sounds best?");

    private static final SubLSymbol SME_LI_DENOTATIONAL_ASK_PART_OF_SPEECH_METHOD = makeSymbol("SME-LI-DENOTATIONAL-ASK-PART-OF-SPEECH-METHOD");



    private static final SubLList $list594 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PART-OF-SPEECH"), list(makeSymbol("LEX-FORT-FOR-STRING"), list(makeSymbol("GET-ANSWER"), makeSymbol("SELF"))))), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-HEADWORD-PART-OF-SPEECH"), makeSymbol("LEXWIZ-PARAMETERS")), makeSymbol("PART-OF-SPEECH")), list(makeSymbol("PUNLESS"), makeSymbol("PART-OF-SPEECH"), list(makeSymbol("LEX-DEBUG-OUT"), makeString("invalid headword part-of-speech: ~a~%"), makeSymbol("PART-OF-SPEECH")), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-ERROR-MESSAGE"), makeSymbol("LEXWIZ-PARAMETERS")), makeString("The headword part-of-speech must be specified")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-STATES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("GET-STATES"))))), list(makeSymbol("CSETQ"), makeSymbol("NEW-STATES"), list(makeSymbol("APPEND"), list(makeSymbol("QUOTE"), list(makeSymbol("ASK-PART-OF-SPEECH"), makeSymbol("CHECK-PART-OF-SPEECH"))), makeSymbol("NEW-STATES"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("SET-STATES")), makeSymbol("NEW-STATES")))), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")), list(makeSymbol("RET"), T)));

    private static final SubLSymbol $sym595$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-DENOTATIONAL-METHOD");

    private static final SubLString $str596$invalid_headword_part_of_speech__ = makeString("invalid headword part-of-speech: ~a~%");

    private static final SubLString $str597$The_headword_part_of_speech_must_ = makeString("The headword part-of-speech must be specified");

    private static final SubLList $list598 = list(makeSymbol("ASK-PART-OF-SPEECH"), makeSymbol("CHECK-PART-OF-SPEECH"));

    private static final SubLSymbol SME_LI_DENOTATIONAL_CHECK_PART_OF_SPEECH_METHOD = makeSymbol("SME-LI-DENOTATIONAL-CHECK-PART-OF-SPEECH-METHOD");

    private static final SubLSymbol SHOW_HEADWORD_VARIATIONS = makeSymbol("SHOW-HEADWORD-VARIATIONS");

    private static final SubLList $list601 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PHRASE"), list(makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("TERM"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("TERM-DESC"), list(makeSymbol("DESCRIBE-TERM"), makeSymbol("SELF"), makeSymbol("TERM"))), list(makeSymbol("MAPPING-MT"), list(makeSymbol("DETERMINE-LEXICAL-MAPPING-MT"), list(makeSymbol("LEXWIZ-MT"), makeSymbol("LEXWIZ-PARAMETERS")))), list(makeSymbol("PHRASE-WORDS"), list(makeSymbol("LEX-STRING-TOKENIZE"), makeSymbol("PHRASE"), NIL)), list(makeSymbol("HEADWORD-POSITION"), list(makeSymbol("LEXWIZ-HEADWORD-POSITION"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("HEADWORD"), list(makeSymbol("ELT"), makeSymbol("PHRASE-WORDS"), list(makeSymbol("1-"), makeSymbol("HEADWORD-POSITION")))), list(makeSymbol("PART-OF-SPEECH"), list(makeSymbol("LEXWIZ-HEADWORD-PART-OF-SPEECH"), makeSymbol("LEXWIZ-PARAMETERS")))), list(makeSymbol("CSETF"), list(makeSymbol("SME-LEXWIZ-NEW-MAPPING?"), makeSymbol("LEXWIZ-SETTINGS")), list(makeSymbol("CNOT"), list(makeSymbol("WORDS-OF-STRING&SPEECH-PART"), makeSymbol("HEADWORD"), makeSymbol("PART-OF-SPEECH"), NIL, makeSymbol("MAPPING-MT")))), list(makeSymbol("ADD-LEXICAL-MAPPING"), makeSymbol("SELF"), makeSymbol("HEADWORD"), makeSymbol("PART-OF-SPEECH"), makeSymbol("MAPPING-MT")), list(makeSymbol("CLET"), list(list(makeSymbol("VARIANTS"), list(makeSymbol("DERIVE-PART-OF-SPEECH-VARIATIONS"), makeSymbol("PHRASE"), makeSymbol("HEADWORD-POSITION"), makeSymbol("PART-OF-SPEECH"), makeSymbol("MAPPING-MT"))), list(makeSymbol("TITLE"), list(makeSymbol("FORMAT"), NIL, makeString("Checking variant phrases due to variations of headword '~a'"), makeSymbol("HEADWORD"))), list(makeSymbol("QUESTION"), list(makeSymbol("FORMAT"), NIL, makeString("Are the following good ways to refer to '~a'?~a~a"), makeSymbol("TERM-DESC"), makeSymbol("*NEWLINE-TAB*"), list(makeSymbol("JOIN-STRINGS"), makeSymbol("VARIANTS"), makeSymbol("*NEWLINE-TAB*")))), list(makeSymbol("TIP"), makeString("The main thing to check for is odd looking phrases, such as \"loadings a weapon\" as a variation of \"loading a weapon\". Note that there might not be variations. This may or may not be a problem, depending on the part of speech selected. For example, mass nouns like \"sand\" won\'t have variations."))), list(makeSymbol("PUNLESS"), makeSymbol("VARIANTS"), list(makeSymbol("CSETQ"), makeSymbol("QUESTION"), list(makeSymbol("FORMAT"), NIL, makeString("There are no variations for the phrase ~s. This should only occur with headwords that are mass nouns.~%~%Is that OK?"), makeSymbol("PHRASE")))), list(makeSymbol("PIF"), list(makeSymbol("FORGE-AHEAD?"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("MESSAGE"), list(makeSymbol("FORMAT"), NIL, makeString("Assuming that the following variations of ~s are OK: ~a"), makeSymbol("PHRASE"), list(makeSymbol("FIF"), makeSymbol("VARIANTS"), list(makeSymbol("JOIN-STRINGS"), makeSymbol("VARIANTS")), makeString("n/a"))))), list(makeSymbol("MUMBLE"), makeSymbol("SELF"), makeSymbol("MESSAGE")), list(makeSymbol("SET-ANSWER"), makeSymbol("SELF"), T), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF"))), list(makeSymbol("ASK-GENERIC-BOOLEAN"), makeSymbol("SELF"), makeSymbol("TITLE"), makeSymbol("QUESTION"), makeSymbol("TIP")))), list(makeSymbol("RET"), T)));

    private static final SubLSymbol $sym602$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-DENOTATIONAL-METHOD");

    private static final SubLString $str603$Checking_variant_phrases_due_to_v = makeString("Checking variant phrases due to variations of headword '~a'");

    private static final SubLString $str604$Are_the_following_good_ways_to_re = makeString("Are the following good ways to refer to '~a'?~a~a");

    private static final SubLString $str605$The_main_thing_to_check_for_is_od = makeString("The main thing to check for is odd looking phrases, such as \"loadings a weapon\" as a variation of \"loading a weapon\". Note that there might not be variations. This may or may not be a problem, depending on the part of speech selected. For example, mass nouns like \"sand\" won\'t have variations.");

    private static final SubLString $str606$There_are_no_variations_for_the_p = makeString("There are no variations for the phrase ~s. This should only occur with headwords that are mass nouns.~%~%Is that OK?");

    private static final SubLString $str607$Assuming_that_the_following_varia = makeString("Assuming that the following variations of ~s are OK: ~a");

    private static final SubLSymbol SME_LI_DENOTATIONAL_SHOW_HEADWORD_VARIATIONS_METHOD = makeSymbol("SME-LI-DENOTATIONAL-SHOW-HEADWORD-VARIATIONS-METHOD");

    private static final SubLSymbol CHECK_HEADWORD_VARIATIONS = makeSymbol("CHECK-HEADWORD-VARIATIONS");

    public static final SubLList $list610 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PHRASE-WORDS"), list(makeSymbol("LEX-STRING-TOKENIZE"), list(makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-PARAMETERS")), NIL)), list(makeSymbol("MAPPING-MT"), list(makeSymbol("DETERMINE-LEXICAL-MAPPING-MT"), list(makeSymbol("LEXWIZ-MT"), makeSymbol("LEXWIZ-PARAMETERS")))), list(makeSymbol("HEADWORD-POSITION"), list(makeSymbol("LEXWIZ-HEADWORD-POSITION"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("HEADWORD"), list(makeSymbol("ELT"), makeSymbol("PHRASE-WORDS"), list(makeSymbol("1-"), makeSymbol("HEADWORD-POSITION")))), list(makeSymbol("PART-OF-SPEECH"), list(makeSymbol("LEXWIZ-HEADWORD-PART-OF-SPEECH"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("OK?"), list(makeSymbol("GET-ANSWER"), makeSymbol("SELF")))), list(makeSymbol("PUNLESS"), makeSymbol("OK?"), list(makeSymbol("PWHEN"), list(makeSymbol("SME-LEXWIZ-NEW-MAPPING?"), makeSymbol("LEXWIZ-SETTINGS")), list(makeSymbol("REMOVE-LEXICAL-MAPPING"), makeSymbol("SELF"), makeSymbol("HEADWORD"), makeSymbol("PART-OF-SPEECH"), makeSymbol("MAPPING-MT"))), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-STATES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("GET-STATES"))))), list(makeSymbol("CSETQ"), makeSymbol("NEW-STATES"), list(makeSymbol("APPEND"), list(makeSymbol("QUOTE"), list(makeSymbol("ASK-PART-OF-SPEECH"), makeSymbol("CHECK-PART-OF-SPEECH"), makeSymbol("SHOW-HEADWORD-VARIATIONS"), makeSymbol("CHECK-HEADWORD-VARIATIONS"))), makeSymbol("NEW-STATES"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("SET-STATES")), makeSymbol("NEW-STATES")))), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")), list(makeSymbol("RET"), T)));

    private static final SubLList $list611 = list(makeSymbol("ASK-PART-OF-SPEECH"), makeSymbol("CHECK-PART-OF-SPEECH"), makeSymbol("SHOW-HEADWORD-VARIATIONS"), makeSymbol("CHECK-HEADWORD-VARIATIONS"));

    private static final SubLSymbol SME_LI_DENOTATIONAL_CHECK_HEADWORD_VARIATIONS_METHOD = makeSymbol("SME-LI-DENOTATIONAL-CHECK-HEADWORD-VARIATIONS-METHOD");

    private static final SubLSymbol ADD_LEXICAL_MAPPING = makeSymbol("ADD-LEXICAL-MAPPING");

    private static final SubLList $list614 = list(makeSymbol("WORDFORM"), makeSymbol("PART-OF-SPEECH"), makeSymbol("&OPTIONAL"), list(makeSymbol("MT"), reader_make_constant_shell(makeString("EnglishMt"))), list(makeSymbol("WORD-TYPE"), reader_make_constant_shell(makeString("EnglishWord"))));

    private static final SubLList $list615 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("WORDS-OF-STRING&SPEECH-PART"), makeSymbol("WORDFORM"), makeSymbol("PART-OF-SPEECH"), NIL, makeSymbol("MT")), list(makeSymbol("RET"), list(makeSymbol("DO-LEXICAL-MAPPING"), makeSymbol("SELF"), makeSymbol("WORDFORM"), makeSymbol("PART-OF-SPEECH"), makeSymbol("MT"), makeSymbol("WORD-TYPE"), T))));

    private static final SubLObject $$EnglishMt = reader_make_constant_shell(makeString("EnglishMt"));

    private static final SubLObject $$EnglishWord = reader_make_constant_shell(makeString("EnglishWord"));

    private static final SubLSymbol SME_LI_DENOTATIONAL_ADD_LEXICAL_MAPPING_METHOD = makeSymbol("SME-LI-DENOTATIONAL-ADD-LEXICAL-MAPPING-METHOD");

    private static final SubLSymbol REMOVE_LEXICAL_MAPPING = makeSymbol("REMOVE-LEXICAL-MAPPING");

    public static final SubLList $list620 = list(list(makeSymbol("RET"), list(makeSymbol("DO-LEXICAL-MAPPING"), makeSymbol("SELF"), makeSymbol("WORDFORM"), makeSymbol("PART-OF-SPEECH"), makeSymbol("MT"), makeSymbol("WORD-TYPE"), NIL)));

    private static final SubLSymbol SME_LI_DENOTATIONAL_REMOVE_LEXICAL_MAPPING_METHOD = makeSymbol("SME-LI-DENOTATIONAL-REMOVE-LEXICAL-MAPPING-METHOD");

    private static final SubLSymbol DO_LEXICAL_MAPPING = makeSymbol("DO-LEXICAL-MAPPING");

    private static final SubLList $list623 = list(makeSymbol("WORDFORM"), makeSymbol("PART-OF-SPEECH"), makeSymbol("MT"), makeSymbol("WORD-TYPE"), makeSymbol("ADD?"));

    private static final SubLList $list624 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CREATE-CONSTANT-FN"), list(makeSymbol("RESOLVE-METHOD"), list(makeSymbol("QUOTE"), makeSymbol("CREATE-CONSTANT")), list(makeSymbol("CLASS-NAME-FROM-OBJECT"), makeSymbol("PROXY"))))), list(makeSymbol("RET"), list(makeSymbol("DO-LEXICAL-MAPPING-INT"), makeSymbol("WORDFORM"), makeSymbol("PART-OF-SPEECH"), makeSymbol("MT"), makeSymbol("WORD-TYPE"), makeSymbol("ADD?"), makeSymbol("CREATE-CONSTANT-FN"), makeSymbol("PROXY")))));

    private static final SubLSymbol SME_LI_DENOTATIONAL_DO_LEXICAL_MAPPING_METHOD = makeSymbol("SME-LI-DENOTATIONAL-DO-LEXICAL-MAPPING-METHOD");

    private static final SubLSymbol DERIVE_PART_OF_SPEECH_EXAMPLES = makeSymbol("DERIVE-PART-OF-SPEECH-EXAMPLES");

    private static final SubLList $list627 = list(makeSymbol("HEADWORD"), makeSymbol("PHRASE-WORDS"), makeSymbol("HEADWORD-POSITION"), makeSymbol("TERM"));

    private static final SubLList $list628 = list(list(makeSymbol("CLET"), list(list(makeSymbol("EXAMPLES"), NIL), list(makeSymbol("CANDIDATES"), makeSymbol("*SME-PARTS-OF-SPEECH*")), list(makeSymbol("PARTS-OF-SPEECH"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("PART-OF-SPEECH"), makeSymbol("CANDIDATES")), list(makeSymbol("CLET"), list(list(makeSymbol("HEADWORD-POSITION-ZERO-INDEX"), list(makeSymbol("1-"), makeSymbol("HEADWORD-POSITION"))), list(makeSymbol("EXAMPLE"), list(makeSymbol("DERIVE-PART-OF-SPEECH-EXAMPLE"), makeSymbol("SELF"), makeSymbol("HEADWORD"), makeSymbol("PHRASE-WORDS"), makeSymbol("HEADWORD-POSITION-ZERO-INDEX"), makeSymbol("PART-OF-SPEECH"), makeSymbol("TERM")))), list(makeSymbol("PWHEN"), makeSymbol("EXAMPLE"), list(makeSymbol("CPUSH"), makeSymbol("EXAMPLE"), makeSymbol("EXAMPLES")), list(makeSymbol("CPUSH"), makeSymbol("PART-OF-SPEECH"), makeSymbol("PARTS-OF-SPEECH"))))), list(makeSymbol("RET"), list(makeSymbol("VALUES"), list(makeSymbol("REVERSE"), makeSymbol("EXAMPLES")), list(makeSymbol("REVERSE"), makeSymbol("PARTS-OF-SPEECH"))))));

    private static final SubLSymbol SME_LI_DENOTATIONAL_DERIVE_PART_OF_SPEECH_EXAMPLES_METHOD = makeSymbol("SME-LI-DENOTATIONAL-DERIVE-PART-OF-SPEECH-EXAMPLES-METHOD");

    private static final SubLSymbol DERIVE_PART_OF_SPEECH_EXAMPLE = makeSymbol("DERIVE-PART-OF-SPEECH-EXAMPLE");

    private static final SubLList $list631 = list(makeSymbol("WORD"), makeSymbol("PHRASE-WORDS"), makeSymbol("HEADWORD-POSITION"), makeSymbol("PART-OF-SPEECH"), makeSymbol("&OPTIONAL"), list(makeSymbol("TERM"), reader_make_constant_shell(makeString("Thing"))));

    private static final SubLList $list632 = list(list(makeSymbol("CLET"), list(new SubLObject[]{ list(makeSymbol("PHRASE"), list(makeSymbol("BUNGE"), makeSymbol("PHRASE-WORDS"))), list(makeSymbol("MT"), list(makeSymbol("LEXWIZ-MT"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("SINGULAR-WORD"), list(makeSymbol("SINGULARIZE-WORD"), makeSymbol("WORD"), makeSymbol("MT"))), list(makeSymbol("SINGULAR-PHRASE"), list(makeSymbol("BUNGE"), list(makeSymbol("REPLACE-NTH"), makeSymbol("HEADWORD-POSITION"), makeSymbol("SINGULAR-WORD"), makeSymbol("PHRASE-WORDS")))), list(makeSymbol("LOWERCASE-WORD"), list(makeSymbol("STRING-DOWNCASE"), makeSymbol("WORD"))), list(makeSymbol("LOWERCASE-PHRASE"), list(makeSymbol("BUNGE"), list(makeSymbol("REPLACE-NTH"), makeSymbol("HEADWORD-POSITION"), makeSymbol("LOWERCASE-WORD"), makeSymbol("PHRASE-WORDS")))), list(makeSymbol("PLURAL-WORD"), list(makeSymbol("PLURALIZE-WORD"), makeSymbol("SINGULAR-WORD"), makeSymbol("MT"))), list(makeSymbol("PLURAL-PHRASE"), list(makeSymbol("BUNGE"), list(makeSymbol("REPLACE-NTH"), makeSymbol("HEADWORD-POSITION"), makeSymbol("PLURAL-WORD"), makeSymbol("PHRASE-WORDS")))), list(makeSymbol("INFINITIVE-WORD"), list(makeSymbol("FWHEN"), list(makeSymbol("COR"), list(makeSymbol("GENL-POS?"), makeSymbol("PART-OF-SPEECH"), reader_make_constant_shell(makeString("Verb"))), list(makeSymbol("GENL-POS?"), makeSymbol("PART-OF-SPEECH"), reader_make_constant_shell(makeString("DeVerbalNoun")))), list(makeSymbol("SME-LI-INFLECTED-VERB-TO-INFINITIVE"), makeSymbol("WORD")))), list(makeSymbol("INFINITIVE-PHRASE"), list(makeSymbol("BUNGE"), list(makeSymbol("REPLACE-NTH"), makeSymbol("HEADWORD-POSITION"), makeSymbol("INFINITIVE-WORD"), makeSymbol("PHRASE-WORDS")))), list(makeSymbol("A-DET"), list(makeSymbol("FIRST"), list(makeSymbol("ADD-DETERMINER"), makeSymbol("SINGULAR-PHRASE")))) }), list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), makeSymbol("A-DET")), list(makeSymbol("CSETQ"), makeSymbol("A-DET"), makeString("a"))), list(makeSymbol("PWHEN"), list(makeSymbol("DISABLE-SPEECH-PART-SELECTION"), makeSymbol("SELF"), makeSymbol("WORD"), makeSymbol("PART-OF-SPEECH"), makeSymbol("TERM")), list(makeSymbol("RET"), NIL)), list(new SubLObject[]{ makeSymbol("PCASE"), makeSymbol("PART-OF-SPEECH"), list(reader_make_constant_shell(makeString("CountNoun")), list(makeSymbol("RET"), list(makeSymbol("FORMAT"), NIL, makeString("many ~a; ~a ~a: countable noun like 'book'"), makeSymbol("PLURAL-PHRASE"), makeSymbol("A-DET"), makeSymbol("SINGULAR-PHRASE")))), list(reader_make_constant_shell(makeString("MassNoun")), list(makeSymbol("RET"), list(makeSymbol("FORMAT"), NIL, makeString("much ~a; some ~a: uncountable noun like 'sand'"), makeSymbol("LOWERCASE-PHRASE"), makeSymbol("LOWERCASE-PHRASE")))), list(reader_make_constant_shell(makeString("AgentiveNoun")), list(makeSymbol("RET"), list(makeSymbol("FORMAT"), NIL, makeString("~a ~a is able to ~a: agentive noun like 'farmer'"), makeSymbol("A-DET"), makeSymbol("SINGULAR-PHRASE"), makeSymbol("INFINITIVE-WORD")))), list(reader_make_constant_shell(makeString("GerundiveNoun")), list(makeSymbol("RET"), list(makeSymbol("FORMAT"), NIL, makeString("~a involves ability to ~a: gerundive noun (verbal -ing form)"), makeSymbol("SINGULAR-PHRASE"), makeSymbol("INFINITIVE-PHRASE")))), list(reader_make_constant_shell(makeString("ProperCountNoun")), list(makeSymbol("RET"), list(makeSymbol("FORMAT"), NIL, makeString("proper name for countable objects (e.g., Corvettes, Koreans)")))), list(reader_make_constant_shell(makeString("ProperMassNoun")), list(makeSymbol("RET"), list(makeSymbol("FORMAT"), NIL, makeString("proper name for substance-like objects or concepts (e.g., Gruyere, Taoism)")))), list(reader_make_constant_shell(makeString("Verb")), list(makeSymbol("RET"), list(makeSymbol("FORMAT"), NIL, makeString("to ~a; ~a unexpectedly: verb like 'cry'"), makeSymbol("INFINITIVE-PHRASE"), makeSymbol("PHRASE")))), list(reader_make_constant_shell(makeString("Adjective")), list(makeSymbol("RET"), list(makeSymbol("FORMAT"), NIL, makeString("very ~a; most ~a: adjective like 'pretty'"), makeSymbol("PHRASE"), makeSymbol("PHRASE")))), list(reader_make_constant_shell(makeString("Adverb")), list(makeSymbol("RET"), list(makeSymbol("FORMAT"), NIL, makeString("so ~a; as ~a as ...: adverb like 'surely'"), makeSymbol("PHRASE"), makeSymbol("PHRASE")))), list(makeSymbol("OTHERWISE"), list(makeSymbol("LEX-WARN"), makeString("Unable to derive example for part-of-speech ~a~%"), makeSymbol("PART-OF-SPEECH"))) })), list(makeSymbol("RET"), NIL));

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLSymbol $sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-DENOTATIONAL-METHOD");

    private static final SubLObject $$Verb = reader_make_constant_shell(makeString("Verb"));

    private static final SubLObject $$DeVerbalNoun = reader_make_constant_shell(makeString("DeVerbalNoun"));

    private static final SubLString $$$a = makeString("a");

    private static final SubLObject $$CountNoun = reader_make_constant_shell(makeString("CountNoun"));

    private static final SubLString $str639$many__a___a__a__countable_noun_li = makeString("many ~a; ~a ~a: countable noun like 'book'");

    private static final SubLObject $$MassNoun = reader_make_constant_shell(makeString("MassNoun"));

    private static final SubLString $str641$much__a__some__a__uncountable_nou = makeString("much ~a; some ~a: uncountable noun like 'sand'");

    private static final SubLObject $$AgentiveNoun = reader_make_constant_shell(makeString("AgentiveNoun"));

    private static final SubLString $str643$_a__a_is_able_to__a__agentive_nou = makeString("~a ~a is able to ~a: agentive noun like 'farmer'");

    private static final SubLObject $$GerundiveNoun = reader_make_constant_shell(makeString("GerundiveNoun"));

    private static final SubLString $str645$_a_involves_ability_to__a__gerund = makeString("~a involves ability to ~a: gerundive noun (verbal -ing form)");

    private static final SubLObject $$ProperCountNoun = reader_make_constant_shell(makeString("ProperCountNoun"));

    private static final SubLString $str647$proper_name_for_countable_objects = makeString("proper name for countable objects (e.g., Corvettes, Koreans)");

    private static final SubLObject $$ProperMassNoun = reader_make_constant_shell(makeString("ProperMassNoun"));

    private static final SubLString $str649$proper_name_for_substance_like_ob = makeString("proper name for substance-like objects or concepts (e.g., Gruyere, Taoism)");

    private static final SubLString $str650$to__a___a_unexpectedly__verb_like = makeString("to ~a; ~a unexpectedly: verb like 'cry'");

    private static final SubLObject $$Adjective = reader_make_constant_shell(makeString("Adjective"));

    private static final SubLString $str652$very__a__most__a__adjective_like_ = makeString("very ~a; most ~a: adjective like 'pretty'");

    private static final SubLObject $$Adverb = reader_make_constant_shell(makeString("Adverb"));

    private static final SubLString $str654$so__a__as__a_as______adverb_like_ = makeString("so ~a; as ~a as ...: adverb like 'surely'");

    private static final SubLString $str655$Unable_to_derive_example_for_part = makeString("Unable to derive example for part-of-speech ~a~%");

    private static final SubLSymbol SME_LI_DENOTATIONAL_DERIVE_PART_OF_SPEECH_EXAMPLE_METHOD = makeSymbol("SME-LI-DENOTATIONAL-DERIVE-PART-OF-SPEECH-EXAMPLE-METHOD");

    private static final SubLObject $$infinitive = reader_make_constant_shell(makeString("infinitive"));

    private static final SubLSymbol DISABLE_SPEECH_PART_SELECTION = makeSymbol("DISABLE-SPEECH-PART-SELECTION");

    private static final SubLList $list659 = list(makeSymbol("WORD"), makeSymbol("PART-OF-SPEECH"), makeSymbol("&OPTIONAL"), list(makeSymbol("TERM"), reader_make_constant_shell(makeString("Thing"))));

    public static final SubLList $list660 = list(list(makeSymbol("CLET"), list(list(makeSymbol("SINGULAR-WORD"), list(makeSymbol("SINGULARIZE-WORD"), makeSymbol("WORD"))), list(makeSymbol("TERM-DESC"), list(makeSymbol("LEX-DESCRIBE-TERM"), makeSymbol("TERM"))), makeSymbol("DISABLE?")), list(new SubLObject[]{ makeSymbol("PCASE"), makeSymbol("PART-OF-SPEECH"), list(reader_make_constant_shell(makeString("Adjective")), list(makeSymbol("CLET"), list(list(makeSymbol("TERM-IS-ATTRIBUTE?"), NIL), list(makeSymbol("REASON"), makeString("adjectival suffix"))), list(makeSymbol("PUNLESS"), list(makeSymbol("LIKELY-ADJECTIVE?"), makeSymbol("WORD")), list(makeSymbol("CSETQ"), makeSymbol("DISABLE?"), list(makeSymbol("CNOT"), makeSymbol("TERM-IS-ATTRIBUTE?")))), list(makeSymbol("PUNLESS"), makeSymbol("DISABLE?"), list(makeSymbol("MUMBLE"), makeSymbol("SELF"), list(makeSymbol("FORMAT"), NIL, makeString("Enabling adjective for ~s since ~a"), makeSymbol("WORD"), makeSymbol("REASON")))))), list(reader_make_constant_shell(makeString("Adverb")), list(makeSymbol("PUNLESS"), list(makeSymbol("LIKELY-ADVERB?"), makeSymbol("WORD")), list(makeSymbol("CSETQ"), makeSymbol("DISABLE?"), T))), list(reader_make_constant_shell(makeString("AgentiveNoun")), list(makeSymbol("PUNLESS"), list(makeSymbol("LIKELY-HAS-PART-OF-SPEECH?"), reader_make_constant_shell(makeString("AgentiveNoun")), makeSymbol("SINGULAR-WORD")), list(makeSymbol("CSETQ"), makeSymbol("DISABLE?"), T))), list(reader_make_constant_shell(makeString("GerundiveNoun")), list(makeSymbol("PUNLESS"), list(makeSymbol("LIKELY-HAS-PART-OF-SPEECH?"), reader_make_constant_shell(makeString("GerundiveNoun")), makeSymbol("SINGULAR-WORD")), list(makeSymbol("CSETQ"), makeSymbol("DISABLE?"), T))), list(list(reader_make_constant_shell(makeString("ProperCountNoun")), reader_make_constant_shell(makeString("ProperMassNoun"))), list(makeSymbol("CSETQ"), makeSymbol("DISABLE?"), list(makeSymbol("LOWER-CASE-STRING-P"), makeSymbol("WORD")))), list(reader_make_constant_shell(makeString("CountNoun")), list(makeSymbol("CLET"), list(list(makeSymbol("WORD-UNITS"), list(makeSymbol("WORDS-OF-STRING&SPEECH-PART"), makeSymbol("WORD"), reader_make_constant_shell(makeString("CountNoun"))))), list(makeSymbol("CSOME"), list(makeSymbol("SPEECH-PART"), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("AgentiveNoun")), reader_make_constant_shell(makeString("GerundiveNoun")))), makeSymbol("DISABLE?")), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("MEMBER?"), makeSymbol("SPEECH-PART"), list(makeSymbol("POS-OF-STRING"), makeSymbol("WORD"))), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("WORD-UNITS")), list(makeSymbol("INTERSECTION"), makeSymbol("WORD-UNITS"), list(makeSymbol("WORDS-OF-STRING&SPEECH-PART"), makeSymbol("WORD"), makeSymbol("SPEECH-PART"))))), list(makeSymbol("MUMBLE"), makeSymbol("SELF"), list(makeSymbol("FORMAT"), NIL, makeString("Disabling simple noun for ~s since better as ~a"), makeSymbol("WORD"), list(makeSymbol("LEX-DESCRIBE-TERM"), makeSymbol("SPEECH-PART")))), list(makeSymbol("CSETQ"), makeSymbol("DISABLE?"), T))))), list(reader_make_constant_shell(makeString("MassNoun"))), list(reader_make_constant_shell(makeString("Verb")), list(makeSymbol("PCOND"), list(list(makeSymbol("LIKELY-VERB?"), makeSymbol("SINGULAR-WORD")), list(makeSymbol("MUMBLE"), makeSymbol("SELF"), list(makeSymbol("FORMAT"), NIL, makeString("Enabling verb for ~s since it is a likely verb"), makeSymbol("WORD")))), list(list(makeSymbol("GENL-IN-ANY-MT?"), makeSymbol("TERM"), reader_make_constant_shell(makeString("Event"))), list(makeSymbol("MUMBLE"), makeSymbol("SELF"), list(makeSymbol("FORMAT"), NIL, makeString("Enabling verb for ~s since '~a' is a type of event"), makeSymbol("WORD"), makeSymbol("TERM-DESC")))), list(T, list(makeSymbol("CSETQ"), makeSymbol("DISABLE?"), T)))), list(makeSymbol("OTHERWISE"), list(makeSymbol("LEX-WARN"), makeString("Unexpected part of speech [during disable check]: ~s~%"), makeSymbol("PART-OF-SPEECH"))) }), list(makeSymbol("RET"), makeSymbol("DISABLE?"))));

    private static final SubLString $$$adjectival_suffix = makeString("adjectival suffix");

    private static final SubLString $str662$Enabling_adjective_for__s_since__ = makeString("Enabling adjective for ~s since ~a");

    private static final SubLString $str663$Disabling_simple_noun_for__s_sinc = makeString("Disabling simple noun for ~s since better as ~a");

    public static final SubLList $list664 = list(reader_make_constant_shell(makeString("AgentiveNoun")), reader_make_constant_shell(makeString("GerundiveNoun")));

    private static final SubLString $str665$Enabling_verb_for__s_since_it_is_ = makeString("Enabling verb for ~s since it is a likely verb");

    private static final SubLObject $$Event = reader_make_constant_shell(makeString("Event"));

    private static final SubLString $str667$Enabling_verb_for__s_since___a__i = makeString("Enabling verb for ~s since '~a' is a type of event");

    private static final SubLString $str668$Unexpected_part_of_speech__during = makeString("Unexpected part of speech [during disable check]: ~s~%");

    private static final SubLSymbol SME_LI_DENOTATIONAL_DISABLE_SPEECH_PART_SELECTION_METHOD = makeSymbol("SME-LI-DENOTATIONAL-DISABLE-SPEECH-PART-SELECTION-METHOD");

    private static final SubLSymbol SME_LI_RELATIONAL_INITIALIZE_METHOD = makeSymbol("SME-LI-RELATIONAL-INITIALIZE-METHOD");

    private static final SubLList $list671 = list(makeSymbol("SESSION-PARAMETERS"), makeSymbol("CALLBACK-FN"), makeSymbol("CALLBACKUP-DATA"), makeSymbol("NEW-PROXY"), makeSymbol("QUESTION-ANSWERING-AGENT-CLASS"));

    private static final SubLList $list672 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TERM"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("SESSION-PARAMETERS"))), list(makeSymbol("NUM-ARGS"), list(makeSymbol("LEX-ARITY-IN-ANY-MT"), makeSymbol("TERM"))), list(makeSymbol("INITIAL-STATES"), list(makeSymbol("QUOTE"), list(makeSymbol("ASK-SAMPLE-SENTENCE"), makeSymbol("CHECK-SAMPLE-SENTENCE")))), list(makeSymbol("ARG-STATES"), list(makeSymbol("QUOTE"), list(makeSymbol("ASK-ARGUMENT-VALUES"), makeSymbol("CHECK-ARGUMENT-VALUES"), makeSymbol("ASK-ARGUMENT-PART-OF-SPEECH"), makeSymbol("CHECK-ARGUMENT-PART-OF-SPEECH")))), list(makeSymbol("FINAL-STATES"), list(makeSymbol("QUOTE"), list(makeSymbol("END-INTERACTION")))), list(makeSymbol("STATE-SEQUENCE"), list(makeSymbol("COPY-LIST"), makeSymbol("INITIAL-STATES")))), list(makeSymbol("PWHEN"), list(EQUAL, list(makeSymbol("LEXWIZ-LEXICAL-MT"), makeSymbol("SESSION-PARAMETERS")), makeSymbol("*DEFAULT-LEXIFICATION-MT*")), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-LEXICAL-MT"), makeSymbol("SESSION-PARAMETERS")), list(makeSymbol("FORT-FOR-STRING"), makeSymbol("*DEFAULT-PREDICATE-LEXIFICATION-MT*")))), list(makeSymbol("LEX-DEBUG-OUT"), makeString("initial state-sequence=~s~%"), makeSymbol("STATE-SEQUENCE")), list(makeSymbol("CDOTIMES"), list(makeSymbol("I"), makeSymbol("NUM-ARGS")), list(makeSymbol("NCONC"), makeSymbol("STATE-SEQUENCE"), list(makeSymbol("COPY-LIST"), makeSymbol("ARG-STATES")))), list(makeSymbol("NCONC"), makeSymbol("STATE-SEQUENCE"), list(makeSymbol("COPY-LIST"), makeSymbol("FINAL-STATES"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("SET-STATES")), makeSymbol("STATE-SEQUENCE")), list(makeSymbol("LEX-DEBUG-OUT"), makeString("sme-li-relational next-states: ~a~%"), makeSymbol("STATE-SEQUENCE"))), list(makeSymbol("INITIATE-INTERACTION"), makeSymbol("SUPER"), makeSymbol("SESSION-PARAMETERS"), makeSymbol("CALLBACK-FN"), makeSymbol("CALLBACKUP-DATA"), makeSymbol("NEW-PROXY"), makeSymbol("QUESTION-ANSWERING-AGENT-CLASS")), list(makeSymbol("RET"), NIL));

    public static final SubLList $list673 = list(makeSymbol("ASK-SAMPLE-SENTENCE"), makeSymbol("CHECK-SAMPLE-SENTENCE"));

    private static final SubLList $list674 = list(makeSymbol("ASK-ARGUMENT-VALUES"), makeSymbol("CHECK-ARGUMENT-VALUES"), makeSymbol("ASK-ARGUMENT-PART-OF-SPEECH"), makeSymbol("CHECK-ARGUMENT-PART-OF-SPEECH"));

    private static final SubLList $list675 = list(makeSymbol("END-INTERACTION"));

    private static final SubLString $str676$initial_state_sequence__s__ = makeString("initial state-sequence=~s~%");

    private static final SubLString $str677$sme_li_relational_next_states___a = makeString("sme-li-relational next-states: ~a~%");

    private static final SubLSymbol SME_LI_RELATIONAL_INITIATE_INTERACTION_METHOD = makeSymbol("SME-LI-RELATIONAL-INITIATE-INTERACTION-METHOD");

    private static final SubLSymbol ASK_SAMPLE_SENTENCE = makeSymbol("ASK-SAMPLE-SENTENCE");

    private static final SubLList $list680 = list(list(makeSymbol("CLET"), list(new SubLObject[]{ list(makeSymbol("PHRASE"), list(makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("TERM"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("TERM-DESC"), list(makeSymbol("DESCRIBE-TERM"), makeSymbol("SELF"), makeSymbol("TERM"))), list(makeSymbol("TITLE"), makeString("Determining relation template")), list(makeSymbol("PHRASE-TYPE"), list(makeSymbol("FIF"), list(makeSymbol("IS-FUNCTIONAL?"), makeSymbol("TERM")), makeString("phrase"), makeString("sentence"))), list(makeSymbol("QUESTION"), list(makeSymbol("FORMAT"), NIL, makeString("Enter a ~a illustrating the '~a' relation:"), makeSymbol("PHRASE-TYPE"), makeSymbol("TERM-DESC"))), list(makeSymbol("TIP"), makeSymbol("*SAMPLE-SENTENCE-TIP*")), list(makeSymbol("TERM-COMMENTS"), list(makeSymbol("GET-TERM-COMMENTS"), makeSymbol("TERM"))), list(makeSymbol("SIZE"), makeInteger(60)), list(makeSymbol("DEFAULT"), makeSymbol("PHRASE")) }), list(makeSymbol("PWHEN"), list(makeSymbol("NON-EMPTY-STRING?"), makeSymbol("TERM-COMMENTS")), list(makeSymbol("CSETQ"), makeSymbol("TIP"), list(makeSymbol("FORMAT"), NIL, makeString("~a~%~%~a"), makeSymbol("TERM-COMMENTS"), makeSymbol("TIP")))), list(makeSymbol("RET"), list(makeSymbol("ASK-GENERIC-FREE-FORM"), makeSymbol("SELF"), makeSymbol("TITLE"), makeSymbol("QUESTION"), makeSymbol("TIP"), makeSymbol("SIZE"), makeSymbol("DEFAULT")))));

    private static final SubLSymbol $sym681$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-RELATIONAL-METHOD");

    private static final SubLString $$$Determining_relation_template = makeString("Determining relation template");

    private static final SubLString $$$phrase = makeString("phrase");

    private static final SubLString $$$sentence = makeString("sentence");

    private static final SubLString $str685$Enter_a__a_illustrating_the___a__ = makeString("Enter a ~a illustrating the '~a' relation:");

    private static final SubLSymbol SME_LI_RELATIONAL_ASK_SAMPLE_SENTENCE_METHOD = makeSymbol("SME-LI-RELATIONAL-ASK-SAMPLE-SENTENCE-METHOD");

    private static final SubLSymbol CHECK_SAMPLE_SENTENCE = makeSymbol("CHECK-SAMPLE-SENTENCE");

    private static final SubLList $list688 = list(list(makeSymbol("CSETF"), list(makeSymbol("SME-LEXWIZ-CURRENT-ARG"), makeSymbol("LEXWIZ-SETTINGS")), ONE_INTEGER), list(makeSymbol("CLET"), list(list(makeSymbol("SENTENCE"), list(makeSymbol("GET-ANSWER"), makeSymbol("SELF")))), list(makeSymbol("CSETF"), list(makeSymbol("SME-LEXWIZ-SAMPLE-SENTENCE"), makeSymbol("LEXWIZ-SETTINGS")), makeSymbol("SENTENCE")), list(makeSymbol("CSETF"), list(makeSymbol("SME-LEXWIZ-SENTENCE-WORDS"), makeSymbol("LEXWIZ-SETTINGS")), list(makeSymbol("LEX-STRING-TOKENIZE"), makeSymbol("SENTENCE"), T))), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")), list(makeSymbol("RET"), T));

    private static final SubLSymbol $sym689$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-RELATIONAL-METHOD");

    private static final SubLSymbol SME_LI_RELATIONAL_CHECK_SAMPLE_SENTENCE_METHOD = makeSymbol("SME-LI-RELATIONAL-CHECK-SAMPLE-SENTENCE-METHOD");

    private static final SubLSymbol ASK_ARGUMENT_VALUES = makeSymbol("ASK-ARGUMENT-VALUES");

    private static final SubLList $list692 = list(list(makeSymbol("CLET"), list(new SubLObject[]{ list(makeSymbol("TERM"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("TERM-DESC"), list(makeSymbol("DESCRIBE-TERM"), makeSymbol("SELF"), makeSymbol("TERM"))), list(makeSymbol("SENTENCE"), list(makeSymbol("SME-LEXWIZ-SAMPLE-SENTENCE"), makeSymbol("LEXWIZ-SETTINGS"))), list(makeSymbol("WORD-CHOICES"), list(makeSymbol("LEX-STRING-TOKENIZE"), makeSymbol("SENTENCE"), T)), list(makeSymbol("ARG-NUM"), list(makeSymbol("SME-LEXWIZ-CURRENT-ARG"), makeSymbol("LEXWIZ-SETTINGS"))), list(makeSymbol("TITLE"), makeString("Determining relational arguments")), list(makeSymbol("ARG-TYPE"), list(makeSymbol("GET-RELATION-ARGUMENT-TYPE"), makeSymbol("TERM"), makeSymbol("ARG-NUM"))), list(makeSymbol("ARG-TYPE-DESCRIPTION"), list(makeSymbol("LEX-DESCRIBE-TERM"), makeSymbol("ARG-TYPE"))), list(makeSymbol("QUESTION"), list(makeSymbol("FORMAT"), NIL, makeString("Select phrase for argument ~a (~a) of relation '~a'"), makeSymbol("ARG-NUM"), makeSymbol("ARG-TYPE-DESCRIPTION"), makeSymbol("TERM-DESC"))), list(makeSymbol("OFFSETS"), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("TO-STRING")), list(makeSymbol("NUM-LIST"), list(makeSymbol("LENGTH"), makeSymbol("WORD-CHOICES"))))), list(makeSymbol("TIP"), list(makeSymbol("GET-TERM-COMMENTS"), makeSymbol("TERM"))) }), list(makeSymbol("RET"), list(makeSymbol("ASK-GENERIC-MULTIPLE-SELECTION"), makeSymbol("SELF"), makeSymbol("TITLE"), makeSymbol("QUESTION"), makeSymbol("WORD-CHOICES"), makeSymbol("TIP"), makeSymbol("OFFSETS")))));

    private static final SubLSymbol $sym693$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-RELATIONAL-METHOD");

    private static final SubLString $$$Determining_relational_arguments = makeString("Determining relational arguments");

    private static final SubLString $str695$Select_phrase_for_argument__a___a = makeString("Select phrase for argument ~a (~a) of relation '~a'");

    private static final SubLSymbol SME_LI_RELATIONAL_ASK_ARGUMENT_VALUES_METHOD = makeSymbol("SME-LI-RELATIONAL-ASK-ARGUMENT-VALUES-METHOD");

    private static final SubLSymbol CHECK_ARGUMENT_VALUES = makeSymbol("CHECK-ARGUMENT-VALUES");

    private static final SubLList $list698 = list(list(makeSymbol("CLET"), list(list(makeSymbol("OFFSETS"), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("EXTRACT-INTEGER")), list(makeSymbol("GET-ANSWER"), makeSymbol("SELF")))), list(makeSymbol("WORDS"), list(makeSymbol("SME-LEXWIZ-SENTENCE-WORDS"), makeSymbol("LEXWIZ-SETTINGS"))), list(makeSymbol("START"), list(makeSymbol("FIRST"), makeSymbol("OFFSETS"))), list(makeSymbol("END"), list(makeSymbol("1+"), list(makeSymbol("LAST-ONE"), makeSymbol("OFFSETS")))), list(makeSymbol("ARG-PHRASE"), list(makeSymbol("JOIN-WORDS"), list(makeSymbol("SUBSEQ"), makeSymbol("WORDS"), makeSymbol("START"), makeSymbol("END"))))), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), makeSymbol("START"), makeSymbol("END")), list(makeSymbol("SME-LEXWIZ-ARG-OFFSETS"), makeSymbol("LEXWIZ-SETTINGS"))), list(makeSymbol("CPUSH"), makeSymbol("ARG-PHRASE"), list(makeSymbol("SME-LEXWIZ-SENTENCE-ARGS"), makeSymbol("LEXWIZ-SETTINGS"))), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")), list(makeSymbol("RET"), T)));

    private static final SubLSymbol $sym699$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-RELATIONAL-METHOD");

    private static final SubLSymbol EXTRACT_INTEGER = makeSymbol("EXTRACT-INTEGER");

    private static final SubLSymbol SME_LI_RELATIONAL_CHECK_ARGUMENT_VALUES_METHOD = makeSymbol("SME-LI-RELATIONAL-CHECK-ARGUMENT-VALUES-METHOD");

    private static final SubLSymbol ASK_ARGUMENT_PART_OF_SPEECH = makeSymbol("ASK-ARGUMENT-PART-OF-SPEECH");

    private static final SubLList $list703 = list(list(makeSymbol("CLET"), list(list(makeSymbol("ARG-PHRASE"), list(makeSymbol("FIRST"), list(makeSymbol("SME-LEXWIZ-SENTENCE-ARGS"), makeSymbol("LEXWIZ-SETTINGS")))), list(makeSymbol("SPEECH-PARTS"), list(makeSymbol("RTP-PHRASE-PARTS-OF-SPEECH"), makeSymbol("ARG-PHRASE"))), list(makeSymbol("CHOICES"), list(makeSymbol("MAPCAR"), list(makeSymbol("FUNCTION"), makeSymbol("STRING-FOR-FORT")), makeSymbol("SPEECH-PARTS"))), list(makeSymbol("TITLE"), makeString("Determining part of speech for argument subphrase")), list(makeSymbol("QUESTION"), list(makeSymbol("FORMAT"), NIL, makeString("Select part of speech for ~s"), makeSymbol("ARG-PHRASE"))), list(makeSymbol("TIP"), makeSymbol("*ARGUMENT-PART-OF-SPEECH-TIP*"))), list(makeSymbol("PIF"), list(makeSymbol(">"), list(makeSymbol("LENGTH"), makeSymbol("CHOICES")), ONE_INTEGER), list(makeSymbol("ASK-GENERIC-ENUMERATED"), makeSymbol("SELF"), makeSymbol("TITLE"), makeSymbol("QUESTION"), makeSymbol("CHOICES"), makeSymbol("TIP"), makeSymbol("SPEECH-PARTS")), list(makeSymbol("PROGN"), list(makeSymbol("SET-ANSWER"), makeSymbol("SELF"), list(makeSymbol("FIRST"), makeSymbol("SPEECH-PARTS"))), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")))), list(makeSymbol("RET"), T)));

    private static final SubLSymbol $sym704$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-RELATIONAL-METHOD");

    private static final SubLSymbol STRING_FOR_FORT = makeSymbol("STRING-FOR-FORT");

    private static final SubLString $str706$Determining_part_of_speech_for_ar = makeString("Determining part of speech for argument subphrase");

    private static final SubLString $str707$Select_part_of_speech_for__s = makeString("Select part of speech for ~s");

    private static final SubLSymbol SME_LI_RELATIONAL_ASK_ARGUMENT_PART_OF_SPEECH_METHOD = makeSymbol("SME-LI-RELATIONAL-ASK-ARGUMENT-PART-OF-SPEECH-METHOD");

    private static final SubLSymbol CHECK_ARGUMENT_PART_OF_SPEECH = makeSymbol("CHECK-ARGUMENT-PART-OF-SPEECH");

    private static final SubLList $list710 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TERM"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("NUM-ARGS"), list(makeSymbol("LEX-ARITY-IN-ANY-MT"), makeSymbol("TERM"))), list(makeSymbol("SPEECH-PART"), list(makeSymbol("LEX-FORT-FOR-STRING"), list(makeSymbol("GET-ANSWER"), makeSymbol("SELF"))))), list(makeSymbol("PUNLESS"), list(makeSymbol("FORT-P"), makeSymbol("SPEECH-PART")), list(makeSymbol("CSETQ"), makeSymbol("SPEECH-PART"), reader_make_constant_shell(makeString("Noun")))), list(makeSymbol("CPUSH"), makeSymbol("SPEECH-PART"), list(makeSymbol("SME-LEXWIZ-ARG-SPEECH-PARTS"), makeSymbol("LEXWIZ-SETTINGS"))), list(makeSymbol("CSETF"), list(makeSymbol("SME-LEXWIZ-CURRENT-ARG"), makeSymbol("LEXWIZ-SETTINGS")), list(makeSymbol("1+"), list(makeSymbol("SME-LEXWIZ-CURRENT-ARG"), makeSymbol("LEXWIZ-SETTINGS")))), list(makeSymbol("PWHEN"), list(makeSymbol(">"), list(makeSymbol("SME-LEXWIZ-CURRENT-ARG"), makeSymbol("LEXWIZ-SETTINGS")), makeSymbol("NUM-ARGS")), list(makeSymbol("DERIVE-RELATIONAL-TEMPLATES"), makeSymbol("SELF"))), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")), list(makeSymbol("RET"), T)));

    private static final SubLSymbol $sym711$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-RELATIONAL-METHOD");

    private static final SubLObject $$Noun = reader_make_constant_shell(makeString("Noun"));

    private static final SubLSymbol SME_LI_RELATIONAL_CHECK_ARGUMENT_PART_OF_SPEECH_METHOD = makeSymbol("SME-LI-RELATIONAL-CHECK-ARGUMENT-PART-OF-SPEECH-METHOD");

    private static final SubLSymbol DERIVE_RELATIONAL_TEMPLATES = makeSymbol("DERIVE-RELATIONAL-TEMPLATES");

    private static final SubLList $list715 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TERM"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("ARG-OFFSETS"), list(makeSymbol("REVERSE"), list(makeSymbol("SME-LEXWIZ-ARG-OFFSETS"), makeSymbol("LEXWIZ-SETTINGS")))), list(makeSymbol("ARG-SPEECH-PARTS"), list(makeSymbol("REVERSE"), list(makeSymbol("SME-LEXWIZ-ARG-SPEECH-PARTS"), makeSymbol("LEXWIZ-SETTINGS")))), list(makeSymbol("SENTENCE-WORDS"), list(makeSymbol("SME-LEXWIZ-SENTENCE-WORDS"), makeSymbol("LEXWIZ-SETTINGS")))), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("PARSE-TEMPLATE"), makeSymbol("NEW-GENERATION-TEMPLATE"), makeSymbol("OLD-GENERATION-TEMPLATE")), list(makeSymbol("LEXIFY-RELATION"), makeSymbol("TERM"), makeSymbol("ARG-OFFSETS"), makeSymbol("SENTENCE-WORDS"), makeSymbol("ARG-SPEECH-PARTS")), list(makeSymbol("PIF"), makeSymbol("*USE-GENFORMAT-TEMPLATE*"), list(makeSymbol("PROGN"), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-TEMPLATE"), makeSymbol("LEXWIZ-PARAMETERS")), list(makeSymbol("THIRD"), makeSymbol("OLD-GENERATION-TEMPLATE"))), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-TEMPLATE-ARGS"), makeSymbol("LEXWIZ-PARAMETERS")), list(makeSymbol("FORMAT"), NIL, makeString("~S"), list(makeSymbol("FOURTH"), makeSymbol("OLD-GENERATION-TEMPLATE"))))), list(makeSymbol("PROGN"), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-TEMPLATE"), makeSymbol("LEXWIZ-PARAMETERS")), makeSymbol("NEW-GENERATION-TEMPLATE")), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-TEMPLATE-ARGS"), makeSymbol("LEXWIZ-PARAMETERS")), NIL))), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-PARSE-TEMPLATE-FORMULA"), makeSymbol("LEXWIZ-PARAMETERS")), makeSymbol("PARSE-TEMPLATE"))), list(makeSymbol("RET"), T)));

    private static final SubLSymbol $sym716$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-RELATIONAL-METHOD");

    private static final SubLString $str717$_S = makeString("~S");

    private static final SubLSymbol SME_LI_RELATIONAL_DERIVE_RELATIONAL_TEMPLATES_METHOD = makeSymbol("SME-LI-RELATIONAL-DERIVE-RELATIONAL-TEMPLATES-METHOD");

    private static final SubLList $list719 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("SME-STATE"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("SME-STATE")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SME-STATE"), list(makeSymbol("QUOTE"), makeSymbol("SET-STATES")), list(makeSymbol("QUOTE"), list(makeSymbol("ASK-PREFERRED-LEXIFICATION-STATUS"), makeSymbol("CHECK-PREFERRED-LEXIFICATION-STATUS"), makeSymbol("DO-LEXIFICATION"), makeSymbol("CHECK-LEXIFICATION"), makeSymbol("END-INTERACTION")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLList $list720 = list(makeSymbol("ASK-PREFERRED-LEXIFICATION-STATUS"), makeSymbol("CHECK-PREFERRED-LEXIFICATION-STATUS"), makeSymbol("DO-LEXIFICATION"), makeSymbol("CHECK-LEXIFICATION"), makeSymbol("END-INTERACTION"));

    private static final SubLSymbol SME_LI_POST_GENERAL_INITIALIZE_METHOD = makeSymbol("SME-LI-POST-GENERAL-INITIALIZE-METHOD");

    private static final SubLSymbol ASK_PREFERRED_LEXIFICATION_STATUS = makeSymbol("ASK-PREFERRED-LEXIFICATION-STATUS");

    public static final SubLList $list723 = list(list(makeSymbol("CLET"), list(new SubLObject[]{ list(makeSymbol("PHRASE"), list(makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("TERM"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("TERM-DESC"), list(makeSymbol("DESCRIBE-TERM"), makeSymbol("SELF"), makeSymbol("TERM"))), list(makeSymbol("LEX-TERM"), list(makeSymbol("STRING-FOR-FORT"), makeSymbol("TERM"))), list(makeSymbol("TITLE"), makeString("Checking status of preferred reference")), list(makeSymbol("QUESTION"), list(makeSymbol("FORMAT"), NIL, makeString("Is \"~a\" the most common way of referring to the concept \'~a\'?"), makeSymbol("PHRASE"), makeSymbol("TERM-DESC"))), list(makeSymbol("OTHER-PHRASES"), list(makeSymbol("REMOVE"), makeSymbol("PHRASE"), list(makeSymbol("REMOVE-IF-NOT"), list(makeSymbol("QUOTE"), makeSymbol("STRINGP")), list(makeSymbol("LEXIFIED-PHRASES-FOR-TERM"), makeSymbol("TERM"))), list(makeSymbol("FUNCTION"), EQUALP))), list(makeSymbol("TIP"), list(makeSymbol("FWHEN"), makeSymbol("OTHER-PHRASES"), list(makeSymbol("FORMAT"), NIL, makeString("Other ways of referring to ~a are the following:~%~a~a~%"), makeSymbol("LEX-TERM"), CHAR_tab, list(makeSymbol("JOIN-STRINGS"), makeSymbol("OTHER-PHRASES"), makeSymbol("*NEWLINE-TAB*"))))), list(makeSymbol("SKIP?"), list(makeSymbol("IS-RELATIONAL?"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS")))) }), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(EQUALP, makeSymbol("PHRASE"), makeSymbol("TERM-DESC")), list(makeSymbol("NULL"), makeSymbol("OTHER-PHRASES"))), list(makeSymbol("SET-ANSWER"), makeSymbol("SELF"), T), list(makeSymbol("CSETQ"), makeSymbol("SKIP?"), T)), list(makeSymbol("PIF"), makeSymbol("SKIP?"), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")), list(makeSymbol("ASK-GENERIC-BOOLEAN"), makeSymbol("SELF"), makeSymbol("TITLE"), makeSymbol("QUESTION"), makeSymbol("TIP"))), list(makeSymbol("RET"), T)));

    private static final SubLSymbol $sym724$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-POST-GENERAL-METHOD");

    private static final SubLString $str725$Checking_status_of_preferred_refe = makeString("Checking status of preferred reference");

    private static final SubLString $str726$Is___a__the_most_common_way_of_re = makeString("Is \"~a\" the most common way of referring to the concept \'~a\'?");



    private static final SubLString $str728$Other_ways_of_referring_to__a_are = makeString("Other ways of referring to ~a are the following:~%~a~a~%");

    private static final SubLSymbol SME_LI_POST_GENERAL_ASK_PREFERRED_LEXIFICATION_STATUS_METHOD = makeSymbol("SME-LI-POST-GENERAL-ASK-PREFERRED-LEXIFICATION-STATUS-METHOD");

    private static final SubLSymbol CHECK_PREFERRED_LEXIFICATION_STATUS = makeSymbol("CHECK-PREFERRED-LEXIFICATION-STATUS");

    public static final SubLList $list731 = list(list(makeSymbol("PUNLESS"), list(makeSymbol("IS-RELATIONAL?"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-IS-PREFERRED?"), makeSymbol("LEXWIZ-PARAMETERS")), list(makeSymbol("GET-ANSWER"), makeSymbol("SELF")))), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")), list(makeSymbol("RET"), T));

    private static final SubLSymbol SME_LI_POST_GENERAL_CHECK_PREFERRED_LEXIFICATION_STATUS_METHOD = makeSymbol("SME-LI-POST-GENERAL-CHECK-PREFERRED-LEXIFICATION-STATUS-METHOD");

    private static final SubLSymbol DO_LEXIFICATION = makeSymbol("DO-LEXIFICATION");

    public static final SubLList $list734 = list(list(makeSymbol("TRACE-LEXIFICATION-PARAMETERS"), makeSymbol("LEXWIZ-PARAMETERS")), list(makeSymbol("DERIVE-LEXIFICATION-FORMULA"), makeSymbol("LEXWIZ-PARAMETERS")), list(makeSymbol("PERFORM-LEXIFICATION"), makeSymbol("LEXWIZ-PARAMETERS")), list(makeSymbol("CLET"), list(list(makeSymbol("TITLE"), makeString("Checking results of lexification")), list(makeSymbol("ERROR-IN-LEXIFICATION?"), list(makeSymbol("NON-EMPTY-STRING?"), list(makeSymbol("LEXWIZ-ERROR-MESSAGE"), makeSymbol("LEXWIZ-PARAMETERS")))), list(makeSymbol("STATUS"), list(makeSymbol("FIF"), makeSymbol("ERROR-IN-LEXIFICATION?"), makeString("Problem processing the lexification"), makeString("Lexification complete."))), list(makeSymbol("QUESTION"), list(makeSymbol("FORMAT"), NIL, makeString("~a~%~%Press OK to proceed"), makeSymbol("STATUS"))), list(makeSymbol("CHOICES"), NIL), list(makeSymbol("TIP"), list(makeSymbol("FWHEN"), makeSymbol("ERROR-IN-LEXIFICATION?"), list(makeSymbol("FORMAT"), NIL, makeString("This type of error shouldn't occur under normal circumstances. Contact Cycorp and provide the following diagnosis: ~a"), list(makeSymbol("LEXWIZ-ERROR-MESSAGE"), makeSymbol("LEXWIZ-PARAMETERS")))))), list(makeSymbol("PIF"), makeSymbol("ERROR-IN-LEXIFICATION?"), list(makeSymbol("ASK-GENERIC-ENUMERATED"), makeSymbol("SELF"), makeSymbol("TITLE"), makeSymbol("QUESTION"), makeSymbol("CHOICES"), makeSymbol("TIP")), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF"))), list(makeSymbol("RET"), T)));

    private static final SubLSymbol $sym735$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-POST-GENERAL-METHOD");

    private static final SubLString $$$Checking_results_of_lexification = makeString("Checking results of lexification");

    private static final SubLString $str737$Problem_processing_the_lexificati = makeString("Problem processing the lexification");

    private static final SubLString $str738$Lexification_complete_ = makeString("Lexification complete.");

    private static final SubLString $str739$_a____Press_OK_to_proceed = makeString("~a~%~%Press OK to proceed");

    private static final SubLString $str740$This_type_of_error_shouldn_t_occu = makeString("This type of error shouldn't occur under normal circumstances. Contact Cycorp and provide the following diagnosis: ~a");

    private static final SubLSymbol SME_LI_POST_GENERAL_DO_LEXIFICATION_METHOD = makeSymbol("SME-LI-POST-GENERAL-DO-LEXIFICATION-METHOD");

    private static final SubLSymbol CHECK_LEXIFICATION = makeSymbol("CHECK-LEXIFICATION");

    private static final SubLList $list743 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PHRASE"), list(makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("TERM"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("TERM-DESC"), list(makeSymbol("DESCRIBE-TERM"), makeSymbol("SELF"), makeSymbol("TERM"))), list(makeSymbol("COMPLETION-MESSAGE"), list(makeSymbol("FORMAT"), NIL, makeString("Done mapping phrase ~s into concept '~a'"), makeSymbol("PHRASE"), makeSymbol("TERM-DESC")))), list(makeSymbol("MUMBLE"), makeSymbol("SELF"), makeSymbol("COMPLETION-MESSAGE")), list(makeSymbol("NEXT-INTERACTION"), makeSymbol("SELF")), list(makeSymbol("RET"), T)));

    private static final SubLSymbol $sym744$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LI-POST-GENERAL-METHOD");

    private static final SubLString $str745$Done_mapping_phrase__s_into_conce = makeString("Done mapping phrase ~s into concept '~a'");

    private static final SubLSymbol SME_LI_POST_GENERAL_CHECK_LEXIFICATION_METHOD = makeSymbol("SME-LI-POST-GENERAL-CHECK-LEXIFICATION-METHOD");

    private static final SubLList $list747 = list(new SubLObject[]{ list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("INIT-LEXIFICATION-WIZARD")), list(makeSymbol("CSETQ"), makeSymbol("STATE"), makeKeyword("GET-PRE-GENERAL")), list(makeSymbol("CSETQ"), makeSymbol("NEXT-STATES"), list(makeSymbol("QUOTE"), list(makeKeyword("GET-SPECIFIC"), makeKeyword("GET-POST-GENERAL"), makeKeyword("DONE")))), list(makeSymbol("CSETQ"), makeSymbol("LEXWIZ-PARAMETERS"), list(makeSymbol("COPY-LEXIFICATION-PARAMETERS"), makeSymbol("*LEXWIZ-DEFAULTS*"))), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INTERACTION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("NEW-CURRENT-INTERACTION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("PROXY"), list(makeSymbol("FUNCALL-CLASS-METHOD"), list(makeSymbol("QUOTE"), makeSymbol("INTERFACE-PROXY")), list(makeSymbol("QUOTE"), makeSymbol("NEW")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("*USE-BLACKBOARD?*"), list(makeSymbol("CNOT"), makeSymbol("*SIMULATED-BLACKBOARD?*"))), list(makeSymbol("CSETQ"), makeSymbol("PROXY"), list(makeSymbol("FUNCALL-CLASS-METHOD"), list(makeSymbol("QUOTE"), makeSymbol("RKF-BB-PROXY")), list(makeSymbol("QUOTE"), makeSymbol("NEW"))))), list(makeSymbol("CSETQ"), makeSymbol("QUESTION-ANSWERING-AGENT-CLASS"), list(makeSymbol("QUOTE"), makeSymbol("HTML-QUESTION-ANSWERING-AGENT"))), list(makeSymbol("RET"), makeSymbol("SELF")) });

    private static final SubLSymbol $GET_PRE_GENERAL = makeKeyword("GET-PRE-GENERAL");

    private static final SubLList $list749 = list(makeKeyword("GET-SPECIFIC"), makeKeyword("GET-POST-GENERAL"), makeKeyword("DONE"));

    private static final SubLSymbol RKF_BB_PROXY = makeSymbol("RKF-BB-PROXY");

    private static final SubLSymbol HTML_QUESTION_ANSWERING_AGENT = makeSymbol("HTML-QUESTION-ANSWERING-AGENT");

    private static final SubLSymbol SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD = makeSymbol("SME-LEXIFICATION-WIZARD-INITIALIZE-METHOD");

    private static final SubLList $list753 = list(list(makeSymbol("CSETQ"), makeSymbol("STATE"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("STATE")))), list(makeSymbol("CSETQ"), makeSymbol("NEXT-STATES"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("NEXT-STATES")))), list(makeSymbol("CSETQ"), makeSymbol("LEXWIZ-PARAMETERS"), list(makeSymbol("COPY-LEXIFICATION-PARAMETERS"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("LEXWIZ-PARAMETERS"))))), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INTERACTION"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("CURRENT-INTERACTION")))), list(makeSymbol("CSETQ"), makeSymbol("NEW-CURRENT-INTERACTION"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("NEW-CURRENT-INTERACTION")))), list(makeSymbol("CSETQ"), makeSymbol("PROXY"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("PROXY")))), list(makeSymbol("CSETQ"), makeSymbol("QUESTION-ANSWERING-AGENT-CLASS"), list(makeSymbol("GET-SLOT"), makeSymbol("OTHER"), list(makeSymbol("QUOTE"), makeSymbol("QUESTION-ANSWERING-AGENT-CLASS")))), list(makeSymbol("RET"), makeSymbol("SELF")));

    private static final SubLSymbol $sym754$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-WIZARD-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_WIZARD_COPY_METHOD = makeSymbol("SME-LEXIFICATION-WIZARD-COPY-METHOD");

    private static final SubLList $list756 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-LEXWIZ"), list(makeSymbol("FUNCALL-CLASS-METHOD"), list(makeSymbol("QUOTE"), makeSymbol("SME-LEXIFICATION-WIZARD")), list(makeSymbol("QUOTE"), makeSymbol("NEW"))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-LEXWIZ"), list(makeSymbol("QUOTE"), makeSymbol("COPY")), makeSymbol("OTHER")), list(makeSymbol("RET"), makeSymbol("NEW-LEXWIZ"))));

    private static final SubLSymbol SME_LEXIFICATION_WIZARD_NEW_COPY_METHOD = makeSymbol("SME-LEXIFICATION-WIZARD-NEW-COPY-METHOD");

    private static final SubLSymbol SET_TERM = makeSymbol("SET-TERM");

    private static final SubLList $list759 = list(makeSymbol("NEW-TERM"));

    private static final SubLList $list760 = list(list(makeSymbol("PWHEN"), makeSymbol("LEXWIZ-PARAMETERS"), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS")), makeSymbol("NEW-TERM"))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol $sym761$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-WIZARD-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_WIZARD_SET_TERM_METHOD = makeSymbol("SME-LEXIFICATION-WIZARD-SET-TERM-METHOD");

    private static final SubLSymbol GET_TERM = makeSymbol("GET-TERM");

    private static final SubLList $list764 = list(list(makeSymbol("PWHEN"), makeSymbol("LEXWIZ-PARAMETERS"), list(makeSymbol("RET"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS")))));

    private static final SubLSymbol $sym765$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-WIZARD-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_WIZARD_GET_TERM_METHOD = makeSymbol("SME-LEXIFICATION-WIZARD-GET-TERM-METHOD");

    private static final SubLSymbol SET_PHRASE = makeSymbol("SET-PHRASE");

    private static final SubLList $list768 = list(makeSymbol("NEW-PHRASE"));

    private static final SubLList $list769 = list(list(makeSymbol("PWHEN"), makeSymbol("LEXWIZ-PARAMETERS"), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-PARAMETERS")), makeSymbol("NEW-PHRASE"))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol $sym770$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-WIZARD-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_WIZARD_SET_PHRASE_METHOD = makeSymbol("SME-LEXIFICATION-WIZARD-SET-PHRASE-METHOD");

    private static final SubLSymbol GET_PHRASE = makeSymbol("GET-PHRASE");

    public static final SubLList $list773 = list(list(makeSymbol("PWHEN"), makeSymbol("LEXWIZ-PARAMETERS"), list(makeSymbol("RET"), list(makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-PARAMETERS")))));

    private static final SubLSymbol $sym774$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-WIZARD-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_WIZARD_GET_PHRASE_METHOD = makeSymbol("SME-LEXIFICATION-WIZARD-GET-PHRASE-METHOD");



    private static final SubLList $list777 = list(makeSymbol("NEW-MT"));

    private static final SubLList $list778 = list(list(makeSymbol("PWHEN"), makeSymbol("LEXWIZ-PARAMETERS"), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-MT"), makeSymbol("LEXWIZ-PARAMETERS")), makeSymbol("NEW-MT"))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol $sym779$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-WIZARD-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_WIZARD_SET_MT_METHOD = makeSymbol("SME-LEXIFICATION-WIZARD-SET-MT-METHOD");



    private static final SubLList $list782 = list(list(makeSymbol("PWHEN"), makeSymbol("LEXWIZ-PARAMETERS"), list(makeSymbol("RET"), list(makeSymbol("LEXWIZ-MT"), makeSymbol("LEXWIZ-PARAMETERS")))));

    private static final SubLSymbol $sym783$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-WIZARD-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_WIZARD_GET_MT_METHOD = makeSymbol("SME-LEXIFICATION-WIZARD-GET-MT-METHOD");

    private static final SubLSymbol SET_LEXICAL_MT = makeSymbol("SET-LEXICAL-MT");

    private static final SubLList $list786 = list(list(makeSymbol("PWHEN"), makeSymbol("LEXWIZ-PARAMETERS"), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-LEXICAL-MT"), makeSymbol("LEXWIZ-PARAMETERS")), list(makeSymbol("FORT-FOR-STRING"), makeSymbol("NEW-MT")))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol $sym787$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-WIZARD-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_WIZARD_SET_LEXICAL_MT_METHOD = makeSymbol("SME-LEXIFICATION-WIZARD-SET-LEXICAL-MT-METHOD");

    private static final SubLSymbol SET_PARSING_MT = makeSymbol("SET-PARSING-MT");

    private static final SubLList $list790 = list(list(makeSymbol("PWHEN"), makeSymbol("LEXWIZ-PARAMETERS"), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-PARSE-TEMPLATE-MT"), makeSymbol("LEXWIZ-PARAMETERS")), makeSymbol("NEW-MT"))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol $sym791$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-WIZARD-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_WIZARD_SET_PARSING_MT_METHOD = makeSymbol("SME-LEXIFICATION-WIZARD-SET-PARSING-MT-METHOD");

    private static final SubLSymbol SET_GENERATION_MT = makeSymbol("SET-GENERATION-MT");

    private static final SubLList $list794 = list(list(makeSymbol("PWHEN"), makeSymbol("LEXWIZ-PARAMETERS"), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-GENERATION-MT"), makeSymbol("LEXWIZ-PARAMETERS")), makeSymbol("NEW-MT"))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol $sym795$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SME-LEXIFICATION-WIZARD-METHOD");

    private static final SubLSymbol SME_LEXIFICATION_WIZARD_SET_GENERATION_MT_METHOD = makeSymbol("SME-LEXIFICATION-WIZARD-SET-GENERATION-MT-METHOD");



    private static final SubLList $list798 = list(makeSymbol("&OPTIONAL"), makeSymbol("TERM"), makeSymbol("PHRASE"), makeSymbol("MT"));

    public static final SubLList $list799 = list(list(makeSymbol("PWHEN"), makeSymbol("TERM"), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS")), makeSymbol("TERM"))), list(makeSymbol("PWHEN"), makeSymbol("PHRASE"), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-PHRASE"), makeSymbol("LEXWIZ-PARAMETERS")), makeSymbol("PHRASE"))), list(makeSymbol("PWHEN"), makeSymbol("MT"), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-MT"), makeSymbol("LEXWIZ-PARAMETERS")), makeSymbol("MT"))), list(makeSymbol("PWHEN"), list(makeSymbol("STRINGP"), list(makeSymbol("LEXWIZ-MT"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-MT"), makeSymbol("LEXWIZ-PARAMETERS")), list(makeSymbol("FORT-FOR-STRING"), list(makeSymbol("LEXWIZ-MT"), makeSymbol("LEXWIZ-PARAMETERS"))))), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INTERACTION"), list(makeSymbol("FUNCALL-CLASS-METHOD"), list(makeSymbol("QUOTE"), makeSymbol("SME-LI-PRE-GENERAL")), list(makeSymbol("QUOTE"), makeSymbol("NEW")))), list(makeSymbol("CSETQ"), makeSymbol("NEW-CURRENT-INTERACTION"), makeSymbol("CURRENT-INTERACTION")), list(makeSymbol("CLET"), list(list(makeSymbol("NOTIFICATION-FN"), list(makeSymbol("RESOLVE-METHOD"), list(makeSymbol("QUOTE"), makeSymbol("PROCESS-STATUS-UPDATE")), list(makeSymbol("QUOTE"), makeSymbol("SME-LEXIFICATION-WIZARD"))))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CURRENT-INTERACTION"), list(makeSymbol("QUOTE"), makeSymbol("INITIATE-INTERACTION")), makeSymbol("LEXWIZ-PARAMETERS"), makeSymbol("NOTIFICATION-FN"), makeSymbol("SELF"), makeSymbol("PROXY"), makeSymbol("QUESTION-ANSWERING-AGENT-CLASS"))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol SME_LEXIFICATION_WIZARD_LEXIFY_METHOD = makeSymbol("SME-LEXIFICATION-WIZARD-LEXIFY-METHOD");

    private static final SubLSymbol LEXIFY_FIRST_TERMSTRING = makeSymbol("LEXIFY-FIRST-TERMSTRING");

    private static final SubLList $list802 = list(makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));

    private static final SubLList $list803 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PHRASE"), list(makeSymbol("FIRST-TERMSTRING-PHRASE"), makeSymbol("TERM")))), list(makeSymbol("RET"), list(makeSymbol("LEXIFY"), makeSymbol("SELF"), makeSymbol("TERM"), makeSymbol("PHRASE"), makeSymbol("MT")))));

    private static final SubLSymbol SME_LEXIFICATION_WIZARD_LEXIFY_FIRST_TERMSTRING_METHOD = makeSymbol("SME-LEXIFICATION-WIZARD-LEXIFY-FIRST-TERMSTRING-METHOD");

    private static final SubLSymbol CONTINUE_LEXIFY = makeSymbol("CONTINUE-LEXIFY");

    private static final SubLList $list806 = list(list(makeSymbol("CSETQ"), makeSymbol("STATE"), list(makeSymbol("FIRST"), makeSymbol("NEXT-STATES"))), list(makeSymbol("CSETQ"), makeSymbol("NEXT-STATES"), list(makeSymbol("REST"), makeSymbol("NEXT-STATES"))), list(makeSymbol("CLET"), list(list(makeSymbol("NOTIFICATION-FN"), list(makeSymbol("RESOLVE-METHOD"), list(makeSymbol("QUOTE"), makeSymbol("PROCESS-STATUS-UPDATE")), list(makeSymbol("QUOTE"), makeSymbol("SME-LEXIFICATION-WIZARD")))), makeSymbol("INTERACTION-CLASS")), list(makeSymbol("PCASE"), makeSymbol("STATE"), list(makeKeyword("GET-SPECIFIC"), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-STATE"), makeSymbol("LEXWIZ-PARAMETERS")), makeKeyword("NEED-INPUT")), list(makeSymbol("PCOND"), list(list(makeSymbol("IS-RELATIONAL?"), list(makeSymbol("LEXWIZ-TERM"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeSymbol("CSETQ"), makeSymbol("INTERACTION-CLASS"), list(makeSymbol("QUOTE"), makeSymbol("SME-LI-RELATIONAL")))), list(list(makeSymbol("LEXWIZ-IS-PROPER?"), makeSymbol("LEXWIZ-PARAMETERS")), list(makeSymbol("CSETQ"), makeSymbol("INTERACTION-CLASS"), list(makeSymbol("QUOTE"), makeSymbol("SME-LI-PROPER-NAME")))), list(T, list(makeSymbol("CSETQ"), makeSymbol("INTERACTION-CLASS"), list(makeSymbol("QUOTE"), makeSymbol("SME-LI-DENOTATIONAL"))))), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INTERACTION"), list(makeSymbol("FUNCALL-CLASS-METHOD"), makeSymbol("INTERACTION-CLASS"), list(makeSymbol("QUOTE"), makeSymbol("NEW")))), list(makeSymbol("CSETQ"), makeSymbol("NEW-CURRENT-INTERACTION"), makeSymbol("CURRENT-INTERACTION")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CURRENT-INTERACTION"), list(makeSymbol("QUOTE"), makeSymbol("INITIATE-INTERACTION")), makeSymbol("LEXWIZ-PARAMETERS"), makeSymbol("NOTIFICATION-FN"), makeSymbol("SELF"), makeSymbol("PROXY"), makeSymbol("QUESTION-ANSWERING-AGENT-CLASS")), list(makeSymbol("TRACE-LEXIFICATION-PARAMETERS"), makeSymbol("LEXWIZ-PARAMETERS"))), list(makeKeyword("GET-POST-GENERAL"), list(makeSymbol("CSETF"), list(makeSymbol("LEXWIZ-STATE"), makeSymbol("LEXWIZ-PARAMETERS")), makeKeyword("DONE")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-INTERACTION"), list(makeSymbol("FUNCALL-CLASS-METHOD"), list(makeSymbol("QUOTE"), makeSymbol("SME-LI-POST-GENERAL")), list(makeSymbol("QUOTE"), makeSymbol("NEW")))), list(makeSymbol("CSETQ"), makeSymbol("NEW-CURRENT-INTERACTION"), makeSymbol("CURRENT-INTERACTION")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CURRENT-INTERACTION"), list(makeSymbol("QUOTE"), makeSymbol("INITIATE-INTERACTION")), makeSymbol("LEXWIZ-PARAMETERS"), makeSymbol("NOTIFICATION-FN"), makeSymbol("SELF"), makeSymbol("PROXY"), makeSymbol("QUESTION-ANSWERING-AGENT-CLASS"))), list(makeKeyword("DONE"), list(makeSymbol("PWHEN"), makeSymbol("PROXY"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("PROXY"), list(makeSymbol("QUOTE"), makeSymbol("END-SESSION"))))), list(makeSymbol("OTHERWISE"), list(makeSymbol("PWHEN"), makeSymbol("STATE"), list(makeSymbol("LEX-WARN"), makeString("Unexpected state keyword: ~a~%"), makeSymbol("STATE"))))), list(makeSymbol("RET"), T)));





    private static final SubLSymbol $GET_POST_GENERAL = makeKeyword("GET-POST-GENERAL");

    private static final SubLString $str810$Unexpected_state_keyword___a__ = makeString("Unexpected state keyword: ~a~%");

    private static final SubLSymbol SME_LEXIFICATION_WIZARD_CONTINUE_LEXIFY_METHOD = makeSymbol("SME-LEXIFICATION-WIZARD-CONTINUE-LEXIFY-METHOD");

    private static final SubLList $list812 = list(makeSymbol("STATUS"), makeSymbol("&OPTIONAL"), makeSymbol("SERVER"), makeSymbol("USER-DATA"));

    private static final SubLList $list813 = list(list(makeSymbol("IGNORE"), makeSymbol("STATUS"), makeSymbol("USER-DATA")), list(makeSymbol("LEX-DEBUG-OUT"), makeString("sme-lexwiz process-status-update status=~a server=~a user-data=~a~%"), makeSymbol("STATUS"), makeSymbol("SERVER"), makeSymbol("USER-DATA")), list(makeSymbol("LEX-ASSERTION"), list(EQ, makeSymbol("SERVER"), makeSymbol("CURRENT-INTERACTION"))), list(makeSymbol("PWHEN"), makeSymbol("CURRENT-INTERACTION"), list(makeSymbol("LEX-DEBUG-OUT"), makeString("current interaction: ~s~%"), makeSymbol("CURRENT-INTERACTION")), list(makeSymbol("LEX-DESCRIBE-INSTANCE"), makeSymbol("*LEX-VERY-VERBOSE*"), makeSymbol("CURRENT-INTERACTION")), list(makeSymbol("UPDATE-LEXIFICATION-PARAMETERS"), makeSymbol("SELF"))), list(makeSymbol("CLET"), list(list(makeSymbol("USE-CLONE?"), list(makeSymbol("CNOT"), makeSymbol("*USE-BLACKBOARD?*"))), list(makeSymbol("LEXWIZ-CLONE"), list(makeSymbol("FIF"), makeSymbol("USE-CLONE?"), list(makeSymbol("FUNCALL-CLASS-METHOD"), list(makeSymbol("QUOTE"), makeSymbol("SME-LEXIFICATION-WIZARD")), list(makeSymbol("QUOTE"), makeSymbol("NEW-COPY")), makeSymbol("SELF")), makeSymbol("SELF")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("LEXWIZ-CLONE"), list(makeSymbol("QUOTE"), makeSymbol("CONTINUE-LEXIFY")))), list(makeSymbol("RET"), NIL));

    private static final SubLString $str814$sme_lexwiz_process_status_update_ = makeString("sme-lexwiz process-status-update status=~a server=~a user-data=~a~%");

    private static final SubLList $list815 = list(EQ, makeSymbol("SERVER"), makeSymbol("CURRENT-INTERACTION"));

    private static final SubLString $str816$current_interaction___s__ = makeString("current interaction: ~s~%");

    private static final SubLSymbol SME_LEXIFICATION_WIZARD_PROCESS_STATUS_UPDATE_METHOD = makeSymbol("SME-LEXIFICATION-WIZARD-PROCESS-STATUS-UPDATE-METHOD");

    private static final SubLList $list818 = list(list(makeSymbol("PWHEN"), makeSymbol("CURRENT-INTERACTION"), list(makeSymbol("CLET"), list(list(makeSymbol("REVISED-LEXWIZ-PARAMETERS"), list(makeSymbol("GET-SLOT"), makeSymbol("CURRENT-INTERACTION"), list(makeSymbol("QUOTE"), makeSymbol("LEXWIZ-PARAMETERS"))))), list(makeSymbol("TRACE-LEXIFICATION-PARAMETERS"), makeSymbol("REVISED-LEXWIZ-PARAMETERS")), list(makeSymbol("CSETQ"), makeSymbol("LEXWIZ-PARAMETERS"), list(makeSymbol("COPY-LEXIFICATION-PARAMETERS"), makeSymbol("REVISED-LEXWIZ-PARAMETERS"))), list(makeSymbol("SET-SLOT"), makeSymbol("CURRENT-INTERACTION"), list(makeSymbol("QUOTE"), makeSymbol("LEXWIZ-PARAMETERS")), makeSymbol("LEXWIZ-PARAMETERS")))), list(makeSymbol("RET"), NIL));

    private static final SubLSymbol SME_LEXIFICATION_WIZARD_UPDATE_LEXIFICATION_PARAMETERS_METHOD = makeSymbol("SME-LEXIFICATION-WIZARD-UPDATE-LEXIFICATION-PARAMETERS-METHOD");

    private static final SubLSymbol POS_OF_STRING = makeSymbol("POS-OF-STRING");



    private static final SubLList $list822 = list(reader_make_constant_shell(makeString("ProperNoun")));



    private static final SubLList $list824 = list(reader_make_constant_shell(makeString("Noun")));

    private static final SubLString $str825$SME_Lexification_settings____S__ = makeString("SME Lexification settings:~%~S~%");

    private static final SubLString $str826$A_normal__a = makeString("A normal ~a");

    private static final SubLString $$$abbreviation = makeString("abbreviation");

    private static final SubLString $$$name = makeString("name");

    private static final SubLList $list829 = list(makeString("None of the above"));

    private static final SubLList $list830 = list(makeString("nameString"));

    private static final SubLString $str831$_a___a = makeString("~a: ~a");

    private static final SubLString $str832$__ = makeString("; ");

    private static final SubLSymbol $sym833$STRING_ = makeSymbol("STRING<");

    private static final SubLString $str834$non_null_headword_position_and_pa = makeString("non-null headword-position and part-of-speech required for derive-part-of-speech-variations");

    private static final SubLString $str835$Invalid_headword_position__a_for_ = makeString("Invalid headword position ~a for ~s~%");

    private static final SubLString $str836$__title = makeString("- title");

    private static final SubLObject $$Title = reader_make_constant_shell(makeString("Title"));

    private static final SubLObject $$SalutationMapping = reader_make_constant_shell(makeString("SalutationMapping"));

    private static final SubLObject $$codeMapping = reader_make_constant_shell(makeString("codeMapping"));

    private static final SubLSymbol LEX_FORT_FOR_STRING = makeSymbol("LEX-FORT-FOR-STRING");

    private static final SubLSymbol $sym841$CLOSED_LEXICAL_CLASS_STRING_ = makeSymbol("CLOSED-LEXICAL-CLASS-STRING?");

    public static SubLObject sme_lexwiz_use_blackboardP() {
        return list_utilities.sublisp_boolean($use_blackboardP$.getGlobalValue());
    }

    public static SubLObject sme_lexwiz_title() {
        return $sme_lexwiz_title$.getGlobalValue();
    }

    public static SubLObject phrase_specification_tip() {
        return $phrase_specification_tip$.getGlobalValue();
    }

    public static SubLObject lex_describe_instance(final SubLObject level, final SubLObject v_object) {
        return NIL;
    }

    public static SubLObject sme_lexification_settings_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sme_lexification_settings_p(final SubLObject v_object) {
        return v_object.getClass() == sme_lexification_wizard.$sme_lexification_settings_native.class ? T : NIL;
    }

    public static SubLObject sme_lexwiz_is_abbreviationP(final SubLObject v_object) {
        assert NIL != sme_lexification_settings_p(v_object) : "sme_lexification_wizard.sme_lexification_settings_p(v_object) " + "CommonSymbols.NIL != sme_lexification_wizard.sme_lexification_settings_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject sme_lexwiz_new_mappingP(final SubLObject v_object) {
        assert NIL != sme_lexification_settings_p(v_object) : "sme_lexification_wizard.sme_lexification_settings_p(v_object) " + "CommonSymbols.NIL != sme_lexification_wizard.sme_lexification_settings_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject sme_lexwiz_okP(final SubLObject v_object) {
        assert NIL != sme_lexification_settings_p(v_object) : "sme_lexification_wizard.sme_lexification_settings_p(v_object) " + "CommonSymbols.NIL != sme_lexification_wizard.sme_lexification_settings_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject sme_lexwiz_sample_sentence(final SubLObject v_object) {
        assert NIL != sme_lexification_settings_p(v_object) : "sme_lexification_wizard.sme_lexification_settings_p(v_object) " + "CommonSymbols.NIL != sme_lexification_wizard.sme_lexification_settings_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject sme_lexwiz_sentence_words(final SubLObject v_object) {
        assert NIL != sme_lexification_settings_p(v_object) : "sme_lexification_wizard.sme_lexification_settings_p(v_object) " + "CommonSymbols.NIL != sme_lexification_wizard.sme_lexification_settings_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject sme_lexwiz_sentence_args(final SubLObject v_object) {
        assert NIL != sme_lexification_settings_p(v_object) : "sme_lexification_wizard.sme_lexification_settings_p(v_object) " + "CommonSymbols.NIL != sme_lexification_wizard.sme_lexification_settings_p(v_object) " + v_object;
        return v_object.getField7();
    }

    public static SubLObject sme_lexwiz_arg_offsets(final SubLObject v_object) {
        assert NIL != sme_lexification_settings_p(v_object) : "sme_lexification_wizard.sme_lexification_settings_p(v_object) " + "CommonSymbols.NIL != sme_lexification_wizard.sme_lexification_settings_p(v_object) " + v_object;
        return v_object.getField8();
    }

    public static SubLObject sme_lexwiz_current_arg(final SubLObject v_object) {
        assert NIL != sme_lexification_settings_p(v_object) : "sme_lexification_wizard.sme_lexification_settings_p(v_object) " + "CommonSymbols.NIL != sme_lexification_wizard.sme_lexification_settings_p(v_object) " + v_object;
        return v_object.getField9();
    }

    public static SubLObject sme_lexwiz_arg_speech_parts(final SubLObject v_object) {
        assert NIL != sme_lexification_settings_p(v_object) : "sme_lexification_wizard.sme_lexification_settings_p(v_object) " + "CommonSymbols.NIL != sme_lexification_wizard.sme_lexification_settings_p(v_object) " + v_object;
        return v_object.getField10();
    }

    public static SubLObject sme_lexwiz_proper_sub_predicates(final SubLObject v_object) {
        assert NIL != sme_lexification_settings_p(v_object) : "sme_lexification_wizard.sme_lexification_settings_p(v_object) " + "CommonSymbols.NIL != sme_lexification_wizard.sme_lexification_settings_p(v_object) " + v_object;
        return v_object.getField11();
    }

    public static SubLObject _csetf_sme_lexwiz_is_abbreviationP(final SubLObject v_object, final SubLObject value) {
        assert NIL != sme_lexification_settings_p(v_object) : "sme_lexification_wizard.sme_lexification_settings_p(v_object) " + "CommonSymbols.NIL != sme_lexification_wizard.sme_lexification_settings_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sme_lexwiz_new_mappingP(final SubLObject v_object, final SubLObject value) {
        assert NIL != sme_lexification_settings_p(v_object) : "sme_lexification_wizard.sme_lexification_settings_p(v_object) " + "CommonSymbols.NIL != sme_lexification_wizard.sme_lexification_settings_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sme_lexwiz_okP(final SubLObject v_object, final SubLObject value) {
        assert NIL != sme_lexification_settings_p(v_object) : "sme_lexification_wizard.sme_lexification_settings_p(v_object) " + "CommonSymbols.NIL != sme_lexification_wizard.sme_lexification_settings_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sme_lexwiz_sample_sentence(final SubLObject v_object, final SubLObject value) {
        assert NIL != sme_lexification_settings_p(v_object) : "sme_lexification_wizard.sme_lexification_settings_p(v_object) " + "CommonSymbols.NIL != sme_lexification_wizard.sme_lexification_settings_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sme_lexwiz_sentence_words(final SubLObject v_object, final SubLObject value) {
        assert NIL != sme_lexification_settings_p(v_object) : "sme_lexification_wizard.sme_lexification_settings_p(v_object) " + "CommonSymbols.NIL != sme_lexification_wizard.sme_lexification_settings_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_sme_lexwiz_sentence_args(final SubLObject v_object, final SubLObject value) {
        assert NIL != sme_lexification_settings_p(v_object) : "sme_lexification_wizard.sme_lexification_settings_p(v_object) " + "CommonSymbols.NIL != sme_lexification_wizard.sme_lexification_settings_p(v_object) " + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_sme_lexwiz_arg_offsets(final SubLObject v_object, final SubLObject value) {
        assert NIL != sme_lexification_settings_p(v_object) : "sme_lexification_wizard.sme_lexification_settings_p(v_object) " + "CommonSymbols.NIL != sme_lexification_wizard.sme_lexification_settings_p(v_object) " + v_object;
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_sme_lexwiz_current_arg(final SubLObject v_object, final SubLObject value) {
        assert NIL != sme_lexification_settings_p(v_object) : "sme_lexification_wizard.sme_lexification_settings_p(v_object) " + "CommonSymbols.NIL != sme_lexification_wizard.sme_lexification_settings_p(v_object) " + v_object;
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_sme_lexwiz_arg_speech_parts(final SubLObject v_object, final SubLObject value) {
        assert NIL != sme_lexification_settings_p(v_object) : "sme_lexification_wizard.sme_lexification_settings_p(v_object) " + "CommonSymbols.NIL != sme_lexification_wizard.sme_lexification_settings_p(v_object) " + v_object;
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_sme_lexwiz_proper_sub_predicates(final SubLObject v_object, final SubLObject value) {
        assert NIL != sme_lexification_settings_p(v_object) : "sme_lexification_wizard.sme_lexification_settings_p(v_object) " + "CommonSymbols.NIL != sme_lexification_wizard.sme_lexification_settings_p(v_object) " + v_object;
        return v_object.setField11(value);
    }

    public static SubLObject make_sme_lexification_settings(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new sme_lexification_wizard.$sme_lexification_settings_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($kw47$IS_ABBREVIATION_)) {
                _csetf_sme_lexwiz_is_abbreviationP(v_new, current_value);
            } else
                if (pcase_var.eql($kw48$NEW_MAPPING_)) {
                    _csetf_sme_lexwiz_new_mappingP(v_new, current_value);
                } else
                    if (pcase_var.eql($OK_)) {
                        _csetf_sme_lexwiz_okP(v_new, current_value);
                    } else
                        if (pcase_var.eql($SAMPLE_SENTENCE)) {
                            _csetf_sme_lexwiz_sample_sentence(v_new, current_value);
                        } else
                            if (pcase_var.eql($SENTENCE_WORDS)) {
                                _csetf_sme_lexwiz_sentence_words(v_new, current_value);
                            } else
                                if (pcase_var.eql($SENTENCE_ARGS)) {
                                    _csetf_sme_lexwiz_sentence_args(v_new, current_value);
                                } else
                                    if (pcase_var.eql($ARG_OFFSETS)) {
                                        _csetf_sme_lexwiz_arg_offsets(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($CURRENT_ARG)) {
                                            _csetf_sme_lexwiz_current_arg(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($ARG_SPEECH_PARTS)) {
                                                _csetf_sme_lexwiz_arg_speech_parts(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($PROPER_SUB_PREDICATES)) {
                                                    _csetf_sme_lexwiz_proper_sub_predicates(v_new, current_value);
                                                } else {
                                                    Errors.error($str57$Invalid_slot__S_for_construction_, current_arg);
                                                }









        }
        return v_new;
    }

    public static SubLObject visit_defstruct_sme_lexification_settings(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SME_LEXIFICATION_SETTINGS, TEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $kw47$IS_ABBREVIATION_, sme_lexwiz_is_abbreviationP(obj));
        funcall(visitor_fn, obj, $SLOT, $kw48$NEW_MAPPING_, sme_lexwiz_new_mappingP(obj));
        funcall(visitor_fn, obj, $SLOT, $OK_, sme_lexwiz_okP(obj));
        funcall(visitor_fn, obj, $SLOT, $SAMPLE_SENTENCE, sme_lexwiz_sample_sentence(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCE_WORDS, sme_lexwiz_sentence_words(obj));
        funcall(visitor_fn, obj, $SLOT, $SENTENCE_ARGS, sme_lexwiz_sentence_args(obj));
        funcall(visitor_fn, obj, $SLOT, $ARG_OFFSETS, sme_lexwiz_arg_offsets(obj));
        funcall(visitor_fn, obj, $SLOT, $CURRENT_ARG, sme_lexwiz_current_arg(obj));
        funcall(visitor_fn, obj, $SLOT, $ARG_SPEECH_PARTS, sme_lexwiz_arg_speech_parts(obj));
        funcall(visitor_fn, obj, $SLOT, $PROPER_SUB_PREDICATES, sme_lexwiz_proper_sub_predicates(obj));
        funcall(visitor_fn, obj, $END, MAKE_SME_LEXIFICATION_SETTINGS, TEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_sme_lexification_settings_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_sme_lexification_settings(obj, visitor_fn);
    }

    public static SubLObject subloop_reserved_initialize_interface_proxy_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_interface_proxy_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        return NIL;
    }

    public static SubLObject interface_proxy_p(final SubLObject interface_proxy) {
        return classes.subloop_instanceof_class(interface_proxy, INTERFACE_PROXY);
    }

    public static SubLObject get_question_answering_agent_user_data(final SubLObject question_answering_agent) {
        return classes.subloop_get_access_protected_instance_slot(question_answering_agent, SEVENTEEN_INTEGER, USER_DATA);
    }

    public static SubLObject set_question_answering_agent_user_data(final SubLObject question_answering_agent, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(question_answering_agent, value, SEVENTEEN_INTEGER, USER_DATA);
    }

    public static SubLObject get_question_answering_agent_client_data(final SubLObject question_answering_agent) {
        return classes.subloop_get_access_protected_instance_slot(question_answering_agent, SIXTEEN_INTEGER, CLIENT_DATA);
    }

    public static SubLObject set_question_answering_agent_client_data(final SubLObject question_answering_agent, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(question_answering_agent, value, SIXTEEN_INTEGER, CLIENT_DATA);
    }

    public static SubLObject get_question_answering_agent_callback_function(final SubLObject question_answering_agent) {
        return classes.subloop_get_access_protected_instance_slot(question_answering_agent, FIFTEEN_INTEGER, CALLBACK_FUNCTION);
    }

    public static SubLObject set_question_answering_agent_callback_function(final SubLObject question_answering_agent, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(question_answering_agent, value, FIFTEEN_INTEGER, CALLBACK_FUNCTION);
    }

    public static SubLObject get_question_answering_agent_proxy(final SubLObject question_answering_agent) {
        return classes.subloop_get_access_protected_instance_slot(question_answering_agent, FOURTEEN_INTEGER, PROXY);
    }

    public static SubLObject set_question_answering_agent_proxy(final SubLObject question_answering_agent, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(question_answering_agent, value, FOURTEEN_INTEGER, PROXY);
    }

    public static SubLObject get_question_answering_agent_field_labels(final SubLObject question_answering_agent) {
        return classes.subloop_get_access_protected_instance_slot(question_answering_agent, THIRTEEN_INTEGER, FIELD_LABELS);
    }

    public static SubLObject set_question_answering_agent_field_labels(final SubLObject question_answering_agent, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(question_answering_agent, value, THIRTEEN_INTEGER, FIELD_LABELS);
    }

    public static SubLObject get_question_answering_agent_field_width(final SubLObject question_answering_agent) {
        return classes.subloop_get_access_protected_instance_slot(question_answering_agent, TWELVE_INTEGER, FIELD_WIDTH);
    }

    public static SubLObject set_question_answering_agent_field_width(final SubLObject question_answering_agent, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(question_answering_agent, value, TWELVE_INTEGER, FIELD_WIDTH);
    }

    public static SubLObject get_question_answering_agent_answer(final SubLObject question_answering_agent) {
        return classes.subloop_get_access_protected_instance_slot(question_answering_agent, ELEVEN_INTEGER, ANSWER);
    }

    public static SubLObject set_question_answering_agent_answer(final SubLObject question_answering_agent, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(question_answering_agent, value, ELEVEN_INTEGER, ANSWER);
    }

    public static SubLObject get_question_answering_agent_default(final SubLObject question_answering_agent) {
        return classes.subloop_get_access_protected_instance_slot(question_answering_agent, TEN_INTEGER, DEFAULT);
    }

    public static SubLObject set_question_answering_agent_default(final SubLObject question_answering_agent, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(question_answering_agent, value, TEN_INTEGER, DEFAULT);
    }

    public static SubLObject get_question_answering_agent_values(final SubLObject question_answering_agent) {
        return classes.subloop_get_access_protected_instance_slot(question_answering_agent, NINE_INTEGER, VALUES);
    }

    public static SubLObject set_question_answering_agent_values(final SubLObject question_answering_agent, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(question_answering_agent, value, NINE_INTEGER, VALUES);
    }

    public static SubLObject get_question_answering_agent_descriptions(final SubLObject question_answering_agent) {
        return classes.subloop_get_access_protected_instance_slot(question_answering_agent, EIGHT_INTEGER, DESCRIPTIONS);
    }

    public static SubLObject set_question_answering_agent_descriptions(final SubLObject question_answering_agent, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(question_answering_agent, value, EIGHT_INTEGER, DESCRIPTIONS);
    }

    public static SubLObject get_question_answering_agent_choices(final SubLObject question_answering_agent) {
        return classes.subloop_get_access_protected_instance_slot(question_answering_agent, SEVEN_INTEGER, CHOICES);
    }

    public static SubLObject set_question_answering_agent_choices(final SubLObject question_answering_agent, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(question_answering_agent, value, SEVEN_INTEGER, CHOICES);
    }

    public static SubLObject get_question_answering_agent_error_message(final SubLObject question_answering_agent) {
        return classes.subloop_get_access_protected_instance_slot(question_answering_agent, SIX_INTEGER, ERROR_MESSAGE);
    }

    public static SubLObject set_question_answering_agent_error_message(final SubLObject question_answering_agent, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(question_answering_agent, value, SIX_INTEGER, ERROR_MESSAGE);
    }

    public static SubLObject get_question_answering_agent_question_type(final SubLObject question_answering_agent) {
        return classes.subloop_get_access_protected_instance_slot(question_answering_agent, FIVE_INTEGER, QUESTION_TYPE);
    }

    public static SubLObject set_question_answering_agent_question_type(final SubLObject question_answering_agent, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(question_answering_agent, value, FIVE_INTEGER, QUESTION_TYPE);
    }

    public static SubLObject get_question_answering_agent_tip(final SubLObject question_answering_agent) {
        return classes.subloop_get_access_protected_instance_slot(question_answering_agent, FOUR_INTEGER, TIP);
    }

    public static SubLObject set_question_answering_agent_tip(final SubLObject question_answering_agent, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(question_answering_agent, value, FOUR_INTEGER, TIP);
    }

    public static SubLObject get_question_answering_agent_question(final SubLObject question_answering_agent) {
        return classes.subloop_get_access_protected_instance_slot(question_answering_agent, THREE_INTEGER, QUESTION);
    }

    public static SubLObject set_question_answering_agent_question(final SubLObject question_answering_agent, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(question_answering_agent, value, THREE_INTEGER, QUESTION);
    }

    public static SubLObject get_question_answering_agent_title(final SubLObject question_answering_agent) {
        return classes.subloop_get_access_protected_instance_slot(question_answering_agent, TWO_INTEGER, TITLE);
    }

    public static SubLObject set_question_answering_agent_title(final SubLObject question_answering_agent, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(question_answering_agent, value, TWO_INTEGER, TITLE);
    }

    public static SubLObject get_question_answering_agent_id(final SubLObject question_answering_agent) {
        return classes.subloop_get_access_protected_instance_slot(question_answering_agent, ONE_INTEGER, ID);
    }

    public static SubLObject set_question_answering_agent_id(final SubLObject question_answering_agent, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(question_answering_agent, value, ONE_INTEGER, ID);
    }

    public static SubLObject subloop_reserved_initialize_question_answering_agent_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_question_answering_agent_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, ID, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, TITLE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, QUESTION, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, TIP, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, QUESTION_TYPE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, ERROR_MESSAGE, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, CHOICES, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, DESCRIPTIONS, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, VALUES, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, DEFAULT, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, ANSWER, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, FIELD_WIDTH, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, FIELD_LABELS, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, PROXY, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, CALLBACK_FUNCTION, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, CLIENT_DATA, NIL);
        classes.subloop_initialize_slot(new_instance, QUESTION_ANSWERING_AGENT, USER_DATA, NIL);
        return NIL;
    }

    public static SubLObject question_answering_agent_p(final SubLObject question_answering_agent) {
        return classes.subloop_instanceof_class(question_answering_agent, QUESTION_ANSWERING_AGENT);
    }

    public static SubLObject get_sme_lexification_state_interlocutor_agent(final SubLObject sme_lexification_state) {
        return classes.subloop_get_access_protected_instance_slot(sme_lexification_state, SIX_INTEGER, INTERLOCUTOR_AGENT);
    }

    public static SubLObject set_sme_lexification_state_interlocutor_agent(final SubLObject sme_lexification_state, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sme_lexification_state, value, SIX_INTEGER, INTERLOCUTOR_AGENT);
    }

    public static SubLObject get_sme_lexification_state_lexwiz_settings(final SubLObject sme_lexification_state) {
        return classes.subloop_get_access_protected_instance_slot(sme_lexification_state, FIVE_INTEGER, LEXWIZ_SETTINGS);
    }

    public static SubLObject set_sme_lexification_state_lexwiz_settings(final SubLObject sme_lexification_state, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sme_lexification_state, value, FIVE_INTEGER, LEXWIZ_SETTINGS);
    }

    public static SubLObject get_sme_lexification_state_lexwiz_parameters(final SubLObject sme_lexification_state) {
        return classes.subloop_get_access_protected_instance_slot(sme_lexification_state, FOUR_INTEGER, LEXWIZ_PARAMETERS);
    }

    public static SubLObject set_sme_lexification_state_lexwiz_parameters(final SubLObject sme_lexification_state, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sme_lexification_state, value, FOUR_INTEGER, LEXWIZ_PARAMETERS);
    }

    public static SubLObject get_sme_lexification_state_next_states(final SubLObject sme_lexification_state) {
        return classes.subloop_get_access_protected_instance_slot(sme_lexification_state, THREE_INTEGER, NEXT_STATES);
    }

    public static SubLObject set_sme_lexification_state_next_states(final SubLObject sme_lexification_state, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sme_lexification_state, value, THREE_INTEGER, NEXT_STATES);
    }

    public static SubLObject get_sme_lexification_state_state(final SubLObject sme_lexification_state) {
        return classes.subloop_get_access_protected_instance_slot(sme_lexification_state, TWO_INTEGER, STATE);
    }

    public static SubLObject set_sme_lexification_state_state(final SubLObject sme_lexification_state, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sme_lexification_state, value, TWO_INTEGER, STATE);
    }

    public static SubLObject get_sme_lexification_state_id(final SubLObject sme_lexification_state) {
        return classes.subloop_get_access_protected_instance_slot(sme_lexification_state, ONE_INTEGER, ID);
    }

    public static SubLObject set_sme_lexification_state_id(final SubLObject sme_lexification_state, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sme_lexification_state, value, ONE_INTEGER, ID);
    }

    public static SubLObject subloop_reserved_initialize_sme_lexification_state_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_sme_lexification_state_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_STATE, ID, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_STATE, STATE, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_STATE, NEXT_STATES, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_STATE, LEXWIZ_PARAMETERS, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_STATE, LEXWIZ_SETTINGS, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_STATE, INTERLOCUTOR_AGENT, NIL);
        return NIL;
    }

    public static SubLObject sme_lexification_state_p(final SubLObject sme_lexification_state) {
        return classes.subloop_instanceof_class(sme_lexification_state, SME_LEXIFICATION_STATE);
    }

    public static SubLObject get_sme_lexification_interlocutor_user_data(final SubLObject sme_lexification_interlocutor) {
        return classes.subloop_get_access_protected_instance_slot(sme_lexification_interlocutor, EIGHT_INTEGER, USER_DATA);
    }

    public static SubLObject set_sme_lexification_interlocutor_user_data(final SubLObject sme_lexification_interlocutor, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sme_lexification_interlocutor, value, EIGHT_INTEGER, USER_DATA);
    }

    public static SubLObject get_sme_lexification_interlocutor_client_data(final SubLObject sme_lexification_interlocutor) {
        return classes.subloop_get_access_protected_instance_slot(sme_lexification_interlocutor, SEVEN_INTEGER, CLIENT_DATA);
    }

    public static SubLObject set_sme_lexification_interlocutor_client_data(final SubLObject sme_lexification_interlocutor, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sme_lexification_interlocutor, value, SEVEN_INTEGER, CLIENT_DATA);
    }

    public static SubLObject get_sme_lexification_interlocutor_callback_function(final SubLObject sme_lexification_interlocutor) {
        return classes.subloop_get_access_protected_instance_slot(sme_lexification_interlocutor, SIX_INTEGER, CALLBACK_FUNCTION);
    }

    public static SubLObject set_sme_lexification_interlocutor_callback_function(final SubLObject sme_lexification_interlocutor, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sme_lexification_interlocutor, value, SIX_INTEGER, CALLBACK_FUNCTION);
    }

    public static SubLObject get_sme_lexification_interlocutor_proxy(final SubLObject sme_lexification_interlocutor) {
        return classes.subloop_get_access_protected_instance_slot(sme_lexification_interlocutor, FIVE_INTEGER, PROXY);
    }

    public static SubLObject set_sme_lexification_interlocutor_proxy(final SubLObject sme_lexification_interlocutor, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sme_lexification_interlocutor, value, FIVE_INTEGER, PROXY);
    }

    public static SubLObject get_sme_lexification_interlocutor_sme_state(final SubLObject sme_lexification_interlocutor) {
        return classes.subloop_get_access_protected_instance_slot(sme_lexification_interlocutor, FOUR_INTEGER, SME_STATE);
    }

    public static SubLObject set_sme_lexification_interlocutor_sme_state(final SubLObject sme_lexification_interlocutor, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sme_lexification_interlocutor, value, FOUR_INTEGER, SME_STATE);
    }

    public static SubLObject get_sme_lexification_interlocutor_lexwiz_settings(final SubLObject sme_lexification_interlocutor) {
        return classes.subloop_get_access_protected_instance_slot(sme_lexification_interlocutor, THREE_INTEGER, LEXWIZ_SETTINGS);
    }

    public static SubLObject set_sme_lexification_interlocutor_lexwiz_settings(final SubLObject sme_lexification_interlocutor, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sme_lexification_interlocutor, value, THREE_INTEGER, LEXWIZ_SETTINGS);
    }

    public static SubLObject get_sme_lexification_interlocutor_lexwiz_parameters(final SubLObject sme_lexification_interlocutor) {
        return classes.subloop_get_access_protected_instance_slot(sme_lexification_interlocutor, TWO_INTEGER, LEXWIZ_PARAMETERS);
    }

    public static SubLObject set_sme_lexification_interlocutor_lexwiz_parameters(final SubLObject sme_lexification_interlocutor, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sme_lexification_interlocutor, value, TWO_INTEGER, LEXWIZ_PARAMETERS);
    }

    public static SubLObject get_sme_lexification_interlocutor_previous_id(final SubLObject sme_lexification_interlocutor) {
        return classes.subloop_get_access_protected_instance_slot(sme_lexification_interlocutor, ONE_INTEGER, PREVIOUS_ID);
    }

    public static SubLObject set_sme_lexification_interlocutor_previous_id(final SubLObject sme_lexification_interlocutor, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sme_lexification_interlocutor, value, ONE_INTEGER, PREVIOUS_ID);
    }

    public static SubLObject subloop_reserved_initialize_sme_lexification_interlocutor_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_sme_lexification_interlocutor_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, PREVIOUS_ID, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, LEXWIZ_PARAMETERS, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, LEXWIZ_SETTINGS, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, SME_STATE, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, PROXY, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, CALLBACK_FUNCTION, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, CLIENT_DATA, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, USER_DATA, NIL);
        return NIL;
    }

    public static SubLObject sme_lexification_interlocutor_p(final SubLObject sme_lexification_interlocutor) {
        return classes.subloop_instanceof_class(sme_lexification_interlocutor, SME_LEXIFICATION_INTERLOCUTOR);
    }

    public static SubLObject subloop_reserved_initialize_sme_li_pre_general_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_sme_li_pre_general_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, PREVIOUS_ID, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, LEXWIZ_PARAMETERS, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, LEXWIZ_SETTINGS, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, SME_STATE, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, PROXY, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, CALLBACK_FUNCTION, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, CLIENT_DATA, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, USER_DATA, NIL);
        return NIL;
    }

    public static SubLObject sme_li_pre_general_p(final SubLObject sme_li_pre_general) {
        return classes.subloop_instanceof_class(sme_li_pre_general, SME_LI_PRE_GENERAL);
    }

    public static SubLObject subloop_reserved_initialize_sme_li_proper_name_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_sme_li_proper_name_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, PREVIOUS_ID, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, LEXWIZ_PARAMETERS, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, LEXWIZ_SETTINGS, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, SME_STATE, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, PROXY, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, CALLBACK_FUNCTION, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, CLIENT_DATA, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, USER_DATA, NIL);
        return NIL;
    }

    public static SubLObject sme_li_proper_name_p(final SubLObject sme_li_proper_name) {
        return classes.subloop_instanceof_class(sme_li_proper_name, SME_LI_PROPER_NAME);
    }

    public static SubLObject subloop_reserved_initialize_sme_li_denotational_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_sme_li_denotational_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, PREVIOUS_ID, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, LEXWIZ_PARAMETERS, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, LEXWIZ_SETTINGS, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, SME_STATE, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, PROXY, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, CALLBACK_FUNCTION, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, CLIENT_DATA, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, USER_DATA, NIL);
        return NIL;
    }

    public static SubLObject sme_li_denotational_p(final SubLObject sme_li_denotational) {
        return classes.subloop_instanceof_class(sme_li_denotational, SME_LI_DENOTATIONAL);
    }

    public static SubLObject subloop_reserved_initialize_sme_li_relational_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_sme_li_relational_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, PREVIOUS_ID, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, LEXWIZ_PARAMETERS, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, LEXWIZ_SETTINGS, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, SME_STATE, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, PROXY, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, CALLBACK_FUNCTION, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, CLIENT_DATA, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, USER_DATA, NIL);
        return NIL;
    }

    public static SubLObject sme_li_relational_p(final SubLObject sme_li_relational) {
        return classes.subloop_instanceof_class(sme_li_relational, SME_LI_RELATIONAL);
    }

    public static SubLObject subloop_reserved_initialize_sme_li_post_general_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_sme_li_post_general_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, PREVIOUS_ID, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, LEXWIZ_PARAMETERS, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, LEXWIZ_SETTINGS, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, SME_STATE, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, PROXY, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, CALLBACK_FUNCTION, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, CLIENT_DATA, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_INTERLOCUTOR, USER_DATA, NIL);
        return NIL;
    }

    public static SubLObject sme_li_post_general_p(final SubLObject sme_li_post_general) {
        return classes.subloop_instanceof_class(sme_li_post_general, SME_LI_POST_GENERAL);
    }

    public static SubLObject get_sme_lexification_wizard_question_answering_agent_class(final SubLObject v_sme_lexification_wizard) {
        return classes.subloop_get_access_protected_instance_slot(v_sme_lexification_wizard, SEVEN_INTEGER, QUESTION_ANSWERING_AGENT_CLASS);
    }

    public static SubLObject set_sme_lexification_wizard_question_answering_agent_class(final SubLObject v_sme_lexification_wizard, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_sme_lexification_wizard, value, SEVEN_INTEGER, QUESTION_ANSWERING_AGENT_CLASS);
    }

    public static SubLObject get_sme_lexification_wizard_proxy(final SubLObject v_sme_lexification_wizard) {
        return classes.subloop_get_access_protected_instance_slot(v_sme_lexification_wizard, SIX_INTEGER, PROXY);
    }

    public static SubLObject set_sme_lexification_wizard_proxy(final SubLObject v_sme_lexification_wizard, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_sme_lexification_wizard, value, SIX_INTEGER, PROXY);
    }

    public static SubLObject get_sme_lexification_wizard_new_current_interaction(final SubLObject v_sme_lexification_wizard) {
        return classes.subloop_get_access_protected_instance_slot(v_sme_lexification_wizard, FIVE_INTEGER, NEW_CURRENT_INTERACTION);
    }

    public static SubLObject set_sme_lexification_wizard_new_current_interaction(final SubLObject v_sme_lexification_wizard, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_sme_lexification_wizard, value, FIVE_INTEGER, NEW_CURRENT_INTERACTION);
    }

    public static SubLObject get_sme_lexification_wizard_current_interaction(final SubLObject v_sme_lexification_wizard) {
        return classes.subloop_get_access_protected_instance_slot(v_sme_lexification_wizard, FOUR_INTEGER, CURRENT_INTERACTION);
    }

    public static SubLObject set_sme_lexification_wizard_current_interaction(final SubLObject v_sme_lexification_wizard, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_sme_lexification_wizard, value, FOUR_INTEGER, CURRENT_INTERACTION);
    }

    public static SubLObject get_sme_lexification_wizard_lexwiz_parameters(final SubLObject v_sme_lexification_wizard) {
        return classes.subloop_get_access_protected_instance_slot(v_sme_lexification_wizard, THREE_INTEGER, LEXWIZ_PARAMETERS);
    }

    public static SubLObject set_sme_lexification_wizard_lexwiz_parameters(final SubLObject v_sme_lexification_wizard, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_sme_lexification_wizard, value, THREE_INTEGER, LEXWIZ_PARAMETERS);
    }

    public static SubLObject get_sme_lexification_wizard_next_states(final SubLObject v_sme_lexification_wizard) {
        return classes.subloop_get_access_protected_instance_slot(v_sme_lexification_wizard, TWO_INTEGER, NEXT_STATES);
    }

    public static SubLObject set_sme_lexification_wizard_next_states(final SubLObject v_sme_lexification_wizard, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_sme_lexification_wizard, value, TWO_INTEGER, NEXT_STATES);
    }

    public static SubLObject get_sme_lexification_wizard_state(final SubLObject v_sme_lexification_wizard) {
        return classes.subloop_get_access_protected_instance_slot(v_sme_lexification_wizard, ONE_INTEGER, STATE);
    }

    public static SubLObject set_sme_lexification_wizard_state(final SubLObject v_sme_lexification_wizard, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_sme_lexification_wizard, value, ONE_INTEGER, STATE);
    }

    public static SubLObject subloop_reserved_initialize_sme_lexification_wizard_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_sme_lexification_wizard_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, STATE, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, NEXT_STATES, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, LEXWIZ_PARAMETERS, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, CURRENT_INTERACTION, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, NEW_CURRENT_INTERACTION, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, PROXY, NIL);
        classes.subloop_initialize_slot(new_instance, SME_LEXIFICATION_WIZARD, QUESTION_ANSWERING_AGENT_CLASS, NIL);
        return NIL;
    }

    public static SubLObject sme_lexification_wizard_p(final SubLObject v_sme_lexification_wizard) {
        return classes.subloop_instanceof_class(v_sme_lexification_wizard, SME_LEXIFICATION_WIZARD);
    }

    public static SubLObject question_answering_agent_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_question_answering_agent_method = NIL;
        SubLObject user_data = get_question_answering_agent_user_data(self);
        SubLObject client_data = get_question_answering_agent_client_data(self);
        SubLObject callback_function = get_question_answering_agent_callback_function(self);
        SubLObject field_labels = get_question_answering_agent_field_labels(self);
        SubLObject field_width = get_question_answering_agent_field_width(self);
        SubLObject v_answer = get_question_answering_agent_answer(self);
        SubLObject values = get_question_answering_agent_values(self);
        SubLObject descriptions = get_question_answering_agent_descriptions(self);
        SubLObject choices = get_question_answering_agent_choices(self);
        SubLObject error_message = get_question_answering_agent_error_message(self);
        SubLObject question_type = get_question_answering_agent_question_type(self);
        SubLObject tip = get_question_answering_agent_tip(self);
        SubLObject v_question = get_question_answering_agent_question(self);
        SubLObject title = get_question_answering_agent_title(self);
        try {
            thread.throwStack.push($sym137$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD);
            try {
                object.object_initialize_method(self);
                title = NIL;
                v_question = NIL;
                tip = NIL;
                question_type = NIL;
                error_message = NIL;
                choices = NIL;
                descriptions = NIL;
                values = NIL;
                v_answer = NIL;
                field_width = NIL;
                field_labels = NIL;
                callback_function = NIL;
                user_data = NIL;
                client_data = NIL;
                sublisp_throw($sym137$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_question_answering_agent_user_data(self, user_data);
                    set_question_answering_agent_client_data(self, client_data);
                    set_question_answering_agent_callback_function(self, callback_function);
                    set_question_answering_agent_field_labels(self, field_labels);
                    set_question_answering_agent_field_width(self, field_width);
                    set_question_answering_agent_answer(self, v_answer);
                    set_question_answering_agent_values(self, values);
                    set_question_answering_agent_descriptions(self, descriptions);
                    set_question_answering_agent_choices(self, choices);
                    set_question_answering_agent_error_message(self, error_message);
                    set_question_answering_agent_question_type(self, question_type);
                    set_question_answering_agent_tip(self, tip);
                    set_question_answering_agent_question(self, v_question);
                    set_question_answering_agent_title(self, title);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_question_answering_agent_method = Errors.handleThrowable(ccatch_env_var, $sym137$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_question_answering_agent_method;
    }

    public static SubLObject question_answering_agent_set_question_method(final SubLObject self, final SubLObject new_question, SubLObject new_title, SubLObject new_type, SubLObject new_choices) {
        if (new_title == UNPROVIDED) {
            new_title = $sme_lexwiz_title$.getGlobalValue();
        }
        if (new_type == UNPROVIDED) {
            new_type = $BOOLEAN;
        }
        if (new_choices == UNPROVIDED) {
            new_choices = $list144;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_question_answering_agent_method = NIL;
        SubLObject v_answer = get_question_answering_agent_answer(self);
        SubLObject v_default = get_question_answering_agent_default(self);
        SubLObject choices = get_question_answering_agent_choices(self);
        SubLObject error_message = get_question_answering_agent_error_message(self);
        SubLObject question_type = get_question_answering_agent_question_type(self);
        SubLObject v_question = get_question_answering_agent_question(self);
        SubLObject title = get_question_answering_agent_title(self);
        try {
            thread.throwStack.push($sym145$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD);
            try {
                v_question = new_question;
                title = new_title;
                question_type = new_type;
                choices = new_choices;
                v_answer = NIL;
                error_message = NIL;
                v_default = NIL;
                sublisp_throw($sym145$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_question_answering_agent_answer(self, v_answer);
                    set_question_answering_agent_default(self, v_default);
                    set_question_answering_agent_choices(self, choices);
                    set_question_answering_agent_error_message(self, error_message);
                    set_question_answering_agent_question_type(self, question_type);
                    set_question_answering_agent_question(self, v_question);
                    set_question_answering_agent_title(self, title);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_question_answering_agent_method = Errors.handleThrowable(ccatch_env_var, $sym145$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_question_answering_agent_method;
    }

    public static SubLObject question_answering_agent_display_question_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str149$Warning__, $str150$question_answering_agent__display), self);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static SubLObject question_answering_agent_get_response_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_question_answering_agent_method = NIL;
        final SubLObject v_answer = get_question_answering_agent_answer(self);
        try {
            thread.throwStack.push($sym154$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD);
            try {
                sublisp_throw($sym154$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD, v_answer);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_question_answering_agent_answer(self, v_answer);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_question_answering_agent_method = Errors.handleThrowable(ccatch_env_var, $sym154$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_question_answering_agent_method;
    }

    public static SubLObject question_answering_agent_validate_response_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = get_question_answering_agent_answer(self);
        final SubLObject values = get_question_answering_agent_values(self);
        final SubLObject choices = get_question_answering_agent_choices(self);
        final SubLObject question_type = get_question_answering_agent_question_type(self);
        final SubLObject possible_answers = (NIL != values) ? values : choices;
        SubLObject valid = NIL;
        lex_describe_instance(lexification_utilities.$lex_very_verbose$.getGlobalValue(), self);
        if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str159$answer__s__, v_answer);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(lexification_utilities.$lex_very_detailed$.getGlobalValue())) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str160$choices__s__, choices);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(lexification_utilities.$lex_very_detailed$.getGlobalValue())) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str161$values__s__, values);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        final SubLObject pcase_var = question_type;
        if (pcase_var.eql($BOOLEAN)) {
            if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(lexification_utilities.$lex_very_detailed$.getGlobalValue())) {
                format(StreamsLow.$trace_output$.getDynamicValue(thread), $str162$pos__a__neg__a__, question_answering_agent_positive_choice_method(self), question_answering_agent_negative_choice_method(self));
                force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
            }
            if (v_answer.equalp(question_answering_agent_positive_choice_method(self)) || v_answer.equalp(question_answering_agent_negative_choice_method(self))) {
                valid = T;
                v_answer = equalp(v_answer, question_answering_agent_positive_choice_method(self));
                set_question_answering_agent_answer(self, v_answer);
            }
        } else
            if (pcase_var.eql($ENUMERATED)) {
                if (v_answer.isList()) {
                    v_answer = v_answer.first();
                    set_question_answering_agent_answer(self, v_answer);
                }
                valid = member(v_answer, possible_answers, symbol_function(EQUALP), UNPROVIDED);
                if (((NIL == valid) && v_answer.isString()) && (NIL != string_utilities.is_numericP(v_answer))) {
                    final SubLObject position = parse_integer(v_answer, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (position.numGE(ZERO_INTEGER) && position.numL(length(possible_answers))) {
                        v_answer = elt(possible_answers, position);
                        set_question_answering_agent_answer(self, v_answer);
                        valid = T;
                    }
                }
            } else
                if (pcase_var.eql($MULTIPLE_SELECTION)) {
                    if (v_answer.isString() && (NIL == string_utilities.is_numericP(v_answer))) {
                        v_answer = lexification_utilities.lex_string_tokenize(v_answer, T);
                        set_question_answering_agent_answer(self, v_answer);
                    }
                    if (v_answer.isList()) {
                        valid = search(v_answer, possible_answers, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    if ((NIL == valid) && v_answer.isString()) {
                        SubLObject new_answer = NIL;
                        SubLObject invalid = NIL;
                        SubLObject cdolist_list_var = string_utilities.parse_numeric_range(v_answer);
                        SubLObject position2 = NIL;
                        position2 = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (position2.numGE(ZERO_INTEGER) && position2.numL(length(possible_answers))) {
                                new_answer = cons(elt(possible_answers, position2), new_answer);
                            } else {
                                invalid = T;
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            position2 = cdolist_list_var.first();
                        } 
                        valid = makeBoolean((NIL != new_answer) && (NIL == invalid));
                        v_answer = new_answer;
                        set_question_answering_agent_answer(self, v_answer);
                    }
                } else
                    if (pcase_var.eql($FREE_FORM)) {
                        valid = string_utilities.non_empty_stringP(string_utilities.trim_whitespace(v_answer));
                    } else
                        if (pcase_var.eql($MULTIPLE_FREE_FORM)) {
                            valid = T;
                            if (NIL == valid) {
                                SubLObject csome_list_var;
                                SubLObject sub_answer;
                                for (csome_list_var = v_answer, sub_answer = NIL, sub_answer = csome_list_var.first(); (NIL == valid) && (NIL != csome_list_var); valid = string_utilities.non_empty_stringP(string_utilities.trim_whitespace(sub_answer)) , csome_list_var = csome_list_var.rest() , sub_answer = csome_list_var.first()) {
                                }
                            }
                        } else
                            if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                                format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str149$Warning__, $str167$Unknown_question_type___a__), question_type);
                                force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                            }





        if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str168$validated_answer__s__, v_answer);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        methods.funcall_instance_method_with_1_args(self, NOTIFY_CLIENT, $INPUT_VALIDATED);
        return valid;
    }

    public static SubLObject question_answering_agent_set_callback_function_method(final SubLObject self, final SubLObject new_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_question_answering_agent_method = NIL;
        SubLObject callback_function = get_question_answering_agent_callback_function(self);
        try {
            thread.throwStack.push($sym175$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD);
            try {
                callback_function = new_function;
                sublisp_throw($sym175$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_question_answering_agent_callback_function(self, callback_function);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_question_answering_agent_method = Errors.handleThrowable(ccatch_env_var, $sym175$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_question_answering_agent_method;
    }

    public static SubLObject question_answering_agent_set_client_data_method(final SubLObject self, final SubLObject callback_data) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_question_answering_agent_method = NIL;
        SubLObject client_data = get_question_answering_agent_client_data(self);
        try {
            thread.throwStack.push($sym180$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD);
            try {
                client_data = callback_data;
                sublisp_throw($sym180$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_question_answering_agent_client_data(self, client_data);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_question_answering_agent_method = Errors.handleThrowable(ccatch_env_var, $sym180$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_question_answering_agent_method;
    }

    public static SubLObject question_answering_agent_set_user_data_method(final SubLObject self, final SubLObject new_user_data) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_question_answering_agent_method = NIL;
        SubLObject user_data = get_question_answering_agent_user_data(self);
        try {
            thread.throwStack.push($sym185$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD);
            try {
                user_data = new_user_data;
                sublisp_throw($sym185$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_question_answering_agent_user_data(self, user_data);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_question_answering_agent_method = Errors.handleThrowable(ccatch_env_var, $sym185$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_question_answering_agent_method;
    }

    public static SubLObject question_answering_agent_set_proxy_method(final SubLObject self, final SubLObject new_proxy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_question_answering_agent_method = NIL;
        SubLObject proxy = get_question_answering_agent_proxy(self);
        try {
            thread.throwStack.push($sym190$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD);
            try {
                proxy = new_proxy;
                sublisp_throw($sym190$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_question_answering_agent_proxy(self, proxy);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_question_answering_agent_method = Errors.handleThrowable(ccatch_env_var, $sym190$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_question_answering_agent_method;
    }

    public static SubLObject question_answering_agent_notify_client_method(final SubLObject self, final SubLObject status) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_question_answering_agent_method = NIL;
        final SubLObject user_data = get_question_answering_agent_user_data(self);
        final SubLObject client_data = get_question_answering_agent_client_data(self);
        final SubLObject callback_function = get_question_answering_agent_callback_function(self);
        try {
            thread.throwStack.push($sym194$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD);
            try {
                if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(lexification_utilities.$lex_very_detailed$.getGlobalValue())) {
                    format(StreamsLow.$trace_output$.getDynamicValue(thread), $str195$callback_function__a__client_data, new SubLObject[]{ callback_function, client_data, user_data });
                    force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                }
                if (NIL != callback_function) {
                    funcall(callback_function, client_data, status, self, user_data);
                }
                sublisp_throw($sym194$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_question_answering_agent_user_data(self, user_data);
                    set_question_answering_agent_client_data(self, client_data);
                    set_question_answering_agent_callback_function(self, callback_function);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_question_answering_agent_method = Errors.handleThrowable(ccatch_env_var, $sym194$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_question_answering_agent_method;
    }

    public static SubLObject question_answering_agent_positive_choice_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_question_answering_agent_method = NIL;
        final SubLObject choices = get_question_answering_agent_choices(self);
        try {
            thread.throwStack.push($sym199$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD);
            try {
                sublisp_throw($sym199$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD, choices.first());
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_question_answering_agent_choices(self, choices);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_question_answering_agent_method = Errors.handleThrowable(ccatch_env_var, $sym199$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_question_answering_agent_method;
    }

    public static SubLObject question_answering_agent_negative_choice_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_question_answering_agent_method = NIL;
        final SubLObject choices = get_question_answering_agent_choices(self);
        try {
            thread.throwStack.push($sym203$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD);
            try {
                sublisp_throw($sym203$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD, second(choices));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_question_answering_agent_choices(self, choices);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_question_answering_agent_method = Errors.handleThrowable(ccatch_env_var, $sym203$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_question_answering_agent_method;
    }

    public static SubLObject question_answering_agent_copy_method(final SubLObject self, final SubLObject other) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_question_answering_agent_method = NIL;
        SubLObject user_data = get_question_answering_agent_user_data(self);
        SubLObject client_data = get_question_answering_agent_client_data(self);
        SubLObject callback_function = get_question_answering_agent_callback_function(self);
        SubLObject proxy = get_question_answering_agent_proxy(self);
        SubLObject field_labels = get_question_answering_agent_field_labels(self);
        SubLObject field_width = get_question_answering_agent_field_width(self);
        SubLObject v_answer = get_question_answering_agent_answer(self);
        SubLObject v_default = get_question_answering_agent_default(self);
        SubLObject values = get_question_answering_agent_values(self);
        SubLObject descriptions = get_question_answering_agent_descriptions(self);
        SubLObject choices = get_question_answering_agent_choices(self);
        SubLObject error_message = get_question_answering_agent_error_message(self);
        SubLObject question_type = get_question_answering_agent_question_type(self);
        SubLObject tip = get_question_answering_agent_tip(self);
        SubLObject v_question = get_question_answering_agent_question(self);
        SubLObject title = get_question_answering_agent_title(self);
        SubLObject id = get_question_answering_agent_id(self);
        try {
            thread.throwStack.push($sym208$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD);
            try {
                id = instances.get_slot(other, ID);
                title = instances.get_slot(other, TITLE);
                v_question = instances.get_slot(other, QUESTION);
                tip = instances.get_slot(other, TIP);
                question_type = instances.get_slot(other, QUESTION_TYPE);
                error_message = instances.get_slot(other, ERROR_MESSAGE);
                choices = copy_list(instances.get_slot(other, CHOICES));
                descriptions = copy_list(instances.get_slot(other, DESCRIPTIONS));
                values = copy_list(instances.get_slot(other, VALUES));
                v_default = instances.get_slot(other, DEFAULT);
                v_answer = instances.get_slot(other, ANSWER);
                field_width = instances.get_slot(other, FIELD_WIDTH);
                field_labels = instances.get_slot(other, FIELD_LABELS);
                proxy = instances.get_slot(other, PROXY);
                callback_function = instances.get_slot(other, CALLBACK_FUNCTION);
                client_data = instances.get_slot(other, CLIENT_DATA);
                user_data = instances.get_slot(other, USER_DATA);
                sublisp_throw($sym208$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_question_answering_agent_user_data(self, user_data);
                    set_question_answering_agent_client_data(self, client_data);
                    set_question_answering_agent_callback_function(self, callback_function);
                    set_question_answering_agent_proxy(self, proxy);
                    set_question_answering_agent_field_labels(self, field_labels);
                    set_question_answering_agent_field_width(self, field_width);
                    set_question_answering_agent_answer(self, v_answer);
                    set_question_answering_agent_default(self, v_default);
                    set_question_answering_agent_values(self, values);
                    set_question_answering_agent_descriptions(self, descriptions);
                    set_question_answering_agent_choices(self, choices);
                    set_question_answering_agent_error_message(self, error_message);
                    set_question_answering_agent_question_type(self, question_type);
                    set_question_answering_agent_tip(self, tip);
                    set_question_answering_agent_question(self, v_question);
                    set_question_answering_agent_title(self, title);
                    set_question_answering_agent_id(self, id);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_question_answering_agent_method = Errors.handleThrowable(ccatch_env_var, $sym208$OUTER_CATCH_FOR_QUESTION_ANSWERING_AGENT_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_question_answering_agent_method;
    }

    public static SubLObject question_answering_agent_new_copy_method(final SubLObject self, final SubLObject other) {
        final SubLObject new_object = methods.funcall_class_method_with_0_args(other, NEW);
        methods.funcall_instance_method_with_1_args(new_object, COPY, other);
        return new_object;
    }

    public static SubLObject interface_proxy_initialize_method(final SubLObject self) {
        object.object_initialize_method(self);
        return self;
    }

    public static SubLObject interface_proxy_init_session_method(final SubLObject self) {
        return NIL;
    }

    public static SubLObject interface_proxy_end_session_method(final SubLObject self) {
        cb_sme_lexification_wizard.cb_invoke_sme_lexification_wizard(UNPROVIDED);
        return NIL;
    }

    public static SubLObject interface_proxy_create_constant_method(final SubLObject self, final SubLObject constant_name) {
        return ke.ke_create_now(constant_name, UNPROVIDED);
    }

    public static SubLObject interface_proxy_describe_term_method(final SubLObject self, final SubLObject v_term) {
        return pph_main.generate_phrase(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject interface_proxy_resolve_term_method(final SubLObject self, final SubLObject term_label) {
        final SubLObject term_denots = lexicon_accessors.all_denots_of_string(term_label, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject term_descriptions = Mapping.mapcar(symbol_function(LEX_DESCRIBE_TERM), term_denots);
        return Mapping.mapcar(symbol_function(LIST), term_denots, new SubLObject[]{ term_descriptions });
    }

    public static SubLObject interface_proxy_mumble_method(final SubLObject self, final SubLObject message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(StreamsLow.$trace_output$.getDynamicValue(thread), $str239$__mumbling___a__, message);
        return T;
    }

    public static SubLObject interface_proxy_forge_aheadP_method(final SubLObject self) {
        return $sme_forge_aheadP$.getGlobalValue();
    }

    public static SubLObject new_sme_lexification_id() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject id = lexification_wizard.new_lexification_id();
        if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(lexification_utilities.$lex_verbose$.getGlobalValue())) {
            $next_sme_lexification_id$.setGlobalValue(add($next_sme_lexification_id$.getGlobalValue(), ONE_INTEGER));
            id = string_utilities.to_string($next_sme_lexification_id$.getGlobalValue());
        }
        return id;
    }

    public static SubLObject sme_lexification_state_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_state_method = NIL;
        SubLObject interlocutor_agent = get_sme_lexification_state_interlocutor_agent(self);
        SubLObject lexwiz_settings = get_sme_lexification_state_lexwiz_settings(self);
        SubLObject lexwiz_parameters = get_sme_lexification_state_lexwiz_parameters(self);
        SubLObject next_states = get_sme_lexification_state_next_states(self);
        SubLObject state = get_sme_lexification_state_state(self);
        SubLObject id = get_sme_lexification_state_id(self);
        try {
            thread.throwStack.push($sym245$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD);
            try {
                object.object_initialize_method(self);
                id = new_sme_lexification_id();
                state = NIL;
                next_states = NIL;
                lexwiz_parameters = lexification_wizard.make_lexification_parameters(UNPROVIDED);
                lexwiz_settings = make_sme_lexification_settings(UNPROVIDED);
                interlocutor_agent = methods.funcall_class_method_with_0_args(QUESTION_ANSWERING_AGENT, NEW);
                sublisp_throw($sym245$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_state_interlocutor_agent(self, interlocutor_agent);
                    set_sme_lexification_state_lexwiz_settings(self, lexwiz_settings);
                    set_sme_lexification_state_lexwiz_parameters(self, lexwiz_parameters);
                    set_sme_lexification_state_next_states(self, next_states);
                    set_sme_lexification_state_state(self, state);
                    set_sme_lexification_state_id(self, id);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_state_method = Errors.handleThrowable(ccatch_env_var, $sym245$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_state_method;
    }

    public static SubLObject sme_lexification_state_copy_method(final SubLObject self, final SubLObject other) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_state_method = NIL;
        SubLObject interlocutor_agent = get_sme_lexification_state_interlocutor_agent(self);
        SubLObject lexwiz_settings = get_sme_lexification_state_lexwiz_settings(self);
        SubLObject lexwiz_parameters = get_sme_lexification_state_lexwiz_parameters(self);
        SubLObject next_states = get_sme_lexification_state_next_states(self);
        SubLObject state = get_sme_lexification_state_state(self);
        try {
            thread.throwStack.push($sym248$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD);
            try {
                state = instances.get_slot(other, STATE);
                next_states = copy_list(instances.get_slot(other, NEXT_STATES));
                lexwiz_parameters = lexification_wizard.copy_lexification_parameters(instances.get_slot(other, LEXWIZ_PARAMETERS));
                lexwiz_settings = copy_sme_lexification_settings(instances.get_slot(other, LEXWIZ_SETTINGS));
                interlocutor_agent = methods.funcall_instance_method_with_1_args(interlocutor_agent, NEW_COPY, instances.get_slot(other, INTERLOCUTOR_AGENT));
                sublisp_throw($sym248$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_state_interlocutor_agent(self, interlocutor_agent);
                    set_sme_lexification_state_lexwiz_settings(self, lexwiz_settings);
                    set_sme_lexification_state_lexwiz_parameters(self, lexwiz_parameters);
                    set_sme_lexification_state_next_states(self, next_states);
                    set_sme_lexification_state_state(self, state);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_state_method = Errors.handleThrowable(ccatch_env_var, $sym248$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_state_method;
    }

    public static SubLObject sme_lexification_state_get_id_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_state_method = NIL;
        final SubLObject id = get_sme_lexification_state_id(self);
        try {
            thread.throwStack.push($sym252$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD);
            try {
                sublisp_throw($sym252$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD, id);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_state_id(self, id);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_state_method = Errors.handleThrowable(ccatch_env_var, $sym252$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_state_method;
    }

    public static SubLObject sme_lexification_state_set_states_method(final SubLObject self, final SubLObject state_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_state_method = NIL;
        SubLObject next_states = get_sme_lexification_state_next_states(self);
        try {
            thread.throwStack.push($sym257$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD);
            try {
                next_states = state_list;
                sublisp_throw($sym257$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_state_next_states(self, next_states);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_state_method = Errors.handleThrowable(ccatch_env_var, $sym257$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_state_method;
    }

    public static SubLObject sme_lexification_state_get_states_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_state_method = NIL;
        final SubLObject next_states = get_sme_lexification_state_next_states(self);
        try {
            thread.throwStack.push($sym261$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD);
            try {
                sublisp_throw($sym261$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD, next_states);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_state_next_states(self, next_states);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_state_method = Errors.handleThrowable(ccatch_env_var, $sym261$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_state_method;
    }

    public static SubLObject sme_lexification_state_current_state_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_state_method = NIL;
        final SubLObject state = get_sme_lexification_state_state(self);
        try {
            thread.throwStack.push($sym265$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD);
            try {
                sublisp_throw($sym265$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD, state);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_state_state(self, state);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_state_method = Errors.handleThrowable(ccatch_env_var, $sym265$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_state_method;
    }

    public static SubLObject sme_lexification_state_current_settings_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_state_method = NIL;
        final SubLObject lexwiz_parameters = get_sme_lexification_state_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym269$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD);
            try {
                sublisp_throw($sym269$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD, lexwiz_parameters);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_state_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_state_method = Errors.handleThrowable(ccatch_env_var, $sym269$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_state_method;
    }

    public static SubLObject sme_lexification_state_advance_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_state_method = NIL;
        SubLObject next_states = get_sme_lexification_state_next_states(self);
        SubLObject state = get_sme_lexification_state_state(self);
        try {
            thread.throwStack.push($sym273$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD);
            try {
                state = next_states.first();
                next_states = next_states.rest();
                sublisp_throw($sym273$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD, state);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_state_next_states(self, next_states);
                    set_sme_lexification_state_state(self, state);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_state_method = Errors.handleThrowable(ccatch_env_var, $sym273$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_state_method;
    }

    public static SubLObject sme_lexification_state_new_copy_method(final SubLObject self, final SubLObject other) {
        final SubLObject new_state = methods.funcall_class_method_with_0_args(SME_LEXIFICATION_STATE, NEW);
        methods.funcall_instance_method_with_1_args(new_state, COPY, other);
        return new_state;
    }

    public static SubLObject sme_lexification_state_list_values_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_state_method = NIL;
        final SubLObject lexwiz_settings = get_sme_lexification_state_lexwiz_settings(self);
        final SubLObject lexwiz_parameters = get_sme_lexification_state_lexwiz_parameters(self);
        final SubLObject next_states = get_sme_lexification_state_next_states(self);
        final SubLObject state = get_sme_lexification_state_state(self);
        final SubLObject id = get_sme_lexification_state_id(self);
        try {
            thread.throwStack.push($sym279$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD);
            try {
                sublisp_throw($sym279$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD, list(id, state, next_states, lexification_wizard.list_lexification_parameters(lexwiz_parameters, T, UNPROVIDED), list_sme_lexification_settings(lexwiz_settings, T)));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_state_lexwiz_settings(self, lexwiz_settings);
                    set_sme_lexification_state_lexwiz_parameters(self, lexwiz_parameters);
                    set_sme_lexification_state_next_states(self, next_states);
                    set_sme_lexification_state_state(self, state);
                    set_sme_lexification_state_id(self, id);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_state_method = Errors.handleThrowable(ccatch_env_var, $sym279$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_state_method;
    }

    public static SubLObject sme_lexification_state_trace_values_method(final SubLObject self, SubLObject label, SubLObject debug_level) {
        if (label == UNPROVIDED) {
            label = NIL;
        }
        if (debug_level == UNPROVIDED) {
            debug_level = lexification_utilities.$lex_verbose$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_state_method = NIL;
        final SubLObject lexwiz_settings = get_sme_lexification_state_lexwiz_settings(self);
        final SubLObject lexwiz_parameters = get_sme_lexification_state_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym284$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD);
            try {
                if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(debug_level)) {
                    format(StreamsLow.$trace_output$.getDynamicValue(thread), $str285$_a_s__, NIL != label ? label : $str286$SME_lexification_state__, sme_lexification_state_list_values_method(self));
                    force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                }
                lex_describe_instance(lexification_utilities.$lex_very_verbose$.getGlobalValue(), self);
                lexification_wizard.trace_lexification_parameters(lexwiz_parameters, lexification_utilities.$lex_most_verbose$.getGlobalValue());
                trace_sme_lexification_settings(lexwiz_settings, lexification_utilities.$lex_most_verbose$.getGlobalValue());
                sublisp_throw($sym284$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_state_lexwiz_settings(self, lexwiz_settings);
                    set_sme_lexification_state_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_state_method = Errors.handleThrowable(ccatch_env_var, $sym284$OUTER_CATCH_FOR_SME_LEXIFICATION_STATE_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_state_method;
    }

    public static SubLObject sme_lexification_interlocutor_initialize_method(final SubLObject self) {
        SubLObject callback_function = get_sme_lexification_interlocutor_callback_function(self);
        SubLObject proxy = get_sme_lexification_interlocutor_proxy(self);
        SubLObject sme_state = get_sme_lexification_interlocutor_sme_state(self);
        object.object_initialize_method(self);
        callback_function = NIL;
        set_sme_lexification_interlocutor_callback_function(self, callback_function);
        sme_state = methods.funcall_class_method_with_0_args(SME_LEXIFICATION_STATE, NEW);
        set_sme_lexification_interlocutor_sme_state(self, sme_state);
        proxy = methods.funcall_class_method_with_0_args(INTERFACE_PROXY, NEW);
        set_sme_lexification_interlocutor_proxy(self, proxy);
        return self;
    }

    public static SubLObject sme_lexification_interlocutor_doneP_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_interlocutor_method = NIL;
        final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state(self);
        try {
            thread.throwStack.push($sym293$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD);
            try {
                final SubLObject next_states = methods.funcall_instance_method_with_0_args(sme_state, GET_STATES);
                sublisp_throw($sym293$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD, sublisp_null(next_states));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_sme_state(self, sme_state);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_interlocutor_method = Errors.handleThrowable(ccatch_env_var, $sym293$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_interlocutor_method;
    }

    public static SubLObject sme_lexification_interlocutor_initiate_interaction_method(final SubLObject self, final SubLObject session_parameters, final SubLObject callback_fn, final SubLObject instance_data, final SubLObject new_proxy, final SubLObject question_answering_agent_class) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject user_data = get_sme_lexification_interlocutor_user_data(self);
        final SubLObject client_data = get_sme_lexification_interlocutor_client_data(self);
        final SubLObject callback_function = get_sme_lexification_interlocutor_callback_function(self);
        final SubLObject proxy = get_sme_lexification_interlocutor_proxy(self);
        final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state(self);
        SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings(self);
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str298$callback_fn__of_type__a____a__, type_of(callback_fn), callback_fn);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str299$question_answering_agent_class__o, type_of(question_answering_agent_class), question_answering_agent_class);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        set_sme_lexification_interlocutor_lexwiz_parameters(self, session_parameters);
        lexwiz_settings = make_sme_lexification_settings(UNPROVIDED);
        set_sme_lexification_interlocutor_lexwiz_settings(self, lexwiz_settings);
        instances.set_slot(sme_state, LEXWIZ_PARAMETERS, session_parameters);
        instances.set_slot(sme_state, LEXWIZ_SETTINGS, lexwiz_settings);
        set_sme_lexification_interlocutor_callback_function(self, callback_fn);
        set_sme_lexification_interlocutor_client_data(self, instance_data);
        set_sme_lexification_interlocutor_user_data(self, session_parameters);
        set_sme_lexification_interlocutor_proxy(self, new_proxy);
        sme_lexification_interlocutor_set_interlocutor_agent_method(self, methods.funcall_class_method_with_0_args(question_answering_agent_class, NEW));
        sme_lexification_interlocutor_update_notification_info_method(self);
        methods.funcall_instance_method_with_0_args(self, NEXT_INTERACTION);
        return NIL;
    }

    public static SubLObject sme_lexification_interlocutor_update_notification_info_method(final SubLObject self) {
        final SubLObject proxy = get_sme_lexification_interlocutor_proxy(self);
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        final SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method(self);
        final SubLObject my_notification_fn = methods.resolve_method(PROCESS_STATUS_UPDATE, SME_LEXIFICATION_INTERLOCUTOR);
        methods.funcall_instance_method_with_1_args(interlocutor_agent, SET_CALLBACK_FUNCTION, my_notification_fn);
        methods.funcall_instance_method_with_1_args(interlocutor_agent, SET_CLIENT_DATA, self);
        methods.funcall_instance_method_with_1_args(interlocutor_agent, SET_USER_DATA, lexwiz_parameters);
        methods.funcall_instance_method_with_1_args(interlocutor_agent, SET_PROXY, proxy);
        return T;
    }

    public static SubLObject sme_lexification_interlocutor_next_interaction_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sme_state = get_sme_lexification_interlocutor_sme_state(self);
        final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings(self);
        SubLObject previous_id = get_sme_lexification_interlocutor_previous_id(self);
        previous_id = methods.funcall_instance_method_with_0_args(sme_state, GET_ID);
        set_sme_lexification_interlocutor_previous_id(self, previous_id);
        methods.funcall_instance_method_with_1_args(sme_state, TRACE_VALUES, $str307$sme_state__);
        lex_describe_instance(lexification_utilities.$lex_very_verbose$.getGlobalValue(), sme_state);
        sme_lexification_interlocutor_update_lexification_parameters_method(self);
        instances.set_slot(sme_state, LEXWIZ_SETTINGS, copy_sme_lexification_settings(lexwiz_settings));
        if (NIL == $use_blackboardP$.getGlobalValue()) {
            sme_state = methods.funcall_class_method_with_1_args(SME_LEXIFICATION_STATE, NEW_COPY, sme_state);
            set_sme_lexification_interlocutor_sme_state(self, sme_state);
            sme_lexification_interlocutor_update_notification_info_method(self);
        }
        methods.funcall_instance_method_with_0_args(sme_state, ADVANCE);
        final SubLObject id = methods.funcall_instance_method_with_0_args(sme_state, GET_ID);
        lexification_wizard.set_lexification_object(id, sme_state);
        if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str308$current_state___a__, methods.funcall_instance_method_with_0_args(sme_state, CURRENT_STATE));
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(lexification_utilities.$lex_very_detailed$.getGlobalValue())) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str309$next_states___a__, methods.funcall_instance_method_with_0_args(sme_state, GET_STATES));
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        final SubLObject state = methods.funcall_instance_method_with_0_args(sme_state, CURRENT_STATE);
        if (NIL != object.object_implements_method_p_method(self, state)) {
            methods.funcall_instance_method_with_0_args(self, state);
        } else
            if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str149$Warning__, $str310$Unexpected_state___a__), state);
                force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
            }

        return NIL;
    }

    public static SubLObject sme_lexification_interlocutor_end_interaction_method(final SubLObject self) {
        sme_lexification_interlocutor_notify_client_method(self, $DONE);
        return NIL;
    }

    public static SubLObject sme_lexification_interlocutor_reset_state_method(final SubLObject self, final SubLObject state_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sme_state = get_sme_lexification_interlocutor_sme_state(self);
        SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings(self);
        final SubLObject previous_id = get_sme_lexification_interlocutor_previous_id(self);
        final SubLObject old_sme_state = lexification_wizard.get_lexification_object(state_id);
        if (NIL != old_sme_state) {
            if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
                format(StreamsLow.$trace_output$.getDynamicValue(thread), $str319$Resetting_SME_lexwiz_to_older_sta, state_id);
                force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
            }
            methods.funcall_instance_method_with_1_args(old_sme_state, TRACE_VALUES, $str320$old_sme_state__);
            methods.funcall_instance_method_with_1_args(sme_state, TRACE_VALUES, $str321$sme_state__before___);
            sme_state = methods.funcall_class_method_with_1_args(SME_LEXIFICATION_STATE, NEW_COPY, old_sme_state);
            set_sme_lexification_interlocutor_sme_state(self, sme_state);
            methods.funcall_instance_method_with_1_args(sme_state, TRACE_VALUES, $str322$sme_state__after___);
            set_sme_lexification_interlocutor_previous_id(self, state_id);
            sme_lexification_interlocutor_update_lexification_parameters_method(self);
            lexwiz_settings = copy_sme_lexification_settings(instances.get_slot(sme_state, LEXWIZ_SETTINGS));
            set_sme_lexification_interlocutor_lexwiz_settings(self, lexwiz_settings);
            if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(lexification_utilities.$lex_verbose$.getGlobalValue()) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
                format(StreamsLow.$trace_output$.getDynamicValue(thread), $str323$done_with_state_reset__);
                force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
            }
        } else
            if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str149$Warning__, $str324$Unable_to_resolve_SME_lexificatio), state_id);
                force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
            }

        return sme_state;
    }

    public static SubLObject sme_lexification_interlocutor_process_status_update_method(final SubLObject self, final SubLObject status, SubLObject server, SubLObject current_user_data) {
        if (server == UNPROVIDED) {
            server = NIL;
        }
        if (current_user_data == UNPROVIDED) {
            current_user_data = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state(self);
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        final SubLObject previous_id = get_sme_lexification_interlocutor_previous_id(self);
        if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str328$sme_li_process_status_update_stat, new SubLObject[]{ status, server, current_user_data });
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method(self);
        interlocutor_agent = server;
        if (status.eql($OUTPUT_DONE)) {
            methods.funcall_instance_method_with_0_args(interlocutor_agent, GET_RESPONSE);
        } else
            if (status.eql($INPUT_READY)) {
                methods.funcall_instance_method_with_0_args(interlocutor_agent, VALIDATE_RESPONSE);
            } else
                if (status.eql($INPUT_VALIDATED)) {
                    lexification_wizard._csetf_lexwiz_error_message(lexwiz_parameters, NIL);
                    final SubLObject id = methods.funcall_instance_method_with_0_args(sme_state, GET_ID);
                    final SubLObject agent_id = instances.get_slot(interlocutor_agent, ID);
                    if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
                        format(StreamsLow.$trace_output$.getDynamicValue(thread), $str331$id__a_previous_id__a_agent_id__a_, new SubLObject[]{ id, previous_id, agent_id });
                        force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                    }
                    if (((!agent_id.equal(previous_id)) && (!agent_id.equal(id))) && (NIL == $use_blackboardP$.getGlobalValue())) {
                        sme_lexification_interlocutor_reset_state_method(self, agent_id);
                    }
                    methods.funcall_instance_method_with_0_args(self, NEXT_INTERACTION);
                } else
                    if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                        format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str149$Warning__, $str332$Unexpected_status___a__), status);
                        force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                    }



        return NIL;
    }

    public static SubLObject sme_lexification_interlocutor_ask_generic_boolean_method(final SubLObject self, final SubLObject title, final SubLObject v_question, SubLObject tip, SubLObject v_default) {
        if (tip == UNPROVIDED) {
            tip = NIL;
        }
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        final SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method(self);
        instances.set_slot(interlocutor_agent, TIP, tip);
        methods.funcall_instance_method_with_3_args(interlocutor_agent, SET_QUESTION, v_question, title, $BOOLEAN);
        instances.set_slot(interlocutor_agent, DEFAULT, v_default);
        sme_lexification_interlocutor_display_question_method(self);
        return NIL;
    }

    public static SubLObject sme_lexification_interlocutor_ask_generic_enumerated_method(final SubLObject self, final SubLObject title, final SubLObject v_question, final SubLObject choices, SubLObject tip, SubLObject values, SubLObject default_offset) {
        if (tip == UNPROVIDED) {
            tip = NIL;
        }
        if (values == UNPROVIDED) {
            values = NIL;
        }
        if (default_offset == UNPROVIDED) {
            default_offset = NIL;
        }
        final SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method(self);
        instances.set_slot(interlocutor_agent, TIP, tip);
        instances.set_slot(interlocutor_agent, VALUES, values);
        methods.funcall_instance_method_with_4_args(interlocutor_agent, SET_QUESTION, v_question, title, $ENUMERATED, choices);
        instances.set_slot(interlocutor_agent, DEFAULT, default_offset);
        sme_lexification_interlocutor_display_question_method(self);
        return NIL;
    }

    public static SubLObject sme_lexification_interlocutor_ask_generic_multiple_selection_method(final SubLObject self, final SubLObject title, final SubLObject v_question, final SubLObject choices, SubLObject tip, SubLObject values, SubLObject default_offsets) {
        if (tip == UNPROVIDED) {
            tip = NIL;
        }
        if (values == UNPROVIDED) {
            values = NIL;
        }
        if (default_offsets == UNPROVIDED) {
            default_offsets = NIL;
        }
        final SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method(self);
        instances.set_slot(interlocutor_agent, TIP, tip);
        instances.set_slot(interlocutor_agent, VALUES, values);
        methods.funcall_instance_method_with_4_args(interlocutor_agent, SET_QUESTION, v_question, title, $MULTIPLE_SELECTION, choices);
        instances.set_slot(interlocutor_agent, DEFAULT, default_offsets);
        sme_lexification_interlocutor_display_question_method(self);
        return NIL;
    }

    public static SubLObject sme_lexification_interlocutor_ask_generic_free_form_method(final SubLObject self, final SubLObject title, final SubLObject v_question, SubLObject tip, SubLObject size, SubLObject v_default) {
        if (tip == UNPROVIDED) {
            tip = NIL;
        }
        if (size == UNPROVIDED) {
            size = TEN_INTEGER;
        }
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        final SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method(self);
        instances.set_slot(interlocutor_agent, TIP, tip);
        instances.set_slot(interlocutor_agent, FIELD_WIDTH, size);
        methods.funcall_instance_method_with_3_args(interlocutor_agent, SET_QUESTION, v_question, title, $FREE_FORM);
        instances.set_slot(interlocutor_agent, DEFAULT, v_default);
        sme_lexification_interlocutor_display_question_method(self);
        return NIL;
    }

    public static SubLObject sme_lexification_interlocutor_ask_generic_multiple_free_form_method(final SubLObject self, final SubLObject title, final SubLObject v_question, SubLObject tip, SubLObject labels, SubLObject size, SubLObject defaults, SubLObject descriptions) {
        if (tip == UNPROVIDED) {
            tip = NIL;
        }
        if (labels == UNPROVIDED) {
            labels = NIL;
        }
        if (size == UNPROVIDED) {
            size = NIL;
        }
        if (defaults == UNPROVIDED) {
            defaults = NIL;
        }
        if (descriptions == UNPROVIDED) {
            descriptions = NIL;
        }
        final SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method(self);
        instances.set_slot(interlocutor_agent, TIP, tip);
        instances.set_slot(interlocutor_agent, FIELD_WIDTH, size);
        instances.set_slot(interlocutor_agent, FIELD_LABELS, labels);
        methods.funcall_instance_method_with_3_args(interlocutor_agent, SET_QUESTION, v_question, title, $MULTIPLE_FREE_FORM);
        instances.set_slot(interlocutor_agent, DEFAULT, defaults);
        instances.set_slot(interlocutor_agent, DESCRIPTIONS, descriptions);
        sme_lexification_interlocutor_display_question_method(self);
        return NIL;
    }

    public static SubLObject sme_lexification_interlocutor_display_question_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_interlocutor_method = NIL;
        final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state(self);
        final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings(self);
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym355$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD);
            try {
                final SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method(self);
                instances.set_slot(interlocutor_agent, ERROR_MESSAGE, lexification_wizard.lexwiz_error_message(lexwiz_parameters));
                lexification_wizard._csetf_lexwiz_error_message(lexwiz_parameters, NIL);
                instances.set_slot(interlocutor_agent, ID, methods.funcall_instance_method_with_0_args(sme_state, GET_ID));
                sme_lexification_interlocutor_update_lexification_parameters_method(self);
                instances.set_slot(sme_state, LEXWIZ_SETTINGS, copy_sme_lexification_settings(lexwiz_settings));
                methods.funcall_instance_method_with_0_args(interlocutor_agent, DISPLAY_QUESTION);
                sublisp_throw($sym355$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_sme_state(self, sme_state);
                    set_sme_lexification_interlocutor_lexwiz_settings(self, lexwiz_settings);
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_interlocutor_method = Errors.handleThrowable(ccatch_env_var, $sym355$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_interlocutor_method;
    }

    public static SubLObject sme_lexification_interlocutor_get_answer_method(final SubLObject self) {
        final SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method(self);
        return instances.get_slot(interlocutor_agent, ANSWER);
    }

    public static SubLObject sme_lexification_interlocutor_set_answer_method(final SubLObject self, final SubLObject new_answer) {
        final SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method(self);
        instances.set_slot(interlocutor_agent, ANSWER, new_answer);
        return NIL;
    }

    public static SubLObject sme_lexification_interlocutor_get_interlocutor_agent_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_interlocutor_method = NIL;
        final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state(self);
        try {
            thread.throwStack.push($sym366$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD);
            try {
                if ((NIL == sme_state) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                    format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str149$Warning__, $str367$____assertion_failed___a______), SME_STATE);
                    force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                }
                if (NIL != sme_state) {
                    sublisp_throw($sym366$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD, instances.get_slot(sme_state, INTERLOCUTOR_AGENT));
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_sme_state(self, sme_state);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_interlocutor_method = Errors.handleThrowable(ccatch_env_var, $sym366$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_interlocutor_method;
    }

    public static SubLObject sme_lexification_interlocutor_set_interlocutor_agent_method(final SubLObject self, final SubLObject new_agent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_interlocutor_method = NIL;
        final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state(self);
        try {
            thread.throwStack.push($sym372$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD);
            try {
                if ((NIL == sme_state) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                    format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str149$Warning__, $str367$____assertion_failed___a______), SME_STATE);
                    force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                }
                if (NIL != sme_state) {
                    instances.set_slot(sme_state, INTERLOCUTOR_AGENT, new_agent);
                }
                sublisp_throw($sym372$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_sme_state(self, sme_state);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_interlocutor_method = Errors.handleThrowable(ccatch_env_var, $sym372$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_interlocutor_method;
    }

    public static SubLObject sme_lexification_interlocutor_set_default_method(final SubLObject self, final SubLObject new_default) {
        final SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method(self);
        instances.set_slot(interlocutor_agent, DEFAULT, new_default);
        return NIL;
    }

    public static SubLObject sme_lexification_interlocutor_check_generic_method(final SubLObject self, final SubLObject field) {
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        final SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method(self);
        final SubLObject response = instances.get_slot(interlocutor_agent, ANSWER);
        final SubLObject field_accessor = intern(format(NIL, $str381$LEXWIZ__S, field), UNPROVIDED);
        eval(list(CSETF, list(field_accessor, lexwiz_parameters), response));
        methods.funcall_instance_method_with_0_args(self, NEXT_INTERACTION);
        return NIL;
    }

    public static SubLObject sme_lexification_interlocutor_set_callback_function_method(final SubLObject self, final SubLObject new_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_interlocutor_method = NIL;
        SubLObject callback_function = get_sme_lexification_interlocutor_callback_function(self);
        try {
            thread.throwStack.push($sym384$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD);
            try {
                callback_function = new_function;
                sublisp_throw($sym384$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_callback_function(self, callback_function);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_interlocutor_method = Errors.handleThrowable(ccatch_env_var, $sym384$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_interlocutor_method;
    }

    public static SubLObject sme_lexification_interlocutor_set_proxy_method(final SubLObject self, final SubLObject new_proxy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_interlocutor_method = NIL;
        SubLObject proxy = get_sme_lexification_interlocutor_proxy(self);
        try {
            thread.throwStack.push($sym386$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD);
            try {
                proxy = new_proxy;
                sublisp_throw($sym386$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_proxy(self, proxy);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_interlocutor_method = Errors.handleThrowable(ccatch_env_var, $sym386$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_interlocutor_method;
    }

    public static SubLObject sme_lexification_interlocutor_notify_client_method(final SubLObject self, final SubLObject status) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_interlocutor_method = NIL;
        final SubLObject user_data = get_sme_lexification_interlocutor_user_data(self);
        final SubLObject client_data = get_sme_lexification_interlocutor_client_data(self);
        final SubLObject callback_function = get_sme_lexification_interlocutor_callback_function(self);
        try {
            thread.throwStack.push($sym389$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD);
            try {
                if (NIL != callback_function) {
                    funcall(callback_function, client_data, status, self, user_data);
                }
                sublisp_throw($sym389$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_user_data(self, user_data);
                    set_sme_lexification_interlocutor_client_data(self, client_data);
                    set_sme_lexification_interlocutor_callback_function(self, callback_function);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_interlocutor_method = Errors.handleThrowable(ccatch_env_var, $sym389$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_interlocutor_method;
    }

    public static SubLObject sme_lexification_interlocutor_mumble_method(final SubLObject self, final SubLObject message) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_interlocutor_method = NIL;
        final SubLObject proxy = get_sme_lexification_interlocutor_proxy(self);
        try {
            thread.throwStack.push($sym392$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD);
            try {
                if (NIL != proxy) {
                    sublisp_throw($sym392$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD, methods.funcall_instance_method_with_1_args(proxy, MUMBLE, message));
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_proxy(self, proxy);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_interlocutor_method = Errors.handleThrowable(ccatch_env_var, $sym392$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_interlocutor_method;
    }

    public static SubLObject sme_lexification_interlocutor_forge_aheadP_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_interlocutor_method = NIL;
        final SubLObject proxy = get_sme_lexification_interlocutor_proxy(self);
        try {
            thread.throwStack.push($sym395$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD);
            try {
                if (NIL != proxy) {
                    sublisp_throw($sym395$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD, methods.funcall_instance_method_with_0_args(proxy, $sym241$FORGE_AHEAD_));
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_proxy(self, proxy);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_interlocutor_method = Errors.handleThrowable(ccatch_env_var, $sym395$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_interlocutor_method;
    }

    public static SubLObject sme_lexification_interlocutor_phrase_denotations_method(final SubLObject self, final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_interlocutor_method = NIL;
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym400$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD);
            try {
                sublisp_throw($sym400$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD, lexicon_accessors.all_denots_of_string(phrase, NIL, lexification_wizard.lexwiz_lexical_mt(lexwiz_parameters), UNPROVIDED));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_interlocutor_method = Errors.handleThrowable(ccatch_env_var, $sym400$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_interlocutor_method;
    }

    public static SubLObject sme_lexification_interlocutor_describe_term_method(final SubLObject self, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_interlocutor_method = NIL;
        final SubLObject proxy = get_sme_lexification_interlocutor_proxy(self);
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym403$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD);
            try {
                sublisp_throw($sym403$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD, NIL != proxy ? methods.funcall_instance_method_with_1_args(proxy, DESCRIBE_TERM, v_term) : lexification_utilities.lex_describe_term(v_term, lexification_wizard.lexwiz_lexical_mt(lexwiz_parameters)));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_proxy(self, proxy);
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_interlocutor_method = Errors.handleThrowable(ccatch_env_var, $sym403$OUTER_CATCH_FOR_SME_LEXIFICATION_INTERLOCUTOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_interlocutor_method;
    }

    public static SubLObject sme_lexification_interlocutor_update_lexification_parameters_method(final SubLObject self) {
        final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state(self);
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        final SubLObject interlocutor_agent = sme_lexification_interlocutor_get_interlocutor_agent_method(self);
        final SubLObject new_lexification_parameters = lexification_wizard.copy_lexification_parameters(lexwiz_parameters);
        instances.set_slot(sme_state, LEXWIZ_PARAMETERS, new_lexification_parameters);
        methods.funcall_instance_method_with_1_args(interlocutor_agent, SET_USER_DATA, new_lexification_parameters);
        return NIL;
    }

    public static SubLObject sme_li_pre_general_initialize_method(final SubLObject self) {
        SubLObject sme_state = get_sme_lexification_interlocutor_sme_state(self);
        sme_lexification_interlocutor_initialize_method(self);
        sme_state = instances.get_slot(self, SME_STATE);
        set_sme_lexification_interlocutor_sme_state(self, sme_state);
        final SubLObject state_sequence = $list409;
        methods.funcall_instance_method_with_1_args(sme_state, SET_STATES, state_sequence);
        return self;
    }

    public static SubLObject sme_li_pre_general_do_initialization_method(final SubLObject self) {
        final SubLObject title = $str413$Performing_dictionary_assistant_i;
        final SubLObject v_question = format(NIL, $str414$_a_____a, $lexwiz_welcome_message$.getGlobalValue(), $str415$Press_OK_to_proceed_);
        final SubLObject choices = NIL;
        final SubLObject tip = $lexwiz_initialization_tip$.getGlobalValue();
        if (NIL != $sme_lexwiz_initializedP$.getGlobalValue()) {
            sme_lexification_interlocutor_next_interaction_method(self);
        } else {
            sme_lexification_interlocutor_ask_generic_enumerated_method(self, title, v_question, choices, tip, UNPROVIDED, UNPROVIDED);
        }
        return T;
    }

    public static SubLObject sme_li_pre_general_check_initialization_method(final SubLObject self) {
        if (NIL == $sme_lexwiz_initializedP$.getGlobalValue()) {
            init_sme_lexification_wizard();
        }
        sme_lexification_interlocutor_next_interaction_method(self);
        return T;
    }

    public static SubLObject sme_li_pre_general_ask_term_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_pre_general_method = NIL;
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym422$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD);
            try {
                final SubLObject term_label = lexification_wizard.lexwiz_term(lexwiz_parameters);
                final SubLObject title = format(NIL, $str423$Determining_concept_to_be_lexifie);
                final SubLObject v_question = format(NIL, $str424$Which_concept_s_lexical_informati);
                final SubLObject tip = $str425$This_is_usually_the_name_of_the_t;
                final SubLObject size = $int$60;
                if ((NIL != forts.fort_p(lexification_wizard.lexwiz_term(lexwiz_parameters))) || ((NIL != string_utilities.non_empty_stringP(term_label)) && (NIL != lexification_utilities.lex_empty_stringP(lexification_wizard.lexwiz_error_message(lexwiz_parameters))))) {
                    sme_lexification_interlocutor_set_answer_method(self, term_label);
                    sme_lexification_interlocutor_next_interaction_method(self);
                } else {
                    sme_lexification_interlocutor_ask_generic_free_form_method(self, title, v_question, tip, size, term_label);
                }
                sublisp_throw($sym422$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_pre_general_method = Errors.handleThrowable(ccatch_env_var, $sym422$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_pre_general_method;
    }

    public static SubLObject sme_li_pre_general_check_term_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_pre_general_method = NIL;
        final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state(self);
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym430$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD);
            try {
                if (NIL == forts.fort_p(lexification_wizard.lexwiz_term(lexwiz_parameters))) {
                    final SubLObject term_label = sme_lexification_interlocutor_get_answer_method(self);
                    lexification_wizard._csetf_lexwiz_term(lexwiz_parameters, sme_li_pre_general_resolve_term_method(self, term_label));
                    if (!length(lexification_wizard.lexwiz_term(lexwiz_parameters)).numG(ZERO_INTEGER)) {
                        lexification_wizard._csetf_lexwiz_term(lexwiz_parameters, term_label);
                        lexification_wizard._csetf_lexwiz_error_message(lexwiz_parameters, $$$A_valid_concept_must_be_specified);
                        SubLObject new_states = methods.funcall_instance_method_with_0_args(sme_state, GET_STATES);
                        new_states = append($list432, new_states);
                        methods.funcall_instance_method_with_1_args(sme_state, SET_STATES, new_states);
                    }
                }
                sme_lexification_interlocutor_next_interaction_method(self);
                sublisp_throw($sym430$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_sme_state(self, sme_state);
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_pre_general_method = Errors.handleThrowable(ccatch_env_var, $sym430$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_pre_general_method;
    }

    public static SubLObject sme_li_pre_general_resolve_term_method(final SubLObject self, final SubLObject term_label) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_pre_general_method = NIL;
        final SubLObject proxy = get_sme_lexification_interlocutor_proxy(self);
        try {
            thread.throwStack.push($sym435$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD);
            try {
                SubLObject term_clarifications = list(list(lexification_utilities.lex_fort_for_string(term_label), term_label));
                if (NIL != proxy) {
                    term_clarifications = methods.funcall_instance_method_with_1_args(proxy, RESOLVE_TERM, term_label);
                }
                sublisp_throw($sym435$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD, term_clarifications);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_proxy(self, proxy);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_pre_general_method = Errors.handleThrowable(ccatch_env_var, $sym435$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_pre_general_method;
    }

    public static SubLObject sme_li_pre_general_ask_term_selection_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_pre_general_method = NIL;
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym439$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD);
            try {
                lexification_wizard.trace_lexification_parameters(lexwiz_parameters, UNPROVIDED);
                if (NIL != forts.fort_p(lexification_wizard.lexwiz_term(lexwiz_parameters))) {
                    sme_lexification_interlocutor_next_interaction_method(self);
                    sublisp_throw($sym439$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD, T);
                }
                if (!lexification_wizard.lexwiz_term(lexwiz_parameters).isList()) {
                    if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                        format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str149$Warning__, $str440$Unexpected_term_parameter___s__), lexification_wizard.lexwiz_term(lexwiz_parameters));
                        force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                    }
                    sublisp_throw($sym439$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD, T);
                }
                final SubLObject term_clarifications = lexification_wizard.lexwiz_term(lexwiz_parameters);
                final SubLObject title = format(NIL, $$$Clarifying_term_to_be_lexified);
                final SubLObject v_question = format(NIL, $str442$Which_of_the_following_terms_do_y);
                final SubLObject choices = Mapping.mapcar(symbol_function(SECOND), term_clarifications);
                final SubLObject values = Mapping.mapcar(symbol_function(FIRST), term_clarifications);
                final SubLObject default_offset = NIL;
                final SubLObject tip = NIL;
                if (length(choices).numE(ONE_INTEGER)) {
                    lexification_wizard._csetf_lexwiz_term(lexwiz_parameters, term_clarifications.first().first());
                }
                if (NIL != forts.fort_p(lexification_wizard.lexwiz_term(lexwiz_parameters))) {
                    sme_lexification_interlocutor_next_interaction_method(self);
                } else {
                    sme_lexification_interlocutor_ask_generic_enumerated_method(self, title, v_question, choices, tip, values, default_offset);
                }
                sublisp_throw($sym439$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_pre_general_method = Errors.handleThrowable(ccatch_env_var, $sym439$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_pre_general_method;
    }

    public static SubLObject sme_li_pre_general_check_term_selection_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_pre_general_method = NIL;
        final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state(self);
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym448$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD);
            try {
                if (NIL == forts.fort_p(lexification_wizard.lexwiz_term(lexwiz_parameters))) {
                    lexification_wizard._csetf_lexwiz_term(lexwiz_parameters, lexification_utilities.lex_fort_for_string(sme_lexification_interlocutor_get_answer_method(self)));
                }
                if (NIL == forts.fort_p(lexification_wizard.lexwiz_term(lexwiz_parameters))) {
                    lexification_wizard._csetf_lexwiz_error_message(lexwiz_parameters, $$$A_valid_concept_must_be_specified);
                    SubLObject new_states = methods.funcall_instance_method_with_0_args(sme_state, GET_STATES);
                    new_states = append($list449, new_states);
                    methods.funcall_instance_method_with_1_args(sme_state, SET_STATES, new_states);
                }
                sme_lexification_interlocutor_next_interaction_method(self);
                sublisp_throw($sym448$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_sme_state(self, sme_state);
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_pre_general_method = Errors.handleThrowable(ccatch_env_var, $sym448$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_pre_general_method;
    }

    public static SubLObject sme_li_pre_general_ask_phrase_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_pre_general_method = NIL;
        final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings(self);
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym453$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD);
            try {
                SubLObject phrase = lexification_wizard.lexwiz_phrase(lexwiz_parameters);
                final SubLObject v_term = lexification_wizard.lexwiz_term(lexwiz_parameters);
                final SubLObject term_desc = sme_lexification_interlocutor_describe_term_method(self, v_term);
                final SubLObject title = format(NIL, $str454$Checking_phrase_for_the_lexificat);
                final SubLObject v_question = format(NIL, $str455$How_would_you_like_to_refer_to_th, term_desc);
                final SubLObject tip = $phrase_specification_tip$.getGlobalValue();
                final SubLObject size = $int$60;
                SubLObject skipP = string_utilities.non_empty_stringP(phrase);
                SubLObject v_default = NIL;
                if ((NIL == skipP) && (NIL == sme_lexwiz_okP(lexwiz_settings))) {
                    phrase = v_default = lexification_utilities.preferred_loose_lexification_phrase_for_term(v_term);
                    sme_lexification_interlocutor_set_answer_method(self, phrase);
                    if (NIL != $use_inferred_phrasesP$.getGlobalValue()) {
                        skipP = string_utilities.non_empty_stringP(v_default);
                    }
                }
                final SubLObject phrase_words = lexification_utilities.lex_string_tokenize(phrase, NIL);
                if (((NIL != skipP) && (NIL != lexicon_utilities.is_determinerP(phrase_words.first(), UNPROVIDED, UNPROVIDED))) && (NIL != fort_types_interface.collection_in_any_mtP(v_term))) {
                    final SubLObject message = format(NIL, $str456$Assuming_you_don_t_want_to_use_th, phrase_words.first(), phrase);
                    v_default = lexification_utilities.join_words(phrase_words.rest());
                    lexification_wizard._csetf_lexwiz_phrase(lexwiz_parameters, $str457$);
                    skipP = NIL;
                    sme_lexification_interlocutor_mumble_method(self, message);
                }
                if (NIL != skipP) {
                    sme_lexification_interlocutor_next_interaction_method(self);
                } else {
                    sme_lexification_interlocutor_ask_generic_free_form_method(self, title, v_question, tip, size, v_default);
                }
                sublisp_throw($sym453$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_settings(self, lexwiz_settings);
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_pre_general_method = Errors.handleThrowable(ccatch_env_var, $sym453$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_pre_general_method;
    }

    public static SubLObject sme_li_pre_general_check_phrase_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_pre_general_method = NIL;
        final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state(self);
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym461$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD);
            try {
                SubLObject phrase = lex_normalize_string(lexification_wizard.lexwiz_phrase(lexwiz_parameters));
                lexification_wizard._csetf_lexwiz_phrase(lexwiz_parameters, phrase);
                if (NIL != lexification_utilities.lex_empty_stringP(phrase)) {
                    phrase = lex_normalize_string(sme_lexification_interlocutor_get_answer_method(self));
                    lexification_wizard._csetf_lexwiz_phrase(lexwiz_parameters, phrase);
                    if (NIL != lexification_utilities.lex_empty_stringP(phrase)) {
                        lexification_wizard._csetf_lexwiz_error_message(lexwiz_parameters, $$$A_valid_phrase_must_be_specified);
                        SubLObject new_states = methods.funcall_instance_method_with_0_args(sme_state, GET_STATES);
                        new_states = append($list463, new_states);
                        methods.funcall_instance_method_with_1_args(sme_state, SET_STATES, new_states);
                    }
                }
                sme_lexification_interlocutor_next_interaction_method(self);
                sublisp_throw($sym461$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_sme_state(self, sme_state);
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_pre_general_method = Errors.handleThrowable(ccatch_env_var, $sym461$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_pre_general_method;
    }

    public static SubLObject sme_li_pre_general_ask_ambiguity_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_pre_general_method = NIL;
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym467$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD);
            try {
                final SubLObject phrase = lexification_wizard.lexwiz_phrase(lexwiz_parameters);
                final SubLObject v_term = lexification_wizard.lexwiz_term(lexwiz_parameters);
                final SubLObject term_desc = sme_lexification_interlocutor_describe_term_method(self, v_term);
                final SubLObject title = format(NIL, $$$Checking_phrase_ambiguity);
                final SubLObject other_terms = remove(v_term, sme_lexification_interlocutor_phrase_denotations_method(self, phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject other_term_descs = map_method(self, DESCRIBE_TERM, other_terms);
                final SubLObject v_question = format(NIL, $str469$In_addition_to___a___phrase__s_al, new SubLObject[]{ term_desc, phrase, $newline_tab$.getGlobalValue(), string_utilities.join_strings(other_term_descs, $newline_tab$.getGlobalValue()) });
                final SubLObject skipP = sublisp_null(other_terms);
                sme_lexification_interlocutor_set_answer_method(self, skipP);
                if (NIL != skipP) {
                    sme_lexification_interlocutor_next_interaction_method(self);
                } else {
                    sme_lexification_interlocutor_ask_generic_boolean_method(self, title, v_question, UNPROVIDED, UNPROVIDED);
                }
                sublisp_throw($sym467$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_pre_general_method = Errors.handleThrowable(ccatch_env_var, $sym467$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_pre_general_method;
    }

    public static SubLObject sme_li_pre_general_check_ambiguity_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_pre_general_method = NIL;
        final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state(self);
        final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings(self);
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym473$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD);
            try {
                final SubLObject okP = sme_lexification_interlocutor_get_answer_method(self);
                if (NIL == okP) {
                    _csetf_sme_lexwiz_okP(lexwiz_settings, T);
                    lexification_wizard._csetf_lexwiz_phrase(lexwiz_parameters, $str457$);
                    SubLObject new_states = methods.funcall_instance_method_with_0_args(sme_state, GET_STATES);
                    new_states = append($list474, new_states);
                    methods.funcall_instance_method_with_1_args(sme_state, SET_STATES, new_states);
                }
                sme_lexification_interlocutor_next_interaction_method(self);
                sublisp_throw($sym473$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_sme_state(self, sme_state);
                    set_sme_lexification_interlocutor_lexwiz_settings(self, lexwiz_settings);
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_pre_general_method = Errors.handleThrowable(ccatch_env_var, $sym473$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_pre_general_method;
    }

    public static SubLObject sme_li_pre_general_ask_proper_name_status_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_pre_general_method = NIL;
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym478$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD);
            try {
                final SubLObject phrase = lexification_wizard.lexwiz_phrase(lexwiz_parameters);
                final SubLObject v_term = lexification_wizard.lexwiz_term(lexwiz_parameters);
                final SubLObject term_desc = sme_lexification_interlocutor_describe_term_method(self, v_term);
                final SubLObject title = $str479$Checking_whether_the_phrase_is_a_;
                final SubLObject v_question = format(NIL, $str480$Is_the_phrase___a__a_name_, phrase);
                final SubLObject tip = $proper_name_status_tip$.getGlobalValue();
                final SubLObject nameableP = lexification_utilities.is_nameable_entityP(lexification_wizard.lexwiz_term(lexwiz_parameters));
                final SubLObject has_uppercase_letterP = numG(count_if(symbol_function(UPPER_CASE_P), phrase, UNPROVIDED, UNPROVIDED, UNPROVIDED), ZERO_INTEGER);
                final SubLObject use_inferred_typeP = makeBoolean((NIL != sme_lexification_interlocutor_forge_aheadP_method(self)) && ((NIL != nameableP) || (NIL == has_uppercase_letterP)));
                final SubLObject skipP = makeBoolean((NIL != lexification_utilities.is_relationalP(lexification_wizard.lexwiz_term(lexwiz_parameters))) || (NIL != use_inferred_typeP));
                if (NIL != skipP) {
                    final SubLObject qualifier = (NIL != nameableP) ? $$$is : $str483$isn_t;
                    final SubLObject reason = format(NIL, $str484$Assuming_phrase__s__a_a_proper_na, new SubLObject[]{ phrase, qualifier, term_desc, qualifier });
                    if (NIL != use_inferred_typeP) {
                        sme_lexification_interlocutor_mumble_method(self, reason);
                    }
                    sme_lexification_interlocutor_set_answer_method(self, nameableP);
                    sme_lexification_interlocutor_next_interaction_method(self);
                } else {
                    sme_lexification_interlocutor_ask_generic_boolean_method(self, title, v_question, tip, UNPROVIDED);
                }
                sublisp_throw($sym478$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_pre_general_method = Errors.handleThrowable(ccatch_env_var, $sym478$OUTER_CATCH_FOR_SME_LI_PRE_GENERAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_pre_general_method;
    }

    public static SubLObject sme_li_pre_general_check_proper_name_status_method(final SubLObject self) {
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        if (NIL == lexification_utilities.is_relationalP(lexification_wizard.lexwiz_term(lexwiz_parameters))) {
            lexification_wizard._csetf_lexwiz_is_properP(lexwiz_parameters, sme_lexification_interlocutor_get_answer_method(self));
        }
        sme_lexification_interlocutor_next_interaction_method(self);
        return T;
    }

    public static SubLObject sme_li_proper_name_initialize_method(final SubLObject self) {
        SubLObject sme_state = get_sme_lexification_interlocutor_sme_state(self);
        sme_lexification_interlocutor_initialize_method(self);
        sme_state = instances.get_slot(self, SME_STATE);
        set_sme_lexification_interlocutor_sme_state(self, sme_state);
        methods.funcall_instance_method_with_1_args(sme_state, SET_STATES, $list490);
        return self;
    }

    public static SubLObject sme_li_proper_name_ask_abbreviation_status_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_proper_name_method = NIL;
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym494$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD);
            try {
                final SubLObject phrase = lexification_wizard.lexwiz_phrase(lexwiz_parameters);
                final SubLObject title = $$$Checking_abbreviation_predication;
                final SubLObject v_question = format(NIL, $str496$Is__s_an_abbreviation_, phrase);
                final SubLObject no_spaceP = makeBoolean(NIL == string_utilities.char_position(CHAR_space, phrase, UNPROVIDED));
                SubLObject reason = NIL;
                if (NIL != no_spaceP) {
                    if (NIL != string_utilities.upper_case_string_p(phrase)) {
                        reason = $$$uppercase;
                    }
                    if (NIL != string_utilities.ends_with(phrase, $str498$_, UNPROVIDED)) {
                        reason = $$$ends_with_period;
                    }
                }
                if (NIL != reason) {
                    final SubLObject message = format(NIL, $str500$Checking_whether__s_is_an_abbrevi, phrase, reason);
                    sme_lexification_interlocutor_mumble_method(self, message);
                    sme_lexification_interlocutor_ask_generic_boolean_method(self, title, v_question, UNPROVIDED, UNPROVIDED);
                } else {
                    sme_lexification_interlocutor_next_interaction_method(self);
                }
                sublisp_throw($sym494$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_proper_name_method = Errors.handleThrowable(ccatch_env_var, $sym494$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_proper_name_method;
    }

    public static SubLObject sme_li_proper_name_check_abbreviation_status_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_proper_name_method = NIL;
        final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings(self);
        try {
            thread.throwStack.push($sym504$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD);
            try {
                _csetf_sme_lexwiz_is_abbreviationP(lexwiz_settings, sme_lexification_interlocutor_get_answer_method(self));
                sme_lexification_interlocutor_next_interaction_method(self);
                sublisp_throw($sym504$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_settings(self, lexwiz_settings);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_proper_name_method = Errors.handleThrowable(ccatch_env_var, $sym504$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_proper_name_method;
    }

    public static SubLObject sme_li_proper_name_ask_predicate_type_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_proper_name_method = NIL;
        final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings(self);
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym508$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD);
            try {
                final SubLObject is_abbreviationP = sme_lexwiz_is_abbreviationP(lexwiz_settings);
                final SubLObject pred_type = (NIL != is_abbreviationP) ? $$$abbreviation_types : $$$specialized_kinds_of_names;
                final SubLObject v_term = lexification_wizard.lexwiz_term(lexwiz_parameters);
                final SubLObject term_desc = sme_lexification_interlocutor_describe_term_method(self, v_term);
                final SubLObject phrase = lexification_wizard.lexwiz_phrase(lexwiz_parameters);
                final SubLObject title = $$$Determining_proper_name_type;
                final SubLObject v_question = format(NIL, $str512$If__s_is_one_of_the__a_of_names_l, phrase, pred_type);
                final SubLObject tip = $str513$When_in_doubt__select_the_default;
                thread.resetMultipleValues();
                final SubLObject choices = determine_proper_name_pred_choices(v_term, is_abbreviationP);
                final SubLObject predicates = thread.secondMultipleValue();
                final SubLObject default_offset = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL == choices) {
                    final SubLObject message = format(NIL, $str514$No_specialized_proper_name_types_, term_desc);
                    sme_lexification_interlocutor_mumble_method(self, message);
                    sme_lexification_interlocutor_next_interaction_method(self);
                } else {
                    sme_lexification_interlocutor_ask_generic_enumerated_method(self, title, v_question, choices, tip, predicates, default_offset);
                }
                sublisp_throw($sym508$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_settings(self, lexwiz_settings);
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_proper_name_method = Errors.handleThrowable(ccatch_env_var, $sym508$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_proper_name_method;
    }

    public static SubLObject sme_li_proper_name_check_predicate_type_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_proper_name_method = NIL;
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym518$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD);
            try {
                final SubLObject proper_name_pred = sme_lexification_interlocutor_get_answer_method(self);
                if (!proper_name_pred.equal($str519$n_a)) {
                    lexification_wizard._csetf_lexwiz_proper_name_pred(lexwiz_parameters, proper_name_pred);
                }
                sme_lexification_interlocutor_next_interaction_method(self);
                sublisp_throw($sym518$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_proper_name_method = Errors.handleThrowable(ccatch_env_var, $sym518$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_proper_name_method;
    }

    public static SubLObject sme_li_proper_name_ask_refined_predication_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_proper_name_method = NIL;
        final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings(self);
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym523$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD);
            try {
                final SubLObject pred = lexification_wizard.lexwiz_proper_name_pred(lexwiz_parameters);
                final SubLObject v_term = lexification_wizard.lexwiz_term(lexwiz_parameters);
                final SubLObject cyc_term = lexification_utilities.lex_fort_for_string(v_term);
                final SubLObject is_personP = isa.isa_in_any_mtP(cyc_term, $$Person);
                final SubLObject phrase = lexification_wizard.lexwiz_phrase(lexwiz_parameters);
                final SubLObject title = (NIL != is_personP) ? $str525$Checking_constituents_of_the_huma : $str526$Checking_for_possible_abbreviatio;
                final SubLObject v_question = format(NIL, $str527$For_the_name__s__please_complete_, phrase);
                final SubLObject preds = (NIL != is_personP) ? $lexwiz_person_sub_predicates$.getGlobalValue() : filter_abbreviation_predicates(cyc_term);
                final SubLObject labels = Mapping.mapcar(symbol_function(LEX_DESCRIBE_TERM), preds);
                SubLObject defaults = NIL;
                SubLObject descriptions = NIL;
                final SubLObject tip = NIL;
                final SubLObject sizes = NIL;
                thread.resetMultipleValues();
                final SubLObject defaults_$1 = sme_li_proper_name_infer_proper_name_sub_predications_method(self, cyc_term, phrase, preds);
                final SubLObject descriptions_$2 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                defaults = defaults_$1;
                descriptions = descriptions_$2;
                _csetf_sme_lexwiz_proper_sub_predicates(lexwiz_settings, preds);
                sme_lexification_interlocutor_set_answer_method(self, NIL);
                if ((((NIL != is_personP) && pred.equal($$$nameString)) && length(name_tokenize(phrase)).numG(ONE_INTEGER)) || length(name_tokenize(phrase)).numGE($lexwiz_abbreviation_check_min_words$.getGlobalValue())) {
                    final SubLObject reason = (NIL != is_personP) ? $$$for_a_person : $$$quite_long;
                    final SubLObject message = format(NIL, $str531$Since__s_is__a__checking_addition, phrase, reason);
                    sme_lexification_interlocutor_mumble_method(self, message);
                    sme_lexification_interlocutor_ask_generic_multiple_free_form_method(self, title, v_question, tip, labels, sizes, defaults, descriptions);
                } else {
                    sme_lexification_interlocutor_next_interaction_method(self);
                }
                sublisp_throw($sym523$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_settings(self, lexwiz_settings);
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_proper_name_method = Errors.handleThrowable(ccatch_env_var, $sym523$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_proper_name_method;
    }

    public static SubLObject sme_li_proper_name_check_refined_predication_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_proper_name_method = NIL;
        final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings(self);
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym535$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD);
            try {
                final SubLObject refined_predications = sme_lexification_interlocutor_get_answer_method(self);
                final SubLObject predicates = sme_lexwiz_proper_sub_predicates(lexwiz_settings);
                final SubLObject v_term = lexification_wizard.lexwiz_term(lexwiz_parameters);
                SubLObject list_var = NIL;
                SubLObject predication = NIL;
                SubLObject i = NIL;
                list_var = refined_predications;
                predication = list_var.first();
                for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , predication = list_var.first() , i = add(ONE_INTEGER, i)) {
                    if (NIL != string_utilities.non_empty_stringP(predication)) {
                        final SubLObject predicate = elt(predicates, i);
                        lexification_wizard._csetf_lexwiz_other_formulas(lexwiz_parameters, cons(list(predicate, v_term, predication), lexification_wizard.lexwiz_other_formulas(lexwiz_parameters)));
                    }
                }
                sme_lexification_interlocutor_next_interaction_method(self);
                sublisp_throw($sym535$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_settings(self, lexwiz_settings);
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_proper_name_method = Errors.handleThrowable(ccatch_env_var, $sym535$OUTER_CATCH_FOR_SME_LI_PROPER_NAME_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_proper_name_method;
    }

    public static SubLObject sme_li_proper_name_infer_proper_name_sub_predications_method(final SubLObject self, final SubLObject v_term, SubLObject phrase, final SubLObject proper_name_predicates) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject title = $str457$;
        SubLObject suffix = $str457$;
        final SubLObject is_personP = equal($lexwiz_person_sub_predicates$.getGlobalValue(), proper_name_predicates);
        SubLObject sub_predications = NIL;
        SubLObject descriptions = NIL;
        SubLObject name_tokens = name_tokenize(phrase);
        if ((NIL != is_name_titleP(name_tokens.first())) || (length(name_tokens.first()).numG(TWO_INTEGER) && (NIL != string_utilities.ends_with(name_tokens.first(), $str498$_, UNPROVIDED)))) {
            title = name_tokens.first();
            phrase = lexification_utilities.join_words(name_tokens.rest());
        }
        name_tokens = name_tokenize(phrase);
        if (NIL != string_utilities.ends_with(list_utilities.penultimate_one(name_tokens), $str540$_, UNPROVIDED)) {
            suffix = list_utilities.last_one(name_tokens);
            phrase = lexification_utilities.join_words(list_utilities.remove_last(name_tokens));
            phrase = string_utilities.trim_sides(phrase, CHAR_comma);
        }
        name_tokens = name_tokenize(phrase);
        final SubLObject family_name_firstP = has_family_name_firstP(v_term);
        final SubLObject family_name_position = (NIL != family_name_firstP) ? ZERO_INTEGER : number_utilities.f_1_(length(name_tokens));
        final SubLObject given_name_position = (NIL != family_name_firstP) ? number_utilities.f_1_(length(name_tokens)) : ZERO_INTEGER;
        final SubLObject middle_name_position = (NIL != family_name_firstP) ? number_utilities.f_1_(given_name_position) : ONE_INTEGER;
        if (NIL != family_name_firstP) {
            sme_lexification_interlocutor_mumble_method(self, format(NIL, $str541$Assuming_family_name_given_first_, phrase));
        }
        SubLObject cdolist_list_var = proper_name_predicates;
        SubLObject predicate = NIL;
        predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject sub_name = $str457$;
            SubLObject description = $str457$;
            final SubLObject pcase_var = predicate;
            if (pcase_var.eql($$familyName)) {
                sub_name = elt(name_tokens, family_name_position);
            } else
                if (pcase_var.eql($$givenNames)) {
                    if (!family_name_position.numE(given_name_position)) {
                        final SubLObject given_name = elt(name_tokens, given_name_position);
                        if (NIL == name_abbreviationP(given_name)) {
                            sub_name = given_name;
                        }
                    }
                } else
                    if (pcase_var.eql($$middleName)) {
                        if (length(name_tokens).numG(TWO_INTEGER)) {
                            final SubLObject middle_name = elt(name_tokens, middle_name_position);
                            if (NIL == name_abbreviationP(middle_name)) {
                                sub_name = middle_name;
                            }
                        }
                    } else
                        if (pcase_var.eql($$titleOfPerson_String)) {
                            sub_name = title;
                        } else
                            if (pcase_var.eql($$nameSuffix)) {
                                sub_name = suffix;
                            } else
                                if (pcase_var.eql($$initialsString)) {
                                    if (NIL == is_personP) {
                                        description = $str548$_first_letters_of_names__ex__FDR_;
                                    }
                                } else
                                    if (pcase_var.eql($$initialismString)) {
                                        description = $str550$_first_letters__ex__UNHCR__NATO__;
                                    } else
                                        if (pcase_var.eql($$acronymString)) {
                                            description = $str552$_prefixes__ex__RADAR___RAdio_Dete;
                                        } else
                                            if (pcase_var.eql($$abbreviationString_PN)) {
                                                description = $str554$_short_form__ex__dict___parens_;
                                            } else
                                                if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                                                    format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str149$Warning__, $str555$Unexpected_pred__s_in_infer_prope), predicate);
                                                    force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                                                }









            sub_predications = cons(sub_name, sub_predications);
            descriptions = cons(description, descriptions);
            cdolist_list_var = cdolist_list_var.rest();
            predicate = cdolist_list_var.first();
        } 
        return values(nreverse(sub_predications), nreverse(descriptions));
    }

    public static SubLObject name_abbreviationP(final SubLObject name) {
        return makeBoolean(length(name).numE(ONE_INTEGER) || (NIL != string_utilities.ends_with(name, $str498$_, UNPROVIDED)));
    }

    public static SubLObject sme_li_denotational_initialize_method(final SubLObject self) {
        SubLObject sme_state = get_sme_lexification_interlocutor_sme_state(self);
        sme_lexification_interlocutor_initialize_method(self);
        sme_state = instances.get_slot(self, SME_STATE);
        set_sme_lexification_interlocutor_sme_state(self, sme_state);
        methods.funcall_instance_method_with_1_args(sme_state, SET_STATES, $list558);
        return self;
    }

    public static SubLObject sme_li_denotational_guess_headword_position_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_denotational_method = NIL;
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym562$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD);
            try {
                final SubLObject v_term = lexification_wizard.lexwiz_term(lexwiz_parameters);
                final SubLObject phrase = lexification_wizard.lexwiz_phrase(lexwiz_parameters);
                final SubLObject phrase_words = lexification_utilities.lex_string_tokenize(phrase, NIL);
                final SubLObject title = $str563$Guessing_the_headword_of_the_phra;
                final SubLObject guessed_offset = lexification_utilities.most_likely_headword(phrase_words);
                final SubLObject guessed_headword = elt(phrase_words, guessed_offset);
                final SubLObject v_question = format(NIL, $str564$Is__s_a_type_of__s_, phrase, guessed_headword);
                final SubLObject tip = $headword_guessing_tip$.getGlobalValue();
                SubLObject skipP = numE(length(phrase_words), ONE_INTEGER);
                lexification_wizard._csetf_lexwiz_headword_position(lexwiz_parameters, number_utilities.f_1X(guessed_offset));
                final SubLObject headword_denots = sme_lexification_interlocutor_phrase_denotations_method(self, guessed_headword);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    if (NIL != intersection(headword_denots, cons(v_term, genls.min_genls(v_term, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED)) {
                        sme_lexification_interlocutor_mumble_method(self, format(NIL, $str567$Since__s_is_a_type_of__s__assumin, phrase, guessed_headword));
                        sme_lexification_interlocutor_set_answer_method(self, T);
                        skipP = T;
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
                if (NIL == skipP) {
                    sme_lexification_interlocutor_ask_generic_boolean_method(self, title, v_question, tip, UNPROVIDED);
                } else {
                    sme_lexification_interlocutor_next_interaction_method(self);
                }
                sublisp_throw($sym562$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, T);
            } finally {
                final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_denotational_method = Errors.handleThrowable(ccatch_env_var, $sym562$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_denotational_method;
    }

    public static SubLObject sme_li_denotational_check_guessed_headword_position_method(final SubLObject self) {
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        final SubLObject headword_okP = sme_lexification_interlocutor_get_answer_method(self);
        if (NIL == headword_okP) {
            final SubLObject phrase = lexification_wizard.lexwiz_phrase(lexwiz_parameters);
            final SubLObject phrase_words = lexification_utilities.lex_string_tokenize(phrase, NIL);
            final SubLObject rejected_position = lexification_wizard.lexwiz_headword_position(lexwiz_parameters);
            if (NIL != list_utilities.lengthG(phrase_words, TWO_INTEGER, UNPROVIDED)) {
                lexification_wizard._csetf_lexwiz_headword_position(lexwiz_parameters, MINUS_ONE_INTEGER);
            } else
                if (NIL != list_utilities.lengthE(phrase_words, TWO_INTEGER, UNPROVIDED)) {
                    lexification_wizard._csetf_lexwiz_headword_position(lexwiz_parameters, subtract(THREE_INTEGER, rejected_position));
                }

        }
        sme_lexification_interlocutor_next_interaction_method(self);
        return T;
    }

    public static SubLObject sme_li_denotational_ask_headword_position_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_denotational_method = NIL;
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym574$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD);
            try {
                final SubLObject phrase = lexification_wizard.lexwiz_phrase(lexwiz_parameters);
                final SubLObject title = $str575$Checking_the_qualified_word_of_th;
                final SubLObject v_question = format(NIL, $str576$In__s__which_word_is_being_qualif, phrase);
                final SubLObject tip = $headword_selection_tip$.getGlobalValue();
                final SubLObject phrase_words = lexification_utilities.lex_string_tokenize(phrase, NIL);
                final SubLObject offsets = Mapping.mapcar(symbol_function(TO_STRING), list_utilities.num_list(length(phrase_words), UNPROVIDED));
                final SubLObject default_position = lexification_wizard.lexwiz_headword_position(lexwiz_parameters);
                if (length(phrase_words).numG(ONE_INTEGER) && default_position.numLE(ZERO_INTEGER)) {
                    sme_lexification_interlocutor_ask_generic_enumerated_method(self, title, v_question, phrase_words, tip, offsets, UNPROVIDED);
                } else {
                    sme_lexification_interlocutor_set_answer_method(self, offsets.first());
                    sme_lexification_interlocutor_next_interaction_method(self);
                }
                sublisp_throw($sym574$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_denotational_method = Errors.handleThrowable(ccatch_env_var, $sym574$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_denotational_method;
    }

    public static SubLObject sme_li_denotational_check_headword_position_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state(self);
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        final SubLObject phrase_words = lexification_utilities.lex_string_tokenize(lexification_wizard.lexwiz_phrase(lexwiz_parameters), NIL);
        final SubLObject v_answer = sme_lexification_interlocutor_get_answer_method(self);
        final SubLObject headword_offset = (NIL != string_utilities.non_empty_stringP(v_answer)) ? lexification_utilities.extract_integer(v_answer, UNPROVIDED) : MINUS_ONE_INTEGER;
        if (lexification_wizard.lexwiz_headword_position(lexwiz_parameters).numLE(ZERO_INTEGER)) {
            lexification_wizard._csetf_lexwiz_headword_position(lexwiz_parameters, number_utilities.f_1X(headword_offset));
            if ((!headword_offset.numGE(ZERO_INTEGER)) || (!headword_offset.numL(length(phrase_words)))) {
                if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
                    format(StreamsLow.$trace_output$.getDynamicValue(thread), $str581$invalid_headword_offset___a__, headword_offset);
                    force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                }
                lexification_wizard._csetf_lexwiz_error_message(lexwiz_parameters, $str582$The_headword_position_must_be_spe);
                SubLObject new_states = methods.funcall_instance_method_with_0_args(sme_state, GET_STATES);
                new_states = append($list583, new_states);
                methods.funcall_instance_method_with_1_args(sme_state, SET_STATES, new_states);
            }
        }
        sme_lexification_interlocutor_next_interaction_method(self);
        return T;
    }

    public static SubLObject sme_li_denotational_ask_part_of_speech_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_denotational_method = NIL;
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym587$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD);
            try {
                final SubLObject v_term = lexification_wizard.lexwiz_term(lexwiz_parameters);
                final SubLObject phrase_words = lexification_utilities.lex_string_tokenize(lexification_wizard.lexwiz_phrase(lexwiz_parameters), NIL);
                final SubLObject headword_position = lexification_wizard.lexwiz_headword_position(lexwiz_parameters);
                final SubLObject headword = elt(phrase_words, number_utilities.f_1_(headword_position));
                SubLObject title = format(NIL, $str588$Determining_how_the_word___a__is_, headword, lexification_wizard.lexwiz_phrase(lexwiz_parameters));
                final SubLObject tip = NIL;
                SubLObject v_default = NIL;
                if (length(phrase_words).numE(ONE_INTEGER)) {
                    title = format(NIL, $str589$Checking_usage_of___a_, headword);
                }
                thread.resetMultipleValues();
                final SubLObject choices = sme_li_denotational_derive_part_of_speech_examples_method(self, headword, phrase_words, headword_position, v_term);
                final SubLObject part_of_speech_values = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject default_pos = most_likely_headword_part_of_speech(headword, part_of_speech_values);
                if (NIL != default_pos) {
                    sme_lexification_interlocutor_mumble_method(self, format(NIL, $str590$Pre_selecting__a_as_part_of_speec, lexification_utilities.lex_describe_term(default_pos, UNPROVIDED), headword));
                    v_default = position(default_pos, part_of_speech_values, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                sme_lexification_interlocutor_ask_generic_enumerated_method(self, title, $str591$Which_of_the_following_sounds_bes, choices, tip, part_of_speech_values, v_default);
                sublisp_throw($sym587$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_denotational_method = Errors.handleThrowable(ccatch_env_var, $sym587$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_denotational_method;
    }

    public static SubLObject sme_li_denotational_check_part_of_speech_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_denotational_method = NIL;
        final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state(self);
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym595$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD);
            try {
                final SubLObject part_of_speech = lexification_utilities.lex_fort_for_string(sme_lexification_interlocutor_get_answer_method(self));
                lexification_wizard._csetf_lexwiz_headword_part_of_speech(lexwiz_parameters, part_of_speech);
                if (NIL == part_of_speech) {
                    if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
                        format(StreamsLow.$trace_output$.getDynamicValue(thread), $str596$invalid_headword_part_of_speech__, part_of_speech);
                        force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                    }
                    lexification_wizard._csetf_lexwiz_error_message(lexwiz_parameters, $str597$The_headword_part_of_speech_must_);
                    SubLObject new_states = methods.funcall_instance_method_with_0_args(sme_state, GET_STATES);
                    new_states = append($list598, new_states);
                    methods.funcall_instance_method_with_1_args(sme_state, SET_STATES, new_states);
                }
                sme_lexification_interlocutor_next_interaction_method(self);
                sublisp_throw($sym595$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_sme_state(self, sme_state);
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_denotational_method = Errors.handleThrowable(ccatch_env_var, $sym595$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_denotational_method;
    }

    public static SubLObject sme_li_denotational_show_headword_variations_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_denotational_method = NIL;
        final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings(self);
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym602$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD);
            try {
                final SubLObject phrase = lexification_wizard.lexwiz_phrase(lexwiz_parameters);
                final SubLObject v_term = lexification_wizard.lexwiz_term(lexwiz_parameters);
                final SubLObject term_desc = sme_lexification_interlocutor_describe_term_method(self, v_term);
                final SubLObject mapping_mt = lexification_wizard.determine_lexical_mapping_mt(lexification_wizard.lexwiz_mt(lexwiz_parameters), UNPROVIDED);
                final SubLObject phrase_words = lexification_utilities.lex_string_tokenize(phrase, NIL);
                final SubLObject headword_position = lexification_wizard.lexwiz_headword_position(lexwiz_parameters);
                final SubLObject headword = elt(phrase_words, number_utilities.f_1_(headword_position));
                final SubLObject part_of_speech = lexification_wizard.lexwiz_headword_part_of_speech(lexwiz_parameters);
                _csetf_sme_lexwiz_new_mappingP(lexwiz_settings, makeBoolean(NIL == lexicon_accessors.words_of_stringXspeech_part(headword, part_of_speech, NIL, mapping_mt, UNPROVIDED)));
                sme_li_denotational_add_lexical_mapping_method(self, headword, part_of_speech, mapping_mt, UNPROVIDED);
                final SubLObject variants = derive_part_of_speech_variations(phrase, headword_position, part_of_speech, mapping_mt);
                final SubLObject title = format(NIL, $str603$Checking_variant_phrases_due_to_v, headword);
                SubLObject v_question = format(NIL, $str604$Are_the_following_good_ways_to_re, new SubLObject[]{ term_desc, $newline_tab$.getGlobalValue(), string_utilities.join_strings(variants, $newline_tab$.getGlobalValue()) });
                final SubLObject tip = $str605$The_main_thing_to_check_for_is_od;
                if (NIL == variants) {
                    v_question = format(NIL, $str606$There_are_no_variations_for_the_p, phrase);
                }
                if (NIL != sme_lexification_interlocutor_forge_aheadP_method(self)) {
                    final SubLObject message = format(NIL, $str607$Assuming_that_the_following_varia, phrase, NIL != variants ? string_utilities.join_strings(variants, UNPROVIDED) : $str519$n_a);
                    sme_lexification_interlocutor_mumble_method(self, message);
                    sme_lexification_interlocutor_set_answer_method(self, T);
                    sme_lexification_interlocutor_next_interaction_method(self);
                } else {
                    sme_lexification_interlocutor_ask_generic_boolean_method(self, title, v_question, tip, UNPROVIDED);
                }
                sublisp_throw($sym602$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_settings(self, lexwiz_settings);
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_denotational_method = Errors.handleThrowable(ccatch_env_var, $sym602$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_denotational_method;
    }

    public static SubLObject sme_li_denotational_check_headword_variations_method(final SubLObject self) {
        final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state(self);
        final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings(self);
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        final SubLObject phrase_words = lexification_utilities.lex_string_tokenize(lexification_wizard.lexwiz_phrase(lexwiz_parameters), NIL);
        final SubLObject mapping_mt = lexification_wizard.determine_lexical_mapping_mt(lexification_wizard.lexwiz_mt(lexwiz_parameters), UNPROVIDED);
        final SubLObject headword_position = lexification_wizard.lexwiz_headword_position(lexwiz_parameters);
        final SubLObject headword = elt(phrase_words, number_utilities.f_1_(headword_position));
        final SubLObject part_of_speech = lexification_wizard.lexwiz_headword_part_of_speech(lexwiz_parameters);
        final SubLObject okP = sme_lexification_interlocutor_get_answer_method(self);
        if (NIL == okP) {
            if (NIL != sme_lexwiz_new_mappingP(lexwiz_settings)) {
                sme_li_denotational_remove_lexical_mapping_method(self, headword, part_of_speech, mapping_mt, UNPROVIDED);
            }
            SubLObject new_states = methods.funcall_instance_method_with_0_args(sme_state, GET_STATES);
            new_states = append($list611, new_states);
            methods.funcall_instance_method_with_1_args(sme_state, SET_STATES, new_states);
        }
        sme_lexification_interlocutor_next_interaction_method(self);
        return T;
    }

    public static SubLObject sme_li_denotational_add_lexical_mapping_method(final SubLObject self, final SubLObject wordform, final SubLObject part_of_speech, SubLObject mt, SubLObject word_type) {
        if (mt == UNPROVIDED) {
            mt = $$EnglishMt;
        }
        if (word_type == UNPROVIDED) {
            word_type = $$EnglishWord;
        }
        if (NIL == lexicon_accessors.words_of_stringXspeech_part(wordform, part_of_speech, NIL, mt, UNPROVIDED)) {
            return sme_li_denotational_do_lexical_mapping_method(self, wordform, part_of_speech, mt, word_type, T);
        }
        return NIL;
    }

    public static SubLObject sme_li_denotational_remove_lexical_mapping_method(final SubLObject self, final SubLObject wordform, final SubLObject part_of_speech, SubLObject mt, SubLObject word_type) {
        if (mt == UNPROVIDED) {
            mt = $$EnglishMt;
        }
        if (word_type == UNPROVIDED) {
            word_type = $$EnglishWord;
        }
        return sme_li_denotational_do_lexical_mapping_method(self, wordform, part_of_speech, mt, word_type, NIL);
    }

    public static SubLObject sme_li_denotational_do_lexical_mapping_method(final SubLObject self, final SubLObject wordform, final SubLObject part_of_speech, final SubLObject mt, final SubLObject word_type, final SubLObject addP) {
        final SubLObject proxy = get_sme_lexification_interlocutor_proxy(self);
        final SubLObject create_constant_fn = methods.resolve_method(CREATE_CONSTANT, class_name_from_object(proxy));
        return lexification_wizard.do_lexical_mapping_int(wordform, part_of_speech, mt, word_type, addP, create_constant_fn, proxy);
    }

    public static SubLObject sme_li_denotational_derive_part_of_speech_examples_method(final SubLObject self, final SubLObject headword, final SubLObject phrase_words, final SubLObject headword_position, final SubLObject v_term) {
        SubLObject examples = NIL;
        final SubLObject candidates = $sme_parts_of_speech$.getGlobalValue();
        SubLObject parts_of_speech = NIL;
        SubLObject cdolist_list_var = candidates;
        SubLObject part_of_speech = NIL;
        part_of_speech = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject headword_position_zero_index = number_utilities.f_1_(headword_position);
            final SubLObject example = sme_li_denotational_derive_part_of_speech_example_method(self, headword, phrase_words, headword_position_zero_index, part_of_speech, v_term);
            if (NIL != example) {
                examples = cons(example, examples);
                parts_of_speech = cons(part_of_speech, parts_of_speech);
            }
            cdolist_list_var = cdolist_list_var.rest();
            part_of_speech = cdolist_list_var.first();
        } 
        return values(reverse(examples), reverse(parts_of_speech));
    }

    public static SubLObject sme_li_denotational_derive_part_of_speech_example_method(final SubLObject self, final SubLObject word, final SubLObject phrase_words, final SubLObject headword_position, final SubLObject part_of_speech, SubLObject v_term) {
        if (v_term == UNPROVIDED) {
            v_term = $$Thing;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_denotational_method = NIL;
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD);
            try {
                final SubLObject phrase = string_utilities.bunge(phrase_words, UNPROVIDED);
                final SubLObject mt = lexification_wizard.lexwiz_mt(lexwiz_parameters);
                final SubLObject singular_word = lexification_utilities.singularize_word(word, mt);
                final SubLObject singular_phrase = string_utilities.bunge(list_utilities.replace_nth(headword_position, singular_word, phrase_words), UNPROVIDED);
                final SubLObject lowercase_word = Strings.string_downcase(word, UNPROVIDED, UNPROVIDED);
                final SubLObject lowercase_phrase = string_utilities.bunge(list_utilities.replace_nth(headword_position, lowercase_word, phrase_words), UNPROVIDED);
                final SubLObject plural_word = lexification_utilities.pluralize_word(singular_word, mt);
                final SubLObject plural_phrase = string_utilities.bunge(list_utilities.replace_nth(headword_position, plural_word, phrase_words), UNPROVIDED);
                final SubLObject infinitive_word = ((NIL != lexicon_accessors.genl_posP(part_of_speech, $$Verb, UNPROVIDED)) || (NIL != lexicon_accessors.genl_posP(part_of_speech, $$DeVerbalNoun, UNPROVIDED))) ? sme_li_inflected_verb_to_infinitive(word) : NIL;
                final SubLObject infinitive_phrase = string_utilities.bunge(list_utilities.replace_nth(headword_position, infinitive_word, phrase_words), UNPROVIDED);
                SubLObject a_det = pph_utilities.add_determiner(singular_phrase).first();
                if (NIL == a_det) {
                    a_det = $$$a;
                }
                if (NIL != sme_li_denotational_disable_speech_part_selection_method(self, word, part_of_speech, v_term)) {
                    sublisp_throw($sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, NIL);
                }
                if (part_of_speech.eql($$CountNoun)) {
                    sublisp_throw($sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, format(NIL, $str639$many__a___a__a__countable_noun_li, new SubLObject[]{ plural_phrase, a_det, singular_phrase }));
                } else
                    if (part_of_speech.eql($$MassNoun)) {
                        sublisp_throw($sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, format(NIL, $str641$much__a__some__a__uncountable_nou, lowercase_phrase, lowercase_phrase));
                    } else
                        if (part_of_speech.eql($$AgentiveNoun)) {
                            sublisp_throw($sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, format(NIL, $str643$_a__a_is_able_to__a__agentive_nou, new SubLObject[]{ a_det, singular_phrase, infinitive_word }));
                        } else
                            if (part_of_speech.eql($$GerundiveNoun)) {
                                sublisp_throw($sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, format(NIL, $str645$_a_involves_ability_to__a__gerund, singular_phrase, infinitive_phrase));
                            } else
                                if (part_of_speech.eql($$ProperCountNoun)) {
                                    sublisp_throw($sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, format(NIL, $str647$proper_name_for_countable_objects));
                                } else
                                    if (part_of_speech.eql($$ProperMassNoun)) {
                                        sublisp_throw($sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, format(NIL, $str649$proper_name_for_substance_like_ob));
                                    } else
                                        if (part_of_speech.eql($$Verb)) {
                                            sublisp_throw($sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, format(NIL, $str650$to__a___a_unexpectedly__verb_like, infinitive_phrase, phrase));
                                        } else
                                            if (part_of_speech.eql($$Adjective)) {
                                                sublisp_throw($sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, format(NIL, $str652$very__a__most__a__adjective_like_, phrase, phrase));
                                            } else
                                                if (part_of_speech.eql($$Adverb)) {
                                                    sublisp_throw($sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, format(NIL, $str654$so__a__as__a_as______adverb_like_, phrase, phrase));
                                                } else
                                                    if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                                                        format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str149$Warning__, $str655$Unable_to_derive_example_for_part), part_of_speech);
                                                        force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                                                    }









                sublisp_throw($sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_denotational_method = Errors.handleThrowable(ccatch_env_var, $sym634$OUTER_CATCH_FOR_SME_LI_DENOTATIONAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_denotational_method;
    }

    public static SubLObject sme_li_inflected_verb_to_infinitive(final SubLObject inflected_verb) {
        SubLObject infinitive = NIL;
        if (NIL == infinitive) {
            SubLObject csome_list_var;
            SubLObject word;
            for (csome_list_var = lexicon_cache.words_of_string(inflected_verb, UNPROVIDED, UNPROVIDED, UNPROVIDED), word = NIL, word = csome_list_var.first(); (NIL == infinitive) && (NIL != csome_list_var); infinitive = lexicon_cache.first_string_of_wordXpred(word, $$infinitive, UNPROVIDED) , csome_list_var = csome_list_var.rest() , word = csome_list_var.first()) {
            }
        }
        if (infinitive.isString()) {
            return infinitive;
        }
        return morphology.inflected_verb_to_infinitive(inflected_verb);
    }

    public static SubLObject sme_li_denotational_disable_speech_part_selection_method(final SubLObject self, final SubLObject word, final SubLObject part_of_speech, SubLObject v_term) {
        if (v_term == UNPROVIDED) {
            v_term = $$Thing;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject singular_word = lexification_utilities.singularize_word(word, UNPROVIDED);
        final SubLObject term_desc = lexification_utilities.lex_describe_term(v_term, UNPROVIDED);
        SubLObject disableP = NIL;
        if (part_of_speech.eql($$Adjective)) {
            final SubLObject term_is_attributeP = NIL;
            final SubLObject reason = $$$adjectival_suffix;
            if (NIL == lexification_utilities.likely_adjectiveP(word, UNPROVIDED)) {
                disableP = makeBoolean(NIL == term_is_attributeP);
            }
            if (NIL == disableP) {
                sme_lexification_interlocutor_mumble_method(self, format(NIL, $str662$Enabling_adjective_for__s_since__, word, reason));
            }
        } else
            if (part_of_speech.eql($$Adverb)) {
                if (NIL == lexification_utilities.likely_adverbP(word, UNPROVIDED)) {
                    disableP = T;
                }
            } else
                if (part_of_speech.eql($$AgentiveNoun)) {
                    if (NIL == lexification_utilities.likely_has_part_of_speechP($$AgentiveNoun, singular_word, UNPROVIDED)) {
                        disableP = T;
                    }
                } else
                    if (part_of_speech.eql($$GerundiveNoun)) {
                        if (NIL == lexification_utilities.likely_has_part_of_speechP($$GerundiveNoun, singular_word, UNPROVIDED)) {
                            disableP = T;
                        }
                    } else
                        if (part_of_speech.eql($$ProperCountNoun) || part_of_speech.eql($$ProperMassNoun)) {
                            disableP = string_utilities.lower_case_string_p(word);
                        } else
                            if (part_of_speech.eql($$CountNoun)) {
                                final SubLObject word_units = lexicon_accessors.words_of_stringXspeech_part(word, $$CountNoun, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL == disableP) {
                                    SubLObject csome_list_var = $list664;
                                    SubLObject speech_part = NIL;
                                    speech_part = csome_list_var.first();
                                    while ((NIL == disableP) && (NIL != csome_list_var)) {
                                        if ((NIL != subl_promotions.memberP(speech_part, lexicon_accessors.pos_of_string(word, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) && ((NIL == word_units) || (NIL != intersection(word_units, lexicon_accessors.words_of_stringXspeech_part(word, speech_part, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)))) {
                                            sme_lexification_interlocutor_mumble_method(self, format(NIL, $str663$Disabling_simple_noun_for__s_sinc, word, lexification_utilities.lex_describe_term(speech_part, UNPROVIDED)));
                                            disableP = T;
                                        }
                                        csome_list_var = csome_list_var.rest();
                                        speech_part = csome_list_var.first();
                                    } 
                                }
                            } else
                                if (!part_of_speech.eql($$MassNoun)) {
                                    if (part_of_speech.eql($$Verb)) {
                                        if (NIL != lexification_utilities.likely_verbP(singular_word, UNPROVIDED)) {
                                            sme_lexification_interlocutor_mumble_method(self, format(NIL, $str665$Enabling_verb_for__s_since_it_is_, word));
                                        } else
                                            if (NIL != genls.genl_in_any_mtP(v_term, $$Event)) {
                                                sme_lexification_interlocutor_mumble_method(self, format(NIL, $str667$Enabling_verb_for__s_since___a__i, word, term_desc));
                                            } else {
                                                disableP = T;
                                            }

                                    } else
                                        if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                                            format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str149$Warning__, $str668$Unexpected_part_of_speech__during), part_of_speech);
                                            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                                        }

                                }






        return disableP;
    }

    public static SubLObject sme_li_relational_initialize_method(final SubLObject self) {
        sme_lexification_interlocutor_initialize_method(self);
        return self;
    }

    public static SubLObject sme_li_relational_initiate_interaction_method(final SubLObject self, final SubLObject session_parameters, final SubLObject callback_fn, final SubLObject callbackup_data, final SubLObject new_proxy, final SubLObject question_answering_agent_class) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sme_state = get_sme_lexification_interlocutor_sme_state(self);
        final SubLObject v_term = lexification_wizard.lexwiz_term(session_parameters);
        final SubLObject num_args = lexification_utilities.lex_arity_in_any_mt(v_term);
        final SubLObject initial_states = $list673;
        final SubLObject arg_states = $list674;
        final SubLObject final_states = $list675;
        final SubLObject state_sequence = copy_list(initial_states);
        if (lexification_wizard.lexwiz_lexical_mt(session_parameters).equal(lexicon_vars.$default_lexification_mt$.getDynamicValue(thread))) {
            lexification_wizard._csetf_lexwiz_lexical_mt(session_parameters, misc_kb_utilities.fort_for_string(lexicon_vars.$default_predicate_lexification_mt$.getDynamicValue(thread)));
        }
        if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str676$initial_state_sequence__s__, state_sequence);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(num_args); i = add(i, ONE_INTEGER)) {
            nconc(state_sequence, copy_list(arg_states));
        }
        nconc(state_sequence, copy_list(final_states));
        methods.funcall_instance_method_with_1_args(sme_state, SET_STATES, state_sequence);
        if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str677$sme_li_relational_next_states___a, state_sequence);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        sme_lexification_interlocutor_initiate_interaction_method(self, session_parameters, callback_fn, callbackup_data, new_proxy, question_answering_agent_class);
        return NIL;
    }

    public static SubLObject sme_li_relational_ask_sample_sentence_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_relational_method = NIL;
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym681$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD);
            try {
                final SubLObject phrase = lexification_wizard.lexwiz_phrase(lexwiz_parameters);
                final SubLObject v_term = lexification_wizard.lexwiz_term(lexwiz_parameters);
                final SubLObject term_desc = sme_lexification_interlocutor_describe_term_method(self, v_term);
                final SubLObject title = $$$Determining_relation_template;
                final SubLObject phrase_type = (NIL != lexification_utilities.is_functionalP(v_term)) ? $$$phrase : $$$sentence;
                final SubLObject v_question = format(NIL, $str685$Enter_a__a_illustrating_the___a__, phrase_type, term_desc);
                SubLObject tip = $sample_sentence_tip$.getGlobalValue();
                final SubLObject term_comments = lexification_utilities.get_term_comments(v_term);
                final SubLObject size = $int$60;
                final SubLObject v_default = phrase;
                if (NIL != string_utilities.non_empty_stringP(term_comments)) {
                    tip = format(NIL, $str414$_a_____a, term_comments, tip);
                }
                sublisp_throw($sym681$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD, sme_lexification_interlocutor_ask_generic_free_form_method(self, title, v_question, tip, size, v_default));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_relational_method = Errors.handleThrowable(ccatch_env_var, $sym681$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_relational_method;
    }

    public static SubLObject sme_li_relational_check_sample_sentence_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_relational_method = NIL;
        final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings(self);
        try {
            thread.throwStack.push($sym689$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD);
            try {
                _csetf_sme_lexwiz_current_arg(lexwiz_settings, ONE_INTEGER);
                final SubLObject sentence = sme_lexification_interlocutor_get_answer_method(self);
                _csetf_sme_lexwiz_sample_sentence(lexwiz_settings, sentence);
                _csetf_sme_lexwiz_sentence_words(lexwiz_settings, lexification_utilities.lex_string_tokenize(sentence, T));
                sme_lexification_interlocutor_next_interaction_method(self);
                sublisp_throw($sym689$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_settings(self, lexwiz_settings);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_relational_method = Errors.handleThrowable(ccatch_env_var, $sym689$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_relational_method;
    }

    public static SubLObject sme_li_relational_ask_argument_values_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_relational_method = NIL;
        final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings(self);
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym693$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD);
            try {
                final SubLObject v_term = lexification_wizard.lexwiz_term(lexwiz_parameters);
                final SubLObject term_desc = sme_lexification_interlocutor_describe_term_method(self, v_term);
                final SubLObject sentence = sme_lexwiz_sample_sentence(lexwiz_settings);
                final SubLObject word_choices = lexification_utilities.lex_string_tokenize(sentence, T);
                final SubLObject arg_num = sme_lexwiz_current_arg(lexwiz_settings);
                final SubLObject title = $$$Determining_relational_arguments;
                final SubLObject v_arg_type = lexification_utilities.get_relation_argument_type(v_term, arg_num);
                final SubLObject arg_type_description = lexification_utilities.lex_describe_term(v_arg_type, UNPROVIDED);
                final SubLObject v_question = format(NIL, $str695$Select_phrase_for_argument__a___a, new SubLObject[]{ arg_num, arg_type_description, term_desc });
                final SubLObject offsets = Mapping.mapcar(symbol_function(TO_STRING), list_utilities.num_list(length(word_choices), UNPROVIDED));
                final SubLObject tip = lexification_utilities.get_term_comments(v_term);
                sublisp_throw($sym693$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD, sme_lexification_interlocutor_ask_generic_multiple_selection_method(self, title, v_question, word_choices, tip, offsets, UNPROVIDED));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_settings(self, lexwiz_settings);
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_relational_method = Errors.handleThrowable(ccatch_env_var, $sym693$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_relational_method;
    }

    public static SubLObject sme_li_relational_check_argument_values_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_relational_method = NIL;
        final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings(self);
        try {
            thread.throwStack.push($sym699$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD);
            try {
                final SubLObject offsets = Mapping.mapcar(symbol_function(EXTRACT_INTEGER), sme_lexification_interlocutor_get_answer_method(self));
                final SubLObject words = sme_lexwiz_sentence_words(lexwiz_settings);
                final SubLObject start = offsets.first();
                final SubLObject end = number_utilities.f_1X(list_utilities.last_one(offsets));
                final SubLObject arg_phrase = lexification_utilities.join_words(subseq(words, start, end));
                _csetf_sme_lexwiz_arg_offsets(lexwiz_settings, cons(list(start, end), sme_lexwiz_arg_offsets(lexwiz_settings)));
                _csetf_sme_lexwiz_sentence_args(lexwiz_settings, cons(arg_phrase, sme_lexwiz_sentence_args(lexwiz_settings)));
                sme_lexification_interlocutor_next_interaction_method(self);
                sublisp_throw($sym699$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_settings(self, lexwiz_settings);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_relational_method = Errors.handleThrowable(ccatch_env_var, $sym699$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_relational_method;
    }

    public static SubLObject sme_li_relational_ask_argument_part_of_speech_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_relational_method = NIL;
        final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings(self);
        try {
            thread.throwStack.push($sym704$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD);
            try {
                final SubLObject arg_phrase = sme_lexwiz_sentence_args(lexwiz_settings).first();
                final SubLObject speech_parts = rtp_phrase_parts_of_speech(arg_phrase);
                final SubLObject choices = Mapping.mapcar(symbol_function(STRING_FOR_FORT), speech_parts);
                final SubLObject title = $str706$Determining_part_of_speech_for_ar;
                final SubLObject v_question = format(NIL, $str707$Select_part_of_speech_for__s, arg_phrase);
                final SubLObject tip = $argument_part_of_speech_tip$.getGlobalValue();
                if (length(choices).numG(ONE_INTEGER)) {
                    sme_lexification_interlocutor_ask_generic_enumerated_method(self, title, v_question, choices, tip, speech_parts, UNPROVIDED);
                } else {
                    sme_lexification_interlocutor_set_answer_method(self, speech_parts.first());
                    sme_lexification_interlocutor_next_interaction_method(self);
                }
                sublisp_throw($sym704$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_settings(self, lexwiz_settings);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_relational_method = Errors.handleThrowable(ccatch_env_var, $sym704$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_relational_method;
    }

    public static SubLObject sme_li_relational_check_argument_part_of_speech_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_relational_method = NIL;
        final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings(self);
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym711$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD);
            try {
                final SubLObject v_term = lexification_wizard.lexwiz_term(lexwiz_parameters);
                final SubLObject num_args = lexification_utilities.lex_arity_in_any_mt(v_term);
                SubLObject speech_part = lexification_utilities.lex_fort_for_string(sme_lexification_interlocutor_get_answer_method(self));
                if (NIL == forts.fort_p(speech_part)) {
                    speech_part = $$Noun;
                }
                _csetf_sme_lexwiz_arg_speech_parts(lexwiz_settings, cons(speech_part, sme_lexwiz_arg_speech_parts(lexwiz_settings)));
                _csetf_sme_lexwiz_current_arg(lexwiz_settings, number_utilities.f_1X(sme_lexwiz_current_arg(lexwiz_settings)));
                if (sme_lexwiz_current_arg(lexwiz_settings).numG(num_args)) {
                    sme_li_relational_derive_relational_templates_method(self);
                }
                sme_lexification_interlocutor_next_interaction_method(self);
                sublisp_throw($sym711$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_settings(self, lexwiz_settings);
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_relational_method = Errors.handleThrowable(ccatch_env_var, $sym711$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_relational_method;
    }

    public static SubLObject sme_li_relational_derive_relational_templates_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_relational_method = NIL;
        final SubLObject lexwiz_settings = get_sme_lexification_interlocutor_lexwiz_settings(self);
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym716$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD);
            try {
                final SubLObject v_term = lexification_wizard.lexwiz_term(lexwiz_parameters);
                final SubLObject arg_offsets = reverse(sme_lexwiz_arg_offsets(lexwiz_settings));
                final SubLObject arg_speech_parts = reverse(sme_lexwiz_arg_speech_parts(lexwiz_settings));
                final SubLObject sentence_words = sme_lexwiz_sentence_words(lexwiz_settings);
                thread.resetMultipleValues();
                final SubLObject parse_template = relation_lexifier.lexify_relation(v_term, arg_offsets, sentence_words, arg_speech_parts, UNPROVIDED, UNPROVIDED);
                final SubLObject new_generation_template = thread.secondMultipleValue();
                final SubLObject old_generation_template = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != $use_genformat_template$.getGlobalValue()) {
                    lexification_wizard._csetf_lexwiz_template(lexwiz_parameters, third(old_generation_template));
                    lexification_wizard._csetf_lexwiz_template_args(lexwiz_parameters, format(NIL, $str717$_S, fourth(old_generation_template)));
                } else {
                    lexification_wizard._csetf_lexwiz_template(lexwiz_parameters, new_generation_template);
                    lexification_wizard._csetf_lexwiz_template_args(lexwiz_parameters, NIL);
                }
                lexification_wizard._csetf_lexwiz_parse_template_formula(lexwiz_parameters, parse_template);
                sublisp_throw($sym716$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_settings(self, lexwiz_settings);
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_relational_method = Errors.handleThrowable(ccatch_env_var, $sym716$OUTER_CATCH_FOR_SME_LI_RELATIONAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_relational_method;
    }

    public static SubLObject sme_li_post_general_initialize_method(final SubLObject self) {
        SubLObject sme_state = get_sme_lexification_interlocutor_sme_state(self);
        sme_lexification_interlocutor_initialize_method(self);
        sme_state = instances.get_slot(self, SME_STATE);
        set_sme_lexification_interlocutor_sme_state(self, sme_state);
        methods.funcall_instance_method_with_1_args(sme_state, SET_STATES, $list720);
        return self;
    }

    public static SubLObject sme_li_post_general_ask_preferred_lexification_status_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_post_general_method = NIL;
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym724$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD);
            try {
                final SubLObject phrase = lexification_wizard.lexwiz_phrase(lexwiz_parameters);
                final SubLObject v_term = lexification_wizard.lexwiz_term(lexwiz_parameters);
                final SubLObject term_desc = sme_lexification_interlocutor_describe_term_method(self, v_term);
                final SubLObject lex_term = lexification_utilities.string_for_fort(v_term);
                final SubLObject title = $str725$Checking_status_of_preferred_refe;
                final SubLObject v_question = format(NIL, $str726$Is___a__the_most_common_way_of_re, phrase, term_desc);
                final SubLObject other_phrases = remove(phrase, list_utilities.remove_if_not(STRINGP, lexification_utilities.lexified_phrases_for_term(v_term, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject tip = (NIL != other_phrases) ? format(NIL, $str728$Other_ways_of_referring_to__a_are, new SubLObject[]{ lex_term, CHAR_tab, string_utilities.join_strings(other_phrases, $newline_tab$.getGlobalValue()) }) : NIL;
                SubLObject skipP = lexification_utilities.is_relationalP(lexification_wizard.lexwiz_term(lexwiz_parameters));
                if (phrase.equalp(term_desc) && (NIL == other_phrases)) {
                    sme_lexification_interlocutor_set_answer_method(self, T);
                    skipP = T;
                }
                if (NIL != skipP) {
                    sme_lexification_interlocutor_next_interaction_method(self);
                } else {
                    sme_lexification_interlocutor_ask_generic_boolean_method(self, title, v_question, tip, UNPROVIDED);
                }
                sublisp_throw($sym724$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_post_general_method = Errors.handleThrowable(ccatch_env_var, $sym724$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_post_general_method;
    }

    public static SubLObject sme_li_post_general_check_preferred_lexification_status_method(final SubLObject self) {
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        if (NIL == lexification_utilities.is_relationalP(lexification_wizard.lexwiz_term(lexwiz_parameters))) {
            lexification_wizard._csetf_lexwiz_is_preferredP(lexwiz_parameters, sme_lexification_interlocutor_get_answer_method(self));
        }
        sme_lexification_interlocutor_next_interaction_method(self);
        return T;
    }

    public static SubLObject sme_li_post_general_do_lexification_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_post_general_method = NIL;
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym735$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD);
            try {
                lexification_wizard.trace_lexification_parameters(lexwiz_parameters, UNPROVIDED);
                lexification_wizard.derive_lexification_formula(lexwiz_parameters);
                lexification_wizard.perform_lexification(lexwiz_parameters);
                final SubLObject title = $$$Checking_results_of_lexification;
                final SubLObject error_in_lexificationP = string_utilities.non_empty_stringP(lexification_wizard.lexwiz_error_message(lexwiz_parameters));
                final SubLObject status = (NIL != error_in_lexificationP) ? $str737$Problem_processing_the_lexificati : $str738$Lexification_complete_;
                final SubLObject v_question = format(NIL, $str739$_a____Press_OK_to_proceed, status);
                final SubLObject choices = NIL;
                final SubLObject tip = (NIL != error_in_lexificationP) ? format(NIL, $str740$This_type_of_error_shouldn_t_occu, lexification_wizard.lexwiz_error_message(lexwiz_parameters)) : NIL;
                if (NIL != error_in_lexificationP) {
                    sme_lexification_interlocutor_ask_generic_enumerated_method(self, title, v_question, choices, tip, UNPROVIDED, UNPROVIDED);
                } else {
                    sme_lexification_interlocutor_next_interaction_method(self);
                }
                sublisp_throw($sym735$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_post_general_method = Errors.handleThrowable(ccatch_env_var, $sym735$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_post_general_method;
    }

    public static SubLObject sme_li_post_general_check_lexification_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_li_post_general_method = NIL;
        final SubLObject lexwiz_parameters = get_sme_lexification_interlocutor_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym744$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD);
            try {
                final SubLObject phrase = lexification_wizard.lexwiz_phrase(lexwiz_parameters);
                final SubLObject v_term = lexification_wizard.lexwiz_term(lexwiz_parameters);
                final SubLObject term_desc = sme_lexification_interlocutor_describe_term_method(self, v_term);
                final SubLObject completion_message = format(NIL, $str745$Done_mapping_phrase__s_into_conce, phrase, term_desc);
                sme_lexification_interlocutor_mumble_method(self, completion_message);
                sme_lexification_interlocutor_next_interaction_method(self);
                sublisp_throw($sym744$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_interlocutor_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_li_post_general_method = Errors.handleThrowable(ccatch_env_var, $sym744$OUTER_CATCH_FOR_SME_LI_POST_GENERAL_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_li_post_general_method;
    }

    public static SubLObject sme_lexification_wizard_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject question_answering_agent_class = get_sme_lexification_wizard_question_answering_agent_class(self);
        SubLObject proxy = get_sme_lexification_wizard_proxy(self);
        SubLObject new_current_interaction = get_sme_lexification_wizard_new_current_interaction(self);
        SubLObject current_interaction = get_sme_lexification_wizard_current_interaction(self);
        SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters(self);
        SubLObject next_states = get_sme_lexification_wizard_next_states(self);
        SubLObject state = get_sme_lexification_wizard_state(self);
        object.object_initialize_method(self);
        lexification_wizard.init_lexification_wizard(UNPROVIDED);
        state = $GET_PRE_GENERAL;
        set_sme_lexification_wizard_state(self, state);
        next_states = $list749;
        set_sme_lexification_wizard_next_states(self, next_states);
        lexwiz_parameters = lexification_wizard.copy_lexification_parameters(lexification_wizard.$lexwiz_defaults$.getDynamicValue(thread));
        set_sme_lexification_wizard_lexwiz_parameters(self, lexwiz_parameters);
        current_interaction = NIL;
        set_sme_lexification_wizard_current_interaction(self, current_interaction);
        new_current_interaction = NIL;
        set_sme_lexification_wizard_new_current_interaction(self, new_current_interaction);
        proxy = methods.funcall_class_method_with_0_args(INTERFACE_PROXY, NEW);
        set_sme_lexification_wizard_proxy(self, proxy);
        if ((NIL != $use_blackboardP$.getGlobalValue()) && (NIL == rkf_sme_lexification_wizard.$simulated_blackboardP$.getGlobalValue())) {
            proxy = methods.funcall_class_method_with_0_args(RKF_BB_PROXY, NEW);
            set_sme_lexification_wizard_proxy(self, proxy);
        }
        question_answering_agent_class = HTML_QUESTION_ANSWERING_AGENT;
        set_sme_lexification_wizard_question_answering_agent_class(self, question_answering_agent_class);
        return self;
    }

    public static SubLObject sme_lexification_wizard_copy_method(final SubLObject self, final SubLObject other) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_wizard_method = NIL;
        SubLObject question_answering_agent_class = get_sme_lexification_wizard_question_answering_agent_class(self);
        SubLObject proxy = get_sme_lexification_wizard_proxy(self);
        SubLObject new_current_interaction = get_sme_lexification_wizard_new_current_interaction(self);
        SubLObject current_interaction = get_sme_lexification_wizard_current_interaction(self);
        SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters(self);
        SubLObject next_states = get_sme_lexification_wizard_next_states(self);
        SubLObject state = get_sme_lexification_wizard_state(self);
        try {
            thread.throwStack.push($sym754$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD);
            try {
                state = instances.get_slot(other, STATE);
                next_states = instances.get_slot(other, NEXT_STATES);
                lexwiz_parameters = lexification_wizard.copy_lexification_parameters(instances.get_slot(other, LEXWIZ_PARAMETERS));
                current_interaction = instances.get_slot(other, CURRENT_INTERACTION);
                new_current_interaction = instances.get_slot(other, NEW_CURRENT_INTERACTION);
                proxy = instances.get_slot(other, PROXY);
                question_answering_agent_class = instances.get_slot(other, QUESTION_ANSWERING_AGENT_CLASS);
                sublisp_throw($sym754$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_wizard_question_answering_agent_class(self, question_answering_agent_class);
                    set_sme_lexification_wizard_proxy(self, proxy);
                    set_sme_lexification_wizard_new_current_interaction(self, new_current_interaction);
                    set_sme_lexification_wizard_current_interaction(self, current_interaction);
                    set_sme_lexification_wizard_lexwiz_parameters(self, lexwiz_parameters);
                    set_sme_lexification_wizard_next_states(self, next_states);
                    set_sme_lexification_wizard_state(self, state);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_wizard_method = Errors.handleThrowable(ccatch_env_var, $sym754$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_wizard_method;
    }

    public static SubLObject sme_lexification_wizard_new_copy_method(final SubLObject self, final SubLObject other) {
        final SubLObject new_lexwiz = methods.funcall_class_method_with_0_args(SME_LEXIFICATION_WIZARD, NEW);
        methods.funcall_instance_method_with_1_args(new_lexwiz, COPY, other);
        return new_lexwiz;
    }

    public static SubLObject sme_lexification_wizard_set_term_method(final SubLObject self, final SubLObject new_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_wizard_method = NIL;
        final SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym761$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD);
            try {
                if (NIL != lexwiz_parameters) {
                    lexification_wizard._csetf_lexwiz_term(lexwiz_parameters, new_term);
                }
                sublisp_throw($sym761$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_wizard_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_wizard_method = Errors.handleThrowable(ccatch_env_var, $sym761$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_wizard_method;
    }

    public static SubLObject sme_lexification_wizard_get_term_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_wizard_method = NIL;
        final SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym765$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD);
            try {
                if (NIL != lexwiz_parameters) {
                    sublisp_throw($sym765$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD, lexification_wizard.lexwiz_term(lexwiz_parameters));
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_wizard_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_wizard_method = Errors.handleThrowable(ccatch_env_var, $sym765$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_wizard_method;
    }

    public static SubLObject sme_lexification_wizard_set_phrase_method(final SubLObject self, final SubLObject new_phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_wizard_method = NIL;
        final SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym770$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD);
            try {
                if (NIL != lexwiz_parameters) {
                    lexification_wizard._csetf_lexwiz_phrase(lexwiz_parameters, new_phrase);
                }
                sublisp_throw($sym770$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_wizard_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_wizard_method = Errors.handleThrowable(ccatch_env_var, $sym770$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_wizard_method;
    }

    public static SubLObject sme_lexification_wizard_get_phrase_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_wizard_method = NIL;
        final SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym774$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD);
            try {
                if (NIL != lexwiz_parameters) {
                    sublisp_throw($sym774$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD, lexification_wizard.lexwiz_phrase(lexwiz_parameters));
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_wizard_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_wizard_method = Errors.handleThrowable(ccatch_env_var, $sym774$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_wizard_method;
    }

    public static SubLObject sme_lexification_wizard_set_mt_method(final SubLObject self, final SubLObject new_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_wizard_method = NIL;
        final SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym779$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD);
            try {
                if (NIL != lexwiz_parameters) {
                    lexification_wizard._csetf_lexwiz_mt(lexwiz_parameters, new_mt);
                }
                sublisp_throw($sym779$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_wizard_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_wizard_method = Errors.handleThrowable(ccatch_env_var, $sym779$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_wizard_method;
    }

    public static SubLObject sme_lexification_wizard_get_mt_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_wizard_method = NIL;
        final SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym783$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD);
            try {
                if (NIL != lexwiz_parameters) {
                    sublisp_throw($sym783$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD, lexification_wizard.lexwiz_mt(lexwiz_parameters));
                }
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_wizard_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_wizard_method = Errors.handleThrowable(ccatch_env_var, $sym783$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_wizard_method;
    }

    public static SubLObject sme_lexification_wizard_set_lexical_mt_method(final SubLObject self, final SubLObject new_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_wizard_method = NIL;
        final SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym787$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD);
            try {
                if (NIL != lexwiz_parameters) {
                    lexification_wizard._csetf_lexwiz_lexical_mt(lexwiz_parameters, misc_kb_utilities.fort_for_string(new_mt));
                }
                sublisp_throw($sym787$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_wizard_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_wizard_method = Errors.handleThrowable(ccatch_env_var, $sym787$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_wizard_method;
    }

    public static SubLObject sme_lexification_wizard_set_parsing_mt_method(final SubLObject self, final SubLObject new_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_wizard_method = NIL;
        final SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym791$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD);
            try {
                if (NIL != lexwiz_parameters) {
                    lexification_wizard._csetf_lexwiz_parse_template_mt(lexwiz_parameters, new_mt);
                }
                sublisp_throw($sym791$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_wizard_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_wizard_method = Errors.handleThrowable(ccatch_env_var, $sym791$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_wizard_method;
    }

    public static SubLObject sme_lexification_wizard_set_generation_mt_method(final SubLObject self, final SubLObject new_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_sme_lexification_wizard_method = NIL;
        final SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters(self);
        try {
            thread.throwStack.push($sym795$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD);
            try {
                if (NIL != lexwiz_parameters) {
                    lexification_wizard._csetf_lexwiz_generation_mt(lexwiz_parameters, new_mt);
                }
                sublisp_throw($sym795$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_sme_lexification_wizard_lexwiz_parameters(self, lexwiz_parameters);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_sme_lexification_wizard_method = Errors.handleThrowable(ccatch_env_var, $sym795$OUTER_CATCH_FOR_SME_LEXIFICATION_WIZARD_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_sme_lexification_wizard_method;
    }

    public static SubLObject sme_lexification_wizard_lexify_method(final SubLObject self, SubLObject v_term, SubLObject phrase, SubLObject mt) {
        if (v_term == UNPROVIDED) {
            v_term = NIL;
        }
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject question_answering_agent_class = get_sme_lexification_wizard_question_answering_agent_class(self);
        final SubLObject proxy = get_sme_lexification_wizard_proxy(self);
        SubLObject new_current_interaction = get_sme_lexification_wizard_new_current_interaction(self);
        SubLObject current_interaction = get_sme_lexification_wizard_current_interaction(self);
        final SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters(self);
        if (NIL != v_term) {
            lexification_wizard._csetf_lexwiz_term(lexwiz_parameters, v_term);
        }
        if (NIL != phrase) {
            lexification_wizard._csetf_lexwiz_phrase(lexwiz_parameters, phrase);
        }
        if (NIL != mt) {
            lexification_wizard._csetf_lexwiz_mt(lexwiz_parameters, mt);
        }
        if (lexification_wizard.lexwiz_mt(lexwiz_parameters).isString()) {
            lexification_wizard._csetf_lexwiz_mt(lexwiz_parameters, misc_kb_utilities.fort_for_string(lexification_wizard.lexwiz_mt(lexwiz_parameters)));
        }
        current_interaction = methods.funcall_class_method_with_0_args(SME_LI_PRE_GENERAL, NEW);
        set_sme_lexification_wizard_current_interaction(self, current_interaction);
        new_current_interaction = current_interaction;
        set_sme_lexification_wizard_new_current_interaction(self, new_current_interaction);
        final SubLObject notification_fn = methods.resolve_method(PROCESS_STATUS_UPDATE, SME_LEXIFICATION_WIZARD);
        methods.funcall_instance_method_with_5_args(current_interaction, INITIATE_INTERACTION, lexwiz_parameters, notification_fn, self, proxy, question_answering_agent_class);
        return NIL;
    }

    public static SubLObject sme_lexification_wizard_lexify_first_termstring_method(final SubLObject self, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLObject phrase = lexicon_utilities.first_termstring_phrase(v_term);
        return sme_lexification_wizard_lexify_method(self, v_term, phrase, mt);
    }

    public static SubLObject sme_lexification_wizard_continue_lexify_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject question_answering_agent_class = get_sme_lexification_wizard_question_answering_agent_class(self);
        final SubLObject proxy = get_sme_lexification_wizard_proxy(self);
        SubLObject new_current_interaction = get_sme_lexification_wizard_new_current_interaction(self);
        SubLObject current_interaction = get_sme_lexification_wizard_current_interaction(self);
        final SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters(self);
        SubLObject next_states = get_sme_lexification_wizard_next_states(self);
        SubLObject state = get_sme_lexification_wizard_state(self);
        state = next_states.first();
        set_sme_lexification_wizard_state(self, state);
        next_states = next_states.rest();
        set_sme_lexification_wizard_next_states(self, next_states);
        final SubLObject notification_fn = methods.resolve_method(PROCESS_STATUS_UPDATE, SME_LEXIFICATION_WIZARD);
        SubLObject interaction_class = NIL;
        final SubLObject pcase_var = state;
        if (pcase_var.eql($GET_SPECIFIC)) {
            lexification_wizard._csetf_lexwiz_state(lexwiz_parameters, $NEED_INPUT);
            if (NIL != lexification_utilities.is_relationalP(lexification_wizard.lexwiz_term(lexwiz_parameters))) {
                interaction_class = SME_LI_RELATIONAL;
            } else
                if (NIL != lexification_wizard.lexwiz_is_properP(lexwiz_parameters)) {
                    interaction_class = SME_LI_PROPER_NAME;
                } else {
                    interaction_class = SME_LI_DENOTATIONAL;
                }

            current_interaction = methods.funcall_class_method_with_0_args(interaction_class, NEW);
            set_sme_lexification_wizard_current_interaction(self, current_interaction);
            new_current_interaction = current_interaction;
            set_sme_lexification_wizard_new_current_interaction(self, new_current_interaction);
            methods.funcall_instance_method_with_5_args(current_interaction, INITIATE_INTERACTION, lexwiz_parameters, notification_fn, self, proxy, question_answering_agent_class);
            lexification_wizard.trace_lexification_parameters(lexwiz_parameters, UNPROVIDED);
        } else
            if (pcase_var.eql($GET_POST_GENERAL)) {
                lexification_wizard._csetf_lexwiz_state(lexwiz_parameters, $DONE);
                current_interaction = methods.funcall_class_method_with_0_args(SME_LI_POST_GENERAL, NEW);
                set_sme_lexification_wizard_current_interaction(self, current_interaction);
                new_current_interaction = current_interaction;
                set_sme_lexification_wizard_new_current_interaction(self, new_current_interaction);
                methods.funcall_instance_method_with_5_args(current_interaction, INITIATE_INTERACTION, lexwiz_parameters, notification_fn, self, proxy, question_answering_agent_class);
            } else
                if (pcase_var.eql($DONE)) {
                    if (NIL != proxy) {
                        methods.funcall_instance_method_with_0_args(proxy, END_SESSION);
                    }
                } else
                    if ((NIL != state) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                        format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str149$Warning__, $str810$Unexpected_state_keyword___a__), state);
                        force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                    }



        return T;
    }

    public static SubLObject sme_lexification_wizard_process_status_update_method(final SubLObject self, final SubLObject status, SubLObject server, SubLObject user_data) {
        if (server == UNPROVIDED) {
            server = NIL;
        }
        if (user_data == UNPROVIDED) {
            user_data = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject current_interaction = get_sme_lexification_wizard_current_interaction(self);
        if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str814$sme_lexwiz_process_status_update_, new SubLObject[]{ status, server, user_data });
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        if ((!server.eql(current_interaction)) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str149$Warning__, $str367$____assertion_failed___a______), $list815);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        if (NIL != current_interaction) {
            if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_verbose$.getGlobalValue()))) {
                format(StreamsLow.$trace_output$.getDynamicValue(thread), $str816$current_interaction___s__, current_interaction);
                force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
            }
            lex_describe_instance(lexification_utilities.$lex_very_verbose$.getGlobalValue(), current_interaction);
            sme_lexification_wizard_update_lexification_parameters_method(self);
        }
        final SubLObject use_cloneP = makeBoolean(NIL == $use_blackboardP$.getGlobalValue());
        final SubLObject lexwiz_clone = (NIL != use_cloneP) ? methods.funcall_class_method_with_1_args(SME_LEXIFICATION_WIZARD, NEW_COPY, self) : self;
        methods.funcall_instance_method_with_0_args(lexwiz_clone, CONTINUE_LEXIFY);
        return NIL;
    }

    public static SubLObject sme_lexification_wizard_update_lexification_parameters_method(final SubLObject self) {
        final SubLObject current_interaction = get_sme_lexification_wizard_current_interaction(self);
        SubLObject lexwiz_parameters = get_sme_lexification_wizard_lexwiz_parameters(self);
        if (NIL != current_interaction) {
            final SubLObject revised_lexwiz_parameters = instances.get_slot(current_interaction, LEXWIZ_PARAMETERS);
            lexification_wizard.trace_lexification_parameters(revised_lexwiz_parameters, UNPROVIDED);
            lexwiz_parameters = lexification_wizard.copy_lexification_parameters(revised_lexwiz_parameters);
            set_sme_lexification_wizard_lexwiz_parameters(self, lexwiz_parameters);
            instances.set_slot(current_interaction, LEXWIZ_PARAMETERS, lexwiz_parameters);
        }
        return NIL;
    }

    public static SubLObject rtp_parts_of_speech(final SubLObject words) {
        final SubLObject word_speech_parts = Mapping.mapcar(symbol_function(POS_OF_STRING), words);
        final SubLObject all_speech_parts = apply(symbol_function(APPEND), word_speech_parts);
        return remove_duplicates(cons($$Noun, all_speech_parts), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rtp_phrase_parts_of_speech(final SubLObject phrase) {
        final SubLObject phrase_words = lexification_utilities.lex_string_tokenize(phrase, NIL);
        SubLObject speech_parts = NIL;
        if (NIL != lexicon_accessors.known_proper_noun_phraseP(phrase)) {
            speech_parts = $list822;
        } else {
            if (NIL == phrase_words) {
                return NIL;
            }
            if (length(phrase_words).numE(ONE_INTEGER)) {
                speech_parts = lexicon_accessors.pos_of_string(phrase_words.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                final SubLObject first_word_speech_parts = lexicon_accessors.pos_of_string(phrase_words.first(), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL == speech_parts) {
                    SubLObject csome_list_var = first_word_speech_parts;
                    SubLObject speech_part = NIL;
                    speech_part = csome_list_var.first();
                    while ((NIL == speech_parts) && (NIL != csome_list_var)) {
                        if (lexification_utilities.keyword_for_pos(speech_part, UNPROVIDED) == $DET) {
                            speech_parts = $list824;
                        }
                        csome_list_var = csome_list_var.rest();
                        speech_part = csome_list_var.first();
                    } 
                }
                if (NIL == speech_parts) {
                    speech_parts = lexicon_accessors.pos_of_string(list_utilities.last_one(phrase_words), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
        return remove_duplicates(cons($$Noun, relation_lexifier.get_rtp_useful_speech_parts(speech_parts)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject list_sme_lexification_settings(final SubLObject v_object, SubLObject include_idP) {
        if (include_idP == UNPROVIDED) {
            include_idP = NIL;
        }
        SubLObject settings = list(new SubLObject[]{ sme_lexwiz_is_abbreviationP(v_object), sme_lexwiz_new_mappingP(v_object), sme_lexwiz_okP(v_object), sme_lexwiz_sample_sentence(v_object), sme_lexwiz_sentence_words(v_object), sme_lexwiz_sentence_args(v_object), sme_lexwiz_arg_offsets(v_object), sme_lexwiz_current_arg(v_object), sme_lexwiz_arg_speech_parts(v_object), sme_lexwiz_proper_sub_predicates(v_object) });
        if (NIL != include_idP) {
            settings = cons(v_object, settings);
        }
        return settings;
    }

    public static SubLObject copy_sme_lexification_settings(final SubLObject other) {
        final SubLObject v_new = make_sme_lexification_settings(UNPROVIDED);
        _csetf_sme_lexwiz_is_abbreviationP(v_new, sme_lexwiz_is_abbreviationP(other));
        _csetf_sme_lexwiz_new_mappingP(v_new, sme_lexwiz_new_mappingP(other));
        _csetf_sme_lexwiz_okP(v_new, sme_lexwiz_okP(other));
        _csetf_sme_lexwiz_sample_sentence(v_new, sme_lexwiz_sample_sentence(other));
        _csetf_sme_lexwiz_sentence_words(v_new, copy_list(sme_lexwiz_sentence_words(other)));
        _csetf_sme_lexwiz_sentence_args(v_new, copy_list(sme_lexwiz_sentence_args(other)));
        _csetf_sme_lexwiz_arg_offsets(v_new, copy_list(sme_lexwiz_arg_offsets(other)));
        _csetf_sme_lexwiz_current_arg(v_new, sme_lexwiz_current_arg(other));
        _csetf_sme_lexwiz_arg_speech_parts(v_new, sme_lexwiz_arg_speech_parts(other));
        _csetf_sme_lexwiz_proper_sub_predicates(v_new, sme_lexwiz_proper_sub_predicates(other));
        return v_new;
    }

    public static SubLObject trace_sme_lexification_settings(final SubLObject v_object, SubLObject debug_level) {
        if (debug_level == UNPROVIDED) {
            debug_level = lexification_utilities.$lex_verbose$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(debug_level)) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str825$SME_Lexification_settings____S__, list_sme_lexification_settings(v_object, UNPROVIDED));
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return T;
    }

    public static SubLObject reset_sme_lexification_parameters() {
        lexification_wizard.reset_lexification_parameters(UNPROVIDED);
        return T;
    }

    public static SubLObject set_object_data(final SubLObject id, final SubLObject object_data) {
        return sethash(id, $sme_lexification_object_id_hash$.getGlobalValue(), object_data);
    }

    public static SubLObject get_object_data(final SubLObject id) {
        return gethash(id, $sme_lexification_object_id_hash$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject init_proper_name_pred_choices() {
        determine_proper_name_pred_choices(NIL, T);
        determine_proper_name_pred_choices(NIL, NIL);
        return T;
    }

    public static SubLObject determine_proper_name_pred_choices(final SubLObject v_term, SubLObject is_abbreviationP) {
        if (is_abbreviationP == UNPROVIDED) {
            is_abbreviationP = NIL;
        }
        final SubLObject all_abbreviation_preds = Mapping.mapcar(symbol_function(STRING_FOR_FORT), lexification_utilities.get_abbreviation_predicates());
        final SubLObject filtered_preds = remove($$$nameString, lexification_wizard.filter_proper_name_predicates(v_term), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject abbreviation_preds = intersection(all_abbreviation_preds, filtered_preds, symbol_function(EQUAL), UNPROVIDED);
        final SubLObject regular_preds = set_difference(filtered_preds, abbreviation_preds, symbol_function(EQUAL), UNPROVIDED);
        final SubLObject preds_to_chose_from = (NIL != is_abbreviationP) ? abbreviation_preds : regular_preds;
        final SubLObject normal_name_text = format(NIL, $str826$A_normal__a, NIL != is_abbreviationP ? $$$abbreviation : $$$name);
        final SubLObject pre_choices = list(normal_name_text, $str457$);
        final SubLObject pre_predicates = list($$$nameString, $str457$);
        final SubLObject post_choices = $list829;
        final SubLObject post_predicates = $list830;
        final SubLObject default_offset = ZERO_INTEGER;
        SubLObject choices = NIL;
        SubLObject predicates = NIL;
        SubLObject cdolist_list_var = Sort.sort(preds_to_chose_from, symbol_function($sym833$STRING_), UNPROVIDED);
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pred_desciption = lexification_utilities.lex_describe_term(lexification_utilities.lex_fort_for_string(pred), UNPROVIDED);
            final SubLObject examples = list_utilities.remove_if_not(symbol_function(STRINGP), lexification_utilities.examples_for_pred(lexification_utilities.lex_fort_for_string(pred), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject formatted_examples = format(NIL, $str831$_a___a, pred_desciption, string_utilities.join_strings(examples, $str832$__));
            choices = cons(formatted_examples, choices);
            predicates = cons(pred, predicates);
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        if (NIL != choices) {
            choices = append(pre_choices, reverse(choices), post_choices);
            predicates = append(pre_predicates, reverse(predicates), post_predicates);
        }
        return values(choices, predicates, default_offset);
    }

    public static SubLObject derive_part_of_speech_variations(final SubLObject phrase, final SubLObject headword_position, final SubLObject part_of_speech, SubLObject lexical_mt) {
        if (lexical_mt == UNPROVIDED) {
            lexical_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == headword_position) || (NIL == part_of_speech))) {
            Errors.error($str834$non_null_headword_position_and_pa);
        }
        SubLObject variations = NIL;
        final SubLObject phrase_words = lexification_utilities.lex_string_tokenize(phrase, NIL);
        final SubLObject headword = elt(phrase_words, number_utilities.f_1_(headword_position));
        final SubLObject pos_keyword = lexification_utilities.precise_keyword_for_pos(part_of_speech, UNPROVIDED);
        if ((NIL == headword) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str149$Warning__, $str835$Invalid_headword_position__a_for_), headword_position, phrase);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        SubLObject cdolist_list_var = lexicon_utilities.word_variants(headword, pos_keyword, T, NIL, lexical_mt);
        SubLObject headword_variant = NIL;
        headword_variant = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject variant_words = list_utilities.replace_nth(number_utilities.f_1_(headword_position), headword_variant, phrase_words);
            final SubLObject variation = lexification_utilities.join_words(variant_words);
            if (!variation.equalp(phrase)) {
                final SubLObject item_var = variation;
                if (NIL == member(item_var, variations, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                    variations = cons(item_var, variations);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            headword_variant = cdolist_list_var.first();
        } 
        return variations;
    }

    public static SubLObject most_likely_headword_part_of_speech(final SubLObject headword, final SubLObject speech_parts) {
        SubLObject max_usage = ZERO_INTEGER;
        SubLObject most_common_speech_part = NIL;
        SubLObject cdolist_list_var = speech_parts;
        SubLObject speech_part = NIL;
        speech_part = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject usage = lexification_utilities.wordform_part_of_speech_usage(headword, speech_part);
            if (usage.numG(max_usage)) {
                most_common_speech_part = speech_part;
                max_usage = usage;
            }
            cdolist_list_var = cdolist_list_var.rest();
            speech_part = cdolist_list_var.first();
        } 
        return most_common_speech_part;
    }

    public static SubLObject init_sme_lexification_wizard() {
        if (NIL == $sme_lexwiz_initializedP$.getGlobalValue()) {
            init_proper_name_pred_choices();
            $sme_lexwiz_initializedP$.setGlobalValue(T);
        }
        return T;
    }

    public static SubLObject class_name_from_object(final SubLObject v_object) {
        if (NIL != v_object) {
            return subloop_structures.class_name(subloop_structures.instance_class(v_object));
        }
        return NIL;
    }

    public static SubLObject initialize_name_titles() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $known_name_titles$.setGlobalValue(NIL);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = isa.all_fort_instances($$Title, UNPROVIDED, UNPROVIDED);
            SubLObject title = NIL;
            title = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject title_desc = lexification_utilities.lex_describe_term(title, UNPROVIDED);
                final SubLObject item_var;
                title_desc = item_var = string_utilities.strip_trailer(title_desc, $str836$__title);
                if (NIL == member(item_var, $known_name_titles$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $known_name_titles$.setGlobalValue(cons(item_var, $known_name_titles$.getGlobalValue()));
                }
                cdolist_list_var = cdolist_list_var.rest();
                title = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        SubLObject cdolist_list_var2 = kb_mapping_utilities.pred_values_in_any_mt($$SalutationMapping, $$codeMapping, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject title2 = NIL;
        title2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject item_var2 = title2;
            if (NIL == member(item_var2, $known_name_titles$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $known_name_titles$.setGlobalValue(cons(item_var2, $known_name_titles$.getGlobalValue()));
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            title2 = cdolist_list_var2.first();
        } 
        return T;
    }

    public static SubLObject is_name_titleP(final SubLObject string) {
        if (NIL == $known_name_titles$.getGlobalValue()) {
            initialize_name_titles();
        }
        return subl_promotions.memberP(string, $known_name_titles$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED);
    }

    public static SubLObject has_family_name_firstP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject family_name_firstP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            family_name_firstP = isa.isa_anyP(v_term, $family_name_first_groups$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return family_name_firstP;
    }

    public static SubLObject name_tokenize(final SubLObject string) {
        return remove($str457$, string_utilities.string_tokenize(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject filter_abbreviation_predicates(final SubLObject v_term) {
        final SubLObject all_abbreviation_preds = Mapping.mapcar(symbol_function(STRING_FOR_FORT), lexification_utilities.get_abbreviation_predicates());
        final SubLObject filtered_preds = remove($$$nameString, lexification_wizard.filter_proper_name_predicates(v_term), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject abbreviation_preds = intersection(all_abbreviation_preds, filtered_preds, symbol_function(EQUAL), UNPROVIDED);
        return Mapping.mapcar(symbol_function(LEX_FORT_FOR_STRING), abbreviation_preds);
    }

    public static SubLObject derive_initialism(final SubLObject phrase) {
        final SubLObject name_tokens = remove_if(symbol_function($sym841$CLOSED_LEXICAL_CLASS_STRING_), name_tokenize(phrase), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject initialism = Strings.make_string(length(name_tokens), UNPROVIDED);
        SubLObject list_var = NIL;
        SubLObject word = NIL;
        SubLObject i = NIL;
        list_var = name_tokens;
        word = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , word = list_var.first() , i = add(ONE_INTEGER, i)) {
            if (NIL != list_utilities.lengthG(word, ZERO_INTEGER, UNPROVIDED)) {
                Strings.set_char(initialism, i, Strings.sublisp_char(word, ZERO_INTEGER));
            }
        }
        return initialism;
    }

    public static SubLObject lex_normalize_string(final SubLObject phrase) {
        if (phrase.isString()) {
            return string_utilities.trim_whitespace(string_utilities.unquote_string(phrase));
        }
        return NIL;
    }

    public static SubLObject map_method(final SubLObject instance, final SubLObject method_name, final SubLObject input_list) {
        final SubLObject class_name = class_name_from_object(instance);
        final SubLObject method_fn = methods.resolve_method(method_name, class_name);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = input_list;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(funcall(method_fn, instance, item), result);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject declare_sme_lexification_wizard_file() {
        declareFunction(me, "sme_lexwiz_use_blackboardP", "SME-LEXWIZ-USE-BLACKBOARD?", 0, 0, false);
        declareFunction(me, "sme_lexwiz_title", "SME-LEXWIZ-TITLE", 0, 0, false);
        declareFunction(me, "phrase_specification_tip", "PHRASE-SPECIFICATION-TIP", 0, 0, false);
        declareFunction(me, "lex_describe_instance", "LEX-DESCRIBE-INSTANCE", 2, 0, false);
        declareFunction(me, "sme_lexification_settings_print_function_trampoline", "SME-LEXIFICATION-SETTINGS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "sme_lexification_settings_p", "SME-LEXIFICATION-SETTINGS-P", 1, 0, false);
        new sme_lexification_wizard.$sme_lexification_settings_p$UnaryFunction();
        declareFunction(me, "sme_lexwiz_is_abbreviationP", "SME-LEXWIZ-IS-ABBREVIATION?", 1, 0, false);
        declareFunction(me, "sme_lexwiz_new_mappingP", "SME-LEXWIZ-NEW-MAPPING?", 1, 0, false);
        declareFunction(me, "sme_lexwiz_okP", "SME-LEXWIZ-OK?", 1, 0, false);
        declareFunction(me, "sme_lexwiz_sample_sentence", "SME-LEXWIZ-SAMPLE-SENTENCE", 1, 0, false);
        declareFunction(me, "sme_lexwiz_sentence_words", "SME-LEXWIZ-SENTENCE-WORDS", 1, 0, false);
        declareFunction(me, "sme_lexwiz_sentence_args", "SME-LEXWIZ-SENTENCE-ARGS", 1, 0, false);
        declareFunction(me, "sme_lexwiz_arg_offsets", "SME-LEXWIZ-ARG-OFFSETS", 1, 0, false);
        declareFunction(me, "sme_lexwiz_current_arg", "SME-LEXWIZ-CURRENT-ARG", 1, 0, false);
        declareFunction(me, "sme_lexwiz_arg_speech_parts", "SME-LEXWIZ-ARG-SPEECH-PARTS", 1, 0, false);
        declareFunction(me, "sme_lexwiz_proper_sub_predicates", "SME-LEXWIZ-PROPER-SUB-PREDICATES", 1, 0, false);
        declareFunction(me, "_csetf_sme_lexwiz_is_abbreviationP", "_CSETF-SME-LEXWIZ-IS-ABBREVIATION?", 2, 0, false);
        declareFunction(me, "_csetf_sme_lexwiz_new_mappingP", "_CSETF-SME-LEXWIZ-NEW-MAPPING?", 2, 0, false);
        declareFunction(me, "_csetf_sme_lexwiz_okP", "_CSETF-SME-LEXWIZ-OK?", 2, 0, false);
        declareFunction(me, "_csetf_sme_lexwiz_sample_sentence", "_CSETF-SME-LEXWIZ-SAMPLE-SENTENCE", 2, 0, false);
        declareFunction(me, "_csetf_sme_lexwiz_sentence_words", "_CSETF-SME-LEXWIZ-SENTENCE-WORDS", 2, 0, false);
        declareFunction(me, "_csetf_sme_lexwiz_sentence_args", "_CSETF-SME-LEXWIZ-SENTENCE-ARGS", 2, 0, false);
        declareFunction(me, "_csetf_sme_lexwiz_arg_offsets", "_CSETF-SME-LEXWIZ-ARG-OFFSETS", 2, 0, false);
        declareFunction(me, "_csetf_sme_lexwiz_current_arg", "_CSETF-SME-LEXWIZ-CURRENT-ARG", 2, 0, false);
        declareFunction(me, "_csetf_sme_lexwiz_arg_speech_parts", "_CSETF-SME-LEXWIZ-ARG-SPEECH-PARTS", 2, 0, false);
        declareFunction(me, "_csetf_sme_lexwiz_proper_sub_predicates", "_CSETF-SME-LEXWIZ-PROPER-SUB-PREDICATES", 2, 0, false);
        declareFunction(me, "make_sme_lexification_settings", "MAKE-SME-LEXIFICATION-SETTINGS", 0, 1, false);
        declareFunction(me, "visit_defstruct_sme_lexification_settings", "VISIT-DEFSTRUCT-SME-LEXIFICATION-SETTINGS", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_sme_lexification_settings_method", "VISIT-DEFSTRUCT-OBJECT-SME-LEXIFICATION-SETTINGS-METHOD", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_interface_proxy_class", "SUBLOOP-RESERVED-INITIALIZE-INTERFACE-PROXY-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_interface_proxy_instance", "SUBLOOP-RESERVED-INITIALIZE-INTERFACE-PROXY-INSTANCE", 1, 0, false);
        declareFunction(me, "interface_proxy_p", "INTERFACE-PROXY-P", 1, 0, false);
        declareFunction(me, "get_question_answering_agent_user_data", "GET-QUESTION-ANSWERING-AGENT-USER-DATA", 1, 0, false);
        declareFunction(me, "set_question_answering_agent_user_data", "SET-QUESTION-ANSWERING-AGENT-USER-DATA", 2, 0, false);
        declareFunction(me, "get_question_answering_agent_client_data", "GET-QUESTION-ANSWERING-AGENT-CLIENT-DATA", 1, 0, false);
        declareFunction(me, "set_question_answering_agent_client_data", "SET-QUESTION-ANSWERING-AGENT-CLIENT-DATA", 2, 0, false);
        declareFunction(me, "get_question_answering_agent_callback_function", "GET-QUESTION-ANSWERING-AGENT-CALLBACK-FUNCTION", 1, 0, false);
        declareFunction(me, "set_question_answering_agent_callback_function", "SET-QUESTION-ANSWERING-AGENT-CALLBACK-FUNCTION", 2, 0, false);
        declareFunction(me, "get_question_answering_agent_proxy", "GET-QUESTION-ANSWERING-AGENT-PROXY", 1, 0, false);
        declareFunction(me, "set_question_answering_agent_proxy", "SET-QUESTION-ANSWERING-AGENT-PROXY", 2, 0, false);
        declareFunction(me, "get_question_answering_agent_field_labels", "GET-QUESTION-ANSWERING-AGENT-FIELD-LABELS", 1, 0, false);
        declareFunction(me, "set_question_answering_agent_field_labels", "SET-QUESTION-ANSWERING-AGENT-FIELD-LABELS", 2, 0, false);
        declareFunction(me, "get_question_answering_agent_field_width", "GET-QUESTION-ANSWERING-AGENT-FIELD-WIDTH", 1, 0, false);
        declareFunction(me, "set_question_answering_agent_field_width", "SET-QUESTION-ANSWERING-AGENT-FIELD-WIDTH", 2, 0, false);
        declareFunction(me, "get_question_answering_agent_answer", "GET-QUESTION-ANSWERING-AGENT-ANSWER", 1, 0, false);
        declareFunction(me, "set_question_answering_agent_answer", "SET-QUESTION-ANSWERING-AGENT-ANSWER", 2, 0, false);
        declareFunction(me, "get_question_answering_agent_default", "GET-QUESTION-ANSWERING-AGENT-DEFAULT", 1, 0, false);
        declareFunction(me, "set_question_answering_agent_default", "SET-QUESTION-ANSWERING-AGENT-DEFAULT", 2, 0, false);
        declareFunction(me, "get_question_answering_agent_values", "GET-QUESTION-ANSWERING-AGENT-VALUES", 1, 0, false);
        declareFunction(me, "set_question_answering_agent_values", "SET-QUESTION-ANSWERING-AGENT-VALUES", 2, 0, false);
        declareFunction(me, "get_question_answering_agent_descriptions", "GET-QUESTION-ANSWERING-AGENT-DESCRIPTIONS", 1, 0, false);
        declareFunction(me, "set_question_answering_agent_descriptions", "SET-QUESTION-ANSWERING-AGENT-DESCRIPTIONS", 2, 0, false);
        declareFunction(me, "get_question_answering_agent_choices", "GET-QUESTION-ANSWERING-AGENT-CHOICES", 1, 0, false);
        declareFunction(me, "set_question_answering_agent_choices", "SET-QUESTION-ANSWERING-AGENT-CHOICES", 2, 0, false);
        declareFunction(me, "get_question_answering_agent_error_message", "GET-QUESTION-ANSWERING-AGENT-ERROR-MESSAGE", 1, 0, false);
        declareFunction(me, "set_question_answering_agent_error_message", "SET-QUESTION-ANSWERING-AGENT-ERROR-MESSAGE", 2, 0, false);
        declareFunction(me, "get_question_answering_agent_question_type", "GET-QUESTION-ANSWERING-AGENT-QUESTION-TYPE", 1, 0, false);
        declareFunction(me, "set_question_answering_agent_question_type", "SET-QUESTION-ANSWERING-AGENT-QUESTION-TYPE", 2, 0, false);
        declareFunction(me, "get_question_answering_agent_tip", "GET-QUESTION-ANSWERING-AGENT-TIP", 1, 0, false);
        declareFunction(me, "set_question_answering_agent_tip", "SET-QUESTION-ANSWERING-AGENT-TIP", 2, 0, false);
        declareFunction(me, "get_question_answering_agent_question", "GET-QUESTION-ANSWERING-AGENT-QUESTION", 1, 0, false);
        declareFunction(me, "set_question_answering_agent_question", "SET-QUESTION-ANSWERING-AGENT-QUESTION", 2, 0, false);
        declareFunction(me, "get_question_answering_agent_title", "GET-QUESTION-ANSWERING-AGENT-TITLE", 1, 0, false);
        declareFunction(me, "set_question_answering_agent_title", "SET-QUESTION-ANSWERING-AGENT-TITLE", 2, 0, false);
        declareFunction(me, "get_question_answering_agent_id", "GET-QUESTION-ANSWERING-AGENT-ID", 1, 0, false);
        declareFunction(me, "set_question_answering_agent_id", "SET-QUESTION-ANSWERING-AGENT-ID", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_question_answering_agent_class", "SUBLOOP-RESERVED-INITIALIZE-QUESTION-ANSWERING-AGENT-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_question_answering_agent_instance", "SUBLOOP-RESERVED-INITIALIZE-QUESTION-ANSWERING-AGENT-INSTANCE", 1, 0, false);
        declareFunction(me, "question_answering_agent_p", "QUESTION-ANSWERING-AGENT-P", 1, 0, false);
        declareFunction(me, "get_sme_lexification_state_interlocutor_agent", "GET-SME-LEXIFICATION-STATE-INTERLOCUTOR-AGENT", 1, 0, false);
        declareFunction(me, "set_sme_lexification_state_interlocutor_agent", "SET-SME-LEXIFICATION-STATE-INTERLOCUTOR-AGENT", 2, 0, false);
        declareFunction(me, "get_sme_lexification_state_lexwiz_settings", "GET-SME-LEXIFICATION-STATE-LEXWIZ-SETTINGS", 1, 0, false);
        declareFunction(me, "set_sme_lexification_state_lexwiz_settings", "SET-SME-LEXIFICATION-STATE-LEXWIZ-SETTINGS", 2, 0, false);
        declareFunction(me, "get_sme_lexification_state_lexwiz_parameters", "GET-SME-LEXIFICATION-STATE-LEXWIZ-PARAMETERS", 1, 0, false);
        declareFunction(me, "set_sme_lexification_state_lexwiz_parameters", "SET-SME-LEXIFICATION-STATE-LEXWIZ-PARAMETERS", 2, 0, false);
        declareFunction(me, "get_sme_lexification_state_next_states", "GET-SME-LEXIFICATION-STATE-NEXT-STATES", 1, 0, false);
        declareFunction(me, "set_sme_lexification_state_next_states", "SET-SME-LEXIFICATION-STATE-NEXT-STATES", 2, 0, false);
        declareFunction(me, "get_sme_lexification_state_state", "GET-SME-LEXIFICATION-STATE-STATE", 1, 0, false);
        declareFunction(me, "set_sme_lexification_state_state", "SET-SME-LEXIFICATION-STATE-STATE", 2, 0, false);
        declareFunction(me, "get_sme_lexification_state_id", "GET-SME-LEXIFICATION-STATE-ID", 1, 0, false);
        declareFunction(me, "set_sme_lexification_state_id", "SET-SME-LEXIFICATION-STATE-ID", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_sme_lexification_state_class", "SUBLOOP-RESERVED-INITIALIZE-SME-LEXIFICATION-STATE-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_sme_lexification_state_instance", "SUBLOOP-RESERVED-INITIALIZE-SME-LEXIFICATION-STATE-INSTANCE", 1, 0, false);
        declareFunction(me, "sme_lexification_state_p", "SME-LEXIFICATION-STATE-P", 1, 0, false);
        declareFunction(me, "get_sme_lexification_interlocutor_user_data", "GET-SME-LEXIFICATION-INTERLOCUTOR-USER-DATA", 1, 0, false);
        declareFunction(me, "set_sme_lexification_interlocutor_user_data", "SET-SME-LEXIFICATION-INTERLOCUTOR-USER-DATA", 2, 0, false);
        declareFunction(me, "get_sme_lexification_interlocutor_client_data", "GET-SME-LEXIFICATION-INTERLOCUTOR-CLIENT-DATA", 1, 0, false);
        declareFunction(me, "set_sme_lexification_interlocutor_client_data", "SET-SME-LEXIFICATION-INTERLOCUTOR-CLIENT-DATA", 2, 0, false);
        declareFunction(me, "get_sme_lexification_interlocutor_callback_function", "GET-SME-LEXIFICATION-INTERLOCUTOR-CALLBACK-FUNCTION", 1, 0, false);
        declareFunction(me, "set_sme_lexification_interlocutor_callback_function", "SET-SME-LEXIFICATION-INTERLOCUTOR-CALLBACK-FUNCTION", 2, 0, false);
        declareFunction(me, "get_sme_lexification_interlocutor_proxy", "GET-SME-LEXIFICATION-INTERLOCUTOR-PROXY", 1, 0, false);
        declareFunction(me, "set_sme_lexification_interlocutor_proxy", "SET-SME-LEXIFICATION-INTERLOCUTOR-PROXY", 2, 0, false);
        declareFunction(me, "get_sme_lexification_interlocutor_sme_state", "GET-SME-LEXIFICATION-INTERLOCUTOR-SME-STATE", 1, 0, false);
        declareFunction(me, "set_sme_lexification_interlocutor_sme_state", "SET-SME-LEXIFICATION-INTERLOCUTOR-SME-STATE", 2, 0, false);
        declareFunction(me, "get_sme_lexification_interlocutor_lexwiz_settings", "GET-SME-LEXIFICATION-INTERLOCUTOR-LEXWIZ-SETTINGS", 1, 0, false);
        declareFunction(me, "set_sme_lexification_interlocutor_lexwiz_settings", "SET-SME-LEXIFICATION-INTERLOCUTOR-LEXWIZ-SETTINGS", 2, 0, false);
        declareFunction(me, "get_sme_lexification_interlocutor_lexwiz_parameters", "GET-SME-LEXIFICATION-INTERLOCUTOR-LEXWIZ-PARAMETERS", 1, 0, false);
        declareFunction(me, "set_sme_lexification_interlocutor_lexwiz_parameters", "SET-SME-LEXIFICATION-INTERLOCUTOR-LEXWIZ-PARAMETERS", 2, 0, false);
        declareFunction(me, "get_sme_lexification_interlocutor_previous_id", "GET-SME-LEXIFICATION-INTERLOCUTOR-PREVIOUS-ID", 1, 0, false);
        declareFunction(me, "set_sme_lexification_interlocutor_previous_id", "SET-SME-LEXIFICATION-INTERLOCUTOR-PREVIOUS-ID", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_sme_lexification_interlocutor_class", "SUBLOOP-RESERVED-INITIALIZE-SME-LEXIFICATION-INTERLOCUTOR-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_sme_lexification_interlocutor_instance", "SUBLOOP-RESERVED-INITIALIZE-SME-LEXIFICATION-INTERLOCUTOR-INSTANCE", 1, 0, false);
        declareFunction(me, "sme_lexification_interlocutor_p", "SME-LEXIFICATION-INTERLOCUTOR-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_sme_li_pre_general_class", "SUBLOOP-RESERVED-INITIALIZE-SME-LI-PRE-GENERAL-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_sme_li_pre_general_instance", "SUBLOOP-RESERVED-INITIALIZE-SME-LI-PRE-GENERAL-INSTANCE", 1, 0, false);
        declareFunction(me, "sme_li_pre_general_p", "SME-LI-PRE-GENERAL-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_sme_li_proper_name_class", "SUBLOOP-RESERVED-INITIALIZE-SME-LI-PROPER-NAME-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_sme_li_proper_name_instance", "SUBLOOP-RESERVED-INITIALIZE-SME-LI-PROPER-NAME-INSTANCE", 1, 0, false);
        declareFunction(me, "sme_li_proper_name_p", "SME-LI-PROPER-NAME-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_sme_li_denotational_class", "SUBLOOP-RESERVED-INITIALIZE-SME-LI-DENOTATIONAL-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_sme_li_denotational_instance", "SUBLOOP-RESERVED-INITIALIZE-SME-LI-DENOTATIONAL-INSTANCE", 1, 0, false);
        declareFunction(me, "sme_li_denotational_p", "SME-LI-DENOTATIONAL-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_sme_li_relational_class", "SUBLOOP-RESERVED-INITIALIZE-SME-LI-RELATIONAL-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_sme_li_relational_instance", "SUBLOOP-RESERVED-INITIALIZE-SME-LI-RELATIONAL-INSTANCE", 1, 0, false);
        declareFunction(me, "sme_li_relational_p", "SME-LI-RELATIONAL-P", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_sme_li_post_general_class", "SUBLOOP-RESERVED-INITIALIZE-SME-LI-POST-GENERAL-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_sme_li_post_general_instance", "SUBLOOP-RESERVED-INITIALIZE-SME-LI-POST-GENERAL-INSTANCE", 1, 0, false);
        declareFunction(me, "sme_li_post_general_p", "SME-LI-POST-GENERAL-P", 1, 0, false);
        declareFunction(me, "get_sme_lexification_wizard_question_answering_agent_class", "GET-SME-LEXIFICATION-WIZARD-QUESTION-ANSWERING-AGENT-CLASS", 1, 0, false);
        declareFunction(me, "set_sme_lexification_wizard_question_answering_agent_class", "SET-SME-LEXIFICATION-WIZARD-QUESTION-ANSWERING-AGENT-CLASS", 2, 0, false);
        declareFunction(me, "get_sme_lexification_wizard_proxy", "GET-SME-LEXIFICATION-WIZARD-PROXY", 1, 0, false);
        declareFunction(me, "set_sme_lexification_wizard_proxy", "SET-SME-LEXIFICATION-WIZARD-PROXY", 2, 0, false);
        declareFunction(me, "get_sme_lexification_wizard_new_current_interaction", "GET-SME-LEXIFICATION-WIZARD-NEW-CURRENT-INTERACTION", 1, 0, false);
        declareFunction(me, "set_sme_lexification_wizard_new_current_interaction", "SET-SME-LEXIFICATION-WIZARD-NEW-CURRENT-INTERACTION", 2, 0, false);
        declareFunction(me, "get_sme_lexification_wizard_current_interaction", "GET-SME-LEXIFICATION-WIZARD-CURRENT-INTERACTION", 1, 0, false);
        declareFunction(me, "set_sme_lexification_wizard_current_interaction", "SET-SME-LEXIFICATION-WIZARD-CURRENT-INTERACTION", 2, 0, false);
        declareFunction(me, "get_sme_lexification_wizard_lexwiz_parameters", "GET-SME-LEXIFICATION-WIZARD-LEXWIZ-PARAMETERS", 1, 0, false);
        declareFunction(me, "set_sme_lexification_wizard_lexwiz_parameters", "SET-SME-LEXIFICATION-WIZARD-LEXWIZ-PARAMETERS", 2, 0, false);
        declareFunction(me, "get_sme_lexification_wizard_next_states", "GET-SME-LEXIFICATION-WIZARD-NEXT-STATES", 1, 0, false);
        declareFunction(me, "set_sme_lexification_wizard_next_states", "SET-SME-LEXIFICATION-WIZARD-NEXT-STATES", 2, 0, false);
        declareFunction(me, "get_sme_lexification_wizard_state", "GET-SME-LEXIFICATION-WIZARD-STATE", 1, 0, false);
        declareFunction(me, "set_sme_lexification_wizard_state", "SET-SME-LEXIFICATION-WIZARD-STATE", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_sme_lexification_wizard_class", "SUBLOOP-RESERVED-INITIALIZE-SME-LEXIFICATION-WIZARD-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_sme_lexification_wizard_instance", "SUBLOOP-RESERVED-INITIALIZE-SME-LEXIFICATION-WIZARD-INSTANCE", 1, 0, false);
        declareFunction(me, "sme_lexification_wizard_p", "SME-LEXIFICATION-WIZARD-P", 1, 0, false);
        declareFunction(me, "question_answering_agent_initialize_method", "QUESTION-ANSWERING-AGENT-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "question_answering_agent_set_question_method", "QUESTION-ANSWERING-AGENT-SET-QUESTION-METHOD", 2, 3, false);
        declareFunction(me, "question_answering_agent_display_question_method", "QUESTION-ANSWERING-AGENT-DISPLAY-QUESTION-METHOD", 1, 0, false);
        declareFunction(me, "question_answering_agent_get_response_method", "QUESTION-ANSWERING-AGENT-GET-RESPONSE-METHOD", 1, 0, false);
        declareFunction(me, "question_answering_agent_validate_response_method", "QUESTION-ANSWERING-AGENT-VALIDATE-RESPONSE-METHOD", 1, 0, false);
        declareFunction(me, "question_answering_agent_set_callback_function_method", "QUESTION-ANSWERING-AGENT-SET-CALLBACK-FUNCTION-METHOD", 2, 0, false);
        declareFunction(me, "question_answering_agent_set_client_data_method", "QUESTION-ANSWERING-AGENT-SET-CLIENT-DATA-METHOD", 2, 0, false);
        declareFunction(me, "question_answering_agent_set_user_data_method", "QUESTION-ANSWERING-AGENT-SET-USER-DATA-METHOD", 2, 0, false);
        declareFunction(me, "question_answering_agent_set_proxy_method", "QUESTION-ANSWERING-AGENT-SET-PROXY-METHOD", 2, 0, false);
        declareFunction(me, "question_answering_agent_notify_client_method", "QUESTION-ANSWERING-AGENT-NOTIFY-CLIENT-METHOD", 2, 0, false);
        declareFunction(me, "question_answering_agent_positive_choice_method", "QUESTION-ANSWERING-AGENT-POSITIVE-CHOICE-METHOD", 1, 0, false);
        declareFunction(me, "question_answering_agent_negative_choice_method", "QUESTION-ANSWERING-AGENT-NEGATIVE-CHOICE-METHOD", 1, 0, false);
        declareFunction(me, "question_answering_agent_copy_method", "QUESTION-ANSWERING-AGENT-COPY-METHOD", 2, 0, false);
        declareFunction(me, "question_answering_agent_new_copy_method", "QUESTION-ANSWERING-AGENT-NEW-COPY-METHOD", 2, 0, false);
        declareFunction(me, "interface_proxy_initialize_method", "INTERFACE-PROXY-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "interface_proxy_init_session_method", "INTERFACE-PROXY-INIT-SESSION-METHOD", 1, 0, false);
        declareFunction(me, "interface_proxy_end_session_method", "INTERFACE-PROXY-END-SESSION-METHOD", 1, 0, false);
        declareFunction(me, "interface_proxy_create_constant_method", "INTERFACE-PROXY-CREATE-CONSTANT-METHOD", 2, 0, false);
        declareFunction(me, "interface_proxy_describe_term_method", "INTERFACE-PROXY-DESCRIBE-TERM-METHOD", 2, 0, false);
        declareFunction(me, "interface_proxy_resolve_term_method", "INTERFACE-PROXY-RESOLVE-TERM-METHOD", 2, 0, false);
        declareFunction(me, "interface_proxy_mumble_method", "INTERFACE-PROXY-MUMBLE-METHOD", 2, 0, false);
        declareFunction(me, "interface_proxy_forge_aheadP_method", "INTERFACE-PROXY-FORGE-AHEAD?-METHOD", 1, 0, false);
        declareFunction(me, "new_sme_lexification_id", "NEW-SME-LEXIFICATION-ID", 0, 0, false);
        declareFunction(me, "sme_lexification_state_initialize_method", "SME-LEXIFICATION-STATE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "sme_lexification_state_copy_method", "SME-LEXIFICATION-STATE-COPY-METHOD", 2, 0, false);
        declareFunction(me, "sme_lexification_state_get_id_method", "SME-LEXIFICATION-STATE-GET-ID-METHOD", 1, 0, false);
        declareFunction(me, "sme_lexification_state_set_states_method", "SME-LEXIFICATION-STATE-SET-STATES-METHOD", 2, 0, false);
        declareFunction(me, "sme_lexification_state_get_states_method", "SME-LEXIFICATION-STATE-GET-STATES-METHOD", 1, 0, false);
        declareFunction(me, "sme_lexification_state_current_state_method", "SME-LEXIFICATION-STATE-CURRENT-STATE-METHOD", 1, 0, false);
        declareFunction(me, "sme_lexification_state_current_settings_method", "SME-LEXIFICATION-STATE-CURRENT-SETTINGS-METHOD", 1, 0, false);
        declareFunction(me, "sme_lexification_state_advance_method", "SME-LEXIFICATION-STATE-ADVANCE-METHOD", 1, 0, false);
        declareFunction(me, "sme_lexification_state_new_copy_method", "SME-LEXIFICATION-STATE-NEW-COPY-METHOD", 2, 0, false);
        declareFunction(me, "sme_lexification_state_list_values_method", "SME-LEXIFICATION-STATE-LIST-VALUES-METHOD", 1, 0, false);
        declareFunction(me, "sme_lexification_state_trace_values_method", "SME-LEXIFICATION-STATE-TRACE-VALUES-METHOD", 1, 2, false);
        declareFunction(me, "sme_lexification_interlocutor_initialize_method", "SME-LEXIFICATION-INTERLOCUTOR-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "sme_lexification_interlocutor_doneP_method", "SME-LEXIFICATION-INTERLOCUTOR-DONE?-METHOD", 1, 0, false);
        declareFunction(me, "sme_lexification_interlocutor_initiate_interaction_method", "SME-LEXIFICATION-INTERLOCUTOR-INITIATE-INTERACTION-METHOD", 6, 0, false);
        declareFunction(me, "sme_lexification_interlocutor_update_notification_info_method", "SME-LEXIFICATION-INTERLOCUTOR-UPDATE-NOTIFICATION-INFO-METHOD", 1, 0, false);
        declareFunction(me, "sme_lexification_interlocutor_next_interaction_method", "SME-LEXIFICATION-INTERLOCUTOR-NEXT-INTERACTION-METHOD", 1, 0, false);
        declareFunction(me, "sme_lexification_interlocutor_end_interaction_method", "SME-LEXIFICATION-INTERLOCUTOR-END-INTERACTION-METHOD", 1, 0, false);
        declareFunction(me, "sme_lexification_interlocutor_reset_state_method", "SME-LEXIFICATION-INTERLOCUTOR-RESET-STATE-METHOD", 2, 0, false);
        declareFunction(me, "sme_lexification_interlocutor_process_status_update_method", "SME-LEXIFICATION-INTERLOCUTOR-PROCESS-STATUS-UPDATE-METHOD", 2, 2, false);
        declareFunction(me, "sme_lexification_interlocutor_ask_generic_boolean_method", "SME-LEXIFICATION-INTERLOCUTOR-ASK-GENERIC-BOOLEAN-METHOD", 3, 2, false);
        declareFunction(me, "sme_lexification_interlocutor_ask_generic_enumerated_method", "SME-LEXIFICATION-INTERLOCUTOR-ASK-GENERIC-ENUMERATED-METHOD", 4, 3, false);
        declareFunction(me, "sme_lexification_interlocutor_ask_generic_multiple_selection_method", "SME-LEXIFICATION-INTERLOCUTOR-ASK-GENERIC-MULTIPLE-SELECTION-METHOD", 4, 3, false);
        declareFunction(me, "sme_lexification_interlocutor_ask_generic_free_form_method", "SME-LEXIFICATION-INTERLOCUTOR-ASK-GENERIC-FREE-FORM-METHOD", 3, 3, false);
        declareFunction(me, "sme_lexification_interlocutor_ask_generic_multiple_free_form_method", "SME-LEXIFICATION-INTERLOCUTOR-ASK-GENERIC-MULTIPLE-FREE-FORM-METHOD", 3, 5, false);
        declareFunction(me, "sme_lexification_interlocutor_display_question_method", "SME-LEXIFICATION-INTERLOCUTOR-DISPLAY-QUESTION-METHOD", 1, 0, false);
        declareFunction(me, "sme_lexification_interlocutor_get_answer_method", "SME-LEXIFICATION-INTERLOCUTOR-GET-ANSWER-METHOD", 1, 0, false);
        declareFunction(me, "sme_lexification_interlocutor_set_answer_method", "SME-LEXIFICATION-INTERLOCUTOR-SET-ANSWER-METHOD", 2, 0, false);
        declareFunction(me, "sme_lexification_interlocutor_get_interlocutor_agent_method", "SME-LEXIFICATION-INTERLOCUTOR-GET-INTERLOCUTOR-AGENT-METHOD", 1, 0, false);
        declareFunction(me, "sme_lexification_interlocutor_set_interlocutor_agent_method", "SME-LEXIFICATION-INTERLOCUTOR-SET-INTERLOCUTOR-AGENT-METHOD", 2, 0, false);
        declareFunction(me, "sme_lexification_interlocutor_set_default_method", "SME-LEXIFICATION-INTERLOCUTOR-SET-DEFAULT-METHOD", 2, 0, false);
        declareFunction(me, "sme_lexification_interlocutor_check_generic_method", "SME-LEXIFICATION-INTERLOCUTOR-CHECK-GENERIC-METHOD", 2, 0, false);
        declareFunction(me, "sme_lexification_interlocutor_set_callback_function_method", "SME-LEXIFICATION-INTERLOCUTOR-SET-CALLBACK-FUNCTION-METHOD", 2, 0, false);
        declareFunction(me, "sme_lexification_interlocutor_set_proxy_method", "SME-LEXIFICATION-INTERLOCUTOR-SET-PROXY-METHOD", 2, 0, false);
        declareFunction(me, "sme_lexification_interlocutor_notify_client_method", "SME-LEXIFICATION-INTERLOCUTOR-NOTIFY-CLIENT-METHOD", 2, 0, false);
        declareFunction(me, "sme_lexification_interlocutor_mumble_method", "SME-LEXIFICATION-INTERLOCUTOR-MUMBLE-METHOD", 2, 0, false);
        declareFunction(me, "sme_lexification_interlocutor_forge_aheadP_method", "SME-LEXIFICATION-INTERLOCUTOR-FORGE-AHEAD?-METHOD", 1, 0, false);
        declareFunction(me, "sme_lexification_interlocutor_phrase_denotations_method", "SME-LEXIFICATION-INTERLOCUTOR-PHRASE-DENOTATIONS-METHOD", 2, 0, false);
        declareFunction(me, "sme_lexification_interlocutor_describe_term_method", "SME-LEXIFICATION-INTERLOCUTOR-DESCRIBE-TERM-METHOD", 2, 0, false);
        declareFunction(me, "sme_lexification_interlocutor_update_lexification_parameters_method", "SME-LEXIFICATION-INTERLOCUTOR-UPDATE-LEXIFICATION-PARAMETERS-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_pre_general_initialize_method", "SME-LI-PRE-GENERAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_pre_general_do_initialization_method", "SME-LI-PRE-GENERAL-DO-INITIALIZATION-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_pre_general_check_initialization_method", "SME-LI-PRE-GENERAL-CHECK-INITIALIZATION-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_pre_general_ask_term_method", "SME-LI-PRE-GENERAL-ASK-TERM-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_pre_general_check_term_method", "SME-LI-PRE-GENERAL-CHECK-TERM-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_pre_general_resolve_term_method", "SME-LI-PRE-GENERAL-RESOLVE-TERM-METHOD", 2, 0, false);
        declareFunction(me, "sme_li_pre_general_ask_term_selection_method", "SME-LI-PRE-GENERAL-ASK-TERM-SELECTION-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_pre_general_check_term_selection_method", "SME-LI-PRE-GENERAL-CHECK-TERM-SELECTION-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_pre_general_ask_phrase_method", "SME-LI-PRE-GENERAL-ASK-PHRASE-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_pre_general_check_phrase_method", "SME-LI-PRE-GENERAL-CHECK-PHRASE-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_pre_general_ask_ambiguity_method", "SME-LI-PRE-GENERAL-ASK-AMBIGUITY-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_pre_general_check_ambiguity_method", "SME-LI-PRE-GENERAL-CHECK-AMBIGUITY-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_pre_general_ask_proper_name_status_method", "SME-LI-PRE-GENERAL-ASK-PROPER-NAME-STATUS-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_pre_general_check_proper_name_status_method", "SME-LI-PRE-GENERAL-CHECK-PROPER-NAME-STATUS-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_proper_name_initialize_method", "SME-LI-PROPER-NAME-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_proper_name_ask_abbreviation_status_method", "SME-LI-PROPER-NAME-ASK-ABBREVIATION-STATUS-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_proper_name_check_abbreviation_status_method", "SME-LI-PROPER-NAME-CHECK-ABBREVIATION-STATUS-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_proper_name_ask_predicate_type_method", "SME-LI-PROPER-NAME-ASK-PREDICATE-TYPE-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_proper_name_check_predicate_type_method", "SME-LI-PROPER-NAME-CHECK-PREDICATE-TYPE-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_proper_name_ask_refined_predication_method", "SME-LI-PROPER-NAME-ASK-REFINED-PREDICATION-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_proper_name_check_refined_predication_method", "SME-LI-PROPER-NAME-CHECK-REFINED-PREDICATION-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_proper_name_infer_proper_name_sub_predications_method", "SME-LI-PROPER-NAME-INFER-PROPER-NAME-SUB-PREDICATIONS-METHOD", 4, 0, false);
        declareFunction(me, "name_abbreviationP", "NAME-ABBREVIATION?", 1, 0, false);
        declareFunction(me, "sme_li_denotational_initialize_method", "SME-LI-DENOTATIONAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_denotational_guess_headword_position_method", "SME-LI-DENOTATIONAL-GUESS-HEADWORD-POSITION-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_denotational_check_guessed_headword_position_method", "SME-LI-DENOTATIONAL-CHECK-GUESSED-HEADWORD-POSITION-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_denotational_ask_headword_position_method", "SME-LI-DENOTATIONAL-ASK-HEADWORD-POSITION-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_denotational_check_headword_position_method", "SME-LI-DENOTATIONAL-CHECK-HEADWORD-POSITION-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_denotational_ask_part_of_speech_method", "SME-LI-DENOTATIONAL-ASK-PART-OF-SPEECH-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_denotational_check_part_of_speech_method", "SME-LI-DENOTATIONAL-CHECK-PART-OF-SPEECH-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_denotational_show_headword_variations_method", "SME-LI-DENOTATIONAL-SHOW-HEADWORD-VARIATIONS-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_denotational_check_headword_variations_method", "SME-LI-DENOTATIONAL-CHECK-HEADWORD-VARIATIONS-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_denotational_add_lexical_mapping_method", "SME-LI-DENOTATIONAL-ADD-LEXICAL-MAPPING-METHOD", 3, 2, false);
        declareFunction(me, "sme_li_denotational_remove_lexical_mapping_method", "SME-LI-DENOTATIONAL-REMOVE-LEXICAL-MAPPING-METHOD", 3, 2, false);
        declareFunction(me, "sme_li_denotational_do_lexical_mapping_method", "SME-LI-DENOTATIONAL-DO-LEXICAL-MAPPING-METHOD", 6, 0, false);
        declareFunction(me, "sme_li_denotational_derive_part_of_speech_examples_method", "SME-LI-DENOTATIONAL-DERIVE-PART-OF-SPEECH-EXAMPLES-METHOD", 5, 0, false);
        declareFunction(me, "sme_li_denotational_derive_part_of_speech_example_method", "SME-LI-DENOTATIONAL-DERIVE-PART-OF-SPEECH-EXAMPLE-METHOD", 5, 1, false);
        declareFunction(me, "sme_li_inflected_verb_to_infinitive", "SME-LI-INFLECTED-VERB-TO-INFINITIVE", 1, 0, false);
        declareFunction(me, "sme_li_denotational_disable_speech_part_selection_method", "SME-LI-DENOTATIONAL-DISABLE-SPEECH-PART-SELECTION-METHOD", 3, 1, false);
        declareFunction(me, "sme_li_relational_initialize_method", "SME-LI-RELATIONAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_relational_initiate_interaction_method", "SME-LI-RELATIONAL-INITIATE-INTERACTION-METHOD", 6, 0, false);
        declareFunction(me, "sme_li_relational_ask_sample_sentence_method", "SME-LI-RELATIONAL-ASK-SAMPLE-SENTENCE-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_relational_check_sample_sentence_method", "SME-LI-RELATIONAL-CHECK-SAMPLE-SENTENCE-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_relational_ask_argument_values_method", "SME-LI-RELATIONAL-ASK-ARGUMENT-VALUES-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_relational_check_argument_values_method", "SME-LI-RELATIONAL-CHECK-ARGUMENT-VALUES-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_relational_ask_argument_part_of_speech_method", "SME-LI-RELATIONAL-ASK-ARGUMENT-PART-OF-SPEECH-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_relational_check_argument_part_of_speech_method", "SME-LI-RELATIONAL-CHECK-ARGUMENT-PART-OF-SPEECH-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_relational_derive_relational_templates_method", "SME-LI-RELATIONAL-DERIVE-RELATIONAL-TEMPLATES-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_post_general_initialize_method", "SME-LI-POST-GENERAL-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_post_general_ask_preferred_lexification_status_method", "SME-LI-POST-GENERAL-ASK-PREFERRED-LEXIFICATION-STATUS-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_post_general_check_preferred_lexification_status_method", "SME-LI-POST-GENERAL-CHECK-PREFERRED-LEXIFICATION-STATUS-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_post_general_do_lexification_method", "SME-LI-POST-GENERAL-DO-LEXIFICATION-METHOD", 1, 0, false);
        declareFunction(me, "sme_li_post_general_check_lexification_method", "SME-LI-POST-GENERAL-CHECK-LEXIFICATION-METHOD", 1, 0, false);
        declareFunction(me, "sme_lexification_wizard_initialize_method", "SME-LEXIFICATION-WIZARD-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "sme_lexification_wizard_copy_method", "SME-LEXIFICATION-WIZARD-COPY-METHOD", 2, 0, false);
        declareFunction(me, "sme_lexification_wizard_new_copy_method", "SME-LEXIFICATION-WIZARD-NEW-COPY-METHOD", 2, 0, false);
        declareFunction(me, "sme_lexification_wizard_set_term_method", "SME-LEXIFICATION-WIZARD-SET-TERM-METHOD", 2, 0, false);
        declareFunction(me, "sme_lexification_wizard_get_term_method", "SME-LEXIFICATION-WIZARD-GET-TERM-METHOD", 1, 0, false);
        declareFunction(me, "sme_lexification_wizard_set_phrase_method", "SME-LEXIFICATION-WIZARD-SET-PHRASE-METHOD", 2, 0, false);
        declareFunction(me, "sme_lexification_wizard_get_phrase_method", "SME-LEXIFICATION-WIZARD-GET-PHRASE-METHOD", 1, 0, false);
        declareFunction(me, "sme_lexification_wizard_set_mt_method", "SME-LEXIFICATION-WIZARD-SET-MT-METHOD", 2, 0, false);
        declareFunction(me, "sme_lexification_wizard_get_mt_method", "SME-LEXIFICATION-WIZARD-GET-MT-METHOD", 1, 0, false);
        declareFunction(me, "sme_lexification_wizard_set_lexical_mt_method", "SME-LEXIFICATION-WIZARD-SET-LEXICAL-MT-METHOD", 2, 0, false);
        declareFunction(me, "sme_lexification_wizard_set_parsing_mt_method", "SME-LEXIFICATION-WIZARD-SET-PARSING-MT-METHOD", 2, 0, false);
        declareFunction(me, "sme_lexification_wizard_set_generation_mt_method", "SME-LEXIFICATION-WIZARD-SET-GENERATION-MT-METHOD", 2, 0, false);
        declareFunction(me, "sme_lexification_wizard_lexify_method", "SME-LEXIFICATION-WIZARD-LEXIFY-METHOD", 1, 3, false);
        declareFunction(me, "sme_lexification_wizard_lexify_first_termstring_method", "SME-LEXIFICATION-WIZARD-LEXIFY-FIRST-TERMSTRING-METHOD", 2, 1, false);
        declareFunction(me, "sme_lexification_wizard_continue_lexify_method", "SME-LEXIFICATION-WIZARD-CONTINUE-LEXIFY-METHOD", 1, 0, false);
        declareFunction(me, "sme_lexification_wizard_process_status_update_method", "SME-LEXIFICATION-WIZARD-PROCESS-STATUS-UPDATE-METHOD", 2, 2, false);
        declareFunction(me, "sme_lexification_wizard_update_lexification_parameters_method", "SME-LEXIFICATION-WIZARD-UPDATE-LEXIFICATION-PARAMETERS-METHOD", 1, 0, false);
        declareFunction(me, "rtp_parts_of_speech", "RTP-PARTS-OF-SPEECH", 1, 0, false);
        declareFunction(me, "rtp_phrase_parts_of_speech", "RTP-PHRASE-PARTS-OF-SPEECH", 1, 0, false);
        declareFunction(me, "list_sme_lexification_settings", "LIST-SME-LEXIFICATION-SETTINGS", 1, 1, false);
        declareFunction(me, "copy_sme_lexification_settings", "COPY-SME-LEXIFICATION-SETTINGS", 1, 0, false);
        declareFunction(me, "trace_sme_lexification_settings", "TRACE-SME-LEXIFICATION-SETTINGS", 1, 1, false);
        declareFunction(me, "reset_sme_lexification_parameters", "RESET-SME-LEXIFICATION-PARAMETERS", 0, 0, false);
        declareFunction(me, "set_object_data", "SET-OBJECT-DATA", 2, 0, false);
        declareFunction(me, "get_object_data", "GET-OBJECT-DATA", 1, 0, false);
        declareFunction(me, "init_proper_name_pred_choices", "INIT-PROPER-NAME-PRED-CHOICES", 0, 0, false);
        declareFunction(me, "determine_proper_name_pred_choices", "DETERMINE-PROPER-NAME-PRED-CHOICES", 1, 1, false);
        declareFunction(me, "derive_part_of_speech_variations", "DERIVE-PART-OF-SPEECH-VARIATIONS", 3, 1, false);
        declareFunction(me, "most_likely_headword_part_of_speech", "MOST-LIKELY-HEADWORD-PART-OF-SPEECH", 2, 0, false);
        declareFunction(me, "init_sme_lexification_wizard", "INIT-SME-LEXIFICATION-WIZARD", 0, 0, false);
        declareFunction(me, "class_name_from_object", "CLASS-NAME-FROM-OBJECT", 1, 0, false);
        declareFunction(me, "initialize_name_titles", "INITIALIZE-NAME-TITLES", 0, 0, false);
        declareFunction(me, "is_name_titleP", "IS-NAME-TITLE?", 1, 0, false);
        declareFunction(me, "has_family_name_firstP", "HAS-FAMILY-NAME-FIRST?", 1, 0, false);
        declareFunction(me, "name_tokenize", "NAME-TOKENIZE", 1, 0, false);
        declareFunction(me, "filter_abbreviation_predicates", "FILTER-ABBREVIATION-PREDICATES", 1, 0, false);
        declareFunction(me, "derive_initialism", "DERIVE-INITIALISM", 1, 0, false);
        declareFunction(me, "lex_normalize_string", "LEX-NORMALIZE-STRING", 1, 0, false);
        declareFunction(me, "map_method", "MAP-METHOD", 3, 0, false);
        return NIL;
    }

    public static SubLObject init_sme_lexification_wizard_file() {
        deflexical("*SME-LEXIFICATION-OBJECT-ID-HASH*", SubLTrampolineFile.maybeDefault($sme_lexification_object_id_hash$, $sme_lexification_object_id_hash$, () -> make_hash_table($int$25, symbol_function(EQUAL), UNPROVIDED)));
        deflexical("*SME-LEXWIZ-INITIALIZED?*", SubLTrampolineFile.maybeDefault($sym2$_SME_LEXWIZ_INITIALIZED__, $sme_lexwiz_initializedP$, NIL));
        deflexical("*SME-FORGE-AHEAD?*", NIL);
        deflexical("*VERIFY-BEFOREHAND?*", T);
        deflexical("*USE-INFERRED-PHRASES?*", NIL);
        deflexical("*USE-BLACKBOARD?*", NIL);
        defconstant("*NEWLINE-TAB*", format(NIL, $str3$_a_a, CHAR_newline, CHAR_tab));
        deflexical("*SME-PARTS-OF-SPEECH*", $list4);
        deflexical("*NEXT-SME-LEXIFICATION-ID*", SubLTrampolineFile.maybeDefault($next_sme_lexification_id$, $next_sme_lexification_id$, ZERO_INTEGER));
        deflexical("*USE-GENFORMAT-TEMPLATE*", NIL);
        deflexical("*LEXWIZ-PERSON-SUB-PREDICATES*", $list6);
        deflexical("*KNOWN-NAME-TITLES*", SubLTrampolineFile.maybeDefault($known_name_titles$, $known_name_titles$, NIL));
        deflexical("*FAMILY-NAME-FIRST-GROUPS*", $list8);
        deflexical("*LEXWIZ-ABBREVIATION-CHECK-MIN-WORDS*", FOUR_INTEGER);
        deflexical("*SME-LEXWIZ-TITLE*", $$$Dictionary_Assistant);
        deflexical("*LEXWIZ-WELCOME-MESSAGE*", $str10$Welcome_to_the_Subject_Matter_Exp);
        deflexical("*LEXWIZ-INITIALIZATION-TIP*", $str11$The_initialization_may_take_sever);
        deflexical("*PHRASE-SPECIFICATION-TIP*", $str12$Choose_a_phrase_that_clearly_dist);
        deflexical("*PROPER-NAME-STATUS-TIP*", $str13$Normally__capitalized_phrases_are);
        deflexical("*HEADWORD-SELECTION-TIP*", $str14$examples____video_sports_game____);
        deflexical("*HEADWORD-GUESSING-TIP*", $str15$The_headword_is_the_word_that_is_);
        deflexical("*SAMPLE-SENTENCE-TIP*", $str16$The_sentence_should_be_general_en);
        deflexical("*ARGUMENT-PART-OF-SPEECH-TIP*", $str17$The_choices_for_the_phrasal_part_);
        defconstant("*DTP-SME-LEXIFICATION-SETTINGS*", SME_LEXIFICATION_SETTINGS);
        return NIL;
    }

    public static SubLObject setup_sme_lexification_wizard_file() {
        declare_defglobal($sme_lexification_object_id_hash$);
        declare_defglobal($sym2$_SME_LEXWIZ_INITIALIZED__);
        declare_defglobal($next_sme_lexification_id$);
        declare_defglobal($known_name_titles$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_sme_lexification_settings$.getGlobalValue(), symbol_function(SME_LEXIFICATION_SETTINGS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list26);
        def_csetf($sym27$SME_LEXWIZ_IS_ABBREVIATION_, $sym28$_CSETF_SME_LEXWIZ_IS_ABBREVIATION_);
        def_csetf($sym29$SME_LEXWIZ_NEW_MAPPING_, $sym30$_CSETF_SME_LEXWIZ_NEW_MAPPING_);
        def_csetf($sym31$SME_LEXWIZ_OK_, $sym32$_CSETF_SME_LEXWIZ_OK_);
        def_csetf(SME_LEXWIZ_SAMPLE_SENTENCE, _CSETF_SME_LEXWIZ_SAMPLE_SENTENCE);
        def_csetf(SME_LEXWIZ_SENTENCE_WORDS, _CSETF_SME_LEXWIZ_SENTENCE_WORDS);
        def_csetf(SME_LEXWIZ_SENTENCE_ARGS, _CSETF_SME_LEXWIZ_SENTENCE_ARGS);
        def_csetf(SME_LEXWIZ_ARG_OFFSETS, _CSETF_SME_LEXWIZ_ARG_OFFSETS);
        def_csetf(SME_LEXWIZ_CURRENT_ARG, _CSETF_SME_LEXWIZ_CURRENT_ARG);
        def_csetf(SME_LEXWIZ_ARG_SPEECH_PARTS, _CSETF_SME_LEXWIZ_ARG_SPEECH_PARTS);
        def_csetf(SME_LEXWIZ_PROPER_SUB_PREDICATES, _CSETF_SME_LEXWIZ_PROPER_SUB_PREDICATES);
        identity(SME_LEXIFICATION_SETTINGS);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_sme_lexification_settings$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SME_LEXIFICATION_SETTINGS_METHOD));
        classes.subloop_new_class(INTERFACE_PROXY, OBJECT, NIL, NIL, $list65);
        classes.class_set_implements_slot_listeners(INTERFACE_PROXY, NIL);
        classes.subloop_note_class_initialization_function(INTERFACE_PROXY, SUBLOOP_RESERVED_INITIALIZE_INTERFACE_PROXY_CLASS);
        classes.subloop_note_instance_initialization_function(INTERFACE_PROXY, SUBLOOP_RESERVED_INITIALIZE_INTERFACE_PROXY_INSTANCE);
        subloop_reserved_initialize_interface_proxy_class(INTERFACE_PROXY);
        classes.subloop_new_class(QUESTION_ANSWERING_AGENT, OBJECT, NIL, NIL, $list72);
        classes.class_set_implements_slot_listeners(QUESTION_ANSWERING_AGENT, NIL);
        classes.subloop_note_class_initialization_function(QUESTION_ANSWERING_AGENT, SUBLOOP_RESERVED_INITIALIZE_QUESTION_ANSWERING_AGENT_CLASS);
        classes.subloop_note_instance_initialization_function(QUESTION_ANSWERING_AGENT, SUBLOOP_RESERVED_INITIALIZE_QUESTION_ANSWERING_AGENT_INSTANCE);
        subloop_reserved_initialize_question_answering_agent_class(QUESTION_ANSWERING_AGENT);
        classes.subloop_new_class(SME_LEXIFICATION_STATE, OBJECT, NIL, NIL, $list93);
        classes.class_set_implements_slot_listeners(SME_LEXIFICATION_STATE, NIL);
        classes.subloop_note_class_initialization_function(SME_LEXIFICATION_STATE, SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_STATE_CLASS);
        classes.subloop_note_instance_initialization_function(SME_LEXIFICATION_STATE, SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_STATE_INSTANCE);
        subloop_reserved_initialize_sme_lexification_state_class(SME_LEXIFICATION_STATE);
        classes.subloop_new_class(SME_LEXIFICATION_INTERLOCUTOR, OBJECT, NIL, NIL, $list102);
        classes.class_set_implements_slot_listeners(SME_LEXIFICATION_INTERLOCUTOR, NIL);
        classes.subloop_note_class_initialization_function(SME_LEXIFICATION_INTERLOCUTOR, SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_INTERLOCUTOR_CLASS);
        classes.subloop_note_instance_initialization_function(SME_LEXIFICATION_INTERLOCUTOR, $sym106$SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_INTERLOCUTOR_INSTANC);
        subloop_reserved_initialize_sme_lexification_interlocutor_class(SME_LEXIFICATION_INTERLOCUTOR);
        classes.subloop_new_class(SME_LI_PRE_GENERAL, SME_LEXIFICATION_INTERLOCUTOR, NIL, NIL, $list108);
        classes.class_set_implements_slot_listeners(SME_LI_PRE_GENERAL, NIL);
        classes.subloop_note_class_initialization_function(SME_LI_PRE_GENERAL, SUBLOOP_RESERVED_INITIALIZE_SME_LI_PRE_GENERAL_CLASS);
        classes.subloop_note_instance_initialization_function(SME_LI_PRE_GENERAL, SUBLOOP_RESERVED_INITIALIZE_SME_LI_PRE_GENERAL_INSTANCE);
        subloop_reserved_initialize_sme_li_pre_general_class(SME_LI_PRE_GENERAL);
        classes.subloop_new_class(SME_LI_PROPER_NAME, SME_LEXIFICATION_INTERLOCUTOR, NIL, NIL, $list112);
        classes.class_set_implements_slot_listeners(SME_LI_PROPER_NAME, NIL);
        classes.subloop_note_class_initialization_function(SME_LI_PROPER_NAME, SUBLOOP_RESERVED_INITIALIZE_SME_LI_PROPER_NAME_CLASS);
        classes.subloop_note_instance_initialization_function(SME_LI_PROPER_NAME, SUBLOOP_RESERVED_INITIALIZE_SME_LI_PROPER_NAME_INSTANCE);
        subloop_reserved_initialize_sme_li_proper_name_class(SME_LI_PROPER_NAME);
        classes.subloop_new_class(SME_LI_DENOTATIONAL, SME_LEXIFICATION_INTERLOCUTOR, NIL, NIL, $list116);
        classes.class_set_implements_slot_listeners(SME_LI_DENOTATIONAL, NIL);
        classes.subloop_note_class_initialization_function(SME_LI_DENOTATIONAL, SUBLOOP_RESERVED_INITIALIZE_SME_LI_DENOTATIONAL_CLASS);
        classes.subloop_note_instance_initialization_function(SME_LI_DENOTATIONAL, SUBLOOP_RESERVED_INITIALIZE_SME_LI_DENOTATIONAL_INSTANCE);
        subloop_reserved_initialize_sme_li_denotational_class(SME_LI_DENOTATIONAL);
        classes.subloop_new_class(SME_LI_RELATIONAL, SME_LEXIFICATION_INTERLOCUTOR, NIL, NIL, $list120);
        classes.class_set_implements_slot_listeners(SME_LI_RELATIONAL, NIL);
        classes.subloop_note_class_initialization_function(SME_LI_RELATIONAL, SUBLOOP_RESERVED_INITIALIZE_SME_LI_RELATIONAL_CLASS);
        classes.subloop_note_instance_initialization_function(SME_LI_RELATIONAL, SUBLOOP_RESERVED_INITIALIZE_SME_LI_RELATIONAL_INSTANCE);
        subloop_reserved_initialize_sme_li_relational_class(SME_LI_RELATIONAL);
        classes.subloop_new_class(SME_LI_POST_GENERAL, SME_LEXIFICATION_INTERLOCUTOR, NIL, NIL, $list124);
        classes.class_set_implements_slot_listeners(SME_LI_POST_GENERAL, NIL);
        classes.subloop_note_class_initialization_function(SME_LI_POST_GENERAL, SUBLOOP_RESERVED_INITIALIZE_SME_LI_POST_GENERAL_CLASS);
        classes.subloop_note_instance_initialization_function(SME_LI_POST_GENERAL, SUBLOOP_RESERVED_INITIALIZE_SME_LI_POST_GENERAL_INSTANCE);
        subloop_reserved_initialize_sme_li_post_general_class(SME_LI_POST_GENERAL);
        classes.subloop_new_class(SME_LEXIFICATION_WIZARD, OBJECT, NIL, NIL, $list128);
        classes.class_set_implements_slot_listeners(SME_LEXIFICATION_WIZARD, NIL);
        classes.subloop_note_class_initialization_function(SME_LEXIFICATION_WIZARD, SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_WIZARD_CLASS);
        classes.subloop_note_instance_initialization_function(SME_LEXIFICATION_WIZARD, SUBLOOP_RESERVED_INITIALIZE_SME_LEXIFICATION_WIZARD_INSTANCE);
        subloop_reserved_initialize_sme_lexification_wizard_class(SME_LEXIFICATION_WIZARD);
        methods.methods_incorporate_instance_method(INITIALIZE, QUESTION_ANSWERING_AGENT, $list135, NIL, $list136);
        methods.subloop_register_instance_method(QUESTION_ANSWERING_AGENT, INITIALIZE, QUESTION_ANSWERING_AGENT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_QUESTION, QUESTION_ANSWERING_AGENT, $list140, $list141, $list142);
        methods.subloop_register_instance_method(QUESTION_ANSWERING_AGENT, SET_QUESTION, QUESTION_ANSWERING_AGENT_SET_QUESTION_METHOD);
        methods.methods_incorporate_instance_method(DISPLAY_QUESTION, QUESTION_ANSWERING_AGENT, $list140, NIL, $list148);
        methods.subloop_register_instance_method(QUESTION_ANSWERING_AGENT, DISPLAY_QUESTION, QUESTION_ANSWERING_AGENT_DISPLAY_QUESTION_METHOD);
        methods.methods_incorporate_instance_method(GET_RESPONSE, QUESTION_ANSWERING_AGENT, $list140, NIL, $list153);
        methods.subloop_register_instance_method(QUESTION_ANSWERING_AGENT, GET_RESPONSE, QUESTION_ANSWERING_AGENT_GET_RESPONSE_METHOD);
        methods.methods_incorporate_instance_method(VALIDATE_RESPONSE, QUESTION_ANSWERING_AGENT, $list157, NIL, $list158);
        methods.subloop_register_instance_method(QUESTION_ANSWERING_AGENT, VALIDATE_RESPONSE, QUESTION_ANSWERING_AGENT_VALIDATE_RESPONSE_METHOD);
        methods.methods_incorporate_instance_method(SET_CALLBACK_FUNCTION, QUESTION_ANSWERING_AGENT, $list140, $list173, $list174);
        methods.subloop_register_instance_method(QUESTION_ANSWERING_AGENT, SET_CALLBACK_FUNCTION, QUESTION_ANSWERING_AGENT_SET_CALLBACK_FUNCTION_METHOD);
        methods.methods_incorporate_instance_method(SET_CLIENT_DATA, QUESTION_ANSWERING_AGENT, $list140, $list178, $list179);
        methods.subloop_register_instance_method(QUESTION_ANSWERING_AGENT, SET_CLIENT_DATA, QUESTION_ANSWERING_AGENT_SET_CLIENT_DATA_METHOD);
        methods.methods_incorporate_instance_method(SET_USER_DATA, QUESTION_ANSWERING_AGENT, $list140, $list183, $list184);
        methods.subloop_register_instance_method(QUESTION_ANSWERING_AGENT, SET_USER_DATA, QUESTION_ANSWERING_AGENT_SET_USER_DATA_METHOD);
        methods.methods_incorporate_instance_method(SET_PROXY, QUESTION_ANSWERING_AGENT, $list140, $list188, $list189);
        methods.subloop_register_instance_method(QUESTION_ANSWERING_AGENT, SET_PROXY, QUESTION_ANSWERING_AGENT_SET_PROXY_METHOD);
        methods.methods_incorporate_instance_method(NOTIFY_CLIENT, QUESTION_ANSWERING_AGENT, $list135, $list192, $list193);
        methods.subloop_register_instance_method(QUESTION_ANSWERING_AGENT, NOTIFY_CLIENT, QUESTION_ANSWERING_AGENT_NOTIFY_CLIENT_METHOD);
        methods.methods_incorporate_instance_method(POSITIVE_CHOICE, QUESTION_ANSWERING_AGENT, $list135, NIL, $list198);
        methods.subloop_register_instance_method(QUESTION_ANSWERING_AGENT, POSITIVE_CHOICE, QUESTION_ANSWERING_AGENT_POSITIVE_CHOICE_METHOD);
        methods.methods_incorporate_instance_method(NEGATIVE_CHOICE, QUESTION_ANSWERING_AGENT, $list135, NIL, $list202);
        methods.subloop_register_instance_method(QUESTION_ANSWERING_AGENT, NEGATIVE_CHOICE, QUESTION_ANSWERING_AGENT_NEGATIVE_CHOICE_METHOD);
        methods.methods_incorporate_instance_method(COPY, QUESTION_ANSWERING_AGENT, $list135, $list206, $list207);
        methods.subloop_register_instance_method(QUESTION_ANSWERING_AGENT, COPY, QUESTION_ANSWERING_AGENT_COPY_METHOD);
        methods.methods_incorporate_class_method(NEW_COPY, QUESTION_ANSWERING_AGENT, $list135, $list206, $list211);
        methods.subloop_register_class_method(QUESTION_ANSWERING_AGENT, NEW_COPY, QUESTION_ANSWERING_AGENT_NEW_COPY_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, INTERFACE_PROXY, $list135, NIL, $list214);
        methods.subloop_register_instance_method(INTERFACE_PROXY, INITIALIZE, INTERFACE_PROXY_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(INIT_SESSION, INTERFACE_PROXY, $list135, NIL, $list217);
        methods.subloop_register_instance_method(INTERFACE_PROXY, INIT_SESSION, INTERFACE_PROXY_INIT_SESSION_METHOD);
        methods.methods_incorporate_instance_method(END_SESSION, INTERFACE_PROXY, $list135, NIL, $list220);
        methods.subloop_register_instance_method(INTERFACE_PROXY, END_SESSION, INTERFACE_PROXY_END_SESSION_METHOD);
        methods.methods_incorporate_instance_method(CREATE_CONSTANT, INTERFACE_PROXY, $list135, $list223, $list224);
        methods.subloop_register_instance_method(INTERFACE_PROXY, CREATE_CONSTANT, INTERFACE_PROXY_CREATE_CONSTANT_METHOD);
        methods.methods_incorporate_instance_method(DESCRIBE_TERM, INTERFACE_PROXY, $list135, $list227, $list228);
        methods.subloop_register_instance_method(INTERFACE_PROXY, DESCRIBE_TERM, INTERFACE_PROXY_DESCRIBE_TERM_METHOD);
        methods.methods_incorporate_instance_method(RESOLVE_TERM, INTERFACE_PROXY, $list135, $list231, $list232);
        methods.subloop_register_instance_method(INTERFACE_PROXY, RESOLVE_TERM, INTERFACE_PROXY_RESOLVE_TERM_METHOD);
        methods.methods_incorporate_instance_method(MUMBLE, INTERFACE_PROXY, $list140, $list237, $list238);
        methods.subloop_register_instance_method(INTERFACE_PROXY, MUMBLE, INTERFACE_PROXY_MUMBLE_METHOD);
        methods.methods_incorporate_instance_method($sym241$FORGE_AHEAD_, INTERFACE_PROXY, $list140, NIL, $list242);
        methods.subloop_register_instance_method(INTERFACE_PROXY, $sym241$FORGE_AHEAD_, $sym243$INTERFACE_PROXY_FORGE_AHEAD__METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, SME_LEXIFICATION_STATE, $list135, NIL, $list244);
        methods.subloop_register_instance_method(SME_LEXIFICATION_STATE, INITIALIZE, SME_LEXIFICATION_STATE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(COPY, SME_LEXIFICATION_STATE, $list135, $list206, $list247);
        methods.subloop_register_instance_method(SME_LEXIFICATION_STATE, COPY, SME_LEXIFICATION_STATE_COPY_METHOD);
        methods.methods_incorporate_instance_method(GET_ID, SME_LEXIFICATION_STATE, $list135, NIL, $list251);
        methods.subloop_register_instance_method(SME_LEXIFICATION_STATE, GET_ID, SME_LEXIFICATION_STATE_GET_ID_METHOD);
        methods.methods_incorporate_instance_method(SET_STATES, SME_LEXIFICATION_STATE, $list135, $list255, $list256);
        methods.subloop_register_instance_method(SME_LEXIFICATION_STATE, SET_STATES, SME_LEXIFICATION_STATE_SET_STATES_METHOD);
        methods.methods_incorporate_instance_method(GET_STATES, SME_LEXIFICATION_STATE, $list135, NIL, $list260);
        methods.subloop_register_instance_method(SME_LEXIFICATION_STATE, GET_STATES, SME_LEXIFICATION_STATE_GET_STATES_METHOD);
        methods.methods_incorporate_instance_method(CURRENT_STATE, SME_LEXIFICATION_STATE, $list135, NIL, $list264);
        methods.subloop_register_instance_method(SME_LEXIFICATION_STATE, CURRENT_STATE, SME_LEXIFICATION_STATE_CURRENT_STATE_METHOD);
        methods.methods_incorporate_instance_method(CURRENT_SETTINGS, SME_LEXIFICATION_STATE, $list135, NIL, $list268);
        methods.subloop_register_instance_method(SME_LEXIFICATION_STATE, CURRENT_SETTINGS, SME_LEXIFICATION_STATE_CURRENT_SETTINGS_METHOD);
        methods.methods_incorporate_instance_method(ADVANCE, SME_LEXIFICATION_STATE, $list135, NIL, $list272);
        methods.subloop_register_instance_method(SME_LEXIFICATION_STATE, ADVANCE, SME_LEXIFICATION_STATE_ADVANCE_METHOD);
        methods.methods_incorporate_class_method(NEW_COPY, SME_LEXIFICATION_STATE, $list135, $list206, $list275);
        methods.subloop_register_class_method(SME_LEXIFICATION_STATE, NEW_COPY, SME_LEXIFICATION_STATE_NEW_COPY_METHOD);
        methods.methods_incorporate_instance_method(LIST_VALUES, SME_LEXIFICATION_STATE, $list135, NIL, $list278);
        methods.subloop_register_instance_method(SME_LEXIFICATION_STATE, LIST_VALUES, SME_LEXIFICATION_STATE_LIST_VALUES_METHOD);
        methods.methods_incorporate_instance_method(TRACE_VALUES, SME_LEXIFICATION_STATE, $list135, $list282, $list283);
        methods.subloop_register_instance_method(SME_LEXIFICATION_STATE, TRACE_VALUES, SME_LEXIFICATION_STATE_TRACE_VALUES_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, SME_LEXIFICATION_INTERLOCUTOR, $list288, NIL, $list289);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, INITIALIZE, SME_LEXIFICATION_INTERLOCUTOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method($sym291$DONE_, SME_LEXIFICATION_INTERLOCUTOR, $list140, NIL, $list292);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, $sym291$DONE_, $sym294$SME_LEXIFICATION_INTERLOCUTOR_DONE__METHOD);
        methods.methods_incorporate_instance_method(INITIATE_INTERACTION, SME_LEXIFICATION_INTERLOCUTOR, $list157, $list296, $list297);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, INITIATE_INTERACTION, SME_LEXIFICATION_INTERLOCUTOR_INITIATE_INTERACTION_METHOD);
        methods.methods_incorporate_instance_method(UPDATE_NOTIFICATION_INFO, SME_LEXIFICATION_INTERLOCUTOR, $list157, NIL, $list303);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, UPDATE_NOTIFICATION_INFO, SME_LEXIFICATION_INTERLOCUTOR_UPDATE_NOTIFICATION_INFO_METHOD);
        methods.methods_incorporate_instance_method(NEXT_INTERACTION, SME_LEXIFICATION_INTERLOCUTOR, $list157, NIL, $list306);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, NEXT_INTERACTION, SME_LEXIFICATION_INTERLOCUTOR_NEXT_INTERACTION_METHOD);
        methods.methods_incorporate_instance_method(END_INTERACTION, SME_LEXIFICATION_INTERLOCUTOR, $list140, NIL, $list313);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, END_INTERACTION, SME_LEXIFICATION_INTERLOCUTOR_END_INTERACTION_METHOD);
        methods.methods_incorporate_instance_method(RESET_STATE, SME_LEXIFICATION_INTERLOCUTOR, $list157, $list317, $list318);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, RESET_STATE, SME_LEXIFICATION_INTERLOCUTOR_RESET_STATE_METHOD);
        methods.methods_incorporate_instance_method(PROCESS_STATUS_UPDATE, SME_LEXIFICATION_INTERLOCUTOR, $list157, $list326, $list327);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, PROCESS_STATUS_UPDATE, SME_LEXIFICATION_INTERLOCUTOR_PROCESS_STATUS_UPDATE_METHOD);
        methods.methods_incorporate_instance_method(ASK_GENERIC_BOOLEAN, SME_LEXIFICATION_INTERLOCUTOR, $list140, $list335, $list336);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, ASK_GENERIC_BOOLEAN, SME_LEXIFICATION_INTERLOCUTOR_ASK_GENERIC_BOOLEAN_METHOD);
        methods.methods_incorporate_instance_method(ASK_GENERIC_ENUMERATED, SME_LEXIFICATION_INTERLOCUTOR, $list140, $list339, $list340);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, ASK_GENERIC_ENUMERATED, SME_LEXIFICATION_INTERLOCUTOR_ASK_GENERIC_ENUMERATED_METHOD);
        methods.methods_incorporate_instance_method(ASK_GENERIC_MULTIPLE_SELECTION, SME_LEXIFICATION_INTERLOCUTOR, $list140, $list343, $list344);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, ASK_GENERIC_MULTIPLE_SELECTION, $sym345$SME_LEXIFICATION_INTERLOCUTOR_ASK_GENERIC_MULTIPLE_SELECTION_METH);
        methods.methods_incorporate_instance_method(ASK_GENERIC_FREE_FORM, SME_LEXIFICATION_INTERLOCUTOR, $list140, $list347, $list348);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, ASK_GENERIC_FREE_FORM, SME_LEXIFICATION_INTERLOCUTOR_ASK_GENERIC_FREE_FORM_METHOD);
        methods.methods_incorporate_instance_method(ASK_GENERIC_MULTIPLE_FREE_FORM, SME_LEXIFICATION_INTERLOCUTOR, $list140, $list351, $list352);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, ASK_GENERIC_MULTIPLE_FREE_FORM, $sym353$SME_LEXIFICATION_INTERLOCUTOR_ASK_GENERIC_MULTIPLE_FREE_FORM_METH);
        methods.methods_incorporate_instance_method(DISPLAY_QUESTION, SME_LEXIFICATION_INTERLOCUTOR, $list140, NIL, $list354);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, DISPLAY_QUESTION, SME_LEXIFICATION_INTERLOCUTOR_DISPLAY_QUESTION_METHOD);
        methods.methods_incorporate_instance_method(GET_ANSWER, SME_LEXIFICATION_INTERLOCUTOR, $list140, NIL, $list358);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, GET_ANSWER, SME_LEXIFICATION_INTERLOCUTOR_GET_ANSWER_METHOD);
        methods.methods_incorporate_instance_method(SET_ANSWER, SME_LEXIFICATION_INTERLOCUTOR, $list140, $list361, $list362);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, SET_ANSWER, SME_LEXIFICATION_INTERLOCUTOR_SET_ANSWER_METHOD);
        methods.methods_incorporate_instance_method(GET_INTERLOCUTOR_AGENT, SME_LEXIFICATION_INTERLOCUTOR, $list140, NIL, $list365);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, GET_INTERLOCUTOR_AGENT, SME_LEXIFICATION_INTERLOCUTOR_GET_INTERLOCUTOR_AGENT_METHOD);
        methods.methods_incorporate_instance_method(SET_INTERLOCUTOR_AGENT, SME_LEXIFICATION_INTERLOCUTOR, $list135, $list370, $list371);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, SET_INTERLOCUTOR_AGENT, SME_LEXIFICATION_INTERLOCUTOR_SET_INTERLOCUTOR_AGENT_METHOD);
        methods.methods_incorporate_instance_method(SET_DEFAULT, SME_LEXIFICATION_INTERLOCUTOR, $list135, $list375, $list376);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, SET_DEFAULT, SME_LEXIFICATION_INTERLOCUTOR_SET_DEFAULT_METHOD);
        methods.methods_incorporate_instance_method(CHECK_GENERIC, SME_LEXIFICATION_INTERLOCUTOR, $list157, $list379, $list380);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, CHECK_GENERIC, SME_LEXIFICATION_INTERLOCUTOR_CHECK_GENERIC_METHOD);
        methods.methods_incorporate_instance_method(SET_CALLBACK_FUNCTION, SME_LEXIFICATION_INTERLOCUTOR, $list140, $list173, $list174);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, SET_CALLBACK_FUNCTION, SME_LEXIFICATION_INTERLOCUTOR_SET_CALLBACK_FUNCTION_METHOD);
        methods.methods_incorporate_instance_method(SET_PROXY, SME_LEXIFICATION_INTERLOCUTOR, $list140, $list188, $list189);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, SET_PROXY, SME_LEXIFICATION_INTERLOCUTOR_SET_PROXY_METHOD);
        methods.methods_incorporate_instance_method(NOTIFY_CLIENT, SME_LEXIFICATION_INTERLOCUTOR, $list140, $list192, $list388);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, NOTIFY_CLIENT, SME_LEXIFICATION_INTERLOCUTOR_NOTIFY_CLIENT_METHOD);
        methods.methods_incorporate_instance_method(MUMBLE, SME_LEXIFICATION_INTERLOCUTOR, $list140, $list237, $list391);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, MUMBLE, SME_LEXIFICATION_INTERLOCUTOR_MUMBLE_METHOD);
        methods.methods_incorporate_instance_method($sym241$FORGE_AHEAD_, SME_LEXIFICATION_INTERLOCUTOR, $list140, NIL, $list394);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, $sym241$FORGE_AHEAD_, $sym396$SME_LEXIFICATION_INTERLOCUTOR_FORGE_AHEAD__METHOD);
        methods.methods_incorporate_instance_method(PHRASE_DENOTATIONS, SME_LEXIFICATION_INTERLOCUTOR, $list140, $list398, $list399);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, PHRASE_DENOTATIONS, SME_LEXIFICATION_INTERLOCUTOR_PHRASE_DENOTATIONS_METHOD);
        methods.methods_incorporate_instance_method(DESCRIBE_TERM, SME_LEXIFICATION_INTERLOCUTOR, $list140, $list227, $list402);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, DESCRIBE_TERM, SME_LEXIFICATION_INTERLOCUTOR_DESCRIBE_TERM_METHOD);
        methods.methods_incorporate_instance_method(UPDATE_LEXIFICATION_PARAMETERS, SME_LEXIFICATION_INTERLOCUTOR, $list288, NIL, $list406);
        methods.subloop_register_instance_method(SME_LEXIFICATION_INTERLOCUTOR, UPDATE_LEXIFICATION_PARAMETERS, $sym407$SME_LEXIFICATION_INTERLOCUTOR_UPDATE_LEXIFICATION_PARAMETERS_METH);
        methods.methods_incorporate_instance_method(INITIALIZE, SME_LI_PRE_GENERAL, $list288, NIL, $list408);
        methods.subloop_register_instance_method(SME_LI_PRE_GENERAL, INITIALIZE, SME_LI_PRE_GENERAL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(DO_INITIALIZATION, SME_LI_PRE_GENERAL, $list140, NIL, $list412);
        methods.subloop_register_instance_method(SME_LI_PRE_GENERAL, DO_INITIALIZATION, SME_LI_PRE_GENERAL_DO_INITIALIZATION_METHOD);
        methods.methods_incorporate_instance_method(CHECK_INITIALIZATION, SME_LI_PRE_GENERAL, $list157, NIL, $list418);
        methods.subloop_register_instance_method(SME_LI_PRE_GENERAL, CHECK_INITIALIZATION, SME_LI_PRE_GENERAL_CHECK_INITIALIZATION_METHOD);
        methods.methods_incorporate_instance_method(ASK_TERM, SME_LI_PRE_GENERAL, $list140, NIL, $list421);
        methods.subloop_register_instance_method(SME_LI_PRE_GENERAL, ASK_TERM, SME_LI_PRE_GENERAL_ASK_TERM_METHOD);
        methods.methods_incorporate_instance_method(CHECK_TERM, SME_LI_PRE_GENERAL, $list140, NIL, $list429);
        methods.subloop_register_instance_method(SME_LI_PRE_GENERAL, CHECK_TERM, SME_LI_PRE_GENERAL_CHECK_TERM_METHOD);
        methods.methods_incorporate_instance_method(RESOLVE_TERM, SME_LI_PRE_GENERAL, $list140, $list231, $list434);
        methods.subloop_register_instance_method(SME_LI_PRE_GENERAL, RESOLVE_TERM, SME_LI_PRE_GENERAL_RESOLVE_TERM_METHOD);
        methods.methods_incorporate_instance_method(ASK_TERM_SELECTION, SME_LI_PRE_GENERAL, $list140, NIL, $list438);
        methods.subloop_register_instance_method(SME_LI_PRE_GENERAL, ASK_TERM_SELECTION, SME_LI_PRE_GENERAL_ASK_TERM_SELECTION_METHOD);
        methods.methods_incorporate_instance_method(CHECK_TERM_SELECTION, SME_LI_PRE_GENERAL, $list140, NIL, $list447);
        methods.subloop_register_instance_method(SME_LI_PRE_GENERAL, CHECK_TERM_SELECTION, SME_LI_PRE_GENERAL_CHECK_TERM_SELECTION_METHOD);
        methods.methods_incorporate_instance_method(ASK_PHRASE, SME_LI_PRE_GENERAL, $list140, NIL, $list452);
        methods.subloop_register_instance_method(SME_LI_PRE_GENERAL, ASK_PHRASE, SME_LI_PRE_GENERAL_ASK_PHRASE_METHOD);
        methods.methods_incorporate_instance_method(CHECK_PHRASE, SME_LI_PRE_GENERAL, $list140, NIL, $list460);
        methods.subloop_register_instance_method(SME_LI_PRE_GENERAL, CHECK_PHRASE, SME_LI_PRE_GENERAL_CHECK_PHRASE_METHOD);
        methods.methods_incorporate_instance_method(ASK_AMBIGUITY, SME_LI_PRE_GENERAL, $list140, NIL, $list466);
        methods.subloop_register_instance_method(SME_LI_PRE_GENERAL, ASK_AMBIGUITY, SME_LI_PRE_GENERAL_ASK_AMBIGUITY_METHOD);
        methods.methods_incorporate_instance_method(CHECK_AMBIGUITY, SME_LI_PRE_GENERAL, $list140, NIL, $list472);
        methods.subloop_register_instance_method(SME_LI_PRE_GENERAL, CHECK_AMBIGUITY, SME_LI_PRE_GENERAL_CHECK_AMBIGUITY_METHOD);
        methods.methods_incorporate_instance_method(ASK_PROPER_NAME_STATUS, SME_LI_PRE_GENERAL, $list140, NIL, $list477);
        methods.subloop_register_instance_method(SME_LI_PRE_GENERAL, ASK_PROPER_NAME_STATUS, SME_LI_PRE_GENERAL_ASK_PROPER_NAME_STATUS_METHOD);
        methods.methods_incorporate_instance_method(CHECK_PROPER_NAME_STATUS, SME_LI_PRE_GENERAL, $list157, NIL, $list487);
        methods.subloop_register_instance_method(SME_LI_PRE_GENERAL, CHECK_PROPER_NAME_STATUS, SME_LI_PRE_GENERAL_CHECK_PROPER_NAME_STATUS_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, SME_LI_PROPER_NAME, $list288, NIL, $list489);
        methods.subloop_register_instance_method(SME_LI_PROPER_NAME, INITIALIZE, SME_LI_PROPER_NAME_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ASK_ABBREVIATION_STATUS, SME_LI_PROPER_NAME, $list140, NIL, $list493);
        methods.subloop_register_instance_method(SME_LI_PROPER_NAME, ASK_ABBREVIATION_STATUS, SME_LI_PROPER_NAME_ASK_ABBREVIATION_STATUS_METHOD);
        methods.methods_incorporate_instance_method(CHECK_ABBREVIATION_STATUS, SME_LI_PROPER_NAME, $list140, NIL, $list503);
        methods.subloop_register_instance_method(SME_LI_PROPER_NAME, CHECK_ABBREVIATION_STATUS, SME_LI_PROPER_NAME_CHECK_ABBREVIATION_STATUS_METHOD);
        methods.methods_incorporate_instance_method(ASK_PREDICATE_TYPE, SME_LI_PROPER_NAME, $list140, NIL, $list507);
        methods.subloop_register_instance_method(SME_LI_PROPER_NAME, ASK_PREDICATE_TYPE, SME_LI_PROPER_NAME_ASK_PREDICATE_TYPE_METHOD);
        methods.methods_incorporate_instance_method(CHECK_PREDICATE_TYPE, SME_LI_PROPER_NAME, $list140, NIL, $list517);
        methods.subloop_register_instance_method(SME_LI_PROPER_NAME, CHECK_PREDICATE_TYPE, SME_LI_PROPER_NAME_CHECK_PREDICATE_TYPE_METHOD);
        methods.methods_incorporate_instance_method(ASK_REFINED_PREDICATION, SME_LI_PROPER_NAME, $list140, NIL, $list522);
        methods.subloop_register_instance_method(SME_LI_PROPER_NAME, ASK_REFINED_PREDICATION, SME_LI_PROPER_NAME_ASK_REFINED_PREDICATION_METHOD);
        methods.methods_incorporate_instance_method(CHECK_REFINED_PREDICATION, SME_LI_PROPER_NAME, $list140, NIL, $list534);
        methods.subloop_register_instance_method(SME_LI_PROPER_NAME, CHECK_REFINED_PREDICATION, SME_LI_PROPER_NAME_CHECK_REFINED_PREDICATION_METHOD);
        methods.methods_incorporate_instance_method(INFER_PROPER_NAME_SUB_PREDICATIONS, SME_LI_PROPER_NAME, $list140, $list538, $list539);
        methods.subloop_register_instance_method(SME_LI_PROPER_NAME, INFER_PROPER_NAME_SUB_PREDICATIONS, SME_LI_PROPER_NAME_INFER_PROPER_NAME_SUB_PREDICATIONS_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, SME_LI_DENOTATIONAL, $list288, NIL, $list557);
        methods.subloop_register_instance_method(SME_LI_DENOTATIONAL, INITIALIZE, SME_LI_DENOTATIONAL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GUESS_HEADWORD_POSITION, SME_LI_DENOTATIONAL, $list140, NIL, $list561);
        methods.subloop_register_instance_method(SME_LI_DENOTATIONAL, GUESS_HEADWORD_POSITION, SME_LI_DENOTATIONAL_GUESS_HEADWORD_POSITION_METHOD);
        methods.methods_incorporate_instance_method(CHECK_GUESSED_HEADWORD_POSITION, SME_LI_DENOTATIONAL, $list157, NIL, $list570);
        methods.subloop_register_instance_method(SME_LI_DENOTATIONAL, CHECK_GUESSED_HEADWORD_POSITION, SME_LI_DENOTATIONAL_CHECK_GUESSED_HEADWORD_POSITION_METHOD);
        methods.methods_incorporate_instance_method(ASK_HEADWORD_POSITION, SME_LI_DENOTATIONAL, $list140, NIL, $list573);
        methods.subloop_register_instance_method(SME_LI_DENOTATIONAL, ASK_HEADWORD_POSITION, SME_LI_DENOTATIONAL_ASK_HEADWORD_POSITION_METHOD);
        methods.methods_incorporate_instance_method(CHECK_HEADWORD_POSITION, SME_LI_DENOTATIONAL, $list157, NIL, $list580);
        methods.subloop_register_instance_method(SME_LI_DENOTATIONAL, CHECK_HEADWORD_POSITION, SME_LI_DENOTATIONAL_CHECK_HEADWORD_POSITION_METHOD);
        methods.methods_incorporate_instance_method(ASK_PART_OF_SPEECH, SME_LI_DENOTATIONAL, $list140, NIL, $list586);
        methods.subloop_register_instance_method(SME_LI_DENOTATIONAL, ASK_PART_OF_SPEECH, SME_LI_DENOTATIONAL_ASK_PART_OF_SPEECH_METHOD);
        methods.methods_incorporate_instance_method(CHECK_PART_OF_SPEECH, SME_LI_DENOTATIONAL, $list140, NIL, $list594);
        methods.subloop_register_instance_method(SME_LI_DENOTATIONAL, CHECK_PART_OF_SPEECH, SME_LI_DENOTATIONAL_CHECK_PART_OF_SPEECH_METHOD);
        methods.methods_incorporate_instance_method(SHOW_HEADWORD_VARIATIONS, SME_LI_DENOTATIONAL, $list140, NIL, $list601);
        methods.subloop_register_instance_method(SME_LI_DENOTATIONAL, SHOW_HEADWORD_VARIATIONS, SME_LI_DENOTATIONAL_SHOW_HEADWORD_VARIATIONS_METHOD);
        methods.methods_incorporate_instance_method(CHECK_HEADWORD_VARIATIONS, SME_LI_DENOTATIONAL, $list157, NIL, $list610);
        methods.subloop_register_instance_method(SME_LI_DENOTATIONAL, CHECK_HEADWORD_VARIATIONS, SME_LI_DENOTATIONAL_CHECK_HEADWORD_VARIATIONS_METHOD);
        methods.methods_incorporate_instance_method(ADD_LEXICAL_MAPPING, SME_LI_DENOTATIONAL, $list157, $list614, $list615);
        methods.subloop_register_instance_method(SME_LI_DENOTATIONAL, ADD_LEXICAL_MAPPING, SME_LI_DENOTATIONAL_ADD_LEXICAL_MAPPING_METHOD);
        methods.methods_incorporate_instance_method(REMOVE_LEXICAL_MAPPING, SME_LI_DENOTATIONAL, $list157, $list614, $list620);
        methods.subloop_register_instance_method(SME_LI_DENOTATIONAL, REMOVE_LEXICAL_MAPPING, SME_LI_DENOTATIONAL_REMOVE_LEXICAL_MAPPING_METHOD);
        methods.methods_incorporate_instance_method(DO_LEXICAL_MAPPING, SME_LI_DENOTATIONAL, $list157, $list623, $list624);
        methods.subloop_register_instance_method(SME_LI_DENOTATIONAL, DO_LEXICAL_MAPPING, SME_LI_DENOTATIONAL_DO_LEXICAL_MAPPING_METHOD);
        methods.methods_incorporate_instance_method(DERIVE_PART_OF_SPEECH_EXAMPLES, SME_LI_DENOTATIONAL, $list140, $list627, $list628);
        methods.subloop_register_instance_method(SME_LI_DENOTATIONAL, DERIVE_PART_OF_SPEECH_EXAMPLES, SME_LI_DENOTATIONAL_DERIVE_PART_OF_SPEECH_EXAMPLES_METHOD);
        methods.methods_incorporate_instance_method(DERIVE_PART_OF_SPEECH_EXAMPLE, SME_LI_DENOTATIONAL, $list140, $list631, $list632);
        methods.subloop_register_instance_method(SME_LI_DENOTATIONAL, DERIVE_PART_OF_SPEECH_EXAMPLE, SME_LI_DENOTATIONAL_DERIVE_PART_OF_SPEECH_EXAMPLE_METHOD);
        methods.methods_incorporate_instance_method(DISABLE_SPEECH_PART_SELECTION, SME_LI_DENOTATIONAL, $list140, $list659, $list660);
        methods.subloop_register_instance_method(SME_LI_DENOTATIONAL, DISABLE_SPEECH_PART_SELECTION, SME_LI_DENOTATIONAL_DISABLE_SPEECH_PART_SELECTION_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, SME_LI_RELATIONAL, $list288, NIL, $list214);
        methods.subloop_register_instance_method(SME_LI_RELATIONAL, INITIALIZE, SME_LI_RELATIONAL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(INITIATE_INTERACTION, SME_LI_RELATIONAL, $list157, $list671, $list672);
        methods.subloop_register_instance_method(SME_LI_RELATIONAL, INITIATE_INTERACTION, SME_LI_RELATIONAL_INITIATE_INTERACTION_METHOD);
        methods.methods_incorporate_instance_method(ASK_SAMPLE_SENTENCE, SME_LI_RELATIONAL, $list140, NIL, $list680);
        methods.subloop_register_instance_method(SME_LI_RELATIONAL, ASK_SAMPLE_SENTENCE, SME_LI_RELATIONAL_ASK_SAMPLE_SENTENCE_METHOD);
        methods.methods_incorporate_instance_method(CHECK_SAMPLE_SENTENCE, SME_LI_RELATIONAL, $list140, NIL, $list688);
        methods.subloop_register_instance_method(SME_LI_RELATIONAL, CHECK_SAMPLE_SENTENCE, SME_LI_RELATIONAL_CHECK_SAMPLE_SENTENCE_METHOD);
        methods.methods_incorporate_instance_method(ASK_ARGUMENT_VALUES, SME_LI_RELATIONAL, $list140, NIL, $list692);
        methods.subloop_register_instance_method(SME_LI_RELATIONAL, ASK_ARGUMENT_VALUES, SME_LI_RELATIONAL_ASK_ARGUMENT_VALUES_METHOD);
        methods.methods_incorporate_instance_method(CHECK_ARGUMENT_VALUES, SME_LI_RELATIONAL, $list140, NIL, $list698);
        methods.subloop_register_instance_method(SME_LI_RELATIONAL, CHECK_ARGUMENT_VALUES, SME_LI_RELATIONAL_CHECK_ARGUMENT_VALUES_METHOD);
        methods.methods_incorporate_instance_method(ASK_ARGUMENT_PART_OF_SPEECH, SME_LI_RELATIONAL, $list140, NIL, $list703);
        methods.subloop_register_instance_method(SME_LI_RELATIONAL, ASK_ARGUMENT_PART_OF_SPEECH, SME_LI_RELATIONAL_ASK_ARGUMENT_PART_OF_SPEECH_METHOD);
        methods.methods_incorporate_instance_method(CHECK_ARGUMENT_PART_OF_SPEECH, SME_LI_RELATIONAL, $list140, NIL, $list710);
        methods.subloop_register_instance_method(SME_LI_RELATIONAL, CHECK_ARGUMENT_PART_OF_SPEECH, SME_LI_RELATIONAL_CHECK_ARGUMENT_PART_OF_SPEECH_METHOD);
        methods.methods_incorporate_instance_method(DERIVE_RELATIONAL_TEMPLATES, SME_LI_RELATIONAL, $list140, NIL, $list715);
        methods.subloop_register_instance_method(SME_LI_RELATIONAL, DERIVE_RELATIONAL_TEMPLATES, SME_LI_RELATIONAL_DERIVE_RELATIONAL_TEMPLATES_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, SME_LI_POST_GENERAL, $list288, NIL, $list719);
        methods.subloop_register_instance_method(SME_LI_POST_GENERAL, INITIALIZE, SME_LI_POST_GENERAL_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(ASK_PREFERRED_LEXIFICATION_STATUS, SME_LI_POST_GENERAL, $list140, NIL, $list723);
        methods.subloop_register_instance_method(SME_LI_POST_GENERAL, ASK_PREFERRED_LEXIFICATION_STATUS, SME_LI_POST_GENERAL_ASK_PREFERRED_LEXIFICATION_STATUS_METHOD);
        methods.methods_incorporate_instance_method(CHECK_PREFERRED_LEXIFICATION_STATUS, SME_LI_POST_GENERAL, $list157, NIL, $list731);
        methods.subloop_register_instance_method(SME_LI_POST_GENERAL, CHECK_PREFERRED_LEXIFICATION_STATUS, SME_LI_POST_GENERAL_CHECK_PREFERRED_LEXIFICATION_STATUS_METHOD);
        methods.methods_incorporate_instance_method(DO_LEXIFICATION, SME_LI_POST_GENERAL, $list140, NIL, $list734);
        methods.subloop_register_instance_method(SME_LI_POST_GENERAL, DO_LEXIFICATION, SME_LI_POST_GENERAL_DO_LEXIFICATION_METHOD);
        methods.methods_incorporate_instance_method(CHECK_LEXIFICATION, SME_LI_POST_GENERAL, $list140, NIL, $list743);
        methods.subloop_register_instance_method(SME_LI_POST_GENERAL, CHECK_LEXIFICATION, SME_LI_POST_GENERAL_CHECK_LEXIFICATION_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, SME_LEXIFICATION_WIZARD, $list288, NIL, $list747);
        methods.subloop_register_instance_method(SME_LEXIFICATION_WIZARD, INITIALIZE, SME_LEXIFICATION_WIZARD_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(COPY, SME_LEXIFICATION_WIZARD, $list135, $list206, $list753);
        methods.subloop_register_instance_method(SME_LEXIFICATION_WIZARD, COPY, SME_LEXIFICATION_WIZARD_COPY_METHOD);
        methods.methods_incorporate_class_method(NEW_COPY, SME_LEXIFICATION_WIZARD, $list135, $list206, $list756);
        methods.subloop_register_class_method(SME_LEXIFICATION_WIZARD, NEW_COPY, SME_LEXIFICATION_WIZARD_NEW_COPY_METHOD);
        methods.methods_incorporate_instance_method(SET_TERM, SME_LEXIFICATION_WIZARD, $list140, $list759, $list760);
        methods.subloop_register_instance_method(SME_LEXIFICATION_WIZARD, SET_TERM, SME_LEXIFICATION_WIZARD_SET_TERM_METHOD);
        methods.methods_incorporate_instance_method(GET_TERM, SME_LEXIFICATION_WIZARD, $list140, NIL, $list764);
        methods.subloop_register_instance_method(SME_LEXIFICATION_WIZARD, GET_TERM, SME_LEXIFICATION_WIZARD_GET_TERM_METHOD);
        methods.methods_incorporate_instance_method(SET_PHRASE, SME_LEXIFICATION_WIZARD, $list140, $list768, $list769);
        methods.subloop_register_instance_method(SME_LEXIFICATION_WIZARD, SET_PHRASE, SME_LEXIFICATION_WIZARD_SET_PHRASE_METHOD);
        methods.methods_incorporate_instance_method(GET_PHRASE, SME_LEXIFICATION_WIZARD, $list140, NIL, $list773);
        methods.subloop_register_instance_method(SME_LEXIFICATION_WIZARD, GET_PHRASE, SME_LEXIFICATION_WIZARD_GET_PHRASE_METHOD);
        methods.methods_incorporate_instance_method(SET_MT, SME_LEXIFICATION_WIZARD, $list140, $list777, $list778);
        methods.subloop_register_instance_method(SME_LEXIFICATION_WIZARD, SET_MT, SME_LEXIFICATION_WIZARD_SET_MT_METHOD);
        methods.methods_incorporate_instance_method(GET_MT, SME_LEXIFICATION_WIZARD, $list140, NIL, $list782);
        methods.subloop_register_instance_method(SME_LEXIFICATION_WIZARD, GET_MT, SME_LEXIFICATION_WIZARD_GET_MT_METHOD);
        methods.methods_incorporate_instance_method(SET_LEXICAL_MT, SME_LEXIFICATION_WIZARD, $list140, $list777, $list786);
        methods.subloop_register_instance_method(SME_LEXIFICATION_WIZARD, SET_LEXICAL_MT, SME_LEXIFICATION_WIZARD_SET_LEXICAL_MT_METHOD);
        methods.methods_incorporate_instance_method(SET_PARSING_MT, SME_LEXIFICATION_WIZARD, $list140, $list777, $list790);
        methods.subloop_register_instance_method(SME_LEXIFICATION_WIZARD, SET_PARSING_MT, SME_LEXIFICATION_WIZARD_SET_PARSING_MT_METHOD);
        methods.methods_incorporate_instance_method(SET_GENERATION_MT, SME_LEXIFICATION_WIZARD, $list140, $list777, $list794);
        methods.subloop_register_instance_method(SME_LEXIFICATION_WIZARD, SET_GENERATION_MT, SME_LEXIFICATION_WIZARD_SET_GENERATION_MT_METHOD);
        methods.methods_incorporate_instance_method(LEXIFY, SME_LEXIFICATION_WIZARD, $list288, $list798, $list799);
        methods.subloop_register_instance_method(SME_LEXIFICATION_WIZARD, LEXIFY, SME_LEXIFICATION_WIZARD_LEXIFY_METHOD);
        methods.methods_incorporate_instance_method(LEXIFY_FIRST_TERMSTRING, SME_LEXIFICATION_WIZARD, $list288, $list802, $list803);
        methods.subloop_register_instance_method(SME_LEXIFICATION_WIZARD, LEXIFY_FIRST_TERMSTRING, SME_LEXIFICATION_WIZARD_LEXIFY_FIRST_TERMSTRING_METHOD);
        methods.methods_incorporate_instance_method(CONTINUE_LEXIFY, SME_LEXIFICATION_WIZARD, $list288, NIL, $list806);
        methods.subloop_register_instance_method(SME_LEXIFICATION_WIZARD, CONTINUE_LEXIFY, SME_LEXIFICATION_WIZARD_CONTINUE_LEXIFY_METHOD);
        methods.methods_incorporate_instance_method(PROCESS_STATUS_UPDATE, SME_LEXIFICATION_WIZARD, $list288, $list812, $list813);
        methods.subloop_register_instance_method(SME_LEXIFICATION_WIZARD, PROCESS_STATUS_UPDATE, SME_LEXIFICATION_WIZARD_PROCESS_STATUS_UPDATE_METHOD);
        methods.methods_incorporate_instance_method(UPDATE_LEXIFICATION_PARAMETERS, SME_LEXIFICATION_WIZARD, $list288, NIL, $list818);
        methods.subloop_register_instance_method(SME_LEXIFICATION_WIZARD, UPDATE_LEXIFICATION_PARAMETERS, SME_LEXIFICATION_WIZARD_UPDATE_LEXIFICATION_PARAMETERS_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sme_lexification_wizard_file();
    }

    @Override
    public void initializeVariables() {
        init_sme_lexification_wizard_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sme_lexification_wizard_file();
    }

    static {



































































































































































































































































































































































































































































































































































































































































































































































































































































































    }

    public static final class $sme_lexification_settings_native extends SubLStructNative {
        public SubLObject $is_abbreviationP;

        public SubLObject $new_mappingP;

        public SubLObject $okP;

        public SubLObject $sample_sentence;

        public SubLObject $sentence_words;

        public SubLObject $sentence_args;

        public SubLObject $arg_offsets;

        public SubLObject $current_arg;

        public SubLObject $arg_speech_parts;

        public SubLObject $proper_sub_predicates;

        private static final SubLStructDeclNative structDecl;

        public $sme_lexification_settings_native() {
            this.$is_abbreviationP = Lisp.NIL;
            this.$new_mappingP = Lisp.NIL;
            this.$okP = Lisp.NIL;
            this.$sample_sentence = Lisp.NIL;
            this.$sentence_words = Lisp.NIL;
            this.$sentence_args = Lisp.NIL;
            this.$arg_offsets = Lisp.NIL;
            this.$current_arg = Lisp.NIL;
            this.$arg_speech_parts = Lisp.NIL;
            this.$proper_sub_predicates = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$is_abbreviationP;
        }

        @Override
        public SubLObject getField3() {
            return this.$new_mappingP;
        }

        @Override
        public SubLObject getField4() {
            return this.$okP;
        }

        @Override
        public SubLObject getField5() {
            return this.$sample_sentence;
        }

        @Override
        public SubLObject getField6() {
            return this.$sentence_words;
        }

        @Override
        public SubLObject getField7() {
            return this.$sentence_args;
        }

        @Override
        public SubLObject getField8() {
            return this.$arg_offsets;
        }

        @Override
        public SubLObject getField9() {
            return this.$current_arg;
        }

        @Override
        public SubLObject getField10() {
            return this.$arg_speech_parts;
        }

        @Override
        public SubLObject getField11() {
            return this.$proper_sub_predicates;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$is_abbreviationP = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$new_mappingP = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$okP = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$sample_sentence = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$sentence_words = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$sentence_args = value;
        }

        @Override
        public SubLObject setField8(final SubLObject value) {
            return this.$arg_offsets = value;
        }

        @Override
        public SubLObject setField9(final SubLObject value) {
            return this.$current_arg = value;
        }

        @Override
        public SubLObject setField10(final SubLObject value) {
            return this.$arg_speech_parts = value;
        }

        @Override
        public SubLObject setField11(final SubLObject value) {
            return this.$proper_sub_predicates = value;
        }

        static {
            structDecl = makeStructDeclNative(sme_lexification_wizard.$sme_lexification_settings_native.class, SME_LEXIFICATION_SETTINGS, SME_LEXIFICATION_SETTINGS_P, $list20, $list21, new String[]{ "$is_abbreviationP", "$new_mappingP", "$okP", "$sample_sentence", "$sentence_words", "$sentence_args", "$arg_offsets", "$current_arg", "$arg_speech_parts", "$proper_sub_predicates" }, $list22, $list23, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $sme_lexification_settings_p$UnaryFunction extends UnaryFunction {
        public $sme_lexification_settings_p$UnaryFunction() {
            super(extractFunctionNamed("SME-LEXIFICATION-SETTINGS-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sme_lexification_settings_p(arg1);
        }
    }
}

/**
 * Total time: 5606 ms
 */
